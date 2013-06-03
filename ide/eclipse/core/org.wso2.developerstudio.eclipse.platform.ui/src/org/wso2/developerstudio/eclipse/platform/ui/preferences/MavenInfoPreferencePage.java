package org.wso2.developerstudio.eclipse.platform.ui.preferences;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.ComboFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.wso2.developerstudio.eclipse.platform.ui.Activator;
import org.wso2.developerstudio.eclipse.platform.ui.preferences.controls.LabelFieldEditor;

public class MavenInfoPreferencePage extends FieldEditorPreferencePage
implements IWorkbenchPreferencePage {
	
	private static final String UPDATE_POLICY_LABEL = "Update Policy";
	private static final String CHECKSUM_POLICY_LABEL = "Checksum Policy";
	private static final String SNAPSHOTS_UPDATE_POLICY = "SNAPSHOTS_UPDATE_POLICY";
	private static final String SNAPSHOTS_CHECKSUM_POLICY = "SNAPSHOTS_CHECKSUM_POLICY";
	private static final String SNAPSHOTS_ENABLED = "SNAPSHOTS_ENABLED";
	private static final String RELEASES_UPDATE_POLICY = "RELEASES_UPDATE_POLICY";
	private static final String RELEASES_CHECKSUM_POLICY = "RELEASES_CHECKSUM_POLICY";
	private static final String RELEASES_ENABLED = "RELEASES_ENABLED";
	private static final String GLOBAL_REPOSITORY_ID = "GLOBAL REPOSITORY ID";
	private static final String GLOBAL_REPOSITORY_URL = "GLOBAL REPOSITORY URL";
	private static final String GLOBAL_MAVEN_VERSION = "GLOBAL MAVEN VERSION";
	private static final String GLOBAL_MAVEN_ARTIFACTID = "GLOBAL MAVEN ARTIFACTID";
	private static final String GLOBAL_MAVEN_GROUP_ID = "GLOBAL MAVEN GROUPID";
	private IPreferenceStore preferenceStore;
	
	public MavenInfoPreferencePage(){
		super(GRID);
	}

	@Override
	public void init(IWorkbench arg0) {
		preferenceStore = Activator.getDefault().getPreferenceStore();
		setPreferenceStore(preferenceStore);
		setDescription("WSO2 Developer Studio Maven Information Preferences.");
	}

	@Override
	protected void createFieldEditors() {
		LabelFieldEditor labelFieldEditor = new LabelFieldEditor("", getFieldEditorParent());
		addField(labelFieldEditor);
		
		addField(new LabelFieldEditor("Global Maven Parent Information", getFieldEditorParent()));
		
		addField(new StringFieldEditor(GLOBAL_MAVEN_GROUP_ID,
				"Global GroupId", getFieldEditorParent()));
		
		addField(new StringFieldEditor(GLOBAL_MAVEN_ARTIFACTID,
				"Global ArtifactId", getFieldEditorParent()));
		
		addField(new StringFieldEditor(GLOBAL_MAVEN_VERSION,
				"Global Version", getFieldEditorParent()));
		
		addField(labelFieldEditor);
		
		//Parent Project is done
		
		//Add Customized Repositories
		addField(new LabelFieldEditor("Global Maven Repository Information", getFieldEditorParent()));
		
		addField(new StringFieldEditor(GLOBAL_REPOSITORY_URL,
				"Global Repository URL", getFieldEditorParent()));
		
		addField(new StringFieldEditor(GLOBAL_REPOSITORY_ID,
				"Global Repository ID", getFieldEditorParent()));
		
		//releases
		addField(labelFieldEditor);
		addField(new LabelFieldEditor("Releases", getFieldEditorParent()));
		
		addField(new BooleanFieldEditor(
				RELEASES_ENABLED, "Enabled",
				getFieldEditorParent()));
		
		String[][] a = { { "Ignore", "Ignore" },{ "fail", "fail" },{ "warn", "warn" } };
		
		addField(new ComboFieldEditor(RELEASES_CHECKSUM_POLICY, CHECKSUM_POLICY_LABEL, a,
				getFieldEditorParent()));
		
		String[][] b = { { "always", "always" },{ "daily", "daily" },{ "never", "never" } };
		
		addField(new ComboFieldEditor(RELEASES_UPDATE_POLICY, UPDATE_POLICY_LABEL, b,
				getFieldEditorParent()));
		
		//snapshots
				addField(labelFieldEditor);
				addField(new LabelFieldEditor("Snapshots", getFieldEditorParent()));
				
				addField(new BooleanFieldEditor(
						SNAPSHOTS_ENABLED, "Enabled",
						getFieldEditorParent()));
				
				
				addField(new ComboFieldEditor(SNAPSHOTS_CHECKSUM_POLICY, CHECKSUM_POLICY_LABEL, a,
						getFieldEditorParent()));
				
				
				addField(new ComboFieldEditor(SNAPSHOTS_UPDATE_POLICY, UPDATE_POLICY_LABEL, b,
						getFieldEditorParent()));
				
		
		
	}

}
