package org.wso2.developerstudio.eclipse.artifact.sequence.utils;

import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;
import org.wso2.developerstudio.eclipse.utils.template.TemplateUtil;

public class SequenceTemplateUtils extends TemplateUtil{

	private static SequenceTemplateUtils INSTANCE;
	public static SequenceTemplateUtils getInstance(){
		if (INSTANCE==null){
			INSTANCE=new SequenceTemplateUtils();
		}
		return INSTANCE;
	}
	
	protected Bundle getBundle() {
		return Platform.getBundle(org.wso2.developerstudio.eclipse.artifact.sequence.Activator.PLUGIN_ID);
	}

}
