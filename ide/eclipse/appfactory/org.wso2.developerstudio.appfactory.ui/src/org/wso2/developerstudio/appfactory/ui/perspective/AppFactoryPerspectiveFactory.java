package org.wso2.developerstudio.appfactory.ui.perspective;

import java.net.URL;

import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveDescriptor;
import org.eclipse.ui.IPerspectiveFactory;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.browser.IWebBrowser;
import org.eclipse.ui.browser.IWorkbenchBrowserSupport;
import org.wso2.developerstudio.appfactory.ui.Activator;
import org.wso2.developerstudio.appfactory.ui.connections.RestHttpsClient;
import org.wso2.developerstudio.appfactory.ui.views.PasswordDialog;

public class AppFactoryPerspectiveFactory implements IPerspectiveFactory {

	private static final String APPLIST_ID = "org.wso2.developerstudio.appfactory.ui.views.AppfactoryApplicationListView";
	private static final String APPDETILS_ID = "org.wso2.developerstudio.appfactory.ui.views.AppfactoryApplicationDetailsView";
	private static final String APPBUILD_ID = "org.wso2.developerstudio.appfactory.ui.views.AppfactoryBuildInfoView";
    private static final String PROJECT_EXPOR_VIEW ="org.eclipse.ui.navigator.ProjectExplorer";
    public static final String LOGIN_URL = "https://appfactorypreview.wso2.com/appmgt/site/blocks/user/login/ajax/login.jag";

	private static IWebBrowser browser = null;
	
	     public void createInitialLayout(IPageLayout myLayout) {
	    	 String editorArea = myLayout.getEditorArea();
	    	 Shell activeShell = PlatformUI.getWorkbench().getDisplay().getActiveShell();
	    	 IWorkbenchPage activePage = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
	    	 IPerspectiveDescriptor perspective = activePage.getPerspective();
	    	 
	    	 PasswordDialog dialog = new PasswordDialog(activeShell);
	    	 if (dialog.open() == Window.OK) {
	    		 String password = dialog.getPassword();
	    		 String username = dialog.getUser();
	    		 String[] paramNames = new String[]{"action","userName","password"};
				 String[] paramValues = new String[]{"login",username,password};
			     try {
//					String val =  RestHttpsClient.httpPost(LOGIN_URL, paramNames, paramValues);
					if("true".equals("true")){
						  IFolderLayout lef = myLayout.createFolder("topLeft",IPageLayout.LEFT,0.25f,editorArea);
				   		  lef.addView(PROJECT_EXPOR_VIEW);
				   	      IFolderLayout applist = myLayout.createFolder("topRight",IPageLayout.RIGHT,0.25f,editorArea);
				   	      applist.addView(APPLIST_ID);
				   	      IFolderLayout appDetails = myLayout.createFolder("BottomRight",IPageLayout.BOTTOM,0.25f,"topRight");
				   	      appDetails.addView(APPDETILS_ID);
				   	      IFolderLayout buildInfo = myLayout.createFolder("Bottomt",IPageLayout.BOTTOM,0.25f,myLayout.getEditorArea());
				   	      buildInfo.addView(APPBUILD_ID); 
				   	      
					// Opening the Web browser
					IWorkbenchBrowserSupport browserSupport = Activator
							.getDefault().getWorkbench().getBrowserSupport();

					browser = browserSupport.createBrowser(
							IWorkbenchBrowserSupport.LOCATION_BAR, null, null,
							null);
					URL url = new URL("http://www.google.com/ncr");
					browser.openURL(url);
				   	      
					}else {
						MessageBox messageBox = new MessageBox(activeShell,
								SWT.OK);
				        messageBox.setText("Error");
				        messageBox.setMessage("Error username or password");
					}
				} catch (Exception e) {
					MessageBox messageBox = new MessageBox(activeShell,
							SWT.OK);
			        messageBox.setText("Error");
			        messageBox.setMessage(e.getMessage());
					e.printStackTrace();
				} 	    		 
	    	 }else{
	    		 //Reload the active perspective
	    		 activePage.setPerspective(perspective); 
	    	 }
	     } 
}
