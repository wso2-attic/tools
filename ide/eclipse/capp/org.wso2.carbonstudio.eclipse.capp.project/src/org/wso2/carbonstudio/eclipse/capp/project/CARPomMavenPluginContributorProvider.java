package org.wso2.carbonstudio.eclipse.capp.project;

import java.util.Map;

import org.apache.maven.model.Plugin;
import org.apache.maven.project.MavenProject;
import org.codehaus.plexus.util.xml.Xpp3Dom;
import org.eclipse.core.resources.IProject;
import org.wso2.carbonstudio.eclipse.capp.maven.AbstractoMavenPluginContributorProvider;
import org.wso2.carbonstudio.eclipse.capp.maven.utils.MavenConstants;
import org.wso2.carbonstudio.eclipse.maven.util.MavenUtils;

public class CARPomMavenPluginContributorProvider  extends AbstractoMavenPluginContributorProvider {

	protected void addConfigurations(MavenProject mavenProject, IProject eclipseProject, Xpp3Dom config) {
		Xpp3Dom artifactLocationNode = MavenUtils.createXpp3Node(config, "artifactLocation");
		artifactLocationNode.setValue("../");
		Xpp3Dom archiveLocationNode = MavenUtils.createXpp3Node(config, "archiveLocation");
		archiveLocationNode.setValue("../../../");
	}

	protected String getGoal() {
		return "pom-gen";
	}

	protected String getPluginArtifactID() {
		return "maven-car-plugin";
	}

	protected String getPluginExecutionPhase() {
		return "process-resources";
	}

	protected String getPluginGroupID() {
		return "org.wso2.maven";
	}

	protected String getPluginVersion() {
		return MavenConstants.MAVEN_CAR_VERSION;
	}
	protected boolean updateMavenPlugin(Plugin plugin,
			MavenProject mavenProject, IProject eclipseProject,
			Map<String, String> artifactTypeExtensionMap) {
		return true;
	}
}

