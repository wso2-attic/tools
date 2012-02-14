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

package org.wso2.carbonstudio.eclipse.capp.artifact.carbon.ui.bundle.core;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.wso2.carbonstudio.eclipse.capp.artifact.carbon.ui.bundle.ui.wizard.NewCarbonUIBundleArtifactWizard;
import org.wso2.carbonstudio.eclipse.capp.artifact.carbon.ui.bundle.utils.CarbonUIBundleImageUtils;
import org.wso2.carbonstudio.eclipse.capp.artifact.carbon.ui.bundle.utils.CustomUIComponentCreator;
import org.wso2.carbonstudio.eclipse.capp.core.artifacts.IArtifact;
import org.wso2.carbonstudio.eclipse.capp.core.artifacts.IArtifactSourcePath;
import org.wso2.carbonstudio.eclipse.capp.core.artifacts.ICAppArtifactHandler;
import org.wso2.carbonstudio.eclipse.capp.core.artifacts.configure.ICAppProjectSettings;
import org.wso2.carbonstudio.eclipse.capp.core.artifacts.manager.ICAppArtifactManager;
import org.wso2.carbonstudio.eclipse.capp.core.artifacts.manager.IServerRole;
import org.wso2.carbonstudio.eclipse.capp.core.artifacts.manager.ServerRoleManager;
import org.wso2.carbonstudio.eclipse.capp.core.manifest.Artifact;
import org.wso2.carbonstudio.eclipse.capp.core.ui.utils.EditorPageConstants;
import org.wso2.carbonstudio.eclipse.capp.core.ui.wizard.AbstractNewArtifactWizard;
import org.wso2.carbonstudio.eclipse.capp.core.utils.Constants;


public class CarbonUIBundleArtifactHandler implements ICAppArtifactHandler {
	private final static String name = "Carbon UI Bundle";
	private final static String description = "Carbon UI Bundle";
	private static ICAppArtifactManager cappArtifactManager;
	private final static String ARTIFACT_TYPE="lib/carbon/ui";
	
	public String getDescription() {
		return description;
	}

	public String getID() {
		return "org.wso2.capp.artifact.carbon.ui.bundle";
	}

	public String getName() {
		return name;
	}
	
    public void setArtifactManager(ICAppArtifactManager artifactManager) {
    	cappArtifactManager=artifactManager;
    }

    public static ICAppArtifactManager getCAppArtifactManager(){
    	return cappArtifactManager;
    }
    public String getArtifactType() {
	    return getType();
    }
    
    public static String getType() {
    	return ARTIFACT_TYPE;
    }
	

	public void createArtifactPath(IFolder folder,
			ICAppProjectSettings projectSettings) throws Exception {
		
	}

	public void deleteArtifactPath(IFolder folder,
			ICAppProjectSettings projectSettings) throws Exception {
		
	}

	public void detachArtifactPath(IFolder folder,
			ICAppProjectSettings projectSettings) throws Exception {
		
	}

	public IArtifactSourcePath[] getArtifactPathModelsForCAppProjectContent(
			IProject project, ICAppProjectSettings projectSettings)
			throws Exception {
		return null;
	}

	public IArtifact[] getDeployableArtifacts(
			ICAppProjectSettings projectSettings, Object artifactPathModel) {
		return null;
	}

	public boolean isFolderArtifactPath(IFolder folder,
			ICAppProjectSettings projectSettings) throws Exception {
		return false;
	}

	public void createArtifactDefaultPath(IProject project,
			ICAppProjectSettings projectSettings) throws Exception {
		
	}

	
	public ImageDescriptor getArtifactIcon() {
		
		return CarbonUIBundleImageUtils.getInstance().getImageDescriptor("carbon-ui-bundle-16x16.png");
	}

	
	public ImageDescriptor getArtifactImage() {
		return CarbonUIBundleImageUtils.getInstance().getImageDescriptor("carbon-ui-bundle-24x24.png");
	}

	
	public ImageDescriptor getArtifactOverlayIcon() {
		return CarbonUIBundleImageUtils.getInstance().getImageDescriptor("carbon-ui-bundle-12x12.png");
	}

    public AbstractNewArtifactWizard getNewArtifactWizard(IStructuredSelection selection) {
	    return new NewCarbonUIBundleArtifactWizard();
    }

	public File getBundle(File location, Artifact artifact,
			String parentApplication) throws Exception{
		return new CustomUIComponentCreator(artifact, location, parentApplication).getBundle();
	}

	public Map<Artifact,File> createArtifactContent(File location, Artifact artifact, File artifactContentLocation) throws Exception {
    	return new CustomUIComponentCreator(artifact, location, null).getArtifactContent(artifactContentLocation);
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
		return new String[]{"lib/library/bundle"};
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
