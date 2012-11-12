package org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.deserializer;

import java.util.Map;
import java.util.regex.Pattern;

import org.apache.synapse.mediators.AbstractMediator;
import org.apache.synapse.util.xpath.SynapseXPath;
import org.eclipse.core.runtime.Assert;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbFactory;
import org.wso2.developerstudio.eclipse.gmf.esb.FilterConditionType;
import org.wso2.developerstudio.eclipse.gmf.esb.FilterMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.NamespacedProperty;

public class FilterMediatorDeserializer extends AbstractEsbNodeDeserializer<AbstractMediator,FilterMediator>{

	@Override
	public FilterMediator createNode(AbstractMediator mediator) {
		
		Assert.isTrue(mediator instanceof org.apache.synapse.mediators.filters.FilterMediator, "Invalid mediator.");
		
		org.apache.synapse.mediators.filters.FilterMediator filterMediator = (org.apache.synapse.mediators.filters.FilterMediator)mediator;
		
		FilterMediator vishualFilter = EsbFactory.eINSTANCE.createFilterMediator();
		
		if(filterMediator.getSource() != null && filterMediator.getRegex() != null){
			
			vishualFilter.setConditionType(FilterConditionType.SOURCE_AND_REGEX);
			
			//Setting source
			SynapseXPath xpath = filterMediator.getSource();
			
			NamespacedProperty nsp = EsbFactory.eINSTANCE.createNamespacedProperty();
			
			nsp.setPropertyValue(xpath.toString());
			
			if (xpath.getNamespaces() != null) {

				@SuppressWarnings("unchecked")
				Map<String, String> map = xpath.getNamespaces();

				nsp.setNamespaces(map);
			}
			
			vishualFilter.setSource(nsp);
			
			
			//Setting regx
			if(filterMediator.getRegex() != null && DeserializerUtils.isValidRegex(filterMediator.getRegex().toString())){
				
			vishualFilter.setRegex(filterMediator.getRegex().toString());
			
			}
			
		}else if(filterMediator.getXpath() != null){
			
			vishualFilter.setConditionType(FilterConditionType.XPATH);
			
			SynapseXPath xpath = filterMediator.getXpath();
			
			NamespacedProperty nsp = EsbFactory.eINSTANCE.createNamespacedProperty();
			
			nsp.setPropertyValue(xpath.toString());
			
			if (xpath.getNamespaces() != null) {

				@SuppressWarnings("unchecked")
				Map<String, String> map = xpath.getNamespaces();

				nsp.setNamespaces(map);
			}
			
			vishualFilter.setXpath(nsp);
		}
		
		return vishualFilter;
		
	}

}
