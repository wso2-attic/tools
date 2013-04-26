package org.wso2.developerstudio.eclipse.gmf.esb.internal.persistence;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.apache.synapse.endpoints.AbstractEndpoint;
import org.apache.synapse.endpoints.EndpointDefinition;
import org.apache.synapse.mediators.MediatorProperty;
import org.apache.synapse.util.xpath.SynapseXPath;
import org.jaxen.JaxenException;
import org.wso2.developerstudio.eclipse.gmf.esb.AbstractEndPoint;
import org.wso2.developerstudio.eclipse.gmf.esb.EndPoint;
import org.wso2.developerstudio.eclipse.gmf.esb.EndPointAddressingVersion;
import org.wso2.developerstudio.eclipse.gmf.esb.EndPointProperty;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbLink;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbNode;
import org.wso2.developerstudio.eclipse.gmf.esb.FailoverEndPoint;
import org.wso2.developerstudio.eclipse.gmf.esb.FailoverEndPointWestOutputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.InputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.LoadBalanceEndPoint;
import org.wso2.developerstudio.eclipse.gmf.esb.LoadBalanceEndPointWestOutputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.OutputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.RecipientListEndPoint;
import org.wso2.developerstudio.eclipse.gmf.esb.RecipientListEndPointWestOutputConnector;
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
		
		saveProperties(visualEndPoint, endpoint);
		
		endpoint.setDefinition(synapseEPDef);

	}

	/**
	 * Save endpoint properties
	 * @param model
	 * @param endpoint
	 */
	protected void saveProperties(EndPoint model, AbstractEndpoint endpoint) {
		for (Iterator<EndPointProperty> iterator = model.getProperties().iterator(); iterator
				.hasNext();) {
			EndPointProperty property = iterator.next();
			MediatorProperty mediatorProperty = new MediatorProperty();
			mediatorProperty.setName(property.getName());	
			
			if(property.getValueType().toString().equals("EXPRESSION")){
			SynapseXPath XPath = null;
			try {
				XPath = new SynapseXPath(property.getValueExpression().getPropertyValue());
				for (int i = 0; i < property.getValueExpression().getNamespaces().keySet().size(); ++i) {
					String prefix = (String) property.getValueExpression().getNamespaces().keySet()
							.toArray()[i];
					String namespaceUri = property.getValueExpression().getNamespaces().get(prefix);
					XPath.addNamespace(prefix, namespaceUri);
					mediatorProperty.setExpression(XPath);
				}			
			} catch (JaxenException e) {
				log.error("Error while persisting Endpoint properties", e);
			}
			}else if(property.getValueType().toString().equals("LITERAL")){
				mediatorProperty.setValue(property.getValue());
			}		
			
			mediatorProperty.setScope(property.getScope().toString().toLowerCase());
			endpoint.addProperty(mediatorProperty);
		}
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
						EsbNode nextElement = getTargetContainer(westOutputConnector);
						if (nextElement != null) {
							if (!transformedMediators.contains(nextElement)) {
								doTransform(info, westOutputConnector);
								transformedMediators.add(nextElement);
							}
						}
						
					}
					
				} catch (Exception e) {
					log.warn("Error while executing outflow  serialization", e);
				}
			} else if (info.firstEndPoint instanceof LoadBalanceEndPoint) {
				try {
					LoadBalanceEndPointWestOutputConnector westOutputConnector = ((LoadBalanceEndPoint) info.firstEndPoint)
							.getWestOutputConnector();
					List<EsbNode> transformedMediators = info.getTransformedMediators();
					if(westOutputConnector!=null){
						EsbNode nextElement = getTargetContainer(westOutputConnector);
						if (nextElement != null) {
							if (!transformedMediators.contains(nextElement)) {
								doTransform(info, westOutputConnector);
								transformedMediators.add(nextElement);
							}
						}
						
					}
				} catch (Exception e) {
					log.warn("Error while executing outflow  serialization", e);
				}
			} else if (info.firstEndPoint instanceof RecipientListEndPoint) {
				try {
					RecipientListEndPointWestOutputConnector westOutputConnector = ((RecipientListEndPoint) info.firstEndPoint)
							.getWestOutputConnector();
					
					List<EsbNode> transformedMediators = info.getTransformedMediators();
					if(westOutputConnector!=null){
						EsbNode nextElement = getTargetContainer(westOutputConnector);
						if (nextElement != null) {
							if (!transformedMediators.contains(nextElement)) {
								doTransform(info, westOutputConnector);
								transformedMediators.add(nextElement);
							}
						}
						
					}
					
				} catch (Exception e) {
					log.warn("Error while executing outflow  serialization", e);
				}
			} 
			info.isOutputPathSet = true;
		}
	}

	/**
	 * Get target node
	 * @param outputConnector
	 * @return
	 */
	protected EsbNode getTargetContainer(OutputConnector outputConnector) {
		EsbNode node = null;
		EsbLink outgoingLink = outputConnector.getOutgoingLink();
		if (outgoingLink != null) {
			InputConnector target = outgoingLink.getTarget();
			if (target != null) {
				if (target.eContainer() instanceof EsbNode) {
					node = (EsbNode) target.eContainer();
				}
			}
		}
		return node;
	}
	
}
