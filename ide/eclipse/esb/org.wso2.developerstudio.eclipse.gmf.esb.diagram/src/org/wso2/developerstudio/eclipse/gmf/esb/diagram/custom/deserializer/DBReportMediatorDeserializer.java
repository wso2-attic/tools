package org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.deserializer;

import org.apache.synapse.mediators.AbstractMediator;
import org.eclipse.core.runtime.Assert;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.DBReportMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.providers.EsbElementTypes;

public class DBReportMediatorDeserializer extends AbstractEsbNodeDeserializer<AbstractMediator, DBReportMediator>{

	public DBReportMediator createNode(IGraphicalEditPart part,AbstractMediator mediator) {
		Assert.isTrue(mediator instanceof org.apache.synapse.mediators.db.DBReportMediator, "Unsupported mediator passed in for deserialization at "+ this.getClass());
		
		org.apache.synapse.mediators.db.DBReportMediator DBReportMediator = (org.apache.synapse.mediators.db.DBReportMediator)mediator;
		
		DBReportMediator visualDBReportMediator = (DBReportMediator) DeserializerUtils.createNode(part, EsbElementTypes.DBReportMediator_3513);
		setElementToEdit(visualDBReportMediator);
		
		return visualDBReportMediator;
	}

}
