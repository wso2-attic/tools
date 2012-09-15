package org.wso2.developerstudio.eclipse.artifact.brs.utils;

import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;
import org.wso2.developerstudio.eclipse.artifact.brs.Activator;
import org.wso2.developerstudio.eclipse.utils.ui.ImageUtils;



public class RuleServiceImageUtils extends ImageUtils{

	private static ImageUtils instance;

	public static ImageUtils getInstance(){

		if(instance==null){
			instance=new RuleServiceImageUtils();
		}
		return instance;
	}

	@Override
	public Bundle getBundle() {
		return Platform.getBundle(Activator.PLUGIN_ID);
	}
}
