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

package org.wso2.carbonstudio.eclipse.greg.manager.local.checkout.actions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.SSLHandshakeException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.wso2.carbonstudio.eclipse.greg.base.persistent.RegistryCredentialData;
import org.wso2.carbonstudio.eclipse.greg.base.persistent.RegistryCredentialData.Credentials;
import org.wso2.carbonstudio.eclipse.greg.base.ui.util.SWTControlUtils;
import org.wso2.carbonstudio.eclipse.greg.manager.local.Activator;
import org.wso2.carbonstudio.eclipse.greg.manager.local.dialog.CheckingToRegistryDialog;
import org.wso2.carbonstudio.eclipse.greg.manager.local.utils.RegistryCheckInClientUtils;
import org.wso2.carbonstudio.eclipse.logging.core.ICarbonStudioLog;
import org.wso2.carbonstudio.eclipse.logging.core.Logger;
import org.wso2.registry.checkin.CheckinClientException;

public class AddToRegistryAction extends BaseRegistryAction {
	private static ICarbonStudioLog log=Logger.getLog(Activator.PLUGIN_ID);

	/**
	 * execute File
	 */
	protected void executeFile(IFile file, IAction action) {

	}
	
	private boolean isRegistryUrlValid(String url) {
		
		try {
			HttpURLConnection.setFollowRedirects(false);
			HttpURLConnection con = (HttpURLConnection) new URL(url).openConnection();
		    con.connect();
//		    if(con.getResponseCode() == HttpURLConnection.HTTP_OK){
//		    	return true;
//		    }
		} catch (MalformedURLException e) {
			log.error(e);
			return false;
		} catch (SSLHandshakeException e) {
			log.error(e);
			return true;
		}catch (IOException e) {
			log.error(e);
		    return false;
		} 
		catch (Exception e) {
			log.error(e);
		    return false;
		 }
		return true;
		
	}

	/**
	 * execute Folder
	 */
	protected void executeFolder(IFolder folder, IAction action) {
		CheckingToRegistryDialog checkingToRegistryDialog = new CheckingToRegistryDialog(
															Display.getCurrent().getActiveShell(), 
															folder);
		if (checkingToRegistryDialog.open() == Window.OK) {
			String url = checkingToRegistryDialog.getServerUrl();
			String path = checkingToRegistryDialog.getPath();
			if(isRegistryUrlValid(url)){
				Credentials credentials = RegistryCredentialData.getInstance().getCredentials(url);
				if(credentials != null){
					if (!(credentials.getUsername() != null && 
						  credentials.getPassword() != null && 
						  MessageDialog.openQuestion(Display.getCurrent().getActiveShell(),
													"Credentials", 
													"Check-in as user '" + 
													credentials.getUsername() + "'?"))) {
														credentials = SWTControlUtils.requestCredentials(
																	   Display.getCurrent().getActiveShell(), 
																	   url, 
																	   credentials.getUsername() == null ?
																	   "" : credentials.getUsername());
														if (credentials == null){
															return;
														}
												}
					try {
						RegistryCheckInClientUtils.checkin(url, 
													path, 
													folder.getLocation().toOSString(), 
													credentials.getUsername(), 
													credentials.getPassword());
						MessageDialog.openInformation(Display.getCurrent().getActiveShell(), 
													"Check-in Info", "Successfully check-in the changes..");
					} catch (CheckinClientException e) {
						log.error(e);
					}
				}else{
					try {
						RegistryCheckInClientUtils.checkin(url, 
								path, 
								folder.getLocation().toOSString(), 
								checkingToRegistryDialog.getAddedServerUserName(), 
								checkingToRegistryDialog.getAddedServerUserName());
						MessageDialog.openInformation(Display.getCurrent().getActiveShell(), 
								"Check-in Info", "Successfully check-in the changes..");
					} catch (CheckinClientException e) {
						MessageDialog.openError(Display.getCurrent().getActiveShell(), 
								"Check-in Info", "Failed to check-in the changes..");
						log.error(e);
					}
				}
			}else{
				MessageDialog.openError(Display.getCurrent().getActiveShell(), 
						"Check-in Info", "Failed to check-in the changes. Selected Registy instance may not be " +
								"available.");
			}
 
			
		}
	}

	/**
	 * execute Resource
	 */
	protected void executeResource(IResource resource, IAction action) {

	}

	/**
	 * selected File
	 */
	protected void selectedFile(IFile file, IAction action) {

	}

    /**
     * selected Folder
     */
	protected void selectedFolder(IFolder folder, IAction action) {

	}

	/**
	 * selected Resource
	 */
	protected void selectedResource(IResource resource, IAction action) {
		if (RegistryCheckInClientUtils.isRegistryResource(resource.getLocation().toOSString()) || 
				RegistryCheckInClientUtils.getResourceState(
					resource.getLocation().toOSString()) == RegistryCheckInClientUtils.RESOURCE_STATE_NEW){
			action.setEnabled(false);
		}
	}

}
