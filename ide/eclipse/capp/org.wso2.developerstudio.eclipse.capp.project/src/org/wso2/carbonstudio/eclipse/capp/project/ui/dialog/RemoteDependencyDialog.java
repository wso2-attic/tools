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

package org.wso2.carbonstudio.eclipse.capp.project.ui.dialog;

import java.util.List;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.wso2.carbonstudio.eclipse.capp.core.manifest.Artifact;
import org.wso2.carbonstudio.eclipse.capp.core.manifest.ArtifactDependency;

public class RemoteDependencyDialog extends Dialog {

	private String artifactName;
	private String artifactVersion;
	private Text txtArtifactName;
	private Text txtArtifactVersion;
	private Artifact rootArtifact;
	
	public RemoteDependencyDialog(Shell parentShell, Artifact artifact) {
	    super(parentShell);
	    this.rootArtifact = artifact;
    }
	
	/**
	 * create dialog
	 * method inherited by Dialog super class
	 */
	public void create() {
		super.create();

	}

	/**
	 * create dialog area
	 * method inherited by Dialog super class
	 */
	protected Control createDialogArea(final Composite parent) {
		parent.getShell().setText("Remote Dependency");
		Composite container = (Composite) super.createDialogArea(parent);
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		container.setLayout(layout);

		Label usernameLabel = new Label(container, SWT.RIGHT);
		usernameLabel.setText("Artifact ");

		txtArtifactName = new Text(container, SWT.BORDER);
		GridData data = new GridData(GridData.FILL_HORIZONTAL);
		txtArtifactName.setLayoutData(data);

		Label passwordLabel = new Label(container, SWT.RIGHT);
		passwordLabel.setText("Version ");

		txtArtifactVersion = new Text(container, SWT.BORDER);
		data = new GridData(GridData.FILL_HORIZONTAL);
		txtArtifactVersion.setLayoutData(data);

		txtArtifactName.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent event) {
				setArtifactName(txtArtifactName.getText());
			}
		});

		txtArtifactVersion.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent event) {
				setArtifactVersion(txtArtifactVersion.getText());
			}
		});

		return super.createDialogArea(parent);
	}

	/**
	 * check whether information entered in the dialog is valid
	 * @return
	 */
	public boolean isAllDatavalid() {
		return false;
	}

	/**
	 * get UserName
	 * @return
	 */
	public String getArtifactName() {
		return artifactName;
	}

	/**
	 * set UserName
	 * @param artifactName
	 */
	public void setArtifactName(String artifactName) {
		this.artifactName = artifactName;
	}

	/**
	 *  get password
	 * @return
	 */
	public String getArtifactVersion() {
		return artifactVersion;
	}

	/**
	 * set password
	 * @param artifactVersion
	 */
	public void setArtifactVersion(String artifactVersion) {
		this.artifactVersion = artifactVersion;
	}
	
	public boolean isValid(){
		if (getArtifactName()==null || getArtifactName().equals("")){
			return false;
		}
		if (getArtifactVersion()==null || getArtifactVersion().equals("")){
			return false;
		}
		List<ArtifactDependency> dependencies = rootArtifact.getDependencies();
		for (ArtifactDependency artifactDependency : dependencies) {
			if(artifactDependency.getName().equals(getArtifactName()) && artifactDependency.getVersion().equals(getArtifactVersion())){
				return false;
			}
		}
		return true;
	}
	
	protected void okPressed() {
		if(isValid()){
			super.okPressed();
		}else{
			MessageDialog.openError(getShell(), "Remote dependency", "Could not create remote dependency");
		}
	}
	
	public ArtifactDependency getNewArtifactDependency(){
		ArtifactDependency artifactDependency = new ArtifactDependency(rootArtifact, null);
		artifactDependency.setName(getArtifactName());
		artifactDependency.setVersion(getArtifactVersion());
		artifactDependency.setInclude(true);
		return artifactDependency;
	}
}

