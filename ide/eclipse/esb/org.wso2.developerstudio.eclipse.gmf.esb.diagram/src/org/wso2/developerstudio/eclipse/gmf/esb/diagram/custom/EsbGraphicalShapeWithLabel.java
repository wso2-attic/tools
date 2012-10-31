/*
 * Copyright (c) 2012, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom;

import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.ImageFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbDiagramEditorPlugin;

/**
 * Draws a Figure with a label
 */
public class EsbGraphicalShapeWithLabel extends RoundedRectangle {
	RectangleFigure propertyValueRectangle1;

	public EsbGraphicalShapeWithLabel() {
		GridLayout layoutThis = new GridLayout();
		layoutThis.numColumns = 1;
		layoutThis.makeColumnsEqualWidth = true;
		layoutThis.marginHeight = 0;
		layoutThis.marginWidth = 0;
		this.setLayoutManager(layoutThis);

		this.setCornerDimensions(new Dimension(1, 1));
		this.setFill(false);
		this.setOutline(false);
		this.setPreferredSize(new Dimension(75, 75));
		createContents();
	}

	private void createContents() {

		/*main image grid data*/
		GridData constraintMainImageRectangle = new GridData();
		constraintMainImageRectangle.verticalAlignment = GridData.VERTICAL_ALIGN_BEGINNING;
		constraintMainImageRectangle.horizontalAlignment = GridData.HORIZONTAL_ALIGN_BEGINNING;
		constraintMainImageRectangle.horizontalIndent = 0;
			
		ImageDescriptor mainImgDesc = EsbDiagramEditorPlugin
				.getBundledImageDescriptor(getIconPath());
		
		Image image = mainImgDesc.createImage();
		Image scaled = new Image(Display.getDefault(), 36, 52);
		GC gc = new GC(scaled);
		gc.setAntialias(SWT.ON);
		gc.setInterpolation(SWT.HIGH);
		gc.drawImage(image, 0, 0, image.getBounds().width, image.getBounds().height, 0, 0, 36, 52);
		gc.dispose();
		
		
		ImageFigure mainImg = new ImageFigure(scaled);
		mainImg.setSize(new Dimension(75, 55));
		RectangleFigure mainImageRectangle = new RectangleFigure();
		mainImageRectangle.setOutline(false);
		mainImageRectangle.setBackgroundColor(new Color(null, 255, 255, 255));
		mainImageRectangle.setPreferredSize(new Dimension(75, 55));
		mainImageRectangle.add(mainImg);
		this.add(mainImageRectangle, constraintMainImageRectangle);	

		propertyValueRectangle1 = new RectangleFigure();
		propertyValueRectangle1.setOutline(false);
		propertyValueRectangle1
				.setBackgroundColor(PROPERTYVALUERECTANGLE_BACK);
		propertyValueRectangle1.setPreferredSize(new Dimension(75, 20));

		GridData constraintPropertyValueRectangle1 = new GridData();
		constraintPropertyValueRectangle1.verticalAlignment = GridData.CENTER;
		constraintPropertyValueRectangle1.horizontalAlignment = GridData.BEGINNING;
		constraintPropertyValueRectangle1.horizontalIndent = 0;
		constraintPropertyValueRectangle1.horizontalSpan = 1;
		constraintPropertyValueRectangle1.verticalSpan = 1;
		constraintPropertyValueRectangle1.grabExcessHorizontalSpace = true;
		constraintPropertyValueRectangle1.grabExcessVerticalSpace = true;

		propertyValueRectangle1.setLayoutManager(new StackLayout());
		this.add(propertyValueRectangle1, constraintPropertyValueRectangle1);


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
	

	static final Color PROPERTYVALUERECTANGLE_BACK = new Color(
			null, 255, 255, 255);

}