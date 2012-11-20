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
import org.apache.synapse.util.xpath.SynapseXPath;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.SetBoundsCommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.commands.SetValueCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.notation.impl.ConnectorImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.AbstractEndPoint;
import org.wso2.developerstudio.eclipse.gmf.esb.EndPoint;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbDiagram;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbFactory;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbNode;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbServer;
import org.wso2.developerstudio.eclipse.gmf.esb.InputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.NamespacedProperty;
import org.wso2.developerstudio.eclipse.gmf.esb.OutputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.SendMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.Activator;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.AbstractConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.AbstractOutputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.ConnectionUtils;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.EditorUtils;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.complexFiguredAbstractMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.EsbLinkEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbDiagramEditor;
import org.wso2.developerstudio.eclipse.logging.core.IDeveloperStudioLog;
import org.wso2.developerstudio.eclipse.logging.core.Logger;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;

public abstract class AbstractEsbNodeDeserializer<T,R extends EsbNode> implements IEsbNodeDeserializer<T,R> {
	private static EsbDiagramEditor diagramEditor;
	private static Map<EsbConnector, LinkedList<EsbNode>> connectionFlowMap = new LinkedHashMap<EsbConnector, LinkedList<EsbNode>>();
	private static Map<EObject,ShapeNodeEditPart> editPartMap = new HashMap<EObject, ShapeNodeEditPart>();
	private static Map<EsbConnector, EsbConnector> pairMediatorFlowMap = new HashMap<EsbConnector, EsbConnector>();
	private static List<EObject> reversedNodes = new ArrayList<EObject>();
	private static IDeveloperStudioLog log=Logger.getLog(Activator.PLUGIN_ID);
	private static GraphicalEditPart rootCompartment;
	private static List<EsbConnector> rootInputConnectors = new ArrayList<EsbConnector>();
	private EObject elementToEdit;
	
	public void setElementToEdit(EObject elementToEdit) {
		this.elementToEdit = elementToEdit;
	}

	private static Map<EsbConnector, Rectangle> currentLocation ;
	
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
	protected void deserializeSequence(IGraphicalEditPart part, SequenceMediator sequence, EsbConnector connector) {
		LinkedList<EsbNode> nodeList = new LinkedList<EsbNode>();
	
		Diagram diagram = getDiagramEditor().getDiagram();
		EsbDiagram esbDiagram = (EsbDiagram) diagram.getElement();
		EsbServer esbServer = esbDiagram.getServer();
		TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(esbServer);

		if(connector instanceof OutputConnector){
			for (int i = 0; i < sequence.getList().size(); ++i) {
				AbstractMediator mediator = (AbstractMediator) sequence.getList().get(i);
				executeMediatorDeserializer(part, nodeList, domain, mediator,false);
			}
			connectionFlowMap.put(connector, nodeList);
		} else if(connector instanceof InputConnector){
			for (int i = sequence.getList().size() -1; i >= 0; --i) {
				AbstractMediator mediator = (AbstractMediator) sequence.getList().get(i);
				executeMediatorDeserializer(part, nodeList, domain, mediator,true);
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
	private void executeMediatorDeserializer(IGraphicalEditPart part,
			LinkedList<EsbNode> nodeList, TransactionalEditingDomain domain,
			AbstractMediator mediator,boolean reversed) {
		@SuppressWarnings("rawtypes")
		IEsbNodeDeserializer deserializer = EsbDeserializerRegistry.getInstance().getDeserializer(
				mediator);
		if (deserializer != null) {
			@SuppressWarnings("unchecked")
			EsbNode node = deserializer.createNode(part, mediator);
			if (node!=null) {
				nodeList.add(node);

				if (node instanceof SendMediator && !reversed) {
					if (getRootCompartment() != null) {
						SendMediator sendMediator = (SendMediator) node;
						AbstractEndPoint endPoint = sendMediator.getNextNode();
						// Extract the endPoint info from the sendMediator
						if (endPoint != null) {
							nodeList.add(endPoint);
						}
					}
				}
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
			if (inSeq.size() > 0 && inSeq.getLast() instanceof EndPoint) {
				EsbNode last = inSeq.getLast();
				AbstractConnectorEditPart sourceConnector = EditorUtils
						.getOutputConnector((ShapeNodeEditPart) getEditpart(last));
				AbstractConnectorEditPart targetConnector = null;
				if(outSeq.size() > 0 && outSeq.getLast() != null){
					targetConnector = EditorUtils
					.getInputConnector((ShapeNodeEditPart) getEditpart(outSeq.getLast()));
				} else{
					targetConnector = (AbstractConnectorEditPart) pair.getValue();
				}
				
				if (sourceConnector != null && targetConnector != null) {
					ConnectionUtils.createConnection(targetConnector,sourceConnector);
				}
			}
		}
		//looking for other possible connections
		Iterator<EsbConnector> iterator = getRootInputConnectors().iterator();
		while (iterator.hasNext()) {
			EsbConnector rootConnector = iterator.next();
				for (LinkedList<EsbNode> nodes : connectionFlowMap.values()) {
					if (!pairMediatorFlowMap.values().contains(nodes)) {
						if (nodes.size() > 0 && nodes.getLast() instanceof EndPoint) {
							LinkedList<EsbNode> outSeq = connectionFlowMap.get(rootConnector);
							AbstractConnectorEditPart targetConnector = null;
							EsbNode last = nodes.getLast();
							AbstractConnectorEditPart sourceConnector = EditorUtils
									.getOutputConnector((ShapeNodeEditPart) getEditpart(last));
							if (outSeq.size() > 0 && outSeq.getLast() != null) {
								targetConnector = EditorUtils
										.getInputConnector((ShapeNodeEditPart) getEditpart(outSeq
												.getLast()));
							} else {
								targetConnector = (AbstractConnectorEditPart) rootConnector;
							}

							if (sourceConnector != null && targetConnector != null) {
								ConnectionUtils.createConnection(targetConnector, sourceConnector);
							}
						}
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
		currentLocation = new HashMap<EsbConnector, Rectangle>();
		for (Map.Entry<EsbConnector, LinkedList<EsbNode>> flow : connectionFlowMap.entrySet()) {
			relocateFlow(flow.getKey(), flow.getValue());
		}
		clearLinks();
		refreshEditPartMap();
		for (Map.Entry<EsbConnector, LinkedList<EsbNode>> flow : connectionFlowMap.entrySet()) {
			connectMediatorFlow(flow.getKey(), flow.getValue());
		}
		pairMediatorFlows();
		connectionFlowMap.clear();
		reversedNodes.clear();
		pairMediatorFlowMap.clear();
		rootInputConnectors.clear();
	}
	
	
	/**
	 * Connect mediator-flow to a connector
	 * @param connector
	 * @param nodeList
	 */
	private static void connectMediatorFlow(EsbConnector connector, LinkedList<EsbNode> nodeList) {
		AbstractConnectorEditPart sourceConnector = null;
		AbstractConnectorEditPart targetConnector = null;
		
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

			if (targetConnector != null && sourceConnector != null) {				
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
	private static void relocateNode(final Rectangle location, EditPart editpart) {
		
		GraphicalEditPart gEditpart = (GraphicalEditPart)editpart;
		
		if(editpart instanceof org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.AbstractMediator){
			Rectangle rect = new Rectangle(new Point(), gEditpart.getFigure().getPreferredSize())
					.getCopy();
			Rectangle rectCopy = rect.getCopy();
			if (editpart instanceof complexFiguredAbstractMediator) {
				@SuppressWarnings("rawtypes")
				List children = gEditpart.getChildren();
				int pointY= 50;
				for (Object child : children) {
					if (child instanceof AbstractOutputConnectorEditPart) {
						EsbConnector connector = (EsbConnector) ((Node) ((EditPart) child)
								.getModel()).getElement();
						Rectangle point = currentLocation.get(connector);
						if (point != null) {
							rectCopy.width = Math.max(rectCopy.width, point.x + 50);
							pointY += (point.y + point.height) + 20; 
							rectCopy.height = Math.max(rectCopy.height, pointY);
						}
					}
				}
			}
			rect.x = location.x;
			rect.y = location.y;
			SetBoundsCommand sbc = new SetBoundsCommand(gEditpart.getEditingDomain(),
					"change location", new EObjectAdapter((View) editpart.getModel()), rect);

			gEditpart.getDiagramEditDomain().getDiagramCommandStack()
					.execute(new ICommandProxy(sbc));
			location.x = location.x + rectCopy.width + 40;
			location.height = Math.max(location.height, rectCopy.height);
		}
		
	}
	
	private static void relocateFlow(EsbConnector connector, LinkedList<EsbNode> nodeList) {
		if(!currentLocation.containsKey(connector)){
			currentLocation.put(connector, new Rectangle(25, 10,0,0));
		}
		
		Rectangle point = currentLocation.get(connector);
		Iterator<EsbNode> iterator = nodeList.iterator();

		while (iterator.hasNext()) {
			EsbNode mediatornode = iterator.next();
			EditPart editpart = getEditpart(mediatornode);
			relocateNode(point, editpart);
		}
		
		EsbConnector pairConnector = pairMediatorFlowMap.get(connector);
		if(pairConnector!=null){
			currentLocation.put(pairConnector, new Rectangle(25, Math.max(200, point.height+30),0,0));
		}
	
	}
	
	/**
	 * Clear links 
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private static void clearLinks() {
		Collection values = diagramEditor.getDiagramGraphicalViewer().getEditPartRegistry().values();
		Iterator iterator = values.iterator();
		CompoundCommand ccModel = new CompoundCommand();
		org.eclipse.gef.commands.CompoundCommand ccView = new org.eclipse.gef.commands.CompoundCommand();
		
		while (iterator.hasNext()) {
			Object editPart = iterator.next();
			if (editPart instanceof EsbLinkEditPart ) {
				EsbLinkEditPart linkEditPart = (EsbLinkEditPart) editPart;
				Collection linkCollection = new ArrayList();
				linkCollection.add(((ConnectorImpl) linkEditPart.getModel()).getElement());
				org.eclipse.emf.edit.command.DeleteCommand modelDeleteCommand = new org.eclipse.emf.edit.command.DeleteCommand(
						diagramEditor.getEditingDomain(), linkCollection);
				if (modelDeleteCommand.canExecute()) {
					ccModel.append(modelDeleteCommand);
				}
				DeleteCommand viewDeleteCommand = new DeleteCommand(linkEditPart.getNotationView());
				if (viewDeleteCommand.canExecute()) {
					ccView.add(new ICommandProxy(viewDeleteCommand));
				}
			}
		}

		if (ccModel.canExecute()) {
			diagramEditor.getEditingDomain().getCommandStack().execute(ccModel);
		}
		if (ccView.canExecute()) {
			diagramEditor.getDiagramEditDomain().getDiagramCommandStack()
					.execute(ccView);
		}
	}
	

	/**
	 * Clear link 
	 * @param sourceConnector
	 */
	@Deprecated
	@SuppressWarnings({ "unchecked", "rawtypes" })
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
		
		if(diagramEditor==null)
			return;
		
		@SuppressWarnings("rawtypes")
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

	public static IDeveloperStudioLog getLog() {
		return log;
	}

	public static void setRootCompartment(GraphicalEditPart compartment) {
		AbstractEsbNodeDeserializer.rootCompartment = compartment;
	}

	public static GraphicalEditPart getRootCompartment() {
		return rootCompartment;
	}

	public static void addRootInputConnector(EsbConnector rootInputConnector) {
		rootInputConnectors.add(rootInputConnector);
	}

	public static List<EsbConnector> getRootInputConnectors() {
		return rootInputConnectors;
	}
	
	/*
	 * If you are going to use this method, you must set "elementToEdit" attribute first.
	 */
	protected boolean executeSetValueCommand(EStructuralFeature feature, Object value){
		return executeSetValueCommand(elementToEdit,feature,value);
	}
		
	protected boolean executeSetValueCommand(EObject elementToEdit,
			EStructuralFeature feature, Object value) {
		SetRequest reqSet = new SetRequest(diagramEditor.getEditingDomain(),
				elementToEdit, feature, value);
		SetValueCommand operation = new SetValueCommand(reqSet);
		if (operation.canExecute()) {
			diagramEditor.getDiagramEditDomain().getDiagramCommandStack()
					.execute(new ICommandProxy(operation));
			return true;
		}
		return false;		
	}
	
	protected NamespacedProperty createNamespacedProperty(SynapseXPath xpath) {			
		NamespacedProperty nsp = EsbFactory.eINSTANCE.createNamespacedProperty();				
		nsp.setPropertyValue(xpath.toString());				
		if (xpath.getNamespaces() != null) {
			@SuppressWarnings("unchecked")
			Map<String, String> map = xpath.getNamespaces();
			nsp.setNamespaces(map);
		}
		return nsp;
	}
	
}
