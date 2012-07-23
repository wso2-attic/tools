package org.wso2.developerstudio.eclipse.artifact.cep.model;

import org.wso2.developerstudio.eclipse.artifact.cep.utils.CEPArtifactConstants;
import org.wso2.developerstudio.eclipse.platform.core.exception.ObserverFailedException;
import org.wso2.developerstudio.eclipse.platform.core.project.model.ProjectDataModel;
import org.wso2.developerstudio.eclipse.utils.project.ProjectUtils;

public class CEPModel extends ProjectDataModel {

	private String bucketName;

	public CEPModel() {

	}

	public String getBucketName() {
		return bucketName;
	}

	public void setBucketName(String bucketName) {
		this.bucketName = bucketName;
	}

	public Object getModelPropertyValue(String key) {
		Object modelPropertyValue = super.getModelPropertyValue(key);

		if (key.equals(CEPArtifactConstants.WIZARD_OPTION_BUCKET_NAME)) {
			modelPropertyValue = getBucketName();
		}

		return modelPropertyValue;
	}

	public boolean setModelPropertyValue(String key, Object data)
			throws ObserverFailedException {
		boolean returnValue = super.setModelPropertyValue(key, data);
		if (key.equals("import.file")) {
			if (getImportFile() != null
					&& !getImportFile().toString().equals("")) {
				setProjectName(ProjectUtils
						.fileNameWithoutExtension(getImportFile().getName()));
			}
		} else if (key.equals(CEPArtifactConstants.WIZARD_OPTION_BUCKET_NAME)) {
			setBucketName(data.toString());
		}

		return returnValue;
	}

}
