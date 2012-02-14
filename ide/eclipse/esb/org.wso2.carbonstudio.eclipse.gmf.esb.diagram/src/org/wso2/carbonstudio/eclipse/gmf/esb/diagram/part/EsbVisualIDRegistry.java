package org.wso2.carbonstudio.eclipse.gmf.esb.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.wso2.carbonstudio.eclipse.gmf.esb.EsbDiagram;
import org.wso2.carbonstudio.eclipse.gmf.esb.EsbPackage;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.*;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.AddressEndPointEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.AddressEndPointEndPointNameEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.AddressEndPointInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.AddressEndPointOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.ClassMediatorClassNameEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.ClassMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.ClassMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.ClassMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.CommandMediatorClassNameEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.CommandMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.CommandMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.CommandMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.DBLookupMediatorConnectionURLEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.DBLookupMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.DBLookupMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.DBLookupMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.DBReportMediatorConnectionURLEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.DBReportMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.DBReportMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.DBReportMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.DefaultEndPointEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.DefaultEndPointEndPointNameEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.DefaultEndPointInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.DefaultEndPointOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.DropMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.DropMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.EnrichMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.EnrichMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.EnrichMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.EnrichMediatorSourceTypeEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.EntitlementMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.EntitlementMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.EntitlementMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.EntitlementMediatorServerURLEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.EsbDiagramEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.EsbLinkEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.EsbServerContentsCompartmentEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.EsbServerEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.EventMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.EventMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.EventMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.EventMediatorTopicTypeEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.FaultMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.FaultMediatorFaultStringTypeEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.FaultMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.FaultMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.FilterMediatorConditionTypeEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.FilterMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.FilterMediatorFailOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.FilterMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.FilterMediatorPassOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.LogMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.LogMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.LogMediatorLogCategoryEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.LogMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.MergeNodeEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.MergeNodeFirstInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.MergeNodeOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.MergeNodeSecondInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.MessageInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.MessageMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.MessageOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.PropertyMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.PropertyMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.PropertyMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.PropertyMediatorPropertyNameEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.ProxyInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.ProxyOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.ProxyServiceEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.ProxyServiceNameEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.ScriptMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.ScriptMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.ScriptMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.ScriptMediatorScriptLanguageEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.SequenceEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.SequenceInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.SequenceOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.SmooksMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.SmooksMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.SmooksMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.SpringMediatorBeanNameEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.SpringMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.SpringMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.SpringMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.SwitchCaseBranchOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.SwitchDefaultBranchOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.SwitchMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.SwitchMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.WrappingLabelEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.XQueryMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.XQueryMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.XQueryMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.XQueryMediatorScriptKeyTypeEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.XSLTMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.XSLTMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.XSLTMediatorOutputConnectorEditPart;

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
	private static final String DEBUG_KEY = "org.wso2.carbonstudio.eclipse.gmf.esb.diagram/debug/visualID"; //$NON-NLS-1$

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
		return org.wso2.carbonstudio.eclipse.gmf.esb.diagram.part.EsbVisualIDRegistry
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
		String containerModelID = org.wso2.carbonstudio.eclipse.gmf.esb.diagram.part.EsbVisualIDRegistry
				.getModelID(containerView);
		if (!EsbDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (EsbDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.wso2.carbonstudio.eclipse.gmf.esb.diagram.part.EsbVisualIDRegistry
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
			if (EsbPackage.eINSTANCE.getProxyService().isSuperTypeOf(
					domainElement.eClass())) {
				return ProxyServiceEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getMessageMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return MessageMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getDefaultEndPoint().isSuperTypeOf(
					domainElement.eClass())) {
				return DefaultEndPointEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getAddressEndPoint().isSuperTypeOf(
					domainElement.eClass())) {
				return AddressEndPointEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getWSDLEndPoint().isSuperTypeOf(
					domainElement.eClass())) {
				return WSDLEndPointEditPart.VISUAL_ID;
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
		case DefaultEndPointEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getDefaultEndPointInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return DefaultEndPointInputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getDefaultEndPointOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return DefaultEndPointOutputConnectorEditPart.VISUAL_ID;
			}
			break;
		case AddressEndPointEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getAddressEndPointInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return AddressEndPointInputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getAddressEndPointOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return AddressEndPointOutputConnectorEditPart.VISUAL_ID;
			}
			break;
		case DropMediatorEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getDropMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return DropMediatorInputConnectorEditPart.VISUAL_ID;
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
		case PropertyMediatorEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getPropertyMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return PropertyMediatorInputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getPropertyMediatorOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return PropertyMediatorOutputConnectorEditPart.VISUAL_ID;
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
		case FailoverEndPointEditPart.VISUAL_ID:
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
		case WSDLEndPointEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getWSDLEndPointInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return WSDLEndPointInputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getWSDLEndPointOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return WSDLEndPointOutputConnectorEditPart.VISUAL_ID;
			}
			break;
		case LoadBalanceEndPointEditPart.VISUAL_ID:
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
		case EsbServerContentsCompartmentEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getDropMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return DropMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getFilterMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return FilterMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getMergeNode().isSuperTypeOf(
					domainElement.eClass())) {
				return MergeNodeEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getLogMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return LogMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getPropertyMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return PropertyMediatorEditPart.VISUAL_ID;
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
			if (EsbPackage.eINSTANCE.getFailoverEndPoint().isSuperTypeOf(
					domainElement.eClass())) {
				return FailoverEndPointEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getLoadBalanceEndPoint().isSuperTypeOf(
					domainElement.eClass())) {
				return LoadBalanceEndPointEditPart.VISUAL_ID;
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
			if (EsbPackage.eINSTANCE.getThrottleMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return ThrottleMediatorEditPart.VISUAL_ID;
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
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = org.wso2.carbonstudio.eclipse.gmf.esb.diagram.part.EsbVisualIDRegistry
				.getModelID(containerView);
		if (!EsbDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (EsbDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.wso2.carbonstudio.eclipse.gmf.esb.diagram.part.EsbVisualIDRegistry
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
			if (ProxyServiceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MessageMediatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DefaultEndPointEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AddressEndPointEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WSDLEndPointEditPart.VISUAL_ID == nodeVisualID) {
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
			break;
		case MessageMediatorEditPart.VISUAL_ID:
			if (MessageInputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MessageOutputConnectorEditPart.VISUAL_ID == nodeVisualID) {
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
		case DropMediatorEditPart.VISUAL_ID:
			if (DropMediatorInputConnectorEditPart.VISUAL_ID == nodeVisualID) {
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
		case EsbServerContentsCompartmentEditPart.VISUAL_ID:
			if (DropMediatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FilterMediatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MergeNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LogMediatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PropertyMediatorEditPart.VISUAL_ID == nodeVisualID) {
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
			if (FailoverEndPointEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LoadBalanceEndPointEditPart.VISUAL_ID == nodeVisualID) {
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
			if (ThrottleMediatorEditPart.VISUAL_ID == nodeVisualID) {
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
