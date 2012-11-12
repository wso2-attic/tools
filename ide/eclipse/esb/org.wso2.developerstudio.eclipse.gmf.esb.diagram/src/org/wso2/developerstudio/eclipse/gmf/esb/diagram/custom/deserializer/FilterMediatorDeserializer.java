/*
 * Copyright 2012 WSO2, Inc. (http://wso2.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.deserializer;

import java.util.Map;

import org.apache.synapse.mediators.AbstractMediator;
import org.apache.synapse.mediators.base.SequenceMediator;
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
		
		if(filterMediator.getList().size()>0){
			/*  deserialize <if> flow */
			SequenceMediator sequence = new SequenceMediator();
			sequence.addAll(filterMediator.getList());
			deserializeSequence(vishualFilter.getFilterContainer().getPassContainer()
					.getMediatorFlow(), sequence, vishualFilter.getPassOutputConnector());
		}

		if (filterMediator.getElseMediator() != null) {
			/* deserialize <else> flow*/
			SequenceMediator sequence = new SequenceMediator();
			sequence.addAll(filterMediator.getElseMediator().getList());
			deserializeSequence(vishualFilter.getFilterContainer().getFailContainer()
					.getMediatorFlow(), sequence, vishualFilter.getFailOutputConnector());
		}
		
		return vishualFilter;
		
	}

}
