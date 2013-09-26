package org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderedShapeEditPart;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.wso2.developerstudio.eclipse.gmf.esb.ProxyInSequenceInputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.SendMediatorEditPart;

public class AbstractBaseFigureEditPart extends AbstractBorderedShapeEditPart{

	public IFigure inputConnectorFigure;

	public IFigure outputConnectorFigure;

	public IFigure faultInputnputConnectorFigure;
	
	public IFigure outSequenceOutputConnectorFigure;
	
	public IFigure inSequenceInputConnectorFigure;
	
	public Map<ProxyInSequenceInputConnector, SendMediatorEditPart> sendMediatorAndInSequenceInputConnectorMap=new HashMap<ProxyInSequenceInputConnector, SendMediatorEditPart>();

	protected int y=0;
	protected int x=0;
	

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}	

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
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
	
	public Map<ProxyInSequenceInputConnector, SendMediatorEditPart> getSendMediatorAndInSequenceInputConnectorMap() {
		return sendMediatorAndInSequenceInputConnectorMap;
	}

	public void setSendMediatorAndInSequenceInputConnectorMap(
			Map<ProxyInSequenceInputConnector, SendMediatorEditPart> sendMediatorAndInSequenceInputConnectorMap) {
		this.sendMediatorAndInSequenceInputConnectorMap = sendMediatorAndInSequenceInputConnectorMap;
	}
}
