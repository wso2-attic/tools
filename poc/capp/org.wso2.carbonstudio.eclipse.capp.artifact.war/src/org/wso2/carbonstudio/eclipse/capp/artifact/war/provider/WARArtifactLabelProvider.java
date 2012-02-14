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

package org.wso2.carbonstudio.eclipse.capp.artifact.war.provider;

import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;
import org.wso2.carbonstudio.eclipse.capp.artifact.war.Activator;
import org.wso2.carbonstudio.eclipse.capp.artifact.war.model.WARArtifactLocationNode;

public class WARArtifactLabelProvider implements ICommonLabelProvider {

	public void init(ICommonContentExtensionSite arg0) {
	}


	public Image getImage(Object arg0) {
		if (arg0 instanceof WARArtifactLocationNode){
            ImageDescriptor imageDescriptor = null;
            IPath path = new Path("icons/axis2Folder.png");
            URL gifImageURL = FileLocator.find(Platform.getBundle(Activator.PLUGIN_ID), path, null);
            if (gifImageURL != null){
                    imageDescriptor = ImageDescriptor.createFromURL(gifImageURL);
            }
            return imageDescriptor.createImage();
		}
		return null;
	}


	public String getText(Object arg0) {
		if (arg0 instanceof WARArtifactLocationNode){
			WARArtifactLocationNode node=(WARArtifactLocationNode)arg0;
			return node.toString();
		}
		return "";
	}


	public void addListener(ILabelProviderListener arg0) {

	}


	public void dispose() {

	}


	public boolean isLabelProperty(Object arg0, String arg1) {
		return false;
	}


	public void removeListener(ILabelProviderListener arg0) {

	}


	public void restoreState(IMemento arg0) {

	}


	public void saveState(IMemento arg0) {

	}


	public String getDescription(Object arg0) {
		return "";
	}

}
