package org.wso2.carbonstudio.eclipse.carbonmodules.project.ui.wizard;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;

public class CarbonModulesProjectWizardPage extends
		WizardNewProjectCreationPage {

	public CarbonModulesProjectWizardPage(String pageName) {
		super(pageName);
	}
	
    public void createControl(Composite parent) {
    	super.createControl(parent);
    	Composite composite = (Composite)getControl();
    }

}
