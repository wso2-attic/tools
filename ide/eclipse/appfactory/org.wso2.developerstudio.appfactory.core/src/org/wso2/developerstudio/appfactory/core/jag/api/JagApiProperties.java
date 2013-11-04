/* Copyright (c) WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
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

package org.wso2.developerstudio.appfactory.core.jag.api;

import org.wso2.developerstudio.appfactory.core.utils.Messages;

public class JagApiProperties {
	/*URLS*/  
	private static  String domain= Messages.JagApiProperties_0;
 
	private static final String APP_INFO_URL_SFX = Messages.JagApiProperties_1;
	private static final String LOGIN_URL_SFX  = Messages.JagApiProperties_2;
	private static final String BUILD_NUMBER_URL_SFX  = Messages.JagApiProperties_3;
	private static final String BUILD_INFO_URL_SFX  = Messages.JagApiProperties_4;
	private static final String LAST_BUILD_URL_SFX  = Messages.JagApiProperties_5;
	private static final String Build_APPLICATION_URL_SFX = Messages.JagApiProperties_6;
	private static final String APP_USER_ROLES_URL_SFX = Messages.JagApiProperties_7;
	private static final String APP_DB_INFO_URL =Messages.JagApiProperties_8;
	
	/*Actions*/
	public static  final String USER_APP_LIST__ACTION = Messages.JagApiProperties_9;
	public static final String App_NIFO_ACTION = Messages.JagApiProperties_10;
	public static final String App_BUILD_NUMBER_ACTION = Messages.JagApiProperties_11;
	public static final String App_BUILD_URL_ACTIONL = Messages.JagApiProperties_12;
	public static final String App_BUILD_INFO_ACTION =Messages.JagApiProperties_13;
	public static final String App_BUILD_ACTION =Messages.JagApiProperties_14;
	public static final String App_USERS_ROLES_ACTION =Messages.JagApiProperties_15;
	public static final String App_DB_INFO_ACTION = Messages.JagApiProperties_16;
	
	
	public static String getDomain() {
		return domain;
	}
	public static void setDomain(String domain) {
		JagApiProperties.domain = domain;
	}
	public static String getAppInfoUrl(){
		return domain + APP_INFO_URL_SFX;
	}
	public static String getLoginUrl(){
		return domain + LOGIN_URL_SFX;
	}
	public static String getBuildNumberUrl(){
		return domain + BUILD_NUMBER_URL_SFX;
	}
	public static String getBuildInfoUrl(){
		return domain + BUILD_INFO_URL_SFX;
	}
	public static String getBuildLastSucessfullBuildUrl(){
		return domain + LAST_BUILD_URL_SFX;
	}
	public static String getBuildApplication() {
		return domain +Build_APPLICATION_URL_SFX;
	}
	public static String getAppUserRolesUrlS() {
		return domain + APP_USER_ROLES_URL_SFX;
	}
	public static String getAppUserDbInfoUrl() {
		return domain+APP_DB_INFO_URL;
	}
}
