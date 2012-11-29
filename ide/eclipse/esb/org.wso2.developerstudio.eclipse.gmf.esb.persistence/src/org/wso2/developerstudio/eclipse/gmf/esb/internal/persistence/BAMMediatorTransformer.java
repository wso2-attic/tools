package org.wso2.developerstudio.eclipse.gmf.esb.internal.persistence;

import java.util.List;

import org.apache.synapse.endpoints.Endpoint;
import org.apache.synapse.mediators.base.SequenceMediator;
import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EObject;
import org.wso2.developerstudio.eclipse.gmf.esb.BAMMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.BuilderMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbNode;
import org.wso2.developerstudio.eclipse.gmf.esb.internal.persistence.custom.BuilderMediatorExt;
import org.wso2.developerstudio.eclipse.gmf.esb.persistence.TransformationInfo;

public class BAMMediatorTransformer extends AbstractEsbNodeTransformer{

	public void transform(TransformationInfo information, EsbNode subject) throws Exception {
		information.getParentSequence().addChild(
				createBAMMediator(subject, information));

		doTransform(information,
				((BAMMediator) subject).getOutputConnector());	
	}

	public void createSynapseObject(TransformationInfo info, EObject subject,
			List<Endpoint> endPoints) {	
	}

	public void transformWithinSequence(TransformationInfo information, EsbNode subject,
			SequenceMediator sequence) throws Exception {
		sequence.addChild(createBAMMediator(subject, information));
		doTransformWithinSequence(information, ((BAMMediator) subject)
				.getOutputConnector().getOutgoingLink(), sequence);
		
	}
	
	private org.wso2.carbon.mediator.bam.BamMediator createBAMMediator(
			EsbNode subject, TransformationInfo information) throws Exception {

		/*
		 * Check subject.
		 */
		Assert.isTrue(subject instanceof BAMMediator, "Invalid subject.");
		BAMMediator visualBAMMediator = (BAMMediator) subject;

		org.wso2.carbon.mediator.bam.BamMediator bamMediator = new org.wso2.carbon.mediator.bam.BamMediator();
		
		bamMediator.setServerProfile(visualBAMMediator.getServerProfile());
		bamMediator.getStream().setStreamName(visualBAMMediator.getStreamName());
		bamMediator.getStream().setStreamVersion(visualBAMMediator.getStreamVersion());

		return bamMediator;
	}
}
