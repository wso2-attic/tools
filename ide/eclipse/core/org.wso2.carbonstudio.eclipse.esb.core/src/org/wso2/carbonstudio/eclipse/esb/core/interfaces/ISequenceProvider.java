package org.wso2.carbonstudio.eclipse.esb.core.interfaces;

import java.util.List;
import java.util.Map;

import org.wso2.carbonstudio.eclipse.platform.core.interfaces.ICarbonStudioProvider;

public interface ISequenceProvider extends ICarbonStudioProvider{
	/**
	 * Retrieves the sequences provided by this provider
	 * @return
	 */
	public IEsbSequence[] getSequences(Map<String,List<String>> filters);
	
	public ISequenceProvider[] getCategories(Map<String, List<String>> filters);

}
