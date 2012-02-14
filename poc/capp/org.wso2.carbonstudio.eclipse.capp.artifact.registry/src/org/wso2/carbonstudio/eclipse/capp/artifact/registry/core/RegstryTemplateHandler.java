package org.wso2.carbonstudio.eclipse.capp.artifact.registry.core;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;
import org.wso2.carbonstudio.eclipse.capp.artifact.registry.utils.RegistryTemplates;

public class RegstryTemplateHandler {
	private static String REGISTRY_TEMPLATE_EXTENSION="org.wso2.carbonstudio.eclipse.platform.core.artifacttemplates";
	private static List<RegistryTemplates> regTemplateList;
	
	private static void loadProxyTemplateInfo(){
		regTemplateList=new ArrayList<RegistryTemplates>();
		IConfigurationElement[] config = Platform.getExtensionRegistry().getConfigurationElementsFor(REGISTRY_TEMPLATE_EXTENSION);
		for (IConfigurationElement e : config) {		
			try {
				RegistryTemplates regTemplate = new RegistryTemplates();
				regTemplate.setId(e.getAttribute("id"));
				regTemplate.setName(e.getAttribute("name"));
				String fileName = e.getAttribute("file");
				Bundle bundle = Platform.getBundle(e.getContributor().getName());
				regTemplate.setTemplateFileName(fileName);
				regTemplate.setTemplateBundle(bundle);
				regTemplateList.add(regTemplate);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

	static {
		loadProxyTemplateInfo();
	}
	
	public static RegistryTemplates[] getRegistryTemplates(){
		return regTemplateList.toArray(new RegistryTemplates[]{});
	}
}
