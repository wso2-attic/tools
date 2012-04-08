package org.wso2.developerstudio.eclipse.gmf.esb.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbDiagram;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.*;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class EsbVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "org.wso2.developerstudio.eclipse.gmf.esb.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (EsbDiagramEditPart.MODEL_ID.equals(view.getType())) {
				return EsbDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				EsbDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (EsbPackage.eINSTANCE.getEsbDiagram().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((EsbDiagram) domainElement)) {
			return EsbDiagramEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbVisualIDRegistry
				.getModelID(containerView);
		if (!EsbDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (EsbDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = EsbDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case EsbDiagramEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getEsbServer().isSuperTypeOf(
					domainElement.eClass())) {
				return EsbServerEditPart.VISUAL_ID;
			}
			break;
		case EsbServerEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getMessageMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return MessageMediatorEditPart.VISUAL_ID;
			}
			break;
		case ProxyServiceEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getProxyOutputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return ProxyOutputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getProxyInputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return ProxyInputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getProxyFaultInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return ProxyFaultInputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getProxyServiceContainer().isSuperTypeOf(
					domainElement.eClass())) {
				return ProxyServiceContainerEditPart.VISUAL_ID;
			}
			break;
		case ProxyServiceContainerEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE
					.getProxyServiceSequenceAndEndpointContainer()
					.isSuperTypeOf(domainElement.eClass())) {
				return ProxyServiceSequenceAndEndpointContainerEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getProxyServiceFaultContainer()
					.isSuperTypeOf(domainElement.eClass())) {
				return ProxyServiceFaultContainerEditPart.VISUAL_ID;
			}
			break;
		case ProxyServiceSequenceAndEndpointContainerEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getProxyServiceSequenceContainer()
					.isSuperTypeOf(domainElement.eClass())) {
				return ProxyServiceSequenceContainerEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getProxyServiceEndpointContainer()
					.isSuperTypeOf(domainElement.eClass())) {
				return ProxyServiceEndpointContainerEditPart.VISUAL_ID;
			}
			break;
		case ProxyServiceSequenceContainerEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getProxyServiceInSequence().isSuperTypeOf(
					domainElement.eClass())) {
				return ProxyServiceInSequenceEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getProxyServiceOutSequence()
					.isSuperTypeOf(domainElement.eClass())) {
				return ProxyServiceOutSequenceEditPart.VISUAL_ID;
			}
			break;
		case DropMediator3EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getDropMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return DropMediatorInputConnectorEditPart.VISUAL_ID;
			}
			break;
		case PropertyMediator3EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getPropertyMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return PropertyMediatorInputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getPropertyMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return PropertyMediatorOutputConnectorEditPart.VISUAL_ID;
			}
			break;
		case ThrottleMediatorEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getThrottleMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return ThrottleMediatorInputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getThrottleMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return ThrottleMediatorOutputConnectorEditPart.VISUAL_ID;
			}
			break;
		case FilterMediatorEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getFilterMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return FilterMediatorInputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getFilterMediatorPassOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return FilterMediatorPassOutputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getFilterMediatorFailOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return FilterMediatorFailOutputConnectorEditPart.VISUAL_ID;
			}
			break;
		case LogMediatorEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getLogMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return LogMediatorInputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getLogMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return LogMediatorOutputConnectorEditPart.VISUAL_ID;
			}
			break;
		case EnrichMediatorEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getEnrichMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return EnrichMediatorInputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getEnrichMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return EnrichMediatorOutputConnectorEditPart.VISUAL_ID;
			}
			break;
		case XSLTMediatorEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getXSLTMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return XSLTMediatorInputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getXSLTMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return XSLTMediatorOutputConnectorEditPart.VISUAL_ID;
			}
			break;
		case SwitchMediatorEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getSwitchMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return SwitchMediatorInputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSwitchCaseBranchOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return SwitchCaseBranchOutputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSwitchDefaultBranchOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return SwitchDefaultBranchOutputConnectorEditPart.VISUAL_ID;
			}
			break;
		case SequenceEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getSequenceInputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return SequenceInputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSequenceOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return SequenceOutputConnectorEditPart.VISUAL_ID;
			}
			break;
		case EventMediatorEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getEventMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return EventMediatorInputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getEventMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return EventMediatorOutputConnectorEditPart.VISUAL_ID;
			}
			break;
		case EntitlementMediatorEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getEntitlementMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return EntitlementMediatorInputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getEntitlementMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return EntitlementMediatorOutputConnectorEditPart.VISUAL_ID;
			}
			break;
		case ClassMediatorEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getClassMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return ClassMediatorInputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getClassMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return ClassMediatorOutputConnectorEditPart.VISUAL_ID;
			}
			break;
		case SpringMediatorEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getSpringMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return SpringMediatorInputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSpringMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return SpringMediatorOutputConnectorEditPart.VISUAL_ID;
			}
			break;
		case ScriptMediatorEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getScriptMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return ScriptMediatorInputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getScriptMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return ScriptMediatorOutputConnectorEditPart.VISUAL_ID;
			}
			break;
		case FaultMediatorEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getFaultMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return FaultMediatorInputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getFaultMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return FaultMediatorOutputConnectorEditPart.VISUAL_ID;
			}
			break;
		case XQueryMediatorEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getXQueryMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return XQueryMediatorInputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getXQueryMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return XQueryMediatorOutputConnectorEditPart.VISUAL_ID;
			}
			break;
		case CommandMediatorEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getCommandMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return CommandMediatorInputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getCommandMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return CommandMediatorOutputConnectorEditPart.VISUAL_ID;
			}
			break;
		case DBLookupMediatorEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getDBLookupMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return DBLookupMediatorInputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getDBLookupMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return DBLookupMediatorOutputConnectorEditPart.VISUAL_ID;
			}
			break;
		case DBReportMediatorEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getDBReportMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return DBReportMediatorInputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getDBReportMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return DBReportMediatorOutputConnectorEditPart.VISUAL_ID;
			}
			break;
		case SmooksMediatorEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getSmooksMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return SmooksMediatorInputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSmooksMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return SmooksMediatorOutputConnectorEditPart.VISUAL_ID;
			}
			break;
		case SendMediatorEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getSendMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return SendMediatorInputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSendMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return SendMediatorOutputConnectorEditPart.VISUAL_ID;
			}
			break;
		case HeaderMediatorEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getHeaderMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return HeaderMediatorInputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getHeaderMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return HeaderMediatorOutputConnectorEditPart.VISUAL_ID;
			}
			break;
		case CloneMediatorEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getCloneMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return CloneMediatorInputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getCloneMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return CloneMediatorOutputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getCloneMediatorTargetOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return CloneMediatorTargetOutputConnectorEditPart.VISUAL_ID;
			}
			break;
		case CacheMediatorEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getCacheMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return CacheMediatorInputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getCacheMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return CacheMediatorOutputConnectorEditPart.VISUAL_ID;
			}
			break;
		case IterateMediatorEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getIterateMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return IterateMediatorInputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getIterateMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return IterateMediatorOutputConnectorEditPart.VISUAL_ID;
			}
			break;
		case CalloutMediatorEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getCalloutMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return CalloutMediatorInputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getCalloutMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return CalloutMediatorOutputConnectorEditPart.VISUAL_ID;
			}
			break;
		case TransactionMediatorEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getTransactionMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return TransactionMediatorInputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getTransactionMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return TransactionMediatorOutputConnectorEditPart.VISUAL_ID;
			}
			break;
		case RMSequenceMediatorEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getRMSequenceMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return RMSequenceMediatorInputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getRMSequenceMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return RMSequenceMediatorOutputConnectorEditPart.VISUAL_ID;
			}
			break;
		case RuleMediatorEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getRuleMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return RuleMediatorInputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getRuleMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return RuleMediatorOutputConnectorEditPart.VISUAL_ID;
			}
			break;
		case OAuthMediatorEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getOAuthMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return OAuthMediatorInputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getOAuthMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return OAuthMediatorOutputConnectorEditPart.VISUAL_ID;
			}
			break;
		case AggregateMediatorEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getAggregateMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return AggregateMediatorInputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getAggregateMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return AggregateMediatorOutputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE
					.getAggregateMediatorOnCompleteOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return AggregateMediatorOnCompleteOutputConnectorEditPart.VISUAL_ID;
			}
			break;
		case LogMediator2EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getLogMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return LogMediatorInputConnector2EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getLogMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return LogMediatorOutputConnector2EditPart.VISUAL_ID;
			}
			break;
		case DropMediator2EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getDropMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return DropMediatorInputConnector2EditPart.VISUAL_ID;
			}
			break;
		case FilterMediator2EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getFilterMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return FilterMediatorInputConnector2EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getFilterMediatorPassOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return FilterMediatorPassOutputConnector2EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getFilterMediatorFailOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return FilterMediatorFailOutputConnector2EditPart.VISUAL_ID;
			}
			break;
		case PropertyMediator2EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getPropertyMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return PropertyMediatorInputConnector2EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getPropertyMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return PropertyMediatorOutputConnector2EditPart.VISUAL_ID;
			}
			break;
		case EnrichMediator2EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getEnrichMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return EnrichMediatorInputConnector2EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getEnrichMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return EnrichMediatorOutputConnector2EditPart.VISUAL_ID;
			}
			break;
		case XSLTMediator2EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getXSLTMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return XSLTMediatorInputConnector2EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getXSLTMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return XSLTMediatorOutputConnector2EditPart.VISUAL_ID;
			}
			break;
		case SwitchMediator2EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getSwitchMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return SwitchMediatorInputConnector2EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSwitchCaseBranchOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return SwitchCaseBranchOutputConnector2EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSwitchDefaultBranchOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return SwitchDefaultBranchOutputConnector2EditPart.VISUAL_ID;
			}
			break;
		case FaultMediator2EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getFaultMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return FaultMediatorInputConnector2EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getFaultMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return FaultMediatorOutputConnector2EditPart.VISUAL_ID;
			}
			break;
		case DBLookupMediator2EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getDBLookupMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return DBLookupMediatorInputConnector2EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getDBLookupMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return DBLookupMediatorOutputConnector2EditPart.VISUAL_ID;
			}
			break;
		case DBReportMediator2EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getDBReportMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return DBReportMediatorInputConnector2EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getDBReportMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return DBReportMediatorOutputConnector2EditPart.VISUAL_ID;
			}
			break;
		case SendMediator2EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getSendMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return SendMediatorInputConnector2EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSendMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return SendMediatorOutputConnector2EditPart.VISUAL_ID;
			}
			break;
		case HeaderMediator2EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getHeaderMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return HeaderMediatorInputConnector2EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getHeaderMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return HeaderMediatorOutputConnector2EditPart.VISUAL_ID;
			}
			break;
		case CloneMediator2EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getCloneMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return CloneMediatorInputConnector2EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getCloneMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return CloneMediatorOutputConnector2EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getCloneMediatorTargetOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return CloneMediatorTargetOutputConnector2EditPart.VISUAL_ID;
			}
			break;
		case IterateMediator2EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getIterateMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return IterateMediatorInputConnector2EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getIterateMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return IterateMediatorOutputConnector2EditPart.VISUAL_ID;
			}
			break;
		case CalloutMediator2EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getCalloutMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return CalloutMediatorInputConnector2EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getCalloutMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return CalloutMediatorOutputConnector2EditPart.VISUAL_ID;
			}
			break;
		case TransactionMediator2EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getTransactionMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return TransactionMediatorInputConnector2EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getTransactionMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return TransactionMediatorOutputConnector2EditPart.VISUAL_ID;
			}
			break;
		case RMSequenceMediator2EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getRMSequenceMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return RMSequenceMediatorInputConnector2EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getRMSequenceMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return RMSequenceMediatorOutputConnector2EditPart.VISUAL_ID;
			}
			break;
		case Sequence2EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getSequenceInputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return SequenceInputConnector2EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSequenceOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return SequenceOutputConnector2EditPart.VISUAL_ID;
			}
			break;
		case DropMediator4EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getDropMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return DropMediatorInputConnector3EditPart.VISUAL_ID;
			}
			break;
		case PropertyMediator4EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getPropertyMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return PropertyMediatorInputConnector3EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getPropertyMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return PropertyMediatorOutputConnector3EditPart.VISUAL_ID;
			}
			break;
		case ThrottleMediator2EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getThrottleMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return ThrottleMediatorInputConnector2EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getThrottleMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return ThrottleMediatorOutputConnector2EditPart.VISUAL_ID;
			}
			break;
		case FilterMediator3EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getFilterMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return FilterMediatorInputConnector3EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getFilterMediatorPassOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return FilterMediatorPassOutputConnector3EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getFilterMediatorFailOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return FilterMediatorFailOutputConnector3EditPart.VISUAL_ID;
			}
			break;
		case LogMediator3EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getLogMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return LogMediatorInputConnector3EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getLogMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return LogMediatorOutputConnector3EditPart.VISUAL_ID;
			}
			break;
		case EnrichMediator3EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getEnrichMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return EnrichMediatorInputConnector3EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getEnrichMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return EnrichMediatorOutputConnector3EditPart.VISUAL_ID;
			}
			break;
		case XSLTMediator3EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getXSLTMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return XSLTMediatorInputConnector3EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getXSLTMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return XSLTMediatorOutputConnector3EditPart.VISUAL_ID;
			}
			break;
		case SwitchMediator3EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getSwitchMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return SwitchMediatorInputConnector3EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSwitchCaseBranchOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return SwitchCaseBranchOutputConnector3EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSwitchDefaultBranchOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return SwitchDefaultBranchOutputConnector3EditPart.VISUAL_ID;
			}
			break;
		case Sequence3EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getSequenceInputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return SequenceInputConnector3EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSequenceOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return SequenceOutputConnector3EditPart.VISUAL_ID;
			}
			break;
		case EventMediator2EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getEventMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return EventMediatorInputConnector2EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getEventMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return EventMediatorOutputConnector2EditPart.VISUAL_ID;
			}
			break;
		case EntitlementMediator2EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getEntitlementMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return EntitlementMediatorInputConnector2EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getEntitlementMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return EntitlementMediatorOutputConnector2EditPart.VISUAL_ID;
			}
			break;
		case ClassMediator2EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getClassMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return ClassMediatorInputConnector2EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getClassMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return ClassMediatorOutputConnector2EditPart.VISUAL_ID;
			}
			break;
		case SpringMediator2EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getSpringMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return SpringMediatorInputConnector2EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSpringMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return SpringMediatorOutputConnector2EditPart.VISUAL_ID;
			}
			break;
		case ScriptMediator2EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getScriptMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return ScriptMediatorInputConnector2EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getScriptMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return ScriptMediatorOutputConnector2EditPart.VISUAL_ID;
			}
			break;
		case FaultMediator3EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getFaultMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return FaultMediatorInputConnector3EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getFaultMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return FaultMediatorOutputConnector3EditPart.VISUAL_ID;
			}
			break;
		case XQueryMediator2EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getXQueryMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return XQueryMediatorInputConnector2EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getXQueryMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return XQueryMediatorOutputConnector2EditPart.VISUAL_ID;
			}
			break;
		case CommandMediator2EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getCommandMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return CommandMediatorInputConnector2EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getCommandMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return CommandMediatorOutputConnector2EditPart.VISUAL_ID;
			}
			break;
		case DBLookupMediator3EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getDBLookupMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return DBLookupMediatorInputConnector3EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getDBLookupMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return DBLookupMediatorOutputConnector3EditPart.VISUAL_ID;
			}
			break;
		case DBReportMediator3EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getDBReportMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return DBReportMediatorInputConnector3EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getDBReportMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return DBReportMediatorOutputConnector3EditPart.VISUAL_ID;
			}
			break;
		case SmooksMediator2EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getSmooksMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return SmooksMediatorInputConnector2EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSmooksMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return SmooksMediatorOutputConnector2EditPart.VISUAL_ID;
			}
			break;
		case SendMediator3EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getSendMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return SendMediatorInputConnector3EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSendMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return SendMediatorOutputConnector3EditPart.VISUAL_ID;
			}
			break;
		case HeaderMediator3EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getHeaderMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return HeaderMediatorInputConnector3EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getHeaderMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return HeaderMediatorOutputConnector3EditPart.VISUAL_ID;
			}
			break;
		case CloneMediator3EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getCloneMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return CloneMediatorInputConnector3EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getCloneMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return CloneMediatorOutputConnector3EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getCloneMediatorTargetOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return CloneMediatorTargetOutputConnector3EditPart.VISUAL_ID;
			}
			break;
		case CacheMediator2EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getCacheMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return CacheMediatorInputConnector2EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getCacheMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return CacheMediatorOutputConnector2EditPart.VISUAL_ID;
			}
			break;
		case IterateMediator3EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getIterateMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return IterateMediatorInputConnector3EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getIterateMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return IterateMediatorOutputConnector3EditPart.VISUAL_ID;
			}
			break;
		case CalloutMediator3EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getCalloutMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return CalloutMediatorInputConnector3EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getCalloutMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return CalloutMediatorOutputConnector3EditPart.VISUAL_ID;
			}
			break;
		case TransactionMediator3EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getTransactionMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return TransactionMediatorInputConnector3EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getTransactionMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return TransactionMediatorOutputConnector3EditPart.VISUAL_ID;
			}
			break;
		case RMSequenceMediator3EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getRMSequenceMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return RMSequenceMediatorInputConnector3EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getRMSequenceMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return RMSequenceMediatorOutputConnector3EditPart.VISUAL_ID;
			}
			break;
		case RuleMediator2EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getRuleMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return RuleMediatorInputConnector2EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getRuleMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return RuleMediatorOutputConnector2EditPart.VISUAL_ID;
			}
			break;
		case OAuthMediator2EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getOAuthMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return OAuthMediatorInputConnector2EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getOAuthMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return OAuthMediatorOutputConnector2EditPart.VISUAL_ID;
			}
			break;
		case AggregateMediator2EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getAggregateMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return AggregateMediatorInputConnector2EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getAggregateMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return AggregateMediatorOutputConnector2EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE
					.getAggregateMediatorOnCompleteOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return AggregateMediatorOnCompleteOutputConnector2EditPart.VISUAL_ID;
			}
			break;
		case LogMediator4EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getLogMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return LogMediatorInputConnector4EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getLogMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return LogMediatorOutputConnector4EditPart.VISUAL_ID;
			}
			break;
		case DropMediator5EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getDropMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return DropMediatorInputConnector4EditPart.VISUAL_ID;
			}
			break;
		case FilterMediator4EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getFilterMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return FilterMediatorInputConnector4EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getFilterMediatorPassOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return FilterMediatorPassOutputConnector4EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getFilterMediatorFailOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return FilterMediatorFailOutputConnector4EditPart.VISUAL_ID;
			}
			break;
		case PropertyMediator5EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getPropertyMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return PropertyMediatorInputConnector4EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getPropertyMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return PropertyMediatorOutputConnector4EditPart.VISUAL_ID;
			}
			break;
		case EnrichMediator4EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getEnrichMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return EnrichMediatorInputConnector4EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getEnrichMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return EnrichMediatorOutputConnector4EditPart.VISUAL_ID;
			}
			break;
		case XSLTMediator4EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getXSLTMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return XSLTMediatorInputConnector4EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getXSLTMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return XSLTMediatorOutputConnector4EditPart.VISUAL_ID;
			}
			break;
		case SwitchMediator4EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getSwitchMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return SwitchMediatorInputConnector4EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSwitchCaseBranchOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return SwitchCaseBranchOutputConnector4EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSwitchDefaultBranchOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return SwitchDefaultBranchOutputConnector4EditPart.VISUAL_ID;
			}
			break;
		case FaultMediator4EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getFaultMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return FaultMediatorInputConnector4EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getFaultMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return FaultMediatorOutputConnector4EditPart.VISUAL_ID;
			}
			break;
		case DBLookupMediator4EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getDBLookupMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return DBLookupMediatorInputConnector4EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getDBLookupMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return DBLookupMediatorOutputConnector4EditPart.VISUAL_ID;
			}
			break;
		case DBReportMediator4EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getDBReportMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return DBReportMediatorInputConnector4EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getDBReportMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return DBReportMediatorOutputConnector4EditPart.VISUAL_ID;
			}
			break;
		case SendMediator4EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getSendMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return SendMediatorInputConnector4EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSendMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return SendMediatorOutputConnector4EditPart.VISUAL_ID;
			}
			break;
		case HeaderMediator4EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getHeaderMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return HeaderMediatorInputConnector4EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getHeaderMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return HeaderMediatorOutputConnector4EditPart.VISUAL_ID;
			}
			break;
		case CloneMediator4EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getCloneMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return CloneMediatorInputConnector4EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getCloneMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return CloneMediatorOutputConnector4EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getCloneMediatorTargetOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return CloneMediatorTargetOutputConnector4EditPart.VISUAL_ID;
			}
			break;
		case IterateMediator4EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getIterateMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return IterateMediatorInputConnector4EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getIterateMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return IterateMediatorOutputConnector4EditPart.VISUAL_ID;
			}
			break;
		case CalloutMediator4EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getCalloutMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return CalloutMediatorInputConnector4EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getCalloutMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return CalloutMediatorOutputConnector4EditPart.VISUAL_ID;
			}
			break;
		case TransactionMediator4EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getTransactionMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return TransactionMediatorInputConnector4EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getTransactionMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return TransactionMediatorOutputConnector4EditPart.VISUAL_ID;
			}
			break;
		case RMSequenceMediator4EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getRMSequenceMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return RMSequenceMediatorInputConnector4EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getRMSequenceMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return RMSequenceMediatorOutputConnector4EditPart.VISUAL_ID;
			}
			break;
		case Sequence4EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getSequenceInputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return SequenceInputConnector4EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSequenceOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return SequenceOutputConnector4EditPart.VISUAL_ID;
			}
			break;
		case DefaultEndPoint2EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getDefaultEndPointInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return DefaultEndPointInputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getDefaultEndPointOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return DefaultEndPointOutputConnectorEditPart.VISUAL_ID;
			}
			break;
		case AddressEndPoint2EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getAddressEndPointInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return AddressEndPointInputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getAddressEndPointOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return AddressEndPointOutputConnectorEditPart.VISUAL_ID;
			}
			break;
		case FailoverEndPoint2EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getFailoverEndPointInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return FailoverEndPointInputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getFailoverEndPointOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return FailoverEndPointOutputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getFailoverEndPointWestOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return FailoverEndPointWestOutputConnectorEditPart.VISUAL_ID;
			}
			break;
		case WSDLEndPoint2EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getWSDLEndPointInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return WSDLEndPointInputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getWSDLEndPointOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return WSDLEndPointOutputConnectorEditPart.VISUAL_ID;
			}
			break;
		case LoadBalanceEndPoint2EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getLoadBalanceEndPointInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return LoadBalanceEndPointInputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getLoadBalanceEndPointOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return LoadBalanceEndPointOutputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE
					.getLoadBalanceEndPointWestOutputConnector().isSuperTypeOf(
							domainElement.eClass())) {
				return LoadBalanceEndPointWestOutputConnectorEditPart.VISUAL_ID;
			}
			break;
		case DropMediatorEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getDropMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return DropMediatorInputConnector5EditPart.VISUAL_ID;
			}
			break;
		case PropertyMediatorEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getPropertyMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return PropertyMediatorInputConnector5EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getPropertyMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return PropertyMediatorOutputConnector5EditPart.VISUAL_ID;
			}
			break;
		case ThrottleMediator3EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getThrottleMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return ThrottleMediatorInputConnector3EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getThrottleMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return ThrottleMediatorOutputConnector3EditPart.VISUAL_ID;
			}
			break;
		case FilterMediator5EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getFilterMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return FilterMediatorInputConnector5EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getFilterMediatorPassOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return FilterMediatorPassOutputConnector5EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getFilterMediatorFailOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return FilterMediatorFailOutputConnector5EditPart.VISUAL_ID;
			}
			break;
		case LogMediator5EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getLogMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return LogMediatorInputConnector5EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getLogMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return LogMediatorOutputConnector5EditPart.VISUAL_ID;
			}
			break;
		case EnrichMediator5EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getEnrichMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return EnrichMediatorInputConnector5EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getEnrichMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return EnrichMediatorOutputConnector5EditPart.VISUAL_ID;
			}
			break;
		case XSLTMediator5EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getXSLTMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return XSLTMediatorInputConnector5EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getXSLTMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return XSLTMediatorOutputConnector5EditPart.VISUAL_ID;
			}
			break;
		case SwitchMediator5EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getSwitchMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return SwitchMediatorInputConnector5EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSwitchCaseBranchOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return SwitchCaseBranchOutputConnector5EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSwitchDefaultBranchOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return SwitchDefaultBranchOutputConnector5EditPart.VISUAL_ID;
			}
			break;
		case Sequence5EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getSequenceInputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return SequenceInputConnector5EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSequenceOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return SequenceOutputConnector5EditPart.VISUAL_ID;
			}
			break;
		case EventMediator3EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getEventMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return EventMediatorInputConnector3EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getEventMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return EventMediatorOutputConnector3EditPart.VISUAL_ID;
			}
			break;
		case EntitlementMediator3EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getEntitlementMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return EntitlementMediatorInputConnector3EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getEntitlementMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return EntitlementMediatorOutputConnector3EditPart.VISUAL_ID;
			}
			break;
		case ClassMediator3EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getClassMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return ClassMediatorInputConnector3EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getClassMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return ClassMediatorOutputConnector3EditPart.VISUAL_ID;
			}
			break;
		case SpringMediator3EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getSpringMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return SpringMediatorInputConnector3EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSpringMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return SpringMediatorOutputConnector3EditPart.VISUAL_ID;
			}
			break;
		case ScriptMediator3EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getScriptMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return ScriptMediatorInputConnector3EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getScriptMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return ScriptMediatorOutputConnector3EditPart.VISUAL_ID;
			}
			break;
		case FaultMediator5EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getFaultMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return FaultMediatorInputConnector5EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getFaultMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return FaultMediatorOutputConnector5EditPart.VISUAL_ID;
			}
			break;
		case XQueryMediator3EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getXQueryMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return XQueryMediatorInputConnector3EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getXQueryMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return XQueryMediatorOutputConnector3EditPart.VISUAL_ID;
			}
			break;
		case CommandMediator3EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getCommandMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return CommandMediatorInputConnector3EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getCommandMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return CommandMediatorOutputConnector3EditPart.VISUAL_ID;
			}
			break;
		case DBLookupMediator5EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getDBLookupMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return DBLookupMediatorInputConnector5EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getDBLookupMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return DBLookupMediatorOutputConnector5EditPart.VISUAL_ID;
			}
			break;
		case DBReportMediator5EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getDBReportMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return DBReportMediatorInputConnector5EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getDBReportMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return DBReportMediatorOutputConnector5EditPart.VISUAL_ID;
			}
			break;
		case SmooksMediator3EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getSmooksMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return SmooksMediatorInputConnector3EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSmooksMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return SmooksMediatorOutputConnector3EditPart.VISUAL_ID;
			}
			break;
		case SendMediator5EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getSendMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return SendMediatorInputConnector5EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSendMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return SendMediatorOutputConnector5EditPart.VISUAL_ID;
			}
			break;
		case HeaderMediator5EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getHeaderMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return HeaderMediatorInputConnector5EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getHeaderMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return HeaderMediatorOutputConnector5EditPart.VISUAL_ID;
			}
			break;
		case CloneMediator5EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getCloneMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return CloneMediatorInputConnector5EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getCloneMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return CloneMediatorOutputConnector5EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getCloneMediatorTargetOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return CloneMediatorTargetOutputConnector5EditPart.VISUAL_ID;
			}
			break;
		case CacheMediator3EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getCacheMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return CacheMediatorInputConnector3EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getCacheMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return CacheMediatorOutputConnector3EditPart.VISUAL_ID;
			}
			break;
		case IterateMediator5EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getIterateMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return IterateMediatorInputConnector5EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getIterateMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return IterateMediatorOutputConnector5EditPart.VISUAL_ID;
			}
			break;
		case CalloutMediator5EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getCalloutMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return CalloutMediatorInputConnector5EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getCalloutMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return CalloutMediatorOutputConnector5EditPart.VISUAL_ID;
			}
			break;
		case TransactionMediator5EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getTransactionMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return TransactionMediatorInputConnector5EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getTransactionMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return TransactionMediatorOutputConnector5EditPart.VISUAL_ID;
			}
			break;
		case RMSequenceMediator5EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getRMSequenceMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return RMSequenceMediatorInputConnector5EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getRMSequenceMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return RMSequenceMediatorOutputConnector5EditPart.VISUAL_ID;
			}
			break;
		case RuleMediator3EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getRuleMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return RuleMediatorInputConnector3EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getRuleMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return RuleMediatorOutputConnector3EditPart.VISUAL_ID;
			}
			break;
		case OAuthMediator3EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getOAuthMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return OAuthMediatorInputConnector3EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getOAuthMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return OAuthMediatorOutputConnector3EditPart.VISUAL_ID;
			}
			break;
		case MessageMediatorEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getMessageInputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return MessageInputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getMessageOutputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return MessageOutputConnectorEditPart.VISUAL_ID;
			}
			break;
		case MergeNodeEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getMergeNodeFirstInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return MergeNodeFirstInputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getMergeNodeSecondInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return MergeNodeSecondInputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getMergeNodeOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return MergeNodeOutputConnectorEditPart.VISUAL_ID;
			}
			break;
		case EsbServerContentsCompartmentEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getProxyService().isSuperTypeOf(
					domainElement.eClass())) {
				return ProxyServiceEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getMergeNode().isSuperTypeOf(
					domainElement.eClass())) {
				return MergeNodeEditPart.VISUAL_ID;
			}
			break;
		case ProxyServiceInSequenceProxyServiceInSequenceCompartmentEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getDropMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return DropMediator3EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getPropertyMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return PropertyMediator3EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getThrottleMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return ThrottleMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getFilterMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return FilterMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getLogMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return LogMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getEnrichMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return EnrichMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getXSLTMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return XSLTMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSwitchMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return SwitchMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSequence().isSuperTypeOf(
					domainElement.eClass())) {
				return SequenceEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getEventMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return EventMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getEntitlementMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return EntitlementMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getClassMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return ClassMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSpringMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return SpringMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getScriptMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return ScriptMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getFaultMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return FaultMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getXQueryMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return XQueryMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getCommandMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return CommandMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getDBLookupMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return DBLookupMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getDBReportMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return DBReportMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSmooksMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return SmooksMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSendMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return SendMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getHeaderMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return HeaderMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getCloneMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return CloneMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getCacheMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return CacheMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getIterateMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return IterateMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getCalloutMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return CalloutMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getTransactionMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return TransactionMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getRMSequenceMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return RMSequenceMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getRuleMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return RuleMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getOAuthMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return OAuthMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getAggregateMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return AggregateMediatorEditPart.VISUAL_ID;
			}
			break;
		case AggregateMediatorAggregateCompartmentEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getLogMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return LogMediator2EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getDropMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return DropMediator2EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getFilterMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return FilterMediator2EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getPropertyMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return PropertyMediator2EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getEnrichMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return EnrichMediator2EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getXSLTMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return XSLTMediator2EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSwitchMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return SwitchMediator2EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getFaultMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return FaultMediator2EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getDBLookupMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return DBLookupMediator2EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getDBReportMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return DBReportMediator2EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSendMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return SendMediator2EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getHeaderMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return HeaderMediator2EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getCloneMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return CloneMediator2EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getIterateMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return IterateMediator2EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getCalloutMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return CalloutMediator2EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getTransactionMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return TransactionMediator2EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getRMSequenceMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return RMSequenceMediator2EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSequence().isSuperTypeOf(
					domainElement.eClass())) {
				return Sequence2EditPart.VISUAL_ID;
			}
			break;
		case ProxyServiceOutSequenceProxyServiceOutSequenceCompartmentEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getDropMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return DropMediator4EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getPropertyMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return PropertyMediator4EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getThrottleMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return ThrottleMediator2EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getFilterMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return FilterMediator3EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getLogMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return LogMediator3EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getEnrichMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return EnrichMediator3EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getXSLTMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return XSLTMediator3EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSwitchMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return SwitchMediator3EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSequence().isSuperTypeOf(
					domainElement.eClass())) {
				return Sequence3EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getEventMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return EventMediator2EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getEntitlementMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return EntitlementMediator2EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getClassMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return ClassMediator2EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSpringMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return SpringMediator2EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getScriptMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return ScriptMediator2EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getFaultMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return FaultMediator3EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getXQueryMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return XQueryMediator2EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getCommandMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return CommandMediator2EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getDBLookupMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return DBLookupMediator3EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getDBReportMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return DBReportMediator3EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSmooksMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return SmooksMediator2EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSendMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return SendMediator3EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getHeaderMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return HeaderMediator3EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getCloneMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return CloneMediator3EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getCacheMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return CacheMediator2EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getIterateMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return IterateMediator3EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getCalloutMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return CalloutMediator3EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getTransactionMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return TransactionMediator3EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getRMSequenceMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return RMSequenceMediator3EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getRuleMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return RuleMediator2EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getOAuthMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return OAuthMediator2EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getAggregateMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return AggregateMediator2EditPart.VISUAL_ID;
			}
			break;
		case AggregateMediatorAggregateCompartment2EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getLogMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return LogMediator4EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getDropMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return DropMediator5EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getFilterMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return FilterMediator4EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getPropertyMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return PropertyMediator5EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getEnrichMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return EnrichMediator4EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getXSLTMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return XSLTMediator4EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSwitchMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return SwitchMediator4EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getFaultMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return FaultMediator4EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getDBLookupMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return DBLookupMediator4EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getDBReportMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return DBReportMediator4EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSendMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return SendMediator4EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getHeaderMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return HeaderMediator4EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getCloneMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return CloneMediator4EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getIterateMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return IterateMediator4EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getCalloutMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return CalloutMediator4EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getTransactionMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return TransactionMediator4EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getRMSequenceMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return RMSequenceMediator4EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSequence().isSuperTypeOf(
					domainElement.eClass())) {
				return Sequence4EditPart.VISUAL_ID;
			}
			break;
		case ProxyServiceEndpointContainerEndpointCompartmentEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getDefaultEndPoint().isSuperTypeOf(
					domainElement.eClass())) {
				return DefaultEndPoint2EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getAddressEndPoint().isSuperTypeOf(
					domainElement.eClass())) {
				return AddressEndPoint2EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getFailoverEndPoint().isSuperTypeOf(
					domainElement.eClass())) {
				return FailoverEndPoint2EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getWSDLEndPoint().isSuperTypeOf(
					domainElement.eClass())) {
				return WSDLEndPoint2EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getLoadBalanceEndPoint().isSuperTypeOf(
					domainElement.eClass())) {
				return LoadBalanceEndPoint2EditPart.VISUAL_ID;
			}
			break;
		case ProxyServiceFaultContainerProxyServiceFaultSequenceCompartmentEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getDropMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return DropMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getPropertyMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return PropertyMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getThrottleMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return ThrottleMediator3EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getFilterMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return FilterMediator5EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getLogMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return LogMediator5EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getEnrichMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return EnrichMediator5EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getXSLTMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return XSLTMediator5EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSwitchMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return SwitchMediator5EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSequence().isSuperTypeOf(
					domainElement.eClass())) {
				return Sequence5EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getEventMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return EventMediator3EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getEntitlementMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return EntitlementMediator3EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getClassMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return ClassMediator3EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSpringMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return SpringMediator3EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getScriptMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return ScriptMediator3EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getFaultMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return FaultMediator5EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getXQueryMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return XQueryMediator3EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getCommandMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return CommandMediator3EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getDBLookupMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return DBLookupMediator5EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getDBReportMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return DBReportMediator5EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSmooksMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return SmooksMediator3EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSendMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return SendMediator5EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getHeaderMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return HeaderMediator5EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getCloneMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return CloneMediator5EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getCacheMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return CacheMediator3EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getIterateMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return IterateMediator5EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getCalloutMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return CalloutMediator5EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getTransactionMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return TransactionMediator5EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getRMSequenceMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return RMSequenceMediator5EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getRuleMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return RuleMediator3EditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getOAuthMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return OAuthMediator3EditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbVisualIDRegistry
				.getModelID(containerView);
		if (!EsbDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (EsbDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = EsbDiagramEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case EsbDiagramEditPart.VISUAL_ID:
			if (EsbServerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EsbServerEditPart.VISUAL_ID:
			if (EsbServerContentsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MessageMediatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ProxyServiceEditPart.VISUAL_ID:
			if (ProxyServiceNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ProxyOutputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ProxyInputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ProxyFaultInputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ProxyServiceContainerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ProxyServiceContainerEditPart.VISUAL_ID:
			if (ProxyServiceSequenceAndEndpointContainerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ProxyServiceFaultContainerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ProxyServiceSequenceAndEndpointContainerEditPart.VISUAL_ID:
			if (ProxyServiceSequenceContainerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ProxyServiceEndpointContainerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ProxyServiceSequenceContainerEditPart.VISUAL_ID:
			if (ProxyServiceInSequenceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ProxyServiceOutSequenceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ProxyServiceInSequenceEditPart.VISUAL_ID:
			if (ProxyServiceInSequenceProxyServiceInSequenceCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DropMediator3EditPart.VISUAL_ID:
			if (DropMediatorInputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PropertyMediator3EditPart.VISUAL_ID:
			if (PropertyMediatorPropertyName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PropertyMediatorInputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PropertyMediatorOutputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ThrottleMediatorEditPart.VISUAL_ID:
			if (ThrottleMediatorGroupIdEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ThrottleMediatorInputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ThrottleMediatorOutputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FilterMediatorEditPart.VISUAL_ID:
			if (FilterMediatorConditionTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FilterMediatorInputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FilterMediatorPassOutputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FilterMediatorFailOutputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LogMediatorEditPart.VISUAL_ID:
			if (LogMediatorLogCategoryEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LogMediatorInputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LogMediatorOutputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EnrichMediatorEditPart.VISUAL_ID:
			if (EnrichMediatorSourceTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EnrichMediatorInputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EnrichMediatorOutputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case XSLTMediatorEditPart.VISUAL_ID:
			if (XSLTMediatorInputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (XSLTMediatorOutputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SwitchMediatorEditPart.VISUAL_ID:
			if (SwitchMediatorInputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SwitchCaseBranchOutputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SwitchDefaultBranchOutputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SequenceEditPart.VISUAL_ID:
			if (SequenceNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SequenceInputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SequenceOutputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EventMediatorEditPart.VISUAL_ID:
			if (EventMediatorTopicTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EventMediatorInputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EventMediatorOutputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EntitlementMediatorEditPart.VISUAL_ID:
			if (EntitlementMediatorServerURLEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EntitlementMediatorInputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EntitlementMediatorOutputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ClassMediatorEditPart.VISUAL_ID:
			if (ClassMediatorClassNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ClassMediatorInputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ClassMediatorOutputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SpringMediatorEditPart.VISUAL_ID:
			if (SpringMediatorBeanNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SpringMediatorInputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SpringMediatorOutputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ScriptMediatorEditPart.VISUAL_ID:
			if (ScriptMediatorScriptLanguageEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ScriptMediatorInputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ScriptMediatorOutputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FaultMediatorEditPart.VISUAL_ID:
			if (FaultMediatorFaultStringTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FaultMediatorInputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FaultMediatorOutputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case XQueryMediatorEditPart.VISUAL_ID:
			if (XQueryMediatorScriptKeyTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (XQueryMediatorInputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (XQueryMediatorOutputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CommandMediatorEditPart.VISUAL_ID:
			if (CommandMediatorClassNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CommandMediatorInputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CommandMediatorOutputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DBLookupMediatorEditPart.VISUAL_ID:
			if (DBLookupMediatorConnectionURLEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DBLookupMediatorInputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DBLookupMediatorOutputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DBReportMediatorEditPart.VISUAL_ID:
			if (DBReportMediatorConnectionURLEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DBReportMediatorInputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DBReportMediatorOutputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SmooksMediatorEditPart.VISUAL_ID:
			if (SmooksMediatorInputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SmooksMediatorOutputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SendMediatorEditPart.VISUAL_ID:
			if (SendMediatorInputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SendMediatorOutputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case HeaderMediatorEditPart.VISUAL_ID:
			if (HeaderMediatorValueLiteralEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (HeaderMediatorInputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (HeaderMediatorOutputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CloneMediatorEditPart.VISUAL_ID:
			if (CloneMediatorCloneIDEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CloneMediatorInputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CloneMediatorOutputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CloneMediatorTargetOutputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CacheMediatorEditPart.VISUAL_ID:
			if (CacheMediatorCacheIdEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CacheMediatorInputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CacheMediatorOutputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IterateMediatorEditPart.VISUAL_ID:
			if (IterateMediatorIterateIDEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IterateMediatorInputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IterateMediatorOutputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CalloutMediatorEditPart.VISUAL_ID:
			if (CalloutMediatorSoapActionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CalloutMediatorInputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CalloutMediatorOutputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TransactionMediatorEditPart.VISUAL_ID:
			if (TransactionMediatorInputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TransactionMediatorOutputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RMSequenceMediatorEditPart.VISUAL_ID:
			if (RMSequenceMediatorInputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RMSequenceMediatorOutputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RuleMediatorEditPart.VISUAL_ID:
			if (RuleMediatorInputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RuleMediatorOutputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OAuthMediatorEditPart.VISUAL_ID:
			if (OAuthMediatorRemoteServiceUrlEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OAuthMediatorInputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OAuthMediatorOutputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AggregateMediatorEditPart.VISUAL_ID:
			if (AggregateMediatorAggregateIDEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AggregateMediatorAggregateCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AggregateMediatorInputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AggregateMediatorOutputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AggregateMediatorOnCompleteOutputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LogMediator2EditPart.VISUAL_ID:
			if (LogMediatorLogCategory2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LogMediatorInputConnector2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LogMediatorOutputConnector2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DropMediator2EditPart.VISUAL_ID:
			if (DropMediatorInputConnector2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FilterMediator2EditPart.VISUAL_ID:
			if (FilterMediatorConditionType2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FilterMediatorInputConnector2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FilterMediatorPassOutputConnector2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FilterMediatorFailOutputConnector2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PropertyMediator2EditPart.VISUAL_ID:
			if (PropertyMediatorPropertyName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PropertyMediatorInputConnector2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PropertyMediatorOutputConnector2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EnrichMediator2EditPart.VISUAL_ID:
			if (EnrichMediatorSourceType2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EnrichMediatorInputConnector2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EnrichMediatorOutputConnector2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case XSLTMediator2EditPart.VISUAL_ID:
			if (XSLTMediatorInputConnector2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (XSLTMediatorOutputConnector2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SwitchMediator2EditPart.VISUAL_ID:
			if (SwitchMediatorInputConnector2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SwitchCaseBranchOutputConnector2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SwitchDefaultBranchOutputConnector2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FaultMediator2EditPart.VISUAL_ID:
			if (FaultMediatorFaultStringType2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FaultMediatorInputConnector2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FaultMediatorOutputConnector2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DBLookupMediator2EditPart.VISUAL_ID:
			if (DBLookupMediatorConnectionURL2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DBLookupMediatorInputConnector2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DBLookupMediatorOutputConnector2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DBReportMediator2EditPart.VISUAL_ID:
			if (DBReportMediatorConnectionURL2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DBReportMediatorInputConnector2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DBReportMediatorOutputConnector2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SendMediator2EditPart.VISUAL_ID:
			if (SendMediatorInputConnector2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SendMediatorOutputConnector2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case HeaderMediator2EditPart.VISUAL_ID:
			if (HeaderMediatorValueLiteral2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (HeaderMediatorInputConnector2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (HeaderMediatorOutputConnector2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CloneMediator2EditPart.VISUAL_ID:
			if (CloneMediatorCloneID2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CloneMediatorInputConnector2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CloneMediatorOutputConnector2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CloneMediatorTargetOutputConnector2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IterateMediator2EditPart.VISUAL_ID:
			if (IterateMediatorIterateID2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IterateMediatorInputConnector2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IterateMediatorOutputConnector2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CalloutMediator2EditPart.VISUAL_ID:
			if (CalloutMediatorSoapAction2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CalloutMediatorInputConnector2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CalloutMediatorOutputConnector2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TransactionMediator2EditPart.VISUAL_ID:
			if (TransactionMediatorInputConnector2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TransactionMediatorOutputConnector2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RMSequenceMediator2EditPart.VISUAL_ID:
			if (RMSequenceMediatorInputConnector2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RMSequenceMediatorOutputConnector2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Sequence2EditPart.VISUAL_ID:
			if (SequenceInputConnector2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SequenceOutputConnector2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ProxyServiceOutSequenceEditPart.VISUAL_ID:
			if (ProxyServiceOutSequenceProxyServiceOutSequenceCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DropMediator4EditPart.VISUAL_ID:
			if (DropMediatorInputConnector3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PropertyMediator4EditPart.VISUAL_ID:
			if (PropertyMediatorPropertyName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PropertyMediatorInputConnector3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PropertyMediatorOutputConnector3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ThrottleMediator2EditPart.VISUAL_ID:
			if (ThrottleMediatorGroupId2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ThrottleMediatorInputConnector2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ThrottleMediatorOutputConnector2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FilterMediator3EditPart.VISUAL_ID:
			if (FilterMediatorConditionType3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FilterMediatorInputConnector3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FilterMediatorPassOutputConnector3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FilterMediatorFailOutputConnector3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LogMediator3EditPart.VISUAL_ID:
			if (LogMediatorLogCategory3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LogMediatorInputConnector3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LogMediatorOutputConnector3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EnrichMediator3EditPart.VISUAL_ID:
			if (EnrichMediatorSourceType3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EnrichMediatorInputConnector3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EnrichMediatorOutputConnector3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case XSLTMediator3EditPart.VISUAL_ID:
			if (XSLTMediatorInputConnector3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (XSLTMediatorOutputConnector3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SwitchMediator3EditPart.VISUAL_ID:
			if (SwitchMediatorInputConnector3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SwitchCaseBranchOutputConnector3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SwitchDefaultBranchOutputConnector3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Sequence3EditPart.VISUAL_ID:
			if (SequenceName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SequenceInputConnector3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SequenceOutputConnector3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EventMediator2EditPart.VISUAL_ID:
			if (EventMediatorTopicType2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EventMediatorInputConnector2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EventMediatorOutputConnector2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EntitlementMediator2EditPart.VISUAL_ID:
			if (EntitlementMediatorServerURL2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EntitlementMediatorInputConnector2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EntitlementMediatorOutputConnector2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ClassMediator2EditPart.VISUAL_ID:
			if (ClassMediatorClassName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ClassMediatorInputConnector2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ClassMediatorOutputConnector2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SpringMediator2EditPart.VISUAL_ID:
			if (SpringMediatorBeanName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SpringMediatorInputConnector2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SpringMediatorOutputConnector2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ScriptMediator2EditPart.VISUAL_ID:
			if (ScriptMediatorScriptLanguage2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ScriptMediatorInputConnector2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ScriptMediatorOutputConnector2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FaultMediator3EditPart.VISUAL_ID:
			if (FaultMediatorFaultStringType3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FaultMediatorInputConnector3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FaultMediatorOutputConnector3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case XQueryMediator2EditPart.VISUAL_ID:
			if (XQueryMediatorScriptKeyType2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (XQueryMediatorInputConnector2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (XQueryMediatorOutputConnector2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CommandMediator2EditPart.VISUAL_ID:
			if (CommandMediatorClassName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CommandMediatorInputConnector2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CommandMediatorOutputConnector2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DBLookupMediator3EditPart.VISUAL_ID:
			if (DBLookupMediatorConnectionURL3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DBLookupMediatorInputConnector3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DBLookupMediatorOutputConnector3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DBReportMediator3EditPart.VISUAL_ID:
			if (DBReportMediatorConnectionURL3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DBReportMediatorInputConnector3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DBReportMediatorOutputConnector3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SmooksMediator2EditPart.VISUAL_ID:
			if (SmooksMediatorInputConnector2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SmooksMediatorOutputConnector2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SendMediator3EditPart.VISUAL_ID:
			if (SendMediatorInputConnector3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SendMediatorOutputConnector3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case HeaderMediator3EditPart.VISUAL_ID:
			if (HeaderMediatorValueLiteral3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (HeaderMediatorInputConnector3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (HeaderMediatorOutputConnector3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CloneMediator3EditPart.VISUAL_ID:
			if (CloneMediatorCloneID3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CloneMediatorInputConnector3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CloneMediatorOutputConnector3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CloneMediatorTargetOutputConnector3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CacheMediator2EditPart.VISUAL_ID:
			if (CacheMediatorCacheId2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CacheMediatorInputConnector2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CacheMediatorOutputConnector2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IterateMediator3EditPart.VISUAL_ID:
			if (IterateMediatorIterateID3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IterateMediatorInputConnector3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IterateMediatorOutputConnector3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CalloutMediator3EditPart.VISUAL_ID:
			if (CalloutMediatorSoapAction3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CalloutMediatorInputConnector3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CalloutMediatorOutputConnector3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TransactionMediator3EditPart.VISUAL_ID:
			if (TransactionMediatorInputConnector3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TransactionMediatorOutputConnector3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RMSequenceMediator3EditPart.VISUAL_ID:
			if (RMSequenceMediatorInputConnector3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RMSequenceMediatorOutputConnector3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RuleMediator2EditPart.VISUAL_ID:
			if (RuleMediatorInputConnector2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RuleMediatorOutputConnector2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OAuthMediator2EditPart.VISUAL_ID:
			if (OAuthMediatorRemoteServiceUrl2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OAuthMediatorInputConnector2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OAuthMediatorOutputConnector2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AggregateMediator2EditPart.VISUAL_ID:
			if (AggregateMediatorAggregateID2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AggregateMediatorAggregateCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AggregateMediatorInputConnector2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AggregateMediatorOutputConnector2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AggregateMediatorOnCompleteOutputConnector2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LogMediator4EditPart.VISUAL_ID:
			if (LogMediatorLogCategory4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LogMediatorInputConnector4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LogMediatorOutputConnector4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DropMediator5EditPart.VISUAL_ID:
			if (DropMediatorInputConnector4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FilterMediator4EditPart.VISUAL_ID:
			if (FilterMediatorConditionType4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FilterMediatorInputConnector4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FilterMediatorPassOutputConnector4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FilterMediatorFailOutputConnector4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PropertyMediator5EditPart.VISUAL_ID:
			if (PropertyMediatorPropertyName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PropertyMediatorInputConnector4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PropertyMediatorOutputConnector4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EnrichMediator4EditPart.VISUAL_ID:
			if (EnrichMediatorSourceType4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EnrichMediatorInputConnector4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EnrichMediatorOutputConnector4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case XSLTMediator4EditPart.VISUAL_ID:
			if (XSLTMediatorInputConnector4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (XSLTMediatorOutputConnector4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SwitchMediator4EditPart.VISUAL_ID:
			if (SwitchMediatorInputConnector4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SwitchCaseBranchOutputConnector4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SwitchDefaultBranchOutputConnector4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FaultMediator4EditPart.VISUAL_ID:
			if (FaultMediatorFaultStringType4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FaultMediatorInputConnector4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FaultMediatorOutputConnector4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DBLookupMediator4EditPart.VISUAL_ID:
			if (DBLookupMediatorConnectionURL4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DBLookupMediatorInputConnector4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DBLookupMediatorOutputConnector4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DBReportMediator4EditPart.VISUAL_ID:
			if (DBReportMediatorConnectionURL4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DBReportMediatorInputConnector4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DBReportMediatorOutputConnector4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SendMediator4EditPart.VISUAL_ID:
			if (SendMediatorInputConnector4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SendMediatorOutputConnector4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case HeaderMediator4EditPart.VISUAL_ID:
			if (HeaderMediatorValueLiteral4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (HeaderMediatorInputConnector4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (HeaderMediatorOutputConnector4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CloneMediator4EditPart.VISUAL_ID:
			if (CloneMediatorCloneID4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CloneMediatorInputConnector4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CloneMediatorOutputConnector4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CloneMediatorTargetOutputConnector4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IterateMediator4EditPart.VISUAL_ID:
			if (IterateMediatorIterateID4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IterateMediatorInputConnector4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IterateMediatorOutputConnector4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CalloutMediator4EditPart.VISUAL_ID:
			if (CalloutMediatorSoapAction4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CalloutMediatorInputConnector4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CalloutMediatorOutputConnector4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TransactionMediator4EditPart.VISUAL_ID:
			if (TransactionMediatorInputConnector4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TransactionMediatorOutputConnector4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RMSequenceMediator4EditPart.VISUAL_ID:
			if (RMSequenceMediatorInputConnector4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RMSequenceMediatorOutputConnector4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Sequence4EditPart.VISUAL_ID:
			if (SequenceInputConnector4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SequenceOutputConnector4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ProxyServiceEndpointContainerEditPart.VISUAL_ID:
			if (ProxyServiceEndpointContainerEndpointCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DefaultEndPoint2EditPart.VISUAL_ID:
			if (DefaultEndPointEndPointName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DefaultEndPointInputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DefaultEndPointOutputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AddressEndPoint2EditPart.VISUAL_ID:
			if (AddressEndPointEndPointName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AddressEndPointInputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AddressEndPointOutputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FailoverEndPoint2EditPart.VISUAL_ID:
			if (FailoverEndPointEndPointName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FailoverEndPointInputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FailoverEndPointOutputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FailoverEndPointWestOutputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WSDLEndPoint2EditPart.VISUAL_ID:
			if (WSDLEndPointEndPointName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WSDLEndPointInputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WSDLEndPointOutputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LoadBalanceEndPoint2EditPart.VISUAL_ID:
			if (LoadBalanceEndPointEndPointName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LoadBalanceEndPointInputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LoadBalanceEndPointOutputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LoadBalanceEndPointWestOutputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ProxyServiceFaultContainerEditPart.VISUAL_ID:
			if (ProxyServiceFaultContainerProxyServiceFaultSequenceCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DropMediatorEditPart.VISUAL_ID:
			if (DropMediatorInputConnector5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PropertyMediatorEditPart.VISUAL_ID:
			if (PropertyMediatorPropertyNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PropertyMediatorInputConnector5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PropertyMediatorOutputConnector5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ThrottleMediator3EditPart.VISUAL_ID:
			if (ThrottleMediatorGroupId3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ThrottleMediatorInputConnector3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ThrottleMediatorOutputConnector3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FilterMediator5EditPart.VISUAL_ID:
			if (FilterMediatorConditionType5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FilterMediatorInputConnector5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FilterMediatorPassOutputConnector5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FilterMediatorFailOutputConnector5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LogMediator5EditPart.VISUAL_ID:
			if (LogMediatorLogCategory5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LogMediatorInputConnector5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LogMediatorOutputConnector5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EnrichMediator5EditPart.VISUAL_ID:
			if (EnrichMediatorSourceType5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EnrichMediatorInputConnector5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EnrichMediatorOutputConnector5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case XSLTMediator5EditPart.VISUAL_ID:
			if (XSLTMediatorInputConnector5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (XSLTMediatorOutputConnector5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SwitchMediator5EditPart.VISUAL_ID:
			if (SwitchMediatorInputConnector5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SwitchCaseBranchOutputConnector5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SwitchDefaultBranchOutputConnector5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Sequence5EditPart.VISUAL_ID:
			if (SequenceName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SequenceInputConnector5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SequenceOutputConnector5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EventMediator3EditPart.VISUAL_ID:
			if (EventMediatorTopicType3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EventMediatorInputConnector3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EventMediatorOutputConnector3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EntitlementMediator3EditPart.VISUAL_ID:
			if (EntitlementMediatorServerURL3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EntitlementMediatorInputConnector3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EntitlementMediatorOutputConnector3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ClassMediator3EditPart.VISUAL_ID:
			if (ClassMediatorClassName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ClassMediatorInputConnector3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ClassMediatorOutputConnector3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SpringMediator3EditPart.VISUAL_ID:
			if (SpringMediatorBeanName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SpringMediatorInputConnector3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SpringMediatorOutputConnector3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ScriptMediator3EditPart.VISUAL_ID:
			if (ScriptMediatorScriptLanguage3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ScriptMediatorInputConnector3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ScriptMediatorOutputConnector3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FaultMediator5EditPart.VISUAL_ID:
			if (FaultMediatorFaultStringType5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FaultMediatorInputConnector5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FaultMediatorOutputConnector5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case XQueryMediator3EditPart.VISUAL_ID:
			if (XQueryMediatorScriptKeyType3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (XQueryMediatorInputConnector3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (XQueryMediatorOutputConnector3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CommandMediator3EditPart.VISUAL_ID:
			if (CommandMediatorClassName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CommandMediatorInputConnector3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CommandMediatorOutputConnector3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DBLookupMediator5EditPart.VISUAL_ID:
			if (DBLookupMediatorConnectionURL5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DBLookupMediatorInputConnector5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DBLookupMediatorOutputConnector5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DBReportMediator5EditPart.VISUAL_ID:
			if (DBReportMediatorConnectionURL5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DBReportMediatorInputConnector5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DBReportMediatorOutputConnector5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SmooksMediator3EditPart.VISUAL_ID:
			if (SmooksMediatorInputConnector3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SmooksMediatorOutputConnector3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SendMediator5EditPart.VISUAL_ID:
			if (SendMediatorInputConnector5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SendMediatorOutputConnector5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case HeaderMediator5EditPart.VISUAL_ID:
			if (HeaderMediatorValueLiteral5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (HeaderMediatorInputConnector5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (HeaderMediatorOutputConnector5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CloneMediator5EditPart.VISUAL_ID:
			if (CloneMediatorCloneID5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CloneMediatorInputConnector5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CloneMediatorOutputConnector5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CloneMediatorTargetOutputConnector5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CacheMediator3EditPart.VISUAL_ID:
			if (CacheMediatorCacheId3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CacheMediatorInputConnector3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CacheMediatorOutputConnector3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IterateMediator5EditPart.VISUAL_ID:
			if (IterateMediatorIterateID5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IterateMediatorInputConnector5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IterateMediatorOutputConnector5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CalloutMediator5EditPart.VISUAL_ID:
			if (CalloutMediatorSoapAction5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CalloutMediatorInputConnector5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CalloutMediatorOutputConnector5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TransactionMediator5EditPart.VISUAL_ID:
			if (TransactionMediatorInputConnector5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TransactionMediatorOutputConnector5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RMSequenceMediator5EditPart.VISUAL_ID:
			if (RMSequenceMediatorInputConnector5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RMSequenceMediatorOutputConnector5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RuleMediator3EditPart.VISUAL_ID:
			if (RuleMediatorInputConnector3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RuleMediatorOutputConnector3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OAuthMediator3EditPart.VISUAL_ID:
			if (OAuthMediatorRemoteServiceUrl3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OAuthMediatorInputConnector3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OAuthMediatorOutputConnector3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MessageMediatorEditPart.VISUAL_ID:
			if (MessageInputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MessageOutputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MergeNodeEditPart.VISUAL_ID:
			if (MergeNodeFirstInputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MergeNodeSecondInputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MergeNodeOutputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EsbServerContentsCompartmentEditPart.VISUAL_ID:
			if (ProxyServiceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MergeNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ProxyServiceInSequenceProxyServiceInSequenceCompartmentEditPart.VISUAL_ID:
			if (DropMediator3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PropertyMediator3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ThrottleMediatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FilterMediatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LogMediatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EnrichMediatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (XSLTMediatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SwitchMediatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SequenceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EventMediatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EntitlementMediatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ClassMediatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SpringMediatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ScriptMediatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FaultMediatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (XQueryMediatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CommandMediatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DBLookupMediatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DBReportMediatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SmooksMediatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SendMediatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (HeaderMediatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CloneMediatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CacheMediatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IterateMediatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CalloutMediatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TransactionMediatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RMSequenceMediatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RuleMediatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OAuthMediatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AggregateMediatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AggregateMediatorAggregateCompartmentEditPart.VISUAL_ID:
			if (LogMediator2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DropMediator2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FilterMediator2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PropertyMediator2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EnrichMediator2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (XSLTMediator2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SwitchMediator2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FaultMediator2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DBLookupMediator2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DBReportMediator2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SendMediator2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (HeaderMediator2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CloneMediator2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IterateMediator2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CalloutMediator2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TransactionMediator2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RMSequenceMediator2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Sequence2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ProxyServiceOutSequenceProxyServiceOutSequenceCompartmentEditPart.VISUAL_ID:
			if (DropMediator4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PropertyMediator4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ThrottleMediator2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FilterMediator3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LogMediator3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EnrichMediator3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (XSLTMediator3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SwitchMediator3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Sequence3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EventMediator2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EntitlementMediator2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ClassMediator2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SpringMediator2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ScriptMediator2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FaultMediator3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (XQueryMediator2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CommandMediator2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DBLookupMediator3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DBReportMediator3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SmooksMediator2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SendMediator3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (HeaderMediator3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CloneMediator3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CacheMediator2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IterateMediator3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CalloutMediator3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TransactionMediator3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RMSequenceMediator3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RuleMediator2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OAuthMediator2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AggregateMediator2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AggregateMediatorAggregateCompartment2EditPart.VISUAL_ID:
			if (LogMediator4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DropMediator5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FilterMediator4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PropertyMediator5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EnrichMediator4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (XSLTMediator4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SwitchMediator4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FaultMediator4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DBLookupMediator4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DBReportMediator4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SendMediator4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (HeaderMediator4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CloneMediator4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IterateMediator4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CalloutMediator4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TransactionMediator4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RMSequenceMediator4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Sequence4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ProxyServiceEndpointContainerEndpointCompartmentEditPart.VISUAL_ID:
			if (DefaultEndPoint2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AddressEndPoint2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FailoverEndPoint2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WSDLEndPoint2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LoadBalanceEndPoint2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ProxyServiceFaultContainerProxyServiceFaultSequenceCompartmentEditPart.VISUAL_ID:
			if (DropMediatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PropertyMediatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ThrottleMediator3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FilterMediator5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LogMediator5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EnrichMediator5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (XSLTMediator5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SwitchMediator5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Sequence5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EventMediator3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EntitlementMediator3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ClassMediator3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SpringMediator3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ScriptMediator3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FaultMediator5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (XQueryMediator3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CommandMediator3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DBLookupMediator5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DBReportMediator5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SmooksMediator3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SendMediator5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (HeaderMediator5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CloneMediator5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CacheMediator3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IterateMediator5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CalloutMediator5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TransactionMediator5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RMSequenceMediator5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RuleMediator3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OAuthMediator3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (EsbPackage.eINSTANCE.getEsbLink().isSuperTypeOf(
				domainElement.eClass())) {
			return EsbLinkEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(EsbDiagram element) {
		return true;
	}

}
