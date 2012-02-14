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

package org.wso2.carbonstudio.eclipse.artifact.localentry.validators;

import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.axiom.om.OMElement;
import org.eclipse.core.resources.IResource;
import org.wso2.carbonstudio.eclipse.artifact.localentry.model.LocalEntryModel;
import org.wso2.carbonstudio.eclipse.artifact.localentry.utils.LocalEntryArtifactConstants;
import org.wso2.carbonstudio.eclipse.platform.core.exception.FieldValidationException;
import org.wso2.carbonstudio.eclipse.platform.core.model.AbstractFieldController;
import org.wso2.carbonstudio.eclipse.platform.core.project.model.ProjectDataModel;

public class LocalEntryProjectFieldController extends AbstractFieldController {

	public void validate(String modelProperty, Object value,
			ProjectDataModel model) throws FieldValidationException {
		if (modelProperty.equals(LocalEntryArtifactConstants.WIZARD_OPTION_LE_NAME)) {
			if (value == null) {
				throw new FieldValidationException("Local Entry name cannot be empty");
			}
			String localEntryName = value.toString();
			if (localEntryName.trim().equals("")) {
				throw new FieldValidationException("Local Entry name cannot be empty");
			}
		} else if (modelProperty.equals(LocalEntryArtifactConstants.WIZARD_OPTION_IMPORT_OPTION)) {
			if (value == null) {
				throw new FieldValidationException("Specified configuration file location is invalid");
			}
			File localEntryFile = (File) value;
			if (!localEntryFile.exists()) {
				throw new FieldValidationException("Specified configuration file doesn't exist");
			}
		} else if (modelProperty.equals("save.file")) {
			IResource resource = (IResource)value;
			if(!resource.exists())	
				throw new FieldValidationException("Specified project or path doesn't exist");
		}
		 
	}
	
	public boolean isVisibleField(String modelProperty, ProjectDataModel model) {
		boolean visibleField = super.isVisibleField(modelProperty, model);
		if(modelProperty.equals(LocalEntryArtifactConstants.WIZARD_OPTION_IN_LINE_TEXT_LE_VALUE) || 
		   modelProperty.equals(LocalEntryArtifactConstants.WIZARD_OPTION_IN_LINE_XML_LE_VALUE)  || 
		   modelProperty.equals(LocalEntryArtifactConstants.WIZARD_OPTION_IMPORT_SOURC_URL_LE_URL)){
			Map<String, List<String>> leTypeFieldProperties = getLETypeFieldProperties();
			List<String> list = leTypeFieldProperties.get(((LocalEntryModel) model).getSelectedLocalEntryType());
			
			if(list!= null){
				for (String control : list) {
					visibleField = false;
				}
				if (list.contains(modelProperty)) {
					visibleField = true;
				} else {
					visibleField = false;
				}
			}
		}

		
		
		if (modelProperty.equals(LocalEntryArtifactConstants.WIZARD_OPTION_AVAILABLE_LES)) {
			List<OMElement> availableLEList = ((LocalEntryModel) model).getAvailableLEList();
			visibleField = (availableLEList != null && availableLEList.size() > 0);
		}
		
		return visibleField;
	}
	
	private Map<String, List<String>> getLETypeFieldProperties() {
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		map.put(LocalEntryArtifactConstants.TYPE_IN_LINE_TEXT_LE, Arrays.asList(new String[] {LocalEntryArtifactConstants.WIZARD_OPTION_IN_LINE_TEXT_LE_VALUE}));
		map.put(LocalEntryArtifactConstants.TYPE_IN_LINE_XML_LE, Arrays.asList(new String[] {LocalEntryArtifactConstants.WIZARD_OPTION_IN_LINE_XML_LE_VALUE}));
		map.put(LocalEntryArtifactConstants.TYPE_SOURCE_URL_LE, Arrays.asList(new String[] {LocalEntryArtifactConstants.WIZARD_OPTION_IMPORT_SOURC_URL_LE_URL}));
		
		return map;
	}
	
	public List<String> getUpdateFields(String modelProperty, ProjectDataModel model) {
		List<String> updateFields = super.getUpdateFields(modelProperty, model);
		if (modelProperty.equals(LocalEntryArtifactConstants.WIZARD_OPTION_LE_TYPE)) {
			Map<String, List<String>> templateFieldProperties = getLETypeFieldProperties();
			for (List<String> fields : templateFieldProperties.values()) {
				updateFields.addAll(fields);
			}
		}else if(modelProperty.equals(LocalEntryArtifactConstants.WIZARD_OPTION_IMPORT_SOURC_URL_LE_URL)){
			updateFields.add(LocalEntryArtifactConstants.WIZARD_OPTION_IMPORT_SOURC_URL_LE_URL);
		}else if(modelProperty.equals(LocalEntryArtifactConstants.WIZARD_OPTION_IMPORT_FILE_PATH)){
			updateFields.add(LocalEntryArtifactConstants.WIZARD_OPTION_AVAILABLE_LES);
		}else if (modelProperty.equals(LocalEntryArtifactConstants.WIZARD_OPTION_CREATE_ESB_PROJECT)) {
			updateFields.add(LocalEntryArtifactConstants.WIZARD_OPTION_SAVE_LOCATION);
		}
		return updateFields;
	}
	
	public boolean isEnableField(String modelProperty, ProjectDataModel model) {
		boolean enableField = super.isEnableField(modelProperty, model);
		if(modelProperty.equals(LocalEntryArtifactConstants.WIZARD_OPTION_IMPORT_FILE_PATH)){
			enableField = true;
		}
		return enableField;
	}
	
	public boolean isReadOnlyField(String modelProperty, ProjectDataModel model) {
		boolean readOnlyField = super.isReadOnlyField(modelProperty, model);
		if (modelProperty.equals("save.file")) {
			readOnlyField = true;
		}
	    return readOnlyField;
	}
}
