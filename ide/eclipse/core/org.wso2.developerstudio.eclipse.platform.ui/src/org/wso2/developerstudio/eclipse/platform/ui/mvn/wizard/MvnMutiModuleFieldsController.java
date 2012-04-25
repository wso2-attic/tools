package org.wso2.developerstudio.eclipse.platform.ui.mvn.wizard;

import org.wso2.developerstudio.eclipse.platform.core.exception.FieldValidationException;
import org.wso2.developerstudio.eclipse.platform.core.model.AbstractFieldController;
import org.wso2.developerstudio.eclipse.platform.core.project.model.ProjectDataModel;

public class MvnMutiModuleFieldsController extends AbstractFieldController {

	
	public void validate(String modelProperty, Object value,
			ProjectDataModel model) throws FieldValidationException {
		if (modelProperty.equals("group.id")) {
			if ((value == null)||(value.equals(""))) {
				throw new FieldValidationException("The groupId cannot be empty");
			}
		} else if(modelProperty.equals("artifact.id")){
			if ((value == null)||(value.equals(""))) {
				throw new FieldValidationException("The artifactId cannot be empty");
			}
		} else if (modelProperty.equals("version.id")) {
			if ((value == null)||(value.equals(""))) {
				throw new FieldValidationException("The version cannot be empty");
			}
		} else if(modelProperty.equals("import.project.list")){
			if ((value == null)||(value.equals(""))) {
				throw new FieldValidationException("No vaild projects available in workspace");
			}
		}
	}
}

