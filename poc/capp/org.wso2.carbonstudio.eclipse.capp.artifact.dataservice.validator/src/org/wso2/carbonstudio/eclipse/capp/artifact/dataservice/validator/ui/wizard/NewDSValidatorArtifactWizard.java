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

package org.wso2.carbonstudio.eclipse.capp.artifact.dataservice.validator.ui.wizard;

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
import org.wso2.carbonstudio.eclipse.capp.artifact.dataservice.validator.Activator;
import org.wso2.carbonstudio.eclipse.capp.artifact.dataservice.validator.core.DSValidatorArtifactHandler;
import org.wso2.carbonstudio.eclipse.capp.artifact.dataservice.validator.utils.DSValidatorImageUtils;
import org.wso2.carbonstudio.eclipse.capp.artifact.libraries.ui.wizard.NewLibrariesArtifactWizard;
import org.wso2.carbonstudio.eclipse.capp.artifact.libraries.utils.BundlesDataInfo;
import org.wso2.carbonstudio.eclipse.capp.core.artifacts.manager.CAppEnvironment;
import org.wso2.carbonstudio.eclipse.capp.core.artifacts.manager.ICAppArtifactManager;
import org.wso2.carbonstudio.eclipse.capp.core.manifest.Artifact;
import org.wso2.carbonstudio.eclipse.capp.core.ui.wizard.CAppWizardNewFileCreationPage;
import org.wso2.carbonstudio.eclipse.capp.core.utils.ArtifactFileUtils;
import org.wso2.carbonstudio.eclipse.logging.core.ICarbonStudioLog;
import org.wso2.carbonstudio.eclipse.logging.core.Logger;
import org.wso2.carbonstudio.eclipse.utils.file.FileUtils;

public class NewDSValidatorArtifactWizard extends NewLibrariesArtifactWizard {
	private static ICarbonStudioLog log=Logger.getLog(Activator.PLUGIN_ID);

	IStructuredSelection selection;
	private WizardNewFileCreationPage wizardNewFileCreationPage;
	private NewDSValidatorWizardPage newDSValidatorWizardPage;
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
		artifact.setType(DSValidatorArtifactHandler.getType());
		artifact.setVersion("1.0.0");
		artifact.setServerRole(CAppEnvironment.getDefaultServerRole().getServerRoleName());
		ICAppArtifactManager cAppArtifactManager = DSValidatorArtifactHandler.getCAppArtifactManager();
		
		try {
			
	        File tmpFolder = FileUtils.createTempDirectory();
	        tmpFolder.delete();
	        tmpFolder.mkdirs();
	        File libraryFolder = new File(tmpFolder,"data-service");
	        File bundlesDataFile = new File(tmpFolder,"ds-validator-info.xml");
            File dumpPath=libraryFolder;
           	dumpPath.mkdirs();
            List<Object> selectedResources = newDSValidatorWizardPage.getSelectedResources();
        	List<IProject> projects=new ArrayList<IProject>();
        	for (Object resource : selectedResources) {
        		File dsResource=null;
        		if (resource instanceof File){
        			dsResource=(File)resource;
        		}else if (resource instanceof IFile){
        			dsResource=new File(((IFile)resource).getLocation().toOSString());
        		}else if (resource instanceof IProject){
        			//libraryResource = ProjectUtils.generateJar((IProject)resource);
        			projects.add((IProject)resource);
        		}
        		if (dsResource!=null){
        			FileUtils.copyFile(dsResource.toString(),new File(dumpPath,dsResource.getName()).toString());
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
        			jarName="data-service/"+jarFile.getName();
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
        	
		}catch (CoreException e) {
        	MessageDialog.openError(getShell(), "Data Service Validator Artifact", "Error creating Data Service Validator artifact: "+e.getMessage());
	        log.error(e);
	        return false;
        } catch (Exception e) {
        	MessageDialog.openError(getShell(), "Data Service Validator Artifact", "Error creating Data Service Validator artifact: "+e.getMessage());
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
		
		wizardNewFileCreationPage = new CAppWizardNewFileCreationPage("Data Service Validator artifact location",selection,"Java Library");
		newDSValidatorWizardPage = new NewDSValidatorWizardPage(wizardNewFileCreationPage,p,selection);
		String title="Data Service Validator";
		wizardNewFileCreationPage.setTitle(title);
		newDSValidatorWizardPage.setTitle(title);
		wizardNewFileCreationPage.setImageDescriptor(DSValidatorImageUtils.getInstance().getImageDescriptor("ds-validate-wizard.png"));
		newDSValidatorWizardPage.setImageDescriptor(DSValidatorImageUtils.getInstance().getImageDescriptor("ds-validate-wizard.png"));
		addPage(newDSValidatorWizardPage);
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
