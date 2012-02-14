package org.wso2.carbonstudio.eclipse.capp.project.provider;
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



import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.widgets.Display;
import org.wso2.carbonstudio.eclipse.capp.core.artifacts.ICAppArtifactHandler;
import org.wso2.carbonstudio.eclipse.capp.core.artifacts.manager.CAppEnvironment;
import org.wso2.carbonstudio.eclipse.capp.core.artifacts.manager.ICAppArtifactManager;
import org.wso2.carbonstudio.eclipse.capp.core.manifest.Artifact;
import org.wso2.carbonstudio.eclipse.capp.core.provider.EmptyNavigatorContentProvider;
import org.wso2.carbonstudio.eclipse.capp.project.Activator;
import org.wso2.carbonstudio.eclipse.logging.core.ICarbonStudioLog;
import org.wso2.carbonstudio.eclipse.logging.core.Logger;

public class CAppArtifactContentProvider extends EmptyNavigatorContentProvider {

    private Viewer viewer;
	private static ICarbonStudioLog log=Logger.getLog(Activator.PLUGIN_ID);


    public Object[] getChildren(Object obj) {
		List<IResource> resourcesToAdd=new ArrayList<IResource>();
    	File location=null;
    	IProject project = null;
    	IFolder folder = null;
    	if (obj instanceof IProject){
    		project = (IProject)obj;
			location=project.getLocation().toFile();
    	}else if (obj instanceof IFolder){
    		folder = (IFolder)obj;
			location=folder.getLocation().toFile();
    	}
    	if (location!=null){
    		File[] children = location.listFiles();
    		ICAppArtifactManager cAppManager = CAppEnvironment.getcAppManager();
			for (File file : children) {
				if (file.isDirectory()){
					IFolder artifactFolder;
					if (project!=null){
						artifactFolder=project.getFolder(file.getName());
					}else{
						artifactFolder=folder.getFolder(file.getName());
					}
					try {
						Artifact artifact = cAppManager.getArtifact(artifactFolder);
						if (artifact!=null){
							ICAppArtifactHandler artifactHandler = cAppManager.getArtifactHandler(artifact);
							if (artifactHandler!=null){
								IResource artifactContentResource = artifactHandler.getArtifactContentResource(artifact);
								if (artifactContentResource instanceof IFile){
									resourcesToAdd.add(artifactContentResource);
								}else if (artifactContentResource instanceof IFolder){
									IFolder linkFolder;
									String linkFolderName = artifact.getName()+"(linked)";
									if (project!=null){
										linkFolder=project.getFolder(linkFolderName);
									}else{
										linkFolder=folder.getFolder(linkFolderName);
									}
									if (!linkFolder.exists()){
										linkFolder.createLink(artifactContentResource.getLocation(), IResource.ALLOW_MISSING_LOCAL, new NullProgressMonitor());
										resourcesToAdd.add(linkFolder);
									}
								}
							}
						}
					} catch (Exception e) {
						log.error(e);
					}
				}
			}
    	}
		return resourcesToAdd.toArray();
    }

    public boolean hasChildren(Object obj) {
    	return getChildren(obj).length>0;
    }

    public void dispose() {
    	ResourcesPlugin.getWorkspace().removeResourceChangeListener(this);
    }

    public void inputChanged(Viewer viewer, Object arg1, Object arg2) {
    	this.viewer = viewer;
	}
    

    public void resourceChanged(IResourceChangeEvent arg0) {
    	Display.getDefault().asyncExec(new Runnable(){
            public void run() {
                viewer.refresh();	    
            }
    	});
    }
}
