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

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class Authenticator {
	
  public String serverURL;	
  private static Authenticator authanticator = null;
  private UserPasswordCredentials credentials;
  
 protected Authenticator() {
	 
 }
  public static Authenticator getInstance() {
	      if(authanticator == null) {
	         authanticator = new Authenticator();
	      }
	      return authanticator;
	   }
  public boolean Authenticate(String serverUrl, UserPasswordCredentials credentials)
			throws Exception {
		 Map<String,String> params = new HashMap<String,String>();
		 params.put("action", "login");
		 params.put("userName", credentials.getUser());
		 params.put("password", credentials.getPassword());
		 String value = HttpsJaggeryClient.httpPostLogin(serverUrl,params);
	     if(!"false".equals(value)){
			 this.serverURL = serverUrl;
			 this.credentials = credentials;
			 return true;
		 } 
		 return false;
	}
public UserPasswordCredentials getCredentials() {
	return credentials;
}
public void setCredentials(UserPasswordCredentials credentials) {
	this.credentials = credentials;
}
}