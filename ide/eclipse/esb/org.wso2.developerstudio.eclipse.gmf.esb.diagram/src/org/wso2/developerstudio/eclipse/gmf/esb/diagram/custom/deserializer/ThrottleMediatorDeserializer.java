package org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.deserializer;

import static org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage.Literals.THROTTLE_MEDIATOR__GROUP_ID;
import static org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage.Literals.THROTTLE_MEDIATOR__MAX_CONCURRENT_ACCESS_COUNT;
import static org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage.Literals.THROTTLE_MEDIATOR__POLICY_TYPE;

import java.util.Iterator;

import javax.xml.namespace.QName;

import org.apache.axiom.om.OMAttribute;
import org.apache.axiom.om.OMElement;
import org.apache.commons.lang.StringUtils;
import org.apache.synapse.mediators.AbstractMediator;
import org.eclipse.core.runtime.Assert;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbFactory;
import org.wso2.developerstudio.eclipse.gmf.esb.ThrottleAccessType;
import org.wso2.developerstudio.eclipse.gmf.esb.ThrottleConditionType;
import org.wso2.developerstudio.eclipse.gmf.esb.ThrottleMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.ThrottlePolicyEntry;
import org.wso2.developerstudio.eclipse.gmf.esb.ThrottlePolicyType;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.providers.EsbElementTypes;

public class ThrottleMediatorDeserializer extends AbstractEsbNodeDeserializer<AbstractMediator,ThrottleMediator> {

	@Override
	public ThrottleMediator createNode(IGraphicalEditPart part,AbstractMediator mediator) {
		
		Assert.isTrue(mediator instanceof org.apache.synapse.mediators.throttle.ThrottleMediator, "Unsupported mediator passed in for deserialization at "+ this.getClass());
		
		org.apache.synapse.mediators.throttle.ThrottleMediator throttleMediator = (org.apache.synapse.mediators.throttle.ThrottleMediator)mediator;
		
		ThrottleMediator vishualThrottle = (ThrottleMediator)DeserializerUtils.createNode(part, EsbElementTypes.ThrottleMediator_3493);
		
		setElementToEdit(vishualThrottle);
		
		if(throttleMediator.getId() != null){
			
			executeSetValueCommand(THROTTLE_MEDIATOR__GROUP_ID, throttleMediator.getId());
		}
		
		if(throttleMediator.getInLinePolicy() != null){
			
			executeSetValueCommand(THROTTLE_MEDIATOR__POLICY_TYPE, ThrottlePolicyType.INLINE);
			
			OMElement throttlePolicy = throttleMediator.getInLinePolicy();
			
			if (throttlePolicy != null) {
				
				
				OMElement mediatorThrottleAssertion = throttlePolicy.getFirstElement();

				if (mediatorThrottleAssertion != null) {
					
					@SuppressWarnings("unchecked")
					Iterator<OMElement> maximumConcAccIterator = mediatorThrottleAssertion.getChildrenWithLocalName("MaximumConcurrentAccess");
					OMElement maximumConcurrentAccess = maximumConcAccIterator.next();
					
					
					if(maximumConcurrentAccess != null && maximumConcurrentAccess.getText() != null && DeserializerUtils.isInteger(maximumConcurrentAccess.getText())){
						
					         int mca = Integer.parseInt(maximumConcurrentAccess.getText());
					         
					         executeSetValueCommand(THROTTLE_MEDIATOR__MAX_CONCURRENT_ACCESS_COUNT, mca);
					}
					
					
					//Setting throttle policy entries.
					for(@SuppressWarnings("unchecked")
					Iterator<OMElement> it = mediatorThrottleAssertion.getChildrenWithLocalName("Policy"); it.hasNext();){
							
							OMElement outerPolicy = it.next();
							
							if(outerPolicy != null){
								
							     ThrottlePolicyEntry throttlePolicyEntry = createVishualPolicyEntry(outerPolicy);
							    
							     executeAddValueCommand(vishualThrottle.getPolicyEntries(), throttlePolicyEntry);
							 
							}
						}
					
				}
			}
			
		}
	
		return vishualThrottle;
	}
	
	
	private ThrottlePolicyEntry createVishualPolicyEntry(OMElement outerPolicy){
		
		ThrottlePolicyEntry vishualPolicyEntry = EsbFactory.eINSTANCE.createThrottlePolicyEntry();
		
		@SuppressWarnings("unchecked")
		Iterator<OMElement> policyIdElemItr = outerPolicy.getChildrenWithLocalName("ID");
		OMElement policyIdElem = policyIdElemItr.next();
		
		if(policyIdElem != null){
			
			//get type  attribute
			OMAttribute typeAttribute = policyIdElem.getAttribute(new QName("http://www.wso2.org/products/wso2commons/throttle","type"));

			if (typeAttribute != null
					&& typeAttribute.getAttributeValue() != null) {
				String type = typeAttribute.getAttributeValue();

				if (type != null && !StringUtils.isBlank(type.trim())) {

					if (type.equals("IP")) {

						vishualPolicyEntry
								.setThrottleType(ThrottleConditionType.IP);

					} else if (type.equals("DOMAIN")) {

						vishualPolicyEntry
								.setThrottleType(ThrottleConditionType.DOMAIN);

					}
				}
			}
			//Setting range text
			if(policyIdElem.getText() != null && !StringUtils.isBlank(policyIdElem.getText().trim())){
				
				 vishualPolicyEntry.setThrottleRange(policyIdElem.getText());
			}
		}
		@SuppressWarnings("unchecked")
		Iterator<OMElement> innerPolicyItr = outerPolicy.getChildrenWithLocalName("Policy");
		OMElement innerPolicy = innerPolicyItr.next();
		
		if(innerPolicy != null){
			
			OMElement accessTypeElem  =  innerPolicy.getFirstElement();
			
			if(accessTypeElem != null && accessTypeElem.getLocalName() != null){
				
				if(accessTypeElem.getLocalName().equals("Allow")){
					
					vishualPolicyEntry.setAccessType(ThrottleAccessType.ALLOW);
					
				}else if(accessTypeElem.getLocalName().equals("Deny")){
					
					vishualPolicyEntry.setAccessType(ThrottleAccessType.DENY);
					
				}else if(accessTypeElem.getLocalName().equals("Control")){
					
					vishualPolicyEntry.setAccessType(ThrottleAccessType.CONTROL);
					
					configureAccessControlParams(vishualPolicyEntry,accessTypeElem);
					
				}
			}
		}
			
		return vishualPolicyEntry;
		
	}
	
	private void configureAccessControlParams(ThrottlePolicyEntry vishualPolicyEntry, OMElement accessTypeElem){
		
		@SuppressWarnings("unchecked")
		Iterator<OMElement> accessPolicyElemItr = accessTypeElem.getChildrenWithLocalName("Policy");
		OMElement accessPolicyElem = accessPolicyElemItr.next();
		
		@SuppressWarnings("unchecked")
		Iterator<OMElement> maximumCountElemItr = accessPolicyElem.getChildrenWithLocalName("MaximumCount");
		OMElement maximumCountElem = maximumCountElemItr.next(); 
		
		if(maximumCountElem != null && maximumCountElem.getText() != null && DeserializerUtils.isInteger(maximumCountElem.getText().trim())){
			
			vishualPolicyEntry.setMaxRequestCount(Integer.parseInt(maximumCountElem.getText()));
		}
		
		@SuppressWarnings("unchecked")
		Iterator<OMElement> unitTimeElemItr = accessPolicyElem.getChildrenWithLocalName("UnitTime");
		OMElement unitTimeElem = unitTimeElemItr.next();
		
		if(unitTimeElem != null && unitTimeElem.getText() != null && DeserializerUtils.isInteger(unitTimeElem.getText())){
			
			vishualPolicyEntry.setUnitTime(Integer.parseInt(unitTimeElem.getText()));
		}
		
		@SuppressWarnings("unchecked")
		Iterator<OMElement> prohibitTimePeriodElemItr = accessPolicyElem.getChildrenWithLocalName("ProhibitTimePeriod");
		OMElement prohibitTimePeriodElem = prohibitTimePeriodElemItr.next();
		
		if(prohibitTimePeriodElem != null && prohibitTimePeriodElem.getText() != null && DeserializerUtils.isInteger(prohibitTimePeriodElem.getText())){
			
			vishualPolicyEntry.setProhibitPeriod(Integer.parseInt(prohibitTimePeriodElem.getText()));
		}
	}

}
