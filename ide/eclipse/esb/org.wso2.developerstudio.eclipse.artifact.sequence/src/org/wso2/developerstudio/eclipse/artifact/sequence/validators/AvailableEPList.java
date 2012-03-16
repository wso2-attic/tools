package org.wso2.developerstudio.eclipse.artifact.sequence.validators;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.wso2.developerstudio.eclipse.platform.core.model.AbstractListDataProvider;
import org.wso2.developerstudio.eclipse.platform.core.project.model.ProjectDataModel;
import org.wso2.developerstudio.eclipse.utils.file.FileUtils;
import org.wso2.developerstudio.eclipse.utils.project.ProjectUtils;

public class AvailableEPList extends AbstractListDataProvider{

	
	public List<ListData> getListData(String modelProperty,
			ProjectDataModel model) {
		List<ListData> list = new ArrayList<ListData>();
		list.add(createListData("", ""));
		try {
			List<File> availableEPs = getAvailableEPs();
			for (File file : availableEPs) {
				list.add(createListData(ProjectUtils.fileNameWithoutExtension(file.getName()), file));
			}
		} catch (CoreException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public List<File> getAvailableEPs() throws CoreException, IOException{
		List<File> availableEPList = new ArrayList<File>();
		List<File> allMatchingFiles = new ArrayList<File>();
		IProject[] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
		for (IProject workspaceProject : projects) {
			if (workspaceProject.isOpen()) {
				if (workspaceProject
						.hasNature("org.wso2.developerstudio.eclipse.esb.project.nature")) {
					File[] allFiles = FileUtils.getAllMatchingFiles(
							workspaceProject.getLocation().toOSString(), "",
							"xml", allMatchingFiles);

					for (File file : allFiles) {
						allMatchingFiles.add(file);
					}
				}
			}
		}
		
		for (File xmlFile : allMatchingFiles) {
			String content = FileUtils.getContentAsString(xmlFile);
			if(content.contains("<endpoint xmlns=")){
				if(!availableEPList.contains(xmlFile)){
					availableEPList.add(xmlFile);
				}
			}
		}
		
		return availableEPList;
	}

}
