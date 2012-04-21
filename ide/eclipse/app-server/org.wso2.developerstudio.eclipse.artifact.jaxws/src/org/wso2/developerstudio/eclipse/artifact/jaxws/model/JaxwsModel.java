/*
 * Copyright (c) 2011, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
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

package org.wso2.developerstudio.eclipse.artifact.jaxws.model;


import org.wso2.developerstudio.eclipse.platform.core.exception.ObserverFailedException;
import org.wso2.developerstudio.eclipse.platform.core.project.model.ProjectDataModel;
import org.wso2.developerstudio.eclipse.utils.project.ProjectUtils;

public class JaxwsModel extends ProjectDataModel {
	private String sourcePackage;
	private String cxfRuntime;
	

	
	public Object getModelPropertyValue(String key) {
		Object modelPropertyValue = super.getModelPropertyValue(key);
		if (modelPropertyValue == null) {
			if (key.equalsIgnoreCase("runtime")) {
			modelPropertyValue = getCXFRuntime();
			}
		}
		return modelPropertyValue;
	}

	
	public boolean setModelPropertyValue(String key, Object data) throws ObserverFailedException {
		boolean returnValue = super.setModelPropertyValue(key, data);
		if (key.equals("import.file")) {
			if (getImportFile() != null && !getImportFile().toString().equals("")) {
				setProjectName(ProjectUtils.fileNameWithoutExtension(getImportFile().getName()));
			}
		} else if (key.equals("source.package")) {
			setSourcePackage(data.toString());
		} else if (key.equalsIgnoreCase("runtime")) {
			setCXFRuntime(data.toString());
		}
		return returnValue;
	}
	
	public void setSourcePackage(String sourcePackage){
		this.sourcePackage = sourcePackage;
	}
	
	public String getSourcePackage(){
		return this.sourcePackage;
	}

	public void setCXFRuntime(String cXFRuntime) {
		cxfRuntime = cXFRuntime;
	}


	public String getCXFRuntime() {
		return cxfRuntime;
	}
	
}
