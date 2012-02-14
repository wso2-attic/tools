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

package org.wso2.carbonstudio.eclipse.capp.artifact.endpoints.ui.wizard;

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
import org.wso2.carbonstudio.eclipse.capp.artifact.endpoints.Activator;
import org.wso2.carbonstudio.eclipse.capp.artifact.endpoints.core.EndPointArtifactHandler;
import org.wso2.carbonstudio.eclipse.capp.artifact.endpoints.utils.EndPointImageUtils;
import org.wso2.carbonstudio.eclipse.capp.artifact.endpoints.utils.EpTemplateUtils;
import org.wso2.carbonstudio.eclipse.capp.core.artifacts.manager.CAppEnvironment;
import org.wso2.carbonstudio.eclipse.capp.core.artifacts.manager.ICAppArtifactManager;
import org.wso2.carbonstudio.eclipse.capp.core.manifest.Artifact;
import org.wso2.carbonstudio.eclipse.capp.core.ui.wizard.AbstractNewArtifactWizard;
import org.wso2.carbonstudio.eclipse.capp.core.ui.wizard.CAppWizardNewFileCreationPage;
import org.wso2.carbonstudio.eclipse.capp.core.utils.ArtifactFileUtils;
import org.wso2.carbonstudio.eclipse.logging.core.ICarbonStudioLog;
import org.wso2.carbonstudio.eclipse.logging.core.Logger;
import org.wso2.carbonstudio.eclipse.utils.file.FileUtils;
import org.wso2.carbonstudio.eclipse.esb.core.utils.ESBPreferenceData;
import org.wso2.carbonstudio.eclipse.esb.core.utils.SynapseConstants;

public class NewEndPointArtifactWizard extends AbstractNewArtifactWizard {
	private static ICarbonStudioLog log=Logger.getLog(Activator.PLUGIN_ID);

	IStructuredSelection selection;
	private WizardNewFileCreationPage wizardNewFileCreationPage;
	private NewEndPointWizardPage newEndPointWizardPage;
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
		ICAppArtifactManager cAppArtifactManager = EndPointArtifactHandler.getCAppArtifactManager();
		try {
	        if(newEndPointWizardPage.getOptionType()== ArtifactFileUtils.OPTION_NEW){
	        	File tmpFolder = FileUtils.createTempDirectory();
		        tmpFolder.delete();
		        tmpFolder.mkdirs();
				IFile file = getArtifactXmlPath();
		        File epFile = new File(tmpFolder,newEndPointWizardPage.getFileName()+".xml");
		        epFile.createNewFile();
		        writeTemplete(epFile);
		        Artifact artifact = null;
		        if (newEndPointWizardPage.isCreateAsRegistryResource()){
		        	CAppEnvironment.getRegistryHandler().createArtifact(file.getProject(), getArtifactName(), newEndPointWizardPage.getRegistryDeployPath(), new EndPointArtifactHandler().getDefaultServerRole().getServerRoleName(), true, epFile);
		        }else{
			        artifact = new Artifact(file);
					artifact.setName(getArtifactName());
					artifact.setType(EndPointArtifactHandler.getType());
					artifact.setVersion("1.0.0");
					artifact.setServerRole(CAppEnvironment.getDefaultServerRole().getServerRoleName());
			        artifact.setFile(epFile.toString());
			        cAppArtifactManager.createArtifact(file, artifact);
		        }
		        this.artifact=artifact;
	        }else if(newEndPointWizardPage.getOptionType() == ArtifactFileUtils.OPTION_IMPORT_FS ||
	        		newEndPointWizardPage.getOptionType() == ArtifactFileUtils.OPTION_IMPORT_REG){
	        	ArrayList<OMElement> selectedElementsList = newEndPointWizardPage.getSynapseConfElements();

				for(int i=0; i < selectedElementsList.size(); i++){
		        	File tmpFolder = FileUtils.createTempDirectory();
			        tmpFolder.delete();
			        tmpFolder.mkdirs();
			        String editorName = selectedElementsList.get(i).getAttributeValue(new QName("name"));
			        if(editorName==null){
			        	String regPath = newEndPointWizardPage.getSelectRegistryPathData().getPath();
			        	editorName = FileUtils.getResourceFileName(regPath.substring(regPath.lastIndexOf('/')+1));
			        }
					IFile file = getArtifactXmlPath(editorName);
					File elementfile = new File(tmpFolder, editorName + ".xml");
					FileUtils.writeContent(elementfile, selectedElementsList.get(i).toString());
					Artifact artifact = null;
			        if (newEndPointWizardPage.isCreateAsRegistryResource()){
			        	CAppEnvironment.getRegistryHandler().createArtifact(file.getProject(), editorName, newEndPointWizardPage.getRegistryDeployPath(), new EndPointArtifactHandler().getDefaultServerRole().getServerRoleName(), true, elementfile);
			        }else{
						artifact = new Artifact(file);
						artifact.setName(editorName);
						artifact.setType(EndPointArtifactHandler.getType());
						artifact.setVersion("1.0.0");
						artifact.setServerRole(CAppEnvironment.getDefaultServerRole().getServerRoleName());
						artifact.setFile(elementfile.toString());
						cAppArtifactManager.createArtifact(file, artifact);
			        }
					this.artifact = artifact;
				}
	        }else{
	        	
	        }
        } catch (CoreException e) {
        	MessageDialog.openError(getShell(), "EndPoint Artifact", "Error creating EndPoint artifact: "+e.getMessage());
	        log.error(e);
	        return false;
        } catch (Exception e) {
        	MessageDialog.openError(getShell(), "EndPoint Artifact", "Error creating EndPoint artifact: "+e.getMessage());
	        log.error(e);
	        return false;        
        }
		return true;
	}
	
	private void writeTemplete(File endpointFile){
		String defaultNS = ESBPreferenceData.getDefaultNamesapce();
		if(defaultNS.equals("") || defaultNS == null){
			defaultNS = SynapseConstants.NS_1_4;
		}
		try{
			String templateToUse="AddressEP.xml";
            if(newEndPointWizardPage.getEpOptionType() == ArtifactFileUtils.ADDRESS_EP){
            	templateToUse="AddressEP.xml";
            }else if(newEndPointWizardPage.getEpOptionType() == ArtifactFileUtils.WSDL_EP){
            	templateToUse="WSDLEp.xml";
            }else if(newEndPointWizardPage.getEpOptionType() == ArtifactFileUtils.FO_EP){
            	templateToUse="FOEp.xml";
            }else if(newEndPointWizardPage.getEpOptionType() == ArtifactFileUtils.LB_EP){
            	templateToUse="LBEp.xml";
            }else{
            	templateToUse="Default.xml";
            }
            String content=MessageFormat.format(EpTemplateUtils.getInstance().getTemplateString(templateToUse),newEndPointWizardPage.getFileName(),defaultNS);
            FileUtils.writeContent(endpointFile, content);
         }catch (Exception e){//Catch exception if any
        	 log.error(e);
         }
	}
	
	public void addPages() {
		IProject p = null;
		if (selection.getFirstElement() instanceof IProject) {
			p = (IProject) selection.getFirstElement();
		}
		
		wizardNewFileCreationPage = new CAppWizardNewFileCreationPage("EndPoint artifact location",selection,"EndPoint");
		newEndPointWizardPage = new NewEndPointWizardPage(wizardNewFileCreationPage, p);
		String title="New EndPoint";
		wizardNewFileCreationPage.setTitle(title);
		newEndPointWizardPage.setTitle(title);
		wizardNewFileCreationPage.setImageDescriptor(EndPointImageUtils.getInstance().getImageDescriptor("endpoint-wizard.png"));
		newEndPointWizardPage.setImageDescriptor(EndPointImageUtils.getInstance().getImageDescriptor("endpoint-wizard.png"));
		addPage(newEndPointWizardPage);
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
