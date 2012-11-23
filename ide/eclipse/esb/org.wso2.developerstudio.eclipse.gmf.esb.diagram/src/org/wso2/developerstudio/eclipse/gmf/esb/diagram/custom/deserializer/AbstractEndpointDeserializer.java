package org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.deserializer;

import org.apache.synapse.endpoints.AbstractEndpoint;
import org.wso2.developerstudio.eclipse.gmf.esb.AbstractEndPoint;
import org.wso2.developerstudio.eclipse.gmf.esb.EndPointAddressingVersion;

import static org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage.Literals.*;

public abstract class AbstractEndpointDeserializer extends AbstractEsbNodeDeserializer<AbstractEndpoint, AbstractEndPoint>{

	protected <T extends AbstractEndpoint> void deserializeEndpoint(T endpoint,AbstractEndPoint visualEndpoint){	
		executeSetValueCommand(ABSTRACT_END_POINT__ADDRESSING_ENABLED, endpoint.getDefinition().isAddressingOn());
		executeSetValueCommand(ABSTRACT_END_POINT__ADDRESSING_SEPARATE_LISTENER, endpoint.getDefinition().isUseSeparateListener());
		
		if("final".equals(endpoint.getDefinition().getAddressingVersion())){
			executeSetValueCommand(ABSTRACT_END_POINT__ADDRESSING_VERSION, EndPointAddressingVersion.FINAL);			
		}else if("submission".equals(endpoint.getDefinition().getAddressingVersion())){
			executeSetValueCommand(ABSTRACT_END_POINT__ADDRESSING_VERSION, EndPointAddressingVersion.SUBMISSION);
		}
		executeSetValueCommand(ABSTRACT_END_POINT__RELIABLE_MESSAGING_ENABLED, endpoint.getDefinition().isReliableMessagingOn());
		//executeSetValueCommand(ABSTRACT_END_POINT__RELIABLE_MESSAGING_POLICY, );
		//executeSetValueCommand(ABSTRACT_END_POINT__RETRY_COUNT, );
		executeSetValueCommand(ABSTRACT_END_POINT__RETRY_DELAY, endpoint.getDefinition().getRetryDurationOnTimeout());
		//executeSetValueCommand(ABSTRACT_END_POINT__RETRY_ERROR_CODES, );
		executeSetValueCommand(ABSTRACT_END_POINT__SECURITY_ENABLED, endpoint.getDefinition().isSecurityOn());
		//executeSetValueCommand(ABSTRACT_END_POINT__SECURITY_POLICY, );		
		//executeSetValueCommand(ABSTRACT_END_POINT__SUSPEND_ERROR_CODES, );
		executeSetValueCommand(ABSTRACT_END_POINT__SUSPEND_INITIAL_DURATION, visualEndpoint.getSuspendInitialDuration());
		executeSetValueCommand(ABSTRACT_END_POINT__SUSPEND_MAXIMUM_DURATION, endpoint.getDefinition().getSuspendMaximumDuration());
		executeSetValueCommand(ABSTRACT_END_POINT__SUSPEND_PROGRESSION_FACTOR, endpoint.getDefinition().getSuspendProgressionFactor());
		executeSetValueCommand(ABSTRACT_END_POINT__TIME_OUT_ACTION, endpoint.getDefinition().getTimeoutAction());		
		executeSetValueCommand(ABSTRACT_END_POINT__TIME_OUT_DURATION, endpoint.getDefinition().getTimeoutDuration());
		
	}
	
}
