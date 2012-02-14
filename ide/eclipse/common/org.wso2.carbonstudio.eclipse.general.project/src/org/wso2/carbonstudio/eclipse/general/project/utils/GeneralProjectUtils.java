package org.wso2.carbonstudio.eclipse.general.project.utils;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.wizards.IWizardDescriptor;
import org.wso2.carbonstudio.eclipse.general.project.ui.wizard.GeneralProjectWizard;

public class GeneralProjectUtils {

	public static IProject createGeneralProject(Shell shell){
		IWizardDescriptor wizardDesc = PlatformUI.getWorkbench().getNewWizardRegistry().findWizard("org.wso2.carbonstudio.eclipse.general.project");
		if (wizardDesc!=null) {
			try {
				GeneralProjectWizard basicProjectWizard = (GeneralProjectWizard) wizardDesc.createWizard();
				IStructuredSelection selection = (IStructuredSelection) PlatformUI
						.getWorkbench().getActiveWorkbenchWindow()
						.getSelectionService().getSelection();
				basicProjectWizard.init(PlatformUI.getWorkbench(), selection);
				WizardDialog dialog = new WizardDialog(shell, basicProjectWizard);
				dialog.create();
				dialog.open();
				String projectName = basicProjectWizard.getModel().getProjectName();
				IProject newProject = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
				return newProject;
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
}
