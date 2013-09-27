package org.wso2.developerstudio.eclipse.gmf.esb.internal.persistence;

import java.util.List;
import org.apache.synapse.endpoints.Endpoint;
import org.apache.synapse.mediators.base.SequenceMediator;
import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EObject;
import org.wso2.developerstudio.eclipse.gmf.esb.CallMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.CallMediatorEndpointType;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbNode;
import org.wso2.developerstudio.eclipse.gmf.esb.SendMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.persistence.TransformationInfo;

public class CallMediatorTransformer extends AbstractEsbNodeTransformer {

	public void transform(TransformationInfo information, EsbNode subject)
			throws Exception {		
		org.apache.synapse.mediators.builtin.CallMediator callMediator = createCallMediator(subject);
		if(callMediator!=null){
			information.getParentSequence().addChild(callMediator);
		}
		
		TransformationInfo tmpInformation = new TransformationInfo();
		tmpInformation.setParentSequence(information.getParentSequence());
		tmpInformation.setTraversalDirection(information.getTraversalDirection());
		tmpInformation.setOriginInSequence(information.getOriginInSequence());
		tmpInformation.setOriginOutSequence(information.getOriginOutSequence());
		tmpInformation.setPreviousNode(information.getPreviouNode());
		tmpInformation.setSynapseConfiguration(information.getSynapseConfiguration());
		tmpInformation.setCurrentAPI(information.getCurrentAPI());
		tmpInformation.setCurrentProxy(information.getCurrentProxy());
		tmpInformation.setCurrentReferredSequence(information.getCurrentReferredSequence());
		tmpInformation.setMainSequence(information.getMainSequence());
		doTransform(tmpInformation,
					((SendMediator) subject).getEndpointOutputConnector());
	}

	public void createSynapseObject(TransformationInfo info, EObject subject,
			List<Endpoint> endPoints) {
		// TODO Auto-generated method stub
		
	}

	public void transformWithinSequence(TransformationInfo information,
			EsbNode subject, SequenceMediator sequence) throws Exception {
		org.apache.synapse.mediators.builtin.CallMediator callMediator = createCallMediator(subject);
		if(callMediator!=null){
			sequence.addChild(callMediator);
		}
		doTransformWithinSequence(information,((CallMediator) subject).getEndpointOutputConnector().getOutgoingLink(),sequence);
		
	}
	
	private org.apache.synapse.mediators.builtin.CallMediator createCallMediator(EsbNode subject) throws Exception{
		// Check subject.
		Assert.isTrue(subject instanceof CallMediator, "Invalid subject.");
		CallMediator visualCallMediator = (CallMediator) subject;
		
		// Configure call mediator.
		org.apache.synapse.mediators.builtin.CallMediator callMediator = new org.apache.synapse.mediators.builtin.CallMediator();
		{
			if (visualCallMediator.getEndpointType() == CallMediatorEndpointType.REGISRTYKEY) {
				//RegistryKeyProperty regKey = visualCallMediator.getEndpointRegistrykey();
				//callMediator.setEndpoint(regKey.getKeyName());
			}

			if (visualCallMediator.getEndpointType() == CallMediatorEndpointType.XPATH) {
				//RegistryKeyProperty regKey = visualCallMediator.getEndpointRegistrykey();
				//callMediator.setEndpoint(regKey.getKeyName());
			}
			
			return callMediator;
		}
	}

}
