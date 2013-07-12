/*
 * Copyright 2012 WSO2, Inc. (http://wso2.com)
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
import java.util.Map.Entry;

import org.apache.synapse.endpoints.Endpoint;
import org.apache.synapse.mediators.base.SequenceMediator;
import org.apache.synapse.mediators.transform.Argument;
import org.apache.synapse.util.xpath.SynapseXPath;
import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbNode;
import org.wso2.developerstudio.eclipse.gmf.esb.NamespacedProperty;
import org.wso2.developerstudio.eclipse.gmf.esb.PayloadFactoryArgument;
import org.wso2.developerstudio.eclipse.gmf.esb.PayloadFactoryArgumentType;
import org.wso2.developerstudio.eclipse.gmf.esb.PayloadFactoryMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.persistence.TransformationInfo;

/**
 * PayloadFactory mediator transformer 
 *
 */
public class PayloadFactoryMediatorTransformer extends AbstractEsbNodeTransformer{

	public void transform(TransformationInfo information, EsbNode subject)
			throws Exception {
		information.getParentSequence().addChild(createPayloadFactoryMediator(subject));
		// Transform the property mediator output data flow path.
		doTransform(information,
				((PayloadFactoryMediator) subject).getOutputConnector());
		
	}

	public void createSynapseObject(TransformationInfo info, EObject subject,
			List<Endpoint> endPoints) {
		
	}

	public void transformWithinSequence(TransformationInfo information,
			EsbNode subject, SequenceMediator sequence) throws Exception {
		sequence.addChild(createPayloadFactoryMediator(subject));
		doTransformWithinSequence(information,((PayloadFactoryMediator)subject).getOutputConnector().getOutgoingLink(),sequence);
		
	}
	
	private org.apache.synapse.mediators.transform.PayloadFactoryMediator createPayloadFactoryMediator(EsbNode subject) throws Exception{
	
		// Check subject.
		Assert.isTrue(subject instanceof PayloadFactoryMediator,
				"Unsupported mediator passed in for serialization.");
		PayloadFactoryMediator visualPayloadFactory = (PayloadFactoryMediator) subject;

		org.apache.synapse.mediators.transform.PayloadFactoryMediator payloadFactoryMediator = new org.apache.synapse.mediators.transform.PayloadFactoryMediator();
		payloadFactoryMediator.setFormat(visualPayloadFactory.getFormat());
		EList<PayloadFactoryArgument> args = visualPayloadFactory.getArgs();
		for (PayloadFactoryArgument arg : args) {
			Argument argument = new Argument();
			if (arg.getArgumentType() == PayloadFactoryArgumentType.EXPRESSION) {
				NamespacedProperty namespacedProperty = arg.getArgumentExpression();
				SynapseXPath expression = new SynapseXPath(namespacedProperty.getPropertyValue());
				for (Entry<String, String> entry : namespacedProperty.getNamespaces().entrySet()) {
					expression.addNamespace(entry.getKey(), entry.getValue());
				}
				argument.setExpression(expression);
			} else {
				argument.setValue(arg.getArgumentValue());
			}
			payloadFactoryMediator.addXPathArgument(argument);// addArgument(argument);
		}

		return payloadFactoryMediator;
	}

}
