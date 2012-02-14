package org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderedShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.BorderItemSelectionEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.custom.AbstractInputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.custom.AbstractMediator;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.custom.AbstractOutputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.custom.DefaultSizeCaseBranchPointerNodeFigure;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.custom.EvenlyDividedFixedBorderItemLocator;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.custom.FixedBorderItemLocator;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.custom.ShowPropertyViewEditPolicy;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.custom.SwitchMediatorGraphicalShape;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.policies.SwitchMediatorCanonicalEditPolicy;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.policies.SwitchMediatorItemSemanticEditPolicy;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.part.EsbVisualIDRegistry;

/**
 * @generated NOT
 */
public class SwitchMediatorEditPart extends AbstractMediator {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3041;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	private List<IFigure> outputConnectors = new ArrayList<IFigure>();
	private List<BorderItemLocator> outputLocators = new ArrayList<BorderItemLocator>();
	private IFigure inputConnector;
	private IFigure outputConnector;

	/**
	 * @generated
	 */
	public SwitchMediatorEditPart(View view) {
		super(view);
	}

	/**
	 * @generated NOT
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicy());
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new SwitchMediatorItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new SwitchMediatorCanonicalEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// For handle Double click Event.
		installEditPolicy(EditPolicyRoles.OPEN_ROLE,
				new ShowPropertyViewEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that
		// would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				View childView = (View) child.getModel();
				switch (EsbVisualIDRegistry.getVisualID(childView)) {
				case SwitchMediatorInputConnectorEditPart.VISUAL_ID:
				case SwitchCaseBranchOutputConnectorEditPart.VISUAL_ID:
				case SwitchDefaultBranchOutputConnectorEditPart.VISUAL_ID:
					return new BorderItemSelectionEditPolicy();
				}
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
	 * @customizations: fixed border locators for connectors
	 */

	protected boolean addFixedChild(EditPart childEditPart) {

		float outputCount = 0;
		float outputPosition = 0;

		// int caseBranchesCount = arrangeCaseBranches();
		if (childEditPart instanceof SwitchMediatorInputConnectorEditPart) {

			IFigure borderItemFigure = ((SwitchMediatorInputConnectorEditPart) childEditPart)
					.getFigure();

			BorderItemLocator locator = new FixedBorderItemLocator(
					getMainFigure(), borderItemFigure, PositionConstants.WEST,
					0.5);
			getBorderedFigure().getBorderItemContainer().add(borderItemFigure,
					locator);
			return true;

		} else if (childEditPart instanceof SwitchCaseBranchOutputConnectorEditPart) {

			IFigure borderItemFigure = ((SwitchCaseBranchOutputConnectorEditPart) childEditPart)
					.getFigure();

			if (!this.getIsForward()) {
				NodeFigure figureOutput = ((AbstractOutputConnector) this
						.getChildren().get(this.getChildren().size() - 1))
						.getNodeFigureOutput();
				figureOutput.removeAll();
				figureOutput.add(((AbstractOutputConnector) this.getChildren()
						.get(this.getChildren().size() - 1))
						.getPrimaryShapeReverse());
			}

			BorderItemLocator locator = new FixedBorderItemLocator(
					getMainFigure(), borderItemFigure, PositionConstants.EAST,
					0.5);
			getBorderedFigure().getBorderItemContainer().add(borderItemFigure,
					locator);
			for (int i = 0; i < this.getChildren().size(); ++i) {
				if (this.getChildren().get(i) instanceof AbstractOutputConnector) {
					++outputCount;
				}
			}

			for (int i = 0; i < this.getChildren().size(); ++i) {
				if (this.getChildren().get(i) instanceof AbstractOutputConnector) {

					outputConnector = ((AbstractOutputConnector) this
							.getChildren().get(i)).getFigure();
					outputConnectors.add(outputConnector);
					outputPosition = outputPosition + (1 / (outputCount + 1));

					if (this.getIsForward()) {

						BorderItemLocator outputLocator = new FixedBorderItemLocator(
								this.getMainFigure(), outputConnector,
								PositionConstants.EAST, outputPosition);

						outputLocators.add(outputLocator);

					}
					if (!this.getIsForward()) {

						BorderItemLocator outputLocator = new FixedBorderItemLocator(
								this.getMainFigure(), outputConnector,
								PositionConstants.WEST, outputPosition);

						outputLocators.add(outputLocator);

					}
				}
			}

			for (int j = 0; j < outputConnectors.size(); ++j) {
				this.getBorderedFigure().getBorderItemContainer()
						.remove(outputConnectors.get(j));
				this.getBorderedFigure().getBorderItemContainer()
						.add(outputConnectors.get(j), outputLocators.get(j));

			}

			/*
			 * IFigure borderItemFigure =
			 * ((SwitchCaseBranchOutputConnectorEditPart) childEditPart)
			 * .getFigure(); getBorderedFigure() .getBorderItemContainer()
			 * .add(borderItemFigure, new EvenlyDividedFixedBorderItemLocator(
			 * getMainFigure(), borderItemFigure, PositionConstants.EAST,
			 * ((DefaultSizeCaseBranchPointerNodeFigure) borderItemFigure)
			 * .getId(), caseBranchesCount));
			 */

			return true;
		}

		else if (childEditPart instanceof SwitchDefaultBranchOutputConnectorEditPart) {

			IFigure borderItemFigure = ((SwitchDefaultBranchOutputConnectorEditPart) childEditPart)
					.getFigure();
			BorderItemLocator locator = new FixedBorderItemLocator(
					getMainFigure(), borderItemFigure, PositionConstants.EAST,
					0.5);
			getBorderedFigure().getBorderItemContainer().add(borderItemFigure,
					locator);
			return true;

			/*
			 * IFigure borderItemFigure =
			 * ((SwitchDefaultBranchOutputConnectorEditPart) childEditPart)
			 * .getFigure(); getBorderedFigure() .getBorderItemContainer()
			 * .add(borderItemFigure, new EvenlyDividedFixedBorderItemLocator(
			 * getMainFigure(), borderItemFigure, PositionConstants.EAST,
			 * ((DefaultSizeCaseBranchPointerNodeFigure)
			 * borderItemFigure).getId(),1));// caseBranchesCount));
			 */

		}

		return false;
	}

	/**
	 * @generated NOT
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof SwitchCaseBranchOutputConnectorEditPart) {
			//arrangeCaseBranches();
			getBorderedFigure().getBorderItemContainer().remove(
					((SwitchCaseBranchOutputConnectorEditPart) childEditPart)
							.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated NOT
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated NOT
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new SwitchMediatorFigure();
	}

	/**
	 * @generated
	 */
	public SwitchMediatorFigure getPrimaryShape() {
		return (SwitchMediatorFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model so
	 * you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createMainFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane. Respects
	 * layout one may have set for generated figure.
	 * 
	 * @param nodeShape
	 *            instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
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

	/*public int arrangeCaseBranches() {

		@SuppressWarnings("rawtypes")
		List childParts = this.getChildren();
		List<SwitchCaseBranchOutputConnectorEditPart> caseBranchparts = new ArrayList<SwitchCaseBranchOutputConnectorEditPart>();

		int id = 1;
		for (Object editpart : childParts) {
			if (editpart instanceof SwitchCaseBranchOutputConnectorEditPart) {
				SwitchCaseBranchOutputConnectorEditPart caseBranch = (SwitchCaseBranchOutputConnectorEditPart) editpart;
				caseBranchparts.add(caseBranch);
			}
		}
		int caseBranchCount = caseBranchparts.size();

		for (SwitchCaseBranchOutputConnectorEditPart caseBranchEditpart : caseBranchparts) {
			// if (((DefaultSizeCaseBranchPointerNodeFigure) caseBranch
			// .getFigure()).getId() == -1) {
			((DefaultSizeCaseBranchPointerNodeFigure) caseBranchEditpart
					.getFigure()).setId(id++);
			EvenlyDividedFixedBorderItemLocator borderItemLocator = (EvenlyDividedFixedBorderItemLocator) caseBranchEditpart
					.getBorderItemLocator();
			if (borderItemLocator != null) {
				borderItemLocator.setSiblingCount(caseBranchCount);
			}
			// }
		}

		return caseBranchCount;
	}*/

	/**
	 * @generated
	 */
	public class SwitchMediatorFigure extends SwitchMediatorGraphicalShape {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureSwitchMediatorPropertyValue;

		/**
		 * @generated
		 */
		public SwitchMediatorFigure() {

			this.setBackgroundColor(THIS_BACK);
			createContents();
		}

		/**
		 * @generated NOT
		 */
		private void createContents() {

			fFigureSwitchMediatorPropertyValue = new WrappingLabel();
			fFigureSwitchMediatorPropertyValue.setText("<...>");

			// this.add(fFigureSwitchMediatorPropertyValue);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSwitchMediatorPropertyValue() {
			return fFigureSwitchMediatorPropertyValue;
		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_BACK = new Color(null, 230, 230, 230);

	public boolean getIsForward() {
		// TODO Auto-generated method stub
		return isForward;
	}

	public void setIsForward(boolean isForward_) {
		// TODO Auto-generated method stub
		isForward = isForward_;

	}

}
