package org.wso2.developerstudio.eclipse.gmf.esb.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.wso2.developerstudio.eclipse.gmf.esb.*;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.*;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.providers.EsbElementTypes;

/**
 * @generated
 */
public class EsbDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<EsbNodeDescriptor> getSemanticChildren(View view) {
		switch (EsbVisualIDRegistry.getVisualID(view)) {
		case EsbDiagramEditPart.VISUAL_ID:
			return getEsbDiagram_1000SemanticChildren(view);
		case EsbServerEditPart.VISUAL_ID:
			return getEsbServer_2001SemanticChildren(view);
		case ProxyServiceEditPart.VISUAL_ID:
			return getProxyService_3001SemanticChildren(view);
		case ProxyServiceContainerEditPart.VISUAL_ID:
			return getProxyServiceContainer_3486SemanticChildren(view);
		case ProxyServiceSequenceAndEndpointContainerEditPart.VISUAL_ID:
			return getProxyServiceSequenceAndEndpointContainer_3487SemanticChildren(view);
		case DropMediatorEditPart.VISUAL_ID:
			return getDropMediator_3491SemanticChildren(view);
		case PropertyMediatorEditPart.VISUAL_ID:
			return getPropertyMediator_3492SemanticChildren(view);
		case ThrottleMediatorEditPart.VISUAL_ID:
			return getThrottleMediator_3493SemanticChildren(view);
		case ThrottleContainerEditPart.VISUAL_ID:
			return getThrottleContainer_3583SemanticChildren(view);
		case ThrottleOnAcceptContainerEditPart.VISUAL_ID:
			return getThrottleOnAcceptContainer_3584SemanticChildren(view);
		case FilterMediatorEditPart.VISUAL_ID:
			return getFilterMediator_3494SemanticChildren(view);
		case FilterContainerEditPart.VISUAL_ID:
			return getFilterContainer_3531SemanticChildren(view);
		case FilterPassContainerEditPart.VISUAL_ID:
			return getFilterPassContainer_3535SemanticChildren(view);
		case LogMediatorEditPart.VISUAL_ID:
			return getLogMediator_3495SemanticChildren(view);
		case EnrichMediatorEditPart.VISUAL_ID:
			return getEnrichMediator_3496SemanticChildren(view);
		case XSLTMediatorEditPart.VISUAL_ID:
			return getXSLTMediator_3497SemanticChildren(view);
		case SwitchMediatorEditPart.VISUAL_ID:
			return getSwitchMediator_3498SemanticChildren(view);
		case SwitchMediatorContainerEditPart.VISUAL_ID:
			return getSwitchMediatorContainer_3500SemanticChildren(view);
		case SwitchCaseContainerEditPart.VISUAL_ID:
			return getSwitchCaseContainer_3501SemanticChildren(view);
		case SequenceEditPart.VISUAL_ID:
			return getSequence_3503SemanticChildren(view);
		case EventMediatorEditPart.VISUAL_ID:
			return getEventMediator_3504SemanticChildren(view);
		case EntitlementMediatorEditPart.VISUAL_ID:
			return getEntitlementMediator_3505SemanticChildren(view);
		case ClassMediatorEditPart.VISUAL_ID:
			return getClassMediator_3506SemanticChildren(view);
		case SpringMediatorEditPart.VISUAL_ID:
			return getSpringMediator_3507SemanticChildren(view);
		case ScriptMediatorEditPart.VISUAL_ID:
			return getScriptMediator_3508SemanticChildren(view);
		case FaultMediatorEditPart.VISUAL_ID:
			return getFaultMediator_3509SemanticChildren(view);
		case XQueryMediatorEditPart.VISUAL_ID:
			return getXQueryMediator_3510SemanticChildren(view);
		case CommandMediatorEditPart.VISUAL_ID:
			return getCommandMediator_3511SemanticChildren(view);
		case DBLookupMediatorEditPart.VISUAL_ID:
			return getDBLookupMediator_3512SemanticChildren(view);
		case DBReportMediatorEditPart.VISUAL_ID:
			return getDBReportMediator_3513SemanticChildren(view);
		case SmooksMediatorEditPart.VISUAL_ID:
			return getSmooksMediator_3514SemanticChildren(view);
		case SendMediatorEditPart.VISUAL_ID:
			return getSendMediator_3515SemanticChildren(view);
		case HeaderMediatorEditPart.VISUAL_ID:
			return getHeaderMediator_3516SemanticChildren(view);
		case CloneMediatorEditPart.VISUAL_ID:
			return getCloneMediator_3517SemanticChildren(view);
		case CloneMediatorContainerEditPart.VISUAL_ID:
			return getCloneMediatorContainer_3603SemanticChildren(view);
		case CloneTargetContainerEditPart.VISUAL_ID:
			return getCloneTargetContainer_3604SemanticChildren(view);
		case CacheMediatorEditPart.VISUAL_ID:
			return getCacheMediator_3518SemanticChildren(view);
		case IterateMediatorEditPart.VISUAL_ID:
			return getIterateMediator_3519SemanticChildren(view);
		case CalloutMediatorEditPart.VISUAL_ID:
			return getCalloutMediator_3520SemanticChildren(view);
		case TransactionMediatorEditPart.VISUAL_ID:
			return getTransactionMediator_3521SemanticChildren(view);
		case RMSequenceMediatorEditPart.VISUAL_ID:
			return getRMSequenceMediator_3522SemanticChildren(view);
		case RuleMediatorEditPart.VISUAL_ID:
			return getRuleMediator_3523SemanticChildren(view);
		case OAuthMediatorEditPart.VISUAL_ID:
			return getOAuthMediator_3524SemanticChildren(view);
		case AggregateMediatorEditPart.VISUAL_ID:
			return getAggregateMediator_3525SemanticChildren(view);
		case StoreMediatorEditPart.VISUAL_ID:
			return getStoreMediator_3588SemanticChildren(view);
		case BuilderMediatorEditPart.VISUAL_ID:
			return getBuilderMediator_3591SemanticChildren(view);
		case CallTemplateMediatorEditPart.VISUAL_ID:
			return getCallTemplateMediator_3594SemanticChildren(view);
		case PayloadFactoryMediatorEditPart.VISUAL_ID:
			return getPayloadFactoryMediator_3597SemanticChildren(view);
		case EnqueueMediatorEditPart.VISUAL_ID:
			return getEnqueueMediator_3600SemanticChildren(view);
		case DefaultEndPointEditPart.VISUAL_ID:
			return getDefaultEndPoint_3609SemanticChildren(view);
		case AddressEndPointEditPart.VISUAL_ID:
			return getAddressEndPoint_3610SemanticChildren(view);
		case FailoverEndPointEditPart.VISUAL_ID:
			return getFailoverEndPoint_3611SemanticChildren(view);
		case WSDLEndPointEditPart.VISUAL_ID:
			return getWSDLEndPoint_3612SemanticChildren(view);
		case LoadBalanceEndPointEditPart.VISUAL_ID:
			return getLoadBalanceEndPoint_3613SemanticChildren(view);
		case SwitchDefaultContainerEditPart.VISUAL_ID:
			return getSwitchDefaultContainer_3527SemanticChildren(view);
		case FilterFailContainerEditPart.VISUAL_ID:
			return getFilterFailContainer_3537SemanticChildren(view);
		case ThrottleOnRejectContainerEditPart.VISUAL_ID:
			return getThrottleOnRejectContainer_3586SemanticChildren(view);
		case ProxyServiceFaultContainerEditPart.VISUAL_ID:
			return getProxyServiceFaultContainer_3488SemanticChildren(view);
		case MessageMediatorEditPart.VISUAL_ID:
			return getMessageMediator_3045SemanticChildren(view);
		case MergeNodeEditPart.VISUAL_ID:
			return getMergeNode_3013SemanticChildren(view);
		case SequencesEditPart.VISUAL_ID:
			return getSequences_3614SemanticChildren(view);
		case EsbServerContentsCompartmentEditPart.VISUAL_ID:
			return getEsbServerContentsCompartment_7001SemanticChildren(view);
		case MediatorFlowMediatorFlowCompartmentEditPart.VISUAL_ID:
			return getMediatorFlowMediatorFlowCompartment_7034SemanticChildren(view);
		case MediatorFlowMediatorFlowCompartment9EditPart.VISUAL_ID:
			return getMediatorFlowMediatorFlowCompartment_7030SemanticChildren(view);
		case MediatorFlowMediatorFlowCompartment7EditPart.VISUAL_ID:
			return getMediatorFlowMediatorFlowCompartment_7022SemanticChildren(view);
		case MediatorFlowMediatorFlowCompartment2EditPart.VISUAL_ID:
			return getMediatorFlowMediatorFlowCompartment_7015SemanticChildren(view);
		case MediatorFlowMediatorFlowCompartment11EditPart.VISUAL_ID:
			return getMediatorFlowMediatorFlowCompartment_7032SemanticChildren(view);
		case MediatorFlowMediatorFlowCompartment12EditPart.VISUAL_ID:
			return getMediatorFlowMediatorFlowCompartment_7033SemanticChildren(view);
		case MediatorFlowMediatorFlowCompartment3EditPart.VISUAL_ID:
			return getMediatorFlowMediatorFlowCompartment_7016SemanticChildren(view);
		case MediatorFlowMediatorFlowCompartment4EditPart.VISUAL_ID:
			return getMediatorFlowMediatorFlowCompartment_7017SemanticChildren(view);
		case MediatorFlowMediatorFlowCompartment8EditPart.VISUAL_ID:
			return getMediatorFlowMediatorFlowCompartment_7023SemanticChildren(view);
		case MediatorFlowMediatorFlowCompartment10EditPart.VISUAL_ID:
			return getMediatorFlowMediatorFlowCompartment_7031SemanticChildren(view);
		case MediatorFlowMediatorFlowCompartment6EditPart.VISUAL_ID:
			return getMediatorFlowMediatorFlowCompartment_7019SemanticChildren(view);
		case MediatorFlowMediatorFlowCompartment5EditPart.VISUAL_ID:
			return getMediatorFlowMediatorFlowCompartment_7035SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbNodeDescriptor> getEsbServer_2001SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		EsbServer modelElement = (EsbServer) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
		{
			MessageMediator childElement = modelElement.getMessageMediator();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == MessageMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbNodeDescriptor> getProxyService_3001SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ProxyService modelElement = (ProxyService) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
		{
			ProxyOutputConnector childElement = modelElement.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ProxyOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			ProxyInputConnector childElement = modelElement.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ProxyInputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			ProxyFaultInputConnector childElement = modelElement.getFaultInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ProxyFaultInputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			ProxyServiceContainer childElement = modelElement.getContainer();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ProxyServiceContainerEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbNodeDescriptor> getProxyServiceContainer_3486SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ProxyServiceContainer modelElement = (ProxyServiceContainer) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
		{
			ProxyServiceSequenceAndEndpointContainer childElement = modelElement
					.getSequenceAndEndpointContainer();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ProxyServiceSequenceAndEndpointContainerEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			ProxyServiceFaultContainer childElement = modelElement.getFaultContainer();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ProxyServiceFaultContainerEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbNodeDescriptor> getProxyServiceSequenceAndEndpointContainer_3487SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ProxyServiceSequenceAndEndpointContainer modelElement = (ProxyServiceSequenceAndEndpointContainer) view
				.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
		{
			MediatorFlow childElement = modelElement.getMediatorFlow();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == MediatorFlowEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbNodeDescriptor> getDropMediator_3491SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		DropMediator modelElement = (DropMediator) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
		{
			DropMediatorInputConnector childElement = modelElement.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == DropMediatorInputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbNodeDescriptor> getPropertyMediator_3492SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		PropertyMediator modelElement = (PropertyMediator) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
		{
			PropertyMediatorInputConnector childElement = modelElement.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PropertyMediatorInputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			PropertyMediatorOutputConnector childElement = modelElement.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PropertyMediatorOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbNodeDescriptor> getThrottleMediator_3493SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ThrottleMediator modelElement = (ThrottleMediator) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
		{
			ThrottleMediatorInputConnector childElement = modelElement.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ThrottleMediatorInputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			ThrottleMediatorOutputConnector childElement = modelElement.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ThrottleMediatorOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			ThrottleMediatorOnAcceptOutputConnector childElement = modelElement
					.getOnAcceptOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ThrottleMediatorOnAcceptOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			ThrottleMediatorOnRejectOutputConnector childElement = modelElement
					.getOnRejectOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ThrottleMediatorOnRejectOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			ThrottleContainer childElement = modelElement.getThrottleContainer();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ThrottleContainerEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbNodeDescriptor> getThrottleContainer_3583SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ThrottleContainer modelElement = (ThrottleContainer) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
		{
			ThrottleOnAcceptContainer childElement = modelElement.getOnAcceptContainer();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ThrottleOnAcceptContainerEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			ThrottleOnRejectContainer childElement = modelElement.getOnRejectContainer();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ThrottleOnRejectContainerEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbNodeDescriptor> getThrottleOnAcceptContainer_3584SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ThrottleOnAcceptContainer modelElement = (ThrottleOnAcceptContainer) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
		{
			MediatorFlow childElement = modelElement.getMediatorFlow();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == MediatorFlow9EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbNodeDescriptor> getFilterMediator_3494SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		FilterMediator modelElement = (FilterMediator) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
		{
			FilterMediatorInputConnector childElement = modelElement.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == FilterMediatorInputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			FilterMediatorOutputConnector childElement = modelElement.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == FilterMediatorOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			FilterMediatorPassOutputConnector childElement = modelElement.getPassOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == FilterMediatorPassOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			FilterMediatorFailOutputConnector childElement = modelElement.getFailOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == FilterMediatorFailOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			FilterContainer childElement = modelElement.getFilterContainer();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == FilterContainerEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbNodeDescriptor> getFilterContainer_3531SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		FilterContainer modelElement = (FilterContainer) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
		{
			FilterPassContainer childElement = modelElement.getPassContainer();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == FilterPassContainerEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			FilterFailContainer childElement = modelElement.getFailContainer();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == FilterFailContainerEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbNodeDescriptor> getFilterPassContainer_3535SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		FilterPassContainer modelElement = (FilterPassContainer) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
		{
			MediatorFlow childElement = modelElement.getMediatorFlow();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == MediatorFlow7EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbNodeDescriptor> getLogMediator_3495SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		LogMediator modelElement = (LogMediator) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
		{
			LogMediatorInputConnector childElement = modelElement.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == LogMediatorInputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			LogMediatorOutputConnector childElement = modelElement.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == LogMediatorOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbNodeDescriptor> getEnrichMediator_3496SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		EnrichMediator modelElement = (EnrichMediator) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
		{
			EnrichMediatorInputConnector childElement = modelElement.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == EnrichMediatorInputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			EnrichMediatorOutputConnector childElement = modelElement.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == EnrichMediatorOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbNodeDescriptor> getXSLTMediator_3497SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		XSLTMediator modelElement = (XSLTMediator) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
		{
			XSLTMediatorInputConnector childElement = modelElement.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == XSLTMediatorInputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			XSLTMediatorOutputConnector childElement = modelElement.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == XSLTMediatorOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbNodeDescriptor> getSwitchMediator_3498SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		SwitchMediator modelElement = (SwitchMediator) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
		{
			SwitchMediatorInputConnector childElement = modelElement.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == SwitchMediatorInputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator<?> it = modelElement.getCaseBranches().iterator(); it.hasNext();) {
			SwitchCaseBranchOutputConnector childElement = (SwitchCaseBranchOutputConnector) it
					.next();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == SwitchCaseBranchOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			SwitchDefaultBranchOutputConnector childElement = modelElement.getDefaultBranch();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == SwitchDefaultBranchOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			SwitchMediatorOutputConnector childElement = modelElement.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == SwitchMediatorOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			SwitchMediatorContainer childElement = modelElement.getSwitchContainer();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == SwitchMediatorContainerEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbNodeDescriptor> getSwitchMediatorContainer_3500SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		SwitchMediatorContainer modelElement = (SwitchMediatorContainer) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
		for (Iterator<?> it = modelElement.getSwitchCaseContainer().iterator(); it.hasNext();) {
			SwitchCaseContainer childElement = (SwitchCaseContainer) it.next();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == SwitchCaseContainerEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			SwitchDefaultContainer childElement = modelElement.getSwitchDefaultContainer();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == SwitchDefaultContainerEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbNodeDescriptor> getSwitchCaseContainer_3501SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		SwitchCaseContainer modelElement = (SwitchCaseContainer) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
		{
			MediatorFlow childElement = modelElement.getMediatorFlow();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == MediatorFlow2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbNodeDescriptor> getSequence_3503SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Sequence modelElement = (Sequence) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
		{
			SequenceInputConnector childElement = modelElement.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == SequenceInputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			SequenceOutputConnector childElement = modelElement.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == SequenceOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbNodeDescriptor> getEventMediator_3504SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		EventMediator modelElement = (EventMediator) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
		{
			EventMediatorInputConnector childElement = modelElement.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == EventMediatorInputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			EventMediatorOutputConnector childElement = modelElement.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == EventMediatorOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbNodeDescriptor> getEntitlementMediator_3505SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		EntitlementMediator modelElement = (EntitlementMediator) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
		{
			EntitlementMediatorInputConnector childElement = modelElement.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == EntitlementMediatorInputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			EntitlementMediatorOutputConnector childElement = modelElement.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == EntitlementMediatorOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbNodeDescriptor> getClassMediator_3506SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ClassMediator modelElement = (ClassMediator) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
		{
			ClassMediatorInputConnector childElement = modelElement.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ClassMediatorInputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			ClassMediatorOutputConnector childElement = modelElement.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ClassMediatorOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbNodeDescriptor> getSpringMediator_3507SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		SpringMediator modelElement = (SpringMediator) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
		{
			SpringMediatorInputConnector childElement = modelElement.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == SpringMediatorInputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			SpringMediatorOutputConnector childElement = modelElement.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == SpringMediatorOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbNodeDescriptor> getScriptMediator_3508SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ScriptMediator modelElement = (ScriptMediator) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
		{
			ScriptMediatorInputConnector childElement = modelElement.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ScriptMediatorInputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			ScriptMediatorOutputConnector childElement = modelElement.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ScriptMediatorOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbNodeDescriptor> getFaultMediator_3509SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		FaultMediator modelElement = (FaultMediator) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
		{
			FaultMediatorInputConnector childElement = modelElement.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == FaultMediatorInputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			FaultMediatorOutputConnector childElement = modelElement.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == FaultMediatorOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbNodeDescriptor> getXQueryMediator_3510SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		XQueryMediator modelElement = (XQueryMediator) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
		{
			XQueryMediatorInputConnector childElement = modelElement.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == XQueryMediatorInputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			XQueryMediatorOutputConnector childElement = modelElement.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == XQueryMediatorOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbNodeDescriptor> getCommandMediator_3511SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		CommandMediator modelElement = (CommandMediator) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
		{
			CommandMediatorInputConnector childElement = modelElement.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == CommandMediatorInputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			CommandMediatorOutputConnector childElement = modelElement.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == CommandMediatorOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbNodeDescriptor> getDBLookupMediator_3512SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		DBLookupMediator modelElement = (DBLookupMediator) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
		{
			DBLookupMediatorInputConnector childElement = modelElement.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == DBLookupMediatorInputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			DBLookupMediatorOutputConnector childElement = modelElement.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == DBLookupMediatorOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbNodeDescriptor> getDBReportMediator_3513SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		DBReportMediator modelElement = (DBReportMediator) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
		{
			DBReportMediatorInputConnector childElement = modelElement.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == DBReportMediatorInputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			DBReportMediatorOutputConnector childElement = modelElement.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == DBReportMediatorOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbNodeDescriptor> getSmooksMediator_3514SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		SmooksMediator modelElement = (SmooksMediator) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
		{
			SmooksMediatorInputConnector childElement = modelElement.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == SmooksMediatorInputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			SmooksMediatorOutputConnector childElement = modelElement.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == SmooksMediatorOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbNodeDescriptor> getSendMediator_3515SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		SendMediator modelElement = (SendMediator) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
		{
			SendMediatorInputConnector childElement = modelElement.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == SendMediatorInputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			SendMediatorOutputConnector childElement = modelElement.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == SendMediatorOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			SendMediatorEndpointOutputConnector childElement = modelElement
					.getEndpointOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == SendMediatorEndpointOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			EndpointFlow childElement = modelElement.getEndpointFlow();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == EndpointFlowEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbNodeDescriptor> getHeaderMediator_3516SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		HeaderMediator modelElement = (HeaderMediator) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
		{
			HeaderMediatorInputConnector childElement = modelElement.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == HeaderMediatorInputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			HeaderMediatorOutputConnector childElement = modelElement.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == HeaderMediatorOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbNodeDescriptor> getCloneMediator_3517SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		CloneMediator modelElement = (CloneMediator) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
		{
			CloneMediatorInputConnector childElement = modelElement.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == CloneMediatorInputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			CloneMediatorOutputConnector childElement = modelElement.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == CloneMediatorOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator<?> it = modelElement.getTargetsOutputConnector().iterator(); it.hasNext();) {
			CloneMediatorTargetOutputConnector childElement = (CloneMediatorTargetOutputConnector) it
					.next();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == CloneMediatorTargetOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			CloneMediatorContainer childElement = modelElement.getCloneContainer();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == CloneMediatorContainerEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbNodeDescriptor> getCloneMediatorContainer_3603SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		CloneMediatorContainer modelElement = (CloneMediatorContainer) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
		for (Iterator<?> it = modelElement.getCloneTargetContainer().iterator(); it.hasNext();) {
			CloneTargetContainer childElement = (CloneTargetContainer) it.next();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == CloneTargetContainerEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbNodeDescriptor> getCloneTargetContainer_3604SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		CloneTargetContainer modelElement = (CloneTargetContainer) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
		{
			MediatorFlow childElement = modelElement.getMediatorFlow();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == MediatorFlow11EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbNodeDescriptor> getCacheMediator_3518SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		CacheMediator modelElement = (CacheMediator) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
		{
			CacheMediatorInputConnector childElement = modelElement.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == CacheMediatorInputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			CacheMediatorOutputConnector childElement = modelElement.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == CacheMediatorOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbNodeDescriptor> getIterateMediator_3519SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		IterateMediator modelElement = (IterateMediator) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
		{
			IterateMediatorInputConnector childElement = modelElement.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == IterateMediatorInputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			IterateMediatorOutputConnector childElement = modelElement.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == IterateMediatorOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			IterateMediatorTargetOutputConnector childElement = modelElement
					.getTargetOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == IterateMediatorTargetOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			MediatorFlow childElement = modelElement.getMediatorFlow();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == MediatorFlow12EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbNodeDescriptor> getCalloutMediator_3520SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		CalloutMediator modelElement = (CalloutMediator) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
		{
			CalloutMediatorInputConnector childElement = modelElement.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == CalloutMediatorInputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			CalloutMediatorOutputConnector childElement = modelElement.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == CalloutMediatorOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbNodeDescriptor> getTransactionMediator_3521SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		TransactionMediator modelElement = (TransactionMediator) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
		{
			TransactionMediatorInputConnector childElement = modelElement.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == TransactionMediatorInputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			TransactionMediatorOutputConnector childElement = modelElement.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == TransactionMediatorOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbNodeDescriptor> getRMSequenceMediator_3522SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		RMSequenceMediator modelElement = (RMSequenceMediator) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
		{
			RMSequenceMediatorInputConnector childElement = modelElement.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RMSequenceMediatorInputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			RMSequenceMediatorOutputConnector childElement = modelElement.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RMSequenceMediatorOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbNodeDescriptor> getRuleMediator_3523SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		RuleMediator modelElement = (RuleMediator) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
		{
			RuleMediatorInputConnector childElement = modelElement.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RuleMediatorInputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			RuleMediatorOutputConnector childElement = modelElement.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RuleMediatorOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbNodeDescriptor> getOAuthMediator_3524SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		OAuthMediator modelElement = (OAuthMediator) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
		{
			OAuthMediatorInputConnector childElement = modelElement.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == OAuthMediatorInputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			OAuthMediatorOutputConnector childElement = modelElement.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == OAuthMediatorOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbNodeDescriptor> getAggregateMediator_3525SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		AggregateMediator modelElement = (AggregateMediator) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
		{
			AggregateMediatorInputConnector childElement = modelElement.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == AggregateMediatorInputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			AggregateMediatorOutputConnector childElement = modelElement.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == AggregateMediatorOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			AggregateMediatorOnCompleteOutputConnector childElement = modelElement
					.getOnCompleteOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == AggregateMediatorOnCompleteOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			MediatorFlow childElement = modelElement.getMediatorFlow();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == MediatorFlow3EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbNodeDescriptor> getStoreMediator_3588SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		StoreMediator modelElement = (StoreMediator) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
		{
			StoreMediatorInputConnector childElement = modelElement.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == StoreMediatorInputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			StoreMediatorOutputConnector childElement = modelElement.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == StoreMediatorOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbNodeDescriptor> getBuilderMediator_3591SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		BuilderMediator modelElement = (BuilderMediator) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
		{
			BuilderMediatorInputConnector childElement = modelElement.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == BuilderMediatorInputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			BuilderMediatorOutputConector childElement = modelElement.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == BuilderMediatorOutputConectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbNodeDescriptor> getCallTemplateMediator_3594SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		CallTemplateMediator modelElement = (CallTemplateMediator) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
		{
			CallTemplateMediatorInputConnector childElement = modelElement.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == CallTemplateMediatorInputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			CallTemplateMediatorOutputConnector childElement = modelElement.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == CallTemplateMediatorOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbNodeDescriptor> getPayloadFactoryMediator_3597SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		PayloadFactoryMediator modelElement = (PayloadFactoryMediator) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
		{
			PayloadFactoryMediatorInputConnector childElement = modelElement.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PayloadFactoryMediatorInputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			PayloadFactoryMediatorOutputConnector childElement = modelElement.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PayloadFactoryMediatorOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbNodeDescriptor> getEnqueueMediator_3600SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		EnqueueMediator modelElement = (EnqueueMediator) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
		{
			EnqueueMediatorInputConnector childElement = modelElement.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == EnqueueMediatorInputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			EnqueueMediatorOutputConnector childElement = modelElement.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == EnqueueMediatorOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbNodeDescriptor> getDefaultEndPoint_3609SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		DefaultEndPoint modelElement = (DefaultEndPoint) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
		{
			DefaultEndPointInputConnector childElement = modelElement.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == DefaultEndPointInputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			DefaultEndPointOutputConnector childElement = modelElement.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == DefaultEndPointOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbNodeDescriptor> getAddressEndPoint_3610SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		AddressEndPoint modelElement = (AddressEndPoint) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
		{
			AddressEndPointInputConnector childElement = modelElement.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == AddressEndPointInputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			AddressEndPointOutputConnector childElement = modelElement.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == AddressEndPointOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbNodeDescriptor> getFailoverEndPoint_3611SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		FailoverEndPoint modelElement = (FailoverEndPoint) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
		{
			FailoverEndPointInputConnector childElement = modelElement.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == FailoverEndPointInputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator<?> it = modelElement.getOutputConnector().iterator(); it.hasNext();) {
			FailoverEndPointOutputConnector childElement = (FailoverEndPointOutputConnector) it
					.next();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == FailoverEndPointOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			FailoverEndPointWestOutputConnector childElement = modelElement
					.getWestOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == FailoverEndPointWestOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbNodeDescriptor> getWSDLEndPoint_3612SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		WSDLEndPoint modelElement = (WSDLEndPoint) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
		{
			WSDLEndPointInputConnector childElement = modelElement.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == WSDLEndPointInputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			WSDLEndPointOutputConnector childElement = modelElement.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == WSDLEndPointOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbNodeDescriptor> getLoadBalanceEndPoint_3613SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		LoadBalanceEndPoint modelElement = (LoadBalanceEndPoint) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
		{
			LoadBalanceEndPointInputConnector childElement = modelElement.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == LoadBalanceEndPointInputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator<?> it = modelElement.getOutputConnector().iterator(); it.hasNext();) {
			LoadBalanceEndPointOutputConnector childElement = (LoadBalanceEndPointOutputConnector) it
					.next();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == LoadBalanceEndPointOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			LoadBalanceEndPointWestOutputConnector childElement = modelElement
					.getWestOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == LoadBalanceEndPointWestOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbNodeDescriptor> getSwitchDefaultContainer_3527SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		SwitchDefaultContainer modelElement = (SwitchDefaultContainer) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
		{
			MediatorFlow childElement = modelElement.getMediatorFlow();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == MediatorFlow4EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbNodeDescriptor> getFilterFailContainer_3537SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		FilterFailContainer modelElement = (FilterFailContainer) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
		{
			MediatorFlow childElement = modelElement.getMediatorFlow();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == MediatorFlow8EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbNodeDescriptor> getThrottleOnRejectContainer_3586SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ThrottleOnRejectContainer modelElement = (ThrottleOnRejectContainer) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
		{
			MediatorFlow childElement = modelElement.getMediatorFlow();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == MediatorFlow10EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbNodeDescriptor> getProxyServiceFaultContainer_3488SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ProxyServiceFaultContainer modelElement = (ProxyServiceFaultContainer) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
		{
			MediatorFlow childElement = modelElement.getMediatorFlow();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == MediatorFlow6EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbNodeDescriptor> getMessageMediator_3045SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		MessageMediator modelElement = (MessageMediator) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
		{
			MessageInputConnector childElement = modelElement.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == MessageInputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			MessageOutputConnector childElement = modelElement.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == MessageOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbNodeDescriptor> getMergeNode_3013SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		MergeNode modelElement = (MergeNode) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
		{
			MergeNodeFirstInputConnector childElement = modelElement.getFirstInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == MergeNodeFirstInputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			MergeNodeSecondInputConnector childElement = modelElement.getSecondInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == MergeNodeSecondInputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			MergeNodeOutputConnector childElement = modelElement.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == MergeNodeOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbNodeDescriptor> getSequences_3614SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Sequences modelElement = (Sequences) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
		{
			MediatorFlow childElement = modelElement.getMediatorFlow();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == MediatorFlow5EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			SequencesInputConnector childElement = modelElement.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == SequencesInputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			SequencesOutputConnector childElement = modelElement.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == SequencesOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbNodeDescriptor> getEsbServerContentsCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		EsbServer modelElement = (EsbServer) containerView.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
		for (Iterator<?> it = modelElement.getChildren().iterator(); it.hasNext();) {
			EsbElement childElement = (EsbElement) it.next();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ProxyServiceEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MergeNodeEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SequencesEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbNodeDescriptor> getMediatorFlowMediatorFlowCompartment_7034SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		MediatorFlow modelElement = (MediatorFlow) containerView.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
		for (Iterator<?> it = modelElement.getChildren().iterator(); it.hasNext();) {
			EsbElement childElement = (EsbElement) it.next();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == DropMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PropertyMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ThrottleMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FilterMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LogMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EnrichMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == XSLTMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SwitchMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SequenceEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EventMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EntitlementMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ClassMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SpringMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ScriptMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FaultMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == XQueryMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CommandMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DBLookupMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DBReportMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SmooksMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SendMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == HeaderMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CloneMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CacheMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == IterateMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CalloutMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TransactionMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RMSequenceMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RuleMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OAuthMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AggregateMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == StoreMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == BuilderMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallTemplateMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PayloadFactoryMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EnqueueMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DefaultEndPointEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AddressEndPointEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FailoverEndPointEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == WSDLEndPointEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LoadBalanceEndPointEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbNodeDescriptor> getMediatorFlowMediatorFlowCompartment_7030SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		MediatorFlow modelElement = (MediatorFlow) containerView.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
		for (Iterator<?> it = modelElement.getChildren().iterator(); it.hasNext();) {
			EsbElement childElement = (EsbElement) it.next();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == DropMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PropertyMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ThrottleMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FilterMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LogMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EnrichMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == XSLTMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SwitchMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SequenceEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EventMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EntitlementMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ClassMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SpringMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ScriptMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FaultMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == XQueryMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CommandMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DBLookupMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DBReportMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SmooksMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SendMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == HeaderMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CloneMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CacheMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == IterateMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CalloutMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TransactionMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RMSequenceMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RuleMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OAuthMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AggregateMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == StoreMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == BuilderMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallTemplateMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PayloadFactoryMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EnqueueMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DefaultEndPointEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AddressEndPointEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FailoverEndPointEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == WSDLEndPointEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LoadBalanceEndPointEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbNodeDescriptor> getMediatorFlowMediatorFlowCompartment_7022SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		MediatorFlow modelElement = (MediatorFlow) containerView.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
		for (Iterator<?> it = modelElement.getChildren().iterator(); it.hasNext();) {
			EsbElement childElement = (EsbElement) it.next();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == DropMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PropertyMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ThrottleMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FilterMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LogMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EnrichMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == XSLTMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SwitchMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SequenceEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EventMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EntitlementMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ClassMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SpringMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ScriptMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FaultMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == XQueryMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CommandMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DBLookupMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DBReportMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SmooksMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SendMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == HeaderMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CloneMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CacheMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == IterateMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CalloutMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TransactionMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RMSequenceMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RuleMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OAuthMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AggregateMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == StoreMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == BuilderMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallTemplateMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PayloadFactoryMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EnqueueMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DefaultEndPointEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AddressEndPointEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FailoverEndPointEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == WSDLEndPointEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LoadBalanceEndPointEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbNodeDescriptor> getMediatorFlowMediatorFlowCompartment_7015SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		MediatorFlow modelElement = (MediatorFlow) containerView.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
		for (Iterator<?> it = modelElement.getChildren().iterator(); it.hasNext();) {
			EsbElement childElement = (EsbElement) it.next();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == DropMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PropertyMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ThrottleMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FilterMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LogMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EnrichMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == XSLTMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SwitchMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SequenceEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EventMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EntitlementMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ClassMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SpringMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ScriptMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FaultMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == XQueryMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CommandMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DBLookupMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DBReportMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SmooksMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SendMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == HeaderMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CloneMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CacheMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == IterateMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CalloutMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TransactionMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RMSequenceMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RuleMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OAuthMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AggregateMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == StoreMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == BuilderMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallTemplateMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PayloadFactoryMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EnqueueMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DefaultEndPointEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AddressEndPointEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FailoverEndPointEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == WSDLEndPointEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LoadBalanceEndPointEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbNodeDescriptor> getMediatorFlowMediatorFlowCompartment_7032SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		MediatorFlow modelElement = (MediatorFlow) containerView.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
		for (Iterator<?> it = modelElement.getChildren().iterator(); it.hasNext();) {
			EsbElement childElement = (EsbElement) it.next();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == DropMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PropertyMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ThrottleMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FilterMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LogMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EnrichMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == XSLTMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SwitchMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SequenceEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EventMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EntitlementMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ClassMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SpringMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ScriptMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FaultMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == XQueryMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CommandMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DBLookupMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DBReportMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SmooksMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SendMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == HeaderMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CloneMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CacheMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == IterateMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CalloutMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TransactionMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RMSequenceMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RuleMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OAuthMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AggregateMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == StoreMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == BuilderMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallTemplateMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PayloadFactoryMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EnqueueMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DefaultEndPointEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AddressEndPointEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FailoverEndPointEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == WSDLEndPointEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LoadBalanceEndPointEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbNodeDescriptor> getMediatorFlowMediatorFlowCompartment_7033SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		MediatorFlow modelElement = (MediatorFlow) containerView.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
		for (Iterator<?> it = modelElement.getChildren().iterator(); it.hasNext();) {
			EsbElement childElement = (EsbElement) it.next();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == DropMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PropertyMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ThrottleMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FilterMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LogMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EnrichMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == XSLTMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SwitchMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SequenceEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EventMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EntitlementMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ClassMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SpringMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ScriptMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FaultMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == XQueryMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CommandMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DBLookupMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DBReportMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SmooksMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SendMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == HeaderMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CloneMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CacheMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == IterateMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CalloutMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TransactionMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RMSequenceMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RuleMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OAuthMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AggregateMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == StoreMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == BuilderMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallTemplateMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PayloadFactoryMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EnqueueMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DefaultEndPointEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AddressEndPointEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FailoverEndPointEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == WSDLEndPointEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LoadBalanceEndPointEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbNodeDescriptor> getMediatorFlowMediatorFlowCompartment_7016SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		MediatorFlow modelElement = (MediatorFlow) containerView.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
		for (Iterator<?> it = modelElement.getChildren().iterator(); it.hasNext();) {
			EsbElement childElement = (EsbElement) it.next();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == DropMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PropertyMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ThrottleMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FilterMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LogMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EnrichMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == XSLTMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SwitchMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SequenceEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EventMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EntitlementMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ClassMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SpringMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ScriptMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FaultMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == XQueryMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CommandMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DBLookupMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DBReportMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SmooksMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SendMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == HeaderMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CloneMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CacheMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == IterateMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CalloutMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TransactionMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RMSequenceMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RuleMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OAuthMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AggregateMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == StoreMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == BuilderMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallTemplateMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PayloadFactoryMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EnqueueMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DefaultEndPointEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AddressEndPointEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FailoverEndPointEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == WSDLEndPointEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LoadBalanceEndPointEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbNodeDescriptor> getMediatorFlowMediatorFlowCompartment_7017SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		MediatorFlow modelElement = (MediatorFlow) containerView.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
		for (Iterator<?> it = modelElement.getChildren().iterator(); it.hasNext();) {
			EsbElement childElement = (EsbElement) it.next();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == DropMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PropertyMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ThrottleMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FilterMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LogMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EnrichMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == XSLTMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SwitchMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SequenceEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EventMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EntitlementMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ClassMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SpringMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ScriptMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FaultMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == XQueryMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CommandMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DBLookupMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DBReportMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SmooksMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SendMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == HeaderMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CloneMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CacheMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == IterateMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CalloutMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TransactionMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RMSequenceMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RuleMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OAuthMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AggregateMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == StoreMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == BuilderMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallTemplateMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PayloadFactoryMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EnqueueMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DefaultEndPointEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AddressEndPointEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FailoverEndPointEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == WSDLEndPointEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LoadBalanceEndPointEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbNodeDescriptor> getMediatorFlowMediatorFlowCompartment_7023SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		MediatorFlow modelElement = (MediatorFlow) containerView.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
		for (Iterator<?> it = modelElement.getChildren().iterator(); it.hasNext();) {
			EsbElement childElement = (EsbElement) it.next();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == DropMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PropertyMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ThrottleMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FilterMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LogMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EnrichMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == XSLTMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SwitchMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SequenceEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EventMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EntitlementMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ClassMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SpringMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ScriptMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FaultMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == XQueryMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CommandMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DBLookupMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DBReportMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SmooksMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SendMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == HeaderMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CloneMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CacheMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == IterateMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CalloutMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TransactionMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RMSequenceMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RuleMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OAuthMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AggregateMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == StoreMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == BuilderMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallTemplateMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PayloadFactoryMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EnqueueMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DefaultEndPointEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AddressEndPointEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FailoverEndPointEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == WSDLEndPointEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LoadBalanceEndPointEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbNodeDescriptor> getMediatorFlowMediatorFlowCompartment_7031SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		MediatorFlow modelElement = (MediatorFlow) containerView.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
		for (Iterator<?> it = modelElement.getChildren().iterator(); it.hasNext();) {
			EsbElement childElement = (EsbElement) it.next();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == DropMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PropertyMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ThrottleMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FilterMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LogMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EnrichMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == XSLTMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SwitchMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SequenceEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EventMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EntitlementMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ClassMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SpringMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ScriptMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FaultMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == XQueryMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CommandMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DBLookupMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DBReportMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SmooksMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SendMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == HeaderMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CloneMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CacheMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == IterateMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CalloutMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TransactionMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RMSequenceMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RuleMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OAuthMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AggregateMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == StoreMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == BuilderMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallTemplateMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PayloadFactoryMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EnqueueMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DefaultEndPointEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AddressEndPointEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FailoverEndPointEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == WSDLEndPointEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LoadBalanceEndPointEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbNodeDescriptor> getMediatorFlowMediatorFlowCompartment_7019SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		MediatorFlow modelElement = (MediatorFlow) containerView.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
		for (Iterator<?> it = modelElement.getChildren().iterator(); it.hasNext();) {
			EsbElement childElement = (EsbElement) it.next();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == DropMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PropertyMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ThrottleMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FilterMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LogMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EnrichMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == XSLTMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SwitchMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SequenceEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EventMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EntitlementMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ClassMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SpringMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ScriptMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FaultMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == XQueryMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CommandMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DBLookupMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DBReportMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SmooksMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SendMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == HeaderMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CloneMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CacheMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == IterateMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CalloutMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TransactionMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RMSequenceMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RuleMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OAuthMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AggregateMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == StoreMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == BuilderMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallTemplateMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PayloadFactoryMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EnqueueMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DefaultEndPointEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AddressEndPointEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FailoverEndPointEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == WSDLEndPointEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LoadBalanceEndPointEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbNodeDescriptor> getMediatorFlowMediatorFlowCompartment_7035SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		MediatorFlow modelElement = (MediatorFlow) containerView.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
		for (Iterator<?> it = modelElement.getChildren().iterator(); it.hasNext();) {
			EsbElement childElement = (EsbElement) it.next();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == DropMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PropertyMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ThrottleMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FilterMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LogMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EnrichMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == XSLTMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SwitchMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SequenceEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EventMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EntitlementMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ClassMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SpringMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ScriptMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FaultMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == XQueryMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CommandMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DBLookupMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DBReportMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SmooksMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SendMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == HeaderMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CloneMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CacheMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == IterateMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CalloutMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TransactionMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RMSequenceMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RuleMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OAuthMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AggregateMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == StoreMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == BuilderMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallTemplateMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PayloadFactoryMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EnqueueMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DefaultEndPointEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AddressEndPointEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FailoverEndPointEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == WSDLEndPointEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LoadBalanceEndPointEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbNodeDescriptor> getEsbDiagram_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		EsbDiagram modelElement = (EsbDiagram) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
		{
			EsbServer childElement = modelElement.getServer();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == EsbServerEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getContainedLinks(View view) {
		switch (EsbVisualIDRegistry.getVisualID(view)) {
		case EsbDiagramEditPart.VISUAL_ID:
			return getEsbDiagram_1000ContainedLinks(view);
		case EsbServerEditPart.VISUAL_ID:
			return getEsbServer_2001ContainedLinks(view);
		case ProxyServiceEditPart.VISUAL_ID:
			return getProxyService_3001ContainedLinks(view);
		case ProxyOutputConnectorEditPart.VISUAL_ID:
			return getProxyOutputConnector_3002ContainedLinks(view);
		case ProxyInputConnectorEditPart.VISUAL_ID:
			return getProxyInputConnector_3003ContainedLinks(view);
		case ProxyFaultInputConnectorEditPart.VISUAL_ID:
			return getProxyFaultInputConnector_3489ContainedLinks(view);
		case ProxyServiceContainerEditPart.VISUAL_ID:
			return getProxyServiceContainer_3486ContainedLinks(view);
		case ProxyServiceSequenceAndEndpointContainerEditPart.VISUAL_ID:
			return getProxyServiceSequenceAndEndpointContainer_3487ContainedLinks(view);
		case MediatorFlowEditPart.VISUAL_ID:
			return getMediatorFlow_3608ContainedLinks(view);
		case DropMediatorEditPart.VISUAL_ID:
			return getDropMediator_3491ContainedLinks(view);
		case DropMediatorInputConnectorEditPart.VISUAL_ID:
			return getDropMediatorInputConnector_3008ContainedLinks(view);
		case PropertyMediatorEditPart.VISUAL_ID:
			return getPropertyMediator_3492ContainedLinks(view);
		case PropertyMediatorInputConnectorEditPart.VISUAL_ID:
			return getPropertyMediatorInputConnector_3033ContainedLinks(view);
		case PropertyMediatorOutputConnectorEditPart.VISUAL_ID:
			return getPropertyMediatorOutputConnector_3034ContainedLinks(view);
		case ThrottleMediatorEditPart.VISUAL_ID:
			return getThrottleMediator_3493ContainedLinks(view);
		case ThrottleMediatorInputConnectorEditPart.VISUAL_ID:
			return getThrottleMediatorInputConnector_3121ContainedLinks(view);
		case ThrottleMediatorOutputConnectorEditPart.VISUAL_ID:
			return getThrottleMediatorOutputConnector_3122ContainedLinks(view);
		case ThrottleMediatorOnAcceptOutputConnectorEditPart.VISUAL_ID:
			return getThrottleMediatorOnAcceptOutputConnector_3581ContainedLinks(view);
		case ThrottleMediatorOnRejectOutputConnectorEditPart.VISUAL_ID:
			return getThrottleMediatorOnRejectOutputConnector_3582ContainedLinks(view);
		case ThrottleContainerEditPart.VISUAL_ID:
			return getThrottleContainer_3583ContainedLinks(view);
		case ThrottleOnAcceptContainerEditPart.VISUAL_ID:
			return getThrottleOnAcceptContainer_3584ContainedLinks(view);
		case MediatorFlow9EditPart.VISUAL_ID:
			return getMediatorFlow_3585ContainedLinks(view);
		case FilterMediatorEditPart.VISUAL_ID:
			return getFilterMediator_3494ContainedLinks(view);
		case FilterMediatorInputConnectorEditPart.VISUAL_ID:
			return getFilterMediatorInputConnector_3010ContainedLinks(view);
		case FilterMediatorOutputConnectorEditPart.VISUAL_ID:
			return getFilterMediatorOutputConnector_3534ContainedLinks(view);
		case FilterMediatorPassOutputConnectorEditPart.VISUAL_ID:
			return getFilterMediatorPassOutputConnector_3011ContainedLinks(view);
		case FilterMediatorFailOutputConnectorEditPart.VISUAL_ID:
			return getFilterMediatorFailOutputConnector_3012ContainedLinks(view);
		case FilterContainerEditPart.VISUAL_ID:
			return getFilterContainer_3531ContainedLinks(view);
		case FilterPassContainerEditPart.VISUAL_ID:
			return getFilterPassContainer_3535ContainedLinks(view);
		case MediatorFlow7EditPart.VISUAL_ID:
			return getMediatorFlow_3536ContainedLinks(view);
		case LogMediatorEditPart.VISUAL_ID:
			return getLogMediator_3495ContainedLinks(view);
		case LogMediatorInputConnectorEditPart.VISUAL_ID:
			return getLogMediatorInputConnector_3018ContainedLinks(view);
		case LogMediatorOutputConnectorEditPart.VISUAL_ID:
			return getLogMediatorOutputConnector_3019ContainedLinks(view);
		case EnrichMediatorEditPart.VISUAL_ID:
			return getEnrichMediator_3496ContainedLinks(view);
		case EnrichMediatorInputConnectorEditPart.VISUAL_ID:
			return getEnrichMediatorInputConnector_3036ContainedLinks(view);
		case EnrichMediatorOutputConnectorEditPart.VISUAL_ID:
			return getEnrichMediatorOutputConnector_3037ContainedLinks(view);
		case XSLTMediatorEditPart.VISUAL_ID:
			return getXSLTMediator_3497ContainedLinks(view);
		case XSLTMediatorInputConnectorEditPart.VISUAL_ID:
			return getXSLTMediatorInputConnector_3039ContainedLinks(view);
		case XSLTMediatorOutputConnectorEditPart.VISUAL_ID:
			return getXSLTMediatorOutputConnector_3040ContainedLinks(view);
		case SwitchMediatorEditPart.VISUAL_ID:
			return getSwitchMediator_3498ContainedLinks(view);
		case SwitchMediatorInputConnectorEditPart.VISUAL_ID:
			return getSwitchMediatorInputConnector_3042ContainedLinks(view);
		case SwitchCaseBranchOutputConnectorEditPart.VISUAL_ID:
			return getSwitchCaseBranchOutputConnector_3043ContainedLinks(view);
		case SwitchDefaultBranchOutputConnectorEditPart.VISUAL_ID:
			return getSwitchDefaultBranchOutputConnector_3044ContainedLinks(view);
		case SwitchMediatorOutputConnectorEditPart.VISUAL_ID:
			return getSwitchMediatorOutputConnector_3499ContainedLinks(view);
		case SwitchMediatorContainerEditPart.VISUAL_ID:
			return getSwitchMediatorContainer_3500ContainedLinks(view);
		case SwitchCaseContainerEditPart.VISUAL_ID:
			return getSwitchCaseContainer_3501ContainedLinks(view);
		case MediatorFlow2EditPart.VISUAL_ID:
			return getMediatorFlow_3502ContainedLinks(view);
		case SequenceEditPart.VISUAL_ID:
			return getSequence_3503ContainedLinks(view);
		case SequenceInputConnectorEditPart.VISUAL_ID:
			return getSequenceInputConnector_3049ContainedLinks(view);
		case SequenceOutputConnectorEditPart.VISUAL_ID:
			return getSequenceOutputConnector_3050ContainedLinks(view);
		case EventMediatorEditPart.VISUAL_ID:
			return getEventMediator_3504ContainedLinks(view);
		case EventMediatorInputConnectorEditPart.VISUAL_ID:
			return getEventMediatorInputConnector_3052ContainedLinks(view);
		case EventMediatorOutputConnectorEditPart.VISUAL_ID:
			return getEventMediatorOutputConnector_3053ContainedLinks(view);
		case EntitlementMediatorEditPart.VISUAL_ID:
			return getEntitlementMediator_3505ContainedLinks(view);
		case EntitlementMediatorInputConnectorEditPart.VISUAL_ID:
			return getEntitlementMediatorInputConnector_3055ContainedLinks(view);
		case EntitlementMediatorOutputConnectorEditPart.VISUAL_ID:
			return getEntitlementMediatorOutputConnector_3056ContainedLinks(view);
		case ClassMediatorEditPart.VISUAL_ID:
			return getClassMediator_3506ContainedLinks(view);
		case ClassMediatorInputConnectorEditPart.VISUAL_ID:
			return getClassMediatorInputConnector_3058ContainedLinks(view);
		case ClassMediatorOutputConnectorEditPart.VISUAL_ID:
			return getClassMediatorOutputConnector_3059ContainedLinks(view);
		case SpringMediatorEditPart.VISUAL_ID:
			return getSpringMediator_3507ContainedLinks(view);
		case SpringMediatorInputConnectorEditPart.VISUAL_ID:
			return getSpringMediatorInputConnector_3061ContainedLinks(view);
		case SpringMediatorOutputConnectorEditPart.VISUAL_ID:
			return getSpringMediatorOutputConnector_3062ContainedLinks(view);
		case ScriptMediatorEditPart.VISUAL_ID:
			return getScriptMediator_3508ContainedLinks(view);
		case ScriptMediatorInputConnectorEditPart.VISUAL_ID:
			return getScriptMediatorInputConnector_3064ContainedLinks(view);
		case ScriptMediatorOutputConnectorEditPart.VISUAL_ID:
			return getScriptMediatorOutputConnector_3065ContainedLinks(view);
		case FaultMediatorEditPart.VISUAL_ID:
			return getFaultMediator_3509ContainedLinks(view);
		case FaultMediatorInputConnectorEditPart.VISUAL_ID:
			return getFaultMediatorInputConnector_3067ContainedLinks(view);
		case FaultMediatorOutputConnectorEditPart.VISUAL_ID:
			return getFaultMediatorOutputConnector_3068ContainedLinks(view);
		case XQueryMediatorEditPart.VISUAL_ID:
			return getXQueryMediator_3510ContainedLinks(view);
		case XQueryMediatorInputConnectorEditPart.VISUAL_ID:
			return getXQueryMediatorInputConnector_3070ContainedLinks(view);
		case XQueryMediatorOutputConnectorEditPart.VISUAL_ID:
			return getXQueryMediatorOutputConnector_3071ContainedLinks(view);
		case CommandMediatorEditPart.VISUAL_ID:
			return getCommandMediator_3511ContainedLinks(view);
		case CommandMediatorInputConnectorEditPart.VISUAL_ID:
			return getCommandMediatorInputConnector_3073ContainedLinks(view);
		case CommandMediatorOutputConnectorEditPart.VISUAL_ID:
			return getCommandMediatorOutputConnector_3074ContainedLinks(view);
		case DBLookupMediatorEditPart.VISUAL_ID:
			return getDBLookupMediator_3512ContainedLinks(view);
		case DBLookupMediatorInputConnectorEditPart.VISUAL_ID:
			return getDBLookupMediatorInputConnector_3076ContainedLinks(view);
		case DBLookupMediatorOutputConnectorEditPart.VISUAL_ID:
			return getDBLookupMediatorOutputConnector_3077ContainedLinks(view);
		case DBReportMediatorEditPart.VISUAL_ID:
			return getDBReportMediator_3513ContainedLinks(view);
		case DBReportMediatorInputConnectorEditPart.VISUAL_ID:
			return getDBReportMediatorInputConnector_3079ContainedLinks(view);
		case DBReportMediatorOutputConnectorEditPart.VISUAL_ID:
			return getDBReportMediatorOutputConnector_3080ContainedLinks(view);
		case SmooksMediatorEditPart.VISUAL_ID:
			return getSmooksMediator_3514ContainedLinks(view);
		case SmooksMediatorInputConnectorEditPart.VISUAL_ID:
			return getSmooksMediatorInputConnector_3082ContainedLinks(view);
		case SmooksMediatorOutputConnectorEditPart.VISUAL_ID:
			return getSmooksMediatorOutputConnector_3083ContainedLinks(view);
		case SendMediatorEditPart.VISUAL_ID:
			return getSendMediator_3515ContainedLinks(view);
		case SendMediatorInputConnectorEditPart.VISUAL_ID:
			return getSendMediatorInputConnector_3085ContainedLinks(view);
		case SendMediatorOutputConnectorEditPart.VISUAL_ID:
			return getSendMediatorOutputConnector_3086ContainedLinks(view);
		case SendMediatorEndpointOutputConnectorEditPart.VISUAL_ID:
			return getSendMediatorEndpointOutputConnector_3539ContainedLinks(view);
		case EndpointFlowEditPart.VISUAL_ID:
			return getEndpointFlow_3562ContainedLinks(view);
		case HeaderMediatorEditPart.VISUAL_ID:
			return getHeaderMediator_3516ContainedLinks(view);
		case HeaderMediatorInputConnectorEditPart.VISUAL_ID:
			return getHeaderMediatorInputConnector_3100ContainedLinks(view);
		case HeaderMediatorOutputConnectorEditPart.VISUAL_ID:
			return getHeaderMediatorOutputConnector_3101ContainedLinks(view);
		case CloneMediatorEditPart.VISUAL_ID:
			return getCloneMediator_3517ContainedLinks(view);
		case CloneMediatorInputConnectorEditPart.VISUAL_ID:
			return getCloneMediatorInputConnector_3103ContainedLinks(view);
		case CloneMediatorOutputConnectorEditPart.VISUAL_ID:
			return getCloneMediatorOutputConnector_3104ContainedLinks(view);
		case CloneMediatorTargetOutputConnectorEditPart.VISUAL_ID:
			return getCloneMediatorTargetOutputConnector_3133ContainedLinks(view);
		case CloneMediatorContainerEditPart.VISUAL_ID:
			return getCloneMediatorContainer_3603ContainedLinks(view);
		case CloneTargetContainerEditPart.VISUAL_ID:
			return getCloneTargetContainer_3604ContainedLinks(view);
		case MediatorFlow11EditPart.VISUAL_ID:
			return getMediatorFlow_3605ContainedLinks(view);
		case CacheMediatorEditPart.VISUAL_ID:
			return getCacheMediator_3518ContainedLinks(view);
		case CacheMediatorInputConnectorEditPart.VISUAL_ID:
			return getCacheMediatorInputConnector_3106ContainedLinks(view);
		case CacheMediatorOutputConnectorEditPart.VISUAL_ID:
			return getCacheMediatorOutputConnector_3107ContainedLinks(view);
		case IterateMediatorEditPart.VISUAL_ID:
			return getIterateMediator_3519ContainedLinks(view);
		case IterateMediatorInputConnectorEditPart.VISUAL_ID:
			return getIterateMediatorInputConnector_3109ContainedLinks(view);
		case IterateMediatorOutputConnectorEditPart.VISUAL_ID:
			return getIterateMediatorOutputConnector_3110ContainedLinks(view);
		case IterateMediatorTargetOutputConnectorEditPart.VISUAL_ID:
			return getIterateMediatorTargetOutputConnector_3606ContainedLinks(view);
		case MediatorFlow12EditPart.VISUAL_ID:
			return getMediatorFlow_3607ContainedLinks(view);
		case CalloutMediatorEditPart.VISUAL_ID:
			return getCalloutMediator_3520ContainedLinks(view);
		case CalloutMediatorInputConnectorEditPart.VISUAL_ID:
			return getCalloutMediatorInputConnector_3115ContainedLinks(view);
		case CalloutMediatorOutputConnectorEditPart.VISUAL_ID:
			return getCalloutMediatorOutputConnector_3116ContainedLinks(view);
		case TransactionMediatorEditPart.VISUAL_ID:
			return getTransactionMediator_3521ContainedLinks(view);
		case TransactionMediatorInputConnectorEditPart.VISUAL_ID:
			return getTransactionMediatorInputConnector_3118ContainedLinks(view);
		case TransactionMediatorOutputConnectorEditPart.VISUAL_ID:
			return getTransactionMediatorOutputConnector_3119ContainedLinks(view);
		case RMSequenceMediatorEditPart.VISUAL_ID:
			return getRMSequenceMediator_3522ContainedLinks(view);
		case RMSequenceMediatorInputConnectorEditPart.VISUAL_ID:
			return getRMSequenceMediatorInputConnector_3124ContainedLinks(view);
		case RMSequenceMediatorOutputConnectorEditPart.VISUAL_ID:
			return getRMSequenceMediatorOutputConnector_3125ContainedLinks(view);
		case RuleMediatorEditPart.VISUAL_ID:
			return getRuleMediator_3523ContainedLinks(view);
		case RuleMediatorInputConnectorEditPart.VISUAL_ID:
			return getRuleMediatorInputConnector_3127ContainedLinks(view);
		case RuleMediatorOutputConnectorEditPart.VISUAL_ID:
			return getRuleMediatorOutputConnector_3128ContainedLinks(view);
		case OAuthMediatorEditPart.VISUAL_ID:
			return getOAuthMediator_3524ContainedLinks(view);
		case OAuthMediatorInputConnectorEditPart.VISUAL_ID:
			return getOAuthMediatorInputConnector_3130ContainedLinks(view);
		case OAuthMediatorOutputConnectorEditPart.VISUAL_ID:
			return getOAuthMediatorOutputConnector_3131ContainedLinks(view);
		case AggregateMediatorEditPart.VISUAL_ID:
			return getAggregateMediator_3525ContainedLinks(view);
		case AggregateMediatorInputConnectorEditPart.VISUAL_ID:
			return getAggregateMediatorInputConnector_3112ContainedLinks(view);
		case AggregateMediatorOutputConnectorEditPart.VISUAL_ID:
			return getAggregateMediatorOutputConnector_3113ContainedLinks(view);
		case AggregateMediatorOnCompleteOutputConnectorEditPart.VISUAL_ID:
			return getAggregateMediatorOnCompleteOutputConnector_3132ContainedLinks(view);
		case MediatorFlow3EditPart.VISUAL_ID:
			return getMediatorFlow_3526ContainedLinks(view);
		case StoreMediatorEditPart.VISUAL_ID:
			return getStoreMediator_3588ContainedLinks(view);
		case StoreMediatorInputConnectorEditPart.VISUAL_ID:
			return getStoreMediatorInputConnector_3589ContainedLinks(view);
		case StoreMediatorOutputConnectorEditPart.VISUAL_ID:
			return getStoreMediatorOutputConnector_3590ContainedLinks(view);
		case BuilderMediatorEditPart.VISUAL_ID:
			return getBuilderMediator_3591ContainedLinks(view);
		case BuilderMediatorInputConnectorEditPart.VISUAL_ID:
			return getBuilderMediatorInputConnector_3592ContainedLinks(view);
		case BuilderMediatorOutputConectorEditPart.VISUAL_ID:
			return getBuilderMediatorOutputConector_3593ContainedLinks(view);
		case CallTemplateMediatorEditPart.VISUAL_ID:
			return getCallTemplateMediator_3594ContainedLinks(view);
		case CallTemplateMediatorInputConnectorEditPart.VISUAL_ID:
			return getCallTemplateMediatorInputConnector_3595ContainedLinks(view);
		case CallTemplateMediatorOutputConnectorEditPart.VISUAL_ID:
			return getCallTemplateMediatorOutputConnector_3596ContainedLinks(view);
		case PayloadFactoryMediatorEditPart.VISUAL_ID:
			return getPayloadFactoryMediator_3597ContainedLinks(view);
		case PayloadFactoryMediatorInputConnectorEditPart.VISUAL_ID:
			return getPayloadFactoryMediatorInputConnector_3598ContainedLinks(view);
		case PayloadFactoryMediatorOutputConnectorEditPart.VISUAL_ID:
			return getPayloadFactoryMediatorOutputConnector_3599ContainedLinks(view);
		case EnqueueMediatorEditPart.VISUAL_ID:
			return getEnqueueMediator_3600ContainedLinks(view);
		case EnqueueMediatorInputConnectorEditPart.VISUAL_ID:
			return getEnqueueMediatorInputConnector_3601ContainedLinks(view);
		case EnqueueMediatorOutputConnectorEditPart.VISUAL_ID:
			return getEnqueueMediatorOutputConnector_3602ContainedLinks(view);
		case DefaultEndPointEditPart.VISUAL_ID:
			return getDefaultEndPoint_3609ContainedLinks(view);
		case DefaultEndPointInputConnectorEditPart.VISUAL_ID:
			return getDefaultEndPointInputConnector_3021ContainedLinks(view);
		case DefaultEndPointOutputConnectorEditPart.VISUAL_ID:
			return getDefaultEndPointOutputConnector_3022ContainedLinks(view);
		case AddressEndPointEditPart.VISUAL_ID:
			return getAddressEndPoint_3610ContainedLinks(view);
		case AddressEndPointInputConnectorEditPart.VISUAL_ID:
			return getAddressEndPointInputConnector_3030ContainedLinks(view);
		case AddressEndPointOutputConnectorEditPart.VISUAL_ID:
			return getAddressEndPointOutputConnector_3031ContainedLinks(view);
		case FailoverEndPointEditPart.VISUAL_ID:
			return getFailoverEndPoint_3611ContainedLinks(view);
		case FailoverEndPointInputConnectorEditPart.VISUAL_ID:
			return getFailoverEndPointInputConnector_3088ContainedLinks(view);
		case FailoverEndPointOutputConnectorEditPart.VISUAL_ID:
			return getFailoverEndPointOutputConnector_3090ContainedLinks(view);
		case FailoverEndPointWestOutputConnectorEditPart.VISUAL_ID:
			return getFailoverEndPointWestOutputConnector_3097ContainedLinks(view);
		case WSDLEndPointEditPart.VISUAL_ID:
			return getWSDLEndPoint_3612ContainedLinks(view);
		case WSDLEndPointInputConnectorEditPart.VISUAL_ID:
			return getWSDLEndPointInputConnector_3092ContainedLinks(view);
		case WSDLEndPointOutputConnectorEditPart.VISUAL_ID:
			return getWSDLEndPointOutputConnector_3093ContainedLinks(view);
		case LoadBalanceEndPointEditPart.VISUAL_ID:
			return getLoadBalanceEndPoint_3613ContainedLinks(view);
		case LoadBalanceEndPointInputConnectorEditPart.VISUAL_ID:
			return getLoadBalanceEndPointInputConnector_3095ContainedLinks(view);
		case LoadBalanceEndPointOutputConnectorEditPart.VISUAL_ID:
			return getLoadBalanceEndPointOutputConnector_3096ContainedLinks(view);
		case LoadBalanceEndPointWestOutputConnectorEditPart.VISUAL_ID:
			return getLoadBalanceEndPointWestOutputConnector_3098ContainedLinks(view);
		case SwitchDefaultContainerEditPart.VISUAL_ID:
			return getSwitchDefaultContainer_3527ContainedLinks(view);
		case MediatorFlow4EditPart.VISUAL_ID:
			return getMediatorFlow_3528ContainedLinks(view);
		case FilterFailContainerEditPart.VISUAL_ID:
			return getFilterFailContainer_3537ContainedLinks(view);
		case MediatorFlow8EditPart.VISUAL_ID:
			return getMediatorFlow_3538ContainedLinks(view);
		case ThrottleOnRejectContainerEditPart.VISUAL_ID:
			return getThrottleOnRejectContainer_3586ContainedLinks(view);
		case MediatorFlow10EditPart.VISUAL_ID:
			return getMediatorFlow_3587ContainedLinks(view);
		case ProxyServiceFaultContainerEditPart.VISUAL_ID:
			return getProxyServiceFaultContainer_3488ContainedLinks(view);
		case MediatorFlow6EditPart.VISUAL_ID:
			return getMediatorFlow_3530ContainedLinks(view);
		case MessageMediatorEditPart.VISUAL_ID:
			return getMessageMediator_3045ContainedLinks(view);
		case MessageInputConnectorEditPart.VISUAL_ID:
			return getMessageInputConnector_3046ContainedLinks(view);
		case MessageOutputConnectorEditPart.VISUAL_ID:
			return getMessageOutputConnector_3047ContainedLinks(view);
		case MergeNodeEditPart.VISUAL_ID:
			return getMergeNode_3013ContainedLinks(view);
		case MergeNodeFirstInputConnectorEditPart.VISUAL_ID:
			return getMergeNodeFirstInputConnector_3014ContainedLinks(view);
		case MergeNodeSecondInputConnectorEditPart.VISUAL_ID:
			return getMergeNodeSecondInputConnector_3015ContainedLinks(view);
		case MergeNodeOutputConnectorEditPart.VISUAL_ID:
			return getMergeNodeOutputConnector_3016ContainedLinks(view);
		case SequencesEditPart.VISUAL_ID:
			return getSequences_3614ContainedLinks(view);
		case MediatorFlow5EditPart.VISUAL_ID:
			return getMediatorFlow_3615ContainedLinks(view);
		case SequencesInputConnectorEditPart.VISUAL_ID:
			return getSequencesInputConnector_3616ContainedLinks(view);
		case SequencesOutputConnectorEditPart.VISUAL_ID:
			return getSequencesOutputConnector_3617ContainedLinks(view);
		case EsbLinkEditPart.VISUAL_ID:
			return getEsbLink_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getIncomingLinks(View view) {
		switch (EsbVisualIDRegistry.getVisualID(view)) {
		case EsbServerEditPart.VISUAL_ID:
			return getEsbServer_2001IncomingLinks(view);
		case ProxyServiceEditPart.VISUAL_ID:
			return getProxyService_3001IncomingLinks(view);
		case ProxyOutputConnectorEditPart.VISUAL_ID:
			return getProxyOutputConnector_3002IncomingLinks(view);
		case ProxyInputConnectorEditPart.VISUAL_ID:
			return getProxyInputConnector_3003IncomingLinks(view);
		case ProxyFaultInputConnectorEditPart.VISUAL_ID:
			return getProxyFaultInputConnector_3489IncomingLinks(view);
		case ProxyServiceContainerEditPart.VISUAL_ID:
			return getProxyServiceContainer_3486IncomingLinks(view);
		case ProxyServiceSequenceAndEndpointContainerEditPart.VISUAL_ID:
			return getProxyServiceSequenceAndEndpointContainer_3487IncomingLinks(view);
		case MediatorFlowEditPart.VISUAL_ID:
			return getMediatorFlow_3608IncomingLinks(view);
		case DropMediatorEditPart.VISUAL_ID:
			return getDropMediator_3491IncomingLinks(view);
		case DropMediatorInputConnectorEditPart.VISUAL_ID:
			return getDropMediatorInputConnector_3008IncomingLinks(view);
		case PropertyMediatorEditPart.VISUAL_ID:
			return getPropertyMediator_3492IncomingLinks(view);
		case PropertyMediatorInputConnectorEditPart.VISUAL_ID:
			return getPropertyMediatorInputConnector_3033IncomingLinks(view);
		case PropertyMediatorOutputConnectorEditPart.VISUAL_ID:
			return getPropertyMediatorOutputConnector_3034IncomingLinks(view);
		case ThrottleMediatorEditPart.VISUAL_ID:
			return getThrottleMediator_3493IncomingLinks(view);
		case ThrottleMediatorInputConnectorEditPart.VISUAL_ID:
			return getThrottleMediatorInputConnector_3121IncomingLinks(view);
		case ThrottleMediatorOutputConnectorEditPart.VISUAL_ID:
			return getThrottleMediatorOutputConnector_3122IncomingLinks(view);
		case ThrottleMediatorOnAcceptOutputConnectorEditPart.VISUAL_ID:
			return getThrottleMediatorOnAcceptOutputConnector_3581IncomingLinks(view);
		case ThrottleMediatorOnRejectOutputConnectorEditPart.VISUAL_ID:
			return getThrottleMediatorOnRejectOutputConnector_3582IncomingLinks(view);
		case ThrottleContainerEditPart.VISUAL_ID:
			return getThrottleContainer_3583IncomingLinks(view);
		case ThrottleOnAcceptContainerEditPart.VISUAL_ID:
			return getThrottleOnAcceptContainer_3584IncomingLinks(view);
		case MediatorFlow9EditPart.VISUAL_ID:
			return getMediatorFlow_3585IncomingLinks(view);
		case FilterMediatorEditPart.VISUAL_ID:
			return getFilterMediator_3494IncomingLinks(view);
		case FilterMediatorInputConnectorEditPart.VISUAL_ID:
			return getFilterMediatorInputConnector_3010IncomingLinks(view);
		case FilterMediatorOutputConnectorEditPart.VISUAL_ID:
			return getFilterMediatorOutputConnector_3534IncomingLinks(view);
		case FilterMediatorPassOutputConnectorEditPart.VISUAL_ID:
			return getFilterMediatorPassOutputConnector_3011IncomingLinks(view);
		case FilterMediatorFailOutputConnectorEditPart.VISUAL_ID:
			return getFilterMediatorFailOutputConnector_3012IncomingLinks(view);
		case FilterContainerEditPart.VISUAL_ID:
			return getFilterContainer_3531IncomingLinks(view);
		case FilterPassContainerEditPart.VISUAL_ID:
			return getFilterPassContainer_3535IncomingLinks(view);
		case MediatorFlow7EditPart.VISUAL_ID:
			return getMediatorFlow_3536IncomingLinks(view);
		case LogMediatorEditPart.VISUAL_ID:
			return getLogMediator_3495IncomingLinks(view);
		case LogMediatorInputConnectorEditPart.VISUAL_ID:
			return getLogMediatorInputConnector_3018IncomingLinks(view);
		case LogMediatorOutputConnectorEditPart.VISUAL_ID:
			return getLogMediatorOutputConnector_3019IncomingLinks(view);
		case EnrichMediatorEditPart.VISUAL_ID:
			return getEnrichMediator_3496IncomingLinks(view);
		case EnrichMediatorInputConnectorEditPart.VISUAL_ID:
			return getEnrichMediatorInputConnector_3036IncomingLinks(view);
		case EnrichMediatorOutputConnectorEditPart.VISUAL_ID:
			return getEnrichMediatorOutputConnector_3037IncomingLinks(view);
		case XSLTMediatorEditPart.VISUAL_ID:
			return getXSLTMediator_3497IncomingLinks(view);
		case XSLTMediatorInputConnectorEditPart.VISUAL_ID:
			return getXSLTMediatorInputConnector_3039IncomingLinks(view);
		case XSLTMediatorOutputConnectorEditPart.VISUAL_ID:
			return getXSLTMediatorOutputConnector_3040IncomingLinks(view);
		case SwitchMediatorEditPart.VISUAL_ID:
			return getSwitchMediator_3498IncomingLinks(view);
		case SwitchMediatorInputConnectorEditPart.VISUAL_ID:
			return getSwitchMediatorInputConnector_3042IncomingLinks(view);
		case SwitchCaseBranchOutputConnectorEditPart.VISUAL_ID:
			return getSwitchCaseBranchOutputConnector_3043IncomingLinks(view);
		case SwitchDefaultBranchOutputConnectorEditPart.VISUAL_ID:
			return getSwitchDefaultBranchOutputConnector_3044IncomingLinks(view);
		case SwitchMediatorOutputConnectorEditPart.VISUAL_ID:
			return getSwitchMediatorOutputConnector_3499IncomingLinks(view);
		case SwitchMediatorContainerEditPart.VISUAL_ID:
			return getSwitchMediatorContainer_3500IncomingLinks(view);
		case SwitchCaseContainerEditPart.VISUAL_ID:
			return getSwitchCaseContainer_3501IncomingLinks(view);
		case MediatorFlow2EditPart.VISUAL_ID:
			return getMediatorFlow_3502IncomingLinks(view);
		case SequenceEditPart.VISUAL_ID:
			return getSequence_3503IncomingLinks(view);
		case SequenceInputConnectorEditPart.VISUAL_ID:
			return getSequenceInputConnector_3049IncomingLinks(view);
		case SequenceOutputConnectorEditPart.VISUAL_ID:
			return getSequenceOutputConnector_3050IncomingLinks(view);
		case EventMediatorEditPart.VISUAL_ID:
			return getEventMediator_3504IncomingLinks(view);
		case EventMediatorInputConnectorEditPart.VISUAL_ID:
			return getEventMediatorInputConnector_3052IncomingLinks(view);
		case EventMediatorOutputConnectorEditPart.VISUAL_ID:
			return getEventMediatorOutputConnector_3053IncomingLinks(view);
		case EntitlementMediatorEditPart.VISUAL_ID:
			return getEntitlementMediator_3505IncomingLinks(view);
		case EntitlementMediatorInputConnectorEditPart.VISUAL_ID:
			return getEntitlementMediatorInputConnector_3055IncomingLinks(view);
		case EntitlementMediatorOutputConnectorEditPart.VISUAL_ID:
			return getEntitlementMediatorOutputConnector_3056IncomingLinks(view);
		case ClassMediatorEditPart.VISUAL_ID:
			return getClassMediator_3506IncomingLinks(view);
		case ClassMediatorInputConnectorEditPart.VISUAL_ID:
			return getClassMediatorInputConnector_3058IncomingLinks(view);
		case ClassMediatorOutputConnectorEditPart.VISUAL_ID:
			return getClassMediatorOutputConnector_3059IncomingLinks(view);
		case SpringMediatorEditPart.VISUAL_ID:
			return getSpringMediator_3507IncomingLinks(view);
		case SpringMediatorInputConnectorEditPart.VISUAL_ID:
			return getSpringMediatorInputConnector_3061IncomingLinks(view);
		case SpringMediatorOutputConnectorEditPart.VISUAL_ID:
			return getSpringMediatorOutputConnector_3062IncomingLinks(view);
		case ScriptMediatorEditPart.VISUAL_ID:
			return getScriptMediator_3508IncomingLinks(view);
		case ScriptMediatorInputConnectorEditPart.VISUAL_ID:
			return getScriptMediatorInputConnector_3064IncomingLinks(view);
		case ScriptMediatorOutputConnectorEditPart.VISUAL_ID:
			return getScriptMediatorOutputConnector_3065IncomingLinks(view);
		case FaultMediatorEditPart.VISUAL_ID:
			return getFaultMediator_3509IncomingLinks(view);
		case FaultMediatorInputConnectorEditPart.VISUAL_ID:
			return getFaultMediatorInputConnector_3067IncomingLinks(view);
		case FaultMediatorOutputConnectorEditPart.VISUAL_ID:
			return getFaultMediatorOutputConnector_3068IncomingLinks(view);
		case XQueryMediatorEditPart.VISUAL_ID:
			return getXQueryMediator_3510IncomingLinks(view);
		case XQueryMediatorInputConnectorEditPart.VISUAL_ID:
			return getXQueryMediatorInputConnector_3070IncomingLinks(view);
		case XQueryMediatorOutputConnectorEditPart.VISUAL_ID:
			return getXQueryMediatorOutputConnector_3071IncomingLinks(view);
		case CommandMediatorEditPart.VISUAL_ID:
			return getCommandMediator_3511IncomingLinks(view);
		case CommandMediatorInputConnectorEditPart.VISUAL_ID:
			return getCommandMediatorInputConnector_3073IncomingLinks(view);
		case CommandMediatorOutputConnectorEditPart.VISUAL_ID:
			return getCommandMediatorOutputConnector_3074IncomingLinks(view);
		case DBLookupMediatorEditPart.VISUAL_ID:
			return getDBLookupMediator_3512IncomingLinks(view);
		case DBLookupMediatorInputConnectorEditPart.VISUAL_ID:
			return getDBLookupMediatorInputConnector_3076IncomingLinks(view);
		case DBLookupMediatorOutputConnectorEditPart.VISUAL_ID:
			return getDBLookupMediatorOutputConnector_3077IncomingLinks(view);
		case DBReportMediatorEditPart.VISUAL_ID:
			return getDBReportMediator_3513IncomingLinks(view);
		case DBReportMediatorInputConnectorEditPart.VISUAL_ID:
			return getDBReportMediatorInputConnector_3079IncomingLinks(view);
		case DBReportMediatorOutputConnectorEditPart.VISUAL_ID:
			return getDBReportMediatorOutputConnector_3080IncomingLinks(view);
		case SmooksMediatorEditPart.VISUAL_ID:
			return getSmooksMediator_3514IncomingLinks(view);
		case SmooksMediatorInputConnectorEditPart.VISUAL_ID:
			return getSmooksMediatorInputConnector_3082IncomingLinks(view);
		case SmooksMediatorOutputConnectorEditPart.VISUAL_ID:
			return getSmooksMediatorOutputConnector_3083IncomingLinks(view);
		case SendMediatorEditPart.VISUAL_ID:
			return getSendMediator_3515IncomingLinks(view);
		case SendMediatorInputConnectorEditPart.VISUAL_ID:
			return getSendMediatorInputConnector_3085IncomingLinks(view);
		case SendMediatorOutputConnectorEditPart.VISUAL_ID:
			return getSendMediatorOutputConnector_3086IncomingLinks(view);
		case SendMediatorEndpointOutputConnectorEditPart.VISUAL_ID:
			return getSendMediatorEndpointOutputConnector_3539IncomingLinks(view);
		case EndpointFlowEditPart.VISUAL_ID:
			return getEndpointFlow_3562IncomingLinks(view);
		case HeaderMediatorEditPart.VISUAL_ID:
			return getHeaderMediator_3516IncomingLinks(view);
		case HeaderMediatorInputConnectorEditPart.VISUAL_ID:
			return getHeaderMediatorInputConnector_3100IncomingLinks(view);
		case HeaderMediatorOutputConnectorEditPart.VISUAL_ID:
			return getHeaderMediatorOutputConnector_3101IncomingLinks(view);
		case CloneMediatorEditPart.VISUAL_ID:
			return getCloneMediator_3517IncomingLinks(view);
		case CloneMediatorInputConnectorEditPart.VISUAL_ID:
			return getCloneMediatorInputConnector_3103IncomingLinks(view);
		case CloneMediatorOutputConnectorEditPart.VISUAL_ID:
			return getCloneMediatorOutputConnector_3104IncomingLinks(view);
		case CloneMediatorTargetOutputConnectorEditPart.VISUAL_ID:
			return getCloneMediatorTargetOutputConnector_3133IncomingLinks(view);
		case CloneMediatorContainerEditPart.VISUAL_ID:
			return getCloneMediatorContainer_3603IncomingLinks(view);
		case CloneTargetContainerEditPart.VISUAL_ID:
			return getCloneTargetContainer_3604IncomingLinks(view);
		case MediatorFlow11EditPart.VISUAL_ID:
			return getMediatorFlow_3605IncomingLinks(view);
		case CacheMediatorEditPart.VISUAL_ID:
			return getCacheMediator_3518IncomingLinks(view);
		case CacheMediatorInputConnectorEditPart.VISUAL_ID:
			return getCacheMediatorInputConnector_3106IncomingLinks(view);
		case CacheMediatorOutputConnectorEditPart.VISUAL_ID:
			return getCacheMediatorOutputConnector_3107IncomingLinks(view);
		case IterateMediatorEditPart.VISUAL_ID:
			return getIterateMediator_3519IncomingLinks(view);
		case IterateMediatorInputConnectorEditPart.VISUAL_ID:
			return getIterateMediatorInputConnector_3109IncomingLinks(view);
		case IterateMediatorOutputConnectorEditPart.VISUAL_ID:
			return getIterateMediatorOutputConnector_3110IncomingLinks(view);
		case IterateMediatorTargetOutputConnectorEditPart.VISUAL_ID:
			return getIterateMediatorTargetOutputConnector_3606IncomingLinks(view);
		case MediatorFlow12EditPart.VISUAL_ID:
			return getMediatorFlow_3607IncomingLinks(view);
		case CalloutMediatorEditPart.VISUAL_ID:
			return getCalloutMediator_3520IncomingLinks(view);
		case CalloutMediatorInputConnectorEditPart.VISUAL_ID:
			return getCalloutMediatorInputConnector_3115IncomingLinks(view);
		case CalloutMediatorOutputConnectorEditPart.VISUAL_ID:
			return getCalloutMediatorOutputConnector_3116IncomingLinks(view);
		case TransactionMediatorEditPart.VISUAL_ID:
			return getTransactionMediator_3521IncomingLinks(view);
		case TransactionMediatorInputConnectorEditPart.VISUAL_ID:
			return getTransactionMediatorInputConnector_3118IncomingLinks(view);
		case TransactionMediatorOutputConnectorEditPart.VISUAL_ID:
			return getTransactionMediatorOutputConnector_3119IncomingLinks(view);
		case RMSequenceMediatorEditPart.VISUAL_ID:
			return getRMSequenceMediator_3522IncomingLinks(view);
		case RMSequenceMediatorInputConnectorEditPart.VISUAL_ID:
			return getRMSequenceMediatorInputConnector_3124IncomingLinks(view);
		case RMSequenceMediatorOutputConnectorEditPart.VISUAL_ID:
			return getRMSequenceMediatorOutputConnector_3125IncomingLinks(view);
		case RuleMediatorEditPart.VISUAL_ID:
			return getRuleMediator_3523IncomingLinks(view);
		case RuleMediatorInputConnectorEditPart.VISUAL_ID:
			return getRuleMediatorInputConnector_3127IncomingLinks(view);
		case RuleMediatorOutputConnectorEditPart.VISUAL_ID:
			return getRuleMediatorOutputConnector_3128IncomingLinks(view);
		case OAuthMediatorEditPart.VISUAL_ID:
			return getOAuthMediator_3524IncomingLinks(view);
		case OAuthMediatorInputConnectorEditPart.VISUAL_ID:
			return getOAuthMediatorInputConnector_3130IncomingLinks(view);
		case OAuthMediatorOutputConnectorEditPart.VISUAL_ID:
			return getOAuthMediatorOutputConnector_3131IncomingLinks(view);
		case AggregateMediatorEditPart.VISUAL_ID:
			return getAggregateMediator_3525IncomingLinks(view);
		case AggregateMediatorInputConnectorEditPart.VISUAL_ID:
			return getAggregateMediatorInputConnector_3112IncomingLinks(view);
		case AggregateMediatorOutputConnectorEditPart.VISUAL_ID:
			return getAggregateMediatorOutputConnector_3113IncomingLinks(view);
		case AggregateMediatorOnCompleteOutputConnectorEditPart.VISUAL_ID:
			return getAggregateMediatorOnCompleteOutputConnector_3132IncomingLinks(view);
		case MediatorFlow3EditPart.VISUAL_ID:
			return getMediatorFlow_3526IncomingLinks(view);
		case StoreMediatorEditPart.VISUAL_ID:
			return getStoreMediator_3588IncomingLinks(view);
		case StoreMediatorInputConnectorEditPart.VISUAL_ID:
			return getStoreMediatorInputConnector_3589IncomingLinks(view);
		case StoreMediatorOutputConnectorEditPart.VISUAL_ID:
			return getStoreMediatorOutputConnector_3590IncomingLinks(view);
		case BuilderMediatorEditPart.VISUAL_ID:
			return getBuilderMediator_3591IncomingLinks(view);
		case BuilderMediatorInputConnectorEditPart.VISUAL_ID:
			return getBuilderMediatorInputConnector_3592IncomingLinks(view);
		case BuilderMediatorOutputConectorEditPart.VISUAL_ID:
			return getBuilderMediatorOutputConector_3593IncomingLinks(view);
		case CallTemplateMediatorEditPart.VISUAL_ID:
			return getCallTemplateMediator_3594IncomingLinks(view);
		case CallTemplateMediatorInputConnectorEditPart.VISUAL_ID:
			return getCallTemplateMediatorInputConnector_3595IncomingLinks(view);
		case CallTemplateMediatorOutputConnectorEditPart.VISUAL_ID:
			return getCallTemplateMediatorOutputConnector_3596IncomingLinks(view);
		case PayloadFactoryMediatorEditPart.VISUAL_ID:
			return getPayloadFactoryMediator_3597IncomingLinks(view);
		case PayloadFactoryMediatorInputConnectorEditPart.VISUAL_ID:
			return getPayloadFactoryMediatorInputConnector_3598IncomingLinks(view);
		case PayloadFactoryMediatorOutputConnectorEditPart.VISUAL_ID:
			return getPayloadFactoryMediatorOutputConnector_3599IncomingLinks(view);
		case EnqueueMediatorEditPart.VISUAL_ID:
			return getEnqueueMediator_3600IncomingLinks(view);
		case EnqueueMediatorInputConnectorEditPart.VISUAL_ID:
			return getEnqueueMediatorInputConnector_3601IncomingLinks(view);
		case EnqueueMediatorOutputConnectorEditPart.VISUAL_ID:
			return getEnqueueMediatorOutputConnector_3602IncomingLinks(view);
		case DefaultEndPointEditPart.VISUAL_ID:
			return getDefaultEndPoint_3609IncomingLinks(view);
		case DefaultEndPointInputConnectorEditPart.VISUAL_ID:
			return getDefaultEndPointInputConnector_3021IncomingLinks(view);
		case DefaultEndPointOutputConnectorEditPart.VISUAL_ID:
			return getDefaultEndPointOutputConnector_3022IncomingLinks(view);
		case AddressEndPointEditPart.VISUAL_ID:
			return getAddressEndPoint_3610IncomingLinks(view);
		case AddressEndPointInputConnectorEditPart.VISUAL_ID:
			return getAddressEndPointInputConnector_3030IncomingLinks(view);
		case AddressEndPointOutputConnectorEditPart.VISUAL_ID:
			return getAddressEndPointOutputConnector_3031IncomingLinks(view);
		case FailoverEndPointEditPart.VISUAL_ID:
			return getFailoverEndPoint_3611IncomingLinks(view);
		case FailoverEndPointInputConnectorEditPart.VISUAL_ID:
			return getFailoverEndPointInputConnector_3088IncomingLinks(view);
		case FailoverEndPointOutputConnectorEditPart.VISUAL_ID:
			return getFailoverEndPointOutputConnector_3090IncomingLinks(view);
		case FailoverEndPointWestOutputConnectorEditPart.VISUAL_ID:
			return getFailoverEndPointWestOutputConnector_3097IncomingLinks(view);
		case WSDLEndPointEditPart.VISUAL_ID:
			return getWSDLEndPoint_3612IncomingLinks(view);
		case WSDLEndPointInputConnectorEditPart.VISUAL_ID:
			return getWSDLEndPointInputConnector_3092IncomingLinks(view);
		case WSDLEndPointOutputConnectorEditPart.VISUAL_ID:
			return getWSDLEndPointOutputConnector_3093IncomingLinks(view);
		case LoadBalanceEndPointEditPart.VISUAL_ID:
			return getLoadBalanceEndPoint_3613IncomingLinks(view);
		case LoadBalanceEndPointInputConnectorEditPart.VISUAL_ID:
			return getLoadBalanceEndPointInputConnector_3095IncomingLinks(view);
		case LoadBalanceEndPointOutputConnectorEditPart.VISUAL_ID:
			return getLoadBalanceEndPointOutputConnector_3096IncomingLinks(view);
		case LoadBalanceEndPointWestOutputConnectorEditPart.VISUAL_ID:
			return getLoadBalanceEndPointWestOutputConnector_3098IncomingLinks(view);
		case SwitchDefaultContainerEditPart.VISUAL_ID:
			return getSwitchDefaultContainer_3527IncomingLinks(view);
		case MediatorFlow4EditPart.VISUAL_ID:
			return getMediatorFlow_3528IncomingLinks(view);
		case FilterFailContainerEditPart.VISUAL_ID:
			return getFilterFailContainer_3537IncomingLinks(view);
		case MediatorFlow8EditPart.VISUAL_ID:
			return getMediatorFlow_3538IncomingLinks(view);
		case ThrottleOnRejectContainerEditPart.VISUAL_ID:
			return getThrottleOnRejectContainer_3586IncomingLinks(view);
		case MediatorFlow10EditPart.VISUAL_ID:
			return getMediatorFlow_3587IncomingLinks(view);
		case ProxyServiceFaultContainerEditPart.VISUAL_ID:
			return getProxyServiceFaultContainer_3488IncomingLinks(view);
		case MediatorFlow6EditPart.VISUAL_ID:
			return getMediatorFlow_3530IncomingLinks(view);
		case MessageMediatorEditPart.VISUAL_ID:
			return getMessageMediator_3045IncomingLinks(view);
		case MessageInputConnectorEditPart.VISUAL_ID:
			return getMessageInputConnector_3046IncomingLinks(view);
		case MessageOutputConnectorEditPart.VISUAL_ID:
			return getMessageOutputConnector_3047IncomingLinks(view);
		case MergeNodeEditPart.VISUAL_ID:
			return getMergeNode_3013IncomingLinks(view);
		case MergeNodeFirstInputConnectorEditPart.VISUAL_ID:
			return getMergeNodeFirstInputConnector_3014IncomingLinks(view);
		case MergeNodeSecondInputConnectorEditPart.VISUAL_ID:
			return getMergeNodeSecondInputConnector_3015IncomingLinks(view);
		case MergeNodeOutputConnectorEditPart.VISUAL_ID:
			return getMergeNodeOutputConnector_3016IncomingLinks(view);
		case SequencesEditPart.VISUAL_ID:
			return getSequences_3614IncomingLinks(view);
		case MediatorFlow5EditPart.VISUAL_ID:
			return getMediatorFlow_3615IncomingLinks(view);
		case SequencesInputConnectorEditPart.VISUAL_ID:
			return getSequencesInputConnector_3616IncomingLinks(view);
		case SequencesOutputConnectorEditPart.VISUAL_ID:
			return getSequencesOutputConnector_3617IncomingLinks(view);
		case EsbLinkEditPart.VISUAL_ID:
			return getEsbLink_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getOutgoingLinks(View view) {
		switch (EsbVisualIDRegistry.getVisualID(view)) {
		case EsbServerEditPart.VISUAL_ID:
			return getEsbServer_2001OutgoingLinks(view);
		case ProxyServiceEditPart.VISUAL_ID:
			return getProxyService_3001OutgoingLinks(view);
		case ProxyOutputConnectorEditPart.VISUAL_ID:
			return getProxyOutputConnector_3002OutgoingLinks(view);
		case ProxyInputConnectorEditPart.VISUAL_ID:
			return getProxyInputConnector_3003OutgoingLinks(view);
		case ProxyFaultInputConnectorEditPart.VISUAL_ID:
			return getProxyFaultInputConnector_3489OutgoingLinks(view);
		case ProxyServiceContainerEditPart.VISUAL_ID:
			return getProxyServiceContainer_3486OutgoingLinks(view);
		case ProxyServiceSequenceAndEndpointContainerEditPart.VISUAL_ID:
			return getProxyServiceSequenceAndEndpointContainer_3487OutgoingLinks(view);
		case MediatorFlowEditPart.VISUAL_ID:
			return getMediatorFlow_3608OutgoingLinks(view);
		case DropMediatorEditPart.VISUAL_ID:
			return getDropMediator_3491OutgoingLinks(view);
		case DropMediatorInputConnectorEditPart.VISUAL_ID:
			return getDropMediatorInputConnector_3008OutgoingLinks(view);
		case PropertyMediatorEditPart.VISUAL_ID:
			return getPropertyMediator_3492OutgoingLinks(view);
		case PropertyMediatorInputConnectorEditPart.VISUAL_ID:
			return getPropertyMediatorInputConnector_3033OutgoingLinks(view);
		case PropertyMediatorOutputConnectorEditPart.VISUAL_ID:
			return getPropertyMediatorOutputConnector_3034OutgoingLinks(view);
		case ThrottleMediatorEditPart.VISUAL_ID:
			return getThrottleMediator_3493OutgoingLinks(view);
		case ThrottleMediatorInputConnectorEditPart.VISUAL_ID:
			return getThrottleMediatorInputConnector_3121OutgoingLinks(view);
		case ThrottleMediatorOutputConnectorEditPart.VISUAL_ID:
			return getThrottleMediatorOutputConnector_3122OutgoingLinks(view);
		case ThrottleMediatorOnAcceptOutputConnectorEditPart.VISUAL_ID:
			return getThrottleMediatorOnAcceptOutputConnector_3581OutgoingLinks(view);
		case ThrottleMediatorOnRejectOutputConnectorEditPart.VISUAL_ID:
			return getThrottleMediatorOnRejectOutputConnector_3582OutgoingLinks(view);
		case ThrottleContainerEditPart.VISUAL_ID:
			return getThrottleContainer_3583OutgoingLinks(view);
		case ThrottleOnAcceptContainerEditPart.VISUAL_ID:
			return getThrottleOnAcceptContainer_3584OutgoingLinks(view);
		case MediatorFlow9EditPart.VISUAL_ID:
			return getMediatorFlow_3585OutgoingLinks(view);
		case FilterMediatorEditPart.VISUAL_ID:
			return getFilterMediator_3494OutgoingLinks(view);
		case FilterMediatorInputConnectorEditPart.VISUAL_ID:
			return getFilterMediatorInputConnector_3010OutgoingLinks(view);
		case FilterMediatorOutputConnectorEditPart.VISUAL_ID:
			return getFilterMediatorOutputConnector_3534OutgoingLinks(view);
		case FilterMediatorPassOutputConnectorEditPart.VISUAL_ID:
			return getFilterMediatorPassOutputConnector_3011OutgoingLinks(view);
		case FilterMediatorFailOutputConnectorEditPart.VISUAL_ID:
			return getFilterMediatorFailOutputConnector_3012OutgoingLinks(view);
		case FilterContainerEditPart.VISUAL_ID:
			return getFilterContainer_3531OutgoingLinks(view);
		case FilterPassContainerEditPart.VISUAL_ID:
			return getFilterPassContainer_3535OutgoingLinks(view);
		case MediatorFlow7EditPart.VISUAL_ID:
			return getMediatorFlow_3536OutgoingLinks(view);
		case LogMediatorEditPart.VISUAL_ID:
			return getLogMediator_3495OutgoingLinks(view);
		case LogMediatorInputConnectorEditPart.VISUAL_ID:
			return getLogMediatorInputConnector_3018OutgoingLinks(view);
		case LogMediatorOutputConnectorEditPart.VISUAL_ID:
			return getLogMediatorOutputConnector_3019OutgoingLinks(view);
		case EnrichMediatorEditPart.VISUAL_ID:
			return getEnrichMediator_3496OutgoingLinks(view);
		case EnrichMediatorInputConnectorEditPart.VISUAL_ID:
			return getEnrichMediatorInputConnector_3036OutgoingLinks(view);
		case EnrichMediatorOutputConnectorEditPart.VISUAL_ID:
			return getEnrichMediatorOutputConnector_3037OutgoingLinks(view);
		case XSLTMediatorEditPart.VISUAL_ID:
			return getXSLTMediator_3497OutgoingLinks(view);
		case XSLTMediatorInputConnectorEditPart.VISUAL_ID:
			return getXSLTMediatorInputConnector_3039OutgoingLinks(view);
		case XSLTMediatorOutputConnectorEditPart.VISUAL_ID:
			return getXSLTMediatorOutputConnector_3040OutgoingLinks(view);
		case SwitchMediatorEditPart.VISUAL_ID:
			return getSwitchMediator_3498OutgoingLinks(view);
		case SwitchMediatorInputConnectorEditPart.VISUAL_ID:
			return getSwitchMediatorInputConnector_3042OutgoingLinks(view);
		case SwitchCaseBranchOutputConnectorEditPart.VISUAL_ID:
			return getSwitchCaseBranchOutputConnector_3043OutgoingLinks(view);
		case SwitchDefaultBranchOutputConnectorEditPart.VISUAL_ID:
			return getSwitchDefaultBranchOutputConnector_3044OutgoingLinks(view);
		case SwitchMediatorOutputConnectorEditPart.VISUAL_ID:
			return getSwitchMediatorOutputConnector_3499OutgoingLinks(view);
		case SwitchMediatorContainerEditPart.VISUAL_ID:
			return getSwitchMediatorContainer_3500OutgoingLinks(view);
		case SwitchCaseContainerEditPart.VISUAL_ID:
			return getSwitchCaseContainer_3501OutgoingLinks(view);
		case MediatorFlow2EditPart.VISUAL_ID:
			return getMediatorFlow_3502OutgoingLinks(view);
		case SequenceEditPart.VISUAL_ID:
			return getSequence_3503OutgoingLinks(view);
		case SequenceInputConnectorEditPart.VISUAL_ID:
			return getSequenceInputConnector_3049OutgoingLinks(view);
		case SequenceOutputConnectorEditPart.VISUAL_ID:
			return getSequenceOutputConnector_3050OutgoingLinks(view);
		case EventMediatorEditPart.VISUAL_ID:
			return getEventMediator_3504OutgoingLinks(view);
		case EventMediatorInputConnectorEditPart.VISUAL_ID:
			return getEventMediatorInputConnector_3052OutgoingLinks(view);
		case EventMediatorOutputConnectorEditPart.VISUAL_ID:
			return getEventMediatorOutputConnector_3053OutgoingLinks(view);
		case EntitlementMediatorEditPart.VISUAL_ID:
			return getEntitlementMediator_3505OutgoingLinks(view);
		case EntitlementMediatorInputConnectorEditPart.VISUAL_ID:
			return getEntitlementMediatorInputConnector_3055OutgoingLinks(view);
		case EntitlementMediatorOutputConnectorEditPart.VISUAL_ID:
			return getEntitlementMediatorOutputConnector_3056OutgoingLinks(view);
		case ClassMediatorEditPart.VISUAL_ID:
			return getClassMediator_3506OutgoingLinks(view);
		case ClassMediatorInputConnectorEditPart.VISUAL_ID:
			return getClassMediatorInputConnector_3058OutgoingLinks(view);
		case ClassMediatorOutputConnectorEditPart.VISUAL_ID:
			return getClassMediatorOutputConnector_3059OutgoingLinks(view);
		case SpringMediatorEditPart.VISUAL_ID:
			return getSpringMediator_3507OutgoingLinks(view);
		case SpringMediatorInputConnectorEditPart.VISUAL_ID:
			return getSpringMediatorInputConnector_3061OutgoingLinks(view);
		case SpringMediatorOutputConnectorEditPart.VISUAL_ID:
			return getSpringMediatorOutputConnector_3062OutgoingLinks(view);
		case ScriptMediatorEditPart.VISUAL_ID:
			return getScriptMediator_3508OutgoingLinks(view);
		case ScriptMediatorInputConnectorEditPart.VISUAL_ID:
			return getScriptMediatorInputConnector_3064OutgoingLinks(view);
		case ScriptMediatorOutputConnectorEditPart.VISUAL_ID:
			return getScriptMediatorOutputConnector_3065OutgoingLinks(view);
		case FaultMediatorEditPart.VISUAL_ID:
			return getFaultMediator_3509OutgoingLinks(view);
		case FaultMediatorInputConnectorEditPart.VISUAL_ID:
			return getFaultMediatorInputConnector_3067OutgoingLinks(view);
		case FaultMediatorOutputConnectorEditPart.VISUAL_ID:
			return getFaultMediatorOutputConnector_3068OutgoingLinks(view);
		case XQueryMediatorEditPart.VISUAL_ID:
			return getXQueryMediator_3510OutgoingLinks(view);
		case XQueryMediatorInputConnectorEditPart.VISUAL_ID:
			return getXQueryMediatorInputConnector_3070OutgoingLinks(view);
		case XQueryMediatorOutputConnectorEditPart.VISUAL_ID:
			return getXQueryMediatorOutputConnector_3071OutgoingLinks(view);
		case CommandMediatorEditPart.VISUAL_ID:
			return getCommandMediator_3511OutgoingLinks(view);
		case CommandMediatorInputConnectorEditPart.VISUAL_ID:
			return getCommandMediatorInputConnector_3073OutgoingLinks(view);
		case CommandMediatorOutputConnectorEditPart.VISUAL_ID:
			return getCommandMediatorOutputConnector_3074OutgoingLinks(view);
		case DBLookupMediatorEditPart.VISUAL_ID:
			return getDBLookupMediator_3512OutgoingLinks(view);
		case DBLookupMediatorInputConnectorEditPart.VISUAL_ID:
			return getDBLookupMediatorInputConnector_3076OutgoingLinks(view);
		case DBLookupMediatorOutputConnectorEditPart.VISUAL_ID:
			return getDBLookupMediatorOutputConnector_3077OutgoingLinks(view);
		case DBReportMediatorEditPart.VISUAL_ID:
			return getDBReportMediator_3513OutgoingLinks(view);
		case DBReportMediatorInputConnectorEditPart.VISUAL_ID:
			return getDBReportMediatorInputConnector_3079OutgoingLinks(view);
		case DBReportMediatorOutputConnectorEditPart.VISUAL_ID:
			return getDBReportMediatorOutputConnector_3080OutgoingLinks(view);
		case SmooksMediatorEditPart.VISUAL_ID:
			return getSmooksMediator_3514OutgoingLinks(view);
		case SmooksMediatorInputConnectorEditPart.VISUAL_ID:
			return getSmooksMediatorInputConnector_3082OutgoingLinks(view);
		case SmooksMediatorOutputConnectorEditPart.VISUAL_ID:
			return getSmooksMediatorOutputConnector_3083OutgoingLinks(view);
		case SendMediatorEditPart.VISUAL_ID:
			return getSendMediator_3515OutgoingLinks(view);
		case SendMediatorInputConnectorEditPart.VISUAL_ID:
			return getSendMediatorInputConnector_3085OutgoingLinks(view);
		case SendMediatorOutputConnectorEditPart.VISUAL_ID:
			return getSendMediatorOutputConnector_3086OutgoingLinks(view);
		case SendMediatorEndpointOutputConnectorEditPart.VISUAL_ID:
			return getSendMediatorEndpointOutputConnector_3539OutgoingLinks(view);
		case EndpointFlowEditPart.VISUAL_ID:
			return getEndpointFlow_3562OutgoingLinks(view);
		case HeaderMediatorEditPart.VISUAL_ID:
			return getHeaderMediator_3516OutgoingLinks(view);
		case HeaderMediatorInputConnectorEditPart.VISUAL_ID:
			return getHeaderMediatorInputConnector_3100OutgoingLinks(view);
		case HeaderMediatorOutputConnectorEditPart.VISUAL_ID:
			return getHeaderMediatorOutputConnector_3101OutgoingLinks(view);
		case CloneMediatorEditPart.VISUAL_ID:
			return getCloneMediator_3517OutgoingLinks(view);
		case CloneMediatorInputConnectorEditPart.VISUAL_ID:
			return getCloneMediatorInputConnector_3103OutgoingLinks(view);
		case CloneMediatorOutputConnectorEditPart.VISUAL_ID:
			return getCloneMediatorOutputConnector_3104OutgoingLinks(view);
		case CloneMediatorTargetOutputConnectorEditPart.VISUAL_ID:
			return getCloneMediatorTargetOutputConnector_3133OutgoingLinks(view);
		case CloneMediatorContainerEditPart.VISUAL_ID:
			return getCloneMediatorContainer_3603OutgoingLinks(view);
		case CloneTargetContainerEditPart.VISUAL_ID:
			return getCloneTargetContainer_3604OutgoingLinks(view);
		case MediatorFlow11EditPart.VISUAL_ID:
			return getMediatorFlow_3605OutgoingLinks(view);
		case CacheMediatorEditPart.VISUAL_ID:
			return getCacheMediator_3518OutgoingLinks(view);
		case CacheMediatorInputConnectorEditPart.VISUAL_ID:
			return getCacheMediatorInputConnector_3106OutgoingLinks(view);
		case CacheMediatorOutputConnectorEditPart.VISUAL_ID:
			return getCacheMediatorOutputConnector_3107OutgoingLinks(view);
		case IterateMediatorEditPart.VISUAL_ID:
			return getIterateMediator_3519OutgoingLinks(view);
		case IterateMediatorInputConnectorEditPart.VISUAL_ID:
			return getIterateMediatorInputConnector_3109OutgoingLinks(view);
		case IterateMediatorOutputConnectorEditPart.VISUAL_ID:
			return getIterateMediatorOutputConnector_3110OutgoingLinks(view);
		case IterateMediatorTargetOutputConnectorEditPart.VISUAL_ID:
			return getIterateMediatorTargetOutputConnector_3606OutgoingLinks(view);
		case MediatorFlow12EditPart.VISUAL_ID:
			return getMediatorFlow_3607OutgoingLinks(view);
		case CalloutMediatorEditPart.VISUAL_ID:
			return getCalloutMediator_3520OutgoingLinks(view);
		case CalloutMediatorInputConnectorEditPart.VISUAL_ID:
			return getCalloutMediatorInputConnector_3115OutgoingLinks(view);
		case CalloutMediatorOutputConnectorEditPart.VISUAL_ID:
			return getCalloutMediatorOutputConnector_3116OutgoingLinks(view);
		case TransactionMediatorEditPart.VISUAL_ID:
			return getTransactionMediator_3521OutgoingLinks(view);
		case TransactionMediatorInputConnectorEditPart.VISUAL_ID:
			return getTransactionMediatorInputConnector_3118OutgoingLinks(view);
		case TransactionMediatorOutputConnectorEditPart.VISUAL_ID:
			return getTransactionMediatorOutputConnector_3119OutgoingLinks(view);
		case RMSequenceMediatorEditPart.VISUAL_ID:
			return getRMSequenceMediator_3522OutgoingLinks(view);
		case RMSequenceMediatorInputConnectorEditPart.VISUAL_ID:
			return getRMSequenceMediatorInputConnector_3124OutgoingLinks(view);
		case RMSequenceMediatorOutputConnectorEditPart.VISUAL_ID:
			return getRMSequenceMediatorOutputConnector_3125OutgoingLinks(view);
		case RuleMediatorEditPart.VISUAL_ID:
			return getRuleMediator_3523OutgoingLinks(view);
		case RuleMediatorInputConnectorEditPart.VISUAL_ID:
			return getRuleMediatorInputConnector_3127OutgoingLinks(view);
		case RuleMediatorOutputConnectorEditPart.VISUAL_ID:
			return getRuleMediatorOutputConnector_3128OutgoingLinks(view);
		case OAuthMediatorEditPart.VISUAL_ID:
			return getOAuthMediator_3524OutgoingLinks(view);
		case OAuthMediatorInputConnectorEditPart.VISUAL_ID:
			return getOAuthMediatorInputConnector_3130OutgoingLinks(view);
		case OAuthMediatorOutputConnectorEditPart.VISUAL_ID:
			return getOAuthMediatorOutputConnector_3131OutgoingLinks(view);
		case AggregateMediatorEditPart.VISUAL_ID:
			return getAggregateMediator_3525OutgoingLinks(view);
		case AggregateMediatorInputConnectorEditPart.VISUAL_ID:
			return getAggregateMediatorInputConnector_3112OutgoingLinks(view);
		case AggregateMediatorOutputConnectorEditPart.VISUAL_ID:
			return getAggregateMediatorOutputConnector_3113OutgoingLinks(view);
		case AggregateMediatorOnCompleteOutputConnectorEditPart.VISUAL_ID:
			return getAggregateMediatorOnCompleteOutputConnector_3132OutgoingLinks(view);
		case MediatorFlow3EditPart.VISUAL_ID:
			return getMediatorFlow_3526OutgoingLinks(view);
		case StoreMediatorEditPart.VISUAL_ID:
			return getStoreMediator_3588OutgoingLinks(view);
		case StoreMediatorInputConnectorEditPart.VISUAL_ID:
			return getStoreMediatorInputConnector_3589OutgoingLinks(view);
		case StoreMediatorOutputConnectorEditPart.VISUAL_ID:
			return getStoreMediatorOutputConnector_3590OutgoingLinks(view);
		case BuilderMediatorEditPart.VISUAL_ID:
			return getBuilderMediator_3591OutgoingLinks(view);
		case BuilderMediatorInputConnectorEditPart.VISUAL_ID:
			return getBuilderMediatorInputConnector_3592OutgoingLinks(view);
		case BuilderMediatorOutputConectorEditPart.VISUAL_ID:
			return getBuilderMediatorOutputConector_3593OutgoingLinks(view);
		case CallTemplateMediatorEditPart.VISUAL_ID:
			return getCallTemplateMediator_3594OutgoingLinks(view);
		case CallTemplateMediatorInputConnectorEditPart.VISUAL_ID:
			return getCallTemplateMediatorInputConnector_3595OutgoingLinks(view);
		case CallTemplateMediatorOutputConnectorEditPart.VISUAL_ID:
			return getCallTemplateMediatorOutputConnector_3596OutgoingLinks(view);
		case PayloadFactoryMediatorEditPart.VISUAL_ID:
			return getPayloadFactoryMediator_3597OutgoingLinks(view);
		case PayloadFactoryMediatorInputConnectorEditPart.VISUAL_ID:
			return getPayloadFactoryMediatorInputConnector_3598OutgoingLinks(view);
		case PayloadFactoryMediatorOutputConnectorEditPart.VISUAL_ID:
			return getPayloadFactoryMediatorOutputConnector_3599OutgoingLinks(view);
		case EnqueueMediatorEditPart.VISUAL_ID:
			return getEnqueueMediator_3600OutgoingLinks(view);
		case EnqueueMediatorInputConnectorEditPart.VISUAL_ID:
			return getEnqueueMediatorInputConnector_3601OutgoingLinks(view);
		case EnqueueMediatorOutputConnectorEditPart.VISUAL_ID:
			return getEnqueueMediatorOutputConnector_3602OutgoingLinks(view);
		case DefaultEndPointEditPart.VISUAL_ID:
			return getDefaultEndPoint_3609OutgoingLinks(view);
		case DefaultEndPointInputConnectorEditPart.VISUAL_ID:
			return getDefaultEndPointInputConnector_3021OutgoingLinks(view);
		case DefaultEndPointOutputConnectorEditPart.VISUAL_ID:
			return getDefaultEndPointOutputConnector_3022OutgoingLinks(view);
		case AddressEndPointEditPart.VISUAL_ID:
			return getAddressEndPoint_3610OutgoingLinks(view);
		case AddressEndPointInputConnectorEditPart.VISUAL_ID:
			return getAddressEndPointInputConnector_3030OutgoingLinks(view);
		case AddressEndPointOutputConnectorEditPart.VISUAL_ID:
			return getAddressEndPointOutputConnector_3031OutgoingLinks(view);
		case FailoverEndPointEditPart.VISUAL_ID:
			return getFailoverEndPoint_3611OutgoingLinks(view);
		case FailoverEndPointInputConnectorEditPart.VISUAL_ID:
			return getFailoverEndPointInputConnector_3088OutgoingLinks(view);
		case FailoverEndPointOutputConnectorEditPart.VISUAL_ID:
			return getFailoverEndPointOutputConnector_3090OutgoingLinks(view);
		case FailoverEndPointWestOutputConnectorEditPart.VISUAL_ID:
			return getFailoverEndPointWestOutputConnector_3097OutgoingLinks(view);
		case WSDLEndPointEditPart.VISUAL_ID:
			return getWSDLEndPoint_3612OutgoingLinks(view);
		case WSDLEndPointInputConnectorEditPart.VISUAL_ID:
			return getWSDLEndPointInputConnector_3092OutgoingLinks(view);
		case WSDLEndPointOutputConnectorEditPart.VISUAL_ID:
			return getWSDLEndPointOutputConnector_3093OutgoingLinks(view);
		case LoadBalanceEndPointEditPart.VISUAL_ID:
			return getLoadBalanceEndPoint_3613OutgoingLinks(view);
		case LoadBalanceEndPointInputConnectorEditPart.VISUAL_ID:
			return getLoadBalanceEndPointInputConnector_3095OutgoingLinks(view);
		case LoadBalanceEndPointOutputConnectorEditPart.VISUAL_ID:
			return getLoadBalanceEndPointOutputConnector_3096OutgoingLinks(view);
		case LoadBalanceEndPointWestOutputConnectorEditPart.VISUAL_ID:
			return getLoadBalanceEndPointWestOutputConnector_3098OutgoingLinks(view);
		case SwitchDefaultContainerEditPart.VISUAL_ID:
			return getSwitchDefaultContainer_3527OutgoingLinks(view);
		case MediatorFlow4EditPart.VISUAL_ID:
			return getMediatorFlow_3528OutgoingLinks(view);
		case FilterFailContainerEditPart.VISUAL_ID:
			return getFilterFailContainer_3537OutgoingLinks(view);
		case MediatorFlow8EditPart.VISUAL_ID:
			return getMediatorFlow_3538OutgoingLinks(view);
		case ThrottleOnRejectContainerEditPart.VISUAL_ID:
			return getThrottleOnRejectContainer_3586OutgoingLinks(view);
		case MediatorFlow10EditPart.VISUAL_ID:
			return getMediatorFlow_3587OutgoingLinks(view);
		case ProxyServiceFaultContainerEditPart.VISUAL_ID:
			return getProxyServiceFaultContainer_3488OutgoingLinks(view);
		case MediatorFlow6EditPart.VISUAL_ID:
			return getMediatorFlow_3530OutgoingLinks(view);
		case MessageMediatorEditPart.VISUAL_ID:
			return getMessageMediator_3045OutgoingLinks(view);
		case MessageInputConnectorEditPart.VISUAL_ID:
			return getMessageInputConnector_3046OutgoingLinks(view);
		case MessageOutputConnectorEditPart.VISUAL_ID:
			return getMessageOutputConnector_3047OutgoingLinks(view);
		case MergeNodeEditPart.VISUAL_ID:
			return getMergeNode_3013OutgoingLinks(view);
		case MergeNodeFirstInputConnectorEditPart.VISUAL_ID:
			return getMergeNodeFirstInputConnector_3014OutgoingLinks(view);
		case MergeNodeSecondInputConnectorEditPart.VISUAL_ID:
			return getMergeNodeSecondInputConnector_3015OutgoingLinks(view);
		case MergeNodeOutputConnectorEditPart.VISUAL_ID:
			return getMergeNodeOutputConnector_3016OutgoingLinks(view);
		case SequencesEditPart.VISUAL_ID:
			return getSequences_3614OutgoingLinks(view);
		case MediatorFlow5EditPart.VISUAL_ID:
			return getMediatorFlow_3615OutgoingLinks(view);
		case SequencesInputConnectorEditPart.VISUAL_ID:
			return getSequencesInputConnector_3616OutgoingLinks(view);
		case SequencesOutputConnectorEditPart.VISUAL_ID:
			return getSequencesOutputConnector_3617OutgoingLinks(view);
		case EsbLinkEditPart.VISUAL_ID:
			return getEsbLink_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getEsbDiagram_1000ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getEsbServer_2001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getProxyService_3001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getProxyOutputConnector_3002ContainedLinks(View view) {
		ProxyOutputConnector modelElement = (ProxyOutputConnector) view.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getProxyInputConnector_3003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getProxyFaultInputConnector_3489ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getProxyServiceContainer_3486ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getProxyServiceSequenceAndEndpointContainer_3487ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getMediatorFlow_3608ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getDropMediator_3491ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getMessageMediator_3045ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getMessageInputConnector_3046ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getMessageOutputConnector_3047ContainedLinks(View view) {
		MessageOutputConnector modelElement = (MessageOutputConnector) view.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getDropMediatorInputConnector_3008ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getPropertyMediator_3492ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getFilterMediatorInputConnector_3010ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getFilterMediatorOutputConnector_3534ContainedLinks(
			View view) {
		FilterMediatorOutputConnector modelElement = (FilterMediatorOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getFilterMediatorPassOutputConnector_3011ContainedLinks(
			View view) {
		FilterMediatorPassOutputConnector modelElement = (FilterMediatorPassOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getFilterMediatorFailOutputConnector_3012ContainedLinks(
			View view) {
		FilterMediatorFailOutputConnector modelElement = (FilterMediatorFailOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getFilterContainer_3531ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getFilterPassContainer_3535ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getMediatorFlow_3536ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getLogMediator_3495ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getMergeNode_3013ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getMergeNodeFirstInputConnector_3014ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getMergeNodeSecondInputConnector_3015ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getMergeNodeOutputConnector_3016ContainedLinks(View view) {
		MergeNodeOutputConnector modelElement = (MergeNodeOutputConnector) view.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSequences_3614ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getMediatorFlow_3615ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSequencesInputConnector_3616ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSequencesOutputConnector_3617ContainedLinks(View view) {
		SequencesOutputConnector modelElement = (SequencesOutputConnector) view.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getLogMediatorInputConnector_3018ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getLogMediatorOutputConnector_3019ContainedLinks(View view) {
		LogMediatorOutputConnector modelElement = (LogMediatorOutputConnector) view.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getEnrichMediator_3496ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getPropertyMediatorInputConnector_3033ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getPropertyMediatorOutputConnector_3034ContainedLinks(
			View view) {
		PropertyMediatorOutputConnector modelElement = (PropertyMediatorOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getThrottleMediator_3493ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getEnrichMediatorInputConnector_3036ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getEnrichMediatorOutputConnector_3037ContainedLinks(
			View view) {
		EnrichMediatorOutputConnector modelElement = (EnrichMediatorOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getXSLTMediator_3497ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getXSLTMediatorInputConnector_3039ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getXSLTMediatorOutputConnector_3040ContainedLinks(
			View view) {
		XSLTMediatorOutputConnector modelElement = (XSLTMediatorOutputConnector) view.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSwitchMediator_3498ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSwitchMediatorInputConnector_3042ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSwitchCaseBranchOutputConnector_3043ContainedLinks(
			View view) {
		SwitchCaseBranchOutputConnector modelElement = (SwitchCaseBranchOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSwitchDefaultBranchOutputConnector_3044ContainedLinks(
			View view) {
		SwitchDefaultBranchOutputConnector modelElement = (SwitchDefaultBranchOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSwitchMediatorOutputConnector_3499ContainedLinks(
			View view) {
		SwitchMediatorOutputConnector modelElement = (SwitchMediatorOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSwitchMediatorContainer_3500ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSwitchCaseContainer_3501ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getMediatorFlow_3502ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSequence_3503ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSequenceInputConnector_3049ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSequenceOutputConnector_3050ContainedLinks(View view) {
		SequenceOutputConnector modelElement = (SequenceOutputConnector) view.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getEventMediator_3504ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getEventMediatorInputConnector_3052ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getEventMediatorOutputConnector_3053ContainedLinks(
			View view) {
		EventMediatorOutputConnector modelElement = (EventMediatorOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getEntitlementMediator_3505ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getEntitlementMediatorInputConnector_3055ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getEntitlementMediatorOutputConnector_3056ContainedLinks(
			View view) {
		EntitlementMediatorOutputConnector modelElement = (EntitlementMediatorOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getClassMediator_3506ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getClassMediatorInputConnector_3058ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getClassMediatorOutputConnector_3059ContainedLinks(
			View view) {
		ClassMediatorOutputConnector modelElement = (ClassMediatorOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSpringMediator_3507ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSpringMediatorInputConnector_3061ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSpringMediatorOutputConnector_3062ContainedLinks(
			View view) {
		SpringMediatorOutputConnector modelElement = (SpringMediatorOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getScriptMediator_3508ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getScriptMediatorInputConnector_3064ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getScriptMediatorOutputConnector_3065ContainedLinks(
			View view) {
		ScriptMediatorOutputConnector modelElement = (ScriptMediatorOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getFaultMediator_3509ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getFaultMediatorInputConnector_3067ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getFaultMediatorOutputConnector_3068ContainedLinks(
			View view) {
		FaultMediatorOutputConnector modelElement = (FaultMediatorOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getXQueryMediator_3510ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getXQueryMediatorInputConnector_3070ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getXQueryMediatorOutputConnector_3071ContainedLinks(
			View view) {
		XQueryMediatorOutputConnector modelElement = (XQueryMediatorOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCommandMediator_3511ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCommandMediatorInputConnector_3073ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCommandMediatorOutputConnector_3074ContainedLinks(
			View view) {
		CommandMediatorOutputConnector modelElement = (CommandMediatorOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getDBLookupMediator_3512ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getDBLookupMediatorInputConnector_3076ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getDBLookupMediatorOutputConnector_3077ContainedLinks(
			View view) {
		DBLookupMediatorOutputConnector modelElement = (DBLookupMediatorOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getDBReportMediator_3513ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getDBReportMediatorInputConnector_3079ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getDBReportMediatorOutputConnector_3080ContainedLinks(
			View view) {
		DBReportMediatorOutputConnector modelElement = (DBReportMediatorOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSmooksMediator_3514ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSmooksMediatorInputConnector_3082ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSmooksMediatorOutputConnector_3083ContainedLinks(
			View view) {
		SmooksMediatorOutputConnector modelElement = (SmooksMediatorOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSendMediator_3515ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSendMediatorInputConnector_3085ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSendMediatorOutputConnector_3086ContainedLinks(
			View view) {
		SendMediatorOutputConnector modelElement = (SendMediatorOutputConnector) view.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSendMediatorEndpointOutputConnector_3539ContainedLinks(
			View view) {
		SendMediatorEndpointOutputConnector modelElement = (SendMediatorEndpointOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getEndpointFlow_3562ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getHeaderMediator_3516ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getFailoverEndPointInputConnector_3088ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getFailoverEndPointOutputConnector_3090ContainedLinks(
			View view) {
		FailoverEndPointOutputConnector modelElement = (FailoverEndPointOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getFailoverEndPointWestOutputConnector_3097ContainedLinks(
			View view) {
		FailoverEndPointWestOutputConnector modelElement = (FailoverEndPointWestOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getWSDLEndPoint_3612ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getWSDLEndPointInputConnector_3092ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getWSDLEndPointOutputConnector_3093ContainedLinks(
			View view) {
		WSDLEndPointOutputConnector modelElement = (WSDLEndPointOutputConnector) view.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getLoadBalanceEndPoint_3613ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getLoadBalanceEndPointInputConnector_3095ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getLoadBalanceEndPointOutputConnector_3096ContainedLinks(
			View view) {
		LoadBalanceEndPointOutputConnector modelElement = (LoadBalanceEndPointOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getLoadBalanceEndPointWestOutputConnector_3098ContainedLinks(
			View view) {
		LoadBalanceEndPointWestOutputConnector modelElement = (LoadBalanceEndPointWestOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getProxyServiceFaultContainer_3488ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getMediatorFlow_3530ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getHeaderMediatorInputConnector_3100ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getHeaderMediatorOutputConnector_3101ContainedLinks(
			View view) {
		HeaderMediatorOutputConnector modelElement = (HeaderMediatorOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCloneMediator_3517ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCloneMediatorInputConnector_3103ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCloneMediatorOutputConnector_3104ContainedLinks(
			View view) {
		CloneMediatorOutputConnector modelElement = (CloneMediatorOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCloneMediatorTargetOutputConnector_3133ContainedLinks(
			View view) {
		CloneMediatorTargetOutputConnector modelElement = (CloneMediatorTargetOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCloneMediatorContainer_3603ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCloneTargetContainer_3604ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getMediatorFlow_3605ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCacheMediator_3518ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCacheMediatorInputConnector_3106ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCacheMediatorOutputConnector_3107ContainedLinks(
			View view) {
		CacheMediatorOutputConnector modelElement = (CacheMediatorOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getIterateMediator_3519ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getIterateMediatorInputConnector_3109ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getIterateMediatorOutputConnector_3110ContainedLinks(
			View view) {
		IterateMediatorOutputConnector modelElement = (IterateMediatorOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getIterateMediatorTargetOutputConnector_3606ContainedLinks(
			View view) {
		IterateMediatorTargetOutputConnector modelElement = (IterateMediatorTargetOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getMediatorFlow_3607ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCalloutMediator_3520ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getAggregateMediatorInputConnector_3112ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getAggregateMediatorOutputConnector_3113ContainedLinks(
			View view) {
		AggregateMediatorOutputConnector modelElement = (AggregateMediatorOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getAggregateMediatorOnCompleteOutputConnector_3132ContainedLinks(
			View view) {
		AggregateMediatorOnCompleteOutputConnector modelElement = (AggregateMediatorOnCompleteOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getMediatorFlow_3526ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getStoreMediator_3588ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getStoreMediatorInputConnector_3589ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getStoreMediatorOutputConnector_3590ContainedLinks(
			View view) {
		StoreMediatorOutputConnector modelElement = (StoreMediatorOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getBuilderMediator_3591ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getBuilderMediatorInputConnector_3592ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getBuilderMediatorOutputConector_3593ContainedLinks(
			View view) {
		BuilderMediatorOutputConector modelElement = (BuilderMediatorOutputConector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCallTemplateMediator_3594ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCallTemplateMediatorInputConnector_3595ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCallTemplateMediatorOutputConnector_3596ContainedLinks(
			View view) {
		CallTemplateMediatorOutputConnector modelElement = (CallTemplateMediatorOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getPayloadFactoryMediator_3597ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getPayloadFactoryMediatorInputConnector_3598ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getPayloadFactoryMediatorOutputConnector_3599ContainedLinks(
			View view) {
		PayloadFactoryMediatorOutputConnector modelElement = (PayloadFactoryMediatorOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getEnqueueMediator_3600ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getEnqueueMediatorInputConnector_3601ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getEnqueueMediatorOutputConnector_3602ContainedLinks(
			View view) {
		EnqueueMediatorOutputConnector modelElement = (EnqueueMediatorOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getDefaultEndPoint_3609ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSwitchDefaultContainer_3527ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getMediatorFlow_3528ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getFilterFailContainer_3537ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getMediatorFlow_3538ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getThrottleOnRejectContainer_3586ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getMediatorFlow_3587ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCalloutMediatorInputConnector_3115ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCalloutMediatorOutputConnector_3116ContainedLinks(
			View view) {
		CalloutMediatorOutputConnector modelElement = (CalloutMediatorOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getTransactionMediator_3521ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getTransactionMediatorInputConnector_3118ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getTransactionMediatorOutputConnector_3119ContainedLinks(
			View view) {
		TransactionMediatorOutputConnector modelElement = (TransactionMediatorOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getRMSequenceMediator_3522ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getThrottleMediatorInputConnector_3121ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getThrottleMediatorOutputConnector_3122ContainedLinks(
			View view) {
		ThrottleMediatorOutputConnector modelElement = (ThrottleMediatorOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getThrottleMediatorOnAcceptOutputConnector_3581ContainedLinks(
			View view) {
		ThrottleMediatorOnAcceptOutputConnector modelElement = (ThrottleMediatorOnAcceptOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getThrottleMediatorOnRejectOutputConnector_3582ContainedLinks(
			View view) {
		ThrottleMediatorOnRejectOutputConnector modelElement = (ThrottleMediatorOnRejectOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getThrottleContainer_3583ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getThrottleOnAcceptContainer_3584ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getMediatorFlow_3585ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getFilterMediator_3494ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getRMSequenceMediatorInputConnector_3124ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getRMSequenceMediatorOutputConnector_3125ContainedLinks(
			View view) {
		RMSequenceMediatorOutputConnector modelElement = (RMSequenceMediatorOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getRuleMediator_3523ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getRuleMediatorInputConnector_3127ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getRuleMediatorOutputConnector_3128ContainedLinks(
			View view) {
		RuleMediatorOutputConnector modelElement = (RuleMediatorOutputConnector) view.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getOAuthMediator_3524ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getOAuthMediatorInputConnector_3130ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getOAuthMediatorOutputConnector_3131ContainedLinks(
			View view) {
		OAuthMediatorOutputConnector modelElement = (OAuthMediatorOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getAggregateMediator_3525ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getDefaultEndPointInputConnector_3021ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getDefaultEndPointOutputConnector_3022ContainedLinks(
			View view) {
		DefaultEndPointOutputConnector modelElement = (DefaultEndPointOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getAddressEndPoint_3610ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getAddressEndPointInputConnector_3030ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getAddressEndPointOutputConnector_3031ContainedLinks(
			View view) {
		AddressEndPointOutputConnector modelElement = (AddressEndPointOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getFailoverEndPoint_3611ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getEsbLink_4001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getEsbServer_2001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getProxyService_3001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getProxyOutputConnector_3002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getProxyInputConnector_3003IncomingLinks(View view) {
		ProxyInputConnector modelElement = (ProxyInputConnector) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getProxyFaultInputConnector_3489IncomingLinks(View view) {
		ProxyFaultInputConnector modelElement = (ProxyFaultInputConnector) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getProxyServiceContainer_3486IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getProxyServiceSequenceAndEndpointContainer_3487IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getMediatorFlow_3608IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getDropMediator_3491IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getMessageMediator_3045IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getMessageInputConnector_3046IncomingLinks(View view) {
		MessageInputConnector modelElement = (MessageInputConnector) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getMessageOutputConnector_3047IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getDropMediatorInputConnector_3008IncomingLinks(View view) {
		DropMediatorInputConnector modelElement = (DropMediatorInputConnector) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getPropertyMediator_3492IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getFilterMediatorInputConnector_3010IncomingLinks(
			View view) {
		FilterMediatorInputConnector modelElement = (FilterMediatorInputConnector) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getFilterMediatorOutputConnector_3534IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getFilterMediatorPassOutputConnector_3011IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getFilterMediatorFailOutputConnector_3012IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getFilterContainer_3531IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getFilterPassContainer_3535IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getMediatorFlow_3536IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getLogMediator_3495IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getMergeNode_3013IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getMergeNodeFirstInputConnector_3014IncomingLinks(
			View view) {
		MergeNodeFirstInputConnector modelElement = (MergeNodeFirstInputConnector) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getMergeNodeSecondInputConnector_3015IncomingLinks(
			View view) {
		MergeNodeSecondInputConnector modelElement = (MergeNodeSecondInputConnector) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getMergeNodeOutputConnector_3016IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSequences_3614IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getMediatorFlow_3615IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSequencesInputConnector_3616IncomingLinks(View view) {
		SequencesInputConnector modelElement = (SequencesInputConnector) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSequencesOutputConnector_3617IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getLogMediatorInputConnector_3018IncomingLinks(View view) {
		LogMediatorInputConnector modelElement = (LogMediatorInputConnector) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getLogMediatorOutputConnector_3019IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getEnrichMediator_3496IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getPropertyMediatorInputConnector_3033IncomingLinks(
			View view) {
		PropertyMediatorInputConnector modelElement = (PropertyMediatorInputConnector) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getPropertyMediatorOutputConnector_3034IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getThrottleMediator_3493IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getEnrichMediatorInputConnector_3036IncomingLinks(
			View view) {
		EnrichMediatorInputConnector modelElement = (EnrichMediatorInputConnector) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getEnrichMediatorOutputConnector_3037IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getXSLTMediator_3497IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getXSLTMediatorInputConnector_3039IncomingLinks(View view) {
		XSLTMediatorInputConnector modelElement = (XSLTMediatorInputConnector) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getXSLTMediatorOutputConnector_3040IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSwitchMediator_3498IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSwitchMediatorInputConnector_3042IncomingLinks(
			View view) {
		SwitchMediatorInputConnector modelElement = (SwitchMediatorInputConnector) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSwitchCaseBranchOutputConnector_3043IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSwitchDefaultBranchOutputConnector_3044IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSwitchMediatorOutputConnector_3499IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSwitchMediatorContainer_3500IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSwitchCaseContainer_3501IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getMediatorFlow_3502IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSequence_3503IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSequenceInputConnector_3049IncomingLinks(View view) {
		SequenceInputConnector modelElement = (SequenceInputConnector) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSequenceOutputConnector_3050IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getEventMediator_3504IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getEventMediatorInputConnector_3052IncomingLinks(View view) {
		EventMediatorInputConnector modelElement = (EventMediatorInputConnector) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getEventMediatorOutputConnector_3053IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getEntitlementMediator_3505IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getEntitlementMediatorInputConnector_3055IncomingLinks(
			View view) {
		EntitlementMediatorInputConnector modelElement = (EntitlementMediatorInputConnector) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getEntitlementMediatorOutputConnector_3056IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getClassMediator_3506IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getClassMediatorInputConnector_3058IncomingLinks(View view) {
		ClassMediatorInputConnector modelElement = (ClassMediatorInputConnector) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getClassMediatorOutputConnector_3059IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSpringMediator_3507IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSpringMediatorInputConnector_3061IncomingLinks(
			View view) {
		SpringMediatorInputConnector modelElement = (SpringMediatorInputConnector) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSpringMediatorOutputConnector_3062IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getScriptMediator_3508IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getScriptMediatorInputConnector_3064IncomingLinks(
			View view) {
		ScriptMediatorInputConnector modelElement = (ScriptMediatorInputConnector) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getScriptMediatorOutputConnector_3065IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getFaultMediator_3509IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getFaultMediatorInputConnector_3067IncomingLinks(View view) {
		FaultMediatorInputConnector modelElement = (FaultMediatorInputConnector) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getFaultMediatorOutputConnector_3068IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getXQueryMediator_3510IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getXQueryMediatorInputConnector_3070IncomingLinks(
			View view) {
		XQueryMediatorInputConnector modelElement = (XQueryMediatorInputConnector) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getXQueryMediatorOutputConnector_3071IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCommandMediator_3511IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCommandMediatorInputConnector_3073IncomingLinks(
			View view) {
		CommandMediatorInputConnector modelElement = (CommandMediatorInputConnector) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCommandMediatorOutputConnector_3074IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getDBLookupMediator_3512IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getDBLookupMediatorInputConnector_3076IncomingLinks(
			View view) {
		DBLookupMediatorInputConnector modelElement = (DBLookupMediatorInputConnector) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getDBLookupMediatorOutputConnector_3077IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getDBReportMediator_3513IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getDBReportMediatorInputConnector_3079IncomingLinks(
			View view) {
		DBReportMediatorInputConnector modelElement = (DBReportMediatorInputConnector) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getDBReportMediatorOutputConnector_3080IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSmooksMediator_3514IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSmooksMediatorInputConnector_3082IncomingLinks(
			View view) {
		SmooksMediatorInputConnector modelElement = (SmooksMediatorInputConnector) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSmooksMediatorOutputConnector_3083IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSendMediator_3515IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSendMediatorInputConnector_3085IncomingLinks(View view) {
		SendMediatorInputConnector modelElement = (SendMediatorInputConnector) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSendMediatorOutputConnector_3086IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSendMediatorEndpointOutputConnector_3539IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getEndpointFlow_3562IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getHeaderMediator_3516IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getFailoverEndPointInputConnector_3088IncomingLinks(
			View view) {
		FailoverEndPointInputConnector modelElement = (FailoverEndPointInputConnector) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getFailoverEndPointOutputConnector_3090IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getFailoverEndPointWestOutputConnector_3097IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getWSDLEndPoint_3612IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getWSDLEndPointInputConnector_3092IncomingLinks(View view) {
		WSDLEndPointInputConnector modelElement = (WSDLEndPointInputConnector) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getWSDLEndPointOutputConnector_3093IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getLoadBalanceEndPoint_3613IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getLoadBalanceEndPointInputConnector_3095IncomingLinks(
			View view) {
		LoadBalanceEndPointInputConnector modelElement = (LoadBalanceEndPointInputConnector) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getLoadBalanceEndPointOutputConnector_3096IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getLoadBalanceEndPointWestOutputConnector_3098IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getProxyServiceFaultContainer_3488IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getMediatorFlow_3530IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getHeaderMediatorInputConnector_3100IncomingLinks(
			View view) {
		HeaderMediatorInputConnector modelElement = (HeaderMediatorInputConnector) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getHeaderMediatorOutputConnector_3101IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCloneMediator_3517IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCloneMediatorInputConnector_3103IncomingLinks(View view) {
		CloneMediatorInputConnector modelElement = (CloneMediatorInputConnector) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCloneMediatorOutputConnector_3104IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCloneMediatorTargetOutputConnector_3133IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCloneMediatorContainer_3603IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCloneTargetContainer_3604IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getMediatorFlow_3605IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCacheMediator_3518IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCacheMediatorInputConnector_3106IncomingLinks(View view) {
		CacheMediatorInputConnector modelElement = (CacheMediatorInputConnector) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCacheMediatorOutputConnector_3107IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getIterateMediator_3519IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getIterateMediatorInputConnector_3109IncomingLinks(
			View view) {
		IterateMediatorInputConnector modelElement = (IterateMediatorInputConnector) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getIterateMediatorOutputConnector_3110IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getIterateMediatorTargetOutputConnector_3606IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getMediatorFlow_3607IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCalloutMediator_3520IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getAggregateMediatorInputConnector_3112IncomingLinks(
			View view) {
		AggregateMediatorInputConnector modelElement = (AggregateMediatorInputConnector) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getAggregateMediatorOutputConnector_3113IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getAggregateMediatorOnCompleteOutputConnector_3132IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getMediatorFlow_3526IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getStoreMediator_3588IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getStoreMediatorInputConnector_3589IncomingLinks(View view) {
		StoreMediatorInputConnector modelElement = (StoreMediatorInputConnector) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getStoreMediatorOutputConnector_3590IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getBuilderMediator_3591IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getBuilderMediatorInputConnector_3592IncomingLinks(
			View view) {
		BuilderMediatorInputConnector modelElement = (BuilderMediatorInputConnector) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getBuilderMediatorOutputConector_3593IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCallTemplateMediator_3594IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCallTemplateMediatorInputConnector_3595IncomingLinks(
			View view) {
		CallTemplateMediatorInputConnector modelElement = (CallTemplateMediatorInputConnector) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCallTemplateMediatorOutputConnector_3596IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getPayloadFactoryMediator_3597IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getPayloadFactoryMediatorInputConnector_3598IncomingLinks(
			View view) {
		PayloadFactoryMediatorInputConnector modelElement = (PayloadFactoryMediatorInputConnector) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getPayloadFactoryMediatorOutputConnector_3599IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getEnqueueMediator_3600IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getEnqueueMediatorInputConnector_3601IncomingLinks(
			View view) {
		EnqueueMediatorInputConnector modelElement = (EnqueueMediatorInputConnector) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getEnqueueMediatorOutputConnector_3602IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getDefaultEndPoint_3609IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSwitchDefaultContainer_3527IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getMediatorFlow_3528IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getFilterFailContainer_3537IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getMediatorFlow_3538IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getThrottleOnRejectContainer_3586IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getMediatorFlow_3587IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCalloutMediatorInputConnector_3115IncomingLinks(
			View view) {
		CalloutMediatorInputConnector modelElement = (CalloutMediatorInputConnector) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCalloutMediatorOutputConnector_3116IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getTransactionMediator_3521IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getTransactionMediatorInputConnector_3118IncomingLinks(
			View view) {
		TransactionMediatorInputConnector modelElement = (TransactionMediatorInputConnector) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getTransactionMediatorOutputConnector_3119IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getRMSequenceMediator_3522IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getThrottleMediatorInputConnector_3121IncomingLinks(
			View view) {
		ThrottleMediatorInputConnector modelElement = (ThrottleMediatorInputConnector) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getThrottleMediatorOutputConnector_3122IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getThrottleMediatorOnAcceptOutputConnector_3581IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getThrottleMediatorOnRejectOutputConnector_3582IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getThrottleContainer_3583IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getThrottleOnAcceptContainer_3584IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getMediatorFlow_3585IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getFilterMediator_3494IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getRMSequenceMediatorInputConnector_3124IncomingLinks(
			View view) {
		RMSequenceMediatorInputConnector modelElement = (RMSequenceMediatorInputConnector) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getRMSequenceMediatorOutputConnector_3125IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getRuleMediator_3523IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getRuleMediatorInputConnector_3127IncomingLinks(View view) {
		RuleMediatorInputConnector modelElement = (RuleMediatorInputConnector) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getRuleMediatorOutputConnector_3128IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getOAuthMediator_3524IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getOAuthMediatorInputConnector_3130IncomingLinks(View view) {
		OAuthMediatorInputConnector modelElement = (OAuthMediatorInputConnector) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getOAuthMediatorOutputConnector_3131IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getAggregateMediator_3525IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getDefaultEndPointInputConnector_3021IncomingLinks(
			View view) {
		DefaultEndPointInputConnector modelElement = (DefaultEndPointInputConnector) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getDefaultEndPointOutputConnector_3022IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getAddressEndPoint_3610IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getAddressEndPointInputConnector_3030IncomingLinks(
			View view) {
		AddressEndPointInputConnector modelElement = (AddressEndPointInputConnector) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getAddressEndPointOutputConnector_3031IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getFailoverEndPoint_3611IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getEsbLink_4001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getEsbServer_2001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getProxyService_3001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getProxyOutputConnector_3002OutgoingLinks(View view) {
		ProxyOutputConnector modelElement = (ProxyOutputConnector) view.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getProxyInputConnector_3003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getProxyFaultInputConnector_3489OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getProxyServiceContainer_3486OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getProxyServiceSequenceAndEndpointContainer_3487OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getMediatorFlow_3608OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getDropMediator_3491OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getMessageMediator_3045OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getMessageInputConnector_3046OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getMessageOutputConnector_3047OutgoingLinks(View view) {
		MessageOutputConnector modelElement = (MessageOutputConnector) view.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getDropMediatorInputConnector_3008OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getPropertyMediator_3492OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getFilterMediatorInputConnector_3010OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getFilterMediatorOutputConnector_3534OutgoingLinks(
			View view) {
		FilterMediatorOutputConnector modelElement = (FilterMediatorOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getFilterMediatorPassOutputConnector_3011OutgoingLinks(
			View view) {
		FilterMediatorPassOutputConnector modelElement = (FilterMediatorPassOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getFilterMediatorFailOutputConnector_3012OutgoingLinks(
			View view) {
		FilterMediatorFailOutputConnector modelElement = (FilterMediatorFailOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getFilterContainer_3531OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getFilterPassContainer_3535OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getMediatorFlow_3536OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getLogMediator_3495OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getMergeNode_3013OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getMergeNodeFirstInputConnector_3014OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getMergeNodeSecondInputConnector_3015OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getMergeNodeOutputConnector_3016OutgoingLinks(View view) {
		MergeNodeOutputConnector modelElement = (MergeNodeOutputConnector) view.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSequences_3614OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getMediatorFlow_3615OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSequencesInputConnector_3616OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSequencesOutputConnector_3617OutgoingLinks(View view) {
		SequencesOutputConnector modelElement = (SequencesOutputConnector) view.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getLogMediatorInputConnector_3018OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getLogMediatorOutputConnector_3019OutgoingLinks(View view) {
		LogMediatorOutputConnector modelElement = (LogMediatorOutputConnector) view.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getEnrichMediator_3496OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getPropertyMediatorInputConnector_3033OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getPropertyMediatorOutputConnector_3034OutgoingLinks(
			View view) {
		PropertyMediatorOutputConnector modelElement = (PropertyMediatorOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getThrottleMediator_3493OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getEnrichMediatorInputConnector_3036OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getEnrichMediatorOutputConnector_3037OutgoingLinks(
			View view) {
		EnrichMediatorOutputConnector modelElement = (EnrichMediatorOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getXSLTMediator_3497OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getXSLTMediatorInputConnector_3039OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getXSLTMediatorOutputConnector_3040OutgoingLinks(View view) {
		XSLTMediatorOutputConnector modelElement = (XSLTMediatorOutputConnector) view.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSwitchMediator_3498OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSwitchMediatorInputConnector_3042OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSwitchCaseBranchOutputConnector_3043OutgoingLinks(
			View view) {
		SwitchCaseBranchOutputConnector modelElement = (SwitchCaseBranchOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSwitchDefaultBranchOutputConnector_3044OutgoingLinks(
			View view) {
		SwitchDefaultBranchOutputConnector modelElement = (SwitchDefaultBranchOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSwitchMediatorOutputConnector_3499OutgoingLinks(
			View view) {
		SwitchMediatorOutputConnector modelElement = (SwitchMediatorOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSwitchMediatorContainer_3500OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSwitchCaseContainer_3501OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getMediatorFlow_3502OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSequence_3503OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSequenceInputConnector_3049OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSequenceOutputConnector_3050OutgoingLinks(View view) {
		SequenceOutputConnector modelElement = (SequenceOutputConnector) view.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getEventMediator_3504OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getEventMediatorInputConnector_3052OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getEventMediatorOutputConnector_3053OutgoingLinks(
			View view) {
		EventMediatorOutputConnector modelElement = (EventMediatorOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getEntitlementMediator_3505OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getEntitlementMediatorInputConnector_3055OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getEntitlementMediatorOutputConnector_3056OutgoingLinks(
			View view) {
		EntitlementMediatorOutputConnector modelElement = (EntitlementMediatorOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getClassMediator_3506OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getClassMediatorInputConnector_3058OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getClassMediatorOutputConnector_3059OutgoingLinks(
			View view) {
		ClassMediatorOutputConnector modelElement = (ClassMediatorOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSpringMediator_3507OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSpringMediatorInputConnector_3061OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSpringMediatorOutputConnector_3062OutgoingLinks(
			View view) {
		SpringMediatorOutputConnector modelElement = (SpringMediatorOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getScriptMediator_3508OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getScriptMediatorInputConnector_3064OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getScriptMediatorOutputConnector_3065OutgoingLinks(
			View view) {
		ScriptMediatorOutputConnector modelElement = (ScriptMediatorOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getFaultMediator_3509OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getFaultMediatorInputConnector_3067OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getFaultMediatorOutputConnector_3068OutgoingLinks(
			View view) {
		FaultMediatorOutputConnector modelElement = (FaultMediatorOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getXQueryMediator_3510OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getXQueryMediatorInputConnector_3070OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getXQueryMediatorOutputConnector_3071OutgoingLinks(
			View view) {
		XQueryMediatorOutputConnector modelElement = (XQueryMediatorOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCommandMediator_3511OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCommandMediatorInputConnector_3073OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCommandMediatorOutputConnector_3074OutgoingLinks(
			View view) {
		CommandMediatorOutputConnector modelElement = (CommandMediatorOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getDBLookupMediator_3512OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getDBLookupMediatorInputConnector_3076OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getDBLookupMediatorOutputConnector_3077OutgoingLinks(
			View view) {
		DBLookupMediatorOutputConnector modelElement = (DBLookupMediatorOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getDBReportMediator_3513OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getDBReportMediatorInputConnector_3079OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getDBReportMediatorOutputConnector_3080OutgoingLinks(
			View view) {
		DBReportMediatorOutputConnector modelElement = (DBReportMediatorOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSmooksMediator_3514OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSmooksMediatorInputConnector_3082OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSmooksMediatorOutputConnector_3083OutgoingLinks(
			View view) {
		SmooksMediatorOutputConnector modelElement = (SmooksMediatorOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSendMediator_3515OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSendMediatorInputConnector_3085OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSendMediatorOutputConnector_3086OutgoingLinks(View view) {
		SendMediatorOutputConnector modelElement = (SendMediatorOutputConnector) view.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSendMediatorEndpointOutputConnector_3539OutgoingLinks(
			View view) {
		SendMediatorEndpointOutputConnector modelElement = (SendMediatorEndpointOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getEndpointFlow_3562OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getHeaderMediator_3516OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getFailoverEndPointInputConnector_3088OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getFailoverEndPointOutputConnector_3090OutgoingLinks(
			View view) {
		FailoverEndPointOutputConnector modelElement = (FailoverEndPointOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getFailoverEndPointWestOutputConnector_3097OutgoingLinks(
			View view) {
		FailoverEndPointWestOutputConnector modelElement = (FailoverEndPointWestOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getWSDLEndPoint_3612OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getWSDLEndPointInputConnector_3092OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getWSDLEndPointOutputConnector_3093OutgoingLinks(View view) {
		WSDLEndPointOutputConnector modelElement = (WSDLEndPointOutputConnector) view.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getLoadBalanceEndPoint_3613OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getLoadBalanceEndPointInputConnector_3095OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getLoadBalanceEndPointOutputConnector_3096OutgoingLinks(
			View view) {
		LoadBalanceEndPointOutputConnector modelElement = (LoadBalanceEndPointOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getLoadBalanceEndPointWestOutputConnector_3098OutgoingLinks(
			View view) {
		LoadBalanceEndPointWestOutputConnector modelElement = (LoadBalanceEndPointWestOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getProxyServiceFaultContainer_3488OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getMediatorFlow_3530OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getHeaderMediatorInputConnector_3100OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getHeaderMediatorOutputConnector_3101OutgoingLinks(
			View view) {
		HeaderMediatorOutputConnector modelElement = (HeaderMediatorOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCloneMediator_3517OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCloneMediatorInputConnector_3103OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCloneMediatorOutputConnector_3104OutgoingLinks(
			View view) {
		CloneMediatorOutputConnector modelElement = (CloneMediatorOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCloneMediatorTargetOutputConnector_3133OutgoingLinks(
			View view) {
		CloneMediatorTargetOutputConnector modelElement = (CloneMediatorTargetOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCloneMediatorContainer_3603OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCloneTargetContainer_3604OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getMediatorFlow_3605OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCacheMediator_3518OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCacheMediatorInputConnector_3106OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCacheMediatorOutputConnector_3107OutgoingLinks(
			View view) {
		CacheMediatorOutputConnector modelElement = (CacheMediatorOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getIterateMediator_3519OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getIterateMediatorInputConnector_3109OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getIterateMediatorOutputConnector_3110OutgoingLinks(
			View view) {
		IterateMediatorOutputConnector modelElement = (IterateMediatorOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getIterateMediatorTargetOutputConnector_3606OutgoingLinks(
			View view) {
		IterateMediatorTargetOutputConnector modelElement = (IterateMediatorTargetOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getMediatorFlow_3607OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCalloutMediator_3520OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getAggregateMediatorInputConnector_3112OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getAggregateMediatorOutputConnector_3113OutgoingLinks(
			View view) {
		AggregateMediatorOutputConnector modelElement = (AggregateMediatorOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getAggregateMediatorOnCompleteOutputConnector_3132OutgoingLinks(
			View view) {
		AggregateMediatorOnCompleteOutputConnector modelElement = (AggregateMediatorOnCompleteOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getMediatorFlow_3526OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getStoreMediator_3588OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getStoreMediatorInputConnector_3589OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getStoreMediatorOutputConnector_3590OutgoingLinks(
			View view) {
		StoreMediatorOutputConnector modelElement = (StoreMediatorOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getBuilderMediator_3591OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getBuilderMediatorInputConnector_3592OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getBuilderMediatorOutputConector_3593OutgoingLinks(
			View view) {
		BuilderMediatorOutputConector modelElement = (BuilderMediatorOutputConector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCallTemplateMediator_3594OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCallTemplateMediatorInputConnector_3595OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCallTemplateMediatorOutputConnector_3596OutgoingLinks(
			View view) {
		CallTemplateMediatorOutputConnector modelElement = (CallTemplateMediatorOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getPayloadFactoryMediator_3597OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getPayloadFactoryMediatorInputConnector_3598OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getPayloadFactoryMediatorOutputConnector_3599OutgoingLinks(
			View view) {
		PayloadFactoryMediatorOutputConnector modelElement = (PayloadFactoryMediatorOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getEnqueueMediator_3600OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getEnqueueMediatorInputConnector_3601OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getEnqueueMediatorOutputConnector_3602OutgoingLinks(
			View view) {
		EnqueueMediatorOutputConnector modelElement = (EnqueueMediatorOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getDefaultEndPoint_3609OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSwitchDefaultContainer_3527OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getMediatorFlow_3528OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getFilterFailContainer_3537OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getMediatorFlow_3538OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getThrottleOnRejectContainer_3586OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getMediatorFlow_3587OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCalloutMediatorInputConnector_3115OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCalloutMediatorOutputConnector_3116OutgoingLinks(
			View view) {
		CalloutMediatorOutputConnector modelElement = (CalloutMediatorOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getTransactionMediator_3521OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getTransactionMediatorInputConnector_3118OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getTransactionMediatorOutputConnector_3119OutgoingLinks(
			View view) {
		TransactionMediatorOutputConnector modelElement = (TransactionMediatorOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getRMSequenceMediator_3522OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getThrottleMediatorInputConnector_3121OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getThrottleMediatorOutputConnector_3122OutgoingLinks(
			View view) {
		ThrottleMediatorOutputConnector modelElement = (ThrottleMediatorOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getThrottleMediatorOnAcceptOutputConnector_3581OutgoingLinks(
			View view) {
		ThrottleMediatorOnAcceptOutputConnector modelElement = (ThrottleMediatorOnAcceptOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getThrottleMediatorOnRejectOutputConnector_3582OutgoingLinks(
			View view) {
		ThrottleMediatorOnRejectOutputConnector modelElement = (ThrottleMediatorOnRejectOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getThrottleContainer_3583OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getThrottleOnAcceptContainer_3584OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getMediatorFlow_3585OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getFilterMediator_3494OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getRMSequenceMediatorInputConnector_3124OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getRMSequenceMediatorOutputConnector_3125OutgoingLinks(
			View view) {
		RMSequenceMediatorOutputConnector modelElement = (RMSequenceMediatorOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getRuleMediator_3523OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getRuleMediatorInputConnector_3127OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getRuleMediatorOutputConnector_3128OutgoingLinks(View view) {
		RuleMediatorOutputConnector modelElement = (RuleMediatorOutputConnector) view.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getOAuthMediator_3524OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getOAuthMediatorInputConnector_3130OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getOAuthMediatorOutputConnector_3131OutgoingLinks(
			View view) {
		OAuthMediatorOutputConnector modelElement = (OAuthMediatorOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getAggregateMediator_3525OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getDefaultEndPointInputConnector_3021OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getDefaultEndPointOutputConnector_3022OutgoingLinks(
			View view) {
		DefaultEndPointOutputConnector modelElement = (DefaultEndPointOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getAddressEndPoint_3610OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getAddressEndPointInputConnector_3030OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getAddressEndPointOutputConnector_3031OutgoingLinks(
			View view) {
		AddressEndPointOutputConnector modelElement = (AddressEndPointOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getFailoverEndPoint_3611OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getEsbLink_4001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<EsbLinkDescriptor> getContainedTypeModelFacetLinks_EsbLink_4001(
			OutputConnector container) {
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		EsbLink link = container.getOutgoingLink();
		if (EsbLinkEditPart.VISUAL_ID != EsbVisualIDRegistry.getLinkWithClassVisualID(link)) {
			return result;
		}
		InputConnector dst = link.getTarget();
		OutputConnector src = link.getSource();
		result.add(new EsbLinkDescriptor(src, dst, link, EsbElementTypes.EsbLink_4001,
				EsbLinkEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EsbLinkDescriptor> getIncomingTypeModelFacetLinks_EsbLink_4001(
			InputConnector target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != EsbPackage.eINSTANCE.getEsbLink_Target()
					|| false == setting.getEObject() instanceof EsbLink) {
				continue;
			}
			EsbLink link = (EsbLink) setting.getEObject();
			if (EsbLinkEditPart.VISUAL_ID != EsbVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			OutputConnector src = link.getSource();
			result.add(new EsbLinkDescriptor(src, target, link, EsbElementTypes.EsbLink_4001,
					EsbLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EsbLinkDescriptor> getOutgoingTypeModelFacetLinks_EsbLink_4001(
			OutputConnector source) {
		OutputConnector container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof OutputConnector) {
				container = (OutputConnector) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		EsbLink link = container.getOutgoingLink();
		if (EsbLinkEditPart.VISUAL_ID != EsbVisualIDRegistry.getLinkWithClassVisualID(link)) {
			return result;
		}
		InputConnector dst = link.getTarget();
		OutputConnector src = link.getSource();
		if (src != source) {
			return result;
		}
		result.add(new EsbLinkDescriptor(src, dst, link, EsbElementTypes.EsbLink_4001,
				EsbLinkEditPart.VISUAL_ID));
		return result;
	}

}
