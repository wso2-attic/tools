package org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.deserializer;

import org.apache.synapse.mediators.AbstractMediator;
import org.eclipse.core.runtime.Assert;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.EntitlementMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.providers.EsbElementTypes;

public class EntitlementMediatorDeserializer extends AbstractEsbNodeDeserializer<AbstractMediator, EntitlementMediator>{
	
	public EntitlementMediator createNode(IGraphicalEditPart part,AbstractMediator mediator) {
		Assert.isTrue(mediator instanceof org.wso2.carbon.identity.entitlement.mediator.EntitlementMediator, "Unsupported mediator passed in for deserialization at "+ this.getClass());
		
		org.wso2.carbon.identity.entitlement.mediator.EntitlementMediator entitlementMediator = (org.wso2.carbon.identity.entitlement.mediator.EntitlementMediator)mediator;
		
		EntitlementMediator visualEntitlementMediator = (EntitlementMediator) DeserializerUtils.createNode(part, EsbElementTypes.EntitlementMediator_3505);
		setElementToEdit(visualEntitlementMediator);
		
		return visualEntitlementMediator;
	}

}
