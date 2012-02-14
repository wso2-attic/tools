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

package org.wso2.carbonstudio.eclipse.utils.wst;

import java.util.ArrayList;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jst.ws.internal.common.J2EEUtils;

public class WebUtils {
	public static boolean isDynamicWebProject(IProject containerProject){
		boolean isWebProject=false;
		try {
			if(containerProject.isOpen()){
			for(String natureId:containerProject.getDescription().getNatureIds()){
				isWebProject=natureId.startsWith("org.eclipse.wst");
				if (isWebProject) {
				   break;
				}
			}
			}
		} catch (CoreException e) {
			e.printStackTrace();
		}
		return isWebProject;
	}
	
	public static IFolder pathToWebProjectContainer(IProject project) {
		IPath currentDynamicWebProjectDir = J2EEUtils.getWebContentPath(project);
		return ResourcesPlugin.getWorkspace().getRoot().getFolder(currentDynamicWebProjectDir);
	}
	
	public static IFolder getAxis2WebContainerWEB_INFPath(IProject project){
		return  pathToWebProjectContainer(project).getFolder(WebConstants.DIR_WEB_INF);
	}
	
	public static IFolder getAxis2WebContainerWEB_INFServicesFolderPath(IProject project){
		return  getAxis2WebContainerWEB_INFPath(project).getFolder(Axis2Constants.DIR_SERVICES);
	}
}
