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

package org.wso2.carbonstudio.eclipse.capp.artifact.registry.filters.ui.wizard;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Observer;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.wso2.carbonstudio.eclipse.capp.artifact.libraries.ui.wizard.NewLibrariesArtifactWizard;
import org.wso2.carbonstudio.eclipse.capp.artifact.libraries.utils.BundlesDataInfo;
import org.wso2.carbonstudio.eclipse.capp.artifact.registry.filters.Activator;
import org.wso2.carbonstudio.eclipse.capp.artifact.registry.filters.core.RegistryFiltersArtifactHandler;
import org.wso2.carbonstudio.eclipse.capp.artifact.registry.filters.utils.RegistryFiltersImageUtils;
import org.wso2.carbonstudio.eclipse.capp.core.artifacts.manager.CAppEnvironment;
import org.wso2.carbonstudio.eclipse.capp.core.artifacts.manager.ICAppArtifactManager;
import org.wso2.carbonstudio.eclipse.capp.core.manifest.Artifact;
import org.wso2.carbonstudio.eclipse.capp.core.ui.wizard.CAppWizardNewFileCreationPage;
import org.wso2.carbonstudio.eclipse.capp.core.utils.ArtifactFileUtils;
import org.wso2.carbonstudio.eclipse.logging.core.ICarbonStudioLog;
import org.wso2.carbonstudio.eclipse.logging.core.Logger;
import org.wso2.carbonstudio.eclipse.utils.file.FileUtils;


public class NewRegistryFiltersArtifactWizard extends NewLibrariesArtifactWizard {
	private static ICarbonStudioLog log=Logger.getLog(Activator.PLUGIN_ID);

	IStructuredSelection selection;
	private WizardNewFileCreationPage wizardNewFileCreationPage;
	private NewRegistryFiltersWizardPage newRegFiltertWizardPage;
	private List<Observer> observers=new ArrayList<Observer>();
	Artifact artifact;

    public Artifact getArtifact() {
	    return artifact;
    }

	public IFile getArtifactXmlPath(){
		
		try {
			if(ArtifactFileUtils.IsSpecialCharactersExist(wizardNewFileCreationPage.getFileName())){
				wizardNewFileCreationPage.setErrorMessage("Could not create artifacts with special characters");
				return null;
			}else{
		        IPath artifactBasePath = wizardNewFileCreationPage.getContainerFullPath().append(wizardNewFileCreationPage.getFileName());
		        IPath artifactXMLPath=artifactBasePath.append("artifact.xml");
		        IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(artifactXMLPath);
		        return file;
			}
        } catch (Exception e) {
	        return null;
        }
		
	}
	
	
	public String getArtifactName(){
		return getArtifactXmlPath().getParent().getName();
	}
	
	public boolean performFinish() {
		BundlesDataInfo bundleData = new BundlesDataInfo();
		IFile file = getArtifactXmlPath();
		Artifact artifact = new Artifact(file);
		artifact.setName(getArtifactName());
		artifact.setType(RegistryFiltersArtifactHandler.getType());
		artifact.setVersion("1.0.0");
		artifact.setServerRole(CAppEnvironment.getDefaultServerRole().getServerRoleName());
		ICAppArtifactManager cAppArtifactManager = RegistryFiltersArtifactHandler.getCAppArtifactManager();
		
		try {
			
	        File tmpFolder = FileUtils.createTempDirectory();
	        tmpFolder.delete();
	        tmpFolder.mkdirs();
	        
	        File libraryFolder = new File(tmpFolder,"filters");
	        File bundlesDataFile = new File(tmpFolder,"filter-data.xml");
            File dumpPath=libraryFolder;
        	dumpPath.mkdirs();
        	List<Object> selectedResources = newRegFiltertWizardPage.getSelectedResources();
        	List<IProject> projects=new ArrayList<IProject>();
        	for (Object resource : selectedResources) {
        		File libraryResource=null;
        		if (resource instanceof File){
        			libraryResource=(File)resource;
        		}else if (resource instanceof IFile){
        			libraryResource=new File(((IFile)resource).getLocation().toOSString());
        		}else if (resource instanceof IProject){
        			//libraryResource = ProjectUtils.generateJar((IProject)resource);
        			projects.add((IProject)resource);
        		}
        		if (libraryResource!=null){
        			FileUtils.copyFile(libraryResource.toString(),new File(dumpPath,libraryResource.getName()).toString());
        		}
            }
           
        	Map<File, ArrayList<String>> exportedPackagesInfoMap = FileUtils.processJarList(libraryFolder.listFiles()); 
	        for (File jarFile : exportedPackagesInfoMap.keySet()) {
	        	Path base = new Path(tmpFolder.toString());
	        	Path jar = new Path(jarFile.toString());
	        	String jarName=null;
	        	for(int i=base.segmentCount();i<jar.segmentCount();i++){
	        		if (jarName==null){
	        			jarName=jar.segment(i);
	        		}else{
	        			jarName+="/"+jar.segment(i);
	        		}
	        	}
        		if (jarName==null){
        			jarName="libraries/"+jarFile.getName();
        		}
	        	bundleData.createJarElement(jarName, exportedPackagesInfoMap.get(jarFile));
			}
	        for (IProject project : projects) {
	        	bundleData.createProjectElement(project, new ArrayList<String>());
            }
	        bundleData.toFile(bundlesDataFile);
			artifact.setFile(bundlesDataFile.toString());
	        cAppArtifactManager.createArtifact(file, artifact,tmpFolder);
	        this.artifact=artifact;
        } catch (CoreException e) {
        	MessageDialog.openError(getShell(), "Registry Filter Artifact", "Error creating Registry Filter artifact: "+e.getMessage());
	        log.error(e);
	        return false;
        } catch (Exception e) {
        	MessageDialog.openError(getShell(), "Registry Filter Artifact", "Error creating Registry Filter artifact: "+e.getMessage());
	        log.error(e);
	        return false;        
        }
		return true;
	}
	

	public void addPages() {
		IProject p = null;
		if (selection.getFirstElement() instanceof IProject) {
			p = (IProject) selection.getFirstElement();
		}
		
		wizardNewFileCreationPage = new CAppWizardNewFileCreationPage("Registry Filter artifact location",selection,"Registry Filter");
		newRegFiltertWizardPage = new NewRegistryFiltersWizardPage(wizardNewFileCreationPage,p,selection);
		String title="New Registry Filter";
		wizardNewFileCreationPage.setTitle(title);
		newRegFiltertWizardPage.setTitle(title);
		wizardNewFileCreationPage.setImageDescriptor(RegistryFiltersImageUtils.getInstance().getImageDescriptor("registry-filter-wizard.png"));
		newRegFiltertWizardPage.setImageDescriptor(RegistryFiltersImageUtils.getInstance().getImageDescriptor("registry-filter-wizard.png"));
		addPage(newRegFiltertWizardPage);
		addPage(wizardNewFileCreationPage);
	    
	}
	
	public void init(IWorkbench arg0, IStructuredSelection selection) {
		this.selection=selection;
	}

    public IWizardPage getNextPage(IWizardPage page) {
    	for(Observer observer:observers){
    		observer.update(null, getArtifactXmlPath());
    	}
	    return super.getNextPage(page);
    }
    
    public void addObserver(Observer observer){
    	observers.add(observer);
    }
}
