package org.wso2.carbonstudio.eclipse.gmf.esb.diagram.custom;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderItemEditPart;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

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
