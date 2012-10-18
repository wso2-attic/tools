package org.wso2.developerstudio.eclipse.artifact.brs.validator;

import org.wso2.developerstudio.eclipse.artifact.brs.utils.RuleServiceArtifactConstants;
import org.wso2.developerstudio.eclipse.platform.core.exception.FieldValidationException;
import org.wso2.developerstudio.eclipse.platform.core.model.AbstractFieldController;
import org.wso2.developerstudio.eclipse.platform.core.project.model.ProjectDataModel;
import org.wso2.developerstudio.eclipse.platform.ui.validator.CommonFieldValidator;

public class ProjectFieldController extends AbstractFieldController {

	@Override
	public void validate(String modelProperty, Object value, ProjectDataModel model)
	throws FieldValidationException {

		if (modelProperty.equals(RuleServiceArtifactConstants.WIZARD_MODEL_PROPERTY_PROJECT_NAME)) {
			CommonFieldValidator.validateProjectField(value);
		}
		else if(modelProperty.equals(RuleServiceArtifactConstants.WIZARD_OPTION_IMPORT_FILE)){
			CommonFieldValidator.validateImportFile(value);
		}
		else if(modelProperty.equals(RuleServiceArtifactConstants.WIZARD_OPTION_SERVICE_NAME)){
			if(value==null || value.equals("")){
				throw new FieldValidationException("Rule service name cannot be empty");
			}

		}
	}




}
