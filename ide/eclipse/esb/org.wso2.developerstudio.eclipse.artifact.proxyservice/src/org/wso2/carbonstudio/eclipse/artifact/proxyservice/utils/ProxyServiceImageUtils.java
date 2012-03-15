package org.wso2.carbonstudio.eclipse.artifact.proxyservice.utils;

import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;
import org.wso2.carbonstudio.eclipse.artifact.proxyservice.Activator;
import org.wso2.carbonstudio.eclipse.utils.ui.ImageUtils;

public class ProxyServiceImageUtils extends ImageUtils{
	private static ImageUtils INSTANCE;

	public static ImageUtils getInstance(){
		if (INSTANCE==null){
			INSTANCE=new ProxyServiceImageUtils();
		}
		return INSTANCE;
	} 

	public Bundle getBundle(){
		return Platform.getBundle(Activator.PLUGIN_ID);
	}

}
