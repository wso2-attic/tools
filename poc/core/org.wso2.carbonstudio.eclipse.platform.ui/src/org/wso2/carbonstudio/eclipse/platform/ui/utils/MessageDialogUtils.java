package org.wso2.carbonstudio.eclipse.platform.ui.utils;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;

public class MessageDialogUtils {
	private static final String COMMON_TITLE = "Carbon Studio";
	public static void info(Shell shell,String message){
		info(shell, message, COMMON_TITLE);
	}

	public static void info(Shell shell, String title, String message) {
		MessageDialog.openInformation(shell, title, message);
	}

	public static void error(Shell shell, Exception e) {
		error(shell, e.getMessage(), e);
	}
	
	public static void error(Shell shell, String message, Exception e) {
		error(shell, message, COMMON_TITLE, e);
	}
	
	public static void error(Shell shell, String message, String title, Exception e) {
		MessageDialog.openError(shell, title, message);
	}
}
