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

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.synapse.mediators.AbstractMediator;
import org.apache.synapse.mediators.base.SequenceMediator;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.impl.ConnectorImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.DefaultEndPoint;
import org.wso2.developerstudio.eclipse.gmf.esb.EndPoint;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbDiagram;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbFactory;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbNode;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbServer;
import org.wso2.developerstudio.eclipse.gmf.esb.InputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.MediatorFlow;
import org.wso2.developerstudio.eclipse.gmf.esb.OutputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.SendMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.Activator;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.AbstractConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.ConnectionUtils;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.EditorUtils;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.EsbLinkEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbDiagramEditor;
import org.wso2.developerstudio.eclipse.logging.core.IDeveloperStudioLog;
import org.wso2.developerstudio.eclipse.logging.core.Logger;


public abstract class AbstractEsbNodeDeserializer<T,R extends EsbNode> implements IEsbNodeDeserializer<T,R> {
	private static EsbDiagramEditor diagramEditor;
	private static Map<EsbConnector, LinkedList<EsbNode>> connectionFlowMap = new LinkedHashMap<EsbConnector, LinkedList<EsbNode>>();
	private static Map<EObject,ShapeNodeEditPart> editPartMap = new HashMap<EObject, ShapeNodeEditPart>();
	private static Map<EsbConnector, EsbConnector> pairMediatorFlowMap = new HashMap<EsbConnector, EsbConnector>();
	private static List<EObject> reversedNodes = new ArrayList<EObject>();
	private static IDeveloperStudioLog log=Logger.getLog(Activator.PLUGIN_ID);
	
	private static int currentX = 25;
	
	public EsbDiagramEditor getDiagramEditor() {
		return diagramEditor;
	}

	public void setDiagramEditor(EsbDiagramEditor diagramEditor) {
		AbstractEsbNodeDeserializer.diagramEditor = diagramEditor;
	}

	/**
	 * Deserialize a sequence
	 * @param mediatorFlow
	 * @param sequence
	 * @param connector
	 */
	protected void deserializeSequence(MediatorFlow mediatorFlow, SequenceMediator sequence, EsbConnector connector) {
		LinkedList<EsbNode> nodeList = new LinkedList<EsbNode>();
	
		Diagram diagram = getDiagramEditor().getDiagram();
		EsbDiagram esbDiagram = (EsbDiagram) diagram.getElement();
		EsbServer esbServer = esbDiagram.getServer();
		TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(esbServer);

		if(connector instanceof OutputConnector){
			for (int i = 0; i < sequence.getList().size(); ++i) {
				AbstractMediator mediator = (AbstractMediator) sequence.getList().get(i);
				executeMediatorDeserializer(mediatorFlow, nodeList, domain, mediator,false);
			}
			connectionFlowMap.put(connector, nodeList);
		} else if(connector instanceof InputConnector){
			for (int i = sequence.getList().size() -1; i >= 0; --i) {
				AbstractMediator mediator = (AbstractMediator) sequence.getList().get(i);
				executeMediatorDeserializer(mediatorFlow, nodeList, domain, mediator,true);
			}
			connectionFlowMap.put(connector, nodeList);
			reversedNodes.addAll(nodeList);
		}
		
	}

	/**
	 * Execute deserializer
	 * @param mediatorFlow
	 * @param nodeList
	 * @param domain
	 * @param mediator
	 * @param reversed
	 */
	private void executeMediatorDeserializer(MediatorFlow mediatorFlow,
			LinkedList<EsbNode> nodeList, TransactionalEditingDomain domain,
			AbstractMediator mediator,boolean reversed) {
		IEsbNodeDeserializer deserializer = EsbDeserializerRegistry.getInstance().getDeserializer(
				mediator);
		if (deserializer != null) {
			EsbNode node = deserializer.createNode(mediator);
			nodeList.add(node);

			AddCommand addCmd = new AddCommand(domain, mediatorFlow,
					EsbPackage.Literals.MEDIATOR_FLOW__CHILDREN, node);

			if (addCmd.canExecute()) {
				domain.getCommandStack().execute(addCmd);
			} else {
				getLog().warn("Cannot execute EMF command : " + addCmd.toString());
			}
			
			if (node instanceof SendMediator && !reversed){
				/*hard coded for testing*/
				DefaultEndPoint endPoint = EsbFactory.eINSTANCE.createDefaultEndPoint();
				nodeList.add(endPoint);
				addCmd = new AddCommand(domain, mediatorFlow,
						EsbPackage.Literals.MEDIATOR_FLOW__CHILDREN, endPoint);
				
				if (addCmd.canExecute()) {
					domain.getCommandStack().execute(addCmd);
				} else {
					getLog().warn("Cannot execute EMF command : " + addCmd.toString());
				} // end
				
				//TODO: extract endpoint from send mediator
			}

		}
	}
	
	protected void addPairMediatorFlow(EsbConnector startEnd,EsbConnector stopEnd) {
		pairMediatorFlowMap.put(startEnd, stopEnd);
	}
	
	private static void pairMediatorFlows() {
		for (Map.Entry<EsbConnector, EsbConnector> pair : pairMediatorFlowMap.entrySet()) {
			LinkedList<EsbNode> inSeq = connectionFlowMap.get(pair.getKey());
			LinkedList<EsbNode> outSeq = connectionFlowMap.get(pair.getValue());
			if (inSeq.size() > 0 && inSeq.getLast() instanceof EndPoint && outSeq.size() > 0 && outSeq.getLast() != null) {
				EsbNode last = inSeq.getLast();
				AbstractConnectorEditPart sourceConnector = EditorUtils
						.getOutputConnector((ShapeNodeEditPart) getEditpart(last));
				AbstractConnectorEditPart targetConnector = EditorUtils
						.getInputConnector((ShapeNodeEditPart) getEditpart(outSeq.getLast()));
				if (sourceConnector != null && targetConnector != null) {
					clearLinks(targetConnector);
					clearLinks(sourceConnector);
					ConnectionUtils.createConnection(targetConnector,sourceConnector);
				}
			}
		}
	}
	
	/**
	 * Connect all mediator-flows according to sequence 
	 */
	public static synchronized void connectMediatorFlows(){
		refreshEditPartMap();
		for(EObject node : reversedNodes){
			EditPart editpart = getEditpart(node);
			if(editpart instanceof org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.AbstractMediator){
				((org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.AbstractMediator)editpart).reverseConnectors();
			}
		}
		for (Map.Entry<EsbConnector, LinkedList<EsbNode>> flow : connectionFlowMap.entrySet()) {
			connectMediatorFlow(flow.getKey(), flow.getValue());
		}
		pairMediatorFlows();
		connectionFlowMap.clear();
		reversedNodes.clear();
		pairMediatorFlowMap.clear();
	}
	
	
	/**
	 * Connect mediator-flow to a connector
	 * @param connector
	 * @param nodeList
	 */
	private static void connectMediatorFlow(EsbConnector connector, LinkedList<EsbNode> nodeList) {
		AbstractConnectorEditPart sourceConnector = null;
		AbstractConnectorEditPart targetConnector = null;
		
		currentX = 25;
		
		boolean reversedMode = (connector instanceof InputConnector);

		EditPart sourceConnectorEditpart = getEditpart(connector);
		if (sourceConnectorEditpart instanceof AbstractConnectorEditPart) {
			sourceConnector = (AbstractConnectorEditPart) getEditpart(connector);
		}

		Iterator<EsbNode> iterator = nodeList.iterator();

		while (iterator.hasNext()) {
			EsbNode mediatornode = iterator.next();
			AbstractConnectorEditPart nextSourceConnector = null;
			targetConnector = null;

			EditPart editpart = getEditpart(mediatornode);
			if (editpart instanceof ShapeNodeEditPart) {
				if(reversedMode){
					targetConnector = EditorUtils.getOutputConnector((ShapeNodeEditPart) editpart);
					nextSourceConnector = EditorUtils.getInputConnector((ShapeNodeEditPart) editpart);
				} else{
					targetConnector = EditorUtils.getInputConnector((ShapeNodeEditPart) editpart);
					nextSourceConnector = EditorUtils.getOutputConnector((ShapeNodeEditPart) editpart);
				}
			}
			
			relocateNode(reversedMode, editpart);
			
			if(nextSourceConnector!=null){
				clearLinks(nextSourceConnector);
			}

			if (targetConnector != null && sourceConnector != null) {
				clearLinks(targetConnector);
				clearLinks(sourceConnector);
				
				if(reversedMode){
					ConnectionUtils.createConnection(sourceConnector,targetConnector);
				} else{
					ConnectionUtils.createConnection(targetConnector, sourceConnector);
				}
				
			}
			sourceConnector = nextSourceConnector;
		}
	}

	/**
	 * @param reversedMode
	 * @param editpart
	 */
	public static void relocateNode(boolean reversedMode, EditPart editpart) {
		
		int currentY = (reversedMode)?250:0;
		GraphicalEditPart gEditpart = (GraphicalEditPart)editpart;
		GraphicalEditPart parent =((GraphicalEditPart)editpart.getParent());
		
		if(editpart instanceof org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.AbstractMediator){
			parent.setLayoutConstraint(parent, gEditpart.getFigure(), new org.eclipse.draw2d.geometry.Rectangle(currentX, currentY, -1, -1));
			currentX = currentX + gEditpart.getFigure().getBounds().width + 50;
		}
		
	
	}

	/**
	 * Clear link 
	 * @param sourceConnector
	 */
	private static void clearLinks(AbstractConnectorEditPart sourceConnector) {
		List connections = new ArrayList();
		connections.addAll(sourceConnector.getSourceConnections());
		connections.addAll(sourceConnector.getTargetConnections());
		Iterator iterator = connections.iterator();
		
		CompoundCommand ccModel = new CompoundCommand();
		org.eclipse.gef.commands.CompoundCommand ccView = new org.eclipse.gef.commands.CompoundCommand();
		
		while (iterator.hasNext()) {
			EsbLinkEditPart linkEditPart = (EsbLinkEditPart) iterator.next();

			Collection linkCollection = new ArrayList();
			linkCollection.add(((ConnectorImpl) linkEditPart.getModel()).getElement());

			org.eclipse.emf.edit.command.DeleteCommand modelDeleteCommand = new org.eclipse.emf.edit.command.DeleteCommand(
					sourceConnector.getEditingDomain(), linkCollection);
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
			sourceConnector.getEditingDomain().getCommandStack().execute(ccModel);
		}
		if (ccView.canExecute()) {
			sourceConnector.getDiagramEditDomain().getDiagramCommandStack()
					.execute(ccView);
		}
	}
	
	/**
	 * Refresh EditPartMap
	 */
	public static void refreshEditPartMap(){
		editPartMap.clear();
		Map editPartRegistry = diagramEditor.getDiagramEditPart().getViewer().getEditPartRegistry();
		for (Object object : editPartRegistry.keySet()) {
			if(object instanceof Node){
				Node nodeImpl = (Node) object;
					Object ep = editPartRegistry.get(nodeImpl);
					if(ep instanceof ShapeNodeEditPart){
						editPartMap.put(nodeImpl.getElement(), (ShapeNodeEditPart)ep);
					}
			}
		}
	}
	
	/**
	 * Get corresponding EditPart of EObject
	 * @param node
	 * @return
	 */
	public static EditPart getEditpart(EObject node) {
		if(editPartMap.containsKey(node)){
			return editPartMap.get(node);
		}
		return null;
	}
	
	protected static String join(Iterable<? extends CharSequence> s, String delimiter) {
	    @SuppressWarnings("unchecked")
		Iterator<String> iter = (Iterator<String>) s.iterator();
	    StringBuffer buffer = new StringBuffer(iter.next());
	    while (iter.hasNext()) buffer.append(delimiter).append(iter.next());
	    return buffer.toString();
	}

	public static IDeveloperStudioLog getLog() {
		return log;
	}
	
}
