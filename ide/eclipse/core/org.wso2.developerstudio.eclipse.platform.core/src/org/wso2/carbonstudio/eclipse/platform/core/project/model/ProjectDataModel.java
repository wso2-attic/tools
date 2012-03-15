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

package org.wso2.carbonstudio.eclipse.platform.core.project.model;

import org.eclipse.core.resources.IProject;
import org.eclipse.ui.IWorkingSet;
import org.eclipse.ui.IWorkingSetManager;
import org.eclipse.ui.PlatformUI;
import org.wso2.carbonstudio.eclipse.platform.core.exception.ObserverFailedException;
import org.wso2.carbonstudio.eclipse.platform.core.model.MavenInfo;
import org.wso2.carbonstudio.eclipse.utils.project.ProjectUtils;

import java.io.File;
import java.util.Observable;

public abstract class ProjectDataModel extends Observable {
	private String projectName;
	private File location;
	private MavenInfo mavenInfo;
	private File importFile;
	private IWorkingSet[] selectedWorkingSets;
	private String selectedOption;

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) throws ObserverFailedException {
		if (this.projectName != projectName) {
			this.projectName = projectName;
			trigger();
		}
	}

	public File getLocation() {
		return location;
	}

	public void setLocation(File location) {
		this.location = location;
	}

	public MavenInfo getMavenInfo() {
		if (mavenInfo == null) {
			mavenInfo = new MavenInfo("org.wso2.carbon", getProjectName(), "1.0.0");
		}
		return mavenInfo;
	}

	public void setMavenInfo(MavenInfo mavenInfo) {

		this.mavenInfo = mavenInfo;
	}

	public void setSelectedOption(String selectedOption) throws ObserverFailedException {
		if (this.selectedOption != selectedOption) {
			this.selectedOption = selectedOption;
			trigger();
		}
	}

	private void trigger() throws ObserverFailedException {
		try {
			setChanged();
			notifyObservers();
		} catch (Exception e) {
			throw new ObserverFailedException(e);
		}
	}

	public String getSelectedOption() {
		return selectedOption;
	}

	/**
	 * return model data from the property key
	 * 
	 * @param key
	 *            - model property key
	 * @return
	 */
	public Object getModelPropertyValue(String key) {
		if (key.equalsIgnoreCase("project.name")) {
			return getProjectName();
		} else if (key.equalsIgnoreCase("import.file")) {
			return getImportFile();
		}
		return null;
	}

	/**
	 * set model data through property key
	 * 
	 * 
	 * @param key
	 *            - model property key
	 * @param data
	 *            - model data value
	 *            
	 * @return - if true - update the UI control with the value of the model
	 *           if false - only the model will be updated
	 * @throws ObserverFailedException
	 */
	public boolean setModelPropertyValue(String key, Object data) throws ObserverFailedException {
		if (key.equalsIgnoreCase("project.name")) {
			setProjectName(data.toString());
		} else if (key.equalsIgnoreCase("import.file")) {
			setImportFile((File) data);
		}
		return false;
	}

	public void setImportFile(File importFile) {
		this.importFile = importFile;
		if (importFile.exists()) {
			try {
				setProjectName(ProjectUtils.fileNameWithoutExtension(importFile.getName()));
			} catch (ObserverFailedException e) {
				e.printStackTrace();
			}
		}
	}

	public File getImportFile() {
		return importFile;
	}

	public void setSelectedWorkingSets(IWorkingSet[] selectedWorkingSets) {
		this.selectedWorkingSets = selectedWorkingSets;
	}

	public IWorkingSet[] getSelectedWorkingSets() {
		return selectedWorkingSets;
	}
	
	public void addToWorkingSet(IProject project){
		if((getSelectedWorkingSets()!=null)&&(project !=null)){
			IWorkingSetManager workingSetManager = PlatformUI.getWorkbench().getWorkingSetManager();
			workingSetManager.addToWorkingSets(project, getSelectedWorkingSets());
		}
	}

}
