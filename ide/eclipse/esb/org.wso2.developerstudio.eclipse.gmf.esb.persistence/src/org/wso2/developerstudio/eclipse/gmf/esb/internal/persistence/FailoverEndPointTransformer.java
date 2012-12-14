package org.wso2.developerstudio.eclipse.gmf.esb.internal.persistence;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.synapse.endpoints.DefaultEndpoint;
import org.apache.synapse.endpoints.Endpoint;
import org.apache.synapse.endpoints.EndpointDefinition;
import org.apache.synapse.endpoints.FailoverEndpoint;
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
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PlatformUI;
import org.wso2.developerstudio.eclipse.gmf.esb.ComplexEndpoints;
import org.wso2.developerstudio.eclipse.gmf.esb.ComplexEndpointsOutputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.DefaultEndPoint;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbDiagram;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbElement;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbNode;
import org.wso2.developerstudio.eclipse.gmf.esb.FailoverEndPoint;
import org.wso2.developerstudio.eclipse.gmf.esb.FailoverEndPointOutputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.Sequence;
import org.wso2.developerstudio.eclipse.gmf.esb.persistence.EsbNodeTransformer;
import org.wso2.developerstudio.eclipse.gmf.esb.persistence.EsbTransformerRegistry;
import org.wso2.developerstudio.eclipse.gmf.esb.persistence.TransformationInfo;

public class FailoverEndPointTransformer extends AbstractEndpointTransformer{

	public void transform(TransformationInfo info, EsbNode subject)
			throws Exception {
		try{
		Assert.isTrue(subject instanceof FailoverEndPoint, "Invalid subject.");
		FailoverEndPoint visualEndPoint = (FailoverEndPoint) subject;
		
		SendMediator sendMediator = null;
		if (info.getPreviouNode() instanceof org.wso2.developerstudio.eclipse.gmf.esb.SendMediator) {
			sendMediator = (SendMediator) info.getParentSequence().getList()
					.get(info.getParentSequence().getList().size() - 1);
		} else {
			sendMediator = new SendMediator();
			info.getParentSequence().addChild(sendMediator);
		}
/*		org.apache.synapse.endpoints.FailoverEndpoint synapseFailEP = new org.apache.synapse.endpoints.FailoverEndpoint();
		EndpointDefinition synapseEPDef = new EndpointDefinition();
		EndpointDefinition synapseEPDef2 = new EndpointDefinition();
		synapseEPDef2.setAddress("adrress1111........");
		EndpointDefinition synapseEPDef3 = new EndpointDefinition();
		synapseEPDef3.setAddress("adrress2222........");
		
		List<Endpoint>endPoints= new ArrayList<Endpoint>();
		synapseFailEP.setChildren(endPoints);
		synapseFailEP.setDefinition(synapseEPDef);*/
		
		//sendMediator.setEndpoint(synapseFailEP);
		//sendMediator.setEndpoint(create(info,visualEndPoint,null,null));
		
		if(visualEndPoint.isInLine()){
			info.getCurrentProxy().setTargetInLineEndpoint(create(info,visualEndPoint,null,null));
		}else{
			if(sendMediator !=null){
				sendMediator.setEndpoint(create(info,visualEndPoint,null,null));
			}
		}
		
		
		
/*		if(!info.isEndPointFound){
			info.isEndPointFound=true;
			info.firstEndPoint=visualEndPoint;
		}		
		
		
		ArrayList<ComplexEndpointsOutputConnector> connectors=createAllEndpoints(visualEndPoint);
		
		for (ComplexEndpointsOutputConnector outputConnector : connectors) {
			if(outputConnector.getOutgoingLink()!=null){
				if(outputConnector.getOutgoingLink().getTarget()!=null){
			EsbNode esbNode=(EsbNode)outputConnector.getOutgoingLink().getTarget().eContainer();
			EsbNodeTransformer transformer = EsbTransformerRegistry.getInstance().getTransformer(esbNode);
			transformer.createSynapseObject(info,esbNode,endPoints);
						
			}
			}
		}*/
		
	}
	catch(Exception e){
		e.printStackTrace();
	}
		
	}

	public void createSynapseObject(TransformationInfo info, EObject subject,
			List<Endpoint> endPoints) {
		
		//try{
		Assert.isTrue(subject instanceof FailoverEndPoint, "Invalid subject.");
		FailoverEndPoint visualEndPoint = (FailoverEndPoint) subject;
		create(info, visualEndPoint, null,endPoints);
		
/*		org.apache.synapse.endpoints.FailoverEndpoint synapseFailEP = new org.apache.synapse.endpoints.FailoverEndpoint();
		EndpointDefinition synapseEPDef = new EndpointDefinition();
		
		List<Endpoint>endPointsList= new ArrayList<Endpoint>();
		synapseFailEP.setChildren(endPointsList);
		synapseFailEP.setDefinition(synapseEPDef);
		endPoints.add(synapseFailEP);
		
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
		}*/
/*		}
		catch(Exception e){
			e.printStackTrace();
		}	*/	
	}

	public void transformWithinSequence(TransformationInfo information,
			EsbNode subject, SequenceMediator sequence) throws Exception {
		
	}
	
	public FailoverEndpoint create(TransformationInfo info, FailoverEndPoint visualEndPoint,
			String name,List<Endpoint> endPoints) {
		FailoverEndpoint synapseFailEP = new FailoverEndpoint();
		if (name != null) {
			synapseFailEP.setName(name);
		}
		EndpointDefinition synapseEPDef = new EndpointDefinition();
		List<Endpoint> endPointsList = new ArrayList<Endpoint>();
		synapseFailEP.setChildren(endPointsList);
		synapseFailEP.setDefinition(synapseEPDef);
		if(endPoints!=null){
			endPoints.add(synapseFailEP);
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
		return synapseFailEP;
	}
	
	private ArrayList<ComplexEndpointsOutputConnector> createAllEndpoints(FailoverEndPoint failoverEndPoint) throws Exception{
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
		
		String name = (String) failoverEndPoint.getName();
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
