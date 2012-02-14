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

package org.wso2.carbonstudio.eclipse.capp.artifact.gadgets.utils;

import java.io.File;
import java.util.Map;

import org.wso2.carbonstudio.eclipse.capp.core.manifest.Artifact;
import org.wso2.carbonstudio.eclipse.capp.core.utils.ArtifactBundleCreator;
import org.wso2.carbonstudio.eclipse.utils.archive.ArchiveManipulator;
import org.wso2.carbonstudio.eclipse.utils.file.FileUtils;

public class GadgetArtifactBundleCreator extends ArtifactBundleCreator {

	public GadgetArtifactBundleCreator(Artifact artifact, File location, String parentApplication) {
	    super(artifact, location, parentApplication);
    }

//	public File getBundle() throws Exception {
//        File tmpFolder = FileUtils.createTempDirectory();
//        File bundleContentPath = getArtifactContent(new File(tmpFolder,"bundle-content"));
//    	ArchiveManipulator archiveManipulator = new ArchiveManipulator();
//        File metainfPath = new File(bundleContentPath,"META-INF");
//        File manifestFile=new File(metainfPath,"MANIFEST.MF");
//        manifestFile.getParentFile().mkdirs();
//        CAppArtifactBundleManifest cAppArtifactBundleManifest = new CAppArtifactBundleManifest(getArtifact());
//        cAppArtifactBundleManifest.setParentApplication(getParentApplication());
//        cAppArtifactBundleManifest.toFile(manifestFile);
//        File bundle = new File(tmpFolder,getArtifact().getName()+"-"+getArtifact().getTimestampedVersion()+".jar");
//        archiveManipulator.archiveDir(bundle.toString(), bundleContentPath.toString());
//        return bundle;
//	}
	
	public Map<Artifact,File> getArtifactContent(File contentLocation) throws Exception {
        File tmpFolder = contentLocation==null? new File(FileUtils.createTempDirectory(),getArtifact().getName()+"-"+getArtifact().getTimestampedVersion()):contentLocation;
        File bundleContentPath = tmpFolder;
		File gadgetPath = new File(getLocation(),getArtifact().getFile());
        bundleContentPath.mkdirs();
    	ArchiveManipulator archiveManipulator = new ArchiveManipulator();
        if (gadgetPath.exists() && gadgetPath.isDirectory()){
        	File gaaaaaaaaaaaaaaaaaaaar = new File(bundleContentPath,getArtifact().getName()+"_"+getArtifact().getVersion()+".dar");
        	archiveManipulator.archiveDir(gaaaaaaaaaaaaaaaaaaaar.toString(), gadgetPath.toString());
            String s=getArtifact().getFile();
            getArtifact().setFile(gaaaaaaaaaaaaaaaaaaaar.getName());
            getArtifact().toFile(new File(bundleContentPath,getArtifact().getDefaultName()));
            getArtifact().setFile(s);
        }else{
        	FileUtils.copyDirectory(getLocation(), bundleContentPath);
        }
        return createArtifactMap(getArtifact(),tmpFolder);
	}
}
