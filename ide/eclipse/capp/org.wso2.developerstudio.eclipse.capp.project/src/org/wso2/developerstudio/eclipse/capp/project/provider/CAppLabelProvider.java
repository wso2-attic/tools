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

package org.wso2.developerstudio.eclipse.capp.project.provider;

import org.eclipse.swt.graphics.Image;
import org.wso2.developerstudio.eclipse.capp.core.artifacts.ICAppArtifactHandler;
import org.wso2.developerstudio.eclipse.capp.core.artifacts.manager.CAppEnvironment;
import org.wso2.developerstudio.eclipse.capp.core.provider.EmptyNavigatorLabelProvider;
import org.wso2.developerstudio.eclipse.capp.project.manager.CAppArtifactManager;
import org.wso2.developerstudio.eclipse.capp.project.model.ArtifactNode;
import org.wso2.developerstudio.eclipse.capp.project.model.ServerRoleCollectionNode;
import org.wso2.developerstudio.eclipse.capp.project.model.ServerRoleNode;
import org.wso2.developerstudio.eclipse.capp.project.utils.CAppImageUtils;

public class CAppLabelProvider extends EmptyNavigatorLabelProvider {


	public Image getImage(Object obj) {
		if (obj instanceof ServerRoleCollectionNode){
			return CAppImageUtils.getInstance().getImageDescriptor("ServerRoleCollectionNode.png").createImage();
    	} else if (obj instanceof ServerRoleNode){
    		if (CAppEnvironment.getDefaultServerRole().getServerRoleName().equals(((ServerRoleNode)obj).getServerRole().getServerRoleName())){
    			return CAppImageUtils.getInstance().getImageDescriptor("ServerRoleNode_locked.png").createImage();
    		}else{
    			return CAppImageUtils.getInstance().getImageDescriptor("ServerRoleNode.png").createImage();
    		}
    	} else if (obj instanceof ArtifactNode){
    		ICAppArtifactHandler artifactHandler = CAppArtifactManager.getInstance().getArtifactHandler(((ArtifactNode)obj).getAritfact());
    		if (artifactHandler == null) {
    			return CAppImageUtils.getInstance().getImageDescriptor("artifact.png").createImage();
    		} else {
    			return artifactHandler.getArtifactIcon().createImage();
            }
    	}
		return null;
	}

	public String getText(Object obj) {
		if (obj instanceof ServerRoleCollectionNode){
    		return ((ServerRoleCollectionNode)obj).getCaption();
    	}else if (obj instanceof ServerRoleNode){
    		return ((ServerRoleNode)obj).getCaption();
    	}else if (obj instanceof ArtifactNode){
    		return ((ArtifactNode)obj).getCaption();
    	}
		return "";
	}

}
