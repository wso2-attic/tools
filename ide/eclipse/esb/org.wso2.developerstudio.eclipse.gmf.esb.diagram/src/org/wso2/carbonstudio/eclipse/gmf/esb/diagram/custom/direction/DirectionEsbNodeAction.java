package org.wso2.carbonstudio.eclipse.gmf.esb.diagram.custom.direction;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.editparts.AbstractEditPart;
import org.eclipse.gmf.runtime.common.ui.action.AbstractActionHandler;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.ocl.ecore.IfExp;
import org.eclipse.swt.graphics.Color;
import org.eclipse.ui.IWorkbenchPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.EsbPackage;
import org.wso2.carbonstudio.eclipse.gmf.esb.Mediator;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.custom.AbstractInputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.custom.AbstractMediator;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.custom.AbstractOutputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.custom.FixedBorderItemLocator;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.AggregateMediatorAggregateCompartmentEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.AggregateMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.AggregateMediatorOnCompleteOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.AggregateMediatorOnCompleteOutputConnectorEditPart.EastPointerFigure;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.LogMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.LogMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.LogMediatorOutputConnectorEditPart;

public class DirectionEsbNodeAction  extends AbstractActionHandler {

	protected DirectionEsbNodeAction(IWorkbenchPart part) {
		super(part);
		// TODO Auto-generated constructor stub
	}

	
	public void refresh() {
		// TODO Auto-generated method stub
		
	}

	
	protected void doRun(IProgressMonitor progressMonitor) {
		// TODO Auto-generated method stub
		
	}
	
	public void setEditorPart(EditPart editorPart_){
		
	}
	
	
	protected void Reverse(EditPart editorPart) {

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
				if (selectedEP.getIsForward()) {
					figureInput.removeAll();
					figureInput.add(((AbstractInputConnector) selectedEP
							.getChildren().get(i)).getPrimaryShapeReverse());

					
					BorderItemLocator inputLocator = new FixedBorderItemLocator(
							selectedEP.getMainFigure(), inputConnector,
							PositionConstants.EAST,inputPosition);

					inputLocators.add(inputLocator);
				}
				
				if(!selectedEP.getIsForward()){
					figureInput.removeAll();
					figureInput.add(((AbstractInputConnector) selectedEP
							.getChildren().get(i)).getPrimaryShapeForward());
					BorderItemLocator inputLocator = new FixedBorderItemLocator(
							selectedEP.getMainFigure(), inputConnector,
							PositionConstants.WEST, inputPosition);
					inputLocators.add(inputLocator);
					
				}
				
			}

			if (selectedEP.getChildren().get(i) instanceof AbstractOutputConnector) {

				outputConnector = ((AbstractOutputConnector) selectedEP
						.getChildren().get(i)).getFigure();
				outputConnectors.add(outputConnector);
				NodeFigure figureOutput = ((AbstractOutputConnector) selectedEP
						.getChildren().get(i)).getNodeFigureOutput();
				
				outputPosition=outputPosition+(1/(outputCount+1));
				

				if (selectedEP.getIsForward()) {
					figureOutput.removeAll();
					figureOutput.add(((AbstractOutputConnector) selectedEP
							.getChildren().get(i)).getPrimaryShapeReverse());

					BorderItemLocator outputLocator = new FixedBorderItemLocator(
							selectedEP.getMainFigure(), outputConnector,
							PositionConstants.WEST, outputPosition);

					outputLocators.add(outputLocator);

				}
				if(!selectedEP.getIsForward()){
					figureOutput.removeAll();
					figureOutput.add(((AbstractOutputConnector) selectedEP
							.getChildren().get(i)).getPrimaryShapeForward());
					BorderItemLocator outputLocator = new FixedBorderItemLocator(
							selectedEP.getMainFigure(), outputConnector,
							PositionConstants.EAST, outputPosition);

					outputLocators.add(outputLocator);
					
					
					
				}
				
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
				setText("Forward");
				selectedEP.setIsForward(false);
				SetCommand command = new SetCommand(selectedEP.getEditingDomain(), (Mediator)((org.eclipse.gmf.runtime.notation.impl.NodeImpl)selectedEP.getModel()).getElement(), EsbPackage.Literals.MEDIATOR__REVERSE, true);				
				if (command.canExecute()){
					selectedEP.getEditingDomain().getCommandStack().execute(command);
				} else {
					System.out.println("Cannot Execute the command");
				}
				
			}
			else{
				setText("Reverse");
				selectedEP.setIsForward(true);
				SetCommand command = new SetCommand(selectedEP.getEditingDomain(), (Mediator)((org.eclipse.gmf.runtime.notation.impl.NodeImpl)selectedEP.getModel()).getElement(), EsbPackage.Literals.MEDIATOR__REVERSE, false);				
				if (command.canExecute()){
					selectedEP.getEditingDomain().getCommandStack().execute(command);
				} else {
					System.out.println("Cannot Execute the command");
				}
			}

		//}

		/*
		 * IFigure inputConnector=
		 * ((AbstractInputConnector)selectedEP.getChildren
		 * ().get(1)).getFigure();
		 * 
		 * IFigure outputConnector
		 * =((AbstractOutputConnector)selectedEP.getChildren
		 * ().get(2)).getFigure();
		 * 
		 * NodeFigure
		 * figureInput=((AbstractInputConnector)selectedEP.getChildren
		 * ().get(1)).figure_; NodeFigure
		 * figureOutput=((AbstractOutputConnector)
		 * selectedEP.getChildren().get(2)).figure_;
		 * 
		 * 
		 * 
		 * 
		 * AbstractEditPart selectedEP = (AbstractEditPart) editorPart; IFigure
		 * inputConnector=
		 * ((LogMediatorInputConnectorEditPart)selectedEP.getChildren
		 * ().get(1)).getFigure();
		 * 
		 * AbstractGraphicalEditPart
		 * 
		 * else{}
		 */
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
		
			
	}
}
 