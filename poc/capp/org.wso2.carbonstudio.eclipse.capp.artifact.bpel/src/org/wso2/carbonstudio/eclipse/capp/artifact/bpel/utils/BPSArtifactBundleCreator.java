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

package org.wso2.carbonstudio.eclipse.capp.artifact.bpel.utils;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.wso2.carbonstudio.eclipse.capp.artifact.bpel.Activator;
import org.wso2.carbonstudio.eclipse.capp.artifact.bpel.core.BPELHandlerRequester;
import org.wso2.carbonstudio.eclipse.capp.core.manifest.Artifact;
import org.wso2.carbonstudio.eclipse.capp.core.utils.ArtifactBundleCreator;
import org.wso2.carbonstudio.eclipse.logging.core.ICarbonStudioLog;
import org.wso2.carbonstudio.eclipse.logging.core.Logger;
import org.wso2.carbonstudio.eclipse.utils.file.FileUtils;

public class BPSArtifactBundleCreator extends ArtifactBundleCreator {
	private static ICarbonStudioLog log=Logger.getLog(Activator.PLUGIN_ID);

	public BPSArtifactBundleCreator(Artifact artifact, File location, String parentApplication) {
	    super(artifact, location, parentApplication);
    }
//	public File getBundle() throws Exception{
//		try {
//	        File tmpFolder = FileUtils.createTempDirectory();
//	        File bundleContentPath = getArtifactContent(new File(tmpFolder,"bundle-content"));
//	        File metainfPath = new File(bundleContentPath,"META-INF");
//	        File manifestFile=new File(metainfPath,"MANIFEST.MF");
//	        manifestFile.getParentFile().mkdirs();
//	        CAppArtifactBundleManifest cAppArtifactBundleManifest = new CAppArtifactBundleManifest(getArtifact());
//	        cAppArtifactBundleManifest.setParentApplication(getParentApplication());
//	        cAppArtifactBundleManifest.toFile(manifestFile);
//	        File bundle = new File(tmpFolder,getArtifact().getName()+"-"+getArtifact().getTimestampedVersion()+".jar");
//	        new ArchiveManipulator().archiveDir(bundle.toString(), bundleContentPath.toString());
//	        return bundle;
//        } catch (Exception e) {
//	        log.error(e);
//	        throw e;
//        }
//	}
	
	public Map<Artifact,File> getArtifactContent(File contentLocation) throws Exception {
		try {
	        File tmpFolder = contentLocation==null? new File(FileUtils.createTempDirectory(),getArtifact().getName()+"-"+getArtifact().getTimestampedVersion()):contentLocation;
			File location=getLocation();
	        File bundleContentPath = tmpFolder;
	        FileUtils.copyDirectory(location, bundleContentPath);
			IPath workspaceArtifactPath = new Path(location.toString()).append(getArtifact().getFile());
			if (!(new File(workspaceArtifactPath.toOSString()).exists())){
				IFolder folder = ResourcesPlugin.getWorkspace().getRoot().getFolder(workspaceArtifactPath);
				IPath path = folder.getFullPath().removeFirstSegments(ResourcesPlugin.getWorkspace().getRoot().getLocation().segmentCount());
				folder=ResourcesPlugin.getWorkspace().getRoot().getFolder(path);
				if (folder.isLinked()){
					createArchiveAndUpdateArtifactXML(bundleContentPath, folder.getLocation().toFile());
				}
			}else{
				File file = workspaceArtifactPath.toFile();
				if (!file.isFile()){
					createArchiveAndUpdateArtifactXML(bundleContentPath, file);
				}
			}
	        return createArtifactMap(getArtifact(),tmpFolder);
        } catch (Exception e) {
	        log.error(e);
	        throw e;
        }
	}
private void createArchiveAndUpdateArtifactXML(File bundleContentPath, File actualLocation)
        throws Exception, IOException {
	File archive = BPELHandlerRequester.getHandler().createArchive(actualLocation);
	File archiveFile = new File(bundleContentPath, actualLocation.getName() + ".zip");
	FileUtils.copy(archive, archiveFile);
	String s=getArtifact().getFile();
	getArtifact().setFile(archiveFile.getName());
	getArtifact().toFile(new File(bundleContentPath,getArtifact().getDefaultName()));
	getArtifact().setFile(s);
}

}
