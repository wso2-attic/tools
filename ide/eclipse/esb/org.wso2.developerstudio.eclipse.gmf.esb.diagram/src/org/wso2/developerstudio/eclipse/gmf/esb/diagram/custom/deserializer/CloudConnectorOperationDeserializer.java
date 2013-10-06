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

import static org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage.Literals.*;
import java.util.Map;
import org.apache.synapse.mediators.AbstractMediator;
import org.apache.synapse.mediators.Value;
import org.eclipse.core.runtime.Assert;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.CallTemplateParameter;
import org.wso2.developerstudio.eclipse.gmf.esb.CloudConnectorOperation;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbFactory;
import org.wso2.developerstudio.eclipse.gmf.esb.NamespacedProperty;
import org.wso2.developerstudio.eclipse.gmf.esb.RuleOptionType;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.providers.EsbElementTypes;
import org.wso2.developerstudio.eclipse.gmf.esb.internal.persistence.custom.CloudConnectorOperationExt;

public class CloudConnectorOperationDeserializer extends AbstractEsbNodeDeserializer<AbstractMediator, CloudConnectorOperation>{

	@Override
	public CloudConnectorOperation createNode(IGraphicalEditPart part, AbstractMediator object) {
		Assert.isTrue(object instanceof CloudConnectorOperationExt,"Unsupported mediator passed in for deserialization");
		CloudConnectorOperationExt operation = (CloudConnectorOperationExt) object;
		
		final CloudConnectorOperation operationModel = (CloudConnectorOperation) DeserializerUtils.createNode(part, EsbElementTypes.CloudConnectorOperation_3722);
		setElementToEdit(operationModel);
		executeSetValueCommand(CLOUD_CONNECTOR_OPERATION__CONFIG_REF, operation.getConfigRef());
		executeSetValueCommand(CLOUD_CONNECTOR_OPERATION__OPERATION_NAME, operation.getOperation());
		executeSetValueCommand(CLOUD_CONNECTOR_OPERATION__CONNECTOR_NAME, operation.getConnector());		
		
		Map<String, Value> parameters = operation.getpName2ExpressionMap();
		for(Map.Entry<String, Value> entry : parameters.entrySet()){
			CallTemplateParameter parameter = EsbFactory.eINSTANCE.createCallTemplateParameter();
			parameter.setParameterName(entry.getKey());
			Value value = entry.getValue();
			if(value.getExpression() != null){
				boolean dynamic = value.hasExprTypeKey();
				NamespacedProperty namespacedProperty = createNamespacedProperty(value.getExpression());
				namespacedProperty.setDynamic(dynamic);
				namespacedProperty.setSupportsDynamicXPaths(true);
				parameter.setParameterExpression(namespacedProperty);
				parameter.setTemplateParameterType(RuleOptionType.EXPRESSION);
			} else{
				parameter.setParameterValue(value.getKeyValue());
				parameter.setTemplateParameterType(RuleOptionType.VALUE);
			}
			executeAddValueCommand(operationModel.getConnectorParameters(), parameter);
		}		
		return operationModel;
	}
}
