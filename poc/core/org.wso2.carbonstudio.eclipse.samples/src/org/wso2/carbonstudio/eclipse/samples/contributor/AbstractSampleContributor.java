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

package org.wso2.carbonstudio.eclipse.samples.contributor;

import java.io.File;
import java.io.IOException;
import java.text.MessageFormat;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.swt.widgets.Shell;
import org.wso2.carbonstudio.eclipse.utils.archive.ArchiveManipulator;
import org.wso2.carbonstudio.eclipse.utils.file.FileUtils;

public abstract class AbstractSampleContributor implements ICarbonStudioSampleContributor {
	
    public void addSampleTo(IProject project) throws Exception {
	    File resourceFile = getSampleResourceFile();
	    File tempDir = FileUtils.createTempDirectory();
	    ArchiveManipulator archiveManipulator = new ArchiveManipulator();
	    archiveManipulator.extract(resourceFile, tempDir);
	    File target = project.getLocation().toFile();
	    FileUtils.copyDirectory(tempDir, target);
	    File projectDesc = new File(target,".project");
        if (projectDesc.exists() && projectDesc.isFile()){
        	String parameterValue = project.getName();
        	updateWithParameterData(projectDesc, parameterValue);
        }
        project.refreshLocal(IResource.DEPTH_INFINITE, null);
    }

	protected void updateWithParameterData(File projectDesc, String parameterValue)
            throws IOException {
	    String content = FileUtils.getContentAsString(projectDesc);
	    content = MessageFormat.format(content, parameterValue);
	    projectDesc.delete();
	    FileUtils.writeContent(projectDesc, content);
    }
    
	protected abstract File getSampleResourceFile() throws IOException;

    public void addSampleTo(File location) {
	    
    }

    public void addSampleTo(IFolder workspaceLocation) {
	    
    }

    public void createSample(Shell shell) {
	    
    }

    public boolean isCustomCreateSample() {
	    return false;
    }

}
