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

package org.wso2.carbonstudio.eclipse.capp.artifact.axis2.utils;

import java.io.File;
import java.util.Map;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.wso2.carbonstudio.eclipse.capp.artifact.axis2.core.Axis2Artifact;
import org.wso2.carbonstudio.eclipse.capp.core.manifest.Artifact;
import org.wso2.carbonstudio.eclipse.capp.core.utils.ArtifactBundleCreator;
import org.wso2.carbonstudio.eclipse.utils.archive.ArchiveManipulator;
import org.wso2.carbonstudio.eclipse.utils.file.FileUtils;
import org.wso2.carbonstudio.eclipse.utils.wst.Axis2ServiceUtils;

public class Axis2ArtifactBundleCreator extends ArtifactBundleCreator {

	public Axis2ArtifactBundleCreator(Artifact artifact, File location, String parentApplication) {
	    super(artifact, location, parentApplication);
    }
	
//	public File getBundle() throws Exception{
//        File tmpFolder = FileUtils.createTempDirectory();
//        File bundleContentPath = getArtifactContent(new File(tmpFolder,"bundle-content"));
//        File metainfPath = new File(bundleContentPath,"META-INF");
//        File manifestFile=new File(metainfPath,"MANIFEST.MF");
//        manifestFile.getParentFile().mkdirs();
//        CAppArtifactBundleManifest cAppArtifactBundleManifest = new CAppArtifactBundleManifest(getArtifact());
//        cAppArtifactBundleManifest.setParentApplication(getParentApplication());
//        cAppArtifactBundleManifest.toFile(manifestFile);
//        File bundle = new File(tmpFolder,getArtifact().getName()+"-"+getArtifact().getTimestampedVersion()+".jar");
//        new ArchiveManipulator().archiveDir(bundle.toString(), bundleContentPath.toString());
//        return bundle;
//       
//	}
	
	public Map<Artifact,File> getArtifactContent(File contentLocation) throws Exception{
        File tmpFolder = contentLocation==null? new File(FileUtils.createTempDirectory(),getArtifact().getName()+"-"+getArtifact().getTimestampedVersion()):contentLocation;
       	File location=getLocation();
        File bundleContentPath = tmpFolder;
        FileUtils.copyDirectory(location, bundleContentPath);
    	IPath workspaceArtifactPath = new Path(location.toString()).append(getArtifact().getFile());
    	if (workspaceArtifactPath.getFileExtension().equalsIgnoreCase("service")){
    		Axis2Artifact axis2Artifact = new Axis2Artifact(workspaceArtifactPath.toFile());
    		File archive = axis2Artifact.getArtifact(true);
    		File dst = new File(bundleContentPath,archive.getName());
    		dst.createNewFile();
			FileUtils.copy(archive, dst);
			String s=getArtifact().getFile();
            getArtifact().setFile(dst.getName());
            getArtifact().toFile(new File(bundleContentPath,getArtifact().getDefaultName()));
            getArtifact().setFile(s);
    	}else if (!(new File(workspaceArtifactPath.toOSString()).exists())){
    		IFolder folder = ResourcesPlugin.getWorkspace().getRoot().getFolder(workspaceArtifactPath);
    		IPath path = folder.getFullPath().removeFirstSegments(ResourcesPlugin.getWorkspace().getRoot().getLocation().segmentCount());
    		folder=ResourcesPlugin.getWorkspace().getRoot().getFolder(path);
    		if (folder.isLinked()){
                String serviceName =Axis2ServiceUtils.getServiceNameFromFolder(folder.getLocation().toOSString());
                File archiveFile = new File(bundleContentPath, serviceName + ".aar");
                new ArchiveManipulator().archiveDir(archiveFile.toString(),folder.getLocation().toOSString());
                String s=getArtifact().getFile();
                getArtifact().setFile(archiveFile.getName());
                getArtifact().toFile(new File(bundleContentPath,getArtifact().getDefaultName()));
                getArtifact().setFile(s);
    		}
    	}
        return createArtifactMap(getArtifact(),tmpFolder);
	}
}
