package org.wso2.carbonstudio.eclipse.artifact.bpel.ui.wizard;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.wso2.carbonstudio.eclipse.artifact.bpel.model.BpelModel;
import org.wso2.carbonstudio.eclipse.artifact.bpel.utils.BPELArtifactConstants;
import org.wso2.carbonstudio.eclipse.artifact.bpel.utils.BPELTemplateUtils;
import org.wso2.carbonstudio.eclipse.platform.ui.wizard.AbstractWSO2ProjectCreationWizard;
import org.wso2.carbonstudio.eclipse.utils.archive.ArchiveManipulator;
import org.wso2.carbonstudio.eclipse.utils.file.FileUtils;
import org.wso2.carbonstudio.eclipse.utils.project.ProjectUtils;

public class BPELProjectCreationWizard extends AbstractWSO2ProjectCreationWizard {
	private final BpelModel bpelModel;
	private static final String BPEL_WIZARD_WINDOW_TITLE = "Create New BPEL Project";
	private IProject project;
	private String processName;
	private String namespace;
//	private WSDLInfoWizardPage wsdlInfoPage;
//	private MavenDetailsPage mavenDetailsPage;

	public BPELProjectCreationWizard() {
		this.bpelModel = new BpelModel();
		setModel(this.bpelModel);
		setWindowTitle(BPEL_WIZARD_WINDOW_TITLE);
	}

	
	public boolean performFinish() {
		try {
			project = createNewProject();
			if (getModel().getSelectedOption().equals("import.bpelproject")) {
				extractImportFile(project);
				extractBPELSettingsTemplate(project);
				replaceAndUpdateSettingsFiles();
			}else if(getModel().getSelectedOption().equals("new.bpelproject")){
				if(!project.getFile("deploy.xml").exists()){
					addBPELTemplate(project);
				}
				//replace bpel files with the given process name and the namespace
				replaceAndUpdateNewBpelProject();
			}else{
				
			}
			addCommonConfigs();
			getModel().addToWorkingSet(project);
			project.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
			List<File> bpelFiles = new ArrayList<File>();
			
			File[] allExactMatchingFiles = FileUtils.getAllExactMatchingFiles(project.getLocation().toOSString(),
					null, "bpel",bpelFiles);
			String relativePath = FileUtils.getRelativePath(project.getLocation().toFile(), allExactMatchingFiles[0]);
			try {
				IFile resourceFile = project.getFile(relativePath);
				IDE.openEditor(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage(),resourceFile);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (CoreException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return true;
	}

//	public void addPages() {
//		wsdlInfoPage = new WSDLInfoWizardPage("Create a WSDL File");
//		mavenDetailsPage = new MavenDetailsPage(getModel());
//		super.addPages();
//		addPage(wsdlInfoPage);
//		addPage(mavenDetailsPage);
//	}
//	
//	public IWizardPage getNextPage(IWizardPage page) {
//		IWizardPage nextPage = super.getNextPage(page);
//		if(page instanceof ProjectOptionsDataPage ){
//			if(getModel().getSelectedOption().equals("new.bpelproject")){
//				nextPage = wsdlInfoPage;
//			}
//		}else if(page instanceof WSDLInfoWizardPage){
//			nextPage = mavenDetailsPage;
//		}
//		return nextPage;
//	}
	
	
	private void addCommonConfigs() throws Exception, CoreException {
		File pomfile = project.getFile("pom.xml").getLocation().toFile();
		getModel().getMavenInfo().setPackageName("bpel/workflow");
		createPOM(pomfile);
		ProjectUtils.addNatureToProject(project,
										false,
										"org.eclipse.jem.workbench.JavaEMFNature",
										"org.eclipse.wst.common.modulecore.ModuleCoreNature",
										"org.eclipse.wst.common.project.facet.core.nature",
		                                "org.wso2.carbonstudio.eclipse.bpel.project.nature");
		                                
		//add buildspacifications to .project file
		ProjectUtils.addBuildSpecificationsToProject(project, 
													"org.eclipse.wst.common.project.facet.core.builder", 
													"org.eclipse.wst.validation.validationbuilder",
													"org.eclipse.bpel.validator.builder");
	}
	
	
	public void replaceAndUpdateSettingsFiles() throws IOException{
		
		File settingsFile = project.getFile("/.settings/org.eclipse.wst.common.component").getLocation().toFile();
		File newSettingsFile = project.getFile("/.settings/org.eclipse.wst.common.component").getLocation().toFile();
		String settingFileAsString = FileUtils.getContentAsString(settingsFile);
		String replacedSettingContent = replaceFileContent(settingFileAsString, "sample", project.getName());
		FileUtils.createFile(newSettingsFile, replacedSettingContent);
		
	}
	
	public void replaceAndUpdateNewBpelProject() throws IOException{
		//HelloWorldProcess.bpel
		//HelloWorldProcessArtifacts.wsdl
		//deploy.xml
		//read project
		//"http://eclipse.org/bpel/sample"
		processName = ((BpelModel)getModel()).getProcessName();
		namespace = ((BpelModel)getModel()).getProcessNS();
		
		File processFile = project.getFile("HelloWorldBPELProcess.bpel").getLocation().toFile();
		File wsdlfile = project.getFile("HelloWorldBPELProcessArtifacts.wsdl").getLocation().toFile();
		File deployfile = project.getFile("deploy.xml").getLocation().toFile();
		File settingsFile = project.getFile("/.settings/org.eclipse.wst.common.component").getLocation().toFile();
		
		File newProcessFile = project.getFile( processName + ".bpel").getLocation().toFile();
		File newWSDLFile = project.getFile(processName + "Artifacts.wsdl").getLocation().toFile();
		File newSettingsFile = project.getFile("/.settings/org.eclipse.wst.common.component").getLocation().toFile();
		
		String processFileAsString = FileUtils.getContentAsString(processFile);
		String wsdlFileAsString = FileUtils.getContentAsString(wsdlfile);
		String deployFileAsString = FileUtils.getContentAsString(deployfile);
		String settingFileAsString = FileUtils.getContentAsString(settingsFile);
		
		String replacedProcessContent = replaceFileContent(processFileAsString, "HelloWorldBPELProcess", processName);
		String replacedWSDLContent = replaceFileContent(wsdlFileAsString, "HelloWorldBPELProcess", processName);
		String replacedDeployContent = replaceFileContent(deployFileAsString, "HelloWorldBPELProcess", processName);
		String replacedSettingContent = replaceFileContent(settingFileAsString, "HelloWorldBPELProcess", project.getName());
		
		replacedProcessContent = replaceFileContent(replacedProcessContent, "http://eclipse.org/bpel/sample", namespace);
		replacedWSDLContent = replaceFileContent(replacedWSDLContent, "http://eclipse.org/bpel/sample", namespace);
		replacedDeployContent = replaceFileContent(replacedDeployContent, "http://eclipse.org/bpel/sample", namespace);
		
		FileUtils.createFile(newProcessFile, replacedProcessContent);
		FileUtils.createFile(newWSDLFile, replacedWSDLContent);
		FileUtils.createFile(deployfile, replacedDeployContent);
		FileUtils.createFile(newSettingsFile, replacedSettingContent);
		
		processFile.delete();
		wsdlfile.delete();
		
//		org.apache.commons.io.FileUtils.deleteQuietly(processFile);
//		org.apache.commons.io.FileUtils.deleteQuietly(wsdlfile);
//		org.apache.commons.io.FileUtils.deleteQuietly(settingsFile);
	
	}
	
	public String replaceFileContent(String sourceString,String replacer, String toreplace){
		String replacedContent = sourceString.replaceAll(replacer, toreplace);
		return replacedContent;
	}

	public void extractImportFile(IProject importProject) throws IOException {
		File importFile = getModel().getImportFile();
		// IFolder bpelContentFolder =
		// ProjectUtils.getWorkspaceFolder(importProject, "bpelContent");
		
		ArchiveManipulator archiveManupulator = new ArchiveManipulator();
		archiveManupulator.extract(importFile, importProject.getLocation().toFile());
	}

	
	public IResource getCreatedResource() {
		return project;
	}
	
	private void extractBPELSettingsTemplate(IProject importProject) throws IOException{
		File bpelTemplateFile = new BPELTemplateUtils().getResourceFile("templates/bpel-settings.zip");
		ArchiveManipulator archiveManipulator = new ArchiveManipulator();
		archiveManipulator.extract(bpelTemplateFile, importProject.getLocation().toFile());
	}
	
	private void addBPELTemplate(IProject newProject) throws IOException{
		File bpelTemplateFile = null;
		if(BPELArtifactConstants.ASYNCHRONOUS_BPEL_PROCESS.equals(bpelModel.getSelectedTemplate())){
			bpelTemplateFile = new BPELTemplateUtils().getResourceFile("templates/asynchronous-bpel-template.zip");
		}else if(BPELArtifactConstants.SYNCHRONOUS_BPEL_PROCESS.equals(bpelModel.getSelectedTemplate())){
			bpelTemplateFile = new BPELTemplateUtils().getResourceFile("templates/synchronous-bpel-template.zip");
		}else if(BPELArtifactConstants.EMPTY_BPEL_PROCESS.equals(bpelModel.getSelectedTemplate())){
			bpelTemplateFile = new BPELTemplateUtils().getResourceFile("templates/empty-bpel-template.zip");
		}else{
//			bpelTemplateFile = new BPELTemplateUtils().getResourceFile("templates/bpel-template.zip");
		}
		
		ArchiveManipulator archiveManipulator = new ArchiveManipulator();
		archiveManipulator.extract(bpelTemplateFile, newProject.getLocation().toFile());
	} 

}
