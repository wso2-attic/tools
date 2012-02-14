/**
 * 
 */
package org.eclipse.bpel.apache.ode.deploy.ui.pages;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

/**
 * @author ishan
 *
 */
public class EndpointConfigProxyPage extends WizardPage {
	Text host;
	Text port;
	Text domain;
	Text user;
	Text password;
	
	public EndpointConfigProxyPage(String pageName) {
		super(pageName);
		 //setTitle("Endpoint Configuration");
         setDescription("Endpoint Options -> Http Options -> Proxy Settings");
		
	}
	/* (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.IDialogPage#createControl(org.eclipse.swt.widgets.Composite)
	 */
	public void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		composite.setLayout(layout);

		new Label(composite, SWT.NONE).setText("Host");
		host = new Text(composite, SWT.NONE);
		
		new Label(composite, SWT.NONE).setText("Port");
		port = new Text(composite, SWT.NONE);
		
		new Label(composite, SWT.NONE).setText("Domain");
		domain = new Text(composite, SWT.NONE);
		
		new Label(composite, SWT.NONE).setText("User");
		user = new Text(composite, SWT.NONE);
		
		new Label(composite, SWT.NONE).setText("Password");
		password = new Text(composite, SWT.NONE);
		
		setControl(composite);
	}

}
