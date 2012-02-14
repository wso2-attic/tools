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

package org.wso2.carbonstudio.eclipse.capp.artifact.registry.core;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.wso2.carbonstudio.eclipse.capp.artifact.registry.Activator;
import org.wso2.carbonstudio.eclipse.capp.artifact.registry.ui.wizard.NewRegistryArtifactWizard;
import org.wso2.carbonstudio.eclipse.capp.artifact.registry.utils.RegistryImageUtils;
import org.wso2.carbonstudio.eclipse.capp.artifact.registry.utils.RegistryProjectUtils;
import org.wso2.carbonstudio.eclipse.capp.core.artifacts.IArtifact;
import org.wso2.carbonstudio.eclipse.capp.core.artifacts.IArtifactSourcePath;
import org.wso2.carbonstudio.eclipse.capp.core.artifacts.ICAppArtifactHandler;
import org.wso2.carbonstudio.eclipse.capp.core.artifacts.configure.ICAppProjectSettings;
import org.wso2.carbonstudio.eclipse.capp.core.artifacts.manager.ICAppArtifactManager;
import org.wso2.carbonstudio.eclipse.capp.core.artifacts.manager.IServerRole;
import org.wso2.carbonstudio.eclipse.capp.core.artifacts.manager.ServerRoleManager;
import org.wso2.carbonstudio.eclipse.capp.core.data.CAppProperty;
import org.wso2.carbonstudio.eclipse.capp.core.manifest.Artifact;
import org.wso2.carbonstudio.eclipse.capp.core.ui.utils.EditorPageConstants;
import org.wso2.carbonstudio.eclipse.capp.core.ui.wizard.AbstractNewArtifactWizard;
import org.wso2.carbonstudio.eclipse.capp.core.utils.ArtifactBundleCreator;
import org.wso2.carbonstudio.eclipse.capp.core.utils.Constants;
import org.wso2.carbonstudio.eclipse.logging.core.ICarbonStudioLog;
import org.wso2.carbonstudio.eclipse.logging.core.Logger;

public class RegistryArtifactHandler implements ICAppArtifactHandler {
	private static ICarbonStudioLog log=Logger.getLog(Activator.PLUGIN_ID);

	private static String name = "Registry Resource";
	private static String description = "Registry Artifact";
	private static ICAppArtifactManager cappArtifactManager;
	private final static String ARTIFACT_TYPE="registry/resource";
	
	public void createArtifactDefaultPath(
			org.eclipse.core.resources.IProject project,
			ICAppProjectSettings projectSettings) throws Exception {
		List<CAppProperty> settings = RegistryProjectUtils.getProjectRegistryPaths(projectSettings);
		boolean defaultPathExists = false;
		for (CAppProperty cAppProperty : settings) {
			if (Constants.DEFAULT_PATH.equals(cAppProperty.getData().toString())) {
				defaultPathExists = true;
				break;
			}
		}
		if (!defaultPathExists) {
			RegistryProjectUtils.createDirectory(project, Constants.DEFAULT_PATH);
			RegistryProjectUtils.addProjectRegistryPathToSettings(projectSettings,Constants.DEFAULT_PATH);
		}
		
	}

	public void createArtifactPath(org.eclipse.core.resources.IFolder folder,
			ICAppProjectSettings projectSettings) throws Exception {

		RegistryProjectUtils.createDirectory(folder.getProject(), folder.getFullPath().removeFirstSegments(1).toString());
		if (!isArtifactPathAlreadyDefined(folder, projectSettings)){
			RegistryProjectUtils.addProjectRegistryPathToSettings(projectSettings,folder.getFullPath().removeFirstSegments(1).toString());
		}
	}

	public IArtifactSourcePath[] getArtifactPathModelsForCAppProjectContent(
			org.eclipse.core.resources.IProject project,
			ICAppProjectSettings projectSettings) throws Exception {
//		List<CAppProperty> projectRegistryPaths = RegistryProjectUtils.getProjectRegistryPaths(projectSettings);
//		ArrayList<RegistryArtifactLocationNode> registryArtifactLocationNodes = new ArrayList<RegistryArtifactLocationNode>();
//		for (CAppProperty cAppProperty : projectRegistryPaths) {
//			registryArtifactLocationNodes.add(new RegistryArtifactLocationNode(cAppProperty.getData().toString(), project));
//        }
		return null;
	}
	
	public boolean isArtifactPathAlreadyDefined(IFolder folder,  ICAppProjectSettings projectSettings){
		try {
			
			IArtifactSourcePath[] artifactPathModels = getArtifactPathModelsForCAppProjectContent(folder.getProject(), projectSettings);
			for (IArtifactSourcePath artifactPathModel : artifactPathModels) {
	            if (folder.getProject().getFolder(artifactPathModel.getSourceFolderPath()).getLocation().toOSString().equals(folder.getLocation().toOSString())){
	            	return true;
	            }
            }
        } catch (Exception e) {
	        log.error(e);
        }
        return false;
	}

	public String getDescription() {
		return description;
	}

	public String getID() {
		return Constants.ID;
	}

	public String getName() {
		return name;
	}

	public boolean isFolderArtifactPath(
			org.eclipse.core.resources.IFolder folder,
			ICAppProjectSettings projectSettings) throws Exception {
		List<CAppProperty> projectRegistryPaths = RegistryProjectUtils.getProjectRegistryPaths(projectSettings);
		for (CAppProperty cAppProperty : projectRegistryPaths) {
			String path = cAppProperty.getData().toString();
			String[] pathElements = path.split("/");
			IProject resource=folder.getProject();
			String lastPath="";
			for (String pathElement : pathElements) {
				lastPath=lastPath+pathElement+"/";
				IFolder intermediateFolder=resource.getFolder(lastPath);
				if (intermediateFolder.getFullPath().toOSString().equals(folder.getFullPath().toOSString()))
					return true;
            }
        }
		return false;
	}

    public void deleteArtifactPath(IFolder folder, ICAppProjectSettings projectSettings)
                                                                                        throws Exception {
		RegistryProjectUtils.deleteDirectory(folder);
		detachArtifactPath(folder, projectSettings);
    }

	public void detachArtifactPath(IFolder folder,
			ICAppProjectSettings projectSettings) throws Exception {
    	RegistryProjectUtils.removeProjectRegistryPathFromSettings(projectSettings, folder.getFullPath().removeFirstSegments(1).toString());

	}

	public ImageDescriptor getArtifactIcon() {
		return RegistryImageUtils.getInstance().getImageDescriptor("registry-artifact-16x16.png");
	}

	public ImageDescriptor getArtifactImage() {
		return RegistryImageUtils.getInstance().getImageDescriptor("registry-artifact-24x24.png");
	}

	public ImageDescriptor getArtifactOverlayIcon() {
		return RegistryImageUtils.getInstance().getImageDescriptor("registry-artifact-12x12.png");
	}

	public String getArtifactType() {
		return getType();
	}
	
    public static String getType() {
    	return ARTIFACT_TYPE;
    }

    public static ICAppArtifactManager getCAppArtifactManager(){
    	return cappArtifactManager;
    }

    public void setArtifactManager(ICAppArtifactManager artifactManager) {
    	cappArtifactManager=artifactManager;
    }
    
	public IArtifact[] getDeployableArtifacts(
			ICAppProjectSettings projectSettings, Object artifactPathModel) {
		return null;
	}

    public AbstractNewArtifactWizard getNewArtifactWizard(IStructuredSelection selection) {
    	return new NewRegistryArtifactWizard();
    }

    public File getBundle(File location, Artifact artifact, String parentApplication) throws Exception{
	    return new ArtifactBundleCreator(artifact, location, parentApplication).getBundle();
    }
	
	public Map<Artifact,File> createArtifactContent(File location, Artifact artifact, File artifactContentLocation) throws Exception {
    	return new ArtifactBundleCreator(artifact, location, null).getArtifactContent(artifactContentLocation);
    }
	public String getGroupID() {
		return EditorPageConstants.GROUP_NEW_MENU+".registry";
	}

	public boolean isStratosEnabled(){
		return Constants.STRATOS_ENABLED;
	}
	
	public String[] getPossibleDependentArtifactTypes() {
		return new String[]{};
	}

	public String[] getPossibleDependencyArtifactTypes() {
		return new String[] {"lib/carbon/ui","registry/resource","lib/registry/handlers","lib/library/bundle"};
	}

    public List<IServerRole> getSupportingServerRoles() {
    	List<IServerRole> serverRoles = new ArrayList<IServerRole>();
    	serverRoles.add(ServerRoleManager.SR_APP_SERVER);
    	serverRoles.add(ServerRoleManager.SR_DS_SERVER);
    	serverRoles.add(ServerRoleManager.SR_ESB_SERVER);
    	serverRoles.add(ServerRoleManager.SR_BRS_SERVER);
    	serverRoles.add(ServerRoleManager.SR_BPS_SERVER);
    	serverRoles.add(ServerRoleManager.SR_GREG_SERVER);
    	serverRoles.add(ServerRoleManager.SR_IS_SERVER);
    	serverRoles.add(ServerRoleManager.SR_BAM_SERVER);
    	serverRoles.add(ServerRoleManager.SR_GS_SERVER);
    	serverRoles.add(ServerRoleManager.SR_MS_SERVER);
	    return serverRoles;
    }

    public IServerRole getDefaultServerRole() {
	    return ServerRoleManager.SR_GREG_SERVER;
    }
}
