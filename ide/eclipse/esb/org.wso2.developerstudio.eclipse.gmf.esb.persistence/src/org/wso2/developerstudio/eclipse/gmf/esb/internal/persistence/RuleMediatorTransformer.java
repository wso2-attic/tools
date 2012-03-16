package org.wso2.developerstudio.eclipse.gmf.esb.internal.persistence;

import java.util.List;

import org.apache.synapse.endpoints.Endpoint;
import org.apache.synapse.mediators.base.SequenceMediator;
import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EObject;
import org.wso2.carbon.rulecep.commons.descriptions.rule.mediator.RuleMediatorDescription;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbNode;
import org.wso2.developerstudio.eclipse.gmf.esb.OAuthMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.RuleMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.ThrottleMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.persistence.TransformationInfo;

public class RuleMediatorTransformer extends AbstractEsbNodeTransformer {

	public void transform(TransformationInfo information, EsbNode subject)
			throws Exception {
		// TODO Auto-generated method stub
		information.getParentSequence().addChild(createRuleMediator(subject));
		// Transform the Rule mediator output data flow path.
		doTransform(information,
				((RuleMediator) subject).getOutputConnector());

		
	}

	public void createSynapseObject(TransformationInfo info, EObject subject,
			List<Endpoint> endPoints) {
		// TODO Auto-generated method stub
		
	}

	public void transformWithinSequence(TransformationInfo information,
			EsbNode subject, SequenceMediator sequence) throws Exception {
		// TODO Auto-generated method stub
		sequence.addChild(createRuleMediator(subject));
		doTransformWithinSequence(information,((RuleMediator) subject).getOutputConnector().getOutgoingLink(),sequence);
		
		
	}
	
	private org.wso2.carbon.rule.mediator.RuleMediator createRuleMediator(EsbNode subject) throws Exception{
		// Check subject.
		Assert.isTrue(subject instanceof RuleMediator, "Invalid subject.");
		RuleMediator visualOauth = (RuleMediator) subject;

		
		RuleMediatorDescription description=new RuleMediatorDescription();
		// Configure property mediator.
		org.wso2.carbon.rule.mediator.RuleMediator RuleMediator = new org.wso2.carbon.rule.mediator.RuleMediator(description);
		{
			
		}
		return RuleMediator;
	}


}
