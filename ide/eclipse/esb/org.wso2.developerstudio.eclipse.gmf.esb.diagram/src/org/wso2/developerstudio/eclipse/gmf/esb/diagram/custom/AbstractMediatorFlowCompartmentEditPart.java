package org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.internal.ui.palette.editparts.ToolEntryEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeCompartmentEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbFactory;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage;
import org.wso2.developerstudio.eclipse.gmf.esb.Sequence;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.Activator;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.layout.XYRepossition;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.SequenceEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbPaletteFactory.NodeToolEntry;
import org.wso2.developerstudio.eclipse.logging.core.IDeveloperStudioLog;
import org.wso2.developerstudio.eclipse.logging.core.Logger;

public class AbstractMediatorFlowCompartmentEditPart extends ShapeCompartmentEditPart {

	private static IDeveloperStudioLog log = Logger.getLog(Activator.PLUGIN_ID);
	private AbstractMediatorFlowCompartmentEditPart instance;
	public Complexity complexity=null;
	public enum Complexity{SINGLE,DOUBLE,MULTIPLE};  
	
	public AbstractMediatorFlowCompartmentEditPart(View view) {
		super(view);
		instance=this;
	}
		
	protected void removeChild(EditPart child) {
		connectRemainingElements(child);
		Display.getCurrent().asyncExec(new Runnable() {			
			@Override
			public void run() {		
				XYRepossition.resizeContainers((IGraphicalEditPart) instance);		
				XYRepossition.reArrange((IGraphicalEditPart) instance);
			}
		});
		super.removeChild(child);		
	}
	
	protected void addChild(EditPart child, int index) {
		super.addChild(child, index);
		
		if (child instanceof SequenceEditPart) {
			SequenceEditPart sequenceEditPart = (SequenceEditPart) child;
			String sequenceName=null;
			String defaultName=sequenceEditPart.calculateDefaultName();
			EditPart editpart = (EditPart) ((StructuredSelection) sequenceEditPart
					.getViewer().getEditDomain().getPaletteViewer()
					.getSelection()).getFirstElement();
			if (editpart instanceof ToolEntryEditPart) {
				if (((ToolEntryEditPart) editpart).getModel() instanceof NodeToolEntry) {
					String label = ((NodeToolEntry) ((ToolEntryEditPart) editpart)
							.getModel()).getLabel();
					if ((!label.equals("")) && (!label.equals("Sequence Mediator"))) {
						sequenceName=label;
					}else{
						sequenceName=defaultName;
					}
					try{
						((Sequence) ((View) sequenceEditPart.getModel())
							.getElement()).setName(sequenceName);		
					}catch(java.lang.IllegalStateException e){
						log.error("This is occured while undo operation..", e);
					}
				} else if (((ToolEntryEditPart) editpart).getModel() instanceof org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.SequenceEditPart.NodeToolEntry) {
					String label = ((org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.SequenceEditPart.NodeToolEntry) ((ToolEntryEditPart) editpart)
							.getModel()).getLabel();
					if ((!label.equals("")) && (!label.equals("Sequence Mediator"))) {
						sequenceName=label;
					}else{
						sequenceName=defaultName;
					}
					((Sequence) ((View) sequenceEditPart.getModel())
							.getElement()).setName(sequenceName);
				}
			}
			
			EObject sequence = ((org.eclipse.gmf.runtime.notation.impl.NodeImpl) (sequenceEditPart)
					.getModel()).getElement();
				if (((Sequence) sequence).getOutputConnector().size() == 0) {
					AddCommand addCmd = new AddCommand(getEditingDomain(), sequence,
							EsbPackage.Literals.SEQUENCE__OUTPUT_CONNECTOR,
							EsbFactory.eINSTANCE.createSequenceOutputConnector());
					if (addCmd.canExecute()) {
						getEditingDomain().getCommandStack().execute(addCmd);
					}
				}
		}
	}
	
	private void connectRemainingElements(EditPart child){	
		if(child instanceof AbstractMediator){
		ConnectionUtils.createConnection(((AbstractMediator)child).getConnectedInputConnector(), ((AbstractMediator)child).getConnectedOutputConnector());
		}
	}
}

