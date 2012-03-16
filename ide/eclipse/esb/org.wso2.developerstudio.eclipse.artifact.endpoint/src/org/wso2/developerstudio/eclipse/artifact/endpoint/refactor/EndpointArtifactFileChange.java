package org.wso2.developerstudio.eclipse.artifact.endpoint.refactor;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.ltk.core.refactoring.Change;
import org.eclipse.ltk.core.refactoring.CompositeChange;
import org.eclipse.ltk.core.refactoring.TextEditChangeGroup;
import org.eclipse.ltk.core.refactoring.TextFileChange;
import org.eclipse.text.edits.MalformedTreeException;
import org.eclipse.text.edits.MultiTextEdit;
import org.eclipse.text.edits.ReplaceEdit;
import org.eclipse.text.edits.TextEditGroup;
import org.eclipse.text.edits.UndoEdit;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.editors.text.TextFileDocumentProvider;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.texteditor.IDocumentProvider;
import org.eclipse.ui.texteditor.ITextEditor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class EndpointArtifactFileChange extends TextFileChange{
	private IFile endpointFile;
	private String newName;
	private String originalName;
	
	private int endpointReplaceOffset;
	private int endpointReplaceLength;


	public EndpointArtifactFileChange(String name, IFile file,String originalName, String newName, int endpointRelaceOffSet, int endpointReplaceLength) {
	    super(name, file);
		endpointFile = file;
		this.originalName=originalName;
		this.newName=newName;
		this.endpointReplaceOffset=endpointRelaceOffSet;
		this.endpointReplaceLength=endpointReplaceLength;
		
		addTextEdits();
		
	}

	private void addTextEdits() {
			
			
			MultiTextEdit multiTextEdit = new MultiTextEdit();
			setEdit(multiTextEdit); //FileUtils.getContentAsString(endpointFile.getLocation().toFile()).length()));
			
//			try {
//	            perform(new NullProgressMonitor());
//            } catch (CoreException e) {
//	            // TODO Auto-generated catch block
//	            e.printStackTrace();
//            }
			setSaveMode(FORCE_SAVE);
			
			try {
				if(endpointFile.exists()){
	            identifyReplaces();
				}
            } catch (IOException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
            }
	}
	
	@Override
	protected UndoEdit performEdits(IDocument document) throws BadLocationException,
	                                                   MalformedTreeException {
//		
//			IEditorDescriptor desc = PlatformUI.getWorkbench().getEditorRegistry().getDefaultEditor(endpointFile.getName());
//		    IDocument doc = document;
//		    try    {
//		        FileEditorInput fileEditorInput = new FileEditorInput(endpointFile);
//		        IWorkbenchWindow[] workbenchWindows = PlatformUI.getWorkbench().getWorkbenchWindows();
//		         IWorkbenchPage activePage =workbenchWindows[0].getActivePage();
//		         activePage.openEditor(fileEditorInput, "HelloWorld");
//		        ITextEditor editor =(ITextEditor)activePage.openEditor(fileEditorInput, "HelloWorld"); //activePage.openEditor(fileEditorInput, desc.getId());
//		        IDocumentProvider dp = editor.getDocumentProvider();
//		         doc= dp.getDocument(fileEditorInput);
//		    }catch (Exception e) {
//		    	System.err.println(e);
//			}
//		    
		
		if(!endpointFile.exists()){
			
			String osString = endpointFile.getLocation().toOSString();
			IProject project = endpointFile.getProject();
			String osString2 = project.getLocation().toOSString();
			String substring = osString.substring(0, osString.length()-(originalName+".xml").length());
			substring=substring.substring(osString2.length()+1);
			endpointFile=project.getFile(substring+newName+".xml");
			
//			IFile originalFile=endpointFile;
//			String originalFileNamewithExtension = originalFile.getName();
//			parentChange.add(new EndpointArtifactFileChange("Renaming ESB Artifact "+originalFile.getName().substring(0,originalFile.getName().length()-originalFile.getFileExtension().length()), originalFile, originalFileNamewithExtension.substring(0,originalFileNamewithExtension.length()-4),newName,parentChange));
			
			
			
			dispose();
		}
		    
		    IDocumentProvider provider = new TextFileDocumentProvider(); 
		    try {
	            provider.connect(endpointFile);
            } catch (CoreException e) {
	            e.printStackTrace();
            }
            document = provider.getDocument(endpointFile);
            provider.disconnect(endpointFile);
            
            try {
	            acquireDocument(new NullProgressMonitor());
            } catch (CoreException e1) {
	            e1.printStackTrace();
            }
            
            
		    
            try {
	            document.replace(endpointReplaceOffset, endpointReplaceLength, newName);
            } catch (Exception e1) {
	            e1.printStackTrace();
            }
            
//            UndoEdit performEdits = performEdits(document);
		
            try {
            	commit(document, new NullProgressMonitor());
            } catch (CoreException e) {
            	e.printStackTrace();
            }
            
            try {
            	releaseDocument(document, new NullProgressMonitor());
            } catch (CoreException e) {
            	e.printStackTrace();
            }
	    UndoEdit performEdits = super.performEdits(document);
	    
	    
	    return performEdits;
	}
	

	// Here we implement the logic to identify the places to be replaced
	private void identifyReplaces() throws IOException {
		int fullIndex = 0;
		BufferedReader reader =
		                        new BufferedReader(new FileReader(endpointFile.getLocation()
		                                                                      .toFile()));
		String case1String = "\""+originalName+"\"";
		String nameElement = "name=";
		String line = reader.readLine();
		String case2String = File.separator+originalName+".xml";
		while (line != null) {
			
			
			
			
			
			
			
			
			
//				There can be only 2 occurrences. Pls have a look below.
//			    <artifact name="proxy1" version="1.0.0" type="synapse/proxy-service" serverRole="EnterpriseServiceBus">
//		        <file>src/main/synapse-config/proxy-services/proxy1.xml</file>
//		        </artifact>
			String[] stringArray = line.trim().split(" ");
			if (line.contains(case1String)) {
				// TODO: Need to add validations for the -1 index
				int getArrayIndexWithString = getArrayIndexWithString(nameElement, stringArray);
				if (getArrayIndexWithString != -1) {
					if (stringArray[getArrayIndexWithString].equalsIgnoreCase(nameElement +
					                                                          case1String) ||
					    stringArray[getArrayIndexWithString].equalsIgnoreCase(nameElement +
					                                                          case1String + ">") ||
					    stringArray[getArrayIndexWithString].equalsIgnoreCase(nameElement +
					                                                          case1String + "/>")) {
						// CASE 1 => <artifact name="proxy1" version="1.0.0"
						// type="synapse/proxy-service"
						// serverRole="EnterpriseServiceBus">
						// Swapping 1 element for "\""
						int case1LineIndex = line.indexOf(case1String) + 1;
						addEdit(new ReplaceEdit(fullIndex + case1LineIndex, originalName.length(),
						                        newName));

						endpointReplaceOffset = fullIndex + case1LineIndex;
						endpointReplaceLength = originalName.length();

					}

				}else{
					String keyElement="key=";
					int localEntryArrayIndex=getArrayIndexWithString(keyElement, stringArray);
					if(localEntryArrayIndex!= -1){
						if (stringArray[localEntryArrayIndex].equalsIgnoreCase(keyElement +
						                                                          case1String) ||
						    stringArray[localEntryArrayIndex].equalsIgnoreCase(keyElement +
						                                                          case1String + ">") ||
						    stringArray[localEntryArrayIndex].equalsIgnoreCase(keyElement +
						                                                          case1String + "/>")) {
							// CASE 1 => <artifact name="proxy1" version="1.0.0"
							// type="synapse/proxy-service"
							// serverRole="EnterpriseServiceBus">
							// Swapping 1 element for "\""
							int case1LineIndex = line.indexOf(case1String) + 1;
							addEdit(new ReplaceEdit(fullIndex + case1LineIndex, originalName.length(),
							                        newName));

							endpointReplaceOffset = fullIndex + case1LineIndex;
							endpointReplaceLength = originalName.length();

						}
					}
				}
			}
			fullIndex+=charsOnTheLine(line);
			line = reader.readLine();
		}
		reader.close();
	}
	
	private int charsOnTheLine(String line){
		//Here we need to add one to represent the newline character 
		return line.length()+1;
	}
	
	private int getArrayIndexWithString(String stringToSearch, String[] array){
		int index=0;
		for (String string : array) {
	        if(string.contains(stringToSearch)){
	        	return index;
	        }
	        index++;
        }
		return -1;
	}

	public int getEndpointReplaceOffset() {
		return endpointReplaceOffset;
	}
	
	public void setEndpointReplaceOffset(int endpointReplaceOffset) {
		this.endpointReplaceOffset = endpointReplaceOffset;
	}
	
	public int getEndpointReplaceLength() {
		return endpointReplaceLength;
	}
	
	public void setEndpointReplaceLength(int endpointReplaceLength) {
		this.endpointReplaceLength = endpointReplaceLength;
	}
}
