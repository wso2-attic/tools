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

package org.wso2.carbonstudio.eclipse.capp.artifact.axis2.provider;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;
import org.wso2.carbonstudio.eclipse.capp.artifact.axis2.Activator;
import org.wso2.carbonstudio.eclipse.capp.artifact.axis2.model.Axis2ArtifactLocationNode;
import org.wso2.carbonstudio.eclipse.logging.core.ICarbonStudioLog;
import org.wso2.carbonstudio.eclipse.logging.core.Logger;

public class Axis2ArtifactContentProvider implements ICommonContentProvider {
	private static ICarbonStudioLog log=Logger.getLog(Activator.PLUGIN_ID);

	   public void init(ICommonContentExtensionSite arg0) {
	    }

	    public Object[] getChildren(Object obj) {
	    	if (obj instanceof Axis2ArtifactLocationNode){
	    		Axis2ArtifactLocationNode node=(Axis2ArtifactLocationNode)obj;
	    		List<IResource> resources = getResources(node);
//	    		if (resources.size()>0)
	    			return resources.toArray();
//	    		else
//	    			return new Object[]{"<Empty>"};
	    	}
		    return new Object[]{};
	    }

		private List<IResource> getResources(Axis2ArtifactLocationNode node) {
	        final IFolder folder = node.getProject().getFolder(node.getPath());
	        final List<IResource> resources=new ArrayList<IResource>();
	        try {
	            folder.accept(new IResourceVisitor(){

	                public boolean visit(IResource arg0) throws CoreException {
	                	if (folder.getFullPath().toOSString().equals(arg0.getFullPath().toOSString())){
	                		return true;
	                	}else{
	                		resources.add(arg0);
	                		return false;
	                	}
	                }
	            	
	            });
	        } catch (CoreException e) {
	            log.error(e);
	        }
	        return resources;
        }

	    public Object getParent(Object arg0) {
		    return null;
	    }

	    public boolean hasChildren(Object obj) {
	    	if (obj instanceof Axis2ArtifactLocationNode){
	    		Axis2ArtifactLocationNode node=(Axis2ArtifactLocationNode)obj;
	    		return getResources(node).size()>0;
	    	}
	    	return false;
    	}

	    public Object[] getElements(Object arg0) {
		    return getChildren(arg0);
	    }

	    public void dispose() {
	    
	    }

	    public void inputChanged(Viewer arg0, Object arg1, Object arg2) {
		    
	    }

	    public void restoreState(IMemento arg0) {
	    }

	    public void saveState(IMemento arg0) {
	    }


}
