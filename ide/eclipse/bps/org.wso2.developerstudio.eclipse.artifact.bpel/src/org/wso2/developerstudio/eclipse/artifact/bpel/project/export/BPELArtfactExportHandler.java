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

package org.wso2.developerstudio.eclipse.artifact.bpel.project.export;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.osgi.storagemanager.StorageManager;
import org.wso2.developerstudio.eclipse.platform.core.project.export.ProjectArtifactHandler;
import org.wso2.developerstudio.eclipse.utils.archive.ArchiveManipulator;
import org.wso2.developerstudio.eclipse.utils.file.FileUtils;

public class BPELArtfactExportHandler extends ProjectArtifactHandler {


	public List<IResource> exportArtifact(IProject project) {
		List<IResource> exportResources = new ArrayList<IResource>();
		if(!project.isOpen()){
			return exportResources;
		}
		
		try {
			ArchiveManipulator archiveManipulator = new ArchiveManipulator();
			
			//First compile the code
	        NullProgressMonitor nullProgressMonitor = new NullProgressMonitor();
	        //Let's create a temp project 
	        IProject tempProject = ResourcesPlugin.getWorkspace().getRoot().getProject(".temp"+System.currentTimeMillis());
	        tempProject.create(nullProgressMonitor);
	        tempProject.open(nullProgressMonitor);
	        tempProject.setHidden(true);
	        
	        org.eclipse.osgi.storagemanager.StorageManager manager=new StorageManager(tempProject.getLocation().toFile(), "false");
	        
	        File bpelResources = manager.createTempFile("bpel_resources");
	        bpelResources.delete();
	        bpelResources.mkdir();

	        FileUtils.copyDirectoryContents(project.getLocation().toFile(), bpelResources); 
	        
	        //cleaning unnecessary files before archiving
			String[] excludeFiles = {"pom.xml", ".project"};
			String[] excludeDir = {"target", ".settings" };
			IFolder bpelResDir = tempProject.getFolder(bpelResources.getName());
			
			for (String excludeFile : excludeFiles) {
				IFile excludeRes = bpelResDir.getFile(excludeFile);
				if (excludeRes.getLocation().toFile().exists()) {
				
					excludeRes.getLocation().toFile().delete();
				}
			}
			for (String excludeFile : excludeDir) {
				IFolder excludeRes = bpelResDir.getFolder(excludeFile);
				if (excludeRes.getLocation().toFile().exists()) {
					FileUtils.deleteDir(excludeRes.getLocation().toFile());
				}
			}

	        File tmpArchive = new File(tempProject.getLocation().toFile(),project.getName().concat(".zip"));
	        archiveManipulator.archiveDir(tmpArchive.toString(), bpelResources.toString());
	        IFolder binaries = project.getFolder("target");
	        if(!binaries.exists()) {
	        	binaries.create(true, true, nullProgressMonitor);
	        	binaries.setHidden(true);
	        }
	        IFile bpelArchive = project.getFile("target/"+ project.getName().concat(".zip"));
	        FileUtils.copy(tmpArchive, bpelArchive.getLocation().toFile());
	        exportResources.add((IResource)bpelArchive);
	        
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
