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

package org.wso2.carbonstudio.eclipse.capp.artifact.bpel.sample;

import java.io.File;
import java.io.IOException;

import org.eclipse.jface.resource.ImageDescriptor;
import org.wso2.carbonstudio.eclipse.capp.artifact.bpel.utils.BPELImageUtils;
import org.wso2.carbonstudio.eclipse.capp.artifact.bpel.utils.BPELTemplateUtil;
import org.wso2.carbonstudio.eclipse.samples.contributor.AbstractSampleContributor;

public class BPELSampleContributor extends AbstractSampleContributor {
	static String caption="Hello World Workflow";
	static ImageDescriptor image=BPELImageUtils.getInstance().getImageDescriptor("bpel-sample-16x16.png");
	static String tooltip="Create a bpel workflow depicting hello world process";
	
	protected File getSampleResourceFile() throws IOException {
	    return BPELTemplateUtil.getInstance().getResourceFile("samples/HelloWorldSample.zip");
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
