package org.wso2.developerstudio.eclipse.gmf.esb.internal.persistence;

import java.util.ArrayList;
import java.util.List;

import org.apache.synapse.config.xml.AnonymousListMediator;
import org.apache.synapse.endpoints.Endpoint;
import org.apache.synapse.mediators.ListMediator;
import org.apache.synapse.mediators.base.SequenceMediator;
import org.apache.synapse.mediators.eip.Target;
import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EObject;
import org.wso2.developerstudio.eclipse.gmf.esb.CloneMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.CloneMediatorTargetOutputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbNode;
import org.wso2.developerstudio.eclipse.gmf.esb.persistence.TransformationInfo;

public class CloneMediatorTransformer extends AbstractEsbNodeTransformer {

	public void transform(TransformationInfo information, EsbNode subject)
			throws Exception {
		information.getParentSequence().addChild(createCloneMediator(information,subject));
		/*
		 *  Transform the property mediator output data flow path.
		 */
		doTransform(information,
				((CloneMediator) subject).getOutputConnector());
		
	}

	public void createSynapseObject(TransformationInfo info, EObject subject,
			List<Endpoint> endPoints) {		
	}

	public void transformWithinSequence(TransformationInfo information,
			EsbNode subject, SequenceMediator sequence) throws Exception {
		sequence.addChild(createCloneMediator(information,subject));
		doTransformWithinSequence(information,((CloneMediator) subject).getOutputConnector().getOutgoingLink(),sequence);		
	}
	
	private org.apache.synapse.mediators.eip.splitter.CloneMediator createCloneMediator(TransformationInfo information,EsbNode subject) throws Exception{
		/*
		 *  Check subject.
		 */
		Assert.isTrue(subject instanceof CloneMediator, "Invalid subject.");
		CloneMediator visualClone = (CloneMediator) subject;

		/*
		 *  Configure Clone mediator.
		 */
		org.apache.synapse.mediators.eip.splitter.CloneMediator cloneMediator = new org.apache.synapse.mediators.eip.splitter.CloneMediator();
		{
			cloneMediator.setId(visualClone.getCloneID());
			cloneMediator.setSequential(visualClone.isSequentialMediation());
			cloneMediator.setContinueParent(visualClone.isContinueParent());
			
			List<Target> list=new ArrayList<Target>();
			for (CloneMediatorTargetOutputConnector outputConnector : visualClone.getTargetsOutputConnector()) {
				Target target=new Target();
				list.add(target);
				ListMediator targetList = new AnonymousListMediator();
				SequenceMediator targetSequence=new SequenceMediator();	
			
				TransformationInfo newInfo = new TransformationInfo();
				newInfo.setTraversalDirection(information.getTraversalDirection());
				newInfo.setSynapseConfiguration(information.getSynapseConfiguration());
				newInfo.setOriginInSequence(information.getOriginInSequence());
				newInfo.setOriginOutSequence(information.getOriginOutSequence());
				newInfo.setParentSequence(targetList);
				doTransform(newInfo, outputConnector);
				
				targetSequence.addAll(targetList.getList());
				target.setSequence(targetSequence);
			}
			cloneMediator.setTargets(list);			
		}
		return cloneMediator;
	}
	

}
