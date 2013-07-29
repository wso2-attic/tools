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

package org.wso2.developerstudio.eclipse.datamapper.engine;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.wso2.developerstudio.eclipse.datamapper.model.ConfigDataModel;

public class ConfigDataHandler {
	private List<String> configRuleList;
	private List<ConfigDataModel> configModelList;
	private String configQuery;
	private File configFile;

	public void setConfigFile(File configFile) {
		this.configFile = configFile;
	}

	public String[] splitConfigQuery(String qurey) {
		configQuery = qurey;
		return configQuery.split("=|\\(|,|\\)|\\[|\\]");
	}
	
	public List<ConfigDataModel> getConfigData() {
		
		setConfigRuleList();
		Iterator<String> configRuleIterator = configRuleList.listIterator();
		String configQuery = "";
		String[] configQueryElements;
		configModelList = new ArrayList<ConfigDataModel>();
		ConfigDataModel model;
		
		while (configRuleIterator.hasNext()) {
			configQuery = configRuleIterator.next();
			configQueryElements = splitConfigQuery(configQuery);
			model = getConfigDataModel(configQueryElements);
			configModelList.add(model);
		}
		return configModelList;
	}

	private ConfigDataModel getConfigDataModel(String[] configElements) {
		
		ConfigDataModel configModel = new ConfigDataModel();
		List<String> queryElementList = new ArrayList<String>();
		List<String> configArgList = new ArrayList<String>();
		Collections.addAll(queryElementList, configElements);
		
		Iterator<String> queryElementIterator = queryElementList.listIterator();
		String queryElement;
		
		while (queryElementIterator.hasNext()) {
			queryElement = queryElementIterator.next();
			if(!queryElement.contains("$")){
				 if(queryElement.contains("#")){
					 configModel.setOutputElement(queryElement.replace("#", "/").trim());
				 }else{
					 configModel.setMethodName(queryElement);
				 }
			 }else{
				 queryElement = queryElement.replace("$", "/").trim();	
				 configModel.addArg(queryElement);
			 }
		}
		
		return configModel;
	}
	
	public void setConfigRuleList(){
		ConfigDataReader configreader = new ConfigDataReader(this.configFile);
		configRuleList = configreader.readConfig();
	}
}
