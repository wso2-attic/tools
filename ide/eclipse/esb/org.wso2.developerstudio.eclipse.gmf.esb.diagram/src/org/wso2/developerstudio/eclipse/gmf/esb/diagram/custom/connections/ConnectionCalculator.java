package org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.connections;

import java.util.ArrayList;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderedShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.AbstractConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.AbstractInputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.AbstractMediatorOutputConnectorEditPart.EastPointerFigure;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.AbstractMediatorOutputConnectorEditPart.WestPointerFigure;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.AbstractOutputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.complexFiguredAbstractMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.EsbLinkEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.MediatorFlowMediatorFlowCompartment6EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.ProxyServiceContainerEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.ProxyServiceEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.ProxyServiceFaultContainerEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.SequencesEditPart;

/*
 * This calss is used to handle automatic connection creation stuffs. 
 * 
 */
public class ConnectionCalculator {

	private static Point currentFigureLocation = null;
	private static ProxyServiceEditPart proxyService = null;
	private static SequencesEditPart sequences = null;

	public static EsbLinkEditPart getNearestLinkEditPart(ArrayList links,
			AbstractBorderedShapeEditPart childEditPart) {
		double current = 0.0;
		ArrayList<EsbLinkEditPart> nearLinks = new ArrayList<EsbLinkEditPart>();
		double distance = 0.0;
		double distanceToUpperLine = 0.0;
		double distanceToBottomLine = 0.0;
		EsbLinkEditPart nearestLink = null;

		if (childEditPart != null) {
			updateCurrentStates(childEditPart);

			if (proxyService != null) {
				adjustYvalue(childEditPart);

				for (int i = 0; i < links.size(); ++i) {
					if (!links.get(i).equals(childEditPart)) {
						int xLeft = ((EsbLinkEditPart) links.get(i))
								.getFigure().getBounds().getLeft().x;
						int xRight = (((EsbLinkEditPart) links.get(i))
								.getFigure().getBounds().getRight().x);

						/*
						 * When we get the current location of the added figure,
						 * it will give the location related to the Proxy
						 * Service. So we have to add the Proxy Service location
						 * to get the absolue location.
						 */
						int actualCurrentPosition = currentFigureLocation.x
								+ proxyService.getFigure().getBounds()
										.getLocation().x + 75;
						actualCurrentPosition = getXAbsolutePosition(
								actualCurrentPosition, childEditPart);
						if ((xLeft < actualCurrentPosition)
								&& (actualCurrentPosition < xRight)) {
							nearLinks.add((EsbLinkEditPart) links.get(i));
						}
					}
				}
				proxyService = null;
			} else if (sequences != null) {
				/*
				 * When we get the current location of the added figure, it will
				 * give the location related to the Sequences figure. So we have
				 * to add the Sequences figure location to get the absolue
				 * location.
				 */
				currentFigureLocation.y = currentFigureLocation.y
						+ sequences.getFigure().getBounds().getLocation().y
						+ 30;
				currentFigureLocation.y = getYAbsolutePosition(
						currentFigureLocation.y, childEditPart);

				for (int i = 0; i < links.size(); ++i) {
					if (!links.get(i).equals(childEditPart)) {
						int xLeft = ((EsbLinkEditPart) links.get(i))
								.getFigure().getBounds().getLeft().x;
						int xRight = (((EsbLinkEditPart) links.get(i))
								.getFigure().getBounds().getRight().x);

						/*
						 * When we get the current location of the added figure,
						 * it will give the location related to the Sequences
						 * figure. So we have to add the Sequences figure
						 * location to get the absolue location.
						 */
						int actualCurrentPosition = currentFigureLocation.x
								+ sequences.getFigure().getBounds()
										.getLocation().x + 75;
						actualCurrentPosition = getXAbsolutePosition(
								actualCurrentPosition, childEditPart);
						if ((xLeft < actualCurrentPosition)
								&& (actualCurrentPosition < xRight)) {
							nearLinks.add((EsbLinkEditPart) links.get(i));
						}
					}
				}
				sequences = null;
			}
		}
		for (int q = 0; q < nearLinks.size(); ++q) {
			if ((((nearLinks.get(q).getFigure().getBounds().getLeft().y) < (currentFigureLocation.y + 70)) && ((currentFigureLocation.y) < (nearLinks
					.get(q).getFigure().getBounds().getBottomLeft().y)))
					|| (((nearLinks.get(q).getFigure().getBounds().getLeft().y) > (currentFigureLocation.y + 70)) && ((currentFigureLocation.y) > (nearLinks
							.get(q).getFigure().getBounds().getBottomLeft().y)))) {
				return (EsbLinkEditPart) nearLinks.get(q);
			}

			distanceToUpperLine = nearLinks.get(q).getFigure().getBounds()
					.getLeft().y
					- currentFigureLocation.y;
			distanceToUpperLine = Math.abs(distanceToUpperLine);
			distanceToBottomLine = nearLinks.get(q).getFigure().getBounds()
					.getBottomLeft().y
					- currentFigureLocation.y;
			distanceToBottomLine = Math.abs(distanceToBottomLine);

			if (distanceToUpperLine > distanceToBottomLine) {
				distance = distanceToBottomLine;
			} else {
				distance = distanceToUpperLine;
			}
			if (current == 0.0) {
				current = distance;
				nearestLink = (EsbLinkEditPart) nearLinks.get(q);
			} else if (distance < current) {
				current = distance;
				nearestLink = (EsbLinkEditPart) nearLinks.get(q);
			}
		}
		if (current > 35) {
			return null;
		}
		return nearestLink;
	}

	public static ShapeNodeEditPart getNearestConnectorEditPart(
			ArrayList<AbstractConnectorEditPart> connectors,
			ShapeNodeEditPart childEditPart) {
		AbstractConnectorEditPart nearForwardConnector = null;
		AbstractConnectorEditPart nearReverseConnector = null;
		AbstractConnectorEditPart nearConnector = null;
		AbstractConnectorEditPart currentConnector = null, currentInputConnector = null, currentOutputConnector = null;
		int yCurrent = 0, yDistance1 = 0, yDistance2 = 0;
		int EastDistance = 0, EastCurrent = 0, WestCurrent = 0, WestDistance = 0;

		if (childEditPart != null) {
			updateCurrentStates(childEditPart);

			if (proxyService != null) {
				adjustYvalue(childEditPart);

				for (int p = 0; p < childEditPart.getChildren().size(); ++p) {
					if (childEditPart.getChildren().get(p) instanceof AbstractInputConnectorEditPart) {
						currentInputConnector = (AbstractInputConnectorEditPart) childEditPart
								.getChildren().get(p);
					} else if (childEditPart.getChildren().get(p) instanceof AbstractOutputConnectorEditPart) {
						currentOutputConnector = (AbstractOutputConnectorEditPart) childEditPart
								.getChildren().get(p);
					}
				}
				if ((connectors.size() != 0)) {
					if (connectors.get(0) instanceof AbstractInputConnectorEditPart) {
						currentConnector = currentInputConnector;
					} else {
						currentConnector = currentOutputConnector;
					}
				}

				for (int i = 0; i < connectors.size(); ++i) {

					IFigure figure = (IFigure) ((DefaultSizeNodeFigure) connectors
							.get(i).getFigure()).getChildren().get(0);

					if (!connectors.get(i).equals(currentConnector)) {
						int xLeft = connectors.get(i).getFigure().getBounds()
								.getLeft().x;

						/*
						 * When we get the current location of the added figure,
						 * it will give the location related to the Proxy
						 * Service. So we have to add the Proxy Service location
						 * to get the absolue location.
						 */
						int actualCurrentPosition = currentFigureLocation.x
								+ proxyService.getFigure().getBounds()
										.getLocation().x + 75;
						actualCurrentPosition = getXAbsolutePosition(
								actualCurrentPosition, childEditPart);

						if ((figure instanceof EastPointerFigure)
								|| (figure instanceof org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.AbstractMediatorInputConnectorEditPart.EastPointerFigure)) {
							EastDistance = Math.abs(xLeft
									- actualCurrentPosition);
							if (((connectors.get(i) instanceof AbstractOutputConnectorEditPart) && (xLeft < actualCurrentPosition))
									|| ((connectors.get(i) instanceof AbstractInputConnectorEditPart) && (xLeft > actualCurrentPosition))) {
								if ((EastCurrent == 0)
										|| (EastCurrent > EastDistance)) {
									EastCurrent = EastDistance;
									nearForwardConnector = connectors.get(i);
								}
							}
						} else if ((figure instanceof WestPointerFigure)
								|| (figure instanceof org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.AbstractMediatorInputConnectorEditPart.WestPointerFigure)) {
							WestDistance = Math.abs(xLeft
									- actualCurrentPosition);
							if (((connectors.get(i) instanceof AbstractOutputConnectorEditPart) && (xLeft > actualCurrentPosition))
									|| ((connectors.get(i) instanceof AbstractInputConnectorEditPart) && (xLeft < actualCurrentPosition))) {
								if ((WestCurrent == 0)
										|| (WestCurrent > WestDistance)) {
									WestCurrent = WestDistance;
									nearReverseConnector = connectors.get(i);
								}
							}
						}
					}
				}
			}
		}

		if (nearForwardConnector != null) {
			yDistance1 = Math
					.abs((nearForwardConnector.getFigure().getBounds().y + proxyService
							.getFigure().getBounds().getLocation().y)
							- currentFigureLocation.y + 30);
		}
		if (nearReverseConnector != null) {
			yDistance2 = Math
					.abs((nearReverseConnector.getFigure().getBounds().y + proxyService
							.getFigure().getBounds().getLocation().y)
							- currentFigureLocation.y + 30);
		}
		if ((yDistance1 != 0)
				&& ((yDistance2 == 0) || (yDistance1 < yDistance2))) {
			yCurrent = yDistance1;
			nearConnector = nearForwardConnector;
		} else {
			yCurrent = yDistance2;
			nearConnector = nearReverseConnector;
		}
		if (yCurrent > 35) {
			nearConnector = null;
		}

		proxyService = null;
		return nearConnector;
	}

	private static void updateCurrentStates(ShapeNodeEditPart childEditPart) {
		EditPart child = null;

		currentFigureLocation = childEditPart.getFigure().getBounds()
				.getLocation();
		child = childEditPart;
		do {
			child = child.getParent();
		} while ((child != null) && (!(child instanceof ProxyServiceEditPart)));

		for (int l = 0; l < childEditPart.getViewer().getEditPartRegistry()
				.values().size(); ++l) {
			if (childEditPart.getViewer().getEditPartRegistry().values()
					.toArray()[l] instanceof ProxyServiceEditPart) {
				proxyService = (ProxyServiceEditPart) childEditPart.getViewer()
						.getEditPartRegistry().values().toArray()[l];
				if (child.equals(proxyService)) {
					break;
				}
			} else if (childEditPart.getViewer().getEditPartRegistry().values()
					.toArray()[l] instanceof SequencesEditPart) {
				sequences = (SequencesEditPart) childEditPart.getViewer()
						.getEditPartRegistry().values().toArray()[l];
			}
		}

	}

	private static void adjustYvalue(ShapeNodeEditPart childEditPart) {
		/*
		 * When we get the current location of the added figure, it will give
		 * the location related to the Proxy Service. So we have to add the
		 * Proxy Service location or Proxy service's Children's(Fault Sequence
		 * etc.) location to get the absolute location.
		 */

		if (childEditPart.getParent() instanceof MediatorFlowMediatorFlowCompartment6EditPart) {
			currentFigureLocation.y = currentFigureLocation.y
					+ ((ProxyServiceFaultContainerEditPart) ((ProxyServiceContainerEditPart) proxyService
							.getChildren().get(4)).getChildren().get(1))
							.getFigure().getBounds().getLocation().y + 50;
		} else {
			currentFigureLocation.y = currentFigureLocation.y
					+ proxyService.getFigure().getBounds().getLocation().y + 30;
		}

		currentFigureLocation.y = getYAbsolutePosition(currentFigureLocation.y,
				childEditPart);
	}

	private static int getXAbsolutePosition(int currentLocation,
			ShapeNodeEditPart childEditPart) {
		EditPart child = childEditPart;
		if (child != null) {
			do {
				child = child.getParent();
			} while ((child != null)
					&& (!(child instanceof complexFiguredAbstractMediator)));

			if (child instanceof complexFiguredAbstractMediator) {
				return (currentLocation
						+ ((complexFiguredAbstractMediator) child).getFigure()
								.getBounds().getLocation().x + 80);
			} else {
				return currentLocation;
			}

		}
		return -1;

	}

	private static int getYAbsolutePosition(int currentLocation,
			ShapeNodeEditPart childEditPart) {
		EditPart child = childEditPart;
		if (child != null) {
			do {
				child = child.getParent();
			} while ((child != null)
					&& (!(child instanceof complexFiguredAbstractMediator)));

			if (child instanceof complexFiguredAbstractMediator) {
				return (currentLocation
						+ ((complexFiguredAbstractMediator) child).getFigure()
								.getBounds().getLocation().y + 100);
			} else {
				return currentLocation;
			}

		}
		return -1;
	}

}
