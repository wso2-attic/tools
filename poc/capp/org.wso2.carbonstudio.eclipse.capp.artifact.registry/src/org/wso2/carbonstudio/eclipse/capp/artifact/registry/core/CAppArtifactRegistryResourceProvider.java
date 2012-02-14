package org.wso2.carbonstudio.eclipse.capp.artifact.registry.core;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.xml.stream.FactoryConfigurationError;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.jface.resource.ImageDescriptor;
import org.wso2.carbonstudio.eclipse.capp.artifact.registry.Activator;
import org.wso2.carbonstudio.eclipse.capp.artifact.registry.utils.RegistryImageUtils;
import org.wso2.carbonstudio.eclipse.capp.artifact.registry.utils.RegistryResourceInfo;
import org.wso2.carbonstudio.eclipse.capp.artifact.registry.utils.RegistryResourceInfoDoc;
import org.wso2.carbonstudio.eclipse.capp.core.manifest.Artifact;
import org.wso2.carbonstudio.eclipse.capp.core.utils.Constants;
import org.wso2.carbonstudio.eclipse.greg.core.RegistryManager;
import org.wso2.carbonstudio.eclipse.greg.core.interfaces.IRegistryCollection;
import org.wso2.carbonstudio.eclipse.greg.core.interfaces.IRegistryFile;
import org.wso2.carbonstudio.eclipse.greg.core.interfaces.IRegistryResource;
import org.wso2.carbonstudio.eclipse.greg.core.interfaces.IRegistryResourceProvider;
import org.wso2.carbonstudio.eclipse.greg.core.interfaces.RegistryCollectionImpl;
import org.wso2.carbonstudio.eclipse.greg.core.interfaces.RegistryFileImpl;
import org.wso2.carbonstudio.eclipse.greg.core.interfaces.RegistryResourceImpl;
import org.wso2.carbonstudio.eclipse.logging.core.ICarbonStudioLog;
import org.wso2.carbonstudio.eclipse.logging.core.Logger;
import org.wso2.carbonstudio.eclipse.platform.core.interfaces.ICarbonStudioElement;
import org.wso2.carbonstudio.eclipse.platform.core.utils.CarbonStudioProviderUtils;

public class CAppArtifactRegistryResourceProvider implements IRegistryResourceProvider{
	private Artifact artifact;
	List<IRegistryResource> resources;
	private static ICarbonStudioLog log=Logger.getLog(Activator.PLUGIN_ID);

	public CAppArtifactRegistryResourceProvider(Artifact artifact) {
		setArtifact(artifact);
	}
	
	public IRegistryResourceProvider[] getCategories(Map<String, List<String>> filters) {
		return null;
	}

	public ImageDescriptor getIcon() {
		return RegistryImageUtils.getInstance().getImageDescriptor("icon-artifact.png");
	}

	public String getId() {
		return null;
	}

	public IRegistryResource[] getResources(Map<String, List<String>> filters) {
		if (resources==null){
			scanAndCollectResources(filters);
		}
		return resources.toArray(new IRegistryResource[]{});
	}

	public String getText() {
		return getArtifact().getCaption();
	}

	public void setArtifact(Artifact artifact) {
		this.artifact = artifact;
	}

	public Artifact getArtifact() {
		return artifact;
	}

	private void scanAndCollectResources(Map<String, List<String>> filters) throws FactoryConfigurationError {
		resources=new ArrayList<IRegistryResource>();
		String filename = artifact.getFile();
		IFolder parent = (IFolder)artifact.getSource().getParent();
		IFile file = parent.getFile(filename);
		RegistryResourceInfoDoc registryResourceInfoDoc = new RegistryResourceInfoDoc();
		try {
			registryResourceInfoDoc.deserialize(file.getContents());
			List<RegistryResourceInfo> registryResources = registryResourceInfoDoc.getRegistryResources();
			IFolder resroucesFolder = parent.getFolder("resources");
			List<IRegistryFile> childrenFiles = new ArrayList<IRegistryFile>();
			List<IRegistryCollection> childrenCollections = new ArrayList<IRegistryCollection>();

			for (RegistryResourceInfo resourceInfo : registryResources) {
				RegistryResourceImpl registryResourceImpl;
				if (resourceInfo.getType()==Constants.REGISTRY_RESOURCE){
					
					registryResourceImpl = new RegistryFileImpl(null);
					IFile registryResource = resroucesFolder.getFile(resourceInfo.getRelativePath());
					boolean passed = RegistryManager.isMediaTypeFilterPassed(filters,
							registryResource);
					if (!passed){
						continue;
					}
					passed = CarbonStudioProviderUtils.isInProjectFilterPassed(filters,
							registryResource);
					if (!passed){
						continue;
					}
					registryResourceImpl.setSource(registryResource);
					registryResourceImpl.setPath(resourceInfo.getPath(),resourceInfo.getRelativePath());
					childrenFiles.add((IRegistryFile)registryResourceImpl);
				}else{
					registryResourceImpl = new RegistryCollectionImpl(null);
					IFolder registryResource = resroucesFolder.getFolder(resourceInfo.getRelativePath());
					registryResourceImpl.setSource(registryResource);
					boolean passed = CarbonStudioProviderUtils.isInProjectFilterPassed(filters,
							registryResource);
					if (!passed){
						continue;
					}
					registryResourceImpl.setPath(resourceInfo.getPath());
				
					if (registryResourceImpl.hasChildren(filters)) {
						childrenCollections
								.add((IRegistryCollection) registryResourceImpl);
					}
				}
				registryResourceImpl.setName(resourceInfo.getRelativePath());
			}
			resources.addAll(childrenCollections);
			resources.addAll(childrenFiles);
		} catch (Exception e) {
			log.error(e);
		}
	}
	
	public void refresh() {
		resources=null;
	}

	public ICarbonStudioElement[] getElements(Map<String, List<String>> filters) {
		return getResources(filters);
	}

}
