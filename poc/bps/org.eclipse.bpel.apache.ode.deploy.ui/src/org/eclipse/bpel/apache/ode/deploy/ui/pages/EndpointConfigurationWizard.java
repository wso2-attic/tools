/**
 * 
 */
package org.eclipse.bpel.apache.ode.deploy.ui.pages;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.widgets.TableItem;

/**
 * @author ishan
 *
 */
public class EndpointConfigurationWizard extends Wizard {

	EndpointConfigStartPage startPage;
    EndpointConfigHttpOptionsPage httpOptionsPage;
    EndpointConfigProxyPage       proxySettingsPage;
    EndpointConfigDefaultHeadersPage defaultHeadersPage;
    TableItem[] selection;

    public EndpointConfigurationWizard(TableItem[] selection) {
    	this.selection = selection;
    }
    
    public void addPages() {
    	String title = "Endpoint Configuration for {" + selection[0].getText() + "} Partner Link";
    	startPage = new EndpointConfigStartPage("Endpoint Options");
    	startPage.setTitle(title);
        addPage(startPage);
        httpOptionsPage = new EndpointConfigHttpOptionsPage("Http Options");
        httpOptionsPage.setTitle(title);
        addPage(httpOptionsPage);
        proxySettingsPage = new EndpointConfigProxyPage("Proxy Settings");
        proxySettingsPage.setTitle(title);
        addPage(proxySettingsPage);
        defaultHeadersPage = new EndpointConfigDefaultHeadersPage("Default Headers");
        defaultHeadersPage.setTitle(title);
        addPage(defaultHeadersPage);
    }
	
	/* (non-Javadoc)
	 * @see org.eclipse.jface.wizard.Wizard#performFinish()
	 */
	public boolean performFinish() {
		// TODO Auto-generated method stub
		return false;
	}

}
