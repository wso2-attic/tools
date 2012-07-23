package org.wso2.developerstudio.eclipse.artifact.cep.validators;

import java.io.File;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;

import org.wso2.developerstudio.eclipse.platform.core.exception.FieldValidationException;
import org.wso2.developerstudio.eclipse.platform.core.model.AbstractFieldController;
import org.wso2.developerstudio.eclipse.platform.core.project.model.ProjectDataModel;

public class CEPProjectFieldController extends AbstractFieldController {

	public void validate(String modelProperty, Object value,
			ProjectDataModel model) throws FieldValidationException {
		if (modelProperty.equals("project.name")) {
			if (value == null) {
				throw new FieldValidationException(
						"Bucket name cannot be empty");
			}
			String projectName = value.toString();
			if (projectName.trim().equals("")) {
				throw new FieldValidationException(
						"Bucket name cannot be empty");
			}
			IProject project = ResourcesPlugin.getWorkspace().getRoot()
					.getProject(projectName);
			if (project.exists()) {
				throw new FieldValidationException("Bucket with the name '"
						+ projectName + "' already exists");
			}

		}

		else if (modelProperty.equals("import.file")) {
			if (value == null) {
				throw new FieldValidationException(
						"Specified xml file location is invalid");
			}
			File warFile = (File) value;
			if (!warFile.exists()) {
				throw new FieldValidationException(
						"Specified xml file doesn't exist");
			}
		}

	}
}
