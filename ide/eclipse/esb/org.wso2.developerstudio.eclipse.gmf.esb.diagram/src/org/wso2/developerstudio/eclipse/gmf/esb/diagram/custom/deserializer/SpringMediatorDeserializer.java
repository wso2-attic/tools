package org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.deserializer;

import org.apache.synapse.mediators.AbstractMediator;
import org.eclipse.core.runtime.Assert;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.SpringMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.providers.EsbElementTypes;

public class SpringMediatorDeserializer extends AbstractEsbNodeDeserializer<AbstractMediator, SpringMediator>{

	public SpringMediator createNode(IGraphicalEditPart part,AbstractMediator mediator) {
		Assert.isTrue(mediator instanceof org.apache.synapse.mediators.spring.SpringMediator, "Unsupported mediator passed in for deserialization at "+ this.getClass());
		
		org.apache.synapse.mediators.spring.SpringMediator springMediator = (org.apache.synapse.mediators.spring.SpringMediator)mediator;
		
		SpringMediator visualSpringMediator = (SpringMediator) DeserializerUtils.createNode(part, EsbElementTypes.SpringMediator_3507);
		setElementToEdit(visualSpringMediator);
		
		return visualSpringMediator;
	}

}
