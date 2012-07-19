package org.wso2.developerstudio.eclipse.artifact.ds.validator.validators;

import org.wso2.developerstudio.eclipse.platform.core.exception.FieldValidationException;
import org.wso2.developerstudio.eclipse.platform.core.model.AbstractFieldController;
import org.wso2.developerstudio.eclipse.platform.core.project.model.ProjectDataModel;
import org.wso2.developerstudio.eclipse.platform.ui.validator.CommonFieldValidator;

public class ValidatorFieldsController extends AbstractFieldController {

	
	public void validate(String modelProperty, Object value,
			ProjectDataModel model) throws FieldValidationException {
		if (modelProperty.equals("project.name")) {
			CommonFieldValidator.validateProjectField(value);
		}
		if(modelProperty.equals("vaildatorClass.package.name")){
			CommonFieldValidator.validateJavaPackageNameField(value);
		}
		if(modelProperty.equals("vaildatorClass.name")){
			CommonFieldValidator.validateJavaClassNameField(value);
		}
		if(modelProperty.equals("import.project.list")){
			if ((value == null)||(value.equals(""))) {
				throw new FieldValidationException("No vaild projets available in workspace");
			}
		}
	}
}
