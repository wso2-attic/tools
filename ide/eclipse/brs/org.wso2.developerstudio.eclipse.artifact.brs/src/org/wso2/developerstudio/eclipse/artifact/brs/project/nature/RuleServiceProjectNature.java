package org.wso2.developerstudio.eclipse.artifact.brs.project.nature;

import java.io.File;
import java.util.List;

import org.apache.maven.model.Plugin;
import org.apache.maven.model.Repository;
import org.apache.maven.model.RepositoryPolicy;
import org.apache.maven.project.MavenProject;
import org.codehaus.plexus.util.xml.Xpp3Dom;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.wso2.developerstudio.eclipse.capp.maven.utils.MavenConstants;
import org.wso2.developerstudio.eclipse.maven.util.MavenUtils;
import org.wso2.developerstudio.eclipse.platform.core.nature.AbstractWSO2ProjectNature;
import org.wso2.developerstudio.eclipse.utils.file.FileUtils;
import org.wso2.developerstudio.eclipse.utils.ide.FileExtensionResourcevisitor;


public class RuleServiceProjectNature extends AbstractWSO2ProjectNature{

	@Override
	public void configure() throws CoreException {

		try {
			updatePom();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void deconfigure() throws CoreException {

	}

	public void updatePom() throws Exception{
		File mavenProjectPomLocation=getProject().getFile("pom.xml").getLocation().toFile();
		MavenProject mavenProject=MavenUtils.getMavenProject(mavenProjectPomLocation);
		Plugin pluginEntry=MavenUtils.createPluginEntry(mavenProject, "org.wso2.maven", "maven-brs-plugin", MavenConstants.MAVEN_DATASERVICE_PLUGIN_VERSION, true);
		Xpp3Dom configurationNode=MavenUtils.createMainConfigurationNode(pluginEntry);
		Xpp3Dom artifactNode=MavenUtils.createXpp3Node(configurationNode, "artifact");

		if(getRSLFile()!=null){
			String fileName=FileUtils.getRelativePath(getProject().getLocation().toFile(), getRSLFile().getLocation().toFile());
			artifactNode.setValue(fileName);
		}

		Repository repo=new Repository();
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

	private IFile getRSLFile() throws CoreException{
		getProject().refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
		FileExtensionResourcevisitor fileExtensionResourceVisitor=new FileExtensionResourcevisitor(".rsl", IResource.FILE);
		getProject().accept(fileExtensionResourceVisitor);
		List<IResource> resources = fileExtensionResourceVisitor.getResourceList();
		return resources.size()==0? null: (IFile)resources.get(0);
	}


}
