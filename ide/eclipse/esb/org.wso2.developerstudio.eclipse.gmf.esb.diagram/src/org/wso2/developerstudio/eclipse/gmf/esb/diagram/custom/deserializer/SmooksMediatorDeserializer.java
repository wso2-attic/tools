package org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.deserializer;

import org.apache.synapse.mediators.AbstractMediator;
import org.eclipse.core.runtime.Assert;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.SmooksMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.providers.EsbElementTypes;

public class SmooksMediatorDeserializer extends AbstractEsbNodeDeserializer<AbstractMediator, SmooksMediator>{
	
	public SmooksMediator createNode(IGraphicalEditPart part,AbstractMediator mediator) {
		Assert.isTrue(mediator instanceof org.wso2.carbon.mediator.transform.SmooksMediator, "Unsupported mediator passed in for deserialization at "+ this.getClass());
		
		org.wso2.carbon.mediator.transform.SmooksMediator smooksMediator = (org.wso2.carbon.mediator.transform.SmooksMediator)mediator;
		
		SmooksMediator visualSmooksMediator = (SmooksMediator) DeserializerUtils.createNode(part, EsbElementTypes.SmooksMediator_3514);
		setElementToEdit(visualSmooksMediator);
		
		return visualSmooksMediator;
	}

}
