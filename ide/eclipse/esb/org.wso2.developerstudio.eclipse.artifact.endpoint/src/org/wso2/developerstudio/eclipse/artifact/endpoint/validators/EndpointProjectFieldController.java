package org.wso2.developerstudio.eclipse.artifact.endpoint.validators;

import org.apache.axiom.om.OMElement;
import org.eclipse.core.resources.IResource;
import org.wso2.developerstudio.eclipse.artifact.endpoint.model.EndpointModel;
import org.wso2.developerstudio.eclipse.platform.core.exception.FieldValidationException;
import org.wso2.developerstudio.eclipse.platform.core.model.AbstractFieldController;
import org.wso2.developerstudio.eclipse.platform.core.project.model.ProjectDataModel;

import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EndpointProjectFieldController extends AbstractFieldController {

	
	public void validate(String modelProperty, Object value, ProjectDataModel model)
	        throws FieldValidationException {
		if (modelProperty.equals("ep.name")) {
			if (value == null) {
				throw new FieldValidationException("Endpoint name cannot be empty");
			}
			String epName = value.toString();
			if (epName.trim().equals("")) {
				throw new FieldValidationException("Endpoint name cannot be empty");
			}
		} else if (modelProperty.equals("import.file")) {
			if (value == null) {
				throw new FieldValidationException("Specified configuration file location is invalid");
			}
			File epFile = (File) value;
			if (!epFile.exists()) {
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
			enableField = ((EndpointModel) model).isSaveAsDynamic();
		} else if (modelProperty.equals("import.file")) {
			enableField = true;
		}
		return enableField;
	}

	
	public List<String> getUpdateFields(String modelProperty, ProjectDataModel model) {
		List<String> updateFields = super.getUpdateFields(modelProperty, model);
		if (modelProperty.equals("dynamic.ep")) {
			updateFields.add("reg.path");
		} else if (modelProperty.equals("import.file")) {
			updateFields.add("available.eps");
		} else if (modelProperty.equals("create.esb.prj")) {
			updateFields.add("save.file");
		} else if (modelProperty.equals("ep.type")) {
			Map<String, List<String>> templateFieldProperties = getTemplateFieldProperties();
			for (List<String> fields : templateFieldProperties.values()) {
				updateFields.addAll(fields);
			}
		}
		return updateFields;
	}

	
	public boolean isVisibleField(String modelProperty, ProjectDataModel model) {
		boolean visibleField = super.isVisibleField(modelProperty, model);
		if (modelProperty.startsWith("templ.")) {
			Map<String, List<String>> templateFieldProperties = getTemplateFieldProperties();
			List<String> list =
			        templateFieldProperties.get(((EndpointModel) model).getSelectedTemplate()
			                .getId());
			for (String control : list) {
				visibleField = false;
			}

			if (list.contains(modelProperty)) {
				visibleField = true;
			} else {
				visibleField = false;
			}
		}

		if (modelProperty.equals("available.eps")) {
			List<OMElement> availableEPList = ((EndpointModel) model).getAvailableEPList();
			visibleField = (availableEPList != null && availableEPList.size() > 0);
		}
		return visibleField;

	}

	private Map<String, List<String>> getTemplateFieldProperties() {
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		map.put("org.wso2.developerstudio.eclipse.esb.template.ep2", Arrays.asList(new String[] {}));
		map.put("org.wso2.developerstudio.eclipse.esb.template.ep1", Arrays
		        .asList(new String[] { "templ.address.ep.uri" }));
		map.put("org.wso2.developerstudio.eclipse.esb.template.ep5", Arrays
		        .asList(new String[] { "templ.wsdl.ep.uri", "templ.wsdl.ep.service",
		                              "templ.wsdl.ep.port" }));
		map.put("org.wso2.developerstudio.eclipse.esb.template.ep3", Arrays.asList(new String[] {}));
		map.put("org.wso2.developerstudio.eclipse.esb.template.ep4", Arrays.asList(new String[] {}));
		map.put("org.wso2.developerstudio.eclipse.esb.template.ep0", Arrays
		        .asList(new String[] { "templ.template.ep.uri", "templ.target.template" }));
		return map;

	}
	
	public boolean isReadOnlyField(String modelProperty, ProjectDataModel model) {
		boolean readOnlyField = super.isReadOnlyField(modelProperty, model);
		if (modelProperty.equals("save.file")) {
			readOnlyField = true;
		}
	    return readOnlyField;
	}
}
