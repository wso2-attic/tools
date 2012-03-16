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

package org.wso2.developerstudio.eclipse.platform.core.project.refactor;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.ltk.core.refactoring.TextFileChange;
import org.eclipse.text.edits.MultiTextEdit;
import org.eclipse.text.edits.ReplaceEdit;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MavenConfigurationFileChange extends TextFileChange{
	private IFile pomFile;
	private String previousName;
	private IProject refactoringProject;
	private String previousLine="";
	private String newName;
	
	MultiTextEdit multiEdit;
	
	public MavenConfigurationFileChange(String name, IFile file, String previousName, IProject refactoringProject, String newName) {
	    super(name, file);
	    pomFile=file;
	    
	    this.previousName=previousName;
	    this.refactoringProject=refactoringProject;
	    this.newName=newName;
		addTextEdits();
	    
	    try {
	        ResourcesPlugin.getWorkspace().getRoot().getProject(newName).delete(true, new NullProgressMonitor());
        } catch (CoreException e) {
	        e.printStackTrace();
        }
    }
	
	private void addTextEdits(){
		
		multiEdit=new MultiTextEdit();
		setEdit(multiEdit);
		
		setSaveMode(FORCE_SAVE);
		
		if (refactoringProject.isOpen()) {
        	
        		try {
        			if (pomFile.exists()) {
        				identifyIdArtifactReplacement();
        			} 
        		} catch (IOException e) {
        			// TODO Auto-generated catch block
        			e.printStackTrace();
        		}
        		
        		try {
	                if(refactoringProject.hasNature("org.wso2.developerstudio.eclipse.distribution.project.nature")){
	                	dependencyReplacement();
	                }
                } catch (CoreException e) {
	                // TODO Auto-generated catch block
	                e.printStackTrace();
                } catch (IOException e) {
	                // TODO Auto-generated catch block
	                e.printStackTrace();
                }
        }
	}
	
	private int charsOnTheLine(String line){
		//Here we need to add one to represent the newline character 
		return line.length()+1;
	}
	
	
	private void identifyIdArtifactReplacement() throws IOException{
		int fullIndex = 0;
		BufferedReader reader =
		                        new BufferedReader(new FileReader(pomFile.getLocation()
		                                                                      .toFile()));
		String dependenciesStart="<dependencies>";
		String dependenciesEnd="</dependencies>";
		boolean isDependencies=false;
		String case1String = "<artifactId>";
		String case2String = "</artifactId>";
		String artifactId=previousName;
		String line = reader.readLine();
		while (line != null) {
			if(!isDependencies && line.contains(dependenciesStart)){
				isDependencies=true;
			}
			
			if(isDependencies && line.contains(dependenciesEnd)){
				isDependencies=false;
			}
			
			if (!isDependencies && line.contains(artifactId)) {
				// TODO: Need to add validations for the -1 index
					if (line.contains(case1String) || (previousLine.contains(case1String) && !previousLine.contains(case2String))) {
						
						int case1LineIndex = line.indexOf(artifactId);
						addEdit(new ReplaceEdit(fullIndex + case1LineIndex, artifactId.length(),
						                        newName));
						break;

					}
			}
			fullIndex+=charsOnTheLine(line);
			previousLine=line;
			line = reader.readLine();
		}
		reader.close();
	}
	
	private void dependencyReplacement() throws IOException{
		int fullIndex = 0;
		BufferedReader reader =
		                        new BufferedReader(new FileReader(pomFile.getLocation()
		                                                                      .toFile()));
		String dependenciesStart="<dependencies>";
		String dependenciesEnd="</dependencies>";
		boolean isDependencies=false;
		String case1String = "<artifactId>";
		String case2String = "</artifactId>";
		String artifactId=previousName;
		String line = reader.readLine();
		while (line != null) {
			if(!isDependencies && line.contains(dependenciesStart)){
				isDependencies=true;
			}
			
			if(isDependencies && line.contains(dependenciesEnd)){
				isDependencies=false;
			}
			
			if (isDependencies && line.contains(artifactId)) {
				// TODO: Need to add validations for the -1 index
					if (line.contains(case1String) || (previousLine.contains(case1String) && !previousLine.contains(case2String))) {
						
						int case1LineIndex = line.indexOf(artifactId);
						addEdit(new ReplaceEdit(fullIndex + case1LineIndex, artifactId.length(),
						                        newName));
						break;

					}
			}
			fullIndex+=charsOnTheLine(line);
			previousLine=line;
			line = reader.readLine();
		}
		reader.close();
	}
}
