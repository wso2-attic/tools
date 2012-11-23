package org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.deserializer;

import org.apache.synapse.endpoints.AbstractEndpoint;
import org.eclipse.core.runtime.Assert;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.AbstractEndPoint;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.providers.EsbElementTypes;

public class WSDLEndpointDeserializer extends AbstractEndpointDeserializer{
	
	public AbstractEndPoint createNode(IGraphicalEditPart part,AbstractEndpoint object) {
		Assert.isTrue(object instanceof org.apache.synapse.endpoints.WSDLEndpoint, "Unsupported endpoint passed in for deserialization at "+ this.getClass());
		
		org.apache.synapse.endpoints.WSDLEndpoint wsdlEndpoint = (org.apache.synapse.endpoints.WSDLEndpoint)object;
		
		AbstractEndPoint endPoint = (AbstractEndPoint) DeserializerUtils.createNode(part, EsbElementTypes.WSDLEndPoint_3612);
		setElementToEdit(endPoint);
		deserializeEndpoint(wsdlEndpoint,endPoint);
		return endPoint;
	}

}
