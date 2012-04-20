package org.wso2.developerstudio.eclipse.platform.ui.mvn.wizard;

import org.wso2.developerstudio.eclipse.platform.core.exception.ObserverFailedException;
import org.wso2.developerstudio.eclipse.platform.core.project.model.ProjectDataModel;

public class MvnMultiModuleModel extends ProjectDataModel  {

	private String groupId;
	private String artifactId;
    private String version;
    
	
	public Object getModelPropertyValue(String key) {
	  Object modelPropertyValue = super.getModelPropertyValue(key);
	  if((modelPropertyValue == null)&&("group.id".equals(key))){
		  modelPropertyValue = this.getGroupId();
	  }
	  if((modelPropertyValue == null)&&("artifact.id".equals(key))){
		  modelPropertyValue = this.getArtifactId();
	  }
	  if((modelPropertyValue == null)&&("version.id".equals(key))){
		  modelPropertyValue = this.getVersion();
	  }
	  return modelPropertyValue;
	}
	
	
	public boolean setModelPropertyValue(String key, Object data) throws ObserverFailedException {
		boolean isUiControlUpdated = super.setModelPropertyValue(key, data);
		if ("group.id".equals(key)) {
			this.setGroupId(data.toString());
		}
		if("artifact.id".equals(key)){
			this.setArtifactId(data.toString());
		}
		if("version.id".equals(key)){
			this.setVersion(data.toString());
		}
		return isUiControlUpdated;
	}


	public String getGroupId() {
		return groupId;
	}


	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}


	public String getArtifactId() {
		return artifactId;
	}


	public void setArtifactId(String artifactId) {
		this.artifactId = artifactId;
	}


	public String getVersion() {
		return version;
	}


	public void setVersion(String version) {
		this.version = version;
	}

}
