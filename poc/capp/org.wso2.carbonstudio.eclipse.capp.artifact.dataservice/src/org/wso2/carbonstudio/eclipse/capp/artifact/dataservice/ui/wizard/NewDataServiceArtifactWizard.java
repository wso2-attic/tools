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

package org.wso2.carbonstudio.eclipse.capp.artifact.dataservice.ui.wizard;

import java.io.File;
import java.text.MessageFormat;
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
import org.wso2.carbonstudio.eclipse.capp.artifact.dataservice.Activator;
import org.wso2.carbonstudio.eclipse.capp.artifact.dataservice.core.DataServiceArtifactHandler;
import org.wso2.carbonstudio.eclipse.capp.artifact.dataservice.utils.DSTemplateUtil;
import org.wso2.carbonstudio.eclipse.capp.artifact.dataservice.utils.DataServiceImageUtils;
import org.wso2.carbonstudio.eclipse.capp.core.artifacts.manager.CAppEnvironment;
import org.wso2.carbonstudio.eclipse.capp.core.artifacts.manager.ICAppArtifactManager;
import org.wso2.carbonstudio.eclipse.capp.core.manifest.Artifact;
import org.wso2.carbonstudio.eclipse.capp.core.ui.wizard.AbstractNewArtifactWizard;
import org.wso2.carbonstudio.eclipse.capp.core.ui.wizard.CAppWizardNewFileCreationPage;
import org.wso2.carbonstudio.eclipse.capp.core.utils.ArtifactFileUtils;
import org.wso2.carbonstudio.eclipse.logging.core.ICarbonStudioLog;
import org.wso2.carbonstudio.eclipse.logging.core.Logger;
import org.wso2.carbonstudio.eclipse.utils.file.FileUtils;


public class NewDataServiceArtifactWizard extends AbstractNewArtifactWizard {
	private static ICarbonStudioLog log=Logger.getLog(Activator.PLUGIN_ID);

	IStructuredSelection selection;
	private WizardNewFileCreationPage wizardNewFileCreationPage;
	private NewDataServiceWizardPage newdataServiceWizardPage;
	private List<Observer> observers=new ArrayList<Observer>();
	Artifact artifact;

    public Artifact getArtifact() {
	    return artifact;
    }

	public IFile getArtifactXmlPath(){
		
		try {
	        IPath artifactBasePath = wizardNewFileCreationPage.getContainerFullPath().append(wizardNewFileCreationPage.getFileName());
	        IPath artifactXMLPath=artifactBasePath.append("artifact.xml");
	        IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(artifactXMLPath);
	        return file;
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
		artifact.setType(DataServiceArtifactHandler.getType());
		artifact.setVersion("1.0.0");
		artifact.setServerRole(CAppEnvironment.getDefaultServerRole().getServerRoleName());
		ICAppArtifactManager cAppArtifactManager = DataServiceArtifactHandler.getCAppArtifactManager();
		
		try {
	        File tmpFolder = FileUtils.createTempDirectory();
	        tmpFolder.delete();
	        tmpFolder.mkdirs();
	        
	        File dataServiceFile = new File(tmpFolder,getArtifactName()+".dbs");
	        if(newdataServiceWizardPage.getOptionType() == ArtifactFileUtils.OPTION_NEW ){
	        	String templateString = DSTemplateUtil.getInstance().getTemplateString("emptyDataService.dbs");
	        	templateString=MessageFormat.format(templateString,getArtifactName());
	        	FileUtils.createFile(dataServiceFile, templateString);
		        dataServiceFile.createNewFile();	        
	        }else if(newdataServiceWizardPage.getOptionType() == ArtifactFileUtils.OPTION_IMPORT_FS ||
	        		newdataServiceWizardPage.getOptionType() == ArtifactFileUtils.OPTION_IMPORT_REG){
				File sourceFile = new File(newdataServiceWizardPage.getFilePath());
		        if (sourceFile.isFile()){
		        	FileUtils.copyFile(sourceFile.toString(), dataServiceFile.toString());
		        }
	        }else{
	        	
	        }
			artifact.setFile(dataServiceFile.toString());
	        cAppArtifactManager.createArtifact(file, artifact);
	        this.artifact=artifact;
        } catch (CoreException e) {
        	MessageDialog.openError(getShell(), "Data Service Artifact", "Error creating Data Service artifact: "+e.getMessage());
	        log.error(e);
	        return false;
        } catch (Exception e) {
        	MessageDialog.openError(getShell(), "Data Service Artifact", "Error creating Data Service artifact: "+e.getMessage());
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
		wizardNewFileCreationPage = new CAppWizardNewFileCreationPage("Data Service artifact location",selection,"Data Services");
		newdataServiceWizardPage = new NewDataServiceWizardPage(wizardNewFileCreationPage, p);
		String title="New Data Service";
		wizardNewFileCreationPage.setTitle(title);
		newdataServiceWizardPage.setTitle(title);
		wizardNewFileCreationPage.setImageDescriptor(DataServiceImageUtils.getInstance().getImageDescriptor("ds-wizard.png"));
		newdataServiceWizardPage.setImageDescriptor(DataServiceImageUtils.getInstance().getImageDescriptor("ds-wizard.png"));
		addPage(newdataServiceWizardPage);
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
