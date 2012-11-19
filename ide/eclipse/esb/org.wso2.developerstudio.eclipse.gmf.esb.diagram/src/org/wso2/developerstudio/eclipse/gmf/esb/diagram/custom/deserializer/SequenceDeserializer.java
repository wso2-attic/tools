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

package org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.deserializer;

import org.apache.synapse.mediators.base.SequenceMediator;
import org.eclipse.core.runtime.Assert;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbFactory;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbNode;
import org.wso2.developerstudio.eclipse.gmf.esb.Sequence;
import org.wso2.developerstudio.eclipse.gmf.esb.Sequences;

/**
 *  Sequence mediator deserializer
 */
public class SequenceDeserializer extends AbstractEsbNodeDeserializer<SequenceMediator, EsbNode> {

	@Override
	public EsbNode createNode(IGraphicalEditPart part,SequenceMediator sequence) {
		EsbNode node = null;
		if(sequence.getKey()!=null){
			Sequence sequenceModel = EsbFactory.eINSTANCE.createSequence();
			sequenceModel.setName(sequence.getKey().getKeyValue());
			node = sequenceModel;
		} else if(sequence.getName()!=null){
			Sequences sequenceModel = EsbFactory.eINSTANCE.createSequences();
			sequenceModel.setName(sequence.getName());
			deserializeSequence(null, sequence, sequenceModel.getOutputConnector());
			deserializeSequence(null, new SequenceMediator(), sequenceModel.getInputConnector());
			addPairMediatorFlow(sequenceModel.getOutputConnector(),sequenceModel.getInputConnector());
			node = sequenceModel;
		} else{
			Assert.isTrue(false, "Unsupported sequence mediator configuration");
		}
		
		return node;
	}

}
