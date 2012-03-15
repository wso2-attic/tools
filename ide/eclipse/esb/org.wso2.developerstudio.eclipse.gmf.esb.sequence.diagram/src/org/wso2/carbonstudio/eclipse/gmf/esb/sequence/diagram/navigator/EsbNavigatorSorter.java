package org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.part.EsbVisualIDRegistry;

/**
 * @generated
 */
public class EsbNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7503;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof EsbNavigatorItem) {
			EsbNavigatorItem item = (EsbNavigatorItem) element;
			return EsbVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
