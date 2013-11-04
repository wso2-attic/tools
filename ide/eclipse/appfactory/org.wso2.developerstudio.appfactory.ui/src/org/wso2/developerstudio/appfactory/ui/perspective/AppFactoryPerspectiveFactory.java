/*
 * Copyright (c) 2013, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.developerstudio.appfactory.ui.perspective;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
import org.eclipse.ui.browser.IWebBrowser;
import org.eclipse.ui.console.IConsoleConstants;
import org.wso2.developerstudio.appfactory.ui.Activator;
import org.wso2.developerstudio.appfactory.ui.actions.LoginAction;
import org.wso2.developerstudio.appfactory.ui.utils.Messages;
import org.wso2.developerstudio.eclipse.logging.core.IDeveloperStudioLog;
import org.wso2.developerstudio.eclipse.logging.core.Logger;

public class AppFactoryPerspectiveFactory implements IPerspectiveFactory {
	private static IDeveloperStudioLog log = Logger.getLog(Activator.PLUGIN_ID);
	private static final String APPLIST_ID = Messages.AppFactoryPerspectiveFactory_0 +
			Messages.AppFactoryPerspectiveFactory_1;
	private static final String APPDETILS_ID = Messages.AppFactoryPerspectiveFactory_2 +
			Messages.AppFactoryPerspectiveFactory_3;
	private static final String APPBUILD_ID = Messages.AppFactoryPerspectiveFactory_4 +
			Messages.AppFactoryPerspectiveFactory_5;
	private static final String PROJECT_EXPOR_VIEW = Messages.AppFactoryPerspectiveFactory_6;

	private static IWebBrowser browser = null;

	public void createInitialLayout(IPageLayout appfacLayout) {

		try {
			LoginAction loginAction = new LoginAction();
			if (loginAction.login()) {
				/*Display.getCurrent()
						.getActiveShell()
						.setCursor(
								(new Cursor(Display.getCurrent(),
										SWT.CURSOR_WAIT)));*/
				ProgressMonitorDialog progressMonitorDialog = new ProgressMonitorDialog(
						Display.getDefault().getActiveShell());
				progressMonitorDialog.create();
				progressMonitorDialog.open();
				progressMonitorDialog.run(true, false,
						new LoadAppFacPerfectiveJob(loginAction, appfacLayout));
				AppFactoryPerspectiveManager.val = false;
			}
		} catch (Exception e) {
		/*	Display.getCurrent()
					.getActiveShell()
					.setCursor(
							(new Cursor(Display.getCurrent(), SWT.CURSOR_ARROW)));*/
			log.error(Messages.AppFactoryPerspectiveFactory_7, e);
		}
	}

	private void addViews(IPageLayout appfacLayout) {
		String editorArea = appfacLayout.getEditorArea();
		IFolderLayout lef = appfacLayout.createFolder(Messages.AppFactoryPerspectiveFactory_8,
				IPageLayout.LEFT, 0.25f, editorArea);
		lef.addView(PROJECT_EXPOR_VIEW);

		IFolderLayout applist = appfacLayout.createFolder(Messages.AppFactoryPerspectiveFactory_9,
				IPageLayout.RIGHT, 0.75f, editorArea);
		applist.addView(APPLIST_ID);

		IFolderLayout appDetails = appfacLayout.createFolder(Messages.AppFactoryPerspectiveFactory_10,
				IPageLayout.BOTTOM, 0.60f, Messages.AppFactoryPerspectiveFactory_11);
		appDetails.addView(APPDETILS_ID);

		IFolderLayout buildInfo = appfacLayout.createFolder(Messages.AppFactoryPerspectiveFactory_12,
				IPageLayout.BOTTOM, 0.60f, appfacLayout.getEditorArea());
		buildInfo.addView(IConsoleConstants.ID_CONSOLE_VIEW);
	}

	private class LoadAppFacPerfectiveJob implements IRunnableWithProgress {

		private LoginAction loginAction;
		private IPageLayout appfacLayout;

		public LoadAppFacPerfectiveJob(LoginAction loginAction,
				IPageLayout appfacLayout) {
			this.loginAction = loginAction;
			this.appfacLayout = appfacLayout;
		}

		@Override
		public void run(IProgressMonitor monitor)
				throws InvocationTargetException, InterruptedException {
			String operationText = Messages.AppFactoryPerspectiveFactory_13;
			monitor.beginTask(operationText, 100);
			monitor.worked(10);
			try {
				AppFactoryPerspectiveManager.val = false;
				operationText = Messages.AppFactoryPerspectiveFactory_14;
				monitor.subTask(operationText);
				monitor.worked(50);
				operationText = Messages.AppFactoryPerspectiveFactory_15;
				monitor.subTask(operationText);
				addViews(appfacLayout);
				monitor.worked(80);
				/*
				 * String appFactoryPreferenceURL =
				 * loginAction.getPreferenceStore
				 * ().getString(AppFactoryPreferencePage.APP_FACTORY_LOCATION);
				 * Stop Opening the Web browser since there is a eclipse bug
				 * that will kill whole eclipse IWorkbenchBrowserSupport
				 * browserSupport =
				 * Activator.getDefault().getWorkbench().getBrowserSupport();
				 * browser =
				 * browserSupport.createBrowser(IWorkbenchBrowserSupport
				 * .LOCATION_BAR, null, null, null); URL url = new
				 * URL("http://www.google.com/ncr");
				 * if(appFactoryPreferenceURL!= null &&
				 * !appFactoryPreferenceURL.equals("")){ browser.openURL(new
				 * URL(appFactoryPreferenceURL)); }else{ browser.openURL(url); }
				 */
				operationText = Messages.AppFactoryPerspectiveFactory_16;
				monitor.subTask(operationText);
				monitor.worked(100);
			} catch (Exception e) {
				operationText = e.getMessage();
				monitor.subTask(Messages.AppFactoryPerspectiveFactory_17+operationText);
				monitor.worked(0);
				monitor.setCanceled(true);
				log.error(Messages.AppFactoryPerspectiveFactory_18, e);
			}

			monitor.worked(100);
			monitor.done();
		}
	}
}
