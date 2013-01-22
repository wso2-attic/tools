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

package org.wso2.developerstudio.eclipse.artifact.sequence.validators;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.wso2.developerstudio.eclipse.artifact.sequence.Activator;
import org.wso2.developerstudio.eclipse.logging.core.IDeveloperStudioLog;
import org.wso2.developerstudio.eclipse.logging.core.Logger;
import org.wso2.developerstudio.eclipse.platform.core.model.AbstractListDataProvider;
import org.wso2.developerstudio.eclipse.platform.core.project.model.ProjectDataModel;
import org.wso2.developerstudio.eclipse.utils.file.FileUtils;
import org.wso2.developerstudio.eclipse.utils.project.ProjectUtils;

public class AvailableEPList extends AbstractListDataProvider{

	private static IDeveloperStudioLog log=Logger.getLog(Activator.PLUGIN_ID);

	private static List<String> skipList = new ArrayList<String>();

	static {
		skipList.add("target");
		skipList.add(".svn");
	}

	public List<ListData> getListData(String modelProperty,
			ProjectDataModel model) {
		List<ListData> list = new ArrayList<ListData>();
		list.add(createListData("", ""));
		try {
			List<File> availableEPs = getAvailableEPs();
			for (File file : availableEPs) {
				list.add(createListData(ProjectUtils.fileNameWithoutExtension(file.getName()), file));
			}
		} catch (CoreException e) {
			log.error("An unexpected error has occurred", e);
		} catch (IOException e) {
			log.error("I/O error has occurred", e);
		}
		return list;
	}
	
	public List<File> getAvailableEPs() throws CoreException, IOException{
		List<File> availableEPList = new ArrayList<File>();
		List<File> allMatchingFiles = new ArrayList<File>();
		IProject[] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
		for (IProject workspaceProject : projects) {
			if (workspaceProject.isOpen()) {
				if (workspaceProject
						.hasNature("org.wso2.developerstudio.eclipse.esb.project.nature")) {
					File[] allFiles = FileUtils.getAllExactMatchingFiles(
							workspaceProject.getLocation().toOSString(), null,
							"xml", allMatchingFiles,skipList);
					
					allMatchingFiles.addAll(Arrays.asList(allFiles));
				}
			}
		}
		
		for (File xmlFile : allMatchingFiles) {
			String content = FileUtils.getContentAsString(xmlFile);
			if(content.contains("<endpoint xmlns=")){
				if(!availableEPList.contains(xmlFile)){
					availableEPList.add(xmlFile);
				}
			}
		}
		
		return availableEPList;
	}

}
