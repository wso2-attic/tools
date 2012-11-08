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
import org.apache.synapse.mediators.elementary.Source;
import org.apache.synapse.mediators.elementary.Target;
import org.apache.synapse.util.xpath.SynapseXPath;

import org.eclipse.core.runtime.Assert;
import org.wso2.developerstudio.eclipse.gmf.esb.EnrichMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.EnrichSourceType;
import org.wso2.developerstudio.eclipse.gmf.esb.EnrichTargetAction;
import org.wso2.developerstudio.eclipse.gmf.esb.EnrichTargetType;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbFactory;
import org.wso2.developerstudio.eclipse.gmf.esb.NamespacedProperty;

public class EnrichMediatorDeserializer extends AbstractEsbNodeDeserializer<AbstractMediator, EnrichMediator> {
	
	public EnrichMediator createNode(AbstractMediator mediator) {
		
		Assert.isTrue(mediator instanceof org.apache.synapse.mediators.elementary.EnrichMediator, "Invalid Mediator.");
		
		org.apache.synapse.mediators.elementary.EnrichMediator enrichMediator = (org.apache.synapse.mediators.elementary.EnrichMediator)mediator;
		
		EnrichMediator vishualEnrich = EsbFactory.eINSTANCE.createEnrichMediator();
		
		if(enrichMediator.getSource() != null){
			
			Source source  = enrichMediator.getSource();
			
			//Set isClone source
			vishualEnrich.setCloneSource(source.isClone());
			
			//Setting the source type
			switch (source.getSourceType()) {
			
			case org.apache.synapse.mediators.elementary.EnrichMediator.BODY:
				
				vishualEnrich.setSourceType(EnrichSourceType.BODY);
				
				break;
				
			case org.apache.synapse.mediators.elementary.EnrichMediator.ENVELOPE:
				
				vishualEnrich.setSourceType(EnrichSourceType.ENVELOPE);
				
				break;
				
			case org.apache.synapse.mediators.elementary.EnrichMediator.PROPERTY:
				
				vishualEnrich.setSourceType(EnrichSourceType.PROPERTY);
				
				if (source.getProperty() != null
						&& !source.getProperty().equals("")) {
					vishualEnrich.setSourceProperty(source.getProperty());
				}
				break;
				
			case org.apache.synapse.mediators.elementary.EnrichMediator.INLINE:
				
				vishualEnrich.setSourceType(EnrichSourceType.INLINE);
				
				if(source.getInlineOMNode() != null){
					
					vishualEnrich.setSourceXML(source.getInlineOMNode().toString());
				}
				break;
			
			case org.apache.synapse.mediators.elementary.EnrichMediator.CUSTOM:
				
				vishualEnrich.setSourceType(EnrichSourceType.CUSTOM);
				
				SynapseXPath xpath  = source.getXpath();
				
				NamespacedProperty nsp = EsbFactory.eINSTANCE.createNamespacedProperty();
				
				nsp.setPropertyValue(xpath.toString());
				
				if (xpath.getNamespaces() != null) {

					@SuppressWarnings("unchecked")
					Map<String, String> map = xpath.getNamespaces();

					nsp.setNamespaces(map);
				}
				
				vishualEnrich.setSourceXpath(nsp);
				
				break;
			}
			
		}
		
		//Setting the target type
		
		if(enrichMediator.getTarget() != null){
			
			Target target = enrichMediator.getTarget();
			
			switch (target.getTargetType()) {
			
			case org.apache.synapse.mediators.elementary.EnrichMediator.BODY:
				
				vishualEnrich.setTargetType(EnrichTargetType.BODY);
				
				break;
				
			case org.apache.synapse.mediators.elementary.EnrichMediator.ENVELOPE:
				
				vishualEnrich.setTargetType(EnrichTargetType.ENVELOPE);
				
				break;
				
			case org.apache.synapse.mediators.elementary.EnrichMediator.PROPERTY:
				
				vishualEnrich.setTargetType(EnrichTargetType.PROPERTY);
				
				String property = target.getProperty();
				
				if (property != null && !property.equals("")) {
					
					vishualEnrich.setTargetProperty(property);
				}
				
				break;
			
			case org.apache.synapse.mediators.elementary.EnrichMediator.CUSTOM:
				
				vishualEnrich.setTargetType(EnrichTargetType.CUSTOM);
				
				SynapseXPath xpath = target.getXpath();
				
				NamespacedProperty nsp = EsbFactory.eINSTANCE.createNamespacedProperty();
				
				nsp.setPropertyValue(xpath.toString());
				
				if (xpath.getNamespaces() != null) {

					@SuppressWarnings("unchecked")
					Map<String, String> map = xpath.getNamespaces();

					nsp.setNamespaces(map);
				}
				
				vishualEnrich.setTargetXpath(nsp);
				
				break;
			}
			
			//Setting the target action
			String targetAction = target.getAction();
			
			if(targetAction.equals(org.apache.synapse.mediators.elementary.Target.ACTION_ADD_CHILD)){
				
				vishualEnrich.setTargetAction(EnrichTargetAction.CHILD);
				
			}else if(targetAction.equals(org.apache.synapse.mediators.elementary.Target.ACTION_ADD_SIBLING)){
				
				vishualEnrich.setTargetAction(EnrichTargetAction.SIBLING);
				
				
			}else if(targetAction.equals(org.apache.synapse.mediators.elementary.Target.ACTION_REPLACE)){
				
				vishualEnrich.setTargetAction(EnrichTargetAction.REPLACE);
			}
		}
		
		return vishualEnrich;
	}

}
