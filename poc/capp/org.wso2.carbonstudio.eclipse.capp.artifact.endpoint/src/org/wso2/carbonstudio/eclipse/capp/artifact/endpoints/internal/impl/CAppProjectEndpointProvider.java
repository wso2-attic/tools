package org.wso2.carbonstudio.eclipse.capp.artifact.endpoints.internal.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.resource.ImageDescriptor;
import org.wso2.carbonstudio.eclipse.capp.artifact.endpoints.core.EndPointArtifactHandler;
import org.wso2.carbonstudio.eclipse.capp.artifact.endpoints.utils.EndPointImageUtils;
import org.wso2.carbonstudio.eclipse.capp.core.artifacts.manager.CAppEnvironment;
import org.wso2.carbonstudio.eclipse.capp.core.manifest.Artifact;
import org.wso2.carbonstudio.eclipse.esb.core.configuration.impl.EsbEndpointImpl;
import org.wso2.carbonstudio.eclipse.esb.core.interfaces.IEndpointProvider;
import org.wso2.carbonstudio.eclipse.esb.core.interfaces.IEsbEndpoint;
import org.wso2.carbonstudio.eclipse.platform.core.interfaces.ICarbonStudioElement;
import org.wso2.carbonstudio.eclipse.platform.core.utils.CarbonStudioProviderUtils;

public class CAppProjectEndpointProvider implements IEndpointProvider {
	private IProject project;

	public CAppProjectEndpointProvider(IProject project) {
		setProject(project);
	}
	
	public IEndpointProvider[] getCategories(Map<String, List<String>> filters) {
		return null;
	}

	public IEsbEndpoint[] getEndpoints(Map<String, List<String>> filters) {
		if (project.isOpen()){
			List<IEsbEndpoint> endpoints=new ArrayList<IEsbEndpoint>();
			List<Artifact> artifacts = CAppEnvironment.getcAppManager().getArtifacts(project);
			for (Artifact artifact : artifacts) {
				if (artifact.getType().equals(EndPointArtifactHandler.getType())){
					EsbEndpointImpl esbEndpoint = new EsbEndpointImpl();
					esbEndpoint.setName(artifact.getName());
					IFile file = artifact.getSource().getParent().getFile(new Path(artifact.getFile()));
					boolean mediaTypeFilterPassed = CarbonStudioProviderUtils.isMediaTypeFilterPassed(filters, file);
					if (mediaTypeFilterPassed){
						esbEndpoint.setSource(file);
						esbEndpoint.setIcon(EndPointImageUtils.getInstance().getImageDescriptor("EsbModelFile.png"));
						endpoints.add(esbEndpoint);
					}
				}
			}
			return endpoints.toArray(new IEsbEndpoint[]{});
		}
		return null;
	}

	public ImageDescriptor getIcon() {
		return EndPointImageUtils.getInstance().getImageDescriptor("projects.gif");
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
		return getEndpoints(filters);
	}

}
