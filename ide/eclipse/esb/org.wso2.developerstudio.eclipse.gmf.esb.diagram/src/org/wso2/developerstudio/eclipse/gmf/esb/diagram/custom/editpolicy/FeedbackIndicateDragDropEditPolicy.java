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

package org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.editpolicy;

import java.awt.MouseInfo;
import java.awt.Point;

import org.eclipse.draw2d.FigureCanvas;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.ImageFigure;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateUnspecifiedTypeRequest;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Control;
import org.wso2.developerstudio.eclipse.platform.core.utils.SWTResourceManager;

/**
 * Installing <b>FeedbackIndicateDragDropEditPolicy</b> will indicate a feedback when drag a node
 * to the canvas from the tool palette
 */
public class FeedbackIndicateDragDropEditPolicy extends DragDropEditPolicy {
	
	private IFigure feedbackFigure;
	private Image feedbackImage;

	private static final String ALLOW_DROP_ICON_PATH = "/icons/custom/check.png";
	private static final String NOT_ALLOW_DROP_ICON_PATH = "/icons/custom/exclamation.png";

	/**
	 * {@inheritDoc}
	 */
	protected Command getDropCommand(ChangeBoundsRequest request) {
		if ((getHost() instanceof ShapeCompartmentEditPart)) {
			/* avoiding drag and drop nodes between compartments. */
			return null;
		}
		return super.getDragCommand(request);
	}

	/**
	 * {@inheritDoc}
	 */
	public void showTargetFeedback(Request request) {
		super.showTargetFeedback(request);
		if (request instanceof CreateUnspecifiedTypeRequest) {
			if (getHost() instanceof ShapeCompartmentEditPart) {
				ShapeCompartmentEditPart host = (ShapeCompartmentEditPart) getHost();
				Command command = host.getCommand(request);
				if (command != null) {
					if (command.canExecute()) {
						showFeedBackFigure(true);
					} else {
						showFeedBackFigure(false);
					}
				} else {
					showFeedBackFigure(false);
				}
			} else {
				showFeedBackFigure(false);
			}
		}
	}

	/**
	 * {@inheritDoc}
	 */
	public void eraseTargetFeedback(Request request) {
		if (feedbackFigure != null) {
			removeFeedback(feedbackFigure);
			feedbackFigure = null;
		}
		super.eraseTargetFeedback(request);
	}

	/**
	 * Get feedback figure
	 * @param allowDrop true if, host is acceptable area for a certain node.
	 * @return
	 */
	public IFigure getFeedbackFigure(boolean allowDrop) {
		if (feedbackFigure == null) {
			Image feedbackImage = SWTResourceManager.getImage(this.getClass(),
					(allowDrop) ? ALLOW_DROP_ICON_PATH : NOT_ALLOW_DROP_ICON_PATH);
			IFigure figure = new ImageFigure(feedbackImage);
			addFeedback(figure);
			this.feedbackImage = feedbackImage;
			feedbackFigure = figure;
		}
		return feedbackFigure;
	}

	/**
	 * Show feedback figure in canvas
	 * @param allowDrop  true if, host is acceptable area for a certain node.
	 */
	private void showFeedBackFigure(boolean allowDrop) {
		Point pointer = MouseInfo.getPointerInfo().getLocation();
		IFigure feedbackFigure = getFeedbackFigure(allowDrop);
		int x = (int) pointer.getX();
		int y = (int) pointer.getY();
		Control ctrl = getHost().getViewer().getControl();
		FigureCanvas canvas = (FigureCanvas) ctrl;
		int horizontal = canvas.getHorizontalBar().getSelection();
		int vertical = canvas.getVerticalBar().getSelection();
		horizontal += 15;
		vertical -= 15;
		org.eclipse.swt.graphics.Point p = canvas.toDisplay(0, 0);
		feedbackFigure.setBounds(new Rectangle((x - p.x) + horizontal, (y - p.y) + vertical,
				feedbackImage.getBounds().width, feedbackImage.getBounds().height));
	}

}
