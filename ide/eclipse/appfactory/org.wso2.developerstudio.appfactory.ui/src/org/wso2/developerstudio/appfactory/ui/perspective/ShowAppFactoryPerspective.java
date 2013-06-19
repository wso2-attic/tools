package org.wso2.developerstudio.appfactory.ui.perspective;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.wso2.developerstudio.appfactory.core.Activator;
import org.wso2.developerstudio.eclipse.logging.core.IDeveloperStudioLog;
import org.wso2.developerstudio.eclipse.logging.core.Logger;
import org.wso2.developerstudio.eclipse.platform.core.utils.SWTResourceManager;

public class ShowAppFactoryPerspective extends Action{
private static IDeveloperStudioLog log = Logger.getLog(Activator.PLUGIN_ID);
	
	public void run() {
		 try {
			 	IWorkbenchWindow window=PlatformUI.getWorkbench().getActiveWorkbenchWindow();
	        	PlatformUI.getWorkbench().showPerspective("org.wso2.developerstudio.appfactory.ui.perspective", window);
			} catch (Exception e) {
				log.error("Cannot open AppFactory perspective",e);
			}
	}
	public String getText() {
		return "Switch to AppFactory perspective";
	}
	public ImageDescriptor getImageDescriptor() {
		return ImageDescriptor.createFromImage(SWTResourceManager
				.getImage(this.getClass(), "/icons/appfac.png"));
				 
	}
	public String getDescription() {
		return "Switch to AppFactory perspective";
	}
}
