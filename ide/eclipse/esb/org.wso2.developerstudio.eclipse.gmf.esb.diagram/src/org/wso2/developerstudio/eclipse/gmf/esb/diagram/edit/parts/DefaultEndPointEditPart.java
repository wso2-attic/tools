package org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderedShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
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
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.wso2.developerstudio.eclipse.gmf.esb.FailoverEndPoint;
import org.wso2.developerstudio.eclipse.gmf.esb.DefaultEndPoint;
import org.wso2.developerstudio.eclipse.gmf.esb.LoadBalanceEndPoint;
import org.wso2.developerstudio.eclipse.gmf.esb.SendMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.AbstractEndpoint;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.EsbGraphicalShape;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.FixedBorderItemLocator;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.ShowPropertyViewEditPolicy;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.utils.EndpointUtils;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.policies.DefaultEndPointCanonicalEditPolicy;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.policies.DefaultEndPointItemSemanticEditPolicy;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbVisualIDRegistry;

/**
 * @generated NOT
 */
public class DefaultEndPointEditPart extends AbstractEndpoint {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3609;

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
	public DefaultEndPointEditPart(View view) {
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
				new DefaultEndPointItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new DefaultEndPointCanonicalEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// For handle Double click Event.
		installEditPolicy(EditPolicyRoles.OPEN_ROLE,
				new ShowPropertyViewEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
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
				case DefaultEndPointInputConnectorEditPart.VISUAL_ID:
				case DefaultEndPointOutputConnectorEditPart.VISUAL_ID:
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
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new DefaultEndPointFigure();
	}

	/**
	 * @generated
	 */
	public DefaultEndPointFigure getPrimaryShape() {
		return (DefaultEndPointFigure) primaryShape;
	}

	/**
	 * @generated NOT
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof DefaultEndPointEndPointNameEditPart) {
			((DefaultEndPointEndPointNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureDefaultEndPointNamePropertyLabel());
			return true;
		}
		if (childEditPart instanceof DefaultEndPointInputConnectorEditPart) {
			double position;
			EObject parentEndpoint = ((org.eclipse.gmf.runtime.notation.impl.NodeImpl) (childEditPart
					.getParent()).getModel()).getElement();
			if (((DefaultEndPoint) parentEndpoint).getInputConnector()
					.getIncomingLinks().size() != 0) {
				EObject source = ((DefaultEndPoint) parentEndpoint)
						.getInputConnector().getIncomingLinks().get(0)
						.getSource().eContainer();
				position = ((source instanceof LoadBalanceEndPoint)
						|| (source instanceof FailoverEndPoint) || (source instanceof SendMediator)) ? 0.5
						: 0.25;
			} else {
				position = 0.25;
			}
			IFigure borderItemFigure = ((DefaultEndPointInputConnectorEditPart) childEditPart)
					.getFigure();
			BorderItemLocator locator = new FixedBorderItemLocator(
					getMainFigure(), borderItemFigure, PositionConstants.WEST,
					position);
			getBorderedFigure().getBorderItemContainer().add(borderItemFigure,
					locator);
			return true;
		}
		if (childEditPart instanceof DefaultEndPointOutputConnectorEditPart) {
			IFigure borderItemFigure = ((DefaultEndPointOutputConnectorEditPart) childEditPart)
					.getFigure();
			BorderItemLocator locator = new FixedBorderItemLocator(
					getMainFigure(), borderItemFigure, PositionConstants.WEST,
					0.75);
			getBorderedFigure().getBorderItemContainer().add(borderItemFigure,
					locator);
			return true;
		}
		return false;
		}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof DefaultEndPointEndPointNameEditPart) {
			return true;
		}
		if (childEditPart instanceof DefaultEndPointInputConnectorEditPart) {
			getBorderedFigure().getBorderItemContainer().remove(
					((DefaultEndPointInputConnectorEditPart) childEditPart)
							.getFigure());
			return true;
		}
		if (childEditPart instanceof DefaultEndPointOutputConnectorEditPart) {
			getBorderedFigure().getBorderItemContainer().remove(
					((DefaultEndPointOutputConnectorEditPart) childEditPart)
							.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
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
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		if (editPart instanceof IBorderItemEditPart) {
			return getBorderedFigure().getBorderItemContainer();
		}
		return getContentPane();
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
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
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
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
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

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(EsbVisualIDRegistry
				.getType(DefaultEndPointEndPointNameEditPart.VISUAL_ID));
	}
	
	public void activate() {
		EndpointUtils.addOutputConnectorsInitially(this, getEditingDomain());
		super.activate();
		}

	/**
	 * @generated
	 */
	public class DefaultEndPointFigure extends EsbGraphicalShape {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureDefaultEndPointNamePropertyLabel;

		/**
		 * @generated
		 */
		public DefaultEndPointFigure() {

			this.setBackgroundColor(THIS_BACK);
			createContents();
		}

		/**
		 * @generated NOT
		 */
		private void createContents() {

			fFigureDefaultEndPointNamePropertyLabel = new WrappingLabel();
			fFigureDefaultEndPointNamePropertyLabel.setText("<...>");
			fFigureDefaultEndPointNamePropertyLabel.setAlignment(SWT.CENTER);
			this.getPropertyValueRectangle1().add(
					fFigureDefaultEndPointNamePropertyLabel);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDefaultEndPointNamePropertyLabel() {
			return fFigureDefaultEndPointNamePropertyLabel;
		}
		

		public String getIconPath() {
		return "icons/ico20/defalut-endpoint.gif";
		}

		public String getNodeName() {
		return "Def-EP";
		}

		public Color getBackgroundColor() {
		return THIS_BACK;
		}

		public Color getLabelBackColor() {
		return THIS_LABEL_BACK;
		}

	}

	/**
	 * @generated NOT
	 */
	static final Color THIS_BACK = new Color(null, 113, 198, 113);

	static final Color THIS_LABEL_BACK = new Color(null, 113, 198, 113);

}/*package org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderedShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
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
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.wso2.developerstudio.eclipse.gmf.esb.DefaultEndPoint;
import org.wso2.developerstudio.eclipse.gmf.esb.FailoverEndPoint;
import org.wso2.developerstudio.eclipse.gmf.esb.LoadBalanceEndPoint;
import org.wso2.developerstudio.eclipse.gmf.esb.SendMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.AbstractEndpoint;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.EsbGraphicalShape;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.FixedBorderItemLocator;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.ShowPropertyViewEditPolicy;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.utils.EndpointUtils;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.policies.DefaultEndPointCanonicalEditPolicy;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.policies.DefaultEndPointItemSemanticEditPolicy;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbVisualIDRegistry;

 */
/**
 * @generated NOT
 */
/*
public class DefaultEndPointEditPart extends AbstractEndpoint {

 *//**
 * @generated
 */
/*
public static final int VISUAL_ID = 3563;

 *//**
 * @generated
 */
/*
protected IFigure contentPane;

 *//**
 * @generated
 */
/*
protected IFigure primaryShape;

 *//**
 * @generated
 */
/*
public DefaultEndPointEditPart(View view) {
super(view);
}

 *//**
 * @generated NOT
 */
/*
protected void createDefaultEditPolicies() {
installEditPolicy(EditPolicyRoles.CREATION_ROLE,
		new CreationEditPolicy());
super.createDefaultEditPolicies();
installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
		new DefaultEndPointItemSemanticEditPolicy());
installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
		new DragDropEditPolicy());
installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
		new DefaultEndPointCanonicalEditPolicy());
installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
// For handle Double click Event.
installEditPolicy(EditPolicyRoles.OPEN_ROLE,
		new ShowPropertyViewEditPolicy());
// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
}

 *//**
 * @generated
 */
/*
protected LayoutEditPolicy createLayoutEditPolicy() {
org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

	protected EditPolicy createChildEditPolicy(EditPart child) {
		View childView = (View) child.getModel();
		switch (EsbVisualIDRegistry.getVisualID(childView)) {
		case DefaultEndPointInputConnectorEditPart.VISUAL_ID:
		case DefaultEndPointOutputConnectorEditPart.VISUAL_ID:
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

 *//**
 * @generated
 */
/*
protected IFigure createNodeShape() {
return primaryShape = new DefaultEndPointFigure();
}

 *//**
 * @generated
 */
/*
public DefaultEndPointFigure getPrimaryShape() {
return (DefaultEndPointFigure) primaryShape;
}

 *//**
 * @generated NOT
 */
/*
protected boolean addFixedChild(EditPart childEditPart) {
if (childEditPart instanceof DefaultEndPointEndPointNameEditPart) {
	((DefaultEndPointEndPointNameEditPart) childEditPart)
			.setLabel(getPrimaryShape()
					.getFigureDefaultEndPointNamePropertyLabel());
	return true;
}
if (childEditPart instanceof DefaultEndPointInputConnectorEditPart) {
	double position;
	EObject parentEndpoint = ((org.eclipse.gmf.runtime.notation.impl.NodeImpl) (childEditPart
			.getParent()).getModel()).getElement();
	if (((DefaultEndPoint) parentEndpoint).getInputConnector()
			.getIncomingLinks().size() != 0) {
		EObject source = ((DefaultEndPoint) parentEndpoint)
				.getInputConnector().getIncomingLinks().get(0)
				.getSource().eContainer();
		position = ((source instanceof LoadBalanceEndPoint)
				|| (source instanceof FailoverEndPoint) || (source instanceof SendMediator)) ? 0.5
				: 0.25;
	} else {
		position = 0.25;
	}
	IFigure borderItemFigure = ((DefaultEndPointInputConnectorEditPart) childEditPart)
			.getFigure();
	BorderItemLocator locator = new FixedBorderItemLocator(
			getMainFigure(), borderItemFigure, PositionConstants.WEST,
			position);
	getBorderedFigure().getBorderItemContainer().add(borderItemFigure,
			locator);
	return true;
}
if (childEditPart instanceof DefaultEndPointOutputConnectorEditPart) {
	IFigure borderItemFigure = ((DefaultEndPointOutputConnectorEditPart) childEditPart)
			.getFigure();
	BorderItemLocator locator = new FixedBorderItemLocator(
			getMainFigure(), borderItemFigure, PositionConstants.WEST,
			0.75);
	getBorderedFigure().getBorderItemContainer().add(borderItemFigure,
			locator);
	return true;
}
return false;
}

 *//**
 * @generated
 */
/*
protected boolean removeFixedChild(EditPart childEditPart) {
if (childEditPart instanceof DefaultEndPointEndPointNameEditPart) {
	return true;
}
if (childEditPart instanceof DefaultEndPointInputConnectorEditPart) {
	getBorderedFigure().getBorderItemContainer().remove(
			((DefaultEndPointInputConnectorEditPart) childEditPart)
					.getFigure());
	return true;
}
if (childEditPart instanceof DefaultEndPointOutputConnectorEditPart) {
	getBorderedFigure().getBorderItemContainer().remove(
			((DefaultEndPointOutputConnectorEditPart) childEditPart)
					.getFigure());
	return true;
}
return false;
}

 *//**
 * @generated
 */
/*
protected void addChildVisual(EditPart childEditPart, int index) {
if (addFixedChild(childEditPart)) {
	return;
}
super.addChildVisual(childEditPart, -1);
}

 *//**
 * @generated
 */
/*
protected void removeChildVisual(EditPart childEditPart) {
if (removeFixedChild(childEditPart)) {
	return;
}
super.removeChildVisual(childEditPart);
}

 *//**
 * @generated
 */
/*
protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
if (editPart instanceof IBorderItemEditPart) {
	return getBorderedFigure().getBorderItemContainer();
}
return getContentPane();
}

public void activate() {
EndpointUtils.addOutputConnectorsInitially(this, getEditingDomain());
super.activate();
}

 *//**
 * @generated
 */
/*
protected NodeFigure createNodePlate() {
DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
return result;
}

 *//**
 * Creates figure for this edit part.
 * 
 * Body of this method does not depend on settings in generation model
 * so you may safely remove <i>generated</i> tag and modify it.
 * 
 * @generated
 */
/*
protected NodeFigure createMainFigure() {
NodeFigure figure = createNodePlate();
figure.setLayoutManager(new StackLayout());
IFigure shape = createNodeShape();
figure.add(shape);
contentPane = setupContentPane(shape);
return figure;
}

 *//**
 * Default implementation treats passed figure as content pane.
 * Respects layout one may have set for generated figure.
 * @param nodeShape instance of generated figure class
 * @generated
 */
/*
protected IFigure setupContentPane(IFigure nodeShape) {
if (nodeShape.getLayoutManager() == null) {
	ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
	layout.setSpacing(5);
	nodeShape.setLayoutManager(layout);
}
return nodeShape; // use nodeShape itself as contentPane
}

 *//**
 * @generated
 */
/*
public IFigure getContentPane() {
if (contentPane != null) {
	return contentPane;
}
return super.getContentPane();
}

 *//**
 * @generated
 */
/*
protected void setForegroundColor(Color color) {
if (primaryShape != null) {
	primaryShape.setForegroundColor(color);
}
}

 *//**
 * @generated
 */
/*
protected void setBackgroundColor(Color color) {
if (primaryShape != null) {
	primaryShape.setBackgroundColor(color);
}
}

 *//**
 * @generated
 */
/*
protected void setLineWidth(int width) {
if (primaryShape instanceof Shape) {
	((Shape) primaryShape).setLineWidth(width);
}
}

 *//**
 * @generated
 */
/*
protected void setLineType(int style) {
if (primaryShape instanceof Shape) {
	((Shape) primaryShape).setLineStyle(style);
}
}

 *//**
 * @generated
 */
/*
public EditPart getPrimaryChildEditPart() {
return getChildBySemanticHint(EsbVisualIDRegistry
		.getType(DefaultEndPointEndPointNameEditPart.VISUAL_ID));
}

 *//**
 * @generated
 */
/*
public class DefaultEndPointFigure extends EsbGraphicalShape {

 *//**
 * @generated
 */
/*
private WrappingLabel fFigureDefaultEndPointNamePropertyLabel;

 *//**
 * @generated
 */
/*
public DefaultEndPointFigure() {

this.setBackgroundColor(THIS_BACK);
createContents();
}

 *//**
 * @generated NOT
 */
/*
private void createContents() {

fFigureDefaultEndPointNamePropertyLabel = new WrappingLabel();
fFigureDefaultEndPointNamePropertyLabel.setText("<...>");
fFigureDefaultEndPointNamePropertyLabel.setAlignment(SWT.CENTER);
this.getPropertyValueRectangle1().add(
		fFigureDefaultEndPointNamePropertyLabel);

}

 *//**
 * @generated
 */
/*
public WrappingLabel getFigureDefaultEndPointNamePropertyLabel() {
return fFigureDefaultEndPointNamePropertyLabel;
}

public String getIconPath() {
return "icons/ico20/defalut-endpoint.gif";
}

public String getNodeName() {
return "Def-EP";
}

public Color getBackgroundColor() {
return THIS_BACK;
}

public Color getLabelBackColor() {
return THIS_LABEL_BACK;
}

}

 *//**
 * @generated
 */
/*
static final Color THIS_BACK = new Color(null, 248, 151, 40);
static final Color THIS_LABEL_BACK = new Color(null, 255, 225, 194);

}
 */