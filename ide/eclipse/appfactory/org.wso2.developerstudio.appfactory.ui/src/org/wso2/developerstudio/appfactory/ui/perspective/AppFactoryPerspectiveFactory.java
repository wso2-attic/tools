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

package org.wso2.developerstudio.appfactory.ui.perspective;

import java.net.URL;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
import org.eclipse.ui.browser.IWebBrowser;
import org.eclipse.ui.browser.IWorkbenchBrowserSupport;
import org.eclipse.ui.console.IConsoleConstants;
import org.wso2.developerstudio.appfactory.ui.Activator;
import org.wso2.developerstudio.appfactory.ui.actions.LoginAction;
import org.wso2.developerstudio.appfactory.ui.preference.AppFactoryPreferencePage;
import org.wso2.developerstudio.eclipse.logging.core.IDeveloperStudioLog;
import org.wso2.developerstudio.eclipse.logging.core.Logger;

public class AppFactoryPerspectiveFactory implements IPerspectiveFactory {
	private static IDeveloperStudioLog log=Logger.getLog(Activator.PLUGIN_ID);
	private static final String APPLIST_ID = "org.wso2.developerstudio.appfactory.ui.views.AppfactoryApplicationListView";
	private static final String APPDETILS_ID = "org.wso2.developerstudio.appfactory.ui.views.AppfactoryApplicationDetailsView";
	private static final String APPBUILD_ID = "org.wso2.developerstudio.appfactory.ui.views.AppfactoryBuildInfoView";
    private static final String PROJECT_EXPOR_VIEW ="org.eclipse.ui.navigator.ProjectExplorer";
    public static final String DEFAULT_LOGIN_URL = "https://appfactorypreview.wso2.com/appmgt/site/blocks/user/login/ajax/login.jag";

	private static IWebBrowser browser = null;
 
	
	     public void createInitialLayout(IPageLayout appfacLayout) {
	    	 LoginAction loginAction = new LoginAction();
			     try {
			    	
					 if(loginAction.login()){
						  AppFactoryPerspectiveManager.val = false;
							addViews(appfacLayout); 
							
				   	        String appFactoryPreferenceURL = loginAction.getPreferenceStore().getString(AppFactoryPreferencePage.APP_FACTORY_LOCATION);
							// Opening the Web browser
							IWorkbenchBrowserSupport browserSupport = Activator.getDefault().getWorkbench().getBrowserSupport();
							browser = browserSupport.createBrowser(IWorkbenchBrowserSupport.LOCATION_BAR, null, null, null);
							URL url = new URL("http://www.google.com/ncr");
							if(appFactoryPreferenceURL!= null && !appFactoryPreferenceURL.equals("")){
								browser.openURL(new URL(appFactoryPreferenceURL));
							}else{
								browser.openURL(url);
							}
					}else {
						MessageBox messageBox = new MessageBox(loginAction.getActiveShell(),SWT.OK);
				        messageBox.setText("Error");
				        messageBox.setMessage("Error username or password");
				        messageBox.open();
				        
					}
				} catch (Exception e) {
					MessageBox messageBox = new MessageBox(loginAction.getActiveShell(),SWT.OK);
			        messageBox.setText("Error");
			        messageBox.setMessage(e.getMessage());
			        messageBox.open();
					log.error("perspective loading issue", e);
				} 	    		 
	     }


		private void addViews(IPageLayout appfacLayout) {
			String editorArea = appfacLayout.getEditorArea();
			IFolderLayout lef = appfacLayout.createFolder("topLeft",IPageLayout.LEFT,0.25f,editorArea);
			lef.addView(PROJECT_EXPOR_VIEW);
			  
			IFolderLayout applist = appfacLayout.createFolder("topRight",IPageLayout.RIGHT,0.75f,editorArea);
			applist.addView(APPLIST_ID);
			  
			IFolderLayout appDetails = appfacLayout.createFolder("BottomRight",IPageLayout.BOTTOM,0.60f,"topRight");
			appDetails.addView(APPDETILS_ID);
			  
			IFolderLayout buildInfo = appfacLayout.createFolder("Bottomt",IPageLayout.BOTTOM,0.60f,appfacLayout.getEditorArea());
			buildInfo.addView(IConsoleConstants.ID_CONSOLE_VIEW);
		} 
	     
	  
}
