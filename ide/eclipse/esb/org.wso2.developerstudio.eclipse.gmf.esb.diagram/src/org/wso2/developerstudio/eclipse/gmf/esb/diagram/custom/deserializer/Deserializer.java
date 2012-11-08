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

import org.apache.synapse.config.SynapseConfiguration;
import org.apache.synapse.config.SynapseConfigurationBuilder;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbDiagram;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbElement;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbNode;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbServer;
import org.wso2.developerstudio.eclipse.gmf.esb.ProxyService;
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
		EsbDeserializerRegistry.getInstance().init(graphicalEditor);
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

		//resultCommand = new CompoundCommand();
		AddCommand addCmd = null;
		for (org.apache.synapse.core.axis2.ProxyService proxyService : synapseCofig
				.getProxyServices()) {
			
			IEsbNodeDeserializer deserializer = EsbDeserializerRegistry.getInstance().getDeserializer(proxyService);
			EsbNode node = deserializer.createNode(proxyService);
			
			addCmd = new AddCommand(domain, esbServer, EsbPackage.Literals.ESB_SERVER__CHILDREN,
					node);
			domain.getCommandStack().execute(addCmd);

		}
		
		//TODO: deserialize other artifacts 
		
		AbstractEsbNodeDeserializer.connectMediatorFlows();
				
	}


	

}
