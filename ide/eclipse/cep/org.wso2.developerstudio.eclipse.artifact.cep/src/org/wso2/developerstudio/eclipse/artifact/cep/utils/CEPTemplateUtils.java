package org.wso2.developerstudio.eclipse.artifact.cep.utils;

import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;
import org.wso2.developerstudio.eclipse.artifact.cep.Activator;
import org.wso2.developerstudio.eclipse.utils.template.TemplateUtil;

public class CEPTemplateUtils extends TemplateUtil{

	private static CEPTemplateUtils instance;
	protected Bundle getBundle() {
		return Platform.getBundle(Activator.PLUGIN_ID);
	}
	public static CEPTemplateUtils getInstance(){
		if (instance==null){
			instance=new CEPTemplateUtils();
		}
		return instance;
	}

}
