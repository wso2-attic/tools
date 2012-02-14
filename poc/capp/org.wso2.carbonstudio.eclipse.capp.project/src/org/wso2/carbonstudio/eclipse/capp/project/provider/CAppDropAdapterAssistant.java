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

package org.wso2.carbonstudio.eclipse.capp.project.provider;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.swt.dnd.DropTargetEvent;
import org.eclipse.swt.dnd.TransferData;
import org.eclipse.ui.navigator.CommonDropAdapter;
import org.eclipse.ui.navigator.CommonDropAdapterAssistant;
import org.wso2.carbonstudio.eclipse.capp.core.manifest.Artifact;
import org.wso2.carbonstudio.eclipse.capp.project.Activator;
import org.wso2.carbonstudio.eclipse.capp.project.model.ArtifactNode;
import org.wso2.carbonstudio.eclipse.capp.project.model.ServerRoleNode;
import org.wso2.carbonstudio.eclipse.logging.core.ICarbonStudioLog;
import org.wso2.carbonstudio.eclipse.logging.core.Logger;

public class CAppDropAdapterAssistant extends CommonDropAdapterAssistant {
	private static ICarbonStudioLog log=Logger.getLog(Activator.PLUGIN_ID);

	public IStatus handleDrop(CommonDropAdapter arg0, DropTargetEvent event, Object obj) {
		if (event.data instanceof TreeSelection){
			TreeSelection selection=(TreeSelection)event.data;
			if (selection!=null && selection.getFirstElement() instanceof ArtifactNode && obj instanceof ServerRoleNode){
				ArtifactNode fromNode=(ArtifactNode)selection.getFirstElement();
				ServerRoleNode toNode=(ServerRoleNode)obj;
				Artifact aritfact = fromNode.getAritfact();
				aritfact.setServerRole(toNode.getServerRole().getServerRoleName());
				try {
	                aritfact.toFile();
	                return Status.OK_STATUS;
                } catch (Exception e) {
	                log.error(e);
	                return new Status(Status.ERROR,Activator.PLUGIN_ID,e.getMessage());
                }
			}
		}
		
		return Status.CANCEL_STATUS;
	}

	public IStatus validateDrop(Object arg0, int arg1, TransferData arg2) {
		return Status.OK_STATUS;
	}

}
