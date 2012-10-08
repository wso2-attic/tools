package org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeCompartmentEditPart;
import org.eclipse.gmf.runtime.notation.View;

public class AbstractMediatorFlowCompartmentEditPart extends ShapeCompartmentEditPart {

	public AbstractMediatorFlowCompartmentEditPart(View view) {
		super(view);
	}
		
	protected void removeChild(EditPart child) {
		connectRemainingElements(child);	
		super.removeChild(child);		
	}
	
	private void connectRemainingElements(EditPart child){	
		if(child instanceof AbstractMediator){
		ConnectionUtils.createConnection(((AbstractMediator)child).getConnectedInputConnector(), ((AbstractMediator)child).getConnectedOutputConnector());
		}
	}
}

