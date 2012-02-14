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

package org.wso2.carbonstudio.eclipse.capp.artifact.proxyservice.ui.wizard;


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
import org.wso2.carbonstudio.eclipse.capp.artifact.proxyservice.Activator;
import org.wso2.carbonstudio.eclipse.capp.artifact.proxyservice.core.ProxyTemplateHandler;
import org.wso2.carbonstudio.eclipse.capp.artifact.proxyservice.utils.ProxyTemplate;
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



public class NewProxyServiceWizardPage extends WizardPage {
	private static ICarbonStudioLog log=Logger.getLog(Activator.PLUGIN_ID);

	private Text fileText;
	private Button optNewProxyService;
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
	private File proxyFile;
	private String filePath;
	private Combo proxyOptionCombo;
	private int proxyOptionType;

	private ProxyTemplate[] proxyTemplates;
	
	public int getProxyOptionType() {
		return proxyOptionType;
	}

	public void setProxyOptionType(int proxyOptionType) {
		this.proxyOptionType = proxyOptionType;
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
	
	public NewProxyServiceWizardPage(WizardNewFileCreationPage wizardNewFileCreationPage, IProject p) {
		super("wizardPage");
		setDescription("Select proxy service");
        this.wizard=wizardNewFileCreationPage;
        this.selectedProject = p;
	}


	public void createControl(Composite parent) {
		Group group = new Group(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		layout.verticalSpacing = 9;
		group.setLayout(layout);	
		
		GridData gd = new GridData();
		gd.horizontalSpan=3;
		
		Label lblFrom = new Label(group, SWT.NULL);
		lblFrom.setText("Create Proxy Service artifact from:");
        lblFrom.setLayoutData(gd);
		
        lblFromNew = new Label(group, SWT.NULL);
        lblFromNew.setText("&Name:");
        lblFromNew.setEnabled(false);

		fileText = new Text(group, SWT.BORDER | SWT.SINGLE);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		fileText.setLayoutData(gd);
		fileText.setText("proxyservice1");
		setFileName(fileText.getText());
		fileText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				setFileName(fileText.getText());
				dialogChanged();
			}
		});
		fileText.setEnabled(false);
		
		new Label(group, SWT.NULL);
		
        optNewProxyService = new Button(group,SWT.RADIO);
        optNewProxyService.setText("New Proxy Service");
        
        proxyOptionCombo = new Combo(group, SWT.READ_ONLY);
        gd = new GridData(GridData.FILL_HORIZONTAL);
        proxyOptionCombo.setLayoutData(gd);
        
        loadProxyTypeCombo();
        
        proxyOptionCombo.addSelectionListener(new SelectionListener() {
			
			public void widgetSelected(SelectionEvent arg0) {
				setProxyOptionType(proxyOptionCombo.getSelectionIndex());
//				if(selectedTemplateText.equals("Pass Through Proxy")){
//					setProxyOptionType(ArtifactFileUtils.PASS_THROUGH_PROXY);
//				}else if(selectedTemplateText.equals("Secure Proxy")){
//					setProxyOptionType(ArtifactFileUtils.SECURE_PROXY);
//				}else if(selectedTemplateText.equals("WSDL Based Proxy")){
//					setProxyOptionType(ArtifactFileUtils.WSDL_PROXY);
//				}else if(selectedTemplateText.equals("Log and Forward Proxy")){
//					setProxyOptionType(ArtifactFileUtils.LOG_FORWARD_PROXY);
//				}else if(selectedTemplateText.equals("Transformer Proxy")){
//					setProxyOptionType(ArtifactFileUtils.TRANSFORMER_PROXY);
//				}else{
//					setProxyOptionType(ArtifactFileUtils.CUSTOM_PROXY);
//				}
			}
			
			public void widgetDefaultSelected(SelectionEvent arg0) {
				
			}
		});
        
		optNewProxyService.addSelectionListener((new SelectionListener() {
			
			public void widgetSelected(SelectionEvent e) {
				setOptionType(ArtifactFileUtils.OPTION_NEW);
				lblFromNew.setEnabled(true);
				fileText.setEnabled(true);	
				if(fileText.getText() != null && !fileText.getText().equals("")){
					updateStatus(null);
				}
			}
			
			public void widgetDefaultSelected(SelectionEvent e) {
				widgetSelected(e);
			}
		}));
	        new Label(group, SWT.NONE);
		
	        importFromFS = new Button(group, SWT.RADIO);
	        importFromFS.setText("Import proxy file from file system");
	        gd = new GridData();
	        gd.horizontalSpan=3;
//	        gd.horizontalIndent = 10;
	        importFromFS.setLayoutData(gd);
	        
	        new Label(group, SWT.NULL);
	        
	        importFromFS.addSelectionListener(new SelectionListener() {
				
				public void widgetSelected(SelectionEvent event) {
					boolean b = ((Button) (event.widget)).getSelection();
					if(b){
						setOptionType(ArtifactFileUtils.OPTION_IMPORT_FS);
						filePathText.setEnabled(true);
						pathButton.setEnabled(true);
						editorTb.removeAll();
						compCount=0;
						if(filePathText.getText() != null && !filePathText.getText().equals("")){
							updateStatus(null);
							setFilePath(filePathText.getText());
							loadDataForTable();
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
//			try {
////				wizInfoPers.addControl(filePathText, UIConstants.FILE_PATH);
//			} catch (IOException e1) {
//				e1.printStackTrace();
//			}

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
						editorTb.setVisible(false);
						componentsLabel.setVisible(false);
						selectAllButton.setVisible(false);
						deSelectAllButton.setVisible(false);
						loadDataForTable();
					} else {
						editorList = null;
						removeSeqsFromList();
						compCount = 0;
					}
				}
			});

			
			importFromRegistry = new Button(group, SWT.RADIO);
			importFromRegistry.setText("Import proxy service file from registry");
	        gd = new GridData(GridData.FILL_HORIZONTAL);
//	        gd.horizontalIndent = 10;
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
					editorTb.removeAll();
					compCount=0;
					popUPRegistryBrowser();
					try {
						if(checkoutRegResource()){
							loadDataForTable();
							componentsLabel.setVisible(true);
							editorTb.setVisible(true);
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
						editorTb.removeAll();
						compCount=0;
						if(selectedPath.getText()== null || selectedPath.getText().equals("")){
							setPageComplete(false);
						}else{
							updateStatus(null);
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
	        
			componentsLabel = new Label(group, SWT.NULL);
			gd = new GridData(GridData.FILL_HORIZONTAL);
			gd.horizontalSpan=3;
			gd.horizontalIndent = 30;
			componentsLabel.setText("Available Proxy Services : ");
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
			
			for (int i = 0; i < compCount; i++) {
				new TableItem(editorTb, SWT.NULL);
			}
			editorTb.setVisible(false);
			
			synapseConfElements = new ArrayList<OMElement>();
			editorTb.addListener(SWT.Selection, new Listener() {
				public void handleEvent(Event event) {
					updateCheckedList();
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
					//Fixing TOOLS-438
					setPageComplete(true);
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
					//Fixing TOOLS-438
					setPageComplete(false);
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
	private void updateCheckedList() {
		synapseConfElements.clear();
		TableItem[] items = editorTb.getItems();
		for (TableItem tableItem : items) {
			if (tableItem.getChecked()){
				OMElement element = (OMElement) tableItem.getData();
				synapseConfElements.add(element);
			}
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
			
			proxyFile = new File(tmpFolder, info[info.length-1] );
			IRegistryData selectRegistryPathData = getSelectRegistryPathData();
			if (selectRegistryPathData==null){
				throw new Exception("Registry location to import the synapse.xml was not specified");
			}
			CAppEnvironment.getRegistryHandler().importRegistryResourceToFileSystem(selectRegistryPathData, proxyFile);
			setFilePath(proxyFile.getPath());
			checkedout = true;
		}
		setPageComplete(checkedout);
		return checkedout;
	}
	
	
	public void loadDataForTable(){
		try {
			editorList = SynapseFileUtils.synapseFileProcessing(getFilePath(),SynapseEntryType.PROXY_SERVICE);
			compCount = editorList.size();
			if (editorList.isEmpty()) {
				removeSeqsFromList();
				String msg = "No proxy services in the selected file..";
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
	
	private void loadProxyTypeCombo(){
		proxyOptionCombo.removeAll();
		proxyTemplates = ProxyTemplateHandler.getProxyTemplates();
		for (ProxyTemplate proxyTemplate : proxyTemplates) {
			proxyOptionCombo.add(proxyTemplate.getName());
		}
//		String[] proxyTypes = {"Pass Through Proxy", "Secure Proxy", "WSDL Based Proxy", "Log and Forward Proxy", 
//								"Transformer Proxy", "Custom Proxy"};
//		for (String proxyType : proxyTypes) {
//			proxyOptionCombo.add(proxyType);
//		}
		
		if(proxyOptionCombo.getSelectionIndex() == -1){
			proxyOptionCombo.select(0);
			setProxyOptionType(0);
		}
//		setProxyOptionType(ArtifactFileUtils.PASS_THROUGH_PROXY);
		
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
	
	public int getproxyCount(){
		return editorList.size();
	}
	
	public void listEditors() {
		OMElement sList[] = null;
		if (compCount != 0) {
			sList = new OMElement[getproxyCount()];
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
			item.setText(name);
			//Fixing TOOLS-438
			item.setChecked(true);
		}
		updateCheckedList();
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
	
	private void initialize() {
		optNewProxyService.setSelection(true);
		fileText.setEnabled(true);
		lblFromNew.setEnabled(true);

//		fileText.setText("newproxyservice");
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