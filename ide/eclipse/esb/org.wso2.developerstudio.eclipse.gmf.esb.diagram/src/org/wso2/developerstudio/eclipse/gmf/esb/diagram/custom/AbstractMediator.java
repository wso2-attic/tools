/*
 * Copyright WSO2, Inc. (http://wso2.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.FigureCanvas;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.impl.EAttributeImpl;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderedShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.notation.impl.BoundsImpl;
import org.wso2.developerstudio.eclipse.gmf.esb.AbstractEndPoint;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbLink;
import org.wso2.developerstudio.eclipse.gmf.esb.Mediator;
import org.wso2.developerstudio.eclipse.gmf.esb.OutputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.SequenceInputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.SequenceOutputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.connections.ConnectionCalculator;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.layout.XYRepossition;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.utils.MediatorFigureReverser;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.APIResourceOutputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.AggregateMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.CacheMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.CloneMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.ConditionalRouterMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.EsbLinkEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.FilterMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.IterateMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.MediatorFlowMediatorFlowCompartment10EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.MediatorFlowMediatorFlowCompartment11EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.MediatorFlowMediatorFlowCompartment12EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.MediatorFlowMediatorFlowCompartment13EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.MediatorFlowMediatorFlowCompartment14EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.MediatorFlowMediatorFlowCompartment15EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.MediatorFlowMediatorFlowCompartment16EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.MediatorFlowMediatorFlowCompartment17EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.MediatorFlowMediatorFlowCompartment2EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.MediatorFlowMediatorFlowCompartment3EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.MediatorFlowMediatorFlowCompartment4EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.MediatorFlowMediatorFlowCompartment5EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.MediatorFlowMediatorFlowCompartment6EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.MediatorFlowMediatorFlowCompartment7EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.MediatorFlowMediatorFlowCompartment8EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.MediatorFlowMediatorFlowCompartment9EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.MediatorFlowMediatorFlowCompartmentEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.ProxyFaultInputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.ProxyInputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.ProxyOutputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.RouterMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.RuleMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.SequenceEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.SequenceInputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.SequenceOutputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.SequencesOutputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.SwitchMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.ThrottleMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.ValidateMediatorEditPart;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.swt.widgets.Display;

public abstract class AbstractMediator extends AbstractBorderedShapeEditPart {

	public boolean isForward = true;
	private int i = 0;
	
	public int x;
	public int y;
	
	private AbstractInputConnectorEditPart connectedInputConnector;
	private AbstractOutputConnectorEditPart connectedOutputConnector;
	private AbstractMediator instance=null;

	/*
	 * activete method is called twice for a mediator.so that we use this
	 * variable to avoid calling reverse method twice.
	 */
	public boolean reversed = false;

	public AbstractMediator(View view) {
		super(view);
		setIsForward(!((Mediator) view.getElement()).isReverse());
		instance=this;
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
	
	public AbstractInputConnectorEditPart getConnectedInputConnector(){
		return connectedInputConnector;
	}
	
	public AbstractOutputConnectorEditPart getConnectedOutputConnector(){
		return connectedOutputConnector;
	}
	
	public void setConnectedInputConnector(AbstractInputConnectorEditPart connectedInputConnector){
		this.connectedInputConnector=connectedInputConnector;
	}
	
	public void setConnectedOutputConnector(AbstractOutputConnectorEditPart connectedOutputConnector){
		this.connectedOutputConnector=connectedOutputConnector;
	}

	public void activate() {
		boolean shouldMoveRight = false;
		super.activate();
		if (!reversed) {
			reverse(this);
		}
		/*
		 * activate method is being called twice. At the first time most of the
		 * child figures has not been initialized. So that we should call
		 * MediatorFigureReverser.reverse(EditPart, boolean) at the second time.
		 */
		if ((i == 1)&& this.reversed) {
			MediatorFigureReverser.reverse(this, true);
		}
		if((i == 1)&&(this instanceof SequenceEditPart)) {
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
	
	 public void notifyChanged(Notification notification) {
		 	super.notifyChanged(notification);
		 	if (notification.getFeature() instanceof EAttributeImpl) {
		 		if (notification.getNotifier() instanceof BoundsImpl) {
		 			if (x != 0 && y != 0) {
		 			rePosition(x,y,
		 					((BoundsImpl) notification.getNotifier()).getWidth(),
		 					((BoundsImpl) notification.getNotifier()).getHeight());
		 			FigureCanvas canvas = (FigureCanvas) getViewer().getControl();
		 			canvas.getViewport().repaint();
		 			}
		 		}
		 	}
		 }

	private void rePosition(int x,int y, int width, int height) {
		Rectangle constraints = new Rectangle(x, y, width, height);
		((GraphicalEditPart) getParent()).setLayoutConstraint(this, getFigure(), constraints);
	}
		 
	protected void reAllocate(Rectangle bounds){
		Display.getCurrent().asyncExec(new Runnable() {			
			@Override
			public void run() {	
				XYRepossition.resizeContainers((IGraphicalEditPart) instance);
				XYRepossition.reArrange((IGraphicalEditPart) instance);	
			}});
	}
	
	private boolean shouldReverse() {
		for(int i=0;i<this.getChildren().size();++i){
			if (this.getChildren().get(i) instanceof AbstractMediatorInputConnectorEditPart) {
				AbstractMediatorInputConnectorEditPart inputConnector = (AbstractMediatorInputConnectorEditPart) this.getChildren().get(i);
				if (inputConnector.getTargetConnections().size() != 0) {
					EditPart link = ((EsbLinkEditPart) inputConnector
							.getTargetConnections().get(0)).getSource();
					if ((link instanceof AbstractMediatorOutputConnectorEditPart)
							&& (((AbstractMediatorOutputConnectorEditPart) link).getParent() instanceof AbstractMediator)
							&& (((AbstractMediator) ((AbstractMediatorOutputConnectorEditPart) link)
									.getParent()).reversed)
							|| (link instanceof AbstractEndpointOutputConnectorEditPart)) {
						return true;
					}
				}
			}
		}
		return false;
	}
	
	public void reverse(EditPart editorPart) {

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
										
				    	| ((editorPart.getParent() instanceof MediatorFlowMediatorFlowCompartment15EditPart)
								&&(editorPart.getParent().getParent().getParent().getParent()
								.getParent() instanceof RouterMediatorEditPart)&&(((AbstractMediator) editorPart
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
										
						| ((editorPart.getParent() instanceof MediatorFlowMediatorFlowCompartment16EditPart)
					    		&& (editorPart.getParent().getParent().getParent() instanceof ConditionalRouterMediatorEditPart) && (((AbstractMediator) editorPart
										.getParent().getParent().getParent()).reversed))
										
					    | ((editorPart.getParent() instanceof MediatorFlowMediatorFlowCompartment17EditPart)
					    		&& (editorPart.getParent().getParent().getParent() instanceof RuleMediatorEditPart) && (((AbstractMediator) editorPart
										.getParent().getParent().getParent()).reversed))	
										
					    | ((editorPart.getParent() instanceof MediatorFlowMediatorFlowCompartment14EditPart)
					    		&& (editorPart.getParent().getParent().getParent() instanceof ValidateMediatorEditPart) && (((AbstractMediator) editorPart
										.getParent().getParent().getParent()).reversed))
					                	|(shouldReverse()))) {

			reverseConnectors(editorPart);
			
		}
		
	}
	
	/**
	 * Reverse connectors
	 */
	public void reverseConnectors() {
		reverseConnectors(this);
	}

	/**
	 * Reverse connectors
	 * @param editorPart
	 */
	public void reverseConnectors(EditPart editorPart) {
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
			if (selectedEP.getChildren().get(i) instanceof AbstractMediatorInputConnectorEditPart) {
				++inputCount;
			}
		}

		for (int i = 0; i < selectedEP.getChildren().size(); ++i) {
			if (selectedEP.getChildren().get(i) instanceof AbstractMediatorOutputConnectorEditPart) {
				++outputCount;
			}
		}

		for (int i = 0; i < selectedEP.getChildren().size(); ++i) {
			if (selectedEP.getChildren().get(i) instanceof AbstractMediatorInputConnectorEditPart) {

				inputConnector = ((AbstractMediatorInputConnectorEditPart) selectedEP.getChildren().get(i))
						.getFigure();
				inputConnectors.add(inputConnector);
				NodeFigure figureInput = ((AbstractMediatorInputConnectorEditPart) selectedEP.getChildren()
						.get(i)).getNodeFigureInput();
				inputPosition = inputPosition + (1 / (inputCount + 1));

				figureInput.removeAll();
				figureInput.add(((AbstractMediatorInputConnectorEditPart) selectedEP.getChildren().get(i))
						.getPrimaryShapeReverse());

				BorderItemLocator inputLocator = new FixedBorderItemLocator(
						selectedEP.getMainFigure(), inputConnector, PositionConstants.EAST,
						inputPosition);

				inputLocators.add(inputLocator);

			}

			if (selectedEP.getChildren().get(i) instanceof AbstractMediatorOutputConnectorEditPart) {

				outputConnector = ((AbstractMediatorOutputConnectorEditPart) selectedEP.getChildren().get(i))
						.getFigure();
				outputConnectors.add(outputConnector);
				NodeFigure figureOutput = ((AbstractMediatorOutputConnectorEditPart) selectedEP.getChildren()
						.get(i)).getNodeFigureOutput();

				outputPosition = outputPosition + (1 / (outputCount + 1));

				figureOutput.removeAll();
				EsbLink link=((OutputConnector)((Node)((AbstractMediatorOutputConnectorEditPart) selectedEP.getChildren().get(i)).getModel()).getElement()).getOutgoingLink();
				if(link ==null){
				figureOutput.add(((AbstractMediatorOutputConnectorEditPart) selectedEP.getChildren().get(i))
						.getPrimaryShapeReverse());
				}else{
					Figure emptyFigure = new Figure();
					figureOutput.add(emptyFigure);
				}

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
	
	protected void getMostSuitableElementToConnect() {

		if(isLockmode()) {
			/*This feature not available in Lock-mode */
			return;
		}
		
		ArrayList<EsbLinkEditPart> ESBLinkEditpart = new ArrayList<EsbLinkEditPart>();
		ArrayList<AbstractConnectorEditPart> outputConnectorEditpart = new ArrayList<AbstractConnectorEditPart>();
		ArrayList<AbstractConnectorEditPart> inputConnectorEditpart = new ArrayList<AbstractConnectorEditPart>();
		AbstractOutputConnectorEditPart nearestOutputConnector = null;
		AbstractInputConnectorEditPart nearestInputConnector = null;
		AbstractConnectorEditPart outputConnector = null;
		AbstractConnectorEditPart inputConnector = null;
		AbstractMediatorInputConnectorEditPart currentInputConnector = null;
		AbstractMediatorOutputConnectorEditPart currentOutputConnector = null;
		boolean previouslyConnected = false;

		for (int i = 0; i < getViewer().getEditPartRegistry().size(); ++i) {

			EditPart element = (EditPart) getViewer().getEditPartRegistry()
					.values().toArray()[i];

			if (element instanceof EsbLinkEditPart) {	
				/*
				 * Fixing TOOLS-1410 
				 */
/*				if((EditorUtils.getMediator(((EsbLinkEditPart)element).getSource())!=null)&&
						(EditorUtils.getMediator(this.getParent())!=null)){
					
					if(!(EditorUtils.getMediator(((EsbLinkEditPart)element).getSource())).equals(EditorUtils.getMediator(this.getParent()))
							||(((EsbLinkEditPart)element).getSource().getParent().getParent().equals(this.getParent()))){
						continue;
					}
				}else*/ if(EditorUtils.getEndpoint((AbstractConnectorEditPart) ((EsbLinkEditPart)element).getSource())!=null){
					if(!((EsbLinkEditPart)element).getSource().getParent().getParent().equals(this.getParent())){
						continue;
					}
				}
				ESBLinkEditpart.add((EsbLinkEditPart) element);
				
			} else if (element instanceof AbstractOutputConnectorEditPart) {

				if (((AbstractOutputConnectorEditPart) element).getParent()
						.getParent().equals(this.getParent())) {
					outputConnectorEditpart
							.add((AbstractOutputConnectorEditPart) element);

				} else if (((AbstractOutputConnectorEditPart) element)
						.getParent().equals(
								this.getParent().getParent().getParent()
										.getParent().getParent())) {
					/*
					 * for proxy service output Connector
					 */
					outputConnectorEditpart
							.add((AbstractOutputConnectorEditPart) element);

				} else if (((AbstractOutputConnectorEditPart) element)
						.getParent().equals(
								this.getParent().getParent().getParent())) {
					/*
					 * for sequences output Connector
					 */

					outputConnectorEditpart
							.add((AbstractOutputConnectorEditPart) element);

				}
			} else if (element instanceof AbstractInputConnectorEditPart) {
				if (((AbstractInputConnectorEditPart) element).getParent()
						.getParent().equals(this.getParent())) {
					inputConnectorEditpart
							.add((AbstractInputConnectorEditPart) element);
				} else if (((AbstractInputConnectorEditPart) element)
						.getParent().equals(
								this.getParent().getParent().getParent()
										.getParent().getParent())) {
					/*
					 * for proxy service input Connector
					 */
					if (((this.getParent() instanceof MediatorFlowMediatorFlowCompartment6EditPart) && ((AbstractInputConnectorEditPart) element instanceof ProxyFaultInputConnectorEditPart))
							|| ((this.getParent() instanceof MediatorFlowMediatorFlowCompartmentEditPart) && ((AbstractInputConnectorEditPart) element instanceof ProxyInputConnectorEditPart))) {
						inputConnectorEditpart
								.add((AbstractInputConnectorEditPart) element);
					}
				} else if (((AbstractInputConnectorEditPart) element)
						.getParent().equals(
								this.getParent().getParent().getParent())) {
					/*
					 * for sequences input Connector
					 */
					inputConnectorEditpart
							.add((AbstractInputConnectorEditPart) element);
				}

			}
		}
		EsbLinkEditPart nearestESBLink = ConnectionCalculator
				.getNearestLinkEditPart(ESBLinkEditpart, this);

		if (nearestESBLink == null) {

			nearestOutputConnector = (AbstractOutputConnectorEditPart) ConnectionCalculator
					.getNearestConnectorEditPart(outputConnectorEditpart, this);
			if ((nearestOutputConnector != null)) {// &&(!(this.getParent()
													// instanceof
													// MediatorFlowMediatorFlowCompartment6EditPart))){
				previouslyConnected = connectToNearestConnector(nearestOutputConnector);
				AbstractMediatorOutputConnectorEditPart updatedOutputConnector = null;
				updatedOutputConnector = EditorUtils
						.getMediatorOutputConnector(this);
				updateCurrentStates(updatedOutputConnector);
			}

			nearestInputConnector = (AbstractInputConnectorEditPart) ConnectionCalculator
					.getNearestConnectorEditPart(inputConnectorEditpart, this);
			if ((nearestInputConnector != null)) {// &&(!(this.getParent()
													// instanceof
													// MediatorFlowMediatorFlowCompartment6EditPart))){
				connectToNearestConnector(nearestInputConnector);
			}
		}

		if (!previouslyConnected) {
			if (nearestESBLink != null) {
				outputConnector = (AbstractConnectorEditPart) nearestESBLink
						.getSource();
				inputConnector = (AbstractConnectorEditPart) nearestESBLink
						.getTarget();
				
				if ((!(outputConnector instanceof ProxyOutputConnectorEditPart))
						&& (!(outputConnector instanceof SequencesOutputConnectorEditPart))
						&&(!(outputConnector instanceof APIResourceOutputConnectorEditPart))
						&& (!outputConnector.getParent().getParent()
								.equals(this.getParent()))
						&&(!EditorUtils.getMediator(outputConnector).equals(EditorUtils.getMediator(this.getParent())))) {
					nearestESBLink = null;
					connectNormally();
				}
			} else {
				connectNormally();
			}

			currentInputConnector = EditorUtils.getMediatorInputConnector(this);
			currentOutputConnector = EditorUtils
					.getMediatorOutputConnector(this);

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

			if (nearestESBLink != null) {
				DeleteCommand delCmd = new DeleteCommand(nearestESBLink
						.getNotationView());
				CompoundCommand dl = new CompoundCommand("Delete Link");
				dl.add(new ICommandProxy(delCmd));
				if (delCmd.canExecute()) {
					getDiagramEditDomain().getDiagramCommandStack().execute(dl);
				}
			}

			ConnectionUtils.createConnection(currentInputConnector,
					outputConnector);
			ConnectionUtils.createConnection(inputConnector,
					currentOutputConnector);
		}
	}
	
	private void connectNormally(){
		if(this.getParent() instanceof MediatorFlowMediatorFlowCompartmentEditPart){
			((MediatorFlowMediatorFlowCompartmentEditPart)this.getParent()).connectNormally(this);
		}else if(this.getParent() instanceof MediatorFlowMediatorFlowCompartment5EditPart){
			((MediatorFlowMediatorFlowCompartment5EditPart)this.getParent()).connectNormally(this);
		}else if(this.getParent() instanceof MediatorFlowMediatorFlowCompartment6EditPart){
			((MediatorFlowMediatorFlowCompartment6EditPart)this.getParent()).connectNormally(this);
		}
	}
	
	private void updateCurrentStates(AbstractMediatorOutputConnectorEditPart currentOutputConnector){
		if(this.getParent() instanceof MediatorFlowMediatorFlowCompartmentEditPart){
			((MediatorFlowMediatorFlowCompartmentEditPart)this.getParent()).setOutputConnectorEditPart(currentOutputConnector);
			((MediatorFlowMediatorFlowCompartmentEditPart)this.getParent()).setSourceEditPart(this);
		}else if(this.getParent() instanceof MediatorFlowMediatorFlowCompartment5EditPart){
			((MediatorFlowMediatorFlowCompartment5EditPart)this.getParent()).setOutputConnectorEditPart(currentOutputConnector);
			((MediatorFlowMediatorFlowCompartment5EditPart)this.getParent()).setSourceEditPart(this);
		}
	}

	private boolean checkComplexity() {
		if ((this instanceof AggregateMediatorEditPart) || (this instanceof SwitchMediatorEditPart)
				|| (this instanceof FilterMediatorEditPart)
				|| (this instanceof ThrottleMediatorEditPart)
				|| (this instanceof CacheMediatorEditPart)
				|| (this instanceof CloneMediatorEditPart)
				|| (this instanceof IterateMediatorEditPart)
				|| (this instanceof ValidateMediatorEditPart)
				|| (this instanceof RouterMediatorEditPart)
				|| (this instanceof ConditionalRouterMediatorEditPart)
				|| (this instanceof RuleMediatorEditPart)) {
			return true;
		} else {
			return false;
		}
	}
	
	private boolean connectToNearestConnector(AbstractConnectorEditPart nearestConnector){
		AbstractConnectorEditPart currentInputConnector = null;
		AbstractConnectorEditPart currentOutputConnector=null;
		AbstractConnectorEditPart target=null;
		AbstractConnectorEditPart source=null;
		
		currentInputConnector=EditorUtils.getInputConnector(this);
		currentOutputConnector=EditorUtils.getOutputConnector(this);

		
		if(nearestConnector instanceof AbstractOutputConnectorEditPart){
			source=nearestConnector;
			target=currentInputConnector;
		}else if(nearestConnector instanceof AbstractInputConnectorEditPart){
			source=currentOutputConnector;
			target=nearestConnector;
		}
		
		return ConnectionUtils.createConnection(target, source);
	}
	
	protected boolean isLockmode() {
		return EditorUtils.isLockmode(this);
	}
	
	
	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
		removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.POPUPBAR_ROLE);
	}
}
