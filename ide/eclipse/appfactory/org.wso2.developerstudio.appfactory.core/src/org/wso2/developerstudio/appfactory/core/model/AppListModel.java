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
import org.wso2.developerstudio.appfactory.core.authentication.Authenticator;
import org.wso2.developerstudio.appfactory.core.client.HttpsJaggeryClient;
import org.wso2.developerstudio.appfactory.core.jag.api.JagApiProperties;
import org.wso2.developerstudio.appfactory.core.model.AppVersionInfo;
import org.wso2.developerstudio.appfactory.core.model.ApplicationInfo;
import org.wso2.developerstudio.appfactory.core.utils.Messages;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
 

public class AppListModel {
		public List<ApplicationInfo> getCategories(List<ApplicationInfo> apps) {
			// TODO  can do changes to default model
		for (ApplicationInfo applicationInfo : apps) {
			/*Currently API doesn't provide the app owner information*/
			applicationInfo.setApplicationOwner(Authenticator.getInstance().getCredentials().getUser());
		}
	    return apps;
	  }

	public boolean setversionInfo(ApplicationInfo applicationInfo) {
		String respond = Messages.AppListModel_0;
		/* Getting version information */
		Map<String, String> params = new HashMap<String, String>();
		params.put(Messages.AppListModel_1, JagApiProperties.App_NIFO_ACTION);
		params.put(Messages.AppListModel_2, Messages.AppListModel_3);
		params.put(Messages.AppListModel_4, Authenticator.getInstance().getCredentials()
				.getUser());
		params.put(Messages.AppListModel_5, applicationInfo.getKey());
		respond = HttpsJaggeryClient.httpPost(JagApiProperties.getAppInfoUrl(),
				params);
		if (Messages.AppListModel_6.equals(respond)) {
			return false;
		} else {
			JsonElement jelement = new JsonParser().parse(respond);
			JsonElement jsonElement = jelement.getAsJsonArray().get(0)
					.getAsJsonObject().get(Messages.AppListModel_7);
			JsonArray infoArray = jsonElement.getAsJsonArray();
			ArrayList<AppVersionInfo> appVersionList = new ArrayList<AppVersionInfo>();
			for (JsonElement jsonElement2 : infoArray) {
				JsonObject asJsonObject = jsonElement2.getAsJsonObject();
				Gson gson = new Gson();
				AppVersionInfo version = gson.fromJson(asJsonObject,
						AppVersionInfo.class);
				version.setAppName(applicationInfo.getKey());
				version.setLocalRepo(applicationInfo.getLocalrepoLocation());
				appVersionList.add(version);
			}
			applicationInfo.setAppVersionList(appVersionList);
			return true;
		}
	}

	public boolean setRoleInfomation(ApplicationInfo applicationInfo) {
		String respond;
		Map<String, String> params;
		JsonElement jelement;
		params = new HashMap<String, String>();
		params.put(Messages.AppListModel_8, JagApiProperties.App_USERS_ROLES_ACTION);
		params.put(Messages.AppListModel_9, applicationInfo.getKey());
		respond = HttpsJaggeryClient.httpPost(
				JagApiProperties.getAppUserRolesUrlS(), params);
		if (Messages.AppListModel_10.equals(respond)) {
			return false;
		} else {
			jelement = new JsonParser().parse(respond);
			JsonArray infoArray2 = jelement.getAsJsonArray();
			ArrayList<AppUserInfo> appUserList = new ArrayList<AppUserInfo>();
			for (JsonElement jsonElement3 : infoArray2) {
				JsonObject asJsonObject = jsonElement3.getAsJsonObject();
				Gson gson = new Gson();
				AppUserInfo user = gson.fromJson(asJsonObject, AppUserInfo.class);
				appUserList.add(user);
			}
			applicationInfo.setApplicationDevelopers(appUserList);
			return true;
		}
	}
	
	public boolean setDBInfomation(ApplicationInfo applicationInfo) {
		String respond;
		Map<String, String> params;
		JsonElement jelement;
		params = new HashMap<String, String>();
		params.put(Messages.AppListModel_11, JagApiProperties.App_DB_INFO_ACTION);
		params.put(Messages.AppListModel_12, applicationInfo.getKey());
		respond = HttpsJaggeryClient.httpPost(
				JagApiProperties.getAppUserDbInfoUrl(), params);
		if (Messages.AppListModel_13.equals(respond)) {
			return false;
		} else {
			jelement = new JsonParser().parse(respond);
			JsonArray infoArray2 = jelement.getAsJsonArray();
			ArrayList<AppDBinfo> appDbList = new ArrayList<AppDBinfo>();
			for (JsonElement jsonElement3 : infoArray2) {
				JsonObject asJsonObject = jsonElement3.getAsJsonObject();
				String stage = asJsonObject.get(Messages.AppListModel_14).getAsString();
				if(Messages.AppListModel_15.equals(stage)){
					AppDBinfo appDBinfo = new AppDBinfo();
					JsonArray dbArray = asJsonObject.get(Messages.AppListModel_16).getAsJsonArray();
					List<Map<String,String>> dbs = new ArrayList<Map<String,String>>();
					for (JsonElement jsonElement : dbArray) {
						 HashMap<String, String> dbInfo = new HashMap<String, String>();
						 dbInfo.put(Messages.AppListModel_17,jsonElement.getAsJsonObject().get(Messages.AppListModel_18).getAsString());
						 dbInfo.put(Messages.AppListModel_19,jsonElement.getAsJsonObject().get(Messages.AppListModel_20).getAsString());
						 dbs.add(dbInfo);
					}
					appDBinfo.setDbs(dbs);
					JsonArray dbusers = asJsonObject.get(Messages.AppListModel_21).getAsJsonArray();
					List<String> usr = new ArrayList<String>();
					for (JsonElement jsonElement : dbusers) {
						usr.add(jsonElement.getAsJsonObject().get(Messages.AppListModel_22).getAsString());
					}
					appDBinfo.setUsr(usr);
					JsonArray dbtemplates = asJsonObject.get(Messages.AppListModel_23).getAsJsonArray();
					List<String> temple = new ArrayList<String>();
					for (JsonElement jsonElement : dbtemplates) {
						temple.add(jsonElement.getAsJsonObject().get(Messages.AppListModel_24).getAsString());
					}
					appDBinfo.setUsr(temple);
					appDbList.add(appDBinfo);
				}
			}
			applicationInfo.setDatabases(appDbList);
			return true;
		}
	}
	
}
