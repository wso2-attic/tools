package org.wso2.carbonstudio.eclipse.gmf.esb.diagram.custom;

import java.util.Collections;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.part.Messages;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.providers.EsbElementTypes;

public abstract class AdditionalOutputConnector extends AbstractBorderItemEditPart{


	public final boolean isInput=false;
	public static LinkToolEntry entry;
	
	abstract public IFigure getPrimaryShapeForward();
	abstract public IFigure getPrimaryShapeReverse();	
	abstract public NodeFigure getNodeFigureOutput();
	
	
	
	public AdditionalOutputConnector(View view) {
		super(view);
		// TODO Auto-generated constructor stub
	}


	protected NodeFigure createNodeFigure() {
		// TODO Auto-generated method stub
		return null;
	}
	
	static{
	 entry = new LinkToolEntry(
			Messages.EsbLink1CreationTool_title,
			Messages.EsbLink1CreationTool_desc,
			Collections.singletonList(EsbElementTypes.EsbLink_4001));
	entry.setId("createEsbLink1CreationTool"); //$NON-NLS-1$
	entry.setSmallIcon(EsbElementTypes
			.getImageDescriptor(EsbElementTypes.EsbLink_4001));
	entry.setLargeIcon(entry.getSmallIcon());
	}
	

	
	public static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
	
	


}
