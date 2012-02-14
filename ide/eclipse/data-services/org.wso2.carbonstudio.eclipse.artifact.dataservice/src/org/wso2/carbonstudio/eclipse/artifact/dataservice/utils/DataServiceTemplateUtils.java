package org.wso2.carbonstudio.eclipse.artifact.dataservice.utils;

import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;
import org.wso2.carbonstudio.eclipse.artifact.dataservice.Activator;
import org.wso2.carbonstudio.eclipse.utils.template.TemplateUtil;

public class DataServiceTemplateUtils extends TemplateUtil{

	private static DataServiceTemplateUtils INSTANCE;
	protected Bundle getBundle() {
		return Platform.getBundle(Activator.PLUGIN_ID);
	}
	public static DataServiceTemplateUtils getInstance(){
		if (INSTANCE==null){
			INSTANCE=new DataServiceTemplateUtils();
		}
		return INSTANCE;
	}

}
