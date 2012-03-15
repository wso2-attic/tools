/*
 * Copyright (c) 2011, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
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

package org.wso2.carbonstudio.eclipse.distribution.project.util;

import org.eclipse.osgi.util.NLS;

public class Constants extends NLS{
	public static final String BUNDLE_NAME = "org.wso2.carbonstudio.eclipse.distribution.project.util.constants";
	
	public static final String POM_FILE_NAME = "pom";
	public static final String POM_FILE_EXTENSION = "xml";
	public static final String ARTIFACT_XML = "artifact.xml";
	
	public static String AXIS2_PROJECT_NATURE;
	public static String BPEL_PROJECT_NATURE;
	public static String DS_PROJECT_NATURE;
	public static String DS_VALIDATOR_PROJECT_NATURE;
	public static String JAXWS_PROJECT_NATURE;
	public static String WEBAPP_PROJECT_NATURE;
	public static String ESB_PROJECT_NATURE;
	public static String GADGET_PROJECT_NATURE;
	public static String LIBRARY_PROJECT_NATURE;
	public static String MEDIATOR_PROJECT_NATURE;
	public static String REGISTRY_FILTER_PROJECT_NATURE;
	public static String REGISTRY_HANDLER_PROJECT_NATURE;
	public static String GENERAL_PROJECT_NATURE;
	public static String CARBON_UI_PROJECT_NATURE;
	public static String DISTRIBUTION_PROJECT_NATURE;
	
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Constants.class);
	}
}
