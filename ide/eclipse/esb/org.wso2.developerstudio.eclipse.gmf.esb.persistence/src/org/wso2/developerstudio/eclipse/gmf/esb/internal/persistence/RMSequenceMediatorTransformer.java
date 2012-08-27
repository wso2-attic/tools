/*
 * Copyright (c) WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package org.wso2.developerstudio.eclipse.gmf.esb.internal.persistence;

import java.util.List;

import org.apache.synapse.endpoints.Endpoint;
import org.apache.synapse.mediators.base.SequenceMediator;
import org.apache.synapse.util.xpath.SynapseXPath;
import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EObject;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbNode;
import org.wso2.developerstudio.eclipse.gmf.esb.RMSequenceMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.RMSequenceType;
import org.wso2.developerstudio.eclipse.gmf.esb.persistence.TransformationInfo;

public class RMSequenceMediatorTransformer extends AbstractEsbNodeTransformer{

	public void transform(TransformationInfo information, EsbNode subject)
			throws Exception {
		information.getParentSequence().addChild(createRMSequenceMediator(subject));
		// Transform the RMSequence mediator output data flow path.
		doTransform(information,
				((RMSequenceMediator) subject).getOutputConnector());
		
	}

	public void createSynapseObject(TransformationInfo info, EObject subject,
			List<Endpoint> endPoints) {
		
	}

	public void transformWithinSequence(TransformationInfo information,
			EsbNode subject, SequenceMediator sequence) throws Exception {
		sequence.addChild(createRMSequenceMediator(subject));
		doTransformWithinSequence(information,((RMSequenceMediator) subject).getOutputConnector().getOutgoingLink(),sequence);
		
		
	}
	
	private org.apache.synapse.mediators.builtin.RMSequenceMediator createRMSequenceMediator(EsbNode subject) throws Exception{
		// Check subject.
		Assert.isTrue(subject instanceof RMSequenceMediator, "Invalid subject.");
		RMSequenceMediator visualRMSequence = (RMSequenceMediator) subject;

		// Configure RMSequence mediator.
		org.apache.synapse.mediators.builtin.RMSequenceMediator rmSequenceMediator = new org.apache.synapse.mediators.builtin.RMSequenceMediator();
		{
			rmSequenceMediator.setVersion(visualRMSequence.getRmSpecVersion().getLiteral());			
			if(visualRMSequence.getSequenceType().equals(RMSequenceType.SINGLE_MESSAGE)){
				rmSequenceMediator.setSingle(true);
			}
			else{
				rmSequenceMediator.setSingle(false);
				SynapseXPath correlationXPath=new SynapseXPath(visualRMSequence.getCorrelationXpath().getPropertyValue());
				rmSequenceMediator.setCorrelation(correlationXPath);
				String lastMessageXpath = visualRMSequence.getLastMessageXpath().getPropertyValue();
				if(!(lastMessageXpath==null || lastMessageXpath.trim().isEmpty())){
					rmSequenceMediator.setLastMessage(new SynapseXPath(lastMessageXpath));
				}
			}
			
		}
		return rmSequenceMediator;
	}

}
