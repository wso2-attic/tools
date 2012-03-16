package org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.part;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gmf.runtime.common.ui.services.action.contributionitem.ContributionItemService;
import org.eclipse.gmf.runtime.diagram.ui.actions.ActionIds;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.providers.DiagramContextMenuProvider;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.ui.IWorkbenchPart;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbNode;
import org.wso2.developerstudio.eclipse.gmf.esb.LogMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.SwitchMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.custom.configure.ConfigureEsbNodeAction;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.custom.configure.ConfigureLogMediatorAction;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.custom.configure.ConfigureSwitchMediatorAction;

/**
 * @generated
 */
public class DiagramEditorContextMenuProvider extends
		DiagramContextMenuProvider {

	/**
	 * @generated
	 */
	private IWorkbenchPart part;

	/**
	 * @generated
	 */
	private DeleteElementAction deleteAction;

	private Map<Class<? extends EsbNode>, ConfigureEsbNodeAction> contextActions;
	private Map<Class<? extends EsbNode>, ConfigureEsbNodeAction> addBranchContextActions;
	//private Map<Class<? extends EsbNode>, DirectionEsbNodeAction> contextActionsDirection;

	private EditPart selectedEditorPart;

	/**
	 * @generated NOT
	 */
	public DiagramEditorContextMenuProvider(IWorkbenchPart part,
			EditPartViewer viewer) {
		super(part, viewer);
		this.part = part;
		deleteAction = new DeleteElementAction(part);
		deleteAction.init();

		// Initialize context sensitive actions.
		contextActions = new HashMap<Class<? extends EsbNode>, ConfigureEsbNodeAction>();
		contextActions.put(LogMediator.class, new ConfigureLogMediatorAction(
				part));
		contextActions.put(SwitchMediator.class,
				new ConfigureSwitchMediatorAction(part));
	}

	/**
	 * @generated 
	 */
	public void dispose() {
		if (deleteAction != null) {
			deleteAction.dispose();
			deleteAction = null;
		}
		super.dispose();
	}

	/**
	 * @generated NOT
	 */
	public void buildContextMenu(final IMenuManager menu) {
		getViewer().flush();
		try {
			TransactionUtil.getEditingDomain(
					(EObject) getViewer().getContents().getModel())
					.runExclusive(new Runnable() {

						public void run() {
							ContributionItemService
									.getInstance()
									.contributeToPopupMenu(
											DiagramEditorContextMenuProvider.this,
											part);
							menu.remove(ActionIds.ACTION_DELETE_FROM_MODEL);
							menu.appendToGroup("editGroup", deleteAction);

							// Custom configuration menu item.
							List<?> selectedEPs = getViewer()
									.getSelectedEditParts();
							if (selectedEPs.size() == 1) {
								selectedEditorPart = (IGraphicalEditPart) selectedEPs
										.get(0);
								EObject contextObj = ((View) selectedEditorPart
										.getModel()).getElement();
								ConfigureEsbNodeAction contextAction = contextActions
										.get(contextObj.eClass()
												.getInstanceClass());
								//ConfigureEsbNodeAction addBranchContextAction = addBranchContextActions
								//.get(contextObj.eClass()
								//	.getInstanceClass());
								if (null != contextAction) {
									menu.appendToGroup("editGroup",
											contextAction);
								}
								//if (null != addBranchContextAction) {
								//	menu.appendToGroup("editGroup",
								//			addBranchContextAction);
								//}
							}

							appendToGroupDirection(menu);
						}
					});
		} catch (Exception e) {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Error building context menu", e);
		}
	}

	private void appendToGroupDirection(IMenuManager menu) {
		List<?> selectedEPs = getViewer().getSelectedEditParts();
		if (selectedEPs.size() == 1) {
			EditPart selectedEP = (IGraphicalEditPart) selectedEPs.get(0);
			EObject contextObj = ((View) selectedEditorPart.getModel())
					.getElement();
			//DirectionEsbNodeAction contextActionDirection = contextActionsDirection
			//	.get(contextObj.eClass().getInstanceClass());

			//if (null != contextActionDirection) {
			//	contextActionDirection.setEditorPart(selectedEditorPart);
			//	menu.appendToGroup("editGroup", contextActionDirection);
			//}
		}
	}
}
