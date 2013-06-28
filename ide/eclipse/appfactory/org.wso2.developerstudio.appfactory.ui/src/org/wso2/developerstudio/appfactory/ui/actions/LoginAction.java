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

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.e4.ui.di.UISynchronize;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IPersistableElement;
import org.eclipse.ui.IPerspectiveRegistry;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.WorkbenchException;
import org.eclipse.ui.console.MessageConsoleStream;
import org.eclipse.ui.intro.IIntroPart;
import org.osgi.framework.Bundle;
import org.wso2.developerstudio.appfactory.core.authentication.Authenticator;
import org.wso2.developerstudio.appfactory.core.authentication.UserPasswordCredentials;
import org.wso2.developerstudio.appfactory.core.client.HttpsGenkinsClient;
import org.wso2.developerstudio.appfactory.core.client.HttpsJaggeryClient;
import org.wso2.developerstudio.appfactory.core.jag.api.JagApiProperties;
import org.wso2.developerstudio.appfactory.core.model.ErroModel;
import org.wso2.developerstudio.appfactory.ui.Activator;
import org.wso2.developerstudio.appfactory.ui.preference.AppFactoryPreferencePage;
import org.wso2.developerstudio.appfactory.ui.views.PasswordDialog;
import org.wso2.developerstudio.appfactory.ui.views.TestOutputConsole;
import org.wso2.developerstudio.eclipse.logging.core.IDeveloperStudioLog;
import org.wso2.developerstudio.eclipse.logging.core.Logger;


import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class LoginAction {
	 private static IDeveloperStudioLog log=Logger.getLog(Activator.PLUGIN_ID);
	 private String username="";
	 private String password="";
	 private Authenticator authenticator;
	 private UserPasswordCredentials credentials;
	 private Shell activeShell;
	 private IPreferenceStore preferenceStore;
	 private boolean isCansel;
	 
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
	 }
	
	public boolean login() {
		boolean val = true;
		try { 
			showLoginDialog();
			if(isCansel){
				return false;
			}
			credentials = new UserPasswordCredentials(getUsername(),getPassword());
		    val = authenticator.Authenticate(JagApiProperties.getLoginUrl(), credentials); 
		    if(!val){
                this.ShowErrorMsg(); 
		    }
		    
		} catch (Exception e) {
			 ErroModel erroModel = Authenticator.getInstance().getErroModel();
    	     erroModel.setMessage("Authentication Failer");
    	     List<String> resions = new ArrayList<String>();
    	     resions.add("Please refer the log file for details");
    	     erroModel.setResions(resions);
	        log.error("Login failer", e);
	        return false;
		} 
		return val;
	}

	private void ShowErrorMsg(){
		   ErroModel erroModel = Authenticator.getInstance().getErroModel();
		   final String PID = Activator.PLUGIN_ID;
		   MultiStatus info = new MultiStatus(PID, 1,"AppFactory Login Fail !", null);
		   info.add(new Status(IStatus.INFO, PID, 1,erroModel.getMessage(), null));
		   List<String> resions = erroModel.getResions();
		   if(resions!=null){
		   for (String msg : resions) {
			   info.add(new Status(IStatus.INFO, PID, 1,msg, null));
		   		}
		   }
		   ErrorDialog.openError(activeShell, "AppFactory Login Error", null, info);
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
		 }else {
			   this.setCansel(true);
			   MessageBox messageBox = new MessageBox(getActiveShell(), SWT.ICON_INFORMATION | SWT.OK);
			   messageBox.setText("Information");
			   messageBox.setMessage("AppFactory Perpective's views Loarding Fail ! \nPlease use perspective " +
				   		"reset option to relogin to the AppFactory perspective \n ");  
			   messageBox.open();
		 } 
	}

	public boolean isCansel() {
		return isCansel;
	}

	public void setCansel(boolean isCansel) {
		this.isCansel = isCansel;
	}
	static final String DASHBOARD_VIEW_ID = "org.wso2.developerstudio.eclipse.dashboard";

}
