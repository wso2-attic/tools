package org.wso2.carbonstudio.eclipse.gmf.esb.diagram.part;

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
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.*;
import org.wso2.carbonstudio.eclipse.gmf.esb.AddressEndPoint;
import org.wso2.carbonstudio.eclipse.gmf.esb.AddressEndPointInputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.AddressEndPointOutputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.ClassMediator;
import org.wso2.carbonstudio.eclipse.gmf.esb.ClassMediatorInputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.ClassMediatorOutputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.CommandMediator;
import org.wso2.carbonstudio.eclipse.gmf.esb.CommandMediatorInputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.CommandMediatorOutputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.DBLookupMediator;
import org.wso2.carbonstudio.eclipse.gmf.esb.DBLookupMediatorInputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.DBLookupMediatorOutputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.DBReportMediator;
import org.wso2.carbonstudio.eclipse.gmf.esb.DBReportMediatorInputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.DBReportMediatorOutputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.DefaultEndPoint;
import org.wso2.carbonstudio.eclipse.gmf.esb.DefaultEndPointInputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.DefaultEndPointOutputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.DropMediator;
import org.wso2.carbonstudio.eclipse.gmf.esb.DropMediatorInputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.EnrichMediator;
import org.wso2.carbonstudio.eclipse.gmf.esb.EnrichMediatorInputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.EnrichMediatorOutputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.EntitlementMediator;
import org.wso2.carbonstudio.eclipse.gmf.esb.EntitlementMediatorInputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.EntitlementMediatorOutputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.EsbDiagram;
import org.wso2.carbonstudio.eclipse.gmf.esb.EsbElement;
import org.wso2.carbonstudio.eclipse.gmf.esb.EsbLink;
import org.wso2.carbonstudio.eclipse.gmf.esb.EsbNode;
import org.wso2.carbonstudio.eclipse.gmf.esb.EsbPackage;
import org.wso2.carbonstudio.eclipse.gmf.esb.EsbServer;
import org.wso2.carbonstudio.eclipse.gmf.esb.EventMediator;
import org.wso2.carbonstudio.eclipse.gmf.esb.EventMediatorInputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.EventMediatorOutputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.FailoverEndPoint;
import org.wso2.carbonstudio.eclipse.gmf.esb.FailoverEndPointInputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.FailoverEndPointOutputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.FailoverEndPointWestOutputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.FaultMediator;
import org.wso2.carbonstudio.eclipse.gmf.esb.FaultMediatorInputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.FaultMediatorOutputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.FilterMediator;
import org.wso2.carbonstudio.eclipse.gmf.esb.FilterMediatorFailOutputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.FilterMediatorInputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.FilterMediatorPassOutputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.InputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.LoadBalanceEndPoint;
import org.wso2.carbonstudio.eclipse.gmf.esb.LoadBalanceEndPointInputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.LoadBalanceEndPointOutputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.LoadBalanceEndPointWestOutputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.LogMediator;
import org.wso2.carbonstudio.eclipse.gmf.esb.LogMediatorInputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.LogMediatorOutputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.Mediator;
import org.wso2.carbonstudio.eclipse.gmf.esb.MergeNode;
import org.wso2.carbonstudio.eclipse.gmf.esb.MergeNodeFirstInputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.MergeNodeOutputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.MergeNodeSecondInputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.MessageInputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.MessageMediator;
import org.wso2.carbonstudio.eclipse.gmf.esb.MessageOutputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.OutputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.PropertyMediator;
import org.wso2.carbonstudio.eclipse.gmf.esb.PropertyMediatorInputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.PropertyMediatorOutputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.ProxyInputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.ProxyOutputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.ProxyService;
import org.wso2.carbonstudio.eclipse.gmf.esb.ScriptMediator;
import org.wso2.carbonstudio.eclipse.gmf.esb.ScriptMediatorInputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.ScriptMediatorOutputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.SendMediator;
import org.wso2.carbonstudio.eclipse.gmf.esb.SendMediatorInputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.SendMediatorOutputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.Sequence;
import org.wso2.carbonstudio.eclipse.gmf.esb.SequenceInputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.SequenceOutputConnector;
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
import org.wso2.carbonstudio.eclipse.gmf.esb.WSDLEndPoint;
import org.wso2.carbonstudio.eclipse.gmf.esb.WSDLEndPointInputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.WSDLEndPointOutputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.XQueryMediator;
import org.wso2.carbonstudio.eclipse.gmf.esb.XQueryMediatorInputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.XQueryMediatorOutputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.XSLTMediator;
import org.wso2.carbonstudio.eclipse.gmf.esb.XSLTMediatorInputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.XSLTMediatorOutputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.AddressEndPointEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.AddressEndPointInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.AddressEndPointOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.ClassMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.ClassMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.ClassMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.CloneMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.CloneMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.CloneMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.CommandMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.CommandMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.CommandMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.DBLookupMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.DBLookupMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.DBLookupMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.DBReportMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.DBReportMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.DBReportMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.DefaultEndPointEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.DefaultEndPointInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.DefaultEndPointOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.DropMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.DropMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.EnrichMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.EnrichMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.EnrichMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.EntitlementMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.EntitlementMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.EntitlementMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.EsbDiagramEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.EsbLinkEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.EsbServerContentsCompartmentEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.EsbServerEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.EventMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.EventMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.EventMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.FailoverEndPointEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.FailoverEndPointInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.FailoverEndPointOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.FailoverEndPointWestOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.FaultMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.FaultMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.FaultMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.FilterMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.FilterMediatorFailOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.FilterMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.FilterMediatorPassOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.HeaderMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.HeaderMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.HeaderMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.LoadBalanceEndPointEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.LoadBalanceEndPointInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.LoadBalanceEndPointOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.LoadBalanceEndPointWestOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.LogMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.LogMediatorInputConnectorEditPart;
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
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.ProxyInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.ProxyOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.ProxyServiceEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.ScriptMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.ScriptMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.ScriptMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.SendMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.SendMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.SendMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.SequenceEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.SequenceInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.SequenceOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.SmooksMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.SmooksMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.SmooksMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.SpringMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.SpringMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.SpringMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.SwitchCaseBranchOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.SwitchDefaultBranchOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.SwitchMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.SwitchMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.WSDLEndPointEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.WSDLEndPointInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.WSDLEndPointOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.XQueryMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.XQueryMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.XQueryMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.XSLTMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.XSLTMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.XSLTMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.providers.EsbElementTypes;

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
		case MessageMediatorEditPart.VISUAL_ID:
			return getMessageMediator_3045SemanticChildren(view);
		case DefaultEndPointEditPart.VISUAL_ID:
			return getDefaultEndPoint_3020SemanticChildren(view);
		case AddressEndPointEditPart.VISUAL_ID:
			return getAddressEndPoint_3029SemanticChildren(view);
		case DropMediatorEditPart.VISUAL_ID:
			return getDropMediator_3007SemanticChildren(view);
		case FilterMediatorEditPart.VISUAL_ID:
			return getFilterMediator_3009SemanticChildren(view);
		case MergeNodeEditPart.VISUAL_ID:
			return getMergeNode_3013SemanticChildren(view);
		case LogMediatorEditPart.VISUAL_ID:
			return getLogMediator_3017SemanticChildren(view);
		case PropertyMediatorEditPart.VISUAL_ID:
			return getPropertyMediator_3032SemanticChildren(view);
		case EnrichMediatorEditPart.VISUAL_ID:
			return getEnrichMediator_3035SemanticChildren(view);
		case XSLTMediatorEditPart.VISUAL_ID:
			return getXSLTMediator_3038SemanticChildren(view);
		case SwitchMediatorEditPart.VISUAL_ID:
			return getSwitchMediator_3041SemanticChildren(view);
		case SequenceEditPart.VISUAL_ID:
			return getSequence_3048SemanticChildren(view);
		case EventMediatorEditPart.VISUAL_ID:
			return getEventMediator_3051SemanticChildren(view);
		case EntitlementMediatorEditPart.VISUAL_ID:
			return getEntitlementMediator_3054SemanticChildren(view);
		case ClassMediatorEditPart.VISUAL_ID:
			return getClassMediator_3057SemanticChildren(view);
		case SpringMediatorEditPart.VISUAL_ID:
			return getSpringMediator_3060SemanticChildren(view);
		case ScriptMediatorEditPart.VISUAL_ID:
			return getScriptMediator_3063SemanticChildren(view);
		case FaultMediatorEditPart.VISUAL_ID:
			return getFaultMediator_3066SemanticChildren(view);
		case XQueryMediatorEditPart.VISUAL_ID:
			return getXQueryMediator_3069SemanticChildren(view);
		case CommandMediatorEditPart.VISUAL_ID:
			return getCommandMediator_3072SemanticChildren(view);
		case DBLookupMediatorEditPart.VISUAL_ID:
			return getDBLookupMediator_3075SemanticChildren(view);
		case DBReportMediatorEditPart.VISUAL_ID:
			return getDBReportMediator_3078SemanticChildren(view);
		case SmooksMediatorEditPart.VISUAL_ID:
			return getSmooksMediator_3081SemanticChildren(view);
		case SendMediatorEditPart.VISUAL_ID:
			return getSendMediator_3084SemanticChildren(view);
		case FailoverEndPointEditPart.VISUAL_ID:
			return getFailoverEndPoint_3087SemanticChildren(view);
		case WSDLEndPointEditPart.VISUAL_ID:
			return getWSDLEndPoint_3091SemanticChildren(view);
		case LoadBalanceEndPointEditPart.VISUAL_ID:
			return getLoadBalanceEndPoint_3094SemanticChildren(view);
		case HeaderMediatorEditPart.VISUAL_ID:
			return getHeaderMediator_3099SemanticChildren(view);
		case CloneMediatorEditPart.VISUAL_ID:
			return getCloneMediator_3102SemanticChildren(view);
		case CacheMediatorEditPart.VISUAL_ID:
			return getCacheMediator_3105SemanticChildren(view);
		case IterateMediatorEditPart.VISUAL_ID:
			return getIterateMediator_3108SemanticChildren(view);
		case CalloutMediatorEditPart.VISUAL_ID:
			return getCalloutMediator_3114SemanticChildren(view);
		case TransactionMediatorEditPart.VISUAL_ID:
			return getTransactionMediator_3117SemanticChildren(view);
		case ThrottleMediatorEditPart.VISUAL_ID:
			return getThrottleMediator_3120SemanticChildren(view);
		case RMSequenceMediatorEditPart.VISUAL_ID:
			return getRMSequenceMediator_3123SemanticChildren(view);
		case RuleMediatorEditPart.VISUAL_ID:
			return getRuleMediator_3126SemanticChildren(view);
		case OAuthMediatorEditPart.VISUAL_ID:
			return getOAuthMediator_3129SemanticChildren(view);
		case AggregateMediatorEditPart.VISUAL_ID:
			return getAggregateMediator_3111SemanticChildren(view);
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
		case EsbServerContentsCompartmentEditPart.VISUAL_ID:
			return getEsbServerContentsCompartment_7001SemanticChildren(view);
		case AggregateMediatorAggregateCompartmentEditPart.VISUAL_ID:
			return getAggregateMediatorAggregateCompartment_7002SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbNodeDescriptor> getEsbServer_2001SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		EsbServer modelElement = (EsbServer) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
		for (Iterator<?> it = modelElement.getChildren().iterator(); it
				.hasNext();) {
			EsbElement childElement = (EsbElement) it.next();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ProxyServiceEditPart.VISUAL_ID) {
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
			if (visualID == WSDLEndPointEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
		}
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
	public static List<EsbNodeDescriptor> getProxyService_3001SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ProxyService modelElement = (ProxyService) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
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
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbNodeDescriptor> getMessageMediator_3045SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		MessageMediator modelElement = (MessageMediator) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
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
	public static List<EsbNodeDescriptor> getDropMediator_3007SemanticChildren(
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
	public static List<EsbNodeDescriptor> getFilterMediator_3009SemanticChildren(
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
	public static List<EsbNodeDescriptor> getMergeNode_3013SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		MergeNode modelElement = (MergeNode) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
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
	public static List<EsbNodeDescriptor> getLogMediator_3017SemanticChildren(
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
	public static List<EsbNodeDescriptor> getPropertyMediator_3032SemanticChildren(
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
	public static List<EsbNodeDescriptor> getEnrichMediator_3035SemanticChildren(
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
	public static List<EsbNodeDescriptor> getXSLTMediator_3038SemanticChildren(
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
	public static List<EsbNodeDescriptor> getSwitchMediator_3041SemanticChildren(
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
	public static List<EsbNodeDescriptor> getSequence_3048SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Sequence modelElement = (Sequence) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
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
	public static List<EsbNodeDescriptor> getEventMediator_3051SemanticChildren(
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
	public static List<EsbNodeDescriptor> getEntitlementMediator_3054SemanticChildren(
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
	public static List<EsbNodeDescriptor> getClassMediator_3057SemanticChildren(
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
	public static List<EsbNodeDescriptor> getSpringMediator_3060SemanticChildren(
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
	public static List<EsbNodeDescriptor> getScriptMediator_3063SemanticChildren(
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
	public static List<EsbNodeDescriptor> getFaultMediator_3066SemanticChildren(
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
	public static List<EsbNodeDescriptor> getXQueryMediator_3069SemanticChildren(
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
	public static List<EsbNodeDescriptor> getCommandMediator_3072SemanticChildren(
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
	public static List<EsbNodeDescriptor> getDBLookupMediator_3075SemanticChildren(
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
	public static List<EsbNodeDescriptor> getDBReportMediator_3078SemanticChildren(
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
	public static List<EsbNodeDescriptor> getSmooksMediator_3081SemanticChildren(
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
	public static List<EsbNodeDescriptor> getSendMediator_3084SemanticChildren(
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
	public static List<EsbNodeDescriptor> getFailoverEndPoint_3087SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		FailoverEndPoint modelElement = (FailoverEndPoint) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
		{
			FailoverEndPointInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == FailoverEndPointInputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator<?> it = modelElement.getOutputConnector().iterator(); it
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
	public static List<EsbNodeDescriptor> getWSDLEndPoint_3091SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		WSDLEndPoint modelElement = (WSDLEndPoint) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
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
	public static List<EsbNodeDescriptor> getLoadBalanceEndPoint_3094SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		LoadBalanceEndPoint modelElement = (LoadBalanceEndPoint) view
				.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
		{
			LoadBalanceEndPointInputConnector childElement = modelElement
					.getInputConnector();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == LoadBalanceEndPointInputConnectorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator<?> it = modelElement.getOutputConnector().iterator(); it
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
	public static List<EsbNodeDescriptor> getHeaderMediator_3099SemanticChildren(
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
	public static List<EsbNodeDescriptor> getCloneMediator_3102SemanticChildren(
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
		for (Iterator<?> it = modelElement.getTargetsOutputConnector()
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
	public static List<EsbNodeDescriptor> getCacheMediator_3105SemanticChildren(
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
	public static List<EsbNodeDescriptor> getIterateMediator_3108SemanticChildren(
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
	public static List<EsbNodeDescriptor> getAggregateMediator_3111SemanticChildren(
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
	public static List<EsbNodeDescriptor> getLogMediator_3134SemanticChildren(
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
	public static List<EsbNodeDescriptor> getDropMediator_3137SemanticChildren(
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
			if (visualID == DropMediatorInputConnector2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbNodeDescriptor> getFilterMediator_3139SemanticChildren(
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
	public static List<EsbNodeDescriptor> getPropertyMediator_3143SemanticChildren(
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
	public static List<EsbNodeDescriptor> getEnrichMediator_3146SemanticChildren(
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
	public static List<EsbNodeDescriptor> getXSLTMediator_3149SemanticChildren(
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
	public static List<EsbNodeDescriptor> getSwitchMediator_3152SemanticChildren(
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
			if (visualID == SwitchMediatorInputConnector2EditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator<?> it = modelElement.getCaseBranches().iterator(); it
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
	public static List<EsbNodeDescriptor> getFaultMediator_3156SemanticChildren(
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
	public static List<EsbNodeDescriptor> getDBLookupMediator_3159SemanticChildren(
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
	public static List<EsbNodeDescriptor> getDBReportMediator_3162SemanticChildren(
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
	public static List<EsbNodeDescriptor> getSendMediator_3165SemanticChildren(
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
	public static List<EsbNodeDescriptor> getHeaderMediator_3168SemanticChildren(
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
	public static List<EsbNodeDescriptor> getCloneMediator_3171SemanticChildren(
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
		for (Iterator<?> it = modelElement.getTargetsOutputConnector()
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
	public static List<EsbNodeDescriptor> getIterateMediator_3175SemanticChildren(
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
	public static List<EsbNodeDescriptor> getCalloutMediator_3178SemanticChildren(
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
	public static List<EsbNodeDescriptor> getTransactionMediator_3179SemanticChildren(
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
	public static List<EsbNodeDescriptor> getRMSequenceMediator_3180SemanticChildren(
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
	public static List<EsbNodeDescriptor> getSequence_3187SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Sequence modelElement = (Sequence) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
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
	public static List<EsbNodeDescriptor> getCalloutMediator_3114SemanticChildren(
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
	public static List<EsbNodeDescriptor> getTransactionMediator_3117SemanticChildren(
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
	public static List<EsbNodeDescriptor> getThrottleMediator_3120SemanticChildren(
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
	public static List<EsbNodeDescriptor> getRMSequenceMediator_3123SemanticChildren(
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
	public static List<EsbNodeDescriptor> getRuleMediator_3126SemanticChildren(
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
	public static List<EsbNodeDescriptor> getOAuthMediator_3129SemanticChildren(
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
	public static List<EsbNodeDescriptor> getDefaultEndPoint_3020SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		DefaultEndPoint modelElement = (DefaultEndPoint) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
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
	public static List<EsbNodeDescriptor> getAddressEndPoint_3029SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		AddressEndPoint modelElement = (AddressEndPoint) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
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
		for (Iterator<?> it = modelElement.getChildren().iterator(); it
				.hasNext();) {
			EsbElement childElement = (EsbElement) it.next();
			int visualID = EsbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == DropMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FilterMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MergeNodeEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LogMediatorEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PropertyMediatorEditPart.VISUAL_ID) {
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
			if (visualID == FailoverEndPointEditPart.VISUAL_ID) {
				result.add(new EsbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LoadBalanceEndPointEditPart.VISUAL_ID) {
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
	public static List<EsbNodeDescriptor> getAggregateMediatorAggregateCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		AggregateMediator modelElement = (AggregateMediator) containerView
				.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
		for (Iterator<?> it = modelElement.getChildren().iterator(); it
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
	public static List<EsbNodeDescriptor> getEsbDiagram_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		EsbDiagram modelElement = (EsbDiagram) view.getElement();
		LinkedList<EsbNodeDescriptor> result = new LinkedList<EsbNodeDescriptor>();
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
		case MessageMediatorEditPart.VISUAL_ID:
			return getMessageMediator_3045ContainedLinks(view);
		case MessageInputConnectorEditPart.VISUAL_ID:
			return getMessageInputConnector_3046ContainedLinks(view);
		case MessageOutputConnectorEditPart.VISUAL_ID:
			return getMessageOutputConnector_3047ContainedLinks(view);
		case DefaultEndPointEditPart.VISUAL_ID:
			return getDefaultEndPoint_3020ContainedLinks(view);
		case DefaultEndPointInputConnectorEditPart.VISUAL_ID:
			return getDefaultEndPointInputConnector_3021ContainedLinks(view);
		case DefaultEndPointOutputConnectorEditPart.VISUAL_ID:
			return getDefaultEndPointOutputConnector_3022ContainedLinks(view);
		case AddressEndPointEditPart.VISUAL_ID:
			return getAddressEndPoint_3029ContainedLinks(view);
		case AddressEndPointInputConnectorEditPart.VISUAL_ID:
			return getAddressEndPointInputConnector_3030ContainedLinks(view);
		case AddressEndPointOutputConnectorEditPart.VISUAL_ID:
			return getAddressEndPointOutputConnector_3031ContainedLinks(view);
		case DropMediatorEditPart.VISUAL_ID:
			return getDropMediator_3007ContainedLinks(view);
		case DropMediatorInputConnectorEditPart.VISUAL_ID:
			return getDropMediatorInputConnector_3008ContainedLinks(view);
		case FilterMediatorEditPart.VISUAL_ID:
			return getFilterMediator_3009ContainedLinks(view);
		case FilterMediatorInputConnectorEditPart.VISUAL_ID:
			return getFilterMediatorInputConnector_3010ContainedLinks(view);
		case FilterMediatorPassOutputConnectorEditPart.VISUAL_ID:
			return getFilterMediatorPassOutputConnector_3011ContainedLinks(view);
		case FilterMediatorFailOutputConnectorEditPart.VISUAL_ID:
			return getFilterMediatorFailOutputConnector_3012ContainedLinks(view);
		case MergeNodeEditPart.VISUAL_ID:
			return getMergeNode_3013ContainedLinks(view);
		case MergeNodeFirstInputConnectorEditPart.VISUAL_ID:
			return getMergeNodeFirstInputConnector_3014ContainedLinks(view);
		case MergeNodeSecondInputConnectorEditPart.VISUAL_ID:
			return getMergeNodeSecondInputConnector_3015ContainedLinks(view);
		case MergeNodeOutputConnectorEditPart.VISUAL_ID:
			return getMergeNodeOutputConnector_3016ContainedLinks(view);
		case LogMediatorEditPart.VISUAL_ID:
			return getLogMediator_3017ContainedLinks(view);
		case LogMediatorInputConnectorEditPart.VISUAL_ID:
			return getLogMediatorInputConnector_3018ContainedLinks(view);
		case LogMediatorOutputConnectorEditPart.VISUAL_ID:
			return getLogMediatorOutputConnector_3019ContainedLinks(view);
		case PropertyMediatorEditPart.VISUAL_ID:
			return getPropertyMediator_3032ContainedLinks(view);
		case PropertyMediatorInputConnectorEditPart.VISUAL_ID:
			return getPropertyMediatorInputConnector_3033ContainedLinks(view);
		case PropertyMediatorOutputConnectorEditPart.VISUAL_ID:
			return getPropertyMediatorOutputConnector_3034ContainedLinks(view);
		case EnrichMediatorEditPart.VISUAL_ID:
			return getEnrichMediator_3035ContainedLinks(view);
		case EnrichMediatorInputConnectorEditPart.VISUAL_ID:
			return getEnrichMediatorInputConnector_3036ContainedLinks(view);
		case EnrichMediatorOutputConnectorEditPart.VISUAL_ID:
			return getEnrichMediatorOutputConnector_3037ContainedLinks(view);
		case XSLTMediatorEditPart.VISUAL_ID:
			return getXSLTMediator_3038ContainedLinks(view);
		case XSLTMediatorInputConnectorEditPart.VISUAL_ID:
			return getXSLTMediatorInputConnector_3039ContainedLinks(view);
		case XSLTMediatorOutputConnectorEditPart.VISUAL_ID:
			return getXSLTMediatorOutputConnector_3040ContainedLinks(view);
		case SwitchMediatorEditPart.VISUAL_ID:
			return getSwitchMediator_3041ContainedLinks(view);
		case SwitchMediatorInputConnectorEditPart.VISUAL_ID:
			return getSwitchMediatorInputConnector_3042ContainedLinks(view);
		case SwitchCaseBranchOutputConnectorEditPart.VISUAL_ID:
			return getSwitchCaseBranchOutputConnector_3043ContainedLinks(view);
		case SwitchDefaultBranchOutputConnectorEditPart.VISUAL_ID:
			return getSwitchDefaultBranchOutputConnector_3044ContainedLinks(view);
		case SequenceEditPart.VISUAL_ID:
			return getSequence_3048ContainedLinks(view);
		case SequenceInputConnectorEditPart.VISUAL_ID:
			return getSequenceInputConnector_3049ContainedLinks(view);
		case SequenceOutputConnectorEditPart.VISUAL_ID:
			return getSequenceOutputConnector_3050ContainedLinks(view);
		case EventMediatorEditPart.VISUAL_ID:
			return getEventMediator_3051ContainedLinks(view);
		case EventMediatorInputConnectorEditPart.VISUAL_ID:
			return getEventMediatorInputConnector_3052ContainedLinks(view);
		case EventMediatorOutputConnectorEditPart.VISUAL_ID:
			return getEventMediatorOutputConnector_3053ContainedLinks(view);
		case EntitlementMediatorEditPart.VISUAL_ID:
			return getEntitlementMediator_3054ContainedLinks(view);
		case EntitlementMediatorInputConnectorEditPart.VISUAL_ID:
			return getEntitlementMediatorInputConnector_3055ContainedLinks(view);
		case EntitlementMediatorOutputConnectorEditPart.VISUAL_ID:
			return getEntitlementMediatorOutputConnector_3056ContainedLinks(view);
		case ClassMediatorEditPart.VISUAL_ID:
			return getClassMediator_3057ContainedLinks(view);
		case ClassMediatorInputConnectorEditPart.VISUAL_ID:
			return getClassMediatorInputConnector_3058ContainedLinks(view);
		case ClassMediatorOutputConnectorEditPart.VISUAL_ID:
			return getClassMediatorOutputConnector_3059ContainedLinks(view);
		case SpringMediatorEditPart.VISUAL_ID:
			return getSpringMediator_3060ContainedLinks(view);
		case SpringMediatorInputConnectorEditPart.VISUAL_ID:
			return getSpringMediatorInputConnector_3061ContainedLinks(view);
		case SpringMediatorOutputConnectorEditPart.VISUAL_ID:
			return getSpringMediatorOutputConnector_3062ContainedLinks(view);
		case ScriptMediatorEditPart.VISUAL_ID:
			return getScriptMediator_3063ContainedLinks(view);
		case ScriptMediatorInputConnectorEditPart.VISUAL_ID:
			return getScriptMediatorInputConnector_3064ContainedLinks(view);
		case ScriptMediatorOutputConnectorEditPart.VISUAL_ID:
			return getScriptMediatorOutputConnector_3065ContainedLinks(view);
		case FaultMediatorEditPart.VISUAL_ID:
			return getFaultMediator_3066ContainedLinks(view);
		case FaultMediatorInputConnectorEditPart.VISUAL_ID:
			return getFaultMediatorInputConnector_3067ContainedLinks(view);
		case FaultMediatorOutputConnectorEditPart.VISUAL_ID:
			return getFaultMediatorOutputConnector_3068ContainedLinks(view);
		case XQueryMediatorEditPart.VISUAL_ID:
			return getXQueryMediator_3069ContainedLinks(view);
		case XQueryMediatorInputConnectorEditPart.VISUAL_ID:
			return getXQueryMediatorInputConnector_3070ContainedLinks(view);
		case XQueryMediatorOutputConnectorEditPart.VISUAL_ID:
			return getXQueryMediatorOutputConnector_3071ContainedLinks(view);
		case CommandMediatorEditPart.VISUAL_ID:
			return getCommandMediator_3072ContainedLinks(view);
		case CommandMediatorInputConnectorEditPart.VISUAL_ID:
			return getCommandMediatorInputConnector_3073ContainedLinks(view);
		case CommandMediatorOutputConnectorEditPart.VISUAL_ID:
			return getCommandMediatorOutputConnector_3074ContainedLinks(view);
		case DBLookupMediatorEditPart.VISUAL_ID:
			return getDBLookupMediator_3075ContainedLinks(view);
		case DBLookupMediatorInputConnectorEditPart.VISUAL_ID:
			return getDBLookupMediatorInputConnector_3076ContainedLinks(view);
		case DBLookupMediatorOutputConnectorEditPart.VISUAL_ID:
			return getDBLookupMediatorOutputConnector_3077ContainedLinks(view);
		case DBReportMediatorEditPart.VISUAL_ID:
			return getDBReportMediator_3078ContainedLinks(view);
		case DBReportMediatorInputConnectorEditPart.VISUAL_ID:
			return getDBReportMediatorInputConnector_3079ContainedLinks(view);
		case DBReportMediatorOutputConnectorEditPart.VISUAL_ID:
			return getDBReportMediatorOutputConnector_3080ContainedLinks(view);
		case SmooksMediatorEditPart.VISUAL_ID:
			return getSmooksMediator_3081ContainedLinks(view);
		case SmooksMediatorInputConnectorEditPart.VISUAL_ID:
			return getSmooksMediatorInputConnector_3082ContainedLinks(view);
		case SmooksMediatorOutputConnectorEditPart.VISUAL_ID:
			return getSmooksMediatorOutputConnector_3083ContainedLinks(view);
		case SendMediatorEditPart.VISUAL_ID:
			return getSendMediator_3084ContainedLinks(view);
		case SendMediatorInputConnectorEditPart.VISUAL_ID:
			return getSendMediatorInputConnector_3085ContainedLinks(view);
		case SendMediatorOutputConnectorEditPart.VISUAL_ID:
			return getSendMediatorOutputConnector_3086ContainedLinks(view);
		case FailoverEndPointEditPart.VISUAL_ID:
			return getFailoverEndPoint_3087ContainedLinks(view);
		case FailoverEndPointInputConnectorEditPart.VISUAL_ID:
			return getFailoverEndPointInputConnector_3088ContainedLinks(view);
		case FailoverEndPointOutputConnectorEditPart.VISUAL_ID:
			return getFailoverEndPointOutputConnector_3090ContainedLinks(view);
		case FailoverEndPointWestOutputConnectorEditPart.VISUAL_ID:
			return getFailoverEndPointWestOutputConnector_3097ContainedLinks(view);
		case WSDLEndPointEditPart.VISUAL_ID:
			return getWSDLEndPoint_3091ContainedLinks(view);
		case WSDLEndPointInputConnectorEditPart.VISUAL_ID:
			return getWSDLEndPointInputConnector_3092ContainedLinks(view);
		case WSDLEndPointOutputConnectorEditPart.VISUAL_ID:
			return getWSDLEndPointOutputConnector_3093ContainedLinks(view);
		case LoadBalanceEndPointEditPart.VISUAL_ID:
			return getLoadBalanceEndPoint_3094ContainedLinks(view);
		case LoadBalanceEndPointInputConnectorEditPart.VISUAL_ID:
			return getLoadBalanceEndPointInputConnector_3095ContainedLinks(view);
		case LoadBalanceEndPointOutputConnectorEditPart.VISUAL_ID:
			return getLoadBalanceEndPointOutputConnector_3096ContainedLinks(view);
		case LoadBalanceEndPointWestOutputConnectorEditPart.VISUAL_ID:
			return getLoadBalanceEndPointWestOutputConnector_3098ContainedLinks(view);
		case HeaderMediatorEditPart.VISUAL_ID:
			return getHeaderMediator_3099ContainedLinks(view);
		case HeaderMediatorInputConnectorEditPart.VISUAL_ID:
			return getHeaderMediatorInputConnector_3100ContainedLinks(view);
		case HeaderMediatorOutputConnectorEditPart.VISUAL_ID:
			return getHeaderMediatorOutputConnector_3101ContainedLinks(view);
		case CloneMediatorEditPart.VISUAL_ID:
			return getCloneMediator_3102ContainedLinks(view);
		case CloneMediatorInputConnectorEditPart.VISUAL_ID:
			return getCloneMediatorInputConnector_3103ContainedLinks(view);
		case CloneMediatorOutputConnectorEditPart.VISUAL_ID:
			return getCloneMediatorOutputConnector_3104ContainedLinks(view);
		case CloneMediatorTargetOutputConnectorEditPart.VISUAL_ID:
			return getCloneMediatorTargetOutputConnector_3133ContainedLinks(view);
		case CacheMediatorEditPart.VISUAL_ID:
			return getCacheMediator_3105ContainedLinks(view);
		case CacheMediatorInputConnectorEditPart.VISUAL_ID:
			return getCacheMediatorInputConnector_3106ContainedLinks(view);
		case CacheMediatorOutputConnectorEditPart.VISUAL_ID:
			return getCacheMediatorOutputConnector_3107ContainedLinks(view);
		case IterateMediatorEditPart.VISUAL_ID:
			return getIterateMediator_3108ContainedLinks(view);
		case IterateMediatorInputConnectorEditPart.VISUAL_ID:
			return getIterateMediatorInputConnector_3109ContainedLinks(view);
		case IterateMediatorOutputConnectorEditPart.VISUAL_ID:
			return getIterateMediatorOutputConnector_3110ContainedLinks(view);
		case CalloutMediatorEditPart.VISUAL_ID:
			return getCalloutMediator_3114ContainedLinks(view);
		case CalloutMediatorInputConnectorEditPart.VISUAL_ID:
			return getCalloutMediatorInputConnector_3115ContainedLinks(view);
		case CalloutMediatorOutputConnectorEditPart.VISUAL_ID:
			return getCalloutMediatorOutputConnector_3116ContainedLinks(view);
		case TransactionMediatorEditPart.VISUAL_ID:
			return getTransactionMediator_3117ContainedLinks(view);
		case TransactionMediatorInputConnectorEditPart.VISUAL_ID:
			return getTransactionMediatorInputConnector_3118ContainedLinks(view);
		case TransactionMediatorOutputConnectorEditPart.VISUAL_ID:
			return getTransactionMediatorOutputConnector_3119ContainedLinks(view);
		case ThrottleMediatorEditPart.VISUAL_ID:
			return getThrottleMediator_3120ContainedLinks(view);
		case ThrottleMediatorInputConnectorEditPart.VISUAL_ID:
			return getThrottleMediatorInputConnector_3121ContainedLinks(view);
		case ThrottleMediatorOutputConnectorEditPart.VISUAL_ID:
			return getThrottleMediatorOutputConnector_3122ContainedLinks(view);
		case RMSequenceMediatorEditPart.VISUAL_ID:
			return getRMSequenceMediator_3123ContainedLinks(view);
		case RMSequenceMediatorInputConnectorEditPart.VISUAL_ID:
			return getRMSequenceMediatorInputConnector_3124ContainedLinks(view);
		case RMSequenceMediatorOutputConnectorEditPart.VISUAL_ID:
			return getRMSequenceMediatorOutputConnector_3125ContainedLinks(view);
		case RuleMediatorEditPart.VISUAL_ID:
			return getRuleMediator_3126ContainedLinks(view);
		case RuleMediatorInputConnectorEditPart.VISUAL_ID:
			return getRuleMediatorInputConnector_3127ContainedLinks(view);
		case RuleMediatorOutputConnectorEditPart.VISUAL_ID:
			return getRuleMediatorOutputConnector_3128ContainedLinks(view);
		case OAuthMediatorEditPart.VISUAL_ID:
			return getOAuthMediator_3129ContainedLinks(view);
		case OAuthMediatorInputConnectorEditPart.VISUAL_ID:
			return getOAuthMediatorInputConnector_3130ContainedLinks(view);
		case OAuthMediatorOutputConnectorEditPart.VISUAL_ID:
			return getOAuthMediatorOutputConnector_3131ContainedLinks(view);
		case AggregateMediatorEditPart.VISUAL_ID:
			return getAggregateMediator_3111ContainedLinks(view);
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
		case MessageMediatorEditPart.VISUAL_ID:
			return getMessageMediator_3045IncomingLinks(view);
		case MessageInputConnectorEditPart.VISUAL_ID:
			return getMessageInputConnector_3046IncomingLinks(view);
		case MessageOutputConnectorEditPart.VISUAL_ID:
			return getMessageOutputConnector_3047IncomingLinks(view);
		case DefaultEndPointEditPart.VISUAL_ID:
			return getDefaultEndPoint_3020IncomingLinks(view);
		case DefaultEndPointInputConnectorEditPart.VISUAL_ID:
			return getDefaultEndPointInputConnector_3021IncomingLinks(view);
		case DefaultEndPointOutputConnectorEditPart.VISUAL_ID:
			return getDefaultEndPointOutputConnector_3022IncomingLinks(view);
		case AddressEndPointEditPart.VISUAL_ID:
			return getAddressEndPoint_3029IncomingLinks(view);
		case AddressEndPointInputConnectorEditPart.VISUAL_ID:
			return getAddressEndPointInputConnector_3030IncomingLinks(view);
		case AddressEndPointOutputConnectorEditPart.VISUAL_ID:
			return getAddressEndPointOutputConnector_3031IncomingLinks(view);
		case DropMediatorEditPart.VISUAL_ID:
			return getDropMediator_3007IncomingLinks(view);
		case DropMediatorInputConnectorEditPart.VISUAL_ID:
			return getDropMediatorInputConnector_3008IncomingLinks(view);
		case FilterMediatorEditPart.VISUAL_ID:
			return getFilterMediator_3009IncomingLinks(view);
		case FilterMediatorInputConnectorEditPart.VISUAL_ID:
			return getFilterMediatorInputConnector_3010IncomingLinks(view);
		case FilterMediatorPassOutputConnectorEditPart.VISUAL_ID:
			return getFilterMediatorPassOutputConnector_3011IncomingLinks(view);
		case FilterMediatorFailOutputConnectorEditPart.VISUAL_ID:
			return getFilterMediatorFailOutputConnector_3012IncomingLinks(view);
		case MergeNodeEditPart.VISUAL_ID:
			return getMergeNode_3013IncomingLinks(view);
		case MergeNodeFirstInputConnectorEditPart.VISUAL_ID:
			return getMergeNodeFirstInputConnector_3014IncomingLinks(view);
		case MergeNodeSecondInputConnectorEditPart.VISUAL_ID:
			return getMergeNodeSecondInputConnector_3015IncomingLinks(view);
		case MergeNodeOutputConnectorEditPart.VISUAL_ID:
			return getMergeNodeOutputConnector_3016IncomingLinks(view);
		case LogMediatorEditPart.VISUAL_ID:
			return getLogMediator_3017IncomingLinks(view);
		case LogMediatorInputConnectorEditPart.VISUAL_ID:
			return getLogMediatorInputConnector_3018IncomingLinks(view);
		case LogMediatorOutputConnectorEditPart.VISUAL_ID:
			return getLogMediatorOutputConnector_3019IncomingLinks(view);
		case PropertyMediatorEditPart.VISUAL_ID:
			return getPropertyMediator_3032IncomingLinks(view);
		case PropertyMediatorInputConnectorEditPart.VISUAL_ID:
			return getPropertyMediatorInputConnector_3033IncomingLinks(view);
		case PropertyMediatorOutputConnectorEditPart.VISUAL_ID:
			return getPropertyMediatorOutputConnector_3034IncomingLinks(view);
		case EnrichMediatorEditPart.VISUAL_ID:
			return getEnrichMediator_3035IncomingLinks(view);
		case EnrichMediatorInputConnectorEditPart.VISUAL_ID:
			return getEnrichMediatorInputConnector_3036IncomingLinks(view);
		case EnrichMediatorOutputConnectorEditPart.VISUAL_ID:
			return getEnrichMediatorOutputConnector_3037IncomingLinks(view);
		case XSLTMediatorEditPart.VISUAL_ID:
			return getXSLTMediator_3038IncomingLinks(view);
		case XSLTMediatorInputConnectorEditPart.VISUAL_ID:
			return getXSLTMediatorInputConnector_3039IncomingLinks(view);
		case XSLTMediatorOutputConnectorEditPart.VISUAL_ID:
			return getXSLTMediatorOutputConnector_3040IncomingLinks(view);
		case SwitchMediatorEditPart.VISUAL_ID:
			return getSwitchMediator_3041IncomingLinks(view);
		case SwitchMediatorInputConnectorEditPart.VISUAL_ID:
			return getSwitchMediatorInputConnector_3042IncomingLinks(view);
		case SwitchCaseBranchOutputConnectorEditPart.VISUAL_ID:
			return getSwitchCaseBranchOutputConnector_3043IncomingLinks(view);
		case SwitchDefaultBranchOutputConnectorEditPart.VISUAL_ID:
			return getSwitchDefaultBranchOutputConnector_3044IncomingLinks(view);
		case SequenceEditPart.VISUAL_ID:
			return getSequence_3048IncomingLinks(view);
		case SequenceInputConnectorEditPart.VISUAL_ID:
			return getSequenceInputConnector_3049IncomingLinks(view);
		case SequenceOutputConnectorEditPart.VISUAL_ID:
			return getSequenceOutputConnector_3050IncomingLinks(view);
		case EventMediatorEditPart.VISUAL_ID:
			return getEventMediator_3051IncomingLinks(view);
		case EventMediatorInputConnectorEditPart.VISUAL_ID:
			return getEventMediatorInputConnector_3052IncomingLinks(view);
		case EventMediatorOutputConnectorEditPart.VISUAL_ID:
			return getEventMediatorOutputConnector_3053IncomingLinks(view);
		case EntitlementMediatorEditPart.VISUAL_ID:
			return getEntitlementMediator_3054IncomingLinks(view);
		case EntitlementMediatorInputConnectorEditPart.VISUAL_ID:
			return getEntitlementMediatorInputConnector_3055IncomingLinks(view);
		case EntitlementMediatorOutputConnectorEditPart.VISUAL_ID:
			return getEntitlementMediatorOutputConnector_3056IncomingLinks(view);
		case ClassMediatorEditPart.VISUAL_ID:
			return getClassMediator_3057IncomingLinks(view);
		case ClassMediatorInputConnectorEditPart.VISUAL_ID:
			return getClassMediatorInputConnector_3058IncomingLinks(view);
		case ClassMediatorOutputConnectorEditPart.VISUAL_ID:
			return getClassMediatorOutputConnector_3059IncomingLinks(view);
		case SpringMediatorEditPart.VISUAL_ID:
			return getSpringMediator_3060IncomingLinks(view);
		case SpringMediatorInputConnectorEditPart.VISUAL_ID:
			return getSpringMediatorInputConnector_3061IncomingLinks(view);
		case SpringMediatorOutputConnectorEditPart.VISUAL_ID:
			return getSpringMediatorOutputConnector_3062IncomingLinks(view);
		case ScriptMediatorEditPart.VISUAL_ID:
			return getScriptMediator_3063IncomingLinks(view);
		case ScriptMediatorInputConnectorEditPart.VISUAL_ID:
			return getScriptMediatorInputConnector_3064IncomingLinks(view);
		case ScriptMediatorOutputConnectorEditPart.VISUAL_ID:
			return getScriptMediatorOutputConnector_3065IncomingLinks(view);
		case FaultMediatorEditPart.VISUAL_ID:
			return getFaultMediator_3066IncomingLinks(view);
		case FaultMediatorInputConnectorEditPart.VISUAL_ID:
			return getFaultMediatorInputConnector_3067IncomingLinks(view);
		case FaultMediatorOutputConnectorEditPart.VISUAL_ID:
			return getFaultMediatorOutputConnector_3068IncomingLinks(view);
		case XQueryMediatorEditPart.VISUAL_ID:
			return getXQueryMediator_3069IncomingLinks(view);
		case XQueryMediatorInputConnectorEditPart.VISUAL_ID:
			return getXQueryMediatorInputConnector_3070IncomingLinks(view);
		case XQueryMediatorOutputConnectorEditPart.VISUAL_ID:
			return getXQueryMediatorOutputConnector_3071IncomingLinks(view);
		case CommandMediatorEditPart.VISUAL_ID:
			return getCommandMediator_3072IncomingLinks(view);
		case CommandMediatorInputConnectorEditPart.VISUAL_ID:
			return getCommandMediatorInputConnector_3073IncomingLinks(view);
		case CommandMediatorOutputConnectorEditPart.VISUAL_ID:
			return getCommandMediatorOutputConnector_3074IncomingLinks(view);
		case DBLookupMediatorEditPart.VISUAL_ID:
			return getDBLookupMediator_3075IncomingLinks(view);
		case DBLookupMediatorInputConnectorEditPart.VISUAL_ID:
			return getDBLookupMediatorInputConnector_3076IncomingLinks(view);
		case DBLookupMediatorOutputConnectorEditPart.VISUAL_ID:
			return getDBLookupMediatorOutputConnector_3077IncomingLinks(view);
		case DBReportMediatorEditPart.VISUAL_ID:
			return getDBReportMediator_3078IncomingLinks(view);
		case DBReportMediatorInputConnectorEditPart.VISUAL_ID:
			return getDBReportMediatorInputConnector_3079IncomingLinks(view);
		case DBReportMediatorOutputConnectorEditPart.VISUAL_ID:
			return getDBReportMediatorOutputConnector_3080IncomingLinks(view);
		case SmooksMediatorEditPart.VISUAL_ID:
			return getSmooksMediator_3081IncomingLinks(view);
		case SmooksMediatorInputConnectorEditPart.VISUAL_ID:
			return getSmooksMediatorInputConnector_3082IncomingLinks(view);
		case SmooksMediatorOutputConnectorEditPart.VISUAL_ID:
			return getSmooksMediatorOutputConnector_3083IncomingLinks(view);
		case SendMediatorEditPart.VISUAL_ID:
			return getSendMediator_3084IncomingLinks(view);
		case SendMediatorInputConnectorEditPart.VISUAL_ID:
			return getSendMediatorInputConnector_3085IncomingLinks(view);
		case SendMediatorOutputConnectorEditPart.VISUAL_ID:
			return getSendMediatorOutputConnector_3086IncomingLinks(view);
		case FailoverEndPointEditPart.VISUAL_ID:
			return getFailoverEndPoint_3087IncomingLinks(view);
		case FailoverEndPointInputConnectorEditPart.VISUAL_ID:
			return getFailoverEndPointInputConnector_3088IncomingLinks(view);
		case FailoverEndPointOutputConnectorEditPart.VISUAL_ID:
			return getFailoverEndPointOutputConnector_3090IncomingLinks(view);
		case FailoverEndPointWestOutputConnectorEditPart.VISUAL_ID:
			return getFailoverEndPointWestOutputConnector_3097IncomingLinks(view);
		case WSDLEndPointEditPart.VISUAL_ID:
			return getWSDLEndPoint_3091IncomingLinks(view);
		case WSDLEndPointInputConnectorEditPart.VISUAL_ID:
			return getWSDLEndPointInputConnector_3092IncomingLinks(view);
		case WSDLEndPointOutputConnectorEditPart.VISUAL_ID:
			return getWSDLEndPointOutputConnector_3093IncomingLinks(view);
		case LoadBalanceEndPointEditPart.VISUAL_ID:
			return getLoadBalanceEndPoint_3094IncomingLinks(view);
		case LoadBalanceEndPointInputConnectorEditPart.VISUAL_ID:
			return getLoadBalanceEndPointInputConnector_3095IncomingLinks(view);
		case LoadBalanceEndPointOutputConnectorEditPart.VISUAL_ID:
			return getLoadBalanceEndPointOutputConnector_3096IncomingLinks(view);
		case LoadBalanceEndPointWestOutputConnectorEditPart.VISUAL_ID:
			return getLoadBalanceEndPointWestOutputConnector_3098IncomingLinks(view);
		case HeaderMediatorEditPart.VISUAL_ID:
			return getHeaderMediator_3099IncomingLinks(view);
		case HeaderMediatorInputConnectorEditPart.VISUAL_ID:
			return getHeaderMediatorInputConnector_3100IncomingLinks(view);
		case HeaderMediatorOutputConnectorEditPart.VISUAL_ID:
			return getHeaderMediatorOutputConnector_3101IncomingLinks(view);
		case CloneMediatorEditPart.VISUAL_ID:
			return getCloneMediator_3102IncomingLinks(view);
		case CloneMediatorInputConnectorEditPart.VISUAL_ID:
			return getCloneMediatorInputConnector_3103IncomingLinks(view);
		case CloneMediatorOutputConnectorEditPart.VISUAL_ID:
			return getCloneMediatorOutputConnector_3104IncomingLinks(view);
		case CloneMediatorTargetOutputConnectorEditPart.VISUAL_ID:
			return getCloneMediatorTargetOutputConnector_3133IncomingLinks(view);
		case CacheMediatorEditPart.VISUAL_ID:
			return getCacheMediator_3105IncomingLinks(view);
		case CacheMediatorInputConnectorEditPart.VISUAL_ID:
			return getCacheMediatorInputConnector_3106IncomingLinks(view);
		case CacheMediatorOutputConnectorEditPart.VISUAL_ID:
			return getCacheMediatorOutputConnector_3107IncomingLinks(view);
		case IterateMediatorEditPart.VISUAL_ID:
			return getIterateMediator_3108IncomingLinks(view);
		case IterateMediatorInputConnectorEditPart.VISUAL_ID:
			return getIterateMediatorInputConnector_3109IncomingLinks(view);
		case IterateMediatorOutputConnectorEditPart.VISUAL_ID:
			return getIterateMediatorOutputConnector_3110IncomingLinks(view);
		case CalloutMediatorEditPart.VISUAL_ID:
			return getCalloutMediator_3114IncomingLinks(view);
		case CalloutMediatorInputConnectorEditPart.VISUAL_ID:
			return getCalloutMediatorInputConnector_3115IncomingLinks(view);
		case CalloutMediatorOutputConnectorEditPart.VISUAL_ID:
			return getCalloutMediatorOutputConnector_3116IncomingLinks(view);
		case TransactionMediatorEditPart.VISUAL_ID:
			return getTransactionMediator_3117IncomingLinks(view);
		case TransactionMediatorInputConnectorEditPart.VISUAL_ID:
			return getTransactionMediatorInputConnector_3118IncomingLinks(view);
		case TransactionMediatorOutputConnectorEditPart.VISUAL_ID:
			return getTransactionMediatorOutputConnector_3119IncomingLinks(view);
		case ThrottleMediatorEditPart.VISUAL_ID:
			return getThrottleMediator_3120IncomingLinks(view);
		case ThrottleMediatorInputConnectorEditPart.VISUAL_ID:
			return getThrottleMediatorInputConnector_3121IncomingLinks(view);
		case ThrottleMediatorOutputConnectorEditPart.VISUAL_ID:
			return getThrottleMediatorOutputConnector_3122IncomingLinks(view);
		case RMSequenceMediatorEditPart.VISUAL_ID:
			return getRMSequenceMediator_3123IncomingLinks(view);
		case RMSequenceMediatorInputConnectorEditPart.VISUAL_ID:
			return getRMSequenceMediatorInputConnector_3124IncomingLinks(view);
		case RMSequenceMediatorOutputConnectorEditPart.VISUAL_ID:
			return getRMSequenceMediatorOutputConnector_3125IncomingLinks(view);
		case RuleMediatorEditPart.VISUAL_ID:
			return getRuleMediator_3126IncomingLinks(view);
		case RuleMediatorInputConnectorEditPart.VISUAL_ID:
			return getRuleMediatorInputConnector_3127IncomingLinks(view);
		case RuleMediatorOutputConnectorEditPart.VISUAL_ID:
			return getRuleMediatorOutputConnector_3128IncomingLinks(view);
		case OAuthMediatorEditPart.VISUAL_ID:
			return getOAuthMediator_3129IncomingLinks(view);
		case OAuthMediatorInputConnectorEditPart.VISUAL_ID:
			return getOAuthMediatorInputConnector_3130IncomingLinks(view);
		case OAuthMediatorOutputConnectorEditPart.VISUAL_ID:
			return getOAuthMediatorOutputConnector_3131IncomingLinks(view);
		case AggregateMediatorEditPart.VISUAL_ID:
			return getAggregateMediator_3111IncomingLinks(view);
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
		case MessageMediatorEditPart.VISUAL_ID:
			return getMessageMediator_3045OutgoingLinks(view);
		case MessageInputConnectorEditPart.VISUAL_ID:
			return getMessageInputConnector_3046OutgoingLinks(view);
		case MessageOutputConnectorEditPart.VISUAL_ID:
			return getMessageOutputConnector_3047OutgoingLinks(view);
		case DefaultEndPointEditPart.VISUAL_ID:
			return getDefaultEndPoint_3020OutgoingLinks(view);
		case DefaultEndPointInputConnectorEditPart.VISUAL_ID:
			return getDefaultEndPointInputConnector_3021OutgoingLinks(view);
		case DefaultEndPointOutputConnectorEditPart.VISUAL_ID:
			return getDefaultEndPointOutputConnector_3022OutgoingLinks(view);
		case AddressEndPointEditPart.VISUAL_ID:
			return getAddressEndPoint_3029OutgoingLinks(view);
		case AddressEndPointInputConnectorEditPart.VISUAL_ID:
			return getAddressEndPointInputConnector_3030OutgoingLinks(view);
		case AddressEndPointOutputConnectorEditPart.VISUAL_ID:
			return getAddressEndPointOutputConnector_3031OutgoingLinks(view);
		case DropMediatorEditPart.VISUAL_ID:
			return getDropMediator_3007OutgoingLinks(view);
		case DropMediatorInputConnectorEditPart.VISUAL_ID:
			return getDropMediatorInputConnector_3008OutgoingLinks(view);
		case FilterMediatorEditPart.VISUAL_ID:
			return getFilterMediator_3009OutgoingLinks(view);
		case FilterMediatorInputConnectorEditPart.VISUAL_ID:
			return getFilterMediatorInputConnector_3010OutgoingLinks(view);
		case FilterMediatorPassOutputConnectorEditPart.VISUAL_ID:
			return getFilterMediatorPassOutputConnector_3011OutgoingLinks(view);
		case FilterMediatorFailOutputConnectorEditPart.VISUAL_ID:
			return getFilterMediatorFailOutputConnector_3012OutgoingLinks(view);
		case MergeNodeEditPart.VISUAL_ID:
			return getMergeNode_3013OutgoingLinks(view);
		case MergeNodeFirstInputConnectorEditPart.VISUAL_ID:
			return getMergeNodeFirstInputConnector_3014OutgoingLinks(view);
		case MergeNodeSecondInputConnectorEditPart.VISUAL_ID:
			return getMergeNodeSecondInputConnector_3015OutgoingLinks(view);
		case MergeNodeOutputConnectorEditPart.VISUAL_ID:
			return getMergeNodeOutputConnector_3016OutgoingLinks(view);
		case LogMediatorEditPart.VISUAL_ID:
			return getLogMediator_3017OutgoingLinks(view);
		case LogMediatorInputConnectorEditPart.VISUAL_ID:
			return getLogMediatorInputConnector_3018OutgoingLinks(view);
		case LogMediatorOutputConnectorEditPart.VISUAL_ID:
			return getLogMediatorOutputConnector_3019OutgoingLinks(view);
		case PropertyMediatorEditPart.VISUAL_ID:
			return getPropertyMediator_3032OutgoingLinks(view);
		case PropertyMediatorInputConnectorEditPart.VISUAL_ID:
			return getPropertyMediatorInputConnector_3033OutgoingLinks(view);
		case PropertyMediatorOutputConnectorEditPart.VISUAL_ID:
			return getPropertyMediatorOutputConnector_3034OutgoingLinks(view);
		case EnrichMediatorEditPart.VISUAL_ID:
			return getEnrichMediator_3035OutgoingLinks(view);
		case EnrichMediatorInputConnectorEditPart.VISUAL_ID:
			return getEnrichMediatorInputConnector_3036OutgoingLinks(view);
		case EnrichMediatorOutputConnectorEditPart.VISUAL_ID:
			return getEnrichMediatorOutputConnector_3037OutgoingLinks(view);
		case XSLTMediatorEditPart.VISUAL_ID:
			return getXSLTMediator_3038OutgoingLinks(view);
		case XSLTMediatorInputConnectorEditPart.VISUAL_ID:
			return getXSLTMediatorInputConnector_3039OutgoingLinks(view);
		case XSLTMediatorOutputConnectorEditPart.VISUAL_ID:
			return getXSLTMediatorOutputConnector_3040OutgoingLinks(view);
		case SwitchMediatorEditPart.VISUAL_ID:
			return getSwitchMediator_3041OutgoingLinks(view);
		case SwitchMediatorInputConnectorEditPart.VISUAL_ID:
			return getSwitchMediatorInputConnector_3042OutgoingLinks(view);
		case SwitchCaseBranchOutputConnectorEditPart.VISUAL_ID:
			return getSwitchCaseBranchOutputConnector_3043OutgoingLinks(view);
		case SwitchDefaultBranchOutputConnectorEditPart.VISUAL_ID:
			return getSwitchDefaultBranchOutputConnector_3044OutgoingLinks(view);
		case SequenceEditPart.VISUAL_ID:
			return getSequence_3048OutgoingLinks(view);
		case SequenceInputConnectorEditPart.VISUAL_ID:
			return getSequenceInputConnector_3049OutgoingLinks(view);
		case SequenceOutputConnectorEditPart.VISUAL_ID:
			return getSequenceOutputConnector_3050OutgoingLinks(view);
		case EventMediatorEditPart.VISUAL_ID:
			return getEventMediator_3051OutgoingLinks(view);
		case EventMediatorInputConnectorEditPart.VISUAL_ID:
			return getEventMediatorInputConnector_3052OutgoingLinks(view);
		case EventMediatorOutputConnectorEditPart.VISUAL_ID:
			return getEventMediatorOutputConnector_3053OutgoingLinks(view);
		case EntitlementMediatorEditPart.VISUAL_ID:
			return getEntitlementMediator_3054OutgoingLinks(view);
		case EntitlementMediatorInputConnectorEditPart.VISUAL_ID:
			return getEntitlementMediatorInputConnector_3055OutgoingLinks(view);
		case EntitlementMediatorOutputConnectorEditPart.VISUAL_ID:
			return getEntitlementMediatorOutputConnector_3056OutgoingLinks(view);
		case ClassMediatorEditPart.VISUAL_ID:
			return getClassMediator_3057OutgoingLinks(view);
		case ClassMediatorInputConnectorEditPart.VISUAL_ID:
			return getClassMediatorInputConnector_3058OutgoingLinks(view);
		case ClassMediatorOutputConnectorEditPart.VISUAL_ID:
			return getClassMediatorOutputConnector_3059OutgoingLinks(view);
		case SpringMediatorEditPart.VISUAL_ID:
			return getSpringMediator_3060OutgoingLinks(view);
		case SpringMediatorInputConnectorEditPart.VISUAL_ID:
			return getSpringMediatorInputConnector_3061OutgoingLinks(view);
		case SpringMediatorOutputConnectorEditPart.VISUAL_ID:
			return getSpringMediatorOutputConnector_3062OutgoingLinks(view);
		case ScriptMediatorEditPart.VISUAL_ID:
			return getScriptMediator_3063OutgoingLinks(view);
		case ScriptMediatorInputConnectorEditPart.VISUAL_ID:
			return getScriptMediatorInputConnector_3064OutgoingLinks(view);
		case ScriptMediatorOutputConnectorEditPart.VISUAL_ID:
			return getScriptMediatorOutputConnector_3065OutgoingLinks(view);
		case FaultMediatorEditPart.VISUAL_ID:
			return getFaultMediator_3066OutgoingLinks(view);
		case FaultMediatorInputConnectorEditPart.VISUAL_ID:
			return getFaultMediatorInputConnector_3067OutgoingLinks(view);
		case FaultMediatorOutputConnectorEditPart.VISUAL_ID:
			return getFaultMediatorOutputConnector_3068OutgoingLinks(view);
		case XQueryMediatorEditPart.VISUAL_ID:
			return getXQueryMediator_3069OutgoingLinks(view);
		case XQueryMediatorInputConnectorEditPart.VISUAL_ID:
			return getXQueryMediatorInputConnector_3070OutgoingLinks(view);
		case XQueryMediatorOutputConnectorEditPart.VISUAL_ID:
			return getXQueryMediatorOutputConnector_3071OutgoingLinks(view);
		case CommandMediatorEditPart.VISUAL_ID:
			return getCommandMediator_3072OutgoingLinks(view);
		case CommandMediatorInputConnectorEditPart.VISUAL_ID:
			return getCommandMediatorInputConnector_3073OutgoingLinks(view);
		case CommandMediatorOutputConnectorEditPart.VISUAL_ID:
			return getCommandMediatorOutputConnector_3074OutgoingLinks(view);
		case DBLookupMediatorEditPart.VISUAL_ID:
			return getDBLookupMediator_3075OutgoingLinks(view);
		case DBLookupMediatorInputConnectorEditPart.VISUAL_ID:
			return getDBLookupMediatorInputConnector_3076OutgoingLinks(view);
		case DBLookupMediatorOutputConnectorEditPart.VISUAL_ID:
			return getDBLookupMediatorOutputConnector_3077OutgoingLinks(view);
		case DBReportMediatorEditPart.VISUAL_ID:
			return getDBReportMediator_3078OutgoingLinks(view);
		case DBReportMediatorInputConnectorEditPart.VISUAL_ID:
			return getDBReportMediatorInputConnector_3079OutgoingLinks(view);
		case DBReportMediatorOutputConnectorEditPart.VISUAL_ID:
			return getDBReportMediatorOutputConnector_3080OutgoingLinks(view);
		case SmooksMediatorEditPart.VISUAL_ID:
			return getSmooksMediator_3081OutgoingLinks(view);
		case SmooksMediatorInputConnectorEditPart.VISUAL_ID:
			return getSmooksMediatorInputConnector_3082OutgoingLinks(view);
		case SmooksMediatorOutputConnectorEditPart.VISUAL_ID:
			return getSmooksMediatorOutputConnector_3083OutgoingLinks(view);
		case SendMediatorEditPart.VISUAL_ID:
			return getSendMediator_3084OutgoingLinks(view);
		case SendMediatorInputConnectorEditPart.VISUAL_ID:
			return getSendMediatorInputConnector_3085OutgoingLinks(view);
		case SendMediatorOutputConnectorEditPart.VISUAL_ID:
			return getSendMediatorOutputConnector_3086OutgoingLinks(view);
		case FailoverEndPointEditPart.VISUAL_ID:
			return getFailoverEndPoint_3087OutgoingLinks(view);
		case FailoverEndPointInputConnectorEditPart.VISUAL_ID:
			return getFailoverEndPointInputConnector_3088OutgoingLinks(view);
		case FailoverEndPointOutputConnectorEditPart.VISUAL_ID:
			return getFailoverEndPointOutputConnector_3090OutgoingLinks(view);
		case FailoverEndPointWestOutputConnectorEditPart.VISUAL_ID:
			return getFailoverEndPointWestOutputConnector_3097OutgoingLinks(view);
		case WSDLEndPointEditPart.VISUAL_ID:
			return getWSDLEndPoint_3091OutgoingLinks(view);
		case WSDLEndPointInputConnectorEditPart.VISUAL_ID:
			return getWSDLEndPointInputConnector_3092OutgoingLinks(view);
		case WSDLEndPointOutputConnectorEditPart.VISUAL_ID:
			return getWSDLEndPointOutputConnector_3093OutgoingLinks(view);
		case LoadBalanceEndPointEditPart.VISUAL_ID:
			return getLoadBalanceEndPoint_3094OutgoingLinks(view);
		case LoadBalanceEndPointInputConnectorEditPart.VISUAL_ID:
			return getLoadBalanceEndPointInputConnector_3095OutgoingLinks(view);
		case LoadBalanceEndPointOutputConnectorEditPart.VISUAL_ID:
			return getLoadBalanceEndPointOutputConnector_3096OutgoingLinks(view);
		case LoadBalanceEndPointWestOutputConnectorEditPart.VISUAL_ID:
			return getLoadBalanceEndPointWestOutputConnector_3098OutgoingLinks(view);
		case HeaderMediatorEditPart.VISUAL_ID:
			return getHeaderMediator_3099OutgoingLinks(view);
		case HeaderMediatorInputConnectorEditPart.VISUAL_ID:
			return getHeaderMediatorInputConnector_3100OutgoingLinks(view);
		case HeaderMediatorOutputConnectorEditPart.VISUAL_ID:
			return getHeaderMediatorOutputConnector_3101OutgoingLinks(view);
		case CloneMediatorEditPart.VISUAL_ID:
			return getCloneMediator_3102OutgoingLinks(view);
		case CloneMediatorInputConnectorEditPart.VISUAL_ID:
			return getCloneMediatorInputConnector_3103OutgoingLinks(view);
		case CloneMediatorOutputConnectorEditPart.VISUAL_ID:
			return getCloneMediatorOutputConnector_3104OutgoingLinks(view);
		case CloneMediatorTargetOutputConnectorEditPart.VISUAL_ID:
			return getCloneMediatorTargetOutputConnector_3133OutgoingLinks(view);
		case CacheMediatorEditPart.VISUAL_ID:
			return getCacheMediator_3105OutgoingLinks(view);
		case CacheMediatorInputConnectorEditPart.VISUAL_ID:
			return getCacheMediatorInputConnector_3106OutgoingLinks(view);
		case CacheMediatorOutputConnectorEditPart.VISUAL_ID:
			return getCacheMediatorOutputConnector_3107OutgoingLinks(view);
		case IterateMediatorEditPart.VISUAL_ID:
			return getIterateMediator_3108OutgoingLinks(view);
		case IterateMediatorInputConnectorEditPart.VISUAL_ID:
			return getIterateMediatorInputConnector_3109OutgoingLinks(view);
		case IterateMediatorOutputConnectorEditPart.VISUAL_ID:
			return getIterateMediatorOutputConnector_3110OutgoingLinks(view);
		case CalloutMediatorEditPart.VISUAL_ID:
			return getCalloutMediator_3114OutgoingLinks(view);
		case CalloutMediatorInputConnectorEditPart.VISUAL_ID:
			return getCalloutMediatorInputConnector_3115OutgoingLinks(view);
		case CalloutMediatorOutputConnectorEditPart.VISUAL_ID:
			return getCalloutMediatorOutputConnector_3116OutgoingLinks(view);
		case TransactionMediatorEditPart.VISUAL_ID:
			return getTransactionMediator_3117OutgoingLinks(view);
		case TransactionMediatorInputConnectorEditPart.VISUAL_ID:
			return getTransactionMediatorInputConnector_3118OutgoingLinks(view);
		case TransactionMediatorOutputConnectorEditPart.VISUAL_ID:
			return getTransactionMediatorOutputConnector_3119OutgoingLinks(view);
		case ThrottleMediatorEditPart.VISUAL_ID:
			return getThrottleMediator_3120OutgoingLinks(view);
		case ThrottleMediatorInputConnectorEditPart.VISUAL_ID:
			return getThrottleMediatorInputConnector_3121OutgoingLinks(view);
		case ThrottleMediatorOutputConnectorEditPart.VISUAL_ID:
			return getThrottleMediatorOutputConnector_3122OutgoingLinks(view);
		case RMSequenceMediatorEditPart.VISUAL_ID:
			return getRMSequenceMediator_3123OutgoingLinks(view);
		case RMSequenceMediatorInputConnectorEditPart.VISUAL_ID:
			return getRMSequenceMediatorInputConnector_3124OutgoingLinks(view);
		case RMSequenceMediatorOutputConnectorEditPart.VISUAL_ID:
			return getRMSequenceMediatorOutputConnector_3125OutgoingLinks(view);
		case RuleMediatorEditPart.VISUAL_ID:
			return getRuleMediator_3126OutgoingLinks(view);
		case RuleMediatorInputConnectorEditPart.VISUAL_ID:
			return getRuleMediatorInputConnector_3127OutgoingLinks(view);
		case RuleMediatorOutputConnectorEditPart.VISUAL_ID:
			return getRuleMediatorOutputConnector_3128OutgoingLinks(view);
		case OAuthMediatorEditPart.VISUAL_ID:
			return getOAuthMediator_3129OutgoingLinks(view);
		case OAuthMediatorInputConnectorEditPart.VISUAL_ID:
			return getOAuthMediatorInputConnector_3130OutgoingLinks(view);
		case OAuthMediatorOutputConnectorEditPart.VISUAL_ID:
			return getOAuthMediatorOutputConnector_3131OutgoingLinks(view);
		case AggregateMediatorEditPart.VISUAL_ID:
			return getAggregateMediator_3111OutgoingLinks(view);
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
		case EsbLinkEditPart.VISUAL_ID:
			return getEsbLink_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getEsbDiagram_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getEsbServer_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getProxyService_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getProxyOutputConnector_3002ContainedLinks(
			View view) {
		ProxyOutputConnector modelElement = (ProxyOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getProxyInputConnector_3003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getMessageMediator_3045ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getMessageInputConnector_3046ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getMessageOutputConnector_3047ContainedLinks(
			View view) {
		MessageOutputConnector modelElement = (MessageOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getDropMediator_3007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getDropMediatorInputConnector_3008ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getFilterMediator_3009ContainedLinks(
			View view) {
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
	public static List<EsbLinkDescriptor> getMergeNode_3013ContainedLinks(
			View view) {
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
	public static List<EsbLinkDescriptor> getMergeNodeOutputConnector_3016ContainedLinks(
			View view) {
		MergeNodeOutputConnector modelElement = (MergeNodeOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getLogMediator_3017ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getLogMediatorInputConnector_3018ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getLogMediatorOutputConnector_3019ContainedLinks(
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
	public static List<EsbLinkDescriptor> getPropertyMediator_3032ContainedLinks(
			View view) {
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
	public static List<EsbLinkDescriptor> getEnrichMediator_3035ContainedLinks(
			View view) {
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
	public static List<EsbLinkDescriptor> getXSLTMediator_3038ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getXSLTMediatorInputConnector_3039ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getXSLTMediatorOutputConnector_3040ContainedLinks(
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
	public static List<EsbLinkDescriptor> getSwitchMediator_3041ContainedLinks(
			View view) {
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
	public static List<EsbLinkDescriptor> getSequence_3048ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSequenceInputConnector_3049ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSequenceOutputConnector_3050ContainedLinks(
			View view) {
		SequenceOutputConnector modelElement = (SequenceOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getEventMediator_3051ContainedLinks(
			View view) {
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
	public static List<EsbLinkDescriptor> getEntitlementMediator_3054ContainedLinks(
			View view) {
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
	public static List<EsbLinkDescriptor> getClassMediator_3057ContainedLinks(
			View view) {
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
	public static List<EsbLinkDescriptor> getSpringMediator_3060ContainedLinks(
			View view) {
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
	public static List<EsbLinkDescriptor> getScriptMediator_3063ContainedLinks(
			View view) {
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
	public static List<EsbLinkDescriptor> getFaultMediator_3066ContainedLinks(
			View view) {
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
	public static List<EsbLinkDescriptor> getXQueryMediator_3069ContainedLinks(
			View view) {
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
	public static List<EsbLinkDescriptor> getCommandMediator_3072ContainedLinks(
			View view) {
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
	public static List<EsbLinkDescriptor> getDBLookupMediator_3075ContainedLinks(
			View view) {
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
	public static List<EsbLinkDescriptor> getDBReportMediator_3078ContainedLinks(
			View view) {
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
	public static List<EsbLinkDescriptor> getSmooksMediator_3081ContainedLinks(
			View view) {
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
	public static List<EsbLinkDescriptor> getSendMediator_3084ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSendMediatorInputConnector_3085ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSendMediatorOutputConnector_3086ContainedLinks(
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
	public static List<EsbLinkDescriptor> getFailoverEndPoint_3087ContainedLinks(
			View view) {
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
	public static List<EsbLinkDescriptor> getWSDLEndPoint_3091ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getWSDLEndPointInputConnector_3092ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getWSDLEndPointOutputConnector_3093ContainedLinks(
			View view) {
		WSDLEndPointOutputConnector modelElement = (WSDLEndPointOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getLoadBalanceEndPoint_3094ContainedLinks(
			View view) {
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
	public static List<EsbLinkDescriptor> getHeaderMediator_3099ContainedLinks(
			View view) {
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
	public static List<EsbLinkDescriptor> getCloneMediator_3102ContainedLinks(
			View view) {
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
	public static List<EsbLinkDescriptor> getCacheMediator_3105ContainedLinks(
			View view) {
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
	public static List<EsbLinkDescriptor> getIterateMediator_3108ContainedLinks(
			View view) {
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
	public static List<EsbLinkDescriptor> getAggregateMediator_3111ContainedLinks(
			View view) {
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
	public static List<EsbLinkDescriptor> getLogMediator_3134ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getLogMediatorInputConnector_3135ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getLogMediatorOutputConnector_3136ContainedLinks(
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
	public static List<EsbLinkDescriptor> getDropMediator_3137ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getDropMediatorInputConnector_3138ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getFilterMediator_3139ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getFilterMediatorInputConnector_3140ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getFilterMediatorPassOutputConnector_3141ContainedLinks(
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
	public static List<EsbLinkDescriptor> getFilterMediatorFailOutputConnector_3142ContainedLinks(
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
	public static List<EsbLinkDescriptor> getPropertyMediator_3143ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getPropertyMediatorInputConnector_3144ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getPropertyMediatorOutputConnector_3145ContainedLinks(
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
	public static List<EsbLinkDescriptor> getEnrichMediator_3146ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getEnrichMediatorInputConnector_3147ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getEnrichMediatorOutputConnector_3148ContainedLinks(
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
	public static List<EsbLinkDescriptor> getXSLTMediator_3149ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getXSLTMediatorInputConnector_3150ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getXSLTMediatorOutputConnector_3151ContainedLinks(
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
	public static List<EsbLinkDescriptor> getSwitchMediator_3152ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSwitchMediatorInputConnector_3153ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSwitchCaseBranchOutputConnector_3154ContainedLinks(
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
	public static List<EsbLinkDescriptor> getSwitchDefaultBranchOutputConnector_3155ContainedLinks(
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
	public static List<EsbLinkDescriptor> getFaultMediator_3156ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getFaultMediatorInputConnector_3157ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getFaultMediatorOutputConnector_3158ContainedLinks(
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
	public static List<EsbLinkDescriptor> getDBLookupMediator_3159ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getDBLookupMediatorInputConnector_3160ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getDBLookupMediatorOutputConnector_3161ContainedLinks(
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
	public static List<EsbLinkDescriptor> getDBReportMediator_3162ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getDBReportMediatorInputConnector_3163ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getDBReportMediatorOutputConnector_3164ContainedLinks(
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
	public static List<EsbLinkDescriptor> getSendMediator_3165ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSendMediatorInputConnector_3166ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSendMediatorOutputConnector_3167ContainedLinks(
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
	public static List<EsbLinkDescriptor> getHeaderMediator_3168ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getHeaderMediatorInputConnector_3169ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getHeaderMediatorOutputConnector_3170ContainedLinks(
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
	public static List<EsbLinkDescriptor> getCloneMediator_3171ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCloneMediatorInputConnector_3172ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCloneMediatorOutputConnector_3173ContainedLinks(
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
	public static List<EsbLinkDescriptor> getCloneMediatorTargetOutputConnector_3174ContainedLinks(
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
	public static List<EsbLinkDescriptor> getIterateMediator_3175ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getIterateMediatorInputConnector_3176ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getIterateMediatorOutputConnector_3177ContainedLinks(
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
	public static List<EsbLinkDescriptor> getCalloutMediator_3178ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCalloutMediator_3114ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCalloutMediatorInputConnector_3181ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCalloutMediatorOutputConnector_3182ContainedLinks(
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
	public static List<EsbLinkDescriptor> getTransactionMediator_3179ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getTransactionMediator_3117ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getTransactionMediatorInputConnector_3183ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getTransactionMediatorOutputConnector_3184ContainedLinks(
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
	public static List<EsbLinkDescriptor> getRMSequenceMediator_3180ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getThrottleMediator_3120ContainedLinks(
			View view) {
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
	public static List<EsbLinkDescriptor> getRMSequenceMediator_3123ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getRMSequenceMediatorInputConnector_3185ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getRMSequenceMediatorOutputConnector_3186ContainedLinks(
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
	public static List<EsbLinkDescriptor> getSequence_3187ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSequenceInputConnector_3188ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSequenceOutputConnector_3189ContainedLinks(
			View view) {
		SequenceOutputConnector modelElement = (SequenceOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getRuleMediator_3126ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getRuleMediatorInputConnector_3127ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getRuleMediatorOutputConnector_3128ContainedLinks(
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
	public static List<EsbLinkDescriptor> getOAuthMediator_3129ContainedLinks(
			View view) {
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
	public static List<EsbLinkDescriptor> getDefaultEndPoint_3020ContainedLinks(
			View view) {
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
	public static List<EsbLinkDescriptor> getAddressEndPoint_3029ContainedLinks(
			View view) {
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
	public static List<EsbLinkDescriptor> getEsbLink_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getEsbServer_2001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getProxyService_3001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getProxyOutputConnector_3002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getProxyInputConnector_3003IncomingLinks(
			View view) {
		ProxyInputConnector modelElement = (ProxyInputConnector) view
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
	public static List<EsbLinkDescriptor> getMessageMediator_3045IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getMessageInputConnector_3046IncomingLinks(
			View view) {
		MessageInputConnector modelElement = (MessageInputConnector) view
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
	public static List<EsbLinkDescriptor> getMessageOutputConnector_3047IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getDropMediator_3007IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getDropMediatorInputConnector_3008IncomingLinks(
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
	public static List<EsbLinkDescriptor> getFilterMediator_3009IncomingLinks(
			View view) {
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
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
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
	public static List<EsbLinkDescriptor> getMergeNode_3013IncomingLinks(
			View view) {
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
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
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
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getMergeNodeOutputConnector_3016IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getLogMediator_3017IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getLogMediatorInputConnector_3018IncomingLinks(
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
	public static List<EsbLinkDescriptor> getLogMediatorOutputConnector_3019IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getPropertyMediator_3032IncomingLinks(
			View view) {
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
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
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
	public static List<EsbLinkDescriptor> getEnrichMediator_3035IncomingLinks(
			View view) {
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
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
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
	public static List<EsbLinkDescriptor> getXSLTMediator_3038IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getXSLTMediatorInputConnector_3039IncomingLinks(
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
	public static List<EsbLinkDescriptor> getXSLTMediatorOutputConnector_3040IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSwitchMediator_3041IncomingLinks(
			View view) {
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
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
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
	public static List<EsbLinkDescriptor> getSequence_3048IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSequenceInputConnector_3049IncomingLinks(
			View view) {
		SequenceInputConnector modelElement = (SequenceInputConnector) view
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
	public static List<EsbLinkDescriptor> getSequenceOutputConnector_3050IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getEventMediator_3051IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getEventMediatorInputConnector_3052IncomingLinks(
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
	public static List<EsbLinkDescriptor> getEventMediatorOutputConnector_3053IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getEntitlementMediator_3054IncomingLinks(
			View view) {
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
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
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
	public static List<EsbLinkDescriptor> getClassMediator_3057IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getClassMediatorInputConnector_3058IncomingLinks(
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
	public static List<EsbLinkDescriptor> getClassMediatorOutputConnector_3059IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSpringMediator_3060IncomingLinks(
			View view) {
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
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
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
	public static List<EsbLinkDescriptor> getScriptMediator_3063IncomingLinks(
			View view) {
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
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
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
	public static List<EsbLinkDescriptor> getFaultMediator_3066IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getFaultMediatorInputConnector_3067IncomingLinks(
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
	public static List<EsbLinkDescriptor> getFaultMediatorOutputConnector_3068IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getXQueryMediator_3069IncomingLinks(
			View view) {
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
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
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
	public static List<EsbLinkDescriptor> getCommandMediator_3072IncomingLinks(
			View view) {
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
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
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
	public static List<EsbLinkDescriptor> getDBLookupMediator_3075IncomingLinks(
			View view) {
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
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
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
	public static List<EsbLinkDescriptor> getDBReportMediator_3078IncomingLinks(
			View view) {
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
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
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
	public static List<EsbLinkDescriptor> getSmooksMediator_3081IncomingLinks(
			View view) {
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
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
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
	public static List<EsbLinkDescriptor> getSendMediator_3084IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSendMediatorInputConnector_3085IncomingLinks(
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
	public static List<EsbLinkDescriptor> getSendMediatorOutputConnector_3086IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getFailoverEndPoint_3087IncomingLinks(
			View view) {
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
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
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
	public static List<EsbLinkDescriptor> getWSDLEndPoint_3091IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getWSDLEndPointInputConnector_3092IncomingLinks(
			View view) {
		WSDLEndPointInputConnector modelElement = (WSDLEndPointInputConnector) view
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
	public static List<EsbLinkDescriptor> getWSDLEndPointOutputConnector_3093IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getLoadBalanceEndPoint_3094IncomingLinks(
			View view) {
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
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
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
	public static List<EsbLinkDescriptor> getHeaderMediator_3099IncomingLinks(
			View view) {
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
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
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
	public static List<EsbLinkDescriptor> getCloneMediator_3102IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCloneMediatorInputConnector_3103IncomingLinks(
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
	public static List<EsbLinkDescriptor> getCacheMediator_3105IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCacheMediatorInputConnector_3106IncomingLinks(
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
	public static List<EsbLinkDescriptor> getCacheMediatorOutputConnector_3107IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getIterateMediator_3108IncomingLinks(
			View view) {
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
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
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
	public static List<EsbLinkDescriptor> getAggregateMediator_3111IncomingLinks(
			View view) {
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
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
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
	public static List<EsbLinkDescriptor> getLogMediator_3134IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getLogMediatorInputConnector_3135IncomingLinks(
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
	public static List<EsbLinkDescriptor> getLogMediatorOutputConnector_3136IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getDropMediator_3137IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getDropMediatorInputConnector_3138IncomingLinks(
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
	public static List<EsbLinkDescriptor> getFilterMediator_3139IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getFilterMediatorInputConnector_3140IncomingLinks(
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
	public static List<EsbLinkDescriptor> getFilterMediatorPassOutputConnector_3141IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getFilterMediatorFailOutputConnector_3142IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getPropertyMediator_3143IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getPropertyMediatorInputConnector_3144IncomingLinks(
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
	public static List<EsbLinkDescriptor> getPropertyMediatorOutputConnector_3145IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getEnrichMediator_3146IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getEnrichMediatorInputConnector_3147IncomingLinks(
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
	public static List<EsbLinkDescriptor> getEnrichMediatorOutputConnector_3148IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getXSLTMediator_3149IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getXSLTMediatorInputConnector_3150IncomingLinks(
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
	public static List<EsbLinkDescriptor> getXSLTMediatorOutputConnector_3151IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSwitchMediator_3152IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSwitchMediatorInputConnector_3153IncomingLinks(
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
	public static List<EsbLinkDescriptor> getSwitchCaseBranchOutputConnector_3154IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSwitchDefaultBranchOutputConnector_3155IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getFaultMediator_3156IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getFaultMediatorInputConnector_3157IncomingLinks(
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
	public static List<EsbLinkDescriptor> getFaultMediatorOutputConnector_3158IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getDBLookupMediator_3159IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getDBLookupMediatorInputConnector_3160IncomingLinks(
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
	public static List<EsbLinkDescriptor> getDBLookupMediatorOutputConnector_3161IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getDBReportMediator_3162IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getDBReportMediatorInputConnector_3163IncomingLinks(
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
	public static List<EsbLinkDescriptor> getDBReportMediatorOutputConnector_3164IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSendMediator_3165IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSendMediatorInputConnector_3166IncomingLinks(
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
	public static List<EsbLinkDescriptor> getSendMediatorOutputConnector_3167IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getHeaderMediator_3168IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getHeaderMediatorInputConnector_3169IncomingLinks(
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
	public static List<EsbLinkDescriptor> getHeaderMediatorOutputConnector_3170IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCloneMediator_3171IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCloneMediatorInputConnector_3172IncomingLinks(
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
	public static List<EsbLinkDescriptor> getCloneMediatorOutputConnector_3173IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCloneMediatorTargetOutputConnector_3174IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getIterateMediator_3175IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getIterateMediatorInputConnector_3176IncomingLinks(
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
	public static List<EsbLinkDescriptor> getIterateMediatorOutputConnector_3177IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCalloutMediator_3178IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCalloutMediator_3114IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCalloutMediatorInputConnector_3181IncomingLinks(
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
	public static List<EsbLinkDescriptor> getCalloutMediatorOutputConnector_3182IncomingLinks(
			View view) {
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
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
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
	public static List<EsbLinkDescriptor> getTransactionMediator_3179IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getTransactionMediator_3117IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getTransactionMediatorInputConnector_3183IncomingLinks(
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
	public static List<EsbLinkDescriptor> getTransactionMediatorOutputConnector_3184IncomingLinks(
			View view) {
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
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
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
	public static List<EsbLinkDescriptor> getRMSequenceMediator_3180IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getThrottleMediator_3120IncomingLinks(
			View view) {
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
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
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
	public static List<EsbLinkDescriptor> getRMSequenceMediator_3123IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getRMSequenceMediatorInputConnector_3185IncomingLinks(
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
	public static List<EsbLinkDescriptor> getRMSequenceMediatorOutputConnector_3186IncomingLinks(
			View view) {
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
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
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
	public static List<EsbLinkDescriptor> getSequence_3187IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSequenceInputConnector_3188IncomingLinks(
			View view) {
		SequenceInputConnector modelElement = (SequenceInputConnector) view
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
	public static List<EsbLinkDescriptor> getSequenceOutputConnector_3189IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getRuleMediator_3126IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getRuleMediatorInputConnector_3127IncomingLinks(
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
	public static List<EsbLinkDescriptor> getRuleMediatorOutputConnector_3128IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getOAuthMediator_3129IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getOAuthMediatorInputConnector_3130IncomingLinks(
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
	public static List<EsbLinkDescriptor> getOAuthMediatorOutputConnector_3131IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getDefaultEndPoint_3020IncomingLinks(
			View view) {
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
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
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
	public static List<EsbLinkDescriptor> getAddressEndPoint_3029IncomingLinks(
			View view) {
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
		result.addAll(getIncomingTypeModelFacetLinks_EsbLink_4001(modelElement,
				crossReferences));
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
	public static List<EsbLinkDescriptor> getEsbLink_4001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getEsbServer_2001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getProxyService_3001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getProxyOutputConnector_3002OutgoingLinks(
			View view) {
		ProxyOutputConnector modelElement = (ProxyOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getProxyInputConnector_3003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getMessageMediator_3045OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getMessageInputConnector_3046OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getMessageOutputConnector_3047OutgoingLinks(
			View view) {
		MessageOutputConnector modelElement = (MessageOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getDropMediator_3007OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getDropMediatorInputConnector_3008OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getFilterMediator_3009OutgoingLinks(
			View view) {
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
	public static List<EsbLinkDescriptor> getMergeNode_3013OutgoingLinks(
			View view) {
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
	public static List<EsbLinkDescriptor> getMergeNodeOutputConnector_3016OutgoingLinks(
			View view) {
		MergeNodeOutputConnector modelElement = (MergeNodeOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getLogMediator_3017OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getLogMediatorInputConnector_3018OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getLogMediatorOutputConnector_3019OutgoingLinks(
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
	public static List<EsbLinkDescriptor> getPropertyMediator_3032OutgoingLinks(
			View view) {
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
	public static List<EsbLinkDescriptor> getEnrichMediator_3035OutgoingLinks(
			View view) {
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
	public static List<EsbLinkDescriptor> getXSLTMediator_3038OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getXSLTMediatorInputConnector_3039OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getXSLTMediatorOutputConnector_3040OutgoingLinks(
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
	public static List<EsbLinkDescriptor> getSwitchMediator_3041OutgoingLinks(
			View view) {
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
	public static List<EsbLinkDescriptor> getSequence_3048OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSequenceInputConnector_3049OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSequenceOutputConnector_3050OutgoingLinks(
			View view) {
		SequenceOutputConnector modelElement = (SequenceOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getEventMediator_3051OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getEventMediatorInputConnector_3052OutgoingLinks(
			View view) {
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
	public static List<EsbLinkDescriptor> getEntitlementMediator_3054OutgoingLinks(
			View view) {
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
	public static List<EsbLinkDescriptor> getClassMediator_3057OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getClassMediatorInputConnector_3058OutgoingLinks(
			View view) {
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
	public static List<EsbLinkDescriptor> getSpringMediator_3060OutgoingLinks(
			View view) {
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
	public static List<EsbLinkDescriptor> getScriptMediator_3063OutgoingLinks(
			View view) {
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
	public static List<EsbLinkDescriptor> getFaultMediator_3066OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getFaultMediatorInputConnector_3067OutgoingLinks(
			View view) {
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
	public static List<EsbLinkDescriptor> getXQueryMediator_3069OutgoingLinks(
			View view) {
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
	public static List<EsbLinkDescriptor> getCommandMediator_3072OutgoingLinks(
			View view) {
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
	public static List<EsbLinkDescriptor> getDBLookupMediator_3075OutgoingLinks(
			View view) {
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
	public static List<EsbLinkDescriptor> getDBReportMediator_3078OutgoingLinks(
			View view) {
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
	public static List<EsbLinkDescriptor> getSmooksMediator_3081OutgoingLinks(
			View view) {
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
	public static List<EsbLinkDescriptor> getSendMediator_3084OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSendMediatorInputConnector_3085OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSendMediatorOutputConnector_3086OutgoingLinks(
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
	public static List<EsbLinkDescriptor> getFailoverEndPoint_3087OutgoingLinks(
			View view) {
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
	public static List<EsbLinkDescriptor> getWSDLEndPoint_3091OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getWSDLEndPointInputConnector_3092OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getWSDLEndPointOutputConnector_3093OutgoingLinks(
			View view) {
		WSDLEndPointOutputConnector modelElement = (WSDLEndPointOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getLoadBalanceEndPoint_3094OutgoingLinks(
			View view) {
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
	public static List<EsbLinkDescriptor> getHeaderMediator_3099OutgoingLinks(
			View view) {
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
	public static List<EsbLinkDescriptor> getCloneMediator_3102OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCloneMediatorInputConnector_3103OutgoingLinks(
			View view) {
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
	public static List<EsbLinkDescriptor> getCacheMediator_3105OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCacheMediatorInputConnector_3106OutgoingLinks(
			View view) {
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
	public static List<EsbLinkDescriptor> getIterateMediator_3108OutgoingLinks(
			View view) {
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
	public static List<EsbLinkDescriptor> getAggregateMediator_3111OutgoingLinks(
			View view) {
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
	public static List<EsbLinkDescriptor> getLogMediator_3134OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getLogMediatorInputConnector_3135OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getLogMediatorOutputConnector_3136OutgoingLinks(
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
	public static List<EsbLinkDescriptor> getDropMediator_3137OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getDropMediatorInputConnector_3138OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getFilterMediator_3139OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getFilterMediatorInputConnector_3140OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getFilterMediatorPassOutputConnector_3141OutgoingLinks(
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
	public static List<EsbLinkDescriptor> getFilterMediatorFailOutputConnector_3142OutgoingLinks(
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
	public static List<EsbLinkDescriptor> getPropertyMediator_3143OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getPropertyMediatorInputConnector_3144OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getPropertyMediatorOutputConnector_3145OutgoingLinks(
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
	public static List<EsbLinkDescriptor> getEnrichMediator_3146OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getEnrichMediatorInputConnector_3147OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getEnrichMediatorOutputConnector_3148OutgoingLinks(
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
	public static List<EsbLinkDescriptor> getXSLTMediator_3149OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getXSLTMediatorInputConnector_3150OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getXSLTMediatorOutputConnector_3151OutgoingLinks(
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
	public static List<EsbLinkDescriptor> getSwitchMediator_3152OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSwitchMediatorInputConnector_3153OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSwitchCaseBranchOutputConnector_3154OutgoingLinks(
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
	public static List<EsbLinkDescriptor> getSwitchDefaultBranchOutputConnector_3155OutgoingLinks(
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
	public static List<EsbLinkDescriptor> getFaultMediator_3156OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getFaultMediatorInputConnector_3157OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getFaultMediatorOutputConnector_3158OutgoingLinks(
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
	public static List<EsbLinkDescriptor> getDBLookupMediator_3159OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getDBLookupMediatorInputConnector_3160OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getDBLookupMediatorOutputConnector_3161OutgoingLinks(
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
	public static List<EsbLinkDescriptor> getDBReportMediator_3162OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getDBReportMediatorInputConnector_3163OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getDBReportMediatorOutputConnector_3164OutgoingLinks(
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
	public static List<EsbLinkDescriptor> getSendMediator_3165OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSendMediatorInputConnector_3166OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSendMediatorOutputConnector_3167OutgoingLinks(
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
	public static List<EsbLinkDescriptor> getHeaderMediator_3168OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getHeaderMediatorInputConnector_3169OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getHeaderMediatorOutputConnector_3170OutgoingLinks(
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
	public static List<EsbLinkDescriptor> getCloneMediator_3171OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCloneMediatorInputConnector_3172OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCloneMediatorOutputConnector_3173OutgoingLinks(
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
	public static List<EsbLinkDescriptor> getCloneMediatorTargetOutputConnector_3174OutgoingLinks(
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
	public static List<EsbLinkDescriptor> getIterateMediator_3175OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getIterateMediatorInputConnector_3176OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getIterateMediatorOutputConnector_3177OutgoingLinks(
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
	public static List<EsbLinkDescriptor> getCalloutMediator_3178OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCalloutMediator_3114OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCalloutMediatorInputConnector_3181OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getCalloutMediatorOutputConnector_3182OutgoingLinks(
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
	public static List<EsbLinkDescriptor> getTransactionMediator_3179OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getTransactionMediator_3117OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getTransactionMediatorInputConnector_3183OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getTransactionMediatorOutputConnector_3184OutgoingLinks(
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
	public static List<EsbLinkDescriptor> getRMSequenceMediator_3180OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getThrottleMediator_3120OutgoingLinks(
			View view) {
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
	public static List<EsbLinkDescriptor> getRMSequenceMediator_3123OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getRMSequenceMediatorInputConnector_3185OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getRMSequenceMediatorOutputConnector_3186OutgoingLinks(
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
	public static List<EsbLinkDescriptor> getSequence_3187OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSequenceInputConnector_3188OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getSequenceOutputConnector_3189OutgoingLinks(
			View view) {
		SequenceOutputConnector modelElement = (SequenceOutputConnector) view
				.getElement();
		LinkedList<EsbLinkDescriptor> result = new LinkedList<EsbLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EsbLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getRuleMediator_3126OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getRuleMediatorInputConnector_3127OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getRuleMediatorOutputConnector_3128OutgoingLinks(
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
	public static List<EsbLinkDescriptor> getOAuthMediator_3129OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EsbLinkDescriptor> getOAuthMediatorInputConnector_3130OutgoingLinks(
			View view) {
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
	public static List<EsbLinkDescriptor> getDefaultEndPoint_3020OutgoingLinks(
			View view) {
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
	public static List<EsbLinkDescriptor> getAddressEndPoint_3029OutgoingLinks(
			View view) {
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
