package org.wso2.carbonstudio.eclipse.gmf.esb.diagram.custom;

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
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.part.EsbDiagramEditorPlugin;

public class FilterMediatorGraphicalShape extends RoundedRectangle {
	RectangleFigure propertyValueRectangle1;

	public FilterMediatorGraphicalShape() {
		GridLayout layoutThis = new GridLayout();
		layoutThis.numColumns = 1;
		layoutThis.makeColumnsEqualWidth = false;
		layoutThis.marginHeight = 0;
		layoutThis.marginWidth = 0;
		this.setLayoutManager(layoutThis);

		this.setCornerDimensions(new Dimension(1, 1));
		this.setFill(false);
		this.setOutline(false);
		// this.setBackgroundColor(get);
		this.setPreferredSize(new Dimension(124, 44));
		createContents();
	}

	private void createContents() {

		RoundedRectangle graphicalNodeContainer0 = new RoundedRectangle();
		graphicalNodeContainer0.setCornerDimensions(new Dimension(1, 1));
		graphicalNodeContainer0.setOutline(false);
		graphicalNodeContainer0.setBackgroundColor(this.getBackgroundColor());
		graphicalNodeContainer0.setPreferredSize(new Dimension(120, 40));
		LineBorder border0 = new LineBorder(this.getBackgroundColor(), 1,
				SWT.BORDER_SOLID);
		graphicalNodeContainer0.setBorder(border0);

		GridData constraintGraphicalNodeContainer0 = new GridData();
		constraintGraphicalNodeContainer0.verticalAlignment = GridData.CENTER;
		constraintGraphicalNodeContainer0.horizontalAlignment = GridData.CENTER;
		constraintGraphicalNodeContainer0.horizontalIndent = 0;
		constraintGraphicalNodeContainer0.horizontalSpan = 1;
		constraintGraphicalNodeContainer0.verticalSpan = 1;
		constraintGraphicalNodeContainer0.grabExcessHorizontalSpace = false;
		constraintGraphicalNodeContainer0.grabExcessVerticalSpace = false;
		this.add(graphicalNodeContainer0, constraintGraphicalNodeContainer0);

		GridLayout layoutGraphicalNodeContainer0 = new GridLayout();
		layoutGraphicalNodeContainer0.numColumns = 3;
		layoutGraphicalNodeContainer0.makeColumnsEqualWidth = false;
		layoutGraphicalNodeContainer0.horizontalSpacing = 1;
		layoutGraphicalNodeContainer0.verticalSpacing = 0;
		layoutGraphicalNodeContainer0.marginHeight = -1;
		layoutGraphicalNodeContainer0.marginWidth = -1;
		graphicalNodeContainer0.setLayoutManager(layoutGraphicalNodeContainer0);
		

		//Image 
		// ------------------------------------------------------------------------
		// Filer mediator icon
		// ------------------------------------------------------------------------
		ImageDescriptor imgDesc = EsbDiagramEditorPlugin
				.getBundledImageDescriptor(getIconPath());
		ImageFigure img = new ImageFigure(imgDesc.createImage());
		img.setSize(new Dimension(36, 40));
		
		RectangleFigure imageRectangle1 = new RectangleFigure();
		imageRectangle1.setOutline(false);
		imageRectangle1.setBackgroundColor(new Color(null, 255, 255, 255));
		imageRectangle1.setPreferredSize(new Dimension(36, 40));
		imageRectangle1.setLayoutManager(new StackLayout());
		imageRectangle1.add(img);
		
		GridData constraintImageInfoRectangle1 = new GridData();
		constraintImageInfoRectangle1.verticalAlignment = GridData.FILL;
		constraintImageInfoRectangle1.horizontalAlignment = GridData.FILL;
		constraintImageInfoRectangle1.horizontalIndent = 0;
		constraintImageInfoRectangle1.horizontalSpan = 1;
		constraintImageInfoRectangle1.verticalSpan = 2;
		constraintImageInfoRectangle1.grabExcessHorizontalSpace = true;
		constraintImageInfoRectangle1.grabExcessVerticalSpace = true;
		graphicalNodeContainer0.add(imageRectangle1,
				constraintImageInfoRectangle1);
		
		// Rectangle containing "Filter", icon and the property value
		// ------------------------------------------------------------------------
		RectangleFigure middleInfoRectangle1 = new RectangleFigure();
		middleInfoRectangle1.setOutline(false);
		middleInfoRectangle1.setBackgroundColor(new Color(null, 255, 255, 255));
		middleInfoRectangle1.setPreferredSize(new Dimension(64, 40));

		GridLayout layoutLeftInfoContainer0 = new GridLayout();
		layoutLeftInfoContainer0.numColumns = 1;
		layoutLeftInfoContainer0.makeColumnsEqualWidth = false;
		layoutLeftInfoContainer0.horizontalSpacing = 1;
		layoutLeftInfoContainer0.verticalSpacing = 0;
		layoutLeftInfoContainer0.marginHeight = -1;
		layoutLeftInfoContainer0.marginWidth = -1;
		middleInfoRectangle1.setLayoutManager(layoutLeftInfoContainer0);

		
		// Rectangle to contain the type name label on upper left
		// ------------------------------------------------------------------------
		RectangleFigure esbNodeTypeNameRectangle1 = new RectangleFigure();
		esbNodeTypeNameRectangle1.setOutline(false);
		esbNodeTypeNameRectangle1.setBackgroundColor(new Color(null, 230, 230, 230));
		esbNodeTypeNameRectangle1.setPreferredSize(new Dimension(64, 20));
		esbNodeTypeNameRectangle1.setLayoutManager(new StackLayout());
		
		// actual label to display which type this is
		WrappingLabel esbNodeTypeNameLabel2 = new WrappingLabel();
		esbNodeTypeNameLabel2.setText(getNodeName());
		esbNodeTypeNameLabel2
				.setForegroundColor(LABEL2_FORE);
		esbNodeTypeNameLabel2.setFont(new Font(null, "Arial", 10, SWT.BOLD));
		esbNodeTypeNameLabel2.setAlignment(SWT.CENTER);
		esbNodeTypeNameLabel2.setPreferredSize(new Dimension(64, 20));

		esbNodeTypeNameRectangle1.add(esbNodeTypeNameLabel2);

		GridData constraintEsbNodeTypeNameRectangle1 = new GridData();
		constraintEsbNodeTypeNameRectangle1.verticalAlignment = GridData.FILL;
		constraintEsbNodeTypeNameRectangle1.horizontalAlignment = GridData.FILL;
		constraintEsbNodeTypeNameRectangle1.horizontalIndent = 0;
		constraintEsbNodeTypeNameRectangle1.horizontalSpan = 1;
		constraintEsbNodeTypeNameRectangle1.verticalSpan = 1;
		constraintEsbNodeTypeNameRectangle1.grabExcessHorizontalSpace = true;
		constraintEsbNodeTypeNameRectangle1.grabExcessVerticalSpace = true;
		middleInfoRectangle1.add(esbNodeTypeNameRectangle1,
				constraintEsbNodeTypeNameRectangle1);
		
		
		
//		GridData constraintImg = new GridData();
//		constraintImg.verticalAlignment = GridData.CENTER;
//		constraintImg.horizontalAlignment = GridData.CENTER;
//		constraintImg.horizontalIndent = 0;
//		constraintImg.horizontalSpan = 1;
//		constraintImg.verticalSpan = 1;
//		constraintImg.grabExcessHorizontalSpace = true;
//		constraintImg.grabExcessVerticalSpace = true;
//		leftInfoRectangle1.add(img, constraintImg);
		
		
		// ------------------------------------------------------------------------

		propertyValueRectangle1 = new RectangleFigure();
		propertyValueRectangle1.setOutline(false);
		propertyValueRectangle1
				.setBackgroundColor(LOGMEDIATORPROPERTYVALUERECTANGLE1_BACK);
		propertyValueRectangle1.setPreferredSize(new Dimension(64, 20));
		propertyValueRectangle1.setLayoutManager(new StackLayout());
		
		GridData constraintPropertyValueRectangle1 = new GridData();
		constraintPropertyValueRectangle1.verticalAlignment = GridData.CENTER;
		constraintPropertyValueRectangle1.horizontalAlignment = GridData.CENTER;
		constraintPropertyValueRectangle1.horizontalIndent = 0;
		constraintPropertyValueRectangle1.horizontalSpan = 1;
		constraintPropertyValueRectangle1.verticalSpan = 1;
		constraintPropertyValueRectangle1.grabExcessHorizontalSpace = true;
		constraintPropertyValueRectangle1.grabExcessVerticalSpace = true;
		
		middleInfoRectangle1.add(propertyValueRectangle1,
				constraintPropertyValueRectangle1);
		

		GridData constraintMiddleInfoRectangle1 = new GridData();
		constraintMiddleInfoRectangle1.verticalAlignment = GridData.FILL;
		constraintMiddleInfoRectangle1.horizontalAlignment = GridData.FILL;
		constraintMiddleInfoRectangle1.horizontalIndent = 0;
		constraintMiddleInfoRectangle1.horizontalSpan = 1;
		constraintMiddleInfoRectangle1.verticalSpan = 1;
		constraintMiddleInfoRectangle1.grabExcessHorizontalSpace = true;
		constraintMiddleInfoRectangle1.grabExcessVerticalSpace = true;
		graphicalNodeContainer0.add(middleInfoRectangle1,
				constraintMiddleInfoRectangle1);

		
		// Rectangle containing "pass", "fail"
		// ------------------------------------------------------------------------
		RectangleFigure rightInfoRectangle1 = new RectangleFigure();
		rightInfoRectangle1.setOutline(false);
		rightInfoRectangle1.setBackgroundColor(new Color(null, 255, 255, 255));
		rightInfoRectangle1.setPreferredSize(new Dimension(20, 40));

		GridLayout layoutRightInfoContainer0 = new GridLayout();
		layoutRightInfoContainer0.numColumns = 1;
		layoutRightInfoContainer0.makeColumnsEqualWidth = false;
		layoutRightInfoContainer0.horizontalSpacing = 1;
		layoutRightInfoContainer0.verticalSpacing = 0;
		layoutRightInfoContainer0.marginHeight = -1;
		layoutRightInfoContainer0.marginWidth = -1;
		
		rightInfoRectangle1.setLayoutManager(layoutRightInfoContainer0);
		
		
		// label to display the text "✓" or "✔" or "☑"
		// ------------------------------------------------------------------------
		WrappingLabel passLabel = new WrappingLabel();
		passLabel.setText("✔ ");
		passLabel
				.setForegroundColor(new Color(null,0,255,0));
		passLabel.setFont(new Font(null, "Arial", 12, SWT.NORMAL));
		passLabel.setAlignment(SWT.CENTER);
		passLabel.setPreferredSize(new Dimension(30, 20));
		
		GridData constraintPassLabel = new GridData();
		constraintPassLabel.verticalAlignment = GridData.CENTER;
		constraintPassLabel.horizontalAlignment = GridData.END;
		constraintPassLabel.horizontalIndent = 0;
		constraintPassLabel.horizontalSpan = 1;
		constraintPassLabel.verticalSpan = 1;
		constraintPassLabel.grabExcessHorizontalSpace = true;
		constraintPassLabel.grabExcessVerticalSpace = true;

		rightInfoRectangle1.add(passLabel, constraintPassLabel);
		
		
		// label to display the text "✗" or "x"
		// ------------------------------------------------------------------------
		WrappingLabel failLabel = new WrappingLabel();
		failLabel.setText("✗ ");
		failLabel
				.setForegroundColor(new Color(null,255,0,0));
		failLabel.setFont(new Font(null, "Arial", 12, SWT.NORMAL));
		failLabel.setAlignment(SWT.CENTER);
		failLabel.setPreferredSize(new Dimension(30, 20));
		
		GridData constraintFailLabel = new GridData();
		constraintFailLabel.verticalAlignment = GridData.CENTER;
		constraintFailLabel.horizontalAlignment = GridData.END;
		constraintFailLabel.horizontalIndent = 0;
		constraintFailLabel.horizontalSpan = 1;
		constraintFailLabel.verticalSpan = 1;
		constraintFailLabel.grabExcessHorizontalSpace = true;
		constraintFailLabel.grabExcessVerticalSpace = true;
		rightInfoRectangle1.add(failLabel, constraintFailLabel);
		
		
		GridData constraintRightInfoRectangle1 = new GridData();
		constraintRightInfoRectangle1.verticalAlignment = GridData.FILL;
		constraintRightInfoRectangle1.horizontalAlignment = GridData.FILL;
		constraintRightInfoRectangle1.horizontalIndent = 0;
		constraintRightInfoRectangle1.horizontalSpan = 1;
		constraintRightInfoRectangle1.verticalSpan = 1;
		constraintRightInfoRectangle1.grabExcessHorizontalSpace = true;
		constraintRightInfoRectangle1.grabExcessVerticalSpace = true;
		graphicalNodeContainer0.add(rightInfoRectangle1,
				constraintRightInfoRectangle1);
		

	}

	public RectangleFigure getPropertyValueRectangle1() {
		return propertyValueRectangle1;
	}

	public String getIconPath() {
		return "icons/ico20/filter-mediator.gif";
	}

	public String getNodeName() {
		return "Filter";
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
	// static final Color LOGMEDIATORTYPENAMERECTANGLE1_BACK = new Color(null,
	// 222, 225, 230);

	/**
	 * @generated
	 */
	static final Color LABEL2_FORE = new Color(null, 50, 50,
			50);

	/**
	 * @generated
	 */
	static final Color LOGMEDIATORPROPERTYVALUERECTANGLE1_BACK = new Color(
			null, 255, 255, 255);

	/**
	 * @generated
	 */
	// static final Color FFIGURELOGMEDIATORLOGCATEGORYFIGURE_FORE = new Color(
	// null, 150, 150, 150);
}
