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

package org.wso2.carbonstudio.eclipse.capp.artifact.synapse.ui.wizard;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;

import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMException;
import org.eclipse.core.resources.IProject;
import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableLayout;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
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
import org.wso2.carbonstudio.eclipse.capp.artifact.synapse.Activator;
import org.wso2.carbonstudio.eclipse.capp.core.artifacts.manager.CAppEnvironment;
import org.wso2.carbonstudio.eclipse.capp.core.ui.utils.WizardInfoPersister;
import org.wso2.carbonstudio.eclipse.capp.core.utils.ArtifactFileUtils;
import org.wso2.carbonstudio.eclipse.esb.core.utils.SynapseEntryType;
import org.wso2.carbonstudio.eclipse.esb.core.utils.SynapseFileUtils;
import org.wso2.carbonstudio.eclipse.greg.core.interfaces.IRegistryConnection;
import org.wso2.carbonstudio.eclipse.greg.core.interfaces.IRegistryData;
import org.wso2.carbonstudio.eclipse.greg.core.interfaces.IRegistryHandler;
import org.wso2.carbonstudio.eclipse.logging.core.ICarbonStudioLog;
import org.wso2.carbonstudio.eclipse.logging.core.Logger;
import org.wso2.carbonstudio.eclipse.utils.file.FileUtils;

public class NewSynapseWizardPage extends WizardPage {
	private static ICarbonStudioLog log=Logger.getLog(Activator.PLUGIN_ID);

	private Text nameText;
	private Label fileNameLabel;
	private Button optNewSynapse;
	private Button optTemplateSynapse;
	private Button importFromFS;
	private Button importFromRegistry;
	private Text filePathText;
	private Button pathButton;
	WizardNewFileCreationPage wizard;
	private String fileName;
	private Table editorTb;
	private String filePath;
	private int optionType=ArtifactFileUtils.OPTION_TEMPLATE;
	private List<OMElement> editorList;
	private int compCount = 0;
	private Button selectAllButton;
	private Button deSelectAllButton;
	private Label componentsLabel;
	private ArrayList<OMElement> synapseConfElements;
	private final static String[] titles = { "Component", "Name", "Type" };
	private TableViewer viewer;
	private IProject selectedProject;
	private List<IRegistryConnection> registryConnections;
	private Combo registryListDD;
	private String selectedRegistry;
	private int comboSelectedIndex = -1;
	private String selectedRegResourcePath;
	private Text selectedPath;
	private Button regPathButton;
	private IRegistryData selectRegistryPathData;
	private File synapseFile;
	private Button splitSynapseCheck;
	
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


	public NewSynapseWizardPage(WizardNewFileCreationPage wizardNewFileCreationPage, IProject p) {
		super("wizardPage");
		setDescription("Select Synapse Configuration");
        this.wizard=wizardNewFileCreationPage;
        this.selectedProject = p;

	}


	public void createControl(Composite parent) {
		new WizardInfoPersister();
		
		Group group = new Group(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		layout.verticalSpacing = 9;
		group.setLayout(layout);	
		
		GridData gd = new GridData();
		gd.horizontalSpan=3;
		
		fileNameLabel = new Label(group, SWT.NULL);
		fileNameLabel.setText("Name: ");
		
		nameText = new Text(group, SWT.BORDER | SWT.SINGLE);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan=2;
		nameText.setLayoutData(gd);
		nameText.setText("synapse");
		setFileName(nameText.getText());
		
		nameText.addModifyListener(new ModifyListener() {
			
			public void modifyText(ModifyEvent arg0) {
				setFileName(nameText.getText());
				dialogChanged();
			}
		});
		Label lblFrom ; 
		gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan=3;
		
		lblFrom = new Label(group, SWT.SEPARATOR | SWT.HORIZONTAL);
		lblFrom.setLayoutData(gd);
		
        optTemplateSynapse = new Button(group, SWT.RADIO);
        optTemplateSynapse.setText("Create Synapse Configuration from template");
        gd = new GridData();
        gd.horizontalSpan=3;
        gd.horizontalIndent = 10;
        optTemplateSynapse.setLayoutData(gd); 
        
		optTemplateSynapse.addSelectionListener((new SelectionListener() {
			
			public void widgetSelected(SelectionEvent event) {
				boolean b = ((Button) (event.widget)).getSelection();
				if(b){
					updateStatus(null);
					splitSynapseCheck.setSelection(false);
					splitSynapseCheck.setEnabled(false);
					componentsLabel.setEnabled(false);
					editorTb.setVisible(false);
					selectAllButton.setVisible(false);
					deSelectAllButton.setVisible(false);
					registryListDD.setEnabled(false);
					selectedPath.setEnabled(false);
					regPathButton.setEnabled(false);
					setOptionType(ArtifactFileUtils.OPTION_TEMPLATE);
				}else{
					setOptionType(ArtifactFileUtils.ERROR_OPTION);
				}

			}
			
			public void widgetDefaultSelected(SelectionEvent e) {
				widgetSelected(e);
			}
		}));
		
        optNewSynapse = new Button(group,SWT.RADIO);
                       
        optNewSynapse.setText("Create Empty Synapse Configuration");
        gd = new GridData();
        gd.horizontalSpan=3;
        gd.horizontalIndent = 10;
        optNewSynapse.setLayoutData(gd); 
                   
		optNewSynapse.addSelectionListener((new SelectionListener() {
			
			public void widgetSelected(SelectionEvent event) {
				boolean b = ((Button) (event.widget)).getSelection();
				if(b){
					updateStatus(null);
					splitSynapseCheck.setSelection(false);
					splitSynapseCheck.setEnabled(false);
					componentsLabel.setEnabled(false);
					editorTb.setVisible(false);
					selectAllButton.setVisible(false);
					deSelectAllButton.setVisible(false);
					registryListDD.setEnabled(false);
					selectedPath.setEnabled(false);
					regPathButton.setEnabled(false);
					setOptionType(ArtifactFileUtils.OPTION_NEW);
				}else{
					setOptionType(ArtifactFileUtils.ERROR_OPTION);
				}
			}
			
			public void widgetDefaultSelected(SelectionEvent e) {
				widgetSelected(e);
			}
		}));
		
		gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan=3;
		lblFrom = new Label(group, SWT.SEPARATOR | SWT.HORIZONTAL);
		lblFrom.setLayoutData(gd);
		
        importFromFS = new Button(group, SWT.RADIO);
        importFromFS.setText("Import synapse file from file system");
        gd = new GridData();
        gd.horizontalSpan=3;
        gd.horizontalIndent = 10;
        importFromFS.setLayoutData(gd);
        
        new Label(group, SWT.NULL);
        
        importFromFS.addSelectionListener(new SelectionListener() {
			
			public void widgetSelected(SelectionEvent event) {
				boolean b = ((Button) (event.widget)).getSelection();
				if(b){
					setOptionType(ArtifactFileUtils.OPTION_IMPORT_FS);
					filePathText.setEnabled(true);
					pathButton.setEnabled(true);
					splitSynapseCheck.setSelection(false);
					splitSynapseCheck.setEnabled(false);
					componentsLabel.setEnabled(false);
					editorTb.setVisible(false);
					selectAllButton.setVisible(false);
					deSelectAllButton.setVisible(false);
//					splitSynapseCheck.setEnabled(true);
					editorTb.removeAll();
					compCount=0;
					if(filePathText.getText() != null && !filePathText.getText().equals("")){
						setFilePath(filePathText.getText());
						updateStatus(null);
						if(isElementsExists()){
							loadDataForTable();
							componentsLabel.setEnabled(true);
							editorTb.setVisible(true);
							selectAllButton.setVisible(true);
							deSelectAllButton.setVisible(true);
							splitSynapseCheck.setSelection(true);
							splitSynapseCheck.setEnabled(true);
						}else{
							componentsLabel.setEnabled(false);
							editorTb.setVisible(false);
							editorList = null;
							removeSeqsFromList();
							compCount = 0;
							selectAllButton.setVisible(false);
							deSelectAllButton.setVisible(false);
						}
						
					}else{
						setPageComplete(false);
					}
					registryListDD.setEnabled(false);
					selectedPath.setEnabled(false);
					regPathButton.setEnabled(false);
				}
				else{
					setOptionType(ArtifactFileUtils.ERROR_OPTION);
					filePathText.setEnabled(false);
					pathButton.setEnabled(false);
				}
			}
			
			public void widgetDefaultSelected(SelectionEvent event) {
				
			}
		});
        
        filePathText = new Text(group, SWT.BORDER );
		gd = new GridData();
		gd.heightHint = 18;
		gd.widthHint = 350;
		filePathText.setLayoutData(gd);
		filePathText.setEnabled(false);
//		try {
////			wizInfoPers.addControl(filePathText, UIConstants.FILE_PATH);
//		} catch (IOException e1) {
//			e1.printStackTrace();
//		}

		gd = new GridData();
		gd.heightHint = 27;
		gd.widthHint = 70;
		pathButton = new Button(group,  SWT.PUSH);
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
					splitSynapseCheck.setEnabled(true);
					splitSynapseCheck.setSelection(false);
					componentsLabel.setEnabled(false);
//					loadDataForTable();
//					componentsLabel.setVisible(true);
					compCount = 0;
					editorTb.setVisible(false);
					selectAllButton.setVisible(false);
					deSelectAllButton.setVisible(false);
				} else {
//					editorTb.setVisible(false);
//					editorListMap = null;
//					removeSeqsFromList();
//					compCount = 0;
//					cCount = 0;
				}
			}
		});

		
		importFromRegistry = new Button(group, SWT.RADIO);
		importFromRegistry.setText("Import synapse file from registry");
        gd = new GridData(GridData.FILL_HORIZONTAL);
        gd.horizontalIndent = 10;
        importFromRegistry.setLayoutData(gd); 
        
        registryListDD = new Combo(group, SWT.READ_ONLY);
        gd = new GridData();
        gd.widthHint = 450;
        gd.horizontalSpan=2;
        registryListDD.setLayoutData(gd);
        registryListDD.setEnabled(false);
        
        Label hidLab3 = new Label(group, SWT.NULL);
        gd = new GridData(GridData.FILL_HORIZONTAL);
        hidLab3.setLayoutData(gd);
        
        gd = new GridData(GridData.FILL_HORIZONTAL);
        gd.horizontalSpan=2;
		regPathButton = new Button(group,  SWT.PUSH | SWT.LEFT);
		regPathButton.setText("Browse for Registry Resource");
		regPathButton.setLayoutData(gd);
		regPathButton.setEnabled(false);
		
        Label hidLab4 = new Label(group, SWT.NULL);
        gd = new GridData(GridData.FILL_HORIZONTAL);
        hidLab4.setLayoutData(gd);
		
        selectedPath = new Text(group, SWT.READ_ONLY | SWT.BORDER);
        gd = new GridData(GridData.FILL_HORIZONTAL);
        gd.horizontalSpan=2;
        selectedPath.setLayoutData(gd);
        selectedPath.setEnabled(false);
        
		regPathButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
//				editorTb.removeAll();
//				compCount=0;
//				cCount = 0;
				popUPRegistryBrowser();
				try {
					if(checkoutRegResource()){
//						loadDataForTable();
//						componentsLabel.setVisible(true);
//						editorTb.setVisible(true);
					}
				} catch (Exception e1) {
					e1.printStackTrace();
				}

			}
		});
        
        if(CAppEnvironment.isRegistryHandlerPresent()){
        	registryConnections = getAvailableRegistryInstances(selectedProject);
        }
        
        loadComboData(registryConnections);
        
        importFromRegistry.addSelectionListener(new SelectionListener() {
			
			public void widgetSelected(SelectionEvent event) {
				boolean b = ((Button) (event.widget)).getSelection();
				if(b){
					setOptionType(ArtifactFileUtils.OPTION_IMPORT_REG);
					registryListDD.setEnabled(true);
					selectedPath.setEnabled(true);
					regPathButton.setEnabled(true);
					splitSynapseCheck.setSelection(false);
					splitSynapseCheck.setEnabled(false);
					componentsLabel.setEnabled(false);
					editorTb.setVisible(false);
					selectAllButton.setVisible(false);
					deSelectAllButton.setVisible(false);
					editorTb.removeAll();
					compCount=0;
					if(selectedPath.getText()!= null && !selectedPath.getText().equals("")){
						if(synapseFile.exists()){
							updateStatus(null);
							setFilePath(synapseFile.getPath());
						}
						
						if(isElementsExists()){
							loadDataForTable();
							componentsLabel.setEnabled(true);
							editorTb.setVisible(true);
							selectAllButton.setVisible(true);
							deSelectAllButton.setVisible(true);
							splitSynapseCheck.setSelection(true);
							splitSynapseCheck.setEnabled(true);
						}else{
							splitSynapseCheck.setSelection(false);
							componentsLabel.setEnabled(false);
							editorTb.setVisible(false);
							editorList = null;
							removeSeqsFromList();
							compCount = 0;
							selectAllButton.setVisible(false);
							deSelectAllButton.setVisible(false);
						}
						
					}else{
						setPageComplete(false);
					}
					
					if(registryConnections.size() == 0 ){
						IRegistryConnection newRegistryConnection = CAppEnvironment.getRegistryHandler().createNewRegistryConnection(selectedProject, true);
						if (newRegistryConnection!=null){
	    					registryConnections.add(newRegistryConnection);
	    					registryListDD.add(newRegistryConnection.getCaption());
	    					registryListDD.select(registryConnections.size());
	    					setComboSelectedIndex(registryListDD.getSelectionIndex()-1);
						}
					}
						filePathText.setEnabled(false);
						pathButton.setEnabled(false);
				}
				else{
					setOptionType(ArtifactFileUtils.ERROR_OPTION);
				}
			}
			
			public void widgetDefaultSelected(SelectionEvent arg0) {
				
			}
		});
        
		gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan=3;
		lblFrom = new Label(group, SWT.SEPARATOR | SWT.HORIZONTAL);
		lblFrom.setLayoutData(gd);
		
		splitSynapseCheck = new Button(group, SWT.CHECK);
		splitSynapseCheck.setText("Select items of Synapse Configuration seperately");
		splitSynapseCheck.setEnabled(false);
	
		selectedPath.addModifyListener(new ModifyListener() {
			
			public void modifyText(ModifyEvent arg) {
				splitSynapseCheck.setEnabled(true);
				splitSynapseCheck.setSelection(false);
				componentsLabel.setEnabled(false);
				compCount = 0;
				editorTb.setVisible(false);
				selectAllButton.setVisible(false);
				deSelectAllButton.setVisible(false);
			}
		});
		
		componentsLabel = new Label(group, SWT.NULL);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan=3;
		gd.horizontalIndent = 30;
		componentsLabel.setText("Available Sequences, Proxy Services and End Points");
		componentsLabel.setLayoutData(gd);
		componentsLabel.setVisible(false);

		
		editorTb = new Table(group, 
							SWT.BORDER | 
							SWT.V_SCROLL | 
							SWT.MULTI | 
							SWT.FULL_SELECTION|
							SWT.CHECK);
		editorTb.setLinesVisible(true);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.heightHint = 50;
		gd.horizontalIndent = 50;
		gd.horizontalSpan=3;
		editorTb.setLayoutData(gd);
		
		TableLayout tableLayout = new TableLayout();
		editorTb.setLayout(tableLayout);

//		tableLayout.addColumnData(new ColumnWeightData(10, 100, true));
//		TableColumn column = new TableColumn(editorTb, SWT.NONE);
//		column.setText(titles[0]);
//		column.setAlignment(SWT.LEFT);
//
//		tableLayout.addColumnData(new ColumnWeightData(15, 50, true));
//		column = new TableColumn(editorTb, SWT.NONE);
//		column.setText(titles[1]);
//		column.setAlignment(SWT.LEFT);
//		
//		tableLayout.addColumnData(new ColumnWeightData(20, 50, true));
//		column = new TableColumn(editorTb, SWT.NONE);
//		column.setText(titles[2]);
//		column.setAlignment(SWT.LEFT);

//		viewer = new TableViewer(editorTb);
//		viewer.setColumnProperties(titles);
//		viewer.setContentProvider(new TableContentProvider());
//		viewer.setLabelProvider(new TableLabelProvider());
//
//		CellEditor[] editors = new CellEditor[3];
//		editors[0] = new CheckboxCellEditor(editorTb);
//		editors[1] = new TextCellEditor(editorTb);
//		editors[2] = new TextCellEditor(editorTb);
//		viewer.setCellEditors(editors);
//		viewer.setCellModifier(new TableCellModifier());
		
		for (int i = 0; i < compCount; i++) {
			new TableItem(editorTb, SWT.NULL);
		}
		editorTb.setVisible(false);
		
		splitSynapseCheck.addSelectionListener(new SelectionListener() {
			
			public void widgetSelected(SelectionEvent arg0) {
				if(splitSynapseCheck.getSelection()){
					setOptionType(ArtifactFileUtils.OPTION_SPLIT_SYNAPSE);
					editorTb.removeAll();
					compCount=0;
					if(isElementsExists()){
						loadDataForTable();
						componentsLabel.setEnabled(true);
						editorTb.setVisible(true);
						selectAllButton.setVisible(true);
						deSelectAllButton.setVisible(true);
					}else{
						splitSynapseCheck.setSelection(false);
						componentsLabel.setEnabled(false);
						editorTb.setVisible(false);
						editorList = null;
						removeSeqsFromList();
						compCount = 0;
						selectAllButton.setVisible(false);
						deSelectAllButton.setVisible(false);
					}

				}else{
					componentsLabel.setEnabled(false);
					editorTb.setVisible(false);
					editorList = null;
					removeSeqsFromList();
					compCount = 0;
				}
			}
			
			public void widgetDefaultSelected(SelectionEvent arg0) {
				
			}
		});
//		splitSynapseCheck.addListener(SWT.Selection, new Listener(){
//
//			public void handleEvent(Event event) {
//				if (event.detail == SWT.CHECK) {
//					editorTb.removeAll();
//					compCount=0;
//					cCount = 0;
//					loadDataForTable();
//					componentsLabel.setVisible(true);
//					editorTb.setVisible(true);
//				}else{
//					
//				}
//			}});
		
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
						if(!synapseConfElements.contains(element)){
							synapseConfElements.add(element);
						}
						
					}else{
						((org.eclipse.swt.widgets.TableItem) event.item)
										.getText();
						OMElement element = (OMElement) ((org.eclipse.swt.widgets.TableItem) event.item)
											.getData();
						if(synapseConfElements.contains(element)){
							synapseConfElements.remove(element);
						}
					}
						
				}
				setSynapseConfElements(synapseConfElements);
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
		
		deSelectAllButton  = new Button(group, SWT.PUSH);
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
			}
		});
		
		deSelectAllButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				for (int i = 0; i < compCount; i++) {
					TableItem item = editorTb.getItem(i);
					item.setChecked(false);
				}
				ArrayList<OMElement> tempMap = new ArrayList<OMElement>();
				setSynapseConfElements(tempMap);
				
			}
		});
		
		new Label(group, SWT.NULL);
        registryListDD.addModifyListener(new ModifyListener() {
			
			public void modifyText(ModifyEvent event) {
				setComboSelectedIndex(registryListDD.getSelectionIndex()-1);
				if(registryConnections.size() == 0 ){
					IRegistryConnection newRegistryConnection = CAppEnvironment.getRegistryHandler().createNewRegistryConnection(selectedProject, true);
					if (newRegistryConnection!=null){
    					registryConnections.add(newRegistryConnection);
    					registryListDD.add(newRegistryConnection.getCaption());
    					registryListDD.select(registryConnections.size());
					}
				}
			}
		});
        
        registryListDD.addSelectionListener(new SelectionListener() {
			
			public void widgetSelected(SelectionEvent arg0) {
				if(registryListDD.getText().equals("--create new registry instance--")){
					IRegistryConnection newRegistryConnection = CAppEnvironment.getRegistryHandler().createNewRegistryConnection(selectedProject, true);
					if (newRegistryConnection!=null){
    					registryConnections.add(newRegistryConnection);
    					registryListDD.add(newRegistryConnection.getCaption());
    					registryListDD.select(registryConnections.size());
					}
				}
				setComboSelectedIndex(registryListDD.getSelectionIndex()-1);
				
			}
			
			public void widgetDefaultSelected(SelectionEvent arg0) {
				
			}
		});
        
		initialize();
		dialogChanged();
		setControl(group);
	}
	
	public boolean isElementsExists(){
		try {
			editorList = SynapseFileUtils.synapseFileProcessing(getFilePath(),SynapseEntryType.ALL);
		} catch (FileNotFoundException e1) {
			String msg = "Could not find given xml file.";
			setErrorMessage(msg);
			setPageComplete(msg == null);
			return false;
		} catch (XMLStreamException e1) {
			String msg = "Syntax errors in the given xml file. See workspace log for more info.";
			setErrorMessage(msg);
			setPageComplete(msg == null);
			return false;
		} catch (IOException e2) {
			String msg = "Could not find given xml file.";
			setErrorMessage(msg);
			setPageComplete(msg == null);
			return false;
		}catch (OMException e2) {
			String msg = "Syntax errors in the given xml file. See workspace log for more info.";
			setErrorMessage(msg);
			setPageComplete(msg == null);
			return false;
		}catch (Exception e2) {
			String msg = "Syntax errors in the given xml file. See workspace log for more info.";
			setErrorMessage(msg);
			setPageComplete(msg == null);
			return false;
		}
		
		if(editorList.isEmpty()){
			String msg = "No sequences in the selected file..";
			setErrorMessage(msg);
			setPageComplete(msg == null);
			return false;
		}
		return true;
	}
	
	public void loadDataForTable(){
		try {
			editorList = SynapseFileUtils.synapseFileProcessing(getFilePath(),SynapseEntryType.ALL);
			List<OMElement> localEntryList=SynapseFileUtils.synapseFileProcessing(getFilePath(), SynapseEntryType.LOCAL_ENTRY);
			editorList.removeAll(localEntryList);
			compCount = editorList.size();
			if (editorList.isEmpty()) {
				removeSeqsFromList();
				String msg = "No sequences in the selected file..";
				setErrorMessage(msg);
				setPageComplete(msg == null);
				compCount = 0;
			} else {
				setErrorMessage(null);
				componentsLabel.setVisible(true);
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
		}catch (OMException e2) {
			String msg = "Syntax errors in the given xml file. See workspace log for more info.";
			setErrorMessage(msg);
			setPageComplete(msg == null);
		}catch (Exception e2) {
			String msg = "Syntax errors in the given xml file. See workspace log for more info.";
			setErrorMessage(msg);
			setPageComplete(msg == null);
		}
	}
	
	
	public boolean checkoutRegResource() throws Exception{
		boolean checkedout = false;
		String resourceName = getSelectedRegResourcePath();
		if(resourceName != null){
			String[] info = resourceName.split("/");
			File tmpFolder = null;
			try {
				tmpFolder = FileUtils.createTempDirectory();
				tmpFolder.delete();
				tmpFolder.mkdirs();
			} catch (IOException e) {
				log.error(e);
			}
			
			synapseFile = new File(tmpFolder, info[info.length-1] );
			IRegistryData selectRegistryPathData = getSelectRegistryPathData();
			if (selectRegistryPathData==null){
				throw new Exception("Registry location to import the synapse.xml was not specified");
			}
			CAppEnvironment.getRegistryHandler().importRegistryResourceToFileSystem(selectRegistryPathData, synapseFile);
			setFilePath(synapseFile.getPath());
			checkedout = true;
		}
		setPageComplete(checkedout);
		return checkedout;
	}
	

	public void popUPRegistryBrowser(){
		int index = getComboSelectedIndex();
		if (index==-1){
			IRegistryConnection connection = CAppEnvironment.getRegistryHandler().createNewRegistryConnection(selectedProject, true);
			if (connection==null){
				return;
			}
			registryListDD.add(connection.getCaption());
			registryConnections.add(connection);
			registryListDD.select(registryListDD.getItemCount()-1);
		}
		index = getComboSelectedIndex();
		IRegistryConnection data = registryConnections.get(index); 
		int type = IRegistryHandler.SELECTED_REGISTRY_RESOURCE;
		String title = "Browse registry for the synapse configuration";
		String message = "Select the path of the synapse configuration";
		try {
			selectRegistryPathData = CAppEnvironment.getRegistryHandler().selectRegistryPath(new IRegistryConnection[]{data}, title, message, type);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (selectRegistryPathData!=null){
    		setSelectRegistryPathData(selectRegistryPathData);
    		setSelectedRegResourcePath(selectRegistryPathData.getPath());
    		selectedPath.setText(getSelectedRegResourcePath());
		}
	}
	
	public String getSelectedPath(){
		return getSelectedRegResourcePath();
	}
	
	public void loadComboData(List<IRegistryConnection> connectionList){
		registryListDD.add("--create new registry instance--");
		for (int i = 0; i < connectionList.size(); i++) {
			registryListDD.add(connectionList.get(i).getCaption());
        } 
		
		if (registryListDD.getSelectionIndex() == -1) {
			if(connectionList.isEmpty()){
				registryListDD.select(0);
			}else{
				registryListDD.select(1);
			}
			setComboSelectedIndex(registryListDD.getSelectionIndex()-1);
		}
	}
	
	public List<IRegistryConnection> getAvailableRegistryInstances(IProject currentProject){
		
		if(CAppEnvironment.isRegistryHandlerPresent()){
			registryConnections = CAppEnvironment.getRegistryHandler().getRegistryConnections(currentProject);
		}
		return registryConnections;
	}
	
	
	public void listEditors() {
		OMElement sList[] = null;
		if (compCount != 0) {
			sList = new OMElement[compCount];
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
			if(name!=null){
			    item.setText(name+" ("+nameList[i].getLocalName()+")");
			}else{
			    String key = nameList[i].getAttributeValue(new QName("key"));
			    item.setText(key+" ("+nameList[i].getLocalName()+")");
			}
		}
	}
	
	public void removeSeqsFromList() {
//		seqLabel.setVisible(false);
//		editorTb.setVisible(false);
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
				ext = getFilePath().substring(
						getFilePath().lastIndexOf('.'),
						getFilePath().length());

			} else {
				msg = "Invalid file specified";
			}
			if (ext != null) {
				if (!ext.equals(".xml")) {
					msg = "Synapse configuration file should be with the extension of .xml. Please specify the correct synapse configuration file ";
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
	
	private void initialize() {
		optTemplateSynapse.setSelection(true);
		
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
		fld.setFilterExtensions(new String[]{"*.xml"});
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

	private void dialogChanged() {

		String fileName = getFileName();
		if (fileName==null || fileName.length() == 0) {
			updateStatus("File name must be specified");
			return;
		}
		if (fileName.replace('\\', '/').indexOf('/', 1) > 0) {
			updateStatus("File name must be valid");
			return;
		}
		 if(ArtifactFileUtils.IsSpecialCharactersExist(fileName)){
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
		if (f==null || f.equals("") || f.equals(this.fileName)){
			wizard.setFileName(fileName);
		}
	    this.fileName = fileName;
    }

	
	public void addComponent() {
		ComponentData compData = ComponentData.getComponentData("", false);
		viewer.add(compData);
		TableItem item = editorTb.getItem(editorTb.getItemCount() - 1);
		item.setData(compData);
		editorTb.setTopIndex(editorTb.getItemCount());
		viewer.editElement(compData, 0);
	}
	
	class TableCellModifier implements ICellModifier {

		public boolean canModify(Object element, String arg1) {
			
			Iterator<OMElement> children = ((OMElement)element).getChildElements();
			String editorName="";
			while (children.hasNext()) {
				OMElement childnode = children.next();
				editorName = childnode.getAttributeValue(new QName("name"));
			}
			ComponentData row = ComponentData.getComponentData(editorName, false);
//			ComponentData row = (ComponentData) element;
			return !row.isDeleted;
		}

		public Object getValue(Object element, String property) {
			Object result = null;
			ComponentData row = (ComponentData) element;
			ArrayList<String> list = new ArrayList<String>();
			for (int i = 0; i < titles.length; i++) {
				list.add(titles[i]);
			}
			int columnIndex = list.indexOf(property);
			switch (columnIndex) {
			case 0:
				result = row.compSpecifiedName;
				break;
			case 1:
				result = row.componentName;
				break;
			case 2:
				result = row.componentType;
				break;
			}
			return result;
		}

		public void modify(Object element, String property, Object value) {
			ArrayList<String> list = new ArrayList<String>();
			for (int i = 0; i < titles.length; i++) {
				list.add(titles[i]);
			}
			int columnIndex = list.indexOf(property);

			TableItem tableItem = (TableItem) element;
			ComponentData row = (ComponentData) tableItem.getData();

			switch (columnIndex) {
			case 0:
				String key = (String) value;
				if (key.length() > 0) {
					row.compSpecifiedName = key;
				}
				break;

			case 1:
				String v = (String) value;
				if (v.length() > 0) {
					row.componentName = v;
				}
				break;
				
			case 2:
				String v2 = (String) value;
				if (v2.length() > 0) {
					row.componentType = v2;
				}
			break;
		}
			if (row.isBlank()) {
				if (tableItem != editorTb.getItem(editorTb.getItemCount() - 1)) {
				}
			} else {
				TableItem item = editorTb.getItem(editorTb.getItemCount() - 1);
				ComponentData lastCompData = (ComponentData) item.getData();
				if (!lastCompData.isBlank()){
					addComponent();
				}
			}
			
			viewer.update(row, null);
		}
		
	}
	
	public static class ComponentData{
		String compSpecifiedName;
		String componentName; 
		String componentType;
		String currentName;
		boolean isDeleted = false;
		
		public static ComponentData getComponentData(String cName, boolean isCurrent){
			ComponentData compData = new ComponentData();
			if (isCurrent){
				compData.currentName = cName;
			}
			compData.currentName = cName;
			return compData;
		}
		
		public boolean isNew() {
			return currentName == null ;
		}

		public boolean isChanged() {
			return currentName == null || !currentName.equals(compSpecifiedName);
		}

		public boolean isBlank() {
			return compSpecifiedName.equals("");
		}
	}
	
	public class TableLabelProvider extends LabelProvider implements ITableLabelProvider {

		public Image getColumnImage(Object arg0, int arg1) {
			return null;
		}

		public String getColumnText(Object element, int columnIndex) {
			ComponentData row = (ComponentData) element;
			switch (columnIndex) {
			case 0:
				return row.componentName;
			case 1:
				return row.compSpecifiedName;
			case 2:
				return row.componentType;
			}
			return null;
		}
	}
	
	public class TableContentProvider implements IStructuredContentProvider {

		public Object[] getElements(Object parent) {
			ArrayList<?> results = new ArrayList<Object>();
			if (parent instanceof OMElement) {
				results = (ArrayList<?>) parent;
			}
			return results.toArray();
		}

		public void dispose() {
			
		}

		public void inputChanged(Viewer arg0, Object arg1, Object arg2) {
			
		}
		
	}
}
