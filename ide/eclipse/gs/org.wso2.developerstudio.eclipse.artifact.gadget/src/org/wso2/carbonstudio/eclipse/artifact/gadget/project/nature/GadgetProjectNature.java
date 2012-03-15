package org.wso2.carbonstudio.eclipse.artifact.gadget.project.nature;

import java.io.File;
import java.util.ResourceBundle;

import org.apache.maven.model.Plugin;
import org.apache.maven.model.Repository;
import org.apache.maven.model.RepositoryPolicy;
import org.apache.maven.project.MavenProject;
import org.codehaus.plexus.util.xml.Xpp3Dom;
import org.eclipse.core.runtime.CoreException;
import org.wso2.carbonstudio.eclipse.maven.util.MavenUtils;
import org.wso2.carbonstudio.eclipse.platform.core.nature.AbstractWSO2ProjectNature;

public class GadgetProjectNature extends AbstractWSO2ProjectNature {
	public void configure() throws CoreException {
		try {
			updatePom();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void updatePom() throws Exception {
		ResourceBundle mediatorPropetiesBundle = ResourceBundle.getBundle("gadget");
		String groupId = mediatorPropetiesBundle.getString("Plugin_groupId");
		String artifactId = mediatorPropetiesBundle.getString("Plugin_artficatId");
		String version = mediatorPropetiesBundle.getString("Plugin_version");
		File mavenProjectPomLocation = getProject().getFile("pom.xml").getLocation().toFile();
		MavenProject mavenProject = MavenUtils.getMavenProject(mavenProjectPomLocation);
		Plugin plugin = MavenUtils.createPluginEntry(mavenProject, groupId,artifactId, version,true);
		/*add custom config node into plugin*/
	    Xpp3Dom configNode = MavenUtils.createXpp3Node("configuration");
	    Xpp3Dom artifactNode = MavenUtils.createXpp3Node(configNode,"artifact");
	    artifactNode.setValue("gadget-resources");
	    plugin.setConfiguration(configNode);
	    
		Repository repo = new Repository();
		repo.setUrl("http://maven.wso2.org/nexus/content/groups/wso2-public/");
		repo.setId("wso2-nexus");
		
		RepositoryPolicy releasePolicy=new RepositoryPolicy();
		releasePolicy.setEnabled(true);
		releasePolicy.setUpdatePolicy("daily");
		releasePolicy.setChecksumPolicy("ignore");
		
		repo.setReleases(releasePolicy);
		
		mavenProject.getModel().addRepository(repo);
		mavenProject.getModel().addPluginRepository(repo);
		MavenUtils.saveMavenProject(mavenProject, mavenProjectPomLocation);
	}

	public void deconfigure() throws CoreException {
		// TODO Auto-generated method stub
		
	}

}
