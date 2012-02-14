package org.wso2.carbonstudio.eclipse.artifact.endpoint.ui.wizard;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.namespace.QName;

import org.apache.axiom.om.OMElement;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.wso2.carbonstudio.eclipse.artifact.endpoint.model.EndpointModel;
import org.wso2.carbonstudio.eclipse.artifact.endpoint.utils.EpArtifactConstants;
import org.wso2.carbonstudio.eclipse.esb.project.artifact.ESBArtifact;
import org.wso2.carbonstudio.eclipse.esb.project.artifact.ESBProjectArtifact;
import org.wso2.carbonstudio.eclipse.platform.core.templates.ArtifactTemplate;
import org.wso2.carbonstudio.eclipse.platform.ui.wizard.AbstractWSO2ProjectCreationWizard;
import org.wso2.carbonstudio.eclipse.utils.file.FileUtils;
import org.wso2.carbonstudio.eclipse.utils.project.ProjectUtils;

public class EndpointProjectCreationWizard extends AbstractWSO2ProjectCreationWizard {
	private final EndpointModel epModel;
	private IFile endpointFile;
	private ESBProjectArtifact esbProjectArtifact;
	private List<File> fileLst = new ArrayList<File>();

	public EndpointProjectCreationWizard() {
		this.epModel = new EndpointModel();
		setModel(this.epModel);
		setWindowTitle(EpArtifactConstants.EP_WIZARD_WINDOW_TITLE);
	}

	
	protected boolean isRequireProjectLocationSection() {
		return false;
	}

	protected boolean isRequiredWorkingSet() {
		 return false;
	}
	
	public boolean performFinish() {
		try {
			String templateContent = "";
			String template = "";
			EndpointModel endpointModel = (EndpointModel) getModel();
			IProject esbProject = endpointModel.getEndpointSaveLocation().getProject();
			IContainer location = esbProject.getFolder("src" + File.separator + "main" +
			                                           File.separator +
			                                           "synapse-config" +
			                                           File.separator +
			                                           "endpoints");
			
			//Adding the metadata about the endpoint to the metadata store.
			esbProjectArtifact=new ESBProjectArtifact();
			esbProjectArtifact.fromFile(esbProject.getFile("artifact.xml").getLocation().toFile());
			
			if (getModel().getSelectedOption().equals(EpArtifactConstants.WIZARD_OPTION_IMPORT_OPTION)) {
				copyImportFile(location);
			} else {
				ArtifactTemplate selectedTemplate = epModel.getSelectedTemplate();
				templateContent = FileUtils.getContentAsString(selectedTemplate.getTemplateDataStream());
				if(selectedTemplate.getName().equals(EpArtifactConstants.ADDRESS_EP)){
					template = createEPTemplate(templateContent, EpArtifactConstants.ADDRESS_EP);
				}else if(selectedTemplate.getName().equals(EpArtifactConstants.WSDL_EP)){
					template = createEPTemplate(templateContent, EpArtifactConstants.WSDL_EP);
				}else if(selectedTemplate.getName().equals(EpArtifactConstants.TEMPLATE_EP)){
					template = createEPTemplate(templateContent, EpArtifactConstants.TEMPLATE_EP);
				}else{
					template = createEPTemplate(templateContent, "");
				}
			
				endpointFile = location.getFile(new Path(endpointModel.getEpName() + ".xml"));
				File destFile = endpointFile.getLocation().toFile();
				FileUtils.createFile(destFile, template);
				fileLst.add(destFile);
				ESBArtifact artifact=new ESBArtifact();
				artifact.setName(endpointModel.getEpName());
				artifact.setVersion("1.0.0");
				artifact.setType("synapse/endpoint");
				artifact.setServerRole("EnterpriseServiceBus");
				artifact.setFile(FileUtils.getRelativePath(esbProject.getLocation().toFile(), new File(location.getLocation().toFile(),endpointModel.getEpName()+".xml")));
				esbProjectArtifact.addESBArtifact(artifact);
			}
			

			File pomfile = esbProject.getFile("pom.xml").getLocation().toFile();
			getModel().getMavenInfo().setPackageName("synapse/endpoint");
			if(!pomfile.exists()){
				createPOM(pomfile);
			}
			ProjectUtils.addNatureToProject(esbProject,
											false,
			                                EpArtifactConstants.ESB_PROJECT_NATURE,
			                                "org.wso2.carbonstudio.eclipse.endpoint.project.nature" );
			esbProject.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
			
			esbProjectArtifact.toFile();
			
			if(fileLst.size()>0){
				openEditor(fileLst.get(0));
			}
			
		} catch (CoreException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return true;
	}

	public void copyImportFile(IContainer importLocation) throws IOException {
		File importFile = getModel().getImportFile();
		EndpointModel endpointModel = (EndpointModel) getModel();
		List<OMElement> selectedEPList = endpointModel.getSelectedEPList();
		File destFile = null;
		if(selectedEPList != null && selectedEPList.size() >0 ){
			for (OMElement element : selectedEPList) {
				String name = element.getAttributeValue(new QName("name"));
				destFile  = new File(importLocation.getLocation().toFile(), name + ".xml");
				FileUtils.createFile(destFile, element.toString());
				fileLst.add(destFile);
				ESBArtifact artifact=new ESBArtifact();
				artifact.setName(name);
				artifact.setVersion("1.0.0");
				artifact.setType("synapse/endpoint");
				artifact.setServerRole("EnterpriseServiceBus");
				artifact.setFile(FileUtils.getRelativePath(importLocation.getProject().getLocation().toFile(), new File(importLocation.getLocation().toFile(),name+".xml")));
				esbProjectArtifact.addESBArtifact(artifact);
				
			}
			
		}else{
			destFile = new File(importLocation.getLocation().toFile(), importFile.getName());
			FileUtils.copy(importFile, destFile);
			fileLst.add(destFile);
			String name = importFile.getName().replaceAll(".xml$", "");
			ESBArtifact artifact=new ESBArtifact();
			artifact.setName(name);
			artifact.setVersion("1.0.0");
			artifact.setType("synapse/endpoint");
			artifact.setServerRole("EnterpriseServiceBus");
			artifact.setFile(FileUtils.getRelativePath(importLocation.getProject().getLocation().toFile(), new File(importLocation.getLocation().toFile(),name+".xml")));
			esbProjectArtifact.addESBArtifact(artifact);
		}
	}

	
	public IResource getCreatedResource() {
		return endpointFile;
	}
	
	public String createEPTemplate(String templateContent, String type) throws IOException{
//		String defaultNS = ESBPreferenceData.getDefaultNamesapce();
//		if(defaultNS.equals("") || defaultNS == null){
//			defaultNS = SynapseConstants.NS_1_4;
//		}
		templateContent = templateContent.replaceAll("\\{", "<");
		templateContent = templateContent.replaceAll("\\}", ">");
		String newContent = templateContent.replaceAll("<ep.name>", epModel.getEpName());
		if(type.equals(EpArtifactConstants.ADDRESS_EP)){
			newContent = newContent.replaceAll("<address.uri>", epModel.getAddressEPURI());
		}else if(type.equals(EpArtifactConstants.WSDL_EP)){
			newContent = newContent.replaceAll("<wsdl.uri>", epModel.getWsdlEPURI());
			newContent = newContent.replaceAll("<service.name>", epModel.getWsdlEPService());
			newContent = newContent.replaceAll("<service.port>", epModel.getWsdlEPPort());
		}else if(type.equals(EpArtifactConstants.TEMPLATE_EP)){
			newContent = newContent.replaceAll("<ep.uri>", epModel.getTemplateEPURI());
			newContent = newContent.replaceAll("<ep.template>", epModel.getTemplateEPTargetTemp());
		}
        return newContent;
	}
	
	public void openEditor(File file){
		try {
			IFile dbsFile  = ResourcesPlugin
			.getWorkspace()
			.getRoot()
			.getFileForLocation(
					Path.fromOSString(file.getAbsolutePath()));
			IDE.openEditor(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage(),dbsFile);
		} catch (Exception e) { /* ignore */}
	}

}
