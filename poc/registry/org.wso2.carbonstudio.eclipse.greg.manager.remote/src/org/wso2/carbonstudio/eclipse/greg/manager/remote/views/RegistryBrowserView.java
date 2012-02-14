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

package org.wso2.carbonstudio.eclipse.greg.manager.remote.views;

import java.io.File;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.ActionContributionItem;
import org.eclipse.jface.action.GroupMarker;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.DragSource;
import org.eclipse.swt.dnd.DragSourceEvent;
import org.eclipse.swt.dnd.DragSourceListener;
import org.eclipse.swt.dnd.DropTarget;
import org.eclipse.swt.dnd.DropTargetAdapter;
import org.eclipse.swt.dnd.DropTargetEvent;
import org.eclipse.swt.dnd.TextTransfer;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.IWorkbenchPartReference;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.ViewPart;
import org.wso2.carbon.registry.core.Collection;
import org.wso2.carbon.registry.core.Resource;
import org.wso2.carbon.registry.core.exceptions.RegistryException;
import org.wso2.carbonstudio.eclipse.greg.base.core.Registry;
import org.wso2.carbonstudio.eclipse.greg.base.core.Registry.IResourceUploadListener;
import org.wso2.carbonstudio.eclipse.greg.base.editor.input.ResourceEditorInput;
import org.wso2.carbonstudio.eclipse.greg.base.interfaces.IRegistryAction;
import org.wso2.carbonstudio.eclipse.greg.base.interfaces.IRegistryFormEditorPage;
import org.wso2.carbonstudio.eclipse.greg.base.interfaces.RegistryBrowserTraverseListener;
import org.wso2.carbonstudio.eclipse.greg.base.logger.ExceptionHandler;
import org.wso2.carbonstudio.eclipse.greg.base.managers.RemoteContentManager;
import org.wso2.carbonstudio.eclipse.greg.base.model.RegistryContentContainer;
import org.wso2.carbonstudio.eclipse.greg.base.model.RegistryNode;
import org.wso2.carbonstudio.eclipse.greg.base.model.RegistryResourceNode;
import org.wso2.carbonstudio.eclipse.greg.base.model.RegistryResourceType;
import org.wso2.carbonstudio.eclipse.greg.base.model.RegistryURLNode;
import org.wso2.carbonstudio.eclipse.greg.base.model.RegistryUser;
import org.wso2.carbonstudio.eclipse.greg.base.model.RegistryUserContainer;
import org.wso2.carbonstudio.eclipse.greg.base.model.RegistryUserManagerContainer;
import org.wso2.carbonstudio.eclipse.greg.base.model.RegistryUserRole;
import org.wso2.carbonstudio.eclipse.greg.base.model.RegistryUserRoleContainer;
import org.wso2.carbonstudio.eclipse.greg.base.persistent.RegistryCredentialData;
import org.wso2.carbonstudio.eclipse.greg.base.persistent.RegistryURLInfo;
import org.wso2.carbonstudio.eclipse.greg.base.persistent.RegistryUrlStore;
import org.wso2.carbonstudio.eclipse.greg.base.ui.controls.RegistryTreeViewer;
import org.wso2.carbonstudio.eclipse.greg.base.ui.dialog.RegistryTreeBrowserDialog;
import org.wso2.carbonstudio.eclipse.greg.base.ui.dialog.UserPermissionDialog;
import org.wso2.carbonstudio.eclipse.greg.base.ui.editor.RegistryResourceEditor;
import org.wso2.carbonstudio.eclipse.greg.base.ui.util.ImageUtils;
import org.wso2.carbonstudio.eclipse.greg.base.ui.util.SWTControlUtils;
import org.wso2.carbonstudio.eclipse.greg.core.exception.InvalidRegistryURLException;
import org.wso2.carbonstudio.eclipse.greg.core.exception.UnknownRegistryException;
import org.wso2.carbonstudio.eclipse.greg.manager.remote.Activator;
import org.wso2.carbonstudio.eclipse.greg.manager.remote.dialog.RegistryInfoDialog;
import org.wso2.carbonstudio.eclipse.greg.manager.remote.dragdrop.DragDropUtils;
import org.wso2.carbonstudio.eclipse.greg.manager.remote.dragdrop.Queue;
import org.wso2.carbonstudio.eclipse.greg.manager.remote.utils.Utils;
import org.wso2.carbonstudio.eclipse.greg.manager.remote.utils.Utils.ResourceCounter;
import org.wso2.carbonstudio.eclipse.greg.manager.remote.wizards.AddUserWizard;
import org.wso2.carbonstudio.eclipse.greg.manager.remote.wizards.ChangePermissionWizard;
import org.wso2.carbonstudio.eclipse.logging.core.ICarbonStudioLog;
import org.wso2.carbonstudio.eclipse.logging.core.Logger;
import org.wso2.carbonstudio.eclipse.platform.ui.utils.MessageDialogUtils;
import org.wso2.carbonstudio.eclipse.usermgt.remote.UserManager;

public class RegistryBrowserView extends ViewPart implements Observer {
	private static ICarbonStudioLog log=Logger.getLog(Activator.PLUGIN_ID);

	Action addRegistryAction;
	Action addCollectionAction;
	Action addResourceAction;
	Action deleteAction;
	Action enableAction;
	Action disableAction;
	Action refreshAction;

	Action multipleFileAction;
	Action multipleFolderAction;
	Action metaDataAction;
	Action propertyAction;
	Action associationAction;
	Action lifeCyclesAction;
	Action dependenciesAction;

	Action communityAction;
	Action commentsAction;
	Action ratingsAction;
	Action tagsAction;
	Action linkWithEditorAction;

	Action importFromAction;
	Action exportToAction;

	Action changeRolePermission;
	Action modifyResourcePermission;

	Action addUsers;
	// Action addRoles;
	Action modifyUserInfo;

	IMemento memento;
	private Tree tree;
	private RegistryTreeViewer treeViewer;

	private RegistryURLNode regUrlNode;
	private RegistryNode regNode;
	private RegistryResourceNode regResourceNode;
	private RegistryResourceNode targetRegResourceNode;
	private RegistryUserRole regUserRole;
	private RegistryUserContainer regUserContainer;
	private RegistryUserRoleContainer regRoleContainer;
	private UserManager um;

	private ArrayList<RegistryResourceNode> resourceNodes;
	private ArrayList<RegistryNode> list;
	private Registry registry;

	private String uname;
	private String resourcePath;

	private String pwd;
	private URL serverURL;

	private Composite parentComposite;

	private ExceptionHandler exeptionHandler;

	private Object selectedObj;
	public static RegistryBrowserView LAST_INSTANCE;

	private static RegistryPropertyViewer registryPropertyViewer;
	// private static RegistryTreeViewer registryTreeViewer;

	private MenuManager communitySubMenu;
	private MenuManager metadatMenu;
	private MenuManager multipleResourceUploadMenu;
	private MenuManager versionSubMenu;

	private DragDropUtils dragDropUtils;

	// private String[] children= null;
	// private IViewSite viewSite;

	private ArrayList<String> children;
	private Action resourceInformationAction;
	private Text txtTraverse;
	private ArrayList<Object> selectedItemList;

	private boolean linkedWithEditor;

	public static int CNTRL_KEY_CODE = 262144;
	boolean cntrlKeyPressed;

	private List<String> versionList;
	private RegistryResourceNode selectedEditorRegistryResourcePathData;

	public boolean isCntrlKeyPressed() {
		return cntrlKeyPressed;
	}

	public void setCntrlKeyPressed(boolean cntrlKeyPressed) {
		this.cntrlKeyPressed = cntrlKeyPressed;
	}

	public RegistryBrowserView() {
		super();
		this.regUrlNode = new RegistryURLNode();
		regUrlNode.addObserver(this);
		LAST_INSTANCE = this;
	}

	public void init(IViewSite site) throws PartInitException {
		super.init(site);
	}

	public void init(IViewSite site, IMemento memento) throws PartInitException {
		init(site);
		this.memento = memento;
	}

	public void createPartControl(Composite parent) {
		parentComposite = parent;
		GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 1;
		parent.setLayout(gridLayout);
		createContent(parent);
		getSite().setSelectionProvider(treeViewer);

		createActions(parent);
		updateToolbar();
		createContextMenu();
		loadPreviousRegistryUrls();
	}

	private void loadPreviousRegistryUrls() {
		List<RegistryURLInfo> allRegistryUrls = RegistryUrlStore.getInstance()
				.getAllRegistryUrls();
		for (RegistryURLInfo registryURLInfo : allRegistryUrls) {
			regUrlNode.addRegistry(registryURLInfo, null);
		}
	}

	public void updateToolbar() {
		IToolBarManager mgr;
		mgr = getViewSite().getActionBars().getToolBarManager();
		List<Object> list = new ArrayList<Object>();
		if (selectedItemList == null) {
			list.add(addRegistryAction);
		} else if (selectedItemList.isEmpty()) {
			list.add(addRegistryAction);
		} else if (selectedItemList.size() == 1) {
			if (selectedObj == null) {
				list.add(addRegistryAction);
			} else {
				if(selectedObj instanceof RegistryContentContainer){
					list.add(addRegistryAction);
					list.add(linkWithEditorAction);
//					list.add(deleteAction);
				}else if (selectedObj instanceof RegistryNode) {
					list.add(new GroupMarker(
							IWorkbenchActionConstants.MB_ADDITIONS));
					list.add(new Separator());
					list.add(addRegistryAction);
					list.add(new GroupMarker(
							IWorkbenchActionConstants.MB_ADDITIONS));
					list.add(new Separator());
					if (((RegistryNode) selectedObj).isEnabled()) {
						list.add(disableAction);
						list.add(refreshAction);
//						list.add(linkWithEditorAction);
					} else
						list.add(enableAction);
				} else if (selectedObj instanceof RegistryResourceNode) {
					RegistryResourceNode rrpd = (RegistryResourceNode) selectedObj;
					if (!rrpd.isError()) {
						if (rrpd.getResourceType()==RegistryResourceType.COLLECTION) {
							list.add(new GroupMarker(
									IWorkbenchActionConstants.MB_ADDITIONS));
							list.add(new Separator());
							list.add(addResourceAction);
							list.add(addCollectionAction);
						} else {
						}
						list.add(addRegistryAction);
						list.add(new GroupMarker(
								IWorkbenchActionConstants.MB_ADDITIONS));
						list.add(new Separator());
						list.add(resourceInformationAction);
						list.add(deleteAction);
					}
					list.add(refreshAction);

				} else if (selectedObj instanceof RegistryUserRole) {
					regUserRole = (RegistryUserRole) selectedObj;
					if (!regUserRole.getUserRoleName().equals("admin")) {
						list.add(changeRolePermission);
						list.add(new GroupMarker(
								IWorkbenchActionConstants.MB_ADDITIONS));
						list.add(new Separator());
						
					}
					list.add(deleteAction);
					list.add(refreshAction);
				} else if (selectedObj instanceof RegistryUserContainer) {
					regUserContainer = (RegistryUserContainer) selectedObj;
					list.add(addRegistryAction);
					list.add(addUsers);
					list.add(refreshAction);
				} else if (selectedObj instanceof RegistryUserRoleContainer) {
					regRoleContainer = (RegistryUserRoleContainer) selectedObj;
					regRoleContainer.getRegistryUserManagerContainer().getUserManager();
					list.add(addRegistryAction);
					list.add(refreshAction);
				} else if (selectedObj instanceof RegistryUser) {
					list.add(addRegistryAction);
					list.add(modifyUserInfo);
					list.add(deleteAction);
					list.add(refreshAction);
				}else{
					list.add(addRegistryAction);
				}
			}
		} else if (selectedItemList.size() > 1) {
			list.add(exportToAction);
			list.add(new GroupMarker(IWorkbenchActionConstants.MB_ADDITIONS));
			list.add(new Separator());
			list.add(deleteAction);
			list.add(new GroupMarker(IWorkbenchActionConstants.MB_ADDITIONS));
			list.add(new Separator());
			list.add(refreshAction);
		}
//		list.add(new GroupMarker(IWorkbenchActionConstants.MB_ADDITIONS));
//		list.add(new Separator());
//		list.add(linkWithEditorAction);
		IContributionItem[] actionContributionItems = (IContributionItem[]) mgr
				.getItems();
		List<IAction> list2 = new ArrayList<IAction>();
		for (IContributionItem item : actionContributionItems) {
			if (item instanceof ActionContributionItem)
				list2.add(((ActionContributionItem) item).getAction());
		}
		boolean needRefreshToolbar = false;
		for (IAction action : list2) {
			if (action != null && action instanceof IAction
					&& !list.contains(action)) {
				needRefreshToolbar = true;
				break;
			}
		}
		if (!needRefreshToolbar) {
			for (Object action : list) {
				if (action instanceof IAction && !list2.contains(action)) {
					needRefreshToolbar = true;
					break;
				}
			}
		}
		if (needRefreshToolbar) {
			mgr.removeAll();
			for (Object action : list) {
				if (action instanceof IAction) {
					mgr.add((IAction) action);
				} else if (action instanceof IContributionItem) {
					mgr.add((IContributionItem) action);
				}
			}
		}
		mgr.update(true);
	}

	private void createContextMenu() {
		final MenuManager menuMgr = new MenuManager();
		menuMgr.setRemoveAllWhenShown(true);
		menuMgr.setActionDefinitionId("org.eclipse.menu");
		ImageDescriptor communityImgDes = ImageUtils
				.getImageDescriptor(ImageUtils.ACTION_COMMUNITY_FEATURES);
		communitySubMenu = new MenuManager("Community...", communityImgDes,
				"org.eclipse.community.submenu");
		communitySubMenu.setRemoveAllWhenShown(true);

		communitySubMenu.addMenuListener(new IMenuListener() {

			public void menuAboutToShow(IMenuManager mgr) {
				mgr.add(commentsAction);
				mgr.add(tagsAction);
			}
		});

		ImageDescriptor metadataImgDes = ImageUtils
				.getImageDescriptor(ImageUtils.ACTION_ADD_METADATA);
		metadatMenu = new MenuManager("Metadata..", metadataImgDes,
				"org.eclipse.tools.metadata.submenu");
		metadatMenu.setRemoveAllWhenShown(true);

		metadatMenu.addMenuListener(new IMenuListener() {

			public void menuAboutToShow(IMenuManager menu) {
				menu.add(propertyAction);
				menu.add(dependenciesAction);
				menu.add(associationAction);

			}
		});

		multipleResourceUploadMenu = new MenuManager(
				"Add local resources",
				ImageUtils
						.getImageDescriptor(ImageUtils.ACTION_ADD_RESOURCE_FROM_LOCAL),
				"org.eclipse.tools.multipleresources");
		multipleResourceUploadMenu.setRemoveAllWhenShown(true);

		multipleResourceUploadMenu.addMenuListener(new IMenuListener() {

			public void menuAboutToShow(IMenuManager menu) {
				menu.add(multipleFileAction);
				menu.add(multipleFolderAction);
			}
		});
		menuMgr.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager mgr) {
				menuMgr.removeAll();
				if (selectedItemList == null) {
					mgr.add(addRegistryAction);
				} else if (selectedItemList.isEmpty()) {
					mgr.add(addRegistryAction);
				} else if (selectedItemList.size() == 1) {
					if (selectedObj == null) {
						menuMgr.add(addRegistryAction);
					}else if(selectedObj instanceof RegistryContentContainer){
						mgr.add(linkWithEditorAction);
					} else if (selectedObj instanceof RegistryNode) {
						mgr.add(addRegistryAction);
						mgr.add(deleteAction);
						menuMgr.add(new GroupMarker(
								IWorkbenchActionConstants.MB_ADDITIONS));
						menuMgr.add(new Separator());
						mgr.add(importFromAction);
						mgr.add(exportToAction);
						menuMgr.add(new GroupMarker(
								IWorkbenchActionConstants.MB_ADDITIONS));
						menuMgr.add(new Separator());
						if (((RegistryNode) selectedObj).isEnabled()) {
							menuMgr.add(disableAction);
							menuMgr.add(new GroupMarker(
									IWorkbenchActionConstants.MB_ADDITIONS));
							menuMgr.add(new Separator());
							mgr.add(refreshAction);
							mgr.add(linkWithEditorAction);
						} else
							menuMgr.add(enableAction);
					} else if (selectedObj instanceof RegistryResourceNode) {
						RegistryResourceNode rrpd = (RegistryResourceNode) selectedObj;
						if (!rrpd.isError()) {
							if (rrpd.getResourceType()==RegistryResourceType.COLLECTION) {
								menuMgr.add(addResourceAction);
								menuMgr.add(addCollectionAction);
								menuMgr.add(multipleResourceUploadMenu);
								menuMgr
										.add(new GroupMarker(
												IWorkbenchActionConstants.MB_ADDITIONS));
								menuMgr.add(new Separator());
								mgr.add(importFromAction);

							} else {

								addVersionsSubMenu(rrpd, mgr);
							}
							mgr.add(new GroupMarker(
									IWorkbenchActionConstants.MB_ADDITIONS));
							mgr.add(new Separator());
							mgr.add(modifyResourcePermission);
							mgr.add(new GroupMarker(
									IWorkbenchActionConstants.MB_ADDITIONS));
							mgr.add(new Separator());
							mgr.add(exportToAction);
							menuMgr.add(new GroupMarker(
									IWorkbenchActionConstants.MB_ADDITIONS));
							menuMgr.add(new Separator());
							menuMgr.add(deleteAction);
							menuMgr.add(new GroupMarker(
									IWorkbenchActionConstants.MB_ADDITIONS));
							menuMgr.add(new Separator());
							menuMgr.add(metadatMenu);
							menuMgr.add(communitySubMenu);
							menuMgr.add(resourceInformationAction);
							menuMgr.add(new GroupMarker(
									IWorkbenchActionConstants.MB_ADDITIONS));
							menuMgr.add(new Separator());

						}
						mgr.add(refreshAction);
						menuMgr.update(true);
					} else if (selectedObj instanceof RegistryUserRole) {
						regUserRole = (RegistryUserRole) selectedObj;
						if (!regUserRole.getUserRoleName().equals("admin")) {
							mgr.add(changeRolePermission);
							mgr.add(new GroupMarker(
									IWorkbenchActionConstants.MB_ADDITIONS));
							mgr.add(new Separator());
						}

					} else if (selectedObj instanceof RegistryUserContainer) {
						regUserContainer = (RegistryUserContainer) selectedObj;
						mgr.add(addUsers);
					} else if (selectedObj instanceof RegistryUserRoleContainer) {
						regRoleContainer = (RegistryUserRoleContainer) selectedObj;
					} else if (selectedObj instanceof RegistryUser) {
						mgr.add(modifyUserInfo);
						mgr.add(deleteAction);
					}else{
						
					}
				} else if (selectedItemList.size() > 1) {
					mgr.add(exportToAction);
					mgr.add(new GroupMarker(
							IWorkbenchActionConstants.MB_ADDITIONS));
					mgr.add(new Separator());
					mgr.add(deleteAction);
					mgr.add(new GroupMarker(
							IWorkbenchActionConstants.MB_ADDITIONS));
					mgr.add(new Separator());
					mgr.add(refreshAction);
					mgr.add(new GroupMarker(
							IWorkbenchActionConstants.MB_ADDITIONS));
					mgr.add(new Separator());
				}
				Action[] actionsToAdd = getThirdpartyActions(selectedObj);
				for (Action action : actionsToAdd) {
					mgr.add(action);

				}
//				mgr.add(linkWithEditorAction);
				menuMgr.update(true);
			}

			
		});

		Menu menu = menuMgr.createContextMenu(treeViewer.getControl());
		treeViewer.getControl().setMenu(menu);

		getSite().registerContextMenu(menuMgr, treeViewer);
	}

	private void processPermissions() {
		addResourceAction.setEnabled(true);
		addCollectionAction.setEnabled(true);
		addRegistryAction.setEnabled(true);
		deleteAction.setEnabled(true);
		metaDataAction.setEnabled(true);
		propertyAction.setEnabled(true);
		associationAction.setEnabled(true);
		//lifeCyclesAction.setEnabled(true);
		dependenciesAction.setEnabled(true);
		communityAction.setEnabled(true);
		commentsAction.setEnabled(true);
		ratingsAction.setEnabled(true);
		tagsAction.setEnabled(true);
		importFromAction.setEnabled(true);
		exportToAction.setEnabled(true);
		modifyResourcePermission.setEnabled(true);
		//multipleResourceUploadMenu.setEnabled(true);
		multipleFileAction.setEnabled(true);
		multipleFolderAction.setEnabled(true);
		
		//if (selectedItemList == null) {
		//} else if (selectedItemList.isEmpty()) {
		//} else if (selectedItemList.size() == 1) {
			if (selectedObj == null) {
			} else {
				if(selectedObj instanceof RegistryContentContainer){
					//
				}else if (selectedObj instanceof RegistryNode) {
					//
				} else if (selectedObj instanceof RegistryResourceNode) {
					RegistryResourceNode rrpd = (RegistryResourceNode) selectedObj;
					if (!rrpd.isError()) {
						if (!rrpd.hasWritePermissions()){
							addResourceAction.setEnabled(false);
							addCollectionAction.setEnabled(false);
							addRegistryAction.setEnabled(false);
							deleteAction.setEnabled(false);
							metaDataAction.setEnabled(false);
							propertyAction.setEnabled(false);
							associationAction.setEnabled(false);
							//lifeCyclesAction.setEnabled(false);
							dependenciesAction.setEnabled(false);
							communityAction.setEnabled(false);
							commentsAction.setEnabled(false);
							ratingsAction.setEnabled(false);
							tagsAction.setEnabled(false);
							importFromAction.setEnabled(false);
							exportToAction.setEnabled(false);
							modifyResourcePermission.setEnabled(false);
							//multipleResourceUploadMenu.setEnabled(false);
							multipleFileAction.setEnabled(false);
							multipleFolderAction.setEnabled(false);
						}
					}
				} else if (selectedObj instanceof RegistryUserRole) {
					regUserRole = (RegistryUserRole) selectedObj;
					if (!regUserRole.getUserRoleName().equals("admin")) {

					}
					//
				} else if (selectedObj instanceof RegistryUserContainer) {
					//
				} else if (selectedObj instanceof RegistryUserRoleContainer) {
					//
				} else if (selectedObj instanceof RegistryUser) {
					//
				}else{
					//
				}
			}
		//}
	}
	
	private void addVersionsSubMenu(final RegistryResourceNode resource,
			IMenuManager mgr){
		try {
			versionList = resource.getVersions();

			if (!versionList.isEmpty()) {
				versionSubMenu.setRemoveAllWhenShown(true);
				mgr.add(versionSubMenu);
				versionSubMenu.addMenuListener(new IMenuListener() {
					public void menuAboutToShow(IMenuManager mgr) {
						mgr.removeAll();
						MenuManager versionActionSubMenu;
						int limit = 10;
						if (versionList.size() < 10)
							limit = versionList.size();
						for (int count = 0; count < limit; count++) {

							final String fullVersionName = versionList.get(count);
							String[] versionInfo = versionList.get(count)
									.split(":");
							String versionNumber = versionInfo[versionInfo.length - 1];
							String versionCaption = "";
							try {
								versionCaption = caption(versionNumber, resource);

								versionActionSubMenu = new MenuManager(
										versionCaption,
										ImageUtils
												.getImageDescriptor(ImageUtils.ICON_VERSION),
										"org.eclipse.community.submenu");
								versionActionSubMenu.setRemoveAllWhenShown(true);
								mgr.add(versionActionSubMenu);
								versionActionSubMenu
										.addMenuListener(new IMenuListener() {

											public void menuAboutToShow(
													IMenuManager menu) {
												menu.removeAll();
												menu.add(new VersionViewAction(
														resource, fullVersionName));
												menu.add(new RestoreVersionAction(
														resource, fullVersionName));
											}

										});
							} catch (Exception e) {
								log.error(e);
								MessageDialogUtils.error(getSite().getShell(), e);
							}
						}
					}

				});
			}
		} catch (Exception e) {
			log.error(e);
			MessageDialogUtils.error(getSite().getShell(), e);
		}
	}

	private String caption(String versionNumber,
						   RegistryResourceNode regResource) throws InvalidRegistryURLException, UnknownRegistryException {
		String versionCaption = "";
		Registry registry = regResource.getConnectionInfo().getRegistry();
		String user = registry.get(regResource.getRegistryResourcePath())
														.getLastUpdaterUserName();
		Date date = (registry.get(regResource.getRegistryResourcePath())
														.getLastModified());
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy, hh:mm");
		versionCaption = user + 
						 " - " + 
						 formatter.format(date).toString() +
						 " [" + 
						 versionNumber + 
						 "]";
		return versionCaption;
	}

	private void fillContextMenu(IMenuManager mgr) {
		mgr.add(addRegistryAction);
		mgr.add(addCollectionAction);
		mgr.add(addResourceAction);
		mgr.add(deleteAction);
		mgr.add(communityAction);
		mgr.add(metaDataAction);
	}

	public void createActions(final Composite parent) {
		parentComposite = parent;
		addRegistryAction = new Action("Add Registry...") {
			public void run() {
				addItem(parent);
			}
		};

		addRegistryAction.setImageDescriptor(ImageUtils
				.getImageDescriptor(ImageUtils.ACTION_ADD_REGSISTY));

		refreshAction = new Action("Refresh") {
			public void run() {
				refreshItem();
			}
		};
		refreshAction.setImageDescriptor(ImageUtils
				.getImageDescriptor(ImageUtils.ACTION_REFERESH));

		addCollectionAction = new Action("Add a new Collection..") {

			public void run() {
				RegistryResourceNode r = (RegistryResourceNode) selectedObj;
				ResourceEditorInput ei = RemoteContentManager.getEditorInput(r, true);
				ei.setCollection(true);
				RemoteContentManager.openFormEditor(ei);
			}
		};
		addCollectionAction.setImageDescriptor(ImageUtils
				.getImageDescriptor(ImageUtils.ACTION_ADD_COLLECTION));

		addResourceAction = new Action("Add a new Resource..") {
			public void run() {
				RegistryResourceNode r = (RegistryResourceNode) selectedObj;
				ResourceEditorInput ei = RemoteContentManager.getEditorInput(r, true);
				ei.setCollection(false);
				RemoteContentManager.openFormEditor(ei);
			}
		};
		addResourceAction.setImageDescriptor(ImageUtils
				.getImageDescriptor(ImageUtils.ACTION_ADD_RESOURCE));
		
		deleteAction = new Action("Delete..") {
			public void run() {
				deleteItem(parent);
			}
		};
		deleteAction.setImageDescriptor(ImageUtils
				.getImageDescriptor(ImageUtils.STATE_DELETED));

		communityAction = new Action("Community...") {
			public void run() {

			}
		};
		communityAction.setImageDescriptor(ImageUtils
				.getImageDescriptor(ImageUtils.ACTION_COMMUNITY_FEATURES));

		metaDataAction = new Action("Metadata...") {
			public void run() {
			}
		};
		metaDataAction.setImageDescriptor(ImageUtils
				.getImageDescriptor(ImageUtils.ACTION_ADD_METADATA));

		commentsAction = new Action("Add Comment...") {
			public void run() {
				RegistryResourceNode r = (RegistryResourceNode) selectedObj;
				ResourceEditorInput ei = RemoteContentManager.getEditorInput(r);
				RegistryResourceEditor openFormEditor = RemoteContentManager.openFormEditor(ei);
				openFormEditor.performAction(IRegistryFormEditorPage.PAGE_COMMENTS,
											 IRegistryFormEditorPage.ACTION_ADD_COMMENT, 
											 null);

			}
		};
		commentsAction.setImageDescriptor(ImageUtils
				.getImageDescriptor(ImageUtils.ACTION_ADD_COMMENT));

		tagsAction = new Action("Add a tag...") {
			public void run() {
				RegistryResourceNode r = (RegistryResourceNode) selectedObj;
				ResourceEditorInput ei = RemoteContentManager
						.getEditorInput(r);
				RegistryResourceEditor openFormEditor = RemoteContentManager
						.openFormEditor(ei);
				openFormEditor.performAction(IRegistryFormEditorPage.PAGE_TAGS,
											 IRegistryFormEditorPage.ACTION_ADD_TAGS, 
											 null);

			}
		};
		tagsAction.setImageDescriptor(ImageUtils
				.getImageDescriptor(ImageUtils.ACTION_ADD_TAGS));

		ratingsAction = new Action("Add a Rating...") {
			public void run() {
			}
		};
		ratingsAction.setImageDescriptor(ImageUtils
				.getImageDescriptor(ImageUtils.RATINGS_STAR0));

		propertyAction = new Action("Add a Property...") {
			public void run() {
				RegistryResourceNode r = (RegistryResourceNode) selectedObj;
				ResourceEditorInput ei = RemoteContentManager
						.getEditorInput(r);
				RegistryResourceEditor openFormEditor = RemoteContentManager
						.openFormEditor(ei);
				openFormEditor.performAction(IRegistryFormEditorPage.PAGE_PROPERTIES,
											 IRegistryFormEditorPage.ACTION_ADD_PROPERTY, 
											 null);
			}
		};
		propertyAction.setImageDescriptor(ImageUtils
				.getImageDescriptor(ImageUtils.ACTION_ADD_PROPERTIES));

		lifeCyclesAction = new Action("Add a Lifecycle...") {
			public void run() {
			}
		};
		lifeCyclesAction.setImageDescriptor(ImageUtils
				.getImageDescriptor(ImageUtils.ACTION_ADD_LIFECYCLE));

		dependenciesAction = new Action("Add a Dependency...") {
			public void run() {
				RegistryResourceNode r = (RegistryResourceNode) selectedObj;
				ResourceEditorInput ei = RemoteContentManager
						.getEditorInput(r);
				RegistryResourceEditor openFormEditor = RemoteContentManager
						.openFormEditor(ei);
				openFormEditor.performAction(IRegistryFormEditorPage.PAGE_DEPENDENCY,
											 IRegistryFormEditorPage.ACTION_ADD_DEPENDENCY, 
											 null);
			}
		};
		dependenciesAction.setImageDescriptor(ImageUtils
				.getImageDescriptor(ImageUtils.ACTION_ADD_DEPENDENCY));

		associationAction = new Action("Add an Association...") {
			public void run() {
				RegistryResourceNode r = (RegistryResourceNode) selectedObj;
				ResourceEditorInput ei = RemoteContentManager.getEditorInput(r);
				RegistryResourceEditor openFormEditor = RemoteContentManager.openFormEditor(ei);
				openFormEditor.performAction(IRegistryFormEditorPage.PAGE_ASSOCIATIONS,
						                     IRegistryFormEditorPage.ACTION_ADD_ASSOCIATION, 
						                     null);
			}
		};
		associationAction.setImageDescriptor(ImageUtils
				.getImageDescriptor(ImageUtils.ACTION_ADD_ASSOCIATION));

		enableAction = new Action("Re-Connect") {
			public void run() {
				changeRegistryUrlStatus(true);
			}
		};
		enableAction.setImageDescriptor(ImageUtils
				.getImageDescriptor(ImageUtils.ACTION_RECONNECT_REGISTRY));

		disableAction = new Action("Disconnect...") {
			public void run() {
				changeRegistryUrlStatus(false);
			}
		};
		disableAction.setImageDescriptor(ImageUtils
				.getImageDescriptor(ImageUtils.ACTION_DISCONNECT_REGISTRY));

		multipleFileAction = new Action("multiple files...") {
			public void run() {
				addMultipleFiles();
			}
		};
		multipleFileAction.setImageDescriptor(ImageUtils
				.getImageDescriptor(ImageUtils.ACTION_ADD_MULTIPLE_FILES));

		multipleFolderAction = new Action("folder...") {
			public void run() {
				addMultipleFolders();
			}
		};
		multipleFolderAction.setImageDescriptor(ImageUtils
				.getImageDescriptor(ImageUtils.ACTION_ADD_FOLDER));

		resourceInformationAction = new Action("Information") {
			public void run() {
				RegistryResourceNode r = (RegistryResourceNode) selectedObj;
				ResourceEditorInput ei = RemoteContentManager.getEditorInput(r);
				RegistryResourceEditor openFormEditor = RemoteContentManager.openFormEditor(ei);
				// RemoteContentManager.openFormEditor(ei);
//				RegistryResourceEditor openFormEditor = RemoteContentManager.openFormEditor(ei);
				if(r.getResourceType()==RegistryResourceType.RESOURCE){
					openFormEditor.performAction(IRegistryFormEditorPage.PAGE_RESOURCE,
					                             IRegistryFormEditorPage.ACTION_VIEW_INFORMATION, 
					                             null);
				}else{
					openFormEditor.performAction(IRegistryFormEditorPage.PAGE_COLLECTION,
					                             IRegistryFormEditorPage.ACTION_VIEW_INFORMATION, 
					                             null);
				}
			}
		};
		resourceInformationAction.setImageDescriptor(ImageUtils
				.getImageDescriptor(ImageUtils.ICON_INFORMATION));

		treeViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			public void selectionChanged(SelectionChangedEvent event) {
				updateActionEnablement();
			}

		});

		importFromAction = new Action("Import From") {
			public void run() {
				RegistryTreeBrowserDialog r = new RegistryTreeBrowserDialog(
													Display.getCurrent().getActiveShell(),
													RegistryTreeBrowserDialog.SELECT_REGISTRY_PATH);
				r.create();
				List<RegistryURLInfo> allRegistryUrls = RegistryUrlStore
															.getInstance().getAllRegistryUrls();
				for (RegistryURLInfo registryURLInfo : allRegistryUrls) {
					r.addRegistryNode(registryURLInfo, null);
				}
				r.selectRegistryPath(regResourceNode.getConnectionInfo(),
						regResourceNode.getRegistryResourcePath());
				if (r.open() == Window.OK) {
					targetRegResourceNode = r.getSelectedRegistryResourceNode();
					try {
						importExportResource(targetRegResourceNode,
											 regResourceNode,
											 DragDropUtils.ACTION_IMPORT);
					} catch (Exception e) {
						log.error(e);
					}

				}
			}
		};
		importFromAction.setImageDescriptor(ImageUtils
				.getImageDescriptor(ImageUtils.ACTION_IMPORT_TO_REGISTRY));

		exportToAction = new Action("Export To") {
			public void run() {
				RegistryTreeBrowserDialog r = new RegistryTreeBrowserDialog(
													Display.getCurrent().getActiveShell(),
													RegistryTreeBrowserDialog.SELECT_REGISTRY_PATH);
				r.create();
				List<RegistryURLInfo> allRegistryUrls = RegistryUrlStore
						.getInstance().getAllRegistryUrls();
				for (RegistryURLInfo registryURLInfo : allRegistryUrls) {
					r.addRegistryNode(registryURLInfo, null);
				}
				r.selectRegistryPath(regResourceNode.getConnectionInfo(),
									 regResourceNode.getRegistryResourcePath());
				if (r.open() == Window.OK) {
					targetRegResourceNode = r.getSelectedRegistryResourceNode();
					try {
						for (int i = 0; i < selectedItemList.size(); i++) {
							if (selectedItemList.get(i) instanceof RegistryResourceNode) {
								regResourceNode = (RegistryResourceNode) selectedItemList.get(i);
								importExportResource(regResourceNode,
													 targetRegResourceNode,
													 DragDropUtils.ACTION_EXPORT);

							}
						}
						targetRegResourceNode.refreshChildren();
					} catch (Exception e) {
						log.error(e);
					}

				}
			}
		};
		exportToAction.setImageDescriptor(ImageUtils
				.getImageDescriptor(ImageUtils.ACTION_EXPORT_TO_REGISTRY));
		versionSubMenu = new MenuManager("Versions", 
										 ImageUtils.getImageDescriptor(ImageUtils.ICON_VERSIONS),
										 "org.eclipse.community.submenu");

		changeRolePermission = new Action("Change Permission") {
			public void run() {
				ChangePermissionWizard wizard = new ChangePermissionWizard(
																	regUserRole, 
																	regResourceNode);
				WizardDialog dialog = new WizardDialog(new Shell(), wizard);
				dialog.create();
				dialog.open();

			}
		};
		changeRolePermission.setImageDescriptor(ImageUtils
				.getImageDescriptor(ImageUtils.ACTION_MODIFY_PERMISSION_ROLE));

		modifyResourcePermission = new Action("Modify Permission") {
			public void run() {

				UserPermissionDialog dialog = new UserPermissionDialog(parent.getShell(), 
																	  regResourceNode);
				dialog.setBlockOnOpen(true);
				dialog.create();
				dialog.getShell().setSize(600, 500);
				dialog.open();

			}
		};
		modifyResourcePermission
				.setImageDescriptor(ImageUtils
						.getImageDescriptor(ImageUtils.ACTION_MODIFY_PERMISSION_RESOURCE));

		addUsers = new Action("Add Users") {
			public void run() {
				AddUserWizard wizard = new AddUserWizard(selectedObj, 
														true,
														regNode);
				WizardDialog dialog = new WizardDialog(new Shell(), wizard);
				dialog.create();
				if (dialog.open() == dialog.OK) {
					regUserContainer.setIterativeRefresh(true);
					regUserContainer.getRegistryUserManagerContainer()
							.getUserRoleContent().setIterativeRefresh(true);
					regUserContainer.getRegistryUserManagerContainer()
							.getRegistryData().getRegUrlData().dataChanged(
									false);

				}
			}
		};
		addUsers.setImageDescriptor(ImageUtils
				.getImageDescriptor(ImageUtils.ICON_USERS_ROLES));

		modifyUserInfo = new Action("Modify User Info") {
			public void run() {
				AddUserWizard wizard = new AddUserWizard(selectedObj, 
														false,
														regUrlNode.getUrlInfoList().get(0));
				WizardDialog dialog = new WizardDialog(new Shell(), wizard);
				dialog.create();
				dialog.open();
			}
		};
		modifyUserInfo.setImageDescriptor(ImageUtils
				.getImageDescriptor(ImageUtils.ICON_USERS_ROLES));

		linkWithEditorAction = new Action("Link with Editor",
				IAction.AS_CHECK_BOX) {
			public void run() {
				setLinkedWithEditor(isChecked());
			}
		};
		linkWithEditorAction
				.setImageDescriptor(ImageUtils
						.getImageDescriptor(ImageUtils.ACTION_TOGGLE_SHOW_IN_REGISTRY_VIEW));

	}

	private void updateActionEnablement() {
		IStructuredSelection sel = (IStructuredSelection) treeViewer.getSelection();
	}

	private void addItem(Composite parent) {
		exeptionHandler = new ExceptionHandler();
		RegistryInfoDialog dialog = new RegistryInfoDialog(parent.getShell(),
														   regUrlNode);
		dialog.setBlockOnOpen(true);

		dialog.create();
		dialog.getShell().setSize(600, 250);
		int statuse = dialog.open();
		if (statuse == dialog.OK) {
			URI pathUri = null;
			try {
				pathUri = new URI(dialog.getServerUrl());
				serverURL = pathUri.toURL();
			} catch (URISyntaxException e) {
				exeptionHandler.showMessage(parent.getShell(),
											"Cannot establish the connection with given URL");
			} catch (MalformedURLException e) {
				exeptionHandler.showMessage(parent.getShell(),
											"Cannot establish the connection with given URL");
			}

			uname = dialog.getUserName();
			pwd = dialog.getPasswd();
			String path = dialog.getPath();
			if (dialog.isSavePassword()) {
				RegistryCredentialData.getInstance().setCredentials(serverURL.toString(), 
																	uname, 
																	pwd);
			}
			regUrlNode.addRegistry(RegistryUrlStore.getInstance().addRegistryUrl(serverURL, 
																				 uname, 
																				 path), 
																				 pwd);

			setUname(uname);
			setPwd(pwd);
			setServerURL(serverURL);
		}

	}

	private void refreshItem() {
		for (int i = 0; i < selectedItemList.size(); i++) {
			Object selectedObj = selectedItemList.get(i);
			if (selectedObj instanceof RegistryNode) {
				((RegistryNode) selectedObj).setIterativeRefresh(true);
			} else if (selectedObj instanceof RegistryContentContainer) {
				((RegistryContentContainer) selectedObj).setIterativeRefresh(true);
			} else if (selectedObj instanceof RegistryResourceNode) {
				((RegistryResourceNode) selectedObj).setIterativeRefresh(true);
			} else if (selectedObj instanceof RegistryUserContainer) {
				((RegistryUserContainer) selectedObj).setIterativeRefresh(true);
			} else if (selectedObj instanceof RegistryUserRoleContainer) {
				((RegistryUserRoleContainer) selectedObj).setIterativeRefresh(true);
			}
		}
		regUrlNode.dataChanged(false);
	}

	public void deleteItem(Composite parent) {
		if (MessageDialog.openQuestion(parent.getShell(), 
									  "Delete Item",
									  "Are you sure you want to delete the item ?")) {
			try {

				for (int i = 0; i < selectedItemList.size(); i++) {
					selectedObj = selectedItemList.get(i);
					if (selectedObj instanceof RegistryNode) {
						regUrlNode.getUrlInfoList().remove(regNode);
						RegistryUrlStore.getInstance().removeRegistryUrl(
															regNode.getRegistryUrlInfo());
					} else if (selectedObj instanceof RegistryResourceNode) {
						regResourceNode = (RegistryResourceNode) selectedObj;
						registry = regResourceNode.getConnectionInfo().getRegistry();

						String selectedPath = regResourceNode.getRegistryResourcePath();
						SWTControlUtils.closeAssociatedEditor(regResourceNode.getEditorInput());
						registry.delete(selectedPath);

						if (regResourceNode.getRegistryResourceNodeParent() == null){
							refreshItem();
						}else {
							regResourceNode.getRegistryResourceNodeParent().refreshChildren();

						}
						
					} else if (selectedObj instanceof RegistryUser) {
						RegistryUser user = (RegistryUser) selectedObj;
						um = regUrlNode.getUrlInfoList().get(0)
													.getUserManagerContent().getUserManager();
						um.deleteUSer(user.getUserName());
						user.changed();

					} else if (selectedObj instanceof RegistryUserRole) {

					}
				}
				regUrlNode.dataChanged(false);

			} catch (Exception e) {
				MessageDialogUtils.error(parent.getShell(),
										"Error while deleting resource: " + 
										e.getMessage(),e);
				log.error(e);
			}

		}
	}

	public void setFocus() {

	}

	public void importToRegistry(final RegistryResourceNode selectedPathData,
								final RegistryResourceNode targetRegPathData) 
								throws Exception {

		dragDropUtils = new DragDropUtils();
		Queue queue = dragDropUtils.retrieveContentsFromRegistry(
				targetRegPathData.getRegistryResourcePath(), selectedPathData);
		registry = selectedPathData.getConnectionInfo().getRegistry();
		int initialCount = queue.count();
		children = new ArrayList<String>();
		for (int i = 0; i < initialCount; i++) {
			Object element = queue.remove();
			if (element instanceof Collection) {
				String[] elements = ((Collection) element).getChildren();
				for (int j = 0; j < elements.length; j++) {
					children.add(elements[j]);
				}

			} else if (element instanceof Resource) {
				children.add(((Resource) element).getId());
			}
		}

		if (MessageDialog.openConfirm(Display.getCurrent().getActiveShell(),
									  "Continue import-export...", 
									  targetRegPathData.getRegistryResourcePath() + 
									  " will be imported to " + 
									  selectedPathData.getCaption() + 
									  ". Continue?")) {
			try {
				new ProgressMonitorDialog(getSite().getShell()).run(true, 
																	true,
																	new IRunnableWithProgress() {

							public void run(IProgressMonitor monitor) throws InvocationTargetException,
																			 InterruptedException {
								List<String> list;
								try {
									monitor.beginTask("Import-Export resources...",
													   children.size() +
													   1);
									Registry fromRegistry = selectedPathData.
																  getConnectionInfo().getRegistry();
									Registry toRegistry = targetRegPathData
																.getConnectionInfo().getRegistry();
									list = new ArrayList<String>();
									list.add(selectedPathData.getRegistryResourcePath());
									while (list.size() != 0) {
										String path = list.get(0);
										Resource resource = fromRegistry.get(path);
										if (resource instanceof Collection) {
											String[] children = ((Collection) resource).getChildren();
											for (String child : children) {
												list.add(child);
											}
										}
										String destinationPath = targetRegPathData.getRegistryResourcePath() + 
																"/" + 
																path.substring(selectedPathData
																				.getRegistryResourceNodeParent()
																				.getRegistryResourcePath()
																				.length());
										toRegistry.put(destinationPath,resource);
										list.remove(0);
										monitor.worked(1);
									}
									monitor.setTaskName("Refreshing tree...");
									monitor.worked(1);

									try {
										targetRegPathData.refreshChildren();
										Display.getDefault().asyncExec(
												new Runnable() {

													public void run() {
														targetRegPathData
																.getConnectionInfo()
																.getRegUrlData()
																.refreshViewer(
																		false);
													}

												});
										monitor.worked(1);
									} catch (Exception e) {
										log.error(e);
									}
								} catch (Exception e) {
									log.error(e);
								}
								monitor.done();
							}

						});
			} catch (InvocationTargetException e) {
				log.error(e);
			} catch (InterruptedException e) {
				log.error(e);
			}

		}
	}

	public void importExportResource(final RegistryResourceNode selectedPathData,
									 final RegistryResourceNode targetPathData, 
									 final String action)
									 throws Exception {
		dragDropUtils = new DragDropUtils();
		Queue queue = dragDropUtils.retrieveContentsFromRegistry(
												selectedPathData.getRegistryResourcePath(),
												selectedPathData);
		registry = selectedPathData.getConnectionInfo().getRegistry();
		int initialCount = queue.count();
		children = new ArrayList<String>();
		for (int i = 0; i < initialCount; i++) {
			Object element = queue.remove();
			if (element instanceof Collection) {
				String[] elements = ((Collection) element).getChildren();
				String temp = ((Collection) element).getId();
				if(!children.contains(temp)){
					children.add(temp);
				}
				
				for (int j = 0; j < elements.length; j++) {
					if(!elements[j].equals(temp) && !children.contains(elements[j])){
						children.add(elements[j]);
					}
				}

			} else if (element instanceof Resource) {
				String temp = ((Resource) element).getId();
				if(!children.contains(temp)){
					children.add(((Resource) element).getId());
				}
				
			}
		}

		if (MessageDialog.openConfirm(Display.getCurrent().getActiveShell(),
				"Continue import-export...", selectedPathData
						.getRegistryResourcePath()
						+ " will be "
						+ action
						+ "ed to "
						+ targetPathData.getRegistryResourcePath()
						+ ". Continue?")) {
			try {
				new ProgressMonitorDialog(getSite().getShell()).run(true, true,
						new IRunnableWithProgress() {

							public void run(IProgressMonitor monitor)
									throws InvocationTargetException,
									InterruptedException {
								List<String> list;
								try {
									monitor.beginTask(
											"Import-Export resources...",
											children.size() + 1);
									Registry fromRegistry = selectedPathData
											.getConnectionInfo().getRegistry();
									Registry toRegistry = targetPathData
											.getConnectionInfo().getRegistry();
									
//									String destinationPath = targetPathData.getRegistryResourcePath() + "/" + selectedPathData.getLastSegmentInPath();
									
									String destinationPath="";
									if(targetPathData.getRegistryResourcePath().equals("/")){
										destinationPath = targetPathData.getRegistryResourcePath() + selectedPathData.getLastSegmentInPath();
									}else{
										destinationPath= targetPathData.getRegistryResourcePath() + "/" + selectedPathData.getLastSegmentInPath();
									}
									
							        StringWriter writer = new StringWriter();
							        fromRegistry.dump(selectedPathData.getRegistryResourcePath(), writer);
							        
							        Reader input = new StringReader(writer.toString());
							        toRegistry.restore(destinationPath, input);
							        monitor.worked(1);
									monitor.setTaskName("Refreshing tree...");
									monitor.worked(1);

									try {
										targetPathData.refreshChildren();
										Display.getDefault().asyncExec(
												new Runnable() {

													public void run() {
														if (action
																.equals(DragDropUtils.ACTION_EXPORT)) {
															selectedPathData
																	.getConnectionInfo()
																	.getRegUrlData()
																	.refreshViewer(
																			false);
														} else if (action
																.equals(DragDropUtils.ACTION_IMPORT)) {
															targetPathData
																	.getConnectionInfo()
																	.getRegUrlData()
																	.refreshViewer(
																			false);
														}
													}

												});
										monitor.worked(1);
									} catch (Exception e) {
										log.error(e);
									}
								} catch (Exception e) {
									log.error(e);
								}
								monitor.done();
							}

						});
			} catch (InvocationTargetException e) {
				log.error(e);
			} catch (InterruptedException e) {
				log.error(e);
			}

		}

	}

	public void dropRegistry(final RegistryResourceNode selectedPathData,
			final RegistryResourceNode targetPathData) throws Exception {

		dragDropUtils = new DragDropUtils();

		Queue queue = dragDropUtils.retrieveContentsFromRegistry(
				selectedPathData.getRegistryResourcePath(), selectedPathData);
		int initialCount = queue.count();
		children = new ArrayList<String>();
		for (int i = 0; i < initialCount; i++) {
			Object element = queue.remove();
			if (element instanceof Collection) {
				String[] elements = ((Collection) element).getChildren();
				for (int j = 0; j < elements.length; j++) {
					children.add(elements[j]);
				}

			} else if (element instanceof Resource) {
				children.add(((Resource) element).getId());
			}
		}

		if (MessageDialog.openConfirm(Display.getCurrent().getActiveShell(),
				"Continue drag-drop...", selectedPathData
						.getRegistryResourcePath()
						+ " will be copied to "
						+ targetPathData.getRegistryResourcePath()
						+ ". Continue?")) {
			try {
				new ProgressMonitorDialog(getSite().getShell()).run(true, true,
						new IRunnableWithProgress() {

							public void run(IProgressMonitor monitor)
									throws InvocationTargetException,
									InterruptedException {
								List<String> list;
								try {
									monitor.beginTask("Drag-Drop resources...",
											children.size() + 1);
									Registry fromRegistry = selectedPathData
											.getConnectionInfo().getRegistry();
									Registry toRegistry = targetPathData
											.getConnectionInfo().getRegistry();
									
//									String path = targetPathData.getRegistryResourcePath()+ "/"
//													+ regResourcePathData.getRegistryResourcePath();
									String destinationPath="";
									if(targetPathData.getRegistryResourcePath().equals("/")){
										destinationPath = targetPathData.getRegistryResourcePath()  + selectedPathData.getLastSegmentInPath();
									}else{
										destinationPath= targetPathData.getRegistryResourcePath() + "/" + selectedPathData.getLastSegmentInPath();
									}
//									destinationPath = path + "/" + selectedPathData.getLastSegmentInPath();
									
							        StringWriter writer = new StringWriter();
							        fromRegistry.dump(selectedPathData.getRegistryResourcePath(), writer);
							        
							        Reader input = new StringReader(writer.toString());
							        toRegistry.restore(destinationPath, input);

									monitor.setTaskName("Refreshing tree...");
									monitor.worked(1);

									try {
										targetPathData.refreshChildren();
										Display.getDefault().asyncExec(
												new Runnable() {

													public void run() {
														selectedPathData
																.getConnectionInfo()
																.getRegUrlData()
																.refreshViewer(
																		false);
													}

												});
										monitor.worked(1);
									} catch (Exception e) {
										log.error(e);
									}
								} catch (Exception e) {
									log.error(e);
								}
								monitor.done();
							}

						});
			} catch (InvocationTargetException e) {
				log.error(e);
			} catch (InterruptedException e) {
				log.error(e);
			}

		}
	}

	protected Control createContent(final Composite parent) {
		exeptionHandler = new ExceptionHandler();
		txtTraverse = new Text(parent, SWT.SINGLE | SWT.BORDER);
		txtTraverse.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		selectedItemList = new ArrayList<Object>();
		txtTraverse.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent arg0) {
				setTraversePathChanged(true);

			}

		});
		txtTraverse.setEnabled(false);

		getSite().getShell().getDisplay().timerExec(chkTraverseDelay,
				new TextContributionItem());

		treeViewer = new RegistryTreeViewer(parent, SWT.MULTI | SWT.H_SCROLL
				| SWT.V_SCROLL | SWT.BORDER, exeptionHandler,true,true);
		tree = treeViewer.getTree();
		GridData data = new GridData(GridData.FILL_BOTH);
		data.widthHint = 450;
		data.heightHint = 250;
		tree.setLayoutData(data);
		// add drag capability
		int operations = DND.DROP_MOVE | DND.DROP_COPY;
		DragSource source = new DragSource(tree, operations);
		Transfer[] types = new Transfer[] { TextTransfer.getInstance() };

		// Transfer[] types = new Transfer[] {TextTransfer.getInstance()};
		source.setTransfer(types);

		source.addDragListener(new DragSourceListener() {

			public void dragFinished(DragSourceEvent event) {
			}

			public void dragSetData(DragSourceEvent event) {
				event.data = tree.getSelection()[0].getText();
			}

			public void dragStart(DragSourceEvent arg0) {
			}

		});

		DropTarget dt = new DropTarget(tree, DND.DROP_MOVE);
		dt.setTransfer(new Transfer[] { TextTransfer.getInstance() });

		dt.addDropListener(new DropTargetAdapter() {
			public void drop(DropTargetEvent event) {
				RegistryResourceNode targetRegPathData = (RegistryResourceNode) event.item
						.getData();
				for (int i = 0; i < selectedItemList.size(); i++) {
					regResourceNode = (RegistryResourceNode) selectedItemList
							.get(i);
					registry = regResourceNode.getConnectionInfo()
							.getRegistry();
					String path = targetRegPathData.getRegistryResourcePath()
							+ "/"
							+ regResourceNode.getRegistryResourcePath();
					try {
						dropRegistry(regResourceNode, targetRegPathData);
					} catch (MalformedURLException e1) {
						e1.printStackTrace();
					} catch (RegistryException e1) {
						e1.printStackTrace();
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					} catch (Exception e) {
						log.error(e);
					}
				}
			}
		});

		tree.addKeyListener(new KeyListener() {

			public void keyReleased(KeyEvent arg0) {
			}

			public void keyPressed(KeyEvent event) {
				if (event.keyCode == CNTRL_KEY_CODE) {
					setCntrlKeyPressed(true);
				}
			}
		});

		tree.addSelectionListener(new SelectionListener() {

			public void widgetSelected(SelectionEvent event) {

				Object obj = event.item.getData();
				if (isCntrlKeyPressed()) {
					setCntrlKeyPressed(false);
					if (!selectedItemList.contains(obj)) {
						selectedItemList.add(obj);
					}
				} else {
					selectedItemList = new ArrayList<Object>();
					selectedItemList.add(obj);
				}
				processPermissions();
				updateToolbar();
			}

			public void widgetDefaultSelected(SelectionEvent arg0) {

			}
		});

		treeViewer.addDoubleClickListener(new IDoubleClickListener() {

			public void doubleClick(DoubleClickEvent event) {

				Object obj = event.getSelection();
				if (obj instanceof TreeSelection) {
					Object object = ((TreeSelection) obj).getFirstElement();
					if (object instanceof RegistryResourceNode) {
						final RegistryResourceNode resourcePathObj = (RegistryResourceNode) object;
						registry = resourcePathObj.getConnectionInfo()
								.getRegistry();
						String path = resourcePathObj.getRegistryResourcePath();
						if (resourcePathObj.getResourceType()==RegistryResourceType.RESOURCE) {
							try {
								File tempFile = resourcePathObj.getFile();
//								if(!tempFile.exists()){
//									tempFile.createNewFile();
//								}
								IEditorPart editor = RemoteContentManager
										.openFile(tempFile);
								if (resourcePathObj.getFileEditor() != editor) {
									editor.getSite().getPage().addPartListener(
											new RegistryContentPartListener(
													resourcePathObj, editor));
								}

								resourcePathObj.setFileEditor(editor);
							} catch (Exception e) {
								exeptionHandler
										.showMessage(parent.getShell(),
												"Could not open the file type in the editor");
							}

						} else {

						}
						if (getRegistryPropertyViewer() != null) {
							getRegistryPropertyViewer()
									.setRegistryResourcePathData(
											regResourceNode);
							try {
								getRegistryPropertyViewer().updateMe();
							} catch (Exception e) {
								log.error(e);
							}
						}
					}

				} else {

				}

			}
		});

		treeViewer.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				Object obj = event.getSelection();
				if (obj instanceof TreeSelection) {
					Object object = ((TreeSelection) obj).getFirstElement();
					selectedObj = object;
					if (!(selectedItemList.contains(selectedObj))) {
						selectedItemList.add(selectedObj);
					}
					txtTraverse.setEnabled(true);
					if (object instanceof RegistryNode) {
						deleteAction
								.setImageDescriptor(ImageUtils
										.getImageDescriptor(ImageUtils.ACTION_DELETE_REGISTRY));
						regNode = (RegistryNode) object;
						regResourceNode = regNode.getRegistryContent()
								.getRegistryContent().get(0);
						resourcePath = regResourceNode
								.getRegistryResourcePath();
						if (resourceNodes != null) {
							if (resourceNodes.isEmpty()) {
								resourceNodes.add(regResourceNode);
							}
						}
						// resourcePathList.add(regResourcePathData);
						// regResourcePathData.setResourcePathList(resourcePathList);
						setResourcePath(resourcePath);
						setRegData(regNode);
						setRegResourcePathData(regResourceNode);

					} else if (object instanceof RegistryResourceNode) {
						regResourceNode = (RegistryResourceNode) object;
						resourcePath = regResourceNode
								.getRegistryResourcePath();
						if (resourceNodes != null) {
							if (resourceNodes.isEmpty()) {
								try {
									resourceNodes = regResourceNode
											.getResourceNodeList();
								} catch (Exception e) {
									regResourceNode.setError(true);
									exeptionHandler
											.showMessage(parent.getShell(),
													"Cannot establish the connection with given URL");
								}
							}
						}

						if (regResourceNode.getResourceType()==RegistryResourceType.RESOURCE) {
							deleteAction
									.setImageDescriptor(ImageUtils
											.getImageDescriptor(ImageUtils.ACTION_DELETE_RESOURCE));

							try {
								resourceNodes = regResourceNode
										.getResourceNodeList();
							} catch (Exception e) {
								regResourceNode.setError(true);
								exeptionHandler
										.showMessage(parent.getShell(),
												"Cannot establish the connection with given URL");
							}
						} else {
							deleteAction
									.setImageDescriptor(ImageUtils
											.getImageDescriptor(ImageUtils.ACTION_DELETE_COLLECTION));
						}
						if (resourceNodes == null)
							resourceNodes = new ArrayList<RegistryResourceNode>();
						if (resourceNodes.isEmpty()) {
							resourceNodes.add(regResourceNode);
						}
						setResourcePath(resourcePath);
						setRegResourcePathData(regResourceNode);
					} else if (object instanceof RegistryUserRole) {
						selectedObj = object;
					} else if (object instanceof RegistryUser) {
						selectedObj = object;
					} else if (object instanceof RegistryUserManagerContainer) {
						selectedObj = object;
					} else if (object instanceof RegistryUserContainer) {
						selectedObj = object;
					} else if (object instanceof RegistryUserRoleContainer) {
						selectedObj = object;
					} else if (object instanceof RegistryContentContainer){
						selectedObj = object;
					}else{
						selectedObj = null;
						selectedItemList = new ArrayList<Object>();
						txtTraverse.setEnabled(false);
					}
				}

			}
		});

		treeViewer.setInput(regUrlNode);

		return tree;

	}

	public void update(Observable o, Object arg) {
		if (o instanceof RegistryBrowserTraverseListener) {
			RegistryBrowserTraverseListener r = (RegistryBrowserTraverseListener) o;
			traverseRegistryBrowser(r.getUrl(), r.getPath());
		} else
			treeViewer.refresh(regUrlNode.isRefreshExisting());
	}

	public void traverseRegistryBrowser(String url, String path) {
		List<RegistryNode> urlInfoList = regUrlNode.getUrlInfoList();
		RegistryNode correctRegistryData = null;
		for (RegistryNode registryData : urlInfoList) {
			if (registryData.getUrl().toString().equals(url) && path.startsWith(registryData.getRegistryStartingPath())) {
				correctRegistryData = registryData;
				break;
			}
		}
		if (correctRegistryData == null) {
			try {
				RegistryURLInfo registryUrlInfo = new RegistryURLInfo();
				;
				registryUrlInfo.setPersist(false);
				registryUrlInfo.setUrl(new URL(url));
				registryUrlInfo.setPath("/");
				correctRegistryData = regUrlNode.addRegistry(registryUrlInfo,
						null);
			} catch (MalformedURLException e) {
				log.error(e);
			}

		}
		selectTreeViewerPath(correctRegistryData, path);
	}
	
	public void removeRegistryNode(String url, String path){
		List<RegistryNode> urlInfoList = regUrlNode.getUrlInfoList();
		RegistryNode correctRegistryData = null;
		for (RegistryNode registryData : urlInfoList) {
			if (registryData.getUrl().toString().equals(url) && path.startsWith(registryData.getRegistryStartingPath())) {
				correctRegistryData = registryData;
				break;
			}
		}
//		if (correctRegistryData == null) {
//			try {
//				RegistryURLInfo registryUrlInfo = new RegistryURLInfo();
//				;
//				registryUrlInfo.setPersist(false);
//				registryUrlInfo.setUrl(new URL(url));
//				registryUrlInfo.setPath("/");
//				correctRegistryData = regUrlData.addRegistry(registryUrlInfo,
//						null);
//			} catch (MalformedURLException e) {
//				log.error(e);
//			}
//
//		}
		regUrlNode.removeRegistry(correctRegistryData);
	}

	public void traverseRegistryBrowser(
			RegistryResourceNode registryResourcePathData) {
		selectTreeViewerPath(registryResourcePathData.getConnectionInfo(),
				registryResourcePathData.getRegistryResourcePath());
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public URL getServerURL() {
		return serverURL;
	}

	public void setServerURL(URL serverURL) {
		this.serverURL = serverURL;
	}

	public String getResourcePath() {
		return resourcePath;
	}

	public void setResourcePath(String resourcePath) {
		this.resourcePath = resourcePath;
	}

	public String getUname() {
		return uname;
	}

	public RegistryURLNode getRegUrlData() {
		return regUrlNode;
	}

	public void setRegUrlData(RegistryURLNode regUrlData) {
		this.regUrlNode = regUrlData;
	}

	public RegistryNode getRegData() {
		return regNode;
	}

	public void setRegData(RegistryNode regData) {
		this.regNode = regData;
	}

	public RegistryResourceNode getRegResourcePathData() {
		return regResourceNode;
	}

	public void setRegResourcePathData(
			RegistryResourceNode regResourcePathData) {
		this.regResourceNode = regResourcePathData;
	}

	public static void setRegistryPropertyViewer(
			RegistryPropertyViewer existingRegistryPropertyViewer) {
		registryPropertyViewer = existingRegistryPropertyViewer;
	}

	public static RegistryPropertyViewer getRegistryPropertyViewer() {
		return registryPropertyViewer;
	}

	private void changeRegistryUrlStatus(boolean enabled) {
		if (selectedObj instanceof RegistryNode) {
			RegistryNode regData = (RegistryNode) selectedObj;
			regData.setEnabled(enabled);
			regData.getRegUrlData().refreshViewer(true);
			updateToolbar();
		}
	}

	public class TextContributionItem implements Runnable {
		public void run() {
			if (isTraversePathChanged()) {
				if (elapsedTime > 600) {
					if (regNode == null)
						regNode = regUrlNode.getUrlInfoList().get(0);
					String txt = getTraversePath();
					treeViewer.expandTree(regNode, txt);
					txtTraverse.setFocus();
					setTraversePathChanged(false);
					elapsedTime = 0;
				} else
					elapsedTime += chkTraverseDelay;

			}
			if (getSite().getShell() != null)
				getSite().getShell().getDisplay().timerExec(chkTraverseDelay,
						this);
		}
	}

	private boolean traversePathChanged;
	private int chkTraverseDelay = 100;
	private int elapsedTime = 0;

	public String getTraversePath() {
		return txtTraverse.getText() == null ? "" : txtTraverse.getText();// .substring(0,
	}

	public void setTraversePathChanged(boolean traversePathChanged) {
		this.traversePathChanged = traversePathChanged;
		elapsedTime = 0;
	}

	public boolean isTraversePathChanged() {
		return traversePathChanged;
	}

	public void addMultipleFiles() {
		if (selectedObj instanceof RegistryResourceNode) {
			final RegistryResourceNode r = (RegistryResourceNode) selectedObj;
			if ((r.getResourceType()==RegistryResourceType.COLLECTION) && !r.isError()) {
				final FileDialog fileDialog = new FileDialog(Display
						.getCurrent().getActiveShell(), SWT.MULTI);
				fileDialog
						.setText("Select files to be uploaded to the registry");
				if (fileDialog.open() != null) {

					final String[] fileNames = fileDialog.getFileNames();

					if (MessageDialog.openConfirm(Display.getCurrent()
							.getActiveShell(), "Continue uploading...",
							fileNames.length
									+ " file(s) will be uploaded. Continue?")) {
						try {
							new ProgressMonitorDialog(getSite().getShell())
									.run(true, true,
											new IRunnableWithProgress() {

												public void run(
														IProgressMonitor monitor)
														throws InvocationTargetException,
														InterruptedException {

													monitor
															.beginTask(
																	"Uploading resources...",
																	fileNames.length + 1);
													monitor.worked(0);
													int count = 0;
													for (String fileName : fileNames) {
														monitor
																.setTaskName("Uploading "
																		+ fileName
																		+ "...");
														try {
															File file = new File(
																	fileDialog
																			.getFilterPath(),
																	fileName);
															if (file.exists()) {
																r.getConnectionInfo().getRegistry().addFileToRegistry(file,r.getRegistryResourcePath(),null);
															}
															monitor.worked(1);
														} catch (Exception e) {
															log.error(e);
														}
														if (monitor
																.isCanceled())
															break;
													}
													monitor
															.setTaskName("Refreshing tree...");
													monitor.worked(1);
													try {
														r.refreshChildren();
														monitor.worked(++count);
														Display
																.getDefault()
																.asyncExec(
																		new Runnable() {

																			public void run() {
																				r
																						.getConnectionInfo()
																						.getRegUrlData()
																						.refreshViewer(
																								false);
																			}

																		});
														monitor.worked(1);
													} catch (Exception e) {
														log.error(e);
													}
													monitor.done();
												}

											});
						} catch (InvocationTargetException e) {
							log.error(e);
						} catch (InterruptedException e) {
							log.error(e);
						}

					}
				}
			}
		}
	}

	public void addMultipleFolders() {
		if (selectedObj instanceof RegistryResourceNode) {
			final RegistryResourceNode r = (RegistryResourceNode) selectedObj;
			if ((r.getResourceType()==RegistryResourceType.COLLECTION) && !r.isError()) {
				final DirectoryDialog folderDialog = new DirectoryDialog(
						Display.getCurrent().getActiveShell(), SWT.MULTI);
				folderDialog
						.setText("Select files to be uploaded to the registry");
				if (folderDialog.open() != null) {
					Integer folderCount = 0;
					Integer fileCount = 0;
					final File folderToBeUploaded = new File(folderDialog
							.getFilterPath());
					final ResourceCounter resourceCounter = new ResourceCounter();
					Utils.getFolderFileCount(folderToBeUploaded,
							resourceCounter);

					if (MessageDialog.openConfirm(Display.getCurrent()
							.getActiveShell(), "Continue uploading...",
							resourceCounter.folderCount + " folder(s) and "
									+ resourceCounter.fileCount
									+ " file(s) will be uploaded. Continue?")) {
						try {
							new ProgressMonitorDialog(getSite().getShell()).run(true, true,
								new IRunnableWithProgress() {
									int count = 0;

									public void run(
											final IProgressMonitor monitor)
											throws InvocationTargetException,
											InterruptedException {
										monitor.beginTask("Uploading resources",
														resourceCounter.fileCount + 1);
										IResourceUploadListener resourceUploadListner = new IResourceUploadListener() {
											public void uploadFileDone(File file) {
												Display.getDefault().asyncExec(new Runnable() {
													public void run() {
													}
												});
											}
											public void uploadFileStarting(final File file) {
												Display.getDefault().asyncExec(new Runnable() {
													public void run() {
														monitor.setTaskName("Uploading " + file.getName()+ "...");
														monitor.worked(1);
													}
												});
											}
										};
										try {
											if (folderToBeUploaded.exists()) {
												r.getConnectionInfo().getRegistry().addFolderToRegistry(folderToBeUploaded,r.getRegistryResourcePath(),null,resourceUploadListner);
											}
										} catch (Exception e) {
											log.error(e);
										}
										monitor.worked(1);
										monitor.setTaskName("Refreshing tree...");
										monitor.worked(1);
										try {
											r.refreshChildren();
											monitor.worked(1);
											Display.getDefault().asyncExec(new Runnable() {
												public void run() {
													r.getConnectionInfo().getRegUrlData().refreshViewer(false);
												}
											});
											monitor.worked(1);
										} catch (Exception e) {
											log.error(e);
										}
										monitor.done();
									}
								});
						} catch (InvocationTargetException e) {
							log.error(e);
						} catch (InterruptedException e) {
							log.error(e);
						}

					}
				}
			}
		}
	}

	private Action[] getThirdpartyActions(Object obj) {
		if (thirdPartyActions == null) {
			thirdPartyActions = new ArrayList<IRegistryAction>();
			IExtensionRegistry reg = Platform.getExtensionRegistry();
			IConfigurationElement[] extensions = reg
					.getConfigurationElementsFor("org.wso2.carbonstudio.eclipse.greg.viewer.action");
			for (int i = 0; i < extensions.length; i++) {
				IConfigurationElement element = extensions[i];
				IRegistryAction r;
				try {
					r = (IRegistryAction) element
							.createExecutableExtension("class");
					thirdPartyActions.add(r);
				} catch (CoreException e) {
					log.error(e);
				}
			}
		}
		List<Action> releventActions = new ArrayList<Action>();
		for (IRegistryAction r : thirdPartyActions) {
			if (r.isVisible(obj))
				releventActions.add(r.createAction(getSite().getShell(), obj));
		}
		return releventActions.toArray(new Action[] {});
	}

	public void setLinkedWithEditor(boolean linkedWithEditor) {
		this.linkedWithEditor = linkedWithEditor;
	}

	public boolean isLinkedWithEditor() {
		return linkedWithEditor;
	}

	public void setSelectedEditorRegistryResourcePathData(
			RegistryResourceNode selectedEditorRegistryResourcePathData) {
		this.selectedEditorRegistryResourcePathData = selectedEditorRegistryResourcePathData;
	}

	public RegistryResourceNode getSelectedEditorRegistryResourcePathData() {
		return selectedEditorRegistryResourcePathData;
	}

	private void selectTreeViewerPath(RegistryNode registryData, String path) {
		treeViewer.expandTree(registryData, path);
	}

	private List<IRegistryAction> thirdPartyActions;

	public class VersionViewAction extends Action {

		RegistryResourceNode registryResourcePathData;
		String verstionPath;

		public VersionViewAction(
				RegistryResourceNode registryResourcePathData,
				String verstionPath) {
			this("View", registryResourcePathData, verstionPath);
		}

		public VersionViewAction(String caption,
				RegistryResourceNode registryResourcePathData,
				String verstionPath) {
			super(caption);
			this.registryResourcePathData = registryResourcePathData;
			this.verstionPath = verstionPath;
			setImageDescriptor(ImageUtils
					.getImageDescriptor(ImageUtils.ICON_VERSION_VIEW));
		}

		public void run() {
			RegistryResourceNode resourcePathObj = registryResourcePathData;
			registry = resourcePathObj.getConnectionInfo().getRegistry();
			String path = resourcePathObj.getRegistryResourcePath();
			if (resourcePathObj.getResourceType()==RegistryResourceType.RESOURCE) {
				try {
					File tempFile = resourcePathObj.getFile(verstionPath);
					RemoteContentManager.openFile(tempFile);
				} catch (Exception e) {
					log.error(e);
				}
			}
		}
	}

	public class RestoreVersionAction extends Action {
		RegistryResourceNode registryResourcePathData;
		String versionPath;

		public RestoreVersionAction(
				RegistryResourceNode registryResourcePathData,
				String verstionPath) {
			super("Restore");
			this.registryResourcePathData = registryResourcePathData;
			this.versionPath = verstionPath;
			setImageDescriptor(ImageUtils
					.getImageDescriptor(ImageUtils.ICON_VERSION_RESTORE));
		}

		public void run() {
			RegistryResourceNode resourcePathObj = registryResourcePathData;
			registry = resourcePathObj.getConnectionInfo().getRegistry();
			if (resourcePathObj.getResourceType()==RegistryResourceType.RESOURCE) {
				try {
					registryResourcePathData.restoreToVersion(versionPath);
				} catch (Exception e) {
					log.error(e);
				}
			}
		}
	}

	public class RegistryContentPartListener implements IPartListener2 {
		RegistryResourceNode resourcePathObj;
		IEditorPart editor;

		public RegistryContentPartListener(
				RegistryResourceNode resourcePathObj, IEditorPart editor) {
			this.resourcePathObj = resourcePathObj;
			this.editor = editor;
		}

		public void partVisible(IWorkbenchPartReference reference) {
		}

		public void partOpened(IWorkbenchPartReference reference) {
		}

		public void partInputChanged(IWorkbenchPartReference reference) {
		}

		public void partHidden(IWorkbenchPartReference reference) {
		}

		public void partDeactivated(IWorkbenchPartReference reference) {
			if (reference.getPage().getActiveEditor() == editor) {
				setSelectedEditorRegistryResourcePathData(null);
			}
		}

		public void partClosed(IWorkbenchPartReference reference) {
			if (reference.getPage().getActiveEditor() == editor) {
			}
		}

		public void partBroughtToTop(IWorkbenchPartReference reference) {
		}

		public void partActivated(IWorkbenchPartReference reference) {
			if (reference.getPage().getActiveEditor() == editor) {
				if (isLinkedWithEditor())
					traverseRegistryBrowser(resourcePathObj);
				setSelectedEditorRegistryResourcePathData(resourcePathObj);
			}
		}
	}
}
