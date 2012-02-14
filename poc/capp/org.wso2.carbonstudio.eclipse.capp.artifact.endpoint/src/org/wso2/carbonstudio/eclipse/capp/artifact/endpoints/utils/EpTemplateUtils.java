package org.wso2.carbonstudio.eclipse.capp.artifact.endpoints.utils;

import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;
import org.wso2.carbonstudio.eclipse.capp.artifact.endpoints.Activator;
import org.wso2.carbonstudio.eclipse.utils.template.TemplateUtil;

public class EpTemplateUtils extends TemplateUtil{

	private static EpTemplateUtils INSTANCE;
	
	private EpTemplateUtils(){
		
	}
	
	protected Bundle getBundle() {
		return Platform.getBundle(Activator.PLUGIN_ID);
	}
	
	public static EpTemplateUtils getInstance(){
		if (INSTANCE==null){
			INSTANCE=new EpTemplateUtils();
		}
		return INSTANCE;
	}

}
