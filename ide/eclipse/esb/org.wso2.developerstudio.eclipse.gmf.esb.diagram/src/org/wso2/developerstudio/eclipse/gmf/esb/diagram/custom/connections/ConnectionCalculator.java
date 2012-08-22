package org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.connections;

import java.util.ArrayList;
import java.util.HashMap;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderedShapeEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.AbstractMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.AbstractOutputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.complexFiguredAbstractMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.EsbLinkEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.ProxyServiceEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.SequencesEditPart;

/*
 * This calss is used to handle automatic connection creation stuffs. 
 * 
 */
public class ConnectionCalculator {
	
	private final static int EAST=0;
	private final static int WEST=1;

	public static AbstractBorderedShapeEditPart getNearestElementEditPart(
			EditPart parentEditPart, AbstractBorderedShapeEditPart childEditPart) {
		HashMap<Integer, AbstractMediator> map = new HashMap<Integer, AbstractMediator>();
		double current = 0.0;
		int nearest = 0;

		if (childEditPart != null) {
			Point currentFigureLocation = ((AbstractMediator) childEditPart)
					.getFigure().getBounds().getLocation();
			for (int i = 0; i < parentEditPart.getChildren().size(); ++i) {
				if(!parentEditPart.getChildren().get(i).equals(childEditPart)){
				double distance = ((AbstractMediator) parentEditPart
						.getChildren().get(i)).getFigure().getBounds()
						.getLocation().getDistance(currentFigureLocation);
				if (current == 0.0) {
					current = distance;
				} else if (distance < current) {
					current = distance;
					nearest = i;
				}
				map.put(i,(AbstractMediator) parentEditPart.getChildren().get(i));
				}
			}
		}
		
		AbstractBorderedShapeEditPart nearestElementEditpart=map.get(nearest);
		
		return nearestElementEditpart;
	}
	
	public static EsbLinkEditPart getNearestLinkEditPart(ArrayList links,
			AbstractBorderedShapeEditPart childEditPart) {
		double current = 0.0;
		ProxyServiceEditPart proxyService = null;
		SequencesEditPart sequences =null;
		ArrayList<EsbLinkEditPart> nearLinks = new ArrayList<EsbLinkEditPart>();
		Point currentFigureLocation = null;
		double distance = 0.0;
		EsbLinkEditPart nearestLink = null;
		EditPart child=null;

		if (childEditPart != null) {
			currentFigureLocation = ((AbstractMediator) childEditPart)
					.getFigure().getBounds().getLocation();
			child=childEditPart;
			do {
				child = child.getParent();
			} while ((child !=null) && (!(child instanceof ProxyServiceEditPart)));
			
			for (int l = 0; l < childEditPart.getViewer().getEditPartRegistry()
					.values().size(); ++l) {
				if (childEditPart.getViewer().getEditPartRegistry().values()
						.toArray()[l] instanceof ProxyServiceEditPart) {					
					proxyService = (ProxyServiceEditPart) childEditPart
							.getViewer().getEditPartRegistry().values()
							.toArray()[l];	
					if(child.equals(proxyService)){
					break;
					}
				}else if(childEditPart.getViewer().getEditPartRegistry().values()
						.toArray()[l] instanceof SequencesEditPart){
					sequences = (SequencesEditPart) childEditPart
					.getViewer().getEditPartRegistry().values()
					.toArray()[l];
				}
			}
			
			if(proxyService!=null){
			/*
			 * When we get the current location of the added figure, it will
			 * give the location related to the Proxy Service. So we have to add
			 * the Proxy Service location to get the absolue location.
			 */
			currentFigureLocation.y = currentFigureLocation.y
					+ proxyService.getFigure().getBounds().getLocation().y + 30;
			currentFigureLocation.y=getYAbsolutePosition(currentFigureLocation.y,childEditPart);

			for (int i = 0; i < links.size(); ++i) {
				if (!links.get(i).equals(childEditPart)) {
					int xLeft = ((EsbLinkEditPart) links.get(i)).getFigure()
							.getBounds().getLeft().x;
					int xRight = (((EsbLinkEditPart) links.get(i)).getFigure()
							.getBounds().getRight().x);
					
					/*
					 * When we get the current location of the added figure, it will
					 * give the location related to the Proxy Service. So we have to add
					 * the Proxy Service location to get the absolue location.
					 */
					int actualCurrentPosition = currentFigureLocation.x
							+ proxyService.getFigure().getBounds()
									.getLocation().x + 75;
					actualCurrentPosition=getXAbsolutePosition(actualCurrentPosition,childEditPart);
					if ((xLeft < actualCurrentPosition)
							&& (actualCurrentPosition < xRight)) {
						nearLinks.add((EsbLinkEditPart) links.get(i));
					}
				}
			}
			}else if(sequences !=null){
				/*
				 * When we get the current location of the added figure, it will
				 * give the location related to the Sequences figure. So we have to add
				 * the Sequences figure location to get the absolue location.
				 */
				currentFigureLocation.y = currentFigureLocation.y
						+ sequences.getFigure().getBounds().getLocation().y + 30;
				currentFigureLocation.y=getYAbsolutePosition(currentFigureLocation.y,childEditPart);

				for (int i = 0; i < links.size(); ++i) {
					if (!links.get(i).equals(childEditPart)) {
						int xLeft = ((EsbLinkEditPart) links.get(i)).getFigure()
								.getBounds().getLeft().x;
						int xRight = (((EsbLinkEditPart) links.get(i)).getFigure()
								.getBounds().getRight().x);
						
						/*
						 * When we get the current location of the added figure, it will
						 * give the location related to the Sequences figure. So we have to add
						 * the Sequences figure location to get the absolue location.
						 */
						int actualCurrentPosition = currentFigureLocation.x
								+ sequences.getFigure().getBounds()
										.getLocation().x + 75;
						actualCurrentPosition=getXAbsolutePosition(actualCurrentPosition,childEditPart);
						if ((xLeft < actualCurrentPosition)
								&& (actualCurrentPosition < xRight)) {
							nearLinks.add((EsbLinkEditPart) links.get(i));
						}
					}
				}
			}
		}
		for (int q = 0; q < nearLinks.size(); ++q) {
			distance = (((nearLinks.get(q).getFigure().getBounds().getLeft().y) + (nearLinks
					.get(q).getFigure().getBounds().getRight().y)) / 2)
					- currentFigureLocation.y;
			distance = Math.abs(distance);
			if (current == 0.0) {
				current = distance;
				nearestLink = (EsbLinkEditPart) nearLinks.get(q);
			} else if (distance < current) {
				current = distance;
				nearestLink = (EsbLinkEditPart) nearLinks.get(q);
			}
		}
		if(current>20){
			return null;
		}
		return nearestLink;
	}
	
	
	public AbstractBorderItemEditPart getNearestOutputConnectorEditPart(EditPart parentEditPart, AbstractBorderedShapeEditPart childEditPart){		
		AbstractOutputConnector nearestOutputConnectorEditPart = null;
		AbstractBorderedShapeEditPart nearestElement=getNearestElementEditPart(parentEditPart,childEditPart);
		if(nearestElement!=null){
		for(int j=0;j<nearestElement.getChildren().size();++j){
			if(nearestElement.getChildren().get(j) instanceof AbstractOutputConnector){
				nearestOutputConnectorEditPart=(AbstractOutputConnector) nearestElement.getChildren().get(j);
			}
		}
		}
		return nearestOutputConnectorEditPart;
	}
	
	private AbstractBorderItemEditPart getOutputConnector(AbstractBorderedShapeEditPart editpart){
		for(int i=0;i<editpart.getChildren().size();++i){
			if(editpart.getChildren().get(i) instanceof AbstractOutputConnector){
				return (AbstractBorderItemEditPart) editpart.getChildren().get(i);
			}
		}
		return null;
	}
	
	public int getSideRelatedToNearest(AbstractBorderedShapeEditPart nearestElementEditpart,AbstractBorderedShapeEditPart childEditPart){
		if(nearestElementEditpart!=null && childEditPart!=null){
		return (nearestElementEditpart.getFigure().getBounds().getLocation().x > childEditPart.getFigure().getBounds().getLocation().x) ? WEST:EAST ;
		}
		return -1;
	}
	
	private static int getXAbsolutePosition(int currentLocation,AbstractBorderedShapeEditPart childEditPart){
		EditPart child=childEditPart;
		if(child !=null){			
		do {
			child = child.getParent();
		} while ((child!=null) && (!(child instanceof complexFiguredAbstractMediator)));
		
		if(child instanceof complexFiguredAbstractMediator){
			return (currentLocation+((complexFiguredAbstractMediator)child).getFigure().getBounds().getLocation().x+80);
		}
		else{
			return currentLocation; 
		}
		
		}
		return -1;
		
	}
	
	private static int getYAbsolutePosition(int currentLocation,AbstractBorderedShapeEditPart childEditPart){
		EditPart child=childEditPart;
		if(child !=null){			
		do {
			child = child.getParent();
		} while ((child!=null) && (!(child instanceof complexFiguredAbstractMediator)));
		
		if(child instanceof complexFiguredAbstractMediator){
			return (currentLocation+((complexFiguredAbstractMediator)child).getFigure().getBounds().getLocation().y+100);
		}
		else{
			return currentLocation; 
		}
		
		}
		return -1;
	}
	
}
