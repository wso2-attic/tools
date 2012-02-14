package org.wso2.carbonstudio.eclipse.artifact.synapse.template;

import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;
import org.wso2.carbonstudio.eclipse.artifact.synapse.Activator;
import org.wso2.carbonstudio.eclipse.utils.template.TemplateUtil;

public class SynapseTemplateUtils extends TemplateUtil {
private static SynapseTemplateUtils INSTANCE;
	
	protected Bundle getBundle() {
		return Platform.getBundle(Activator.PLUGIN_ID);
	}
	
	public static SynapseTemplateUtils getInstance(){
		if (INSTANCE==null){
			INSTANCE=new SynapseTemplateUtils();
		}
		return INSTANCE;
	}
}    
