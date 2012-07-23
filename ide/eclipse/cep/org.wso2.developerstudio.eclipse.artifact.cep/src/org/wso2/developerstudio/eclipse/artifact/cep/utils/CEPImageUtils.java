package org.wso2.developerstudio.eclipse.artifact.cep.utils;

import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;
import org.wso2.developerstudio.eclipse.artifact.cep.Activator;
import org.wso2.developerstudio.eclipse.utils.ui.ImageUtils;

public class CEPImageUtils extends ImageUtils{

	private static ImageUtils instance;

	public static ImageUtils getInstance(){
		if (instance==null){
			instance=new CEPImageUtils();
		}
		return instance;
	} 

	public Bundle getBundle(){
		return Platform.getBundle(Activator.PLUGIN_ID);
	}

}
