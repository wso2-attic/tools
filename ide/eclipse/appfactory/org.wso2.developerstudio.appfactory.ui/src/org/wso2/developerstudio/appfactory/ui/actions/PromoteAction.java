package org.wso2.developerstudio.appfactory.ui.actions;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IActionDelegate;
import org.wso2.developerstudio.appfactory.ui.utils.Messages;

public class PromoteAction implements IActionDelegate{
	public static final String LOGIN_URL = Messages.PromoteAction_0;
	public static final String DEPLOY_URL = Messages.PromoteAction_1;
	public static final String LOGOUT_URL = Messages.PromoteAction_2;
	public static final String BUILDINFO_URL = Messages.PromoteAction_3;
	
	IStructuredSelection selection;
	
    public void run(IAction action) {
		if (selection != null) {
			 try {
				IResource resource = (IResource)selection.getFirstElement();
				IProject project = resource.getProject();
				//invoke Login API  
				String[] paramNames = new String[]{Messages.PromoteAction_4,Messages.PromoteAction_5,Messages.PromoteAction_6};
				String[] paramValues = new String[]{Messages.PromoteAction_7,Messages.PromoteAction_8,Messages.PromoteAction_9};
				
			 //   String val = HttpsJaggeryClient.httpPost(LOGIN_URL, paramNames, paramValues);
			  //  System.out.println(val);
				//invoke deploy API
				paramNames = new String[]{Messages.PromoteAction_10,Messages.PromoteAction_11,Messages.PromoteAction_12,Messages.PromoteAction_13};
				paramValues = new String[]{Messages.PromoteAction_14,project.getName(),Messages.PromoteAction_15,Messages.PromoteAction_16};
				//HttpsJaggeryClient.httpPost(LOGOUT_URL, paramNames, paramValues);
				
				//logout
			//	HttpsJaggeryClient.httpPost(LOGOUT_URL,new String[0], new String[0]);
				
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
