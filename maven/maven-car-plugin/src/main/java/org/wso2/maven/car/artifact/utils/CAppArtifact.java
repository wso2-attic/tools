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

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.axiom.om.OMDocument;
import org.apache.axiom.om.OMElement;
import org.apache.maven.model.Dependency;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.project.MavenProject;

public class CAppArtifact extends AbstractXMLDoc{

	private MavenProject project;
	private String serverRole;
	
	/**
	 * Artifact content file.
	 */
	List<CAppArtifactDependency> dependencies;
	List<CAppArtifact> subArtifacts;
	private long modificationStamp;
	/**
	 * Artifact descriptor file (artifact.xml file).
	 */
	private String carTimestamp = "";
	private String timestampedVersion;
	private String file;

	public CAppArtifact(MavenProject project, String serverRole) {
		setProject(project);
		setServerRole(serverRole);
	}
	
	public String getId(){
		return getProject().getGroupId()+":"+getProject().getArtifactId()+":"+getProject().getVersion();
	}
	
	public String getName() {
		return getProject().getArtifactId();
	}

	public String getVersion() {
		return getProject().getVersion();
	}

	public String getType() {
		return getProject().getPackaging();
	}

	public List<CAppArtifactDependency> getDependencies() throws MojoExecutionException {
		List<CAppArtifactDependency> dependencies = new ArrayList<CAppArtifactDependency>();
		for (Object object: getProject().getDependencies()) {
			Dependency dependency=(Dependency)object;
			if (dependency.getScope()!=null && dependency.getScope().toLowerCase().startsWith(MavenUtils.CAPP_SCOPE_PREFIX)){
				String[] scopeElements = dependency.getScope().split("/");
				String dependencyServerRole;
				if (scopeElements.length>1){
					dependencyServerRole=scopeElements[1];
				}else{
					dependencyServerRole=getServerRole();
				}
				CAppArtifactDependency artifactDependency = new CAppArtifactDependency(dependency,dependencyServerRole);
				dependencies.add(artifactDependency);
			}
		}
		return dependencies;
	}

	private Map<String,CAppArtifactDependency> getDependencyMap() throws MojoExecutionException{
		Map<String,CAppArtifactDependency> dependencyMap=new HashMap<String, CAppArtifactDependency>();
		List<CAppArtifactDependency> dependencies = getDependencies();
		for (CAppArtifactDependency dependency : dependencies) {
			dependencyMap.put(dependency.getDependencyId(), dependency);
		}
		return dependencyMap;
	}
	
	public void addDependencies(CAppArtifactDependency dependency) throws MojoExecutionException {
		Map<String, CAppArtifactDependency> dependencyMap = getDependencyMap();
		String dependencyId=dependency.getDependencyId();
		if (!dependencyMap.containsKey(dependencyId)){
			project.getModel().addDependency(dependency.getMavenDependency());
		}
	}

	public String getCaption() {
		return getName() + " - " + getVersion() + "";
	}

	public String getDefaultName() {
		return "artifact.xml";
	}

	public boolean isDependencyPresent(CAppArtifact artifact) throws MojoExecutionException {
		return isDependencyPresent(artifact.getName(), artifact.getVersion());
	}

	public boolean isDependencyPresent(String name, String version) throws MojoExecutionException {
		for (CAppArtifactDependency dependency : getDependencies()) {
			if (dependency.getName().equals(name)
					&& dependency.getVersion().equals(version))
				return true;
		}
		return false;
	}

	public String getTimestampedVersion() {
		if (carTimestamp == null) {
			timestampedVersion = getVersion();
		} else {
			timestampedVersion = getVersion() + ".v" + carTimestamp;
		}
		return timestampedVersion;
	}

	public void setCarTimestamp(String carTimestamp) {
		this.carTimestamp = carTimestamp;
	}

	public String getCarTimestamp() {
		return carTimestamp;
	}

	public void setModificationStamp(long modificationStamp) {
		this.modificationStamp = modificationStamp;
	}

	public long getModificationStamp() {
		return modificationStamp;
	}

	public void setProject(MavenProject project) {
		this.project = project;
	}

	public MavenProject getProject() {
		return project;
	}

	public void setServerRole(String serverRole) {
		this.serverRole = serverRole;
	}

	public String getServerRole() {
		return serverRole;
	}

	public String serialize() throws Exception {
		String result = null;
		OMDocument document = factory.createOMDocument();
		OMElement documentElement = getDocumentElement();
		document.addChild(documentElement);
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		try {
			prettify(documentElement, outputStream);
		} catch (Exception e) {
			throw new MojoExecutionException("Error serializing",e);
        }
		result = outputStream.toString();
		return result;
	}

	protected void deserialize(OMElement documentElement) {
		//Nothing to do
	}

	public OMElement getDocumentElement() throws MojoExecutionException {
		OMElement documentElement = getElement("artifact", "");
		addAttribute(documentElement, "name", getName());
		addAttribute(documentElement, "version", getVersion());
		addAttribute(documentElement, "type", getType());
		if (serverRole != null)
			addAttribute(documentElement, "serverRole", getServerRole());
		if (getFile() != null)
			documentElement.addChild(getElement("file", getFile()));
		List<CAppArtifactDependency> artifactDependencies = getDependencies();
		for (CAppArtifactDependency dependency : artifactDependencies) {
			OMElement dependecyElement = getElement("dependency", "");
			dependecyElement = addAttribute(dependecyElement, "artifact", dependency.getName());
			dependecyElement = addAttribute(dependecyElement, "version", dependency.getVersion());
			dependecyElement = addAttribute(dependecyElement, "include", Boolean.toString(true));
			if (dependency.getServerRole()!=null){
				dependecyElement = addAttribute(dependecyElement, "serverRole", dependency.getServerRole());
			}
			documentElement.addChild(dependecyElement);
		}
		return documentElement;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public String getFile() {
		return file;
	}
}
