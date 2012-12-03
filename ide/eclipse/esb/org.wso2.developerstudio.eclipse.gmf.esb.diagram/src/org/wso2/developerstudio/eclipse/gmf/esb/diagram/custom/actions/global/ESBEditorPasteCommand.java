package org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.actions.global;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramWorkbenchPart;
import org.eclipse.gmf.runtime.diagram.ui.requests.DuplicateRequest;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.wso2.developerstudio.eclipse.gmf.esb.LogMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.deserializer.DeserializerUtils;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.providers.EsbElementTypes;

public class ESBEditorPasteCommand extends org.eclipse.gmf.runtime.common.core.command.AbstractCommand{

	IGraphicalEditPart target;
	
	
	public ESBEditorPasteCommand(String label, IGraphicalEditPart target) {
		super(label);
		this.target=target;
		
	}

	@Override
	protected CommandResult doExecuteWithResult(IProgressMonitor progressMonitor, IAdaptable info)
			throws ExecutionException {
		if(ESBClipboard.hasThingsToCopy()){
			duplicate();	
		}		
		return null;
	}

	@Override
	protected CommandResult doRedoWithResult(IProgressMonitor progressMonitor, IAdaptable info)
			throws ExecutionException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected CommandResult doUndoWithResult(IProgressMonitor progressMonitor, IAdaptable info)
			throws ExecutionException {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	private void duplicate() {
		DuplicateRequest request = new DuplicateRequest();
		List<IGraphicalEditPart> editParts = new ArrayList<IGraphicalEditPart>();
		//editParts.add(target);
		editParts=ESBClipboard.getToCopyEditParts();
		((DuplicateRequest) request).setEditParts(editParts);

		IWorkbenchPart part = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getPartService()
				.getActivePart();

		if (part instanceof IDiagramWorkbenchPart) {
			Command cmd = ((IDiagramWorkbenchPart) part).getDiagramEditPart().getCommand(
					(Request) request);
			if (cmd != null && cmd.canExecute()) {
				editParts.get(0).getDiagramEditDomain().getDiagramCommandStack().execute(cmd);
			}
		} else {
		}
	}
}
