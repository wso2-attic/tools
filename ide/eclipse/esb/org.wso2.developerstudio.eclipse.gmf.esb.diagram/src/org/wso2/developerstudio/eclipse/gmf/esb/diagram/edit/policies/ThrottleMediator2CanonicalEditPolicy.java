package org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.policies;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.commands.DeferredLayoutCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.SetViewMutabilityCommand;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.ThrottleMediatorInputConnector2EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.ThrottleMediatorOutputConnector2EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbDiagramUpdater;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbVisualIDRegistry;

/**
 * @generated
 */
public class ThrottleMediator2CanonicalEditPolicy extends CanonicalEditPolicy {

	/**
	 * @generated
	 */
	private Set/*[org.eclipse.emf.ecore.EStructuralFeature]*/myFeaturesToSynchronize;

	/**
	 * @generated
	 */
	protected void refreshOnActivate() {
		// Need to activate editpart children before invoking the canonical refresh for EditParts to add event listeners
		List/*[?]*/c = getHost().getChildren();
		for (int i = 0; i < c.size(); i++) {
			((EditPart) c.get(i)).activate();
		}
		super.refreshOnActivate();
	}

	/**
	 * @generated
	 */
	protected Set getFeaturesToSynchronize() {
		if (myFeaturesToSynchronize == null) {
			myFeaturesToSynchronize = new HashSet/*[org.eclipse.emf.ecore.EStructuralFeature]*/();
			myFeaturesToSynchronize.add(EsbPackage.eINSTANCE
					.getThrottleMediator_InputConnector());
			myFeaturesToSynchronize.add(EsbPackage.eINSTANCE
					.getThrottleMediator_OutputConnector());
		}
		return myFeaturesToSynchronize;
	}

	/**
	 * @generated
	 */
	@SuppressWarnings("rawtypes")
	protected List getSemanticChildrenList() {
		View viewObject = (View) getHost().getModel();
		LinkedList/*[org.eclipse.emf.ecore.EObject]*/result = new LinkedList/*[org.eclipse.emf.ecore.EObject]*/();
		List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/childDescriptors = EsbDiagramUpdater
				.getThrottleMediator_3206SemanticChildren(viewObject);
		for (Iterator/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/it = childDescriptors
				.iterator(); it.hasNext();) {
			EsbNodeDescriptor d = (EsbNodeDescriptor) it.next();
			result.add(d.getModelElement());
		}
		return result;
	}

	/**
	 * @generated
	 */
	protected boolean isOrphaned(
			Collection/*[org.eclipse.emf.ecore.EObject]*/semanticChildren,
			final View view) {
		return isMyDiagramElement(view)
				&& !semanticChildren.contains(view.getElement());
	}

	/**
	 * @generated
	 */
	private boolean isMyDiagramElement(View view) {
		int visualID = EsbVisualIDRegistry.getVisualID(view);
		return visualID == ThrottleMediatorInputConnector2EditPart.VISUAL_ID
				|| visualID == ThrottleMediatorOutputConnector2EditPart.VISUAL_ID;
	}

	/**
	 * @generated
	 */
	protected void refreshSemantic() {
		if (resolveSemanticElement() == null) {
			return;
		}
		LinkedList/*[org.eclipse.core.runtime.IAdaptable]*/createdViews = new LinkedList/*[org.eclipse.core.runtime.IAdaptable]*/();
		List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/childDescriptors = EsbDiagramUpdater
				.getThrottleMediator_3206SemanticChildren((View) getHost()
						.getModel());
		LinkedList/*[org.eclipse.gmf.runtime.notation.View]*/orphaned = new LinkedList/*[org.eclipse.gmf.runtime.notation.View]*/();
		// we care to check only views we recognize as ours
		LinkedList/*[org.eclipse.gmf.runtime.notation.View]*/knownViewChildren = new LinkedList/*[org.eclipse.gmf.runtime.notation.View]*/();
		for (Iterator/*[org.eclipse.gmf.runtime.notation.View]*/it = getViewChildren()
				.iterator(); it.hasNext();) {
			View v = (View) it.next();
			if (isMyDiagramElement(v)) {
				knownViewChildren.add(v);
			}
		}
		// alternative to #cleanCanonicalSemanticChildren(getViewChildren(), semanticChildren)
		//
		// iteration happens over list of desired semantic elements, trying to find best matching View, while original CEP
		// iterates views, potentially losing view (size/bounds) information - i.e. if there are few views to reference same EObject, only last one 
		// to answer isOrphaned == true will be used for the domain element representation, see #cleanCanonicalSemanticChildren()
		for (Iterator/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/descriptorsIterator = childDescriptors
				.iterator(); descriptorsIterator.hasNext();) {
			EsbNodeDescriptor next = (EsbNodeDescriptor) descriptorsIterator
					.next();
			String hint = EsbVisualIDRegistry.getType(next.getVisualID());
			LinkedList/*[org.eclipse.gmf.runtime.notation.View]*/perfectMatch = new LinkedList/*[org.eclipse.gmf.runtime.notation.View]*/(); // both semanticElement and hint match that of NodeDescriptor
			for (Iterator/*[org.eclipse.gmf.runtime.notation.View]*/it = getViewChildren()
					.iterator(); it.hasNext();) {
				View childView = (View) it.next();
				EObject semanticElement = childView.getElement();
				if (next.getModelElement().equals(semanticElement)) {
					if (hint.equals(childView.getType())) {
						perfectMatch.add(childView);
						// actually, can stop iteration over view children here, but
						// may want to use not the first view but last one as a 'real' match (the way original CEP does
						// with its trick with viewToSemanticMap inside #cleanCanonicalSemanticChildren
					}
				}
			}
			if (perfectMatch.size() > 0) {
				descriptorsIterator.remove(); // precise match found no need to create anything for the NodeDescriptor
				// use only one view (first or last?), keep rest as orphaned for further consideration
				knownViewChildren.remove(perfectMatch.getFirst());
			}
		}
		// those left in knownViewChildren are subject to removal - they are our diagram elements we didn't find match to,
		// or those we have potential matches to, and thus need to be recreated, preserving size/location information.
		orphaned.addAll(knownViewChildren);
		//
		ArrayList/*[org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest.ViewDescriptor]*/viewDescriptors = new ArrayList/*[org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest.ViewDescriptor]*/(
				childDescriptors.size());
		for (Iterator/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/it = childDescriptors
				.iterator(); it.hasNext();) {
			EsbNodeDescriptor next = (EsbNodeDescriptor) it.next();
			String hint = EsbVisualIDRegistry.getType(next.getVisualID());
			IAdaptable elementAdapter = new CanonicalElementAdapter(
					next.getModelElement(), hint);
			CreateViewRequest.ViewDescriptor descriptor = new CreateViewRequest.ViewDescriptor(
					elementAdapter, Node.class, hint, ViewUtil.APPEND, false,
					host().getDiagramPreferencesHint());
			viewDescriptors.add(descriptor);
		}

		boolean changed = deleteViews(orphaned.iterator());
		//
		CreateViewRequest request = getCreateViewRequest(viewDescriptors);
		Command cmd = getCreateViewCommand(request);
		if (cmd != null && cmd.canExecute()) {
			SetViewMutabilityCommand.makeMutable(
					new EObjectAdapter(host().getNotationView())).execute();
			executeCommand(cmd);

			List/*[org.eclipse.core.runtime.IAdaptable]*/nl = (List/*[org.eclipse.core.runtime.IAdaptable]*/) request
					.getNewObject();
			createdViews.addAll(nl);
		}
		if (changed || createdViews.size() > 0) {
			postProcessRefreshSemantic(createdViews);
		}
		if (createdViews.size() > 1) {
			// perform a layout of the container
			DeferredLayoutCommand layoutCmd = new DeferredLayoutCommand(host()
					.getEditingDomain(), createdViews, host());
			executeCommand(new ICommandProxy(layoutCmd));
		}

		makeViewsImmutable(createdViews);
	}
}
