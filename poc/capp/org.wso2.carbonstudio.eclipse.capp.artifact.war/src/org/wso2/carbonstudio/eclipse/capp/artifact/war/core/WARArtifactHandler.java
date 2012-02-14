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

package org.wso2.carbonstudio.eclipse.capp.artifact.war.core;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.wso2.carbonstudio.eclipse.capp.artifact.war.Activator;
import org.wso2.carbonstudio.eclipse.capp.artifact.war.model.WARArtifactLocationNode;
import org.wso2.carbonstudio.eclipse.capp.artifact.war.ui.wizard.NewWARArtifactWizard;
import org.wso2.carbonstudio.eclipse.capp.artifact.war.utils.SettingsConstants;
import org.wso2.carbonstudio.eclipse.capp.artifact.war.utils.WARArtifactBundleCreator;
import org.wso2.carbonstudio.eclipse.capp.artifact.war.utils.WARImageUtils;
import org.wso2.carbonstudio.eclipse.capp.artifact.war.utils.WARProjectUtils;
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

public class WARArtifactHandler implements ICAppArtifactHandler {
	private static ICarbonStudioLog log=Logger.getLog(Activator.PLUGIN_ID);

	private final static String name = "Web Application (WAR)";
	private final static String description = "Web Application (WAR)";
	private static ICAppArtifactManager cappArtifactManager;
	private final static String ARTIFACT_TYPE="web/application";
	
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
	}

	public void createArtifactPath(IFolder folder, ICAppProjectSettings projectSettings)
	                                                                                    throws Exception {
	}

    public IArtifactSourcePath[] getArtifactPathModelsForCAppProjectContent(IProject project,
                                                               ICAppProjectSettings projectSettings)
                                                                                                    throws Exception {
		List<CAppProperty> projectWARPaths = WARProjectUtils.getProjectWARPaths(projectSettings);
		ArrayList<IArtifactSourcePath> warArtifactLocationNodes = new ArrayList<IArtifactSourcePath>();
		for (CAppProperty cAppProperty : projectWARPaths) {
			warArtifactLocationNodes.add(new WARArtifactLocationNode(project,cAppProperty.getData().toString()));
        }
		return warArtifactLocationNodes.toArray(new IArtifactSourcePath[]{});
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
	
    public boolean isFolderArtifactPath(IFolder folder, ICAppProjectSettings projectSettings)
                                                                                             throws Exception {
		List<CAppProperty> projectWarPaths = WARProjectUtils.getProjectWARPaths(projectSettings);
		for (CAppProperty cAppProperty : projectWarPaths) {
			String path = cAppProperty.getData().toString();
//			String[] pathElements = path.split("/");
			IProject resource=folder.getProject();
//			String lastPath="";
//			for (String pathElement : pathElements) {
//				lastPath=lastPath+pathElement+"/";
//				IFolder intermediateFolder=resource.getFolder(lastPath);
//				if (intermediateFolder.getFullPath().toOSString().equals(folder.getFullPath().toOSString()))
//					return true;
//            }
			IFolder intermediateFolder=resource.getFolder(path);
			if (intermediateFolder.getFullPath().toOSString().equals(folder.getFullPath().toOSString()))
				return true;
        }
		return false;
    }

    public void setArtifactManager(ICAppArtifactManager artifactManager) {
    	cappArtifactManager=artifactManager;
    }

    public static ICAppArtifactManager getCAppArtifactManager(){
    	return cappArtifactManager;
    }

    public void deleteArtifactPath(IFolder folder, ICAppProjectSettings projectSettings)
                                                                                        throws Exception {
		WARProjectUtils.deleteDirectory(folder);
		detachArtifactPath(folder, projectSettings);
    }

    public void detachArtifactPath(IFolder folder, ICAppProjectSettings projectSettings){
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
	    return WARImageUtils.getInstance().getImageDescriptor("war-16x16.png");
    }

    public ImageDescriptor getArtifactImage() {
	    return WARImageUtils.getInstance().getImageDescriptor("war-24x24.png");
    }

    public ImageDescriptor getArtifactOverlayIcon() {
	    return WARImageUtils.getInstance().getImageDescriptor("war-12x12.png");
    }

    public AbstractNewArtifactWizard getNewArtifactWizard(IStructuredSelection selection) {
	    return new NewWARArtifactWizard();
    }

    public File getBundle(File location, Artifact artifact, String parentApplication) throws Exception {
	    return new WARArtifactBundleCreator(artifact, location, parentApplication).getBundle();
    }
	
	public Map<Artifact,File> createArtifactContent(File location, Artifact artifact, File artifactContentLocation) throws Exception {
    	return new WARArtifactBundleCreator(artifact, location, null).getArtifactContent(artifactContentLocation);
    }
	
	public String getGroupID() {
		return EditorPageConstants.GROUP_NEW_MENU + ".ui";
	}
	
	public boolean isStratosEnabled(){
		return !Constants.STRATOS_ENABLED;
	}
	
	public String[] getPossibleDependentArtifactTypes() {
		return new String[]{};
	}

	public String[] getPossibleDependencyArtifactTypes() {
		return new String[]{"service/axis2","service/jaxws","service/dataservice","synapse/proxy-service"};
	}
	
    public List<IServerRole> getSupportingServerRoles() {
    	List<IServerRole> serverRoles = new ArrayList<IServerRole>();
    	serverRoles.add(ServerRoleManager.SR_APP_SERVER);
	    return serverRoles;
    }

    public IServerRole getDefaultServerRole() {
	    return ServerRoleManager.SR_APP_SERVER;
    }
}
