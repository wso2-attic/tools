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
import java.net.URI;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.ui.intro.IIntroPart;
import org.wso2.developerstudio.eclipse.capp.core.model.CARDescriptor;
import org.wso2.developerstudio.eclipse.capp.core.utils.ArtifactFileUtils;
import org.wso2.developerstudio.eclipse.capp.project.Activator;
import org.wso2.developerstudio.eclipse.capp.project.nature.CAppProjectNature;
import org.wso2.developerstudio.eclipse.capp.project.utils.CAppConstants;
import org.wso2.developerstudio.eclipse.capp.project.utils.CAppImageUtils;
import org.wso2.developerstudio.eclipse.logging.core.IDeveloperStudioLog;
import org.wso2.developerstudio.eclipse.logging.core.Logger;
import org.wso2.developerstudio.eclipse.utils.project.ProjectUtils;

public class CAppProjectWizard extends Wizard implements INewWizard {
	private static IDeveloperStudioLog log=Logger.getLog(Activator.PLUGIN_ID);

	private WizardNewProjectCreationPage wizardNewProjectCreationPage;
	private IProject createdProject;
//	private CAppProjectArtifactsPage cAppProjectArtifactsPage;
//	private CAppCARPage cAppCARPage;

	public IProject getCreatedProject() {
		return createdProject;
	}

	public void setCreatedProject(IProject createdProject) {
		this.createdProject = createdProject;
	}

	public CAppProjectWizard() {
		super();
		setNeedsProgressMonitor(true);
		setWindowTitle("WSO2 C-App Project");
	}

	public boolean performFinish() {
		try {
//			cAppCARPage.initValues();
			IProject project = wizardNewProjectCreationPage.getProjectHandle();
			setCreatedProject(project);
			if (!project.exists() && !ArtifactFileUtils.isSpecialCharactersExist(project.getName())){
				URI locationURI = wizardNewProjectCreationPage.getLocationURI();
				String path = locationURI.getPath();
				path = path.substring(1, path.length());
				
				String workspaceProjectPath = ResourcesPlugin.getWorkspace().getRoot().getLocation().append(project.getName()).toOSString();
				if(workspaceProjectPath.startsWith(File.separator)){
					workspaceProjectPath = workspaceProjectPath.substring(1);
				}
				
				String[] pathSplit = path.split("/");
				String osPath = pathSplit[0];
				for (int i = 1; i < pathSplit.length; i++ ) {
					if(!pathSplit[i].equals("")){
						osPath += File.separator + pathSplit[i];
					}
					
				}
				IProjectDescription desc= project.getWorkspace().newProjectDescription(project.getName());
				if (locationURI != null && workspaceProjectPath.equals(osPath)) {
					locationURI= null;
					project.create(null);
				}else{
					desc.setLocationURI(locationURI);
					project.create(desc, null);
				}
				
				IIntroPart intro = PlatformUI.getWorkbench().getIntroManager().getIntro();
				if (intro!=null){
					PlatformUI.getWorkbench().getIntroManager().closeIntro(intro);
				}

				CARDescriptor carDescriptor = new CARDescriptor();
				CAppProjectNature.addCARDescriptorForProject(project, carDescriptor);
				project.open(new NullProgressMonitor());
				ProjectUtils.addNatureToProject(project,false, CAppConstants.CAPP_NATURE_ID );
				PlatformUI.getWorkbench().showPerspective("org.eclipse.jst.j2ee.J2EEPerspective", PlatformUI.getWorkbench().getActiveWorkbenchWindow());
				return true;
			}else{
				wizardNewProjectCreationPage.setErrorMessage("Could not create artifacts with special characters");
				return false;
			}
		} catch (Exception e) {
			log.error(e);
			return false;
		}
	}

	public void init(IWorkbench workbench, IStructuredSelection selection) {

	}
	
//	public IWizardPage getNextPage(IWizardPage page) {
//		IWizardPage nextPage = super.getNextPage(page);
//		if (nextPage instanceof CAppCARPage){
//			((CAppCARPage)nextPage).initValues();
//		}
//	    return nextPage;
//	}

	public void addPages() {
		wizardNewProjectCreationPage = new WizardNewProjectCreationPage("New C-App Project");
//		cAppCARPage = new CAppCARPage("CAR Attributes", wizardNewProjectCreationPage);
//		cAppProjectArtifactsPage = new CAppProjectArtifactsPage("Artifact settings");
		wizardNewProjectCreationPage.setTitle("New Carbon Application Project");
		wizardNewProjectCreationPage.setImageDescriptor(CAppImageUtils.getInstance().getImageDescriptor("cApp-wizard.png"));
//		wizardNewProjectCreationPage.setDescription("Create a CApp project in the workspace or in an external location.");
		addPage(wizardNewProjectCreationPage);
//		addPage(cAppCARPage);
//		addPage(cAppProjectArtifactsPage);
	}
}
