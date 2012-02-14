package org.wso2.carbonstudio.eclipse.capp.artifact.sequence.internal.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.resource.ImageDescriptor;
import org.wso2.carbonstudio.eclipse.capp.artifact.sequence.utils.SequenceImageUtils;
import org.wso2.carbonstudio.eclipse.esb.core.interfaces.IEsbSequence;
import org.wso2.carbonstudio.eclipse.esb.core.interfaces.ISequenceProvider;
import org.wso2.carbonstudio.eclipse.platform.core.interfaces.ICarbonStudioElement;

public class CAppSequenceProvider implements ISequenceProvider {
	private List<ISequenceProvider> subProviders;
	
	public CAppSequenceProvider() {
	}

	public ISequenceProvider[] getCategories(Map<String, List<String>> filters) {
		if (subProviders==null){
			subProviders=new ArrayList<ISequenceProvider>();
			IProject[] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
			for (IProject project : projects) {
				if (project.isOpen()){
					CAppProjectSequenceProvider cAppProjectSequenceProvider = new CAppProjectSequenceProvider(project);
					IEsbSequence[] sequences = cAppProjectSequenceProvider.getSequences(filters);
					if (sequences!=null && sequences.length>0){
						subProviders.add(cAppProjectSequenceProvider);
					}
				}
			}
		}
		return subProviders.toArray(new ISequenceProvider[]{});
	}

	public IEsbSequence[] getSequences(Map<String, List<String>> filters) {
		return null;
	}

	public ImageDescriptor getIcon() {
		return SequenceImageUtils.getInstance().getImageDescriptor("application-registry-resource-icon.png");
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
		return getSequences(filters);
	}

}
