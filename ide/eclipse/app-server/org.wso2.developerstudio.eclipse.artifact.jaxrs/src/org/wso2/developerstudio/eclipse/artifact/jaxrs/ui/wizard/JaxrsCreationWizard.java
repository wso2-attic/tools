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

package org.wso2.developerstudio.eclipse.artifact.jaxrs.ui.wizard;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.osgi.framework.Bundle;
import org.wso2.developerstudio.eclipse.artifact.jaxrs.model.JaxrsProjectModel;
import org.wso2.developerstudio.eclipse.artifact.jaxrs.Activator;
import org.wso2.developerstudio.eclipse.artifact.jaxrs.utils.JaxUtil;
import org.wso2.developerstudio.eclipse.artifact.jaxrs.utils.JaxUtil.CxfServlet;
import org.wso2.developerstudio.eclipse.libraries.utils.LibraryUtils;
import org.wso2.developerstudio.eclipse.logging.core.IDeveloperStudioLog;
import org.wso2.developerstudio.eclipse.logging.core.Logger;
import org.wso2.developerstudio.eclipse.maven.util.MavenUtils;
import org.wso2.developerstudio.eclipse.platform.ui.wizard.AbstractWSO2ProjectCreationWizard;
import org.wso2.developerstudio.eclipse.utils.file.FileUtils;
import org.wso2.developerstudio.eclipse.utils.jdt.JavaUtils;
import org.wso2.developerstudio.eclipse.utils.project.ProjectUtils;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.ui.JavaUI;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;

public class JaxrsCreationWizard  extends AbstractWSO2ProjectCreationWizard{
	private static final String JAXRS_PROJECT_NATURE = "org.wso2.developerstudio.eclipse.jaxrs.project.nature";
	private static final String CXF_CLASSLOADING_DESCRIPTOR = "webapp-classloading.xml";
	private static IDeveloperStudioLog log=Logger.getLog(Activator.PLUGIN_ID);
	private JaxrsProjectModel model;
	IProject project;
	IFolder sourceFolder;
	IFolder webappFolder; 
	IFolder webINF;
	IFolder resourceFolder;
	IJavaProject javaProject;
	IPackageFragmentRoot root;
	
	public JaxrsCreationWizard(){
		setProjectModel(new JaxrsProjectModel());
		setModel(getProjectModel());
		setWindowTitle("Create New JAX-RS Service");
		setDefaultPageImageDescriptor(Activator.getImageDescriptor("icons/JAX-RS-wizard.png"));
	}
	
	
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		super.init(workbench, selection);
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
			IFolder metaINF = ProjectUtils.getWorkspaceFolder(project, "src", "main", "webapp","META-INF");
			Bundle bundle = Activator.getDefault().getBundle();
			IPath resourcePath=new Path("src"+File.separator+"main"+File.separator+"resources"+File.separator+CXF_CLASSLOADING_DESCRIPTOR);
			URL[] urls = FileLocator.findEntries(bundle, resourcePath);
			if(urls!=null && urls.length>0){
				File classLoadingFile = new File(FileLocator.toFileURL(urls[0]).getFile());
				FileUtils.copy(classLoadingFile, new File(metaINF.getLocation().toFile(),CXF_CLASSLOADING_DESCRIPTOR));
			}
			IFile webXML = webINF.getFile("web.xml");
			IFile cxfServletXML = webINF.getFile("cxf-servlet.xml");
			webXML.create(new ByteArrayInputStream(JaxUtil.getCXFWebConfig().getBytes()), true, null);
			JaxUtil.CxfServlet cxfServlet = new JaxUtil.CxfServlet();
			cxfServletXML.create(new ByteArrayInputStream(cxfServlet.toString().getBytes()), true, null);
			project.refreshLocal(IResource.DEPTH_INFINITE,new NullProgressMonitor());
			cxfServlet = new JaxUtil.CxfServlet();
			cxfServlet.deserialize(cxfServletXML);
			
			ICompilationUnit serviceClass = createServiceClass(project, cxfServlet, model.getServiceClassPackage(),
					model.getServiceClass());
			String content = cxfServlet.toString().replaceAll("xmlns=\"\"",""); 
			cxfServletXML.setContents(new ByteArrayInputStream(content.getBytes()), IResource.FORCE, null);
			
			File pomfile = project.getFile("pom.xml").getLocation().toFile();
			getModel().getMavenInfo().setPackageName("war");
			createPOM(pomfile);
			project.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
			JavaUtils.addJarLibraryToProject(javaProject,
					LibraryUtils.getDependencyPath(JaxUtil.getJsr311LibraryName()));
			ProjectUtils.addNatureToProject(project,
			                                false,
											JAXRS_PROJECT_NATURE);
			MavenUtils
			.updateWithMavenEclipsePlugin(
					pomfile,
					new String[] { JDT_BUILD_COMMAND },
					new String[] {
							JAXRS_PROJECT_NATURE,
							JDT_PROJECT_NATURE });
			getModel().addToWorkingSet(project);
			project.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
			refreshDistProjects();
			
			if (serviceClass != null) {
				serviceClass.getJavaProject().getProject()
						.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
				try {
					IEditorPart javaEditor = JavaUI.openInEditor(serviceClass);
					JavaUI.revealInEditor(javaEditor, (IJavaElement) serviceClass);
				} catch (Exception e) { /* ignore */
				}
			}
		}  catch (CoreException e) {
			log.error("CoreException has occurred", e);
		} catch (IOException e) {
			log.error("I/O error has occurred", e);
		} catch (Exception e) {
			log.error("An unexpected error has occurred", e);
		}

		return true;
	}
	
	
	
	
	private ICompilationUnit createServiceClass(IProject project, CxfServlet cxfServlet,
			String packageName, String className) throws CoreException {
		IJavaProject javaProject = JavaCore.create(project);
		IPackageFragmentRoot root = javaProject.getPackageFragmentRoot(sourceFolder);
		IPackageFragment sourcePackage = root.createPackageFragment(packageName, false, null);
		StringBuffer buffer = new StringBuffer();
		if (!packageName.equalsIgnoreCase("")) {
			buffer.append("package " + packageName + ";\n");
			buffer.append("\n");
		}
		buffer.append("import javax.ws.rs.*;\n");
		buffer.append("\n");
		buffer.append("@Path(\"/\")\n" + "public class "
				+ className + " {\n\n");
		buffer.append("\n}");
		ICompilationUnit cu = sourcePackage.createCompilationUnit(className + ".java",
				buffer.toString(), false, null);
		String address = "/" + cu.getTypes()[0].getElementName();
		address = address.replaceAll("([A-Z])", "_$1"); // split CamelCase
		address = address.replaceAll("^/_", "/");
		address = address.toLowerCase();
		String beanClass = cu.getTypes()[0].getFullyQualifiedName();
		cxfServlet.addServer(cu.getTypes()[0].getElementName(), null, address, beanClass);
		return cu;
	}


	public void setProjectModel(JaxrsProjectModel model) {
		this.model = model;
	}

	public JaxrsProjectModel getProjectModel() {
		return model;
	}
	
	public IResource getCreatedResource() {
		return null;
	}

}
