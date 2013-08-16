package org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.layout;

import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.notation.Bounds;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.AbstractMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.AbstractMediatorCompartmentEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.AbstractMediatorFlowCompartmentEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.AbstractOutputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.EditorUtils;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.complexFiguredAbstractMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.AggregateMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.EsbLinkEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.EsbServerEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.MediatorFlowMediatorFlowCompartment5EditPart;

public class XYRepossition {

	public static void resizeContainers(IGraphicalEditPart editPart) {
		IGraphicalEditPart parent = editPart;
		while (!(parent instanceof EsbServerEditPart)) {
			resizeEditpart(parent);
			parent = (IGraphicalEditPart) parent.getParent();
		}
	}

	private static void resizeEditpart(IGraphicalEditPart parent) {
		int complexMediatorCompartmentGap=5;
		int arraowLength = 50;
		int connectorLength = 5;
		int constantY = 50;
		int p = parent.getChildren().size();
		int x = (2 * connectorLength) + arraowLength;
		int y = 0;
		for (int i = 0; i < p; ++i) {
			Rectangle bound = ((GraphicalEditPart) parent.getChildren().get(i)).getFigure()
					.getBounds();
			x = (arraowLength) + bound.width + (2 * connectorLength) + x;
			if (bound.height > y) {
				y = bound.height;
			}
		}
		y = y + constantY;
		if (parent instanceof AbstractMediatorFlowCompartmentEditPart) {
	
			Rectangle constraints = new Rectangle(0, 100, x, y);

			((GraphicalEditPart) parent.getParent().getParent()).setLayoutConstraint(
					parent.getParent(), ((GraphicalEditPart) parent.getParent()).getFigure(),
					constraints);
			
			if(parent instanceof MediatorFlowMediatorFlowCompartment5EditPart){
			
			((GraphicalEditPart) parent.getParent().getParent().getParent())
					.setLayoutConstraint(parent.getParent().getParent(),
							((GraphicalEditPart) parent.getParent().getParent()).getFigure(),
							constraints);

			}

			AbstractMediator mediator=EditorUtils.getMediator(parent);
			if(mediator instanceof complexFiguredAbstractMediator){
			((IGraphicalEditPart)mediator).getFigure().getBounds().setWidth(x+90);
			((IGraphicalEditPart)mediator).getFigure().getBounds().setHeight(y+(2*complexMediatorCompartmentGap));
			}
			
		}
	}

	public static void reArrange(IGraphicalEditPart editPart) {
		
		IGraphicalEditPart parent = editPart;
		while (!(parent instanceof EsbServerEditPart)) {
			rearrangeChildren(parent);
			parent = (IGraphicalEditPart) parent.getParent();
		}
	}

	private static void rearrangeChildren(IGraphicalEditPart editPart) {
		
		if((editPart instanceof AbstractMediatorFlowCompartmentEditPart)){
			int arraowLength = 50;
			int connectorLength = 5;
			int arrowAndtwoConnectorsLength = arraowLength + 2 * connectorLength;
			int x = arrowAndtwoConnectorsLength - arraowLength;
			ShapeNodeEditPart node = getLeftMostNodeFromEditPart(editPart);
			
			
			while (node instanceof AbstractMediator) {
				
				int y = ((IGraphicalEditPart) editPart.getParent()).getFigure().getBounds().height / 2;
				y = y - node.getFigure().getBounds().height / 2 - 10;
	
				((AbstractMediator) node).x = x;
				((AbstractMediator) node).y = y;
	
				IFigure nodeFigure = ((GraphicalEditPart) node).getFigure();
				int nodeFigureWdith = nodeFigure.getBounds().width;
				int nodeFigureHeight = nodeFigure.getBounds().height;
				Rectangle constraints = new Rectangle(x, y, nodeFigureWdith, nodeFigureHeight);
				
				GraphicalEditPart nodeParent = ((GraphicalEditPart) ((GraphicalEditPart) node).getParent());
				nodeParent.setLayoutConstraint((EditPart) node, nodeFigure, constraints);
				x = x + arrowAndtwoConnectorsLength + nodeFigureWdith;
				
				AbstractOutputConnectorEditPart nodeOPconector = EditorUtils.getMediatorOutputConnector((ShapeNodeEditPart) node);
				List sourceConnections = nodeOPconector.getSourceConnections();
				
				if (sourceConnections != null) {
					if(sourceConnections.size()!=0){
						EsbLinkEditPart linkPart = (EsbLinkEditPart) sourceConnections.get(0);
						node = (ShapeNodeEditPart) linkPart.getTarget().getParent();
					}else{
						break;
					}
				}
			}
		}
	}
	

	private static ShapeNodeEditPart getLeftMostNodeFromEditPart(
			IGraphicalEditPart parent) {
		ShapeNodeEditPart first = (ShapeNodeEditPart) parent.getParent().getParent();
		ShapeNodeEditPart node = null;
		AbstractOutputConnectorEditPart firstOutputConnector=null;
		if(EditorUtils.getMediatorAdditionalOutputConnectors(first).size() ==0){
			firstOutputConnector=EditorUtils.getOutputConnector(first);
		}else{
			firstOutputConnector=EditorUtils.getMediatorAdditionalOutputConnectors(first).get(0);
		}
			
			
		if (firstOutputConnector != null) {
			if (firstOutputConnector.getSourceConnections() != null) {
				if (firstOutputConnector.getSourceConnections().size() != 0) {
					node = (ShapeNodeEditPart) ((EsbLinkEditPart) firstOutputConnector.getSourceConnections().get(0)).getTarget()
							.getParent();
				}
			}
		}
		return node;
	}

}
