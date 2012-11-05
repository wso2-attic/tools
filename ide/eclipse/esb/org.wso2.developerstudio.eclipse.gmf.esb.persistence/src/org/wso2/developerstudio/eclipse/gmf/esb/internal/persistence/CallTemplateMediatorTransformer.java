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
import org.apache.synapse.util.xpath.SynapseXPath;
import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EObject;
import org.jaxen.JaxenException;
import org.wso2.developerstudio.eclipse.gmf.esb.CallTemplateMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.CallTemplateParameter;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbNode;
import org.wso2.developerstudio.eclipse.gmf.esb.NamespacedProperty;
import org.wso2.developerstudio.eclipse.gmf.esb.RuleOptionType;
import org.wso2.developerstudio.eclipse.gmf.esb.internal.persistence.custom.CallTemplateExtParameter;
import org.wso2.developerstudio.eclipse.gmf.esb.internal.persistence.custom.CallTemplateExtParameter.ParameterType;
import org.wso2.developerstudio.eclipse.gmf.esb.internal.persistence.custom.CallTemplateMediatorExt;
import org.wso2.developerstudio.eclipse.gmf.esb.persistence.TransformationInfo;

public class CallTemplateMediatorTransformer extends AbstractEsbNodeTransformer{
	
	public void transform(TransformationInfo information, EsbNode subject) throws Exception {
		Assert.isTrue(subject instanceof CallTemplateMediator, "Invalid subject.");
		CallTemplateMediator visuaCallTemplate = (CallTemplateMediator) subject;
		information.getParentSequence().addChild(
				createCallTemplateMediator(information, visuaCallTemplate));
		// Transform the callTemplate mediator output data flow path.
		doTransform(information, visuaCallTemplate.getOutputConnector());
	}

	public void createSynapseObject(TransformationInfo info, EObject subject,
			List<Endpoint> endPoints) {
	}

	public void transformWithinSequence(TransformationInfo information, EsbNode subject,
			SequenceMediator sequence) throws Exception {
		Assert.isTrue(subject instanceof CallTemplateMediator, "Invalid subject.");
		CallTemplateMediator visuaCallTemplate = (CallTemplateMediator) subject;
		sequence.addChild(createCallTemplateMediator(information, visuaCallTemplate));
		doTransformWithinSequence(information, visuaCallTemplate.getOutputConnector()
				.getOutgoingLink(), sequence);
	}

	private CallTemplateMediatorExt createCallTemplateMediator(TransformationInfo information,
			CallTemplateMediator obj) throws JaxenException {
		CallTemplateMediatorExt callTemplateMediator = new CallTemplateMediatorExt();
		callTemplateMediator.setTarget(obj.getTargetTemplate());
		List<CallTemplateExtParameter> parameters = callTemplateMediator.getParameters();
		for (CallTemplateParameter param : obj.getTemplateParameters()) {
			CallTemplateExtParameter parameter = new CallTemplateExtParameter(
					param.getParameterName());
			if (param.getTemplateParameterType().equals(RuleOptionType.EXPRESSION)) {
				/* RuleOptionType?, this should fix */
				NamespacedProperty namespacedExpression = param.getParameterExpression();
				parameter.setParameterType(ParameterType.EXPRESSION);
				SynapseXPath paramExpression = new SynapseXPath(namespacedExpression.getPropertyValue());
				for (Entry<String, String> entry : namespacedExpression.getNamespaces().entrySet()) {
					paramExpression.addNamespace(entry.getKey(), entry.getValue());
				}
				parameter.setParameterExpression(paramExpression);
			} else {
				parameter.setParameterType(ParameterType.VALUE);
				parameter.setParameterValue(param.getParameterValue());
			}
			parameters.add(parameter);
		}
		return callTemplateMediator;
	}

}
