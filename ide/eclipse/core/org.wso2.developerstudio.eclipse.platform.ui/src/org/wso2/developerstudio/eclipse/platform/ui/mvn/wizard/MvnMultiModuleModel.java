/*
 * Copyright (c) 2012, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.developerstudio.eclipse.platform.ui.mvn.wizard;

import org.eclipse.core.resources.IProject;
import org.wso2.developerstudio.eclipse.platform.core.exception.ObserverFailedException;
import org.wso2.developerstudio.eclipse.platform.core.project.model.ProjectDataModel;

import java.util.ArrayList;
import java.util.List;

public class MvnMultiModuleModel extends ProjectDataModel  {
	private List<IProject> selectedProjects = new ArrayList<IProject>();



	private String groupId="com.example";
	private String artifactId="MavenParentProject";
    private String version="1.0.0";
    
	
	public Object getModelPropertyValue(String key) {
	  Object modelPropertyValue = super.getModelPropertyValue(key);
	  if((modelPropertyValue == null)&&("group.id".equals(key))){
		  modelPropertyValue = this.getGroupId();
	  }
	  if((modelPropertyValue == null)&&("artifact.id".equals(key))){
		  modelPropertyValue = this.getArtifactId();
	  }
	  if((modelPropertyValue == null)&&("version.id".equals(key))){
		  modelPropertyValue = this.getVersion();
	  }
	  
	  if (modelPropertyValue == null && key.equals("workspace.project")) {
		  modelPropertyValue = selectedProjects.toArray();
		}
	  
	  return modelPropertyValue;
	}
	
	
	public boolean setModelPropertyValue(String key, Object data) throws ObserverFailedException {
		boolean isUiControlUpdated = super.setModelPropertyValue(key, data);
		if ("group.id".equals(key)) {
			this.setGroupId(data.toString());
		}
		if("artifact.id".equals(key)){
			this.setArtifactId(data.toString());
		}
		if("version.id".equals(key)){
			this.setVersion(data.toString());
		}
		
		if (key.equals("workspace.project")) {
			Object[] selectedPrjs = (Object[]) data;
			selectedProjects.clear();
			for (Object object : selectedPrjs) {
				if (object instanceof IProject) {
					selectedProjects.add((IProject) object);
				}
			}
		}
		
		return isUiControlUpdated;
	}


	public String getGroupId() {
		return groupId;
	}


	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}


	public String getArtifactId() {
		return artifactId;
	}


	public void setArtifactId(String artifactId) {
		this.artifactId = artifactId;
	}


	public String getVersion() {
		return version;
	}


	public void setVersion(String version) {
		this.version = version;
	}

	public List<IProject> getSelectedProjects() {
		return selectedProjects;
	}
	
	
	public void setSelectedProjects(List<IProject> selectedProjects) {
		this.selectedProjects = selectedProjects;
	}
}
