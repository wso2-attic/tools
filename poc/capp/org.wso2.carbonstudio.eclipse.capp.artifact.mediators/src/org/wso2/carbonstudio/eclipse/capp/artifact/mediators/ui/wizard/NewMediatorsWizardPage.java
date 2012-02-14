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

package org.wso2.carbonstudio.eclipse.capp.artifact.mediators.ui.wizard;


import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.IClassFile;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
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
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.wso2.carbonstudio.eclipse.utils.file.FileUtils;
import org.wso2.carbonstudio.eclipse.utils.constants.ProjectConstants;
import org.wso2.carbonstudio.eclipse.capp.artifact.mediators.Activator;
import org.wso2.carbonstudio.eclipse.esb.mediator.ui.wizard.NewMediatorWizard;
import org.wso2.carbonstudio.eclipse.logging.core.ICarbonStudioLog;
import org.wso2.carbonstudio.eclipse.logging.core.Logger;


public class NewMediatorsWizardPage extends WizardPage {
	private static ICarbonStudioLog log=Logger.getLog(Activator.PLUGIN_ID);

	WizardNewFileCreationPage wizard;
	private IProject selectedProject;
	private Button fromFS; 
	private Button fsBrowseButton;
	private Text fsPath;
	private Combo projectListCombo;
	private IStructuredSelection selection;
	private List<Object> selectedResources;
	private String className;
	private NewMediatorWizard newMediator;

	private String fileSystemJAR;
	private String fileName;
	

	
	public NewMediatorsWizardPage(WizardNewFileCreationPage wizardNewFileCreationPage, IProject p, IStructuredSelection cselection) {
		super("wizardPage");
		setDescription("Select Mediator");
        this.wizard=wizardNewFileCreationPage;
        this.selectedProject = p;
        this.selection = cselection;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		String[] fqnSplit = className.split("\\.");
		this.className = fqnSplit[fqnSplit.length -1];
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
		lblFrom.setText("Create ESB Mediator artifact from:");
        lblFrom.setLayoutData(gd);
		
		gd = new GridData();
		Button FromWSButton = new Button(group, SWT.RADIO);
		FromWSButton.setText("From workspace");
		FromWSButton.setLayoutData(gd);
		FromWSButton.setSelection(true);
		
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
	            	if(getClassName() != null && getClassName().equals("")){
	            		setFileName(getClassName());
	            	}
	            	
	            }
	        } catch (CoreException e) {
	            log.error(e);
	        }
		}
		
		final Button newMediatorClassButton = new Button(group, SWT.PUSH);
		newMediatorClassButton.setText("New...");
		gd = new GridData();
		gd.widthHint = 100; 
		newMediatorClassButton.setLayoutData(gd);
		newMediatorClassButton.setEnabled(true);
		
		FromWSButton.addSelectionListener(new SelectionListener() {
			
			public void widgetSelected(SelectionEvent event) {
				boolean b = ((Button) (event.widget)).getSelection();
				if(b){
					projectListCombo.setEnabled(true);
					newMediatorClassButton.setEnabled(true);
					fsPath.setEnabled(false);
					fsBrowseButton.setEnabled(false);
					if(!projectListCombo.getText().equals("") && projectListCombo.getText() != null){
						IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectListCombo.getText());
						try {
		                    if (project.hasNature("org.eclipse.jdt.core.javanature")){
		                    	getSelectedResources().clear();
		                    	getSelectedResources().add(project);
		                    	setFileName(getClassName());
		                    }
		                } catch (CoreException e) {
		                    log.error(e);
		                }
					}
				}
			}
			
			public void widgetDefaultSelected(SelectionEvent arg0) {
				
			}
		});
		
		projectListCombo.addSelectionListener(new SelectionListener() {
			
			public void widgetSelected(SelectionEvent arg0) {
				IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectListCombo.getText());
				try {
                    if (project.hasNature("org.eclipse.jdt.core.javanature")){
                    	getSelectedResources().clear();
                    	getSelectedResources().add(project);
                    	setFileName(getClassName());
                    }
                } catch (CoreException e) {
                    log.error(e);
                }
				
			}
			
			public void widgetDefaultSelected(SelectionEvent arg0) {
				
			}
		});
		
		newMediatorClassButton.addSelectionListener(new SelectionListener() {
			
			public void widgetSelected(SelectionEvent arg0) {
				newMediator = new NewMediatorWizard();
				newMediator.init(PlatformUI.getWorkbench(), selection);
				WizardDialog wizardDialog = new WizardDialog(group.getShell(), newMediator);
				if (wizardDialog.open()==Window.OK){
					projectListCombo.add(newMediator.getProjectName());
					projectListCombo.setText(newMediator.getProjectName());
					setClassName(newMediator.getClassName());
					IProject prj = ResourcesPlugin.getWorkspace().getRoot().getProject(newMediator.getProjectName());
					getSelectedResources().clear();
					getSelectedResources().add(prj);
					setFileName(getClassName());
					updateStatus(null);
				}
			}
			
			public void widgetDefaultSelected(SelectionEvent arg0) {
				
			}
		});
		
		fromFS = new Button(group, SWT.RADIO);
		fromFS.setText("From File System");
		gd = new GridData();
		fromFS.setLayoutData(gd);
		
		fsPath = new Text(group, SWT.BORDER);
		gd = new GridData();
		gd.widthHint = 300;
		fsPath.setLayoutData(gd);
		fsPath.setEnabled(false);
		
		fsBrowseButton = new Button(group, SWT.PUSH);
		fsBrowseButton.setText("Browse...");
		gd = new GridData();
		gd.widthHint = 100;
		fsBrowseButton.setLayoutData(gd);
		fsBrowseButton.setEnabled(false);
		
		fsPath.addModifyListener(new ModifyListener() {
			
			public void modifyText(ModifyEvent arg0) {
				if(fsPath.getText() != null && !fsPath.getText().equals("")){
					File file = new File(fsPath.getText());
					if(file.exists()){
						getSelectedResources().clear();
						getSelectedResources().add(file);
						updateStatus(null);
						setFileSystemJAR(fsPath.getText());
						setFileName(getFileSystemJAR().substring(0,getFileSystemJAR().lastIndexOf(".")).substring(getFileSystemJAR().substring(0,getFileSystemJAR().lastIndexOf(".")).lastIndexOf("/")+1));
					}else{
						updateStatus("Invalid file path.");
					}
				}
			}
		});
		
//		FromWSButton.addSelectionListener(new SelectionListener() {
//			
//			public void widgetSelected(SelectionEvent event) {
//				boolean b = ((Button) (event.widget)).getSelection();
//				if(b){
//					updateStatus(null);
//					newMediatorClassButton.setEnabled(true);
//					projectListCombo.setEnabled(true);
//					fsPath.setEnabled(false);
//					fsBrowseButton.setEnabled(false);
//					if(projectListCombo.getText().equals("") || projectListCombo.getText() == null){
//						setPageComplete(false);
//					}
//				}
//			}
//			
//			public void widgetDefaultSelected(SelectionEvent arg0) {
//				
//			}
//		});
		
		fromFS.addSelectionListener(new SelectionListener() {
			
			public void widgetSelected(SelectionEvent event) {
				boolean b = ((Button) (event.widget)).getSelection();
				if(b){
					fsPath.setEnabled(true);
					fsBrowseButton.setEnabled(true);
					
					newMediatorClassButton.setEnabled(false);
					projectListCombo.setEnabled(false);
					if(fsPath.getText().equals("") || fsPath.getText() == null){
						setPageComplete(false);
					}else{
						if(!FileUtils.isPathValid(fsPath.getText())){
							updateStatus("File does not exist.");
						}else{
							File file = new File(fsPath.getText());
							getSelectedResources().clear();
							getSelectedResources().add(file);
							updateStatus(null);
						}
					}
				}
			}
			
			public void widgetDefaultSelected(SelectionEvent arg0) {
				
			}
		});
		
		fsBrowseButton.addSelectionListener(new SelectionListener() {
			
			public void widgetSelected(SelectionEvent arg0) {
				handlePathBrowseButton(fsPath);
				updateStatus(null);
			}
			
			public void widgetDefaultSelected(SelectionEvent arg0) {
				
			}
		});
		
		if((projectListCombo.getText().equals("") || projectListCombo.getText()== null) && 
				(fsPath.getText().equals("") || fsPath.getText() == null)){
			setPageComplete(false);
		}
		
		setControl(group);
	}


	
	public void handlePathBrowseButton(Text filePathText) {
		String fileName = getSavePath();
		if (fileName != null)
			filePathText.setText(fileName);
	}

	private String getSavePath() {
		String fileName = null;
		// FileDialog
		FileDialog fld = new FileDialog(this.getShell(), SWT.OPEN);
		fld.setFilterExtensions(new String[]{"*.jar"});
		boolean done = false;
		while (!done) {
			// Open the File Dialog
			fileName = fld.open();
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
	
	public void getMediatorClassesForProject(String project){
		IProject prj = ResourcesPlugin.getWorkspace().getRoot().getProject(project);
//		filterClassesList = new ArrayList<String>();
		IJavaProject jp = JavaCore.create(prj);
		try {
			IPackageFragment[] packageFragments = jp.getPackageFragments();
			for (IPackageFragment fragment : packageFragments) {
				IClassFile[] classFiles = fragment.getClassFiles();
				IJavaElement[] children = fragment.getChildren();
				for (IJavaElement element : children) {
						String elementName = element.getElementName();
						ICompilationUnit[] compilationUnits = fragment.getCompilationUnits();
						
						for (ICompilationUnit unit : compilationUnits) {
							String a = unit.getElementName();
							IType[] types = unit.getTypes();
							for (IType type : types) {
								int elementType = type.getElementType();
								if(type.getSuperclassName() != null){
									String[][] resolveType = type.resolveType(type.getSuperclassName());
									if((resolveType[0][0]).toString().equals("org.apache.synapse.mediators") &&
											(resolveType[0][1]).toString().equals("AbstractMediator")){
										String fullyQualifiedName = type.getFullyQualifiedName();
									}
								}

							}
						}
				}
			}
		} catch (JavaModelException e) {
			log.error(e);
		}
	}
	
	public void getMediatorClassesForjar(String jarPath){
		try {
			File tempDir = FileUtils.extractJar(new File(jarPath));
			List<File> classFiles = FileUtils.searchDir(tempDir);
			for (File file : classFiles) {
				String[] name = file.getName().split("\\.");
				String className = name[0];
				Class clazz = Class.forName(name[0]);
				Method[] methods = clazz.getMethods();
			}
		} catch (IOException e) {
			log.error(e);
		} catch (ClassNotFoundException e) {
			log.error(e);
		}
	}
	
	
	public void fillProjectListCombo(){
		HashMap<IProject, String> relevantProjects = getProjects();
		for (IProject project : relevantProjects.keySet()) {
			projectListCombo.add(project.getName());
			setClassName(relevantProjects.get(project));
		}
		
		if (projectListCombo.getItemCount()>0 && projectListCombo.getSelectionIndex() == -1) {
			projectListCombo.select(0);
		}
		
	}
	public HashMap<IProject, String> getProjects(){
		
		IProject[] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
		HashMap filterProjectList = new HashMap<IProject, String>();
		for (IProject prj : projects) {
			try {
	            if (!prj.isOpen() || !prj.hasNature(ProjectConstants.JAVA_NATURE_ID) ){
	            	continue;
	            }
            } catch (CoreException e1) {
	            e1.printStackTrace();
	            continue;
            }
			IJavaProject jp = JavaCore.create(prj);
			try {
				IPackageFragment[] packageFragments = jp.getPackageFragments();
				for (IPackageFragment fragment : packageFragments) {
					IJavaElement[] children = fragment.getChildren();
					for (IJavaElement element : children) {
							ICompilationUnit[] compilationUnits = fragment.getCompilationUnits();
							for (ICompilationUnit unit : compilationUnits) {
								String a = unit.getElementName();
								IType[] types = unit.getTypes();
								for (IType type : types) {
									if(type.getSuperclassName() != null){
										String[][] resolveType = type.resolveType(type.getSuperclassName());
										if(resolveType != null && (resolveType[0][0]).toString().equals("org.apache.synapse.mediators") &&
												(resolveType[0][1]).toString().equals("AbstractMediator")){
											String className = type.getElementName();
											if(!filterProjectList.containsKey(prj)){
												filterProjectList.put(prj,className);
											}
											String fullyQualifiedName = type.getFullyQualifiedName();
										}
									}
								}
							}
					}
				}
			} catch (JavaModelException e) {
				log.error(e);
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
	
	public String getFileSystemJAR() {
		return fileSystemJAR;
    }
	
	public void setFileSystemJAR(String fileSystemJAR) {
		String f = wizard.getFileName();
		File file = new File(fileSystemJAR);
		String name2 = null;
		if (file.exists()) {
	        name2 = file.getName();
	        if (name2.toUpperCase().endsWith(".JAR")) name2=name2.substring(0,name2.length()-4-1);
        }
		if (this.fileSystemJAR!=null){
    		String name1 = null;
    		File file2 = new File(this.fileSystemJAR);
    		if (file2.exists()) {
	            name1 = file2.getName();
	            if (name1.toUpperCase().endsWith(".JAR")) name1=name1.substring(0,name1.length()-4-1);
            }
			if ((f==null || f.equals("") || f.equals(name1)) && (name2!=null)){
    			wizard.setFileName(name2);
    		}
		}else{
    		if ((f==null || f.equals("")) && (name2!=null)){
    			wizard.setFileName(name2);
    		}

		}
	    this.fileSystemJAR = fileSystemJAR;
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