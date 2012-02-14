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

import java.io.File;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IExportWizard;
import org.eclipse.ui.IWorkbench;
import org.wso2.carbonstudio.eclipse.capp.artifact.axis2.Activator;
import org.wso2.carbonstudio.eclipse.capp.artifact.axis2.core.Axis2Artifact;
import org.wso2.carbonstudio.eclipse.logging.core.ICarbonStudioLog;
import org.wso2.carbonstudio.eclipse.logging.core.Logger;
import org.wso2.carbonstudio.eclipse.utils.file.FileUtils;

/**
 * @deprecated
 * @author saminda
 *
 */
public class Axis2ArchiveExportWizard extends Wizard implements IExportWizard {
	private static ICarbonStudioLog log=Logger.getLog(Activator.PLUGIN_ID);

	private IFile selectedFile;
	private Axis2ArchiveExportWizardPage axis2ArchiveExportWizardPage;
	
	public boolean performFinish() {
		String selectedPath = axis2ArchiveExportWizardPage.getSelectedPath();
		File exportFolder = new File(selectedPath);
		if (!exportFolder.exists()){
			exportFolder.mkdirs();
		}
		try {
//            File deployableArtifact = new Axis2Artifact(selectedFile).getArtifact(true);
//            FileUtils.copy(deployableArtifact, new File(exportFolder,deployableArtifact.getName()));
			//TODO not implemented
            return false;
        } catch (Exception e) {
        	MessageDialog.openError(getShell(), "Axis2 archive", "Error creating axis2 archive: "+e.getMessage());
            log.error(e);
        	return false;
        }
	}

	public void addPages() {
		axis2ArchiveExportWizardPage = new Axis2ArchiveExportWizardPage("Export Axis2 Artifact",selectedFile);
	    addPage(axis2ArchiveExportWizardPage);
	}
	
	public void init(IWorkbench arg0, IStructuredSelection selection) {
		if (selection.getFirstElement() instanceof IFile){
			selectedFile=(IFile) selection.getFirstElement();
		}
	}

}
