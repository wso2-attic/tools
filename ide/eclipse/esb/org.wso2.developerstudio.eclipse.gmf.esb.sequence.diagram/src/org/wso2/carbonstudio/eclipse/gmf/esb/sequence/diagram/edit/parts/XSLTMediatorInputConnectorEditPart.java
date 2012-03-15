package org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.custom.EastPointerShape;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.policies.XSLTMediatorInputConnectorItemSemanticEditPolicy;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.providers.EsbElementTypes;

/**
 * @generated
 */
public class XSLTMediatorInputConnectorEditPart extends
		AbstractBorderItemEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3529;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public XSLTMediatorInputConnectorEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE,
				getPrimaryDragEditPolicy());
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new XSLTMediatorInputConnectorItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child
						.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new EastPointerFigure();
	}

	/**
	 * @generated
	 */
	public EastPointerFigure getPrimaryShape() {
		return (EastPointerFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(12, 10);

		//FIXME: workaround for #154536
		result.getBounds().setSize(result.getPreferredSize());
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(EsbElementTypes.EsbLink_4001);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == EsbElementTypes.EsbLink_4001) {
			types.add(EsbElementTypes.LogMediatorOutputConnector_3503);
			types.add(EsbElementTypes.PropertyMediatorOutputConnector_3514);
			types.add(EsbElementTypes.EsbSequenceInputConnector_3517);
			types.add(EsbElementTypes.EnrichMediatorOutputConnector_3523);
			types.add(EsbElementTypes.FilterMediatorPassOutputConnector_3526);
			types.add(EsbElementTypes.FilterMediatorFailOutputConnector_3527);
			types.add(EsbElementTypes.XSLTMediatorOutputConnector_3530);
			types.add(EsbElementTypes.EventMediatorOutputConnector_3533);
			types.add(EsbElementTypes.EntitlementMediatorOutputConnector_3536);
			types.add(EsbElementTypes.SwitchCaseBranchOutputConnector_3539);
			types.add(EsbElementTypes.SwitchDefaultBranchOutputConnector_3540);
			types.add(EsbElementTypes.ClassMediatorOutputConnector_3543);
			types.add(EsbElementTypes.SpringMediatorOutputConnector_3546);
			types.add(EsbElementTypes.ScriptMediatorOutputConnector_3549);
			types.add(EsbElementTypes.FaultMediatorOutputConnector_3552);
			types.add(EsbElementTypes.XQueryMediatorOutputConnector_3555);
			types.add(EsbElementTypes.CommandMediatorOutputConnector_3558);
			types.add(EsbElementTypes.DBLookupMediatorOutputConnector_3561);
			types.add(EsbElementTypes.DBReportMediatorOutputConnector_3564);
			types.add(EsbElementTypes.SmooksMediatorOutputConnector_3567);
			types.add(EsbElementTypes.SendMediatorOutputConnector_3570);
			types.add(EsbElementTypes.HeaderMediatorOutputConnector_3573);
			types.add(EsbElementTypes.CloneMediatorOutputConnector_3576);
			types.add(EsbElementTypes.CacheMediatorOutputConnector_3579);
			types.add(EsbElementTypes.IterateMediatorOutputConnector_3582);
			types.add(EsbElementTypes.AggregateMediatorOutputConnector_3585);
			types.add(EsbElementTypes.AggregateMediatorOnCompleteOutputConnector_3604);
			types.add(EsbElementTypes.CalloutMediatorOutputConnector_3588);
			types.add(EsbElementTypes.TransactionMediatorOutputConnector_3591);
			types.add(EsbElementTypes.ThrottleMediatorOutputConnector_3594);
			types.add(EsbElementTypes.RMSequenceMediatorOutputConnector_3597);
			types.add(EsbElementTypes.RuleMediatorOutputConnector_3600);
			types.add(EsbElementTypes.OAuthMediatorOutputConnector_3603);
		}
		return types;
	}

	/**
	 * @generated NOT
	 */
	public class EastPointerFigure extends EastPointerShape {

		/**
		 * @generated
		 */
		public EastPointerFigure() {

			this.setBackgroundColor(THIS_BACK);
			this.setPreferredSize(new Dimension(getMapMode().DPtoLP(12),
					getMapMode().DPtoLP(10)));
		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_BACK = new Color(null, 50, 50, 50);

}
