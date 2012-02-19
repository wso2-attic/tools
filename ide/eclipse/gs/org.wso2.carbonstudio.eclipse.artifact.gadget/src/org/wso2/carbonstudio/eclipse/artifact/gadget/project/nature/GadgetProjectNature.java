package org.wso2.carbonstudio.eclipse.artifact.gadget.project.nature;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;

import org.apache.maven.model.ConfigurationContainer;
import org.apache.maven.model.Dependency;
import org.apache.maven.model.Plugin;
import org.apache.maven.model.PluginExecution;
import org.apache.maven.model.Repository;
import org.apache.maven.project.MavenProject;
import org.codehaus.plexus.util.xml.Xpp3Dom;
import org.eclipse.core.runtime.CoreException;
import org.wso2.carbonstudio.eclipse.maven.util.MavenUtils;
import org.wso2.carbonstudio.eclipse.maven.util.ProjectDependencyConstants;
import org.wso2.carbonstudio.eclipse.platform.core.nature.AbstractWSO2ProjectNature;
import org.wso2.carbonstudio.eclipse.utils.jdt.JavaLibraryBean;
import org.wso2.carbonstudio.eclipse.utils.jdt.JavaLibraryUtil;

public class GadgetProjectNature extends AbstractWSO2ProjectNature {
	private static final String REPO_URL = "http://dist.wso2.org/maven2";
	private static final String REPO_ID = "wso2-maven2-repository-1";
	
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
		repo.setUrl(REPO_URL);
		repo.setId(REPO_ID);
		mavenProject.getModel().addRepository(repo);
		mavenProject.getModel().addPluginRepository(repo);
		MavenUtils.saveMavenProject(mavenProject, mavenProjectPomLocation);
	}

	public void deconfigure() throws CoreException {
		// TODO Auto-generated method stub
		
	}

}
