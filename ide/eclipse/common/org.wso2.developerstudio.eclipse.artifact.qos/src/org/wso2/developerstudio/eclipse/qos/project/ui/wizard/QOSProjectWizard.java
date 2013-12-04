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

package org.wso2.developerstudio.eclipse.qos.project.ui.wizard;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.axiom.om.OMElement;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.PlatformUI;
import org.wso2.developerstudio.eclipse.logging.core.IDeveloperStudioLog;
import org.wso2.developerstudio.eclipse.logging.core.Logger;
import org.wso2.developerstudio.eclipse.maven.util.MavenUtils;
import org.wso2.developerstudio.eclipse.platform.ui.wizard.AbstractWSO2ProjectCreationWizard;
import org.wso2.developerstudio.eclipse.qos.Activator;
import org.wso2.developerstudio.eclipse.qos.project.model.QOSProjectModel;
import org.wso2.developerstudio.eclipse.qos.project.utils.QOSImageUtils;
import org.wso2.developerstudio.eclipse.utils.file.FileUtils;
import org.wso2.developerstudio.eclipse.utils.project.ProjectUtils;

public class QOSProjectWizard extends AbstractWSO2ProjectCreationWizard {
	private static IDeveloperStudioLog log=Logger.getLog(Activator.PLUGIN_ID);
	private static final String QOS_PROJECT_NATURE = "org.wso2.developerstudio.eclipse.qos.project.nature";
	private IProject project;
	private QOSProjectModel qosProjectModel;
	private File pomfile;
	private Map<File,String> fileList = new HashMap<File,String>();

	public QOSProjectWizard() {
		setEsbProjectModel(new QOSProjectModel());
		setModel(qosProjectModel);
//		setDefaultPageImageDescriptor(QOSImageUtils.getInstance().getImageDescriptor("esb-project-wizard.png"));
	}
	
	public boolean performFinish() {
		try {
			project = createNewProject();
			pomfile = project.getFile("pom.xml").getLocation().toFile();
			createPOM(pomfile,"service/meta");
			ProjectUtils.addNatureToProject(project,
											false,
			                                QOS_PROJECT_NATURE);
			MavenUtils
			.updateWithMavenEclipsePlugin(
					pomfile,
					new String[] { },
					new String[] { QOS_PROJECT_NATURE });
			
			getModel().addToWorkingSet(project);
			//Refresh the project to show the changes. But still won't see the newly created project.
			project.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
			refreshDistProjects();
		}catch (Exception e) {
			MessageDialog.openError(getShell(), "Error while creating the project",
                    e.getMessage());
			return false;

		}
		return true;
	}
	

	public QOSProjectModel getEsbProjectModel() {
		return qosProjectModel;
	}

	public void setEsbProjectModel(QOSProjectModel esbProjectModel) {
		this.qosProjectModel = esbProjectModel;
	}
	
	public IResource getCreatedResource() {
		return project;
	}
	
	public void setCurrentSelection(ISelection currentSelection) {
		// TODO Auto-generated method stub
		super.setCurrentSelection(currentSelection);
	}
}
