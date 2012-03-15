package org.wso2.carbonstudio.eclipse.ds.presentation.source;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.jface.text.DocumentEvent;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IDocumentListener;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.editors.text.TextEditor;
import org.eclipse.ui.texteditor.IDocumentProvider;
import org.eclipse.wst.sse.core.StructuredModelManager;
import org.eclipse.wst.sse.core.internal.provisional.IModelStateListener;
import org.eclipse.wst.sse.core.internal.provisional.IStructuredModel;
import org.eclipse.wst.sse.core.internal.provisional.text.IStructuredDocument;
import org.eclipse.wst.sse.ui.StructuredTextEditor;
import org.wso2.carbonstudio.eclipse.ds.DsPackage;
import org.wso2.carbonstudio.eclipse.ds.dbseditor.DsSourceEditor;
import org.wso2.carbonstudio.eclipse.ds.presentation.DsEditor;
import org.wso2.carbonstudio.eclipse.ds.util.DsResourceFactoryImpl;
import org.wso2.carbonstudio.eclipse.utils.data.ITemporaryFileTag;
import org.wso2.carbonstudio.eclipse.utils.file.FileUtils;



/**
 * This provides the wrapper for org.eclipse.wst.sse.ui.StructuredTextEditor
 * to use in the DsEditor Form Editor.
 * 
 *
 */

@SuppressWarnings("restriction")
public class DsObjectSourceEditor{
	
	private static final String MESSAGE = "source_not_found";
	DsSourceEditor sourceView;
	IEditorInput editorInput;
	AdapterFactoryEditingDomain domain;
	DsEditor dseditor;
	private IDocumentListener listner;
	private Resource resource;
	private File tempDirectory;
	private File tempfile;
	private boolean tmpFileHasContent;
	private boolean modelChanged;
    private IStructuredModel model;
    private ITemporaryFileTag tempTag;
    
	public DsObjectSourceEditor(DsEditor editor,AdapterFactoryEditingDomain domain) throws Exception{
		this.dseditor = editor;
		this.domain = domain;
		this.editorInput = editor.getEditorInput();
		this.sourceView = new DsSourceEditor();
        this.tempfile = getTemporaryFile();
        this.listner = new IDocumentListener() {
			
			@Override
			public void documentChanged(DocumentEvent event) {
				
				if(!(dseditor.getActivePage() == DsEditor.getDesignViewIndex())){
				dseditor.setSourceModified(true);
				dseditor.fireTextPropertyChange();
				}
				setModelChanged(true);
            	handleSourceEditedEvent(false);
			}
			
			@Override
			public void documentAboutToBeChanged(DocumentEvent event) {
				//do nothing
				
			}
		};
		
	}
	
	public void init(){
		
		handleSourceEditedEvent(true);
		IDocumentProvider dp = sourceView.getDocumentProvider(); 
		IDocument doc = dp.getDocument(sourceView.getEditorInput()); 
		doc.addDocumentListener(listner); 
		
	}
	
	
	private IStructuredModel getStructuredModel() {
		IDocument document = getDocument();
		IStructuredModel model = StructuredModelManager.getModelManager().getExistingModelForEdit(document);					
		if (null == model && (document instanceof IStructuredDocument)) {
			model = StructuredModelManager.getModelManager().getModelForEdit((IStructuredDocument) document);
		}
		return model;
	}

	private IDocument getDocument() {
		return sourceView.getDocumentProvider().getDocument(sourceView.getEditorInput());
	}
	
	
	private void handleSourceEditedEvent(boolean isDummyFire) {
		
		if(tempfile != null){
			
			updateXml(isDummyFire);
		}
	
	}
	
	private void updateXml(boolean isDummyFire){
		
		String newSource = getSource();
		if(newSource != null && !newSource.equals("") && !newSource.equals(MESSAGE)){
		try {
			
			BufferedWriter  writer = new BufferedWriter(new FileWriter(tempfile));  		 
			// XML to the file
			writer.write(newSource);
			writer.close();
			setTmpFileHasContent(true);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}else{
			//TODO handle the situation properly
			setTmpFileHasContent(false);
		}
		
	}
	
	public Resource reconstructModel() throws Exception{
		
		ResourceSet resourceSet = new ResourceSetImpl();

		// Register the default resource factory 
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xml", new DsResourceFactoryImpl());

		
		// Get the URI of the model file.
		
		URI fileURI = URI.createFileURI(tempfile.getAbsolutePath());

		// Demand load the resource for this file, here the actual loading is done.
		
		Resource resource = resourceSet.getResource(fileURI, true);
		
		setModelChanged(false);
		
		return resource;
      		
	}
	
	private File getTemporaryFile() throws Exception {
		
		tempTag = FileUtils.createNewTempTag();
	    tempDirectory = FileUtils.createTempDirectory();
		String pathname = tempDirectory.getCanonicalPath()+File.separator+"dbs"+".xml";
		File tmpfile = new File(pathname);
		if (!tmpfile.exists()) {
		tmpfile.createNewFile();
		}
		return tmpfile;
	}
	
	
	private String getSource() {
		
		String source = MESSAGE;
		
		if(sourceView.getDocumentProvider() != null){
			
			if(sourceView.getDocumentProvider().getDocument(sourceView.getEditorInput()) != null){
				
				if(sourceView.getDocumentProvider().getDocument(sourceView.getEditorInput()).get() != null){
					
					source = sourceView.getDocumentProvider().getDocument(sourceView.getEditorInput()).get();
				}
			}
		}
		return source;
	}
	
	public TextEditor getEditor() {
		return sourceView;
	}
	
	
	public IEditorInput getInput() {
		return editorInput;
	}
	
	public Resource getCurrentResource(){
		return resource;
	}

	public File getTempDirectory() {
		return tempDirectory;
	}

	public boolean isTmpFileHasContent() {
		return tmpFileHasContent;
	}

	public void setTmpFileHasContent(boolean tmpFileHasContent) {
		this.tmpFileHasContent = tmpFileHasContent;
	}

	public boolean isModelChanged() {
		return modelChanged;
	}

	public void setModelChanged(boolean modelChanged) {
		this.modelChanged = modelChanged;
	}

	public ITemporaryFileTag getTempTag() {
		return tempTag;
	}
	
	
}


