package org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.deserializer;

import org.apache.synapse.mediators.AbstractMediator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.EventMediator;

public class CallTemplateMediatorDeserializer extends AbstractEsbNodeDeserializer<AbstractMediator, EventMediator>{
	
	public EventMediator createNode(IGraphicalEditPart part,
			AbstractMediator object) {
		return null;
	}
}
