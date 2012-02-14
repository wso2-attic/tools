/*
 * Copyright 2005,2006 WSO2, Inc. http://www.wso2.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.search.IJavaSearchConstants;
import org.eclipse.jdt.internal.core.SourceType;
import org.eclipse.jdt.internal.core.search.JavaWorkspaceScope;
import org.eclipse.jdt.internal.ui.dialogs.FilteredTypesSelectionDialog;
import org.eclipse.jdt.internal.ui.wizards.NewClassCreationWizard;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
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
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.wso2.carbonstudio.eclipse.capp.artifact.axis2.Activator;
import org.wso2.carbonstudio.eclipse.capp.artifact.axis2.utils.Axis2ProjectUtils;
import org.wso2.carbonstudio.eclipse.capp.core.utils.ArtifactFileUtils;
import org.wso2.carbonstudio.eclipse.logging.core.ICarbonStudioLog;
import org.wso2.carbonstudio.eclipse.logging.core.Logger;
import org.wso2.carbonstudio.eclipse.utils.jdt.JavaUtils;
import org.wso2.carbonstudio.eclipse.utils.wst.Axis2ServiceUtils;

public class Axis2ArtifactSourceWizardPage extends WizardPage{
	private static ICarbonStudioLog log=Logger.getLog(Activator.PLUGIN_ID);

    private Combo serviceSelectionCombo;
    private IFolder selectedService;
    IPath wsasRepoPath;
    private Map<IFolder,IProject> pathList;
    private List<IFolder> folders;
	private String fileLocation;
	private Button optImportFromWorkspace;
	private Button optImportFromClass;
	private Button optImportFromFileSystem;
	private Text txtImportFromFileSystem;
	private int importOption;
	private String fileSystemAAR;
	private Button btnBrowseAAR;
	public static final int IMPORT_FROM_WORKSPACE=0;
	public static final int IMPORT_FROM_FILE_SYSTEM=1;
	public static final int IMPORT_FROM_CLASS=2;
	WizardNewFileCreationPage wizard;
	private Text txtClassName;
	private Button btnClassBrowse;
	private Combo cmbServiceProject;
	private IProject serviceProject;
	private String className;
	private Button btnClassNew;
	private IStructuredSelection selectedObject;
	
    public Axis2ArtifactSourceWizardPage(WizardNewFileCreationPage wizardNewFileCreationPage, IStructuredSelection selection){
        super("New WSO2 Axis2 Service");
        setDescription("Axis2 artifact details");
        this.wizard=wizardNewFileCreationPage;
        setSelectedObject(selection);
    }

    /* (non-Javadoc)
     * @see org.apache.axis2.tool.service.eclipse.ui.AbstractServiceWizardPage#initializeDefaultSettings()
     */
    protected void initializeDefaultSettings() {
    }

	
    public void createControl(Composite parent) {
        Composite container = new Composite(parent, SWT.NULL);
        GridLayout layout = new GridLayout();
        layout.numColumns=2;
        layout.verticalSpacing = 9;
        container.setLayout(layout);
        GridData gd = new GridData();
        Label label = new Label(container,SWT.NONE);
        label.setText("Create Axis2 artifact from:");
        gd.horizontalSpan=2;
        label.setLayoutData(gd);
        
        //---------------------option from class------------------------
        
        optImportFromClass = new Button(container,SWT.RADIO);
        optImportFromClass.setText("Axis2 service from class");
        gd = new GridData();
        gd.horizontalSpan=2;
        gd.horizontalIndent=10;
        optImportFromClass.setLayoutData(gd);
		
        gd=new GridData(GridData.FILL_HORIZONTAL);
        gd.horizontalIndent=25;
        gd.horizontalSpan = 2;
        
        Composite composite= new Composite(container, SWT.NONE);
		composite.setLayout(new GridLayout(4, false));
		composite.setLayoutData(gd);
		
		label = new Label(composite,SWT.None);
		label.setText("Fully qualified class");
		
		txtClassName = new Text(composite,SWT.BORDER | SWT.READ_ONLY);
		txtClassName.setEnabled(false);
		txtClassName.setLayoutData(getGridData(1,GridData.FILL_HORIZONTAL));
		
		btnClassNew=new Button(composite,SWT.None);
		btnClassNew.setText("New...");
		
		btnClassBrowse=new Button(composite,SWT.None);
		btnClassBrowse.setText("Browse...");
		
		label = new Label(composite,SWT.None);
		label.setText("Service source project");
		
		cmbServiceProject = new Combo(composite,SWT.READ_ONLY);
		cmbServiceProject.setLayoutData(getGridData(3,GridData.FILL_HORIZONTAL));

        //---------------------option from worksapce----------------------
        
        optImportFromWorkspace = new Button(container,SWT.RADIO);
        optImportFromWorkspace.setText("Axis2 service in the workspace");
        gd = new GridData();
        gd.horizontalSpan=2;
        gd.horizontalIndent=10;
        optImportFromWorkspace.setLayoutData(gd);

        gd = new GridData(GridData.FILL_HORIZONTAL);
        gd.horizontalSpan=2;
        gd.horizontalIndent=25;
		serviceSelectionCombo = new Combo(container,SWT.NONE | SWT.READ_ONLY);
		serviceSelectionCombo.setLayoutData(gd);
		fillServiceSelectionCombo();
		
        gd=new GridData();
        gd.horizontalSpan=2;
        new Label(container,SWT.NULL).setLayoutData(gd);
        
        //---------------------option from filesystem----------------------
        
        optImportFromFileSystem = new Button(container,SWT.RADIO);
        optImportFromFileSystem.setText("Axis2 service in the fileSystem");
        gd = new GridData();
        gd.horizontalSpan=2;
        gd.horizontalIndent=10;
        optImportFromFileSystem.setLayoutData(gd);
		
        gd=new GridData(GridData.FILL_HORIZONTAL);
        gd.horizontalIndent=25;
        
        txtImportFromFileSystem = new Text(container,SWT.BORDER);
        txtImportFromFileSystem.setLayoutData(gd);
        
        btnBrowseAAR = new Button(container,SWT.None);
        btnBrowseAAR.setText("Browse");
        
        gd=new GridData();
        gd.horizontalSpan=2;
        new Label(container,SWT.NULL).setLayoutData(gd);

        //---------------------listeners--------------------------------
        
        btnBrowseAAR.addSelectionListener(new SelectionListener(){
            public void widgetDefaultSelected(SelectionEvent event) {
	            widgetSelected(event);
            }
            public void widgetSelected(SelectionEvent event) {
            	FileDialog fileDialog = new FileDialog(getShell());
            	fileDialog.setFilterExtensions(new String[]{"*.aar"});
            	fileDialog.setText("Browse for an axis2 archive file");
            	if (fileDialog.open()!=null){
            		String fileName = new File(fileDialog.getFilterPath(),fileDialog.getFileName()).toString();
            		txtImportFromFileSystem.setText(fileName);
            	}
            }
        	
        });
		serviceSelectionCombo.addModifyListener(new ModifyListener(){
			public void modifyText(ModifyEvent arg0) {
				handleModify();
			}
			
		}); 
		
//		if (serviceSelectionCombo.getItemCount()>0){
//			serviceSelectionCombo.select(0);
//		}
		
		optImportFromWorkspace.addSelectionListener(new SelectionListener(){
            public void widgetDefaultSelected(SelectionEvent event) {
	            widgetSelected(event);
            }
            public void widgetSelected(SelectionEvent event) {
            	setImportOption(IMPORT_FROM_WORKSPACE);
            	updateControls();
            }
        	
        });
		
		optImportFromFileSystem.addSelectionListener(new SelectionListener(){
            public void widgetDefaultSelected(SelectionEvent event) {
	            widgetSelected(event);
            }
            public void widgetSelected(SelectionEvent event) {
            	setImportOption(IMPORT_FROM_FILE_SYSTEM);
            	updateControls();
            }
        	
        });
		
		txtImportFromFileSystem.addModifyListener(new ModifyListener(){
			public void modifyText(ModifyEvent arg0) {
				updateFileSystemAAR();
			}
			
		}); 

		optImportFromClass.addSelectionListener(new SelectionListener(){
            public void widgetDefaultSelected(SelectionEvent event) {
	            widgetSelected(event);
            }
            public void widgetSelected(SelectionEvent event) {
            	setImportOption(IMPORT_FROM_CLASS);
            	updateControls();
            }
        	
        });
		
		txtClassName.addModifyListener(new ModifyListener(){
            public void modifyText(ModifyEvent arg0) {
            	updateClassName();
            }
        });
		
		btnClassBrowse.addSelectionListener(new SelectionAdapter(){
            public void widgetSelected(SelectionEvent event) {
	            classNameBrowseClicked();
            }
		});
		
		btnClassNew.addSelectionListener(new SelectionAdapter(){
            public void widgetSelected(SelectionEvent event) {
	            classNameNewClicked();
            }
		});
		
		cmbServiceProject.addModifyListener(new ModifyListener(){
            public void modifyText(ModifyEvent arg0) {
            	updateServiceProject();
            }
        });

		optImportFromClass.setSelection(true);
    	setImportOption(IMPORT_FROM_CLASS);
    	updateControls();
		setControl(container);
//		setPageComplete(true);
    }
    
	protected void classNameNewClicked() {
		NewClassCreationWizard wizard = new NewClassCreationWizard();
		wizard.init(PlatformUI.getWorkbench(), getSelectedObject());
	    WizardDialog dialog = new WizardDialog(getShell(), wizard);
	    if (dialog.open()==Dialog.OK){
	    	IJavaElement createdElement = wizard.getCreatedElement();
            setServiceProject(createdElement.getJavaProject().getProject());
	    	SourceType classSource=(SourceType)createdElement;
            txtClassName.setText(classSource.getFullyQualifiedName());
	    }
	    
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
		fillServiceProjectCombo();
		validate();
	}
	
	private void fillServiceProjectCombo(){
		cmbServiceProject.removeAll();
		String projectName=null;
		if (getServiceProject()!=null){
			projectName = getServiceProject().getName();
		}
		if (Axis2ProjectUtils.isClassNameValid(getClassName())){
			String fullyQualifiedClassName=getClassName();
			List<IProject> projectsContainingTheClass;
            try {
	            projectsContainingTheClass = JavaUtils.getProjectsContainingClassName(fullyQualifiedClassName);
	            for(IProject project:projectsContainingTheClass){
					cmbServiceProject.add(project.getName());
	    			if (project.getName().equals(projectName)){
	    				cmbServiceProject.select(cmbServiceProject.getItemCount()-1);
	    			}
				}
            } catch (CoreException e) {
	            log.error(e);
            }
			
		}
		if (cmbServiceProject.getSelectionIndex()<0){
    		if (cmbServiceProject.getItemCount()>0){
    			cmbServiceProject.select(0);
    		}
		}
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
	
	
	private void updateServiceProject(){
		if (cmbServiceProject.getSelectionIndex()>=0){
			setServiceProject(ResourcesPlugin.getWorkspace().getRoot().getProject(cmbServiceProject.getText()));
		}else{
			setServiceProject(null);
		}
		validate();
	}
	
	private GridData getGridData(int horizontalSpan, int style){
		GridData gd = new GridData(style);
		gd.horizontalSpan=horizontalSpan;
		return gd;
	}
    
    private void updateControls() {
    	boolean importWorspace=(getImportOption()==IMPORT_FROM_WORKSPACE);
    	boolean importFileSystem=(getImportOption()==IMPORT_FROM_FILE_SYSTEM);
    	boolean importClass=(getImportOption()==IMPORT_FROM_CLASS);

    	txtImportFromFileSystem.setEnabled(importFileSystem);
		btnBrowseAAR.setEnabled(importFileSystem);
		
//		txtClassName.setEnabled(importClass);
		btnClassBrowse.setEnabled(importClass);
		cmbServiceProject.setEnabled(importClass);
		
		serviceSelectionCombo.setEnabled(importWorspace);
		
		validate();
    }
    
    private void updateFileSystemAAR() {
    	try {
	        setFileSystemAAR(txtImportFromFileSystem.getText());
        } catch (Exception e) {
	        log.error(e);
        }
    	validate();
    }
    private boolean firstTime=true;
    private void updateStatus(String msg){
    	if (firstTime){
    		msg=null;
    		firstTime=false;
    	}
    	setErrorMessage(msg);
        setPageComplete(msg==null);
    }
    
    private void validate(){ 	
    	
    	boolean importWorspace=(getImportOption()==IMPORT_FROM_WORKSPACE);
    	boolean importFileSystem=(getImportOption()==IMPORT_FROM_FILE_SYSTEM);
    	boolean importClass=(getImportOption()==IMPORT_FROM_CLASS);

    	if (importWorspace) {
	        if (getSelectedServicePath() == null) {
	        	updateStatus("There are no axis2 service projects in the workspace");
		        return;
	        }else{
				setFileName(getSelectedServicePath().getName().substring(getSelectedServicePath().getName().lastIndexOf(".")+1));
	        }
        }
    	
    	if (importFileSystem){
	        if (getFileSystemAAR() == null || !(new File(getFileSystemAAR()).exists())) {
	        	updateStatus("Specify a valid existing axis2 archive in the file system");
		        return;
	        }else{
				setFileName(getFileSystemAAR().substring(0,getFileSystemAAR().lastIndexOf(".")).substring(getFileSystemAAR().substring(0,getFileSystemAAR().lastIndexOf(".")).lastIndexOf("/")+1));
	        }
    	}
    	
    	if (importClass){
	        if (getClassName() == null || getClassName().equals("") || getServiceProject()==null) {
//	        	updateStatus("The class name specified is invalid");
	        	setErrorMessage(null);
				setPageComplete(false);
	        	return;
	        }else{
				if(getClassName() != null){
					setFileName(getClassName().substring(getClassName().lastIndexOf(".")+1));
				}
			}
    	}
    	updateStatus(null);
    }
    
    private void handleModify(){
    	int selectionIndex = serviceSelectionCombo.getSelectionIndex();
    	if (selectionIndex>=0 && selectionIndex<folders.size()){
    		try {
	            setSelectedService(folders.get(selectionIndex));
            } catch (Exception e) {
	            log.error(e);
            }
    	}
    	validate();
    }
	
	private void fillServiceSelectionCombo(){
		//Check whether there is IDE configured services in the WSAS services directory
//		String[] serverIds = ServerController.getInstance().getServerManager().getServerIds();
//		Map<IFolder,IProject> list=new HashMap<IFolder,IProject>();
//		for(String serverId:serverIds){
//			Map<IFolder, IProject> publishedPaths =  ServerController.getInstance().getServerManager().getPublishedPaths(serverId);
//			if (publishedPaths!=null){
//				list.putAll(publishedPaths);
//			}
//		}
		try {
	        pathList=Axis2ServiceUtils.getServiceFolders();
			if (pathList.size() != 0) {
				folders=new ArrayList<IFolder>();
				serviceSelectionCombo.removeAll();
				for(IFolder folder:pathList.keySet()){
					folders.add(folder);
					serviceSelectionCombo.add(Axis2ServiceUtils.getServiceNameFromFolder(folder.getLocation().toOSString())+" - ["+pathList.get(folder).getName()+"]");
				}
				setErrorMessage(null);
			}else{
				setErrorMessage("No services present in workspace");
			}
		} catch (Exception e) {
	        log.error(e);
        } 

	}

	public IFolder getSelectedServicePath() {
		return selectedService;
	}

	private void setSelectedService(IFolder selectedService) throws Exception {
		String f = wizard.getFileName();
		String name1 = null;
		if (this.selectedService!=null && this.selectedService.exists()) {
	        name1 = Axis2ServiceUtils.getServiceNameFromFolder(this.selectedService.getLocation().toOSString());
        }
		String name2 = null;
		if (selectedService!=null && selectedService.exists()) {
			name2 = Axis2ServiceUtils.getServiceNameFromFolder(selectedService.getLocation().toOSString());
		}
		if ((f==null || f.equals("") || f.equals(name1)) && name2!=null){
			wizard.setFileName(name2);
		}
		
		this.selectedService = selectedService;
	}
	
	public IPath getWSASRepoPath() {
		return wsasRepoPath;
	}

	public IProject getProject(IFolder folder){
		if (pathList!=null && pathList.containsKey(folder))
			return pathList.get(folder);
		else
			return null;
	}

	public void setFileLocation(String fileLocation) {
		this.fileLocation = fileLocation;
	}

	public String getFileLocation() {
		return fileLocation;
	}

	public void setImportOption(int importOption) {
	    this.importOption = importOption;
    }

	public int getImportOption() {
	    return importOption;
    }

	public void setFileSystemAAR(String fileSystemAAR) throws Exception {
		String f = wizard.getFileName();
		File file = new File(fileSystemAAR);
		String name2 = null;
		if (file.exists()) {
	        name2 = Axis2ServiceUtils.getServiceNameFromFile(file.toString());
        }
		if (this.fileSystemAAR!=null){
    		String name1 = null;
    		File file2 = new File(this.fileSystemAAR);
    		if (file2.exists()) {
	            name1 = Axis2ServiceUtils.getServiceNameFromFile(file2.toString());
            }
			if ((f==null || f.equals("") || f.equals(name1)) && (name2!=null)){
    			wizard.setFileName(name2);
    		}
		}else{
    		if ((f==null || f.equals("")) && (name2!=null)){
    			wizard.setFileName(name2);
    		}

		}

	    this.fileSystemAAR = fileSystemAAR;
    }

	public String getFileSystemAAR() {
	    return fileSystemAAR;
    }

	public void setSelectedObject(IStructuredSelection selectedObject) {
	    this.selectedObject = selectedObject;
    }

	public IStructuredSelection getSelectedObject() {
	    return selectedObject;
    }
	
	private void setFileName(String fileName) {
//		String f = wizard.getFileName();
//		if (f==null || f.equals("") || f.equals(this.fileName)){
		if(ArtifactFileUtils.IsSpecialCharactersExist(fileName))
			fileName=fileName.replace(".", "_");
			wizard.setFileName(fileName);
		}
}
