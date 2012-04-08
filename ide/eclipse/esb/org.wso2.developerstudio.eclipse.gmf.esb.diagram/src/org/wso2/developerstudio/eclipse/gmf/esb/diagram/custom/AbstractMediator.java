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
import org.wso2.developerstudio.eclipse.gmf.esb.Mediator;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.ProxyServiceFaultContainerProxyServiceFaultSequenceCompartmentEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.ProxyServiceOutSequenceProxyServiceOutSequenceCompartmentEditPart;

public abstract class AbstractMediator extends AbstractBorderedShapeEditPart {

	public boolean isForward = true;

	// activete method is called twice for a mediator. Reason is not detected
	// yet.so that we use this variable to avoid calling reverse method twice.
	private boolean reversed = false;

	public AbstractMediator(View view) {
		super(view);
		setIsForward(!((Mediator) view.getElement()).isReverse());
		// TODO Auto-generated constructor stub
	}

	protected NodeFigure createMainFigure() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean getIsForward() {
		return isForward;
	}

	public void setIsForward(boolean isForward_) {
		// TODO Auto-generated method stub
		isForward = isForward_;
	}

	public void activate() {
		super.activate();
		if (!reversed)
			Reverse(this);

	}

	public void Reverse(EditPart editorPart) {
		if (!reversed
				& ((editorPart.getParent() instanceof ProxyServiceOutSequenceProxyServiceOutSequenceCompartmentEditPart)|
						(editorPart.getParent() instanceof ProxyServiceFaultContainerProxyServiceFaultSequenceCompartmentEditPart))) {

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
		}

	}

}
