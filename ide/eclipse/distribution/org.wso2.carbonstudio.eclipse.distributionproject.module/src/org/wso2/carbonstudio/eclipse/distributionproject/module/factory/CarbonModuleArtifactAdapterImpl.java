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

package org.wso2.carbonstudio.eclipse.distributionproject.module.factory;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.wst.server.core.IModule;
import org.eclipse.wst.server.core.IModuleArtifact;
import org.eclipse.wst.server.core.model.ModuleArtifactAdapterDelegate;
import org.wso2.carbonstudio.eclipse.distributionproject.module.Activator;
import org.wso2.carbonstudio.eclipse.distributionproject.module.utils.Constants;
import org.wso2.carbonstudio.eclipse.logging.core.ICarbonStudioLog;
import org.wso2.carbonstudio.eclipse.logging.core.Logger;

public class CarbonModuleArtifactAdapterImpl extends ModuleArtifactAdapterDelegate {
	private static ICarbonStudioLog log=Logger.getLog(Activator.PLUGIN_ID);
	private static CarbonModuleFactory factory;
	
	public IModuleArtifact getModuleArtifact(Object selection) {
		if (selection instanceof IProject){
			IProject project=(IProject)selection;
			try {
	            if (project.hasNature(Constants.CAPP_NATURE_ID)){
	            	IModule module = getFactory().createModuleObj(project.getName(),project.getName(),Constants.CAPP_MODULE_ID,Constants.CAPP_MODULE_VERSION,project);
	            	return new CarbonModuleArtifact(module);
	            }
            } catch (CoreException e) {
	            log.error(e);
            }
		}
		return null;
	}
	
	public static CarbonModuleFactory getFactory() {
		if (factory==null){
			factory = new CarbonModuleFactory();
			factory.initialize();
		}
	    return factory;
    }
}
