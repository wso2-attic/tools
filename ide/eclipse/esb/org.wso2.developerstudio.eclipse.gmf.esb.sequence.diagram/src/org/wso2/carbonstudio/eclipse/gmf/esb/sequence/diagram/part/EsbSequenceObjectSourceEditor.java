package org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.part;

import org.eclipse.core.resources.IFile;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.wst.sse.ui.StructuredTextEditor;

public class EsbSequenceObjectSourceEditor {

	private StructuredTextEditor editor;
	private IEditorInput input;

	public EsbSequenceObjectSourceEditor(IFile dummyFile) {
		this.editor = new StructuredTextEditor();
		this.input = new FileEditorInput(dummyFile);
	}

	/**
	 * @return internal {@link IEditorPart} instance.
	 */
	public IEditorPart getEditor() {
		return editor;
	}
	
	/**
	 * @return internal {@link IEditorInput} instance.
	 */
	public IEditorInput getInput() {
		return input;
	}
}
