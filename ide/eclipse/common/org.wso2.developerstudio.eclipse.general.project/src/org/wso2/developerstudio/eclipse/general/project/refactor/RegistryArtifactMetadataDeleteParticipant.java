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
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.ltk.core.refactoring.Change;
import org.eclipse.ltk.core.refactoring.CompositeChange;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;
import org.eclipse.ltk.core.refactoring.participants.CheckConditionsContext;
import org.eclipse.ltk.core.refactoring.participants.DeleteParticipant;

public class RegistryArtifactMetadataDeleteParticipant extends DeleteParticipant{
	private IResource originalResource;
	private IProject registryProject;

	@Override
    public RefactoringStatus checkConditions(IProgressMonitor arg0, CheckConditionsContext arg1)
                                                                                                throws OperationCanceledException {
		return RefactoringStatus.createWarningStatus("You are about to delete a Registry Artifact");
    }

	@Override
    public Change createChange(IProgressMonitor arg0) throws CoreException,
                                                     OperationCanceledException {
		CompositeChange change = new CompositeChange("Registry Artifact Deletion");
		change.add(new RegistryMetadataFileDeleteChange(registryProject.getName(),
		                                           registryProject.getFile("artifact.xml"), originalResource));
		return change;
    }

	@Override
    public String getName() {
		return "RegistryResourceArtifactDelete";
    }

	@Override
    protected boolean initialize(Object arg0) {
		if (arg0 instanceof IResource) {
			originalResource = (IResource) arg0;
			registryProject = originalResource.getProject();
			return true;
		}
		return false;
    }

}
