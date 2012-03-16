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

package org.wso2.developerstudio.eclipse.general.project.ui.wizard;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.wso2.developerstudio.eclipse.general.project.artifact.GeneralProjectArtifact;
import org.wso2.developerstudio.eclipse.general.project.model.GeneralProjectModel;
import org.wso2.developerstudio.eclipse.platform.ui.wizard.AbstractWSO2ProjectCreationWizard;
import org.wso2.developerstudio.eclipse.utils.jdt.JavaUtils;
import org.wso2.developerstudio.eclipse.utils.project.ProjectUtils;
import org.eclipse.jdt.core.IJavaProject;

import java.io.File;

public class GeneralProjectWizard extends AbstractWSO2ProjectCreationWizard {
	private IProject project;

	public GeneralProjectWizard() {
		setModel(new GeneralProjectModel());
	}

	
	public boolean performFinish() {
		try {
			project = createNewProject();
			JavaUtils.addJavaNature(project,false);
			File pomfile = project.getFile("pom.xml").getLocation().toFile();
			createPOM(pomfile,"pom");
			
			ProjectUtils.addNatureToProject(project,
			                                false, "org.wso2.developerstudio.eclipse.general.project.nature");
			

			//Creating the metadata file artifact.xml while creating the ESB project. It will be hidden and users won't be able to see it via Eclipse.
			GeneralProjectArtifact artifact=new GeneralProjectArtifact();
			IFile file = project.getFile("artifact.xml");
			artifact.setSource(file.getLocation().toFile());
			artifact.toFile();
			//Refresh the project to show the changes. But still won't see the newly created project.
			project.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
			
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
}
