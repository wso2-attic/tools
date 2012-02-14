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

package org.wso2.wsf.ide.creation.ui.wizard;

import java.io.File;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.ui.IExportWizard;
import org.eclipse.ui.IWorkbench;
import org.wso2.carbonstudio.eclipse.logging.core.ICarbonStudioLog;
import org.wso2.carbonstudio.eclipse.logging.core.Logger;
import org.wso2.carbonstudio.eclipse.utils.archive.ArchiveManipulator;
import org.wso2.carbonstudio.eclipse.utils.wst.Axis2ServiceUtils;
import org.wso2.wsf.ide.creation.ui.plugin.WebServiceWSASCreationUIPlugin;

public class Axis2ServiceExportWizard extends Wizard implements IExportWizard {
	private static ICarbonStudioLog log=Logger.getLog(WebServiceWSASCreationUIPlugin.PLUGIN_ID);

	private Axis2ServiceExportWizardPage mainPage;
	private IStructuredSelection selection;
	
	public boolean performFinish() {
		
		String savePath = getSavePath();
		
		if (savePath==null){
			return false;
		}
		IFolder selectedFolder = mainPage.getSelectedFolder();
		ArchiveManipulator archiveManipulator = new ArchiveManipulator();
		String serviceName;
        try {
	        serviceName = Axis2ServiceUtils.getServiceNameFromFolder(selectedFolder.getLocation().toOSString());
			File serviceArchive = new File(savePath,serviceName+".aar");
			archiveManipulator.archiveDir(serviceArchive.toString(), selectedFolder.getLocation().toOSString());
        } catch (Exception e) {
	        log.error(e);
	        return false;
        }
        return true;
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
		mainPage = new Axis2ServiceExportWizardPage("Carbon Application Archive",p);
		mainPage.setTitle("Carbon Application Archive");
//		mainPage.setImageDescriptor(CAppImageUtils.getInstance().getImageDescriptor("car-wizard.png"));
		mainPage.setDescription("CAR export settings");

		addPage(mainPage);
	}
	
	
	private String getSavePath(){
    	String fileName = null;
    	DirectoryDialog dlg = new DirectoryDialog(getShell());
    	//dlg.setFilterExtensions(new String[]{".zip"});
        boolean done = false;
        dlg.setMessage("Select the path to create the carbon application artifact.");
        while (!done) {
          // Open the File Dialog
          fileName = dlg.open();
          if (fileName == null) {
            // User has cancelled, so quit and return
            done = true;
          } else {
            // User has selected a file; see if it already exists
            File file = new File(fileName);
            if (file.exists()) {
              // If they click Yes, we're done and we drop out. If
              // they click No, we redisplay the File Dialog
              done = true;
            } else {
              // File does not exist, so drop out
              done = false;
            }
          }
        }
        return fileName;
    }
}
