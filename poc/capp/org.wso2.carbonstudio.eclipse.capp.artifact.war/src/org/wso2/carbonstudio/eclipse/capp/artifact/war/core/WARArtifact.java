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

package org.wso2.carbonstudio.eclipse.capp.artifact.war.core;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.wso2.carbonstudio.eclipse.capp.artifact.war.model.WARSourceDescriptor;
import org.wso2.carbonstudio.eclipse.capp.artifact.war.utils.WARServiceSourceDescriptorUtils;
import org.wso2.carbonstudio.eclipse.capp.artifact.war.utils.WARProjectUtils;
import org.wso2.carbonstudio.eclipse.capp.artifact.war.utils.ServiceXMLCreator;
import org.wso2.carbonstudio.eclipse.capp.core.artifacts.IArtifact;
import org.wso2.carbonstudio.eclipse.capp.core.manifest.CAppArtifactManifest;
import org.wso2.carbonstudio.eclipse.utils.archive.ArchiveManipulator;
import org.wso2.carbonstudio.eclipse.utils.file.FileUtils;

public class WARArtifact implements IArtifact {
	private IFile file;
	private File createdArtifact;
	private File createdFeature;
	private WARSourceDescriptor sourceDescriptor;
	
	public WARArtifact(IFile file){
		setFile(file);
		sourceDescriptor = WARServiceSourceDescriptorUtils.loadWARSourceDescriptor(file);
	}
	
	public File getArtifact(boolean forceRecreate) throws Exception{
		if (createdArtifact==null || !createdArtifact.exists() || forceRecreate){
			if (file.exists()){
				List<File> projectBuildPaths = new ArrayList<File>();
				
				//build reference projects
				IProject[] projects = sourceDescriptor.getProjectReferencesForService(sourceDescriptor.getProject().getWorkspace());
				for (IProject project : projects) {
					projectBuildPaths.add(WARProjectUtils.buildProject(project));
                }
				
				//build service project
				projectBuildPaths.add(WARProjectUtils.buildProject(sourceDescriptor.getProject()));
				
				//get libraries
				IPackageFragmentRoot[] jarFragments = sourceDescriptor.getLibraryReferencesForService();
				for (IPackageFragmentRoot jarFragment : jarFragments) {
					File library = jarFragment.getPath().toFile();
	                if (library.exists()){
	                	projectBuildPaths.add(library);
	                }
                }
				
				File tempFile = FileUtils.createTempDirectory();
				File target = new File(tempFile,"target");
				target.mkdirs();
				for (File file : projectBuildPaths) {
					if (file.isDirectory()){
						FileUtils.copyDirectory(file, target);
					}else{
						FileUtils.copy(file, new File(target,file.getName()));
					}
	                System.out.println(file.getAbsolutePath());
                }
				System.out.println(target.getAbsolutePath());
				File meta_inf_folder = new File(target,"META-INF");
				FileUtils.createFile(new File(meta_inf_folder,"MANIFEST.MF"), "Manifest-Version: 1.0\n\n");
				ServiceXMLCreator serviceXMLCreator = new ServiceXMLCreator(sourceDescriptor.getServiceName(), sourceDescriptor.getClassName(), null);
				FileUtils.createFile(new File(meta_inf_folder,"services.xml"), serviceXMLCreator.toString());
				ArchiveManipulator archiveManipulator = new ArchiveManipulator();
				File archive = new File(tempFile,sourceDescriptor.getServiceName()+".aar");
				archiveManipulator.archiveDir(archive.getAbsolutePath(), target.getAbsolutePath());
				createdArtifact=archive;
			}
		}
		return createdArtifact;
	}

	public File getFeature(boolean forceRecreate) throws Exception{
		if (createdFeature==null || !createdFeature.exists() || forceRecreate){
			File deployableArtifact = getArtifact(forceRecreate);
			CAppArtifactManifest cAppComponentManifest = new CAppArtifactManifest();
			cAppComponentManifest.setArtifactType("aar-service");
		}
		return createdFeature;
	}

	public File getArtifactPath() {
		return new File(file.getLocation().toOSString());
	}

	public void setFile(IFile file) {
	    this.file = file;
    }

	public IFile getFile() {
	    return file;
    }

    public File getBundles(boolean forceRecreate) throws Exception {
	    // TODO Auto-generated method stub
	    return null;
    }

}
