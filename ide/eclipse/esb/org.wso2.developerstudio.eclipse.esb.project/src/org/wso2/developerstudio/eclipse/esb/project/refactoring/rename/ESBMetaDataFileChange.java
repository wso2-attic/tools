/*
 * Copyright (c) 2010, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
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

package org.wso2.developerstudio.eclipse.esb.project.refactoring.rename;

import org.eclipse.core.resources.IFile;
import org.eclipse.ltk.core.refactoring.TextFileChange;
import org.eclipse.text.edits.MultiTextEdit;
import org.eclipse.text.edits.ReplaceEdit;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ESBMetaDataFileChange extends TextFileChange {
	private IFile metaDataFile;
	private String newName;
	private String originalName;

	public ESBMetaDataFileChange(String name, IFile file,String originalName, String newName) {
		super(name, file);
		metaDataFile = file;
		this.originalName=originalName;
		this.newName=newName;

		addTextEdits();
		// TODO Auto-generated constructor stub
	}

	private void addTextEdits() {
		if (metaDataFile.getName().equalsIgnoreCase("artifact.xml")) {
			setEdit(new MultiTextEdit());//0, FileUtils.getContentAsString(metaDataFile.getLocation().toFile()).length()));
//			addEdit(new ReplaceEdit(0, 4, "vvvv"));
//			addEdit(new ReplaceEdit(8, 4, "vvvv"));
			try {
	            identifyReplaces();
            } catch (IOException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
            }
		}
	}

	// Here we implement the logic to identify the places to be replaced
	private void identifyReplaces() throws IOException {
		int fullIndex = 0;
		BufferedReader reader =
		                        new BufferedReader(new FileReader(metaDataFile.getLocation()
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
			String[] stringArray = line.split(" ");
			if(line.contains(case1String) && stringArray[getarrayIndexWithString(nameElement, stringArray)].equals(nameElement+case1String)){
				//CASE 1 => <artifact name="proxy1" version="1.0.0" type="synapse/proxy-service" serverRole="EnterpriseServiceBus">
				//Swapping 1 element for "\""
				int case1LineIndex = line.indexOf(case1String)+1;
				addEdit(new ReplaceEdit(fullIndex+case1LineIndex, originalName.length(), newName));
			} else {
	            if(line.contains(case2String) && line.endsWith(File.separator+originalName+".xml</file>")){
	            	//CASE 2 => <file>src/main/synapse-config/proxy-services/proxy1.xml</file>
	            	//Swapping 1 element for File.separator
	            	int case2LineIndex=line.indexOf(case2String)+1;
	            	addEdit(new ReplaceEdit(fullIndex+case2LineIndex, originalName.length(), newName));
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
	
	private int getarrayIndexWithString(String stringToSearch, String[] array){
		int index=0;
		for (String string : array) {
	        if(string.contains(stringToSearch)){
	        	return index;
	        }
	        index++;
        }
		return -1;
	}

	// 
	// protected IDocument acquireDocument(IProgressMonitor pm) throws
	// CoreException {
	// // TODO Auto-generated method stub
	// return super.acquireDocument(pm);
	// }

	// 
	// protected UndoEdit performEdits(IDocument document) throws
	// BadLocationException,
	// MalformedTreeException {
	//
	//
	//
	// // TODO Auto-generated method stub
	// // String string = document.get();
	// // String previewContent;
	// // try {
	// // previewContent = getPreviewContent(null);
	// // } catch (CoreException e1) {
	// // // TODO Auto-generated catch block
	// // e1.printStackTrace();
	// // }
	// if(metaDataFile.getName().endsWith("artifact.xml")){
	// // int lineOffset = document.getLineOffset(0);
	// // document.replace(lineOffset, 4, "vvvv");
	// try {
	// perform(null);
	// } catch (CoreException e1) {
	// // TODO Auto-generated catch block
	// e1.printStackTrace();
	// }
	//
	// // try {
	// // BufferedReader reader=new BufferedReader(new
	// FileReader(metaDataFile.getLocation().toFile()));
	// // String readLine = reader.readLine();
	// // String fullText = "";
	// // while(readLine!=null){
	// // if(readLine.contains("gggg")){
	// // readLine=readLine.replace("gggg", "vvvv");
	// // }
	// // fullText+=readLine;
	// // readLine = reader.readLine();
	// // }
	// // reader.close();
	// //
	// // BufferedWriter writer=new BufferedWriter(new
	// FileWriter(metaDataFile.getLocation().toFile()));
	// // writer.write(fullText);
	// // writer.flush();
	// // writer.close();
	// //
	// // } catch (FileNotFoundException e) {
	// // // TODO Auto-generated catch block
	// // e.printStackTrace();
	// // } catch (IOException e) {
	// // // TODO Auto-generated catch block
	// // e.printStackTrace();
	// // } catch (CoreException e) {
	// // // TODO Auto-generated catch block
	// // e.printStackTrace();
	// // }
	// try {
	// metaDataFile.getProject().refreshLocal(IResource.DEPTH_INFINITE, new
	// NullProgressMonitor());
	// } catch (CoreException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// }
	//
	// return super.performEdits(document);
	// }

}
