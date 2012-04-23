package org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.DeferredCreateConnectionViewAndElementCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderedShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateConnectionViewAndElementRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.notation.View;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbFactory;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage;
import org.wso2.developerstudio.eclipse.gmf.esb.SwitchCaseBranchOutputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.SwitchCaseContainer;
import org.wso2.developerstudio.eclipse.gmf.esb.SwitchMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.SwitchMediatorContainer;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.AbstractInputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.AbstractMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.AbstractOutputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.editpolicy.CustomDragDropEditPolicy;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.policies.MediatorFlowMediatorFlowCompartmentCanonicalEditPolicy;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.policies.MediatorFlowMediatorFlowCompartmentItemSemanticEditPolicy;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.Messages;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.providers.EsbElementTypes;

/**
 * @generated
 */
public class MediatorFlowMediatorFlowCompartmentEditPart extends ShapeCompartmentEditPart {

	AbstractOutputConnector sourceOutputConnector = null;
	AbstractOutputConnector outputConnectorEditPart = null;
	AbstractBorderedShapeEditPart sourceEditPart = null;

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 7014;

	/**
	 * @generated
	 */
	public MediatorFlowMediatorFlowCompartmentEditPart(View view) {
		super(view);
	}

	/**
	 * @generated NOT
	 */
	public String getCompartmentName() {
		return "In Sequence";
		//return Messages.MediatorFlowMediatorFlowCompartmentEditPart_title;
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
		                  new MediatorFlowMediatorFlowCompartmentItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE, new CreationEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE, new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE, new CustomDragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
		                  new MediatorFlowMediatorFlowCompartmentCanonicalEditPolicy());
	}

	protected void addChild(EditPart child, int index) {
		super.addChild(child, index);
		//Refresh connector's position.
		((MediatorFlowEditPart) child.getParent().getParent()).refreshOutputConnector(child.getParent()
		                                                                                   .getParent()
		                                                                                   .getParent()
		                                                                                   .getParent()
		                                                                                   .getParent()
		                                                                                   .getParent()
		                                                                                   .getParent());
		AbstractInputConnector inputConnector = null;

		if (child instanceof AbstractMediator) {
			AbstractMediator mediator = (AbstractMediator) child;

			for (int i = 0; i < child.getChildren().size(); ++i) {
				if (child.getChildren().get(i) instanceof AbstractInputConnector) {
					inputConnector = (AbstractInputConnector) child.getChildren().get(i);
				}
				if (child.getChildren().get(i) instanceof AbstractOutputConnector) {
					sourceOutputConnector = (AbstractOutputConnector) child.getChildren().get(i);
				}

			}
			if (outputConnectorEditPart == null) {
				outputConnectorEditPart =
				                          ((AbstractOutputConnector) this.getParent().getParent()
				                                                         .getParent().getParent()
				                                                         .getParent().getParent()
				                                                         .getChildren().get(1));
			}
			if (sourceEditPart == null || sourceEditPart.getRoot() == null) {
				sourceEditPart =
				                 (AbstractBorderedShapeEditPart) this.getParent().getParent()
				                                                     .getParent().getParent()
				                                                     .getParent().getParent();
			}

			//System.out.println(outputConnectorEditPart.getFigure().getClass());
			//((IFigure)(((IFigure)((IFigure)editPart.getFigure().getChildren().get(0)).getChildren().get(0))).getChildren().get(0)).getChildren().get(1);
			//System.out.println(((IFigure)(((IFigure)((IFigure)editPart.getFigure().getChildren().get(0)).getChildren().get(0))).getChildren().get(0)).getClass());
			//System.out.println(((ProxyServiceEditPart)this.getParent().getParent().getParent()));
			//	(IFigure) ((IFigure) ((IFigure) (IFigure) getFigure().getChildren().get(0)).getChildren().get(0))
			//	.getChildren().get(0)
			//System.out.println("Class parent  "+mediator.getFigure().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getChildren().get(1).getClass());

			CompoundCommand cc = new CompoundCommand("Create Link");

			ICommand createSubTopicsCmd =
			                              new DeferredCreateConnectionViewAndElementCommand(
			                                                                                new CreateConnectionViewAndElementRequest(
			                                                                                                                          EsbElementTypes.EsbLink_4001,
			                                                                                                                          ((IHintedType) EsbElementTypes.EsbLink_4001).getSemanticHint(),
			                                                                                                                          sourceEditPart.getDiagramPreferencesHint()),
			                                                                                new EObjectAdapter(
			                                                                                                   (EObject) outputConnectorEditPart.getModel()),
			                                                                                new EObjectAdapter(
			                                                                                                   (EObject) (inputConnector).getModel()),
			                                                                                sourceEditPart.getViewer());

			cc.add(new ICommandProxy(createSubTopicsCmd));

			getDiagramEditDomain().getDiagramCommandStack().execute(cc);

			outputConnectorEditPart = sourceOutputConnector;
			sourceEditPart = (AbstractBorderedShapeEditPart) child;

		}
		if (child instanceof AbstractMediator) {
			((AbstractMediator) child).Reverse(child);
		}

		if (child instanceof SwitchMediatorEditPart) {
			SwitchMediatorEditPart switchMediatorEditPart = (SwitchMediatorEditPart) child;
			EObject parentContainer =
			                          ((org.eclipse.gmf.runtime.notation.impl.NodeImpl) (switchMediatorEditPart).getModel()).getElement();
			if (((SwitchMediator) parentContainer).getCaseBranches().size() == 0) {
				TransactionalEditingDomain domain = getEditingDomain();
				SwitchCaseBranchOutputConnector caseOutputConnector =
				                                                      EsbFactory.eINSTANCE.createSwitchCaseBranchOutputConnector();
				AddCommand addCaseConnectorCmd = new AddCommand(
				                                                domain,
				                                                parentContainer,
				                                                EsbPackage.Literals.SWITCH_MEDIATOR__CASE_BRANCHES,
				                                                caseOutputConnector);
				if (addCaseConnectorCmd.canExecute()) {
					domain.getCommandStack().execute(addCaseConnectorCmd);
				} else {
					System.out.println("Cannot Execute the command");
				}

				SwitchCaseContainer caseContainer =
				                                    EsbFactory.eINSTANCE.createSwitchCaseContainer();
				AddCommand addCmd =
				                    new AddCommand(
				                                   domain,
				                                   ((SwitchMediator) parentContainer).getSwitchContainer(),
				                                   EsbPackage.Literals.SWITCH_MEDIATOR_CONTAINER__SWITCH_CASE_CONTAINER,
				                                   caseContainer);
				if (addCmd.canExecute()) {
					domain.getCommandStack().execute(addCmd);
				} else {
					System.out.println("Cannot Execute the command");
				}
			}
		}

	}

	protected void removeChild(EditPart child) {
		// TODO Auto-generated method stub
		MediatorFlowEditPart mediatorFlow = (MediatorFlowEditPart) child.getParent().getParent();
		EditPart proxyservice =
		                        child.getParent().getParent().getParent().getParent().getParent()
		                             .getParent().getParent();
		super.removeChild(child);
		mediatorFlow.refreshOutputConnector(proxyservice);
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
