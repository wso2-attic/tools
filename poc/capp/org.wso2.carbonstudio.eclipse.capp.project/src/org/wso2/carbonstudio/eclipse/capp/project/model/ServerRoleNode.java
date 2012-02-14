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

package org.wso2.carbonstudio.eclipse.capp.project.model;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.wso2.carbonstudio.eclipse.capp.core.artifacts.manager.IServerRole;
import org.wso2.carbonstudio.eclipse.capp.core.manifest.Artifact;
import org.wso2.carbonstudio.eclipse.capp.project.manager.CAppArtifactManager;

public class ServerRoleNode {
	private IServerRole serverRole;
	private IProject project;
	
	private List<ArtifactNode> artifacts;
	
	public ServerRoleNode(IProject project,IServerRole serverRole) {
		setProject(project);
		setServerRole(serverRole);
    }
	
	public void setServerRole(IServerRole serverRole) {
	    this.serverRole = serverRole;
    }
	public IServerRole getServerRole() {
	    return serverRole;
    }
	public void setProject(IProject project) {
	    this.project = project;
    }
	public IProject getProject() {
	    return project;
    }

	public void setArtifacts(List<ArtifactNode> artifacts) {
	    this.artifacts = artifacts;
    }

	public List<ArtifactNode> getArtifacts() {
		if (artifacts==null){
			artifacts=new ArrayList<ArtifactNode>();
		}
		refresh();
	    return artifacts;
    }
	
	private void refresh() {
		List<ArtifactNode> nodesToRemove=new ArrayList<ArtifactNode>();
		List<Artifact> artifactsForServerRole = CAppArtifactManager.getInstance().getArtifacts(getProject(), getServerRole());
		for (ArtifactNode artifactNode : artifacts) {
	        if (artifactsForServerRole.contains(artifactNode.getAritfact())){
	        	artifactsForServerRole.remove(artifactNode.getAritfact());
	        }else{
	        	nodesToRemove.add(artifactNode);
	        }
        }
		for (Artifact artifact : artifactsForServerRole) {
			artifacts.add(new ArtifactNode(artifact, this));
        }
		artifacts.removeAll(nodesToRemove);
    }
	
	public String getCaption() {
		return CAppArtifactManager.getInstance().getServerRoleDescription(getServerRole());
    }
}
