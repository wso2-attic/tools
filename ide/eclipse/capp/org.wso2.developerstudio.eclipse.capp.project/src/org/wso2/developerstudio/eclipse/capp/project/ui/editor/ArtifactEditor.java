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

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.stream.FactoryConfigurationError;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.IWindowListener;
import org.eclipse.ui.IWorkbenchPartReference;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.part.FileEditorInput;
import org.wso2.developerstudio.eclipse.capp.core.artifacts.manager.CAppEnvironment;
import org.wso2.developerstudio.eclipse.capp.core.manifest.Artifact;
import org.wso2.developerstudio.eclipse.capp.core.manifest.ArtifactDependency;
import org.wso2.developerstudio.eclipse.capp.project.Activator;
import org.wso2.developerstudio.eclipse.capp.project.manager.CAppArtifactManager;
import org.wso2.developerstudio.eclipse.capp.project.nature.DataConstants;
import org.wso2.developerstudio.eclipse.capp.project.ui.decorator.ArtifactFolderDecorator;
import org.wso2.developerstudio.eclipse.capp.project.ui.dialog.EditorInfoSaveDialog;
import org.wso2.developerstudio.eclipse.logging.core.IDeveloperStudioLog;
import org.wso2.developerstudio.eclipse.logging.core.Logger;

public class ArtifactEditor extends FormEditor{
	private static IDeveloperStudioLog log=Logger.getLog(Activator.PLUGIN_ID);

    private boolean dirty;
	private ArtifactEditorPage artifactEditorPage;
	private Artifact artifact;
	private boolean superArtifact=false;
	
	public IFile getInputFile(){
		return ((FileEditorInput)getEditorInput().getPersistable()).getFile();
	}
	
	public ArtifactEditor() {
	}
	protected void addPages() {
	    try {
	    	artifactEditorPage = new ArtifactEditorPage(this,"org.wso2.developerstudio.capp.artifact.axis2.editor","Axis2 Editor",getArtifact());
	    	final IEditorPart editor=this;

	    	final IWindowListener windowListener = new IWindowListener(){

                public void windowActivated(IWorkbenchWindow window) {
                	if (window.getActivePage()!=null && window.getActivePage().getActiveEditor()!=null && window.getActivePage().getActiveEditor().equals(editor)){
                        try {
	                        artifactEditorPage.doFullUpdateRefresh();
                        } catch (Exception e) {
	                        log.error(e);
                        }
                	}
                }

                public void windowClosed(IWorkbenchWindow arg0) {
                	
                }

                public void windowDeactivated(IWorkbenchWindow arg0) {
	                
                }

                public void windowOpened(IWorkbenchWindow arg0) {
	                
                }
	    		
	    	};
	    	PlatformUI.getWorkbench().addWindowListener(windowListener);
	    	getSite().getPage().addPartListener(new IPartListener2() {
				public void partVisible(IWorkbenchPartReference ref) {
					refresh(editor, ref);
				}
				
				public void partOpened(IWorkbenchPartReference ref) {
					refresh(editor, ref);
				}
				
				public void partInputChanged(IWorkbenchPartReference arg0) {
				}
				
				public void partHidden(IWorkbenchPartReference arg0) {
					
				}
				
				public void partDeactivated(IWorkbenchPartReference arg0) {
				}
				
				public void partClosed(IWorkbenchPartReference ref) {
	                if (ref.getPage().getActiveEditor() == editor) {
	                	PlatformUI.getWorkbench().removeWindowListener(windowListener);
	                	getSite().getPage().removePartListener(this);
	                }
				}
				
				public void partBroughtToTop(IWorkbenchPartReference arg0) {
				}
				
				public void partActivated(IWorkbenchPartReference ref) {
					refresh(editor, ref);
				}

				private void refresh(final IEditorPart editor, IWorkbenchPartReference ref) {
	                if (ref.getPage().getActiveEditor() == editor) {
						try {
	                        artifactEditorPage.doFullUpdateRefresh();
                        } catch (Exception e) {
	                        log.error(e);
                        }
					}
                }
				
				
			});
	    	EditorResourceListener listener = new EditorResourceListener(this);
	    	ResourcesPlugin.getWorkspace().addResourceChangeListener(listener);
	        addPage(artifactEditorPage);
        } catch (PartInitException e) {
	        log.error(e);
        }
    }

    public void setEditorTitle(String title){
    	setPartName(title);
    }
    
    public void doSave(IProgressMonitor arg0) {
    	if (isDirty()){
    		if (!getArtifact().getSource().isSynchronized(IResource.DEPTH_ONE)){
    			if (!MessageDialog.openQuestion(getShell(), "Update conflict", "The file '"+getArtifact().getSource().getFullPath().toOSString()+"' has been changed in the file system. Do \n\nyou want to override the changes made on the file system?")){
    				return;
    			}
    		}
        	Artifact currentArtifact = artifactEditorPage.getCurrentArtifact();
    		if (!checkAndHandleNewServerRole(currentArtifact)) return;
	    	try {
	    		checkArtifactCyclicDependencies();
	            artifactEditorPage.syncOriginalToCurrent();
	            getArtifact().toFile();
	            artifactEditorPage.refreshUIContent();
	            updateDirtyState();
	            ArtifactFolderDecorator.refreshResources(new Object[]{getInputFile().getParent()});
            } catch (Exception e) {
            	log.error(e);
            	MessageDialog.openError(getShell(), "Error Saving", "Following error occured while attempting to save\n\n"+e.getMessage());
            }
	    }
    }

	private boolean checkAndHandleNewServerRole(Artifact currentArtifact) {
	    if (!isSuperArtifact() && !CAppArtifactManager.getInstance().isServerRolePresent(getInputFile().getProject(),currentArtifact.getServerRole())){
			if (MessageDialog.openQuestion(getShell(), "New Server Role", "The server role '"+currentArtifact.getServerRole()+"' does not exist. Do you want to create this server role?")){
				CAppArtifactManager.getInstance().addServerRole(getInputFile().getProject(), CAppEnvironment.createServerRole(currentArtifact.getServerRole()));
			}else{
				return false;
			}
		}
	    return true;
    }

	private boolean checkAndHandleReferenceChanges(Artifact currentArtifact) {
    	Map<Artifact, IFolder> artifactList = CAppArtifactManager.getInstance().getArtifactList(getInputFile().getProject());;
    	HashMap<Artifact, List<ArtifactDependency>> changedArtifacts = new HashMap<Artifact, List<ArtifactDependency>>();
		
		addReferencedArtifacts(currentArtifact, artifactList, changedArtifacts);
		addReferencedSuperArtifact(currentArtifact, changedArtifacts);

		if (changedArtifacts.size()>0){
        	EditorInfoSaveDialog dialog = new EditorInfoSaveDialog(this.getShell(), changedArtifacts);
    		dialog.setBlockOnOpen(true);
    		dialog.create();
    		dialog.getShell().setSize(600, 250);
    		int status = dialog.open();
    		if(status == EditorInfoSaveDialog.NO){
    			return false;
    		}
    		if(status == EditorInfoSaveDialog.YES){
    	    	return updateReferencedArtifacts(currentArtifact, artifactList, changedArtifacts);
    		}

    	}
	    return true;
    }

	private boolean updateReferencedArtifacts(
                                           Artifact currentArtifact,
                                           Map<Artifact, IFolder> artifactList,
                                           HashMap<Artifact, List<ArtifactDependency>> changedArtifacts) {
	    try {
	    	for (Artifact artifact : changedArtifacts.keySet()) {
	    		List<ArtifactDependency> changedDeps = changedArtifacts.get(artifact);
	        	for (ArtifactDependency dependency : changedDeps) {
	    			dependency.setName(currentArtifact.getName());
	    			dependency.setVersion(currentArtifact.getVersion());
	        		if(artifact.getType().equals("carbon/application")){
	        			dependency.setServerRole(currentArtifact.getServerRole());
	        		}
	    		}
	        	if(!artifactList.isEmpty() && artifactList.size()!=0){
	        		IFile artifactFile = null;
	        		if(artifact.isSuperArtifact()){
	        			artifactFile = CAppArtifactManager.getInstance().getSuperArtifactFile(getInputFile().getProject());
	        		}else{
	        			artifactFile = CAppArtifactManager.getInstance().getArtifactFile(artifactList.get(artifact));
	        		}
	        		artifact.toFile(artifactFile);
	        	}
	    	}
	    	return true;
	    } catch (Exception e) {
	        log.error(e);
	        return false;
	    }
    }

	private void addReferencedSuperArtifact(
                                           Artifact currentArtifact,
                                           HashMap<Artifact, List<ArtifactDependency>> changedArtifacts) {
	    if(isSuperArtifactReferenceDataChanged(currentArtifact)){
	    	try {
	    		List<ArtifactDependency> superArtfDependencies = CAppArtifactManager.getInstance().getSuperArtifact(getInputFile().getProject()).getDependencies();
	    		List<ArtifactDependency> changedSuperArtifactDeps = new ArrayList<ArtifactDependency>();
	    		for (ArtifactDependency artifactDependency : superArtfDependencies) {
	    			if(!artifactDependency.isInclude()){
	    				if(artifactDependency.getName().equals(getArtifact().getName()) && 
	    				   artifactDependency.getVersion().equals(getArtifact().getVersion())){
	    						if(!changedSuperArtifactDeps.contains(artifactDependency)){
	    							changedSuperArtifactDeps.add(artifactDependency);
	    						}
	    						break;
	    				}
	    				
	    			}
	    		}
	    		if(!changedSuperArtifactDeps.isEmpty() && changedSuperArtifactDeps.size() != 0){
	    			changedArtifacts.put(CAppArtifactManager.getInstance().getSuperArtifact(getInputFile().getProject()), changedSuperArtifactDeps);
	    		}
	    		
	    	} catch (CoreException e1) {
	    		e1.printStackTrace();
	    	} catch (IOException e1) {
	    		e1.printStackTrace();
	    	}
		}
    }

	private void addReferencedArtifacts(Artifact currentArtifact,
                                        Map<Artifact, IFolder> artifactList,
                                        HashMap<Artifact, List<ArtifactDependency>> changedArtifacts) {
	    if(isArtifactReferenceDataChanged(currentArtifact)){
    		for (Artifact artifact : artifactList.keySet()) {
        		if (artifact!=getArtifact()){
    		    	List<ArtifactDependency> dependencies = artifact.getDependencies();
    		    	List<ArtifactDependency> changedDependencies = new ArrayList<ArtifactDependency>();
    		    	for (ArtifactDependency dependency : dependencies) {
    					if (!dependency.isInclude()){
    						if(dependency.getName().equals(getArtifact().getName()) && dependency.getVersion().equals(getArtifact().getVersion())){
    							if(!changedDependencies.contains(dependency)){
    								changedDependencies.add(dependency);
    							}
    							break;
    						}
    						
    					}
    				}
    		    	if(!changedDependencies.isEmpty() && changedDependencies.size() != 0){
    		    		changedArtifacts.put(artifact, changedDependencies);
    		    	}
    	    	}
    		}
		}
    }

	private boolean isSuperArtifactReferenceDataChanged(Artifact currentArtifact) {
	    boolean b = isArtifactReferenceDataChanged(currentArtifact) || (getArtifact().getServerRole()!=null && !getArtifact().getServerRole().equals(currentArtifact.getServerRole()));
	    return b;
    }

	private boolean isArtifactReferenceDataChanged(Artifact currentArtifact) {
	    boolean b = !getArtifact().getName().equals(currentArtifact.getName()) || !getArtifact().getVersion().equals(currentArtifact.getVersion());
	    return b;
    }

    private Shell getShell() {
	    return getSite().getShell();
    }

	public void doSaveAs() {
	    
    }

    public boolean isSaveAsAllowed() {
	    return false;
    }
    
	protected void createPages() {
		super.createPages();
		
		if (getPageCount() == 1 && (getContainer() instanceof CTabFolder)) {
	        ((CTabFolder)getContainer()).setTabHeight(0);
	        Point point = getContainer().getSize();
	        getContainer().setSize(point.x, point.y + 6);
		}
	}

	public void updateDirtyState() {
		dirty = artifactEditorPage.isDirty();
		firePropertyChange(PROP_DIRTY);
		editorDirtyStateChanged();	    
    }
	
	public boolean isDirty() {
		return dirty;
	}

	public void setArtifact(Artifact artifact) {
	    this.artifact = artifact;
    }

	public Artifact getArtifact() {
		if (artifact==null){
			if (getEditorInput().getPersistable() instanceof FileEditorInput){
				FileEditorInput fei=(FileEditorInput)getEditorInput().getPersistable();
				try {
	                artifact=CAppArtifactManager.getInstance().getArtifact(fei.getFile());
                } catch (FactoryConfigurationError e) {
	                log.error(e);
                } catch (CoreException e) {
	                log.error(e);
                } catch (IOException e) {
	                log.error(e);
                }
			}
		}
		setSuperArtifact(DataConstants.SUPER_ARTIFACT_TYPE.equalsIgnoreCase(artifact.getType()));
	    return artifact;
    }

	public void setSuperArtifact(boolean superArtifact) {
	    this.superArtifact = superArtifact;
    }

	public boolean isSuperArtifact() {
	    return superArtifact;
    }	
	
	class EditorResourceListener implements IResourceChangeListener{

    	public IEditorPart editor;
    
    	public EditorResourceListener(IEditorPart e) {
    		editor = e;
    	}
    
    	public void resourceChanged(IResourceChangeEvent event) {
        	IFile file = ((FileEditorInput)editor.getEditorInput()).getFile();
        	if ((event.getType() == IResourceChangeEvent.POST_CHANGE || event.getType() == IResourceChangeEvent.PRE_CLOSE)) {
        		if (!file.exists()) closeEditor();
        	}
    	}
    
    	private void closeEditor() {
    		Display.getDefault().syncExec(new Runnable() {
            	public void run() {
            		editor.getSite().getPage().closeEditor(editor, false);
            	}
        	});
        	ResourcesPlugin.getWorkspace().removeResourceChangeListener(this); 
    	}
	}
	
	private void checkArtifactCyclicDependencies() throws Exception{
		List<ArtifactDependency> dependencies = getArtifact().getDependencies();
		for (ArtifactDependency dependency : dependencies) {
			if (isCyclicDependency(dependency)){
				throw new Exception("A cyclic dependency found to the artifact '"+getArtifact().getCaption()+"' starting from artifact '"+dependency.getConnectingArtifact().getCaption()+"'");
			}
        }
	}
	
	private boolean isCyclicDependency(ArtifactDependency dependency){
		if (dependency.isInclude()) return false;
		if (dependency.getConnectingArtifact()==getArtifact()){
			return true;
		}else{
			if (dependency.getConnectingArtifact()!=null){
    			List<ArtifactDependency> dependencies = dependency.getConnectingArtifact().getDependencies();
    			for (ArtifactDependency artifactDependency : dependencies) {
    				if (isCyclicDependency(artifactDependency)){
    					return true;
    				}
                }
			}
			return false;
		}
	}
}
