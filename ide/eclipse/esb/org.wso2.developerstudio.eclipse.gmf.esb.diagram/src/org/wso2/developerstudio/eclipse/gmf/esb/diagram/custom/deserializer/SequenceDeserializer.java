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
import org.apache.synapse.mediators.filters.InMediator;
import org.apache.synapse.mediators.filters.OutMediator;
import org.eclipse.core.runtime.Assert;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.ui.part.FileEditorInput;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbNode;
import org.wso2.developerstudio.eclipse.gmf.esb.MediatorFlow;
import org.wso2.developerstudio.eclipse.gmf.esb.ProxyService;
import org.wso2.developerstudio.eclipse.gmf.esb.Sequence;
import org.wso2.developerstudio.eclipse.gmf.esb.Sequences;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.utils.ElementDuplicator;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.TemplateTemplateCompartmentEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.providers.EsbElementTypes;
import static org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage.Literals.*;

/**
 *  Sequence mediator deserializer
 */
public class SequenceDeserializer extends AbstractEsbNodeDeserializer<SequenceMediator, EsbNode> {

	@Override
	public EsbNode createNode(IGraphicalEditPart part,SequenceMediator sequence) {
		EsbNode node = null;
		if(sequence.getKey()!=null){
			Sequence sequenceModel = (Sequence) DeserializerUtils.createNode(part, EsbElementTypes.Sequence_3503);
			executeSetValueCommand(sequenceModel, SEQUENCE__NAME, sequence.getKey().getKeyValue());
			node = sequenceModel;
			//duplicatorEndPoints(getRootCompartment(),sequence.getKey().getKeyValue()); 
		} else if(sequence.getName()!=null){
			/* Expecting following configuration for main sequence
			 * <sequence xmlns="http://ws.apache.org/ns/synapse" name="main">
			 * <in/>
			 * <out/> 
			 * </sequence>
			 */
			if ("main".equals(sequence.getName())
					&& sequence.getList().size() == 2
					&& (sequence.getList().get(0) instanceof InMediator && sequence.getList()
							.get(1) instanceof OutMediator)) {
				node = deserializeMainSequence(part,sequence);
			} else{
				IElementType sequencesType = (part instanceof TemplateTemplateCompartmentEditPart) ? EsbElementTypes.Sequences_3665
						: EsbElementTypes.Sequences_3614;
				Sequences sequenceModel = (Sequences) DeserializerUtils.createNode(part,
						sequencesType);
				executeSetValueCommand(sequenceModel, SEQUENCES__NAME, sequence.getName());
				executeSetValueCommand(sequenceModel.getOnError(),
						REGISTRY_KEY_PROPERTY__KEY_VALUE, sequence.getErrorHandler());
				refreshEditPartMap();
				addRootInputConnector(sequenceModel.getInputConnector());
				IGraphicalEditPart compartment = (IGraphicalEditPart) getEditpart(
						sequenceModel.getMediatorFlow()).getChildren().get(0);
				deserializeSequence(compartment, sequence, sequenceModel.getOutputConnector());
				deserializeSequence(compartment, new SequenceMediator(),
						sequenceModel.getInputConnector());
				addPairMediatorFlow(sequenceModel.getOutputConnector(),
						sequenceModel.getInputConnector());
				node = sequenceModel;
			}
		} else{
			Assert.isTrue(false, "Unsupported sequence mediator configuration");
		}
		
		return node;
	}

	private ProxyService deserializeMainSequence(IGraphicalEditPart part, SequenceMediator sequence) {
		ProxyService sequenceModel = (ProxyService) DeserializerUtils.createNode(part,
				EsbElementTypes.ProxyService_3001);

		setElementToEdit(sequenceModel);
		refreshEditPartMap();
		executeSetValueCommand(PROXY_SERVICE__NAME,"main");
		executeSetValueCommand(PROXY_SERVICE__MAIN_SEQUENCE,true);
		
		addRootInputConnector(sequenceModel.getInputConnector());
		MediatorFlow mediatorFlow = sequenceModel.getContainer().getSequenceAndEndpointContainer()
				.getMediatorFlow();
		GraphicalEditPart compartment = (GraphicalEditPart) ((getEditpart(mediatorFlow))
				.getChildren().get(0));

		if (sequence.getList().get(0) instanceof InMediator) {
			InMediator inMediator = (InMediator) sequence.getList().get(0);
			SequenceMediator inSequence = new SequenceMediator();
			inSequence.addAll(inMediator.getList());
			setRootCompartment(compartment);
			deserializeSequence(compartment, inSequence, sequenceModel.getOutputConnector());
			setRootCompartment(null);
		}
		
		if (sequence.getList().get(1) instanceof OutMediator){
			OutMediator outMediator = (OutMediator) sequence.getList().get(1);
			SequenceMediator outSequence = new SequenceMediator();
			outSequence.addAll(outMediator.getList());
			setRootCompartment(compartment);
			deserializeSequence(compartment, outSequence, sequenceModel.getInputConnector());
			setRootCompartment(null);
		}
		
		addPairMediatorFlow(sequenceModel.getOutputConnector(),sequenceModel.getInputConnector());
		
		return sequenceModel;
	}

	private void duplicatorEndPoints(GraphicalEditPart rootCompartment, String key) {
		FileEditorInput input = (FileEditorInput) getDiagramEditor().getEditorInput();
		ElementDuplicator duplicator = new ElementDuplicator(input.getFile().getProject());
		//duplicator.duplicateEndPoints(rootCompartment, key);
		
	}

}
