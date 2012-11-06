package org.wso2.developerstudio.eclipse.gmf.esb.internal.deserializer;

import org.apache.synapse.mediators.AbstractMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbNode;

public interface IEsbNodeDeserializer {

	EsbNode createNode(AbstractMediator mediator);

}
