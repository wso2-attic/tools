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

package org.wso2.carbonstudio.eclipse.capp.artifact.gadgets.sample;

import java.io.File;
import java.io.IOException;

import org.eclipse.jface.resource.ImageDescriptor;
import org.wso2.carbonstudio.eclipse.capp.artifact.gadgets.utils.GadgetImageUtils;
import org.wso2.carbonstudio.eclipse.capp.artifact.gadgets.utils.GadgetTemplateUtils;
import org.wso2.carbonstudio.eclipse.samples.contributor.AbstractSampleContributor;

public class GadgetSampleContributor extends AbstractSampleContributor {
	static String caption="Acme Product Gadget";
	static ImageDescriptor image=GadgetImageUtils.getInstance().getImageDescriptor("gadget-sample-16x16.png");
	static String tooltip="Create gadgets for viewing product details in Acme Company";
	
	protected File getSampleResourceFile() throws IOException {
	    return GadgetTemplateUtils.getInstance().getResourceFile("samples/ProductGadgetSample.zip");
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
