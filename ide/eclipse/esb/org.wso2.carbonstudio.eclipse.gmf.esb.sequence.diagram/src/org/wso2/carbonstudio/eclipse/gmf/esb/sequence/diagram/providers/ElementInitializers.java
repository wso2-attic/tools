package org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.providers;

import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.part.EsbDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = EsbDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			EsbDiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}
}
