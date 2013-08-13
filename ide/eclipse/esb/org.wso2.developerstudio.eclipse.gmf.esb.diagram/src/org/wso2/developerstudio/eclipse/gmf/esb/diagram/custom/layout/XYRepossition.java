package org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.layout;

import java.util.List;

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
				/*
				 * Resize compartment size
				 */
				org.eclipse.draw2d.geometry.Rectangle constraints = new org.eclipse.draw2d.geometry.Rectangle(
						0, 100, x, y);

				
				((GraphicalEditPart) parent.getParent().getParent()).setLayoutConstraint(
						parent.getParent(), ((GraphicalEditPart) parent.getParent()).getFigure(),
						constraints);
				
				if(parent instanceof MediatorFlowMediatorFlowCompartment5EditPart){
				
				((GraphicalEditPart) parent.getParent().getParent().getParent())
						.setLayoutConstraint(parent.getParent().getParent(),
								((GraphicalEditPart) parent.getParent().getParent()).getFigure(),
								constraints);

				}
				/*
				 * Resize complex mediator
				 */								
/*				EditPart parentEditpart=parent.getParent();
				while((parentEditpart.getParent()!=null)&&!(parentEditpart  instanceof AbstractMediator)){
					parentEditpart=parentEditpart.getParent();
				}*/
				AbstractMediator mediator=EditorUtils.getMediator(parent);
				if(mediator instanceof complexFiguredAbstractMediator){
				((IGraphicalEditPart)mediator).getFigure().getBounds().setWidth(x+90);
				((IGraphicalEditPart)mediator).getFigure().getBounds().setHeight(y+(2*complexMediatorCompartmentGap));
				}
				
			}
			parent = (IGraphicalEditPart) parent.getParent();
		}
	}

	public static void reArrange(IGraphicalEditPart editPart) {
		
		IGraphicalEditPart parent = editPart;
		while (!(parent instanceof EsbServerEditPart)) {
		if((parent instanceof AbstractMediatorFlowCompartmentEditPart)||(parent instanceof AbstractMediatorCompartmentEditPart)){

			
			
		int arraowLength = 50;
		int connectorLength = 5;
		int x = arraowLength + connectorLength;
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
		

		while (node instanceof AbstractMediator) {
			//Rectangle bound = ((GraphicalEditPart) node).getFigure().getBounds();
			
			int y = ((IGraphicalEditPart) parent.getParent()).getFigure().getBounds().height / 2;
			y = y - node.getFigure().getBounds().height / 2 - 10;

			Rectangle constraints = new Rectangle(x, y, ((GraphicalEditPart) node).getFigure()
					.getBounds().width, ((GraphicalEditPart) node).getFigure().getBounds().height);
			if (node instanceof AbstractMediator) {
				((AbstractMediator) node).x = x;
				((AbstractMediator) node).y = y;
			}
			((GraphicalEditPart) ((GraphicalEditPart) node).getParent()).setLayoutConstraint(
					(EditPart) node, ((GraphicalEditPart) node).getFigure(), constraints);

			x = x + (arraowLength) + ((GraphicalEditPart) node).getFigure()
					.getBounds().width + (2 * connectorLength);
			List sourceConnections=EditorUtils.getOutputConnector((ShapeNodeEditPart) node).getSourceConnections();
			if (sourceConnections != null) {
				if(sourceConnections.size()!=0){
				node = (ShapeNodeEditPart) ((EsbLinkEditPart) sourceConnections.get(0))
						.getTarget().getParent();
				}else{
				break;
			}
			}
		}
		}
		parent = (IGraphicalEditPart) parent.getParent();
		}
	}

}
