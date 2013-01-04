/*
 * Copyright 2009-2010 WSO2, Inc. (http://wso2.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.wso2.developerstudio.eclipse.gmf.esb.internal.persistence;

import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;

import org.apache.synapse.Mediator;
import org.apache.synapse.SynapseArtifact;
import org.apache.synapse.config.xml.AnonymousListMediator;
import org.apache.synapse.config.xml.SwitchCase;
import org.apache.synapse.endpoints.DefaultEndpoint;
import org.apache.synapse.endpoints.Endpoint;
import org.apache.synapse.endpoints.EndpointDefinition;
import org.apache.synapse.endpoints.WSDLEndpoint;
import org.apache.synapse.mediators.base.SequenceMediator;
import org.apache.synapse.mediators.builtin.PropertyMediator;
import org.apache.synapse.mediators.builtin.SendMediator;
import org.apache.synapse.mediators.filters.SwitchMediator;
import org.apache.synapse.util.xpath.SynapseXPath;
import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.wso2.developerstudio.eclipse.gmf.esb.DefaultEndPoint;
import org.wso2.developerstudio.eclipse.gmf.esb.EndPoint;
import org.wso2.developerstudio.eclipse.gmf.esb.EndPointAddressingVersion;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbNode;
import org.wso2.developerstudio.eclipse.gmf.esb.FailoverEndPoint;
import org.wso2.developerstudio.eclipse.gmf.esb.InputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.LoadBalanceEndPoint;
import org.wso2.developerstudio.eclipse.gmf.esb.Sequence;
import org.wso2.developerstudio.eclipse.gmf.esb.SequenceInputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.WSDLEndPoint;
import org.wso2.developerstudio.eclipse.gmf.esb.persistence.EsbNodeTransformer;
import org.wso2.developerstudio.eclipse.gmf.esb.persistence.TransformationInfo;

/**
 * {@link EsbNodeTransformer} responsible for transforming
 * {@link org.wso2.developerstudio.eclipse.gmf.esb.EndPoint} model objects into
 * corresponding synapse artifact(s).
 */
public class DefaultEndPointTransformer extends AbstractEndpointTransformer {
	/**
	 * {@inheritDoc}
	 */
	public void transform(TransformationInfo info, EsbNode subject)
			throws Exception {
		// Check subject.
		Assert.isTrue(subject instanceof EndPoint, "Invalid subject");
		DefaultEndPoint visualEP = (DefaultEndPoint) subject;

		// Send the message.
		SendMediator sendMediator = null;
		if (info.getPreviouNode() instanceof org.wso2.developerstudio.eclipse.gmf.esb.SendMediator) {
			sendMediator = (SendMediator) info.getParentSequence().getList()
			.get(info.getParentSequence().getList().size() - 1);
		} else if(info.getPreviouNode() instanceof org.wso2.developerstudio.eclipse.gmf.esb.Sequence){
			sendMediator=null;
		} else {
			sendMediator = new SendMediator();
			info.getParentSequence().addChild(sendMediator);
		}		
		if(visualEP.isInLine()){
			info.getCurrentProxy().setTargetInLineEndpoint(create(visualEP,null));
		}else{
			if(sendMediator !=null){
				sendMediator.setEndpoint(create(visualEP,null));
			}
		}
		
		if(!info.isEndPointFound){
			info.isEndPointFound=true;
			info.firstEndPoint=visualEP;
		}
		
		if(visualEP.getOutputConnector()!=null){
			if(visualEP.getOutputConnector().getOutgoingLink() !=null){
			InputConnector nextInputConnector=visualEP.getOutputConnector().getOutgoingLink().getTarget();
			if((!(nextInputConnector instanceof SequenceInputConnector))||
					((((Sequence)nextInputConnector.eContainer()).getOutputConnector().getOutgoingLink()!=null)&&(!(((Sequence)nextInputConnector.eContainer()).getOutputConnector().getOutgoingLink().getTarget().eContainer() instanceof EndPoint)))){
			info.setParentSequence(info.getOriginOutSequence());
			info.setTraversalDirection(TransformationInfo.TRAVERSAL_DIRECTION_OUT);
			}else if(visualEP.getInputConnector().getIncomingLinks().get(0).getSource().eContainer() instanceof Sequence){
				info.setParentSequence(info.getCurrentReferredSequence());
			}
			}
		}
		
		try{
			List<EsbNode> transformedMediators = info.getTransformedMediators();
			if(visualEP.getOutputConnector()!=null){
				EsbNode nextElement=(EsbNode) visualEP.getOutputConnector().getOutgoingLink().getTarget().eContainer();
				if(transformedMediators.contains(nextElement)){
					return;
				}
				transformedMediators.add(nextElement);
			}
		}
		catch(NullPointerException e){
			MessageDialog
			.openError(
					Display.getCurrent().getActiveShell(),
					"Diagram Incomplete ! ",
					"Output connector of an Endpoint must be connected to an Recieve Sequence or Out Sequence.");
		}

		// Transform endpoint output data flow.
		// TODO: find out why this was commented out.
		// might want to check if the flow is connected back to initial proxy
		// service
		doTransform(info, visualEP.getOutputConnector());
	}

	public void createSynapseObject(TransformationInfo info, EObject subject,
			List<Endpoint> endPoints) {
		Assert.isTrue(subject instanceof EndPoint, "Invalid subject");
		DefaultEndPoint visualEP = (DefaultEndPoint) subject;
		Endpoint endPoint=(Endpoint)create(visualEP,null);
		endPoints.add(endPoint);
		
		//Next node may be a Failover endPoint. So that this should be edited to be compatible with that also.
		info.setParentSequence(info.getOriginOutSequence());
		info.setTraversalDirection(TransformationInfo.TRAVERSAL_DIRECTION_OUT);		
		// Transform endpoint output data flow.
		
		if(!info.isOutputPathSet){
		if(info.firstEndPoint instanceof FailoverEndPoint){
		try {
			doTransform(info, ((FailoverEndPoint)info.firstEndPoint).getWestOutputConnector());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
		if(info.firstEndPoint instanceof LoadBalanceEndPoint){
			try {
				doTransform(info, ((LoadBalanceEndPoint)info.firstEndPoint).getWestOutputConnector());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		info.isOutputPathSet=true;
		}
		
	}
	
	public DefaultEndpoint create(DefaultEndPoint visualEndPoint,String name){ 
		
		DefaultEndpoint synapseEP = new DefaultEndpoint();
		if(name!=null){
			synapseEP.setName(name);
		}
		createAdvanceOptions(visualEndPoint,synapseEP);
		
		/*EndpointDefinition synapseEPDef = new EndpointDefinition();
		// synapseEPDef.setCharSetEncoding(charSetEncoding);
		if (visualEndPoint.isAddressingEnabled()) {
			synapseEPDef.setAddressingOn(true);
			synapseEPDef.setUseSeparateListener(visualEndPoint
					.isAddressingSeparateListener());
			synapseEPDef
					.setAddressingVersion((visualEndPoint.getAddressingVersion() == EndPointAddressingVersion.FINAL) ? "final"
							: "submission");
		}
		if (visualEndPoint.isReliableMessagingEnabled()) {
			synapseEPDef.setReliableMessagingOn(visualEndPoint
					.isReliableMessagingEnabled());
			// synapseEPDef.setWsRMPolicyKey(visualEP.getReliableMessagingPolicy().getKeyValue());
		}

		if (visualEndPoint.isSecurityEnabled()) {
			synapseEPDef.setSecurityOn(true);
			// synapseEPDef.setWsSecPolicyKey(visualEP.getSecurityPolicy().getKeyValue());
		}

		synapseEPDef
				.setRetryDurationOnTimeout((int) (visualEndPoint.getRetryDelay()));
		if (ValidationUtil.isInt(visualEndPoint.getRetryErrorCodes()))
			synapseEPDef.addRetryDisabledErrorCode(ValidationUtil
					.getInt(visualEndPoint.getRetryErrorCodes()));
		if (ValidationUtil.isInt(visualEndPoint.getSuspendErrorCodes()))
			synapseEPDef.addSuspendErrorCode(ValidationUtil.getInt(visualEndPoint
					.getSuspendErrorCodes()));

		synapseEP.setDefinition(synapseEPDef);*/
		
		return synapseEP;
		
	}



	public void transformWithinSequence(TransformationInfo information,
			EsbNode subject, SequenceMediator sequence) throws Exception {
		Assert.isTrue(subject instanceof DefaultEndPoint, "Invalid subject");
		DefaultEndPoint visualEndPoint = (DefaultEndPoint) subject;
		
		SendMediator sendMediator = null;
		if (sequence.getList().get(sequence.getList().size()-1) instanceof SendMediator) {			
			sendMediator = (SendMediator)sequence.getList().get(sequence.getList().size()-1);
		} else {
			sendMediator = new SendMediator();
			sequence.addChild(sendMediator);
		}		
		sendMediator.setEndpoint(create(visualEndPoint,null));
		
	}


}
