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

package org.wso2.developerstudio.eclipse.artifact.jaxws.project.export;

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

public class JaxwsArtfactExportHandler extends ProjectArtifactHandler {

	public List<IResource> exportArtifact(IProject project) {
		List<IResource> exportResources = new ArrayList<IResource>();
		if(!project.isOpen()){
			return exportResources;
		}
		
		try {
			ArchiveManipulator archiveManipulator = new ArchiveManipulator();
			
			//cleaning target directory 
			clearTarget(project);
			//First compile the code
	        NullProgressMonitor nullProgressMonitor = new NullProgressMonitor();
			project.build(IncrementalProjectBuilder.FULL_BUILD, nullProgressMonitor);
	        
	        //Get the output location
	        IJavaProject javaProject = JavaCore.create(project);
			IPath outPutPath = ResourcesPlugin.getWorkspace().getRoot()
				.getFolder(javaProject.getOutputLocation()).getLocation();
    
			//get resource location
			IPath resources = project.getFolder(
					"src" + File.separator + "main" + File.separator
							+ "resources").getLocation();
	        
	        //Let's create a temp project 
	        IProject tempProject = ResourcesPlugin.getWorkspace().getRoot().getProject(".temp"+System.currentTimeMillis());
	        tempProject.create(nullProgressMonitor);
	        tempProject.open(nullProgressMonitor);
	        tempProject.setHidden(true);
	        
	        org.eclipse.osgi.storagemanager.StorageManager manager=new StorageManager(tempProject.getLocation().toFile(), "false");
	        
	        File jaxwsResources = manager.createTempFile("Jaxws_resources");
	        jaxwsResources.delete();
	        jaxwsResources.mkdir();
	        FileUtils.copyDirectoryContents(outPutPath.toFile(), jaxwsResources);
	        if(resources.toFile().exists()) {
	        	FileUtils.copyDirectoryContents(resources.toFile(), jaxwsResources); // copy resources
	        }
	        File tmpArchive = new File(tempProject.getLocation().toFile(),project.getName().concat(".jar"));
	        archiveManipulator.archiveDir(tmpArchive.toString(), jaxwsResources.toString());
	        IFolder binaries = project.getFolder("target");
	        if(!binaries.exists()) {
	        	binaries.create(true, false, nullProgressMonitor);
	        	binaries.setHidden(true);
	        }
	        IFile serviceArchive = project.getFile("target/"+ project.getName().concat(".jar"));
	        FileUtils.copy(tmpArchive, serviceArchive.getLocation().toFile());
	        exportResources.add((IResource)serviceArchive);
	        
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
