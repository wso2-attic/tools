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

import java.net.URI;
import java.util.List;

import javax.xml.namespace.QName;

import org.apache.synapse.SynapseArtifact;
import org.apache.synapse.endpoints.Endpoint;
import org.apache.synapse.mediators.base.SequenceMediator;
import org.apache.synapse.util.xpath.SynapseXPath;
import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EObject;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbNode;
import org.wso2.developerstudio.eclipse.gmf.esb.FaultMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.PropertyMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.persistence.EsbNodeTransformer;
import org.wso2.developerstudio.eclipse.gmf.esb.persistence.TransformationInfo;

/**
 * {@link EsbNodeTransformer} responsible for transforming
 * {@link org.wso2.developerstudio.eclipse.gmf.esb.LogMediator} model objects into
 * corresponding synapse artifact(s).
 */
public class FaultMediatorTransformer extends AbstractEsbNodeTransformer {
	public static final String soap11EnvNS = "http://schemas.xmlsoap.org/soap/envelope/";
	public static final String soap12EnvNS = "http://www.w3.org/2003/05/soap-envelope/";

	/**
	 * {@inheritDoc}
	 */
	public void transform(TransformationInfo info, EsbNode subject)
			throws Exception {
	
		info.getParentSequence().addChild(createFaultMediator(subject));

		// Transform the fault mediator output data flow path.
		doTransform(info, ((FaultMediator) subject).getOutputConnector());
	}

	public void createSynapseObject(TransformationInfo info, EObject subject,
			List<Endpoint> endPoints) {
		// TODO Auto-generated method stub
		
	}



	public void transformWithinSequence(TransformationInfo information,
			EsbNode subject, SequenceMediator sequence) throws Exception {
		// TODO Auto-generated method stub
		sequence.addChild(createFaultMediator(subject));
		doTransformWithinSequence(information,((FaultMediator) subject).getOutputConnector().getOutgoingLink(),sequence);
		
		
	}
	
	private org.apache.synapse.mediators.transform.FaultMediator createFaultMediator(EsbNode subject) throws Exception{
		// Check subject.
		Assert.isTrue(subject instanceof FaultMediator, "Invalid subject.");
		FaultMediator visualFault = (FaultMediator) subject;

		// Configure fault mediator.
		org.apache.synapse.mediators.transform.FaultMediator faultMediator = new org.apache.synapse.mediators.transform.FaultMediator();
		{
			// Soap Version.
			switch (visualFault.getSoapVersion()) {
			case SOAP_11:
				faultMediator
						.setSoapVersion(org.apache.synapse.mediators.transform.FaultMediator.SOAP11);
				switch (visualFault.getFaultCodeSoap11()) {
				case VERSION_MISSMATCH:
					faultMediator.setFaultCodeValue(new QName(soap11EnvNS,
							"VersionMismatch", "soap11Env"));
					break;
				case MUST_UNDERSTAND:
					faultMediator.setFaultCodeValue(new QName(soap11EnvNS,
							"MustUnderstand", "soap11Env"));
				case SERVER:
					faultMediator.setFaultCodeValue(new QName(soap11EnvNS,
							"Server", "soap11Env"));
				case CLIENT:
					faultMediator.setFaultCodeValue(new QName(soap11EnvNS,
							"Client", "soap11Env"));
				}
				break;
			case SOAP_12:
				faultMediator
						.setSoapVersion(org.apache.synapse.mediators.transform.FaultMediator.SOAP12);
				switch (visualFault.getFaultCodeSoap12()) {
				case VERSION_MISSMATCH:
					faultMediator.setFaultCodeValue(new QName(soap12EnvNS,
							"VersionMismatch", "soap12Env"));
					break;
				case MUST_UNDERSTAND:
					faultMediator.setFaultCodeValue(new QName(soap12EnvNS,
							"MustUnderstand", "soap12Env"));
				case SENDER:
					faultMediator.setFaultCodeValue(new QName(soap12EnvNS,
							"Server", "soap12Env"));
				case RECEIVER:
					faultMediator.setFaultCodeValue(new QName(soap12EnvNS,
							"Client", "soap12Env"));
				case DATA_ENCODING_UNKNOWN:
					faultMediator.setFaultCodeValue(new QName(soap12EnvNS,
							"DataEncodingUnknown", "soap12Env"));
				}
				break;
			}
			
			switch (visualFault.getFaultStringType()){
			case VALUE:
				faultMediator.setFaultReasonValue(visualFault.getFaultReasonValue());
				break;
			case EXPRESSION:
				faultMediator.setFaultReasonExpr(new SynapseXPath(visualFault.getFaultReasonExpression().getPropertyValue()));
				break;
			}

			switch (visualFault.getFaultDetailType()) {
			case VALUE:
				faultMediator.setFaultDetail(visualFault.getFaultDetailValue());
				break;
			case EXPRESSION:
				faultMediator.setFaultDetailExpr(new SynapseXPath(visualFault
						.getFaultDetailExpression().getPropertyValue()));
				break;
			}

			// Response?.
			faultMediator.setMarkAsResponse(visualFault.isMarkAsResponse());

			if (visualFault.getRoleName() != null) {
				faultMediator.setFaultRole(new URI(visualFault.getRoleName()));
			}
			
		}
		return faultMediator;
	}

}
