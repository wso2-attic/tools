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

package org.wso2.carbonstudio.eclipse.capp.artifact.registry.utils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.axiom.om.OMElement;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.wso2.carbonstudio.eclipse.capp.artifact.registry.Activator;
import org.wso2.carbonstudio.eclipse.capp.core.artifacts.configure.ICAppProjectSettings;
import org.wso2.carbonstudio.eclipse.capp.core.data.CAppProperty;
import org.wso2.carbonstudio.eclipse.capp.core.utils.Constants;
import org.wso2.carbonstudio.eclipse.logging.core.ICarbonStudioLog;
import org.wso2.carbonstudio.eclipse.logging.core.Logger;

public class RegistryProjectUtils {
	private static ICarbonStudioLog log=Logger.getLog(Activator.PLUGIN_ID);

	public static void createDirectory(IProject project,
			List<String> foldersToCreate) throws CoreException {
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

	public static void createDirectory(IProject project, String path)
			throws CoreException {
		String[] pathElements = path.split("/");
		List<String> paths = new ArrayList<String>();
		String lastPath = "";
		for (String pathElement : pathElements) {
			lastPath = lastPath + pathElement + "/";
			paths.add(lastPath);
		}
		createDirectory(project, paths);
	}

	public static List<CAppProperty> getProjectRegistryPaths(
			ICAppProjectSettings projectSettings) {
		List<CAppProperty> paths = new ArrayList<CAppProperty>();
		Object rawSettings = projectSettings.getSettings(Constants.ID);
		if (rawSettings == null)
			return paths;
		OMElement settings = (OMElement) rawSettings;
		Iterator children = settings
				.getChildrenWithLocalName(Constants.ARTIFACT_PATH);
		while (children.hasNext()) {
			OMElement child = (OMElement) children.next();
			paths.add(new CAppProperty(child.getLocalName(), child.getText()));
		}
		return paths;
	}

	public static void addProjectRegistryPathToSettings(
			ICAppProjectSettings projectSettings, String path) {
//		List<CAppProperty> paths = new ArrayList<CAppProperty>();
//		Object rawSettings = projectSettings.getSettings(RegistryConstants.ID);
//		OMElement settings;
//		OMFactory factory = OMAbstractFactory.getOMFactory();
//		if (rawSettings == null) {
//			settings = factory.createOMElement(new QName(RegistryConstants.ID));
//		} else {
//			settings = (OMElement) rawSettings;
//		}
//		OMElement pathElement = factory.createOMElement(new QName(
//				RegistryConstants.ARTIFACT_PATH));
//		pathElement.setText(path);
//		settings.addChild(pathElement);
//		projectSettings.setSettings(RegistryConstants.ID, settings);
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
	
	public static void removeProjectRegistryPathFromSettings(ICAppProjectSettings projectSettings, String path){
//		List<CAppProperty> paths = new ArrayList<CAppProperty>();
//		Object rawSettings = projectSettings.getSettings(RegistryConstants.ID);
//		OMElement settings;
//		OMFactory factory = OMAbstractFactory.getOMFactory();
//		if (rawSettings==null){
//			return;
//		}else{
//			settings = (OMElement) rawSettings;
//		}
//		Iterator<OMElement> children = settings.getChildrenWithLocalName(RegistryConstants.ARTIFACT_PATH);
//		while(children.hasNext()){
//			OMElement child=children.next();
//			String attributeValue = child.getText();
//			if (attributeValue.equals(path)){
//				child.detach();
//				break;
//			}
//		}
//		projectSettings.setSettings(RegistryConstants.ID, settings);
	}
}
