package org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.DeferredCreateConnectionViewAndElementCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderedShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateConnectionViewAndElementRequest;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.wso2.developerstudio.eclipse.gmf.esb.AbstractEndPoint;
import org.wso2.developerstudio.eclipse.gmf.esb.Mediator;
import org.wso2.developerstudio.eclipse.gmf.esb.SequenceInputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.SequenceOutputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.connections.ConnectionCalculator;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.utils.MediatorFigureReverser;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.AggregateMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.CacheMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.CloneMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.EsbLinkEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.FilterMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.IterateMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.MediatorFlowMediatorFlowCompartment10EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.MediatorFlowMediatorFlowCompartment11EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.MediatorFlowMediatorFlowCompartment12EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.MediatorFlowMediatorFlowCompartment13EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.MediatorFlowMediatorFlowCompartment14EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.MediatorFlowMediatorFlowCompartment2EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.MediatorFlowMediatorFlowCompartment3EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.MediatorFlowMediatorFlowCompartment4EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.MediatorFlowMediatorFlowCompartment5EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.MediatorFlowMediatorFlowCompartment6EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.MediatorFlowMediatorFlowCompartment7EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.MediatorFlowMediatorFlowCompartment8EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.MediatorFlowMediatorFlowCompartment9EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.MediatorFlowMediatorFlowCompartmentEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.SendMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.SequenceEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.SequenceInputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.SequenceOutputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.SwitchMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.ThrottleMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.ValidateMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.providers.EsbElementTypes;

public abstract class AbstractMediator extends AbstractBorderedShapeEditPart {

	public boolean isForward = true;
	private int i = 0;
	
	private AbstractBorderedShapeEditPart sourceEditPart = null;
	private AbstractOutputConnector sourceOutputConnector = null;
	private AbstractInputConnector inputConnector = null;
	private AbstractOutputConnector outputConnectorEditPart = null;

	/*
	 * activete method is called twice for a mediator.so that we use this
	 * variable to avoid calling reverse method twice.
	 */
	public boolean reversed = false;

	public AbstractMediator(View view) {
		super(view);
		setIsForward(!((Mediator) view.getElement()).isReverse());
	}

	protected NodeFigure createMainFigure() {
		return null;
	}

	public boolean getIsForward() {
		return isForward;
	}

	public void setIsForward(boolean isForward_) {
		isForward = isForward_;
	}

	public void activate() {
		boolean shouldMoveRight = false;
		super.activate();
		if (!reversed) {
			Reverse(this);
		}
		/*
		 * activate method is being called twice. At the first time most of the
		 * child figures has not been initialized. So that we should call
		 * MediatorFigureReverser.reverse(EditPart, boolean) at the second time.
		 */
		if ((i == 1)&& this.reversed) {
			MediatorFigureReverser.reverse(this, true);
		}
		if(this instanceof SequenceEditPart) {
			SequenceInputConnectorEditPart seqInputConnectorEditPart=(SequenceInputConnectorEditPart)((SequenceEditPart)this).getChildren().get(1);
			SequenceInputConnector seqInputConnector=(SequenceInputConnector)((org.eclipse.gmf.runtime.notation.impl.NodeImpl)(seqInputConnectorEditPart).getModel()).getElement();
			SequenceOutputConnectorEditPart seqOutputConnectorEditPart=(SequenceOutputConnectorEditPart)((SequenceEditPart)this).getChildren().get(2);
			SequenceOutputConnector seqOutputConnector=(SequenceOutputConnector)((org.eclipse.gmf.runtime.notation.impl.NodeImpl)(seqOutputConnectorEditPart).getModel()).getElement();
			if((seqInputConnector.getIncomingLinks().size() !=0) && (seqInputConnector.getIncomingLinks().get(0).getSource().eContainer() instanceof AbstractEndPoint)){
				if((seqOutputConnector.getOutgoingLink() !=null) && (seqOutputConnector.getOutgoingLink().getTarget().eContainer() instanceof AbstractEndPoint)){
					shouldMoveRight=true;
				}
			}
		}		
		
		if ((i == 1)&& (this instanceof SequenceEditPart)&& shouldMoveRight){
			((SequenceEditPart)this).moveConnectorsRightSide();
		}
		++i;
	}
	
	private boolean shouldReverse() {
		for(int i=0;i<this.getChildren().size();++i){
			if (this.getChildren().get(i) instanceof AbstractInputConnector) {
				AbstractInputConnector inputConnector = (AbstractInputConnector) this.getChildren().get(i);
				if (inputConnector.getTargetConnections().size() != 0) {
					EditPart link = ((EsbLinkEditPart) inputConnector
							.getTargetConnections().get(0)).getSource();
					if ((link instanceof AbstractOutputConnector)
							&& (((AbstractOutputConnector) link).getParent() instanceof AbstractMediator)
							&& (((AbstractMediator) ((AbstractOutputConnector) link)
									.getParent()).reversed)
							|| (link instanceof AbstractEndpointOutputConnector)) {
						return true;
					}
				}
			}
		}
		return false;
	}
	
	public void Reverse(EditPart editorPart) {

		if (!reversed
				& (/*(editorPart.getParent() instanceof MediatorFlowMediatorFlowCompartmentEditPart)
						| */(editorPart.getParent() instanceof MediatorFlowMediatorFlowCompartment6EditPart)
						| ((editorPart.getParent() instanceof MediatorFlowMediatorFlowCompartment3EditPart)
								&& (editorPart.getParent().getParent().getParent() instanceof AggregateMediatorEditPart) && (((AbstractMediator) editorPart
								.getParent().getParent().getParent()).reversed))
						| (((editorPart.getParent() instanceof MediatorFlowMediatorFlowCompartment2EditPart) | (editorPart
								.getParent() instanceof MediatorFlowMediatorFlowCompartment4EditPart))
								&& (editorPart.getParent().getParent().getParent().getParent()
										.getParent() instanceof SwitchMediatorEditPart) && (((AbstractMediator) editorPart
								.getParent().getParent().getParent().getParent().getParent()).reversed))
						| (((editorPart.getParent() instanceof MediatorFlowMediatorFlowCompartment7EditPart) | (editorPart
								.getParent() instanceof MediatorFlowMediatorFlowCompartment8EditPart))
								&& (editorPart.getParent().getParent().getParent().getParent()
										.getParent() instanceof FilterMediatorEditPart) && (((AbstractMediator) editorPart
								.getParent().getParent().getParent().getParent().getParent()).reversed))								
						| ((editorPart.getParent() instanceof MediatorFlowMediatorFlowCompartment11EditPart)
								&&(editorPart.getParent().getParent().getParent().getParent()
								.getParent() instanceof CloneMediatorEditPart)&&(((AbstractMediator) editorPart
										.getParent().getParent().getParent().getParent().getParent()).reversed))											
						| ((editorPart.getParent() instanceof MediatorFlowMediatorFlowCompartment12EditPart)
								&& (editorPart.getParent().getParent().getParent() instanceof IterateMediatorEditPart) && (((AbstractMediator) editorPart
								.getParent().getParent().getParent()).reversed))										
						| (((editorPart.getParent() instanceof MediatorFlowMediatorFlowCompartment9EditPart) | (editorPart
					        	.getParent() instanceof MediatorFlowMediatorFlowCompartment10EditPart))
					        	&& (editorPart.getParent().getParent().getParent().getParent().getParent() instanceof ThrottleMediatorEditPart) && (((AbstractMediator) editorPart
					                	.getParent().getParent().getParent().getParent().getParent()).reversed))
					    | ((editorPart.getParent() instanceof MediatorFlowMediatorFlowCompartment13EditPart)
					    		&& (editorPart.getParent().getParent().getParent() instanceof CacheMediatorEditPart) && (((AbstractMediator) editorPart
										.getParent().getParent().getParent()).reversed))    
					    | ((editorPart.getParent() instanceof MediatorFlowMediatorFlowCompartment14EditPart)
					    		&& (editorPart.getParent().getParent().getParent() instanceof ValidateMediatorEditPart) && (((AbstractMediator) editorPart
										.getParent().getParent().getParent()).reversed))
					                	|(shouldReverse()))) {

			AbstractMediator selectedEP = (AbstractMediator) editorPart;
			List<IFigure> inputConnectors = new ArrayList<IFigure>();
			List<BorderItemLocator> inputLocators = new ArrayList<BorderItemLocator>();
			List<IFigure> outputConnectors = new ArrayList<IFigure>();
			List<BorderItemLocator> outputLocators = new ArrayList<BorderItemLocator>();
			IFigure inputConnector;
			IFigure outputConnector;
			float inputCount = 0, outputCount = 0;
			float inputPosition = 0, outputPosition = 0;

			for (int i = 0; i < selectedEP.getChildren().size(); ++i) {
				if (selectedEP.getChildren().get(i) instanceof AbstractInputConnector) {
					++inputCount;
				}
			}

			for (int i = 0; i < selectedEP.getChildren().size(); ++i) {
				if (selectedEP.getChildren().get(i) instanceof AbstractOutputConnector) {
					++outputCount;
				}
			}

			for (int i = 0; i < selectedEP.getChildren().size(); ++i) {
				if (selectedEP.getChildren().get(i) instanceof AbstractInputConnector) {

					inputConnector = ((AbstractInputConnector) selectedEP.getChildren().get(i))
							.getFigure();
					inputConnectors.add(inputConnector);
					NodeFigure figureInput = ((AbstractInputConnector) selectedEP.getChildren()
							.get(i)).getNodeFigureInput();
					inputPosition = inputPosition + (1 / (inputCount + 1));

					figureInput.removeAll();
					figureInput.add(((AbstractInputConnector) selectedEP.getChildren().get(i))
							.getPrimaryShapeReverse());

					BorderItemLocator inputLocator = new FixedBorderItemLocator(
							selectedEP.getMainFigure(), inputConnector, PositionConstants.EAST,
							inputPosition);

					inputLocators.add(inputLocator);

				}

				if (selectedEP.getChildren().get(i) instanceof AbstractOutputConnector) {

					outputConnector = ((AbstractOutputConnector) selectedEP.getChildren().get(i))
							.getFigure();
					outputConnectors.add(outputConnector);
					NodeFigure figureOutput = ((AbstractOutputConnector) selectedEP.getChildren()
							.get(i)).getNodeFigureOutput();

					outputPosition = outputPosition + (1 / (outputCount + 1));

					figureOutput.removeAll();
					figureOutput.add(((AbstractOutputConnector) selectedEP.getChildren().get(i))
							.getPrimaryShapeReverse());

					BorderItemLocator outputLocator = new FixedBorderItemLocator(
							selectedEP.getMainFigure(), outputConnector, PositionConstants.WEST,
							outputPosition);

					outputLocators.add(outputLocator);

				}

			}

			for (int j = 0; j < inputConnectors.size(); ++j) {
				selectedEP.getBorderedFigure().getBorderItemContainer()
						.remove(inputConnectors.get(j));
				selectedEP.getBorderedFigure().getBorderItemContainer()
						.add(inputConnectors.get(j), inputLocators.get(j));

			}
			for (int j = 0; j < outputConnectors.size(); ++j) {
				selectedEP.getBorderedFigure().getBorderItemContainer()
						.remove(outputConnectors.get(j));
				selectedEP.getBorderedFigure().getBorderItemContainer()
						.add(outputConnectors.get(j), outputLocators.get(j));

			}

			reversed = true;
			if (checkComplexity()) {
				MediatorFigureReverser.reverse(editorPart, false);
			}
			
		}
		
	}	
	
	protected void getMostSuitableElementToConnect() {
		ArrayList<EsbLinkEditPart> ESBLinkEditpart = new ArrayList<EsbLinkEditPart>();
		for (int i = 0; i < getViewer().getEditPartRegistry().size(); ++i) {
			if (getViewer().getEditPartRegistry().values().toArray()[i] instanceof EsbLinkEditPart) {
				ESBLinkEditpart.add((EsbLinkEditPart) getViewer()
						.getEditPartRegistry().values().toArray()[i]);
			}
		}
		EsbLinkEditPart nearestESBLink = ConnectionCalculator
				.getNearestLinkEditPart(ESBLinkEditpart, this);	
		
		
		AbstractBorderItemEditPart outputConnector = null;
		AbstractBorderItemEditPart inputConnector = null;
		AbstractInputConnector currentInputConnector = null;
		AbstractOutputConnector currentOutputConnector = null;
		if (nearestESBLink != null) {			
			outputConnector = (AbstractBorderItemEditPart) nearestESBLink
					.getSource();
			inputConnector = (AbstractBorderItemEditPart) nearestESBLink
					.getTarget();
		}else{
			if(this.getParent() instanceof MediatorFlowMediatorFlowCompartmentEditPart){
				((MediatorFlowMediatorFlowCompartmentEditPart)this.getParent()).connectNormally(this);
			}else if(this.getParent() instanceof MediatorFlowMediatorFlowCompartment5EditPart){
				((MediatorFlowMediatorFlowCompartment5EditPart)this.getParent()).connectNormally(this);
			}else if(this.getParent() instanceof MediatorFlowMediatorFlowCompartment6EditPart){
				((MediatorFlowMediatorFlowCompartment6EditPart)this.getParent()).connectNormally(this);
			}
		}

		for (int p = 0; p < this.getChildren().size(); ++p) {
			if (this.getChildren().get(p) instanceof AbstractInputConnector) {
				currentInputConnector = (AbstractInputConnector) this
						.getChildren().get(p);
			}
		}

		for (int j = 0; j < this.getChildren().size(); ++j) {
			if (this.getChildren().get(j) instanceof AbstractOutputConnector) {
				currentOutputConnector = (AbstractOutputConnector) this
						.getChildren().get(j);
			}
		}

		if (nearestESBLink != null) {
			Collection col = new ArrayList();
			col.add(((org.eclipse.gmf.runtime.notation.impl.ConnectorImpl) nearestESBLink
					.getModel()).getElement());

			org.eclipse.emf.edit.command.DeleteCommand del = new org.eclipse.emf.edit.command.DeleteCommand(
					getEditingDomain(), col);
			if (del.canExecute()) {
				getEditingDomain().getCommandStack().execute(del);
			}

		}

		if (ConnectionCalculator.getNearestLinkEditPart(ESBLinkEditpart, this) != null) {
			DeleteCommand delCmd = new DeleteCommand(ConnectionCalculator
					.getNearestLinkEditPart(ESBLinkEditpart, this)
					.getNotationView());
			CompoundCommand dl = new CompoundCommand("Delete Link");
			dl.add(new ICommandProxy(delCmd));
			if (delCmd.canExecute()) {
				getDiagramEditDomain().getDiagramCommandStack().execute(dl);
			}
		}

		if (outputConnector != null && currentInputConnector != null
				&& (outputConnector.getParent() instanceof ShapeNodeEditPart)) {
			CompoundCommand cc = new CompoundCommand("Create Link");

			ICommand createSubTopicsCmd = new DeferredCreateConnectionViewAndElementCommand(
					new CreateConnectionViewAndElementRequest(
							EsbElementTypes.EsbLink_4001,
							((IHintedType) EsbElementTypes.EsbLink_4001)
									.getSemanticHint(),
							((ShapeNodeEditPart) outputConnector.getParent())
									.getDiagramPreferencesHint()),
					new EObjectAdapter((EObject) outputConnector.getModel()),
					new EObjectAdapter((EObject) currentInputConnector
							.getModel()),
					((ShapeNodeEditPart) outputConnector.getParent())
							.getViewer());

			cc.add(new ICommandProxy(createSubTopicsCmd));
			getDiagramEditDomain().getDiagramCommandStack().execute(cc);

		}

		if (currentOutputConnector != null
				&& inputConnector != null
				&& (currentOutputConnector.getParent() instanceof AbstractMediator)) {
			CompoundCommand cc = new CompoundCommand("Create Link");

			ICommand createSubTopicsCmd = new DeferredCreateConnectionViewAndElementCommand(
					new CreateConnectionViewAndElementRequest(
							EsbElementTypes.EsbLink_4001,
							((IHintedType) EsbElementTypes.EsbLink_4001)
									.getSemanticHint(),
							((AbstractMediator) currentOutputConnector
									.getParent()).getDiagramPreferencesHint()),
					new EObjectAdapter((EObject) currentOutputConnector
							.getModel()), new EObjectAdapter(
							(EObject) inputConnector.getModel()),
					((AbstractMediator) currentOutputConnector.getParent())
							.getViewer());

			cc.add(new ICommandProxy(createSubTopicsCmd));
			getDiagramEditDomain().getDiagramCommandStack().execute(cc);

		}

	}

	private boolean checkComplexity() {
		if ((this instanceof AggregateMediatorEditPart) || (this instanceof SwitchMediatorEditPart)
				|| (this instanceof FilterMediatorEditPart)
				|| (this instanceof ThrottleMediatorEditPart)
				|| (this instanceof CacheMediatorEditPart)
				|| (this instanceof CloneMediatorEditPart)
				|| (this instanceof IterateMediatorEditPart)
				|| (this instanceof ValidateMediatorEditPart)) {
			return true;
		} else {
			return false;
		}
	}
}
