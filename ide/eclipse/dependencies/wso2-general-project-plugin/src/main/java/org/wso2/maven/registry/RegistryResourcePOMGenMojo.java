/*
 * Copyright (c) 2010, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
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

package org.wso2.maven.registry;

import java.io.File;
import java.io.IOException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.maven.model.Plugin;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.project.MavenProject;
import org.apache.maven.project.MavenProjectHelper;
import org.codehaus.plexus.util.xml.Xpp3Dom;
import org.wso2.developerstudio.eclipse.utils.file.FileUtils;
import org.wso2.maven.capp.model.Artifact;
import org.wso2.maven.capp.mojo.AbstractPOMGenMojo;
import org.wso2.maven.capp.utils.WSO2MavenPluginConstantants;
import org.wso2.maven.core.utils.MavenUtils;
import org.wso2.maven.registry.beans.RegistryCollection;
import org.wso2.maven.registry.beans.RegistryElement;
import org.wso2.maven.registry.beans.RegistryItem;
import org.wso2.maven.registry.utils.GeneralProjectMavenUtils;

/**
 * This is the Maven Mojo used for generating a pom for a sequence artifact 
 * from the old CApp project structure
 * 
 * @goal pom-gen
 * 
 */
public class RegistryResourcePOMGenMojo extends AbstractPOMGenMojo {

	private final String RELEASE_VERSION_VAR_NAME = "releaseVersion";
	/**
	 * @parameter expression="${releaseVersion}" default-value="${project.version}"
	 */
	private String releaseVersion;
	
	/**
	 * @parameter default-value="${project}"
	 */
	private MavenProject project;

	/**
	 * Maven ProjectHelper.
	 * 
	 * @component
	 */
	private MavenProjectHelper projectHelper;

	/**
	 * The path of the location to output the pom
	 * 
	 * @parameter expression="${project.build.directory}/artifacts"
	 */
	private File outputLocation;

	/**
	 * The resulting extension of the file
	 * 
	 * @parameter
	 */
	private File artifactLocation;
	
	/**
	 * POM location for the module project
	 * 
	 * @parameter expression="${project.build.directory}/pom.xml"
	 */
	private File moduleProject;
	
	/**
	 * Group id to use for the generated pom
	 * 
	 * @parameter
	 */
	private String groupId;
	
	private MavenProject mavenModuleProject;

	private static final String ARTIFACT_TYPE="registry/resource";
	
	private List<RegistryArtifact> artifacts;
	
	private Map<Artifact, RegistryArtifact> artifactToRegArtifactMap;
	
	private List<RegistryArtifact> retrieveArtifacts() {
		return GeneralProjectMavenUtils.retrieveArtifacts(getArtifactLocation());
	}
	
	public void execute() throws MojoExecutionException, MojoFailureException {
		//Retrieving all the existing ESB Artifacts for the given Maven project
		boolean isDebugEnabled = getLog().isDebugEnabled();
		if(isDebugEnabled){
			getLog().debug(new Time(System.currentTimeMillis())+" Starting Artifacts list retrieval process.");
		}
		
		artifacts = retrieveArtifacts();
		
		if(isDebugEnabled){
			getLog().debug(new Time(System.currentTimeMillis())+" Artifacts list retrieval completed");
		}
		
		//Artifact list
		List<Artifact> mappedArtifacts=new ArrayList<Artifact>();
		//Initializing Artifacts to Registry Artifacts Map.
		artifactToRegArtifactMap = new Hashtable<Artifact, RegistryArtifact>();

		String version = null;
		
		//Mapping ESBArtifacts to C-App artifacts so that we can reuse the maven-sequence-plugin
		for (RegistryArtifact registryArtifact : artifacts) {
	        Artifact artifact=new Artifact();
	        artifact.setName(registryArtifact.getName());
	       
	        version = registryArtifact.getVersion();
	        /*FIXING the artifact version issue. */
	        /*
	         * In earlier version, the artifact version was derived from the project version, which was causing a lot of problems while releasing a project or cutting a milestone.
	         * With the earlier approach it was very cumbersome to use maven-release-plugin or any other release mechanism out-of-the-box. 
	         * 
	         * The below approach gets the version of the artifact from the artifact.xml file and tries to resolve it if its a property reference. In case if the version from teh artifact is invalid or if
	         * it cannot be resolved we fallback to the version that is defined in the project's pom.xml (to maintain bakward compatibilty).
	         * 
	         * */	        
	        
	        try{
	        	//getting the version value defined in the artifact.xml.
		        version = getVersion(version, this.getProject());
		        if(version == null || version.trim().equals("")){
		        	//if version is either not defined or not resolved fallback to the default version from the project.xml
		        	if(isDebugEnabled){
		    			getLog().debug("Version defined in artifact.xml is either null or cannot be resolved. Hence defaulting it back to project.version");
		    		}
		        	version = this.getProject().getVersion();
		        }
			}catch(Exception e){
				 //If at any point we get any exception we just fall back to the version in the project's pom.xml
		 		 getLog().warn("An exception has occurred while trying to get the version number from the artifact.xml, the version defined in the artifact.xml was."+version,e);
		 		 version = this.getProject().getVersion();
			}
	        
	        artifact.setVersion(version);	       
	        artifact.setType(registryArtifact.getType());
	        artifact.setServerRole(registryArtifact.getServerRole());
	        artifact.setFile("registry-info.xml");
	        artifact.setSource(new File(getArtifactLocation(),"artifact.xml"));
	        mappedArtifacts.add(artifact);
	        
	        //Add the mapping between C-App Artifact and Registry Artifact
	        artifactToRegArtifactMap.put(artifact, registryArtifact);
        }
		
		if(getLog().isDebugEnabled()){
			getLog().debug(new Time(System.currentTimeMillis())+" Artifact model mapping completed");
		}
		
		//Calling the process artifacts method of super type to continue the sequence.
		if(getLog().isDebugEnabled()){
			getLog().debug(new Time(System.currentTimeMillis())+" Starting Artifact Processing");
		}
		
		
		super.processArtifacts(mappedArtifacts);

	}
	
	
	/**
	 * COnvenience method to resolve the version number.
	 * @param value
	 * @param project
	 * @return
	 */
	private String getVersion(String value, MavenProject project){
		MavenProject project1 = project;
		if(value != null && value.startsWith("$")){
			//The value is a reference
			if(value.contains("project.parent")){
				//means we need to get the value from the parent of the current project
				value = value.replace("project.parent.", "");	
				//we need to get the property from project's parent
				project1 = project.getParent();
			}else if(value.contains("project")){
				//property present in the current project.	
				value = value.replace("project.", "");	
				project1 = project;				
			}			
			value = getPropertyValue(value,project1);
		}
		return value;
	}
	
	/**
	 * Convenience method to get the property value defined in the pom.xml.
	 * @param value
	 * @param project
	 * @return
	 */
	private String getPropertyValue(String value, MavenProject project){
		//regex to extract the value between the curly braces.
		Pattern pattern = Pattern.compile("\\{(.*?)\\}");
		Matcher matcher = pattern.matcher(value);
		while(matcher.find()){
			value = matcher.group(1);
		}
		
		String propValue = null;
		//we need to check if the property is a version defined in project or project's parent.
		if(value.equals("version")){
			propValue = project.getVersion();
		}else if(value.equals(RELEASE_VERSION_VAR_NAME)){
			propValue = releaseVersion;
			getLog().info(new Time(System.currentTimeMillis())+" Using the releaseVersion passed in - "+releaseVersion);
		}else{
			Properties properties = project.getModel().getProperties();
			propValue = properties.getProperty(value);
		}
		
		return propValue;
	}
	
	
	protected void copyResources(MavenProject project, File projectLocation, Artifact artifact)throws IOException {
		//POM file and Registry-info.xml in the outside
		
		//Creating the registry info file outdide
		if(getLog().isDebugEnabled()){
			getLog().debug(new Time(System.currentTimeMillis())+" Starting to process the artifact copy process");
		}
		
		File regInfoFile = new File(projectLocation, "registry-info.xml");
		RegistryInfo regInfo=new RegistryInfo();
		regInfo.setSource(regInfoFile);
		
		//Filling info sections
		if(getLog().isDebugEnabled()){
			getLog().debug(new Time(System.currentTimeMillis())+" Starting generation of Registry Resource Metadata");
		}
		
//		List<RegistryArtifact> artifacts = retrieveArtifacts();
		
		if(getLog().isDebugEnabled()){
			getLog().debug(new Time(System.currentTimeMillis())+" Reusing the previously collected Artifacts details.");
		}
		
		RegistryArtifact mappedRegistryArtifact = artifactToRegArtifactMap.get(artifact);
		if(mappedRegistryArtifact != null){
			if(getLog().isDebugEnabled()){
				getLog().debug(new Time(System.currentTimeMillis())+" C-App artifact to Registry Artifact Mapping available.");
			}
	        //This is the correct registry artifact for this C-App artifact.
			List<RegistryElement> allRegistryItems = mappedRegistryArtifact.getAllRegistryItems();
			for (RegistryElement registryItem : allRegistryItems) {
				regInfo.addESBArtifact(registryItem);
			}
		}else{		
			if(getLog().isDebugEnabled()){
				getLog().debug(new Time(System.currentTimeMillis())+" C-App artifact to Registry Artifact Mapping not available.");
			}
			
			for (RegistryArtifact registryArtifact : artifacts) {
		        if(registryArtifact.getName().equalsIgnoreCase(artifact.getName()) && 
		        		this.getProject().getVersion().equalsIgnoreCase(artifact.getVersion()) && 
		        		registryArtifact.getType().equalsIgnoreCase(artifact.getType()) && 
		        		registryArtifact.getServerRole().equalsIgnoreCase(artifact.getServerRole())){
		        	//This is the correct registry artifact for this artifact:Yes this is reverse artifact to registry artifact mapping
		        	List<RegistryElement> allRegistryItems = registryArtifact.getAllRegistryItems();
		        	for (RegistryElement registryItem : allRegistryItems) {
		                regInfo.addESBArtifact(registryItem);
	                }
		        	break;
		        }
	        }
		}
		
		if(getLog().isDebugEnabled()){
			getLog().debug(new Time(System.currentTimeMillis())+" Registry Resource Metadata collection is complete.");
		}
		
		if(getLog().isDebugEnabled()){
			getLog().debug(new Time(System.currentTimeMillis())+" Starting serialization of Registry Resource Metadata");
		}
		try {
	        regInfo.toFile();
        } catch (Exception e) {
        }
		
		if(getLog().isDebugEnabled()){
			getLog().debug(new Time(System.currentTimeMillis())+" Completed serialization of Registry Resource Metadata");
		}
		
		if(getLog().isDebugEnabled()){
			getLog().debug(new Time(System.currentTimeMillis())+" Start copying the Registry Resource Process");
		}
		
		List<RegistryElement> allESBArtifacts = regInfo.getAllESBArtifacts();
		for (RegistryElement registryItem : allESBArtifacts) {
			File file = null;
			if (registryItem instanceof RegistryItem) {
				file =
				       new File(artifact.getSource().getParentFile().getPath(),
				                ((RegistryItem) registryItem).getFile());
				((RegistryItem) registryItem).setFile(file.getName());
			} else if (registryItem instanceof RegistryCollection) {
				file =
				       new File(artifact.getSource().getParentFile().getPath(),
				                ((RegistryCollection) registryItem).getDirectory());
				((RegistryCollection) registryItem).setDirectory(file.getName());
			}
			
			if(getLog().isDebugEnabled()){
				getLog().debug(new Time(System.currentTimeMillis())+"  Metadata processing complete. Copying artifacts.");
			}
			
			if (file.isFile()) {
				FileUtils.copy(file,
				               new File(projectLocation, "resources" + File.separator + file.getName()));
			} else {
				FileUtils.copyDirectory(file,
				                        new File(projectLocation, "resources" + File.separator +
				                        		file.getName()));
			}
			
			if(getLog().isDebugEnabled()){
				getLog().debug(new Time(System.currentTimeMillis())+" Artifact Copying complete.");
			}
			
			try {
				regInfo.toFile();
			} catch (Exception e) {
			}
			
			if(getLog().isDebugEnabled()){
				getLog().debug(new Time(System.currentTimeMillis())+" Metadata file serialization completed.");
			}
        }
		
		if(getLog().isDebugEnabled()){
			getLog().debug(new Time(System.currentTimeMillis())+" Artifact copy process is completed");
		}
		
//		for (RegistryElement registryElement : allESBArtifacts) {
//			File file = null;
//			if (registryElement instanceof RegistryItem) {
//				file =
//				       new File(artifact.getSource().getParentFile().getPath(),
//				                ((RegistryItem) registryElement).getFile());
//				((RegistryItem) registryElement).setFile(file.getName());
//			} else if (registryElement instanceof RegistryCollection) {
//				file =
//				       new File(artifact.getSource().getParentFile().getPath(),
//				                ((RegistryCollection) registryElement).getDirectory());
//				((RegistryCollection) registryElement).setDirectory(file.getName());
//			}
//			try {
//				regInfo.toFile();
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		
//		if(getLog().isDebugEnabled()){
//			getLog().debug(new Time(System.currentTimeMillis())+" Artifact Metadata successfully generated");
//		}
		
//		if(artifact.getFile().isDirectory()){
//			File file = new File(artifact.getFile().getParentFile(),"resources");
//			FileUtils.copyDirectory(file, new File(projectLocation, file.getName()));
//		}
	}
	
	protected void addPlugins(MavenProject artifactMavenProject, Artifact artifact) {
		Plugin plugin = MavenUtils.createPluginEntry(artifactMavenProject,"org.wso2.maven","maven-registry-plugin",WSO2MavenPluginConstantants.MAVEN_REGISTRY_PLUGIN_VERSION,true);
		Xpp3Dom configuration = (Xpp3Dom)plugin.getConfiguration();
		//add configuration
		Xpp3Dom aritfact = MavenUtils.createConfigurationNode(configuration,"artifact");
		aritfact.setValue(artifact.getFile().getName());
	}

	protected String getArtifactType() {
		return ARTIFACT_TYPE;
	}

	
}
