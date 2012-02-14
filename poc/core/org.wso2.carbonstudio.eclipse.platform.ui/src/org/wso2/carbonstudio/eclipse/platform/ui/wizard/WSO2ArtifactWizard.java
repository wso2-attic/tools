package org.wso2.carbonstudio.eclipse.platform.ui.wizard;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import javax.xml.stream.FactoryConfigurationError;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.impl.builder.StAXOMBuilder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.intro.IIntroPart;
import org.osgi.framework.Bundle;
import org.wso2.carbonstudio.eclipse.logging.core.ICarbonStudioLog;
import org.wso2.carbonstudio.eclipse.logging.core.Logger;
import org.wso2.carbonstudio.eclipse.maven.executor.IMavenExecutor;
import org.wso2.carbonstudio.eclipse.maven.executor.MavenEnv;
import org.wso2.carbonstudio.eclipse.maven.types.MavenProjectType;
import org.wso2.carbonstudio.eclipse.platform.core.types.StringExtended;
import org.wso2.carbonstudio.eclipse.platform.ui.Activator;
import org.wso2.carbonstudio.eclipse.ui.wizard.ArtifactTemplateWizard;
import org.wso2.carbonstudio.eclipse.ui.wizard.SaveLocationOption;

public class WSO2ArtifactWizard extends Wizard implements INewWizard,
		IExecutableExtension {
	private static ICarbonStudioLog log = Logger.getLog(Activator.PLUGIN_ID);

	private StringExtended projectName = new StringExtended();
	private SaveLocationOption saveOption;
	private NewWSO2ProjectPage newWSO2ProjectPage;
	private MavenDetailsPage mavenDetailsPage;
	private ArtifactTemplateWizard artifactTemplateWizard;
	private IStructuredSelection selection;
	private IConfigurationElement configElement;

	public WSO2ArtifactWizard() {
		setWindowTitle("New Wizard");
	}

	@Override
	public void addPages() {
		MavenProjectType mavenParentProject = new MavenProjectType(null, null,
				null);
		mavenParentProject.setRelativePath("../../pom.xml");
		newWSO2ProjectPage = new NewWSO2ProjectPage(projectName, saveOption,
				mavenParentProject, selection,getArcheTypeId());
		newWSO2ProjectPage.setTitle(getWizardName());
		newWSO2ProjectPage
				.setDescription(getWizardDescription() == null ? "Specify artifact details"
						: getWizardDescription());
		newWSO2ProjectPage.setImageDescriptor(getWizardIcon());
		addPage(newWSO2ProjectPage);
		mavenDetailsPage = new MavenDetailsPage(projectName, mavenParentProject,newWSO2ProjectPage);
		mavenDetailsPage.setTitle(getWizardName());
		mavenDetailsPage.setDescription("Specify maven details");
		mavenDetailsPage.setImageDescriptor(getWizardIcon());
		addPage(mavenDetailsPage);
		if (hasSamplesForArtifactType(getArtifactType())){
			artifactTemplateWizard = new ArtifactTemplateWizard();
			artifactTemplateWizard.setTitle(getWizardName());
			artifactTemplateWizard
					.setDescription("Select templates to incorparate");
			artifactTemplateWizard.setImageDescriptor(getWizardIcon());
			addPage(artifactTemplateWizard);
		}
	}

	@Override
	public boolean performFinish() {
		try {
			IIntroPart intro = PlatformUI.getWorkbench().getIntroManager()
					.getIntro();
			if (intro != null) {
				PlatformUI.getWorkbench().getIntroManager().closeIntro(intro);
			}

			boolean inWorkspace = false;
			IProject parentProject = null;
			final IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace()
					.getRoot();
			File projectLocation = null;
			switch (newWSO2ProjectPage.getSaveOption()) {
			case WORKSPACE:
				inWorkspace = true;
				projectLocation = workspaceRoot.getLocation().append(
						projectName.value()).toFile();
				break;
			case FILE_SYSTEM:
				projectLocation = newWSO2ProjectPage
						.getSaveOptionSelectedFileSystemPath();
				break;
			case SUB_MODULE_PROJECT:
				String parentProjectName = newWSO2ProjectPage
						.getSaveOptionSelectedProject();
				parentProject = workspaceRoot.getProject(parentProjectName);
				if (parentProject
						.hasNature("org.wso2.carbonstudio.eclipse.carbonmodules.project.nature")) {
					projectLocation = parentProject.getLocation().append(
							"modules").append(projectName.value()).toFile();
				} else {
					projectLocation = parentProject.getLocation().append(
							projectName.value()).toFile();
				}
				break;
			}

			final IProject parent = parentProject;
			final MavenProjectType generatedProjectParameter = mavenDetailsPage
					.getMavenProject();
			final File projectCreateLocation = projectLocation;
			final boolean inWorkspaceClone = inWorkspace;
			ProgressMonitorDialog progressMonDialog = new ProgressMonitorDialog(
					Display.getCurrent().getActiveShell());
			progressMonDialog.run(true, false, new IRunnableWithProgress() {
				public void run(final IProgressMonitor monitor)
						throws InvocationTargetException, InterruptedException {
					try {
						if (getWizard() instanceof IWSO2ArtifactWizardExtension){
							((IWSO2ArtifactWizardExtension)getWizard()).preFinish(monitor);
						}
						monitor.beginTask("Creating New Project",
								IProgressMonitor.UNKNOWN);
						IMavenExecutor mavenExecutor = MavenEnv.getExecutor();
						String name = mavenExecutor.getMavenArcheTypeDefinition(getArcheTypeId()).getName();
						if (name==null){
							name="New Maven Project";
						}
						monitor.subTask("Executing "+name+" ArcheType");


						List<String> ideSettingsGoals = Arrays
								.asList("eclipse:eclipse");
						String archeTypeId = getArcheTypeId();
						String templateId = newWSO2ProjectPage.getSelectedArcheTypeTemplate();
						if (templateId==null){
							if (parent != null) {
								File parentProjectPom = parent.getFile("pom.xml")
										.getLocation().toFile();
								mavenExecutor.createArcheType(archeTypeId,
										generatedProjectParameter,
										projectCreateLocation, parentProjectPom);
							} else {
								mavenExecutor.createArcheType(archeTypeId,
										generatedProjectParameter,
										projectCreateLocation);
	
							}
						}else{
							// TODO, create the archetype depending on the selected template id
						}
						monitor.subTask("Running Maven Eclipse goal");
						if (mavenDetailsPage.isMavenParentProjectPresent()) {
							mavenExecutor.setMavenParent(projectCreateLocation,
									mavenDetailsPage.getMavenParentProject());
							mavenExecutor.executeMavenGoal(parent.getLocation()
									.toFile(), ideSettingsGoals, true);
						} else {
							mavenExecutor
									.removeMavenParent(projectCreateLocation);
							mavenExecutor.executeMavenGoal(
									projectCreateLocation, ideSettingsGoals,
									true);
						}
						IProject project;
						if (inWorkspaceClone) {
							project = workspaceRoot
									.getProject(projectName.value());
							monitor
									.subTask("Importing generated project to the workspace");
							project.create(null);
							project.open(null);
						} else {
							monitor
									.subTask("Importing generated project to the workspace");
							String projectName = getDetermineProjectName(projectCreateLocation);
							if (parent != null) {
								parent.refreshLocal(IResource.DEPTH_INFINITE,
										null);
							}
							project = workspaceRoot
									.getProject(projectName);
							IProjectDescription newProjectDescription = project
									.getWorkspace().newProjectDescription(
											project.getName());
							newProjectDescription
									.setLocationURI(projectCreateLocation
											.toURI());
							project.create(newProjectDescription, null);
							project.open(null);
						}
						monitor.subTask("Importing sub modules to the workspace");
						List<File> paths = new ArrayList<File>();
						addProjectPaths(projectCreateLocation, paths);
						for (File path : paths) {
							String projectName = getDetermineProjectName(path);
							IProject nestedProject = workspaceRoot
									.getProject(projectName);
							IProjectDescription newProjectDescription = nestedProject
									.getWorkspace().newProjectDescription(
											nestedProject.getName());
							newProjectDescription.setLocationURI(path.toURI());
							nestedProject.create(newProjectDescription, null);
							nestedProject.open(null);
						}
						if (getWizard() instanceof IWSO2ArtifactWizardExtension){
							((IWSO2ArtifactWizardExtension)getWizard()).postFinish(project,monitor);
						}
					} catch (FileNotFoundException e) {
						log.error("File cannot be found ", e);
					} catch (IOException e) {
						log.error(e);
					} catch (CoreException e) {
						log.error(e);
					} catch (FactoryConfigurationError e) {
						log.error(e);
					} catch (XMLStreamException e) {
						log.error(e);
					} catch (Exception e) {
						log.error(e);
					}

					monitor.done();
				}
			});
			return true;
		} catch (Exception e) {
			log.error(e);
			return false;
		}
	}

	private void addProjectPaths(File location, List<File> paths) {
		File[] locations = location.listFiles();
		if (locations != null) {
			for (File path : locations) {
				if (path.isDirectory()) {
					if (getEclipseProjectSettingsFile(path).exists()) {
						paths.add(path);
					}
					addProjectPaths(path, paths);
				}
			}
		}

	}

	private File getEclipseProjectSettingsFile(File path) {
		return new File(path, ".project");
	}

	private String getDetermineProjectName(File path)
			throws FileNotFoundException, FactoryConfigurationError,
			XMLStreamException {
		File eclipseProjectSettingsFile = getEclipseProjectSettingsFile(path);
		FileInputStream fis = new FileInputStream(eclipseProjectSettingsFile);
		XMLInputFactory xif = XMLInputFactory.newInstance();
		XMLStreamReader reader = xif.createXMLStreamReader(fis);
		StAXOMBuilder builder = new StAXOMBuilder(reader);
		OMElement lineItem = builder.getDocumentElement();
		Iterator childrenWithLocalName = lineItem
				.getChildrenWithLocalName("name");
		String projectName = path.getName();
		while (childrenWithLocalName.hasNext()) {
			OMElement next = (OMElement) childrenWithLocalName.next();
			projectName = next.getText();
		}
		return projectName;
	}

	@Override
	public void init(IWorkbench arg0, IStructuredSelection selection) {
		this.selection = selection;
	}

	@Override
	public void setInitializationData(IConfigurationElement configElement,
			String arg1, Object arg2) throws CoreException {
		this.configElement = configElement;
	}

	protected String getWizardId() {
		return configElement.getAttribute("id");
	}

	protected String getWizardName() {
		return configElement.getAttribute("name");
	}

	protected String getArcheTypeId() {
		return configElement.getAttribute("archeTypeId");
	}

	protected String getArtifactType() {
		return configElement.getAttribute("artifactType");
	}

	
	protected String getWizardDescription() {
		IConfigurationElement[] children = configElement
				.getChildren("description");
		if (children != null && children.length > 0) {
			return children[0].getValue();
		}
		return null;
	}
	
	private boolean hasSamplesForArtifactType(String artifactType){
		//TODO need to in-corparate this logic to have the samples page
		return false;
	}
	
	protected ImageDescriptor getWizardIcon(){
		String wizardIcon = configElement.getAttribute("wizardIcon");
		if (wizardIcon!=null){
			Bundle bundle = Platform.getBundle(configElement.getContributor().getName());
			if (bundle!=null){
				return ImageDescriptor.createFromURL(bundle.getResource(wizardIcon));
			}
		}
		return null;
	}
	
	private WSO2ArtifactWizard getWizard() {
		return this;
	}
}

	