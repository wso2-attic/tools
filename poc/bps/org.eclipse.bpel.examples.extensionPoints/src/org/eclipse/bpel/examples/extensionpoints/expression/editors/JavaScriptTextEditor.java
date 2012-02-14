/*******************************************************************************
 * Copyright (c) 2006 Oracle Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Oracle Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.bpel.examples.extensionpoints.expression.editors;

import org.eclipse.jface.text.IDocument;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.texteditor.ITextEditorActionConstants;

/**
 * @author Michal Chmielewski (michal.chmielewski@oracle.com)
 * @date Jul 17, 2007
 *
 */
@SuppressWarnings("nls")
public class JavaScriptTextEditor extends org.eclipse.wst.javascript.ui.internal.editor.JSEditor {
	
	/** The Editor ID */
	public static final String TEXT_EDITOR_ID = "org.eclipse.bpel.examples.extensionPoints.javaScriptEditor";

	/**
	 * 
	 */
	public JavaScriptTextEditor() {
		super();
		setDocumentProvider(new TextDocumentProvider());
		
	}

	/**
	 * Remove unnecessary actions.
	 */
	@Override
	protected void createActions() {
		super.createActions();
		setAction(ITextEditorActionConstants.PRINT, null);
		setAction(ITextEditorActionConstants.SAVE, null);
		setAction(ITextEditorActionConstants.REVERT_TO_SAVED, null);
	}

	/**
	 * Returns the current contents of this editor.
	 * @return the contents of the editor
	 */
	
	public String getContents() {
		IEditorInput input = getEditorInput();
		IDocument doc = getDocumentProvider().getDocument(input);
		return doc.get();
	}

	/**
	 * Removes the dirty state.
	 */
	public void markAsClean() {
		// this is almost a no-op
		doSave(null);
	}
	
}
