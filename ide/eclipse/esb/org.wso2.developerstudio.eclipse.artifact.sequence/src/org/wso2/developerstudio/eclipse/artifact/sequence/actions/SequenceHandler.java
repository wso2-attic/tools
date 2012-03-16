package org.wso2.developerstudio.eclipse.artifact.sequence.actions;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.handlers.HandlerUtil;


public class SequenceHandler extends AbstractHandler{

	
	public Object execute(ExecutionEvent arg0) throws ExecutionException {
		// TODO Auto-generated method stub
		
		//pop up proxy service creation wizard
		IStructuredSelection selection = (IStructuredSelection) HandlerUtil.getCurrentSelectionChecked(arg0);
//		ProxyServiceProjectCreationWizard wizard = new ProxyServiceProjectCreationWizard();
//		
//		WizardDialog dialog = new WizardDialog(((ISelection)selection), wizard);
		
		return null;
	}

}
