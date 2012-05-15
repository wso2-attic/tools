/*
* Copyright (c) 2005-2012, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
* WSO2 Inc. licenses this file to you under the Apache License,
* Version 2.0 (the "License"); you may not use this file except
* in compliance with the License.
* You may obtain a copy of the License at
*
* 	http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing,
* software distributed under the License is distributed on an
* "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
* KIND, either express or implied.  See the License for the
* specific language governing permissions and limitations
* under the License.
*/

package org.wso2.carbon.template.plugin;

import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.StringTokenizer;

import org.apache.maven.archetype.ArchetypeManager;
import org.apache.maven.archetype.generator.ArchetypeGenerator;
import org.apache.maven.archetype.mojos.CreateProjectFromArchetypeMojo;
import org.apache.maven.archetype.ui.ArchetypeGenerationConfigurator;
import org.apache.maven.archetype.ui.ArchetypeSelector;
import org.apache.maven.artifact.repository.ArtifactRepository;
import org.apache.maven.execution.MavenSession;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.shared.invoker.Invoker;
import org.codehaus.plexus.components.interactivity.Prompter;


/**
 * Prompts and executes archetypes. Such as a complete archetype followed by
 * partial archetypes. Uses the Archetype Mojo from maven-archetype-plugin.
 * 
 * @goal generate
 * @requiresProject false
 * @execute phase="generate-sources"
 * @author chethiya
 */
public final class Mojo extends CreateProjectFromArchetypeMojo{	
	/*
	 * User Inputs for the template generation
	 */
	
	/**
	 * @parameter expression="${groupId}" default-value="org.wso2.carbon"
	 */
	private String groupId;
	
	/**
	 * @parameter expression="${artifactId}" default-value="org.wso2.carbon.student.mgt";
	 */
	private String artifactId;
	
	/**
	 * @parameter expression="${version}" default-value="1.0.0-SNAPSHOT"
	 */
	private String version;
	
	/**
	 * @parameter expression="${aggregatorArtifactId}" default-value="student-mgt"
	 */
	private String aggregatorArtifactId;
	
	/**
	 * @parameter projectName="${projectName}" default-value="Student Management"
	 */
	private String projectName;
	
	
	/**
	 * @parameter expression="${carbonVersion}" default-value="4.0.0-SNAPSHOT"
	 */
	private String carbonVersion;
	
	
	/*
	 * Generated inputs to archetype from user inputs
	 */
	private String packageName;
	private String reversedPackageName;
	private String serviceStubsParentArtifactId;

	
	
	/*
	 * Information of the archetype to be called 
	 */
	
	private String archetypeArtifactId; // = "carbon-template-archetype";
	private String archetypeVersion; // = "1.0.0";
	private String archetypeGroupId; //= "org.wso2.carbon";

	
	/*
	 * Inputs to be passed to the archetype from maven
	 */
	
	/**
	 * @parameter expression="${archetypeRepository}"
	 */
	private String archetypeRepository;
	
	/**
	 * @parameter expression="${archetypeCatalog}" default-value="remote,local"
	 */
	private String archetypeCatalog;
	
	/**
	 * @parameter expression="${localRepository}"
	 * @required
	 * @readonly
	 */
	private ArtifactRepository localRepository;
	
	/**
	 * @parameter expression="${project.remoteArtifactRepositories}";
	 * @readonly
	 * @required
	 */
	private List<ArtifactRepository> remoteArtifactRepositories;
	
	/**
	 * @parameter expression="${interactiveMode}" default-value="true"
	 * @required
	 */
	private Boolean interactiveMode;
	
	/**
	 * @parameter expression="${basedir}"
	 */
	private File basedir;
	
	/**
	 * @parameter expression="${session}"
	 */
	private MavenSession session;
	
	
	private String goals;
	
	/*
	 * components to be passed to archetype
	 */
	
	/**
	 * @component
	 */
	private Prompter promter;
	/**
	 * @component
	 */
	private ArchetypeManager archetype;
	
	/**
	 * @component
	 */
	private ArchetypeSelector selector;
	
	/**
	 * @component
	 */
	private ArchetypeGenerationConfigurator configurator;
	
	/**
	 * @component
	 */
	private ArchetypeGenerator generator;
	
	/**
	 * @component
	 */
	private Invoker invoker;
	
	private void init() {
		this.archetypeArtifactId = "carbon-template-archetype";
		this.archetypeVersion = "1.1.0";
		this.archetypeGroupId = "org.wso2.carbon";
		this.goals = "";
	}
	
	public void execute() throws MojoExecutionException, MojoFailureException {
		this.init();
		
		getLog().info("*******************************************************");
		getLog().info("*           Carbon Template Plugin Wizard             *");
		getLog().info("*******************************************************");
				
		if (Boolean.TRUE.equals(this.interactiveMode)) {
			getLog().info("------------           Running in Interactive Mode           ------------");
			this.takeUserInputs();
		} else {
			getLog().info("------------            Runniing in Batch Mode               ------------");
		}
		
		this.generateOtherInputsToArchetype();		
		this.showFinalValues();		
		this.callArchetype();
	}
	
	private void showFinalValues() {
		getLog().info("------------ Creating the project using following parameters -------------");
		getLog().info("--------------------------------------------------------------------------");
		getLog().info("Group ID: " + this.groupId);
		getLog().info("Backend Component Artifact ID: " + this.artifactId);
		getLog().info("Version: " + this.version);
		getLog().info("Aggregator Project Artifact ID: " + this.aggregatorArtifactId);
		getLog().info("Project Common Name: " + this.projectName);
		getLog().info("Carbon Version: " + this.carbonVersion);
		getLog().info("Package Prefix: " + this.packageName);
	}
	
	private String readInput(String qString, String currentValue) throws Exception{
		String value = "";
		String result = "";
		
		if (currentValue != null && !("".equals(currentValue))) {
			value = " [" + currentValue + "]";
		}
		result = promter.prompt(qString + value + " ").trim();
		
		if (result == null || "".equals(result)) {
			result = currentValue;
		}
		return result;
	}
	
	private void takeUserInputs() throws MojoExecutionException {
		try {
			String confirm = "n";
			
			while (!"y".equalsIgnoreCase(confirm)) {
				this.groupId = this.readInput("Group ID", this.groupId);
				this.artifactId = this.readInput("Backend Component Artifact ID", this.artifactId);
				this.version = this.readInput("Version", this.version);
				this.aggregatorArtifactId = this.readInput("Aggregator Project Artifact Id", 
						this.aggregatorArtifactId);
				this.projectName = this.readInput("Project Common Name (this will be used to " +
						"describe and name projects)", this.projectName);
				this.carbonVersion = this.readInput("Carbon Version", this.carbonVersion);				
				
				confirm = promter.prompt("Confirm given inputs (y/n) ");
			}
		} catch (Exception e) {
			throw new MojoExecutionException("Question promter failed : " + e);
		}
	}
	
	private void generateOtherInputsToArchetype() {
		this.packageName = this.artifactId;
		
		/* generating reversed package names */
		this.reversedPackageName = "";
		StringTokenizer token = new StringTokenizer(this.packageName, ".");
		while (token.hasMoreElements()) {
			if (this.reversedPackageName == null || "".equals(this.reversedPackageName)) {
				this.reversedPackageName = token.nextToken();
			} else {
				this.reversedPackageName = token.nextToken() + "." + this.reversedPackageName;
			}
		}
		
		/* Searching whether carbon version > 4.0.0 */
		int i;
		for (i=0; i<carbonVersion.length(); ++i) {
			char ch = carbonVersion.charAt(i);
			if (!(ch <= '9' && ch >= '0') && ch != ' ') {
				break;
			}
		}
		int version = Integer.parseInt(carbonVersion.substring(0, i));
		if (version >= 4) {		
			this.serviceStubsParentArtifactId = "carbon-service-stubs";
		} else {
			this.serviceStubsParentArtifactId = "service-stubs";
		}		
	}
	
	

	private void setSuperPrivate(String memberName, Object value) throws MojoExecutionException {
		try {
			Class<?> superClass = this.getClass().getSuperclass();
			Field curField = superClass.getDeclaredField(memberName);
			curField.setAccessible(true); 
			curField.set(this, value);
		} catch (Exception e) {
			throw new MojoExecutionException("Filed to override super class private member [" 
					+ memberName + "] : ", e);
			
		}
	}
	
	private void callArchetype() throws MojoExecutionException, MojoFailureException{
		//adding archetype info to maven session 
		Properties info = new Properties();
		info.setProperty("artifactId", this.aggregatorArtifactId);
		info.setProperty("groupId", this.groupId);
		info.setProperty("version", this.version);
		info.setProperty("projectName", this.projectName);
		info.setProperty("carbonVersion", this.carbonVersion);
		info.setProperty("package", this.packageName);
		info.setProperty("backendArtifactId", this.artifactId);
		info.setProperty("reversedPackage", this.reversedPackageName);
		info.setProperty("serviceStubsParentArtifactId", this.serviceStubsParentArtifactId);
		
		this.session.getExecutionProperties().putAll(info);
		
		//settings supper class private fields to call the archetype
		
		getLog().info("version is : " + this.archetypeVersion);
		getLog().info("local repository " + this.localRepository);
		
		
		this.setSuperPrivate("interactiveMode", Boolean.FALSE);
		this.setSuperPrivate("archetypeArtifactId", this.archetypeArtifactId);
		this.setSuperPrivate("archetypeGroupId", this.archetypeGroupId);
		this.setSuperPrivate("archetypeVersion", this.archetypeVersion);
		this.setSuperPrivate("archetypeRepository", this.archetypeRepository);
		this.setSuperPrivate("archetypeCatalog", this.archetypeCatalog);
		this.setSuperPrivate("localRepository", this.localRepository);
		this.setSuperPrivate("remoteArtifactRepositories", this.remoteArtifactRepositories);
		
		this.setSuperPrivate("basedir", this.basedir);
		this.setSuperPrivate("session", this.session);
		this.setSuperPrivate("goals", this.goals);
		this.setSuperPrivate("archetype", this.archetype);
		this.setSuperPrivate("selector", this.selector);
		this.setSuperPrivate("configurator", this.configurator);
		this.setSuperPrivate("generator", this.generator);
		this.setSuperPrivate("invoker", this.invoker);

		super.execute();
	}

	
}
