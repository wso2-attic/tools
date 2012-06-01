package org.wso2.developerstudio.eclipse.gmf.esb.internal.persistence;

import java.util.List;

import org.apache.synapse.endpoints.Endpoint;
import org.apache.synapse.mediators.base.SequenceMediator;
import org.apache.synapse.util.xpath.SynapseXPath;
import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EObject;
import org.wso2.developerstudio.eclipse.gmf.esb.CalloutMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbNode;
import org.wso2.developerstudio.eclipse.gmf.esb.persistence.TransformationInfo;

public class CalloutMediatorTransformer extends AbstractEsbNodeTransformer {

	public void transform(TransformationInfo information, EsbNode subject)
			throws Exception {
		// TODO Auto-generated method stub
		information.getParentSequence().addChild(createCalloutMediator(subject));
		// Transform the property mediator output data flow path.
		doTransform(information,
				((CalloutMediator) subject).getOutputConnector());
		
	}

	public void createSynapseObject(TransformationInfo info, EObject subject,
			List<Endpoint> endPoints) {
		// TODO Auto-generated method stub
		
	}

	public void transformWithinSequence(TransformationInfo information,
			EsbNode subject, SequenceMediator sequence) throws Exception {
		// TODO Auto-generated method stub
		sequence.addChild(createCalloutMediator(subject));
		doTransformWithinSequence(information,((CalloutMediator) subject).getOutputConnector().getOutgoingLink(),sequence);
		
		
	}
	
	private org.apache.synapse.mediators.builtin.CalloutMediator createCalloutMediator(EsbNode subject) throws Exception{
		// Check subject.
		Assert.isTrue(subject instanceof CalloutMediator, "Invalid subject.");
		CalloutMediator visualCallout = (CalloutMediator) subject;

		// Configure Callout mediator.
		org.apache.synapse.mediators.builtin.CalloutMediator calloutMediator = new org.apache.synapse.mediators.builtin.CalloutMediator();
		{
			calloutMediator.setServiceURL(visualCallout.getServiceURL());
			calloutMediator.setAction(visualCallout.getSoapAction());
			SynapseXPath payloadXPath=new SynapseXPath(visualCallout.getPayloadMessageXpath().getPropertyValue());
			calloutMediator.setRequestXPath(payloadXPath);			
			SynapseXPath resultXPath=new SynapseXPath(visualCallout.getResultMessageXpath().getPropertyValue());
			calloutMediator.setTargetXPath(resultXPath);
			calloutMediator.setClientRepository(visualCallout.getPathToAxis2Repository());
			calloutMediator.setAxis2xml(visualCallout.getPathToAxis2xml());
		}
		return calloutMediator;
	}
}
