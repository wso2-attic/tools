package org.wso2.carbonstudio.eclipse.gmf.esb.diagram.providers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.modelingassistant.ModelingAssistantProvider;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.*;
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
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.part.EsbDiagramEditorPlugin;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.part.Messages;

/**
 * @generated
 */
public class EsbModelingAssistantProvider extends ModelingAssistantProvider {

	/**
	 * @generated
	 */
	public List getTypesForPopupBar(IAdaptable host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart instanceof EsbDiagramEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(EsbElementTypes.EsbServer_2001);
			return types;
		}
		if (editPart instanceof EsbServerEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(5);
			types.add(EsbElementTypes.ProxyService_3001);
			types.add(EsbElementTypes.MessageMediator_3045);
			types.add(EsbElementTypes.DefaultEndPoint_3020);
			types.add(EsbElementTypes.AddressEndPoint_3029);
			types.add(EsbElementTypes.WSDLEndPoint_3091);
			return types;
		}
		if (editPart instanceof ProxyServiceEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(EsbElementTypes.ProxyOutputConnector_3002);
			types.add(EsbElementTypes.ProxyInputConnector_3003);
			return types;
		}
		if (editPart instanceof MessageMediatorEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(EsbElementTypes.MessageInputConnector_3046);
			types.add(EsbElementTypes.MessageOutputConnector_3047);
			return types;
		}
		if (editPart instanceof DefaultEndPointEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(EsbElementTypes.DefaultEndPointInputConnector_3021);
			types.add(EsbElementTypes.DefaultEndPointOutputConnector_3022);
			return types;
		}
		if (editPart instanceof AddressEndPointEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(EsbElementTypes.AddressEndPointInputConnector_3030);
			types.add(EsbElementTypes.AddressEndPointOutputConnector_3031);
			return types;
		}
		if (editPart instanceof DropMediatorEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(EsbElementTypes.DropMediatorInputConnector_3008);
			return types;
		}
		if (editPart instanceof FilterMediatorEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(3);
			types.add(EsbElementTypes.FilterMediatorInputConnector_3010);
			types.add(EsbElementTypes.FilterMediatorPassOutputConnector_3011);
			types.add(EsbElementTypes.FilterMediatorFailOutputConnector_3012);
			return types;
		}
		if (editPart instanceof MergeNodeEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(3);
			types.add(EsbElementTypes.MergeNodeFirstInputConnector_3014);
			types.add(EsbElementTypes.MergeNodeSecondInputConnector_3015);
			types.add(EsbElementTypes.MergeNodeOutputConnector_3016);
			return types;
		}
		if (editPart instanceof LogMediatorEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(EsbElementTypes.LogMediatorInputConnector_3018);
			types.add(EsbElementTypes.LogMediatorOutputConnector_3019);
			return types;
		}
		if (editPart instanceof PropertyMediatorEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(EsbElementTypes.PropertyMediatorInputConnector_3033);
			types.add(EsbElementTypes.PropertyMediatorOutputConnector_3034);
			return types;
		}
		if (editPart instanceof EnrichMediatorEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(EsbElementTypes.EnrichMediatorInputConnector_3036);
			types.add(EsbElementTypes.EnrichMediatorOutputConnector_3037);
			return types;
		}
		if (editPart instanceof XSLTMediatorEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(EsbElementTypes.XSLTMediatorInputConnector_3039);
			types.add(EsbElementTypes.XSLTMediatorOutputConnector_3040);
			return types;
		}
		if (editPart instanceof SwitchMediatorEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(3);
			types.add(EsbElementTypes.SwitchMediatorInputConnector_3042);
			types.add(EsbElementTypes.SwitchCaseBranchOutputConnector_3043);
			types.add(EsbElementTypes.SwitchDefaultBranchOutputConnector_3044);
			return types;
		}
		if (editPart instanceof SequenceEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(EsbElementTypes.SequenceInputConnector_3049);
			types.add(EsbElementTypes.SequenceOutputConnector_3050);
			return types;
		}
		if (editPart instanceof EventMediatorEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(EsbElementTypes.EventMediatorInputConnector_3052);
			types.add(EsbElementTypes.EventMediatorOutputConnector_3053);
			return types;
		}
		if (editPart instanceof EntitlementMediatorEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(EsbElementTypes.EntitlementMediatorInputConnector_3055);
			types.add(EsbElementTypes.EntitlementMediatorOutputConnector_3056);
			return types;
		}
		if (editPart instanceof ClassMediatorEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(EsbElementTypes.ClassMediatorInputConnector_3058);
			types.add(EsbElementTypes.ClassMediatorOutputConnector_3059);
			return types;
		}
		if (editPart instanceof SpringMediatorEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(EsbElementTypes.SpringMediatorInputConnector_3061);
			types.add(EsbElementTypes.SpringMediatorOutputConnector_3062);
			return types;
		}
		if (editPart instanceof ScriptMediatorEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(EsbElementTypes.ScriptMediatorInputConnector_3064);
			types.add(EsbElementTypes.ScriptMediatorOutputConnector_3065);
			return types;
		}
		if (editPart instanceof FaultMediatorEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(EsbElementTypes.FaultMediatorInputConnector_3067);
			types.add(EsbElementTypes.FaultMediatorOutputConnector_3068);
			return types;
		}
		if (editPart instanceof XQueryMediatorEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(EsbElementTypes.XQueryMediatorInputConnector_3070);
			types.add(EsbElementTypes.XQueryMediatorOutputConnector_3071);
			return types;
		}
		if (editPart instanceof CommandMediatorEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(EsbElementTypes.CommandMediatorInputConnector_3073);
			types.add(EsbElementTypes.CommandMediatorOutputConnector_3074);
			return types;
		}
		if (editPart instanceof DBLookupMediatorEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(EsbElementTypes.DBLookupMediatorInputConnector_3076);
			types.add(EsbElementTypes.DBLookupMediatorOutputConnector_3077);
			return types;
		}
		if (editPart instanceof DBReportMediatorEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(EsbElementTypes.DBReportMediatorInputConnector_3079);
			types.add(EsbElementTypes.DBReportMediatorOutputConnector_3080);
			return types;
		}
		if (editPart instanceof SmooksMediatorEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(EsbElementTypes.SmooksMediatorInputConnector_3082);
			types.add(EsbElementTypes.SmooksMediatorOutputConnector_3083);
			return types;
		}
		if (editPart instanceof SendMediatorEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(EsbElementTypes.SendMediatorInputConnector_3085);
			types.add(EsbElementTypes.SendMediatorOutputConnector_3086);
			return types;
		}
		if (editPart instanceof FailoverEndPointEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(3);
			types.add(EsbElementTypes.FailoverEndPointInputConnector_3088);
			types.add(EsbElementTypes.FailoverEndPointOutputConnector_3090);
			types.add(EsbElementTypes.FailoverEndPointWestOutputConnector_3097);
			return types;
		}
		if (editPart instanceof WSDLEndPointEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(EsbElementTypes.WSDLEndPointInputConnector_3092);
			types.add(EsbElementTypes.WSDLEndPointOutputConnector_3093);
			return types;
		}
		if (editPart instanceof LoadBalanceEndPointEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(3);
			types.add(EsbElementTypes.LoadBalanceEndPointInputConnector_3095);
			types.add(EsbElementTypes.LoadBalanceEndPointOutputConnector_3096);
			types.add(EsbElementTypes.LoadBalanceEndPointWestOutputConnector_3098);
			return types;
		}
		if (editPart instanceof HeaderMediatorEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(EsbElementTypes.HeaderMediatorInputConnector_3100);
			types.add(EsbElementTypes.HeaderMediatorOutputConnector_3101);
			return types;
		}
		if (editPart instanceof CloneMediatorEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(3);
			types.add(EsbElementTypes.CloneMediatorInputConnector_3103);
			types.add(EsbElementTypes.CloneMediatorOutputConnector_3104);
			types.add(EsbElementTypes.CloneMediatorTargetOutputConnector_3133);
			return types;
		}
		if (editPart instanceof CacheMediatorEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(EsbElementTypes.CacheMediatorInputConnector_3106);
			types.add(EsbElementTypes.CacheMediatorOutputConnector_3107);
			return types;
		}
		if (editPart instanceof IterateMediatorEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(EsbElementTypes.IterateMediatorInputConnector_3109);
			types.add(EsbElementTypes.IterateMediatorOutputConnector_3110);
			return types;
		}
		if (editPart instanceof CalloutMediatorEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(EsbElementTypes.CalloutMediatorInputConnector_3115);
			types.add(EsbElementTypes.CalloutMediatorOutputConnector_3116);
			return types;
		}
		if (editPart instanceof TransactionMediatorEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(EsbElementTypes.TransactionMediatorInputConnector_3118);
			types.add(EsbElementTypes.TransactionMediatorOutputConnector_3119);
			return types;
		}
		if (editPart instanceof ThrottleMediatorEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(EsbElementTypes.ThrottleMediatorInputConnector_3121);
			types.add(EsbElementTypes.ThrottleMediatorOutputConnector_3122);
			return types;
		}
		if (editPart instanceof RMSequenceMediatorEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(EsbElementTypes.RMSequenceMediatorInputConnector_3124);
			types.add(EsbElementTypes.RMSequenceMediatorOutputConnector_3125);
			return types;
		}
		if (editPart instanceof RuleMediatorEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(EsbElementTypes.RuleMediatorInputConnector_3127);
			types.add(EsbElementTypes.RuleMediatorOutputConnector_3128);
			return types;
		}
		if (editPart instanceof OAuthMediatorEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(EsbElementTypes.OAuthMediatorInputConnector_3130);
			types.add(EsbElementTypes.OAuthMediatorOutputConnector_3131);
			return types;
		}
		if (editPart instanceof AggregateMediatorEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(3);
			types.add(EsbElementTypes.AggregateMediatorInputConnector_3112);
			types.add(EsbElementTypes.AggregateMediatorOutputConnector_3113);
			types.add(EsbElementTypes.AggregateMediatorOnCompleteOutputConnector_3132);
			return types;
		}
		if (editPart instanceof LogMediator2EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(EsbElementTypes.LogMediatorInputConnector_3135);
			types.add(EsbElementTypes.LogMediatorOutputConnector_3136);
			return types;
		}
		if (editPart instanceof DropMediator2EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(EsbElementTypes.DropMediatorInputConnector_3138);
			return types;
		}
		if (editPart instanceof FilterMediator2EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(3);
			types.add(EsbElementTypes.FilterMediatorInputConnector_3140);
			types.add(EsbElementTypes.FilterMediatorPassOutputConnector_3141);
			types.add(EsbElementTypes.FilterMediatorFailOutputConnector_3142);
			return types;
		}
		if (editPart instanceof PropertyMediator2EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(EsbElementTypes.PropertyMediatorInputConnector_3144);
			types.add(EsbElementTypes.PropertyMediatorOutputConnector_3145);
			return types;
		}
		if (editPart instanceof EnrichMediator2EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(EsbElementTypes.EnrichMediatorInputConnector_3147);
			types.add(EsbElementTypes.EnrichMediatorOutputConnector_3148);
			return types;
		}
		if (editPart instanceof XSLTMediator2EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(EsbElementTypes.XSLTMediatorInputConnector_3150);
			types.add(EsbElementTypes.XSLTMediatorOutputConnector_3151);
			return types;
		}
		if (editPart instanceof SwitchMediator2EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(3);
			types.add(EsbElementTypes.SwitchMediatorInputConnector_3153);
			types.add(EsbElementTypes.SwitchCaseBranchOutputConnector_3154);
			types.add(EsbElementTypes.SwitchDefaultBranchOutputConnector_3155);
			return types;
		}
		if (editPart instanceof FaultMediator2EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(EsbElementTypes.FaultMediatorInputConnector_3157);
			types.add(EsbElementTypes.FaultMediatorOutputConnector_3158);
			return types;
		}
		if (editPart instanceof DBLookupMediator2EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(EsbElementTypes.DBLookupMediatorInputConnector_3160);
			types.add(EsbElementTypes.DBLookupMediatorOutputConnector_3161);
			return types;
		}
		if (editPart instanceof DBReportMediator2EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(EsbElementTypes.DBReportMediatorInputConnector_3163);
			types.add(EsbElementTypes.DBReportMediatorOutputConnector_3164);
			return types;
		}
		if (editPart instanceof SendMediator2EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(EsbElementTypes.SendMediatorInputConnector_3166);
			types.add(EsbElementTypes.SendMediatorOutputConnector_3167);
			return types;
		}
		if (editPart instanceof HeaderMediator2EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(EsbElementTypes.HeaderMediatorInputConnector_3169);
			types.add(EsbElementTypes.HeaderMediatorOutputConnector_3170);
			return types;
		}
		if (editPart instanceof CloneMediator2EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(3);
			types.add(EsbElementTypes.CloneMediatorInputConnector_3172);
			types.add(EsbElementTypes.CloneMediatorOutputConnector_3173);
			types.add(EsbElementTypes.CloneMediatorTargetOutputConnector_3174);
			return types;
		}
		if (editPart instanceof IterateMediator2EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(EsbElementTypes.IterateMediatorInputConnector_3176);
			types.add(EsbElementTypes.IterateMediatorOutputConnector_3177);
			return types;
		}
		if (editPart instanceof CalloutMediator2EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(EsbElementTypes.CalloutMediatorInputConnector_3181);
			types.add(EsbElementTypes.CalloutMediatorOutputConnector_3182);
			return types;
		}
		if (editPart instanceof TransactionMediator2EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(EsbElementTypes.TransactionMediatorInputConnector_3183);
			types.add(EsbElementTypes.TransactionMediatorOutputConnector_3184);
			return types;
		}
		if (editPart instanceof RMSequenceMediator2EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(EsbElementTypes.RMSequenceMediatorInputConnector_3185);
			types.add(EsbElementTypes.RMSequenceMediatorOutputConnector_3186);
			return types;
		}
		if (editPart instanceof Sequence2EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(EsbElementTypes.SequenceInputConnector_3188);
			types.add(EsbElementTypes.SequenceOutputConnector_3189);
			return types;
		}
		if (editPart instanceof EsbServerContentsCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(34);
			types.add(EsbElementTypes.DropMediator_3007);
			types.add(EsbElementTypes.FilterMediator_3009);
			types.add(EsbElementTypes.MergeNode_3013);
			types.add(EsbElementTypes.LogMediator_3017);
			types.add(EsbElementTypes.PropertyMediator_3032);
			types.add(EsbElementTypes.EnrichMediator_3035);
			types.add(EsbElementTypes.XSLTMediator_3038);
			types.add(EsbElementTypes.SwitchMediator_3041);
			types.add(EsbElementTypes.Sequence_3048);
			types.add(EsbElementTypes.EventMediator_3051);
			types.add(EsbElementTypes.EntitlementMediator_3054);
			types.add(EsbElementTypes.ClassMediator_3057);
			types.add(EsbElementTypes.SpringMediator_3060);
			types.add(EsbElementTypes.ScriptMediator_3063);
			types.add(EsbElementTypes.FaultMediator_3066);
			types.add(EsbElementTypes.XQueryMediator_3069);
			types.add(EsbElementTypes.CommandMediator_3072);
			types.add(EsbElementTypes.DBLookupMediator_3075);
			types.add(EsbElementTypes.DBReportMediator_3078);
			types.add(EsbElementTypes.SmooksMediator_3081);
			types.add(EsbElementTypes.SendMediator_3084);
			types.add(EsbElementTypes.FailoverEndPoint_3087);
			types.add(EsbElementTypes.LoadBalanceEndPoint_3094);
			types.add(EsbElementTypes.HeaderMediator_3099);
			types.add(EsbElementTypes.CloneMediator_3102);
			types.add(EsbElementTypes.CacheMediator_3105);
			types.add(EsbElementTypes.IterateMediator_3108);
			types.add(EsbElementTypes.CalloutMediator_3114);
			types.add(EsbElementTypes.TransactionMediator_3117);
			types.add(EsbElementTypes.ThrottleMediator_3120);
			types.add(EsbElementTypes.RMSequenceMediator_3123);
			types.add(EsbElementTypes.RuleMediator_3126);
			types.add(EsbElementTypes.OAuthMediator_3129);
			types.add(EsbElementTypes.AggregateMediator_3111);
			return types;
		}
		if (editPart instanceof AggregateMediatorAggregateCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(18);
			types.add(EsbElementTypes.LogMediator_3134);
			types.add(EsbElementTypes.DropMediator_3137);
			types.add(EsbElementTypes.FilterMediator_3139);
			types.add(EsbElementTypes.PropertyMediator_3143);
			types.add(EsbElementTypes.EnrichMediator_3146);
			types.add(EsbElementTypes.XSLTMediator_3149);
			types.add(EsbElementTypes.SwitchMediator_3152);
			types.add(EsbElementTypes.FaultMediator_3156);
			types.add(EsbElementTypes.DBLookupMediator_3159);
			types.add(EsbElementTypes.DBReportMediator_3162);
			types.add(EsbElementTypes.SendMediator_3165);
			types.add(EsbElementTypes.HeaderMediator_3168);
			types.add(EsbElementTypes.CloneMediator_3171);
			types.add(EsbElementTypes.IterateMediator_3175);
			types.add(EsbElementTypes.CalloutMediator_3178);
			types.add(EsbElementTypes.TransactionMediator_3179);
			types.add(EsbElementTypes.RMSequenceMediator_3180);
			types.add(EsbElementTypes.Sequence_3187);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof ProxyOutputConnectorEditPart) {
			return ((ProxyOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof MessageOutputConnectorEditPart) {
			return ((MessageOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof DefaultEndPointOutputConnectorEditPart) {
			return ((DefaultEndPointOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof AddressEndPointOutputConnectorEditPart) {
			return ((AddressEndPointOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof FilterMediatorPassOutputConnectorEditPart) {
			return ((FilterMediatorPassOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof FilterMediatorFailOutputConnectorEditPart) {
			return ((FilterMediatorFailOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof MergeNodeOutputConnectorEditPart) {
			return ((MergeNodeOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof LogMediatorOutputConnectorEditPart) {
			return ((LogMediatorOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof PropertyMediatorOutputConnectorEditPart) {
			return ((PropertyMediatorOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof EnrichMediatorOutputConnectorEditPart) {
			return ((EnrichMediatorOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof XSLTMediatorOutputConnectorEditPart) {
			return ((XSLTMediatorOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof SwitchCaseBranchOutputConnectorEditPart) {
			return ((SwitchCaseBranchOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof SwitchDefaultBranchOutputConnectorEditPart) {
			return ((SwitchDefaultBranchOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof SequenceOutputConnectorEditPart) {
			return ((SequenceOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof EventMediatorOutputConnectorEditPart) {
			return ((EventMediatorOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof EntitlementMediatorOutputConnectorEditPart) {
			return ((EntitlementMediatorOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ClassMediatorOutputConnectorEditPart) {
			return ((ClassMediatorOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof SpringMediatorOutputConnectorEditPart) {
			return ((SpringMediatorOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ScriptMediatorOutputConnectorEditPart) {
			return ((ScriptMediatorOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof FaultMediatorOutputConnectorEditPart) {
			return ((FaultMediatorOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof XQueryMediatorOutputConnectorEditPart) {
			return ((XQueryMediatorOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof CommandMediatorOutputConnectorEditPart) {
			return ((CommandMediatorOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof DBLookupMediatorOutputConnectorEditPart) {
			return ((DBLookupMediatorOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof DBReportMediatorOutputConnectorEditPart) {
			return ((DBReportMediatorOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof SmooksMediatorOutputConnectorEditPart) {
			return ((SmooksMediatorOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof SendMediatorOutputConnectorEditPart) {
			return ((SendMediatorOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof FailoverEndPointOutputConnectorEditPart) {
			return ((FailoverEndPointOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof FailoverEndPointWestOutputConnectorEditPart) {
			return ((FailoverEndPointWestOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof WSDLEndPointOutputConnectorEditPart) {
			return ((WSDLEndPointOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof LoadBalanceEndPointOutputConnectorEditPart) {
			return ((LoadBalanceEndPointOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof LoadBalanceEndPointWestOutputConnectorEditPart) {
			return ((LoadBalanceEndPointWestOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof HeaderMediatorOutputConnectorEditPart) {
			return ((HeaderMediatorOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof CloneMediatorOutputConnectorEditPart) {
			return ((CloneMediatorOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof CloneMediatorTargetOutputConnectorEditPart) {
			return ((CloneMediatorTargetOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof CacheMediatorOutputConnectorEditPart) {
			return ((CacheMediatorOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof IterateMediatorOutputConnectorEditPart) {
			return ((IterateMediatorOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof CalloutMediatorOutputConnectorEditPart) {
			return ((CalloutMediatorOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof TransactionMediatorOutputConnectorEditPart) {
			return ((TransactionMediatorOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ThrottleMediatorOutputConnectorEditPart) {
			return ((ThrottleMediatorOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof RMSequenceMediatorOutputConnectorEditPart) {
			return ((RMSequenceMediatorOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof RuleMediatorOutputConnectorEditPart) {
			return ((RuleMediatorOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof OAuthMediatorOutputConnectorEditPart) {
			return ((OAuthMediatorOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof AggregateMediatorOutputConnectorEditPart) {
			return ((AggregateMediatorOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof AggregateMediatorOnCompleteOutputConnectorEditPart) {
			return ((AggregateMediatorOnCompleteOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof LogMediatorOutputConnector2EditPart) {
			return ((LogMediatorOutputConnector2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof FilterMediatorPassOutputConnector2EditPart) {
			return ((FilterMediatorPassOutputConnector2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof FilterMediatorFailOutputConnector2EditPart) {
			return ((FilterMediatorFailOutputConnector2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof PropertyMediatorOutputConnector2EditPart) {
			return ((PropertyMediatorOutputConnector2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof EnrichMediatorOutputConnector2EditPart) {
			return ((EnrichMediatorOutputConnector2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof XSLTMediatorOutputConnector2EditPart) {
			return ((XSLTMediatorOutputConnector2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof SwitchCaseBranchOutputConnector2EditPart) {
			return ((SwitchCaseBranchOutputConnector2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof SwitchDefaultBranchOutputConnector2EditPart) {
			return ((SwitchDefaultBranchOutputConnector2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof FaultMediatorOutputConnector2EditPart) {
			return ((FaultMediatorOutputConnector2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof DBLookupMediatorOutputConnector2EditPart) {
			return ((DBLookupMediatorOutputConnector2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof DBReportMediatorOutputConnector2EditPart) {
			return ((DBReportMediatorOutputConnector2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof SendMediatorOutputConnector2EditPart) {
			return ((SendMediatorOutputConnector2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof HeaderMediatorOutputConnector2EditPart) {
			return ((HeaderMediatorOutputConnector2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof CloneMediatorOutputConnector2EditPart) {
			return ((CloneMediatorOutputConnector2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof CloneMediatorTargetOutputConnector2EditPart) {
			return ((CloneMediatorTargetOutputConnector2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof IterateMediatorOutputConnector2EditPart) {
			return ((IterateMediatorOutputConnector2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof CalloutMediatorOutputConnector2EditPart) {
			return ((CalloutMediatorOutputConnector2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof TransactionMediatorOutputConnector2EditPart) {
			return ((TransactionMediatorOutputConnector2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof RMSequenceMediatorOutputConnector2EditPart) {
			return ((RMSequenceMediatorOutputConnector2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof SequenceOutputConnector2EditPart) {
			return ((SequenceOutputConnector2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof ProxyInputConnectorEditPart) {
			return ((ProxyInputConnectorEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof MessageInputConnectorEditPart) {
			return ((MessageInputConnectorEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof DefaultEndPointInputConnectorEditPart) {
			return ((DefaultEndPointInputConnectorEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof AddressEndPointInputConnectorEditPart) {
			return ((AddressEndPointInputConnectorEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof DropMediatorInputConnectorEditPart) {
			return ((DropMediatorInputConnectorEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof FilterMediatorInputConnectorEditPart) {
			return ((FilterMediatorInputConnectorEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof MergeNodeFirstInputConnectorEditPart) {
			return ((MergeNodeFirstInputConnectorEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof MergeNodeSecondInputConnectorEditPart) {
			return ((MergeNodeSecondInputConnectorEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof LogMediatorInputConnectorEditPart) {
			return ((LogMediatorInputConnectorEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof PropertyMediatorInputConnectorEditPart) {
			return ((PropertyMediatorInputConnectorEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof EnrichMediatorInputConnectorEditPart) {
			return ((EnrichMediatorInputConnectorEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof XSLTMediatorInputConnectorEditPart) {
			return ((XSLTMediatorInputConnectorEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof SwitchMediatorInputConnectorEditPart) {
			return ((SwitchMediatorInputConnectorEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof SequenceInputConnectorEditPart) {
			return ((SequenceInputConnectorEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof EventMediatorInputConnectorEditPart) {
			return ((EventMediatorInputConnectorEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof EntitlementMediatorInputConnectorEditPart) {
			return ((EntitlementMediatorInputConnectorEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ClassMediatorInputConnectorEditPart) {
			return ((ClassMediatorInputConnectorEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof SpringMediatorInputConnectorEditPart) {
			return ((SpringMediatorInputConnectorEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ScriptMediatorInputConnectorEditPart) {
			return ((ScriptMediatorInputConnectorEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof FaultMediatorInputConnectorEditPart) {
			return ((FaultMediatorInputConnectorEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof XQueryMediatorInputConnectorEditPart) {
			return ((XQueryMediatorInputConnectorEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof CommandMediatorInputConnectorEditPart) {
			return ((CommandMediatorInputConnectorEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof DBLookupMediatorInputConnectorEditPart) {
			return ((DBLookupMediatorInputConnectorEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof DBReportMediatorInputConnectorEditPart) {
			return ((DBReportMediatorInputConnectorEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof SmooksMediatorInputConnectorEditPart) {
			return ((SmooksMediatorInputConnectorEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof SendMediatorInputConnectorEditPart) {
			return ((SendMediatorInputConnectorEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof FailoverEndPointInputConnectorEditPart) {
			return ((FailoverEndPointInputConnectorEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof WSDLEndPointInputConnectorEditPart) {
			return ((WSDLEndPointInputConnectorEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof LoadBalanceEndPointInputConnectorEditPart) {
			return ((LoadBalanceEndPointInputConnectorEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof HeaderMediatorInputConnectorEditPart) {
			return ((HeaderMediatorInputConnectorEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof CloneMediatorInputConnectorEditPart) {
			return ((CloneMediatorInputConnectorEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof CacheMediatorInputConnectorEditPart) {
			return ((CacheMediatorInputConnectorEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof IterateMediatorInputConnectorEditPart) {
			return ((IterateMediatorInputConnectorEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof CalloutMediatorInputConnectorEditPart) {
			return ((CalloutMediatorInputConnectorEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof TransactionMediatorInputConnectorEditPart) {
			return ((TransactionMediatorInputConnectorEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ThrottleMediatorInputConnectorEditPart) {
			return ((ThrottleMediatorInputConnectorEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof RMSequenceMediatorInputConnectorEditPart) {
			return ((RMSequenceMediatorInputConnectorEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof RuleMediatorInputConnectorEditPart) {
			return ((RuleMediatorInputConnectorEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof OAuthMediatorInputConnectorEditPart) {
			return ((OAuthMediatorInputConnectorEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof AggregateMediatorInputConnectorEditPart) {
			return ((AggregateMediatorInputConnectorEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof LogMediatorInputConnector2EditPart) {
			return ((LogMediatorInputConnector2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof DropMediatorInputConnector2EditPart) {
			return ((DropMediatorInputConnector2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof FilterMediatorInputConnector2EditPart) {
			return ((FilterMediatorInputConnector2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof PropertyMediatorInputConnector2EditPart) {
			return ((PropertyMediatorInputConnector2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof EnrichMediatorInputConnector2EditPart) {
			return ((EnrichMediatorInputConnector2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof XSLTMediatorInputConnector2EditPart) {
			return ((XSLTMediatorInputConnector2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof SwitchMediatorInputConnector2EditPart) {
			return ((SwitchMediatorInputConnector2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof FaultMediatorInputConnector2EditPart) {
			return ((FaultMediatorInputConnector2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof DBLookupMediatorInputConnector2EditPart) {
			return ((DBLookupMediatorInputConnector2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof DBReportMediatorInputConnector2EditPart) {
			return ((DBReportMediatorInputConnector2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof SendMediatorInputConnector2EditPart) {
			return ((SendMediatorInputConnector2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof HeaderMediatorInputConnector2EditPart) {
			return ((HeaderMediatorInputConnector2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof CloneMediatorInputConnector2EditPart) {
			return ((CloneMediatorInputConnector2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof IterateMediatorInputConnector2EditPart) {
			return ((IterateMediatorInputConnector2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof CalloutMediatorInputConnector2EditPart) {
			return ((CalloutMediatorInputConnector2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof TransactionMediatorInputConnector2EditPart) {
			return ((TransactionMediatorInputConnector2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof RMSequenceMediatorInputConnector2EditPart) {
			return ((RMSequenceMediatorInputConnector2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof SequenceInputConnector2EditPart) {
			return ((SequenceInputConnector2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof ProxyOutputConnectorEditPart) {
			return ((ProxyOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof MessageOutputConnectorEditPart) {
			return ((MessageOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof DefaultEndPointOutputConnectorEditPart) {
			return ((DefaultEndPointOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof AddressEndPointOutputConnectorEditPart) {
			return ((AddressEndPointOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof FilterMediatorPassOutputConnectorEditPart) {
			return ((FilterMediatorPassOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof FilterMediatorFailOutputConnectorEditPart) {
			return ((FilterMediatorFailOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof MergeNodeOutputConnectorEditPart) {
			return ((MergeNodeOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof LogMediatorOutputConnectorEditPart) {
			return ((LogMediatorOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof PropertyMediatorOutputConnectorEditPart) {
			return ((PropertyMediatorOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof EnrichMediatorOutputConnectorEditPart) {
			return ((EnrichMediatorOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof XSLTMediatorOutputConnectorEditPart) {
			return ((XSLTMediatorOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof SwitchCaseBranchOutputConnectorEditPart) {
			return ((SwitchCaseBranchOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof SwitchDefaultBranchOutputConnectorEditPart) {
			return ((SwitchDefaultBranchOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof SequenceOutputConnectorEditPart) {
			return ((SequenceOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof EventMediatorOutputConnectorEditPart) {
			return ((EventMediatorOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof EntitlementMediatorOutputConnectorEditPart) {
			return ((EntitlementMediatorOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ClassMediatorOutputConnectorEditPart) {
			return ((ClassMediatorOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof SpringMediatorOutputConnectorEditPart) {
			return ((SpringMediatorOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ScriptMediatorOutputConnectorEditPart) {
			return ((ScriptMediatorOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof FaultMediatorOutputConnectorEditPart) {
			return ((FaultMediatorOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof XQueryMediatorOutputConnectorEditPart) {
			return ((XQueryMediatorOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof CommandMediatorOutputConnectorEditPart) {
			return ((CommandMediatorOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof DBLookupMediatorOutputConnectorEditPart) {
			return ((DBLookupMediatorOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof DBReportMediatorOutputConnectorEditPart) {
			return ((DBReportMediatorOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof SmooksMediatorOutputConnectorEditPart) {
			return ((SmooksMediatorOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof SendMediatorOutputConnectorEditPart) {
			return ((SendMediatorOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof FailoverEndPointOutputConnectorEditPart) {
			return ((FailoverEndPointOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof FailoverEndPointWestOutputConnectorEditPart) {
			return ((FailoverEndPointWestOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof WSDLEndPointOutputConnectorEditPart) {
			return ((WSDLEndPointOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof LoadBalanceEndPointOutputConnectorEditPart) {
			return ((LoadBalanceEndPointOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof LoadBalanceEndPointWestOutputConnectorEditPart) {
			return ((LoadBalanceEndPointWestOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof HeaderMediatorOutputConnectorEditPart) {
			return ((HeaderMediatorOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof CloneMediatorOutputConnectorEditPart) {
			return ((CloneMediatorOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof CloneMediatorTargetOutputConnectorEditPart) {
			return ((CloneMediatorTargetOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof CacheMediatorOutputConnectorEditPart) {
			return ((CacheMediatorOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof IterateMediatorOutputConnectorEditPart) {
			return ((IterateMediatorOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof CalloutMediatorOutputConnectorEditPart) {
			return ((CalloutMediatorOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof TransactionMediatorOutputConnectorEditPart) {
			return ((TransactionMediatorOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ThrottleMediatorOutputConnectorEditPart) {
			return ((ThrottleMediatorOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof RMSequenceMediatorOutputConnectorEditPart) {
			return ((RMSequenceMediatorOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof RuleMediatorOutputConnectorEditPart) {
			return ((RuleMediatorOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof OAuthMediatorOutputConnectorEditPart) {
			return ((OAuthMediatorOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof AggregateMediatorOutputConnectorEditPart) {
			return ((AggregateMediatorOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof AggregateMediatorOnCompleteOutputConnectorEditPart) {
			return ((AggregateMediatorOnCompleteOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof LogMediatorOutputConnector2EditPart) {
			return ((LogMediatorOutputConnector2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof FilterMediatorPassOutputConnector2EditPart) {
			return ((FilterMediatorPassOutputConnector2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof FilterMediatorFailOutputConnector2EditPart) {
			return ((FilterMediatorFailOutputConnector2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof PropertyMediatorOutputConnector2EditPart) {
			return ((PropertyMediatorOutputConnector2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof EnrichMediatorOutputConnector2EditPart) {
			return ((EnrichMediatorOutputConnector2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof XSLTMediatorOutputConnector2EditPart) {
			return ((XSLTMediatorOutputConnector2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof SwitchCaseBranchOutputConnector2EditPart) {
			return ((SwitchCaseBranchOutputConnector2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof SwitchDefaultBranchOutputConnector2EditPart) {
			return ((SwitchDefaultBranchOutputConnector2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof FaultMediatorOutputConnector2EditPart) {
			return ((FaultMediatorOutputConnector2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof DBLookupMediatorOutputConnector2EditPart) {
			return ((DBLookupMediatorOutputConnector2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof DBReportMediatorOutputConnector2EditPart) {
			return ((DBReportMediatorOutputConnector2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof SendMediatorOutputConnector2EditPart) {
			return ((SendMediatorOutputConnector2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof HeaderMediatorOutputConnector2EditPart) {
			return ((HeaderMediatorOutputConnector2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof CloneMediatorOutputConnector2EditPart) {
			return ((CloneMediatorOutputConnector2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof CloneMediatorTargetOutputConnector2EditPart) {
			return ((CloneMediatorTargetOutputConnector2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof IterateMediatorOutputConnector2EditPart) {
			return ((IterateMediatorOutputConnector2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof CalloutMediatorOutputConnector2EditPart) {
			return ((CalloutMediatorOutputConnector2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof TransactionMediatorOutputConnector2EditPart) {
			return ((TransactionMediatorOutputConnector2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof RMSequenceMediatorOutputConnector2EditPart) {
			return ((RMSequenceMediatorOutputConnector2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof SequenceOutputConnector2EditPart) {
			return ((SequenceOutputConnector2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof ProxyInputConnectorEditPart) {
			return ((ProxyInputConnectorEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof MessageInputConnectorEditPart) {
			return ((MessageInputConnectorEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof DefaultEndPointInputConnectorEditPart) {
			return ((DefaultEndPointInputConnectorEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof AddressEndPointInputConnectorEditPart) {
			return ((AddressEndPointInputConnectorEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof DropMediatorInputConnectorEditPart) {
			return ((DropMediatorInputConnectorEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof FilterMediatorInputConnectorEditPart) {
			return ((FilterMediatorInputConnectorEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof MergeNodeFirstInputConnectorEditPart) {
			return ((MergeNodeFirstInputConnectorEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof MergeNodeSecondInputConnectorEditPart) {
			return ((MergeNodeSecondInputConnectorEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof LogMediatorInputConnectorEditPart) {
			return ((LogMediatorInputConnectorEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof PropertyMediatorInputConnectorEditPart) {
			return ((PropertyMediatorInputConnectorEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof EnrichMediatorInputConnectorEditPart) {
			return ((EnrichMediatorInputConnectorEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof XSLTMediatorInputConnectorEditPart) {
			return ((XSLTMediatorInputConnectorEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof SwitchMediatorInputConnectorEditPart) {
			return ((SwitchMediatorInputConnectorEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof SequenceInputConnectorEditPart) {
			return ((SequenceInputConnectorEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof EventMediatorInputConnectorEditPart) {
			return ((EventMediatorInputConnectorEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof EntitlementMediatorInputConnectorEditPart) {
			return ((EntitlementMediatorInputConnectorEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ClassMediatorInputConnectorEditPart) {
			return ((ClassMediatorInputConnectorEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof SpringMediatorInputConnectorEditPart) {
			return ((SpringMediatorInputConnectorEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ScriptMediatorInputConnectorEditPart) {
			return ((ScriptMediatorInputConnectorEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof FaultMediatorInputConnectorEditPart) {
			return ((FaultMediatorInputConnectorEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof XQueryMediatorInputConnectorEditPart) {
			return ((XQueryMediatorInputConnectorEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof CommandMediatorInputConnectorEditPart) {
			return ((CommandMediatorInputConnectorEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof DBLookupMediatorInputConnectorEditPart) {
			return ((DBLookupMediatorInputConnectorEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof DBReportMediatorInputConnectorEditPart) {
			return ((DBReportMediatorInputConnectorEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof SmooksMediatorInputConnectorEditPart) {
			return ((SmooksMediatorInputConnectorEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof SendMediatorInputConnectorEditPart) {
			return ((SendMediatorInputConnectorEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof FailoverEndPointInputConnectorEditPart) {
			return ((FailoverEndPointInputConnectorEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof WSDLEndPointInputConnectorEditPart) {
			return ((WSDLEndPointInputConnectorEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof LoadBalanceEndPointInputConnectorEditPart) {
			return ((LoadBalanceEndPointInputConnectorEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof HeaderMediatorInputConnectorEditPart) {
			return ((HeaderMediatorInputConnectorEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof CloneMediatorInputConnectorEditPart) {
			return ((CloneMediatorInputConnectorEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof CacheMediatorInputConnectorEditPart) {
			return ((CacheMediatorInputConnectorEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof IterateMediatorInputConnectorEditPart) {
			return ((IterateMediatorInputConnectorEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof CalloutMediatorInputConnectorEditPart) {
			return ((CalloutMediatorInputConnectorEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof TransactionMediatorInputConnectorEditPart) {
			return ((TransactionMediatorInputConnectorEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ThrottleMediatorInputConnectorEditPart) {
			return ((ThrottleMediatorInputConnectorEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof RMSequenceMediatorInputConnectorEditPart) {
			return ((RMSequenceMediatorInputConnectorEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof RuleMediatorInputConnectorEditPart) {
			return ((RuleMediatorInputConnectorEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof OAuthMediatorInputConnectorEditPart) {
			return ((OAuthMediatorInputConnectorEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof AggregateMediatorInputConnectorEditPart) {
			return ((AggregateMediatorInputConnectorEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof LogMediatorInputConnector2EditPart) {
			return ((LogMediatorInputConnector2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof DropMediatorInputConnector2EditPart) {
			return ((DropMediatorInputConnector2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof FilterMediatorInputConnector2EditPart) {
			return ((FilterMediatorInputConnector2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof PropertyMediatorInputConnector2EditPart) {
			return ((PropertyMediatorInputConnector2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof EnrichMediatorInputConnector2EditPart) {
			return ((EnrichMediatorInputConnector2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof XSLTMediatorInputConnector2EditPart) {
			return ((XSLTMediatorInputConnector2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof SwitchMediatorInputConnector2EditPart) {
			return ((SwitchMediatorInputConnector2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof FaultMediatorInputConnector2EditPart) {
			return ((FaultMediatorInputConnector2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof DBLookupMediatorInputConnector2EditPart) {
			return ((DBLookupMediatorInputConnector2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof DBReportMediatorInputConnector2EditPart) {
			return ((DBReportMediatorInputConnector2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof SendMediatorInputConnector2EditPart) {
			return ((SendMediatorInputConnector2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof HeaderMediatorInputConnector2EditPart) {
			return ((HeaderMediatorInputConnector2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof CloneMediatorInputConnector2EditPart) {
			return ((CloneMediatorInputConnector2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof IterateMediatorInputConnector2EditPart) {
			return ((IterateMediatorInputConnector2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof CalloutMediatorInputConnector2EditPart) {
			return ((CalloutMediatorInputConnector2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof TransactionMediatorInputConnector2EditPart) {
			return ((TransactionMediatorInputConnector2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof RMSequenceMediatorInputConnector2EditPart) {
			return ((RMSequenceMediatorInputConnector2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof SequenceInputConnector2EditPart) {
			return ((SequenceInputConnector2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof ProxyOutputConnectorEditPart) {
			return ((ProxyOutputConnectorEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof MessageOutputConnectorEditPart) {
			return ((MessageOutputConnectorEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof DefaultEndPointOutputConnectorEditPart) {
			return ((DefaultEndPointOutputConnectorEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof AddressEndPointOutputConnectorEditPart) {
			return ((AddressEndPointOutputConnectorEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof FilterMediatorPassOutputConnectorEditPart) {
			return ((FilterMediatorPassOutputConnectorEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof FilterMediatorFailOutputConnectorEditPart) {
			return ((FilterMediatorFailOutputConnectorEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof MergeNodeOutputConnectorEditPart) {
			return ((MergeNodeOutputConnectorEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof LogMediatorOutputConnectorEditPart) {
			return ((LogMediatorOutputConnectorEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof PropertyMediatorOutputConnectorEditPart) {
			return ((PropertyMediatorOutputConnectorEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof EnrichMediatorOutputConnectorEditPart) {
			return ((EnrichMediatorOutputConnectorEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof XSLTMediatorOutputConnectorEditPart) {
			return ((XSLTMediatorOutputConnectorEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof SwitchCaseBranchOutputConnectorEditPart) {
			return ((SwitchCaseBranchOutputConnectorEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof SwitchDefaultBranchOutputConnectorEditPart) {
			return ((SwitchDefaultBranchOutputConnectorEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof SequenceOutputConnectorEditPart) {
			return ((SequenceOutputConnectorEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof EventMediatorOutputConnectorEditPart) {
			return ((EventMediatorOutputConnectorEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof EntitlementMediatorOutputConnectorEditPart) {
			return ((EntitlementMediatorOutputConnectorEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ClassMediatorOutputConnectorEditPart) {
			return ((ClassMediatorOutputConnectorEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof SpringMediatorOutputConnectorEditPart) {
			return ((SpringMediatorOutputConnectorEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ScriptMediatorOutputConnectorEditPart) {
			return ((ScriptMediatorOutputConnectorEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof FaultMediatorOutputConnectorEditPart) {
			return ((FaultMediatorOutputConnectorEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof XQueryMediatorOutputConnectorEditPart) {
			return ((XQueryMediatorOutputConnectorEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof CommandMediatorOutputConnectorEditPart) {
			return ((CommandMediatorOutputConnectorEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof DBLookupMediatorOutputConnectorEditPart) {
			return ((DBLookupMediatorOutputConnectorEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof DBReportMediatorOutputConnectorEditPart) {
			return ((DBReportMediatorOutputConnectorEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof SmooksMediatorOutputConnectorEditPart) {
			return ((SmooksMediatorOutputConnectorEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof SendMediatorOutputConnectorEditPart) {
			return ((SendMediatorOutputConnectorEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof FailoverEndPointOutputConnectorEditPart) {
			return ((FailoverEndPointOutputConnectorEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof FailoverEndPointWestOutputConnectorEditPart) {
			return ((FailoverEndPointWestOutputConnectorEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof WSDLEndPointOutputConnectorEditPart) {
			return ((WSDLEndPointOutputConnectorEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof LoadBalanceEndPointOutputConnectorEditPart) {
			return ((LoadBalanceEndPointOutputConnectorEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof LoadBalanceEndPointWestOutputConnectorEditPart) {
			return ((LoadBalanceEndPointWestOutputConnectorEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof HeaderMediatorOutputConnectorEditPart) {
			return ((HeaderMediatorOutputConnectorEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof CloneMediatorOutputConnectorEditPart) {
			return ((CloneMediatorOutputConnectorEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof CloneMediatorTargetOutputConnectorEditPart) {
			return ((CloneMediatorTargetOutputConnectorEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof CacheMediatorOutputConnectorEditPart) {
			return ((CacheMediatorOutputConnectorEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof IterateMediatorOutputConnectorEditPart) {
			return ((IterateMediatorOutputConnectorEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof CalloutMediatorOutputConnectorEditPart) {
			return ((CalloutMediatorOutputConnectorEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof TransactionMediatorOutputConnectorEditPart) {
			return ((TransactionMediatorOutputConnectorEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ThrottleMediatorOutputConnectorEditPart) {
			return ((ThrottleMediatorOutputConnectorEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof RMSequenceMediatorOutputConnectorEditPart) {
			return ((RMSequenceMediatorOutputConnectorEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof RuleMediatorOutputConnectorEditPart) {
			return ((RuleMediatorOutputConnectorEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof OAuthMediatorOutputConnectorEditPart) {
			return ((OAuthMediatorOutputConnectorEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof AggregateMediatorOutputConnectorEditPart) {
			return ((AggregateMediatorOutputConnectorEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof AggregateMediatorOnCompleteOutputConnectorEditPart) {
			return ((AggregateMediatorOnCompleteOutputConnectorEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof LogMediatorOutputConnector2EditPart) {
			return ((LogMediatorOutputConnector2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof FilterMediatorPassOutputConnector2EditPart) {
			return ((FilterMediatorPassOutputConnector2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof FilterMediatorFailOutputConnector2EditPart) {
			return ((FilterMediatorFailOutputConnector2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof PropertyMediatorOutputConnector2EditPart) {
			return ((PropertyMediatorOutputConnector2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof EnrichMediatorOutputConnector2EditPart) {
			return ((EnrichMediatorOutputConnector2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof XSLTMediatorOutputConnector2EditPart) {
			return ((XSLTMediatorOutputConnector2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof SwitchCaseBranchOutputConnector2EditPart) {
			return ((SwitchCaseBranchOutputConnector2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof SwitchDefaultBranchOutputConnector2EditPart) {
			return ((SwitchDefaultBranchOutputConnector2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof FaultMediatorOutputConnector2EditPart) {
			return ((FaultMediatorOutputConnector2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof DBLookupMediatorOutputConnector2EditPart) {
			return ((DBLookupMediatorOutputConnector2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof DBReportMediatorOutputConnector2EditPart) {
			return ((DBReportMediatorOutputConnector2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof SendMediatorOutputConnector2EditPart) {
			return ((SendMediatorOutputConnector2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof HeaderMediatorOutputConnector2EditPart) {
			return ((HeaderMediatorOutputConnector2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof CloneMediatorOutputConnector2EditPart) {
			return ((CloneMediatorOutputConnector2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof CloneMediatorTargetOutputConnector2EditPart) {
			return ((CloneMediatorTargetOutputConnector2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof IterateMediatorOutputConnector2EditPart) {
			return ((IterateMediatorOutputConnector2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof CalloutMediatorOutputConnector2EditPart) {
			return ((CalloutMediatorOutputConnector2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof TransactionMediatorOutputConnector2EditPart) {
			return ((TransactionMediatorOutputConnector2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof RMSequenceMediatorOutputConnector2EditPart) {
			return ((RMSequenceMediatorOutputConnector2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof SequenceOutputConnector2EditPart) {
			return ((SequenceOutputConnector2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForSource(IAdaptable target,
			IElementType relationshipType) {
		return selectExistingElement(target,
				getTypesForSource(target, relationshipType));
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForTarget(IAdaptable source,
			IElementType relationshipType) {
		return selectExistingElement(source,
				getTypesForTarget(source, relationshipType));
	}

	/**
	 * @generated
	 */
	protected EObject selectExistingElement(IAdaptable host, Collection types) {
		if (types.isEmpty()) {
			return null;
		}
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart == null) {
			return null;
		}
		Diagram diagram = (Diagram) editPart.getRoot().getContents().getModel();
		HashSet<EObject> elements = new HashSet<EObject>();
		for (Iterator<EObject> it = diagram.getElement().eAllContents(); it
				.hasNext();) {
			EObject element = it.next();
			if (isApplicableElement(element, types)) {
				elements.add(element);
			}
		}
		if (elements.isEmpty()) {
			return null;
		}
		return selectElement((EObject[]) elements.toArray(new EObject[elements
				.size()]));
	}

	/**
	 * @generated
	 */
	protected boolean isApplicableElement(EObject element, Collection types) {
		IElementType type = ElementTypeRegistry.getInstance().getElementType(
				element);
		return types.contains(type);
	}

	/**
	 * @generated
	 */
	protected EObject selectElement(EObject[] elements) {
		Shell shell = Display.getCurrent().getActiveShell();
		ILabelProvider labelProvider = new AdapterFactoryLabelProvider(
				EsbDiagramEditorPlugin.getInstance()
						.getItemProvidersAdapterFactory());
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(
				shell, labelProvider);
		dialog.setMessage(Messages.EsbModelingAssistantProviderMessage);
		dialog.setTitle(Messages.EsbModelingAssistantProviderTitle);
		dialog.setMultipleSelection(false);
		dialog.setElements(elements);
		EObject selected = null;
		if (dialog.open() == Window.OK) {
			selected = (EObject) dialog.getFirstResult();
		}
		return selected;
	}
}
