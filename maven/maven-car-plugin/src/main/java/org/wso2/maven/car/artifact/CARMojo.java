package org.wso2.maven.car.artifact;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.maven.artifact.factory.ArtifactFactory;
import org.apache.maven.artifact.repository.ArtifactRepository;
import org.apache.maven.artifact.resolver.ArtifactResolver;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.project.MavenProject;
import org.apache.maven.project.MavenProjectHelper;
import org.wso2.maven.car.artifact.utils.CAppArtifact;
import org.wso2.maven.car.artifact.utils.CAppArtifactDependency;
import org.wso2.maven.car.artifact.utils.FileManagementUtil;
import org.wso2.maven.car.artifact.utils.FileUtils;
import org.wso2.maven.car.artifact.utils.MavenUtils;

/**
 * Create a bpel artifact from Maven project
 *
 * @goal car
 * @phase package
 * @description build car artifact
 */
public class CARMojo extends AbstractMojo {

    /**
     * Location target folder
     *
     * @parameter expression="${project.build.directory}"
     */
    private File target;
    
    /**
     * Location archiveLocation folder
     *
     * @parameter expression="${project.build.directory}"
     */
    private File archiveLocation;
    

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
     * @component
     */
    private ArtifactFactory artifactFactory;

    /**
     * @component
     */
    private ArtifactResolver resolver;

    /**
     * @parameter default-value="${localRepository}"
     */
    private ArtifactRepository localRepository;

    /**
     * @parameter default-value="${project.remoteArtifactRepositories}"
     */
    private List<?> remoteRepositories;

    private void setupMavenRepoObjects(){
    	MavenUtils.setArtifactFactory(artifactFactory);
    	MavenUtils.setResolver(resolver);
    	MavenUtils.setLocalRepository(localRepository);
    	MavenUtils.setRemoteRepositories(remoteRepositories);
    }
	
    private Map<String,CAppArtifactDependency> cAppArtifactDependencies=new HashMap<String, CAppArtifactDependency>();
    
	public void execute() throws MojoExecutionException, MojoFailureException {
		setupMavenRepoObjects();
		CAppArtifact cAppArtifact = new CAppArtifact(project,null);
		collectArtifacts(cAppArtifact, cAppArtifactDependencies);
		try {
			cAppArtifact.toFile(new File(getArchiveDir(),"artifacts.xml"));
			for (CAppArtifactDependency cAppDependency : cAppArtifactDependencies.values()) {
				createArtifactData(getArchiveDir(), cAppDependency);
			}
			FileManagementUtil.zipFolder(getArchiveDir().toString(), getArchiveFile().toString());
			FileManagementUtil.deleteDirectories(getArchiveDir());
			project.getArtifact().setFile(getArchiveFile());
		} catch (Exception e) {
			throw new MojoExecutionException("",e);
		}
	}

	private void createArtifactData(File baseCARLocation, CAppArtifactDependency cAppArtifactDependency) throws IOException, MojoExecutionException{
		File artifactLocation = new File(baseCARLocation,cAppArtifactDependency.getName()+"_"+cAppArtifactDependency.getVersion());
		File cappArtifactFile = cAppArtifactDependency.getCappArtifactFile();
		File artifactFile = new File(artifactLocation,cAppArtifactDependency.getcAppArtifact().getFile());
		FileUtils.copy(cappArtifactFile, artifactFile);
		cAppArtifactDependency.getcAppArtifact().toFile(new File(artifactLocation,"artifact.xml"));
	}
	
	private void collectArtifacts(CAppArtifact cAppArtifact, Map<String,CAppArtifactDependency> cAppArtifacts) throws MojoExecutionException{
		List<CAppArtifactDependency> dependencies = cAppArtifact.getDependencies();
		for (CAppArtifactDependency artifactDependency : dependencies) {
			if (!cAppArtifacts.containsKey(artifactDependency.getDependencyId())){
				cAppArtifacts.put(artifactDependency.getDependencyId(), artifactDependency);
				collectArtifacts(artifactDependency.getcAppArtifact(), cAppArtifacts);
			}
		}
	}

	public MavenProjectHelper getProjectHelper() {
		return projectHelper;
	}

	public void setTarget(File target) {
		this.target = target;
	}

	public File getTarget() {
		return target;
	}
	
	private File getArchiveDir(){
		File archiveDir = new File(getTarget(),"car");
		if (!archiveDir.exists()){
			archiveDir.mkdirs();
		}
		return archiveDir;
	}

	private File getArchiveFile(){
		File archiveFile = new File(getArchiveLocation(),project.getArtifactId()+"_"+project.getVersion()+".car");
		return archiveFile;
	}
	
	public File getArchiveLocation() {
		return archiveLocation;
	}

	public void setArchiveLocation(File archiveLocation) {
		this.archiveLocation = archiveLocation;
	}
	
}