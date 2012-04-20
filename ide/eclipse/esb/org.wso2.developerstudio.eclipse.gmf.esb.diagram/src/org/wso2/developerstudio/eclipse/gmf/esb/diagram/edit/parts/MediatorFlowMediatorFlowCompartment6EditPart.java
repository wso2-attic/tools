package org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.notation.View;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.editpolicy.CustomDragDropEditPolicy;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.policies.MediatorFlowMediatorFlowCompartment6CanonicalEditPolicy;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.policies.MediatorFlowMediatorFlowCompartment6ItemSemanticEditPolicy;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.Messages;

/**
 * @generated
 */
public class MediatorFlowMediatorFlowCompartment6EditPart extends
		ShapeCompartmentEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 7019;

	/**
	 * @generated
	 */
	public MediatorFlowMediatorFlowCompartment6EditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	public String getCompartmentName() {
		return Messages.MediatorFlowMediatorFlowCompartment6EditPart_title;
	}

	/**
	 * @generated NOT
	 */
	public IFigure createFigure() {
		ResizableCompartmentFigure result = (ResizableCompartmentFigure) super
				.createFigure();
		result.setTitleVisibility(false);
		// Override default border.
		result.setBorder(new MarginBorder(0, 0, 0, 0));
		result.setToolTip((String) null);
		return result;
	}

	/**
	 * @generated NOT
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new MediatorFlowMediatorFlowCompartment6ItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new CustomDragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new MediatorFlowMediatorFlowCompartment6CanonicalEditPolicy());
	}
	
	protected void addChild(EditPart child, int index) {
		super.addChild(child, index);
		//Refresh connector's position. HardCoded.
		((MediatorFlow6EditPart)child.getParent().getParent()).refreshInputConnector(child.getParent().getParent().getParent().getParent().getParent());
	}
	
	
	protected void removeChild(EditPart child) {
		// TODO Auto-generated method stub
		MediatorFlow6EditPart mediatorFlow=(MediatorFlow6EditPart)child.getParent().getParent();
		EditPart proxyService=child.getParent().getParent().getParent().getParent().getParent();
		super.removeChild(child);
		mediatorFlow.refreshInputConnector(proxyService);
		
	}
	
	public boolean isSelectable() {
		// TODO This or using ResizableEditpolicy?
		return false;
	}

	/**
	 * @generated
	 */
	protected void setRatio(Double ratio) {
		if (getFigure().getParent().getLayoutManager() instanceof ConstrainedToolbarLayout) {
			super.setRatio(ratio);
		}
	}

}
