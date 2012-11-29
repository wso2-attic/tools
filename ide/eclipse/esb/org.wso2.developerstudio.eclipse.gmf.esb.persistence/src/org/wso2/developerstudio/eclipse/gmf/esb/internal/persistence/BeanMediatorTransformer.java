package org.wso2.developerstudio.eclipse.gmf.esb.internal.persistence;

import java.util.List;

import org.apache.synapse.endpoints.Endpoint;
import org.apache.synapse.mediators.base.SequenceMediator;
import org.apache.synapse.mediators.bean.BeanMediator.Action;
import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EObject;
import org.wso2.developerstudio.eclipse.gmf.esb.BAMMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.BeanMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbNode;
import org.wso2.developerstudio.eclipse.gmf.esb.persistence.TransformationInfo;

public class BeanMediatorTransformer extends AbstractEsbNodeTransformer{

	public void transform(TransformationInfo information, EsbNode subject) throws Exception {
		information.getParentSequence().addChild(
				createBeanMediator(subject, information));

		doTransform(information,
				((BeanMediator) subject).getOutputConnector());	
	}

	public void createSynapseObject(TransformationInfo info, EObject subject,
			List<Endpoint> endPoints) {
		
	}

	public void transformWithinSequence(TransformationInfo information, EsbNode subject,
			SequenceMediator sequence) throws Exception {
		sequence.addChild(createBeanMediator(subject, information));
		doTransformWithinSequence(information, ((BeanMediator) subject)
				.getOutputConnector().getOutgoingLink(), sequence);
	}
	
	private org.apache.synapse.mediators.bean.BeanMediator createBeanMediator(
			EsbNode subject, TransformationInfo information) throws Exception {

		/*
		 * Check subject.
		 */
		Assert.isTrue(subject instanceof BeanMediator, "Invalid subject.");
		BeanMediator visualBeanMediator = (BeanMediator) subject;

		org.apache.synapse.mediators.bean.BeanMediator beanMediator = new org.apache.synapse.mediators.bean.BeanMediator();

		
		return beanMediator;
	}

}
