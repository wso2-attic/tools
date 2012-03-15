package org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts;

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
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.custom.AbstractInputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.custom.EastPointerShape;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.policies.SmooksMediatorInputConnector2ItemSemanticEditPolicy;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.providers.EsbElementTypes;

/**
 * @generated NOT
 */
public class SmooksMediatorInputConnector2EditPart extends
		AbstractInputConnector {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3288;

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
	public SmooksMediatorInputConnector2EditPart(View view) {
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
				new SmooksMediatorInputConnector2ItemSemanticEditPolicy());
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
			types.add(EsbElementTypes.ProxyOutputConnector_3002);
			types.add(EsbElementTypes.PropertyMediatorOutputConnector_3034);
			types.add(EsbElementTypes.ThrottleMediatorOutputConnector_3122);
			types.add(EsbElementTypes.FilterMediatorPassOutputConnector_3011);
			types.add(EsbElementTypes.FilterMediatorFailOutputConnector_3012);
			types.add(EsbElementTypes.LogMediatorOutputConnector_3019);
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
			types.add(EsbElementTypes.HeaderMediatorOutputConnector_3101);
			types.add(EsbElementTypes.CloneMediatorOutputConnector_3104);
			types.add(EsbElementTypes.CloneMediatorTargetOutputConnector_3133);
			types.add(EsbElementTypes.CacheMediatorOutputConnector_3107);
			types.add(EsbElementTypes.IterateMediatorOutputConnector_3110);
			types.add(EsbElementTypes.CalloutMediatorOutputConnector_3116);
			types.add(EsbElementTypes.TransactionMediatorOutputConnector_3119);
			types.add(EsbElementTypes.RMSequenceMediatorOutputConnector_3125);
			types.add(EsbElementTypes.RuleMediatorOutputConnector_3128);
			types.add(EsbElementTypes.OAuthMediatorOutputConnector_3131);
			types.add(EsbElementTypes.AggregateMediatorOutputConnector_3113);
			types.add(EsbElementTypes.AggregateMediatorOnCompleteOutputConnector_3132);
			types.add(EsbElementTypes.LogMediatorOutputConnector_3136);
			types.add(EsbElementTypes.FilterMediatorPassOutputConnector_3141);
			types.add(EsbElementTypes.FilterMediatorFailOutputConnector_3142);
			types.add(EsbElementTypes.PropertyMediatorOutputConnector_3145);
			types.add(EsbElementTypes.EnrichMediatorOutputConnector_3148);
			types.add(EsbElementTypes.XSLTMediatorOutputConnector_3151);
			types.add(EsbElementTypes.SwitchCaseBranchOutputConnector_3154);
			types.add(EsbElementTypes.SwitchDefaultBranchOutputConnector_3155);
			types.add(EsbElementTypes.FaultMediatorOutputConnector_3158);
			types.add(EsbElementTypes.DBLookupMediatorOutputConnector_3161);
			types.add(EsbElementTypes.DBReportMediatorOutputConnector_3164);
			types.add(EsbElementTypes.SendMediatorOutputConnector_3167);
			types.add(EsbElementTypes.HeaderMediatorOutputConnector_3170);
			types.add(EsbElementTypes.CloneMediatorOutputConnector_3173);
			types.add(EsbElementTypes.CloneMediatorTargetOutputConnector_3174);
			types.add(EsbElementTypes.IterateMediatorOutputConnector_3177);
			types.add(EsbElementTypes.CalloutMediatorOutputConnector_3182);
			types.add(EsbElementTypes.TransactionMediatorOutputConnector_3184);
			types.add(EsbElementTypes.RMSequenceMediatorOutputConnector_3186);
			types.add(EsbElementTypes.SequenceOutputConnector_3189);
			types.add(EsbElementTypes.PropertyMediatorOutputConnector_3202);
			types.add(EsbElementTypes.ThrottleMediatorOutputConnector_3208);
			types.add(EsbElementTypes.FilterMediatorPassOutputConnector_3239);
			types.add(EsbElementTypes.FilterMediatorFailOutputConnector_3240);
			types.add(EsbElementTypes.LogMediatorOutputConnector_3243);
			types.add(EsbElementTypes.EnrichMediatorOutputConnector_3246);
			types.add(EsbElementTypes.XSLTMediatorOutputConnector_3249);
			types.add(EsbElementTypes.SwitchCaseBranchOutputConnector_3252);
			types.add(EsbElementTypes.SwitchDefaultBranchOutputConnector_3253);
			types.add(EsbElementTypes.SequenceOutputConnector_3256);
			types.add(EsbElementTypes.EventMediatorOutputConnector_3259);
			types.add(EsbElementTypes.EntitlementMediatorOutputConnector_3262);
			types.add(EsbElementTypes.ClassMediatorOutputConnector_3265);
			types.add(EsbElementTypes.SpringMediatorOutputConnector_3268);
			types.add(EsbElementTypes.ScriptMediatorOutputConnector_3271);
			types.add(EsbElementTypes.FaultMediatorOutputConnector_3274);
			types.add(EsbElementTypes.XQueryMediatorOutputConnector_3277);
			types.add(EsbElementTypes.CommandMediatorOutputConnector_3280);
			types.add(EsbElementTypes.DBLookupMediatorOutputConnector_3283);
			types.add(EsbElementTypes.DBReportMediatorOutputConnector_3286);
			types.add(EsbElementTypes.SmooksMediatorOutputConnector_3289);
			types.add(EsbElementTypes.SendMediatorOutputConnector_3292);
			types.add(EsbElementTypes.HeaderMediatorOutputConnector_3295);
			types.add(EsbElementTypes.CloneMediatorOutputConnector_3298);
			types.add(EsbElementTypes.CloneMediatorTargetOutputConnector_3299);
			types.add(EsbElementTypes.CacheMediatorOutputConnector_3302);
			types.add(EsbElementTypes.IterateMediatorOutputConnector_3305);
			types.add(EsbElementTypes.CalloutMediatorOutputConnector_3308);
			types.add(EsbElementTypes.TransactionMediatorOutputConnector_3311);
			types.add(EsbElementTypes.RMSequenceMediatorOutputConnector_3314);
			types.add(EsbElementTypes.RuleMediatorOutputConnector_3317);
			types.add(EsbElementTypes.OAuthMediatorOutputConnector_3320);
			types.add(EsbElementTypes.AggregateMediatorOutputConnector_3323);
			types.add(EsbElementTypes.AggregateMediatorOnCompleteOutputConnector_3324);
			types.add(EsbElementTypes.LogMediatorOutputConnector_3327);
			types.add(EsbElementTypes.FilterMediatorPassOutputConnector_3331);
			types.add(EsbElementTypes.FilterMediatorFailOutputConnector_3332);
			types.add(EsbElementTypes.PropertyMediatorOutputConnector_3204);
			types.add(EsbElementTypes.EnrichMediatorOutputConnector_3389);
			types.add(EsbElementTypes.XSLTMediatorOutputConnector_3339);
			types.add(EsbElementTypes.SwitchCaseBranchOutputConnector_3342);
			types.add(EsbElementTypes.SwitchDefaultBranchOutputConnector_3343);
			types.add(EsbElementTypes.FaultMediatorOutputConnector_3346);
			types.add(EsbElementTypes.DBLookupMediatorOutputConnector_3349);
			types.add(EsbElementTypes.DBReportMediatorOutputConnector_3352);
			types.add(EsbElementTypes.SendMediatorOutputConnector_3355);
			types.add(EsbElementTypes.HeaderMediatorOutputConnector_3358);
			types.add(EsbElementTypes.CloneMediatorOutputConnector_3361);
			types.add(EsbElementTypes.CloneMediatorTargetOutputConnector_3362);
			types.add(EsbElementTypes.IterateMediatorOutputConnector_3365);
			types.add(EsbElementTypes.CalloutMediatorOutputConnector_3368);
			types.add(EsbElementTypes.TransactionMediatorOutputConnector_3371);
			types.add(EsbElementTypes.RMSequenceMediatorOutputConnector_3374);
			types.add(EsbElementTypes.SequenceOutputConnector_3377);
			types.add(EsbElementTypes.DefaultEndPointOutputConnector_3022);
			types.add(EsbElementTypes.AddressEndPointOutputConnector_3031);
			types.add(EsbElementTypes.FailoverEndPointOutputConnector_3090);
			types.add(EsbElementTypes.FailoverEndPointWestOutputConnector_3097);
			types.add(EsbElementTypes.WSDLEndPointOutputConnector_3093);
			types.add(EsbElementTypes.LoadBalanceEndPointOutputConnector_3096);
			types.add(EsbElementTypes.LoadBalanceEndPointWestOutputConnector_3098);
			types.add(EsbElementTypes.MessageOutputConnector_3047);
			types.add(EsbElementTypes.MergeNodeOutputConnector_3016);
		}
		return types;
	}

	/**
	 * @generated
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
