package org.wso2.carbonstudio.eclipse.platform.core.interfaces;


public interface ICarbonStudioProviderData {
	/**
	 * Get the id for this provider
	 * @return
	 */
	public String getId();
	
	/**
	 * Get the name of this provider
	 * @return
	 */
	public String getName();
	
	/**
	 * get the provider
	 * @return
	 */
	public ICarbonStudioProvider getProvider();
	
	/**
	 * Get list displayable text
	 * @return
	 */
	public String getText();
}
