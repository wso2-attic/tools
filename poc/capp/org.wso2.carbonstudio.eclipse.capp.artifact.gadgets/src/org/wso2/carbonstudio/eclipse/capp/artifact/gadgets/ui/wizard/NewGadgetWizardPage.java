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

package org.wso2.carbonstudio.eclipse.capp.artifact.gadgets.ui.wizard;


import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.regex.Pattern;

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
import org.wso2.carbonstudio.eclipse.capp.artifact.gadgets.Activator;
import org.wso2.carbonstudio.eclipse.capp.core.artifacts.manager.CAppEnvironment;
import org.wso2.carbonstudio.eclipse.capp.core.utils.ArtifactFileUtils;
import org.wso2.carbonstudio.eclipse.greg.core.interfaces.IRegistryConnection;
import org.wso2.carbonstudio.eclipse.greg.core.interfaces.IRegistryData;
import org.wso2.carbonstudio.eclipse.greg.core.interfaces.IRegistryHandler;
import org.wso2.carbonstudio.eclipse.logging.core.ICarbonStudioLog;
import org.wso2.carbonstudio.eclipse.logging.core.Logger;
import org.wso2.carbonstudio.eclipse.utils.file.FileUtils;



public class NewGadgetWizardPage extends WizardPage {
	private static ICarbonStudioLog log=Logger.getLog(Activator.PLUGIN_ID);

	private Text fileText;
	private Button optNewGadget;
	WizardNewFileCreationPage wizard;
	private String fileName;
	private Label lblFromNew;
	private Button importGarFromFS;
	private Button importGadgetFolderFromFS;
	private Button importFromRegistry;
	private Text filePathText;
	private Text folderPathText;
	private Button filePathButton;
	private Button folderPathButton;
	private int optionType = ArtifactFileUtils.OPTION_NEW;
	private IProject selectedProject;
	private List<IRegistryConnection> registryConnections;
	private Combo registryListDD;
	private String selectedRegistry;
	private int comboSelectedIndex = -1;
	private String selectedRegResourcePath;
	private Text selectedPath;
	private Button regPathButton;
	private IRegistryData selectRegistryPathData;
	private File gadgetFile;
	private String filePath;
	private boolean isfile;
	
	public NewGadgetWizardPage(WizardNewFileCreationPage wizardNewFileCreationPage, IProject p) {
		super("wizardPage");
		setDescription("Select Gadget");
        this.wizard=wizardNewFileCreationPage;
        this.selectedProject = p;
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

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
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
		lblFrom.setText("Create Gadget artifact from:");
        lblFrom.setLayoutData(gd);
		
        lblFromNew = new Label(group, SWT.NULL);
        lblFromNew.setText("&Name:");
        lblFromNew.setEnabled(false);

		fileText = new Text(group, SWT.BORDER | SWT.SINGLE);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		fileText.setLayoutData(gd);
		fileText.setText("gadget1");
		setFileName(fileText.getText());
		
		fileText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				setFileName(fileText.getText());
				dialogChanged();
			}
		});
		fileText.setEnabled(false);
		
		new Label(group, SWT.NULL);
		
        optNewGadget = new Button(group,SWT.RADIO);
        optNewGadget.setText("New Gadget");
        gd = new GridData();
        gd.horizontalSpan=2;
        optNewGadget.setLayoutData(gd); 
		optNewGadget.addSelectionListener((new SelectionListener() {
			
			public void widgetSelected(SelectionEvent e) {
				setOptionType(ArtifactFileUtils.OPTION_NEW);
				lblFromNew.setEnabled(true);
				fileText.setEnabled(true);	
				setFileName(fileText.getText());
				if(!fileText.getText().equals("") && fileText.getText() != null){
					updateStatus(null);
				}
			}
			
			public void widgetDefaultSelected(SelectionEvent e) {
				widgetSelected(e);
			}
		}));
		
		Label importFromFSLabel = new Label(group, SWT.NULL);
		importFromFSLabel.setText("Import gadget from file system");
        gd = new GridData();
        gd.horizontalSpan=3;
        importFromFSLabel.setLayoutData(gd);
		
		importGarFromFS = new Button(group, SWT.RADIO);
        importGarFromFS.setText("Import Dashboard Archive file from file system");
        gd = new GridData();
        gd.horizontalIndent = 10;
        importGarFromFS.setLayoutData(gd);
        
        filePathText = new Text(group, SWT.BORDER );
		gd = new GridData();
		gd.heightHint = 18;
		gd.widthHint = 350;
		filePathText.setLayoutData(gd);
		filePathText.setEnabled(false);
        
		gd = new GridData();
		gd.heightHint = 27;
		gd.widthHint = 70;
		filePathButton = new Button(group,  SWT.PUSH);
		filePathButton.setText("Browse...");
		filePathButton.setLayoutData(gd);
		filePathButton.setEnabled(false);
		
		importGadgetFolderFromFS = new Button(group, SWT.RADIO);
		importGadgetFolderFromFS.setText("Import gadget resource folder from file system");
        gd = new GridData();
        gd.horizontalIndent = 10;
        importGadgetFolderFromFS.setLayoutData(gd);
        
        folderPathText = new Text(group, SWT.BORDER );
		gd = new GridData();
		gd.heightHint = 18;
		gd.widthHint = 350;
		folderPathText.setLayoutData(gd);
		folderPathText.setEnabled(false);
        
		gd = new GridData();
		gd.heightHint = 27;
		gd.widthHint = 70;
		folderPathButton = new Button(group,  SWT.PUSH);
		folderPathButton.setText("Browse...");
		folderPathButton.setLayoutData(gd);
		folderPathButton.setEnabled(false);
		
        importGarFromFS.addSelectionListener(new SelectionListener() {
			
			public void widgetSelected(SelectionEvent event) {
				boolean b = ((Button) (event.widget)).getSelection();
				if(b){
					isfile = true;
					setOptionType(ArtifactFileUtils.OPTION_IMPORT_FS);
					filePathText.setEnabled(true);
					if(filePathText.getText() == null || filePathText.getText().equals("")){
						setPageComplete(false);
//						updateStatus("Specify a Gadget file (gar file) or folder from File System"); 
					}else{
						setFileName(ArtifactFileUtils.getFileNameWithoutExtension(filePathText.getText()));
						updateStatus(null);
					}
					filePathButton.setEnabled(true);
					registryListDD.setEnabled(false);
					selectedPath.setEnabled(false);
					regPathButton.setEnabled(false);
					folderPathButton.setEnabled(false);
					folderPathText.setEnabled(false);
				}
				else{
					isfile = false ;
					setOptionType(ArtifactFileUtils.ERROR_OPTION);
					filePathText.setEnabled(false);
					filePathButton.setEnabled(false);
				}
			}
			
			public void widgetDefaultSelected(SelectionEvent event) {
				
			}
		});
        

		filePathButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				handlePathBrowseButton(filePathText, isfile);
			}
		});
        
		filePathText.addModifyListener(new ModifyListener() {
			
			public void modifyText(ModifyEvent arg0) {
				if (handleFilePathText(isfile)) {
					setFilePath(filePathText.getText());
					setFileName(ArtifactFileUtils.getFileNameWithoutExtension(filePathText.getText()));
				} else {
				}
			}
		});

        importGadgetFolderFromFS.addSelectionListener(new SelectionListener() {
			
			public void widgetSelected(SelectionEvent event) {
				boolean b = ((Button) (event.widget)).getSelection();
				if(b){
					isfile = false;
					setOptionType(ArtifactFileUtils.OPTION_IMPORT_FS);
					folderPathText.setEnabled(true);
					if(folderPathText.getText() == null || folderPathText.getText().equals("")){
						setPageComplete(false);
//						updateStatus("Specify a Gadget resource folder from File System"); 
					}else{
						String[] fileInfo = folderPathText.getText().split(Pattern.quote(Pattern.quote(File.separator)));
						setFileName(fileInfo[fileInfo.length - 1]);
						updateStatus(null);
					}
					folderPathButton.setEnabled(true);
					registryListDD.setEnabled(false);
					selectedPath.setEnabled(false);
					regPathButton.setEnabled(false);
					filePathButton.setEnabled(false);
					filePathText.setEnabled(false);
				}
				else{
					isfile = false ;
					setOptionType(ArtifactFileUtils.ERROR_OPTION);
					folderPathText.setEnabled(false);
					folderPathButton.setEnabled(false);
				}
			}
			
			public void widgetDefaultSelected(SelectionEvent event) {
				
			}
		});
        

		folderPathButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				handlePathBrowseButton(folderPathText, isfile);
			}
		});
        
		folderPathText.addModifyListener(new ModifyListener() {
			
			public void modifyText(ModifyEvent arg0) {
				if (handleFilePathText(isfile)) {
					setFilePath(folderPathText.getText());
					String[] fileInfo = folderPathText.getText().split(Pattern.quote(File.separator));
					setFileName(fileInfo[fileInfo.length - 1]);
				} else {
				}
			}
		});
		
		importFromRegistry = new Button(group, SWT.RADIO);
		importFromRegistry.setText("Import gadget collection from registry");
        gd = new GridData(GridData.FILL_HORIZONTAL);
//        gd.horizontalIndent = 10;
        importFromRegistry.setLayoutData(gd); 
        importFromRegistry.setEnabled(true);
       
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
				popUPRegistryBrowser();
				if(selectedPath.getText()!= null && !selectedPath.getText().equals("")){
					setFileName(ArtifactFileUtils.getFileNameWithoutExtension(selectedPath.getText()));
				}
				try {
					checkoutRegResource();
				} catch (Exception e1) {
					String msg = "Specified Registry Path is not valid.";
					setErrorMessage(msg);
					setPageComplete(msg == null);
					e1.printStackTrace();
				}
			}
		});
		
		selectedPath.addModifyListener(new ModifyListener() {
			
			public void modifyText(ModifyEvent arg0) {
				updateStatus(null);
				String[] fileInfo = selectedPath.getText().split("/");
				setFileName(ArtifactFileUtils.getFileNameWithoutExtension(selectedPath.getText()));
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
					if(selectedPath.getText() == null || selectedPath.getText().equals("")){
						setPageComplete(false);
//						updateStatus("Specify a Gadget collection from registry"); 
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
						filePathButton.setEnabled(false);
				}
				else{
					setOptionType(ArtifactFileUtils.ERROR_OPTION);
					registryListDD.setEnabled(false);
					selectedPath.setEnabled(false);
					regPathButton.setEnabled(false);
				}
			}
			
			public void widgetDefaultSelected(SelectionEvent arg0) {
				
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
        
        if(fileText.getText() != null && getOptionType() == ArtifactFileUtils.OPTION_NEW){
        	updateStatus(null);
        }
		initialize();
		dialogChanged();
		setControl(group);
	}


	private void initialize() {
		optNewGadget.setSelection(true);
		fileText.setEnabled(true);
		lblFromNew.setEnabled(true);

//		fileText.setText("newproxyservice");
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
			
			gadgetFile = new File(tmpFolder, info[info.length-1] );
			gadgetFile.mkdirs();
			IRegistryData selectRegistryPathData = getSelectRegistryPathData();
			if (selectRegistryPathData==null){
				throw new Exception("Registry location to import the gadget was not specified");
			}
			CAppEnvironment.getRegistryHandler().importRegistryPathToFileSystem(selectRegistryPathData, gadgetFile);
			setFilePath(gadgetFile.getPath());
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
		int type = IRegistryHandler.SELECTED_REGISTRY_PATH | IRegistryHandler.SELECTED_REGISTRY_RESOURCE;
		
		String title = "Browse registry for the gadget collection";
		String message = "Select the path of the gadget collection";
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
	

	public boolean handleFilePathText(boolean isFile) {
		boolean isPathValid = false;
		if(isFile){
			this.setFilePath(filePathText.getText());
		}else{
			this.setFilePath(folderPathText.getText());
		}
		
		String msg = null;
		String ext = null;
		File file = new File(getFilePath());
		if (!file.exists()) {
			msg = "Invalid path specified";
			isPathValid = false;
		} else {
			if(file.isFile()){
				if (getFilePath().contains(".")) {
					ext = getFilePath().substring(
							getFilePath().lastIndexOf('.'),
							getFilePath().length());
				}else {
					msg = "Invalid file specified";
				}
			} else{
				isPathValid = true;
			}
			if (ext != null) {
				if (!ext.equals(".dar")) {
					msg = "gadget file should be with the extension of .dar. Please specify the correct gadget file. ";
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
	
	public void handlePathBrowseButton(Text pathText, boolean isFile) {
		String fileName = getSavePath(isFile);
		if (fileName != null)
			pathText.setText(fileName);
		}

	private String getSavePath(boolean isFile) {
		String fileName = null;
		// FileDialog
		FileDialog fld = new FileDialog(this.getShell(), SWT.OPEN);
		fld.setFilterExtensions(new String[]{"*.dar","*.DAR"});
		DirectoryDialog dird = new DirectoryDialog(this.getShell(), SWT.OPEN);
		boolean done = false;
			// Open the File Dialog
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
	

}