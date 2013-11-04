/*
 * Copyright (c) 2012, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.developerstudio.appfactory.ui.preference;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.wso2.developerstudio.appfactory.ui.Activator;
import org.wso2.developerstudio.appfactory.ui.utils.Messages;

public class AppFactoryPreferencePage extends FieldEditorPreferencePage
implements IWorkbenchPreferencePage{

	public static final String APP_FACTORY_PASSWORD = Messages.AppFactoryPreferencePage_0;
	public static final String SHOW_PLAIN_PASSWORD = Messages.AppFactoryPreferencePage_1;
	public static final String APP_FACTORY_USERNAME = Messages.AppFactoryPreferencePage_2;
	public static final String APP_FACTORY_LOCATION = Messages.AppFactoryPreferencePage_3;
	public static final String APP_FACTORY_SAVE = Messages.AppFactoryPreferencePage_4;
	private StringFieldEditor stringField1;
	IPreferenceStore preferenceStore;

	public AppFactoryPreferencePage() {
		super(GRID);
	}

	@Override
	public void init(IWorkbench arg0) {
		preferenceStore = Activator.getDefault().getPreferenceStore();
		setPreferenceStore(preferenceStore);
		setDescription(Messages.AppFactoryPreferencePage_5);
	}

	@Override
	protected void createFieldEditors() {
		StringFieldEditor editor = new StringFieldEditor(APP_FACTORY_LOCATION,
				Messages.AppFactoryPreferencePage_6, getFieldEditorParent());
		
		Text textControl = editor.getTextControl(getFieldEditorParent());
		textControl.setText(Messages.AppFactoryPreferencePage_7);
		addField(editor);
		addField(new StringFieldEditor(APP_FACTORY_USERNAME, Messages.AppFactoryPreferencePage_8,
				getFieldEditorParent()));
		stringField1 = new StringFieldEditor(APP_FACTORY_PASSWORD,
				Messages.AppFactoryPreferencePage_9, getFieldEditorParent());
		addField(stringField1);
		BooleanFieldEditor booleanFieldEditor = new BooleanFieldEditor(
				SHOW_PLAIN_PASSWORD, Messages.AppFactoryPreferencePage_10,
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
