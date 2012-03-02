package org.wso2.carbonstudio.eclipse.artifact.bpel.ui.wizard;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Combo;

public class WSDLInfoWizardPage extends WizardPage{
	private Text serviceNameText;
	private Text portNameText;
	private Text serviceAddressText;

	protected WSDLInfoWizardPage(String pageName) {
		super(pageName);
	}

	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		setControl(container);
		
		Label lblNewLabel = new Label(container, SWT.NONE);
		lblNewLabel.setBounds(10, 15, 104, 13);
		lblNewLabel.setText("Service Name");
		
		serviceNameText = new Text(container, SWT.BORDER);
		serviceNameText.setBounds(120, 10, 343, 23);
		
		portNameText = new Text(container, SWT.BORDER);
		portNameText.setBounds(120, 50, 343, 23);
		
		Label lblPortName = new Label(container, SWT.NONE);
		lblPortName.setText("Port Name");
		lblPortName.setBounds(10, 55, 104, 13);
		
		serviceAddressText = new Text(container, SWT.BORDER);
		serviceAddressText.setBounds(120, 93, 343, 23);
		
		Label lblServiceAddress = new Label(container, SWT.NONE);
		lblServiceAddress.setText("Service Address");
		lblServiceAddress.setBounds(10, 98, 104, 13);
		
		Label lblBindingProtocol = new Label(container, SWT.NONE);
		lblBindingProtocol.setText("Binding Protocol");
		lblBindingProtocol.setBounds(10, 142, 104, 13);
		
		Combo bindingProtocolCombo = new Combo(container, SWT.NONE);
		bindingProtocolCombo.setBounds(120, 135, 343, 27);
		
		bindingProtocolCombo.add("SOAP");
		bindingProtocolCombo.add("HTTP");
		
	}
}
