package org.wso2.carbonstudio.eclipse.capp.artifact.endpoints.internal.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.resource.ImageDescriptor;
import org.wso2.carbonstudio.eclipse.capp.artifact.endpoints.utils.EndPointImageUtils;
import org.wso2.carbonstudio.eclipse.esb.core.interfaces.IEndpointProvider;
import org.wso2.carbonstudio.eclipse.esb.core.interfaces.IEsbEndpoint;
import org.wso2.carbonstudio.eclipse.platform.core.interfaces.ICarbonStudioElement;

public class CAppEndpointProvider implements IEndpointProvider {
	private List<IEndpointProvider> subProviders;
	
	public CAppEndpointProvider() {
	}

	public IEndpointProvider[] getCategories(Map<String, List<String>> filters) {
		if (subProviders==null){
			subProviders=new ArrayList<IEndpointProvider>();
			IProject[] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
			for (IProject project : projects) {
				if (project.isOpen()){
					CAppProjectEndpointProvider cAppProjectEndpointProvider = new CAppProjectEndpointProvider(project);
					IEsbEndpoint[] endpoints = cAppProjectEndpointProvider.getEndpoints(filters);
					if (endpoints!=null && endpoints.length>0){
						subProviders.add(cAppProjectEndpointProvider);
					}
				}
			}
		}
		return subProviders.toArray(new IEndpointProvider[]{});
	}

	public IEsbEndpoint[] getEndpoints(Map<String, List<String>> filters) {
		return null;
	}

	public ImageDescriptor getIcon() {
		return EndPointImageUtils.getInstance().getImageDescriptor("application-registry-resource-icon.png");
	}

	public String getId() {
		return null;
	}

	public String getText() {
		return null;
	}

	public void refresh() {
		subProviders=null;
	}

	public ICarbonStudioElement[] getElements(Map<String, List<String>> filters) {
		return getEndpoints(filters);
	}

}
