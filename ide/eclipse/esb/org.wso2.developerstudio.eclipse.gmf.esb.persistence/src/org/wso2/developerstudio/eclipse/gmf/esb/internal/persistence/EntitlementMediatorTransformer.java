package org.wso2.developerstudio.eclipse.gmf.esb.internal.persistence;

import java.util.List;

import org.apache.synapse.endpoints.Endpoint;
import org.apache.synapse.mediators.base.SequenceMediator;
import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EObject;
import org.wso2.developerstudio.eclipse.gmf.esb.EntitlementMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbNode;
import org.wso2.developerstudio.eclipse.gmf.esb.persistence.TransformationInfo;

public class EntitlementMediatorTransformer extends AbstractEsbNodeTransformer{

	public void transform(TransformationInfo information, EsbNode subject)
			throws Exception {
		information.getParentSequence().addChild(createEntitlementMediator(information,subject));
		/*
		 *  Transform the Entitlement mediator output data flow path.
		 */
		doTransform(information,
				((EntitlementMediator) subject).getOutputConnector());	
		
	}

	public void createSynapseObject(TransformationInfo info, EObject subject,
			List<Endpoint> endPoints) {
		
	}

	public void transformWithinSequence(TransformationInfo information,
			EsbNode subject, SequenceMediator sequence) throws Exception {
		sequence.addChild(createEntitlementMediator(information,subject));
		doTransformWithinSequence(information,((EntitlementMediator) subject).getOutputConnector().getOutgoingLink(),sequence);			
	}
	
	private org.wso2.carbon.identity.entitlement.mediator.EntitlementMediator createEntitlementMediator(TransformationInfo information,EsbNode subject) throws Exception{
		/*
		 *  Check subject.
		 */
		Assert.isTrue(subject instanceof EntitlementMediator, "Invalid subject.");
		EntitlementMediator visualEntitlement = (EntitlementMediator) subject;
		org.wso2.carbon.identity.entitlement.mediator.EntitlementMediator entitlementMediator=new org.wso2.carbon.identity.entitlement.mediator.EntitlementMediator();
		{			
			entitlementMediator.setRemoteServiceUrl(visualEntitlement.getServerURL());
			entitlementMediator.setRemoteServiceUserName(visualEntitlement.getUsername());
			entitlementMediator.setRemoteServicePassword(visualEntitlement.getPassword());
		}
		return entitlementMediator;
	}
}
