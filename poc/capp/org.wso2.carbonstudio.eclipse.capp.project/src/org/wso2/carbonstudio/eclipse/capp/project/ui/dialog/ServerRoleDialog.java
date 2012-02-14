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

import org.eclipse.core.resources.IProject;
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
import org.wso2.carbonstudio.eclipse.capp.core.artifacts.manager.IServerRole;
import org.wso2.carbonstudio.eclipse.capp.core.model.ServerRole;
import org.wso2.carbonstudio.eclipse.capp.project.manager.CAppArtifactManager;

public class ServerRoleDialog extends Dialog {

	private String serverRoleName;
	private Text txtServerRoleName;

	private boolean editMode=false;
	
	private IServerRole currentServerRole;
	private IProject project;
	
	public ServerRoleDialog(Shell parentShell,boolean editMode, IProject project) {
	    super(parentShell);
	    setEditMode(editMode);
	    setProject(project);
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
		parent.getShell().setText("Server Role Name");
		Composite container = (Composite) super.createDialogArea(parent);
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		container.setLayout(layout);

		Label usernameLabel = new Label(container, SWT.RIGHT);
		usernameLabel.setText("New Server role");

		txtServerRoleName = new Text(container, SWT.BORDER);
		GridData data = new GridData(GridData.FILL_HORIZONTAL);
		txtServerRoleName.setLayoutData(data);

		txtServerRoleName.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent event) {
				setServerRoleNameName(txtServerRoleName.getText());
			}
		});
		if (isEditMode()){
			if (getCurrentServerRole()!=null) {
				txtServerRoleName.setText(getCurrentServerRole().getServerRoleName());
				txtServerRoleName.selectAll();
			}
		} 
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
	public String getServerRoleName() {
		return serverRoleName;
	}

	/**
	 * set UserName
	 * @param artifactName
	 */
	public void setServerRoleNameName(String artifactName) {
		this.serverRoleName = artifactName;
	}
	
	public boolean isValid(){
		if (getServerRoleName()==null || getServerRoleName().equals("") || (isEditMode() && getCurrentServerRole().getServerRoleName().equals(getServerRoleName()))
				|| CAppArtifactManager.getInstance().isServerRolePresent(getProject(), getServerRoleName())){
			return false;
		}

		return true;
	}
	
	protected void okPressed() {
		if(isValid()){
			super.okPressed();
		}else{
			MessageDialog.openError(getShell(), "Server Role", "Insufficient data or server role already exists");
		}
	}
	
	public IServerRole getNewServerRole(){
		return new ServerRole(getServerRoleName(),"");
	}

	public void setEditMode(boolean editMode) {
	    this.editMode = editMode;
    }

	public boolean isEditMode() {
	    return editMode;
    }

	public void setCurrentServerRole(IServerRole currentServerRole) {
	    this.currentServerRole = currentServerRole;
    }

	public IServerRole getCurrentServerRole() {
	    return currentServerRole;
    }
	
	public boolean isNewMode(){
		return !isEditMode();
	}

	public void setProject(IProject project) {
	    this.project = project;
    }

	public IProject getProject() {
	    return project;
    }
}

