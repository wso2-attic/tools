package org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.policies;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.commands.DeferredLayoutCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.SetViewMutabilityCommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateConnectionViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.wso2.carbonstudio.eclipse.gmf.esb.EsbPackage;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.AggregateMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.AggregateMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.AggregateMediatorOnCompleteOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.AggregateMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.CacheMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.CacheMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.CacheMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.CalloutMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.CalloutMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.CalloutMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.ClassMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.ClassMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.ClassMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.CloneMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.CloneMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.CloneMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.CommandMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.CommandMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.CommandMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.DBLookupMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.DBLookupMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.DBLookupMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.DBReportMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.DBReportMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.DBReportMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.DropMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.DropMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.EnrichMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.EnrichMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.EnrichMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.EntitlementMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.EntitlementMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.EntitlementMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.EsbLinkEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.EsbSequenceEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.EsbSequenceInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.EsbSequenceOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.EventMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.EventMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.EventMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.FaultMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.FaultMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.FaultMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.FilterMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.FilterMediatorFailOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.FilterMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.FilterMediatorPassOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.HeaderMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.HeaderMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.HeaderMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.IterateMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.IterateMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.IterateMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.LogMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.LogMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.LogMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.OAuthMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.OAuthMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.OAuthMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.PropertyMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.PropertyMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.PropertyMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.RMSequenceMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.RMSequenceMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.RMSequenceMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.RuleMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.RuleMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.RuleMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.ScriptMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.ScriptMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.ScriptMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.SendMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.SendMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.SendMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.SequenceDiagramEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.SmooksMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.SmooksMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.SmooksMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.SpringMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.SpringMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.SpringMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.SwitchCaseBranchOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.SwitchDefaultBranchOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.SwitchMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.SwitchMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.ThrottleMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.ThrottleMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.ThrottleMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.TransactionMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.TransactionMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.TransactionMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.XQueryMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.XQueryMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.XQueryMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.XSLTMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.XSLTMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.XSLTMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.part.EsbDiagramUpdater;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.part.EsbLinkDescriptor;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.part.EsbNodeDescriptor;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.part.EsbVisualIDRegistry;

/**
 * @generated
 */
public class SequenceDiagramCanonicalEditPolicy extends CanonicalEditPolicy {

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
		return EsbPackage.eINSTANCE.getSequenceDiagram_Sequence();
	}

	/**
	 * @generated
	 */
	@SuppressWarnings("rawtypes")
	protected List getSemanticChildrenList() {
		View viewObject = (View) getHost().getModel();
		LinkedList<EObject> result = new LinkedList<EObject>();
		List<EsbNodeDescriptor> childDescriptors = EsbDiagramUpdater
				.getSequenceDiagram_1000SemanticChildren(viewObject);
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
		return EsbSequenceEditPart.VISUAL_ID == EsbVisualIDRegistry
				.getVisualID(view);
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
				.getSequenceDiagram_1000SemanticChildren((View) getHost()
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

		Collection<IAdaptable> createdConnectionViews = refreshConnections();

		if (createdViews.size() > 1) {
			// perform a layout of the container
			DeferredLayoutCommand layoutCmd = new DeferredLayoutCommand(host()
					.getEditingDomain(), createdViews, host());
			executeCommand(new ICommandProxy(layoutCmd));
		}

		createdViews.addAll(createdConnectionViews);

		makeViewsImmutable(createdViews);
	}

	/**
	 * @generated
	 */
	private Collection<IAdaptable> refreshConnections() {
		Map<EObject, View> domain2NotationMap = new HashMap<EObject, View>();
		Collection<EsbLinkDescriptor> linkDescriptors = collectAllLinks(
				getDiagram(), domain2NotationMap);
		Collection existingLinks = new LinkedList(getDiagram().getEdges());
		for (Iterator linksIterator = existingLinks.iterator(); linksIterator
				.hasNext();) {
			Edge nextDiagramLink = (Edge) linksIterator.next();
			int diagramLinkVisualID = EsbVisualIDRegistry
					.getVisualID(nextDiagramLink);
			if (diagramLinkVisualID == -1) {
				if (nextDiagramLink.getSource() != null
						&& nextDiagramLink.getTarget() != null) {
					linksIterator.remove();
				}
				continue;
			}
			EObject diagramLinkObject = nextDiagramLink.getElement();
			EObject diagramLinkSrc = nextDiagramLink.getSource().getElement();
			EObject diagramLinkDst = nextDiagramLink.getTarget().getElement();
			for (Iterator<EsbLinkDescriptor> linkDescriptorsIterator = linkDescriptors
					.iterator(); linkDescriptorsIterator.hasNext();) {
				EsbLinkDescriptor nextLinkDescriptor = linkDescriptorsIterator
						.next();
				if (diagramLinkObject == nextLinkDescriptor.getModelElement()
						&& diagramLinkSrc == nextLinkDescriptor.getSource()
						&& diagramLinkDst == nextLinkDescriptor
								.getDestination()
						&& diagramLinkVisualID == nextLinkDescriptor
								.getVisualID()) {
					linksIterator.remove();
					linkDescriptorsIterator.remove();
					break;
				}
			}
		}
		deleteViews(existingLinks.iterator());
		return createConnections(linkDescriptors, domain2NotationMap);
	}

	/**
	 * @generated
	 */
	private Collection<EsbLinkDescriptor> collectAllLinks(View view,
			Map<EObject, View> domain2NotationMap) {
		if (!SequenceDiagramEditPart.MODEL_ID.equals(EsbVisualIDRegistry
				.getModelID(view))) {
			return Collections.emptyList();
		}
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		switch (EsbVisualIDRegistry.getVisualID(view)) {
		case SequenceDiagramEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getSequenceDiagram_1000ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case EsbSequenceEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getEsbSequence_2501ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case LogMediatorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getLogMediator_3501ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case LogMediatorInputConnectorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getLogMediatorInputConnector_3502ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case LogMediatorOutputConnectorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getLogMediatorOutputConnector_3503ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case PropertyMediatorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getPropertyMediator_3512ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case PropertyMediatorInputConnectorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getPropertyMediatorInputConnector_3513ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case PropertyMediatorOutputConnectorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getPropertyMediatorOutputConnector_3514ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case EsbSequenceInputConnectorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getEsbSequenceInputConnector_3517ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case EsbSequenceOutputConnectorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getEsbSequenceOutputConnector_3518ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case DropMediatorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getDropMediator_3519ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case DropMediatorInputConnectorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getDropMediatorInputConnector_3520ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case EnrichMediatorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getEnrichMediator_3521ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case EnrichMediatorInputConnectorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getEnrichMediatorInputConnector_3522ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case EnrichMediatorOutputConnectorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getEnrichMediatorOutputConnector_3523ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case FilterMediatorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getFilterMediator_3524ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case FilterMediatorInputConnectorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getFilterMediatorInputConnector_3525ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case FilterMediatorPassOutputConnectorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getFilterMediatorPassOutputConnector_3526ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case FilterMediatorFailOutputConnectorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getFilterMediatorFailOutputConnector_3527ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case XSLTMediatorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getXSLTMediator_3528ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case XSLTMediatorInputConnectorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getXSLTMediatorInputConnector_3529ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case XSLTMediatorOutputConnectorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getXSLTMediatorOutputConnector_3530ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case EventMediatorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getEventMediator_3531ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case EventMediatorInputConnectorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getEventMediatorInputConnector_3532ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case EventMediatorOutputConnectorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getEventMediatorOutputConnector_3533ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case EntitlementMediatorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getEntitlementMediator_3534ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case EntitlementMediatorInputConnectorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getEntitlementMediatorInputConnector_3535ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case EntitlementMediatorOutputConnectorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getEntitlementMediatorOutputConnector_3536ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case SwitchMediatorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getSwitchMediator_3537ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case SwitchMediatorInputConnectorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getSwitchMediatorInputConnector_3538ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case SwitchCaseBranchOutputConnectorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getSwitchCaseBranchOutputConnector_3539ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case SwitchDefaultBranchOutputConnectorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getSwitchDefaultBranchOutputConnector_3540ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case ClassMediatorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getClassMediator_3541ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case ClassMediatorInputConnectorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getClassMediatorInputConnector_3542ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case ClassMediatorOutputConnectorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getClassMediatorOutputConnector_3543ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case SpringMediatorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getSpringMediator_3544ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case SpringMediatorInputConnectorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getSpringMediatorInputConnector_3545ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case SpringMediatorOutputConnectorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getSpringMediatorOutputConnector_3546ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case ScriptMediatorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getScriptMediator_3547ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case ScriptMediatorInputConnectorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getScriptMediatorInputConnector_3548ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case ScriptMediatorOutputConnectorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getScriptMediatorOutputConnector_3549ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case FaultMediatorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getFaultMediator_3550ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case FaultMediatorInputConnectorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getFaultMediatorInputConnector_3551ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case FaultMediatorOutputConnectorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getFaultMediatorOutputConnector_3552ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case XQueryMediatorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getXQueryMediator_3553ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case XQueryMediatorInputConnectorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getXQueryMediatorInputConnector_3554ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case XQueryMediatorOutputConnectorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getXQueryMediatorOutputConnector_3555ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case CommandMediatorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getCommandMediator_3556ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case CommandMediatorInputConnectorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getCommandMediatorInputConnector_3557ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case CommandMediatorOutputConnectorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getCommandMediatorOutputConnector_3558ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case DBLookupMediatorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getDBLookupMediator_3559ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case DBLookupMediatorInputConnectorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getDBLookupMediatorInputConnector_3560ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case DBLookupMediatorOutputConnectorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getDBLookupMediatorOutputConnector_3561ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case DBReportMediatorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getDBReportMediator_3562ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case DBReportMediatorInputConnectorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getDBReportMediatorInputConnector_3563ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case DBReportMediatorOutputConnectorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getDBReportMediatorOutputConnector_3564ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case SmooksMediatorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getSmooksMediator_3565ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case SmooksMediatorInputConnectorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getSmooksMediatorInputConnector_3566ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case SmooksMediatorOutputConnectorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getSmooksMediatorOutputConnector_3567ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case SendMediatorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getSendMediator_3568ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case SendMediatorInputConnectorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getSendMediatorInputConnector_3569ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case SendMediatorOutputConnectorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getSendMediatorOutputConnector_3570ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case HeaderMediatorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getHeaderMediator_3571ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case HeaderMediatorInputConnectorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getHeaderMediatorInputConnector_3572ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case HeaderMediatorOutputConnectorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getHeaderMediatorOutputConnector_3573ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case CloneMediatorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getCloneMediator_3574ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case CloneMediatorInputConnectorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getCloneMediatorInputConnector_3575ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case CloneMediatorOutputConnectorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getCloneMediatorOutputConnector_3576ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case CacheMediatorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getCacheMediator_3577ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case CacheMediatorInputConnectorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getCacheMediatorInputConnector_3578ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case CacheMediatorOutputConnectorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getCacheMediatorOutputConnector_3579ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case IterateMediatorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getIterateMediator_3580ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case IterateMediatorInputConnectorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getIterateMediatorInputConnector_3581ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case IterateMediatorOutputConnectorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getIterateMediatorOutputConnector_3582ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case AggregateMediatorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getAggregateMediator_3583ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case AggregateMediatorInputConnectorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getAggregateMediatorInputConnector_3584ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case AggregateMediatorOutputConnectorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getAggregateMediatorOutputConnector_3585ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case AggregateMediatorOnCompleteOutputConnectorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getAggregateMediatorOnCompleteOutputConnector_3604ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case CalloutMediatorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getCalloutMediator_3586ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case CalloutMediatorInputConnectorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getCalloutMediatorInputConnector_3587ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case CalloutMediatorOutputConnectorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getCalloutMediatorOutputConnector_3588ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case TransactionMediatorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getTransactionMediator_3589ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case TransactionMediatorInputConnectorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getTransactionMediatorInputConnector_3590ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case TransactionMediatorOutputConnectorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getTransactionMediatorOutputConnector_3591ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case ThrottleMediatorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getThrottleMediator_3592ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case ThrottleMediatorInputConnectorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getThrottleMediatorInputConnector_3593ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case ThrottleMediatorOutputConnectorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getThrottleMediatorOutputConnector_3594ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case RMSequenceMediatorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getRMSequenceMediator_3595ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case RMSequenceMediatorInputConnectorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getRMSequenceMediatorInputConnector_3596ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case RMSequenceMediatorOutputConnectorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getRMSequenceMediatorOutputConnector_3597ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case RuleMediatorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getRuleMediator_3598ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case RuleMediatorInputConnectorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getRuleMediatorInputConnector_3599ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case RuleMediatorOutputConnectorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getRuleMediatorOutputConnector_3600ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case OAuthMediatorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getOAuthMediator_3601ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case OAuthMediatorInputConnectorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getOAuthMediatorInputConnector_3602ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case OAuthMediatorOutputConnectorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getOAuthMediatorOutputConnector_3603ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case EsbLinkEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(EsbDiagramUpdater
						.getEsbLink_4001ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		}
		for (Iterator children = view.getChildren().iterator(); children
				.hasNext();) {
			result.addAll(collectAllLinks((View) children.next(),
					domain2NotationMap));
		}
		for (Iterator edges = view.getSourceEdges().iterator(); edges.hasNext();) {
			result.addAll(collectAllLinks((View) edges.next(),
					domain2NotationMap));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<IAdaptable> createConnections(
			Collection<EsbLinkDescriptor> linkDescriptors,
			Map<EObject, View> domain2NotationMap) {
		LinkedList<IAdaptable> adapters = new LinkedList<IAdaptable>();
		for (EsbLinkDescriptor nextLinkDescriptor : linkDescriptors) {
			EditPart sourceEditPart = getEditPart(
					nextLinkDescriptor.getSource(), domain2NotationMap);
			EditPart targetEditPart = getEditPart(
					nextLinkDescriptor.getDestination(), domain2NotationMap);
			if (sourceEditPart == null || targetEditPart == null) {
				continue;
			}
			CreateConnectionViewRequest.ConnectionViewDescriptor descriptor = new CreateConnectionViewRequest.ConnectionViewDescriptor(
					nextLinkDescriptor.getSemanticAdapter(),
					EsbVisualIDRegistry.getType(nextLinkDescriptor
							.getVisualID()), ViewUtil.APPEND, false,
					((IGraphicalEditPart) getHost())
							.getDiagramPreferencesHint());
			CreateConnectionViewRequest ccr = new CreateConnectionViewRequest(
					descriptor);
			ccr.setType(RequestConstants.REQ_CONNECTION_START);
			ccr.setSourceEditPart(sourceEditPart);
			sourceEditPart.getCommand(ccr);
			ccr.setTargetEditPart(targetEditPart);
			ccr.setType(RequestConstants.REQ_CONNECTION_END);
			Command cmd = targetEditPart.getCommand(ccr);
			if (cmd != null && cmd.canExecute()) {
				executeCommand(cmd);
				IAdaptable viewAdapter = (IAdaptable) ccr.getNewObject();
				if (viewAdapter != null) {
					adapters.add(viewAdapter);
				}
			}
		}
		return adapters;
	}

	/**
	 * @generated
	 */
	private EditPart getEditPart(EObject domainModelElement,
			Map<EObject, View> domain2NotationMap) {
		View view = (View) domain2NotationMap.get(domainModelElement);
		if (view != null) {
			return (EditPart) getHost().getViewer().getEditPartRegistry()
					.get(view);
		}
		return null;
	}

	/**
	 * @generated
	 */
	private Diagram getDiagram() {
		return ((View) getHost().getModel()).getDiagram();
	}
}
