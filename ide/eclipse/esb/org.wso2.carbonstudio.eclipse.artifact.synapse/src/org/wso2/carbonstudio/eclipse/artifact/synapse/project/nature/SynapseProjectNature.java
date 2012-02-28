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

package org.wso2.carbonstudio.eclipse.artifact.synapse.project.nature;

import java.io.File;
import java.util.List;
import org.apache.maven.model.Plugin;
import org.apache.maven.model.PluginExecution;
import org.apache.maven.model.Repository;
import org.apache.maven.model.RepositoryPolicy;
import org.apache.maven.project.MavenProject;
import org.codehaus.plexus.util.xml.Xpp3Dom;
import org.eclipse.core.runtime.CoreException;
import org.wso2.carbonstudio.eclipse.maven.util.MavenUtils;
import org.wso2.carbonstudio.eclipse.platform.core.nature.AbstractWSO2ProjectNature;

public class SynapseProjectNature extends AbstractWSO2ProjectNature {

	public void configure() {
		try {
			updatePom();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void updatePom() throws Exception {

		File mavenProjectPomLocation = getProject().getFile("pom.xml").getLocation().toFile();
		MavenProject mavenProject = MavenUtils.getMavenProject(mavenProjectPomLocation);

		List<Plugin> plugins = mavenProject.getBuild().getPlugins();
		
		for(Plugin plg:plugins){
			if(plg.getId().equals("wso2-esb-synapse-plugin")){
				return ;
			}
		}
		
		Plugin plugin = MavenUtils.createPluginEntry(mavenProject, "org.wso2.maven", "wso2-esb-synapse-plugin", "1.0.3", true);
		
		PluginExecution pluginExecution = new PluginExecution();
		pluginExecution.addGoal("pom-gen");
		pluginExecution.setPhase("process-resources");
		pluginExecution.setId("synapse");
		
		Xpp3Dom configurationNode = MavenUtils.createMainConfigurationNode();
		Xpp3Dom artifactLocationNode = MavenUtils.createXpp3Node(configurationNode, "artifactLocation");
		artifactLocationNode.setValue(".");
		Xpp3Dom typeListNode = MavenUtils.createXpp3Node(configurationNode, "typeList");
		typeListNode.setValue("${artifact.types}");
		pluginExecution.setConfiguration(configurationNode);
		
		plugin.addExecution(pluginExecution);
		Repository repo = new Repository();
		repo.setUrl("http://maven.wso2.org/nexus/content/groups/wso2-public/");
		repo.setId("wso2-nexus");
		
		RepositoryPolicy releasePolicy=new RepositoryPolicy();
		releasePolicy.setEnabled(true);
		releasePolicy.setUpdatePolicy("daily");
		releasePolicy.setChecksumPolicy("ignore");
		
		repo.setReleases(releasePolicy);
		
		if (!mavenProject.getRepositories().contains(repo)) {
	        mavenProject.getModel().addRepository(repo);
	        mavenProject.getModel().addPluginRepository(repo);
        }
		
		MavenUtils.saveMavenProject(mavenProject, mavenProjectPomLocation);
	}

	public void deconfigure() throws CoreException {
		// TODO Auto-generated method stub

	}
}
