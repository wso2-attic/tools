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

package org.wso2.carbonstudio.eclipse.artifact.registry.utils;

import java.io.File;
import javax.xml.stream.FactoryConfigurationError;

public class RegistryResourceUtils {

	public RegistryResourceUtils() {
	}
	
	public static void addRegistryResourceInfo(File inputFile,
			RegistryResourceInfoDoc regResInfoDoc, File base, String path) {
		String relativePath = inputFile.getAbsolutePath().substring(
				base.getParent().length() + 1);

		if (inputFile.isFile()) {
			regResInfoDoc.addRegistryResourceInfoDoc(path, inputFile, 0, base,
					"");
		} else {
			path = path.endsWith("/") ? path : path + "/";
			path += inputFile.getName();
			regResInfoDoc.addRegistryResourceInfoDoc(path, inputFile, 1, base,
					relativePath);
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
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static File createMetaFolder(File resourceFile){
		File metaFolder = new File(resourceFile ,  ".meta");
		metaFolder.mkdirs();
		return metaFolder; 
	}
}
