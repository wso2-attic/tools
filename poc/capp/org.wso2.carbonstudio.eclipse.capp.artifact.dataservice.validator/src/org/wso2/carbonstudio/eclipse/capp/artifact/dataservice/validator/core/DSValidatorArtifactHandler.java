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

package org.wso2.carbonstudio.eclipse.capp.artifact.dataservice.validator.core;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.wso2.carbonstudio.eclipse.capp.artifact.dataservice.validator.ui.wizard.NewDSValidatorArtifactWizard;
import org.wso2.carbonstudio.eclipse.capp.artifact.dataservice.validator.utils.DSValidatorImageUtils;
import org.wso2.carbonstudio.eclipse.capp.artifact.libraries.utils.LibraryArtifactBundleCreator;
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


public class DSValidatorArtifactHandler implements ICAppArtifactHandler {
	private final static String name = "Data Service Validator";
	private final static String description = "Data Service Validator";
	private static ICAppArtifactManager cappArtifactManager;
	private final static String ARTIFACT_TYPE="lib/dataservice/validator";
	
	public String getDescription() {
		return description;
	}

	public String getID() {
		return "org.wso2.capp.artifact.dataservice.validator";
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
		
		return DSValidatorImageUtils.getInstance().getImageDescriptor("ds-validate-16x16.png");
	}

	
	public ImageDescriptor getArtifactImage() {
		return DSValidatorImageUtils.getInstance().getImageDescriptor("ds-validate-24x24.png");
	}

	
	public ImageDescriptor getArtifactOverlayIcon() {
		return DSValidatorImageUtils.getInstance().getImageDescriptor("ds-validate-12x12.png");
	}

    public AbstractNewArtifactWizard getNewArtifactWizard(IStructuredSelection selection) {
	    return new NewDSValidatorArtifactWizard();
    }

	public File getBundle(File location, Artifact artifact,
			String parentApplication) throws Exception{
		return new LibraryArtifactBundleCreator(artifact, location, parentApplication).getBundle();
	}
	
	public Map<Artifact,File> createArtifactContent(File location, Artifact artifact, File artifactContentLocation) throws Exception {
    	return new LibraryArtifactBundleCreator(artifact, location, null).getArtifactContent(artifactContentLocation);
    }
	
	public String getGroupID() {
		return EditorPageConstants.GROUP_NEW_MENU+ ".ext";
	}
	
	public boolean isStratosEnabled(){
		return !Constants.STRATOS_ENABLED;
	}
	
	public String[] getPossibleDependentArtifactTypes() {
		return new String[]{};
	}

	public String[] getPossibleDependencyArtifactTypes() {
		return new String[]{"lib/dataservice/validator","lib/library/bundle"};
	}
	
    public List<IServerRole> getSupportingServerRoles() {
    	List<IServerRole> serverRoles = new ArrayList<IServerRole>();
    	serverRoles.add(ServerRoleManager.SR_DS_SERVER);
	    return serverRoles;
    }

    public IServerRole getDefaultServerRole() {
	    return ServerRoleManager.SR_DS_SERVER;
    }
}
