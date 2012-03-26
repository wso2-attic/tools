/*
 * Copyright (c) 2011, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
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

package org.wso2.developerstudio.eclipse.platform.core.registry.util;

import java.io.File;
import javax.xml.stream.FactoryConfigurationError;

import org.wso2.developerstudio.eclipse.logging.core.IDeveloperStudioLog;
import org.wso2.developerstudio.eclipse.logging.core.Logger;
import org.wso2.developerstudio.eclipse.platform.core.Activator;

import static org.wso2.developerstudio.eclipse.platform.core.registry.util.Constants.REGISTRY_COLLECTION;
import static org.wso2.developerstudio.eclipse.platform.core.registry.util.Constants.REGISTRY_DUMP;
import static org.wso2.developerstudio.eclipse.platform.core.registry.util.Constants.REGISTRY_RESOURCE;
import static org.wso2.developerstudio.eclipse.platform.core.registry.util.Constants.REGISTRY_UNDEFINED;

public class RegistryResourceUtils {
	
	private static IDeveloperStudioLog log = Logger.getLog(Activator.PLUGIN_ID);

	public RegistryResourceUtils() {
	}
	
	public static void addRegistryResourceInfo(File inputFile,
			RegistryResourceInfoDoc regResInfoDoc, File base, String path) {
		addRegistryResourceInfo(inputFile,regResInfoDoc,base,path,REGISTRY_UNDEFINED);
	}
	
	public static void addRegistryResourceInfo(File inputFile,
	                                           RegistryResourceInfoDoc regResInfoDoc, File base,
	                                           String path, int type) {
		String relativePath = inputFile.getAbsolutePath().substring(base.getParent().length() + 1);

		if(type== REGISTRY_DUMP){
			regResInfoDoc.addRegistryResourceInfoDoc(path, inputFile, REGISTRY_DUMP, base, "");
		} else{
			if (inputFile.isFile()) {
				regResInfoDoc.addRegistryResourceInfoDoc(path, inputFile, REGISTRY_RESOURCE, base, "");
			} else {
				path = path.endsWith("/") ? path : path + "/";
				path += inputFile.getName();
				regResInfoDoc.addRegistryResourceInfoDoc(path, inputFile, REGISTRY_COLLECTION, base, relativePath);
			}
		}
		
		
	}
	
	public static void createMetaDataForFolder(String checkoutPath, File fromPath){
		ResourceMetaData resMetaData = new ResourceMetaData();
		if (fromPath.getName().equals(".meta")) return;
		try {
			if (fromPath.isFile()){
				File metaFolderPath = createMetaFolder(fromPath.getParentFile());
				resMetaData.createElement(fromPath, checkoutPath, true, metaFolderPath, false);
			}else{
				File metaFolderPath = createMetaFolder(fromPath);
				resMetaData.createElement(fromPath, checkoutPath, false, metaFolderPath, false);
				File[] listFiles = fromPath.listFiles();
				for (File file : listFiles) {
					createMetaDataForFolder(checkoutPath+"/"+fromPath.getName(), file);
				}
			}
		} catch (FactoryConfigurationError e) {
			log.error("XML FactoryConfiguration Error", e);
		} catch (Exception e) {
			log.error("An unexpected error has occurred", e);
		}
	}
	
	private static File createMetaFolder(File resourceFile){
		File metaFolder = new File(resourceFile ,  ".meta");
		metaFolder.mkdirs();
		return metaFolder; 
	}
}
