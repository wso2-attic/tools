package org.wso2.carbonstudio.eclipse.capp.artifact.registry.utils;

import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;
import org.wso2.carbonstudio.eclipse.capp.artifact.registry.Activator;
import org.wso2.carbonstudio.eclipse.utils.template.TemplateUtil;

public class RegistryTemplateUtils extends TemplateUtil{

	private static RegistryTemplateUtils INSTANCE;
	public static RegistryTemplateUtils getInstance(){
		if (INSTANCE==null){
			INSTANCE=new RegistryTemplateUtils();
		}
		return INSTANCE;
	}
	protected Bundle getBundle() {
		return Platform.getBundle(Activator.PLUGIN_ID);
	}

}
