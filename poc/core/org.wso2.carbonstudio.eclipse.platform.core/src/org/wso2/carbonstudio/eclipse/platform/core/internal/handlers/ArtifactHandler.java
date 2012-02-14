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

package org.wso2.carbonstudio.eclipse.platform.core.internal.handlers;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.wso2.carbonstudio.eclipse.logging.core.ICarbonStudioLog;
import org.wso2.carbonstudio.eclipse.logging.core.Logger;
import org.wso2.carbonstudio.eclipse.platform.core.Activator;
import org.wso2.carbonstudio.eclipse.platform.core.interfaces.IArtifactData;
import org.wso2.carbonstudio.eclipse.platform.core.internal.impl.ArtifactDataImpl;

public class ArtifactHandler {
	private static String ARTIFACT_DEFINITION_EXTENSION="org.wso2.carbonstudio.platform.artifacts";
	
	private static List<IArtifactData> artifactDefinitionList;

	private static ICarbonStudioLog log=Logger.getLog(Activator.PLUGIN_ID);

	public static IArtifactData[] getArtifactDefinitions(){
		return artifactDefinitionList.toArray(new IArtifactData[]{});
	}
	
	public static IArtifactData getArtifactDefinition(String id){
		for (IArtifactData artifactData : artifactDefinitionList) {
			if (artifactData.getId().equals(id)){
				return artifactData;
			}
		}
		return null;
	}
	
	static {
		artifactDefinitionList=new ArrayList<IArtifactData>();
		IConfigurationElement[] config = Platform.getExtensionRegistry().getConfigurationElementsFor(ARTIFACT_DEFINITION_EXTENSION);
		for (IConfigurationElement e : config) {		
			try {
				ArtifactDataImpl definition = new ArtifactDataImpl();
				definition.setId(e.getAttribute("id"));
				definition.setName(e.getAttribute("name"));
				definition.setNatureId(e.getAttribute("natureId"));
				definition.setExtension(e.getAttribute("extension"));
				artifactDefinitionList.add(definition);
			} catch (Exception ex) {
				log.error(ex);
			}
		}
	}

}
