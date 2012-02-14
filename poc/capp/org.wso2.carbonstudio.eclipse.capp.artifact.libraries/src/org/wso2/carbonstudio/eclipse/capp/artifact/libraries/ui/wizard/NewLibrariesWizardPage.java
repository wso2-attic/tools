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

package org.wso2.carbonstudio.eclipse.capp.artifact.libraries.ui.wizard;


import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.eclipse.ui.model.WorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.wso2.carbonstudio.eclipse.capp.artifact.libraries.Activator;
import org.wso2.carbonstudio.eclipse.capp.artifact.libraries.utils.LibrariesImageUtils;
import org.wso2.carbonstudio.eclipse.capp.core.utils.ArtifactFileUtils;
import org.wso2.carbonstudio.eclipse.logging.core.ICarbonStudioLog;
import org.wso2.carbonstudio.eclipse.logging.core.Logger;



public class NewLibrariesWizardPage extends WizardPage {
	private static ICarbonStudioLog log=Logger.getLog(Activator.PLUGIN_ID);

	WizardNewFileCreationPage wizard;
	private String fileName = "Java-Library";
	private Button importFromFS;
	private Button importFromWS;
	private int optionType = ArtifactFileUtils.OPTION_NEW;
	private IProject selectedProject;
	private TableViewer viewLibraryLocations;
	private List<Object> selectedResources;
	private Button buttonRemove;
	private String fragmentHostBundleName;
	
	
	public String getFragmentHostBundleName() {
		return fragmentHostBundleName;
	}

	public void setFragmentHostBundleName(String fragmentHostBundleName) {
		this.fragmentHostBundleName = fragmentHostBundleName;
	}

	public NewLibrariesWizardPage(WizardNewFileCreationPage wizardNewFileCreationPage, IProject p) {
		super("wizardPage");
		setDescription("Select Java Library");
        this.wizard=wizardNewFileCreationPage;
        this.selectedProject = p;
	}

	public int getOptionType() {
		return optionType;
	}

	public void setOptionType(int optionType) {
		this.optionType = optionType;
	}

	public void createControl(Composite parent) {
		final Group group = new Group(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		layout.numColumns = 4;
		layout.verticalSpacing = 9;
		group.setLayout(layout);	
		
		GridData gd = new GridData();
		gd.horizontalSpan=4;	  
		
		Label lblFrom = new Label(group, SWT.NULL);
		lblFrom.setText("Create Java Library artifact from:");
        lblFrom.setLayoutData(gd);
		new Label(group, SWT.NULL);
		
        viewLibraryLocations = new TableViewer(group, SWT.BORDER | SWT.MULTI | SWT.V_SCROLL | SWT.H_SCROLL);
		gd = new GridData(GridData.FILL_BOTH);
		gd.horizontalSpan = 4;
		viewLibraryLocations.getTable().setLayoutData(gd);
		viewLibraryLocations.getTable().setEnabled(true);
		
		importFromFS = new Button(group, SWT.PUSH);
        importFromFS.setText("File system...");
        gd = new GridData();
        gd.widthHint = 100;
//        gd.horizontalSpan=3;
        importFromFS.setLayoutData(gd);
        
        importFromWS = new Button(group, SWT.PUSH);
        importFromWS.setText("Workspace...");
        gd = new GridData();
        gd.widthHint = 100;
        importFromWS.setLayoutData(gd);
        
        new Label(group, SWT.NULL);
        
        buttonRemove = new Button(group, SWT.PUSH);
        buttonRemove.setText("Remove");
        gd = new GridData(GridData.HORIZONTAL_ALIGN_END);
        gd.widthHint = 100;
        buttonRemove.setLayoutData(gd);
        buttonRemove.setEnabled(false);
        
        Button makeFragmentHostButton = new Button(group, SWT.CHECK);
        makeFragmentHostButton.setText("Make this a fragment bundle");
        gd = new GridData(GridData.FILL_HORIZONTAL);
        makeFragmentHostButton.setLayoutData(gd);
        
        final Text fragmentHostText = new Text(group, SWT.BORDER);
        fragmentHostText.setEnabled(false);
        gd = new GridData();
        gd.widthHint = 200;
        fragmentHostText.setLayoutData(gd);
        
        makeFragmentHostButton.addSelectionListener(new SelectionListener() {
			
			public void widgetSelected(SelectionEvent event) {
				boolean b = ((Button) (event.widget)).getSelection();
				if(b){
					fragmentHostText.setEnabled(true);
				}else{
					
				}
			}
			
			public void widgetDefaultSelected(SelectionEvent arg0) {
				
			}
		});
        
        fragmentHostText.addModifyListener(new ModifyListener() {
			
			public void modifyText(ModifyEvent arg0) {
				setFragmentHostBundleName(fragmentHostText.getText());
			}
		});
        
        importFromFS.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent arg0) {
				setOptionType(ArtifactFileUtils.OPTION_IMPORT_FS);
				handleFilePathBrowseButton();
			}
		});
        
        importFromWS.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent arg0) {
				setOptionType(ArtifactFileUtils.OPTION_IMPORT_WS);
				updateStatus(null);
		        ElementTreeSelectionDialog elementTreeSelectionDialog = new ElementTreeSelectionDialog(group.getShell(),
		        														WorkbenchLabelProvider.getDecoratingWorkbenchLabelProvider(),
		        														new WorkbenchContentProvider());
		        elementTreeSelectionDialog.setInput(ResourcesPlugin.getWorkspace().getRoot());
		        if (elementTreeSelectionDialog.open() == Window.OK) {
			        elementTreeSelectionDialog.getFirstResult();
			        IResource resource =(IResource) elementTreeSelectionDialog.getFirstResult();
			        if (getSelectedResources().contains(resource)){
			        	return;
			        }
			        if (resource instanceof IProject){
			        	IProject project=(IProject)resource;
			        	try {
	                        if (project.hasNature("org.eclipse.jdt.core.javanature")){
	                        	getSelectedResources().add(resource);
	                        }
                        } catch (CoreException e) {
	                        log.error(e);
                        }
			        }else if(!resource.getFileExtension().equals("jar")){
			        	updateStatus("Selected file should be with the extension of .jar");
			        }else{
			        	getSelectedResources().add(resource);
			        }
					viewLibraryLocations.refresh();
					setFileName(resource.getName()); 
		        }
		        dialogChanged();
			}
		});
        
        viewLibraryLocations.addSelectionChangedListener(new ISelectionChangedListener(){
            public void selectionChanged(SelectionChangedEvent arg0) {
            	updateRemoveButtonStatus();
            }
        });
        
        buttonRemove.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent arg0) {
				IStructuredSelection sel=(IStructuredSelection)viewLibraryLocations.getSelection();
				Object selected=sel.getFirstElement();
				if (getSelectedResources().contains(selected)){
					getSelectedResources().remove(selected);
					viewLibraryLocations.refresh();
					dialogChanged();
				}
			}
        });
        
		if (getSelectedResources().size()==0) {
			setPageComplete(false);
		}
        
        setProviders();
//		dialogChanged();
		setControl(group);
	}

	private void updateRemoveButtonStatus(){
		buttonRemove.setEnabled(viewLibraryLocations.getTable().getSelectionCount()>0);
		setFileName(viewLibraryLocations.getTable().getItem(viewLibraryLocations.getTable().getSelectionIndex()).getText());
	}
	
	private void setProviders() {
		viewLibraryLocations.setContentProvider(new ITreeContentProvider(){
            @SuppressWarnings("unchecked")
            public Object[] getChildren(Object obj) {
            	if (obj instanceof List){
            		List<Object> list=(List<Object>)obj;
            		return list.toArray();
            	}
	            return new Object[]{};
            }
            public Object getParent(Object arg0) {
	            return null;
            }
            @SuppressWarnings("unchecked")
            public boolean hasChildren(Object obj) {
	            return (obj instanceof List);
            }
            public Object[] getElements(Object obj) {
	            return getChildren(obj);
            }
            public void dispose() {}
            public void inputChanged(Viewer viewer, Object arg1, Object arg2) {
            	viewer.refresh();
            }
		});
		viewLibraryLocations.setLabelProvider(new ILabelProvider(){
			ILabelProvider lblProvider=WorkbenchLabelProvider.getDecoratingWorkbenchLabelProvider();
            public Image getImage(Object obj) {
            	if (obj instanceof File){
            		return LibrariesImageUtils.getInstance().getImageDescriptor("jar-16x16.png").createImage();
            	}else if (obj instanceof IFile){
            		return LibrariesImageUtils.getInstance().getImageDescriptor("jar-16x16.png").createImage();
            	}else{
            		return lblProvider.getImage(obj);
            	}
            }

            public String getText(Object obj) {
            	if (obj instanceof File){
            		return ((File)obj).toString();
            	}else if (obj instanceof IFile){
            		IFile file=(IFile)obj;
            		return file.getName()+" ["+file.getParent().getFullPath().toOSString()+"]";
            	}else{
            		return lblProvider.getText(obj);
            	}
            }
            public void addListener(ILabelProviderListener arg0) {}
            public void dispose() {}
            public boolean isLabelProperty(Object arg0, String arg1) {
	            return false;
            }
            public void removeListener(ILabelProviderListener arg0) {}
			
		}); 
		                      
		viewLibraryLocations.setInput(getSelectedResources());
		                      
    }

	public void handleFilePathBrowseButton() {
		List<File> fileNames = getSavePath();
		if (fileNames != null){
			for (File file : fileNames) {
				getSelectedResources().add(file);
				viewLibraryLocations.refresh();
				setFileName(file.getName());
			}
		}
		dialogChanged();
	}

	private List<File> getSavePath() {
		List<File> files=new ArrayList<File>();
		FileDialog fld = new FileDialog(this.getShell(), SWT.MULTI);
		fld.setFilterExtensions(new String[]{"*.jar"});
		boolean done = false;
		while (!done) {
			String parentPath = null;
			String[] selectedFiles = null;
			if (fld.open() != null) {
				parentPath = fld.getFilterPath();
				selectedFiles = fld.getFileNames();
			}
			if (selectedFiles == null) {
				done = true;
			} else {
				File file = null;
				for (String fName : selectedFiles) {
					file = new File(parentPath, fName);
					if (file.exists()) {
						done = true;
						files.add(file);
						
					} else {
						done = false;
					}
				}
			}
			
		}
		return files;
	}

	private void dialogChanged() {
		if (getSelectedResources().size()==0) {
			updateStatus("At least one resource must be selected");
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
		if(ArtifactFileUtils.IsSpecialCharactersExist(fileName.substring(0,(fileName.lastIndexOf(".") != -1)?fileName.lastIndexOf("."):fileName.length())))
			fileName=fileName.substring(0,fileName.lastIndexOf(".")).replace(".", "_");
		fileName=(fileName.lastIndexOf("/")!=-1)?fileName.substring(fileName.lastIndexOf("/")+1):fileName;
		if (f==null || f.equals("") || f.equals(this.fileName)){
			wizard.setFileName(fileName);
		}
	    this.fileName = fileName;
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
	

}