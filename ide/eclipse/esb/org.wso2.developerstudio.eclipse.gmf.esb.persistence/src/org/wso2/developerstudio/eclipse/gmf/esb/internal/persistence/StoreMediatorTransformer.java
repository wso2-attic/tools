package org.wso2.developerstudio.eclipse.gmf.esb.internal.persistence;

import java.util.List;

import org.apache.synapse.endpoints.Endpoint;
import org.apache.synapse.mediators.base.SequenceMediator;
import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EObject;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbNode;
import org.wso2.developerstudio.eclipse.gmf.esb.StoreMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.persistence.TransformationInfo;

public class StoreMediatorTransformer extends AbstractEsbNodeTransformer {

	public void transform(TransformationInfo information, EsbNode subject)
			throws Exception {
		information.getParentSequence().addChild(createStoreMediator(subject));
		// Transform the property mediator output data flow path.
		doTransform(information,
				((StoreMediator) subject).getOutputConnector());
		
	}

	public void createSynapseObject(TransformationInfo info, EObject subject,
			List<Endpoint> endPoints) {
		// TODO Auto-generated method stub
		
	}

	public void transformWithinSequence(TransformationInfo information,
			EsbNode subject, SequenceMediator sequence) throws Exception {
		sequence.addChild(createStoreMediator(subject));
		doTransformWithinSequence(information,((StoreMediator)subject).getOutputConnector().getOutgoingLink(),sequence);
		
	}
	
	private org.apache.synapse.mediators.store.MessageStoreMediator createStoreMediator(EsbNode subject) throws Exception{
		Assert.isTrue(subject instanceof StoreMediator, "Invalid subject.");
		StoreMediator visualStore = (StoreMediator)subject;
		org.apache.synapse.mediators.store.MessageStoreMediator storeMediator=new org.apache.synapse.mediators.store.MessageStoreMediator();
		storeMediator.setMessageStoreName(visualStore.getMessageStore());
		return storeMediator;
	}

}
