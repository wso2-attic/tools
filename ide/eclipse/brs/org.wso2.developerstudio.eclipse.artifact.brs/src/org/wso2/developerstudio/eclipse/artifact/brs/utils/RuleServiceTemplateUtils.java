package org.wso2.developerstudio.eclipse.artifact.brs.utils;

import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;
import org.wso2.developerstudio.eclipse.artifact.brs.Activator;
import org.wso2.developerstudio.eclipse.utils.template.TemplateUtil;



public class RuleServiceTemplateUtils extends TemplateUtil{
	private static RuleServiceTemplateUtils instance;

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(Activator.PLUGIN_ID);
	}

	public static RuleServiceTemplateUtils getIstance(){
		if(instance==null){
			instance=new RuleServiceTemplateUtils();
		}
		return instance;
	}

}
