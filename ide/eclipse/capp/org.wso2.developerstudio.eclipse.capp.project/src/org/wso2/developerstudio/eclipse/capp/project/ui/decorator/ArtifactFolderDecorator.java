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

package org.wso2.developerstudio.eclipse.capp.project.ui.decorator;

import org.eclipse.core.resources.IFolder;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IBaseLabelProvider;
import org.eclipse.jface.viewers.IDecoration;
import org.eclipse.jface.viewers.ILightweightLabelDecorator;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.LabelProviderChangedEvent;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IDecoratorManager;
import org.eclipse.ui.PlatformUI;
import org.wso2.developerstudio.eclipse.capp.core.artifacts.ICAppArtifactHandler;
import org.wso2.developerstudio.eclipse.capp.core.manifest.Artifact;
import org.wso2.developerstudio.eclipse.capp.project.Activator;
import org.wso2.developerstudio.eclipse.capp.project.manager.CAppArtifactManager;
import org.wso2.developerstudio.eclipse.logging.core.IDeveloperStudioLog;
import org.wso2.developerstudio.eclipse.logging.core.Logger;

public class ArtifactFolderDecorator extends LabelProvider implements ILightweightLabelDecorator {
	private static IDeveloperStudioLog log=Logger.getLog(Activator.PLUGIN_ID);

	public void decorate(Object element, IDecoration decoration) {
		if (element instanceof IFolder) {
			IFolder folder = (IFolder) element;
			Artifact artifact = null;
			CAppArtifactManager instance = CAppArtifactManager.getInstance();
            try {
	            artifact = instance.getArtifact(folder);
            } catch (Exception e) {
	            log.error(e);
            }
			if (artifact!=null){
				ICAppArtifactHandler handler=instance.getArtifactHandler(artifact);
				if (handler!=null){
					ImageDescriptor imageDescriptor = handler.getArtifactOverlayIcon();
    				if (imageDescriptor != null) {
    					decoration.addOverlay(imageDescriptor);
    				}
    				decoration.addSuffix(" "+artifact.getType()+" | "+artifact.getName()+"_"+artifact.getVersion()+"@["+artifact.getServerRole()+"]");
				}
			}
		}
	}
	public void refresh(final Object[] resources) {
		final LabelProviderChangedEvent labelProviderChangedEvent = new LabelProviderChangedEvent(
																					this, resources);
		Display.getDefault().asyncExec(new Runnable() {
			public void run() {
				fireLabelProviderChanged(labelProviderChangedEvent);
			}
		});
	}
	
	private static ArtifactFolderDecorator getArtifactFolderDecoratorInstance() {
		String id="org.wso2.developerstudio.eclipse.capp.artifact.decorators.folderDecorator";
		IDecoratorManager decoratorManager = PlatformUI.getWorkbench().getDecoratorManager();
		String decoratorId = id;
		IBaseLabelProvider baseLabelProvider = decoratorManager.getBaseLabelProvider(decoratorId);
		if (baseLabelProvider == null) {
			decoratorManager = Activator.getDefault().getWorkbench().getDecoratorManager();
			baseLabelProvider = decoratorManager.getBaseLabelProvider(decoratorId);
			if (baseLabelProvider == null){
				baseLabelProvider = decoratorManager.getLabelDecorator(decoratorId);
			}
		}
		return (ArtifactFolderDecorator) baseLabelProvider;
	}
	
	public static void refreshResources(Object[] objects) {
		ArtifactFolderDecorator artifactFolderDecoratorInstance = getArtifactFolderDecoratorInstance();
		if (artifactFolderDecoratorInstance != null){
			artifactFolderDecoratorInstance.refresh(objects);
		}
	}
}
