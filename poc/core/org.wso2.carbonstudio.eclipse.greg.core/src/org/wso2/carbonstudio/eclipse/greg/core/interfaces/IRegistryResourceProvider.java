package org.wso2.carbonstudio.eclipse.greg.core.interfaces;

import java.util.List;
import java.util.Map;

import org.wso2.carbonstudio.eclipse.platform.core.interfaces.ICarbonStudioProvider;

public interface IRegistryResourceProvider extends ICarbonStudioProvider{
	/**
	 * Retrieves the resources provided by this provider
	 * @return
	 */
	public IRegistryResource[] getResources(Map<String,List<String>> filters);
	
	public IRegistryResourceProvider[] getCategories(Map<String, List<String>> filters);

}
