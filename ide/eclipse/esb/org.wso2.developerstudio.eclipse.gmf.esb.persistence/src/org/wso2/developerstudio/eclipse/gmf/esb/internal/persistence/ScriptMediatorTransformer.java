package org.wso2.developerstudio.eclipse.gmf.esb.internal.persistence;

import java.util.List;

import org.apache.synapse.endpoints.Endpoint;
import org.apache.synapse.mediators.base.SequenceMediator;
import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EObject;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbNode;
import org.wso2.developerstudio.eclipse.gmf.esb.ScriptMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.persistence.TransformationInfo;

public class ScriptMediatorTransformer extends AbstractEsbNodeTransformer {

	public void transform(TransformationInfo information, EsbNode subject)
			throws Exception {
		// TODO Auto-generated method stub
		information.getParentSequence().addChild(createScriptMediator(subject));
		// Transform the Script mediator output data flow path.
		doTransform(information,
				((ScriptMediator)subject).getOutputConnector());
		
	}

	public void createSynapseObject(TransformationInfo info, EObject subject,
			List<Endpoint> endPoints) {
		// TODO Auto-generated method stub
		
	}

	public void transformWithinSequence(TransformationInfo information,
			EsbNode subject, SequenceMediator sequence) throws Exception {
		// TODO Auto-generated method stub
		sequence.addChild(createScriptMediator(subject));
		doTransformWithinSequence(information,((ScriptMediator)subject).getOutputConnector().getOutgoingLink(),sequence);
		
		
	}
	
	private org.apache.synapse.mediators.bsf.ScriptMediator createScriptMediator(EsbNode subject) throws Exception{
		Assert.isTrue(subject instanceof ScriptMediator, "Invalid subject.");
		ScriptMediator visualScript = (ScriptMediator)subject;
		String language=visualScript.getScriptLanguage().getLiteral();
		String scriptSourceCode=visualScript.getScriptBody();
		org.apache.synapse.mediators.bsf.ScriptMediator scriptMediator=new org.apache.synapse.mediators.bsf.ScriptMediator(language,scriptSourceCode);
		return scriptMediator;
	}

}
