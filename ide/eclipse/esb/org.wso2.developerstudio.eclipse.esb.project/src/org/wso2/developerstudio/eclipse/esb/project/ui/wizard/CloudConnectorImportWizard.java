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
import java.util.regex.Pattern;

import net.lingala.zip4j.core.ZipFile;
import net.lingala.zip4j.exception.ZipException;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.wso2.developerstudio.eclipse.esb.project.control.graphicalproject.GMFPluginDetails;
import org.wso2.developerstudio.eclipse.esb.project.control.graphicalproject.IUpdateGMFPlugin;

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
	        try {
	            ZipFile zipFile = new ZipFile(source);
	            String[] segments=source.split(Pattern.quote(File.separator));
	            String zipFileName=segments[segments.length-1].split(".zip")[0];
	    	    String destination = detailWizardPage.getSelectedProject().getLocation().toOSString()+File.separator+"cloudConnectors"+File.separator+zipFileName;
	            zipFile.getFile(); zipFile.extractAll(destination);
	            IUpdateGMFPlugin updateGMFPlugin = GMFPluginDetails.getiUpdateGMFPlugin();
	            if(updateGMFPlugin!=null){
	            	updateGMFPlugin.updateOpenedEditors();
	            }
	        } catch (ZipException e) {
	            e.printStackTrace();
	        }
		return true;
	}

}
