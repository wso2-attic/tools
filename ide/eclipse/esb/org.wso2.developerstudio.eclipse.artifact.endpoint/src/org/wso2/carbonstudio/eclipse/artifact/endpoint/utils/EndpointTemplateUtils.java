package org.wso2.carbonstudio.eclipse.artifact.endpoint.utils;

import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;
import org.wso2.carbonstudio.eclipse.utils.template.TemplateUtil;

public class EndpointTemplateUtils extends TemplateUtil{

	protected Bundle getBundle() {
		return Platform.getBundle(org.wso2.carbonstudio.eclipse.artifact.endpoint.Activator.PLUGIN_ID);
	}

}
