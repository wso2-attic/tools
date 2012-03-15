package org.wso2.carbonstudio.eclipse.gmf.esb.internal.persistence;

import java.util.List;

import org.apache.synapse.endpoints.Endpoint;
import org.apache.synapse.mediators.base.SequenceMediator;
import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EObject;
import org.wso2.carbonstudio.eclipse.gmf.esb.EsbNode;
import org.wso2.carbonstudio.eclipse.gmf.esb.OAuthMediator;
import org.wso2.carbonstudio.eclipse.gmf.esb.persistence.TransformationInfo;

public class OAuthMediatorTransformer extends AbstractEsbNodeTransformer  {

	public void transform(TransformationInfo information, EsbNode subject)
			throws Exception {
		// TODO Auto-generated method stub
		information.getParentSequence().addChild(createOAuthMediator(subject));
		// Transform the OAuth mediator output data flow path.
		doTransform(information,
				((OAuthMediator) subject).getOutputConnector());
		
	}

	public void createSynapseObject(TransformationInfo info, EObject subject,
			List<Endpoint> endPoints) {
		// TODO Auto-generated method stub
		
	}

	public void transformWithinSequence(TransformationInfo information,
			EsbNode subject, SequenceMediator sequence) throws Exception {
		// TODO Auto-generated method stub
		sequence.addChild(createOAuthMediator(subject));
		doTransformWithinSequence(information,((OAuthMediator) subject).getOutputConnector().getOutgoingLink(),sequence);
		
		
	}
	
	private org.wso2.carbon.identity.oauth.mediator.OAuthMediator createOAuthMediator(EsbNode subject) throws Exception{
		// Check subject.
		Assert.isTrue(subject instanceof OAuthMediator, "Invalid subject.");
		OAuthMediator visualOauth = (OAuthMediator) subject;

		// Configure property mediator.
		org.wso2.carbon.identity.oauth.mediator.OAuthMediator OauthMediator = new org.wso2.carbon.identity.oauth.mediator.OAuthMediator();
		{
			OauthMediator.setRemoteServiceUrl(visualOauth.getRemoteServiceUrl());
		}
		return OauthMediator;
	}

}
