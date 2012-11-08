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

import org.apache.commons.lang.StringUtils;
import org.apache.synapse.mediators.AbstractMediator;
import org.apache.synapse.mediators.MediatorProperty;
import org.eclipse.core.runtime.Assert;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbFactory;
import org.wso2.developerstudio.eclipse.gmf.esb.LogCategory;
import org.wso2.developerstudio.eclipse.gmf.esb.LogLevel;
import org.wso2.developerstudio.eclipse.gmf.esb.LogMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.LogProperty;
import org.wso2.developerstudio.eclipse.gmf.esb.NamespacedProperty;
import org.wso2.developerstudio.eclipse.gmf.esb.PropertyValueType;

public class LogMediatorDeserializer extends AbstractEsbNodeDeserializer<AbstractMediator,LogMediator> {

	
	public LogMediator createNode(AbstractMediator mediator) {
		
		Assert.isTrue(mediator instanceof org.apache.synapse.mediators.builtin.LogMediator, "Invalid Mediator.");
		
		org.apache.synapse.mediators.builtin.LogMediator logMediator = (org.apache.synapse.mediators.builtin.LogMediator)mediator;
		
		LogMediator vishualLog = EsbFactory.eINSTANCE.createLogMediator();
		
		switch (logMediator.getCategory()) {
		
		case org.apache.synapse.mediators.builtin.LogMediator.CATEGORY_DEBUG:
			vishualLog.setLogCategory(LogCategory.DEBUG);
			break;

		case org.apache.synapse.mediators.builtin.LogMediator.CATEGORY_ERROR:
			vishualLog.setLogCategory(LogCategory.ERROR);
			break;

		case org.apache.synapse.mediators.builtin.LogMediator.CATEGORY_FATAL:
			vishualLog.setLogCategory(LogCategory.FATAL);
			break;

		case org.apache.synapse.mediators.builtin.LogMediator.CATEGORY_INFO:
			vishualLog.setLogCategory(LogCategory.INFO);
			break;
		case org.apache.synapse.mediators.builtin.LogMediator.CATEGORY_TRACE:
			vishualLog.setLogCategory(LogCategory.TRACE);
			break;

		case org.apache.synapse.mediators.builtin.LogMediator.CATEGORY_WARN:
			vishualLog.setLogCategory(LogCategory.WARN);
			break;
		}
		
		
		switch(logMediator.getLogLevel()){
		
		case org.apache.synapse.mediators.builtin.LogMediator.CUSTOM:
			vishualLog.setLogLevel(LogLevel.CUSTOM);
			break;
			
		case org.apache.synapse.mediators.builtin.LogMediator.FULL:
			vishualLog.setLogLevel(LogLevel.FULL);
			break;
		
		case org.apache.synapse.mediators.builtin.LogMediator.HEADERS:
			vishualLog.setLogLevel(LogLevel.HEADERS);
			break;
		
		case org.apache.synapse.mediators.builtin.LogMediator.SIMPLE:
			vishualLog.setLogLevel(LogLevel.SIMPLE);
			
		}
		
		
		if (!StringUtils.isBlank(logMediator.getSeparator())) {
			
			vishualLog.setLogSeparator(logMediator.getSeparator());
		}
		
		
		for(MediatorProperty mediatorProprety : logMediator.getProperties()){
			
			LogProperty logProperty = EsbFactory.eINSTANCE.createLogProperty();
			
			logProperty.setPropertyName(mediatorProprety.getName());
			
			if(mediatorProprety.getValue() != null){
				
				logProperty.setPropertyValueType(PropertyValueType.LITERAL);
				logProperty.setPropertyValue(mediatorProprety.getValue());
				
			}else if(mediatorProprety.getExpression() != null){
				
				logProperty.setPropertyValueType(PropertyValueType.EXPRESSION);
				NamespacedProperty namespaceProp = EsbFactory.eINSTANCE.createNamespacedProperty();
				namespaceProp.setPropertyValue(mediatorProprety.getExpression().toString());
				logProperty.setPropertyExpression(namespaceProp);
				
			}
			
			vishualLog.getProperties().add(logProperty);
		}
		
		
		return vishualLog;
	}
  
	
}
