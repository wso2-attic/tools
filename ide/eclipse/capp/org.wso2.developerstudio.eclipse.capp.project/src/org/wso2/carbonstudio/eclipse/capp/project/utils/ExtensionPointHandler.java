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

import java.util.List;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.wso2.carbonstudio.eclipse.capp.core.artifacts.ICAppArtifactHandler;


public class ExtensionPointHandler {
	private static String ARTIFACT_HANDLER_EXTENSION="org.wso2.carbonstudio.eclipse.capp.project.artifacts";
	
	public static void setArtifactHandlers(List<ICAppArtifactHandler> artifactHandler){
		artifactHandler.clear();
		IConfigurationElement[] config = Platform.getExtensionRegistry()
				.getConfigurationElementsFor(ARTIFACT_HANDLER_EXTENSION);
		for (IConfigurationElement e : config) {		
			try {
				artifactHandler.add((ICAppArtifactHandler)e.createExecutableExtension("class"));
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
	
}
