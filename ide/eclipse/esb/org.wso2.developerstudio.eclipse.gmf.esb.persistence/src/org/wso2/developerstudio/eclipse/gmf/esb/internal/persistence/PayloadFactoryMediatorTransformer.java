package org.wso2.developerstudio.eclipse.gmf.esb.internal.persistence;

import java.util.List;

import org.apache.synapse.endpoints.Endpoint;
import org.apache.synapse.mediators.base.SequenceMediator;
import org.eclipse.emf.ecore.EObject;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbNode;
import org.wso2.developerstudio.eclipse.gmf.esb.PayloadFactoryMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.persistence.TransformationInfo;

public class PayloadFactoryMediatorTransformer extends AbstractEsbNodeTransformer{

	public void transform(TransformationInfo information, EsbNode subject)
			throws Exception {
		information.getParentSequence().addChild(createPayloadFactoryMediator(subject));
		// Transform the property mediator output data flow path.
		doTransform(information,
				((PayloadFactoryMediator) subject).getOutputConnector());
		
	}

	public void createSynapseObject(TransformationInfo info, EObject subject,
			List<Endpoint> endPoints) {
		// TODO Auto-generated method stub
		
	}

	public void transformWithinSequence(TransformationInfo information,
			EsbNode subject, SequenceMediator sequence) throws Exception {
		sequence.addChild(createPayloadFactoryMediator(subject));
		doTransformWithinSequence(information,((PayloadFactoryMediator)subject).getOutputConnector().getOutgoingLink(),sequence);
		
	}
	
	private org.apache.synapse.mediators.transform.PayloadFactoryMediator createPayloadFactoryMediator(EsbNode subject) throws Exception{
		org.apache.synapse.mediators.transform.PayloadFactoryMediator payloadFactoryMediator = new org.apache.synapse.mediators.transform.PayloadFactoryMediator();
		return payloadFactoryMediator;
	}

}
