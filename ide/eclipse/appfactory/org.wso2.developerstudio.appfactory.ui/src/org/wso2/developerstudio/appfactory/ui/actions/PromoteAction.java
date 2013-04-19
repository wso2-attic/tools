package org.wso2.developerstudio.appfactory.ui.actions;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IActionDelegate;
import org.wso2.developerstudio.appfactory.ui.connections.RestHttpsClient;

public class PromoteAction implements IActionDelegate{
	public static final String LOGIN_URL = "https://appfactorypreview.wso2.com/appmgt/site/blocks/user/login/ajax/login.jag";
	public static final String DEPLOY_URL = "https://appfactorypreview.wso2.com/appmgt/site/blocks/build/add/ajax/add.jag";
	public static final String LOGOUT_URL = "https://appfactorypreview.wso2.com/appmgt/site/blocks/user/logout/ajax/logout.jag";
	public static final String BUILDINFO_URL = "https://appfactorypreview.wso2.com/appmgt/site/blocks/build/list/ajax/list.jag";
	
	IStructuredSelection selection;
	
    public void run(IAction action) {
		if (selection != null) {
			 try {
				IResource resource = (IResource)selection.getFirstElement();
				IProject project = resource.getProject();
				//invoke Login API  
				String[] paramNames = new String[]{"action","userName","password"};
				String[] paramValues = new String[]{"login","admin@admin.com","admin"};
				
			    String val = RestHttpsClient.httpPost(LOGIN_URL, paramNames, paramValues);
			    System.out.println(val);
				//invoke deploy API
				paramNames = new String[]{"action","applicationId","stage","version"};
				paramValues = new String[]{"Promote",project.getName(),"Development","1.0-SNAPSHOT"};
				RestHttpsClient.httpPost(LOGOUT_URL, paramNames, paramValues);
				
				//logout
				RestHttpsClient.httpPost(LOGOUT_URL,new String[0], new String[0]);
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    }

    public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			this.selection = (IStructuredSelection) selection;
		}
	  
    }
}
