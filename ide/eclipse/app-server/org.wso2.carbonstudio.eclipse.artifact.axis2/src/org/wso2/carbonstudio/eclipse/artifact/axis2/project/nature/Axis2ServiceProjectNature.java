/*
 * Copyright (c) 2011, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
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

package org.wso2.carbonstudio.eclipse.artifact.axis2.project.nature;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.maven.model.Dependency;
import org.apache.maven.model.Plugin;
import org.apache.maven.model.PluginExecution;
import org.apache.maven.model.Repository;
import org.apache.maven.project.MavenProject;
import org.eclipse.core.runtime.CoreException;
import org.wso2.carbonstudio.eclipse.maven.util.MavenUtils;
import org.wso2.carbonstudio.eclipse.maven.util.ProjectDependencyConstants;
import org.wso2.carbonstudio.eclipse.platform.core.nature.AbstractWSO2ProjectNature;
import org.wso2.carbonstudio.eclipse.utils.jdt.JavaLibraryBean;
import org.wso2.carbonstudio.eclipse.utils.jdt.JavaLibraryUtil;

public class Axis2ServiceProjectNature extends AbstractWSO2ProjectNature {

	
	public void configure() throws CoreException {
		try {
			setupAsAxis2Service();
			updatePom();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void updatePom() throws Exception {
		File mavenProjectPomLocation = getProject().getFile("pom.xml").getLocation().toFile();
		MavenProject mavenProject = MavenUtils.getMavenProject(mavenProjectPomLocation);
		Plugin plugin = MavenUtils.createPluginEntry(mavenProject, "org.wso2.maven", "maven-axis2-plugin", "1.0.2", true);
		PluginExecution pluginExecution;
		
		pluginExecution = new PluginExecution();
		pluginExecution.addGoal("aar");
		pluginExecution.setPhase("package");
		pluginExecution.setId("aar");
		plugin.addExecution(pluginExecution);
		
		Repository repo = new Repository();
		repo.setUrl("http://dist.wso2.org/maven2");
		repo.setId("wso2-maven2-repository-1");
		
		mavenProject.getModel().addRepository(repo);
		mavenProject.getModel().addPluginRepository(repo);
		
		List<Dependency> dependencyList = new ArrayList<Dependency>();
		
		Map<String, JavaLibraryBean> dependencyInfoMap = JavaLibraryUtil.getDependencyInfoMap(getProject());
		Map<String, String> map = ProjectDependencyConstants.dependencyMap;
		for (JavaLibraryBean bean : dependencyInfoMap.values()) {
			if (bean.getVersion().contains("${")){
				for(String path: map.keySet()) {
					bean.setVersion(bean.getVersion().replace(path, map.get(path)));
				}
			}
			Dependency dependency = new Dependency();
			dependency.setArtifactId(bean.getArtifactId());
			dependency.setGroupId(bean.getGroupId());
			dependency.setVersion(bean.getVersion());
			dependencyList.add(dependency);
		}
		MavenUtils.addMavenDependency(mavenProject, dependencyList);
		MavenUtils.saveMavenProject(mavenProject, mavenProjectPomLocation);
		
	}

	private void setupAsAxis2Service() throws CoreException, IOException {
			
	}

	
	public void deconfigure() throws CoreException {
		
		
	}

}
