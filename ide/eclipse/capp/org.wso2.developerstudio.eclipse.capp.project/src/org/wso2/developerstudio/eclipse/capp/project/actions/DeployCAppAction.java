package org.wso2.developerstudio.eclipse.capp.project.actions;

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.wso2.developerstudio.eclipse.capp.core.artifacts.manager.CAppEnvironment;
import org.wso2.developerstudio.eclipse.capp.project.ui.dialog.RemoteServerInfoDialog;

public class DeployCAppAction implements IObjectActionDelegate{

	private IProject project;
	
	public void run(IAction arg0) {
		if (getProject()!=null){
			RemoteServerInfoDialog dialog = new RemoteServerInfoDialog(Display.getDefault().getActiveShell(), getProject());
			dialog.setBlockOnOpen(true);
			dialog.create();
			dialog.getShell().setSize(500, 300);
			dialog.open();
		}
		// TODO Auto-generated method stub
		
	}

	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof TreeSelection) {
			TreeSelection treeSelection = (TreeSelection) selection;
			if (treeSelection.getFirstElement() instanceof IProject) {
				IProject project = (IProject) treeSelection.getFirstElement();
				action.setEnabled(CAppEnvironment.getcAppManager()
						.isCAppProject(project));
				setProject(project);
			} else {
				action.setEnabled(false);
			}
		}
		
	}

	public void setActivePart(IAction arg0, IWorkbenchPart arg1) {
		// TODO Auto-generated method stub
		
	}
	
	public void setProject(IProject project) {
		this.project = project;
	}

	public IProject getProject() {
		return project;
	}


}
