/*
 * Copyright (c) 2012, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
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

package org.wso2.developerstudio.eclipse.artifact.endpoint.refactor;

import org.apache.maven.model.Dependency;
import org.apache.maven.project.MavenProject;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.ltk.core.refactoring.Change;
import org.eclipse.ltk.core.refactoring.CompositeChange;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;
import org.eclipse.ltk.core.refactoring.participants.CheckConditionsContext;
import org.eclipse.ltk.core.refactoring.participants.RenameArguments;
import org.eclipse.ltk.core.refactoring.participants.RenameParticipant;
import org.wso2.developerstudio.eclipse.artifact.endpoint.Activator;
import org.wso2.developerstudio.eclipse.logging.core.IDeveloperStudioLog;
import org.wso2.developerstudio.eclipse.logging.core.Logger;
import org.wso2.developerstudio.eclipse.maven.util.MavenUtils;
import org.wso2.developerstudio.eclipse.utils.file.FileUtils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EndpointRenameRefactorParticipant extends RenameParticipant {
	private static IDeveloperStudioLog log = Logger.getLog(Activator.PLUGIN_ID);

	private IFile originalFile;
	private String changedFileName;
	private IProject esbProject;
	private static List<String> skipList;
	
	static{
		skipList = new ArrayList<String>();
		skipList.add("target");
		skipList.add("bin");
		skipList.add(".svn");
	}

	public RefactoringStatus checkConditions(IProgressMonitor arg0, CheckConditionsContext arg1)
	                                                                                            throws OperationCanceledException {
		if (originalFile != null) {
			List<String> matchinFilesList = new ArrayList<String>();

			FileUtils.getAllExactMatchingFiles(esbProject.getLocation().toOSString(),
			                                   changedFileName.substring(0,
			                                                             changedFileName.lastIndexOf(".")),
			                                   changedFileName.substring(changedFileName.lastIndexOf(".") + 1),
			                                   matchinFilesList, skipList);

			if (!matchinFilesList.isEmpty()) {
				return RefactoringStatus.createFatalErrorStatus("An ESB Artifact already exist with the same name " +
				                                                changedFileName +
				                                                " in the project " +
				                                                esbProject.getName());
			} else if (changedFileName.substring(0, changedFileName.lastIndexOf("."))
			                          .equalsIgnoreCase(esbProject.getName())) {
				return RefactoringStatus.createFatalErrorStatus("You are trying to rename your ESB Artifact to have the project name.");
			}

			return RefactoringStatus.createInfoStatus("You are about the rename your ESB Artifact " +
			                                          originalFile.getName() +
			                                          " to " +
			                                          changedFileName);
		}

		return RefactoringStatus.createFatalErrorStatus("You are trying to rename a different resource than a file");
	}

	public Change createPreChange(IProgressMonitor arg0) throws CoreException,
	                                                    OperationCanceledException {
		CompositeChange endpointChange = new CompositeChange("Endpoint Artifact Rename");
		String originalFileNamewithExtension = originalFile.getName();
		String changedNameWithoutExtention =
		                                     changedFileName.substring(0,
		                                                               changedFileName.length() - 4);
		String originalNameWithoutExtension =
		                                      originalFileNamewithExtension.substring(0,
		                                                                              originalFileNamewithExtension.length() - 4);
		EndpointArtifactFileChange endpointArtifactFileChange =
		                                                        new EndpointArtifactFileChange(
		                                                                                       "Renaming ESB Artifact " +
		                                                                                           originalFile.getName()
		                                                                                                       .substring(0,
		                                                                                                                  originalFile.getName()
		                                                                                                                              .length() -
		                                                                                                                      originalFile.getFileExtension()
		                                                                                                                                  .length()),
		                                                                                       originalFile,
		                                                                                       originalNameWithoutExtension,
		                                                                                       changedNameWithoutExtention);
		endpointChange.add(endpointArtifactFileChange);

		IProject[] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();

		for (int i = 0; i < projects.length; i++) {
			if (projects[i].isOpen() &&
			    projects[i].hasNature("org.wso2.developerstudio.eclipse.distribution.project.nature")) {
				try {
					MavenProject mavenProject =
					                            MavenUtils.getMavenProject(projects[i].getFile("pom.xml")
					                                                                  .getLocation()
					                                                                  .toFile());
					List<?> dependencies = mavenProject.getDependencies();
					for (Iterator<?> iterator = dependencies.iterator(); iterator.hasNext();) {
						Dependency dependency = (Dependency) iterator.next();
						if (originalNameWithoutExtension.equalsIgnoreCase(dependency.getArtifactId())) {
							endpointChange.add(new MavenConfigurationFileChange(
							                                                    projects[i].getName(),
							                                                    projects[i].getFile("pom.xml"),
							                                                    originalNameWithoutExtension,
							                                                    projects[i],
							                                                    changedNameWithoutExtention));
						}
					}
				} catch (Exception e) {
					log.error("Error occured wile trying to generate the Refactoring.", e);
				}
			}
		}

		return endpointChange;
	}

	public String getName() {
		return "EndpointArtifactRenameParticipant";
	}

	protected boolean initialize(Object arg0) {
		if (arg0 instanceof IFile) {
			originalFile = (IFile) arg0;
			esbProject = originalFile.getProject();
			RenameArguments arguments = getArguments();
			changedFileName = arguments.getNewName();
			return true;
		}
		return false;
	}

	@Override
	public Change createChange(IProgressMonitor arg0) throws CoreException,
	                                                 OperationCanceledException {
		return null;
	}

}
