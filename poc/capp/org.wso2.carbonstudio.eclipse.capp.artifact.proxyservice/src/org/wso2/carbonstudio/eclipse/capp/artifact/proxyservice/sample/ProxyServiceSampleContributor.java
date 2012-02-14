package org.wso2.carbonstudio.eclipse.capp.artifact.proxyservice.sample;

import java.io.File;
import java.io.IOException;

import org.eclipse.jface.resource.ImageDescriptor;
import org.wso2.carbonstudio.eclipse.capp.artifact.proxyservice.utils.ProxyServiceImageUtils;
import org.wso2.carbonstudio.eclipse.capp.artifact.proxyservice.utils.ProxyTemplateUtils;
import org.wso2.carbonstudio.eclipse.samples.contributor.AbstractSampleContributor;

/**
 * This class is contributing the Proxy Service Sample to CApp Samples.
 * @author harshana
 *
 */
public class ProxyServiceSampleContributor extends AbstractSampleContributor{
	static String caption="Stock Quote Proxy Service";
	static ImageDescriptor image=ProxyServiceImageUtils.getInstance().getImageDescriptor("proxy-sample-16x16.png");
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
	      return ProxyTemplateUtils.getInstance().getResourceFile("samples/ProxyServiceSampleProject.zip");
    }
	
   

}
