package org.wso2.carbonstudio.eclipse.esb.core.interfaces;

import java.util.List;
import java.util.Map;

import org.wso2.carbonstudio.eclipse.platform.core.interfaces.ICarbonStudioProvider;

public interface IEndpointProvider extends ICarbonStudioProvider{
	/**
	 * Retrieves the endpoints provided by this provider
	 * @return
	 */
	public IEsbEndpoint[] getEndpoints(Map<String,List<String>> filters);
	
	public IEndpointProvider[] getCategories(Map<String, List<String>> filters);
}
