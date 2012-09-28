package org.wso2.developerstudio.eclipse.artifact.brs.ui.wizard;

import java.io.File;
import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.wso2.developerstudio.eclipse.artifact.brs.Activator;
import org.wso2.developerstudio.eclipse.artifact.brs.model.RuleServiceModel;
import org.wso2.developerstudio.eclipse.artifact.brs.utils.RuleServiceArtifactConstants;
import org.wso2.developerstudio.eclipse.artifact.brs.utils.RuleServiceImageUtils;
import org.wso2.developerstudio.eclipse.artifact.brs.utils.RuleServiceTemplateUtils;
import org.wso2.developerstudio.eclipse.logging.core.IDeveloperStudioLog;
import org.wso2.developerstudio.eclipse.logging.core.Logger;
import org.wso2.developerstudio.eclipse.platform.core.utils.XMLUtil;
import org.wso2.developerstudio.eclipse.platform.ui.wizard.AbstractWSO2ProjectCreationWizard;
import org.wso2.developerstudio.eclipse.platform.ui.wizard.pages.MavenDetailsPage;
import org.wso2.developerstudio.eclipse.platform.ui.wizard.pages.ProjectOptionsDataPage;
import org.wso2.developerstudio.eclipse.utils.file.FileUtils;
import org.wso2.developerstudio.eclipse.utils.jdt.JavaUtils;
import org.wso2.developerstudio.eclipse.utils.project.ProjectUtils;

public class ProjectCreationWizard extends AbstractWSO2ProjectCreationWizard {

	private static IDeveloperStudioLog log = Logger.getLog(Activator.PLUGIN_ID);
	private static final String PROJECT_WIZARD_WINDOW_TITLE = "Business Rules Service Project";
	private static final String FORM_EDITOR_TITLE = "service";
	private IProject project;
	private final RuleServiceModel rsModel;

	public ProjectCreationWizard() {
		this.rsModel = new RuleServiceModel();
		setModel(rsModel);
		setWindowTitle(PROJECT_WIZARD_WINDOW_TITLE);
		setDefaultPageImageDescriptor(RuleServiceImageUtils.getInstance()
				.getImageDescriptor("rule-service-create.gif"));
	}

	@Override
	public IResource getCreatedResource() {
		return project;
	}

	/*
	 * public void addPages(){
	 * super.addPages();
	 * //pages=getPages();
	 * }
	 */

	@Override
	public boolean performFinish() {
		File openFile = null;

		if (getModel().getSelectedOption().equals(RuleServiceArtifactConstants.WIZARD_OPTION_NEW_PROJECT)) {
			try {
				project = createNewProject();
				IFolder resourceFolder = ProjectUtils.getWorkspaceFolder(project, "src", "main", "java");
				JavaUtils.addJavaSupportAndSourceFolder(project, resourceFolder);
				IFolder ruleserviceFolder = ProjectUtils.getWorkspaceFolder(project, "src", "main", "ruleservice");
				if(!ruleserviceFolder.exists()){
					ruleserviceFolder.create(false, true, null);
				}
				IFolder confFolder = ProjectUtils.getWorkspaceFolder(project, "src", "main", "ruleservice","Conf");

				if(!confFolder.exists()){
					confFolder.create(false, true, null);
				}
				IFolder libFolder = ProjectUtils.getWorkspaceFolder(project, "src", "main", "ruleservice","lib");

				if(!libFolder.exists()){
					libFolder.create(false, true, null);
				}
				openFile = addBRSTemplate(project);
			} catch (CoreException e) {
				e.printStackTrace();
				MessageDialog.openQuestion(getShell(), "WARNING",
				"New project not created.");
			} catch (Exception e) {
				e.printStackTrace();
				MessageDialog.openQuestion(getShell(), "WARNING",
				"Template file not created.");
				log.error("An error occurred generating a project: ", e);
			}
		}
		else if (getModel().getSelectedOption().equals(RuleServiceArtifactConstants.WIZARD_OPTION_IMPORT_PROJECT)) {
			IProject existingProject =
				ResourcesPlugin.getWorkspace().getRoot()
				.getProject(rsModel.getProjectName());
			if (existingProject.exists()) {
				if (!MessageDialog.openQuestion(getShell(), "WARNING",
				"Do you like to override exsiting project in the workspace")) {
					return false;
				} else
					return true;
			}
			try {
				project = createNewProject();
				openFile = copyImportFile(project);
			} catch (CoreException e) {
				MessageDialog.openQuestion(getShell(), "WARNING",
				"New project not created.");
				e.printStackTrace();
			} catch (IOException e) {
				MessageDialog.openQuestion(getShell(), "WARNING",
				"File not imported");
				e.printStackTrace();
			}
		}


		try {
			File pomFile = project.getFile("pom.xml").getLocation().toFile();
			getModel().getMavenInfo().setPackageName("service/rule");
			createPOM(pomFile);
			ProjectUtils.addNatureToProject(project, false,
					RuleServiceArtifactConstants.RULE_SERVICE_PROJECT_NATURE_ID);
			getModel().addToWorkingSet(project);
			project.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
		} catch (CoreException e1) {
			e1.printStackTrace();
		}
		catch (Exception e1) {
			e1.printStackTrace();
			log.error("An error occurred generating a project: ", e1);
		}

		refreshDistProjects();
		IFile rslFile =
			ResourcesPlugin.getWorkspace()
			.getRoot()
			.getFileForLocation(Path.fromOSString(openFile.getAbsolutePath()));

		try {
			IDE.openEditor(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage(),
					rslFile);
		} catch (PartInitException e) {
			e.printStackTrace();
		}
		return true;
	}

	private File addBRSTemplate(IProject project) throws Exception {
		String eol = System.getProperty("line.separator");
		File ruleServiceTemplateFile =
			new RuleServiceTemplateUtils().getResourceFile("templates/schema.rsl");
		String templateContent = FileUtils.getContentAsString(ruleServiceTemplateFile);

		templateContent = templateContent.replaceAll("\\{", "<");
		templateContent = templateContent.replaceAll("\\}", ">");
		templateContent = templateContent.replaceAll("<service.name>", rsModel.getServiceName());
		templateContent = templateContent.replaceAll("<service.ns>", rsModel.getNameSpace());
		IFolder projetFolder = project.getFolder("src/main/ruleservice/META-INF");
		File template =
			new File(projetFolder.getLocation().toFile(),FORM_EDITOR_TITLE +
			".rsl");
		templateContent = XMLUtil.prettify(templateContent);
		templateContent = templateContent.replace(RuleServiceArtifactConstants.XML_ENCODING, "");
		templateContent = templateContent.replaceAll("^" + eol, "");
		//templateContent.trim();
		FileUtils.createFile(template, templateContent);
		return template;
	}

	public File copyImportFile(IProject importproject) throws IOException {
		File importFile = getModel().getImportFile();
		IFolder metaFolder = ProjectUtils.getWorkspaceFolder(importproject, "src", "main", "ruleservice","META-INF");
		File brsResourceFile =
			new File(metaFolder.getLocation().toFile(),
					importFile.getName());
		FileUtils.copy(importFile, brsResourceFile);
		return brsResourceFile;
	}

	@Override
	public boolean canFinish() {

		if (getContainer().getCurrentPage() instanceof ProjectOptionsDataPage) {
			if (getModel().getSelectedOption().equalsIgnoreCase(RuleServiceArtifactConstants.WIZARD_OPTION_NEW_PROJECT)) {
				return false;
			} else {
				return rsModel.getImportFile().exists();
			}
		} else if (getContainer().getCurrentPage() instanceof MavenDetailsPage) {
			return true;
		}
		return super.canFinish();
	}
}
