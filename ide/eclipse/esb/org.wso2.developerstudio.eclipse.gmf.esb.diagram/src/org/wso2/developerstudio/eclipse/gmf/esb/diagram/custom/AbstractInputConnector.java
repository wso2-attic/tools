package org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom;

import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderItemEditPart;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.utils.MediatorFigureReverser;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.EsbLinkEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.FilterMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.SendMediatorEndpointOutputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.SequenceEditPart;

public abstract class AbstractInputConnector extends AbstractBorderItemEditPart {

	
	public final boolean isInput=true;
	
	protected IFigure primaryShapeForward;

	protected IFigure primaryShapeReverse;
	
	public NodeFigure figure_;
	
	
	//abstract public IFigure getPrimaryShapeForward(); 
	//abstract public IFigure getPrimaryShapeReverse();
	
	
	public AbstractInputConnector(View view) {
		super(view);
		// TODO Auto-generated constructor stub
	}

	protected NodeFigure createNodeFigure() {
		// TODO Auto-generated method stub
		return null;
	}
	


	public NodeFigure getNodeFigureInput() {

		return figure_;
	}
	

	protected IFigure createNodeShapeForward() {
		return primaryShapeForward = new EastPointerFigure();
	}

	protected IFigure createNodeShapeReverse() {
		return primaryShapeReverse = new WestPointerFigure();
	}


	public EastPointerFigure getPrimaryShapeForward() {
		return (EastPointerFigure) primaryShapeForward;
	}

	public WestPointerFigure getPrimaryShapeReverse() {
		return (WestPointerFigure) primaryShapeReverse;

	}
	
	public void notifyChanged(Notification notification) {
		int direction = -1;
		super.notifyChanged(notification);
		if (notification.getEventType() == Notification.ADD) {
			/*
			 * You can directly call Reverse(EditPart) method here. But it will
			 * lead to reduce the performance since it will call
			 * Reverse(EditPart) for each and every notifyChange event. So we
			 * will filter the request to some extend.
			 */
			if (this.getTargetConnections().size() != 0) {
				EditPart link = ((EsbLinkEditPart) this.getTargetConnections()
						.get(0)).getSource();
				if ((link instanceof AbstractOutputConnector)
						&& (((AbstractOutputConnector) link).getParent() instanceof AbstractMediator)
						&& (((AbstractMediator) ((AbstractOutputConnector) link)
								.getParent()).reversed) || (link instanceof AbstractEndpointOutputConnector)) {					
					((AbstractMediator) this.getParent()).Reverse(this
							.getParent());	
				}
				
				if(this.getParent() instanceof SequenceEditPart){
					if(link instanceof AbstractEndpointOutputConnector){
					((SequenceEditPart)this.getParent()).moveConnectorsRightSide();
					}
				}
			}
		}
	}
	
	@Override
	public boolean isSelectable() {
		// TODO Auto-generated method stub
		return false;
	}

	public class EastPointerFigure extends EastPointerShape {


		public EastPointerFigure() {

			this.setBackgroundColor(THIS_BACK);
			this.setPreferredSize(new Dimension(getMapMode().DPtoLP(12),
					getMapMode().DPtoLP(10)));
		}

	}

	public class WestPointerFigure extends WestPointerShape {

		public WestPointerFigure() {

			this.setBackgroundColor(THIS_BACK);
			this.setPreferredSize(new Dimension(getMapMode().DPtoLP(12),
					getMapMode().DPtoLP(10)));
		}

	}
	
	static final Color THIS_BACK = new Color(null, 50, 50, 50);

}
