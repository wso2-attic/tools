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
import java.util.List;
import java.util.logging.Logger;

import org.wso2.developerstudio.eclipse.datamapper.model.ConfigDataModel;
import org.wso2.developerstudio.eclipse.datamapper.model.FilesModel;

public class DataMapper {
	private File inputFile;
	private File configFile;
	
	//private static IDeveloperStudioLog log=Logger.getLog(Activator.PLUGIN_ID);


	public void setInputFile(File inputFile) {
		this.inputFile = inputFile;
	}

	public void setConfigFile(File configFile) {
		this.configFile = configFile;
	}

	public void doMapping() {
		FilesModel fileModel = new FilesModel();
		fileModel.setConfigFile(this.configFile);
		fileModel.setInputFile(this.inputFile);
		ConfigDataHandler configHandler = new ConfigDataHandler();
		configHandler.setConfigFile(this.configFile);
		List<ConfigDataModel> configDaaList = configHandler.getConfigData();
		ConfigDataExecuter configExecuter = new ConfigDataExecuter();
		configExecuter.setInputFile(this.inputFile);
		configExecuter.setConfigDataList(configDaaList);
		configExecuter.executeConfigs();
	}
}
