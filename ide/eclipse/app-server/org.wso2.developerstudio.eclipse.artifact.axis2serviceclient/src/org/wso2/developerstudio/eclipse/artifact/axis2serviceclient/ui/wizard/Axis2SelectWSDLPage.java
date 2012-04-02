/*
 * Copyright (c) 2011, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.developerstudio.eclipse.artifact.axis2serviceclient.ui.wizard;

import org.apache.commons.validator.routines.UrlValidator;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.model.BaseWorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;

import java.io.File;

public class Axis2SelectWSDLPage extends WizardPage {

	private Text text;
	private Text text_1;
	private Text txtOnlineWSDLUri;
	private Button button;
	private Button button_2;
	private ElementTreeSelectionDialog dialog;
	// This might not be needed
	private File wsdlFile;
	private DataModel model;
	private int optionType;

	public static int OPTION_IMPORT_FS = 3;
	public static int OPTION_IMPORT_WS = 8;

	// local entry source types
	public static int OPTION_SOURCE_URL = 32;

	public int getOptionType() {
		return optionType;
	}

	public void setOptionType(int optionType) {
		this.optionType = optionType;
	}

	public boolean canFlipToNextPage() {
		return wsdlFile != null || model.getWsdlURI() != null;
	}

	public IWizardPage getNextPage() {

		if (wsdlFile != null) {
			model.setWsdlURI(wsdlFile.getAbsolutePath());
		}
		return super.getNextPage();
	}

	protected Axis2SelectWSDLPage(String pageName, DataModel model) {
		// Select WSDL
		super(pageName);
		setTitle(pageName);
		this.model = model;
	}

	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		setControl(container);

		Label lblNewLabel = new Label(container, SWT.NONE);
		lblNewLabel.setBounds(10, 10, 108, 17);
		lblNewLabel.setText("Select WSDL ");

		text = new Text(container, SWT.BORDER);
		text.setBounds(164, 49, 366, 27);

		button = new Button(container, SWT.NONE);
		button.setText("Browse...");
		button.setBounds(536, 45, 101, 35);

		if (text.getText() != null && !text.getText().equals("")) {
			button.setEnabled(false);

		} else {
			button.setEnabled(true);
		}

		button.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				dialog = new ElementTreeSelectionDialog(button.getShell(),
						new WorkbenchLabelProvider(),
						new BaseWorkbenchContentProvider());
				dialog.setTitle("Tree Selection");
				dialog.setMessage("Select the elements from the tree:");
				dialog.setInput(ResourcesPlugin.getWorkspace().getRoot());
				dialog.addFilter(new ViewerFilter() {

					public boolean select(Viewer viewer, Object parentElement,
							Object element) {
						if (element instanceof IProject) {
							return true;
						}
						if (element instanceof IFolder) {
							return true;
						}
						if (element instanceof IFile) {
							IFile file = (IFile) element;
							if ("wsdl".equals(file.getFileExtension())) {
								return true;
							}
						}
						return false;

					}
				});

				if (dialog.open() == Window.OK) {
					IFile file = (IFile) dialog.getFirstResult();
					if (file.exists()) {
						wsdlFile = new File(file.getRawLocation().toString());
					}

					if (wsdlFile != null && wsdlFile.exists()) {
						text.setText(wsdlFile.getName());
						model.setWsdlURI(file.getRawLocation().toString());
						setPageComplete(true);
					}

				}
			}
		});

		Button btnBrowseWorkspace = new Button(container, SWT.RADIO);
		btnBrowseWorkspace.setText("Browse workspace");
		btnBrowseWorkspace.setBounds(10, 53, 148, 20);
		btnBrowseWorkspace.setSelection(true);
		setOptionType(OPTION_IMPORT_WS);
		btnBrowseWorkspace.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				setOptionType(OPTION_IMPORT_WS);
				button.setEnabled(true);
				text.setEnabled(true);
				button_2.setEnabled(false);
				if (model.getWsdlURI() != null
						&& !model.getWsdlURI().equals("")) {
					text.setText(model.getWsdlURI());
					wsdlFile = new File(model.getWsdlURI());
					setPageComplete(true);
				} else {
					text.setText("");
					wsdlFile = null;
					setPageComplete(false);
				}
				// text_1.setText("");
				text_1.setEnabled(false);
				//
				// wsdlFile = null;
				// model.setWsdlURI(null);
			}
		});

		Button btnBrowse = new Button(container, SWT.RADIO);
		btnBrowse.setText("Browse file system");
		btnBrowse.setBounds(10, 96, 148, 20);
		btnBrowse.setSelection(false);

		text_1 = new Text(container, SWT.BORDER);
		text_1.setBounds(164, 92, 366, 27);
		text_1.setEnabled(false);

		btnBrowse.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				setOptionType(OPTION_IMPORT_FS);
				button.setEnabled(false);
				text.setEnabled(false);
				button_2.setEnabled(true);
				text_1.setText("");
				text_1.setEnabled(true);
				setPageComplete(false);
				// wsdlFile = null;
				// model.setWsdlURI(null);
			}
		});

		button_2 = new Button(container, SWT.NONE);
		button_2.setText("Browse...");
		button_2.setBounds(536, 86, 101, 35);
		button_2.setEnabled(false);
		button_2.addSelectionListener(new SelectionAdapter() {
			// TODO put this code in a utililty class
			public void widgetSelected(SelectionEvent e) {
				String fileName = null;
				FileDialog dlg = new FileDialog(getShell());
				dlg.setFilterExtensions(new String[] { "*.wsdl" });
				boolean done = false;

				while (!done) {
					// Open the File Dialog
					fileName = dlg.open();
					if (fileName == null) {
						// User has cancelled, so quit and return
						done = true;
					} else {
						// User has selected a file; see if it already exists
						wsdlFile = new File(fileName);
						if (wsdlFile.exists()) {
							// If they click Yes, we're done and we drop out. If
							// they click No, we redisplay the File Dialog
							done = true;
							text_1.setText(fileName);
							model.setWsdlURI(fileName);
							setPageComplete(true);
						} else {
							// File does not exist, so drop out
							done = false;
						}
					}
				}
			}
		});

		Button btnOnlineWSDL = new Button(container, SWT.RADIO);
		btnOnlineWSDL.setText("WSDL URI");
		btnOnlineWSDL.setBounds(10, 139, 148, 20);
		btnOnlineWSDL.setSelection(false);

		txtOnlineWSDLUri = new Text(container, SWT.BORDER);
		txtOnlineWSDLUri.setBounds(164, 135, 366, 27);
		txtOnlineWSDLUri.setEnabled(false);

		btnOnlineWSDL.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				setOptionType(OPTION_SOURCE_URL);
				button.setEnabled(false);
				text.setEnabled(false);
				text.setText("");
				button_2.setEnabled(false);
				text_1.setText("");
				text_1.setEnabled(false);

				txtOnlineWSDLUri.setEnabled(true);
				txtOnlineWSDLUri.setText("");

				setPageComplete(false);
				// wsdlFile = null;
				// model.setWsdlURI(null);
			}
		});

		txtOnlineWSDLUri.addListener(SWT.Modify, new Listener() {

			UrlValidator urlValidator = new UrlValidator(UrlValidator.ALLOW_LOCAL_URLS);

			public void handleEvent(Event arg0) {
				if (urlValidator.isValid(txtOnlineWSDLUri.getText())) {
					model.setWsdlURI(txtOnlineWSDLUri.getText());
					setPageComplete(true);
				}
			}
		});

		if (((getOptionType() == OPTION_IMPORT_WS) && text.getText() != null && !text
				.getText().equals(""))
				|| ((getOptionType() == OPTION_IMPORT_FS)
						&& text_1.getText() != null && !text_1.getText()
						.equals(""))
				|| ((getOptionType() == OPTION_SOURCE_URL)
						&& txtOnlineWSDLUri.getText() != null && !txtOnlineWSDLUri
						.getText().equals(""))) {
			setPageComplete(true);
		}
	}

}
