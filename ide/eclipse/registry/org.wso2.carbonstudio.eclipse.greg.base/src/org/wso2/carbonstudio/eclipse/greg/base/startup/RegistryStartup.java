package org.wso2.carbonstudio.eclipse.greg.base.startup;

import org.eclipse.ui.IStartup;
import org.wso2.carbonstudio.eclipse.greg.base.ui.util.RegistryBrowserUIControl;
import org.wso2.carbonstudio.eclipse.platform.ui.startup.RegisterUIControl;

public class RegistryStartup implements IStartup{

	
	public void earlyStartup() {
		RegistryBrowserUIControl control = new RegistryBrowserUIControl();
		RegisterUIControl uiControl = new RegisterUIControl();
		uiControl.registerUIControls(control);
	}

}
