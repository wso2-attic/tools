package org.wso2.carbonstudio.eclipse.artifact.sequence.validators;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.wso2.carbonstudio.eclipse.platform.core.model.AbstractListDataProvider;
import org.wso2.carbonstudio.eclipse.platform.core.project.model.ProjectDataModel;
import org.wso2.carbonstudio.eclipse.utils.file.FileUtils;
import org.wso2.carbonstudio.eclipse.utils.project.ProjectUtils;

public class WorkspaceSequenceList extends AbstractListDataProvider{

	
	public List<ListData> getListData(String modelProperty,
			ProjectDataModel model) {
		List<ListData> list = new ArrayList<ListData>();
		list.add(createListData("", ""));
		try {
			List<File> availableSequences = getAvailableSequences();
			for (File file : availableSequences) {
				list.add(createListData(ProjectUtils.fileNameWithoutExtension(file.getName()), file));
			}
		} catch (CoreException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public List<File> getAvailableSequences() throws CoreException, IOException{
		List<File> availableSeqList = new ArrayList<File>();
		List<File> allMatchingFiles = new ArrayList<File>();
		IProject[] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
		for (IProject workspaceProject : projects) {
			if (workspaceProject.isOpen()) {
				if (workspaceProject
						.hasNature("org.wso2.carbonstudio.eclipse.esb.project.nature")) {
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
			if(content.contains("<sequence xmlns=")){
				if(!availableSeqList.contains(xmlFile)){
					availableSeqList.add(xmlFile);
				}
			}
		}
		
		return availableSeqList;
	}

}
