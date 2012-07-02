package org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderedShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.wso2.developerstudio.eclipse.gmf.esb.CloneMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.Mediator;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.utils.MediatorFigureReverser;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.AggregateMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.CloneMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.FilterMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.IterateMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.MediatorFlowMediatorFlowCompartment10EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.MediatorFlowMediatorFlowCompartment11EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.MediatorFlowMediatorFlowCompartment12EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.MediatorFlowMediatorFlowCompartment2EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.MediatorFlowMediatorFlowCompartment3EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.MediatorFlowMediatorFlowCompartment4EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.MediatorFlowMediatorFlowCompartment5EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.MediatorFlowMediatorFlowCompartment6EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.MediatorFlowMediatorFlowCompartment7EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.MediatorFlowMediatorFlowCompartment8EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.MediatorFlowMediatorFlowCompartment9EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.SendMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.SwitchMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.ThrottleMediatorEditPart;

public abstract class AbstractMediator extends AbstractBorderedShapeEditPart {

	public boolean isForward = true;

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
		super.activate();
		if (!reversed) {
			Reverse(this);
		}
	}

	public void Reverse(EditPart editorPart) {

		if (!reversed
				& ((editorPart.getParent() instanceof MediatorFlowMediatorFlowCompartment5EditPart)
						| (editorPart.getParent() instanceof MediatorFlowMediatorFlowCompartment6EditPart)
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
					                	.getParent().getParent().getParent().getParent().getParent()).reversed)))) {

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
				MediatorFigureReverser.reverse(this, false);
			}
		}
	}

	private boolean checkComplexity() {
		if ((this instanceof AggregateMediatorEditPart) || (this instanceof SwitchMediatorEditPart)
				|| (this instanceof FilterMediatorEditPart)
				|| (this instanceof ThrottleMediatorEditPart)
				|| (this instanceof SendMediatorEditPart)
				|| (this instanceof CloneMediatorEditPart)
				|| (this instanceof IterateMediatorEditPart)) {
			return true;
		} else {
			return false;
		}
	}
}
