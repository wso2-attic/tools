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

package org.wso2.carbonstudio.eclipse.capp.artifact.axis2.ui.decorator;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.ILabelDecorator;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.wso2.carbonstudio.eclipse.capp.artifact.axis2.utils.Axis2ImageUtils;

public class Axis2ArchiveDecorator extends LabelProvider implements ILabelDecorator{

	public Image getImage(Object element) {
		if (element instanceof IFile){
			IFile file = (IFile)element;
			if ((file).getFileExtension().equalsIgnoreCase("aar")){
				return Axis2ImageUtils.getInstance().getImageDescriptor("axis2.png").createImage();
			}else if ((file).getFileExtension().equalsIgnoreCase("service")){
				return Axis2ImageUtils.getInstance().getImageDescriptor("axis2.png").createImage();
			}
				
		}
	    return super.getImage(element);
	}

    public Image decorateImage(Image arg0, Object element) {
		IFile file = (IFile)element;
		if ((file).getFileExtension().equalsIgnoreCase("aar")){
			return Axis2ImageUtils.getInstance().getImageDescriptor("axis2.png").createImage();
		}else if ((file).getFileExtension().equalsIgnoreCase("service")){
			return Axis2ImageUtils.getInstance().getImageDescriptor("axis2.png").createImage();
		}
		return arg0;
    }

    public String decorateText(String arg0, Object element) {
	    return arg0;
    }
}
