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

package org.wso2.developerstudio.eclipse.esb.project.ui.wizard;

import java.io.File;

import net.lingala.zip4j.core.ZipFile;
import net.lingala.zip4j.exception.ZipException;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;

public class CloudConnectorImportWizard extends Wizard{
	
	private ImportCloudConnectorDetailsWizardPage detailWizardPage;
	
	public void init(IStructuredSelection selection) {
		detailWizardPage = new ImportCloudConnectorDetailsWizardPage(selection);
	}
	
	public void addPages() {
		addPage(detailWizardPage);
		super.addPages();
	}
	
	public boolean performFinish() {
		
	    String source = detailWizardPage.getCloudConnectorPath();	    
	    String destination = detailWizardPage.getSelectedProject().getLocation().toOSString()+File.separator+"cloudConnectors";

	        try {
	            ZipFile zipFile = new ZipFile(source);
	            String[] segments=source.split(File.separator);
	            String zipFileName=segments[segments.length-1].split(".zip")[0];
	            zipFile.getFile(); zipFile.extractAll(destination); 
	        } catch (ZipException e) {
	            e.printStackTrace();
	        }
		return true;
	}

}
