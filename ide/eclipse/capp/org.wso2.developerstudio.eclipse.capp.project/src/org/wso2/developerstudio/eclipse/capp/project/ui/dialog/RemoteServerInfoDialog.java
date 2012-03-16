package org.wso2.developerstudio.eclipse.capp.project.ui.dialog;

import java.io.File;
import java.io.IOException;

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.wso2.developerstudio.eclipse.capp.project.utils.CAppUtils;
import org.wso2.developerstudio.eclipse.carbonserver.base.utils.CAppDeployer;
import org.wso2.developerstudio.eclipse.utils.file.FileUtils;

public class RemoteServerInfoDialog extends Dialog{

	private String serverUrl;
	private String userName;
	private String passwd;
	private IProject selectedProject;
	
	public RemoteServerInfoDialog(Shell parentShell, IProject selectedProject) {
		super(parentShell);
		this.selectedProject = selectedProject;
	}
	
	protected Control createDialogArea(Composite parent) {
		Composite container = new Composite(parent,SWT.None);
		GridLayout layout = new GridLayout();
		layout.numColumns = 1;
		container.setLayout(layout);
		Group group = new Group(container,SWT.None);
		group.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		layout = new GridLayout();
		layout.numColumns = 2;
		group.setLayout(layout);
		
		GridData gd = new GridData(GridData.FILL_HORIZONTAL
				| GridData.VERTICAL_ALIGN_FILL);
		container.setLayoutData(gd);

		gd=new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan=2;
		new Label(group,SWT.SEPARATOR|SWT.HORIZONTAL).setLayoutData(gd);
		
		Label urlLabel = new Label(group, SWT.NONE);
		GridData gd_urlLabel = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_urlLabel.widthHint = 100;
		urlLabel.setLayoutData(gd_urlLabel);
		urlLabel.setText("URL ");

		Text urlText = new Text(group, SWT.BORDER);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		urlText.setLayoutData(gd);
		new Label(group, SWT.NONE);
		
		Label exampleURLLabel = new Label(group, SWT.NULL);
		exampleURLLabel.setText("Example: https://localhost:9443\n                  https://localhost:9443/<context-root>");

		urlText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent event) {
				Text url = (Text) event.widget;
				serverUrl = url.getText();
				setServerUrl(serverUrl);
			}
		});
		
		urlText.setText("https://localhost:9443");
										
								
		Label userNameLabel = new Label(group, SWT.NONE);
		userNameLabel.setText("User Name: ");
		
		gd = new GridData();
		gd.heightHint = 18;
		gd.widthHint = 100;
		Text userNameText = new Text(group, SWT.BORDER);
		userNameText.setLayoutData(gd);
		userNameText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent event) {
				Text uName = (Text) event.widget;
				userName = uName.getText();
				setUserName(userName);
			}
		});
		userNameText.setText("admin");
		setUserName(userNameText.getText());
		
		Label pwdLabel = new Label(group, SWT.NONE);
		pwdLabel.setText("Password: ");
		
		gd = new GridData();
		gd.heightHint = 18;
		gd.widthHint = 100;
		Text pwdText = new Text(group, SWT.PASSWORD | SWT.BORDER);
		pwdText.setLayoutData(gd);
		pwdText.addModifyListener(new ModifyListener() {

			public void modifyText(ModifyEvent event) {
				Text pwd = (Text) event.widget;
				passwd = pwd.getText();
				setPasswd(passwd);

			}
		});
		pwdText.setText("admin");
		setPasswd(pwdText.getText());
		
		setServerUrl(urlText.getText());
		
		return super.createDialogArea(parent);
	}
	
	protected void okPressed() {
		File tempDir;
		try {
			tempDir = FileUtils.createTempDirectory();
			CAppDeployer cappDeployer = new CAppDeployer();
	        File carFile = CAppUtils.generateCAR(tempDir.getPath(), selectedProject, true);
			cappDeployer.deployCApp(getUserName(), getPasswd(), getServerUrl(), carFile);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		super.okPressed();
	}
	
	public String getServerUrl() {
		return serverUrl;
	}

	public void setServerUrl(String serverUrl) {
		this.serverUrl = serverUrl;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String pwd) {
		this.passwd = pwd;
	}

}
