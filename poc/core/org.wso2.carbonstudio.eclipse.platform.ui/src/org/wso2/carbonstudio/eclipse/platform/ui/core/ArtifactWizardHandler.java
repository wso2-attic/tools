package org.wso2.carbonstudio.eclipse.platform.ui.core;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.wso2.carbonstudio.eclipse.logging.core.ICarbonStudioLog;
import org.wso2.carbonstudio.eclipse.logging.core.Logger;
import org.wso2.carbonstudio.eclipse.platform.ui.Activator;
import org.wso2.carbonstudio.eclipse.platform.ui.internal.ArtifactWizardDefinitionImpl;

public class ArtifactWizardHandler {
	private static ICarbonStudioLog log=Logger.getLog(Activator.PLUGIN_ID);

	private static String WIZARD_DEFINITION_HANDLER_EXTENSION = "org.wso2.carbonstudio.eclipse.platform.ui.artifact";

	private static Map<String, IArtifactWizardDefinition> wizardDefinitions;
	
	static {
		loadMavenDefinitionExtensionPoint();
	}

	
	private static void loadMavenDefinitionExtensionPoint() {
		wizardDefinitions=new HashMap<String, IArtifactWizardDefinition>();
		IConfigurationElement[] config = Platform.getExtensionRegistry()
				.getConfigurationElementsFor(
						WIZARD_DEFINITION_HANDLER_EXTENSION);
		for (IConfigurationElement e : config) {
			try {
				if (e.getName().equals("wizard")){
					String id = e.getAttribute("id");
					String archeTypeId = e.getAttribute("archeTypeId");
					ArtifactWizardDefinitionImpl def = new ArtifactWizardDefinitionImpl();
					def.setArcheTypeId(archeTypeId);
					def.setWizardId(id);
					wizardDefinitions.put(id, def);
				}
			} catch (Exception ex) {
				log.error("Error loading extension point element: "+e.getName(), ex);
			}
		}
	}

	public static Map<String, IArtifactWizardDefinition> getWizardDefinitions() {
		return wizardDefinitions;
	}

	public static String getArcheTypeId(String wizardId){
		if (getWizardDefinitions().containsKey(wizardId)){
			return getWizardDefinitions().get(wizardId).getArcheTypeId();
		}
		return null;
	}
}
