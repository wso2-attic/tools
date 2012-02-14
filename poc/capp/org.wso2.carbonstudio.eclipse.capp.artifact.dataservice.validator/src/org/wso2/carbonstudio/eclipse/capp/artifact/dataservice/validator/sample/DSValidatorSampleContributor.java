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

package org.wso2.carbonstudio.eclipse.capp.artifact.dataservice.validator.sample;

import java.io.File;
import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.jface.resource.ImageDescriptor;
import org.wso2.carbonstudio.eclipse.capp.artifact.dataservice.validator.utils.DSValidatorImageUtils;
import org.wso2.carbonstudio.eclipse.capp.artifact.dataservice.validator.utils.DSValidatorTemplateUtils;
import org.wso2.carbonstudio.eclipse.ds.customvalidator.utils.DataserviceUtils;
import org.wso2.carbonstudio.eclipse.samples.contributor.AbstractSampleContributor;
import org.wso2.carbonstudio.eclipse.utils.file.FileUtils;

public class DSValidatorSampleContributor extends AbstractSampleContributor {
	static String caption="Dataservice Number Validator";
	static ImageDescriptor image=DSValidatorImageUtils.getInstance().getImageDescriptor("ds-validate-sample-16x16.png");
	static String tooltip="Create a data service validator for numbers";
	
	public void addSampleTo(IProject project) throws Exception {
	    super.addSampleTo(project);
	    IFile file = project.getFolder("artifacts").getFolder("NumberValidator").getFile("ds-validator-info.xml");
	    updateWithParameterData(file.getLocation().toFile(), project.getName());
	    File dataserviceCoreLibraryPath = DataserviceUtils.getDataserviceCoreLibraryPath();
		FileUtils.copy(dataserviceCoreLibraryPath, new File(project.getFolder("lib").getLocation().toFile(),dataserviceCoreLibraryPath.getName()));
        project.refreshLocal(IResource.DEPTH_INFINITE, null);
	}
	
	protected File getSampleResourceFile() throws IOException {
	    return DSValidatorTemplateUtils.getInstance().getResourceFile("samples/CustomDataserviceValidatorSample.zip");
    }

    public String getCaption() {
	    return caption;
    }

    public ImageDescriptor getImage() {
	    return image;
    }

    public String getToolTip() {
	    return tooltip;
    }

    public boolean isCustomCreateSample() {
	    return false;
    }

}
