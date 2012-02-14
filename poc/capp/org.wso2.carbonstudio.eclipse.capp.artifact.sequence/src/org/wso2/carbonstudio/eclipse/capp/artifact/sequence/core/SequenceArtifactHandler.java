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

package org.wso2.carbonstudio.eclipse.capp.artifact.sequence.core;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.wso2.carbonstudio.eclipse.capp.artifact.sequence.ui.wizard.NewSequenceArtifactWizard;
import org.wso2.carbonstudio.eclipse.capp.artifact.sequence.utils.SequenceImageUtils;
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
import org.wso2.carbonstudio.eclipse.capp.core.utils.ArtifactBundleCreator;
import org.wso2.carbonstudio.eclipse.capp.core.utils.Constants;


public class SequenceArtifactHandler implements ICAppArtifactHandler {
	private final static String name = "Sequence";
	private final static String description = "Sequence Artifact";
	private static ICAppArtifactManager cappArtifactManager;
	private final static String ARTIFACT_TYPE="synapse/sequence";
	
	public String getDescription() {
		return description;
	}

	public String getID() {
		return "org.wso2.capp.artifact.sequence";
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
	

	/*public void createArtifactDefaultPath(IProject project, ICAppProjectSettings projectSettings)
	                                                                                             throws Exception {
		List<CAppProperty> settings = ProjectUtils.getProjectAxis2Paths(projectSettings);
		boolean defaultPathExists = false;
		for (CAppProperty cAppProperty : settings) {
			if (SettingsConstants.DEFAULT_PATH.equals(cAppProperty.getData().toString())) {
				defaultPathExists = true;
				break;
			}
		}
		if (!defaultPathExists) {
			ProjectUtils.createDirectory(project, SettingsConstants.DEFAULT_PATH);
			if (!isArtifactPathAlreadyDefined(project.getFolder(SettingsConstants.DEFAULT_PATH), projectSettings)){
				ProjectUtils.addProjectAxis2PathToSettings(projectSettings,SettingsConstants.DEFAULT_PATH);
			}
		}
		
	}*/

	/*public void createArtifactPath(IFolder folder, ICAppProjectSettings projectSettings)
	                                                                                    throws Exception {
		ProjectUtils.createDirectory(folder.getProject(), folder.getFullPath().removeFirstSegments(1).toString());
		if (!isArtifactPathAlreadyDefined(folder, projectSettings)){
			ProjectUtils.addProjectAxis2PathToSettings(projectSettings,folder.getFullPath().removeFirstSegments(1).toString());
		}
	}*/

    /*public IArtifactSourcePath[] getArtifactPathModelsForCAppProjectContent(IProject project,
                                                               ICAppProjectSettings projectSettings)
                                                                                                    throws Exception {
		List<CAppProperty> projectAxis2Paths = ProjectUtils.getProjectAxis2Paths(projectSettings);
		ArrayList<IArtifactSourcePath> axis2ArtifactLocationNodes = new ArrayList<IArtifactSourcePath>();
		for (CAppProperty cAppProperty : projectAxis2Paths) {
			axis2ArtifactLocationNodes.add(new Axis2ArtifactLocationNode(project,cAppProperty.getData().toString()));
        }
		return axis2ArtifactLocationNodes.toArray(new IArtifactSourcePath[]{});
    }*/

	/*public boolean isArtifactPathAlreadyDefined(IFolder folder,  ICAppProjectSettings projectSettings){
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
	}*/
	
    /*public boolean isFolderArtifactPath(IFolder folder, ICAppProjectSettings projectSettings)
                                                                                             throws Exception {
		List<CAppProperty> projectAxis2Paths = ProjectUtils.getProjectAxis2Paths(projectSettings);
		for (CAppProperty cAppProperty : projectAxis2Paths) {
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
    }*/


    /*public void deleteArtifactPath(IFolder folder, ICAppProjectSettings projectSettings)
                                                                                        throws Exception {
		ProjectUtils.deleteDirectory(folder);
		detachArtifactPath(folder, projectSettings);
    }*/

    /*public void detachArtifactPath(IFolder folder, ICAppProjectSettings projectSettings)
                                                                                        throws Exception {
    	ProjectUtils.removeProjectAxis2PathFromSettings(projectSettings, folder.getFullPath().removeFirstSegments(1).toString());
    }*/

    /*public IArtifact[] getDeployableArtifacts(ICAppProjectSettings projectSettings,
                                              Object artifactPathModel) {
	    return null;
    }*/



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
		
		return SequenceImageUtils.getInstance().getImageDescriptor("sequence-normal.png");
	}

	
	public ImageDescriptor getArtifactImage() {
		return SequenceImageUtils.getInstance().getImageDescriptor("seq-24x24.png");
	}

	
	public ImageDescriptor getArtifactOverlayIcon() {
		return SequenceImageUtils.getInstance().getImageDescriptor("seq-12x12.png");
	}

    public AbstractNewArtifactWizard getNewArtifactWizard(IStructuredSelection selection) {
	    return new NewSequenceArtifactWizard();
    }

    public File getBundle(File location, Artifact artifact, String parentApplication) throws Exception{
	    return new ArtifactBundleCreator(artifact, location, parentApplication).getBundle();
    }
	
	public Map<Artifact,File> createArtifactContent(File location, Artifact artifact, File artifactContentLocation) throws Exception {
    	return new ArtifactBundleCreator(artifact, location, null).getArtifactContent(artifactContentLocation);
    }
	
	public String getGroupID() {
		return EditorPageConstants.GROUP_NEW_MENU+".esb";	
	}
	
	public boolean isStratosEnabled(){
		return Constants.STRATOS_ENABLED;
	}
	
	public String[] getPossibleDependentArtifactTypes() {
		return new String[]{};
	}

	public String[] getPossibleDependencyArtifactTypes() {
		return new String[]{"registry/resource","synapse/endpoint","synapse/sequence","lib/synapse/mediator"};
	}
	
    public List<IServerRole> getSupportingServerRoles() {
    	List<IServerRole> serverRoles = new ArrayList<IServerRole>();
    	serverRoles.add(ServerRoleManager.SR_ESB_SERVER);
	    return serverRoles;
    }

    public IServerRole getDefaultServerRole() {
	    return ServerRoleManager.SR_ESB_SERVER;
    }
}
