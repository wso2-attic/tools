package org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.deserializer;

import org.apache.synapse.mediators.AbstractMediator;
import org.eclipse.core.runtime.Assert;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.RMSequenceMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.providers.EsbElementTypes;

public class RMSequenceMediatorDeserializer extends AbstractEsbNodeDeserializer<AbstractMediator, RMSequenceMediator>{
	
	public RMSequenceMediator createNode(IGraphicalEditPart part,AbstractMediator mediator) {
		Assert.isTrue(mediator instanceof org.apache.synapse.mediators.builtin.RMSequenceMediator, "Unsupported mediator passed in for deserialization at "+ this.getClass());
		
		org.apache.synapse.mediators.builtin.RMSequenceMediator RMSequenceMediator = (org.apache.synapse.mediators.builtin.RMSequenceMediator)mediator;
		
		RMSequenceMediator visualRMSequenceMediator = (RMSequenceMediator) DeserializerUtils.createNode(part, EsbElementTypes.RMSequenceMediator_3522);
		setElementToEdit(visualRMSequenceMediator);
		
		return visualRMSequenceMediator;
	}

}
