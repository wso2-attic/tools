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

package org.wso2.carbonstudio.eclipse.capp.artifact.proxyservice.ui.wizard;

import java.io.File;
import java.net.URL;
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
import org.wso2.carbonstudio.eclipse.capp.artifact.proxyservice.Activator;
import org.wso2.carbonstudio.eclipse.capp.artifact.proxyservice.core.ProxyServiceArtifactHandler;
import org.wso2.carbonstudio.eclipse.capp.artifact.proxyservice.core.ProxyTemplateHandler;
import org.wso2.carbonstudio.eclipse.capp.artifact.proxyservice.utils.ProxyServiceImageUtils;
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

public class NewProxyServiceArtifactWizard extends AbstractNewArtifactWizard {
	private static ICarbonStudioLog log=Logger.getLog(Activator.PLUGIN_ID);

	IStructuredSelection selection;
	private WizardNewFileCreationPage wizardNewFileCreationPage;
	private NewProxyServiceWizardPage newProxyServiceWizardPage;
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
				ICAppArtifactManager cAppArtifactManager = ProxyServiceArtifactHandler.getCAppArtifactManager();
		
		try {
	        if(newProxyServiceWizardPage.getOptionType()== ArtifactFileUtils.OPTION_NEW){
		        File tmpFolder = FileUtils.createTempDirectory();
		        tmpFolder.delete();
		        tmpFolder.mkdirs();
		        IFile file = getArtifactXmlPath();
				Artifact artifact = new Artifact(file);
				artifact.setName(getArtifactName());
				artifact.setType(ProxyServiceArtifactHandler.getType());
				artifact.setVersion("1.0.0");
				artifact.setServerRole(CAppEnvironment.getDefaultServerRole().getServerRoleName());
		        File proxyServiceFile = new File(tmpFolder,newProxyServiceWizardPage.getFileName()+".xml");
		        proxyServiceFile.createNewFile();
		        writeTemplate(newProxyServiceWizardPage.getProxyOptionType(),proxyServiceFile);
		        artifact.setFile(proxyServiceFile.toString());
		        cAppArtifactManager.createArtifact(file, artifact);
		        this.artifact=artifact;
	        }else if(newProxyServiceWizardPage.getOptionType() == ArtifactFileUtils.OPTION_IMPORT_FS ||
	        			newProxyServiceWizardPage.getOptionType() == ArtifactFileUtils.OPTION_IMPORT_REG){
	        	ArrayList<OMElement> selectedElementsList = newProxyServiceWizardPage.getSynapseConfElements();
				for(int i=0; i < selectedElementsList.size(); i++){
					String editorName = selectedElementsList.get(i).getAttributeValue(new QName("name"));
			        File tmpFolder = FileUtils.createTempDirectory();
			        tmpFolder.delete();
			        tmpFolder.mkdirs();
			        IFile file = getArtifactXmlPath(editorName);
					Artifact artifact = new Artifact(file);
					artifact.setName(editorName);
					artifact.setType(ProxyServiceArtifactHandler.getType());
					artifact.setVersion("1.0.0");
					artifact.setServerRole(CAppEnvironment.getDefaultServerRole().getServerRoleName());
					File elementfile = new File(tmpFolder, editorName + ".xml");
					FileUtils.writeContent(elementfile, selectedElementsList.get(i).toString());
					artifact.setFile(elementfile.toString());
					cAppArtifactManager.createArtifact(file, artifact);
					this.artifact = artifact;
				}
	        }else{
	        	
	        }
        } catch (CoreException e) {
        	MessageDialog.openError(getShell(), "Proxy Service Artifact", "Error creating Proxy Service artifact: "+e.getMessage());
	        log.error(e);
	        return false;
        } catch (Exception e) {
        	MessageDialog.openError(getShell(), "Proxy Service Artifact", "Error creating Proxy Service artifact: "+e.getMessage());
	        log.error(e);
	        return false;        
        }
		return true;
	}
	
	private void writeTemplate(int templateIndex, File proxyServiceFile){
		String defaultNS = ESBPreferenceData.getDefaultNamesapce();
		if(defaultNS.equals("") || defaultNS == null){
			defaultNS = SynapseConstants.NS_1_4;
		}
		try{
			URL templateUrl = ProxyTemplateHandler.getProxyTemplates()[templateIndex].getTemplateUrl();
			String templateString = FileUtils.getContentAsString(templateUrl);
            String content=MessageFormat.format(templateString,newProxyServiceWizardPage.getFileName(),defaultNS);
            FileUtils.writeContent(proxyServiceFile, content);
        }catch (Exception e){
          log.error(e);
        }
	}
	
	public void addPages() {
		IProject p = null;
		if (selection.getFirstElement() instanceof IProject) {
			p = (IProject) selection.getFirstElement();
		}
		wizardNewFileCreationPage = new CAppWizardNewFileCreationPage("Proxy Service artifact location",selection,"Proxy Service");
		newProxyServiceWizardPage = new NewProxyServiceWizardPage(wizardNewFileCreationPage, p);
		String title="New Proxy Service";
		wizardNewFileCreationPage.setTitle(title);
		newProxyServiceWizardPage.setTitle(title);
		wizardNewFileCreationPage.setImageDescriptor(ProxyServiceImageUtils.getInstance().getImageDescriptor("proxy-service-wizard.png"));
		newProxyServiceWizardPage.setImageDescriptor(ProxyServiceImageUtils.getInstance().getImageDescriptor("proxy-service-wizard.png"));
		addPage(newProxyServiceWizardPage);
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
