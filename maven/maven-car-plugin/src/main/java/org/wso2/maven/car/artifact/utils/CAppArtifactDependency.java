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

package org.wso2.maven.car.artifact.utils;

import java.io.File;

import org.apache.maven.artifact.Artifact;
import org.apache.maven.model.Dependency;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.project.MavenProject;

public class CAppArtifactDependency{
	
	private CAppArtifact cAppArtifact;
	private Dependency mavenDependency;
	
	public CAppArtifactDependency(Dependency mavenDependency,String serverRole) throws MojoExecutionException {
		setMavenDependency(mavenDependency);
		Artifact resolvedArtifactPom = MavenUtils.getResolvedArtifactPom(mavenDependency, MavenUtils.getArtifactFactory(), MavenUtils.getRemoteRepositories(), MavenUtils.getLocalRepository(), MavenUtils.getResolver());
		MavenProject mavenProject = MavenUtils.getMavenProject(resolvedArtifactPom.getFile());
		setcAppArtifact(new CAppArtifact(mavenProject,serverRole));
	}
	
	public CAppArtifactDependency(MavenProject project, String type, String serverRole) {
		setcAppArtifact(new CAppArtifact(project,serverRole));
		getMavenDependency().setType(type);
	}
	
	public String getDependencyId(){
		return cAppArtifact.getId();
	}
	
	public String getName() {
			return cAppArtifact.getName();
	}

	public String getVersion() {
			return cAppArtifact.getVersion();
	}

	private Dependency createMavenDependency() {
		Dependency mavenDependency = new Dependency();
		MavenProject project = cAppArtifact.getProject();
		mavenDependency.setGroupId(project.getGroupId());
		mavenDependency.setArtifactId(project.getArtifactId());
		mavenDependency.setVersion(project.getVersion());
		mavenDependency.setScope(MavenUtils.CAPP_SCOPE_PREFIX);
		return mavenDependency;
	}

	
	public File getCappArtifactFile() throws MojoExecutionException{
		Artifact resolvedArtifact = MavenUtils.getResolvedArtifact(getMavenDependency(), MavenUtils.getArtifactFactory(), MavenUtils.getRemoteRepositories(), MavenUtils.getLocalRepository(), MavenUtils.getResolver());
		String[] split = resolvedArtifact.getFile().getName().split("\\.");
		getcAppArtifact().setFile(getName()+"."+split[split.length-1]);
		return resolvedArtifact.getFile();
	}
	
	public String toString() {
	    return getCaption();
	}
	
	public String getCaption(){
		return getName()+" - "+getVersion();
	}

	public String getType() {
		return getMavenDependency().getType();
	}

	private void setcAppArtifact(CAppArtifact cAppArtifact) {
		this.cAppArtifact = cAppArtifact;
	}

	public CAppArtifact getcAppArtifact() {
		return cAppArtifact;
	}

	public String getServerRole() {
		return cAppArtifact.getServerRole();
	}

	public Dependency getMavenDependency() {
		if (mavenDependency==null){
			mavenDependency=createMavenDependency();
		}
		return mavenDependency;
	}

	public void setMavenDependency(Dependency mavenDependency) {
		this.mavenDependency = mavenDependency;
	}

}
