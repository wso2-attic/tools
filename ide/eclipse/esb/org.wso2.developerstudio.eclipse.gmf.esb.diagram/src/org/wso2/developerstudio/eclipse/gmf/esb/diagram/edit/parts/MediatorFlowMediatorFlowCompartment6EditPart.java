package org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.internal.ui.palette.editparts.ToolEntryEditPart;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.DeferredCreateConnectionViewAndElementCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderedShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateConnectionViewAndElementRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.StructuredSelection;
import org.wso2.developerstudio.eclipse.gmf.esb.Sequence;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.AbstractEndpoint;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.AbstractEndpointInputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.AbstractEndpointOutputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.AbstractInputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.AbstractMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.AbstractOutputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.editpolicy.CustomDragDropEditPolicy;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.utils.SwitchMediatorUtils;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.policies.MediatorFlowMediatorFlowCompartment6CanonicalEditPolicy;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.policies.MediatorFlowMediatorFlowCompartment6ItemSemanticEditPolicy;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.Messages;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbPaletteFactory.NodeToolEntry;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.providers.EsbElementTypes;

/**
 * @generated
 */
public class MediatorFlowMediatorFlowCompartment6EditPart extends
		ShapeCompartmentEditPart {

	//ProxyService FaultSequence.
	
	AbstractBorderItemEditPart sourceOutputConnector = null;
	AbstractBorderItemEditPart inputConnectorEditPart = null;
	AbstractBorderItemEditPart sourceInputConnector = null;
	ShapeNodeEditPart sourceEditPart = null;
	
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
	 * @generated NOT
	 */
	public String getCompartmentName() {
		return "Fault Sequence";
		//return Messages.MediatorFlowMediatorFlowCompartment6EditPart_title;
	}

	/**
	 * @generated NOT
	 */
	public IFigure createFigure() {
		ResizableCompartmentFigure result = (ResizableCompartmentFigure) super
				.createFigure();
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
		((MediatorFlow6EditPart) child.getParent().getParent())
				.refreshInputConnector(child.getParent().getParent()
						.getParent().getParent().getParent());

		if (child instanceof SwitchMediatorEditPart) {
			SwitchMediatorEditPart switchMediatorEditPart = (SwitchMediatorEditPart) child;
			SwitchMediatorUtils.addCaseBranchInitially(switchMediatorEditPart,
					getEditingDomain());
		}
		
		if (child instanceof SequenceEditPart) {
			SequenceEditPart sequenceEditPart = (SequenceEditPart) child;
			EditPart editpart = (EditPart) ((StructuredSelection) sequenceEditPart
					.getViewer().getEditDomain().getPaletteViewer()
					.getSelection()).getFirstElement();
			if (editpart instanceof ToolEntryEditPart) {
				if (((ToolEntryEditPart) editpart).getModel() instanceof NodeToolEntry) {
					String label = ((NodeToolEntry) ((ToolEntryEditPart) editpart)
							.getModel()).getLabel();
					if ((!label.equals("")) && (!label.equals("Sequence"))) {
						((Sequence) ((View) sequenceEditPart.getModel())
								.getElement()).setName(label);
					}
				} else if (((ToolEntryEditPart) editpart).getModel() instanceof org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.SequenceEditPart.NodeToolEntry) {
					String label = ((org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.SequenceEditPart.NodeToolEntry) ((ToolEntryEditPart) editpart)
							.getModel()).getLabel();
					if ((!label.equals("")) && (!label.equals("Sequence"))) {
						((Sequence) ((View) sequenceEditPart.getModel())
								.getElement()).setName(label);
					}
				}
			}
		}
	}

	protected void removeChild(EditPart child) {
		// TODO Auto-generated method stub
		MediatorFlow6EditPart mediatorFlow = (MediatorFlow6EditPart) child
				.getParent().getParent();
		EditPart proxyService = child.getParent().getParent().getParent()
				.getParent().getParent();
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
	
	public void connectNormally(EditPart child){		

		if ((child instanceof AbstractMediator)||(child instanceof AbstractEndpoint)) {

			for (int i = 0; i < child.getChildren().size(); ++i) {
				if (child.getChildren().get(i) instanceof AbstractInputConnector) {
					sourceInputConnector = (AbstractInputConnector) child
							.getChildren().get(i);
				}
				if (child.getChildren().get(i) instanceof AbstractOutputConnector) {
					sourceOutputConnector = (AbstractOutputConnector) child
							.getChildren().get(i);
				}
				if(child.getChildren().get(i) instanceof AbstractEndpointInputConnector){
					sourceInputConnector = (AbstractEndpointInputConnector) child
					.getChildren().get(i);
				}
				if (child.getChildren().get(i) instanceof AbstractEndpointOutputConnector) {
					sourceOutputConnector = (AbstractEndpointOutputConnector) child
							.getChildren().get(i);
				}

			}
			if (inputConnectorEditPart == null) {
				inputConnectorEditPart = ((AbstractInputConnector) this
						.getParent().getParent().getParent().getParent()
						.getChildren().get(3));
			}
			sourceEditPart=(ShapeNodeEditPart) child;

			CompoundCommand cc = new CompoundCommand("Create Link");

			if (sourceOutputConnector != null) {
				ICommand createSubTopicsCmd = new DeferredCreateConnectionViewAndElementCommand(
						new CreateConnectionViewAndElementRequest(
								EsbElementTypes.EsbLink_4001,
								((IHintedType) EsbElementTypes.EsbLink_4001)
										.getSemanticHint(),
								sourceEditPart.getDiagramPreferencesHint()),
						new EObjectAdapter((EObject) sourceOutputConnector
								.getModel()), new EObjectAdapter(
								(EObject) (inputConnectorEditPart).getModel()),
						sourceEditPart.getViewer());

				cc.add(new ICommandProxy(createSubTopicsCmd));

				getDiagramEditDomain().getDiagramCommandStack().execute(cc);
			}

			inputConnectorEditPart = sourceInputConnector;
		}
	}

}
