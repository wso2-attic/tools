/**
 * 
 */
package org.eclipse.bpel.apache.ode.deploy.ui.pages;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

/**
 * @author ishan
 *
 */
public class EndpointConfigStartPage extends WizardPage {

	Text serviceDescription;
    Text enableSecurity;
    Text address;
    Text mexTimeout;
    protected EndpointConfigStartPage(String pageName) {
             super(pageName);
             //setTitle("Endpoint Configuration");
             setDescription("Endpoint Options");
    }
    
    public void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		composite.setLayout(layout);
		setControl(composite);
		
		new Label(composite, SWT.NONE).setText("Service Description");
		serviceDescription = new Text(composite, SWT.NONE);
		new Label(composite, SWT.NONE).setText("Security Policy location");
		enableSecurity = new Text(composite, SWT.NONE);
		new Label(composite, SWT.NONE).setText("Address");
		address = new Text(composite, SWT.NONE);
		new Label(composite, SWT.NONE).setText("Mex timeout");
		mexTimeout = new Text(composite, SWT.NONE);
    }

}
