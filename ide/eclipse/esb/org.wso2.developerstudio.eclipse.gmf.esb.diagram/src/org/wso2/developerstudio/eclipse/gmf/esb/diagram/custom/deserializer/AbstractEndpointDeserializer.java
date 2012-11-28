package org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.deserializer;

import org.apache.synapse.endpoints.AbstractEndpoint;
import org.wso2.developerstudio.eclipse.gmf.esb.AbstractEndPoint;
import org.wso2.developerstudio.eclipse.gmf.esb.EndPointAddressingVersion;
import org.wso2.developerstudio.eclipse.gmf.esb.EndPointAttachmentOptimization;
import org.wso2.developerstudio.eclipse.gmf.esb.EndPointMessageFormat;
import org.wso2.developerstudio.eclipse.gmf.esb.EndPointTimeOutAction;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbFactory;
import org.wso2.developerstudio.eclipse.gmf.esb.RegistryKeyProperty;

import static org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage.Literals.*;

public abstract class AbstractEndpointDeserializer extends AbstractEsbNodeDeserializer<AbstractEndpoint, AbstractEndPoint>{

	protected <T extends AbstractEndpoint> void deserializeEndpoint(T endpoint,AbstractEndPoint visualEndpoint){	
		String suspendErrorCodes=null;
		String retryErrorCodes=null;
		
		if("soap11".equals(endpoint.getDefinition().getFormat())){
			executeSetValueCommand(ABSTRACT_END_POINT__FORMAT, EndPointMessageFormat.SOAP_11);
		}else if("soap12".equals(endpoint.getDefinition().getFormat())){
			executeSetValueCommand(ABSTRACT_END_POINT__FORMAT, EndPointMessageFormat.SOAP_12);
		}else if("pox".equals(endpoint.getDefinition().getFormat())){
			executeSetValueCommand(ABSTRACT_END_POINT__FORMAT, EndPointMessageFormat.POX);
		}else if("get".equals(endpoint.getDefinition().getFormat())){
			executeSetValueCommand(ABSTRACT_END_POINT__FORMAT, EndPointMessageFormat.GET);
		}else if("rest".equals(endpoint.getDefinition().getFormat())){
			executeSetValueCommand(ABSTRACT_END_POINT__FORMAT, EndPointMessageFormat.REST);
		}
		
		if(endpoint.getDefinition().isUseMTOM()){
			executeSetValueCommand(ABSTRACT_END_POINT__OPTIMIZE, EndPointAttachmentOptimization.MTOM);
		}else if(endpoint.getDefinition().isUseSwa()){
			executeSetValueCommand(ABSTRACT_END_POINT__OPTIMIZE, EndPointAttachmentOptimization.SWA);
		}
		
		for(Integer code:endpoint.getDefinition().getSuspendErrorCodes()){
			if(suspendErrorCodes==null){
				suspendErrorCodes=code.toString();
			}else{
				suspendErrorCodes=suspendErrorCodes+","+code.toString();
			}
		}		
		executeSetValueCommand(ABSTRACT_END_POINT__SUSPEND_ERROR_CODES, suspendErrorCodes);
		executeSetValueCommand(ABSTRACT_END_POINT__SUSPEND_INITIAL_DURATION, visualEndpoint.getSuspendInitialDuration());
		executeSetValueCommand(ABSTRACT_END_POINT__SUSPEND_MAXIMUM_DURATION, endpoint.getDefinition().getSuspendMaximumDuration());
		executeSetValueCommand(ABSTRACT_END_POINT__SUSPEND_PROGRESSION_FACTOR, endpoint.getDefinition().getSuspendProgressionFactor());
		
		for(Integer code:endpoint.getDefinition().getSuspendErrorCodes()){
			if(retryErrorCodes==null){
				retryErrorCodes=code.toString();
			}else{
				retryErrorCodes=retryErrorCodes+","+code.toString();
			}
		}
		executeSetValueCommand(ABSTRACT_END_POINT__RETRY_ERROR_CODES, retryErrorCodes);
		executeSetValueCommand(ABSTRACT_END_POINT__RETRY_COUNT, endpoint.getDefinition().getRetriesOnTimeoutBeforeSuspend());
		executeSetValueCommand(ABSTRACT_END_POINT__RETRY_DELAY, endpoint.getDefinition().getRetryDurationOnTimeout());
		
		if(endpoint.getDefinition().getTimeoutAction()==100){
			executeSetValueCommand(ABSTRACT_END_POINT__TIME_OUT_ACTION, EndPointTimeOutAction.NEVER);
		}else if(endpoint.getDefinition().getTimeoutAction()==101){
			executeSetValueCommand(ABSTRACT_END_POINT__TIME_OUT_ACTION, EndPointTimeOutAction.DISCARD);
		}else if(endpoint.getDefinition().getTimeoutAction()==102){
			executeSetValueCommand(ABSTRACT_END_POINT__TIME_OUT_ACTION, EndPointTimeOutAction.FAULT);
		}
		executeSetValueCommand(ABSTRACT_END_POINT__TIME_OUT_DURATION, endpoint.getDefinition().getTimeoutDuration());
		
		if(endpoint.getDefinition().isAddressingOn()){
			executeSetValueCommand(ABSTRACT_END_POINT__ADDRESSING_ENABLED, true);
			executeSetValueCommand(ABSTRACT_END_POINT__ADDRESSING_SEPARATE_LISTENER, endpoint.getDefinition().isUseSeparateListener());
			if("final".equals(endpoint.getDefinition().getAddressingVersion())){
				executeSetValueCommand(ABSTRACT_END_POINT__ADDRESSING_VERSION, EndPointAddressingVersion.FINAL);
			}else{
				executeSetValueCommand(ABSTRACT_END_POINT__ADDRESSING_VERSION, EndPointAddressingVersion.SUBMISSION);
			}
		}
		
		if(endpoint.getDefinition().isReliableMessagingOn()){
			executeSetValueCommand(ABSTRACT_END_POINT__RELIABLE_MESSAGING_ENABLED, true);
			
			RegistryKeyProperty regkey = EsbFactory.eINSTANCE.createRegistryKeyProperty();
			regkey.setKeyValue(endpoint.getDefinition().getWsRMPolicyKey());
			executeSetValueCommand(ABSTRACT_END_POINT__RELIABLE_MESSAGING_POLICY, regkey);
		}
		
		if(endpoint.getDefinition().isSecurityOn()){
			executeSetValueCommand(ABSTRACT_END_POINT__SECURITY_ENABLED, true);
			
			RegistryKeyProperty regkey = EsbFactory.eINSTANCE.createRegistryKeyProperty();
			regkey.setKeyValue(endpoint.getDefinition().getWsSecPolicyKey());
			executeSetValueCommand(ABSTRACT_END_POINT__SECURITY_POLICY, regkey);
		}
		
	}
	
}
