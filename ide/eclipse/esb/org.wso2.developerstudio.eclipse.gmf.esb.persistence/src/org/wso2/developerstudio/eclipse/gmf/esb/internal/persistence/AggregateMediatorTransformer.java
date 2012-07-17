package org.wso2.developerstudio.eclipse.gmf.esb.internal.persistence;

import java.util.List;

import org.apache.synapse.config.xml.AnonymousListMediator;
import org.apache.synapse.endpoints.Endpoint;
import org.apache.synapse.mediators.ListMediator;
import org.apache.synapse.mediators.base.SequenceMediator;
import org.apache.synapse.util.xpath.SynapseXPath;
import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EObject;
import org.wso2.developerstudio.eclipse.gmf.esb.AggregateMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbNode;
import org.wso2.developerstudio.eclipse.gmf.esb.persistence.TransformationInfo;

public class AggregateMediatorTransformer extends AbstractEsbNodeTransformer {

	public void transform(TransformationInfo information, EsbNode subject)
			throws Exception {
		information.getParentSequence().addChild(
				createAggregateMediator(information, subject));
		/*
		 * Transform the property mediator output data flow path.
		 */
		doTransform(information,
				((AggregateMediator) subject).getOutputConnector());

	}

	public void createSynapseObject(TransformationInfo info, EObject subject,
			List<Endpoint> endPoints) {

	}

	public void transformWithinSequence(TransformationInfo information,
			EsbNode subject, SequenceMediator sequence) throws Exception {
		sequence.addChild(createAggregateMediator(information, subject));
		doTransformWithinSequence(information, ((AggregateMediator) subject)
				.getOutputConnector().getOutgoingLink(), sequence);

	}

	private org.apache.synapse.mediators.eip.aggregator.AggregateMediator createAggregateMediator(
			TransformationInfo information, EsbNode subject) throws Exception {
		/*
		 * Check subject.
		 */
		Assert.isTrue(subject instanceof AggregateMediator, "Invalid subject.");
		AggregateMediator visualAggregate = (AggregateMediator) subject;

		/*
		 * Configure property mediator.
		 */
		org.apache.synapse.mediators.eip.aggregator.AggregateMediator aggregateMediator = new org.apache.synapse.mediators.eip.aggregator.AggregateMediator();
		{
			aggregateMediator.setCompletionTimeoutMillis(visualAggregate.getCompletionTimeout()*1000 );
			aggregateMediator.setMaxMessagesToComplete(visualAggregate
					.getCompletionMaxMessages());
			aggregateMediator.setMinMessagesToComplete(visualAggregate
					.getCompletionMinMessages());
			if (visualAggregate.getCorrelationExpression() != null
					&& visualAggregate.getCorrelationExpression()
							.getPropertyValue() != null
					&& !visualAggregate.getCorrelationExpression()
							.getPropertyValue().equals("")) {
				SynapseXPath correlationExpression = new SynapseXPath(visualAggregate
						.getCorrelationExpression().getPropertyValue());
				for(int i=0;i<visualAggregate.getCorrelationExpression().getNamespaces().keySet().size();++i){				
					String prefix=(String)visualAggregate.getCorrelationExpression().getNamespaces().keySet().toArray()[i];
					String namespaceUri=visualAggregate.getCorrelationExpression().getNamespaces().get(prefix);
					correlationExpression.addNamespace(prefix, namespaceUri);
				}
				
				aggregateMediator.setCorrelateExpression(correlationExpression);
			}
			SynapseXPath aggregateExpression = new SynapseXPath(visualAggregate
					.getOnCompleteBranch().getAggregationExpression()
					.getPropertyValue());
			for (int i = 0; i < visualAggregate.getOnCompleteBranch()
					.getAggregationExpression().getNamespaces().keySet().size(); ++i) {
				String prefix = (String) visualAggregate.getOnCompleteBranch()
						.getAggregationExpression().getNamespaces().keySet()
						.toArray()[i];
				String namespaceUri = visualAggregate
						.getOnCompleteBranch()
						.getAggregationExpression()
						.getNamespaces()
						.get(prefix);
				aggregateExpression.addNamespace(prefix, namespaceUri);
			}

			aggregateMediator.setAggregationExpression(aggregateExpression);

			/*
			 * onComplete
			 */
			ListMediator onCompleteMediatorList = new AnonymousListMediator();
			SequenceMediator onCompleteSequence = new SequenceMediator();

			TransformationInfo newOnCompleteInfo = new TransformationInfo();
			newOnCompleteInfo
					.setTraversalDirection(TransformationInfo.TRAVERSAL_DIRECTION_IN);
			newOnCompleteInfo.setSynapseConfiguration(information
					.getSynapseConfiguration());
			newOnCompleteInfo.setOriginInSequence(information
					.getOriginInSequence());
			newOnCompleteInfo.setOriginOutSequence(information
					.getOriginOutSequence());
			newOnCompleteInfo.setParentSequence(onCompleteMediatorList);
			doTransform(newOnCompleteInfo,
					visualAggregate.getOnCompleteOutputConnector());

			onCompleteSequence.addAll(onCompleteMediatorList.getList());
			aggregateMediator.setOnCompleteSequence(onCompleteSequence);

		}
		return aggregateMediator;
	}

}
