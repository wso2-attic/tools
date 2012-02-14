package org.wso2.carbonstudio.eclipse.platform.ui.wizard;

import java.util.Observable;
import java.util.Observer;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Link;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.FilteredResourcesSelectionDialog;
import org.wso2.carbonstudio.eclipse.maven.types.MavenProjectType;
import org.wso2.carbonstudio.eclipse.platform.core.types.StringExtended;
import org.wso2.carbonstudio.eclipse.ui.wizard.SaveLocationOption;

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
	private StringExtended artifactId;
	private Label lblArtifactIdValue;

	private MavenProjectType mavenProject;
	private MavenProjectType mavenParentProject;

	private boolean mavenParentProjectPresent;
	private Button btnNoMavenParent;
	private NewWSO2ProjectPage mainPage;
	
	/**
	 * Create the wizard.
	 */
	public MavenDetailsPage(StringExtended artifactId,
			MavenProjectType mavenParentProject, NewWSO2ProjectPage mainPage) {
		super("wizardPage");
		setTitle("Maven Information");
		setDescription("Wizard Page description");
		this.artifactId = artifactId;
		this.mavenParentProject = mavenParentProject;
		artifactId.addObserver(this);
		mavenParentProject.addObserver(this);
		setMainPage(mainPage);
	}

	/**
	 * Create contents of the wizard.
	 * 
	 * @param parent
	 */
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);

		setControl(container);
		container.setLayout(new GridLayout(1, false));

		Group grpMaven = new Group(container, SWT.BORDER);
		grpMaven.setText("Maven Project");
		GridLayout gl_grpMaven = new GridLayout(2, false);
		gl_grpMaven.verticalSpacing = 10;
		gl_grpMaven.horizontalSpacing = 40;
		grpMaven.setLayout(gl_grpMaven);
		GridData gd_grpMaven = new GridData(GridData.FILL_HORIZONTAL);
		gd_grpMaven.heightHint = 107;

		grpMaven.setLayoutData(gd_grpMaven);

		Label lblNewLabel = new Label(grpMaven, SWT.NONE);
		lblNewLabel.setText("Group Id");

		txtGroupId = new Text(grpMaven, SWT.BORDER);
		txtGroupId.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent arg0) {
				getMavenProject().setGroupId(txtGroupId.getText());
				updatePageStatus();
			}
		});
		GridData gd_txtGroupId = new GridData(SWT.LEFT, SWT.CENTER, true,
				false, 1, 1);
		gd_txtGroupId.widthHint = 200;
		txtGroupId.setLayoutData(gd_txtGroupId);

		Label lblArtifactId = new Label(grpMaven, SWT.NONE);
		lblArtifactId.setText("Artifact Id");

		lblArtifactIdValue = new Label(grpMaven, SWT.NONE);
		lblArtifactIdValue.setText("ABC");
		lblArtifactIdValue.setLayoutData(new GridData(SWT.FILL, SWT.CENTER,
				true, false, 1, 1));
		if (artifactId.value()!=null){
			lblArtifactIdValue.setText(artifactId.value());
		}

		Label lblNewLabel_1 = new Label(grpMaven, SWT.NONE);
		lblNewLabel_1.setText("Version");

		txtVersion = new Text(grpMaven, SWT.BORDER);
		txtVersion.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent arg0) {
				getMavenProject().setVersion(txtVersion.getText());
				updatePageStatus();
			}
		});
		GridData gd_txtVersion = new GridData(SWT.LEFT, SWT.CENTER, true,
				false, 1, 1);
		gd_txtVersion.widthHint = 200;
		txtVersion.setLayoutData(gd_txtVersion);

		Group grpMavenParentProject = new Group(container, SWT.NONE);
		GridLayout gl_grpMavenParentProject = new GridLayout(1, false);
		gl_grpMavenParentProject.verticalSpacing = 10;
		gl_grpMavenParentProject.horizontalSpacing = 20;
		grpMavenParentProject.setLayout(gl_grpMavenParentProject);
		GridData gd_grpMavenParentProject = new GridData(SWT.FILL, SWT.CENTER,
				true, false, 1, 1);
		gd_grpMavenParentProject.exclude = true;
		gd_grpMavenParentProject.widthHint = 420;
		grpMavenParentProject.setLayoutData(gd_grpMavenParentProject);
		grpMavenParentProject.setText("Maven Parent");

		btnNoMavenParent = new Button(grpMavenParentProject,
				SWT.CHECK);
		btnNoMavenParent.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				updateMavenParentControlState();
				updatePageStatus();
			}
		});
		btnNoMavenParent.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true,
				false, 1, 1));
		btnNoMavenParent.setSelection(true);
		btnNoMavenParent.setText("Do not specify a maven parent");

		lnkLoadParentFrom = new Link(grpMavenParentProject, SWT.NONE);
		lnkLoadParentFrom.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int a = 10;
				if (e.text.equals("Worksapce")) {
					IAdaptable test;
					FilteredResourcesSelectionDialog resourceSelectionDialog = new FilteredResourcesSelectionDialog(
							getShell(), false, ResourcesPlugin.getWorkspace()
									.getRoot(), IResource.PROJECT);
					// resourceSelectionDialog.set
				}
				System.out.println(e.text);
			}
		});
		lnkLoadParentFrom.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER,
				true, false, 1, 1));
		lnkLoadParentFrom.setEnabled(false);
		lnkLoadParentFrom
				.setText("Fill in the maven parent details or select the parent maven project from <a>Workspace</a> or <a>File System</a>.");

		Composite composite = new Composite(grpMavenParentProject, SWT.NONE);
		composite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false,
				1, 1));
		GridLayout gl_composite = new GridLayout(2, false);
		gl_composite.marginWidth = 0;
		gl_composite.verticalSpacing = 10;
		gl_composite.horizontalSpacing = 40;
		composite.setLayout(gl_composite);

		lblParentGroupId = new Label(composite, SWT.NONE);
		lblParentGroupId.setEnabled(false);
		lblParentGroupId.setText("Group Id");

		txtParentGroupId = new Text(composite, SWT.BORDER);
		txtParentGroupId.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent arg0) {
				getMavenParentProject().setGroupId(txtParentGroupId.getText());
				updatePageStatus();
			}
		});
		txtParentGroupId.setEnabled(false);
		GridData gd_text_1 = new GridData(SWT.LEFT, SWT.CENTER, true, false, 1,
				1);
		gd_text_1.minimumWidth = 200;
		gd_text_1.widthHint = 200;
		txtParentGroupId.setLayoutData(gd_text_1);

		lblParentArtifactId = new Label(composite, SWT.NONE);
		lblParentArtifactId.setEnabled(false);
		lblParentArtifactId.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER,
				false, false, 1, 1));
		lblParentArtifactId.setText("Artifact Id");

		txtParentArtifactId = new Text(composite, SWT.BORDER);
		txtParentArtifactId.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent arg0) {
				getMavenParentProject().setArtifactId(
						txtParentArtifactId.getText());
				updatePageStatus();
			}
		});
		txtParentArtifactId.setEnabled(false);
		GridData gd_text_2 = new GridData(SWT.LEFT, SWT.CENTER, true, false, 1,
				1);
		gd_text_2.minimumWidth = 200;
		gd_text_2.widthHint = 200;
		txtParentArtifactId.setLayoutData(gd_text_2);

		lblParentVersion = new Label(composite, SWT.NONE);
		lblParentVersion.setEnabled(false);
		lblParentVersion.setText("Version");

		txtParentVersion = new Text(composite, SWT.BORDER);
		txtParentVersion.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent arg0) {
				getMavenParentProject().setVersion(txtParentVersion.getText());
				updatePageStatus();
			}
		});
		txtParentVersion.setEnabled(false);
		GridData gd_text_3 = new GridData(SWT.LEFT, SWT.CENTER, true, false, 1,
				1);
		gd_text_3.minimumWidth = 200;
		gd_text_3.widthHint = 200;
		txtParentVersion.setLayoutData(gd_text_3);
		updateMavenDetailsControls();
		updatePageStatus();
	}

	@Override
	public void update(Observable o, Object arg) {
		if (o == artifactId) {
			if (lblArtifactIdValue!=null){
				lblArtifactIdValue.setText(artifactId.value());
			}
			getMavenProject().setArtifactId(artifactId.value());
		}else if (o == mavenParentProject) {
			updateMavenDetailsControls();	
		}

	}

	private void updateMavenDetailsControls() {
		String groupId = getMavenProject().getGroupId();
		if (groupId!=null && !groupId.equals("") && txtGroupId!=null){
			txtGroupId.setText(groupId);
		}
		
		String artifactId = getMavenProject().getArtifactId();
		if (artifactId!=null && !artifactId.equals("") && lblArtifactIdValue!=null){
			lblArtifactIdValue.setText(artifactId);
		}
		
		String version = getMavenProject().getVersion();
		if (version!=null && !version.equals("") && txtVersion!=null){
			txtVersion.setText(version);
		}
		
		groupId = mavenParentProject.getGroupId();
		if (groupId!=null && !groupId.equals("") && txtParentGroupId!=null){
			txtParentGroupId.setText(groupId);
			if (txtGroupId!=null && txtGroupId.getText().equals("")){
				txtGroupId.setText(groupId);
			}
			if (btnNoMavenParent!=null) btnNoMavenParent.setSelection(false);
		}else{
			if (btnNoMavenParent!=null) btnNoMavenParent.setSelection(true);
		}
		
		artifactId = mavenParentProject.getArtifactId();
		if (artifactId!=null && !artifactId.equals("") && txtParentArtifactId!=null){
			txtParentArtifactId.setText(artifactId);
		}
		version = mavenParentProject.getVersion();
		if (version!=null && !version.equals("") && txtParentVersion!=null){
			txtParentVersion.setText(version);
		}
		updateMavenParentControlState();
	}

	
	public MavenProjectType getMavenParentProject() {
		if (mavenParentProject == null) {
			mavenParentProject = new MavenProjectType(null, null, null);
		}
		return mavenParentProject;
	}

	public MavenProjectType getMavenProject() {
		if (mavenProject == null) {
			mavenProject = new MavenProjectType(null, null, "1.0.0");
		}
		return mavenProject;
	}

	public void setMavenParentProjectPresent(boolean mavenParentProjectPresent) {
		this.mavenParentProjectPresent = mavenParentProjectPresent;
	}

	public boolean isMavenParentProjectPresent() {
//		return mavenParentProjectPresent;
		return mainPage.getSaveOption()==SaveLocationOption.SUB_MODULE_PROJECT;
	}
	
	private void updateMavenParentControlState() {
		if (btnNoMavenParent!=null){
			boolean isNoParent = btnNoMavenParent.getSelection();
			lblParentGroupId.setEnabled(!isNoParent);
			txtParentGroupId.setEnabled(!isNoParent);
			lnkLoadParentFrom.setEnabled(!isNoParent);
			lblParentArtifactId.setEnabled(!isNoParent);
			txtParentArtifactId.setEnabled(!isNoParent);
			lblParentVersion.setEnabled(!isNoParent);
			txtParentVersion.setEnabled(!isNoParent);
			setMavenParentProjectPresent(!isNoParent);
			
			if (getMainPage()!=null){
				boolean subModule=getMainPage().getSaveOption()==SaveLocationOption.SUB_MODULE_PROJECT;
				txtParentGroupId.setEditable(!subModule);
				txtParentArtifactId.setEditable(!subModule);
				txtParentVersion.setEditable(!subModule);
			}
		}
	}
	
	private void updatePageStatus() {
		String groupId = getMavenProject().getGroupId();
		if (groupId==null || groupId.equals("")){
			updatePageStatus("Specify a group id for the maven project");
			return;
		}
		String version = getMavenProject().getVersion();
		if (version==null || version.equals("")){
			updatePageStatus("Specify a version for the maven project");
			return;
		}
		if (isMavenParentProjectPresent()){
			groupId = getMavenParentProject().getGroupId();
			if (groupId==null || groupId.equals("")){
				updatePageStatus("Specify a group id for the maven parent project");
				return;
			}
			String artifactId = getMavenParentProject().getArtifactId();
			if (artifactId==null || artifactId.equals("")){
				updatePageStatus("Specify a artifact id for the maven parent project");
				return;
			}
			version = getMavenParentProject().getVersion();
			if (version==null || version.equals("")){
				updatePageStatus("Specify a version for the maven parent project");
				return;
			}
		}
		updatePageStatus(null);
	}
	
	private void updatePageStatus(String msg){
		setErrorMessage(msg);
		setPageComplete(msg==null);
	}

	public void setMainPage(NewWSO2ProjectPage mainPage) {
		this.mainPage = mainPage;
	}

	public NewWSO2ProjectPage getMainPage() {
		return mainPage;
	}
}
