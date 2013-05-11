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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.wso2.developerstudio.appfactory.core.authentication.Authenticator;
import org.wso2.developerstudio.appfactory.core.client.HttpsJaggeryClient;
import org.wso2.developerstudio.appfactory.core.model.AppVersionInfo;
import org.wso2.developerstudio.appfactory.core.model.ApplicationInfo;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
 

public class AppListModel {
	public static final String APP_NIFO_URL =
			"https://staging.appfactorypreview.wso2.com/appmgt/site/blocks/application/get/ajax/list.jag";
	public List<ApplicationInfo> getCategories(List<ApplicationInfo> apps) {
			// TODO  can do changes to default model
		 for (ApplicationInfo applicationInfo : apps) {
			applicationInfo.setApplicationOwner("Admin");
		}
	    return apps;
	  }

	public void setversionInfo(ApplicationInfo applicationInfo){
		 Map<String,String> params = new HashMap<String,String>();
		 params.put("action", "getAppVersionsInStage");
		 params.put("stageName","Development");
		 params.put("userName",Authenticator.getInstance().getCredentials().getUser());
		 params.put("applicationKey",applicationInfo.getKey());
		 String respond = HttpsJaggeryClient.httpPost(APP_NIFO_URL, params);
		 JsonElement jelement = new JsonParser().parse(respond);
		 JsonElement jsonElement = jelement.getAsJsonArray().get(0).getAsJsonObject().get("versions");
		 JsonArray infoArray = jsonElement.getAsJsonArray();
		 JsonObject asJsonObject = infoArray.get(0).getAsJsonObject();
		 Gson gson = new Gson();
		 AppVersionInfo version = gson.fromJson(asJsonObject, AppVersionInfo.class);
		 applicationInfo.setVersion(new ArrayList<AppVersionInfo>());
		 version.setAppName(applicationInfo.getName());
		 applicationInfo.getVersion().add(version);
	}
}
