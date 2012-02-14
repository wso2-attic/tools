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

package org.wso2.carbonstudio.eclipse.capp.artifact.axis2.ui.wizard;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.wso2.carbonstudio.eclipse.capp.artifact.axis2.core.Axis2ArtifactHandler;

/**
 * @deprecated
 * @author saminda
 *
 */
public class NewAxis2SourceFolderWizardPage extends WizardPage {

	private Combo cmbProject;
	private List<IProject> cappProjectList;
	private Text txtSourcePathName;
	private IProject selectedProject;
	private String sourcePathName;
	
	protected NewAxis2SourceFolderWizardPage(String pageName, IProject selectedProject) {
	    super(pageName);
	    init();
	    this.selectedProject=selectedProject;
    }

	private void init(){
		setTitle("New Axis2 Source Path");
		setDescription("Create new axis2 source path");
		cappProjectList=new ArrayList<IProject>();
		updateSourcesList();
	}
	
	public void createControl(Composite parent) {
		Composite composite= new Composite(parent, SWT.NONE);
		composite.setLayout(new GridLayout(2, false));
		
		Label label = new Label(composite,SWT.None);
		label.setText("Project");
		
		cmbProject = new Combo(composite,SWT.READ_ONLY);
		cmbProject.setLayoutData(getGridData(1,GridData.FILL_HORIZONTAL));

		label = new Label(composite,SWT.None);
		label.setText("Source Path");
		
		txtSourcePathName = new Text(composite,SWT.BORDER);
		txtSourcePathName.setLayoutData(getGridData(1,GridData.FILL_HORIZONTAL));
		
		cmbProject.addModifyListener(new ModifyListener(){
            public void modifyText(ModifyEvent arg0) {
	            updateSelectedProject();
            }
		});
		
		cmbProject.addSelectionListener(new SelectionListener(){
            public void widgetDefaultSelected(SelectionEvent event) {
	            updateSelectedProject();
            }
            public void widgetSelected(SelectionEvent event) {
            	widgetDefaultSelected(event);	            
            }
		});

		txtSourcePathName.addModifyListener(new ModifyListener(){

            public void modifyText(ModifyEvent arg0) {
            	updateSourcePathName();
            }

			
		});
		fillProjectCombo();
		setPageComplete(false);
		txtSourcePathName.setFocus();
		setControl(composite);
	}

	private void validate(){
		if (cmbProject.getItemCount()==0){
			setErrorMessage("There are no CApp project present in the workspace");
			setPageComplete(false);
			if (!txtSourcePathName.isFocusControl()){
				cmbProject.setFocus();
			}
			return;
		}
		if (cmbProject.getSelectionIndex()==-1){
			setErrorMessage("Select a CApp project");
			setPageComplete(false);
			if (!txtSourcePathName.isFocusControl()){
				cmbProject.setFocus();
			}
			return;
		}
		
		if (txtSourcePathName.getText().trim().equalsIgnoreCase("")){
			setErrorMessage("Enter the name of the axis2 source path you wish to create");
			setPageComplete(false);
			txtSourcePathName.setFocus();
			return;
		}
		
		setErrorMessage(null);
		setPageComplete(true);
	}
	
	private GridData getGridData(int horizontalSpan, int style){
		GridData gd = new GridData(style);
		gd.horizontalSpan=horizontalSpan;
		return gd;
	}
	
	private void updateSourcesList(){
		cappProjectList.clear();
		IProject[] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
		for (IProject project : projects) {
	        if (Axis2ArtifactHandler.getCAppArtifactManager().isCAppProject(project)){
	        	cappProjectList.add(project);
	        }
        }
	}
	
	private void fillProjectCombo(){
		cmbProject.removeAll();
		for(IProject project: cappProjectList){
			cmbProject.add(project.getName());
			if (getSelectedProject()!=null && project.getName().equals(getSelectedProject().getName())){
				cmbProject.select(cmbProject.getItemCount()-1);
			}
		}
		if (cmbProject.getSelectionIndex()==-1 && cmbProject.getItemCount()>0){
			cmbProject.select(0);
		}
	}
	
	private void updateSelectedProject(){
		if (cmbProject.getSelectionIndex()!=-1){
			setSelectedProject(cmbProject.getText());
		}
		validate();
	}

	private void updateSourcePathName() {
		setSourcePathName(txtSourcePathName.getText());
		validate();
    }

	public void setSelectedProject(String selectedProjectName) {
	    this.selectedProject = ResourcesPlugin.getWorkspace().getRoot().getProject(selectedProjectName);
    }

	public IProject getSelectedProject() {
	    return selectedProject;
    }

	public void setSourcePathName(String serviceName) {
	    this.sourcePathName = serviceName;
    }

	public String getSourcePathName() {
	    return sourcePathName;
    }
	
}
