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

package org.wso2.carbonstudio.eclipse.capp.artifact.carbon.ui.bundle.ui.wizard;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.wso2.carbonstudio.eclipse.capp.artifact.carbon.ui.bundle.Activator;
import org.wso2.carbonstudio.eclipse.capp.artifact.carbon.ui.bundle.core.CarbonUIBundleArtifactHandler;
import org.wso2.carbonstudio.eclipse.capp.artifact.carbon.ui.bundle.utils.CarbonUIBundleImageUtils;
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

public class NewCarbonUIBundleArtifactWizard extends NewLibrariesArtifactWizard {
	private static ICarbonStudioLog log=Logger.getLog(Activator.PLUGIN_ID);

	IStructuredSelection selection;
	private WizardNewFileCreationPage wizardNewFileCreationPage;
	private NewCarbonUIBundleWizardPage newLibraryWizardPage;
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
		artifact.setType(CarbonUIBundleArtifactHandler.getType());
		artifact.setVersion("1.0.0");
		artifact.setServerRole(CAppEnvironment.getDefaultServerRole().getServerRoleName());
		ICAppArtifactManager cAppArtifactManager = CarbonUIBundleArtifactHandler.getCAppArtifactManager();
		
		try {
			
	        File tmpFolder = FileUtils.createTempDirectory();
	        tmpFolder.delete();
	        tmpFolder.mkdirs();
	        
	        File libraryFolder = new File(tmpFolder,"carbon-ui");
	        File bundlesDataFile = new File(tmpFolder,"carbon-ui-data.xml");
            File dumpPath=libraryFolder;
        	dumpPath.mkdirs();
        	List<Object> selectedResources = newLibraryWizardPage.getSelectedResources();
        	List<IProject> projects=new ArrayList<IProject>();
        	for (Object resource : selectedResources) {
        		File carbonUIBundleResource=null;
        		if (resource instanceof IProject){
        			projects.add((IProject)resource);
        		}
        		if (carbonUIBundleResource!=null){
        			FileUtils.copyFile(carbonUIBundleResource.toString(),new File(dumpPath,carbonUIBundleResource.getName()).toString());
        		}
            }
	        for (IProject project : projects) {
	        	bundleData.createProjectElement(project, new ArrayList<String>());
            }
	        bundleData.toFile(bundlesDataFile);
			artifact.setFile(bundlesDataFile.toString());
	        cAppArtifactManager.createArtifact(file, artifact,tmpFolder);
	        this.artifact=artifact;
        } catch (CoreException e) {
        	MessageDialog.openError(getShell(), "Carbon UI Bundle Artifact", "Error creating Carbon UI Bundle artifact: "+e.getMessage());
	        log.error(e);
	        return false;
        } catch (Exception e) {
        	MessageDialog.openError(getShell(), "Carbon UI Bundle Artifact", "Error creating Carbon UI Bundle artifact: "+e.getMessage());
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
		
		wizardNewFileCreationPage = new CAppWizardNewFileCreationPage("Carbon UI Bundle artifact location",selection,"Carbon UI Bundle");
		newLibraryWizardPage = new NewCarbonUIBundleWizardPage(wizardNewFileCreationPage,p, selection);
		String title="New Carbon UI Bundle";
		wizardNewFileCreationPage.setTitle(title);
		newLibraryWizardPage.setTitle(title);
		wizardNewFileCreationPage.setImageDescriptor(CarbonUIBundleImageUtils.getInstance().getImageDescriptor("carbon-ui-bundle-wizard.png"));
		newLibraryWizardPage.setImageDescriptor(CarbonUIBundleImageUtils.getInstance().getImageDescriptor("carbon-ui-bundle-wizard.png"));
		addPage(newLibraryWizardPage);
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
