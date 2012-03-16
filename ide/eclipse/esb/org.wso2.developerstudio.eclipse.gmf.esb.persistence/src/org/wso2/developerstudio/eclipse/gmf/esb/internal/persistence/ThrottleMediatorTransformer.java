package org.wso2.developerstudio.eclipse.gmf.esb.internal.persistence;

import java.util.List;

import org.apache.synapse.endpoints.Endpoint;
import org.apache.synapse.mediators.base.SequenceMediator;
import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EObject;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbNode;
import org.wso2.developerstudio.eclipse.gmf.esb.PropertyMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.ThrottleMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.persistence.TransformationInfo;

public class ThrottleMediatorTransformer extends AbstractEsbNodeTransformer  {

	public void transform(TransformationInfo information, EsbNode subject)
			throws Exception {
		// TODO Auto-generated method stub
		information.getParentSequence().addChild(createThrottleMediator(subject));
		// Transform the property mediator output data flow path.
		doTransform(information,
				((ThrottleMediator) subject).getOutputConnector());
		
	}

	public void createSynapseObject(TransformationInfo info, EObject subject,
			List<Endpoint> endPoints) {
		// TODO Auto-generated method stub
		
	}

	public void transformWithinSequence(TransformationInfo information,
			EsbNode subject, SequenceMediator sequence) throws Exception {
		// TODO Auto-generated method stub
		sequence.addChild(createThrottleMediator(subject));
		doTransformWithinSequence(information,((ThrottleMediator) subject).getOutputConnector().getOutgoingLink(),sequence);
		
		
	}
	

	private org.apache.synapse.mediators.throttle.ThrottleMediator createThrottleMediator(EsbNode subject) throws Exception{
		// Check subject.
		Assert.isTrue(subject instanceof ThrottleMediator, "Invalid subject.");
		ThrottleMediator visualThrottle = (ThrottleMediator) subject;

		// Configure property mediator.
		org.apache.synapse.mediators.throttle.ThrottleMediator throttleMediator = new org.apache.synapse.mediators.throttle.ThrottleMediator();
		{
			throttleMediator.setId(visualThrottle.getGroupId());
		}
		return throttleMediator;
	}

}
