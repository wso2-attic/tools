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
import org.wso2.developerstudio.appfactory.core.utils.Messages;

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
		
		Display.getCurrent().getActiveShell().setCursor((new Cursor(Display.getCurrent(), SWT.CURSOR_WAIT)));
	    ProgressMonitorDialog progressMonitorDialog = new ProgressMonitorDialog(Display.getDefault().getActiveShell());
		progressMonitorDialog.create();
		progressMonitorDialog.open();
		progressMonitorDialog.run(true, false, new LoginToAppFacPerfectiveJob(credentials,serverUrl,this));
		
		while(true){
			if(Messages.Authenticator_0.equals(this.result)){
				this.serverURL = serverUrl;
				this.credentials = credentials;
				return true;
			}else if(Messages.Authenticator_1.equals(this.result)){
				return false;
			}
		}
	}
	
	public boolean reLogin()
	{
		Map<String, String> params = new HashMap<String, String>();
		params.put(Messages.Authenticator_2, Messages.Authenticator_3);
		params.put(Messages.Authenticator_4, credentials.getUser());
		params.put(Messages.Authenticator_5, credentials.getPassword());
		String value = HttpsJaggeryClient.httpPostLogin(JagApiProperties.getLoginUrl(), params);
		if (!Messages.Authenticator_6.equals(value)) {
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
	 public LoginToAppFacPerfectiveJob(UserPasswordCredentials credentials,String serverUrl,Authenticator authenticator) {
		 this.credentials = credentials;
		 this.serverUrl = serverUrl;
		 this.authenticator = authenticator;
	}
	  
		@Override
		public void run(IProgressMonitor monitor) {
			String operationText=Messages.Authenticator_7+JagApiProperties.getDomain();
			monitor.beginTask(operationText, 100);
			try{
				operationText=Messages.Authenticator_8;
				monitor.subTask(operationText);
				monitor.worked(10);
				if(Messages.Authenticator_9.equals(credentials.getUser())||Messages.Authenticator_10.equals(credentials.getPassword())){
					operationText=Messages.Authenticator_11;
					monitor.subTask(operationText);
					monitor.worked(0);
					monitor.setCanceled(true);
					authenticator.setResult(Messages.Authenticator_12);
					Authenticator.getInstance().getErrorModel().setMessage(Messages.Authenticator_13);
				    List<String> resions = new ArrayList<String>();
		    	    errorModel.setReasons(resions);
					return;
				}
				operationText=Messages.Authenticator_14;
				monitor.subTask(operationText);
				monitor.worked(20);
				Map<String, String> params = new HashMap<String, String>();
				params.put(Messages.Authenticator_15, Messages.Authenticator_16);
				params.put(Messages.Authenticator_17, credentials.getUser());
				params.put(Messages.Authenticator_18, credentials.getPassword());
				String value = HttpsJaggeryClient.httpPostLogin(serverUrl, params);
				if (!Messages.Authenticator_19.equals(value)) {
					operationText=Messages.Authenticator_20;
					authenticator.setResult(Messages.Authenticator_21);
				}else{
					operationText=Messages.Authenticator_22;
					authenticator.setResult(Messages.Authenticator_23);	
				}
				monitor.subTask(operationText);
				monitor.worked(80);
			}catch(Exception e){
				
				authenticator.setResult(Messages.Authenticator_24);
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



