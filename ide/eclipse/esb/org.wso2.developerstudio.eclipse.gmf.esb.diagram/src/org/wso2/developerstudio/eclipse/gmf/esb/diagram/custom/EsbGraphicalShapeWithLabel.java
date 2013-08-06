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

import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.ImageFigure;
import org.eclipse.draw2d.LineBorder;
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
	static int Figure_PreferredWidth = FixedSizedAbstractMediator.FigureWidth;
	static int Figure_PreferredHeight = FixedSizedAbstractMediator.FigureHeight + 20; //Additional 20 to show the editable lable
	static int Image_PreferredWidth = 55;
	static int Image_PreferredHeight = 55;
	static int marginWidth = (Figure_PreferredWidth - Image_PreferredWidth) / 2; //equals to 10
	static int marginHeight = 10;


	public EsbGraphicalShapeWithLabel() {
		GridLayout layoutThis = new GridLayout();
		layoutThis.marginHeight = 0;
		layoutThis.marginWidth = 0;
		this.setLayoutManager(new StackLayout());

		this.setCornerDimensions(new Dimension(8, 8));
		this.setFill(false);
		this.setOutline(false);
		this.setPreferredSize(new Dimension(Figure_PreferredWidth, Figure_PreferredHeight));
		createContents();
	}

	private void createContents() {

		RoundedRectangle bottomRondedRect = new RoundedRectangle();
		bottomRondedRect.setCornerDimensions(new Dimension(8, 8));
		bottomRondedRect.setOutline(false);
		bottomRondedRect.setBackgroundColor(this.getBackgroundColor());
		bottomRondedRect.setPreferredSize(new Dimension(Figure_PreferredWidth, Figure_PreferredHeight));
		// we do not set border since we dont want to show that in unselected state
		
		GridLayout bottomRondedRectGridLayout = new GridLayout();
		bottomRondedRectGridLayout.horizontalSpacing = 0;
		bottomRondedRectGridLayout.verticalSpacing = 0;
		bottomRondedRectGridLayout.marginHeight = marginHeight - 1; // -1 is to handle visual pixel offset
		bottomRondedRectGridLayout.marginWidth = marginWidth - 1;
		bottomRondedRect.setLayoutManager(bottomRondedRectGridLayout);
		
		ImageFigure iconImageFigure = EditPartDrawingHelper.getIconImageFigure(getIconPath(), Image_PreferredWidth, Image_PreferredHeight);
		bottomRondedRect.add(iconImageFigure);
		this.add(bottomRondedRect);

		propertyValueRectangle1 = new RectangleFigure();
		propertyValueRectangle1.setOutline(false);
		propertyValueRectangle1.setBackgroundColor(EditPartDrawingHelper.FigureNormalColor );
		propertyValueRectangle1.setAlpha(5); // very importnat here
		propertyValueRectangle1.setPreferredSize(new Dimension(Figure_PreferredWidth, 10));
		propertyValueRectangle1.setSize(Figure_PreferredWidth, 10);
		
		GridLayout propertyRectLayout = new GridLayout();
		propertyRectLayout.marginHeight = 54; //10 + imageHeight + 10 -10/2
		propertyRectLayout.marginWidth = marginWidth + 10;
		propertyValueRectangle1.setLayoutManager(propertyRectLayout);
		this.add(propertyValueRectangle1);
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

}