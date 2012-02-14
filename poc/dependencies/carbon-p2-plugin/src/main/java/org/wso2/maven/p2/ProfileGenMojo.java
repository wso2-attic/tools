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
import java.io.FilenameFilter;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.project.MavenProject;
import org.apache.maven.project.MavenProjectHelper;
import org.codehaus.plexus.util.FileUtils;
import org.wso2.maven.p2.generate.utils.FileManagementUtil;
import org.wso2.maven.p2.generate.utils.MavenUtils;
import org.wso2.maven.p2.generate.utils.P2Utils;

/**
 * Write environment information for the current build to file.
 *
 * @goal p2-profile-gen
 * @phase package
 */
public class ProfileGenMojo extends AbstractMojo {


    /**
     * Destination to which the features should be installed
     *
     * @parameter
     * @required
     */
    private String destination;

    /**
     * target profile
     *
     * @parameter
     * @required
     */
    private String profile;

    /**
     * URL of the p2 agent distribution
     *
     * @parameter
     * @required
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
     * List of features
     *
     * @parameter
     * @required
     */
    private ArrayList features;

    /**
     * Flag to indicate whether to delete old profile files
     *
     * @parameter default-value="true"
     */
    private boolean deleteOldProfileFiles = true;

    /**
     * Location of the p2 repository
     *
     * @parameter
     */
    private P2Repository p2Repository;

    /**
     * @parameter default-value="${project}"
     */
    private MavenProject project;

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
    private java.util.List remoteRepositories;

    /**
     * Equinox p2 configuration path
     *
     * @parameter
     */
    private P2Profile p2Profile;

    /**
     * Maven ProjectHelper.
     *
     * @component
     */
    private MavenProjectHelper projectHelper;

//    private ArrayList processedP2LauncherFiles;
    private File FOLDER_TARGET;
    private File FOLDER_TEMP;
//    private URL URL_METADATA_LOCATION;
//    private URL URL_ARTIFACT_LOCATION;
//    private File FOLDER_P2_LAUNCHER;
//    private File FOLDER_P2_LAUNCHER_PLUGINS;
    private File FOLDER_TEMP_REPO_GEN;
    private File FILE_FEATURE_PROFILE;
    private File p2AgentDir;

    public void execute() throws MojoExecutionException, MojoFailureException {
        try {
            createAndSetupPaths();
//            verifySetupP2RepositoryURL();
            this.getLog().info("Running Equinox P2 Director Application");
            String launcherJarLocation = P2Utils.getEquinoxLauncherJarLocation(p2AgentDir);
            installFeatures(getIUsToInstall(), launcherJarLocation);

            //deleting old profile files, if specified
            if (deleteOldProfileFiles) {
                deleteOldProfiles();
            }
        } catch (Exception e) {
            throw new MojoExecutionException(e.getMessage(), e);
        }
//        createArchive();
//        deployArtifact();
        performMopUp();
    }

    private String getIUsToInstall() throws MojoExecutionException {
        String installUIs = "";
        for (Object featureObj : features) {
            Feature f;
            if (featureObj instanceof Feature) {
                f = (Feature) featureObj;
            } else if (featureObj instanceof String) {
                f = Feature.getFeature(featureObj.toString());
            } else
                f = (Feature) featureObj;
            installUIs = installUIs + f.getId().trim() + "/" + f.getVersion().trim() + ",";
        }

        if (installUIs.length() == 0) {
            installUIs = installUIs.substring(0, installUIs.length() - 1);
        }
        return installUIs;
    }

    private void installFeatures(String installUIs, String launcher) throws Exception {
        String[] commands = new String[]{
                "java",
                "-jar", launcher,
                "-application", "org.eclipse.equinox.p2.director",
                "-metadataRepository", metadataRepository.toExternalForm(),
                "-artifactRepository", artifactRepository.toExternalForm(),
                "-installIU", installUIs,
                "-destination", destination,
                "-profile", profile};

        Process child = Runtime.getRuntime().exec(commands);

        BufferedReader buf = new BufferedReader(new InputStreamReader(child.getInputStream()));
        String line = "";
        while ((line = buf.readLine()) != null) {
            this.getLog().info(line);
        }
        buf.close();

        child.waitFor();

        if (child.exitValue() != 0) {
            File[] equinoxLogFiles = P2Utils.getEquinoxLogFiles(new File(destination)); //TODO improve
            if (equinoxLogFiles.length > 0) {
                getLog().error("View the equinox log(s) for errors");
                for (File file : equinoxLogFiles) {
                    getLog().error("\t" + file.getAbsolutePath());
                }
            }
            throw new MojoExecutionException("Failed to install features... ");
        }
    }
//	private void setupLauncherLocation() throws MojoExecutionException{
//		if (p2Profile==null)
//			throw new MojoExecutionException("A valid p2 profile must be specified");
//		p2Profile.resolveVersion(project);
//		p2Profile.setArtifact(MavenUtils.getResolvedArtifact(p2Profile, artifactFactory, remoteRepositories, localRepository, resolver));
//		if (equinoxLauncher==null)
//		equinoxLauncher=new EquinoxLauncher();
//		P2Utils.setupLauncherLocation(p2Profile, FOLDER_P2_LAUNCHER, FOLDER_P2_LAUNCHER_PLUGINS, equinoxLauncher);
//	}
//    private ArrayList getProcessedP2LanucherFiles() throws MojoExecutionException{
//		if (equinoxLauncher==null)
//			equinoxLauncher=new EquinoxLauncher();
//    	processedP2LauncherFiles=P2Utils.getProcessedP2LanucherFiles(processedP2LauncherFiles, equinoxLauncher, project, artifactFactory, remoteRepositories, localRepository, resolver);
//    	return processedP2LauncherFiles;

    //    }
   /* private void verifySetupP2RepositoryURL() throws MojoExecutionException, MojoFailureException {
        if (p2Repository == null)
            throw new MojoExecutionException("No P2 repositories are defined.");
        if (p2Repository.getGenerateRepo() != null) {
            setRepoGenOptions(p2Repository.getGenerateRepo());
            p2Repository.getGenerateRepo().execute();
            URL_METADATA_LOCATION = p2Repository.getGenerateRepo().getMetadataLocationURL();
            URL_ARTIFACT_LOCATION = p2Repository.getGenerateRepo().getArtifactLocationURL();
        } else {
            if (p2Repository.getMetadataRepository() != null) {
                URL_METADATA_LOCATION = p2Repository.getMetadataRepository();
            }
            if (p2Repository.getArtifactRepository() != null) {
                URL_ARTIFACT_LOCATION = p2Repository.getArtifactRepository();
            }
            if (URL_METADATA_LOCATION == null) {
                if (p2Repository.getRepository() != null)
                    URL_METADATA_LOCATION = p2Repository.getRepository();
                else
                    throw new MojoExecutionException("Metadata repository information is not defined.");
            }
            if (URL_ARTIFACT_LOCATION == null) {
                if (p2Repository.getRepository() != null)
                    URL_ARTIFACT_LOCATION = p2Repository.getRepository();
                else
                    throw new MojoExecutionException("Artifact repository information is not defined.");
            }
        }

    }*/

    private void createAndSetupPaths() throws Exception {
        FOLDER_TARGET = new File(project.getBasedir(), "target");
        String timestampVal = String.valueOf((new Date()).getTime());
        FOLDER_TEMP = new File(FOLDER_TARGET, "tmp." + timestampVal);
//        FOLDER_P2_LAUNCHER = new File(FOLDER_TEMP, "p2lanucher");
//        FOLDER_P2_LAUNCHER_PLUGINS = new File(FOLDER_P2_LAUNCHER, "plugins");
        FOLDER_TEMP_REPO_GEN = new File(FOLDER_TEMP, "temp_repo");
        FILE_FEATURE_PROFILE = new File(FOLDER_TARGET, project.getArtifactId() + "-" + project.getVersion() + ".zip");

        p2AgentDir = new File(p2AgentLocation);
        if (!p2AgentDir.isDirectory()) {
            throw new Exception("Please specify a valid location of a P2 Agent Distribution");
        }
    }

    private void deleteOldProfiles() {
//        String destination = FOLDER_P2_LAUNCHER.getAbsolutePath();
        if (!destination.endsWith("/")) {
            destination = destination + "/";
        }
        String profileFolderName = destination +
                "p2/org.eclipse.equinox.p2.engine/profileRegistry/" + profile + ".profile";

        File profileFolder = new File(profileFolderName);
        if (profileFolder.isDirectory()) {
            String[] profileFileList = profileFolder.list(new FilenameFilter() {
                public boolean accept(File dir, String name) {
                    return name.endsWith(".profile");
                }
            });

            Arrays.sort(profileFileList);

            //deleting old profile files
            for (int i = 0; i < (profileFileList.length - 1); i++) {
                File profileFile = new File(profileFolderName, profileFileList[i]);
                profileFile.delete();
            }
        }
    }

//    private void setRepoGenOptions(RepositoryGenMojo repoGen) throws MojoExecutionException {
//        repoGen.setProject(project);
//        repoGen.setArtifactFactory(artifactFactory);
//        repoGen.setLocalRepository(localRepository);
//        repoGen.setRemoteRepositories(remoteRepositories);
//        repoGen.setResolver(resolver);
//        if (repoGen.getP2Profile() == null)
//            repoGen.setP2Profile(p2Profile);
//        if (repoGen.getRepository() == null)
//            try {
//                repoGen.setRepository(FOLDER_TEMP_REPO_GEN.toURL());
//            } catch (MalformedURLException e) {
//                throw new MojoExecutionException("Error specifying a repo location", e);
//            }
//    }

//    private void createArchive() throws MojoExecutionException {
//        getLog().info("Generating feature profile artifact: " + FILE_FEATURE_PROFILE.getAbsolutePath());
//        FileManagementUtil.zipFolder(FOLDER_P2_LAUNCHER.getAbsolutePath(), FILE_FEATURE_PROFILE.getAbsolutePath());
//    }

    private void deployArtifact() {
        if (FILE_FEATURE_PROFILE != null && FILE_FEATURE_PROFILE.exists()) {
            project.getArtifact().setFile(FILE_FEATURE_PROFILE);
            projectHelper.attachArtifact(project, "zip", null, FILE_FEATURE_PROFILE);
        }
    }

    private void performMopUp() {
        try {
            FileUtils.deleteDirectory(FOLDER_TEMP);
        } catch (Exception e) {
            getLog().warn(new MojoExecutionException("Unable complete mop up operation", e));
        }
    }
}
