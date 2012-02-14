package org.wso2.carbonstudio.eclipse.capp.project.ui.dialog;

import java.io.File;
import java.io.IOException;

import org.apache.maven.project.MavenProject;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.wso2.carbonstudio.eclipse.capp.core.artifacts.manager.CAppEnvironment;
import org.wso2.carbonstudio.eclipse.capp.core.manifest.Artifact;
import org.wso2.carbonstudio.eclipse.capp.maven.utils.MavenPomGenPluginUtils;
import org.wso2.carbonstudio.eclipse.maven.util.MavenUtils;

public class MavenProjectInfoDialog extends Dialog{
	private Text groupIDText;
	private Text artifactText;
	private Text versionText;
	private MavenProject selectedProject;
	private File propjectPom;
	private IProject eclipseProject;
	
	public String getGroupID() {
		return selectedProject.getGroupId();
	}

	public void setGroupID(String groupID) {
		selectedProject.setGroupId(groupID);
	}

	public String getArtifactID() {
		return selectedProject.getArtifactId();
	}

	public void setArtifactID(String artifactID) {
		selectedProject.setArtifactId(artifactID);
	}

	public String getVersion() {
		return selectedProject.getVersion();
	}

	public void setVersion(String version) {
		selectedProject.setVersion(version);
	}

	public MavenProjectInfoDialog(Shell parentShell, File projectPOM, IProject eclipseProject) throws CoreException, IOException, Exception {
		super(parentShell);
		generateMavenProject(projectPOM, eclipseProject);
	}

	private void generateMavenProject(File projectPOM, IProject eclipseProject)
			throws Exception, CoreException, IOException {
		setPropjectPom(projectPOM);
		setEclipseProject(eclipseProject);
		if (projectPOM.exists()){
			selectedProject=MavenUtils.getMavenProject(projectPOM);
			selectedProject=MavenUtils.createMavenProject(selectedProject.getGroupId(), selectedProject.getArtifactId(), selectedProject.getVersion(), selectedProject.getPackaging());
		}else{
			Artifact superArtifact = CAppEnvironment.getcAppManager().getSuperArtifact(eclipseProject);
			String groupId = "org.wso2.capp";
			String artifactId = superArtifact.getName()+".builder";
			String version = superArtifact.getVersion();
			String packagingType = "pom";
			selectedProject= MavenUtils.createMavenProject(groupId, artifactId, version, packagingType);
		}
	}
	
	protected Control createDialogArea(final Composite parent) {
		parent.getShell().setText("Maven Project Info");
		Composite container = (Composite) super.createDialogArea(parent);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		
		Group group = new Group(container, SWT.NONE);
		group.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		group.setLayout(new GridLayout(2, false));
		
		Label lblNewLabel = new Label(group, SWT.NONE);
		lblNewLabel.setText("Group ID");
		
		groupIDText = new Text(group, SWT.BORDER);
		groupIDText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		groupIDText.addModifyListener(new ModifyListener() {
			
			public void modifyText(ModifyEvent arg0) {
				setGroupID(groupIDText.getText());
			}
		});
		groupIDText.setText(getGroupID());
		
		Label lblArtifactId = new Label(group, SWT.NONE);
		lblArtifactId.setText("Artifact ID");
		
		artifactText = new Text(group, SWT.BORDER);
		artifactText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		
		artifactText.addModifyListener(new ModifyListener() {
			
			public void modifyText(ModifyEvent arg0) {
				setArtifactID(artifactText.getText());
			}
		});
		
		Label lblVersion = new Label(group, SWT.NONE);
		lblVersion.setText("Version");
		
		versionText = new Text(group, SWT.BORDER);
		GridData gd_versionText = new GridData(SWT.LEFT, SWT.CENTER, true, true, 1, 1);
		gd_versionText.widthHint = 124;
		versionText.setLayoutData(gd_versionText);
		
		versionText.addModifyListener(new ModifyListener() {
			
			public void modifyText(ModifyEvent arg0) {
				setVersion(versionText.getText());
			}
		});
		
		if(selectedProject!=null){
			updateInfo(selectedProject);
		}
		
		return super.createDialogArea(parent);
	}
	
	public void updateInfo(MavenProject project){
		groupIDText.setText(project.getGroupId());
		artifactText.setText(project.getArtifactId());
		versionText.setText(project.getVersion());
	}
	
	public boolean isValid(){
		if(getGroupID().equals("") || getGroupID()== null){
			return false;
		}
		
		if(getArtifactID().equals("") || getArtifactID() == null){
			return false;
		}
		
		if(getVersion().equals("") || getVersion() == null){
			return false;
		}
		return true;
	}
	
	protected void okPressed() {
		try {
			if (isValid()) {
				MavenPomGenPluginUtils.updateAndSaveMavenCAppProject(selectedProject,getEclipseProject(),getPropjectPom(),selectedProject.getArtifactId()+".parent");
				MessageDialog.openInformation(Display.getDefault().getActiveShell(),
											"Create Maven Project Configuration",
											"Successfully created maven project configuration");
				super.okPressed();
			}
		} catch (CoreException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	

	public void setPropjectPom(File propjectPom) {
		this.propjectPom = propjectPom;
	}

	public File getPropjectPom() {
		return propjectPom;
	}

	public void setEclipseProject(IProject eclipseProject) {
		this.eclipseProject = eclipseProject;
	}

	public IProject getEclipseProject() {
		return eclipseProject;
	}

}
