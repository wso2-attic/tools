package org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.utils;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.AbstractEndpoint;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.AbstractMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.AdditionalOutputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.FixedBorderItemLocator;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.AggregateMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.CloneMediatorContainerEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.CloneMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.CloneTargetContainerEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.EndpointFlowEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.EndpointFlowEndpointCompartmentEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.FilterMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.IterateMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.MediatorFlow12EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.MediatorFlow3EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.MediatorFlow4EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.MediatorFlowMediatorFlowCompartment12EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.MediatorFlowMediatorFlowCompartment3EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.MediatorFlowMediatorFlowCompartment4EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.SendMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.SwitchCaseContainerEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.SwitchDefaultContainerEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.SwitchMediatorContainerEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.SwitchMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.ThrottleMediatorEditPart;

public class MediatorFigureReverser {

	public static void reverse(EditPart editorPart, boolean skipSwap) {
		List childFigures = ((IFigure) ((DefaultSizeNodeFigure) ((AbstractMediator) editorPart)
				.getFigure().getChildren().get(0)).getChildren().get(0)).getChildren();
		if (!skipSwap) {
			/*
			 * Swap mediator container and figure container.
			 */
			if (childFigures.get(0) instanceof RoundedRectangle) {
				RoundedRectangle part1 = (RoundedRectangle) childFigures.get(0);
				DefaultSizeNodeFigure part2 = (DefaultSizeNodeFigure) childFigures.get(1);

				childFigures.remove(0);
				childFigures.remove(0);

				childFigures.add(part2);
				childFigures.add(part1);
			}
		}

		/*
		 * Change the direction of the additonalOutputConnector.
		 */
		for (int i = 0; i < ((AbstractMediator) editorPart).getChildren().size(); ++i) {
			if (((AbstractMediator) editorPart).getChildren().get(i) instanceof AdditionalOutputConnector) {
				NodeFigure figureInput = ((AdditionalOutputConnector) editorPart.getChildren().get(
						i)).getNodeFigureOutput();
				figureInput.removeAll();
				figureInput.add(((AdditionalOutputConnector) editorPart.getChildren().get(i))
						.getPrimaryShapeReverse());
			}
		}

		List children = null;
		List childrenCaseContainer = new ArrayList();
		List childrenDefaultContainer = null;
		if (editorPart instanceof AggregateMediatorEditPart) {
			arrangeType1Compartment(editorPart,
					((AggregateMediatorEditPart) editorPart).onCompleteOutputConnector,
					childFigures);
			/*
			 * Reverse the mediators inside the Aggregate mediator.
			 */
			children = ((MediatorFlowMediatorFlowCompartment3EditPart) ((MediatorFlow3EditPart) editorPart
					.getChildren().get(4)).getChildren().get(0)).getChildren();
		}
		
		if(editorPart instanceof IterateMediatorEditPart){
			arrangeType1Compartment(editorPart,
					((IterateMediatorEditPart) editorPart).targetOutputConnector,
					childFigures);
			/*
			 * Reverse the mediators inside the Iterate mediator.
			 */			
			children = ((MediatorFlowMediatorFlowCompartment12EditPart) ((MediatorFlow12EditPart) editorPart
					.getChildren().get(4)).getChildren().get(0)).getChildren();
		}

		if (editorPart instanceof SendMediatorEditPart) {
			arrangeType1Compartment(editorPart,
					((SendMediatorEditPart) editorPart).endpointOutputConnector, childFigures);
			/*
			 * Reverse the mediators inside the Send mediator.
			 */
			children = ((EndpointFlowEndpointCompartmentEditPart) ((EndpointFlowEditPart) editorPart
					.getChildren().get(3)).getChildren().get(0)).getChildren();
		}

		if (editorPart instanceof FilterMediatorEditPart) {
			arrangeType2Compartment(editorPart,
					((FilterMediatorEditPart) editorPart).passOutputConnector,
					((FilterMediatorEditPart) editorPart).failOutputConnector, childFigures);
			/*
			 * Reverse the mediators inside the Filter mediator.
			 */
			children = ((EditPart) ((EditPart) ((EditPart) ((EditPart) editorPart.getChildren()
					.get(5)).getChildren().get(0)).getChildren().get(0)).getChildren().get(0))
					.getChildren();
			List failChildren = ((EditPart) ((EditPart) ((EditPart) ((EditPart) editorPart
					.getChildren().get(5)).getChildren().get(1)).getChildren().get(0))
					.getChildren().get(0)).getChildren();
			children.addAll(failChildren);
		}

		if (editorPart instanceof ThrottleMediatorEditPart) {
			arrangeType2Compartment(editorPart,
					((ThrottleMediatorEditPart) editorPart).onAcceptOutputConnector,
					((ThrottleMediatorEditPart) editorPart).onRejectOutputConnector, childFigures);
			/*
			 * Reverse the mediators inside the Throttle mediator.
			 */
			children = ((EditPart) ((EditPart) ((EditPart) ((EditPart) editorPart.getChildren()
					.get(5)).getChildren().get(0)).getChildren().get(0)).getChildren().get(0))
					.getChildren();
			List onRejectChildren = ((EditPart) ((EditPart) ((EditPart) ((EditPart) editorPart
					.getChildren().get(5)).getChildren().get(1)).getChildren().get(0))
					.getChildren().get(0)).getChildren();
			children.addAll(onRejectChildren);
		}

		if (editorPart instanceof SwitchMediatorEditPart) {
			BorderItemLocator locator = new FixedBorderItemLocator(
					(IFigure) ((IFigure) ((DefaultSizeNodeFigure) childFigures.get(0))
							.getChildren().get(0)).getChildren().get(0),
					((SwitchMediatorEditPart) editorPart).defaultOutputConnector,
					PositionConstants.EAST, 0.5);
			((SwitchMediatorEditPart) editorPart).getBorderedFigure().getBorderItemContainer()
					.add(((SwitchMediatorEditPart) editorPart).defaultOutputConnector, locator);

			for (int i = 0; ((i < ((SwitchMediatorEditPart) editorPart).caseOutputConnectors.size()) && ((i + 1) < (((IFigure) ((DefaultSizeNodeFigure) childFigures
					.get(0)).getChildren().get(0)).getChildren().size()))); ++i) {
				BorderItemLocator caseLocator = new FixedBorderItemLocator(
						(IFigure) ((IFigure) ((DefaultSizeNodeFigure) childFigures.get(0))
								.getChildren().get(0)).getChildren().get(i + 1),
						((SwitchMediatorEditPart) editorPart).caseOutputConnectors.get(i),
						PositionConstants.EAST, 0.5);
				((SwitchMediatorEditPart) editorPart)
						.getBorderedFigure()
						.getBorderItemContainer()
						.add(((SwitchMediatorEditPart) editorPart).caseOutputConnectors.get(i),
								caseLocator);
			}

			for (int j = 0; j < editorPart.getChildren().size(); ++j) {
				if (editorPart.getChildren().get(j) instanceof SwitchMediatorContainerEditPart) {

					List<SwitchCaseContainerEditPart> switchCaseContainerEditPartList = ((SwitchMediatorContainerEditPart) editorPart
							.getChildren().get(j)).getChildren();
					for (int p = 0; p < switchCaseContainerEditPartList.size(); ++p) {
						childrenCaseContainer
								.addAll(((EditPart) ((EditPart) ((EditPart) switchCaseContainerEditPartList
										.get(p)).getChildren().get(0)).getChildren().get(0))
										.getChildren());
					}				
					for (int k = 0; k < ((SwitchMediatorContainerEditPart) editorPart.getChildren()
							.get(j)).getChildren().size(); ++k) {
						if (((SwitchMediatorContainerEditPart) editorPart.getChildren().get(j))
								.getChildren().get(k) instanceof SwitchDefaultContainerEditPart) {
							childrenDefaultContainer = ((MediatorFlowMediatorFlowCompartment4EditPart) ((MediatorFlow4EditPart) ((SwitchDefaultContainerEditPart) ((SwitchMediatorContainerEditPart) editorPart
									.getChildren().get(j)).getChildren().get(k)).getChildren().get(
									0)).getChildren().get(0)).getChildren();
							break;
						}
					}

					children = childrenCaseContainer;
					break;
				}
			}
		}
		
		
		if (editorPart instanceof CloneMediatorEditPart) {

			for (int i = 0; (i < ((CloneMediatorEditPart) editorPart).targetOutputConnectors.size()&&(i < (((IFigure) ((DefaultSizeNodeFigure) childFigures
					.get(0)).getChildren().get(0)).getChildren().size()))); ++i) {
				BorderItemLocator targetLocator = new FixedBorderItemLocator(
						(IFigure) ((IFigure) ((DefaultSizeNodeFigure) childFigures.get(0))
								.getChildren().get(0)).getChildren().get(i),
						((CloneMediatorEditPart) editorPart).targetOutputConnectors.get(i),
						PositionConstants.EAST, 0.5);
				((CloneMediatorEditPart) editorPart)
						.getBorderedFigure()
						.getBorderItemContainer()
						.add(((CloneMediatorEditPart) editorPart).targetOutputConnectors.get(i),
								targetLocator);
			}

			for (int j = 0; j < editorPart.getChildren().size(); ++j) {
				if (editorPart.getChildren().get(j) instanceof CloneMediatorContainerEditPart) {

					List<CloneTargetContainerEditPart> cloneTargetContainerEditPartList = ((CloneMediatorContainerEditPart) editorPart
							.getChildren().get(j)).getChildren();
					for (int p = 0; p < cloneTargetContainerEditPartList.size(); ++p) {
						childrenCaseContainer
								.addAll(((EditPart) ((EditPart) ((EditPart) cloneTargetContainerEditPartList
										.get(p)).getChildren().get(0)).getChildren().get(0))
										.getChildren());
					}

					children = childrenCaseContainer;
					break;
				}
			}
		}	
		

		if (children != null) {
			for (int i = 0; i < children.size(); ++i) {
				if (children.get(i) instanceof AbstractMediator) {
					((AbstractMediator) children.get(i))
							.Reverse((AbstractMediator) children.get(i));
				} else if (children.get(i) instanceof AbstractEndpoint) {
					((AbstractEndpoint) children.get(i))
							.Reverse((AbstractEndpoint) children.get(i));
				}
			}
		}
	}

	private static void arrangeType1Compartment(EditPart editpart, IFigure outputConnector,
			List childFigures) {
		BorderItemLocator locator = new FixedBorderItemLocator(
				(IFigure) ((DefaultSizeNodeFigure) childFigures.get(0)).getChildren().get(0),
				outputConnector, PositionConstants.EAST, 0.5);
		((AbstractMediator) editpart).getBorderedFigure().getBorderItemContainer()
				.add(outputConnector, locator);
	}

	private static void arrangeType2Compartment(EditPart editpart, IFigure outputConnector1,
			IFigure outputConnector2, List childFigures) {
		BorderItemLocator locator1 = new FixedBorderItemLocator(
				(IFigure) ((IFigure) ((DefaultSizeNodeFigure) childFigures.get(0)).getChildren()
						.get(0)).getChildren().get(0), outputConnector1, PositionConstants.EAST,
				0.5);
		((AbstractMediator) editpart).getBorderedFigure().getBorderItemContainer()
				.add(outputConnector1, locator1);

		BorderItemLocator locator2 = new FixedBorderItemLocator(
				(IFigure) ((IFigure) ((DefaultSizeNodeFigure) childFigures.get(0)).getChildren()
						.get(0)).getChildren().get(1), outputConnector2, PositionConstants.EAST,
				0.5);
		((AbstractMediator) editpart).getBorderedFigure().getBorderItemContainer()
				.add(outputConnector2, locator2);
	}

}
