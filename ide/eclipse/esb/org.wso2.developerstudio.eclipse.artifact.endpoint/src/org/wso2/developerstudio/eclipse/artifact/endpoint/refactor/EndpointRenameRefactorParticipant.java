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

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.io.FilenameUtils;
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

public class EndpointRenameRefactorParticipant extends RenameParticipant {
	private static IDeveloperStudioLog log = Logger.getLog(Activator.PLUGIN_ID);

	private IFile originalFile;
	private String changedFileName;
	private IProject esbProject;
	private static List<String> skipList;
	private static final String GRAPHICAL_SYNAPSE_CONFIG_DIR =
	                                                           "/src/main/graphical-synapse-config/";
	protected final static String EDITOR_ID =
	                                          "org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbMultiPageEditor";

	static {
		skipList = new ArrayList<String>();
		skipList.add("target");
		skipList.add("bin");
		skipList.add(".svn");
	}

	public RefactoringStatus checkConditions(IProgressMonitor arg0, CheckConditionsContext arg1)
	                                                                                            throws OperationCanceledException {
		if (originalFile != null) {
			List<String> matchinFilesList = new ArrayList<String>();

			org.wso2.developerstudio.eclipse.utils.file.FileUtils.getAllExactMatchingFiles(esbProject.getLocation()
			                                                                                         .toOSString(),
			                                                                               changedFileName.substring(0,
			                                                                                                         changedFileName.lastIndexOf(".")),
			                                                                               changedFileName.substring(changedFileName.lastIndexOf(".") + 1),
			                                                                               matchinFilesList,
			                                                                               skipList);

			if (!matchinFilesList.isEmpty()) {
				return RefactoringStatus.createFatalErrorStatus("An ESB Artifact already exists with the same name " +
				                                                changedFileName +
				                                                " in the project " +
				                                                esbProject.getName());
			} else if (changedFileName.substring(0, changedFileName.lastIndexOf("."))
			                          .equalsIgnoreCase(esbProject.getName())) {
				return RefactoringStatus.createFatalErrorStatus("You are trying to rename your ESB Artifact to have the project name.");
			}

			return RefactoringStatus.createInfoStatus("You are about to rename your ESB Artifact " +
			                                          originalFile.getName() + " to " +
			                                          changedFileName);
		}

		return RefactoringStatus.createFatalErrorStatus("You are trying to rename a different resource than a file");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ltk.core.refactoring.participants.RefactoringParticipant#
	 * createPreChange(org.eclipse.core.runtime.IProgressMonitor)
	 */
	public Change createPreChange(IProgressMonitor arg0) throws CoreException,
	                                                    OperationCanceledException {

		String changedNameWithoutExtention = FilenameUtils.removeExtension(changedFileName);
		String originalNameWithoutExtension = FilenameUtils.removeExtension(originalFile.getName());
		String originalEsbFileName = getEsbFile(originalNameWithoutExtension);
		String originalEsbDiagramFileName = getEsbDiagramFile(originalNameWithoutExtension);
		String changedEsbFileName = getEsbFile(changedNameWithoutExtention);
		String changedEsbDiagramFileName = getEsbDiagramFile(changedNameWithoutExtention);

		CompositeChange compositeChange = new CompositeChange("ESB Artifact Rename");

		// Change content of the original file
		EndpointArtifactFileChange endpointArtifactFileChange =
		                                                        new EndpointArtifactFileChange(
		                                                                                       "Renaming ESB Artifact " +
		                                                                                               originalNameWithoutExtension,
		                                                                                       originalFile,
		                                                                                       originalNameWithoutExtension,
		                                                                                       changedNameWithoutExtention);
		compositeChange.add(endpointArtifactFileChange);

		String immediateDirectory =
		                            GRAPHICAL_SYNAPSE_CONFIG_DIR +
		                                    originalFile.getParent().getName();

		IFile esbIFile = esbProject.getFile(immediateDirectory + "/" + originalEsbFileName);
		if (esbIFile.exists()) {
			// Change content of the esb file
			EndpointEsbFileChange esbFileChange =
			                                      new EndpointEsbFileChange(
			                                                                "Changing ESB file content",
			                                                                esbIFile,
			                                                                originalNameWithoutExtension,
			                                                                changedNameWithoutExtention);
			compositeChange.add(esbFileChange);
			// Rename esb file
			EndpointEsbFileRename esbFileRename =
			                                      new EndpointEsbFileRename(esbIFile,
			                                                                changedEsbFileName);
			compositeChange.add(esbFileRename);
		}

		IFile esbDiagramIFile =
		                        esbProject.getFile(immediateDirectory + "/" +
		                                           originalEsbDiagramFileName);
		if (esbDiagramIFile.exists()) {
			// Change content of the esb diagram file
			EndpointEsbFileChange esbDiagramFileChange =
			                                             new EndpointEsbFileChange(
			                                                                       "Changing ESB diagram file content",
			                                                                       esbDiagramIFile,
			                                                                       originalNameWithoutExtension,
			                                                                       changedNameWithoutExtention);
			compositeChange.add(esbDiagramFileChange);
			// Rename esb diagram file
			EndpointEsbFileRename esbDiagramFileRename =
			                                             new EndpointEsbFileRename(esbDiagramIFile,
			                                                                       changedEsbDiagramFileName);
			compositeChange.add(esbDiagramFileRename);
		}

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
							compositeChange.add(new MavenConfigurationFileChange(
							                                                     projects[i].getName(),
							                                                     projects[i].getFile("pom.xml"),
							                                                     originalNameWithoutExtension,
							                                                     projects[i],
							                                                     changedNameWithoutExtention));
						}
					}
				} catch (Exception e) {
					log.error("Error occured while trying to generate the Refactoring.", e);
				}
			}
		}

		return compositeChange;
	}

	private String getEsbDiagramFile(String fileName) {
		String prefix = getDirectoryPrefix();
		return prefix + fileName + ".esb_diagram";
	}

	private String getEsbFile(String fileName) {
		String prefix = getDirectoryPrefix();
		return prefix + fileName + ".esb";
	}

	private String getDirectoryPrefix() {
		String imediateDirectory = originalFile.getParent().getName();
		String directoryPrefix = "";
		if (imediateDirectory.equalsIgnoreCase("api")) {
			directoryPrefix = "api_";
		} else if (imediateDirectory.equalsIgnoreCase("endpoints")) {
			directoryPrefix = "endpoint_";
		} else if (imediateDirectory.equalsIgnoreCase("local-entries")) {
			directoryPrefix = "localentry_";
		} else if (imediateDirectory.equalsIgnoreCase("message-processors")) {
			directoryPrefix = "messageProcessor_";
		} else if (imediateDirectory.equalsIgnoreCase("message-stores")) {
			directoryPrefix = "messageStore_";
		} else if (imediateDirectory.equalsIgnoreCase("proxy-services")) {
			directoryPrefix = "proxy_";
		} else if (imediateDirectory.equalsIgnoreCase("sequences")) {
			directoryPrefix = "sequence_";
		} else if (imediateDirectory.equalsIgnoreCase("tasks")) {
			directoryPrefix = "task_";
		} else if (imediateDirectory.equalsIgnoreCase("templates")) {
			directoryPrefix = "template_";
		}
		return directoryPrefix;
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
