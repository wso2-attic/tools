package {8};

import org.wso2.carbon.registry.core.jdbc.handlers.HandlerManager;
import org.wso2.carbon.registry.core.exceptions.RegistryException;
import org.wso2.carbon.registry.core.jdbc.handlers.HandlerManager;
import org.wso2.carbon.registry.core.jdbc.handlers.filters.Filter;
import org.wso2.carbon.registry.core.config.RegistryContext;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import {0};
import {2};

public class Activator implements BundleActivator {6}
	private {1} handler;
	private {3} filter;
	private RegistryContext registryContext;
	private HandlerManager handlerManager;
	
	private String[] applyingFilters;
	public void start(final BundleContext bundleContext) throws Exception {6}
		registryContext = RegistryContext.getBaseInstance();
		handlerManager = registryContext.getHandlerManager();
		handler = new {1}();
		filter = new {3}();
		{5}
		applyingFilters = new String[]{6}{4}{7};
		handlerManager.addHandlerWithPriority(applyingFilters, filter, handler);
	{7}

	public void stop(BundleContext context) throws Exception {6}
    	handlerManager.removeHandler(applyingFilters, filter, handler);
	{7}
{7}