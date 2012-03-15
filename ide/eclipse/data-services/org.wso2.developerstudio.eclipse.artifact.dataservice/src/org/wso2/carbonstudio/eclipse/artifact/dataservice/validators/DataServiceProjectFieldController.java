package org.wso2.carbonstudio.eclipse.artifact.dataservice.validators;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.wso2.carbonstudio.eclipse.platform.core.exception.FieldValidationException;
import org.wso2.carbonstudio.eclipse.platform.core.model.AbstractFieldController;
import org.wso2.carbonstudio.eclipse.platform.core.project.model.ProjectDataModel;

import java.io.File;

public class DataServiceProjectFieldController extends AbstractFieldController {

	
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
		} else if (modelProperty.equals("import.file")) {
			if (value == null) {
				throw new FieldValidationException("Specified dbs file location is invalid");
			}
			File warFile = (File) value;
			if (!warFile.exists()) {
				throw new FieldValidationException("Specified dbs file doesn't exist");
			}
		} else if (modelProperty.equals("service.name")) {
			if (value == null || value.equals("")) {
				throw new FieldValidationException("Data service name cannot be empty");
			}
			
		}

	}

}
