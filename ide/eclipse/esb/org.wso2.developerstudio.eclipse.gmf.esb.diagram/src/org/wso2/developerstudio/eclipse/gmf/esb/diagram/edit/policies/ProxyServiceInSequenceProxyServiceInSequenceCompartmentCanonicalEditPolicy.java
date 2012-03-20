package org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.policies;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

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
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.AggregateMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.CacheMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.CalloutMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.ClassMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.CloneMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.CommandMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.DBLookupMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.DBReportMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.DropMediator3EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.EnrichMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.EntitlementMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.EventMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.FaultMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.FilterMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.HeaderMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.IterateMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.LogMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.OAuthMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.PropertyMediator3EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.RMSequenceMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.RuleMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.ScriptMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.SendMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.SequenceEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.SmooksMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.SpringMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.SwitchMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.ThrottleMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.TransactionMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.XQueryMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.XSLTMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbDiagramUpdater;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbVisualIDRegistry;

/**
 * @generated
 */
public class ProxyServiceInSequenceProxyServiceInSequenceCompartmentCanonicalEditPolicy
		extends CanonicalEditPolicy {

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
	protected EStructuralFeature getFeatureToSynchronize() {
		return EsbPackage.eINSTANCE.getProxyServiceInSequence_Children();
	}

	/**
	 * @generated
	 */
	@SuppressWarnings("rawtypes")
	protected List getSemanticChildrenList() {
		View viewObject = (View) getHost().getModel();
		LinkedList/*[org.eclipse.emf.ecore.EObject]*/result = new LinkedList/*[org.eclipse.emf.ecore.EObject]*/();
		List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/childDescriptors = EsbDiagramUpdater
				.getProxyServiceInSequenceProxyServiceInSequenceCompartment_7005SemanticChildren(viewObject);
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
		switch (visualID) {
		case DropMediator3EditPart.VISUAL_ID:
		case PropertyMediator3EditPart.VISUAL_ID:
		case ThrottleMediatorEditPart.VISUAL_ID:
		case FilterMediatorEditPart.VISUAL_ID:
		case LogMediatorEditPart.VISUAL_ID:
		case EnrichMediatorEditPart.VISUAL_ID:
		case XSLTMediatorEditPart.VISUAL_ID:
		case SwitchMediatorEditPart.VISUAL_ID:
		case SequenceEditPart.VISUAL_ID:
		case EventMediatorEditPart.VISUAL_ID:
		case EntitlementMediatorEditPart.VISUAL_ID:
		case ClassMediatorEditPart.VISUAL_ID:
		case SpringMediatorEditPart.VISUAL_ID:
		case ScriptMediatorEditPart.VISUAL_ID:
		case FaultMediatorEditPart.VISUAL_ID:
		case XQueryMediatorEditPart.VISUAL_ID:
		case CommandMediatorEditPart.VISUAL_ID:
		case DBLookupMediatorEditPart.VISUAL_ID:
		case DBReportMediatorEditPart.VISUAL_ID:
		case SmooksMediatorEditPart.VISUAL_ID:
		case SendMediatorEditPart.VISUAL_ID:
		case HeaderMediatorEditPart.VISUAL_ID:
		case CloneMediatorEditPart.VISUAL_ID:
		case CacheMediatorEditPart.VISUAL_ID:
		case IterateMediatorEditPart.VISUAL_ID:
		case CalloutMediatorEditPart.VISUAL_ID:
		case TransactionMediatorEditPart.VISUAL_ID:
		case RMSequenceMediatorEditPart.VISUAL_ID:
		case RuleMediatorEditPart.VISUAL_ID:
		case OAuthMediatorEditPart.VISUAL_ID:
		case AggregateMediatorEditPart.VISUAL_ID:
			return true;
		}
		return false;
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
				.getProxyServiceInSequenceProxyServiceInSequenceCompartment_7005SemanticChildren((View) getHost()
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
