package org.wso2.carbonstudio.eclipse.greg.core.ui.widgets;
import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;
import org.wso2.carbonstudio.eclipse.greg.core.Activator;
import org.wso2.carbonstudio.eclipse.utils.ui.ImageUtils;

public class GRegImageUtils extends ImageUtils{

	private static ImageUtils INSTANCE;
	public static ImageUtils getInstance(){
		if (INSTANCE==null){
			INSTANCE=new GRegImageUtils();
		}
		return INSTANCE;
	} 

	public Bundle getBundle(){
		return Platform.getBundle(Activator.PLUGIN_ID);
	}
	
	protected String getImageDirectoryName() {
		return "resources/icons/";
	}
}
