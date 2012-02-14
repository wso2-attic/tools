package org.wso2.carbonstudio.eclipse.capp.artifact.registry.core;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.xml.stream.FactoryConfigurationError;

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.resource.ImageDescriptor;
import org.wso2.carbonstudio.eclipse.capp.artifact.registry.utils.RegistryImageUtils;
import org.wso2.carbonstudio.eclipse.capp.core.artifacts.manager.CAppEnvironment;
import org.wso2.carbonstudio.eclipse.capp.core.manifest.Artifact;
import org.wso2.carbonstudio.eclipse.greg.core.interfaces.IRegistryResource;
import org.wso2.carbonstudio.eclipse.greg.core.interfaces.IRegistryResourceProvider;
import org.wso2.carbonstudio.eclipse.platform.core.interfaces.ICarbonStudioElement;

public class CAppProjectRegistryResourceProvider implements IRegistryResourceProvider{
	private IProject project;
	List<IRegistryResourceProvider> subProviders;

	public CAppProjectRegistryResourceProvider(IProject project) {
		setProject(project);
	}
	
	public IRegistryResourceProvider[] getCategories(Map<String, List<String>> filters) {
		if (project.isOpen()){
			if (subProviders==null){
				retrieveRegistryResources(filters);
			}
			return subProviders.toArray(new IRegistryResourceProvider[]{});
		}
		return null;
	}

	private void retrieveRegistryResources(Map<String, List<String>> filters) throws FactoryConfigurationError {
		subProviders=new ArrayList<IRegistryResourceProvider>();
		List<Artifact> artifacts = CAppEnvironment.getcAppManager().getArtifacts(project);
		for (Artifact artifact : artifacts) {
			if (artifact.getType().equals(RegistryArtifactHandler.getType())){
				CAppArtifactRegistryResourceProvider artifactResourceProvider = new CAppArtifactRegistryResourceProvider(artifact);
				IRegistryResource[] resources = artifactResourceProvider.getResources(filters);
				if (resources.length>0){
					subProviders.add(artifactResourceProvider);
				}
			}
		}
	}
	
	public ImageDescriptor getIcon() {
		return RegistryImageUtils.getInstance().getImageDescriptor("projects.gif");
	}

	public String getId() {
		return "project";
	}

	public IRegistryResource[] getResources(Map<String, List<String>> filters) {
		return null;
	}

	public String getText() {
		return getProject().getName();
	}
	public void setProject(IProject project) {
		this.project = project;
	}
	public IProject getProject() {
		return project;
	}

	public void refresh() {
		subProviders=null;
	}

	public ICarbonStudioElement[] getElements(Map<String, List<String>> filters) {
		return getResources(filters);
	}

}
