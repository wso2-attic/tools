/*
 * Copyright (c) 2012, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
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

package org.wso2.developerstudio.eclipse.carbonserver.base.internal;

import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jst.server.generic.core.internal.GenericServer;
import org.eclipse.jst.server.generic.core.internal.GenericServerRuntime;
import org.eclipse.jst.server.generic.servertype.definition.Property;
import org.eclipse.jst.server.generic.servertype.definition.ServerRuntime;
import org.eclipse.jst.server.generic.ui.internal.GenericServerComposite;
import org.eclipse.jst.server.generic.ui.internal.GenericServerCompositeDecorator;
import org.eclipse.jst.server.generic.ui.internal.GenericServerWizardFragment;
import org.eclipse.jst.server.generic.ui.internal.ServerTypeDefinitionServerDecorator;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.wst.server.core.IRuntime;
import org.eclipse.wst.server.core.IServerWorkingCopy;
import org.eclipse.wst.server.core.TaskModel;
import org.eclipse.wst.server.ui.wizard.IWizardHandle;
import org.wso2.developerstudio.eclipse.carbonserver.base.manager.IProperties;

@SuppressWarnings("restriction")
public class CarbonServerWizardFragment extends GenericServerWizardFragment {
	private GenericServerCompositeDecorator[] decorators;

	public void createContent(Composite parent, IWizardHandle handle) {
		IServerWorkingCopy server = getServer();
		GenericServer dl = (GenericServer) server.loadAdapter(GenericServer.class, null);
		IRuntime runtime = dl.getServerWorkingCopy().getRuntime();
		String location =runtime.getLocation().toOSString();
		Map temserverInstanceProperties = dl.getServerInstanceProperties();
		ServerRuntime definition = getServerTypeDefinitionFor(server);
		String id = definition.getId();
		EList property = definition.getProperty();
		IExtensionRegistry extensionRegistry = Platform.getExtensionRegistry();
		String PORT_ID="org.wso2.developerstudio.eclipse.carbonserver.base.serverProperties";
		IConfigurationElement[] configurationElementsFor = extensionRegistry.getConfigurationElementsFor(PORT_ID);
		for (IConfigurationElement e : configurationElementsFor) {
			 String attribute = e.getAttribute("serverId");
			 if(id.equals(attribute)){
				 Object o=null;
					try {
						o = e.createExecutableExtension("class");
						  if (o instanceof IProperties) {
					        	IProperties iPropertyManager = (IProperties)o;
						Map<String, String> serverInstanceProperties = iPropertyManager
								.getServerInstanceProperties(location);
					            for (Object object : property) {
						              Property p = (Property) object;					              
						              String strPort = serverInstanceProperties.get(p.getId());
						              if(strPort!=null){
						            	  p.setDefault(strPort);
						            	  temserverInstanceProperties.put(p.getId(), strPort);
						              }

								 }
					         dl.setServerInstanceProperties(temserverInstanceProperties); 
					    	 dl.saveConfiguration(new NullProgressMonitor());
					        }
					  } catch (CoreException e1) {
				  } 
			 }
		}      
		decorators = new GenericServerCompositeDecorator[1];
		decorators[0] = new ServerTypeDefinitionServerDecorator(definition, null, getWizard(), dl);
		new GenericServerComposite(parent, decorators);
	}

	/**
	 * @param server
	 * @return
	 */
	private ServerRuntime getServerTypeDefinitionFor(IServerWorkingCopy server) {
		GenericServerRuntime runtime = (GenericServerRuntime) server.getRuntime().getAdapter(
				GenericServerRuntime.class);
		if (runtime == null) {
			IRuntime wc = (IRuntime) getTaskModel().getObject(TaskModel.TASK_RUNTIME);
			runtime = (GenericServerRuntime) wc.getAdapter(GenericServerRuntime.class);
			if (runtime == null)
				runtime = (GenericServerRuntime) wc.loadAdapter(GenericServerRuntime.class,
						new NullProgressMonitor());
		}
		String serverTyepId = server.getServerType().getId();
		String runtimeTypeId = runtime.getRuntime().getRuntimeType().getId();
		if (runtimeTypeId == null) {
			return null;
		}
		Map runtimeProperties = runtime.getServerInstanceProperties();
		ServerRuntime definition = getServerTypeDefinition(serverTyepId, runtimeTypeId,
				runtimeProperties);
		return definition;
	}

	/**
	 * @return
	 */
	private IServerWorkingCopy getServer() {
		IServerWorkingCopy server = (IServerWorkingCopy) getTaskModel().getObject(
				TaskModel.TASK_SERVER);
		return server;
	}

	 public void enter() {
	        if(decorators == null ){
	            return;
	        }
	        for( int i = 0; i < decorators.length; i++ )
	        {
	            if( decorators[i].validate() )//failed do not continue
	                return;
	        }
	    }

	    public void exit() {
	        if(decorators == null ){
	            return;
	        }
	        // validate needed to save the latest values.
	        for( int i = 0; i < decorators.length; i++ )
	        {
	            if( decorators[i].validate() )//failed do not continue
	                return;
	        }
	    }

}