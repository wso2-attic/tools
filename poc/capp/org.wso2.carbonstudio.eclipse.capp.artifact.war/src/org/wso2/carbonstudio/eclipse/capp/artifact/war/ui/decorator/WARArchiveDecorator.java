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

package org.wso2.carbonstudio.eclipse.capp.artifact.war.ui.decorator;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.ILabelDecorator;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.wso2.carbonstudio.eclipse.capp.artifact.war.utils.WARImageUtils;

public class WARArchiveDecorator extends LabelProvider implements ILabelDecorator{

	public Image getImage(Object element) {
		if (element instanceof IFile){
			if (((IFile)element).getFileExtension().equalsIgnoreCase("war")){
				return WARImageUtils.getInstance().getImageDescriptor("war-16x16.png").createImage();
			}
				
		}
	    return super.getImage(element);
	}

    public Image decorateImage(Image arg0, Object element) {
		if (((IFile)element).getFileExtension().equalsIgnoreCase("war")){
			return WARImageUtils.getInstance().getImageDescriptor("war-16x16.png").createImage();
		}
		return arg0;
    }

    public String decorateText(String arg0, Object element) {
	    return arg0;
    }
}
