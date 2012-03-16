package org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.configure;

import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.ui.IWorkbenchPart;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbFactory;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage;
import org.wso2.developerstudio.eclipse.gmf.esb.LoadBalanceEndPoint;
import org.wso2.developerstudio.eclipse.gmf.esb.LoadBalanceEndPointOutputConnector;

public class AddBranchLoadBalanceEndpointAction extends ConfigureEsbNodeAction {

	public AddBranchLoadBalanceEndpointAction(IWorkbenchPart part) {
		super(part);
		setId("add-branch-loadBalance-endPoint-action-id");
		setText("Add a branch");
		setToolTipText("Add a branch to loadBalance-endpoint.");
		// TODO Auto-generated constructor stub
	}

	
	protected void doRun(IProgressMonitor progressMonitor) {
		EditPart selectedEP = getSelectedEditPart();
		Assert.isNotNull(selectedEP, "Empty selection.");
		
		EObject selectedObj = ((View) selectedEP.getModel()).getElement();
		Assert.isTrue(selectedObj instanceof LoadBalanceEndPoint, "Invalid selection.");

		LoadBalanceEndPoint parentEndpoint = (LoadBalanceEndPoint) selectedObj;
		TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(parentEndpoint);
		LoadBalanceEndPointOutputConnector cb = EsbFactory.eINSTANCE.createLoadBalanceEndPointOutputConnector();
		AddCommand addCmd = new AddCommand(domain,parentEndpoint,EsbPackage.Literals.LOAD_BALANCE_END_POINT__OUTPUT_CONNECTOR, cb);
		if (addCmd.canExecute()){
			domain.getCommandStack().execute(addCmd);
		} else {
			System.out.println("Cannot Execute the command");
		}
		
	}

}
