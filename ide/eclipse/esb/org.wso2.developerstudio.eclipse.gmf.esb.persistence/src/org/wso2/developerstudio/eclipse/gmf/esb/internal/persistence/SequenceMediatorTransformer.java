package org.wso2.developerstudio.eclipse.gmf.esb.internal.persistence;

import java.util.List;

import org.apache.synapse.endpoints.Endpoint;
import org.apache.synapse.mediators.Value;
import org.apache.synapse.mediators.base.SequenceMediator;
import org.apache.synapse.mediators.builtin.LogMediator;
import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EObject;

import org.wso2.developerstudio.eclipse.gmf.esb.EsbDiagram;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbNode;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbSequence;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbServer;
import org.wso2.developerstudio.eclipse.gmf.esb.Sequence;
import org.wso2.developerstudio.eclipse.gmf.esb.persistence.SequenceInfo;
import org.wso2.developerstudio.eclipse.gmf.esb.persistence.TransformationInfo;





public class SequenceMediatorTransformer extends AbstractEsbNodeTransformer {

	public void transform(TransformationInfo information, EsbNode subject)
			throws Exception {
		// Check subject.
		Assert.isTrue(subject instanceof Sequence, "Invalid subject.");
		Sequence visualSequence = (Sequence) subject;
		org.apache.synapse.mediators.base.SequenceMediator sequence =new SequenceMediator();
		org.apache.synapse.mediators.base.SequenceMediator refferingSequence =new SequenceMediator();
		sequence.setName(visualSequence.getName());
		Value value=new Value(visualSequence.getName());
		refferingSequence.setKey(value);
		
		//System.out.println(EsbSequenceMultiPageEditor.sequenceGraphicalEditor.getDiagram().getElement().getClass());
		//EsbDiagram sequenceDiagram=(EsbDiagram) EsbSequenceMultiPageEditor.sequenceGraphicalEditor.getDiagram().getElement();
		//sequenceDiagram.
		/*EsbSequence server= sequenceDiagram.getServer();
		for(int i=0;i<server.getChildren().size();++i){
		System.out.println("aaaaaaaaaaaa"+server.getChildren().get(i));
		}
		*/
		
		try{
		information.getSynapseConfiguration().addSequence(visualSequence.getName(),sequence );
		}
		catch(org.apache.synapse.SynapseException e){
			System.out.println(e.toString());
			//Should handle properly
			//Duplicate sequence definition for key
		}
		
		
		information.getParentSequence().addChild(refferingSequence);
		information.currentSequence=visualSequence;
		doTransformWithinSequence(information, SequenceInfo.sequenceMap.get(visualSequence.getName()),sequence);
		
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
