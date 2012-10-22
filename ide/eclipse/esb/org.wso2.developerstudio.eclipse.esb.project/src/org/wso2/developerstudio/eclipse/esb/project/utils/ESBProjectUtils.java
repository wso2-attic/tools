/*
 * Copyright (c) 2011, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.developerstudio.eclipse.esb.project.utils;

import java.util.List;

import javax.xml.stream.FactoryConfigurationError;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.wizards.IWizardDescriptor;
import org.wso2.developerstudio.eclipse.esb.project.Activator;
import org.wso2.developerstudio.eclipse.esb.project.artifact.ESBArtifact;
import org.wso2.developerstudio.eclipse.esb.project.artifact.ESBProjectArtifact;
import org.wso2.developerstudio.eclipse.esb.project.ui.wizard.ESBProjectWizard;
import org.wso2.developerstudio.eclipse.logging.core.IDeveloperStudioLog;
import org.wso2.developerstudio.eclipse.logging.core.Logger;
import org.wso2.developerstudio.eclipse.platform.core.exception.FieldValidationException;

public class ESBProjectUtils {
	
	private static IDeveloperStudioLog log=Logger.getLog(Activator.PLUGIN_ID);
	
	public static IProject createESBProject(Shell shell){
		IWizardDescriptor wizardDesc = PlatformUI.getWorkbench().getNewWizardRegistry().findWizard("org.wso2.developerstudio.eclipse.artifact.newesbproject");
		if (wizardDesc!=null) {
			try {
				IProject esbProject = null;
				ESBProjectWizard esbProjectWizard = (ESBProjectWizard) wizardDesc.createWizard();
				IStructuredSelection selection = (IStructuredSelection) PlatformUI
												.getWorkbench().getActiveWorkbenchWindow()
												.getSelectionService().getSelection();
				esbProjectWizard.init(PlatformUI.getWorkbench(), selection);
				WizardDialog dialog = new WizardDialog(shell, esbProjectWizard);
				dialog.create();
				if(dialog.open() ==Dialog.OK){
					String projectName = esbProjectWizard.getModel().getProjectName();
					esbProject = ResourcesPlugin.getWorkspace().getRoot()
							.getProject(projectName);
				}
				return esbProject;
			} catch (CoreException e) {
				log.error("CoreException has occurred",e);
			}
		}
		return null;
	}
	
	
	public static boolean artifactExists(IProject project, String artifactName) throws Exception {
		ESBProjectArtifact esbProjectArtifact = new ESBProjectArtifact();
		esbProjectArtifact.fromFile(project.getFile("artifact.xml").getLocation().toFile());
		List<ESBArtifact> allArtifacts = esbProjectArtifact.getAllESBArtifacts();
		for (ESBArtifact artifact : allArtifacts) {
			if (artifactName.equalsIgnoreCase(artifact.getName()))
				return true;
		}
		return false;
	}
	
}
