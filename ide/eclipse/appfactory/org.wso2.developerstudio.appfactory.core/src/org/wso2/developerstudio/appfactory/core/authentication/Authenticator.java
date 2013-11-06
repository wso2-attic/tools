/* Copyright (c) 2012, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
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

package org.wso2.developerstudio.appfactory.core.authentication;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Cursor;
import org.eclipse.swt.widgets.Display;
import org.wso2.developerstudio.appfactory.core.client.HttpsJaggeryClient;
import org.wso2.developerstudio.appfactory.core.jag.api.JagApiProperties;
import org.wso2.developerstudio.appfactory.core.model.ErrorModel;

public class Authenticator {

	public String serverURL;
	private static Authenticator authanticator = null;
	private UserPasswordCredentials credentials;
	private String result;
	

	private ErrorModel errorModel;
 

	public ErrorModel getErrorModel() {
		return errorModel;
	}

	public void setErrorModel(ErrorModel errorModel) {
		this.errorModel = errorModel;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	protected Authenticator() {

	}
	public static Authenticator getInstance() {
		if (authanticator == null) {
			authanticator = new Authenticator();
			ErrorModel errorModel = new ErrorModel();
			authanticator.setErrorModel(errorModel);
		}
		return authanticator;
	}

	public boolean Authenticate(String serverUrl,
			UserPasswordCredentials credentials) throws Exception {
		
		Display.getCurrent().getActiveShell().setCursor((new Cursor(Display.getCurrent(),
				SWT.CURSOR_WAIT)));
	    ProgressMonitorDialog progressMonitorDialog = new ProgressMonitorDialog(
	    		Display.getDefault().getActiveShell());
		progressMonitorDialog.create();
		progressMonitorDialog.open();
		progressMonitorDialog.run(true, false, new LoginToAppFacPerfectiveJob(
				credentials,serverUrl,this));
		
		while(true){
			if("true".equals(this.result)){
				this.serverURL = serverUrl;
				this.credentials = credentials;
				return true;
			}else if("false".equals(this.result)){
				return false;
			}
		}
	}
	
	public boolean reLogin()
	{
		Map<String, String> params = new HashMap<String, String>();
		params.put("action", "login");
		params.put("userName", credentials.getUser());
		params.put("password", credentials.getPassword());
		String value = HttpsJaggeryClient.httpPostLogin(JagApiProperties.getLoginUrl(), params);
		if (!"false".equals(value)) {
			 return true;
		}else{
			 return false;
		}
			 
	}

	public UserPasswordCredentials getCredentials() {
		return credentials;
	}

	public void setCredentials(UserPasswordCredentials credentials) {
		this.credentials = credentials;
	}

	private class LoginToAppFacPerfectiveJob implements IRunnableWithProgress {
		
		UserPasswordCredentials credentials;
		String serverUrl;
		Authenticator authenticator;
	 public LoginToAppFacPerfectiveJob(UserPasswordCredentials credentials,String serverUrl,
			 Authenticator authenticator) {
		 this.credentials = credentials;
		 this.serverUrl = serverUrl;
		 this.authenticator = authenticator;
	}
	  
		@Override
		public void run(IProgressMonitor monitor) {
			String operationText="fetching data from AppFactory "+JagApiProperties.getDomain();
			monitor.beginTask(operationText, 100);
			try{
				operationText="validating credentials";
				monitor.subTask(operationText);
				monitor.worked(10);
				if("".equals(credentials.getUser())||"".equals(credentials.getPassword())){
					operationText="Incorrect format of credentials";
					monitor.subTask(operationText);
					monitor.worked(0);
					monitor.setCanceled(true);
					authenticator.setResult("false");
					Authenticator.getInstance().getErrorModel().setMessage(
							"Username or password cannot be empty !!");
				    List<String> resions = new ArrayList<String>();
		    	    errorModel.setResions(resions);
					return;
				}
				operationText="Sending login request...";
				monitor.subTask(operationText);
				monitor.worked(20);
				Map<String, String> params = new HashMap<String, String>();
				params.put("action", "login");
				params.put("userName", credentials.getUser());
				params.put("password", credentials.getPassword());
				String value = HttpsJaggeryClient.httpPostLogin(serverUrl, params);
				if (!"false".equals(value)) {
					operationText="Login successfully ";
					authenticator.setResult("true");
				}else{
					operationText="Login unsuccessfully due to invalid credentials";
					authenticator.setResult("false");	
				}
				monitor.subTask(operationText);
				monitor.worked(80);
			}catch(Exception e){
				
				authenticator.setResult("false");
							operationText=e.getMessage();
				monitor.beginTask(operationText, 100);
				monitor.worked(0);
				monitor.setCanceled(true);
			}
			
			monitor.worked(100);
			monitor.done();
		}
	}  
}



