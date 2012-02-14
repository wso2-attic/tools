package org.wso2.carbonstudio.eclipse.artifacts.axis2.ui.wizard;

import java.io.File;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.model.BaseWorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;


public class Axis2SelectWSDLPage extends WizardPage {

	private Text text;
	private Text text_1;
	private Button button;
	private Button button_2;
	private ElementTreeSelectionDialog dialog;
	//This might not be needed
	private File wsdlFile;
	private DataModel model;

	@Override
	public boolean canFlipToNextPage() {
		return wsdlFile != null;
	}

	@Override
	public IWizardPage getNextPage() {

		model.setWsdlURI(wsdlFile.getAbsolutePath());
		// TODO Auto-generated method stub
		return super.getNextPage();
	}

	protected Axis2SelectWSDLPage(String pageName, DataModel model) {
		// Select WSDL
		super(pageName);
		setTitle(pageName);
		this.model = model;
	}

	@Override
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		setControl(container);

		Label lblNewLabel = new Label(container, SWT.NONE);
		lblNewLabel.setBounds(10, 10, 108, 17);
		lblNewLabel.setText("Select WSDL ");

		text = new Text(container, SWT.BORDER);
		text.setBounds(164, 49, 366, 27);

		button = new Button(container, SWT.NONE);
		button.setText("Browse...");
		button.setBounds(536, 45, 101, 35);
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				dialog = new ElementTreeSelectionDialog(button.getShell(),
						new WorkbenchLabelProvider(),
						new BaseWorkbenchContentProvider());
				dialog.setTitle("Tree Selection");
				dialog.setMessage("Select the elements from the tree:");
				dialog.setInput(ResourcesPlugin.getWorkspace().getRoot());
				dialog.addFilter(new ViewerFilter() {

					@Override
					public boolean select(Viewer viewer, Object parentElement,
							Object element) {
						if (element instanceof IProject) {
							return true;
						}
						if (element instanceof IFolder) {
							return true;
						}
						if (element instanceof IFile) {
							IFile file = (IFile) element;
							if ("wsdl".equals(file.getFileExtension())) {
								return true;
							}
						}
						return false;

					}
				});
				if (dialog.open() == dialog.OK) {
					IFile file = (IFile) dialog
							.getFirstResult();
					if(file.exists()){
						wsdlFile = new File(file.getRawLocation().toString());
					}

					if(wsdlFile != null && wsdlFile.exists()){
						text.setText(wsdlFile.getName());
						model.setWsdlURI(file.getRawLocation().toString());
						setPageComplete(true);
					}

				}
			}
		});

		Button btnBrowseWorkspace = new Button(container, SWT.RADIO);
		btnBrowseWorkspace.setText("Browse workspace");
		btnBrowseWorkspace.setBounds(10, 53, 148, 20);
		btnBrowseWorkspace.setSelection(true);
		btnBrowseWorkspace.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				button.setEnabled(true);
				text.setEnabled(true);
				button_2.setEnabled(false);
				text_1.setText("");
				text_1.setEnabled(false);
				setPageComplete(false);
				wsdlFile = null;
				model.setWsdlURI(null);
			}
		});

		Button btnBrowse = new Button(container, SWT.RADIO);
		btnBrowse.setText("Browse file system");
		btnBrowse.setBounds(10, 96, 148, 20);
		btnBrowse.setSelection(false);
		btnBrowse.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				button.setEnabled(false);
				text.setText("");
				text.setEnabled(false);
				button_2.setEnabled(true);
				text_1.setEnabled(true);
				setPageComplete(false);
				wsdlFile = null;
				model.setWsdlURI(null);
			}
		});

		text_1 = new Text(container, SWT.BORDER);
		text_1.setBounds(164, 92, 366, 27);
		text_1.setEnabled(false);

		button_2 = new Button(container, SWT.NONE);
		button_2.setText("Browse...");
		button_2.setBounds(536, 86, 101, 35);
		button_2.setEnabled(false);
		button_2.addSelectionListener(new SelectionAdapter() {
			// TODO put this code in a utililty class
			@Override
			public void widgetSelected(SelectionEvent e) {
				String fileName = null;
				FileDialog dlg = new FileDialog(getShell());
				dlg.setFilterExtensions(new String[] { "*.wsdl" });
				boolean done = false;

				while (!done) {
					// Open the File Dialog
					fileName = dlg.open();
					if (fileName == null) {
						// User has cancelled, so quit and return
						done = true;
					} else {
						// User has selected a file; see if it already exists
						wsdlFile = new File(fileName);
						if (wsdlFile.exists()) {
							// If they click Yes, we're done and we drop out. If
							// they click No, we redisplay the File Dialog
							done = true;
							text_1.setText(fileName);
							model.setWsdlURI(fileName);
							setPageComplete(true);
						} else {
							// File does not exist, so drop out
							done = false;
						}
					}
				}
			}
		});
	}

}
