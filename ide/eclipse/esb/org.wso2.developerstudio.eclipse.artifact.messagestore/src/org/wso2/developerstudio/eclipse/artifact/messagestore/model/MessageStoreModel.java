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

package org.wso2.developerstudio.eclipse.artifact.messagestore.model;

import org.wso2.developerstudio.eclipse.artifact.messagestore.Activator;
import org.wso2.developerstudio.eclipse.artifact.messagestore.Constants;
import org.wso2.developerstudio.eclipse.artifact.messagestore.validator.MessageStoreTypeList.MessageStoreType;
import org.wso2.developerstudio.eclipse.logging.core.IDeveloperStudioLog;
import org.wso2.developerstudio.eclipse.logging.core.Logger;
import org.wso2.developerstudio.eclipse.platform.core.exception.ObserverFailedException;
import org.wso2.developerstudio.eclipse.platform.core.project.model.ProjectDataModel;

/**
 * The model class for message-store artifact wizard specific objects.
 */
public class MessageStoreModel extends ProjectDataModel  {
	
	/*logger*/
	private static IDeveloperStudioLog log=Logger.getLog(Activator.PLUGIN_ID);
	
	/* model data*/
	private MessageStoreType messageStoreType = MessageStoreType.JMS;

	public MessageStoreType getMessageStoreType() {
		return messageStoreType;
	}

	public void setMessageStoreType(MessageStoreType messageStoreType) {
		this.messageStoreType = messageStoreType;
	}
	
	@Override
	public Object getModelPropertyValue(String key) {
		Object value = super.getModelPropertyValue(key);
		if (key.equals(Constants.FIELD_STORE_TYPE)) {
			value = getMessageStoreType();
		} 
		return value;
	}
	
	@Override
	public boolean setModelPropertyValue(String key, Object data)
			throws ObserverFailedException {
		boolean result = super.setModelPropertyValue(key, data);
		if (key.equals(Constants.FIELD_STORE_TYPE)) {
			setMessageStoreType((MessageStoreType) data);
		}
		return result;
	}

}
