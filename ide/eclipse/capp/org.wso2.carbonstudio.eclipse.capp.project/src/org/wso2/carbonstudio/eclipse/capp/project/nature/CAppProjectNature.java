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

package org.wso2.carbonstudio.eclipse.capp.project.nature;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.wst.common.project.facet.core.IFacetedProject;
import org.eclipse.wst.common.project.facet.core.IProjectFacet;
import org.eclipse.wst.common.project.facet.core.ProjectFacetsManager;
import org.wso2.carbonstudio.eclipse.capp.core.artifacts.ICAppArtifactHandler;
import org.wso2.carbonstudio.eclipse.capp.core.artifacts.manager.IServerRole;
import org.wso2.carbonstudio.eclipse.capp.core.manifest.Artifact;
import org.wso2.carbonstudio.eclipse.capp.core.model.CARDescriptor;
import org.wso2.carbonstudio.eclipse.capp.maven.utils.MavenPomGenPluginUtils;
import org.wso2.carbonstudio.eclipse.capp.project.Activator;
import org.wso2.carbonstudio.eclipse.capp.project.manager.CAppArtifactManager;
import org.wso2.carbonstudio.eclipse.capp.project.utils.CAppConstants;
import org.wso2.carbonstudio.eclipse.logging.core.ICarbonStudioLog;
import org.wso2.carbonstudio.eclipse.logging.core.Logger;
import org.wso2.carbonstudio.eclipse.utils.jdt.JavaUtils;
import org.wso2.carbonstudio.eclipse.utils.project.ProjectUtils;

public class CAppProjectNature implements IProjectNature {
	private static ICarbonStudioLog log=Logger.getLog(Activator.PLUGIN_ID);

	IProject project;
	private static Map<String, List<ICAppArtifactHandler>> defaultHandlersForProject;
	private static Map<String, CARDescriptor> carDescriptorsForProject;
	
	public static Map<String, List<ICAppArtifactHandler>> getDefaultHanldersForProject(){
		if (defaultHandlersForProject==null){
			defaultHandlersForProject=new HashMap<String, List<ICAppArtifactHandler>>();
		}
		return defaultHandlersForProject;
	}
	
	public static void addArtifactHandlerForProject(IProject project,List<ICAppArtifactHandler> handlers){
		 getDefaultHanldersForProject().put(project.getName(), handlers);
	}
	
	public static void addCARDescriptorForProject(IProject project,CARDescriptor descriptor){
		 getCarDescriptorsForProject().put(project.getName(), descriptor);
	}
	
	public void configure() throws CoreException {

		addJavaDevelopmentFunctionality();
		
		IFacetedProject fp = ProjectFacetsManager.create(getProject(), true, null);
		IProjectFacet projectFacet = ProjectFacetsManager.getProjectFacet("org.wso2.carbonstudio.eclipse.carbon.facetId");
		fp.installProjectFacet(projectFacet.getDefaultVersion(), null, null);

		Artifact artifact = new Artifact(CAppArtifactManager.getInstance().getSuperArtifactFile(getProject()));
		artifact.setName(getProject().getName());
		artifact.setVersion(DataConstants.SUPER_ARTIFACT_DEFAULT_VERSION);
		artifact.setType(DataConstants.SUPER_ARTIFACT_TYPE);
		try {
	        
	        CAppArtifactManager.getInstance().createSuperArtifact(getProject(), artifact);
//	        IDE.openEditor(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage(), artifact.getSource());
	        
	        ProjectUtils.createFolder(getProject().getFolder(CAppConstants.CAPP_ARTIFACTS_FOLDER_NAME));
	        setupServerRoles();
	        createMavenCAppProjectConfigurationFile(artifact);
	        
        } catch (Exception e) {
	        log.error(e);
		}
	}

	private void createMavenCAppProjectConfigurationFile(Artifact artifact)
			throws CoreException, Exception {
		String groupId = "org.wso2.capp";
		String artifactId = artifact.getName()+".builder";
		String version = artifact.getVersion();
		String packagingType = "pom";
		MavenPomGenPluginUtils.createMavenCAppProject(groupId, artifactId, version, packagingType, getProject(), new File(getProject().getLocation().toFile(),"pom.xml"),artifactId+".parent");
	}

	private void setupServerRoles() {
	    List<IServerRole> defaultServerRolesForArtifacts = CAppArtifactManager.getInstance().getDefaultServerRolesForArtifacts();
	    for (IServerRole serverRole : defaultServerRolesForArtifacts) {
		    CAppArtifactManager.getInstance().addServerRole(getProject(), serverRole);
        }
    }

	private void addJavaDevelopmentFunctionality() throws CoreException, JavaModelException {
		IProject project=getProject();
		IFolder sourceFolder = project.getFolder("src").getFolder("main").getFolder("java");
		JavaUtils.addJavaSupportAndSourceFolder(project, sourceFolder);
    }

	

	
	public void createDirectory(IProject project, List<String> foldersToCreate) throws CoreException {
		ArrayList<String> missingParent = new ArrayList<String>();
		for (String folderName : foldersToCreate) {
			IFolder folder = project.getFolder(folderName);
			if (!folder.exists()) {
				if (folder.getParent().exists()) {
					folder.create(IResource.NONE, true, null);
				} else {
					missingParent.add(folderName);
				}
			}
		}
		if (missingParent.size() > 0) {
			createDirectory(project, missingParent);
		}
	}

	public void deconfigure() throws CoreException {

	}

	public IProject getProject() {
		return project;
	}

	public void setProject(IProject project) {
		this.project = project;
	}

	public static Map<String, CARDescriptor> getCarDescriptorsForProject() {
		if (carDescriptorsForProject==null)
			carDescriptorsForProject=new HashMap<String, CARDescriptor>();
	    return carDescriptorsForProject;
    }

}
