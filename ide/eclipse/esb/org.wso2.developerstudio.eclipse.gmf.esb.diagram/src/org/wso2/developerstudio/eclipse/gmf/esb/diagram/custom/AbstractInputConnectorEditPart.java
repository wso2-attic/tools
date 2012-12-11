package org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.wso2.developerstudio.eclipse.gmf.esb.InputConnector;

public abstract class AbstractInputConnectorEditPart extends AbstractConnectorEditPart{

	abstract protected IFigure createNodeShape();
	
	public AbstractInputConnectorEditPart(View view) {
		super(view);
	}
	
	public void notifyChanged(Notification notification) {
		super.notifyChanged(notification);
		if (notification.getNotifier() instanceof Node) {
			if (((Node) notification.getNotifier()).getElement() instanceof InputConnector) {
				EditPart element = (EditPart) getViewer().getEditPartRegistry().get(
						notification.getNotifier());
				if (((AbstractInputConnectorEditPart) element).getTargetConnections().size() == 0) {
					if (((InputConnector) ((Node) notification.getNotifier()).getElement())
							.getIncomingLinks().size() != 0) {
						Collection col = new ArrayList();
						col.add(((InputConnector) ((Node) notification.getNotifier()).getElement())
								.getIncomingLinks().get(0));

						org.eclipse.emf.edit.command.DeleteCommand del = new org.eclipse.emf.edit.command.DeleteCommand(
								getEditingDomain(), col);
						if (del.canExecute()) {
							getEditingDomain().getCommandStack().execute(del);
						}
					}
				}
			}
		}
	}
	
	protected void toggleVisibility(InputConnector inputConnector){		
		if (inputConnector.getIncomingLinks().size() != 0) {
			/*
			 * This will remove the arrow head of output connector if it is
			 * connected to any other input connector.
			 */
			NodeFigure figureInput = this.getNodeFigure();
			figureInput.removeAll();
			Figure emptyFigure = new Figure();
			figureInput.add(emptyFigure);
		} else {
			/*
			 * This will add the arrow head of output connector if it is not
			 * connected to any other input connector.
			 */
			NodeFigure figureInput = this.getNodeFigure();
			figureInput.removeAll();
			figureInput.add(createNodeShape());
		}		
	}
}
