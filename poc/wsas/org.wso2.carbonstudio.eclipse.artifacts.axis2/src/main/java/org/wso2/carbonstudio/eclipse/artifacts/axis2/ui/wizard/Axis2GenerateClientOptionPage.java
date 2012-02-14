package org.wso2.carbonstudio.eclipse.artifacts.axis2.ui.wizard;

import java.io.File;
import java.util.Observable;
import java.util.Observer;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.ui.wizards.NewContainerWizardPage;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class Axis2GenerateClientOptionPage extends NewContainerWizardPage
		implements Observer {
	private Text pomXmlLocationText;
	private Text sourceFolderText;
	private Button browsePomXmlButton;
	private Composite container2;
	// Might not need these
	private File pomFile;
	private IPackageFragmentRoot sourceFolder;

	private DataModel model;

	@Override
	public boolean canFlipToNextPage() {
		return pomFile != null || !sourceFolderText.getText().isEmpty()
				|| sourceFolder != null;
	}

	public File getPomFile() {
		return pomFile;
	}

	public IPackageFragmentRoot getSourceFolder() {
		return sourceFolder;
	}

	protected Axis2GenerateClientOptionPage(String pageName,
			IStructuredSelection selection, DataModel model) {
		// Web Service Client
		super(pageName);
		setTitle(pageName);
		this.model = model;

		IJavaElement jelem = getInitialJavaElement(selection);
		initContainerPage(jelem);
		// doStatusUpdate();

	}

	// ------ validation --------
	private void doStatusUpdate() {
		// status of all used components
		IStatus[] status = new IStatus[] { fContainerStatus };

		// the mode severe status will be displayed and the OK button
		// enabled/disabled.
		updateStatus(status);
	}

	@Override
	public void createControl(Composite parent) {

		initializeDialogUnits(parent);
		Composite mainContainer = new Composite(parent, SWT.NONE);

		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		mainContainer.setLayout(layout);

		Button radioButton1 = new Button(mainContainer, SWT.RADIO);
		GridData gd_radioButton1 = new GridData(SWT.LEFT, SWT.CENTER, false,
				false, 2, 1);
		gd_radioButton1.minimumWidth = 1;
		radioButton1.setLayoutData(gd_radioButton1);
		radioButton1.setSelection(true);
		radioButton1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Control[] children = container2.getChildren();
				for (int i = 0; i < children.length; i++) {
					children[i].setEnabled(true);
				}
				pomXmlLocationText.setText("");
				pomXmlLocationText.setEnabled(false);
				browsePomXmlButton.setEnabled(false);
				pomFile = null;
				sourceFolder = null;
				model.setGeneratedCodeLocation(null);
				model.setPomFileLocation(null);
				setPageComplete(false);
			}
		});
		// radioButton1.setBounds(5, 27, 385, 20);
		radioButton1
				.setText("Select src folder to contain the generated client");

		container2 = new Composite(mainContainer, SWT.NONE);
		GridData gd_container2 = new GridData(SWT.LEFT, SWT.CENTER, false,
				false, 2, 1);
		gd_container2.horizontalIndent = 5;
		gd_container2.widthHint = 580;
		container2.setLayoutData(gd_container2);
		GridLayout layout2 = new GridLayout();
		layout2.numColumns = 4;
		container2.setLayout(layout2);

		int nColumns = 3;

		// pick & choose the wanted UI components

		createContainerControls(container2, nColumns);
		new Label(container2, SWT.NONE);

		setControl(mainContainer);

		Dialog.applyDialogFont(mainContainer);

		Button radioButton2 = new Button(mainContainer, SWT.RADIO);
		radioButton2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Control[] children = container2.getChildren();
				for (int i = 0; i < children.length; i++) {
					children[i].setEnabled(false);
					sourceFolderText.setText("");
				}
				pomXmlLocationText.setEnabled(true);
				browsePomXmlButton.setEnabled(true);
				sourceFolder = null;
				pomFile = null;
				model.setGeneratedCodeLocation(null);
				model.setPomFileLocation(null);
				setPageComplete(false);
			}
		});
		radioButton2
				.setText("Select pom.xml to add wsdl data in order to call WSDL2Java");
		new Label(mainContainer, SWT.NONE);

		Composite composite = new Composite(mainContainer, SWT.NONE);
		GridData gd_composite = new GridData(SWT.LEFT, SWT.CENTER, true, false,
				2, 1);
		gd_composite.horizontalIndent = 5;
		gd_composite.widthHint = 594;
		composite.setLayoutData(gd_composite);
		composite.setBounds(28, 154, 587, 76);

		Label lblPomxml = new Label(composite, SWT.NONE);
		lblPomxml.setBounds(5, 10, 68, 17);
		lblPomxml.setText("pom.xml:");

		pomXmlLocationText = new Text(composite, SWT.BORDER);
		pomXmlLocationText.setBounds(99, 5, 364, 27);
		pomXmlLocationText.setEnabled(false);

		browsePomXmlButton = new Button(composite, SWT.NONE);
		browsePomXmlButton.setEnabled(false);
		browsePomXmlButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {

				String fileName = null;
				FileDialog dlg = new FileDialog(browsePomXmlButton.getShell());
				dlg.setFilterExtensions(new String[] { "pom.xml" });
				boolean done = false;

				while (!done) {
					// Open the File Dialog
					fileName = dlg.open();
					if (fileName == null) {
						// User has cancelled, so quit and return
						done = true;
					} else {
						// User has selected a file; see if it already exists
						pomFile = new File(fileName);
						if (pomFile != null && pomFile.exists()) {
							// If they click Yes, we're done and we drop out. If
							// they click No, we redisplay the File Dialog
							done = true;
							pomXmlLocationText.setText(fileName);
							model.setPomFileLocation(pomFile.getAbsolutePath());
							setPageComplete(true);
						} else {
							// File does not exist, so drop out
							done = false;
						}
					}
				}
			}
		});
		browsePomXmlButton.setBounds(468, 1, 115, 35);
		browsePomXmlButton.setText("Browse...");

		setSourceFolderText();
	}

	@Override
	protected int getMaxFieldWidth() {
		return convertWidthInCharsToPixels(50);
	}

	@Override
	protected IPackageFragmentRoot chooseContainer() {
		sourceFolder = super.chooseContainer();
		if (sourceFolder != null) {
			setSourceProperties();
		}
		return sourceFolder;
	}

	private void setSourceFolderText() {
		Control[] children = container2.getChildren();
		for (int i = 0; i < children.length; i++) {
			if (children[i] instanceof Text) {
				sourceFolderText = ((Text) children[i]);
				sourceFolderText.setText("");
				sourceFolderText.addModifyListener(new ModifyListener() {

					@Override
					public void modifyText(ModifyEvent e) {
						setSourceProperties();
					}
				});
			}
		}
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		((Axis2ClientGenerationWizard) this.getWizard())
				.getClientConfigurationPage().update();
	}

	private void setSourceProperties(){
		if (sourceFolder != null) {
			model.setSelectedProject(sourceFolder.getJavaProject().getProject());
			model.setGeneratedCodeLocation((sourceFolder.getJavaProject().getProject().getLocation()).toString()+ "/");
			model.setSourceFolder("src");
			setPageComplete(true);
		}
	}
}
