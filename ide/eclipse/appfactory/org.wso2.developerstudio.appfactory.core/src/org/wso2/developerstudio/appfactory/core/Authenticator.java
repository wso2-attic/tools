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

import java.net.URL;
import org.apache.axis2.context.ServiceContext;
import org.apache.axis2.transport.http.HTTPConstants;
import org.wso2.carbon.authenticator.stub.AuthenticationAdminStub;
import org.wso2.developerstudio.eclipse.logging.core.IDeveloperStudioLog;
import org.wso2.developerstudio.eclipse.logging.core.Logger;

public class Authenticator {
	private static IDeveloperStudioLog log=Logger.getLog(Activator.PLUGIN_ID);
	
	private static final String AUTHENTICATION_ADMIN_SERVICE_URL= "services/AuthenticationAdmin";

	private String sessionCookie;
	private String userName;
	private String password;
	private String serverURL;
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public boolean Authenticate(String serverUrl, String userName, String passwd)
			throws Exception {
		AuthenticationAdminStub authenticationStub = new AuthenticationAdminStub(
				serverUrl + AUTHENTICATION_ADMIN_SERVICE_URL);

		authenticationStub._getServiceClient().getOptions()
				.setManageSession(true);
//		boolean loginStatus = authenticationStub.login(userName, passwd,
//				(new URL(serverUrl)).getHost()); 
		//TODO : fix this
		boolean loginStatus = authenticationStub.login("admin", "admin",
		(new URL(serverUrl)).getHost());
		if (!loginStatus) {
			log.error("Access denied for user '" + userName + "'");
			throw new Exception("Authentication failed on connection to the server");
		}
		ServiceContext serviceContext = authenticationStub._getServiceClient()
				.getLastOperationContext().getServiceContext();
		String sessionCookie = (String) serviceContext
				.getProperty(HTTPConstants.COOKIE_STRING);
		setSessionCookie(sessionCookie);
		return loginStatus;
	}
	
	public boolean Authenticate() throws Exception{
		return Authenticate(getServerURL(),getUserName(),getPassword());
	}

	public void setSessionCookie(String sessionCookie) {
		this.sessionCookie = sessionCookie;
	}

	public String getSessionCookie() {
		return sessionCookie;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setServerURL(String serverURL) {
		this.serverURL = serverURL;
	}

	public String getServerURL() {
		return serverURL;
	}

}