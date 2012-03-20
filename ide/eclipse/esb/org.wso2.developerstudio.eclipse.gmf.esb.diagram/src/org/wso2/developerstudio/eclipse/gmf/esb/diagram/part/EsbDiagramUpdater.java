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
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getSemanticChildren(
			View view) {
		switch (EsbVisualIDRegistry.getVisualID(view)) {
		case EsbDiagramEditPart.VISUAL_ID:
			return getEsbDiagram_1000SemanticChildren(view);
		case EsbServerEditPart.VISUAL_ID:
			return getEsbServer_2001SemanticChildren(view);
		case ProxyServiceEditPart.VISUAL_ID:
			return getProxyService_3001SemanticChildren(view);
		case ProxyServiceSequenceContainerEditPart.VISUAL_ID:
			return getProxyServiceSequenceContainer_3196SemanticChildren(view);
		case DropMediator3EditPart.VISUAL_ID:
			return getDropMediator_3191SemanticChildren(view);
		case PropertyMediator3EditPart.VISUAL_ID:
			return getPropertyMediator_3199SemanticChildren(view);
		case ThrottleMediatorEditPart.VISUAL_ID:
			return getThrottleMediator_3205SemanticChildren(view);
		case FilterMediatorEditPart.VISUAL_ID:
			return getFilterMediator_3209SemanticChildren(view);
		case LogMediatorEditPart.VISUAL_ID:
			return getLogMediator_3210SemanticChildren(view);
		case EnrichMediatorEditPart.VISUAL_ID:
			return getEnrichMediator_3387SemanticChildren(view);
		case XSLTMediatorEditPart.VISUAL_ID:
			return getXSLTMediator_3212SemanticChildren(view);
		case SwitchMediatorEditPart.VISUAL_ID:
			return getSwitchMediator_3213SemanticChildren(view);
		case SequenceEditPart.VISUAL_ID:
			return getSequence_3214SemanticChildren(view);
		case EventMediatorEditPart.VISUAL_ID:
			return getEventMediator_3215SemanticChildren(view);
		case EntitlementMediatorEditPart.VISUAL_ID:
			return getEntitlementMediator_3216SemanticChildren(view);
		case ClassMediatorEditPart.VISUAL_ID:
			return getClassMediator_3217SemanticChildren(view);
		case SpringMediatorEditPart.VISUAL_ID:
			return getSpringMediator_3218SemanticChildren(view);
		case ScriptMediatorEditPart.VISUAL_ID:
			return getScriptMediator_3219SemanticChildren(view);
		case FaultMediatorEditPart.VISUAL_ID:
			return getFaultMediator_3220SemanticChildren(view);
		case XQueryMediatorEditPart.VISUAL_ID:
			return getXQueryMediator_3221SemanticChildren(view);
		case CommandMediatorEditPart.VISUAL_ID:
			return getCommandMediator_3222SemanticChildren(view);
		case DBLookupMediatorEditPart.VISUAL_ID:
			return getDBLookupMediator_3223SemanticChildren(view);
		case DBReportMediatorEditPart.VISUAL_ID:
			return getDBReportMediator_3224SemanticChildren(view);
		case SmooksMediatorEditPart.VISUAL_ID:
			return getSmooksMediator_3225SemanticChildren(view);
		case SendMediatorEditPart.VISUAL_ID:
			return getSendMediator_3226SemanticChildren(view);
		case HeaderMediatorEditPart.VISUAL_ID:
			return getHeaderMediator_3227SemanticChildren(view);
		case CloneMediatorEditPart.VISUAL_ID:
			return getCloneMediator_3228SemanticChildren(view);
		case CacheMediatorEditPart.VISUAL_ID:
			return getCacheMediator_3229SemanticChildren(view);
		case IterateMediatorEditPart.VISUAL_ID:
			return getIterateMediator_3230SemanticChildren(view);
		case CalloutMediatorEditPart.VISUAL_ID:
			return getCalloutMediator_3231SemanticChildren(view);
		case TransactionMediatorEditPart.VISUAL_ID:
			return getTransactionMediator_3232SemanticChildren(view);
		case RMSequenceMediatorEditPart.VISUAL_ID:
			return getRMSequenceMediator_3233SemanticChildren(view);
		case RuleMediatorEditPart.VISUAL_ID:
			return getRuleMediator_3234SemanticChildren(view);
		case OAuthMediatorEditPart.VISUAL_ID:
			return getOAuthMediator_3235SemanticChildren(view);
		case AggregateMediatorEditPart.VISUAL_ID:
			return getAggregateMediator_3236SemanticChildren(view);
		case LogMediator2EditPart.VISUAL_ID:
			return getLogMediator_3134SemanticChildren(view);
		case DropMediator2EditPart.VISUAL_ID:
			return getDropMediator_3137SemanticChildren(view);
		case FilterMediator2EditPart.VISUAL_ID:
			return getFilterMediator_3139SemanticChildren(view);
		case PropertyMediator2EditPart.VISUAL_ID:
			return getPropertyMediator_3143SemanticChildren(view);
		case EnrichMediator2EditPart.VISUAL_ID:
			return getEnrichMediator_3146SemanticChildren(view);
		case XSLTMediator2EditPart.VISUAL_ID:
			return getXSLTMediator_3149SemanticChildren(view);
		case SwitchMediator2EditPart.VISUAL_ID:
			return getSwitchMediator_3152SemanticChildren(view);
		case FaultMediator2EditPart.VISUAL_ID:
			return getFaultMediator_3156SemanticChildren(view);
		case DBLookupMediator2EditPart.VISUAL_ID:
			return getDBLookupMediator_3159SemanticChildren(view);
		case DBReportMediator2EditPart.VISUAL_ID:
			return getDBReportMediator_3162SemanticChildren(view);
		case SendMediator2EditPart.VISUAL_ID:
			return getSendMediator_3165SemanticChildren(view);
		case HeaderMediator2EditPart.VISUAL_ID:
			return getHeaderMediator_3168SemanticChildren(view);
		case CloneMediator2EditPart.VISUAL_ID:
			return getCloneMediator_3171SemanticChildren(view);
		case IterateMediator2EditPart.VISUAL_ID:
			return getIterateMediator_3175SemanticChildren(view);
		case CalloutMediator2EditPart.VISUAL_ID:
			return getCalloutMediator_3178SemanticChildren(view);
		case TransactionMediator2EditPart.VISUAL_ID:
			return getTransactionMediator_3179SemanticChildren(view);
		case RMSequenceMediator2EditPart.VISUAL_ID:
			return getRMSequenceMediator_3180SemanticChildren(view);
		case Sequence2EditPart.VISUAL_ID:
			return getSequence_3187SemanticChildren(view);
		case DropMediator4EditPart.VISUAL_ID:
			return getDropMediator_3194SemanticChildren(view);
		case PropertyMediator4EditPart.VISUAL_ID:
			return getPropertyMediator_3200SemanticChildren(view);
		case ThrottleMediator2EditPart.VISUAL_ID:
			return getThrottleMediator_3206SemanticChildren(view);
		case FilterMediator3EditPart.VISUAL_ID:
			return getFilterMediator_3237SemanticChildren(view);
		case LogMediator3EditPart.VISUAL_ID:
			return getLogMediator_3241SemanticChildren(view);
		case EnrichMediator3EditPart.VISUAL_ID:
			return getEnrichMediator_3244SemanticChildren(view);
		case XSLTMediator3EditPart.VISUAL_ID:
			return getXSLTMediator_3247SemanticChildren(view);
		case SwitchMediator3EditPart.VISUAL_ID:
			return getSwitchMediator_3250SemanticChildren(view);
		case Sequence3EditPart.VISUAL_ID:
			return getSequence_3254SemanticChildren(view);
		case EventMediator2EditPart.VISUAL_ID:
			return getEventMediator_3257SemanticChildren(view);
		case EntitlementMediator2EditPart.VISUAL_ID:
			return getEntitlementMediator_3260SemanticChildren(view);
		case ClassMediator2EditPart.VISUAL_ID:
			return getClassMediator_3263SemanticChildren(view);
		case SpringMediator2EditPart.VISUAL_ID:
			return getSpringMediator_3266SemanticChildren(view);
		case ScriptMediator2EditPart.VISUAL_ID:
			return getScriptMediator_3269SemanticChildren(view);
		case FaultMediator3EditPart.VISUAL_ID:
			return getFaultMediator_3272SemanticChildren(view);
		case XQueryMediator2EditPart.VISUAL_ID:
			return getXQueryMediator_3275SemanticChildren(view);
		case CommandMediator2EditPart.VISUAL_ID:
			return getCommandMediator_3278SemanticChildren(view);
		case DBLookupMediator3EditPart.VISUAL_ID:
			return getDBLookupMediator_3281SemanticChildren(view);
		case DBReportMediator3EditPart.VISUAL_ID:
			return getDBReportMediator_3284SemanticChildren(view);
		case SmooksMediator2EditPart.VISUAL_ID:
			return getSmooksMediator_3287SemanticChildren(view);
		case SendMediator3EditPart.VISUAL_ID:
			return getSendMediator_3290SemanticChildren(view);
		case HeaderMediator3EditPart.VISUAL_ID:
			return getHeaderMediator_3293SemanticChildren(view);
		case CloneMediator3EditPart.VISUAL_ID:
			return getCloneMediator_3296SemanticChildren(view);
		case CacheMediator2EditPart.VISUAL_ID:
			return getCacheMediator_3300SemanticChildren(view);
		case IterateMediator3EditPart.VISUAL_ID:
			return getIterateMediator_3303SemanticChildren(view);
		case CalloutMediator3EditPart.VISUAL_ID:
			return getCalloutMediator_3306SemanticChildren(view);
		case TransactionMediator3EditPart.VISUAL_ID:
			return getTransactionMediator_3309SemanticChildren(view);
		case RMSequenceMediator3EditPart.VISUAL_ID:
			return getRMSequenceMediator_3312SemanticChildren(view);
		case RuleMediator2EditPart.VISUAL_ID:
			return getRuleMediator_3315SemanticChildren(view);
		case OAuthMediator2EditPart.VISUAL_ID:
			return getOAuthMediator_3318SemanticChildren(view);
		case AggregateMediator2EditPart.VISUAL_ID:
			return getAggregateMediator_3321SemanticChildren(view);
		case LogMediator4EditPart.VISUAL_ID:
			return getLogMediator_3325SemanticChildren(view);
		case DropMediator5EditPart.VISUAL_ID:
			return getDropMediator_3328SemanticChildren(view);
		case FilterMediator4EditPart.VISUAL_ID:
			return getFilterMediator_3329SemanticChildren(view);
		case PropertyMediator5EditPart.VISUAL_ID:
			return getPropertyMediator_3333SemanticChildren(view);
		case EnrichMediator4EditPart.VISUAL_ID:
			return getEnrichMediator_3334SemanticChildren(view);
		case XSLTMediator4EditPart.VISUAL_ID:
			return getXSLTMediator_3337SemanticChildren(view);
		case SwitchMediator4EditPart.VISUAL_ID:
			return getSwitchMediator_3340SemanticChildren(view);
		case FaultMediator4EditPart.VISUAL_ID:
			return getFaultMediator_3344SemanticChildren(view);
		case DBLookupMediator4EditPart.VISUAL_ID:
			return getDBLookupMediator_3347SemanticChildren(view);
		case DBReportMediator4EditPart.VISUAL_ID:
			return getDBReportMediator_3350SemanticChildren(view);
		case SendMediator4EditPart.VISUAL_ID:
			return getSendMediator_3353SemanticChildren(view);
		case HeaderMediator4EditPart.VISUAL_ID:
			return getHeaderMediator_3356SemanticChildren(view);
		case CloneMediator4EditPart.VISUAL_ID:
			return getCloneMediator_3359SemanticChildren(view);
		case IterateMediator4EditPart.VISUAL_ID:
			return getIterateMediator_3363SemanticChildren(view);
		case CalloutMediator4EditPart.VISUAL_ID:
			return getCalloutMediator_3366SemanticChildren(view);
		case TransactionMediator4EditPart.VISUAL_ID:
			return getTransactionMediator_3369SemanticChildren(view);
		case RMSequenceMediator4EditPart.VISUAL_ID:
			return getRMSequenceMediator_3372SemanticChildren(view);
		case Sequence4EditPart.VISUAL_ID:
			return getSequence_3375SemanticChildren(view);
		case DefaultEndPoint2EditPart.VISUAL_ID:
			return getDefaultEndPoint_3382SemanticChildren(view);
		case AddressEndPoint2EditPart.VISUAL_ID:
			return getAddressEndPoint_3383SemanticChildren(view);
		case FailoverEndPoint2EditPart.VISUAL_ID:
			return getFailoverEndPoint_3384SemanticChildren(view);
		case WSDLEndPoint2EditPart.VISUAL_ID:
			return getWSDLEndPoint_3385SemanticChildren(view);
		case LoadBalanceEndPoint2EditPart.VISUAL_ID:
			return getLoadBalanceEndPoint_3386SemanticChildren(view);
		case MessageMediatorEditPart.VISUAL_ID:
			return getMessageMediator_3045SemanticChildren(view);
		case MergeNodeEditPart.VISUAL_ID:
			return getMergeNode_3013SemanticChildren(view);
		case EsbServerContentsCompartmentEditPart.VISUAL_ID:
			return getEsbServerContentsCompartment_7001SemanticChildren(view);
		case ProxyServiceInSequenceProxyServiceInSequenceCompartmentEditPart.VISUAL_ID:
			return getProxyServiceInSequenceProxyServiceInSequenceCompartment_7005SemanticChildren(view);
		case AggregateMediatorAggregateCompartmentEditPart.VISUAL_ID:
			return getAggregateMediatorAggregateCompartment_7007SemanticChildren(view);
		case ProxyServiceOutSequenceProxyServiceOutSequenceCompartmentEditPart.VISUAL_ID:
			return getProxyServiceOutSequenceProxyServiceOutSequenceCompartment_7006SemanticChildren(view);
		case AggregateMediatorAggregateCompartment2EditPart.VISUAL_ID:
			return getAggregateMediatorAggregateCompartment_7008SemanticChildren(view);
		case ProxyServiceEndpointContainerEndpointCompartmentEditPart.VISUAL_ID:
			return getProxyServiceEndpointContainerEndpointCompartment_7010SemanticChildren(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getEsbServer_2001SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		EsbServer modelElement = (EsbServer) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			MessageMediator childElement = modelElement.getMessageMediator();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MessageMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getProxyService_3001SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		ProxyService modelElement = (ProxyService) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			ProxyOutputConnector childElement = modelElement
					.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ProxyOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			ProxyInputConnector childElement = modelElement.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ProxyInputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			ProxyServiceSequenceContainer childElement = modelElement
					.getSequenceContainer();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ProxyServiceSequenceContainerEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			ProxyServiceEndpointContainer childElement = modelElement
					.getEndpointContainer();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ProxyServiceEndpointContainerEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getProxyServiceSequenceContainer_3196SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		ProxyServiceSequenceContainer modelElement = (ProxyServiceSequenceContainer) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			ProxyServiceInSequence childElement = modelElement.getInSequence();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ProxyServiceInSequenceEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			ProxyServiceOutSequence childElement = modelElement
					.getOutSequence();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ProxyServiceOutSequenceEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getDropMediator_3191SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		DropMediator modelElement = (DropMediator) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			DropMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == DropMediatorInputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getPropertyMediator_3199SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		PropertyMediator modelElement = (PropertyMediator) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			PropertyMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == PropertyMediatorInputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			PropertyMediatorOutputConnector childElement = modelElement
					.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == PropertyMediatorOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getThrottleMediator_3205SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		ThrottleMediator modelElement = (ThrottleMediator) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			ThrottleMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ThrottleMediatorInputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			ThrottleMediatorOutputConnector childElement = modelElement
					.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ThrottleMediatorOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getFilterMediator_3209SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		FilterMediator modelElement = (FilterMediator) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			FilterMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == FilterMediatorInputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			FilterMediatorPassOutputConnector childElement = modelElement
					.getPassOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == FilterMediatorPassOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			FilterMediatorFailOutputConnector childElement = modelElement
					.getFailOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == FilterMediatorFailOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getLogMediator_3210SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		LogMediator modelElement = (LogMediator) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			LogMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == LogMediatorInputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			LogMediatorOutputConnector childElement = modelElement
					.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == LogMediatorOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getEnrichMediator_3387SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		EnrichMediator modelElement = (EnrichMediator) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			EnrichMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == EnrichMediatorInputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			EnrichMediatorOutputConnector childElement = modelElement
					.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == EnrichMediatorOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getXSLTMediator_3212SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		XSLTMediator modelElement = (XSLTMediator) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			XSLTMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == XSLTMediatorInputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			XSLTMediatorOutputConnector childElement = modelElement
					.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == XSLTMediatorOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getSwitchMediator_3213SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		SwitchMediator modelElement = (SwitchMediator) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			SwitchMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SwitchMediatorInputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator/*[?]*/it = modelElement.getCaseBranches().iterator(); it
				.hasNext();) {
			SwitchCaseBranchOutputConnector childElement = (SwitchCaseBranchOutputConnector) it
					.next();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SwitchCaseBranchOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			SwitchDefaultBranchOutputConnector childElement = modelElement
					.getDefaultBranch();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SwitchDefaultBranchOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getSequence_3214SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Sequence modelElement = (Sequence) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			SequenceInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SequenceInputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			SequenceOutputConnector childElement = modelElement
					.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SequenceOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getEventMediator_3215SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		EventMediator modelElement = (EventMediator) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			EventMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == EventMediatorInputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			EventMediatorOutputConnector childElement = modelElement
					.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == EventMediatorOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getEntitlementMediator_3216SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		EntitlementMediator modelElement = (EntitlementMediator) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			EntitlementMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == EntitlementMediatorInputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			EntitlementMediatorOutputConnector childElement = modelElement
					.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == EntitlementMediatorOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getClassMediator_3217SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		ClassMediator modelElement = (ClassMediator) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			ClassMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ClassMediatorInputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			ClassMediatorOutputConnector childElement = modelElement
					.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ClassMediatorOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getSpringMediator_3218SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		SpringMediator modelElement = (SpringMediator) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			SpringMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SpringMediatorInputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			SpringMediatorOutputConnector childElement = modelElement
					.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SpringMediatorOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getScriptMediator_3219SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		ScriptMediator modelElement = (ScriptMediator) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			ScriptMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ScriptMediatorInputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			ScriptMediatorOutputConnector childElement = modelElement
					.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ScriptMediatorOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getFaultMediator_3220SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		FaultMediator modelElement = (FaultMediator) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			FaultMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == FaultMediatorInputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			FaultMediatorOutputConnector childElement = modelElement
					.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == FaultMediatorOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getXQueryMediator_3221SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		XQueryMediator modelElement = (XQueryMediator) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			XQueryMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == XQueryMediatorInputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			XQueryMediatorOutputConnector childElement = modelElement
					.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == XQueryMediatorOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getCommandMediator_3222SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		CommandMediator modelElement = (CommandMediator) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			CommandMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CommandMediatorInputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			CommandMediatorOutputConnector childElement = modelElement
					.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CommandMediatorOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getDBLookupMediator_3223SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		DBLookupMediator modelElement = (DBLookupMediator) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			DBLookupMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == DBLookupMediatorInputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			DBLookupMediatorOutputConnector childElement = modelElement
					.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == DBLookupMediatorOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getDBReportMediator_3224SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		DBReportMediator modelElement = (DBReportMediator) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			DBReportMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == DBReportMediatorInputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			DBReportMediatorOutputConnector childElement = modelElement
					.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == DBReportMediatorOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getSmooksMediator_3225SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		SmooksMediator modelElement = (SmooksMediator) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			SmooksMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SmooksMediatorInputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			SmooksMediatorOutputConnector childElement = modelElement
					.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SmooksMediatorOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getSendMediator_3226SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		SendMediator modelElement = (SendMediator) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			SendMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SendMediatorInputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			SendMediatorOutputConnector childElement = modelElement
					.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SendMediatorOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getHeaderMediator_3227SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		HeaderMediator modelElement = (HeaderMediator) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			HeaderMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == HeaderMediatorInputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			HeaderMediatorOutputConnector childElement = modelElement
					.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == HeaderMediatorOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getCloneMediator_3228SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		CloneMediator modelElement = (CloneMediator) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			CloneMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CloneMediatorInputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			CloneMediatorOutputConnector childElement = modelElement
					.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CloneMediatorOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator/*[?]*/it = modelElement.getTargetsOutputConnector()
				.iterator(); it.hasNext();) {
			CloneMediatorTargetOutputConnector childElement = (CloneMediatorTargetOutputConnector) it
					.next();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CloneMediatorTargetOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getCacheMediator_3229SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		CacheMediator modelElement = (CacheMediator) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			CacheMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CacheMediatorInputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			CacheMediatorOutputConnector childElement = modelElement
					.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CacheMediatorOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getIterateMediator_3230SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		IterateMediator modelElement = (IterateMediator) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			IterateMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == IterateMediatorInputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			IterateMediatorOutputConnector childElement = modelElement
					.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == IterateMediatorOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getCalloutMediator_3231SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		CalloutMediator modelElement = (CalloutMediator) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			CalloutMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CalloutMediatorInputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			CalloutMediatorOutputConnector childElement = modelElement
					.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CalloutMediatorOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getTransactionMediator_3232SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		TransactionMediator modelElement = (TransactionMediator) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			TransactionMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TransactionMediatorInputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			TransactionMediatorOutputConnector childElement = modelElement
					.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TransactionMediatorOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getRMSequenceMediator_3233SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		RMSequenceMediator modelElement = (RMSequenceMediator) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			RMSequenceMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == RMSequenceMediatorInputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			RMSequenceMediatorOutputConnector childElement = modelElement
					.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == RMSequenceMediatorOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getRuleMediator_3234SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		RuleMediator modelElement = (RuleMediator) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			RuleMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == RuleMediatorInputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			RuleMediatorOutputConnector childElement = modelElement
					.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == RuleMediatorOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getOAuthMediator_3235SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		OAuthMediator modelElement = (OAuthMediator) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			OAuthMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OAuthMediatorInputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			OAuthMediatorOutputConnector childElement = modelElement
					.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OAuthMediatorOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getAggregateMediator_3236SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		AggregateMediator modelElement = (AggregateMediator) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			AggregateMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == AggregateMediatorInputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			AggregateMediatorOutputConnector childElement = modelElement
					.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == AggregateMediatorOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			AggregateMediatorOnCompleteOutputConnector childElement = modelElement
					.getOnCompleteOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == AggregateMediatorOnCompleteOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getDropMediator_3194SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		DropMediator modelElement = (DropMediator) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			DropMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == DropMediatorInputConnector3EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getPropertyMediator_3200SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		PropertyMediator modelElement = (PropertyMediator) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			PropertyMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == PropertyMediatorInputConnector3EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			PropertyMediatorOutputConnector childElement = modelElement
					.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == PropertyMediatorOutputConnector3EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getThrottleMediator_3206SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		ThrottleMediator modelElement = (ThrottleMediator) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			ThrottleMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ThrottleMediatorInputConnector2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			ThrottleMediatorOutputConnector childElement = modelElement
					.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ThrottleMediatorOutputConnector2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getFilterMediator_3237SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		FilterMediator modelElement = (FilterMediator) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			FilterMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == FilterMediatorInputConnector3EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			FilterMediatorPassOutputConnector childElement = modelElement
					.getPassOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == FilterMediatorPassOutputConnector3EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			FilterMediatorFailOutputConnector childElement = modelElement
					.getFailOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == FilterMediatorFailOutputConnector3EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getLogMediator_3241SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		LogMediator modelElement = (LogMediator) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			LogMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == LogMediatorInputConnector3EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			LogMediatorOutputConnector childElement = modelElement
					.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == LogMediatorOutputConnector3EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getEnrichMediator_3244SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		EnrichMediator modelElement = (EnrichMediator) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			EnrichMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == EnrichMediatorInputConnector3EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			EnrichMediatorOutputConnector childElement = modelElement
					.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == EnrichMediatorOutputConnector3EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getXSLTMediator_3247SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		XSLTMediator modelElement = (XSLTMediator) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			XSLTMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == XSLTMediatorInputConnector3EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			XSLTMediatorOutputConnector childElement = modelElement
					.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == XSLTMediatorOutputConnector3EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getSwitchMediator_3250SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		SwitchMediator modelElement = (SwitchMediator) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			SwitchMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SwitchMediatorInputConnector3EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator/*[?]*/it = modelElement.getCaseBranches().iterator(); it
				.hasNext();) {
			SwitchCaseBranchOutputConnector childElement = (SwitchCaseBranchOutputConnector) it
					.next();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SwitchCaseBranchOutputConnector3EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			SwitchDefaultBranchOutputConnector childElement = modelElement
					.getDefaultBranch();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SwitchDefaultBranchOutputConnector3EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getSequence_3254SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Sequence modelElement = (Sequence) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			SequenceInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SequenceInputConnector3EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			SequenceOutputConnector childElement = modelElement
					.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SequenceOutputConnector3EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getEventMediator_3257SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		EventMediator modelElement = (EventMediator) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			EventMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == EventMediatorInputConnector2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			EventMediatorOutputConnector childElement = modelElement
					.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == EventMediatorOutputConnector2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getEntitlementMediator_3260SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		EntitlementMediator modelElement = (EntitlementMediator) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			EntitlementMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == EntitlementMediatorInputConnector2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			EntitlementMediatorOutputConnector childElement = modelElement
					.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == EntitlementMediatorOutputConnector2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getClassMediator_3263SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		ClassMediator modelElement = (ClassMediator) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			ClassMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ClassMediatorInputConnector2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			ClassMediatorOutputConnector childElement = modelElement
					.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ClassMediatorOutputConnector2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getSpringMediator_3266SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		SpringMediator modelElement = (SpringMediator) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			SpringMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SpringMediatorInputConnector2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			SpringMediatorOutputConnector childElement = modelElement
					.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SpringMediatorOutputConnector2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getScriptMediator_3269SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		ScriptMediator modelElement = (ScriptMediator) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			ScriptMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ScriptMediatorInputConnector2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			ScriptMediatorOutputConnector childElement = modelElement
					.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ScriptMediatorOutputConnector2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getFaultMediator_3272SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		FaultMediator modelElement = (FaultMediator) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			FaultMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == FaultMediatorInputConnector3EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			FaultMediatorOutputConnector childElement = modelElement
					.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == FaultMediatorOutputConnector3EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getXQueryMediator_3275SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		XQueryMediator modelElement = (XQueryMediator) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			XQueryMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == XQueryMediatorInputConnector2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			XQueryMediatorOutputConnector childElement = modelElement
					.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == XQueryMediatorOutputConnector2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getCommandMediator_3278SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		CommandMediator modelElement = (CommandMediator) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			CommandMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CommandMediatorInputConnector2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			CommandMediatorOutputConnector childElement = modelElement
					.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CommandMediatorOutputConnector2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getDBLookupMediator_3281SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		DBLookupMediator modelElement = (DBLookupMediator) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			DBLookupMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == DBLookupMediatorInputConnector3EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			DBLookupMediatorOutputConnector childElement = modelElement
					.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == DBLookupMediatorOutputConnector3EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getDBReportMediator_3284SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		DBReportMediator modelElement = (DBReportMediator) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			DBReportMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == DBReportMediatorInputConnector3EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			DBReportMediatorOutputConnector childElement = modelElement
					.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == DBReportMediatorOutputConnector3EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getSmooksMediator_3287SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		SmooksMediator modelElement = (SmooksMediator) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			SmooksMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SmooksMediatorInputConnector2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			SmooksMediatorOutputConnector childElement = modelElement
					.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SmooksMediatorOutputConnector2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getSendMediator_3290SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		SendMediator modelElement = (SendMediator) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			SendMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SendMediatorInputConnector3EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			SendMediatorOutputConnector childElement = modelElement
					.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SendMediatorOutputConnector3EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getHeaderMediator_3293SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		HeaderMediator modelElement = (HeaderMediator) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			HeaderMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == HeaderMediatorInputConnector3EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			HeaderMediatorOutputConnector childElement = modelElement
					.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == HeaderMediatorOutputConnector3EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getCloneMediator_3296SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		CloneMediator modelElement = (CloneMediator) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			CloneMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CloneMediatorInputConnector3EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			CloneMediatorOutputConnector childElement = modelElement
					.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CloneMediatorOutputConnector3EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator/*[?]*/it = modelElement.getTargetsOutputConnector()
				.iterator(); it.hasNext();) {
			CloneMediatorTargetOutputConnector childElement = (CloneMediatorTargetOutputConnector) it
					.next();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CloneMediatorTargetOutputConnector3EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getCacheMediator_3300SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		CacheMediator modelElement = (CacheMediator) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			CacheMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CacheMediatorInputConnector2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			CacheMediatorOutputConnector childElement = modelElement
					.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CacheMediatorOutputConnector2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getIterateMediator_3303SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		IterateMediator modelElement = (IterateMediator) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			IterateMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == IterateMediatorInputConnector3EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			IterateMediatorOutputConnector childElement = modelElement
					.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == IterateMediatorOutputConnector3EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getCalloutMediator_3306SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		CalloutMediator modelElement = (CalloutMediator) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			CalloutMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CalloutMediatorInputConnector3EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			CalloutMediatorOutputConnector childElement = modelElement
					.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CalloutMediatorOutputConnector3EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getTransactionMediator_3309SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		TransactionMediator modelElement = (TransactionMediator) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			TransactionMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TransactionMediatorInputConnector3EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			TransactionMediatorOutputConnector childElement = modelElement
					.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TransactionMediatorOutputConnector3EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getRMSequenceMediator_3312SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		RMSequenceMediator modelElement = (RMSequenceMediator) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			RMSequenceMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == RMSequenceMediatorInputConnector3EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			RMSequenceMediatorOutputConnector childElement = modelElement
					.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == RMSequenceMediatorOutputConnector3EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getRuleMediator_3315SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		RuleMediator modelElement = (RuleMediator) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			RuleMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == RuleMediatorInputConnector2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			RuleMediatorOutputConnector childElement = modelElement
					.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == RuleMediatorOutputConnector2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getOAuthMediator_3318SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		OAuthMediator modelElement = (OAuthMediator) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			OAuthMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OAuthMediatorInputConnector2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			OAuthMediatorOutputConnector childElement = modelElement
					.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OAuthMediatorOutputConnector2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getAggregateMediator_3321SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		AggregateMediator modelElement = (AggregateMediator) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			AggregateMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == AggregateMediatorInputConnector2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			AggregateMediatorOutputConnector childElement = modelElement
					.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == AggregateMediatorOutputConnector2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			AggregateMediatorOnCompleteOutputConnector childElement = modelElement
					.getOnCompleteOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == AggregateMediatorOnCompleteOutputConnector2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getLogMediator_3325SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		LogMediator modelElement = (LogMediator) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			LogMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == LogMediatorInputConnector4EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			LogMediatorOutputConnector childElement = modelElement
					.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == LogMediatorOutputConnector4EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getDropMediator_3328SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		DropMediator modelElement = (DropMediator) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			DropMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == DropMediatorInputConnector4EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getFilterMediator_3329SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		FilterMediator modelElement = (FilterMediator) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			FilterMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == FilterMediatorInputConnector4EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			FilterMediatorPassOutputConnector childElement = modelElement
					.getPassOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == FilterMediatorPassOutputConnector4EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			FilterMediatorFailOutputConnector childElement = modelElement
					.getFailOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == FilterMediatorFailOutputConnector4EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getPropertyMediator_3333SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		PropertyMediator modelElement = (PropertyMediator) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			PropertyMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == PropertyMediatorInputConnector4EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			PropertyMediatorOutputConnector childElement = modelElement
					.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == PropertyMediatorOutputConnector4EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getEnrichMediator_3334SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		EnrichMediator modelElement = (EnrichMediator) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			EnrichMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == EnrichMediatorInputConnector4EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			EnrichMediatorOutputConnector childElement = modelElement
					.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == EnrichMediatorOutputConnector4EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getXSLTMediator_3337SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		XSLTMediator modelElement = (XSLTMediator) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			XSLTMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == XSLTMediatorInputConnector4EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			XSLTMediatorOutputConnector childElement = modelElement
					.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == XSLTMediatorOutputConnector4EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getSwitchMediator_3340SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		SwitchMediator modelElement = (SwitchMediator) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			SwitchMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SwitchMediatorInputConnector4EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator/*[?]*/it = modelElement.getCaseBranches().iterator(); it
				.hasNext();) {
			SwitchCaseBranchOutputConnector childElement = (SwitchCaseBranchOutputConnector) it
					.next();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SwitchCaseBranchOutputConnector4EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			SwitchDefaultBranchOutputConnector childElement = modelElement
					.getDefaultBranch();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SwitchDefaultBranchOutputConnector4EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getFaultMediator_3344SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		FaultMediator modelElement = (FaultMediator) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			FaultMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == FaultMediatorInputConnector4EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			FaultMediatorOutputConnector childElement = modelElement
					.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == FaultMediatorOutputConnector4EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getDBLookupMediator_3347SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		DBLookupMediator modelElement = (DBLookupMediator) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			DBLookupMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == DBLookupMediatorInputConnector4EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			DBLookupMediatorOutputConnector childElement = modelElement
					.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == DBLookupMediatorOutputConnector4EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getDBReportMediator_3350SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		DBReportMediator modelElement = (DBReportMediator) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			DBReportMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == DBReportMediatorInputConnector4EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			DBReportMediatorOutputConnector childElement = modelElement
					.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == DBReportMediatorOutputConnector4EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getSendMediator_3353SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		SendMediator modelElement = (SendMediator) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			SendMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SendMediatorInputConnector4EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			SendMediatorOutputConnector childElement = modelElement
					.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SendMediatorOutputConnector4EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getHeaderMediator_3356SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		HeaderMediator modelElement = (HeaderMediator) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			HeaderMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == HeaderMediatorInputConnector4EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			HeaderMediatorOutputConnector childElement = modelElement
					.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == HeaderMediatorOutputConnector4EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getCloneMediator_3359SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		CloneMediator modelElement = (CloneMediator) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			CloneMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CloneMediatorInputConnector4EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			CloneMediatorOutputConnector childElement = modelElement
					.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CloneMediatorOutputConnector4EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator/*[?]*/it = modelElement.getTargetsOutputConnector()
				.iterator(); it.hasNext();) {
			CloneMediatorTargetOutputConnector childElement = (CloneMediatorTargetOutputConnector) it
					.next();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CloneMediatorTargetOutputConnector4EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getIterateMediator_3363SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		IterateMediator modelElement = (IterateMediator) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			IterateMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == IterateMediatorInputConnector4EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			IterateMediatorOutputConnector childElement = modelElement
					.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == IterateMediatorOutputConnector4EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getCalloutMediator_3366SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		CalloutMediator modelElement = (CalloutMediator) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			CalloutMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CalloutMediatorInputConnector4EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			CalloutMediatorOutputConnector childElement = modelElement
					.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CalloutMediatorOutputConnector4EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getTransactionMediator_3369SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		TransactionMediator modelElement = (TransactionMediator) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			TransactionMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TransactionMediatorInputConnector4EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			TransactionMediatorOutputConnector childElement = modelElement
					.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TransactionMediatorOutputConnector4EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getRMSequenceMediator_3372SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		RMSequenceMediator modelElement = (RMSequenceMediator) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			RMSequenceMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == RMSequenceMediatorInputConnector4EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			RMSequenceMediatorOutputConnector childElement = modelElement
					.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == RMSequenceMediatorOutputConnector4EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getSequence_3375SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Sequence modelElement = (Sequence) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			SequenceInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SequenceInputConnector4EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			SequenceOutputConnector childElement = modelElement
					.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SequenceOutputConnector4EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getDefaultEndPoint_3382SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		DefaultEndPoint modelElement = (DefaultEndPoint) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			DefaultEndPointInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == DefaultEndPointInputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			DefaultEndPointOutputConnector childElement = modelElement
					.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == DefaultEndPointOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getAddressEndPoint_3383SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		AddressEndPoint modelElement = (AddressEndPoint) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			AddressEndPointInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == AddressEndPointInputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			AddressEndPointOutputConnector childElement = modelElement
					.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == AddressEndPointOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getFailoverEndPoint_3384SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		FailoverEndPoint modelElement = (FailoverEndPoint) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			FailoverEndPointInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == FailoverEndPointInputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator/*[?]*/it = modelElement.getOutputConnector().iterator(); it
				.hasNext();) {
			FailoverEndPointOutputConnector childElement = (FailoverEndPointOutputConnector) it
					.next();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == FailoverEndPointOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			FailoverEndPointWestOutputConnector childElement = modelElement
					.getWestOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == FailoverEndPointWestOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getWSDLEndPoint_3385SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		WSDLEndPoint modelElement = (WSDLEndPoint) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			WSDLEndPointInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == WSDLEndPointInputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			WSDLEndPointOutputConnector childElement = modelElement
					.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == WSDLEndPointOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getLoadBalanceEndPoint_3386SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		LoadBalanceEndPoint modelElement = (LoadBalanceEndPoint) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			LoadBalanceEndPointInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == LoadBalanceEndPointInputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator/*[?]*/it = modelElement.getOutputConnector().iterator(); it
				.hasNext();) {
			LoadBalanceEndPointOutputConnector childElement = (LoadBalanceEndPointOutputConnector) it
					.next();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == LoadBalanceEndPointOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			LoadBalanceEndPointWestOutputConnector childElement = modelElement
					.getWestOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == LoadBalanceEndPointWestOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getMessageMediator_3045SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		MessageMediator modelElement = (MessageMediator) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			MessageInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MessageInputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			MessageOutputConnector childElement = modelElement
					.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MessageOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getMergeNode_3013SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		MergeNode modelElement = (MergeNode) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			MergeNodeFirstInputConnector childElement = modelElement
					.getFirstInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MergeNodeFirstInputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			MergeNodeSecondInputConnector childElement = modelElement
					.getSecondInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MergeNodeSecondInputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			MergeNodeOutputConnector childElement = modelElement
					.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MergeNodeOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getLogMediator_3134SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		LogMediator modelElement = (LogMediator) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			LogMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == LogMediatorInputConnector2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			LogMediatorOutputConnector childElement = modelElement
					.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == LogMediatorOutputConnector2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getDropMediator_3137SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		DropMediator modelElement = (DropMediator) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			DropMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == DropMediatorInputConnector2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getFilterMediator_3139SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		FilterMediator modelElement = (FilterMediator) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			FilterMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == FilterMediatorInputConnector2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			FilterMediatorPassOutputConnector childElement = modelElement
					.getPassOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == FilterMediatorPassOutputConnector2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			FilterMediatorFailOutputConnector childElement = modelElement
					.getFailOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == FilterMediatorFailOutputConnector2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getPropertyMediator_3143SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		PropertyMediator modelElement = (PropertyMediator) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			PropertyMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == PropertyMediatorInputConnector2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			PropertyMediatorOutputConnector childElement = modelElement
					.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == PropertyMediatorOutputConnector2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getEnrichMediator_3146SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		EnrichMediator modelElement = (EnrichMediator) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			EnrichMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == EnrichMediatorInputConnector2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			EnrichMediatorOutputConnector childElement = modelElement
					.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == EnrichMediatorOutputConnector2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getXSLTMediator_3149SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		XSLTMediator modelElement = (XSLTMediator) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			XSLTMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == XSLTMediatorInputConnector2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			XSLTMediatorOutputConnector childElement = modelElement
					.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == XSLTMediatorOutputConnector2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getSwitchMediator_3152SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		SwitchMediator modelElement = (SwitchMediator) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			SwitchMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SwitchMediatorInputConnector2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator/*[?]*/it = modelElement.getCaseBranches().iterator(); it
				.hasNext();) {
			SwitchCaseBranchOutputConnector childElement = (SwitchCaseBranchOutputConnector) it
					.next();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SwitchCaseBranchOutputConnector2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			SwitchDefaultBranchOutputConnector childElement = modelElement
					.getDefaultBranch();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SwitchDefaultBranchOutputConnector2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getFaultMediator_3156SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		FaultMediator modelElement = (FaultMediator) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			FaultMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == FaultMediatorInputConnector2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			FaultMediatorOutputConnector childElement = modelElement
					.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == FaultMediatorOutputConnector2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getDBLookupMediator_3159SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		DBLookupMediator modelElement = (DBLookupMediator) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			DBLookupMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == DBLookupMediatorInputConnector2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			DBLookupMediatorOutputConnector childElement = modelElement
					.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == DBLookupMediatorOutputConnector2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getDBReportMediator_3162SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		DBReportMediator modelElement = (DBReportMediator) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			DBReportMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == DBReportMediatorInputConnector2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			DBReportMediatorOutputConnector childElement = modelElement
					.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == DBReportMediatorOutputConnector2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getSendMediator_3165SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		SendMediator modelElement = (SendMediator) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			SendMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SendMediatorInputConnector2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			SendMediatorOutputConnector childElement = modelElement
					.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SendMediatorOutputConnector2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getHeaderMediator_3168SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		HeaderMediator modelElement = (HeaderMediator) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			HeaderMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == HeaderMediatorInputConnector2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			HeaderMediatorOutputConnector childElement = modelElement
					.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == HeaderMediatorOutputConnector2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getCloneMediator_3171SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		CloneMediator modelElement = (CloneMediator) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			CloneMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CloneMediatorInputConnector2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			CloneMediatorOutputConnector childElement = modelElement
					.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CloneMediatorOutputConnector2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator/*[?]*/it = modelElement.getTargetsOutputConnector()
				.iterator(); it.hasNext();) {
			CloneMediatorTargetOutputConnector childElement = (CloneMediatorTargetOutputConnector) it
					.next();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CloneMediatorTargetOutputConnector2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getIterateMediator_3175SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		IterateMediator modelElement = (IterateMediator) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			IterateMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == IterateMediatorInputConnector2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			IterateMediatorOutputConnector childElement = modelElement
					.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == IterateMediatorOutputConnector2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getCalloutMediator_3178SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		CalloutMediator modelElement = (CalloutMediator) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			CalloutMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CalloutMediatorInputConnector2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			CalloutMediatorOutputConnector childElement = modelElement
					.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CalloutMediatorOutputConnector2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getTransactionMediator_3179SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		TransactionMediator modelElement = (TransactionMediator) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			TransactionMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TransactionMediatorInputConnector2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			TransactionMediatorOutputConnector childElement = modelElement
					.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TransactionMediatorOutputConnector2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getRMSequenceMediator_3180SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		RMSequenceMediator modelElement = (RMSequenceMediator) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			RMSequenceMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == RMSequenceMediatorInputConnector2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			RMSequenceMediatorOutputConnector childElement = modelElement
					.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == RMSequenceMediatorOutputConnector2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getSequence_3187SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Sequence modelElement = (Sequence) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			SequenceInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SequenceInputConnector2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			SequenceOutputConnector childElement = modelElement
					.getOutputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SequenceOutputConnector2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getEsbServerContentsCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		EsbServer modelElement = (EsbServer) containerView.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		for (Iterator/*[?]*/it = modelElement.getChildren().iterator(); it
				.hasNext();) {
			EsbElement childElement = (EsbElement) it.next();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ProxyServiceEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MergeNodeEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getProxyServiceInSequenceProxyServiceInSequenceCompartment_7005SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		ProxyServiceInSequence modelElement = (ProxyServiceInSequence) containerView
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		for (Iterator/*[?]*/it = modelElement.getChildren().iterator(); it
				.hasNext();) {
			EsbElement childElement = (EsbElement) it.next();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == DropMediator3EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PropertyMediator3EditPart.VISUAL_ID) {
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
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getAggregateMediatorAggregateCompartment_7007SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		AggregateMediator modelElement = (AggregateMediator) containerView
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		for (Iterator/*[?]*/it = modelElement.getChildren().iterator(); it
				.hasNext();) {
			EsbElement childElement = (EsbElement) it.next();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == LogMediator2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DropMediator2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FilterMediator2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PropertyMediator2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EnrichMediator2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == XSLTMediator2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SwitchMediator2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FaultMediator2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DBLookupMediator2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DBReportMediator2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SendMediator2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == HeaderMediator2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CloneMediator2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == IterateMediator2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CalloutMediator2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TransactionMediator2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RMSequenceMediator2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Sequence2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getProxyServiceOutSequenceProxyServiceOutSequenceCompartment_7006SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		ProxyServiceOutSequence modelElement = (ProxyServiceOutSequence) containerView
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		for (Iterator/*[?]*/it = modelElement.getChildren().iterator(); it
				.hasNext();) {
			EsbElement childElement = (EsbElement) it.next();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == DropMediator4EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PropertyMediator4EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ThrottleMediator2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FilterMediator3EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LogMediator3EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EnrichMediator3EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == XSLTMediator3EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SwitchMediator3EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Sequence3EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EventMediator2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EntitlementMediator2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ClassMediator2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SpringMediator2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ScriptMediator2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FaultMediator3EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == XQueryMediator2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CommandMediator2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DBLookupMediator3EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DBReportMediator3EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SmooksMediator2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SendMediator3EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == HeaderMediator3EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CloneMediator3EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CacheMediator2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == IterateMediator3EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CalloutMediator3EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TransactionMediator3EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RMSequenceMediator3EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RuleMediator2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OAuthMediator2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AggregateMediator2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getAggregateMediatorAggregateCompartment_7008SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		AggregateMediator modelElement = (AggregateMediator) containerView
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		for (Iterator/*[?]*/it = modelElement.getChildren().iterator(); it
				.hasNext();) {
			EsbElement childElement = (EsbElement) it.next();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == LogMediator4EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DropMediator5EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FilterMediator4EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PropertyMediator5EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EnrichMediator4EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == XSLTMediator4EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SwitchMediator4EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FaultMediator4EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DBLookupMediator4EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DBReportMediator4EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SendMediator4EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == HeaderMediator4EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CloneMediator4EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == IterateMediator4EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CalloutMediator4EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TransactionMediator4EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RMSequenceMediator4EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Sequence4EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getProxyServiceEndpointContainerEndpointCompartment_7010SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		ProxyServiceEndpointContainer modelElement = (ProxyServiceEndpointContainer) containerView
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		for (Iterator/*[?]*/it = modelElement.getChildren().iterator(); it
				.hasNext();) {
			EsbElement childElement = (EsbElement) it.next();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == DefaultEndPoint2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AddressEndPoint2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FailoverEndPoint2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == WSDLEndPoint2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LoadBalanceEndPoint2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/getEsbDiagram_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		EsbDiagram modelElement = (EsbDiagram) view.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbNodeDescriptor]*/();
		{
			EsbServer childElement = modelElement.getServer();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == EsbServerEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getContainedLinks(
			View view) {
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
		case ProxyServiceSequenceContainerEditPart.VISUAL_ID:
			return getProxyServiceSequenceContainer_3196ContainedLinks(view);
		case ProxyServiceInSequenceEditPart.VISUAL_ID:
			return getProxyServiceInSequence_3197ContainedLinks(view);
		case DropMediator3EditPart.VISUAL_ID:
			return getDropMediator_3191ContainedLinks(view);
		case DropMediatorInputConnectorEditPart.VISUAL_ID:
			return getDropMediatorInputConnector_3008ContainedLinks(view);
		case PropertyMediator3EditPart.VISUAL_ID:
			return getPropertyMediator_3199ContainedLinks(view);
		case PropertyMediatorInputConnectorEditPart.VISUAL_ID:
			return getPropertyMediatorInputConnector_3033ContainedLinks(view);
		case PropertyMediatorOutputConnectorEditPart.VISUAL_ID:
			return getPropertyMediatorOutputConnector_3034ContainedLinks(view);
		case ThrottleMediatorEditPart.VISUAL_ID:
			return getThrottleMediator_3205ContainedLinks(view);
		case ThrottleMediatorInputConnectorEditPart.VISUAL_ID:
			return getThrottleMediatorInputConnector_3121ContainedLinks(view);
		case ThrottleMediatorOutputConnectorEditPart.VISUAL_ID:
			return getThrottleMediatorOutputConnector_3122ContainedLinks(view);
		case FilterMediatorEditPart.VISUAL_ID:
			return getFilterMediator_3209ContainedLinks(view);
		case FilterMediatorInputConnectorEditPart.VISUAL_ID:
			return getFilterMediatorInputConnector_3010ContainedLinks(view);
		case FilterMediatorPassOutputConnectorEditPart.VISUAL_ID:
			return getFilterMediatorPassOutputConnector_3011ContainedLinks(view);
		case FilterMediatorFailOutputConnectorEditPart.VISUAL_ID:
			return getFilterMediatorFailOutputConnector_3012ContainedLinks(view);
		case LogMediatorEditPart.VISUAL_ID:
			return getLogMediator_3210ContainedLinks(view);
		case LogMediatorInputConnectorEditPart.VISUAL_ID:
			return getLogMediatorInputConnector_3018ContainedLinks(view);
		case LogMediatorOutputConnectorEditPart.VISUAL_ID:
			return getLogMediatorOutputConnector_3019ContainedLinks(view);
		case EnrichMediatorEditPart.VISUAL_ID:
			return getEnrichMediator_3387ContainedLinks(view);
		case EnrichMediatorInputConnectorEditPart.VISUAL_ID:
			return getEnrichMediatorInputConnector_3036ContainedLinks(view);
		case EnrichMediatorOutputConnectorEditPart.VISUAL_ID:
			return getEnrichMediatorOutputConnector_3037ContainedLinks(view);
		case XSLTMediatorEditPart.VISUAL_ID:
			return getXSLTMediator_3212ContainedLinks(view);
		case XSLTMediatorInputConnectorEditPart.VISUAL_ID:
			return getXSLTMediatorInputConnector_3039ContainedLinks(view);
		case XSLTMediatorOutputConnectorEditPart.VISUAL_ID:
			return getXSLTMediatorOutputConnector_3040ContainedLinks(view);
		case SwitchMediatorEditPart.VISUAL_ID:
			return getSwitchMediator_3213ContainedLinks(view);
		case SwitchMediatorInputConnectorEditPart.VISUAL_ID:
			return getSwitchMediatorInputConnector_3042ContainedLinks(view);
		case SwitchCaseBranchOutputConnectorEditPart.VISUAL_ID:
			return getSwitchCaseBranchOutputConnector_3043ContainedLinks(view);
		case SwitchDefaultBranchOutputConnectorEditPart.VISUAL_ID:
			return getSwitchDefaultBranchOutputConnector_3044ContainedLinks(view);
		case SequenceEditPart.VISUAL_ID:
			return getSequence_3214ContainedLinks(view);
		case SequenceInputConnectorEditPart.VISUAL_ID:
			return getSequenceInputConnector_3049ContainedLinks(view);
		case SequenceOutputConnectorEditPart.VISUAL_ID:
			return getSequenceOutputConnector_3050ContainedLinks(view);
		case EventMediatorEditPart.VISUAL_ID:
			return getEventMediator_3215ContainedLinks(view);
		case EventMediatorInputConnectorEditPart.VISUAL_ID:
			return getEventMediatorInputConnector_3052ContainedLinks(view);
		case EventMediatorOutputConnectorEditPart.VISUAL_ID:
			return getEventMediatorOutputConnector_3053ContainedLinks(view);
		case EntitlementMediatorEditPart.VISUAL_ID:
			return getEntitlementMediator_3216ContainedLinks(view);
		case EntitlementMediatorInputConnectorEditPart.VISUAL_ID:
			return getEntitlementMediatorInputConnector_3055ContainedLinks(view);
		case EntitlementMediatorOutputConnectorEditPart.VISUAL_ID:
			return getEntitlementMediatorOutputConnector_3056ContainedLinks(view);
		case ClassMediatorEditPart.VISUAL_ID:
			return getClassMediator_3217ContainedLinks(view);
		case ClassMediatorInputConnectorEditPart.VISUAL_ID:
			return getClassMediatorInputConnector_3058ContainedLinks(view);
		case ClassMediatorOutputConnectorEditPart.VISUAL_ID:
			return getClassMediatorOutputConnector_3059ContainedLinks(view);
		case SpringMediatorEditPart.VISUAL_ID:
			return getSpringMediator_3218ContainedLinks(view);
		case SpringMediatorInputConnectorEditPart.VISUAL_ID:
			return getSpringMediatorInputConnector_3061ContainedLinks(view);
		case SpringMediatorOutputConnectorEditPart.VISUAL_ID:
			return getSpringMediatorOutputConnector_3062ContainedLinks(view);
		case ScriptMediatorEditPart.VISUAL_ID:
			return getScriptMediator_3219ContainedLinks(view);
		case ScriptMediatorInputConnectorEditPart.VISUAL_ID:
			return getScriptMediatorInputConnector_3064ContainedLinks(view);
		case ScriptMediatorOutputConnectorEditPart.VISUAL_ID:
			return getScriptMediatorOutputConnector_3065ContainedLinks(view);
		case FaultMediatorEditPart.VISUAL_ID:
			return getFaultMediator_3220ContainedLinks(view);
		case FaultMediatorInputConnectorEditPart.VISUAL_ID:
			return getFaultMediatorInputConnector_3067ContainedLinks(view);
		case FaultMediatorOutputConnectorEditPart.VISUAL_ID:
			return getFaultMediatorOutputConnector_3068ContainedLinks(view);
		case XQueryMediatorEditPart.VISUAL_ID:
			return getXQueryMediator_3221ContainedLinks(view);
		case XQueryMediatorInputConnectorEditPart.VISUAL_ID:
			return getXQueryMediatorInputConnector_3070ContainedLinks(view);
		case XQueryMediatorOutputConnectorEditPart.VISUAL_ID:
			return getXQueryMediatorOutputConnector_3071ContainedLinks(view);
		case CommandMediatorEditPart.VISUAL_ID:
			return getCommandMediator_3222ContainedLinks(view);
		case CommandMediatorInputConnectorEditPart.VISUAL_ID:
			return getCommandMediatorInputConnector_3073ContainedLinks(view);
		case CommandMediatorOutputConnectorEditPart.VISUAL_ID:
			return getCommandMediatorOutputConnector_3074ContainedLinks(view);
		case DBLookupMediatorEditPart.VISUAL_ID:
			return getDBLookupMediator_3223ContainedLinks(view);
		case DBLookupMediatorInputConnectorEditPart.VISUAL_ID:
			return getDBLookupMediatorInputConnector_3076ContainedLinks(view);
		case DBLookupMediatorOutputConnectorEditPart.VISUAL_ID:
			return getDBLookupMediatorOutputConnector_3077ContainedLinks(view);
		case DBReportMediatorEditPart.VISUAL_ID:
			return getDBReportMediator_3224ContainedLinks(view);
		case DBReportMediatorInputConnectorEditPart.VISUAL_ID:
			return getDBReportMediatorInputConnector_3079ContainedLinks(view);
		case DBReportMediatorOutputConnectorEditPart.VISUAL_ID:
			return getDBReportMediatorOutputConnector_3080ContainedLinks(view);
		case SmooksMediatorEditPart.VISUAL_ID:
			return getSmooksMediator_3225ContainedLinks(view);
		case SmooksMediatorInputConnectorEditPart.VISUAL_ID:
			return getSmooksMediatorInputConnector_3082ContainedLinks(view);
		case SmooksMediatorOutputConnectorEditPart.VISUAL_ID:
			return getSmooksMediatorOutputConnector_3083ContainedLinks(view);
		case SendMediatorEditPart.VISUAL_ID:
			return getSendMediator_3226ContainedLinks(view);
		case SendMediatorInputConnectorEditPart.VISUAL_ID:
			return getSendMediatorInputConnector_3085ContainedLinks(view);
		case SendMediatorOutputConnectorEditPart.VISUAL_ID:
			return getSendMediatorOutputConnector_3086ContainedLinks(view);
		case HeaderMediatorEditPart.VISUAL_ID:
			return getHeaderMediator_3227ContainedLinks(view);
		case HeaderMediatorInputConnectorEditPart.VISUAL_ID:
			return getHeaderMediatorInputConnector_3100ContainedLinks(view);
		case HeaderMediatorOutputConnectorEditPart.VISUAL_ID:
			return getHeaderMediatorOutputConnector_3101ContainedLinks(view);
		case CloneMediatorEditPart.VISUAL_ID:
			return getCloneMediator_3228ContainedLinks(view);
		case CloneMediatorInputConnectorEditPart.VISUAL_ID:
			return getCloneMediatorInputConnector_3103ContainedLinks(view);
		case CloneMediatorOutputConnectorEditPart.VISUAL_ID:
			return getCloneMediatorOutputConnector_3104ContainedLinks(view);
		case CloneMediatorTargetOutputConnectorEditPart.VISUAL_ID:
			return getCloneMediatorTargetOutputConnector_3133ContainedLinks(view);
		case CacheMediatorEditPart.VISUAL_ID:
			return getCacheMediator_3229ContainedLinks(view);
		case CacheMediatorInputConnectorEditPart.VISUAL_ID:
			return getCacheMediatorInputConnector_3106ContainedLinks(view);
		case CacheMediatorOutputConnectorEditPart.VISUAL_ID:
			return getCacheMediatorOutputConnector_3107ContainedLinks(view);
		case IterateMediatorEditPart.VISUAL_ID:
			return getIterateMediator_3230ContainedLinks(view);
		case IterateMediatorInputConnectorEditPart.VISUAL_ID:
			return getIterateMediatorInputConnector_3109ContainedLinks(view);
		case IterateMediatorOutputConnectorEditPart.VISUAL_ID:
			return getIterateMediatorOutputConnector_3110ContainedLinks(view);
		case CalloutMediatorEditPart.VISUAL_ID:
			return getCalloutMediator_3231ContainedLinks(view);
		case CalloutMediatorInputConnectorEditPart.VISUAL_ID:
			return getCalloutMediatorInputConnector_3115ContainedLinks(view);
		case CalloutMediatorOutputConnectorEditPart.VISUAL_ID:
			return getCalloutMediatorOutputConnector_3116ContainedLinks(view);
		case TransactionMediatorEditPart.VISUAL_ID:
			return getTransactionMediator_3232ContainedLinks(view);
		case TransactionMediatorInputConnectorEditPart.VISUAL_ID:
			return getTransactionMediatorInputConnector_3118ContainedLinks(view);
		case TransactionMediatorOutputConnectorEditPart.VISUAL_ID:
			return getTransactionMediatorOutputConnector_3119ContainedLinks(view);
		case RMSequenceMediatorEditPart.VISUAL_ID:
			return getRMSequenceMediator_3233ContainedLinks(view);
		case RMSequenceMediatorInputConnectorEditPart.VISUAL_ID:
			return getRMSequenceMediatorInputConnector_3124ContainedLinks(view);
		case RMSequenceMediatorOutputConnectorEditPart.VISUAL_ID:
			return getRMSequenceMediatorOutputConnector_3125ContainedLinks(view);
		case RuleMediatorEditPart.VISUAL_ID:
			return getRuleMediator_3234ContainedLinks(view);
		case RuleMediatorInputConnectorEditPart.VISUAL_ID:
			return getRuleMediatorInputConnector_3127ContainedLinks(view);
		case RuleMediatorOutputConnectorEditPart.VISUAL_ID:
			return getRuleMediatorOutputConnector_3128ContainedLinks(view);
		case OAuthMediatorEditPart.VISUAL_ID:
			return getOAuthMediator_3235ContainedLinks(view);
		case OAuthMediatorInputConnectorEditPart.VISUAL_ID:
			return getOAuthMediatorInputConnector_3130ContainedLinks(view);
		case OAuthMediatorOutputConnectorEditPart.VISUAL_ID:
			return getOAuthMediatorOutputConnector_3131ContainedLinks(view);
		case AggregateMediatorEditPart.VISUAL_ID:
			return getAggregateMediator_3236ContainedLinks(view);
		case AggregateMediatorInputConnectorEditPart.VISUAL_ID:
			return getAggregateMediatorInputConnector_3112ContainedLinks(view);
		case AggregateMediatorOutputConnectorEditPart.VISUAL_ID:
			return getAggregateMediatorOutputConnector_3113ContainedLinks(view);
		case AggregateMediatorOnCompleteOutputConnectorEditPart.VISUAL_ID:
			return getAggregateMediatorOnCompleteOutputConnector_3132ContainedLinks(view);
		case LogMediator2EditPart.VISUAL_ID:
			return getLogMediator_3134ContainedLinks(view);
		case LogMediatorInputConnector2EditPart.VISUAL_ID:
			return getLogMediatorInputConnector_3135ContainedLinks(view);
		case LogMediatorOutputConnector2EditPart.VISUAL_ID:
			return getLogMediatorOutputConnector_3136ContainedLinks(view);
		case DropMediator2EditPart.VISUAL_ID:
			return getDropMediator_3137ContainedLinks(view);
		case DropMediatorInputConnector2EditPart.VISUAL_ID:
			return getDropMediatorInputConnector_3138ContainedLinks(view);
		case FilterMediator2EditPart.VISUAL_ID:
			return getFilterMediator_3139ContainedLinks(view);
		case FilterMediatorInputConnector2EditPart.VISUAL_ID:
			return getFilterMediatorInputConnector_3140ContainedLinks(view);
		case FilterMediatorPassOutputConnector2EditPart.VISUAL_ID:
			return getFilterMediatorPassOutputConnector_3141ContainedLinks(view);
		case FilterMediatorFailOutputConnector2EditPart.VISUAL_ID:
			return getFilterMediatorFailOutputConnector_3142ContainedLinks(view);
		case PropertyMediator2EditPart.VISUAL_ID:
			return getPropertyMediator_3143ContainedLinks(view);
		case PropertyMediatorInputConnector2EditPart.VISUAL_ID:
			return getPropertyMediatorInputConnector_3144ContainedLinks(view);
		case PropertyMediatorOutputConnector2EditPart.VISUAL_ID:
			return getPropertyMediatorOutputConnector_3145ContainedLinks(view);
		case EnrichMediator2EditPart.VISUAL_ID:
			return getEnrichMediator_3146ContainedLinks(view);
		case EnrichMediatorInputConnector2EditPart.VISUAL_ID:
			return getEnrichMediatorInputConnector_3147ContainedLinks(view);
		case EnrichMediatorOutputConnector2EditPart.VISUAL_ID:
			return getEnrichMediatorOutputConnector_3148ContainedLinks(view);
		case XSLTMediator2EditPart.VISUAL_ID:
			return getXSLTMediator_3149ContainedLinks(view);
		case XSLTMediatorInputConnector2EditPart.VISUAL_ID:
			return getXSLTMediatorInputConnector_3150ContainedLinks(view);
		case XSLTMediatorOutputConnector2EditPart.VISUAL_ID:
			return getXSLTMediatorOutputConnector_3151ContainedLinks(view);
		case SwitchMediator2EditPart.VISUAL_ID:
			return getSwitchMediator_3152ContainedLinks(view);
		case SwitchMediatorInputConnector2EditPart.VISUAL_ID:
			return getSwitchMediatorInputConnector_3153ContainedLinks(view);
		case SwitchCaseBranchOutputConnector2EditPart.VISUAL_ID:
			return getSwitchCaseBranchOutputConnector_3154ContainedLinks(view);
		case SwitchDefaultBranchOutputConnector2EditPart.VISUAL_ID:
			return getSwitchDefaultBranchOutputConnector_3155ContainedLinks(view);
		case FaultMediator2EditPart.VISUAL_ID:
			return getFaultMediator_3156ContainedLinks(view);
		case FaultMediatorInputConnector2EditPart.VISUAL_ID:
			return getFaultMediatorInputConnector_3157ContainedLinks(view);
		case FaultMediatorOutputConnector2EditPart.VISUAL_ID:
			return getFaultMediatorOutputConnector_3158ContainedLinks(view);
		case DBLookupMediator2EditPart.VISUAL_ID:
			return getDBLookupMediator_3159ContainedLinks(view);
		case DBLookupMediatorInputConnector2EditPart.VISUAL_ID:
			return getDBLookupMediatorInputConnector_3160ContainedLinks(view);
		case DBLookupMediatorOutputConnector2EditPart.VISUAL_ID:
			return getDBLookupMediatorOutputConnector_3161ContainedLinks(view);
		case DBReportMediator2EditPart.VISUAL_ID:
			return getDBReportMediator_3162ContainedLinks(view);
		case DBReportMediatorInputConnector2EditPart.VISUAL_ID:
			return getDBReportMediatorInputConnector_3163ContainedLinks(view);
		case DBReportMediatorOutputConnector2EditPart.VISUAL_ID:
			return getDBReportMediatorOutputConnector_3164ContainedLinks(view);
		case SendMediator2EditPart.VISUAL_ID:
			return getSendMediator_3165ContainedLinks(view);
		case SendMediatorInputConnector2EditPart.VISUAL_ID:
			return getSendMediatorInputConnector_3166ContainedLinks(view);
		case SendMediatorOutputConnector2EditPart.VISUAL_ID:
			return getSendMediatorOutputConnector_3167ContainedLinks(view);
		case HeaderMediator2EditPart.VISUAL_ID:
			return getHeaderMediator_3168ContainedLinks(view);
		case HeaderMediatorInputConnector2EditPart.VISUAL_ID:
			return getHeaderMediatorInputConnector_3169ContainedLinks(view);
		case HeaderMediatorOutputConnector2EditPart.VISUAL_ID:
			return getHeaderMediatorOutputConnector_3170ContainedLinks(view);
		case CloneMediator2EditPart.VISUAL_ID:
			return getCloneMediator_3171ContainedLinks(view);
		case CloneMediatorInputConnector2EditPart.VISUAL_ID:
			return getCloneMediatorInputConnector_3172ContainedLinks(view);
		case CloneMediatorOutputConnector2EditPart.VISUAL_ID:
			return getCloneMediatorOutputConnector_3173ContainedLinks(view);
		case CloneMediatorTargetOutputConnector2EditPart.VISUAL_ID:
			return getCloneMediatorTargetOutputConnector_3174ContainedLinks(view);
		case IterateMediator2EditPart.VISUAL_ID:
			return getIterateMediator_3175ContainedLinks(view);
		case IterateMediatorInputConnector2EditPart.VISUAL_ID:
			return getIterateMediatorInputConnector_3176ContainedLinks(view);
		case IterateMediatorOutputConnector2EditPart.VISUAL_ID:
			return getIterateMediatorOutputConnector_3177ContainedLinks(view);
		case CalloutMediator2EditPart.VISUAL_ID:
			return getCalloutMediator_3178ContainedLinks(view);
		case CalloutMediatorInputConnector2EditPart.VISUAL_ID:
			return getCalloutMediatorInputConnector_3181ContainedLinks(view);
		case CalloutMediatorOutputConnector2EditPart.VISUAL_ID:
			return getCalloutMediatorOutputConnector_3182ContainedLinks(view);
		case TransactionMediator2EditPart.VISUAL_ID:
			return getTransactionMediator_3179ContainedLinks(view);
		case TransactionMediatorInputConnector2EditPart.VISUAL_ID:
			return getTransactionMediatorInputConnector_3183ContainedLinks(view);
		case TransactionMediatorOutputConnector2EditPart.VISUAL_ID:
			return getTransactionMediatorOutputConnector_3184ContainedLinks(view);
		case RMSequenceMediator2EditPart.VISUAL_ID:
			return getRMSequenceMediator_3180ContainedLinks(view);
		case RMSequenceMediatorInputConnector2EditPart.VISUAL_ID:
			return getRMSequenceMediatorInputConnector_3185ContainedLinks(view);
		case RMSequenceMediatorOutputConnector2EditPart.VISUAL_ID:
			return getRMSequenceMediatorOutputConnector_3186ContainedLinks(view);
		case Sequence2EditPart.VISUAL_ID:
			return getSequence_3187ContainedLinks(view);
		case SequenceInputConnector2EditPart.VISUAL_ID:
			return getSequenceInputConnector_3188ContainedLinks(view);
		case SequenceOutputConnector2EditPart.VISUAL_ID:
			return getSequenceOutputConnector_3189ContainedLinks(view);
		case ProxyServiceOutSequenceEditPart.VISUAL_ID:
			return getProxyServiceOutSequence_3198ContainedLinks(view);
		case DropMediator4EditPart.VISUAL_ID:
			return getDropMediator_3194ContainedLinks(view);
		case DropMediatorInputConnector3EditPart.VISUAL_ID:
			return getDropMediatorInputConnector_3192ContainedLinks(view);
		case PropertyMediator4EditPart.VISUAL_ID:
			return getPropertyMediator_3200ContainedLinks(view);
		case PropertyMediatorInputConnector3EditPart.VISUAL_ID:
			return getPropertyMediatorInputConnector_3201ContainedLinks(view);
		case PropertyMediatorOutputConnector3EditPart.VISUAL_ID:
			return getPropertyMediatorOutputConnector_3202ContainedLinks(view);
		case ThrottleMediator2EditPart.VISUAL_ID:
			return getThrottleMediator_3206ContainedLinks(view);
		case ThrottleMediatorInputConnector2EditPart.VISUAL_ID:
			return getThrottleMediatorInputConnector_3207ContainedLinks(view);
		case ThrottleMediatorOutputConnector2EditPart.VISUAL_ID:
			return getThrottleMediatorOutputConnector_3208ContainedLinks(view);
		case FilterMediator3EditPart.VISUAL_ID:
			return getFilterMediator_3237ContainedLinks(view);
		case FilterMediatorInputConnector3EditPart.VISUAL_ID:
			return getFilterMediatorInputConnector_3238ContainedLinks(view);
		case FilterMediatorPassOutputConnector3EditPart.VISUAL_ID:
			return getFilterMediatorPassOutputConnector_3239ContainedLinks(view);
		case FilterMediatorFailOutputConnector3EditPart.VISUAL_ID:
			return getFilterMediatorFailOutputConnector_3240ContainedLinks(view);
		case LogMediator3EditPart.VISUAL_ID:
			return getLogMediator_3241ContainedLinks(view);
		case LogMediatorInputConnector3EditPart.VISUAL_ID:
			return getLogMediatorInputConnector_3242ContainedLinks(view);
		case LogMediatorOutputConnector3EditPart.VISUAL_ID:
			return getLogMediatorOutputConnector_3243ContainedLinks(view);
		case EnrichMediator3EditPart.VISUAL_ID:
			return getEnrichMediator_3244ContainedLinks(view);
		case EnrichMediatorInputConnector3EditPart.VISUAL_ID:
			return getEnrichMediatorInputConnector_3245ContainedLinks(view);
		case EnrichMediatorOutputConnector3EditPart.VISUAL_ID:
			return getEnrichMediatorOutputConnector_3246ContainedLinks(view);
		case XSLTMediator3EditPart.VISUAL_ID:
			return getXSLTMediator_3247ContainedLinks(view);
		case XSLTMediatorInputConnector3EditPart.VISUAL_ID:
			return getXSLTMediatorInputConnector_3248ContainedLinks(view);
		case XSLTMediatorOutputConnector3EditPart.VISUAL_ID:
			return getXSLTMediatorOutputConnector_3249ContainedLinks(view);
		case SwitchMediator3EditPart.VISUAL_ID:
			return getSwitchMediator_3250ContainedLinks(view);
		case SwitchMediatorInputConnector3EditPart.VISUAL_ID:
			return getSwitchMediatorInputConnector_3251ContainedLinks(view);
		case SwitchCaseBranchOutputConnector3EditPart.VISUAL_ID:
			return getSwitchCaseBranchOutputConnector_3252ContainedLinks(view);
		case SwitchDefaultBranchOutputConnector3EditPart.VISUAL_ID:
			return getSwitchDefaultBranchOutputConnector_3253ContainedLinks(view);
		case Sequence3EditPart.VISUAL_ID:
			return getSequence_3254ContainedLinks(view);
		case SequenceInputConnector3EditPart.VISUAL_ID:
			return getSequenceInputConnector_3255ContainedLinks(view);
		case SequenceOutputConnector3EditPart.VISUAL_ID:
			return getSequenceOutputConnector_3256ContainedLinks(view);
		case EventMediator2EditPart.VISUAL_ID:
			return getEventMediator_3257ContainedLinks(view);
		case EventMediatorInputConnector2EditPart.VISUAL_ID:
			return getEventMediatorInputConnector_3258ContainedLinks(view);
		case EventMediatorOutputConnector2EditPart.VISUAL_ID:
			return getEventMediatorOutputConnector_3259ContainedLinks(view);
		case EntitlementMediator2EditPart.VISUAL_ID:
			return getEntitlementMediator_3260ContainedLinks(view);
		case EntitlementMediatorInputConnector2EditPart.VISUAL_ID:
			return getEntitlementMediatorInputConnector_3261ContainedLinks(view);
		case EntitlementMediatorOutputConnector2EditPart.VISUAL_ID:
			return getEntitlementMediatorOutputConnector_3262ContainedLinks(view);
		case ClassMediator2EditPart.VISUAL_ID:
			return getClassMediator_3263ContainedLinks(view);
		case ClassMediatorInputConnector2EditPart.VISUAL_ID:
			return getClassMediatorInputConnector_3264ContainedLinks(view);
		case ClassMediatorOutputConnector2EditPart.VISUAL_ID:
			return getClassMediatorOutputConnector_3265ContainedLinks(view);
		case SpringMediator2EditPart.VISUAL_ID:
			return getSpringMediator_3266ContainedLinks(view);
		case SpringMediatorInputConnector2EditPart.VISUAL_ID:
			return getSpringMediatorInputConnector_3267ContainedLinks(view);
		case SpringMediatorOutputConnector2EditPart.VISUAL_ID:
			return getSpringMediatorOutputConnector_3268ContainedLinks(view);
		case ScriptMediator2EditPart.VISUAL_ID:
			return getScriptMediator_3269ContainedLinks(view);
		case ScriptMediatorInputConnector2EditPart.VISUAL_ID:
			return getScriptMediatorInputConnector_3270ContainedLinks(view);
		case ScriptMediatorOutputConnector2EditPart.VISUAL_ID:
			return getScriptMediatorOutputConnector_3271ContainedLinks(view);
		case FaultMediator3EditPart.VISUAL_ID:
			return getFaultMediator_3272ContainedLinks(view);
		case FaultMediatorInputConnector3EditPart.VISUAL_ID:
			return getFaultMediatorInputConnector_3273ContainedLinks(view);
		case FaultMediatorOutputConnector3EditPart.VISUAL_ID:
			return getFaultMediatorOutputConnector_3274ContainedLinks(view);
		case XQueryMediator2EditPart.VISUAL_ID:
			return getXQueryMediator_3275ContainedLinks(view);
		case XQueryMediatorInputConnector2EditPart.VISUAL_ID:
			return getXQueryMediatorInputConnector_3276ContainedLinks(view);
		case XQueryMediatorOutputConnector2EditPart.VISUAL_ID:
			return getXQueryMediatorOutputConnector_3277ContainedLinks(view);
		case CommandMediator2EditPart.VISUAL_ID:
			return getCommandMediator_3278ContainedLinks(view);
		case CommandMediatorInputConnector2EditPart.VISUAL_ID:
			return getCommandMediatorInputConnector_3279ContainedLinks(view);
		case CommandMediatorOutputConnector2EditPart.VISUAL_ID:
			return getCommandMediatorOutputConnector_3280ContainedLinks(view);
		case DBLookupMediator3EditPart.VISUAL_ID:
			return getDBLookupMediator_3281ContainedLinks(view);
		case DBLookupMediatorInputConnector3EditPart.VISUAL_ID:
			return getDBLookupMediatorInputConnector_3282ContainedLinks(view);
		case DBLookupMediatorOutputConnector3EditPart.VISUAL_ID:
			return getDBLookupMediatorOutputConnector_3283ContainedLinks(view);
		case DBReportMediator3EditPart.VISUAL_ID:
			return getDBReportMediator_3284ContainedLinks(view);
		case DBReportMediatorInputConnector3EditPart.VISUAL_ID:
			return getDBReportMediatorInputConnector_3285ContainedLinks(view);
		case DBReportMediatorOutputConnector3EditPart.VISUAL_ID:
			return getDBReportMediatorOutputConnector_3286ContainedLinks(view);
		case SmooksMediator2EditPart.VISUAL_ID:
			return getSmooksMediator_3287ContainedLinks(view);
		case SmooksMediatorInputConnector2EditPart.VISUAL_ID:
			return getSmooksMediatorInputConnector_3288ContainedLinks(view);
		case SmooksMediatorOutputConnector2EditPart.VISUAL_ID:
			return getSmooksMediatorOutputConnector_3289ContainedLinks(view);
		case SendMediator3EditPart.VISUAL_ID:
			return getSendMediator_3290ContainedLinks(view);
		case SendMediatorInputConnector3EditPart.VISUAL_ID:
			return getSendMediatorInputConnector_3291ContainedLinks(view);
		case SendMediatorOutputConnector3EditPart.VISUAL_ID:
			return getSendMediatorOutputConnector_3292ContainedLinks(view);
		case HeaderMediator3EditPart.VISUAL_ID:
			return getHeaderMediator_3293ContainedLinks(view);
		case HeaderMediatorInputConnector3EditPart.VISUAL_ID:
			return getHeaderMediatorInputConnector_3294ContainedLinks(view);
		case HeaderMediatorOutputConnector3EditPart.VISUAL_ID:
			return getHeaderMediatorOutputConnector_3295ContainedLinks(view);
		case CloneMediator3EditPart.VISUAL_ID:
			return getCloneMediator_3296ContainedLinks(view);
		case CloneMediatorInputConnector3EditPart.VISUAL_ID:
			return getCloneMediatorInputConnector_3297ContainedLinks(view);
		case CloneMediatorOutputConnector3EditPart.VISUAL_ID:
			return getCloneMediatorOutputConnector_3298ContainedLinks(view);
		case CloneMediatorTargetOutputConnector3EditPart.VISUAL_ID:
			return getCloneMediatorTargetOutputConnector_3299ContainedLinks(view);
		case CacheMediator2EditPart.VISUAL_ID:
			return getCacheMediator_3300ContainedLinks(view);
		case CacheMediatorInputConnector2EditPart.VISUAL_ID:
			return getCacheMediatorInputConnector_3301ContainedLinks(view);
		case CacheMediatorOutputConnector2EditPart.VISUAL_ID:
			return getCacheMediatorOutputConnector_3302ContainedLinks(view);
		case IterateMediator3EditPart.VISUAL_ID:
			return getIterateMediator_3303ContainedLinks(view);
		case IterateMediatorInputConnector3EditPart.VISUAL_ID:
			return getIterateMediatorInputConnector_3304ContainedLinks(view);
		case IterateMediatorOutputConnector3EditPart.VISUAL_ID:
			return getIterateMediatorOutputConnector_3305ContainedLinks(view);
		case CalloutMediator3EditPart.VISUAL_ID:
			return getCalloutMediator_3306ContainedLinks(view);
		case CalloutMediatorInputConnector3EditPart.VISUAL_ID:
			return getCalloutMediatorInputConnector_3307ContainedLinks(view);
		case CalloutMediatorOutputConnector3EditPart.VISUAL_ID:
			return getCalloutMediatorOutputConnector_3308ContainedLinks(view);
		case TransactionMediator3EditPart.VISUAL_ID:
			return getTransactionMediator_3309ContainedLinks(view);
		case TransactionMediatorInputConnector3EditPart.VISUAL_ID:
			return getTransactionMediatorInputConnector_3310ContainedLinks(view);
		case TransactionMediatorOutputConnector3EditPart.VISUAL_ID:
			return getTransactionMediatorOutputConnector_3311ContainedLinks(view);
		case RMSequenceMediator3EditPart.VISUAL_ID:
			return getRMSequenceMediator_3312ContainedLinks(view);
		case RMSequenceMediatorInputConnector3EditPart.VISUAL_ID:
			return getRMSequenceMediatorInputConnector_3313ContainedLinks(view);
		case RMSequenceMediatorOutputConnector3EditPart.VISUAL_ID:
			return getRMSequenceMediatorOutputConnector_3314ContainedLinks(view);
		case RuleMediator2EditPart.VISUAL_ID:
			return getRuleMediator_3315ContainedLinks(view);
		case RuleMediatorInputConnector2EditPart.VISUAL_ID:
			return getRuleMediatorInputConnector_3316ContainedLinks(view);
		case RuleMediatorOutputConnector2EditPart.VISUAL_ID:
			return getRuleMediatorOutputConnector_3317ContainedLinks(view);
		case OAuthMediator2EditPart.VISUAL_ID:
			return getOAuthMediator_3318ContainedLinks(view);
		case OAuthMediatorInputConnector2EditPart.VISUAL_ID:
			return getOAuthMediatorInputConnector_3319ContainedLinks(view);
		case OAuthMediatorOutputConnector2EditPart.VISUAL_ID:
			return getOAuthMediatorOutputConnector_3320ContainedLinks(view);
		case AggregateMediator2EditPart.VISUAL_ID:
			return getAggregateMediator_3321ContainedLinks(view);
		case AggregateMediatorInputConnector2EditPart.VISUAL_ID:
			return getAggregateMediatorInputConnector_3322ContainedLinks(view);
		case AggregateMediatorOutputConnector2EditPart.VISUAL_ID:
			return getAggregateMediatorOutputConnector_3323ContainedLinks(view);
		case AggregateMediatorOnCompleteOutputConnector2EditPart.VISUAL_ID:
			return getAggregateMediatorOnCompleteOutputConnector_3324ContainedLinks(view);
		case LogMediator4EditPart.VISUAL_ID:
			return getLogMediator_3325ContainedLinks(view);
		case LogMediatorInputConnector4EditPart.VISUAL_ID:
			return getLogMediatorInputConnector_3326ContainedLinks(view);
		case LogMediatorOutputConnector4EditPart.VISUAL_ID:
			return getLogMediatorOutputConnector_3327ContainedLinks(view);
		case DropMediator5EditPart.VISUAL_ID:
			return getDropMediator_3328ContainedLinks(view);
		case DropMediatorInputConnector4EditPart.VISUAL_ID:
			return getDropMediatorInputConnector_3195ContainedLinks(view);
		case FilterMediator4EditPart.VISUAL_ID:
			return getFilterMediator_3329ContainedLinks(view);
		case FilterMediatorInputConnector4EditPart.VISUAL_ID:
			return getFilterMediatorInputConnector_3330ContainedLinks(view);
		case FilterMediatorPassOutputConnector4EditPart.VISUAL_ID:
			return getFilterMediatorPassOutputConnector_3331ContainedLinks(view);
		case FilterMediatorFailOutputConnector4EditPart.VISUAL_ID:
			return getFilterMediatorFailOutputConnector_3332ContainedLinks(view);
		case PropertyMediator5EditPart.VISUAL_ID:
			return getPropertyMediator_3333ContainedLinks(view);
		case PropertyMediatorInputConnector4EditPart.VISUAL_ID:
			return getPropertyMediatorInputConnector_3203ContainedLinks(view);
		case PropertyMediatorOutputConnector4EditPart.VISUAL_ID:
			return getPropertyMediatorOutputConnector_3204ContainedLinks(view);
		case EnrichMediator4EditPart.VISUAL_ID:
			return getEnrichMediator_3334ContainedLinks(view);
		case EnrichMediatorInputConnector4EditPart.VISUAL_ID:
			return getEnrichMediatorInputConnector_3388ContainedLinks(view);
		case EnrichMediatorOutputConnector4EditPart.VISUAL_ID:
			return getEnrichMediatorOutputConnector_3389ContainedLinks(view);
		case XSLTMediator4EditPart.VISUAL_ID:
			return getXSLTMediator_3337ContainedLinks(view);
		case XSLTMediatorInputConnector4EditPart.VISUAL_ID:
			return getXSLTMediatorInputConnector_3338ContainedLinks(view);
		case XSLTMediatorOutputConnector4EditPart.VISUAL_ID:
			return getXSLTMediatorOutputConnector_3339ContainedLinks(view);
		case SwitchMediator4EditPart.VISUAL_ID:
			return getSwitchMediator_3340ContainedLinks(view);
		case SwitchMediatorInputConnector4EditPart.VISUAL_ID:
			return getSwitchMediatorInputConnector_3341ContainedLinks(view);
		case SwitchCaseBranchOutputConnector4EditPart.VISUAL_ID:
			return getSwitchCaseBranchOutputConnector_3342ContainedLinks(view);
		case SwitchDefaultBranchOutputConnector4EditPart.VISUAL_ID:
			return getSwitchDefaultBranchOutputConnector_3343ContainedLinks(view);
		case FaultMediator4EditPart.VISUAL_ID:
			return getFaultMediator_3344ContainedLinks(view);
		case FaultMediatorInputConnector4EditPart.VISUAL_ID:
			return getFaultMediatorInputConnector_3345ContainedLinks(view);
		case FaultMediatorOutputConnector4EditPart.VISUAL_ID:
			return getFaultMediatorOutputConnector_3346ContainedLinks(view);
		case DBLookupMediator4EditPart.VISUAL_ID:
			return getDBLookupMediator_3347ContainedLinks(view);
		case DBLookupMediatorInputConnector4EditPart.VISUAL_ID:
			return getDBLookupMediatorInputConnector_3348ContainedLinks(view);
		case DBLookupMediatorOutputConnector4EditPart.VISUAL_ID:
			return getDBLookupMediatorOutputConnector_3349ContainedLinks(view);
		case DBReportMediator4EditPart.VISUAL_ID:
			return getDBReportMediator_3350ContainedLinks(view);
		case DBReportMediatorInputConnector4EditPart.VISUAL_ID:
			return getDBReportMediatorInputConnector_3351ContainedLinks(view);
		case DBReportMediatorOutputConnector4EditPart.VISUAL_ID:
			return getDBReportMediatorOutputConnector_3352ContainedLinks(view);
		case SendMediator4EditPart.VISUAL_ID:
			return getSendMediator_3353ContainedLinks(view);
		case SendMediatorInputConnector4EditPart.VISUAL_ID:
			return getSendMediatorInputConnector_3354ContainedLinks(view);
		case SendMediatorOutputConnector4EditPart.VISUAL_ID:
			return getSendMediatorOutputConnector_3355ContainedLinks(view);
		case HeaderMediator4EditPart.VISUAL_ID:
			return getHeaderMediator_3356ContainedLinks(view);
		case HeaderMediatorInputConnector4EditPart.VISUAL_ID:
			return getHeaderMediatorInputConnector_3357ContainedLinks(view);
		case HeaderMediatorOutputConnector4EditPart.VISUAL_ID:
			return getHeaderMediatorOutputConnector_3358ContainedLinks(view);
		case CloneMediator4EditPart.VISUAL_ID:
			return getCloneMediator_3359ContainedLinks(view);
		case CloneMediatorInputConnector4EditPart.VISUAL_ID:
			return getCloneMediatorInputConnector_3360ContainedLinks(view);
		case CloneMediatorOutputConnector4EditPart.VISUAL_ID:
			return getCloneMediatorOutputConnector_3361ContainedLinks(view);
		case CloneMediatorTargetOutputConnector4EditPart.VISUAL_ID:
			return getCloneMediatorTargetOutputConnector_3362ContainedLinks(view);
		case IterateMediator4EditPart.VISUAL_ID:
			return getIterateMediator_3363ContainedLinks(view);
		case IterateMediatorInputConnector4EditPart.VISUAL_ID:
			return getIterateMediatorInputConnector_3364ContainedLinks(view);
		case IterateMediatorOutputConnector4EditPart.VISUAL_ID:
			return getIterateMediatorOutputConnector_3365ContainedLinks(view);
		case CalloutMediator4EditPart.VISUAL_ID:
			return getCalloutMediator_3366ContainedLinks(view);
		case CalloutMediatorInputConnector4EditPart.VISUAL_ID:
			return getCalloutMediatorInputConnector_3367ContainedLinks(view);
		case CalloutMediatorOutputConnector4EditPart.VISUAL_ID:
			return getCalloutMediatorOutputConnector_3368ContainedLinks(view);
		case TransactionMediator4EditPart.VISUAL_ID:
			return getTransactionMediator_3369ContainedLinks(view);
		case TransactionMediatorInputConnector4EditPart.VISUAL_ID:
			return getTransactionMediatorInputConnector_3370ContainedLinks(view);
		case TransactionMediatorOutputConnector4EditPart.VISUAL_ID:
			return getTransactionMediatorOutputConnector_3371ContainedLinks(view);
		case RMSequenceMediator4EditPart.VISUAL_ID:
			return getRMSequenceMediator_3372ContainedLinks(view);
		case RMSequenceMediatorInputConnector4EditPart.VISUAL_ID:
			return getRMSequenceMediatorInputConnector_3373ContainedLinks(view);
		case RMSequenceMediatorOutputConnector4EditPart.VISUAL_ID:
			return getRMSequenceMediatorOutputConnector_3374ContainedLinks(view);
		case Sequence4EditPart.VISUAL_ID:
			return getSequence_3375ContainedLinks(view);
		case SequenceInputConnector4EditPart.VISUAL_ID:
			return getSequenceInputConnector_3376ContainedLinks(view);
		case SequenceOutputConnector4EditPart.VISUAL_ID:
			return getSequenceOutputConnector_3377ContainedLinks(view);
		case ProxyServiceEndpointContainerEditPart.VISUAL_ID:
			return getProxyServiceEndpointContainer_3381ContainedLinks(view);
		case DefaultEndPoint2EditPart.VISUAL_ID:
			return getDefaultEndPoint_3382ContainedLinks(view);
		case DefaultEndPointInputConnectorEditPart.VISUAL_ID:
			return getDefaultEndPointInputConnector_3021ContainedLinks(view);
		case DefaultEndPointOutputConnectorEditPart.VISUAL_ID:
			return getDefaultEndPointOutputConnector_3022ContainedLinks(view);
		case AddressEndPoint2EditPart.VISUAL_ID:
			return getAddressEndPoint_3383ContainedLinks(view);
		case AddressEndPointInputConnectorEditPart.VISUAL_ID:
			return getAddressEndPointInputConnector_3030ContainedLinks(view);
		case AddressEndPointOutputConnectorEditPart.VISUAL_ID:
			return getAddressEndPointOutputConnector_3031ContainedLinks(view);
		case FailoverEndPoint2EditPart.VISUAL_ID:
			return getFailoverEndPoint_3384ContainedLinks(view);
		case FailoverEndPointInputConnectorEditPart.VISUAL_ID:
			return getFailoverEndPointInputConnector_3088ContainedLinks(view);
		case FailoverEndPointOutputConnectorEditPart.VISUAL_ID:
			return getFailoverEndPointOutputConnector_3090ContainedLinks(view);
		case FailoverEndPointWestOutputConnectorEditPart.VISUAL_ID:
			return getFailoverEndPointWestOutputConnector_3097ContainedLinks(view);
		case WSDLEndPoint2EditPart.VISUAL_ID:
			return getWSDLEndPoint_3385ContainedLinks(view);
		case WSDLEndPointInputConnectorEditPart.VISUAL_ID:
			return getWSDLEndPointInputConnector_3092ContainedLinks(view);
		case WSDLEndPointOutputConnectorEditPart.VISUAL_ID:
			return getWSDLEndPointOutputConnector_3093ContainedLinks(view);
		case LoadBalanceEndPoint2EditPart.VISUAL_ID:
			return getLoadBalanceEndPoint_3386ContainedLinks(view);
		case LoadBalanceEndPointInputConnectorEditPart.VISUAL_ID:
			return getLoadBalanceEndPointInputConnector_3095ContainedLinks(view);
		case LoadBalanceEndPointOutputConnectorEditPart.VISUAL_ID:
			return getLoadBalanceEndPointOutputConnector_3096ContainedLinks(view);
		case LoadBalanceEndPointWestOutputConnectorEditPart.VISUAL_ID:
			return getLoadBalanceEndPointWestOutputConnector_3098ContainedLinks(view);
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
		case EsbLinkEditPart.VISUAL_ID:
			return getEsbLink_4001ContainedLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getIncomingLinks(
			View view) {
		switch (EsbVisualIDRegistry.getVisualID(view)) {
		case EsbServerEditPart.VISUAL_ID:
			return getEsbServer_2001IncomingLinks(view);
		case ProxyServiceEditPart.VISUAL_ID:
			return getProxyService_3001IncomingLinks(view);
		case ProxyOutputConnectorEditPart.VISUAL_ID:
			return getProxyOutputConnector_3002IncomingLinks(view);
		case ProxyInputConnectorEditPart.VISUAL_ID:
			return getProxyInputConnector_3003IncomingLinks(view);
		case ProxyServiceSequenceContainerEditPart.VISUAL_ID:
			return getProxyServiceSequenceContainer_3196IncomingLinks(view);
		case ProxyServiceInSequenceEditPart.VISUAL_ID:
			return getProxyServiceInSequence_3197IncomingLinks(view);
		case DropMediator3EditPart.VISUAL_ID:
			return getDropMediator_3191IncomingLinks(view);
		case DropMediatorInputConnectorEditPart.VISUAL_ID:
			return getDropMediatorInputConnector_3008IncomingLinks(view);
		case PropertyMediator3EditPart.VISUAL_ID:
			return getPropertyMediator_3199IncomingLinks(view);
		case PropertyMediatorInputConnectorEditPart.VISUAL_ID:
			return getPropertyMediatorInputConnector_3033IncomingLinks(view);
		case PropertyMediatorOutputConnectorEditPart.VISUAL_ID:
			return getPropertyMediatorOutputConnector_3034IncomingLinks(view);
		case ThrottleMediatorEditPart.VISUAL_ID:
			return getThrottleMediator_3205IncomingLinks(view);
		case ThrottleMediatorInputConnectorEditPart.VISUAL_ID:
			return getThrottleMediatorInputConnector_3121IncomingLinks(view);
		case ThrottleMediatorOutputConnectorEditPart.VISUAL_ID:
			return getThrottleMediatorOutputConnector_3122IncomingLinks(view);
		case FilterMediatorEditPart.VISUAL_ID:
			return getFilterMediator_3209IncomingLinks(view);
		case FilterMediatorInputConnectorEditPart.VISUAL_ID:
			return getFilterMediatorInputConnector_3010IncomingLinks(view);
		case FilterMediatorPassOutputConnectorEditPart.VISUAL_ID:
			return getFilterMediatorPassOutputConnector_3011IncomingLinks(view);
		case FilterMediatorFailOutputConnectorEditPart.VISUAL_ID:
			return getFilterMediatorFailOutputConnector_3012IncomingLinks(view);
		case LogMediatorEditPart.VISUAL_ID:
			return getLogMediator_3210IncomingLinks(view);
		case LogMediatorInputConnectorEditPart.VISUAL_ID:
			return getLogMediatorInputConnector_3018IncomingLinks(view);
		case LogMediatorOutputConnectorEditPart.VISUAL_ID:
			return getLogMediatorOutputConnector_3019IncomingLinks(view);
		case EnrichMediatorEditPart.VISUAL_ID:
			return getEnrichMediator_3387IncomingLinks(view);
		case EnrichMediatorInputConnectorEditPart.VISUAL_ID:
			return getEnrichMediatorInputConnector_3036IncomingLinks(view);
		case EnrichMediatorOutputConnectorEditPart.VISUAL_ID:
			return getEnrichMediatorOutputConnector_3037IncomingLinks(view);
		case XSLTMediatorEditPart.VISUAL_ID:
			return getXSLTMediator_3212IncomingLinks(view);
		case XSLTMediatorInputConnectorEditPart.VISUAL_ID:
			return getXSLTMediatorInputConnector_3039IncomingLinks(view);
		case XSLTMediatorOutputConnectorEditPart.VISUAL_ID:
			return getXSLTMediatorOutputConnector_3040IncomingLinks(view);
		case SwitchMediatorEditPart.VISUAL_ID:
			return getSwitchMediator_3213IncomingLinks(view);
		case SwitchMediatorInputConnectorEditPart.VISUAL_ID:
			return getSwitchMediatorInputConnector_3042IncomingLinks(view);
		case SwitchCaseBranchOutputConnectorEditPart.VISUAL_ID:
			return getSwitchCaseBranchOutputConnector_3043IncomingLinks(view);
		case SwitchDefaultBranchOutputConnectorEditPart.VISUAL_ID:
			return getSwitchDefaultBranchOutputConnector_3044IncomingLinks(view);
		case SequenceEditPart.VISUAL_ID:
			return getSequence_3214IncomingLinks(view);
		case SequenceInputConnectorEditPart.VISUAL_ID:
			return getSequenceInputConnector_3049IncomingLinks(view);
		case SequenceOutputConnectorEditPart.VISUAL_ID:
			return getSequenceOutputConnector_3050IncomingLinks(view);
		case EventMediatorEditPart.VISUAL_ID:
			return getEventMediator_3215IncomingLinks(view);
		case EventMediatorInputConnectorEditPart.VISUAL_ID:
			return getEventMediatorInputConnector_3052IncomingLinks(view);
		case EventMediatorOutputConnectorEditPart.VISUAL_ID:
			return getEventMediatorOutputConnector_3053IncomingLinks(view);
		case EntitlementMediatorEditPart.VISUAL_ID:
			return getEntitlementMediator_3216IncomingLinks(view);
		case EntitlementMediatorInputConnectorEditPart.VISUAL_ID:
			return getEntitlementMediatorInputConnector_3055IncomingLinks(view);
		case EntitlementMediatorOutputConnectorEditPart.VISUAL_ID:
			return getEntitlementMediatorOutputConnector_3056IncomingLinks(view);
		case ClassMediatorEditPart.VISUAL_ID:
			return getClassMediator_3217IncomingLinks(view);
		case ClassMediatorInputConnectorEditPart.VISUAL_ID:
			return getClassMediatorInputConnector_3058IncomingLinks(view);
		case ClassMediatorOutputConnectorEditPart.VISUAL_ID:
			return getClassMediatorOutputConnector_3059IncomingLinks(view);
		case SpringMediatorEditPart.VISUAL_ID:
			return getSpringMediator_3218IncomingLinks(view);
		case SpringMediatorInputConnectorEditPart.VISUAL_ID:
			return getSpringMediatorInputConnector_3061IncomingLinks(view);
		case SpringMediatorOutputConnectorEditPart.VISUAL_ID:
			return getSpringMediatorOutputConnector_3062IncomingLinks(view);
		case ScriptMediatorEditPart.VISUAL_ID:
			return getScriptMediator_3219IncomingLinks(view);
		case ScriptMediatorInputConnectorEditPart.VISUAL_ID:
			return getScriptMediatorInputConnector_3064IncomingLinks(view);
		case ScriptMediatorOutputConnectorEditPart.VISUAL_ID:
			return getScriptMediatorOutputConnector_3065IncomingLinks(view);
		case FaultMediatorEditPart.VISUAL_ID:
			return getFaultMediator_3220IncomingLinks(view);
		case FaultMediatorInputConnectorEditPart.VISUAL_ID:
			return getFaultMediatorInputConnector_3067IncomingLinks(view);
		case FaultMediatorOutputConnectorEditPart.VISUAL_ID:
			return getFaultMediatorOutputConnector_3068IncomingLinks(view);
		case XQueryMediatorEditPart.VISUAL_ID:
			return getXQueryMediator_3221IncomingLinks(view);
		case XQueryMediatorInputConnectorEditPart.VISUAL_ID:
			return getXQueryMediatorInputConnector_3070IncomingLinks(view);
		case XQueryMediatorOutputConnectorEditPart.VISUAL_ID:
			return getXQueryMediatorOutputConnector_3071IncomingLinks(view);
		case CommandMediatorEditPart.VISUAL_ID:
			return getCommandMediator_3222IncomingLinks(view);
		case CommandMediatorInputConnectorEditPart.VISUAL_ID:
			return getCommandMediatorInputConnector_3073IncomingLinks(view);
		case CommandMediatorOutputConnectorEditPart.VISUAL_ID:
			return getCommandMediatorOutputConnector_3074IncomingLinks(view);
		case DBLookupMediatorEditPart.VISUAL_ID:
			return getDBLookupMediator_3223IncomingLinks(view);
		case DBLookupMediatorInputConnectorEditPart.VISUAL_ID:
			return getDBLookupMediatorInputConnector_3076IncomingLinks(view);
		case DBLookupMediatorOutputConnectorEditPart.VISUAL_ID:
			return getDBLookupMediatorOutputConnector_3077IncomingLinks(view);
		case DBReportMediatorEditPart.VISUAL_ID:
			return getDBReportMediator_3224IncomingLinks(view);
		case DBReportMediatorInputConnectorEditPart.VISUAL_ID:
			return getDBReportMediatorInputConnector_3079IncomingLinks(view);
		case DBReportMediatorOutputConnectorEditPart.VISUAL_ID:
			return getDBReportMediatorOutputConnector_3080IncomingLinks(view);
		case SmooksMediatorEditPart.VISUAL_ID:
			return getSmooksMediator_3225IncomingLinks(view);
		case SmooksMediatorInputConnectorEditPart.VISUAL_ID:
			return getSmooksMediatorInputConnector_3082IncomingLinks(view);
		case SmooksMediatorOutputConnectorEditPart.VISUAL_ID:
			return getSmooksMediatorOutputConnector_3083IncomingLinks(view);
		case SendMediatorEditPart.VISUAL_ID:
			return getSendMediator_3226IncomingLinks(view);
		case SendMediatorInputConnectorEditPart.VISUAL_ID:
			return getSendMediatorInputConnector_3085IncomingLinks(view);
		case SendMediatorOutputConnectorEditPart.VISUAL_ID:
			return getSendMediatorOutputConnector_3086IncomingLinks(view);
		case HeaderMediatorEditPart.VISUAL_ID:
			return getHeaderMediator_3227IncomingLinks(view);
		case HeaderMediatorInputConnectorEditPart.VISUAL_ID:
			return getHeaderMediatorInputConnector_3100IncomingLinks(view);
		case HeaderMediatorOutputConnectorEditPart.VISUAL_ID:
			return getHeaderMediatorOutputConnector_3101IncomingLinks(view);
		case CloneMediatorEditPart.VISUAL_ID:
			return getCloneMediator_3228IncomingLinks(view);
		case CloneMediatorInputConnectorEditPart.VISUAL_ID:
			return getCloneMediatorInputConnector_3103IncomingLinks(view);
		case CloneMediatorOutputConnectorEditPart.VISUAL_ID:
			return getCloneMediatorOutputConnector_3104IncomingLinks(view);
		case CloneMediatorTargetOutputConnectorEditPart.VISUAL_ID:
			return getCloneMediatorTargetOutputConnector_3133IncomingLinks(view);
		case CacheMediatorEditPart.VISUAL_ID:
			return getCacheMediator_3229IncomingLinks(view);
		case CacheMediatorInputConnectorEditPart.VISUAL_ID:
			return getCacheMediatorInputConnector_3106IncomingLinks(view);
		case CacheMediatorOutputConnectorEditPart.VISUAL_ID:
			return getCacheMediatorOutputConnector_3107IncomingLinks(view);
		case IterateMediatorEditPart.VISUAL_ID:
			return getIterateMediator_3230IncomingLinks(view);
		case IterateMediatorInputConnectorEditPart.VISUAL_ID:
			return getIterateMediatorInputConnector_3109IncomingLinks(view);
		case IterateMediatorOutputConnectorEditPart.VISUAL_ID:
			return getIterateMediatorOutputConnector_3110IncomingLinks(view);
		case CalloutMediatorEditPart.VISUAL_ID:
			return getCalloutMediator_3231IncomingLinks(view);
		case CalloutMediatorInputConnectorEditPart.VISUAL_ID:
			return getCalloutMediatorInputConnector_3115IncomingLinks(view);
		case CalloutMediatorOutputConnectorEditPart.VISUAL_ID:
			return getCalloutMediatorOutputConnector_3116IncomingLinks(view);
		case TransactionMediatorEditPart.VISUAL_ID:
			return getTransactionMediator_3232IncomingLinks(view);
		case TransactionMediatorInputConnectorEditPart.VISUAL_ID:
			return getTransactionMediatorInputConnector_3118IncomingLinks(view);
		case TransactionMediatorOutputConnectorEditPart.VISUAL_ID:
			return getTransactionMediatorOutputConnector_3119IncomingLinks(view);
		case RMSequenceMediatorEditPart.VISUAL_ID:
			return getRMSequenceMediator_3233IncomingLinks(view);
		case RMSequenceMediatorInputConnectorEditPart.VISUAL_ID:
			return getRMSequenceMediatorInputConnector_3124IncomingLinks(view);
		case RMSequenceMediatorOutputConnectorEditPart.VISUAL_ID:
			return getRMSequenceMediatorOutputConnector_3125IncomingLinks(view);
		case RuleMediatorEditPart.VISUAL_ID:
			return getRuleMediator_3234IncomingLinks(view);
		case RuleMediatorInputConnectorEditPart.VISUAL_ID:
			return getRuleMediatorInputConnector_3127IncomingLinks(view);
		case RuleMediatorOutputConnectorEditPart.VISUAL_ID:
			return getRuleMediatorOutputConnector_3128IncomingLinks(view);
		case OAuthMediatorEditPart.VISUAL_ID:
			return getOAuthMediator_3235IncomingLinks(view);
		case OAuthMediatorInputConnectorEditPart.VISUAL_ID:
			return getOAuthMediatorInputConnector_3130IncomingLinks(view);
		case OAuthMediatorOutputConnectorEditPart.VISUAL_ID:
			return getOAuthMediatorOutputConnector_3131IncomingLinks(view);
		case AggregateMediatorEditPart.VISUAL_ID:
			return getAggregateMediator_3236IncomingLinks(view);
		case AggregateMediatorInputConnectorEditPart.VISUAL_ID:
			return getAggregateMediatorInputConnector_3112IncomingLinks(view);
		case AggregateMediatorOutputConnectorEditPart.VISUAL_ID:
			return getAggregateMediatorOutputConnector_3113IncomingLinks(view);
		case AggregateMediatorOnCompleteOutputConnectorEditPart.VISUAL_ID:
			return getAggregateMediatorOnCompleteOutputConnector_3132IncomingLinks(view);
		case LogMediator2EditPart.VISUAL_ID:
			return getLogMediator_3134IncomingLinks(view);
		case LogMediatorInputConnector2EditPart.VISUAL_ID:
			return getLogMediatorInputConnector_3135IncomingLinks(view);
		case LogMediatorOutputConnector2EditPart.VISUAL_ID:
			return getLogMediatorOutputConnector_3136IncomingLinks(view);
		case DropMediator2EditPart.VISUAL_ID:
			return getDropMediator_3137IncomingLinks(view);
		case DropMediatorInputConnector2EditPart.VISUAL_ID:
			return getDropMediatorInputConnector_3138IncomingLinks(view);
		case FilterMediator2EditPart.VISUAL_ID:
			return getFilterMediator_3139IncomingLinks(view);
		case FilterMediatorInputConnector2EditPart.VISUAL_ID:
			return getFilterMediatorInputConnector_3140IncomingLinks(view);
		case FilterMediatorPassOutputConnector2EditPart.VISUAL_ID:
			return getFilterMediatorPassOutputConnector_3141IncomingLinks(view);
		case FilterMediatorFailOutputConnector2EditPart.VISUAL_ID:
			return getFilterMediatorFailOutputConnector_3142IncomingLinks(view);
		case PropertyMediator2EditPart.VISUAL_ID:
			return getPropertyMediator_3143IncomingLinks(view);
		case PropertyMediatorInputConnector2EditPart.VISUAL_ID:
			return getPropertyMediatorInputConnector_3144IncomingLinks(view);
		case PropertyMediatorOutputConnector2EditPart.VISUAL_ID:
			return getPropertyMediatorOutputConnector_3145IncomingLinks(view);
		case EnrichMediator2EditPart.VISUAL_ID:
			return getEnrichMediator_3146IncomingLinks(view);
		case EnrichMediatorInputConnector2EditPart.VISUAL_ID:
			return getEnrichMediatorInputConnector_3147IncomingLinks(view);
		case EnrichMediatorOutputConnector2EditPart.VISUAL_ID:
			return getEnrichMediatorOutputConnector_3148IncomingLinks(view);
		case XSLTMediator2EditPart.VISUAL_ID:
			return getXSLTMediator_3149IncomingLinks(view);
		case XSLTMediatorInputConnector2EditPart.VISUAL_ID:
			return getXSLTMediatorInputConnector_3150IncomingLinks(view);
		case XSLTMediatorOutputConnector2EditPart.VISUAL_ID:
			return getXSLTMediatorOutputConnector_3151IncomingLinks(view);
		case SwitchMediator2EditPart.VISUAL_ID:
			return getSwitchMediator_3152IncomingLinks(view);
		case SwitchMediatorInputConnector2EditPart.VISUAL_ID:
			return getSwitchMediatorInputConnector_3153IncomingLinks(view);
		case SwitchCaseBranchOutputConnector2EditPart.VISUAL_ID:
			return getSwitchCaseBranchOutputConnector_3154IncomingLinks(view);
		case SwitchDefaultBranchOutputConnector2EditPart.VISUAL_ID:
			return getSwitchDefaultBranchOutputConnector_3155IncomingLinks(view);
		case FaultMediator2EditPart.VISUAL_ID:
			return getFaultMediator_3156IncomingLinks(view);
		case FaultMediatorInputConnector2EditPart.VISUAL_ID:
			return getFaultMediatorInputConnector_3157IncomingLinks(view);
		case FaultMediatorOutputConnector2EditPart.VISUAL_ID:
			return getFaultMediatorOutputConnector_3158IncomingLinks(view);
		case DBLookupMediator2EditPart.VISUAL_ID:
			return getDBLookupMediator_3159IncomingLinks(view);
		case DBLookupMediatorInputConnector2EditPart.VISUAL_ID:
			return getDBLookupMediatorInputConnector_3160IncomingLinks(view);
		case DBLookupMediatorOutputConnector2EditPart.VISUAL_ID:
			return getDBLookupMediatorOutputConnector_3161IncomingLinks(view);
		case DBReportMediator2EditPart.VISUAL_ID:
			return getDBReportMediator_3162IncomingLinks(view);
		case DBReportMediatorInputConnector2EditPart.VISUAL_ID:
			return getDBReportMediatorInputConnector_3163IncomingLinks(view);
		case DBReportMediatorOutputConnector2EditPart.VISUAL_ID:
			return getDBReportMediatorOutputConnector_3164IncomingLinks(view);
		case SendMediator2EditPart.VISUAL_ID:
			return getSendMediator_3165IncomingLinks(view);
		case SendMediatorInputConnector2EditPart.VISUAL_ID:
			return getSendMediatorInputConnector_3166IncomingLinks(view);
		case SendMediatorOutputConnector2EditPart.VISUAL_ID:
			return getSendMediatorOutputConnector_3167IncomingLinks(view);
		case HeaderMediator2EditPart.VISUAL_ID:
			return getHeaderMediator_3168IncomingLinks(view);
		case HeaderMediatorInputConnector2EditPart.VISUAL_ID:
			return getHeaderMediatorInputConnector_3169IncomingLinks(view);
		case HeaderMediatorOutputConnector2EditPart.VISUAL_ID:
			return getHeaderMediatorOutputConnector_3170IncomingLinks(view);
		case CloneMediator2EditPart.VISUAL_ID:
			return getCloneMediator_3171IncomingLinks(view);
		case CloneMediatorInputConnector2EditPart.VISUAL_ID:
			return getCloneMediatorInputConnector_3172IncomingLinks(view);
		case CloneMediatorOutputConnector2EditPart.VISUAL_ID:
			return getCloneMediatorOutputConnector_3173IncomingLinks(view);
		case CloneMediatorTargetOutputConnector2EditPart.VISUAL_ID:
			return getCloneMediatorTargetOutputConnector_3174IncomingLinks(view);
		case IterateMediator2EditPart.VISUAL_ID:
			return getIterateMediator_3175IncomingLinks(view);
		case IterateMediatorInputConnector2EditPart.VISUAL_ID:
			return getIterateMediatorInputConnector_3176IncomingLinks(view);
		case IterateMediatorOutputConnector2EditPart.VISUAL_ID:
			return getIterateMediatorOutputConnector_3177IncomingLinks(view);
		case CalloutMediator2EditPart.VISUAL_ID:
			return getCalloutMediator_3178IncomingLinks(view);
		case CalloutMediatorInputConnector2EditPart.VISUAL_ID:
			return getCalloutMediatorInputConnector_3181IncomingLinks(view);
		case CalloutMediatorOutputConnector2EditPart.VISUAL_ID:
			return getCalloutMediatorOutputConnector_3182IncomingLinks(view);
		case TransactionMediator2EditPart.VISUAL_ID:
			return getTransactionMediator_3179IncomingLinks(view);
		case TransactionMediatorInputConnector2EditPart.VISUAL_ID:
			return getTransactionMediatorInputConnector_3183IncomingLinks(view);
		case TransactionMediatorOutputConnector2EditPart.VISUAL_ID:
			return getTransactionMediatorOutputConnector_3184IncomingLinks(view);
		case RMSequenceMediator2EditPart.VISUAL_ID:
			return getRMSequenceMediator_3180IncomingLinks(view);
		case RMSequenceMediatorInputConnector2EditPart.VISUAL_ID:
			return getRMSequenceMediatorInputConnector_3185IncomingLinks(view);
		case RMSequenceMediatorOutputConnector2EditPart.VISUAL_ID:
			return getRMSequenceMediatorOutputConnector_3186IncomingLinks(view);
		case Sequence2EditPart.VISUAL_ID:
			return getSequence_3187IncomingLinks(view);
		case SequenceInputConnector2EditPart.VISUAL_ID:
			return getSequenceInputConnector_3188IncomingLinks(view);
		case SequenceOutputConnector2EditPart.VISUAL_ID:
			return getSequenceOutputConnector_3189IncomingLinks(view);
		case ProxyServiceOutSequenceEditPart.VISUAL_ID:
			return getProxyServiceOutSequence_3198IncomingLinks(view);
		case DropMediator4EditPart.VISUAL_ID:
			return getDropMediator_3194IncomingLinks(view);
		case DropMediatorInputConnector3EditPart.VISUAL_ID:
			return getDropMediatorInputConnector_3192IncomingLinks(view);
		case PropertyMediator4EditPart.VISUAL_ID:
			return getPropertyMediator_3200IncomingLinks(view);
		case PropertyMediatorInputConnector3EditPart.VISUAL_ID:
			return getPropertyMediatorInputConnector_3201IncomingLinks(view);
		case PropertyMediatorOutputConnector3EditPart.VISUAL_ID:
			return getPropertyMediatorOutputConnector_3202IncomingLinks(view);
		case ThrottleMediator2EditPart.VISUAL_ID:
			return getThrottleMediator_3206IncomingLinks(view);
		case ThrottleMediatorInputConnector2EditPart.VISUAL_ID:
			return getThrottleMediatorInputConnector_3207IncomingLinks(view);
		case ThrottleMediatorOutputConnector2EditPart.VISUAL_ID:
			return getThrottleMediatorOutputConnector_3208IncomingLinks(view);
		case FilterMediator3EditPart.VISUAL_ID:
			return getFilterMediator_3237IncomingLinks(view);
		case FilterMediatorInputConnector3EditPart.VISUAL_ID:
			return getFilterMediatorInputConnector_3238IncomingLinks(view);
		case FilterMediatorPassOutputConnector3EditPart.VISUAL_ID:
			return getFilterMediatorPassOutputConnector_3239IncomingLinks(view);
		case FilterMediatorFailOutputConnector3EditPart.VISUAL_ID:
			return getFilterMediatorFailOutputConnector_3240IncomingLinks(view);
		case LogMediator3EditPart.VISUAL_ID:
			return getLogMediator_3241IncomingLinks(view);
		case LogMediatorInputConnector3EditPart.VISUAL_ID:
			return getLogMediatorInputConnector_3242IncomingLinks(view);
		case LogMediatorOutputConnector3EditPart.VISUAL_ID:
			return getLogMediatorOutputConnector_3243IncomingLinks(view);
		case EnrichMediator3EditPart.VISUAL_ID:
			return getEnrichMediator_3244IncomingLinks(view);
		case EnrichMediatorInputConnector3EditPart.VISUAL_ID:
			return getEnrichMediatorInputConnector_3245IncomingLinks(view);
		case EnrichMediatorOutputConnector3EditPart.VISUAL_ID:
			return getEnrichMediatorOutputConnector_3246IncomingLinks(view);
		case XSLTMediator3EditPart.VISUAL_ID:
			return getXSLTMediator_3247IncomingLinks(view);
		case XSLTMediatorInputConnector3EditPart.VISUAL_ID:
			return getXSLTMediatorInputConnector_3248IncomingLinks(view);
		case XSLTMediatorOutputConnector3EditPart.VISUAL_ID:
			return getXSLTMediatorOutputConnector_3249IncomingLinks(view);
		case SwitchMediator3EditPart.VISUAL_ID:
			return getSwitchMediator_3250IncomingLinks(view);
		case SwitchMediatorInputConnector3EditPart.VISUAL_ID:
			return getSwitchMediatorInputConnector_3251IncomingLinks(view);
		case SwitchCaseBranchOutputConnector3EditPart.VISUAL_ID:
			return getSwitchCaseBranchOutputConnector_3252IncomingLinks(view);
		case SwitchDefaultBranchOutputConnector3EditPart.VISUAL_ID:
			return getSwitchDefaultBranchOutputConnector_3253IncomingLinks(view);
		case Sequence3EditPart.VISUAL_ID:
			return getSequence_3254IncomingLinks(view);
		case SequenceInputConnector3EditPart.VISUAL_ID:
			return getSequenceInputConnector_3255IncomingLinks(view);
		case SequenceOutputConnector3EditPart.VISUAL_ID:
			return getSequenceOutputConnector_3256IncomingLinks(view);
		case EventMediator2EditPart.VISUAL_ID:
			return getEventMediator_3257IncomingLinks(view);
		case EventMediatorInputConnector2EditPart.VISUAL_ID:
			return getEventMediatorInputConnector_3258IncomingLinks(view);
		case EventMediatorOutputConnector2EditPart.VISUAL_ID:
			return getEventMediatorOutputConnector_3259IncomingLinks(view);
		case EntitlementMediator2EditPart.VISUAL_ID:
			return getEntitlementMediator_3260IncomingLinks(view);
		case EntitlementMediatorInputConnector2EditPart.VISUAL_ID:
			return getEntitlementMediatorInputConnector_3261IncomingLinks(view);
		case EntitlementMediatorOutputConnector2EditPart.VISUAL_ID:
			return getEntitlementMediatorOutputConnector_3262IncomingLinks(view);
		case ClassMediator2EditPart.VISUAL_ID:
			return getClassMediator_3263IncomingLinks(view);
		case ClassMediatorInputConnector2EditPart.VISUAL_ID:
			return getClassMediatorInputConnector_3264IncomingLinks(view);
		case ClassMediatorOutputConnector2EditPart.VISUAL_ID:
			return getClassMediatorOutputConnector_3265IncomingLinks(view);
		case SpringMediator2EditPart.VISUAL_ID:
			return getSpringMediator_3266IncomingLinks(view);
		case SpringMediatorInputConnector2EditPart.VISUAL_ID:
			return getSpringMediatorInputConnector_3267IncomingLinks(view);
		case SpringMediatorOutputConnector2EditPart.VISUAL_ID:
			return getSpringMediatorOutputConnector_3268IncomingLinks(view);
		case ScriptMediator2EditPart.VISUAL_ID:
			return getScriptMediator_3269IncomingLinks(view);
		case ScriptMediatorInputConnector2EditPart.VISUAL_ID:
			return getScriptMediatorInputConnector_3270IncomingLinks(view);
		case ScriptMediatorOutputConnector2EditPart.VISUAL_ID:
			return getScriptMediatorOutputConnector_3271IncomingLinks(view);
		case FaultMediator3EditPart.VISUAL_ID:
			return getFaultMediator_3272IncomingLinks(view);
		case FaultMediatorInputConnector3EditPart.VISUAL_ID:
			return getFaultMediatorInputConnector_3273IncomingLinks(view);
		case FaultMediatorOutputConnector3EditPart.VISUAL_ID:
			return getFaultMediatorOutputConnector_3274IncomingLinks(view);
		case XQueryMediator2EditPart.VISUAL_ID:
			return getXQueryMediator_3275IncomingLinks(view);
		case XQueryMediatorInputConnector2EditPart.VISUAL_ID:
			return getXQueryMediatorInputConnector_3276IncomingLinks(view);
		case XQueryMediatorOutputConnector2EditPart.VISUAL_ID:
			return getXQueryMediatorOutputConnector_3277IncomingLinks(view);
		case CommandMediator2EditPart.VISUAL_ID:
			return getCommandMediator_3278IncomingLinks(view);
		case CommandMediatorInputConnector2EditPart.VISUAL_ID:
			return getCommandMediatorInputConnector_3279IncomingLinks(view);
		case CommandMediatorOutputConnector2EditPart.VISUAL_ID:
			return getCommandMediatorOutputConnector_3280IncomingLinks(view);
		case DBLookupMediator3EditPart.VISUAL_ID:
			return getDBLookupMediator_3281IncomingLinks(view);
		case DBLookupMediatorInputConnector3EditPart.VISUAL_ID:
			return getDBLookupMediatorInputConnector_3282IncomingLinks(view);
		case DBLookupMediatorOutputConnector3EditPart.VISUAL_ID:
			return getDBLookupMediatorOutputConnector_3283IncomingLinks(view);
		case DBReportMediator3EditPart.VISUAL_ID:
			return getDBReportMediator_3284IncomingLinks(view);
		case DBReportMediatorInputConnector3EditPart.VISUAL_ID:
			return getDBReportMediatorInputConnector_3285IncomingLinks(view);
		case DBReportMediatorOutputConnector3EditPart.VISUAL_ID:
			return getDBReportMediatorOutputConnector_3286IncomingLinks(view);
		case SmooksMediator2EditPart.VISUAL_ID:
			return getSmooksMediator_3287IncomingLinks(view);
		case SmooksMediatorInputConnector2EditPart.VISUAL_ID:
			return getSmooksMediatorInputConnector_3288IncomingLinks(view);
		case SmooksMediatorOutputConnector2EditPart.VISUAL_ID:
			return getSmooksMediatorOutputConnector_3289IncomingLinks(view);
		case SendMediator3EditPart.VISUAL_ID:
			return getSendMediator_3290IncomingLinks(view);
		case SendMediatorInputConnector3EditPart.VISUAL_ID:
			return getSendMediatorInputConnector_3291IncomingLinks(view);
		case SendMediatorOutputConnector3EditPart.VISUAL_ID:
			return getSendMediatorOutputConnector_3292IncomingLinks(view);
		case HeaderMediator3EditPart.VISUAL_ID:
			return getHeaderMediator_3293IncomingLinks(view);
		case HeaderMediatorInputConnector3EditPart.VISUAL_ID:
			return getHeaderMediatorInputConnector_3294IncomingLinks(view);
		case HeaderMediatorOutputConnector3EditPart.VISUAL_ID:
			return getHeaderMediatorOutputConnector_3295IncomingLinks(view);
		case CloneMediator3EditPart.VISUAL_ID:
			return getCloneMediator_3296IncomingLinks(view);
		case CloneMediatorInputConnector3EditPart.VISUAL_ID:
			return getCloneMediatorInputConnector_3297IncomingLinks(view);
		case CloneMediatorOutputConnector3EditPart.VISUAL_ID:
			return getCloneMediatorOutputConnector_3298IncomingLinks(view);
		case CloneMediatorTargetOutputConnector3EditPart.VISUAL_ID:
			return getCloneMediatorTargetOutputConnector_3299IncomingLinks(view);
		case CacheMediator2EditPart.VISUAL_ID:
			return getCacheMediator_3300IncomingLinks(view);
		case CacheMediatorInputConnector2EditPart.VISUAL_ID:
			return getCacheMediatorInputConnector_3301IncomingLinks(view);
		case CacheMediatorOutputConnector2EditPart.VISUAL_ID:
			return getCacheMediatorOutputConnector_3302IncomingLinks(view);
		case IterateMediator3EditPart.VISUAL_ID:
			return getIterateMediator_3303IncomingLinks(view);
		case IterateMediatorInputConnector3EditPart.VISUAL_ID:
			return getIterateMediatorInputConnector_3304IncomingLinks(view);
		case IterateMediatorOutputConnector3EditPart.VISUAL_ID:
			return getIterateMediatorOutputConnector_3305IncomingLinks(view);
		case CalloutMediator3EditPart.VISUAL_ID:
			return getCalloutMediator_3306IncomingLinks(view);
		case CalloutMediatorInputConnector3EditPart.VISUAL_ID:
			return getCalloutMediatorInputConnector_3307IncomingLinks(view);
		case CalloutMediatorOutputConnector3EditPart.VISUAL_ID:
			return getCalloutMediatorOutputConnector_3308IncomingLinks(view);
		case TransactionMediator3EditPart.VISUAL_ID:
			return getTransactionMediator_3309IncomingLinks(view);
		case TransactionMediatorInputConnector3EditPart.VISUAL_ID:
			return getTransactionMediatorInputConnector_3310IncomingLinks(view);
		case TransactionMediatorOutputConnector3EditPart.VISUAL_ID:
			return getTransactionMediatorOutputConnector_3311IncomingLinks(view);
		case RMSequenceMediator3EditPart.VISUAL_ID:
			return getRMSequenceMediator_3312IncomingLinks(view);
		case RMSequenceMediatorInputConnector3EditPart.VISUAL_ID:
			return getRMSequenceMediatorInputConnector_3313IncomingLinks(view);
		case RMSequenceMediatorOutputConnector3EditPart.VISUAL_ID:
			return getRMSequenceMediatorOutputConnector_3314IncomingLinks(view);
		case RuleMediator2EditPart.VISUAL_ID:
			return getRuleMediator_3315IncomingLinks(view);
		case RuleMediatorInputConnector2EditPart.VISUAL_ID:
			return getRuleMediatorInputConnector_3316IncomingLinks(view);
		case RuleMediatorOutputConnector2EditPart.VISUAL_ID:
			return getRuleMediatorOutputConnector_3317IncomingLinks(view);
		case OAuthMediator2EditPart.VISUAL_ID:
			return getOAuthMediator_3318IncomingLinks(view);
		case OAuthMediatorInputConnector2EditPart.VISUAL_ID:
			return getOAuthMediatorInputConnector_3319IncomingLinks(view);
		case OAuthMediatorOutputConnector2EditPart.VISUAL_ID:
			return getOAuthMediatorOutputConnector_3320IncomingLinks(view);
		case AggregateMediator2EditPart.VISUAL_ID:
			return getAggregateMediator_3321IncomingLinks(view);
		case AggregateMediatorInputConnector2EditPart.VISUAL_ID:
			return getAggregateMediatorInputConnector_3322IncomingLinks(view);
		case AggregateMediatorOutputConnector2EditPart.VISUAL_ID:
			return getAggregateMediatorOutputConnector_3323IncomingLinks(view);
		case AggregateMediatorOnCompleteOutputConnector2EditPart.VISUAL_ID:
			return getAggregateMediatorOnCompleteOutputConnector_3324IncomingLinks(view);
		case LogMediator4EditPart.VISUAL_ID:
			return getLogMediator_3325IncomingLinks(view);
		case LogMediatorInputConnector4EditPart.VISUAL_ID:
			return getLogMediatorInputConnector_3326IncomingLinks(view);
		case LogMediatorOutputConnector4EditPart.VISUAL_ID:
			return getLogMediatorOutputConnector_3327IncomingLinks(view);
		case DropMediator5EditPart.VISUAL_ID:
			return getDropMediator_3328IncomingLinks(view);
		case DropMediatorInputConnector4EditPart.VISUAL_ID:
			return getDropMediatorInputConnector_3195IncomingLinks(view);
		case FilterMediator4EditPart.VISUAL_ID:
			return getFilterMediator_3329IncomingLinks(view);
		case FilterMediatorInputConnector4EditPart.VISUAL_ID:
			return getFilterMediatorInputConnector_3330IncomingLinks(view);
		case FilterMediatorPassOutputConnector4EditPart.VISUAL_ID:
			return getFilterMediatorPassOutputConnector_3331IncomingLinks(view);
		case FilterMediatorFailOutputConnector4EditPart.VISUAL_ID:
			return getFilterMediatorFailOutputConnector_3332IncomingLinks(view);
		case PropertyMediator5EditPart.VISUAL_ID:
			return getPropertyMediator_3333IncomingLinks(view);
		case PropertyMediatorInputConnector4EditPart.VISUAL_ID:
			return getPropertyMediatorInputConnector_3203IncomingLinks(view);
		case PropertyMediatorOutputConnector4EditPart.VISUAL_ID:
			return getPropertyMediatorOutputConnector_3204IncomingLinks(view);
		case EnrichMediator4EditPart.VISUAL_ID:
			return getEnrichMediator_3334IncomingLinks(view);
		case EnrichMediatorInputConnector4EditPart.VISUAL_ID:
			return getEnrichMediatorInputConnector_3388IncomingLinks(view);
		case EnrichMediatorOutputConnector4EditPart.VISUAL_ID:
			return getEnrichMediatorOutputConnector_3389IncomingLinks(view);
		case XSLTMediator4EditPart.VISUAL_ID:
			return getXSLTMediator_3337IncomingLinks(view);
		case XSLTMediatorInputConnector4EditPart.VISUAL_ID:
			return getXSLTMediatorInputConnector_3338IncomingLinks(view);
		case XSLTMediatorOutputConnector4EditPart.VISUAL_ID:
			return getXSLTMediatorOutputConnector_3339IncomingLinks(view);
		case SwitchMediator4EditPart.VISUAL_ID:
			return getSwitchMediator_3340IncomingLinks(view);
		case SwitchMediatorInputConnector4EditPart.VISUAL_ID:
			return getSwitchMediatorInputConnector_3341IncomingLinks(view);
		case SwitchCaseBranchOutputConnector4EditPart.VISUAL_ID:
			return getSwitchCaseBranchOutputConnector_3342IncomingLinks(view);
		case SwitchDefaultBranchOutputConnector4EditPart.VISUAL_ID:
			return getSwitchDefaultBranchOutputConnector_3343IncomingLinks(view);
		case FaultMediator4EditPart.VISUAL_ID:
			return getFaultMediator_3344IncomingLinks(view);
		case FaultMediatorInputConnector4EditPart.VISUAL_ID:
			return getFaultMediatorInputConnector_3345IncomingLinks(view);
		case FaultMediatorOutputConnector4EditPart.VISUAL_ID:
			return getFaultMediatorOutputConnector_3346IncomingLinks(view);
		case DBLookupMediator4EditPart.VISUAL_ID:
			return getDBLookupMediator_3347IncomingLinks(view);
		case DBLookupMediatorInputConnector4EditPart.VISUAL_ID:
			return getDBLookupMediatorInputConnector_3348IncomingLinks(view);
		case DBLookupMediatorOutputConnector4EditPart.VISUAL_ID:
			return getDBLookupMediatorOutputConnector_3349IncomingLinks(view);
		case DBReportMediator4EditPart.VISUAL_ID:
			return getDBReportMediator_3350IncomingLinks(view);
		case DBReportMediatorInputConnector4EditPart.VISUAL_ID:
			return getDBReportMediatorInputConnector_3351IncomingLinks(view);
		case DBReportMediatorOutputConnector4EditPart.VISUAL_ID:
			return getDBReportMediatorOutputConnector_3352IncomingLinks(view);
		case SendMediator4EditPart.VISUAL_ID:
			return getSendMediator_3353IncomingLinks(view);
		case SendMediatorInputConnector4EditPart.VISUAL_ID:
			return getSendMediatorInputConnector_3354IncomingLinks(view);
		case SendMediatorOutputConnector4EditPart.VISUAL_ID:
			return getSendMediatorOutputConnector_3355IncomingLinks(view);
		case HeaderMediator4EditPart.VISUAL_ID:
			return getHeaderMediator_3356IncomingLinks(view);
		case HeaderMediatorInputConnector4EditPart.VISUAL_ID:
			return getHeaderMediatorInputConnector_3357IncomingLinks(view);
		case HeaderMediatorOutputConnector4EditPart.VISUAL_ID:
			return getHeaderMediatorOutputConnector_3358IncomingLinks(view);
		case CloneMediator4EditPart.VISUAL_ID:
			return getCloneMediator_3359IncomingLinks(view);
		case CloneMediatorInputConnector4EditPart.VISUAL_ID:
			return getCloneMediatorInputConnector_3360IncomingLinks(view);
		case CloneMediatorOutputConnector4EditPart.VISUAL_ID:
			return getCloneMediatorOutputConnector_3361IncomingLinks(view);
		case CloneMediatorTargetOutputConnector4EditPart.VISUAL_ID:
			return getCloneMediatorTargetOutputConnector_3362IncomingLinks(view);
		case IterateMediator4EditPart.VISUAL_ID:
			return getIterateMediator_3363IncomingLinks(view);
		case IterateMediatorInputConnector4EditPart.VISUAL_ID:
			return getIterateMediatorInputConnector_3364IncomingLinks(view);
		case IterateMediatorOutputConnector4EditPart.VISUAL_ID:
			return getIterateMediatorOutputConnector_3365IncomingLinks(view);
		case CalloutMediator4EditPart.VISUAL_ID:
			return getCalloutMediator_3366IncomingLinks(view);
		case CalloutMediatorInputConnector4EditPart.VISUAL_ID:
			return getCalloutMediatorInputConnector_3367IncomingLinks(view);
		case CalloutMediatorOutputConnector4EditPart.VISUAL_ID:
			return getCalloutMediatorOutputConnector_3368IncomingLinks(view);
		case TransactionMediator4EditPart.VISUAL_ID:
			return getTransactionMediator_3369IncomingLinks(view);
		case TransactionMediatorInputConnector4EditPart.VISUAL_ID:
			return getTransactionMediatorInputConnector_3370IncomingLinks(view);
		case TransactionMediatorOutputConnector4EditPart.VISUAL_ID:
			return getTransactionMediatorOutputConnector_3371IncomingLinks(view);
		case RMSequenceMediator4EditPart.VISUAL_ID:
			return getRMSequenceMediator_3372IncomingLinks(view);
		case RMSequenceMediatorInputConnector4EditPart.VISUAL_ID:
			return getRMSequenceMediatorInputConnector_3373IncomingLinks(view);
		case RMSequenceMediatorOutputConnector4EditPart.VISUAL_ID:
			return getRMSequenceMediatorOutputConnector_3374IncomingLinks(view);
		case Sequence4EditPart.VISUAL_ID:
			return getSequence_3375IncomingLinks(view);
		case SequenceInputConnector4EditPart.VISUAL_ID:
			return getSequenceInputConnector_3376IncomingLinks(view);
		case SequenceOutputConnector4EditPart.VISUAL_ID:
			return getSequenceOutputConnector_3377IncomingLinks(view);
		case ProxyServiceEndpointContainerEditPart.VISUAL_ID:
			return getProxyServiceEndpointContainer_3381IncomingLinks(view);
		case DefaultEndPoint2EditPart.VISUAL_ID:
			return getDefaultEndPoint_3382IncomingLinks(view);
		case DefaultEndPointInputConnectorEditPart.VISUAL_ID:
			return getDefaultEndPointInputConnector_3021IncomingLinks(view);
		case DefaultEndPointOutputConnectorEditPart.VISUAL_ID:
			return getDefaultEndPointOutputConnector_3022IncomingLinks(view);
		case AddressEndPoint2EditPart.VISUAL_ID:
			return getAddressEndPoint_3383IncomingLinks(view);
		case AddressEndPointInputConnectorEditPart.VISUAL_ID:
			return getAddressEndPointInputConnector_3030IncomingLinks(view);
		case AddressEndPointOutputConnectorEditPart.VISUAL_ID:
			return getAddressEndPointOutputConnector_3031IncomingLinks(view);
		case FailoverEndPoint2EditPart.VISUAL_ID:
			return getFailoverEndPoint_3384IncomingLinks(view);
		case FailoverEndPointInputConnectorEditPart.VISUAL_ID:
			return getFailoverEndPointInputConnector_3088IncomingLinks(view);
		case FailoverEndPointOutputConnectorEditPart.VISUAL_ID:
			return getFailoverEndPointOutputConnector_3090IncomingLinks(view);
		case FailoverEndPointWestOutputConnectorEditPart.VISUAL_ID:
			return getFailoverEndPointWestOutputConnector_3097IncomingLinks(view);
		case WSDLEndPoint2EditPart.VISUAL_ID:
			return getWSDLEndPoint_3385IncomingLinks(view);
		case WSDLEndPointInputConnectorEditPart.VISUAL_ID:
			return getWSDLEndPointInputConnector_3092IncomingLinks(view);
		case WSDLEndPointOutputConnectorEditPart.VISUAL_ID:
			return getWSDLEndPointOutputConnector_3093IncomingLinks(view);
		case LoadBalanceEndPoint2EditPart.VISUAL_ID:
			return getLoadBalanceEndPoint_3386IncomingLinks(view);
		case LoadBalanceEndPointInputConnectorEditPart.VISUAL_ID:
			return getLoadBalanceEndPointInputConnector_3095IncomingLinks(view);
		case LoadBalanceEndPointOutputConnectorEditPart.VISUAL_ID:
			return getLoadBalanceEndPointOutputConnector_3096IncomingLinks(view);
		case LoadBalanceEndPointWestOutputConnectorEditPart.VISUAL_ID:
			return getLoadBalanceEndPointWestOutputConnector_3098IncomingLinks(view);
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
		case EsbLinkEditPart.VISUAL_ID:
			return getEsbLink_4001IncomingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getOutgoingLinks(
			View view) {
		switch (EsbVisualIDRegistry.getVisualID(view)) {
		case EsbServerEditPart.VISUAL_ID:
			return getEsbServer_2001OutgoingLinks(view);
		case ProxyServiceEditPart.VISUAL_ID:
			return getProxyService_3001OutgoingLinks(view);
		case ProxyOutputConnectorEditPart.VISUAL_ID:
			return getProxyOutputConnector_3002OutgoingLinks(view);
		case ProxyInputConnectorEditPart.VISUAL_ID:
			return getProxyInputConnector_3003OutgoingLinks(view);
		case ProxyServiceSequenceContainerEditPart.VISUAL_ID:
			return getProxyServiceSequenceContainer_3196OutgoingLinks(view);
		case ProxyServiceInSequenceEditPart.VISUAL_ID:
			return getProxyServiceInSequence_3197OutgoingLinks(view);
		case DropMediator3EditPart.VISUAL_ID:
			return getDropMediator_3191OutgoingLinks(view);
		case DropMediatorInputConnectorEditPart.VISUAL_ID:
			return getDropMediatorInputConnector_3008OutgoingLinks(view);
		case PropertyMediator3EditPart.VISUAL_ID:
			return getPropertyMediator_3199OutgoingLinks(view);
		case PropertyMediatorInputConnectorEditPart.VISUAL_ID:
			return getPropertyMediatorInputConnector_3033OutgoingLinks(view);
		case PropertyMediatorOutputConnectorEditPart.VISUAL_ID:
			return getPropertyMediatorOutputConnector_3034OutgoingLinks(view);
		case ThrottleMediatorEditPart.VISUAL_ID:
			return getThrottleMediator_3205OutgoingLinks(view);
		case ThrottleMediatorInputConnectorEditPart.VISUAL_ID:
			return getThrottleMediatorInputConnector_3121OutgoingLinks(view);
		case ThrottleMediatorOutputConnectorEditPart.VISUAL_ID:
			return getThrottleMediatorOutputConnector_3122OutgoingLinks(view);
		case FilterMediatorEditPart.VISUAL_ID:
			return getFilterMediator_3209OutgoingLinks(view);
		case FilterMediatorInputConnectorEditPart.VISUAL_ID:
			return getFilterMediatorInputConnector_3010OutgoingLinks(view);
		case FilterMediatorPassOutputConnectorEditPart.VISUAL_ID:
			return getFilterMediatorPassOutputConnector_3011OutgoingLinks(view);
		case FilterMediatorFailOutputConnectorEditPart.VISUAL_ID:
			return getFilterMediatorFailOutputConnector_3012OutgoingLinks(view);
		case LogMediatorEditPart.VISUAL_ID:
			return getLogMediator_3210OutgoingLinks(view);
		case LogMediatorInputConnectorEditPart.VISUAL_ID:
			return getLogMediatorInputConnector_3018OutgoingLinks(view);
		case LogMediatorOutputConnectorEditPart.VISUAL_ID:
			return getLogMediatorOutputConnector_3019OutgoingLinks(view);
		case EnrichMediatorEditPart.VISUAL_ID:
			return getEnrichMediator_3387OutgoingLinks(view);
		case EnrichMediatorInputConnectorEditPart.VISUAL_ID:
			return getEnrichMediatorInputConnector_3036OutgoingLinks(view);
		case EnrichMediatorOutputConnectorEditPart.VISUAL_ID:
			return getEnrichMediatorOutputConnector_3037OutgoingLinks(view);
		case XSLTMediatorEditPart.VISUAL_ID:
			return getXSLTMediator_3212OutgoingLinks(view);
		case XSLTMediatorInputConnectorEditPart.VISUAL_ID:
			return getXSLTMediatorInputConnector_3039OutgoingLinks(view);
		case XSLTMediatorOutputConnectorEditPart.VISUAL_ID:
			return getXSLTMediatorOutputConnector_3040OutgoingLinks(view);
		case SwitchMediatorEditPart.VISUAL_ID:
			return getSwitchMediator_3213OutgoingLinks(view);
		case SwitchMediatorInputConnectorEditPart.VISUAL_ID:
			return getSwitchMediatorInputConnector_3042OutgoingLinks(view);
		case SwitchCaseBranchOutputConnectorEditPart.VISUAL_ID:
			return getSwitchCaseBranchOutputConnector_3043OutgoingLinks(view);
		case SwitchDefaultBranchOutputConnectorEditPart.VISUAL_ID:
			return getSwitchDefaultBranchOutputConnector_3044OutgoingLinks(view);
		case SequenceEditPart.VISUAL_ID:
			return getSequence_3214OutgoingLinks(view);
		case SequenceInputConnectorEditPart.VISUAL_ID:
			return getSequenceInputConnector_3049OutgoingLinks(view);
		case SequenceOutputConnectorEditPart.VISUAL_ID:
			return getSequenceOutputConnector_3050OutgoingLinks(view);
		case EventMediatorEditPart.VISUAL_ID:
			return getEventMediator_3215OutgoingLinks(view);
		case EventMediatorInputConnectorEditPart.VISUAL_ID:
			return getEventMediatorInputConnector_3052OutgoingLinks(view);
		case EventMediatorOutputConnectorEditPart.VISUAL_ID:
			return getEventMediatorOutputConnector_3053OutgoingLinks(view);
		case EntitlementMediatorEditPart.VISUAL_ID:
			return getEntitlementMediator_3216OutgoingLinks(view);
		case EntitlementMediatorInputConnectorEditPart.VISUAL_ID:
			return getEntitlementMediatorInputConnector_3055OutgoingLinks(view);
		case EntitlementMediatorOutputConnectorEditPart.VISUAL_ID:
			return getEntitlementMediatorOutputConnector_3056OutgoingLinks(view);
		case ClassMediatorEditPart.VISUAL_ID:
			return getClassMediator_3217OutgoingLinks(view);
		case ClassMediatorInputConnectorEditPart.VISUAL_ID:
			return getClassMediatorInputConnector_3058OutgoingLinks(view);
		case ClassMediatorOutputConnectorEditPart.VISUAL_ID:
			return getClassMediatorOutputConnector_3059OutgoingLinks(view);
		case SpringMediatorEditPart.VISUAL_ID:
			return getSpringMediator_3218OutgoingLinks(view);
		case SpringMediatorInputConnectorEditPart.VISUAL_ID:
			return getSpringMediatorInputConnector_3061OutgoingLinks(view);
		case SpringMediatorOutputConnectorEditPart.VISUAL_ID:
			return getSpringMediatorOutputConnector_3062OutgoingLinks(view);
		case ScriptMediatorEditPart.VISUAL_ID:
			return getScriptMediator_3219OutgoingLinks(view);
		case ScriptMediatorInputConnectorEditPart.VISUAL_ID:
			return getScriptMediatorInputConnector_3064OutgoingLinks(view);
		case ScriptMediatorOutputConnectorEditPart.VISUAL_ID:
			return getScriptMediatorOutputConnector_3065OutgoingLinks(view);
		case FaultMediatorEditPart.VISUAL_ID:
			return getFaultMediator_3220OutgoingLinks(view);
		case FaultMediatorInputConnectorEditPart.VISUAL_ID:
			return getFaultMediatorInputConnector_3067OutgoingLinks(view);
		case FaultMediatorOutputConnectorEditPart.VISUAL_ID:
			return getFaultMediatorOutputConnector_3068OutgoingLinks(view);
		case XQueryMediatorEditPart.VISUAL_ID:
			return getXQueryMediator_3221OutgoingLinks(view);
		case XQueryMediatorInputConnectorEditPart.VISUAL_ID:
			return getXQueryMediatorInputConnector_3070OutgoingLinks(view);
		case XQueryMediatorOutputConnectorEditPart.VISUAL_ID:
			return getXQueryMediatorOutputConnector_3071OutgoingLinks(view);
		case CommandMediatorEditPart.VISUAL_ID:
			return getCommandMediator_3222OutgoingLinks(view);
		case CommandMediatorInputConnectorEditPart.VISUAL_ID:
			return getCommandMediatorInputConnector_3073OutgoingLinks(view);
		case CommandMediatorOutputConnectorEditPart.VISUAL_ID:
			return getCommandMediatorOutputConnector_3074OutgoingLinks(view);
		case DBLookupMediatorEditPart.VISUAL_ID:
			return getDBLookupMediator_3223OutgoingLinks(view);
		case DBLookupMediatorInputConnectorEditPart.VISUAL_ID:
			return getDBLookupMediatorInputConnector_3076OutgoingLinks(view);
		case DBLookupMediatorOutputConnectorEditPart.VISUAL_ID:
			return getDBLookupMediatorOutputConnector_3077OutgoingLinks(view);
		case DBReportMediatorEditPart.VISUAL_ID:
			return getDBReportMediator_3224OutgoingLinks(view);
		case DBReportMediatorInputConnectorEditPart.VISUAL_ID:
			return getDBReportMediatorInputConnector_3079OutgoingLinks(view);
		case DBReportMediatorOutputConnectorEditPart.VISUAL_ID:
			return getDBReportMediatorOutputConnector_3080OutgoingLinks(view);
		case SmooksMediatorEditPart.VISUAL_ID:
			return getSmooksMediator_3225OutgoingLinks(view);
		case SmooksMediatorInputConnectorEditPart.VISUAL_ID:
			return getSmooksMediatorInputConnector_3082OutgoingLinks(view);
		case SmooksMediatorOutputConnectorEditPart.VISUAL_ID:
			return getSmooksMediatorOutputConnector_3083OutgoingLinks(view);
		case SendMediatorEditPart.VISUAL_ID:
			return getSendMediator_3226OutgoingLinks(view);
		case SendMediatorInputConnectorEditPart.VISUAL_ID:
			return getSendMediatorInputConnector_3085OutgoingLinks(view);
		case SendMediatorOutputConnectorEditPart.VISUAL_ID:
			return getSendMediatorOutputConnector_3086OutgoingLinks(view);
		case HeaderMediatorEditPart.VISUAL_ID:
			return getHeaderMediator_3227OutgoingLinks(view);
		case HeaderMediatorInputConnectorEditPart.VISUAL_ID:
			return getHeaderMediatorInputConnector_3100OutgoingLinks(view);
		case HeaderMediatorOutputConnectorEditPart.VISUAL_ID:
			return getHeaderMediatorOutputConnector_3101OutgoingLinks(view);
		case CloneMediatorEditPart.VISUAL_ID:
			return getCloneMediator_3228OutgoingLinks(view);
		case CloneMediatorInputConnectorEditPart.VISUAL_ID:
			return getCloneMediatorInputConnector_3103OutgoingLinks(view);
		case CloneMediatorOutputConnectorEditPart.VISUAL_ID:
			return getCloneMediatorOutputConnector_3104OutgoingLinks(view);
		case CloneMediatorTargetOutputConnectorEditPart.VISUAL_ID:
			return getCloneMediatorTargetOutputConnector_3133OutgoingLinks(view);
		case CacheMediatorEditPart.VISUAL_ID:
			return getCacheMediator_3229OutgoingLinks(view);
		case CacheMediatorInputConnectorEditPart.VISUAL_ID:
			return getCacheMediatorInputConnector_3106OutgoingLinks(view);
		case CacheMediatorOutputConnectorEditPart.VISUAL_ID:
			return getCacheMediatorOutputConnector_3107OutgoingLinks(view);
		case IterateMediatorEditPart.VISUAL_ID:
			return getIterateMediator_3230OutgoingLinks(view);
		case IterateMediatorInputConnectorEditPart.VISUAL_ID:
			return getIterateMediatorInputConnector_3109OutgoingLinks(view);
		case IterateMediatorOutputConnectorEditPart.VISUAL_ID:
			return getIterateMediatorOutputConnector_3110OutgoingLinks(view);
		case CalloutMediatorEditPart.VISUAL_ID:
			return getCalloutMediator_3231OutgoingLinks(view);
		case CalloutMediatorInputConnectorEditPart.VISUAL_ID:
			return getCalloutMediatorInputConnector_3115OutgoingLinks(view);
		case CalloutMediatorOutputConnectorEditPart.VISUAL_ID:
			return getCalloutMediatorOutputConnector_3116OutgoingLinks(view);
		case TransactionMediatorEditPart.VISUAL_ID:
			return getTransactionMediator_3232OutgoingLinks(view);
		case TransactionMediatorInputConnectorEditPart.VISUAL_ID:
			return getTransactionMediatorInputConnector_3118OutgoingLinks(view);
		case TransactionMediatorOutputConnectorEditPart.VISUAL_ID:
			return getTransactionMediatorOutputConnector_3119OutgoingLinks(view);
		case RMSequenceMediatorEditPart.VISUAL_ID:
			return getRMSequenceMediator_3233OutgoingLinks(view);
		case RMSequenceMediatorInputConnectorEditPart.VISUAL_ID:
			return getRMSequenceMediatorInputConnector_3124OutgoingLinks(view);
		case RMSequenceMediatorOutputConnectorEditPart.VISUAL_ID:
			return getRMSequenceMediatorOutputConnector_3125OutgoingLinks(view);
		case RuleMediatorEditPart.VISUAL_ID:
			return getRuleMediator_3234OutgoingLinks(view);
		case RuleMediatorInputConnectorEditPart.VISUAL_ID:
			return getRuleMediatorInputConnector_3127OutgoingLinks(view);
		case RuleMediatorOutputConnectorEditPart.VISUAL_ID:
			return getRuleMediatorOutputConnector_3128OutgoingLinks(view);
		case OAuthMediatorEditPart.VISUAL_ID:
			return getOAuthMediator_3235OutgoingLinks(view);
		case OAuthMediatorInputConnectorEditPart.VISUAL_ID:
			return getOAuthMediatorInputConnector_3130OutgoingLinks(view);
		case OAuthMediatorOutputConnectorEditPart.VISUAL_ID:
			return getOAuthMediatorOutputConnector_3131OutgoingLinks(view);
		case AggregateMediatorEditPart.VISUAL_ID:
			return getAggregateMediator_3236OutgoingLinks(view);
		case AggregateMediatorInputConnectorEditPart.VISUAL_ID:
			return getAggregateMediatorInputConnector_3112OutgoingLinks(view);
		case AggregateMediatorOutputConnectorEditPart.VISUAL_ID:
			return getAggregateMediatorOutputConnector_3113OutgoingLinks(view);
		case AggregateMediatorOnCompleteOutputConnectorEditPart.VISUAL_ID:
			return getAggregateMediatorOnCompleteOutputConnector_3132OutgoingLinks(view);
		case LogMediator2EditPart.VISUAL_ID:
			return getLogMediator_3134OutgoingLinks(view);
		case LogMediatorInputConnector2EditPart.VISUAL_ID:
			return getLogMediatorInputConnector_3135OutgoingLinks(view);
		case LogMediatorOutputConnector2EditPart.VISUAL_ID:
			return getLogMediatorOutputConnector_3136OutgoingLinks(view);
		case DropMediator2EditPart.VISUAL_ID:
			return getDropMediator_3137OutgoingLinks(view);
		case DropMediatorInputConnector2EditPart.VISUAL_ID:
			return getDropMediatorInputConnector_3138OutgoingLinks(view);
		case FilterMediator2EditPart.VISUAL_ID:
			return getFilterMediator_3139OutgoingLinks(view);
		case FilterMediatorInputConnector2EditPart.VISUAL_ID:
			return getFilterMediatorInputConnector_3140OutgoingLinks(view);
		case FilterMediatorPassOutputConnector2EditPart.VISUAL_ID:
			return getFilterMediatorPassOutputConnector_3141OutgoingLinks(view);
		case FilterMediatorFailOutputConnector2EditPart.VISUAL_ID:
			return getFilterMediatorFailOutputConnector_3142OutgoingLinks(view);
		case PropertyMediator2EditPart.VISUAL_ID:
			return getPropertyMediator_3143OutgoingLinks(view);
		case PropertyMediatorInputConnector2EditPart.VISUAL_ID:
			return getPropertyMediatorInputConnector_3144OutgoingLinks(view);
		case PropertyMediatorOutputConnector2EditPart.VISUAL_ID:
			return getPropertyMediatorOutputConnector_3145OutgoingLinks(view);
		case EnrichMediator2EditPart.VISUAL_ID:
			return getEnrichMediator_3146OutgoingLinks(view);
		case EnrichMediatorInputConnector2EditPart.VISUAL_ID:
			return getEnrichMediatorInputConnector_3147OutgoingLinks(view);
		case EnrichMediatorOutputConnector2EditPart.VISUAL_ID:
			return getEnrichMediatorOutputConnector_3148OutgoingLinks(view);
		case XSLTMediator2EditPart.VISUAL_ID:
			return getXSLTMediator_3149OutgoingLinks(view);
		case XSLTMediatorInputConnector2EditPart.VISUAL_ID:
			return getXSLTMediatorInputConnector_3150OutgoingLinks(view);
		case XSLTMediatorOutputConnector2EditPart.VISUAL_ID:
			return getXSLTMediatorOutputConnector_3151OutgoingLinks(view);
		case SwitchMediator2EditPart.VISUAL_ID:
			return getSwitchMediator_3152OutgoingLinks(view);
		case SwitchMediatorInputConnector2EditPart.VISUAL_ID:
			return getSwitchMediatorInputConnector_3153OutgoingLinks(view);
		case SwitchCaseBranchOutputConnector2EditPart.VISUAL_ID:
			return getSwitchCaseBranchOutputConnector_3154OutgoingLinks(view);
		case SwitchDefaultBranchOutputConnector2EditPart.VISUAL_ID:
			return getSwitchDefaultBranchOutputConnector_3155OutgoingLinks(view);
		case FaultMediator2EditPart.VISUAL_ID:
			return getFaultMediator_3156OutgoingLinks(view);
		case FaultMediatorInputConnector2EditPart.VISUAL_ID:
			return getFaultMediatorInputConnector_3157OutgoingLinks(view);
		case FaultMediatorOutputConnector2EditPart.VISUAL_ID:
			return getFaultMediatorOutputConnector_3158OutgoingLinks(view);
		case DBLookupMediator2EditPart.VISUAL_ID:
			return getDBLookupMediator_3159OutgoingLinks(view);
		case DBLookupMediatorInputConnector2EditPart.VISUAL_ID:
			return getDBLookupMediatorInputConnector_3160OutgoingLinks(view);
		case DBLookupMediatorOutputConnector2EditPart.VISUAL_ID:
			return getDBLookupMediatorOutputConnector_3161OutgoingLinks(view);
		case DBReportMediator2EditPart.VISUAL_ID:
			return getDBReportMediator_3162OutgoingLinks(view);
		case DBReportMediatorInputConnector2EditPart.VISUAL_ID:
			return getDBReportMediatorInputConnector_3163OutgoingLinks(view);
		case DBReportMediatorOutputConnector2EditPart.VISUAL_ID:
			return getDBReportMediatorOutputConnector_3164OutgoingLinks(view);
		case SendMediator2EditPart.VISUAL_ID:
			return getSendMediator_3165OutgoingLinks(view);
		case SendMediatorInputConnector2EditPart.VISUAL_ID:
			return getSendMediatorInputConnector_3166OutgoingLinks(view);
		case SendMediatorOutputConnector2EditPart.VISUAL_ID:
			return getSendMediatorOutputConnector_3167OutgoingLinks(view);
		case HeaderMediator2EditPart.VISUAL_ID:
			return getHeaderMediator_3168OutgoingLinks(view);
		case HeaderMediatorInputConnector2EditPart.VISUAL_ID:
			return getHeaderMediatorInputConnector_3169OutgoingLinks(view);
		case HeaderMediatorOutputConnector2EditPart.VISUAL_ID:
			return getHeaderMediatorOutputConnector_3170OutgoingLinks(view);
		case CloneMediator2EditPart.VISUAL_ID:
			return getCloneMediator_3171OutgoingLinks(view);
		case CloneMediatorInputConnector2EditPart.VISUAL_ID:
			return getCloneMediatorInputConnector_3172OutgoingLinks(view);
		case CloneMediatorOutputConnector2EditPart.VISUAL_ID:
			return getCloneMediatorOutputConnector_3173OutgoingLinks(view);
		case CloneMediatorTargetOutputConnector2EditPart.VISUAL_ID:
			return getCloneMediatorTargetOutputConnector_3174OutgoingLinks(view);
		case IterateMediator2EditPart.VISUAL_ID:
			return getIterateMediator_3175OutgoingLinks(view);
		case IterateMediatorInputConnector2EditPart.VISUAL_ID:
			return getIterateMediatorInputConnector_3176OutgoingLinks(view);
		case IterateMediatorOutputConnector2EditPart.VISUAL_ID:
			return getIterateMediatorOutputConnector_3177OutgoingLinks(view);
		case CalloutMediator2EditPart.VISUAL_ID:
			return getCalloutMediator_3178OutgoingLinks(view);
		case CalloutMediatorInputConnector2EditPart.VISUAL_ID:
			return getCalloutMediatorInputConnector_3181OutgoingLinks(view);
		case CalloutMediatorOutputConnector2EditPart.VISUAL_ID:
			return getCalloutMediatorOutputConnector_3182OutgoingLinks(view);
		case TransactionMediator2EditPart.VISUAL_ID:
			return getTransactionMediator_3179OutgoingLinks(view);
		case TransactionMediatorInputConnector2EditPart.VISUAL_ID:
			return getTransactionMediatorInputConnector_3183OutgoingLinks(view);
		case TransactionMediatorOutputConnector2EditPart.VISUAL_ID:
			return getTransactionMediatorOutputConnector_3184OutgoingLinks(view);
		case RMSequenceMediator2EditPart.VISUAL_ID:
			return getRMSequenceMediator_3180OutgoingLinks(view);
		case RMSequenceMediatorInputConnector2EditPart.VISUAL_ID:
			return getRMSequenceMediatorInputConnector_3185OutgoingLinks(view);
		case RMSequenceMediatorOutputConnector2EditPart.VISUAL_ID:
			return getRMSequenceMediatorOutputConnector_3186OutgoingLinks(view);
		case Sequence2EditPart.VISUAL_ID:
			return getSequence_3187OutgoingLinks(view);
		case SequenceInputConnector2EditPart.VISUAL_ID:
			return getSequenceInputConnector_3188OutgoingLinks(view);
		case SequenceOutputConnector2EditPart.VISUAL_ID:
			return getSequenceOutputConnector_3189OutgoingLinks(view);
		case ProxyServiceOutSequenceEditPart.VISUAL_ID:
			return getProxyServiceOutSequence_3198OutgoingLinks(view);
		case DropMediator4EditPart.VISUAL_ID:
			return getDropMediator_3194OutgoingLinks(view);
		case DropMediatorInputConnector3EditPart.VISUAL_ID:
			return getDropMediatorInputConnector_3192OutgoingLinks(view);
		case PropertyMediator4EditPart.VISUAL_ID:
			return getPropertyMediator_3200OutgoingLinks(view);
		case PropertyMediatorInputConnector3EditPart.VISUAL_ID:
			return getPropertyMediatorInputConnector_3201OutgoingLinks(view);
		case PropertyMediatorOutputConnector3EditPart.VISUAL_ID:
			return getPropertyMediatorOutputConnector_3202OutgoingLinks(view);
		case ThrottleMediator2EditPart.VISUAL_ID:
			return getThrottleMediator_3206OutgoingLinks(view);
		case ThrottleMediatorInputConnector2EditPart.VISUAL_ID:
			return getThrottleMediatorInputConnector_3207OutgoingLinks(view);
		case ThrottleMediatorOutputConnector2EditPart.VISUAL_ID:
			return getThrottleMediatorOutputConnector_3208OutgoingLinks(view);
		case FilterMediator3EditPart.VISUAL_ID:
			return getFilterMediator_3237OutgoingLinks(view);
		case FilterMediatorInputConnector3EditPart.VISUAL_ID:
			return getFilterMediatorInputConnector_3238OutgoingLinks(view);
		case FilterMediatorPassOutputConnector3EditPart.VISUAL_ID:
			return getFilterMediatorPassOutputConnector_3239OutgoingLinks(view);
		case FilterMediatorFailOutputConnector3EditPart.VISUAL_ID:
			return getFilterMediatorFailOutputConnector_3240OutgoingLinks(view);
		case LogMediator3EditPart.VISUAL_ID:
			return getLogMediator_3241OutgoingLinks(view);
		case LogMediatorInputConnector3EditPart.VISUAL_ID:
			return getLogMediatorInputConnector_3242OutgoingLinks(view);
		case LogMediatorOutputConnector3EditPart.VISUAL_ID:
			return getLogMediatorOutputConnector_3243OutgoingLinks(view);
		case EnrichMediator3EditPart.VISUAL_ID:
			return getEnrichMediator_3244OutgoingLinks(view);
		case EnrichMediatorInputConnector3EditPart.VISUAL_ID:
			return getEnrichMediatorInputConnector_3245OutgoingLinks(view);
		case EnrichMediatorOutputConnector3EditPart.VISUAL_ID:
			return getEnrichMediatorOutputConnector_3246OutgoingLinks(view);
		case XSLTMediator3EditPart.VISUAL_ID:
			return getXSLTMediator_3247OutgoingLinks(view);
		case XSLTMediatorInputConnector3EditPart.VISUAL_ID:
			return getXSLTMediatorInputConnector_3248OutgoingLinks(view);
		case XSLTMediatorOutputConnector3EditPart.VISUAL_ID:
			return getXSLTMediatorOutputConnector_3249OutgoingLinks(view);
		case SwitchMediator3EditPart.VISUAL_ID:
			return getSwitchMediator_3250OutgoingLinks(view);
		case SwitchMediatorInputConnector3EditPart.VISUAL_ID:
			return getSwitchMediatorInputConnector_3251OutgoingLinks(view);
		case SwitchCaseBranchOutputConnector3EditPart.VISUAL_ID:
			return getSwitchCaseBranchOutputConnector_3252OutgoingLinks(view);
		case SwitchDefaultBranchOutputConnector3EditPart.VISUAL_ID:
			return getSwitchDefaultBranchOutputConnector_3253OutgoingLinks(view);
		case Sequence3EditPart.VISUAL_ID:
			return getSequence_3254OutgoingLinks(view);
		case SequenceInputConnector3EditPart.VISUAL_ID:
			return getSequenceInputConnector_3255OutgoingLinks(view);
		case SequenceOutputConnector3EditPart.VISUAL_ID:
			return getSequenceOutputConnector_3256OutgoingLinks(view);
		case EventMediator2EditPart.VISUAL_ID:
			return getEventMediator_3257OutgoingLinks(view);
		case EventMediatorInputConnector2EditPart.VISUAL_ID:
			return getEventMediatorInputConnector_3258OutgoingLinks(view);
		case EventMediatorOutputConnector2EditPart.VISUAL_ID:
			return getEventMediatorOutputConnector_3259OutgoingLinks(view);
		case EntitlementMediator2EditPart.VISUAL_ID:
			return getEntitlementMediator_3260OutgoingLinks(view);
		case EntitlementMediatorInputConnector2EditPart.VISUAL_ID:
			return getEntitlementMediatorInputConnector_3261OutgoingLinks(view);
		case EntitlementMediatorOutputConnector2EditPart.VISUAL_ID:
			return getEntitlementMediatorOutputConnector_3262OutgoingLinks(view);
		case ClassMediator2EditPart.VISUAL_ID:
			return getClassMediator_3263OutgoingLinks(view);
		case ClassMediatorInputConnector2EditPart.VISUAL_ID:
			return getClassMediatorInputConnector_3264OutgoingLinks(view);
		case ClassMediatorOutputConnector2EditPart.VISUAL_ID:
			return getClassMediatorOutputConnector_3265OutgoingLinks(view);
		case SpringMediator2EditPart.VISUAL_ID:
			return getSpringMediator_3266OutgoingLinks(view);
		case SpringMediatorInputConnector2EditPart.VISUAL_ID:
			return getSpringMediatorInputConnector_3267OutgoingLinks(view);
		case SpringMediatorOutputConnector2EditPart.VISUAL_ID:
			return getSpringMediatorOutputConnector_3268OutgoingLinks(view);
		case ScriptMediator2EditPart.VISUAL_ID:
			return getScriptMediator_3269OutgoingLinks(view);
		case ScriptMediatorInputConnector2EditPart.VISUAL_ID:
			return getScriptMediatorInputConnector_3270OutgoingLinks(view);
		case ScriptMediatorOutputConnector2EditPart.VISUAL_ID:
			return getScriptMediatorOutputConnector_3271OutgoingLinks(view);
		case FaultMediator3EditPart.VISUAL_ID:
			return getFaultMediator_3272OutgoingLinks(view);
		case FaultMediatorInputConnector3EditPart.VISUAL_ID:
			return getFaultMediatorInputConnector_3273OutgoingLinks(view);
		case FaultMediatorOutputConnector3EditPart.VISUAL_ID:
			return getFaultMediatorOutputConnector_3274OutgoingLinks(view);
		case XQueryMediator2EditPart.VISUAL_ID:
			return getXQueryMediator_3275OutgoingLinks(view);
		case XQueryMediatorInputConnector2EditPart.VISUAL_ID:
			return getXQueryMediatorInputConnector_3276OutgoingLinks(view);
		case XQueryMediatorOutputConnector2EditPart.VISUAL_ID:
			return getXQueryMediatorOutputConnector_3277OutgoingLinks(view);
		case CommandMediator2EditPart.VISUAL_ID:
			return getCommandMediator_3278OutgoingLinks(view);
		case CommandMediatorInputConnector2EditPart.VISUAL_ID:
			return getCommandMediatorInputConnector_3279OutgoingLinks(view);
		case CommandMediatorOutputConnector2EditPart.VISUAL_ID:
			return getCommandMediatorOutputConnector_3280OutgoingLinks(view);
		case DBLookupMediator3EditPart.VISUAL_ID:
			return getDBLookupMediator_3281OutgoingLinks(view);
		case DBLookupMediatorInputConnector3EditPart.VISUAL_ID:
			return getDBLookupMediatorInputConnector_3282OutgoingLinks(view);
		case DBLookupMediatorOutputConnector3EditPart.VISUAL_ID:
			return getDBLookupMediatorOutputConnector_3283OutgoingLinks(view);
		case DBReportMediator3EditPart.VISUAL_ID:
			return getDBReportMediator_3284OutgoingLinks(view);
		case DBReportMediatorInputConnector3EditPart.VISUAL_ID:
			return getDBReportMediatorInputConnector_3285OutgoingLinks(view);
		case DBReportMediatorOutputConnector3EditPart.VISUAL_ID:
			return getDBReportMediatorOutputConnector_3286OutgoingLinks(view);
		case SmooksMediator2EditPart.VISUAL_ID:
			return getSmooksMediator_3287OutgoingLinks(view);
		case SmooksMediatorInputConnector2EditPart.VISUAL_ID:
			return getSmooksMediatorInputConnector_3288OutgoingLinks(view);
		case SmooksMediatorOutputConnector2EditPart.VISUAL_ID:
			return getSmooksMediatorOutputConnector_3289OutgoingLinks(view);
		case SendMediator3EditPart.VISUAL_ID:
			return getSendMediator_3290OutgoingLinks(view);
		case SendMediatorInputConnector3EditPart.VISUAL_ID:
			return getSendMediatorInputConnector_3291OutgoingLinks(view);
		case SendMediatorOutputConnector3EditPart.VISUAL_ID:
			return getSendMediatorOutputConnector_3292OutgoingLinks(view);
		case HeaderMediator3EditPart.VISUAL_ID:
			return getHeaderMediator_3293OutgoingLinks(view);
		case HeaderMediatorInputConnector3EditPart.VISUAL_ID:
			return getHeaderMediatorInputConnector_3294OutgoingLinks(view);
		case HeaderMediatorOutputConnector3EditPart.VISUAL_ID:
			return getHeaderMediatorOutputConnector_3295OutgoingLinks(view);
		case CloneMediator3EditPart.VISUAL_ID:
			return getCloneMediator_3296OutgoingLinks(view);
		case CloneMediatorInputConnector3EditPart.VISUAL_ID:
			return getCloneMediatorInputConnector_3297OutgoingLinks(view);
		case CloneMediatorOutputConnector3EditPart.VISUAL_ID:
			return getCloneMediatorOutputConnector_3298OutgoingLinks(view);
		case CloneMediatorTargetOutputConnector3EditPart.VISUAL_ID:
			return getCloneMediatorTargetOutputConnector_3299OutgoingLinks(view);
		case CacheMediator2EditPart.VISUAL_ID:
			return getCacheMediator_3300OutgoingLinks(view);
		case CacheMediatorInputConnector2EditPart.VISUAL_ID:
			return getCacheMediatorInputConnector_3301OutgoingLinks(view);
		case CacheMediatorOutputConnector2EditPart.VISUAL_ID:
			return getCacheMediatorOutputConnector_3302OutgoingLinks(view);
		case IterateMediator3EditPart.VISUAL_ID:
			return getIterateMediator_3303OutgoingLinks(view);
		case IterateMediatorInputConnector3EditPart.VISUAL_ID:
			return getIterateMediatorInputConnector_3304OutgoingLinks(view);
		case IterateMediatorOutputConnector3EditPart.VISUAL_ID:
			return getIterateMediatorOutputConnector_3305OutgoingLinks(view);
		case CalloutMediator3EditPart.VISUAL_ID:
			return getCalloutMediator_3306OutgoingLinks(view);
		case CalloutMediatorInputConnector3EditPart.VISUAL_ID:
			return getCalloutMediatorInputConnector_3307OutgoingLinks(view);
		case CalloutMediatorOutputConnector3EditPart.VISUAL_ID:
			return getCalloutMediatorOutputConnector_3308OutgoingLinks(view);
		case TransactionMediator3EditPart.VISUAL_ID:
			return getTransactionMediator_3309OutgoingLinks(view);
		case TransactionMediatorInputConnector3EditPart.VISUAL_ID:
			return getTransactionMediatorInputConnector_3310OutgoingLinks(view);
		case TransactionMediatorOutputConnector3EditPart.VISUAL_ID:
			return getTransactionMediatorOutputConnector_3311OutgoingLinks(view);
		case RMSequenceMediator3EditPart.VISUAL_ID:
			return getRMSequenceMediator_3312OutgoingLinks(view);
		case RMSequenceMediatorInputConnector3EditPart.VISUAL_ID:
			return getRMSequenceMediatorInputConnector_3313OutgoingLinks(view);
		case RMSequenceMediatorOutputConnector3EditPart.VISUAL_ID:
			return getRMSequenceMediatorOutputConnector_3314OutgoingLinks(view);
		case RuleMediator2EditPart.VISUAL_ID:
			return getRuleMediator_3315OutgoingLinks(view);
		case RuleMediatorInputConnector2EditPart.VISUAL_ID:
			return getRuleMediatorInputConnector_3316OutgoingLinks(view);
		case RuleMediatorOutputConnector2EditPart.VISUAL_ID:
			return getRuleMediatorOutputConnector_3317OutgoingLinks(view);
		case OAuthMediator2EditPart.VISUAL_ID:
			return getOAuthMediator_3318OutgoingLinks(view);
		case OAuthMediatorInputConnector2EditPart.VISUAL_ID:
			return getOAuthMediatorInputConnector_3319OutgoingLinks(view);
		case OAuthMediatorOutputConnector2EditPart.VISUAL_ID:
			return getOAuthMediatorOutputConnector_3320OutgoingLinks(view);
		case AggregateMediator2EditPart.VISUAL_ID:
			return getAggregateMediator_3321OutgoingLinks(view);
		case AggregateMediatorInputConnector2EditPart.VISUAL_ID:
			return getAggregateMediatorInputConnector_3322OutgoingLinks(view);
		case AggregateMediatorOutputConnector2EditPart.VISUAL_ID:
			return getAggregateMediatorOutputConnector_3323OutgoingLinks(view);
		case AggregateMediatorOnCompleteOutputConnector2EditPart.VISUAL_ID:
			return getAggregateMediatorOnCompleteOutputConnector_3324OutgoingLinks(view);
		case LogMediator4EditPart.VISUAL_ID:
			return getLogMediator_3325OutgoingLinks(view);
		case LogMediatorInputConnector4EditPart.VISUAL_ID:
			return getLogMediatorInputConnector_3326OutgoingLinks(view);
		case LogMediatorOutputConnector4EditPart.VISUAL_ID:
			return getLogMediatorOutputConnector_3327OutgoingLinks(view);
		case DropMediator5EditPart.VISUAL_ID:
			return getDropMediator_3328OutgoingLinks(view);
		case DropMediatorInputConnector4EditPart.VISUAL_ID:
			return getDropMediatorInputConnector_3195OutgoingLinks(view);
		case FilterMediator4EditPart.VISUAL_ID:
			return getFilterMediator_3329OutgoingLinks(view);
		case FilterMediatorInputConnector4EditPart.VISUAL_ID:
			return getFilterMediatorInputConnector_3330OutgoingLinks(view);
		case FilterMediatorPassOutputConnector4EditPart.VISUAL_ID:
			return getFilterMediatorPassOutputConnector_3331OutgoingLinks(view);
		case FilterMediatorFailOutputConnector4EditPart.VISUAL_ID:
			return getFilterMediatorFailOutputConnector_3332OutgoingLinks(view);
		case PropertyMediator5EditPart.VISUAL_ID:
			return getPropertyMediator_3333OutgoingLinks(view);
		case PropertyMediatorInputConnector4EditPart.VISUAL_ID:
			return getPropertyMediatorInputConnector_3203OutgoingLinks(view);
		case PropertyMediatorOutputConnector4EditPart.VISUAL_ID:
			return getPropertyMediatorOutputConnector_3204OutgoingLinks(view);
		case EnrichMediator4EditPart.VISUAL_ID:
			return getEnrichMediator_3334OutgoingLinks(view);
		case EnrichMediatorInputConnector4EditPart.VISUAL_ID:
			return getEnrichMediatorInputConnector_3388OutgoingLinks(view);
		case EnrichMediatorOutputConnector4EditPart.VISUAL_ID:
			return getEnrichMediatorOutputConnector_3389OutgoingLinks(view);
		case XSLTMediator4EditPart.VISUAL_ID:
			return getXSLTMediator_3337OutgoingLinks(view);
		case XSLTMediatorInputConnector4EditPart.VISUAL_ID:
			return getXSLTMediatorInputConnector_3338OutgoingLinks(view);
		case XSLTMediatorOutputConnector4EditPart.VISUAL_ID:
			return getXSLTMediatorOutputConnector_3339OutgoingLinks(view);
		case SwitchMediator4EditPart.VISUAL_ID:
			return getSwitchMediator_3340OutgoingLinks(view);
		case SwitchMediatorInputConnector4EditPart.VISUAL_ID:
			return getSwitchMediatorInputConnector_3341OutgoingLinks(view);
		case SwitchCaseBranchOutputConnector4EditPart.VISUAL_ID:
			return getSwitchCaseBranchOutputConnector_3342OutgoingLinks(view);
		case SwitchDefaultBranchOutputConnector4EditPart.VISUAL_ID:
			return getSwitchDefaultBranchOutputConnector_3343OutgoingLinks(view);
		case FaultMediator4EditPart.VISUAL_ID:
			return getFaultMediator_3344OutgoingLinks(view);
		case FaultMediatorInputConnector4EditPart.VISUAL_ID:
			return getFaultMediatorInputConnector_3345OutgoingLinks(view);
		case FaultMediatorOutputConnector4EditPart.VISUAL_ID:
			return getFaultMediatorOutputConnector_3346OutgoingLinks(view);
		case DBLookupMediator4EditPart.VISUAL_ID:
			return getDBLookupMediator_3347OutgoingLinks(view);
		case DBLookupMediatorInputConnector4EditPart.VISUAL_ID:
			return getDBLookupMediatorInputConnector_3348OutgoingLinks(view);
		case DBLookupMediatorOutputConnector4EditPart.VISUAL_ID:
			return getDBLookupMediatorOutputConnector_3349OutgoingLinks(view);
		case DBReportMediator4EditPart.VISUAL_ID:
			return getDBReportMediator_3350OutgoingLinks(view);
		case DBReportMediatorInputConnector4EditPart.VISUAL_ID:
			return getDBReportMediatorInputConnector_3351OutgoingLinks(view);
		case DBReportMediatorOutputConnector4EditPart.VISUAL_ID:
			return getDBReportMediatorOutputConnector_3352OutgoingLinks(view);
		case SendMediator4EditPart.VISUAL_ID:
			return getSendMediator_3353OutgoingLinks(view);
		case SendMediatorInputConnector4EditPart.VISUAL_ID:
			return getSendMediatorInputConnector_3354OutgoingLinks(view);
		case SendMediatorOutputConnector4EditPart.VISUAL_ID:
			return getSendMediatorOutputConnector_3355OutgoingLinks(view);
		case HeaderMediator4EditPart.VISUAL_ID:
			return getHeaderMediator_3356OutgoingLinks(view);
		case HeaderMediatorInputConnector4EditPart.VISUAL_ID:
			return getHeaderMediatorInputConnector_3357OutgoingLinks(view);
		case HeaderMediatorOutputConnector4EditPart.VISUAL_ID:
			return getHeaderMediatorOutputConnector_3358OutgoingLinks(view);
		case CloneMediator4EditPart.VISUAL_ID:
			return getCloneMediator_3359OutgoingLinks(view);
		case CloneMediatorInputConnector4EditPart.VISUAL_ID:
			return getCloneMediatorInputConnector_3360OutgoingLinks(view);
		case CloneMediatorOutputConnector4EditPart.VISUAL_ID:
			return getCloneMediatorOutputConnector_3361OutgoingLinks(view);
		case CloneMediatorTargetOutputConnector4EditPart.VISUAL_ID:
			return getCloneMediatorTargetOutputConnector_3362OutgoingLinks(view);
		case IterateMediator4EditPart.VISUAL_ID:
			return getIterateMediator_3363OutgoingLinks(view);
		case IterateMediatorInputConnector4EditPart.VISUAL_ID:
			return getIterateMediatorInputConnector_3364OutgoingLinks(view);
		case IterateMediatorOutputConnector4EditPart.VISUAL_ID:
			return getIterateMediatorOutputConnector_3365OutgoingLinks(view);
		case CalloutMediator4EditPart.VISUAL_ID:
			return getCalloutMediator_3366OutgoingLinks(view);
		case CalloutMediatorInputConnector4EditPart.VISUAL_ID:
			return getCalloutMediatorInputConnector_3367OutgoingLinks(view);
		case CalloutMediatorOutputConnector4EditPart.VISUAL_ID:
			return getCalloutMediatorOutputConnector_3368OutgoingLinks(view);
		case TransactionMediator4EditPart.VISUAL_ID:
			return getTransactionMediator_3369OutgoingLinks(view);
		case TransactionMediatorInputConnector4EditPart.VISUAL_ID:
			return getTransactionMediatorInputConnector_3370OutgoingLinks(view);
		case TransactionMediatorOutputConnector4EditPart.VISUAL_ID:
			return getTransactionMediatorOutputConnector_3371OutgoingLinks(view);
		case RMSequenceMediator4EditPart.VISUAL_ID:
			return getRMSequenceMediator_3372OutgoingLinks(view);
		case RMSequenceMediatorInputConnector4EditPart.VISUAL_ID:
			return getRMSequenceMediatorInputConnector_3373OutgoingLinks(view);
		case RMSequenceMediatorOutputConnector4EditPart.VISUAL_ID:
			return getRMSequenceMediatorOutputConnector_3374OutgoingLinks(view);
		case Sequence4EditPart.VISUAL_ID:
			return getSequence_3375OutgoingLinks(view);
		case SequenceInputConnector4EditPart.VISUAL_ID:
			return getSequenceInputConnector_3376OutgoingLinks(view);
		case SequenceOutputConnector4EditPart.VISUAL_ID:
			return getSequenceOutputConnector_3377OutgoingLinks(view);
		case ProxyServiceEndpointContainerEditPart.VISUAL_ID:
			return getProxyServiceEndpointContainer_3381OutgoingLinks(view);
		case DefaultEndPoint2EditPart.VISUAL_ID:
			return getDefaultEndPoint_3382OutgoingLinks(view);
		case DefaultEndPointInputConnectorEditPart.VISUAL_ID:
			return getDefaultEndPointInputConnector_3021OutgoingLinks(view);
		case DefaultEndPointOutputConnectorEditPart.VISUAL_ID:
			return getDefaultEndPointOutputConnector_3022OutgoingLinks(view);
		case AddressEndPoint2EditPart.VISUAL_ID:
			return getAddressEndPoint_3383OutgoingLinks(view);
		case AddressEndPointInputConnectorEditPart.VISUAL_ID:
			return getAddressEndPointInputConnector_3030OutgoingLinks(view);
		case AddressEndPointOutputConnectorEditPart.VISUAL_ID:
			return getAddressEndPointOutputConnector_3031OutgoingLinks(view);
		case FailoverEndPoint2EditPart.VISUAL_ID:
			return getFailoverEndPoint_3384OutgoingLinks(view);
		case FailoverEndPointInputConnectorEditPart.VISUAL_ID:
			return getFailoverEndPointInputConnector_3088OutgoingLinks(view);
		case FailoverEndPointOutputConnectorEditPart.VISUAL_ID:
			return getFailoverEndPointOutputConnector_3090OutgoingLinks(view);
		case FailoverEndPointWestOutputConnectorEditPart.VISUAL_ID:
			return getFailoverEndPointWestOutputConnector_3097OutgoingLinks(view);
		case WSDLEndPoint2EditPart.VISUAL_ID:
			return getWSDLEndPoint_3385OutgoingLinks(view);
		case WSDLEndPointInputConnectorEditPart.VISUAL_ID:
			return getWSDLEndPointInputConnector_3092OutgoingLinks(view);
		case WSDLEndPointOutputConnectorEditPart.VISUAL_ID:
			return getWSDLEndPointOutputConnector_3093OutgoingLinks(view);
		case LoadBalanceEndPoint2EditPart.VISUAL_ID:
			return getLoadBalanceEndPoint_3386OutgoingLinks(view);
		case LoadBalanceEndPointInputConnectorEditPart.VISUAL_ID:
			return getLoadBalanceEndPointInputConnector_3095OutgoingLinks(view);
		case LoadBalanceEndPointOutputConnectorEditPart.VISUAL_ID:
			return getLoadBalanceEndPointOutputConnector_3096OutgoingLinks(view);
		case LoadBalanceEndPointWestOutputConnectorEditPart.VISUAL_ID:
			return getLoadBalanceEndPointWestOutputConnector_3098OutgoingLinks(view);
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
		case EsbLinkEditPart.VISUAL_ID:
			return getEsbLink_4001OutgoingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getEsbDiagram_1000ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getEsbServer_2001ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getProxyService_3001ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getProxyOutputConnector_3002ContainedLinks(
			View view) {
		ProxyOutputConnector modelElement = (ProxyOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getProxyInputConnector_3003ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getProxyServiceSequenceContainer_3196ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getProxyServiceInSequence_3197ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDropMediator_3191ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getMessageMediator_3045ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getMessageInputConnector_3046ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getMessageOutputConnector_3047ContainedLinks(
			View view) {
		MessageOutputConnector modelElement = (MessageOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDropMediatorInputConnector_3008ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getPropertyMediator_3199ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getProxyServiceOutSequence_3198ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDropMediator_3194ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFilterMediatorInputConnector_3010ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFilterMediatorPassOutputConnector_3011ContainedLinks(
			View view) {
		FilterMediatorPassOutputConnector modelElement = (FilterMediatorPassOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFilterMediatorFailOutputConnector_3012ContainedLinks(
			View view) {
		FilterMediatorFailOutputConnector modelElement = (FilterMediatorFailOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getLogMediator_3210ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getMergeNode_3013ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getMergeNodeFirstInputConnector_3014ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getMergeNodeSecondInputConnector_3015ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getMergeNodeOutputConnector_3016ContainedLinks(
			View view) {
		MergeNodeOutputConnector modelElement = (MergeNodeOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getLogMediatorInputConnector_3018ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getLogMediatorOutputConnector_3019ContainedLinks(
			View view) {
		LogMediatorOutputConnector modelElement = (LogMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getEnrichMediator_3387ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getPropertyMediatorInputConnector_3201ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getPropertyMediatorOutputConnector_3202ContainedLinks(
			View view) {
		PropertyMediatorOutputConnector modelElement = (PropertyMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getPropertyMediatorInputConnector_3033ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getPropertyMediatorOutputConnector_3034ContainedLinks(
			View view) {
		PropertyMediatorOutputConnector modelElement = (PropertyMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getThrottleMediator_3205ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getEnrichMediatorInputConnector_3036ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getEnrichMediatorOutputConnector_3037ContainedLinks(
			View view) {
		EnrichMediatorOutputConnector modelElement = (EnrichMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getXSLTMediator_3212ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getXSLTMediatorInputConnector_3039ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getXSLTMediatorOutputConnector_3040ContainedLinks(
			View view) {
		XSLTMediatorOutputConnector modelElement = (XSLTMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSwitchMediator_3213ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSwitchMediatorInputConnector_3042ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSwitchCaseBranchOutputConnector_3043ContainedLinks(
			View view) {
		SwitchCaseBranchOutputConnector modelElement = (SwitchCaseBranchOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSwitchDefaultBranchOutputConnector_3044ContainedLinks(
			View view) {
		SwitchDefaultBranchOutputConnector modelElement = (SwitchDefaultBranchOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSequence_3214ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSequenceInputConnector_3049ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSequenceOutputConnector_3050ContainedLinks(
			View view) {
		SequenceOutputConnector modelElement = (SequenceOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getEventMediator_3215ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getEventMediatorInputConnector_3052ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getEventMediatorOutputConnector_3053ContainedLinks(
			View view) {
		EventMediatorOutputConnector modelElement = (EventMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getEntitlementMediator_3216ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getEntitlementMediatorInputConnector_3055ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getEntitlementMediatorOutputConnector_3056ContainedLinks(
			View view) {
		EntitlementMediatorOutputConnector modelElement = (EntitlementMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getClassMediator_3217ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getClassMediatorInputConnector_3058ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getClassMediatorOutputConnector_3059ContainedLinks(
			View view) {
		ClassMediatorOutputConnector modelElement = (ClassMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSpringMediator_3218ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSpringMediatorInputConnector_3061ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSpringMediatorOutputConnector_3062ContainedLinks(
			View view) {
		SpringMediatorOutputConnector modelElement = (SpringMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getScriptMediator_3219ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getScriptMediatorInputConnector_3064ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getScriptMediatorOutputConnector_3065ContainedLinks(
			View view) {
		ScriptMediatorOutputConnector modelElement = (ScriptMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFaultMediator_3220ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFaultMediatorInputConnector_3067ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFaultMediatorOutputConnector_3068ContainedLinks(
			View view) {
		FaultMediatorOutputConnector modelElement = (FaultMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getXQueryMediator_3221ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getXQueryMediatorInputConnector_3070ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getXQueryMediatorOutputConnector_3071ContainedLinks(
			View view) {
		XQueryMediatorOutputConnector modelElement = (XQueryMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCommandMediator_3222ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCommandMediatorInputConnector_3073ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCommandMediatorOutputConnector_3074ContainedLinks(
			View view) {
		CommandMediatorOutputConnector modelElement = (CommandMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDBLookupMediator_3223ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDBLookupMediatorInputConnector_3076ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDBLookupMediatorOutputConnector_3077ContainedLinks(
			View view) {
		DBLookupMediatorOutputConnector modelElement = (DBLookupMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDBReportMediator_3224ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDBReportMediatorInputConnector_3079ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDBReportMediatorOutputConnector_3080ContainedLinks(
			View view) {
		DBReportMediatorOutputConnector modelElement = (DBReportMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSmooksMediator_3225ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSmooksMediatorInputConnector_3082ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSmooksMediatorOutputConnector_3083ContainedLinks(
			View view) {
		SmooksMediatorOutputConnector modelElement = (SmooksMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSendMediator_3226ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSendMediatorInputConnector_3085ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSendMediatorOutputConnector_3086ContainedLinks(
			View view) {
		SendMediatorOutputConnector modelElement = (SendMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getHeaderMediator_3227ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFailoverEndPointInputConnector_3088ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFailoverEndPointOutputConnector_3090ContainedLinks(
			View view) {
		FailoverEndPointOutputConnector modelElement = (FailoverEndPointOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFailoverEndPointWestOutputConnector_3097ContainedLinks(
			View view) {
		FailoverEndPointWestOutputConnector modelElement = (FailoverEndPointWestOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getWSDLEndPoint_3385ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getWSDLEndPointInputConnector_3092ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getWSDLEndPointOutputConnector_3093ContainedLinks(
			View view) {
		WSDLEndPointOutputConnector modelElement = (WSDLEndPointOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getLoadBalanceEndPoint_3386ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getLoadBalanceEndPointInputConnector_3095ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getLoadBalanceEndPointOutputConnector_3096ContainedLinks(
			View view) {
		LoadBalanceEndPointOutputConnector modelElement = (LoadBalanceEndPointOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getLoadBalanceEndPointWestOutputConnector_3098ContainedLinks(
			View view) {
		LoadBalanceEndPointWestOutputConnector modelElement = (LoadBalanceEndPointWestOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getHeaderMediatorInputConnector_3100ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getHeaderMediatorOutputConnector_3101ContainedLinks(
			View view) {
		HeaderMediatorOutputConnector modelElement = (HeaderMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCloneMediator_3228ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCloneMediatorInputConnector_3103ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCloneMediatorOutputConnector_3104ContainedLinks(
			View view) {
		CloneMediatorOutputConnector modelElement = (CloneMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCloneMediatorTargetOutputConnector_3133ContainedLinks(
			View view) {
		CloneMediatorTargetOutputConnector modelElement = (CloneMediatorTargetOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCacheMediator_3229ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCacheMediatorInputConnector_3106ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCacheMediatorOutputConnector_3107ContainedLinks(
			View view) {
		CacheMediatorOutputConnector modelElement = (CacheMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getIterateMediator_3230ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getIterateMediatorInputConnector_3109ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getIterateMediatorOutputConnector_3110ContainedLinks(
			View view) {
		IterateMediatorOutputConnector modelElement = (IterateMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCalloutMediator_3231ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getAggregateMediatorInputConnector_3112ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getAggregateMediatorOutputConnector_3113ContainedLinks(
			View view) {
		AggregateMediatorOutputConnector modelElement = (AggregateMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getAggregateMediatorOnCompleteOutputConnector_3132ContainedLinks(
			View view) {
		AggregateMediatorOnCompleteOutputConnector modelElement = (AggregateMediatorOnCompleteOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getLogMediator_3134ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getLogMediatorInputConnector_3135ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getLogMediatorOutputConnector_3136ContainedLinks(
			View view) {
		LogMediatorOutputConnector modelElement = (LogMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDropMediator_3137ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDropMediatorInputConnector_3195ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFilterMediator_3329ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFilterMediatorInputConnector_3330ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFilterMediatorPassOutputConnector_3331ContainedLinks(
			View view) {
		FilterMediatorPassOutputConnector modelElement = (FilterMediatorPassOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFilterMediatorFailOutputConnector_3332ContainedLinks(
			View view) {
		FilterMediatorFailOutputConnector modelElement = (FilterMediatorFailOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getPropertyMediator_3333ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDropMediatorInputConnector_3192ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDropMediatorInputConnector_3138ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getPropertyMediator_3200ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFilterMediator_3139ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFilterMediatorInputConnector_3140ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFilterMediatorPassOutputConnector_3141ContainedLinks(
			View view) {
		FilterMediatorPassOutputConnector modelElement = (FilterMediatorPassOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFilterMediatorFailOutputConnector_3142ContainedLinks(
			View view) {
		FilterMediatorFailOutputConnector modelElement = (FilterMediatorFailOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getPropertyMediator_3143ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getPropertyMediatorInputConnector_3203ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getPropertyMediatorOutputConnector_3204ContainedLinks(
			View view) {
		PropertyMediatorOutputConnector modelElement = (PropertyMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getEnrichMediator_3334ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getEnrichMediatorInputConnector_3388ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getEnrichMediatorOutputConnector_3389ContainedLinks(
			View view) {
		EnrichMediatorOutputConnector modelElement = (EnrichMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getXSLTMediator_3337ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getXSLTMediatorInputConnector_3338ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getXSLTMediatorOutputConnector_3339ContainedLinks(
			View view) {
		XSLTMediatorOutputConnector modelElement = (XSLTMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSwitchMediator_3340ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSwitchMediatorInputConnector_3341ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSwitchCaseBranchOutputConnector_3342ContainedLinks(
			View view) {
		SwitchCaseBranchOutputConnector modelElement = (SwitchCaseBranchOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSwitchDefaultBranchOutputConnector_3343ContainedLinks(
			View view) {
		SwitchDefaultBranchOutputConnector modelElement = (SwitchDefaultBranchOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFaultMediator_3344ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFaultMediatorInputConnector_3345ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFaultMediatorOutputConnector_3346ContainedLinks(
			View view) {
		FaultMediatorOutputConnector modelElement = (FaultMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDBLookupMediator_3347ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDBLookupMediatorInputConnector_3348ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDBLookupMediatorOutputConnector_3349ContainedLinks(
			View view) {
		DBLookupMediatorOutputConnector modelElement = (DBLookupMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDBReportMediator_3350ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDBReportMediatorInputConnector_3351ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDBReportMediatorOutputConnector_3352ContainedLinks(
			View view) {
		DBReportMediatorOutputConnector modelElement = (DBReportMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSendMediator_3353ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSendMediatorInputConnector_3354ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSendMediatorOutputConnector_3355ContainedLinks(
			View view) {
		SendMediatorOutputConnector modelElement = (SendMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getHeaderMediator_3356ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getHeaderMediatorInputConnector_3357ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getHeaderMediatorOutputConnector_3358ContainedLinks(
			View view) {
		HeaderMediatorOutputConnector modelElement = (HeaderMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCloneMediator_3359ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCloneMediatorInputConnector_3360ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCloneMediatorOutputConnector_3361ContainedLinks(
			View view) {
		CloneMediatorOutputConnector modelElement = (CloneMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCloneMediatorTargetOutputConnector_3362ContainedLinks(
			View view) {
		CloneMediatorTargetOutputConnector modelElement = (CloneMediatorTargetOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getIterateMediator_3363ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getIterateMediatorInputConnector_3364ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getIterateMediatorOutputConnector_3365ContainedLinks(
			View view) {
		IterateMediatorOutputConnector modelElement = (IterateMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCalloutMediator_3366ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCalloutMediatorInputConnector_3367ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCalloutMediatorOutputConnector_3368ContainedLinks(
			View view) {
		CalloutMediatorOutputConnector modelElement = (CalloutMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getTransactionMediator_3369ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getTransactionMediatorInputConnector_3370ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getTransactionMediatorOutputConnector_3371ContainedLinks(
			View view) {
		TransactionMediatorOutputConnector modelElement = (TransactionMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getRMSequenceMediator_3372ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getRMSequenceMediatorInputConnector_3373ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getRMSequenceMediatorOutputConnector_3374ContainedLinks(
			View view) {
		RMSequenceMediatorOutputConnector modelElement = (RMSequenceMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSequence_3375ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSequenceInputConnector_3376ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSequenceOutputConnector_3377ContainedLinks(
			View view) {
		SequenceOutputConnector modelElement = (SequenceOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getProxyServiceEndpointContainer_3381ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDefaultEndPoint_3382ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getPropertyMediatorInputConnector_3144ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getPropertyMediatorOutputConnector_3145ContainedLinks(
			View view) {
		PropertyMediatorOutputConnector modelElement = (PropertyMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getThrottleMediator_3206ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getThrottleMediatorInputConnector_3207ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getThrottleMediatorOutputConnector_3208ContainedLinks(
			View view) {
		ThrottleMediatorOutputConnector modelElement = (ThrottleMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFilterMediator_3237ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFilterMediatorInputConnector_3238ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFilterMediatorPassOutputConnector_3239ContainedLinks(
			View view) {
		FilterMediatorPassOutputConnector modelElement = (FilterMediatorPassOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFilterMediatorFailOutputConnector_3240ContainedLinks(
			View view) {
		FilterMediatorFailOutputConnector modelElement = (FilterMediatorFailOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getLogMediator_3241ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getLogMediatorInputConnector_3242ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getLogMediatorOutputConnector_3243ContainedLinks(
			View view) {
		LogMediatorOutputConnector modelElement = (LogMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getEnrichMediator_3244ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getEnrichMediatorInputConnector_3245ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getEnrichMediatorOutputConnector_3246ContainedLinks(
			View view) {
		EnrichMediatorOutputConnector modelElement = (EnrichMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getXSLTMediator_3247ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getXSLTMediatorInputConnector_3248ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getXSLTMediatorOutputConnector_3249ContainedLinks(
			View view) {
		XSLTMediatorOutputConnector modelElement = (XSLTMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSwitchMediator_3250ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSwitchMediatorInputConnector_3251ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSwitchCaseBranchOutputConnector_3252ContainedLinks(
			View view) {
		SwitchCaseBranchOutputConnector modelElement = (SwitchCaseBranchOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSwitchDefaultBranchOutputConnector_3253ContainedLinks(
			View view) {
		SwitchDefaultBranchOutputConnector modelElement = (SwitchDefaultBranchOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSequence_3254ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSequenceInputConnector_3255ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSequenceOutputConnector_3256ContainedLinks(
			View view) {
		SequenceOutputConnector modelElement = (SequenceOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getEventMediator_3257ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getEventMediatorInputConnector_3258ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getEventMediatorOutputConnector_3259ContainedLinks(
			View view) {
		EventMediatorOutputConnector modelElement = (EventMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getEntitlementMediator_3260ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getEntitlementMediatorInputConnector_3261ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getEntitlementMediatorOutputConnector_3262ContainedLinks(
			View view) {
		EntitlementMediatorOutputConnector modelElement = (EntitlementMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getClassMediator_3263ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getClassMediatorInputConnector_3264ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getClassMediatorOutputConnector_3265ContainedLinks(
			View view) {
		ClassMediatorOutputConnector modelElement = (ClassMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSpringMediator_3266ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSpringMediatorInputConnector_3267ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSpringMediatorOutputConnector_3268ContainedLinks(
			View view) {
		SpringMediatorOutputConnector modelElement = (SpringMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getScriptMediator_3269ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getScriptMediatorInputConnector_3270ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getScriptMediatorOutputConnector_3271ContainedLinks(
			View view) {
		ScriptMediatorOutputConnector modelElement = (ScriptMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFaultMediator_3272ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFaultMediatorInputConnector_3273ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFaultMediatorOutputConnector_3274ContainedLinks(
			View view) {
		FaultMediatorOutputConnector modelElement = (FaultMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getXQueryMediator_3275ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getXQueryMediatorInputConnector_3276ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getXQueryMediatorOutputConnector_3277ContainedLinks(
			View view) {
		XQueryMediatorOutputConnector modelElement = (XQueryMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCommandMediator_3278ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCommandMediatorInputConnector_3279ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCommandMediatorOutputConnector_3280ContainedLinks(
			View view) {
		CommandMediatorOutputConnector modelElement = (CommandMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDBLookupMediator_3281ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDBLookupMediatorInputConnector_3282ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDBLookupMediatorOutputConnector_3283ContainedLinks(
			View view) {
		DBLookupMediatorOutputConnector modelElement = (DBLookupMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDBReportMediator_3284ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDBReportMediatorInputConnector_3285ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDBReportMediatorOutputConnector_3286ContainedLinks(
			View view) {
		DBReportMediatorOutputConnector modelElement = (DBReportMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSmooksMediator_3287ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSmooksMediatorInputConnector_3288ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSmooksMediatorOutputConnector_3289ContainedLinks(
			View view) {
		SmooksMediatorOutputConnector modelElement = (SmooksMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSendMediator_3290ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSendMediatorInputConnector_3291ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSendMediatorOutputConnector_3292ContainedLinks(
			View view) {
		SendMediatorOutputConnector modelElement = (SendMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getHeaderMediator_3293ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getHeaderMediatorInputConnector_3294ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getHeaderMediatorOutputConnector_3295ContainedLinks(
			View view) {
		HeaderMediatorOutputConnector modelElement = (HeaderMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCloneMediator_3296ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCloneMediatorInputConnector_3297ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCloneMediatorOutputConnector_3298ContainedLinks(
			View view) {
		CloneMediatorOutputConnector modelElement = (CloneMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCloneMediatorTargetOutputConnector_3299ContainedLinks(
			View view) {
		CloneMediatorTargetOutputConnector modelElement = (CloneMediatorTargetOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCacheMediator_3300ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCacheMediatorInputConnector_3301ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCacheMediatorOutputConnector_3302ContainedLinks(
			View view) {
		CacheMediatorOutputConnector modelElement = (CacheMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getIterateMediator_3303ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getIterateMediatorInputConnector_3304ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getIterateMediatorOutputConnector_3305ContainedLinks(
			View view) {
		IterateMediatorOutputConnector modelElement = (IterateMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCalloutMediator_3306ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCalloutMediatorInputConnector_3307ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCalloutMediatorOutputConnector_3308ContainedLinks(
			View view) {
		CalloutMediatorOutputConnector modelElement = (CalloutMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getTransactionMediator_3309ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getTransactionMediatorInputConnector_3310ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getTransactionMediatorOutputConnector_3311ContainedLinks(
			View view) {
		TransactionMediatorOutputConnector modelElement = (TransactionMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getRMSequenceMediator_3312ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getRMSequenceMediatorInputConnector_3313ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getRMSequenceMediatorOutputConnector_3314ContainedLinks(
			View view) {
		RMSequenceMediatorOutputConnector modelElement = (RMSequenceMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getRuleMediator_3315ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getRuleMediatorInputConnector_3316ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getRuleMediatorOutputConnector_3317ContainedLinks(
			View view) {
		RuleMediatorOutputConnector modelElement = (RuleMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getOAuthMediator_3318ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getOAuthMediatorInputConnector_3319ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getOAuthMediatorOutputConnector_3320ContainedLinks(
			View view) {
		OAuthMediatorOutputConnector modelElement = (OAuthMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getAggregateMediator_3321ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getAggregateMediatorInputConnector_3322ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getAggregateMediatorOutputConnector_3323ContainedLinks(
			View view) {
		AggregateMediatorOutputConnector modelElement = (AggregateMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getAggregateMediatorOnCompleteOutputConnector_3324ContainedLinks(
			View view) {
		AggregateMediatorOnCompleteOutputConnector modelElement = (AggregateMediatorOnCompleteOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getLogMediator_3325ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getLogMediatorInputConnector_3326ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getLogMediatorOutputConnector_3327ContainedLinks(
			View view) {
		LogMediatorOutputConnector modelElement = (LogMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDropMediator_3328ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getEnrichMediator_3146ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getEnrichMediatorInputConnector_3147ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getEnrichMediatorOutputConnector_3148ContainedLinks(
			View view) {
		EnrichMediatorOutputConnector modelElement = (EnrichMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getXSLTMediator_3149ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getXSLTMediatorInputConnector_3150ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getXSLTMediatorOutputConnector_3151ContainedLinks(
			View view) {
		XSLTMediatorOutputConnector modelElement = (XSLTMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSwitchMediator_3152ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSwitchMediatorInputConnector_3153ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSwitchCaseBranchOutputConnector_3154ContainedLinks(
			View view) {
		SwitchCaseBranchOutputConnector modelElement = (SwitchCaseBranchOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSwitchDefaultBranchOutputConnector_3155ContainedLinks(
			View view) {
		SwitchDefaultBranchOutputConnector modelElement = (SwitchDefaultBranchOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFaultMediator_3156ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFaultMediatorInputConnector_3157ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFaultMediatorOutputConnector_3158ContainedLinks(
			View view) {
		FaultMediatorOutputConnector modelElement = (FaultMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDBLookupMediator_3159ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDBLookupMediatorInputConnector_3160ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDBLookupMediatorOutputConnector_3161ContainedLinks(
			View view) {
		DBLookupMediatorOutputConnector modelElement = (DBLookupMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDBReportMediator_3162ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDBReportMediatorInputConnector_3163ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDBReportMediatorOutputConnector_3164ContainedLinks(
			View view) {
		DBReportMediatorOutputConnector modelElement = (DBReportMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSendMediator_3165ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSendMediatorInputConnector_3166ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSendMediatorOutputConnector_3167ContainedLinks(
			View view) {
		SendMediatorOutputConnector modelElement = (SendMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getHeaderMediator_3168ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getHeaderMediatorInputConnector_3169ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getHeaderMediatorOutputConnector_3170ContainedLinks(
			View view) {
		HeaderMediatorOutputConnector modelElement = (HeaderMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCloneMediator_3171ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCloneMediatorInputConnector_3172ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCloneMediatorOutputConnector_3173ContainedLinks(
			View view) {
		CloneMediatorOutputConnector modelElement = (CloneMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCloneMediatorTargetOutputConnector_3174ContainedLinks(
			View view) {
		CloneMediatorTargetOutputConnector modelElement = (CloneMediatorTargetOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getIterateMediator_3175ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getIterateMediatorInputConnector_3176ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getIterateMediatorOutputConnector_3177ContainedLinks(
			View view) {
		IterateMediatorOutputConnector modelElement = (IterateMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCalloutMediator_3178ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCalloutMediatorInputConnector_3181ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCalloutMediatorOutputConnector_3182ContainedLinks(
			View view) {
		CalloutMediatorOutputConnector modelElement = (CalloutMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCalloutMediatorInputConnector_3115ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCalloutMediatorOutputConnector_3116ContainedLinks(
			View view) {
		CalloutMediatorOutputConnector modelElement = (CalloutMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getTransactionMediator_3232ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getTransactionMediator_3179ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getTransactionMediatorInputConnector_3183ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getTransactionMediatorOutputConnector_3184ContainedLinks(
			View view) {
		TransactionMediatorOutputConnector modelElement = (TransactionMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getTransactionMediatorInputConnector_3118ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getTransactionMediatorOutputConnector_3119ContainedLinks(
			View view) {
		TransactionMediatorOutputConnector modelElement = (TransactionMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getRMSequenceMediator_3233ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getRMSequenceMediator_3180ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getThrottleMediatorInputConnector_3121ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getThrottleMediatorOutputConnector_3122ContainedLinks(
			View view) {
		ThrottleMediatorOutputConnector modelElement = (ThrottleMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFilterMediator_3209ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getRMSequenceMediatorInputConnector_3185ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getRMSequenceMediatorOutputConnector_3186ContainedLinks(
			View view) {
		RMSequenceMediatorOutputConnector modelElement = (RMSequenceMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getRMSequenceMediatorInputConnector_3124ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getRMSequenceMediatorOutputConnector_3125ContainedLinks(
			View view) {
		RMSequenceMediatorOutputConnector modelElement = (RMSequenceMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getRuleMediator_3234ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSequence_3187ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSequenceInputConnector_3188ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSequenceOutputConnector_3189ContainedLinks(
			View view) {
		SequenceOutputConnector modelElement = (SequenceOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getRuleMediatorInputConnector_3127ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getRuleMediatorOutputConnector_3128ContainedLinks(
			View view) {
		RuleMediatorOutputConnector modelElement = (RuleMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getOAuthMediator_3235ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getOAuthMediatorInputConnector_3130ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getOAuthMediatorOutputConnector_3131ContainedLinks(
			View view) {
		OAuthMediatorOutputConnector modelElement = (OAuthMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getAggregateMediator_3236ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDefaultEndPointInputConnector_3021ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDefaultEndPointOutputConnector_3022ContainedLinks(
			View view) {
		DefaultEndPointOutputConnector modelElement = (DefaultEndPointOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getAddressEndPoint_3383ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getAddressEndPointInputConnector_3030ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getAddressEndPointOutputConnector_3031ContainedLinks(
			View view) {
		AddressEndPointOutputConnector modelElement = (AddressEndPointOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFailoverEndPoint_3384ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getEsbLink_4001ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getEsbServer_2001IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getProxyService_3001IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getProxyOutputConnector_3002IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getProxyInputConnector_3003IncomingLinks(
			View view) {
		ProxyInputConnector modelElement = (ProxyInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getProxyServiceSequenceContainer_3196IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getProxyServiceInSequence_3197IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDropMediator_3191IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getMessageMediator_3045IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getMessageInputConnector_3046IncomingLinks(
			View view) {
		MessageInputConnector modelElement = (MessageInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getMessageOutputConnector_3047IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDropMediatorInputConnector_3008IncomingLinks(
			View view) {
		DropMediatorInputConnector modelElement = (DropMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getPropertyMediator_3199IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getProxyServiceOutSequence_3198IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDropMediator_3194IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFilterMediatorInputConnector_3010IncomingLinks(
			View view) {
		FilterMediatorInputConnector modelElement = (FilterMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFilterMediatorPassOutputConnector_3011IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFilterMediatorFailOutputConnector_3012IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getLogMediator_3210IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getMergeNode_3013IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getMergeNodeFirstInputConnector_3014IncomingLinks(
			View view) {
		MergeNodeFirstInputConnector modelElement = (MergeNodeFirstInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getMergeNodeSecondInputConnector_3015IncomingLinks(
			View view) {
		MergeNodeSecondInputConnector modelElement = (MergeNodeSecondInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getMergeNodeOutputConnector_3016IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getLogMediatorInputConnector_3018IncomingLinks(
			View view) {
		LogMediatorInputConnector modelElement = (LogMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getLogMediatorOutputConnector_3019IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getEnrichMediator_3387IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getPropertyMediatorInputConnector_3201IncomingLinks(
			View view) {
		PropertyMediatorInputConnector modelElement = (PropertyMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getPropertyMediatorOutputConnector_3202IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getPropertyMediatorInputConnector_3033IncomingLinks(
			View view) {
		PropertyMediatorInputConnector modelElement = (PropertyMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getPropertyMediatorOutputConnector_3034IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getThrottleMediator_3205IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getEnrichMediatorInputConnector_3036IncomingLinks(
			View view) {
		EnrichMediatorInputConnector modelElement = (EnrichMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getEnrichMediatorOutputConnector_3037IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getXSLTMediator_3212IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getXSLTMediatorInputConnector_3039IncomingLinks(
			View view) {
		XSLTMediatorInputConnector modelElement = (XSLTMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getXSLTMediatorOutputConnector_3040IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSwitchMediator_3213IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSwitchMediatorInputConnector_3042IncomingLinks(
			View view) {
		SwitchMediatorInputConnector modelElement = (SwitchMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSwitchCaseBranchOutputConnector_3043IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSwitchDefaultBranchOutputConnector_3044IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSequence_3214IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSequenceInputConnector_3049IncomingLinks(
			View view) {
		SequenceInputConnector modelElement = (SequenceInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSequenceOutputConnector_3050IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getEventMediator_3215IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getEventMediatorInputConnector_3052IncomingLinks(
			View view) {
		EventMediatorInputConnector modelElement = (EventMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getEventMediatorOutputConnector_3053IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getEntitlementMediator_3216IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getEntitlementMediatorInputConnector_3055IncomingLinks(
			View view) {
		EntitlementMediatorInputConnector modelElement = (EntitlementMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getEntitlementMediatorOutputConnector_3056IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getClassMediator_3217IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getClassMediatorInputConnector_3058IncomingLinks(
			View view) {
		ClassMediatorInputConnector modelElement = (ClassMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getClassMediatorOutputConnector_3059IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSpringMediator_3218IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSpringMediatorInputConnector_3061IncomingLinks(
			View view) {
		SpringMediatorInputConnector modelElement = (SpringMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSpringMediatorOutputConnector_3062IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getScriptMediator_3219IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getScriptMediatorInputConnector_3064IncomingLinks(
			View view) {
		ScriptMediatorInputConnector modelElement = (ScriptMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getScriptMediatorOutputConnector_3065IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFaultMediator_3220IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFaultMediatorInputConnector_3067IncomingLinks(
			View view) {
		FaultMediatorInputConnector modelElement = (FaultMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFaultMediatorOutputConnector_3068IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getXQueryMediator_3221IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getXQueryMediatorInputConnector_3070IncomingLinks(
			View view) {
		XQueryMediatorInputConnector modelElement = (XQueryMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getXQueryMediatorOutputConnector_3071IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCommandMediator_3222IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCommandMediatorInputConnector_3073IncomingLinks(
			View view) {
		CommandMediatorInputConnector modelElement = (CommandMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCommandMediatorOutputConnector_3074IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDBLookupMediator_3223IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDBLookupMediatorInputConnector_3076IncomingLinks(
			View view) {
		DBLookupMediatorInputConnector modelElement = (DBLookupMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDBLookupMediatorOutputConnector_3077IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDBReportMediator_3224IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDBReportMediatorInputConnector_3079IncomingLinks(
			View view) {
		DBReportMediatorInputConnector modelElement = (DBReportMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDBReportMediatorOutputConnector_3080IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSmooksMediator_3225IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSmooksMediatorInputConnector_3082IncomingLinks(
			View view) {
		SmooksMediatorInputConnector modelElement = (SmooksMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSmooksMediatorOutputConnector_3083IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSendMediator_3226IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSendMediatorInputConnector_3085IncomingLinks(
			View view) {
		SendMediatorInputConnector modelElement = (SendMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSendMediatorOutputConnector_3086IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getHeaderMediator_3227IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFailoverEndPointInputConnector_3088IncomingLinks(
			View view) {
		FailoverEndPointInputConnector modelElement = (FailoverEndPointInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFailoverEndPointOutputConnector_3090IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFailoverEndPointWestOutputConnector_3097IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getWSDLEndPoint_3385IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getWSDLEndPointInputConnector_3092IncomingLinks(
			View view) {
		WSDLEndPointInputConnector modelElement = (WSDLEndPointInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getWSDLEndPointOutputConnector_3093IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getLoadBalanceEndPoint_3386IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getLoadBalanceEndPointInputConnector_3095IncomingLinks(
			View view) {
		LoadBalanceEndPointInputConnector modelElement = (LoadBalanceEndPointInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getLoadBalanceEndPointOutputConnector_3096IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getLoadBalanceEndPointWestOutputConnector_3098IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getHeaderMediatorInputConnector_3100IncomingLinks(
			View view) {
		HeaderMediatorInputConnector modelElement = (HeaderMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getHeaderMediatorOutputConnector_3101IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCloneMediator_3228IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCloneMediatorInputConnector_3103IncomingLinks(
			View view) {
		CloneMediatorInputConnector modelElement = (CloneMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCloneMediatorOutputConnector_3104IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCloneMediatorTargetOutputConnector_3133IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCacheMediator_3229IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCacheMediatorInputConnector_3106IncomingLinks(
			View view) {
		CacheMediatorInputConnector modelElement = (CacheMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCacheMediatorOutputConnector_3107IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getIterateMediator_3230IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getIterateMediatorInputConnector_3109IncomingLinks(
			View view) {
		IterateMediatorInputConnector modelElement = (IterateMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getIterateMediatorOutputConnector_3110IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCalloutMediator_3231IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getAggregateMediatorInputConnector_3112IncomingLinks(
			View view) {
		AggregateMediatorInputConnector modelElement = (AggregateMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getAggregateMediatorOutputConnector_3113IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getAggregateMediatorOnCompleteOutputConnector_3132IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getLogMediator_3134IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getLogMediatorInputConnector_3135IncomingLinks(
			View view) {
		LogMediatorInputConnector modelElement = (LogMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getLogMediatorOutputConnector_3136IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDropMediator_3137IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDropMediatorInputConnector_3195IncomingLinks(
			View view) {
		DropMediatorInputConnector modelElement = (DropMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFilterMediator_3329IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFilterMediatorInputConnector_3330IncomingLinks(
			View view) {
		FilterMediatorInputConnector modelElement = (FilterMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFilterMediatorPassOutputConnector_3331IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFilterMediatorFailOutputConnector_3332IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getPropertyMediator_3333IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDropMediatorInputConnector_3192IncomingLinks(
			View view) {
		DropMediatorInputConnector modelElement = (DropMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDropMediatorInputConnector_3138IncomingLinks(
			View view) {
		DropMediatorInputConnector modelElement = (DropMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getPropertyMediator_3200IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFilterMediator_3139IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFilterMediatorInputConnector_3140IncomingLinks(
			View view) {
		FilterMediatorInputConnector modelElement = (FilterMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFilterMediatorPassOutputConnector_3141IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFilterMediatorFailOutputConnector_3142IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getPropertyMediator_3143IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getPropertyMediatorInputConnector_3203IncomingLinks(
			View view) {
		PropertyMediatorInputConnector modelElement = (PropertyMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getPropertyMediatorOutputConnector_3204IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getEnrichMediator_3334IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getEnrichMediatorInputConnector_3388IncomingLinks(
			View view) {
		EnrichMediatorInputConnector modelElement = (EnrichMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getEnrichMediatorOutputConnector_3389IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getXSLTMediator_3337IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getXSLTMediatorInputConnector_3338IncomingLinks(
			View view) {
		XSLTMediatorInputConnector modelElement = (XSLTMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getXSLTMediatorOutputConnector_3339IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSwitchMediator_3340IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSwitchMediatorInputConnector_3341IncomingLinks(
			View view) {
		SwitchMediatorInputConnector modelElement = (SwitchMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSwitchCaseBranchOutputConnector_3342IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSwitchDefaultBranchOutputConnector_3343IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFaultMediator_3344IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFaultMediatorInputConnector_3345IncomingLinks(
			View view) {
		FaultMediatorInputConnector modelElement = (FaultMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFaultMediatorOutputConnector_3346IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDBLookupMediator_3347IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDBLookupMediatorInputConnector_3348IncomingLinks(
			View view) {
		DBLookupMediatorInputConnector modelElement = (DBLookupMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDBLookupMediatorOutputConnector_3349IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDBReportMediator_3350IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDBReportMediatorInputConnector_3351IncomingLinks(
			View view) {
		DBReportMediatorInputConnector modelElement = (DBReportMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDBReportMediatorOutputConnector_3352IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSendMediator_3353IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSendMediatorInputConnector_3354IncomingLinks(
			View view) {
		SendMediatorInputConnector modelElement = (SendMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSendMediatorOutputConnector_3355IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getHeaderMediator_3356IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getHeaderMediatorInputConnector_3357IncomingLinks(
			View view) {
		HeaderMediatorInputConnector modelElement = (HeaderMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getHeaderMediatorOutputConnector_3358IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCloneMediator_3359IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCloneMediatorInputConnector_3360IncomingLinks(
			View view) {
		CloneMediatorInputConnector modelElement = (CloneMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCloneMediatorOutputConnector_3361IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCloneMediatorTargetOutputConnector_3362IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getIterateMediator_3363IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getIterateMediatorInputConnector_3364IncomingLinks(
			View view) {
		IterateMediatorInputConnector modelElement = (IterateMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getIterateMediatorOutputConnector_3365IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCalloutMediator_3366IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCalloutMediatorInputConnector_3367IncomingLinks(
			View view) {
		CalloutMediatorInputConnector modelElement = (CalloutMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCalloutMediatorOutputConnector_3368IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getTransactionMediator_3369IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getTransactionMediatorInputConnector_3370IncomingLinks(
			View view) {
		TransactionMediatorInputConnector modelElement = (TransactionMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getTransactionMediatorOutputConnector_3371IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getRMSequenceMediator_3372IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getRMSequenceMediatorInputConnector_3373IncomingLinks(
			View view) {
		RMSequenceMediatorInputConnector modelElement = (RMSequenceMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getRMSequenceMediatorOutputConnector_3374IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSequence_3375IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSequenceInputConnector_3376IncomingLinks(
			View view) {
		SequenceInputConnector modelElement = (SequenceInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSequenceOutputConnector_3377IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getProxyServiceEndpointContainer_3381IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDefaultEndPoint_3382IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getPropertyMediatorInputConnector_3144IncomingLinks(
			View view) {
		PropertyMediatorInputConnector modelElement = (PropertyMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getPropertyMediatorOutputConnector_3145IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getThrottleMediator_3206IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getThrottleMediatorInputConnector_3207IncomingLinks(
			View view) {
		ThrottleMediatorInputConnector modelElement = (ThrottleMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getThrottleMediatorOutputConnector_3208IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFilterMediator_3237IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFilterMediatorInputConnector_3238IncomingLinks(
			View view) {
		FilterMediatorInputConnector modelElement = (FilterMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFilterMediatorPassOutputConnector_3239IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFilterMediatorFailOutputConnector_3240IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getLogMediator_3241IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getLogMediatorInputConnector_3242IncomingLinks(
			View view) {
		LogMediatorInputConnector modelElement = (LogMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getLogMediatorOutputConnector_3243IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getEnrichMediator_3244IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getEnrichMediatorInputConnector_3245IncomingLinks(
			View view) {
		EnrichMediatorInputConnector modelElement = (EnrichMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getEnrichMediatorOutputConnector_3246IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getXSLTMediator_3247IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getXSLTMediatorInputConnector_3248IncomingLinks(
			View view) {
		XSLTMediatorInputConnector modelElement = (XSLTMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getXSLTMediatorOutputConnector_3249IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSwitchMediator_3250IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSwitchMediatorInputConnector_3251IncomingLinks(
			View view) {
		SwitchMediatorInputConnector modelElement = (SwitchMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSwitchCaseBranchOutputConnector_3252IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSwitchDefaultBranchOutputConnector_3253IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSequence_3254IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSequenceInputConnector_3255IncomingLinks(
			View view) {
		SequenceInputConnector modelElement = (SequenceInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSequenceOutputConnector_3256IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getEventMediator_3257IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getEventMediatorInputConnector_3258IncomingLinks(
			View view) {
		EventMediatorInputConnector modelElement = (EventMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getEventMediatorOutputConnector_3259IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getEntitlementMediator_3260IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getEntitlementMediatorInputConnector_3261IncomingLinks(
			View view) {
		EntitlementMediatorInputConnector modelElement = (EntitlementMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getEntitlementMediatorOutputConnector_3262IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getClassMediator_3263IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getClassMediatorInputConnector_3264IncomingLinks(
			View view) {
		ClassMediatorInputConnector modelElement = (ClassMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getClassMediatorOutputConnector_3265IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSpringMediator_3266IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSpringMediatorInputConnector_3267IncomingLinks(
			View view) {
		SpringMediatorInputConnector modelElement = (SpringMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSpringMediatorOutputConnector_3268IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getScriptMediator_3269IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getScriptMediatorInputConnector_3270IncomingLinks(
			View view) {
		ScriptMediatorInputConnector modelElement = (ScriptMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getScriptMediatorOutputConnector_3271IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFaultMediator_3272IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFaultMediatorInputConnector_3273IncomingLinks(
			View view) {
		FaultMediatorInputConnector modelElement = (FaultMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFaultMediatorOutputConnector_3274IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getXQueryMediator_3275IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getXQueryMediatorInputConnector_3276IncomingLinks(
			View view) {
		XQueryMediatorInputConnector modelElement = (XQueryMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getXQueryMediatorOutputConnector_3277IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCommandMediator_3278IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCommandMediatorInputConnector_3279IncomingLinks(
			View view) {
		CommandMediatorInputConnector modelElement = (CommandMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCommandMediatorOutputConnector_3280IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDBLookupMediator_3281IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDBLookupMediatorInputConnector_3282IncomingLinks(
			View view) {
		DBLookupMediatorInputConnector modelElement = (DBLookupMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDBLookupMediatorOutputConnector_3283IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDBReportMediator_3284IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDBReportMediatorInputConnector_3285IncomingLinks(
			View view) {
		DBReportMediatorInputConnector modelElement = (DBReportMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDBReportMediatorOutputConnector_3286IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSmooksMediator_3287IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSmooksMediatorInputConnector_3288IncomingLinks(
			View view) {
		SmooksMediatorInputConnector modelElement = (SmooksMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSmooksMediatorOutputConnector_3289IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSendMediator_3290IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSendMediatorInputConnector_3291IncomingLinks(
			View view) {
		SendMediatorInputConnector modelElement = (SendMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSendMediatorOutputConnector_3292IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getHeaderMediator_3293IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getHeaderMediatorInputConnector_3294IncomingLinks(
			View view) {
		HeaderMediatorInputConnector modelElement = (HeaderMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getHeaderMediatorOutputConnector_3295IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCloneMediator_3296IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCloneMediatorInputConnector_3297IncomingLinks(
			View view) {
		CloneMediatorInputConnector modelElement = (CloneMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCloneMediatorOutputConnector_3298IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCloneMediatorTargetOutputConnector_3299IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCacheMediator_3300IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCacheMediatorInputConnector_3301IncomingLinks(
			View view) {
		CacheMediatorInputConnector modelElement = (CacheMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCacheMediatorOutputConnector_3302IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getIterateMediator_3303IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getIterateMediatorInputConnector_3304IncomingLinks(
			View view) {
		IterateMediatorInputConnector modelElement = (IterateMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getIterateMediatorOutputConnector_3305IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCalloutMediator_3306IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCalloutMediatorInputConnector_3307IncomingLinks(
			View view) {
		CalloutMediatorInputConnector modelElement = (CalloutMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCalloutMediatorOutputConnector_3308IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getTransactionMediator_3309IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getTransactionMediatorInputConnector_3310IncomingLinks(
			View view) {
		TransactionMediatorInputConnector modelElement = (TransactionMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getTransactionMediatorOutputConnector_3311IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getRMSequenceMediator_3312IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getRMSequenceMediatorInputConnector_3313IncomingLinks(
			View view) {
		RMSequenceMediatorInputConnector modelElement = (RMSequenceMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getRMSequenceMediatorOutputConnector_3314IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getRuleMediator_3315IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getRuleMediatorInputConnector_3316IncomingLinks(
			View view) {
		RuleMediatorInputConnector modelElement = (RuleMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getRuleMediatorOutputConnector_3317IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getOAuthMediator_3318IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getOAuthMediatorInputConnector_3319IncomingLinks(
			View view) {
		OAuthMediatorInputConnector modelElement = (OAuthMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getOAuthMediatorOutputConnector_3320IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getAggregateMediator_3321IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getAggregateMediatorInputConnector_3322IncomingLinks(
			View view) {
		AggregateMediatorInputConnector modelElement = (AggregateMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getAggregateMediatorOutputConnector_3323IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getAggregateMediatorOnCompleteOutputConnector_3324IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getLogMediator_3325IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getLogMediatorInputConnector_3326IncomingLinks(
			View view) {
		LogMediatorInputConnector modelElement = (LogMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getLogMediatorOutputConnector_3327IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDropMediator_3328IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getEnrichMediator_3146IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getEnrichMediatorInputConnector_3147IncomingLinks(
			View view) {
		EnrichMediatorInputConnector modelElement = (EnrichMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getEnrichMediatorOutputConnector_3148IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getXSLTMediator_3149IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getXSLTMediatorInputConnector_3150IncomingLinks(
			View view) {
		XSLTMediatorInputConnector modelElement = (XSLTMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getXSLTMediatorOutputConnector_3151IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSwitchMediator_3152IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSwitchMediatorInputConnector_3153IncomingLinks(
			View view) {
		SwitchMediatorInputConnector modelElement = (SwitchMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSwitchCaseBranchOutputConnector_3154IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSwitchDefaultBranchOutputConnector_3155IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFaultMediator_3156IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFaultMediatorInputConnector_3157IncomingLinks(
			View view) {
		FaultMediatorInputConnector modelElement = (FaultMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFaultMediatorOutputConnector_3158IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDBLookupMediator_3159IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDBLookupMediatorInputConnector_3160IncomingLinks(
			View view) {
		DBLookupMediatorInputConnector modelElement = (DBLookupMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDBLookupMediatorOutputConnector_3161IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDBReportMediator_3162IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDBReportMediatorInputConnector_3163IncomingLinks(
			View view) {
		DBReportMediatorInputConnector modelElement = (DBReportMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDBReportMediatorOutputConnector_3164IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSendMediator_3165IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSendMediatorInputConnector_3166IncomingLinks(
			View view) {
		SendMediatorInputConnector modelElement = (SendMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSendMediatorOutputConnector_3167IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getHeaderMediator_3168IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getHeaderMediatorInputConnector_3169IncomingLinks(
			View view) {
		HeaderMediatorInputConnector modelElement = (HeaderMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getHeaderMediatorOutputConnector_3170IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCloneMediator_3171IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCloneMediatorInputConnector_3172IncomingLinks(
			View view) {
		CloneMediatorInputConnector modelElement = (CloneMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCloneMediatorOutputConnector_3173IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCloneMediatorTargetOutputConnector_3174IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getIterateMediator_3175IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getIterateMediatorInputConnector_3176IncomingLinks(
			View view) {
		IterateMediatorInputConnector modelElement = (IterateMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getIterateMediatorOutputConnector_3177IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCalloutMediator_3178IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCalloutMediatorInputConnector_3181IncomingLinks(
			View view) {
		CalloutMediatorInputConnector modelElement = (CalloutMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCalloutMediatorOutputConnector_3182IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCalloutMediatorInputConnector_3115IncomingLinks(
			View view) {
		CalloutMediatorInputConnector modelElement = (CalloutMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCalloutMediatorOutputConnector_3116IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getTransactionMediator_3232IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getTransactionMediator_3179IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getTransactionMediatorInputConnector_3183IncomingLinks(
			View view) {
		TransactionMediatorInputConnector modelElement = (TransactionMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getTransactionMediatorOutputConnector_3184IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getTransactionMediatorInputConnector_3118IncomingLinks(
			View view) {
		TransactionMediatorInputConnector modelElement = (TransactionMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getTransactionMediatorOutputConnector_3119IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getRMSequenceMediator_3233IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getRMSequenceMediator_3180IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getThrottleMediatorInputConnector_3121IncomingLinks(
			View view) {
		ThrottleMediatorInputConnector modelElement = (ThrottleMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getThrottleMediatorOutputConnector_3122IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFilterMediator_3209IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getRMSequenceMediatorInputConnector_3185IncomingLinks(
			View view) {
		RMSequenceMediatorInputConnector modelElement = (RMSequenceMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getRMSequenceMediatorOutputConnector_3186IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getRMSequenceMediatorInputConnector_3124IncomingLinks(
			View view) {
		RMSequenceMediatorInputConnector modelElement = (RMSequenceMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getRMSequenceMediatorOutputConnector_3125IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getRuleMediator_3234IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSequence_3187IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSequenceInputConnector_3188IncomingLinks(
			View view) {
		SequenceInputConnector modelElement = (SequenceInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSequenceOutputConnector_3189IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getRuleMediatorInputConnector_3127IncomingLinks(
			View view) {
		RuleMediatorInputConnector modelElement = (RuleMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getRuleMediatorOutputConnector_3128IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getOAuthMediator_3235IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getOAuthMediatorInputConnector_3130IncomingLinks(
			View view) {
		OAuthMediatorInputConnector modelElement = (OAuthMediatorInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getOAuthMediatorOutputConnector_3131IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getAggregateMediator_3236IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDefaultEndPointInputConnector_3021IncomingLinks(
			View view) {
		DefaultEndPointInputConnector modelElement = (DefaultEndPointInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDefaultEndPointOutputConnector_3022IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getAddressEndPoint_3383IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getAddressEndPointInputConnector_3030IncomingLinks(
			View view) {
		AddressEndPointInputConnector modelElement = (AddressEndPointInputConnector) view
				.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getAddressEndPointOutputConnector_3031IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFailoverEndPoint_3384IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getEsbLink_4001IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getEsbServer_2001OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getProxyService_3001OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getProxyOutputConnector_3002OutgoingLinks(
			View view) {
		ProxyOutputConnector modelElement = (ProxyOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getProxyInputConnector_3003OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getProxyServiceSequenceContainer_3196OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getProxyServiceInSequence_3197OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDropMediator_3191OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getMessageMediator_3045OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getMessageInputConnector_3046OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getMessageOutputConnector_3047OutgoingLinks(
			View view) {
		MessageOutputConnector modelElement = (MessageOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDropMediatorInputConnector_3008OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getPropertyMediator_3199OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getProxyServiceOutSequence_3198OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDropMediator_3194OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFilterMediatorInputConnector_3010OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFilterMediatorPassOutputConnector_3011OutgoingLinks(
			View view) {
		FilterMediatorPassOutputConnector modelElement = (FilterMediatorPassOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFilterMediatorFailOutputConnector_3012OutgoingLinks(
			View view) {
		FilterMediatorFailOutputConnector modelElement = (FilterMediatorFailOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getLogMediator_3210OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getMergeNode_3013OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getMergeNodeFirstInputConnector_3014OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getMergeNodeSecondInputConnector_3015OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getMergeNodeOutputConnector_3016OutgoingLinks(
			View view) {
		MergeNodeOutputConnector modelElement = (MergeNodeOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getLogMediatorInputConnector_3018OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getLogMediatorOutputConnector_3019OutgoingLinks(
			View view) {
		LogMediatorOutputConnector modelElement = (LogMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getEnrichMediator_3387OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getPropertyMediatorInputConnector_3201OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getPropertyMediatorOutputConnector_3202OutgoingLinks(
			View view) {
		PropertyMediatorOutputConnector modelElement = (PropertyMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getPropertyMediatorInputConnector_3033OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getPropertyMediatorOutputConnector_3034OutgoingLinks(
			View view) {
		PropertyMediatorOutputConnector modelElement = (PropertyMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getThrottleMediator_3205OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getEnrichMediatorInputConnector_3036OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getEnrichMediatorOutputConnector_3037OutgoingLinks(
			View view) {
		EnrichMediatorOutputConnector modelElement = (EnrichMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getXSLTMediator_3212OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getXSLTMediatorInputConnector_3039OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getXSLTMediatorOutputConnector_3040OutgoingLinks(
			View view) {
		XSLTMediatorOutputConnector modelElement = (XSLTMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSwitchMediator_3213OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSwitchMediatorInputConnector_3042OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSwitchCaseBranchOutputConnector_3043OutgoingLinks(
			View view) {
		SwitchCaseBranchOutputConnector modelElement = (SwitchCaseBranchOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSwitchDefaultBranchOutputConnector_3044OutgoingLinks(
			View view) {
		SwitchDefaultBranchOutputConnector modelElement = (SwitchDefaultBranchOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSequence_3214OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSequenceInputConnector_3049OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSequenceOutputConnector_3050OutgoingLinks(
			View view) {
		SequenceOutputConnector modelElement = (SequenceOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getEventMediator_3215OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getEventMediatorInputConnector_3052OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getEventMediatorOutputConnector_3053OutgoingLinks(
			View view) {
		EventMediatorOutputConnector modelElement = (EventMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getEntitlementMediator_3216OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getEntitlementMediatorInputConnector_3055OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getEntitlementMediatorOutputConnector_3056OutgoingLinks(
			View view) {
		EntitlementMediatorOutputConnector modelElement = (EntitlementMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getClassMediator_3217OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getClassMediatorInputConnector_3058OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getClassMediatorOutputConnector_3059OutgoingLinks(
			View view) {
		ClassMediatorOutputConnector modelElement = (ClassMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSpringMediator_3218OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSpringMediatorInputConnector_3061OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSpringMediatorOutputConnector_3062OutgoingLinks(
			View view) {
		SpringMediatorOutputConnector modelElement = (SpringMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getScriptMediator_3219OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getScriptMediatorInputConnector_3064OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getScriptMediatorOutputConnector_3065OutgoingLinks(
			View view) {
		ScriptMediatorOutputConnector modelElement = (ScriptMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFaultMediator_3220OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFaultMediatorInputConnector_3067OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFaultMediatorOutputConnector_3068OutgoingLinks(
			View view) {
		FaultMediatorOutputConnector modelElement = (FaultMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getXQueryMediator_3221OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getXQueryMediatorInputConnector_3070OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getXQueryMediatorOutputConnector_3071OutgoingLinks(
			View view) {
		XQueryMediatorOutputConnector modelElement = (XQueryMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCommandMediator_3222OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCommandMediatorInputConnector_3073OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCommandMediatorOutputConnector_3074OutgoingLinks(
			View view) {
		CommandMediatorOutputConnector modelElement = (CommandMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDBLookupMediator_3223OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDBLookupMediatorInputConnector_3076OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDBLookupMediatorOutputConnector_3077OutgoingLinks(
			View view) {
		DBLookupMediatorOutputConnector modelElement = (DBLookupMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDBReportMediator_3224OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDBReportMediatorInputConnector_3079OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDBReportMediatorOutputConnector_3080OutgoingLinks(
			View view) {
		DBReportMediatorOutputConnector modelElement = (DBReportMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSmooksMediator_3225OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSmooksMediatorInputConnector_3082OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSmooksMediatorOutputConnector_3083OutgoingLinks(
			View view) {
		SmooksMediatorOutputConnector modelElement = (SmooksMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSendMediator_3226OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSendMediatorInputConnector_3085OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSendMediatorOutputConnector_3086OutgoingLinks(
			View view) {
		SendMediatorOutputConnector modelElement = (SendMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getHeaderMediator_3227OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFailoverEndPointInputConnector_3088OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFailoverEndPointOutputConnector_3090OutgoingLinks(
			View view) {
		FailoverEndPointOutputConnector modelElement = (FailoverEndPointOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFailoverEndPointWestOutputConnector_3097OutgoingLinks(
			View view) {
		FailoverEndPointWestOutputConnector modelElement = (FailoverEndPointWestOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getWSDLEndPoint_3385OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getWSDLEndPointInputConnector_3092OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getWSDLEndPointOutputConnector_3093OutgoingLinks(
			View view) {
		WSDLEndPointOutputConnector modelElement = (WSDLEndPointOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getLoadBalanceEndPoint_3386OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getLoadBalanceEndPointInputConnector_3095OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getLoadBalanceEndPointOutputConnector_3096OutgoingLinks(
			View view) {
		LoadBalanceEndPointOutputConnector modelElement = (LoadBalanceEndPointOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getLoadBalanceEndPointWestOutputConnector_3098OutgoingLinks(
			View view) {
		LoadBalanceEndPointWestOutputConnector modelElement = (LoadBalanceEndPointWestOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getHeaderMediatorInputConnector_3100OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getHeaderMediatorOutputConnector_3101OutgoingLinks(
			View view) {
		HeaderMediatorOutputConnector modelElement = (HeaderMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCloneMediator_3228OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCloneMediatorInputConnector_3103OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCloneMediatorOutputConnector_3104OutgoingLinks(
			View view) {
		CloneMediatorOutputConnector modelElement = (CloneMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCloneMediatorTargetOutputConnector_3133OutgoingLinks(
			View view) {
		CloneMediatorTargetOutputConnector modelElement = (CloneMediatorTargetOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCacheMediator_3229OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCacheMediatorInputConnector_3106OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCacheMediatorOutputConnector_3107OutgoingLinks(
			View view) {
		CacheMediatorOutputConnector modelElement = (CacheMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getIterateMediator_3230OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getIterateMediatorInputConnector_3109OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getIterateMediatorOutputConnector_3110OutgoingLinks(
			View view) {
		IterateMediatorOutputConnector modelElement = (IterateMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCalloutMediator_3231OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getAggregateMediatorInputConnector_3112OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getAggregateMediatorOutputConnector_3113OutgoingLinks(
			View view) {
		AggregateMediatorOutputConnector modelElement = (AggregateMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getAggregateMediatorOnCompleteOutputConnector_3132OutgoingLinks(
			View view) {
		AggregateMediatorOnCompleteOutputConnector modelElement = (AggregateMediatorOnCompleteOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getLogMediator_3134OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getLogMediatorInputConnector_3135OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getLogMediatorOutputConnector_3136OutgoingLinks(
			View view) {
		LogMediatorOutputConnector modelElement = (LogMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDropMediator_3137OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDropMediatorInputConnector_3195OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFilterMediator_3329OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFilterMediatorInputConnector_3330OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFilterMediatorPassOutputConnector_3331OutgoingLinks(
			View view) {
		FilterMediatorPassOutputConnector modelElement = (FilterMediatorPassOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFilterMediatorFailOutputConnector_3332OutgoingLinks(
			View view) {
		FilterMediatorFailOutputConnector modelElement = (FilterMediatorFailOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getPropertyMediator_3333OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDropMediatorInputConnector_3192OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDropMediatorInputConnector_3138OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getPropertyMediator_3200OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFilterMediator_3139OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFilterMediatorInputConnector_3140OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFilterMediatorPassOutputConnector_3141OutgoingLinks(
			View view) {
		FilterMediatorPassOutputConnector modelElement = (FilterMediatorPassOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFilterMediatorFailOutputConnector_3142OutgoingLinks(
			View view) {
		FilterMediatorFailOutputConnector modelElement = (FilterMediatorFailOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getPropertyMediator_3143OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getPropertyMediatorInputConnector_3203OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getPropertyMediatorOutputConnector_3204OutgoingLinks(
			View view) {
		PropertyMediatorOutputConnector modelElement = (PropertyMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getEnrichMediator_3334OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getEnrichMediatorInputConnector_3388OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getEnrichMediatorOutputConnector_3389OutgoingLinks(
			View view) {
		EnrichMediatorOutputConnector modelElement = (EnrichMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getXSLTMediator_3337OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getXSLTMediatorInputConnector_3338OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getXSLTMediatorOutputConnector_3339OutgoingLinks(
			View view) {
		XSLTMediatorOutputConnector modelElement = (XSLTMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSwitchMediator_3340OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSwitchMediatorInputConnector_3341OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSwitchCaseBranchOutputConnector_3342OutgoingLinks(
			View view) {
		SwitchCaseBranchOutputConnector modelElement = (SwitchCaseBranchOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSwitchDefaultBranchOutputConnector_3343OutgoingLinks(
			View view) {
		SwitchDefaultBranchOutputConnector modelElement = (SwitchDefaultBranchOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFaultMediator_3344OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFaultMediatorInputConnector_3345OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFaultMediatorOutputConnector_3346OutgoingLinks(
			View view) {
		FaultMediatorOutputConnector modelElement = (FaultMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDBLookupMediator_3347OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDBLookupMediatorInputConnector_3348OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDBLookupMediatorOutputConnector_3349OutgoingLinks(
			View view) {
		DBLookupMediatorOutputConnector modelElement = (DBLookupMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDBReportMediator_3350OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDBReportMediatorInputConnector_3351OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDBReportMediatorOutputConnector_3352OutgoingLinks(
			View view) {
		DBReportMediatorOutputConnector modelElement = (DBReportMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSendMediator_3353OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSendMediatorInputConnector_3354OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSendMediatorOutputConnector_3355OutgoingLinks(
			View view) {
		SendMediatorOutputConnector modelElement = (SendMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getHeaderMediator_3356OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getHeaderMediatorInputConnector_3357OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getHeaderMediatorOutputConnector_3358OutgoingLinks(
			View view) {
		HeaderMediatorOutputConnector modelElement = (HeaderMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCloneMediator_3359OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCloneMediatorInputConnector_3360OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCloneMediatorOutputConnector_3361OutgoingLinks(
			View view) {
		CloneMediatorOutputConnector modelElement = (CloneMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCloneMediatorTargetOutputConnector_3362OutgoingLinks(
			View view) {
		CloneMediatorTargetOutputConnector modelElement = (CloneMediatorTargetOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getIterateMediator_3363OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getIterateMediatorInputConnector_3364OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getIterateMediatorOutputConnector_3365OutgoingLinks(
			View view) {
		IterateMediatorOutputConnector modelElement = (IterateMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCalloutMediator_3366OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCalloutMediatorInputConnector_3367OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCalloutMediatorOutputConnector_3368OutgoingLinks(
			View view) {
		CalloutMediatorOutputConnector modelElement = (CalloutMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getTransactionMediator_3369OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getTransactionMediatorInputConnector_3370OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getTransactionMediatorOutputConnector_3371OutgoingLinks(
			View view) {
		TransactionMediatorOutputConnector modelElement = (TransactionMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getRMSequenceMediator_3372OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getRMSequenceMediatorInputConnector_3373OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getRMSequenceMediatorOutputConnector_3374OutgoingLinks(
			View view) {
		RMSequenceMediatorOutputConnector modelElement = (RMSequenceMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSequence_3375OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSequenceInputConnector_3376OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSequenceOutputConnector_3377OutgoingLinks(
			View view) {
		SequenceOutputConnector modelElement = (SequenceOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getProxyServiceEndpointContainer_3381OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDefaultEndPoint_3382OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getPropertyMediatorInputConnector_3144OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getPropertyMediatorOutputConnector_3145OutgoingLinks(
			View view) {
		PropertyMediatorOutputConnector modelElement = (PropertyMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getThrottleMediator_3206OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getThrottleMediatorInputConnector_3207OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getThrottleMediatorOutputConnector_3208OutgoingLinks(
			View view) {
		ThrottleMediatorOutputConnector modelElement = (ThrottleMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFilterMediator_3237OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFilterMediatorInputConnector_3238OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFilterMediatorPassOutputConnector_3239OutgoingLinks(
			View view) {
		FilterMediatorPassOutputConnector modelElement = (FilterMediatorPassOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFilterMediatorFailOutputConnector_3240OutgoingLinks(
			View view) {
		FilterMediatorFailOutputConnector modelElement = (FilterMediatorFailOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getLogMediator_3241OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getLogMediatorInputConnector_3242OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getLogMediatorOutputConnector_3243OutgoingLinks(
			View view) {
		LogMediatorOutputConnector modelElement = (LogMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getEnrichMediator_3244OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getEnrichMediatorInputConnector_3245OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getEnrichMediatorOutputConnector_3246OutgoingLinks(
			View view) {
		EnrichMediatorOutputConnector modelElement = (EnrichMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getXSLTMediator_3247OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getXSLTMediatorInputConnector_3248OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getXSLTMediatorOutputConnector_3249OutgoingLinks(
			View view) {
		XSLTMediatorOutputConnector modelElement = (XSLTMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSwitchMediator_3250OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSwitchMediatorInputConnector_3251OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSwitchCaseBranchOutputConnector_3252OutgoingLinks(
			View view) {
		SwitchCaseBranchOutputConnector modelElement = (SwitchCaseBranchOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSwitchDefaultBranchOutputConnector_3253OutgoingLinks(
			View view) {
		SwitchDefaultBranchOutputConnector modelElement = (SwitchDefaultBranchOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSequence_3254OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSequenceInputConnector_3255OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSequenceOutputConnector_3256OutgoingLinks(
			View view) {
		SequenceOutputConnector modelElement = (SequenceOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getEventMediator_3257OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getEventMediatorInputConnector_3258OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getEventMediatorOutputConnector_3259OutgoingLinks(
			View view) {
		EventMediatorOutputConnector modelElement = (EventMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getEntitlementMediator_3260OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getEntitlementMediatorInputConnector_3261OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getEntitlementMediatorOutputConnector_3262OutgoingLinks(
			View view) {
		EntitlementMediatorOutputConnector modelElement = (EntitlementMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getClassMediator_3263OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getClassMediatorInputConnector_3264OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getClassMediatorOutputConnector_3265OutgoingLinks(
			View view) {
		ClassMediatorOutputConnector modelElement = (ClassMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSpringMediator_3266OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSpringMediatorInputConnector_3267OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSpringMediatorOutputConnector_3268OutgoingLinks(
			View view) {
		SpringMediatorOutputConnector modelElement = (SpringMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getScriptMediator_3269OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getScriptMediatorInputConnector_3270OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getScriptMediatorOutputConnector_3271OutgoingLinks(
			View view) {
		ScriptMediatorOutputConnector modelElement = (ScriptMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFaultMediator_3272OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFaultMediatorInputConnector_3273OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFaultMediatorOutputConnector_3274OutgoingLinks(
			View view) {
		FaultMediatorOutputConnector modelElement = (FaultMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getXQueryMediator_3275OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getXQueryMediatorInputConnector_3276OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getXQueryMediatorOutputConnector_3277OutgoingLinks(
			View view) {
		XQueryMediatorOutputConnector modelElement = (XQueryMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCommandMediator_3278OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCommandMediatorInputConnector_3279OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCommandMediatorOutputConnector_3280OutgoingLinks(
			View view) {
		CommandMediatorOutputConnector modelElement = (CommandMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDBLookupMediator_3281OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDBLookupMediatorInputConnector_3282OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDBLookupMediatorOutputConnector_3283OutgoingLinks(
			View view) {
		DBLookupMediatorOutputConnector modelElement = (DBLookupMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDBReportMediator_3284OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDBReportMediatorInputConnector_3285OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDBReportMediatorOutputConnector_3286OutgoingLinks(
			View view) {
		DBReportMediatorOutputConnector modelElement = (DBReportMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSmooksMediator_3287OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSmooksMediatorInputConnector_3288OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSmooksMediatorOutputConnector_3289OutgoingLinks(
			View view) {
		SmooksMediatorOutputConnector modelElement = (SmooksMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSendMediator_3290OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSendMediatorInputConnector_3291OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSendMediatorOutputConnector_3292OutgoingLinks(
			View view) {
		SendMediatorOutputConnector modelElement = (SendMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getHeaderMediator_3293OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getHeaderMediatorInputConnector_3294OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getHeaderMediatorOutputConnector_3295OutgoingLinks(
			View view) {
		HeaderMediatorOutputConnector modelElement = (HeaderMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCloneMediator_3296OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCloneMediatorInputConnector_3297OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCloneMediatorOutputConnector_3298OutgoingLinks(
			View view) {
		CloneMediatorOutputConnector modelElement = (CloneMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCloneMediatorTargetOutputConnector_3299OutgoingLinks(
			View view) {
		CloneMediatorTargetOutputConnector modelElement = (CloneMediatorTargetOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCacheMediator_3300OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCacheMediatorInputConnector_3301OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCacheMediatorOutputConnector_3302OutgoingLinks(
			View view) {
		CacheMediatorOutputConnector modelElement = (CacheMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getIterateMediator_3303OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getIterateMediatorInputConnector_3304OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getIterateMediatorOutputConnector_3305OutgoingLinks(
			View view) {
		IterateMediatorOutputConnector modelElement = (IterateMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCalloutMediator_3306OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCalloutMediatorInputConnector_3307OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCalloutMediatorOutputConnector_3308OutgoingLinks(
			View view) {
		CalloutMediatorOutputConnector modelElement = (CalloutMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getTransactionMediator_3309OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getTransactionMediatorInputConnector_3310OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getTransactionMediatorOutputConnector_3311OutgoingLinks(
			View view) {
		TransactionMediatorOutputConnector modelElement = (TransactionMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getRMSequenceMediator_3312OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getRMSequenceMediatorInputConnector_3313OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getRMSequenceMediatorOutputConnector_3314OutgoingLinks(
			View view) {
		RMSequenceMediatorOutputConnector modelElement = (RMSequenceMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getRuleMediator_3315OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getRuleMediatorInputConnector_3316OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getRuleMediatorOutputConnector_3317OutgoingLinks(
			View view) {
		RuleMediatorOutputConnector modelElement = (RuleMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getOAuthMediator_3318OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getOAuthMediatorInputConnector_3319OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getOAuthMediatorOutputConnector_3320OutgoingLinks(
			View view) {
		OAuthMediatorOutputConnector modelElement = (OAuthMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getAggregateMediator_3321OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getAggregateMediatorInputConnector_3322OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getAggregateMediatorOutputConnector_3323OutgoingLinks(
			View view) {
		AggregateMediatorOutputConnector modelElement = (AggregateMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getAggregateMediatorOnCompleteOutputConnector_3324OutgoingLinks(
			View view) {
		AggregateMediatorOnCompleteOutputConnector modelElement = (AggregateMediatorOnCompleteOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getLogMediator_3325OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getLogMediatorInputConnector_3326OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getLogMediatorOutputConnector_3327OutgoingLinks(
			View view) {
		LogMediatorOutputConnector modelElement = (LogMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDropMediator_3328OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getEnrichMediator_3146OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getEnrichMediatorInputConnector_3147OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getEnrichMediatorOutputConnector_3148OutgoingLinks(
			View view) {
		EnrichMediatorOutputConnector modelElement = (EnrichMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getXSLTMediator_3149OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getXSLTMediatorInputConnector_3150OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getXSLTMediatorOutputConnector_3151OutgoingLinks(
			View view) {
		XSLTMediatorOutputConnector modelElement = (XSLTMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSwitchMediator_3152OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSwitchMediatorInputConnector_3153OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSwitchCaseBranchOutputConnector_3154OutgoingLinks(
			View view) {
		SwitchCaseBranchOutputConnector modelElement = (SwitchCaseBranchOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSwitchDefaultBranchOutputConnector_3155OutgoingLinks(
			View view) {
		SwitchDefaultBranchOutputConnector modelElement = (SwitchDefaultBranchOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFaultMediator_3156OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFaultMediatorInputConnector_3157OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFaultMediatorOutputConnector_3158OutgoingLinks(
			View view) {
		FaultMediatorOutputConnector modelElement = (FaultMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDBLookupMediator_3159OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDBLookupMediatorInputConnector_3160OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDBLookupMediatorOutputConnector_3161OutgoingLinks(
			View view) {
		DBLookupMediatorOutputConnector modelElement = (DBLookupMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDBReportMediator_3162OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDBReportMediatorInputConnector_3163OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDBReportMediatorOutputConnector_3164OutgoingLinks(
			View view) {
		DBReportMediatorOutputConnector modelElement = (DBReportMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSendMediator_3165OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSendMediatorInputConnector_3166OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSendMediatorOutputConnector_3167OutgoingLinks(
			View view) {
		SendMediatorOutputConnector modelElement = (SendMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getHeaderMediator_3168OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getHeaderMediatorInputConnector_3169OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getHeaderMediatorOutputConnector_3170OutgoingLinks(
			View view) {
		HeaderMediatorOutputConnector modelElement = (HeaderMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCloneMediator_3171OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCloneMediatorInputConnector_3172OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCloneMediatorOutputConnector_3173OutgoingLinks(
			View view) {
		CloneMediatorOutputConnector modelElement = (CloneMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCloneMediatorTargetOutputConnector_3174OutgoingLinks(
			View view) {
		CloneMediatorTargetOutputConnector modelElement = (CloneMediatorTargetOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getIterateMediator_3175OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getIterateMediatorInputConnector_3176OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getIterateMediatorOutputConnector_3177OutgoingLinks(
			View view) {
		IterateMediatorOutputConnector modelElement = (IterateMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCalloutMediator_3178OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCalloutMediatorInputConnector_3181OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCalloutMediatorOutputConnector_3182OutgoingLinks(
			View view) {
		CalloutMediatorOutputConnector modelElement = (CalloutMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCalloutMediatorInputConnector_3115OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getCalloutMediatorOutputConnector_3116OutgoingLinks(
			View view) {
		CalloutMediatorOutputConnector modelElement = (CalloutMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getTransactionMediator_3232OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getTransactionMediator_3179OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getTransactionMediatorInputConnector_3183OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getTransactionMediatorOutputConnector_3184OutgoingLinks(
			View view) {
		TransactionMediatorOutputConnector modelElement = (TransactionMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getTransactionMediatorInputConnector_3118OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getTransactionMediatorOutputConnector_3119OutgoingLinks(
			View view) {
		TransactionMediatorOutputConnector modelElement = (TransactionMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getRMSequenceMediator_3233OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getRMSequenceMediator_3180OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getThrottleMediatorInputConnector_3121OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getThrottleMediatorOutputConnector_3122OutgoingLinks(
			View view) {
		ThrottleMediatorOutputConnector modelElement = (ThrottleMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFilterMediator_3209OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getRMSequenceMediatorInputConnector_3185OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getRMSequenceMediatorOutputConnector_3186OutgoingLinks(
			View view) {
		RMSequenceMediatorOutputConnector modelElement = (RMSequenceMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getRMSequenceMediatorInputConnector_3124OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getRMSequenceMediatorOutputConnector_3125OutgoingLinks(
			View view) {
		RMSequenceMediatorOutputConnector modelElement = (RMSequenceMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getRuleMediator_3234OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSequence_3187OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSequenceInputConnector_3188OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getSequenceOutputConnector_3189OutgoingLinks(
			View view) {
		SequenceOutputConnector modelElement = (SequenceOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getRuleMediatorInputConnector_3127OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getRuleMediatorOutputConnector_3128OutgoingLinks(
			View view) {
		RuleMediatorOutputConnector modelElement = (RuleMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getOAuthMediator_3235OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getOAuthMediatorInputConnector_3130OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getOAuthMediatorOutputConnector_3131OutgoingLinks(
			View view) {
		OAuthMediatorOutputConnector modelElement = (OAuthMediatorOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getAggregateMediator_3236OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDefaultEndPointInputConnector_3021OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getDefaultEndPointOutputConnector_3022OutgoingLinks(
			View view) {
		DefaultEndPointOutputConnector modelElement = (DefaultEndPointOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getAddressEndPoint_3383OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getAddressEndPointInputConnector_3030OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getAddressEndPointOutputConnector_3031OutgoingLinks(
			View view) {
		AddressEndPointOutputConnector modelElement = (AddressEndPointOutputConnector) view
				.getElement();
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getFailoverEndPoint_3384OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getEsbLink_4001OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	private static Collection/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getContainedTypeModelFacetLinks_EsbLink_4001(
			OutputConnector container) {
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		EsbLink link = container.getOutgoingLink();
		if (EsbLinkEditPart.VISUAL_ID != EsbVisualIDRegistry
				.getLinkWithClassVisualID(link)) {
			return result;
		}
		InputConnector dst = link.getTarget();
		OutputConnector src = link.getSource();
		result.add(new EsbLinkDescriptor(src, dst, link,
				EsbElementTypes.EsbLink_4001, EsbLinkEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getIncomingTypeModelFacetLinks_EsbLink_4001(
			InputConnector target,
			Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences) {
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		Collection/*[org.eclipse.emf.ecore.EStructuralFeature.Setting]*/settings = (Collection) crossReferences
				.get(target);
		for (Iterator/*[org.eclipse.emf.ecore.EStructuralFeature.Setting]*/it = settings
				.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != EsbPackage.eINSTANCE
					.getEsbLink_Target()
					|| false == setting.getEObject() instanceof EsbLink) {
				continue;
			}
			EsbLink link = (EsbLink) setting.getEObject();
			if (EsbLinkEditPart.VISUAL_ID != EsbVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			OutputConnector src = link.getSource();
			result.add(new EsbLinkDescriptor(src, target, link,
					EsbElementTypes.EsbLink_4001, EsbLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/getOutgoingTypeModelFacetLinks_EsbLink_4001(
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
			return Collections.EMPTY_LIST;
		}
		LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/result = new LinkedList/*[org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbLinkDescriptor]*/();
		EsbLink link = container.getOutgoingLink();
		if (EsbLinkEditPart.VISUAL_ID != EsbVisualIDRegistry
				.getLinkWithClassVisualID(link)) {
			return result;
		}
		InputConnector dst = link.getTarget();
		OutputConnector src = link.getSource();
		if (src != source) {
			return result;
		}
		result.add(new EsbLinkDescriptor(src, dst, link,
				EsbElementTypes.EsbLink_4001, EsbLinkEditPart.VISUAL_ID));
		return result;
	}

}
