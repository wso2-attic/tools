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

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.wso2.developerstudio.eclipse.capp.core.artifacts.ICAppArtifactHandler;
import org.wso2.developerstudio.eclipse.capp.core.manifest.Artifact;
import org.wso2.developerstudio.eclipse.capp.core.manifest.ArtifactDependency;
import org.wso2.developerstudio.eclipse.capp.project.manager.CAppArtifactManager;
import org.wso2.developerstudio.eclipse.capp.project.utils.CAppImageUtils;
import org.wso2.developerstudio.eclipse.ui.image.OverlayImageDescriptor;

public class ArtifactLabelProvider extends LabelProvider{
	
	boolean isSuperArtifact = false;
	public ArtifactLabelProvider(boolean superArtifact){
		this.isSuperArtifact = superArtifact;
	}

	public Image getImage(Object element) {
		if (element instanceof Artifact){
			Artifact artifact=(Artifact)element;
			ImageDescriptor imgDescriptor = CAppImageUtils.getInstance().getImageDescriptor("artifact.png");
			ICAppArtifactHandler artifactHandler = CAppArtifactManager.getInstance().getArtifactHandler(artifact);
			ImageDescriptor overlayImageDescription;
			if (artifactHandler!=null){
				overlayImageDescription = new OverlayImageDescriptor(imgDescriptor,artifactHandler.getArtifactOverlayIcon());
			}else{
				overlayImageDescription=imgDescriptor;
			}
			return overlayImageDescription.createImage();
		} else if (element instanceof ArtifactDependency){
			ArtifactDependency dependency=(ArtifactDependency)element;
			ImageDescriptor imgDescriptor;
			if (dependency.isInclude()){
				imgDescriptor = CAppImageUtils.getInstance().getImageDescriptor("artifact-remote.png");
			}else{
				imgDescriptor = CAppImageUtils.getInstance().getImageDescriptor("artifact.png");
			}
			return imgDescriptor.createImage();
		}
	    return super.getImage(element);
	}
	
	public String getText(Object element) {
		if (element instanceof Artifact){
			if(isSuperArtifact){
				return ((Artifact) element).getCaption() + " [" + ((Artifact) element).getServerRole() + "]" ;	
			}else{
				return ((Artifact) element).getCaption();
			}
		} else if (element instanceof ArtifactDependency){
			return element.toString();
		}
	    return super.getText(element);
	}
	
}
