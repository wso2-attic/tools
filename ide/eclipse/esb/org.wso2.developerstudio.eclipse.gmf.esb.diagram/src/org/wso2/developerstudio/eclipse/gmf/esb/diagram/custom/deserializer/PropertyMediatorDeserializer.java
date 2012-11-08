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
import java.util.regex.Pattern;

import org.apache.synapse.config.xml.XMLConfigConstants;
import org.apache.synapse.mediators.AbstractMediator;
import org.apache.synapse.util.xpath.SynapseXPath;
import org.eclipse.core.runtime.Assert;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbFactory;
import org.wso2.developerstudio.eclipse.gmf.esb.NamespacedProperty;
import org.wso2.developerstudio.eclipse.gmf.esb.PropertyAction;
import org.wso2.developerstudio.eclipse.gmf.esb.PropertyDataType;
import org.wso2.developerstudio.eclipse.gmf.esb.PropertyMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.PropertyScope;


public class PropertyMediatorDeserializer extends AbstractEsbNodeDeserializer<AbstractMediator,PropertyMediator> {
	
	public PropertyMediator createNode(AbstractMediator mediator) {
			
		Assert.isTrue(mediator instanceof org.apache.synapse.mediators.builtin.PropertyMediator, "Invalid Mediator.");
		
		org.apache.synapse.mediators.builtin.PropertyMediator propertyMediator = (org.apache.synapse.mediators.builtin.PropertyMediator)mediator;
		
		PropertyMediator vishualProp = EsbFactory.eINSTANCE.createPropertyMediator();
		
		if(propertyMediator.getName() != null){
			
			vishualProp.setPropertyName(propertyMediator.getName());
		}
		
		//For the remove action
		if(propertyMediator.getAction() == org.apache.synapse.mediators.builtin.PropertyMediator.ACTION_REMOVE){
			
			 vishualProp.setPropertyAction(PropertyAction.REMOVE);
			 vishualProp.setValueExpression(null);
			 vishualProp.setValueLiteral(null);
			 
		}else{
		//For the Set action
			 vishualProp.setPropertyAction(PropertyAction.SET);
			 
		//If it's an Expression
			if(propertyMediator.getExpression() != null){
				
				NamespacedProperty namespaceProp = EsbFactory.eINSTANCE.createNamespacedProperty();
				
				SynapseXPath xpath = propertyMediator.getExpression();
				
				namespaceProp.setPropertyValue(propertyMediator.getExpression().toString());
				
				if (xpath.getNamespaces() != null) {

					@SuppressWarnings("unchecked")
					Map<String, String> map = xpath.getNamespaces();

					namespaceProp.setNamespaces(map);
				}
				
				vishualProp.setValueExpression(namespaceProp);
				
		//If it's an Value		
			} else if(propertyMediator.getValue() != null){
				
				vishualProp.setValueLiteral(propertyMediator.getValue().toString());
				
			}
	    //Setting common things for both.
			String type  = propertyMediator.getType();
			
			if(type.equals(XMLConfigConstants.DATA_TYPES.STRING.toString())){
				
				vishualProp.setPropertyDataType(PropertyDataType.STRING);
				
			}else if(type.equals(XMLConfigConstants.DATA_TYPES.SHORT.toString())){
				
				vishualProp.setPropertyDataType(PropertyDataType.SHORT);
				
			}else if(type.equals(XMLConfigConstants.DATA_TYPES.OM.toString())){
				
				vishualProp.setPropertyDataType(PropertyDataType.OM);
				
			}else if(type.equals(XMLConfigConstants.DATA_TYPES.LONG.toString())){
				
				vishualProp.setPropertyDataType(PropertyDataType.LONG);
				
			}else if(type.equals(XMLConfigConstants.DATA_TYPES.INTEGER.toString())){
				
				vishualProp.setPropertyDataType(PropertyDataType.INTEGER);
				
			}else if(type.equals(XMLConfigConstants.DATA_TYPES.DOUBLE.toString())){
				
				vishualProp.setPropertyDataType(PropertyDataType.DOUBLE);
				
			}else if(type.equals(XMLConfigConstants.DATA_TYPES.FLOAT.toString())){
				
				vishualProp.setPropertyDataType(PropertyDataType.FLOAT);
				
			}else if(type.equals(XMLConfigConstants.DATA_TYPES.BOOLEAN.toString())){
				
				vishualProp.setPropertyDataType(PropertyDataType.BOOLEAN);
			}
				

			String scope = propertyMediator.getScope();
			
			if(scope.equals(XMLConfigConstants.SCOPE_AXIS2)){
				
				vishualProp.setPropertyScope(PropertyScope.AXIS2);
				
			}else if(scope.equals(XMLConfigConstants.SCOPE_CLIENT)){
				
				vishualProp.setPropertyScope(PropertyScope.AXIS2_CLIENT);
				
			}else if(scope.equals(XMLConfigConstants.SCOPE_DEFAULT)){
				
				vishualProp.setPropertyScope(PropertyScope.SYNAPSE);
				
			}else if(scope.equals(XMLConfigConstants.SCOPE_TRANSPORT)){
				
				vishualProp.setPropertyScope(PropertyScope.TRANSPORT);
			}
			
			
			Pattern pattern = propertyMediator.getPattern();
			if(pattern!=null)
				vishualProp.setValueStringPattern(pattern.toString());
		}
	
		return vishualProp;
	}


}
