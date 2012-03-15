package org.wso2.carbonstudio.eclipse.gmf.esb.internal.persistence;

import java.util.List;

import org.apache.synapse.commons.datasource.DataSourceInformation;
import org.apache.synapse.endpoints.Endpoint;
import org.apache.synapse.mediators.base.SequenceMediator;
import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EObject;
import org.wso2.carbonstudio.eclipse.gmf.esb.DBReportMediator;
import org.wso2.carbonstudio.eclipse.gmf.esb.EsbNode;
import org.wso2.carbonstudio.eclipse.gmf.esb.persistence.TransformationInfo;

public class DBReportMediatorTransformer extends AbstractEsbNodeTransformer {

	public void transform(TransformationInfo information, EsbNode subject)
			throws Exception {
		// TODO Auto-generated method stub
		
		
		//NOT completed.
		Assert.isTrue(subject instanceof DBReportMediator,"Invalid Subject.");
		DBReportMediator visualDBReport =(DBReportMediator)subject;
		org.apache.synapse.mediators.db.DBReportMediator DBReportMediator=new org.apache.synapse.mediators.db.DBReportMediator();
		DataSourceInformation dataSourceInformation=new DataSourceInformation();
		dataSourceInformation.setDriver(visualDBReport.getConnectionDbDriver());
		DBReportMediator.setDataSourceInformation(dataSourceInformation);
		
		information.getParentSequence().addChild(DBReportMediator);
		doTransform(information, visualDBReport.getOutputConnector());
		
		
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
