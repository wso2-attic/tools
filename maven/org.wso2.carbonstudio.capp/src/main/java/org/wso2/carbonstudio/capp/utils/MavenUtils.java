package org.wso2.carbonstudio.capp.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;

import org.apache.maven.model.Model;
import org.apache.maven.model.Plugin;
import org.apache.maven.model.io.xpp3.MavenXpp3Reader;
import org.apache.maven.model.io.xpp3.MavenXpp3Writer;
import org.apache.maven.project.MavenProject;
import org.codehaus.plexus.util.xml.Xpp3Dom;
import org.wso2.carbonstudio.capp.model.Artifact;
import org.wso2.carbonstudio.eclipse.utils.file.FileUtils;

public class MavenUtils {
	public static final String CAPP_SCOPE_PREFIX = "capp";
	
	public static MavenProject getMavenProject(File file) throws Exception{
		MavenXpp3Reader mavenXpp3Reader = new MavenXpp3Reader();
		Model model;
			model = mavenXpp3Reader.read(new FileInputStream(file));
			return new MavenProject(model);
	}
	
	public static void saveMavenProject(MavenProject project, File file) throws Exception{
		MavenXpp3Writer mavenXpp3writer = new MavenXpp3Writer();
		mavenXpp3writer.write(new FileWriter(file), project.getModel());
	}
	
	public static MavenProject createMavenProject(Artifact artifact, String groupId, String packagingType){
		String artifactId = artifact.getName();
		String version = artifact.getVersion();
		return createMavenProject(groupId, artifactId, version, packagingType);
	}

	public static MavenProject createMavenProject(String groupId, String artifactId, String version, String packagingType) {
		Model model = new Model();
		model.setGroupId(groupId);
		model.setArtifactId(artifactId);
		model.setVersion(version);
		model.setModelVersion("4.0.0");
		model.setName(artifactId);
		model.setDescription(artifactId);
		if (packagingType!=null){
			model.setPackaging(packagingType);
		}
		return new MavenProject(model);
	}
	
	public static Xpp3Dom createMainConfigurationNode(Plugin plugin) {
		String tagName = "configuration";
		Xpp3Dom configuration = createConfigurationNode(tagName);
		plugin.setConfiguration(configuration);
		return configuration;
	}
	
	public static Xpp3Dom createMainConfigurationNode() {
		String tagName = "configuration";
		return createConfigurationNode(tagName);
	}

	public static Xpp3Dom createConfigurationNode(Xpp3Dom parent,String tagName) {
		Xpp3Dom node = createConfigurationNode(tagName);
		parent.addChild(node);
		return node;
	}

	
	public static Xpp3Dom createConfigurationNode(String tagName) {
		Xpp3Dom node = new Xpp3Dom(tagName);
		return node;
	}

	public static Plugin createPluginEntry(MavenProject project, String groupId, String artifactId, String version,boolean isExtension){
		Plugin plugin = new Plugin();
		plugin.setGroupId(groupId);
		plugin.setArtifactId(artifactId);
		plugin.setVersion(version);
		if (isExtension){
			plugin.setExtensions(true);
		}
		MavenUtils.createMainConfigurationNode(plugin);
		project.getBuild().addPlugin(plugin);
		return plugin;
	}
	
	public static String getMavenModuleRelativePath(File mavenModuleProject, File mavenProject){
		File mavenModuleLocation=mavenModuleProject;
		if (mavenModuleProject.getName().equalsIgnoreCase("pom.xml")){
			mavenModuleLocation=mavenModuleProject.getParentFile();
		}
		
		File mavenLocation=mavenProject;
		if (mavenProject.getName().equalsIgnoreCase("pom.xml")){
			mavenLocation=mavenProject.getParentFile();
		}
		
		return FileUtils.getRelativePath(mavenModuleLocation, mavenLocation);
	}
}
