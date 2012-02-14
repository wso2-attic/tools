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
package org.wso2.carbonstudio.eclipse.gmf.esb.internal.persistence;

import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;

import org.apache.synapse.Mediator;
import org.apache.synapse.SynapseArtifact;
import org.apache.synapse.config.xml.AnonymousListMediator;
import org.apache.synapse.config.xml.SwitchCase;
import org.apache.synapse.endpoints.AddressEndpoint;
import org.apache.synapse.endpoints.Endpoint;
import org.apache.synapse.endpoints.EndpointDefinition;
import org.apache.synapse.mediators.base.SequenceMediator;
import org.apache.synapse.mediators.builtin.PropertyMediator;
import org.apache.synapse.mediators.builtin.SendMediator;
import org.apache.synapse.mediators.filters.SwitchMediator;
import org.apache.synapse.util.xpath.SynapseXPath;
import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EObject;
import org.wso2.carbonstudio.eclipse.gmf.esb.AddressEndPoint;
import org.wso2.carbonstudio.eclipse.gmf.esb.EndPointAddressingVersion;
import org.wso2.carbonstudio.eclipse.gmf.esb.EsbNode;
import org.wso2.carbonstudio.eclipse.gmf.esb.FailoverEndPoint;
import org.wso2.carbonstudio.eclipse.gmf.esb.LoadBalanceEndPoint;
import org.wso2.carbonstudio.eclipse.gmf.esb.persistence.EsbNodeTransformer;
import org.wso2.carbonstudio.eclipse.gmf.esb.persistence.TransformationInfo;

/**
 * {@link EsbNodeTransformer} responsible for transforming
 * {@link org.wso2.carbonstudio.eclipse.gmf.esb.EndPoint} model objects into
 * corresponding synapse artifact(s).
 */
public class AddressEndPointTransformer extends AbstractEsbNodeTransformer {
	/**
	 * {@inheritDoc}
	 */
	public void transform(TransformationInfo info, EsbNode subject)
			throws Exception {
		// Check subject.
		Assert.isTrue(subject instanceof AddressEndPoint, "Invalid subject");
		AddressEndPoint visualEndPoint = (AddressEndPoint) subject;
		// Tag the outbound message.
		// String pathId = UUID.randomUUID().toString();
		// PropertyMediator tagMediator = new PropertyMediator();
		// tagMediator.setAction(PropertyMediator.ACTION_SET);
		// tagMediator.setName("outPathId");
		// tagMediator.setValue(pathId);
		// info.getParentSequence().addChild(tagMediator);

		// Send the message.
		// TODO: We're using a default endpoint here, need to handle other cases
		// on the real implementation.
		SendMediator sendMediator = null;
		if (info.getPreviouNode() instanceof org.wso2.carbonstudio.eclipse.gmf.esb.SendMediator) {
			sendMediator = (SendMediator) info.getParentSequence().getList()
					.get(info.getParentSequence().getList().size() - 1);
		} else {
			sendMediator = new SendMediator();
			info.getParentSequence().addChild(sendMediator);
		}
		AddressEndpoint synapseAddEP = new AddressEndpoint();
		EndpointDefinition synapseEPDef = new EndpointDefinition();
		synapseEPDef.setAddress(visualEndPoint.getURI());
		// TODO: Configure endpoint with values extracted from the visual model.

		// synapseEPDef.setCharSetEncoding(charSetEncoding);
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
			// synapseEPDef.setWsRMPolicyKey(visualEndPoint.getReliableMessagingPolicy().getKeyValue());
		}

		if (visualEndPoint.isSecurityEnabled()) {
			synapseEPDef.setSecurityOn(true);
			// synapseEPDef.setWsSecPolicyKey(visualEndPoint.getSecurityPolicy().getKeyValue());
		}

		synapseEPDef.setRetryDurationOnTimeout((int) (visualEndPoint
				.getRetryDelay()));
		if (ValidationUtil.isInt(visualEndPoint.getRetryErrorCodes()))
			synapseEPDef.addRetryDisabledErrorCode(ValidationUtil
					.getInt(visualEndPoint.getRetryErrorCodes()));
		if (ValidationUtil.isInt(visualEndPoint.getSuspendErrorCodes()))
			synapseEPDef.addSuspendErrorCode(ValidationUtil
					.getInt(visualEndPoint.getSuspendErrorCodes()));

		synapseAddEP.setDefinition(synapseEPDef);
		sendMediator.setEndpoint(synapseAddEP);
		

		// Process endpoint output.
		// SwitchMediator outSwitch = null;
		// // List<Mediator> outSequenceMediators = rootService
		// // .getTargetInLineOutSequence().getList();
		// List<Mediator> outSequenceMediators = info.getOriginOutSequence()
		// .getList();
		//
		// if (!outSequenceMediators.isEmpty()) {
		// Mediator firstMediator = outSequenceMediators.get(0);
		// if (firstMediator instanceof SwitchMediator) {
		// outSwitch = (SwitchMediator) firstMediator;
		// }
		// }
		//
		// // Introduce output switch if necessary.
		// if (null == outSwitch) {
		// outSwitch = new SwitchMediator();
		// outSwitch.setSource(new SynapseXPath("$ctx.outPathId"));
		// outSequenceMediators.add(0, outSwitch);
		// }
		//
		// // Add path case.
		// SwitchCase pathCase = new SwitchCase();
		// pathCase.setRegex(Pattern.compile(pathId));
		// AnonymousListMediator pathCaseMediator = new AnonymousListMediator();
		// pathCase.setCaseMediator(pathCaseMediator);
		// // Remove the path tag introduced earlier.
		// PropertyMediator tagRemoveMediator = new PropertyMediator();
		// tagRemoveMediator.setAction(PropertyMediator.ACTION_REMOVE);
		// tagRemoveMediator.setName("outPathId");
		// pathCaseMediator.addChild(tagRemoveMediator);
		// outSwitch.addCase(pathCase);

		if (!info.isEndPointFound) {
			info.isEndPointFound = true;
			info.firstEndPoint = visualEndPoint;
		}

		info.setParentSequence(info.getOriginOutSequence());
		info.setTraversalDirection(TransformationInfo.TRAVERSAL_DIRECTION_OUT);

		// Transform endpoint output data flow.
		doTransform(info, visualEndPoint.getOutputConnector());
	}

	public void createSynapseObject(TransformationInfo info, EObject subject,
			List<Endpoint> endPoints) {

		Assert.isTrue(subject instanceof AddressEndPoint, "Invalid subject");
		AddressEndPoint addressEndPoint = (AddressEndPoint) subject;

		SendMediator sendMediator = null;
		if (info.getPreviouNode() instanceof org.wso2.carbonstudio.eclipse.gmf.esb.SendMediator) {
			sendMediator = (SendMediator) info.getParentSequence().getList()
					.get(info.getParentSequence().getList().size() - 1);
		} else {
			sendMediator = new SendMediator();
		}
		AddressEndpoint synapseAddEP = new AddressEndpoint();
		EndpointDefinition synapseEPDef = new EndpointDefinition();
		synapseEPDef.setAddress(addressEndPoint.getURI());
		// TODO: Configure endpoint with values extracted from the visual model.

		// synapseEPDef.setCharSetEncoding(charSetEncoding);
		if (addressEndPoint.isAddressingEnabled()) {
			synapseEPDef.setAddressingOn(true);
			synapseEPDef.setUseSeparateListener(addressEndPoint
					.isAddressingSeparateListener());
			synapseEPDef
					.setAddressingVersion((addressEndPoint
							.getAddressingVersion() == EndPointAddressingVersion.FINAL) ? "final"
							: "submission");
		}
		if (addressEndPoint.isReliableMessagingEnabled()) {
			synapseEPDef.setReliableMessagingOn(addressEndPoint
					.isReliableMessagingEnabled());
			// synapseEPDef.setWsRMPolicyKey(visualEndPoint.getReliableMessagingPolicy().getKeyValue());
		}

		if (addressEndPoint.isSecurityEnabled()) {
			synapseEPDef.setSecurityOn(true);
			// synapseEPDef.setWsSecPolicyKey(visualEndPoint.getSecurityPolicy().getKeyValue());
		}

		synapseEPDef.setRetryDurationOnTimeout((int) (addressEndPoint
				.getRetryDelay()));
		if (ValidationUtil.isInt(addressEndPoint.getRetryErrorCodes()))
			synapseEPDef.addRetryDisabledErrorCode(ValidationUtil
					.getInt(addressEndPoint.getRetryErrorCodes()));
		if (ValidationUtil.isInt(addressEndPoint.getSuspendErrorCodes()))
			synapseEPDef.addSuspendErrorCode(ValidationUtil
					.getInt(addressEndPoint.getSuspendErrorCodes()));

		synapseAddEP.setDefinition(synapseEPDef);
		// sendMediator.setEndpoint(synapseAddEP);

		Endpoint endPoint = (Endpoint) synapseAddEP;
		endPoints.add(endPoint);

		// Next node may be a Failover endPoint. So that this should be edited
		// to be compatible with that also.
		info.setParentSequence(info.getOriginOutSequence());
		info.setTraversalDirection(TransformationInfo.TRAVERSAL_DIRECTION_OUT);

		// Transform endpoint output data flow.

		if (!info.isOutputPathSet) {
			if (info.firstEndPoint instanceof FailoverEndPoint) {
				try {
					doTransform(info,
							((FailoverEndPoint) info.firstEndPoint)
									.getWestOutputConnector());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out
							.println("Error addressEndpointTransformer class.");
					e.printStackTrace();
				}
			}
			if (info.firstEndPoint instanceof LoadBalanceEndPoint) {
				try {
					doTransform(info,
							((LoadBalanceEndPoint) info.firstEndPoint)
									.getWestOutputConnector());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out
							.println("Error addressEndpointTransformer class.");
					e.printStackTrace();
				}
			}
			info.isOutputPathSet = true;
		}

		// return synapseAddEP;
	}

	public void transformWithinSequence(TransformationInfo information,
			EsbNode subject, SequenceMediator sequence) throws Exception {
		// TODO Auto-generated method stub

	}

}
