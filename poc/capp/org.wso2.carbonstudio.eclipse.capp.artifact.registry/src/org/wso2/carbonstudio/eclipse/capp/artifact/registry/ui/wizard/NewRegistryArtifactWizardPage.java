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

package org.wso2.carbonstudio.eclipse.capp.artifact.registry.ui.wizard;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.eclipse.core.resources.IProject;
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
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.wso2.carbonstudio.eclipse.capp.artifact.registry.Activator;
import org.wso2.carbonstudio.eclipse.capp.artifact.registry.core.RegstryTemplateHandler;
import org.wso2.carbonstudio.eclipse.capp.artifact.registry.utils.RegistryTemplates;
import org.wso2.carbonstudio.eclipse.capp.artifact.registry.utils.UIConstants;
import org.wso2.carbonstudio.eclipse.capp.core.artifacts.manager.CAppEnvironment;
import org.wso2.carbonstudio.eclipse.capp.core.ui.utils.WizardInfoPersister;
import org.wso2.carbonstudio.eclipse.capp.core.utils.ArtifactFileUtils;
import org.wso2.carbonstudio.eclipse.capp.core.utils.Constants;
import org.wso2.carbonstudio.eclipse.greg.core.interfaces.IRegistryConnection;
import org.wso2.carbonstudio.eclipse.greg.core.interfaces.IRegistryData;
import org.wso2.carbonstudio.eclipse.greg.core.interfaces.IRegistryHandler;
import org.wso2.carbonstudio.eclipse.logging.core.ICarbonStudioLog;
import org.wso2.carbonstudio.eclipse.logging.core.Logger;
import org.wso2.carbonstudio.eclipse.utils.file.FileUtils;

public class NewRegistryArtifactWizardPage extends WizardPage{
	private static ICarbonStudioLog log=Logger.getLog(Activator.PLUGIN_ID);

	private String dumpregPath;
	private String regPathTodeploy;
//	private Button filePathButton;
//	private Button folderPathButton;
	WizardNewFileCreationPage wizard;
	private Button fileButton;
	private Button folderButton;
//	private Text folderPathText;
	private Text filePathText;
	private Text dumpXMLPath;
	private Button dumpXmlBrowseButton;
	private Button checkoutButton;
	private Button dumpXMLButton;
	private IProject selectedProject;
	private List<IRegistryConnection> registryConnections;
	private Combo registryListDD;
	private String selectedRegistry;
	private int comboSelectedIndex = -1;
	private String selectedRegResourcePath;
	private Text selectedPath;
	private Button regPathButton;
	private IRegistryData selectRegistryPathData;
	private int optionType = ArtifactFileUtils.OPTION_NEW;
	private File regFile;
	private int type; //whether a collection or resource
	private Button onlyContentButton;
	private boolean copyContent = true;
	private Combo templateCombo;
	private RegistryTemplates[] regTemplates;
	private String templateName;
	private int emptyXmlFileTemplate;
	private int emptyTextFileTemplate;
	private int templateType;
	private boolean regDumpSelected;

	private Text nameText;

	
	public int getTemplateType() {
		return templateType;
	}

	public void setTemplateType(int templateType) {
		this.templateType = templateType;
	}

	public RegistryTemplates[] getRegTemplates() {
		return regTemplates;
	}

	public void setRegTemplates(RegistryTemplates[] regTemplates) {
		this.regTemplates = regTemplates;
	}

	
	public String getTemplateName() {
		return templateName;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

	public boolean isCopyContent() {
		return copyContent;
	}

	public void setCopyContent(boolean copyContent) {
		this.copyContent = copyContent;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
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

	public int getOptionType() {
		return optionType;
	}


	public void setOptionType(int optionType) {
		this.optionType = optionType;
	}

	protected NewRegistryArtifactWizardPage(WizardNewFileCreationPage wizardNewFileCreationPage, IProject p) {
        super("New WSO2 Registry Resource");
        setDescription("Registry resource details");
        this.wizard=wizardNewFileCreationPage;
        this.selectedProject = p;
    }

	private void updateResourceFileName(){
		String resourceName = nameText.getText();
		String resourceFileName = FileUtils.getResourceFileName(resourceName);
		String selectedTemplateExtension = getSelectedTemplateExtension();
		if (selectedTemplateExtension==null){
			nameText.setText(resourceFileName);
		}else{
			nameText.setText(resourceFileName+"."+selectedTemplateExtension);
		}
	}
	
	private String getSelectedTemplateExtension() {
		int selectionIndex = templateCombo.getSelectionIndex();
		if (selectionIndex == emptyXmlFileTemplate) {
			return "xml";
		} else if (selectionIndex == emptyTextFileTemplate) {
			return "txt";
		} else {
			RegistryTemplates esbArtifactTemplate = regTemplates[selectionIndex];
			String[] split = esbArtifactTemplate.getTemplateFileName().split("/");
			if (split==null || split.length<2){
				return FileUtils.getResourceFileNameExtension(esbArtifactTemplate.getTemplateFileName());
			}else{
				return FileUtils.getResourceFileNameExtension(split[split.length-1]);
			}
		}
	

	}
	public void createControl(Composite parent) {
		WizardInfoPersister wizInfoPers = new WizardInfoPersister();
        Composite container = new Composite(parent, SWT.NULL);
        GridLayout layout = new GridLayout();
        container.setLayout(layout);
        
        Group grpCreateRegistryArtifact = new Group(container, SWT.NONE);
        grpCreateRegistryArtifact.setText("Create Registry artifact from:");
        grpCreateRegistryArtifact.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
        grpCreateRegistryArtifact.setLayout(new GridLayout(2, false));
        
        
        Button fromTemplate = new Button(grpCreateRegistryArtifact, SWT.RADIO);
        fromTemplate.setText("From existing template");
        fromTemplate.setSelection(true);
        setOptionType(ArtifactFileUtils.OPTION_TEMPLATE);
        new Label(grpCreateRegistryArtifact, SWT.NONE);
        
        
        Composite templateComposite = new Composite(grpCreateRegistryArtifact, SWT.NONE);
        templateComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 2, 1));
        GridLayout glTemplateComposite = new GridLayout(2, false);
        templateComposite.setLayout(glTemplateComposite);
        
        Label nameLabel = new Label(templateComposite, SWT.NULL);
        GridData gd_nameLabel = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
        gd_nameLabel.horizontalIndent = 30;
        gd_nameLabel.widthHint = 140;
        nameLabel.setLayoutData(gd_nameLabel);
        nameLabel.setText("Name");
        
        nameText = new Text(templateComposite, SWT.BORDER);
        GridData gd_nameText = new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1);
        gd_nameText.widthHint = 250;
        gd_nameText.minimumWidth = 200;
        nameText.setLayoutData(gd_nameText);
        nameText.setText("resource1.xml");
        setTemplateName(nameText.getText());
        wizard.setFileName(FileUtils.getResourceFileName(getTemplateName()));
        
        nameText.addModifyListener(new ModifyListener() {
			
			public void modifyText(ModifyEvent arg0) {
				setTemplateName(nameText.getText());
				wizard.setFileName(FileUtils.getResourceFileName(getTemplateName()));
			}
		});
        
        Label templateLabel = new Label(templateComposite, SWT.NULL);
        GridData gd_templateLabel = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
        gd_templateLabel.horizontalIndent = 30;
        templateLabel.setLayoutData(gd_templateLabel);
        templateLabel.setText("Template");
        
        templateCombo = new Combo(templateComposite, SWT.READ_ONLY);
        templateCombo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
        
        templateCombo.addSelectionListener(new SelectionListener() {
			
			public void widgetSelected(SelectionEvent arg0) {
				setOptionType(ArtifactFileUtils.OPTION_TEMPLATE);
				if(templateCombo.getText().equals("Empty XML file")){
					setTemplateType(emptyXmlFileTemplate);
				}else if(templateCombo.getText().equals("Empty text file")){
					setTemplateType(emptyTextFileTemplate);
				}else{
					setTemplateType(templateCombo.getSelectionIndex());
				}
				updateResourceFileName();
			}
			
			public void widgetDefaultSelected(SelectionEvent arg0) {
				
			}
		});
         
         Label seperatorLabel = new Label(grpCreateRegistryArtifact, SWT.SEPARATOR | SWT.HORIZONTAL);
         seperatorLabel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
        
         fromTemplate.addSelectionListener(new SelectionListener() {
			
			public void widgetSelected(SelectionEvent event) {
				boolean b = ((Button) (event.widget)).getSelection();
				if(b){
					updateStatus(null);
					nameText.setEnabled(true);
					templateCombo.setEnabled(true);
					filePathText.setEnabled(false);
					dumpXMLPath.setEnabled(false);
					fileButton.setEnabled(false);
					folderButton.setEnabled(false);
					registryListDD.setEnabled(false);
					selectedPath.setEnabled(false);
					regPathButton.setEnabled(false);
					onlyContentButton.setEnabled(false);
					setOptionType(ArtifactFileUtils.OPTION_TEMPLATE);
					
				}else{
					filePathText.setEnabled(false);
					setOptionType(ArtifactFileUtils.ERROR_OPTION);
				}
			}
			
			public void widgetDefaultSelected(SelectionEvent arg0) {
				
			}
		});
        
         Button importResourceFromFS = new Button(grpCreateRegistryArtifact, SWT.RADIO);
         importResourceFromFS.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 2, 1));
         importResourceFromFS.setText("Import from file system");
         
         Composite importResourceFromFSComposite = new Composite(grpCreateRegistryArtifact, SWT.NONE);
         importResourceFromFSComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 2, 1));
         importResourceFromFSComposite.setLayout(new GridLayout(3, false));
         
//        fileButton = new Button(container, SWT.RADIO);
//        gd = new GridData(GridData.FILL_HORIZONTAL);
//        gd.horizontalIndent=20;
//        fileButton.setText("File");
//        fileButton.setLayoutData(gd);
         
         filePathText = new Text(importResourceFromFSComposite, SWT.BORDER );
         GridData gd_filePathText = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
         gd_filePathText.horizontalIndent = 30;
         gd_filePathText.widthHint = 250;
         filePathText.setLayoutData(gd_filePathText);
         filePathText.setEnabled(false);
         try {
			wizInfoPers.addControl(filePathText, UIConstants.FILE_PATH);
		} catch (IOException e3) {
			e3.printStackTrace();
		}
         
         filePathText.addModifyListener(new ModifyListener() {
         	
         	public void modifyText(ModifyEvent arg0) {
         		setType(Constants.REGISTRY_RESOURCE);
         		if(!FileUtils.isPathValid(filePathText.getText())){
         			updateStatus("File does not exist");
         		}else{
         			setDumpregPath(filePathText.getText());
         			File tempFile = new File(filePathText.getText());
         			if(tempFile.isDirectory()){
         				onlyContentButton.setEnabled(true);
         				setOptionType(ArtifactFileUtils.OPTION_IMPORT_COLLECTION_FROM_FS);
         			}else{
         				onlyContentButton.setEnabled(false);
         				setOptionType(ArtifactFileUtils.OPTION_IMPORT_RESOURCE_FROM_FS);
         			}
         			updateStatus(null);
         		}
         	}
         });
         
         fileButton = new Button(importResourceFromFSComposite, SWT.PUSH);
         GridData gd_fileButton = new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1);
         gd_fileButton.widthHint = 130;
         fileButton.setEnabled(false);
         fileButton.setLayoutData(gd_fileButton);
         fileButton.setText("Browse File...");
         
//		gd = new GridData();
//		gd.heightHint = 27;
//		gd.widthHint = 70;
//		filePathButton = new Button(container,  SWT.PUSH);
//		filePathButton.setText("Browse...");
//		filePathButton.setLayoutData(gd);
//		filePathButton.setEnabled(true);

         fileButton.addSelectionListener(new SelectionAdapter() {
         	public void widgetSelected(SelectionEvent e) {
         		handlePathBrowseButton(filePathText, true);
         	}
         });
         
         folderButton = new Button(importResourceFromFSComposite, SWT.PUSH);
         GridData gd_folderButton = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
         gd_folderButton.widthHint = 130;
         folderButton.setEnabled(false);
         folderButton.setLayoutData(gd_folderButton);
         folderButton.setText("Browse Folder...");
         
         folderButton.addSelectionListener(new SelectionAdapter() {
         	public void widgetSelected(SelectionEvent e) {
         		handlePathBrowseButton(filePathText, false);
         	}
         });
         
         onlyContentButton = new Button(importResourceFromFSComposite, SWT.CHECK);
         GridData gd_onlyContentButton = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
         gd_onlyContentButton.horizontalIndent = 30;
         onlyContentButton.setLayoutData(gd_onlyContentButton);
         onlyContentButton.setText("Copy content only");
         onlyContentButton.setSelection(false);
         onlyContentButton.setEnabled(false);
         //new Label(importResourceFromFSComposite, SWT.NONE);
         
         
         onlyContentButton.addSelectionListener(new SelectionListener() {
         	
         	public void widgetSelected(SelectionEvent arg0) {
         		boolean selected = onlyContentButton.getSelection();
         		if(selected == true){
         			setCopyContent(true);
         		}else{
         			setCopyContent(false);
         		}
         		
         	}
         	
         	public void widgetDefaultSelected(SelectionEvent arg0) {
         		
         	}
         });
         
         importResourceFromFS.addSelectionListener(new SelectionListener() {
			
			public void widgetSelected(SelectionEvent event) {
				boolean b = ((Button) (event.widget)).getSelection();
				if(b){	
					updateStatus(null);
					fileButton.setEnabled(true);
					folderButton.setEnabled(true);
					filePathText.setEnabled(true);
					nameText.setEnabled(false);
					templateCombo.setEnabled(false);
					registryListDD.setEnabled(false);
					selectedPath.setEnabled(false);
					regPathButton.setEnabled(false);
					onlyContentButton.setEnabled(false);
					
					setType(Constants.REGISTRY_RESOURCE);
					
					if(!filePathText.getText().equals("") && filePathText.getText() != null && !FileUtils.isPathValid(filePathText.getText())){
						updateStatus("File does not exist.");
					}else{
						setDumpregPath(filePathText.getText());
						File tempFile = new File(filePathText.getText());
		     			if(tempFile.isDirectory()){
		     				onlyContentButton.setEnabled(true);
		     				setOptionType(ArtifactFileUtils.OPTION_IMPORT_COLLECTION_FROM_FS);
		     			}else{
		     				onlyContentButton.setEnabled(false);
		     				setOptionType(ArtifactFileUtils.OPTION_IMPORT_RESOURCE_FROM_FS);
		     			}
						updateStatus(null);
					}
				}else{
					filePathText.setEnabled(false);
					setOptionType(ArtifactFileUtils.ERROR_OPTION);
				}
			}
			
			public void widgetDefaultSelected(SelectionEvent event) {
				
			}
		});
         
         Label seperator2Label = new Label(grpCreateRegistryArtifact, SWT.SEPARATOR | SWT.HORIZONTAL);
         seperator2Label.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
         
         checkoutButton = new Button(grpCreateRegistryArtifact, SWT.RADIO);
         checkoutButton.setText("Check-out from registry");
         
         checkoutButton.addSelectionListener(new SelectionListener() {
         	
         	public void widgetSelected(SelectionEvent event) {
         		boolean b = ((Button) (event.widget)).getSelection();
         		if(b){
         			updateStatus(null);
         			setOptionType(ArtifactFileUtils.OPTION_IMPORT_REG);
         			registryListDD.setEnabled(true);
         			selectedPath.setEnabled(true);
         			regPathButton.setEnabled(true);
         			onlyContentButton.setEnabled(false);
					nameText.setEnabled(false);
					templateCombo.setEnabled(false);
					fileButton.setEnabled(false);
					folderButton.setEnabled(false);
         			if(selectedPath.getText() == null || selectedPath.getText().equals("")){
         				setPageComplete(false);
//						updateStatus("Select a resource path from registry.");
         			}else{
         				updateStatus(null);
         				setDumpregPath(selectedPath.getText());
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
         		}
         		else{
         			setOptionType(ArtifactFileUtils.ERROR_OPTION);
         		}
         	}
         	
         	public void widgetDefaultSelected(SelectionEvent arg0) {
         		
         	}
         });
         new Label(grpCreateRegistryArtifact, SWT.NONE);
         
         Composite group_1 = new Composite(grpCreateRegistryArtifact, SWT.NONE);
         group_1.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 2, 3));
         group_1.setLayout(new GridLayout(2, false));
         
         registryListDD = new Combo(group_1, SWT.READ_ONLY);
         GridData gd_registryListDD = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
         gd_registryListDD.horizontalIndent = 30;
         gd_registryListDD.widthHint = 250;
         registryListDD.setLayoutData(gd_registryListDD);
         registryListDD.setEnabled(false);
         
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
         regPathButton = new Button(group_1,  SWT.PUSH | SWT.LEFT);
         regPathButton.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
         regPathButton.setText("Browse...");
         regPathButton.setEnabled(false);
         
         selectedPath = new Text(group_1, SWT.READ_ONLY | SWT.BORDER);
         GridData gd_selectedPath = new GridData(SWT.FILL, SWT.CENTER, true,false, 2, 1);
         gd_selectedPath.horizontalIndent = 30;
         gd_selectedPath.widthHint = 250;
         selectedPath.setLayoutData(gd_selectedPath);
         selectedPath.setEnabled(false);
         
         selectedPath.addModifyListener(new ModifyListener() {
         	
         	public void modifyText(ModifyEvent arg0) {
         		setDumpregPath(selectedPath.getText());
         		updateStatus(null);
         	}
         });
         
         regPathButton.addSelectionListener(new SelectionAdapter() {
         	public void widgetSelected(SelectionEvent e) {
         		popUPRegistryBrowser();
         		try {
         			checkoutRegResource();
         		} catch (Exception e1) {
         			e1.printStackTrace();
         		}
         	}
         });
         
         Label seperator3Label = new Label(grpCreateRegistryArtifact, SWT.SEPARATOR | SWT.HORIZONTAL);
         seperator3Label.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
         
         dumpXMLButton = new Button(grpCreateRegistryArtifact, SWT.RADIO);
         dumpXMLButton.setText("Import registry dump file from file system");
         
       
         dumpXMLButton.addSelectionListener(new SelectionListener() {
         	
         	public void widgetSelected(SelectionEvent event) {
         		boolean b = ((Button) (event.widget)).getSelection();
         		if(b){
         			updateStatus(null);
         			setOptionType(ArtifactFileUtils.OPTION_IMPORT_FS);
         			dumpXMLPath.setEnabled(true);
         			dumpXmlBrowseButton.setEnabled(true);
         			registryListDD.setEnabled(false);
         			selectedPath.setEnabled(false);
         			regPathButton.setEnabled(false);
         			onlyContentButton.setEnabled(false);
					fileButton.setEnabled(false);
					folderButton.setEnabled(false);
					nameText.setEnabled(false);
					templateCombo.setEnabled(false);
         			if(dumpXMLPath.getText() != null && dumpXMLButton.getText().equals("")){
         				if(!FileUtils.isPathValid(dumpXMLPath.getText())){
         					updateStatus("Dump xml does not exist.");
         				}else{
         					setDumpregPath(dumpXMLPath.getText());
         					updateStatus(null);
         				}
         			}else{
         				setPageComplete(false);
         			}
         			//Fixing TOOLS-488
         			setRegDumpSelected(true);
         		}
         		else{
         			setOptionType(ArtifactFileUtils.ERROR_OPTION);
         			dumpXMLPath.setEnabled(false);
         			dumpXmlBrowseButton.setEnabled(false);
         		}
         	}
         	
         	public void widgetDefaultSelected(SelectionEvent event) {
         		
         	}
         });
         new Label(grpCreateRegistryArtifact, SWT.NONE);
         
         Composite group_2 = new Composite(grpCreateRegistryArtifact, SWT.NONE);
         group_2.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 2, 1));
         group_2.setLayout(new GridLayout(2, false));
         
         dumpXMLPath = new Text(group_2, SWT.BORDER );
         GridData gd_dumpXMLPath = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
         gd_dumpXMLPath.horizontalIndent = 30;
         gd_dumpXMLPath.widthHint = 400;
         dumpXMLPath.setLayoutData(gd_dumpXMLPath);
         dumpXMLPath.setEnabled(false);
         
         dumpXMLPath.addModifyListener(new ModifyListener() {
         	
         	public void modifyText(ModifyEvent arg0) {
         		if (handleFilePathText()) {
         			if(!FileUtils.isPathValid(dumpXMLPath.getText())){
         				updateStatus("Dump xml path does not exist.");
         			}else{
         				setDumpregPath(dumpXMLPath.getText());
         				updateStatus(null);
         			}
         		} else {
         		}
         	}
         });
         dumpXmlBrowseButton = new Button(group_2,  SWT.PUSH);
         dumpXmlBrowseButton.setText("Browse...");
         dumpXmlBrowseButton.setEnabled(false);
         
         		dumpXmlBrowseButton.addSelectionListener(new SelectionAdapter() {
         			public void widgetSelected(SelectionEvent e) {
         				handlePathBrowseButton(dumpXMLPath, true);
         			}
         		});
        
        loadTemplates();
        
        if(CAppEnvironment.isRegistryHandlerPresent()){
        	registryConnections = getAvailableRegistryInstances(selectedProject);
        }
        
        loadComboData(registryConnections);
        
        Group group_3 = new Group(container, SWT.NONE);
        group_3.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
        group_3.setLayout(new GridLayout(3, false));
        
        Label deployPathLabel = new Label(group_3, SWT.NULL);
        deployPathLabel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 3, 1));
        deployPathLabel.setText("Registry Path To Deploy:");
        
        final Text deployPathText = new Text(group_3, SWT.BORDER);
        GridData gd_deployPathText = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
        gd_deployPathText.widthHint = 300;
        gd_deployPathText.horizontalIndent = 30;
        deployPathText.setLayoutData(gd_deployPathText);
        try {
			wizInfoPers.addControl(deployPathText, UIConstants.DEPLOY_REGISTY_PATH);
		} catch (IOException e2) {
			e2.printStackTrace();
		}
        setRegPathTodeploy(deployPathText.getText());
        
        deployPathText.addModifyListener(new ModifyListener() {
        	
        	public void modifyText(ModifyEvent event) {
        		setRegPathTodeploy(deployPathText.getText());
        	}
        });
        

		if(deployPathText.getText() == null || deployPathText.getText().equals("")){
			deployPathText.setText("/");
		}
		setCopyContent(false);
		
		/*
		if(filePathText.getText()!= null && !filePathText.getText().equals("")){
			if(!FileUtils.isPathValid(filePathText.getText())){
				updateStatus("File does not exist.");
			}else{
				setDumpregPath(filePathText.getText());
				File tempFile = new File(filePathText.getText());
     			if(tempFile.isDirectory()){
     				onlyContentButton.setEnabled(true);
     				setOptionType(ArtifactFileUtils.OPTION_IMPORT_COLLECTION_FROM_FS);
     			}else{
     				onlyContentButton.setEnabled(false);
     				setOptionType(ArtifactFileUtils.OPTION_IMPORT_RESOURCE_FROM_FS);
     			}
				updateStatus(null);
			}
		}
        */
        if(!fromTemplate.getSelection() && !fileButton.getSelection() && 
        		!folderButton.getSelection() && !checkoutButton.getSelection() 
        		&& !dumpXMLButton.getSelection()){
        	updateStatus("Select an option to create Registry Resource");
        }else{
        	updateStatus(null);
        }
        
        fromTemplate.setSelection(true);
        setOptionType(ArtifactFileUtils.OPTION_TEMPLATE);

		setControl(container);
	}
	
	
	private void loadTemplates() {
		templateCombo.removeAll();
//		int i = 0;
		regTemplates = RegstryTemplateHandler.getRegistryTemplates();
		for (RegistryTemplates regTemplate : regTemplates) {
			templateCombo.add(regTemplate.getName());
			
		}
		
		emptyXmlFileTemplate = templateCombo.getItemCount();
		templateCombo.add("Empty XML file");
		emptyTextFileTemplate = templateCombo.getItemCount();
		templateCombo.add("Empty text file");
		
		if(templateCombo.getSelectionIndex() == -1){
			templateCombo.select(0);
		}
		setRegTemplates(regTemplates);
	}

	public boolean handleFilePathText() {
		boolean isPathValid = false;
		this.setDumpregPath(dumpXMLPath.getText());
		String msg = null;
		String ext = null;
		File file = new File(getDumpregPath());
		if (!file.exists()) {
			msg = "Invalid path specified";
			isPathValid = false;
		} else {
			if (getDumpregPath().contains(".")) {
				ext = getDumpregPath().substring(
						getDumpregPath().lastIndexOf('.'),
						getDumpregPath().length());

			} else {
				msg = "Invalid file specified";
			}
			if (ext != null) {
				if (!ext.equals(".xml")) {
					msg = "Registry dump file should be with the extension of .xml. Please specify the correct registry dump file ";
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
	
	public void checkoutRegResource() throws Exception{
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
			
			regFile = new File(tmpFolder, info[info.length-1] );
			IRegistryData selectRegistryPathData = getSelectRegistryPathData();
			if (selectRegistryPathData==null){
				throw new Exception("Registry location to check-out is not specified");
			}
			if(selectRegistryPathData.getType() == Constants.REGISTRY_RESOURCE){
				CAppEnvironment.getRegistryHandler().importRegistryResourceToFileSystem(selectRegistryPathData, regFile);
			}else{
				String[] paths = selectRegistryPathData.getPath().split("/");
				String parent = paths[paths.length-1];
				parent=(parent==null||parent.equals("")||parent.equals("/"))? "ROOT":parent;
				regFile = new File(regFile,parent);
				regFile.mkdirs();
				CAppEnvironment.getRegistryHandler().importRegistryPathToFileSystem(selectRegistryPathData, regFile);
			}
			setDumpregPath(regFile.getPath());
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
		
		type = IRegistryHandler.SELECTED_REGISTRY_RESOURCE | IRegistryHandler.SELECTED_REGISTRY_PATH;
		String title = "Browse registry path to check-out";
		String message = "Select registry path to check-out";
		try {
			selectRegistryPathData = CAppEnvironment.getRegistryHandler().selectRegistryPath(new IRegistryConnection[]{data}, title, message, type);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (selectRegistryPathData!=null){
    		setSelectRegistryPathData(selectRegistryPathData);
    		if(selectRegistryPathData.getType() == Constants.REGISTRY_RESOURCE ){
    			setType(IRegistryHandler.SELECTED_REGISTRY_RESOURCE);
    		}else if (selectRegistryPathData.getType() == Constants.REGISTRY_COLLECTION){
    			setType(IRegistryHandler.SELECTED_REGISTRY_PATH);
    		}else{
    			
    		}
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
	
	public void handlePathBrowseButton(Text pathText, Boolean isFile) {
//		boolean isFile= false;
//		File file = new File(pathText.getText());
//		if(file.isFile()){
//			isFile=true;
//		}
		String fileName = getSavePath(isFile);
		if (fileName != null)
			pathText.setText(fileName);
	}

	private String getSavePath(Boolean isFile) {
		String fileName = null;
		// FileDialog
		FileDialog fld = new FileDialog(this.getShell(), SWT.OPEN);
		DirectoryDialog dird = new DirectoryDialog(this.getShell(), SWT.OPEN);
		boolean done = false;
		while (!done) {
			// Open the File Dialog
			if(isFile){
				fileName = fld.open();
			}else{
				fileName = dird.open();
			}
			
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

	public String getDumpregPath() {
		return dumpregPath;
	}

	public void setDumpregPath(String dumpregPath) {
		String fileName = wizard.getFileName();
		String name1=null;
		if (this.dumpregPath!=null){
			name1 = new File(this.dumpregPath).getName();
		}
		String name2 = new File(dumpregPath).getName();
		if ((fileName==null || fileName.equals("") || fileName.equals(name1)) && name2!=null){
			wizard.setFileName(ArtifactFileUtils.getFileNameWithoutExtension(name2));
		}
		this.dumpregPath = dumpregPath;
		
	}

	public String getRegPathTodeploy() {
		return regPathTodeploy;
	}

	public void setRegPathTodeploy(String regPathTodeploy) {
		this.regPathTodeploy = regPathTodeploy;
	}
	
	private void updateStatus(String message) {
		setErrorMessage(message);
		setPageComplete(message == null);
	}

	public void setRegDumpSelected(boolean regDumpSelected) {
	    this.regDumpSelected = regDumpSelected;
    }

	public boolean isRegDumpSelected() {
	    return regDumpSelected;
    }
	
}
