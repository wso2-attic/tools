package org.wso2.developerstudio.eclipse.gmf.esb.internal.persistence;

import java.util.List;

import org.apache.synapse.endpoints.Endpoint;
import org.apache.synapse.endpoints.WSDLEndpoint;
import org.apache.synapse.mediators.base.SequenceMediator;
import org.apache.synapse.mediators.builtin.SendMediator;
import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.wso2.developerstudio.eclipse.gmf.esb.EndPoint;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbNode;
import org.wso2.developerstudio.eclipse.gmf.esb.InputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.Sequence;
import org.wso2.developerstudio.eclipse.gmf.esb.SequenceInputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.WSDLEndPoint;
import org.wso2.developerstudio.eclipse.gmf.esb.persistence.TransformationInfo;

public class WSDLEndPointTransformer extends AbstractEndpointTransformer{

	public void transform(TransformationInfo information, EsbNode subject)
			throws Exception {
		
		Assert.isTrue(subject instanceof WSDLEndPoint, "Invalid subject");
		WSDLEndPoint visualEndPoint = (WSDLEndPoint) subject;
		
		SendMediator sendMediator = getSendMediator(information);

		if(visualEndPoint.isInLine()){
			information.getCurrentProxy().setTargetInLineEndpoint(create(visualEndPoint,null));
		}else{
			if(sendMediator !=null){
				sendMediator.setEndpoint(create(visualEndPoint,null));
			}
		}
		
		if(visualEndPoint.getOutputConnector()!=null){
			if(visualEndPoint.getOutputConnector().getOutgoingLink() !=null){
				InputConnector nextInputConnector=visualEndPoint.getOutputConnector().getOutgoingLink().getTarget();
				if((!(nextInputConnector instanceof SequenceInputConnector))||
						((((Sequence)nextInputConnector.eContainer()).getOutputConnector().get(0).getOutgoingLink()!=null)&&(!(((Sequence)nextInputConnector.eContainer()).getOutputConnector().get(0).getOutgoingLink().getTarget().eContainer() instanceof EndPoint)))){
					information.setParentSequence(information.getOriginOutSequence());
					information.setTraversalDirection(TransformationInfo.TRAVERSAL_DIRECTION_OUT);
				}else if(visualEndPoint.getInputConnector().getIncomingLinks().get(0).getSource().eContainer() instanceof Sequence){
					information.setParentSequence(information.getCurrentReferredSequence());
				}
			}
		}

		if(!information.isEndPointFound){
			information.isEndPointFound=true;
			information.firstEndPoint=visualEndPoint;
		}

		List<EsbNode> transformedMediators = information.getTransformedMediators();
		if (visualEndPoint.getOutputConnector() != null && visualEndPoint.getOutputConnector().getOutgoingLink()!=null) {
			EsbNode nextElement = (EsbNode) visualEndPoint.getOutputConnector().getOutgoingLink().getTarget().eContainer();
			if (transformedMediators.contains(nextElement)) {
				return;
			}
			transformedMediators.add(nextElement);
		}

		
		// Transform endpoint output data flow.
		doTransform(information, visualEndPoint.getOutputConnector());

	}

	public void createSynapseObject(TransformationInfo info, EObject subject,
			List<Endpoint> endPoints) {
		
		Assert.isTrue(subject instanceof WSDLEndPoint, "Invalid subject");
		WSDLEndPoint visualEndPoint = (WSDLEndPoint) subject;
		
		Endpoint endPoint =(Endpoint)create(visualEndPoint,null);
		endPoints.add(endPoint);		
		//Next node may be a Failover endPoint. So that this should be edited to be compatible with that also.
		info.setParentSequence(info.getOriginOutSequence());
		info.setTraversalDirection(TransformationInfo.TRAVERSAL_DIRECTION_OUT);		

		// Transform endpoint output data flow.
		transformEndpointOutflow(info);

	}
	
	public WSDLEndpoint create(WSDLEndPoint visualEndPoint,String name){
		WSDLEndpoint synapseWSDLEP = new WSDLEndpoint();
		synapseWSDLEP.setWsdlURI(visualEndPoint.getWsdlUri());
		synapseWSDLEP.setServiceName(visualEndPoint.getService());
		synapseWSDLEP.setPortName(visualEndPoint.getPort());
		if(name!=null){
			synapseWSDLEP.setName(name);
		}
		
		createAdvanceOptions(visualEndPoint,synapseWSDLEP);
		
/*		EndpointDefinition synapseEPDef = new EndpointDefinition();
		synapseWSDLEP.setWsdlURI(visualEndPoint.getWsdlUri());
		synapseWSDLEP.setServiceName(visualEndPoint.getService());
		synapseWSDLEP.setPortName(visualEndPoint.getPort());
		if(name!=null){
			synapseWSDLEP.setName(name);
		}
		
		if (visualEndPoint.isAddressingEnabled()) {
			synapseEPDef.setAddressingOn(true);
			synapseEPDef.setUseSeparateListener(visualEndPoint
					.isAddressingSeparateListener());
			synapseEPDef
					.setAddressingVersion((visualEndPoint
							.getAddressingVersion() == EndPointAddressingVersion.FINAL) ? "final"
							: "submission");
		}
		
		if (visualEndPoint.isReliableMessagingEnabled()) {
			synapseEPDef.setReliableMessagingOn(visualEndPoint
					.isReliableMessagingEnabled());
			
		}
		if (visualEndPoint.isSecurityEnabled()) {
			synapseEPDef.setSecurityOn(true);
			
		}		

		synapseEPDef.setRetryDurationOnTimeout((int) (visualEndPoint
				.getRetryDelay()));
		if (ValidationUtil.isInt(visualEndPoint.getRetryErrorCodes()))
			synapseEPDef.addRetryDisabledErrorCode(ValidationUtil
					.getInt(visualEndPoint.getRetryErrorCodes()));
		if (ValidationUtil.isInt(visualEndPoint.getSuspendErrorCodes()))
			synapseEPDef.addSuspendErrorCode(ValidationUtil
					.getInt(visualEndPoint.getSuspendErrorCodes()));
		
		synapseWSDLEP.setDefinition(synapseEPDef);*/
		
		return synapseWSDLEP;
	}

	

	public void transformWithinSequence(TransformationInfo information,
			EsbNode subject, SequenceMediator sequence) throws Exception {
		
		Assert.isTrue(subject instanceof WSDLEndPoint, "Invalid subject");
		WSDLEndPoint visualEndPoint = (WSDLEndPoint) subject;
		
		SendMediator sendMediator = getSendMediator(sequence);
		
		sendMediator.setEndpoint(create(visualEndPoint,null));
		
	}

}
