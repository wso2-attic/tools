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

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DeployUtil {


	private static final String DEPLOY_TO_STAGE_PAYLOAD = "<p:DeployApplicationTo%1$sRequest "
			+ "xmlns:p=\"http://wso2.org/carbon/appfactory/applicaiton/deployment\">"
			+ "<p:applicationSvnLocation>%2$s</p:applicationSvnLocation>"
			+ "<p:applicationId>%3$s</p:applicationId></p:DeployApplicationTo%1$sRequest>"
			+ "<p:svnRevision>%4$s</p:svnRevision>";
	
	
	private Authenticator authenticator;

	public DeployUtil(Authenticator authenticator) {
		this.setAuthenticator(authenticator);
	}

	public void setAuthenticator(Authenticator authenticator) {
		this.authenticator = authenticator;
	}

	public Authenticator getAuthenticator() {
		return authenticator;
	}
	
	public boolean deployToStage(String svnLocation,String svnRevision, String appKey, String stageName) {
		if (Stages.hasStage(stageName)) {
			String payload = String.format(DEPLOY_TO_STAGE_PAYLOAD, stageName, svnLocation, appKey, svnRevision);
			ServiceClientUtil clientUtil = new ServiceClientUtil(authenticator.getSessionCookie());
			String reply = clientUtil.callSynchronous("process", authenticator.getServerURL()
					+ Stages.getRelativeServiceUrl(stageName), payload);
			Pattern pattern = Pattern.compile("<ns:return>(.*?)</ns:return>");
			Matcher matcher = pattern.matcher(reply);
			while (matcher.find()) {
				// allApps.add(matcher.group().toString().replaceAll("^<ns:return>",
				// "").replaceAll("</ns:return>$",""));
			}
		}
		return false;
	}
	
	
}
