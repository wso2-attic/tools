/*
 * Copyright (c) 2012, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
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

package org.wso2.developerstudio.eclipse.esb.project.refactoring.delete;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.ltk.core.refactoring.TextFileChange;
import org.eclipse.text.edits.MultiTextEdit;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ESBMetaDataFileDeleteChange extends TextFileChange{
	private IFile metaDataFile;
	private IProject esbProject;

	public ESBMetaDataFileDeleteChange(String name, IFile file, IProject esbProject) {
	    super(name, file);
	    metaDataFile=file;
	    this.esbProject=esbProject;
	    
	    addTextEdits();
    }
	
	private void addTextEdits() {
		if (metaDataFile.getName().equalsIgnoreCase("artifact.xml")) {
			setEdit(new MultiTextEdit());
			try {
	            identifyReplaces();
            } catch (IOException e) {
	            e.printStackTrace();
            }
		}
	}
	
	private void identifyReplaces() throws IOException {
		int fullIndex = 0;
		BufferedReader reader =
		                        new BufferedReader(new FileReader(metaDataFile.getLocation()
		                                                                      .toFile()));
		String line = reader.readLine();
		while (line != null) {
			
			
			
			
			
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

}
