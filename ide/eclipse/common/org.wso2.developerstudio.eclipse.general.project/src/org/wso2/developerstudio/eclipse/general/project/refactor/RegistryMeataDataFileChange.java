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

package org.wso2.developerstudio.eclipse.general.project.refactor;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.ltk.core.refactoring.TextFileChange;
import org.eclipse.text.edits.MultiTextEdit;
import org.eclipse.text.edits.ReplaceEdit;
import org.wso2.developerstudio.eclipse.general.project.Activator;
import org.wso2.developerstudio.eclipse.logging.core.IDeveloperStudioLog;
import org.wso2.developerstudio.eclipse.logging.core.Logger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class RegistryMeataDataFileChange extends TextFileChange  {
	private static IDeveloperStudioLog log = Logger.getLog(Activator.PLUGIN_ID);
	
	private IFile metaDataFile;
	private String newName;
	private IResource originalName;
	private RegistryArtifactType type;

	public RegistryMeataDataFileChange(String name, IFile file,IResource originalName, String newName, RegistryArtifactType type) {
	    super(name, file);
		metaDataFile = file;
		this.originalName=originalName;
		this.newName=newName;
		this.type=type;

		addTextEdits();
    }
	
	private void addTextEdits() {
		if (metaDataFile.getName().equalsIgnoreCase("artifact.xml")) {
			setEdit(new MultiTextEdit());
			try {
	            identifyReplaces();
            } catch (IOException e) {
	            log.error("Error occured while trying to generate the refactoring", e);
            }
		}
	}
	
	// Here we implement the logic to identify the places to be replaced
	private void identifyReplaces() throws IOException {
		int fullIndex = 0;
		BufferedReader reader =
		                        new BufferedReader(new FileReader(metaDataFile.getLocation()
		                                                                      .toFile()));
		String case1String = null;
		String originalResourceName = originalName.getName();
		if (originalName instanceof IFile) {
			case1String = "\""
					+ originalResourceName
							.substring(
									0,
									originalResourceName.length()
											- (originalName.getFileExtension()
													.length() + 1)) + "\"";
		}else if(originalName instanceof IFolder){
			case1String = "\""
				+ originalResourceName+ "\"";
		}
		String nameElement = "name=";
		String line = reader.readLine();
		String case2String = originalResourceName;
		while (line != null) {
//				There can be only 2 occurrences. Pls have a look below.
//			    <artifact name="proxy1" version="1.0.0" type="synapse/proxy-service" serverRole="EnterpriseServiceBus">
//		        <file>src/main/synapse-config/proxy-services/proxy1.xml</file>
//		        </artifact>
			String[] stringArray = line.split(" ");
			if(line.contains(case1String) && stringArray[getarrayIndexWithString(nameElement, stringArray)].equals(nameElement+case1String)){
				//CASE 1 => <artifact name="proxy1" version="1.0.0" type="synapse/proxy-service" serverRole="EnterpriseServiceBus">
				//Swapping 1 element for "\""
//				int case1LineIndex = line.indexOf(case1String)+1;
//				addEdit(new ReplaceEdit(fullIndex+case1LineIndex, originalName.getName().substring(0, originalName.getName().length()-(originalName.getFileExtension().length()+1)).length(), newName.substring(0, newName.lastIndexOf("."))));
			} else {
	            if(type==RegistryArtifactType.Resource && line.contains(case2String) && line.endsWith(originalResourceName+"</file>")){
	            	//CASE 2 => <file>src/main/synapse-config/proxy-services/proxy1.xml</file>
	            	int case2LineIndex=line.indexOf(case2String);
	            	addEdit(new ReplaceEdit(fullIndex+case2LineIndex, originalResourceName.length(), newName));
	            }else if(type==RegistryArtifactType.Collection && line.contains(case2String) && line.endsWith(originalResourceName+"</directory>")){
	            	int case2LineIndex=line.indexOf(case2String);
	            	addEdit(new ReplaceEdit(fullIndex+case2LineIndex, originalResourceName.length(), newName));
	            }
            }
			fullIndex+=charsOnTheLine(line);
			line = reader.readLine();
		}
		reader.close();
	}
	
	private int charsOnTheLine(String line){
		//Here we need to add one to represent the newline character
		line+=System.getProperty( "line.separator" );
		return line.length();
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
