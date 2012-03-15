package org.wso2.carbonstudio.eclipse.greg.core.interfaces;

import org.wso2.carbonstudio.eclipse.platform.core.interfaces.ICarbonStudioProviderData;


public interface IRegistryResourceProviderData extends ICarbonStudioProviderData{
	
	/**
	 * get the provider
	 * @return
	 */
	public IRegistryResourceProvider getProvider();
	
}
