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

package org.wso2.carbonstudio.eclipse.artifacts.axis2.ui.actions;

import java.io.File;
import java.io.FileInputStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWizard;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.wizards.IWizardDescriptor;
import org.wso2.carbonstudio.eclipse.utils.jdt.JavaUtils;

public class StubGenerationAction extends WSDLGenerationAction {

	private void createStub(Shell shell, String serviceName, File classpathLocation,
	        String serviceClassName) throws Exception {
		File wsdlFile = generateWSDLFromJavaClass(serviceName, classpathLocation, serviceClassName);
		IWizardDescriptor wizardDesc = PlatformUI.getWorkbench().getNewWizardRegistry().findWizard(
		                            "org.eclipse.jst.ws.internal.consumption.ui.wizard.client.clientwizard");
		if (wizardDesc != null) {
			IWorkbenchWizard wizard = wizardDesc.createWizard();
			IFolder folder =ResourcesPlugin.getWorkspace().getRoot().getFolder(JavaUtils.getJavaOutputDirectory(getFile().getProject()));
			if (!folder.exists()) {
				folder.create(true, true, null);
			}
			IFile file = folder.getFile(serviceName + "_" + wsdlFile.getName() + ".wsdl");
			file.create(new FileInputStream(wsdlFile), true, null);
			wizard.init(PlatformUI.getWorkbench(), new StructuredSelection(file));
			WizardDialog wizardDialog = new WizardDialog(shell, wizard);
			wizardDialog.open();
		}
	}
	@Override
	protected void generate(Shell shell, String serviceName,
			File classpathLocation, String serviceClassName) throws Exception {
		createStub(shell, serviceName, classpathLocation, serviceClassName);
	}
}