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

package org.wso2.carbonstudio.eclipse.capp.artifact.axis2.ui.wizard;

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.wso2.carbonstudio.eclipse.capp.artifact.axis2.Activator;
import org.wso2.carbonstudio.eclipse.capp.artifact.axis2.core.Axis2ArtifactHandler;
import org.wso2.carbonstudio.eclipse.capp.artifact.axis2.model.Axis2ArtifactLocationNode;
import org.wso2.carbonstudio.eclipse.capp.artifact.axis2.utils.SettingsConstants;
import org.wso2.carbonstudio.eclipse.logging.core.ICarbonStudioLog;
import org.wso2.carbonstudio.eclipse.logging.core.Logger;

/**
 * @deprecated
 * @author saminda
 *
 */
public class NewAxis2SourceFolderWizard extends Wizard implements INewWizard {
	private static ICarbonStudioLog log=Logger.getLog(Activator.PLUGIN_ID);

	private NewAxis2SourceFolderWizardPage newAxis2SourceFolderWizardPage;
	private IProject selectedProject;
	private Axis2ArtifactLocationNode selectedLocationNode;
	
	public boolean performFinish() {
		IProject selectedProject = newAxis2SourceFolderWizardPage.getSelectedProject();
		Axis2ArtifactLocationNode selectedPath = new Axis2ArtifactLocationNode(selectedProject,newAxis2SourceFolderWizardPage.getSourcePathName());
		if (!selectedPath.isPathExist()){
			try {
				Axis2ArtifactHandler.getCAppArtifactManager().createArtifactPath(selectedProject, SettingsConstants.ID, selectedPath.getSourceFolder());
            } catch (Exception e) {
	            log.error(e);
	            MessageDialog.openError(getShell(), "Axis2 source folder", e.getMessage());
	            return false;
            }
		}
		return true;
	}

    public void init(IWorkbench arg0, IStructuredSelection selection) {
    	if (selection.getFirstElement() instanceof Axis2ArtifactLocationNode){
    		selectedLocationNode=(Axis2ArtifactLocationNode)selection.getFirstElement();
    		selectedProject=selectedLocationNode.getProject();
    	} else if (selection.getFirstElement() instanceof IProject){
    		selectedProject=(IProject)selection.getFirstElement();
    	}
    }
	public void addPages() {
		newAxis2SourceFolderWizardPage = new NewAxis2SourceFolderWizardPage("New Axis2 Service",selectedProject);
		addPage(newAxis2SourceFolderWizardPage);
	}

}
