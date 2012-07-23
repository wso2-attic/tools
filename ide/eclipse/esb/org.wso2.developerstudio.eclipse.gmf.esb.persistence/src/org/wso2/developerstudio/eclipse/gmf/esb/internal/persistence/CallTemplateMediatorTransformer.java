package org.wso2.developerstudio.eclipse.gmf.esb.internal.persistence;

import java.util.List;

import org.apache.synapse.endpoints.Endpoint;
import org.apache.synapse.mediators.base.SequenceMediator;
import org.eclipse.emf.ecore.EObject;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbNode;
import org.wso2.developerstudio.eclipse.gmf.esb.persistence.TransformationInfo;

public class CallTemplateMediatorTransformer extends AbstractEsbNodeTransformer{

	public void transform(TransformationInfo information, EsbNode subject)
			throws Exception {
		
		/**
		 * This code snippet for check the EMF model update state only
		 *  this will be useful when implementing the actual transformation logic.
		 */
		/*Assert.isTrue(subject instanceof CallTemplateMediator, "Invalid subject.");
		CallTemplateMediator visuaCallTemplate = (CallTemplateMediator) subject;
		
		for(CallTemplateParameter param :visuaCallTemplate.getTemplateParameters()){
			
			System.out.println(param.getParameterName());
			
			if(param.getTemplateParameterType().equals(RuleOptionType.VALUE)){
				
				System.out.println(param.getTemplateParameterType().getLiteral());
				System.out.println(param.getParameterValue());
			}
			
			if(param.getTemplateParameterType().equals(RuleOptionType.EXPRESSION)){
				
				System.out.println(param.getTemplateParameterType().getLiteral());
				System.out.println(param.getParameterExpression());
			}
		}*/
		
	}

	public void createSynapseObject(TransformationInfo info, EObject subject,
			List<Endpoint> endPoints) {
		// TODO Auto-generated method stub
		
	}

	public void transformWithinSequence(TransformationInfo information,
			EsbNode subject, SequenceMediator sequence) throws Exception {
		// TODO Auto-generated method stub
		
		
	}

}
