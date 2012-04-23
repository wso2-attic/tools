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
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.policies.MediatorFlowMediatorFlowCompartment5CanonicalEditPolicy;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.policies.MediatorFlowMediatorFlowCompartment5ItemSemanticEditPolicy;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.Messages;

/**
 * @generated
 */
public class MediatorFlowMediatorFlowCompartment5EditPart extends ShapeCompartmentEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 7018;

	/**
	 * @generated
	 */
	public MediatorFlowMediatorFlowCompartment5EditPart(View view) {
		super(view);
	}

	/**
	 * @generated NOT
	 */
	public String getCompartmentName() {
		return "Out Sequence";
		//return Messages.MediatorFlowMediatorFlowCompartment5EditPart_title;
	}

	/**
	 * @generated NOT
	 */
	public IFigure createFigure() {
		ResizableCompartmentFigure result = (ResizableCompartmentFigure) super.createFigure();
		result.setTitleVisibility(true);
		// Override default border.
		result.setBorder(new MarginBorder(0, 0, 0, 0));
		result.setToolTip(getCompartmentName());
		return result;
	}

	/**
	 * @generated NOT
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
		                  new MediatorFlowMediatorFlowCompartment5ItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE, new CreationEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE, new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE, new CustomDragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
		                  new MediatorFlowMediatorFlowCompartment5CanonicalEditPolicy());
	}

	protected void addChild(EditPart child, int index) {
		super.addChild(child, index);
		//Refresh connector's position. Hardcoded. Should be altered.
		((MediatorFlow5EditPart) child.getParent().getParent()).refreshInputConnector(child.getParent()
		                                                                                   .getParent()
		                                                                                   .getParent()
		                                                                                   .getParent()
		                                                                                   .getParent()
		                                                                                   .getParent()
		                                                                                   .getParent());
		((MediatorFlowEditPart) ((ProxyServiceInSequenceEditPart) child.getParent().getParent()
		                                                               .getParent().getParent()
		                                                               .getChildren().get(0)).getChildren()
		                                                                                     .get(0)).refreshOutputConnector(child.getParent()
		                                                                                                                          .getParent()
		                                                                                                                          .getParent()
		                                                                                                                          .getParent()
		                                                                                                                          .getParent()
		                                                                                                                          .getParent()
		                                                                                                                          .getParent());
		//if(((ProxyServiceContainerEditPart)child.getParent().getParent().getParent().getParent().getParent().getParent().getChildren().get(4)).getChildren().size()==2)	;	
		//((MediatorFlow6EditPart)((ProxyServiceContainerEditPart)child.getParent().getParent().getParent().getParent().getParent().getParent().getChildren().get(4)).getChildren().get(1)).refreshInputConnector(child.getParent().getParent().getParent().getParent().getParent().getParent());
	}

	protected void removeChild(EditPart child) {
		// TODO Auto-generated method stub
		MediatorFlow5EditPart mediatorFlow = (MediatorFlow5EditPart) child.getParent().getParent();
		EditPart proxyService =
		                        child.getParent().getParent().getParent().getParent().getParent()
		                             .getParent().getParent();
		super.removeChild(child);
		mediatorFlow.refreshInputConnector(proxyService);
		((MediatorFlowEditPart) ((ProxyServiceInSequenceEditPart) mediatorFlow.getParent()
		                                                                      .getParent()
		                                                                      .getChildren().get(0)).getChildren()
		                                                                                            .get(0)).refreshOutputConnector(proxyService);
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
