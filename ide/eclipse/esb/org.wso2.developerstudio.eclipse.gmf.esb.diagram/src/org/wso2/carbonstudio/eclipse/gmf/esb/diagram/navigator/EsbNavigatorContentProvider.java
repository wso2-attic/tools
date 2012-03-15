package org.wso2.carbonstudio.eclipse.gmf.esb.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
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
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.*;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.part.EsbVisualIDRegistry;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.part.Messages;

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
					selectViewsByType(topViews, EsbDiagramEditPart.MODEL_ID),
					file, false));
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

		case DBReportMediatorInputConnector2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_DBReportMediatorInputConnector_3163_incominglinks,
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

		case DefaultEndPointInputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_DefaultEndPointInputConnector_3021_incominglinks,
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

		case EntitlementMediatorInputConnector2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_EntitlementMediatorInputConnector_3261_incominglinks,
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
					Messages.NavigatorGroupName_SpringMediatorOutputConnector_3062_outgoinglinks,
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

		case XSLTMediator4EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(XSLTMediatorInputConnector4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(XSLTMediatorOutputConnector4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case FilterMediatorInputConnector2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_FilterMediatorInputConnector_3140_incominglinks,
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

		case LogMediatorOutputConnector2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_LogMediatorOutputConnector_3136_outgoinglinks,
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

		case CacheMediatorInputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_CacheMediatorInputConnector_3106_incominglinks,
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

		case Sequence3EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(SequenceInputConnector3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(SequenceOutputConnector3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
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

		case PropertyMediatorOutputConnector2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_PropertyMediatorOutputConnector_3145_outgoinglinks,
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

		case DBReportMediatorOutputConnector3EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_DBReportMediatorOutputConnector_3286_outgoinglinks,
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

		case RMSequenceMediatorOutputConnector2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_RMSequenceMediatorOutputConnector_3186_outgoinglinks,
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

		case PropertyMediatorInputConnector3EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_PropertyMediatorInputConnector_3201_incominglinks,
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

		case SequenceInputConnector3EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_SequenceInputConnector_3255_incominglinks,
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

		case WSDLEndPointInputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_WSDLEndPointInputConnector_3092_incominglinks,
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

		case SequenceInputConnector4EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_SequenceInputConnector_3376_incominglinks,
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

		case ProxyServiceOutSequenceEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ProxyServiceOutSequenceProxyServiceOutSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(DropMediator4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ProxyServiceOutSequenceProxyServiceOutSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(PropertyMediator4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ProxyServiceOutSequenceProxyServiceOutSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(ThrottleMediator2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ProxyServiceOutSequenceProxyServiceOutSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(FilterMediator3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ProxyServiceOutSequenceProxyServiceOutSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry.getType(LogMediator3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ProxyServiceOutSequenceProxyServiceOutSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(EnrichMediator3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ProxyServiceOutSequenceProxyServiceOutSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(XSLTMediator3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ProxyServiceOutSequenceProxyServiceOutSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(SwitchMediator3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ProxyServiceOutSequenceProxyServiceOutSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry.getType(Sequence3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ProxyServiceOutSequenceProxyServiceOutSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(EventMediator2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ProxyServiceOutSequenceProxyServiceOutSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(EntitlementMediator2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ProxyServiceOutSequenceProxyServiceOutSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(ClassMediator2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ProxyServiceOutSequenceProxyServiceOutSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(SpringMediator2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ProxyServiceOutSequenceProxyServiceOutSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(ScriptMediator2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ProxyServiceOutSequenceProxyServiceOutSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(FaultMediator3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ProxyServiceOutSequenceProxyServiceOutSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(XQueryMediator2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ProxyServiceOutSequenceProxyServiceOutSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(CommandMediator2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ProxyServiceOutSequenceProxyServiceOutSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(DBLookupMediator3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ProxyServiceOutSequenceProxyServiceOutSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(DBReportMediator3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ProxyServiceOutSequenceProxyServiceOutSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(SmooksMediator2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ProxyServiceOutSequenceProxyServiceOutSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(SendMediator3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ProxyServiceOutSequenceProxyServiceOutSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(HeaderMediator3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ProxyServiceOutSequenceProxyServiceOutSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(CloneMediator3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ProxyServiceOutSequenceProxyServiceOutSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(CacheMediator2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ProxyServiceOutSequenceProxyServiceOutSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(IterateMediator3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ProxyServiceOutSequenceProxyServiceOutSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(CalloutMediator3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ProxyServiceOutSequenceProxyServiceOutSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(TransactionMediator3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ProxyServiceOutSequenceProxyServiceOutSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(RMSequenceMediator3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ProxyServiceOutSequenceProxyServiceOutSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(RuleMediator2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ProxyServiceOutSequenceProxyServiceOutSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(OAuthMediator2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ProxyServiceOutSequenceProxyServiceOutSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(AggregateMediator2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case DropMediatorInputConnector2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_DropMediatorInputConnector_3138_incominglinks,
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

		case LoadBalanceEndPointInputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_LoadBalanceEndPointInputConnector_3095_incominglinks,
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

		case CacheMediatorOutputConnector2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_CacheMediatorOutputConnector_3302_outgoinglinks,
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
					Messages.NavigatorGroupName_DBLookupMediatorInputConnector_3076_incominglinks,
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

		case XSLTMediatorInputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_XSLTMediatorInputConnector_3039_incominglinks,
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

		case LogMediatorOutputConnector3EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_LogMediatorOutputConnector_3243_outgoinglinks,
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

		case IterateMediatorOutputConnector4EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_IterateMediatorOutputConnector_3365_outgoinglinks,
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

		case EnrichMediatorInputConnector3EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_EnrichMediatorInputConnector_3245_incominglinks,
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

		case LoadBalanceEndPoint2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(LoadBalanceEndPointInputConnectorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(LoadBalanceEndPointOutputConnectorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(LoadBalanceEndPointWestOutputConnectorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case SendMediatorOutputConnector4EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_SendMediatorOutputConnector_3355_outgoinglinks,
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

		case EnrichMediatorOutputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_EnrichMediatorOutputConnector_3037_outgoinglinks,
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

		case IterateMediatorInputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_IterateMediatorInputConnector_3109_incominglinks,
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

		case RMSequenceMediator4EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(RMSequenceMediatorInputConnector4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(RMSequenceMediatorOutputConnector4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case SequenceEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(SequenceInputConnectorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(SequenceOutputConnectorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case ThrottleMediatorOutputConnector2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_ThrottleMediatorOutputConnector_3208_outgoinglinks,
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

		case Sequence2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(SequenceInputConnector2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(SequenceOutputConnector2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case CloneMediator4EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(CloneMediatorInputConnector4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(CloneMediatorOutputConnector4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(CloneMediatorTargetOutputConnector4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case EntitlementMediator2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(EntitlementMediatorInputConnector2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(EntitlementMediatorOutputConnector2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case EnrichMediatorOutputConnector4EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_EnrichMediatorOutputConnector_3389_outgoinglinks,
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

		case SwitchDefaultBranchOutputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_SwitchDefaultBranchOutputConnector_3044_outgoinglinks,
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
					Messages.NavigatorGroupName_LogMediatorInputConnector_3018_incominglinks,
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

		case PropertyMediatorOutputConnector4EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_PropertyMediatorOutputConnector_3204_outgoinglinks,
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

		case FaultMediatorInputConnector3EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_FaultMediatorInputConnector_3273_incominglinks,
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

		case ThrottleMediatorInputConnector2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_ThrottleMediatorInputConnector_3207_incominglinks,
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

		case EventMediatorInputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_EventMediatorInputConnector_3052_incominglinks,
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

		case FilterMediatorInputConnector4EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_FilterMediatorInputConnector_3330_incominglinks,
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
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ProxyInputConnectorEditPart.VISUAL_ID));
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
							.getType(PropertyMediatorInputConnectorEditPart.VISUAL_ID));
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
							.getType(FilterMediatorInputConnectorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(LogMediatorInputConnectorEditPart.VISUAL_ID));
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
							.getType(XSLTMediatorInputConnectorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(SwitchMediatorInputConnectorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(SequenceInputConnectorEditPart.VISUAL_ID));
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
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(AggregateMediatorInputConnectorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(LogMediatorInputConnector2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(DropMediatorInputConnector2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(FilterMediatorInputConnector2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(PropertyMediatorInputConnector2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(EnrichMediatorInputConnector2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(XSLTMediatorInputConnector2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(SwitchMediatorInputConnector2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(FaultMediatorInputConnector2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(DBLookupMediatorInputConnector2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(DBReportMediatorInputConnector2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(SendMediatorInputConnector2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(HeaderMediatorInputConnector2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(CloneMediatorInputConnector2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(IterateMediatorInputConnector2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(CalloutMediatorInputConnector2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(TransactionMediatorInputConnector2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(RMSequenceMediatorInputConnector2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(SequenceInputConnector2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(DropMediatorInputConnector3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(PropertyMediatorInputConnector3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ThrottleMediatorInputConnector2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(FilterMediatorInputConnector3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(LogMediatorInputConnector3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(EnrichMediatorInputConnector3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(XSLTMediatorInputConnector3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(SwitchMediatorInputConnector3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(SequenceInputConnector3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(EventMediatorInputConnector2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(EntitlementMediatorInputConnector2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ClassMediatorInputConnector2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(SpringMediatorInputConnector2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ScriptMediatorInputConnector2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(FaultMediatorInputConnector3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(XQueryMediatorInputConnector2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(CommandMediatorInputConnector2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(DBLookupMediatorInputConnector3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(DBReportMediatorInputConnector3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(SmooksMediatorInputConnector2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(SendMediatorInputConnector3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(HeaderMediatorInputConnector3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(CloneMediatorInputConnector3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(CacheMediatorInputConnector2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(IterateMediatorInputConnector3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(CalloutMediatorInputConnector3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(TransactionMediatorInputConnector3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(RMSequenceMediatorInputConnector3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(RuleMediatorInputConnector2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(OAuthMediatorInputConnector2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(AggregateMediatorInputConnector2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(LogMediatorInputConnector4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(DropMediatorInputConnector4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(FilterMediatorInputConnector4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(PropertyMediatorInputConnector4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(EnrichMediatorInputConnector4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(XSLTMediatorInputConnector4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(SwitchMediatorInputConnector4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(FaultMediatorInputConnector4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(DBLookupMediatorInputConnector4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(DBReportMediatorInputConnector4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(SendMediatorInputConnector4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(HeaderMediatorInputConnector4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(CloneMediatorInputConnector4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(IterateMediatorInputConnector4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(CalloutMediatorInputConnector4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(TransactionMediatorInputConnector4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(RMSequenceMediatorInputConnector4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(SequenceInputConnector4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(DefaultEndPointInputConnectorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(AddressEndPointInputConnectorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(FailoverEndPointInputConnectorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(WSDLEndPointInputConnectorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(LoadBalanceEndPointInputConnectorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(MessageInputConnectorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(MergeNodeFirstInputConnectorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(MergeNodeSecondInputConnectorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ProxyOutputConnectorEditPart.VISUAL_ID));
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
							.getType(ThrottleMediatorOutputConnectorEditPart.VISUAL_ID));
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
							.getType(LogMediatorOutputConnectorEditPart.VISUAL_ID));
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
							.getType(XSLTMediatorOutputConnectorEditPart.VISUAL_ID));
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
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(SequenceOutputConnectorEditPart.VISUAL_ID));
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
							.getType(CloneMediatorTargetOutputConnectorEditPart.VISUAL_ID));
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
							.getType(LogMediatorOutputConnector2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(FilterMediatorPassOutputConnector2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(FilterMediatorFailOutputConnector2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(PropertyMediatorOutputConnector2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(EnrichMediatorOutputConnector2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(XSLTMediatorOutputConnector2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(SwitchCaseBranchOutputConnector2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(SwitchDefaultBranchOutputConnector2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(FaultMediatorOutputConnector2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(DBLookupMediatorOutputConnector2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(DBReportMediatorOutputConnector2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(SendMediatorOutputConnector2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(HeaderMediatorOutputConnector2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(CloneMediatorOutputConnector2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(CloneMediatorTargetOutputConnector2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(IterateMediatorOutputConnector2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(CalloutMediatorOutputConnector2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(TransactionMediatorOutputConnector2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(RMSequenceMediatorOutputConnector2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(SequenceOutputConnector2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(PropertyMediatorOutputConnector3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ThrottleMediatorOutputConnector2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(FilterMediatorPassOutputConnector3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(FilterMediatorFailOutputConnector3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(LogMediatorOutputConnector3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(EnrichMediatorOutputConnector3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(XSLTMediatorOutputConnector3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(SwitchCaseBranchOutputConnector3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(SwitchDefaultBranchOutputConnector3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(SequenceOutputConnector3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(EventMediatorOutputConnector2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(EntitlementMediatorOutputConnector2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ClassMediatorOutputConnector2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(SpringMediatorOutputConnector2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ScriptMediatorOutputConnector2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(FaultMediatorOutputConnector3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(XQueryMediatorOutputConnector2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(CommandMediatorOutputConnector2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(DBLookupMediatorOutputConnector3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(DBReportMediatorOutputConnector3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(SmooksMediatorOutputConnector2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(SendMediatorOutputConnector3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(HeaderMediatorOutputConnector3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(CloneMediatorOutputConnector3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(CloneMediatorTargetOutputConnector3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(CacheMediatorOutputConnector2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(IterateMediatorOutputConnector3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(CalloutMediatorOutputConnector3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(TransactionMediatorOutputConnector3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(RMSequenceMediatorOutputConnector3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(RuleMediatorOutputConnector2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(OAuthMediatorOutputConnector2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(AggregateMediatorOutputConnector2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(AggregateMediatorOnCompleteOutputConnector2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(LogMediatorOutputConnector4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(FilterMediatorPassOutputConnector4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(FilterMediatorFailOutputConnector4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(PropertyMediatorOutputConnector4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(EnrichMediatorOutputConnector4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(XSLTMediatorOutputConnector4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(SwitchCaseBranchOutputConnector4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(SwitchDefaultBranchOutputConnector4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(FaultMediatorOutputConnector4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(DBLookupMediatorOutputConnector4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(DBReportMediatorOutputConnector4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(SendMediatorOutputConnector4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(HeaderMediatorOutputConnector4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(CloneMediatorOutputConnector4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(CloneMediatorTargetOutputConnector4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(IterateMediatorOutputConnector4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(CalloutMediatorOutputConnector4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(TransactionMediatorOutputConnector4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(RMSequenceMediatorOutputConnector4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(SequenceOutputConnector4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(DefaultEndPointOutputConnectorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(AddressEndPointOutputConnectorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(FailoverEndPointOutputConnectorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(FailoverEndPointWestOutputConnectorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(WSDLEndPointOutputConnectorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(LoadBalanceEndPointOutputConnectorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(LoadBalanceEndPointWestOutputConnectorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(MessageOutputConnectorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(MergeNodeOutputConnectorEditPart.VISUAL_ID));
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

		case DBReportMediatorInputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_DBReportMediatorInputConnector_3079_incominglinks,
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

		case DBLookupMediator4EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(DBLookupMediatorInputConnector4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(DBLookupMediatorOutputConnector4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case XSLTMediator2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(XSLTMediatorInputConnector2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(XSLTMediatorOutputConnector2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case LogMediatorInputConnector3EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_LogMediatorInputConnector_3242_incominglinks,
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

		case FaultMediator4EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(FaultMediatorInputConnector4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(FaultMediatorOutputConnector4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case HeaderMediator4EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(HeaderMediatorInputConnector4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(HeaderMediatorOutputConnector4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case SendMediatorOutputConnector3EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_SendMediatorOutputConnector_3292_outgoinglinks,
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

		case LogMediatorInputConnector4EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_LogMediatorInputConnector_3326_incominglinks,
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

		case DBLookupMediatorOutputConnector3EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_DBLookupMediatorOutputConnector_3283_outgoinglinks,
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
					Messages.NavigatorGroupName_OAuthMediatorOutputConnector_3131_outgoinglinks,
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

		case CommandMediatorInputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_CommandMediatorInputConnector_3073_incominglinks,
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

		case SequenceOutputConnector4EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_SequenceOutputConnector_3377_outgoinglinks,
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

		case SpringMediatorInputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_SpringMediatorInputConnector_3061_incominglinks,
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

		case EsbServerEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(EsbServerContentsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry.getType(ProxyServiceEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(MessageMediatorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(EsbServerContentsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry.getType(MergeNodeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case EnrichMediator4EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(EnrichMediatorInputConnector4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(EnrichMediatorOutputConnector4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case XSLTMediatorOutputConnector4EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_XSLTMediatorOutputConnector_3339_outgoinglinks,
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

		case PropertyMediator3EditPart.VISUAL_ID: {
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

		case RuleMediatorInputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_RuleMediatorInputConnector_3127_incominglinks,
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

		case SpringMediatorInputConnector2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_SpringMediatorInputConnector_3267_incominglinks,
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

		case FilterMediatorFailOutputConnector3EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_FilterMediatorFailOutputConnector_3240_outgoinglinks,
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

		case SwitchMediatorInputConnector2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_SwitchMediatorInputConnector_3153_incominglinks,
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

		case SendMediatorOutputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_SendMediatorOutputConnector_3086_outgoinglinks,
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

		case SequenceOutputConnector3EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_SequenceOutputConnector_3256_outgoinglinks,
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

		case CloneMediatorTargetOutputConnector2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_CloneMediatorTargetOutputConnector_3174_outgoinglinks,
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

		case SendMediatorInputConnector4EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_SendMediatorInputConnector_3354_incominglinks,
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

		case SwitchMediatorInputConnector4EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_SwitchMediatorInputConnector_3341_incominglinks,
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
					Messages.NavigatorGroupName_HeaderMediatorInputConnector_3100_incominglinks,
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

		case SendMediator3EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(SendMediatorInputConnector3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(SendMediatorOutputConnector3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case AggregateMediatorOutputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_AggregateMediatorOutputConnector_3113_outgoinglinks,
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

		case HeaderMediatorInputConnector4EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_HeaderMediatorInputConnector_3357_incominglinks,
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

		case OAuthMediatorOutputConnector2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_OAuthMediatorOutputConnector_3320_outgoinglinks,
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

		case OAuthMediatorInputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_OAuthMediatorInputConnector_3130_incominglinks,
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

		case LogMediator3EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(LogMediatorInputConnector3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(LogMediatorOutputConnector3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case DBReportMediator2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(DBReportMediatorInputConnector2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(DBReportMediatorOutputConnector2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case EntitlementMediatorInputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_EntitlementMediatorInputConnector_3055_incominglinks,
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

		case TransactionMediator3EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(TransactionMediatorInputConnector3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(TransactionMediatorOutputConnector3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case ProxyServiceEndpointContainerEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ProxyServiceEndpointContainerEndpointCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(DefaultEndPoint2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ProxyServiceEndpointContainerEndpointCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(AddressEndPoint2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ProxyServiceEndpointContainerEndpointCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(FailoverEndPoint2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ProxyServiceEndpointContainerEndpointCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(WSDLEndPoint2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ProxyServiceEndpointContainerEndpointCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(LoadBalanceEndPoint2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case FilterMediatorFailOutputConnector2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_FilterMediatorFailOutputConnector_3142_outgoinglinks,
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

		case MergeNodeEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(MergeNodeFirstInputConnectorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(MergeNodeSecondInputConnectorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(MergeNodeOutputConnectorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case MessageMediatorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(MessageInputConnectorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(MessageOutputConnectorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case CloneMediatorTargetOutputConnector4EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_CloneMediatorTargetOutputConnector_3362_outgoinglinks,
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

		case SwitchMediator3EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(SwitchMediatorInputConnector3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(SwitchCaseBranchOutputConnector3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(SwitchDefaultBranchOutputConnector3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case MessageInputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_MessageInputConnector_3046_incominglinks,
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

		case DBReportMediator3EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(DBReportMediatorInputConnector3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(DBReportMediatorOutputConnector3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case DBReportMediatorInputConnector3EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_DBReportMediatorInputConnector_3285_incominglinks,
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

		case TransactionMediatorOutputConnector4EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_TransactionMediatorOutputConnector_3371_outgoinglinks,
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

		case RuleMediator2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(RuleMediatorInputConnector2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(RuleMediatorOutputConnector2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
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

		case ScriptMediator2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ScriptMediatorInputConnector2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ScriptMediatorOutputConnector2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case SwitchDefaultBranchOutputConnector3EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_SwitchDefaultBranchOutputConnector_3253_outgoinglinks,
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

		case PropertyMediator4EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(PropertyMediatorInputConnector3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(PropertyMediatorOutputConnector3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case RMSequenceMediatorOutputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_RMSequenceMediatorOutputConnector_3125_outgoinglinks,
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

		case IterateMediatorInputConnector3EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_IterateMediatorInputConnector_3304_incominglinks,
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

		case EntitlementMediatorOutputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_EntitlementMediatorOutputConnector_3056_outgoinglinks,
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

		case AggregateMediatorOnCompleteOutputConnector2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_AggregateMediatorOnCompleteOutputConnector_3324_outgoinglinks,
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
					Messages.NavigatorGroupName_FaultMediatorOutputConnector_3068_outgoinglinks,
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

		case CalloutMediator4EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(CalloutMediatorInputConnector4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(CalloutMediatorOutputConnector4EditPart.VISUAL_ID));
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

		case IterateMediator3EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(IterateMediatorInputConnector3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(IterateMediatorOutputConnector3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case FaultMediatorInputConnector4EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_FaultMediatorInputConnector_3345_incominglinks,
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

		case DropMediatorInputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_DropMediatorInputConnector_3008_incominglinks,
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

		case SequenceOutputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_SequenceOutputConnector_3050_outgoinglinks,
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

		case ScriptMediatorInputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_ScriptMediatorInputConnector_3064_incominglinks,
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

		case TransactionMediatorOutputConnector3EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_TransactionMediatorOutputConnector_3311_outgoinglinks,
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

		case ScriptMediatorOutputConnector2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_ScriptMediatorOutputConnector_3271_outgoinglinks,
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
					Messages.NavigatorGroupName_CalloutMediatorInputConnector_3115_incominglinks,
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

		case MessageOutputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_MessageOutputConnector_3047_outgoinglinks,
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

		case DropMediator3EditPart.VISUAL_ID: {
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

		case AddressEndPoint2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(AddressEndPointInputConnectorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(AddressEndPointOutputConnectorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case LogMediator2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(LogMediatorInputConnector2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(LogMediatorOutputConnector2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case SendMediatorInputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_SendMediatorInputConnector_3085_incominglinks,
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

		case AddressEndPointInputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_AddressEndPointInputConnector_3030_incominglinks,
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

		case OAuthMediatorInputConnector2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_OAuthMediatorInputConnector_3319_incominglinks,
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

		case CloneMediatorTargetOutputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_CloneMediatorTargetOutputConnector_3133_outgoinglinks,
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

		case DBLookupMediatorInputConnector3EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_DBLookupMediatorInputConnector_3282_incominglinks,
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

		case CommandMediatorInputConnector2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_CommandMediatorInputConnector_3279_incominglinks,
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

		case HeaderMediatorInputConnector3EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_HeaderMediatorInputConnector_3294_incominglinks,
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

		case CalloutMediator2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(CalloutMediatorInputConnector2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(CalloutMediatorOutputConnector2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case TransactionMediatorOutputConnector2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_TransactionMediatorOutputConnector_3184_outgoinglinks,
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

		case RMSequenceMediatorOutputConnector4EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_RMSequenceMediatorOutputConnector_3374_outgoinglinks,
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
					Messages.NavigatorGroupName_DBLookupMediatorOutputConnector_3077_outgoinglinks,
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

		case DBLookupMediator2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(DBLookupMediatorInputConnector2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(DBLookupMediatorOutputConnector2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case AggregateMediatorOnCompleteOutputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_AggregateMediatorOnCompleteOutputConnector_3132_outgoinglinks,
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

		case MergeNodeFirstInputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_MergeNodeFirstInputConnector_3014_incominglinks,
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

		case CalloutMediatorInputConnector3EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_CalloutMediatorInputConnector_3307_incominglinks,
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

		case ClassMediator2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ClassMediatorInputConnector2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ClassMediatorOutputConnector2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case RMSequenceMediatorOutputConnector3EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_RMSequenceMediatorOutputConnector_3314_outgoinglinks,
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

		case SwitchDefaultBranchOutputConnector2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_SwitchDefaultBranchOutputConnector_3155_outgoinglinks,
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

		case RMSequenceMediatorInputConnector4EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_RMSequenceMediatorInputConnector_3373_incominglinks,
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

		case SwitchDefaultBranchOutputConnector4EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_SwitchDefaultBranchOutputConnector_3343_outgoinglinks,
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

		case SpringMediator2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(SpringMediatorInputConnector2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(SpringMediatorOutputConnector2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case PropertyMediator2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(PropertyMediatorInputConnector2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(PropertyMediatorOutputConnector2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case AggregateMediator2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(AggregateMediatorInputConnector2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(AggregateMediatorOutputConnector2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(AggregateMediatorOnCompleteOutputConnector2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(AggregateMediatorAggregateCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry.getType(LogMediator4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(AggregateMediatorAggregateCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(DropMediator5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(AggregateMediatorAggregateCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(FilterMediator4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(AggregateMediatorAggregateCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(PropertyMediator5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(AggregateMediatorAggregateCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(EnrichMediator4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(AggregateMediatorAggregateCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(XSLTMediator4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(AggregateMediatorAggregateCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(SwitchMediator4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(AggregateMediatorAggregateCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(FaultMediator4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(AggregateMediatorAggregateCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(DBLookupMediator4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(AggregateMediatorAggregateCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(DBReportMediator4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(AggregateMediatorAggregateCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(SendMediator4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(AggregateMediatorAggregateCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(HeaderMediator4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(AggregateMediatorAggregateCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(CloneMediator4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(AggregateMediatorAggregateCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(IterateMediator4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(AggregateMediatorAggregateCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(CalloutMediator4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(AggregateMediatorAggregateCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(TransactionMediator4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(AggregateMediatorAggregateCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(RMSequenceMediator4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(AggregateMediatorAggregateCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry.getType(Sequence4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case SwitchCaseBranchOutputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_SwitchCaseBranchOutputConnector_3043_outgoinglinks,
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

		case FilterMediatorInputConnector3EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_FilterMediatorInputConnector_3238_incominglinks,
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

		case EventMediatorOutputConnector2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_EventMediatorOutputConnector_3259_outgoinglinks,
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

		case IterateMediator4EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(IterateMediatorInputConnector4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(IterateMediatorOutputConnector4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case CommandMediatorOutputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_CommandMediatorOutputConnector_3074_outgoinglinks,
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

		case OAuthMediator2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(OAuthMediatorInputConnector2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(OAuthMediatorOutputConnector2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case RMSequenceMediatorInputConnector3EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_RMSequenceMediatorInputConnector_3313_incominglinks,
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

		case IterateMediatorInputConnector4EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_IterateMediatorInputConnector_3364_incominglinks,
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

		case MergeNodeOutputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_MergeNodeOutputConnector_3016_outgoinglinks,
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

		case RuleMediatorInputConnector2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_RuleMediatorInputConnector_3316_incominglinks,
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

		case PropertyMediatorInputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_PropertyMediatorInputConnector_3033_incominglinks,
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

		case SmooksMediatorInputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_SmooksMediatorInputConnector_3082_incominglinks,
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

		case FaultMediatorInputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_FaultMediatorInputConnector_3067_incominglinks,
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

		case SwitchMediatorInputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_SwitchMediatorInputConnector_3042_incominglinks,
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

		case EnrichMediatorOutputConnector2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_EnrichMediatorOutputConnector_3148_outgoinglinks,
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

		case EsbDiagramEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Diagram sv = (Diagram) view;
			EsbNavigatorGroup links = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_EsbDiagram_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EsbVisualIDRegistry.getType(EsbServerEditPart.VISUAL_ID));
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

		case MergeNodeSecondInputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_MergeNodeSecondInputConnector_3015_incominglinks,
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

		case FailoverEndPointWestOutputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_FailoverEndPointWestOutputConnector_3097_outgoinglinks,
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

		case FaultMediator2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(FaultMediatorInputConnector2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(FaultMediatorOutputConnector2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case EnrichMediatorOutputConnector3EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_EnrichMediatorOutputConnector_3246_outgoinglinks,
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

		case SequenceOutputConnector2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_SequenceOutputConnector_3189_outgoinglinks,
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

		case ClassMediatorInputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_ClassMediatorInputConnector_3058_incominglinks,
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

		case ClassMediatorOutputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_ClassMediatorOutputConnector_3059_outgoinglinks,
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

		case DBLookupMediatorInputConnector4EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_DBLookupMediatorInputConnector_3348_incominglinks,
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

		case LogMediatorInputConnector2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_LogMediatorInputConnector_3135_incominglinks,
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

		case HeaderMediatorInputConnector2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_HeaderMediatorInputConnector_3169_incominglinks,
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

		case FaultMediatorInputConnector2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_FaultMediatorInputConnector_3157_incominglinks,
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

		case HeaderMediatorOutputConnector4EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_HeaderMediatorOutputConnector_3358_outgoinglinks,
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

		case FaultMediatorOutputConnector2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_FaultMediatorOutputConnector_3158_outgoinglinks,
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

		case XQueryMediatorInputConnector2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_XQueryMediatorInputConnector_3276_incominglinks,
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

		case IterateMediatorOutputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_IterateMediatorOutputConnector_3110_outgoinglinks,
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

		case LogMediatorOutputConnector4EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_LogMediatorOutputConnector_3327_outgoinglinks,
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

		case HeaderMediator2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(HeaderMediatorInputConnector2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(HeaderMediatorOutputConnector2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case EventMediatorInputConnector2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_EventMediatorInputConnector_3258_incominglinks,
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

		case SwitchMediatorInputConnector3EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_SwitchMediatorInputConnector_3251_incominglinks,
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

		case Sequence4EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(SequenceInputConnector4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(SequenceOutputConnector4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case FilterMediatorPassOutputConnector2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_FilterMediatorPassOutputConnector_3141_outgoinglinks,
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

		case SendMediatorInputConnector3EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_SendMediatorInputConnector_3291_incominglinks,
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
					Messages.NavigatorGroupName_SmooksMediatorOutputConnector_3083_outgoinglinks,
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

		case XQueryMediatorInputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_XQueryMediatorInputConnector_3070_incominglinks,
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

		case WSDLEndPoint2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(WSDLEndPointInputConnectorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(WSDLEndPointOutputConnectorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case XSLTMediatorInputConnector2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_XSLTMediatorInputConnector_3150_incominglinks,
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

		case CommandMediatorOutputConnector2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_CommandMediatorOutputConnector_3280_outgoinglinks,
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

		case EnrichMediatorInputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_EnrichMediatorInputConnector_3036_incominglinks,
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

		case SendMediator2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(SendMediatorInputConnector2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(SendMediatorOutputConnector2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case FilterMediatorPassOutputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_FilterMediatorPassOutputConnector_3011_outgoinglinks,
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

		case ClassMediatorOutputConnector2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_ClassMediatorOutputConnector_3265_outgoinglinks,
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

		case CacheMediatorInputConnector2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_CacheMediatorInputConnector_3301_incominglinks,
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

		case SpringMediatorOutputConnector2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_SpringMediatorOutputConnector_3268_outgoinglinks,
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

		case DBReportMediatorOutputConnector4EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_DBReportMediatorOutputConnector_3352_outgoinglinks,
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

		case SequenceInputConnector2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_SequenceInputConnector_3188_incominglinks,
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

		case CalloutMediator3EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(CalloutMediatorInputConnector3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(CalloutMediatorOutputConnector3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case CloneMediatorInputConnector4EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_CloneMediatorInputConnector_3360_incominglinks,
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

		case CloneMediator3EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(CloneMediatorInputConnector3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(CloneMediatorOutputConnector3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(CloneMediatorTargetOutputConnector3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case EventMediator2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(EventMediatorInputConnector2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(EventMediatorOutputConnector2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case EnrichMediator2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(EnrichMediatorInputConnector2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(EnrichMediatorOutputConnector2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case LogMediator4EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(LogMediatorInputConnector4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(LogMediatorOutputConnector4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case RMSequenceMediatorInputConnector2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_RMSequenceMediatorInputConnector_3185_incominglinks,
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

		case WSDLEndPointOutputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_WSDLEndPointOutputConnector_3093_outgoinglinks,
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

		case XSLTMediatorInputConnector4EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_XSLTMediatorInputConnector_3338_incominglinks,
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

		case AggregateMediatorOutputConnector2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_AggregateMediatorOutputConnector_3323_outgoinglinks,
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
					Messages.NavigatorGroupName_AggregateMediatorInputConnector_3112_incominglinks,
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

		case XSLTMediator3EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(XSLTMediatorInputConnector3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(XSLTMediatorOutputConnector3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case FailoverEndPointOutputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_FailoverEndPointOutputConnector_3090_outgoinglinks,
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

		case IterateMediator2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(IterateMediatorInputConnector2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(IterateMediatorOutputConnector2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case FailoverEndPoint2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(FailoverEndPointInputConnectorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(FailoverEndPointOutputConnectorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(FailoverEndPointWestOutputConnectorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case ProxyOutputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_ProxyOutputConnector_3002_outgoinglinks,
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

		case DropMediatorInputConnector4EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_DropMediatorInputConnector_3195_incominglinks,
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

		case ProxyInputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_ProxyInputConnector_3003_incominglinks,
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

		case EntitlementMediatorOutputConnector2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_EntitlementMediatorOutputConnector_3262_outgoinglinks,
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

		case XQueryMediatorOutputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_XQueryMediatorOutputConnector_3071_outgoinglinks,
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

		case TransactionMediatorInputConnector3EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_TransactionMediatorInputConnector_3310_incominglinks,
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

		case XSLTMediatorInputConnector3EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_XSLTMediatorInputConnector_3248_incominglinks,
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

		case DBLookupMediatorInputConnector2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_DBLookupMediatorInputConnector_3160_incominglinks,
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

		case DBLookupMediatorOutputConnector2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_DBLookupMediatorOutputConnector_3161_outgoinglinks,
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
					Messages.NavigatorGroupName_RuleMediatorOutputConnector_3128_outgoinglinks,
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

		case ThrottleMediatorInputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_ThrottleMediatorInputConnector_3121_incominglinks,
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

		case CalloutMediatorOutputConnector2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_CalloutMediatorOutputConnector_3182_outgoinglinks,
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

		case CloneMediatorInputConnector3EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_CloneMediatorInputConnector_3297_incominglinks,
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

		case SendMediatorOutputConnector2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_SendMediatorOutputConnector_3167_outgoinglinks,
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

		case CalloutMediatorOutputConnector3EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_CalloutMediatorOutputConnector_3308_outgoinglinks,
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

		case FaultMediatorOutputConnector3EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_FaultMediatorOutputConnector_3274_outgoinglinks,
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

		case ProxyServiceInSequenceEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ProxyServiceInSequenceProxyServiceInSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(DropMediator3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ProxyServiceInSequenceProxyServiceInSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(PropertyMediator3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ProxyServiceInSequenceProxyServiceInSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(ThrottleMediatorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ProxyServiceInSequenceProxyServiceInSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(FilterMediatorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ProxyServiceInSequenceProxyServiceInSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry.getType(LogMediatorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ProxyServiceInSequenceProxyServiceInSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(EnrichMediatorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ProxyServiceInSequenceProxyServiceInSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry.getType(XSLTMediatorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ProxyServiceInSequenceProxyServiceInSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(SwitchMediatorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ProxyServiceInSequenceProxyServiceInSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry.getType(SequenceEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ProxyServiceInSequenceProxyServiceInSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(EventMediatorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ProxyServiceInSequenceProxyServiceInSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(EntitlementMediatorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ProxyServiceInSequenceProxyServiceInSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(ClassMediatorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ProxyServiceInSequenceProxyServiceInSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(SpringMediatorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ProxyServiceInSequenceProxyServiceInSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(ScriptMediatorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ProxyServiceInSequenceProxyServiceInSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(FaultMediatorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ProxyServiceInSequenceProxyServiceInSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(XQueryMediatorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ProxyServiceInSequenceProxyServiceInSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(CommandMediatorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ProxyServiceInSequenceProxyServiceInSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(DBLookupMediatorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ProxyServiceInSequenceProxyServiceInSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(DBReportMediatorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ProxyServiceInSequenceProxyServiceInSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(SmooksMediatorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ProxyServiceInSequenceProxyServiceInSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry.getType(SendMediatorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ProxyServiceInSequenceProxyServiceInSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(HeaderMediatorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ProxyServiceInSequenceProxyServiceInSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(CloneMediatorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ProxyServiceInSequenceProxyServiceInSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(CacheMediatorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ProxyServiceInSequenceProxyServiceInSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(IterateMediatorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ProxyServiceInSequenceProxyServiceInSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(CalloutMediatorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ProxyServiceInSequenceProxyServiceInSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(TransactionMediatorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ProxyServiceInSequenceProxyServiceInSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(RMSequenceMediatorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ProxyServiceInSequenceProxyServiceInSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry.getType(RuleMediatorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ProxyServiceInSequenceProxyServiceInSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(OAuthMediatorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ProxyServiceInSequenceProxyServiceInSequenceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(AggregateMediatorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case SmooksMediatorOutputConnector2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_SmooksMediatorOutputConnector_3289_outgoinglinks,
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

		case RMSequenceMediator2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(RMSequenceMediatorInputConnector2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(RMSequenceMediatorOutputConnector2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case DBReportMediator4EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(DBReportMediatorInputConnector4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(DBReportMediatorOutputConnector4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case PropertyMediatorOutputConnector3EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_PropertyMediatorOutputConnector_3202_outgoinglinks,
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

		case FilterMediator2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(FilterMediatorInputConnector2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(FilterMediatorPassOutputConnector2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(FilterMediatorFailOutputConnector2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
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
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(AggregateMediatorAggregateCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry.getType(LogMediator2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(AggregateMediatorAggregateCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(DropMediator2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(AggregateMediatorAggregateCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(FilterMediator2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(AggregateMediatorAggregateCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(PropertyMediator2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(AggregateMediatorAggregateCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(EnrichMediator2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(AggregateMediatorAggregateCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(XSLTMediator2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(AggregateMediatorAggregateCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(SwitchMediator2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(AggregateMediatorAggregateCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(FaultMediator2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(AggregateMediatorAggregateCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(DBLookupMediator2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(AggregateMediatorAggregateCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(DBReportMediator2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(AggregateMediatorAggregateCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(SendMediator2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(AggregateMediatorAggregateCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(HeaderMediator2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(AggregateMediatorAggregateCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(CloneMediator2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(AggregateMediatorAggregateCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(IterateMediator2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(AggregateMediatorAggregateCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(CalloutMediator2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(AggregateMediatorAggregateCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(TransactionMediator2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(AggregateMediatorAggregateCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry
							.getType(RMSequenceMediator2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(AggregateMediatorAggregateCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EsbVisualIDRegistry.getType(Sequence2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case ScriptMediatorOutputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_ScriptMediatorOutputConnector_3065_outgoinglinks,
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

		case ThrottleMediator2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ThrottleMediatorInputConnector2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ThrottleMediatorOutputConnector2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case HeaderMediator3EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(HeaderMediatorInputConnector3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(HeaderMediatorOutputConnector3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case DropMediator2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(DropMediatorInputConnector2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case CloneMediatorInputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_CloneMediatorInputConnector_3103_incominglinks,
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

		case ProxyServiceSequenceContainerEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ProxyServiceInSequenceEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ProxyServiceOutSequenceEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case TransactionMediator2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(TransactionMediatorInputConnector2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(TransactionMediatorOutputConnector2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case TransactionMediatorInputConnector4EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_TransactionMediatorInputConnector_3370_incominglinks,
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

		case CalloutMediatorInputConnector2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_CalloutMediatorInputConnector_3181_incominglinks,
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

		case DefaultEndPointOutputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_DefaultEndPointOutputConnector_3022_outgoinglinks,
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

		case SwitchCaseBranchOutputConnector2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_SwitchCaseBranchOutputConnector_3154_outgoinglinks,
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

		case DBLookupMediatorOutputConnector4EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_DBLookupMediatorOutputConnector_3349_outgoinglinks,
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

		case CalloutMediatorOutputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_CalloutMediatorOutputConnector_3116_outgoinglinks,
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

		case TransactionMediatorInputConnector2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_TransactionMediatorInputConnector_3183_incominglinks,
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

		case SwitchMediator2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(SwitchMediatorInputConnector2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(SwitchCaseBranchOutputConnector2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(SwitchDefaultBranchOutputConnector2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case SmooksMediator2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(SmooksMediatorInputConnector2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(SmooksMediatorOutputConnector2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case FilterMediatorFailOutputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_FilterMediatorFailOutputConnector_3012_outgoinglinks,
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

		case PropertyMediatorInputConnector4EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_PropertyMediatorInputConnector_3203_incominglinks,
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
					Messages.NavigatorGroupName_DBReportMediatorOutputConnector_3080_outgoinglinks,
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

		case SendMediator4EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(SendMediatorInputConnector4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(SendMediatorOutputConnector4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case XQueryMediatorOutputConnector2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_XQueryMediatorOutputConnector_3277_outgoinglinks,
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

		case PropertyMediatorInputConnector2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_PropertyMediatorInputConnector_3144_incominglinks,
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

		case EnrichMediator3EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(EnrichMediatorInputConnector3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(EnrichMediatorOutputConnector3EditPart.VISUAL_ID));
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

		case FilterMediator4EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(FilterMediatorInputConnector4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(FilterMediatorPassOutputConnector4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(FilterMediatorFailOutputConnector4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
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

		case XSLTMediatorOutputConnector3EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_XSLTMediatorOutputConnector_3249_outgoinglinks,
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

		case IterateMediatorOutputConnector2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_IterateMediatorOutputConnector_3177_outgoinglinks,
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

		case EnrichMediatorInputConnector2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_EnrichMediatorInputConnector_3147_incominglinks,
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

		case AggregateMediatorInputConnector2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_AggregateMediatorInputConnector_3322_incominglinks,
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

		case PropertyMediatorOutputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_PropertyMediatorOutputConnector_3034_outgoinglinks,
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

		case SwitchCaseBranchOutputConnector4EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_SwitchCaseBranchOutputConnector_3342_outgoinglinks,
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

		case TransactionMediatorInputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_TransactionMediatorInputConnector_3118_incominglinks,
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

		case TransactionMediator4EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(TransactionMediatorInputConnector4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(TransactionMediatorOutputConnector4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case DBLookupMediator3EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(DBLookupMediatorInputConnector3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(DBLookupMediatorOutputConnector3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case FilterMediatorInputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_FilterMediatorInputConnector_3010_incominglinks,
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

		case HeaderMediatorOutputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_HeaderMediatorOutputConnector_3101_outgoinglinks,
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

		case CloneMediatorOutputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_CloneMediatorOutputConnector_3104_outgoinglinks,
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

		case CloneMediator2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(CloneMediatorInputConnector2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(CloneMediatorOutputConnector2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(CloneMediatorTargetOutputConnector2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case CacheMediator2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(CacheMediatorInputConnector2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(CacheMediatorOutputConnector2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case HeaderMediatorOutputConnector3EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_HeaderMediatorOutputConnector_3295_outgoinglinks,
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

		case CloneMediatorOutputConnector4EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_CloneMediatorOutputConnector_3361_outgoinglinks,
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

		case XSLTMediatorOutputConnector2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_XSLTMediatorOutputConnector_3151_outgoinglinks,
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

		case ProxyServiceEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ProxyOutputConnectorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ProxyInputConnectorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ProxyServiceSequenceContainerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(ProxyServiceEndpointContainerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case SwitchCaseBranchOutputConnector3EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_SwitchCaseBranchOutputConnector_3252_outgoinglinks,
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

		case SequenceInputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_SequenceInputConnector_3049_incominglinks,
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

		case ClassMediatorInputConnector2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_ClassMediatorInputConnector_3264_incominglinks,
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

		case FilterMediator3EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(FilterMediatorInputConnector3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(FilterMediatorPassOutputConnector3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(FilterMediatorFailOutputConnector3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case CalloutMediatorOutputConnector4EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_CalloutMediatorOutputConnector_3368_outgoinglinks,
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
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(CloneMediatorTargetOutputConnectorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case DefaultEndPoint2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(DefaultEndPointInputConnectorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(DefaultEndPointOutputConnectorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case IterateMediatorInputConnector2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_IterateMediatorInputConnector_3176_incominglinks,
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

		case AddressEndPointOutputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_AddressEndPointOutputConnector_3031_outgoinglinks,
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

		case ScriptMediatorInputConnector2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_ScriptMediatorInputConnector_3270_incominglinks,
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

		case SmooksMediatorInputConnector2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_SmooksMediatorInputConnector_3288_incominglinks,
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

		case LoadBalanceEndPointOutputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_LoadBalanceEndPointOutputConnector_3096_outgoinglinks,
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

		case RuleMediatorOutputConnector2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_RuleMediatorOutputConnector_3317_outgoinglinks,
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

		case HeaderMediatorOutputConnector2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_HeaderMediatorOutputConnector_3170_outgoinglinks,
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

		case DBReportMediatorInputConnector4EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_DBReportMediatorInputConnector_3351_incominglinks,
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
					Messages.NavigatorGroupName_ThrottleMediatorOutputConnector_3122_outgoinglinks,
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

		case DBReportMediatorOutputConnector2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_DBReportMediatorOutputConnector_3164_outgoinglinks,
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

		case FilterMediatorPassOutputConnector4EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_FilterMediatorPassOutputConnector_3331_outgoinglinks,
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

		case PropertyMediator5EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(PropertyMediatorInputConnector4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(PropertyMediatorOutputConnector4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case DropMediator4EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(DropMediatorInputConnector3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case CloneMediatorInputConnector2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_CloneMediatorInputConnector_3172_incominglinks,
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

		case CloneMediatorOutputConnector3EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_CloneMediatorOutputConnector_3298_outgoinglinks,
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

		case RMSequenceMediator3EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(RMSequenceMediatorInputConnector3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(RMSequenceMediatorOutputConnector3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case CloneMediatorOutputConnector2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_CloneMediatorOutputConnector_3173_outgoinglinks,
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

		case SendMediatorInputConnector2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_SendMediatorInputConnector_3166_incominglinks,
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

		case RMSequenceMediatorInputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_RMSequenceMediatorInputConnector_3124_incominglinks,
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
					Messages.NavigatorGroupName_EventMediatorOutputConnector_3053_outgoinglinks,
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
					Messages.NavigatorGroupName_CacheMediatorOutputConnector_3107_outgoinglinks,
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

		case TransactionMediatorOutputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_TransactionMediatorOutputConnector_3119_outgoinglinks,
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

		case IterateMediatorOutputConnector3EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_IterateMediatorOutputConnector_3305_outgoinglinks,
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

		case DropMediatorInputConnector3EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_DropMediatorInputConnector_3192_incominglinks,
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

		case CalloutMediatorInputConnector4EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_CalloutMediatorInputConnector_3367_incominglinks,
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

		case FaultMediatorOutputConnector4EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_FaultMediatorOutputConnector_3346_outgoinglinks,
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

		case FilterMediatorFailOutputConnector4EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_FilterMediatorFailOutputConnector_3332_outgoinglinks,
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

		case SwitchMediator4EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(SwitchMediatorInputConnector4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(SwitchCaseBranchOutputConnector4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(SwitchDefaultBranchOutputConnector4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case FaultMediator3EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(FaultMediatorInputConnector3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(FaultMediatorOutputConnector3EditPart.VISUAL_ID));
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

		case EnrichMediatorInputConnector4EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_EnrichMediatorInputConnector_3388_incominglinks,
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

		case XSLTMediatorOutputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_XSLTMediatorOutputConnector_3040_outgoinglinks,
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

		case LogMediatorOutputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_LogMediatorOutputConnector_3019_outgoinglinks,
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

		case DropMediator5EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(DropMediatorInputConnector4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case CloneMediatorTargetOutputConnector3EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_CloneMediatorTargetOutputConnector_3299_outgoinglinks,
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

		case FilterMediatorPassOutputConnector3EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_FilterMediatorPassOutputConnector_3239_outgoinglinks,
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

		case LoadBalanceEndPointWestOutputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup outgoinglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_LoadBalanceEndPointWestOutputConnector_3098_outgoinglinks,
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

		case FailoverEndPointInputConnectorEditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			EsbNavigatorGroup incominglinks = new EsbNavigatorGroup(
					Messages.NavigatorGroupName_FailoverEndPointInputConnector_3088_incominglinks,
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

		case CommandMediator2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(CommandMediatorInputConnector2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(CommandMediatorOutputConnector2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case XQueryMediator2EditPart.VISUAL_ID: {
			LinkedList<EsbAbstractNavigatorItem> result = new LinkedList<EsbAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(XQueryMediatorInputConnector2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EsbVisualIDRegistry
							.getType(XQueryMediatorOutputConnector2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
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
		return EsbDiagramEditPart.MODEL_ID.equals(EsbVisualIDRegistry
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
