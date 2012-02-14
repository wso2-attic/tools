package org.wso2.carbonstudio.eclipse.capp.artifact.registry.utils;

import java.io.File;
import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.wso2.carbonstudio.eclipse.capp.artifact.registry.Activator;
import org.wso2.carbonstudio.eclipse.capp.artifact.registry.core.RegistryArtifactHandler;
import org.wso2.carbonstudio.eclipse.capp.core.artifacts.manager.CAppEnvironment;
import org.wso2.carbonstudio.eclipse.capp.core.artifacts.manager.ICAppArtifactManager;
import org.wso2.carbonstudio.eclipse.capp.core.manifest.Artifact;
import org.wso2.carbonstudio.eclipse.logging.core.ICarbonStudioLog;
import org.wso2.carbonstudio.eclipse.logging.core.Logger;
import org.wso2.carbonstudio.eclipse.utils.file.FileUtils;

public class RegistryResourceUtils {
	private static final String REGISTRY_INFO_FILE = "registry-info.xml";
	private static ICAppArtifactManager cAppArtifactManager = RegistryArtifactHandler.getCAppArtifactManager();
	private static ICarbonStudioLog log=Logger.getLog(Activator.PLUGIN_ID);

	public static void createRegistryResourceArtifact(IProject project, Artifact artifact,
			String regPathTodeploy, boolean importCollectionFromFS,
			boolean copyContent, boolean openResource, File inputFile) throws IOException,
			CoreException, Exception {
		IFile file=cAppArtifactManager.getCAppArtifactsLocation(project).getFolder(artifact.getName()).getFile("artifact.xml");
		artifact.setSource(file);
		createRegistryResourceArtifact(file, artifact, regPathTodeploy, importCollectionFromFS, copyContent, openResource, inputFile);
	}
	
	
	public static void createRegistryResourceArtifact(IProject project, String artifactName, String serverRole,
			String regPathTodeploy, boolean importCollectionFromFS,
			boolean copyContent, boolean openResource, File inputFile) throws IOException,
			CoreException, Exception {
		Artifact artifact = new Artifact(null);
		artifact.setName(artifactName);
		artifact.setVersion("1.0.0");
		artifact.setType(RegistryArtifactHandler.getType());
		artifact.setServerRole(serverRole);
		createRegistryResourceArtifact(project, artifact, regPathTodeploy, importCollectionFromFS, copyContent, openResource, inputFile);
	}
	
	public static void createRegistryResourceArtifact(IProject project, String artifactName,
			String regPathTodeploy, boolean importCollectionFromFS,
			boolean copyContent, boolean openResource,File inputFile) throws IOException,
			CoreException, Exception {
		createRegistryResourceArtifact(project, artifactName, new RegistryArtifactHandler().getDefaultServerRole().getServerRoleName(), regPathTodeploy, importCollectionFromFS, copyContent, openResource, inputFile);
	}
	
	public static void createRegistryResourceArtifact(IFile file, Artifact artifact,
			String regPathTodeploy, boolean importCollectionFromFS,
			boolean copyContent, boolean openResource, File inputFile) throws IOException,
			CoreException, Exception {
		File tmpFolder = FileUtils.createTempDirectory();
		File registryInfoFile = new File(FileUtils.createTempDirectory(),REGISTRY_INFO_FILE);
		String resourceDirectoryName = "resources";
		File resourceFolder = new File(tmpFolder,resourceDirectoryName);
		File dumpPath=resourceFolder;
		dumpPath.mkdirs();
		RegistryResourceInfoDoc regResInfoDoc = new RegistryResourceInfoDoc();
		if (inputFile.isFile()){
			FileUtils.copyFile(inputFile.toString(), new File(dumpPath,inputFile.getName()).toString());
    		CAppEnvironment.getRegistryHandler().createMetaDataForFolder(regPathTodeploy, resourceFolder);
			addRegistryResourceInfo(inputFile, regResInfoDoc,inputFile.getParentFile(),regPathTodeploy);
		}else{
			if(importCollectionFromFS){
				if(copyContent){
		    		FileUtils.copyDirectory(inputFile, resourceFolder);
		    		CAppEnvironment.getRegistryHandler().createMetaDataForFolder(regPathTodeploy, resourceFolder);
		    		File[] listFiles = inputFile.listFiles();
		        	for (File res : listFiles) {
		        		addRegistryResourceInfo(res, regResInfoDoc,inputFile,regPathTodeploy);
					}
		    	}else{
		    		File folder = new File(resourceFolder.getPath() , inputFile.getName()); 
		        	FileUtils.copyDirectory(inputFile, folder);
		        	CAppEnvironment.getRegistryHandler().createMetaDataForFolder(regPathTodeploy, folder);
		        	addRegistryResourceInfo(inputFile, regResInfoDoc,inputFile.getParentFile(),regPathTodeploy);
		    	}
		    }else{
		    	//for checking from registry option it is same as un-ticked option of option 2 
		    	File folder = new File(resourceFolder.getPath() , inputFile.getName()); 
		    	FileUtils.copyDirectory(inputFile, folder);
		    	CAppEnvironment.getRegistryHandler().createMetaDataForFolder(regPathTodeploy, folder);
		    	addRegistryResourceInfo(inputFile, regResInfoDoc,inputFile.getParentFile(),regPathTodeploy);
		    }
		}
		regResInfoDoc.toFile(registryInfoFile);
		artifact.setFile(registryInfoFile.toString());
		cAppArtifactManager.createArtifact(file, artifact,tmpFolder,openResource);
		if (inputFile.isFile() && openResource){
			IFolder artifactfolder = (IFolder)artifact.getSource().getParent();
			IFile file2 = artifactfolder.getFolder(resourceDirectoryName).getFile(inputFile.getName());
			try {
				IDE.openEditor(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage(),file2);
			} catch (Exception e) {
				log.error("Error while trying to open the file in eclipse", e);
			}
		} else if (((IFolder) artifact.getSource().getParent()).getFile(REGISTRY_INFO_FILE)
		                                                       .exists()) {
			try {
				IDE.openEditor(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage(),
				               ((IFolder) artifact.getSource().getParent()).getFile(REGISTRY_INFO_FILE));
			} catch (Exception e) {
				log.error("Error while trying to open the file in eclipse", e);
			}
		}
	}
	
	private static void addRegistryResourceInfo(File inputFile,
			RegistryResourceInfoDoc regResInfoDoc, File base, String path) {
		String relativePath = inputFile.getAbsolutePath().substring(base.getParent().length() +1);
    	
		if (inputFile.isFile()){
			regResInfoDoc.addRegistryResourceInfoDoc(path,
				  inputFile,
				  0, base, "");
		}else{
        	path=path.endsWith("/")? path:path+"/";
        	path+=inputFile.getName();
//        	path+=relativePath;
        	regResInfoDoc.addRegistryResourceInfoDoc(path,
        			inputFile,
				  1,base, relativePath);
		}
	}
}
