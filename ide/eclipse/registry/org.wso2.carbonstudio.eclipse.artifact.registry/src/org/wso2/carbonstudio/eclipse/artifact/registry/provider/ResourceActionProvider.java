/*
 * Copyright (c) 2012, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
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

package org.wso2.carbonstudio.eclipse.artifact.registry.provider;

import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuCreator;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.swt.events.HelpListener;
import org.eclipse.swt.widgets.Event;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.navigator.CommonActionProvider;
import static org.eclipse.ui.navigator.ICommonActionConstants.*;
import org.eclipse.ui.navigator.ICommonActionExtensionSite;
import org.wso2.carbonstudio.eclipse.artifact.registry.Activator;
import org.wso2.carbonstudio.eclipse.artifact.registry.provider.NavigatorNode;
import org.wso2.carbonstudio.eclipse.general.project.artifact.bean.RegistryElement;
import org.wso2.carbonstudio.eclipse.general.project.artifact.bean.RegistryItem;
import org.wso2.carbonstudio.eclipse.logging.core.ICarbonStudioLog;
import org.wso2.carbonstudio.eclipse.logging.core.Logger;

public class ResourceActionProvider extends CommonActionProvider implements IAction, ISelectionChangedListener{
	
	private static ICarbonStudioLog log=Logger.getLog(Activator.PLUGIN_ID);
	
	private NavigatorNode navigatorNode;
	
	@Override
	public void init(ICommonActionExtensionSite site) {
	super.init(site);
	site.getStructuredViewer().addSelectionChangedListener(this);
	}

	@Override
	public void fillActionBars(IActionBars actionBars) {
	super.fillActionBars(actionBars);
	actionBars.setGlobalActionHandler(OPEN,this);
	}

	@Override
    public void addPropertyChangeListener(IPropertyChangeListener iPropertyChangeListener) {
	    
    }

	@Override
    public int getAccelerator() {
	    return 0;
    }

	@Override
    public String getActionDefinitionId() {
	    return null;
    }

	@Override
    public String getDescription() {
	    return null;
    }

	@Override
    public ImageDescriptor getDisabledImageDescriptor() {
	    return null;
    }

	@Override
    public HelpListener getHelpListener() {
	    return null;
    }

	@Override
    public ImageDescriptor getHoverImageDescriptor() {
	    return null;
    }

	@Override
    public String getId() {
	    return null;
    }

	@Override
    public ImageDescriptor getImageDescriptor() {
	    return null;
    }

	@Override
    public IMenuCreator getMenuCreator() {
	    return null;
    }

	@Override
    public int getStyle() {
	    return 0;
    }

	@Override
    public String getText() {
	    return null;
    }

	@Override
    public String getToolTipText() {
	    return null;
    }

	@Override
    public boolean isChecked() {
	    return false;
    }

	@Override
    public boolean isEnabled() {
	    return false;
    }

	@Override
    public boolean isHandled() {
	    return false;
    }

	@Override
    public void removePropertyChangeListener(IPropertyChangeListener iPropertyChangeListener) {
	    
    }

	@Override
    public void run() {
		try {
	        if(navigatorNode!=null){
	        	RegistryElement node = navigatorNode.getData();
	        	if(node!=null && node instanceof RegistryItem){
	        		/* TODO:for registry collection see @NavigatorNode.java, getChildren()  */
		        		IProject project = navigatorNode.getProject();
		        		if(project !=null && project.isOpen()){
		        			String filePath = ((RegistryItem)node).getFile();
		        			if (!(null== filePath || filePath.trim().isEmpty())) {
	                            IFile file = project.getFile(filePath);
	                            if (file.exists()) {
	                            	if (file.getFileExtension()!=null && !file.getFileExtension().equals("dump")){
	                            		IDE.openEditor(PlatformUI.getWorkbench().getActiveWorkbenchWindow()
                                                .getActivePage(), file);
	                            	}
	                            } else {
		                            throw new IOException("Cannot find file " +
		                                                  file.getLocation().toFile());
	                            }                            
                            } else{
                            	throw new IOException("file path is empty");
                            }
		        		}
	        	}
	        	
	        }
        } catch (Exception e) {
        	log.warn("Cannot open file with default editor: ", e);
        }    
    }

	@Override
    public void runWithEvent(Event evt) {
	    
    }

	@Override
    public void setAccelerator(int id) {
	    
    }

	@Override
    public void setActionDefinitionId(String id) {
	    
    }

	@Override
    public void setChecked(boolean checked) {
	    
    }

	@Override
    public void setDescription(String description) {
	    
    }

	@Override
    public void setDisabledImageDescriptor(ImageDescriptor imageDescriptor) {
	    
    }

	@Override
    public void setEnabled(boolean enabled) {
	    
    }

	@Override
    public void setHelpListener(HelpListener helpListener) {
	    
    }

	@Override
    public void setHoverImageDescriptor(ImageDescriptor imageDescriptor) {
	    
    }

	@Override
    public void setId(String id) {

	    
    }

	@Override
    public void setImageDescriptor(ImageDescriptor imageDescriptor) {
	    
    }

	@Override
    public void setMenuCreator(IMenuCreator menuCreator) {
	    
    }

	@Override
    public void setText(String text) {
	    
    }

	@Override
    public void setToolTipText(String text) {
	    
    }

	@Override
	public void selectionChanged(SelectionChangedEvent evt) {
		ISelection selection = evt.getSelection();
		if (selection != null && selection instanceof TreeSelection) {
			TreeSelection treeSelection = (TreeSelection) selection;
			Object item = treeSelection.getFirstElement();
			if (item instanceof NavigatorNode) {
				navigatorNode = (NavigatorNode) item;
			}
		}
	}


}
