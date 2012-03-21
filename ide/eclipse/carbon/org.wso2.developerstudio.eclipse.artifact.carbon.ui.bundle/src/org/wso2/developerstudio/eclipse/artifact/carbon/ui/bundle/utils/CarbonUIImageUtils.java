package org.wso2.developerstudio.eclipse.artifact.carbon.ui.bundle.utils;

import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;
import org.wso2.developerstudio.eclipse.artifact.carbon.ui.bundle.Activator;
import org.wso2.developerstudio.eclipse.utils.ui.ImageUtils;

public class CarbonUIImageUtils extends ImageUtils{

	private static ImageUtils INSTANCE;

	public static ImageUtils getInstance(){
		if (INSTANCE==null){
			INSTANCE=new CarbonUIImageUtils();
		}
		return INSTANCE;
	} 
	
	public Bundle getBundle() {
		return Platform.getBundle(Activator.PLUGIN_ID);
	}

}
