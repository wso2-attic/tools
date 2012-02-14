package org.wso2.carbonstudio.eclipse.esb.presentation.ui;

import java.io.File;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.wso2.carbonstudio.eclipse.capp.core.artifacts.manager.CAppEnvironment;
import org.wso2.carbonstudio.eclipse.logging.core.ICarbonStudioLog;
import org.wso2.carbonstudio.eclipse.logging.core.Logger;
import org.wso2.carbonstudio.eclipse.platform.core.templates.ArtifactTemplate;
import org.wso2.carbonstudio.eclipse.platform.core.templates.ArtifactTemplateHandler;
import org.wso2.carbonstudio.eclipse.utils.file.FileUtils;

public class NewResourceTemplateDialog extends Dialog {
	private static ICarbonStudioLog log = Logger
			.getLog("org.wso2.carbonstudio.eclipse.esb.editor");

	private Text txtResourceName;
	private Text txtRegistryPath;
	private ArtifactTemplate[] artifactTemplates;
	private List lstTemplates;
	private int emptyXmlFileTemplate;
	private int emptyTextFileTemplate;
	private String selectedPath;
	private Map<String, java.util.List<String>> filters;

	private Combo cmbProject;

	private Button btnOpenResourceOnce;

	/**
	 * Create the dialog.
	 * 
	 * @param parentShell
	 */
	public NewResourceTemplateDialog(Shell parentShell, Map<String, java.util.List<String>> filters) {
		super(parentShell);
		setFilters(filters);
	}

	/**
	 * Create contents of the dialog.
	 * 
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite container = (Composite) super.createDialogArea(parent);
		container.setLayout(new FormLayout());

		Label lblProject = new Label(container, SWT.NONE);
		FormData fd_lblProject = new FormData();
		fd_lblProject.top = new FormAttachment(0, 31);
		fd_lblProject.left = new FormAttachment(0, 10);
		lblProject.setLayoutData(fd_lblProject);
		lblProject.setText("Project");

		cmbProject = new Combo(container, SWT.READ_ONLY);
		cmbProject.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent arg0) {
				validate();
			}
		});
		FormData fd_cmbProject = new FormData();
		fd_cmbProject.left = new FormAttachment(lblProject, 16);
		fd_cmbProject.top = new FormAttachment(lblProject, -5, SWT.TOP);
		cmbProject.setLayoutData(fd_cmbProject);

		Label lblArtifactName = new Label(container, SWT.NONE);
		FormData fd_lblArtifactName = new FormData();
		fd_lblArtifactName.top = new FormAttachment(cmbProject, 22);
		fd_lblArtifactName.bottom = new FormAttachment(100, -137);
		fd_lblArtifactName.left = new FormAttachment(0, 10);
		lblArtifactName.setLayoutData(fd_lblArtifactName);
		lblArtifactName.setText("Resource file name");

		txtResourceName = new Text(container, SWT.BORDER);
		txtResourceName.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent arg0) {
				validate();
			}
		});
		txtResourceName.setText("NewResrouce");
		FormData fd_txtResourceName = new FormData();
		fd_txtResourceName.top = new FormAttachment(lblArtifactName, 6);
		fd_txtResourceName.right = new FormAttachment(cmbProject, 0, SWT.RIGHT);
		fd_txtResourceName.left = new FormAttachment(0, 32);
		txtResourceName.setLayoutData(fd_txtResourceName);

		Label lblRegistryPath = new Label(container, SWT.NONE);
		FormData fd_lblRegistryPath = new FormData();
		fd_lblRegistryPath.top = new FormAttachment(txtResourceName, 17);
		fd_lblRegistryPath.left = new FormAttachment(lblProject, 0, SWT.LEFT);
		lblRegistryPath.setLayoutData(fd_lblRegistryPath);
		lblRegistryPath.setText("Registry path");

		txtRegistryPath = new Text(container, SWT.BORDER);
		txtRegistryPath.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent arg0) {
				validate();
			}
		});
		txtRegistryPath.setText("/_system/config/myresrouces");
		FormData fd_txtRegistryPath = new FormData();
		fd_txtRegistryPath.top = new FormAttachment(lblRegistryPath, 6);
		fd_txtRegistryPath.left = new FormAttachment(lblProject, 22, SWT.LEFT);
		fd_txtRegistryPath.right = new FormAttachment(cmbProject, 0, SWT.RIGHT);
		txtRegistryPath.setLayoutData(fd_txtRegistryPath);

		Label label = new Label(container, SWT.SEPARATOR | SWT.VERTICAL);
		fd_lblArtifactName.right = new FormAttachment(label, -122);
		fd_cmbProject.right = new FormAttachment(label, -14);
		FormData fd_label = new FormData();
		fd_label.left = new FormAttachment(0, 250);
		fd_label.top = new FormAttachment(0, 10);
		fd_label.bottom = new FormAttachment(0, 198);
		label.setLayoutData(fd_label);

		lstTemplates = new List(container, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
		lstTemplates.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				updateResourceFileName();
			}
		});
		FormData fd_list = new FormData();
		fd_list.right = new FormAttachment(label, 182, SWT.RIGHT);
		lstTemplates.setLayoutData(fd_list);

		Label lblSelectTemplate = new Label(container, SWT.NONE);
		fd_label.right = new FormAttachment(lblSelectTemplate, -6);
		fd_list.top = new FormAttachment(lblSelectTemplate, 6);
		fd_list.left = new FormAttachment(lblSelectTemplate, 10, SWT.LEFT);
		FormData fd_lblSelectTemplate = new FormData();
		fd_lblSelectTemplate.top = new FormAttachment(0, 26);
		fd_lblSelectTemplate.left = new FormAttachment(0, 258);
		lblSelectTemplate.setLayoutData(fd_lblSelectTemplate);
		lblSelectTemplate.setText("Select template...");
		
		btnOpenResourceOnce = new Button(container, SWT.CHECK);
		fd_list.bottom = new FormAttachment(btnOpenResourceOnce, 0, SWT.BOTTOM);
		FormData fd_btnOpenResourceOnce = new FormData();
		fd_btnOpenResourceOnce.bottom = new FormAttachment(100, -10);
		fd_btnOpenResourceOnce.left = new FormAttachment(lblProject, 0, SWT.LEFT);
		btnOpenResourceOnce.setLayoutData(fd_btnOpenResourceOnce);
		btnOpenResourceOnce.setText("Open resource once created");
		loadCAppProjects();
		loadTemplateList();
		return container;
	}

	private void loadCAppProjects() {
		IProject[] projects = ResourcesPlugin.getWorkspace().getRoot()
				.getProjects();
		cmbProject.removeAll();
		for (IProject project : projects) {
			if (project.isOpen()
					&& CAppEnvironment.getcAppManager().isCAppProject(project)) {
				cmbProject.add(project.getName());
			}
		}
		if (cmbProject.getItemCount() > 0) {
			cmbProject.select(0);
		}
	}

	private void validate() {
		Button okButton = getButton(IDialogConstants.OK_ID);
		boolean okButtonState = true;
		if (cmbProject.getText() == null || cmbProject.getText().equals("")
				|| txtResourceName.getText().trim().equals("")
				|| txtRegistryPath.getText().trim().equals("")) {
			okButtonState = false;
		}
		if (okButton!=null){
			okButton.setEnabled(okButtonState);
		}
	}

	private void updateResourceFileName(){
		String resourceName = txtResourceName.getText();
		String resourceFileName = FileUtils.getResourceFileName(resourceName);
		String selectedTemplateExtension = getSelectedTemplateExtension();
		if (selectedTemplateExtension==null){
			txtResourceName.setText(resourceFileName);
		}else{
			txtResourceName.setText(resourceFileName+"."+selectedTemplateExtension);
		}
	}
	
	private String getSelectedTemplateExtension() {
		int selectionIndex = lstTemplates.getSelectionIndex();
		if (selectionIndex == emptyXmlFileTemplate) {
			return "xml";
		} else if (selectionIndex == emptyTextFileTemplate) {
			return "txt";
		} else {
			return artifactTemplates[selectionIndex].getDefaultExtension();
		}
	

	}
	
	private void loadTemplateList() {
		lstTemplates.removeAll();
		artifactTemplates = ArtifactTemplateHandler
				.getArtifactTemplates(getFilters());
		for (ArtifactTemplate artifactTemplate : artifactTemplates) {
			lstTemplates.add(artifactTemplate.getName());
		}
		emptyXmlFileTemplate = lstTemplates.getItemCount();
		lstTemplates.add("Empty XML file");
		emptyTextFileTemplate = lstTemplates.getItemCount();
		lstTemplates.add("Empty text file");

		lstTemplates.select(0);
		updateResourceFileName();
	}

	@Override
	protected void okPressed() {
		int selectionIndex = lstTemplates.getSelectionIndex();
		try {
			String templateString;
			if (selectionIndex == emptyXmlFileTemplate) {
				templateString = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
			} else if (selectionIndex == emptyTextFileTemplate) {
				templateString = "";
			} else {
				ArtifactTemplate esbArtifactTemplate = artifactTemplates[selectionIndex];
				templateString = FileUtils.getContentAsString(esbArtifactTemplate.getTemplateUrl());
			}
			String name = txtResourceName.getText();
			String resourceFileName = FileUtils.getResourceFileName(name);
			String content=MessageFormat.format(templateString,resourceFileName);
			File tempFile = new File(FileUtils.createTempDirectory(),name);
			tempFile.getParentFile().mkdirs();
			FileUtils.writeContent(tempFile, content);
			String projectName = cmbProject.getText();
			IProject project = ResourcesPlugin.getWorkspace().getRoot()
					.getProject(projectName);
			String path = txtRegistryPath.getText();
			CAppEnvironment.getRegistryHandler().createArtifact(project,
					resourceFileName, path, "EnterpriseServiceBus", 
					btnOpenResourceOnce.getSelection(), tempFile);
			path=path.endsWith("/")?path+name:path+"/"+name;
			setSelectedPath(path);
		} catch (IOException e) {
			log.error(e);
			MessageDialog.openError(getShell(), "Template creation", e
					.getMessage());
			return;
		} catch (CoreException e) {
			log.error(e);
			MessageDialog.openError(getShell(), "Resource creation", e
					.getMessage());
			return;
		} catch (Exception e) {
			log.error(e);
			MessageDialog.openError(getShell(), "Resource creation", e
					.getMessage());
			return;
		}
		super.okPressed();
	}

	/**
	 * Create contents of the button bar.
	 * 
	 * @param parent
	 */
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL,
				true);
		createButton(parent, IDialogConstants.CANCEL_ID,
				IDialogConstants.CANCEL_LABEL, false);
		validate();
	}

	/**
	 * Return the initial size of the dialog.
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(446, 304);
	}

	public void setSelectedPath(String selectedPath) {
		this.selectedPath = selectedPath;
	}

	public String getSelectedPath() {
		return selectedPath;
	}

	public void setFilters(Map<String, java.util.List<String>> filters) {
		this.filters = filters;
	}

	public Map<String, java.util.List<String>> getFilters() {
		return filters;
	}
}
