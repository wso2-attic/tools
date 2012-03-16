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

package org.wso2.developerstudio.eclipse.capp.project.ui.wizard;

import java.io.File;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IExportWizard;
import org.eclipse.ui.IWorkbench;
import org.wso2.developerstudio.eclipse.capp.core.manifest.Artifact;
import org.wso2.developerstudio.eclipse.capp.project.Activator;
import org.wso2.developerstudio.eclipse.capp.project.manager.CAppArtifactManager;
import org.wso2.developerstudio.eclipse.capp.project.ui.decorator.ArtifactFolderDecorator;
import org.wso2.developerstudio.eclipse.capp.project.utils.CAppImageUtils;
import org.wso2.developerstudio.eclipse.capp.project.utils.CAppUtils;
import org.wso2.developerstudio.eclipse.logging.core.IDeveloperStudioLog;
import org.wso2.developerstudio.eclipse.logging.core.Logger;
import org.wso2.developerstudio.eclipse.ui.utils.UIDialogs;
import org.wso2.developerstudio.eclipse.utils.data.ITemporaryFileTag;
import org.wso2.developerstudio.eclipse.utils.file.FileUtils;

public class CAppExportWizard extends Wizard implements IExportWizard {
	private static IDeveloperStudioLog log=Logger.getLog(Activator.PLUGIN_ID);

	private CAppExportWizardPage mainPage;
	private IStructuredSelection selection;
	
	public boolean performFinish() {
		
		File savePath = UIDialogs.getSavePath(getShell(),"Select the path to create the carbon application artifact.");
		
		if (savePath==null){
			return false;
		}
		ITemporaryFileTag tempTag = null;
		IProject selectedProject = mainPage.getSelectedProject();
		try {
		    saveChangesToSuperArtifact(selectedProject);
	        tempTag = FileUtils.createNewTempTag();

	        CAppUtils.generateCAR(savePath.toString(), selectedProject, mainPage.isStratosDepEnabled());
	        
        } catch (Exception e) {
	        MessageDialog.openError(getShell(), "Create CAR file", "Error occured while trying to create CAR file: "+e.getMessage());
	        log.error(e);
		    if (tempTag!=null) tempTag.clearAndEnd();
	        return false;
        }finally{
        	if (tempTag!=null) tempTag.clearAndEnd();
        }
        return true;
	}

	private void saveChangesToSuperArtifact(IProject selectedProject) {
	    if (mainPage.isPageDirty()){
	    	Artifact currentArtifact = mainPage.getCurrentArtifact();
	    	try {
	    		IFile superArtifactFile = CAppArtifactManager.getInstance().getSuperArtifactFile(selectedProject);
	    		currentArtifact.toFile(superArtifactFile);
	            mainPage.syncOriginalToCurrent();
	            ArtifactFolderDecorator.refreshResources(new Object[]{superArtifactFile.getParent()});
	        } catch (CoreException e) {
	            log.error(e);
	        }
	    }
    }


	public void init(IWorkbench arg0, IStructuredSelection arg1) {
		this.selection=arg1;
	}
	
	public void addPages() {
		super .addPages();
		IProject p = null;
		if (selection.getFirstElement() instanceof IProject){
			p=(IProject)selection.getFirstElement();
		}
		mainPage = new CAppExportWizardPage("Carbon Application Archive",p);
		mainPage.setTitle("Carbon Application Archive");
		mainPage.setImageDescriptor(CAppImageUtils.getInstance().getImageDescriptor("car-wizard.png"));
		mainPage.setDescription("CAR export settings");

		addPage(mainPage);
	}
	
}
