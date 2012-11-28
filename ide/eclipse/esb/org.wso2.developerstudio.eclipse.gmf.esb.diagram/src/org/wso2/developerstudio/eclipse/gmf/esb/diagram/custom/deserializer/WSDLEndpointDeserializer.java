package org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.deserializer;

import org.apache.synapse.endpoints.AbstractEndpoint;
import org.eclipse.core.runtime.Assert;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.wso2.developerstudio.eclipse.gmf.esb.AbstractEndPoint;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.EndpointDiagramEndpointCompartment2EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.providers.EsbElementTypes;
import static org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage.Literals.*;

public class WSDLEndpointDeserializer extends AbstractEndpointDeserializer{
	
	public AbstractEndPoint createNode(IGraphicalEditPart part,AbstractEndpoint object) {
		Assert.isTrue(object instanceof org.apache.synapse.endpoints.WSDLEndpoint, "Unsupported endpoint passed in for deserialization at "+ this.getClass());
		
		org.apache.synapse.endpoints.WSDLEndpoint wsdlEndpoint = (org.apache.synapse.endpoints.WSDLEndpoint)object;
		
		IElementType endpointType = (part instanceof EndpointDiagramEndpointCompartment2EditPart) ? EsbElementTypes.WSDLEndPoint_3653
				: EsbElementTypes.WSDLEndPoint_3612;
		AbstractEndPoint endPoint = (AbstractEndPoint) DeserializerUtils.createNode(part, endpointType);
		setElementToEdit(endPoint);
		deserializeEndpoint(wsdlEndpoint,endPoint);
		
		executeSetValueCommand(WSDL_END_POINT__WSDL_URI, wsdlEndpoint.getWsdlURI());
		executeSetValueCommand(WSDL_END_POINT__PORT, wsdlEndpoint.getPortName());
		executeSetValueCommand(WSDL_END_POINT__SERVICE, wsdlEndpoint.getServiceName());
		
		return endPoint;
	}

}
