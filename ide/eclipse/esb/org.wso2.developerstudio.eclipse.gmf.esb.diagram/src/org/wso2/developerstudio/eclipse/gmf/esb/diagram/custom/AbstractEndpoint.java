package org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.BorderedBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.EndpointFlowEndpointCompartmentEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.MediatorFlowMediatorFlowCompartment5EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.MediatorFlowMediatorFlowCompartmentEditPart;

public abstract class AbstractEndpoint extends BorderedBorderItemEditPart {

	// activete method is called twice for a mediator. Reason is not detected
	// yet.so that we use this variable to avoid calling reverse method twice.
	public boolean reversed = false;
	
	protected boolean connected;
	
	
	public AbstractEndpoint(View view) {
		super(view);
		// TODO Auto-generated constructor stub
	}
	public void activate() {
		super.activate();		
		if (!reversed)
			Reverse(this);		
	}
	
	public IFigure getFigure() {
		IFigure figure = super.getFigure();
		figure.setMaximumSize(new Dimension(104, 44));
		return figure;
	}
	
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(104, 44);
		result.setMinimumSize(new Dimension(104, 44));
		return result;
	}
	
	public void Reverse(EditPart editorPart) {		
		if (!reversed & ((editorPart.getParent() instanceof EndpointFlowEndpointCompartmentEditPart)&&(((AbstractMediator)editorPart.getParent().getParent().getParent()).reversed))){
			
			AbstractEndpoint selectedEP = (AbstractEndpoint) editorPart;
			List<IFigure> inputConnectors = new ArrayList<IFigure>();
			List<BorderItemLocator> inputLocators = new ArrayList<BorderItemLocator>();
			List<IFigure> additionalOutputConnectors = new ArrayList<IFigure>();
			IFigure inputConnector;
			IFigure additionalOutputConnector;
			int inputCount = 0, outputCount = 0 , additionalOutputCount=0;
			float inputPosition = 0, additionalOutputPosition=0;

			for (int i = 0; i < selectedEP.getChildren().size(); ++i) {
				if (selectedEP.getChildren().get(i) instanceof AbstractEndpointInputConnector) {
					++inputCount;
				}
				
			}

			for (int i = 0; i < selectedEP.getChildren().size(); ++i) {
				if (selectedEP.getChildren().get(i) instanceof AbstractEndpointOutputConnector) {
					++outputCount;
				}
			}
			
			for (int i = 0; i < selectedEP.getChildren().size(); ++i) {
				if (selectedEP.getChildren().get(i) instanceof AbstractEndpointAdditionalOutputConnector) {
					++additionalOutputCount;
				}
			}
			
			for (int i = 0; i < selectedEP.getChildren().size(); ++i) {
				if (selectedEP.getChildren().get(i) instanceof AbstractEndpointInputConnector) {

					inputConnector = ((AbstractEndpointInputConnector) selectedEP.getChildren().get(i))
							.getFigure();
					inputConnectors.add(inputConnector);
					NodeFigure figureInput = ((AbstractEndpointInputConnector) selectedEP.getChildren()
							.get(i)).getNodeFigureInput();
					inputPosition = (float) 0.5;

					figureInput.removeAll();
					figureInput.add(((AbstractEndpointInputConnector) selectedEP.getChildren().get(i))
							.getPrimaryShapeReverse());

					BorderItemLocator inputLocator = new FixedBorderItemLocator(
							selectedEP.getMainFigure(), inputConnector, PositionConstants.EAST,
							inputPosition);

					inputLocators.add(inputLocator);

				}

				if (selectedEP.getChildren().get(i) instanceof AbstractEndpointOutputConnector) {
					
					Collection<EObject> collection=new ArrayList<EObject>();
					collection.add(((org.eclipse.gmf.runtime.notation.impl.NodeImpl)((AbstractEndpointOutputConnector)selectedEP.getChildren().get(i)).getModel()).getElement());
					DeleteCommand deleteCommand =new DeleteCommand(getEditingDomain(),collection );
					if(deleteCommand.canExecute()){
						getEditingDomain().getCommandStack().execute(deleteCommand);
					}

				}
				
				if (selectedEP.getChildren().get(i) instanceof AbstractEndpointAdditionalOutputConnector) {
					additionalOutputConnector = ((AbstractEndpointAdditionalOutputConnector) selectedEP.getChildren().get(i))
					.getFigure();					
					additionalOutputConnectors.add(additionalOutputConnector);
					
	/*				
					additionalOutputConnector = ((AbstractEndpointAdditionalOutputConnector) selectedEP.getChildren().get(i))
							.getFigure();
					additionalOutputConnectors.add(additionalOutputConnector);
					NodeFigure figureOutput = ((AbstractEndpointAdditionalOutputConnector) selectedEP.getChildren()
							.get(i)).getNodeFigureOutput();

					additionalOutputPosition = additionalOutputPosition + (1 / (additionalOutputCount + 1));

					figureOutput.removeAll();
					figureOutput.add(((AbstractEndpointAdditionalOutputConnector) selectedEP.getChildren().get(i))
							.getPrimaryShapeReverse());

					BorderItemLocator additionalOutputLocator = new FixedBorderItemLocator(
							selectedEP.getMainFigure(), additionalOutputConnector, PositionConstants.WEST,
							additionalOutputPosition);

					additionalOutputLocators.add(additionalOutputLocator);*/

				}

			}
			for (int j = 0; j < inputConnectors.size(); ++j) {
				selectedEP.getBorderedFigure().getBorderItemContainer()
						.remove(inputConnectors.get(j));
				selectedEP.getBorderedFigure().getBorderItemContainer()
						.add(inputConnectors.get(j), inputLocators.get(j));

			}
			
			for(int j=0;j<additionalOutputConnectors.size();++j){
				IFigure borderItemFigure =additionalOutputConnectors.get(j);
				selectedEP.getBorderedFigure().getBorderItemContainer().add(borderItemFigure,
			               new EvenlyDividedFixedBorderItemLocator(
			                                                       getMainFigure(),
			                                                       borderItemFigure,
			                                                       PositionConstants.WEST,
			                                                       ((DefaultSizeCaseBranchPointerNodeFigure) borderItemFigure).getId(),
			                                                       additionalOutputCount));
			}
			reversed = true;
			
		}
	}
	
	protected void getMostSuitableElementToConnect(){
		if(this.getParent() instanceof MediatorFlowMediatorFlowCompartmentEditPart){
			((MediatorFlowMediatorFlowCompartmentEditPart)this.getParent()).connectNormally(this);
		}else if(this.getParent() instanceof MediatorFlowMediatorFlowCompartment5EditPart){
			((MediatorFlowMediatorFlowCompartment5EditPart)this.getParent()).connectNormally(this);
		}
	}

}
