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

package org.wso2.carbonstudio.eclipse.capp.artifact.war.ui.wizard;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.jst.servlet.ui.project.facet.WebProjectWizard;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.eclipse.wst.common.componentcore.datamodel.properties.IFacetDataModelProperties;
import org.wso2.carbonstudio.eclipse.capp.artifact.war.Activator;
import org.wso2.carbonstudio.eclipse.capp.artifact.war.core.WARArtifactHandler;
import org.wso2.carbonstudio.eclipse.capp.artifact.war.utils.WARImageUtils;
import org.wso2.carbonstudio.eclipse.capp.core.artifacts.manager.CAppEnvironment;
import org.wso2.carbonstudio.eclipse.capp.core.artifacts.manager.ICAppArtifactManager;
import org.wso2.carbonstudio.eclipse.capp.core.manifest.Artifact;
import org.wso2.carbonstudio.eclipse.capp.core.ui.wizard.AbstractNewArtifactWizard;
import org.wso2.carbonstudio.eclipse.capp.core.ui.wizard.CAppWizardNewFileCreationPage;
import org.wso2.carbonstudio.eclipse.capp.core.utils.ArtifactFileUtils;
import org.wso2.carbonstudio.eclipse.capp.core.utils.Constants;
import org.wso2.carbonstudio.eclipse.logging.core.ICarbonStudioLog;
import org.wso2.carbonstudio.eclipse.logging.core.Logger;

public class NewWARArtifactWizard extends AbstractNewArtifactWizard {
	private static ICarbonStudioLog log=Logger.getLog(Activator.PLUGIN_ID);

	IStructuredSelection selection;
	private WizardNewFileCreationPage wizardNewFileCreationPage;
	private WARArtifactSourceWizardPage warArtifactSourceWizardPage;
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
		artifact.setType(WARArtifactHandler.getType());
		artifact.setVersion("1.0.0");
		artifact.setServerRole(CAppEnvironment.getDefaultServerRole().getServerRoleName());
		ICAppArtifactManager cAppArtifactManager = WARArtifactHandler.getCAppArtifactManager();
		
		try {
	        File archiveFile = null;
	        String archiveFilePath=null;
//	        if (warArtifactSourceWizardPage.getImportOption()==WARArtifactSourceWizardPage.NEW_WEB_APPLICATION) {
//	        	IProject project = createNewDynamicProject(getShell());
//	        	if (project==null) return false;
//        		archiveFilePath=Constants.FILE_SYSTEM_PATH_LINK_PROTOCOL+project.getLocation().toOSString();
//	        }else 
        	if (warArtifactSourceWizardPage.getImportOption()==WARArtifactSourceWizardPage.NEW_WEB_APPLICATION ||
        			warArtifactSourceWizardPage.getImportOption()==WARArtifactSourceWizardPage.IMPORT_FROM_WORKSPACE) {
	        	if (warArtifactSourceWizardPage.getSelectedProject() instanceof IProject){
	        		IProject folder=(IProject)warArtifactSourceWizardPage.getSelectedProject();
	        		archiveFilePath=Constants.FILE_SYSTEM_PATH_LINK_PROTOCOL+folder.getLocation().toOSString();
	        	}
            }else if (warArtifactSourceWizardPage.getImportOption()==WARArtifactSourceWizardPage.IMPORT_FROM_FILE_SYSTEM) {
            	archiveFile=new File(warArtifactSourceWizardPage.getFileSystemAAR());
            }
	        if (archiveFilePath==null){
	        	archiveFilePath=archiveFile.toString();
	        }
			artifact.setFile(archiveFilePath);
	        cAppArtifactManager.createArtifact(file, artifact);
	        this.artifact=artifact;
        } catch (Exception e) {
        	MessageDialog.openError(getShell(), "Web Application (WAR)", "Error creating Web Application (WAR): "+e.getMessage());
	        log.error(e);
	        return false;
        }
		return true;
	}
	
//	public static IProject createNewDynamicProject(Shell shell){
//		WebProjectWizard webProjectWizard = new WebProjectWizard();
////		IWizardPage[] pages = webProjectWizard.getPages();
////		for (IWizardPage page : pages) {
////	        if (page instanceof WebProjectFirstPage){
////	        	WebProjectFirstPage wp=(WebProjectFirstPage)page;
////	        }
////        }
//		webProjectWizard.init(PlatformUI.getWorkbench(),  null);
//		webProjectWizard.setForcePreviousAndNextButtons(true);
//		WizardDialog wizardDialog = new WizardDialog(shell,webProjectWizard);
//		if (wizardDialog.open()==Window.OK){
//			Object projectName = webProjectWizard.getDataModel().getProperty(IFacetDataModelProperties.FACET_PROJECT_NAME);
//			if (projectName!=null)
//				return ResourcesPlugin.getWorkspace().getRoot().getProject(projectName.toString());
//			else
//				return null;
//		}
//		return null;
//	}
	
	
	public void addPages() {
		wizardNewFileCreationPage = new CAppWizardNewFileCreationPage("Web Application (WAR) location",selection,"Web Application (WAR)");
		warArtifactSourceWizardPage = new WARArtifactSourceWizardPage(wizardNewFileCreationPage);
		String title="New Web Application (WAR)";
		wizardNewFileCreationPage.setTitle(title);
		warArtifactSourceWizardPage.setTitle(title);
		warArtifactSourceWizardPage.setImageDescriptor(WARImageUtils.getInstance().getImageDescriptor("war-wizard.png"));
		wizardNewFileCreationPage.setImageDescriptor(WARImageUtils.getInstance().getImageDescriptor("war-wizard.png"));
	    addPage(warArtifactSourceWizardPage);
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
