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

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.jface.action.IAction;
import org.eclipse.ui.IViewReference;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.wso2.carbonstudio.eclipse.greg.manager.local.Activator;
import org.wso2.carbonstudio.eclipse.greg.manager.local.bean.RemoteRegistryInfo;
import org.wso2.carbonstudio.eclipse.greg.manager.local.utils.RegistryCheckInClientUtils;
import org.wso2.carbonstudio.eclipse.greg.manager.remote.views.RegistryBrowserView;
import org.wso2.carbonstudio.eclipse.logging.core.ICarbonStudioLog;
import org.wso2.carbonstudio.eclipse.logging.core.Logger;

public class ShowInRegistryBrowserAction extends BaseRegistryAction {
	private static ICarbonStudioLog log=Logger.getLog(Activator.PLUGIN_ID);

	protected void executeFile(IFile file, IAction action) {
	}

	protected void executeFolder(IFolder folder, IAction action) {
	}

	/**
	 * execute show in registry browser action
	 */
	protected void executeResource(IResource resource, IAction action) {
		try {
			IViewReference[] viewReferences = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getViewReferences();
			boolean found=false;
//			for (IViewReference view : viewReferences) {
//                if (view.getId().equals("org.wso2.carbonstudio.registry.remote.registry.view")){
//                	PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().activate(view.getView(true).getViewSite().getPart());
//                	found=true;
//                	break;
//                }
//            }
			try {
				if (!found){
    				PlatformUI.getWorkbench().getActiveWorkbenchWindow()
    							.getActivePage().showView("org.wso2.carbonstudio.registry.remote.registry.view");
				}
			} catch (PartInitException e1) {
				e1.printStackTrace();
			}
			RemoteRegistryInfo info = RegistryCheckInClientUtils.getResourceRemoteRegistryUrlInfo(
																resource.getLocation().toOSString());
			RegistryBrowserView view = RegistryBrowserView.LAST_INSTANCE;
			if (view != null) {
				view.traverseRegistryBrowser(info.getUrl().toString(),info.getPath());
			}
		} catch (Exception e) {
			log.error(e);
		}
	}

	/**
	 * disable action for the file
	 */
	protected void selectedFile(IFile file, IAction action) {
		int resourceState = RegistryCheckInClientUtils.getResourceState(file.getLocation().toOSString());
		if (resourceState == RegistryCheckInClientUtils.RESOURCE_STATE_NOT_RESOURCE){
			action.setEnabled(false);
		}

	}

	/**
	 * disable action for the folder
	 */
	protected void selectedFolder(IFolder folder, IAction action) {
		int resourceState = RegistryCheckInClientUtils.getResourceState(folder.getLocation().toOSString());
		if (resourceState == RegistryCheckInClientUtils.RESOURCE_STATE_NOT_RESOURCE){
			action.setEnabled(false);
		}
	}

	protected void selectedResource(IResource resource, IAction action) {

	}

}
