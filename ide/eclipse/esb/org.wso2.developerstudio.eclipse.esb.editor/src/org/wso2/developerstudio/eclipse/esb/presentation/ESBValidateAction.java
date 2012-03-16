package org.wso2.developerstudio.eclipse.esb.presentation;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.action.ValidateAction;
import org.eclipse.emf.validation.marker.MarkerUtil;
import org.eclipse.emf.validation.model.EvaluationMode;
import org.eclipse.emf.validation.model.IConstraintStatus;
import org.eclipse.emf.validation.service.IBatchValidator;
import org.eclipse.emf.validation.service.ModelValidationService;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ListDialog;


public class ESBValidateAction extends ValidateAction{
	
	protected Collection<EObject> selectedEObjects = null;
	protected Shell shell = null;
	
	
	public void selectionChanged(SelectionChangedEvent event) {
		ISelection selection = event.getSelection();
		try {
			if (selection instanceof IStructuredSelection) {
				IStructuredSelection structuredSelection = (IStructuredSelection) selection;
				this.selectedEObjects = structuredSelection.toList();
			}
		}catch (Exception e) {
			MessageDialog.openInformation(shell, "Validate", "Validate Exception");
			throw new RuntimeException(e);
		}
		
		super.selectionChanged(event);
	}
	
	public void run() {
		IBatchValidator validator = ModelValidationService.getInstance().newValidator(EvaluationMode.BATCH);
		validator.setOption(IBatchValidator.OPTION_INCLUDE_LIVE_CONSTRAINTS, true);
		validator.setOption(IBatchValidator.OPTION_TRACK_RESOURCES, true);
		final IStatus status = validator.validate(selectedEObjects);
		if (status.isOK()) {
			MessageDialog.openInformation(shell, "Validate", "Validate Success");
		} else {
			ListDialog dialog = new ListDialog(shell);
			dialog.setInput(status);
			dialog.setTitle("Validate");
			dialog.setContentProvider(new IStructuredContentProvider() {
				public void dispose() {
					// nothing to dispose
				}

				public Object[] getElements(Object inputElement) {
					if (status != null && status.isMultiStatus() && status == inputElement) {
						return status.getChildren();
					} else if (status != null && status == inputElement) {
						return new Object[] {status};
					}
					return new Object[0];
				}

				public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
					// Do nothing.
				}
			});
			dialog.setLabelProvider(new LabelProvider() {
				@Override
				public String getText(Object element) {
					if (element instanceof IStatus) {
						return ((IStatus)element).getMessage();
					}
					return null;
				}
			});
			dialog.setBlockOnOpen(true);
			dialog.setMessage("Validation Failed");
			
			if (Window.OK == dialog.open()) {
				Set<EObject> errorSelections = new HashSet<EObject>();
				if (!status.isMultiStatus()) {
					IConstraintStatus cstatus = (IConstraintStatus)status;
					errorSelections.add(cstatus.getTarget());
				} else {
					IStatus[] children = status.getChildren();
					for (IStatus element : children) {
						IConstraintStatus cstatus = (IConstraintStatus)element;
						errorSelections.add(cstatus.getTarget());
					}
				}
//				editor.setSelectionToViewer(errorSelections);
			}
		}
		
//		ValidationDelegateClientSelector.running = false;
		
		// Create problem markers on the resources with validation failures/warnings.
		try {
			MarkerUtil.updateMarkers(status);
		} catch (CoreException e) {
//			.getDefault().getLog().log(e.getStatus());
		}
		System.out.println("validation action called");
//		super.run();
	}
	
	
}
