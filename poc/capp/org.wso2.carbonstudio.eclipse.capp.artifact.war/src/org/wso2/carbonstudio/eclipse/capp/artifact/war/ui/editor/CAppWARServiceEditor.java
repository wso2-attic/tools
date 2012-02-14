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
import java.io.ByteArrayInputStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.part.FileEditorInput;
import org.wso2.carbonstudio.eclipse.capp.artifact.war.Activator;
import org.wso2.carbonstudio.eclipse.capp.artifact.war.core.WARArtifactHandler;
import org.wso2.carbonstudio.eclipse.capp.artifact.war.model.WARSourceDescriptor;
import org.wso2.carbonstudio.eclipse.capp.artifact.war.utils.WARServiceSourceDescriptorUtils;
import org.wso2.carbonstudio.eclipse.capp.core.artifacts.manager.CAppEnvironment;
import org.wso2.carbonstudio.eclipse.logging.core.ICarbonStudioLog;
import org.wso2.carbonstudio.eclipse.logging.core.Logger;

public class CAppWARServiceEditor extends FormEditor{
	private static ICarbonStudioLog log=Logger.getLog(Activator.PLUGIN_ID);

    private boolean dirty;
	private CAppWARServiceEditorPage cAppAxis2ServiceEditorPage;

	protected void addPages() {
	    try {
	    	cAppAxis2ServiceEditorPage = new CAppWARServiceEditorPage(this,"org.wso2.carbonstudio.capp.artifact.axis2.editor","Axis2 Editor");
	        addPage(cAppAxis2ServiceEditorPage);
        } catch (PartInitException e) {
	        log.error(e);
        }
    }

    public void setEditorTitle(String title){
    	setPartName(title);
    }
    
    public void doSave(IProgressMonitor arg0) {
	    if (isDirty()){
	    	WARSourceDescriptor currentAxis2SourceDescriptor = cAppAxis2ServiceEditorPage.getCurrentAxis2SourceDescriptor();
	    	try {
	    		IFile file = ((FileEditorInput)this.getEditorInput().getPersistable()).getFile();
	    		ByteArrayInputStream editorInputData = new ByteArrayInputStream(WARServiceSourceDescriptorUtils.saveAxis2SourceDescriptor(currentAxis2SourceDescriptor));
				file.setContents(editorInputData, IFile.FORCE, null);
				cAppAxis2ServiceEditorPage.syncOriginalToCurrent();
				cAppAxis2ServiceEditorPage.refreshUIContent();
				updateDirtyState();
            } catch (CoreException e) {
	            log.error(e);
	            MessageDialog.openError(getShell(), "Error saving...", e.getMessage());
            }
	    	
	    }
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
		dirty = cAppAxis2ServiceEditorPage.isDirty();
		firePropertyChange(PROP_DIRTY);
		editorDirtyStateChanged();	    
    }
	
	public boolean isDirty() {
		return dirty;
	}	
}
