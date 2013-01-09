package org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.deserializer;

import org.apache.synapse.endpoints.AbstractEndpoint;
import org.eclipse.core.runtime.Assert;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.AbstractEndPoint;
import org.wso2.developerstudio.eclipse.gmf.esb.FailoverEndPoint;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.providers.EsbElementTypes;

public class FailoverEndpointDeserializer extends AbstractComplexEndPointDeserializer{
	
	public FailoverEndPoint createNode(IGraphicalEditPart part,AbstractEndpoint object) {
		Assert.isTrue(object instanceof org.apache.synapse.endpoints.FailoverEndpoint, "Unsupported endpoint passed in for deserialization at "+ this.getClass());
		
		org.apache.synapse.endpoints.FailoverEndpoint failoverEndpoint = (org.apache.synapse.endpoints.FailoverEndpoint)object;
		
		FailoverEndPoint endPoint = (FailoverEndPoint) DeserializerUtils.createNode(part, EsbElementTypes.FailoverEndPoint_3611);
		setElementToEdit(endPoint);
		deserializeComplexEndpoint(failoverEndpoint);
		
		return endPoint;
	}

}
