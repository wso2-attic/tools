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

package org.wso2.carbonstudio.eclipse.capp.artifact.axis2.core;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.wso2.carbonstudio.eclipse.capp.artifact.axis2.utils.Axis2ProjectUtils;
import org.wso2.carbonstudio.eclipse.capp.artifact.axis2.utils.ServiceXMLCreator;
import org.wso2.carbonstudio.eclipse.capp.core.artifacts.IArtifact;
import org.wso2.carbonstudio.eclipse.capp.core.manifest.CAppArtifactManifest;
import org.wso2.carbonstudio.eclipse.utils.archive.ArchiveManipulator;
import org.wso2.carbonstudio.eclipse.utils.file.FileUtils;
import org.wso2.carbonstudio.eclipse.utils.jdt.JavaUtils;
import org.wso2.carbonstudio.eclipse.utils.project.ProjectUtils;

public class Axis2Artifact implements IArtifact {
	private IProject project;
	private File createdArtifact;
	private File createdFeature;
	private String serviceName;
	private String className;
	private static final String SERVICE_TYPE = "Type";
	private static final String DEPENDENT_PROJECTS = "Projects";
	private static final String DEPENDENT_LIBRARIES = "Projects";
	private static final String SERVICE_CLASSNAME = "Class-name";
	private static final String SERVICE_NAME = "Service-name";

	private static final String SERVICE_CREATION_TYPE_FROM_SCRATCH="FROM_CLASS";
	private File serviceInfoFile;
	private boolean initialized=false;
	public Axis2Artifact(IProject project, String serviceName, String className){
		setProject(project);
		setServiceName(serviceName);
		setClassName(className);
		setInitialized(true);
	}
	
	public Axis2Artifact(File serviceInfoFile){
		setServiceInfoFile(serviceInfoFile);
		setInitialized(false);
	}
	
	public void init() throws Exception {
		if (isInitialized()){
			return;
		}

		if (getServiceInfoFile()!=null){
			Properties properties = new Properties();
			properties.load(new FileInputStream(getServiceInfoFile()));
			
			String projectName=(String) properties.get(DEPENDENT_PROJECTS);
			if (projectName!=null){
				IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
				if (project!=null){
					setProject(project);
				}else{
					throw new Exception("Project '"+projectName+"' is no longer available in the workspace");
				}
				String className = (String) properties.get(SERVICE_CLASSNAME);
				if (className!=null){
					setClassName(className);
					Object serviceName = properties.get(SERVICE_NAME);
					if (serviceName!=null){
						setServiceName((String)serviceName);
					}
				}
			}
		}
		setInitialized(true);
    }
	
	public void loadServiceInformation(){
		setProject(project);
		setServiceName(serviceName);
		setClassName(className);
	}
	
	public void writeServiceInformation(File serviceInfoFile) throws FileNotFoundException, IOException{
		Properties properties = new Properties();
		properties.put(SERVICE_TYPE, SERVICE_CREATION_TYPE_FROM_SCRATCH);
		properties.put(DEPENDENT_PROJECTS, getProject().getName());
		properties.put(SERVICE_CLASSNAME, getClassName());
		properties.put(SERVICE_NAME, getServiceName());
		if (!serviceInfoFile.exists()){
			serviceInfoFile.createNewFile();
		}
		properties.store(new FileOutputStream(serviceInfoFile), "Contains the information about the axis2 service generation information from the eclipse workspace");
	}
	
	public File getArtifact(boolean forceRecreate) throws Exception{
		init();
		if (createdArtifact==null || !createdArtifact.exists() || forceRecreate){
			if (project.exists()){
				List<File> projectBuildPaths = new ArrayList<File>();
				
				//build reference projects
				IProject[] projects = ProjectUtils.getProjectReferencesForService(getProject());
				for (IProject project : projects) {
					projectBuildPaths.add(Axis2ProjectUtils.buildProject(project));
                }
				
				//build service project
				projectBuildPaths.add(Axis2ProjectUtils.buildProject(getProject()));
				
				//get libraries
				IPackageFragmentRoot[] jarFragments = JavaUtils.getReferencedLibrariesForProject(getProject());
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
				
				File resourceFolder=new File(getServiceInfoFile().getParentFile(),"resources");
				if (resourceFolder.exists() && resourceFolder.isDirectory()){
					FileUtils.copyDirectoryContents(resourceFolder, target);
				}
				
				updateMETAINF(target);
				
				ArchiveManipulator archiveManipulator = new ArchiveManipulator();
				File archive = new File(tempFile,getServiceName()+".aar");
				archiveManipulator.archiveDir(archive.getAbsolutePath(), target.getAbsolutePath());
				createdArtifact=archive;
			}
		}
		return createdArtifact;
	}

	public void updateMETAINF(File target) throws IOException {
	    File meta_inf_folder = new File(target,"META-INF");
	    if (!meta_inf_folder.exists()) meta_inf_folder.mkdirs();
	    
	    File manifestDestinationFile = new File(meta_inf_folder,"MANIFEST.MF");
	    if (!manifestDestinationFile.exists()) createManifest(manifestDestinationFile);
	    
	    File serviceXMLDestinationFile = new File(meta_inf_folder,"services.xml");
	    if (!serviceXMLDestinationFile.exists()) createServicesXML(serviceXMLDestinationFile);
    }

	private void createManifest(File manifestDestinationFile) throws IOException {
	    FileUtils.createFile(manifestDestinationFile, "Manifest-Version: 1.0\n\n");
    }

	private void createServicesXML(File serviceXMLDestinationFile) throws IOException {
	    ServiceXMLCreator serviceXMLCreator = new ServiceXMLCreator(getServiceName(), getClassName(), null);
	    FileUtils.createFile(serviceXMLDestinationFile, serviceXMLCreator.toString());
    }

	public File getFeature(boolean forceRecreate) throws Exception{
		init();
		if (createdFeature==null || !createdFeature.exists() || forceRecreate){
//			File deployableArtifact = getArtifact(forceRecreate);
			CAppArtifactManifest cAppComponentManifest = new CAppArtifactManifest();
			cAppComponentManifest.setArtifactType("aar-service");
		}
		return createdFeature;
	}

	public File getArtifactPath() {
		return new File(project.getLocation().toOSString());
	}

	public void setProject(IProject project) {
	    this.project = project;
    }

	public IProject getProject() {
	    return project;
    }

    public File getBundles(boolean forceRecreate) throws Exception {
	    return null;
    }

	public void setServiceName(String serviceName) {
	    this.serviceName = serviceName;
    }

	public String getServiceName() {
	    return serviceName;
    }

	public void setClassName(String className) {
	    this.className = className;
    }

	public String getClassName() {
	    return className;
    }

	public void setServiceInfoFile(File serviceInfoFile) {
	    this.serviceInfoFile = serviceInfoFile;
    }

	public File getServiceInfoFile() {
	    return serviceInfoFile;
    }

	private void setInitialized(boolean initialized) {
	    this.initialized = initialized;
    }

	private boolean isInitialized() {
	    return initialized;
    }

}
