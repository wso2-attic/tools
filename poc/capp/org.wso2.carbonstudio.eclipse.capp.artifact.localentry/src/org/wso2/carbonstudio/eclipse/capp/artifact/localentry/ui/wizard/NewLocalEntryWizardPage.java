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

package org.wso2.carbonstudio.eclipse.capp.artifact.localentry.ui.wizard;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
import org.wso2.carbonstudio.eclipse.capp.artifact.localentry.Activator;
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

public class NewLocalEntryWizardPage extends WizardPage {
	private static ICarbonStudioLog log = Logger.getLog(Activator.PLUGIN_ID);

	private Text fileText;
	private Button optNewLocalEntry;
	WizardNewFileCreationPage wizard;
	private String fileName;
	private Label lblFromNew;
	private Button importLESource;
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
	private File localEntryFile;
	private String filePath;
	private Combo newLEType;
	private int localEntryOptionType;
	private String newLEFromSource;

	public String getNewLEFromSource() {
		return newLEFromSource;
	}

	public void setNewLEFromSource(String newLEFromSource) {
		this.newLEFromSource = newLEFromSource;
	}

	public int getLocalEntryOptionType() {
		return localEntryOptionType;
	}

	public void setLocalEntryOptionType(int leOptionType) {
		this.localEntryOptionType = leOptionType;
	}

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

	public NewLocalEntryWizardPage(
			WizardNewFileCreationPage wizardNewFileCreationPage,
			IProject currentProject) {
		super("wizardPage");
		setDescription("Select Local Entry Artifact");
		this.wizard = wizardNewFileCreationPage;
		this.selectedProject = currentProject;

	}

	public void createControl(Composite parent) {
		Group group = new Group(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		layout.verticalSpacing = 9;
		group.setLayout(layout);

		GridData gd = new GridData();
		gd.horizontalSpan = 3;

		Label lblFrom = new Label(group, SWT.NULL);
		lblFrom.setText("Create Local Entry Artifact from:");
		lblFrom.setLayoutData(gd);

		lblFromNew = new Label(group, SWT.NULL);
		lblFromNew.setText("&Name:");
		lblFromNew.setEnabled(false);

		fileText = new Text(group, SWT.BORDER | SWT.SINGLE);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		fileText.setLayoutData(gd);
		fileText.setText("localEntry1");
		setFileName(fileText.getText());
		fileText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				setFileName(fileText.getText());
				dialogChanged();
			}
		});
		fileText.setEnabled(false);

		new Label(group, SWT.NULL);

		optNewLocalEntry = new Button(group, SWT.RADIO);
		optNewLocalEntry.setText("New Local Entry Artifact");
		gd = new GridData();
		// gd.horizontalSpan=3;
		optNewLocalEntry.setLayoutData(gd);

		newLEType = new Combo(group, SWT.READ_ONLY);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		newLEType.setLayoutData(gd);
		loadNwLocalEntryTypes();
		newLEType.setEnabled(true);

		new Label(group, SWT.NULL);

		importLESource = new Button(group, SWT.RADIO);
		importLESource.setText("Import From a Source URL Entry");
		gd = new GridData();
		// gd.horizontalSpan=3;
		importLESource.setLayoutData(gd);

		final Text localEntrySourceText = new Text(group, SWT.BORDER);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		localEntrySourceText.setLayoutData(gd);
		localEntrySourceText.setEnabled(false);

		optNewLocalEntry.addSelectionListener((new SelectionListener() {
			public void widgetSelected(SelectionEvent e) {
				localEntrySourceText.setEnabled(false);
				newLEType.setEnabled(true);
				filePathText.setEnabled(false);
				pathButton.setEnabled(false);
				registryListDD.setEnabled(false);
				selectedPath.setEnabled(false);
				regPathButton.setEnabled(false);
				setOptionType(ArtifactFileUtils.OPTION_NEW);
				lblFromNew.setEnabled(true);
				fileText.setEnabled(true);
				if (fileText.getText() != null
						&& !fileText.getText().equals("")) {
					updateStatus(null);
				}
				disableEditorTableComponents();
			}

			public void widgetDefaultSelected(SelectionEvent e) {
				widgetSelected(e);
			}
		}));

		newLEType.addSelectionListener(new SelectionListener() {
			public void widgetSelected(SelectionEvent arg0) {
				if (newLEType.getText().equals("In-lined Text Entry")) {
					setLocalEntryOptionType(ArtifactFileUtils.IN_LINE_TEXT);
				} else {
					setLocalEntryOptionType(ArtifactFileUtils.IN_LINE_XML);
				}

			}

			public void widgetDefaultSelected(SelectionEvent arg0) {

			}
		});

		importLESource.addSelectionListener(new SelectionListener() {

			public void widgetSelected(SelectionEvent event) {
				boolean b = ((Button) (event.widget)).getSelection();
				if (b) {
					setLocalEntryOptionType(ArtifactFileUtils.ERROR_OPTION);
					setOptionType(ArtifactFileUtils.OPTION_SOURCE_URL);
					localEntrySourceText.setEnabled(true);
					newLEType.setEnabled(false);
					filePathText.setEnabled(false);
					pathButton.setEnabled(false);
					registryListDD.setEnabled(false);
					selectedPath.setEnabled(false);
					regPathButton.setEnabled(false);
					if (localEntrySourceText.getText() != null
							&& !localEntrySourceText.getText().equals("")) {
						try {
							if(validateSourceUrl(localEntrySourceText.getText())){
							    setNewLEFromSource(localEntrySourceText.getText());
							    updateStatus(null);
							}
							else {
								updateStatus("Specified URL is not valid");
							}
						} catch (Exception e) {
							updateStatus("Specified URL is not valid");
						}
					} else {
						setPageComplete(false);
					}
					disableEditorTableComponents();
				}
			}

			public void widgetDefaultSelected(SelectionEvent arg0) {

			}
		});

		localEntrySourceText.addModifyListener(new ModifyListener() {

			public void modifyText(ModifyEvent arg0) {
				try {
					if (validateSourceUrl(localEntrySourceText.getText())) {
						updateStatus(null);
						setNewLEFromSource(localEntrySourceText.getText());
					} else {
						setErrorMessage("Specified URL is not valid");
					}
				} catch (IOException e) {
					setErrorMessage("Specified URL is not valid");
				} catch (URISyntaxException e) {
					setErrorMessage("Specified URL is not valid");
				} catch (Exception e) {
					setErrorMessage("Path should be in the URL format");
				}

			}
		});

		Label hidLab3 = new Label(group, SWT.NULL);

		importFromFS = new Button(group, SWT.RADIO);
		importFromFS
				.setText("Import Local Entries from synapse.xml of the file system");
		gd = new GridData();
		gd.horizontalSpan = 3;
		// gd.horizontalIndent = 10;
		importFromFS.setLayoutData(gd);

		new Label(group, SWT.NULL);

		importFromFS.addSelectionListener(new SelectionListener() {

			public void widgetSelected(SelectionEvent event) {
				boolean b = ((Button) (event.widget)).getSelection();
				if (b) {
					setLocalEntryOptionType(ArtifactFileUtils.ERROR_OPTION);
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
					localEntrySourceText.setEnabled(false);

				} else {
					setOptionType(ArtifactFileUtils.ERROR_OPTION);
					filePathText.setEnabled(false);
					pathButton.setEnabled(false);
				}
			}

			public void widgetDefaultSelected(SelectionEvent event) {

			}
		});

		filePathText = new Text(group, SWT.BORDER);
		gd = new GridData();
		gd.heightHint = 18;
		gd.widthHint = 350;
		filePathText.setLayoutData(gd);
		filePathText.setEnabled(false);
		// try {
		// // wizInfoPers.addControl(filePathText, UIConstants.FILE_PATH);
		// } catch (IOException e1) {
		// e1.printStackTrace();
		// }

		gd = new GridData();
		gd.heightHint = 27;
		gd.widthHint = 70;
		pathButton = new Button(group, SWT.PUSH);
		pathButton.setText("Browse...");
		pathButton.setLayoutData(gd);
		pathButton.setEnabled(false);

		pathButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				handlePathBrowseButton(filePathText);
			}
		});

		filePathText.addModifyListener(new ModifyListener() {

			public void modifyText(ModifyEvent arg0) {
				if (handleFilePathText()) {
					setFilePath(filePathText.getText());
					editorTb.setVisible(false);
					componentsLabel.setVisible(false);
					selectAllButton.setVisible(false);
					deSelectAllButton.setVisible(false);
					loadDataForTable();
//					componentsLabel.setVisible(true);
//					editorTb.setVisible(true);
				} else {
					editorList = null;
					removeLocalEntryFromList();
					compCount = 0;
				}
			}
		});

		importFromRegistry = new Button(group, SWT.RADIO);
		importFromRegistry
				.setText("Import Local Entries from a synapse.xml of the registry");
		gd = new GridData(GridData.FILL_HORIZONTAL);
		// gd.horizontalIndent = 10;
		importFromRegistry.setLayoutData(gd);

		registryListDD = new Combo(group, SWT.READ_ONLY);
		gd = new GridData();
		gd.widthHint = 450;
		gd.horizontalSpan = 2;
		registryListDD.setLayoutData(gd);
		registryListDD.setEnabled(false);

		Label hidLab4 = new Label(group, SWT.NULL);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		hidLab3.setLayoutData(gd);

		gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan = 2;
		regPathButton = new Button(group, SWT.PUSH | SWT.LEFT);
		regPathButton.setText("Browse for Registry Resource");
		regPathButton.setLayoutData(gd);
		regPathButton.setEnabled(false);

		new Label(group, SWT.NULL);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		hidLab4.setLayoutData(gd);

		selectedPath = new Text(group, SWT.READ_ONLY | SWT.BORDER);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan = 2;
		selectedPath.setLayoutData(gd);
		selectedPath.setEnabled(false);

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

		if (CAppEnvironment.isRegistryHandlerPresent()) {
			registryConnections = getAvailableRegistryInstances(selectedProject);
		}

		loadComboData(registryConnections);

		importFromRegistry.addSelectionListener(new SelectionListener() {

			public void widgetSelected(SelectionEvent event) {
				boolean b = ((Button) (event.widget)).getSelection();
				if (b) {
					setLocalEntryOptionType(ArtifactFileUtils.ERROR_OPTION);
					setOptionType(ArtifactFileUtils.OPTION_IMPORT_REG);
					registryListDD.setEnabled(true);
					selectedPath.setEnabled(true);
					regPathButton.setEnabled(true);
					localEntrySourceText.setEnabled(false);
					disableEditorTableComponents();
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
							setComboSelectedIndex(registryListDD
									.getSelectionIndex() - 1);
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

		componentsLabel = new Label(group, SWT.NULL);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan = 3;
		gd.horizontalIndent = 30;
		componentsLabel.setText("Available Local Entries: ");
		componentsLabel.setLayoutData(gd);
		componentsLabel.setVisible(false);

		editorTb = new Table(group, SWT.BORDER | SWT.V_SCROLL | SWT.MULTI
				| SWT.FULL_SELECTION | SWT.CHECK);
		editorTb.setLinesVisible(true);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.heightHint = 50;
		gd.horizontalIndent = 50;
		gd.horizontalSpan = 3;
		editorTb.setLayoutData(gd);

		TableLayout tableLayout = new TableLayout();
		editorTb.setLayout(tableLayout);

		for (int i = 0; i < compCount; i++) {
			new TableItem(editorTb, SWT.NULL);
		}
		editorTb.setVisible(false);

		synapseConfElements = new ArrayList<OMElement>();
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

		selectAllButton = new Button(group, SWT.PUSH);
		selectAllButton.setText("Select All");
		gd = new GridData();
		gd.widthHint = 150;
		gd.heightHint = 27;
		gd.horizontalIndent = 60;
		selectAllButton.setVisible(false);
		selectAllButton.setLayoutData(gd);

		deSelectAllButton = new Button(group, SWT.PUSH);
		deSelectAllButton.setText("Deselect All");
		gd = new GridData();
		gd.widthHint = 150;
		gd.heightHint = 27;
		gd.horizontalIndent = 60;
		deSelectAllButton.setVisible(false);
		deSelectAllButton.setLayoutData(gd);

		selectAllButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				ArrayList<OMElement> tempMap = new ArrayList<OMElement>();
				// FIXED: Tools 332
				for (int i = 0; i < editorTb.getItems().length; i++) {
					TableItem item = editorTb.getItem(i);
					item.setChecked(true);
				}

				for (int i = 0; i < editorList.size(); i++) {
					OMElement element = editorList.get(i);
					if (!tempMap.contains(element))
						tempMap.add(element);
				}
				setSynapseConfElements(tempMap);
				//TOOLS-438
				setPageComplete(true);
			}
		});

		deSelectAllButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				for (int i = 0; i < editorTb.getItems().length; i++) {
					TableItem item = editorTb.getItem(i);
					item.setChecked(false);
				}
				ArrayList<OMElement> tempMap = new ArrayList<OMElement>();
				setSynapseConfElements(tempMap);
				//Fixing TOOLS-438
				setPageComplete(false);
			}
		});

		new Label(group, SWT.NULL);
		registryListDD.addModifyListener(new ModifyListener() {

			public void modifyText(ModifyEvent event) {
				setComboSelectedIndex(registryListDD.getSelectionIndex() - 1);
				if (registryConnections.size() == 0) {
					IRegistryConnection newRegistryConnection = CAppEnvironment
							.getRegistryHandler().createNewRegistryConnection(
									selectedProject, true);
					if (newRegistryConnection != null) {
						registryConnections.add(newRegistryConnection);
						registryListDD.add(newRegistryConnection.getCaption());
						registryListDD.select(registryConnections.size());
					}
				}
			}
		});

		registryListDD.addSelectionListener(new SelectionListener() {

			public void widgetSelected(SelectionEvent arg0) {
				if (registryListDD.getText().equals(
						"--create new registry instance--")) {
					IRegistryConnection newRegistryConnection = CAppEnvironment
							.getRegistryHandler().createNewRegistryConnection(
									selectedProject, true);
					if (newRegistryConnection != null) {
						registryConnections.add(newRegistryConnection);
						registryListDD.add(newRegistryConnection.getCaption());
						registryListDD.select(registryConnections.size());
					}
				}
				setComboSelectedIndex(registryListDD.getSelectionIndex() - 1);

			}

			public void widgetDefaultSelected(SelectionEvent arg0) {

			}
		});

		initialize();
		dialogChanged();
		setControl(group);
	}

	private boolean validateSourceUrl(String sourceUrl) throws IOException,
			URISyntaxException, Exception {
		sourceUrl = removeSpaces(sourceUrl);
		URI pathUri = new URI(sourceUrl);
		String p2 = pathUri.toURL().toString();
		URI uri2 = new URI(p2);
		String p3 = uri2.toASCIIString();
		URL path = new URL(p3);
		String filePath = path.getFile();
		File file = new File(filePath);
		if (file.isFile() && file.exists()) {
			return true;
		}
		path = pathUri.toURL();
		if (((HttpURLConnection) path.openConnection()).getResponseCode() == HttpURLConnection.HTTP_OK){
				return true;
		}
		
		return false;

	}

	private String removeSpaces(String url) {
		Pattern pattern = Pattern.compile("\\s+");
		Matcher matcher = pattern.matcher(url);
		matcher.find();
		String str = matcher.replaceAll("");
		return str;
	}

	public void loadNwLocalEntryTypes() {
		String[] newLocalEntryTypes = { "In-lined Text Entry",
				"In-lined XML Entry" };
		for (String localEntryType : newLocalEntryTypes) {
			newLEType.add(localEntryType);
		}
		if (newLEType.getSelectionIndex() == -1) {
			newLEType.select(0);
		}
		setLocalEntryOptionType(ArtifactFileUtils.IN_LINE_TEXT);
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

			localEntryFile = new File(tmpFolder, info[info.length - 1]);
			IRegistryData selectRegistryPathData = getSelectRegistryPathData();
			if (selectRegistryPathData == null) {
				throw new Exception(
						"Registry location to import the synapse.xml was not specified");
			}
			CAppEnvironment.getRegistryHandler()
					.importRegistryResourceToFileSystem(selectRegistryPathData,
							localEntryFile);
			setFilePath(localEntryFile.getPath());
			checkedOut = true;
		}
		setPageComplete(checkedOut);
		return checkedOut;
	}

	public void loadDataForTable() {
		try {
			editorList = SynapseFileUtils.synapseFileProcessing(
					getFilePath(), SynapseEntryType.LOCAL_ENTRY);
			compCount = editorList.size();
			if (editorList.isEmpty()) {
				removeLocalEntryFromList();
				String msg = "No local entries in the selected file..";
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
			String name = nameList[i].getAttributeValue(new QName("key"));
			item.setData(nameList[i]);
			item.setText(name);
			//Fixing TOOLS-438
			item.setChecked(true);
		}
	}

	public void removeLocalEntryFromList() {
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
		optNewLocalEntry.setSelection(true);
		fileText.setEnabled(true);
		lblFromNew.setEnabled(true);

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

	/**
	 * Disables the editor table and corresponding components when the selection
	 * is changed
	 */
	public void disableEditorTableComponents() {
		editorTb.removeAll();
		editorTb.setVisible(false);
		componentsLabel.setVisible(false);
		selectAllButton.setVisible(false);
		deSelectAllButton.setVisible(false);
	}
	
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
