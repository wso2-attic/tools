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

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.wso2.developerstudio.appfactory.core.model.ApplicationInfo;
import org.wso2.developerstudio.eclipse.logging.core.IDeveloperStudioLog;
import org.wso2.developerstudio.eclipse.logging.core.Logger;


public class AppMgtClient {
	private static IDeveloperStudioLog log=Logger.getLog(Activator.PLUGIN_ID);
	
	private static final String APP_MGT_ADMIN_SERVICE_URL = "services/ApplicationManagementService";
	private static final String GET_ALL_APP_OPERATION = "getAllApplications";
	private static final String GET_ALL_APP_PAYLOAD = "<p:getAllApplications "
			+ "xmlns:p=\"http://service.mgt.application.appfactory.carbon.wso2.org\"> "
			+ "<p:userName>%s</p:userName>"
			+ "</p:getAllApplications>";
	private static final String GET_ROLES_OPERATION = "getRolesOfUserPerApplication";
	private static final String GET_ROLES_PAYLOAD = "<p:getRolesOfUserPerApplication "
			+ "xmlns:p=\"http://service.mgt.application.appfactory.carbon.wso2.org\">"
			+ "<xs:appId xmlns:xs=\"http://service.mgt.application.appfactory.carbon.wso2.org\">%s</xs:appId>"
			+ "<xs:userName xmlns:xs=\"http://service.mgt.application.appfactory.carbon.wso2.org\">%s</xs:userName>"
			+ "</p:getRolesOfUserPerApplication>";
	
	private Authenticator authenticator;
	
	public AppMgtClient(Authenticator authenticator) {
		this.authenticator = authenticator;
	}

	public void setAuthenticator(Authenticator authenticator) {
		this.authenticator = authenticator;
	}

	public Authenticator getAuthenticator() {
		return authenticator;
	}
	
	public List<String> getAllApps(String UserName){
		List<String> allApps = new ArrayList<String>();
		String payload = String.format(GET_ALL_APP_PAYLOAD, UserName);
		ServiceClientUtil clientUtil = new ServiceClientUtil(authenticator.getSessionCookie());
		String reply = clientUtil.callSynchronous(GET_ALL_APP_OPERATION,authenticator.getServerURL() + APP_MGT_ADMIN_SERVICE_URL,payload);
		Pattern pattern = Pattern.compile("<ns:return>(.*?)</ns:return>");
		Matcher matcher = pattern.matcher(reply);
		 while (matcher.find()) {
			 allApps.add(matcher.group().toString().replaceAll("^<ns:return>", "").replaceAll("</ns:return>$",""));
	        }
		return allApps;
	}
	
	public List<ApplicationInfo> getAllApplicationInfo(String UserName){
		List<ApplicationInfo> allAppsInfo = new ArrayList<ApplicationInfo>();
		List<String> allApps = getAllApps(UserName);
		AppfactoryRegistryClient regClinet = new AppfactoryRegistryClient();
		regClinet.setAuthenticator(getAuthenticator());
		regClinet.init();
		for (String appKey : allApps) {
			 try {
				 allAppsInfo.add(regClinet.getApplicatioInfo(appKey));
			} catch (Exception e) {
				log.error(e);
			}
		}
		return allAppsInfo;
	}
	
	public List<String> getUserRolesForApplication(String applicationKey,String UserName){
		List<String> allApps = new ArrayList<String>();
		String payload = String.format(GET_ROLES_PAYLOAD,applicationKey, UserName);
		ServiceClientUtil clientUtil = new ServiceClientUtil(authenticator.getSessionCookie());
		String reply = clientUtil.callSynchronous(GET_ROLES_OPERATION,authenticator.getServerURL() + APP_MGT_ADMIN_SERVICE_URL,payload);
		Pattern pattern = Pattern.compile("<ns:return>(.*?)</ns:return>");
		Matcher matcher = pattern.matcher(reply);
		 while (matcher.find()) {
			 allApps.add(matcher.group().toString().replaceAll("^<ns:return>", "").replaceAll("</ns:return>$",""));
	        }
		return allApps;
	}

}
