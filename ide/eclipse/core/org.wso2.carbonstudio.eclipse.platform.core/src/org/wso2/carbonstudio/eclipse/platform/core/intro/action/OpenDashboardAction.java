 /* Copyright (c) 2011, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.carbonstudio.eclipse.platform.core.intro.action;

import java.util.Properties;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IPersistableElement;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.intro.IIntroPart;
import org.eclipse.ui.intro.IIntroSite;
import org.eclipse.ui.intro.config.IIntroAction;; 

public class OpenDashboardAction extends Action implements IIntroAction {

	public void run(IIntroSite introSite, Properties properties) {
		final IIntroPart introPart = PlatformUI.getWorkbench().getIntroManager().getIntro(); 
        PlatformUI.getWorkbench().getIntroManager().closeIntro(introPart); 
        IWorkbenchWindow window=PlatformUI.getWorkbench().getActiveWorkbenchWindow();
        IWorkbenchPage page = window.getActivePage();
        try {
        	PlatformUI.getWorkbench().showPerspective("org.eclipse.jst.j2ee.J2EEPerspective", window);
			page.openEditor(new NullEditorInput(), "org.wso2.carbonstudio.eclipse.dashboard");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	class NullEditorInput implements IEditorInput {

		public boolean exists() {
		return true;
		}

		public ImageDescriptor getImageDescriptor() {
		return ImageDescriptor.getMissingImageDescriptor();
		}

		public String getName() {
		return "Dashboard";
		}

		public IPersistableElement getPersistable() {
		return null;
		}

		public String getToolTipText() {
		return "Carbon Studio Dashboard";
		}

		public Object getAdapter(Class adapter) {
		return null;
		}
		} 

}
