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

package org.wso2.carbonstudio.eclipse.utils.project;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;

public class ProjectUtils {
	public static void addNatureToProject(IProject project,String natureId, boolean addToEnd) throws CoreException{
		IProjectDescription description = project.getDescription();
		String[] natures = description.getNatureIds();
		ArrayList<String> arrayList = new ArrayList<String>();
		if (addToEnd){
    		arrayList.addAll(Arrays.asList(natures));
    		arrayList.add(natureId);
		}else{
    		arrayList.add(natureId);
    		arrayList.addAll(Arrays.asList(natures));
		}
		description.setNatureIds(arrayList.toArray(new String[]{}));
		project.setDescription(description, null);
	}
	
	public static IProject[] getProjectReferencesForService(IProject project)  throws CoreException {
        IProject[] projects = project.getDescription().getReferencedProjects();
        return projects;
	}
	
	public static boolean createFolder(IFolder folder) throws CoreException{
		if (folder.exists()){
			return true;
		}else{
			if (folder.getParent()!=null && folder.getParent().exists()){
				folder.create(true, true, null);
				return true;
			}else if (folder.getParent() instanceof IFolder && createFolder((IFolder)folder.getParent())){
				folder.create(true, true, null);
				return true;
			}
		}
		return false;
	}
	
	public static void buildProject(IProject project) throws CoreException{
		project.build(IncrementalProjectBuilder.CLEAN_BUILD, new NullProgressMonitor());
		project.build(IncrementalProjectBuilder.FULL_BUILD, new NullProgressMonitor());
	}
	
	
	public static URL getPluginResource(Bundle bundle, String resourcePath){
		return bundle.getResource(resourcePath);
	}
	
	public static URL getPluginResource(String bundleSymbolicName, String resourcePath){
		return getPluginResource(Platform.getBundle(bundleSymbolicName),resourcePath);
	}
	

	public static void moveProjectNatureToBegining(IProject project,
			String projectNature) throws CoreException {
		List<String> newNaturesList = new ArrayList<String>();
		newNaturesList.add(projectNature);
		newNaturesList = getProjectNaturesExcludingNature(project,
				projectNature, newNaturesList);
		setProjectNatures(project, newNaturesList);
	}

	private static void setProjectNatures(IProject project,
			List<String> newNaturesList) throws CoreException {
		IProjectDescription description = project.getDescription();
		description.setNatureIds(newNaturesList.toArray(new String[] {}));
		project.setDescription(description, null);
	}

	public static void moveProjectNatureToTheEnd(IProject project,
			String projectNature) throws CoreException {
		List<String> newNaturesList = getProjectNaturesExcludingNature(project,
				projectNature);
		newNaturesList.add(projectNature);
		setProjectNatures(project, newNaturesList);
	}

	private static List<String> getProjectNaturesExcludingNature(
			IProject project, String projectNature,
			List<String> existingNatureList) throws CoreException {
		IProjectDescription description = project.getDescription();
		String[] natures = description.getNatureIds();
		for (String nature : natures) {
			if (!projectNature.equals(nature)) {
				existingNatureList.add(nature);
			}
		}
		return existingNatureList;
	}

	private static List<String> getProjectNaturesExcludingNature(
			IProject project, String projectNature) throws CoreException {
		List<String> existingNatureList = new ArrayList<String>();
		IProjectDescription description = project.getDescription();
		String[] natures = description.getNatureIds();
		for (String nature : natures) {
			if (!projectNature.equals(nature)) {
				existingNatureList.add(nature);
			}
		}
		return existingNatureList;
	}

}
