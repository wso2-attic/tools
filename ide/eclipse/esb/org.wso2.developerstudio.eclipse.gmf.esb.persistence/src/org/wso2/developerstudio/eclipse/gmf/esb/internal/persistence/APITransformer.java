package org.wso2.developerstudio.eclipse.gmf.esb.internal.persistence;

import java.util.List;

import org.apache.synapse.endpoints.Endpoint;
import org.apache.synapse.mediators.base.SequenceMediator;
import org.apache.synapse.rest.API;
import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EObject;
import org.wso2.developerstudio.eclipse.gmf.esb.APIResource;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbNode;
import org.wso2.developerstudio.eclipse.gmf.esb.SynapseAPI;
import org.wso2.developerstudio.eclipse.gmf.esb.persistence.TransformationInfo;

public class APITransformer extends AbstractEsbNodeTransformer{

	public void transform(TransformationInfo information, EsbNode subject)
			throws Exception {
		// Check subject.
		Assert.isTrue(
				subject instanceof org.wso2.developerstudio.eclipse.gmf.esb.SynapseAPI,
				"Invalid subject.");
		org.wso2.developerstudio.eclipse.gmf.esb.SynapseAPI visualAPI = (org.wso2.developerstudio.eclipse.gmf.esb.SynapseAPI) subject;
		API api = create(visualAPI);
		
		for(APIResource apiResource:visualAPI.getResources()){
			APIResourceTransformer tr= new APIResourceTransformer();
			information.setCurrentAPI(api);
			tr.transform(information, apiResource);
		}
		
		information.getSynapseConfiguration().addAPI(visualAPI.getApiName(), api);

	}

	public void createSynapseObject(TransformationInfo info, EObject subject,
			List<Endpoint> endPoints) {
		// TODO Auto-generated method stub
		
	}

	public void transformWithinSequence(TransformationInfo information,
			EsbNode subject, SequenceMediator sequence) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	public API create(SynapseAPI visualAPI){
		API api=null;
		if(visualAPI.getContext() ==null){
			api=new API(visualAPI.getApiName(), "/default");
		}else{
			api=new API(visualAPI.getApiName(), visualAPI.getContext());
		}
		api.setHost(visualAPI.getHostName());
		if(visualAPI.getPort() !=null){
			api.setPort(Integer.parseInt(visualAPI.getPort()));
		}
		return api;
	}
	
}
