/*
 * Copyright (c) 2011, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
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

package org.wso2.developerstudio.eclipse.artifact.registry.handler.project.nature;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.maven.model.Dependency;
import org.apache.maven.model.Plugin;
import org.apache.maven.model.Repository;
import org.apache.maven.project.MavenProject;
import org.codehaus.plexus.util.xml.Xpp3Dom;
import org.eclipse.core.runtime.CoreException;
import org.wso2.developerstudio.eclipse.maven.util.MavenUtils;
import org.wso2.developerstudio.eclipse.maven.util.ProjectDependencyConstants;
import org.wso2.developerstudio.eclipse.platform.core.nature.AbstractWSO2ProjectNature;
import org.wso2.developerstudio.eclipse.utils.jdt.JavaLibraryBean;
import org.wso2.developerstudio.eclipse.utils.jdt.JavaLibraryUtil;

public class RegistryHandlerProjectNature extends AbstractWSO2ProjectNature {
	public void configure() throws CoreException {
		try {
//			updatePom();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//	public void updatePom() throws Exception {
//		File mavenProjectPomLocation = getProject().getFile("pom.xml")
//				.getLocation().toFile();
//		MavenProject mavenProject = MavenUtils
//				.getMavenProject(mavenProjectPomLocation);
//		
//		Properties properties = mavenProject.getModel().getProperties();
//		properties.put("CApp.type", "lib/registry/handlers");
//		mavenProject.getModel().setProperties(properties);
//		
////		List<Plugin> plugins = mavenProject.getBuild().getPlugins();
////
////		for (Plugin plg : plugins) {
////			if (plg.getId().equals("maven-registry-handler-plugin")) {
////				return;
////			}
////		}
//
//		Plugin plugin = MavenUtils
//				.createPluginEntry(mavenProject, "org.apache.felix",
//						"maven-bundle-plugin", "2.3.4", true);
//		
//		Xpp3Dom configurationNode = MavenUtils.createMainConfigurationNode(plugin);
//		Xpp3Dom instructionNode = MavenUtils.createXpp3Node("instructions");
//		Xpp3Dom bundleSymbolicNameNode = MavenUtils.createXpp3Node(instructionNode, "Bundle-SymbolicName");
//		Xpp3Dom bundleNameNode = MavenUtils.createXpp3Node(instructionNode, "Bundle-Name");
//		Xpp3Dom bundleActivatorNode = MavenUtils.createXpp3Node(instructionNode, "Bundle-Activator");
//		Xpp3Dom exportPackageNode = MavenUtils.createXpp3Node(instructionNode, "Export-Package");
//		Xpp3Dom dynamicImportNode = MavenUtils.createXpp3Node(instructionNode, "DynamicImport-Package");
////		bundleSymbolicNameNode.setValue();
//		
//		instructionNode.addChild(bundleSymbolicNameNode);
//		instructionNode.addChild(bundleNameNode);
//		instructionNode.addChild(bundleActivatorNode);
//		instructionNode.addChild(exportPackageNode);
//		instructionNode.addChild(dynamicImportNode);
//		
//		configurationNode.addChild(instructionNode);
//		
////		PluginExecution pluginExecution;
////
////		pluginExecution = new PluginExecution();
////		pluginExecution.addGoal("pom-gen");
////		pluginExecution.setPhase("process-resources");
////		pluginExecution.setId("registry-handler");
////		plugin.addExecution(pluginExecution);
//
//		Repository repo = new Repository();
//		repo.setUrl("http://dist.wso2.org/maven2");
//		repo.setId("wso2-maven2-repository-1");
//
//		mavenProject.getModel().addRepository(repo);
//		mavenProject.getModel().addPluginRepository(repo);
//		
//		
//
//		List<Dependency> dependencyList = new ArrayList<Dependency>();
//
//		Map<String, JavaLibraryBean> dependencyInfoMap = JavaLibraryUtil
//				.getDependencyInfoMap(getProject());
//		Map<String, String> map = ProjectDependencyConstants.dependencyMap;
//		for (JavaLibraryBean bean : dependencyInfoMap.values()) {
//			if (bean.getVersion().contains("${")) {
//				for (String path : map.keySet()) {
//					bean.setVersion(bean.getVersion().replace(path,
//							map.get(path)));
//				}
//			}
//			Dependency dependency = new Dependency();
//			dependency.setArtifactId(bean.getArtifactId());
//			dependency.setGroupId(bean.getGroupId());
//			dependency.setVersion(bean.getVersion());
//			dependencyList.add(dependency);
//		}
//		MavenUtils.addMavenDependency(mavenProject, dependencyList);
//		MavenUtils.saveMavenProject(mavenProject, mavenProjectPomLocation);
//
//	}

	public void deconfigure() throws CoreException {

	}
}
