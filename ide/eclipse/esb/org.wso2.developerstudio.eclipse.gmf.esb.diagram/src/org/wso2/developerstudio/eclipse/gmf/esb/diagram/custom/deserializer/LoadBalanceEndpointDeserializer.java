package org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.deserializer;

import org.apache.synapse.endpoints.AbstractEndpoint;
import org.eclipse.core.runtime.Assert;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbFactory;
import org.wso2.developerstudio.eclipse.gmf.esb.LoadBalanceEndPoint;
import org.wso2.developerstudio.eclipse.gmf.esb.Member;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.providers.EsbElementTypes;

public class LoadBalanceEndpointDeserializer extends AbstractComplexEndPointDeserializer{//AbstractEsbNodeDeserializer<AbstractEndpoint, LoadBalanceEndPoint>{
	
	@Override
	public LoadBalanceEndPoint createNode(IGraphicalEditPart part,AbstractEndpoint object) {
		
		Assert.isTrue(object instanceof org.apache.synapse.endpoints.LoadbalanceEndpoint, "Unsupported endpoint passed in for deserialization at "+ this.getClass());
		
		org.apache.synapse.endpoints.LoadbalanceEndpoint loadbalanceEndpoint = (org.apache.synapse.endpoints.LoadbalanceEndpoint)object;
		
		LoadBalanceEndPoint vishualEndPoint = (LoadBalanceEndPoint) DeserializerUtils.createNode(part, EsbElementTypes.LoadBalanceEndPoint_3613);
		setElementToEdit(vishualEndPoint);
		
		if (loadbalanceEndpoint.getChildren() != null && !loadbalanceEndpoint.getChildren().isEmpty()) {
			deserializeComplexEndpoint(loadbalanceEndpoint);
			
		} else if (loadbalanceEndpoint.getMembers() != null && !loadbalanceEndpoint.getMembers().isEmpty()) {

			for (org.apache.axis2.clustering.Member member : loadbalanceEndpoint.getMembers()) {

				Member vishualMember = EsbFactory.eINSTANCE.createMember();
				
				if (member.getHostName() != null && !member.getHostName().equals("")) {

					vishualMember.setHostName(member.getHostName());
				}

				vishualMember.setHttpPort(Integer.toString(member.getHttpPort()));

				vishualMember.setHttpsPort(Integer.toString(member.getHttpsPort()));

				executeAddValueCommand(vishualEndPoint.getMember(),vishualMember);

			}

		}

		return vishualEndPoint;
	}

}
