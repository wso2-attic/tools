package org.wso2.developerstudio.eclipse.artifact.proxyservice.helper;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.wso2.developerstudio.eclipse.artifact.proxyservice.ui.wizard.AdvancedConfigComposite;
import org.wso2.developerstudio.eclipse.platform.core.model.AbstractComposite;
import org.wso2.developerstudio.eclipse.platform.core.model.ICompositeProvider;
import org.wso2.developerstudio.eclipse.platform.core.project.model.ProjectDataModel;
import org.wso2.developerstudio.eclipse.platform.core.project.model.ProjectOptionData;

public class AdvancedConfigProvider implements ICompositeProvider {

	public AbstractComposite createComposite(Composite parent,
			ProjectDataModel model,ProjectOptionData optionData,WizardPage wizardPage) {
		return new AdvancedConfigComposite(parent, SWT.None,model,optionData,wizardPage);
	}

}
