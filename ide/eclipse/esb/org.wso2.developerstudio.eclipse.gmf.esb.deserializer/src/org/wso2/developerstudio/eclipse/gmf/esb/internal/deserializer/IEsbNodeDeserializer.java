package org.wso2.developerstudio.eclipse.gmf.esb.internal.deserializer;

import org.apache.synapse.mediators.AbstractMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.Mediator;

public interface IEsbNodeDeserializer {

	Mediator createMediator(AbstractMediator mediator);
	
	  
}
