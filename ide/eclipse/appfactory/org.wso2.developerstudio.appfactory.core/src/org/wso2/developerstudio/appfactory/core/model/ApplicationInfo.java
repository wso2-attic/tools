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

import java.util.Collections;
import java.util.List;
 

public class ApplicationInfo{
	
	private String description;
	private String key;
	private String name;
	private String repositoryType;
	private String type;
	private long revision;
	private String applicationOwner;
	private List<String> applicationDevelopers;
	private List<String> datasources;
	private List<String> databases;
	private List<String> apis;
	private List<String> properties;
	private List<AppVersionInfo> version;
	
	public ApplicationInfo(String applicationKey) {
		this.setKey(applicationKey);
	}

	public void setRevision(long revision) {
		this.revision = revision;
	}

	public long getRevision() {
		return revision;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRepositoryType() {
		return repositoryType;
	}

	public void setRepositoryType(String repositoryType) {
		this.repositoryType = repositoryType;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<AppVersionInfo> getVersion() {
		if(version==null){
			return Collections.EMPTY_LIST;
		}
		return version;
	}

	public void setVersion(List<AppVersionInfo> version) {
		this.version = version;
	}

	/**
	 * @return the applicationOwner
	 */
    public String getApplicationOwner() {
	    return applicationOwner;
    }

	/**
	 * @param applicationOwner the applicationOwner to set
	 */
    public void setApplicationOwner(String applicationOwner) {
	    this.applicationOwner = applicationOwner;
    }

	/**
	 * @return the applicationDevelopers
	 */
    public List<String> getApplicationDevelopers() {
	    return applicationDevelopers;
    }

	/**
	 * @param applicationDevelopers the applicationDevelopers to set
	 */
    public void setApplicationDevelopers(List<String> applicationDevelopers) {
	    this.applicationDevelopers = applicationDevelopers;
    }

	/**
	 * @return the datasources
	 */
    public List<String> getDatasources() {
	    return datasources;
    }

	/**
	 * @param datasources the datasources to set
	 */
    public void setDatasources(List<String> datasources) {
	    this.datasources = datasources;
    }

	/**
	 * @return the databases
	 */
    public List<String> getDatabases() {
	    return databases;
    }

	/**
	 * @param databases the databases to set
	 */
    public void setDatabases(List<String> databases) {
	    this.databases = databases;
    }

	/**
	 * @return the apis
	 */
    public List<String> getApis() {
	    return apis;
    }

	/**
	 * @param apis the apis to set
	 */
    public void setApis(List<String> apis) {
	    this.apis = apis;
    }

	/**
	 * @return the properties
	 */
    public List<String> getProperties() {
	    return properties;
    }

	/**
	 * @param properties the properties to set
	 */
    public void setProperties(List<String> properties) {
	    this.properties = properties;
    }

}