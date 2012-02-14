/*
 * Copyright (c) 2010, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
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

package org.wso2.carbonstudio.eclipse.capp.artifact.libraries.utils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.wso2.carbonstudio.eclipse.capp.artifact.libraries.Activator;
import org.wso2.carbonstudio.eclipse.capp.core.manifest.Artifact;
import org.wso2.carbonstudio.eclipse.capp.core.manifest.CAppArtifactBundleManifest;
import org.wso2.carbonstudio.eclipse.utils.archive.ArchiveManipulator;
import org.wso2.carbonstudio.eclipse.capp.core.utils.ArtifactBundleCreator;
import org.wso2.carbonstudio.eclipse.logging.core.ICarbonStudioLog;
import org.wso2.carbonstudio.eclipse.logging.core.Logger;
import org.wso2.carbonstudio.eclipse.utils.file.FileUtils;

public class LibraryArtifactBundleCreator extends ArtifactBundleCreator {
	private static ICarbonStudioLog log=Logger.getLog(Activator.PLUGIN_ID);

	public LibraryArtifactBundleCreator(Artifact artifact, File location, String parentApplication) {
	    super(artifact, location, parentApplication);
    }
	
	public File getBundle() throws Exception{
		try {
	        File tmpFolder = FileUtils.createTempDirectory();
	        File bundleContentPath = new File(tmpFolder,"bundle-content");
	        FileUtils.copyDirectory(getLocation(), bundleContentPath);
	        File metainfPath = new File(bundleContentPath,"META-INF");
	        
	        File manifestFile=new File(metainfPath,"MANIFEST.MF");
	        manifestFile.getParentFile().mkdirs();
	        CAppArtifactBundleManifest cAppArtifactBundleManifest = new CAppArtifactBundleManifest(getArtifact());
	        cAppArtifactBundleManifest.setParentApplication(getParentApplication());
	        cAppArtifactBundleManifest.setDynamicImports(true);
	        //updating the bundle classpath + export package list
	        File libraryInfoFile = new File(getLocation(),getArtifact().getFile());
	        BundlesDataInfo bundlesDataInfo = new BundlesDataInfo();
	        bundlesDataInfo.loadFromFile(libraryInfoFile);
	        cAppArtifactBundleManifest.setFragmentHost(bundlesDataInfo.getFragmentHost());
	        Map<String, List<String>> exportedPackageLists = bundlesDataInfo.getExportedPackageListsFromJar();
	        for (String jarPath : exportedPackageLists.keySet()) {
	        	cAppArtifactBundleManifest.getBundleClassPath().add(jarPath);
	        	cAppArtifactBundleManifest.getExportPackagesList().addAll(exportedPackageLists.get(jarPath));
            }
	        
	        Map<IProject, List<String>> exportedPackagesFromProject = bundlesDataInfo.getExportedPackageListsFromProject();
	        if (exportedPackagesFromProject.size()>0){
		        File prjLibPath = new File(bundleContentPath,"project-libraries");
		        prjLibPath.mkdirs();
    	        for (IProject project : exportedPackagesFromProject.keySet()) {
    	        	File libraryResource = ProjectUtils.generateJar(project);
    	        	FileUtils.copy(libraryResource, new File(prjLibPath,libraryResource.getName()));
    	        	cAppArtifactBundleManifest.getBundleClassPath().add(prjLibPath.getName()+"/"+libraryResource.getName());
    	        	Map<File, ArrayList<String>> processJarList = FileUtils.processJarList(new File[]{libraryResource});
    	        	cAppArtifactBundleManifest.getExportPackagesList().addAll(processJarList.get(libraryResource));
//    	        	cAppArtifactBundleManifest.getExportPackagesList().addAll(exportedPackageLists.get(project));
                }
	        }
	        
	        cAppArtifactBundleManifest.toFile(manifestFile);
	        File bundle = new File(tmpFolder,getArtifact().getName()+"-"+getArtifact().getTimestampedVersion()+".jar");
	        new ArchiveManipulator().archiveDir(bundle.toString(), bundleContentPath.toString());
	        return bundle;
        } catch (IOException e) {
	        log.error(e);
        }
		return null;
	}
	
	public Map<Artifact,File> getArtifactContent(File contentLocation) throws Exception {
        File tmpFolder = contentLocation==null? new File(FileUtils.createTempDirectory(),getArtifact().getName()+"-"+getArtifact().getTimestampedVersion()):contentLocation;
        File bundle = getBundle();
        FileUtils.copy(bundle, new File(tmpFolder,bundle.getName()));
        File file = getArtifact().getSource().getLocation().toFile();
        String fileName = getArtifact().getFile();
        getArtifact().setFile(bundle.getName());
        getArtifact().toFile(new File(tmpFolder,file.getName()));
        getArtifact().setFile(fileName);
        return createArtifactMap(getArtifact(),tmpFolder);
	}
}
