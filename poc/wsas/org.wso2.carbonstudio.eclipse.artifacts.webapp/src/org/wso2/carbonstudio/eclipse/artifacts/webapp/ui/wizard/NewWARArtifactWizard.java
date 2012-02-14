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

package org.wso2.carbonstudio.eclipse.artifacts.webapp.ui.wizard;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.stream.FactoryConfigurationError;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.impl.builder.StAXOMBuilder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.ui.intro.IIntroPart;
import org.wso2.carbonstudio.eclipse.artifacts.webapp.Activator;
import org.wso2.carbonstudio.eclipse.artifacts.webapp.utils.WARImageUtils;
import org.wso2.carbonstudio.eclipse.logging.core.ICarbonStudioLog;
import org.wso2.carbonstudio.eclipse.logging.core.Logger;
import org.wso2.carbonstudio.eclipse.maven.executor.IMavenExecutor;
import org.wso2.carbonstudio.eclipse.maven.executor.MavenEnv;
import org.wso2.carbonstudio.eclipse.maven.types.MavenProjectType;
import org.wso2.carbonstudio.eclipse.utils.data.ITemporaryFileTag;
import org.wso2.carbonstudio.eclipse.utils.file.FileUtils;

public class NewWARArtifactWizard extends Wizard implements INewWizard {
	private static ICarbonStudioLog log=Logger.getLog(Activator.PLUGIN_ID);
	private WizardNewProjectCreationPage wizardNewProjectCreationPage;
	private IStructuredSelection selection;
	private static final String ARCHE_TYPE_ID="org.wso2.carbonstudio.eclipse.maven.plugin.war";
	@Override
	public boolean performFinish() {
		try {
			// cAppCARPage.initValues();
			IProject project = wizardNewProjectCreationPage.getProjectHandle();
			if (!project.exists()) {
				URI locationURI = wizardNewProjectCreationPage.getLocationURI();
				File projectLocation;
				boolean inWorkspace=false;
				IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
				TreeSelection tree=(TreeSelection)selection;
				Object firstElement = tree.getFirstElement();
				IProject parentProject=null;
				if (firstElement instanceof IProject && ((IProject)firstElement).hasNature("org.wso2.carbonstudio.eclipse.carbonmodules.project.nature")){
					parentProject=(IProject)firstElement;
					projectLocation=parentProject.getFolder("modules").getFolder(project.getName()).getLocation().toFile();
				}else{
					if (locationURI != null &&
					    workspaceRoot.getLocation()
					            .append(project.getName()).toOSString()
					            .equals(locationURI.getRawPath())) {
						projectLocation = workspaceRoot.getLocation().append(project.getName()).toFile();
						inWorkspace=true;
					} else {
						projectLocation=wizardNewProjectCreationPage.getLocationPath().toFile();
					}
				}
				
				IIntroPart intro = PlatformUI.getWorkbench().getIntroManager().getIntro();
				if (intro != null) {
					PlatformUI.getWorkbench().getIntroManager().closeIntro(intro);
				}

				ITemporaryFileTag createNewTempTag = FileUtils.createNewTempTag();
				MavenProjectType generatedProjectParameter=new MavenProjectType("org.wso2.sample",project.getName(),"1.0.0-SNAPSHOT",null);
				IMavenExecutor mavenExecutor = MavenEnv.getExecutor();
				List<String> ideSettingsGoals=new ArrayList<String>();
				ideSettingsGoals.add("eclipse:eclipse");
				if (parentProject!=null){
					File parentProjectPom = parentProject.getFile("pom.xml").getLocation().toFile();
					mavenExecutor.createArcheType(ARCHE_TYPE_ID, generatedProjectParameter,projectLocation,parentProjectPom);
					mavenExecutor.executeMavenGoal(parentProject.getLocation().toFile(), ideSettingsGoals, true);
				}else{
					mavenExecutor.createArcheType(ARCHE_TYPE_ID, generatedProjectParameter,projectLocation);
					mavenExecutor.executeMavenGoal(projectLocation, ideSettingsGoals, true);
				}
				if (inWorkspace){
					project.create(null);
					project.open(null);
				}else{
					String projectName = getDetermineProjectName(projectLocation);
					if (parentProject!=null){
						parentProject.refreshLocal(IResource.DEPTH_INFINITE, null);
					}
					IProject nestedProject = workspaceRoot.getProject(projectName);
					IProjectDescription newProjectDescription = nestedProject.getWorkspace().newProjectDescription(nestedProject.getName());
					newProjectDescription.setLocationURI(projectLocation.toURI());
					nestedProject.create(newProjectDescription, null);
					nestedProject.open(null);
				}
				createNewTempTag.clearAndEnd();
				return true;
			} else {
				wizardNewProjectCreationPage
				        .setErrorMessage("Could not create artifacts with special characters");
				return false;
			}

		} catch (Exception e) {
			log.error(e);
			return false;
		}
	}

	private String getDetermineProjectName(File path)
			throws FileNotFoundException, FactoryConfigurationError,
			XMLStreamException {
		File eclipseProjectSettingsFile = getEclipseProjectSettingsFile(path);
		 FileInputStream fis= new FileInputStream(eclipseProjectSettingsFile);
		 XMLInputFactory xif= XMLInputFactory.newInstance();
		 XMLStreamReader reader= xif.createXMLStreamReader(fis);
		 StAXOMBuilder builder= new StAXOMBuilder(reader);
		 OMElement lineItem = builder.getDocumentElement();
		 Iterator childrenWithLocalName = lineItem.getChildrenWithLocalName("name");
			String projectName = path.getName();
		 while(childrenWithLocalName.hasNext()){
			 OMElement next = (OMElement)childrenWithLocalName.next();
			 projectName=next.getText();
		 }
		return projectName;
	}

	private void addProjectPaths(File location,List<File> paths){
		File[] locations = location.listFiles();
		for (File path : locations) {
			if (path.isDirectory()){
				if (getEclipseProjectSettingsFile(path).exists()){
					paths.add(path);
				}
				addProjectPaths(path,paths);
			}
		}

		
	}

	private File getEclipseProjectSettingsFile(File path) {
		return new File(path,".project");
	}
	
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		
		this.selection=selection;
	}

	@Override
	public void addPages() {
		wizardNewProjectCreationPage = new WizardNewProjectCreationPage("New Web Application");
		wizardNewProjectCreationPage.setTitle("New Web Application");
		wizardNewProjectCreationPage.setImageDescriptor(WARImageUtils.getInstance().getImageDescriptor("war-wizard.png"));
		addPage(wizardNewProjectCreationPage);
	}
    
}
