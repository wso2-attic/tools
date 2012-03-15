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

package org.wso2.carbonstudio.eclipse.capp.project.filters;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.wso2.carbonstudio.eclipse.capp.project.Activator;
import org.wso2.carbonstudio.eclipse.capp.project.manager.CAppArtifactManager;
import org.wso2.carbonstudio.eclipse.capp.project.utils.CAppConstants;
import org.wso2.carbonstudio.eclipse.logging.core.ICarbonStudioLog;
import org.wso2.carbonstudio.eclipse.logging.core.Logger;

public class ArtifactFolderFilter extends ViewerFilter {
	private static ICarbonStudioLog log=Logger.getLog(Activator.PLUGIN_ID);

	public boolean select(Viewer viewer, Object parent, Object element) {
		if (element instanceof IFolder) {
			IFolder folder = (IFolder) element;
			IProject proj = folder.getProject();
			try {
	            if (!proj.hasNature(CAppConstants.CAPP_NATURE_ID)) {
	            	return true;
	            }
				return !CAppArtifactManager.getInstance().isFolderAnArtifactPath(folder);
            } catch (CoreException e) {
	            log.error(e);
            }
		}
		return true;
	}
}
