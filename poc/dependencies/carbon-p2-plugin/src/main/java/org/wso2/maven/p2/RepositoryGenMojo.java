/*
 * Copyright 2004,2005 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.wso2.maven.p2;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.apache.maven.artifact.factory.ArtifactFactory;
import org.apache.maven.artifact.repository.ArtifactRepository;
import org.apache.maven.artifact.resolver.ArtifactResolver;
import org.apache.maven.model.Resource;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.project.MavenProject;
import org.codehaus.plexus.util.FileUtils;
import org.wso2.maven.p2.generate.utils.FileManagementUtil;
import org.wso2.maven.p2.generate.utils.MavenUtils;
import org.wso2.maven.p2.generate.utils.P2Utils;

/**
 * Write environment information for the current build to file.
 *
 * @goal p2-repo-gen
 * @phase package
 */
public class RepositoryGenMojo extends AbstractMojo {

//    /**
//     * URL of the Metadata Repository
//     *
//     * @parameter
//     */
//    private URL repository;

    /**
     * Name of the repository
     *
     * @parameter
     */
    private String name;
    
    /**
     * URL of the p2 agent distribution
     *
     * @parameter
     */
    private String p2AgentLocation;

    /**
     * URL of the Metadata Repository
     *
     * @parameter
     */
    private URL metadataRepository;

    /**
     * URL of the Artifact Repository
     *
     * @parameter
     */
    private URL artifactRepository;

    /**
     * Source folder
     *
     * @parameter
     * @required
     */
    private ArrayList featureArtifacts;

    /**
     * Source folder
     *
     * @parameter
     */
    private ArrayList bundleArtifacts;
    
    /**
     * Source folder
     *
     * @parameter
     */
    private ArrayList categories;

    /**
     * flag indicating whether the artifacts should be published to the repository. When this flag is not set,
     * the actual bytes underlying the artifact will not be copied, but the repository index will be created.
     * When this option is not specified, it is recommended to set the artifactRepository to be in the same location
     * as the source (-source)
     *
     * @parameter
     */
    private boolean publishArtifacts;

    /**
     * Type of Artifact (War,Jar,etc)
     *
     * @parameter
     */
    private boolean publishArtifactRepository;

    /**
     * Equinox Launcher
     *
     * @parameter
     */
    private EquinoxLauncher equinoxLauncher;


    /**
     * Equinox p2 configuration path
     *
     * @parameter
     */
    private P2Profile p2Profile;

    /**
     * @parameter default-value="${project}"
     */
    private MavenProject project;
    
    /**
     * @parameter default-value="false"
     */
    private boolean archive;

    /**
     * @component
     */
    private org.apache.maven.artifact.factory.ArtifactFactory artifactFactory;

    /**
     * @component
     */
    private org.apache.maven.artifact.resolver.ArtifactResolver resolver;

    /**
     * @parameter default-value="${localRepository}"
     */
    private org.apache.maven.artifact.repository.ArtifactRepository localRepository;

    /**
     * @parameter default-value="${project.remoteArtifactRepositories}"
     */
    private List remoteRepositories;

    private ArrayList processedFeatureArtifacts;
    private ArrayList processedP2LauncherFiles;
    private File targetDir;
    private File tempDir;
    private File sourceDir;
//    private URL metadataRepoURL;
//    private URL artifactRepoURL;
    private File p2AgentDir;
//    private File p2AgentPluginsDir;

	private ArrayList processedBundleArtifacts;

	private File REPO_GEN_LOCATION;
	
	private File categoryDeinitionFile;

	private File ARCHIVE_FILE;

    public void execute() throws MojoExecutionException, MojoFailureException {
        createRepo();
        performMopUp();
    }

    public void createRepo() throws MojoExecutionException, MojoFailureException {
        try {
            getProcessedFeatureArtifacts();
            getProcessedBundleArtifacts();
            createAndSetupPaths();
            extractFeatures();
            copyBundleArtifacts();
            copyResources();
            this.getLog().info("Running Equinox P2 Publisher Application for Repository Generation");
            String launcherJarLocation = P2Utils.getEquinoxLauncherJarLocation(p2AgentDir);
            generateRepository(launcherJarLocation);
            this.getLog().info("Running Equinox P2 Category Publisher Application for the Generated Repository");
            updateRepositoryWithCategories(launcherJarLocation);
            archiveRepo();
        } catch (Exception e) {
            this.getLog().error(e.getMessage(), e);
            throw new MojoExecutionException(e.getMessage(), e);
        }
    }
    
    private void copyResources() throws MojoExecutionException {
        List resources = project.getResources();
        if (resources != null) {
            getLog().info("Copying resources");
            for (Object obj : resources) {
                if (obj instanceof Resource) {
                    Resource resource = (Resource) obj;
                    try {
                        File resourceFolder = new File(resource.getDirectory());
                        if (resourceFolder.exists()) {
                            getLog().info("   " + resource.getDirectory());
                            FileManagementUtil.copyDirectory(resourceFolder, REPO_GEN_LOCATION);
                        }
                    } catch (IOException e) {
                        throw new MojoExecutionException("Unable copy resources: " + resource.getDirectory(), e);
                    }
                }
            }
        }
    }
    
    private void generateRepository(String launcher) throws Exception {
        String[] commands = new String[]{
                "java",
                "-jar", launcher,
                "-application", "org.eclipse.equinox.p2.publisher.FeaturesAndBundlesPublisher",
                "-metadataRepositoryName",getRepositoryName(),
                "-artifactRepositoryName",getRepositoryName(),
                "-metadataRepository", metadataRepository.toString(),
                "-artifactRepository", metadataRepository.toString(),
                "-source", sourceDir.getAbsolutePath(),
                "-publishArtifacts",
                "-publishArtifactRepository",
                "-compress",
                "-append"};

        Process child = Runtime.getRuntime().exec(commands);

        BufferedReader buf = new BufferedReader(new InputStreamReader(child.getInputStream()));
        String line = "";
        while ((line = buf.readLine()) != null) {
            this.getLog().info(line);
        }
        buf.close();

        child.waitFor();
        if (child.exitValue() != 0) {
            File[] equinoxLogFiles = P2Utils.getEquinoxLogFiles(p2AgentDir);
            if (equinoxLogFiles.length > 0) {
                getLog().error("View the equinox log(s) for errors");
                for (File file : equinoxLogFiles) {
                    getLog().error("\t" + file.getAbsolutePath());
                }
            }
            throw new MojoExecutionException("P2 repository generation failed for " + sourceDir.getAbsolutePath());
        }
    }

    private void updateRepositoryWithCategories(String launcher) throws Exception {
    	if (!isCategoriesAvailable()){
    		return;
    	}
    	P2Utils.createCategoryFile(getProject(), categories, categoryDeinitionFile, getArtifactFactory(), getRemoteRepositories(), getLocalRepository(), getResolver());
        String[] commands = new String[]{
                "java",
                "-jar", launcher,
                "-application", "org.eclipse.equinox.p2.publisher.CategoryPublisher",
                "-metadataRepository", metadataRepository.toString(),
                "-categoryDefinition", categoryDeinitionFile.toURL().toString(),
                "-compress",
                "-append"};

        Process child = Runtime.getRuntime().exec(commands);

        BufferedReader buf = new BufferedReader(new InputStreamReader(child.getInputStream()));
        String line = "";
        while ((line = buf.readLine()) != null) {
            this.getLog().info(line);
        }
        buf.close();

        child.waitFor();
        if (child.exitValue() != 0) {
            File[] equinoxLogFiles = P2Utils.getEquinoxLogFiles(p2AgentDir);
            if (equinoxLogFiles.length > 0) {
                getLog().error("View the equinox log(s) for errors");
                for (File file : equinoxLogFiles) {
                    getLog().error("\t" + file.getAbsolutePath());
                }
            }
            throw new MojoExecutionException("P2 repository generation failed for " + sourceDir.getAbsolutePath());
        }
    }
    
    private boolean isCategoriesAvailable(){
    	if (categories==null || categories.size()==0){
    		return false;
    	}
    	return true;
    }
    
    
    private void extractFeatures() throws MojoExecutionException {
        ArrayList processedFeatureArtifacts = getProcessedFeatureArtifacts();
        if (processedFeatureArtifacts == null) return;
        for (Iterator iterator = processedFeatureArtifacts.iterator(); iterator
                .hasNext();) {
            FeatureArtifact featureArtifact = (FeatureArtifact) iterator.next();
            try {
		getLog().info("Extracting feature "+featureArtifact.getGroupId()+":"+featureArtifact.getArtifactId());
                FileManagementUtil.unzip(featureArtifact.getArtifact().getFile(), sourceDir);
            } catch (Exception e) {
                throw new MojoExecutionException("Error occured when extracting the Feature Artifact: " + featureArtifact.toString(), e);
            }
        }
    }

    private void copyBundleArtifacts()throws MojoExecutionException {
        ArrayList processedBundleArtifacts = getProcessedBundleArtifacts();
        if (processedBundleArtifacts == null) return;
        File pluginsDir = new File(sourceDir,"plugins");
        for (Iterator iterator = processedBundleArtifacts.iterator(); iterator
                .hasNext();) {
            BundleArtifact bundleArtifact = (BundleArtifact) iterator.next();
            try {
            	File file = bundleArtifact.getArtifact().getFile();
                FileManagementUtil.copy(file, new File(pluginsDir,file.getName()));
            } catch (Exception e) {
                throw new MojoExecutionException("Error occured when extracting the Feature Artifact: " + bundleArtifact.toString(), e);
            }
        }
    }

    private ArrayList getProcessedFeatureArtifacts() throws MojoExecutionException {
        if (processedFeatureArtifacts != null)
            return processedFeatureArtifacts;
        if (featureArtifacts == null || featureArtifacts.size() == 0) return null;
        processedFeatureArtifacts = new ArrayList();
        Iterator iter = featureArtifacts.iterator();
        while (iter.hasNext()) {
            Object obj = iter.next();
            FeatureArtifact f;
            if (obj instanceof FeatureArtifact) {
                f = (FeatureArtifact) obj;
            } else if (obj instanceof String) {
                f = FeatureArtifact.getFeatureArtifact(obj.toString());
            } else
                f = (FeatureArtifact) obj;
            f.resolveVersion(getProject());
            f.setArtifact(MavenUtils.getResolvedArtifact(f, getArtifactFactory(), remoteRepositories, getLocalRepository(), getResolver()));
            processedFeatureArtifacts.add(f);
        }
        return processedFeatureArtifacts;
    }
    
    private void archiveRepo() throws MojoExecutionException {
    	if (isArchive()){
    		getLog().info("Generating repository archive...");
    		FileManagementUtil.zipFolder(REPO_GEN_LOCATION.toString(), ARCHIVE_FILE.toString());
    		getLog().info("Repository Archive: "+ARCHIVE_FILE.toString());
    		FileManagementUtil.deleteDirectories(REPO_GEN_LOCATION);
    	}
    }
    
    private ArrayList getProcessedBundleArtifacts() throws MojoExecutionException {
        if (processedBundleArtifacts != null)
            return processedBundleArtifacts;
        if (bundleArtifacts == null || bundleArtifacts.size() == 0) return null;
        processedBundleArtifacts = new ArrayList();
        Iterator iter = bundleArtifacts.iterator();
        while (iter.hasNext()) {
            Object obj = iter.next();
            BundleArtifact f;
            if (obj instanceof BundleArtifact) {
                f = (BundleArtifact) obj;
            } else if (obj instanceof String) {
                f = BundleArtifact.getBundleArtifact(obj.toString());
            } else
                f = (BundleArtifact) obj;
            f.resolveVersion(getProject());
            f.setArtifact(MavenUtils.getResolvedArtifact(f, getArtifactFactory(), remoteRepositories, getLocalRepository(), getResolver()));
            processedBundleArtifacts.add(f);
        }
        return processedBundleArtifacts;
    }

//    private ArrayList getProcessedP2LanucherFiles() throws MojoExecutionException{
//		if (equinoxLauncher==null)
//			equinoxLauncher=new EquinoxLauncher();
//    	processedP2LauncherFiles=P2Utils.getProcessedP2LanucherFiles(processedP2LauncherFiles, equinoxLauncher, getProject(), getArtifactFactory(), remoteRepositories, getLocalRepository(), getResolver());
//    	return processedP2LauncherFiles;
//    }

    private void createAndSetupPaths() throws Exception {
        targetDir = new File(getProject().getBasedir(), "target");
        String timestampVal = String.valueOf((new Date()).getTime());
        tempDir = new File(targetDir, "tmp." + timestampVal);
        sourceDir = new File(tempDir, "featureExtract");
        sourceDir.mkdirs();
        
		metadataRepository=(artifactRepository==null? metadataRepository:artifactRepository);
		artifactRepository=(metadataRepository==null? artifactRepository:metadataRepository);
		if (metadataRepository == null) {
			File repo = new File(targetDir, getProject().getArtifactId() + "_" + getProject().getVersion());
			metadataRepository = repo.toURL();
			artifactRepository = metadataRepository;
		}
        REPO_GEN_LOCATION=new File(metadataRepository.getFile().replace("/",File.separator));
        ARCHIVE_FILE=new File(targetDir,getProject().getArtifactId()+"_"+getProject().getVersion()+".zip");
        p2AgentDir = new File(p2AgentLocation);
        if (!p2AgentDir.isDirectory()) {
            throw new Exception("Please specify a valid location of a P2 Agent Distribution");
        }
        categoryDeinitionFile=File.createTempFile("equinox-p2", "category");
//        try {
//            if (metadataRepository != null) {
//                metadataRepoURL = metadataRepository;
//            }
//            if (artifactRepository != null) {
//                artifactRepoURL = artifactRepository;
//            }
//            File repo = new File(targetDir, getProject().getArtifactId() + "-repository_" + getProject().getVersion());
//            if (metadataRepoURL == null) {
//                if (repository != null)
//                    metadataRepoURL = repository;
//                else
//                    metadataRepoURL = repo.toURL();
//            }
//            if (artifactRepoURL == null) {
//                if (repository != null)
//                    artifactRepoURL = repository;
//                else
//                    artifactRepoURL = repo.toURL();
//            }
//        } catch (MalformedURLException e) {
//            throw new MojoExecutionException("Unable to determine the target repository location", e);
//        }
    }

    private void performMopUp() {
        try {
            FileUtils.deleteDirectory(tempDir);
        } catch (Exception e) {
            getLog().warn(new MojoExecutionException("Unable complete mop up operation", e));
        }
    }

//    private void setupLauncherLocation() throws MojoExecutionException {
//        if (p2Profile == null)
//            throw new MojoExecutionException("A valid p2 profile must be specified");
//        p2Profile.resolveVersion(project);
//        p2Profile.setArtifact(MavenUtils.getResolvedArtifact(p2Profile, artifactFactory, remoteRepositories, localRepository, resolver));
//        if (equinoxLauncher == null)
//            equinoxLauncher = new EquinoxLauncher();
//        P2Utils.setupLauncherLocation(p2Profile, p2AgentDir, p2AgentPluginsDir, equinoxLauncher);
//    }


    public void setP2Profile(P2Profile p2Profile) {
        this.p2Profile = p2Profile;
    }


    public P2Profile getP2Profile() {
        return p2Profile;
    }

//    public URL getMetadataLocationURL() {
//        return metadataRepoURL;
//    }
//
//    public URL getArtifactLocationURL() {
//        return artifactRepoURL;
//    }

//    public URL getRepository() {
//        return repository;
//    }
//
//    public void setRepository(URL url) {
//        repository = url;
//        ;
//    }

    public void setProject(MavenProject project) {
        this.project = project;
    }

    public void setArtifactFactory(org.apache.maven.artifact.factory.ArtifactFactory artifactFactory) {
        this.artifactFactory = artifactFactory;
    }

    public void setResolver(org.apache.maven.artifact.resolver.ArtifactResolver resolver) {
        this.resolver = resolver;
    }

    public void setLocalRepository(org.apache.maven.artifact.repository.ArtifactRepository localRepository) {
        this.localRepository = localRepository;
    }

    public void setRemoteRepositories(List remoteRepositories) {
        this.remoteRepositories = remoteRepositories;
    }

    public MavenProject getProject() {
        return project;
    }

    public ArtifactFactory getArtifactFactory() {
        return artifactFactory;
    }

    public ArtifactResolver getResolver() {
        return resolver;
    }

    public ArtifactRepository getLocalRepository() {
        return localRepository;
    }

    public List getRemoteRepositories() {
        return remoteRepositories;
    }

	public String getRepositoryName() {
		if (name==null){
			return getProject().getArtifactId();
		}else{
			return name;
		}
	}

	public boolean isArchive() {
		return archive;
	}
}
