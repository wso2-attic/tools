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

package org.wso2.carbonstudio.eclipse.capp.artifact.war.ui.wizard;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.jst.servlet.ui.project.facet.WebProjectWizard;
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
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.eclipse.wst.common.componentcore.datamodel.properties.IFacetDataModelProperties;
import org.wso2.carbonstudio.eclipse.capp.artifact.war.Activator;
import org.wso2.carbonstudio.eclipse.capp.core.utils.ArtifactFileUtils;
import org.wso2.carbonstudio.eclipse.logging.core.ICarbonStudioLog;
import org.wso2.carbonstudio.eclipse.logging.core.Logger;

public class WARArtifactSourceWizardPage extends WizardPage{
	private static ICarbonStudioLog log=Logger.getLog(Activator.PLUGIN_ID);

    private Combo dynamicWebProjectSelectionCombo;
    private IProject selectedProject;
    IPath wsasRepoPath;
	private String fileLocation;
	private Button optImportFromWorkspace;
	private Button optImportFromFileSystem;
	private Text txtImportFromFileSystem;
	private int importOption;
	private String fileSystemWAR;
	private Button btnBrowseWAR;
	public static final int IMPORT_FROM_WORKSPACE=0;
	public static final int IMPORT_FROM_FILE_SYSTEM=1;
	public static final int NEW_WEB_APPLICATION=2;
	WizardNewFileCreationPage wizard;
	private Button optNewWebApp;
	
    public WARArtifactSourceWizardPage(WizardNewFileCreationPage wizardNewFileCreationPage){
        super("New Web Application (WAR)");
        setDescription("Web Application (WAR) details");
        this.wizard=wizardNewFileCreationPage;
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
        label.setText("Create Web Application (WAR) from:");
        gd.horizontalSpan=2;
        label.setLayoutData(gd);
        
//        optNewWebApp = new Button(container,SWT.RADIO);
        
//        optNewWebApp.setText("New Dynamic Web Project");
//        gd = new GridData();
//        gd.horizontalIndent = 10;
//        gd.horizontalSpan=2;
//        optNewWebApp.setLayoutData(gd);
//        optNewWebApp.setSelection(true);
//                   
//		optNewWebApp.addSelectionListener((new SelectionListener() {
//			
//			public void widgetSelected(SelectionEvent event) {
//            	setImportOption(NEW_WEB_APPLICATION);
//            	updateControls();
//            	
//			}
//			
//			public void widgetDefaultSelected(SelectionEvent e) {
//				widgetSelected(e);
//			}
//		}));
//		
        
        optImportFromWorkspace = new Button(container,SWT.RADIO);
        optImportFromWorkspace.setText("Web Application (WAR) from web project");
        gd = new GridData();
        gd.horizontalSpan=2;
        gd.horizontalIndent=10;
        optImportFromWorkspace.setLayoutData(gd);
        optImportFromWorkspace.setSelection(true);
        setImportOption(IMPORT_FROM_WORKSPACE);

        gd = new GridData(GridData.FILL_HORIZONTAL);
//        gd.horizontalSpan=2;
        gd.horizontalIndent=25;
		dynamicWebProjectSelectionCombo = new Combo(container,SWT.NONE | SWT.READ_ONLY);
		dynamicWebProjectSelectionCombo.setLayoutData(gd);
		fillDynamicWebProjectsCombo();
		
		optNewWebApp = new Button(container,SWT.PUSH);
		optNewWebApp.setText("New Dynamic Web Project...");
		gd = new GridData();
		optNewWebApp.setLayoutData(gd);
		optNewWebApp.setSelection(true);
		
		optNewWebApp.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				setImportOption(NEW_WEB_APPLICATION);
				updateStatus(null);
				IProject project = createNewDynamicProject(getShell());
				if(project != null){
					setSelectedProject(project);
					dynamicWebProjectSelectionCombo.add(project.getName());
					dynamicWebProjectSelectionCombo.setText(project.getName());
				}
			}
		});
		
		gd=new GridData();
        gd.horizontalSpan=2;
        new Label(container,SWT.NULL).setLayoutData(gd);
        
        optImportFromFileSystem = new Button(container,SWT.RADIO);
        optImportFromFileSystem.setText("Web Application (WAR) in the fileSystem");
        gd = new GridData();
        gd.horizontalSpan=2;
        gd.horizontalIndent=10;
        optImportFromFileSystem.setLayoutData(gd);
		
        gd=new GridData(GridData.FILL_HORIZONTAL);
        gd.horizontalIndent=25;
        
        txtImportFromFileSystem = new Text(container,SWT.BORDER);
        txtImportFromFileSystem.setLayoutData(gd);
        txtImportFromFileSystem.setEnabled(false);
        
        btnBrowseWAR = new Button(container,SWT.None);
        btnBrowseWAR.setText("Browse...");
        btnBrowseWAR.setEnabled(false);
        gd = new GridData(); 
        gd.widthHint = 150;
        btnBrowseWAR.setLayoutData(gd);
        
        btnBrowseWAR.addSelectionListener(new SelectionListener(){
            public void widgetDefaultSelected(SelectionEvent event) {
	            widgetSelected(event);
            }
            public void widgetSelected(SelectionEvent event) {
            	FileDialog fileDialog = new FileDialog(getShell());
            	fileDialog.setFilterExtensions(new String[]{"*.war"});
            	fileDialog.setText("Browse for an Web Application (WAR) file");
            	if (fileDialog.open()!=null){
            		String fileName = new File(fileDialog.getFilterPath(),fileDialog.getFileName()).toString();
            		txtImportFromFileSystem.setText(fileName);
            	}
            }
        	
        });
		dynamicWebProjectSelectionCombo.addModifyListener(new ModifyListener(){
			public void modifyText(ModifyEvent arg0) {
				handleModify();
			}
			
		}); 
		
		if (dynamicWebProjectSelectionCombo.getItemCount()>0){
			dynamicWebProjectSelectionCombo.select(0);
		}
		
		optImportFromWorkspace.addSelectionListener(new SelectionListener(){
            public void widgetDefaultSelected(SelectionEvent event) {
	            widgetSelected(event);
            }
            public void widgetSelected(SelectionEvent event) {
            	setImportOption(IMPORT_FROM_WORKSPACE);
            	optNewWebApp.setEnabled(true);
            	dynamicWebProjectSelectionCombo.setEnabled(true);
            	updateControls();
            	wizard.setFileName(getSelectedProject().getName());
            	if(dynamicWebProjectSelectionCombo.getText()==null || 
						dynamicWebProjectSelectionCombo.getText().equals("")){
					setPageComplete(false);
				}
            	
//	        	if (dynamicWebProjectSelectionCombo.getItemCount()==0){
//	    			setErrorMessage("No services present in workspace");
//	    		}
//	    		else{
//	    			setErrorMessage(null);
////	    			dynamicWebProjectSelectionCombo.select(0);
//	    		}
//            	handleModify();
            }
        	
        });
		
		optImportFromFileSystem.addSelectionListener(new SelectionListener(){
            public void widgetDefaultSelected(SelectionEvent event) {
	            widgetSelected(event);
            }
            public void widgetSelected(SelectionEvent event) {
            	setImportOption(IMPORT_FROM_FILE_SYSTEM);
            	txtImportFromFileSystem.setEnabled(true);
            	btnBrowseWAR.setEnabled(true);
            	optNewWebApp.setEnabled(false);
            	dynamicWebProjectSelectionCombo.setEnabled(false);
            	if(txtImportFromFileSystem.getText() != null && !txtImportFromFileSystem.getText().equals("")){
    				String[] fileInfo = txtImportFromFileSystem.getText().split(Pattern.quote(File.separator));
    				wizard.setFileName(fileInfo[fileInfo.length - 1]);
            	}
            	else{
            		setPageComplete(false);
            	}
            }
        	
        });
		
		txtImportFromFileSystem.addModifyListener(new ModifyListener(){
			public void modifyText(ModifyEvent arg0) {
				updateFileSystemAAR();
//				String[] fileInfo = txtImportFromFileSystem.getText().split(File.separator);
				wizard.setFileName(ArtifactFileUtils.getFileNameWithoutExtension(txtImportFromFileSystem.getText()));
			}
			
		}); 
		
//		optImportFromWorkspace.setSelection(true);
		
		if((optImportFromWorkspace.getSelection()==true &&  (dynamicWebProjectSelectionCombo.getText()== null || dynamicWebProjectSelectionCombo.getText().equals(""))) ||
				(optImportFromFileSystem.getSelection() == true && (txtImportFromFileSystem.getText() == null || txtImportFromFileSystem.getText().equals("")))){
			setPageComplete(false);
		}
		
	
    	setImportOption(NEW_WEB_APPLICATION);
//    	updateControls();
		setControl(container);
//		setPageComplete(true);
    }
    
	public static IProject createNewDynamicProject(Shell shell){
		WebProjectWizard webProjectWizard = new WebProjectWizard();
		webProjectWizard.init(PlatformUI.getWorkbench(),  null);
		webProjectWizard.setForcePreviousAndNextButtons(true);
		WizardDialog wizardDialog = new WizardDialog(shell,webProjectWizard);
		if (wizardDialog.open()==Window.OK){
			Object projectName = webProjectWizard.getDataModel().getProperty(IFacetDataModelProperties.FACET_PROJECT_NAME);
			if (projectName!=null)
				return ResourcesPlugin.getWorkspace().getRoot().getProject(projectName.toString());
			else
				return null;
		}
		return null;
	}
	
    private void updateControls() {
    	boolean importWorspace=(getImportOption()==IMPORT_FROM_WORKSPACE);
    	boolean importFileSystem=(getImportOption()==IMPORT_FROM_FILE_SYSTEM);
//    	boolean newWebApp=(getImportOption()==NEW_WEB_APPLICATION);

    	txtImportFromFileSystem.setEnabled(importFileSystem);
		btnBrowseWAR.setEnabled(importFileSystem);
		
		dynamicWebProjectSelectionCombo.setEnabled(importWorspace);
//		validate();
    }
    
    private void updateFileSystemAAR() {
    	setFileSystemAAR(txtImportFromFileSystem.getText());
    	validate();
    }
    
    private void validate(){ 	
    	
    	boolean importWorspace=(getImportOption()==IMPORT_FROM_WORKSPACE);
    	boolean importFileSystem=(getImportOption()==IMPORT_FROM_FILE_SYSTEM);
    	
    	if (importWorspace) {
	        if (getSelectedProject() == null) {
		        setErrorMessage("Select Web Application(WAR) file");
		        setPageComplete(false);
		        return;
	        }
        }
    	
    	if (importFileSystem){
	        if (getFileSystemAAR() == null || !(new File(getFileSystemAAR()).exists())) {
		        setErrorMessage("Specify a valid existing Web Application (WAR) in the file system");
		        setPageComplete(false);
		        return;
	        }
    	}
    	
    	
		setErrorMessage(null);
		setPageComplete(true);
    }
    
	private void updateStatus(String message) {
		setErrorMessage(message);
		setPageComplete(message == null);
	}
    
    private void handleModify(){
    	IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(dynamicWebProjectSelectionCombo.getText());
		setSelectedProject(project);
    	validate();
    }
	
	private static boolean isDynamicWebProject(IProject project){
		String[] natures=new String[]{"org.eclipse.wst.common.modulecore.ModuleCoreNature","org.eclipse.wst.common.project.facet.core.nature","org.eclipse.jdt.core.javanature","org.eclipse.wst.jsdt.core.jsNature"};
		for (String nature : natures) {
			try {
	            boolean isNaturePresent = project.hasNature(nature);
				if (!isNaturePresent){
					return false;
				}
			} catch (CoreException e) {
	            log.error(e);
            }
        }
		return true;
	}
    
	private void fillDynamicWebProjectsCombo(){
		List<IProject> webProjects=new ArrayList<IProject>();
		dynamicWebProjectSelectionCombo.removeAll();
		IProject[] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
		for (IProject project : projects) {
	        if (isDynamicWebProject(project)){
	        	dynamicWebProjectSelectionCombo.add(project.getName());
	        	webProjects.add(project);
	        }
        }
		if (dynamicWebProjectSelectionCombo.getItemCount()!=0){
			setErrorMessage(null);
			dynamicWebProjectSelectionCombo.select(0);
		}
//		if (dynamicWebProjectSelectionCombo.getItemCount()==0){
//			setErrorMessage("No services present in workspace");
//		}
//		else{
//			setErrorMessage(null);
//			dynamicWebProjectSelectionCombo.select(0);
//		}
	}

	public IProject getSelectedProject() {
		return selectedProject;
	}

	private void setSelectedProject(IProject selectedProject) {
		String f = wizard.getFileName();
		String name1 = null;
		if (this.selectedProject!=null && this.selectedProject.exists()) {
	        name1 = this.selectedProject.getName();
        }
		String name2 = null;
		if (selectedProject!=null && selectedProject.exists()) {
			name2 = selectedProject.getName();
		}
		if ((f==null || f.equals("") || f.equals(name1)) && name2!=null){
			wizard.setFileName(name2);
		}
		
		this.selectedProject = selectedProject;
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

	public void setFileSystemAAR(String fileSystemAAR) {
		String f = wizard.getFileName();
		File file = new File(fileSystemAAR);
		String name2 = null;
		if (file.exists()) {
	        name2 = file.getName();
	        if (name2.toUpperCase().endsWith(".WAR")) name2=name2.substring(0,name2.length()-4-1);
        }
		if (this.fileSystemWAR!=null){
    		String name1 = null;
    		File file2 = new File(this.fileSystemWAR);
    		if (file2.exists()) {
	            name1 = file2.getName();
	            if (name1.toUpperCase().endsWith(".WAR")) name1=name1.substring(0,name1.length()-4-1);
            }
			if ((f==null || f.equals("") || f.equals(name1)) && (name2!=null)){
    			wizard.setFileName(name2);
    		}
		}else{
    		if ((f==null || f.equals("")) && (name2!=null)){
    			wizard.setFileName(name2);
    		}

		}
	    this.fileSystemWAR = fileSystemAAR;
    }

	public String getFileSystemAAR() {
	    return fileSystemWAR;
    }
}
