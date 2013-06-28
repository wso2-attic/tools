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
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.Collections;
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
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Cursor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Menu;
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

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;


import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.jobs.Job;
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
	private EventHandler closehandler;
	TestOutputConsole console;
	MessageConsoleStream out;
	
  
	@SuppressWarnings("restriction")
	@Override
	public void init(IViewSite site) throws PartInitException {

		super.init(site);
		console = new TestOutputConsole();
		out = console.getOut();
		Bundle bundle = Platform.getBundle(Activator.PLUGIN_ID);
		// this.execute();
		@SuppressWarnings("restriction")
		IEclipseContext eclipseContext = EclipseContextFactory
				.getServiceContext(bundle.getBundleContext());
		eclipseContext.set(org.eclipse.e4.core.services.log.Logger.class, null);
		broker = eclipseContext.get(IEventBroker.class);
		closehandler = new EventHandler() {
			public void handleEvent(final Event event) {
				System.out.println(event.getProperty(IEventBroker.DATA));
				// Display.getDefault();
				@SuppressWarnings("unused")
				final Display display = Display.getDefault();
				Display.getDefault().asyncExec(new Runnable() {

					@Override
					public void run() {
						out.println("" + event.getProperty(IEventBroker.DATA));
					}
				});
			}
		};

		broker.subscribe("update", closehandler);

		createUserAppList();

	}
 
	private void createUserAppList() {
		try{
		 credentials = Authenticator.getInstance().getCredentials();
		 if(credentials==null){
			 LoginAction loginAction = new LoginAction();
			 if(loginAction.login()){
				 createUserAppList();
			 }else{
				 out.println("Restart the Appfactory");
			 }
		 } 
		 Map<String,String> params = new HashMap<String,String>();
		 params.put("action",JagApiProperties.USER_APP_LIST__ACTION);
		 params.put("userName",credentials.getUser()); 
		 String respond = HttpsJaggeryClient.httpPost(JagApiProperties.getAppInfoUrl(), params);
		 Gson gson = new Gson();
		 Type collectionType = new TypeToken<java.util.List<ApplicationInfo>>(){}.getType();
		 appLists = gson.fromJson(respond, collectionType);
		}catch(Exception e){
			 out.println("Application View Loarding Issues : "+ e.getMessage());
		}
	}
	
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
		        	if(!appInfo.isLoaded()){
		        		getVersionInformation(appInfo);
		        		appInfo.setLoaded(true);
		        	}
		        	appDetailView.updateView(appInfo);
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
	                    	manager.add(checkOutAction(appVersionInfo));
	                    	//manager.add(repoUpdateAction(appVersionInfo));
	                    	manager.add(buildInfoAction(appVersionInfo)); 
	                    	
	                    }else if (selection.getFirstElement() instanceof ApplicationInfo){
	                    	ApplicationInfo appInfo = (ApplicationInfo) selection.getFirstElement();
	                    	manager.add(appOpenAction(appInfo));
		                    manager.add(repoSettingsAction());
		                  
	                    }
	                }
	            }
	        });
	        menuMgr.setRemoveAllWhenShown(true);
	        viewer.getControl().setMenu(menu); 
	}
	
	private Action appOpenAction(final ApplicationInfo appInfo) {
		Action reposettings = new Action() {
			public void run() {
				try {
					getVersionInformation(appInfo);
				} catch (Exception e) {
					log.error(e);
				}
			}
			public String getText() {
				return "Update Application";
			}
		};
		return reposettings;
	}
 
	private void getVersionInformation(final ApplicationInfo appInfo) {
		Display.getCurrent().getActiveShell().setCursor((new Cursor(Display.getCurrent(), SWT.CURSOR_WAIT)));
		AppListModel oldModel = model;
		model.setversionInfo(appInfo);
		contentProvider.inputChanged(viewer, oldModel, model);
		viewer.refresh();
		viewer.expandToLevel(appInfo, 1);
		Display.getCurrent().getActiveShell().setCursor((new Cursor(Display.getCurrent(), SWT.CURSOR_ARROW)));
	} 
	
	private Action buildInfoAction(final AppVersionInfo appInfo) {

		Action reposetetings = new Action() {

			@Override
			public void run() {
				building();
			}

			private void building() {
				Job job = new Job("My Job") {
					@Override
					protected IStatus run(IProgressMonitor monitor) {
						UISynchronize uiSynchronize = new UISynchronize() {

							@Override
							public void syncExec(Runnable runnable) {
								// TODO Auto-generated method stub

							}

							@Override
							public void asyncExec(Runnable runnable) {
								try {

									credentials = Authenticator.getInstance()
											.getCredentials();
									Map<String, String> params = new HashMap<String, String>();
									params.put(
											"action",
											JagApiProperties.App_BUILD_INFO_ACTION);
									params.put("stage", "Development");
									params.put("applicationKey",
											appInfo.getAppName());
									params.put("version", appInfo.getVersion());
									params.put("buildable", "true");
									params.put("isRoleBasedPermissionAllowed",
											"false");
									params.put("metaDataNeed", "false");
									params.put("userName",
											credentials.getUser());
									String respond = HttpsJaggeryClient
											.httpPost(
													JagApiProperties
															.getBuildLastSucessfullBuildUrl(),
													params);
									JsonElement jelement = new JsonParser()
											.parse(respond);
									JsonArray buildInfoArray;
									int buidNo = 0;
									try {
										buildInfoArray = jelement
												.getAsJsonArray();
										for (JsonElement jsonElement : buildInfoArray) {
											JsonObject asJsonObject = jsonElement
													.getAsJsonObject();
											JsonElement jsonElement2 = asJsonObject
													.get("version");
											JsonObject asJsonObject2 = jsonElement2
													.getAsJsonObject();
											String asString = asJsonObject2
													.get("current")
													.getAsString();
											if (asString.equals(appInfo
													.getVersion())) {
												JsonElement jsonElement3 = asJsonObject
														.get("build");
												JsonObject asJsonObject3 = jsonElement3
														.getAsJsonObject();
												buidNo = asJsonObject3.get(
														"lastBuildId")
														.getAsInt();
												break;
											}
										}

									} catch (Exception e) {
										log.error("", e);
									}

									params = new HashMap<String, String>();
									params.put(
											"action",
											JagApiProperties.App_BUILD_URL_ACTIONL);
									params.put("lastBuildNo", "" + buidNo);
									params.put("applicationVersion",
											appInfo.getVersion());
									params.put("applicationKey",
											appInfo.getAppName());
									String builderBaseUrl = "false";
									while ("false".equals(builderBaseUrl)) {
										builderBaseUrl = HttpsJaggeryClient
												.httpPost(JagApiProperties
														.getBuildInfoUrl(),
														params);
										Thread.sleep(1000);
									}
									HttpResponse response = HttpsGenkinsClient
											.getBulildinfo(
													appInfo.getAppName(),
													appInfo.getVersion(),
													builderBaseUrl, buidNo);
									HttpEntity entity = response.getEntity();
									BufferedReader rd = new BufferedReader(
											new InputStreamReader(response
													.getEntity().getContent()));
									String line;
									TestOutputConsole console = new TestOutputConsole();
									MessageConsoleStream out = console.getOut();
									out.getConsole().clearConsole();
									while ((line = rd.readLine()) != null) {
										// out.println(line.toString());
										broker.send("update", line.toString());
										Thread.sleep(100);
									}
									EntityUtils.consume(entity);

								} catch (Exception e) {
									log.error(
											"Remote method invokation Error !",
											e);
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

			public String getText() {
				return "Build Logs";
			}
		};

		return reposetetings;
	}	
	 
	public static void buildingJob(){
		
		Job job = new Job("My Job") {
			  @Override
			  protected IStatus run(IProgressMonitor monitor) {
			    // Do something long running
			    //... 
				  UISynchronize uiSynchronize = new UISynchronize() {
						
						@Override
						public void syncExec(Runnable runnable) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void asyncExec(Runnable runnable) {
							// TODO Auto-generated method stub
							
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
	
	

	private Action repoSettingsAction() {
		Action reposettings = new Action() {
			public void run() {
				try {
                openRepoSettingsWizard();
				} catch (Exception e) {
					log.error("", e);
				}
			};

			public String getText() {
				return "Chnage Reposertory Settings";
			}
		};
		return reposettings;
	}
	

     
     /**
      * Create toolbar.
      */
     private void createToolbar() {
             IToolBarManager mgr = getViewSite().getActionBars().getToolBarManager();
             mgr.add(new Action() {
            	 @Override
            	public void run() {
            		    Display.getCurrent().getActiveShell().setCursor((new Cursor(Display.getCurrent(), SWT.CURSOR_WAIT)));
            			AppListModel oldModel = model;
            			List<ApplicationInfo> oldappLists = appLists;
            			createUserAppList();
            			contentProvider.inputChanged(viewer, oldappLists, appLists);
            			viewer.refresh();
            			Display.getCurrent().getActiveShell().setCursor((new Cursor(Display.getCurrent(), SWT.CURSOR_ARROW)));
            	}
            	 
            	 public String getText() {
     				return "Refresh";
     			}
			});
           //  mgr.add(deleteItemAction);
     }
	
     
     
	private Action repoUpdateAction(final AppVersionInfo info) {
		Action reposettings = new Action() {
			public void run() {
				try {
					ProgressMonitorDialog progressMonitorDialog = new ProgressMonitorDialog(Display.getDefault().getActiveShell());
					progressMonitorDialog.create();
					progressMonitorDialog.open();
					progressMonitorDialog.run(false, false, new RepoUpadetJob(info));
				} catch (Exception e) {
					log.error("Updatating Error", e);
				}
			};
			public String getText() {
				return "Update Repository";
			}
		};
		return reposettings;
	}
	
	private Action checkOutAction(final AppVersionInfo info) {
		Action reposettings = new Action() {
			public void run() {
				try {
					ProgressMonitorDialog progressMonitorDialog = new ProgressMonitorDialog(Display.getDefault().getActiveShell());
					progressMonitorDialog.create();
					progressMonitorDialog.open();
					progressMonitorDialog.run(false, false, new CloneJob(info));
					String localRepo = ResourcesPlugin.getWorkspace().getRoot().getLocation().toOSString()+File.separator+info.getAppName();
					 
					IProjectDescription description = ResourcesPlugin
							.getWorkspace()
							.loadProjectDescription(new Path(localRepo+File.separator+".project"));
					final IProject project = ResourcesPlugin.getWorkspace()
							.getRoot().getProject(description.getName());
					        if(!project.exists()){
									project.create(description,new NullProgressMonitor());
					        }		
					ResourcesPlugin
							.getWorkspace()
							.getRoot()
							.refreshLocal(IResource.DEPTH_INFINITE,
									new NullProgressMonitor());
					Display.getCurrent().asyncExec(new Runnable() {
						@Override
						public void run() {
							try {
								project.open(new NullProgressMonitor());
							} catch (CoreException e) {
								//e.printStackTrace();
							}
						}
					}); 
				} catch (Exception e) {
					ShowErrorMsg();
					log.error("", e);
				}
			};

			private void ShowErrorMsg(){
				   ErroModel erroModel = Authenticator.getInstance().getErroModel();
				   final String PID = Activator.PLUGIN_ID;
				   MultiStatus info = new MultiStatus(PID, 1,"This project type doesnot support in Developer Studio", null);
				   info.add(new Status(IStatus.INFO, PID, 1,erroModel.getMessage(), null));
				   List<String> resions = erroModel.getResions();
				   resions.add(".project file is missing");
				   if(resions!=null){
				   for (String msg : resions) {
					   info.add(new Status(IStatus.INFO, PID, 1,msg, null));
				   		}
				   }
				   ErrorDialog.openError(Display.getCurrent().getActiveShell(), "AppFactory Error", null, info);
			}
			
			public String getText() {
				return " Check-Out ";
			}
		};
		return reposettings;
	}

	private void openRepoSettingsWizard() {

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


	public static AppfactoryApplicationDetailsView getAppDetailView() {
	    return appDetailView;
    }

	public static void setAppDetailView(AppfactoryApplicationDetailsView appDetailView) {
	    AppfactoryApplicationListView.appDetailView = appDetailView;
    }
	
	private class CloneJob implements IRunnableWithProgress {

		private AppVersionInfo info;
		
		public CloneJob(AppVersionInfo info) {
			 this.info = info;
		}
		@Override
		public void run(IProgressMonitor monitor) throws InvocationTargetException,
				InterruptedException {
			Display.getCurrent().getActiveShell().setCursor((new Cursor(Display.getCurrent(), SWT.CURSOR_WAIT)));
			String operationText="Cloning with remote repository";
			monitor.beginTask(operationText, 100);
			monitor.worked(10);
			try{
				String localRepo = ResourcesPlugin.getWorkspace().getRoot().getLocation().toOSString()+File.separator+info.getAppName();
				JgitRepoManager manager = new JgitRepoManager(localRepo,info.getRepoURL());
				monitor.worked(20);
				if(!manager.isCloned()){
					manager.gitClone();
					if(!"trunk".equals(info.getVersion())){	   
							manager.checkout(info.getVersion());
						}
				}else {
					manager.checkout(info.getVersion());
				}
				monitor.worked(90);
			}catch(Exception e){
				Display.getCurrent().getActiveShell().setCursor((new Cursor(Display.getCurrent(), SWT.CURSOR_ARROW)));
				e.printStackTrace();
				monitor.setCanceled(true); 
			}
			monitor.worked(100);
			monitor.done();
			Display.getCurrent().getActiveShell().setCursor((new Cursor(Display.getCurrent(), SWT.CURSOR_ARROW)));
		}
	}	
	
	private class RepoUpadetJob implements IRunnableWithProgress {

		private AppVersionInfo info;
		public RepoUpadetJob(AppVersionInfo info) {
			 this.info = info;
		}
		@Override
		public void run(IProgressMonitor monitor) throws InvocationTargetException,
				InterruptedException {
			String operationText="Upadating local repository";
			monitor.beginTask(operationText, 100);
			monitor.worked(10);
			try{
				String localRepo = ResourcesPlugin.getWorkspace().getRoot().getLocation().toOSString()+"/"+info.getAppName();
				JgitRepoManager manager = new JgitRepoManager(localRepo,info.getRepoURL());
				if("trunk".equals(info.getVersion())){
				//	manager.trackBranch("master");
				}else{
				//manager.trackBranch(info.getVersion());	
					 
				}
				monitor.worked(60);
				//manager.update();
				manager.checkoutLocalBranch(info.getVersion());
				
				ResourcesPlugin
				.getWorkspace()
				.getRoot()
				.refreshLocal(IResource.DEPTH_INFINITE,
						new NullProgressMonitor());
			}catch(Exception e){
				monitor.setCanceled(true);
				log.error("updateprocess error", e);
			}
			
			monitor.worked(100);
			monitor.done();
		}
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub
		
	}

}
