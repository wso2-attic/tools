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

package org.wso2.developerstudio.eclipse.platform.ui.handlers;

import org.apache.maven.project.MavenProject;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.wso2.developerstudio.eclipse.logging.core.IDeveloperStudioLog;
import org.wso2.developerstudio.eclipse.logging.core.Logger;
import org.wso2.developerstudio.eclipse.maven.util.MavenUtils;
import org.wso2.developerstudio.eclipse.platform.ui.Activator;

/**
 * This is the handler class for generating maven pom for any given project option.
 * This is used to provide maven multi module support for Developer Studio.
 * 
 */
public class MavenPomGeneratorHandler extends AbstractHandler {
	private static IDeveloperStudioLog log = Logger.getLog(Activator.PLUGIN_ID);

	public Object execute(ExecutionEvent arg0) throws ExecutionException {

		System.out.println("command Executed");

		IStructuredSelection selection =
		                                 (IStructuredSelection) HandlerUtil.getCurrentSelectionChecked(arg0);
		IProject selectedUIElement = (IProject) selection.getFirstElement();

		IFile pomFile = null;
		boolean openQuestion = false;
		
		if (selectedUIElement.isOpen()) {
			pomFile = selectedUIElement.getFile("pom.xml");
			if (pomFile.exists()) {
//				Check for the packaging type
				try {
	                MavenProject mavenProject = MavenUtils.getMavenProject(pomFile.getLocation().toFile());
	                String packagingType = mavenProject.getPackaging();
	                if(!"pom".equalsIgnoreCase(packagingType)){
//	                	If not pom ask user to confirm the pom overwrte operation
	                	openQuestion =
	                		MessageDialog.openQuestion(Display.getDefault().getActiveShell(),
	                		                           "Generate POM for the Project",
	                		"Are you sure you want to overwite the existing pom file?");
	                	
//	                	If confirms, back up the pom and create the aggregator pom
	                	if(openQuestion){
	                		
	                	}
	                }
                } catch (Exception e) {
	                log.error("Error occured while tying to access the maven project corresponding to pom file", e);
                }
				
				
				
				
				
			}
		}
		
		if(!pomFile.exists() || (pomFile.exists() && openQuestion)){
			createMavenPom(selectedUIElement);
		}

		return null;
	}
	
	private void createMavenPom(IProject project){
//			 TODO: implement the Pom Generation Logic
	}

}
