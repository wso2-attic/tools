package org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.commands.AddressEndPoint2CreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.commands.DefaultEndPoint2CreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.commands.FailoverEndPoint2CreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.commands.LoadBalanceEndPoint2CreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.commands.WSDLEndPoint2CreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.providers.EsbElementTypes;

/**
 * @generated
 */
public class ProxyServiceEndpointContainerEndpointCompartmentItemSemanticEditPolicy extends
                                                                                   EsbBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ProxyServiceEndpointContainerEndpointCompartmentItemSemanticEditPolicy() {
		super(EsbElementTypes.ProxyServiceEndpointContainer_3392);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (EsbElementTypes.DefaultEndPoint_3382 == req.getElementType()) {
			return getGEFWrapper(new DefaultEndPoint2CreateCommand(req));
		}
		if (EsbElementTypes.AddressEndPoint_3383 == req.getElementType()) {
			return getGEFWrapper(new AddressEndPoint2CreateCommand(req));
		}
		if (EsbElementTypes.FailoverEndPoint_3384 == req.getElementType()) {
			return getGEFWrapper(new FailoverEndPoint2CreateCommand(req));
		}
		if (EsbElementTypes.WSDLEndPoint_3385 == req.getElementType()) {
			return getGEFWrapper(new WSDLEndPoint2CreateCommand(req));
		}
		if (EsbElementTypes.LoadBalanceEndPoint_3386 == req.getElementType()) {
			return getGEFWrapper(new LoadBalanceEndPoint2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
