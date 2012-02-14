package org.wso2.carbonstudio.eclipse.capp.artifact.proxyservice.core;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;
import org.wso2.carbonstudio.eclipse.capp.artifact.proxyservice.utils.ProxyTemplate;

public class ProxyTemplateHandler {
	private static String PROXY_TEMPLATE_EXTENSION="org.wso2.carbonstudio.proxy.templates";
	private static List<ProxyTemplate> proxyTemplateList;
	
	private static void loadProxyTemplateInfo(){
		proxyTemplateList=new ArrayList<ProxyTemplate>();
		IConfigurationElement[] config = Platform.getExtensionRegistry().getConfigurationElementsFor(PROXY_TEMPLATE_EXTENSION);
		for (IConfigurationElement e : config) {		
			try {
				ProxyTemplate proxyTemplate = new ProxyTemplate();
				proxyTemplate.setId(e.getAttribute("id"));
				proxyTemplate.setName(e.getAttribute("name"));
				String fileName = e.getAttribute("file");
				Bundle bundle = Platform.getBundle(e.getContributor().getName());
				proxyTemplate.setTemplateFileName(fileName);
				proxyTemplate.setTemplateBundle(bundle);
				proxyTemplateList.add(proxyTemplate);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

	static {
		loadProxyTemplateInfo();
	}
	
	public static ProxyTemplate[] getProxyTemplates(){
		return proxyTemplateList.toArray(new ProxyTemplate[]{});
	}

}
