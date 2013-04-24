package org.wso2.developerstudio.appfactory.ui.actions;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.wso2.developerstudio.appfactory.core.authentication.Authenticator;
import org.wso2.developerstudio.appfactory.ui.Activator;
import org.wso2.developerstudio.appfactory.ui.preference.AppFactoryPreferencePage;
import org.wso2.developerstudio.appfactory.ui.views.PasswordDialog;
import org.wso2.developerstudio.eclipse.logging.core.IDeveloperStudioLog;
import org.wso2.developerstudio.eclipse.logging.core.Logger;
import org.wso2.developerstudio.eclipse.platform.ui.preferences.ClientTrustStorePreferencePage;

public class LoginAction {
	 private static IDeveloperStudioLog log=Logger.getLog(Activator.PLUGIN_ID);
	 private IPreferenceStore preferenceStore;
	 public IPreferenceStore getPreferenceStore() {
		return preferenceStore;
	}

	public void setPreferenceStore(IPreferenceStore preferenceStore) {
		this.preferenceStore = preferenceStore;
	}

	public static final String DEFAULT_LOGIN_PATH = "/appmgt/site/blocks/user/login/ajax/login.jag";
	 private String username="";
	 private String password="";
	 private String loginUrl;
	 private Authenticator authenticator;
	 private Shell activeShell;
	 
	public Shell getActiveShell() {
		return activeShell;
	}

	public void setActiveShell(Shell activeShell) {
		this.activeShell = activeShell;
	}

	public LoginAction() {
		 preferenceStore = Activator.getDefault().getPreferenceStore();
		 authenticator = new Authenticator();
		 activeShell = PlatformUI.getWorkbench().getDisplay().getActiveShell();
		 setLoginUrl(preferenceStore.getString(AppFactoryPreferencePage.APP_FACTORY_LOCATION)+DEFAULT_LOGIN_PATH);
		 setUsername(preferenceStore.getString(AppFactoryPreferencePage.APP_FACTORY_USERNAME));
		 setPassword(preferenceStore.getString(AppFactoryPreferencePage.APP_FACTORY_PASSWORD));
		}
	
	public boolean login() {
		boolean val = false;
		try {
			val = authenticator.Authenticate(getLoginUrl(), getUsername(), getPassword());
			if(!val){
				showLoginDialog();
				val = authenticator.Authenticate(getLoginUrl(), getUsername(), getPassword());
			}
		} catch (Exception e) {
			MessageBox messageBox = new MessageBox(activeShell,SWT.OK);
	        messageBox.setText("Error");
	        messageBox.setMessage(e.getMessage());
	        log.error("Login failer", e);
		}
		return val;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLoginUrl() {
		return loginUrl;
	}

	public void setLoginUrl(String loginUrl) {
		this.loginUrl = loginUrl;
	}
	
	private void showLoginDialog(){
		 PasswordDialog dialog = new PasswordDialog(activeShell);
		 if (dialog.open() == Window.OK) {
			  setUsername(dialog.getUser());
			  setPassword(dialog.getPassword());
		 } 
	}
	
}
