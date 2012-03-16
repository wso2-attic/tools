package org.wso2.developerstudio.eclipse.gmf.esb.internal.persistence;

import java.util.List;

import org.apache.synapse.endpoints.Endpoint;
import org.apache.synapse.mediators.base.SequenceMediator;
import org.apache.synapse.util.xpath.SynapseXPath;
import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EObject;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbNode;
import org.wso2.developerstudio.eclipse.gmf.esb.PropertyMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.RMSequenceMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.persistence.TransformationInfo;

public class RMSequenceMediatorTransformer extends AbstractEsbNodeTransformer{

	public void transform(TransformationInfo information, EsbNode subject)
			throws Exception {
		// TODO Auto-generated method stub
		information.getParentSequence().addChild(createRMSequenceMediator(subject));
		// Transform the RMSequence mediator output data flow path.
		doTransform(information,
				((RMSequenceMediator) subject).getOutputConnector());
		
	}

	public void createSynapseObject(TransformationInfo info, EObject subject,
			List<Endpoint> endPoints) {
		// TODO Auto-generated method stub
		
	}

	public void transformWithinSequence(TransformationInfo information,
			EsbNode subject, SequenceMediator sequence) throws Exception {
		// TODO Auto-generated method stub
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
			if(visualRMSequence.getSequenceType().getValue()==0){
				rmSequenceMediator.setSingle(true);
			}
			else{
				rmSequenceMediator.setSingle(false);
				/*SynapseXPath correlationXPath=new SynapseXPath(visualRMSequence.getCorrelationXpath().getPropertyValue());
				rmSequenceMediator.setCorrelation(correlationXPath);
				SynapseXPath lastMessageXPath=new SynapseXPath(visualRMSequence.getLastMessageXpath().getPropertyValue());
				rmSequenceMediator.setLastMessage(lastMessageXPath);*/
			}
			
		}
		return rmSequenceMediator;
	}

}
