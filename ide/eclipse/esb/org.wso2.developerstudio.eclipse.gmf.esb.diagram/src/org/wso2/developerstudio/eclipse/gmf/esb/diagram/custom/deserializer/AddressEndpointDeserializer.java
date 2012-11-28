package org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.deserializer;

import org.apache.synapse.endpoints.AbstractEndpoint;
import org.eclipse.core.runtime.Assert;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.AbstractEndPoint;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.providers.EsbElementTypes;
import static org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage.Literals.*;

public class AddressEndpointDeserializer extends AbstractEndpointDeserializer{
	
	public AbstractEndPoint createNode(IGraphicalEditPart part,AbstractEndpoint object) {
		Assert.isTrue(object instanceof org.apache.synapse.endpoints.AddressEndpoint, "Unsupported endpoint passed in for deserialization at "+ this.getClass());
		
		org.apache.synapse.endpoints.AddressEndpoint addressEndpoint = (org.apache.synapse.endpoints.AddressEndpoint)object;
		
		AbstractEndPoint endPoint = (AbstractEndPoint) DeserializerUtils.createNode(part, EsbElementTypes.AddressEndPoint_3610);
		setElementToEdit(endPoint);
		deserializeEndpoint(addressEndpoint,endPoint);
		
		executeSetValueCommand(ADDRESS_END_POINT__URI, addressEndpoint.getDefinition().getAddress());
		
		return endPoint;
	}

}
