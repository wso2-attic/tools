package org.wso2.carbonstudio.eclipse.gmf.esb.diagram.custom.configure;

import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.ui.IWorkbenchPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.EsbFactory;
import org.wso2.carbonstudio.eclipse.gmf.esb.EsbPackage;
import org.wso2.carbonstudio.eclipse.gmf.esb.FailoverEndPoint;
import org.wso2.carbonstudio.eclipse.gmf.esb.FailoverEndPointOutputConnector;


public class AddBranchFailoverEndpointAction extends ConfigureEsbNodeAction {

	public AddBranchFailoverEndpointAction(IWorkbenchPart part) {
		super(part);
		setId("add-branch-switch-mediator-action-id");
		setText("Add a branch");
		setToolTipText("Add a branch to switch-mediator.");
		// TODO Auto-generated constructor stub
	}

	
	protected void doRun(IProgressMonitor progressMonitor) {
		EditPart selectedEP = getSelectedEditPart();
		Assert.isNotNull(selectedEP, "Empty selection.");
		
		EObject selectedObj = ((View) selectedEP.getModel()).getElement();
		Assert.isTrue(selectedObj instanceof FailoverEndPoint, "Invalid selection.");

		FailoverEndPoint parentEndpoint = (FailoverEndPoint) selectedObj;
		TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(parentEndpoint);
		FailoverEndPointOutputConnector cb = EsbFactory.eINSTANCE.createFailoverEndPointOutputConnector();
		AddCommand addCmd = new AddCommand(domain,parentEndpoint,EsbPackage.Literals.FAILOVER_END_POINT__OUTPUT_CONNECTOR, cb);
		if (addCmd.canExecute()){
			domain.getCommandStack().execute(addCmd);
		} else {
			System.out.println("Cannot Execute the command");
		}
		

	}

}
