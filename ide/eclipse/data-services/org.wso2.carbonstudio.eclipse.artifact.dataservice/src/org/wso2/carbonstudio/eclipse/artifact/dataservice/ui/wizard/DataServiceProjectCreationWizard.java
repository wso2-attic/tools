package org.wso2.carbonstudio.eclipse.artifact.dataservice.ui.wizard;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.wso2.carbonstudio.eclipse.artifact.dataservice.model.DataServiceModel;
import org.wso2.carbonstudio.eclipse.artifact.dataservice.utils.DataServiceTemplateUtils;
import org.wso2.carbonstudio.eclipse.platform.core.utils.XMLUtil;
import org.wso2.carbonstudio.eclipse.platform.ui.wizard.AbstractWSO2ProjectCreationWizard;
import org.wso2.carbonstudio.eclipse.platform.ui.wizard.pages.MavenDetailsPage;
import org.wso2.carbonstudio.eclipse.platform.ui.wizard.pages.ProjectOptionsDataPage;
import org.wso2.carbonstudio.eclipse.utils.file.FileUtils;
import org.wso2.carbonstudio.eclipse.utils.project.ProjectUtils;

public class DataServiceProjectCreationWizard extends AbstractWSO2ProjectCreationWizard {
	private final DataServiceModel dsModel;
	private static final String DS_WIZARD_WINDOW_TITLE = "Create New Data Service Project";
	private IProject project;
	private NewDataSourceWizardPage newDataSourcepage;
	private IWizardPage[] pages;

	public DataServiceProjectCreationWizard() {
		this.dsModel = new DataServiceModel();
		setModel(this.dsModel);
		setWindowTitle(DS_WIZARD_WINDOW_TITLE);
	}

	
	public boolean performFinish() {
		try {
			project = createNewProject();
			File openFile =null;
			if (getModel().getSelectedOption().equals("import.dsproject")) {
				openFile = copyImportFile(project);
			}

			if (getModel().getSelectedOption().equals("new.dsproject")) {
				openFile = addDSTemplate(project);
			}

			File pomfile = project.getFile("pom.xml").getLocation().toFile();
			getModel().getMavenInfo().setPackageName("service/dataservice");
			createPOM(pomfile);
			ProjectUtils.addNatureToProject(project,
											false,
			                                "org.wso2.carbonstudio.eclipse.ds.project.nature");
		
			getModel().addToWorkingSet(project);
			project.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
			try {
				IFile dbsFile  = ResourcesPlugin
					.getWorkspace()
					.getRoot()
					.getFileForLocation(
						Path.fromOSString(openFile.getAbsolutePath()));
				IDE.openEditor(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage(),dbsFile);
			} catch (Exception e) { /* ignore */}
		} catch (CoreException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return true;
	}

	public File copyImportFile(IProject importProject) throws IOException {
		File importFile = getModel().getImportFile();
		IFolder dsResourceFolder =
		        ProjectUtils.getWorkspaceFolder(importProject, "src", "main", "dataservice");
		File dsResourceFile =
		        new File(dsResourceFolder.getLocation().toFile(), importFile.getName());
		FileUtils.copy(importFile, dsResourceFile);
		return dsResourceFile;
	}

	private File addDSTemplate(IProject project) throws Exception {
		String eol = System.getProperty("line.separator"); 
		String properties ="";
		File dsTemplateFile = new DataServiceTemplateUtils().getResourceFile("templates/Dataservice1.dbs");
		String templateContent = FileUtils.getContentAsString(dsTemplateFile);
		templateContent = templateContent.replaceAll("\\{", "<");
		templateContent = templateContent.replaceAll("\\}", ">");
		templateContent = templateContent.replaceAll("<service.name>", dsModel.getServiceName());
		templateContent = templateContent.replaceAll("<service.group>",dsModel.getServiceGroup());
		templateContent = templateContent.replaceAll("<service.NS>",dsModel.getServiceNS());
		templateContent = templateContent.replaceAll("<service.description>",dsModel.getServiceDescription());
		templateContent = templateContent.replaceAll("<config.id>",dsModel.getDataSourceId());
		
		LinkedHashMap<String,String> config = dsModel.getDataSourceConfig().getConfig();
		Iterator<String> iterator = config.keySet().iterator();
		    while (iterator.hasNext()) {
		      String key = (String) iterator.next();
		      String property = "<property name=\""+ key + "\">" + config.get(key)+ "</property>\n";
		      properties += property;
		    }
		templateContent = templateContent.replaceAll("<config.properties>",properties);    
		
		IFolder dsfolder = project.getFolder("src/main/dataservice");
		File template = new File(dsfolder.getLocation().toFile(), dsModel.getServiceName()+ ".dbs");
		templateContent = XMLUtil.prettify(templateContent);
		templateContent = templateContent.replace("<?xml version=\"1.0\" encoding=\"UTF-8\"?>","");
		templateContent = templateContent.replaceAll("^"+eol,"");
		FileUtils.createFile(template,templateContent);
		return template;
	}

	
	public IResource getCreatedResource() {
		return project;
	}
	
	
	public void addPages() {
		newDataSourcepage = new NewDataSourceWizardPage();
		super.addPages();
		addPage(newDataSourcepage);
		pages = getPages();
	}
	
	
	public IWizardPage getNextPage(IWizardPage page) {
		IWizardPage nextPage = super.getNextPage(page);

		if(page instanceof ProjectOptionsDataPage ){
				if(getModel().getSelectedOption().equalsIgnoreCase("new.dsproject")){
					nextPage = newDataSourcepage;
				}
		}
		if(page instanceof NewDataSourceWizardPage){
			nextPage = pages[2];
		}
		if(page instanceof MavenDetailsPage ){
				nextPage=null;

		}
		return nextPage;
	}

	
	public IWizardPage getPreviousPage(IWizardPage page) {
		IWizardPage previousPage = super.getNextPage(page);
		if(page instanceof MavenDetailsPage ){
			if(getModel().getSelectedOption().equalsIgnoreCase("new.dsproject")){
				previousPage = newDataSourcepage;
			}
		}
		if(page instanceof NewDataSourceWizardPage){
			previousPage = pages[1];
		}
		return previousPage;
	}
	
	
	public boolean canFinish() {
		if(getContainer().getCurrentPage() instanceof ProjectOptionsDataPage){
			if(getModel().getSelectedOption().equalsIgnoreCase("new.dsproject")){
				return false;
			}
			else{
				return dsModel.getImportFile().exists();
			}
		} else if(getContainer().getCurrentPage() instanceof MavenDetailsPage) {
			return true;
		}
		return super.canFinish();
	}
	

}
