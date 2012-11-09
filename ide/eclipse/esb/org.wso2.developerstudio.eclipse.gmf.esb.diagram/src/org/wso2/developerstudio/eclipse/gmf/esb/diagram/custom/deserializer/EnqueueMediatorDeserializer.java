package org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.deserializer;

import org.apache.synapse.mediators.AbstractMediator;
import org.eclipse.core.runtime.Assert;
import org.wso2.developerstudio.eclipse.gmf.esb.EnqueueMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbFactory;
import org.wso2.developerstudio.eclipse.gmf.esb.RegistryKeyProperty;

public class EnqueueMediatorDeserializer extends AbstractEsbNodeDeserializer<AbstractMediator,EnqueueMediator> {

	public EnqueueMediator createNode(AbstractMediator mediator) {
		
		Assert.isTrue(mediator instanceof org.apache.synapse.mediators.builtin.EnqueueMediator, "Invalid Mediator.");
		
		org.apache.synapse.mediators.builtin.EnqueueMediator enqueueMediator = (org.apache.synapse.mediators.builtin.EnqueueMediator)mediator;
		
		EnqueueMediator vishualEnqueue = EsbFactory.eINSTANCE.createEnqueueMediator();
		
		//Setting executer name
		if(enqueueMediator.getExecutorName() != null && !enqueueMediator.getExecutorName().equals("")){
			
			vishualEnqueue.setExecutor(enqueueMediator.getExecutorName());
			
		}
		
		//Setting priority.
		vishualEnqueue.setPriority(enqueueMediator.getPriority());
		
		//Setting sequence
		if(enqueueMediator.getSequenceName() != null && enqueueMediator.getSequenceName().equals("")){
			
			RegistryKeyProperty regkey = EsbFactory.eINSTANCE.createRegistryKeyProperty();
			regkey.setKeyValue(enqueueMediator.getSequenceName());
			
			vishualEnqueue.setSequenceKey(regkey);
			
		}
		
		return vishualEnqueue;
		
	}

}
