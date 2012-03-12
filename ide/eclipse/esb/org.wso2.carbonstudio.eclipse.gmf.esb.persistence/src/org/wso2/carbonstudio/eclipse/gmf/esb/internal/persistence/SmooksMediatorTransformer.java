package org.wso2.carbonstudio.eclipse.gmf.esb.internal.persistence;

import java.util.List;

import javax.wsdl.Input;

import org.apache.synapse.endpoints.Endpoint;
import org.apache.synapse.mediators.base.SequenceMediator;
import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EObject;
import org.wso2.carbon.mediator.transform.Output;
import org.wso2.carbonstudio.eclipse.gmf.esb.CloneMediator;
import org.wso2.carbonstudio.eclipse.gmf.esb.EsbNode;
import org.wso2.carbonstudio.eclipse.gmf.esb.SmooksMediator;
import org.wso2.carbonstudio.eclipse.gmf.esb.persistence.TransformationInfo;

public class SmooksMediatorTransformer extends AbstractEsbNodeTransformer {

	public void transform(TransformationInfo information, EsbNode subject)
			throws Exception {
		// TODO Auto-generated method stub
		information.getParentSequence().addChild(createSmooksMediator(information,subject));
		// Transform the property mediator output data flow path.
		doTransform(information,
				((SmooksMediator) subject).getOutputConnector());
		
		
	}

	public void createSynapseObject(TransformationInfo info, EObject subject,
			List<Endpoint> endPoints) {
		// TODO Auto-generated method stub		
	}

	public void transformWithinSequence(TransformationInfo information,
			EsbNode subject, SequenceMediator sequence) throws Exception {
		// TODO Auto-generated method stub
		sequence.addChild(createSmooksMediator(information,subject));
		doTransformWithinSequence(information,((SmooksMediator) subject).getOutputConnector().getOutgoingLink(),sequence);
		
		
	}
	private org.wso2.carbon.mediator.transform.SmooksMediator createSmooksMediator(TransformationInfo information,EsbNode subject) throws Exception{
		// Check subject.
		Assert.isTrue(subject instanceof SmooksMediator, "Invalid subject.");
		SmooksMediator visualSmooks = (SmooksMediator) subject;
		
		org.wso2.carbon.mediator.transform.SmooksMediator smooksMediator=new org.wso2.carbon.mediator.transform.SmooksMediator();
		{
			
			org.wso2.carbon.mediator.transform.Input input=new org.wso2.carbon.mediator.transform.Input();
			smooksMediator.setInput(input);
			Output output=new Output();
			smooksMediator.setOutput(output);
		}
		return smooksMediator;
	}


}
