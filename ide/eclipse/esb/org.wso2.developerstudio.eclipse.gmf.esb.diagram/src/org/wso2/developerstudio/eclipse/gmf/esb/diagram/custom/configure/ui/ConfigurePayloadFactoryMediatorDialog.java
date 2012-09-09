/*
 * Copyright 2012 WSO2, Inc. (http://wso2.com)
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

package org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.configure.ui;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.wso2.developerstudio.eclipse.gmf.esb.PayloadFactoryMediator;

/*
 *  Configuration dialog for PayloadFactory mediator arguments
 */
public class ConfigurePayloadFactoryMediatorDialog extends Dialog {
	private Table tblArguments;

	/**
	 * Create the dialog.
	 * @param parentShell
	 * @param mediator
	 * @param editingDomain
	 */
	public ConfigurePayloadFactoryMediatorDialog(Shell parentShell,PayloadFactoryMediator mediator , TransactionalEditingDomain editingDomain) {
		super(parentShell);
	}

	/**
	 * Create contents of the dialog.
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite container = (Composite) super.createDialogArea(parent);
		container.setLayout(new FormLayout());
		
		Label lblArguments = new Label(container, SWT.NONE);
		FormData fd_lblArguments = new FormData();
		fd_lblArguments.top = new FormAttachment(0, 10);
		fd_lblArguments.left = new FormAttachment(0, 10);
		lblArguments.setLayoutData(fd_lblArguments);
		lblArguments.setText("Argumen&ts");
		
		tblArguments = new Table(container, SWT.BORDER | SWT.FULL_SELECTION);
		FormData fd_tblArguments = new FormData();
		fd_tblArguments.bottom = new FormAttachment(lblArguments, 194, SWT.BOTTOM);
		fd_tblArguments.top = new FormAttachment(lblArguments, 6);
		fd_tblArguments.left = new FormAttachment(0, 10);
		fd_tblArguments.right = new FormAttachment(0, 381);
		tblArguments.setLayoutData(fd_tblArguments);
		tblArguments.setHeaderVisible(true);
		tblArguments.setLinesVisible(true);
		
		TableColumn tblclmnArgumentType = new TableColumn(tblArguments, SWT.NONE);
		tblclmnArgumentType.setWidth(105);
		tblclmnArgumentType.setText("Type");
		
		TableColumn tblclmnArgumentValue = new TableColumn(tblArguments, SWT.NONE);
		tblclmnArgumentValue.setWidth(100);
		tblclmnArgumentValue.setText("Value");
		
		Button cmdAddArgument = new Button(container, SWT.NONE);
		cmdAddArgument.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		FormData fd_cmdAddArgument = new FormData();
		fd_cmdAddArgument.left = new FormAttachment(100, -92);
		fd_cmdAddArgument.top = new FormAttachment(0, 33);
		fd_cmdAddArgument.right = new FormAttachment(100, -10);
		cmdAddArgument.setLayoutData(fd_cmdAddArgument);
		cmdAddArgument.setText("&Add");
		
		Button cmdRemoveArgument = new Button(container, SWT.NONE);
		cmdRemoveArgument.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		cmdRemoveArgument.setEnabled(false);
		FormData fd_cmdRemoveArgument = new FormData();
		fd_cmdRemoveArgument.left = new FormAttachment(100, -92);
		fd_cmdRemoveArgument.top = new FormAttachment(cmdAddArgument, 9);
		fd_cmdRemoveArgument.right = new FormAttachment(100, -10);
		cmdRemoveArgument.setLayoutData(fd_cmdRemoveArgument);
		cmdRemoveArgument.setText("&Remove");

		return container;
	}

	/**
	 * Create contents of the button bar.
	 * @param parent
	 */
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL,
				true);
		createButton(parent, IDialogConstants.CANCEL_ID,
				IDialogConstants.CANCEL_LABEL, false);
	}

	/**
	 * Return the initial size of the dialog.
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(497, 329);
	}
	
	/**
	 * {@inheritDoc}
	 */
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);

		newShell.setText("PayloadFactory Mediator Arguments");
	}
}
