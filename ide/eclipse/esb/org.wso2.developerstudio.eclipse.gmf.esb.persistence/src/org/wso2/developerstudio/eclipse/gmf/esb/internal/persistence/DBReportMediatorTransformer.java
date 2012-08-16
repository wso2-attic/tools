package org.wso2.developerstudio.eclipse.gmf.esb.internal.persistence;

import java.util.List;

import org.apache.synapse.commons.datasource.DataSourceInformation;
import org.apache.synapse.endpoints.Endpoint;
import org.apache.synapse.mediators.base.SequenceMediator;
import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EObject;
import org.wso2.developerstudio.eclipse.gmf.esb.CacheMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.DBReportMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbNode;
import org.wso2.developerstudio.eclipse.gmf.esb.persistence.TransformationInfo;

public class DBReportMediatorTransformer extends AbstractEsbNodeTransformer {

	public void transform(TransformationInfo information, EsbNode subject)
			throws Exception {
		
		information.getParentSequence().addChild(createDBReportMediator(subject));
		doTransform(information, ((DBReportMediator)subject).getOutputConnector());
		
		
	}

	public void createSynapseObject(TransformationInfo info, EObject subject,
			List<Endpoint> endPoints) {
		// TODO Auto-generated method stub
		
	}

	public void transformWithinSequence(TransformationInfo information,
			EsbNode subject, SequenceMediator sequence) throws Exception {
		sequence.addChild(createDBReportMediator(subject));
		doTransformWithinSequence(information,((DBReportMediator) subject).getOutputConnector().getOutgoingLink(),sequence);
		
	}
	
	private org.apache.synapse.mediators.db.DBReportMediator createDBReportMediator(EsbNode subject) throws Exception{
		
		//NOT completed.
		Assert.isTrue(subject instanceof DBReportMediator,"Invalid Subject.");
		DBReportMediator visualDBReport =(DBReportMediator)subject;
		org.apache.synapse.mediators.db.DBReportMediator DBReportMediator=new org.apache.synapse.mediators.db.DBReportMediator();
		DataSourceInformation dataSourceInformation=new DataSourceInformation();
		dataSourceInformation.setDriver(visualDBReport.getConnectionDbDriver());
		DBReportMediator.setDataSourceInformation(dataSourceInformation);
		
		
		return DBReportMediator;
	}

}
