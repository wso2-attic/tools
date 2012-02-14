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

package org.wso2.carbonstudio.eclipse.artifact.registry.validators;

import java.io.File;
import java.util.List;

import org.eclipse.core.resources.IResource;
import org.wso2.carbonstudio.eclipse.artifact.registry.utils.RegistryArtifactConstants;
import org.wso2.carbonstudio.eclipse.platform.core.exception.FieldValidationException;
import org.wso2.carbonstudio.eclipse.platform.core.model.AbstractFieldController;
import org.wso2.carbonstudio.eclipse.platform.core.project.model.ProjectDataModel;

public class RegistryArtifactFieldController extends AbstractFieldController {

	
	
	public void validate(String modelProperty, Object value,
			ProjectDataModel model) throws FieldValidationException {
		if (modelProperty.equals(RegistryArtifactConstants.DATA_REG_LOCATION)) {
			if (value == null) {
				throw new FieldValidationException("Registry path cannot be empty");
			}
			String regPath = value.toString();
			if (regPath.trim().equals("")) {
				throw new FieldValidationException("Registry path cannot be empty");
			}
		} else if (modelProperty.equals(RegistryArtifactConstants.DATA_RESOURCE_NAME)) {
			if (value == null) {
				throw new FieldValidationException("Resource name cannot be empty");
			}
			String resource = value.toString();
			if (resource.trim().equals("")) {
				throw new FieldValidationException("Resource name cannot be empty");
			}
		} else if (modelProperty.equals(RegistryArtifactConstants.DATA_IMPORT_FILE)) {
			if (value == null) {
				throw new FieldValidationException("Specified resource location is invalid");
			}
			File resource = (File) value;
			if (!resource.exists()) {
				throw new FieldValidationException("Specified resource doesn't exist");
			} 
		} else if (modelProperty.equals("save.file")) {
			IResource resource = (IResource)value;
			if(!resource.exists())	
				throw new FieldValidationException("Specified project or path doesn't exist");
		}
	}
	

public boolean isEnableField(String modelProperty, ProjectDataModel model) {
	boolean enableField = super.isEnableField(modelProperty, model);
	if (modelProperty.equals(RegistryArtifactConstants.DATA_COPY_CONTENT)) {
		File file = (File) model.getModelPropertyValue(RegistryArtifactConstants.DATA_IMPORT_FILE);
		if(file!=null) {
			if(file.isDirectory()){
				enableField=true;	
			}
			else{
				enableField=false;
			}
		}
		else{
			enableField=false;
		}
			
	}
	return enableField;
}
	
	
	public List<String> getUpdateFields(String modelProperty,
			ProjectDataModel model) {
		List<String> updateFields = super.getUpdateFields(modelProperty, model);
		if (modelProperty.equals(RegistryArtifactConstants.DATA_IMPORT_FILE)) {
			updateFields.add(RegistryArtifactConstants.DATA_COPY_CONTENT);
		}  else if (modelProperty.equals("create.prj")) {
			updateFields.add("save.file");
		} 
		return updateFields;
	}

}
