package org.wso2.developerstudio.eclipse.gmf.esb.internal.persistence;

import java.util.List;

import org.apache.synapse.endpoints.Endpoint;
import org.apache.synapse.mediators.ListMediator;
import org.apache.synapse.mediators.Value;
import org.apache.synapse.mediators.base.SequenceMediator;
import org.apache.synapse.util.xpath.SynapseXPath;
import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EObject;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbNode;
import org.wso2.developerstudio.eclipse.gmf.esb.SendMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.persistence.TransformationInfo;

public class SendMediatorTransformer extends AbstractEsbNodeTransformer {

	public void transform(TransformationInfo information, EsbNode subject)
			throws Exception {		
		information.getParentSequence().addChild(createSendMediator(subject));
		
		TransformationInfo tmpInformation=new TransformationInfo();
		tmpInformation.setParentSequence(information.getParentSequence());
		tmpInformation.setTraversalDirection(information.getTraversalDirection());
		tmpInformation.setOriginInSequence(information.getOriginInSequence());
		tmpInformation.setOriginOutSequence(information.getOriginOutSequence());
		tmpInformation.setPreviousNode(information.getPreviouNode());
		tmpInformation.setSynapseConfiguration(information.getSynapseConfiguration());
		doTransform(tmpInformation,
					((SendMediator) subject).getEndpointOutputConnector());
		
		doTransform(information,
				((SendMediator) subject).getOutputConnector());
		
	}

	public void createSynapseObject(TransformationInfo info, EObject subject,
			List<Endpoint> endPoints) {
		// TODO Auto-generated method stub
		
	}

	public void transformWithinSequence(TransformationInfo information,
			EsbNode subject, SequenceMediator sequence) throws Exception {
		// TODO Auto-generated method stub
		sequence.addChild(createSendMediator(subject));
		doTransformWithinSequence(information,((SendMediator) subject).getOutputConnector().getOutgoingLink(),sequence);
		
		
	}
	
	private org.apache.synapse.mediators.builtin.SendMediator createSendMediator(EsbNode subject) throws Exception{
		// Check subject.
		Assert.isTrue(subject instanceof SendMediator, "Invalid subject.");
		SendMediator visualSend = (SendMediator) subject;

		// Configure property mediator.
		org.apache.synapse.mediators.builtin.SendMediator sendMediator = new org.apache.synapse.mediators.builtin.SendMediator();
		{			
			if(visualSend.getReceivingSequenceType().getLiteral().equals("Static")){
			Value receivingSequence = new Value(visualSend.getStaticReceivingSequence().getKeyValue());
			sendMediator.setReceivingSequence(receivingSequence);
			}			
			if(visualSend.getReceivingSequenceType().getLiteral().equals("Dynamic")){
			SynapseXPath expression=new SynapseXPath(visualSend.getDynamicReceivingSequence().getPropertyValue());	
			Value receivingSequence = new Value(expression);
			sendMediator.setReceivingSequence(receivingSequence);
			}		
		
		}
		return sendMediator;
	}

}
