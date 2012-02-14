package org.wso2.carbonstudio.eclipse.capp.artifact.axis2.sample;

import java.io.File;
import java.io.IOException;

import org.eclipse.jface.resource.ImageDescriptor;
import org.wso2.carbonstudio.eclipse.capp.artifact.axis2.utils.Axis2ImageUtils;
import org.wso2.carbonstudio.eclipse.capp.artifact.axis2.utils.Axis2TemplateUtils;
import org.wso2.carbonstudio.eclipse.samples.contributor.AbstractSampleContributor;

public class Axis2SampleContributor extends AbstractSampleContributor{
	static String caption="Axis 2 Account Service ";
	static ImageDescriptor image=Axis2ImageUtils.getInstance().getImageDescriptor("axis-sample-16x16.png");
	static String tooltip="Create a carbon application project containing a proxy service artifact";
	
	
    public String getCaption() {
	    return caption;
    }

	
    public String getToolTip() {
	    return tooltip;
    }

	
    public ImageDescriptor getImage() {
	    return image;
    }

	
    protected File getSampleResourceFile() throws IOException {
    	 return Axis2TemplateUtils.getInstance().getResourceFile("samples/AccountServiceSampleProject.zip");
    }

}
