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

import java.util.Map;

import org.apache.synapse.endpoints.Endpoint;
import org.apache.synapse.mediators.AbstractMediator;
import org.apache.synapse.mediators.Value;
import org.apache.synapse.util.xpath.SynapseXPath;
import org.eclipse.core.runtime.Assert;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.AbstractEndPoint;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbFactory;
import org.wso2.developerstudio.eclipse.gmf.esb.NamespacedProperty;
import org.wso2.developerstudio.eclipse.gmf.esb.ReceivingSequenceType;
import org.wso2.developerstudio.eclipse.gmf.esb.RegistryKeyProperty;
import org.wso2.developerstudio.eclipse.gmf.esb.SendMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.providers.EsbElementTypes;
import static org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage.Literals.*;

public class SendMediatorDeserializer extends AbstractEsbNodeDeserializer<AbstractMediator, SendMediator> {

	public SendMediator createNode(IGraphicalEditPart part,AbstractMediator mediator) {
		
		Assert.isTrue(mediator instanceof org.apache.synapse.mediators.builtin.SendMediator, "Unsupported mediator passed in for deserialization at "+ this.getClass());
		
		org.apache.synapse.mediators.builtin.SendMediator sendMediator = (org.apache.synapse.mediators.builtin.SendMediator)mediator;
		
		org.wso2.developerstudio.eclipse.gmf.esb.SendMediator visualSendMediator = (org.wso2.developerstudio.eclipse.gmf.esb.SendMediator) DeserializerUtils.createNode(part, EsbElementTypes.SendMediator_3515);
		setElementToEdit(visualSendMediator);
		
		//SendMediator vishualSend  = EsbFactory.eINSTANCE.createSendMediator();
		
		if(sendMediator.getReceivingSequence() != null){
			
			Value receivingSequenceValue = sendMediator.getReceivingSequence();
		
			//For Static sequence type.
			if(receivingSequenceValue.getKeyValue() != null){
				
				//vishualSend.setReceivingSequenceType(ReceivingSequenceType.STATIC);
				executeSetValueCommand(SEND_MEDIATOR__RECEIVING_SEQUENCE_TYPE, ReceivingSequenceType.STATIC);
				
				RegistryKeyProperty regkey = EsbFactory.eINSTANCE.createRegistryKeyProperty();
				regkey.setKeyValue(receivingSequenceValue.getKeyValue());
				
				//vishualSend.setStaticReceivingSequence(regkey);
				executeSetValueCommand(SEND_MEDIATOR__STATIC_RECEIVING_SEQUENCE, regkey);
				
			}
			
			//For Dynamic sequence type.
			if(receivingSequenceValue.getExpression() != null){
				
				//vishualSend.setReceivingSequenceType(ReceivingSequenceType.DYNAMIC);
				executeSetValueCommand(SEND_MEDIATOR__RECEIVING_SEQUENCE_TYPE,ReceivingSequenceType.DYNAMIC);
				
				SynapseXPath xpath  = receivingSequenceValue.getExpression();
				
				NamespacedProperty nsp = EsbFactory.eINSTANCE.createNamespacedProperty();
				
				nsp.setPropertyValue(xpath.toString());
				
				if (xpath.getNamespaces() != null) {

					@SuppressWarnings("unchecked")
					Map<String, String> map = xpath.getNamespaces();

					nsp.setNamespaces(map);
				}
					
				//vishualSend.setDynamicReceivingSequence(nsp);
				executeSetValueCommand(SEND_MEDIATOR__DYNAMIC_RECEIVING_SEQUENCE,nsp);
			}
		}
		
		Endpoint endpoint = sendMediator.getEndpoint();
		if(endpoint!=null){
			AbstractEndPoint endPoint = (AbstractEndPoint) DeserializerUtils.createNode(
					getRootCompartment(), EsbElementTypes.DefaultEndPoint_3609);
			visualSendMediator.setNextNode(endPoint);
		}
			
		return visualSendMediator;
	}
	
}
