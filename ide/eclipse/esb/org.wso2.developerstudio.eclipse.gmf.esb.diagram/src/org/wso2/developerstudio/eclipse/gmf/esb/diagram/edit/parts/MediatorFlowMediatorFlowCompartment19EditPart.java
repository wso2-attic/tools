package org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts;

import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.DeferredCreateConnectionViewAndElementCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderedShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateConnectionViewAndElementRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.AbstractEndpoint;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.AbstractEndpointInputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.AbstractEndpointOutputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.AbstractMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.AbstractMediatorCompartmentEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.AbstractMediatorInputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.AbstractMediatorOutputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.AbstractOutputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.EditorUtils;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.policies.MediatorFlowMediatorFlowCompartment19CanonicalEditPolicy;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.policies.MediatorFlowMediatorFlowCompartment19ItemSemanticEditPolicy;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbVisualIDRegistry;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.Messages;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.providers.EsbElementTypes;

/**
 * @generated NOT
 */
public class MediatorFlowMediatorFlowCompartment19EditPart extends
		AbstractMediatorCompartmentEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 7046;

	/**
	 * @generated
	 */
	public MediatorFlowMediatorFlowCompartment19EditPart(View view) {
		super(view);
	}

	/**
	 * @generated NOT
	 */
	public String getCompartmentName() {
		//return Messages.MediatorFlowMediatorFlowCompartment19EditPart_title;
		return null;
	}

	public IFigure createFigure() {
		ResizableCompartmentFigure result = (ResizableCompartmentFigure) super.createFigure();
		result.setTitleVisibility(false);
		// Override default border.
		LineBorder border = new LineBorder(new Color(null, 224, 224, 224), 1, SWT.BORDER_DASH);
		result.setBorder(border);
		result.setToolTip((String) null);
		return result;
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new MediatorFlowMediatorFlowCompartment19ItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE, new CreationEditPolicyWithCustomReparent(
				EsbVisualIDRegistry.TYPED_INSTANCE));
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE, new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new MediatorFlowMediatorFlowCompartment19CanonicalEditPolicy());
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

	public void connectNormally(EditPart child) {
		AbstractBorderItemEditPart inputConnector = null;
		AbstractBorderItemEditPart outputConnector = null;
		ShapeNodeEditPart sourceEditPart = null;

		if ((child instanceof AbstractMediator) || (child instanceof AbstractEndpoint)) {

			inputConnector = EditorUtils.getEndpointInputConnector((ShapeNodeEditPart) child);
			List<EditPart> children = ((SendMediatorEditPart) this.getParent().getParent())
					.getChildren();
			for (int i = 0; i < children.size(); ++i) {
				if (children.get(i) instanceof SendMediatorEndpointOutputConnectorEditPart) {
					outputConnector = (AbstractBorderItemEditPart) children.get(i);
				}
			}

			sourceEditPart = (ShapeNodeEditPart) this.getParent().getParent();

			CompoundCommand cc = new CompoundCommand("Create Link");

			if (inputConnector != null) {
				ICommand createSubTopicsCmd = new DeferredCreateConnectionViewAndElementCommand(
						new CreateConnectionViewAndElementRequest(EsbElementTypes.EsbLink_4001,
								((IHintedType) EsbElementTypes.EsbLink_4001).getSemanticHint(),
								sourceEditPart.getDiagramPreferencesHint()), new EObjectAdapter(
								(EObject) outputConnector.getModel()), new EObjectAdapter(
								(EObject) (inputConnector).getModel()), sourceEditPart.getViewer());

				cc.add(new ICommandProxy(createSubTopicsCmd));

				getDiagramEditDomain().getDiagramCommandStack().execute(cc);
			}

		}
	}

}
