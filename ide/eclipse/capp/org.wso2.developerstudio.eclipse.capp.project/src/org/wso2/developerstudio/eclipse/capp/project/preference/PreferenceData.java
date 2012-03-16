package org.wso2.developerstudio.eclipse.capp.project.preference;

import org.eclipse.jface.preference.IPreferenceStore;
import org.wso2.developerstudio.eclipse.capp.project.Activator;

public class PreferenceData {
	private static IPreferenceStore store = Activator.getDefault().getPreferenceStore();
	public static boolean isGroupArtifacts(){
		return store.getBoolean(PreferenceConstants.CAPP_ARTIFACT_GROUP_SETTING);
	}
}
