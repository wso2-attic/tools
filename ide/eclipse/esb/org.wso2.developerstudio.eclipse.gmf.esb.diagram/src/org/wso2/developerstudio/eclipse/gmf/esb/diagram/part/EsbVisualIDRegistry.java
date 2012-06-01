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
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				EsbDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: " + type);
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
		if (EsbPackage.eINSTANCE.getEsbDiagram().isSuperTypeOf(domainElement.eClass())
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
			if (EsbPackage.eINSTANCE.getEsbServer().isSuperTypeOf(domainElement.eClass())) {
				return EsbServerEditPart.VISUAL_ID;
			}
			break;
		case EsbServerEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getMessageMediator().isSuperTypeOf(domainElement.eClass())) {
				return MessageMediatorEditPart.VISUAL_ID;
			}
			break;
		case ProxyServiceEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getProxyOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return ProxyOutputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getProxyInputConnector().isSuperTypeOf(domainElement.eClass())) {
				return ProxyInputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getProxyFaultInputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return ProxyFaultInputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getProxyServiceContainer().isSuperTypeOf(
					domainElement.eClass())) {
				return ProxyServiceContainerEditPart.VISUAL_ID;
			}
			break;
		case ProxyServiceContainerEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getProxyServiceSequenceAndEndpointContainer().isSuperTypeOf(
					domainElement.eClass())) {
				return ProxyServiceSequenceAndEndpointContainerEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getProxyServiceFaultContainer().isSuperTypeOf(
					domainElement.eClass())) {
				return ProxyServiceFaultContainerEditPart.VISUAL_ID;
			}
			break;
		case ProxyServiceSequenceAndEndpointContainerEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getProxyServiceSequenceContainer().isSuperTypeOf(
					domainElement.eClass())) {
				return ProxyServiceSequenceContainerEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getProxyServiceEndpointContainer().isSuperTypeOf(
					domainElement.eClass())) {
				return ProxyServiceEndpointContainerEditPart.VISUAL_ID;
			}
			break;
		case ProxyServiceSequenceContainerEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getProxyServiceInSequence().isSuperTypeOf(
					domainElement.eClass())) {
				return ProxyServiceInSequenceEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getProxyServiceOutSequence().isSuperTypeOf(
					domainElement.eClass())) {
				return ProxyServiceOutSequenceEditPart.VISUAL_ID;
			}
			break;
		case ProxyServiceInSequenceEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getMediatorFlow().isSuperTypeOf(domainElement.eClass())) {
				return MediatorFlowEditPart.VISUAL_ID;
			}
			break;
		case DropMediatorEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getDropMediatorInputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return DropMediatorInputConnectorEditPart.VISUAL_ID;
			}
			break;
		case PropertyMediatorEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getPropertyMediatorInputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return PropertyMediatorInputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getPropertyMediatorOutputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return PropertyMediatorOutputConnectorEditPart.VISUAL_ID;
			}
			break;
		case ThrottleMediatorEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getThrottleMediatorInputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return ThrottleMediatorInputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getThrottleMediatorOutputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return ThrottleMediatorOutputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getThrottleMediatorOnAcceptOutputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return ThrottleMediatorOnAcceptOutputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getThrottleMediatorOnRejectOutputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return ThrottleMediatorOnRejectOutputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getThrottleContainer().isSuperTypeOf(domainElement.eClass())) {
				return ThrottleContainerEditPart.VISUAL_ID;
			}
			break;
		case ThrottleContainerEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getThrottleOnAcceptContainer().isSuperTypeOf(
					domainElement.eClass())) {
				return ThrottleOnAcceptContainerEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getThrottleOnRejectContainer().isSuperTypeOf(
					domainElement.eClass())) {
				return ThrottleOnRejectContainerEditPart.VISUAL_ID;
			}
			break;
		case ThrottleOnAcceptContainerEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getMediatorFlow().isSuperTypeOf(domainElement.eClass())) {
				return MediatorFlow9EditPart.VISUAL_ID;
			}
			break;
		case FilterMediatorEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getFilterMediatorInputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return FilterMediatorInputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getFilterMediatorOutputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return FilterMediatorOutputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getFilterMediatorPassOutputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return FilterMediatorPassOutputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getFilterMediatorFailOutputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return FilterMediatorFailOutputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getFilterContainer().isSuperTypeOf(domainElement.eClass())) {
				return FilterContainerEditPart.VISUAL_ID;
			}
			break;
		case FilterContainerEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getFilterPassContainer().isSuperTypeOf(domainElement.eClass())) {
				return FilterPassContainerEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getFilterFailContainer().isSuperTypeOf(domainElement.eClass())) {
				return FilterFailContainerEditPart.VISUAL_ID;
			}
			break;
		case FilterPassContainerEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getMediatorFlow().isSuperTypeOf(domainElement.eClass())) {
				return MediatorFlow7EditPart.VISUAL_ID;
			}
			break;
		case LogMediatorEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getLogMediatorInputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return LogMediatorInputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getLogMediatorOutputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return LogMediatorOutputConnectorEditPart.VISUAL_ID;
			}
			break;
		case EnrichMediatorEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getEnrichMediatorInputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return EnrichMediatorInputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getEnrichMediatorOutputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return EnrichMediatorOutputConnectorEditPart.VISUAL_ID;
			}
			break;
		case XSLTMediatorEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getXSLTMediatorInputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return XSLTMediatorInputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getXSLTMediatorOutputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return XSLTMediatorOutputConnectorEditPart.VISUAL_ID;
			}
			break;
		case SwitchMediatorEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getSwitchMediatorInputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return SwitchMediatorInputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSwitchCaseBranchOutputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return SwitchCaseBranchOutputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSwitchDefaultBranchOutputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return SwitchDefaultBranchOutputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSwitchMediatorOutputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return SwitchMediatorOutputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSwitchMediatorContainer().isSuperTypeOf(
					domainElement.eClass())) {
				return SwitchMediatorContainerEditPart.VISUAL_ID;
			}
			break;
		case SwitchMediatorContainerEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getSwitchCaseContainer().isSuperTypeOf(domainElement.eClass())) {
				return SwitchCaseContainerEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSwitchDefaultContainer().isSuperTypeOf(
					domainElement.eClass())) {
				return SwitchDefaultContainerEditPart.VISUAL_ID;
			}
			break;
		case SwitchCaseContainerEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getMediatorFlow().isSuperTypeOf(domainElement.eClass())) {
				return MediatorFlow2EditPart.VISUAL_ID;
			}
			break;
		case SequenceEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getSequenceInputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return SequenceInputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSequenceOutputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return SequenceOutputConnectorEditPart.VISUAL_ID;
			}
			break;
		case EventMediatorEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getEventMediatorInputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return EventMediatorInputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getEventMediatorOutputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return EventMediatorOutputConnectorEditPart.VISUAL_ID;
			}
			break;
		case EntitlementMediatorEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getEntitlementMediatorInputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return EntitlementMediatorInputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getEntitlementMediatorOutputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return EntitlementMediatorOutputConnectorEditPart.VISUAL_ID;
			}
			break;
		case ClassMediatorEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getClassMediatorInputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return ClassMediatorInputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getClassMediatorOutputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return ClassMediatorOutputConnectorEditPart.VISUAL_ID;
			}
			break;
		case SpringMediatorEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getSpringMediatorInputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return SpringMediatorInputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSpringMediatorOutputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return SpringMediatorOutputConnectorEditPart.VISUAL_ID;
			}
			break;
		case ScriptMediatorEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getScriptMediatorInputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return ScriptMediatorInputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getScriptMediatorOutputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return ScriptMediatorOutputConnectorEditPart.VISUAL_ID;
			}
			break;
		case FaultMediatorEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getFaultMediatorInputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return FaultMediatorInputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getFaultMediatorOutputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return FaultMediatorOutputConnectorEditPart.VISUAL_ID;
			}
			break;
		case XQueryMediatorEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getXQueryMediatorInputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return XQueryMediatorInputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getXQueryMediatorOutputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return XQueryMediatorOutputConnectorEditPart.VISUAL_ID;
			}
			break;
		case CommandMediatorEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getCommandMediatorInputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return CommandMediatorInputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getCommandMediatorOutputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return CommandMediatorOutputConnectorEditPart.VISUAL_ID;
			}
			break;
		case DBLookupMediatorEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getDBLookupMediatorInputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return DBLookupMediatorInputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getDBLookupMediatorOutputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return DBLookupMediatorOutputConnectorEditPart.VISUAL_ID;
			}
			break;
		case DBReportMediatorEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getDBReportMediatorInputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return DBReportMediatorInputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getDBReportMediatorOutputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return DBReportMediatorOutputConnectorEditPart.VISUAL_ID;
			}
			break;
		case SmooksMediatorEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getSmooksMediatorInputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return SmooksMediatorInputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSmooksMediatorOutputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return SmooksMediatorOutputConnectorEditPart.VISUAL_ID;
			}
			break;
		case SendMediatorEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getSendMediatorInputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return SendMediatorInputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSendMediatorOutputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return SendMediatorOutputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSendMediatorEndpointOutputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return SendMediatorEndpointOutputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getEndpointFlow().isSuperTypeOf(domainElement.eClass())) {
				return EndpointFlowEditPart.VISUAL_ID;
			}
			break;
		case DefaultEndPointEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getDefaultEndPointInputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return DefaultEndPointInputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getDefaultEndPointOutputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return DefaultEndPointOutputConnectorEditPart.VISUAL_ID;
			}
			break;
		case AddressEndPointEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getAddressEndPointInputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return AddressEndPointInputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getAddressEndPointOutputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return AddressEndPointOutputConnectorEditPart.VISUAL_ID;
			}
			break;
		case FailoverEndPointEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getFailoverEndPointInputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return FailoverEndPointInputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getFailoverEndPointOutputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return FailoverEndPointOutputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getFailoverEndPointWestOutputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return FailoverEndPointWestOutputConnectorEditPart.VISUAL_ID;
			}
			break;
		case WSDLEndPointEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getWSDLEndPointInputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return WSDLEndPointInputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getWSDLEndPointOutputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return WSDLEndPointOutputConnectorEditPart.VISUAL_ID;
			}
			break;
		case LoadBalanceEndPointEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getLoadBalanceEndPointInputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return LoadBalanceEndPointInputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getLoadBalanceEndPointOutputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return LoadBalanceEndPointOutputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getLoadBalanceEndPointWestOutputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return LoadBalanceEndPointWestOutputConnectorEditPart.VISUAL_ID;
			}
			break;
		case HeaderMediatorEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getHeaderMediatorInputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return HeaderMediatorInputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getHeaderMediatorOutputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return HeaderMediatorOutputConnectorEditPart.VISUAL_ID;
			}
			break;
		case CloneMediatorEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getCloneMediatorInputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return CloneMediatorInputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getCloneMediatorOutputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return CloneMediatorOutputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getCloneMediatorTargetOutputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return CloneMediatorTargetOutputConnectorEditPart.VISUAL_ID;
			}
			break;
		case CacheMediatorEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getCacheMediatorInputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return CacheMediatorInputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getCacheMediatorOutputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return CacheMediatorOutputConnectorEditPart.VISUAL_ID;
			}
			break;
		case IterateMediatorEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getIterateMediatorInputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return IterateMediatorInputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getIterateMediatorOutputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return IterateMediatorOutputConnectorEditPart.VISUAL_ID;
			}
			break;
		case CalloutMediatorEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getCalloutMediatorInputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return CalloutMediatorInputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getCalloutMediatorOutputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return CalloutMediatorOutputConnectorEditPart.VISUAL_ID;
			}
			break;
		case TransactionMediatorEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getTransactionMediatorInputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return TransactionMediatorInputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getTransactionMediatorOutputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return TransactionMediatorOutputConnectorEditPart.VISUAL_ID;
			}
			break;
		case RMSequenceMediatorEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getRMSequenceMediatorInputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return RMSequenceMediatorInputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getRMSequenceMediatorOutputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return RMSequenceMediatorOutputConnectorEditPart.VISUAL_ID;
			}
			break;
		case RuleMediatorEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getRuleMediatorInputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return RuleMediatorInputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getRuleMediatorOutputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return RuleMediatorOutputConnectorEditPart.VISUAL_ID;
			}
			break;
		case OAuthMediatorEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getOAuthMediatorInputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return OAuthMediatorInputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getOAuthMediatorOutputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return OAuthMediatorOutputConnectorEditPart.VISUAL_ID;
			}
			break;
		case AggregateMediatorEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getAggregateMediatorInputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return AggregateMediatorInputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getAggregateMediatorOutputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return AggregateMediatorOutputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getAggregateMediatorOnCompleteOutputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return AggregateMediatorOnCompleteOutputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getMediatorFlow().isSuperTypeOf(domainElement.eClass())) {
				return MediatorFlow3EditPart.VISUAL_ID;
			}
			break;
		case StoreMediatorEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getStoreMediatorInputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return StoreMediatorInputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getStoreMediatorOutputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return StoreMediatorOutputConnectorEditPart.VISUAL_ID;
			}
			break;
		case BuilderMediatorEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getBuilderMediatorInputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return BuilderMediatorInputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getBuilderMediatorOutputConector().isSuperTypeOf(
					domainElement.eClass())) {
				return BuilderMediatorOutputConectorEditPart.VISUAL_ID;
			}
			break;
		case CallTemplateMediatorEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getCallTemplateMediatorInputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return CallTemplateMediatorInputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getCallTemplateMediatorOutputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return CallTemplateMediatorOutputConnectorEditPart.VISUAL_ID;
			}
			break;
		case PayloadFactoryMediatorEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getPayloadFactoryMediatorInputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return PayloadFactoryMediatorInputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getPayloadFactoryMediatorOutputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return PayloadFactoryMediatorOutputConnectorEditPart.VISUAL_ID;
			}
			break;
		case SwitchDefaultContainerEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getMediatorFlow().isSuperTypeOf(domainElement.eClass())) {
				return MediatorFlow4EditPart.VISUAL_ID;
			}
			break;
		case FilterFailContainerEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getMediatorFlow().isSuperTypeOf(domainElement.eClass())) {
				return MediatorFlow8EditPart.VISUAL_ID;
			}
			break;
		case ThrottleOnRejectContainerEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getMediatorFlow().isSuperTypeOf(domainElement.eClass())) {
				return MediatorFlow10EditPart.VISUAL_ID;
			}
			break;
		case ProxyServiceOutSequenceEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getMediatorFlow().isSuperTypeOf(domainElement.eClass())) {
				return MediatorFlow5EditPart.VISUAL_ID;
			}
			break;
		case ProxyServiceEndpointContainerEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getEndpointFlow().isSuperTypeOf(domainElement.eClass())) {
				return EndpointFlow2EditPart.VISUAL_ID;
			}
			break;
		case ProxyServiceFaultContainerEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getMediatorFlow().isSuperTypeOf(domainElement.eClass())) {
				return MediatorFlow6EditPart.VISUAL_ID;
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
			if (EsbPackage.eINSTANCE.getMergeNodeFirstInputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return MergeNodeFirstInputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getMergeNodeSecondInputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return MergeNodeSecondInputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getMergeNodeOutputConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return MergeNodeOutputConnectorEditPart.VISUAL_ID;
			}
			break;
		case EsbServerContentsCompartmentEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getProxyService().isSuperTypeOf(domainElement.eClass())) {
				return ProxyServiceEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getMergeNode().isSuperTypeOf(domainElement.eClass())) {
				return MergeNodeEditPart.VISUAL_ID;
			}
			break;
		case MediatorFlowMediatorFlowCompartmentEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getDropMediator().isSuperTypeOf(domainElement.eClass())) {
				return DropMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getPropertyMediator().isSuperTypeOf(domainElement.eClass())) {
				return PropertyMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getThrottleMediator().isSuperTypeOf(domainElement.eClass())) {
				return ThrottleMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getFilterMediator().isSuperTypeOf(domainElement.eClass())) {
				return FilterMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getLogMediator().isSuperTypeOf(domainElement.eClass())) {
				return LogMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getEnrichMediator().isSuperTypeOf(domainElement.eClass())) {
				return EnrichMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getXSLTMediator().isSuperTypeOf(domainElement.eClass())) {
				return XSLTMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSwitchMediator().isSuperTypeOf(domainElement.eClass())) {
				return SwitchMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSequence().isSuperTypeOf(domainElement.eClass())) {
				return SequenceEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getEventMediator().isSuperTypeOf(domainElement.eClass())) {
				return EventMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getEntitlementMediator().isSuperTypeOf(domainElement.eClass())) {
				return EntitlementMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getClassMediator().isSuperTypeOf(domainElement.eClass())) {
				return ClassMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSpringMediator().isSuperTypeOf(domainElement.eClass())) {
				return SpringMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getScriptMediator().isSuperTypeOf(domainElement.eClass())) {
				return ScriptMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getFaultMediator().isSuperTypeOf(domainElement.eClass())) {
				return FaultMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getXQueryMediator().isSuperTypeOf(domainElement.eClass())) {
				return XQueryMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getCommandMediator().isSuperTypeOf(domainElement.eClass())) {
				return CommandMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getDBLookupMediator().isSuperTypeOf(domainElement.eClass())) {
				return DBLookupMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getDBReportMediator().isSuperTypeOf(domainElement.eClass())) {
				return DBReportMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSmooksMediator().isSuperTypeOf(domainElement.eClass())) {
				return SmooksMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSendMediator().isSuperTypeOf(domainElement.eClass())) {
				return SendMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getHeaderMediator().isSuperTypeOf(domainElement.eClass())) {
				return HeaderMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getCloneMediator().isSuperTypeOf(domainElement.eClass())) {
				return CloneMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getCacheMediator().isSuperTypeOf(domainElement.eClass())) {
				return CacheMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getIterateMediator().isSuperTypeOf(domainElement.eClass())) {
				return IterateMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getCalloutMediator().isSuperTypeOf(domainElement.eClass())) {
				return CalloutMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getTransactionMediator().isSuperTypeOf(domainElement.eClass())) {
				return TransactionMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getRMSequenceMediator().isSuperTypeOf(domainElement.eClass())) {
				return RMSequenceMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getRuleMediator().isSuperTypeOf(domainElement.eClass())) {
				return RuleMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getOAuthMediator().isSuperTypeOf(domainElement.eClass())) {
				return OAuthMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getAggregateMediator().isSuperTypeOf(domainElement.eClass())) {
				return AggregateMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getStoreMediator().isSuperTypeOf(domainElement.eClass())) {
				return StoreMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getBuilderMediator().isSuperTypeOf(domainElement.eClass())) {
				return BuilderMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getCallTemplateMediator()
					.isSuperTypeOf(domainElement.eClass())) {
				return CallTemplateMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getPayloadFactoryMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return PayloadFactoryMediatorEditPart.VISUAL_ID;
			}
			break;
		case MediatorFlowMediatorFlowCompartment9EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getDropMediator().isSuperTypeOf(domainElement.eClass())) {
				return DropMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getPropertyMediator().isSuperTypeOf(domainElement.eClass())) {
				return PropertyMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getThrottleMediator().isSuperTypeOf(domainElement.eClass())) {
				return ThrottleMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getFilterMediator().isSuperTypeOf(domainElement.eClass())) {
				return FilterMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getLogMediator().isSuperTypeOf(domainElement.eClass())) {
				return LogMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getEnrichMediator().isSuperTypeOf(domainElement.eClass())) {
				return EnrichMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getXSLTMediator().isSuperTypeOf(domainElement.eClass())) {
				return XSLTMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSwitchMediator().isSuperTypeOf(domainElement.eClass())) {
				return SwitchMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSequence().isSuperTypeOf(domainElement.eClass())) {
				return SequenceEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getEventMediator().isSuperTypeOf(domainElement.eClass())) {
				return EventMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getEntitlementMediator().isSuperTypeOf(domainElement.eClass())) {
				return EntitlementMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getClassMediator().isSuperTypeOf(domainElement.eClass())) {
				return ClassMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSpringMediator().isSuperTypeOf(domainElement.eClass())) {
				return SpringMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getScriptMediator().isSuperTypeOf(domainElement.eClass())) {
				return ScriptMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getFaultMediator().isSuperTypeOf(domainElement.eClass())) {
				return FaultMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getXQueryMediator().isSuperTypeOf(domainElement.eClass())) {
				return XQueryMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getCommandMediator().isSuperTypeOf(domainElement.eClass())) {
				return CommandMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getDBLookupMediator().isSuperTypeOf(domainElement.eClass())) {
				return DBLookupMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getDBReportMediator().isSuperTypeOf(domainElement.eClass())) {
				return DBReportMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSmooksMediator().isSuperTypeOf(domainElement.eClass())) {
				return SmooksMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSendMediator().isSuperTypeOf(domainElement.eClass())) {
				return SendMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getHeaderMediator().isSuperTypeOf(domainElement.eClass())) {
				return HeaderMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getCloneMediator().isSuperTypeOf(domainElement.eClass())) {
				return CloneMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getCacheMediator().isSuperTypeOf(domainElement.eClass())) {
				return CacheMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getIterateMediator().isSuperTypeOf(domainElement.eClass())) {
				return IterateMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getCalloutMediator().isSuperTypeOf(domainElement.eClass())) {
				return CalloutMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getTransactionMediator().isSuperTypeOf(domainElement.eClass())) {
				return TransactionMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getRMSequenceMediator().isSuperTypeOf(domainElement.eClass())) {
				return RMSequenceMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getRuleMediator().isSuperTypeOf(domainElement.eClass())) {
				return RuleMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getOAuthMediator().isSuperTypeOf(domainElement.eClass())) {
				return OAuthMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getAggregateMediator().isSuperTypeOf(domainElement.eClass())) {
				return AggregateMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getStoreMediator().isSuperTypeOf(domainElement.eClass())) {
				return StoreMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getBuilderMediator().isSuperTypeOf(domainElement.eClass())) {
				return BuilderMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getCallTemplateMediator()
					.isSuperTypeOf(domainElement.eClass())) {
				return CallTemplateMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getPayloadFactoryMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return PayloadFactoryMediatorEditPart.VISUAL_ID;
			}
			break;
		case MediatorFlowMediatorFlowCompartment7EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getDropMediator().isSuperTypeOf(domainElement.eClass())) {
				return DropMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getPropertyMediator().isSuperTypeOf(domainElement.eClass())) {
				return PropertyMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getThrottleMediator().isSuperTypeOf(domainElement.eClass())) {
				return ThrottleMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getFilterMediator().isSuperTypeOf(domainElement.eClass())) {
				return FilterMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getLogMediator().isSuperTypeOf(domainElement.eClass())) {
				return LogMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getEnrichMediator().isSuperTypeOf(domainElement.eClass())) {
				return EnrichMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getXSLTMediator().isSuperTypeOf(domainElement.eClass())) {
				return XSLTMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSwitchMediator().isSuperTypeOf(domainElement.eClass())) {
				return SwitchMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSequence().isSuperTypeOf(domainElement.eClass())) {
				return SequenceEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getEventMediator().isSuperTypeOf(domainElement.eClass())) {
				return EventMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getEntitlementMediator().isSuperTypeOf(domainElement.eClass())) {
				return EntitlementMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getClassMediator().isSuperTypeOf(domainElement.eClass())) {
				return ClassMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSpringMediator().isSuperTypeOf(domainElement.eClass())) {
				return SpringMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getScriptMediator().isSuperTypeOf(domainElement.eClass())) {
				return ScriptMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getFaultMediator().isSuperTypeOf(domainElement.eClass())) {
				return FaultMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getXQueryMediator().isSuperTypeOf(domainElement.eClass())) {
				return XQueryMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getCommandMediator().isSuperTypeOf(domainElement.eClass())) {
				return CommandMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getDBLookupMediator().isSuperTypeOf(domainElement.eClass())) {
				return DBLookupMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getDBReportMediator().isSuperTypeOf(domainElement.eClass())) {
				return DBReportMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSmooksMediator().isSuperTypeOf(domainElement.eClass())) {
				return SmooksMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSendMediator().isSuperTypeOf(domainElement.eClass())) {
				return SendMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getHeaderMediator().isSuperTypeOf(domainElement.eClass())) {
				return HeaderMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getCloneMediator().isSuperTypeOf(domainElement.eClass())) {
				return CloneMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getCacheMediator().isSuperTypeOf(domainElement.eClass())) {
				return CacheMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getIterateMediator().isSuperTypeOf(domainElement.eClass())) {
				return IterateMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getCalloutMediator().isSuperTypeOf(domainElement.eClass())) {
				return CalloutMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getTransactionMediator().isSuperTypeOf(domainElement.eClass())) {
				return TransactionMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getRMSequenceMediator().isSuperTypeOf(domainElement.eClass())) {
				return RMSequenceMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getRuleMediator().isSuperTypeOf(domainElement.eClass())) {
				return RuleMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getOAuthMediator().isSuperTypeOf(domainElement.eClass())) {
				return OAuthMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getAggregateMediator().isSuperTypeOf(domainElement.eClass())) {
				return AggregateMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getStoreMediator().isSuperTypeOf(domainElement.eClass())) {
				return StoreMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getBuilderMediator().isSuperTypeOf(domainElement.eClass())) {
				return BuilderMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getCallTemplateMediator()
					.isSuperTypeOf(domainElement.eClass())) {
				return CallTemplateMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getPayloadFactoryMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return PayloadFactoryMediatorEditPart.VISUAL_ID;
			}
			break;
		case MediatorFlowMediatorFlowCompartment2EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getDropMediator().isSuperTypeOf(domainElement.eClass())) {
				return DropMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getPropertyMediator().isSuperTypeOf(domainElement.eClass())) {
				return PropertyMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getThrottleMediator().isSuperTypeOf(domainElement.eClass())) {
				return ThrottleMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getFilterMediator().isSuperTypeOf(domainElement.eClass())) {
				return FilterMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getLogMediator().isSuperTypeOf(domainElement.eClass())) {
				return LogMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getEnrichMediator().isSuperTypeOf(domainElement.eClass())) {
				return EnrichMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getXSLTMediator().isSuperTypeOf(domainElement.eClass())) {
				return XSLTMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSwitchMediator().isSuperTypeOf(domainElement.eClass())) {
				return SwitchMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSequence().isSuperTypeOf(domainElement.eClass())) {
				return SequenceEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getEventMediator().isSuperTypeOf(domainElement.eClass())) {
				return EventMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getEntitlementMediator().isSuperTypeOf(domainElement.eClass())) {
				return EntitlementMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getClassMediator().isSuperTypeOf(domainElement.eClass())) {
				return ClassMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSpringMediator().isSuperTypeOf(domainElement.eClass())) {
				return SpringMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getScriptMediator().isSuperTypeOf(domainElement.eClass())) {
				return ScriptMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getFaultMediator().isSuperTypeOf(domainElement.eClass())) {
				return FaultMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getXQueryMediator().isSuperTypeOf(domainElement.eClass())) {
				return XQueryMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getCommandMediator().isSuperTypeOf(domainElement.eClass())) {
				return CommandMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getDBLookupMediator().isSuperTypeOf(domainElement.eClass())) {
				return DBLookupMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getDBReportMediator().isSuperTypeOf(domainElement.eClass())) {
				return DBReportMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSmooksMediator().isSuperTypeOf(domainElement.eClass())) {
				return SmooksMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSendMediator().isSuperTypeOf(domainElement.eClass())) {
				return SendMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getHeaderMediator().isSuperTypeOf(domainElement.eClass())) {
				return HeaderMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getCloneMediator().isSuperTypeOf(domainElement.eClass())) {
				return CloneMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getCacheMediator().isSuperTypeOf(domainElement.eClass())) {
				return CacheMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getIterateMediator().isSuperTypeOf(domainElement.eClass())) {
				return IterateMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getCalloutMediator().isSuperTypeOf(domainElement.eClass())) {
				return CalloutMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getTransactionMediator().isSuperTypeOf(domainElement.eClass())) {
				return TransactionMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getRMSequenceMediator().isSuperTypeOf(domainElement.eClass())) {
				return RMSequenceMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getRuleMediator().isSuperTypeOf(domainElement.eClass())) {
				return RuleMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getOAuthMediator().isSuperTypeOf(domainElement.eClass())) {
				return OAuthMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getAggregateMediator().isSuperTypeOf(domainElement.eClass())) {
				return AggregateMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getStoreMediator().isSuperTypeOf(domainElement.eClass())) {
				return StoreMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getBuilderMediator().isSuperTypeOf(domainElement.eClass())) {
				return BuilderMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getCallTemplateMediator()
					.isSuperTypeOf(domainElement.eClass())) {
				return CallTemplateMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getPayloadFactoryMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return PayloadFactoryMediatorEditPart.VISUAL_ID;
			}
			break;
		case EndpointFlowEndpointCompartmentEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getDefaultEndPoint().isSuperTypeOf(domainElement.eClass())) {
				return DefaultEndPointEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getAddressEndPoint().isSuperTypeOf(domainElement.eClass())) {
				return AddressEndPointEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getFailoverEndPoint().isSuperTypeOf(domainElement.eClass())) {
				return FailoverEndPointEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getWSDLEndPoint().isSuperTypeOf(domainElement.eClass())) {
				return WSDLEndPointEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getLoadBalanceEndPoint().isSuperTypeOf(domainElement.eClass())) {
				return LoadBalanceEndPointEditPart.VISUAL_ID;
			}
			break;
		case MediatorFlowMediatorFlowCompartment3EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getDropMediator().isSuperTypeOf(domainElement.eClass())) {
				return DropMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getPropertyMediator().isSuperTypeOf(domainElement.eClass())) {
				return PropertyMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getThrottleMediator().isSuperTypeOf(domainElement.eClass())) {
				return ThrottleMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getFilterMediator().isSuperTypeOf(domainElement.eClass())) {
				return FilterMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getLogMediator().isSuperTypeOf(domainElement.eClass())) {
				return LogMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getEnrichMediator().isSuperTypeOf(domainElement.eClass())) {
				return EnrichMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getXSLTMediator().isSuperTypeOf(domainElement.eClass())) {
				return XSLTMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSwitchMediator().isSuperTypeOf(domainElement.eClass())) {
				return SwitchMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSequence().isSuperTypeOf(domainElement.eClass())) {
				return SequenceEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getEventMediator().isSuperTypeOf(domainElement.eClass())) {
				return EventMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getEntitlementMediator().isSuperTypeOf(domainElement.eClass())) {
				return EntitlementMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getClassMediator().isSuperTypeOf(domainElement.eClass())) {
				return ClassMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSpringMediator().isSuperTypeOf(domainElement.eClass())) {
				return SpringMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getScriptMediator().isSuperTypeOf(domainElement.eClass())) {
				return ScriptMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getFaultMediator().isSuperTypeOf(domainElement.eClass())) {
				return FaultMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getXQueryMediator().isSuperTypeOf(domainElement.eClass())) {
				return XQueryMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getCommandMediator().isSuperTypeOf(domainElement.eClass())) {
				return CommandMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getDBLookupMediator().isSuperTypeOf(domainElement.eClass())) {
				return DBLookupMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getDBReportMediator().isSuperTypeOf(domainElement.eClass())) {
				return DBReportMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSmooksMediator().isSuperTypeOf(domainElement.eClass())) {
				return SmooksMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSendMediator().isSuperTypeOf(domainElement.eClass())) {
				return SendMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getHeaderMediator().isSuperTypeOf(domainElement.eClass())) {
				return HeaderMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getCloneMediator().isSuperTypeOf(domainElement.eClass())) {
				return CloneMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getCacheMediator().isSuperTypeOf(domainElement.eClass())) {
				return CacheMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getIterateMediator().isSuperTypeOf(domainElement.eClass())) {
				return IterateMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getCalloutMediator().isSuperTypeOf(domainElement.eClass())) {
				return CalloutMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getTransactionMediator().isSuperTypeOf(domainElement.eClass())) {
				return TransactionMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getRMSequenceMediator().isSuperTypeOf(domainElement.eClass())) {
				return RMSequenceMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getRuleMediator().isSuperTypeOf(domainElement.eClass())) {
				return RuleMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getOAuthMediator().isSuperTypeOf(domainElement.eClass())) {
				return OAuthMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getAggregateMediator().isSuperTypeOf(domainElement.eClass())) {
				return AggregateMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getStoreMediator().isSuperTypeOf(domainElement.eClass())) {
				return StoreMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getBuilderMediator().isSuperTypeOf(domainElement.eClass())) {
				return BuilderMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getCallTemplateMediator()
					.isSuperTypeOf(domainElement.eClass())) {
				return CallTemplateMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getPayloadFactoryMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return PayloadFactoryMediatorEditPart.VISUAL_ID;
			}
			break;
		case MediatorFlowMediatorFlowCompartment4EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getDropMediator().isSuperTypeOf(domainElement.eClass())) {
				return DropMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getPropertyMediator().isSuperTypeOf(domainElement.eClass())) {
				return PropertyMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getThrottleMediator().isSuperTypeOf(domainElement.eClass())) {
				return ThrottleMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getFilterMediator().isSuperTypeOf(domainElement.eClass())) {
				return FilterMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getLogMediator().isSuperTypeOf(domainElement.eClass())) {
				return LogMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getEnrichMediator().isSuperTypeOf(domainElement.eClass())) {
				return EnrichMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getXSLTMediator().isSuperTypeOf(domainElement.eClass())) {
				return XSLTMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSwitchMediator().isSuperTypeOf(domainElement.eClass())) {
				return SwitchMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSequence().isSuperTypeOf(domainElement.eClass())) {
				return SequenceEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getEventMediator().isSuperTypeOf(domainElement.eClass())) {
				return EventMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getEntitlementMediator().isSuperTypeOf(domainElement.eClass())) {
				return EntitlementMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getClassMediator().isSuperTypeOf(domainElement.eClass())) {
				return ClassMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSpringMediator().isSuperTypeOf(domainElement.eClass())) {
				return SpringMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getScriptMediator().isSuperTypeOf(domainElement.eClass())) {
				return ScriptMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getFaultMediator().isSuperTypeOf(domainElement.eClass())) {
				return FaultMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getXQueryMediator().isSuperTypeOf(domainElement.eClass())) {
				return XQueryMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getCommandMediator().isSuperTypeOf(domainElement.eClass())) {
				return CommandMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getDBLookupMediator().isSuperTypeOf(domainElement.eClass())) {
				return DBLookupMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getDBReportMediator().isSuperTypeOf(domainElement.eClass())) {
				return DBReportMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSmooksMediator().isSuperTypeOf(domainElement.eClass())) {
				return SmooksMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSendMediator().isSuperTypeOf(domainElement.eClass())) {
				return SendMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getHeaderMediator().isSuperTypeOf(domainElement.eClass())) {
				return HeaderMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getCloneMediator().isSuperTypeOf(domainElement.eClass())) {
				return CloneMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getCacheMediator().isSuperTypeOf(domainElement.eClass())) {
				return CacheMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getIterateMediator().isSuperTypeOf(domainElement.eClass())) {
				return IterateMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getCalloutMediator().isSuperTypeOf(domainElement.eClass())) {
				return CalloutMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getTransactionMediator().isSuperTypeOf(domainElement.eClass())) {
				return TransactionMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getRMSequenceMediator().isSuperTypeOf(domainElement.eClass())) {
				return RMSequenceMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getRuleMediator().isSuperTypeOf(domainElement.eClass())) {
				return RuleMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getOAuthMediator().isSuperTypeOf(domainElement.eClass())) {
				return OAuthMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getAggregateMediator().isSuperTypeOf(domainElement.eClass())) {
				return AggregateMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getStoreMediator().isSuperTypeOf(domainElement.eClass())) {
				return StoreMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getBuilderMediator().isSuperTypeOf(domainElement.eClass())) {
				return BuilderMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getCallTemplateMediator()
					.isSuperTypeOf(domainElement.eClass())) {
				return CallTemplateMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getPayloadFactoryMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return PayloadFactoryMediatorEditPart.VISUAL_ID;
			}
			break;
		case MediatorFlowMediatorFlowCompartment8EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getDropMediator().isSuperTypeOf(domainElement.eClass())) {
				return DropMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getPropertyMediator().isSuperTypeOf(domainElement.eClass())) {
				return PropertyMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getThrottleMediator().isSuperTypeOf(domainElement.eClass())) {
				return ThrottleMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getFilterMediator().isSuperTypeOf(domainElement.eClass())) {
				return FilterMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getLogMediator().isSuperTypeOf(domainElement.eClass())) {
				return LogMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getEnrichMediator().isSuperTypeOf(domainElement.eClass())) {
				return EnrichMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getXSLTMediator().isSuperTypeOf(domainElement.eClass())) {
				return XSLTMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSwitchMediator().isSuperTypeOf(domainElement.eClass())) {
				return SwitchMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSequence().isSuperTypeOf(domainElement.eClass())) {
				return SequenceEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getEventMediator().isSuperTypeOf(domainElement.eClass())) {
				return EventMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getEntitlementMediator().isSuperTypeOf(domainElement.eClass())) {
				return EntitlementMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getClassMediator().isSuperTypeOf(domainElement.eClass())) {
				return ClassMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSpringMediator().isSuperTypeOf(domainElement.eClass())) {
				return SpringMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getScriptMediator().isSuperTypeOf(domainElement.eClass())) {
				return ScriptMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getFaultMediator().isSuperTypeOf(domainElement.eClass())) {
				return FaultMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getXQueryMediator().isSuperTypeOf(domainElement.eClass())) {
				return XQueryMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getCommandMediator().isSuperTypeOf(domainElement.eClass())) {
				return CommandMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getDBLookupMediator().isSuperTypeOf(domainElement.eClass())) {
				return DBLookupMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getDBReportMediator().isSuperTypeOf(domainElement.eClass())) {
				return DBReportMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSmooksMediator().isSuperTypeOf(domainElement.eClass())) {
				return SmooksMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSendMediator().isSuperTypeOf(domainElement.eClass())) {
				return SendMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getHeaderMediator().isSuperTypeOf(domainElement.eClass())) {
				return HeaderMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getCloneMediator().isSuperTypeOf(domainElement.eClass())) {
				return CloneMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getCacheMediator().isSuperTypeOf(domainElement.eClass())) {
				return CacheMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getIterateMediator().isSuperTypeOf(domainElement.eClass())) {
				return IterateMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getCalloutMediator().isSuperTypeOf(domainElement.eClass())) {
				return CalloutMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getTransactionMediator().isSuperTypeOf(domainElement.eClass())) {
				return TransactionMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getRMSequenceMediator().isSuperTypeOf(domainElement.eClass())) {
				return RMSequenceMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getRuleMediator().isSuperTypeOf(domainElement.eClass())) {
				return RuleMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getOAuthMediator().isSuperTypeOf(domainElement.eClass())) {
				return OAuthMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getAggregateMediator().isSuperTypeOf(domainElement.eClass())) {
				return AggregateMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getStoreMediator().isSuperTypeOf(domainElement.eClass())) {
				return StoreMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getBuilderMediator().isSuperTypeOf(domainElement.eClass())) {
				return BuilderMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getCallTemplateMediator()
					.isSuperTypeOf(domainElement.eClass())) {
				return CallTemplateMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getPayloadFactoryMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return PayloadFactoryMediatorEditPart.VISUAL_ID;
			}
			break;
		case MediatorFlowMediatorFlowCompartment10EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getDropMediator().isSuperTypeOf(domainElement.eClass())) {
				return DropMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getPropertyMediator().isSuperTypeOf(domainElement.eClass())) {
				return PropertyMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getThrottleMediator().isSuperTypeOf(domainElement.eClass())) {
				return ThrottleMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getFilterMediator().isSuperTypeOf(domainElement.eClass())) {
				return FilterMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getLogMediator().isSuperTypeOf(domainElement.eClass())) {
				return LogMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getEnrichMediator().isSuperTypeOf(domainElement.eClass())) {
				return EnrichMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getXSLTMediator().isSuperTypeOf(domainElement.eClass())) {
				return XSLTMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSwitchMediator().isSuperTypeOf(domainElement.eClass())) {
				return SwitchMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSequence().isSuperTypeOf(domainElement.eClass())) {
				return SequenceEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getEventMediator().isSuperTypeOf(domainElement.eClass())) {
				return EventMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getEntitlementMediator().isSuperTypeOf(domainElement.eClass())) {
				return EntitlementMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getClassMediator().isSuperTypeOf(domainElement.eClass())) {
				return ClassMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSpringMediator().isSuperTypeOf(domainElement.eClass())) {
				return SpringMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getScriptMediator().isSuperTypeOf(domainElement.eClass())) {
				return ScriptMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getFaultMediator().isSuperTypeOf(domainElement.eClass())) {
				return FaultMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getXQueryMediator().isSuperTypeOf(domainElement.eClass())) {
				return XQueryMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getCommandMediator().isSuperTypeOf(domainElement.eClass())) {
				return CommandMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getDBLookupMediator().isSuperTypeOf(domainElement.eClass())) {
				return DBLookupMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getDBReportMediator().isSuperTypeOf(domainElement.eClass())) {
				return DBReportMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSmooksMediator().isSuperTypeOf(domainElement.eClass())) {
				return SmooksMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSendMediator().isSuperTypeOf(domainElement.eClass())) {
				return SendMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getHeaderMediator().isSuperTypeOf(domainElement.eClass())) {
				return HeaderMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getCloneMediator().isSuperTypeOf(domainElement.eClass())) {
				return CloneMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getCacheMediator().isSuperTypeOf(domainElement.eClass())) {
				return CacheMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getIterateMediator().isSuperTypeOf(domainElement.eClass())) {
				return IterateMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getCalloutMediator().isSuperTypeOf(domainElement.eClass())) {
				return CalloutMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getTransactionMediator().isSuperTypeOf(domainElement.eClass())) {
				return TransactionMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getRMSequenceMediator().isSuperTypeOf(domainElement.eClass())) {
				return RMSequenceMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getRuleMediator().isSuperTypeOf(domainElement.eClass())) {
				return RuleMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getOAuthMediator().isSuperTypeOf(domainElement.eClass())) {
				return OAuthMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getAggregateMediator().isSuperTypeOf(domainElement.eClass())) {
				return AggregateMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getStoreMediator().isSuperTypeOf(domainElement.eClass())) {
				return StoreMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getBuilderMediator().isSuperTypeOf(domainElement.eClass())) {
				return BuilderMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getCallTemplateMediator()
					.isSuperTypeOf(domainElement.eClass())) {
				return CallTemplateMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getPayloadFactoryMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return PayloadFactoryMediatorEditPart.VISUAL_ID;
			}
			break;
		case MediatorFlowMediatorFlowCompartment5EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getDropMediator().isSuperTypeOf(domainElement.eClass())) {
				return DropMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getPropertyMediator().isSuperTypeOf(domainElement.eClass())) {
				return PropertyMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getThrottleMediator().isSuperTypeOf(domainElement.eClass())) {
				return ThrottleMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getFilterMediator().isSuperTypeOf(domainElement.eClass())) {
				return FilterMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getLogMediator().isSuperTypeOf(domainElement.eClass())) {
				return LogMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getEnrichMediator().isSuperTypeOf(domainElement.eClass())) {
				return EnrichMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getXSLTMediator().isSuperTypeOf(domainElement.eClass())) {
				return XSLTMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSwitchMediator().isSuperTypeOf(domainElement.eClass())) {
				return SwitchMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSequence().isSuperTypeOf(domainElement.eClass())) {
				return SequenceEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getEventMediator().isSuperTypeOf(domainElement.eClass())) {
				return EventMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getEntitlementMediator().isSuperTypeOf(domainElement.eClass())) {
				return EntitlementMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getClassMediator().isSuperTypeOf(domainElement.eClass())) {
				return ClassMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSpringMediator().isSuperTypeOf(domainElement.eClass())) {
				return SpringMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getScriptMediator().isSuperTypeOf(domainElement.eClass())) {
				return ScriptMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getFaultMediator().isSuperTypeOf(domainElement.eClass())) {
				return FaultMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getXQueryMediator().isSuperTypeOf(domainElement.eClass())) {
				return XQueryMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getCommandMediator().isSuperTypeOf(domainElement.eClass())) {
				return CommandMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getDBLookupMediator().isSuperTypeOf(domainElement.eClass())) {
				return DBLookupMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getDBReportMediator().isSuperTypeOf(domainElement.eClass())) {
				return DBReportMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSmooksMediator().isSuperTypeOf(domainElement.eClass())) {
				return SmooksMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSendMediator().isSuperTypeOf(domainElement.eClass())) {
				return SendMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getHeaderMediator().isSuperTypeOf(domainElement.eClass())) {
				return HeaderMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getCloneMediator().isSuperTypeOf(domainElement.eClass())) {
				return CloneMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getCacheMediator().isSuperTypeOf(domainElement.eClass())) {
				return CacheMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getIterateMediator().isSuperTypeOf(domainElement.eClass())) {
				return IterateMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getCalloutMediator().isSuperTypeOf(domainElement.eClass())) {
				return CalloutMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getTransactionMediator().isSuperTypeOf(domainElement.eClass())) {
				return TransactionMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getRMSequenceMediator().isSuperTypeOf(domainElement.eClass())) {
				return RMSequenceMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getRuleMediator().isSuperTypeOf(domainElement.eClass())) {
				return RuleMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getOAuthMediator().isSuperTypeOf(domainElement.eClass())) {
				return OAuthMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getAggregateMediator().isSuperTypeOf(domainElement.eClass())) {
				return AggregateMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getStoreMediator().isSuperTypeOf(domainElement.eClass())) {
				return StoreMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getBuilderMediator().isSuperTypeOf(domainElement.eClass())) {
				return BuilderMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getCallTemplateMediator()
					.isSuperTypeOf(domainElement.eClass())) {
				return CallTemplateMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getPayloadFactoryMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return PayloadFactoryMediatorEditPart.VISUAL_ID;
			}
			break;
		case EndpointFlowEndpointCompartment2EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getDefaultEndPoint().isSuperTypeOf(domainElement.eClass())) {
				return DefaultEndPointEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getAddressEndPoint().isSuperTypeOf(domainElement.eClass())) {
				return AddressEndPointEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getFailoverEndPoint().isSuperTypeOf(domainElement.eClass())) {
				return FailoverEndPointEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getWSDLEndPoint().isSuperTypeOf(domainElement.eClass())) {
				return WSDLEndPointEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getLoadBalanceEndPoint().isSuperTypeOf(domainElement.eClass())) {
				return LoadBalanceEndPointEditPart.VISUAL_ID;
			}
			break;
		case MediatorFlowMediatorFlowCompartment6EditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getDropMediator().isSuperTypeOf(domainElement.eClass())) {
				return DropMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getPropertyMediator().isSuperTypeOf(domainElement.eClass())) {
				return PropertyMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getThrottleMediator().isSuperTypeOf(domainElement.eClass())) {
				return ThrottleMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getFilterMediator().isSuperTypeOf(domainElement.eClass())) {
				return FilterMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getLogMediator().isSuperTypeOf(domainElement.eClass())) {
				return LogMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getEnrichMediator().isSuperTypeOf(domainElement.eClass())) {
				return EnrichMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getXSLTMediator().isSuperTypeOf(domainElement.eClass())) {
				return XSLTMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSwitchMediator().isSuperTypeOf(domainElement.eClass())) {
				return SwitchMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSequence().isSuperTypeOf(domainElement.eClass())) {
				return SequenceEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getEventMediator().isSuperTypeOf(domainElement.eClass())) {
				return EventMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getEntitlementMediator().isSuperTypeOf(domainElement.eClass())) {
				return EntitlementMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getClassMediator().isSuperTypeOf(domainElement.eClass())) {
				return ClassMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSpringMediator().isSuperTypeOf(domainElement.eClass())) {
				return SpringMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getScriptMediator().isSuperTypeOf(domainElement.eClass())) {
				return ScriptMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getFaultMediator().isSuperTypeOf(domainElement.eClass())) {
				return FaultMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getXQueryMediator().isSuperTypeOf(domainElement.eClass())) {
				return XQueryMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getCommandMediator().isSuperTypeOf(domainElement.eClass())) {
				return CommandMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getDBLookupMediator().isSuperTypeOf(domainElement.eClass())) {
				return DBLookupMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getDBReportMediator().isSuperTypeOf(domainElement.eClass())) {
				return DBReportMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSmooksMediator().isSuperTypeOf(domainElement.eClass())) {
				return SmooksMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSendMediator().isSuperTypeOf(domainElement.eClass())) {
				return SendMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getHeaderMediator().isSuperTypeOf(domainElement.eClass())) {
				return HeaderMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getCloneMediator().isSuperTypeOf(domainElement.eClass())) {
				return CloneMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getCacheMediator().isSuperTypeOf(domainElement.eClass())) {
				return CacheMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getIterateMediator().isSuperTypeOf(domainElement.eClass())) {
				return IterateMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getCalloutMediator().isSuperTypeOf(domainElement.eClass())) {
				return CalloutMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getTransactionMediator().isSuperTypeOf(domainElement.eClass())) {
				return TransactionMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getRMSequenceMediator().isSuperTypeOf(domainElement.eClass())) {
				return RMSequenceMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getRuleMediator().isSuperTypeOf(domainElement.eClass())) {
				return RuleMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getOAuthMediator().isSuperTypeOf(domainElement.eClass())) {
				return OAuthMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getAggregateMediator().isSuperTypeOf(domainElement.eClass())) {
				return AggregateMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getStoreMediator().isSuperTypeOf(domainElement.eClass())) {
				return StoreMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getBuilderMediator().isSuperTypeOf(domainElement.eClass())) {
				return BuilderMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getCallTemplateMediator()
					.isSuperTypeOf(domainElement.eClass())) {
				return CallTemplateMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getPayloadFactoryMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return PayloadFactoryMediatorEditPart.VISUAL_ID;
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
			if (MediatorFlowEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MediatorFlowEditPart.VISUAL_ID:
			if (MediatorFlowMediatorFlowCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DropMediatorEditPart.VISUAL_ID:
			if (DropMediatorInputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PropertyMediatorEditPart.VISUAL_ID:
			if (PropertyMediatorPropertyNameEditPart.VISUAL_ID == nodeVisualID) {
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
			if (ThrottleMediatorOnAcceptOutputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ThrottleMediatorOnRejectOutputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ThrottleContainerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ThrottleContainerEditPart.VISUAL_ID:
			if (ThrottleOnAcceptContainerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ThrottleOnRejectContainerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ThrottleOnAcceptContainerEditPart.VISUAL_ID:
			if (MediatorFlow9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MediatorFlow9EditPart.VISUAL_ID:
			if (MediatorFlowMediatorFlowCompartment9EditPart.VISUAL_ID == nodeVisualID) {
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
			if (FilterMediatorOutputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FilterMediatorPassOutputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FilterMediatorFailOutputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FilterContainerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FilterContainerEditPart.VISUAL_ID:
			if (FilterPassContainerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FilterFailContainerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FilterPassContainerEditPart.VISUAL_ID:
			if (MediatorFlow7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MediatorFlow7EditPart.VISUAL_ID:
			if (MediatorFlowMediatorFlowCompartment7EditPart.VISUAL_ID == nodeVisualID) {
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
			if (SwitchMediatorOutputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SwitchMediatorContainerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SwitchMediatorContainerEditPart.VISUAL_ID:
			if (SwitchCaseContainerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SwitchDefaultContainerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SwitchCaseContainerEditPart.VISUAL_ID:
			if (MediatorFlow2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MediatorFlow2EditPart.VISUAL_ID:
			if (MediatorFlowMediatorFlowCompartment2EditPart.VISUAL_ID == nodeVisualID) {
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
			if (SendMediatorEndpointOutputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EndpointFlowEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EndpointFlowEditPart.VISUAL_ID:
			if (EndpointFlowEndpointCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DefaultEndPointEditPart.VISUAL_ID:
			if (DefaultEndPointEndPointNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DefaultEndPointInputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DefaultEndPointOutputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AddressEndPointEditPart.VISUAL_ID:
			if (AddressEndPointEndPointNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AddressEndPointInputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AddressEndPointOutputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FailoverEndPointEditPart.VISUAL_ID:
			if (FailoverEndPointEndPointNameEditPart.VISUAL_ID == nodeVisualID) {
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
		case WSDLEndPointEditPart.VISUAL_ID:
			if (WSDLEndPointEndPointNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WSDLEndPointInputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WSDLEndPointOutputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LoadBalanceEndPointEditPart.VISUAL_ID:
			if (LoadBalanceEndPointEndPointNameEditPart.VISUAL_ID == nodeVisualID) {
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
			if (AggregateMediatorInputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AggregateMediatorOutputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AggregateMediatorOnCompleteOutputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MediatorFlow3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MediatorFlow3EditPart.VISUAL_ID:
			if (MediatorFlowMediatorFlowCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StoreMediatorEditPart.VISUAL_ID:
			if (StoreMediatorInputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StoreMediatorOutputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BuilderMediatorEditPart.VISUAL_ID:
			if (BuilderMediatorInputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BuilderMediatorOutputConectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CallTemplateMediatorEditPart.VISUAL_ID:
			if (CallTemplateMediatorInputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallTemplateMediatorOutputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PayloadFactoryMediatorEditPart.VISUAL_ID:
			if (PayloadFactoryMediatorInputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PayloadFactoryMediatorOutputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SwitchDefaultContainerEditPart.VISUAL_ID:
			if (MediatorFlow4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MediatorFlow4EditPart.VISUAL_ID:
			if (MediatorFlowMediatorFlowCompartment4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FilterFailContainerEditPart.VISUAL_ID:
			if (MediatorFlow8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MediatorFlow8EditPart.VISUAL_ID:
			if (MediatorFlowMediatorFlowCompartment8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ThrottleOnRejectContainerEditPart.VISUAL_ID:
			if (MediatorFlow10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MediatorFlow10EditPart.VISUAL_ID:
			if (MediatorFlowMediatorFlowCompartment10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ProxyServiceOutSequenceEditPart.VISUAL_ID:
			if (MediatorFlow5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MediatorFlow5EditPart.VISUAL_ID:
			if (MediatorFlowMediatorFlowCompartment5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ProxyServiceEndpointContainerEditPart.VISUAL_ID:
			if (EndpointFlow2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EndpointFlow2EditPart.VISUAL_ID:
			if (EndpointFlowEndpointCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ProxyServiceFaultContainerEditPart.VISUAL_ID:
			if (MediatorFlow6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MediatorFlow6EditPart.VISUAL_ID:
			if (MediatorFlowMediatorFlowCompartment6EditPart.VISUAL_ID == nodeVisualID) {
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
		case MediatorFlowMediatorFlowCompartmentEditPart.VISUAL_ID:
			if (DropMediatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PropertyMediatorEditPart.VISUAL_ID == nodeVisualID) {
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
			if (StoreMediatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BuilderMediatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallTemplateMediatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PayloadFactoryMediatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MediatorFlowMediatorFlowCompartment9EditPart.VISUAL_ID:
			if (DropMediatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PropertyMediatorEditPart.VISUAL_ID == nodeVisualID) {
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
			if (StoreMediatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BuilderMediatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallTemplateMediatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PayloadFactoryMediatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MediatorFlowMediatorFlowCompartment7EditPart.VISUAL_ID:
			if (DropMediatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PropertyMediatorEditPart.VISUAL_ID == nodeVisualID) {
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
			if (StoreMediatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BuilderMediatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallTemplateMediatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PayloadFactoryMediatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MediatorFlowMediatorFlowCompartment2EditPart.VISUAL_ID:
			if (DropMediatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PropertyMediatorEditPart.VISUAL_ID == nodeVisualID) {
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
			if (StoreMediatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BuilderMediatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallTemplateMediatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PayloadFactoryMediatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EndpointFlowEndpointCompartmentEditPart.VISUAL_ID:
			if (DefaultEndPointEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AddressEndPointEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FailoverEndPointEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WSDLEndPointEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LoadBalanceEndPointEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MediatorFlowMediatorFlowCompartment3EditPart.VISUAL_ID:
			if (DropMediatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PropertyMediatorEditPart.VISUAL_ID == nodeVisualID) {
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
			if (StoreMediatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BuilderMediatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallTemplateMediatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PayloadFactoryMediatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MediatorFlowMediatorFlowCompartment4EditPart.VISUAL_ID:
			if (DropMediatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PropertyMediatorEditPart.VISUAL_ID == nodeVisualID) {
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
			if (StoreMediatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BuilderMediatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallTemplateMediatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PayloadFactoryMediatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MediatorFlowMediatorFlowCompartment8EditPart.VISUAL_ID:
			if (DropMediatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PropertyMediatorEditPart.VISUAL_ID == nodeVisualID) {
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
			if (StoreMediatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BuilderMediatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallTemplateMediatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PayloadFactoryMediatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MediatorFlowMediatorFlowCompartment10EditPart.VISUAL_ID:
			if (DropMediatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PropertyMediatorEditPart.VISUAL_ID == nodeVisualID) {
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
			if (StoreMediatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BuilderMediatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallTemplateMediatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PayloadFactoryMediatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MediatorFlowMediatorFlowCompartment5EditPart.VISUAL_ID:
			if (DropMediatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PropertyMediatorEditPart.VISUAL_ID == nodeVisualID) {
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
			if (StoreMediatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BuilderMediatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallTemplateMediatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PayloadFactoryMediatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EndpointFlowEndpointCompartment2EditPart.VISUAL_ID:
			if (DefaultEndPointEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AddressEndPointEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FailoverEndPointEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WSDLEndPointEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LoadBalanceEndPointEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MediatorFlowMediatorFlowCompartment6EditPart.VISUAL_ID:
			if (DropMediatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PropertyMediatorEditPart.VISUAL_ID == nodeVisualID) {
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
			if (StoreMediatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BuilderMediatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallTemplateMediatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PayloadFactoryMediatorEditPart.VISUAL_ID == nodeVisualID) {
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
		if (EsbPackage.eINSTANCE.getEsbLink().isSuperTypeOf(domainElement.eClass())) {
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
