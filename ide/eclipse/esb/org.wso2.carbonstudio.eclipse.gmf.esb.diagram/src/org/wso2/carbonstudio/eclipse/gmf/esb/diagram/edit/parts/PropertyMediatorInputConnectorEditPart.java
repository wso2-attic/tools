package org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MouseEvent;
import org.eclipse.draw2d.MouseMotionListener;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.custom.AbstractInputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.custom.EastPointerShape;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.custom.WestPointerShape;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.policies.PropertyMediatorInputConnectorItemSemanticEditPolicy;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.providers.EsbElementTypes;

/**
 * @generated NOT
 */
public class PropertyMediatorInputConnectorEditPart extends
		AbstractInputConnector {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3033;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated NOT
	 */
	protected IFigure primaryShapeForward;

	protected IFigure primaryShapeReverse;

	public final boolean isInput = true;

	/**
	 * @generated
	 */
	public PropertyMediatorInputConnectorEditPart(View view) {
		super(view);
	}

	public NodeFigure figure_;

	public NodeFigure getNodeFigureInput() {

		return figure_;
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE,
				getPrimaryDragEditPolicy());
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new PropertyMediatorInputConnectorItemSemanticEditPolicy());
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
	 * @generated NOT
	 */
	protected IFigure createNodeShapeForward() {
		return primaryShapeForward = new EastPointerFigure();
	}

	protected IFigure createNodeShapeReverse() {
		return primaryShapeReverse = new WestPointerFigure();
	}

	/**
	 * @generated NOT
	 */
	public EastPointerFigure getPrimaryShapeForward() {
		return (EastPointerFigure) primaryShapeForward;
	}

	public WestPointerFigure getPrimaryShapeReverse() {
		return (WestPointerFigure) primaryShapeReverse;
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
	 * @generated NOT
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShapeForward();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		figure_ = figure;

		createNodeShapeReverse();

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
		if (primaryShapeForward != null) {
			primaryShapeForward.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShapeForward != null) {
			primaryShapeForward.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShapeForward instanceof Shape) {
			((Shape) primaryShapeForward).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShapeForward instanceof Shape) {
			((Shape) primaryShapeForward).setLineStyle(style);
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
			types.add(EsbElementTypes.ProxyOutputConnector_3002);
			types.add(EsbElementTypes.MessageOutputConnector_3047);
			types.add(EsbElementTypes.DefaultEndPointOutputConnector_3022);
			types.add(EsbElementTypes.AddressEndPointOutputConnector_3031);
			types.add(EsbElementTypes.FilterMediatorPassOutputConnector_3011);
			types.add(EsbElementTypes.FilterMediatorFailOutputConnector_3012);
			types.add(EsbElementTypes.MergeNodeOutputConnector_3016);
			types.add(EsbElementTypes.LogMediatorOutputConnector_3019);
			types.add(EsbElementTypes.PropertyMediatorOutputConnector_3034);
			types.add(EsbElementTypes.EnrichMediatorOutputConnector_3037);
			types.add(EsbElementTypes.XSLTMediatorOutputConnector_3040);
			types.add(EsbElementTypes.SwitchCaseBranchOutputConnector_3043);
			types.add(EsbElementTypes.SwitchDefaultBranchOutputConnector_3044);
			types.add(EsbElementTypes.SequenceOutputConnector_3050);
			types.add(EsbElementTypes.EventMediatorOutputConnector_3053);
			types.add(EsbElementTypes.EntitlementMediatorOutputConnector_3056);
			types.add(EsbElementTypes.ClassMediatorOutputConnector_3059);
			types.add(EsbElementTypes.SpringMediatorOutputConnector_3062);
			types.add(EsbElementTypes.ScriptMediatorOutputConnector_3065);
			types.add(EsbElementTypes.FaultMediatorOutputConnector_3068);
			types.add(EsbElementTypes.XQueryMediatorOutputConnector_3071);
			types.add(EsbElementTypes.CommandMediatorOutputConnector_3074);
			types.add(EsbElementTypes.DBLookupMediatorOutputConnector_3077);
			types.add(EsbElementTypes.DBReportMediatorOutputConnector_3080);
			types.add(EsbElementTypes.SmooksMediatorOutputConnector_3083);
			types.add(EsbElementTypes.SendMediatorOutputConnector_3086);
		}
		return types;
	}

	/*	*//**
			 * @generated
			 */
	/*
	public class EastPointerFigure extends EastPointerShape {

	 *//**
		 * @generated
		 */
	/*
	public EastPointerFigure() {

	this.setBackgroundColor(THIS_BACK);
	this.setPreferredSize(new Dimension(getMapMode().DPtoLP(12),
			getMapMode().DPtoLP(10)));
	}

	}

	public class WestPointerFigure extends WestPointerShape {

	public WestPointerFigure() {

	this.setBackgroundColor(THIS_BACK);
	this.setPreferredSize(new Dimension(getMapMode().DPtoLP(12),
			getMapMode().DPtoLP(10)));
	}

	}*/

	/**
	 * @generated
	 */
	static final Color THIS_BACK = new Color(null, 50, 50, 50);

}
