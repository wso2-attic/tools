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

package org.wso2.developerstudio.appfactory.ui.actions;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.wso2.developerstudio.appfactory.core.authentication.Authenticator;
import org.wso2.developerstudio.appfactory.core.authentication.UserPasswordCredentials;
import org.wso2.developerstudio.appfactory.core.jag.api.JagApiProperties;
import org.wso2.developerstudio.appfactory.ui.Activator;
import org.wso2.developerstudio.appfactory.ui.preference.AppFactoryPreferencePage;
import org.wso2.developerstudio.appfactory.ui.views.PasswordDialog;
import org.wso2.developerstudio.eclipse.logging.core.IDeveloperStudioLog;
import org.wso2.developerstudio.eclipse.logging.core.Logger;

public class LoginAction {
	 private static IDeveloperStudioLog log=Logger.getLog(Activator.PLUGIN_ID);
	 private IPreferenceStore preferenceStore;
	 public IPreferenceStore getPreferenceStore() {
		return preferenceStore;
	}

	public void setPreferenceStore(IPreferenceStore preferenceStore) {
		this.preferenceStore = preferenceStore;
	}

	 private String username="";
	 private String password="";
	 private Authenticator authenticator;
	 private UserPasswordCredentials credentials;
	 private Shell activeShell;
	 
	public Shell getActiveShell() {
		return activeShell;
	}

	public void setActiveShell(Shell activeShell) {
		this.activeShell = activeShell;
	}

	public LoginAction() {
		 preferenceStore = Activator.getDefault().getPreferenceStore();
		 authenticator = Authenticator.getInstance();
		 activeShell = PlatformUI.getWorkbench().getDisplay().getActiveShell();
		 try{
		 preferenceStore.setDefault(AppFactoryPreferencePage.APP_FACTORY_LOCATION, JagApiProperties.getDomain());
		 setLoginUrl(preferenceStore.getString(AppFactoryPreferencePage.APP_FACTORY_LOCATION));
		 setUsername(preferenceStore.getString(AppFactoryPreferencePage.APP_FACTORY_USERNAME));
		 setPassword(preferenceStore.getString(AppFactoryPreferencePage.APP_FACTORY_PASSWORD));
		 }catch(Exception e){
			 log.error("preference store error", e);
		 }
	 }
	
	public boolean login() {
		boolean val = true;
		try { 
			showLoginDialog();
			credentials = new UserPasswordCredentials(getUsername(),getPassword());
		    val = authenticator.Authenticate(JagApiProperties.getLoginUrl(), credentials); 
		} catch (Exception e) {
			MessageBox messageBox = new MessageBox(activeShell,SWT.OK);
	        messageBox.setText("Error");
	        messageBox.setMessage(e.getMessage());
	        log.error("Login failer", e);
		} 
		return val;
 
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	 

	public void setLoginUrl(String loginUrl) {
		JagApiProperties.setDomain(loginUrl);
	}
	
	private void showLoginDialog(){
		  PasswordDialog dialog = new PasswordDialog(activeShell);
		  dialog.setHost(JagApiProperties.getDomain());
		  dialog.setUser(getUsername());
		  dialog.setPassword(getPassword());
		 if (dialog.open() == Window.OK) {
			  setUsername(dialog.getUser());
			  setPassword(dialog.getPassword());
			  setLoginUrl(dialog.getHost());
		 } 
	}
	
}
