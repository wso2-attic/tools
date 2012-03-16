package org.wso2.developerstudio.eclipse.artifact.gadget.utils;

import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;
import org.wso2.developerstudio.eclipse.artifact.gadget.Activator;
import org.wso2.developerstudio.eclipse.utils.ui.ImageUtils;

public class GadgetImageUtils extends ImageUtils{
	private static ImageUtils INSTANCE;

	public static ImageUtils getInstance(){
		if (INSTANCE==null){
			INSTANCE=new GadgetImageUtils();
		}
		return INSTANCE;
	} 

	public Bundle getBundle(){
		return Platform.getBundle(Activator.PLUGIN_ID);
	}
}
