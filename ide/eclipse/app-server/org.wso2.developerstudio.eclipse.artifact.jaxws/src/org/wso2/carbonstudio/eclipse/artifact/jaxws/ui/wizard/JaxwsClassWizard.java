/*
 * Copyright (c) 2011, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
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

package org.wso2.carbonstudio.eclipse.artifact.jaxws.ui.wizard;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.IBuffer;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.ui.JavaUI;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.wso2.carbonstudio.eclipse.artifact.jaxws.Activator;

public class JaxwsClassWizard extends Wizard implements INewWizard {
	IWorkbench workbench;
	IStructuredSelection selection;
	JaxwsClassWizardPage jaxwsClassWizardPage;
	
	public void addPages() {
		jaxwsClassWizardPage = new JaxwsClassWizardPage(workbench, selection);
		addPage(jaxwsClassWizardPage);
		jaxwsClassWizardPage.init(selection);
		jaxwsClassWizardPage.setImageDescriptor(Activator.getImageDescriptor("icons/JAX-WS-wizard.png"));
	}
	
	
	public boolean performFinish() {
		try {
			jaxwsClassWizardPage.createType(new NullProgressMonitor());
			IType classSource = jaxwsClassWizardPage.getCreatedType();
			ICompilationUnit unit = classSource.getCompilationUnit();
			unit.becomeWorkingCopy(new NullProgressMonitor());
			unit.createImport("javax.jws.WebService", null,new NullProgressMonitor());
			String source = unit.getSource();
			String searchFor = "public class " + classSource.getTypeQualifiedName();
			int pos = source.indexOf(searchFor);
			source = (source.substring(0,pos)+ "@WebService(serviceName = \"" + classSource.getTypeQualifiedName()+ "\")"+ System.getProperty("line.separator") +source.substring(pos));
			IBuffer workingCopyBuffer = unit.getBuffer();
			workingCopyBuffer.setContents(source);
			unit.commitWorkingCopy(false, new NullProgressMonitor());
			unit.getJavaProject().getProject().refreshLocal(IResource.DEPTH_INFINITE,new NullProgressMonitor());
			try {
				IEditorPart javaEditor = JavaUI.openInEditor(unit);
				JavaUI.revealInEditor(javaEditor, (IJavaElement) unit);
			} catch (Exception e) { /* ignore */}

		} catch (CoreException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return true;
	}

	
	public void init(IWorkbench workbench, IStructuredSelection selection) {
	      this.workbench = workbench;
	      this.selection = selection;
	      setWindowTitle("New JAX-WS class");
	      setDefaultPageImageDescriptor(Activator.getImageDescriptor("icons/JAX-WS-wizard.png"));
	}
	
	

}
