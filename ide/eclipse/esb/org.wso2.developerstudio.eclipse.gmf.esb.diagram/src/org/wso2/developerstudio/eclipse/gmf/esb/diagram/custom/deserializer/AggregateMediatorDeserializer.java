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

import javax.management.MXBean;

import org.apache.synapse.mediators.AbstractMediator;
import org.apache.synapse.mediators.Value;
import org.apache.synapse.util.xpath.SynapseXPath;
import org.eclipse.core.runtime.Assert;
import org.wso2.developerstudio.eclipse.gmf.esb.AggregateMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbFactory;
import org.wso2.developerstudio.eclipse.gmf.esb.NamespacedProperty;

public class AggregateMediatorDeserializer extends AbstractEsbNodeDeserializer<AbstractMediator, AggregateMediator> {
	
	
	//TODO Several Ecore changes needed to complete this.
	
	@Override
	public AggregateMediator createNode(AbstractMediator mediator) {
		
		Assert.isTrue(mediator instanceof org.apache.synapse.mediators.eip.aggregator.AggregateMediator, "Invalid Mediator.");
		
		org.apache.synapse.mediators.eip.aggregator.AggregateMediator aggregateMediator = (org.apache.synapse.mediators.eip.aggregator.AggregateMediator) mediator;
		
		AggregateMediator vishualAggrigate = EsbFactory.eINSTANCE.createAggregateMediator();
		
		//Setting aggregate ID
		if(aggregateMediator.getId() != null && !aggregateMediator.getId().equals("")){
			
			vishualAggrigate.setAggregateID(aggregateMediator.getId());
		}
		
		//Setting completion timeout
		//vishualAggrigate.setCompletionTimeout(aggregateMediator.getCompletionTimeoutMillis());
		
		//Setting aggregate expression.
		if(aggregateMediator.getAggregationExpression() != null){
			
			SynapseXPath xpath  = aggregateMediator.getAggregationExpression();
			
			NamespacedProperty nsp = EsbFactory.eINSTANCE.createNamespacedProperty();
			
			if (xpath.getNamespaces() != null) {

				@SuppressWarnings("unchecked")
				Map<String, String> map = xpath.getNamespaces();

				nsp.setNamespaces(map);
			}
			
			vishualAggrigate.setAggregationExpression(nsp);
			
		}
		
		if(aggregateMediator.getMaxMessagesToComplete() != null){
			
			Value maxMsg = aggregateMediator.getMaxMessagesToComplete();
			
			if(maxMsg.getKeyValue() != null && DeserializerUtils.isInteger(maxMsg.getKeyValue()) ){
				
				vishualAggrigate.setCompletionMaxMessages(Integer.parseInt(maxMsg.getKeyValue()));
				
			}else if(maxMsg.getExpression() != null){
				
				SynapseXPath xpath = maxMsg.getExpression();
				
				NamespacedProperty nsp = EsbFactory.eINSTANCE.createNamespacedProperty();
				
				if (xpath.getNamespaces() != null) {

					@SuppressWarnings("unchecked")
					Map<String, String> map = xpath.getNamespaces();

					nsp.setNamespaces(map);
				}
				
				//vishualAggrigate.set
				
			}
		}
		
		
		return vishualAggrigate;
		
		
	}

}
