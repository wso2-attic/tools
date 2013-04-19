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

package org.wso2.developerstudio.appfactory.core.model;

public class ApplicationInfo{
	
	private String applicationDescription;
	private String applicationKey;
	private String applicationName;
	private String applicationRepoLink;
	private long revision;
	
	public ApplicationInfo(String applicationKey) {
		this.applicationKey = applicationKey;
	}
	
	public String getApplicationDescription() {
		return applicationDescription;
	}
	public void setApplicationDescription(String applicationDescription) {
		this.applicationDescription = applicationDescription;
	}
	public String getApplicationKey() {
		return applicationKey;
	}
	public void setApplicationKey(String applicationKey) {
		this.applicationKey = applicationKey;
	}
	public String getApplicationName() {
		return applicationName;
	}
	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}
	public String getApplicationRepoLink() {
		return applicationRepoLink;
	}
	public void setApplicationRepoLink(String applicationRepoLink) {
		this.applicationRepoLink = applicationRepoLink;
	}
	public void setRevision(long revision) {
		this.revision = revision;
	}

	public long getRevision() {
		return revision;
	}
}