/*******************************************************************************
 * Copyright (c) 2006 University College London Software Systems Engineering
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 	Bruno Wassermann - initial API and implementation
 *******************************************************************************/
package org.eclipse.bpel.runtimes.facets;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.bpel.runtimes.IBPELModuleFacetConstants;
import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.wst.common.componentcore.datamodel.FacetInstallDataModelProvider;
import org.eclipse.wst.common.componentcore.datamodel.properties.IFacetDataModelProperties;
import org.eclipse.wst.common.frameworks.datamodel.IDataModel;
import org.eclipse.wst.common.frameworks.internal.datamodel.DataModelImpl;
import org.eclipse.wst.common.project.facet.core.IDelegate;
import org.eclipse.wst.common.project.facet.core.IProjectFacetVersion;

/**
 * BPEL Facet implementation of <code>IDelegate</code>. 
 * <p>
 * Note: Must not call IFacetedProject.modify() to install facet as this is
 * a prohibited operation from a delegate and will throw <code>CoreException</code>.
 *
 * @author Bruno Wassermann, written Jun 7, 2006
 */
public class BPELCoreFacetInstallDelegate implements IDelegate {

	/**
	 * At the moment, there does not appear to be any opportunity to do some
	 * common setup of stuff here (e.g., set up a WEB-INF folder, etc.). 
	 * Maybe some common requirements will become apparent at some later stage.
	 */
	
	/** (non-Javadoc)
	 * @see org.eclipse.wst.common.project.facet.core.IDelegate#execute(org.eclipse.core.resources.IProject, org.eclipse.wst.common.project.facet.core.IProjectFacetVersion, java.lang.Object, org.eclipse.core.runtime.IProgressMonitor)
	 */
	@SuppressWarnings("nls")
	public void execute(IProject proj, 
						IProjectFacetVersion ver, 
						Object obj,
						IProgressMonitor progMon) 
		throws CoreException 
	{
		progMon.beginTask( "Configuring ...", 3 ); //$NON-NLS-1$

		FacetInstallDataModelProvider dmProvider = new FacetInstallDataModelProvider();
		IDataModel dataModel = new DataModelImpl (dmProvider);
		
		progMon.worked(1);		
        try
        {        
        
        	dataModel.setProperty(
					IFacetDataModelProperties.FACET_ID, 
					IBPELModuleFacetConstants.BPEL20_PROJECT_FACET);
			dataModel.setProperty(
					IFacetDataModelProperties.FACET_PROJECT_NAME, 
					proj.getName());
			dataModel.setProperty(
					IFacetDataModelProperties.FACET_VERSION, 
					ver);
			dataModel.setProperty(
					IFacetDataModelProperties.FACET_VERSION_STR, 
					ver.getVersionString());
			dataModel.setProperty(IFacetDataModelProperties.SHOULD_EXECUTE, Boolean.TRUE);
        
        	progMon.worked(1);                
        	
        	
        	// Add the builder to the project description
        	IProjectDescription description = proj.getDescription();
        	
    		// Our builder name
        	String builderName = "org.eclipse.bpel.validator.builder"; //$NON-NLS-1$
        	
        	// Install the builder (validator)
        	
    		ICommand buildCommand = description.newCommand();
    		
    		// We only support 1 argument now, its "debug"
    		Map<String,String> args = new HashMap<String,String>();
    		args.put("debug","false");
    		buildCommand.setArguments(args);
    		
    		buildCommand.setBuilderName( builderName );
    		
    		
    		ICommand [] commands = description.getBuildSpec();
    		
    		if (commands == null) {    			    			
    			description.setBuildSpec( new ICommand[] { buildCommand } );
    			proj.setDescription(description, IResource.KEEP_HISTORY, progMon);
    			
    		} else {
    			
    			boolean bFound = false;
    			for(ICommand c : commands) {
    				if (builderName.equals(c.getBuilderName())) {
    					bFound = true;
    					break;
    				}
    			}    		
    			
    			//  not found
    			if (bFound == false) {
    				int i = commands.length;
    				ICommand [] newCommands = new ICommand [ i + 1 ];
    				System.arraycopy(commands, 0, newCommands, 0, i);
    				newCommands [ i ] = buildCommand;
    				description.setBuildSpec( newCommands );
    				proj.setDescription(description, IResource.KEEP_HISTORY, progMon);
    			}    			
    		}    		    		
    		
        	progMon.worked( 1 );
        }
        finally
        {
            progMon.done();
        }
	}
	
}
