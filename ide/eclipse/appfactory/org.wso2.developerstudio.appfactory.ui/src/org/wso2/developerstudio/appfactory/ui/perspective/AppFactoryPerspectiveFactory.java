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

import java.lang.reflect.InvocationTargetException;
import java.net.URL;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.e4.core.contexts.EclipseContextFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Cursor;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveDescriptor;
import org.eclipse.ui.IPerspectiveFactory;
import org.eclipse.ui.IPerspectiveRegistry;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PerspectiveAdapter;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.WorkbenchException;
import org.eclipse.ui.browser.IWebBrowser;
import org.eclipse.ui.browser.IWorkbenchBrowserSupport;
import org.eclipse.ui.console.IConsoleConstants;
import org.osgi.framework.Bundle;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventHandler;
import org.wso2.developerstudio.appfactory.core.authentication.Authenticator;
import org.wso2.developerstudio.appfactory.core.model.AppVersionInfo;
import org.wso2.developerstudio.appfactory.core.model.ErroModel;
import org.wso2.developerstudio.appfactory.core.repository.JgitRepoManager;
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
   // public static final String DEFAULT_LOGIN_URL = "https://appfactorypreview.wso2.com/appmgt/site/blocks/user/login/ajax/login.jag";

	private static IWebBrowser browser = null;
 
 
	     public void createInitialLayout(IPageLayout appfacLayout) {
	    	
			     try {
			    	 
			    	 
			    	 LoginAction loginAction = new LoginAction();
					 if(loginAction.login()){
						    Display.getCurrent().getActiveShell().setCursor((new Cursor(Display.getCurrent(), SWT.CURSOR_WAIT)));
						    ProgressMonitorDialog progressMonitorDialog = new ProgressMonitorDialog(Display.getDefault().getActiveShell());
							progressMonitorDialog.create();
							progressMonitorDialog.open();
							progressMonitorDialog.run(true, false, new LoadAppFacPerfectiveJob(loginAction,appfacLayout));
						    AppFactoryPerspectiveManager.val = false;
						   // Display.getCurrent().getActiveShell().setCursor((new Cursor(Display.getCurrent(), SWT.CURSOR_ARROW)));
					}else {
			          
					}
				} catch (Exception e) {
			        Display.getCurrent().getActiveShell().setCursor((new Cursor(Display.getCurrent(), SWT.CURSOR_ARROW)));
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
		
	     
		private class LoadAppFacPerfectiveJob implements IRunnableWithProgress {
			
			private  LoginAction loginAction;
			private IPageLayout appfacLayout;
			public LoadAppFacPerfectiveJob(LoginAction loginAction,IPageLayout appfacLayout) {
				 this.loginAction = loginAction;
				 this.appfacLayout = appfacLayout;
			}
			@Override
			public void run(IProgressMonitor monitor) throws InvocationTargetException,
					InterruptedException {
				String operationText="Loading the persfective";
				monitor.beginTask(operationText, 100);
				monitor.worked(10);
				try{
					    AppFactoryPerspectiveManager.val = false;
					    operationText="Connecting to the AppFactory Url";
						monitor.beginTask(operationText, 100);
						monitor.worked(50);
						addViews(appfacLayout); 
			   	        String appFactoryPreferenceURL = loginAction.getPreferenceStore().getString(AppFactoryPreferencePage.APP_FACTORY_LOCATION);
						//Stop Opening the Web browser since there is a eclipse bug that will kill whole eclipse
						/*IWorkbenchBrowserSupport browserSupport = Activator.getDefault().getWorkbench().getBrowserSupport();
						browser = browserSupport.createBrowser(IWorkbenchBrowserSupport.LOCATION_BAR, null, null, null);
						URL url = new URL("http://www.google.com/ncr");
						if(appFactoryPreferenceURL!= null && !appFactoryPreferenceURL.equals("")){
							browser.openURL(new URL(appFactoryPreferenceURL));
						}else{
							browser.openURL(url);
						}*/
						operationText="Completed";
						monitor.beginTask(operationText, 100);
						monitor.worked(100);
				}catch(Exception e){
					operationText=e.getMessage();
					monitor.beginTask(operationText, 100);
					monitor.worked(0);
					monitor.setCanceled(true);
					log.error("updateprocess error", e);
				}
				
				monitor.worked(100);
				monitor.done();
			}
		}  
		
		
	private class LoadPrevioiusAppFacPerfectiveJob implements IRunnableWithProgress {
			
		 
			@Override
			public void run(IProgressMonitor monitor) throws InvocationTargetException,
					InterruptedException {
				// AppFactoryPerspectiveManager.val = true;
								 
				 try{
					 IPerspectiveDescriptor perspective = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getPerspective();
					 PlatformUI.getWorkbench().showPerspective("org.eclipse.jst.j2ee.J2EEPerspective", PlatformUI.getWorkbench().getActiveWorkbenchWindow());
					 PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().closePerspective(perspective, false, true);
					/* PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().closePerspective(perspectiveDescriptor, true, true);
					  PlatformUI.getWorkbench().showPerspective("org.eclipse.jst.j2ee.J2EEPerspective", PlatformUI.getWorkbench().getActiveWorkbenchWindow());
					   
					/*final IWorkbenchWindow workbenchWindow = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
	                if (workbenchWindow != null) {
	                    workbenchWindow.addPerspectiveListener(new PerspectiveAdapter() {
	                        @Override
	                        public void perspectiveActivated(IWorkbenchPage page,
	                                IPerspectiveDescriptor perspectiveDescriptor) {
	                          //  super.perspectiveActivated(page, perspectiveDescriptor);
	                            if("org.wso2.developerstudio.appfactory.ui.perspective".equals(perspectiveDescriptor.getId())){
	                            	
	                            	try {
	                         
	                            		//PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().closePerspective(perspectiveDescriptor, true, true);
	                            		PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().setPerspective(perspectiveDescriptor);
	                            	    PlatformUI.getWorkbench().showPerspective("org.eclipse.jst.j2ee.J2EEPerspective", PlatformUI.getWorkbench().getActiveWorkbenchWindow());
	                            	    PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().closePerspective(perspectiveDescriptor, false, true);
	                 
	                            	} catch (WorkbenchException e) {
	                            		e.printStackTrace();
									}
	                            }
	                        }
	                    });
	                }*/
				}catch(Exception e){
					 
					log.error("updateprocess error", e);
				}
				
				monitor.worked(100);
				monitor.done();
			}
		}  
}
