package org.wso2.carbonstudio.eclipse.artifact.sequence.ui.wizard;

import java.io.File;
import java.io.IOException;
import java.text.MessageFormat;
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
import org.wso2.carbonstudio.eclipse.artifact.sequence.model.SequenceModel;
import org.wso2.carbonstudio.eclipse.esb.project.artifact.ESBArtifact;
import org.wso2.carbonstudio.eclipse.esb.project.artifact.ESBProjectArtifact;
import org.wso2.carbonstudio.eclipse.platform.core.templates.ArtifactTemplate;
import org.wso2.carbonstudio.eclipse.platform.core.templates.ArtifactTemplateHandler;
import org.wso2.carbonstudio.eclipse.platform.ui.wizard.AbstractWSO2ProjectCreationWizard;
import org.wso2.carbonstudio.eclipse.utils.file.FileUtils;
import org.wso2.carbonstudio.eclipse.utils.project.ProjectUtils;

public class SequenceProjectCreationWizard extends AbstractWSO2ProjectCreationWizard {
	private final SequenceModel seqModel;
	private static final String SEQ_WIZARD_WINDOW_TITLE = "Create New Sequence";
	private ESBProjectArtifact esbProjectArtifact;
	private List<File> fileLst = new ArrayList<File>();

	public SequenceProjectCreationWizard() {
		this.seqModel = new SequenceModel();
		setModel(this.seqModel);
		setWindowTitle(SEQ_WIZARD_WINDOW_TITLE);
	}

	
	protected boolean isRequireProjectLocationSection() {
		return false;
	}
	
	protected boolean isRequiredWorkingSet() {
	  return false;
	}
	
	public boolean performFinish() {
		try {
			SequenceModel sequenceModel = (SequenceModel)getModel();
			IProject esbProject = sequenceModel.getSequenceSaveLocation().getProject();
			IContainer location = esbProject.getFolder("src" + File.separator + "main" +
			                                           File.separator +
			                                           "synapse-config" +
			                                           File.separator +
			                                           "sequences");
			
			//Adding the metadata about the sequence to the metadata store.
			esbProjectArtifact=new ESBProjectArtifact();
			esbProjectArtifact.fromFile(esbProject.getFile("artifact.xml").getLocation().toFile());
			
			if (getModel().getSelectedOption().equals("import.sequence")) {
				copyImportFile(location);
			}else{
//				Map<String,List<String>> filters=new HashMap<String,List<String>> ();
//				CarbonStudioProviderUtils.addFilter(filters,
//													CSProviderConstants.FILTER_MEDIA_TYPE,
//													ESBMediaTypeConstants.MEDIA_TYPE_SEQUENCE);
				ArtifactTemplate selectedTemplate = ArtifactTemplateHandler.getArtifactTemplates("org.wso2.carbonstudio.eclipse.esb.sequence");
				String templateContent = FileUtils.getContentAsString(selectedTemplate.getTemplateDataStream());
				String content = createSequenceTemplate(templateContent);
				File destFile = new File(location.getLocation().toFile(), sequenceModel.getSequenceName() + ".xml");
				FileUtils.createFile(destFile, content);
				fileLst.add(destFile);
				ESBArtifact artifact=new ESBArtifact();
				artifact.setName(sequenceModel.getSequenceName());
				artifact.setVersion("1.0.0");
				artifact.setType("synapse/sequence");
				artifact.setServerRole("EnterpriseServiceBus");
				artifact.setFile(FileUtils.getRelativePath(esbProject.getLocation().toFile(), new File(location.getLocation().toFile(),sequenceModel.getSequenceName()+".xml")));
				esbProjectArtifact.addESBArtifact(artifact);
			}

			File pomfile = esbProject.getFile("pom.xml").getLocation().toFile();
			getModel().getMavenInfo().setPackageName("synapse/sequence");
			if(!pomfile.exists()){
				createPOM(pomfile);
			}
			
			ProjectUtils.addNatureToProject(esbProject,
					false,
                    "org.wso2.carbonstudio.eclipse.sequence.project.nature" ,
                    "org.wso2.carbonstudio.eclipse.esb.project.nature");
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
		File destFile = null;
		List<OMElement> selectedSeqList = ((SequenceModel)getModel()).getSelectedSeqList();
		if(selectedSeqList != null && selectedSeqList.size() >0 ){
			for (OMElement element : selectedSeqList) {
				String name = element.getAttributeValue(new QName("name"));
				destFile = new File(importLocation.getLocation().toFile(), name + ".xml");
				FileUtils.createFile(destFile, element.toString());
				fileLst.add(destFile);
				ESBArtifact artifact=new ESBArtifact();
				artifact.setName(name);
				artifact.setVersion("1.0.0");
				artifact.setType("synapse/sequence");
				artifact.setServerRole("EnterpriseServiceBus");
				artifact.setFile(FileUtils.getRelativePath(importLocation.getProject().getLocation().toFile(), new File(importLocation.getLocation().toFile(),name+".xml")));
				esbProjectArtifact.addESBArtifact(artifact);
			} 
			
		}else{
			destFile = new File(importLocation.getLocation().toFile(), importFile.getName());
			FileUtils.copy(importFile, destFile);
			fileLst.add(destFile);
			String name = importFile.getName().replaceAll(".xml$","");
			ESBArtifact artifact=new ESBArtifact();
			artifact.setName(name);
			artifact.setVersion("1.0.0");
			artifact.setType("synapse/sequence");
			artifact.setServerRole("EnterpriseServiceBus");
			artifact.setFile(FileUtils.getRelativePath(importLocation.getProject().getLocation().toFile(), new File(importLocation.getLocation().toFile(),name+".xml")));
			esbProjectArtifact.addESBArtifact(artifact);
		}
		
		
	}
	
	public String createSequenceTemplate(String templateContent) throws IOException{
//		String defaultNS = ESBPreferenceData.getDefaultNamesapce();
//		if(defaultNS.equals("") || defaultNS == null){
//			defaultNS = SynapseConstants.NS_1_4;
//		}
		String content = "";
		if(!seqModel.getSelectedEP().equals("")){
			String contentWithoutClosingTag = templateContent.substring(0, templateContent.length()-2);
			contentWithoutClosingTag = contentWithoutClosingTag.concat(seqModel.getSelectedEP());
			content = MessageFormat.format(contentWithoutClosingTag,seqModel.getSequenceName(),seqModel.getOnErrorSequence());
		}else{
			content = MessageFormat.format(templateContent,seqModel.getSequenceName(),seqModel.getOnErrorSequence());
		}
        return content;
	}

	
	public IResource getCreatedResource() {
		// TODO Auto-generated method stub
		return null;
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
