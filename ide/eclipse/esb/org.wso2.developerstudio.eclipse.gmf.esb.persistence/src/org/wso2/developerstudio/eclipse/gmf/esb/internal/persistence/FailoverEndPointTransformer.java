package org.wso2.developerstudio.eclipse.gmf.esb.internal.persistence;

import java.util.ArrayList;
import java.util.List;

import org.apache.synapse.MessageContext;
import org.apache.synapse.SynapseArtifact;
import org.apache.synapse.core.SynapseEnvironment;
import org.apache.synapse.endpoints.AddressEndpoint;
import org.apache.synapse.endpoints.Endpoint;
import org.apache.synapse.endpoints.EndpointContext;
import org.apache.synapse.endpoints.EndpointDefinition;
import org.apache.synapse.endpoints.EndpointView;
import org.apache.synapse.endpoints.FailoverEndpoint;
import org.apache.synapse.mediators.base.SequenceMediator;
import org.apache.synapse.mediators.builtin.SendMediator;
import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EObject;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbNode;
import org.wso2.developerstudio.eclipse.gmf.esb.FailoverEndPoint;
import org.wso2.developerstudio.eclipse.gmf.esb.FailoverEndPointOutputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.InputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.SwitchCaseBranchOutputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.SwitchMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.persistence.EsbNodeTransformer;
import org.wso2.developerstudio.eclipse.gmf.esb.persistence.EsbTransformerRegistry;
import org.wso2.developerstudio.eclipse.gmf.esb.persistence.TransformationInfo;

public class FailoverEndPointTransformer extends AbstractEsbNodeTransformer{

	
	
	
	public void transform(TransformationInfo info, EsbNode subject)
			throws Exception {
		try{
		// TODO Auto-generated method stub
		Assert.isTrue(subject instanceof FailoverEndPoint, "Invalid subject.");
		FailoverEndPoint visualEndPoint = (FailoverEndPoint) subject;
		
		SendMediator sendMediator = new SendMediator();
		org.apache.synapse.endpoints.FailoverEndpoint synapseFailEP = new org.apache.synapse.endpoints.FailoverEndpoint();
		EndpointDefinition synapseEPDef = new EndpointDefinition();
		EndpointDefinition synapseEPDef2 = new EndpointDefinition();
		synapseEPDef2.setAddress("adrress1111........");
		EndpointDefinition synapseEPDef3 = new EndpointDefinition();
		synapseEPDef3.setAddress("adrress2222........");
		
		List<Endpoint>endPoints= new ArrayList<Endpoint>();
		//AddressEndpoint ad1=new AddressEndpoint();
		//ad1.setDefinition(synapseEPDef2);
		//AddressEndpoint ad2=new AddressEndpoint();
		//ad2.setDefinition(synapseEPDef3);
		//endPoints.add(ad1);
		//endPoints.add(ad2);
		synapseFailEP.setChildren(endPoints);
		
		//synapseFailEP.setDescription("Tha");
		//synapseFailEP.getChildren().add(((Endpoint)((FailoverEndPointOutputConnector)visualEndPoint.getOutputConnector().get(0)).getOutgoingLink().getTarget().eContainer()) );
		
		//InputConnector inputConnector = outgoingLink.getTarget();
		//Assert.isNotNull(inputConnector, "Input connector should not be null.");

		//EObject nextNode = inputConnector.eContainer();
		synapseFailEP.setDefinition(synapseEPDef);
		////synapseFailEP.setChildren(new ArrayList<Endpoint>());
		////synapseFailEP.getChildren().add(new E);
		
		sendMediator.setEndpoint(synapseFailEP);
		
		info.getParentSequence().addChild(sendMediator);
		
		if(!info.isEndPointFound){
			info.isEndPointFound=true;
			info.firstEndPoint=visualEndPoint;
		}		
		
		//visualEndPoint.get			
		
		//info.getParentSequence().addChild(synapseFailEP);
		for (FailoverEndPointOutputConnector outputConnector : visualEndPoint.getOutputConnector()) {
			if(outputConnector.getOutgoingLink()!=null){
				if(outputConnector.getOutgoingLink().getTarget()!=null){
			EsbNode esbNode=(EsbNode)outputConnector.getOutgoingLink().getTarget().eContainer();
			EsbNodeTransformer transformer = EsbTransformerRegistry.getInstance().getTransformer(esbNode);
			//Endpoint endPoint =(Endpoint)
			transformer.createSynapseObject(info,esbNode,endPoints);
			// transform(info, esbNode);
			//endPoints.add(endPoint);
			
			
		//doTransform(info, outputConnector);
			}
			}
		}
		
	}
	catch(Exception e){
		e.printStackTrace();
	}
		
	}

	public void createSynapseObject(TransformationInfo info, EObject subject,
			List<Endpoint> endPoints) {
		
		Assert.isTrue(subject instanceof FailoverEndPoint, "Invalid subject.");
		FailoverEndPoint visualEndPoint = (FailoverEndPoint) subject;
		
		org.apache.synapse.endpoints.FailoverEndpoint synapseFailEP = new org.apache.synapse.endpoints.FailoverEndpoint();
		EndpointDefinition synapseEPDef = new EndpointDefinition();
		
		List<Endpoint>endPointsList= new ArrayList<Endpoint>();
		synapseFailEP.setChildren(endPointsList);
		synapseFailEP.setDefinition(synapseEPDef);
		endPoints.add(synapseFailEP);
		
		if(!info.isEndPointFound){
			info.isEndPointFound=true;
			info.firstEndPoint=visualEndPoint;
		}
		
		for (FailoverEndPointOutputConnector outputConnector : visualEndPoint.getOutputConnector()) {
			if(outputConnector.getOutgoingLink()!=null){
				if(outputConnector.getOutgoingLink().getTarget()!=null){
			EsbNode esbNode=(EsbNode)outputConnector.getOutgoingLink().getTarget().eContainer();
			EsbNodeTransformer transformer = EsbTransformerRegistry.getInstance().getTransformer(esbNode);
			//Endpoint endPoint =(Endpoint)
			transformer.createSynapseObject(info,esbNode,endPointsList);
			// transform(info, esbNode);
			//endPoints.add(endPoint);
			
			
		//doTransform(info, outputConnector);
			}
			}
		}
		
	}

	

	public void transformWithinSequence(TransformationInfo information,
			EsbNode subject, SequenceMediator sequence) throws Exception {
		// TODO Auto-generated method stub
		
	}

	


}
