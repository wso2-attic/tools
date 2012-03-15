package org.wso2.carbonstudio.eclipse.gmf.esb.internal.persistence;

import java.util.List;

import org.apache.synapse.endpoints.Endpoint;
import org.apache.synapse.mediators.base.SequenceMediator;
import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EObject;
import org.wso2.carbonstudio.eclipse.gmf.esb.EsbNode;
import org.wso2.carbonstudio.eclipse.gmf.esb.EventMediator;
import org.wso2.carbonstudio.eclipse.gmf.esb.persistence.TransformationInfo;

public class EventMediatorTransformer extends AbstractEsbNodeTransformer  {

	public void transform(TransformationInfo information, EsbNode subject)
			throws Exception {
		information.getParentSequence().addChild(createEventMediator(information,subject));
		// Transform the Event mediator output data flow path.
		doTransform(information,
				((EventMediator) subject).getOutputConnector());	
		
	}

	public void createSynapseObject(TransformationInfo info, EObject subject,
			List<Endpoint> endPoints) {
		// TODO Auto-generated method stub
		
	}


	public void transformWithinSequence(TransformationInfo information,
			EsbNode subject, SequenceMediator sequence) throws Exception {
		// TODO Auto-generated method stub
		sequence.addChild(createEventMediator(information,subject));
		doTransformWithinSequence(information,((EventMediator) subject).getOutputConnector().getOutgoingLink(),sequence);	
		
	}
	
	private org.wso2.carbon.mediator.event.EventMediator createEventMediator(TransformationInfo information,EsbNode subject) throws Exception{
		// Check subject.
		Assert.isTrue(subject instanceof EventMediator, "Invalid subject.");
		EventMediator visualEvent = (EventMediator) subject;
		
		org.wso2.carbon.mediator.event.EventMediator eventMediator=new org.wso2.carbon.mediator.event.EventMediator();
		{
			
		}
		return eventMediator;
	}



}
