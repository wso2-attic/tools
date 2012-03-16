package org.wso2.developerstudio.eclipse.artifact.sequence.validators;

import org.apache.axiom.om.OMElement;
import org.eclipse.core.resources.IResource;
import org.wso2.developerstudio.eclipse.artifact.sequence.model.SequenceModel;
import org.wso2.developerstudio.eclipse.platform.core.exception.FieldValidationException;
import org.wso2.developerstudio.eclipse.platform.core.model.AbstractFieldController;
import org.wso2.developerstudio.eclipse.platform.core.project.model.ProjectDataModel;

import java.io.File;
import java.util.List;

public class SequenceProjectFieldController extends AbstractFieldController {

	
	public void validate(String modelProperty, Object value, ProjectDataModel model)
	        throws FieldValidationException {
		if (modelProperty.equals("sequence.name")) {
			if (value == null) {
				throw new FieldValidationException("Sequence name cannot be empty");
			}
			String epName = value.toString();
			if (epName.trim().equals("")) {
				throw new FieldValidationException("Sequence name cannot be empty");
			}
		} else if (modelProperty.equals("import.file")) {
			if (value == null) {
				throw new FieldValidationException("Specified Sequence configuration file location is invalid");
			}
			File seqFile = (File) value;
			if (!seqFile.exists()) {
				throw new FieldValidationException("Specified configuration file doesn't exist");
			}
		}  else if (modelProperty.equals("save.file")) {
			IResource resource = (IResource)value;
			if(!resource.exists())	
				throw new FieldValidationException("Specified project or path doesn't exist");
		}

	}

	
	public boolean isEnableField(String modelProperty, ProjectDataModel model) {
		boolean enableField = super.isEnableField(modelProperty, model);
		if (modelProperty.equals("reg.path")) {
			enableField = ((SequenceModel) model).isSaveAsDynamic();
		} else if (modelProperty.equals("import.file")) {
			enableField = true;
		}
		return enableField;
	}

	
	public List<String> getUpdateFields(String modelProperty, ProjectDataModel model) {
		List<String> updateFields = super.getUpdateFields(modelProperty, model);
		if (modelProperty.equals("dynamic.sequence")) {
			updateFields.add("reg.path");
		} else if (modelProperty.equals("import.file")) {
			updateFields.add("available.sequences");
		} else if (modelProperty.equals("create.esb.prj")) {
			updateFields.add("save.file");
		}
		return updateFields;
	}

	
	public boolean isVisibleField(String modelProperty, ProjectDataModel model) {
		boolean visibleField = super.isVisibleField(modelProperty, model);
		if (modelProperty.equals("available.sequences")) {
			List<OMElement> availableSeqList = ((SequenceModel) model).getAvailableSeqList();
			visibleField = (availableSeqList != null && availableSeqList.size() > 0);
		}
		return visibleField;

	}
	
	public boolean isReadOnlyField(String modelProperty, ProjectDataModel model) {
		boolean readOnlyField = super.isReadOnlyField(modelProperty, model);
		if (modelProperty.equals("save.file")) {
			readOnlyField = true;
		}
	    return readOnlyField;
	}

}
