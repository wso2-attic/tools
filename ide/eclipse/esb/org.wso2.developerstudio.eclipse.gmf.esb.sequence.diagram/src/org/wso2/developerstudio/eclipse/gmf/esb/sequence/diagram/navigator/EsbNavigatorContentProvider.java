package org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.AggregateMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.AggregateMediatorInputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.AggregateMediatorOnCompleteOutputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.AggregateMediatorOutputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.CacheMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.CacheMediatorInputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.CacheMediatorOutputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.CalloutMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.CalloutMediatorInputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.CalloutMediatorOutputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.ClassMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.ClassMediatorInputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.ClassMediatorOutputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.CloneMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.CloneMediatorInputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.CloneMediatorOutputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.CommandMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.CommandMediatorInputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.CommandMediatorOutputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.DBLookupMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.DBLookupMediatorInputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.DBLookupMediatorOutputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.DBReportMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.DBReportMediatorInputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.DBReportMediatorOutputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.DropMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.DropMediatorInputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.EnrichMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.EnrichMediatorInputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.EnrichMediatorOutputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.EntitlementMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.EntitlementMediatorInputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.EntitlementMediatorOutputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.EsbLinkEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.EsbSequenceEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.EsbSequenceInputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.EsbSequenceOutputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.EsbSequenceSeqContentsCompartmentEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.EventMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.EventMediatorInputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.EventMediatorOutputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.FaultMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.FaultMediatorInputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.FaultMediatorOutputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.FilterMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.FilterMediatorFailOutputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.FilterMediatorInputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.FilterMediatorPassOutputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.HeaderMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.HeaderMediatorInputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.HeaderMediatorOutputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.IterateMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.IterateMediatorInputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.IterateMediatorOutputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.LogMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.LogMediatorInputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.LogMediatorOutputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.OAuthMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.OAuthMediatorInputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.OAuthMediatorOutputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.PropertyMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.PropertyMediatorInputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.PropertyMediatorOutputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.RMSequenceMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.RMSequenceMediatorInputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.RMSequenceMediatorOutputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.RuleMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.RuleMediatorInputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.RuleMediatorOutputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.ScriptMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.ScriptMediatorInputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.ScriptMediatorOutputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.SendMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.SendMediatorInputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.SendMediatorOutputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.SequenceDiagramEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.SmooksMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.SmooksMediatorInputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.SmooksMediatorOutputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.SpringMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.SpringMediatorInputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.SpringMediatorOutputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.SwitchCaseBranchOutputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.SwitchDefaultBranchOutputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.SwitchMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.SwitchMediatorInputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.ThrottleMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.ThrottleMediatorInputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.ThrottleMediatorOutputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.TransactionMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.TransactionMediatorInputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.TransactionMediatorOutputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.XQueryMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.XQueryMediatorInputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.XQueryMediatorOutputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.XSLTMediatorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.XSLTMediatorInputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.XSLTMediatorOutputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.part.EsbVisualIDRegistry;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.part.Messages;

/**
 * @generated
 */
public class EsbNavigatorContentProvider implements ICommonContentProvider {

	/**
	 * @generated
	 */
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	 * @generated
	 */
	private Viewer myViewer;

	/**
	 * @generated
	 */
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	 * @generated
	 */
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	 * @generated
	 */
	private Runnable myViewerRefreshRunnable;

	/**
	 * @generated
	 */
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public EsbNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain,
				new WorkspaceSynchronizer.Delegate() {
					public void dispose() {
					}

					public boolean handleResourceChanged(final Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceDeleted(Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceMoved(Resource resource,
							final URI newURI) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}
				});
	}

	/**
	 * @generated
	 */
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	 * @generated
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	 * @generated
	 */
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet()
				.getResources()) {
			nextResource.unload();
		}
	}

	/**
	 * @generated
	 */
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay()
					.asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	 * @generated
	 */
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath()
					.toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(
					fileURI, true);
			ArrayList<EsbNavigatorItem> result = new ArrayList<EsbNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource
					.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(
					selectViewsByType(topViews,
							SequenceDiagramEditPart.MODEL_ID), file, false));
			return result.toArray();
		}

		if (parentElement instanceof EsbNavigatorGroup) {
			EsbNavigatorGroup group = (EsbNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof EsbNavigatorItem) {
			EsbNavigatorItem navigatorItem = (EsbNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (EsbVisualIDRegistry.getVisualID(view)) {

		case ClassMediatorOutputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_ClassMediatorOutputConnector_3543_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EsbVisualIDRegistry.getType(EsbLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case FilterMediatorFailOutputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_FilterMediatorFailOutputConnector_3527_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EsbVisualIDRegistry.getType(EsbLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case SmooksMediatorInputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_SmooksMediatorInputConnector_3566_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EsbVisualIDRegistry.getType(EsbLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case EsbSequenceInputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_EsbSequenceInputConnector_3517_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EsbVisualIDRegistry.getType(EsbLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case CalloutMediatorInputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_CalloutMediatorInputConnector_3587_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EsbVisualIDRegistry.getType(EsbLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case XQueryMediatorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(XQueryMediatorInputConnectorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(XQueryMediatorOutputConnectorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case ThrottleMediatorInputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_ThrottleMediatorInputConnector_3593_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EsbVisualIDRegistry.getType(EsbLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case RMSequenceMediatorOutputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_RMSequenceMediatorOutputConnector_3597_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EsbVisualIDRegistry.getType(EsbLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case FaultMediatorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(FaultMediatorInputConnectorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(FaultMediatorOutputConnectorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case CloneMediatorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(CloneMediatorInputConnectorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(CloneMediatorOutputConnectorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case SendMediatorInputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_SendMediatorInputConnector_3569_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EsbVisualIDRegistry.getType(EsbLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case EventMediatorOutputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_EventMediatorOutputConnector_3533_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EsbVisualIDRegistry.getType(EsbLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case RMSequenceMediatorInputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_RMSequenceMediatorInputConnector_3596_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EsbVisualIDRegistry.getType(EsbLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case CacheMediatorInputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_CacheMediatorInputConnector_3578_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EsbVisualIDRegistry.getType(EsbLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case LogMediatorOutputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_LogMediatorOutputConnector_3503_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EsbVisualIDRegistry.getType(EsbLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case EntitlementMediatorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(EntitlementMediatorInputConnectorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(EntitlementMediatorOutputConnectorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case TransactionMediatorOutputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_TransactionMediatorOutputConnector_3591_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EsbVisualIDRegistry.getType(EsbLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case XSLTMediatorInputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_XSLTMediatorInputConnector_3529_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EsbVisualIDRegistry.getType(EsbLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case IterateMediatorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(IterateMediatorInputConnectorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(IterateMediatorOutputConnectorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case TransactionMediatorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(TransactionMediatorInputConnectorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(TransactionMediatorOutputConnectorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case DBReportMediatorInputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_DBReportMediatorInputConnector_3563_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EsbVisualIDRegistry.getType(EsbLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case SpringMediatorInputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_SpringMediatorInputConnector_3545_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EsbVisualIDRegistry.getType(EsbLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case HeaderMediatorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(HeaderMediatorInputConnectorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(HeaderMediatorOutputConnectorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case ScriptMediatorOutputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_ScriptMediatorOutputConnector_3549_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EsbVisualIDRegistry.getType(EsbLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case AggregateMediatorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(AggregateMediatorInputConnectorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(AggregateMediatorOutputConnectorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(AggregateMediatorOnCompleteOutputConnectorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case SwitchMediatorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(SwitchMediatorInputConnectorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(SwitchCaseBranchOutputConnectorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(SwitchDefaultBranchOutputConnectorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case EsbSequenceEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(EsbSequenceSeqContentsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry.getType(LogMediatorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(EsbSequenceSeqContentsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(PropertyMediatorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(EsbSequenceInputConnectorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(EsbSequenceOutputConnectorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(EsbSequenceSeqContentsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry.getType(DropMediatorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(EsbSequenceSeqContentsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(EnrichMediatorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(EsbSequenceSeqContentsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(FilterMediatorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(EsbSequenceSeqContentsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry.getType(XSLTMediatorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(EsbSequenceSeqContentsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(EventMediatorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(EsbSequenceSeqContentsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(EntitlementMediatorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(EsbSequenceSeqContentsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(SwitchMediatorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(EsbSequenceSeqContentsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(ClassMediatorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(EsbSequenceSeqContentsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(SpringMediatorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(EsbSequenceSeqContentsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(ScriptMediatorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(EsbSequenceSeqContentsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(FaultMediatorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(EsbSequenceSeqContentsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(XQueryMediatorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(EsbSequenceSeqContentsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(CommandMediatorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(EsbSequenceSeqContentsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(DBLookupMediatorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(EsbSequenceSeqContentsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(DBReportMediatorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(EsbSequenceSeqContentsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(SmooksMediatorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(EsbSequenceSeqContentsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry.getType(SendMediatorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(EsbSequenceSeqContentsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(HeaderMediatorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(EsbSequenceSeqContentsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(CloneMediatorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(EsbSequenceSeqContentsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(CacheMediatorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(EsbSequenceSeqContentsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(IterateMediatorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(EsbSequenceSeqContentsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(AggregateMediatorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(EsbSequenceSeqContentsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(CalloutMediatorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(EsbSequenceSeqContentsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(TransactionMediatorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(EsbSequenceSeqContentsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(ThrottleMediatorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(EsbSequenceSeqContentsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(RMSequenceMediatorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(EsbSequenceSeqContentsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry.getType(RuleMediatorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(EsbSequenceSeqContentsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(OAuthMediatorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case SequenceDiagramEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Diagram sv = (Diagram) view;
			EsbNavigatorGroup links = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_SequenceDiagram_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EsbVisualIDRegistry.getType(EsbSequenceEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					EsbVisualIDRegistry.getType(EsbLinkEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case IterateMediatorInputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_IterateMediatorInputConnector_3581_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EsbVisualIDRegistry.getType(EsbLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case DBReportMediatorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(DBReportMediatorInputConnectorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(DBReportMediatorOutputConnectorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case EventMediatorInputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_EventMediatorInputConnector_3532_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EsbVisualIDRegistry.getType(EsbLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case CommandMediatorOutputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_CommandMediatorOutputConnector_3558_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EsbVisualIDRegistry.getType(EsbLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case IterateMediatorOutputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_IterateMediatorOutputConnector_3582_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EsbVisualIDRegistry.getType(EsbLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case EnrichMediatorInputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_EnrichMediatorInputConnector_3522_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EsbVisualIDRegistry.getType(EsbLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case EntitlementMediatorInputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_EntitlementMediatorInputConnector_3535_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EsbVisualIDRegistry.getType(EsbLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case EsbLinkEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			EsbNavigatorGroup target = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_EsbLink_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			EsbNavigatorGroup source = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_EsbLink_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(LogMediatorInputConnectorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(PropertyMediatorInputConnectorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(EsbSequenceOutputConnectorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(DropMediatorInputConnectorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(EnrichMediatorInputConnectorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(FilterMediatorInputConnectorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(XSLTMediatorInputConnectorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(EventMediatorInputConnectorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(EntitlementMediatorInputConnectorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(SwitchMediatorInputConnectorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ClassMediatorInputConnectorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(SpringMediatorInputConnectorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ScriptMediatorInputConnectorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(FaultMediatorInputConnectorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(XQueryMediatorInputConnectorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(CommandMediatorInputConnectorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(DBLookupMediatorInputConnectorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(DBReportMediatorInputConnectorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(SmooksMediatorInputConnectorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(SendMediatorInputConnectorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(HeaderMediatorInputConnectorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(CloneMediatorInputConnectorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(CacheMediatorInputConnectorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(IterateMediatorInputConnectorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(AggregateMediatorInputConnectorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(CalloutMediatorInputConnectorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(TransactionMediatorInputConnectorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ThrottleMediatorInputConnectorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(RMSequenceMediatorInputConnectorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(RuleMediatorInputConnectorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(OAuthMediatorInputConnectorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(LogMediatorOutputConnectorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(PropertyMediatorOutputConnectorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(EsbSequenceInputConnectorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(EnrichMediatorOutputConnectorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(FilterMediatorPassOutputConnectorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(FilterMediatorFailOutputConnectorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(XSLTMediatorOutputConnectorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(EventMediatorOutputConnectorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(EntitlementMediatorOutputConnectorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(SwitchCaseBranchOutputConnectorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(SwitchDefaultBranchOutputConnectorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ClassMediatorOutputConnectorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(SpringMediatorOutputConnectorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ScriptMediatorOutputConnectorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(FaultMediatorOutputConnectorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(XQueryMediatorOutputConnectorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(CommandMediatorOutputConnectorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(DBLookupMediatorOutputConnectorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(DBReportMediatorOutputConnectorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(SmooksMediatorOutputConnectorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(SendMediatorOutputConnectorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(HeaderMediatorOutputConnectorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(CloneMediatorOutputConnectorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(CacheMediatorOutputConnectorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(IterateMediatorOutputConnectorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(AggregateMediatorOutputConnectorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(AggregateMediatorOnCompleteOutputConnectorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(CalloutMediatorOutputConnectorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(TransactionMediatorOutputConnectorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ThrottleMediatorOutputConnectorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(RMSequenceMediatorOutputConnectorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(RuleMediatorOutputConnectorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(OAuthMediatorOutputConnectorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case AggregateMediatorOutputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_AggregateMediatorOutputConnector_3585_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EsbVisualIDRegistry.getType(EsbLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DBLookupMediatorInputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_DBLookupMediatorInputConnector_3560_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EsbVisualIDRegistry.getType(EsbLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case OAuthMediatorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(OAuthMediatorInputConnectorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(OAuthMediatorOutputConnectorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case CalloutMediatorOutputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_CalloutMediatorOutputConnector_3588_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EsbVisualIDRegistry.getType(EsbLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case RuleMediatorOutputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_RuleMediatorOutputConnector_3600_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EsbVisualIDRegistry.getType(EsbLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DBLookupMediatorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(DBLookupMediatorInputConnectorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(DBLookupMediatorOutputConnectorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case CloneMediatorOutputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_CloneMediatorOutputConnector_3576_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EsbVisualIDRegistry.getType(EsbLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ScriptMediatorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ScriptMediatorInputConnectorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ScriptMediatorOutputConnectorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case EnrichMediatorOutputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_EnrichMediatorOutputConnector_3523_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EsbVisualIDRegistry.getType(EsbLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case FaultMediatorOutputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_FaultMediatorOutputConnector_3552_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EsbVisualIDRegistry.getType(EsbLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case AggregateMediatorInputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_AggregateMediatorInputConnector_3584_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EsbVisualIDRegistry.getType(EsbLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case ThrottleMediatorOutputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_ThrottleMediatorOutputConnector_3594_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EsbVisualIDRegistry.getType(EsbLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case CloneMediatorInputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_CloneMediatorInputConnector_3575_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EsbVisualIDRegistry.getType(EsbLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case SendMediatorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(SendMediatorInputConnectorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(SendMediatorOutputConnectorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case TransactionMediatorInputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_TransactionMediatorInputConnector_3590_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EsbVisualIDRegistry.getType(EsbLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case XQueryMediatorOutputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_XQueryMediatorOutputConnector_3555_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EsbVisualIDRegistry.getType(EsbLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DBLookupMediatorOutputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_DBLookupMediatorOutputConnector_3561_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EsbVisualIDRegistry.getType(EsbLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case SendMediatorOutputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_SendMediatorOutputConnector_3570_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EsbVisualIDRegistry.getType(EsbLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case PropertyMediatorInputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_PropertyMediatorInputConnector_3513_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EsbVisualIDRegistry.getType(EsbLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case HeaderMediatorInputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_HeaderMediatorInputConnector_3572_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EsbVisualIDRegistry.getType(EsbLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case SmooksMediatorOutputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_SmooksMediatorOutputConnector_3567_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EsbVisualIDRegistry.getType(EsbLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case CalloutMediatorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(CalloutMediatorInputConnectorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(CalloutMediatorOutputConnectorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case CommandMediatorInputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_CommandMediatorInputConnector_3557_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EsbVisualIDRegistry.getType(EsbLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case OAuthMediatorInputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_OAuthMediatorInputConnector_3602_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EsbVisualIDRegistry.getType(EsbLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case RuleMediatorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(RuleMediatorInputConnectorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(RuleMediatorOutputConnectorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case PropertyMediatorOutputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_PropertyMediatorOutputConnector_3514_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EsbVisualIDRegistry.getType(EsbLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case OAuthMediatorOutputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_OAuthMediatorOutputConnector_3603_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EsbVisualIDRegistry.getType(EsbLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DropMediatorInputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_DropMediatorInputConnector_3520_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EsbVisualIDRegistry.getType(EsbLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case FilterMediatorPassOutputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_FilterMediatorPassOutputConnector_3526_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EsbVisualIDRegistry.getType(EsbLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case SwitchMediatorInputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_SwitchMediatorInputConnector_3538_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EsbVisualIDRegistry.getType(EsbLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case SpringMediatorOutputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_SpringMediatorOutputConnector_3546_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EsbVisualIDRegistry.getType(EsbLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DropMediatorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(DropMediatorInputConnectorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case EsbSequenceOutputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_EsbSequenceOutputConnector_3518_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EsbVisualIDRegistry.getType(EsbLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case FilterMediatorInputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_FilterMediatorInputConnector_3525_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EsbVisualIDRegistry.getType(EsbLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case ScriptMediatorInputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_ScriptMediatorInputConnector_3548_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EsbVisualIDRegistry.getType(EsbLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case SwitchCaseBranchOutputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_SwitchCaseBranchOutputConnector_3539_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EsbVisualIDRegistry.getType(EsbLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case CacheMediatorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(CacheMediatorInputConnectorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(CacheMediatorOutputConnectorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case PropertyMediatorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(PropertyMediatorInputConnectorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(PropertyMediatorOutputConnectorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case AggregateMediatorOnCompleteOutputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_AggregateMediatorOnCompleteOutputConnector_3604_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EsbVisualIDRegistry.getType(EsbLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case CacheMediatorOutputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_CacheMediatorOutputConnector_3579_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EsbVisualIDRegistry.getType(EsbLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ThrottleMediatorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ThrottleMediatorInputConnectorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ThrottleMediatorOutputConnectorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case FaultMediatorInputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_FaultMediatorInputConnector_3551_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EsbVisualIDRegistry.getType(EsbLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case ClassMediatorInputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_ClassMediatorInputConnector_3542_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EsbVisualIDRegistry.getType(EsbLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case RuleMediatorInputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_RuleMediatorInputConnector_3599_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EsbVisualIDRegistry.getType(EsbLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case EventMediatorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(EventMediatorInputConnectorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(EventMediatorOutputConnectorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case SpringMediatorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(SpringMediatorInputConnectorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(SpringMediatorOutputConnectorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case EnrichMediatorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(EnrichMediatorInputConnectorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(EnrichMediatorOutputConnectorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case SmooksMediatorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(SmooksMediatorInputConnectorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(SmooksMediatorOutputConnectorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case XQueryMediatorInputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_XQueryMediatorInputConnector_3554_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EsbVisualIDRegistry.getType(EsbLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case CommandMediatorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(CommandMediatorInputConnectorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(CommandMediatorOutputConnectorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case XSLTMediatorOutputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_XSLTMediatorOutputConnector_3530_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EsbVisualIDRegistry.getType(EsbLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case LogMediatorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(LogMediatorInputConnectorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(LogMediatorOutputConnectorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case SwitchDefaultBranchOutputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_SwitchDefaultBranchOutputConnector_3540_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EsbVisualIDRegistry.getType(EsbLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case LogMediatorInputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_LogMediatorInputConnector_3502_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EsbVisualIDRegistry.getType(EsbLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case DBReportMediatorOutputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_DBReportMediatorOutputConnector_3564_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EsbVisualIDRegistry.getType(EsbLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case RMSequenceMediatorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(RMSequenceMediatorInputConnectorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(RMSequenceMediatorOutputConnectorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case HeaderMediatorOutputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_HeaderMediatorOutputConnector_3573_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EsbVisualIDRegistry.getType(EsbLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case EntitlementMediatorOutputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_EntitlementMediatorOutputConnector_3536_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EsbVisualIDRegistry.getType(EsbLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case FilterMediatorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(FilterMediatorInputConnectorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(FilterMediatorPassOutputConnectorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(FilterMediatorFailOutputConnectorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case ClassMediatorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ClassMediatorInputConnectorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ClassMediatorOutputConnectorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case XSLTMediatorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(XSLTMediatorInputConnectorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(XSLTMediatorOutputConnectorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksSourceByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType())
					&& isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType())
					&& isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(
			Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views,
			String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return SequenceDiagramEditPart.MODEL_ID.equals(EsbVisualIDRegistry
				.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<EsbNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<EsbNavigatorItem> result = new ArrayList<EsbNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new EsbNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof EsbAbstractNavigatorItem) {
			EsbAbstractNavigatorItem abstractNavigatorItem = (EsbAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
