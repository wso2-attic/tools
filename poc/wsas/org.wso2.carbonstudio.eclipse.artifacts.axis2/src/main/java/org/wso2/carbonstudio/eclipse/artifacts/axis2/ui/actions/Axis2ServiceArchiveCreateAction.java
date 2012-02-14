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

package org.wso2.carbonstudio.eclipse.artifacts.axis2.ui.actions;

import java.io.File;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.internal.ObjectPluginAction;
import org.wso2.carbonstudio.eclipse.artifacts.axis2.Activator;
import org.wso2.carbonstudio.eclipse.artifacts.axis2.core.Axis2Artifact;
import org.wso2.carbonstudio.eclipse.logging.core.ICarbonStudioLog;
import org.wso2.carbonstudio.eclipse.logging.core.Logger;
import org.wso2.carbonstudio.eclipse.ui.utils.UIDialogs;
import org.wso2.carbonstudio.eclipse.utils.file.FileUtils;

public class Axis2ServiceArchiveCreateAction implements IObjectActionDelegate {
	private static ICarbonStudioLog log=Logger.getLog(Activator.PLUGIN_ID);

	IFile file;

	private Shell shell;
	
	public void setActivePart(IAction arg0, IWorkbenchPart arg1) {
		shell = arg1.getSite().getShell();
	}

	public void run(IAction action) {
		File serviceInfoFile = getServiceInfoFile(file);
		File savePath = UIDialogs.getSavePath(shell,"Select the path to save the axis2 service archive.");
		if (savePath==null){
			return;
		}
		Axis2Artifact axis2Artifact = new Axis2Artifact(serviceInfoFile);
		try {
			axis2Artifact.init();
	        File artifact = axis2Artifact.getArtifact(true);
	        FileUtils.copy(artifact, new File(savePath,axis2Artifact.getServiceName()+".aar"));
        } catch (Exception e) {
	        log.error(e);
        }
	}

	public void selectionChanged(IAction action, ISelection arg1) {
		Object selections = deriveSelection(arg1);
		if (selections!=null && (selections instanceof IFile)) {
			IFile file=(IFile) selections;
			this.file=file;
			if (file.getLocation().getFileExtension().equalsIgnoreCase("service")){
				try {
					File serviceInfoFile = getServiceInfoFile(file);
    				if (!serviceInfoFile.exists()){
    					throw new Exception("Service Info file not present");
    				}
    				Axis2Artifact axis2Artifact = new Axis2Artifact(serviceInfoFile);
	                axis2Artifact.init();
	                action.setEnabled(true);
                } catch (Exception e) {
	                action.setEnabled(false);
                }
			}
		}
	}

	private File getServiceInfoFile(IFile file) {
	    return file.getLocation().toFile();
    }

	public static Object deriveSelection(Object arg) {
		if (arg instanceof ObjectPluginAction) {
			ObjectPluginAction obj = (ObjectPluginAction) arg;
			arg = obj.getSelection();
		}
		if (arg instanceof TreeSelection) {
			TreeSelection tree = (TreeSelection) arg;
			return tree.getFirstElement();
		}
		return null;
	}
}
