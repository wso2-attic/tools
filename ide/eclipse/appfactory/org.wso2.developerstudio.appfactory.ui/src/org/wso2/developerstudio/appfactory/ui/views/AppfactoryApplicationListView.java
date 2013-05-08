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

package org.wso2.developerstudio.appfactory.ui.views;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.ui.wizards.IWizardDescriptor;
import org.wso2.developerstudio.appfactory.core.authentication.Authenticator;
import org.wso2.developerstudio.appfactory.core.authentication.UserPasswordCredentials;
import org.wso2.developerstudio.appfactory.core.client.HttpsJaggeryClient;
import org.wso2.developerstudio.appfactory.core.model.AppListModel;
import org.wso2.developerstudio.appfactory.core.model.AppVersionInfo;
import org.wso2.developerstudio.appfactory.core.model.ApplicationInfo;
import org.wso2.developerstudio.appfactory.core.repository.JgitRepoManager;
import org.wso2.developerstudio.appfactory.ui.Activator;
import org.wso2.developerstudio.eclipse.logging.core.IDeveloperStudioLog;
import org.wso2.developerstudio.eclipse.logging.core.Logger;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
 

 
public class AppfactoryApplicationListView extends ViewPart {
	
	public static final String ID = "org.wso2.developerstudio.appfactory.ui.views.AppfactoryView";
	public static final String APP_NIFO_URL = "https://appfactorypreview.wso2.com/appmgt/site/blocks/application/get/ajax/list.jag";
	public static final String REPO_WIZARD_ID = "org.eclipse.egit.ui.internal.clone.GitCloneWizard";
	private TreeViewer viewer;
	private Composite parent; 
	private AppListModel model;
	private AppListLabelProvider labelProvider;
	private AppListContentProvider contentProvider;
	private String localRepo="";
	private String uri ="";
	private UserPasswordCredentials credentials;
	
	private static IDeveloperStudioLog log=Logger.getLog(Activator.PLUGIN_ID);
	java.util.List<ApplicationInfo> appLists;
 
	
	@Override
	public void init(IViewSite site) throws PartInitException {
  
		 super.init(site);
		 credentials = Authenticator.getInstance().getCredentials();
		 Map<String,String> params = new HashMap<String,String>();
		 params.put("action", "getApplicationsOfUser");
		 params.put("userName",credentials.getUser()); 
		 String respond = HttpsJaggeryClient.httpPost(APP_NIFO_URL, params);
		 Gson gson = new Gson();
		 Type collectionType = new TypeToken<java.util.List<ApplicationInfo>>(){}.getType();
		 appLists = gson.fromJson(respond, collectionType);
	}
	
	public void createPartControl(Composite parent) {
          this.parent = parent;
          contentProvider = new AppListContentProvider(appLists);
          labelProvider = new AppListLabelProvider();
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
				 if (selectedNode instanceof AppVersionInfo) {
		        	  AppVersionInfo version = (AppVersionInfo) selection.getFirstElement();
		        }else if (selectedNode instanceof ApplicationInfo){
		        	ApplicationInfo oppInfo = (ApplicationInfo) selection.getFirstElement();
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
		    
		    MenuManager menuMgr = new MenuManager();
	        Menu menu = menuMgr.createContextMenu(viewer.getControl());
	        menu.setVisible(true);
	        menuMgr.addMenuListener(new IMenuListener() {
	            @Override
	            public void menuAboutToShow(IMenuManager manager) {
	                if (viewer.getSelection().isEmpty()) {
	                    return;
	                }

	                if (viewer.getSelection() instanceof IStructuredSelection) {
	                    IStructuredSelection selection = (IStructuredSelection) viewer.getSelection();
	                    if(selection.getFirstElement() instanceof AppVersionInfo){
	                    	AppVersionInfo appVersionInfo = (AppVersionInfo) selection.getFirstElement();
	                    	
	                    }else if (selection.getFirstElement() instanceof ApplicationInfo){
	                    	ApplicationInfo appInfo = (ApplicationInfo) selection.getFirstElement();
	                    	manager.add(appOpenAction(appInfo));
		                    manager.add(repoSettingsAction());
		                    manager.add(prefernceAction());
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
					AppListModel oldModel = model;
					model.setversionInfo(appInfo);
				    contentProvider.inputChanged(viewer, oldModel, model);
					viewer.refresh();
					viewer.expandToLevel(appInfo, 1);
				} catch (Exception e) {
					e.printStackTrace();
				}
			};

			public String getText() {
				return "Open Application";
			}
		};
		return reposettings;
	}

	private Action prefernceAction() {
		Action reposettings = new Action() {
			public void run() {
				try {
					//TODO - preference Dialog
				} catch (Exception e) {
					log.error("", e);
				}
			};

			public String getText() {
				return "Application Preferences";
			}
		};
		return reposettings;
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
	
	private Action checkOutAction() {
		Action reposettings = new Action() {
			public void run() {
				try {
                 JgitRepoManager manager = new JgitRepoManager(localRepo, uri);
                 
				} catch (Exception e) {
					log.error("", e);
				}
			};

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
			e.printStackTrace();
		}
	}

	@Override
	public void setFocus() {

	}
	
}