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

package org.wso2.developerstudio.appfactory.core.authentication;

import java.util.HashMap;
import java.util.Map;

import org.wso2.developerstudio.appfactory.core.client.HttpsJaggeryClient;

public class Authenticator {

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
		 Map<String,String> params = new HashMap<String,String>();
		 params.put("action", "login");
		 params.put("userName", userName);
		 params.put("password", passwd);
		 String[] paramNames = new String[]{"action","userName","password"};
	     String[] paramValues = new String[]{"login",userName,passwd};
		// String value = HttpsJaggeryClient.httpPostLogin(serverUrl,params);
	     String value = HttpsJaggeryClient.httpUrlPost(serverUrl, paramNames, paramValues);
		 if("true".equals(value)){
			 setPassword(passwd);
			 setUserName(userName);
			 setSessionCookie("cookie");
			 return true;
		 }
		 return false;
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