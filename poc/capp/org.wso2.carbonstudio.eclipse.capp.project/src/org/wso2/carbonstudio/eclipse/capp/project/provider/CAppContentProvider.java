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

package org.wso2.carbonstudio.eclipse.capp.project.provider;

import java.net.MalformedURLException;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.DragSource;
import org.eclipse.swt.dnd.DragSourceEvent;
import org.eclipse.swt.dnd.DragSourceListener;
import org.eclipse.swt.dnd.DropTarget;
import org.eclipse.swt.dnd.DropTargetAdapter;
import org.eclipse.swt.dnd.DropTargetEvent;
import org.eclipse.swt.dnd.TextTransfer;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.widgets.Display;
import org.wso2.carbonstudio.eclipse.capp.core.provider.EmptyNavigatorContentProvider;
import org.wso2.carbonstudio.eclipse.capp.project.Activator;
import org.wso2.carbonstudio.eclipse.capp.project.model.ServerRoleCollectionNode;
import org.wso2.carbonstudio.eclipse.capp.project.model.ServerRoleNode;
import org.wso2.carbonstudio.eclipse.logging.core.ICarbonStudioLog;
import org.wso2.carbonstudio.eclipse.logging.core.Logger;

public class CAppContentProvider extends EmptyNavigatorContentProvider {
	private static ICarbonStudioLog log=Logger.getLog(Activator.PLUGIN_ID);

    private Viewer viewer;
    private static QualifiedName REGISTRY_CONNECTION_KEY=new QualifiedName("tmp_data","serverRolesCollection");
    
    public ServerRoleCollectionNode getServerRolesCollectionNode(IProject project) throws CoreException, MalformedURLException{
    	ServerRoleCollectionNode serverRoleCollectionNode;
		Object sessionProperty = project.getSessionProperty(REGISTRY_CONNECTION_KEY);
		if (sessionProperty==null || !(sessionProperty instanceof ServerRoleCollectionNode)){
			serverRoleCollectionNode = new ServerRoleCollectionNode(project);
			project.setSessionProperty(REGISTRY_CONNECTION_KEY, serverRoleCollectionNode);
		}else{
			serverRoleCollectionNode=(ServerRoleCollectionNode)sessionProperty;
		}
		if (serverRoleCollectionNode.getServerRoleNodes().size()==0){
			serverRoleCollectionNode = null;
		}
		
		return serverRoleCollectionNode;
		
	}

    public Object[] getChildren(Object obj) {
    	if (obj instanceof IProject){
    		ServerRoleCollectionNode serverRolesCollectionNode;
            try {
	            serverRolesCollectionNode = getServerRolesCollectionNode((IProject)obj);
	    		if (serverRolesCollectionNode!=null){
	    			return new Object[]{serverRolesCollectionNode}; 
	    		}
    		} catch (Exception e) {
	            log.error(e);
            }
    	}else if (obj instanceof ServerRoleCollectionNode){
    		return ((ServerRoleCollectionNode)obj).getServerRoleNodes().toArray();
    	}else if (obj instanceof ServerRoleNode){
    		return ((ServerRoleNode)obj).getArtifacts().toArray();
    	}
	    return new Object[]{};
    }

    public boolean hasChildren(Object obj) {
    	if (obj instanceof IProject){
            try {
	            return (getServerRolesCollectionNode((IProject)obj)!=null);
    		} catch (Exception e) {
	            log.error(e);
            }
    	}else if (obj instanceof ServerRoleCollectionNode){
    		return ((ServerRoleCollectionNode)obj).getServerRoleNodes().size()>0;
    	}else if (obj instanceof ServerRoleNode){
    		return ((ServerRoleNode)obj).getArtifacts().size()>0;
    	}
    	return false;
    }

    public void dispose() {
    	ResourcesPlugin.getWorkspace().removeResourceChangeListener(this);
    }

    public void inputChanged(Viewer viewer, Object arg1, Object arg2) {
    	this.viewer = viewer;
//    	setupDragDropHandlers();
	}
    
    private void setupDragDropHandlers(){
    	int operations = DND.DROP_MOVE | DND.DROP_COPY;
		DragSource source = new DragSource(viewer.getControl(), operations);
		Transfer[] types = new Transfer[] { TextTransfer.getInstance() };

		// Transfer[] types = new Transfer[] {TextTransfer.getInstance()};
		source.setTransfer(types);

		source.addDragListener(new DragSourceListener() {

			public void dragFinished(DragSourceEvent event) {
			}

			public void dragSetData(DragSourceEvent event) {
				event.data = viewer.getSelection();
			}

			public void dragStart(DragSourceEvent arg0) {
			}

		});

		DropTarget dt = new DropTarget(viewer.getControl(), DND.DROP_MOVE);
		dt.setTransfer(new Transfer[] { TextTransfer.getInstance() });

		dt.addDropListener(new DropTargetAdapter() {
			public void drop(DropTargetEvent event) {
//				RegistryResourceNode targetRegPathData = (RegistryResourceNode) event.item
//						.getData();
//				for (int i = 0; i < selectedItemList.size(); i++) {
//					regResourcePathData = (RegistryResourceNode) selectedItemList
//							.get(i);
//					registry = regResourcePathData.getConnectionInfo()
//							.getRegistry();
//					String path = targetRegPathData.getRegistryResourcePath()
//							+ "/"
//							+ regResourcePathData.getRegistryResourcePath();
//					try {
//						dropRegistry(regResourcePathData, targetRegPathData);
//					} catch (MalformedURLException e1) {
//						e1.printStackTrace();
//					} catch (RegistryException e1) {
//						e1.printStackTrace();
//					} catch (InterruptedException e1) {
//						e1.printStackTrace();
//					} catch (Exception e) {
//						log.error(e);
//					}
//				}
			}
		});
    }

    public void resourceChanged(IResourceChangeEvent arg0) {
    	Display.getDefault().asyncExec(new Runnable(){
            public void run() {
                viewer.refresh();	    
            }
    	});
    }
}
