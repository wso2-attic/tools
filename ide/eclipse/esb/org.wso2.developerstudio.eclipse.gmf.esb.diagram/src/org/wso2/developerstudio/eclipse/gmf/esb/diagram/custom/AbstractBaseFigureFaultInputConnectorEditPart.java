package org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom;

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.wso2.developerstudio.eclipse.gmf.esb.InputConnector;

public abstract class AbstractBaseFigureFaultInputConnectorEditPart extends AbstractInputConnectorEditPart{

	public AbstractBaseFigureFaultInputConnectorEditPart(View view) {
		super(view);
		// TODO Auto-generated constructor stub
	}
	
	abstract protected IFigure createNodeShape();
	
	public void activate() {
		super.activate();
		toggleVisibility((InputConnector)((Node)this.getModel()).getElement());
	}
	
	public void notifyChanged(Notification notification) {
		super.notifyChanged(notification);
		if (notification.getNotifier() instanceof InputConnector) {			
			toggleVisibility((InputConnector)notification.getNotifier());
		}
	}
	
	private void toggleVisibility(InputConnector inputConnector){		
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
