package org.wso2.developerstudio.eclipse.gmf.esb.internal.persistence;

import java.util.List;

import org.apache.synapse.endpoints.Endpoint;
import org.apache.synapse.mediators.base.SequenceMediator;
import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EObject;
import org.wso2.developerstudio.eclipse.gmf.esb.CacheMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.CacheSequenceType;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbNode;
import org.wso2.developerstudio.eclipse.gmf.esb.RegistryKeyProperty;
import org.wso2.developerstudio.eclipse.gmf.esb.persistence.TransformationInfo;

public class CacheMediatorTransformer extends AbstractEsbNodeTransformer {

	public void transform(TransformationInfo information, EsbNode subject)
			throws Exception {
		information.getParentSequence().addChild(createCacheMediator(subject));
		/**
		 *  Transform the Cache Mediator output data flow path.
		 */
		doTransform(information,
				((CacheMediator) subject).getOutputConnector());		
	}

	public void createSynapseObject(TransformationInfo info, EObject subject,
			List<Endpoint> endPoints) {
		
	}

	public void transformWithinSequence(TransformationInfo information,
			EsbNode subject, SequenceMediator sequence) throws Exception {
		sequence.addChild(createCacheMediator(subject));
		doTransformWithinSequence(information,((CacheMediator) subject).getOutputConnector().getOutgoingLink(),sequence);
		
	}
	
	private org.apache.synapse.mediators.builtin.CacheMediator createCacheMediator(EsbNode subject) throws Exception{
		/*
		 *  Check subject.
		 */
		Assert.isTrue(subject instanceof CacheMediator, "Invalid subject.");
		CacheMediator visualCache = (CacheMediator) subject;

		/*
		 *  Configure Cache mediator.
		 */
		org.apache.synapse.mediators.builtin.CacheMediator cacheMediator = new org.apache.synapse.mediators.builtin.CacheMediator();
		{	
			if(visualCache.getCacheAction().getValue()==0){
				cacheMediator.setId(visualCache.getCacheId());
				cacheMediator.setScope(visualCache.getCacheScope().getLiteral());
				cacheMediator.setTimeout(visualCache.getCacheTimeout());
				cacheMediator.setMaxMessageSize(visualCache.getMaxMessageSize());
				cacheMediator.setInMemoryCacheSize(visualCache.getMaxEntryCount());
				cacheMediator.setCollector(false);
			}
			if(visualCache.getCacheAction().getValue()==1){
				cacheMediator.setId(visualCache.getCacheId());
				cacheMediator.setScope(visualCache.getCacheScope().getLiteral());
				cacheMediator.setCollector(true);
			}
			
			if(visualCache.getSequenceType().equals(CacheSequenceType.REGISTRY_REFERENCE)){
				 
				 if(visualCache.getSequenceKey() != null){
					 
					 RegistryKeyProperty  regKeyProperty = visualCache.getSequenceKey();
					 cacheMediator.setOnCacheHitRef(regKeyProperty.getKeyValue());
				 }
			 }
			
		}
		return cacheMediator;
	}
}
