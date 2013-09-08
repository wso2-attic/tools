/*
 * Copyright WSO2, Inc. (http://wso2.com)
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

import org.apache.synapse.Mediator;
import org.apache.synapse.endpoints.Endpoint;
import org.apache.synapse.endpoints.IndirectEndpoint;
import org.apache.synapse.endpoints.ResolvingEndpoint;
import org.apache.synapse.mediators.base.SequenceMediator;
import org.apache.synapse.mediators.builtin.SendMediator;
import org.apache.synapse.util.xpath.SynapseXPath;
import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EObject;
import org.wso2.developerstudio.eclipse.gmf.esb.EndPoint;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbNode;
import org.wso2.developerstudio.eclipse.gmf.esb.InputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.KeyType;
import org.wso2.developerstudio.eclipse.gmf.esb.NamedEndpoint;
import org.wso2.developerstudio.eclipse.gmf.esb.Sequence;
import org.wso2.developerstudio.eclipse.gmf.esb.SequenceInputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.persistence.TransformationInfo;

public class NamedEndPointTransformer extends AbstractEsbNodeTransformer{

	public void transform(TransformationInfo information, EsbNode subject)
			throws Exception {
		// Check subject.
		Assert.isTrue(subject instanceof NamedEndpoint, "Invalid subject.");
		NamedEndpoint visualEndPoint = (NamedEndpoint) subject;
		
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

			
		doTransform(information, visualEndPoint.getOutputConnector());
		
	}

	public void createSynapseObject(TransformationInfo info, EObject subject,
			List<Endpoint> endPoints) {
		// TODO Auto-generated method stub
		
	}

	public void transformWithinSequence(TransformationInfo information,
			EsbNode subject, SequenceMediator sequence) throws Exception {
		
		Assert.isTrue(subject instanceof NamedEndpoint, "Invalid subject");
		NamedEndpoint visualEndPoint = (NamedEndpoint) subject;
		
		SendMediator sendMediator = getSendMediator(sequence);
		
		sendMediator.setEndpoint(create(visualEndPoint,null));
		
	}
	
	public Endpoint create(NamedEndpoint visualEndPoint,String name) throws Exception {
		if(visualEndPoint.getReferringEndpointType()==KeyType.DYNAMIC){			
			SynapseXPath synapseXPath= new SynapseXPath(visualEndPoint.getDynamicReferenceKey().getPropertyValue());
			for (int i = 0; i < visualEndPoint.getDynamicReferenceKey().getNamespaces().keySet().size(); ++i) {
				String prefix = (String) visualEndPoint.getDynamicReferenceKey().getNamespaces().keySet().toArray()[i];
				String namespaceUri = visualEndPoint.getDynamicReferenceKey().getNamespaces().get(prefix);
				synapseXPath.addNamespace(prefix, namespaceUri);
			}
			ResolvingEndpoint resolvingEndpoint=new ResolvingEndpoint();
			resolvingEndpoint.setKeyExpression(synapseXPath);
			return resolvingEndpoint;
		}else{
			IndirectEndpoint indirectEndpoint=new IndirectEndpoint();
			indirectEndpoint.setKey(visualEndPoint.getStaticReferenceKey().getKeyValue());
			return indirectEndpoint;
		}
		
	}
	
	private SendMediator getSendMediator(TransformationInfo info) {
		SendMediator sendMediator = null;
		if (info.getPreviouNode() instanceof org.wso2.developerstudio.eclipse.gmf.esb.SendMediator) {			
			int size = info.getParentSequence().getList().size();
			if (size > 0) {
				Mediator lastObj = info.getParentSequence().getList().get(size - 1);
				if (lastObj instanceof SendMediator) {
					sendMediator = (SendMediator) lastObj;
				}
			}
		}else if(info.getPreviouNode() instanceof org.wso2.developerstudio.eclipse.gmf.esb.Sequence){			
			sendMediator=null;
		} else{
		//sendMediator = new SendMediator();
			//info.getParentSequence().addChild(sendMediator);
		}
		return sendMediator;
	}
	
	private SendMediator getSendMediator(SequenceMediator sequence) {
		SendMediator sendMediator = null;
		int size = sequence.getList().size();
		if (size > 0 && sequence.getList().get(size-1) instanceof SendMediator) {			
			sendMediator = (SendMediator)sequence.getList().get(size-1);
		} else {
			sendMediator = new SendMediator();
			sequence.addChild(sendMediator);
		}
		return sendMediator;
	}

}
