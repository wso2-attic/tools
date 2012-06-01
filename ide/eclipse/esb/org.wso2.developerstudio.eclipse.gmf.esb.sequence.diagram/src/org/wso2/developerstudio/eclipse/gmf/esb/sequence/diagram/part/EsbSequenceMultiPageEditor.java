package org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.part;

import java.io.ByteArrayInputStream;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.ide.FileStoreEditorInput;
import org.eclipse.ui.ide.IGotoMarker;
import org.eclipse.ui.part.MultiPageEditorPart;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbLink;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbSequence;
import org.wso2.developerstudio.eclipse.gmf.esb.Mediator;
import org.wso2.developerstudio.eclipse.gmf.esb.Sequence;
import org.wso2.developerstudio.eclipse.gmf.esb.SequenceDiagram;
import org.wso2.developerstudio.eclipse.gmf.esb.impl.SequenceDiagramImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.persistence.SequenceInfo;

public class EsbSequenceMultiPageEditor extends MultiPageEditorPart implements
		IGotoMarker {
	/**
	 * Design view page index.
	 */
	private static final int DESIGN_VIEW_PAGE_INDEX = 0;

	/**
	 * Source view page index.
	 */
	private static final int SOURCE_VIEW_PAGE_INDEX = 1;

	public static EsbDiagramEditor sequenceGraphicalEditor;
	
	private EsbDiagramEditor graphicalEditor;
	
	public static EsbLink incomingLink;

	/**
	 * Name of the directory which holds temporary files.
	 */
	public static final String TEMPORARY_RESOURCES_DIRECTORY = ".org.wso2.developerstudio.eclipse.esb_sequence";

	/**
	 * Used to hold temporary files.
	 */
	private Set<IFile> tempFiles = new HashSet<IFile>();

	private EsbSequenceObjectSourceEditor sourceEditor;
	

	
	public void gotoMarker(IMarker arg0) {
		// TODO Auto-generated method stub

	}

	protected void createPages() {
		createPage0();
		createPage1();

	}

	
	public void doSave(IProgressMonitor monitor) {
		getEditor(0).doSave(monitor);	
	}

	
	public void doSaveAs() {
		// TODO Auto-generated method stub
	    IEditorPart editor = getEditor(0);
        editor.doSaveAs();
        setPageText(0, editor.getTitle());
        setInput(editor.getEditorInput());

	}
	
	  public void init(IEditorSite site, IEditorInput editorInput)
      throws PartInitException {
		  super.init(site, editorInput);
		  setTitle(editorInput.getName());
	  }

	
	public boolean isSaveAsAllowed() {
		// TODO Auto-generated method stub
		return true;
	}

	private void createPage0() {
		try {
			graphicalEditor = new EsbDiagramEditor();
			addPage(DESIGN_VIEW_PAGE_INDEX, graphicalEditor, getEditorInput());
			setPageText(DESIGN_VIEW_PAGE_INDEX, "Design"); //$NON-NLS-1$
			sequenceGraphicalEditor=graphicalEditor;
		} catch (PartInitException e) {
			ErrorDialog.openError(getSite().getShell(),
					"ErrorCreatingNestedEditor", null, e.getStatus());
		}
	}

	private void createPage1() {
		try {
			sourceEditor = new EsbSequenceObjectSourceEditor(
					getTemporaryFile("xml"));
			addPage(SOURCE_VIEW_PAGE_INDEX, sourceEditor.getEditor(),
					sourceEditor.getInput());
			setPageText(SOURCE_VIEW_PAGE_INDEX, "Source");

			// Initialize source editor.
			// updateSourceEditor();
		} catch (Exception ex) {
			// TODO: Get rid of this
			ex.printStackTrace();
			// log.error(
			// "Error while initializing source viewer control.",
			// ex);
		}
	}

	private IFile getTemporaryFile(String extension) throws Exception {
		String fileName = String.format("%s.%s", UUID.randomUUID().toString(),
				extension);
		IFile tempFile = getTemporaryDirectory().getFile(fileName);
		if (!tempFile.exists()) {
			tempFile.create(new ByteArrayInputStream(new byte[0]), true, null);
		}
		tempFiles.add(tempFile);
		return tempFile;
	}

	private IFolder getTemporaryDirectory() throws Exception {
		IEditorInput editorInput = getEditorInput();
		if (editorInput instanceof IFileEditorInput
				|| editorInput instanceof FileStoreEditorInput) {

			IProject tempProject = ResourcesPlugin.getWorkspace().getRoot()
					.getProject(".tmp");

			if (!tempProject.exists()) {
				tempProject.create(new NullProgressMonitor());
			}

			if (!tempProject.isOpen()) {
				tempProject.open(new NullProgressMonitor());
			}

			if (!tempProject.isHidden()) {
				tempProject.setHidden(true);
			}

			IFolder folder = tempProject
					.getFolder(TEMPORARY_RESOURCES_DIRECTORY);

			if (!folder.exists()) {
				folder.create(true, true, new NullProgressMonitor());
			}

			return folder;
		} else {
			throw new Exception(
					"Unable to create temporary resources directory.");
		}
	}

/*	private void refreshEsbDiagram(){
		SequenceDiagram s=(SequenceDiagram)graphicalEditor.getDiagram().getElement();
		if(s.getSequence().getInput().getOutgoingLink()!=null){
			 incomingLink=s.getSequence().getInput().getOutgoingLink();
			 SequenceInfo.sequenceMap.put(graphicalEditor.getPartName(), incomingLink);
			 String[] nameWithoutExt=graphicalEditor.getTitle().split(".sequence_diagram");
			 String[] nameTemp=nameWithoutExt[0].split("sequence_");
			 String name=nameTemp[1].trim();
			 SequenceInfo.sequenceMap.put(name, incomingLink);		
			//Mediator mediator= (Mediator) s.getSequence().getInput().getOutgoingLink().getTarget().eContainer();
			//org.apache.synapse.mediators.base.SequenceMediator sequence=new SequenceMediator();			 
		}
	}*/
	
}
