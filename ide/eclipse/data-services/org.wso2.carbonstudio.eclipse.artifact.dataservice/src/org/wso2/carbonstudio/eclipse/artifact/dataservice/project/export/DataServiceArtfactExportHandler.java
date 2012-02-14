/*
 * Copyright (c) 2011, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
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

package org.wso2.carbonstudio.eclipse.artifact.dataservice.project.export;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.wso2.carbonstudio.eclipse.platform.core.project.export.ProjectArtifactHandler;
import org.wso2.carbonstudio.eclipse.utils.file.FileUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class DataServiceArtfactExportHandler extends ProjectArtifactHandler{
	private static final String DBS_FILE_EXTENSION = "dbs";

    public List<IResource> exportArtifact(IProject project) throws Exception{
		List<IResource> exportResources = new ArrayList<IResource>();
		File[] dbsFiles = FileUtils.getAllMatchingFiles(project.getLocation()
				.toString(), null, DBS_FILE_EXTENSION, new ArrayList<File>());
		for (File dbsFile : dbsFiles) {
			IFile dbsFileRef = ResourcesPlugin
					.getWorkspace()
					.getRoot()
					.getFileForLocation(
							Path.fromOSString(dbsFile.getAbsolutePath()));
			exportResources.add((IResource) dbsFileRef);
		}
		return exportResources;
    }

}
