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
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.console.MessageConsoleStream;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.e4.core.contexts.EclipseContextFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventHandler;
import org.osgi.framework.Bundle;
import org.wso2.developerstudio.appfactory.core.authentication.Authenticator;
import org.wso2.developerstudio.appfactory.core.authentication.UserPasswordCredentials;
import org.wso2.developerstudio.appfactory.core.client.HttpsJenkinsClient;
import org.wso2.developerstudio.appfactory.core.client.HttpsJaggeryClient;
import org.wso2.developerstudio.appfactory.core.jag.api.JagApiProperties;
import org.wso2.developerstudio.appfactory.core.model.AppListModel;
import org.wso2.developerstudio.appfactory.core.model.AppVersionInfo;
import org.wso2.developerstudio.appfactory.core.model.ApplicationInfo;
import org.wso2.developerstudio.appfactory.core.repository.JgitRepoManager;
import org.wso2.developerstudio.appfactory.ui.Activator;
import org.wso2.developerstudio.appfactory.ui.actions.LoginAction;
import org.wso2.developerstudio.appfactory.ui.utils.Messages;
import org.wso2.developerstudio.eclipse.logging.core.IDeveloperStudioLog;
import org.wso2.developerstudio.eclipse.logging.core.Logger;
import org.wso2.developerstudio.eclipse.platform.core.utils.SWTResourceManager;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;


import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.e4.ui.di.UISynchronize;

public class AppfactoryApplicationListView extends ViewPart {
	
	public static final String ID = Messages.AppfactoryApplicationListView_0;
	
	public static final String REPO_WIZARD_ID = Messages.AppfactoryApplicationListView_1;
	
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
		broker.subscribe(Messages.AppfactoryApplicationListView_2, buildhandler);
			
		apphandler = getAppListHandler();
		broker.subscribe(Messages.AppfactoryApplicationListView_3, apphandler);
 
		appVersionhandler = getAppVersionEventHandler();
		broker.subscribe(Messages.AppfactoryApplicationListView_4, appVersionhandler);
		
		ErrorLoghandler = getErrorLogEventHandler();
		broker.subscribe(Messages.AppfactoryApplicationListView_5,ErrorLoghandler);
		
		infoLoghandler = getInfoLogEventHandler();
		broker.subscribe(Messages.AppfactoryApplicationListView_6,infoLoghandler);
		
		projectOpenhandler = getPorjectcheckedOUtHandler();
		broker.subscribe(Messages.AppfactoryApplicationListView_7,projectOpenhandler);
		
	}

	@SuppressWarnings("restriction")
	private void printErrorLog(String msg){
		 broker.send(Messages.AppfactoryApplicationListView_8, Messages.AppfactoryApplicationListView_9+Messages.AppfactoryApplicationListView_10+new Timestamp(new Date().getTime()) +Messages.AppfactoryApplicationListView_11+msg);
	}
	
	private void printInfoLog(String msg){
		 broker.send(Messages.AppfactoryApplicationListView_12, Messages.AppfactoryApplicationListView_13+Messages.AppfactoryApplicationListView_14+new Timestamp(new Date().getTime()) +Messages.AppfactoryApplicationListView_15+msg);
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
							 log.error(Messages.AppfactoryApplicationListView_16, e);
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
						buildOut.println(Messages.AppfactoryApplicationListView_17+event.getProperty(IEventBroker.DATA));
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
						errorOut.println(Messages.AppfactoryApplicationListView_18 + event.getProperty(IEventBroker.DATA));
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
						infoOut.println(Messages.AppfactoryApplicationListView_19 + event.getProperty(IEventBroker.DATA));
					}
				});
			}
		};
	}
	
	
	private void ShowLoginDialog(){
		 credentials = Authenticator.getInstance().getCredentials();
		 try{
		 if(credentials==null){
			 printErrorLog(Messages.AppfactoryApplicationListView_20);
			 LoginAction loginAction = new LoginAction();
			 printInfoLog(Messages.AppfactoryApplicationListView_21);
			 if(loginAction.login()){
				 printInfoLog(Messages.AppfactoryApplicationListView_22);
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
		 params.put(Messages.AppfactoryApplicationListView_23,JagApiProperties.USER_APP_LIST__ACTION);
		 params.put(Messages.AppfactoryApplicationListView_24,Authenticator.getInstance().getCredentials().getUser()); 
		 printInfoLog(Messages.AppfactoryApplicationListView_25);
		 String respond = HttpsJaggeryClient.httpPost(JagApiProperties.getAppInfoUrl(), params);
		 if(Messages.AppfactoryApplicationListView_26.equals(respond)){
		  printErrorLog(Messages.AppfactoryApplicationListView_27);	 
	      boolean val = Authenticator.getInstance().reLogin();
	      if(val){
	       printInfoLog(Messages.AppfactoryApplicationListView_28);	  
	       respond = HttpsJaggeryClient.httpPost(JagApiProperties.getAppInfoUrl(), params);
	      }else{
	    	printErrorLog(Messages.AppfactoryApplicationListView_29 +
	    			Messages.AppfactoryApplicationListView_30);  
	      }
		 }
		 if(!Messages.AppfactoryApplicationListView_31.equals(respond)){
	     printInfoLog(Messages.AppfactoryApplicationListView_32);	 
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
			printErrorLog("CANNOT PROCEEDS \n Applications loading failed ! \n "+e.getMessage());  
	    	log.error("Application Loading :", e);
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
	                    	String title =Messages.AppfactoryApplicationListView_33;
	                        if(appInfo.getappVersionList().isEmpty()){
	                        	title = Messages.AppfactoryApplicationListView_34;
	                        }else{
	                        	title = Messages.AppfactoryApplicationListView_35;
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
    				return Messages.AppfactoryApplicationListView_36;
    			}
			});
    }
	
	private void  updateApplicationView(){
		Job job = new Job(Messages.AppfactoryApplicationListView_37) {
		   @SuppressWarnings("restriction")
			@Override
			  protected IStatus run(final IProgressMonitor monitor) {
				monitor.beginTask(Messages.AppfactoryApplicationListView_38, 100);
				  UISynchronize uiSynchronize = new UISynchronize() {
						@Override
						public void syncExec(Runnable runnable) {
							
						}
						
						@Override
						public void asyncExec(Runnable runnable) {
							   monitor.subTask(Messages.AppfactoryApplicationListView_39);
							   monitor.worked(10);
							   List<ApplicationInfo> applist = getApplist();
							   monitor.worked(40);
							   if(applist!=null){
								monitor.subTask(Messages.AppfactoryApplicationListView_40);
								monitor.worked(60);	   
							   broker.send(Messages.AppfactoryApplicationListView_41, applist);
							   monitor.worked(90);	
							   }else{
							     monitor.subTask(Messages.AppfactoryApplicationListView_42);
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
		Job job = new Job(Messages.AppfactoryApplicationListView_43) {
		   @SuppressWarnings("restriction")
			@Override
			  protected IStatus run(final IProgressMonitor monitor) {
				monitor.beginTask(Messages.AppfactoryApplicationListView_44, 100);
				  UISynchronize uiSynchronize = new UISynchronize() {
						@Override
						public void syncExec(Runnable runnable) {
						}
						
						@Override
						public void asyncExec(Runnable runnable) {
							appInfo.setLableState(1);
							broker.send(Messages.AppfactoryApplicationListView_45, model);
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
							monitor.subTask(Messages.AppfactoryApplicationListView_46);
							monitor.worked(20);	   
							boolean result = model.setversionInfo(appInfo);
							if(!result){
								boolean reLogin = Authenticator.getInstance().reLogin();
								if(reLogin){
									result = model.setversionInfo(appInfo);
								}
							}
							if(result){
							monitor.subTask(Messages.AppfactoryApplicationListView_47);
							monitor.worked(40);	 
							broker.send(Messages.AppfactoryApplicationListView_48, model);
							monitor.worked(50);
							return true;
							}else{

								return false;
							}
						}
						
						private boolean getTeamInfo(final ApplicationInfo appInfo,
								final IProgressMonitor monitor) {
							monitor.subTask(Messages.AppfactoryApplicationListView_49);
							monitor.worked(60);	   
							boolean result = model.setRoleInfomation(appInfo);
							if(!result){
								boolean reLogin = Authenticator.getInstance().reLogin();
								if(reLogin){
									result = model.setRoleInfomation(appInfo);
								}
							}
							if(result){
							monitor.subTask(Messages.AppfactoryApplicationListView_50);
							monitor.worked(60);	 
							broker.send(Messages.AppfactoryApplicationListView_51, model);
							monitor.worked(90);
							return true;
							}else{
								return false;
							}
						}
						
						private boolean getDbInfo(final ApplicationInfo appInfo,
								final IProgressMonitor monitor) {
							monitor.subTask(Messages.AppfactoryApplicationListView_52);
							monitor.worked(60);	   
							boolean result = model.setDBInfomation(appInfo);
							if(!result){
								boolean reLogin = Authenticator.getInstance().reLogin();
								if(reLogin){
									result = model.setDBInfomation(appInfo);
								}
							}
							if(result){
							monitor.subTask(Messages.AppfactoryApplicationListView_53);
							monitor.worked(60);	 
							broker.send(Messages.AppfactoryApplicationListView_54, model);
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
		 
		Job job = new Job(Messages.AppfactoryApplicationListView_55) {
		 
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
						    		 printErrorLog(Messages.AppfactoryApplicationListView_56+newbuildId+Messages.AppfactoryApplicationListView_57 +
												Messages.AppfactoryApplicationListView_58);	 
										Thread.sleep(2000); 
										if(monitor.isCanceled()){
											printInfoLog(Messages.AppfactoryApplicationListView_59);	  
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
							printErrorLog(Messages.AppfactoryApplicationListView_60+e.getMessage());	 
							log.error(Messages.AppfactoryApplicationListView_61,e);
						}

					}

					private int deploy(final AppVersionInfo appInfo, int buildId) {
						Map<String, String> params = new HashMap<String, String>();
						params.put(Messages.AppfactoryApplicationListView_62,
								JagApiProperties.App_BUILD_ACTION);
						params.put(Messages.AppfactoryApplicationListView_63, Messages.AppfactoryApplicationListView_64);
						params.put(Messages.AppfactoryApplicationListView_65, appInfo.getAppName());
						params.put(Messages.AppfactoryApplicationListView_66, appInfo.getVersion());
						params.put(Messages.AppfactoryApplicationListView_67, Messages.AppfactoryApplicationListView_68);
						printInfoLog(Messages.AppfactoryApplicationListView_69);	
						String httpPostrespond = HttpsJaggeryClient.httpPost(
								JagApiProperties.getBuildApplication(),
								params); 
						if(!Messages.AppfactoryApplicationListView_70.equals(httpPostrespond)){
							printInfoLog(Messages.AppfactoryApplicationListView_71);
							buildId++;
						}else{
							printErrorLog(Messages.AppfactoryApplicationListView_72);
							printInfoLog(Messages.AppfactoryApplicationListView_73);
						}

						return buildId;
					}

					private String getBuilderUrl(final AppVersionInfo appInfo,
							int buidNo) {
						Map<String, String> params;
						params = new HashMap<String, String>();
						params.put(Messages.AppfactoryApplicationListView_74,JagApiProperties.App_BUILD_URL_ACTIONL);
						params.put(Messages.AppfactoryApplicationListView_75, Messages.AppfactoryApplicationListView_76 + buidNo);
						params.put(Messages.AppfactoryApplicationListView_77,appInfo.getVersion());
						params.put(Messages.AppfactoryApplicationListView_78,appInfo.getAppName());
						String builderBaseUrl = Messages.AppfactoryApplicationListView_79;
						builderBaseUrl = HttpsJaggeryClient.httpPost(JagApiProperties.getBuildInfoUrl(),params);
						return builderBaseUrl;
					}

					private void printJenkinsBuildLogs(final AppVersionInfo appInfo, int buidNo,
							String builderBaseUrl,IProgressMonitor monitor) throws IOException,InterruptedException {
						printInfoLog(Messages.AppfactoryApplicationListView_80+buidNo);	  
						while(true){
						HttpResponse response = HttpsJenkinsClient
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
							broker.send(Messages.AppfactoryApplicationListView_81, line.toString());
							Thread.sleep(100);
						}
						EntityUtils.consume(entity);
						break;
						}else if(response.getStatusLine().getStatusCode()==404){
							printErrorLog(Messages.AppfactoryApplicationListView_82 +
									Messages.AppfactoryApplicationListView_83);	 
							Thread.sleep(2000); 
							if(monitor.isCanceled()){
								printInfoLog(Messages.AppfactoryApplicationListView_84);	  
								break;
							}
						}else{
							printErrorLog(Messages.AppfactoryApplicationListView_85+response.getStatusLine().getStatusCode());
							 break;
						}
					}	
				}

					private int getLastBuildId(final AppVersionInfo appInfo) {
						credentials = Authenticator.getInstance().getCredentials();
						Map<String, String> params = new HashMap<String, String>();
						params.put(Messages.AppfactoryApplicationListView_86,JagApiProperties.App_BUILD_INFO_ACTION);
						params.put(Messages.AppfactoryApplicationListView_87, Messages.AppfactoryApplicationListView_88);
						params.put(Messages.AppfactoryApplicationListView_89,appInfo.getAppName());
						params.put(Messages.AppfactoryApplicationListView_90, appInfo.getVersion());
						params.put(Messages.AppfactoryApplicationListView_91, Messages.AppfactoryApplicationListView_92);
						params.put(Messages.AppfactoryApplicationListView_93,Messages.AppfactoryApplicationListView_94);
						params.put(Messages.AppfactoryApplicationListView_95, Messages.AppfactoryApplicationListView_96);
						params.put(Messages.AppfactoryApplicationListView_97,credentials.getUser());
						printInfoLog(Messages.AppfactoryApplicationListView_98);	 
						String respond = HttpsJaggeryClient.httpPost(JagApiProperties.getBuildLastSucessfullBuildUrl(),params);
						if(Messages.AppfactoryApplicationListView_99.equals(respond)){
						printErrorLog(Messages.AppfactoryApplicationListView_100);	 
					    boolean val = Authenticator.getInstance().reLogin();
					      if(val){
					    	  printInfoLog(Messages.AppfactoryApplicationListView_101);	  
					    	  respond =HttpsJaggeryClient.httpPost(JagApiProperties.getBuildLastSucessfullBuildUrl(),params);
					      }else{
					    	printErrorLog(Messages.AppfactoryApplicationListView_102 +
					    			Messages.AppfactoryApplicationListView_103);  
					      }
						}
						if(!Messages.AppfactoryApplicationListView_104.equals(respond)){
							JsonElement jelement = new JsonParser().parse(respond);
							JsonArray buildInfoArray;
							int buildId = 0;
								buildInfoArray = jelement.getAsJsonArray();
								for (JsonElement jsonElement : buildInfoArray) 
								{
									JsonObject asJsonObject = jsonElement
											.getAsJsonObject();
									JsonElement jsonElement2 = asJsonObject
											.get(Messages.AppfactoryApplicationListView_105);
									JsonObject asJsonObject2 = jsonElement2
											.getAsJsonObject();
									String asString = asJsonObject2.get(Messages.AppfactoryApplicationListView_106)
											.getAsString();
									if (asString.equals(appInfo.getVersion())) {
										JsonElement jsonElement3 = asJsonObject
												.get(Messages.AppfactoryApplicationListView_107);
										JsonObject asJsonObject3 = jsonElement3
												.getAsJsonObject();
										buildId = asJsonObject3.get(Messages.AppfactoryApplicationListView_108)
												.getAsInt();
										break;
									}
								}
								printInfoLog(Messages.AppfactoryApplicationListView_109+buildId);
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
						 Messages.AppfactoryApplicationListView_110);
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
				return Messages.AppfactoryApplicationListView_111;
			}
			public ImageDescriptor getImageDescriptor() {
				ImageDescriptor imageDescriptorFromPlugin = Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
						 Messages.AppfactoryApplicationListView_112);
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
					   dialog.setText(Messages.AppfactoryApplicationListView_113);
					    if(dialog.open()!=null){
					    	appInfo.setLocalrepoLocation(dialog.getFilterPath());
					    	appInfo.updateVersions();
					    }
				} catch (Exception e) {
					log.error(Messages.AppfactoryApplicationListView_114, e);
				}
			};
       
			public String getText() {
				return Messages.AppfactoryApplicationListView_115;
			}
			@Override
			public ImageDescriptor getImageDescriptor() {
				ImageDescriptor imageDescriptorFromPlugin = Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
						 Messages.AppfactoryApplicationListView_116);
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
					log.error(Messages.AppfactoryApplicationListView_117, e);
				}
			};
			public String getText() {
				return Messages.AppfactoryApplicationListView_118;
			}
			@Override
			public ImageDescriptor getImageDescriptor() {
				ImageDescriptor imageDescriptorFromPlugin = Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
						 Messages.AppfactoryApplicationListView_119);
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
				return Messages.AppfactoryApplicationListView_120;
			}
			@Override
			public ImageDescriptor getImageDescriptor() {
				ImageDescriptor imageDescriptorFromPlugin = Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
						 Messages.AppfactoryApplicationListView_121);
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
					 log.error(Messages.AppfactoryApplicationListView_122, e);
				} catch (InterruptedException e) {
					log.error(Messages.AppfactoryApplicationListView_123, e);
				}
			};

			public String getText() {
				return Messages.AppfactoryApplicationListView_124;
			}
			@Override
			public ImageDescriptor getImageDescriptor() {
				ImageDescriptor imageDescriptorFromPlugin = Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
						 Messages.AppfactoryApplicationListView_125);
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
		Job job = new Job(Messages.AppfactoryApplicationListView_126) {
		   @SuppressWarnings("restriction")
			@Override
			  protected IStatus run(final IProgressMonitor monitor) {
				monitor.beginTask(Messages.AppfactoryApplicationListView_127, 100);
				  UISynchronize uiSynchronize = new UISynchronize() {
						@Override
						public void syncExec(Runnable runnable) {
						}
						
						@Override
						public void asyncExec(Runnable runnable) {
						 try{
							monitor.subTask(Messages.AppfactoryApplicationListView_128);
							printInfoLog(Messages.AppfactoryApplicationListView_129);
							monitor.worked(10);	  
							if(info.getLocalRepo()==null||info.getLocalRepo().equals(Messages.AppfactoryApplicationListView_130)){
							 info.setLocalRepo(ResourcesPlugin.getWorkspace().getRoot().getLocation().toOSString());
							}
							String localRepo =info.getLocalRepo()+File.separator+info.getAppName();
							monitor.worked(20);	
							JgitRepoManager manager = new JgitRepoManager(localRepo,info.getRepoURL());
							monitor.worked(30);
							if(!manager.isCloned()){
								manager.gitClone();
								if(!Messages.AppfactoryApplicationListView_131.equals(info.getVersion())){	   
										manager.checkout(info.getVersion());
										monitor.worked(60);
										monitor.subTask(Messages.AppfactoryApplicationListView_132);
										printInfoLog(Messages.AppfactoryApplicationListView_133);
									}
							}else {
								manager.checkout(info.getVersion());
								monitor.worked(60);
								monitor.subTask(Messages.AppfactoryApplicationListView_134);
								printInfoLog(Messages.AppfactoryApplicationListView_135);
							}
                             info.setCheckedout(true);
                             broker.send(Messages.AppfactoryApplicationListView_136, null);
							 }catch(Exception e){
								 monitor.worked(0);
								 monitor.subTask(Messages.AppfactoryApplicationListView_137);
								 printErrorLog(Messages.AppfactoryApplicationListView_138+e.getMessage()); 
								 log.error(Messages.AppfactoryApplicationListView_139, e);
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
			String operationText=Messages.AppfactoryApplicationListView_140;
			monitor.beginTask(operationText, 100);
			try{
				operationText=Messages.AppfactoryApplicationListView_141;
				monitor.subTask(operationText);
				monitor.worked(10);
				IProjectDescription description = ResourcesPlugin
						.getWorkspace()
						.loadProjectDescription(new Path(appInfo.getLocalRepo()+
								File.separator+appInfo.getAppName()+File.separator+Messages.AppfactoryApplicationListView_142));
				operationText=Messages.AppfactoryApplicationListView_143;
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
				operationText=Messages.AppfactoryApplicationListView_144;
				 monitor.subTask(operationText);
				 monitor.worked(10); 
				 log.error(Messages.AppfactoryApplicationListView_145, e);
			}
			
			monitor.worked(100);
			monitor.done();
		}
	}  


}
