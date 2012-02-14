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

package org.wso2.carbonstudio.eclipse.capp.artifact.axis2.ui.actions;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.ws.java2wsdl.Java2WSDLCodegenEngine;
import org.apache.ws.java2wsdl.utils.Java2WSDLCommandLineOption;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.ui.dialogs.WorkspaceResourceDialog;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.internal.ObjectPluginAction;
import org.wso2.carbonstudio.eclipse.capp.artifact.axis2.Activator;
import org.wso2.carbonstudio.eclipse.capp.artifact.axis2.core.Axis2Artifact;
import org.wso2.carbonstudio.eclipse.logging.core.ICarbonStudioLog;
import org.wso2.carbonstudio.eclipse.logging.core.Logger;
import org.wso2.carbonstudio.eclipse.utils.archive.ArchiveManipulator;
import org.wso2.carbonstudio.eclipse.utils.file.FileUtils;
import org.wso2.carbonstudio.eclipse.utils.jdt.JavaUtils;
import org.wso2.carbonstudio.eclipse.utils.wst.Axis2ServiceUtils;

public class WSDLGenerationAction implements IObjectActionDelegate {
	private static ICarbonStudioLog log = Logger.getLog(Activator.PLUGIN_ID);

	private IFile file;
	private Shell shell;

	protected static File generateWSDLFromJavaClass(String serviceName, File classpathLocation,
	        String serviceClassName) throws Exception {
		File file = FileUtils.createTempFile();
		Map<String, Java2WSDLCommandLineOption> map =
		        new HashMap<String, Java2WSDLCommandLineOption>();
		addCommandLineOption(map, Java2WSDLCommandLineOption.OUTPUT_LOCATION_OPTION,
		                     new String[] { file.getParentFile().toString() });
		addCommandLineOption(map, Java2WSDLCommandLineOption.SERVICE_NAME_OPTION,
		                     new String[] { serviceName });
		addCommandLineOption(map, Java2WSDLCommandLineOption.WSDL_VERSION_OPTION,
		                     new String[] { Java2WSDLCommandLineOption.WSDL_VERSION_1 });
		addCommandLineOption(map, Java2WSDLCommandLineOption.OUTPUT_FILENAME_OPTION,
		                     new String[] { file.getName() });
		addCommandLineOption(map, Java2WSDLCommandLineOption.CLASSPATH_OPTION,
		                     new String[] { classpathLocation.toString() });
		addCommandLineOption(map, Java2WSDLCommandLineOption.CLASSNAME_OPTION,
		                     new String[] { serviceClassName });
		Java2WSDLCodegenEngine java2wsdlCodegenEngine = new Java2WSDLCodegenEngine(map);
		java2wsdlCodegenEngine.generate();
		return file;
	}

	private static Java2WSDLCommandLineOption addCommandLineOption(
	        Map<String, Java2WSDLCommandLineOption> map, String option, String[] optionValues) {
		return map.put(option, new Java2WSDLCommandLineOption(option, optionValues));
	}

	public void selectionChanged(IAction action, ISelection arg1) {
		Object selections = deriveSelection(arg1);
		if (selections != null && (selections instanceof IFile)) {
			IFile file = (IFile) selections;
			this.setFile(file);
		}
	}

	public static Object deriveSelection(Object arg) {
		if (arg instanceof ObjectPluginAction) {
			ObjectPluginAction obj = (ObjectPluginAction) arg;
			arg = obj.getSelection();
		}
		if (arg instanceof TreeSelection) {
			TreeSelection tree = (TreeSelection) arg;
			return tree.getFirstElement();
		}
		return null;
	}

	public void setActivePart(IAction arg0, IWorkbenchPart arg1) {
		setShell(arg1.getSite().getShell());
	}

	public void run(IAction action) {
		if (getFile() != null) {
			try {
				File classpathLocation = null;
				String serviceName = null;
				String serviceClassName = null;
				if (getFile().getLocation().getFileExtension().equalsIgnoreCase("aar")) {
					ArchiveManipulator archiveManipulator = new ArchiveManipulator();
					File tempDir = FileUtils.createTempDirectory();
					archiveManipulator.extract(getFile().getLocation().toOSString(), tempDir.toString());
					classpathLocation = tempDir;
					serviceName = Axis2ServiceUtils.getServiceNameFromFolder(tempDir.toString());
					serviceClassName = Axis2ServiceUtils.getServiceClassNameFromFolder(tempDir.toString());
				} else if (getFile().getLocation().getFileExtension().equalsIgnoreCase("service")) {
					Axis2Artifact axis2Artifact = new Axis2Artifact(getFile().getLocation().toFile());
					axis2Artifact.init();
					File buildProject = JavaUtils.buildProject(axis2Artifact.getProject());
					classpathLocation = buildProject;
					IFolder folder = getFile().getParent().getFolder(new Path("resources"));
					serviceName = Axis2ServiceUtils.getServiceNameFromFolder(folder.getLocation().toOSString());
					serviceClassName = Axis2ServiceUtils.getServiceClassNameFromFolder(folder.getLocation().toOSString());
				}
				
				if (classpathLocation != null && serviceName != null && serviceClassName != null) {
					generate(getShell(), serviceName, classpathLocation, serviceClassName);
				}
			} catch (Exception e) {
				log.error(e);
				MessageDialog.openError(getShell(), "Generation", "Error occured in the generation process: "+e.getMessage());
			}
		}
	}
	
	protected void generate(Shell shell, String serviceName, File classpathLocation,
	        String serviceClassName) throws Exception {
		IPath defaultWSDLName = getFile().getParent().getFullPath().append(serviceName+".wsdl");
		IFile openNewFile = WorkspaceResourceDialog.openNewFile(shell, "WSDL for "+serviceName, "Select name and location for the WSDL file", defaultWSDLName, null);
		if (openNewFile.exists()){
			if (!MessageDialog.openQuestion(shell, "Overwrite File", "The specified file already exists. Overwrite?")){
				return;
			}
		}
//		workspaceResourceDialog.open();
		File wsdlFile = generateWSDLFromJavaClass(serviceName, classpathLocation, serviceClassName);
		if (openNewFile.exists()){
			openNewFile.setContents(new FileInputStream(wsdlFile), IResource.FORCE, null);
		}else{
			openNewFile.create(new FileInputStream(wsdlFile), true, null);
		}
	}

	protected void setShell(Shell shell) {
		this.shell = shell;
	}

	protected Shell getShell() {
		return shell;
	}

	protected void setFile(IFile file) {
		this.file = file;
	}

	protected IFile getFile() {
		return file;
	}
}
