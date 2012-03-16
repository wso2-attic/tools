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

package org.wso2.developerstudio.eclipse.capp.project.provider;

import java.util.List;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.GroupMarker;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.navigator.CommonActionProvider;
import org.wso2.developerstudio.eclipse.capp.core.artifacts.manager.CAppEnvironment;
import org.wso2.developerstudio.eclipse.capp.core.artifacts.manager.IServerRole;
import org.wso2.developerstudio.eclipse.capp.core.model.ServerRole;
import org.wso2.developerstudio.eclipse.capp.project.Activator;
import org.wso2.developerstudio.eclipse.capp.project.manager.CAppArtifactManager;
import org.wso2.developerstudio.eclipse.capp.project.model.ArtifactNode;
import org.wso2.developerstudio.eclipse.capp.project.model.ServerRoleNode;
import org.wso2.developerstudio.eclipse.capp.project.ui.dialog.ServerRoleDialog;
import org.wso2.developerstudio.eclipse.capp.project.utils.CAppImageUtils;
import org.wso2.developerstudio.eclipse.logging.core.IDeveloperStudioLog;
import org.wso2.developerstudio.eclipse.logging.core.Logger;

public class ServerRoleNodeActionProvider extends CommonActionProvider{
	private static IDeveloperStudioLog log=Logger.getLog(Activator.PLUGIN_ID);

	private Action actionRename;
	private Action actionDelete;
	private ServerRoleNode serverRoleNode;
	
	public ServerRoleNodeActionProvider() {
		createActions();
	}

	private void createActions() {
		actionRename = new Action("Rename",CAppImageUtils.getInstance().getImageDescriptor("open-in-new-window.png")){
			public void run() {
				if (serverRoleNode!=null) {
	                ServerRoleDialog serverRoleDialog = new ServerRoleDialog(getShell(),true,serverRoleNode.getProject());
	                serverRoleDialog.setCurrentServerRole(serverRoleNode.getServerRole());
	                serverRoleDialog.create();
	                if (serverRoleDialog.open() == Window.OK) {
		                IServerRole newServerRole = serverRoleDialog.getNewServerRole();
		                CAppArtifactManager manager = CAppArtifactManager.getInstance();
		                manager.addServerRole(serverRoleNode.getProject(), newServerRole);
		                List<ArtifactNode> artifacts = serverRoleNode.getArtifacts();
		                for (ArtifactNode node : artifacts) {
			                node.getAritfact().setServerRole(newServerRole.getServerRoleName());
			                try {
	                            node.getAritfact().toFile();
                            } catch (Exception e) {
	                            log.error(e);
                            }
		                }
		                manager.removeServerRole(serverRoleNode.getProject(),
		                                         serverRoleNode.getServerRole());
	                }
	                
	                
	                
                }
			}
		};
		actionDelete = new Action("Delete",CAppImageUtils.getInstance().getImageDescriptor("del.png")){
			public void run() {
				if (serverRoleNode!=null){
					ServerRole defaultServerRole = CAppEnvironment.getDefaultServerRole();
					if (defaultServerRole.getServerRoleName().equals(serverRoleNode.getServerRole().getServerRoleName())){
						MessageDialog.openWarning(getShell(), "Remove Server Role", "You cannot delete the default server role");
						return;
					}
					if (MessageDialog.openQuestion(getShell(), "Remove Server Role", "Are you sure you want to remove this Server Role'"+serverRoleNode.getCaption()+"'")){
						IServerRole newServerRole = defaultServerRole;
						CAppArtifactManager manager = CAppArtifactManager.getInstance();
						List<ArtifactNode> artifacts = serverRoleNode.getArtifacts();
						for (ArtifactNode node : artifacts) {
		                    node.getAritfact().setServerRole(newServerRole.getServerRoleName());
		                    try {
	                            node.getAritfact().toFile();
                            } catch (Exception e) {
	                            log.error(e);
                            }
	                    }
						manager.removeServerRole(serverRoleNode.getProject(), serverRoleNode.getServerRole());
					}
				}
			}
		};
	}

	public void fillContextMenu(IMenuManager menu) {
		updateSelectedObjects();
		if (serverRoleNode!=null){
			ServerRole defaultServerRole = CAppEnvironment.getDefaultServerRole();
			if (!defaultServerRole.getServerRoleName().equals(serverRoleNode.getServerRole().getServerRoleName())){
        		menu.add(actionRename);
        		menu.add(actionDelete);
			}
		}
	}

	public void addGroupSeperator(IMenuManager menu) {
		menu.add(new GroupMarker(IWorkbenchActionConstants.MB_ADDITIONS));
		menu.add(new Separator());
	}
	
	private Shell getShell(){
		return Display.getCurrent().getActiveShell();
	}
	
	private void updateSelectedObjects() {
	    TreeSelection selection=(TreeSelection)getContext().getSelection();
	    serverRoleNode = null;
		if (selection.getFirstElement() instanceof ServerRoleNode){
			serverRoleNode = (ServerRoleNode)selection.getFirstElement();
    	} 
    }
}
