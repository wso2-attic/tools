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

import static org.apache.axis2.transport.http.HTTPConstants.COOKIE_STRING;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.util.AXIOMUtil;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.axis2.client.ServiceClient;
import org.apache.axis2.client.async.AxisCallback;
import org.wso2.developerstudio.eclipse.logging.core.IDeveloperStudioLog;
import org.wso2.developerstudio.eclipse.logging.core.Logger;

public class ServiceClientUtil {
	private static IDeveloperStudioLog log = Logger.getLog(Activator.PLUGIN_ID);
	private String sessionCookie ;
	
	public ServiceClientUtil(String sessionCookie) {
		this.sessionCookie = sessionCookie;
	}

	public String callSynchronous(String operation, String endPoint, String payLoad) {
		ServiceClient client;
		try {
			client = new ServiceClient();
			Options opts = new Options();
			opts.setTo(new EndpointReference(endPoint));
			opts.setAction("urn:" + operation);
			opts.setManageSession(true);
			opts.setProperty(COOKIE_STRING, sessionCookie);
			opts.setTimeOutInMilliSeconds(5* 60*1000);
			client.setOptions(opts);
			OMElement element = client.sendReceive(AXIOMUtil.stringToOM(payLoad));
			String soapMsg;
			soapMsg = element.getBuilder().getDocumentElement().toStringWithConsume();
			Pattern pattern = Pattern.compile("<soapenv:Body>(.*?)</soapenv:Body>");
			Matcher matcher = pattern.matcher(soapMsg);
			if (matcher.find()) {
				soapMsg = matcher.group().toString().replaceAll("^<soapenv:Body>", "")
						.replaceAll("</soapenv:Body>$", "");
			}
			return soapMsg;
		} catch (Exception ex) {
			log.error("Exception occured:", ex);
			return "";
		}
	}
	
	public void callAsynchronous(String operation, String endPoint, String payLoad, AxisCallback axisCallback) {
		ServiceClient client;
		try {
			client = new ServiceClient();
			Options opts = new Options();
			opts.setTo(new EndpointReference(endPoint));
			opts.setAction("urn:" + operation);
			opts.setManageSession(true);
			opts.setProperty(COOKIE_STRING, sessionCookie);
			opts.setTimeOutInMilliSeconds(5* 60*1000);
			client.setOptions(opts);
		} catch (Exception ex) {
			log.error("Exception occured:", ex);
		}
	}
	

}
