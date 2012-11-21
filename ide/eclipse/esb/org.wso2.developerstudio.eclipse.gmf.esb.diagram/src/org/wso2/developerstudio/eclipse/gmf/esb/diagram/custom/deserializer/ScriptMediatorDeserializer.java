package org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.deserializer;

import org.apache.synapse.mediators.AbstractMediator;
import org.eclipse.core.runtime.Assert;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.ScriptMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.providers.EsbElementTypes;

public class ScriptMediatorDeserializer extends AbstractEsbNodeDeserializer<AbstractMediator, ScriptMediator>{
	
	public ScriptMediator createNode(IGraphicalEditPart part,AbstractMediator mediator) {
		Assert.isTrue(mediator instanceof org.apache.synapse.mediators.bsf.ScriptMediator, "Unsupported mediator passed in for deserialization at "+ this.getClass());
		
		org.apache.synapse.mediators.bsf.ScriptMediator scriptMediator = (org.apache.synapse.mediators.bsf.ScriptMediator)mediator;
		
		ScriptMediator visualScriptMediator = (ScriptMediator) DeserializerUtils.createNode(part, EsbElementTypes.ScriptMediator_3508);
		setElementToEdit(visualScriptMediator);
		
		return visualScriptMediator;
	}

}
