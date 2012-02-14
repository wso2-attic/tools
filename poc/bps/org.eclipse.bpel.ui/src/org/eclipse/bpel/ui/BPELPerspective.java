package org.eclipse.bpel.ui;

import org.eclipse.ui.*;
import org.eclipse.ui.IPerspectiveFactory;

public class BPELPerspective implements IPerspectiveFactory {

	//private static final String SERVER_VIEW_ID =
	//"org.eclipse.wst.server.ui.internal.view.servers.ServersView";

	public void createInitialLayout(IPageLayout layout) {

		String editorArea = layout.getEditorArea();
		// Put the Outline view on the left.
		layout.addView(IPageLayout.ID_PROJECT_EXPLORER, IPageLayout.LEFT,
				0.25f, editorArea);

		layout.addView(IPageLayout.ID_OUTLINE, IPageLayout.BOTTOM, 0.50f,
				IPageLayout.ID_PROJECT_EXPLORER);

		IFolderLayout bottom = layout.createFolder("bottom",
				IPageLayout.BOTTOM, 0.66f, editorArea);

		bottom.addView(IBPELUIConstants.PROPERTY_VIEW_ID);
		bottom.addView(IPageLayout.ID_PROBLEM_VIEW);
		bottom.addView(IPageLayout.ID_PROGRESS_VIEW);
		
		//bottom.addView("org.wso2.views.ServersView");
		//bottom.addView(IBPELUIConstants.SERVER_VIEW_ID);
		//bottom.addView(SERVER_VIEW_ID);
		//bottom.addPlaceholder(SERVER_VIEW_ID);
	}

}
