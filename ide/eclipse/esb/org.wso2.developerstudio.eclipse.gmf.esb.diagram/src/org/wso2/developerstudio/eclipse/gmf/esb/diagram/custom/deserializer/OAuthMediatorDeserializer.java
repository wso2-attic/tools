package org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.deserializer;

import org.apache.synapse.mediators.AbstractMediator;
import org.eclipse.core.runtime.Assert;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.OAuthMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.providers.EsbElementTypes;
import static org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage.Literals.*;

public class OAuthMediatorDeserializer extends AbstractEsbNodeDeserializer<AbstractMediator, OAuthMediator>{
	
	public OAuthMediator createNode(IGraphicalEditPart part,AbstractMediator mediator) {
		Assert.isTrue(mediator instanceof org.wso2.carbon.identity.oauth.mediator.OAuthMediator, "Unsupported mediator passed in for deserialization at "+ this.getClass());
		
		org.wso2.carbon.identity.oauth.mediator.OAuthMediator oauthMediator = (org.wso2.carbon.identity.oauth.mediator.OAuthMediator)mediator;
		
		OAuthMediator visualOauthMediator = (OAuthMediator) DeserializerUtils.createNode(part, EsbElementTypes.OAuthMediator_3524);
		setElementToEdit(visualOauthMediator);
		
		executeSetValueCommand(OAUTH_MEDIATOR__REMOTE_SERVICE_URL, oauthMediator.getRemoteServiceUrl());
		
		return visualOauthMediator;
	}

}
