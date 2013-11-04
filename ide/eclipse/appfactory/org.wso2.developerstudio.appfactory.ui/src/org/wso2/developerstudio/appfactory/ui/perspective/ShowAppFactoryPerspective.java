package org.wso2.developerstudio.appfactory.ui.perspective;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.wso2.developerstudio.appfactory.core.Activator;
import org.wso2.developerstudio.appfactory.ui.utils.Messages;
import org.wso2.developerstudio.eclipse.logging.core.IDeveloperStudioLog;
import org.wso2.developerstudio.eclipse.logging.core.Logger;
import org.wso2.developerstudio.eclipse.platform.core.utils.SWTResourceManager;

public class ShowAppFactoryPerspective extends Action{
private static IDeveloperStudioLog log = Logger.getLog(Activator.PLUGIN_ID);
	
	public void run() {
		 try {
			 	IWorkbenchWindow window=PlatformUI.getWorkbench().getActiveWorkbenchWindow();
	        	PlatformUI.getWorkbench().showPerspective(Messages.ShowAppFactoryPerspective_0, window);
			} catch (Exception e) {
				log.error(Messages.ShowAppFactoryPerspective_1,e);
			}
	}
	public String getText() {
		return Messages.ShowAppFactoryPerspective_2;
	}
	public ImageDescriptor getImageDescriptor() {
		return ImageDescriptor.createFromImage(SWTResourceManager
				.getImage(this.getClass(), Messages.ShowAppFactoryPerspective_3));
				 
	}
	public String getDescription() {
		return Messages.ShowAppFactoryPerspective_4;
	}
}
