package org.wso2.developerstudio.appfactory.core.jag.api;

public class JagApiProperties {
	/*URLS*/  
	public static  String domain= "https://staging.appfactorypreview.wso2.com";
	public static final String APP_INFO_URL =domain+ "/appmgt/site/blocks/application/get/ajax/list.jag";
	public static final String LOGIN_URL =domain + "/appmgt/site/blocks/user/login/ajax/login.jag";
	public static final String BUILD_NUMBER_URL = domain + "/appmgt/site/blocks/build/list/ajax/list.jag";
	public static final String BUILD_INFOURL_URL = domain + "/appmgt/site/blocks/build/get/ajax/get.jag";
	public static final String BUILD_LAST_SUCESSFULL_BUILD_URL = domain + "/appmgt/site/blocks/application/get/ajax/list.jag";
	/*Actions*/
	public static  final String USER_APP_LIST__ACTION = "getApplicationsOfUser";
	public static final String App_NIFO_ACTION = "getAppVersionsInStage";
	public static final String App_BUILD_NUMBER_ACTION = "buildinfobyappid";
	public static final String App_BUILD_URL_ACTIONL = "getBuildLogsUrl";
	public static final String App_BUILD_SUCESS_ACTION ="getLatestBuildSuccessInfo";
}
