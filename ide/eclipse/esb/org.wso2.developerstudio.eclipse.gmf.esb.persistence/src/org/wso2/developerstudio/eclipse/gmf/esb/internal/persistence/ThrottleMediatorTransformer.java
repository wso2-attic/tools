package org.wso2.developerstudio.eclipse.gmf.esb.internal.persistence;

import java.util.List;

import javax.xml.namespace.QName;

import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.impl.llom.OMElementImpl;
import org.apache.axiom.om.util.AXIOMUtil;
import org.apache.synapse.endpoints.Endpoint;
import org.apache.synapse.mediators.base.SequenceMediator;
import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EObject;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbNode;
import org.wso2.developerstudio.eclipse.gmf.esb.ThrottleMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.persistence.TransformationInfo;

public class ThrottleMediatorTransformer extends AbstractEsbNodeTransformer  {

	public void transform(TransformationInfo information, EsbNode subject)
			throws Exception {
		information.getParentSequence().addChild(createThrottleMediator(subject,information));		
		/*
		 *  Transform the Throttle mediator output data flow path.
		 */
		doTransform(information,
				((ThrottleMediator) subject).getOutputConnector());
		
	}

	public void createSynapseObject(TransformationInfo info, EObject subject,
			List<Endpoint> endPoints) {
		
	}

	public void transformWithinSequence(TransformationInfo information,
			EsbNode subject, SequenceMediator sequence) throws Exception {
		sequence.addChild(createThrottleMediator(subject,information));
		doTransformWithinSequence(information,((ThrottleMediator) subject).getOutputConnector().getOutgoingLink(),sequence);	
		
	}
	

	private org.apache.synapse.mediators.throttle.ThrottleMediator createThrottleMediator(EsbNode subject,TransformationInfo information) throws Exception{
		/*
		 *  Check subject.
		 */
		Assert.isTrue(subject instanceof ThrottleMediator, "Invalid subject.");
		ThrottleMediator visualThrottle = (ThrottleMediator) subject;
		/*
		 *  Configure property mediator.
		 */
		org.apache.synapse.mediators.throttle.ThrottleMediator throttleMediator = new org.apache.synapse.mediators.throttle.ThrottleMediator();
		{
			throttleMediator.setId(visualThrottle.getGroupId());
			OMElement policy =  AXIOMUtil.stringToOM("<wsp:Policy"+" xmlns:wsp="+"\"http://schemas.xmlsoap.org/ws/2004/09/policy\""+" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\""+" wsu:Id=\"WSO2MediatorThrottlingPolicy\">"
                +"<throttle:MediatorThrottleAssertion xmlns:throttle=\"http://www.wso2.org/products/wso2commons/throttle\"/>"
            +"</wsp:Policy>");
			throttleMediator.setInLinePolicy(policy);
		}		
		
		/*
		 *  Transform onAccept output data flow path.
		 */
		SequenceMediator onAccept = new SequenceMediator();
		throttleMediator.setOnAcceptMediator(onAccept);
		TransformationInfo newOnAcceptInfo = new TransformationInfo();
		newOnAcceptInfo.setTraversalDirection(TransformationInfo.TRAVERSAL_DIRECTION_IN);
		newOnAcceptInfo.setSynapseConfiguration(information.getSynapseConfiguration());
		newOnAcceptInfo.setOriginInSequence(information.getOriginInSequence());
		newOnAcceptInfo.setOriginOutSequence(information.getOriginOutSequence());
		newOnAcceptInfo.setParentSequence(onAccept);	
		doTransform(newOnAcceptInfo, visualThrottle.getOnAcceptOutputConnector());
		//doTransformWithinSequence(newThenInfo,((FilterMediator) subject).getPassOutputConnector().getOutgoingLink(),sequence);
		
		/*
		 *  Transform onReject output data flow path.
		 */
		SequenceMediator onReject = new SequenceMediator();
		throttleMediator.setOnRejectMediator(onReject);
		TransformationInfo newOnRejectInfo = new TransformationInfo();
		newOnRejectInfo.setTraversalDirection(TransformationInfo.TRAVERSAL_DIRECTION_IN);
		newOnRejectInfo.setSynapseConfiguration(information.getSynapseConfiguration());
		newOnRejectInfo.setOriginInSequence(information.getOriginInSequence());
		newOnRejectInfo.setOriginOutSequence(information.getOriginOutSequence());
		newOnRejectInfo.setParentSequence(onReject);
		doTransform(newOnRejectInfo, visualThrottle.getOnRejectOutputConnector());
		//doTransformWithinSequence(newThenInfo,((FilterMediator) subject).getFailOutputConnector().getOutgoingLink(),sequence);
		
		return throttleMediator;
	}

}
