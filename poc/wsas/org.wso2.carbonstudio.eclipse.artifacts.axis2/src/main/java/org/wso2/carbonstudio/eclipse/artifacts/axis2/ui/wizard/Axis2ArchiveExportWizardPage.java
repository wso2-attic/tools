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

package org.wso2.carbonstudio.eclipse.artifacts.axis2.ui.wizard;

import java.io.File;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

/**
 * @deprecated
 * @author saminda
 *
 */
public class Axis2ArchiveExportWizardPage extends WizardPage {

	private Text txtExportPath;
	private Button btnExportLocationBrowse;
	private String selectedPath;
	private IFile selectedFile;
	
	protected Axis2ArchiveExportWizardPage(String pageName, IFile selectedFile) {
	    super(pageName);
	    setSelectedFile(selectedFile);
    }

	public void createControl(Composite parent) {
		Composite composite= new Composite(parent, SWT.NONE);
		
		composite.setLayout(new GridLayout(3, false));
		Label label = new Label(composite,SWT.None);
		label.setText("Export to path");
		
		txtExportPath = new Text(composite,SWT.BORDER);
		txtExportPath.setLayoutData(getGridData(1,GridData.FILL_HORIZONTAL));
		
		btnExportLocationBrowse=new Button(composite,SWT.None);
		btnExportLocationBrowse.setText("Browse");
		
		txtExportPath.addModifyListener(new ModifyListener(){
            public void modifyText(ModifyEvent arg0) {
            	updateExportPath();
            }
		});	
		
		btnExportLocationBrowse.addSelectionListener(new SelectionListener(){
            public void widgetDefaultSelected(SelectionEvent event) {
            	widgetSelected(event);
            }
            public void widgetSelected(SelectionEvent event) {
	            btnExportLocationBrowseClicked();
            }
			
		});
		
		if (getSelectedFile()==null){
			label.setEnabled(false);
			txtExportPath.setEnabled(false);
			btnExportLocationBrowse.setEnabled(false);
			setErrorMessage("Please select an Axis2 Service Descriptor file to export");
			setPageComplete(false);
		}
		setControl(composite);
	}
	
	private void updateExportPath() {
		setSelectedPath(txtExportPath.getText());
		validate();
    }
	
	private void validate() {
		if (getSelectedPath()==null || getSelectedPath().equals("")){
			setErrorMessage("The path selected is invalid");
			setPageComplete(false);
			return;
		}
		
		
		try {
	        File file = new File(getSelectedPath());
	        if (file.exists() && file.isFile()){
		        setErrorMessage("The path selected is a file path");
		        setPageComplete(false);
		        return;
	        }
	        
        } catch (Exception e) {
	        setErrorMessage("The path selected is invalid: "+e.getMessage());
	        setPageComplete(false);
	        return;
        }
        setErrorMessage(null);
        setPageComplete(true);
    }
	
	private void btnExportLocationBrowseClicked() {
		String fileName = null;
		DirectoryDialog dlg = new DirectoryDialog(getShell());
		//dlg.setFilterExtensions(new String[]{".zip"});
	    boolean done = false;

	    while (!done) {
	      // Open the File Dialog
	      fileName = dlg.open();
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
	    if (fileName!=null){
	    	txtExportPath.setText(fileName);
	    }
    }
	private GridData getGridData(int horizontalSpan, int style){
		GridData gd = new GridData(style);
		gd.horizontalSpan=horizontalSpan;
		return gd;
	}

	public void setSelectedPath(String selectedPath) {
	    this.selectedPath = selectedPath;
    }

	public String getSelectedPath() {
	    return selectedPath;
    }

	public void setSelectedFile(IFile selectedFile2) {
	    this.selectedFile = selectedFile2;
    }

	public IFile getSelectedFile() {
	    return selectedFile;
    }
}
