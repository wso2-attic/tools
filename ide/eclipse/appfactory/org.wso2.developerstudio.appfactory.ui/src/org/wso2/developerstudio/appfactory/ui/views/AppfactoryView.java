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

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Properties;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.wizard.WizardDialog;
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
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.team.core.TeamException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.widgets.FormText;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.part.*;
import org.tigris.subversion.subclipse.core.ISVNRemoteFolder;
import org.tigris.subversion.subclipse.core.ISVNRepositoryLocation;
import org.tigris.subversion.subclipse.core.SVNProviderPlugin;
import org.tigris.subversion.subclipse.ui.wizards.CheckoutWizard;
import org.tigris.subversion.svnclientadapter.SVNRevision;
import org.tigris.subversion.svnclientadapter.SVNRevision.Number;
import org.wso2.developerstudio.appfactory.ui.Activator;
import org.wso2.developerstudio.eclipse.logging.core.IDeveloperStudioLog;
import org.wso2.developerstudio.eclipse.logging.core.Logger;
import org.wso2.developerstudio.eclipse.platform.core.utils.SWTResourceManager;
import org.wso2.developerstudio.appfactory.core.AppMgtClient;
import org.wso2.developerstudio.appfactory.core.Authenticator;
import org.wso2.developerstudio.appfactory.core.DeployUtil;
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
		
		checkoutAction = new Action("checkout",
				ImageDescriptor.createFromImage(SWTResourceManager
						.getImage(this.getClass(),
								"/icons/svn-co.png"))) {
			public void run() {	
				if (tblApplication.getSelectionCount() ==1){
					MessageBox msg = new MessageBox(form.getShell());
					ApplicationInfo appInfo = (ApplicationInfo)tblApplication.getSelection()[0].getData();
					try {
						showCheckoutWizard(appInfo);
					} catch (InterruptedException e) {
						msg.setMessage("Task interrupted by user");
						msg.open();
					} catch (InvocationTargetException e) {
						log.error("An unknown error occurred.", e.getTargetException());
						msg.setMessage("An unknown error occurred. See the log for more details.");
						msg.open();
					}
	
				}
			};
		};
		checkoutAction.setText("Checkout");
		deployToDevAction = new Action("deployToDev",
				ImageDescriptor.createFromImage(SWTResourceManager
						.getImage(this.getClass(),
								"/icons/deploy.png"))) {
			public void run() {
				if (tblApplication.getSelectionCount() ==1){
					MessageBox msg = new MessageBox(form.getShell());
					ApplicationInfo appInfo = (ApplicationInfo)tblApplication.getSelection()[0].getData();
					try {
						deployApp(appInfo, "Development");
					} catch (InterruptedException e) {
						msg.setMessage("Task interrupted by user");
						msg.open();
					} catch (InvocationTargetException e) {
						log.error("An unknown error occurred.", e.getTargetException());
						msg.setMessage("An unknown error occurred. See the log for more details.");
						msg.open();
					}
				}
			};
		};
		deployToDevAction.setText("Deploy to Development");
		deploytoLiveAction = new Action("deploytoLive",
				ImageDescriptor.createFromImage(SWTResourceManager
						.getImage(this.getClass(),
								"/icons/deploy.png"))) {
				public void run() {
					if (tblApplication.getSelectionCount() ==1){
						MessageBox msg = new MessageBox(form.getShell());
						ApplicationInfo appInfo = (ApplicationInfo)tblApplication.getSelection()[0].getData();
						try {
							deployApp(appInfo, "Live");
						} catch (InterruptedException e) {
							msg.setMessage("Task interrupted by user");
							msg.open();
						} catch (InvocationTargetException e) {
							log.error("An unknown error occurred.", e.getTargetException());
							msg.setMessage("An unknown error occurred. See the log for more details.");
							msg.open();
						}
					}
				};
		};
		deploytoLiveAction.setText("Deploy to Live");
		
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
			public void widgetSelected(SelectionEvent event) {
				MessageBox msg = new MessageBox(form.getShell());
				auth = new Authenticator();
				auth.setServerURL(txtServerURL.getText());
				auth.setUserName(txtUsername.getText());
				auth.setPassword(txtPassword.getText());

				try {
					if (auth.Authenticate()) {
						sctnLogin.setVisible(false);
						((GridData) sctnLogin.getLayoutData()).exclude = true;
						try {
							listApplications();
						} catch (InterruptedException e) {
							msg.setMessage("Task interrupted by user");
							msg.open();
						} catch (InvocationTargetException e) {
							log.error("An unknown error occurred.", e.getTargetException());
							msg.setMessage("An unknown error occurred. See the log for more details.");
							msg.open();
						}
						sctnApplication.setVisible(true);
						((GridData) sctnApplication.getLayoutData()).exclude = false;
						form.getBody().layout();

					} else {
						msg.setMessage("Authentication failed on connection to the server");
						msg.open();
					}
				} catch (Exception ex) {
					msg.setMessage("Unable to connect to the server. It may be invalid settings");
					msg.open();
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
	public void dispose() {
		toolkit.dispose();
		super.dispose();
	}
	
	private void listApplications() throws InvocationTargetException, InterruptedException {
		Shell activeShell = PlatformUI.getWorkbench().getDisplay().getActiveShell();
		new ProgressMonitorDialog(activeShell).run(true, true, new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor) throws InvocationTargetException {
				try {					
					PlatformUI.getWorkbench().getDisplay().syncExec(new Runnable() {
						public void run() {
							tblApplication.removeAll();
						}
					});
					appMgtClient = new AppMgtClient(auth);
					List<ApplicationInfo> allAppInfo = appMgtClient.getAllApplicationInfo(auth
							.getUserName());
					for (final ApplicationInfo appInfo : allAppInfo) {
						List<String> roles = appMgtClient.getUserRolesForApplication(
								appInfo.getApplicationKey(), auth.getUserName());
						if (roles.contains("developer")) {
							
							try {
								ISVNRepositoryLocation repositoryLocation = getRepository(monitor,
										appInfo.getApplicationRepoLink(), auth.getUserName(),
										auth.getPassword());
								Number revision = repositoryLocation.getSVNClient()
										.getInfo(repositoryLocation.getUrl()).getRevision();
								appInfo.setRevision(revision.getNumber());
							} catch (Exception e) {
								appInfo.setRevision(1);
							}
//							try {
//								Thread.sleep(2*1000);
//							} catch (Exception e) {
//								//ignore
//							}
							PlatformUI.getWorkbench().getDisplay().syncExec(new Runnable() {
								public void run() {
									TableItem item = new TableItem(tblApplication, SWT.None);
									item.setData(appInfo);
									item.setText(0, appInfo.getApplicationName());
									item.setText(1, appInfo.getApplicationRepoLink());
									item.setText(2, "r" + Long.toString(appInfo.getRevision()));
								}
							});
						}
					}
				} catch (Exception e) {
					throw new InvocationTargetException(e);
				}
			}
		});
	}
	
	private void showCheckoutWizard(ApplicationInfo appInfo) throws InvocationTargetException,
			InterruptedException {
		Shell activeShell = PlatformUI.getWorkbench().getDisplay().getActiveShell();
		final String url = appInfo.getApplicationRepoLink();

		new ProgressMonitorDialog(activeShell).run(true, true, new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor) throws InvocationTargetException {
				try {
					ISVNRepositoryLocation location = getRepository(monitor, url,
							auth.getUserName(), auth.getPassword());

					final ISVNRemoteFolder[] folders = new ISVNRemoteFolder[] { location
							.getRootFolder() };
					
					PlatformUI.getWorkbench().getDisplay().syncExec(new Runnable() {
						public void run() {
							Shell activeShell = PlatformUI.getWorkbench().getDisplay().getActiveShell();
							CheckoutWizard wizard = new CheckoutWizard(folders);
							WizardDialog dialog = new WizardDialog(activeShell, wizard);
							dialog.open();
						}
					});
				} catch (TeamException e) {
					throw new InvocationTargetException(e);
				}
			}
		});
	}
	
	private ISVNRepositoryLocation getRepository(IProgressMonitor monitor, String url,
			String userName, String password) throws TeamException {

		Properties properties = new Properties();
		properties.setProperty("user", userName);
		properties.setProperty("password", password); 
		properties.setProperty("url", url);

		SVNProviderPlugin provider = SVNProviderPlugin.getPlugin();
		ISVNRepositoryLocation root = provider.getRepositories().getRepository(properties.getProperty("url"));

		/* create a local repository if not already exists */
		if (root == null) {
			root = provider.getRepositories().createRepository(properties);
			root.validateConnection(monitor);
			provider.getRepositories().addOrUpdateRepository(root);
		} else{
//			root.setUsername(userName);
//			root.setPassword(password);
//			root.validateConnection(monitor);
//			provider.getRepositories().addOrUpdateRepository(root);
		}
		
		return root;
	}
	
	
	private boolean deployApp(final ApplicationInfo appInfo, final String stage)
			throws InvocationTargetException, InterruptedException {
		Shell activeShell = PlatformUI.getWorkbench().getDisplay().getActiveShell();
		final boolean result[] = new boolean[1];
		new ProgressMonitorDialog(activeShell).run(true, true, new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor) throws InvocationTargetException {
				try {
					String appKey = appInfo.getApplicationKey();
					String url = appInfo.getApplicationRepoLink();
					String revision = Long.toString(appInfo.getRevision());
					DeployUtil deployUtil = new DeployUtil(auth);
					result[0] = deployUtil.deployToStage(appKey, revision,"1.0" , stage);
				} catch (Exception e) {
					throw new InvocationTargetException(e);
				}
			}
		});
		return result[0];
	}

	@Override
	public void setFocus() {
		tblApplication.forceFocus();
		
	}
	
}