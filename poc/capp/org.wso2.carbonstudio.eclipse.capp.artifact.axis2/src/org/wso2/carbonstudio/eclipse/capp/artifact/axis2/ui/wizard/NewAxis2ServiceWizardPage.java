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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.search.IJavaSearchConstants;
import org.eclipse.jdt.internal.core.SourceType;
import org.eclipse.jdt.internal.core.search.JavaWorkspaceScope;
import org.eclipse.jdt.internal.ui.dialogs.FilteredTypesSelectionDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;
import org.wso2.carbonstudio.eclipse.capp.artifact.axis2.Activator;
import org.wso2.carbonstudio.eclipse.capp.artifact.axis2.core.Axis2ArtifactHandler;
import org.wso2.carbonstudio.eclipse.capp.artifact.axis2.model.Axis2ArtifactLocationNode;
import org.wso2.carbonstudio.eclipse.capp.artifact.axis2.utils.Axis2ProjectUtils;
import org.wso2.carbonstudio.eclipse.capp.artifact.axis2.utils.SettingsConstants;
import org.wso2.carbonstudio.eclipse.capp.core.artifacts.IArtifactSourcePath;
import org.wso2.carbonstudio.eclipse.logging.core.ICarbonStudioLog;
import org.wso2.carbonstudio.eclipse.logging.core.Logger;

/**
 * @deprecated
 * @author saminda
 *
 */
public class NewAxis2ServiceWizardPage extends WizardPage {
	private static ICarbonStudioLog log=Logger.getLog(Activator.PLUGIN_ID);

	private Map<IProject,List<Axis2ArtifactLocationNode>> axis2SourcesList;
	private Combo cmbSourcePath;
	private Text txtServiceName;

	private Text txtClassName;
	private Button btnClassBrowse;
	private Combo cmbServiceProject;
	private IProject serviceProject;

	private Combo cmbProject;
	private IProject selectedProject;
	private Axis2ArtifactLocationNode selectedPath;
	private String serviceName;
	private String className;
	
	protected NewAxis2ServiceWizardPage(String pageName, IProject selectedProject, Axis2ArtifactLocationNode selectedPath) {
	    super(pageName);
	    init();
	    this.selectedProject=selectedProject;
	    this.selectedPath=selectedPath;
    }

	private void init(){
		setTitle("New Axis2 Service");
		setDescription("Create new axis2 service");
		axis2SourcesList=new HashMap<IProject, List<Axis2ArtifactLocationNode>>();
		updateSourcesList();
	}
	
	public void createControl(Composite parent) {
		Composite composite= new Composite(parent, SWT.NONE);
		composite.setLayout(new GridLayout(3, false));
		
		Label label = new Label(composite,SWT.None);
		label.setText("Project");
		
		cmbProject = new Combo(composite,SWT.READ_ONLY);
		cmbProject.setLayoutData(getGridData(2,GridData.FILL_HORIZONTAL));

		label = new Label(composite,SWT.None);
		label.setText("Source Path");
		
		cmbSourcePath = new Combo(composite,SWT.None);
		cmbSourcePath.setLayoutData(getGridData(1,GridData.FILL_HORIZONTAL));
		
		new Label(composite,SWT.HORIZONTAL | SWT.SEPARATOR).setLayoutData(getGridData(3,GridData.FILL_HORIZONTAL,20));
		
		label = new Label(composite,SWT.None);
		label.setText("Service name");
		
		txtServiceName = new Text(composite,SWT.BORDER);
		txtServiceName.setLayoutData(getGridData(2,GridData.FILL_HORIZONTAL));
		
		new Label(composite,SWT.HORIZONTAL | SWT.SEPARATOR).setLayoutData(getGridData(3,GridData.FILL_HORIZONTAL,20));
		
		label = new Label(composite,SWT.None);
		label.setText("Fully qualified class");
		
		txtClassName = new Text(composite,SWT.BORDER);
		txtClassName.setLayoutData(getGridData(1,GridData.FILL_HORIZONTAL));
		
		btnClassBrowse=new Button(composite,SWT.None);
		btnClassBrowse.setText("Browse");
		
		label = new Label(composite,SWT.None);
		label.setText("Service source project");
		
		cmbServiceProject = new Combo(composite,SWT.READ_ONLY);
		cmbServiceProject.setLayoutData(getGridData(2,GridData.FILL_HORIZONTAL));
		
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
		
		cmbSourcePath.addModifyListener(new ModifyListener(){
            public void modifyText(ModifyEvent arg0) {
	            updateSelectedSource();
            }
		});
		cmbSourcePath.addSelectionListener(new SelectionListener(){
            public void widgetDefaultSelected(SelectionEvent event) {
	            updateSelectedSource();
            }
            public void widgetSelected(SelectionEvent event) {
            	widgetDefaultSelected(event);	            
            }
		});

		txtServiceName.addModifyListener(new ModifyListener(){
            public void modifyText(ModifyEvent arg0) {
            	updateServiceName();
            }
		});
		
		txtClassName.addModifyListener(new ModifyListener(){
            public void modifyText(ModifyEvent arg0) {
            	updateClassName();
            }
        });
		
		btnClassBrowse.addSelectionListener(new SelectionListener(){
            public void widgetDefaultSelected(SelectionEvent event) {
	            classNameBrowseClicked();
            }
            public void widgetSelected(SelectionEvent event) {
            	widgetDefaultSelected(event);	            
            }
		});
		
		cmbServiceProject.addModifyListener(new ModifyListener(){
            public void modifyText(ModifyEvent arg0) {
            	updateServiceProject();
            }
        });
		
		
		fillProjectCombo();
		updateClassName();
		setPageComplete(false);
		txtServiceName.setFocus();
		setControl(composite);
	}

	private void validate(){
		if (cmbProject.getItemCount()==0){
			setErrorMessage("There are no CApp project present in the workspace");
			setPageComplete(false);
			if (!txtServiceName.isFocusControl() && cmbSourcePath.isFocusControl()){
				cmbProject.setFocus();
			}
			return;
		}
		if (cmbProject.getSelectionIndex()==-1){
			setErrorMessage("Select a CApp project");
			setPageComplete(false);
			if (!txtServiceName.isFocusControl() && !cmbSourcePath.isFocusControl()){
				cmbProject.setFocus();
			}
			return;
		}
		
		if (cmbSourcePath.getText().trim().equals("")){
			setErrorMessage("Select a CApp Axis2 source folder or type in a new axis2 source folder name");
			setPageComplete(false);
			if (!txtServiceName.isFocusControl()){
				cmbSourcePath.setFocus();
			}
			return;
		}
		
		if (txtServiceName.getText().trim().equalsIgnoreCase("")){
			setErrorMessage("Enter the name of the service you wish to create");
			setPageComplete(false);
			if ((cmbSourcePath.getSelectionIndex()!=-1 || !cmbSourcePath.isFocusControl()) && !txtClassName.isFocusControl()){
				txtServiceName.setFocus();
			}
			return;
		}
		
		if (txtClassName.getText().trim().equalsIgnoreCase("")){
			setErrorMessage("Enter a fully qualified class name to create the axis2 service from");
			setPageComplete(false);
			if ((cmbSourcePath.getSelectionIndex()!=-1 || !cmbSourcePath.isFocusControl()) && !txtServiceName.isFocusControl()){
				txtClassName.setFocus();
			}
			return;
		}
		
		if (!Axis2ProjectUtils.isClassNameValid(getClassName())){
			setErrorMessage("The class name appears to be invalid");
			setPageComplete(true);
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
	
	private GridData getGridData(int horizontalSpan, int style, int topbottomSpacing){
		GridData gd = getGridData(horizontalSpan, style);
		gd.heightHint=topbottomSpacing;
		return gd;
	}
	
	
	private void updateSourcesList(){
		axis2SourcesList.clear();
		IProject[] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
		for (IProject project : projects) {
	        if (Axis2ArtifactHandler.getCAppArtifactManager().isCAppProject(project)){
	        	List<IArtifactSourcePath> artifactPaths = Axis2ArtifactHandler.getCAppArtifactManager().getArtifactPaths(project, SettingsConstants.ID);
        		List<Axis2ArtifactLocationNode> list=new ArrayList<Axis2ArtifactLocationNode>(); 
	        	for (Object o : artifactPaths) {
	                if (o instanceof Axis2ArtifactLocationNode){
	                	list.add((Axis2ArtifactLocationNode)o);
	                }
                }
	        	axis2SourcesList.put(project, list);
	        }
        }
	}
	
	private void fillProjectCombo(){
		cmbProject.removeAll();
		for(IProject project: axis2SourcesList.keySet()){
			cmbProject.add(project.getName());
			if (getSelectedProject()!=null && project.getName().equals(getSelectedProject().getName())){
				cmbProject.select(cmbProject.getItemCount()-1);
			}
		}
		if (cmbProject.getSelectionIndex()==-1 && cmbProject.getItemCount()>0){
			cmbProject.select(0);
		}
	}
	
	private void fillSourceCombo(){
		cmbSourcePath.removeAll();
		for(IProject project: axis2SourcesList.keySet()){
			if (cmbProject.getText().equals(project.getName())){
				for(Axis2ArtifactLocationNode locationNode:axis2SourcesList.get(project)){
					cmbSourcePath.add(locationNode.toString());
					if (getSelectedPath()!=null && getSelectedPath().getPath().equals(locationNode.getPath())){
						cmbSourcePath.select(cmbSourcePath.getItemCount()-1);
					}
				}
				break;
			}
		}
		if (cmbSourcePath.getSelectionIndex()==-1 && cmbSourcePath.getItemCount()>0){
			cmbSourcePath.select(0);
		}
	}

	private void fillServiceProjectCombo(){
		cmbServiceProject.removeAll();
		cmbServiceProject.add("<New Java Project>");
		String projectName=null;
		if (getServiceProject()!=null){
			projectName = getServiceProject().getName();
		}
		if (Axis2ProjectUtils.isClassNameValid(getClassName())){
			IProject[] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
			for (IProject project : projects) {
	            try {
	                if (project.hasNature("org.eclipse.jdt.core.javanature")){
	                	IJavaProject javaProject = JavaCore.create(project);
	                	if (javaProject.findType(getClassName())!=null){
	                		cmbServiceProject.add(project.getName());
                			if (project.getName().equals(projectName)){
                				cmbServiceProject.select(cmbServiceProject.getItemCount()-1);
                			}
	                	}
	                }
                } catch (CoreException e) {
	                log.error(e);
                }
            }
		}
		if (cmbServiceProject.getSelectionIndex()<1){
    		if (cmbServiceProject.getItemCount()>1){
    			cmbServiceProject.select(1);
    		}else if (cmbServiceProject.getItemCount()>0){
    			cmbServiceProject.select(0);
    		}
		}
	}
	
	private void updateSelectedProject(){
		if (cmbProject.getSelectionIndex()!=-1){
			setSelectedProject(cmbProject.getText());
		}
		fillSourceCombo();
		validate();
	}


	private void updateSelectedSource(){
		if (cmbSourcePath.getText().trim()!=null){
			setSelectedPath();
		}
		validate();
	}
	

	private void updateServiceName() {
		setServiceName(txtServiceName.getText());
		validate();
    }
	
	private void updateClassName(){
		String[] classNameSplit;
		String possibleServiceName = null;
		if (getClassName()!=null){
			classNameSplit = getClassName().split("\\.");
			possibleServiceName=classNameSplit[classNameSplit.length-1];
		}
		setClassName(txtClassName.getText().trim());
		cmbServiceProject.setEnabled(!getClassName().equals(""));
		if (getServiceName()==null || getServiceName().equals(possibleServiceName)){
			classNameSplit = getClassName().split("\\.");
			txtServiceName.setText(classNameSplit[classNameSplit.length-1]);
		}
		fillServiceProjectCombo();
		validate();
	}
	
	private void updateServiceProject(){
		if (cmbServiceProject.getSelectionIndex()==0){
			setServiceProject(null);
		}else{
			if (cmbServiceProject.getSelectionIndex()>0){
				setServiceProject(ResourcesPlugin.getWorkspace().getRoot().getProject(cmbServiceProject.getText()));
			}
		}
	}
	
	private void classNameBrowseClicked(){
		FilteredTypesSelectionDialog dialog = new FilteredTypesSelectionDialog(Display.getCurrent().getActiveShell(),true,
		                                                                       PlatformUI.getWorkbench().getProgressService(),new JavaWorkspaceScope(),IJavaSearchConstants.CLASS);
		dialog.setTitle("Axis2 Service Class");
		dialog.setMessage("Select a java class to create the axis2 service from");

		if (dialog.open()==Window.OK){
			SourceType firstResult = (SourceType) dialog.getFirstResult();
            IJavaProject p=(IJavaProject)firstResult.getAncestor(2);
            setServiceProject(p.getProject());
            txtClassName.setText(firstResult.getFullyQualifiedName());
		}
	}
	
	public void setSelectedPath() {
		if (cmbSourcePath.getSelectionIndex()==-1 && !cmbSourcePath.getText().trim().equals("")){
			this.selectedPath=new Axis2ArtifactLocationNode(getSelectedProject(), cmbSourcePath.getText());
		}else{
			if (cmbSourcePath.getSelectionIndex()==-1){
				this.selectedPath=null;
			}else{
    			List<Axis2ArtifactLocationNode> projectSourceList = getProjectSourceList(getSelectedProject());
    			this.selectedPath = projectSourceList.get(cmbSourcePath.getSelectionIndex());
			}
		}
    }

	public Axis2ArtifactLocationNode getSelectedPath() {
	    return selectedPath;
    }

	public void setSelectedProject(String selectedProjectName) {
	    this.selectedProject = ResourcesPlugin.getWorkspace().getRoot().getProject(selectedProjectName);
    }

	public IProject getSelectedProject() {
	    return selectedProject;
    }
	
	private List<Axis2ArtifactLocationNode> getProjectSourceList(IProject selectedProject){
		for(IProject project: axis2SourcesList.keySet()){
			if (selectedProject.getName().equals(project.getName())){
				return axis2SourcesList.get(project);
			}
		}
		return null;
	}

	public void setServiceName(String serviceName) {
	    this.serviceName = serviceName;
    }

	public String getServiceName() {
	    return serviceName;
    }

	public void setClassName(String className) {
	    this.className = className;
    }

	public String getClassName() {
	    return className;
    }

	public void setServiceProject(IProject serviceProject) {
	    this.serviceProject = serviceProject;
    }

	public IProject getServiceProject() {
	    return serviceProject;
    }
	
}
