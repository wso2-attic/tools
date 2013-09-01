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
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.CloneMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.CloneTargetContainerEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.EsbLinkEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.EsbServerEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.FilterFailContainerEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.FilterMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.FilterPassContainerEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.MediatorFlowMediatorFlowCompartment10EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.MediatorFlowMediatorFlowCompartment11EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.MediatorFlowMediatorFlowCompartment2EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.MediatorFlowMediatorFlowCompartment4EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.MediatorFlowMediatorFlowCompartment5EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.MediatorFlowMediatorFlowCompartment7EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.MediatorFlowMediatorFlowCompartment8EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.MediatorFlowMediatorFlowCompartment9EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.SwitchCaseContainerEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.SwitchDefaultContainerEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.SwitchMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.ThrottleMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.ThrottleOnAcceptContainerEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.ThrottleOnRejectContainerEditPart;

public class XYRepossition {

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
		int complexMediatorCompartmentGap = 5;
		int arraowLength = 50;
		int connectorLength = 5;
		int constantY = 60;
		int p = parent.getChildren().size();
		int x = (2 * connectorLength) + arraowLength;
		int y = 0;
		for (int i = 0; i < p; ++i) {
			Rectangle bound = ((GraphicalEditPart) parent.getChildren().get(i)).getFigure().getBounds();
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
			
			
			
			/*
			 * Set bounds since layout constraints are suppose to be applied in
			 * next UI update, this bounds will be used in rearranging elements.
			 */
			((GraphicalEditPart) parent.getParent().getParent()).getFigure().setBounds(constraints);
				
			if (parent instanceof MediatorFlowMediatorFlowCompartment5EditPart) {

				if (p == 0) {
					/*
					 * Sequence doesn't contain any children, bring it to its
					 * initial size
					 */
					constraints.setHeight(125);
					constraints.setWidth(195);
				}
				((GraphicalEditPart) parent.getParent().getParent().getParent())
						.setLayoutConstraint(parent.getParent().getParent(),
								((GraphicalEditPart) parent.getParent().getParent()).getFigure(),
								constraints);	
				
				/*
				 * Set bounds since layout constraints are suppose to be applied
				 * in next UI update, this bounds will be used in rearranging
				 * elements.
				 */
				((GraphicalEditPart) parent.getParent().getParent().getParent()).getFigure()
						.setBounds(constraints);
			}
			

			int boundsWidth = x + 90;
			int boundsHeight = y + (2 * complexMediatorCompartmentGap);
			AbstractMediator mediator = EditorUtils.getMediator(parent);
			//EditPart ePart = EditorUtils.getComplexMediator(parent);

			if (mediator instanceof complexFiguredAbstractMediator) {
				
				if(parent != null && parent.getChildren().size() == 0) {
					/*
					 * Complex mediator doesn't contain any children,
					 * bring it to its initial size. 
					 */
					boundsWidth = 170;
					boundsHeight = 100; //initial size
				} 
				
				if (mediator instanceof FilterMediatorEditPart
					|| mediator instanceof SwitchMediatorEditPart
					|| mediator instanceof ThrottleMediatorEditPart
					|| mediator instanceof CloneMediatorEditPart){
						int totalHeight = getTotalYFromChildren((ShapeNodeEditPart)parent.getParent().getParent());
						int totalKids = getTotalChildCount((ShapeNodeEditPart)parent.getParent().getParent());
						if (totalKids == 0) {
							boundsHeight = 100; //initial size
						} else {
							boundsHeight = totalHeight + constantY + 20;
						}
				}
				
				
				((IGraphicalEditPart) mediator).getFigure().getBounds().setWidth(boundsWidth);
				((IGraphicalEditPart) mediator).getFigure().getBounds().setHeight(boundsHeight);
			}
			
		}
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
		
		if((editPart instanceof AbstractMediatorFlowCompartmentEditPart)){
			int verticalSpacing = 0;
			int arraowLength = 50;
			int connectorLength = 5;
			int arrowAndtwoConnectorsLength = arraowLength + 2 * connectorLength;
			int x = arrowAndtwoConnectorsLength - connectorLength;
			ShapeNodeEditPart node = getLeftMostNodeFromEditPart(editPart);
			
			
			while (node instanceof AbstractMediator) {
				
				int y = ((IGraphicalEditPart) editPart.getParent().getParent()).getFigure().getBounds().height / 2;
				if(editPart instanceof MediatorFlowMediatorFlowCompartment5EditPart) {
					// Title bar width of the sequences editor. 
					verticalSpacing = 20;
				} /*else if(editPart instanceof MediatorFlowMediatorFlowCompartment7EditPart 		// filter pass
						|| editPart instanceof MediatorFlowMediatorFlowCompartment8EditPart		// filter fail
						|| editPart instanceof MediatorFlowMediatorFlowCompartment9EditPart		// throttle onaccept
						|| editPart instanceof MediatorFlowMediatorFlowCompartment10EditPart	// throttle onreject
						|| editPart instanceof MediatorFlowMediatorFlowCompartment2EditPart		// switch case
						|| editPart instanceof MediatorFlowMediatorFlowCompartment4EditPart		// switch default
						|| editPart instanceof MediatorFlowMediatorFlowCompartment11EditPart) { // clone target
					//set 20 because of abov mediators have a title and we need space for those
					verticalSpacing = 10;
				} */else {
					verticalSpacing = 10;
				}
				
				y = y - node.getFigure().getBounds().height / 2 - verticalSpacing;
	
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
		
		if (first instanceof FilterPassContainerEditPart
			|| first instanceof FilterFailContainerEditPart
			|| first instanceof ThrottleOnAcceptContainerEditPart
			|| first instanceof ThrottleOnRejectContainerEditPart
			|| first instanceof SwitchCaseContainerEditPart
			|| first instanceof SwitchDefaultContainerEditPart
			|| first instanceof CloneTargetContainerEditPart) {
			
			int editPartIndex = getEditPartIndexFromParent(first);
			ShapeNodeEditPart mediatorEditPart = (ShapeNodeEditPart) first.getParent().getParent();
			firstOutputConnector = EditorUtils.getMediatorAdditionalOutputConnectors(mediatorEditPart).get(editPartIndex);
			
		} else{
			if(EditorUtils.getMediatorAdditionalOutputConnectors(first).size() ==0){
				firstOutputConnector=EditorUtils.getOutputConnector(first);
			}else{
				firstOutputConnector=EditorUtils.getMediatorAdditionalOutputConnectors(first).get(0);
			}
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
			y += getMaximumY((IGraphicalEditPart)child);
		}
		return y;
	}
	
	private static int getMaximumY(IGraphicalEditPart parent){
		int y = 0;
		IGraphicalEditPart mediatorFlow = (IGraphicalEditPart) parent.getChildren().get(0);
		IGraphicalEditPart mediatorFlowCompartment = (IGraphicalEditPart) mediatorFlow.getChildren().get(0);
		if (mediatorFlowCompartment.getChildren().size() >= 1) {
			for (int i = 0; i < mediatorFlowCompartment.getChildren().size(); ++i) {
				GraphicalEditPart gep = (GraphicalEditPart) mediatorFlowCompartment.getChildren().get(i);
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
			childCount += getChildCount((IGraphicalEditPart)child);
		}
		return childCount;
	}
	
	private static int getChildCount(IGraphicalEditPart parent){
		IGraphicalEditPart mediatorFlow = (IGraphicalEditPart) parent.getChildren().get(0);
		IGraphicalEditPart mediatorFlowCompartment = (IGraphicalEditPart) mediatorFlow.getChildren().get(0);
		int childCount = mediatorFlowCompartment.getChildren().size();
		return childCount;
	}
}
