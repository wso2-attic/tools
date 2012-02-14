/*
 * Copyright (c) 2010, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
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

package org.wso2.carbonstudio.eclipse.capp.artifact.axis2.core;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.wso2.carbonstudio.eclipse.capp.artifact.axis2.Activator;
import org.wso2.carbonstudio.eclipse.capp.artifact.axis2.model.Axis2ArtifactLocationNode;
import org.wso2.carbonstudio.eclipse.capp.artifact.axis2.ui.wizard.NewAxis2ArtifactWizard;
import org.wso2.carbonstudio.eclipse.capp.artifact.axis2.utils.Axis2ArtifactBundleCreator;
import org.wso2.carbonstudio.eclipse.capp.artifact.axis2.utils.Axis2ImageUtils;
import org.wso2.carbonstudio.eclipse.capp.artifact.axis2.utils.Axis2ProjectUtils;
import org.wso2.carbonstudio.eclipse.capp.artifact.axis2.utils.SettingsConstants;
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
import org.wso2.carbonstudio.eclipse.capp.core.utils.Constants;
import org.wso2.carbonstudio.eclipse.logging.core.ICarbonStudioLog;
import org.wso2.carbonstudio.eclipse.logging.core.Logger;

public class Axis2ArtifactHandler implements ICAppArtifactHandler {
	private static ICarbonStudioLog log = Logger.getLog(Activator.PLUGIN_ID);

	private final static String name = "Axis2 Service";
	private final static String description = "AXIS2 Artifact";
	private static ICAppArtifactManager cappArtifactManager;
	private final static String ARTIFACT_TYPE = "service/axis2";

	public String getDescription() {
		return description;
	}

	public String getID() {
		return SettingsConstants.ID;
	}

	public String getName() {
		return name;
	}

	public void createArtifactDefaultPath(IProject project, ICAppProjectSettings projectSettings)
	        throws Exception {
		// List<CAppProperty> settings =
		// ProjectUtils.getProjectAxis2Paths(projectSettings);
		// boolean defaultPathExists = false;
		// for (CAppProperty cAppProperty : settings) {
		// if
		// (SettingsConstants.DEFAULT_PATH.equals(cAppProperty.getData().toString()))
		// {
		// defaultPathExists = true;
		// break;
		// }
		// }
		// if (!defaultPathExists) {
		// ProjectUtils.createDirectory(project,
		// SettingsConstants.DEFAULT_PATH);
		// if
		// (!isArtifactPathAlreadyDefined(project.getFolder(SettingsConstants.DEFAULT_PATH),
		// projectSettings)){
		// ProjectUtils.addProjectAxis2PathToSettings(projectSettings,SettingsConstants.DEFAULT_PATH);
		// }
		// }
	}

	public void createArtifactPath(IFolder folder, ICAppProjectSettings projectSettings)
	        throws Exception {
		// ProjectUtils.createDirectory(folder.getProject(),
		// folder.getFullPath().removeFirstSegments(1).toString());
		// if (!isArtifactPathAlreadyDefined(folder, projectSettings)){
		// ProjectUtils.addProjectAxis2PathToSettings(projectSettings,folder.getFullPath().removeFirstSegments(1).toString());
		// }
	}

	public IArtifactSourcePath[] getArtifactPathModelsForCAppProjectContent(IProject project,
	        ICAppProjectSettings projectSettings) throws Exception {
		List<CAppProperty> projectAxis2Paths =
		                                       Axis2ProjectUtils
		                                               .getProjectAxis2Paths(projectSettings);
		ArrayList<IArtifactSourcePath> axis2ArtifactLocationNodes =
		                                                            new ArrayList<IArtifactSourcePath>();
		for (CAppProperty cAppProperty : projectAxis2Paths) {
			axis2ArtifactLocationNodes.add(new Axis2ArtifactLocationNode(project, cAppProperty
			        .getData().toString()));
		}
		return axis2ArtifactLocationNodes.toArray(new IArtifactSourcePath[] {});
	}

	public boolean isArtifactPathAlreadyDefined(IFolder folder, ICAppProjectSettings projectSettings) {
		try {

			IArtifactSourcePath[] artifactPathModels =
			                                           getArtifactPathModelsForCAppProjectContent(
			                                                                                      folder
			                                                                                              .getProject(),
			                                                                                      projectSettings);
			for (IArtifactSourcePath artifactPathModel : artifactPathModels) {
				if (folder.getProject().getFolder(artifactPathModel.getSourceFolderPath())
				        .getLocation().toOSString().equals(folder.getLocation().toOSString())) {
					return true;
				}
			}
		} catch (Exception e) {
			log.error(e);
		}
		return false;
	}

	public boolean isFolderArtifactPath(IFolder folder, ICAppProjectSettings projectSettings)
	        throws Exception {
		List<CAppProperty> projectAxis2Paths =
		                                       Axis2ProjectUtils
		                                               .getProjectAxis2Paths(projectSettings);
		for (CAppProperty cAppProperty : projectAxis2Paths) {
			String path = cAppProperty.getData().toString();
			// String[] pathElements = path.split("/");
			IProject resource = folder.getProject();
			// String lastPath="";
			// for (String pathElement : pathElements) {
			// lastPath=lastPath+pathElement+"/";
			// IFolder intermediateFolder=resource.getFolder(lastPath);
			// if
			// (intermediateFolder.getFullPath().toOSString().equals(folder.getFullPath().toOSString()))
			// return true;
			// }
			IFolder intermediateFolder = resource.getFolder(path);
			if (intermediateFolder.getFullPath().toOSString().equals(
			                                                         folder.getFullPath()
			                                                                 .toOSString()))
				return true;
		}
		return false;
	}

	public void setArtifactManager(ICAppArtifactManager artifactManager) {
		cappArtifactManager = artifactManager;
	}

	public static ICAppArtifactManager getCAppArtifactManager() {
		return cappArtifactManager;
	}

	public void deleteArtifactPath(IFolder folder, ICAppProjectSettings projectSettings)
	        throws Exception {
		Axis2ProjectUtils.deleteDirectory(folder);
		detachArtifactPath(folder, projectSettings);
	}

	public void detachArtifactPath(IFolder folder, ICAppProjectSettings projectSettings)
	        throws Exception {
		// ProjectUtils.removeProjectAxis2PathFromSettings(projectSettings,
		// folder.getFullPath().removeFirstSegments(1).toString());
	}

	public IArtifact[] getDeployableArtifacts(ICAppProjectSettings projectSettings,
	        Object artifactPathModel) {
		return null;
	}

	public String getArtifactType() {
		return getType();
	}

	public static String getType() {
		return ARTIFACT_TYPE;
	}

	public ImageDescriptor getArtifactIcon() {
		return Axis2ImageUtils.getInstance().getImageDescriptor("axis2.png");
	}

	public ImageDescriptor getArtifactImage() {
		return Axis2ImageUtils.getInstance().getImageDescriptor("axis2-24x24.png");
	}

	public ImageDescriptor getArtifactOverlayIcon() {
		return Axis2ImageUtils.getInstance().getImageDescriptor("axis2-12x12.png");
	}

	public AbstractNewArtifactWizard getNewArtifactWizard(IStructuredSelection selection) {
		return new NewAxis2ArtifactWizard();
	}

	public File getBundle(File location, Artifact artifact, String parentApplication)
	        throws Exception {
		return new Axis2ArtifactBundleCreator(artifact, location, parentApplication).getBundle();
	}
    
	public Map<Artifact,File> createArtifactContent(File location, Artifact artifact, File artifactContentLocation) throws Exception {
    	return new Axis2ArtifactBundleCreator(artifact, location, null).getArtifactContent(artifactContentLocation);
    }

	public String getGroupID() {
		return EditorPageConstants.GROUP_NEW_MENU+".services";
	}
	
	public boolean isStratosEnabled(){
		return Constants.STRATOS_ENABLED;
	}

    public String[] getPossibleDependencyArtifactTypes() {
	    return new String[]{"service/axis2","service/jaxws", "service/dataservice","synapse/proxy-service", "registry/resource",
	    		"lib/library/bundle"};
    }

    public String[] getPossibleDependentArtifactTypes() {
	    return new String[]{};
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
	    return ServerRoleManager.SR_APP_SERVER;
    }

}
