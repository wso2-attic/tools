package org.wso2.developerstudio.appfactory.core.jag.api;

public class JagApiProperties {
	/*URLS*/  
	private static  String domain= "https://appfactorypreview.wso2.com";
	/*private static final String APP_INFO_URL =domain+ "/appmgt/site/blocks/application/get/ajax/list.jag";
	private static final String LOGIN_URL =domain + "/appmgt/site/blocks/user/login/ajax/login.jag";
	private static final String BUILD_NUMBER_URL = domain + "/appmgt/site/blocks/build/list/ajax/list.jag";
	private static final String BUILD_INFOURL_URL = domain + "/appmgt/site/blocks/build/get/ajax/get.jag";
	private static final String BUILD_LAST_SUCESSFULL_BUILD_URL = domain + "/appmgt/site/blocks/application/get/ajax/list.jag";*/
	
	private static final String APP_INFO_URL_SFX = "/appmgt/site/blocks/application/get/ajax/list.jag";
	private static final String LOGIN_URL_SFX  = "/appmgt/site/blocks/user/login/ajax/login.jag";
	private static final String BUILD_NUMBER_URL_SFX  = "/appmgt/site/blocks/build/list/ajax/list.jag";
	private static final String BUILD_INFO_URL_SFX  = "/appmgt/site/blocks/build/get/ajax/get.jag";
	private static final String LAST_SUCESSFULL_BUILD_URL_SFX  = "/appmgt/site/blocks/application/get/ajax/list.jag";
	
	/*Actions*/
	public static  final String USER_APP_LIST__ACTION = "getApplicationsOfUser";
	public static final String App_NIFO_ACTION = "getAppVersionsInStage";
	public static final String App_BUILD_NUMBER_ACTION = "buildinfobyappid";
	public static final String App_BUILD_URL_ACTIONL = "getBuildLogsUrl";
	public static final String App_BUILD_SUCESS_ACTION ="getLatestBuildSuccessInfo";
	
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
		return domain + LAST_SUCESSFULL_BUILD_URL_SFX;
	}
}
