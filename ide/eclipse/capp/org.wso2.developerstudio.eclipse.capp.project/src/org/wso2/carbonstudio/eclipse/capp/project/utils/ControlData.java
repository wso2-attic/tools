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

package org.wso2.carbonstudio.eclipse.capp.project.utils;

public class ControlData {
	String previousName;
	String currentName;
	String controlName;
	String previousVersion;
	String currentVersion;
	String previousServerRole;
	String currentServerRole;
	
	
	public String getPreviousServerRole() {
		return previousServerRole;
	}

	public void setPreviousServerRole(String previousServerRole) {
		this.previousServerRole = previousServerRole;
	}

	public String getCurrentServerRole() {
		return currentServerRole;
	}

	public void setCurrentServerRole(String currentServerRole) {
		if(currentServerRole.equals(previousServerRole)){
			this.previousServerRole = currentServerRole;
		}
		this.currentServerRole = currentServerRole;
		
	}

	public String getPreviousVersion() {
		return previousVersion;
	}

	public void setPreviousVersion(String previousVersion) {
		this.previousVersion = previousVersion;
	}

	public String getCurrentVersion() {
		return currentVersion;
	}

	public void setCurrentVersion(String currentVersion) {
		if(currentVersion.equals(previousVersion)){
			this.previousVersion = currentVersion;
		}
		this.currentVersion = currentVersion;
			
		
	}

	public String getControlName() {
		return controlName;
	}

	public void setControlName(String controlName) {
		this.controlName = controlName;
	}

	public String getPreviousName() {
		return previousName;
	}
	
	public void setPreviousName(String previousName) {
		this.previousName = previousName;
	}
	
	public String getCurrentName() {
		return currentName;
	}
	
	public void setCurrentName(String currentName) {
		if(currentName.equals(previousName)){
			this.previousName = currentName;
		}
		this.currentName = currentName;
			
		
	}
}
