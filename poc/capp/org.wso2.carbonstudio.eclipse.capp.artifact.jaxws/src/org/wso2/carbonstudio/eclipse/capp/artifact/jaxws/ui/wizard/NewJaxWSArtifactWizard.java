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

package org.wso2.carbonstudio.eclipse.capp.artifact.jaxws.ui.wizard;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Observer;
import java.util.regex.Pattern;

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
import org.wso2.carbonstudio.eclipse.capp.artifact.jaxws.Activator;
import org.wso2.carbonstudio.eclipse.capp.artifact.jaxws.core.JaxWSArtifactHandler;
import org.wso2.carbonstudio.eclipse.capp.artifact.jaxws.utils.JaxWSImageUtils;
import org.wso2.carbonstudio.eclipse.capp.artifact.libraries.utils.BundlesDataInfo;
import org.wso2.carbonstudio.eclipse.capp.core.artifacts.manager.CAppEnvironment;
import org.wso2.carbonstudio.eclipse.capp.core.artifacts.manager.ICAppArtifactManager;
import org.wso2.carbonstudio.eclipse.capp.core.manifest.Artifact;
import org.wso2.carbonstudio.eclipse.capp.core.ui.wizard.AbstractNewArtifactWizard;
import org.wso2.carbonstudio.eclipse.capp.core.ui.wizard.CAppWizardNewFileCreationPage;
import org.wso2.carbonstudio.eclipse.capp.core.utils.ArtifactFileUtils;
import org.wso2.carbonstudio.eclipse.logging.core.ICarbonStudioLog;
import org.wso2.carbonstudio.eclipse.logging.core.Logger;
import org.wso2.carbonstudio.eclipse.utils.file.FileUtils;


public class NewJaxWSArtifactWizard extends AbstractNewArtifactWizard {
	private static ICarbonStudioLog log=Logger.getLog(Activator.PLUGIN_ID);

	IStructuredSelection selection;
	private WizardNewFileCreationPage wizardNewFileCreationPage;
	private NewJaxWSWizardPage newJaxWSWizardPage;
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
		BundlesDataInfo bundleData = new BundlesDataInfo();
		IFile file = getArtifactXmlPath();
		Artifact artifact = new Artifact(file);
		artifact.setName(getArtifactName());
		artifact.setType(JaxWSArtifactHandler.getType());
		artifact.setVersion("1.0.0");
		artifact.setServerRole(CAppEnvironment.getDefaultServerRole().getServerRoleName());
		ICAppArtifactManager cAppArtifactManager = JaxWSArtifactHandler.getCAppArtifactManager();
		
		try {
	        File tmpFolder = FileUtils.createTempDirectory();
	        tmpFolder.delete();
	        tmpFolder.mkdirs();
	        
	        String[] info = newJaxWSWizardPage.getFilePath().split(Pattern.quote(File.separator));
	        String fileName = info[info.length - 1];
	        if(fileName.equals("")){
	        	fileName = newJaxWSWizardPage.getFileName() + ".jar";
	        }
	        File jaxWSServiceFile = new File(tmpFolder,fileName);
	        if(newJaxWSWizardPage.getOptionType() == ArtifactFileUtils.OPTION_NEW ){
		        jaxWSServiceFile.createNewFile();	        
		        writeTemplete(jaxWSServiceFile);
	        }else if(newJaxWSWizardPage.getOptionType() == ArtifactFileUtils.OPTION_IMPORT_FS ||
	        		newJaxWSWizardPage.getOptionType() == ArtifactFileUtils.OPTION_IMPORT_REG){
				File sourceFile = new File(newJaxWSWizardPage.getFilePath());
		        if (sourceFile.isFile()){
		        	FileUtils.copyFile(sourceFile.toString(), jaxWSServiceFile.toString());
		        }
	        }else{
	        	
	        }
			artifact.setFile(jaxWSServiceFile.toString());
	        cAppArtifactManager.createArtifact(file, artifact);
	        this.artifact=artifact;
        } catch (CoreException e) {
        	MessageDialog.openError(getShell(), "JAX-WS Artifact", "Error creating JAX-WS artifact: "+e.getMessage());
	        log.error(e);
	        return false;
        } catch (Exception e) {
        	MessageDialog.openError(getShell(), "JAX-WS Artifact", "Error creating JAX-WS artifact: "+e.getMessage());
	        log.error(e);
	        return false;        
        }
		return true;
	}
	
	private void writeTemplete(File dataServiceFile){
		
		try{
            
            FileWriter fstream = new FileWriter(dataServiceFile.getAbsoluteFile());
                BufferedWriter out = new BufferedWriter(fstream);
            out.write("");
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
		wizardNewFileCreationPage = new CAppWizardNewFileCreationPage("JA-XWS artifact location",selection,"JAX-WS");
		newJaxWSWizardPage = new NewJaxWSWizardPage(wizardNewFileCreationPage, p);
		String title="New JAX-WS";
		wizardNewFileCreationPage.setTitle(title);
		newJaxWSWizardPage.setTitle(title);
		wizardNewFileCreationPage.setImageDescriptor(JaxWSImageUtils.getInstance().getImageDescriptor("JAX-WS-wizard.png"));
		newJaxWSWizardPage.setImageDescriptor(JaxWSImageUtils.getInstance().getImageDescriptor("JAX-WS-wizard.png"));
		addPage(newJaxWSWizardPage);
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
