package org.wso2.developerstudio.eclipse.platform.ui.action;

import org.apache.maven.project.MavenProject;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.wso2.developerstudio.eclipse.logging.core.IDeveloperStudioLog;
import org.wso2.developerstudio.eclipse.logging.core.Logger;
import org.wso2.developerstudio.eclipse.maven.util.MavenUtils;
import org.wso2.developerstudio.eclipse.platform.ui.Activator;

public class SyncDependenciesAction implements IObjectActionDelegate {
	private static IDeveloperStudioLog log = Logger.getLog(Activator.PLUGIN_ID);
	private IProject project;
	private IFile mavenProjectFile;

	@Override
	public void run(IAction arg0) {
		MavenProject mavenProject;
		try {
			mavenProject = MavenUtils.getMavenProject(mavenProjectFile.getLocation().toFile());
			MavenUtils.updateDependecyList(project, mavenProject);
			MavenUtils.saveMavenProject(mavenProject, mavenProjectFile.getLocation().toFile());
			
			project.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
		} catch (Exception e) {
			log.error("Error occured while trying to sync project dependencies from "+project.getName()+ " with pom.xml.", e);
		}
	}

	@Override
	public void selectionChanged(IAction arg0, ISelection arg1) {
		if (arg1 instanceof TreeSelection) {
			TreeSelection treeSelection = (TreeSelection) arg1;
			if (treeSelection.getFirstElement() instanceof IProject) {
				IProject project = (IProject) treeSelection.getFirstElement();
				arg0.setEnabled(project.isOpen());
				this.project=project;
				mavenProjectFile = project.getFile("pom.xml");
				if (mavenProjectFile.exists()){
					arg0.setText("Sync Project Dependencies with pom.xml");
				}
			} else {
				arg0.setEnabled(false);
			}
		}
	}

	@Override
	public void setActivePart(IAction arg0, IWorkbenchPart arg1) {
		
	}

}
