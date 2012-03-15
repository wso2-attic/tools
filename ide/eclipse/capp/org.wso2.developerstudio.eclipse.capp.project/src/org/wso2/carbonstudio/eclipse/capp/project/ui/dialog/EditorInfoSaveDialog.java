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

package org.wso2.carbonstudio.eclipse.capp.project.ui.dialog;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.wso2.carbonstudio.eclipse.capp.core.artifacts.ICAppArtifactHandler;
import org.wso2.carbonstudio.eclipse.capp.core.manifest.Artifact;
import org.wso2.carbonstudio.eclipse.capp.core.manifest.ArtifactDependency;
import org.wso2.carbonstudio.eclipse.capp.project.manager.CAppArtifactManager;
import org.wso2.carbonstudio.eclipse.capp.project.utils.CAppImageUtils;

public class EditorInfoSaveDialog extends Dialog {
	
	private HashMap<Artifact, java.util.List<ArtifactDependency>> changedDependencyMap;
	private TableViewer list;
	private boolean changed=false;

	public boolean isChanged() {
		return changed;
	}

	public void setChanged(boolean changed) {
		this.changed = changed;
	}

	public EditorInfoSaveDialog(Shell parentShell, HashMap<Artifact, java.util.List<ArtifactDependency>> map) {
		super(parentShell);
		this.changedDependencyMap = map;
	}

	/**
	 * create dialog area
	 * method inherited by Dialog super class
	 */
	protected Control createDialogArea(final Composite parent) {
		Composite container = (Composite) super.createDialogArea(parent);
		GridLayout layout = new GridLayout();
		layout.numColumns = 1;
		container.setLayout(layout);
		
		GridData gd = new GridData();
		
		Label changedItems = new Label(container, SWT.NULL);
		changedItems.setText("Following Artifacts have been affected.. ");
		changedItems.setData(gd);
		
		list = new TableViewer(container, SWT.BORDER | SWT.MULTI | SWT.V_SCROLL | SWT.H_SCROLL);
		gd = new GridData(GridData.FILL_BOTH);
		list.getTable().setLayoutData(gd);
		
		gd = new GridData();
		
		Label question = new Label(container, SWT.NULL);
		question.setText("Do you want to update these artifacts?");
		question.setData(gd);

		if(!changedDependencyMap.isEmpty() && changedDependencyMap.size() != 0){
			setChanged(true);
		}
		list.setContentProvider(new ITreeContentProvider(){
            @SuppressWarnings("unchecked")
            public Object[] getChildren(Object obj) {
            	if (obj instanceof Map){
            		Map<Object,Object> map=(Map<Object,Object>)obj;
            		return new ArrayList<Object>(map.keySet()).toArray();
            	}
	            return new Object[]{};
            }

            public Object getParent(Object arg0) {
	            return null;
            }

            @SuppressWarnings("unchecked")
            public boolean hasChildren(Object obj) {
	            return (obj instanceof Map);
            }

            public Object[] getElements(Object obj) {
	            return getChildren(obj);
            }

            public void dispose() {
            }

            public void inputChanged(Viewer arg0, Object arg1, Object arg2) {
            }
		});
		
		list.setLabelProvider(new ILabelProvider(){
            public Image getImage(Object obj) {
            	if (obj instanceof Artifact){
            		ICAppArtifactHandler handler=CAppArtifactManager.getInstance().getArtifactHandler((Artifact)obj);
            		if (handler==null){
            			if (((Artifact)obj).getType().equals("carbon/application"))
            				return CAppImageUtils.getInstance().getImageDescriptor("artifact-super.png").createImage();
            			else
            				return CAppImageUtils.getInstance().getImageDescriptor("artifact.png").createImage();
            		}else{
            			return handler.getArtifactIcon().createImage();
            		}
            	}
	            return null;
            }

            public String getText(Object obj) {
            	if (obj instanceof Artifact){
            		return ((Artifact)obj).getCaption();
            	}
	            return obj.toString();
            }

            public void addListener(ILabelProviderListener arg0) {
	            
            }

            public void dispose() {
	            
            }

            public boolean isLabelProperty(Object arg0, String arg1) {
	            return false;
            }

            public void removeListener(ILabelProviderListener arg0) {
	            
            }
			
		});
		list.setInput(changedDependencyMap);
		return super.createDialogArea(parent);
	}
	
	/**
	 * create buttons for the dialog
	 */
	protected void createButtonsForButtonBar(Composite parent) {
//		Button cancelButton = createButton(parent, CANCEL, "Cancel", false);
		Button noButton = createButton(parent, NO, "No", false);
		Button yesButton = createButton(parent, YES, "Yes", true);
//		cancelButton.addSelectionListener(new SelectionAdapter(){
//			public void widgetSelected(SelectionEvent e) {
//			    cancelPressed();
//			}
//		});
		noButton.addSelectionListener(new SelectionAdapter(){
			public void widgetSelected(SelectionEvent e) {
			    noPressed();
			}
		});
		yesButton.addSelectionListener(new SelectionAdapter(){
			public void widgetSelected(SelectionEvent e) {
			    yesPressed();
			}
		});
	}
	
    protected void cancelPressed() {
		setReturnCode(CANCEL);
		close();
    }
    protected void noPressed() {
		setReturnCode(NO);
		close();
    }
    protected void yesPressed() {
		setReturnCode(YES);
		close();
    }
    public static final int YES=1;
	public static final int NO=2;
	public static final int CANCEL=3;
}