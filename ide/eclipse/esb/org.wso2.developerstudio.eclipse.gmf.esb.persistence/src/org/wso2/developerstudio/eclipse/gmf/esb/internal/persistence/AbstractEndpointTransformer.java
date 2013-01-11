package org.wso2.developerstudio.eclipse.gmf.esb.internal.persistence;

import java.util.Arrays;
import java.util.List;

import org.apache.synapse.endpoints.AbstractEndpoint;
import org.apache.synapse.endpoints.EndpointDefinition;
import org.wso2.developerstudio.eclipse.gmf.esb.AbstractEndPoint;
import org.wso2.developerstudio.eclipse.gmf.esb.EndPointAddressingVersion;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbNode;
import org.wso2.developerstudio.eclipse.gmf.esb.FailoverEndPoint;
import org.wso2.developerstudio.eclipse.gmf.esb.FailoverEndPointWestOutputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.LoadBalanceEndPoint;
import org.wso2.developerstudio.eclipse.gmf.esb.LoadBalanceEndPointWestOutputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.persistence.TransformationInfo;

public abstract class AbstractEndpointTransformer extends AbstractEsbNodeTransformer{

	protected void createAdvanceOptions(AbstractEndPoint visualEndPoint,AbstractEndpoint endpoint) {
		EndpointDefinition synapseEPDef = new EndpointDefinition();
		
		synapseEPDef.setFormat(visualEndPoint.getFormat().getLiteral());
		if(visualEndPoint.getOptimize().getValue()==1){
			synapseEPDef.setUseMTOM(true);
		}else if(visualEndPoint.getOptimize().getValue()==2){
			synapseEPDef.setUseSwa(true);
		}
		
		String suspendErrorCodes=visualEndPoint.getSuspendErrorCodes();
		if(suspendErrorCodes!=null){
			String [] suspendErrorCodesList=suspendErrorCodes.split("\\,");
			List<String> suspendCodes = Arrays.asList(suspendErrorCodesList); 
			for(String code:suspendCodes){
				synapseEPDef.addSuspendErrorCode(Integer.parseInt(code));
			}
		}
		synapseEPDef.setInitialSuspendDuration(visualEndPoint.getSuspendInitialDuration());
		synapseEPDef.setSuspendMaximumDuration(visualEndPoint.getSuspendMaximumDuration());
		synapseEPDef.setSuspendProgressionFactor(visualEndPoint.getSuspendProgressionFactor());		
				
		String retryErrorCodes=visualEndPoint.getRetryErrorCodes();
		if(retryErrorCodes!=null){
			String [] retryCodesList=retryErrorCodes.split("\\,");
			List<String> retryCodes = Arrays.asList(retryCodesList); 
			for(String code:retryCodes){
				synapseEPDef.addRetryDisabledErrorCode(Integer.parseInt(code));
			}
		}
		synapseEPDef.setRetriesOnTimeoutBeforeSuspend(visualEndPoint.getRetryCount());
		synapseEPDef.setRetryDurationOnTimeout((int) visualEndPoint.getRetryDelay());

		synapseEPDef.setTimeoutAction(visualEndPoint.getTimeOutAction().getValue());
		synapseEPDef.setTimeoutDuration(visualEndPoint.getTimeOutDuration());		
		
		if (visualEndPoint.isAddressingEnabled()) {
			synapseEPDef.setAddressingOn(true);
			synapseEPDef.setUseSeparateListener(visualEndPoint.isAddressingSeparateListener());
			synapseEPDef
					.setAddressingVersion((visualEndPoint.getAddressingVersion() == EndPointAddressingVersion.FINAL) ? "final"
							: "submission");
		}
		if (visualEndPoint.isReliableMessagingEnabled()) {
			synapseEPDef.setReliableMessagingOn(visualEndPoint
					.isReliableMessagingEnabled());
			synapseEPDef.setWsRMPolicyKey(visualEndPoint.getReliableMessagingPolicy().getKeyValue());
		}

		if (visualEndPoint.isSecurityEnabled()) {
			synapseEPDef.setSecurityOn(true);
			synapseEPDef.setWsSecPolicyKey(visualEndPoint.getSecurityPolicy().getKeyValue());
		}
		
		endpoint.setDefinition(synapseEPDef);

	}
	
	/**
	 * transform Endpoint Output flow
	 * @param info
	 */
	protected void transformEndpointOutflow(TransformationInfo info) {
		if (!info.isOutputPathSet) {
			if (info.firstEndPoint instanceof FailoverEndPoint) {
				try {
					FailoverEndPointWestOutputConnector westOutputConnector = ((FailoverEndPoint) info.firstEndPoint)
							.getWestOutputConnector();
					
					List<EsbNode> transformedMediators = info.getTransformedMediators();
					if(westOutputConnector!=null){
						EsbNode nextElement=(EsbNode) westOutputConnector.getOutgoingLink().getTarget().eContainer();
						if(!transformedMediators.contains(nextElement)){
							doTransform(info,
									westOutputConnector);
							transformedMediators.add(nextElement);
						}
						
					}
					
				} catch (Exception e) {
					log.warn("Error while executing outflow  serialization", e);
				}
			}
			if (info.firstEndPoint instanceof LoadBalanceEndPoint) {
				try {
					LoadBalanceEndPointWestOutputConnector westOutputConnector = ((LoadBalanceEndPoint) info.firstEndPoint)
							.getWestOutputConnector();
					List<EsbNode> transformedMediators = info.getTransformedMediators();
					if(westOutputConnector!=null){
						EsbNode nextElement=(EsbNode) westOutputConnector.getOutgoingLink().getTarget().eContainer();
						if(!transformedMediators.contains(nextElement)){
							doTransform(info,
									westOutputConnector);
							transformedMediators.add(nextElement);
						}
						
					}
				} catch (Exception e) {
					log.warn("Error while executing outflow  serialization", e);
				}
			}
			info.isOutputPathSet = true;
		}
	}
	
}
