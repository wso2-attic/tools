/*
 * Copyright (c) 2013, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
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

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.text.StyleConstants.FontConstants;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Cursor;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.console.MessageConsoleStream;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.ui.wizards.IWizardDescriptor;
import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.e4.core.contexts.EclipseContextFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventHandler;
import org.osgi.framework.Bundle;
import org.wso2.developerstudio.appfactory.core.authentication.Authenticator;
import org.wso2.developerstudio.appfactory.core.authentication.UserPasswordCredentials;
import org.wso2.developerstudio.appfactory.core.client.HttpsGenkinsClient;
import org.wso2.developerstudio.appfactory.core.client.HttpsJaggeryClient;
import org.wso2.developerstudio.appfactory.core.jag.api.JagApiProperties;
import org.wso2.developerstudio.appfactory.core.model.AppListModel;
import org.wso2.developerstudio.appfactory.core.model.AppVersionInfo;
import org.wso2.developerstudio.appfactory.core.model.ApplicationInfo;
import org.wso2.developerstudio.appfactory.core.model.ErroModel;
import org.wso2.developerstudio.appfactory.core.repository.JgitRepoManager;
import org.wso2.developerstudio.appfactory.ui.Activator;
import org.wso2.developerstudio.appfactory.ui.actions.LoginAction;
import org.wso2.developerstudio.eclipse.logging.core.IDeveloperStudioLog;
import org.wso2.developerstudio.eclipse.logging.core.Logger;
import org.wso2.developerstudio.eclipse.platform.core.utils.SWTResourceManager;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;


import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.IJobManager;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.e4.core.contexts.EclipseContextFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.InjectionException;
import org.eclipse.e4.core.services.events.IEventBroker;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.e4.ui.di.UIEventTopic;
import org.eclipse.e4.ui.di.UISynchronize;
import org.eclipse.e4.core.services.*;
import org.osgi.framework.ServiceReference;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventHandler;

public class AppfactoryApplicationListView extends ViewPart {
	
	public static final String ID = "org.wso2.developerstudio.appfactory.ui.views.AppfactoryView";
	
	public static final String REPO_WIZARD_ID = "org.eclipse.egit.ui.internal.clone.GitCloneWizard";
	
	private static IDeveloperStudioLog log=Logger.getLog(Activator.PLUGIN_ID);
	
	private static AppfactoryApplicationDetailsView appDetailView;
	
	private TreeViewer viewer;
	private Composite parent; 
	private AppListModel model;
	private AppListLabelProvider labelProvider;
	private AppListContentProvider contentProvider;
	private UserPasswordCredentials credentials;
	private List<ApplicationInfo> appLists;
	private MenuManager menuMgr;
	private IEventBroker broker;
	private EventHandler buildhandler;
	private EventHandler ErrorLoghandler;
	private EventHandler infoLoghandler;
	private EventHandler apphandler;
	private EventHandler appVersionhandler;
	private EventHandler projectOpenhandler;
	private AppfactoryConsoleView console;
	private MessageConsoleStream infoOut;
	private MessageConsoleStream errorOut;
	private MessageConsoleStream buildOut;
	@SuppressWarnings("restriction")
	@Override
	public void init(IViewSite site) throws PartInitException {

		super.init(site);
		appLists = new ArrayList<ApplicationInfo>();
		console = new AppfactoryConsoleView();
		infoOut = console.getOut();
		errorOut = console.getNewMsgStream();
		buildOut = console.getNewMsgStream();
		Bundle bundle = Platform.getBundle(Activator.PLUGIN_ID);
		 
		@SuppressWarnings("restriction")
		IEclipseContext eclipseContext = EclipseContextFactory
				.getServiceContext(bundle.getBundleContext());
		eclipseContext.set(org.eclipse.e4.core.services.log.Logger.class, null);
		broker = eclipseContext.get(IEventBroker.class);
		
		buildhandler = getBuildLogEventHandler();
		broker.subscribe("update", buildhandler);
			
		apphandler = getAppListHandler();
		broker.subscribe("Appupdate", apphandler);
 
		appVersionhandler = getAppVersionEventHandler();
		broker.subscribe("Appversionupdate", appVersionhandler);
		
		ErrorLoghandler = getErrorLogEventHandler();
		broker.subscribe("Errorupdate",ErrorLoghandler);
		
		infoLoghandler = getInfoLogEventHandler();
		broker.subscribe("Infoupdate",infoLoghandler);
		
		projectOpenhandler = getPorjectcheckedOUtHandler();
		broker.subscribe("Projectupdate",projectOpenhandler);
		
	}

	@SuppressWarnings("restriction")
	private void printErrorLog(String msg){
		 broker.send("Errorupdate", "\n"+"["+new Timestamp(new Date().getTime()) +"] : "+msg);
	}
	
	private void printInfoLog(String msg){
		 broker.send("Infoupdate", "\n"+"["+new Timestamp(new Date().getTime()) +"] : "+msg);
	}

	private EventHandler getAppListHandler() {
		return new EventHandler() {
			public void handleEvent(final Event event) {
				@SuppressWarnings("unused")
				final Display display = Display.getDefault();
				Display.getDefault().asyncExec(new Runnable() {
					@Override
					public void run() {
            			List<ApplicationInfo> oldappLists = appLists;
						appLists =  (List<ApplicationInfo>) event.getProperty(IEventBroker.DATA);
            			contentProvider.inputChanged(viewer, oldappLists, appLists);
            			viewer.refresh();
            		 
					}
				});
			}
		};
	}
	
	private EventHandler getPorjectcheckedOUtHandler() {
		return new EventHandler() {
			public void handleEvent(final Event event) {
				@SuppressWarnings("unused")
				final Display display = Display.getDefault();
				Display.getDefault().asyncExec(new Runnable() {
					@Override
					public void run() {
						try {
							contentProvider.inputChanged(viewer, model, model);
							viewer.refresh();
							
						} catch (Exception e) {
							 log.error("checkedoutError", e);
						}

					}
				});
			}
		};
	}

	private EventHandler getAppVersionEventHandler() {
		return new EventHandler() {
			public void handleEvent(final Event event) {
				@SuppressWarnings("unused")
				final Display display = Display.getDefault();
				Display.getDefault().asyncExec(new Runnable() {

					@Override
					public void run() {
						AppListModel refModel = (AppListModel) event.getProperty(IEventBroker.DATA);
						contentProvider.inputChanged(viewer, model, refModel);
						viewer.refresh();
					}
				});
			}
		};
	}
	

	
	
	private EventHandler getBuildLogEventHandler() {
		return new EventHandler() {
			public void handleEvent(final Event event) {
				@SuppressWarnings("unused")
				final Display display = Display.getDefault();
				Display.getDefault().asyncExec(new Runnable() {

					@Override
					public void run() {
						buildOut.setColor(SWTResourceManager.getColor(SWT.COLOR_DARK_CYAN));
						buildOut.println(""+event.getProperty(IEventBroker.DATA));
					}
				});
			}
		};
	}
	
	private EventHandler getErrorLogEventHandler() {
		return new EventHandler() {
			public void handleEvent(final Event event) {
				@SuppressWarnings("unused")
				final Display display = Display.getDefault();
				Display.getDefault().asyncExec(new Runnable() {

					@Override
					public void run() {
						errorOut.setColor(SWTResourceManager.getColor(SWT.COLOR_RED));
						errorOut.println("\n\n**********[ERROR]**********" + event.getProperty(IEventBroker.DATA));
					}
				});
			}
		};
	}
	
	private EventHandler getInfoLogEventHandler() {
		return new EventHandler() {
			public void handleEvent(final Event event) {
				@SuppressWarnings("unused")
				final Display display = Display.getDefault();
				Display.getDefault().asyncExec(new Runnable() {

					@Override
					public void run() {
						infoOut.setColor(SWTResourceManager.getColor(SWT.COLOR_BLACK));
						infoOut.println("\n\n**********[INFO]**********" + event.getProperty(IEventBroker.DATA));
					}
				});
			}
		};
	}
	
	
	private void ShowLoginDialog(){
		 credentials = Authenticator.getInstance().getCredentials();
		 try{
		 if(credentials==null){
			 printErrorLog("Aunthantication Failed ");
			 LoginAction loginAction = new LoginAction();
			 printInfoLog("Attempting to re-login");
			 if(loginAction.login()){
				 printInfoLog("Login Sucessfull");
				 credentials = Authenticator.getInstance().getCredentials();
			 }
		 }else {
			 
		 }
		 }catch(Exception e){
			 
		 }
	}
	
	
	@SuppressWarnings("restriction")
	private List<ApplicationInfo> getApplist(){
		 if(Authenticator.getInstance().getCredentials()!=null){
		 Map<String,String> params = new HashMap<String,String>();
		 params.put("action",JagApiProperties.USER_APP_LIST__ACTION);
		 params.put("userName",Authenticator.getInstance().getCredentials().getUser()); 
		 printInfoLog("Fetching User Application From Server");
		 String respond = HttpsJaggeryClient.httpPost(JagApiProperties.getAppInfoUrl(), params);
		 if("false".equals(respond)){
		  printErrorLog(" Fetching Failed now attempting to relogin");	 
	      boolean val = Authenticator.getInstance().reLogin();
	      if(val){
	       printInfoLog(" Re-Login sucessfull");	  
	       respond = HttpsJaggeryClient.httpPost(JagApiProperties.getAppInfoUrl(), params);
	      }else{
	    	printErrorLog("CANNOT PROCEEDS \n Re-Login attempt has filed !! \n " +
	    			"Please re-Login to the perspective");  
	      }
		 }
		 if(!"false".equals(respond)){
	     printInfoLog("Fetching completed, Apllications are loading to the view");	 
		 Gson gson = new Gson();
		 Type collectionType = new TypeToken<java.util.List<ApplicationInfo>>(){}.getType();
		 return gson.fromJson(respond, collectionType);
		 }
		}
		 return new ArrayList<ApplicationInfo>();
	}
 
	/*@SuppressWarnings("restriction")
	private void create1UserAppList() {
		try{
		 credentials = Authenticator.getInstance().getCredentials();
		 if(credentials==null){
			 printErrorLog("Aunthantication Failed ");
			 LoginAction loginAction = new LoginAction();
			 printInfoLog("Attempting to re-login");
			 if(loginAction.login()){
				 printInfoLog("Login Sucessfull");
				 create1UserAppList();
			 }
		 }else {  

			 Map<String,String> params = new HashMap<String,String>();
			 params.put("action",JagApiProperties.USER_APP_LIST__ACTION);
			 params.put("userName",credentials.getUser()); 
			 printInfoLog(" Fetching User Application From Server");
			 String respond = HttpsJaggeryClient.httpPost(JagApiProperties.getAppInfoUrl(), params);
			 if("false".equals(respond)){
				  printErrorLog(" Fetching Failed now attempting to relogin");	 
			      boolean val = Authenticator.getInstance().reLogin();
			      if(val){
			       printInfoLog(" Re-Login sucessfull");	  
			       respond = HttpsJaggeryClient.httpPost(JagApiProperties.getAppInfoUrl(), params);
			      }else{
			    	printErrorLog("CANNOT PROCEEDS \n Re-Login attempt has filed !! \n " +
			    			"Please re-Login to the perspective");  
			      }
			 }

			 if(!"false".equals(respond)){
			 printInfoLog("Fetching completed, Apllications are loading to the view");		 
			 Gson gson = new Gson();
			 Type collectionType = new TypeToken<java.util.List<ApplicationInfo>>(){}.getType();
			 appLists = gson.fromJson(respond, collectionType);
			 }
		 }
		}catch(Exception e){
			printErrorLog("CANNOT PROCEEDS \n Applications lording failed ! \n "+e.getMessage());  
	    	log.error("Application Lording :", e);
		}
	}*/
	
	public void createPartControl(Composite parent) {
          this.parent = parent;
          contentProvider = new AppListContentProvider(appLists);
          labelProvider = new AppListLabelProvider();
          createToolbar();
          model =new AppListModel();
		  viewer = new TreeViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
		  viewer.setContentProvider(contentProvider);
		  viewer.setLabelProvider(labelProvider);
		  viewer.setInput(model);
		  viewer.addSelectionChangedListener(new ISelectionChangedListener() {
			
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				 final IStructuredSelection selection = (IStructuredSelection) viewer
			              .getSelection();
				 Object selectedNode = selection.getFirstElement();
			   if (selectedNode instanceof ApplicationInfo){
		        	ApplicationInfo appInfo = (ApplicationInfo) selection.getFirstElement();
		        	if(!appInfo.getappVersionList().isEmpty()){
		        		appDetailView.updateView(appInfo);
		        	}
		        }
			}
		});
		  viewer.addDoubleClickListener(new IDoubleClickListener() {

		      @Override
		      public void doubleClick(DoubleClickEvent event) {
		        TreeViewer viewer = (TreeViewer) event.getViewer();
		        IStructuredSelection thisSelection = (IStructuredSelection) event
		            .getSelection();
		        Object selectedNode = thisSelection.getFirstElement();
		        if (selectedNode instanceof AppVersionInfo) {
		        viewer.setExpandedState(selectedNode,
		            !viewer.getExpandedState(selectedNode));
		        }
		      }
		    });
		    
		    menuMgr = new MenuManager();
	        Menu menu = menuMgr.createContextMenu(viewer.getControl());
	        menu.setVisible(true);
	        menuMgr.addMenuListener(new IMenuListener() {
	            @Override
	            public void menuAboutToShow(final IMenuManager manager) {
	                if (viewer.getSelection().isEmpty()) {
	                    return;
	                }

	                if (viewer.getSelection() instanceof IStructuredSelection) {
	                    IStructuredSelection selection = (IStructuredSelection) viewer.getSelection();
	                    if(selection.getFirstElement() instanceof AppVersionInfo){
	                       final AppVersionInfo appVersionInfo = (AppVersionInfo) selection.getFirstElement();
	                        manager.add(importAction(appVersionInfo));
	                    	manager.add(checkOutAction(appVersionInfo));
	                    	manager.add(repoDeployAction(appVersionInfo));
	                    	manager.add(buildInfoAction(appVersionInfo)); 
	                    	
	                    	
	                    }else if (selection.getFirstElement() instanceof ApplicationInfo){
	                    	ApplicationInfo appInfo = (ApplicationInfo) selection.getFirstElement();
	                    	String title ="";
	                        if(appInfo.getappVersionList().isEmpty()){
	                        	title = "Open  ";
	                        }else{
	                        	title = "Update";
	                        }
	                    	manager.add(appOpenAction(appInfo,title));
		                    manager.add(repoSettingsAction(appInfo));
	                    }
	                }
	            }
	        });
	        menuMgr.setRemoveAllWhenShown(true);
	        viewer.getControl().setMenu(menu); 
	        ShowLoginDialog();
	        updateApplicationView();
	}
	
    /**
     * Create toolbar.
     */
    private void createToolbar() {
            IToolBarManager mgr = getViewSite().getActionBars().getToolBarManager();
            mgr.add(new Action() {
           	 @Override
           	public void run() {
           		updateApplicationView();
           	}
           	 
           	 public String getText() {
    				return "Refresh";
    			}
			});
    }
	
	private void  updateApplicationView(){
		Job job = new Job("Updating User Applications List") {
		   @SuppressWarnings("restriction")
			@Override
			  protected IStatus run(final IProgressMonitor monitor) {
				monitor.beginTask("Connecting to remote server for fetching app info", 100);
				  UISynchronize uiSynchronize = new UISynchronize() {
						@Override
						public void syncExec(Runnable runnable) {
							
						}
						
						@Override
						public void asyncExec(Runnable runnable) {
							   monitor.subTask("Getting Applications");
							   monitor.worked(10);
							   List<ApplicationInfo> applist = getApplist();
							   monitor.worked(40);
							   if(applist!=null){
								monitor.subTask("Lording applications into appList view");
								monitor.worked(60);	   
							   broker.send("Appupdate", applist);
							   monitor.worked(90);	
							   }else{
							     monitor.subTask("Data fetching failed !!");
							     monitor.worked(30);
								 monitor.worked(0);	      
							   }
						}
					};
					uiSynchronize.asyncExec(new Runnable() {
						@Override
						public void run() {
						
						}
					});
					
			    return Status.OK_STATUS;
			  }
			};
		job.schedule();
	}
	
	
	
	private void  getAppVersions(final ApplicationInfo appInfo){
		Job job = new Job("Updating Application versions") {
		   @SuppressWarnings("restriction")
			@Override
			  protected IStatus run(final IProgressMonitor monitor) {
				monitor.beginTask("Connecting to remote server for fetching app version info", 100);
				  UISynchronize uiSynchronize = new UISynchronize() {
						@Override
						public void syncExec(Runnable runnable) {
						}
						
						@Override
						public void asyncExec(Runnable runnable) {
							appInfo.setLableState(1);
							broker.send("Appversionupdate", model);
							if(getVersionInfo(appInfo, monitor)){
								getTeamInfo(appInfo, monitor);
								getDbInfo(appInfo, monitor);
								appInfo.setLableState(2);
							}else{
								appInfo.setLableState(0);
							}
						}

						private boolean getVersionInfo(
								final ApplicationInfo appInfo,
								final IProgressMonitor monitor) {
							monitor.subTask("Getting version information");
							monitor.worked(20);	   
							boolean result = model.setversionInfo(appInfo);
							if(!result){
								boolean reLogin = Authenticator.getInstance().reLogin();
								if(reLogin){
									result = model.setversionInfo(appInfo);
								}
							}
							if(result){
							monitor.subTask("Lording version information");
							monitor.worked(40);	 
							broker.send("Appversionupdate", model);
							monitor.worked(50);
							return true;
							}else{

								return false;
							}
						}
						
						private boolean getTeamInfo(final ApplicationInfo appInfo,
								final IProgressMonitor monitor) {
							monitor.subTask("Getting Team information");
							monitor.worked(60);	   
							boolean result = model.setRoleInfomation(appInfo);
							if(!result){
								boolean reLogin = Authenticator.getInstance().reLogin();
								if(reLogin){
									result = model.setRoleInfomation(appInfo);
								}
							}
							if(result){
							monitor.subTask("Lording team information");
							monitor.worked(60);	 
							broker.send("Appversionupdate", model);
							monitor.worked(90);
							return true;
							}else{
								return false;
							}
						}
						
						private boolean getDbInfo(final ApplicationInfo appInfo,
								final IProgressMonitor monitor) {
							monitor.subTask("Getting Database information");
							monitor.worked(60);	   
							boolean result = model.setDBInfomation(appInfo);
							if(!result){
								boolean reLogin = Authenticator.getInstance().reLogin();
								if(reLogin){
									result = model.setDBInfomation(appInfo);
								}
							}
							if(result){
							monitor.subTask("Lording database information");
							monitor.worked(60);	 
							broker.send("Appversionupdate", model);
							monitor.worked(90);
							return true;
							}else{
								return false;
							}
						}
						
					};
					uiSynchronize.asyncExec(new Runnable() {
						@Override
						public void run() {
						
						}
					});
					
			    return Status.OK_STATUS;
			  }
			};
		job.schedule();
	}
 
	
	
	
	 
	private void getbuildLogsJob(final AppVersionInfo appInfo,final boolean deploy) {
		 
		Job job = new Job("Fetching build logs") {
		 
			@SuppressWarnings("restriction")
			@Override
			protected IStatus run(final IProgressMonitor monitor) {
				UISynchronize uiSynchronize = new UISynchronize() {

					@Override
					public void syncExec(Runnable runnable) {

					}

					@Override
					public void asyncExec(Runnable runnable) {
						try {
							/*Getting last build ID*/
						    int buildId = getLastBuildId(appInfo);
						    if(deploy){
						     int newbuildId = deploy(appInfo, buildId);
						     if(newbuildId>buildId){
						    	 while(true){
						    		 buildId = getLastBuildId(appInfo); 
						    		 if(buildId>=newbuildId){
						    			 break;
						    		 }
						    		 printErrorLog("New Build id "+newbuildId+" is still not available , waiting 2 seconds to check again \n" +
												"you can terminate this process by canseling the bacground process manually");	 
										Thread.sleep(2000); 
										if(monitor.isCanceled()){
											printInfoLog("Build id requested has been terminated by the user");	  
											break;
										} 
						    	 }
						     }
						    }
							/*Getting Jenkins BuilderUrl by providing the buildId*/
							String builderBaseUrl = getBuilderUrl(appInfo,buildId);
							/*Getting jenkins log using above url*/
							printJenkinsBuildLogs(appInfo, buildId,builderBaseUrl,monitor);

						} catch (Exception e) {
							printErrorLog("System Failed to get build logs \n "+e.getMessage());	 
							log.error("BuildLogs Error :",e);
						}

					}

					private int deploy(final AppVersionInfo appInfo, int buildId) {
						Map<String, String> params = new HashMap<String, String>();
						params.put("action",
								JagApiProperties.App_BUILD_ACTION);
						params.put("stage", "Development");
						params.put("applicationKey", appInfo.getAppName());
						params.put("version", appInfo.getVersion());
						params.put("doDeploy", "true");
						printInfoLog("Deploying application");	
						String httpPostrespond = HttpsJaggeryClient.httpPost(
								JagApiProperties.getBuildApplication(),
								params); 
						if(!"false".equals(httpPostrespond)){
							printInfoLog("SucessFully deployed");
							buildId++;
						}else{
							printErrorLog("Deploying process has failed");
							printInfoLog("Last build log will be getting");
						}

						return buildId;
					}

					private String getBuilderUrl(final AppVersionInfo appInfo,
							int buidNo) {
						Map<String, String> params;
						params = new HashMap<String, String>();
						params.put("action",JagApiProperties.App_BUILD_URL_ACTIONL);
						params.put("lastBuildNo", "" + buidNo);
						params.put("applicationVersion",appInfo.getVersion());
						params.put("applicationKey",appInfo.getAppName());
						String builderBaseUrl = "";
						builderBaseUrl = HttpsJaggeryClient.httpPost(JagApiProperties.getBuildInfoUrl(),params);
						return builderBaseUrl;
					}

					private void printJenkinsBuildLogs(final AppVersionInfo appInfo, int buidNo,
							String builderBaseUrl,IProgressMonitor monitor) throws IOException,InterruptedException {
						printInfoLog("Getting buildLogs of build No "+buidNo);	  
						while(true){
						HttpResponse response = HttpsGenkinsClient
								.getBulildinfo(
										appInfo.getAppName(),
										appInfo.getVersion(),
										builderBaseUrl, buidNo);
						if(response.getStatusLine().getStatusCode()==200){
						HttpEntity entity = response.getEntity();
						BufferedReader rd = new BufferedReader(
								new InputStreamReader(response
										.getEntity().getContent()));
						String line;
						while ((line = rd.readLine()) != null) {
							broker.send("update", line.toString());
							Thread.sleep(100);
						}
						EntityUtils.consume(entity);
						break;
						}else if(response.getStatusLine().getStatusCode()==404){
							printErrorLog("Build Url still not available , waiting 2 seconds to check again \n" +
									"you can terminate this process by canseling the bacground process manually");	 
							Thread.sleep(2000); 
							if(monitor.isCanceled()){
								printInfoLog("Build logs requested has been terminated by user");	  
								break;
							}
						}else{
							printErrorLog("Build log request cannot proceed due to server error "+response.getStatusLine().getStatusCode());
							 break;
						}
					}	
				}

					private int getLastBuildId(final AppVersionInfo appInfo) {
						credentials = Authenticator.getInstance().getCredentials();
						Map<String, String> params = new HashMap<String, String>();
						params.put("action",JagApiProperties.App_BUILD_INFO_ACTION);
						params.put("stage", "Development");
						params.put("applicationKey",appInfo.getAppName());
						params.put("version", appInfo.getVersion());
						params.put("buildable", "true");
						params.put("isRoleBasedPermissionAllowed","false");
						params.put("metaDataNeed", "false");
						params.put("userName",credentials.getUser());
						printInfoLog("Getting last build id");	 
						String respond = HttpsJaggeryClient.httpPost(JagApiProperties.getBuildLastSucessfullBuildUrl(),params);
						if("false".equals(respond)){
						printErrorLog(" Fetching Failed now attempting to relogin");	 
					    boolean val = Authenticator.getInstance().reLogin();
					      if(val){
					    	  printInfoLog("Re-Login sucessfull");	  
					    	  respond =HttpsJaggeryClient.httpPost(JagApiProperties.getBuildLastSucessfullBuildUrl(),params);
					      }else{
					    	printErrorLog("CANNOT PROCEEDS \n Re-Login attempt has filed !! \n " +
					    			"Please re-Login to the perspective");  
					      }
						}
						if(!"false".equals(respond)){
							JsonElement jelement = new JsonParser().parse(respond);
							JsonArray buildInfoArray;
							int buildId = 0;
								buildInfoArray = jelement.getAsJsonArray();
								for (JsonElement jsonElement : buildInfoArray) 
								{
									JsonObject asJsonObject = jsonElement
											.getAsJsonObject();
									JsonElement jsonElement2 = asJsonObject
											.get("version");
									JsonObject asJsonObject2 = jsonElement2
											.getAsJsonObject();
									String asString = asJsonObject2.get("current")
											.getAsString();
									if (asString.equals(appInfo.getVersion())) {
										JsonElement jsonElement3 = asJsonObject
												.get("build");
										JsonObject asJsonObject3 = jsonElement3
												.getAsJsonObject();
										buildId = asJsonObject3.get("lastBuildId")
												.getAsInt();
										break;
									}
								}
								printInfoLog("Last build id :"+buildId);
								return buildId;	
						}
						return 0;
					}
				
			   };
				uiSynchronize.asyncExec(new Runnable() {
					@Override
					public void run() {

					}
				});

				return Status.OK_STATUS;
			}

		};
			
		job.schedule();
	}
	
	
	private Action appOpenAction(final ApplicationInfo appInfo,final String title) {
		Action reposettings = new Action() {
			public void run() {
				try {
					getAppVersions(appInfo);
				} catch (Exception e) {
					appInfo.setLableState(0);
					log.error(e);
				}
			}
			public String getText() {
				return title;
			}

			public ImageDescriptor getImageDescriptor() {
				ImageDescriptor imageDescriptorFromPlugin = Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
						 "/icons/open.gif");
				return  imageDescriptorFromPlugin;
			}
		};
		return reposettings;
	}
 
	private Action buildInfoAction(final AppVersionInfo appInfo) {

		Action reposetetings = new Action() {
			@Override
			public void run() {
				getbuildLogsJob(appInfo,false);
			}

			public String getText() {
				return "Build Logs";
			}
			public ImageDescriptor getImageDescriptor() {
				ImageDescriptor imageDescriptorFromPlugin = Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
						 "/icons/buildLog.gif");
				return  imageDescriptorFromPlugin;
			}
		};

		return reposetetings;
	}	
	
	private Action repoSettingsAction(final ApplicationInfo appInfo) {
		Action reposettings = new Action() {
			public void run() {
				try {
					    DirectoryDialog dialog = new DirectoryDialog(Display.getCurrent()
								.getActiveShell());
					   dialog.setText("Select New Repository Location, Default will be eclipse workspace");
					    if(dialog.open()!=null){
					    	appInfo.setLocalrepoLocation(dialog.getFilterPath());
					    	appInfo.updateVersions();
					    }
				} catch (Exception e) {
					log.error("", e);
				}
			};
       
			public String getText() {
				return "Chnage Local Repo Location ";
			}
			@Override
			public ImageDescriptor getImageDescriptor() {
				ImageDescriptor imageDescriptorFromPlugin = Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
						 "/icons/repoLocation.gif");
				return  imageDescriptorFromPlugin;
			}
		};
		return reposettings;
	} 
 
	private Action repoDeployAction(final AppVersionInfo info) {
		Action reposettings = new Action() {
			public void run() {
				try {
					getbuildLogsJob(info,true);
				} catch (Exception e) {
					log.error("Deploying Error", e);
				}
			};
			public String getText() {
				return "Deploy";
			}
			@Override
			public ImageDescriptor getImageDescriptor() {
				ImageDescriptor imageDescriptorFromPlugin = Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
						 "/icons/deploy.gif");
				return  imageDescriptorFromPlugin;
			}
		};
		return reposettings;
	}
	
	private Action checkOutAction(final AppVersionInfo info) {
		Action reposettings = new Action() {
			public void run() {				
				getcheckoutJob(info);
			};

			public String getText() {
				return "Check Out";
			}
			@Override
			public ImageDescriptor getImageDescriptor() {
				ImageDescriptor imageDescriptorFromPlugin = Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
						 "/icons/checkout.gif");
				return  imageDescriptorFromPlugin;
			}
		};
		return reposettings;
	}
	
	private Action importAction(final AppVersionInfo info) {
		Action reposettings = new Action() {
			public void run() {				
			    ProgressMonitorDialog progressMonitorDialog = new ProgressMonitorDialog(Display.getDefault().getActiveShell());
				progressMonitorDialog.create();
				progressMonitorDialog.open();
				try {
					progressMonitorDialog.run(true, false, new AppImportJobJob(info));
				} catch (InvocationTargetException e) {
					 log.error("project open", e);
				} catch (InterruptedException e) {
					log.error("project open", e);
				}
			};

			public String getText() {
				return "Import to workspace";
			}
			@Override
			public ImageDescriptor getImageDescriptor() {
				ImageDescriptor imageDescriptorFromPlugin = Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
						 "/icons/import.gif");
				return  imageDescriptorFromPlugin;
			}
			
			@Override
			public boolean isEnabled() {
				// TODO Auto-generated method stub
				return info.isCheckedout();
			}
		};
		return reposettings;
	}

	private void  getcheckoutJob(final AppVersionInfo info){
		Job job = new Job("Updating Application versions") {
		   @SuppressWarnings("restriction")
			@Override
			  protected IStatus run(final IProgressMonitor monitor) {
				monitor.beginTask("Connecting to remote server for fetching data", 100);
				  UISynchronize uiSynchronize = new UISynchronize() {
						@Override
						public void syncExec(Runnable runnable) {
						}
						
						@Override
						public void asyncExec(Runnable runnable) {
						 try{
							monitor.subTask("Cloning with remote repository");
							printInfoLog("Cloning with remote repository");
							monitor.worked(10);	  
							if(info.getLocalRepo()==null||info.getLocalRepo().equals("")){
							 info.setLocalRepo(ResourcesPlugin.getWorkspace().getRoot().getLocation().toOSString());
							}
							String localRepo =info.getLocalRepo()+File.separator+info.getAppName();
							monitor.worked(20);	
							JgitRepoManager manager = new JgitRepoManager(localRepo,info.getRepoURL());
							monitor.worked(30);
							if(!manager.isCloned()){
								manager.gitClone();
								if(!"trunk".equals(info.getVersion())){	   
										manager.checkout(info.getVersion());
										monitor.worked(60);
										monitor.subTask("Cloning completed sucessfully");
										printInfoLog("Cloning completed sucessfully");
									}
							}else {
								manager.checkout(info.getVersion());
								monitor.worked(60);
								monitor.subTask("Cloning completed sucessfully");
								printInfoLog("Cloning completed sucessfully");
							}
                             info.setCheckedout(true);
                             broker.send("Projectupdate", null);
							 }catch(Exception e){
								 monitor.worked(0);
								 monitor.subTask("Cloning process has failed");
								 printErrorLog("Cloning process has failed \n"+e.getMessage()); 
								 log.error("Cloning :", e);
						   }
						}
							
					};
					uiSynchronize.asyncExec(new Runnable() {
						@Override
						public void run() {
						
						}
					});
					
			    return Status.OK_STATUS;
			  }
			};
		job.schedule();
	}	
	
	
	
	/*private void openRepoSettingsWizard() {

		IWizardDescriptor descriptor = PlatformUI.getWorkbench()
				.getNewWizardRegistry().findWizard(REPO_WIZARD_ID);
		if (descriptor == null) {
			descriptor = PlatformUI.getWorkbench().getImportWizardRegistry()
					.findWizard(REPO_WIZARD_ID);
		}
		if (descriptor == null) {
			descriptor = PlatformUI.getWorkbench().getExportWizardRegistry()
					.findWizard(REPO_WIZARD_ID);
		}
		try {
			if (descriptor != null) {
				IWizard wizard = descriptor.createWizard();
				WizardDialog wd = new WizardDialog(parent.getShell(), wizard);
				wd.setTitle(wizard.getWindowTitle());
				wd.open();
			}
		} catch (Exception e) {
			 log.error("Wizard invoke error", e);
		}
	}
*/

	public static AppfactoryApplicationDetailsView getAppDetailView() {
	    return appDetailView;
    }

	public static void setAppDetailView(AppfactoryApplicationDetailsView appDetailView) {
	    AppfactoryApplicationListView.appDetailView = appDetailView;
    }
	
	@Override
	public void setFocus() {
		// TODO Auto-generated method stub
		
	}
	
private class AppImportJobJob implements IRunnableWithProgress {
		
	AppVersionInfo appInfo;
	 public AppImportJobJob(AppVersionInfo appInfo) {
		    this.appInfo = appInfo;
    	}
	  
		@Override
		public void run(IProgressMonitor monitor) {
			String operationText="Importing App into worksapce";
			monitor.beginTask(operationText, 100);
			try{
				operationText="creating the project";
				monitor.subTask(operationText);
				monitor.worked(10);
				IProjectDescription description = ResourcesPlugin
						.getWorkspace()
						.loadProjectDescription(new Path(appInfo.getLocalRepo()+
								File.separator+appInfo.getAppName()+File.separator+".project"));
				operationText="Opening the project";
				monitor.subTask(operationText);
				monitor.worked(10); 
				final IProject project = ResourcesPlugin.getWorkspace()
						.getRoot().getProject(description.getName());
				        if(!project.exists()){
						   project.create(description,monitor);
						   project.open(monitor);
				        }	
				ResourcesPlugin
				.getWorkspace()
				.getRoot()
				.refreshLocal(IResource.DEPTH_INFINITE,
						monitor);
				monitor.worked(80);
				
			}catch(Throwable e){
				operationText="project Importing has filed please do it manually";
				 monitor.subTask(operationText);
				 monitor.worked(10); 
				 log.error("importing failed", e);
			}
			
			monitor.worked(100);
			monitor.done();
		}
	}  


}
