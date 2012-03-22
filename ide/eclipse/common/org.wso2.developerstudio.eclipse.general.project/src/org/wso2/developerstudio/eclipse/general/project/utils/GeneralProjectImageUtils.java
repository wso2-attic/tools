package org.wso2.developerstudio.eclipse.general.project.utils;

import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;
import org.wso2.developerstudio.eclipse.general.project.Activator;
import org.wso2.developerstudio.eclipse.utils.ui.ImageUtils;

public class GeneralProjectImageUtils extends ImageUtils{
	private static ImageUtils INSTANCE;

	public static ImageUtils getInstance(){
		if (INSTANCE==null){
			INSTANCE=new GeneralProjectImageUtils();
		}
		return INSTANCE;
	} 

	public Bundle getBundle(){
		return Platform.getBundle(Activator.PLUGIN_ID);
	}

}
