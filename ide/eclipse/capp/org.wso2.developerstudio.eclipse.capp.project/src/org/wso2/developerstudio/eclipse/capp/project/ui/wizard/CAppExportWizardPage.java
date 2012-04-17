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

package org.wso2.developerstudio.eclipse.capp.project.ui.wizard;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ViewerComparator;
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
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.wso2.developerstudio.eclipse.capp.core.manifest.Artifact;
import org.wso2.developerstudio.eclipse.capp.core.manifest.ArtifactDependency;
import org.wso2.developerstudio.eclipse.capp.core.utils.ArtifactFileUtils;
import org.wso2.developerstudio.eclipse.capp.project.Activator;
import org.wso2.developerstudio.eclipse.capp.project.manager.CAppArtifactManager;
import org.wso2.developerstudio.eclipse.capp.project.provider.ArtifactLabelProvider;
import org.wso2.developerstudio.eclipse.capp.project.provider.ArtifactsForProjectContentProvider;
import org.wso2.developerstudio.eclipse.logging.core.IDeveloperStudioLog;
import org.wso2.developerstudio.eclipse.logging.core.Logger;

public class CAppExportWizardPage extends WizardPage {
	private static IDeveloperStudioLog log=Logger.getLog(Activator.PLUGIN_ID);

//	private String fileLocation;
//	private Text deployInWorkspaceText;
	private IProject selectedProject;
    private Text txtName;
    private Text txtVersion;
    private CheckboxTableViewer lstViewLocalDependencies;
	private Artifact original;
	private Artifact current;
	
    private boolean dependenciesChanged;
	private Button btnSelectAll;
	private Button btnDeselectAll;
	
	private Button stratosDep;
//	private Button standAloneDep;
	
	private boolean stratosDepEnabled;
//	private IProject[] prjctList;
//	private String projectToExport = null;
	
	
	public boolean isStratosDepEnabled() {
		return stratosDepEnabled;
	}

	public void setStratosDepEnabled(boolean stratosDepEnabled) {
		this.stratosDepEnabled = stratosDepEnabled;
	}

	public CAppExportWizardPage(String pageName , IProject p) {
		super(pageName);
		setTitle("Carbon Application Archive");
		setDescription("Create an deployable CAR file");
		setSelectedProject(p);
		try {
	        original=CAppArtifactManager.getInstance().getSuperArtifact(getSelectedProject());
	        current=original.clone();
        } catch (CoreException e) {
	        log.error(e);
        } catch (IOException e) {
	        log.error(e);
        }
    }

	public void createControl(Composite parent) {
//		GridData gd;
//		Label label;
//		Button deployInWorkspaceBrowseButton;

		Composite container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		layout.numColumns = 1;
		layout.verticalSpacing = 9;
		container.setLayout(layout);

		if (!CAppArtifactManager.getInstance().isCAppProject(getSelectedProject())){
			setControl(container);
			setErrorMessage("Please select a carbon application project to create the CAR file from.");
			return;
		}
		
		createArtifactMetaSection(container);
		createDependencySection(container);
		updateControlData();
		validate();
		setControl(container);
	}
	
	private void createArtifactMetaSection(Composite columnComp) {
	    GridLayout layout;
	    Composite generalComposite = new Composite(columnComp,SWT.None);
	    GridData gd;
		
		layout = new GridLayout();
		layout.numColumns = 3;
		layout.verticalSpacing = 10;
		layout.horizontalSpacing = 10;
		generalComposite.setLayout(layout);
		generalComposite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL | GridData.VERTICAL_ALIGN_FILL));

		new Label(generalComposite,SWT.None).setText("Name");
		
		txtName = new Text(generalComposite,SWT.BORDER);
		txtName.setLayoutData(getGridData(2,GridData.FILL_HORIZONTAL));
		
		new Label(generalComposite,SWT.None).setText("Version");
		
		txtVersion = new Text(generalComposite,SWT.BORDER);
		txtVersion.setLayoutData(getGridData(2,GridData.FILL_HORIZONTAL));
		
//		Label lblName ; 
//		gd = new GridData(GridData.FILL_HORIZONTAL);
//		gd.horizontalSpan=3;
//		lblName = new Label(generalComposite, SWT.SEPARATOR | SWT.HORIZONTAL);
//		lblName.setLayoutData(gd);
		
//		Label deploymentModelLabel = new Label(generalComposite, SWT.NULL);
//		gd = new GridData();
//		gd.horizontalSpan = 3; 
//		deploymentModelLabel.setText("Deployment Mode");
//		deploymentModelLabel.setLayoutData(gd);
		
//		standAloneDep = new Button(generalComposite, SWT.RADIO);
//		standAloneDep.setText("Stand-Alone Deployment");
//		standAloneDep.setSelection(true);
		
		

		
		
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
		
//		standAloneDep.addSelectionListener(new SelectionListener() {
//			
//			public void widgetSelected(SelectionEvent event) {
//				boolean b = ((Button) (event.widget)).getSelection();			
//				if(b){
//					setStratosDepEnabled(false);
//				}else{
//					setStratosDepEnabled(true);
//				}
//			}
//			
//			public void widgetDefaultSelected(SelectionEvent arg0) {
//				
//			}
//		});
		

		
    }
	
	private void createDependencySection(Composite columnComp) {
	    GridLayout layout;
		
		Composite dependencyComposite = new Composite(columnComp,SWT.None);
		layout = new GridLayout();
		layout.numColumns = 3;
		layout.marginHeight = 5;
		layout.marginWidth = 10;
		layout.verticalSpacing = 5;
		layout.horizontalSpacing = 5;
		layout.makeColumnsEqualWidth=false;
		dependencyComposite.setLayout(layout);
		dependencyComposite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL | GridData.VERTICAL_ALIGN_FILL));
		
		Label label = new Label(dependencyComposite,SWT.None);
		label.setLayoutData(getGridData(3, GridData.FILL_HORIZONTAL));
		label.setText("Artifacts to include in the CAR:");
		lstViewLocalDependencies = CheckboxTableViewer.newCheckList(dependencyComposite, SWT.TOP | SWT.BORDER | SWT.V_SCROLL);
		GridData gd=getGridData(3, GridData.FILL_BOTH);
		gd.horizontalIndent=10;
		gd.verticalSpan=4;
		lstViewLocalDependencies.getControl().setLayoutData(gd);
		new Label(dependencyComposite,SWT.None);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.widthHint=80;
//		gd.horizontalAlignment=GridData.END;

		btnSelectAll = new Button(dependencyComposite, SWT.None);
		btnSelectAll.setText("Select All");
		btnSelectAll.setLayoutData(gd);
		btnDeselectAll = new Button(dependencyComposite,SWT.None);
		btnDeselectAll.setText("Deselect All");
		btnDeselectAll.setLayoutData(gd);

		setStratosDepEnabled(false);
		
		stratosDep = new Button(dependencyComposite, SWT.CHECK);
		stratosDep.setText("Allow Stratos Deployable Artifacts Only");
		
        lstViewLocalDependencies.addCheckStateListener(new ICheckStateListener() {
			public void checkStateChanged(CheckStateChangedEvent event) {
                setDependenciesChanged(true);
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
        
		stratosDep.addSelectionListener(new SelectionListener() {
			
			public void widgetSelected(SelectionEvent event) {
				boolean b = ((Button) (event.widget)).getSelection();
				if(b){
					setStratosDepEnabled(true);
				}else{
					setStratosDepEnabled(false);
				}
			}
			
			public void widgetDefaultSelected(SelectionEvent arg0) {
				
			}
		});
    }

	
	private GridData getGridData(int horizontalSpan, int style){
		GridData gd = new GridData(style);
		gd.horizontalSpan=horizontalSpan;
		return gd;
	}
	
	private void updateName() {
		setName(txtName.getText());
		validate();
    }
	
	private void setName(String text) {
		current.setName(text);
    }


	private void updateVersion(){
		setVersion(txtVersion.getText().trim());
		validate();
	}

	private void setVersion(String text) {
		current.setVersion(text);
    }
	
    public void updateControlData(){
    	txtName.setText(current.getName());
    	txtVersion.setText(current.getVersion());
		updateLocalDependencyData();
    	refreshLocalDependencyList();
    }

    private void refreshLocalDependencyList(){
    	lstViewLocalDependencies.refresh(true);
    	List<ArtifactDependency> dependencies = current.getDependencies();
    	List<String> dependencyNames=new ArrayList<String>();
    	List<Artifact> selectedArtifacts=new ArrayList<Artifact>();
    	List<Artifact> artifacts = CAppArtifactManager.getInstance().getArtifacts(getSelectedProject());
    	
    	for (ArtifactDependency artifactDependency : dependencies) {
    		if (!artifactDependency.isInclude()){
    			dependencyNames.add(artifactDependency.getName());
    			for (Artifact artifact : artifacts) {
    		        if (artifactDependency.getName().equals(artifact.getName()) && artifactDependency.getVersion().equals(artifact.getVersion())){
    		        	selectedArtifacts.add(artifact);
    		        	dependencyNames.remove(artifact.getName());
    		        }
    	        }
    			
    		}
        }

    	if (dependencyNames.size()>0) {
            setDependenciesChanged(true);
        }

    	lstViewLocalDependencies.setCheckedElements(selectedArtifacts.toArray());
    }

    private void updateLocalDependencyData(){
    	lstViewLocalDependencies.setLabelProvider(new ArtifactLabelProvider(true));
    	lstViewLocalDependencies.setContentProvider(getContentProviderForLocalDependencies());
    	lstViewLocalDependencies.setComparator(new ViewerComparator());
    	lstViewLocalDependencies.setInput(getSelectedProject());
    }
    
    protected IStructuredContentProvider getContentProviderForLocalDependencies() {
        return new ArtifactsForProjectContentProvider(original);
    }
    
	public void setDependenciesChanged(boolean dependenciesChanged) {
	    this.dependenciesChanged = dependenciesChanged;
	    validate();
	}


	public boolean isDependenciesChanged() {
	    return dependenciesChanged;
    }

	
	public boolean isPageDirty(){
		return isDependenciesChanged() || 
    		(!current.getVersion().equals(original.getVersion())) ||
    		(!current.getName().equals(original.getName()));
	}
	
	public Artifact getCurrentArtifact(){
		if (isDependenciesChanged()){
			current.getDependencies().clear();
			Object[] checkedElements = lstViewLocalDependencies.getCheckedElements();
			for (Object o : checkedElements) {
				Artifact artifact=(Artifact)o;
				ArtifactDependency artifactDependency = new ArtifactDependency(original, artifact);
				artifactDependency.setInclude(false);
				current.getDependencies().add(artifactDependency);
            }
		}
		return current;
	}
	
	public void syncOriginalToCurrent(){
		original=current.clone(original);
		setDependenciesChanged(false);
	}
	
	public boolean isDirty() {
		return isPageDirty();
	}
    
	private void validate() {
		if (lstViewLocalDependencies.getCheckedElements().length==0){
			setErrorMessage("Please tick/check atleast one artifact from the list");
			setPageComplete(false);
			return;
		}
		if((txtName.getText() == null || txtName.getText().equals("")) || 
				txtVersion.getText() == null || txtVersion.getText().equals("")){
				setErrorMessage("Please specify a name and version to to .car file.");
				setPageComplete(false);
				return;
		}
		
		if(txtName.getText() != null && !txtName.getText().equals("")){
			if(ArtifactFileUtils.IsSpecialCharactersExist(txtName.getText())){
				setErrorMessage("Could not create CAR files with special characters");
				setPageComplete(false);
				return;
			}
		}
		
		if(txtVersion.getText() != null && !txtVersion.getText().equals("")){
			String version = txtVersion.getText();
			String[] versionParts = version.split("\\.");
			if(version.endsWith(".")){
				setErrorMessage("File version cannot end with period.");
				setPageComplete(false);
				return;
			}
			
			if(versionParts.length > 4 ){
				setErrorMessage("File version should be in the standared format.");
				setPageComplete(false);
				return;
			}
			
			if(!Character.isDigit(version.charAt(0))){
				setErrorMessage("File version should start with a numeric value.");
				setPageComplete(false);
				return;
			}
			
		}
		setErrorMessage(null);
		setPageComplete(true);
    }
	
//    public boolean IsVersionFormatOK(String str){
//    	
//    	
//    	Pattern p = Pattern.compile("[^a-zA-Z0-9]");
//    	Matcher m = p.matcher(str);
//    	String test = m.replaceAll("%");
//    	if(test.contains("%")){
//    		return true;
//    	}else{
//    		return false;
//    		
//    	}
//    }
//	public String getProjectToExport() {
//		return projectToExport;
//	}
//
//	public void setProjectToExport(String projectToExport) {
//		this.projectToExport = projectToExport;
//		for(IProject project:prjctList){
//			if (project.getName().equals(projectToExport)){
//				selectedProject=project;
//			}
//		}
//	}
//
//	protected void handledeployInWorkspaceBrowseButton() {
//		String fileName=getSavePath();
//		if (fileName!=null)
//			deployInWorkspaceText.setText(fileName);		
//	}
//
//	protected void handleDeployInWorkspaceText() {
//		this.setFileLocation(deployInWorkspaceText.getText());
//		String msg=null;
//		File file = new File(getFileLocation());
//		if (!file.exists())
//			msg="Invalid path specified";
//		
//		setErrorMessage(msg);
//		setPageComplete(msg==null);
//	}
//
//	private String getSavePath(){
//		String fileName = null;
//		DirectoryDialog dlg = new DirectoryDialog(getShell());
//		//dlg.setFilterExtensions(new String[]{".zip"});
//	    boolean done = false;
//
//	    while (!done) {
//	      // Open the File Dialog
//	      fileName = dlg.open();
//	      if (fileName == null) {
//	        // User has cancelled, so quit and return
//	        done = true;
//	      } else {
//	        // User has selected a file; see if it already exists
//	        File file = new File(fileName);
//	        if (file.exists()) {
//	          // If they click Yes, we're done and we drop out. If
//	          // they click No, we redisplay the File Dialog
//	          done = true;
//	        } else {
//	          // File does not exist, so drop out
//	          done = false;
//	        }
//	      }
//	    }
//	    return fileName;
//	}
//
//	public void setFileLocation(String fileLocation) {
//		this.fileLocation = fileLocation;
//	}
//
//	public String getFileLocation() {
//		return fileLocation;
//	}
//	
//	public IProject[] getProjects(){
//		List<IProject> list=new ArrayList<IProject>();
//		IProject[] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
//		for (IProject project : projects) {
//	        try {
//	            if (project.hasNature(CAppConstants.CAPP_NATURE_ID)){
//	            	list.add(project);
//	            }
//            } catch (CoreException e) {
//	            log.error(e);
//            }
//        }
//		return list.toArray(new IProject[]{});
//	}

	public void setSelectedProject(IProject selectedProject) {
	    this.selectedProject = selectedProject;
    }

	public IProject getSelectedProject() {
	    return selectedProject;
    }
	
}
