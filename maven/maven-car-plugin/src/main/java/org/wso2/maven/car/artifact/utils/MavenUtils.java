package org.wso2.maven.car.artifact.utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;

import org.apache.maven.artifact.Artifact;
import org.apache.maven.artifact.factory.ArtifactFactory;
import org.apache.maven.artifact.repository.ArtifactRepository;
import org.apache.maven.artifact.resolver.ArtifactNotFoundException;
import org.apache.maven.artifact.resolver.ArtifactResolutionException;
import org.apache.maven.artifact.resolver.ArtifactResolver;
import org.apache.maven.model.Dependency;
import org.apache.maven.model.Model;
import org.apache.maven.model.io.xpp3.MavenXpp3Reader;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.project.MavenProject;

public class MavenUtils {
	public static final String CAPP_SCOPE_PREFIX = "capp";
	
    private static ArtifactFactory artifactFactory;

    private static ArtifactResolver resolver;

    private static ArtifactRepository localRepository;

    private static List<?> remoteRepositories;

	
	public static Artifact getResolvedArtifact(Dependency dependency, ArtifactFactory artifactFactory, List<?> remoteRepositories, ArtifactRepository localRepository, ArtifactResolver resolver) throws MojoExecutionException{
		Artifact artifact = artifactFactory.createArtifact(dependency.getGroupId(),dependency.getArtifactId(),dependency.getVersion(),CAPP_SCOPE_PREFIX,dependency.getType());
		try {
			resolver.resolve(artifact,remoteRepositories,localRepository);
		} catch (ArtifactResolutionException e) {
			throw new MojoExecutionException("ERROR",e); 
		} catch (ArtifactNotFoundException e) {
			throw new MojoExecutionException("ERROR",e); 
		}
		return artifact;
	}
	
	public static Artifact getResolvedArtifactPom(Dependency dependency, ArtifactFactory artifactFactory, List<?> remoteRepositories, ArtifactRepository localRepository, ArtifactResolver resolver) throws MojoExecutionException{
		Artifact artifact = artifactFactory.createProjectArtifact(dependency.getGroupId(),dependency.getArtifactId(),dependency.getVersion());//,CAPP_SCOPE_PREFIX,null);
		try {
			resolver.resolve(artifact,remoteRepositories,localRepository);
		} catch (ArtifactResolutionException e) {
			throw new MojoExecutionException("ERROR",e); 
		} catch (ArtifactNotFoundException e) {
			throw new MojoExecutionException("ERROR",e); 
		}
		return artifact;
	}
	
	public static void main(String[] args) {
		
	}

	public static void setArtifactFactory(ArtifactFactory artifactFactory) {
		MavenUtils.artifactFactory = artifactFactory;
	}

	public static ArtifactFactory getArtifactFactory() {
		return artifactFactory;
	}

	public static void setResolver(ArtifactResolver resolver) {
		MavenUtils.resolver = resolver;
	}

	public static ArtifactResolver getResolver() {
		return resolver;
	}

	public static void setLocalRepository(ArtifactRepository localRepository) {
		MavenUtils.localRepository = localRepository;
	}

	public static ArtifactRepository getLocalRepository() {
		return localRepository;
	}

	public static void setRemoteRepositories(List<?> remoteRepositories) {
		MavenUtils.remoteRepositories = remoteRepositories;
	}

	public static List<?> getRemoteRepositories() {
		return remoteRepositories;
	}
	
	public static MavenProject getMavenProject(File file) throws MojoExecutionException{
		MavenXpp3Reader mavenXpp3Reader = new MavenXpp3Reader();
		Model model;
		try {
			model = mavenXpp3Reader.read(new FileInputStream(file));
//			model.setPomFile(file);
			return new MavenProject(model);
		} catch (Exception e) {
			throw new MojoExecutionException("Error reading maven project",e);
		}
	}
}
