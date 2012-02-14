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

package org.wso2.carbonstudio.eclipse.capp.artifact.registry.handler.ui.wizard;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Observer;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.wso2.carbonstudio.eclipse.capp.artifact.registry.handler.Activator;
import org.wso2.carbonstudio.eclipse.capp.artifact.registry.handler.core.RegistryHandlerArtifactHandler;
import org.wso2.carbonstudio.eclipse.capp.artifact.registry.handler.utils.HandlerInfo;
import org.wso2.carbonstudio.eclipse.capp.artifact.registry.handler.utils.RegistryHandlerImagUtils;
import org.wso2.carbonstudio.eclipse.capp.artifact.registry.handler.utils.HandlerInfo.DataType;
import org.wso2.carbonstudio.eclipse.capp.artifact.registry.handler.utils.HandlerInfo.PropertyData;
import org.wso2.carbonstudio.eclipse.capp.core.artifacts.manager.CAppEnvironment;
import org.wso2.carbonstudio.eclipse.capp.core.artifacts.manager.ICAppArtifactManager;
import org.wso2.carbonstudio.eclipse.capp.core.manifest.Artifact;
import org.wso2.carbonstudio.eclipse.capp.core.ui.wizard.AbstractNewArtifactWizard;
import org.wso2.carbonstudio.eclipse.capp.core.ui.wizard.CAppWizardNewFileCreationPage;
import org.wso2.carbonstudio.eclipse.logging.core.ICarbonStudioLog;
import org.wso2.carbonstudio.eclipse.logging.core.Logger;
import org.wso2.carbonstudio.eclipse.utils.file.FileUtils;
import org.wso2.carbonstudio.eclipse.utils.jdt.JavaUtils;
import org.wso2.carbonstudio.eclipse.utils.jdt.JavaUtils.WSO2JavaMethod;


public class NewRegistryHandlerArtifactWizard extends AbstractNewArtifactWizard {
	private static ICarbonStudioLog log=Logger.getLog(Activator.PLUGIN_ID);

	IStructuredSelection selection;
	private WizardNewFileCreationPage wizardNewFileCreationPage;
	private NewRegistryHandlerWizardPage newRegHandlerWizardPage;
	private NewRegistryFilterWizardPage newRegFilterWizardPage;
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
		artifact.setType(RegistryHandlerArtifactHandler.getType());
		artifact.setVersion("1.0.0");
		artifact.setServerRole(CAppEnvironment.getDefaultServerRole().getServerRoleName());
		ICAppArtifactManager cAppArtifactManager = RegistryHandlerArtifactHandler.getCAppArtifactManager();
		
		try {
			
	        File tmpFolder = FileUtils.createTempDirectory();
	        tmpFolder.delete();
	        tmpFolder.mkdirs();
	        File regHandlerInfo = new File(tmpFolder, "registry-handler-info.xml");
			HandlerInfo handlerInfo = new HandlerInfo();
			handlerInfo.setHandlerClass(newRegHandlerWizardPage.getFullyQualifiedClassName());
			handlerInfo.setFilterClass(newRegFilterWizardPage.getClassName());
			handlerInfo.setSelectedMethods(newRegHandlerWizardPage.getSelectedMethods());
//			handlerInfo.setFilterProperties(newRegFilterWizardPage.getFilterMap());
			Map<String, PropertyData> propertyMap = newRegHandlerWizardPage.getHandlerPropertyMap();
			for (String propertyName : propertyMap.keySet()) {
				PropertyData propertyData = propertyMap.get(propertyName);
				handlerInfo.addHandlerProperty(propertyName, 
											   propertyData.type, 
											   propertyData.data);
			}
			propertyMap = newRegFilterWizardPage.getFilterMap();
			for (String propertyName : propertyMap.keySet()) {
				PropertyData propertyData = propertyMap.get(propertyName);
				handlerInfo.addFilterProperty(propertyName, 
											   propertyData.type, 
											   propertyData.data);
			}
			handlerInfo.toFile(regHandlerInfo);
	        artifact.setFile(regHandlerInfo.toString());
	        cAppArtifactManager.createArtifact(file, artifact);
	        
	        try{
		        IType javaITypeForClass=null;
				propertyMap = handlerInfo.getHandlerProperties();
				String projectName = newRegHandlerWizardPage.getProjectName();
				if (projectName!=null && !projectName.equalsIgnoreCase("")){
					javaITypeForClass = JavaUtils.getJavaITypeForClass(JavaCore.create(ResourcesPlugin.getWorkspace().getRoot().getProject(projectName)), handlerInfo.getHandlerClass());
					if (javaITypeForClass!=null){
						for (String propertyName : propertyMap.keySet()) {
							PropertyData propertyData = propertyMap.get(propertyName);
							WSO2JavaMethod method=new WSO2JavaMethod();
							method.setModifier("public");
							method.setReturnType(null);
							method.setElementName(JavaUtils.getSetMethod(propertyName));
							method.addParameter(propertyName+"Value", propertyData.type==DataType.STRING? "String":"org.apache.axiom.om.OMElement");
							method.addMethodCode("//TODO add property set code");
							JavaUtils.addMethod(javaITypeForClass, method);
						}
					}
				}
				
		        
				javaITypeForClass=null;
				propertyMap = handlerInfo.getFilterProperties();
				projectName = newRegFilterWizardPage.getProjectName();
				if (projectName!=null && !projectName.equalsIgnoreCase("")){
					javaITypeForClass = JavaUtils.getJavaITypeForClass(JavaCore.create(ResourcesPlugin.getWorkspace().getRoot().getProject(projectName)), handlerInfo.getFilterClass());
					if (javaITypeForClass!=null){
						for (String propertyName : propertyMap.keySet()) {
							PropertyData propertyData = propertyMap.get(propertyName);
							WSO2JavaMethod method=new WSO2JavaMethod();
							method.setModifier("public");
							method.setReturnType(null);
							method.setElementName(JavaUtils.getSetMethod(propertyName));
							method.addParameter(propertyName+"Value", propertyData.type==DataType.STRING? "String":"org.apache.axiom.om.OMElement");
							method.addMethodCode("//TODO add property set code");
							JavaUtils.addMethod(javaITypeForClass, method);
						}
					}
				}
			}catch (Exception e) {
	        	MessageDialog.openError(getShell(), "Registry Handler Artifact", "Unable to successfully add property set methods to the classes: "+e.getMessage());
			}
	        this.artifact=artifact;
		}catch (Exception e) {
        	MessageDialog.openError(getShell(), "Registry Handler Artifact", "Error creating Registry Handler artifact: "+e.getMessage());
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
		
		wizardNewFileCreationPage = new CAppWizardNewFileCreationPage("Registry Handler artifact location",selection,"Registry Handler");
		newRegHandlerWizardPage = new NewRegistryHandlerWizardPage(wizardNewFileCreationPage, p, selection);
		newRegFilterWizardPage = new NewRegistryFilterWizardPage(wizardNewFileCreationPage, p, selection);
		String title="New Registry Handler";
		wizardNewFileCreationPage.setTitle(title);
		newRegHandlerWizardPage.setTitle(title);
		newRegFilterWizardPage.setTitle(title);
		wizardNewFileCreationPage.setImageDescriptor(RegistryHandlerImagUtils.getInstance().getImageDescriptor("registry-handler-wizard.png"));
		newRegHandlerWizardPage.setImageDescriptor(RegistryHandlerImagUtils.getInstance().getImageDescriptor("registry-handler-wizard.png"));
		newRegFilterWizardPage.setImageDescriptor(RegistryHandlerImagUtils.getInstance().getImageDescriptor("registry-handler-wizard.png"));
		
		addPage(newRegHandlerWizardPage);
		addPage(newRegFilterWizardPage);
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
