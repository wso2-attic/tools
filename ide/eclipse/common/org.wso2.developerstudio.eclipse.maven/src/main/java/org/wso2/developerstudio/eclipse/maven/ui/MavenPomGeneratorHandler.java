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

package org.wso2.developerstudio.eclipse.maven.ui;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;

/**
 * This is the handler class for generating maven pom for any given project option.
 * This is used to provide maven multi module support for Developer Studio.
 * 
 */
public class MavenPomGeneratorHandler extends AbstractHandler {

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
				openQuestion =
				               MessageDialog.openQuestion(Display.getDefault().getActiveShell(),
				                                          "Generate POM for the Project",
				                                          "Do you want to convert this project to a maven multi module project?");
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
