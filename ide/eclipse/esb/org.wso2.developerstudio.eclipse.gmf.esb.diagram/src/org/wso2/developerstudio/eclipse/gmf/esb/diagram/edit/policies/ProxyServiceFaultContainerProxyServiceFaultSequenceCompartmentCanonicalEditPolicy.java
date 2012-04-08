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
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.CacheMediator3EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.CalloutMediator5EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.ClassMediator3EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.CloneMediator5EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.CommandMediator3EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.DBLookupMediator5EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.DBReportMediator5EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.DropMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.EnrichMediator5EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.EntitlementMediator3EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.EventMediator3EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.FaultMediator5EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.FilterMediator5EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.HeaderMediator5EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.IterateMediator5EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.LogMediator5EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.OAuthMediator3EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.PropertyMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.RMSequenceMediator5EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.RuleMediator3EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.ScriptMediator3EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.SendMediator5EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.Sequence5EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.SmooksMediator3EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.SpringMediator3EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.SwitchMediator5EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.ThrottleMediator3EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.TransactionMediator5EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.XQueryMediator3EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.XSLTMediator5EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbDiagramUpdater;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbVisualIDRegistry;

/**
 * @generated
 */
public class ProxyServiceFaultContainerProxyServiceFaultSequenceCompartmentCanonicalEditPolicy
		extends CanonicalEditPolicy {

	/**
	 * @generated
	 */
	protected void refreshOnActivate() {
		// Need to activate editpart children before invoking the canonical refresh for EditParts to add event listeners
		List<?> c = getHost().getChildren();
		for (int i = 0; i < c.size(); i++) {
			((EditPart) c.get(i)).activate();
		}
		super.refreshOnActivate();
	}

	/**
	 * @generated
	 */
	protected EStructuralFeature getFeatureToSynchronize() {
		return EsbPackage.eINSTANCE.getProxyServiceFaultContainer_Children();
	}

	/**
	 * @generated
	 */
	@SuppressWarnings("rawtypes")
	protected List getSemanticChildrenList() {
		View viewObject = (View) getHost().getModel();
		LinkedList<EObject> result = new LinkedList<EObject>();
		List<EsbNodeDescriptor> childDescriptors = EsbDiagramUpdater
				.getProxyServiceFaultContainerProxyServiceFaultSequenceCompartment_7013SemanticChildren(viewObject);
		for (EsbNodeDescriptor d : childDescriptors) {
			result.add(d.getModelElement());
		}
		return result;
	}

	/**
	 * @generated
	 */
	protected boolean isOrphaned(Collection<EObject> semanticChildren,
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
		case DropMediatorEditPart.VISUAL_ID:
		case PropertyMediatorEditPart.VISUAL_ID:
		case ThrottleMediator3EditPart.VISUAL_ID:
		case FilterMediator5EditPart.VISUAL_ID:
		case LogMediator5EditPart.VISUAL_ID:
		case EnrichMediator5EditPart.VISUAL_ID:
		case XSLTMediator5EditPart.VISUAL_ID:
		case SwitchMediator5EditPart.VISUAL_ID:
		case Sequence5EditPart.VISUAL_ID:
		case EventMediator3EditPart.VISUAL_ID:
		case EntitlementMediator3EditPart.VISUAL_ID:
		case ClassMediator3EditPart.VISUAL_ID:
		case SpringMediator3EditPart.VISUAL_ID:
		case ScriptMediator3EditPart.VISUAL_ID:
		case FaultMediator5EditPart.VISUAL_ID:
		case XQueryMediator3EditPart.VISUAL_ID:
		case CommandMediator3EditPart.VISUAL_ID:
		case DBLookupMediator5EditPart.VISUAL_ID:
		case DBReportMediator5EditPart.VISUAL_ID:
		case SmooksMediator3EditPart.VISUAL_ID:
		case SendMediator5EditPart.VISUAL_ID:
		case HeaderMediator5EditPart.VISUAL_ID:
		case CloneMediator5EditPart.VISUAL_ID:
		case CacheMediator3EditPart.VISUAL_ID:
		case IterateMediator5EditPart.VISUAL_ID:
		case CalloutMediator5EditPart.VISUAL_ID:
		case TransactionMediator5EditPart.VISUAL_ID:
		case RMSequenceMediator5EditPart.VISUAL_ID:
		case RuleMediator3EditPart.VISUAL_ID:
		case OAuthMediator3EditPart.VISUAL_ID:
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
		LinkedList<IAdaptable> createdViews = new LinkedList<IAdaptable>();
		List<EsbNodeDescriptor> childDescriptors = EsbDiagramUpdater
				.getProxyServiceFaultContainerProxyServiceFaultSequenceCompartment_7013SemanticChildren((View) getHost()
						.getModel());
		LinkedList<View> orphaned = new LinkedList<View>();
		// we care to check only views we recognize as ours
		LinkedList<View> knownViewChildren = new LinkedList<View>();
		for (View v : getViewChildren()) {
			if (isMyDiagramElement(v)) {
				knownViewChildren.add(v);
			}
		}
		// alternative to #cleanCanonicalSemanticChildren(getViewChildren(), semanticChildren)
		//
		// iteration happens over list of desired semantic elements, trying to find best matching View, while original CEP
		// iterates views, potentially losing view (size/bounds) information - i.e. if there are few views to reference same EObject, only last one 
		// to answer isOrphaned == true will be used for the domain element representation, see #cleanCanonicalSemanticChildren()
		for (Iterator<EsbNodeDescriptor> descriptorsIterator = childDescriptors
				.iterator(); descriptorsIterator.hasNext();) {
			EsbNodeDescriptor next = descriptorsIterator.next();
			String hint = EsbVisualIDRegistry.getType(next.getVisualID());
			LinkedList<View> perfectMatch = new LinkedList<View>(); // both semanticElement and hint match that of NodeDescriptor
			for (View childView : getViewChildren()) {
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
		ArrayList<CreateViewRequest.ViewDescriptor> viewDescriptors = new ArrayList<CreateViewRequest.ViewDescriptor>(
				childDescriptors.size());
		for (EsbNodeDescriptor next : childDescriptors) {
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
			@SuppressWarnings("unchecked")
			List<IAdaptable> nl = (List<IAdaptable>) request.getNewObject();
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
