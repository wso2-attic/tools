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

package org.wso2.developerstudio.eclipse.platform.ui.wizard;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.apache.maven.project.MavenProject;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import org.wso2.developerstudio.eclipse.logging.core.IDeveloperStudioLog;
import org.wso2.developerstudio.eclipse.logging.core.Logger;
import org.wso2.developerstudio.eclipse.maven.util.MavenUtils;
import org.wso2.developerstudio.eclipse.platform.core.Activator;
import org.wso2.developerstudio.eclipse.platform.core.model.MavenInfo;
import org.wso2.developerstudio.eclipse.platform.core.project.model.ProjectDataModel;
import org.wso2.developerstudio.eclipse.platform.core.project.model.ProjectWizardSettings;
import org.wso2.developerstudio.eclipse.platform.ui.wizard.pages.MavenDetailsPage;
import org.wso2.developerstudio.eclipse.platform.ui.wizard.pages.ProjectOptionsDataPage;
import org.wso2.developerstudio.eclipse.platform.ui.wizard.pages.ProjectOptionsPage;

public abstract class AbstractWSO2ProjectCreationWizard extends Wizard implements INewWizard,
                                                                      IExecutableExtension {
	private static IDeveloperStudioLog log=Logger.getLog(Activator.PLUGIN_ID);
	private ProjectDataModel model;
	private IConfigurationElement configElement;
	private ISelection currentSelection;
	final String DIST_EDITOR_ID = "org.wso2.developerstudio.eclipse.distribution.project.editor.DistProjectEditor";

	
	public void addPages() {
		URL resource = getWizardManifest();
		try {
			ProjectWizardSettings settings =
			        new ProjectWizardSettings(resource.openStream(), configElement);
			if (settings.getProjectOptions().size() == 1) {
				getModel().setSelectedOption(settings.getProjectOptions().get(0).getId());
			} else {
				addPage(new ProjectOptionsPage(settings, getModel()));
			}
			addPage(new ProjectOptionsDataPage(settings, getModel(), getCurrentSelection(),
			        isRequireProjectLocationSection(), isRequiredWorkingSet()));
			if (isProjectWizard()){
				addPage(new MavenDetailsPage(getModel()));
			}
			
		} catch (Exception e) {
			log.error("error adding pages", e);
		}
	}

	protected boolean isProjectWizard() {
		String projectAttr = configElement.getAttribute("project");
		return projectAttr!=null && projectAttr.equals("true");
	}

	protected boolean isRequireProjectLocationSection() {
		return true;
	}

	protected boolean isRequiredWorkingSet(){
		return true;
	}
	
	public void setInitializationData(IConfigurationElement configElement, String arg1, Object arg2)
	        throws CoreException {
		this.configElement = configElement;

	}

	protected URL getWizardManifest() {
		if(configElement != null){
			String wizardManifestPath = configElement.getAttribute("wizardManifest");
			return Platform.getBundle(configElement.getContributor().getName())
			        .getResource(wizardManifestPath);
		}
		return null;
	}

	
	public void init(IWorkbench arg0, IStructuredSelection selection) {
		setCurrentSelection(selection);
	}

	public void setModel(ProjectDataModel model) {
		this.model = model;
	}

	public ProjectDataModel getModel() {
		return model;
	}

	public IProject createNewProject() throws CoreException {
		String name = getModel().getProjectName();
		File location = getModel().getLocation();
		String rootWorkspaceLocation =
		        ResourcesPlugin.getWorkspace().getRoot().getLocation().toOSString() +
		                File.separator + name;
		IProgressMonitor progressMonitor = new NullProgressMonitor();
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IProject project = root.getProject(name);
		if (rootWorkspaceLocation.equals(location.getPath())) {
			project.create(progressMonitor);
			project.open(progressMonitor);
		} else {
			IProjectDescription newProjectDescription =
			        project.getWorkspace().newProjectDescription(name);
			newProjectDescription.setLocationURI(location.toURI());
			project.create(newProjectDescription, null);
			project.open(null);
		}
		return project;
	}

	public void createPOM(File pomLocation) throws Exception {
		MavenInfo mavenInfo = getModel().getMavenInfo();
		MavenProject mavenProject =
		        MavenUtils.createMavenProject(mavenInfo.getGroupId(), mavenInfo.getArtifactId(),
		                                      mavenInfo.getVersion(), mavenInfo.getPackageName());
		MavenUtils.saveMavenProject(mavenProject, pomLocation);
	}
	
	public void createPOM(File pomLocation, String packagingType) throws Exception {
		MavenInfo mavenInfo = getModel().getMavenInfo();
		MavenProject mavenProject =
		        MavenUtils.createMavenProject(mavenInfo.getGroupId(), mavenInfo.getArtifactId(),
		                                      mavenInfo.getVersion(), packagingType);
		MavenUtils.saveMavenProject(mavenProject, pomLocation);
	}
	
	public String getMavenGroupId(File pomLocation){
		String groupId = "org.wso2.carbon";
		if(pomLocation!=null && pomLocation.exists()){
			try {
				MavenProject mavenProject = MavenUtils.getMavenProject(pomLocation);
				groupId = mavenProject.getGroupId();
			} catch (Exception e) {
				log.error("error reading pom file", e);
			}
		}
		return groupId;
	}
	
	public void refreshDistProjects(){
		try {
			IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
			IWorkbenchPage page = window.getActivePage();
			List<IEditorReference> openEditors = new ArrayList<IEditorReference>();
			List<IFile> openFiles = new ArrayList<IFile>();
			IEditorReference[] editorReferences = PlatformUI.getWorkbench()
					.getActiveWorkbenchWindow().getActivePage().getEditorReferences();
			for (IEditorReference iEditorReference : editorReferences) {
				if (DIST_EDITOR_ID.equals(iEditorReference.getId())) {
					openEditors.add(iEditorReference);
					IEditorInput editorInput = iEditorReference.getEditorInput();
					if (editorInput instanceof FileEditorInput) {
						openFiles.add(((FileEditorInput) editorInput).getFile());
					}
				}
			}
			if (openEditors.size() > 0) {
				page.closeEditors(openEditors.toArray(new IEditorReference[] {}), false);
			}
			for (IFile file : openFiles) {
				page.openEditor(new FileEditorInput(file), DIST_EDITOR_ID);
			}
		} catch (Exception e) { /* ignore */}
	}

	public void setCurrentSelection(ISelection currentSelection) {
		this.currentSelection = currentSelection;
	}

	public ISelection getCurrentSelection() {
		return currentSelection;
	}

	public abstract IResource getCreatedResource();
}
