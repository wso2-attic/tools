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
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbFactory;
import org.wso2.developerstudio.eclipse.gmf.esb.LogCategory;
import org.wso2.developerstudio.eclipse.gmf.esb.LogLevel;
import org.wso2.developerstudio.eclipse.gmf.esb.LogMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.LogProperty;
import org.wso2.developerstudio.eclipse.gmf.esb.NamespacedProperty;
import org.wso2.developerstudio.eclipse.gmf.esb.PropertyValueType;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.providers.EsbElementTypes;

public class LogMediatorDeserializer extends AbstractEsbNodeDeserializer<AbstractMediator,LogMediator> {

	
	public LogMediator createNode(IGraphicalEditPart part, AbstractMediator mediator) {
		
		Assert.isTrue(mediator instanceof org.apache.synapse.mediators.builtin.LogMediator, "Unsupported mediator passed in for deserialization at "+ this.getClass());
		
		//Rorg.apache.synapse.mediators.builtin.LogMediator logMediator = (org.apache.synapse.mediators.builtin.LogMediator)mediator;
		
		LogMediator visualLog = (LogMediator) DeserializerUtils.createNode(part, EsbElementTypes.LogMediator_3495); //EsbFactory.eINSTANCE.createLogMediator();
		
		/*switch (logMediator.getCategory()) {
		
		case org.apache.synapse.mediators.builtin.LogMediator.CATEGORY_DEBUG:
			visualLog.setLogCategory(LogCategory.DEBUG);
			break;

		case org.apache.synapse.mediators.builtin.LogMediator.CATEGORY_ERROR:
			visualLog.setLogCategory(LogCategory.ERROR);
			break;

		case org.apache.synapse.mediators.builtin.LogMediator.CATEGORY_FATAL:
			visualLog.setLogCategory(LogCategory.FATAL);
			break;

		case org.apache.synapse.mediators.builtin.LogMediator.CATEGORY_INFO:
			visualLog.setLogCategory(LogCategory.INFO);
			break;
		case org.apache.synapse.mediators.builtin.LogMediator.CATEGORY_TRACE:
			visualLog.setLogCategory(LogCategory.TRACE);
			break;

		case org.apache.synapse.mediators.builtin.LogMediator.CATEGORY_WARN:
			visualLog.setLogCategory(LogCategory.WARN);
			break;
		}
		
		
		switch(logMediator.getLogLevel()){
		
		case org.apache.synapse.mediators.builtin.LogMediator.CUSTOM:
			visualLog.setLogLevel(LogLevel.CUSTOM);
			break;
			
		case org.apache.synapse.mediators.builtin.LogMediator.FULL:
			visualLog.setLogLevel(LogLevel.FULL);
			break;
		
		case org.apache.synapse.mediators.builtin.LogMediator.HEADERS:
			visualLog.setLogLevel(LogLevel.HEADERS);
			break;
		
		case org.apache.synapse.mediators.builtin.LogMediator.SIMPLE:
			visualLog.setLogLevel(LogLevel.SIMPLE);
			
		}
		
		
		if (!StringUtils.isBlank(logMediator.getSeparator())) {
			
			visualLog.setLogSeparator(logMediator.getSeparator());
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
			
			visualLog.getProperties().add(logProperty);
		}*/
		
		
		return visualLog;
	}

  
	
}
