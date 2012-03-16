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

package org.wso2.developerstudio.eclipse.capp.project.ui.editor;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MenuEvent;
import org.eclipse.swt.events.MenuListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.editor.FormPage;
import org.eclipse.ui.forms.widgets.ExpandableComposite;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.model.WorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.eclipse.ui.part.FileEditorInput;
import org.wso2.developerstudio.eclipse.capp.core.artifacts.ICAppArtifactHandler;
import org.wso2.developerstudio.eclipse.capp.core.artifacts.manager.ICAppArtifactManager;
import org.wso2.developerstudio.eclipse.capp.core.artifacts.manager.IServerRole;
import org.wso2.developerstudio.eclipse.capp.core.manifest.Artifact;
import org.wso2.developerstudio.eclipse.capp.core.manifest.ArtifactDependency;
import org.wso2.developerstudio.eclipse.capp.core.ui.wizard.AbstractNewArtifactWizard;
import org.wso2.developerstudio.eclipse.capp.project.Activator;
import org.wso2.developerstudio.eclipse.capp.project.manager.CAppArtifactManager;
import org.wso2.developerstudio.eclipse.capp.project.provider.ArtifactLabelProvider;
import org.wso2.developerstudio.eclipse.capp.project.provider.ArtifactsForProjectContentProvider;
import org.wso2.developerstudio.eclipse.capp.project.ui.dialog.RemoteDependencyDialog;
import org.wso2.developerstudio.eclipse.capp.project.ui.wizard.CAppExportWizard;
import org.wso2.developerstudio.eclipse.capp.project.utils.CAppImageUtils;
import org.wso2.developerstudio.eclipse.logging.core.IDeveloperStudioLog;
import org.wso2.developerstudio.eclipse.logging.core.Logger;

public class ArtifactEditorPage extends FormPage implements IResourceChangeListener, Observer {
	private static IDeveloperStudioLog log=Logger.getLog(Activator.PLUGIN_ID);

	private FormToolkit toolkit;
	private ScrolledForm form;
	private Text txtName;
	private Text txtVersion;
	private CheckboxTableViewer lstViewLocalDependencies;
	private Label lblLocalDependendecies;
	private ArtifactEditor editor;
	private Artifact original;
	private Artifact current;
	
    private boolean dependenciesChanged;
	private Combo cmbServerRole;
	private FileEditorInput fei;
	private Control lblRemoteDependendecies;
	private TableViewer lstViewRemoteDependencies;
	private Button btnRemoveRemoteDependency;
	private Button btnAddRemoteDependency;
	private Text txtFile;
	private Button btnFileBrowse;
	private boolean superArtifact=false;
	private Button btnNewDependency;
	private Menu menu;
	private Action exportAction;
	private Action refreshAction;
	private Button btnSelectAll;
	private Button btnDeselectAll;


	public ArtifactEditorPage(FormEditor editor, String id, String title, Artifact original) {
	    super(editor, id, title);
	    setSuperArtifact(original.isSuperArtifact());
	    original.addObserver(this);
	    this.editor=(ArtifactEditor)editor;
	    fei=(FileEditorInput)editor.getEditorInput().getPersistable();
	    this.editor.setEditorTitle(fei.getFile().getName());
	    try {
	        this.original=original;
	        current=original.clone();
        } catch (Exception e) {
	        log.error(e);
        }
    }

	private void updateFormHeader(){
		form.setText(original.getName()+" - type: "+original.getType()+"");
		ICAppArtifactHandler artifactHandler = CAppArtifactManager.getInstance().getArtifactHandler(original);
		if (artifactHandler!=null){
			form.setImage(artifactHandler.getArtifactImage().createImage());
		}else{
			form.setImage(CAppImageUtils.getInstance().getImageDescriptor("artifact.png").createImage());
		}
	}

	protected void createFormContent(IManagedForm managedForm) {
		toolkit = managedForm.getToolkit();
		form = managedForm.getForm();
		form.getToolBarManager().add(getRefreshAction());
		if (isSuperArtifact()){
			form.getToolBarManager().add(getExportAction());
		}
		toolkit.decorateFormHeading(form.getForm());
		form.getForm(); 
		form.getBody().setLayout(new GridLayout());

		Composite columnComp = toolkit.createComposite(form.getBody());
		GridLayout layout = new GridLayout();
		layout.numColumns = 1;
		layout.verticalSpacing = 0;
		layout.horizontalSpacing = 10;
		columnComp.setLayout(layout);
		columnComp.setLayoutData(new GridData(GridData.FILL_HORIZONTAL | GridData.VERTICAL_ALIGN_FILL));
		
		createArtifactMetaSection(columnComp);

		createDependencySection(columnComp);
		
		if (!isSuperArtifact()){
			createDeployInfoSection(columnComp);
		}
		
		updateControlData();
		
		form.updateToolBar();
		form.reflow(true);
	}


	private void createArtifactMetaSection(Composite columnComp) {
	    GridLayout layout;
	    Composite generalComposite = toolkit.createComposite(columnComp);
		
		layout = new GridLayout();
		layout.numColumns = 3;
		layout.verticalSpacing = 10;
		layout.horizontalSpacing = 10;
		generalComposite.setLayout(layout);
		generalComposite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL | GridData.VERTICAL_ALIGN_FILL));

		toolkit.createLabel(generalComposite,"Name");
		
		txtName = toolkit.createText(generalComposite,"",SWT.BORDER);
		GridData gd = new GridData();
		gd.horizontalSpan = 2; 
		gd.widthHint = 200;
		txtName.setLayoutData(gd);
		txtName.setFocus();
		
		toolkit.createLabel(generalComposite,"Version");
		
		txtVersion = toolkit.createText(generalComposite,"",SWT.BORDER);
		gd = new GridData();
		gd.horizontalSpan = 2; 
		gd.widthHint = 200;
		txtVersion.setLayoutData(gd);

		if (!isSuperArtifact()) {
	        toolkit.createLabel(generalComposite, "Path to the Deployable");
	        txtFile = toolkit.createText(generalComposite, "", SWT.BORDER | SWT.READ_ONLY);
	        txtFile.setLayoutData(getGridData(1, GridData.FILL_HORIZONTAL));
	        btnFileBrowse = toolkit.createButton(generalComposite, "Browse", SWT.None);
		}
		
		toolkit.createLabel(generalComposite,"");

		txtVersion.addModifyListener(new ModifyListener(){
            public void modifyText(ModifyEvent arg0) {
            	updateVersion();
            }
        });
		txtName.addModifyListener(new ModifyListener(){
            public void modifyText(ModifyEvent arg0) {
            	updateName();
            }
        });
		if (!isSuperArtifact()) {
	        txtFile.addModifyListener(new ModifyListener() {
		        public void modifyText(ModifyEvent arg0) {
			        updateFile();
		        }
	        });
	        btnFileBrowse.addSelectionListener(new SelectionListener() {
		        public void widgetDefaultSelected(SelectionEvent event) {
			        widgetSelected(event);
		        }

		        public void widgetSelected(SelectionEvent arg0) {
			        ElementTreeSelectionDialog elementTreeSelectionDialog = new ElementTreeSelectionDialog(getSite().getShell(),WorkbenchLabelProvider.getDecoratingWorkbenchLabelProvider(),new WorkbenchContentProvider());
			        elementTreeSelectionDialog.setInput(fei.getFile().getParent());
			        if (elementTreeSelectionDialog.open() == Window.OK) {
				        elementTreeSelectionDialog.getFirstResult();
				        IResource resource =
				                             (IResource) elementTreeSelectionDialog
				                                                                   .getFirstResult();
				        IPath parentPath = fei.getFile().getParent().getFullPath();
				        IPath result =
				                       resource.getFullPath()
				                               .removeFirstSegments(parentPath.segmentCount());
				        txtFile.setText(result.toPortableString());
			        }
		        }
	        });
        }
    }

	public void createDeployInfoSection(Composite deployInfoComp){
	    GridLayout layout;
	    Section section = toolkit.createSection(deployInfoComp, ExpandableComposite.TWISTIE | ExpandableComposite.TITLE_BAR | ExpandableComposite.FOCUS_TITLE);
		section.setText("Deployment");
		section.setDescription("Specify deployment info for the artifact");
		section.setLayoutData(new GridData(GridData.FILL_HORIZONTAL | GridData.VERTICAL_ALIGN_FILL));
		
		Composite deployComposite = toolkit.createComposite(section);
		layout = new GridLayout();
		layout.numColumns = 2;
		layout.marginHeight = 5;
		layout.marginWidth = 10;
		layout.verticalSpacing = 5;
		layout.horizontalSpacing = 45;
		layout.makeColumnsEqualWidth=false;
		deployComposite.setLayout(layout);
		deployComposite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL | GridData.VERTICAL_ALIGN_FILL));

		GridData gd = new GridData();
		gd.widthHint=200;
		gd.horizontalAlignment=GridData.END;
		
		toolkit.createLabel(deployComposite, "Server Role");
		
		cmbServerRole = new Combo(deployComposite,SWT.None);
		gd = new GridData();
//		gd.horizontalSpan = 2; 
		gd.widthHint = 200;
		cmbServerRole.setLayoutData(gd);
		
//		if(cmbServerRole.getText() != null){
//			cntrolData.setPreviousServerRole(cmbServerRole.getText());
//		}
				
		cmbServerRole.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent arg0) {
				updateServerRole();				
			}
		});
		
		section.setExpanded(true);
		toolkit.paintBordersFor(deployComposite);
		section.setClient(deployComposite);

	}
	
	private void updateName() {
		setName(txtName.getText());
		validate();
		updateDirtyState();
    }
	
	private void setName(String text) {
		current.setName(text);
    }


	private void updateVersion(){
		setVersion(txtVersion.getText().trim());
		validate();
		updateDirtyState();
	}
	
	private void updateServerRole(){
		current.setServerRole(cmbServerRole.getText());
		String serverRoleDescription = CAppArtifactManager.getInstance().getServerRoleDescription(current.getServerRole());
		cmbServerRole.setToolTipText(serverRoleDescription==null? "":serverRoleDescription);
		updateDirtyState();
	}

	
	private void fillAndUpdateServerRoleCombo(){
		Display.getCurrent().asyncExec(new Runnable(){
            public void run() {
            	List<String> existingServerList = Arrays.asList(cmbServerRole.getItems());
//            	cmbServerRole.remove(0, cmbServerRole.getItemCount()-1);
        		ICAppArtifactManager cAppArtifactManager = CAppArtifactManager.getInstance();
        		IServerRole[] serverRoles = cAppArtifactManager.getServerRoles(fei.getFile().getProject());
        		existingServerList=new ArrayList<String>(existingServerList);
        		for (IServerRole serverRole : serverRoles) {
        			if (!existingServerList.contains(serverRole.getServerRoleName())){
        				cmbServerRole.add(serverRole.getServerRoleName());
        			}else{
        				existingServerList.remove(serverRole.getServerRoleName());
        			}
                }
        		for(String role:existingServerList){
        			cmbServerRole.remove(role);
        		}
    	    	int i=0;
    	    	int index=-1;
    	    	for(String item:cmbServerRole.getItems()){
    	    		if (item.equals(current.getServerRole())){
    	    			index=i;
    	    			break;
    	    		}
    	    		i++;
    	    	}
    	    	if (index!=-1){
    	    		cmbServerRole.select(index);
    	    	}
    	    	if (cmbServerRole.getText().equals("")){
    	    		cmbServerRole.setText(current.getServerRole());
    	    	}
            }
			
		});
		
	}
	
	private void setupCreateNewDependencyMenuItemMenu(MenuItem item, final ICAppArtifactHandler artifactHandler){
//													  HashMap<String, List<ICAppArtifactHandler>> aGroupsMap){
		item.setImage(artifactHandler.getArtifactIcon().createImage());
		item.setText(artifactHandler.getName());
		
		item.addSelectionListener(new SelectionListener(){
            public void widgetDefaultSelected(SelectionEvent event) {
            	widgetSelected(event);
            }
            public void widgetSelected(SelectionEvent event) {
            	AbstractNewArtifactWizard artifactWizard = artifactHandler.getNewArtifactWizard(new StructuredSelection(fei.getFile().getProject()));
            	WizardDialog wizardDialog = new WizardDialog(getSite().getShell(), artifactWizard);
            	artifactWizard.init(PlatformUI.getWorkbench(),new StructuredSelection(fei.getFile().getProject()));
            	if (wizardDialog.open()==Window.OK){
            		Artifact artifact=artifactWizard.getArtifact();
            		ArtifactDependency artifactDependency = new ArtifactDependency(original, artifact);
//            		artifactDependency.setName(artifact.getName());
//            		artifactDependency.setVersion(artifact.getVersion());
            		artifactDependency.setInclude(false);
//            		if (isSuperArtifact()) artifactDependency.setServerRole(artifact.getServerRole());
            		current.getDependencies().add(artifactDependency);
                	refreshLocalDependencyList();
                	lstViewLocalDependencies.setChecked(artifact, true);
                	setDependenciesChanged(true);
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

	private void setVersion(String text) {
		current.setVersion(text);
    }

	private void setFile(String file){
		current.setFile(file);
	}
	
	
	
	private void updateFile(){
		setFile(txtFile.getText());
		validate();
		updateDirtyState();
	}

	private void createDependencySection(Composite columnComp) {
	    GridLayout layout;
	    Section section = toolkit.createSection(columnComp, ExpandableComposite.TWISTIE | ExpandableComposite.TITLE_BAR | ExpandableComposite.FOCUS_TITLE);
		section.setText("Dependencies");
		section.setDescription("Specify dependencies for the axis2 service");
		section.setLayoutData(new GridData(GridData.FILL_HORIZONTAL | GridData.VERTICAL_ALIGN_FILL));
		
		Composite dependencyComposite = toolkit.createComposite(section);
		layout = new GridLayout();
		layout.numColumns = 3;
		layout.marginHeight = 5;
		layout.marginWidth = 10;
		layout.verticalSpacing = 5;
		layout.horizontalSpacing = 5;
		layout.makeColumnsEqualWidth=false;
		dependencyComposite.setLayout(layout);
		dependencyComposite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL | GridData.VERTICAL_ALIGN_FILL));

		FontData fontData = null;
		
		GridData gd = new GridData();
		gd.widthHint=200;
		gd.horizontalAlignment=GridData.END;
		
		btnNewDependency = toolkit.createButton(dependencyComposite, "Create New Artifact", SWT.TOGGLE);
		btnNewDependency.setLayoutData(gd);
		
		if (!isSuperArtifact()) {
	        lblLocalDependendecies =
	                                 toolkit.createLabel(dependencyComposite, "Local dependencies",
	                                                     SWT.BOLD);
	        fontData = lblLocalDependendecies.getFont().getFontData()[0];
	        lblLocalDependendecies.setFont(new Font(null, fontData.getName(), fontData.getHeight(), 1));
	        lblLocalDependendecies.setLayoutData(getGridData(3, GridData.FILL_HORIZONTAL));
        }else{
	        Label lblExistingDependendecies = 
                toolkit.createLabel(dependencyComposite, "Existing Artifacts",
                                    SWT.BOLD);
	        fontData = lblExistingDependendecies.getFont().getFontData()[0];
	        lblExistingDependendecies.setFont(new Font(null, fontData.getName(), fontData.getHeight(), 1));
	        lblExistingDependendecies.setLayoutData(getGridData(3, GridData.FILL_HORIZONTAL));
        }
		//		toolkit.createLabel(dependencyComposite, "   ");
		lstViewLocalDependencies = CheckboxTableViewer.newCheckList(dependencyComposite, SWT.TOP | SWT.BORDER | SWT.V_SCROLL);
		gd=getGridData(3, GridData.FILL_BOTH);
		gd.horizontalIndent=10;
		gd.verticalSpan=4;
		lstViewLocalDependencies.getControl().setLayoutData(gd);
		
		toolkit.createLabel(dependencyComposite, "");
		
		gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalAlignment=GridData.END;
		gd.widthHint=120;
		
		btnSelectAll = toolkit.createButton(dependencyComposite, "Select All", SWT.None);
		btnSelectAll.setLayoutData(gd);
		btnDeselectAll = toolkit.createButton(dependencyComposite, "Deselect All", SWT.None);
		btnDeselectAll.setLayoutData(gd);
		
        lstViewLocalDependencies.addCheckStateListener(new ICheckStateListener() {
			public void checkStateChanged(CheckStateChangedEvent event) {
                setDependenciesChanged(true);
            }
        });
        lstViewLocalDependencies.addDoubleClickListener(new IDoubleClickListener() {
            public void doubleClick(DoubleClickEvent arg0) {
            	ISelection selection = lstViewLocalDependencies.getSelection();
            	if (selection instanceof StructuredSelection){
            		Object obj = ((StructuredSelection)selection).getFirstElement();
            		if (obj instanceof Artifact){
            			IFile source = ((Artifact)obj).getSource();
            			if (source!=null){
            				try {
	                            IDE.openEditor(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage(), source);
                            } catch (PartInitException e) {
	                            log.error(e);
                            }
            			}
            		}
            	}
            }
        });
        btnNewDependency.addSelectionListener(new SelectionListener(){
            public void widgetDefaultSelected(SelectionEvent event) {
            	widgetSelected(event);
            }

            public void widgetSelected(SelectionEvent event) {
				Rectangle rect = btnNewDependency.getBounds ();
				Point pt = new Point (10, rect.height);
				pt = btnNewDependency.toDisplay (pt);
				menu.setLocation (pt);
				menu.setVisible (true);
			}
		});
        btnSelectAll.addSelectionListener(new SelectionListener(){
            public void widgetDefaultSelected(SelectionEvent event) {
            	widgetSelected(event);
            }

            public void widgetSelected(SelectionEvent event) {
            	lstViewLocalDependencies.setAllChecked(true);
                setDependenciesChanged(true);
			}
		});

        btnDeselectAll.addSelectionListener(new SelectionListener(){
            public void widgetDefaultSelected(SelectionEvent event) {
            	widgetSelected(event);
            }

            public void widgetSelected(SelectionEvent event) {
            	lstViewLocalDependencies.setAllChecked(false);
                setDependenciesChanged(true);
			}
		});
        
        setupCreateNewArtifactMenu();
    	
		if (!isSuperArtifact()) {
	        lblRemoteDependendecies = toolkit.createLabel(dependencyComposite,
	                                                      "Remote dependencies", SWT.BOLD);
	        lblRemoteDependendecies.setLayoutData(getGridData(3, GridData.FILL_HORIZONTAL));
	        lblRemoteDependendecies.setFont(new Font(null, fontData.getName(), fontData.getHeight(), 1));
	        lstViewRemoteDependencies =
	                                    new TableViewer(dependencyComposite, SWT.TOP | SWT.BORDER |
	                                                                         SWT.V_SCROLL);
	        gd = getGridData(3, GridData.FILL_BOTH);
	        gd.horizontalIndent = 10;
	        gd.verticalSpan = 4;
	        lstViewRemoteDependencies.getControl().setLayoutData(gd);
	        toolkit.createLabel(dependencyComposite, "");
	        btnRemoveRemoteDependency =
	                                    toolkit.createButton(dependencyComposite, "Remove",
	                                                         SWT.None);
	        gd = new GridData();
	        gd.widthHint = 120;
	        gd.horizontalAlignment = GridData.END;
	        btnRemoveRemoteDependency.setLayoutData(gd);
	        btnRemoveRemoteDependency.setEnabled(false);
	        btnAddRemoteDependency = toolkit.createButton(dependencyComposite, "Add", SWT.None);
	        gd = new GridData();
	        gd.widthHint = 120;
	        gd.horizontalAlignment = GridData.END;
	        btnAddRemoteDependency.setLayoutData(gd);
	        
	        toolkit.createLabel(dependencyComposite,"");
	        
	        lstViewRemoteDependencies.addSelectionChangedListener(new ISelectionChangedListener() {
		        public void selectionChanged(SelectionChangedEvent arg0) {
			        updateRemoteDependencyRemoteButtonStatus();
		        }
	        });
	        btnRemoveRemoteDependency.addSelectionListener(new SelectionListener() {
		        public void widgetDefaultSelected(SelectionEvent event) {
			        widgetSelected(event);
		        }

		        public void widgetSelected(SelectionEvent event) {
			        ISelection selection = lstViewRemoteDependencies.getSelection();
			        if (selection != null && selection instanceof IStructuredSelection) {
				        IStructuredSelection sel = (IStructuredSelection) selection;
				        lstViewRemoteDependencies.remove(sel.getFirstElement());
				        setDependenciesChanged(true);
				        updateRemoteDependencyRemoteButtonStatus();
			        }
		        }
	        });
	        btnAddRemoteDependency.addSelectionListener(new SelectionListener() {
		        public void widgetDefaultSelected(SelectionEvent event) {
			        widgetSelected(event);
		        }

		        public void widgetSelected(SelectionEvent event) {
			        RemoteDependencyDialog remoteDependencyDialog =
			                                                        new RemoteDependencyDialog(
			                                                                                   getSite()
			                                                                                            .getShell(), current);
			        if (remoteDependencyDialog.open() == Window.OK) {
				        lstViewRemoteDependencies
				                                 .add(remoteDependencyDialog
				                                                            .getNewArtifactDependency());
				        setDependenciesChanged(true);
				        updateRemoteDependencyRemoteButtonStatus();
			        }
		        }
	        });
        }
		
		section.setExpanded(true);
		toolkit.paintBordersFor(dependencyComposite);
		section.setClient(dependencyComposite);
    }

	private void setupCreateNewArtifactMenu() {
	    Map<String, List<ICAppArtifactHandler>> prominantArtifactGroupsMap = new HashMap<String, List<ICAppArtifactHandler>>();
        menu = new Menu (btnNewDependency);
        
        List<ICAppArtifactHandler> prominantDependencyArtifactHandlers=new ArrayList<ICAppArtifactHandler>();
        List<ICAppArtifactHandler> otherArtifactHandlers=new ArrayList<ICAppArtifactHandler>();
        
        List<ICAppArtifactHandler> artifactHandlers = CAppArtifactManager.getInstance().getArtifactHandlers();
        fillPossibleDependencyArtifactHandlers(prominantDependencyArtifactHandlers,
                                               otherArtifactHandlers, artifactHandlers);
        
        for (ICAppArtifactHandler artifactHandler : prominantDependencyArtifactHandlers) {
        	List<ICAppArtifactHandler> list;
        	if(!prominantArtifactGroupsMap.containsKey(artifactHandler.getGroupID())){
        		prominantArtifactGroupsMap.put(artifactHandler.getGroupID(),new ArrayList<ICAppArtifactHandler>());
        	}
        	list=prominantArtifactGroupsMap.get(artifactHandler.getGroupID());
        	list.add(artifactHandler);
        }
        int count=0;
        for (String key : prominantArtifactGroupsMap.keySet()) {
        	count++;
        	List<ICAppArtifactHandler> list = prominantArtifactGroupsMap.get(key);
        	for (ICAppArtifactHandler icAppArtifactHandler : list) {
        		setupCreateNewDependencyMenuItemMenu(new MenuItem(menu, SWT.PUSH), icAppArtifactHandler);
			}
        	if(count < prominantArtifactGroupsMap.size()){
        		new MenuItem (menu, SWT.SEPARATOR);
        	}
		}
        if (otherArtifactHandlers.size()>0){
        	Menu moreMenu=new Menu(menu);
        	MenuItem moreItem = new MenuItem(menu, SWT.CASCADE);
        	moreItem.setText("More...");
        	moreItem.setMenu(moreMenu);
        	prominantArtifactGroupsMap.clear();
        	for (ICAppArtifactHandler artifactHandler : otherArtifactHandlers) {
            	List<ICAppArtifactHandler> list;
            	if(!prominantArtifactGroupsMap.containsKey(artifactHandler.getGroupID())){
            		prominantArtifactGroupsMap.put(artifactHandler.getGroupID(),new ArrayList<ICAppArtifactHandler>());
            	}
            	list=prominantArtifactGroupsMap.get(artifactHandler.getGroupID());
            	list.add(artifactHandler);
            }
            count=0;
            for (String key : prominantArtifactGroupsMap.keySet()) {
            	count++;
            	List<ICAppArtifactHandler> list = prominantArtifactGroupsMap.get(key);
            	for (ICAppArtifactHandler icAppArtifactHandler : list) {
            		setupCreateNewDependencyMenuItemMenu(new MenuItem (moreMenu, SWT.PUSH), icAppArtifactHandler);
    			}
            	if(count < prominantArtifactGroupsMap.size()){
            		new MenuItem (moreMenu, SWT.SEPARATOR);
            	}
    		}
        }
        
    	menu.addMenuListener(new MenuListener(){
    		public void menuHidden(MenuEvent arg0) {
    			btnNewDependency.setSelection(false);
    		}
    		public void menuShown(MenuEvent arg0) {}
    		
    	});
    }

	private void fillPossibleDependencyArtifactHandlers(
            List<ICAppArtifactHandler> prominantDependencyArtifactHandlers,
            List<ICAppArtifactHandler> otherArtifactHandlers,
            List<ICAppArtifactHandler> artifactHandlers) {
	    List<String> prominantDependencyArtifactTypes = getAllPossibleDependencyArtifactTypes(artifactHandlers);      
        
        for (ICAppArtifactHandler artifactHandler : artifactHandlers) {
        	if (prominantDependencyArtifactTypes.contains(artifactHandler.getArtifactType())){
        		prominantDependencyArtifactHandlers.add(artifactHandler);
        	}else{
        		otherArtifactHandlers.add(artifactHandler);
        	}
        }
    }

	private List<String> getAllPossibleDependencyArtifactTypes(
            List<ICAppArtifactHandler> artifactHandlers) {
	    List<String> prominantDependencyArtifactTypes=new ArrayList<String>();
        String type=original.getType();
        if (!isSuperArtifact()){
        	ICAppArtifactHandler handler = CAppArtifactManager.getInstance().getArtifactHandler(original);
        	String[] possibleDependencyArtifactTypes = handler.getPossibleDependencyArtifactTypes();
        	for (String dependency : possibleDependencyArtifactTypes) {
        		if (!prominantDependencyArtifactTypes.contains(dependency)){ 
        			prominantDependencyArtifactTypes.add(dependency);
        		}
            }
        }
        
        for (ICAppArtifactHandler artifactHandler : artifactHandlers) {
        	if (isSuperArtifact()){
        		if (!prominantDependencyArtifactTypes.contains(artifactHandler.getArtifactType())){ 
        			prominantDependencyArtifactTypes.add(artifactHandler.getArtifactType());
        		}
        	}else{
        		String[] possibleDependentArtifactTypes = artifactHandler.getPossibleDependentArtifactTypes();
        		for (String dependents : possibleDependentArtifactTypes) {
	                if (dependents.equals(type)){
	                	if (!prominantDependencyArtifactTypes.contains(artifactHandler.getArtifactType())){ 
	            			prominantDependencyArtifactTypes.add(artifactHandler.getArtifactType());
	            		}
	                	break;
	                }
                }
        	}
        }
	    return prominantDependencyArtifactTypes;
    }
	
	private void updateRemoteDependencyRemoteButtonStatus(){
    	btnRemoveRemoteDependency.setEnabled(lstViewRemoteDependencies.getSelection()!=null && !((IStructuredSelection)lstViewRemoteDependencies.getSelection()).isEmpty());    	
	}
	
	private GridData getGridData(int horizontalSpan, int style){
		GridData gd = new GridData(style);
		gd.horizontalSpan=horizontalSpan;
		return gd;
	}

    public void resourceChanged(IResourceChangeEvent arg0) {
	    
    }
    
    public void updateControlData(){
    	txtName.setText(current.getName());
    	txtVersion.setText(current.getVersion());
		updateLocalDependencyData();
    	refreshLocalDependencyList();
    	if (!isSuperArtifact()) {
	        txtFile.setText(current.getFile());
	        fillAndUpdateServerRoleCombo();
	    	updateRemoteDependencyData();
	    	refreshRemoteDependencyList();
        }
    	updateFormHeader();
    }

    private void refreshLocalDependencyList(){
    	lstViewLocalDependencies.refresh(true);
    	List<ArtifactDependency> dependencies = current.getDependencies();
    	List<String> dependencyNames=new ArrayList<String>();
    	List<Artifact> selectedArtifacts=new ArrayList<Artifact>();
    	for (ArtifactDependency artifactDependency : dependencies) {
    		if (!artifactDependency.isInclude()){
    			dependencyNames.add(artifactDependency.getName());
    			
    		        if (artifactDependency.getConnectingArtifact()!=null){
    		        	selectedArtifacts.add(artifactDependency.getConnectingArtifact());
    		        	dependencyNames.remove(artifactDependency.getConnectingArtifact().getName());
    		        }
    			
    		}
        }
    	if (dependencyNames.size() > 0) setDependenciesChanged(true);
    	lstViewLocalDependencies.setCheckedElements(selectedArtifacts.toArray());
    	updateSelectDeselectButtonState();
    }

    private void updateSelectDeselectButtonState(){
    	btnSelectAll.setEnabled(lstViewLocalDependencies.getTable().getItemCount()>0 && lstViewLocalDependencies.getCheckedElements().length<lstViewLocalDependencies.getTable().getItemCount());
    	btnDeselectAll.setEnabled(lstViewLocalDependencies.getTable().getItemCount()>0 && lstViewLocalDependencies.getCheckedElements().length>0);
    }
    
    private void refreshRemoteDependencyList(){
    	lstViewRemoteDependencies.getTable().removeAll();
    	List<ArtifactDependency> dependencies = current.getDependencies();
    	List<ArtifactDependency> remoteDependencies=new ArrayList<ArtifactDependency>();
    	
    	for (ArtifactDependency artifactDependency : dependencies) {
    		if (artifactDependency.isInclude()){
    			remoteDependencies.add(artifactDependency);
    		}
        }
    	lstViewRemoteDependencies.add(remoteDependencies.toArray());
    }

    
    private void updateLocalDependencyData(){
    	lstViewLocalDependencies.setLabelProvider(new ArtifactLabelProvider(isSuperArtifact()));
    	lstViewLocalDependencies.setContentProvider(getContentProviderForLocalDependencies());
    	lstViewLocalDependencies.setComparator(new ViewerComparator());
    	lstViewLocalDependencies.setInput(fei.getFile().getProject());
    }

    private void updateRemoteDependencyData(){
    	lstViewRemoteDependencies.setLabelProvider(new ArtifactLabelProvider(isSuperArtifact()));
    	lstViewRemoteDependencies.setComparator(new ViewerComparator());
    	
    }
    
    protected IStructuredContentProvider getContentProviderForLocalDependencies() {
        return new ArtifactsForProjectContentProvider(original);
    }
    
	public void setDependenciesChanged(boolean dependenciesChanged) {
	    this.dependenciesChanged = dependenciesChanged;
	    if (isSuperArtifact()){
	    	getExportAction().setEnabled(lstViewLocalDependencies.getCheckedElements().length>0);
	    }
		updateDirtyState();
		updateSelectDeselectButtonState();
		if (dependenciesChanged) updateDependencies();
	}


	public boolean isDependenciesChanged() {
	    return dependenciesChanged;
    }

	
	public boolean isPageDirty(){
		return isDependenciesChanged() || 
    		(!current.getVersion().equals(original.getVersion())) ||
    		(!isSuperArtifact() && !current.getFile().equals(original.getFile())) ||
    		(!current.getName().equals(original.getName())) ||
    		(!isSuperArtifact() && !current.getServerRole().equals(original.getServerRole()));
	}
	
	public Artifact getCurrentArtifact(){
		if (isDependenciesChanged()){
			updateDependencies();
		}
		return current;
	}

	private void updateDependencies() {
	    current.removeDependencies();
	    Object[] checkedElements = lstViewLocalDependencies.getCheckedElements();
	    for (Object o : checkedElements) {
	    	Artifact artifact=(Artifact)o;
	    	ArtifactDependency artifactDependency = new ArtifactDependency(original, artifact);
	    	artifactDependency.addObserver(original);
	    	artifactDependency.setInclude(false);
	    	current.getDependencies().add(artifactDependency);
	    }
	    if (!isSuperArtifact()) {
	        TableItem[] items = lstViewRemoteDependencies.getTable().getItems();
	        for (TableItem item : items) {
	            current.getDependencies().add((ArtifactDependency) item.getData());
	        }
	    }
    }
	
	public void syncOriginalToCurrent(){
		original=current.clone(original);
		setDependenciesChanged(false);
	}
	
	public void refreshUIContent(){
		updateControlData();
	}
	
	public void updateDirtyState() {
		editor.updateDirtyState();
	}

	public boolean isDirty() {
		return isPageDirty();
	}

	public void setSuperArtifact(boolean superArtifact) {
	    this.superArtifact = superArtifact;
    }

	public boolean isSuperArtifact() {
	    return superArtifact;
    }
	
	public Action getExportAction(){
		if (exportAction==null){
    		exportAction = new Action("Create Archive",CAppImageUtils.getInstance().getImageDescriptor("car.png")){
    			public void run() {
    				if (isPageDirty()){
    					if (MessageDialog.openQuestion(getSite().getShell(), "Save Changes", "Do you want to save changes before creating the CAR?")){
    						editor.doSave(null);
    						if (isPageDirty()){
    							MessageDialog.openError(getSite().getShell(), "Error", "An error occured while attempting to save. Please fix the issue and retry exporting");
    							return;
    						}
    					}
    				}
    				CAppExportWizard cAppExportWizard = new CAppExportWizard();
    				cAppExportWizard.init(PlatformUI.getWorkbench(), new StructuredSelection(fei.getFile().getProject()));
    				WizardDialog wizardDialog = new WizardDialog(getSite().getShell(), cAppExportWizard);
    				wizardDialog.open();
    			}
    		};
    		exportAction.setToolTipText("Create Archive");
		}
		return exportAction;
	}
	public Action getRefreshAction(){
		if (refreshAction==null){
			refreshAction = new Action("Refresh",CAppImageUtils.getInstance().getImageDescriptor("refresh.png")){
    			public void run() {
    				try {
	                    doFullUpdateRefresh();
                    } catch (Exception e) {
	                    log.error(e);
	                    MessageDialog.openError(getSite().getShell(), "Error in refreshing", "An error occured while attempting to refresh.\n\n"+e.getMessage());
                    }
    			}
    		};
    		refreshAction.setToolTipText("Refresh");
		}
		return refreshAction;
	}
	
	public void doFullUpdateRefresh() throws Exception {
		original.refresh();
        if(current.getModificationStamp() != original.getModificationStamp()){
			if(!isPageDirty() || MessageDialog.openQuestion(getSite().getShell(), "File out of sync", "Do you wish to override the changes ?")){
					current = original.clone();
			}
		}
		refreshUIContent();
    }

    public void update(Observable o, Object arg) {
	    if (o==original){
	    	if (!isPageDirty()){
	    		try {
	                doFullUpdateRefresh();
                } catch (Exception e) {
	                log.error(e);
                }
	    	}
	    }
    }
    
    public void dispose() {
    	original.deleteObserver(this);
        super.dispose();
    }
}
