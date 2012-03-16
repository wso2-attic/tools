/*
 * Copyright (c) 2011, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
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

package org.wso2.developerstudio.eclipse.artifact.webapp.project.export;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.osgi.storagemanager.StorageManager;
import org.wso2.developerstudio.eclipse.platform.core.project.export.ProjectArtifactHandler;
import org.wso2.developerstudio.eclipse.utils.archive.ArchiveManipulator;
import org.wso2.developerstudio.eclipse.utils.file.FileUtils;

public class WebAppArtfactExportHandler extends ProjectArtifactHandler {

	public List<IResource> exportArtifact(IProject project) {
		List<IResource> exportResources = new ArrayList<IResource>();
		if(!project.isOpen()){
			return exportResources;
		}
		
		try {
			ArchiveManipulator archiveManipulator = new ArchiveManipulator();
			
			//First compile the code
	        NullProgressMonitor nullProgressMonitor = new NullProgressMonitor();
			//cleaning target directory 
			clearTarget(project);
			project.build(IncrementalProjectBuilder.FULL_BUILD, nullProgressMonitor);
	        
	        //Get the output location
	        IJavaProject javaProject = JavaCore.create(project);
			IPath outPutPath = ResourcesPlugin.getWorkspace().getRoot()
				.getFolder(javaProject.getOutputLocation()).getLocation();
    
			//get webapp files location
			IPath webapp = project.getFolder(
					"src" + File.separator + "main" + File.separator
							+ "webapp").getLocation();
	        
	        //Let's create a temp project 
	        IProject tempProject = ResourcesPlugin.getWorkspace().getRoot().getProject(".temp"+System.currentTimeMillis());
	        tempProject.create(nullProgressMonitor);
	        tempProject.open(nullProgressMonitor);
	        tempProject.setHidden(true);
	        
	        org.eclipse.osgi.storagemanager.StorageManager manager=new StorageManager(tempProject.getLocation().toFile(), "false");
	        
	        File webappResources = manager.createTempFile("webapp_resources");
	        webappResources.delete();
	        webappResources.mkdir();
	        if(webapp.toFile().exists()) {
	        	FileUtils.copyDirectoryContents(webapp.toFile(), webappResources); // copy webapp files
	        	File classes = new File(webappResources,"WEB-INF" + File.separator + "classes");
	        	classes.mkdirs();
	        	FileUtils.copyDirectoryContents(outPutPath.toFile(), classes); // copy webapp files
	        }
	        File tmpArchive = new File(tempProject.getLocation().toFile(),project.getName().concat(".war"));
	        archiveManipulator.archiveDir(tmpArchive.toString(), webappResources.toString());
	        IFolder binaries = project.getFolder("target");
	        if(!binaries.exists()) {
	        	binaries.create(true, true, nullProgressMonitor);
	        	binaries.setHidden(true);
	        }
	        IFile webArchive = project.getFile("target/"+ project.getName().concat(".war"));
	        FileUtils.copy(tmpArchive, webArchive.getLocation().toFile());
	        exportResources.add((IResource)webArchive);
	        
	        //cleaning temp project
	        tempProject.delete(true, nullProgressMonitor);
	        
        } catch (CoreException e) {
	        e.printStackTrace();
        } catch (IOException e) {
	        e.printStackTrace();
        }
		
		return exportResources;
	}

}
