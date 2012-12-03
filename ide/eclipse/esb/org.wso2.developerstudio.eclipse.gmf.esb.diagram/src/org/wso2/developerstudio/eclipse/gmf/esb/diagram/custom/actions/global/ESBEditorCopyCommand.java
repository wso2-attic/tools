package org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.actions.global;

import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.CommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramWorkbenchPart;
import org.eclipse.gmf.runtime.diagram.ui.requests.DuplicateRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;

public class ESBEditorCopyCommand extends org.eclipse.gmf.runtime.common.core.command.AbstractCommand{


	public static List<IGraphicalEditPart> toCopyElements ;
	public static List<IGraphicalEditPart> toCopyEditParts ;
	
	public ESBEditorCopyCommand(String label, List<IGraphicalEditPart> toCopyElements,List<IGraphicalEditPart> toCopyEditParts) {
		super(label);
		this.toCopyElements = toCopyElements;
		this.toCopyEditParts=toCopyEditParts;
		
	}

	@Override
	protected CommandResult doExecuteWithResult(
			IProgressMonitor progressMonitor, IAdaptable info)
			throws ExecutionException {		
		ESBClipboard.setToCopyEditParts(toCopyEditParts);	
		return CommandResult.newOKCommandResult();
	}

	@Override
	protected CommandResult doUndoWithResult(IProgressMonitor progressMonitor,
			IAdaptable info) throws ExecutionException {
	
		return CommandResult.newOKCommandResult();
	}
	
	@Override
	protected CommandResult doRedoWithResult(IProgressMonitor progressMonitor,
			IAdaptable info) throws ExecutionException {

		return null;
	}
}
