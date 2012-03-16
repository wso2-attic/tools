package org.wso2.developerstudio.eclipse.artifact.synapse.validators;

import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.wso2.developerstudio.eclipse.artifact.synapse.model.SynapseModel;
import org.wso2.developerstudio.eclipse.platform.core.exception.FieldValidationException;
import org.wso2.developerstudio.eclipse.platform.core.model.AbstractFieldController;
import org.wso2.developerstudio.eclipse.platform.core.project.model.ProjectDataModel;

public class SynapseFieldsController extends AbstractFieldController {

	
	public void validate(String modelProperty, Object value,
			ProjectDataModel model) throws FieldValidationException {
		if (modelProperty.equals("config.name")) {
			if (value == null) {
				throw new FieldValidationException("Synapse configuration name cannot be empty");
			}
			String projectName = value.toString();
			if (projectName.trim().equals("")) {
				throw new FieldValidationException("Synapse configuration name cannot be empty");
			}
			IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);

			if (project.exists()) {
				throw new FieldValidationException("Synapse configuration name cannot be match with the project name ");
			}	
		
		}  else if (modelProperty.equals("save.file")) {
			IResource resource = (IResource)value;
			if(!resource.exists())	
				throw new FieldValidationException("Specified project or path doesn't exist");
		}
	}
	
    public List<String> getUpdateFields(String modelProperty,ProjectDataModel model) {
    	List<String> updateFields = super.getUpdateFields(modelProperty, model);
    	if(modelProperty.equals("create.esb.prj")){
    		updateFields.add("save.file");
    	}
    	if(modelProperty.equals("create.esb.af")){
    		updateFields.add("available.af"); 
    	}
    	return updateFields;
    }
    
    public boolean isVisibleField(String modelProperty, ProjectDataModel model) {
    	boolean isEnable = super.isEnableField(modelProperty, model);
    	if(modelProperty.equals("available.af")){
    		isEnable=((SynapseModel)model).isESBartifactsCreate(); 
    	}    	
    	return isEnable;
    }
    
	public boolean isReadOnlyField(String modelProperty, ProjectDataModel model) {
		boolean readOnlyField = super.isReadOnlyField(modelProperty, model);
		if (modelProperty.equals("save.file")) {
			readOnlyField = true;
		}
	    return readOnlyField;
	}
}
