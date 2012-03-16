package org.wso2.developerstudio.eclipse.artifact.bpel.utils;

import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;
import org.wso2.developerstudio.eclipse.utils.ui.ImageUtils;
import org.wso2.developerstudio.eclipse.artifact.bpel.Activator;

public class BPELImageUtils extends ImageUtils{

	private static ImageUtils INSTANCE;

	public static ImageUtils getInstance(){
		if (INSTANCE==null){
			INSTANCE=new BPELImageUtils();
		}
		return INSTANCE;
	} 

	public Bundle getBundle(){
		return Platform.getBundle(Activator.PLUGIN_ID);
	}

}
