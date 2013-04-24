package org.wso2.developerstudio.appfactory.ui.preference;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.wso2.developerstudio.appfactory.ui.Activator;

public class AppFactoryPreferencePage extends FieldEditorPreferencePage
implements IWorkbenchPreferencePage{

	public static final String APP_FACTORY_PASSWORD = "APP_FACTORY_PASSWORD";
	public static final String SHOW_PLAIN_PASSWORD = "SHOW_PLAIN_PASSWORD";
	public static final String APP_FACTORY_USERNAME = "APP_FACTORY_USERNAME";
	public static final String APP_FACTORY_LOCATION = "APP_FACTORY_LOCATION";
	private StringFieldEditor stringField1;
	IPreferenceStore preferenceStore;

	public AppFactoryPreferencePage() {
		super(GRID);
	}

	@Override
	public void init(IWorkbench arg0) {
		preferenceStore = Activator.getDefault().getPreferenceStore();
		setPreferenceStore(preferenceStore);
		setDescription("WSO2 App Factory User Preferences.");
	}

	@Override
	protected void createFieldEditors() {
		addField(new StringFieldEditor(APP_FACTORY_LOCATION,
				"&App Factory Location:", getFieldEditorParent()));
		addField(new StringFieldEditor(APP_FACTORY_USERNAME, "App &Factory Username",
				getFieldEditorParent()));
		stringField1 = new StringFieldEditor(APP_FACTORY_PASSWORD,
				"Trust Store &Password", getFieldEditorParent());
		addField(stringField1);
		BooleanFieldEditor booleanFieldEditor = new BooleanFieldEditor(
				SHOW_PLAIN_PASSWORD, "S&how Password in Plain Text",
				getFieldEditorParent());
		addField(booleanFieldEditor);
		if (!preferenceStore.getBoolean(SHOW_PLAIN_PASSWORD)) {
			stringField1.getTextControl(getFieldEditorParent())
					.setEchoChar('*');
		}
		preferenceStore
				.addPropertyChangeListener(new IPropertyChangeListener() {

					@Override
					public void propertyChange(
							org.eclipse.jface.util.PropertyChangeEvent arg0) {
						// Setting/unsetting echo char
						if (arg0.getProperty() == SHOW_PLAIN_PASSWORD) {
							boolean boolean1 = preferenceStore
									.getBoolean(SHOW_PLAIN_PASSWORD);
							if (boolean1) {
								stringField1.getTextControl(
										getFieldEditorParent()).setEchoChar(
										'\0');
							} else {
								stringField1.getTextControl(
										getFieldEditorParent())
										.setEchoChar('*');
							}
						}
					}
				});
	}
}
