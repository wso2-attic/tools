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

package org.wso2.carbonstudio.eclipse.capp.module.factory;

import java.util.ArrayList;
import java.util.HashMap;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.wst.server.core.IModule;
import org.eclipse.wst.server.core.model.ModuleDelegate;
import org.eclipse.wst.server.core.model.ModuleFactoryDelegate;
import org.wso2.carbonstudio.eclipse.capp.module.Activator;
import org.wso2.carbonstudio.eclipse.capp.module.utils.Constants;
import org.wso2.carbonstudio.eclipse.logging.core.ICarbonStudioLog;
import org.wso2.carbonstudio.eclipse.logging.core.Logger;


public class CarbonModuleFactory extends ModuleFactoryDelegate{
	private static ICarbonStudioLog log=Logger.getLog(Activator.PLUGIN_ID);

	protected static final IModule[] NO_MODULES = new IModule[0];
	private HashMap moduleDelegates;
	protected IWorkspaceRoot root;
	private CarbonModuleFactory instance;
	private ArrayList<IModule> modules;

	public CarbonModuleFactory() {
		super();
		root = ResourcesPlugin.getWorkspace().getRoot();
		instance = this;
	}
	
	public ModuleDelegate getModuleDelegate(IModule arg0) {
		return null;
	}

	public IModule[] getModules() {
		cacheModules();
		return modules.toArray(new IModule[]{});
	}

	public final void cacheModules() {
		try {
			clearCache();
			IProject[] projects2 = root.getProjects();
			int size = projects2.length;
			modules = new ArrayList<IModule>(size);
			
			for (int i = 0; i < size; i++) {
				final ArrayList carbonFileResources = new ArrayList();

				if (projects2[i].isAccessible()) {
					IResource[] prjResources = projects2[i].members();
					if (projects2[i].hasNature("org.wso2.carbonstudio.eclipse.capp.project.nature")){
//						IFacetedProject facetedProject = ProjectFacetsManager.create(projects2[i]);
//						Set<IProjectFacet> fixedProjectFacets = facetedProject.getFixedProjectFacets();
//						for (IProjectFacet iProjectFacet : fixedProjectFacets) {
//							if (iProjectFacet.getId().equals(Constants.CAPP_FACET_ID)){
								IModule module = createModule(projects2[i].getName(),projects2[i].getName(),Constants.CAPP_MODULE_ID,Constants.CAPP_MODULE_VERSION,projects2[i]);
								if (module != null) {							
									modules.add(module);
								}								
//							}
//						}

					}
				}
			}
		} catch (Exception e) {
			log.error(e);
		}
	}
	protected void clearCache() {
		moduleDelegates = new HashMap();
	}

	public IModule createModuleObj(String id, String name, String type, String version, IProject project) {
		return createModule(id, name, type, version, project);
	}
}
