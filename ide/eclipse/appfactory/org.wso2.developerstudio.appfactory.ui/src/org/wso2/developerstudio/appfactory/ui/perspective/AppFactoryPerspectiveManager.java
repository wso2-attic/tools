package org.wso2.developerstudio.appfactory.ui.perspective;

import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IPerspectiveDescriptor;
import org.eclipse.ui.IStartup;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PerspectiveAdapter;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.WorkbenchException;

public class AppFactoryPerspectiveManager implements IStartup {

	@Override
	public void earlyStartup() {
	     /*
         * The registration of the listener should have been done in the UI
         * thread since PlatformUI.getWorkbench().getActiveWorkbenchWindow()
         * returns null if it is called outside of the UI thread.
         */
        Display.getDefault().asyncExec(new Runnable() {
            /*
             * (non-Javadoc)
             * 
             * @see java.lang.Runnable#run()
             */
            public void run() {
                final IWorkbenchWindow workbenchWindow = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
                if (workbenchWindow != null) {
                    workbenchWindow.addPerspectiveListener(new PerspectiveAdapter() {
                        @Override
                        public void perspectiveActivated(IWorkbenchPage page,
                                IPerspectiveDescriptor perspectiveDescriptor) {
                          //  super.perspectiveActivated(page, perspectiveDescriptor);
                          
                            
                            if("org.wso2.developerstudio.appfactory.ui.perspective".equals(perspectiveDescriptor.getId())){
                            	
                            	try {
                            		//PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().closePerspective(perspectiveDescriptor, true, true);
                            		PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().setPerspective(perspectiveDescriptor);
                            	    PlatformUI.getWorkbench().showPerspective("org.eclipse.jst.j2ee.J2EEPerspective", PlatformUI.getWorkbench().getActiveWorkbenchWindow());
                            	    PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().closePerspective(perspectiveDescriptor, false, true);
                            	} catch (WorkbenchException e) {
									// TODO Auto-generated catch block
									//e.printStackTrace();
								}
                            }
                        }
                    });
                }
            }
        });
    }

}
