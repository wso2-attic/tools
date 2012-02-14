package org.wso2.carbonstudio.eclipse.platform.ui.wizard.pages;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

import org.apache.maven.project.MavenProject;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Link;
import org.eclipse.swt.widgets.Text;
import org.wso2.carbonstudio.eclipse.maven.util.MavenUtils;
import org.wso2.carbonstudio.eclipse.platform.core.model.MavenInfo;
import org.wso2.carbonstudio.eclipse.platform.core.project.model.ProjectDataModel;

public class MavenDetailsPage extends WizardPage implements Observer {
	private Text txtGroupId;
	private Text txtVersion;
	private Text txtParentGroupId;
	private Text txtParentArtifactId;
	private Text txtParentVersion;
	private Label lblParentGroupId;
	private Label lblParentArtifactId;
	private Label lblParentVersion;
	private Link lnkLoadParentFrom;
	// private StringExtended artifactId;
	private Label lblArtifactIdValue;
	private Button btnNoMavenParent;
	private Combo parentProjectInfoCombo;

	// private MavenProjectType mavenProject;
	// private MavenProjectType mavenParentProject;

	// private boolean mavenParentProjectPresent;

	// private Group group;
	// private NewWSO2ProjectPage mainPage;

	private String parentGroupID;
	private String parentArtifactID;
	private String parentVersion;
	private String parentProjectName;
	private final ProjectDataModel dataModel;
	private final MavenInfo mavenProjectInfo;

	/**
	 * Create the wizard.
	 */
	public MavenDetailsPage(ProjectDataModel projectDataModel) {
		super("wizardPage");
		setTitle("Maven Information");
		setDescription("Maven information for the project");
		this.dataModel = projectDataModel;
		this.mavenProjectInfo = projectDataModel.getMavenInfo();
		dataModel.addObserver(this);
		// this.artifactId = artifactId;
		// this.mavenParentProject = mavenParentProject;
		// artifactId.addObserver(this);
		// mavenParentProject.addObserver(this);
	}

	/**
	 * Create contents of the wizard.
	 * 
	 * @param parent
	 */
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);

		container.setLayout(new GridLayout(1, false));

		final Group grpMaven = new Group(container, SWT.BORDER);
		grpMaven.setText("Maven Project");
		GridLayout gl_grpMaven = new GridLayout(2, false);
		gl_grpMaven.verticalSpacing = 10;
		gl_grpMaven.horizontalSpacing = 40;
		grpMaven.setLayout(gl_grpMaven);
		GridData gd_grpMaven = new GridData(GridData.FILL_HORIZONTAL);
		gd_grpMaven.heightHint = 200;

		grpMaven.setLayoutData(gd_grpMaven);

		Label lblNewLabel = new Label(grpMaven, SWT.NONE);
		lblNewLabel.setText("Group Id");

		txtGroupId = new Text(grpMaven, SWT.BORDER);
		txtGroupId.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent arg0) {
				mavenProjectInfo.setGroupId(txtGroupId.getText());
				dataModel.setMavenInfo(mavenProjectInfo);
				updatePageStatus();
			}
		});
		GridData gd_txtGroupId = new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1);
		gd_txtGroupId.widthHint = 257;
		txtGroupId.setLayoutData(gd_txtGroupId);

		Label lblArtifactId = new Label(grpMaven, SWT.NONE);
		lblArtifactId.setText("Artifact Id");

		lblArtifactIdValue = new Label(grpMaven, SWT.NONE);
		if (dataModel.getProjectName() != null) {
			lblArtifactIdValue.setText(dataModel.getProjectName());
			mavenProjectInfo.setArtifactId(dataModel.getProjectName());
			dataModel.setMavenInfo(mavenProjectInfo);
		} else {
			lblArtifactIdValue.setText("");
		}

		lblArtifactIdValue.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Label lblNewLabel_1 = new Label(grpMaven, SWT.NONE);
		lblNewLabel_1.setText("Version");

		txtVersion = new Text(grpMaven, SWT.BORDER);
		GridData gd_txtVersion = new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1);
		gd_txtVersion.widthHint = 257;
		txtVersion.setLayoutData(gd_txtVersion);

		txtVersion.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent arg0) {
				mavenProjectInfo.setVersion(txtVersion.getText());
				dataModel.setMavenInfo(mavenProjectInfo);
				updatePageStatus();
			}
		});

//		Button checkBox = new Button(grpMaven, SWT.CHECK);
//		checkBox.setText("Specify Parent");

//		parentProjectInfoCombo = new Combo(grpMaven, SWT.READ_ONLY);
//		GridData gd_parentProjectInfoCombo = new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1);
//		gd_parentProjectInfoCombo.widthHint = 414;
//		parentProjectInfoCombo.setLayoutData(gd_parentProjectInfoCombo);
//		new Label(grpMaven, SWT.NONE);
//
//		try {
//			loadParentProjectInfo();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		parentProjectInfoCombo.addModifyListener(new ModifyListener() {
//
//			public void modifyText(ModifyEvent arg0) {
//				setParentMavenInfo(parentProjectInfoCombo.getText());
//				MavenProject parentMavenProject =
//				        MavenUtils.createMavenProject(getParentGroupID(), getParentArtifactID(),
//				                                      getParentVersion(), "pom");
//				mavenProjectInfo.setParentProject(parentMavenProject);
//				dataModel.setMavenInfo(mavenProjectInfo);
//			}
//
//		});

//		Link lnkNewCMProject = new Link(grpMaven, SWT.NONE);
//		lnkNewCMProject.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
//		lnkNewCMProject.setText("<a>Create New Parent Project</a>");
//
//		lnkNewCMProject.addSelectionListener(new SelectionListener() {
//
//			
//			public void widgetSelected(SelectionEvent event) {
////				try {
////					Shell shell = grpMaven.getShell();
////					GeneralProjectWizard wizard = new GeneralProjectWizard()
////					ParentProjectInfoDialog dialog = new ParentProjectInfoDialog(shell, mavenProjectFile, getProject());
////					dialog.setBlockOnOpen(true);
////					dialog.create();
////					dialog.getShell().setSize(500, 200);
////					dialog.open();
////				} catch (CoreException e) {
////					e.printStackTrace();
////				} catch (IOException e) {
////					e.printStackTrace();
////				} catch (Exception e) {
////					e.printStackTrace();
////				}
//			}
//
//			
//			public void widgetDefaultSelected(SelectionEvent arg0) {
//
//			}
//		});

		setControl(container);
		updateMavenDetailsControls();
		updatePageStatus();
	}

	private void setParentMavenInfo(String parentProjectInfo) {
		String[] projectInfo = parentProjectInfo.split("(");
		if (projectInfo.length != 0) {
			setParentProjectName(projectInfo[0]);
			String[] mavenInfo = projectInfo[projectInfo.length - 1].split(">:<");
			setParentGroupID(mavenInfo[0].substring(1));
			setParentArtifactID(mavenInfo[1]);
			setParentVersion(mavenInfo[2].substring(0, mavenInfo[2].length() - 2));
		}

	}

	private void loadParentProjectInfo() throws Exception {
		String mavenInfo;
		List<MavenProject> parentMavenProjects =
		        getParentMavenProjects(new ArrayList<MavenProject>());
		for (MavenProject mavenProject : parentMavenProjects) {
			mavenInfo =
			        dataModel.getProjectName() + "(<" + mavenProject.getGroupId() + ">:<" +
			                mavenProject.getArtifactId() + ">:<" + mavenProject.getVersion() + ">)";
			parentProjectInfoCombo.add(mavenInfo);
		}

		if (parentProjectInfoCombo.getSelectionIndex() == -1) {
			parentProjectInfoCombo.select(0);
		}
	}

	private List<MavenProject> getParentMavenProjects(List<MavenProject> mavenParentProjects)
	        throws Exception {
		File parentLocation = dataModel.getLocation();
		while (parentLocation != null) {
			File pomFile = new File(parentLocation, "pom.xml");
			if (pomFile.exists()) {
				MavenProject mavenProject = MavenUtils.getMavenProject(pomFile);
				if (mavenProject.getPackaging().equals("pom")) {
					mavenParentProjects.add(mavenProject);
				}
			}
			parentLocation = parentLocation.getParentFile();
		}
		return mavenParentProjects;
	}

	private void updateMavenDetailsControls() {
		if (mavenProjectInfo != null) {
			String groupId = mavenProjectInfo.getGroupId();
			if (groupId != null && !groupId.equals("") && txtGroupId != null) {
				txtGroupId.setText(groupId);
			}

			String artifactId = mavenProjectInfo.getArtifactId();
			if (artifactId != null && !artifactId.equals("") && lblArtifactIdValue != null) {
				lblArtifactIdValue.setText(artifactId);
			}

			String version = mavenProjectInfo.getVersion();
			if (version != null && !version.equals("") && txtVersion != null) {
				txtVersion.setText(version);
			}
		}
		updateMavenParentControlState();
	}

	private void updateMavenParentControlState() {
		if (btnNoMavenParent != null) {
			boolean isNoParent = btnNoMavenParent.getSelection();
			lblParentGroupId.setEnabled(!isNoParent);
			txtParentGroupId.setEnabled(!isNoParent);
			lnkLoadParentFrom.setEnabled(!isNoParent);
			lblParentArtifactId.setEnabled(!isNoParent);
			txtParentArtifactId.setEnabled(!isNoParent);
			lblParentVersion.setEnabled(!isNoParent);
			txtParentVersion.setEnabled(!isNoParent);
		}
	}

	private void updatePageStatus() {
		if (mavenProjectInfo != null) {
			String groupId = mavenProjectInfo.getGroupId();
			if (groupId == null || groupId.equals("")) {
				updatePageStatus("Specify a group id for the maven project");
				return;
			}
			String version = mavenProjectInfo.getVersion();
			if (version == null || version.equals("")) {
				updatePageStatus("Specify a version for the maven project");
				return;
			}

			updatePageStatus(null);
		}

	}

	private void updatePageStatus(String msg) {
		setErrorMessage(msg);
		setPageComplete(msg == null);
	}

	public Combo getParentProjectInfoCombo() {
		return parentProjectInfoCombo;
	}

	public void setParentProjectInfoCombo(Combo parentProjectInfoCombo) {
		this.parentProjectInfoCombo = parentProjectInfoCombo;
	}

	public String getParentGroupID() {
		return parentGroupID;
	}

	public void setParentGroupID(String parentGroupID) {
		this.parentGroupID = parentGroupID;
	}

	public String getParentArtifactID() {
		return parentArtifactID;
	}

	public void setParentArtifactID(String parentArtifactID) {
		this.parentArtifactID = parentArtifactID;
	}

	public String getParentProjectName() {
		return parentProjectName;
	}

	public void setParentProjectName(String parentProjectName) {
		this.parentProjectName = parentProjectName;
	}

	public String getParentVersion() {
		return parentVersion;
	}

	public void setParentVersion(String parentVersion) {
		this.parentVersion = parentVersion;
	}

	
	public void update(Observable o, Object arg) {
		if (o == dataModel) {
			if (dataModel.getProjectName() != null) {
				setArtifactIDLabel();
			}
		}

	}

	public void setArtifactIDLabel() {
		if (dataModel.getProjectName() != null && !dataModel.getProjectName().equals("")) {
			MavenInfo newmavenProjectInfo=dataModel.getMavenInfo();	
			newmavenProjectInfo.setArtifactId(dataModel.getProjectName());
			txtGroupId.setText(newmavenProjectInfo.getGroupId());
			lblArtifactIdValue.setText(newmavenProjectInfo.getArtifactId());
			txtVersion.setText(newmavenProjectInfo.getVersion());
		}
	}
}
