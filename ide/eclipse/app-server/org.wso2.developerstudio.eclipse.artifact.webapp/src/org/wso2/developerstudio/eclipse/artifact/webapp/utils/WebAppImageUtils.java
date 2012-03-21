package org.wso2.developerstudio.eclipse.artifact.webapp.utils;

import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;
import org.wso2.developerstudio.eclipse.artifact.webapp.Activator;
import org.wso2.developerstudio.eclipse.utils.ui.ImageUtils;

public class WebAppImageUtils extends ImageUtils{
	private static ImageUtils INSTANCE;

	public static ImageUtils getInstance(){
		if (INSTANCE==null){
			INSTANCE=new WebAppImageUtils();
		}
		return INSTANCE;
	} 

	public Bundle getBundle(){
		return Platform.getBundle(Activator.PLUGIN_ID);
	}


}
