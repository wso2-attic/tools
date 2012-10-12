package org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom;

import java.util.List;

import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.ImageFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderItemEditPart;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Color;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.utils.MediatorFigureReverser;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.EsbLinkEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.FilterMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.SendMediatorEndpointOutputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.SequenceEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbDiagramEditorPlugin;

public abstract class AbstractMediatorInputConnectorEditPart extends AbstractInputConnectorEditPart {

	
	public final boolean isInput=true;
	
	protected IFigure primaryShapeForward;

	protected IFigure primaryShapeReverse;
	
	public NodeFigure figure_;
	
	
	//abstract public IFigure getPrimaryShapeForward(); 
	//abstract public IFigure getPrimaryShapeReverse();
	
	
	public AbstractMediatorInputConnectorEditPart(View view) {
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
				if (((link instanceof AbstractMediatorOutputConnectorEditPart)
						&& (((AbstractMediatorOutputConnectorEditPart) link).getParent() instanceof AbstractMediator)
						&& (((AbstractMediator) ((AbstractMediatorOutputConnectorEditPart) link)
								.getParent()).reversed)) || (link instanceof AbstractEndpointOutputConnectorEditPart)) {
					if(this.getParent() instanceof AbstractMediator){
					((AbstractMediator) this.getParent()).Reverse(this
							.getParent());	
					}
				}
				
				if(this.getParent() instanceof SequenceEditPart){
					if(link instanceof AbstractEndpointOutputConnectorEditPart){
					//((SequenceEditPart)this.getParent()).moveConnectorsRightSide();
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

	public class EastPointerFigure extends RoundedRectangle {

		public EastPointerFigure() {

			/*
			 * this.setBackgroundColor(THIS_BACK); this.setPreferredSize(new
			 * Dimension(getMapMode().DPtoLP(12), getMapMode().DPtoLP(10)));
			 */

			GridLayout layoutThis = new GridLayout();
			layoutThis.numColumns = 1;
			layoutThis.makeColumnsEqualWidth = true;
			layoutThis.marginHeight = 0;
			layoutThis.marginWidth = 0;
			this.setLayoutManager(layoutThis);

			this.setCornerDimensions(new Dimension(1, 1));
			this.setFill(false);
			this.setOutline(false);
			// this.setBackgroundColor(get);
			this.setPreferredSize(new Dimension(22, 18));
			createContents();

		}

		public void createContents() {
			GridData constraintImageRectangle11 = new GridData();
			constraintImageRectangle11.verticalAlignment = GridData.FILL;
			constraintImageRectangle11.horizontalAlignment = GridData.FILL;
			constraintImageRectangle11.horizontalIndent = 0;
			constraintImageRectangle11.horizontalSpan = 1;
			constraintImageRectangle11.verticalSpan = 2;
			constraintImageRectangle11.grabExcessHorizontalSpace = true;
			constraintImageRectangle11.grabExcessVerticalSpace = true;

			ImageDescriptor imgDesc1 = EsbDiagramEditorPlugin
					.getBundledImageDescriptor("icons/ico20/arrowEast.png");
			ImageFigure img1 = new ImageFigure(imgDesc1.createImage());
			img1.setSize(new Dimension(22, 18));

			RectangleFigure imageRectangle11 = new RectangleFigure();
			imageRectangle11.setOutline(false);
			imageRectangle11.setBackgroundColor(new Color(null, 255, 255, 255));
			imageRectangle11.setPreferredSize(new Dimension(22, 18));
			imageRectangle11.add(img1);

			this.add(imageRectangle11, constraintImageRectangle11);

		}

	}

	public class WestPointerFigure extends RoundedRectangle {

		public WestPointerFigure() {

			/*
			 * this.setBackgroundColor(THIS_BACK); this.setPreferredSize(new
			 * Dimension(getMapMode().DPtoLP(12), getMapMode().DPtoLP(10)));
			 */

			GridLayout layoutThis = new GridLayout();
			layoutThis.numColumns = 1;
			layoutThis.makeColumnsEqualWidth = true;
			layoutThis.marginHeight = 0;
			layoutThis.marginWidth = 0;
			this.setLayoutManager(layoutThis);

			this.setCornerDimensions(new Dimension(1, 1));
			this.setFill(false);
			this.setOutline(false);
			// this.setBackgroundColor(get);
			this.setPreferredSize(new Dimension(22, 18));
			createContents();

		}

		public void createContents() {
			GridData constraintImageRectangle11 = new GridData();
			constraintImageRectangle11.verticalAlignment = GridData.FILL;
			constraintImageRectangle11.horizontalAlignment = GridData.FILL;
			constraintImageRectangle11.horizontalIndent = 0;
			constraintImageRectangle11.horizontalSpan = 1;
			constraintImageRectangle11.verticalSpan = 2;
			constraintImageRectangle11.grabExcessHorizontalSpace = true;
			constraintImageRectangle11.grabExcessVerticalSpace = true;

			ImageDescriptor imgDesc1 = EsbDiagramEditorPlugin
					.getBundledImageDescriptor("icons/ico20/arrowWest.png");
			ImageFigure img1 = new ImageFigure(imgDesc1.createImage());
			img1.setSize(new Dimension(22, 18));

			RectangleFigure imageRectangle11 = new RectangleFigure();
			imageRectangle11.setOutline(false);
			imageRectangle11.setBackgroundColor(new Color(null, 255, 255, 255));
			imageRectangle11.setPreferredSize(new Dimension(22, 18));
			imageRectangle11.add(img1);

			this.add(imageRectangle11, constraintImageRectangle11);

		}

	}
	
	static final Color THIS_BACK = new Color(null, 50, 50, 50);

}
