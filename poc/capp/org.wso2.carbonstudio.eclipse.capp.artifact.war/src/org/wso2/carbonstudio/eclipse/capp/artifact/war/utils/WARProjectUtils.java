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

package org.wso2.carbonstudio.eclipse.capp.artifact.war.utils;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.namespace.QName;

import org.apache.axiom.om.OMAbstractFactory;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMFactory;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.wso2.carbonstudio.eclipse.capp.artifact.war.Activator;
import org.wso2.carbonstudio.eclipse.capp.core.artifacts.configure.ICAppProjectSettings;
import org.wso2.carbonstudio.eclipse.capp.core.data.CAppProperty;
import org.wso2.carbonstudio.eclipse.logging.core.ICarbonStudioLog;
import org.wso2.carbonstudio.eclipse.logging.core.Logger;

public class WARProjectUtils {
	private static ICarbonStudioLog log=Logger.getLog(Activator.PLUGIN_ID);

	public static void createDirectory(IProject project, List<String> foldersToCreate)
	                                                                                  throws CoreException {
		ArrayList<String> missingParent = new ArrayList<String>();
		for (String folderName : foldersToCreate) {
			IFolder folder = project.getFolder(folderName);
			if (!folder.exists()) {
				if (folder.getParent().exists()) {
					folder.create(IResource.NONE, true, null);
				} else {
					missingParent.add(folderName);
				}
			}
		}
		if (missingParent.size() > 0) {
			createDirectory(project, missingParent);
		}
	}

	public static void createDirectory(IProject project, String path) throws CoreException {
		String[] pathElements = path.split("/");
		List<String> paths=new ArrayList<String>();
		String lastPath="";
		for (String pathElement : pathElements) {
	        lastPath=lastPath+pathElement+"/";
	        paths.add(lastPath);
        }
		createDirectory(project, paths);
	}
	
	public static void deleteDirectory(IFolder folder){
		if (folder.exists()){
			try {
	            folder.delete(true, null);
            } catch (CoreException e) {
	            log.error(e);
            }
		}
			
	}
	
	public static List<CAppProperty> getProjectWARPaths(ICAppProjectSettings projectSettings){
		List<CAppProperty> paths = new ArrayList<CAppProperty>();
		Object rawSettings = projectSettings.getSettings(SettingsConstants.ID);
		if (rawSettings==null)
			return paths;
		OMElement settings = (OMElement) rawSettings;
		Iterator children = settings.getChildrenWithLocalName(SettingsConstants.ARTIFACT_PATH);
		while(children.hasNext()){
			OMElement child=(OMElement)children.next();
			paths.add(new CAppProperty(child.getLocalName(),child.getText()));
		}
		return paths;
	}
	
	
	public static boolean isClassNameValid(String fullyQualifiedClassName){
		//FIXME need a regular expression to test this
		return !fullyQualifiedClassName.equals("");
	}

	public static File buildProject(IProject project) throws CoreException{
		project.build(IncrementalProjectBuilder.CLEAN_BUILD, new NullProgressMonitor());
		project.build(IncrementalProjectBuilder.FULL_BUILD, new NullProgressMonitor());
		return new File(project.getWorkspace().getRoot().getFolder(getJavaOutputDirectory(project)).getLocation().toOSString());
	}
	
	private static IPath getJavaOutputDirectory(IProject project){
		IPath outputLocation = null;
		try {
			IJavaProject javaProject = JavaCore.create(project);
			if (javaProject != null) {
				outputLocation = javaProject.getOutputLocation();
			}
		} catch (JavaModelException e) {
		}
		return outputLocation;
	}
}
