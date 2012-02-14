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

package org.wso2.carbonstudio.eclipse.artifacts.axis2.ui.decorator;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.jface.viewers.IDecoration;
import org.eclipse.jface.viewers.ILightweightLabelDecorator;
import org.eclipse.jface.viewers.LabelProvider;
import org.wso2.carbonstudio.eclipse.artifacts.axis2.Activator;
import org.wso2.carbonstudio.eclipse.artifacts.axis2.utils.Axis2ImageUtils;
import org.wso2.carbonstudio.eclipse.logging.core.ICarbonStudioLog;
import org.wso2.carbonstudio.eclipse.logging.core.Logger;
import org.wso2.carbonstudio.eclipse.utils.wst.Axis2ServiceUtils;

public class Axis2ServiceFolderDecorator extends LabelProvider implements ILightweightLabelDecorator{
	private static ICarbonStudioLog log=Logger.getLog(Activator.PLUGIN_ID);

    public void decorate(Object obj, IDecoration decorator) {
	    if (obj instanceof IFolder){
	    	IFolder folder=(IFolder)obj;
	    	IFile file = folder.getFolder("META-INF").getFile("services.xml");
	    	if (file.exists()){
	    		String serviceName;
                try {
	                serviceName = Axis2ServiceUtils.getServiceNameFromFolder(folder.getLocation().toOSString());
		    		if (serviceName!=null && !serviceName.equals("")){
//		    			decorator.addSuffix(" "+serviceName);
		    			decorator.addOverlay(Axis2ImageUtils.getInstance().getImageDescriptor("axis2.png"));
		    			folder.setPersistentProperty(new QualifiedName("","axis2Service"), "true");
		    		}else{
		    			folder.setPersistentProperty(new QualifiedName("","axis2Service"), "false");
		    		}
	    		} catch (Exception e) {
	    			log.error(e);
                }

	    	}
	    }
    }

}
