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

package org.wso2.carbonstudio.eclipse.capp.artifact.bpel.ui.wizard;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.wso2.carbonstudio.eclipse.capp.artifact.bpel.Activator;
import org.wso2.carbonstudio.eclipse.capp.artifact.bpel.core.BPELArtifactHandler;
import org.wso2.carbonstudio.eclipse.capp.artifact.bpel.core.BPELHandlerRequester;
import org.wso2.carbonstudio.eclipse.capp.artifact.bpel.utils.BPELImageUtils;
import org.wso2.carbonstudio.eclipse.capp.core.artifacts.manager.CAppEnvironment;
import org.wso2.carbonstudio.eclipse.capp.core.artifacts.manager.ICAppArtifactManager;
import org.wso2.carbonstudio.eclipse.capp.core.manifest.Artifact;
import org.wso2.carbonstudio.eclipse.capp.core.ui.wizard.AbstractNewArtifactWizard;
import org.wso2.carbonstudio.eclipse.capp.core.ui.wizard.CAppWizardNewFileCreationPage;
import org.wso2.carbonstudio.eclipse.capp.core.utils.ArtifactFileUtils;
import org.wso2.carbonstudio.eclipse.capp.core.utils.Constants;
import org.wso2.carbonstudio.eclipse.logging.core.ICarbonStudioLog;
import org.wso2.carbonstudio.eclipse.logging.core.Logger;

public class BPELArtifactWizard extends AbstractNewArtifactWizard {
	private static ICarbonStudioLog log=Logger.getLog(Activator.PLUGIN_ID);

	IStructuredSelection selection;
	private WizardNewFileCreationPage wizardNewFileCreationPage;
	private NewBPELWizardPage newbpelWizardPage;
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
		IProject bpelWorkflow;
		String archiveFilePath=null;
		IFile file = getArtifactXmlPath();
		Artifact artifact = new Artifact(file);
		artifact.setName(getArtifactName());
//		if (newbpelWizardPage.getSelectedType()==NewBPELWizardPage.NEW_WORKFLOW){
//			bpelWorkflow = BPELHandlerRequester.getHandler().createNewBPELProject(getShell());
//			if (bpelWorkflow==null) return false;
//    		archiveFilePath=Constants.FILE_SYSTEM_PATH_LINK_PROTOCOL+bpelWorkflow.getLocation().toOSString();
//		}else 
			
		if (newbpelWizardPage.getSelectedType()==NewBPELWizardPage.NEW_WORKFLOW ||
				newbpelWizardPage.getSelectedType()==NewBPELWizardPage.WORKFLOW_FROM_WORKSPACE){
			bpelWorkflow=newbpelWizardPage.getSelectedWorkspaceBPELWorkflowProject();
    		archiveFilePath=Constants.FILE_SYSTEM_PATH_LINK_PROTOCOL+bpelWorkflow.getLocation().toOSString();
		}else if (newbpelWizardPage.getSelectedType()==NewBPELWizardPage.WORKFLOW_FROM_FILESYSTEM){
			archiveFilePath=newbpelWizardPage.getArchivePath();
		}

		artifact.setType(BPELArtifactHandler.getType());
		artifact.setVersion("1.0.0");
		artifact.setServerRole(CAppEnvironment.getDefaultServerRole().getServerRoleName());
		ICAppArtifactManager cAppArtifactManager = BPELArtifactHandler.getCAppArtifactManager();
		
		try{
    		artifact.setFile(archiveFilePath);
            cAppArtifactManager.createArtifact(file, artifact);
            this.artifact=artifact;
        } catch (Exception e) {
        	MessageDialog.openError(getShell(), "BPEL WorkFlow", "Error creating bpel workflow: "+e.getMessage());
            log.error(e);
            return false;
        }
        return true;
	}
	
	public void addPages() {
		wizardNewFileCreationPage = new CAppWizardNewFileCreationPage("BPEL WorkFlow location",selection,"BPEL WorkFlow");
		newbpelWizardPage = new NewBPELWizardPage(wizardNewFileCreationPage);
		String title="New BPEL WorkFlow";
		wizardNewFileCreationPage.setTitle(title);
		newbpelWizardPage.setTitle(title);
		wizardNewFileCreationPage.setImageDescriptor(BPELImageUtils.getInstance().getImageDescriptor("bpel-wizard.png"));
		newbpelWizardPage.setImageDescriptor(BPELImageUtils.getInstance().getImageDescriptor("bpel-wizard.png"));
		addPage(newbpelWizardPage);
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
