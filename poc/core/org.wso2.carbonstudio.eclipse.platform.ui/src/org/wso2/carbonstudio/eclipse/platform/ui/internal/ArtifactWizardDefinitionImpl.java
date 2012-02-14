package org.wso2.carbonstudio.eclipse.platform.ui.internal;

import org.wso2.carbonstudio.eclipse.platform.ui.core.IArtifactWizardDefinition;

public class ArtifactWizardDefinitionImpl implements IArtifactWizardDefinition {

	private String archeTypeId;
	private String wizardId;
	
	public String getArcheTypeId() {
		return archeTypeId;
	}

	public String getWizardId() {
		return wizardId;
	}

	public void setArcheTypeId(String archeTypeId) {
		this.archeTypeId = archeTypeId;
	}

	public void setWizardId(String wizardId) {
		this.wizardId = wizardId;
	}

}
