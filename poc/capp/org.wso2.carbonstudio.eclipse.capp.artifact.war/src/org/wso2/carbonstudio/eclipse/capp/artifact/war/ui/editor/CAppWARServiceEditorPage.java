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

package org.wso2.carbonstudio.eclipse.capp.artifact.war.ui.editor;

import java.util.ArrayList;
import java.util.Arrays;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.search.IJavaSearchConstants;
import org.eclipse.jdt.internal.core.SourceType;
import org.eclipse.jdt.internal.core.search.JavaWorkspaceScope;
import org.eclipse.jdt.internal.ui.dialogs.FilteredTypesSelectionDialog;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.jface.window.Window;
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
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.editor.FormPage;
import org.eclipse.ui.forms.widgets.ExpandableComposite;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.model.WorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.eclipse.ui.part.FileEditorInput;
import org.wso2.carbonstudio.eclipse.capp.artifact.war.Activator;
import org.wso2.carbonstudio.eclipse.capp.artifact.war.core.WARArtifactHandler;
import org.wso2.carbonstudio.eclipse.capp.artifact.war.model.WARSourceDescriptor;
import org.wso2.carbonstudio.eclipse.capp.artifact.war.utils.WARServiceSourceDescriptorUtils;
import org.wso2.carbonstudio.eclipse.capp.artifact.war.utils.WARProjectUtils;
import org.wso2.carbonstudio.eclipse.capp.core.artifacts.manager.ICAppArtifactManager;
import org.wso2.carbonstudio.eclipse.capp.core.artifacts.manager.IServerRole;
import org.wso2.carbonstudio.eclipse.logging.core.ICarbonStudioLog;
import org.wso2.carbonstudio.eclipse.logging.core.Logger;

public class CAppWARServiceEditorPage extends FormPage implements IResourceChangeListener {
	private static ICarbonStudioLog log=Logger.getLog(Activator.PLUGIN_ID);


	private FormToolkit toolkit;
	private ScrolledForm form;
	private Text txtServiceName;
	private Text txtClassName;
	private Button btnClassBrowse;
	private Combo cmbServiceProject;
	private Button btnServiceProjectDependencies;
	private CheckboxTableViewer lstViewProjectReferences;
	private Label lblReferenceProjects;
	private Button btnAddProjectDependecy;
	private Button btnRemoveProjectDependecy;
	private Label lblReferenceLibraries;
	private CheckboxTableViewer lstViewLibraryReferences;
	private Button btnAddLibraryDependecy;
	private Button btnRemoveLibraryDependecy;
	private CAppWARServiceEditor editor;
	private WARSourceDescriptor original;
	private WARSourceDescriptor current;
	
    private boolean referenceProjectsChanged;
    private boolean referenceLibrariesChanged;
	private Combo cmbServerRole;
	private FileEditorInput fei;

	public CAppWARServiceEditorPage(FormEditor editor, String id, String title) {
	    super(editor, id, title);
	    this.editor=(CAppWARServiceEditor)editor;
	    fei=(FileEditorInput)editor.getEditorInput().getPersistable();
	    this.editor.setEditorTitle(fei.getFile().getName());
	    try {
	        original=WARServiceSourceDescriptorUtils.loadAxis2SourceDescriptor(fei.getFile().getContents());
        } catch (CoreException e) {
	        log.error(e);
        }
        current=original.clone();
    }


	protected void createFormContent(IManagedForm managedForm) {
		toolkit = managedForm.getToolkit();
		form = managedForm.getForm();

		form.getForm(); 
		form.getBody().setLayout(new GridLayout());
		Composite columnComp = toolkit.createComposite(form.getBody());
		GridLayout layout = new GridLayout();
		layout.numColumns = 1;
		layout.verticalSpacing = 0;
		layout.horizontalSpacing = 10;
		columnComp.setLayout(layout);
		columnComp.setLayoutData(new GridData(GridData.FILL_HORIZONTAL | GridData.VERTICAL_ALIGN_FILL));
		
		createServiceInformationSection(columnComp);

		createDeploymentSection(columnComp);

		createDependencySection(columnComp);
		
		updateControlData();
		
		form.reflow(true);
	}


	private void createServiceInformationSection(Composite columnComp) {
	    GridLayout layout;
	    Composite generalComposite = toolkit.createComposite(columnComp);
		
		layout = new GridLayout();
		layout.numColumns = 3;
		layout.verticalSpacing = 10;
		layout.horizontalSpacing = 10;
		generalComposite.setLayout(layout);
		generalComposite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL | GridData.VERTICAL_ALIGN_FILL));

			
		toolkit.createLabel(generalComposite,"Service name");
		
		txtServiceName = toolkit.createText(generalComposite,"",SWT.BORDER);
		txtServiceName.setLayoutData(getGridData(2,GridData.FILL_HORIZONTAL));
		
		toolkit.createLabel(generalComposite,"",SWT.HORIZONTAL | SWT.SEPARATOR).setLayoutData(getGridData(3,GridData.FILL_HORIZONTAL));
		
		toolkit.createLabel(generalComposite,"Fully qualified class");
		
		txtClassName = toolkit.createText(generalComposite,"",SWT.BORDER | SWT.READ_ONLY);
		txtClassName.setLayoutData(getGridData(1,GridData.FILL_HORIZONTAL));
		
		btnClassBrowse=new Button(generalComposite,SWT.None);
		btnClassBrowse.setText("Browse");
		
		toolkit.createLabel(generalComposite,"Service source project");
		
		cmbServiceProject = new Combo(generalComposite,SWT.READ_ONLY);
		cmbServiceProject.setLayoutData(getGridData(2,GridData.FILL_HORIZONTAL));
		
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
    }

	private void updateServiceName() {
		setServiceName(txtServiceName.getText());
		validate();
		updateDirtyState();
    }
	
	private void setServiceName(String text) {
		current.setServiceName(text);
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
		updateDirtyState();
	}
	
	private void updateServerRole(){
		current.setServerRole(cmbServerRole.getText());
		updateDirtyState();
	}
	
	private void fillServiceProjectCombo(){
		cmbServiceProject.removeAll();
		String projectName=null;
		if (getServiceProject()!=null){
			projectName = getServiceProject().getName();
		}
		if (WARProjectUtils.isClassNameValid(getClassName())){
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
		if (cmbServiceProject.getSelectionIndex()==-1){
    		if (cmbServiceProject.getItemCount()>0){
    			cmbServiceProject.select(0);
    		}
		}
	}
	
	private void fillServerRoleCombo(){
		cmbServerRole.removeAll();
		Display.getCurrent().asyncExec(new Runnable(){
            public void run() {
            	while(WARArtifactHandler.getCAppArtifactManager()==null){
        			try {
        	            Thread.currentThread().sleep(500);
                    } catch (InterruptedException e) {
        	            log.error(e);
                    }
        		}
        		ICAppArtifactManager cAppArtifactManager = WARArtifactHandler.getCAppArtifactManager();
        		IServerRole[] serverRoles = cAppArtifactManager.getServerRoles(fei.getFile().getProject());
        		for (IServerRole serverRole : serverRoles) {
        	        cmbServerRole.add(serverRole.getServerRoleName());
                }
            }
			
		});
		
	}
	
	private void validate(){
//		if (cmbProject.getItemCount()==0){
//			setErrorMessage("There are no CApp project present in the workspace");
//			setPageComplete(false);
//			if (!txtServiceName.isFocusControl() && cmbSourcePath.isFocusControl()){
//				cmbProject.setFocus();
//			}
//			return;
//		}
//		if (cmbProject.getSelectionIndex()==-1){
//			setErrorMessage("Select a CApp project");
//			setPageComplete(false);
//			if (!txtServiceName.isFocusControl() && !cmbSourcePath.isFocusControl()){
//				cmbProject.setFocus();
//			}
//			return;
//		}
//		
//		if (cmbSourcePath.getText().trim().equals("")){
//			setErrorMessage("Select a CApp Axis2 source folder or type in a new axis2 source folder name");
//			setPageComplete(false);
//			if (!txtServiceName.isFocusControl()){
//				cmbSourcePath.setFocus();
//			}
//			return;
//		}
//		
//		if (txtServiceName.getText().trim().equalsIgnoreCase("")){
//			setErrorMessage("Enter the name of the service you wish to create");
//			setPageComplete(false);
//			if ((cmbSourcePath.getSelectionIndex()!=-1 || !cmbSourcePath.isFocusControl()) && !txtClassName.isFocusControl()){
//				txtServiceName.setFocus();
//			}
//			return;
//		}
//		
//		if (txtClassName.getText().trim().equalsIgnoreCase("")){
//			setErrorMessage("Enter a fully qualified class name to create the axis2 service from");
//			setPageComplete(false);
//			if ((cmbSourcePath.getSelectionIndex()!=-1 || !cmbSourcePath.isFocusControl()) && !txtServiceName.isFocusControl()){
//				txtClassName.setFocus();
//			}
//			return;
//		}
//		
//		if (!ProjectUtils.isClassNameValid(getClassName())){
//			setErrorMessage("The class name appears to be invalid");
//			setPageComplete(true);
//			return;
//		}
//		setErrorMessage(null);
//		setPageComplete(true);
	}
	
	private IProject getServiceProject() {
	    return current.getProject();
    }


	private String getServiceName() {
	    return current.getServiceName();
    }


	private void setClassName(String text) {
		current.setClassName(text);
    }


	private String getClassName() {
	    return current.getClassName();
    }


	private void updateServiceProject(){
		if (cmbServiceProject.getSelectionIndex()>-1){
			setServiceProject(ResourcesPlugin.getWorkspace().getRoot().getProject(cmbServiceProject.getText()));
		}
		updateDirtyState();
	}
	
	private void setServiceProject(IProject project) {
		if (project==null){
			current.setProjectName(null);
		}else{
			if (!project.getName().equals(current.getProjectName())){
				current.setReferencedLibraries("");
				current.setReferencedProjects("");
				current.setProjectReferences(true);
				current.setProjectName(project.getName());
				updateProjectRelatedControlData();
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

	private void createDependencySection(Composite columnComp) {
	    GridLayout layout;
	    Section section = toolkit.createSection(columnComp, ExpandableComposite.TWISTIE | ExpandableComposite.TITLE_BAR | ExpandableComposite.FOCUS_TITLE);
		section.setText("Service Dependencies");
		section.setDescription("Specify dependencies for the axis2 service");
		section.setLayoutData(new GridData(GridData.FILL_HORIZONTAL | GridData.VERTICAL_ALIGN_FILL));
		
		Composite composite = toolkit.createComposite(section);
		layout = new GridLayout();
		layout.numColumns = 1;
		layout.marginHeight = 5;
		layout.marginWidth = 10;
		layout.verticalSpacing = 5;
		layout.horizontalSpacing = 5;
		composite.setLayout(layout);
		composite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL | GridData.VERTICAL_ALIGN_FILL));

		btnServiceProjectDependencies = toolkit.createButton(composite, "Use service project dependencies", SWT.CHECK);
		
		btnServiceProjectDependencies.addSelectionListener(new SelectionListener(){
            public void widgetDefaultSelected(SelectionEvent event) {
            	widgetSelected(event);
            }
            public void widgetSelected(SelectionEvent event) {
            	buttonServiceProjectDependenciesClicked();
            }
		});
		
		Composite dependencyComposite = toolkit.createComposite(composite);
		layout = new GridLayout();
		layout.numColumns = 3;
		layout.marginHeight = 5;
		layout.marginWidth = 10;
		layout.verticalSpacing = 5;
		layout.horizontalSpacing = 5;
		dependencyComposite.setLayout(layout);
		dependencyComposite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL | GridData.VERTICAL_ALIGN_FILL));

		lblReferenceProjects = toolkit.createLabel(dependencyComposite, "Referenced Projects");
		lblReferenceProjects.setLayoutData(getGridData(3, GridData.FILL_HORIZONTAL));
		toolkit.createLabel(dependencyComposite, "   ");
		lstViewProjectReferences = CheckboxTableViewer.newCheckList(dependencyComposite, SWT.TOP | SWT.BORDER | SWT.V_SCROLL);
		GridData gd=getGridData(2, GridData.FILL_BOTH);
		gd.verticalSpan=4;
		lstViewProjectReferences.getControl().setLayoutData(gd);
		
//		btnAddProjectDependecy = toolkit.createButton(dependencyComposite, "Add", SWT.None);
//		gd = new GridData();
//		gd.widthHint=80;
//		btnAddProjectDependecy.setLayoutData(gd);
		toolkit.createLabel(dependencyComposite, "");
//		btnRemoveProjectDependecy = toolkit.createButton(dependencyComposite, "Remove", SWT.None);
//		btnRemoveProjectDependecy.setLayoutData(gd);
		toolkit.createLabel(dependencyComposite, "");
		toolkit.createLabel(dependencyComposite, "");
//		toolkit.createLabel(dependencyComposite, "");
//		toolkit.createLabel(dependencyComposite, "");
		
//		toolkit.createLabel(dependencyComposite, "").setLayoutData(getGridData(3, GridData.FILL_HORIZONTAL));
		
		lblReferenceLibraries = toolkit.createLabel(dependencyComposite, "Referenced Libraries");
		lblReferenceLibraries.setLayoutData(getGridData(3, GridData.FILL_HORIZONTAL));
		toolkit.createLabel(dependencyComposite, "   ");
		lstViewLibraryReferences = CheckboxTableViewer.newCheckList(dependencyComposite, SWT.TOP | SWT.BORDER);
		gd=getGridData(2, GridData.FILL_BOTH);
		gd.verticalSpan=4;
		lstViewLibraryReferences.getControl().setLayoutData(gd);
		
//		btnAddLibraryDependecy = toolkit.createButton(dependencyComposite, "Add", SWT.None);
//		gd = new GridData();
//		gd.widthHint=80;
//		btnAddLibraryDependecy.setLayoutData(gd);
		toolkit.createLabel(dependencyComposite, "");
//		btnRemoveLibraryDependecy = toolkit.createButton(dependencyComposite, "Remove", SWT.None);
//		btnRemoveLibraryDependecy.setLayoutData(gd);
		toolkit.createLabel(dependencyComposite, "");
		toolkit.createLabel(dependencyComposite, "");
//		toolkit.createLabel(dependencyComposite, "");
//		toolkit.createLabel(dependencyComposite, "");
		
		section.setExpanded(true);
		toolkit.paintBordersFor(composite);
		section.setClient(composite);
    }
	
	private void createDeploymentSection(Composite columnComp) {
	    GridLayout layout;
	    Section section = toolkit.createSection(columnComp, ExpandableComposite.TWISTIE | ExpandableComposite.TITLE_BAR | ExpandableComposite.FOCUS_TITLE);
		section.setText("Deployment");
		section.setDescription("Information related to deploying the axis2 service as a CApp feature");
		section.setLayoutData(new GridData(GridData.FILL_HORIZONTAL | GridData.VERTICAL_ALIGN_FILL));
		
		Composite composite = toolkit.createComposite(section);
		layout = new GridLayout();
		layout.numColumns = 3;
		layout.marginHeight = 5;
		layout.marginWidth = 10;
		layout.verticalSpacing = 5;
		layout.horizontalSpacing = 5;
		composite.setLayout(layout);
		composite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL | GridData.VERTICAL_ALIGN_FILL));
		toolkit.createLabel(composite, "Server Role");
		
		cmbServerRole = new Combo(composite,SWT.None);
		cmbServerRole.setLayoutData(getGridData(2,GridData.FILL_HORIZONTAL));
				
		cmbServerRole.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent arg0) {
				updateServerRole();				
			}
		});
		
		section.setExpanded(true);
		toolkit.paintBordersFor(composite);
		section.setClient(composite);
    }
	
	
	private void buttonServiceProjectDependenciesClicked(){
		boolean isDepedencySectionEnabled = !btnServiceProjectDependencies.getSelection();
		current.setProjectReferences(!isDepedencySectionEnabled);
		lblReferenceProjects.setEnabled(isDepedencySectionEnabled);
		lstViewProjectReferences.getControl().setEnabled(isDepedencySectionEnabled);
//		btnAddProjectDependecy.setEnabled(isDepedencySectionEnabled);
//		btnRemoveProjectDependecy.setEnabled(isDepedencySectionEnabled);
//		
		lblReferenceLibraries.setEnabled(isDepedencySectionEnabled);
		lstViewLibraryReferences.getControl().setEnabled(isDepedencySectionEnabled);
//		btnAddLibraryDependecy.setEnabled(isDepedencySectionEnabled);
//		btnRemoveLibraryDependecy.setEnabled(isDepedencySectionEnabled);
		updateDirtyState();

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
	
    public void resourceChanged(IResourceChangeEvent arg0) {
	    
    }
    
    public void updateControlData(){
    	txtServiceName.setText(current.getServiceName());
    	txtClassName.setText(current.getClassName());
    	//cmbServiceProject.setText(current.getProjectName());
    	//fillServiceProjectCombo();
    	
    	updateProjectRelatedControlData();
    	
		fillServerRoleCombo();

    	cmbServerRole.setText(current.getServerRole());
    }

    private void updateProjectRelatedControlData(){
    	btnServiceProjectDependencies.setSelection(current.isProjectReferences());
    	lstViewProjectReferences.setLabelProvider(WorkbenchLabelProvider.getDecoratingWorkbenchLabelProvider());
    	lstViewProjectReferences.setContentProvider(getContentProviderForProjects());
    	lstViewProjectReferences.setComparator(new ViewerComparator());
    	lstViewProjectReferences.setInput(current.getProject().getWorkspace());
    	
    	try {
	        lstViewProjectReferences.setCheckedElements(current.getProjectReferencesForService(ResourcesPlugin.getWorkspace()));
        } catch (CoreException e) {
	        log.error(e);
        }
        
        lstViewProjectReferences.addCheckStateListener(new ICheckStateListener() {
			public void checkStateChanged(CheckStateChangedEvent event) {
                setReferenceProjectsChanged(true);
            }
        });
        
        
        lstViewLibraryReferences.setLabelProvider(WorkbenchLabelProvider.getDecoratingWorkbenchLabelProvider());
        lstViewLibraryReferences.setContentProvider(getContentProviderForLibraries());
        lstViewLibraryReferences.setComparator(new ViewerComparator());
        lstViewLibraryReferences.setInput(current.getProject());
    	
    	try {
    		lstViewLibraryReferences.setCheckedElements(current.getLibraryReferencesForService());
        } catch (CoreException e) {
	        log.error(e);
        }
        
        lstViewLibraryReferences.addCheckStateListener(new ICheckStateListener() {
			public void checkStateChanged(CheckStateChangedEvent event) {
                setReferenceLibrariesChanged(true);
            }
        });
        
        
    	buttonServiceProjectDependenciesClicked();

    }
    protected IStructuredContentProvider getContentProviderForProjects() {
    	final IProject project=current.getProject();
        return new WorkbenchContentProvider() {
            public Object[] getChildren(Object o) {
                if (!(o instanceof IWorkspace)) {
                    return new Object[0];
                }
    
                // Collect all the projects in the workspace except the given project
                IProject[] projects = ((IWorkspace) o).getRoot().getProjects();
                ArrayList<IProject> referenced = new ArrayList<IProject>(projects.length);
                boolean found = false;
                for (int i = 0; i < projects.length; i++) {
                    if (!found && projects[i].equals(project)) {
                        found = true;
                        continue;
                    }
                    referenced.add(projects[i]);
                }
    
                // Add any referenced that do not exist in the workspace currently
                try {
                	projects = current.getProjectReferencesForService((IWorkspace) o);
                    for (int i = 0; i < projects.length; i++) {
                        if (!referenced.contains(projects[i])) {
    						referenced.add(projects[i]);
    					}
                    }
                } catch (CoreException e) {
                }

                return referenced.toArray();
            }
        };
    }
    
    protected IStructuredContentProvider getContentProviderForLibraries() {
    	final IProject project=current.getProject();
        return new WorkbenchContentProvider() {
            public Object[] getChildren(Object o) {
                if (!(o instanceof IProject)) {
                    return new Object[0];
                }
    
                // Collect all the projects in the workspace except the given project
                try {
	                return current.getReferencedLibrariesForProject(project);
                } catch (JavaModelException e1) {
	                e1.printStackTrace();
                }
                return new Object[0];

//                IProject[] projects = ((IWorkspace) o).getRoot().getProjects();
//                ArrayList<IProject> referenced = new ArrayList<IProject>(projects.length);
//                boolean found = false;
//                for (int i = 0; i < projects.length; i++) {
//                    if (!found && projects[i].equals(project)) {
//                        found = true;
//                        continue;
//                    }
//                    referenced.add(projects[i]);
//                }
//    
//                // Add any referenced that do not exist in the workspace currently
//                try {
//                	projects = getProjectReferencesForService((IWorkspace) o);
//                    for (int i = 0; i < projects.length; i++) {
//                        if (!referenced.contains(projects[i])) {
//    						referenced.add(projects[i]);
//    					}
//                    }
//                } catch (CoreException e) {
//                }
//
//                return referenced.toArray();
            }
        };
    }

	public void setReferenceProjectsChanged(boolean referenceProjectsChanged) {
	    this.referenceProjectsChanged = referenceProjectsChanged;
		updateDirtyState();
	}


	public boolean isReferenceProjectsChanged() {
	    return referenceProjectsChanged;
    }


	public void setReferenceLibrariesChanged(boolean referenceLibrariesChanged) {
	    this.referenceLibrariesChanged = referenceLibrariesChanged;
		updateDirtyState();
    }


	public boolean isReferenceLibrariesChanged() {
	    return referenceLibrariesChanged;
    }
	
	public boolean isPageDirty(){
		return isReferenceLibrariesChanged() || isReferenceProjectsChanged() || 
    		(current.isProjectReferences()!=original.isProjectReferences()) ||
    		(!current.getClassLocation().equals(original.getClassLocation())) ||
    		(!current.getClassName().equals(original.getClassName())) ||
    		(!current.getProjectName().equals(original.getProjectName())) ||
    		(!current.getServiceName().equals(original.getServiceName())) ||
    		(!current.getServiceType().equals(original.getServiceType())) ||
    		(!current.getServerRole().equals(original.getServerRole()));
	}
	
	public WARSourceDescriptor getCurrentAxis2SourceDescriptor(){
		if (isPageDirty() && !current.isProjectReferences()){
			current.setReferencedProjects(getSelectedReferenceProjects());
			current.setReferencedLibraries(getSelectedReferenceLibraries());
		}
		return current;
	}
	
	public void syncOriginalToCurrent(){
		original=current;
		current=original.clone();
		setReferenceLibrariesChanged(false);
		setReferenceProjectsChanged(false);
	}
	
	public void refreshUIContent(){
		updateControlData();
	}
	
	public String getSelectedReferenceProjects(){
		Object[] checkedElements = lstViewProjectReferences.getCheckedElements();
		String result="";
		for (Object ce : checkedElements) {
	        if (ce instanceof IProject){
	        	if (result.equals("")){
	        		result=((IProject)ce).getName();
	        	}else{
	        		result+=","+((IProject)ce).getName();
	        	}
	        }
        }
		return result;
	}
	
	public String getSelectedReferenceLibraries(){
		Object[] checkedElements = lstViewLibraryReferences.getCheckedElements();
		String result="";
		for (Object ce : checkedElements) {
	        if (ce instanceof IPackageFragmentRoot){
	        	if (result.equals("")){
	        		result=((IPackageFragmentRoot)ce).getPath().toOSString();
	        	}else{
	        		result+=","+((IPackageFragmentRoot)ce).getPath().toOSString();;
	        	}
	        }
        }
		return result;
	}
	
	public void updateDirtyState() {
		editor.updateDirtyState();
	}

	public boolean isDirty() {
		return isPageDirty();
	}
}
