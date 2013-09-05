package org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderedShapeEditPart;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;

public class AbstractBaseFigureEditPart extends AbstractBorderedShapeEditPart{

	public IFigure inputConnectorFigure;

	public IFigure outputConnectorFigure;

	public IFigure faultInputnputConnectorFigure;
	
	public IFigure outSequenceOutputConnectorFigure;
	
	public AbstractBaseFigureEditPart(View view) {
		super(view);
	}

	protected NodeFigure createMainFigure() {
		return null;
	}
	
	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
		removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.POPUPBAR_ROLE);
	}
}
