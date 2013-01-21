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

package org.wso2.developerstudio.eclipse.esb.project.ui.wizard;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.viewers.ISelection;
import org.wso2.developerstudio.eclipse.esb.project.artifact.ESBProjectArtifact;
import org.wso2.developerstudio.eclipse.esb.project.model.ESBProjectModel;
import org.wso2.developerstudio.eclipse.esb.project.utils.ESBImageUtils;
import org.wso2.developerstudio.eclipse.maven.util.MavenUtils;
import org.wso2.developerstudio.eclipse.platform.ui.wizard.AbstractWSO2ProjectCreationWizard;
import org.wso2.developerstudio.eclipse.utils.project.ProjectUtils;

import java.io.File;

public class ESBProjectWizard extends AbstractWSO2ProjectCreationWizard {
	private static final String ESB_PROJECT_NATURE = "org.wso2.developerstudio.eclipse.esb.project.nature";
	private IProject project;

	public ESBProjectWizard() {
		setModel(new ESBProjectModel());
		setDefaultPageImageDescriptor(ESBImageUtils.getInstance().getImageDescriptor("esb-project-wizard.png"));
	}
	
	public boolean performFinish() {
		try {
			project = createNewProject();
			File pomfile = project.getFile("pom.xml").getLocation().toFile();
			createPOM(pomfile,"pom");
			ProjectUtils.addNatureToProject(project,
											false,
			                                ESB_PROJECT_NATURE);
			MavenUtils
			.updateWithMavenEclipsePlugin(
					pomfile,
					new String[] { },
					new String[] { ESB_PROJECT_NATURE });
			
			//Creating the metadata file artifact.xml while creating the ESB project. It will be hidden and users won't be able to see it via Eclipse.
			ESBProjectArtifact artifact=new ESBProjectArtifact();
			IFile file = project.getFile("artifact.xml");
			artifact.setSource(file.getLocation().toFile());
			artifact.toFile();
			getModel().addToWorkingSet(project);
			//Refresh the project to show the changes. But still won't see the newly created project.
			project.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
			refreshDistProjects();
			//Setting the created file to be hidden so that users won't see it.
			if(file.exists()){
				file.setHidden(true);
			}
		} catch (CoreException e) {
			e.printStackTrace();
			return false;
		} catch (Exception e) {
			e.printStackTrace();
			return false;

		}
		return true;
	}

	
	public IResource getCreatedResource() {
		return project;
	}
	
	public void setCurrentSelection(ISelection currentSelection) {
		// TODO Auto-generated method stub
		super.setCurrentSelection(currentSelection);
	}
}
