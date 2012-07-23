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

import org.apache.axis2.client.async.AxisCallback;
import org.apache.axis2.context.MessageContext;

public class DeployUtil {


	private static final String DEPLOY_TO_STAGE_PAYLOAD = "<p:DeployToStageRequest xmlns:p=\"http://wso2.org\">"
			+ "<p:applicationId>%1$s</p:applicationId>"
			+ "<p:revision>%2$s</p:revision>"
			+ "<p:version>%3$s</p:version>"
			+ "<p:stage>%4$s</p:stage>"
			+ "</p:DeployToStageRequest>";
	
	
	
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
	
	public boolean deployToStage(String appKey,String revision, String version , String stageName) {
		if (Stages.hasStage(stageName)) {
			AxisCallback axisCallback = new AxisCallback() {
				
				@Override
				public void onMessage(MessageContext mc) {
					//TODO:
					
				}
				
				@Override
				public void onFault(MessageContext mc) {
					//TODO:
					
				}
				
				@Override
				public void onError(Exception e) {
					//TODO:
					
				}
				
				@Override
				public void onComplete() {
					//TODO:
					
				}
			};
			String payload = String.format(DEPLOY_TO_STAGE_PAYLOAD, appKey, revision, version, stageName);
			ServiceClientUtil clientUtil = new ServiceClientUtil(authenticator.getSessionCookie());
			clientUtil.callAsynchronous("process", authenticator.getServerURL()
					+ Stages.getRelativeServiceUrl(stageName), payload,axisCallback);
		}
		return false;
	}
	
	
}
