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

package org.wso2.carbonstudio.eclipse.capp.artifact.synapse.ui.wizard;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

import javax.xml.namespace.QName;

import org.apache.axiom.om.OMElement;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.wso2.carbonstudio.eclipse.capp.artifact.endpoints.core.EndPointArtifactHandler;
import org.wso2.carbonstudio.eclipse.capp.artifact.proxyservice.core.ProxyServiceArtifactHandler;
import org.wso2.carbonstudio.eclipse.capp.artifact.sequence.core.SequenceArtifactHandler;
import org.wso2.carbonstudio.eclipse.capp.artifact.synapse.Activator;
import org.wso2.carbonstudio.eclipse.capp.artifact.synapse.core.SynapseArtifactHandler;
import org.wso2.carbonstudio.eclipse.capp.artifact.synapse.utils.SynapseImageUtils;
import org.wso2.carbonstudio.eclipse.capp.artifact.synapse.utils.SynapseTemplateUtils;
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

public class NewSynapseArtifactWizard extends AbstractNewArtifactWizard {
	private static ICarbonStudioLog log=Logger.getLog(Activator.PLUGIN_ID);

	IStructuredSelection selection;
	private WizardNewFileCreationPage wizardNewFileCreationPage;
	private NewSynapseWizardPage newSynapseWizardPage;
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
		artifact.setType(SynapseArtifactHandler.getType());
		artifact.setVersion("1.0.0");
		artifact.setServerRole(CAppEnvironment.getDefaultServerRole().getServerRoleName());
		ICAppArtifactManager cAppArtifactManager = SynapseArtifactHandler.getCAppArtifactManager();
		
		
			try {
				File tmpFolder = FileUtils.createTempDirectory();
				tmpFolder.delete();
				tmpFolder.mkdirs();

				File synapseFile = new File(tmpFolder, newSynapseWizardPage.getFileName() + ".xml");
				synapseFile.createNewFile();
				
				if(newSynapseWizardPage.getOptionType() == ArtifactFileUtils.OPTION_TEMPLATE) {
					writeTemplete(synapseFile);
					artifact.setFile(synapseFile.toString());
			        cAppArtifactManager.createArtifact(file, artifact);
			        this.artifact=artifact;
				}else if(newSynapseWizardPage.getOptionType() == ArtifactFileUtils.OPTION_NEW){
					writeTemplete(synapseFile);
					artifact.setFile(synapseFile.toString());
			        cAppArtifactManager.createArtifact(file, artifact);
			        this.artifact=artifact;
				}else if(newSynapseWizardPage.getOptionType() == ArtifactFileUtils.OPTION_SPLIT_SYNAPSE ){
//				else if(newSynapseWizardPage.getOptionType() == ArtifactFileUtils.OPTION_IMPORT_FS || 
//						newSynapseWizardPage.getOptionType() == ArtifactFileUtils.OPTION_IMPORT_REG ){
//					File sourceFile = new File(newSynapseWizardPage.getFilePath());
//			        if (sourceFile.isFile()){
//			        	FileUtils.copyFile(sourceFile.toString(), synapseFile.toString());
//			        }
//				}else if(newSynapseWizardPage.getOptionType() == SynapseOptionsUtils.SYNAPSE_IMPORT_REG){
					//create files according selected elements
					
					ArrayList<OMElement> selectedElementsList = newSynapseWizardPage.getSynapseConfElements();
					IFile compfile = getArtifactXmlPath();
					IProject project = compfile.getProject();
					if(selectedElementsList.size() == 0){
						
					}
					for(int i=0; i < selectedElementsList.size(); i++){

						String editorName = selectedElementsList.get(i).getAttributeValue(new QName("name"));
						if(editorName==null){
							editorName = selectedElementsList.get(i).getAttributeValue(new QName("key"));
						}
						String localName = selectedElementsList.get(i).getLocalName();
						String type=SynapseArtifactHandler.getType();
						if (localName.equals("sequence")){
							type=SequenceArtifactHandler.getType();
						}
						if (localName.equals("endpoint")){
							type=EndPointArtifactHandler.getType();
						}
						if (localName.equals("proxy")){
							type=ProxyServiceArtifactHandler.getType();
						}
						IFile artifactFilePath=project.getFolder(getArtifactName()+"_"+editorName).getFile("artifact.xml");
						File elementfile = new File(tmpFolder, editorName + ".xml");
						try{
				            FileWriter fstream = new FileWriter(elementfile.getAbsoluteFile());
				            BufferedWriter out = new BufferedWriter(fstream);
				            out.write(selectedElementsList.get(i).toString());
				            //Close the output stream
				            out.close();
				        }catch (Exception e){//Catch exception if any
				              System.err.println("Error: " + e.getMessage());
				        }
						Artifact compArtifact = new Artifact(artifactFilePath);
						compArtifact.setName(getArtifactName()+"_"+editorName);
						compArtifact.setType(type);
						compArtifact.setVersion("1.0.0");
						compArtifact.setServerRole(CAppEnvironment.getDefaultServerRole().getServerRoleName());
				        compArtifact.setFile(elementfile.toString());
						cAppArtifactManager.createArtifact(artifactFilePath, compArtifact);
						this.artifact = compArtifact;
					}
				}else if(newSynapseWizardPage.getOptionType() == ArtifactFileUtils.OPTION_IMPORT_FS || 
						newSynapseWizardPage.getOptionType() == ArtifactFileUtils.OPTION_IMPORT_REG ){
					File srcFile = new File(newSynapseWizardPage.getFilePath());
					FileUtils.copy(srcFile, synapseFile);
					artifact.setFile(synapseFile.toString());
			        cAppArtifactManager.createArtifact(file, artifact);
			        this.artifact=artifact;
				}

				
			} catch (Exception e) {
				MessageDialog.openError(getShell(), "Synapse Configuration",
						"Error creating Synapse artifact: " + e.getMessage());
				log.error(e);
				return false;
			} 
		return true;
	}
	
	
	private void writeTemplete(File synapseFile){
		String defaultNS = ESBPreferenceData.getDefaultNamesapce();
		if(defaultNS.equals("") || defaultNS == null){
			defaultNS = SynapseConstants.NS_1_4;
		}
		String templateToUse="synapse-template.xml";
		try{
			if(newSynapseWizardPage.getOptionType()== ArtifactFileUtils.OPTION_TEMPLATE){
				templateToUse="synapse-template.xml";
			}
			if(newSynapseWizardPage.getOptionType() == ArtifactFileUtils.OPTION_NEW){
				templateToUse="empty-synapse.xml";
			}
			String content=MessageFormat.format(SynapseTemplateUtils.getInstance().getTemplateString(templateToUse),defaultNS);
            FileUtils.writeContent(synapseFile, content);
        }catch (Exception e){//Catch exception if any
             log.equals(e);
         }
	}
	
	public void addPages() {
		IProject p = null;
		if (selection.getFirstElement() instanceof IProject) {
			p = (IProject) selection.getFirstElement();
		}
		wizardNewFileCreationPage = new CAppWizardNewFileCreationPage("Synapse artifact location",selection,"Synapse");
		newSynapseWizardPage = new NewSynapseWizardPage(wizardNewFileCreationPage, p);
		String title="New Synapse";
		wizardNewFileCreationPage.setTitle(title);
		newSynapseWizardPage.setTitle(title);
		wizardNewFileCreationPage.setImageDescriptor(SynapseImageUtils.getInstance().getImageDescriptor("synapse-wizard.png"));
		newSynapseWizardPage.setImageDescriptor(SynapseImageUtils.getInstance().getImageDescriptor("synapse-wizard.png"));
		addPage(newSynapseWizardPage);
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
