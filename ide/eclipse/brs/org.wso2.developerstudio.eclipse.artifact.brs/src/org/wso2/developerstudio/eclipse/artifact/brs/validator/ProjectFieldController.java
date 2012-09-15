package org.wso2.developerstudio.eclipse.artifact.brs.validator;

import java.io.File;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.wso2.developerstudio.eclipse.artifact.brs.utils.RuleServiceArtifactConstants;
import org.wso2.developerstudio.eclipse.platform.core.exception.FieldValidationException;
import org.wso2.developerstudio.eclipse.platform.core.model.AbstractFieldController;
import org.wso2.developerstudio.eclipse.platform.core.project.model.ProjectDataModel;

public class ProjectFieldController extends AbstractFieldController {

	@Override
	public void validate(String modelProperty, Object value, ProjectDataModel model)
			throws FieldValidationException {

		if (modelProperty.equals(RuleServiceArtifactConstants.WIZARD_MODEL_PROPERTY_PROJECT_NAME)) {
			if (value == null) {
				throw new FieldValidationException(
						"Project name cannot be empty");
			}
			String projectName = value.toString();
			if (projectName.trim().equals("")) {
				throw new FieldValidationException(
						"Project name cannot be empty");
			}
			IProject project = ResourcesPlugin.getWorkspace().getRoot()
					.getProject(projectName);
			if (project.exists()) {
				throw new FieldValidationException("Project with the name '"
						+ projectName + "' already exists");
			}
		}
		else if(modelProperty.equals(RuleServiceArtifactConstants.WIZARD_OPTION_IMPORT_FILE)){
			if(value==null){
				throw new FieldValidationException("Specified file location is invalid");
			}
			File warfile=(File) value;
			if(!warfile.exists()){

				throw new FieldValidationException("Specified file does not exist");
			}
		}
		else if(modelProperty.equals(RuleServiceArtifactConstants.WIZARD_OPTION_SERVICE_NAME)){
			if(value==null || value.equals("")){
				throw new FieldValidationException("Rule service name cannot be empty");
			}

		}
	}

}
