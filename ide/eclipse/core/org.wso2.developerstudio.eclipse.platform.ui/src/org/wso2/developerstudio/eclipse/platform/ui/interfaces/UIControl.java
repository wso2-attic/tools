package org.wso2.developerstudio.eclipse.platform.ui.interfaces;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public interface UIControl {

	/**
	 * 
	 * @param container
	 * @param columns
	 * @param verticalIndent
	 * @param horizontalIndent
	 * @param isTextReadonly
	 * @param shell
	 * @param label
	 * @param filter
	 * @param fileButtonCaption
	 * @param selectedOption
	 * public static final int SELECTED_NONE = 1;
	   public static final int SELECTED_REGISTRY = 2;
	   public static final int SELECTED_REGISTRY_PATH = 4;
	   public static final int SELECTED_REGISTRY_RESOURCE = 8;
	 * @return
	 */
	public IFieldControlData createUIField(String id,Composite container,int columns,Integer verticalIndent,
								 Integer horizontalIndent,
								 boolean isTextReadonly,
								 final Shell shell,
								 final String label, 
								 String fileButtonCaption,
								 int selectedOption);
	
	public IFieldControlData addRegistryBrowseButton(Composite container, Shell shell,
	       String label, String buttonCaption, Text txtValue,
	       int selectedOption);
}
