/*
 * Copyright (c) 2010, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
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

package org.wso2.developerstudio.eclipse.ds.customvalidator.ui.wizard;

import java.io.File;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.ui.wizards.NewClassWizardPage;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.wso2.developerstudio.eclipse.ds.customvalidator.utils.DataserviceConstants;
import org.wso2.developerstudio.eclipse.libraries.utils.LibraryUtils;
import org.wso2.developerstudio.eclipse.utils.jdt.JavaUtils;

public class NewDataserviceValidatorClassWizardPage extends NewClassWizardPage{
	private String selectedProject;
	private String[] depedencyList = {"abdera-1.0.0.wso2v1.jar",
									"axiom-1.2.9.wso2v1.jar",
									"axis2-1.6.0.wso2v1.jar",
									"commons-codec-1.3.0.wso2v1.jar",
									"commons-httpclient-3.1.0.wso2v1.jar",
									"commons-io-1.4.0.wso2v1.jar",
									"commons-logging-1.1.1.jar",
									"geronimo-stax-api_1.0_spec_1.0.1.wso2v1.jar",
									"httpcore-4.1.0.alpha1-wso2v1.jar",
									"neethi-2.0.4.wso2v1.jar",
									"not-yet-commons-ssl-0.3.9.jar",
									"woden-1.0.0.M8-wso2v1.jar",
									"wsdl4j-1.6.2.wso2v1.jar",
									"XmlSchema-1.4.2.wso2v1.jar"};
	
	public String getSelectedProject() {
		return selectedProject;
	}

	public void setSelectedProject(String selectedProject) {
		this.selectedProject = selectedProject;
	}
	
	public NewDataserviceValidatorClassWizardPage() {
		setDescription("Create new dataservice validator class");
		setTitle("WSO2 Dataservice Validator Java Class");
	}
	
	public void init(IStructuredSelection selection) {
	    super.init(selection);
		addSuperInterface(DataserviceConstants.DATASERVICE_VALIDATOR_INTERFACE_NAME);
		setMethodStubSelection(false, false, true, true);
	}
	
	public String createClass() throws CoreException, InterruptedException{
		addDSLibrary();
		addOtherDependencies();
		createType(new NullProgressMonitor());
		IDE.openEditor(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage(), (IFile)getCreatedType().getResource());
		setSelectedProject(getCreatedType().getJavaProject().getElementName());
		return getCreatedType().getFullyQualifiedName();
	}

	public void addOtherDependencies() throws JavaModelException{
		IJavaProject javaProject = getJavaProject();
		for (String dependencyName : depedencyList) {
			File dependencyPath = LibraryUtils.getDependencyPath(dependencyName);
			JavaUtils.addJarLibraryToProject(javaProject, dependencyPath);
		}
	}
	
	private void addDSLibrary() throws JavaModelException {
	    IJavaProject javaProject = getJavaProject();
		File library = LibraryUtils.getDependencyPath("org.wso2.carbon.dataservices.core-3.0.1.jar");
		JavaUtils.addJarLibraryToProject(javaProject, library);
    }

	public  IProject getProject() {
	    return getJavaProject().getProject();
    }
	
}
