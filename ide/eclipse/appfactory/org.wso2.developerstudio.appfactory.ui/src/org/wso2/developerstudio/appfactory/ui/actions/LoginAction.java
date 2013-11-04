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

import java.util.ArrayList;
import java.util.List;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Cursor;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.wso2.developerstudio.appfactory.core.authentication.Authenticator;
import org.wso2.developerstudio.appfactory.core.authentication.UserPasswordCredentials;
import org.wso2.developerstudio.appfactory.core.jag.api.JagApiProperties;
import org.wso2.developerstudio.appfactory.core.model.ErrorModel;
import org.wso2.developerstudio.appfactory.ui.Activator;
import org.wso2.developerstudio.appfactory.ui.preference.AppFactoryPreferencePage;
import org.wso2.developerstudio.appfactory.ui.utils.Messages;
import org.wso2.developerstudio.appfactory.ui.views.PasswordDialog;
import org.wso2.developerstudio.eclipse.logging.core.IDeveloperStudioLog;
import org.wso2.developerstudio.eclipse.logging.core.Logger;

public class LoginAction {
	 private static IDeveloperStudioLog log=Logger.getLog(Activator.PLUGIN_ID);
	 private String username=Messages.LoginAction_0;
	 private String password=Messages.LoginAction_1;
	 private Authenticator authenticator;
	 private UserPasswordCredentials credentials;
	 private Shell activeShell;
	 private IPreferenceStore preferenceStore;
	 private boolean isCansel;
	 private boolean isSave;
	 
	 public IPreferenceStore getPreferenceStore() {
		return preferenceStore;
	}

	public void setPreferenceStore(IPreferenceStore preferenceStore) {
		this.preferenceStore = preferenceStore;
	}

	public Shell getActiveShell() {
		return activeShell;
	}

	public void setActiveShell(Shell activeShell) {
		this.activeShell = activeShell;
	}

	public LoginAction() throws Exception{
		 preferenceStore = Activator.getDefault().getPreferenceStore();
		 authenticator = Authenticator.getInstance();
		 activeShell = PlatformUI.getWorkbench().getDisplay().getActiveShell();
		 preferenceStore.setDefault(AppFactoryPreferencePage.APP_FACTORY_LOCATION, JagApiProperties.getDomain());
		 setLoginUrl(preferenceStore.getString(AppFactoryPreferencePage.APP_FACTORY_LOCATION));
		 setUsername(preferenceStore.getString(AppFactoryPreferencePage.APP_FACTORY_USERNAME));
		 setPassword(preferenceStore.getString(AppFactoryPreferencePage.APP_FACTORY_PASSWORD));
		 String val = preferenceStore.getString(AppFactoryPreferencePage.APP_FACTORY_SAVE);
		 if(Messages.LoginAction_2.equals(val)){
			 setSave(true);
		 }else{
			 setSave(false);
		 }
	 }
	
	public boolean login() {
		boolean val = true;
		try { 
			
			if(!isSave){
				showLoginDialog();
			}
			if(isCansel){
				return false;
			}
			
			credentials = new UserPasswordCredentials(getUsername(),getPassword());
		    val = authenticator.Authenticate(JagApiProperties.getLoginUrl(), credentials); 
		    if(!val){
                this.ShowErrorMsg(); 
                Display.getCurrent()
				.getActiveShell()
				.setCursor(
						(new Cursor(Display.getCurrent(), SWT.CURSOR_ARROW)));
		    }
		    if(isSave()){
				  preferenceStore.setValue(AppFactoryPreferencePage.APP_FACTORY_LOCATION, JagApiProperties.getDomain());
				  preferenceStore.setValue(AppFactoryPreferencePage.APP_FACTORY_USERNAME,getUsername());
				  preferenceStore.setValue(AppFactoryPreferencePage.APP_FACTORY_PASSWORD,getPassword());
				  preferenceStore.setValue(AppFactoryPreferencePage.APP_FACTORY_SAVE,Messages.LoginAction_3);
			}
		} catch (Exception e) {
			 ErrorModel errorModel = Authenticator.getInstance().getErrorModel();
    	     errorModel.setMessage(Messages.LoginAction_4);
    	     List<String> resions = new ArrayList<String>();
    	     resions.add(Messages.LoginAction_5);
    	     errorModel.setReasons(resions);
	        log.error(Messages.LoginAction_6, e);
	        Display.getCurrent()
			.getActiveShell()
			.setCursor(
					(new Cursor(Display.getCurrent(), SWT.CURSOR_ARROW)));
	        return false;
		} 
		return val;
	}

	private void ShowErrorMsg(){
		   ErrorModel errorModel = Authenticator.getInstance().getErrorModel();
		   final String PID = Activator.PLUGIN_ID;
		   MultiStatus info = new MultiStatus(PID, 1,Messages.LoginAction_7, null);
		   info.add(new Status(IStatus.INFO, PID, 1,errorModel.getMessage(), null));
		   List<String> reasons = errorModel.getReasons();
			if (reasons != null) {
				for (String msg : reasons) {
					info.add(new Status(IStatus.INFO, PID, 1, msg, null));
				}
			} else {
				info.add(new Status(IStatus.INFO, PID, 1,
						Messages.LoginAction_8,
						null));
			}
		   ErrorDialog.openError(activeShell, Messages.LoginAction_9, null, info);
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
			  setSave(dialog.isSave());
		 }else {
			   this.setCansel(true);
			   MessageBox messageBox = new MessageBox(getActiveShell(), SWT.ICON_INFORMATION | SWT.OK);
			   messageBox.setText(Messages.LoginAction_10);
			   messageBox.setMessage(Messages.LOGIN_ACTION_FAIL);  
			   messageBox.open();
		 } 
	}

	public boolean isCansel() {
		return isCansel;
	}

	public void setCansel(boolean isCansel) {
		this.isCansel = isCansel;
	}
	public boolean isSave() {
		return isSave;
	}

	public void setSave(boolean isSave) {
		this.isSave = isSave;
	}
	static final String DASHBOARD_VIEW_ID = Messages.LoginAction_11;

}
