/*
 * Copyright 2009-2010 WSO2, Inc. (http://wso2.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.carbonstudio.eclipse.gmf.esb.diagram.custom.configure;

import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.wso2.carbonstudio.eclipse.gmf.esb.EsbFactory;
import org.wso2.carbonstudio.eclipse.gmf.esb.EsbPackage;
import org.wso2.carbonstudio.eclipse.gmf.esb.SwitchCaseBranchOutputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.SwitchMediator;

public class AddBranchSwitchMediatorAction extends ConfigureEsbNodeAction {
	
	public AddBranchSwitchMediatorAction(IWorkbenchPart part) {
		super(part);
		setId("add-branch-switch-mediator-action-id");
		setText("Add a branch");
		setToolTipText("Add a branch to switch-mediator.");
		ISharedImages workbenchImages = PlatformUI.getWorkbench().getSharedImages();		
		setImageDescriptor(workbenchImages.getImageDescriptor(ISharedImages.IMG_OBJ_ADD));
	}

	/**
	 * {@inheritDoc}
	 */
	protected void doRun(IProgressMonitor progressMonitor) {
		EditPart selectedEP = getSelectedEditPart();
		Assert.isNotNull(selectedEP, "Empty selection.");
		
		EObject selectedObj = ((View) selectedEP.getModel()).getElement();
		Assert.isTrue(selectedObj instanceof SwitchMediator, "Invalid selection.");

		SwitchMediator parentMediator = (SwitchMediator) selectedObj;
		TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(parentMediator);
		SwitchCaseBranchOutputConnector cb = EsbFactory.eINSTANCE.createSwitchCaseBranchOutputConnector();
		AddCommand addCmd = new AddCommand(domain,parentMediator,EsbPackage.Literals.SWITCH_MEDIATOR__CASE_BRANCHES, cb);
		if (addCmd.canExecute()){
			domain.getCommandStack().execute(addCmd);
		} else {
			System.out.println("Cannot Execute the command");
		}
		

	}

}
