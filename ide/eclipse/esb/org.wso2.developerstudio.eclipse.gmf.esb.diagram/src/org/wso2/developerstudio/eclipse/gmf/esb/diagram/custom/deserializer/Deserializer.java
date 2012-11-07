/*
 * Copyright 2012 WSO2, Inc. (http://wso2.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.deserializer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.apache.synapse.config.SynapseConfiguration;
import org.apache.synapse.config.SynapseConfigurationBuilder;
import org.apache.synapse.mediators.AbstractMediator;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.impl.ConnectorImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbDiagram;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbElement;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbFactory;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbNode;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbServer;
import org.wso2.developerstudio.eclipse.gmf.esb.ProxyService;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.AbstractInputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.AbstractOutputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.ConnectionUtils;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.EditorUtils;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.EsbLinkEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.ProxyOutputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbDiagramEditor;

/**
 * Synapse model de-serialize base class
 */
public class Deserializer {
	/**
	 * Singleton instance.
	 */
	private static Deserializer singleton;
	
	private Deserializer(){
		
	}
	
	/**
	 * @return singleton instance.
	 */
	public static Deserializer getInstance() {
		if (null == singleton) {
			singleton = new Deserializer();
		}
		return singleton;
	}
	
	/**
	 * Update graphical model
	 * @param source
	 * @param graphicalEditor
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public void updateDesign(String source, EsbDiagramEditor graphicalEditor) throws Exception {
		Diagram diagram = graphicalEditor.getDiagram();
		EsbDiagram esbDiagram = (EsbDiagram) diagram.getElement();
		EsbServer esbServer = esbDiagram.getServer();
		CompoundCommand resultCommand = new CompoundCommand();
		File tempfile = File.createTempFile("file", ".tmp");
		BufferedWriter outfile = new BufferedWriter(new FileWriter(tempfile));
		outfile.write(source);
		outfile.close();
		SynapseConfiguration synapseCofig = SynapseConfigurationBuilder.getConfiguration(
				tempfile.getAbsolutePath(), null);
		TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(esbServer);
		// cleaning old diagram
		// TODO: should be replaced by better approach
		for (EsbElement child : esbServer.getChildren()) {
			if (child instanceof ProxyService) {
				RemoveCommand removeCmd = new RemoveCommand(domain, esbServer,
						EsbPackage.Literals.ESB_SERVER__CHILDREN, child);
				resultCommand.append(removeCmd);
			}
		}
		
		if (resultCommand.canExecute()) {
			domain.getCommandStack().execute(resultCommand);
		}

		resultCommand = new CompoundCommand();
		for (org.apache.synapse.core.axis2.ProxyService proxyService : synapseCofig
				.getProxyServices()) {
			LinkedList<EsbNode> mediatorList = new LinkedList<EsbNode>();
			ProxyService proxy = EsbFactory.eINSTANCE.createProxyService();
			proxy.setName(proxyService.getName());
			proxy.setTransports(join(proxyService.getTransports(), ","));

			AbstractOutputConnectorEditPart outputConnector = null;
			AbstractInputConnectorEditPart inputConnector = null;

			EsbNode node = null;
			AddCommand addCmd = null;

			for (int i = 0; i < proxyService.getTargetInLineInSequence().getList().size(); ++i) {
				AbstractMediator mediator = (AbstractMediator) proxyService
						.getTargetInLineInSequence().getList().get(i);
				IEsbNodeDeserializer deserializer = EsbDeserializerRegistry.getInstance()
						.getDeserializer(mediator);
				node = deserializer.createNode(mediator);
				mediatorList.add(node);

				addCmd = new AddCommand(domain, proxy.getContainer()
						.getSequenceAndEndpointContainer().getMediatorFlow(),
						EsbPackage.Literals.MEDIATOR_FLOW__CHILDREN, node);
				domain.getCommandStack().execute(addCmd);

			}

			addCmd = new AddCommand(domain, esbServer, EsbPackage.Literals.ESB_SERVER__CHILDREN,
					proxy);
			domain.getCommandStack().execute(addCmd);

			EditPart proxyOutputConnectorEditpart = EditorUtils.getEditpart(graphicalEditor,
					proxy.getOutputConnector());
			if (proxyOutputConnectorEditpart instanceof ProxyOutputConnectorEditPart) {
				outputConnector = (AbstractOutputConnectorEditPart) EditorUtils.getEditpart(
						graphicalEditor, proxy.getOutputConnector());
			}

			for (EsbNode mediatornode : mediatorList) {
				AbstractOutputConnectorEditPart nextOutputConnector = null;
				inputConnector = null;

				EditPart editpart = EditorUtils.getEditpart(graphicalEditor, mediatornode);
				if (editpart instanceof ShapeNodeEditPart) {
					inputConnector = EditorUtils.getInputConnector((ShapeNodeEditPart) editpart);
					nextOutputConnector = EditorUtils
							.getOutputConnector((ShapeNodeEditPart) editpart);

				}

				if (inputConnector != null && outputConnector != null) {
					List sourceConnections = outputConnector.getSourceConnections();
					Iterator iterator = sourceConnections.iterator();
					
					CompoundCommand ccModel = new CompoundCommand();
					org.eclipse.gef.commands.CompoundCommand ccView = new org.eclipse.gef.commands.CompoundCommand();
					
					while (iterator.hasNext()) {
						EsbLinkEditPart linkEditPart = (EsbLinkEditPart) iterator.next();

						Collection linkCollection = new ArrayList();
						linkCollection.add(((ConnectorImpl) linkEditPart.getModel()).getElement());

						org.eclipse.emf.edit.command.DeleteCommand modelDeleteCommand = new org.eclipse.emf.edit.command.DeleteCommand(
								outputConnector.getEditingDomain(), linkCollection);
						if (modelDeleteCommand.canExecute()) {
							ccModel.append(modelDeleteCommand);
						}

						DeleteCommand viewDeleteCommand = new DeleteCommand(
								linkEditPart.getNotationView());
						if (viewDeleteCommand.canExecute()) {
							ccView.add(new ICommandProxy(viewDeleteCommand));
						}
					}

					if (ccModel.canExecute()) {
						outputConnector.getEditingDomain().getCommandStack().execute(ccModel);
					}
					if (ccView.canExecute()) {
						outputConnector.getDiagramEditDomain().getDiagramCommandStack()
								.execute(ccView);
					}

					ConnectionUtils.createConnection(inputConnector, outputConnector);
				}
				outputConnector = nextOutputConnector;
			}

		}
		
	}


	
	private static String join(Iterable<? extends CharSequence> s, String delimiter) {
	    @SuppressWarnings("unchecked")
		Iterator<String> iter = (Iterator<String>) s.iterator();
	    StringBuffer buffer = new StringBuffer(iter.next());
	    while (iter.hasNext()) buffer.append(delimiter).append(iter.next());
	    return buffer.toString();
	}
	
	

}
