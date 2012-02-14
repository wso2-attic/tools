package org.wso2.carbonstudio.eclipse.capp.artifact.registry.core;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.resource.ImageDescriptor;
import org.wso2.carbonstudio.eclipse.capp.artifact.registry.Activator;
import org.wso2.carbonstudio.eclipse.capp.artifact.registry.utils.RegistryImageUtils;
import org.wso2.carbonstudio.eclipse.greg.core.interfaces.IRegistryResource;
import org.wso2.carbonstudio.eclipse.greg.core.interfaces.IRegistryResourceProvider;
import org.wso2.carbonstudio.eclipse.logging.core.ICarbonStudioLog;
import org.wso2.carbonstudio.eclipse.logging.core.Logger;
import org.wso2.carbonstudio.eclipse.platform.core.interfaces.ICarbonStudioElement;
import org.wso2.carbonstudio.eclipse.platform.core.utils.CarbonStudioProviderUtils;

public class CAppRegistryResourceProvider implements IRegistryResourceProvider {
	private static ICarbonStudioLog log=Logger.getLog(Activator.PLUGIN_ID);
	List<IRegistryResourceProvider> subProviders;

	public CAppRegistryResourceProvider() {
	}

	public IRegistryResource[] getResources(Map<String, List<String>> filters) {
		return null;
	}

	public IRegistryResourceProvider[] getCategories(Map<String, List<String>> filters) {
		if (subProviders==null){
			subProviders=new ArrayList<IRegistryResourceProvider>();
			IProject[] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
			for (IProject project : projects) {
				if (project.isOpen()){
					if (CarbonStudioProviderUtils.isInProjectFilterPassed(filters, project)){
						CAppProjectRegistryResourceProvider cAppProjectRegistryResourceProvider = new CAppProjectRegistryResourceProvider(project);
						IRegistryResourceProvider[] categories = cAppProjectRegistryResourceProvider.getCategories(filters);
						if (categories!=null && categories.length>0){
							subProviders.add(cAppProjectRegistryResourceProvider);
						}
					}
				}
			}
		}
		return subProviders.toArray(new IRegistryResourceProvider[]{});
	}

	public ImageDescriptor getIcon() {
		return RegistryImageUtils.getInstance().getImageDescriptor("application-registry-resource-icon.png");
	}

	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getText() {
		// TODO Auto-generated method stub
		return null;
	}

	public void refresh() {
		subProviders=null;
		
	}

	public ICarbonStudioElement[] getElements(Map<String, List<String>> filters) {
		return getResources(filters);
	}

	
}
