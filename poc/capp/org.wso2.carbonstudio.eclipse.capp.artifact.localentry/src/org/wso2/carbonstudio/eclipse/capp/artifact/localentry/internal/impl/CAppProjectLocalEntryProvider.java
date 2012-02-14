package org.wso2.carbonstudio.eclipse.capp.artifact.localentry.internal.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.resource.ImageDescriptor;
import org.wso2.carbonstudio.eclipse.capp.artifact.localentry.core.LocalEntryArtifactHandler;
import org.wso2.carbonstudio.eclipse.capp.artifact.localentry.utils.LocalEntryImageUtils;
import org.wso2.carbonstudio.eclipse.capp.core.artifacts.manager.CAppEnvironment;
import org.wso2.carbonstudio.eclipse.capp.core.manifest.Artifact;
import org.wso2.carbonstudio.eclipse.esb.core.configuration.impl.EsbLocalEntryImpl;
import org.wso2.carbonstudio.eclipse.esb.core.interfaces.IEsbLocalEntry;
import org.wso2.carbonstudio.eclipse.esb.core.interfaces.ILocalEntryProvider;
import org.wso2.carbonstudio.eclipse.platform.core.interfaces.ICarbonStudioElement;

public class CAppProjectLocalEntryProvider implements ILocalEntryProvider {
	private IProject project;

	public CAppProjectLocalEntryProvider(IProject project) {
		setProject(project);
	}
	
	public ILocalEntryProvider[] getCategories(Map<String, List<String>> filters) {
		return null;
	}

	public IEsbLocalEntry[] getLocalEntries(Map<String, List<String>> filters) {
		if (project.isOpen()){
			List<IEsbLocalEntry> sequences=new ArrayList<IEsbLocalEntry>();
			List<Artifact> artifacts = CAppEnvironment.getcAppManager().getArtifacts(project);
			for (Artifact artifact : artifacts) {
				if (artifact.getType().equals(LocalEntryArtifactHandler.getType())){
					EsbLocalEntryImpl esbLocalEntry = new EsbLocalEntryImpl();
					esbLocalEntry.setName(artifact.getName());
					IFile file = artifact.getSource().getParent().getFile(new Path(artifact.getFile()));
					esbLocalEntry.setSource(file);
					esbLocalEntry.setIcon(LocalEntryImageUtils.getInstance().getImageDescriptor("EsbModelFile.png"));
					sequences.add(esbLocalEntry);
				}
			}
			return sequences.toArray(new IEsbLocalEntry[]{});
		}
		return null;
	}

	public ImageDescriptor getIcon() {
		return LocalEntryImageUtils.getInstance().getImageDescriptor("projects.gif");
	}

	public String getId() {
		return null;
	}

	public String getText() {
		return project.getName();
	}

	public void refresh() {

	}

	public void setProject(IProject project) {
		this.project = project;
	}

	public IProject getProject() {
		return project;
	}

	public ICarbonStudioElement[] getElements(Map<String, List<String>> filters) {
		return getLocalEntries(filters);
	}


}
