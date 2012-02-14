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

package org.wso2.carbonstudio.eclipse.capp.artifact.carbon.ui.bundle.ui.wizard;


import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.wso2.carbonstudio.eclipse.capp.artifact.carbon.ui.bundle.Activator;
import org.wso2.carbonstudio.eclipse.capp.core.utils.ArtifactFileUtils;
import org.wso2.carbonstudio.eclipse.carbon.uibundle.ui.CarbonUIBundleWizard;
import org.wso2.carbonstudio.eclipse.carbon.uibundle.utils.Constants;
import org.wso2.carbonstudio.eclipse.logging.core.ICarbonStudioLog;
import org.wso2.carbonstudio.eclipse.logging.core.Logger;

import org.eclipse.pde.internal.ui.wizards.IProjectProvider;
import org.eclipse.pde.internal.ui.wizards.NewWizard;
import org.eclipse.pde.internal.ui.wizards.plugin.NewProjectCreationOperation;
import org.eclipse.pde.internal.ui.wizards.plugin.PluginContentPage;
import org.eclipse.pde.internal.ui.wizards.plugin.PluginFieldData;
import org.eclipse.pde.ui.IPluginContentWizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkingSet;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;



public class NewCarbonUIBundleWizardPage extends WizardPage {
	private static ICarbonStudioLog log=Logger.getLog(Activator.PLUGIN_ID);

	WizardNewFileCreationPage wizard;
	private IProject selectedProject;
	private Combo projectListCombo;
	private IStructuredSelection selection;
	private List<Object> selectedResources;
	private String className;
	private CarbonUIBundleWizard carbonUIBundleWizard;
	
	public NewCarbonUIBundleWizardPage(WizardNewFileCreationPage wizardNewFileCreationPage, IProject p, IStructuredSelection cselection) {
		super("wizardPage");
		setDescription("Select Carbon UI Bundle");
        this.wizard=wizardNewFileCreationPage;
        this.selectedProject = p;
        this.selection = cselection;
	}

	public void createControl(Composite parent) {
		final Group group = new Group(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		layout.verticalSpacing = 9;
		group.setLayout(layout);	
		
		GridData gd = new GridData();
		gd.horizontalSpan=3;	  
		
		Label lblFrom = new Label(group, SWT.NULL);
		lblFrom.setText("Create Carbon UI Bundle artifact from:");
        lblFrom.setLayoutData(gd);
		
		gd = new GridData();
		Label fromWSLabel = new Label(group, SWT.NULL);
		fromWSLabel.setText("From workspace");
		fromWSLabel.setLayoutData(gd);
		
		projectListCombo = new Combo(group, SWT.DROP_DOWN | SWT.READ_ONLY);
		gd = new GridData();
		gd.widthHint = 310;
		projectListCombo.setLayoutData(gd);
		projectListCombo.setEnabled(true);
		
		fillProjectListCombo();
		
		if (projectListCombo.getSelectionIndex()!=-1){
			IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectListCombo.getText());
			try {
	            if (project.hasNature("org.eclipse.jdt.core.javanature")){
	            	getSelectedResources().clear();
	            	getSelectedResources().add(project);
	            	setFileName(project.getName());
	            }
	        } catch (CoreException e) {
	            log.error(e);
	        }
		}
		
		final Button newCarbonUIBundleButton = new Button(group, SWT.PUSH);
		newCarbonUIBundleButton.setText("New...");
		gd = new GridData();
		gd.widthHint = 100; 
		newCarbonUIBundleButton.setLayoutData(gd);
		newCarbonUIBundleButton.setEnabled(true);
		
		projectListCombo.addSelectionListener(new SelectionListener() {
			
			public void widgetSelected(SelectionEvent arg0) {
				IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectListCombo.getText());
				try {
                    if (project.hasNature("org.eclipse.jdt.core.javanature")){
                    	getSelectedResources().clear();
                    	getSelectedResources().add(project);
                    	setFileName(project.getName());
                    }
                } catch (CoreException e) {
                    log.error(e);
                }
				
			}
			
			public void widgetDefaultSelected(SelectionEvent arg0) {
				
			}
		});
		
		if(projectListCombo.getText() != null && !projectListCombo.getText().equals("")){
			setPageComplete(true);
			setFileName(projectListCombo.getText());
		}else{
			setPageComplete(false);
		}
		
		newCarbonUIBundleButton.addSelectionListener(new SelectionListener() {
			
			public void widgetSelected(SelectionEvent arg0) {
				carbonUIBundleWizard = new CarbonUIBundleWizard();
				carbonUIBundleWizard.init(PlatformUI.getWorkbench(), selection);
				WizardDialog wizardDialog = new WizardDialog(group.getShell(), carbonUIBundleWizard);
				if (wizardDialog.open()==Window.OK){
					setPageComplete(true);
					projectListCombo.add(carbonUIBundleWizard.getProjectName());
					projectListCombo.setText(carbonUIBundleWizard.getProjectName());
					IProject prj = ResourcesPlugin.getWorkspace().getRoot().getProject(carbonUIBundleWizard.getProjectName());
					getSelectedResources().clear();
					getSelectedResources().add(prj);
					setFileName(carbonUIBundleWizard.getProjectName());
				}
			}
			
			public void widgetDefaultSelected(SelectionEvent arg0) {
				
			}
		});

		setControl(group);
	}

	public void fillProjectListCombo(){
		ArrayList<IProject> relevantProjects = getProjects();
		for (IProject prjct : relevantProjects) {
			projectListCombo.add(prjct.getName());
		}
		
		if (projectListCombo.getItemCount()>0 && projectListCombo.getSelectionIndex() == -1) {
			projectListCombo.select(0);
		}
		
	}

	public ArrayList<IProject> getProjects(){
		
		IProject[] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
		ArrayList<IProject> filterProjectList = new ArrayList<IProject>();
		for (IProject prj : projects) {
			try {
	            if (!prj.isOpen() || !prj.hasNature(Constants.PROJECT_NATURE_CARBON_UI_PROJECT) ){
	            	continue;
	            }
            } catch (CoreException e1) {
	            e1.printStackTrace();
	            continue;
            }
            if(!filterProjectList.contains(prj)){
				filterProjectList.add(prj);
			}
		}
		
		return filterProjectList;
	}

	
	private void updateStatus(String message) {
		setErrorMessage(message);
		setPageComplete(message == null);
	}


	public void setSelectedResources(List<Object> selectedResources) {
	    this.selectedResources = selectedResources;
    }

	public List<Object> getSelectedResources() {
		if (selectedResources==null){
			selectedResources=new ArrayList<Object>();
		}
	    return selectedResources;
    }
	
	private void setFileName(String fileName){
		if(ArtifactFileUtils.IsSpecialCharactersExist(fileName))
			fileName=fileName.replace(".", "_");
			wizard.setFileName(fileName);
		
	}
	

}