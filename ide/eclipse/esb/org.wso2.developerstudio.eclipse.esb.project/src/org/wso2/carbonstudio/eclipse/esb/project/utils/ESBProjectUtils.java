package org.wso2.carbonstudio.eclipse.esb.project.utils;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.wizards.IWizardDescriptor;
import org.wso2.carbonstudio.eclipse.esb.project.ui.wizard.ESBProjectWizard;

public class ESBProjectUtils {
	public static IProject createESBProject(Shell shell){
		IWizardDescriptor wizardDesc = PlatformUI.getWorkbench().getNewWizardRegistry().findWizard("org.wso2.carbonstudio.eclipse.artifact.newesbproject");
		if (wizardDesc!=null) {
			try {
				ESBProjectWizard esbProjectWizard = (ESBProjectWizard) wizardDesc.createWizard();
				IStructuredSelection selection = (IStructuredSelection) PlatformUI
												.getWorkbench().getActiveWorkbenchWindow()
												.getSelectionService().getSelection();
				esbProjectWizard.init(PlatformUI.getWorkbench(), selection);
				WizardDialog dialog = new WizardDialog(shell, esbProjectWizard);
				dialog.create();
				dialog.open();
				String projectName = esbProjectWizard.getModel().getProjectName();
				IProject esbProject = ResourcesPlugin.getWorkspace().getRoot()
						.getProject(projectName);
				return esbProject;
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	
	
}
