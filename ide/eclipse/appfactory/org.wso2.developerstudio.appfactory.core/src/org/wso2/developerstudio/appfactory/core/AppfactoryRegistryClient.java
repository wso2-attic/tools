/* Copyright (c) 2012, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
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


package org.wso2.developerstudio.appfactory.core;

import java.net.MalformedURLException;

import org.wso2.carbon.registry.api.Resource;
import org.wso2.carbon.registry.app.RemoteRegistry;
import org.wso2.carbon.registry.core.Registry;
import org.wso2.carbon.registry.core.exceptions.RegistryException;
import org.wso2.developerstudio.appfactory.core.model.ApplicationInfo;
import org.wso2.developerstudio.eclipse.logging.core.IDeveloperStudioLog;
import org.wso2.developerstudio.eclipse.logging.core.Logger;

public class AppfactoryRegistryClient {
	private static IDeveloperStudioLog log=Logger.getLog(Activator.PLUGIN_ID);
	
	private static final String REMOTE_REGISTRY_URL= "registry";
	private static final String APPLICATIONS_PATH = "/_system/governance/applications/";
	private static final String APP_NAME_PROPERTY = "applicationName";
	private static final String APP_DESC_PROPERTY = "applicationDescription";
	private static final String APP_REPO_PROPERTY = "applicationRepoLink";

	private Authenticator authenticator;
	private Registry registry;
	
	public Authenticator getAuthenticator() {
		return authenticator;
	}

	public void setAuthenticator(Authenticator authenticator) {
		this.authenticator = authenticator;
	}

	void init(){
		try {
			registry = new RemoteRegistry(authenticator.getServerURL() + REMOTE_REGISTRY_URL,
					"admin", "admin"/*
									 * authenticator.getUserName(),authenticator.
									 * getPassword()
									 */);
			/* TODO : remove the hard coded values */
			registry.get("/");
		} catch (MalformedURLException e) {
			registry=null;
			log.error("MalformedURL", e);
		} catch (RegistryException e) {
			log.error("Exception occured:", e);
			registry=null;
		}
	}
	
	public ApplicationInfo getApplicatioInfo(String Appkey) throws Exception{
		ApplicationInfo applicatioInfo = new ApplicationInfo(Appkey);
		Resource resource = registry.get(APPLICATIONS_PATH + Appkey);
		applicatioInfo.setApplicationName(resource.getProperty(APP_NAME_PROPERTY));
		applicatioInfo.setApplicationDescription(resource.getProperty(APP_DESC_PROPERTY));
		applicatioInfo.setApplicationRepoLink(resource.getProperty(APP_REPO_PROPERTY));	
		return applicatioInfo;
	}
}
