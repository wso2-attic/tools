package org.wso2.carbonstudio.eclipse.capp.project;

import java.util.Map;

import org.apache.maven.model.Plugin;
import org.apache.maven.project.MavenProject;
import org.codehaus.plexus.util.xml.Xpp3Dom;
import org.eclipse.core.resources.IProject;
import org.wso2.carbonstudio.eclipse.capp.maven.AbstractoMavenPluginContributorProvider;
import org.wso2.carbonstudio.eclipse.maven.util.MavenUtils;

public class ExecMavenPluginContributorProvider extends
		AbstractoMavenPluginContributorProvider {

	protected void addConfigurations(MavenProject mavenProject,
			IProject eclipseProject, Xpp3Dom config) {
		MavenUtils.createXpp3Node(config, "executable").setValue("mvn");
		MavenUtils.createXpp3Node(config, "workingDirectory").setValue("${project.build.directory}");
		Xpp3Dom argumentsNode = MavenUtils.createXpp3Node(config, "arguments");
		MavenUtils.createXpp3Node(argumentsNode, "argument").setValue("clean");
		MavenUtils.createXpp3Node(argumentsNode, "argument").setValue("install");
	}
	protected void addTypeList(MavenProject mavenProject,
			Map<String, String> artifactTypeExtensionMap, Xpp3Dom config) {
		//not applicable
	}
	
	protected String getGoal() {
		return "exec";
	}

	protected String getPluginArtifactID() {
		return "exec-maven-plugin";
	}

	protected String getPluginExecutionPhase() {
		return "install";
	}

	protected String getPluginGroupID() {
		return "org.codehaus.mojo";
	}

	protected String getPluginVersion() {
		return "1.2";
	}
	protected boolean updateMavenPlugin(Plugin plugin,
			MavenProject mavenProject, IProject eclipseProject,
			Map<String, String> artifactTypeExtensionMap) {
		return true;
	}

}
