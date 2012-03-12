/*package org.wso2.carbonstudio.eclipse.gmf.esb.diagram.custom.configure;

import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.wso2.carbonstudio.eclipse.gmf.esb.CommandMediator;
import org.wso2.carbonstudio.eclipse.gmf.esb.LogMediator;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.custom.configure.ui.ConfigureLogMediatorDialog;

public class ConfigureCommandMediatorAction extends ConfigureEsbNodeAction{

	
	public ConfigureCommandMediatorAction(IWorkbenchPart part) {
		super(part);
		setId("configure-command-mediator-action-id");
		setText("Configure...");
		setToolTipText("Configure command mediator.");
		ISharedImages workbenchImages = PlatformUI.getWorkbench().getSharedImages();		
		setImageDescriptor(workbenchImages.getImageDescriptor(ISharedImages.IMG_TOOL_NEW_WIZARD));
	}

	protected void doRun(IProgressMonitor progressMonitor) {
		EditPart selectedEP = getSelectedEditPart();
		Assert.isNotNull(selectedEP, "Empty selection.");
		
		EObject selectedObj = ((View) selectedEP.getModel()).getElement();
		Assert.isTrue(selectedObj instanceof CommandMediator, "Invalid selection.");

		Display display = Display.getDefault();
		Shell shell = new Shell(display);		
		Dialog logMediatorConfigurationDialog = new ConfigureLogMediatorDialog(shell, (CommandMediator) selectedObj,
				getEditingDomain());
		logMediatorConfigurationDialog.setBlockOnOpen(true);
		logMediatorConfigurationDialog.open();
		
	}

}
*/