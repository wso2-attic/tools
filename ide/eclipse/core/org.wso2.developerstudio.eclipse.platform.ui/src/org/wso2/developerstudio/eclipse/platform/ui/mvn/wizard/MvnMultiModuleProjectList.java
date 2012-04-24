package org.wso2.developerstudio.eclipse.platform.ui.mvn.wizard;

import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.FactoryConfigurationError;

import org.apache.maven.model.Dependency;
import org.apache.maven.project.MavenProject;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.wso2.developerstudio.eclipse.logging.core.IDeveloperStudioLog;
import org.wso2.developerstudio.eclipse.logging.core.Logger;
import org.wso2.developerstudio.eclipse.platform.core.model.AbstractListDataProvider;
import org.wso2.developerstudio.eclipse.platform.core.model.AbstractListDataProvider.ListData;
import org.wso2.developerstudio.eclipse.platform.core.project.model.ProjectDataModel;
import org.wso2.developerstudio.eclipse.platform.core.utils.Constants;
import org.wso2.developerstudio.eclipse.platform.ui.Activator;



public class MvnMultiModuleProjectList   extends AbstractListDataProvider {
	
private static IDeveloperStudioLog log=Logger.getLog(Activator.PLUGIN_ID);

	public List<ListData> getListData(String modelProperty,ProjectDataModel model) {
		List<ListData> list = new ArrayList<ListData>();
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IWorkspaceRoot root = workspace.getRoot();
		IProject[] projects = root.getProjects();
		for (IProject project : projects) {
			try{
				if(project.isOpen()){
					if(project.hasNature(Constants.AXIS2_PROJECT_NATURE) ||
					   project.hasNature(Constants.BPEL_PROJECT_NATURE) ||
					   project.hasNature(Constants.DS_PROJECT_NATURE) ||
					   project.hasNature(Constants.DS_VALIDATOR_PROJECT_NATURE) ||
					   project.hasNature(Constants.ESB_PROJECT_NATURE) ||
					   project.hasNature(Constants.JAXWS_PROJECT_NATURE) ||
					   project.hasNature(Constants.WEBAPP_PROJECT_NATURE) ||
					   project.hasNature(Constants.GADGET_PROJECT_NATURE) ||
					   project.hasNature(Constants.LIBRARY_PROJECT_NATURE) ||
					   project.hasNature(Constants.MEDIATOR_PROJECT_NATURE) ||
					   project.hasNature(Constants.REGISTRY_FILTER_PROJECT_NATURE) ||
					   project.hasNature(Constants.REGISTRY_HANDLER_PROJECT_NATURE) ||
					   project.hasNature(Constants.GENERAL_PROJECT_NATURE) ||
					   project.hasNature(Constants.CARBON_UI_PROJECT_NATURE) ||
					   project.hasNature(Constants.DISTRIBUTION_PROJECT_NATURE)){
						 
					  ListData data = new ListData(project.getName(), project);
					  list.add(data);
					}
				}
			 } catch (Exception e) {
				log.error("Error reading project list", e);
			}
		}
		return list;
	}
	
}
	