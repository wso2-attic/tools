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

package org.wso2.carbonstudio.eclipse.capp.artifact.gadgets.ui.wizard;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
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
import org.wso2.carbonstudio.eclipse.capp.artifact.gadgets.Activator;
import org.wso2.carbonstudio.eclipse.capp.artifact.gadgets.core.GadgetArtifactHandler;
import org.wso2.carbonstudio.eclipse.capp.artifact.gadgets.utils.GadgetImageUtils;
import org.wso2.carbonstudio.eclipse.capp.core.artifacts.manager.CAppEnvironment;
import org.wso2.carbonstudio.eclipse.capp.core.artifacts.manager.ICAppArtifactManager;
import org.wso2.carbonstudio.eclipse.capp.core.manifest.Artifact;
import org.wso2.carbonstudio.eclipse.capp.core.ui.wizard.AbstractNewArtifactWizard;
import org.wso2.carbonstudio.eclipse.capp.core.ui.wizard.CAppWizardNewFileCreationPage;
import org.wso2.carbonstudio.eclipse.capp.core.utils.ArtifactFileUtils;
import org.wso2.carbonstudio.eclipse.logging.core.ICarbonStudioLog;
import org.wso2.carbonstudio.eclipse.logging.core.Logger;
import org.wso2.carbonstudio.eclipse.utils.file.FileUtils;


public class NewGadgetArtifactWizard extends AbstractNewArtifactWizard {
	private static ICarbonStudioLog log=Logger.getLog(Activator.PLUGIN_ID);

	IStructuredSelection selection;
	private WizardNewFileCreationPage wizardNewFileCreationPage;
	private NewGadgetWizardPage newGadgetWizardPage;
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
		artifact.setType(GadgetArtifactHandler.getType());
		artifact.setVersion("1.0.0");
		artifact.setServerRole(CAppEnvironment.getDefaultServerRole().getServerRoleName());
		ICAppArtifactManager cAppArtifactManager = GadgetArtifactHandler.getCAppArtifactManager();
		
		try {
			
	        File tmpFolder = FileUtils.createTempDirectory();
	        File gadgetResourceFolder = new File(tmpFolder,"gadget-resources");
//	        tmpFolder.delete();
	        gadgetResourceFolder.mkdirs();
	        
	        
	        if(newGadgetWizardPage.getOptionType() == ArtifactFileUtils.OPTION_NEW ){
	        	File gadgetFile = new File(gadgetResourceFolder,newGadgetWizardPage.getFileName()+".xml");
	        	gadgetFile.createNewFile();	        
		        writeTemplete(gadgetFile);
		        artifact.setFile(gadgetResourceFolder.toString());

	        }else if(newGadgetWizardPage.getOptionType() == ArtifactFileUtils.OPTION_IMPORT_FS ||
	        		newGadgetWizardPage.getOptionType() == ArtifactFileUtils.OPTION_IMPORT_REG){
				File sourceFile = new File(newGadgetWizardPage.getFilePath());
		        if (sourceFile.isFile()){
		        	File file2 = new File(tmpFolder,sourceFile.getName());
		        	FileUtils.copyFile(sourceFile.toString(), file2.toString());
		        	artifact.setFile(file2.toString());
		        }else {
		        	FileUtils.copyDirectoryContents(sourceFile, gadgetResourceFolder);
		        	artifact.setFile(gadgetResourceFolder.toString());
		        }
	        }else{
	        	
	        }
	        cAppArtifactManager.createArtifact(file, artifact);
	        this.artifact=artifact;

        } catch (CoreException e) {
        	MessageDialog.openError(getShell(), "Gadget Artifact", "Error creating Gadget artifact: "+e.getMessage());
	        log.error(e);
	        return false;
        } catch (Exception e) {
        	MessageDialog.openError(getShell(), "Gadget Artifact", "Error creating Gadget artifact: "+e.getMessage());
	        log.error(e);
	        return false;        
        }
		return true;
	}
	
	private void writeTemplete(File gadgetFile){
		
		try{
            
            FileWriter fstream = new FileWriter(gadgetFile.getAbsoluteFile());
                BufferedWriter out = new BufferedWriter(fstream);
             String content = "<?xml version="+ "\""+ "1.0"+ "\"" + " encoding="+ 
             					"\"" + "UTF-8" + "\"" + "?> " + 
             					"<Module>" + 
             					"<ModulePrefs title="+ 
             					"\"" + newGadgetWizardPage.getFileName() + "\"" + " author_email=" + "\"" +
             					"\"" + ">" +
             					"</ModulePrefs>" + 
//             					"<Content type=" +
//             					"\"" + "html" + "\"" + "><![CDATA[" +
//             					" ]]></Content>
             					"</Module>";
            out.write(content);
            //Close the output stream
            out.close();
            }catch (Exception e){//Catch exception if any
              System.err.println("Error: " + e.getMessage());
            }
	}
	
	public void addPages() {
		IProject p = null;
		if (selection.getFirstElement() instanceof IProject) {
			p = (IProject) selection.getFirstElement();
		}
		
		wizardNewFileCreationPage = new CAppWizardNewFileCreationPage("Gadget artifact location",selection,"Gadgets");
		newGadgetWizardPage = new NewGadgetWizardPage(wizardNewFileCreationPage, p);
		String title="New Gadget";
		wizardNewFileCreationPage.setTitle(title);
		newGadgetWizardPage.setTitle(title);
		wizardNewFileCreationPage.setImageDescriptor(GadgetImageUtils.getInstance().getImageDescriptor("Gadget-wizard.png"));
		newGadgetWizardPage.setImageDescriptor(GadgetImageUtils.getInstance().getImageDescriptor("Gadget-wizard.png"));
		addPage(newGadgetWizardPage);
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
