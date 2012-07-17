package org.wso2.developerstudio.eclipse.gmf.esb.internal.persistence;

import java.util.List;

import org.apache.synapse.endpoints.Endpoint;
import org.apache.synapse.mediators.base.SequenceMediator;
import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EObject;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbNode;
import org.wso2.developerstudio.eclipse.gmf.esb.TransactionMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.persistence.TransformationInfo;

public class TransactionMediatorTransformer extends AbstractEsbNodeTransformer {

	public void transform(TransformationInfo information, EsbNode subject)
			throws Exception {
		information.getParentSequence().addChild(createTransactionMediator(subject));
		/*
		 *  Transform the property mediator output data flow path.
		 */
		doTransform(information,
				((TransactionMediator) subject).getOutputConnector());
		
	}

	public void createSynapseObject(TransformationInfo info, EObject subject,
			List<Endpoint> endPoints) {
		
	}

	public void transformWithinSequence(TransformationInfo information,
			EsbNode subject, SequenceMediator sequence) throws Exception {
		sequence.addChild(createTransactionMediator(subject));
		doTransformWithinSequence(information,((TransactionMediator) subject).getOutputConnector().getOutgoingLink(),sequence);
		
	}
	
	private org.apache.synapse.mediators.transaction.TransactionMediator createTransactionMediator(EsbNode subject) throws Exception{
		/*
		 *  Check subject.
		 */
		Assert.isTrue(subject instanceof TransactionMediator, "Invalid subject.");
		TransactionMediator visualTransaction = (TransactionMediator) subject;

		/*
		 *  Configure property mediator.
		 */
		org.apache.synapse.mediators.transaction.TransactionMediator transactionMediator = new org.apache.synapse.mediators.transaction.TransactionMediator();
		{
			transactionMediator.setAction(visualTransaction.getAction().getLiteral());
		}
		return transactionMediator;
	}

}
