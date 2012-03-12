package org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.MergeNodeCreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.ProxyServiceCreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.providers.EsbElementTypes;

/**
 * @generated
 */
public class EsbServerContentsCompartmentItemSemanticEditPolicy extends
		EsbBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public EsbServerContentsCompartmentItemSemanticEditPolicy() {
		super(EsbElementTypes.EsbServer_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (EsbElementTypes.ProxyService_3001 == req.getElementType()) {
			return getGEFWrapper(new ProxyServiceCreateCommand(req));
		}
		if (EsbElementTypes.MergeNode_3013 == req.getElementType()) {
			return getGEFWrapper(new MergeNodeCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
