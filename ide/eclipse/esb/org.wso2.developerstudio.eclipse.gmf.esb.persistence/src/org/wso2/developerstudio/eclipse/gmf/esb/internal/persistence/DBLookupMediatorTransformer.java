package org.wso2.developerstudio.eclipse.gmf.esb.internal.persistence;

import java.util.List;

import javax.sql.DataSource;

import org.apache.synapse.commons.datasource.DBPoolView;
import org.apache.synapse.commons.datasource.DataSourceInformation;
import org.apache.synapse.endpoints.Endpoint;
import org.apache.synapse.mediators.base.SequenceMediator;
import org.apache.synapse.mediators.db.Statement;
import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EObject;
import org.wso2.developerstudio.eclipse.gmf.esb.DBLookupMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbNode;
import org.wso2.developerstudio.eclipse.gmf.esb.persistence.TransformationInfo;

public class DBLookupMediatorTransformer extends AbstractEsbNodeTransformer {

	public void transform(TransformationInfo information, EsbNode subject)
			throws Exception {		
		
		information.getParentSequence().addChild(createDBLookupMediator(information,subject));
		// Transform the property mediator output data flow path.
		doTransform(information,
				((DBLookupMediator) subject).getOutputConnector());		
	}

	public void createSynapseObject(TransformationInfo info, EObject subject,
			List<Endpoint> endPoints) {
		
	}
	
	public void transformWithinSequence(TransformationInfo information,
			EsbNode subject, SequenceMediator sequence) throws Exception {
		sequence.addChild(createDBLookupMediator(information,subject));
		doTransformWithinSequence(information,((DBLookupMediator) subject).getOutputConnector().getOutgoingLink(),sequence);
		
	}

	private org.apache.synapse.mediators.db.DBLookupMediator createDBLookupMediator(TransformationInfo information,EsbNode subject) throws Exception{
		Assert.isTrue(subject instanceof DBLookupMediator, "Invalid subject.");
		DBLookupMediator visualDBLookup = (DBLookupMediator) subject;
		
		org.apache.synapse.mediators.db.DBLookupMediator dbLookupMediator =new org.apache.synapse.mediators.db.DBLookupMediator();
		{
			dbLookupMediator.addDataSourceProperty("test", "test");
			dbLookupMediator.addStatement(new Statement("test"));
			DataSourceInformation dataSourceInformation=new DataSourceInformation();
			dataSourceInformation.addParameter("test", "test");			
			dbLookupMediator.setDataSourceInformation(dataSourceInformation);
			DBPoolView dbPoolView=new DBPoolView("test");		
			dbLookupMediator.setDbPoolView(dbPoolView);
		}
		return dbLookupMediator;
	}


}
