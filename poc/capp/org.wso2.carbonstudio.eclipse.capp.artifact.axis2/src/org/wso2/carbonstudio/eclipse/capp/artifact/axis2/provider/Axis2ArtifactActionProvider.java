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

package org.wso2.carbonstudio.eclipse.capp.artifact.axis2.provider;

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.GroupMarker;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.navigator.CommonActionProvider;
import org.wso2.carbonstudio.eclipse.capp.artifact.axis2.Activator;
import org.wso2.carbonstudio.eclipse.capp.artifact.axis2.core.Axis2ArtifactHandler;
import org.wso2.carbonstudio.eclipse.capp.artifact.axis2.model.Axis2ArtifactLocationNode;
import org.wso2.carbonstudio.eclipse.capp.artifact.axis2.ui.wizard.NewAxis2ServiceWizard;
import org.wso2.carbonstudio.eclipse.capp.artifact.axis2.utils.SettingsConstants;
import org.wso2.carbonstudio.eclipse.capp.core.artifacts.ICAppArtifactHandler;
import org.wso2.carbonstudio.eclipse.capp.core.artifacts.configure.ICAppProjectSettings;
import org.wso2.carbonstudio.eclipse.logging.core.ICarbonStudioLog;
import org.wso2.carbonstudio.eclipse.logging.core.Logger;

public class Axis2ArtifactActionProvider extends CommonActionProvider {
	private static ICarbonStudioLog log=Logger.getLog(Activator.PLUGIN_ID);

	private MenuManager newSubMenu;
	private Action importAxis2ServiceAction;
	private Action deleteAction;
	private Action propertiesAction;
	private Action detachAction;
	private Axis2ArtifactLocationNode selectedLocationNode;
	private IProject selectedProject;

	public Axis2ArtifactActionProvider() {
		createActions();
	}

	private void createActions() {
		newSubMenu = new MenuManager("New");
		newSubMenu.setRemoveAllWhenShown(true);
		final Action axis2ServiceFromJavaClass = new Action("Axis2 service from class") {
			public void run() {
				addNewService();
			}
		};
		final Action axis2ServiceFromWSDL = new Action("Axis2 service WSDL") {
		};
		newSubMenu.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager mgr) {
				mgr.add(axis2ServiceFromJavaClass);
				mgr.add(axis2ServiceFromWSDL);
			}
		});

		importAxis2ServiceAction = new Action("Import Axis2 service") {
		};
		deleteAction = new Action("Delete source folder") {
			public void run() {
				deleteServiceFolder();
			}
		};
		detachAction = new Action("Detach source folder") {
			public void run() {
				detachServiceFolder();
			}
		};
		propertiesAction = new Action("Properties") {
		};

	}

	public void fillContextMenu(IMenuManager menu) {
		menu.add(newSubMenu);
		menu.add(importAxis2ServiceAction);

		addGroupSeperator(menu);

		menu.add(deleteAction);
		menu.add(detachAction);

		addGroupSeperator(menu);

		menu.add(propertiesAction);
	}

	public void addGroupSeperator(IMenuManager menu) {
		menu.add(new GroupMarker(IWorkbenchActionConstants.MB_ADDITIONS));
		menu.add(new Separator());
	}
	
	private Shell getShell(){
		return Display.getCurrent().getActiveShell();
	}
	

	
	public void addNewService(){
		NewAxis2ServiceWizard axis2ServiceWizard = new NewAxis2ServiceWizard();
		WizardDialog wizardDialog = new WizardDialog(getShell(), axis2ServiceWizard);
		updateSelectedObjects();
		axis2ServiceWizard.setSelectedProject(selectedProject);
		axis2ServiceWizard.setSelectedLocationNode(selectedLocationNode);
		wizardDialog.open();
	}

	public void deleteServiceFolder(){
		updateSelectedObjects();
		if (MessageDialog.openQuestion(getShell(), "Delete Axis2 Source folder", "Are you sure you want to delete axis2 source folder '"+selectedLocationNode.getPath()+"'?")){
			ICAppArtifactHandler artifactHandler = Axis2ArtifactHandler.getCAppArtifactManager().getArtifactHandler(SettingsConstants.ID);
			ICAppProjectSettings projectSettings = Axis2ArtifactHandler.getCAppArtifactManager().getProjectSettings(selectedProject);
			try {
	            artifactHandler.deleteArtifactPath(selectedLocationNode.getSourceFolder(), projectSettings);
            } catch (Exception e) {
	            log.error(e);
	            MessageDialog.openError(getShell(), "Error deleting Axis2 source folder", e.getMessage());
            }
		}
	}
	
	public void detachServiceFolder(){
		updateSelectedObjects();
		if (MessageDialog.openQuestion(getShell(), "Detach Axis2 Source folder", "Are you sure you want to detach axis2 source folder '"+selectedLocationNode.getPath()+"'?")){
			ICAppArtifactHandler artifactHandler = Axis2ArtifactHandler.getCAppArtifactManager().getArtifactHandler(SettingsConstants.ID);
			ICAppProjectSettings projectSettings = Axis2ArtifactHandler.getCAppArtifactManager().getProjectSettings(selectedProject);
			try {
	            artifactHandler.detachArtifactPath(selectedLocationNode.getSourceFolder(), projectSettings);
            } catch (Exception e) {
	            log.error(e);
	            MessageDialog.openError(getShell(), "Error deleting Axis2 source folder", e.getMessage());
            }
		}
	}
	
	private void updateSelectedObjects() {
	    TreeSelection selection=(TreeSelection)getContext().getSelection();
		selectedProject = null;
		selectedLocationNode = null;
		if (selection.getFirstElement() instanceof Axis2ArtifactLocationNode){
			selectedLocationNode = (Axis2ArtifactLocationNode)selection.getFirstElement();
			selectedProject=selectedLocationNode.getProject();
    	} else if (selection.getFirstElement() instanceof IProject){
    		selectedProject=(IProject)selection.getFirstElement();
    	}
    }
	
}
