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

package org.wso2.developerstudio.eclipse.capp.project.property;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.wso2.developerstudio.eclipse.capp.project.utils.CAppConstants;

/**
 *
 */
public class CAppProjectPropertyTester extends PropertyTester{

	/* (non-Javadoc)
     * @see org.eclipse.core.expressions.IPropertyTester#test(java.lang.Object, java.lang.String, java.lang.Object[], java.lang.Object)
     */
    public boolean test(Object arg0, String arg1, Object[] arg2, Object arg3) {
    	if(arg0 instanceof IFolder){
    		if (CAppConstants.CAPP_ARTIFACTS_FOLDER_NAME.equalsIgnoreCase(((IFolder)arg0).getName())  && isCappProject(getParentFolder((IFolder)arg0))) {
				return true;
			}
    	}
	    return false;
    }
    
    
    private IProject getParentFolder(IFolder child){
    	if(child.getParent() instanceof IProject){
    		return child.getParent().getProject(); 
    	}
    	return null;
    }
    
    private boolean isCappProject(IProject project){
    	if(project!= null && project.getFile(".project").exists() && project.getFile(".classpath").exists() && project.getFile(".car").exists()){
    		return true;
    	}
    	return false;
    }

}
