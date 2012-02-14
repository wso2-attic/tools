package org.wso2.carbonstudio.eclipse.capp.artifact.localentry.internal.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.resource.ImageDescriptor;
import org.wso2.carbonstudio.eclipse.capp.artifact.localentry.utils.LocalEntryImageUtils;
import org.wso2.carbonstudio.eclipse.esb.core.interfaces.IEsbLocalEntry;
import org.wso2.carbonstudio.eclipse.esb.core.interfaces.ILocalEntryProvider;
import org.wso2.carbonstudio.eclipse.platform.core.interfaces.ICarbonStudioElement;

public class CAppLocalEntryProvider implements ILocalEntryProvider {
	private List<ILocalEntryProvider> subProviders;
	
	public CAppLocalEntryProvider() {
	}

	public ILocalEntryProvider[] getCategories(Map<String, List<String>> filters) {
		if (subProviders==null){
			subProviders=new ArrayList<ILocalEntryProvider>();
			IProject[] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
			for (IProject project : projects) {
				if (project.isOpen()){
					CAppProjectLocalEntryProvider cAppProjectLocalEntryProvider = new CAppProjectLocalEntryProvider(project);
					IEsbLocalEntry[] localentries = cAppProjectLocalEntryProvider.getLocalEntries(filters);
					if (localentries!=null && localentries.length>0){
						subProviders.add(cAppProjectLocalEntryProvider);
					}
				}
			}
		}
		return subProviders.toArray(new ILocalEntryProvider[]{});
	}

	public IEsbLocalEntry[] getLocalEntries(Map<String, List<String>> filters) {
		return null;
	}

	public ImageDescriptor getIcon() {
		return LocalEntryImageUtils.getInstance().getImageDescriptor("application-registry-resource-icon.png");
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
		return getLocalEntries(filters);
	}

}
