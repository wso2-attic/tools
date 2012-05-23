package org.wso2.developerstudio.eclipse.artifact.ds.validator.validators;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.wso2.developerstudio.eclipse.platform.core.exception.FieldValidationException;
import org.wso2.developerstudio.eclipse.platform.core.model.AbstractFieldController;
import org.wso2.developerstudio.eclipse.platform.core.project.model.ProjectDataModel;

public class ValidatorFieldsController extends AbstractFieldController {

	
	public void validate(String modelProperty, Object value,
			ProjectDataModel model) throws FieldValidationException {
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
		if(modelProperty.equals("vaildatorClass.package.name")){
			if (value == null) {
				throw new FieldValidationException("Package name cannot be empty");
			}
			String projectName = value.toString();
			if (projectName.trim().equals("")) {
				throw new FieldValidationException("Package name cannot be empty");
			}
		}
		if(modelProperty.equals("vaildatorClass.name")){
			String className = value.toString();
			if ("".equals(className)) {
				throw new FieldValidationException("Class Name cannot be empty !");
			}
		    if(className.indexOf(".") > 0){
				throw new FieldValidationException("Class Name must not be qualified !");
			}
		}
		if(modelProperty.equals("import.project.list")){
			if ((value == null)||(value.equals(""))) {
				throw new FieldValidationException("No vaild projets available in workspace");
			}
		}
	}
}
