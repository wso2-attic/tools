package org.wso2.developerstudio.eclipse.gmf.esb.internal.persistence;

import java.util.List;

import org.apache.synapse.endpoints.Endpoint;
import org.apache.synapse.endpoints.IndirectEndpoint;
import org.apache.synapse.mediators.base.SequenceMediator;
import org.apache.synapse.mediators.builtin.SendMediator;
import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EObject;
import org.wso2.developerstudio.eclipse.gmf.esb.EndPoint;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbNode;
import org.wso2.developerstudio.eclipse.gmf.esb.NamedEndpoint;
import org.wso2.developerstudio.eclipse.gmf.esb.Sequence;
import org.wso2.developerstudio.eclipse.gmf.esb.SequenceInputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.persistence.TransformationInfo;

public class NamedEndPointTransformer extends AbstractEsbNodeTransformer{

	public void transform(TransformationInfo information, EsbNode subject)
			throws Exception {
		// Check subject.
		Assert.isTrue(subject instanceof NamedEndpoint, "Invalid subject.");
		NamedEndpoint visualEndPoint = (NamedEndpoint) subject;
		
		SendMediator sendMediator = null;
		if (information.getPreviouNode() instanceof org.wso2.developerstudio.eclipse.gmf.esb.SendMediator) {
			sendMediator = (SendMediator) information.getParentSequence().getList()
			.get(information.getParentSequence().getList().size() - 1);
		}else if(information.getPreviouNode() instanceof org.wso2.developerstudio.eclipse.gmf.esb.Sequence){			
			sendMediator=null;
		}else {
			sendMediator = new SendMediator();
			information.getParentSequence().addChild(sendMediator);
		}
		if(sendMediator !=null){
			sendMediator.setEndpoint(create(visualEndPoint,null));	
		}
		
		if(visualEndPoint.getOutputConnector().getOutgoingLink() !=null){
			if((!(visualEndPoint.getOutputConnector().getOutgoingLink().getTarget() instanceof SequenceInputConnector))||
					(!(((Sequence)visualEndPoint.getOutputConnector().getOutgoingLink().getTarget().eContainer()).getOutputConnector().getOutgoingLink().getTarget().eContainer() instanceof EndPoint))){
			information.setParentSequence(information.getOriginOutSequence());
			information.setTraversalDirection(TransformationInfo.TRAVERSAL_DIRECTION_OUT);
			}else if(visualEndPoint.getInputConnector().getIncomingLinks().get(0).getSource().eContainer() instanceof Sequence){
				information.setParentSequence(information.getCurrentReferredSequence());
			}
			}

			if(!information.isEndPointFound){
				information.isEndPointFound=true;
				information.firstEndPoint=visualEndPoint;
			}
		
		
		doTransform(information, visualEndPoint.getOutputConnector());
		
	}

	public void createSynapseObject(TransformationInfo info, EObject subject,
			List<Endpoint> endPoints) {
		// TODO Auto-generated method stub
		
	}

	public void transformWithinSequence(TransformationInfo information,
			EsbNode subject, SequenceMediator sequence) throws Exception {
		
		Assert.isTrue(subject instanceof NamedEndpoint, "Invalid subject");
		NamedEndpoint visualEndPoint = (NamedEndpoint) subject;
		
		SendMediator sendMediator = null;
		if (sequence.getList().get(sequence.getList().size()-1) instanceof SendMediator) {			
			sendMediator = (SendMediator)sequence.getList().get(sequence.getList().size()-1);
		} else {
			sendMediator = new SendMediator();
			sequence.addChild(sendMediator);
		}		
		sendMediator.setEndpoint(create(visualEndPoint,null));
		
	}
	
	public IndirectEndpoint create(NamedEndpoint visualEndPoint,String name){
		IndirectEndpoint endpoint=new IndirectEndpoint();
		endpoint.setKey(visualEndPoint.getName());
		return endpoint;
	}

}
