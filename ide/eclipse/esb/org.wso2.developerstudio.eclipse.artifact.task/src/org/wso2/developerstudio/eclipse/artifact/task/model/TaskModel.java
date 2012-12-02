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

package org.wso2.developerstudio.eclipse.artifact.task.model;

import java.io.File;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IProject;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

import static org.wso2.developerstudio.eclipse.artifact.task.util.ArtifactConstants.*;
import static org.wso2.developerstudio.eclipse.platform.core.utils.Constants.ESB_PROJECT_NATURE;
import org.wso2.developerstudio.eclipse.artifact.task.validator.TriggerTypeList.TriggerType;
import org.wso2.developerstudio.eclipse.esb.project.utils.ESBProjectUtils;
import org.wso2.developerstudio.eclipse.platform.core.exception.ObserverFailedException;
import org.wso2.developerstudio.eclipse.platform.core.project.model.ProjectDataModel;

/**
 * The model class for task artifact wizard specific objects.
 */
public class TaskModel  extends ProjectDataModel {
	
	private String name;
	private String group = "synapse.simple.quartz";
	private String taskImplementation = "org.apache.synapse.startup.tasks.MessageInjector";
	private TriggerType triggerType = TriggerType.SIMPLE;
	private int count;
	private long interval;
	private String cron;
	private String pinnedServers;
	private IContainer saveLocation;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setSaveLocation(IContainer saveLocation) {
		this.saveLocation = saveLocation;
	}
	public IContainer getSaveLocation() {
		return saveLocation;
	}
	public void setTriggerType(TriggerType triggerType) {
		this.triggerType = triggerType;
	}
	public TriggerType getTriggerType() {
		return triggerType;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public String getTaskImplementation() {
		return taskImplementation;
	}
	public void setTaskImplementation(String taskImplementation) {
		this.taskImplementation = taskImplementation;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getPinnedServers() {
		return pinnedServers;
	}
	public void setPinnedServers(String pinnedServers) {
		this.pinnedServers = pinnedServers;
	}
	public long getInterval() {
		return interval;
	}
	public void setInterval(long interval) {
		this.interval = interval;
	}
	public String getCron() {
		return cron;
	}
	public void setCron(String cron) {
		this.cron = cron;
	}
	
	@Override
	public Object getModelPropertyValue(String key) {
		Object value = super.getModelPropertyValue(key);
		if (key.equals(Task_Trigger_Type)) {
			value = getTriggerType();
		} else if(key.equals(Task_Name)){
			value = getName();
		} else if(key.equals(Task_Group)){
			value = getGroup();
		} else if(key.equals(Task_Implementation)){
			value = getTaskImplementation();
		} else if(key.equals(Task_Trigger_Count)){
			value = getCount();
		} else if(key.equals(Task_Trigger_Interval)){
			value = getInterval();
		} else if(key.equals(Task_Cron)){
			value = getCron();
		} else if(key.equals(Task_Pinned_Servers)){
			value = getPinnedServers();
		} else if (key.equals(Task_Save_location)) {
			value = getSaveLocation();
		} 
		return value;
	}
	
	@Override
	public boolean setModelPropertyValue(String key, Object data) throws ObserverFailedException {
		boolean result = super.setModelPropertyValue(key, data);
		if (key.equals(Task_Trigger_Type)) {
			setTriggerType((TriggerType) data);
		} else if(key.equals(Task_Name)){
			setName(data.toString());
		} else if(key.equals(Task_Group)){
			setGroup(data.toString());
		} else if(key.equals(Task_Implementation)){
			setTaskImplementation(data.toString());
		} else if(key.equals(Task_Trigger_Count)){
			try {
				setCount(Integer.parseInt(data.toString()));
			} catch (NumberFormatException e) {
				/*ignore*/
			}
		} else if(key.equals(Task_Trigger_Interval)){
			try {
				setInterval(Long.parseLong(data.toString()));
			} catch (NumberFormatException e) {
				/*ignore*/
			}
		} else if(key.equals(Task_Cron)){
			setCron(data.toString());
		} else if(key.equals(Task_Pinned_Servers)){
			setPinnedServers(data.toString());
		} else if (key.equals(Task_Save_location)) {
			setSaveLocation((IContainer) data);
		} else if (key.contains(Task_Create_Project)){
			Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
			IProject esbProject = ESBProjectUtils.createESBProject(shell);
			if(esbProject!=null){
				setSaveLocation(esbProject);
			}
		}
		return result;
	}
	
	@Override
	public void setLocation(File location) {
		super.setLocation(location);
		File absolutionPath = getLocation();
		if (getSaveLocation() == null && absolutionPath != null) {
			IContainer newSaveLocation =
			        getContainer(absolutionPath, ESB_PROJECT_NATURE);
			setSaveLocation(newSaveLocation);
		}
	}

}
