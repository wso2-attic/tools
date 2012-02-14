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

package org.wso2.carbonstudio.eclipse.capp.artifact.war.utils;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jst.j2ee.internal.web.archive.operations.WebComponentExportDataModelProvider;
import org.eclipse.jst.j2ee.web.datamodel.properties.IWebComponentExportDataModelProperties;
import org.eclipse.wst.common.frameworks.datamodel.DataModelFactory;
import org.eclipse.wst.common.frameworks.datamodel.IDataModel;
import org.wso2.carbonstudio.eclipse.capp.artifact.war.Activator;
import org.wso2.carbonstudio.eclipse.capp.core.manifest.Artifact;
import org.wso2.carbonstudio.eclipse.capp.core.manifest.CAppArtifactBundleManifest;
import org.wso2.carbonstudio.eclipse.capp.core.utils.ArtifactBundleCreator;
import org.wso2.carbonstudio.eclipse.logging.core.ICarbonStudioLog;
import org.wso2.carbonstudio.eclipse.logging.core.Logger;
import org.wso2.carbonstudio.eclipse.utils.archive.ArchiveManipulator;
import org.wso2.carbonstudio.eclipse.utils.file.FileUtils;
import org.wso2.carbonstudio.eclipse.utils.project.ProjectUtils;

public class WARArtifactBundleCreator extends ArtifactBundleCreator {
	private static ICarbonStudioLog log=Logger.getLog(Activator.PLUGIN_ID);

	public WARArtifactBundleCreator(Artifact artifact, File location, String parentApplication) {
	    super(artifact, location, parentApplication);
    }
	
	public File getBundle() throws Exception{
		try {
	        File tmpFolder = FileUtils.createTempDirectory();
	        File bundleContentPath = createArtifactContent(getLocation(), new File(tmpFolder,"bundle-content"));

	        File metainfPath = new File(bundleContentPath,"META-INF");
	        File manifestFile=new File(metainfPath,"MANIFEST.MF");
	        manifestFile.getParentFile().mkdirs();
	        CAppArtifactBundleManifest cAppArtifactBundleManifest = new CAppArtifactBundleManifest(getArtifact());
	        cAppArtifactBundleManifest.setParentApplication(getParentApplication());
	        cAppArtifactBundleManifest.toFile(manifestFile);
	        File bundle = new File(tmpFolder,getArtifact().getName()+"-"+getArtifact().getTimestampedVersion()+".jar");
	        new ArchiveManipulator().archiveDir(bundle.toString(), bundleContentPath.toString());
	        return bundle;
        } catch (Exception e) {
	        log.error(e);
	        throw e;
        }
	}

	private File createArtifactContent(File location, File tmpFolder) throws IOException,
            Exception, ExecutionException {
	    File bundleContentPath = tmpFolder;
	    FileUtils.copyDirectory(location, bundleContentPath);
	    IPath workspaceArtifactPath = new Path(location.toString()).append(getArtifact().getFile());
	    if (!(new File(workspaceArtifactPath.toOSString()).exists())){
	    	IFolder folder = ResourcesPlugin.getWorkspace().getRoot().getFolder(workspaceArtifactPath);
	    	IPath path = folder.getFullPath().removeFirstSegments(ResourcesPlugin.getWorkspace().getRoot().getLocation().segmentCount());
	    	folder=ResourcesPlugin.getWorkspace().getRoot().getFolder(path);
	    	if (folder.isLinked()){
	    		String projectPath = folder.getLocation().toOSString();
	    		IProject[] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
	    		IProject selectedProject = null;
	    		for (IProject project : projects) {
	                if (project.getLocation().toOSString().equals(projectPath)){
	                	selectedProject = project;
	                }
	            }
	    		if (selectedProject == null){
	    			throw new Exception("Could not locate the web project which was supposed to be located at '"+projectPath+"'");
	    		}
	            File archiveFile = new File(bundleContentPath, selectedProject.getName() + ".war");
	            export(selectedProject, archiveFile.toString());
	            String currentFile=getArtifact().getFile();
	            getArtifact().setFile(archiveFile.getName());
	            getArtifact().toFile(new File(bundleContentPath,getArtifact().getDefaultName()));
	            getArtifact().setFile(currentFile);
	    	}
	    }
	    return bundleContentPath;
    }
	
	public void export(IProject project, String destinationPath) throws ExecutionException, CoreException {
		IDataModel model = DataModelFactory.createDataModel(new WebComponentExportDataModelProvider());
		model.setProperty(IWebComponentExportDataModelProperties.PROJECT_NAME,project.getName());
		model.setProperty(IWebComponentExportDataModelProperties.ARCHIVE_DESTINATION, destinationPath);
		ProjectUtils.buildProject(project);
		model.getDefaultOperation().execute( null, null );

	}
	
	public Map<Artifact,File> getArtifactContent(File contentLocation) throws Exception{
	    return createArtifactMap(getArtifact(),createArtifactContent(getLocation(), contentLocation));
	}
}
