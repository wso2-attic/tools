package org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;
import org.eclipse.gmf.runtime.notation.View;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.EsbLinkEditPart;

public abstract class AbstractEndpointInputConnector extends AbstractBorderItemEditPart {

	public AbstractEndpointInputConnector(View view) {
		super(view);
		// TODO Auto-generated constructor stub
	}
	
	public void notifyChanged(Notification notification) {		
		super.notifyChanged(notification);
		if(notification.getEventType()==Notification.ADD){
				if(this.getTargetConnections().size()!=0){					
					if(((EsbLinkEditPart)this.getTargetConnections().get(0)).getSource() instanceof AbstractEndpointAdditionalOutputConnector){						
						for(int j=0;j<this.getParent().getChildren().size();++j){
							if(this.getParent().getChildren().get(j) instanceof AbstractEndpointOutputConnector){
								Collection<EObject> collection=new ArrayList<EObject>();
								collection.add(((org.eclipse.gmf.runtime.notation.impl.NodeImpl)((AbstractEndpointOutputConnector)this.getParent().getChildren().get(j)).getModel()).getElement());
								DeleteCommand deleteCommand =new DeleteCommand(getEditingDomain(),collection );
								if(deleteCommand.canExecute()){
									getEditingDomain().getCommandStack().execute(deleteCommand);
								}
								
								IFigure borderItemFigure = ((AbstractEndpointInputConnector) this).getFigure();
								BorderItemLocator locator = new FixedBorderItemLocator(
								((AbstractEndpoint)this.getParent()).getMainFigure(), borderItemFigure, PositionConstants.WEST,0.5);
								((AbstractEndpoint)this.getParent()).getBorderedFigure().getBorderItemContainer().remove(borderItemFigure);
								((AbstractEndpoint)this.getParent()).getBorderedFigure().getBorderItemContainer().add(borderItemFigure,locator);
								
								break;
							}
						}
					}
				}
				
			}
	}

}
