package org.wso2.developerstudio.eclipse.gmf.esb.internal.persistence;

import java.util.List;

import org.apache.synapse.SynapseArtifact;
import org.apache.synapse.commons.datasource.DBPoolView;
import org.apache.synapse.commons.datasource.DataSourceInformation;
import org.apache.synapse.endpoints.Endpoint;
import org.apache.synapse.mediators.base.SequenceMediator;
import org.apache.synapse.mediators.db.DBLookupMediator;
import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EObject;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbNode;
import org.wso2.developerstudio.eclipse.gmf.esb.FaultMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.persistence.TransformationInfo;

public class DBLookupMediatorTransformer extends AbstractEsbNodeTransformer {

	public void transform(TransformationInfo information, EsbNode subject)
			throws Exception {
		// TODO Auto-generated method stub
		
		
		
		//NOT Completed.
		Assert.isTrue(subject instanceof org.wso2.developerstudio.eclipse.gmf.esb.DBLookupMediator, "Invalid subject.");
		org.wso2.developerstudio.eclipse.gmf.esb.DBLookupMediator visualDBLookup = (org.wso2.developerstudio.eclipse.gmf.esb.DBLookupMediator) subject;
		
		org.apache.synapse.mediators.db.DBLookupMediator dbLookupMediator =new org.apache.synapse.mediators.db.DBLookupMediator();
		DataSourceInformation dataSourceInformation=new DataSourceInformation();
		dataSourceInformation.setDriver(visualDBLookup.getConnectionDbDriver());
		dbLookupMediator.setDataSourceInformation(dataSourceInformation);
		
		information.getParentSequence().addChild(dbLookupMediator);
		doTransform(information, visualDBLookup.getOutputConnector());
		
		
		
		
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
