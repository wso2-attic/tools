package org.wso2.developerstudio.eclipse.capp.project.actions;

import java.io.File;
import java.io.IOException;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.wso2.developerstudio.eclipse.capp.core.artifacts.manager.CAppEnvironment;
import org.wso2.developerstudio.eclipse.capp.project.ui.dialog.MavenProjectInfoDialog;

import com.sun.org.apache.bcel.internal.generic.GETSTATIC;


public class CreatePOMAction implements IObjectActionDelegate {
	private IProject project;
	private File mavenProjectFile;
	
	public void setActivePart(IAction action, IWorkbenchPart arg1) {
		
	}

	public void run(IAction action) {
		if (getProject()!=null){
			try {
				MavenProjectInfoDialog dialog = new MavenProjectInfoDialog(Display.getDefault().getActiveShell(),
											mavenProjectFile, getProject());
				dialog.setBlockOnOpen(true);
				dialog.create();
				dialog.getShell().setSize(500, 200);
				dialog.open();
			} catch (CoreException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	}
	
//	public void addArtifactRepositories(){
//		ArtifactRepository repo = n
//	}

	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof TreeSelection) {
			TreeSelection treeSelection = (TreeSelection) selection;
			if (treeSelection.getFirstElement() instanceof IProject) {
				IProject project = (IProject) treeSelection.getFirstElement();
				action.setEnabled(CAppEnvironment.getcAppManager()
						.isCAppProject(project));
				setProject(project);
				mavenProjectFile = CAppEnvironment.getcAppManager().getCAppBuilderMavenProjectLocation(project).getLocation().toFile();
				if (mavenProjectFile.exists()){
					action.setText("Recreate Maven Configuration Project...");
				}else{
					action.setText("Create Maven Configuration Project...");
				}
			} else {
				action.setEnabled(false);
			}
		}
	}

	public void setProject(IProject project) {
		this.project = project;
	}

	public IProject getProject() {
		return project;
	}

}
