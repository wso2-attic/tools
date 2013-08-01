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

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ConfigDataHandler {

	private String configQuery;
	private File configFile;
	private Map<String, String> configRuleMap;
	private List<String> configRuleList;
		
	public void setConfigFile(File configFile) {
		this.configFile = configFile;
	}

	public Map<String, String> getConfigDataMap() {
		configRuleMap = new HashMap<String, String>();
		
		Iterator<String> it = configRuleList.listIterator();
		
		String outputElementName = "";
		String configQuery = "";
		String[] configTokens;
		
		while (it.hasNext()) {
			configTokens = splitConfigQuery(it.next());
			outputElementName = configTokens[0];
			configQuery = configTokens[1];
			configRuleMap.put(outputElementName, configQuery);
		}
		return configRuleMap;
	}

	public String[] splitConfigQuery(String qurey) {
		configQuery = qurey;
		return configQuery.split("=");
	}
	
	public void setConfigRuleList(){
		ConfigDataReader configreader = new ConfigDataReader(this.configFile);
		configRuleList = configreader.readConfig();
	}
}
