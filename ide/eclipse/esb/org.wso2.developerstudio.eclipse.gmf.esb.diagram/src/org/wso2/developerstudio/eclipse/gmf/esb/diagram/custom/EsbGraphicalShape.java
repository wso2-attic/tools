package org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.ImageFigure;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbDiagramEditorPlugin;

public class EsbGraphicalShape extends RoundedRectangle {
	RectangleFigure propertyValueRectangle1;

	public EsbGraphicalShape() {
		GridLayout layoutThis = new GridLayout();
		layoutThis.numColumns = 1;
		layoutThis.makeColumnsEqualWidth = true;
		layoutThis.marginHeight = 0;
		layoutThis.marginWidth = 0;
		this.setLayoutManager(layoutThis);

		this.setCornerDimensions(new Dimension(1, 1));
		this.setFill(false);
		this.setOutline(false);
		//this.setBackgroundColor(get);
		this.setPreferredSize(new Dimension(75, 55));
		createContents();
	}

	private void createContents() {

		RoundedRectangle graphicalNodeContainer0 = new RoundedRectangle();
		graphicalNodeContainer0.setCornerDimensions(new Dimension(1, 1));
		graphicalNodeContainer0.setOutline(false);
		graphicalNodeContainer0.setBackgroundColor(this.getBackgroundColor());
		graphicalNodeContainer0.setPreferredSize(new Dimension(100, 40));
		LineBorder border0 = new LineBorder(this.getBackgroundColor(), 1, SWT.BORDER_SOLID);
		graphicalNodeContainer0.setBorder(border0);

		GridData constraintGraphicalNodeContainer0 = new GridData();
		constraintGraphicalNodeContainer0.verticalAlignment = GridData.CENTER;
		constraintGraphicalNodeContainer0.horizontalAlignment = GridData.CENTER;
		constraintGraphicalNodeContainer0.horizontalIndent = 0;
		constraintGraphicalNodeContainer0.horizontalSpan = 1;
		constraintGraphicalNodeContainer0.verticalSpan = 1;
		constraintGraphicalNodeContainer0.grabExcessHorizontalSpace = false;
		constraintGraphicalNodeContainer0.grabExcessVerticalSpace = false;
		//this.add(graphicalNodeContainer0, constraintGraphicalNodeContainer0);
		
		
		GridData constraintMainImageRectangle = new GridData();
		constraintMainImageRectangle.verticalAlignment = GridData.FILL;
		constraintMainImageRectangle.horizontalAlignment = GridData.FILL;
		constraintMainImageRectangle.horizontalIndent = 0;
		constraintMainImageRectangle.horizontalSpan = 1;
		constraintMainImageRectangle.verticalSpan = 2;
		constraintMainImageRectangle.grabExcessHorizontalSpace = true;
		constraintMainImageRectangle.grabExcessVerticalSpace = true;
		
		
		
		ImageDescriptor mainImgDesc = EsbDiagramEditorPlugin
				.getBundledImageDescriptor(getIconPath());
		
		Image image =mainImgDesc.createImage();
		Image scaled = new Image(Display.getDefault(), 36, 52);
        GC gc = new GC(scaled);
        gc.setAntialias(SWT.ON);
        gc.setInterpolation(SWT.HIGH);
        gc.drawImage(image, 0, 0, image.getBounds().width, image.getBounds().height, 0, 0, 36,
                     52);
        gc.dispose();
		
		
		
		ImageFigure mainImg = new ImageFigure(scaled);
		mainImg.setSize(new Dimension(75, 55));
		RectangleFigure mainImageRectangle = new RectangleFigure();
		mainImageRectangle.setOutline(false);
		mainImageRectangle.setBackgroundColor(new Color(null, 255, 255, 255));
		mainImageRectangle.setPreferredSize(new Dimension(75, 55));
		mainImageRectangle.add(mainImg);
		this.add(mainImageRectangle, constraintMainImageRectangle);		
		

		GridLayout layoutGraphicalNodeContainer0 = new GridLayout();
		layoutGraphicalNodeContainer0.numColumns = 2;
		layoutGraphicalNodeContainer0.makeColumnsEqualWidth = false;
		layoutGraphicalNodeContainer0.horizontalSpacing = 1;
		layoutGraphicalNodeContainer0.verticalSpacing = 0;
		layoutGraphicalNodeContainer0.marginHeight = -1;
		layoutGraphicalNodeContainer0.marginWidth = -1;
		graphicalNodeContainer0.setLayoutManager(layoutGraphicalNodeContainer0);

		ImageDescriptor imgDesc = EsbDiagramEditorPlugin
				.getBundledImageDescriptor(getIconPath());
		ImageFigure img = new ImageFigure(imgDesc.createImage());
		img.setSize(new Dimension(36, 40));

		RectangleFigure imageRectangle1 = new RectangleFigure();
		imageRectangle1.setOutline(false);
		imageRectangle1.setBackgroundColor(new Color(null, 255,255,255));
		imageRectangle1.setPreferredSize(new Dimension(36, 40));
		imageRectangle1.add(img);

		GridData constraintImageRectangle1 = new GridData();
		constraintImageRectangle1.verticalAlignment = GridData.FILL;
		constraintImageRectangle1.horizontalAlignment = GridData.FILL;
		constraintImageRectangle1.horizontalIndent = 0;
		constraintImageRectangle1.horizontalSpan = 1;
		constraintImageRectangle1.verticalSpan = 2;
		constraintImageRectangle1.grabExcessHorizontalSpace = true;
		constraintImageRectangle1.grabExcessVerticalSpace = true;
		//graphicalNodeContainer0.add(imageRectangle1, constraintImageRectangle1);

		imageRectangle1.setLayoutManager(new StackLayout());

		// Rectangle to contain the type name label (eg: Log, Drop) on upper right
		//------------------------------------------------------------------------
		RectangleFigure esbNodeTypeNameRectangle1 = new RectangleFigure();
		esbNodeTypeNameRectangle1.setOutline(false);
		esbNodeTypeNameRectangle1
				.setBackgroundColor(getLabelBackColor());
		esbNodeTypeNameRectangle1.setPreferredSize(new Dimension(64, 20));

		GridData constraintEsbNodeTypeNameRectangle1 = new GridData();
		constraintEsbNodeTypeNameRectangle1.verticalAlignment = GridData.CENTER;
		constraintEsbNodeTypeNameRectangle1.horizontalAlignment = GridData.CENTER;
		constraintEsbNodeTypeNameRectangle1.horizontalIndent = 0;
		constraintEsbNodeTypeNameRectangle1.horizontalSpan = 1;
		constraintEsbNodeTypeNameRectangle1.verticalSpan = 1;
		constraintEsbNodeTypeNameRectangle1.grabExcessHorizontalSpace = true;
		constraintEsbNodeTypeNameRectangle1.grabExcessVerticalSpace = true;
		//graphicalNodeContainer0.add(esbNodeTypeNameRectangle1,
				//constraintEsbNodeTypeNameRectangle1);

		esbNodeTypeNameRectangle1.setLayoutManager(new StackLayout());
		
		//actual label to display which type this is
		WrappingLabel esbNodeTypeNameLabel2 = new WrappingLabel();
		esbNodeTypeNameLabel2.setText(getNodeName());
		esbNodeTypeNameLabel2
				.setForegroundColor(LOGMEDIATORTYPENAMELABEL2_FORE);
		esbNodeTypeNameLabel2
				.setFont(new Font(null, "Arial", 10, SWT.BOLD));
		esbNodeTypeNameLabel2.setAlignment(SWT.CENTER);
		esbNodeTypeNameLabel2.setPreferredSize(new Dimension(64, 20));

		esbNodeTypeNameRectangle1.add(esbNodeTypeNameLabel2);
		//------------------------------------------------------------------------

		propertyValueRectangle1 = new RectangleFigure();
		propertyValueRectangle1.setOutline(false);
		propertyValueRectangle1
				.setBackgroundColor(LOGMEDIATORPROPERTYVALUERECTANGLE1_BACK);
		propertyValueRectangle1.setPreferredSize(new Dimension(64, 20));

		GridData constraintPropertyValueRectangle1 = new GridData();
		constraintPropertyValueRectangle1.verticalAlignment = GridData.CENTER;
		constraintPropertyValueRectangle1.horizontalAlignment = GridData.CENTER;
		constraintPropertyValueRectangle1.horizontalIndent = 0;
		constraintPropertyValueRectangle1.horizontalSpan = 1;
		constraintPropertyValueRectangle1.verticalSpan = 1;
		constraintPropertyValueRectangle1.grabExcessHorizontalSpace = true;
		constraintPropertyValueRectangle1.grabExcessVerticalSpace = true;
/*		graphicalNodeContainer0.add(propertyValueRectangle1,
				constraintPropertyValueRectangle1);*/

		propertyValueRectangle1.setLayoutManager(new StackLayout());

	}

	public RectangleFigure getPropertyValueRectangle1() {
		return propertyValueRectangle1;
	}

	public String getIconPath() {
		return "override this in the child class with actual icon path";
	}

	public String getNodeName() {
		return "<default>";
	}
	
	public Color getLabelBackColor() {
		return this.getBackgroundColor();
	}

	/**
	 * Custom method to add drop shadow
	 */
	private void paintShadow(Graphics graphics) {
		Rectangle shadowRect = new Rectangle(getBounds().x + 3,
				getBounds().y + 3, getBounds().width - 5,
				getBounds().height - 5);
		graphics.setBackgroundColor(new Color(null, 160, 160, 160));
		graphics.fillRectangle(shadowRect);
		graphics.drawRectangle(shadowRect);
	}

	
	public void paint(Graphics graphics) {
		paintShadow(graphics);
		super.paint(graphics);
	}

	/**
	 * @generated
	 */
//	static final Color LOGMEDIATORTYPENAMERECTANGLE1_BACK = new Color(null,
//			222, 225, 230);

	/**
	 * @generated
	 */
	static final Color LOGMEDIATORTYPENAMELABEL2_FORE = new Color(null, 50, 50,
			50);

	/**
	 * @generated
	 */
	static final Color LOGMEDIATORPROPERTYVALUERECTANGLE1_BACK = new Color(
			null, 255, 255, 255);

	/**
	 * @generated
	 */
	//static final Color FFIGURELOGMEDIATORLOGCATEGORYFIGURE_FORE = new Color(
	//		null, 150, 150, 150);
}
