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
import org.eclipse.ltk.core.refactoring.participants.DeleteParticipant;
import org.wso2.developerstudio.eclipse.artifact.endpoint.Activator;
import org.wso2.developerstudio.eclipse.logging.core.IDeveloperStudioLog;
import org.wso2.developerstudio.eclipse.logging.core.Logger;

import java.util.Iterator;
import java.util.List;

public class EndpointArtifactDeleteParticipant extends DeleteParticipant{
	private static IDeveloperStudioLog log = Logger.getLog(Activator.PLUGIN_ID);

	private IFile originalFile;

	@Override
    public RefactoringStatus checkConditions(IProgressMonitor arg0, CheckConditionsContext arg1)
                                                                                                throws OperationCanceledException {
	    return RefactoringStatus.createWarningStatus("You are about to delete your Artifact project");
    }

	@Override
    public Change createPreChange(IProgressMonitor arg0) throws CoreException,
                                                     OperationCanceledException {
		
		CompositeChange deleteChange=new CompositeChange("Delete Artifact Project");
		
		IProject[] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
		
		for (IProject project : projects) {
	        if(project.isOpen() && project.hasNature("org.wso2.developerstudio.eclipse.distribution.project.nature")){
	        	try {
					IFile pomFile = project.getFile("pom.xml");
					MavenProject mavenProject = RefactorUtils.getMavenProject(project);
					Dependency projectDependency = new Dependency();
					projectDependency.setGroupId("org.wso2.carbon");
					projectDependency.setArtifactId(originalFile.getName().substring(0,originalFile.getName().length()-originalFile.getFileExtension().length()-1));
					projectDependency.setVersion("1.0.0");
					
					List<?> dependencies = mavenProject.getDependencies();
					for (Iterator<?> iterator = dependencies.iterator(); iterator.hasNext();) {
						Dependency dependency = (Dependency) iterator.next();
						if (RefactorUtils.isDependenciesEqual(projectDependency, dependency)) {
							deleteChange.add(new MavenConfigurationFileDeleteChange(project.getName(), pomFile, projectDependency));
						}
					}
				} catch (Exception e) {
					log.error("Error occured while trying to generate the Refactoring", e);
				}
	        }
        }
		
	    return deleteChange;
    }

	@Override
    public String getName() {
	    // TODO Auto-generated method stub
	    return null;
    }

	@Override
    protected boolean initialize(Object arg0) {
		if (arg0 instanceof IFile) {
			originalFile = (IFile) arg0;
			return true;
		}
		return false;
    }

	@Override
    public Change createChange(IProgressMonitor arg0) throws CoreException,
                                                     OperationCanceledException {
	    // TODO Auto-generated method stub
	    return null;
    }

}
