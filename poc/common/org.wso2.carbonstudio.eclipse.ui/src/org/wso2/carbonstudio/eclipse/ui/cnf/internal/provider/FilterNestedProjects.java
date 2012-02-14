package org.wso2.carbonstudio.eclipse.ui.cnf.internal.provider;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

public class FilterNestedProjects extends ViewerFilter {

	@Override
	public boolean select(Viewer arg0, Object parent, Object child) {
		if (parent instanceof IWorkspaceRoot && child instanceof IProject){
			List<String> pathList = getPathList();
			return !pathList.contains(((IProject)child).getLocation().toOSString());
		}
		if (child instanceof IFolder){
			List<String> pathList = getProjectListLocations();
			return !pathList.contains(((IFolder)child).getLocation().toOSString());
		}
		boolean result=true;
		return result;
	}

	public List<String> getPathList(){
		List<String> paths=new ArrayList<String>();
		IProject[] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
		for (IProject project : projects) {
			File location = project.getLocation().toFile();
			addDirectoryPaths(paths, location);
		}
		return paths;
	}

	public List<String> getProjectListLocations(){
		List<String> paths=new ArrayList<String>();
		IProject[] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
		for (IProject project : projects) {
			paths.add(project.getLocation().toOSString());
		}
		return paths;
	}
	
	private void addDirectoryPaths(List<String> paths, File location) {
		if (location.isFile()) {
			return;
		}
		File[] children = location.listFiles();
		if (children!=null){
			for (File child : children) {
				if (child.isDirectory() && !paths.contains(child.toString())){
					paths.add(child.toString());
					addDirectoryPaths(paths, child);
				}
			}
		}
	}
}
