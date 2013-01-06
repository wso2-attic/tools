/*
 * Copyright 2009-2010 WSO2, Inc. (http://wso2.com)
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

package org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.utils;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.xml.namespace.NamespaceContext;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.util.AXIOMUtil;
import org.apache.synapse.config.xml.SendMediatorFactory;
import org.apache.synapse.mediators.Value;
import org.apache.synapse.mediators.base.SequenceMediator;
import org.apache.synapse.mediators.builtin.SendMediator;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.SetBoundsCommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PlatformUI;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.wso2.developerstudio.eclipse.gmf.esb.AbstractEndPoint;
import org.wso2.developerstudio.eclipse.gmf.esb.EndPoint;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbDiagram;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbLink;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbNode;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbServer;
import org.wso2.developerstudio.eclipse.gmf.esb.InputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.OutputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.ProxyInputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.Sequence;
import org.wso2.developerstudio.eclipse.gmf.esb.Sequences;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.Activator;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.AbstractConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.AbstractEndpointOutputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.AbstractMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.AbstractMediatorInputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.AbstractMediatorOutputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.ConnectionUtils;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.EditorUtils;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.SlidingBorderItemLocator;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.deserializer.AbstractEsbNodeDeserializer;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.deserializer.EsbDeserializerRegistry;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.deserializer.IEsbNodeDeserializer;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.EsbLinkEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.SendMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.SequenceEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbDiagramEditor;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbMultiPageEditor;
import org.wso2.developerstudio.eclipse.logging.core.IDeveloperStudioLog;
import org.wso2.developerstudio.eclipse.logging.core.Logger;

/**
 * 
 */
public class ElementDuplicator {
	/**
	 * Working project
	 */
	private IProject project;
	
	private List<EsbNode> esbNodes=new LinkedList<EsbNode>();
	private Map<EObject,ShapeNodeEditPart> editPartMap = new HashMap<EObject, ShapeNodeEditPart>();
	
	private InputConnector inputConnector=null;
	
	/**
	 * DeveloperStudio logger
	 * */
	private static IDeveloperStudioLog log=Logger.getLog(Activator.PLUGIN_ID);

	/**
	 * 
	 * @param project
	 * @param diagramEditor
	 */
	public ElementDuplicator(IProject project,EsbDiagramEditor diagramEditor) {
		this(project);
		EsbDeserializerRegistry.getInstance().init(diagramEditor);
	}
	
	/**
	 * 
	 * @param project
	 */
	public ElementDuplicator(IProject project) {
		if (project != null) {
			this.project = project;
		} else {
			throw new IllegalArgumentException("Project cannot be null");
		}
	}
	
	public void updateAssociatedDiagrams(EsbMultiPageEditor currentEditor) {
		EsbDiagram diagram = (EsbDiagram) currentEditor.getDiagram().getElement();
		EsbServer server = diagram.getServer();
		IFileEditorInput input = (IFileEditorInput) currentEditor.getEditorInput();
		IFile file = input.getFile();
		switch (server.getType()) {
		case PROXY:
			deleteElements(currentEditor);
			duplicateElemets(file, currentEditor);
			break;
		}
	}
	
	private void deleteElements(IEditorPart editor) {		
		EObject parent = null;
		EsbLink firstLink = null;
		InputConnector target=null;
		List<EObject> elements = new ArrayList<EObject>();
		Map registry = ((EsbMultiPageEditor) editor).getDiagramEditPart().getViewer().getEditPartRegistry();
		Collection<Object> values = new ArrayList<Object>();
		values.addAll(registry.values());

		for (int j = 0; j < values.size(); ++j) {
			EditPart element = (EditPart) values.toArray()[j];
			if (element instanceof SendMediatorEditPart) {			
				org.wso2.developerstudio.eclipse.gmf.esb.SendMediator sendMediator=(org.wso2.developerstudio.eclipse.gmf.esb.SendMediator) ((org.eclipse.gmf.runtime.notation.Node) ((SendMediatorEditPart) element)
						.getModel()).getElement();
				if(sendMediator.getReceivingSequenceType().getValue()==1){
					OutputConnector outputConnector = sendMediator.getOutputConnector();				
					if(outputConnector.getOutgoingLink()!=null){
						EObject node = outputConnector.getOutgoingLink().getTarget().eContainer();
						parent = node.eContainer();
		
						EList<EObject> child = node.eContents();
						for (int i = 0; i < child.size(); ++i) {
							if (child.get(i) instanceof OutputConnector) {
								outputConnector = (OutputConnector) child.get(i);
								break;
							}
						}
						firstLink = outputConnector.getOutgoingLink();			
						
						/*
						 * Collect elements to be deleted. 
						 */
						while ((outputConnector.getOutgoingLink() != null)&&(!isOutSequenceStarted(outputConnector.getOutgoingLink()))) {
		
							node = outputConnector.getOutgoingLink().getTarget().eContainer();
							if(elements.contains(node)){
								break;
							}
							elements.add(node);
							child = node.eContents();
							for (int i = 0; i < child.size(); ++i) {
								if (child.get(i) instanceof OutputConnector) {
									outputConnector = (OutputConnector) child.get(i);
									break;
								}
							}					
						}
					}
				}
			}
		}
		CompoundCommand resultCommand = new CompoundCommand();
		TransactionalEditingDomain domain = ((EsbMultiPageEditor) editor).getDiagramEditPart()
				.getEditingDomain();
		/*
		 * We have to delete first link from the model by force.(It's view will get deleted while other elements getting deleted.)
		 */
		Collection col = new ArrayList();
		col.add(firstLink);
		org.eclipse.emf.edit.command.DeleteCommand del = new org.eclipse.emf.edit.command.DeleteCommand(
				domain, col);
		if (del.canExecute()) {
			domain.getCommandStack().execute(del);
		}
		/*
		 * Delete elements recursively. 
		 */
		for (int j = 0; j < elements.size(); ++j) {
			RemoveCommand removeCmd = new RemoveCommand(domain, parent,
					EsbPackage.Literals.MEDIATOR_FLOW__CHILDREN, elements.get(j));
			resultCommand.append(removeCmd);
		}

		if (resultCommand.canExecute()) {
			domain.getCommandStack().execute(resultCommand);
		}
	}
	
	private void duplicateElemets(IFile file, IEditorPart editor) {
		List<EsbNode> esbNodes = null;
		Map registry = ((EsbMultiPageEditor) editor).getDiagramEditPart().getViewer()
				.getEditPartRegistry();
		Collection<Object> values = new ArrayList<Object>();
		values.addAll(registry.values());

		for (int j = 0; j < values.size(); ++j) {
			EditPart element = (EditPart) values.toArray()[j];
			if (element instanceof SequenceEditPart) {

			} else if (element instanceof SendMediatorEditPart) {
				if (((org.wso2.developerstudio.eclipse.gmf.esb.SendMediator) ((org.eclipse.gmf.runtime.notation.Node) ((SendMediatorEditPart) element)
						.getModel()).getElement()).getReceivingSequenceType().getValue() == 1) {
					AbstractMediatorOutputConnectorEditPart sendMediatorOutputConnector = EditorUtils
							.getMediatorOutputConnector((SendMediatorEditPart) element);
					if (sendMediatorOutputConnector.getSourceConnections().size() != 0) {
						String name = ((org.wso2.developerstudio.eclipse.gmf.esb.SendMediator) ((org.eclipse.gmf.runtime.notation.Node) ((SendMediatorEditPart) element)
								.getModel()).getElement()).getStaticReceivingSequence()
								.getKeyValue();
						GraphicalEditPart rootCompartment = EditorUtils
								.getSequenceAndEndpointCompartmentEditPart(element);
						esbNodes = duplicateElements(rootCompartment, name);
						relocateNodes(esbNodes, editor, (SendMediatorEditPart) element);
						createLinks(esbNodes, editor, (SendMediatorEditPart) element);
					}else{
						MessageDialog
						.openError(
								Display.getCurrent().getActiveShell(),
								"Diagram Incomplete ! ",
								"Output connector of the send mediator must be connected to an endpoint since send mediator has a receiving sequence.");
					}
				}
			}
		}

	}
	
	private void relocateNodes(List<EsbNode> nodes, IEditorPart editor,
			SendMediatorEditPart sendMediatorEP) {
		Rectangle sendMedRect = sendMediatorEP.getFigure().getBounds().getCopy();
		Rectangle parentRect = ((GraphicalEditPart)sendMediatorEP.getParent()).getFigure().getBounds().getCopy();
		refreshEditPartMap(editor);
		int initialYPos= sendMedRect.y + sendMedRect.height;
		for (EsbNode node : nodes) {
			GraphicalEditPart editpart = (GraphicalEditPart) getEditpart(node);
			Rectangle rect = new Rectangle(new Point(), editpart.getFigure().getPreferredSize()).getCopy();
			
			initialYPos += 60;
			rect.y = initialYPos;
			if(node instanceof EndPoint){
				SlidingBorderItemLocator.setPredefinedYValue(editpart.getFigure(),rect.y);
			} else{
				rect.x = ((sendMedRect.x + parentRect.width) / 2) - 75;
			}
			
			if(rect.y> parentRect.height){
				//FIXME : resize parent, GMF's auto-resizing capability may not sufficient
			}
			
			SetBoundsCommand sbc = new SetBoundsCommand(editpart.getEditingDomain(),
					"change location", new EObjectAdapter((View) editpart.getModel()), rect);

			editpart.getDiagramEditDomain().getDiagramCommandStack()
					.execute(new ICommandProxy(sbc));
			
			
		}
		
	}
	
	public void refreshEditPartMap(IEditorPart editor){
		EsbDiagramEditor diagramEditor=null;
		if (editor instanceof EsbMultiPageEditor){
			diagramEditor=((EsbMultiPageEditor)editor).getGraphicalEditor();
		}
		editPartMap.clear();
		if(diagramEditor==null)
			return;
		
		@SuppressWarnings("rawtypes")
		Map editPartRegistry = diagramEditor.getDiagramEditPart().getViewer().getEditPartRegistry();
		for (Object object : editPartRegistry.keySet()) {
			if(object instanceof org.eclipse.gmf.runtime.notation.Node){
				org.eclipse.gmf.runtime.notation.Node nodeImpl = (org.eclipse.gmf.runtime.notation.Node) object;
					Object ep = editPartRegistry.get(nodeImpl);
					if(ep instanceof ShapeNodeEditPart){
						editPartMap.put(nodeImpl.getElement(), (ShapeNodeEditPart)ep);
					}
			}
		}
	}
	
	public EditPart getEditpart(EObject node) {
		if(editPartMap.containsKey(node)){
			return editPartMap.get(node);
		}
		return null;
	}
	
	
	private void createLinks(List<EsbNode> nodes, IEditorPart editor,
			SendMediatorEditPart sendMediatorEditPart) {
		AbstractConnectorEditPart sourceConnector = null;
		AbstractConnectorEditPart targetConnector = null;

		AbstractMediatorOutputConnectorEditPart sendMediatorOutputConnector = EditorUtils
				.getMediatorOutputConnector(sendMediatorEditPart);
		ShapeNodeEditPart endpoint = (ShapeNodeEditPart) ((EsbLinkEditPart) sendMediatorOutputConnector
				.getSourceConnections().get(0)).getTarget().getParent();
		AbstractEndpointOutputConnectorEditPart endpointOutputConnector = EditorUtils
				.getEndpointOutputConnector(endpoint);
		refreshEditPartMap(editor);

		AbstractMediatorInputConnectorEditPart sequenceInputConnector = EditorUtils
				.getMediatorInputConnector((ShapeNodeEditPart) getEditpart(nodes.get(0)));
		ConnectionUtils.createConnection(sequenceInputConnector, endpointOutputConnector);

		Iterator<EsbNode> iterator = ((LinkedList<EsbNode>) nodes).iterator();

		while (iterator.hasNext()) {
			EsbNode mediatornode = iterator.next();

			AbstractConnectorEditPart nextSourceConnector = null;
			targetConnector = null;

			EditPart editpart = getEditpart(mediatornode);
			if (editpart instanceof ShapeNodeEditPart) {
				targetConnector = EditorUtils.getInputConnector((ShapeNodeEditPart) editpart);
				nextSourceConnector = EditorUtils.getOutputConnector((ShapeNodeEditPart) editpart);
			}

			if (targetConnector != null && sourceConnector != null) {
				ConnectionUtils.createConnection(targetConnector, sourceConnector);
			}
			sourceConnector = nextSourceConnector;

		}
		if (EditorUtils.getEndpoint(sourceConnector) != null) {
			ConnectionUtils.createConnection(
					(AbstractConnectorEditPart) getEditpart(inputConnector), sourceConnector);
		}
		nodes.clear();

	}
	
	public List<EsbNode> duplicateElements(GraphicalEditPart rootCompartment,String sequenceKey){		
		Value recievingSequence=new Value(sequenceKey);
		org.apache.synapse.mediators.base.SequenceMediator sequenceMediator=null;
		if(recievingSequence!=null){
			sequenceMediator=new SequenceMediator();
			sequenceMediator.setKey(recievingSequence);
			IEsbNodeDeserializer SequenceMediatorDeserializer = EsbDeserializerRegistry.getInstance().getDeserializer(sequenceMediator);
			if(SequenceMediatorDeserializer!=null){
				Sequence sequence = (Sequence) SequenceMediatorDeserializer.createNode(rootCompartment, sequenceMediator);
				esbNodes.add(sequence);
				//FIXME: set inline
			}
		}		
		
		List<SendMediator> sendMediators = getSendMediators(sequenceKey);
		for (SendMediator sendMediator : sendMediators) {
			try {
				@SuppressWarnings("rawtypes")
				Object endpoint=sendMediator.getEndpoint();
				IEsbNodeDeserializer deserializer = EsbDeserializerRegistry.getInstance().getDeserializer(endpoint);
				if(deserializer!=null){
					AbstractEndPoint endPoint = (AbstractEndPoint) deserializer.createNode(rootCompartment, endpoint);
					esbNodes.add(endPoint);
					//FIXME: set inline
				}
				
				if(sendMediator.getReceivingSequence()!=null){
					duplicateElements(rootCompartment,sendMediator.getReceivingSequence().getKeyValue());
				}
				
			} catch (NullPointerException e) {
				log.error("EsbDeserializerRegistry must be initialized before it can be used",e);
			}
			
			
		}
		return esbNodes;
	}
	
	
	private boolean isOutSequenceStarted(EsbLink link){
		OutputConnector	outputConnector=null;
		EObject node = link.getTarget().eContainer();
		if(node instanceof EndPoint){
			return false;
		}
		EList<EObject> child = node.eContents();
		for (int i = 0; i < child.size(); ++i) {
			if (child.get(i) instanceof OutputConnector) {
				outputConnector = (OutputConnector) child.get(i);
			}
			else if(child.get(i) instanceof InputConnector){
				inputConnector=(InputConnector) child.get(i);
			}
		}
		if(outputConnector.getOutgoingLink()==null){
			return false;
		}
		if((outputConnector.getOutgoingLink()!=null)&&(outputConnector.getOutgoingLink().getTarget().eContainer() instanceof EndPoint)){
			return false;
		}
				
		return true;
	}

	private String getFileLocation(String key) {
		IFolder endpointsDir = project.getFolder("src/main/synapse-config/sequences");
		if (endpointsDir.exists()) {
			IFile file = endpointsDir.getFile(key.concat(".xml"));
			if (file.exists()) {
				return file.getLocation().toOSString();
			}
		}
		return null;
	}
	
	private List<SendMediator> getSendMediators(String key) {
		List<SendMediator> sendList = new LinkedList<SendMediator>();
		
		String fileLocation = getFileLocation(key); 
		if(fileLocation==null) {
			log.error("Cannot find sequence '" + key + "'");
			return Collections.EMPTY_LIST;
		}

		DocumentBuilderFactory domFactory = DocumentBuilderFactory.newInstance();
		domFactory.setNamespaceAware(true);
		NamespaceContext ctx = new NamespaceContext() {
			public String getNamespaceURI(String prefix) {
				return "http://ws.apache.org/ns/synapse";
			}

			public String getPrefix(String str) {
				return null;
			}

			public Iterator<?> getPrefixes(String str) {
				return null;
			}
		};
		try {
			DocumentBuilder builder = domFactory.newDocumentBuilder();
			Document doc = builder.parse(fileLocation);
			XPath xpath = XPathFactory.newInstance().newXPath();
			xpath.setNamespaceContext(ctx);
			
			XPathExpression expr = xpath.compile("//:send");

			Object result = expr.evaluate(doc, XPathConstants.NODESET);
			NodeList nodes = (NodeList) result;
			for (int i = 0; i < nodes.getLength(); i++) {
				try {
					Node item = nodes.item(i);
					StringWriter writer = new StringWriter();
					Transformer transformer = TransformerFactory.newInstance().newTransformer();
					transformer.transform(new DOMSource(item), new StreamResult(writer));
					OMElement element = AXIOMUtil.stringToOM(writer.toString());
					SendMediatorFactory factory=new SendMediatorFactory();					
					sendList.add((SendMediator) factory.createMediator(element, new Properties()));
				} catch (Exception e) {
					//FIXME: log real error message
					log.error("An unexpected error has occurred",e);
				} 
			}
			
/*			expr = xpath.compile("//:sequence[@key]");

			result = expr.evaluate(doc, XPathConstants.NODESET);
			nodes = (NodeList) result;
			for (int i = 0; i < nodes.getLength(); i++) {
				try {
					if(nodes.item(i) instanceof Attr){
						Attr attr = (Attr) nodes.item(i);
						sendList.addAll(getSendMediators(attr.getValue()));
					}
				} catch (Exception e) {
					//FIXME: log real error message
					log.error("An unexpected error has occurred",e);
				} 
			}*/
		} catch (Exception e) {
			//FIXME: log real error message
			log.error("error",e);
		}

		return sendList;
	}

}
