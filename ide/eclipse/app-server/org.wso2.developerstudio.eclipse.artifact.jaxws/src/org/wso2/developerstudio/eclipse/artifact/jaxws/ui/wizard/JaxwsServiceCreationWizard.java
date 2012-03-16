/*
 * Copyright (c) 2011, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
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

package org.wso2.developerstudio.eclipse.artifact.jaxws.ui.wizard;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.wso2.developerstudio.eclipse.artifact.jaxws.model.JaxwsModel;
import org.wso2.developerstudio.eclipse.platform.ui.wizard.AbstractWSO2ProjectCreationWizard;
import org.wso2.developerstudio.eclipse.utils.jdt.JavaUtils;
import org.wso2.developerstudio.eclipse.utils.project.ProjectUtils;
import org.eclipse.jdt.core.IAnnotation;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.ui.JavaUI;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;

public class JaxwsServiceCreationWizard  extends AbstractWSO2ProjectCreationWizard{
	private JaxwsModel jaxwsModel;
	IProject project;
	IFolder sourceFolder;
	IJavaProject javaProject;
	IPackageFragmentRoot root;
	
	public JaxwsServiceCreationWizard(){
		setjaxwsModel(new JaxwsModel());
		setModel(getJaxwsModel());
		setWindowTitle("Create New JAX-WS Service");
	}
	
	
	public void init(IWorkbench arg0, IStructuredSelection selection) {
		super.init(arg0, selection);
	}
	
	
	public boolean performFinish() {
		try {
			project = createNewProject();
			sourceFolder =ProjectUtils.getWorkspaceFolder(project, "src", "main", "java");
			javaProject = JavaCore.create(project);
			root = javaProject.getPackageFragmentRoot(sourceFolder);
			
			JavaUtils.addJavaSupportAndSourceFolder(project, sourceFolder);
			if (getModel().getSelectedOption().equals("new.jaxws")) {
				if(jaxwsModel.isCreateClass()){
//					String className = (jaxwsModel.getServiceClass().lastIndexOf('.') > 0)?jaxwsModel.getServiceClass().substring(jaxwsModel.getServiceClass().lastIndexOf('.')+1):jaxwsModel.getServiceClass();
//					String PackageName = (jaxwsModel.getServiceClass().lastIndexOf('.') > 0)?jaxwsModel.getServiceClass().substring(0,jaxwsModel.getServiceClass().lastIndexOf('.')):"";
					
					String className = jaxwsModel.getServiceClass();
					String PackageName = jaxwsModel.getClassPackage();
					
					IPackageFragment sourcePackage = root.createPackageFragment(PackageName, false, null);
					StringBuffer buffer = new StringBuffer();
					if(!PackageName.equalsIgnoreCase("")){
					buffer.append("package " + PackageName + ";\n");
					buffer.append("\n");
					}
					buffer.append("import javax.jws.WebService;\n");
					buffer.append("import javax.jws.WebMethod;\n");
					buffer.append("import javax.jws.WebParam;\n");
					buffer.append("\n");
					buffer.append("@WebService(serviceName = \"" + className + "\")\n" + "public class " + className +"{\n\n" );
					buffer.append("\t/** This is a sample web service operation */\n");
					buffer.append("\t@WebMethod(operationName = \"hello\")\n");
					buffer.append("\tpublic String hello(@WebParam(name = \"name\") String txt) {\n");
					buffer.append("\t\treturn \"Hello \" + txt + \" !\";\n");
					buffer.append("\t}\n\n");
					buffer.append("\n}");
					ICompilationUnit cu = sourcePackage.createCompilationUnit(className+".java", buffer.toString(), false, null);
					project.refreshLocal(IResource.DEPTH_INFINITE,new NullProgressMonitor());
					try {
						IEditorPart javaEditor = JavaUI.openInEditor(cu);
						JavaUI.revealInEditor(javaEditor, (IJavaElement) cu);
					} catch (Exception e) { /* ignore */}
				}
				} else if (getModel().getSelectedOption().equals("import.jaxwswsdl")) {
				ProgressMonitorDialog progressMonitorDialog = new ProgressMonitorDialog(getShell());
				progressMonitorDialog.create();
				progressMonitorDialog.open();
				progressMonitorDialog.run(false, false, new CodegenJob());
				
				project.refreshLocal(IResource.DEPTH_INFINITE,new NullProgressMonitor());
			}

			File pomfile = project.getFile("pom.xml").getLocation().toFile();
//			getModel().getMavenInfo().setPackageName("service/jaxws");
			createPOM(pomfile);
			ProjectUtils.addNatureToProject(project,
			                                false,
											"org.wso2.developerstudio.eclipse.jaxws.project.nature");
			getModel().addToWorkingSet(project);
			project.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());

		} catch (CoreException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return true;
	}
	
	private class CodegenJob implements IRunnableWithProgress {

		public void run(IProgressMonitor monitor)
				throws InvocationTargetException, InterruptedException {
			String operationText="Generating server side code";
			monitor.beginTask(operationText, 100);
			monitor.subTask("Processing configuration...");
			monitor.worked(10);
			try {
				monitor.subTask("Generating code...");
				//IVMInstall vmInstall= JavaRuntime.getDefaultVMInstall();
	            String s = null;

		        String sourcePkg = jaxwsModel.getSourcePackage();
				String wsdlFile = jaxwsModel.getImportFile().getAbsolutePath();
	            
	            String cmd = "wsimport -keep -Xnocompile -p " + sourcePkg + " " + wsdlFile;
	            Process p = Runtime.getRuntime().exec(cmd,new String[]{},sourceFolder.getLocation().toFile());
	            
	            BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));
	            BufferedReader stdError = new BufferedReader(new InputStreamReader(p.getErrorStream()));

	            while ((s = stdInput.readLine()) != null) {
	            	monitor.subTask(s);
	            }
	            
	            while ((s = stdError.readLine()) != null) {
	                System.out.println(s);
	            }
	            
	            project.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
	            
				monitor.worked(75);	
				
				IFolder sourceDir = sourceFolder.getFolder(sourcePkg.replace('.', '/'));
				IPackageFragment jPackage = javaProject.findPackageFragment(sourceDir.getFullPath());
				
				  for (final ICompilationUnit compilationUnit : jPackage.getCompilationUnits()) {
					  IType[] types = compilationUnit.getTypes();
					  for(IType type: types){
						  IAnnotation annotation = type.getAnnotation("WebService");
						  System.out.println(type.getFullyQualifiedName());
						  if (annotation.exists()) { 
							  //TODO:
						  }
						  else{
							  //TODO:
						  }
					  }
				  }

				monitor.worked(10);
				monitor.subTask("Refreshing project...");
				monitor.worked(5);
				monitor.done();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public void setjaxwsModel(JaxwsModel jaxwsModel) {
		this.jaxwsModel = jaxwsModel;
	}

	public JaxwsModel getJaxwsModel() {
		return jaxwsModel;
	}
	
	public void addPages() {
		super.addPages();
	}

	
	public IResource getCreatedResource() {
		return null;
	}

}
