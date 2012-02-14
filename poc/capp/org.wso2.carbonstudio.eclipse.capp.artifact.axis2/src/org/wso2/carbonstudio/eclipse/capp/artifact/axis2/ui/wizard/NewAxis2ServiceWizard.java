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

package org.wso2.carbonstudio.eclipse.capp.artifact.axis2.ui.wizard;

import java.io.ByteArrayInputStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.internal.core.SourceType;
import org.eclipse.jdt.internal.ui.wizards.JavaProjectWizard;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.wso2.carbonstudio.eclipse.capp.artifact.axis2.Activator;
import org.wso2.carbonstudio.eclipse.capp.artifact.axis2.core.Axis2ArtifactHandler;
import org.wso2.carbonstudio.eclipse.capp.artifact.axis2.model.Axis2ArtifactLocationNode;
import org.wso2.carbonstudio.eclipse.capp.artifact.axis2.model.Axis2SourceDescriptor;
import org.wso2.carbonstudio.eclipse.capp.artifact.axis2.utils.Axis2ProjectUtils;
import org.wso2.carbonstudio.eclipse.capp.artifact.axis2.utils.Axis2ServiceSourceDescriptorUtils;
import org.wso2.carbonstudio.eclipse.capp.artifact.axis2.utils.SettingsConstants;
import org.wso2.carbonstudio.eclipse.logging.core.ICarbonStudioLog;
import org.wso2.carbonstudio.eclipse.logging.core.Logger;

/**
 * @deprecated
 * @author saminda
 *
 */
public class NewAxis2ServiceWizard extends Wizard implements INewWizard {
	private static ICarbonStudioLog log=Logger.getLog(Activator.PLUGIN_ID);

	private NewAxis2ServiceWizardPage newAxis2ServiceWizardPage;
	private IProject selectedProject;
	private Axis2ArtifactLocationNode selectedLocationNode;
	
	/**
     * @return the selectedProject
     */
    public IProject getSelectedProject() {
    	return selectedProject;
    }

	/**
     * @param selectedProject the selectedProject to set
     */
    public void setSelectedProject(IProject selectedProject) {
    	this.selectedProject = selectedProject;
    }

	/**
     * @return the selectedLocationNode
     */
    public Axis2ArtifactLocationNode getSelectedLocationNode() {
    	return selectedLocationNode;
    }

	/**
     * @param selectedLocationNode the selectedLocationNode to set
     */
    public void setSelectedLocationNode(Axis2ArtifactLocationNode selectedLocationNode) {
    	this.selectedLocationNode = selectedLocationNode;
    }

	public boolean performFinish() {
		IProject serviceProject = newAxis2ServiceWizardPage.getServiceProject();
		String className = newAxis2ServiceWizardPage.getClassName();
		if (serviceProject==null){
			JavaProjectWizard javaProjectWizard = new JavaProjectWizard();
			javaProjectWizard.init(PlatformUI.getWorkbench(),  null);
			javaProjectWizard.setForcePreviousAndNextButtons(true);
			WizardDialog wizardDialog = new WizardDialog(getShell(),javaProjectWizard);
			if (wizardDialog.open()==Window.OK){
				IJavaProject jp=(IJavaProject)javaProjectWizard.getCreatedElement();
				serviceProject=jp.getProject();
				String[] classNamePath = className.split("\\.");
				String packageName="";
				String classNameOnly=classNamePath[classNamePath.length-1];
				for(int i=0;i<classNamePath.length-1;i++){
					if (i==0){
						packageName+=classNamePath[i];
					}else{
						packageName+= ("." + classNamePath[i]);
					}
				}
//				IPackageFragment pack;
                try {
//	                pack = jp.getPackageFragmentRoots()[0].createPackageFragment(packageName, true, null);
	                IPath sourcePath = jp.getPackageFragmentRoots()[0].getPath().removeFirstSegments(1);
	                sourcePath=sourcePath.append(packageName.replaceAll("\\.", "/"));
	                Axis2ProjectUtils.createDirectory(serviceProject, sourcePath.toOSString());
	                IPath classPath = sourcePath.append(classNameOnly+".java");
	                IFile file = serviceProject.getFile(classPath);

	                file.create(new ByteArrayInputStream(("package "+packageName+";\n\npublic class "+classNameOnly+"{\n\n}").getBytes()), true, null);
//					pack.createCompilationUnit(className, "package "+packageName+"\n public class "+classNameOnly+"{\n}", false, null);
                } catch (CoreException e) {
	                log.error(e);
		            MessageDialog.openError(getShell(), "New Java Project", e.getMessage());
	                return false;
                }
			}else{
				return false;
			}
		}
		IProject selectedProject = newAxis2ServiceWizardPage.getSelectedProject();
		Axis2ArtifactLocationNode selectedPath = newAxis2ServiceWizardPage.getSelectedPath();
		String serviceName = newAxis2ServiceWizardPage.getServiceName();
		if (!selectedPath.isPathExist()){
			try {
				if (MessageDialog.openQuestion(getShell(), "Axis2 Source folder", "The source folder specified does not exist. Do you want to create it?")){
					Axis2ArtifactHandler.getCAppArtifactManager().createArtifactPath(selectedProject, SettingsConstants.ID, selectedPath.getSourceFolder());
				}else{
					return false;
				}
            } catch (Exception e) {
	            log.error(e);
	            MessageDialog.openError(getShell(), "Axis2 source folder", e.getMessage());
	            return false;
            }
		}
		Axis2SourceDescriptor axis2SourceDescriptor = new Axis2SourceDescriptor();
		axis2SourceDescriptor.setServiceName(serviceName);
		axis2SourceDescriptor.setServiceType("AXIS2");
		axis2SourceDescriptor.setClassName(className);
		axis2SourceDescriptor.setProjectName(serviceProject.getName());
		try {
	        axis2SourceDescriptor.setSourceType((SourceType)JavaCore.create(serviceProject).findType(className));
        } catch (JavaModelException e1) {
	        e1.printStackTrace();
        }
		IPath location = selectedPath.getSourceFolder().getLocation();
		IPath serviceLocation = location.append(serviceName+".service");
		Axis2ServiceSourceDescriptorUtils.saveAxis2SourceDescriptor(serviceLocation, axis2SourceDescriptor);
		try {
	        selectedProject.refreshLocal(IResource.DEPTH_INFINITE, null);
        } catch (CoreException e) {
	        log.error(e);
        }
		return true;
	}

    public void init(IWorkbench arg0, IStructuredSelection selection) {
    	if (selection.getFirstElement() instanceof Axis2ArtifactLocationNode){
    		selectedLocationNode=(Axis2ArtifactLocationNode)selection.getFirstElement();
    		selectedProject=selectedLocationNode.getProject();
    	} else if (selection.getFirstElement() instanceof IProject){
    		selectedProject=(IProject)selection.getFirstElement();
    	}
    }
    
	public void addPages() {
		newAxis2ServiceWizardPage = new NewAxis2ServiceWizardPage("New Axis2 Service",selectedProject,selectedLocationNode);
		addPage(newAxis2ServiceWizardPage);
	}

}
