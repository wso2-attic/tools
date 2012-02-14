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

package org.wso2.carbonstudio.eclipse.capp.registry.connector.wizards;

import java.net.MalformedURLException;
import java.net.URL;

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
import org.wso2.carbonstudio.eclipse.capp.core.artifacts.manager.CAppEnvironment;
import org.wso2.carbonstudio.eclipse.greg.core.interfaces.IRegistryHandler;

public class RegistryConnectionPage extends WizardPage {

	private String serverUrl;
	private String path;
	private String connectionName;
	
//	private String userName;
//	private String passwd;
//	private boolean savePassword;
	private IProject project;
	private IRegistryHandler registryHandler = CAppEnvironment.getRegistryHandler();
	
	protected RegistryConnectionPage(String pageName, IProject project) {
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
		if (getProject()==null || !CAppEnvironment.getcAppManager().isCAppProject(getProject())){
			updatePageStatus("Select a carbon application project to create registry connections");
			setControl(container);
		}
		
		GridData gd = new GridData(GridData.FILL_HORIZONTAL
				| GridData.VERTICAL_ALIGN_FILL);
		container.setLayoutData(gd);
		gd = new GridData(GridData.FILL_HORIZONTAL
		  				| GridData.VERTICAL_ALIGN_FILL);
		
		group.setLayoutData(gd);
		Label nameLabel = new Label(group, SWT.NONE);
		nameLabel.setText("Connection Name ");
		gd = new GridData();
		nameLabel.setLayoutData(gd);

		Text nameText = new Text(group, SWT.BORDER);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		nameText.setLayoutData(gd);

		nameText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent event) {
				Text name = (Text) event.widget;
				connectionName = name.getText();
				setConnectionName(connectionName);
			}
		});
		gd=new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan=2;
		new Label(group,SWT.SEPARATOR|SWT.HORIZONTAL).setLayoutData(gd);
		
		Label urlLabel = new Label(group, SWT.NONE);
		urlLabel.setText("URL ");
		gd = new GridData();
		urlLabel.setLayoutData(gd);

		Text urlText = new Text(group, SWT.BORDER);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		urlText.setLayoutData(gd);

		urlText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent event) {
				Text url = (Text) event.widget;
				serverUrl = url.getText();
				setServerUrl(serverUrl);
			}
		});

		Label pathLabel = new Label(group, SWT.NONE);
		pathLabel.setText("Collection Path ");
		gd = new GridData();
		pathLabel.setLayoutData(gd);

		Text pathText = new Text(group, SWT.BORDER);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		pathText.setLayoutData(gd);

		pathText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent event) {
				Text url = (Text) event.widget;
				path = url.getText();
				setPath(path);
			}
		});
		
//		Label userNameLabel = new Label(container, SWT.NONE);
//		userNameLabel.setText("User Name: ");
//
//		gd = new GridData();
//		gd.heightHint = 18;
//		gd.widthHint = 100;
//		Text userNameText = new Text(container, SWT.BORDER);
//		userNameText.setLayoutData(gd);
//		userNameText.addModifyListener(new ModifyListener() {
//			public void modifyText(ModifyEvent event) {
//				Text uName = (Text) event.widget;
//				userName = uName.getText();
//				setUserName(userName);
//			}
//		});
//
//		Label pwdLabel = new Label(container, SWT.NONE);
//		pwdLabel.setText("Password: ");
//
//		gd = new GridData();
//		gd.heightHint = 18;
//		gd.widthHint = 100;
//		Text pwdText = new Text(container, SWT.PASSWORD | SWT.BORDER);
//		pwdText.setLayoutData(gd);
//		pwdText.addModifyListener(new ModifyListener() {
//
//			public void modifyText(ModifyEvent event) {
//				Text pwd = (Text) event.widget;
//				passwd = pwd.getText();
//				setPasswd(passwd);
//
//			}
//		});
//
//		final Button button = new Button(container, SWT.CHECK);
//		button.setText("Save Credentials");
//		button.addSelectionListener(new SelectionListener() {
//
//			public void widgetDefaultSelected(SelectionEvent arg0) {
//				setSavePassword(button.getSelection());
//			}
//
//			public void widgetSelected(SelectionEvent arg0) {
//				widgetDefaultSelected(arg0);
//
//			}
//
//		});
		String connectionName="NewConnection";
		String proposedRegistryConnectionName;
		int i=1;
		while(true){
			proposedRegistryConnectionName=connectionName+i;
			if (registryHandler.isRegistryConnectionPresent(project, proposedRegistryConnectionName)){
				i++;
			}else{
				break;
			}
		}
		nameText.setText(proposedRegistryConnectionName);
		urlText.setText("https://localhost:9443/registry");
//		userNameText.setText("admin");
//		pwdText.setText("admin");
		pathText.setText("/");
		validate();
		setControl(container);
	}

	private void validate(){
		if (getConnectionName()==null || getConnectionName().equals("")){
        	updatePageStatus("The name is not valid");
	        return;
        }
		
		if (registryHandler.isRegistryConnectionPresent(project, getConnectionName())){
        	updatePageStatus("The connection name already exists. Please choose another");
	        return;
        }
		
		try {
	        new URL(getServerUrl());
        } catch (MalformedURLException e) {
	        updatePageStatus("The registry url is invalid");
	        return;
        }
        
        if (getPath()==null || getPath().equals("")){
        	updatePageStatus("The path is invalid");
	        return;
        }
        
        updatePageStatus(null);
	}
	
	private void updatePageStatus(String msg){
		setErrorMessage(msg);
		setPageComplete(msg==null);
	}
	
	public boolean isAllDatavalid() {
		return false;
	}
	
	public String getServerUrl() {
		return serverUrl;
	}

	public void setServerUrl(String serverUrl) {
		this.serverUrl = serverUrl;
		validate();
	}

//	public String getUserName() {
//		return userName;
//	}
//
//	public void setUserName(String userName) {
//		this.userName = userName;
//	}
//
//	public String getPasswd() {
//		return passwd;
//	}
//
//	public void setPasswd(String pwd) {
//		this.passwd = pwd;
//	}

	public void setPath(String path) {
		this.path = path;
		validate();
	}

	public String getPath() {
		return path;
	}

	public void setProject(IProject project) {
	    this.project = project;
    }

	public IProject getProject() {
	    return project;
    }

	public void setConnectionName(String connectionName) {
	    this.connectionName = connectionName;
	    validate();
    }

	public String getConnectionName() {
	    return connectionName;
    }

//	public void setSavePassword(boolean savePassword) {
//		this.savePassword = savePassword;
//	}
//
//	public boolean isSavePassword() {
//		return savePassword;
//	}
}
