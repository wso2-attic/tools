package org.wso2.carbonstudio.eclipse.platform.ui.wizard;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Link;
import org.eclipse.swt.widgets.Text;
import org.wso2.carbonstudio.eclipse.maven.executor.MavenEnv;
import org.wso2.carbonstudio.eclipse.maven.types.MavenProjectType;
import org.wso2.carbonstudio.eclipse.maven.types.MavenUtils;
import org.wso2.carbonstudio.eclipse.platform.core.types.StringExtended;
import org.wso2.carbonstudio.eclipse.platform.ui.Activator;
import org.wso2.carbonstudio.eclipse.ui.wizard.SaveLocationOption;
import org.apache.maven.project.MavenProject;
import org.wso2.carbonstudio.eclipse.logging.core.ICarbonStudioLog;
import org.wso2.carbonstudio.eclipse.logging.core.Logger;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class NewWSO2ProjectPage extends WizardPage {
	private static ICarbonStudioLog log = Logger.getLog(Activator.PLUGIN_ID);

	private Text txtProjectName;
	private Text txtFileSystem;
	private StringExtended projectName;
	private SaveLocationOption saveOption = SaveLocationOption.WORKSPACE;
	private Button btnFileSystemBrowse;
	private Link lnkNewCMProject;
	private Combo cmbMultiModuleProject;
	private String saveOptionSelectedProject;
	private File saveOptionSelectedFileSystemPath;
	private MavenProjectType mavenParentProject;

	private IStructuredSelection selection;

	private Button btnCreateAsCMSubmodule;

	private Button btnCreateInFile;

	private Button btnCreateInWorkspace;
	private Composite customComposite;
	
	private String archeTypeId;
	private String archeTypeTemplate;
	private String archeTypeDefaultTemplate;
	private Combo cmbTemplateList;
	
	private String selectedArcheTypeTemplate;

	/**
	 * Create the wizard.
	 */
	public NewWSO2ProjectPage(StringExtended projectName,
			SaveLocationOption saveOption, MavenProjectType mavenParentProject, IStructuredSelection selection, String archeTypeId) {
		super("wizardPage");
		setTitle("New Foo Bar Project");
		setDescription("Basic foo bar project information page");
		setProjectName(projectName);
		setMavenParentProject(mavenParentProject);
		setSelection(selection);
		setArcheTypeId(archeTypeId);
	}

	/**
	 * Create contents of the wizard.
	 * 
	 * @param parent
	 */
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);

		setControl(container);
		GridLayout gl_container = new GridLayout(2, false);
		gl_container.marginWidth = 10;
		gl_container.verticalSpacing = 15;
		gl_container.horizontalSpacing = 20;
		container.setLayout(gl_container);

		Label lblProjectName = new Label(container, SWT.NONE);
		lblProjectName.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false,
				false, 1, 1));
		lblProjectName.setText("Project Name");

		txtProjectName = new Text(container, SWT.BORDER);
		txtProjectName.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent arg0) {
				getProjectName().value(txtProjectName.getText());
				updatePageStatus();
			}
		});
		txtProjectName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 1, 1));
		if (getProjectName().value() != null) {
			txtProjectName.setText(getProjectName().value());
		}
		Group grpLocation = new Group(container, SWT.NONE);
		grpLocation.setText("Location");
		GridLayout gl_grpLocation = new GridLayout(2, false);
		gl_grpLocation.verticalSpacing = 10;
		gl_grpLocation.marginHeight = 10;
		grpLocation.setLayout(gl_grpLocation);
		grpLocation.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false,
				false, 2, 1));

		btnCreateInWorkspace = new Button(grpLocation, SWT.RADIO);
		btnCreateInWorkspace.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				saveOption = SaveLocationOption.WORKSPACE;
				updateControlStatus();
			}
		});
		btnCreateInWorkspace.setSelection(true);
		btnCreateInWorkspace.setText("Create new project in workspace");
		new Label(grpLocation, SWT.NONE);

		btnCreateInFile = new Button(grpLocation, SWT.RADIO);
		btnCreateInFile.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				saveOption = SaveLocationOption.FILE_SYSTEM;
				updateControlStatus();
			}
		});
		btnCreateInFile.setText("Create new project in file system");

		new Label(grpLocation, SWT.NONE);

		Composite composite = new Composite(grpLocation, SWT.NONE);
		GridLayout gl_composite = new GridLayout(2, false);
		gl_composite.marginWidth = 0;
		gl_composite.verticalSpacing = 0;
		gl_composite.marginHeight = 0;
		composite.setLayout(gl_composite);
		composite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false,
				false, 2, 1));

		txtFileSystem = new Text(composite, SWT.BORDER);
		txtFileSystem.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent arg0) {
				setSaveOptionSelectedFileSystemPath(new File(txtFileSystem
						.getText()));
				updatePageStatus();
			}
		});
		txtFileSystem.setEnabled(false);
		GridData gd_txtFileSystem = new GridData(SWT.FILL, SWT.CENTER, true,
				false, 1, 1);
		gd_txtFileSystem.horizontalIndent = 40;
		txtFileSystem.setLayoutData(gd_txtFileSystem);
		txtFileSystem.setSize(267, 23);

		btnFileSystemBrowse = new Button(composite, SWT.NONE);
		btnFileSystemBrowse.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				DirectoryDialog directoryDialog = new DirectoryDialog(Display.getCurrent().getActiveShell());
				directoryDialog.setMessage("Select the location to create the new project");
				String directoryLocation = directoryDialog.open();
				if (directoryLocation!=null){
					txtFileSystem.setText(directoryLocation);
				}
			}
		});
		btnFileSystemBrowse.setEnabled(false);
		btnFileSystemBrowse.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER,
				false, false, 1, 1));
		btnFileSystemBrowse.setText("Browse...");
		btnCreateAsCMSubmodule = new Button(grpLocation, SWT.RADIO);
		btnCreateAsCMSubmodule.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				saveOption = SaveLocationOption.SUB_MODULE_PROJECT;
				updateControlStatus();
			}
		});
		btnCreateAsCMSubmodule
				.setText("Create new project as a sub-module of ");

		cmbMultiModuleProject = new Combo(grpLocation, SWT.READ_ONLY);
		cmbMultiModuleProject.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				handlerModuleProjectSelectionChanged();
			}
		});
		cmbMultiModuleProject.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent arg0) {
				handlerModuleProjectSelectionChanged();
			}
		});
		cmbMultiModuleProject.setEnabled(false);
		cmbMultiModuleProject.setLayoutData(new GridData(SWT.FILL, SWT.CENTER,
				true, false, 1, 1));

		loadCarbonModulesProjects();

		new Label(grpLocation, SWT.NONE);

		lnkNewCMProject = new Link(grpLocation, SWT.NONE);
		lnkNewCMProject.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER,
				false, false, 1, 1));
		lnkNewCMProject.setText("<a>Create a Carbon Modules Project...</a>");
		
		Group grpArcheType = new Group(container, SWT.NONE);
		GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1);
		
		if (isHideArcheTypeTemplateSection()){
			gridData.exclude=true;
		}else{
			setSelectedArcheTypeTemplate(getArcheTypeTemplate());
		}
		
		grpArcheType.setLayoutData(gridData);
		grpArcheType.setText("Arche Type");
		GridLayout gl_grpArcheType = new GridLayout(2, false);
		gl_grpArcheType.verticalSpacing = 10;
		gl_grpArcheType.horizontalSpacing = 20;
		grpArcheType.setLayout(gl_grpArcheType);
		
		Label lblArcheTypeTemplate = new Label(grpArcheType, SWT.NONE);
		lblArcheTypeTemplate.setText("Arche type template");
	
		cmbTemplateList = new Combo(grpArcheType, SWT.READ_ONLY);
		cmbTemplateList.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
				
		if (isHideArcheTypeTemplateSection()){
			cmbTemplateList.setEnabled(false);
		}else{
			cmbTemplateList.removeAll();
			Map<String, String> mavenTemplates = getMavenTemplates();
			List<String> templateIds=new ArrayList<String>();
			for (String templateId : mavenTemplates.keySet()) {
				cmbTemplateList.add(mavenTemplates.get(templateId));
				templateIds.add(templateId);
			}
			if (getArcheTypeDefaultTemplate()==null){
				cmbTemplateList.select(0);
				setSelectedArcheTypeTemplate(templateIds.get(0));
			}else{
				cmbTemplateList.setText(mavenTemplates.get(getArcheTypeDefaultTemplate()));
				setSelectedArcheTypeTemplate(getArcheTypeDefaultTemplate());
			}
		}
		
		customComposite = new Composite(container, SWT.NONE);
		customComposite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));


		initModelData();
		initControlData();
		
		updateControlStatus();
		updatePageStatus();
	}

	private boolean isHideArcheTypeTemplateSection() {
		return getArcheTypeTemplate()==null || getMavenTemplates().size()==0;
	}

	private Map<String, String> getMavenTemplates() {
		return MavenEnv.getExecutor().getMavenArcheTypeDefinition(getArcheTypeId()).getTemplateList();
	}

	private void initControlData() {
		btnCreateInWorkspace.setSelection(false);
		btnCreateInFile.setSelection(false);
		btnCreateAsCMSubmodule.setSelection(false);
		switch(saveOption){
			case WORKSPACE:
				btnCreateInWorkspace.setSelection(true);
				break;
			case FILE_SYSTEM:
				btnCreateInFile.setSelection(true);
				if (getSaveOptionSelectedFileSystemPath()!=null){
					txtFileSystem.setText(getSaveOptionSelectedFileSystemPath().toString());
				}
				break;
			case SUB_MODULE_PROJECT:
				btnCreateAsCMSubmodule.setSelection(true);
				if (getSaveOptionSelectedProject()!=null){
					cmbMultiModuleProject.setText(getSaveOptionSelectedProject());
				}
				break;
			default:
				btnCreateInWorkspace.setSelection(true);
				break;
		}
	}

	private void initModelData() {
		if (getSelectedCarbonModulesProject()!=null){
			saveOption=SaveLocationOption.SUB_MODULE_PROJECT;
			setSaveOptionSelectedProject(getSelectedCarbonModulesProject().getName());
		}
	}

	private void loadCarbonModulesProjects() {
		cmbMultiModuleProject.removeAll();
		IProject[] projects = ResourcesPlugin.getWorkspace().getRoot()
				.getProjects();
		for (IProject project : projects) {
			try {
				if (isCarbonModulesProject(project)) {
					cmbMultiModuleProject.add(project.getName());
				}
			} catch (CoreException e1) {
				log
						.error(
								"Error trying to determine if the project nature is present in the project",
								e1);
			}
		}
		if (cmbMultiModuleProject.getItemCount() > 0) {
			cmbMultiModuleProject.select(0);
			handlerModuleProjectSelectionChanged();
		}

	}

	private IProject getSelectedCarbonModulesProject(){
		if (getSelection()==null){
			return null; 
		}
		TreeSelection tree=(TreeSelection)selection;
		Object firstElement = tree.getFirstElement();
		try {
			if (firstElement!=null && firstElement instanceof IProject && isCarbonModulesProject((IProject)firstElement)){
				return (IProject)firstElement;
			}
		} catch (CoreException e) {
			log.error("Error while determining the project nature",e);
		}
		return null;
	}
	
	private boolean isCarbonModulesProject(IProject project)
			throws CoreException {
		return project
				.hasNature("org.wso2.carbonstudio.eclipse.carbonmodules.project.nature");
	}

	public void setProjectName(StringExtended projectName) {
		this.projectName = projectName;
	}

	public StringExtended getProjectName() {
		return projectName;
	}

	public void setSaveOption(SaveLocationOption saveOption) {
		this.saveOption = saveOption;
	}

	public SaveLocationOption getSaveOption() {
		return saveOption;
	}

	private void updateControlStatus() {
		boolean isFileSystem = getSaveOption() == SaveLocationOption.FILE_SYSTEM;
		boolean isSubModule = getSaveOption() == SaveLocationOption.SUB_MODULE_PROJECT;

		txtFileSystem.setEnabled(isFileSystem);
		btnFileSystemBrowse.setEnabled(isFileSystem);

		cmbMultiModuleProject.setEnabled(isSubModule);
		lnkNewCMProject.setEnabled(isSubModule);
		updatePageStatus();
	}

	public void setSaveOptionSelectedProject(String saveOptionSelectedProject) {
		this.saveOptionSelectedProject = saveOptionSelectedProject;
	}

	public String getSaveOptionSelectedProject() {
		return saveOptionSelectedProject;
	}

	public void setSaveOptionSelectedFileSystemPath(
			File saveOptionSelectedFileSystemPath) {
		this.saveOptionSelectedFileSystemPath = saveOptionSelectedFileSystemPath;
	}

	public File getSaveOptionSelectedFileSystemPath() {
		return saveOptionSelectedFileSystemPath;
	}

	public void setMavenParentProject(MavenProjectType mavenParentProject) {
		this.mavenParentProject = mavenParentProject;
	}

	public MavenProjectType getMavenParentProject() {
		return mavenParentProject;
	}

	private void updatePageStatus() {
		if (getProjectName().value() == null
				|| getProjectName().value().equals("")) {
			updatePageStatus("Specify a name for the project");
			return;
		} else if (ResourcesPlugin.getWorkspace().getRoot().getProject(
				getProjectName().value()).exists()) {
			updatePageStatus("A project named "
					+ getProjectName().value()
					+ " already exists in the workspace. Please use a different project name");
			return;
		}
		switch (saveOption) {
		case FILE_SYSTEM:
			if (getSaveOptionSelectedFileSystemPath() == null) {
				updatePageStatus("Specify a valid path to create the new project");
				return;
			}
			break;
		case SUB_MODULE_PROJECT:
			if (getSaveOptionSelectedProject() == null) {
				updatePageStatus("Please create/select the parent project to create the sub module from");
				return;
			}
			break;
		}
		updatePageStatus(null);
	}

	private void updatePageStatus(String msg) {
		setErrorMessage(msg);
		setPageComplete(msg == null);
	}

	private void handlerModuleProjectSelectionChanged() {
		if (!cmbMultiModuleProject.getText().equalsIgnoreCase("")) {
			setSaveOptionSelectedProject(cmbMultiModuleProject.getText());
			IProject project = ResourcesPlugin.getWorkspace().getRoot()
					.getProject(getSaveOptionSelectedProject());
			MavenProject mavenProject;
			try {
				mavenProject = MavenUtils.getMavenProject(project.getLocation()
						.append("pom.xml").toFile());
				getMavenParentProject().setGroupId(mavenProject.getGroupId());
				getMavenParentProject().setArtifactId(
						mavenProject.getArtifactId());
				getMavenParentProject().setVersion(mavenProject.getVersion());
			} catch (Exception e) {
				log.error(
						"Error while loading maven project data from project "
								+ project.getName(), e);
			}
			updatePageStatus();
		}
	}

	public void setSelection(IStructuredSelection selection) {
		this.selection = selection;
	}

	public IStructuredSelection getSelection() {
		return selection;
	}

	public void setArcheTypeId(String archeTypeId) {
		this.archeTypeId = archeTypeId;
	}

	public String getArcheTypeId() {
		return archeTypeId;
	}

	public void setArcheTypeDefaultTemplate(String archeTypeDefaultTemplate) {
		this.archeTypeDefaultTemplate = archeTypeDefaultTemplate;
	}

	public String getArcheTypeDefaultTemplate() {
		return archeTypeDefaultTemplate;
	}

	public void setArcheTypeTemplate(String archeTypeTemplate) {
		this.archeTypeTemplate = archeTypeTemplate;
	}

	public String getArcheTypeTemplate() {
		return archeTypeTemplate;
	}

	public void setSelectedArcheTypeTemplate(String selectedArcheTypeTemplate) {
		this.selectedArcheTypeTemplate = selectedArcheTypeTemplate;
	}

	public String getSelectedArcheTypeTemplate() {
		return selectedArcheTypeTemplate;
	}
}
