/*
 * Copyright (c) WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
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

package org.wso2.developerstudio.eclipse.artifact.messagestore.validator;

import java.util.List;

import org.wso2.developerstudio.eclipse.artifact.messagestore.model.MessageStoreModel;
import org.wso2.developerstudio.eclipse.artifact.messagestore.validator.MessageStoreTypeList.MessageStoreType;
import org.wso2.developerstudio.eclipse.platform.core.exception.FieldValidationException;
import org.wso2.developerstudio.eclipse.platform.core.model.AbstractFieldController;
import org.wso2.developerstudio.eclipse.platform.core.project.model.ProjectDataModel;
import static org.wso2.developerstudio.eclipse.artifact.messagestore.Constants.*;

/**
 * The controller class for message-store artifact wizard specific fields.
 */
public class MessageStoreFieldController  extends AbstractFieldController  {

	@Override
	public void validate(String modelProperty, Object value,
			ProjectDataModel model) throws FieldValidationException {
		
	}
	
	@Override
	public List<String> getUpdateFields(String modelProperty,
			ProjectDataModel model) {
		List<String> updateFields = super.getUpdateFields(modelProperty, model);
		if (modelProperty.equals(FIELD_STORE_TYPE)) {
			updateFields.add(FIELD_JMS_CONTEXT_FACTORY);
			updateFields.add(FIELD_JMS_PROVIDER_URL);
			updateFields.add(FIELD_JMS_QUEUE_NAME);
			updateFields.add(FIELD_JMS_CONNECTION_FACTORY);
			updateFields.add(FIELD_JMS_USER_NAME);
			updateFields.add(FIELD_JMS_PASSWORD);
			updateFields.add(FIELD_JMS_API_VERSION);
			updateFields.add(FIELD_JMS_QUEUE_NAME);
			updateFields.add(FIELD_JMS_ENABLE_CACHING);
			updateFields.add(FIELD_JMS_TIMEOUT);
			updateFields.add(FIELD_CUSTOM_PROVIDER_CLASS);
		}
		return updateFields;
	}
	
	@Override
	public boolean isVisibleField(String modelProperty, ProjectDataModel model) {
		boolean visibleField = super.isVisibleField(modelProperty, model);
		if(modelProperty.startsWith("jms.")){
			visibleField = ((MessageStoreModel)model).getMessageStoreType()==MessageStoreType.JMS;
		} else if(modelProperty.equals(FIELD_CUSTOM_PROVIDER_CLASS)){
			visibleField = ((MessageStoreModel)model).getMessageStoreType()==MessageStoreType.CUSTOM;
		} 
		
		return visibleField;
	}

}
