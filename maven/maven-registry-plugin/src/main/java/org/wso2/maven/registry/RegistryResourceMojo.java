package org.wso2.maven.registry;

import java.io.File;
import java.io.IOException;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.project.MavenProject;
import org.apache.maven.project.MavenProjectHelper;
import org.wso2.carbonstudio.eclipse.utils.archive.ArchiveManipulator;
import org.wso2.carbonstudio.eclipse.utils.file.FileUtils;

/**
 * This is the Maven Mojo used for rule service to be copied to the output
 * directory in the resource-process phase.
 *
 * @goal package-registry
 *
 */
public class RegistryResourceMojo extends AbstractMojo{
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
	 * The path of the existing artifact
	 * 
	 * @parameter expression="${deploy-file.artifact}"
	 * @required
	 */
	private File artifact;

	/**
	 * The resulting extension of the file
	 * 
	 * @parameter expression="${deploy-file.extension}
	 */
	private String extension;

	/**
	 * The resulting extension of the file
	 * 
	 * @parameter expression="${deploy-file.fileName}
	 */
	private String fileName;

	/**
	 * If the file should be archived
	 * 
	 * @parameter expression="${deploy-file.enableArchive}" default-value=false
	 */
	private boolean enableArchive;

	private File destFolder;
	
	public void execute() throws MojoExecutionException, MojoFailureException {
		destFolder = new File(project.getBasedir(), "target");
		File allRegResources = new File(artifact.getParent(), "all-reg-resources");
		if(allRegResources.exists()){
			deleteDir(allRegResources);
		}
		File zipFile;
		String newPath = null;
		File resourceFile = new File(destFolder,"resources");
//		File result;
//		if (fileName != null) { // if the user gave a name for the file
//			
//			result = new File(destFolder,fileName);
//		} else {
//			if (extension != null) { // if the user provided the extension
//				String fileNameWithoutExtension = (artifact.getName()
//						.split("\\."))[0];
//				result = new File(destFolder,fileNameWithoutExtension + "." + extension);
//			} else {
//				//collection
//				result = new File(destFolder,artifact.getName());
//				
//				
//			}
//		}

		if (!artifact.exists()) {
			throw new MojoExecutionException(artifact.getAbsolutePath() + " doesn't exist.");
		}

		try {
			//copy resource folder + reg-resource.info.xml
			
			copyAllRegResources(allRegResources);
			FileUtils.copyDirectory(allRegResources, resourceFile);
			zipFile = new File(resourceFile.getPath() + ".zip");
			ArchiveManipulator archiveManupulator = new ArchiveManipulator();
			archiveManupulator.archiveDir(zipFile, allRegResources);

		} catch (IOException e) {
			throw new MojoExecutionException("Error when copying " + artifact.getName() + " to " +
					resourceFile.getName() + "\n" + e.getMessage());
		}

		if (zipFile != null && zipFile.exists()) {
			project.getArtifact().setFile(zipFile);
			//projectHelper.attachArtifact(project, extension, null, result);
		} else {
			throw new MojoExecutionException(resourceFile
					+ " is null or doesn't exist");
		}

		if (enableArchive) {
			// TODO make the zip file
		}
	}
	
	public static boolean deleteDir(File dir) {
        if (dir.isDirectory()) {
            String[] children = dir.list();
            for (int i=0; i<children.length; i++) {
                boolean success = deleteDir(new File(dir, children[i]));
                if (!success) {
                    return false;
                }
            }
        }
    
        // The directory is now empty so delete it
        return dir.delete();
    }
	
	public void copyAllRegResources(File resourceParent) throws IOException{
		File regResourceFile = new File(resourceParent, artifact.getName());
		File[] regFiles = artifact.getParentFile().listFiles();
		FileUtils.copy(artifact, regResourceFile);
		for (File file : regFiles) {
			File destinationFile  = new File(resourceParent, file.getName()); 
			if(file.getName().equals("resources") && file.isDirectory()){
				FileUtils.copyDirectory(file, destinationFile);
				
			}
		}
	}

}
