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

package org.wso2.developerstudio.eclipse.esb.project.controller;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.wso2.developerstudio.eclipse.platform.core.exception.FieldValidationException;
import org.wso2.developerstudio.eclipse.platform.core.model.AbstractFieldController;
import org.wso2.developerstudio.eclipse.platform.core.project.model.ProjectDataModel;

public class ESBProjectFieldController extends AbstractFieldController {

	
	public void validate(String modelProperty, Object value, ProjectDataModel model)
	        throws FieldValidationException {
		if (modelProperty.equals("project.name")) {
			if (value == null) {
				throw new FieldValidationException("Project name cannot be empty");
			}
			String projectName = value.toString();
			if (projectName.trim().equals("")) {
				throw new FieldValidationException("Project name cannot be empty");
			}
			IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
			if (project.exists()) {
				throw new FieldValidationException("Project with the name '" + projectName +
				                                   "' already exists");
			}
		}
	}

}
