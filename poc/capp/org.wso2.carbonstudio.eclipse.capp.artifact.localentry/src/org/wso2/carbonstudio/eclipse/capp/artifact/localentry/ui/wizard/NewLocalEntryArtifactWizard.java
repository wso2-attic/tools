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

package org.wso2.carbonstudio.eclipse.capp.artifact.localentry.ui.wizard;

import java.io.File;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

import javax.xml.namespace.QName;

import org.apache.axiom.om.OMElement;
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
import org.wso2.carbonstudio.eclipse.capp.artifact.localentry.Activator;
import org.wso2.carbonstudio.eclipse.capp.artifact.localentry.core.LocalEntryArtifactHandler;
import org.wso2.carbonstudio.eclipse.capp.artifact.localentry.utils.LocalEntryImageUtils;
import org.wso2.carbonstudio.eclipse.capp.artifact.localentry.utils.LocalEntryTemplateUtils;
import org.wso2.carbonstudio.eclipse.capp.core.artifacts.manager.CAppEnvironment;
import org.wso2.carbonstudio.eclipse.capp.core.artifacts.manager.ICAppArtifactManager;
import org.wso2.carbonstudio.eclipse.capp.core.manifest.Artifact;
import org.wso2.carbonstudio.eclipse.capp.core.ui.wizard.AbstractNewArtifactWizard;
import org.wso2.carbonstudio.eclipse.capp.core.ui.wizard.CAppWizardNewFileCreationPage;
import org.wso2.carbonstudio.eclipse.capp.core.utils.ArtifactFileUtils;
import org.wso2.carbonstudio.eclipse.esb.core.utils.ESBPreferenceData;
import org.wso2.carbonstudio.eclipse.esb.core.utils.SynapseConstants;
import org.wso2.carbonstudio.eclipse.logging.core.ICarbonStudioLog;
import org.wso2.carbonstudio.eclipse.logging.core.Logger;
import org.wso2.carbonstudio.eclipse.utils.file.FileUtils;

import com.sun.xml.internal.ws.util.StringUtils;

public class NewLocalEntryArtifactWizard extends AbstractNewArtifactWizard {
	private static final String EMPTY_STRING = "";

	private static ICarbonStudioLog log=Logger.getLog(Activator.PLUGIN_ID);

	IStructuredSelection selection;
	private WizardNewFileCreationPage wizardNewFileCreationPage;
	private NewLocalEntryWizardPage newLocalEntryWizardPage;
	private List<Observer> observers=new ArrayList<Observer>();
	Artifact artifact;

    public Artifact getArtifact() {
	    return artifact;
    }

	public IFile getArtifactXmlPath(){
		
		try {
			String artifactName = wizardNewFileCreationPage.getFileName();
	        return getArtifactXmlPath(artifactName);
        } catch (Exception e) {
	        return null;
        }
		
	}

	public IFile getArtifactXmlPath(String artifactName) {
	    IPath artifactBasePath = wizardNewFileCreationPage.getContainerFullPath().append(artifactName);
	    IPath artifactXMLPath=artifactBasePath.append("artifact.xml");
	    IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(artifactXMLPath);
	    return file;
    }
	
	
	public String getArtifactName(){
		return getArtifactXmlPath().getParent().getName();
	}
	
	public boolean performFinish() {
		ICAppArtifactManager cAppArtifactManager = LocalEntryArtifactHandler.getCAppArtifactManager();
		try {
	               
	        if(newLocalEntryWizardPage.getOptionType() == ArtifactFileUtils.OPTION_NEW){
        		File tmpFolder = FileUtils.createTempDirectory();
	 	        tmpFolder.delete();
	 	        tmpFolder.mkdirs();
	 	        IFile file = getArtifactXmlPath();
	 			Artifact artifact = new Artifact(file);
	 			artifact.setName(getArtifactName());
	 			artifact.setType(LocalEntryArtifactHandler.getType());
	 			artifact.setVersion("1.0.0");
	 			artifact.setServerRole(CAppEnvironment.getDefaultServerRole().getServerRoleName());
	 	        
	 	        File localEntryFile = new File(tmpFolder,newLocalEntryWizardPage.getFileName()+".xml");
	 	        localEntryFile.createNewFile();	
	        	writeTemplete(localEntryFile);
				artifact.setFile(localEntryFile.toString());
		        cAppArtifactManager.createArtifact(file, artifact);
		        this.artifact=artifact;
	        }else if(newLocalEntryWizardPage.getOptionType() == ArtifactFileUtils.OPTION_IMPORT_FS ||
	        			newLocalEntryWizardPage.getOptionType() == ArtifactFileUtils.OPTION_IMPORT_REG){
				ArrayList<OMElement> selectedElementsList = newLocalEntryWizardPage.getSynapseConfElements();
				for(int i=0; i < selectedElementsList.size(); i++){
					String  editorName=selectedElementsList.get(i).getAttributeValue(new QName("key"));
					File tmpFolder = FileUtils.createTempDirectory();
			        tmpFolder.delete();
			        tmpFolder.mkdirs();
			        IFile file = getArtifactXmlPath(editorName);
					Artifact artifact = new Artifact(file);
					artifact.setName(editorName);
					artifact.setType(LocalEntryArtifactHandler.getType());
					artifact.setVersion("1.0.0");
					artifact.setServerRole(CAppEnvironment.getDefaultServerRole().getServerRoleName());
			        
			        File localEntryFile = new File(tmpFolder,editorName+".xml");
			        localEntryFile.createNewFile();	
					File elementfile = new File(tmpFolder, editorName + ".xml");
					FileUtils.writeContent(elementfile, selectedElementsList.get(i).toString());
			        artifact.setFile(elementfile.toString());
					cAppArtifactManager.createArtifact(file, artifact);
					this.artifact = artifact;
				}
	        	
	        }else{
	        	File tmpFolder = FileUtils.createTempDirectory();
	 	        tmpFolder.delete();
	 	        tmpFolder.mkdirs();
	 	        IFile file = getArtifactXmlPath();
	 			Artifact artifact = new Artifact(file);
	 			artifact.setName(getArtifactName());
	 			artifact.setType(LocalEntryArtifactHandler.getType());
	 			artifact.setVersion("1.0.0");
	 			artifact.setServerRole(CAppEnvironment.getDefaultServerRole().getServerRoleName());
	 	        
	 	        File localEntryFile = new File(tmpFolder,newLocalEntryWizardPage.getFileName()+".xml");
	 	        localEntryFile.createNewFile();	
	        	writeTemplete(localEntryFile);
				artifact.setFile(localEntryFile.toString());
		        cAppArtifactManager.createArtifact(file, artifact);
		        this.artifact=artifact;
	        }

        } catch (CoreException e) {
        	MessageDialog.openError(getShell(), "Local Entry Artifact", "Error creating Local Entry Artifact: "+e.getMessage());
	        log.error(e);
	        return false;
        } catch (Exception e) {
        	MessageDialog.openError(getShell(), "Local Entry Artifact", "Error creating Local Entry Artifact: "+e.getMessage());
	        log.error(e);
	        return false;        
        }
		return true;
	}
	
	private void writeTemplete(File localEntryFile){
		String defaultNS = ESBPreferenceData.getDefaultNamesapce();
		if(defaultNS.equals(EMPTY_STRING) || defaultNS == null){
			defaultNS = SynapseConstants.NS_1_4;
		}
		try {
			String content = EMPTY_STRING;
			if (newLocalEntryWizardPage.getOptionType() == ArtifactFileUtils.OPTION_NEW) {
				String templateToUse = "InLineTextLE.xml";
				if (newLocalEntryWizardPage.getLocalEntryOptionType() != ArtifactFileUtils.IN_LINE_TEXT) {
					templateToUse = "InLineXmlLE.xml";
				}
				content =
				          MessageFormat.format(LocalEntryTemplateUtils.getInstance()
				                                                      .getTemplateString(templateToUse),
				                               newLocalEntryWizardPage.getFileName(), defaultNS);
			} else if (newLocalEntryWizardPage.getOptionType() == ArtifactFileUtils.OPTION_SOURCE_URL) {
				content =
				          MessageFormat.format(LocalEntryTemplateUtils.getInstance()
				                                                      .getTemplateString("SourceURLLE.xml"),
				                               newLocalEntryWizardPage.getFileName(), defaultNS,
				                               newLocalEntryWizardPage.getNewLEFromSource());
			} else {

			}
			FileUtils.writeContent(localEntryFile, content);
		} catch (Exception e) {// Catch exception if any
			log.error(e);
		}
	}
	
	public void addPages() {
		IProject p = null;
		if (selection.getFirstElement() instanceof IProject) {
			p = (IProject) selection.getFirstElement();
		}
		wizardNewFileCreationPage = new CAppWizardNewFileCreationPage("Local Entry Artifact location",selection,"Local Entry Artifact");
//		wizardNewFileCreationPage.setFileExtension("xml");
//		wizardNewFileCreationPage.setFileName("NewLocalEntry");
//		proxyServiceArchiveImportWizardPage = new NewArtifactWizardPage();
//		addObserver(proxyServiceArchiveImportWizardPage);
		newLocalEntryWizardPage = new NewLocalEntryWizardPage(wizardNewFileCreationPage, p);
		String title="New LocalEntry Artifact";
		wizardNewFileCreationPage.setTitle(title);
//		proxyServiceArchiveImportWizardPage.setTitle(title);
		newLocalEntryWizardPage.setTitle(title);
		wizardNewFileCreationPage.setImageDescriptor(LocalEntryImageUtils.getInstance().getImageDescriptor("local-entries-wizard-artifact.png"));
		newLocalEntryWizardPage.setImageDescriptor(LocalEntryImageUtils.getInstance().getImageDescriptor("local-entries-wizard-artifact.png"));
		addPage(newLocalEntryWizardPage);
		addPage(wizardNewFileCreationPage);
//	    addPage(proxyServiceArchiveImportWizardPage);
	    
	}
	
	public void init(IWorkbench arg0, IStructuredSelection selection) {
		this.selection=selection;
//		if (selection.getFirstElement() instanceof IFile){
//			selectedFile=(IFile) selection.getFirstElement();
//		}
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
