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

package org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.layout;

import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.AbstractEndpoint;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.AbstractInputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.AbstractMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.AbstractMediatorFlowCompartmentEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.AbstractMediatorInputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.AbstractOutputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.AbstractProxyServiceContainerEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.DroppableElement;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.EditorUtils;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.complexFiguredAbstractMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.CloneMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.CloneTargetContainerEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.EsbLinkEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.EsbServerEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.FilterFailContainerEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.FilterMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.FilterPassContainerEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.MediatorFlow6EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.MediatorFlowEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.MediatorFlowMediatorFlowCompartment10EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.MediatorFlowMediatorFlowCompartment11EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.MediatorFlowMediatorFlowCompartment2EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.MediatorFlowMediatorFlowCompartment4EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.MediatorFlowMediatorFlowCompartment5EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.MediatorFlowMediatorFlowCompartment6EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.MediatorFlowMediatorFlowCompartment7EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.MediatorFlowMediatorFlowCompartment8EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.MediatorFlowMediatorFlowCompartment9EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.MediatorFlowMediatorFlowCompartmentEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.ProxyServiceContainer2EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.ProxyServiceContainerEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.ProxyServiceFaultContainerEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.ProxyServiceSequenceAndEndpointContainerEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.SwitchCaseContainerEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.SwitchDefaultContainerEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.SwitchMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.ThrottleMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.ThrottleOnAcceptContainerEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.ThrottleOnRejectContainerEditPart;

public class XYRepossition {

	private static int arraowLength = 50;
	private static int connectorLength = 5;
	private static int complexMediatorCompartmentGap = 5;

	private static int defaultProxyContainerWidth = 204;
	private static int defaultProxyAndEPContainerHeight = 312;
	private static int defaultFaultContainerHeight = 84;
	private static int complexMediatorLeftRectWidth = 100;

	public static void resizeContainers(IGraphicalEditPart editPart) {
		IGraphicalEditPart parent = editPart;

		while (!(parent instanceof EsbServerEditPart)) {
			if (parent != null) {
				resizeEditpart(parent);
				parent = (IGraphicalEditPart) parent.getParent();
			} else {
				break;
			}
		}
	}

	private static void resizeEditpart(IGraphicalEditPart parent) {
		if (parent instanceof AbstractMediatorFlowCompartmentEditPart) {
			if (parent instanceof MediatorFlowMediatorFlowCompartment5EditPart) {
				// Resize Sequences edit part.
				resizeSequences(parent);
			} else if (parent instanceof MediatorFlowMediatorFlowCompartmentEditPart ||
					parent instanceof MediatorFlowMediatorFlowCompartment6EditPart) {
				// Resize proxy service edit part.
				resizeProxyServiceEditPart(parent);
			} else {
				// Resize Complex mediator.
				resizeComplexMediator(parent);
			}
		}
	}

	/**
	 * Resize proxy, api and main sequence editor.
	 * @param parent
	 */
	private static void resizeProxyServiceEditPart(IGraphicalEditPart parent) {
		int constantY = 50;
		int x = 2 * connectorLength + arraowLength;

		int inSequenceHeight = 0;
		int outSequenceHeight = 0;

		int inOutSeqWidth = 0;
		int inOutSeqHeight = 0;

		int faultSequenceWidth = 0;
		int faultSequenceHeight = 0;

		int inSequenceWidth = 0;
		int outSequenceWidth = 0;

		int newWidth = 0;
		int newHeight = 0;

		int sendToEPDistance = 2 * x;

		AbstractProxyServiceContainerEditPart proxyServiceContainerEditPart = null;

		if(parent.getParent().getParent().getParent() instanceof ProxyServiceContainerEditPart) {
			proxyServiceContainerEditPart = (ProxyServiceContainerEditPart) parent.getParent().getParent().getParent();
		} else {
			proxyServiceContainerEditPart = (ProxyServiceContainer2EditPart) parent.getParent().getParent().getParent();
		}

		ProxyServiceSequenceAndEndpointContainerEditPart seqAndEPContainerEditPart = (ProxyServiceSequenceAndEndpointContainerEditPart) proxyServiceContainerEditPart
				.getChildren().get(0);
		MediatorFlowEditPart mediatorFlowEditPart = (MediatorFlowEditPart) seqAndEPContainerEditPart
				.getChildren().get(0);
		MediatorFlowMediatorFlowCompartmentEditPart inAndOutSeqEditPart = (MediatorFlowMediatorFlowCompartmentEditPart) mediatorFlowEditPart
				.getChildren().get(0);

		ProxyServiceFaultContainerEditPart proxyServiceFaultContainerEditPart = (ProxyServiceFaultContainerEditPart) proxyServiceContainerEditPart
				.getChildren().get(1);
		MediatorFlow6EditPart mediatorFlow6EditPart = (MediatorFlow6EditPart) proxyServiceFaultContainerEditPart
				.getChildren().get(0);
		MediatorFlowMediatorFlowCompartment6EditPart faulSeqEditPart = (MediatorFlowMediatorFlowCompartment6EditPart) mediatorFlow6EditPart
				.getChildren().get(0);

		int inOutSeqChildren = inAndOutSeqEditPart.getChildren().size();
		int faultSeqChildren = faulSeqEditPart.getChildren().size();

		// Calculate width and height of the in&out sequences.
		for (int i = 0; i < inOutSeqChildren; ++i) {
			if (inAndOutSeqEditPart.getChildren().get(i) instanceof AbstractMediator) {
				Rectangle childBounds = ((GraphicalEditPart) inAndOutSeqEditPart.getChildren().get(
						i)).getFigure().getBounds();
				AbstractMediator childMediator = (AbstractMediator) inAndOutSeqEditPart
						.getChildren().get(i);
				if (!childMediator.reversed) {
					// In sequence.
					if (childBounds.height > inSequenceHeight) {
						inSequenceHeight = childBounds.height;
					}
					inSequenceWidth += arraowLength + childBounds.width + 2 * connectorLength;
				} else {
					// Out sequence.
					if (childBounds.height > outSequenceHeight) {
						outSequenceHeight = childBounds.height;
					}
					outSequenceWidth += arraowLength + childBounds.width + 2 * connectorLength;
				}
			}
		}

		// Calculate width and height of the fault sequence.
		for (int i = 0; i < faultSeqChildren; i++) {
			Rectangle childBounds = ((GraphicalEditPart) faulSeqEditPart.getChildren().get(i))
					.getFigure().getBounds();
			if (childBounds.height > faultSequenceHeight) {
				faultSequenceHeight = childBounds.height;
			}
			faultSequenceWidth += arraowLength + childBounds.width + 2 * connectorLength;
		}

		faultSequenceHeight = faultSequenceHeight + constantY;

		if (inSequenceWidth > outSequenceWidth) {
			x += inSequenceWidth + sendToEPDistance;
		} else {
			x += outSequenceWidth + sendToEPDistance;
		}

		inOutSeqWidth = x;

		if (outSequenceHeight == 0) {
			outSequenceHeight = inSequenceHeight;
		}

		inOutSeqHeight = inSequenceHeight + outSequenceHeight + (constantY * 2);

		if(faultSequenceWidth > inOutSeqWidth) {
			// Check whether fault sequence is longer than in & out sequences.
			newWidth = faultSequenceWidth;
		} else {
			newWidth = inOutSeqWidth;
		}

		newHeight = inOutSeqHeight + faultSequenceHeight;

		if (inOutSeqChildren == 0 && faultSeqChildren == 0) {
			// In & Out sequences and Fault Sequence are empty.
			newWidth = defaultProxyContainerWidth;
			inOutSeqHeight = defaultProxyAndEPContainerHeight;
			faultSequenceHeight = defaultFaultContainerHeight;
			newHeight = inOutSeqHeight + faultSequenceHeight;

		} else if (inOutSeqChildren == 0 && faultSeqChildren > 0) {
			// In & Out sequences are empty Fault sequence is not empty.
			inOutSeqHeight = defaultProxyAndEPContainerHeight;
			newHeight = inOutSeqHeight + faultSequenceHeight;

		} else if (inOutSeqChildren > 0 && faultSeqChildren == 0) {
			// In & Out sequences are not empty Fault sequence is empty.
			faultSequenceHeight = defaultFaultContainerHeight;
			newHeight = inOutSeqHeight + faultSequenceHeight;
			//faulSeqEditPart.getFigure().setSize(new Dimension(newWidth, faultSequenceHeight));
		}

		Rectangle mediatorFlowConstraints = new Rectangle(0, 100, newWidth, inOutSeqHeight);
		Rectangle faultContainerConstraints = new Rectangle(0, 100, newWidth, faultSequenceHeight);
		Rectangle proxyServiceContainerConstraints = new Rectangle(0, 100, newWidth, newHeight);
		Rectangle proxyConstraints = new Rectangle(0, 100,
				proxyServiceContainerConstraints.width() + 100,
				proxyServiceContainerConstraints.height() + 4);
		
		//inAndOutSeqEditPart.getFigure().setSize(mediatorFlowConstraints.width, mediatorFlowConstraints.height-10);
		//faulSeqEditPart.getFigure().setSize(faultContainerConstraints.width, faultContainerConstraints.height-10);
		//inAndOutSeqEditPart.getFigure().setPreferredSize(new Dimension(mediatorFlowConstraints.width, mediatorFlowConstraints.height-10));
		//faulSeqEditPart.getFigure().setPreferredSize(new Dimension(mediatorFlowConstraints.width, mediatorFlowConstraints.height-10));

		// Resize MediatorFlowEditPart.
		((GraphicalEditPart) seqAndEPContainerEditPart).setLayoutConstraint(mediatorFlowEditPart,
				((GraphicalEditPart) mediatorFlowEditPart).getFigure(), mediatorFlowConstraints);
		//mediatorFlowEditPart.getFigure().setSize(mediatorFlowConstraints.width, mediatorFlowConstraints.height);
		//mediatorFlowEditPart.getFigure().setPreferredSize(new Dimension(mediatorFlowConstraints.width, mediatorFlowConstraints.height));
		((GraphicalEditPart) seqAndEPContainerEditPart).getFigure().setBounds(
				mediatorFlowConstraints);

		// Resize ProxyServiceSequenceAndEndpointContainerEditPart.
		((GraphicalEditPart) proxyServiceContainerEditPart).setLayoutConstraint(
				seqAndEPContainerEditPart,
				((GraphicalEditPart) seqAndEPContainerEditPart).getFigure(),
				mediatorFlowConstraints);
		//seqAndEPContainerEditPart.getFigure().setSize(mediatorFlowConstraints.width, mediatorFlowConstraints.height);
		//seqAndEPContainerEditPart.getFigure().setPreferredSize(new Dimension(mediatorFlowConstraints.width, mediatorFlowConstraints.height));
		((GraphicalEditPart) proxyServiceContainerEditPart).getFigure().setBounds(
				mediatorFlowConstraints);

		// Resize MediatorFlow6EditPart (fault sequence).
		((GraphicalEditPart) proxyServiceFaultContainerEditPart).setLayoutConstraint(
				mediatorFlow6EditPart, ((GraphicalEditPart) mediatorFlow6EditPart).getFigure(),
				faultContainerConstraints);
		//mediatorFlow6EditPart.getFigure().setSize(faultContainerConstraints.width, faultContainerConstraints.height);
		//mediatorFlow6EditPart.getFigure().setPreferredSize(new Dimension(faultContainerConstraints.width, faultContainerConstraints.height));
		((GraphicalEditPart) proxyServiceFaultContainerEditPart).getFigure().setBounds(
				faultContainerConstraints);

		// Resize ProxyServiceFaultContainerEditPart (fault sequence).
		((GraphicalEditPart) proxyServiceContainerEditPart).setLayoutConstraint(
				proxyServiceFaultContainerEditPart,
				((GraphicalEditPart) proxyServiceFaultContainerEditPart).getFigure(),
				faultContainerConstraints);
		//proxyServiceFaultContainerEditPart.getFigure().setSize(faultContainerConstraints.width, faultContainerConstraints.height);
		//proxyServiceFaultContainerEditPart.getFigure().setPreferredSize(new Dimension(faultContainerConstraints.width, faultContainerConstraints.height));
		((GraphicalEditPart) proxyServiceContainerEditPart).getFigure().setBounds(
				faultContainerConstraints);

		// Resize ProxyServiceContainerEditPart.
		((GraphicalEditPart) parent.getParent().getParent().getParent().getParent())
				.setLayoutConstraint(proxyServiceContainerEditPart,
						((GraphicalEditPart) proxyServiceContainerEditPart).getFigure(),
						proxyServiceContainerConstraints);
		//proxyServiceContainerEditPart.getFigure().setSize(proxyServiceContainerConstraints.width, proxyServiceContainerConstraints.height);
		//proxyServiceContainerEditPart.getFigure().setPreferredSize(new Dimension(proxyServiceContainerConstraints.width, proxyServiceContainerConstraints.height));

		// Resize ProxyServiceEditPart.
		((GraphicalEditPart) parent.getParent().getParent().getParent().getParent().getParent())
				.setLayoutConstraint(
						parent.getParent().getParent().getParent().getParent(),
						((GraphicalEditPart) parent.getParent().getParent().getParent().getParent())
								.getFigure(), proxyConstraints);
		//((GraphicalEditPart)parent.getParent().getParent().getParent().getParent()).getFigure().setSize(proxyConstraints.width, proxyConstraints.height);
		//((GraphicalEditPart)parent.getParent().getParent().getParent().getParent()).getFigure().setPreferredSize(new Dimension(proxyConstraints.width, proxyConstraints.height));

	}

	/**
	 * Resize complex mediator.
	 * @param parent
	 */
	private static void resizeComplexMediator(IGraphicalEditPart parent) {
		int constantY = 60;
		int x = 2 * connectorLength + arraowLength;
		int y = 0;
		int noOfChildren = parent.getChildren().size();

		for (int i = 0; i < noOfChildren; ++i) {
			Rectangle bound = ((GraphicalEditPart) parent.getChildren()
					.get(i)).getFigure().getBounds();
			x = arraowLength + bound.width + 2 * connectorLength
					+ x;
			if (bound.height > y) {
				y = bound.height;
			}
		}

		y = y + constantY;

		Rectangle constraints = new Rectangle(0, 100, x, y);

		// Resize the Complex Mediator.
		((GraphicalEditPart) parent.getParent().getParent())
		.setLayoutConstraint(parent.getParent(),
		                     ((GraphicalEditPart) parent.getParent())
		                     .getFigure(), constraints);

		/*
		 * Set bounds since layout constraints are suppose to be applied
		 * in next UI update, this bounds will be used in rearranging
		 * elements.
		 */
		((GraphicalEditPart) parent.getParent().getParent())
		.getFigure().setBounds(constraints);

		int boundsWidth = x + 90;
		int boundsHeight = y + 2 * complexMediatorCompartmentGap;
		AbstractMediator mediator = EditorUtils.getMediator(parent);

		if (mediator instanceof complexFiguredAbstractMediator) {

			if (parent != null && parent.getChildren().size() == 0) {
				/*
				 * Complex mediator doesn't contain any children, bring
				 * it to its initial size.
				 */
				boundsWidth = 170;
				boundsHeight = 100; // initial size
			}

			if (mediator instanceof FilterMediatorEditPart
					|| mediator instanceof SwitchMediatorEditPart
					|| mediator instanceof ThrottleMediatorEditPart
					|| mediator instanceof CloneMediatorEditPart) {
				int totalHeight = getTotalYFromChildren((ShapeNodeEditPart) parent
				                                        .getParent().getParent());
				int totalKids = getTotalChildCount((ShapeNodeEditPart) parent
				                                   .getParent().getParent());
				if (totalKids == 0) {
					boundsHeight = 100; // initial size
				} else {
					boundsHeight = totalHeight + constantY + 20;
				}
			}

			((IGraphicalEditPart) mediator).getFigure().getBounds()
			.setWidth(boundsWidth);
			((IGraphicalEditPart) mediator).getFigure().getBounds()
			.setHeight(boundsHeight);
		}
	}

	/**
	 * Resize the sequences editor.
	 * @param parent
	 */
	private static void resizeSequences(IGraphicalEditPart parent) {
		int constantY = 60;
		int x = 2 * connectorLength + arraowLength;
		int y = 0;
		int noOfChildren = parent.getChildren().size();

		for (int i = 0; i < noOfChildren; ++i) {
			Rectangle bound = ((GraphicalEditPart) parent.getChildren()
					.get(i)).getFigure().getBounds();
			x = arraowLength + bound.width + 2 * connectorLength
					+ x;
			if (bound.height > y) {
				y = bound.height;
			}
		}

		y = y + constantY;

		Rectangle constraints = new Rectangle(0, 100, x, y);

		/*
		 * Set bounds since layout constraints are suppose to be applied
		 * in next UI update, this bounds will be used in rearranging
		 * elements.
		 */
		((GraphicalEditPart) parent.getParent().getParent())
		.getFigure().setBounds(constraints);

		// Resize MediatorFlow5EditPart
		((GraphicalEditPart) parent.getParent().getParent())
		.setLayoutConstraint(parent.getParent(),
		                     ((GraphicalEditPart) parent.getParent())
		                     .getFigure(), constraints);

		if (noOfChildren == 0) {
			/*
			 * Sequence doesn't contain any children, bring it to its
			 * initial size
			 */
			constraints.setHeight(125);
			constraints.setWidth(195);
		}
		// Resize SequencesEditPart
		((GraphicalEditPart) parent.getParent().getParent().getParent())
		.setLayoutConstraint(parent.getParent().getParent(),
		                     ((GraphicalEditPart) parent.getParent()
		                    		 .getParent()).getFigure(), constraints);

		/*
		 * Set bounds since layout constraints are suppose to be applied
		 * in next UI update, this bounds will be used in rearranging
		 * elements.
		 */
		((GraphicalEditPart) parent.getParent().getParent().getParent())
		.getFigure().setBounds(constraints);
	}

	public static void reArrange(IGraphicalEditPart editPart) {

		IGraphicalEditPart parent = editPart;
		while (!(parent instanceof EsbServerEditPart)) {
			if (parent != null) {
				rearrangeChildren(parent);
				parent = (IGraphicalEditPart) parent.getParent();
			} else {
				break;
			}
		}
	}

	private static void rearrangeChildren(IGraphicalEditPart editPart) {

		if (editPart instanceof AbstractMediatorFlowCompartmentEditPart) {
			int verticalSpacing = 0;
			int arraowLength = 50;
			int connectorLength = 5;
			int arrowAndtwoConnectorsLength = arraowLength + 2 * connectorLength;
			int x = arrowAndtwoConnectorsLength - connectorLength;
			ShapeNodeEditPart node = getLeftMostNodeFromEditPart(editPart);
			int i = 0;

			while (node instanceof AbstractMediator || node instanceof AbstractEndpoint) {
				int y = 0;

				if (editPart instanceof MediatorFlowMediatorFlowCompartmentEditPart) {
					y = ((IGraphicalEditPart) editPart.getParent().getParent()).getFigure()
							.getBounds().height / (2 * 2);
				} else {
					y = ((IGraphicalEditPart) editPart.getParent().getParent()).getFigure()
							.getBounds().height / 2;
				}

				if (editPart instanceof MediatorFlowMediatorFlowCompartment5EditPart) {
					// Title bar width of the sequences editor.
					verticalSpacing = 20;
				} else {
					verticalSpacing = 10;
				}

				y = y - node.getFigure().getBounds().height / 2 - verticalSpacing;

				IFigure nodeFigure = ((GraphicalEditPart) node).getFigure();
				int nodeFigureWdith = nodeFigure.getBounds().width;
				int nodeFigureHeight = nodeFigure.getBounds().height;

				if (node instanceof DroppableElement) {
					DroppableElement droppableElement = (DroppableElement) node;
					Rectangle constraints = null;

					if ((node instanceof AbstractMediator &&!((AbstractMediator)droppableElement).reversed)||(node instanceof AbstractEndpoint)) {
						// Mediator is in in sequence.
						droppableElement.setX(x);
						droppableElement.setY(y);
						constraints = new Rectangle(x, y, nodeFigureWdith, nodeFigureHeight);
						x = x + arrowAndtwoConnectorsLength + nodeFigureWdith;

					} else {
						if (editPart instanceof MediatorFlowMediatorFlowCompartmentEditPart) {
							// In&out sequence mediator.
							y = ((IGraphicalEditPart) editPart.getParent().getParent()).getFigure()
									.getBounds().height * 3 / 4;
							y = y - node.getFigure().getBounds().height / 2;
							x = x - arrowAndtwoConnectorsLength - nodeFigureWdith;

							droppableElement.setX(x);
							droppableElement.setY(y);
							constraints = new Rectangle(x, y, nodeFigureWdith, nodeFigureHeight);
						} else if (editPart instanceof MediatorFlowMediatorFlowCompartment6EditPart) {
							// Mediators in fault sequence.
							droppableElement.setX(x);
							droppableElement.setY(y);
							constraints = new Rectangle(x, y, nodeFigureWdith, nodeFigureHeight);
							x = x + arrowAndtwoConnectorsLength + nodeFigureWdith;

						} else {
							/*
							 * Mediators inside complex mediator in the out
							 * sequence
							 */
							if (i == 0) {
								if (editPart instanceof MediatorFlowMediatorFlowCompartment7EditPart
										|| editPart instanceof MediatorFlowMediatorFlowCompartment8EditPart
										|| editPart instanceof MediatorFlowMediatorFlowCompartment9EditPart
										|| editPart instanceof MediatorFlowMediatorFlowCompartment10EditPart
										|| editPart instanceof MediatorFlowMediatorFlowCompartment2EditPart
										|| editPart instanceof MediatorFlowMediatorFlowCompartment4EditPart
										|| editPart instanceof MediatorFlowMediatorFlowCompartment11EditPart) {

									x = ((IGraphicalEditPart) editPart.getParent().getParent()
											.getParent().getParent()).getFigure().getBounds().width
											- complexMediatorLeftRectWidth
											- arrowAndtwoConnectorsLength - nodeFigureWdith;

								} else {
									x = ((IGraphicalEditPart) editPart.getParent().getParent())
											.getFigure().getBounds().width
											- complexMediatorLeftRectWidth
											- arrowAndtwoConnectorsLength - nodeFigureWdith;
								}

							} else {
								x = x - arrowAndtwoConnectorsLength - nodeFigureWdith;
							}

							droppableElement.setX(x);
							droppableElement.setY(y);
							constraints = new Rectangle(x, y, nodeFigureWdith, nodeFigureHeight);
							i++;
						}
					}

					GraphicalEditPart nodeParent = (GraphicalEditPart) ((GraphicalEditPart) node)
							.getParent();
					nodeParent.setLayoutConstraint(node, nodeFigure, constraints);

				} else if (node instanceof AbstractEndpoint) {
					// Started to traverse out sequence.
					x = ((IGraphicalEditPart) editPart.getParent().getParent()).getFigure()
							.getBounds().width - arrowAndtwoConnectorsLength * 2;
				}

				AbstractOutputConnectorEditPart nodeOPconector = null;
				AbstractMediatorInputConnectorEditPart nodeInputConnector = null;
				List sourceConnections = null;
				List targetConnections = null;

				if (editPart instanceof MediatorFlowMediatorFlowCompartment6EditPart) {
					// fault sequence.
					nodeInputConnector = EditorUtils.getMediatorInputConnector(node);
					targetConnections = nodeInputConnector.getTargetConnections();

					if (targetConnections != null) {
						if (targetConnections.size() != 0) {
							node = (ShapeNodeEditPart) ((EsbLinkEditPart) nodeInputConnector
									.getTargetConnections().get(0)).getSource().getParent();
						} else {
							break;
						}
					}

				} else {
					if (node instanceof AbstractEndpoint) {
						nodeOPconector = EditorUtils.getEndpointOutputConnector(node);
					} else {
						nodeOPconector = EditorUtils.getMediatorOutputConnector(node);
					}
					if(nodeOPconector!=null){
						sourceConnections = nodeOPconector.getSourceConnections();
	
						if (sourceConnections != null) {
							if (sourceConnections.size() != 0) {
								EsbLinkEditPart linkPart = (EsbLinkEditPart) sourceConnections.get(0);
								node = (ShapeNodeEditPart) linkPart.getTarget().getParent();
							} else {
								break;
							}
						}
					}else {
						break;
					}
				}
			}
		}
	}

	private static ShapeNodeEditPart getLeftMostNodeFromEditPart(
	                                                             IGraphicalEditPart parent) {
		ShapeNodeEditPart first = null;
		if (parent instanceof MediatorFlowMediatorFlowCompartmentEditPart || parent instanceof MediatorFlowMediatorFlowCompartment6EditPart) {
			first = (ShapeNodeEditPart) parent.getParent().getParent()
					.getParent().getParent();
		} else {
			first = (ShapeNodeEditPart) parent.getParent().getParent();
		}

		ShapeNodeEditPart node = null;
		AbstractOutputConnectorEditPart firstOutputConnector = null;
		AbstractInputConnectorEditPart faultInputConnector = null;

		if (first instanceof FilterPassContainerEditPart
				|| first instanceof FilterFailContainerEditPart
				|| first instanceof ThrottleOnAcceptContainerEditPart
				|| first instanceof ThrottleOnRejectContainerEditPart
				|| first instanceof SwitchCaseContainerEditPart
				|| first instanceof SwitchDefaultContainerEditPart
				|| first instanceof CloneTargetContainerEditPart) {

			int editPartIndex = getEditPartIndexFromParent(first);
			ShapeNodeEditPart mediatorEditPart = (ShapeNodeEditPart) first
					.getParent().getParent();
			firstOutputConnector = EditorUtils
					.getMediatorAdditionalOutputConnectors(mediatorEditPart)
					.get(editPartIndex);

		} else {
			if (parent instanceof MediatorFlowMediatorFlowCompartment6EditPart) {
				faultInputConnector = EditorUtils.getProxyFaultInputConnector(first);
			} else {
				if (EditorUtils.getMediatorAdditionalOutputConnectors(first).size() == 0) {
					firstOutputConnector = EditorUtils.getOutputConnector(first);
				} else {
					firstOutputConnector = EditorUtils.getMediatorAdditionalOutputConnectors(first).get(0);
				}
			}
		}

		if(parent instanceof MediatorFlowMediatorFlowCompartment6EditPart) {
			if (faultInputConnector != null) {
				if (faultInputConnector.getTargetConnections() != null) {
					if (faultInputConnector.getTargetConnections().size() != 0) {
						node = (ShapeNodeEditPart) ((EsbLinkEditPart) faultInputConnector.getTargetConnections().get(0)).getSource().getParent();
					}
				}
			}
		} else {
			if (firstOutputConnector != null) {
				if (firstOutputConnector.getSourceConnections() != null) {
					if (firstOutputConnector.getSourceConnections().size() != 0) {
						node = (ShapeNodeEditPart) ((EsbLinkEditPart) firstOutputConnector
								.getSourceConnections().get(0)).getTarget()
								.getParent();
					}
				}
			}
		}

		return node;
	}

	private static int getEditPartIndexFromParent(ShapeNodeEditPart first) {
		List<EditPart> siblings = first.getParent().getChildren();
		int index = 0;
		int editPartIndex = 0;
		for (EditPart sibling : siblings) {
			if (sibling.equals(first)) {
				editPartIndex = index;
			}
			index++;
		}
		return editPartIndex;
	}

	private static int getTotalYFromChildren(ShapeNodeEditPart first) {
		List<EditPart> children = first.getParent().getChildren();
		int y = 0;
		for (EditPart child : children) {
			y += getMaximumY((IGraphicalEditPart) child);
		}
		return y;
	}

	private static int getMaximumY(IGraphicalEditPart parent) {
		int y = 0;
		IGraphicalEditPart mediatorFlow = (IGraphicalEditPart) parent
				.getChildren().get(0);
		IGraphicalEditPart mediatorFlowCompartment = (IGraphicalEditPart) mediatorFlow
				.getChildren().get(0);
		if (mediatorFlowCompartment.getChildren().size() >= 1) {
			for (int i = 0; i < mediatorFlowCompartment.getChildren().size(); ++i) {
				GraphicalEditPart gep = (GraphicalEditPart) mediatorFlowCompartment
						.getChildren().get(i);
				Rectangle bound = gep.getFigure().getBounds();
				if (bound.height > y) {
					y = bound.height;
				}
			}
		} else {
			y = 60;
		}
		return y;
	}

	private static int getTotalChildCount(ShapeNodeEditPart first) {
		List<EditPart> children = first.getParent().getChildren();
		int childCount = 0;
		for (EditPart child : children) {
			childCount += getChildCount((IGraphicalEditPart) child);
		}
		return childCount;
	}

	private static int getChildCount(IGraphicalEditPart parent) {
		IGraphicalEditPart mediatorFlow = (IGraphicalEditPart) parent
				.getChildren().get(0);
		IGraphicalEditPart mediatorFlowCompartment = (IGraphicalEditPart) mediatorFlow
				.getChildren().get(0);
		int childCount = mediatorFlowCompartment.getChildren().size();
		return childCount;
	}
}