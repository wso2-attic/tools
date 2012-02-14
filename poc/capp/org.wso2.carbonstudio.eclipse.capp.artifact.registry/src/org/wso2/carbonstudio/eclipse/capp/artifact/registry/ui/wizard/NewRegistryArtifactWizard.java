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

package org.wso2.carbonstudio.eclipse.capp.artifact.registry.ui.wizard;

import java.io.File;
import java.net.URL;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.wso2.carbonstudio.eclipse.capp.artifact.registry.Activator;
import org.wso2.carbonstudio.eclipse.capp.artifact.registry.core.RegistryArtifactHandler;
import org.wso2.carbonstudio.eclipse.capp.artifact.registry.utils.RegistryImageUtils;
import org.wso2.carbonstudio.eclipse.capp.artifact.registry.utils.RegistryResourceUtils;
import org.wso2.carbonstudio.eclipse.capp.artifact.registry.utils.RegistryTemplates;
import org.wso2.carbonstudio.eclipse.capp.core.artifacts.manager.CAppEnvironment;
import org.wso2.carbonstudio.eclipse.capp.core.manifest.Artifact;
import org.wso2.carbonstudio.eclipse.capp.core.ui.wizard.AbstractNewArtifactWizard;
import org.wso2.carbonstudio.eclipse.capp.core.ui.wizard.CAppWizardNewFileCreationPage;
import org.wso2.carbonstudio.eclipse.capp.core.utils.ArtifactFileUtils;
import org.wso2.carbonstudio.eclipse.logging.core.ICarbonStudioLog;
import org.wso2.carbonstudio.eclipse.logging.core.Logger;
import org.wso2.carbonstudio.eclipse.utils.file.FileUtils;

public class NewRegistryArtifactWizard extends AbstractNewArtifactWizard{
	private static ICarbonStudioLog log=Logger.getLog(Activator.PLUGIN_ID);

	IStructuredSelection selection;
	private WizardNewFileCreationPage wizardNewFileCreationPage;
	private NewRegistryArtifactWizardPage regArtifactWizardPage;
	private List<Observer> observers=new ArrayList<Observer>();
	Artifact artifact;
	int selectionIndex;
	int templateCount;

	public Artifact getArtifact() {
	    return artifact;
    }
	public NewRegistryArtifactWizard(){
		ImageDescriptor img = RegistryImageUtils.getInstance().getImageDescriptor("registry-artifact-wizard.png");
		setDefaultPageImageDescriptor(img);
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
		artifact.setType(RegistryArtifactHandler.getType());
		artifact.setVersion("1.0.0");
		artifact.setServerRole(CAppEnvironment.getDefaultServerRole().getServerRoleName());

		try {
        	String regPathTodeploy = regArtifactWizardPage.getRegPathTodeploy();
			int optionType = regArtifactWizardPage.getOptionType();
			boolean importCollectionFromFS = (optionType == ArtifactFileUtils.OPTION_IMPORT_COLLECTION_FROM_FS);
        	boolean copyContent = regArtifactWizardPage.isCopyContent();
//        	RegistryTemplates[] regTemplates = regArtifactWizardPage.getRegTemplates();
        	File inputFile;
        	
        	if(regArtifactWizardPage.getOptionType() == ArtifactFileUtils.OPTION_TEMPLATE){
        		File tmpFolder = FileUtils.createTempDirectory();
 		        tmpFolder.delete();
 		        tmpFolder.mkdirs();
	        	inputFile = new File(tmpFolder,regArtifactWizardPage.getTemplateName());
 		       	inputFile.createNewFile();
		        writeTemplate(inputFile);
        	}else{
        		inputFile=new File(regArtifactWizardPage.getDumpregPath());
        	}
        	
        	//Fixing TOOLS-488
        	RegistryResourceUtils.createRegistryResourceArtifact(file, artifact, regPathTodeploy,
					importCollectionFromFS, copyContent, !regArtifactWizardPage.isRegDumpSelected(), inputFile);
	        this.artifact=artifact;
        } catch (CoreException e) {
        	MessageDialog.openError(getShell(), "Registry Artifact", "Error creating registry artifact: "+e.getMessage());
	        log.error(e);
	        return false;
        } catch (Exception e) {
        	MessageDialog.openError(getShell(), "Registry Artifact", "Error creating registry artifact: "+e.getMessage());
	        log.error(e);
	        return false;        
        }
		return true;
	}
	

	private void writeTemplate(File templateFile){
		try{
			String templateString = "";
	        int templateCount = regArtifactWizardPage.getRegTemplates().length;
        	int selectionIndex = regArtifactWizardPage.getTemplateType();

            if (selectionIndex == templateCount) {
				templateString = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
			} else if (selectionIndex == templateCount + 1) {
				templateString = "";
			}else{
				RegistryTemplates regTemplate = regArtifactWizardPage.getRegTemplates()[selectionIndex];
				URL templateUrl = regTemplate.getTemplateUrl();
				templateString = FileUtils.getContentAsString(templateUrl);
			}
            String content=MessageFormat.format(templateString,wizardNewFileCreationPage.getFileName());
            FileUtils.writeContent(templateFile, content);
        }catch (Exception e){
          log.error(e);
        }
	}
	
	public void init(IWorkbench arg0, IStructuredSelection selection) {
		this.selection=selection;
	}
	
	public void addPages() {
		IProject p = null;
		if (selection.getFirstElement() instanceof IProject) {
			p = (IProject) selection.getFirstElement();
		}else if (selection.getFirstElement() instanceof IResource){
			p=((IResource)selection.getFirstElement()).getProject();
		}
		
		wizardNewFileCreationPage = new CAppWizardNewFileCreationPage("Registry artifact location",selection,"Registry Resource");
		regArtifactWizardPage = new NewRegistryArtifactWizardPage(wizardNewFileCreationPage, p);
		String title="New Registry Resource";
		wizardNewFileCreationPage.setTitle(title);
		
		regArtifactWizardPage.setTitle(title);
		regArtifactWizardPage.setImageDescriptor(RegistryImageUtils.getInstance().getImageDescriptor("registry-artifact-wizard.png"));
		wizardNewFileCreationPage.setImageDescriptor(RegistryImageUtils.getInstance().getImageDescriptor("registry-artifact-wizard.png"));
		addPage(regArtifactWizardPage);
		addPage(wizardNewFileCreationPage);
	    
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
