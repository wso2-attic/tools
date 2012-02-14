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

package org.wso2.carbonstudio.eclipse.capp.project.ui.wizard;

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.wso2.carbonstudio.eclipse.capp.core.artifacts.manager.IServerRole;
import org.wso2.carbonstudio.eclipse.capp.core.model.ServerRole;
import org.wso2.carbonstudio.eclipse.capp.project.manager.CAppArtifactManager;

public class ServerRolePage extends WizardPage {
	private IProject project;
	private String serverRoleName;
	private Text txtServerRoleName;
	private CAppArtifactManager cappInstance;

	protected ServerRolePage(String pageName, IProject project) {
	    super(pageName);
	    setProject(project);
    }

	public void createControl(Composite parent) {
		Composite container = new Composite(parent,SWT.None);
		GridLayout layout = new GridLayout();
		layout.numColumns = 1;
		container.setLayout(layout);
		Group group = new Group(container,SWT.None);
		layout = new GridLayout();
		layout.numColumns = 2;
		group.setLayout(layout);
		cappInstance = CAppArtifactManager.getInstance();
		if (getProject()==null || !cappInstance.isCAppProject(getProject())){
			updatePageStatus("Select a carbon application project to create a server role");
			setControl(container);
		}
		
		GridData gd = new GridData(GridData.FILL_HORIZONTAL
				| GridData.VERTICAL_ALIGN_FILL);
		container.setLayoutData(gd);
		gd = new GridData(GridData.FILL_HORIZONTAL
		  				| GridData.VERTICAL_ALIGN_FILL);
		
		group.setLayoutData(gd);
		
		
		Label usernameLabel = new Label(container, SWT.RIGHT);
		usernameLabel.setText("New Server role");

		txtServerRoleName = new Text(container, SWT.BORDER);
		GridData data = new GridData(GridData.FILL_HORIZONTAL);
		txtServerRoleName.setLayoutData(data);

		txtServerRoleName.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent event) {
				setServerRoleName(txtServerRoleName.getText());
				validate();
			}
		});

		String connectionName="ServerRole";
		String proposedRegistryConnectionName;
		int i=1;
		while(true){
			proposedRegistryConnectionName=connectionName+i;
			if (cappInstance.isServerRolePresent(project, proposedRegistryConnectionName)){
				i++;
			}else{
				break;
			}
		}
		txtServerRoleName.setText(proposedRegistryConnectionName);
		validate();
		setControl(container);
	}

	private void validate(){
		if (getServerRoleName()==null || getServerRoleName().equals("")){
			updatePageStatus("Server role name cannot be empty");
			return;
		}
		if (cappInstance.isServerRolePresent(project, getServerRoleName())){
			updatePageStatus("Server role '"+getServerRoleName()+"' already present in the project");
			return;
		}
        updatePageStatus(null);
	}
	
	private void updatePageStatus(String msg){
		setErrorMessage(msg);
		setPageComplete(msg==null);
	}
	
	public void setProject(IProject project) {
	    this.project = project;
    }

	public IProject getProject() {
	    return project;
    }

	public void setServerRoleName(String serverRoleName) {
	    this.serverRoleName = serverRoleName;
    }

	public String getServerRoleName() {
	    return serverRoleName;
    }
	
	public IServerRole getNewServerRole(){
		return new ServerRole(getServerRoleName(),"");
	}
}
