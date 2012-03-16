
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
package org.wso2.developerstudio.eclipse.platform.ui.handlers;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Link;
import org.eclipse.swt.widgets.Button;
import org.wso2.developerstudio.eclipse.platform.core.utils.ResourceManager;
import org.wso2.developerstudio.eclipse.platform.core.utils.SWTResourceManager;



public class AboutDialog extends Dialog {

	 
	 private static final String VERSION="Version 2.0.0";
	 private static final String LICENSED ="Licensed under the Apache License, Version 2.0";
	 private static final String URL ="http://wso2.org/library/carbon-studio";

	public AboutDialog(Shell parentShell) {
		super(parentShell);
		setDefaultImage(ResourceManager.getPluginImage(
				"org.wso2.developerstudio.eclipse.platform.ui",
				"icons/carbon-studio-small-logo.png"));
	}

	
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		newShell.setText("About Developer Studio");
	}
	
	protected Control createDialogArea(Composite parent) {
		parent.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		Composite container = (Composite) super.createDialogArea(parent);
		container.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));

		Composite composite = new Composite(container, SWT.BORDER);
		composite.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		composite.setLayout(new GridLayout(1, false));
		GridData gd_composite = new GridData(SWT.LEFT, SWT.CENTER, false,
				false, 1, 1);
		gd_composite.widthHint = 422;
		gd_composite.heightHint = 167;
		composite.setLayoutData(gd_composite);

		Label lblNewLabel = new Label(composite, SWT.NONE);
		lblNewLabel.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		lblNewLabel.setImage(ResourceManager.getPluginImage(
				"org.wso2.developerstudio.eclipse.platform.ui",
				"icons/carbon-studio-logo.png"));
		GridData gd_lblNewLabel = new GridData(SWT.LEFT, SWT.TOP, false,
				true, 1, 1);
		gd_lblNewLabel.widthHint = 324;
		gd_lblNewLabel.heightHint = 64;
		lblNewLabel.setLayoutData(gd_lblNewLabel);

		Label lblVersion = new Label(composite, SWT.NONE);
		lblVersion.setForeground(SWTResourceManager
				.getColor(SWT.COLOR_WIDGET_BORDER));
		lblVersion.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		lblVersion.setText(VERSION);
		new Label(composite, SWT.NONE);

		Label lblNewLabel_1 = new Label(composite, SWT.NONE);
		lblNewLabel_1.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		lblNewLabel_1.setText(LICENSED);
		
		Link link = new Link(composite, SWT.NONE);
		link.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		link.setText("Visit :<a>" + URL + "</a>");
		link.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event event) {
				org.eclipse.swt.program.Program.launch(URL);
			}
		});
		return container;
	}

	protected void createButtonsForButtonBar(Composite parent) {
		parent.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		Button button = createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL,
				true);
		button.setFocus();
	}
 
	protected Point getInitialSize() {
		return new Point(453, 274);
	}

}
