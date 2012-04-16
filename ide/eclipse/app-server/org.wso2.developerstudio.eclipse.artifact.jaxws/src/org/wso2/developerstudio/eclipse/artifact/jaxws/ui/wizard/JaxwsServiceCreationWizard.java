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
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.wso2.developerstudio.eclipse.artifact.jaxws.Activator;
import org.wso2.developerstudio.eclipse.artifact.jaxws.model.JaxwsModel;
import org.wso2.developerstudio.eclipse.artifact.jaxws.utils.JaxUtil;
import org.wso2.developerstudio.eclipse.artifact.jaxws.utils.JaxWSImageUtils;
import org.wso2.developerstudio.eclipse.logging.core.IDeveloperStudioLog;
import org.wso2.developerstudio.eclipse.logging.core.Logger;
import org.wso2.developerstudio.eclipse.platform.ui.wizard.AbstractWSO2ProjectCreationWizard;
import org.wso2.developerstudio.eclipse.utils.jdt.JavaUtils;
import org.wso2.developerstudio.eclipse.utils.project.ProjectUtils;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbench;
import org.eclipse.jdt.launching.IVMInstall;
import org.eclipse.jdt.launching.JavaRuntime;

public class JaxwsServiceCreationWizard  extends AbstractWSO2ProjectCreationWizard{
	private static IDeveloperStudioLog log=Logger.getLog(Activator.PLUGIN_ID);
	private JaxwsModel jaxwsModel;
	IProject project;
	IFolder sourceFolder;
	IFolder webappFolder; 
	IFolder webINF;
	IFolder resourceFolder;
	IJavaProject javaProject;
	IPackageFragmentRoot root;
	
	public JaxwsServiceCreationWizard(){
		setjaxwsModel(new JaxwsModel());
		setModel(getJaxwsModel());
		setWindowTitle("Create New JAX-WS Service");
		setDefaultPageImageDescriptor(JaxWSImageUtils.getInstance().getImageDescriptor("JAX-WS-wizard.png"));
	}
	
	
	public void init(IWorkbench arg0, IStructuredSelection selection) {
		super.init(arg0, selection);
	}
	
	public boolean performFinish() {
		try {
			project = createNewProject();
			sourceFolder =ProjectUtils.getWorkspaceFolder(project, "src", "main", "java");
			webappFolder = ProjectUtils.getWorkspaceFolder(project, "src", "main", "webapp");
			webINF = ProjectUtils.getWorkspaceFolder(project, "src", "main", "webapp","WEB-INF");
			resourceFolder = ProjectUtils.getWorkspaceFolder(project, "src", "main", "resources");
			javaProject = JavaCore.create(project);
			root = javaProject.getPackageFragmentRoot(sourceFolder);
			
			JavaUtils.addJavaSupportAndSourceFolder(project, sourceFolder);
			ProjectUtils.createFolder(webappFolder);
			ProjectUtils.createFolder(webINF);
			ProjectUtils.createFolder(resourceFolder);
			IFile webXML = webINF.getFile("web.xml");
			IFile cxfServletXML = webINF.getFile("cxf-servlet.xml");
			webXML.create(new ByteArrayInputStream(JaxUtil.getCXFWebConfig().getBytes()), true, null);
			JaxUtil.CxfServlet cxfServlet = new JaxUtil.CxfServlet();
			cxfServletXML.create(new ByteArrayInputStream(cxfServlet.toString().getBytes()), true, null);
			project.refreshLocal(IResource.DEPTH_INFINITE,new NullProgressMonitor());
			cxfServlet = new JaxUtil.CxfServlet();
			cxfServlet.deserialize(cxfServletXML);
			
			if (getModel().getSelectedOption().equals("new.jaxws")) {
				
				
				} else if (getModel().getSelectedOption().equals("import.jaxwswsdl")) {
				ProgressMonitorDialog progressMonitorDialog = new ProgressMonitorDialog(getShell());
				progressMonitorDialog.create();
				progressMonitorDialog.open();
				progressMonitorDialog.run(false, false, new CXFCodegenJob());
				
				project.refreshLocal(IResource.DEPTH_INFINITE,new NullProgressMonitor());
			}

			File pomfile = project.getFile("pom.xml").getLocation().toFile();
			getModel().getMavenInfo().setPackageName("war");
			createPOM(pomfile);
			ProjectUtils.addNatureToProject(project,
			                                false,
											"org.wso2.developerstudio.eclipse.jaxws.project.nature");
			getModel().addToWorkingSet(project);
			project.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());

		}  catch (CoreException e) {
			log.error("CoreException has occurred", e);
		} catch (IOException e) {
			log.error("I/O error has occurred", e);
		} catch (Exception e) {
			log.error("An unexpected error has occurred", e);
		}

		return true;
	}
	
	
	private class CXFCodegenJob implements IRunnableWithProgress {

		public void run(IProgressMonitor monitor)
				throws InvocationTargetException, InterruptedException {
			String operationText="Generating server side code";
			monitor.beginTask(operationText, 100);
			monitor.subTask("Processing configuration...");
			monitor.worked(10);
			try {
				monitor.subTask("Generating code...");
				IVMInstall vmInstall= JavaRuntime.getDefaultVMInstall();
	            String s = null;
	            String shell =null;
	            String wsdl2java = null;
		        String sourcePkg = jaxwsModel.getSourcePackage();
		        String sourceDir = sourceFolder.getLocation().toFile().toString();
				String wsdlFile = jaxwsModel.getImportFile().getAbsolutePath();
				String os = System.getProperty("os.name").toLowerCase();
				ProcessBuilder pb=null;
				
				if(os.indexOf("win") >= 0){
					shell = "cmd.exe /c";
					wsdl2java = "wsdl2java.bat";
				} else {
					shell = "sh";
					wsdl2java = "wsdl2java";
				}
				
				if(sourcePkg!=null && sourcePkg.trim().length()>0){
					pb = new ProcessBuilder(shell, wsdl2java, "-impl", "-server", "-p",sourcePkg, "-d",sourceDir,wsdlFile);
				} else {
					pb = new ProcessBuilder(shell, wsdl2java, "-impl", "-server", "-d",sourceDir,wsdlFile);
				}
				
				 Map<String, String> env = pb.environment();
				 env.put("CXF_HOME", jaxwsModel.getCXFRuntime());
				 env.put("JAVA_HOME", vmInstall.getInstallLocation().toString());
				 pb.directory(new File(jaxwsModel.getCXFRuntime() + File.separator + "bin" ));
				 Process p = pb.start();
	            
	            BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));
	            BufferedReader stdError = new BufferedReader(new InputStreamReader(p.getErrorStream()));

	            while ((s = stdInput.readLine()) != null) {
	            	monitor.subTask(s);
	            }
	            
	            while ((s = stdError.readLine()) != null) {
	            	log.error(s);
	            }
	            
	            project.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
	            
				monitor.worked(75);	

				monitor.worked(10);
				monitor.subTask("Refreshing project...");
				monitor.worked(5);
				monitor.done();
			} catch (Exception e) {
				throw new InvocationTargetException(e);
			}
		}
		
	}
	
	public void setjaxwsModel(JaxwsModel jaxwsModel) {
		this.jaxwsModel = jaxwsModel;
	}

	public JaxwsModel getJaxwsModel() {
		return jaxwsModel;
	}
	
	public IResource getCreatedResource() {
		return null;
	}

}
