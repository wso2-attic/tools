package org.wso2.developerstudio.appfactory.ui.perspective;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class AppFactoryPerspectiveFactory implements IPerspectiveFactory {

	private static final String APPLIST_ID = "org.wso2.developerstudio.appfactory.ui.views.AppfactoryApplicationListView";
	private static final String APPDETILS_ID = "org.wso2.developerstudio.appfactory.ui.views.AppfactoryApplicationDetailsView";
	private static final String APPBUILD_ID = "org.wso2.developerstudio.appfactory.ui.views.AppfactoryBuildInfoView";
    private static final String PROJECT_EXPOR_VIEW ="org.eclipse.ui.navigator.ProjectExplorer";

	  private static final String BOTTOM = "left";
	  private static final String LEFT = "left";

	     public void createInitialLayout(IPageLayout myLayout) {
	    	 String editorArea = myLayout.getEditorArea();
          //Display display = new Display();
	    	 
	    	 
	    /*	// Top left: Resource Navigator view and Bookmarks view placeholder
             IFolderLayout topLeft = layout.createFolder("topLeft", IPageLayout.LEFT, 0.25f,
                     editorArea);
             topLeft.addView(IPageLayout.ID_RES_NAV);
             topLeft.addPlaceholder(IPageLayout.ID_BOOKMARKS);

             // Bottom left: Outline view and Property Sheet view
             IFolderLayout bottomLeft = layout.createFolder("bottomLeft", IPageLayout.BOTTOM, 0.50f,
                     "topLeft");
             bottomLeft.addView(IPageLayout.ID_OUTLINE);
             bottomLeft.addView(IPageLayout.ID_PROP_SHEET);

             // Bottom right: Task List view
             layout.addView(IPageLayout.ID_TASK_LIST, IPageLayout.BOTTOM, 0.66f, editorArea);	 */
	    	 
	      IFolderLayout lef = myLayout.createFolder("topLeft",IPageLayout.LEFT,0.25f,editorArea);
		  lef.addView(PROJECT_EXPOR_VIEW);
	      IFolderLayout applist = myLayout.createFolder("topRight",IPageLayout.RIGHT,0.25f,editorArea);
	      applist.addView(APPLIST_ID);
	    IFolderLayout appDetails = myLayout.createFolder("BottomRight",IPageLayout.BOTTOM,0.25f,"topRight");
	      appDetails.addView(APPDETILS_ID);
	      IFolderLayout buildInfo = myLayout.createFolder("Bottomt",IPageLayout.BOTTOM,0.25f,myLayout.getEditorArea());
	      buildInfo.addView(APPBUILD_ID); 
	      
	     }
	     
	     
}
