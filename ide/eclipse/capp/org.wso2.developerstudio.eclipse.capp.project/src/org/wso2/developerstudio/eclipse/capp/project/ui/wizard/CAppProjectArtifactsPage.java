/*
 * Copyright (c) 2010, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
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

package org.wso2.developerstudio.eclipse.capp.project.ui.wizard;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableItem;
import org.wso2.developerstudio.eclipse.capp.core.artifacts.ICAppArtifactHandler;
import org.wso2.developerstudio.eclipse.capp.project.manager.CAppArtifactManager;

public class CAppProjectArtifactsPage extends WizardPage {

	private Label lblartifactDescription;
	private Table table;

	protected CAppProjectArtifactsPage(String pageName) {
	    super(pageName);
    }

	public void createControl(Composite parent) {
		Composite composite= new Composite(parent, SWT.NONE);
		composite.setLayout(new GridLayout(1, false));
		new Label(composite, SWT.None).setText("Create artifact default paths on");
		table = new Table (composite, SWT.CHECK | SWT.BORDER | SWT.V_SCROLL | SWT.H_SCROLL);
		table.setLayoutData(new GridData(GridData.FILL_HORIZONTAL|GridData.FILL_VERTICAL));
		List<ICAppArtifactHandler> artifactHandlers = CAppArtifactManager.getInstance().getArtifactHandlers();
		for (ICAppArtifactHandler artifactHandler : artifactHandlers) {
			TableItem item = new TableItem (table, SWT.NONE);
			item.setText (artifactHandler.getName());
			item.setData(artifactHandler);
			item.setChecked(true);
        }
		table.addListener (SWT.Selection, new Listener () {
			public void handleEvent (Event event) {
				if (event.item instanceof TableItem){
					ICAppArtifactHandler artifactHandler=(ICAppArtifactHandler)event.item.getData();
					lblartifactDescription.setText(artifactHandler.getDescription());
				}
//				String string = event.detail == SWT.CHECK ? "Checked" : "Selected";
//				System.out.println (event.item + " " + string);
			}
		});
		lblartifactDescription = new Label(composite, SWT.None);
		lblartifactDescription.setLayoutData(new GridData(GridData.FILL_HORIZONTAL|GridData.FILL_VERTICAL));

		setControl(composite);
//		setPageComplete(true);
	}
	
	public List<ICAppArtifactHandler> getSelectedArtifacts(){
		List<ICAppArtifactHandler> handlers=new ArrayList<ICAppArtifactHandler>();
		TableItem[] items = table.getItems();
		for (TableItem item : items) {
	        if (item.getChecked()){
	        	handlers.add((ICAppArtifactHandler)item.getData());
	        }
        }
		return handlers;
	}
	
}
