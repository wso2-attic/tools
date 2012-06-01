package org.wso2.developerstudio.eclipse.gmf.esb.internal.persistence;

import java.util.List;

import org.apache.synapse.endpoints.Endpoint;
import org.apache.synapse.mediators.base.SequenceMediator;
import org.apache.synapse.mediators.eip.Target;
import org.apache.synapse.util.xpath.SynapseXPath;
import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EObject;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbNode;
import org.wso2.developerstudio.eclipse.gmf.esb.IterateMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.PropertyMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.persistence.TransformationInfo;

public class IterateMediatorTransformer extends AbstractEsbNodeTransformer{

	public void transform(TransformationInfo information, EsbNode subject)
			throws Exception {
		// TODO Auto-generated method stub
		information.getParentSequence().addChild(createIterateMediator(subject));
		// Transform the property mediator output data flow path.
		doTransform(information,
				((IterateMediator) subject).getOutputConnector());
		
	}

	public void createSynapseObject(TransformationInfo info, EObject subject,
			List<Endpoint> endPoints) {
		// TODO Auto-generated method stub
		
	}

	public void transformWithinSequence(TransformationInfo information,
			EsbNode subject, SequenceMediator sequence) throws Exception {
		// TODO Auto-generated method stub
		sequence.addChild(createIterateMediator(subject));
		doTransformWithinSequence(information,((IterateMediator) subject).getOutputConnector().getOutgoingLink(),sequence);
		
		
	}
	
	private org.apache.synapse.mediators.eip.splitter.IterateMediator createIterateMediator(EsbNode subject) throws Exception{
		// Check subject.
		Assert.isTrue(subject instanceof IterateMediator, "Invalid subject.");
		IterateMediator visualIterate = (IterateMediator) subject;

		// Configure Iterate mediator.
		org.apache.synapse.mediators.eip.splitter.IterateMediator iterateMediator = new org.apache.synapse.mediators.eip.splitter.IterateMediator();
		{	
			SynapseXPath expression=new SynapseXPath(visualIterate.getIterateExpression().getPropertyValue());
			iterateMediator.setExpression(expression);
			SynapseXPath attachedPath=new SynapseXPath(visualIterate.getAttachPath().getPropertyValue());
			iterateMediator.setAttachPath(attachedPath);
			iterateMediator.setPreservePayload(visualIterate.isPreservePayload());
			iterateMediator.setContinueParent(visualIterate.isContinueParent());
			iterateMediator.setId(visualIterate.getIterateID());
			Target target =new Target();
			target.setSoapAction(visualIterate.getTarget().getSoapAction());
			target.setToAddress(visualIterate.getTarget().getToAddress());
			iterateMediator.setTarget(target);
		}
		return iterateMediator;
	}

}
