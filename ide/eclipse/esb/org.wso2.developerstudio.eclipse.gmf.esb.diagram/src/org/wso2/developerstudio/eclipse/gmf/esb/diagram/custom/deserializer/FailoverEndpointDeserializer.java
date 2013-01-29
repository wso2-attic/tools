package org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.deserializer;

import org.apache.synapse.endpoints.AbstractEndpoint;
import org.eclipse.core.runtime.Assert;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.wso2.developerstudio.eclipse.gmf.esb.FailoverEndPoint;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.EndpointDiagramEndpointCompartment2EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.EndpointDiagramEndpointCompartmentEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.providers.EsbElementTypes;

public class FailoverEndpointDeserializer extends AbstractComplexEndPointDeserializer{
	
	public FailoverEndPoint createNode(IGraphicalEditPart part,AbstractEndpoint object) {
		Assert.isTrue(object instanceof org.apache.synapse.endpoints.FailoverEndpoint, "Unsupported endpoint passed in for deserialization at "+ this.getClass());
		
		org.apache.synapse.endpoints.FailoverEndpoint failoverEndpoint = (org.apache.synapse.endpoints.FailoverEndpoint)object;
		IElementType endpointType = (part instanceof EndpointDiagramEndpointCompartment2EditPart ||
				part instanceof EndpointDiagramEndpointCompartmentEditPart) ? EsbElementTypes.FailoverEndPoint_3649
				: EsbElementTypes.FailoverEndPoint_3611;
		FailoverEndPoint endPoint = (FailoverEndPoint) DeserializerUtils.createNode(part,endpointType);
		setElementToEdit(endPoint);
		deserializeComplexEndpoint(failoverEndpoint);
		
		return endPoint;
	}

}
