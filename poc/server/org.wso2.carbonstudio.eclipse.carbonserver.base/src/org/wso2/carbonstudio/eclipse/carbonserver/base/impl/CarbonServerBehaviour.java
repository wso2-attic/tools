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

package org.wso2.carbonstudio.eclipse.carbonserver.base.impl;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.jdt.launching.IJavaLaunchConfigurationConstants;
import org.eclipse.jdt.launching.IRuntimeClasspathEntry;
import org.eclipse.jdt.launching.IVMInstall;
import org.eclipse.jdt.launching.JavaRuntime;
import org.eclipse.jst.server.generic.core.internal.CorePlugin;
import org.eclipse.jst.server.generic.core.internal.GenericServer;
import org.eclipse.jst.server.generic.core.internal.GenericServerBehaviour;
import org.eclipse.jst.server.generic.core.internal.GenericServerCoreMessages;
import org.eclipse.jst.server.generic.core.internal.GenericServerRuntime;
import org.eclipse.jst.server.generic.core.internal.Trace;
import org.eclipse.osgi.util.NLS;
import org.eclipse.wst.server.core.IModule;
import org.eclipse.wst.server.core.IServer;
import org.eclipse.wst.server.core.ServerPort;
import org.eclipse.wst.server.core.internal.DeletedModule;
import org.eclipse.wst.server.core.util.SocketUtil;
import org.wso2.carbonstudio.eclipse.carbonserver.base.interfaces.ICarbonServerBehavior;
import org.wso2.carbonstudio.eclipse.carbonserver.base.monitor.CarbonPingThread;
import org.wso2.carbonstudio.eclipse.utils.file.FileUtils;

public abstract class CarbonServerBehaviour extends GenericServerBehaviour implements
		ICarbonServerBehavior {
	
	String originalWSASServerRepo=null;
	private boolean serverisStillStarting=false;
	
//	protected void shutdown(int state) {
//		GenericServerRuntime runtime = getRuntimeDelegate();
//		try {
//			Trace.trace(Trace.FINEST, "Stopping Server"); //$NON-NLS-1$
//			if (state != IServer.STATE_STOPPED)
//				setServerState(IServer.STATE_STOPPING);
//			String configTypeID = getConfigTypeID(); 
//			ILaunchManager mgr = DebugPlugin.getDefault().getLaunchManager();
//			ILaunchConfigurationType type = mgr.getLaunchConfigurationType(configTypeID);
//			String launchName = getStopLaunchName();
//			String uniqueLaunchName = mgr.generateUniqueLaunchConfigurationNameFrom(launchName);
//			ILaunchConfiguration conf = null;
//			ILaunchConfiguration[] lch = mgr.getLaunchConfigurations(type);
//			for (int i = 0; i < lch.length; i++) {
//				if (launchName.equals(lch[i].getName())) {
//					conf = lch[i];
//					break;
//				}
//			}
//			((org.eclipse.debug.core.model.RuntimeProcess)process.getLaunch().getProcesses()[0])
//			ILaunchConfigurationWorkingCopy wc = null;
//			if (conf != null) {
//				wc = conf.getWorkingCopy();
//			} else {
//				wc = type.newInstance(null, uniqueLaunchName);
//			}
//			
//			// To stop from appearing in history lists
//			wc.setAttribute(IDebugUIConstants.ATTR_PRIVATE, true);		
//			// Set the stop attribute so that we know we are stopping
//			wc.setAttribute(ATTR_STOP, "true"); //$NON-NLS-1$
//			// Set the server ID so that we can distinguish stops
//			wc.setAttribute( ATTR_SERVER_ID, this.getServer().getId());
//			// Setup the launch config for stopping the server
//			setupStopLaunchConfiguration(runtime, wc);
//			
//			// Launch the stop launch config
//			wc.launch(ILaunchManager.RUN_MODE, new NullProgressMonitor());
//
//		} catch (Exception e) {
//			Trace.trace(Trace.SEVERE, "Error stopping Server", e); //$NON-NLS-1$
//		}
//    }
//	
	public void stop(boolean force) {
		//getServer()
		doServerStoppedTasks();
		if (force) {
			terminate();
			return;
		}
		int state = getServer().getServerState();
		if (state == IServer.STATE_STOPPED)
			return;
		else {//if (state == IServer.STATE_STARTING || state == IServer.STATE_STOPPING) {
			terminate();
			return;
		}
//		shutdown(state);
    }
	
	private void unpublishAllModules(){
		IModule[] modules = getServer().getModules();
		for(IModule module:modules){
			//ServiceModuleOperations serviceModuleOperation = new ServiceModuleOperations(module.getProject(),getServer());
			//serviceModuleOperation.unpublishServiceModule(null, null);
		}
	}
	
    protected List serverClasspath(String cpRef) {
    	List classpathEntries = super.serverClasspath(cpRef);
    	ArrayList newClasspathEntries=new ArrayList(); 
    	for(Object o:classpathEntries){
    		IRuntimeClasspathEntry runtimeClassPathEntry=(IRuntimeClasspathEntry)o;
    		String path = runtimeClassPathEntry.getPath().toOSString();
    		File classPath = new File(path);
    		newClasspathEntries.add(runtimeClassPathEntry);
    		if (classPath.isDirectory()){
    			for(String cpath:classPath.list()){
    				Path newCPath = new Path(FileUtils.addAnotherNodeToPath(path,cpath));
    				String fileExtension = newCPath.getFileExtension();
    				if (fileExtension!=null && fileExtension.equalsIgnoreCase("jar"))
    					newClasspathEntries.add(JavaRuntime.newArchiveRuntimeClasspathEntry(newCPath));
    			}
    		}
    	}
    	return newClasspathEntries;
    }
    
	public static ServerPort[] getServerPorts(IServer server){
		GenericServer gserver=(GenericServer) server.getAdapter(GenericServer.class);
		return gserver.getServerPorts();
	}
    
	protected abstract String[] getPingURLList();
	
    protected void startPingThread()
    {
    	try {
    		setServerisStillStarting(true);
    		String url = "http://"+getServer().getHost();
    		String[] urls=getPingURLList();;
	    	if(urls==null || urls.length==0){
	    		Trace.trace(Trace.SEVERE, "Can't ping for server startup."); 
	    		return;
	    	}
    		ping = new CarbonPingThread(getServer(), urls, this);
    	} catch (Exception e) {
    		Trace.trace(Trace.SEVERE, "Can't ping for server startup."); 
    	}  	
    }

 	public void setServerStarted() {
 		if (isServerisStillStarting()){
 			setServerisStillStarting(false);
 			doServerStartedTasks();
 			super.setServerStarted();
 		}
 	}
 	
	private boolean isRemote(){
		return (getServer().getServerType().supportsRemoteHosts()&& !SocketUtil.isLocalhost(getServer().getHost()) );
	}	
	
    protected List getStartClasspath() {
    	String cpRef = getServerDefinition().getStart().getClasspathReference();
    	return serverClasspath(cpRef);
    }
    
    private String getWorkingDirectory() {
    	return getServerDefinition().getResolver().resolveProperties(getServerDefinition().getStart().getWorkingDirectory());
    }
    
 	public void setupLaunchConfiguration(ILaunchConfigurationWorkingCopy workingCopy, IProgressMonitor monitor) throws CoreException {
		if(isRemote())// No launch for remote servers.
			return;
    	workingCopy.setAttribute(
                IJavaLaunchConfigurationConstants.ATTR_MAIN_TYPE_NAME,
                getStartClassName());

        GenericServerRuntime runtime = getRuntimeDelegate();

        IVMInstall vmInstall = runtime.getVMInstall();
        workingCopy.setAttribute(
                IJavaLaunchConfigurationConstants.ATTR_VM_INSTALL_TYPE, runtime
                        .getVMInstallTypeId());
        workingCopy.setAttribute(
                IJavaLaunchConfigurationConstants.ATTR_VM_INSTALL_NAME,
                vmInstall.getName());

        setupLaunchClasspath(workingCopy, vmInstall, getStartClasspath());


        workingCopy.setAttribute(
                IJavaLaunchConfigurationConstants.ATTR_WORKING_DIRECTORY,
                getWorkingDirectory());
        

        Map environVars = getEnvironmentVariables(getServerDefinition().getStart());
        environVars.put("JAVA_HOME", "/home/saminda/software/jdk1.6.0_20");
        if(!environVars.isEmpty()){
        	workingCopy.setAttribute(ILaunchManager.ATTR_ENVIRONMENT_VARIABLES,environVars);
        }
        
        String existingProgArgs  = workingCopy.getAttribute(IJavaLaunchConfigurationConstants.ATTR_PROGRAM_ARGUMENTS, (String)null);
        String serverProgArgs =  getProgramArguments();
        if( existingProgArgs==null ) {
            workingCopy.setAttribute(IJavaLaunchConfigurationConstants.ATTR_PROGRAM_ARGUMENTS,serverProgArgs);
        }
        String previousVMArgument = workingCopy.getAttribute("earlier_vmarguments",(String)null);
        String serverVMArgs= getVmArguments();
        String existingVMArgs = null;
        if (serverVMArgs.equals(previousVMArgument)){
        	existingVMArgs = workingCopy.getAttribute(IJavaLaunchConfigurationConstants.ATTR_VM_ARGUMENTS,(String)null);
        }else{
        	workingCopy.setAttribute("earlier_vmarguments", serverVMArgs);	
        }
        if( existingVMArgs==null ) {
            workingCopy.setAttribute(IJavaLaunchConfigurationConstants.ATTR_VM_ARGUMENTS,serverVMArgs);
        }
	}
 	
    protected String getVmArguments() {
    	String vmParameters = getServerDefinition().getResolver().resolveProperties(getServerDefinition().getStart().getVmParametersAsString());
//    	String serverLocalWorkspacePath = CarbonServerUtils.getCarbonHome(getServer()).toOSString();
//    	String serverXmlPathFromLocalWorkspaceRepo = CarbonServerUtils.getServerXmlPathFromLocalWorkspaceRepo(serverLocalWorkspacePath);
//    	String transportsXmlPathFromLocalWorkspaceRepo = CarbonServerUtils.getTransportsXmlPathFromLocalWorkspaceRepo(serverLocalWorkspacePath);
//    	vmParameters=vmParameters+" -Dwso2.carbon.xml=\""+serverXmlPathFromLocalWorkspaceRepo+"\"";
//    	vmParameters=vmParameters+" -Dwso2.transports.xml=\""+transportsXmlPathFromLocalWorkspaceRepo+"\"";
//    	vmParameters=vmParameters+" -Dcomponents.repo=\""+serverLocalWorkspacePath+"/repository/components/plugins\"";
    	return vmParameters;
    }
    
    private void checkClosed(IModule[] module) throws CoreException
    {
    	for( int i=0; i < module.length; i++ ){
    		if( module[i] instanceof DeletedModule ){	
                IStatus status = new Status(IStatus.ERROR,CorePlugin.PLUGIN_ID,0, NLS.bind(GenericServerCoreMessages.canNotPublishDeletedModule,module[i].getName()),null);
                throw new CoreException(status);
    		}
    	}
    }
    
    public void publishModule(int kind, int deltaKind, IModule[] module,
            IProgressMonitor monitor) throws CoreException {
//    	IModule m = module[module.length - 1];
//    	if(deltaKind == ADDED){
//    		checkClosed(module);
//    		ServerController.getInstance().getServerManager().publishServiceModule(getServer().getId(), "",m.getName());
//    	}else if(deltaKind == REMOVED){
//    		ServerController.getInstance().getServerManager().unpublishServiceModule(getServer().getId(), "",m.getName());
//        }else{
//    		checkClosed(module);
//    		//To add any new services
//    		ServerController.getInstance().getServerManager().publishServiceModule(getServer().getId(), "",m.getName());
//    		ServerController.getInstance().getServerManager().hotUpdateServiceModule(getServer().getId(), "",m.getName());
//    	}
//        setModulePublishState( module, null );
    }
    private void setModulePublishState( IModule[] module, IStatus[] status ) throws CoreException {
//        if( module==null )
//            return;
//        for( int i=0; i < module.length; i++)
//        {
//            if(status == null ||
//                    status.length < i ||
//                    status[i]==null || 
//                    status[i].getSeverity() == IStatus.OK )
//            {
//            setModulePublishState(module, IServer.PUBLISH_STATE_NONE);    
//            }
//            else
//            {
//                if ( IStatus.ERROR == status[i].getSeverity() ){
//                    setModulePublishState( module, IServer.PUBLISH_STATE_UNKNOWN );
//                    throw new CoreException( status[i] );
//                }
//            }
//        }
    }
    
    protected void doServerStartedTasks(){
    }
    
    private void doServerStoppedTasks(){
		//unpublishAllModules();
    }

	public void setServerisStillStarting(boolean serverisStillStarting) {
	    this.serverisStillStarting = serverisStillStarting;
    }

	public boolean isServerisStillStarting() {
	    return serverisStillStarting;
    }
    
//    private void doBrowserPopup(){
//    	String resolveProperties = WSASServer31Utils.resolveProperties(getServer(), "carbon.browser");
//    	if (resolveProperties.equalsIgnoreCase("true")){
//    		WSASUoloadServiceRequestUtil uoloadServiceRequestUtil = WSASUoloadServiceRequestUtil.getInstance();
//    		uoloadServiceRequestUtil.popupExternalBrowser(CommonOperations.getLocalServerPort(getServer())+"/carbon");
//    		//uoloadServiceRequestUtil.popupInternalBrowser(CommonOperations.getLocalServerPort(getServer())+"/carbon");
//    	}
//    		
//    }
}
