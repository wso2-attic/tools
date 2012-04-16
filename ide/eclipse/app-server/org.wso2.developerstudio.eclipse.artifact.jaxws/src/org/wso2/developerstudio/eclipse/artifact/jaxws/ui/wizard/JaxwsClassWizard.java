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

package org.wso2.developerstudio.eclipse.artifact.jaxws.ui.wizard;

import java.io.ByteArrayInputStream;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.IBuffer;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.ui.JavaUI;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.wso2.developerstudio.eclipse.artifact.jaxws.Activator;
import org.wso2.developerstudio.eclipse.artifact.jaxws.utils.JaxUtil;
import org.wso2.developerstudio.eclipse.logging.core.IDeveloperStudioLog;
import org.wso2.developerstudio.eclipse.logging.core.Logger;
import org.wso2.developerstudio.eclipse.utils.project.ProjectUtils;

public class JaxwsClassWizard extends Wizard implements INewWizard {
	private static IDeveloperStudioLog log=Logger.getLog(Activator.PLUGIN_ID);
	IWorkbench workbench;
	IStructuredSelection selection;
	JaxwsClassWizardPage jaxwsClassWizardPage;
	private IProject selectedProject;
	
	public void addPages() {
		jaxwsClassWizardPage = new JaxwsClassWizardPage(workbench, selection);
		addPage(jaxwsClassWizardPage);
		jaxwsClassWizardPage.init(selection);
		jaxwsClassWizardPage.setImageDescriptor(Activator.getImageDescriptor("icons/JAX-WS-wizard.png"));
	}
	
	
	public boolean performFinish() {
		try {
			String ifPkg = jaxwsClassWizardPage.getIfPkg();
			String ifClass = jaxwsClassWizardPage.getIfClass();
			IProject project = getSelectedProject();
			IFolder sourceFolder =ProjectUtils.getWorkspaceFolder(project, "src", "main", "java");
			IFolder webINF = ProjectUtils.getWorkspaceFolder(project, "src", "main", "webapp","WEB-INF");
			IFile cxfServletXML = webINF.getFile("cxf-servlet.xml");
			IJavaProject javaProject = JavaCore.create(project);
			IPackageFragmentRoot root = javaProject.getPackageFragmentRoot(sourceFolder);
			
			IPackageFragment ifSourcePackage = root.getPackageFragment(ifPkg);
			if(!ifSourcePackage.exists()){
				ifSourcePackage = root.createPackageFragment(ifPkg, false, null);
			}
			ICompilationUnit cu = ifSourcePackage.createCompilationUnit(ifClass
					+ ".java", JaxUtil.getServiceClassSource(ifPkg, ifClass,
					jaxwsClassWizardPage.isCreateStubs()), false, null);
			project.refreshLocal(IResource.DEPTH_INFINITE,new NullProgressMonitor());
			
			List superInterfaces = jaxwsClassWizardPage.getSuperInterfaces();
			superInterfaces.add(cu.getTypes()[0].getFullyQualifiedName());
			jaxwsClassWizardPage.setSuperInterfaces(superInterfaces, false);
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
			
			JaxUtil.CxfServlet cxfServlet = new JaxUtil.CxfServlet();			
			
			try {
				
				cxfServlet = new JaxUtil.CxfServlet();
				cxfServlet.deserialize(cxfServletXML);
				cxfServlet.addServer( cu.getTypes()[0].getElementName(), cu.getTypes()[0].getFullyQualifiedName(), "/" + unit.getTypes()[0].getElementName(), unit.getTypes()[0].getFullyQualifiedName());
				cxfServletXML.setContents(new ByteArrayInputStream(cxfServlet.toString().getBytes()), IResource.FORCE, null);
				project.refreshLocal(IResource.DEPTH_INFINITE,new NullProgressMonitor());
				
				IEditorPart javaEditor = JavaUI.openInEditor(unit);
				JavaUI.revealInEditor(javaEditor, (IJavaElement) unit);
			} catch (Exception e) { /* ignore */}

		} catch (CoreException e) {
			log.error("", e);
		} catch (InterruptedException e) {
			log.error("", e);
		}
		return true;
	}

	
	public void init(IWorkbench workbench, IStructuredSelection selection) {
	      this.workbench = workbench;
	      this.selection = selection;
	      setSelectedProject(getProject(selection));
	      setWindowTitle("New JAX-WS class");
	      setDefaultPageImageDescriptor(Activator.getImageDescriptor("icons/JAX-WS-wizard.png"));
	}
	
	public static IProject getProject(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof IResource) {
            return ((IResource) obj).getProject();
        } else if (obj instanceof IStructuredSelection) {
            return getProject(((IStructuredSelection) obj).getFirstElement());
        }
        return null;
    }


	public void setSelectedProject(IProject selectedProject) {
		this.selectedProject = selectedProject;
	}


	public IProject getSelectedProject() {
		return selectedProject;
	}
	
	

}
