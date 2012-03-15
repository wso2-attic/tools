/*
 * Copyright (c) 2010, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
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

package org.wso2.carbonstudio.eclipse.capp.project.utils;

import java.util.HashMap;
import java.util.Map;

public class LocationConstants {
	
	private static final String MEDIATION_LOCATION="Mediators";
	private static final String ENDPOINTS_LOCATION=MEDIATION_LOCATION+"/"+"Endpoints";
	private static final String SEQUENCES_LOCATION=MEDIATION_LOCATION+"/"+"Sequences";
	
//	private static final String MODULES_LOCATION="modules";
	private static final String SERVICES_LOCATION="Services";
	private static final String PROXY_SERVICES_LOCATION=SERVICES_LOCATION+"/"+"Proxy";
	private static final String AAR_LOCATION=SERVICES_LOCATION+"/"+"Axis2";
	private static final String JAXWS_LOCATION=SERVICES_LOCATION+"/"+"JAX-WS";
	
	private static final String REGISTRY_LOCATION="Registry";
	
	private static Map<String,String> carbonFolderLocations;
	private static Map<String,String> carbonFolderLocationsByLocation;
	
	static{
		carbonFolderLocations=new HashMap<String,String>();
		carbonFolderLocations.put(CarbonArtifactConstants.ENDPOINTS_NAME, ENDPOINTS_LOCATION);
		carbonFolderLocations.put(CarbonArtifactConstants.SEQUENCES_NAME, SEQUENCES_LOCATION);
		carbonFolderLocations.put(CarbonArtifactConstants.PROXY_SERVICES_NAME, PROXY_SERVICES_LOCATION);
//		carbonFolderLocations.put(CarbonModuleConstants.MODULES_NAME, MODULES_LOCATION);
		carbonFolderLocations.put(CarbonArtifactConstants.SERVICES_NAME, SERVICES_LOCATION);
		carbonFolderLocations.put(CarbonArtifactConstants.AXIS2_NAME, AAR_LOCATION);
		carbonFolderLocations.put(CarbonArtifactConstants.JAXWS_NAME, JAXWS_LOCATION);
		carbonFolderLocations.put(CarbonArtifactConstants.REGISTRY_NAME, REGISTRY_LOCATION);
		carbonFolderLocations.put(CarbonArtifactConstants.MEDIATORS_NAME, MEDIATION_LOCATION);

		carbonFolderLocationsByLocation=new HashMap<String,String>();
		for(String key: carbonFolderLocations.keySet()){
			carbonFolderLocationsByLocation.put(carbonFolderLocations.get(key), key);
		}
	}
	
	public static Map<String,String> getCarbonFolderLocationsByName(){
		return carbonFolderLocations;
	}
	
	public static Map<String,String> getCarbonFolderLocationsByLocation(){
		return carbonFolderLocationsByLocation;
	}
}
