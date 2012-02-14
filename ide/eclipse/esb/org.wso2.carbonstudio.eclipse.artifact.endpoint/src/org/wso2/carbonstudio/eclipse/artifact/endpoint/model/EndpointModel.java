package org.wso2.carbonstudio.eclipse.artifact.endpoint.model;

import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMException;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.wso2.carbonstudio.eclipse.artifact.endpoint.utils.EpArtifactConstants;
import org.wso2.carbonstudio.eclipse.artifact.endpoint.validators.EndPointTemplateList;
import org.wso2.carbonstudio.eclipse.artifact.endpoint.validators.RegOptionsList;
import org.wso2.carbonstudio.eclipse.platform.core.exception.ObserverFailedException;
import org.wso2.carbonstudio.eclipse.platform.core.project.model.ProjectDataModel;
import org.wso2.carbonstudio.eclipse.platform.core.templates.ArtifactTemplate;
import org.wso2.carbonstudio.eclipse.esb.core.utils.SynapseEntryType;
import org.wso2.carbonstudio.eclipse.esb.core.utils.SynapseFileUtils;
import org.wso2.carbonstudio.eclipse.esb.project.utils.ESBProjectUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLStreamException;

public class EndpointModel extends ProjectDataModel {

	private ArtifactTemplate selectedTemplate;
	private boolean saveAsDynamic = false;
	private String dynamicEpRegistryPath = "conf:";
	private List<OMElement> availableEPList;
	private IContainer endpointSaveLocation;
	private String epName;
	private String addressEPURI;
	private String wsdlEPURI;
	private String wsdlEPService;
	private String wsdlEPPort;
	private String templateEPURI;
	private String templateEPTargetTemp = "";
	private List<OMElement> selectedEPList=new ArrayList<OMElement>();

	
	
	public Object getModelPropertyValue(String key) {
		Object modelPropertyValue = super.getModelPropertyValue(key);
		if (modelPropertyValue == null) {
			if (key.equals(EpArtifactConstants.WIZARD_OPTION_EP_TYPE)) {
				modelPropertyValue = getSelectedTemplate();
			} else if (key.equals(EpArtifactConstants.WIZARD_OPTION_DYNAMIC_EP)) {
				modelPropertyValue = isSaveAsDynamic();
			} else if (key.equals(EpArtifactConstants.WIZARD_OPTION_REGISTRY_PATH)) {
				modelPropertyValue = getDynamicEpRegistryPath();
			} else if (key.equals(EpArtifactConstants.WIZARD_OPTION_SAVE_LOCATION)) {
				modelPropertyValue = getEndpointSaveLocation();
			}else if(key.equals(EpArtifactConstants.WIZARD_OPTION_AVAILABLE_EPS)){
				modelPropertyValue = selectedEPList.toArray();
			}

		}
		return modelPropertyValue;
	}

	
	public boolean setModelPropertyValue(String key, Object data) throws ObserverFailedException {
		boolean returnResult = super.setModelPropertyValue(key, data);
		if (key.equals(EpArtifactConstants.WIZARD_OPTION_IMPORT_FILE)) {
			if (getImportFile() != null && !getImportFile().toString().equals("")) {
				try {
					List<OMElement> availableEPs = new ArrayList<OMElement>();
					if (SynapseFileUtils.isSynapseConfGiven(getImportFile(),
					                                        SynapseEntryType.END_POINT)) {
						availableEPs =
						        SynapseFileUtils.synapseFileProcessing(getImportFile().getPath(),
						                                               SynapseEntryType.END_POINT);
						setAvailableEPList(availableEPs);
						getSelectedEPList().clear();
						getSelectedEPList().addAll(availableEPs);
					} else {
						setAvailableEPList(new ArrayList<OMElement>());
					}
					returnResult = false;
				} catch (OMException e) {
					e.printStackTrace();
				} catch (XMLStreamException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		} else if (key.equals(EpArtifactConstants.WIZARD_OPTION_EP_TYPE)) {
			ArtifactTemplate template = (ArtifactTemplate) data;
			setSelectedTemplate(template);
		} else if (key.equals(EpArtifactConstants.WIZARD_OPTION_DYNAMIC_EP)) {
			setSaveAsDynamic((Boolean) data);
		} else if (key.equals(EpArtifactConstants.WIZARD_OPTION_REGISTRY_PATH)) {
			if (data.toString().equals(RegOptionsList.CONST_GOVERNANCE)) {
				data = "gov:";
				returnResult = true;
			} else if (data.toString().equals(RegOptionsList.CONST_CONFIG)) {
				data = "conf:";
				returnResult = true;
			}
			setDynamicEpRegistryPath(data.toString());
		} else if (key.equals(EpArtifactConstants.WIZARD_OPTION_SAVE_LOCATION)) {
			setEndpointSaveLocation((IContainer) data);
		} else if (key.equals(EpArtifactConstants.WIZARD_OPTION_CREATE_ESB_PROJECT)) {
			Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
			IProject esbProject = ESBProjectUtils.createESBProject(shell);
			setEndpointSaveLocation(esbProject);
			// TODO show wizard to create a esb project
			// get endpoint location of the esb project & set
			// endpointSaveLocation as it is
		}else if(key.equals(EpArtifactConstants.WIZARD_OPTION_EP_NAME)){
			setEpName(data.toString());
		}else if(key.equals(EpArtifactConstants.WIZARD_OPTION_TEMPLATE_ADDRESS_EP_URL)){
			setAddressEPURI(data.toString());
		}else if(key.equals(EpArtifactConstants.WIZARD_OPTION_TEMPLATE_WSDL_EP_URL)){
			setWsdlEPURI(data.toString());
		}else if(key.equals(EpArtifactConstants.WIZARD_OPTION_TEMPLATE_WSDL_EP_SERVICE)){
			setWsdlEPService(data.toString());
		}else if(key.equals(EpArtifactConstants.WIZARD_OPTION_TEMPLATE_WSDL_EP_SERVICE_PORT)){
			setWsdlEPPort(data.toString());
		}else if(key.equals(EpArtifactConstants.WIZARD_OPTION_TEMPLATE_TEMP_EP_URL)){
			setTemplateEPURI(data.toString());
		}else if(key.equals(EpArtifactConstants.WIZARD_OPTION_TEMPLATE_TEMP_TARGET)){
			setTemplateEPTargetTemp(data.toString());
		}else if(key.equals(EpArtifactConstants.WIZARD_OPTION_AVAILABLE_EPS)){
			Object[] selectedEPs = (Object[])data;
			selectedEPList.clear();
			for (Object object : selectedEPs) {
				if(object instanceof OMElement){
					selectedEPList.add((OMElement)object);
				}
			}
			setSelectedEPList(selectedEPList);
		}

		return returnResult;
	}

	public void setSelectedTemplate(ArtifactTemplate selectedTemplate) {
		this.selectedTemplate = selectedTemplate;
	}

	public ArtifactTemplate getSelectedTemplate() {
		if(selectedTemplate == null){
			ArtifactTemplate[] artifactTemplates = EndPointTemplateList.getArtifactTemplates();
			if (artifactTemplates.length > 0) {
				selectedTemplate = artifactTemplates[0];// new
														// ArtifactTemplate("org.wso2.carbonstudio.eclipse.esb.template.ep0",
														// "Default Endpoint");
			} else {
				return null;
			}
		}
		return selectedTemplate;
	}

	public void setSaveAsDynamic(boolean saveAsDynamic) {
		this.saveAsDynamic = saveAsDynamic;
	}

	public boolean isSaveAsDynamic() {
		return saveAsDynamic;
	}

	public void setDynamicEpRegistryPath(String dynamicEpRegistryPath) {
		this.dynamicEpRegistryPath = dynamicEpRegistryPath;
	}

	public String getDynamicEpRegistryPath() {
		return dynamicEpRegistryPath;
	}

	public void setAvailableEPList(List<OMElement> availableEPList) {
		this.availableEPList = availableEPList;
	}

	public List<OMElement> getAvailableEPList() {
		return availableEPList;
	}

	public void setEndpointSaveLocation(IContainer endpointSaveLocation) {
		this.endpointSaveLocation = endpointSaveLocation;
	}

	public void setEndpointSaveLocation(String endpointSaveLocation) {
		this.endpointSaveLocation =
		        ResourcesPlugin.getWorkspace().getRoot()
		                .getContainerForLocation(new Path(endpointSaveLocation));
	}

	public IContainer getEndpointSaveLocation() {
		return endpointSaveLocation;
	}

	
	public void setLocation(File location) {
		super.setLocation(location);
		File absolutionPath = getLocation();
		if (getEndpointSaveLocation() == null && absolutionPath != null) {
			IContainer newEndpointSaveLocation =
			        getContainer(absolutionPath, EpArtifactConstants.ESB_PROJECT_NATURE);
			setEndpointSaveLocation(newEndpointSaveLocation);
		}
	}

	public static IContainer getContainer(File absolutionPath, String projectNature) {
		IProject[] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
		int length = 0;
		IProject currentSelection = null;
		for (IProject project : projects) {
			try {
				if (project.isOpen() && project.hasNature(projectNature)) {
					File projectLocation = project.getLocation().toFile();
					int projectLocationLength = projectLocation.toString().length();
					if (projectLocationLength > length &&
					    projectLocationLength <= absolutionPath.toString().length()) {
						if (absolutionPath.toString().startsWith(projectLocation.toString())) {
							length = projectLocationLength;
							currentSelection = project;
						}
					}
				}
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
		IContainer newEndpointSaveLocation = null;
		if (currentSelection != null) {
			String path =
			        absolutionPath.toString().substring(
			                                            currentSelection.getLocation().toFile()
			                                                    .toString().length());

			if (path.equals("")) {
				newEndpointSaveLocation = currentSelection;
			} else {
				newEndpointSaveLocation = currentSelection.getFolder(path);
			}
		}
		return newEndpointSaveLocation;
	}

	public void setEpName(String epName) {
		this.epName = epName;
	}

	public String getEpName() {
		return epName;
	}
	
	public String getAddressEPURI() {
		return addressEPURI;
	}

	public void setAddressEPURI(String addressEPURI) {
		this.addressEPURI = addressEPURI;
	}

	public String getWsdlEPURI() {
		return wsdlEPURI;
	}

	public void setWsdlEPURI(String wsdlEPURI) {
		this.wsdlEPURI = wsdlEPURI;
	}

	public String getWsdlEPService() {
		return wsdlEPService;
	}

	public void setWsdlEPService(String wsdlEPService) {
		this.wsdlEPService = wsdlEPService;
	}

	public String getWsdlEPPort() {
		return wsdlEPPort;
	}

	public void setWsdlEPPort(String wsdlEPPort) {
		this.wsdlEPPort = wsdlEPPort;
	}

	public String getTemplateEPURI() {
		return templateEPURI;
	}

	public void setTemplateEPURI(String templateEPURI) {
		this.templateEPURI = templateEPURI;
	}

	public String getTemplateEPTargetTemp() {
		return templateEPTargetTemp;
	}

	public void setTemplateEPTargetTemp(String templateEPTargetTemp) {
		this.templateEPTargetTemp = templateEPTargetTemp;
	}

	public void setSelectedEPList(List<OMElement> selectedEPList) {
		this.selectedEPList = selectedEPList;
	}

	public List<OMElement> getSelectedEPList() {
		return selectedEPList;
	}
}
