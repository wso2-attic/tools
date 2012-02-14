package org.wso2.carbonstudio.eclipse.gmf.esb.diagram.custom;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderedShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.wso2.carbonstudio.eclipse.gmf.esb.Mediator;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.AggregateMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.AggregateMediatorOnCompleteOutputConnectorEditPart;

public abstract class AbstractMediator extends AbstractBorderedShapeEditPart {		

	public boolean isForward = true;
	
	//activete method is called twice for a mediator. Reason is not detected yet.so that we use this variable to avoid calling reverse method twice.
	private boolean reversed=false;
	
	public AbstractMediator(View view) {
		super(view);
		setIsForward(!((Mediator)view.getElement()).isReverse());
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
	
	public void activate(){
		super.activate();
		if(!getIsForward())
		Reverse(this);
	}
	
	protected void Reverse(EditPart editorPart) {
		if(!reversed){
		AbstractMediator selectedEP = (AbstractMediator) editorPart;
		List<IFigure> inputConnectors = new ArrayList<IFigure>();
		List<BorderItemLocator> inputLocators = new ArrayList<BorderItemLocator>();
		List<IFigure> outputConnectors = new ArrayList<IFigure>();
		List<BorderItemLocator> outputLocators = new ArrayList<BorderItemLocator>();
		IFigure inputConnector;
		IFigure outputConnector;
		float inputCount = 0,outputCount=0;
		float inputPosition=0,outputPosition=0;
		
		
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

				inputConnector = ((AbstractInputConnector) selectedEP
						.getChildren().get(i)).getFigure();
				inputConnectors.add(inputConnector);
				NodeFigure figureInput = ((AbstractInputConnector) selectedEP
						.getChildren().get(i)).getNodeFigureInput();				
				inputPosition=inputPosition+(1/(inputCount+1));				
				if (!selectedEP.getIsForward()) {
					figureInput.removeAll();
					figureInput.add(((AbstractInputConnector) selectedEP
							.getChildren().get(i)).getPrimaryShapeReverse());

					
					BorderItemLocator inputLocator = new FixedBorderItemLocator(
							selectedEP.getMainFigure(), inputConnector,
							PositionConstants.EAST,inputPosition);

					inputLocators.add(inputLocator);
				}
				
		/*		if(selectedEP.getIsForward()){
					figureInput.removeAll();
					figureInput.add(((AbstractInputConnector) selectedEP
							.getChildren().get(i)).getPrimaryShapeForward());
					BorderItemLocator inputLocator = new FixedBorderItemLocator(
							selectedEP.getMainFigure(), inputConnector,
							PositionConstants.WEST, inputPosition);
					inputLocators.add(inputLocator);
					
				}*/
				
			}

			if (selectedEP.getChildren().get(i) instanceof AbstractOutputConnector) {

				outputConnector = ((AbstractOutputConnector) selectedEP
						.getChildren().get(i)).getFigure();
				outputConnectors.add(outputConnector);
				NodeFigure figureOutput = ((AbstractOutputConnector) selectedEP
						.getChildren().get(i)).getNodeFigureOutput();
				
				outputPosition=outputPosition+(1/(outputCount+1));
				

				if (!selectedEP.getIsForward()) {
					figureOutput.removeAll();
					figureOutput.add(((AbstractOutputConnector) selectedEP
							.getChildren().get(i)).getPrimaryShapeReverse());

					BorderItemLocator outputLocator = new FixedBorderItemLocator(
							selectedEP.getMainFigure(), outputConnector,
							PositionConstants.WEST, outputPosition);

					outputLocators.add(outputLocator);

				}
			/*	if(selectedEP.getIsForward()){
					figureOutput.removeAll();
					figureOutput.add(((AbstractOutputConnector) selectedEP
							.getChildren().get(i)).getPrimaryShapeForward());
					BorderItemLocator outputLocator = new FixedBorderItemLocator(
							selectedEP.getMainFigure(), outputConnector,
							PositionConstants.EAST, outputPosition);

					outputLocators.add(outputLocator);
					
					
					
				}*/
				
			}

		}

		//if (selectedEP.getIsForward()) {
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
		
			
			if(selectedEP.getIsForward()){
				//setText("Forward");
			
			}
			else{
				//setText("Reverse");
		
			}
			
			if(editorPart instanceof AggregateMediatorEditPart){
				IFigure parent=((IFigure)((IFigure)((AggregateMediatorEditPart)editorPart).getFigure().getChildren().get(0)).getChildren().get(0));
				IFigure temp1=(IFigure) parent.getChildren().get(0);
				IFigure temp2=(IFigure) parent.getChildren().get(1);
				parent.remove(temp1);
				parent.remove(temp2);
				GridData constraintImageRectangle1 = new GridData();
				constraintImageRectangle1.verticalAlignment = GridData.FILL_BOTH;
				constraintImageRectangle1.horizontalAlignment = GridData.END;
				constraintImageRectangle1.horizontalIndent = 0;
				constraintImageRectangle1.horizontalSpan = 0;
				constraintImageRectangle1.verticalSpan = 0;
				constraintImageRectangle1.grabExcessHorizontalSpace = true;
				constraintImageRectangle1.grabExcessVerticalSpace = true;
				parent.add(temp2);				
				
				AggregateMediatorOnCompleteOutputConnectorEditPart onCompleteEditPart=(AggregateMediatorOnCompleteOutputConnectorEditPart) ((AggregateMediatorEditPart)editorPart).getChildren().get(4);
				IFigure borderItemFigure = onCompleteEditPart.getFigure();
				
				NodeFigure figureOutput  =onCompleteEditPart.getNodeFigureOutput();
				figureOutput.removeAll();
				figureOutput.add(onCompleteEditPart.getPrimaryShapeReverse());

				BorderItemLocator locator = new FixedBorderItemLocator(
						temp1,borderItemFigure, PositionConstants.WEST, 0.5);				
				((IFigure)((IFigure)((AggregateMediatorEditPart)editorPart).getBorderedFigure()).getChildren().get(1)).add(borderItemFigure, locator);
								
				parent.add(temp1,constraintImageRectangle1);
				
				
				
			}
			
			reversed=true;
			
	}

	}

}
