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

package org.wso2.carbonstudio.eclipse.capp.artifact.war.model;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.wso2.carbonstudio.eclipse.capp.core.artifacts.IArtifactSourcePath;

public class WARArtifactLocationNode implements IArtifactSourcePath{
	private String path;
	private IProject project;

	public WARArtifactLocationNode(IProject project, String path){
		setPath(path);
		setProject(project);
	}
	
	public void setPath(String path) {
	    this.path = path;
    }

	public String getPath() {
	    return path;
    }

	public void setProject(IProject project) {
	    this.project = project;
    }

	public IProject getProject() {
	    return project;
    }
	
	public String toString() {
	    return getPath();
	}
	
	public boolean isPathExist(){
		return getSourceFolder().exists();
	}
	
	public IFolder getSourceFolder(){
		return project.getFolder(getPath());
	}

    public String getSourceFolderPath() {
	    return getSourceFolder().getLocation().toOSString();
    }
}
