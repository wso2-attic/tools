package org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.deserializer;

import org.apache.synapse.mediators.AbstractMediator;
import org.eclipse.core.runtime.Assert;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.BuilderMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.providers.EsbElementTypes;

public class BuilderMediatorDeserializer extends AbstractEsbNodeDeserializer<AbstractMediator, BuilderMediator>{
	
	public BuilderMediator createNode(IGraphicalEditPart part,AbstractMediator mediator) {
		Assert.isTrue(mediator instanceof org.wso2.developerstudio.eclipse.gmf.esb.internal.persistence.custom.BuilderMediatorExt, "Unsupported mediator passed in for deserialization at "+ this.getClass());
		
		org.wso2.developerstudio.eclipse.gmf.esb.internal.persistence.custom.BuilderMediatorExt builderMediator = (org.wso2.developerstudio.eclipse.gmf.esb.internal.persistence.custom.BuilderMediatorExt)mediator;
		
		BuilderMediator visualBuilderMediator = (BuilderMediator) DeserializerUtils.createNode(part, EsbElementTypes.BuilderMediator_3591);
		setElementToEdit(visualBuilderMediator);
		
		return visualBuilderMediator;
	}

}
