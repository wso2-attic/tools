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

package org.wso2.datamapper.core;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class ConfigDataExecuter {
	
	private Map<String,String> configOutputs;

	public void executeConfigs(Map<String, String> configQueryMap) {
		
		configOutputs = configQueryMap;
		Set<String> configKeySet = configOutputs.keySet();
		FunctionHandler functionHandler = new FunctionHandler();
		
		Iterator<String> configIterator = configKeySet.iterator();
		
		String configKey = "";
		String configQuery = "";
		
		while (configIterator.hasNext()) {
			configKey = configIterator.next();
			configQuery = configOutputs.get(configKey);
			System.out.println("configQuery : "+configQuery);
			configOutputs.put(configKey, functionHandler.executeFunction(configQuery));
			
		}
	}
}
