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

package org.wso2.developerstudio.appfactory.ui.views;

import java.util.List;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.FormText;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.part.*;
import org.wso2.developerstudio.appfactory.ui.Activator;
import org.wso2.developerstudio.eclipse.logging.core.IDeveloperStudioLog;
import org.wso2.developerstudio.eclipse.logging.core.Logger;
import org.wso2.developerstudio.eclipse.platform.core.utils.SWTResourceManager;
import org.wso2.developerstudio.appfactory.core.AppMgtClient;
import org.wso2.developerstudio.appfactory.core.Authenticator;
import org.wso2.developerstudio.appfactory.core.model.ApplicationInfo;

public class AppfactoryView extends ViewPart {
	
	public static final String ID = "org.wso2.developerstudio.appfactory.ui.views.AppfactoryView";
	
	private static IDeveloperStudioLog log=Logger.getLog(Activator.PLUGIN_ID);
	
	private FormToolkit toolkit;
	private ScrolledForm form;
	private Composite body;
	private Table tblApplication;
	
	private Text txtServerURL;
	private Text txtUsername;
	private Text txtPassword;
	
	private Action loginAction;
	private Action checkoutAction;
	private Action deployToDevAction;
	private Action deploytoLiveAction;
	
	private Section sctnApplication;
	private Section sctnLogin;
	
	private Authenticator auth;
	private AppMgtClient appMgtClient;

	public AppfactoryView() {
	}

	
	public void createPartControl(Composite parent) {
		toolkit = new FormToolkit(parent.getDisplay());
		form = toolkit.createScrolledForm(parent);
		body = form.getBody();
		form.setText("WSO2 AppFactory");
		
		loginAction = new Action("Login") {
			public void run() {
				sctnApplication.setVisible(false);
				((GridData)sctnApplication.getLayoutData()).exclude=true;
				
				sctnLogin.setVisible(true);
				((GridData)sctnLogin.getLayoutData()).exclude=false;
				form.getBody().layout();
			};
		};
		loginAction.setText("login");
		
		checkoutAction = new Action("checkout") {
		};
		checkoutAction.setText("Checkout");
		deployToDevAction = new Action("deployToDev") {
		};
		deployToDevAction.setText("Deploy to Development");
		deploytoLiveAction = new Action("deploytoLive") {
		};
		deploytoLiveAction.setText("Deploy to Development");
		
		form.getToolBarManager().add(loginAction);
		toolkit.decorateFormHeading(form.getForm());
		toolkit.paintBordersFor(body);
		body.setLayout(new GridLayout(1, false));
		
		/*Applications Section */
		
		sctnApplication = toolkit.createSection(body, Section.TWISTIE | Section.TITLE_BAR);
		GridData gd_sctnApplication = new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1);
		gd_sctnApplication.exclude=true;
		//gd_sctnAddApplication.widthHint = 278;
		sctnApplication.setLayoutData(gd_sctnApplication);
		toolkit.paintBordersFor(sctnApplication);
		sctnApplication.setText("Applications");
		sctnApplication.setExpanded(true);
		sctnApplication.setVisible(false);
		
		Composite comApplication = toolkit.createComposite(sctnApplication, SWT.NONE);
		toolkit.paintBordersFor(comApplication);
		sctnApplication.setClient(comApplication);
		comApplication.setLayout(new GridLayout(2, false));
		
		tblApplication = toolkit.createTable(comApplication, SWT.NONE);
		GridData gd_table = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
		gd_table.heightHint = 250;
		tblApplication.setLayoutData(gd_table);
		toolkit.paintBordersFor(tblApplication);
		tblApplication.setHeaderVisible(true);
		tblApplication.setLinesVisible(true);
		
		TableColumn tblclmnApplicationName = new TableColumn(tblApplication, SWT.NONE);
		tblclmnApplicationName.setWidth(200);
		tblclmnApplicationName.setText("Application Name");
		
		TableColumn tblclmnSvnUrl = new TableColumn(tblApplication, SWT.NONE);
		tblclmnSvnUrl.setWidth(200);
		tblclmnSvnUrl.setText("SVN URL");
		
		TableColumn tblclmnRevisionNumber = new TableColumn(tblApplication, SWT.NONE);
		tblclmnRevisionNumber.setWidth(50);
		tblclmnRevisionNumber.setText("Revision number");
		
		MenuManager popupMenu = new MenuManager();
		popupMenu.add(checkoutAction);
		popupMenu.add(deployToDevAction);
		popupMenu.add(deploytoLiveAction);
		
		Menu menu = popupMenu.createContextMenu(tblApplication);
		tblApplication.setMenu(menu);
		/* section end */
		
		/*sign-in Section */
		sctnLogin = toolkit.createSection(form.getBody(), Section.TWISTIE | Section.TITLE_BAR);
		GridData gd_sctnLogin = new GridData(SWT.CENTER, SWT.CENTER, true, false, 1, 1);
		gd_sctnLogin.widthHint = 500;
		gd_sctnLogin.verticalIndent = 50;
		sctnLogin.setLayoutData(gd_sctnLogin);
		toolkit.paintBordersFor(sctnLogin);
		sctnLogin.setText("Sign-in");
		sctnLogin.setExpanded(true);
		
		Composite comLogin = toolkit.createComposite(sctnLogin, SWT.NONE);
		toolkit.paintBordersFor(comLogin);
		sctnLogin.setClient(comLogin);
		comLogin.setLayout(new GridLayout(3, false));
		
		FormText lblServerURL = toolkit.createFormText(comLogin, false);
		GridData gd_lblServerURL = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
		gd_sctnLogin.widthHint = 175;
		lblServerURL.setLayoutData(gd_lblServerURL);
		toolkit.paintBordersFor(lblServerURL);
		lblServerURL.setText("Server URL", false, false);
		
		txtServerURL = toolkit.createText(comLogin, "https://localhost:9443/", SWT.NONE);
		GridData gd_txtServerURL = new GridData(SWT.FILL, SWT.CENTER, false, false, 2, 1);
		gd_txtServerURL.widthHint = 220;
		txtServerURL.setLayoutData(gd_txtServerURL);
		
		FormText lblUsername = toolkit.createFormText(comLogin, false);
		toolkit.paintBordersFor(lblUsername);
		lblUsername.setText("Username", false, false);
		
		txtUsername = toolkit.createText(comLogin, "", SWT.NONE);
		txtUsername.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
		
		FormText lblPassword = toolkit.createFormText(comLogin, false);
		toolkit.paintBordersFor(lblPassword);
		lblPassword.setText("Password", false, false);
		
		txtPassword = toolkit.createText(comLogin, "", SWT.NONE|SWT.PASSWORD);
		txtPassword.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
		
		Label label = new Label(comLogin, SWT.NONE);
		Button btnSignIn = new Button(comLogin, SWT.NONE);
		btnSignIn.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		toolkit.adapt(btnSignIn, true, true);
		btnSignIn.setText("Sign in");
		btnSignIn.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				auth = new Authenticator();
				auth.setServerURL(txtServerURL.getText());
				auth.setUserName(txtUsername.getText());
				auth.setPassword(txtPassword.getText());

				try {
					if (auth.Authenticate()) {
						sctnLogin.setVisible(false);
						((GridData) sctnLogin.getLayoutData()).exclude = true;

						tblApplication.removeAll();
						
						appMgtClient = new AppMgtClient(auth);
						List<ApplicationInfo> allAppInfo = appMgtClient.getAllApplicationInfo(auth.getUserName());
						for (ApplicationInfo appInfo : allAppInfo) {
							TableItem item = new TableItem(tblApplication, SWT.None);
							item.setText(0, appInfo.getApplicationName());
							item.setText(1, appInfo.getApplicationRepoLink());
							item.setText(2, "r0");
						}
						sctnApplication.setVisible(true);
						((GridData) sctnApplication.getLayoutData()).exclude = false;
						form.getBody().layout();

					} else {
						MessageBox msg = new MessageBox(form.getShell());
						msg.setMessage("Authentication failed on connection to the server");
						msg.open();
					}
				} catch (Exception ex) {
					log.error(ex);
				}
			}
		});
		
		Button btnCancel = new Button(comLogin, SWT.NONE);
		toolkit.adapt(btnCancel, true, true);
		btnCancel.setText("Cancel");
		btnCancel.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				sctnLogin.setVisible(false);
				((GridData)sctnLogin.getLayoutData()).exclude=true;
				form.getBody().layout();
			}
		});
		
		form.updateToolBar();
		form.reflow(true);
		
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void dispose() {
		toolkit.dispose();
		super.dispose();
	}
	
}