package org.wso2.carbonstudio.eclipse.esb.project.controller;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.wso2.carbonstudio.eclipse.platform.core.exception.FieldValidationException;
import org.wso2.carbonstudio.eclipse.platform.core.model.AbstractFieldController;
import org.wso2.carbonstudio.eclipse.platform.core.project.model.ProjectDataModel;

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
