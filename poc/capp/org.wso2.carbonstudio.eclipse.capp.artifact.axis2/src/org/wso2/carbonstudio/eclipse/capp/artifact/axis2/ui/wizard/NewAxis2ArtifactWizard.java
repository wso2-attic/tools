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

package org.wso2.carbonstudio.eclipse.capp.artifact.axis2.ui.wizard;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.wso2.carbonstudio.eclipse.capp.artifact.axis2.Activator;
import org.wso2.carbonstudio.eclipse.capp.artifact.axis2.core.Axis2Artifact;
import org.wso2.carbonstudio.eclipse.capp.artifact.axis2.core.Axis2ArtifactHandler;
import org.wso2.carbonstudio.eclipse.capp.artifact.axis2.utils.Axis2ImageUtils;
import org.wso2.carbonstudio.eclipse.capp.core.artifacts.manager.CAppEnvironment;
import org.wso2.carbonstudio.eclipse.capp.core.artifacts.manager.ICAppArtifactManager;
import org.wso2.carbonstudio.eclipse.capp.core.manifest.Artifact;
import org.wso2.carbonstudio.eclipse.capp.core.ui.wizard.AbstractNewArtifactWizard;
import org.wso2.carbonstudio.eclipse.capp.core.ui.wizard.CAppWizardNewFileCreationPage;
import org.wso2.carbonstudio.eclipse.capp.core.utils.ArtifactFileUtils;
import org.wso2.carbonstudio.eclipse.capp.core.utils.Constants;
import org.wso2.carbonstudio.eclipse.logging.core.ICarbonStudioLog;
import org.wso2.carbonstudio.eclipse.logging.core.Logger;
import org.wso2.carbonstudio.eclipse.utils.data.ITemporaryFileTag;
import org.wso2.carbonstudio.eclipse.utils.file.FileUtils;

public class NewAxis2ArtifactWizard extends AbstractNewArtifactWizard {
	private static ICarbonStudioLog log=Logger.getLog(Activator.PLUGIN_ID);

	IStructuredSelection selection;
	private WizardNewFileCreationPage wizardNewFileCreationPage;
	private Axis2ArtifactSourceWizardPage axis2ArtifactSourceWizardPage;
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
		IFile file = getArtifactXmlPath();
		Artifact artifact = new Artifact(file);
		artifact.setName(getArtifactName());
		artifact.setType(Axis2ArtifactHandler.getType());
		artifact.setVersion("1.0.0");
		artifact.setServerRole(CAppEnvironment.getDefaultServerRole().getServerRoleName());
		ICAppArtifactManager cAppArtifactManager = Axis2ArtifactHandler.getCAppArtifactManager();
		try {
			ITemporaryFileTag tempTag = FileUtils.createNewTempTag();
			File tempDirectory = FileUtils.createTempDirectory();
	        File archiveFile = null;
	        String archiveFilePath=null;
	        File resourceDir = null;
	        if (axis2ArtifactSourceWizardPage.getImportOption()==Axis2ArtifactSourceWizardPage.IMPORT_FROM_WORKSPACE) {
	        	if (axis2ArtifactSourceWizardPage.getSelectedServicePath() instanceof IFolder){
	        		IFolder folder=(IFolder)axis2ArtifactSourceWizardPage.getSelectedServicePath();
	        		archiveFilePath=Constants.FILE_SYSTEM_PATH_LINK_PROTOCOL+folder.getLocation().toOSString();
	        	}
            }else if (axis2ArtifactSourceWizardPage.getImportOption()==Axis2ArtifactSourceWizardPage.IMPORT_FROM_FILE_SYSTEM) {
            	archiveFile = new File(axis2ArtifactSourceWizardPage.getFileSystemAAR());
            }else if (axis2ArtifactSourceWizardPage.getImportOption()==Axis2ArtifactSourceWizardPage.IMPORT_FROM_CLASS) {
            	Axis2Artifact axis2Artifact = new Axis2Artifact(axis2ArtifactSourceWizardPage.getServiceProject(),artifact.getName(),axis2ArtifactSourceWizardPage.getClassName());
            	resourceDir=FileUtils.createTempDirectory();
            	axis2Artifact.updateMETAINF(new File(resourceDir,"resources"));
            	archiveFile = new File(tempDirectory,artifact.getName()+".service");
            	axis2Artifact.writeServiceInformation(archiveFile);
            }
	        if (archiveFilePath==null){
	        	archiveFilePath=archiveFile.toString();
	        }
			artifact.setFile(archiveFilePath);
	        cAppArtifactManager.createArtifact(file, artifact, resourceDir);
	        this.artifact=artifact;
	        tempTag.clear();
        } catch (CoreException e) {
        	MessageDialog.openError(getShell(), "Axis2 Artifact", "Error creating axis2 artifact: "+e.getMessage());
	        log.error(e);
	        return false;
        } catch (Exception e) {
        	MessageDialog.openError(getShell(), "Axis2 Artifact", "Error creating axis2 artifact: "+e.getMessage());
	        log.error(e);
	        return false;        
        }
		return true;
	}

	public void addPages() {
		wizardNewFileCreationPage = new CAppWizardNewFileCreationPage("Axis2 artifact location",selection,"Axis2 Service");
		axis2ArtifactSourceWizardPage = new Axis2ArtifactSourceWizardPage(wizardNewFileCreationPage, selection);
		String title="New Axis2 Service";
		wizardNewFileCreationPage.setTitle(title);
		axis2ArtifactSourceWizardPage.setTitle(title);
		axis2ArtifactSourceWizardPage.setImageDescriptor(Axis2ImageUtils.getInstance().getImageDescriptor("axis2-wizard.png"));
		wizardNewFileCreationPage.setImageDescriptor(Axis2ImageUtils.getInstance().getImageDescriptor("axis2-wizard.png"));
	    addPage(axis2ArtifactSourceWizardPage);
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
