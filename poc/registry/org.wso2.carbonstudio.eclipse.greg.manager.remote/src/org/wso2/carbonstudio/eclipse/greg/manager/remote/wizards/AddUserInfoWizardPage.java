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

package org.wso2.carbonstudio.eclipse.greg.manager.remote.wizards;

import java.util.ArrayList;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.wso2.carbonstudio.eclipse.greg.base.model.RegistryUserContainer;
import org.wso2.carbonstudio.eclipse.greg.manager.remote.Activator;
import org.wso2.carbonstudio.eclipse.logging.core.ICarbonStudioLog;
import org.wso2.carbonstudio.eclipse.logging.core.Logger;
import org.wso2.carbonstudio.eclipse.usermgt.remote.UserManager;

public class AddUserInfoWizardPage extends WizardPage {
	private static ICarbonStudioLog log=Logger.getLog(Activator.PLUGIN_ID);

	private String[] initialRoles;
	private ArrayList<String> selectedRoleList;
	private AddUserWizard wizard;
	private ArrayList<Button> checkBoxes;
	private RegistryUserContainer regUserContainer;
	private String userName;
	private String pwd;
	private String repeatPwd;
	Text userNameText;
	Text pwdText;
	private UserManager um;

	protected AddUserInfoWizardPage(String pageName, AddUserWizard wizard) {
		super(pageName);
		this.wizard = wizard;
		this.regUserContainer = wizard.getRegUserContainer();
		if (this.regUserContainer != null) {
			this.um = regUserContainer.getRegistryUserManagerContainer()
					.getUserManager();
		} else {
			um = wizard.getRegData().getUserManagerContent().getUserManager();
		}
		setDescription("Add user information");
	}

	public void createControl(Composite parent) {
		selectedRoleList = new ArrayList<String>();
		selectedRoleList.add("everyone");
		checkBoxes = new ArrayList<Button>();
		Composite container = new Composite(parent, SWT.BORDER);
		GridLayout layout = new GridLayout();
		layout.numColumns = 1;
		container.setLayout(layout);
		GridData gd = new GridData(GridData.FILL_BOTH);
		container.setLayoutData(gd);

		Group group1 = new Group(container, SWT.NONE);
		layout = new GridLayout();
		layout.numColumns = 2;
		layout.verticalSpacing = 10;
		group1.setLayout(layout);
		group1.setText("Credentials");
		group1.setLayoutData(new GridData(GridData.GRAB_HORIZONTAL
				| GridData.HORIZONTAL_ALIGN_FILL));

		Group group2 = new Group(container, SWT.NONE);
		group2.setLayout(new GridLayout());
		group2.setText("Roles");
		group2.setLayoutData(new GridData(GridData.GRAB_HORIZONTAL
				| GridData.HORIZONTAL_ALIGN_FILL));

		fillGroup1Data(group1);
		fillGroup2Data(group2);

		setControl(container);
	}

	public void fillGroup1Data(Group group1) {
		GridData gd = new GridData();
		Label userNameLabel = new Label(group1, SWT.NULL);
		userNameLabel.setText("User Name");
		gd = new GridData();
		userNameLabel.setLayoutData(gd);

		if (wizard != null) {
			if (wizard.isNew) {
				userNameText = new Text(group1, SWT.NULL | SWT.BORDER);
			} else {
				Label userNameLb = new Label(group1, SWT.BOLD);
				userNameLb.setText(wizard.getRegUser().getUserName());
			}

		} else {
			userNameText = new Text(group1, SWT.NULL | SWT.BORDER);

		}

		if (userNameText != null) {
			gd = new GridData(GridData.FILL_HORIZONTAL);
			userNameText.setLayoutData(gd);
			userNameText.addModifyListener(new ModifyListener() {

				public void modifyText(ModifyEvent event) {
					Text text = (Text) event.widget;
					userName = text.getText();
					setUserName(userName);
				}
			});
		}

		Label pwdLabel = new Label(group1, SWT.NULL);
		pwdLabel.setText("Password");
		gd = new GridData();
		pwdLabel.setLayoutData(gd);

		pwdText = new Text(group1, SWT.PASSWORD | SWT.BORDER);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		pwdText.setLayoutData(gd);

		pwdText.addModifyListener(new ModifyListener() {

			public void modifyText(ModifyEvent event) {
				Text text = (Text) event.widget;
				pwd = text.getText();
				setPwd(pwd);
				if (!isPWDStrong(pwd)) {
					String msg = "Passwords should be more than 6 characters long";
					setErrorMessage(msg);
					setPageComplete(msg == null);
				} else {

					setErrorMessage(null);
					setPageComplete(true);
				}
			}
		});

		Label repeatPwdLabel = new Label(group1, SWT.NULL);
		repeatPwdLabel.setText("Password Repeat");
		gd = new GridData();
		repeatPwdLabel.setLayoutData(gd);

		Text repPwdText = new Text(group1, SWT.PASSWORD | SWT.BORDER);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		repPwdText.setLayoutData(gd);

		repPwdText.addModifyListener(new ModifyListener() {

			public void modifyText(ModifyEvent event) {
				Text text = (Text) event.widget;
				repeatPwd = text.getText();
				setRepeatPwd(repeatPwd);
				if (!passwordMatch(getPwd(), getRepeatPwd())) {
					String msg = "Passwords do not match. Please re-type passwords.";
					setErrorMessage(msg);
					setPageComplete(msg == null);
				} else {
					setErrorMessage(null);
					setPageComplete(true);
				}
			}
		});
	}

	public void fillGroup2Data(Group group2) {
		initialRoles = getRoles();
		if (initialRoles != null) {
			for (int i = 0; i < initialRoles.length; i++) {
				createCheckBoxes(group2, initialRoles[i]);
			}
		}
		if (!wizard.isNew) {
			try {
				String[] selectedRoles = um.getRolesPerUser(wizard.getRegUser()
						.getUserName());
				for (int i = 0; i < selectedRoles.length; i++) {
					setCheckBoxesSelected(selectedRoles[i]);
				}
			} catch (Exception e) {
				log.error(e);
			}
		}
	}

	public void setCheckBoxesSelected(String role) {

		for (int i = 0; i < checkBoxes.size(); i++) {
			if (checkBoxes.get(i).getText().equals(role)) {
				checkBoxes.get(i).setSelection(true);
			}
		}
	}

	public void createCheckBoxes(Group group2, String role) {
		if (!wizard.isNew) {
			try {
				String[] selectedRoles = um.getRolesPerUser(wizard.getRegUser()
						.getUserName());
				// selectedRoleList = new ArrayList<String>();
				for (int i = 0; i < selectedRoles.length; i++) {
					if (!selectedRoleList.contains(selectedRoles[i])
							&& selectedRoles[i] != null) {
						selectedRoleList.add(selectedRoles[i]);
					}
				}
			} catch (Exception e) {
				log.error(e);
			}
		}
		Button button;
		if (role.equals("everyone")) {
			button = new Button(group2, SWT.CHECK | SWT.SELECTED);
			button.setText(role);
			button.setSelection(true);
			if (!checkBoxes.contains(button)) {
				checkBoxes.add(button);
			}
		} else {
			button = new Button(group2, SWT.CHECK);
			button.setText(role);
			if (!checkBoxes.contains(button)) {
				checkBoxes.add(button);
			}
		}
		button.addSelectionListener(new SelectionListener() {

			public void widgetSelected(SelectionEvent event) {
//				if (!wizard.isNew) {
//					try {
//						String[] selectedRoles = um.getRolesPerUser(wizard.getRegUser().getUserName());
////						selectedRoleList = new ArrayList<String>();
//						for (int i=0; i< selectedRoles.length; i++) {
//							if(!selectedRoleList.contains(selectedRoles[i]) && selectedRoles[i] != null){
//								selectedRoleList.add(selectedRoles[i]);
//							}
//						}
//					} catch (Exception e) {
//						log.error(e);
//					}
//				}
				String role = ((Button) (event.widget)).getText();
				// selectedRoleList.add("everyone");
				boolean b = ((Button) (event.widget)).getSelection();
				if (b) {
					if (!selectedRoleList.contains(role)) {
						selectedRoleList.add(role);
					}
				} else {
					selectedRoleList.remove(role);
				}

				for (int i = 0; i < checkBoxes.size(); i++) {
					if (checkBoxes.get(i).getText().equals("everyone")) {
						checkBoxes.get(i).setSelection(true);
					}
				}
			}

			public void widgetDefaultSelected(SelectionEvent event) {

			}
		});
	}

	public ArrayList<String> getSelectedRoleList() {
		return selectedRoleList;
	}

	public void setSelectedRoleList(ArrayList<String> selectedRoleList) {
		this.selectedRoleList = selectedRoleList;
	}

	public String[] getRolesPerUser(String userName) throws Exception {
		return um.getRolesPerUser(userName);
	}

	public boolean passwordMatch(String pwd, String repeatPwd) {
		if (pwd != null && repeatPwd != null) {
			if (pwd.equals(repeatPwd)) {
				return true;
			}
		}
		return false;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getRepeatPwd() {
		return repeatPwd;
	}

	public void setRepeatPwd(String repeatPwd) {
		this.repeatPwd = repeatPwd;
	}

	public boolean isPWDStrong(String pwd) {
		if (pwd.length() > 5) {
			return true;
		} else {
			return false;
		}
	}

	public String[] getRoles() {
		if (um != null) {
			return um.getRoles();
		}
		return null;

	}

}
