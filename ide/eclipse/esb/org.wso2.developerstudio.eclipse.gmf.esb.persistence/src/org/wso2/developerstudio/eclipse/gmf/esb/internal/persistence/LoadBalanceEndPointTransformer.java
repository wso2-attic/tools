package org.wso2.developerstudio.eclipse.gmf.esb.internal.persistence;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.synapse.endpoints.Endpoint;
import org.apache.synapse.endpoints.EndpointDefinition;
import org.apache.synapse.endpoints.LoadbalanceEndpoint;
import org.apache.synapse.endpoints.SALoadbalanceEndpoint;
import org.apache.synapse.endpoints.algorithms.RoundRobin;
import org.apache.synapse.mediators.base.SequenceMediator;
import org.apache.synapse.mediators.builtin.SendMediator;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PlatformUI;
import org.wso2.developerstudio.eclipse.gmf.esb.ComplexEndpoints;
import org.wso2.developerstudio.eclipse.gmf.esb.ComplexEndpointsOutputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.EndPoint;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbDiagram;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbElement;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbNode;
import org.wso2.developerstudio.eclipse.gmf.esb.InputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.LoadBalanceEndPoint;
import org.wso2.developerstudio.eclipse.gmf.esb.LoadBalanceSessionType;
import org.wso2.developerstudio.eclipse.gmf.esb.Sequence;
import org.wso2.developerstudio.eclipse.gmf.esb.SequenceInputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.persistence.EsbNodeTransformer;
import org.wso2.developerstudio.eclipse.gmf.esb.persistence.EsbTransformerRegistry;
import org.wso2.developerstudio.eclipse.gmf.esb.persistence.TransformationInfo;
import org.apache.synapse.endpoints.dispatch.Dispatcher;
import org.apache.synapse.endpoints.dispatch.HttpSessionDispatcher;
import org.apache.synapse.endpoints.dispatch.SimpleClientSessionDispatcher;
import org.apache.synapse.endpoints.dispatch.SoapSessionDispatcher;

public class LoadBalanceEndPointTransformer extends AbstractEndpointTransformer{

	public void transform(TransformationInfo information, EsbNode subject)
			throws Exception {
		//try{
		Assert.isTrue(subject instanceof LoadBalanceEndPoint, "Invalid subject.");
		LoadBalanceEndPoint visualEndPoint = (LoadBalanceEndPoint) subject;
		
		
		SendMediator sendMediator = null;
		if (information.getPreviouNode() instanceof org.wso2.developerstudio.eclipse.gmf.esb.SendMediator) {
			sendMediator = (SendMediator) information.getParentSequence().getList()
					.get(information.getParentSequence().getList().size() - 1);
		}else if(information.getPreviouNode() instanceof org.wso2.developerstudio.eclipse.gmf.esb.Sequence){
			sendMediator=null;
		} else {
			//sendMediator = new SendMediator();	
			//information.getParentSequence().addChild(sendMediator);
		}
/*		org.apache.synapse.endpoints.LoadbalanceEndpoint synapseLoadEP = new org.apache.synapse.endpoints.LoadbalanceEndpoint();
		EndpointDefinition synapseEPDef = new EndpointDefinition();
		
		//We should give this LoadbalanceAlgorithm class at runtime.User should be requested to give a class.
		
		synapseLoadEP.setAlgorithm(new RoundRobin());
		
		
		List<Endpoint>endPoints= new ArrayList<Endpoint>();
		
		synapseLoadEP.setChildren(endPoints);
		
		synapseLoadEP.setDefinition(synapseEPDef);*/
		
		//sendMediator.setEndpoint(create(information, visualEndPoint, null, null));
		
		if(visualEndPoint.isInLine()){
			information.getCurrentProxy().setTargetInLineEndpoint(create(information, visualEndPoint, null, null));
		}else{
			if(sendMediator !=null){
				sendMediator.setEndpoint(create(information, visualEndPoint, null, null));
			}
		}
		
		if(!information.isEndPointFound){
			information.isEndPointFound=true;
			information.firstEndPoint=visualEndPoint;
		}
		
		if(visualEndPoint.getWestOutputConnector()!=null){
			if(visualEndPoint.getWestOutputConnector().getOutgoingLink() !=null){
			InputConnector nextInputConnector=visualEndPoint.getWestOutputConnector().getOutgoingLink().getTarget();
			if((!(nextInputConnector instanceof SequenceInputConnector))||
					((((Sequence)nextInputConnector.eContainer()).getOutputConnector().get(0).getOutgoingLink()!=null)&&(!(((Sequence)nextInputConnector.eContainer()).getOutputConnector().get(0).getOutgoingLink().getTarget().eContainer() instanceof EndPoint)))){
				information.setParentSequence(information.getOriginOutSequence());
				information.setTraversalDirection(TransformationInfo.TRAVERSAL_DIRECTION_OUT);
			}else if(visualEndPoint.getInputConnector().getIncomingLinks().get(0).getSource().eContainer() instanceof Sequence){
				information.setParentSequence(information.getCurrentReferredSequence());
			}
			}
		}

		List<EsbNode> transformedMediators = information.getTransformedMediators();
		if (visualEndPoint.getOutputConnector() != null && visualEndPoint.getWestOutputConnector().getOutgoingLink()!=null) {
			EsbNode nextElement = (EsbNode) visualEndPoint.getWestOutputConnector().getOutgoingLink().getTarget().eContainer();
			if (transformedMediators.contains(nextElement)) {
				return;
			}
			transformedMediators.add(nextElement);
		}

		
		
/*		information.getParentSequence().addChild(sendMediator);
		
		if(!information.isEndPointFound){
			information.isEndPointFound=true;
			information.firstEndPoint=visualEndPoint;
		}
		
		ArrayList<ComplexEndpointsOutputConnector> connectors=createAllEndpoints(visualEndPoint);
		
		for (ComplexEndpointsOutputConnector outputConnector : connectors) {
			if(outputConnector.getOutgoingLink()!=null){
				if(outputConnector.getOutgoingLink().getTarget()!=null){
			EsbNode esbNode=(EsbNode)outputConnector.getOutgoingLink().getTarget().eContainer();
			EsbNodeTransformer transformer = EsbTransformerRegistry.getInstance().getTransformer(esbNode);
			transformer.createSynapseObject(information,esbNode,endPoints);						
			}
			}
		}*/
/*	}	catch(Exception e){
		e.printStackTrace();
	}*/		
		
	}

	public void createSynapseObject(TransformationInfo info, EObject subject,
			List<Endpoint> endPoints) {
		//try{
		Assert.isTrue(subject instanceof LoadBalanceEndPoint, "Invalid subject.");
		LoadBalanceEndPoint visualEndPoint = (LoadBalanceEndPoint) subject;
		create(info, visualEndPoint, null, endPoints);
		
/*		org.apache.synapse.endpoints.LoadbalanceEndpoint synapseLoadEP = new org.apache.synapse.endpoints.LoadbalanceEndpoint();
		EndpointDefinition synapseEPDef = new EndpointDefinition();
		
		//We should give this LoadbalanceAlgorithm class at runtime.User should be requested to give a class.
		
		synapseLoadEP.setAlgorithm(new RoundRobin());		
		
		List<Endpoint>endPointsList= new ArrayList<Endpoint>();
		
		synapseLoadEP.setChildren(endPointsList);
		
		synapseLoadEP.setDefinition(synapseEPDef);
		
		endPoints.add(synapseLoadEP);
		
		if(!info.isEndPointFound){
			info.isEndPointFound=true;
			info.firstEndPoint=visualEndPoint;
		}
		
		ArrayList<ComplexEndpointsOutputConnector> connectors=createAllEndpoints(visualEndPoint);
		
		for (ComplexEndpointsOutputConnector outputConnector : connectors) {
			if(outputConnector.getOutgoingLink()!=null){
				if(outputConnector.getOutgoingLink().getTarget()!=null){
			EsbNode esbNode=(EsbNode)outputConnector.getOutgoingLink().getTarget().eContainer();
			EsbNodeTransformer transformer = EsbTransformerRegistry.getInstance().getTransformer(esbNode);
			transformer.createSynapseObject(info,esbNode,endPointsList);						
			}
			}
		}
				
		}	catch(Exception e){
			e.printStackTrace();
		}*/
	}
	
	public void transformWithinSequence(TransformationInfo information,
			EsbNode subject, SequenceMediator sequence) throws Exception {
		Assert.isTrue(subject instanceof LoadBalanceEndPoint, "Invalid subject");
		LoadBalanceEndPoint visualEndPoint = (LoadBalanceEndPoint) subject;
		
		SendMediator sendMediator = null;
		if (sequence.getList().get(sequence.getList().size()-1) instanceof SendMediator) {			
			sendMediator = (SendMediator)sequence.getList().get(sequence.getList().size()-1);
		} else {
			sendMediator = new SendMediator();
			sequence.addChild(sendMediator);
		}		
		sendMediator.setEndpoint(create(information, visualEndPoint, null, null));
		
	}
	
	public LoadbalanceEndpoint create(TransformationInfo info, LoadBalanceEndPoint visualEndPoint,
			String name,List<Endpoint> endPoints) {
		//LoadbalanceEndpoint synapseLBEP = new LoadbalanceEndpoint();
		SALoadbalanceEndpoint synapseLBEP =new SALoadbalanceEndpoint();
		if (name != null) {
			synapseLBEP.setName(name);
		}
		EndpointDefinition synapseEPDef = new EndpointDefinition();
		/*
		 * We should give this LoadbalanceAlgorithm class at runtime.User should be requested to give a class.		
		 */
		synapseLBEP.setAlgorithm(new RoundRobin());
		switch (visualEndPoint.getSessionType()) {
		case SOAP:
			Dispatcher soapDispatcher = new SoapSessionDispatcher();
			synapseLBEP.setDispatcher(soapDispatcher);
			break;
		case TRANSPORT:
			Dispatcher httpDispatcher = new HttpSessionDispatcher();
			synapseLBEP.setDispatcher(httpDispatcher);
			break;
		case CLIENT_ID:
			Dispatcher csDispatcher = new SimpleClientSessionDispatcher();
			synapseLBEP.setDispatcher(csDispatcher);
			break;
		}
		Long sessionTimeout=visualEndPoint.getSessionTimeout();
		if (sessionTimeout != null) {
				synapseLBEP.setSessionTimeout(sessionTimeout);
		}
		List<Endpoint> endPointsList = new ArrayList<Endpoint>();
		synapseLBEP.setChildren(endPointsList);
		synapseLBEP.setDefinition(synapseEPDef);
		if(endPoints!=null){
			endPoints.add(synapseLBEP);
		}

		if (!info.isEndPointFound) {
			info.isEndPointFound = true;
			info.firstEndPoint = visualEndPoint;
		}
		try {
			ArrayList<ComplexEndpointsOutputConnector> connectors = createAllEndpoints(visualEndPoint);

			for (ComplexEndpointsOutputConnector outputConnector : connectors) {
				if (outputConnector.getOutgoingLink() != null) {
					if (outputConnector.getOutgoingLink().getTarget() != null) {
						EsbNode esbNode = (EsbNode) outputConnector.getOutgoingLink().getTarget()
								.eContainer();
						EsbNodeTransformer transformer = EsbTransformerRegistry.getInstance()
								.getTransformer(esbNode);
						transformer.createSynapseObject(info, esbNode, endPointsList);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return synapseLBEP;
	}
	
	private ArrayList<ComplexEndpointsOutputConnector> createAllEndpoints(LoadBalanceEndPoint loadBalanceEndPoint) throws Exception{
		IEditorPart editorPart = null;
		IProject activeProject = null;
		ArrayList<ComplexEndpointsOutputConnector> outputConnectors= new ArrayList<ComplexEndpointsOutputConnector>();
		
		IEditorReference editorReferences[] = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getActivePage()
				.getEditorReferences();
		for (int i = 0; i < editorReferences.length; i++) {
			IEditorPart editor = editorReferences[i].getEditor(false);

			if (editor != null) {
				editorPart = editor.getSite().getWorkbenchWindow()
						.getActivePage().getActiveEditor();
			}

			if (editorPart != null) {
				IFileEditorInput input = (IFileEditorInput) editorPart
						.getEditorInput();
				IFile file = input.getFile();
				activeProject = file.getProject();
			}
		}	
		
		String name = (String) loadBalanceEndPoint.getName();
		IPath location = new Path("src/main/graphical-synapse-config/complex_endpoints" + "/" + "complex_endpoint_"
				+ name + ".esb_diagram");
		IFile file = activeProject.getFile(location);

		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = null;

		File f = new File(file.getLocationURI().getPath());
		URI uri = URI.createFileURI(f.getAbsolutePath());

		if (!f.exists()) {

		} else {

			resource = resourceSet.getResource(uri, true);
			
			EsbDiagram s = (EsbDiagram) ((org.eclipse.gmf.runtime.notation.impl.DiagramImpl) resource
					.getContents().get(0)).getElement();
			EList<EsbElement> children = s.getServer().getChildren();
			for (EsbElement esbElement : children) {
				if (esbElement instanceof ComplexEndpoints){
					outputConnectors.addAll(((ComplexEndpoints)esbElement).getOutputConnector()); 
				}
			}
		}		
		return outputConnectors;
	}

}
