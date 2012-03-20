package org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.editpolicy;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;

public class CustomDragDropEditPolicy extends DragDropEditPolicy{
	
	protected Command getDropCommand(ChangeBoundsRequest request) {
		/* Avoiding drag and drop nodes between compartments. If you want default behavior call super(request) */		 
		Command cmd=null;
		return cmd;
	}	
}
