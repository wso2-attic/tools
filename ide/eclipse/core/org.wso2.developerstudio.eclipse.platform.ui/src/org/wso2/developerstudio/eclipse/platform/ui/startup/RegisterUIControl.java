package org.wso2.developerstudio.eclipse.platform.ui.startup;

import java.util.ArrayList;
import java.util.List;

import org.wso2.developerstudio.eclipse.platform.ui.interfaces.UIControl;

public class RegisterUIControl {
	
	private static List<UIControl> uiControlList;
	
	public void registerUIControls(UIControl control){
		if(getUiControlList() == null){
			setUiControlList(new ArrayList<UIControl>()); 
		}
		if(!getUiControlList().contains(control)){
			getUiControlList().add(control);
		}
		
	}

	public static void setUiControlList(List<UIControl> uiControlList) {
		RegisterUIControl.uiControlList = uiControlList;
	}

	public static List<UIControl> getUiControlList() {
		return uiControlList;
	}
}
