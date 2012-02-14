/*
 * Copyright (c) 2010, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.carbonstudio.eclipse.capp.artifact.sequence.ui.wizard;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;

import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMException;
import org.eclipse.core.resources.IProject;
import org.eclipse.jface.viewers.TableLayout;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.wso2.carbonstudio.eclipse.capp.artifact.sequence.Activator;
import org.wso2.carbonstudio.eclipse.capp.core.artifacts.manager.CAppEnvironment;
import org.wso2.carbonstudio.eclipse.capp.core.utils.ArtifactFileUtils;
import org.wso2.carbonstudio.eclipse.esb.core.utils.SynapseEntryType;
import org.wso2.carbonstudio.eclipse.esb.core.utils.SynapseFileUtils;
import org.wso2.carbonstudio.eclipse.greg.core.interfaces.IRegistryConnection;
import org.wso2.carbonstudio.eclipse.greg.core.interfaces.IRegistryData;
import org.wso2.carbonstudio.eclipse.greg.core.interfaces.IRegistryHandler;
import org.wso2.carbonstudio.eclipse.logging.core.ICarbonStudioLog;
import org.wso2.carbonstudio.eclipse.logging.core.Logger;
import org.wso2.carbonstudio.eclipse.utils.file.FileUtils;

public class NewSequenceWizardPage extends WizardPage {
	private static ICarbonStudioLog log = Logger.getLog(Activator.PLUGIN_ID);

	private Text fileText;
	private Button optNewSequence;
	WizardNewFileCreationPage wizard;
	private String fileName;
	private Label lblFromNew;
	private Button importFromFS;
	private Button importFromRegistry;
	private Text filePathText;
	private Button pathButton;
	private Table editorTb;
	private int optionType = ArtifactFileUtils.OPTION_NEW;
	private List<OMElement> editorList;
	private int compCount = 0;
	private Button selectAllButton;
	private Button deSelectAllButton;
	private Label componentsLabel;
	private ArrayList<OMElement> synapseConfElements;
	private IProject selectedProject;
	private List<IRegistryConnection> registryConnections;
	private Combo registryListDD;
	private String selectedRegistry;
	private int comboSelectedIndex = -1;
	private String selectedRegResourcePath;
	private Text selectedPath;
	private Button regPathButton;
	private IRegistryData selectRegistryPathData;
	private File sequenceFile;
	private String filePath;
	private Button chkSequenceAsRegistryResource;
	private Combo txtRegistryPath;

	private boolean createAsRegistryResource = false;
	private String[] defaultRegistryPaths = new String[] { "/_system/config",
			"/_system/governance" };
	private String registryDeployPath = defaultRegistryPaths[0];
	private Group grpSequenceSource;

	public IRegistryData getSelectRegistryPathData() {
		return selectRegistryPathData;
	}

	public void setSelectRegistryPathData(IRegistryData selectRegistryPathData) {
		this.selectRegistryPathData = selectRegistryPathData;
	}

	public String getSelectedRegResourcePath() {
		return selectedRegResourcePath;
	}

	public void setSelectedRegResourcePath(String selectedRegResourcePath) {
		this.selectedRegResourcePath = selectedRegResourcePath;
	}

	public int getComboSelectedIndex() {
		return comboSelectedIndex;
	}

	public void setComboSelectedIndex(int comboSelectedIndex) {
		this.comboSelectedIndex = comboSelectedIndex;
	}

	public String getSelectedRegistry() {
		return selectedRegistry;
	}

	public void setSelectedRegistry(String selectedRegistry) {
		this.selectedRegistry = selectedRegistry;
	}

	public ArrayList<OMElement> getSynapseConfElements() {
		return synapseConfElements;
	}

	public void setSynapseConfElements(ArrayList<OMElement> synapseConfElements) {
		this.synapseConfElements = synapseConfElements;
	}

	public int getOptionType() {
		return optionType;
	}

	public void setOptionType(int optionType) {
		this.optionType = optionType;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public NewSequenceWizardPage(
			WizardNewFileCreationPage wizardNewFileCreationPage,
			IProject currentProject) {
		super("wizardPage");
		setDescription("Select Sequence Artifact");
		this.wizard = wizardNewFileCreationPage;
		this.selectedProject = currentProject;

	}

	public void createControl(Composite parent) {
		Group group = new Group(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		layout.verticalSpacing = 9;
		group.setLayout(layout);

		GridData gd = new GridData();
		gd.horizontalSpan = 2;


		lblFromNew = new Label(group, SWT.NULL);
		lblFromNew.setText("&Name:");
		lblFromNew.setEnabled(false);

		fileText = new Text(group, SWT.BORDER | SWT.SINGLE);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		fileText.setLayoutData(gd);
		fileText.setText("sequence");
		setFileName(fileText.getText());
		fileText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				setFileName(fileText.getText());
				dialogChanged();
			}
		});
		fileText.setEnabled(false);

		if (CAppEnvironment.isRegistryHandlerPresent()) {
			chkSequenceAsRegistryResource = new Button(group, SWT.CHECK);
			chkSequenceAsRegistryResource
					.addSelectionListener(new SelectionAdapter() {
						@Override
						public void widgetSelected(SelectionEvent e) {
							setCreateAsRegistryResource(chkSequenceAsRegistryResource
									.getSelection());
							txtRegistryPath
									.setVisible(isCreateAsRegistryResource());
						}
					});
			chkSequenceAsRegistryResource
					.setText("Create sequence as a registry resource");

			txtRegistryPath = new Combo(group, SWT.NONE);
			txtRegistryPath.addModifyListener(new ModifyListener() {
				public void modifyText(ModifyEvent arg0) {
					setRegistryDeployPath(txtRegistryPath.getText());
				}
			});
			txtRegistryPath.setLayoutData(new GridData(SWT.FILL, SWT.CENTER,
					true, false, 1, 1));
			loadDefaultRegistryDeployPaths();
		}

		grpSequenceSource = new Group(group, SWT.NONE);
		grpSequenceSource.setText("Create Sequence Artifact from");
		grpSequenceSource.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false,
				false, 2, 1));
		grpSequenceSource.setLayout(new GridLayout(4, false));

		optNewSequence = new Button(grpSequenceSource, SWT.RADIO);
		optNewSequence.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false,
				false, 4, 1));
		optNewSequence.setText("New Sequence Artifact");

		optNewSequence.addSelectionListener((new SelectionListener() {
			public void widgetSelected(SelectionEvent e) {
				setOptionType(ArtifactFileUtils.OPTION_NEW);
				lblFromNew.setEnabled(true);
				fileText.setEnabled(true);
				if (fileText.getText() != null
						&& !fileText.getText().equals("")) {
					updateStatus(null);
				}
			}

			public void widgetDefaultSelected(SelectionEvent e) {
				widgetSelected(e);
			}
		}));

		importFromFS = new Button(grpSequenceSource, SWT.RADIO);
		importFromFS.setText("Import Sequence from file system");

		importFromFS.addSelectionListener(new SelectionListener() {

			public void widgetSelected(SelectionEvent event) {
				boolean b = ((Button) (event.widget)).getSelection();
				if (b) {
					setOptionType(ArtifactFileUtils.OPTION_IMPORT_FS);
					filePathText.setEnabled(true);
					pathButton.setEnabled(true);
					compCount = 0;
					editorTb.removeAll();
					if (filePathText.getText() != null
							&& !filePathText.getText().equals("")) {
						setFilePath(filePathText.getText());
						loadDataForTable();
						updateStatus(null);
					} else {
						setPageComplete(false);
					}
					registryListDD.setEnabled(false);
					selectedPath.setEnabled(false);
					regPathButton.setEnabled(false);
				} else {
					setOptionType(ArtifactFileUtils.ERROR_OPTION);
					filePathText.setEnabled(false);
					pathButton.setEnabled(false);
				}
			}

			public void widgetDefaultSelected(SelectionEvent event) {

			}
		});

		filePathText = new Text(grpSequenceSource, SWT.BORDER);
		filePathText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 1, 1));
		filePathText.setEnabled(false);

		filePathText.addModifyListener(new ModifyListener() {

			public void modifyText(ModifyEvent arg0) {
				if (handleFilePathText()) {
					setFilePath(filePathText.getText());
					editorTb.setVisible(false);
					componentsLabel.setVisible(false);
					selectAllButton.setVisible(false);
					deSelectAllButton.setVisible(false);
					loadDataForTable();
					// componentsLabel.setVisible(true);
					// editorTb.setVisible(true);
				} else {
					editorList = null;
					removeSeqsFromList();
					compCount = 0;
				}
			}
		});
		pathButton = new Button(grpSequenceSource, SWT.PUSH);
		pathButton.setText("Browse...");
		pathButton.setEnabled(false);

		pathButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				handlePathBrowseButton(filePathText);
			}
		});
		new Label(grpSequenceSource, SWT.NONE);

		importFromRegistry = new Button(grpSequenceSource, SWT.RADIO);
		importFromRegistry.setLayoutData(new GridData(SWT.FILL, SWT.CENTER,
				false, false, 1, 1));
		importFromRegistry.setText("Import Sequence from registry");

		importFromRegistry.addSelectionListener(new SelectionListener() {

			public void widgetSelected(SelectionEvent event) {
				boolean b = ((Button) (event.widget)).getSelection();
				if (b) {
					setOptionType(ArtifactFileUtils.OPTION_IMPORT_REG);
					registryListDD.setEnabled(true);
					selectedPath.setEnabled(true);
					regPathButton.setEnabled(true);
					editorTb.removeAll();
					compCount = 0;
					if (selectedPath.getText() == null
							|| selectedPath.getText().equals("")) {
						setPageComplete(false);
					} else {
						updateStatus(null);
					}
					// if(selectedPath.getText()!= null &&
					// !selectedPath.getText().equals("")){
					// loadDataForTable();
					// }

					if (optionType == ArtifactFileUtils.OPTION_IMPORT_REG) {
						if (registryConnections.size() == 0) {
							IRegistryConnection newRegistryConnection = CAppEnvironment
									.getRegistryHandler()
									.createNewRegistryConnection(
											selectedProject, true);
							if (newRegistryConnection != null) {
								registryConnections.add(newRegistryConnection);
								registryListDD.add(newRegistryConnection
										.getCaption());
								registryListDD.select(registryConnections
										.size());
								setComboSelectedIndex(registryListDD
										.getSelectionIndex() - 1);
							}
						}
					}
					filePathText.setEnabled(false);
					pathButton.setEnabled(false);
				} else {
					setOptionType(ArtifactFileUtils.ERROR_OPTION);
				}
			}

			public void widgetDefaultSelected(SelectionEvent arg0) {

			}
		});

		registryListDD = new Combo(grpSequenceSource, SWT.READ_ONLY);
		registryListDD.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 1, 1));
		registryListDD.setEnabled(false);
		registryListDD.addModifyListener(new ModifyListener() {

			public void modifyText(ModifyEvent event) {
				if (optionType == ArtifactFileUtils.OPTION_IMPORT_REG) {
					setComboSelectedIndex(registryListDD.getSelectionIndex() - 1);
					if (registryConnections.size() == 0) {
						IRegistryConnection newRegistryConnection = CAppEnvironment
								.getRegistryHandler()
								.createNewRegistryConnection(selectedProject,
										true);
						if (newRegistryConnection != null) {
							registryConnections.add(newRegistryConnection);
							registryListDD.add(newRegistryConnection
									.getCaption());
							registryListDD.select(registryConnections.size());
						}
					}
				}
			}
		});

		registryListDD.addSelectionListener(new SelectionListener() {

			public void widgetSelected(SelectionEvent arg0) {
				if (optionType == ArtifactFileUtils.OPTION_IMPORT_REG) {
					if (registryListDD.getText().equals(
							"--create new registry instance--")) {
						IRegistryConnection newRegistryConnection = CAppEnvironment
								.getRegistryHandler()
								.createNewRegistryConnection(selectedProject,
										true);
						if (newRegistryConnection != null) {
							registryConnections.add(newRegistryConnection);
							registryListDD.add(newRegistryConnection
									.getCaption());
							registryListDD.select(registryConnections.size());
						}
					}
					setComboSelectedIndex(registryListDD.getSelectionIndex() - 1);
				}

			}

			public void widgetDefaultSelected(SelectionEvent arg0) {

			}
		});
		regPathButton = new Button(grpSequenceSource, SWT.PUSH );
		regPathButton.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false,
				false, 1, 1));
		regPathButton.setText("Browse...");
		regPathButton.setEnabled(false);

		regPathButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				editorTb.removeAll();
				compCount = 0;
				popUPRegistryBrowser();
				try {
					if (checkoutRegResource()) {
						loadDataForTable();
						componentsLabel.setVisible(true);
						editorTb.setVisible(true);
					}
				} catch (Exception e1) {
					e1.printStackTrace();
				}

			}
		});
		new Label(grpSequenceSource, SWT.NONE);
		new Label(grpSequenceSource, SWT.NONE);

		selectedPath = new Text(grpSequenceSource, SWT.READ_ONLY | SWT.BORDER);
		selectedPath.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false,
				false, 2, 1));
		selectedPath.setEnabled(false);
		new Label(grpSequenceSource, SWT.NONE);

		componentsLabel = new Label(grpSequenceSource, SWT.NULL);
		componentsLabel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false,
				false, 4, 1));
		componentsLabel.setText("Available Sequences: ");
		componentsLabel.setVisible(false);

		editorTb = new Table(grpSequenceSource, SWT.BORDER | SWT.V_SCROLL
				| SWT.MULTI | SWT.FULL_SELECTION | SWT.CHECK);
		editorTb.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false,
				4, 1));
		editorTb.setLinesVisible(true);
		TableLayout tableLayout = new TableLayout();
		editorTb.setLayout(tableLayout);
		editorTb.setVisible(false);
		editorTb.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event event) {

				if (event.detail == SWT.CHECK) {
					if (((org.eclipse.swt.widgets.TableItem) event.item)
							.getChecked() == true) {
						((org.eclipse.swt.widgets.TableItem) event.item)
								.getText();
						OMElement element = (OMElement) ((org.eclipse.swt.widgets.TableItem) event.item)
								.getData();
						if (!synapseConfElements.contains(element)) {
							synapseConfElements.add(element);
						}

					} else {
						((org.eclipse.swt.widgets.TableItem) event.item)
								.getText();
						OMElement element = (OMElement) ((org.eclipse.swt.widgets.TableItem) event.item)
								.getData();
						if (synapseConfElements.contains(element)) {
							synapseConfElements.remove(element);
						}
					}

				}
				setSynapseConfElements(synapseConfElements);
				//Fixing TOOLS-438
				enablePageComplete();
			}
		});

		selectAllButton = new Button(grpSequenceSource, SWT.PUSH);
		selectAllButton.setText("Select All");
		selectAllButton.setVisible(false);

		selectAllButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				ArrayList<OMElement> tempMap = new ArrayList<OMElement>();
				for (int i = 0; i < compCount; i++) {
					TableItem item = editorTb.getItem(i);
					item.setChecked(true);
				}

				for (int i = 0; i < editorList.size(); i++) {
					OMElement element = editorList.get(i);
					if (!tempMap.contains(element))
						tempMap.add(element);
				}
				setSynapseConfElements(tempMap);
				//Fixing TOOLS-438
				setPageComplete(true);
			}
		});

		deSelectAllButton = new Button(grpSequenceSource, SWT.PUSH);
		deSelectAllButton.setText("Deselect All");
		deSelectAllButton.setVisible(false);

		deSelectAllButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				for (int i = 0; i < compCount; i++) {
					TableItem item = editorTb.getItem(i);
					item.setChecked(false);
				}
				ArrayList<OMElement> tempMap = new ArrayList<OMElement>();
				setSynapseConfElements(tempMap);
				//Fixing  TOOLS-438
				setPageComplete(false);

			}
		});
		new Label(grpSequenceSource, SWT.NONE);
		new Label(grpSequenceSource, SWT.NONE);

		if (CAppEnvironment.isRegistryHandlerPresent()) {
			registryConnections = getAvailableRegistryInstances(selectedProject);
		}

		loadComboData(registryConnections);

		for (int i = 0; i < compCount; i++) {
			new TableItem(editorTb, SWT.NULL);
		}

		synapseConfElements = new ArrayList<OMElement>();

		initialize();
		dialogChanged();
		setControl(group);
	}

	private void loadDefaultRegistryDeployPaths() {
		txtRegistryPath.removeAll();
		for (String path : defaultRegistryPaths) {
			txtRegistryPath.add(path);
		}
		txtRegistryPath.setText(getRegistryDeployPath());
	}

	public boolean checkoutRegResource() throws Exception {
		boolean checkedOut = false;
		String resourceName = getSelectedRegResourcePath();
		if (resourceName != null) {
			String[] info = resourceName.split("/");
			File tmpFolder = null;
			try {
				tmpFolder = FileUtils.createTempDirectory();
				tmpFolder.delete();
				tmpFolder.mkdirs();
			} catch (IOException e) {
				log.error(e);
			}

			sequenceFile = new File(tmpFolder, info[info.length - 1]);
			IRegistryData selectRegistryPathData = getSelectRegistryPathData();
			if (selectRegistryPathData == null) {
				throw new Exception(
						"Registry location to import the synapse.xml was not specified");
			}
			CAppEnvironment.getRegistryHandler()
					.importRegistryResourceToFileSystem(selectRegistryPathData,
							sequenceFile);
			setFilePath(sequenceFile.getPath());
			checkedOut = true;
		}
		setPageComplete(checkedOut);
		return checkedOut;
	}

	public void loadDataForTable() {
		try {
			editorList = SynapseFileUtils.synapseFileProcessing(getFilePath(),
					SynapseEntryType.SEQUENCE);
			compCount = editorList.size();
			if (editorList.isEmpty()) {
				removeSeqsFromList();
				String msg = "No sequences in the selected file..";
				setErrorMessage(msg);
				setPageComplete(msg == null);
				compCount = 0;
			} else {
				setErrorMessage(null);
				editorTb.setVisible(true);
				componentsLabel.setVisible(true);
				selectAllButton.setVisible(true);
				deSelectAllButton.setVisible(true);
				listEditors();
			}
		} catch (FileNotFoundException e1) {
			String msg = "Could not find given xml file.";
			setErrorMessage(msg);
			setPageComplete(msg == null);
		} catch (XMLStreamException e1) {
			String msg = "Syntax errors in the given xml file. See workspace log for more info.";
			setErrorMessage(msg);
			setPageComplete(msg == null);
		} catch (IOException e2) {
			String msg = "Could not find given xml file.";
			setErrorMessage(msg);
			setPageComplete(msg == null);
		} catch (OMException e2) {
			String msg = "Syntax errors in the given xml file. See workspace log for more info.";
			setErrorMessage(msg);
			setPageComplete(msg == null);
		} catch (Exception e2) {
			String msg = "Syntax errors in the given xml file. See workspace log for more info.";
			setErrorMessage(msg);
			setPageComplete(msg == null);
		}
	}

	public void popUPRegistryBrowser() {
		int index = getComboSelectedIndex();
		if (index == -1) {
			IRegistryConnection connection = CAppEnvironment
					.getRegistryHandler().createNewRegistryConnection(
							selectedProject, true);
			if (connection == null) {
				return;
			}
			registryListDD.add(connection.getCaption());
			registryConnections.add(connection);
			registryListDD.select(registryListDD.getItemCount() - 1);
		}
		index = getComboSelectedIndex();
		IRegistryConnection data = registryConnections.get(index);
		int type = IRegistryHandler.SELECTED_REGISTRY_RESOURCE;
		String title = "Browse registry for the synapse configuration";
		String message = "Select the path of the synapse configuration";
		try {
			selectRegistryPathData = CAppEnvironment.getRegistryHandler()
					.selectRegistryPath(new IRegistryConnection[] { data }, title,
							message, type);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (selectRegistryPathData != null) {
			setSelectRegistryPathData(selectRegistryPathData);
			setSelectedRegResourcePath(selectRegistryPathData.getPath());
			selectedPath.setText(getSelectedRegResourcePath());
		}
	}

	public String getSelectedPath() {
		return getSelectedRegResourcePath();
	}

	public void loadComboData(List<IRegistryConnection> connectionList) {
		registryListDD.add("--create new registry instance--");
		for (int i = 0; i < connectionList.size(); i++) {
			registryListDD.add(connectionList.get(i).getCaption());
		}

		if (registryListDD.getSelectionIndex() == -1) {
			if (connectionList.isEmpty()) {
				registryListDD.select(0);
			} else {
				registryListDD.select(1);
			}
			setComboSelectedIndex(registryListDD.getSelectionIndex() - 1);
		}
	}

	public List<IRegistryConnection> getAvailableRegistryInstances(
			IProject currentProject) {

		if (CAppEnvironment.isRegistryHandlerPresent()) {
			registryConnections = CAppEnvironment.getRegistryHandler()
					.getRegistryConnections(currentProject);
		}
		return registryConnections;
	}

	public int getSeqCount() {
		return editorList.size();
	}

	public void listEditors() {
		OMElement sList[] = null;
		if (compCount != 0) {
			sList = new OMElement[getSeqCount()];
			for (int i = 0; i < editorList.size(); i++) {
				sList[i] = editorList.get(i);
			}
			addTableItems(sList);
		}
	}

	public void addTableItems(OMElement[] nameList) {
		editorTb.removeAll();
		editorTb.setVisible(true);
		selectAllButton.setVisible(true);
		deSelectAllButton.setVisible(true);

		for (int i = 0; i < nameList.length; i++) {
			TableItem item = new TableItem(editorTb, SWT.NONE);
			String name = nameList[i].getAttributeValue(new QName("name"));
			item.setData(nameList[i]);
			if(name!=null && name.length()>0){
				item.setText(name);
			}
			else{
				String regPath = selectRegistryPathData.getPath();
				regPath =FileUtils.getResourceFileName(regPath.substring(regPath.lastIndexOf('/')+1));
				item.setText(regPath);
			}
			item.setChecked(true);
			if (!synapseConfElements.contains(nameList[i])) {
				synapseConfElements.add(nameList[i]);
			}
		}
	}

	public void removeSeqsFromList() {
		// seqLabel.setVisible(false);
		// editorTb.setVisible(false);
	}

	public boolean handleFilePathText() {
		boolean isPathValid = false;
		this.setFilePath(filePathText.getText());
		String msg = null;
		String ext = null;
		File file = new File(getFilePath());
		if (!file.exists()) {
			msg = "Invalid path specified";
			isPathValid = false;
		} else {
			if (getFilePath().contains(".")) {
				ext = getFilePath().substring(getFilePath().lastIndexOf('.'),
						getFilePath().length());

			} else {
				msg = "Invalid file specified";
			}
			if (ext != null) {
				if (!ext.equals(".xml")) {
					msg = "Synapse Configuration file should be with the extension of .xml. Please specify the correct synapse configuration file ";
					isPathValid = false;
				} else {
					isPathValid = true;
				}
			}
		}
		setErrorMessage(msg);
		setPageComplete(msg == null);
		return isPathValid;
	}

	public void handlePathBrowseButton(Text filePathText) {
		String fileName = getSavePath();
		if (fileName != null)
			filePathText.setText(fileName);
	}

	private String getSavePath() {
		String fileName = null;
		// FileDialog
		FileDialog fld = new FileDialog(this.getShell(), SWT.OPEN);
		fld.setFilterExtensions(new String[] { "*.xml" });
		boolean done = false;
		while (!done) {
			// Open the File Dialog
			fileName = fld.open();
			if (fileName == null) {
				// User has cancelled, so quit and return
				done = true;
			} else {
				// User has selected a file; see if it already exists
				File file = new File(fileName);
				if (file.exists()) {
					// If they click Yes, we're done and we drop out. If
					// they click No, we redisplay the File Dialog
					done = true;
				} else {
					// File does not exist, so drop out
					done = false;
				}
			}
		}
		return fileName;
	}

	private void initialize() {
		optNewSequence.setSelection(true);
		fileText.setEnabled(true);
		lblFromNew.setEnabled(true);
		if (txtRegistryPath != null) {
			txtRegistryPath.setVisible(isCreateAsRegistryResource());
		}
	}

	private void dialogChanged() {

		String fileName = getFileName();
		if (fileName == null || fileName.length() == 0) {
			updateStatus("File name must be specified");
			return;
		}
		if (fileName.replace('\\', '/').indexOf('/', 1) > 0) {
			updateStatus("File name must be valid");
			return;
		}
		if (ArtifactFileUtils.IsSpecialCharactersExist(fileName)) {
			updateStatus("Could not create artifacts with special characters");
			return;
		}

		updateStatus(null);
	}

	private void updateStatus(String message) {
		setErrorMessage(message);
		setPageComplete(message == null);
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		String f = wizard.getFileName();
		if (f == null || f.equals("") || f.equals(this.fileName)) {
			wizard.setFileName(fileName);
		}
		this.fileName = fileName;
	}

	public void setCreateAsRegistryResource(boolean createAsRegistryResource) {
		this.createAsRegistryResource = createAsRegistryResource;
	}

	public boolean isCreateAsRegistryResource() {
		return createAsRegistryResource;
	}

	public void setRegistryDeployPath(String registryDeployPath) {
		this.registryDeployPath = registryDeployPath;
	}

	public String getRegistryDeployPath() {
		return registryDeployPath;
	}
	
	/**
	 * This method is used to enable or disable the Next and Finish buttons based on the items selected or not. 
	 */
	public void enablePageComplete(){
		TableItem[] items=editorTb.getItems();
		boolean isComplete=false;
		for (TableItem tableItem : items) {
	        if(tableItem.getChecked()){
	        	isComplete = true;
	        	break;
	        }
        }
		setPageComplete(isComplete);
	}
}