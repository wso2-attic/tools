/*
 * Copyright (c) 2011, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
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

package org.wso2.carbonstudio.eclipse.distribution.project.editor;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.editor.IFormPage;
import org.eclipse.ui.texteditor.IDocumentProvider;
import org.eclipse.wst.sse.ui.StructuredTextEditor;
import org.eclipse.jface.text.DocumentEvent;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IDocumentListener;
import org.eclipse.ui.part.FileEditorInput;

public class DistProjectEditor extends FormEditor {
 private DistProjectEditorPage distProjectEditorPage;
 private StructuredTextEditor sourceEditor;
 private boolean dirty;
 private boolean sourceDirty;
 private int formEditorIndex;
 private int sourceEditorIndex;

 	
	protected void addPages() {
		distProjectEditorPage = new DistProjectEditorPage(
				this,
				"org.wso2.carbonstudio.eclipse.distribution.project.editor.design",
				"Design");
		sourceEditor = new StructuredTextEditor();
		sourceEditor.setEditorPart(this);
		
		try {
			distProjectEditorPage.initContent();
			formEditorIndex = addPage(distProjectEditorPage);
			sourceEditorIndex = addPage(sourceEditor,getEditorInput());
			setPageText(sourceEditorIndex, "Source");
			
			getDocument().addDocumentListener(new IDocumentListener() {  
				    
	            public void documentAboutToBeChanged(final DocumentEvent event) {  
	                // nothing to do  
	            }  
	   
	            public void documentChanged(final DocumentEvent event) {  
	                sourceDirty = true; 
	                updateDirtyState();
	            }  
	        });  

		} catch (PartInitException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public void doSave(IProgressMonitor pm) {
		if(dirty){
			try {
				updateSourceFromDesign();
				sourceDirty = false;
				dirty = false;
				updateDirtyState();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (sourceDirty){
			sourceDirty = false;
			dirty = false;
			updateDesignFromSource();
			updateDirtyState();
		}
	}

	private IDocument getDocument() {
		final IDocumentProvider provider = sourceEditor.getDocumentProvider();
		return provider.getDocument(getEditorInput());
	}
	

	protected void pageChange(int newPageIndex) {
		if ((newPageIndex == sourceEditorIndex) && (dirty)){
			sourceDirty = false;
			dirty = false;
			updateSourceFromDesign();
			updateDirtyState();
		} else if ((newPageIndex == formEditorIndex) && (sourceDirty)){
			sourceDirty = false;
			dirty = false;
			updateDesignFromSource();
			updateDirtyState();
		}
			
		super.pageChange(newPageIndex);
		
		final IFormPage page = getActivePageInstance();
		if (page != null) {
			page.setFocus();
		}
	}
	
	private void updateSourceFromDesign() {
		String content;
		try {
			distProjectEditorPage.savePOM();
			content = new Scanner(getFile().getContents()).useDelimiter("\\A").next();
			getDocument().set(content);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void updateDesignFromSource()  {
		try {
			InputStream content = new ByteArrayInputStream(getDocument().get().getBytes());
			getFile().setContents(content, true, true, null);
			distProjectEditorPage.refreshForm();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private IFile getFile() {
		final IEditorInput input = getEditorInput();
		if (input instanceof FileEditorInput)
			return ((FileEditorInput) input).getFile();
		return null;
	}

	public StructuredTextEditor getSourceEditor() {
		return sourceEditor;
	}
	
	public void doSaveAs() {
		// nothing to do 
	}

	public void updateDirtyState() {
		dirty = distProjectEditorPage.isDirty();
		firePropertyChange(PROP_DIRTY);
		editorDirtyStateChanged();	    
    }
	
	public boolean isDirty() {
		return (dirty || sourceDirty);
	}
	
	public boolean isSaveAsAllowed() {
		return false;
	}
	
	
}
