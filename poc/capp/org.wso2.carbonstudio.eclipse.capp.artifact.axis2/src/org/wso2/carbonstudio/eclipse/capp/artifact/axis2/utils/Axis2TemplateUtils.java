package org.wso2.carbonstudio.eclipse.capp.artifact.axis2.utils;

import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;
import org.wso2.carbonstudio.eclipse.capp.artifact.axis2.Activator;
import org.wso2.carbonstudio.eclipse.utils.template.TemplateUtil;


public class Axis2TemplateUtils extends TemplateUtil {
	private static Axis2TemplateUtils INSTANCE;
	public static Axis2TemplateUtils getInstance(){
		if (INSTANCE==null){
			INSTANCE=new Axis2TemplateUtils();
		}
		return INSTANCE;
	}
	protected Bundle getBundle() {
		return Platform.getBundle(Activator.PLUGIN_ID);
	}
}