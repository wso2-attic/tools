package org.wso2.developerstudio.eclipse.gmf.esb.internal.persistence;

import java.util.ArrayList;
import java.util.List;

import org.apache.synapse.endpoints.Endpoint;
import org.apache.synapse.endpoints.EndpointDefinition;
import org.apache.synapse.endpoints.algorithms.RoundRobin;
import org.apache.synapse.mediators.base.SequenceMediator;
import org.apache.synapse.mediators.builtin.SendMediator;
import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EObject;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbNode;
import org.wso2.developerstudio.eclipse.gmf.esb.LoadBalanceEndPoint;
import org.wso2.developerstudio.eclipse.gmf.esb.LoadBalanceEndPointOutputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.persistence.EsbNodeTransformer;
import org.wso2.developerstudio.eclipse.gmf.esb.persistence.EsbTransformerRegistry;
import org.wso2.developerstudio.eclipse.gmf.esb.persistence.TransformationInfo;

public class LoadBalanceEndPointTransformer extends AbstractEsbNodeTransformer{

	public void transform(TransformationInfo information, EsbNode subject)
			throws Exception {
		Assert.isTrue(subject instanceof LoadBalanceEndPoint, "Invalid subject.");
		LoadBalanceEndPoint visualEndPoint = (LoadBalanceEndPoint) subject;
		
		
		SendMediator sendMediator = null;
		if (information.getPreviouNode() instanceof org.wso2.developerstudio.eclipse.gmf.esb.SendMediator) {
			sendMediator = (SendMediator) information.getParentSequence().getList()
					.get(information.getParentSequence().getList().size() - 1);
		} else {
			sendMediator = new SendMediator();			
		}
		org.apache.synapse.endpoints.LoadbalanceEndpoint synapseLoadEP = new org.apache.synapse.endpoints.LoadbalanceEndpoint();
		EndpointDefinition synapseEPDef = new EndpointDefinition();
		
		//We should give this LoadbalanceAlgorithm class at runtime.User should be requested to give a class.
		
		synapseLoadEP.setAlgorithm(new RoundRobin());
		
		
		List<Endpoint>endPoints= new ArrayList<Endpoint>();
		
		synapseLoadEP.setChildren(endPoints);
		
		synapseLoadEP.setDefinition(synapseEPDef);
		////synapseFailEP.setChildren(new ArrayList<Endpoint>());
		////synapseFailEP.getChildren().add(new E);
		
		sendMediator.setEndpoint(synapseLoadEP);
		information.getParentSequence().addChild(sendMediator);
		
		if(!information.isEndPointFound){
			information.isEndPointFound=true;
			information.firstEndPoint=visualEndPoint;
		}
		
		for (LoadBalanceEndPointOutputConnector outputConnector : visualEndPoint.getOutputConnector()) {
			if(outputConnector.getOutgoingLink()!=null){
				if(outputConnector.getOutgoingLink().getTarget()!=null){
			EsbNode esbNode=(EsbNode)outputConnector.getOutgoingLink().getTarget().eContainer();
			EsbNodeTransformer transformer = EsbTransformerRegistry.getInstance().getTransformer(esbNode);
			//Endpoint endPoint =(Endpoint)
			transformer.createSynapseObject(information,esbNode,endPoints);
			// transform(info, esbNode);
			//endPoints.add(endPoint);
			
			
		//doTransform(info, outputConnector);
			}
			}
		}
		
		
		
		
		// TODO Auto-generated method stub
		
	}

	public void createSynapseObject(TransformationInfo info, EObject subject,
			List<Endpoint> endPoints) {
		Assert.isTrue(subject instanceof LoadBalanceEndPoint, "Invalid subject.");
		LoadBalanceEndPoint visualEndPoint = (LoadBalanceEndPoint) subject;
		
		org.apache.synapse.endpoints.LoadbalanceEndpoint synapseLoadEP = new org.apache.synapse.endpoints.LoadbalanceEndpoint();
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
		
		for (LoadBalanceEndPointOutputConnector outputConnector : visualEndPoint.getOutputConnector()) {
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
