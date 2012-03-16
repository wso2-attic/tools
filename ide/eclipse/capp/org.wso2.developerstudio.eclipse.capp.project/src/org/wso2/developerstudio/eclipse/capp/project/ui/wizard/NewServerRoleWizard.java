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

package org.wso2.developerstudio.eclipse.capp.project.ui.wizard;

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.wso2.developerstudio.eclipse.capp.project.manager.CAppArtifactManager;
import org.wso2.developerstudio.eclipse.capp.project.utils.CAppImageUtils;

public class NewServerRoleWizard extends Wizard implements INewWizard {

	private ServerRolePage serverRolePage;
	private IStructuredSelection selection;
	
	public boolean performFinish() {
		CAppArtifactManager.getInstance().addServerRole(getProject(),serverRolePage.getNewServerRole());
		return true;
	}


	public void init(IWorkbench arg0, IStructuredSelection selection) {
		this.selection=selection;

	}
    public void addPages() {
    	serverRolePage = new ServerRolePage("New Server Role", getProject());
    	serverRolePage.setTitle("New Server Role");
    	serverRolePage.setDescription("Create a new server role.");
    	serverRolePage.setImageDescriptor(CAppImageUtils.getInstance().getImageDescriptor("server-role-wizard-header.png"));
    	addPage(serverRolePage);
    }
    
    private IProject getProject(){
    	if (selection.getFirstElement() instanceof IProject){
    		return (IProject)selection.getFirstElement();
    	}else{
    		return null;
    	}
    }
}
