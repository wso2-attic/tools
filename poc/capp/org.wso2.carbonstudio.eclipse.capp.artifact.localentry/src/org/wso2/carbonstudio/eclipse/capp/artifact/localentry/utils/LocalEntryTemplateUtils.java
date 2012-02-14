package org.wso2.carbonstudio.eclipse.capp.artifact.localentry.utils;

import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;
import org.wso2.carbonstudio.eclipse.capp.artifact.localentry.Activator;
import org.wso2.carbonstudio.eclipse.utils.template.TemplateUtil;

public class LocalEntryTemplateUtils extends TemplateUtil{
	private static LocalEntryTemplateUtils INSTANCE;
	
	private LocalEntryTemplateUtils(){
		
	}
	
	protected Bundle getBundle() {
		return Platform.getBundle(Activator.PLUGIN_ID);
	}
	
	public static LocalEntryTemplateUtils getInstance(){
		if (INSTANCE==null){
			INSTANCE=new LocalEntryTemplateUtils();
		}
		return INSTANCE;
	}

}
