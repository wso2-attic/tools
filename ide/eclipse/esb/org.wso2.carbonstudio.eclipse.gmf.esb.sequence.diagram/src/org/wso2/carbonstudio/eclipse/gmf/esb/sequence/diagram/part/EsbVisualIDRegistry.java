package org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.wso2.carbonstudio.eclipse.gmf.esb.EsbPackage;
import org.wso2.carbonstudio.eclipse.gmf.esb.SequenceDiagram;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.*;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.ClassMediatorClassNameEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.ClassMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.ClassMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.ClassMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.CloneMediatorCloneIDEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.CloneMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.CloneMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.CloneMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.CommandMediatorClassNameEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.CommandMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.CommandMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.CommandMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.DBLookupMediatorConnectionURLEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.DBLookupMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.DBLookupMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.DBLookupMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.DBReportMediatorConnectionURLEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.DBReportMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.DBReportMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.DBReportMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.DropMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.DropMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.EnrichMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.EnrichMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.EnrichMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.EnrichMediatorSourceTypeEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.EntitlementMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.EntitlementMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.EntitlementMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.EntitlementMediatorServerURLEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.EsbLinkEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.EsbSequenceEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.EsbSequenceInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.EsbSequenceOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.EsbSequenceSeqContentsCompartmentEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.EventMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.EventMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.EventMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.EventMediatorTopicTypeEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.FaultMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.FaultMediatorFaultStringTypeEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.FaultMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.FaultMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.FilterMediatorConditionTypeEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.FilterMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.FilterMediatorFailOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.FilterMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.FilterMediatorPassOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.HeaderMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.HeaderMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.HeaderMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.HeaderMediatorValueLiteralEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.LogMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.LogMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.LogMediatorLogCategoryEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.LogMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.PropertyMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.PropertyMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.PropertyMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.PropertyMediatorPropertyNameEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.ScriptMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.ScriptMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.ScriptMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.ScriptMediatorScriptLanguageEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.SendMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.SendMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.SendMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.SequenceDiagramEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.SmooksMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.SmooksMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.SmooksMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.SpringMediatorBeanNameEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.SpringMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.SpringMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.SpringMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.SwitchCaseBranchOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.SwitchDefaultBranchOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.SwitchMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.SwitchMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.XQueryMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.XQueryMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.XQueryMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.XQueryMediatorScriptKeyTypeEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.XSLTMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.XSLTMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.XSLTMediatorOutputConnectorEditPart;

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
	private static final String DEBUG_KEY = "org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (SequenceDiagramEditPart.MODEL_ID.equals(view.getType())) {
				return SequenceDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.part.EsbVisualIDRegistry
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
		if (EsbPackage.eINSTANCE.getSequenceDiagram().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((SequenceDiagram) domainElement)) {
			return SequenceDiagramEditPart.VISUAL_ID;
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
		String containerModelID = org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.part.EsbVisualIDRegistry
				.getModelID(containerView);
		if (!SequenceDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (SequenceDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.part.EsbVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = SequenceDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case SequenceDiagramEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getEsbSequence().isSuperTypeOf(
					domainElement.eClass())) {
				return EsbSequenceEditPart.VISUAL_ID;
			}
			break;
		case EsbSequenceEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getEsbSequenceInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return EsbSequenceInputConnectorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getEsbSequenceOutputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return EsbSequenceOutputConnectorEditPart.VISUAL_ID;
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
		case DropMediatorEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getDropMediatorInputConnector()
					.isSuperTypeOf(domainElement.eClass())) {
				return DropMediatorInputConnectorEditPart.VISUAL_ID;
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
		case EsbSequenceSeqContentsCompartmentEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getLogMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return LogMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getPropertyMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return PropertyMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getDropMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return DropMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getEnrichMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return EnrichMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getFilterMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return FilterMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getXSLTMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return XSLTMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getEventMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return EventMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getEntitlementMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return EntitlementMediatorEditPart.VISUAL_ID;
			}
			if (EsbPackage.eINSTANCE.getSwitchMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return SwitchMediatorEditPart.VISUAL_ID;
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
			if (EsbPackage.eINSTANCE.getAggregateMediator().isSuperTypeOf(
					domainElement.eClass())) {
				return AggregateMediatorEditPart.VISUAL_ID;
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
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.part.EsbVisualIDRegistry
				.getModelID(containerView);
		if (!SequenceDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (SequenceDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.part.EsbVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = SequenceDiagramEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case SequenceDiagramEditPart.VISUAL_ID:
			if (EsbSequenceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EsbSequenceEditPart.VISUAL_ID:
			if (EsbSequenceSeqContentsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EsbSequenceInputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EsbSequenceOutputConnectorEditPart.VISUAL_ID == nodeVisualID) {
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
		case DropMediatorEditPart.VISUAL_ID:
			if (DropMediatorInputConnectorEditPart.VISUAL_ID == nodeVisualID) {
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
		case XSLTMediatorEditPart.VISUAL_ID:
			if (XSLTMediatorInputConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (XSLTMediatorOutputConnectorEditPart.VISUAL_ID == nodeVisualID) {
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
		case EsbSequenceSeqContentsCompartmentEditPart.VISUAL_ID:
			if (LogMediatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PropertyMediatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DropMediatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EnrichMediatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FilterMediatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (XSLTMediatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EventMediatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EntitlementMediatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SwitchMediatorEditPart.VISUAL_ID == nodeVisualID) {
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
			if (AggregateMediatorEditPart.VISUAL_ID == nodeVisualID) {
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
	private static boolean isDiagram(SequenceDiagram element) {
		return true;
	}

}
