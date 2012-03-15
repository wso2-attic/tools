package org.wso2.carbonstudio.eclipse.artifact.mediator.validators;

import org.wso2.carbonstudio.eclipse.platform.core.exception.FieldValidationException;
import org.wso2.carbonstudio.eclipse.platform.core.model.AbstractFieldController;
import org.wso2.carbonstudio.eclipse.platform.core.project.model.ProjectDataModel;
import org.wso2.carbonstudio.eclipse.platform.ui.validator.CommonFieldValidator;

public class MediatorFieldsController extends AbstractFieldController {

	@Override
	public void validate(String modelProperty, Object value,
			ProjectDataModel model) throws FieldValidationException {
		if (modelProperty.equals("project.name")) {
			CommonFieldValidator.validateProjectField(value);
		}
		 
		if(modelProperty.equals("mediatorClass.name")){
			CommonFieldValidator.validateJavaClassNameField(value);
		} else if (modelProperty.equals("mediatorClass.package.name")) {
			CommonFieldValidator.validateJavaPackageNameField(value);
		}
		
		if(modelProperty.equals("import.project.list")){
			if ((value == null)||(value.equals(""))) {
				throw new FieldValidationException("No vaild projets available in workspace");
			}
		}
	}
}
