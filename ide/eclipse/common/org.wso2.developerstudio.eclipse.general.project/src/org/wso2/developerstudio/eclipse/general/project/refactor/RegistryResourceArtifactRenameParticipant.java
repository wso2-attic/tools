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
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.ltk.core.refactoring.Change;
import org.eclipse.ltk.core.refactoring.CompositeChange;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;
import org.eclipse.ltk.core.refactoring.participants.CheckConditionsContext;
import org.eclipse.ltk.core.refactoring.participants.RenameArguments;
import org.eclipse.ltk.core.refactoring.participants.RenameParticipant;
import org.wso2.developerstudio.eclipse.utils.file.FileUtils;

import java.util.ArrayList;
import java.util.List;

public class RegistryResourceArtifactRenameParticipant extends RenameParticipant {
	private IFile originalFile;
	private IFolder originalFolder;
	private String changedFileName;
	private String changedFolderName;
	private IProject registryProject;
	private static List<String> skipList;

    public RefactoringStatus checkConditions(IProgressMonitor arg0, CheckConditionsContext arg1)
                                                                                                throws OperationCanceledException {
		if (originalFile != null || originalFolder != null) {
			List<String> matchinFilesList = new ArrayList<String>();			
			skipList=new ArrayList<String>();
			skipList.add("target");
			skipList.add("bin");
			skipList.add(".svn");
			
			if (originalFile != null) {
	            FileUtils.getAllExactMatchingFiles(registryProject.getLocation().toOSString(),
	                                               changedFileName.substring(0,
	                                                                         changedFileName.lastIndexOf(".")),
	                                               changedFileName.substring(changedFileName.lastIndexOf(".") + 1),
	                                               matchinFilesList, skipList);
            }else{
            	FileUtils.getAllExactMatchingFiles(registryProject.getLocation().toOSString(),
	                                               changedFolderName, null,
	                                               matchinFilesList, skipList);
            }
			if (!matchinFilesList.isEmpty()) {
				if (changedFileName != null) {
	                return RefactoringStatus.createFatalErrorStatus("An Registry Artifact already exist with the same name " +
	                                                                changedFileName +
	                                                                " in the project " +
	                                                                registryProject.getName());
                }else{
                	return RefactoringStatus.createFatalErrorStatus("An Registry Artifact already exist with the same name " +
	                                                                changedFolderName +
	                                                                " in the project " +
	                                                                registryProject.getName());
                }
			} else if (changedFileName!= null && changedFileName.substring(0, changedFileName.lastIndexOf("."))
			                          .equalsIgnoreCase(registryProject.getName())) {
				return RefactoringStatus.createFatalErrorStatus("You are trying to rename your Registry Artifact to have the project name.");
			}else if (changedFolderName!= null && changedFolderName.equalsIgnoreCase(registryProject.getName())) {
				return RefactoringStatus.createFatalErrorStatus("You are trying to rename your Registry Artifact to have the project name.");
			}

			if (originalFile != null) {
	            return RefactoringStatus.createInfoStatus("You are about the rename your Registry Artifact " +
	                                                      originalFile.getName() +
	                                                      " to " +
	                                                      changedFileName);
            }else{
            	return RefactoringStatus.createInfoStatus("You are about the rename your Registry Artifact " +
	                                                      originalFolder.getName() +
	                                                      " to " +
	                                                      changedFolderName);
            }
		}

		return RefactoringStatus.createFatalErrorStatus("You are trying to rename a different entity than a collection or a resource");
    }

    public Change createChange(IProgressMonitor arg0) throws CoreException,
                                                     OperationCanceledException {
		CompositeChange change=new CompositeChange("Registry Artifact Rename");
		if (originalFile != null) {
	        change.add(new RegistryMeataDataFileChange(
	                                                   "Meta data file",
	                                                   registryProject.getFolder("default").getFile("artifact.xml"),
	                                                   originalFile,
	                                                   changedFileName, RegistryArtifactType.Resource));
        }else{
	        change.add(new RegistryMeataDataFileChange(
	                                                   "Meta data file",
	                                                   registryProject.getFolder("default").getFile("artifact.xml"),
	                                                   originalFolder,
	                                                   changedFolderName, RegistryArtifactType.Collection));
        }
		return change;
    }

    public String getName() {
		return "RegistryResourceArtifactRename";
    }

    protected boolean initialize(Object arg0) {
		// Similar to check initial conditions

		if (arg0 instanceof IFile) {
			originalFile = (IFile) arg0;
			registryProject = originalFile.getProject();
			RenameArguments arguments = getArguments();
			changedFileName = arguments.getNewName();
			return true;
		}else if(arg0 instanceof IFolder){
			originalFolder=(IFolder) arg0;
			registryProject=originalFolder.getProject();
			changedFolderName=getArguments().getNewName();
			return true;
		}
		return false;
    }

}
