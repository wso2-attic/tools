package org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.deserializer;

import org.apache.synapse.mediators.AbstractMediator;
import org.eclipse.core.runtime.Assert;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.CalloutMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.CalloutPayloadType;
import org.wso2.developerstudio.eclipse.gmf.esb.CalloutResultType;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.providers.EsbElementTypes;
import static org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage.Literals.*;

public class CalloutMediatorDeserializer extends AbstractEsbNodeDeserializer<AbstractMediator, CalloutMediator>{

	public CalloutMediator createNode(IGraphicalEditPart part,AbstractMediator mediator) {
		Assert.isTrue(mediator instanceof org.apache.synapse.mediators.builtin.CalloutMediator, "Unsupported mediator passed in for deserialization at "+ this.getClass());
		
		org.apache.synapse.mediators.builtin.CalloutMediator calloutMediator = (org.apache.synapse.mediators.builtin.CalloutMediator)mediator;
		
		CalloutMediator visualCalloutMediator = (CalloutMediator) DeserializerUtils.createNode(part, EsbElementTypes.CalloutMediator_3520);
		setElementToEdit(visualCalloutMediator);	
		
		executeSetValueCommand(CALLOUT_MEDIATOR__SERVICE_URL, calloutMediator.getServiceURL());
		executeSetValueCommand(CALLOUT_MEDIATOR__SOAP_ACTION, calloutMediator.getAction());
		
		if(calloutMediator.getRequestXPath()!=null){
			executeSetValueCommand(CALLOUT_MEDIATOR__PAYLOAD_MESSAGE_XPATH, createNamespacedProperty(calloutMediator.getRequestXPath()));
			executeSetValueCommand(CALLOUT_MEDIATOR__PAYLOAD_TYPE, CalloutPayloadType.XPATH);
		}else{
			/*executeSetValueCommand(visualCalloutMediator.getPayloadRegistryKey(),REGISTRY_KEY_PROPERTY__KEY_VALUE, calloutMediator.getRequestKey());
			executeSetValueCommand(CALLOUT_MEDIATOR__PAYLOAD_TYPE, CalloutPayloadType.REGISTRY_ENTRY);*/
		}
		
		if(calloutMediator.getTargetXPath()!=null){
			executeSetValueCommand(CALLOUT_MEDIATOR__RESULT_MESSAGE_XPATH, createNamespacedProperty(calloutMediator.getTargetXPath()));
			executeSetValueCommand(CALLOUT_MEDIATOR__RESULT_TYPE, CalloutResultType.XPATH);
		}else{
			executeSetValueCommand(CALLOUT_MEDIATOR__RESULT_CONTEXT_PROPERTY, calloutMediator.getTargetKey());
			executeSetValueCommand(CALLOUT_MEDIATOR__RESULT_TYPE, CalloutResultType.PROPERTY);
		}
		
		if(calloutMediator.getClientRepository()!=null){
			executeSetValueCommand(CALLOUT_MEDIATOR__PATH_TO_AXIS2_REPOSITORY,calloutMediator.getClientRepository());
		}
		if(calloutMediator.getAxis2xml()!=null){
			executeSetValueCommand(CALLOUT_MEDIATOR__PATH_TO_AXIS2XML, calloutMediator.getAxis2xml());
		}
		
		return visualCalloutMediator;
	}

}
