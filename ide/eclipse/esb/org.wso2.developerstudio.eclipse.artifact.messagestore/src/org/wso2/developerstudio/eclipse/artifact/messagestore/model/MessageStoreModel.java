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

import static org.wso2.developerstudio.eclipse.platform.core.utils.Constants.ESB_PROJECT_NATURE;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.wso2.developerstudio.eclipse.artifact.messagestore.Activator;
import org.wso2.developerstudio.eclipse.artifact.messagestore.Constants;
import org.wso2.developerstudio.eclipse.artifact.messagestore.provider.MessageStoreTypeList.MessageStoreType;
import org.wso2.developerstudio.eclipse.esb.project.utils.ESBProjectUtils;
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
	private String customProviderClass;
	private String jmsApiVersion;
	private String jmsConnectionFactory;
	private String jmsContextFactory;
	private String jmsPassword;
	private String jmsProviderUrl;
	private String jmsQueueName;
	private boolean jmsEnableCaching;
	private int jmsTimeout;
	private String jmsUsername;
	private String storeName;
	private IContainer saveLocation;
	private Map<String,String> customParameters = new HashMap<String,String>();

	public MessageStoreType getMessageStoreType() {
		return messageStoreType;
	}

	public String getCustomProviderClass() {
		return customProviderClass;
	}

	public void setCustomProviderClass(String customProviderClass) {
		this.customProviderClass = customProviderClass;
	}

	public String getJmsApiVersion() {
		return jmsApiVersion;
	}

	public void setJmsApiVersion(String jmsApiVersion) {
		this.jmsApiVersion = jmsApiVersion;
	}

	public String getJmsConnectionFactory() {
		return jmsConnectionFactory;
	}

	public void setJmsConnectionFactory(String jmsConnectionFactory) {
		this.jmsConnectionFactory = jmsConnectionFactory;
	}

	public String getJmsContextFactory() {
		return jmsContextFactory;
	}

	public void setJmsContextFactory(String jmsContextFactory) {
		this.jmsContextFactory = jmsContextFactory;
	}

	public String getJmsPassword() {
		return jmsPassword;
	}

	public void setJmsPassword(String jmsPassword) {
		this.jmsPassword = jmsPassword;
	}

	public String getJmsProviderUrl() {
		return jmsProviderUrl;
	}

	public void setJmsProviderUrl(String jmsProviderUrl) {
		this.jmsProviderUrl = jmsProviderUrl;
	}

	public String getJmsQueueName() {
		return jmsQueueName;
	}

	public void setJmsQueueName(String jmsQueueName) {
		this.jmsQueueName = jmsQueueName;
	}

	public boolean getJmsEnableCaching() {
		return jmsEnableCaching;
	}

	public void setJmsEnableCaching(boolean jmsEnableCaching) {
		this.jmsEnableCaching = jmsEnableCaching;
	}

	public int getJmsTimeout() {
		return jmsTimeout;
	}

	public void setJmsTimeout(int jmsTimeout) {
		this.jmsTimeout = jmsTimeout;
	}

	public String getJmsUsername() {
		return jmsUsername;
	}

	public void setJmsUsername(String jmsUsername) {
		this.jmsUsername = jmsUsername;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public Map<String, String> getCustomParameters() {
		return customParameters;
	}

	public void setMessageStoreType(MessageStoreType messageStoreType) {
		this.messageStoreType = messageStoreType;
	}
	
	@Override
	public Object getModelPropertyValue(String key) {
		Object value = super.getModelPropertyValue(key);
		if (key.equals(Constants.FIELD_STORE_TYPE)) {
			value = getMessageStoreType();
		} else if (key.equals(Constants.FIELD_CUSTOM_PROVIDER_CLASS)) {
			value = getCustomProviderClass();
		} else if (key.equals(Constants.FIELD_JMS_API_VERSION)) {
			value = getJmsApiVersion();
		} else if (key.equals(Constants.FIELD_JMS_CONNECTION_FACTORY)) {
			value = getJmsConnectionFactory();
		} else if (key.equals(Constants.FIELD_JMS_CONTEXT_FACTORY)) {
			value = getJmsContextFactory();
		} else if (key.equals(Constants.FIELD_JMS_PASSWORD)) {
			value = getJmsPassword();
		} else if (key.equals(Constants.FIELD_JMS_PROVIDER_URL)) {
			value = getJmsProviderUrl();
		} else if (key.equals(Constants.FIELD_JMS_QUEUE_NAME)) {
			value = getJmsQueueName();
		} else if (key.equals(Constants.FIELD_JMS_ENABLE_CACHING)) {
			value = getJmsEnableCaching();
		} else if (key.equals(Constants.FIELD_JMS_TIMEOUT)) {
			value = getJmsTimeout();
		} else if (key.equals(Constants.FIELD_JMS_USER_NAME)) {
			value = getJmsUsername();
		} else if (key.equals(Constants.FIELD_STORE_NAME)) {
			value = getStoreName();
		}  else if(key.equals(Constants.FIELD_SAVE_LOCATION)){
			value = getSaveLocation();
		}
		return value;
	}
	
	@Override
	public boolean setModelPropertyValue(String key, Object data)
			throws ObserverFailedException {
		boolean result = super.setModelPropertyValue(key, data);
		if (key.equals(Constants.FIELD_STORE_TYPE)) {
			setMessageStoreType((MessageStoreType) data);
		} else if (key.equals(Constants.FIELD_CUSTOM_PROVIDER_CLASS)) {
			setJmsApiVersion(data.toString());
		} else if (key.equals(Constants.FIELD_JMS_CONNECTION_FACTORY)) {
			setJmsConnectionFactory(data.toString());
		} else if (key.equals(Constants.FIELD_JMS_CONTEXT_FACTORY)) {
			setJmsContextFactory(data.toString());
		} else if (key.equals(Constants.FIELD_JMS_PASSWORD)) {
			setJmsPassword(data.toString());
		} else if (key.equals(Constants.FIELD_JMS_PROVIDER_URL)) {
			setJmsProviderUrl(data.toString());
		} else if (key.equals(Constants.FIELD_JMS_QUEUE_NAME)) {
			setJmsQueueName(data.toString());
		} else if (key.equals(Constants.FIELD_JMS_ENABLE_CACHING)) {
			try {
				setJmsEnableCaching(Boolean.parseBoolean(data.toString()));
			} catch (NumberFormatException e) {
				/*ignore*/
			}
		} else if (key.equals(Constants.FIELD_JMS_TIMEOUT)) {
			try {
				setJmsTimeout(Integer.parseInt(data.toString()));
			} catch (NumberFormatException e) {
				/*ignore*/
			}
		} else if (key.equals(Constants.FIELD_JMS_USER_NAME)) {
			setJmsUsername(data.toString());
		} else if (key.equals(Constants.FIELD_STORE_NAME)) {
			setStoreName(data.toString());
		} else if (key.equals(Constants.FIELD_CUSTOM_PROVIDER_CLASS)) {
			setCustomProviderClass(data.toString());
		} else if (key.equals(Constants.FIELD_CREATE_ESB_PRJ)) {
			Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
			IProject esbProject = ESBProjectUtils.createESBProject(shell);
			if(esbProject!=null){
				setSaveLocation(esbProject);
			}
		} else if(key.equals(Constants.FIELD_SAVE_LOCATION)){
			setSaveLocation((IContainer) data);
		}
		return result;
	}
	
	@Override
	public void setLocation(File location) {
		super.setLocation(location);
		File absolutionPath = getLocation();
		if (getSaveLocation() == null && absolutionPath != null) {
			IContainer newSaveLocation =
			        getContainer(absolutionPath, ESB_PROJECT_NATURE);
			setSaveLocation(newSaveLocation);
		}
	}
	public static IContainer getContainer(File absolutionPath, String projectNature) {
		IProject[] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
		int length = 0;
		IProject currentSelection = null;
		for (IProject project : projects) {
			try {
				if (project.isOpen() && project.hasNature(projectNature)) {
					File projectLocation = project.getLocation().toFile();
					int projectLocationLength = projectLocation.toString().length();
					if (projectLocationLength > length &&
					    projectLocationLength <= absolutionPath.toString().length()) {
						if (absolutionPath.toString().startsWith(projectLocation.toString())) {
							length = projectLocationLength;
							currentSelection = project;
						}
					}
				}
			} catch (CoreException e) {
				log.error("An unexpected error has occurred", e);
			}
		}
		IContainer newSaveLocation = null;
		if (currentSelection != null) {
			String path =
			        absolutionPath.toString().substring(
			                                            currentSelection.getLocation().toFile()
			                                                    .toString().length());

			if (path.equals("")) {
				newSaveLocation = currentSelection;
			} else {
				newSaveLocation = currentSelection.getFolder(path);
			}
		}
		return newSaveLocation;
	}

	public IContainer getSaveLocation() {
		return saveLocation;
	}

	public void setSaveLocation(IContainer saveLocation) {
		this.saveLocation = saveLocation;
	}

}
