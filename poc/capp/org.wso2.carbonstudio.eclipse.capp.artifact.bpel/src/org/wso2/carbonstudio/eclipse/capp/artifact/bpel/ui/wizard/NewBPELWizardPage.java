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

package org.wso2.carbonstudio.eclipse.capp.artifact.bpel.ui.wizard;


import java.io.File;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
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
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.wso2.carbonstudio.eclipse.capp.artifact.bpel.core.BPELHandlerRequester;
import org.wso2.carbonstudio.eclipse.capp.core.utils.ArtifactFileUtils;



public class NewBPELWizardPage extends WizardPage {
	private Button newbpelButton;
	private Button optFromWorksace;
	private Button importBpelArchive;
	WizardNewFileCreationPage wizard;
	private Combo comboWorkspaceBPELWorkflow;
	private Text archivePathText;
	private Button archivePathButton;
	private String selectedWorkspaceBPELWorkflow;
	private String archivePath;
	
	public static final int WORKFLOW_FROM_WORKSPACE=0;
	public static final int NEW_WORKFLOW=1;
	public static final int WORKFLOW_FROM_FILESYSTEM=2;
	
	private int selectedType;
	
	public String getSelectedWorkspaceBPELWorkflow() {
		return selectedWorkspaceBPELWorkflow;
	}

	public IProject getSelectedWorkspaceBPELWorkflowProject() {
		return getSelectedWorkspaceBPELWorkflow()==null? null:ResourcesPlugin.getWorkspace().getRoot().getProject(getSelectedWorkspaceBPELWorkflow());
	}

	
	public void setSelectedWorkspaceBPELWorkflow(String selectedWorkspacePath) {
		this.selectedWorkspaceBPELWorkflow = selectedWorkspacePath;
	}


	public String getArchivePath() {
		return archivePath;
	}


	public void setArchivePath(String archivePath) {
		this.archivePath = archivePath;
	}


	public NewBPELWizardPage(WizardNewFileCreationPage wizardNewFileCreationPage) {
		super("wizardPage");
		setDescription("Select BPEL WorkFlow");
        this.wizard=wizardNewFileCreationPage;

	}

	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		layout.verticalSpacing = 9;
		container.setLayout(layout);		  
		Label lblFrom = new Label(container, SWT.NULL);
		
		GridData gd = new GridData();
		gd.horizontalSpan=3;
		lblFrom.setText("Create BPEL WorkFlow from:");
        lblFrom.setLayoutData(gd);
		
//        optNewbpel = new Button(container,SWT.RADIO);
//                       
//        optNewbpel.setText("New BPEL Workflow");
//        gd = new GridData();
////        gd.horizontalIndent = 10;
//        gd.horizontalSpan=3;
//        optNewbpel.setLayoutData(gd); 
//                   
//		optNewbpel.addSelectionListener((new SelectionListener() {
//			
//			public void widgetSelected(SelectionEvent event) {
//				boolean b = ((Button) (event.widget)).getSelection();
//				if(b){
//					comboWorkspaceBPELWorkflow.setEnabled(false);
//					archivePathText.setEnabled(false);
//					archivePathButton.setEnabled(false);
//				}
//				setSelectedType(NEW_WORKFLOW);
//				dialogChanged();
//			}
//			
//			public void widgetDefaultSelected(SelectionEvent e) {
//				widgetSelected(e);
//			}
//		}));
		
		optFromWorksace = new Button(container, SWT.RADIO);
		optFromWorksace.setText("BPEL workflow in workspace");
        gd = new GridData();
        gd.horizontalSpan=1;
        optFromWorksace.setLayoutData(gd);
        optFromWorksace.setSelection(true);
        
        comboWorkspaceBPELWorkflow = new Combo(container, SWT.READ_ONLY | SWT.BORDER);
        gd = new GridData();
//		gd.heightHint = 18;
		gd.horizontalIndent = 20;
//		gd.horizontalSpan = 2;
		gd.widthHint = 360;
        comboWorkspaceBPELWorkflow.setLayoutData(gd);
        fillBPELWorkflowProjects();
        
        newbpelButton = new Button(container, SWT.PUSH);
        newbpelButton.setText("New BPEL Project...");
        gd = new GridData();
		gd.widthHint = 150;
		newbpelButton.setLayoutData(gd);
		
//		gd=new GridData();
//        gd.horizontalSpan=3;
//        new Label(container,SWT.NULL).setLayoutData(gd);
        
        comboWorkspaceBPELWorkflow.addModifyListener(new ModifyListener() {
			
			public void modifyText(ModifyEvent arg0) {
				setSelectedWorkspaceBPELWorkflow(comboWorkspaceBPELWorkflow.getText());
				dialogChanged();
				setBPELProjectName(comboWorkspaceBPELWorkflow.getText());
			}
		});
        
        newbpelButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				setSelectedType(NEW_WORKFLOW);
				IProject bpelWorkflow =
				                        BPELHandlerRequester.getHandler()
				                                            .createNewBPELProject(getShell());
				if(!bpelWorkflow.getName().equals("") && bpelWorkflow.getName() != null){
					setSelectedWorkspaceBPELWorkflow(bpelWorkflow.getName());
					comboWorkspaceBPELWorkflow.add(bpelWorkflow.getName());
					comboWorkspaceBPELWorkflow.setText(bpelWorkflow.getName());
					comboWorkspaceBPELWorkflow.setEnabled(true);
				}
			}
		});
        
		optFromWorksace.addSelectionListener(new SelectionListener() {
			
			public void widgetSelected(SelectionEvent event) {
				boolean b = ((Button) (event.widget)).getSelection();
				if(b){
					comboWorkspaceBPELWorkflow.setEnabled(true);
					archivePathText.setEnabled(false);
					archivePathButton.setEnabled(false);
					newbpelButton.setEnabled(true);
					if(comboWorkspaceBPELWorkflow.getText() != null && !comboWorkspaceBPELWorkflow.getText().equals("")){
						setBPELProjectName(comboWorkspaceBPELWorkflow.getText());
					}
				}
				setSelectedType(WORKFLOW_FROM_WORKSPACE);
				dialogChanged();
			}
			
			public void widgetDefaultSelected(SelectionEvent arg0) {
				
			}
		});
		if (comboWorkspaceBPELWorkflow.getItemCount()>0){
			comboWorkspaceBPELWorkflow.select(0);
		}
		importBpelArchive = new Button(container, SWT.RADIO);
		importBpelArchive.setText("Import BPEL WorkFlow");
        gd = new GridData();
        gd.horizontalSpan=1;
        importBpelArchive.setLayoutData(gd);
        
        archivePathText = new Text(container, SWT.BORDER);
        gd = new GridData();
        gd.horizontalIndent = 20;
//        gd.heightHint = 18;
		gd.widthHint = 350;
		archivePathText.setLayoutData(gd);
		archivePathText.setEnabled(false);
		
		archivePathText.addModifyListener(new ModifyListener() {
            public void modifyText(ModifyEvent arg0) {
				setArchivePath(archivePathText.getText());
				setBPELProjectName(ArtifactFileUtils.getFileNameWithoutExtension(archivePathText.getText()));
				dialogChanged();
			}
		});
        
		gd = new GridData();
//		gd.heightHint = 27;
		gd.widthHint = 150;
		archivePathButton = new Button(container,  SWT.PUSH);
		archivePathButton.setText("Browse...");
		archivePathButton.setLayoutData(gd);
		archivePathButton.setEnabled(false);
		
		archivePathButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				handlePathBrowseButton(archivePathText, true);
			}
		});
        
        importBpelArchive.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				boolean b = ((Button) (event.widget)).getSelection();
				if(b){
					comboWorkspaceBPELWorkflow.setEnabled(false);
					archivePathText.setEnabled(true);
					archivePathButton.setEnabled(true);
					newbpelButton.setEnabled(false);
				}
				setSelectedType(WORKFLOW_FROM_FILESYSTEM);
				dialogChanged();
				if(archivePathText.getText() == null || archivePathText.getText().equals("")){
					setErrorMessage(null);
					setPageComplete(false);
				}
			}
		});
		
		initialize();
		dialogChanged();
		setControl(container);
	}

	public void handlePathBrowseButton(Text pathText, Boolean isFile) {
		String fileName = getSavePath(isFile);
		if (fileName != null)
			pathText.setText(fileName);
	}

	private String getSavePath(boolean isFile) {
		String fileName = null;
		// FileDialog
		FileDialog fld = new FileDialog(this.getShell(), SWT.OPEN);
		fld.setFilterExtensions(new String[]{"*.zip"});
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

	private void initialize() {
//		optNewbpel.setSelection(true);
//		setSelectedType(NEW_WORKFLOW);
	}



	private void dialogChanged() {
		if (getSelectedType()==WORKFLOW_FROM_WORKSPACE && getSelectedWorkspaceBPELWorkflowProject()==null){
			updateStatus("Please select the project containing the bpel workflow");
			return;
		}
		if (getSelectedType()==WORKFLOW_FROM_FILESYSTEM && (getArchivePath()==null || getArchivePath().equals("") || !new File(getArchivePath()).exists()) || (getArchivePath()!=null && !getArchivePath().toLowerCase().endsWith(".zip"))){
			updateStatus("The file system bpel workflow specified seems to be invalid");
			return;
		}
		
		updateStatus(null);
	}

	private void updateStatus(String message) {
		setErrorMessage(message);
		setPageComplete(message == null);
	}

	public void setBPELProjectName(String fileName) {
		String f = wizard.getFileName();
		if (ArtifactFileUtils.IsSpecialCharactersExist(fileName))
			fileName = fileName.replace(".", "_");
		// if (f==null || f.equals("")){
		wizard.setFileName(fileName);
		// }
	}


	public void setSelectedType(int selectedType) {
	    this.selectedType = selectedType;
    }


	public int getSelectedType() {
	    return selectedType;
    }
	
	private void fillBPELWorkflowProjects(){
		comboWorkspaceBPELWorkflow.removeAll();
		List<IProject> bpelWorkflowProjects = BPELHandlerRequester.getHandler().getBPELWorkflowProjects();
		for (IProject project : bpelWorkflowProjects) {
	        comboWorkspaceBPELWorkflow.add(project.getName());
        }
	}
}