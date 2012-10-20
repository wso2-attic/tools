/*
 * Copyright (c) 2012, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
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

package org.wso2.developerstudio.eclipse.artifact.synapse.api.model;

import java.io.File;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IProject;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.wso2.developerstudio.eclipse.artifact.synapse.api.util.ArtifactConstants;
import org.wso2.developerstudio.eclipse.esb.project.utils.ESBProjectUtils;
import org.wso2.developerstudio.eclipse.platform.core.exception.ObserverFailedException;
import org.wso2.developerstudio.eclipse.platform.core.project.model.ProjectDataModel;
import static org.wso2.developerstudio.eclipse.platform.core.utils.Constants.*;

/**
 * The model class for API artifact wizard specific objects.
 */
public class APIArtifactModel extends ProjectDataModel {
	
	private String name;
	private String context;
	private String hostname;
	private int port;
	private IContainer saveLocation;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContext() {
		return context;
	}
	public void setContext(String context) {
		this.context = context;
	}
	public String getHostname() {
		return hostname;
	}
	public void setHostname(String hostname) {
		this.hostname = hostname;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public IContainer getSaveLocation() {
		return saveLocation;
	}
	public void setSaveLocation(IContainer saveLocation) {
		this.saveLocation = saveLocation;
	}
	
	@Override
	public Object getModelPropertyValue(String key) {
		Object modelPropertyValue = super.getModelPropertyValue(key);
		if (modelPropertyValue == null) {
			if (key.equals(ArtifactConstants.ID_API_NAME)) {
				modelPropertyValue = getName();
			} else if (key.equals(ArtifactConstants.ID_API_CONTEXT)) {
				modelPropertyValue = getContext();
			} else if (key.equals(ArtifactConstants.ID_API_HOSTNAME)) {
				modelPropertyValue = getHostname();
			} else if (key.equals(ArtifactConstants.ID_API_PORT)) {
				modelPropertyValue = (getPort()!=0)?getPort():null;
			} else if (key.equals(ArtifactConstants.ID_SAVE_LOCATION)) {
				modelPropertyValue = getSaveLocation();
			} 
		}
		return modelPropertyValue;
	}
	
	@Override
	public boolean setModelPropertyValue(String key, Object data) throws ObserverFailedException {
		boolean result = super.setModelPropertyValue(key, data);
		if (key.equals(ArtifactConstants.ID_API_NAME)) {
			setName(data.toString());
		} else if (key.equals(ArtifactConstants.ID_API_CONTEXT)) {
			setContext(data.toString());
		} else if (key.equals(ArtifactConstants.ID_API_HOSTNAME)) {
			setHostname(data.toString());
		} else if (key.equals(ArtifactConstants.ID_API_PORT)) {
			try {
				setPort(Integer.parseInt(data.toString()));
			} catch (NumberFormatException e) {
				/*ignore*/
			}
		} else if (key.equals(ArtifactConstants.ID_SAVE_LOCATION)) {
			setSaveLocation((IContainer) data);
		} else if (key.contains(ArtifactConstants.ID_CREATE_PRJ)){
			Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
			IProject esbProject = ESBProjectUtils.createESBProject(shell);
			if(esbProject!=null){
				setSaveLocation(esbProject);
			}
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

}
