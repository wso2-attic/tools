package org.wso2.carbonstudio.eclipse.gmf.esb.internal.persistence;

import java.util.List;

import org.apache.axiom.om.util.DigestGenerator;
import org.apache.synapse.endpoints.Endpoint;
import org.apache.synapse.mediators.base.SequenceMediator;
import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EObject;
import org.wso2.carbonstudio.eclipse.gmf.esb.CacheMediator;
import org.wso2.carbonstudio.eclipse.gmf.esb.EsbNode;
import org.wso2.carbonstudio.eclipse.gmf.esb.persistence.TransformationInfo;

public class CacheMediatorTransformer extends AbstractEsbNodeTransformer {

	public void transform(TransformationInfo information, EsbNode subject)
			throws Exception {
		// TODO Auto-generated method stub
		information.getParentSequence().addChild(createCacheMediator(subject));
		// Transform the Cache mediator output data flow path.
		doTransform(information,
				((CacheMediator) subject).getOutputConnector());
		
	}

	public void createSynapseObject(TransformationInfo info, EObject subject,
			List<Endpoint> endPoints) {
		// TODO Auto-generated method stub
		
	}

	public void transformWithinSequence(TransformationInfo information,
			EsbNode subject, SequenceMediator sequence) throws Exception {
		// TODO Auto-generated method stub
		sequence.addChild(createCacheMediator(subject));
		doTransformWithinSequence(information,((CacheMediator) subject).getOutputConnector().getOutgoingLink(),sequence);
		
	}
	
	private org.apache.synapse.mediators.builtin.CacheMediator createCacheMediator(EsbNode subject) throws Exception{
		// Check subject.
		Assert.isTrue(subject instanceof CacheMediator, "Invalid subject.");
		CacheMediator visualCache = (CacheMediator) subject;

		// Configure Cache mediator.
		org.apache.synapse.mediators.builtin.CacheMediator cacheMediator = new org.apache.synapse.mediators.builtin.CacheMediator();
		{		
			cacheMediator.setId(visualCache.getCacheId());
			cacheMediator.setTimeout(visualCache.getCacheTimeout());
			cacheMediator.setScope(visualCache.getCacheScope().getLiteral());
			
		}
		return cacheMediator;
	}
}
