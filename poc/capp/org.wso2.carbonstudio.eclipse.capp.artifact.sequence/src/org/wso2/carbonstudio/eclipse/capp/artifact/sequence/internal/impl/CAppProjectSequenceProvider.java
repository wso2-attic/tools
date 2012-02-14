package org.wso2.carbonstudio.eclipse.capp.artifact.sequence.internal.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.resource.ImageDescriptor;
import org.wso2.carbonstudio.eclipse.capp.artifact.sequence.core.SequenceArtifactHandler;
import org.wso2.carbonstudio.eclipse.capp.artifact.sequence.utils.SequenceImageUtils;
import org.wso2.carbonstudio.eclipse.capp.core.artifacts.manager.CAppEnvironment;
import org.wso2.carbonstudio.eclipse.capp.core.manifest.Artifact;
import org.wso2.carbonstudio.eclipse.esb.core.configuration.impl.EsbSequenceImpl;
import org.wso2.carbonstudio.eclipse.esb.core.interfaces.IEsbSequence;
import org.wso2.carbonstudio.eclipse.esb.core.interfaces.ISequenceProvider;
import org.wso2.carbonstudio.eclipse.platform.core.interfaces.ICarbonStudioElement;
import org.wso2.carbonstudio.eclipse.platform.core.utils.CarbonStudioProviderUtils;

public class CAppProjectSequenceProvider implements ISequenceProvider {
	private IProject project;

	public CAppProjectSequenceProvider(IProject project) {
		setProject(project);
	}
	
	public ISequenceProvider[] getCategories(Map<String, List<String>> filters) {
		return null;
	}

	public IEsbSequence[] getSequences(Map<String, List<String>> filters) {
		if (project.isOpen()){
			List<IEsbSequence> sequences=new ArrayList<IEsbSequence>();
			List<Artifact> artifacts = CAppEnvironment.getcAppManager().getArtifacts(project);
			for (Artifact artifact : artifacts) {
				if (artifact.getType().equals(SequenceArtifactHandler.getType())){
					EsbSequenceImpl esbSequence = new EsbSequenceImpl();
					esbSequence.setName(artifact.getName());
					IFile file = artifact.getSource().getParent().getFile(new Path(artifact.getFile()));
					boolean mediaTypeFilterPassed = CarbonStudioProviderUtils.isMediaTypeFilterPassed(filters, file);
					if (mediaTypeFilterPassed) {
						esbSequence.setSource(file);
						esbSequence.setIcon(SequenceImageUtils.getInstance()
								.getImageDescriptor("EsbModelFile.png"));
						sequences.add(esbSequence);
					}
				}
			}
			return sequences.toArray(new IEsbSequence[]{});
		}
		return null;
	}

	public ImageDescriptor getIcon() {
		return SequenceImageUtils.getInstance().getImageDescriptor("projects.gif");
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
		return getSequences(filters);
	}


}
