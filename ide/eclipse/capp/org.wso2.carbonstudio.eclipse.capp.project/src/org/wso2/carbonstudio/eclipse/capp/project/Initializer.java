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

package org.wso2.carbonstudio.eclipse.capp.project;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Platform;
import org.eclipse.ui.IStartup;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.wso2.carbonstudio.eclipse.capp.project.manager.CAppArtifactManager;
import org.wso2.carbonstudio.eclipse.capp.project.utils.CAppUtils;
import org.wso2.carbonstudio.eclipse.logging.core.ICarbonStudioLog;
import org.wso2.carbonstudio.eclipse.logging.core.Logger;

public class Initializer implements IStartup {
	private static ICarbonStudioLog log=Logger.getLog(Activator.PLUGIN_ID);

	public void earlyStartup() {
		CAppArtifactManager.getInstance();
		String cappAutomateFilePath = System.getProperty("CAppBuildAutomate");
		if (cappAutomateFilePath!=null){
			File cappAutomateFile = new File(cappAutomateFilePath);
			if (cappAutomateFile.exists()){
				String loadProjectFilePath = System.getProperty("load_projects");
				if (loadProjectFilePath!=null){
					File loadProjectFile = new File(loadProjectFilePath);
					if (loadProjectFile.exists()){
						
					}
				}
				Properties cAppAutomateBuilderProperties = new Properties();
				try {
					cAppAutomateBuilderProperties.load(new FileInputStream(cappAutomateFile));
					String projectName = cAppAutomateBuilderProperties.getProperty("project");
					String path = cAppAutomateBuilderProperties.getProperty("path");
					IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
					if (project==null){
						log.error("Project "+projectName+" is not loaded to the workspace");
					}else{
						try {
							CAppUtils.generateCAR(path, project, false);
							String exit = cAppAutomateBuilderProperties.getProperty("exit");
							boolean isExit=(exit==null? false : exit.trim().equalsIgnoreCase("true"));
							if (isExit){
								System.exit(0);
//								PlatformUI.getWorkbench().close();
							}
						} catch (Exception e) {
							log.error("Error creating the CAR.",e);
						}
					}
				} catch (Exception e) {
					log.error("Error loading/reading the properties file", e);
				}
			}
		}
	}

}
