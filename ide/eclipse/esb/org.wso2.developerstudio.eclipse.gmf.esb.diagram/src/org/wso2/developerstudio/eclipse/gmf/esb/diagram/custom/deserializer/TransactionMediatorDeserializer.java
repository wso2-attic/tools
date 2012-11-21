package org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.deserializer;

import org.apache.synapse.mediators.AbstractMediator;
import org.eclipse.core.runtime.Assert;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.TransactionMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.providers.EsbElementTypes;

public class TransactionMediatorDeserializer extends AbstractEsbNodeDeserializer<AbstractMediator, TransactionMediator>{

	public TransactionMediator createNode(IGraphicalEditPart part,AbstractMediator mediator) {
		Assert.isTrue(mediator instanceof org.apache.synapse.mediators.transaction.TransactionMediator, "Unsupported mediator passed in for deserialization at "+ this.getClass());
		
		org.apache.synapse.mediators.transaction.TransactionMediator transactionMediator = (org.apache.synapse.mediators.transaction.TransactionMediator)mediator;
		
		TransactionMediator visualTransactionMediator = (TransactionMediator) DeserializerUtils.createNode(part, EsbElementTypes.TransactionMediator_3521);
		setElementToEdit(visualTransactionMediator);
		
		return visualTransactionMediator;
	}
}
