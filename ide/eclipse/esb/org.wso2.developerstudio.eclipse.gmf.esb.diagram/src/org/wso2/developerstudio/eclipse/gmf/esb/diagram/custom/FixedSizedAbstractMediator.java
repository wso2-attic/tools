/*
 * Copyright 2012 WSO2, Inc. (http://wso2.com)
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

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.HighlightOnSelectionEditPolicy;

public abstract class FixedSizedAbstractMediator extends AbstractMediator {

	public static int FigureWidth = 75;
	public static int FigureHeight = 75;
	protected IFigure primaryShape;
	
	public FixedSizedAbstractMediator(View view) {
		super(view);
	}
	
	public IFigure getFigure() {
		IFigure figure = super.getFigure();
		figure.setMaximumSize(new Dimension(FigureWidth, FigureHeight));
		return figure;
	}
	
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(FigureWidth, FigureHeight);
		result.setMinimumSize(new Dimension(FigureWidth, FigureHeight));
		return result;
	}
	
	public IFigure getFixedSizedPrimaryShape() {
		return primaryShape;
	}

	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
			installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE, new CustomNonResizableEditPolicyEx());  //remove 8 corners
			installEditPolicy(EditPolicy.SELECTION_FEEDBACK_ROLE, new HighlightOnSelectionEditPolicy()); //selection
	}
}
