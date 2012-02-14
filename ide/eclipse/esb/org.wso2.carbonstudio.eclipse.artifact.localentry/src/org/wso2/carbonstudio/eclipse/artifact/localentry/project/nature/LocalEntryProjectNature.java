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

package org.wso2.carbonstudio.eclipse.artifact.localentry.project.nature;

import java.io.File;
import java.util.List;

import org.apache.maven.model.Plugin;
import org.apache.maven.model.PluginExecution;
import org.apache.maven.model.Repository;
import org.apache.maven.project.MavenProject;
import org.codehaus.plexus.util.xml.Xpp3Dom;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.JavaModelException;
import org.wso2.carbonstudio.eclipse.maven.util.MavenUtils;
import org.wso2.carbonstudio.eclipse.platform.core.nature.AbstractWSO2ProjectNature;

public class LocalEntryProjectNature extends AbstractWSO2ProjectNature{
	
//	private IProject selectedProject;
	
	
	public void configure() throws CoreException, JavaModelException {
		try {
			updatePom();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void deconfigure() throws CoreException {
		// TODO Auto-generated method stub
		
	}

//	
//	public IProject getProject() {
//		return selectedProject;
//	}
//
//	
//	public void setProject(IProject project) {
//		this.selectedProject = project;
//	}
	
	public void updatePom() throws Exception{
		File mavenProjectPomLocation = getProject().getFile("pom.xml").getLocation().toFile();
		MavenProject mavenProject = MavenUtils.getMavenProject(mavenProjectPomLocation);

		List<Plugin> plugins = mavenProject.getBuild().getPlugins();
		
		for(Plugin plg:plugins){
			if(plg.getId().equals("wso2-esb-localentry-plugin")){
				return ;
			}
		}
		
		Plugin plugin = MavenUtils.createPluginEntry(mavenProject, "org.wso2.maven", "wso2-esb-localentry-plugin", "1.0.4", true);
		
		PluginExecution pluginExecution = new PluginExecution();
		pluginExecution.addGoal("pom-gen");
		pluginExecution.setPhase("process-resources");
		pluginExecution.setId("localentry");
		
		Xpp3Dom configurationNode = MavenUtils.createMainConfigurationNode();
		Xpp3Dom artifactLocationNode = MavenUtils.createXpp3Node(configurationNode, "artifactLocation");
		artifactLocationNode.setValue(".");
		Xpp3Dom typeListNode = MavenUtils.createXpp3Node(configurationNode, "typeList");
		typeListNode.setValue("${artifact.types}");
		pluginExecution.setConfiguration(configurationNode);
		
		plugin.addExecution(pluginExecution);
		Repository repo = new Repository();
		repo.setUrl("http://dist.wso2.org/maven2");
		repo.setId("wso2-maven2-repository-1");
		
		Repository repo1 = new Repository();
		repo1.setUrl("http://maven.wso2.org/nexus/content/groups/wso2-public/");
		repo1.setId("wso2-nexus-maven2-repository-1");
		
		if (!mavenProject.getRepositories().contains(repo)) {
	        mavenProject.getModel().addRepository(repo);
	        mavenProject.getModel().addPluginRepository(repo);
        }

		if (!mavenProject.getRepositories().contains(repo1)) {
	        mavenProject.getModel().addRepository(repo1);
	        mavenProject.getModel().addPluginRepository(repo1);
        }
		
		MavenUtils.saveMavenProject(mavenProject, mavenProjectPomLocation);

	}

}
