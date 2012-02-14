package org.wso2.carbonstudio.eclipse.gmf.esb.internal.persistence;

import java.util.List;

import org.apache.synapse.SynapseArtifact;
import org.apache.synapse.endpoints.Endpoint;
import org.apache.synapse.mediators.base.SequenceMediator;
import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EObject;
import org.wso2.carbonstudio.eclipse.gmf.esb.EsbNode;
import org.wso2.carbonstudio.eclipse.gmf.esb.EventMediator;
import org.wso2.carbonstudio.eclipse.gmf.esb.LogMediator;
import org.wso2.carbonstudio.eclipse.gmf.esb.persistence.TransformationInfo;

public class EventMediatorTransformer extends AbstractEsbNodeTransformer  {

	public void transform(TransformationInfo information, EsbNode subject)
			throws Exception {
		Assert.isTrue(subject instanceof EventMediator, "Invalid subject.");
		EventMediator visualEvent = (EventMediator) subject;
		
		
		
		
		
	}

	public void createSynapseObject(TransformationInfo info, EObject subject,
			List<Endpoint> endPoints) {
		// TODO Auto-generated method stub
		
	}


	public void transformWithinSequence(TransformationInfo information,
			EsbNode subject, SequenceMediator sequence) throws Exception {
		// TODO Auto-generated method stub
		
	}



}
