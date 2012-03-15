package org.wso2.carbonstudio.eclipse.esb.core.interfaces;

import java.util.List;
import java.util.Map;

import org.wso2.carbonstudio.eclipse.platform.core.interfaces.ICarbonStudioProvider;

public interface ILocalEntryProvider extends ICarbonStudioProvider{
	/**
	 * Retrieves the local entries provided by this provider
	 * @return
	 */
	public IEsbLocalEntry[] getLocalEntries(Map<String,List<String>> filters);
	
	public ILocalEntryProvider[] getCategories(Map<String, List<String>> filters);
}
