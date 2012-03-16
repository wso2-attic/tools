package org.wso2.developerstudio.eclipse.artifact.webapp.model;

import org.wso2.developerstudio.eclipse.platform.core.exception.ObserverFailedException;
import org.wso2.developerstudio.eclipse.platform.core.project.model.ProjectDataModel;
import org.wso2.developerstudio.eclipse.utils.project.ProjectUtils;

public class WebAppModel extends ProjectDataModel {

	private String webContextRoot;

	
	public Object getModelPropertyValue(String key) {
		Object modelPropertyValue = super.getModelPropertyValue(key);
		if (modelPropertyValue == null) {
			if (key.equalsIgnoreCase("web.context.root")) {
				modelPropertyValue = getWebContextRoot();
			}
		}
		return modelPropertyValue;
	}

	
	public boolean setModelPropertyValue(String key, Object data) throws ObserverFailedException {
		boolean returnValue = super.setModelPropertyValue(key, data);
		if (key.equals("import.file")) {
			if (getImportFile() != null && !getImportFile().toString().equals("")) {
				setProjectName(ProjectUtils.fileNameWithoutExtension(getImportFile().getName()));
			}
		} else if (key.equals("web.context.root")) {
			setWebContextRoot(data.toString());
		}
		return returnValue;
	}

	public void setWebContextRoot(String webContextRoot) {
		this.webContextRoot = webContextRoot;
	}

	public String getWebContextRoot() {
		return webContextRoot;
	}

	
	public void setProjectName(String projectName) throws ObserverFailedException {
		if (getProjectName() != null && getProjectName().equals(getWebContextRoot())) {
			setWebContextRoot(projectName);
		}
		super.setProjectName(projectName);
	}

}
