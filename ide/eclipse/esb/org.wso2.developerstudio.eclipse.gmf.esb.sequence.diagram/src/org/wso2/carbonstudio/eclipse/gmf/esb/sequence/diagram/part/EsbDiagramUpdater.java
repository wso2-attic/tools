package org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.part;

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
import org.wso2.carbonstudio.eclipse.gmf.esb.*;
import org.wso2.carbonstudio.eclipse.gmf.esb.AggregateMediator;
import org.wso2.carbonstudio.eclipse.gmf.esb.AggregateMediatorInputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.AggregateMediatorOutputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.CacheMediator;
import org.wso2.carbonstudio.eclipse.gmf.esb.CacheMediatorInputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.CacheMediatorOutputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.CalloutMediator;
import org.wso2.carbonstudio.eclipse.gmf.esb.CalloutMediatorInputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.CalloutMediatorOutputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.ClassMediator;
import org.wso2.carbonstudio.eclipse.gmf.esb.ClassMediatorInputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.ClassMediatorOutputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.CloneMediator;
import org.wso2.carbonstudio.eclipse.gmf.esb.CloneMediatorInputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.CloneMediatorOutputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.CommandMediator;
import org.wso2.carbonstudio.eclipse.gmf.esb.CommandMediatorInputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.CommandMediatorOutputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.DBLookupMediator;
import org.wso2.carbonstudio.eclipse.gmf.esb.DBLookupMediatorInputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.DBLookupMediatorOutputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.DBReportMediator;
import org.wso2.carbonstudio.eclipse.gmf.esb.DBReportMediatorInputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.DBReportMediatorOutputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.DropMediator;
import org.wso2.carbonstudio.eclipse.gmf.esb.DropMediatorInputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.EnrichMediator;
import org.wso2.carbonstudio.eclipse.gmf.esb.EnrichMediatorInputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.EnrichMediatorOutputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.EntitlementMediator;
import org.wso2.carbonstudio.eclipse.gmf.esb.EntitlementMediatorInputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.EntitlementMediatorOutputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.EsbLink;
import org.wso2.carbonstudio.eclipse.gmf.esb.EsbPackage;
import org.wso2.carbonstudio.eclipse.gmf.esb.EsbSequence;
import org.wso2.carbonstudio.eclipse.gmf.esb.EsbSequenceInputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.EsbSequenceOutputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.EventMediator;
import org.wso2.carbonstudio.eclipse.gmf.esb.EventMediatorInputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.EventMediatorOutputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.FaultMediator;
import org.wso2.carbonstudio.eclipse.gmf.esb.FaultMediatorInputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.FaultMediatorOutputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.FilterMediator;
import org.wso2.carbonstudio.eclipse.gmf.esb.FilterMediatorFailOutputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.FilterMediatorInputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.FilterMediatorPassOutputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.HeaderMediator;
import org.wso2.carbonstudio.eclipse.gmf.esb.HeaderMediatorInputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.HeaderMediatorOutputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.InputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.IterateMediator;
import org.wso2.carbonstudio.eclipse.gmf.esb.IterateMediatorInputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.IterateMediatorOutputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.LogMediator;
import org.wso2.carbonstudio.eclipse.gmf.esb.LogMediatorInputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.LogMediatorOutputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.Mediator;
import org.wso2.carbonstudio.eclipse.gmf.esb.OutputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.PropertyMediator;
import org.wso2.carbonstudio.eclipse.gmf.esb.PropertyMediatorInputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.PropertyMediatorOutputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.ScriptMediator;
import org.wso2.carbonstudio.eclipse.gmf.esb.ScriptMediatorInputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.ScriptMediatorOutputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.SendMediator;
import org.wso2.carbonstudio.eclipse.gmf.esb.SendMediatorInputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.SendMediatorOutputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.SequenceDiagram;
import org.wso2.carbonstudio.eclipse.gmf.esb.SmooksMediator;
import org.wso2.carbonstudio.eclipse.gmf.esb.SmooksMediatorInputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.SmooksMediatorOutputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.SpringMediator;
import org.wso2.carbonstudio.eclipse.gmf.esb.SpringMediatorInputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.SpringMediatorOutputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.SwitchCaseBranchOutputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.SwitchDefaultBranchOutputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.SwitchMediator;
import org.wso2.carbonstudio.eclipse.gmf.esb.SwitchMediatorInputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.TransactionMediator;
import org.wso2.carbonstudio.eclipse.gmf.esb.TransactionMediatorInputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.TransactionMediatorOutputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.XQueryMediator;
import org.wso2.carbonstudio.eclipse.gmf.esb.XQueryMediatorInputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.XQueryMediatorOutputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.XSLTMediator;
import org.wso2.carbonstudio.eclipse.gmf.esb.XSLTMediatorInputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.XSLTMediatorOutputConnector;
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
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.EsbSequenceSeqContentsCompartmentEditPart;
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
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.providers.EsbElementTypes;

/**
 * @generated
 */
public class EsbDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<EsbNodeDescriptor> getSemanticChildren(View view) {
		switch (EsbVisualIDRegistry.getVisualID(view)) {
		case SequenceDiagramEditPart.VISUAL_ID:
			return getSequenceDiagram_1000SemanticChildren(view);
		case EsbSequenceEditPart.VISUAL_ID:
			return getEsbSequence_2501SemanticChildren(view);
		case LogMediatorEditPart.VISUAL_ID:
			return getLogMediator_3501SemanticChildren(view);
		case PropertyMediatorEditPart.VISUAL_ID:
			return getPropertyMediator_3512SemanticChildren(view);
		case DropMediatorEditPart.VISUAL_ID:
			return getDropMediator_3519SemanticChildren(view);
		case EnrichMediatorEditPart.VISUAL_ID:
			return getEnrichMediator_3521SemanticChildren(view);
		case FilterMediatorEditPart.VISUAL_ID:
			return getFilterMediator_3524SemanticChildren(view);
		case XSLTMediatorEditPart.VISUAL_ID:
			return getXSLTMediator_3528SemanticChildren(view);
		case EventMediatorEditPart.VISUAL_ID:
			return getEventMediator_3531SemanticChildren(view);
		case EntitlementMediatorEditPart.VISUAL_ID:
			return getEntitlementMediator_3534SemanticChildren(view);
		case SwitchMediatorEditPart.VISUAL_ID:
			return getSwitchMediator_3537SemanticChildren(view);
		case ClassMediatorEditPart.VISUAL_ID:
			return getClassMediator_3541SemanticChildren(view);
		case SpringMediatorEditPart.VISUAL_ID:
			return getSpringMediator_3544SemanticChildren(view);
		case ScriptMediatorEditPart.VISUAL_ID:
			return getScriptMediator_3547SemanticChildren(view);
		case FaultMediatorEditPart.VISUAL_ID:
			return getFaultMediator_3550SemanticChildren(view);
		case XQueryMediatorEditPart.VISUAL_ID:
			return getXQueryMediator_3553SemanticChildren(view);
		case CommandMediatorEditPart.VISUAL_ID:
			return getCommandMediator_3556SemanticChildren(view);
		case DBLookupMediatorEditPart.VISUAL_ID:
			return getDBLookupMediator_3559SemanticChildren(view);
		case DBReportMediatorEditPart.VISUAL_ID:
			return getDBReportMediator_3562SemanticChildren(view);
		case SmooksMediatorEditPart.VISUAL_ID:
			return getSmooksMediator_3565SemanticChildren(view);
		case SendMediatorEditPart.VISUAL_ID:
			return getSendMediator_3568SemanticChildren(view);
		case HeaderMediatorEditPart.VISUAL_ID:
			return getHeaderMediator_3571SemanticChildren(view);
		case CloneMediatorEditPart.VISUAL_ID:
			return getCloneMediator_3574SemanticChildren(view);
		case CacheMediatorEditPart.VISUAL_ID:
			return getCacheMediator_3577SemanticChildren(view);
		case IterateMediatorEditPart.VISUAL_ID:
			return getIterateMediator_3580SemanticChildren(view);
		case AggregateMediatorEditPart.VISUAL_ID:
			return getAggregateMediator_3583SemanticChildren(view);
		case CalloutMediatorEditPart.VISUAL_ID:
			return getCalloutMediator_3586SemanticChildren(view);
		case TransactionMediatorEditPart.VISUAL_ID:
			return getTransactionMediator_3589SemanticChildren(view);
		case ThrottleMediatorEditPart.VISUAL_ID:
			return getThrottleMediator_3592SemanticChildren(view);
		case RMSequenceMediatorEditPart.VISUAL_ID:
			return getRMSequenceMediator_3595SemanticChildren(view);
		case RuleMediatorEditPart.VISUAL_ID:
			return getRuleMediator_3598SemanticChildren(view);
		case OAuthMediatorEditPart.VISUAL_ID:
			return getOAuthMediator_3601SemanticChildren(view);
		case EsbSequenceSeqContentsCompartmentEditPart.VISUAL_ID:
			return getEsbSequenceSeqContentsCompartment_7501SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbNodeDescriptor> getSequenceDiagram_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		SequenceDiagram modelElement = (SequenceDiagram) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
		{
			EsbSequence childElement = modelElement.getSequence();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == EsbSequenceEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbNodeDescriptor> getEsbSequence_2501SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		EsbSequence modelElement = (EsbSequence) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
		{
			EsbSequenceInputConnector childElement = modelElement.getInput();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == EsbSequenceInputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		{
			EsbSequenceOutputConnector childElement = modelElement.getOutput();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == EsbSequenceOutputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbNodeDescriptor> getLogMediator_3501SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		LogMediator modelElement = (LogMediator) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
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
	public static List<EsbNodeDescriptor> getPropertyMediator_3512SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		PropertyMediator modelElement = (PropertyMediator) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
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
	public static List<EsbNodeDescriptor> getDropMediator_3519SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		DropMediator modelElement = (DropMediator) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
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
	public static List<EsbNodeDescriptor> getEnrichMediator_3521SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		EnrichMediator modelElement = (EnrichMediator) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
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
	public static List<EsbNodeDescriptor> getFilterMediator_3524SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		FilterMediator modelElement = (FilterMediator) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
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
	public static List<EsbNodeDescriptor> getXSLTMediator_3528SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		XSLTMediator modelElement = (XSLTMediator) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
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
	public static List<EsbNodeDescriptor> getEventMediator_3531SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		EventMediator modelElement = (EventMediator) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
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
	public static List<EsbNodeDescriptor> getEntitlementMediator_3534SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		EntitlementMediator modelElement = (EntitlementMediator) view
				.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
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
	public static List<EsbNodeDescriptor> getSwitchMediator_3537SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		SwitchMediator modelElement = (SwitchMediator) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
		{
			SwitchMediatorInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SwitchMediatorInputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator<?> it = modelElement.getCaseBranches().iterator(); it
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
	public static List<EsbNodeDescriptor> getClassMediator_3541SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ClassMediator modelElement = (ClassMediator) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
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
	public static List<EsbNodeDescriptor> getSpringMediator_3544SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		SpringMediator modelElement = (SpringMediator) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
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
	public static List<EsbNodeDescriptor> getScriptMediator_3547SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ScriptMediator modelElement = (ScriptMediator) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
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
	public static List<EsbNodeDescriptor> getFaultMediator_3550SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		FaultMediator modelElement = (FaultMediator) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
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
	public static List<EsbNodeDescriptor> getXQueryMediator_3553SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		XQueryMediator modelElement = (XQueryMediator) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
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
	public static List<EsbNodeDescriptor> getCommandMediator_3556SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		CommandMediator modelElement = (CommandMediator) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
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
	public static List<EsbNodeDescriptor> getDBLookupMediator_3559SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		DBLookupMediator modelElement = (DBLookupMediator) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
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
	public static List<EsbNodeDescriptor> getDBReportMediator_3562SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		DBReportMediator modelElement = (DBReportMediator) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
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
	public static List<EsbNodeDescriptor> getSmooksMediator_3565SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		SmooksMediator modelElement = (SmooksMediator) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
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
	public static List<EsbNodeDescriptor> getSendMediator_3568SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		SendMediator modelElement = (SendMediator) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
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
	public static List<EsbNodeDescriptor> getHeaderMediator_3571SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		HeaderMediator modelElement = (HeaderMediator) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
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
	public static List<EsbNodeDescriptor> getCloneMediator_3574SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		CloneMediator modelElement = (CloneMediator) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
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
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbNodeDescriptor> getCacheMediator_3577SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		CacheMediator modelElement = (CacheMediator) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
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
	public static List<EsbNodeDescriptor> getIterateMediator_3580SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		IterateMediator modelElement = (IterateMediator) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
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
	public static List<EsbNodeDescriptor> getAggregateMediator_3583SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		AggregateMediator modelElement = (AggregateMediator) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
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
	public static List<EsbNodeDescriptor> getCalloutMediator_3586SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		CalloutMediator modelElement = (CalloutMediator) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
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
	public static List<EsbNodeDescriptor> getTransactionMediator_3589SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		TransactionMediator modelElement = (TransactionMediator) view
				.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
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
	public static List<EsbNodeDescriptor> getThrottleMediator_3592SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ThrottleMediator modelElement = (ThrottleMediator) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
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
	public static List<EsbNodeDescriptor> getRMSequenceMediator_3595SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		RMSequenceMediator modelElement = (RMSequenceMediator) view
				.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
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
	public static List<EsbNodeDescriptor> getRuleMediator_3598SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		RuleMediator modelElement = (RuleMediator) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
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
	public static List<EsbNodeDescriptor> getOAuthMediator_3601SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		OAuthMediator modelElement = (OAuthMediator) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
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
	public static List<EsbNodeDescriptor> getEsbSequenceSeqContentsCompartment_7501SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		EsbSequence modelElement = (EsbSequence) containerView.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
		for (Iterator<?> it = modelElement.getChildMediators().iterator(); it
				.hasNext();) {
			Mediator childElement = (Mediator) it.next();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == LogMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PropertyMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DropMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EnrichMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FilterMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == XSLTMediatorEditPart.VISUAL_ID) {
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
			if (visualID == SwitchMediatorEditPart.VISUAL_ID) {
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
			if (visualID == AggregateMediatorEditPart.VISUAL_ID) {
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
			if (visualID == ThrottleMediatorEditPart.VISUAL_ID) {
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
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getContainedLinks(View view) {
		switch (EsbVisualIDRegistry.getVisualID(view)) {
		case SequenceDiagramEditPart.VISUAL_ID:
			return getSequenceDiagram_1000ContainedLinks(view);
		case EsbSequenceEditPart.VISUAL_ID:
			return getEsbSequence_2501ContainedLinks(view);
		case LogMediatorEditPart.VISUAL_ID:
			return getLogMediator_3501ContainedLinks(view);
		case LogMediatorInputConnectorEditPart.VISUAL_ID:
			return getLogMediatorInputConnector_3502ContainedLinks(view);
		case LogMediatorOutputConnectorEditPart.VISUAL_ID:
			return getLogMediatorOutputConnector_3503ContainedLinks(view);
		case PropertyMediatorEditPart.VISUAL_ID:
			return getPropertyMediator_3512ContainedLinks(view);
		case PropertyMediatorInputConnectorEditPart.VISUAL_ID:
			return getPropertyMediatorInputConnector_3513ContainedLinks(view);
		case PropertyMediatorOutputConnectorEditPart.VISUAL_ID:
			return getPropertyMediatorOutputConnector_3514ContainedLinks(view);
		case EsbSequenceInputConnectorEditPart.VISUAL_ID:
			return getEsbSequenceInputConnector_3517ContainedLinks(view);
		case EsbSequenceOutputConnectorEditPart.VISUAL_ID:
			return getEsbSequenceOutputConnector_3518ContainedLinks(view);
		case DropMediatorEditPart.VISUAL_ID:
			return getDropMediator_3519ContainedLinks(view);
		case DropMediatorInputConnectorEditPart.VISUAL_ID:
			return getDropMediatorInputConnector_3520ContainedLinks(view);
		case EnrichMediatorEditPart.VISUAL_ID:
			return getEnrichMediator_3521ContainedLinks(view);
		case EnrichMediatorInputConnectorEditPart.VISUAL_ID:
			return getEnrichMediatorInputConnector_3522ContainedLinks(view);
		case EnrichMediatorOutputConnectorEditPart.VISUAL_ID:
			return getEnrichMediatorOutputConnector_3523ContainedLinks(view);
		case FilterMediatorEditPart.VISUAL_ID:
			return getFilterMediator_3524ContainedLinks(view);
		case FilterMediatorInputConnectorEditPart.VISUAL_ID:
			return getFilterMediatorInputConnector_3525ContainedLinks(view);
		case FilterMediatorPassOutputConnectorEditPart.VISUAL_ID:
			return getFilterMediatorPassOutputConnector_3526ContainedLinks(view);
		case FilterMediatorFailOutputConnectorEditPart.VISUAL_ID:
			return getFilterMediatorFailOutputConnector_3527ContainedLinks(view);
		case XSLTMediatorEditPart.VISUAL_ID:
			return getXSLTMediator_3528ContainedLinks(view);
		case XSLTMediatorInputConnectorEditPart.VISUAL_ID:
			return getXSLTMediatorInputConnector_3529ContainedLinks(view);
		case XSLTMediatorOutputConnectorEditPart.VISUAL_ID:
			return getXSLTMediatorOutputConnector_3530ContainedLinks(view);
		case EventMediatorEditPart.VISUAL_ID:
			return getEventMediator_3531ContainedLinks(view);
		case EventMediatorInputConnectorEditPart.VISUAL_ID:
			return getEventMediatorInputConnector_3532ContainedLinks(view);
		case EventMediatorOutputConnectorEditPart.VISUAL_ID:
			return getEventMediatorOutputConnector_3533ContainedLinks(view);
		case EntitlementMediatorEditPart.VISUAL_ID:
			return getEntitlementMediator_3534ContainedLinks(view);
		case EntitlementMediatorInputConnectorEditPart.VISUAL_ID:
			return getEntitlementMediatorInputConnector_3535ContainedLinks(view);
		case EntitlementMediatorOutputConnectorEditPart.VISUAL_ID:
			return getEntitlementMediatorOutputConnector_3536ContainedLinks(view);
		case SwitchMediatorEditPart.VISUAL_ID:
			return getSwitchMediator_3537ContainedLinks(view);
		case SwitchMediatorInputConnectorEditPart.VISUAL_ID:
			return getSwitchMediatorInputConnector_3538ContainedLinks(view);
		case SwitchCaseBranchOutputConnectorEditPart.VISUAL_ID:
			return getSwitchCaseBranchOutputConnector_3539ContainedLinks(view);
		case SwitchDefaultBranchOutputConnectorEditPart.VISUAL_ID:
			return getSwitchDefaultBranchOutputConnector_3540ContainedLinks(view);
		case ClassMediatorEditPart.VISUAL_ID:
			return getClassMediator_3541ContainedLinks(view);
		case ClassMediatorInputConnectorEditPart.VISUAL_ID:
			return getClassMediatorInputConnector_3542ContainedLinks(view);
		case ClassMediatorOutputConnectorEditPart.VISUAL_ID:
			return getClassMediatorOutputConnector_3543ContainedLinks(view);
		case SpringMediatorEditPart.VISUAL_ID:
			return getSpringMediator_3544ContainedLinks(view);
		case SpringMediatorInputConnectorEditPart.VISUAL_ID:
			return getSpringMediatorInputConnector_3545ContainedLinks(view);
		case SpringMediatorOutputConnectorEditPart.VISUAL_ID:
			return getSpringMediatorOutputConnector_3546ContainedLinks(view);
		case ScriptMediatorEditPart.VISUAL_ID:
			return getScriptMediator_3547ContainedLinks(view);
		case ScriptMediatorInputConnectorEditPart.VISUAL_ID:
			return getScriptMediatorInputConnector_3548ContainedLinks(view);
		case ScriptMediatorOutputConnectorEditPart.VISUAL_ID:
			return getScriptMediatorOutputConnector_3549ContainedLinks(view);
		case FaultMediatorEditPart.VISUAL_ID:
			return getFaultMediator_3550ContainedLinks(view);
		case FaultMediatorInputConnectorEditPart.VISUAL_ID:
			return getFaultMediatorInputConnector_3551ContainedLinks(view);
		case FaultMediatorOutputConnectorEditPart.VISUAL_ID:
			return getFaultMediatorOutputConnector_3552ContainedLinks(view);
		case XQueryMediatorEditPart.VISUAL_ID:
			return getXQueryMediator_3553ContainedLinks(view);
		case XQueryMediatorInputConnectorEditPart.VISUAL_ID:
			return getXQueryMediatorInputConnector_3554ContainedLinks(view);
		case XQueryMediatorOutputConnectorEditPart.VISUAL_ID:
			return getXQueryMediatorOutputConnector_3555ContainedLinks(view);
		case CommandMediatorEditPart.VISUAL_ID:
			return getCommandMediator_3556ContainedLinks(view);
		case CommandMediatorInputConnectorEditPart.VISUAL_ID:
			return getCommandMediatorInputConnector_3557ContainedLinks(view);
		case CommandMediatorOutputConnectorEditPart.VISUAL_ID:
			return getCommandMediatorOutputConnector_3558ContainedLinks(view);
		case DBLookupMediatorEditPart.VISUAL_ID:
			return getDBLookupMediator_3559ContainedLinks(view);
		case DBLookupMediatorInputConnectorEditPart.VISUAL_ID:
			return getDBLookupMediatorInputConnector_3560ContainedLinks(view);
		case DBLookupMediatorOutputConnectorEditPart.VISUAL_ID:
			return getDBLookupMediatorOutputConnector_3561ContainedLinks(view);
		case DBReportMediatorEditPart.VISUAL_ID:
			return getDBReportMediator_3562ContainedLinks(view);
		case DBReportMediatorInputConnectorEditPart.VISUAL_ID:
			return getDBReportMediatorInputConnector_3563ContainedLinks(view);
		case DBReportMediatorOutputConnectorEditPart.VISUAL_ID:
			return getDBReportMediatorOutputConnector_3564ContainedLinks(view);
		case SmooksMediatorEditPart.VISUAL_ID:
			return getSmooksMediator_3565ContainedLinks(view);
		case SmooksMediatorInputConnectorEditPart.VISUAL_ID:
			return getSmooksMediatorInputConnector_3566ContainedLinks(view);
		case SmooksMediatorOutputConnectorEditPart.VISUAL_ID:
			return getSmooksMediatorOutputConnector_3567ContainedLinks(view);
		case SendMediatorEditPart.VISUAL_ID:
			return getSendMediator_3568ContainedLinks(view);
		case SendMediatorInputConnectorEditPart.VISUAL_ID:
			return getSendMediatorInputConnector_3569ContainedLinks(view);
		case SendMediatorOutputConnectorEditPart.VISUAL_ID:
			return getSendMediatorOutputConnector_3570ContainedLinks(view);
		case HeaderMediatorEditPart.VISUAL_ID:
			return getHeaderMediator_3571ContainedLinks(view);
		case HeaderMediatorInputConnectorEditPart.VISUAL_ID:
			return getHeaderMediatorInputConnector_3572ContainedLinks(view);
		case HeaderMediatorOutputConnectorEditPart.VISUAL_ID:
			return getHeaderMediatorOutputConnector_3573ContainedLinks(view);
		case CloneMediatorEditPart.VISUAL_ID:
			return getCloneMediator_3574ContainedLinks(view);
		case CloneMediatorInputConnectorEditPart.VISUAL_ID:
			return getCloneMediatorInputConnector_3575ContainedLinks(view);
		case CloneMediatorOutputConnectorEditPart.VISUAL_ID:
			return getCloneMediatorOutputConnector_3576ContainedLinks(view);
		case CacheMediatorEditPart.VISUAL_ID:
			return getCacheMediator_3577ContainedLinks(view);
		case CacheMediatorInputConnectorEditPart.VISUAL_ID:
			return getCacheMediatorInputConnector_3578ContainedLinks(view);
		case CacheMediatorOutputConnectorEditPart.VISUAL_ID:
			return getCacheMediatorOutputConnector_3579ContainedLinks(view);
		case IterateMediatorEditPart.VISUAL_ID:
			return getIterateMediator_3580ContainedLinks(view);
		case IterateMediatorInputConnectorEditPart.VISUAL_ID:
			return getIterateMediatorInputConnector_3581ContainedLinks(view);
		case IterateMediatorOutputConnectorEditPart.VISUAL_ID:
			return getIterateMediatorOutputConnector_3582ContainedLinks(view);
		case AggregateMediatorEditPart.VISUAL_ID:
			return getAggregateMediator_3583ContainedLinks(view);
		case AggregateMediatorInputConnectorEditPart.VISUAL_ID:
			return getAggregateMediatorInputConnector_3584ContainedLinks(view);
		case AggregateMediatorOutputConnectorEditPart.VISUAL_ID:
			return getAggregateMediatorOutputConnector_3585ContainedLinks(view);
		case AggregateMediatorOnCompleteOutputConnectorEditPart.VISUAL_ID:
			return getAggregateMediatorOnCompleteOutputConnector_3604ContainedLinks(view);
		case CalloutMediatorEditPart.VISUAL_ID:
			return getCalloutMediator_3586ContainedLinks(view);
		case CalloutMediatorInputConnectorEditPart.VISUAL_ID:
			return getCalloutMediatorInputConnector_3587ContainedLinks(view);
		case CalloutMediatorOutputConnectorEditPart.VISUAL_ID:
			return getCalloutMediatorOutputConnector_3588ContainedLinks(view);
		case TransactionMediatorEditPart.VISUAL_ID:
			return getTransactionMediator_3589ContainedLinks(view);
		case TransactionMediatorInputConnectorEditPart.VISUAL_ID:
			return getTransactionMediatorInputConnector_3590ContainedLinks(view);
		case TransactionMediatorOutputConnectorEditPart.VISUAL_ID:
			return getTransactionMediatorOutputConnector_3591ContainedLinks(view);
		case ThrottleMediatorEditPart.VISUAL_ID:
			return getThrottleMediator_3592ContainedLinks(view);
		case ThrottleMediatorInputConnectorEditPart.VISUAL_ID:
			return getThrottleMediatorInputConnector_3593ContainedLinks(view);
		case ThrottleMediatorOutputConnectorEditPart.VISUAL_ID:
			return getThrottleMediatorOutputConnector_3594ContainedLinks(view);
		case RMSequenceMediatorEditPart.VISUAL_ID:
			return getRMSequenceMediator_3595ContainedLinks(view);
		case RMSequenceMediatorInputConnectorEditPart.VISUAL_ID:
			return getRMSequenceMediatorInputConnector_3596ContainedLinks(view);
		case RMSequenceMediatorOutputConnectorEditPart.VISUAL_ID:
			return getRMSequenceMediatorOutputConnector_3597ContainedLinks(view);
		case RuleMediatorEditPart.VISUAL_ID:
			return getRuleMediator_3598ContainedLinks(view);
		case RuleMediatorInputConnectorEditPart.VISUAL_ID:
			return getRuleMediatorInputConnector_3599ContainedLinks(view);
		case RuleMediatorOutputConnectorEditPart.VISUAL_ID:
			return getRuleMediatorOutputConnector_3600ContainedLinks(view);
		case OAuthMediatorEditPart.VISUAL_ID:
			return getOAuthMediator_3601ContainedLinks(view);
		case OAuthMediatorInputConnectorEditPart.VISUAL_ID:
			return getOAuthMediatorInputConnector_3602ContainedLinks(view);
		case OAuthMediatorOutputConnectorEditPart.VISUAL_ID:
			return getOAuthMediatorOutputConnector_3603ContainedLinks(view);
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
		case EsbSequenceEditPart.VISUAL_ID:
			return getEsbSequence_2501IncomingLinks(view);
		case LogMediatorEditPart.VISUAL_ID:
			return getLogMediator_3501IncomingLinks(view);
		case LogMediatorInputConnectorEditPart.VISUAL_ID:
			return getLogMediatorInputConnector_3502IncomingLinks(view);
		case LogMediatorOutputConnectorEditPart.VISUAL_ID:
			return getLogMediatorOutputConnector_3503IncomingLinks(view);
		case PropertyMediatorEditPart.VISUAL_ID:
			return getPropertyMediator_3512IncomingLinks(view);
		case PropertyMediatorInputConnectorEditPart.VISUAL_ID:
			return getPropertyMediatorInputConnector_3513IncomingLinks(view);
		case PropertyMediatorOutputConnectorEditPart.VISUAL_ID:
			return getPropertyMediatorOutputConnector_3514IncomingLinks(view);
		case EsbSequenceInputConnectorEditPart.VISUAL_ID:
			return getEsbSequenceInputConnector_3517IncomingLinks(view);
		case EsbSequenceOutputConnectorEditPart.VISUAL_ID:
			return getEsbSequenceOutputConnector_3518IncomingLinks(view);
		case DropMediatorEditPart.VISUAL_ID:
			return getDropMediator_3519IncomingLinks(view);
		case DropMediatorInputConnectorEditPart.VISUAL_ID:
			return getDropMediatorInputConnector_3520IncomingLinks(view);
		case EnrichMediatorEditPart.VISUAL_ID:
			return getEnrichMediator_3521IncomingLinks(view);
		case EnrichMediatorInputConnectorEditPart.VISUAL_ID:
			return getEnrichMediatorInputConnector_3522IncomingLinks(view);
		case EnrichMediatorOutputConnectorEditPart.VISUAL_ID:
			return getEnrichMediatorOutputConnector_3523IncomingLinks(view);
		case FilterMediatorEditPart.VISUAL_ID:
			return getFilterMediator_3524IncomingLinks(view);
		case FilterMediatorInputConnectorEditPart.VISUAL_ID:
			return getFilterMediatorInputConnector_3525IncomingLinks(view);
		case FilterMediatorPassOutputConnectorEditPart.VISUAL_ID:
			return getFilterMediatorPassOutputConnector_3526IncomingLinks(view);
		case FilterMediatorFailOutputConnectorEditPart.VISUAL_ID:
			return getFilterMediatorFailOutputConnector_3527IncomingLinks(view);
		case XSLTMediatorEditPart.VISUAL_ID:
			return getXSLTMediator_3528IncomingLinks(view);
		case XSLTMediatorInputConnectorEditPart.VISUAL_ID:
			return getXSLTMediatorInputConnector_3529IncomingLinks(view);
		case XSLTMediatorOutputConnectorEditPart.VISUAL_ID:
			return getXSLTMediatorOutputConnector_3530IncomingLinks(view);
		case EventMediatorEditPart.VISUAL_ID:
			return getEventMediator_3531IncomingLinks(view);
		case EventMediatorInputConnectorEditPart.VISUAL_ID:
			return getEventMediatorInputConnector_3532IncomingLinks(view);
		case EventMediatorOutputConnectorEditPart.VISUAL_ID:
			return getEventMediatorOutputConnector_3533IncomingLinks(view);
		case EntitlementMediatorEditPart.VISUAL_ID:
			return getEntitlementMediator_3534IncomingLinks(view);
		case EntitlementMediatorInputConnectorEditPart.VISUAL_ID:
			return getEntitlementMediatorInputConnector_3535IncomingLinks(view);
		case EntitlementMediatorOutputConnectorEditPart.VISUAL_ID:
			return getEntitlementMediatorOutputConnector_3536IncomingLinks(view);
		case SwitchMediatorEditPart.VISUAL_ID:
			return getSwitchMediator_3537IncomingLinks(view);
		case SwitchMediatorInputConnectorEditPart.VISUAL_ID:
			return getSwitchMediatorInputConnector_3538IncomingLinks(view);
		case SwitchCaseBranchOutputConnectorEditPart.VISUAL_ID:
			return getSwitchCaseBranchOutputConnector_3539IncomingLinks(view);
		case SwitchDefaultBranchOutputConnectorEditPart.VISUAL_ID:
			return getSwitchDefaultBranchOutputConnector_3540IncomingLinks(view);
		case ClassMediatorEditPart.VISUAL_ID:
			return getClassMediator_3541IncomingLinks(view);
		case ClassMediatorInputConnectorEditPart.VISUAL_ID:
			return getClassMediatorInputConnector_3542IncomingLinks(view);
		case ClassMediatorOutputConnectorEditPart.VISUAL_ID:
			return getClassMediatorOutputConnector_3543IncomingLinks(view);
		case SpringMediatorEditPart.VISUAL_ID:
			return getSpringMediator_3544IncomingLinks(view);
		case SpringMediatorInputConnectorEditPart.VISUAL_ID:
			return getSpringMediatorInputConnector_3545IncomingLinks(view);
		case SpringMediatorOutputConnectorEditPart.VISUAL_ID:
			return getSpringMediatorOutputConnector_3546IncomingLinks(view);
		case ScriptMediatorEditPart.VISUAL_ID:
			return getScriptMediator_3547IncomingLinks(view);
		case ScriptMediatorInputConnectorEditPart.VISUAL_ID:
			return getScriptMediatorInputConnector_3548IncomingLinks(view);
		case ScriptMediatorOutputConnectorEditPart.VISUAL_ID:
			return getScriptMediatorOutputConnector_3549IncomingLinks(view);
		case FaultMediatorEditPart.VISUAL_ID:
			return getFaultMediator_3550IncomingLinks(view);
		case FaultMediatorInputConnectorEditPart.VISUAL_ID:
			return getFaultMediatorInputConnector_3551IncomingLinks(view);
		case FaultMediatorOutputConnectorEditPart.VISUAL_ID:
			return getFaultMediatorOutputConnector_3552IncomingLinks(view);
		case XQueryMediatorEditPart.VISUAL_ID:
			return getXQueryMediator_3553IncomingLinks(view);
		case XQueryMediatorInputConnectorEditPart.VISUAL_ID:
			return getXQueryMediatorInputConnector_3554IncomingLinks(view);
		case XQueryMediatorOutputConnectorEditPart.VISUAL_ID:
			return getXQueryMediatorOutputConnector_3555IncomingLinks(view);
		case CommandMediatorEditPart.VISUAL_ID:
			return getCommandMediator_3556IncomingLinks(view);
		case CommandMediatorInputConnectorEditPart.VISUAL_ID:
			return getCommandMediatorInputConnector_3557IncomingLinks(view);
		case CommandMediatorOutputConnectorEditPart.VISUAL_ID:
			return getCommandMediatorOutputConnector_3558IncomingLinks(view);
		case DBLookupMediatorEditPart.VISUAL_ID:
			return getDBLookupMediator_3559IncomingLinks(view);
		case DBLookupMediatorInputConnectorEditPart.VISUAL_ID:
			return getDBLookupMediatorInputConnector_3560IncomingLinks(view);
		case DBLookupMediatorOutputConnectorEditPart.VISUAL_ID:
			return getDBLookupMediatorOutputConnector_3561IncomingLinks(view);
		case DBReportMediatorEditPart.VISUAL_ID:
			return getDBReportMediator_3562IncomingLinks(view);
		case DBReportMediatorInputConnectorEditPart.VISUAL_ID:
			return getDBReportMediatorInputConnector_3563IncomingLinks(view);
		case DBReportMediatorOutputConnectorEditPart.VISUAL_ID:
			return getDBReportMediatorOutputConnector_3564IncomingLinks(view);
		case SmooksMediatorEditPart.VISUAL_ID:
			return getSmooksMediator_3565IncomingLinks(view);
		case SmooksMediatorInputConnectorEditPart.VISUAL_ID:
			return getSmooksMediatorInputConnector_3566IncomingLinks(view);
		case SmooksMediatorOutputConnectorEditPart.VISUAL_ID:
			return getSmooksMediatorOutputConnector_3567IncomingLinks(view);
		case SendMediatorEditPart.VISUAL_ID:
			return getSendMediator_3568IncomingLinks(view);
		case SendMediatorInputConnectorEditPart.VISUAL_ID:
			return getSendMediatorInputConnector_3569IncomingLinks(view);
		case SendMediatorOutputConnectorEditPart.VISUAL_ID:
			return getSendMediatorOutputConnector_3570IncomingLinks(view);
		case HeaderMediatorEditPart.VISUAL_ID:
			return getHeaderMediator_3571IncomingLinks(view);
		case HeaderMediatorInputConnectorEditPart.VISUAL_ID:
			return getHeaderMediatorInputConnector_3572IncomingLinks(view);
		case HeaderMediatorOutputConnectorEditPart.VISUAL_ID:
			return getHeaderMediatorOutputConnector_3573IncomingLinks(view);
		case CloneMediatorEditPart.VISUAL_ID:
			return getCloneMediator_3574IncomingLinks(view);
		case CloneMediatorInputConnectorEditPart.VISUAL_ID:
			return getCloneMediatorInputConnector_3575IncomingLinks(view);
		case CloneMediatorOutputConnectorEditPart.VISUAL_ID:
			return getCloneMediatorOutputConnector_3576IncomingLinks(view);
		case CacheMediatorEditPart.VISUAL_ID:
			return getCacheMediator_3577IncomingLinks(view);
		case CacheMediatorInputConnectorEditPart.VISUAL_ID:
			return getCacheMediatorInputConnector_3578IncomingLinks(view);
		case CacheMediatorOutputConnectorEditPart.VISUAL_ID:
			return getCacheMediatorOutputConnector_3579IncomingLinks(view);
		case IterateMediatorEditPart.VISUAL_ID:
			return getIterateMediator_3580IncomingLinks(view);
		case IterateMediatorInputConnectorEditPart.VISUAL_ID:
			return getIterateMediatorInputConnector_3581IncomingLinks(view);
		case IterateMediatorOutputConnectorEditPart.VISUAL_ID:
			return getIterateMediatorOutputConnector_3582IncomingLinks(view);
		case AggregateMediatorEditPart.VISUAL_ID:
			return getAggregateMediator_3583IncomingLinks(view);
		case AggregateMediatorInputConnectorEditPart.VISUAL_ID:
			return getAggregateMediatorInputConnector_3584IncomingLinks(view);
		case AggregateMediatorOutputConnectorEditPart.VISUAL_ID:
			return getAggregateMediatorOutputConnector_3585IncomingLinks(view);
		case AggregateMediatorOnCompleteOutputConnectorEditPart.VISUAL_ID:
			return getAggregateMediatorOnCompleteOutputConnector_3604IncomingLinks(view);
		case CalloutMediatorEditPart.VISUAL_ID:
			return getCalloutMediator_3586IncomingLinks(view);
		case CalloutMediatorInputConnectorEditPart.VISUAL_ID:
			return getCalloutMediatorInputConnector_3587IncomingLinks(view);
		case CalloutMediatorOutputConnectorEditPart.VISUAL_ID:
			return getCalloutMediatorOutputConnector_3588IncomingLinks(view);
		case TransactionMediatorEditPart.VISUAL_ID:
			return getTransactionMediator_3589IncomingLinks(view);
		case TransactionMediatorInputConnectorEditPart.VISUAL_ID:
			return getTransactionMediatorInputConnector_3590IncomingLinks(view);
		case TransactionMediatorOutputConnectorEditPart.VISUAL_ID:
			return getTransactionMediatorOutputConnector_3591IncomingLinks(view);
		case ThrottleMediatorEditPart.VISUAL_ID:
			return getThrottleMediator_3592IncomingLinks(view);
		case ThrottleMediatorInputConnectorEditPart.VISUAL_ID:
			return getThrottleMediatorInputConnector_3593IncomingLinks(view);
		case ThrottleMediatorOutputConnectorEditPart.VISUAL_ID:
			return getThrottleMediatorOutputConnector_3594IncomingLinks(view);
		case RMSequenceMediatorEditPart.VISUAL_ID:
			return getRMSequenceMediator_3595IncomingLinks(view);
		case RMSequenceMediatorInputConnectorEditPart.VISUAL_ID:
			return getRMSequenceMediatorInputConnector_3596IncomingLinks(view);
		case RMSequenceMediatorOutputConnectorEditPart.VISUAL_ID:
			return getRMSequenceMediatorOutputConnector_3597IncomingLinks(view);
		case RuleMediatorEditPart.VISUAL_ID:
			return getRuleMediator_3598IncomingLinks(view);
		case RuleMediatorInputConnectorEditPart.VISUAL_ID:
			return getRuleMediatorInputConnector_3599IncomingLinks(view);
		case RuleMediatorOutputConnectorEditPart.VISUAL_ID:
			return getRuleMediatorOutputConnector_3600IncomingLinks(view);
		case OAuthMediatorEditPart.VISUAL_ID:
			return getOAuthMediator_3601IncomingLinks(view);
		case OAuthMediatorInputConnectorEditPart.VISUAL_ID:
			return getOAuthMediatorInputConnector_3602IncomingLinks(view);
		case OAuthMediatorOutputConnectorEditPart.VISUAL_ID:
			return getOAuthMediatorOutputConnector_3603IncomingLinks(view);
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
		case EsbSequenceEditPart.VISUAL_ID:
			return getEsbSequence_2501OutgoingLinks(view);
		case LogMediatorEditPart.VISUAL_ID:
			return getLogMediator_3501OutgoingLinks(view);
		case LogMediatorInputConnectorEditPart.VISUAL_ID:
			return getLogMediatorInputConnector_3502OutgoingLinks(view);
		case LogMediatorOutputConnectorEditPart.VISUAL_ID:
			return getLogMediatorOutputConnector_3503OutgoingLinks(view);
		case PropertyMediatorEditPart.VISUAL_ID:
			return getPropertyMediator_3512OutgoingLinks(view);
		case PropertyMediatorInputConnectorEditPart.VISUAL_ID:
			return getPropertyMediatorInputConnector_3513OutgoingLinks(view);
		case PropertyMediatorOutputConnectorEditPart.VISUAL_ID:
			return getPropertyMediatorOutputConnector_3514OutgoingLinks(view);
		case EsbSequenceInputConnectorEditPart.VISUAL_ID:
			return getEsbSequenceInputConnector_3517OutgoingLinks(view);
		case EsbSequenceOutputConnectorEditPart.VISUAL_ID:
			return getEsbSequenceOutputConnector_3518OutgoingLinks(view);
		case DropMediatorEditPart.VISUAL_ID:
			return getDropMediator_3519OutgoingLinks(view);
		case DropMediatorInputConnectorEditPart.VISUAL_ID:
			return getDropMediatorInputConnector_3520OutgoingLinks(view);
		case EnrichMediatorEditPart.VISUAL_ID:
			return getEnrichMediator_3521OutgoingLinks(view);
		case EnrichMediatorInputConnectorEditPart.VISUAL_ID:
			return getEnrichMediatorInputConnector_3522OutgoingLinks(view);
		case EnrichMediatorOutputConnectorEditPart.VISUAL_ID:
			return getEnrichMediatorOutputConnector_3523OutgoingLinks(view);
		case FilterMediatorEditPart.VISUAL_ID:
			return getFilterMediator_3524OutgoingLinks(view);
		case FilterMediatorInputConnectorEditPart.VISUAL_ID:
			return getFilterMediatorInputConnector_3525OutgoingLinks(view);
		case FilterMediatorPassOutputConnectorEditPart.VISUAL_ID:
			return getFilterMediatorPassOutputConnector_3526OutgoingLinks(view);
		case FilterMediatorFailOutputConnectorEditPart.VISUAL_ID:
			return getFilterMediatorFailOutputConnector_3527OutgoingLinks(view);
		case XSLTMediatorEditPart.VISUAL_ID:
			return getXSLTMediator_3528OutgoingLinks(view);
		case XSLTMediatorInputConnectorEditPart.VISUAL_ID:
			return getXSLTMediatorInputConnector_3529OutgoingLinks(view);
		case XSLTMediatorOutputConnectorEditPart.VISUAL_ID:
			return getXSLTMediatorOutputConnector_3530OutgoingLinks(view);
		case EventMediatorEditPart.VISUAL_ID:
			return getEventMediator_3531OutgoingLinks(view);
		case EventMediatorInputConnectorEditPart.VISUAL_ID:
			return getEventMediatorInputConnector_3532OutgoingLinks(view);
		case EventMediatorOutputConnectorEditPart.VISUAL_ID:
			return getEventMediatorOutputConnector_3533OutgoingLinks(view);
		case EntitlementMediatorEditPart.VISUAL_ID:
			return getEntitlementMediator_3534OutgoingLinks(view);
		case EntitlementMediatorInputConnectorEditPart.VISUAL_ID:
			return getEntitlementMediatorInputConnector_3535OutgoingLinks(view);
		case EntitlementMediatorOutputConnectorEditPart.VISUAL_ID:
			return getEntitlementMediatorOutputConnector_3536OutgoingLinks(view);
		case SwitchMediatorEditPart.VISUAL_ID:
			return getSwitchMediator_3537OutgoingLinks(view);
		case SwitchMediatorInputConnectorEditPart.VISUAL_ID:
			return getSwitchMediatorInputConnector_3538OutgoingLinks(view);
		case SwitchCaseBranchOutputConnectorEditPart.VISUAL_ID:
			return getSwitchCaseBranchOutputConnector_3539OutgoingLinks(view);
		case SwitchDefaultBranchOutputConnectorEditPart.VISUAL_ID:
			return getSwitchDefaultBranchOutputConnector_3540OutgoingLinks(view);
		case ClassMediatorEditPart.VISUAL_ID:
			return getClassMediator_3541OutgoingLinks(view);
		case ClassMediatorInputConnectorEditPart.VISUAL_ID:
			return getClassMediatorInputConnector_3542OutgoingLinks(view);
		case ClassMediatorOutputConnectorEditPart.VISUAL_ID:
			return getClassMediatorOutputConnector_3543OutgoingLinks(view);
		case SpringMediatorEditPart.VISUAL_ID:
			return getSpringMediator_3544OutgoingLinks(view);
		case SpringMediatorInputConnectorEditPart.VISUAL_ID:
			return getSpringMediatorInputConnector_3545OutgoingLinks(view);
		case SpringMediatorOutputConnectorEditPart.VISUAL_ID:
			return getSpringMediatorOutputConnector_3546OutgoingLinks(view);
		case ScriptMediatorEditPart.VISUAL_ID:
			return getScriptMediator_3547OutgoingLinks(view);
		case ScriptMediatorInputConnectorEditPart.VISUAL_ID:
			return getScriptMediatorInputConnector_3548OutgoingLinks(view);
		case ScriptMediatorOutputConnectorEditPart.VISUAL_ID:
			return getScriptMediatorOutputConnector_3549OutgoingLinks(view);
		case FaultMediatorEditPart.VISUAL_ID:
			return getFaultMediator_3550OutgoingLinks(view);
		case FaultMediatorInputConnectorEditPart.VISUAL_ID:
			return getFaultMediatorInputConnector_3551OutgoingLinks(view);
		case FaultMediatorOutputConnectorEditPart.VISUAL_ID:
			return getFaultMediatorOutputConnector_3552OutgoingLinks(view);
		case XQueryMediatorEditPart.VISUAL_ID:
			return getXQueryMediator_3553OutgoingLinks(view);
		case XQueryMediatorInputConnectorEditPart.VISUAL_ID:
			return getXQueryMediatorInputConnector_3554OutgoingLinks(view);
		case XQueryMediatorOutputConnectorEditPart.VISUAL_ID:
			return getXQueryMediatorOutputConnector_3555OutgoingLinks(view);
		case CommandMediatorEditPart.VISUAL_ID:
			return getCommandMediator_3556OutgoingLinks(view);
		case CommandMediatorInputConnectorEditPart.VISUAL_ID:
			return getCommandMediatorInputConnector_3557OutgoingLinks(view);
		case CommandMediatorOutputConnectorEditPart.VISUAL_ID:
			return getCommandMediatorOutputConnector_3558OutgoingLinks(view);
		case DBLookupMediatorEditPart.VISUAL_ID:
			return getDBLookupMediator_3559OutgoingLinks(view);
		case DBLookupMediatorInputConnectorEditPart.VISUAL_ID:
			return getDBLookupMediatorInputConnector_3560OutgoingLinks(view);
		case DBLookupMediatorOutputConnectorEditPart.VISUAL_ID:
			return getDBLookupMediatorOutputConnector_3561OutgoingLinks(view);
		case DBReportMediatorEditPart.VISUAL_ID:
			return getDBReportMediator_3562OutgoingLinks(view);
		case DBReportMediatorInputConnectorEditPart.VISUAL_ID:
			return getDBReportMediatorInputConnector_3563OutgoingLinks(view);
		case DBReportMediatorOutputConnectorEditPart.VISUAL_ID:
			return getDBReportMediatorOutputConnector_3564OutgoingLinks(view);
		case SmooksMediatorEditPart.VISUAL_ID:
			return getSmooksMediator_3565OutgoingLinks(view);
		case SmooksMediatorInputConnectorEditPart.VISUAL_ID:
			return getSmooksMediatorInputConnector_3566OutgoingLinks(view);
		case SmooksMediatorOutputConnectorEditPart.VISUAL_ID:
			return getSmooksMediatorOutputConnector_3567OutgoingLinks(view);
		case SendMediatorEditPart.VISUAL_ID:
			return getSendMediator_3568OutgoingLinks(view);
		case SendMediatorInputConnectorEditPart.VISUAL_ID:
			return getSendMediatorInputConnector_3569OutgoingLinks(view);
		case SendMediatorOutputConnectorEditPart.VISUAL_ID:
			return getSendMediatorOutputConnector_3570OutgoingLinks(view);
		case HeaderMediatorEditPart.VISUAL_ID:
			return getHeaderMediator_3571OutgoingLinks(view);
		case HeaderMediatorInputConnectorEditPart.VISUAL_ID:
			return getHeaderMediatorInputConnector_3572OutgoingLinks(view);
		case HeaderMediatorOutputConnectorEditPart.VISUAL_ID:
			return getHeaderMediatorOutputConnector_3573OutgoingLinks(view);
		case CloneMediatorEditPart.VISUAL_ID:
			return getCloneMediator_3574OutgoingLinks(view);
		case CloneMediatorInputConnectorEditPart.VISUAL_ID:
			return getCloneMediatorInputConnector_3575OutgoingLinks(view);
		case CloneMediatorOutputConnectorEditPart.VISUAL_ID:
			return getCloneMediatorOutputConnector_3576OutgoingLinks(view);
		case CacheMediatorEditPart.VISUAL_ID:
			return getCacheMediator_3577OutgoingLinks(view);
		case CacheMediatorInputConnectorEditPart.VISUAL_ID:
			return getCacheMediatorInputConnector_3578OutgoingLinks(view);
		case CacheMediatorOutputConnectorEditPart.VISUAL_ID:
			return getCacheMediatorOutputConnector_3579OutgoingLinks(view);
		case IterateMediatorEditPart.VISUAL_ID:
			return getIterateMediator_3580OutgoingLinks(view);
		case IterateMediatorInputConnectorEditPart.VISUAL_ID:
			return getIterateMediatorInputConnector_3581OutgoingLinks(view);
		case IterateMediatorOutputConnectorEditPart.VISUAL_ID:
			return getIterateMediatorOutputConnector_3582OutgoingLinks(view);
		case AggregateMediatorEditPart.VISUAL_ID:
			return getAggregateMediator_3583OutgoingLinks(view);
		case AggregateMediatorInputConnectorEditPart.VISUAL_ID:
			return getAggregateMediatorInputConnector_3584OutgoingLinks(view);
		case AggregateMediatorOutputConnectorEditPart.VISUAL_ID:
			return getAggregateMediatorOutputConnector_3585OutgoingLinks(view);
		case AggregateMediatorOnCompleteOutputConnectorEditPart.VISUAL_ID:
			return getAggregateMediatorOnCompleteOutputConnector_3604OutgoingLinks(view);
		case CalloutMediatorEditPart.VISUAL_ID:
			return getCalloutMediator_3586OutgoingLinks(view);
		case CalloutMediatorInputConnectorEditPart.VISUAL_ID:
			return getCalloutMediatorInputConnector_3587OutgoingLinks(view);
		case CalloutMediatorOutputConnectorEditPart.VISUAL_ID:
			return getCalloutMediatorOutputConnector_3588OutgoingLinks(view);
		case TransactionMediatorEditPart.VISUAL_ID:
			return getTransactionMediator_3589OutgoingLinks(view);
		case TransactionMediatorInputConnectorEditPart.VISUAL_ID:
			return getTransactionMediatorInputConnector_3590OutgoingLinks(view);
		case TransactionMediatorOutputConnectorEditPart.VISUAL_ID:
			return getTransactionMediatorOutputConnector_3591OutgoingLinks(view);
		case ThrottleMediatorEditPart.VISUAL_ID:
			return getThrottleMediator_3592OutgoingLinks(view);
		case ThrottleMediatorInputConnectorEditPart.VISUAL_ID:
			return getThrottleMediatorInputConnector_3593OutgoingLinks(view);
		case ThrottleMediatorOutputConnectorEditPart.VISUAL_ID:
			return getThrottleMediatorOutputConnector_3594OutgoingLinks(view);
		case RMSequenceMediatorEditPart.VISUAL_ID:
			return getRMSequenceMediator_3595OutgoingLinks(view);
		case RMSequenceMediatorInputConnectorEditPart.VISUAL_ID:
			return getRMSequenceMediatorInputConnector_3596OutgoingLinks(view);
		case RMSequenceMediatorOutputConnectorEditPart.VISUAL_ID:
			return getRMSequenceMediatorOutputConnector_3597OutgoingLinks(view);
		case RuleMediatorEditPart.VISUAL_ID:
			return getRuleMediator_3598OutgoingLinks(view);
		case RuleMediatorInputConnectorEditPart.VISUAL_ID:
			return getRuleMediatorInputConnector_3599OutgoingLinks(view);
		case RuleMediatorOutputConnectorEditPart.VISUAL_ID:
			return getRuleMediatorOutputConnector_3600OutgoingLinks(view);
		case OAuthMediatorEditPart.VISUAL_ID:
			return getOAuthMediator_3601OutgoingLinks(view);
		case OAuthMediatorInputConnectorEditPart.VISUAL_ID:
			return getOAuthMediatorInputConnector_3602OutgoingLinks(view);
		case OAuthMediatorOutputConnectorEditPart.VISUAL_ID:
			return getOAuthMediatorOutputConnector_3603OutgoingLinks(view);
		case EsbLinkEditPart.VISUAL_ID:
			return getEsbLink_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSequenceDiagram_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getEsbSequence_2501ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getLogMediator_3501ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getLogMediatorInputConnector_3502ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getLogMediatorOutputConnector_3503ContainedLinks(
			View view) {
		LogMediatorOutputConnector modelElement = (LogMediatorOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getPropertyMediator_3512ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getPropertyMediatorInputConnector_3513ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getPropertyMediatorOutputConnector_3514ContainedLinks(
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
	public static List<EsbLinkDescriptor> getEsbSequenceInputConnector_3517ContainedLinks(
			View view) {
		EsbSequenceInputConnector modelElement = (EsbSequenceInputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getEsbSequenceOutputConnector_3518ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getDropMediator_3519ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getDropMediatorInputConnector_3520ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getEnrichMediator_3521ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getEnrichMediatorInputConnector_3522ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getEnrichMediatorOutputConnector_3523ContainedLinks(
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
	public static List<EsbLinkDescriptor> getFilterMediator_3524ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getFilterMediatorInputConnector_3525ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getFilterMediatorPassOutputConnector_3526ContainedLinks(
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
	public static List<EsbLinkDescriptor> getFilterMediatorFailOutputConnector_3527ContainedLinks(
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
	public static List<EsbLinkDescriptor> getXSLTMediator_3528ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getXSLTMediatorInputConnector_3529ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getXSLTMediatorOutputConnector_3530ContainedLinks(
			View view) {
		XSLTMediatorOutputConnector modelElement = (XSLTMediatorOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getEventMediator_3531ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getEventMediatorInputConnector_3532ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getEventMediatorOutputConnector_3533ContainedLinks(
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
	public static List<EsbLinkDescriptor> getEntitlementMediator_3534ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getEntitlementMediatorInputConnector_3535ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getEntitlementMediatorOutputConnector_3536ContainedLinks(
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
	public static List<EsbLinkDescriptor> getSwitchMediator_3537ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSwitchMediatorInputConnector_3538ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSwitchCaseBranchOutputConnector_3539ContainedLinks(
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
	public static List<EsbLinkDescriptor> getSwitchDefaultBranchOutputConnector_3540ContainedLinks(
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
	public static List<EsbLinkDescriptor> getClassMediator_3541ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getClassMediatorInputConnector_3542ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getClassMediatorOutputConnector_3543ContainedLinks(
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
	public static List<EsbLinkDescriptor> getSpringMediator_3544ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSpringMediatorInputConnector_3545ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSpringMediatorOutputConnector_3546ContainedLinks(
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
	public static List<EsbLinkDescriptor> getScriptMediator_3547ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getScriptMediatorInputConnector_3548ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getScriptMediatorOutputConnector_3549ContainedLinks(
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
	public static List<EsbLinkDescriptor> getFaultMediator_3550ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getFaultMediatorInputConnector_3551ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getFaultMediatorOutputConnector_3552ContainedLinks(
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
	public static List<EsbLinkDescriptor> getXQueryMediator_3553ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getXQueryMediatorInputConnector_3554ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getXQueryMediatorOutputConnector_3555ContainedLinks(
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
	public static List<EsbLinkDescriptor> getCommandMediator_3556ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCommandMediatorInputConnector_3557ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCommandMediatorOutputConnector_3558ContainedLinks(
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
	public static List<EsbLinkDescriptor> getDBLookupMediator_3559ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getDBLookupMediatorInputConnector_3560ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getDBLookupMediatorOutputConnector_3561ContainedLinks(
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
	public static List<EsbLinkDescriptor> getDBReportMediator_3562ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getDBReportMediatorInputConnector_3563ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getDBReportMediatorOutputConnector_3564ContainedLinks(
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
	public static List<EsbLinkDescriptor> getSmooksMediator_3565ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSmooksMediatorInputConnector_3566ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSmooksMediatorOutputConnector_3567ContainedLinks(
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
	public static List<EsbLinkDescriptor> getSendMediator_3568ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSendMediatorInputConnector_3569ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSendMediatorOutputConnector_3570ContainedLinks(
			View view) {
		SendMediatorOutputConnector modelElement = (SendMediatorOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getHeaderMediator_3571ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getHeaderMediatorInputConnector_3572ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getHeaderMediatorOutputConnector_3573ContainedLinks(
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
	public static List<EsbLinkDescriptor> getCloneMediator_3574ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCloneMediatorInputConnector_3575ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCloneMediatorOutputConnector_3576ContainedLinks(
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
	public static List<EsbLinkDescriptor> getCacheMediator_3577ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCacheMediatorInputConnector_3578ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCacheMediatorOutputConnector_3579ContainedLinks(
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
	public static List<EsbLinkDescriptor> getIterateMediator_3580ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getIterateMediatorInputConnector_3581ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getIterateMediatorOutputConnector_3582ContainedLinks(
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
	public static List<EsbLinkDescriptor> getAggregateMediator_3583ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getAggregateMediatorInputConnector_3584ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getAggregateMediatorOutputConnector_3585ContainedLinks(
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
	public static List<EsbLinkDescriptor> getAggregateMediatorOnCompleteOutputConnector_3604ContainedLinks(
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
	public static List<EsbLinkDescriptor> getCalloutMediator_3586ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCalloutMediatorInputConnector_3587ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCalloutMediatorOutputConnector_3588ContainedLinks(
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
	public static List<EsbLinkDescriptor> getTransactionMediator_3589ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getTransactionMediatorInputConnector_3590ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getTransactionMediatorOutputConnector_3591ContainedLinks(
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
	public static List<EsbLinkDescriptor> getThrottleMediator_3592ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getThrottleMediatorInputConnector_3593ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getThrottleMediatorOutputConnector_3594ContainedLinks(
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
	public static List<EsbLinkDescriptor> getRMSequenceMediator_3595ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getRMSequenceMediatorInputConnector_3596ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getRMSequenceMediatorOutputConnector_3597ContainedLinks(
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
	public static List<EsbLinkDescriptor> getRuleMediator_3598ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getRuleMediatorInputConnector_3599ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getRuleMediatorOutputConnector_3600ContainedLinks(
			View view) {
		RuleMediatorOutputConnector modelElement = (RuleMediatorOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getOAuthMediator_3601ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getOAuthMediatorInputConnector_3602ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getOAuthMediatorOutputConnector_3603ContainedLinks(
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
	public static List<EsbLinkDescriptor> getEsbLink_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getEsbSequence_2501IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getLogMediator_3501IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getLogMediatorInputConnector_3502IncomingLinks(
			View view) {
		LogMediatorInputConnector modelElement = (LogMediatorInputConnector) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getLogMediatorOutputConnector_3503IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getPropertyMediator_3512IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getPropertyMediatorInputConnector_3513IncomingLinks(
			View view) {
		PropertyMediatorInputConnector modelElement = (PropertyMediatorInputConnector) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getPropertyMediatorOutputConnector_3514IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getEsbSequenceInputConnector_3517IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getEsbSequenceOutputConnector_3518IncomingLinks(
			View view) {
		EsbSequenceOutputConnector modelElement = (EsbSequenceOutputConnector) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getDropMediator_3519IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getDropMediatorInputConnector_3520IncomingLinks(
			View view) {
		DropMediatorInputConnector modelElement = (DropMediatorInputConnector) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getEnrichMediator_3521IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getEnrichMediatorInputConnector_3522IncomingLinks(
			View view) {
		EnrichMediatorInputConnector modelElement = (EnrichMediatorInputConnector) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getEnrichMediatorOutputConnector_3523IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getFilterMediator_3524IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getFilterMediatorInputConnector_3525IncomingLinks(
			View view) {
		FilterMediatorInputConnector modelElement = (FilterMediatorInputConnector) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getFilterMediatorPassOutputConnector_3526IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getFilterMediatorFailOutputConnector_3527IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getXSLTMediator_3528IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getXSLTMediatorInputConnector_3529IncomingLinks(
			View view) {
		XSLTMediatorInputConnector modelElement = (XSLTMediatorInputConnector) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getXSLTMediatorOutputConnector_3530IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getEventMediator_3531IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getEventMediatorInputConnector_3532IncomingLinks(
			View view) {
		EventMediatorInputConnector modelElement = (EventMediatorInputConnector) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getEventMediatorOutputConnector_3533IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getEntitlementMediator_3534IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getEntitlementMediatorInputConnector_3535IncomingLinks(
			View view) {
		EntitlementMediatorInputConnector modelElement = (EntitlementMediatorInputConnector) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getEntitlementMediatorOutputConnector_3536IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSwitchMediator_3537IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSwitchMediatorInputConnector_3538IncomingLinks(
			View view) {
		SwitchMediatorInputConnector modelElement = (SwitchMediatorInputConnector) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSwitchCaseBranchOutputConnector_3539IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSwitchDefaultBranchOutputConnector_3540IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getClassMediator_3541IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getClassMediatorInputConnector_3542IncomingLinks(
			View view) {
		ClassMediatorInputConnector modelElement = (ClassMediatorInputConnector) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getClassMediatorOutputConnector_3543IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSpringMediator_3544IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSpringMediatorInputConnector_3545IncomingLinks(
			View view) {
		SpringMediatorInputConnector modelElement = (SpringMediatorInputConnector) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSpringMediatorOutputConnector_3546IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getScriptMediator_3547IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getScriptMediatorInputConnector_3548IncomingLinks(
			View view) {
		ScriptMediatorInputConnector modelElement = (ScriptMediatorInputConnector) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getScriptMediatorOutputConnector_3549IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getFaultMediator_3550IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getFaultMediatorInputConnector_3551IncomingLinks(
			View view) {
		FaultMediatorInputConnector modelElement = (FaultMediatorInputConnector) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getFaultMediatorOutputConnector_3552IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getXQueryMediator_3553IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getXQueryMediatorInputConnector_3554IncomingLinks(
			View view) {
		XQueryMediatorInputConnector modelElement = (XQueryMediatorInputConnector) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getXQueryMediatorOutputConnector_3555IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCommandMediator_3556IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCommandMediatorInputConnector_3557IncomingLinks(
			View view) {
		CommandMediatorInputConnector modelElement = (CommandMediatorInputConnector) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCommandMediatorOutputConnector_3558IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getDBLookupMediator_3559IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getDBLookupMediatorInputConnector_3560IncomingLinks(
			View view) {
		DBLookupMediatorInputConnector modelElement = (DBLookupMediatorInputConnector) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getDBLookupMediatorOutputConnector_3561IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getDBReportMediator_3562IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getDBReportMediatorInputConnector_3563IncomingLinks(
			View view) {
		DBReportMediatorInputConnector modelElement = (DBReportMediatorInputConnector) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getDBReportMediatorOutputConnector_3564IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSmooksMediator_3565IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSmooksMediatorInputConnector_3566IncomingLinks(
			View view) {
		SmooksMediatorInputConnector modelElement = (SmooksMediatorInputConnector) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSmooksMediatorOutputConnector_3567IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSendMediator_3568IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSendMediatorInputConnector_3569IncomingLinks(
			View view) {
		SendMediatorInputConnector modelElement = (SendMediatorInputConnector) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSendMediatorOutputConnector_3570IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getHeaderMediator_3571IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getHeaderMediatorInputConnector_3572IncomingLinks(
			View view) {
		HeaderMediatorInputConnector modelElement = (HeaderMediatorInputConnector) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getHeaderMediatorOutputConnector_3573IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCloneMediator_3574IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCloneMediatorInputConnector_3575IncomingLinks(
			View view) {
		CloneMediatorInputConnector modelElement = (CloneMediatorInputConnector) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCloneMediatorOutputConnector_3576IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCacheMediator_3577IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCacheMediatorInputConnector_3578IncomingLinks(
			View view) {
		CacheMediatorInputConnector modelElement = (CacheMediatorInputConnector) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCacheMediatorOutputConnector_3579IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getIterateMediator_3580IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getIterateMediatorInputConnector_3581IncomingLinks(
			View view) {
		IterateMediatorInputConnector modelElement = (IterateMediatorInputConnector) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getIterateMediatorOutputConnector_3582IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getAggregateMediator_3583IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getAggregateMediatorInputConnector_3584IncomingLinks(
			View view) {
		AggregateMediatorInputConnector modelElement = (AggregateMediatorInputConnector) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getAggregateMediatorOutputConnector_3585IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getAggregateMediatorOnCompleteOutputConnector_3604IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCalloutMediator_3586IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCalloutMediatorInputConnector_3587IncomingLinks(
			View view) {
		CalloutMediatorInputConnector modelElement = (CalloutMediatorInputConnector) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCalloutMediatorOutputConnector_3588IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getTransactionMediator_3589IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getTransactionMediatorInputConnector_3590IncomingLinks(
			View view) {
		TransactionMediatorInputConnector modelElement = (TransactionMediatorInputConnector) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getTransactionMediatorOutputConnector_3591IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getThrottleMediator_3592IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getThrottleMediatorInputConnector_3593IncomingLinks(
			View view) {
		ThrottleMediatorInputConnector modelElement = (ThrottleMediatorInputConnector) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getThrottleMediatorOutputConnector_3594IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getRMSequenceMediator_3595IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getRMSequenceMediatorInputConnector_3596IncomingLinks(
			View view) {
		RMSequenceMediatorInputConnector modelElement = (RMSequenceMediatorInputConnector) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getRMSequenceMediatorOutputConnector_3597IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getRuleMediator_3598IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getRuleMediatorInputConnector_3599IncomingLinks(
			View view) {
		RuleMediatorInputConnector modelElement = (RuleMediatorInputConnector) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getRuleMediatorOutputConnector_3600IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getOAuthMediator_3601IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getOAuthMediatorInputConnector_3602IncomingLinks(
			View view) {
		OAuthMediatorInputConnector modelElement = (OAuthMediatorInputConnector) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getOAuthMediatorOutputConnector_3603IncomingLinks(
			View view) {
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
	public static List<EsbLinkDescriptor> getEsbSequence_2501OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getLogMediator_3501OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getLogMediatorInputConnector_3502OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getLogMediatorOutputConnector_3503OutgoingLinks(
			View view) {
		LogMediatorOutputConnector modelElement = (LogMediatorOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getPropertyMediator_3512OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getPropertyMediatorInputConnector_3513OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getPropertyMediatorOutputConnector_3514OutgoingLinks(
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
	public static List<EsbLinkDescriptor> getEsbSequenceInputConnector_3517OutgoingLinks(
			View view) {
		EsbSequenceInputConnector modelElement = (EsbSequenceInputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getEsbSequenceOutputConnector_3518OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getDropMediator_3519OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getDropMediatorInputConnector_3520OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getEnrichMediator_3521OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getEnrichMediatorInputConnector_3522OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getEnrichMediatorOutputConnector_3523OutgoingLinks(
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
	public static List<EsbLinkDescriptor> getFilterMediator_3524OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getFilterMediatorInputConnector_3525OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getFilterMediatorPassOutputConnector_3526OutgoingLinks(
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
	public static List<EsbLinkDescriptor> getFilterMediatorFailOutputConnector_3527OutgoingLinks(
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
	public static List<EsbLinkDescriptor> getXSLTMediator_3528OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getXSLTMediatorInputConnector_3529OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getXSLTMediatorOutputConnector_3530OutgoingLinks(
			View view) {
		XSLTMediatorOutputConnector modelElement = (XSLTMediatorOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getEventMediator_3531OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getEventMediatorInputConnector_3532OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getEventMediatorOutputConnector_3533OutgoingLinks(
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
	public static List<EsbLinkDescriptor> getEntitlementMediator_3534OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getEntitlementMediatorInputConnector_3535OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getEntitlementMediatorOutputConnector_3536OutgoingLinks(
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
	public static List<EsbLinkDescriptor> getSwitchMediator_3537OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSwitchMediatorInputConnector_3538OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSwitchCaseBranchOutputConnector_3539OutgoingLinks(
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
	public static List<EsbLinkDescriptor> getSwitchDefaultBranchOutputConnector_3540OutgoingLinks(
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
	public static List<EsbLinkDescriptor> getClassMediator_3541OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getClassMediatorInputConnector_3542OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getClassMediatorOutputConnector_3543OutgoingLinks(
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
	public static List<EsbLinkDescriptor> getSpringMediator_3544OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSpringMediatorInputConnector_3545OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSpringMediatorOutputConnector_3546OutgoingLinks(
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
	public static List<EsbLinkDescriptor> getScriptMediator_3547OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getScriptMediatorInputConnector_3548OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getScriptMediatorOutputConnector_3549OutgoingLinks(
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
	public static List<EsbLinkDescriptor> getFaultMediator_3550OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getFaultMediatorInputConnector_3551OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getFaultMediatorOutputConnector_3552OutgoingLinks(
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
	public static List<EsbLinkDescriptor> getXQueryMediator_3553OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getXQueryMediatorInputConnector_3554OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getXQueryMediatorOutputConnector_3555OutgoingLinks(
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
	public static List<EsbLinkDescriptor> getCommandMediator_3556OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCommandMediatorInputConnector_3557OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCommandMediatorOutputConnector_3558OutgoingLinks(
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
	public static List<EsbLinkDescriptor> getDBLookupMediator_3559OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getDBLookupMediatorInputConnector_3560OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getDBLookupMediatorOutputConnector_3561OutgoingLinks(
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
	public static List<EsbLinkDescriptor> getDBReportMediator_3562OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getDBReportMediatorInputConnector_3563OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getDBReportMediatorOutputConnector_3564OutgoingLinks(
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
	public static List<EsbLinkDescriptor> getSmooksMediator_3565OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSmooksMediatorInputConnector_3566OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSmooksMediatorOutputConnector_3567OutgoingLinks(
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
	public static List<EsbLinkDescriptor> getSendMediator_3568OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSendMediatorInputConnector_3569OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSendMediatorOutputConnector_3570OutgoingLinks(
			View view) {
		SendMediatorOutputConnector modelElement = (SendMediatorOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getHeaderMediator_3571OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getHeaderMediatorInputConnector_3572OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getHeaderMediatorOutputConnector_3573OutgoingLinks(
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
	public static List<EsbLinkDescriptor> getCloneMediator_3574OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCloneMediatorInputConnector_3575OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCloneMediatorOutputConnector_3576OutgoingLinks(
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
	public static List<EsbLinkDescriptor> getCacheMediator_3577OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCacheMediatorInputConnector_3578OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCacheMediatorOutputConnector_3579OutgoingLinks(
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
	public static List<EsbLinkDescriptor> getIterateMediator_3580OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getIterateMediatorInputConnector_3581OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getIterateMediatorOutputConnector_3582OutgoingLinks(
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
	public static List<EsbLinkDescriptor> getAggregateMediator_3583OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getAggregateMediatorInputConnector_3584OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getAggregateMediatorOutputConnector_3585OutgoingLinks(
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
	public static List<EsbLinkDescriptor> getAggregateMediatorOnCompleteOutputConnector_3604OutgoingLinks(
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
	public static List<EsbLinkDescriptor> getCalloutMediator_3586OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCalloutMediatorInputConnector_3587OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCalloutMediatorOutputConnector_3588OutgoingLinks(
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
	public static List<EsbLinkDescriptor> getTransactionMediator_3589OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getTransactionMediatorInputConnector_3590OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getTransactionMediatorOutputConnector_3591OutgoingLinks(
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
	public static List<EsbLinkDescriptor> getThrottleMediator_3592OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getThrottleMediatorInputConnector_3593OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getThrottleMediatorOutputConnector_3594OutgoingLinks(
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
	public static List<EsbLinkDescriptor> getRMSequenceMediator_3595OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getRMSequenceMediatorInputConnector_3596OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getRMSequenceMediatorOutputConnector_3597OutgoingLinks(
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
	public static List<EsbLinkDescriptor> getRuleMediator_3598OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getRuleMediatorInputConnector_3599OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getRuleMediatorOutputConnector_3600OutgoingLinks(
			View view) {
		RuleMediatorOutputConnector modelElement = (RuleMediatorOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getOAuthMediator_3601OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getOAuthMediatorInputConnector_3602OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getOAuthMediatorOutputConnector_3603OutgoingLinks(
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
	private static Collection<EsbLinkDescriptor> getIncomingTypeModelFacetLinks_EsbLink_4001(
			InputConnector target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
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
