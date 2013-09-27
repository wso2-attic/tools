package org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.deserializer;

import static org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage.Literals.END_POINT__REVERSED;
import static org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage.Literals.CALL_MEDIATOR__ENDPOINT_REGISTRYKEY;
import static org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage.Literals.CALL_MEDIATOR__ENDPOINT_TYPE;
import static org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage.Literals.CALL_MEDIATOR__ENDPOINT_XPATH;

import org.apache.synapse.endpoints.Endpoint;
import org.apache.synapse.mediators.AbstractMediator;
import org.apache.synapse.util.xpath.SynapseXPath;
import org.eclipse.core.runtime.Assert;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.jaxen.JaxenException;
import org.wso2.developerstudio.eclipse.gmf.esb.CallMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.CallMediatorEndpointType;
import org.wso2.developerstudio.eclipse.gmf.esb.EndPoint;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbFactory;
import org.wso2.developerstudio.eclipse.gmf.esb.RegistryKeyProperty;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.providers.EsbElementTypes;

public class CallMediatorDeserializer extends AbstractEsbNodeDeserializer<AbstractMediator, CallMediator> {

	public CallMediator createNode(IGraphicalEditPart part,AbstractMediator mediator) {
		
		Assert.isTrue(mediator instanceof org.apache.synapse.mediators.builtin.SendMediator, "Unsupported mediator passed in for deserialization at "+ this.getClass());
		
		org.apache.synapse.mediators.builtin.CallMediator callMediator = (org.apache.synapse.mediators.builtin.CallMediator)mediator;
		
		CallMediator visualCallMediator = (CallMediator) DeserializerUtils.createNode(part, EsbElementTypes.CallMediator_3742);
		setElementToEdit(visualCallMediator);
		
		refreshEditPartMap();
		EditPart mediatorFlow=getEditpart(visualCallMediator.getMediatorFlow());
	
		Endpoint endPoint = callMediator.getEndpoint();
		CallMediatorEndpointType endPointType = CallMediatorEndpointType.get(callMediator.getType().toUpperCase());
		executeSetValueCommand(CALL_MEDIATOR__ENDPOINT_TYPE, endPointType);
	

		if(endPointType == CallMediatorEndpointType.REGISRTYKEY){
			RegistryKeyProperty regkey = EsbFactory.eINSTANCE.createRegistryKeyProperty();
			regkey.setKeyValue(endPoint.getName());
			//vishualSend.setStaticReceivingSequence(regkey);
			executeSetValueCommand(CALL_MEDIATOR__ENDPOINT_REGISTRYKEY, regkey);
		}
			
		if(endPointType == CallMediatorEndpointType.REGISRTYKEY){
			SynapseXPath xpath = null;
			try {
				xpath = SynapseXPath.parseXPathString(endPoint.getName());
			} catch (JaxenException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (xpath != null) {
				executeSetValueCommand(CALL_MEDIATOR__ENDPOINT_XPATH,createNamespacedProperty(xpath));
			}
		}
	
		
		Endpoint endpoint = callMediator.getEndpoint();
		if(endpoint!=null){
			@SuppressWarnings("rawtypes")
			IEsbNodeDeserializer deserializer = EsbDeserializerRegistry.getInstance().getDeserializer(endpoint);
			@SuppressWarnings("unchecked")
			//EndPoint visualEndPoint = (EndPoint) deserializer.createNode(getRootCompartment(), endpoint);
			EndPoint visualEndPoint = (EndPoint) deserializer.createNode((IGraphicalEditPart) mediatorFlow.getChildren().get(0), endpoint);
			if(isReversed()){
				executeSetValueCommand(visualEndPoint,END_POINT__REVERSED,true);
			}
			//visualCallMediator.setNextNode(visualEndPoint);
			
		} 
		
		return visualCallMediator;
	}
	
}