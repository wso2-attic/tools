package org.wso2.developerstudio.eclipse.gmf.esb.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;
import org.wso2.developerstudio.eclipse.gmf.esb.BuilderMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.CallTemplateMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.CloneMediatorTargetOutputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.DropMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.EnqueueMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbDiagram;
import org.wso2.developerstudio.eclipse.gmf.esb.MergeNode;
import org.wso2.developerstudio.eclipse.gmf.esb.PayloadFactoryMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.RMSequenceMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.RuleMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.SendMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.Sequence;
import org.wso2.developerstudio.eclipse.gmf.esb.SmooksMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.StoreMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.SwitchCaseBranchOutputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.SwitchMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.TransactionMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.XSLTMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.*;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbDiagramEditorPlugin;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbVisualIDRegistry;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.providers.EsbElementTypes;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.providers.EsbParserProvider;

/**
 * @generated
 */
public class EsbNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		EsbDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		EsbDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof EsbNavigatorItem
				&& !isOwnView(((EsbNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof EsbNavigatorGroup) {
			EsbNavigatorGroup group = (EsbNavigatorGroup) element;
			return EsbDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof EsbNavigatorItem) {
			EsbNavigatorItem navigatorItem = (EsbNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (EsbVisualIDRegistry.getVisualID(view)) {
		case CommandMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?CommandMediator", EsbElementTypes.CommandMediator_3511); //$NON-NLS-1$
		case EnrichMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?EnrichMediatorInputConnector", EsbElementTypes.EnrichMediatorInputConnector_3036); //$NON-NLS-1$
		case FaultMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?FaultMediatorOutputConnector", EsbElementTypes.FaultMediatorOutputConnector_3068); //$NON-NLS-1$
		case EndpointFlow2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?EndpointFlow", EsbElementTypes.EndpointFlow_3580); //$NON-NLS-1$
		case MediatorFlow8EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?MediatorFlow", EsbElementTypes.MediatorFlow_3538); //$NON-NLS-1$
		case SpringMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?SpringMediator", EsbElementTypes.SpringMediator_3507); //$NON-NLS-1$
		case EnqueueMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?EnqueueMediatorInputConnector", EsbElementTypes.EnqueueMediatorInputConnector_3601); //$NON-NLS-1$
		case RuleMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?RuleMediator", EsbElementTypes.RuleMediator_3523); //$NON-NLS-1$
		case SwitchCaseContainerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?SwitchCaseContainer", EsbElementTypes.SwitchCaseContainer_3501); //$NON-NLS-1$
		case FailoverEndPointEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?FailoverEndPoint", EsbElementTypes.FailoverEndPoint_3565); //$NON-NLS-1$
		case DropMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?DropMediator", EsbElementTypes.DropMediator_3491); //$NON-NLS-1$
		case DefaultEndPointEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?DefaultEndPoint", EsbElementTypes.DefaultEndPoint_3563); //$NON-NLS-1$
		case SendMediatorEndpointOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?SendMediatorEndpointOutputConnector", EsbElementTypes.SendMediatorEndpointOutputConnector_3539); //$NON-NLS-1$
		case EnqueueMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?EnqueueMediator", EsbElementTypes.EnqueueMediator_3600); //$NON-NLS-1$
		case CacheMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?CacheMediatorInputConnector", EsbElementTypes.CacheMediatorInputConnector_3106); //$NON-NLS-1$
		case AddressEndPointEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?AddressEndPoint", EsbElementTypes.AddressEndPoint_3564); //$NON-NLS-1$
		case ThrottleOnAcceptContainerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?ThrottleOnAcceptContainer", EsbElementTypes.ThrottleOnAcceptContainer_3584); //$NON-NLS-1$
		case LogMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?LogMediator", EsbElementTypes.LogMediator_3495); //$NON-NLS-1$
		case ProxyServiceSequenceAndEndpointContainerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?ProxyServiceSequenceAndEndpointContainer", EsbElementTypes.ProxyServiceSequenceAndEndpointContainer_3487); //$NON-NLS-1$
		case ThrottleOnRejectContainerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?ThrottleOnRejectContainer", EsbElementTypes.ThrottleOnRejectContainer_3586); //$NON-NLS-1$
		case StoreMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?StoreMediatorInputConnector", EsbElementTypes.StoreMediatorInputConnector_3589); //$NON-NLS-1$
		case XSLTMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?XSLTMediatorInputConnector", EsbElementTypes.XSLTMediatorInputConnector_3039); //$NON-NLS-1$
		case MergeNodeSecondInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?MergeNodeSecondInputConnector", EsbElementTypes.MergeNodeSecondInputConnector_3015); //$NON-NLS-1$
		case ClassMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?ClassMediator", EsbElementTypes.ClassMediator_3506); //$NON-NLS-1$
		case EsbDiagramEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http:///org/wso2/developerstudio/eclipse/gmf/esb?EsbDiagram", EsbElementTypes.EsbDiagram_1000); //$NON-NLS-1$
		case IterateMediatorTargetOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?IterateMediatorTargetOutputConnector", EsbElementTypes.IterateMediatorTargetOutputConnector_3606); //$NON-NLS-1$
		case IterateMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?IterateMediatorInputConnector", EsbElementTypes.IterateMediatorInputConnector_3109); //$NON-NLS-1$
		case CacheMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?CacheMediator", EsbElementTypes.CacheMediator_3518); //$NON-NLS-1$
		case ProxyServiceEndpointContainerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?ProxyServiceEndpointContainer", EsbElementTypes.ProxyServiceEndpointContainer_3392); //$NON-NLS-1$
		case XSLTMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?XSLTMediator", EsbElementTypes.XSLTMediator_3497); //$NON-NLS-1$
		case PropertyMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?PropertyMediatorInputConnector", EsbElementTypes.PropertyMediatorInputConnector_3033); //$NON-NLS-1$
		case RMSequenceMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?RMSequenceMediatorOutputConnector", EsbElementTypes.RMSequenceMediatorOutputConnector_3125); //$NON-NLS-1$
		case EnqueueMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?EnqueueMediatorOutputConnector", EsbElementTypes.EnqueueMediatorOutputConnector_3602); //$NON-NLS-1$
		case DBLookupMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?DBLookupMediator", EsbElementTypes.DBLookupMediator_3512); //$NON-NLS-1$
		case MediatorFlow7EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?MediatorFlow", EsbElementTypes.MediatorFlow_3536); //$NON-NLS-1$
		case ThrottleMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?ThrottleMediatorInputConnector", EsbElementTypes.ThrottleMediatorInputConnector_3121); //$NON-NLS-1$
		case SwitchMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?SwitchMediatorOutputConnector", EsbElementTypes.SwitchMediatorOutputConnector_3499); //$NON-NLS-1$
		case TransactionMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?TransactionMediator", EsbElementTypes.TransactionMediator_3521); //$NON-NLS-1$
		case FilterMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?FilterMediator", EsbElementTypes.FilterMediator_3494); //$NON-NLS-1$
		case MergeNodeFirstInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?MergeNodeFirstInputConnector", EsbElementTypes.MergeNodeFirstInputConnector_3014); //$NON-NLS-1$
		case SwitchMediatorContainerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?SwitchMediatorContainer", EsbElementTypes.SwitchMediatorContainer_3500); //$NON-NLS-1$
		case AggregateMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?AggregateMediator", EsbElementTypes.AggregateMediator_3525); //$NON-NLS-1$
		case LoadBalanceEndPointOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?LoadBalanceEndPointOutputConnector", EsbElementTypes.LoadBalanceEndPointOutputConnector_3096); //$NON-NLS-1$
		case CommandMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?CommandMediatorOutputConnector", EsbElementTypes.CommandMediatorOutputConnector_3074); //$NON-NLS-1$
		case StoreMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?StoreMediator", EsbElementTypes.StoreMediator_3588); //$NON-NLS-1$
		case CloneMediatorTargetOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?CloneMediatorTargetOutputConnector", EsbElementTypes.CloneMediatorTargetOutputConnector_3133); //$NON-NLS-1$
		case EndpointFlowEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?EndpointFlow", EsbElementTypes.EndpointFlow_3562); //$NON-NLS-1$
		case SendMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?SendMediator", EsbElementTypes.SendMediator_3515); //$NON-NLS-1$
		case ClassMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?ClassMediatorInputConnector", EsbElementTypes.ClassMediatorInputConnector_3058); //$NON-NLS-1$
		case HeaderMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?HeaderMediatorInputConnector", EsbElementTypes.HeaderMediatorInputConnector_3100); //$NON-NLS-1$
		case DBReportMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?DBReportMediator", EsbElementTypes.DBReportMediator_3513); //$NON-NLS-1$
		case FilterPassContainerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?FilterPassContainer", EsbElementTypes.FilterPassContainer_3535); //$NON-NLS-1$
		case MessageMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?MessageMediator", EsbElementTypes.MessageMediator_3045); //$NON-NLS-1$
		case FaultMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?FaultMediator", EsbElementTypes.FaultMediator_3509); //$NON-NLS-1$
		case PayloadFactoryMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?PayloadFactoryMediatorOutputConnector", EsbElementTypes.PayloadFactoryMediatorOutputConnector_3599); //$NON-NLS-1$
		case MediatorFlow11EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?MediatorFlow", EsbElementTypes.MediatorFlow_3605); //$NON-NLS-1$
		case DropMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?DropMediatorInputConnector", EsbElementTypes.DropMediatorInputConnector_3008); //$NON-NLS-1$
		case LoadBalanceEndPointEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?LoadBalanceEndPoint", EsbElementTypes.LoadBalanceEndPoint_3567); //$NON-NLS-1$
		case SmooksMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?SmooksMediator", EsbElementTypes.SmooksMediator_3514); //$NON-NLS-1$
		case OAuthMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?OAuthMediatorOutputConnector", EsbElementTypes.OAuthMediatorOutputConnector_3131); //$NON-NLS-1$
		case BuilderMediatorOutputConectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?BuilderMediatorOutputConector", EsbElementTypes.BuilderMediatorOutputConector_3593); //$NON-NLS-1$
		case PayloadFactoryMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?PayloadFactoryMediatorInputConnector", EsbElementTypes.PayloadFactoryMediatorInputConnector_3598); //$NON-NLS-1$
		case SpringMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?SpringMediatorInputConnector", EsbElementTypes.SpringMediatorInputConnector_3061); //$NON-NLS-1$
		case ProxyServiceContainerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?ProxyServiceContainer", EsbElementTypes.ProxyServiceContainer_3486); //$NON-NLS-1$
		case LogMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?LogMediatorInputConnector", EsbElementTypes.LogMediatorInputConnector_3018); //$NON-NLS-1$
		case WSDLEndPointInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?WSDLEndPointInputConnector", EsbElementTypes.WSDLEndPointInputConnector_3092); //$NON-NLS-1$
		case HeaderMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?HeaderMediatorOutputConnector", EsbElementTypes.HeaderMediatorOutputConnector_3101); //$NON-NLS-1$
		case OAuthMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?OAuthMediatorInputConnector", EsbElementTypes.OAuthMediatorInputConnector_3130); //$NON-NLS-1$
		case CommandMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?CommandMediatorInputConnector", EsbElementTypes.CommandMediatorInputConnector_3073); //$NON-NLS-1$
		case ProxyServiceOutSequenceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?ProxyServiceOutSequence", EsbElementTypes.ProxyServiceOutSequence_3198); //$NON-NLS-1$
		case ScriptMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?ScriptMediatorOutputConnector", EsbElementTypes.ScriptMediatorOutputConnector_3065); //$NON-NLS-1$
		case TransactionMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?TransactionMediatorOutputConnector", EsbElementTypes.TransactionMediatorOutputConnector_3119); //$NON-NLS-1$
		case CalloutMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?CalloutMediator", EsbElementTypes.CalloutMediator_3520); //$NON-NLS-1$
		case SmooksMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?SmooksMediatorOutputConnector", EsbElementTypes.SmooksMediatorOutputConnector_3083); //$NON-NLS-1$
		case FailoverEndPointWestOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?FailoverEndPointWestOutputConnector", EsbElementTypes.FailoverEndPointWestOutputConnector_3097); //$NON-NLS-1$
		case DBLookupMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?DBLookupMediatorOutputConnector", EsbElementTypes.DBLookupMediatorOutputConnector_3077); //$NON-NLS-1$
		case PropertyMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?PropertyMediator", EsbElementTypes.PropertyMediator_3492); //$NON-NLS-1$
		case SmooksMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?SmooksMediatorInputConnector", EsbElementTypes.SmooksMediatorInputConnector_3082); //$NON-NLS-1$
		case BuilderMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?BuilderMediator", EsbElementTypes.BuilderMediator_3591); //$NON-NLS-1$
		case DefaultEndPointOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?DefaultEndPointOutputConnector", EsbElementTypes.DefaultEndPointOutputConnector_3022); //$NON-NLS-1$
		case SequenceOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?SequenceOutputConnector", EsbElementTypes.SequenceOutputConnector_3050); //$NON-NLS-1$
		case SequenceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?Sequence", EsbElementTypes.Sequence_3503); //$NON-NLS-1$
		case TransactionMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?TransactionMediatorInputConnector", EsbElementTypes.TransactionMediatorInputConnector_3118); //$NON-NLS-1$
		case CalloutMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?CalloutMediatorOutputConnector", EsbElementTypes.CalloutMediatorOutputConnector_3116); //$NON-NLS-1$
		case LoadBalanceEndPointWestOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?LoadBalanceEndPointWestOutputConnector", EsbElementTypes.LoadBalanceEndPointWestOutputConnector_3098); //$NON-NLS-1$
		case SendMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?SendMediatorInputConnector", EsbElementTypes.SendMediatorInputConnector_3085); //$NON-NLS-1$
		case PropertyMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?PropertyMediatorOutputConnector", EsbElementTypes.PropertyMediatorOutputConnector_3034); //$NON-NLS-1$
		case RuleMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?RuleMediatorOutputConnector", EsbElementTypes.RuleMediatorOutputConnector_3128); //$NON-NLS-1$
		case SwitchCaseBranchOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?SwitchCaseBranchOutputConnector", EsbElementTypes.SwitchCaseBranchOutputConnector_3043); //$NON-NLS-1$
		case FaultMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?FaultMediatorInputConnector", EsbElementTypes.FaultMediatorInputConnector_3067); //$NON-NLS-1$
		case MessageOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?MessageOutputConnector", EsbElementTypes.MessageOutputConnector_3047); //$NON-NLS-1$
		case XQueryMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?XQueryMediatorInputConnector", EsbElementTypes.XQueryMediatorInputConnector_3070); //$NON-NLS-1$
		case SpringMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?SpringMediatorOutputConnector", EsbElementTypes.SpringMediatorOutputConnector_3062); //$NON-NLS-1$
		case CallTemplateMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?CallTemplateMediatorOutputConnector", EsbElementTypes.CallTemplateMediatorOutputConnector_3596); //$NON-NLS-1$
		case ProxyOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?ProxyOutputConnector", EsbElementTypes.ProxyOutputConnector_3002); //$NON-NLS-1$
		case EventMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?EventMediatorInputConnector", EsbElementTypes.EventMediatorInputConnector_3052); //$NON-NLS-1$
		case EnrichMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?EnrichMediator", EsbElementTypes.EnrichMediator_3496); //$NON-NLS-1$
		case MediatorFlow6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?MediatorFlow", EsbElementTypes.MediatorFlow_3530); //$NON-NLS-1$
		case AggregateMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?AggregateMediatorInputConnector", EsbElementTypes.AggregateMediatorInputConnector_3112); //$NON-NLS-1$
		case EsbLinkEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///org/wso2/developerstudio/eclipse/gmf/esb?EsbLink", EsbElementTypes.EsbLink_4001); //$NON-NLS-1$
		case CloneMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?CloneMediator", EsbElementTypes.CloneMediator_3517); //$NON-NLS-1$
		case MergeNodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?MergeNode", EsbElementTypes.MergeNode_3013); //$NON-NLS-1$
		case FilterMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?FilterMediatorOutputConnector", EsbElementTypes.FilterMediatorOutputConnector_3534); //$NON-NLS-1$
		case HeaderMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?HeaderMediator", EsbElementTypes.HeaderMediator_3516); //$NON-NLS-1$
		case ScriptMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?ScriptMediator", EsbElementTypes.ScriptMediator_3508); //$NON-NLS-1$
		case RMSequenceMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?RMSequenceMediatorInputConnector", EsbElementTypes.RMSequenceMediatorInputConnector_3124); //$NON-NLS-1$
		case OAuthMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?OAuthMediator", EsbElementTypes.OAuthMediator_3524); //$NON-NLS-1$
		case WSDLEndPointEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?WSDLEndPoint", EsbElementTypes.WSDLEndPoint_3566); //$NON-NLS-1$
		case DBLookupMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?DBLookupMediatorInputConnector", EsbElementTypes.DBLookupMediatorInputConnector_3076); //$NON-NLS-1$
		case MediatorFlow5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?MediatorFlow", EsbElementTypes.MediatorFlow_3529); //$NON-NLS-1$
		case StoreMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?StoreMediatorOutputConnector", EsbElementTypes.StoreMediatorOutputConnector_3590); //$NON-NLS-1$
		case XQueryMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?XQueryMediator", EsbElementTypes.XQueryMediator_3510); //$NON-NLS-1$
		case AggregateMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?AggregateMediatorOutputConnector", EsbElementTypes.AggregateMediatorOutputConnector_3113); //$NON-NLS-1$
		case SendMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?SendMediatorOutputConnector", EsbElementTypes.SendMediatorOutputConnector_3086); //$NON-NLS-1$
		case EntitlementMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?EntitlementMediatorInputConnector", EsbElementTypes.EntitlementMediatorInputConnector_3055); //$NON-NLS-1$
		case WSDLEndPointOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?WSDLEndPointOutputConnector", EsbElementTypes.WSDLEndPointOutputConnector_3093); //$NON-NLS-1$
		case ThrottleMediatorOnRejectOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?ThrottleMediatorOnRejectOutputConnector", EsbElementTypes.ThrottleMediatorOnRejectOutputConnector_3582); //$NON-NLS-1$
		case AggregateMediatorOnCompleteOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?AggregateMediatorOnCompleteOutputConnector", EsbElementTypes.AggregateMediatorOnCompleteOutputConnector_3132); //$NON-NLS-1$
		case ThrottleMediatorOnAcceptOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?ThrottleMediatorOnAcceptOutputConnector", EsbElementTypes.ThrottleMediatorOnAcceptOutputConnector_3581); //$NON-NLS-1$
		case EntitlementMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?EntitlementMediator", EsbElementTypes.EntitlementMediator_3505); //$NON-NLS-1$
		case FailoverEndPointOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?FailoverEndPointOutputConnector", EsbElementTypes.FailoverEndPointOutputConnector_3090); //$NON-NLS-1$
		case CalloutMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?CalloutMediatorInputConnector", EsbElementTypes.CalloutMediatorInputConnector_3115); //$NON-NLS-1$
		case DefaultEndPointInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?DefaultEndPointInputConnector", EsbElementTypes.DefaultEndPointInputConnector_3021); //$NON-NLS-1$
		case AddressEndPointOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?AddressEndPointOutputConnector", EsbElementTypes.AddressEndPointOutputConnector_3031); //$NON-NLS-1$
		case MediatorFlow9EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?MediatorFlow", EsbElementTypes.MediatorFlow_3585); //$NON-NLS-1$
		case ProxyServiceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?ProxyService", EsbElementTypes.ProxyService_3001); //$NON-NLS-1$
		case MergeNodeOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?MergeNodeOutputConnector", EsbElementTypes.MergeNodeOutputConnector_3016); //$NON-NLS-1$
		case IterateMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?IterateMediator", EsbElementTypes.IterateMediator_3519); //$NON-NLS-1$
		case FilterContainerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?FilterContainer", EsbElementTypes.FilterContainer_3531); //$NON-NLS-1$
		case SwitchDefaultBranchOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?SwitchDefaultBranchOutputConnector", EsbElementTypes.SwitchDefaultBranchOutputConnector_3044); //$NON-NLS-1$
		case MediatorFlow4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?MediatorFlow", EsbElementTypes.MediatorFlow_3528); //$NON-NLS-1$
		case ProxyFaultInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?ProxyFaultInputConnector", EsbElementTypes.ProxyFaultInputConnector_3489); //$NON-NLS-1$
		case MediatorFlow3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?MediatorFlow", EsbElementTypes.MediatorFlow_3526); //$NON-NLS-1$
		case ProxyServiceFaultContainerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?ProxyServiceFaultContainer", EsbElementTypes.ProxyServiceFaultContainer_3488); //$NON-NLS-1$
		case CloneMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?CloneMediatorInputConnector", EsbElementTypes.CloneMediatorInputConnector_3103); //$NON-NLS-1$
		case IterateMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?IterateMediatorOutputConnector", EsbElementTypes.IterateMediatorOutputConnector_3110); //$NON-NLS-1$
		case RuleMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?RuleMediatorInputConnector", EsbElementTypes.RuleMediatorInputConnector_3127); //$NON-NLS-1$
		case CacheMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?CacheMediatorOutputConnector", EsbElementTypes.CacheMediatorOutputConnector_3107); //$NON-NLS-1$
		case ClassMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?ClassMediatorOutputConnector", EsbElementTypes.ClassMediatorOutputConnector_3059); //$NON-NLS-1$
		case ProxyServiceInSequenceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?ProxyServiceInSequence", EsbElementTypes.ProxyServiceInSequence_3197); //$NON-NLS-1$
		case EventMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?EventMediatorOutputConnector", EsbElementTypes.EventMediatorOutputConnector_3053); //$NON-NLS-1$
		case LogMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?LogMediatorOutputConnector", EsbElementTypes.LogMediatorOutputConnector_3019); //$NON-NLS-1$
		case FilterMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?FilterMediatorInputConnector", EsbElementTypes.FilterMediatorInputConnector_3010); //$NON-NLS-1$
		case EventMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?EventMediator", EsbElementTypes.EventMediator_3504); //$NON-NLS-1$
		case MessageInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?MessageInputConnector", EsbElementTypes.MessageInputConnector_3046); //$NON-NLS-1$
		case ThrottleMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?ThrottleMediatorOutputConnector", EsbElementTypes.ThrottleMediatorOutputConnector_3122); //$NON-NLS-1$
		case PayloadFactoryMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?PayloadFactoryMediator", EsbElementTypes.PayloadFactoryMediator_3597); //$NON-NLS-1$
		case EntitlementMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?EntitlementMediatorOutputConnector", EsbElementTypes.EntitlementMediatorOutputConnector_3056); //$NON-NLS-1$
		case EsbServerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///org/wso2/developerstudio/eclipse/gmf/esb?EsbServer", EsbElementTypes.EsbServer_2001); //$NON-NLS-1$
		case CloneMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?CloneMediatorOutputConnector", EsbElementTypes.CloneMediatorOutputConnector_3104); //$NON-NLS-1$
		case FilterMediatorPassOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?FilterMediatorPassOutputConnector", EsbElementTypes.FilterMediatorPassOutputConnector_3011); //$NON-NLS-1$
		case AddressEndPointInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?AddressEndPointInputConnector", EsbElementTypes.AddressEndPointInputConnector_3030); //$NON-NLS-1$
		case ProxyInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?ProxyInputConnector", EsbElementTypes.ProxyInputConnector_3003); //$NON-NLS-1$
		case MediatorFlow12EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?MediatorFlow", EsbElementTypes.MediatorFlow_3607); //$NON-NLS-1$
		case DBReportMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?DBReportMediatorOutputConnector", EsbElementTypes.DBReportMediatorOutputConnector_3080); //$NON-NLS-1$
		case ThrottleMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?ThrottleMediator", EsbElementTypes.ThrottleMediator_3493); //$NON-NLS-1$
		case MediatorFlow2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?MediatorFlow", EsbElementTypes.MediatorFlow_3502); //$NON-NLS-1$
		case EnrichMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?EnrichMediatorOutputConnector", EsbElementTypes.EnrichMediatorOutputConnector_3037); //$NON-NLS-1$
		case XQueryMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?XQueryMediatorOutputConnector", EsbElementTypes.XQueryMediatorOutputConnector_3071); //$NON-NLS-1$
		case CallTemplateMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?CallTemplateMediatorInputConnector", EsbElementTypes.CallTemplateMediatorInputConnector_3595); //$NON-NLS-1$
		case CloneTargetContainerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?CloneTargetContainer", EsbElementTypes.CloneTargetContainer_3604); //$NON-NLS-1$
		case CloneMediatorContainerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?CloneMediatorContainer", EsbElementTypes.CloneMediatorContainer_3603); //$NON-NLS-1$
		case CallTemplateMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?CallTemplateMediator", EsbElementTypes.CallTemplateMediator_3594); //$NON-NLS-1$
		case ProxyServiceSequenceContainerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?ProxyServiceSequenceContainer", EsbElementTypes.ProxyServiceSequenceContainer_3391); //$NON-NLS-1$
		case MediatorFlow10EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?MediatorFlow", EsbElementTypes.MediatorFlow_3587); //$NON-NLS-1$
		case SwitchMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?SwitchMediatorInputConnector", EsbElementTypes.SwitchMediatorInputConnector_3042); //$NON-NLS-1$
		case SequenceInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?SequenceInputConnector", EsbElementTypes.SequenceInputConnector_3049); //$NON-NLS-1$
		case FilterMediatorFailOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?FilterMediatorFailOutputConnector", EsbElementTypes.FilterMediatorFailOutputConnector_3012); //$NON-NLS-1$
		case MediatorFlowEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?MediatorFlow", EsbElementTypes.MediatorFlow_3490); //$NON-NLS-1$
		case SwitchDefaultContainerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?SwitchDefaultContainer", EsbElementTypes.SwitchDefaultContainer_3527); //$NON-NLS-1$
		case FilterFailContainerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?FilterFailContainer", EsbElementTypes.FilterFailContainer_3537); //$NON-NLS-1$
		case LoadBalanceEndPointInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?LoadBalanceEndPointInputConnector", EsbElementTypes.LoadBalanceEndPointInputConnector_3095); //$NON-NLS-1$
		case RMSequenceMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?RMSequenceMediator", EsbElementTypes.RMSequenceMediator_3522); //$NON-NLS-1$
		case BuilderMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?BuilderMediatorInputConnector", EsbElementTypes.BuilderMediatorInputConnector_3592); //$NON-NLS-1$
		case SwitchMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?SwitchMediator", EsbElementTypes.SwitchMediator_3498); //$NON-NLS-1$
		case FailoverEndPointInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?FailoverEndPointInputConnector", EsbElementTypes.FailoverEndPointInputConnector_3088); //$NON-NLS-1$
		case ScriptMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?ScriptMediatorInputConnector", EsbElementTypes.ScriptMediatorInputConnector_3064); //$NON-NLS-1$
		case XSLTMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?XSLTMediatorOutputConnector", EsbElementTypes.XSLTMediatorOutputConnector_3040); //$NON-NLS-1$
		case DBReportMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?DBReportMediatorInputConnector", EsbElementTypes.DBReportMediatorInputConnector_3079); //$NON-NLS-1$
		case ThrottleContainerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/developerstudio/eclipse/gmf/esb?ThrottleContainer", EsbElementTypes.ThrottleContainer_3583); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = EsbDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& EsbElementTypes.isKnownElementType(elementType)) {
			image = EsbElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof EsbNavigatorGroup) {
			EsbNavigatorGroup group = (EsbNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof EsbNavigatorItem) {
			EsbNavigatorItem navigatorItem = (EsbNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (EsbVisualIDRegistry.getVisualID(view)) {
		case CommandMediatorEditPart.VISUAL_ID:
			return getCommandMediator_3511Text(view);
		case EnrichMediatorInputConnectorEditPart.VISUAL_ID:
			return getEnrichMediatorInputConnector_3036Text(view);
		case FaultMediatorOutputConnectorEditPart.VISUAL_ID:
			return getFaultMediatorOutputConnector_3068Text(view);
		case EndpointFlow2EditPart.VISUAL_ID:
			return getEndpointFlow_3580Text(view);
		case MediatorFlow8EditPart.VISUAL_ID:
			return getMediatorFlow_3538Text(view);
		case SpringMediatorEditPart.VISUAL_ID:
			return getSpringMediator_3507Text(view);
		case EnqueueMediatorInputConnectorEditPart.VISUAL_ID:
			return getEnqueueMediatorInputConnector_3601Text(view);
		case RuleMediatorEditPart.VISUAL_ID:
			return getRuleMediator_3523Text(view);
		case SwitchCaseContainerEditPart.VISUAL_ID:
			return getSwitchCaseContainer_3501Text(view);
		case FailoverEndPointEditPart.VISUAL_ID:
			return getFailoverEndPoint_3565Text(view);
		case DropMediatorEditPart.VISUAL_ID:
			return getDropMediator_3491Text(view);
		case DefaultEndPointEditPart.VISUAL_ID:
			return getDefaultEndPoint_3563Text(view);
		case SendMediatorEndpointOutputConnectorEditPart.VISUAL_ID:
			return getSendMediatorEndpointOutputConnector_3539Text(view);
		case EnqueueMediatorEditPart.VISUAL_ID:
			return getEnqueueMediator_3600Text(view);
		case CacheMediatorInputConnectorEditPart.VISUAL_ID:
			return getCacheMediatorInputConnector_3106Text(view);
		case AddressEndPointEditPart.VISUAL_ID:
			return getAddressEndPoint_3564Text(view);
		case ThrottleOnAcceptContainerEditPart.VISUAL_ID:
			return getThrottleOnAcceptContainer_3584Text(view);
		case LogMediatorEditPart.VISUAL_ID:
			return getLogMediator_3495Text(view);
		case ProxyServiceSequenceAndEndpointContainerEditPart.VISUAL_ID:
			return getProxyServiceSequenceAndEndpointContainer_3487Text(view);
		case ThrottleOnRejectContainerEditPart.VISUAL_ID:
			return getThrottleOnRejectContainer_3586Text(view);
		case StoreMediatorInputConnectorEditPart.VISUAL_ID:
			return getStoreMediatorInputConnector_3589Text(view);
		case XSLTMediatorInputConnectorEditPart.VISUAL_ID:
			return getXSLTMediatorInputConnector_3039Text(view);
		case MergeNodeSecondInputConnectorEditPart.VISUAL_ID:
			return getMergeNodeSecondInputConnector_3015Text(view);
		case ClassMediatorEditPart.VISUAL_ID:
			return getClassMediator_3506Text(view);
		case EsbDiagramEditPart.VISUAL_ID:
			return getEsbDiagram_1000Text(view);
		case IterateMediatorTargetOutputConnectorEditPart.VISUAL_ID:
			return getIterateMediatorTargetOutputConnector_3606Text(view);
		case IterateMediatorInputConnectorEditPart.VISUAL_ID:
			return getIterateMediatorInputConnector_3109Text(view);
		case CacheMediatorEditPart.VISUAL_ID:
			return getCacheMediator_3518Text(view);
		case ProxyServiceEndpointContainerEditPart.VISUAL_ID:
			return getProxyServiceEndpointContainer_3392Text(view);
		case XSLTMediatorEditPart.VISUAL_ID:
			return getXSLTMediator_3497Text(view);
		case PropertyMediatorInputConnectorEditPart.VISUAL_ID:
			return getPropertyMediatorInputConnector_3033Text(view);
		case RMSequenceMediatorOutputConnectorEditPart.VISUAL_ID:
			return getRMSequenceMediatorOutputConnector_3125Text(view);
		case EnqueueMediatorOutputConnectorEditPart.VISUAL_ID:
			return getEnqueueMediatorOutputConnector_3602Text(view);
		case DBLookupMediatorEditPart.VISUAL_ID:
			return getDBLookupMediator_3512Text(view);
		case MediatorFlow7EditPart.VISUAL_ID:
			return getMediatorFlow_3536Text(view);
		case ThrottleMediatorInputConnectorEditPart.VISUAL_ID:
			return getThrottleMediatorInputConnector_3121Text(view);
		case SwitchMediatorOutputConnectorEditPart.VISUAL_ID:
			return getSwitchMediatorOutputConnector_3499Text(view);
		case TransactionMediatorEditPart.VISUAL_ID:
			return getTransactionMediator_3521Text(view);
		case FilterMediatorEditPart.VISUAL_ID:
			return getFilterMediator_3494Text(view);
		case MergeNodeFirstInputConnectorEditPart.VISUAL_ID:
			return getMergeNodeFirstInputConnector_3014Text(view);
		case SwitchMediatorContainerEditPart.VISUAL_ID:
			return getSwitchMediatorContainer_3500Text(view);
		case AggregateMediatorEditPart.VISUAL_ID:
			return getAggregateMediator_3525Text(view);
		case LoadBalanceEndPointOutputConnectorEditPart.VISUAL_ID:
			return getLoadBalanceEndPointOutputConnector_3096Text(view);
		case CommandMediatorOutputConnectorEditPart.VISUAL_ID:
			return getCommandMediatorOutputConnector_3074Text(view);
		case StoreMediatorEditPart.VISUAL_ID:
			return getStoreMediator_3588Text(view);
		case CloneMediatorTargetOutputConnectorEditPart.VISUAL_ID:
			return getCloneMediatorTargetOutputConnector_3133Text(view);
		case EndpointFlowEditPart.VISUAL_ID:
			return getEndpointFlow_3562Text(view);
		case SendMediatorEditPart.VISUAL_ID:
			return getSendMediator_3515Text(view);
		case ClassMediatorInputConnectorEditPart.VISUAL_ID:
			return getClassMediatorInputConnector_3058Text(view);
		case HeaderMediatorInputConnectorEditPart.VISUAL_ID:
			return getHeaderMediatorInputConnector_3100Text(view);
		case DBReportMediatorEditPart.VISUAL_ID:
			return getDBReportMediator_3513Text(view);
		case FilterPassContainerEditPart.VISUAL_ID:
			return getFilterPassContainer_3535Text(view);
		case MessageMediatorEditPart.VISUAL_ID:
			return getMessageMediator_3045Text(view);
		case FaultMediatorEditPart.VISUAL_ID:
			return getFaultMediator_3509Text(view);
		case PayloadFactoryMediatorOutputConnectorEditPart.VISUAL_ID:
			return getPayloadFactoryMediatorOutputConnector_3599Text(view);
		case MediatorFlow11EditPart.VISUAL_ID:
			return getMediatorFlow_3605Text(view);
		case DropMediatorInputConnectorEditPart.VISUAL_ID:
			return getDropMediatorInputConnector_3008Text(view);
		case LoadBalanceEndPointEditPart.VISUAL_ID:
			return getLoadBalanceEndPoint_3567Text(view);
		case SmooksMediatorEditPart.VISUAL_ID:
			return getSmooksMediator_3514Text(view);
		case OAuthMediatorOutputConnectorEditPart.VISUAL_ID:
			return getOAuthMediatorOutputConnector_3131Text(view);
		case BuilderMediatorOutputConectorEditPart.VISUAL_ID:
			return getBuilderMediatorOutputConector_3593Text(view);
		case PayloadFactoryMediatorInputConnectorEditPart.VISUAL_ID:
			return getPayloadFactoryMediatorInputConnector_3598Text(view);
		case SpringMediatorInputConnectorEditPart.VISUAL_ID:
			return getSpringMediatorInputConnector_3061Text(view);
		case ProxyServiceContainerEditPart.VISUAL_ID:
			return getProxyServiceContainer_3486Text(view);
		case LogMediatorInputConnectorEditPart.VISUAL_ID:
			return getLogMediatorInputConnector_3018Text(view);
		case WSDLEndPointInputConnectorEditPart.VISUAL_ID:
			return getWSDLEndPointInputConnector_3092Text(view);
		case HeaderMediatorOutputConnectorEditPart.VISUAL_ID:
			return getHeaderMediatorOutputConnector_3101Text(view);
		case OAuthMediatorInputConnectorEditPart.VISUAL_ID:
			return getOAuthMediatorInputConnector_3130Text(view);
		case CommandMediatorInputConnectorEditPart.VISUAL_ID:
			return getCommandMediatorInputConnector_3073Text(view);
		case ProxyServiceOutSequenceEditPart.VISUAL_ID:
			return getProxyServiceOutSequence_3198Text(view);
		case ScriptMediatorOutputConnectorEditPart.VISUAL_ID:
			return getScriptMediatorOutputConnector_3065Text(view);
		case TransactionMediatorOutputConnectorEditPart.VISUAL_ID:
			return getTransactionMediatorOutputConnector_3119Text(view);
		case CalloutMediatorEditPart.VISUAL_ID:
			return getCalloutMediator_3520Text(view);
		case SmooksMediatorOutputConnectorEditPart.VISUAL_ID:
			return getSmooksMediatorOutputConnector_3083Text(view);
		case FailoverEndPointWestOutputConnectorEditPart.VISUAL_ID:
			return getFailoverEndPointWestOutputConnector_3097Text(view);
		case DBLookupMediatorOutputConnectorEditPart.VISUAL_ID:
			return getDBLookupMediatorOutputConnector_3077Text(view);
		case PropertyMediatorEditPart.VISUAL_ID:
			return getPropertyMediator_3492Text(view);
		case SmooksMediatorInputConnectorEditPart.VISUAL_ID:
			return getSmooksMediatorInputConnector_3082Text(view);
		case BuilderMediatorEditPart.VISUAL_ID:
			return getBuilderMediator_3591Text(view);
		case DefaultEndPointOutputConnectorEditPart.VISUAL_ID:
			return getDefaultEndPointOutputConnector_3022Text(view);
		case SequenceOutputConnectorEditPart.VISUAL_ID:
			return getSequenceOutputConnector_3050Text(view);
		case SequenceEditPart.VISUAL_ID:
			return getSequence_3503Text(view);
		case TransactionMediatorInputConnectorEditPart.VISUAL_ID:
			return getTransactionMediatorInputConnector_3118Text(view);
		case CalloutMediatorOutputConnectorEditPart.VISUAL_ID:
			return getCalloutMediatorOutputConnector_3116Text(view);
		case LoadBalanceEndPointWestOutputConnectorEditPart.VISUAL_ID:
			return getLoadBalanceEndPointWestOutputConnector_3098Text(view);
		case SendMediatorInputConnectorEditPart.VISUAL_ID:
			return getSendMediatorInputConnector_3085Text(view);
		case PropertyMediatorOutputConnectorEditPart.VISUAL_ID:
			return getPropertyMediatorOutputConnector_3034Text(view);
		case RuleMediatorOutputConnectorEditPart.VISUAL_ID:
			return getRuleMediatorOutputConnector_3128Text(view);
		case SwitchCaseBranchOutputConnectorEditPart.VISUAL_ID:
			return getSwitchCaseBranchOutputConnector_3043Text(view);
		case FaultMediatorInputConnectorEditPart.VISUAL_ID:
			return getFaultMediatorInputConnector_3067Text(view);
		case MessageOutputConnectorEditPart.VISUAL_ID:
			return getMessageOutputConnector_3047Text(view);
		case XQueryMediatorInputConnectorEditPart.VISUAL_ID:
			return getXQueryMediatorInputConnector_3070Text(view);
		case SpringMediatorOutputConnectorEditPart.VISUAL_ID:
			return getSpringMediatorOutputConnector_3062Text(view);
		case CallTemplateMediatorOutputConnectorEditPart.VISUAL_ID:
			return getCallTemplateMediatorOutputConnector_3596Text(view);
		case ProxyOutputConnectorEditPart.VISUAL_ID:
			return getProxyOutputConnector_3002Text(view);
		case EventMediatorInputConnectorEditPart.VISUAL_ID:
			return getEventMediatorInputConnector_3052Text(view);
		case EnrichMediatorEditPart.VISUAL_ID:
			return getEnrichMediator_3496Text(view);
		case MediatorFlow6EditPart.VISUAL_ID:
			return getMediatorFlow_3530Text(view);
		case AggregateMediatorInputConnectorEditPart.VISUAL_ID:
			return getAggregateMediatorInputConnector_3112Text(view);
		case EsbLinkEditPart.VISUAL_ID:
			return getEsbLink_4001Text(view);
		case CloneMediatorEditPart.VISUAL_ID:
			return getCloneMediator_3517Text(view);
		case MergeNodeEditPart.VISUAL_ID:
			return getMergeNode_3013Text(view);
		case FilterMediatorOutputConnectorEditPart.VISUAL_ID:
			return getFilterMediatorOutputConnector_3534Text(view);
		case HeaderMediatorEditPart.VISUAL_ID:
			return getHeaderMediator_3516Text(view);
		case ScriptMediatorEditPart.VISUAL_ID:
			return getScriptMediator_3508Text(view);
		case RMSequenceMediatorInputConnectorEditPart.VISUAL_ID:
			return getRMSequenceMediatorInputConnector_3124Text(view);
		case OAuthMediatorEditPart.VISUAL_ID:
			return getOAuthMediator_3524Text(view);
		case WSDLEndPointEditPart.VISUAL_ID:
			return getWSDLEndPoint_3566Text(view);
		case DBLookupMediatorInputConnectorEditPart.VISUAL_ID:
			return getDBLookupMediatorInputConnector_3076Text(view);
		case MediatorFlow5EditPart.VISUAL_ID:
			return getMediatorFlow_3529Text(view);
		case StoreMediatorOutputConnectorEditPart.VISUAL_ID:
			return getStoreMediatorOutputConnector_3590Text(view);
		case XQueryMediatorEditPart.VISUAL_ID:
			return getXQueryMediator_3510Text(view);
		case AggregateMediatorOutputConnectorEditPart.VISUAL_ID:
			return getAggregateMediatorOutputConnector_3113Text(view);
		case SendMediatorOutputConnectorEditPart.VISUAL_ID:
			return getSendMediatorOutputConnector_3086Text(view);
		case EntitlementMediatorInputConnectorEditPart.VISUAL_ID:
			return getEntitlementMediatorInputConnector_3055Text(view);
		case WSDLEndPointOutputConnectorEditPart.VISUAL_ID:
			return getWSDLEndPointOutputConnector_3093Text(view);
		case ThrottleMediatorOnRejectOutputConnectorEditPart.VISUAL_ID:
			return getThrottleMediatorOnRejectOutputConnector_3582Text(view);
		case AggregateMediatorOnCompleteOutputConnectorEditPart.VISUAL_ID:
			return getAggregateMediatorOnCompleteOutputConnector_3132Text(view);
		case ThrottleMediatorOnAcceptOutputConnectorEditPart.VISUAL_ID:
			return getThrottleMediatorOnAcceptOutputConnector_3581Text(view);
		case EntitlementMediatorEditPart.VISUAL_ID:
			return getEntitlementMediator_3505Text(view);
		case FailoverEndPointOutputConnectorEditPart.VISUAL_ID:
			return getFailoverEndPointOutputConnector_3090Text(view);
		case CalloutMediatorInputConnectorEditPart.VISUAL_ID:
			return getCalloutMediatorInputConnector_3115Text(view);
		case DefaultEndPointInputConnectorEditPart.VISUAL_ID:
			return getDefaultEndPointInputConnector_3021Text(view);
		case AddressEndPointOutputConnectorEditPart.VISUAL_ID:
			return getAddressEndPointOutputConnector_3031Text(view);
		case MediatorFlow9EditPart.VISUAL_ID:
			return getMediatorFlow_3585Text(view);
		case ProxyServiceEditPart.VISUAL_ID:
			return getProxyService_3001Text(view);
		case MergeNodeOutputConnectorEditPart.VISUAL_ID:
			return getMergeNodeOutputConnector_3016Text(view);
		case IterateMediatorEditPart.VISUAL_ID:
			return getIterateMediator_3519Text(view);
		case FilterContainerEditPart.VISUAL_ID:
			return getFilterContainer_3531Text(view);
		case SwitchDefaultBranchOutputConnectorEditPart.VISUAL_ID:
			return getSwitchDefaultBranchOutputConnector_3044Text(view);
		case MediatorFlow4EditPart.VISUAL_ID:
			return getMediatorFlow_3528Text(view);
		case ProxyFaultInputConnectorEditPart.VISUAL_ID:
			return getProxyFaultInputConnector_3489Text(view);
		case MediatorFlow3EditPart.VISUAL_ID:
			return getMediatorFlow_3526Text(view);
		case ProxyServiceFaultContainerEditPart.VISUAL_ID:
			return getProxyServiceFaultContainer_3488Text(view);
		case CloneMediatorInputConnectorEditPart.VISUAL_ID:
			return getCloneMediatorInputConnector_3103Text(view);
		case IterateMediatorOutputConnectorEditPart.VISUAL_ID:
			return getIterateMediatorOutputConnector_3110Text(view);
		case RuleMediatorInputConnectorEditPart.VISUAL_ID:
			return getRuleMediatorInputConnector_3127Text(view);
		case CacheMediatorOutputConnectorEditPart.VISUAL_ID:
			return getCacheMediatorOutputConnector_3107Text(view);
		case ClassMediatorOutputConnectorEditPart.VISUAL_ID:
			return getClassMediatorOutputConnector_3059Text(view);
		case ProxyServiceInSequenceEditPart.VISUAL_ID:
			return getProxyServiceInSequence_3197Text(view);
		case EventMediatorOutputConnectorEditPart.VISUAL_ID:
			return getEventMediatorOutputConnector_3053Text(view);
		case LogMediatorOutputConnectorEditPart.VISUAL_ID:
			return getLogMediatorOutputConnector_3019Text(view);
		case FilterMediatorInputConnectorEditPart.VISUAL_ID:
			return getFilterMediatorInputConnector_3010Text(view);
		case EventMediatorEditPart.VISUAL_ID:
			return getEventMediator_3504Text(view);
		case MessageInputConnectorEditPart.VISUAL_ID:
			return getMessageInputConnector_3046Text(view);
		case ThrottleMediatorOutputConnectorEditPart.VISUAL_ID:
			return getThrottleMediatorOutputConnector_3122Text(view);
		case PayloadFactoryMediatorEditPart.VISUAL_ID:
			return getPayloadFactoryMediator_3597Text(view);
		case EntitlementMediatorOutputConnectorEditPart.VISUAL_ID:
			return getEntitlementMediatorOutputConnector_3056Text(view);
		case EsbServerEditPart.VISUAL_ID:
			return getEsbServer_2001Text(view);
		case CloneMediatorOutputConnectorEditPart.VISUAL_ID:
			return getCloneMediatorOutputConnector_3104Text(view);
		case FilterMediatorPassOutputConnectorEditPart.VISUAL_ID:
			return getFilterMediatorPassOutputConnector_3011Text(view);
		case AddressEndPointInputConnectorEditPart.VISUAL_ID:
			return getAddressEndPointInputConnector_3030Text(view);
		case ProxyInputConnectorEditPart.VISUAL_ID:
			return getProxyInputConnector_3003Text(view);
		case MediatorFlow12EditPart.VISUAL_ID:
			return getMediatorFlow_3607Text(view);
		case DBReportMediatorOutputConnectorEditPart.VISUAL_ID:
			return getDBReportMediatorOutputConnector_3080Text(view);
		case ThrottleMediatorEditPart.VISUAL_ID:
			return getThrottleMediator_3493Text(view);
		case MediatorFlow2EditPart.VISUAL_ID:
			return getMediatorFlow_3502Text(view);
		case EnrichMediatorOutputConnectorEditPart.VISUAL_ID:
			return getEnrichMediatorOutputConnector_3037Text(view);
		case XQueryMediatorOutputConnectorEditPart.VISUAL_ID:
			return getXQueryMediatorOutputConnector_3071Text(view);
		case CallTemplateMediatorInputConnectorEditPart.VISUAL_ID:
			return getCallTemplateMediatorInputConnector_3595Text(view);
		case CloneTargetContainerEditPart.VISUAL_ID:
			return getCloneTargetContainer_3604Text(view);
		case CloneMediatorContainerEditPart.VISUAL_ID:
			return getCloneMediatorContainer_3603Text(view);
		case CallTemplateMediatorEditPart.VISUAL_ID:
			return getCallTemplateMediator_3594Text(view);
		case ProxyServiceSequenceContainerEditPart.VISUAL_ID:
			return getProxyServiceSequenceContainer_3391Text(view);
		case MediatorFlow10EditPart.VISUAL_ID:
			return getMediatorFlow_3587Text(view);
		case SwitchMediatorInputConnectorEditPart.VISUAL_ID:
			return getSwitchMediatorInputConnector_3042Text(view);
		case SequenceInputConnectorEditPart.VISUAL_ID:
			return getSequenceInputConnector_3049Text(view);
		case FilterMediatorFailOutputConnectorEditPart.VISUAL_ID:
			return getFilterMediatorFailOutputConnector_3012Text(view);
		case MediatorFlowEditPart.VISUAL_ID:
			return getMediatorFlow_3490Text(view);
		case SwitchDefaultContainerEditPart.VISUAL_ID:
			return getSwitchDefaultContainer_3527Text(view);
		case FilterFailContainerEditPart.VISUAL_ID:
			return getFilterFailContainer_3537Text(view);
		case LoadBalanceEndPointInputConnectorEditPart.VISUAL_ID:
			return getLoadBalanceEndPointInputConnector_3095Text(view);
		case RMSequenceMediatorEditPart.VISUAL_ID:
			return getRMSequenceMediator_3522Text(view);
		case BuilderMediatorInputConnectorEditPart.VISUAL_ID:
			return getBuilderMediatorInputConnector_3592Text(view);
		case SwitchMediatorEditPart.VISUAL_ID:
			return getSwitchMediator_3498Text(view);
		case FailoverEndPointInputConnectorEditPart.VISUAL_ID:
			return getFailoverEndPointInputConnector_3088Text(view);
		case ScriptMediatorInputConnectorEditPart.VISUAL_ID:
			return getScriptMediatorInputConnector_3064Text(view);
		case XSLTMediatorOutputConnectorEditPart.VISUAL_ID:
			return getXSLTMediatorOutputConnector_3040Text(view);
		case DBReportMediatorInputConnectorEditPart.VISUAL_ID:
			return getDBReportMediatorInputConnector_3079Text(view);
		case ThrottleContainerEditPart.VISUAL_ID:
			return getThrottleContainer_3583Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getEsbDiagram_1000Text(View view) {
		EsbDiagram domainModelElement = (EsbDiagram) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getTest());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIterateMediatorTargetOutputConnector_3606Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getBuilderMediatorOutputConector_3593Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getXQueryMediatorOutputConnector_3071Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getEnrichMediator_3496Text(View view) {
		IParser parser = EsbParserProvider.getParser(
				EsbElementTypes.EnrichMediator_3496,
				view.getElement() != null ? view.getElement() : view,
				EsbVisualIDRegistry
						.getType(EnrichMediatorSourceTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5131); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEsbServer_2001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getMessageMediator_3045Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getProxyService_3001Text(View view) {
		IParser parser = EsbParserProvider
				.getParser(EsbElementTypes.ProxyService_3001,
						view.getElement() != null ? view.getElement() : view,
						EsbVisualIDRegistry
								.getType(ProxyServiceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getClassMediator_3506Text(View view) {
		IParser parser = EsbParserProvider.getParser(
				EsbElementTypes.ClassMediator_3506,
				view.getElement() != null ? view.getElement() : view,
				EsbVisualIDRegistry
						.getType(ClassMediatorClassNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5135); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getWSDLEndPointOutputConnector_3093Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getOAuthMediator_3524Text(View view) {
		IParser parser = EsbParserProvider
				.getParser(
						EsbElementTypes.OAuthMediator_3524,
						view.getElement() != null ? view.getElement() : view,
						EsbVisualIDRegistry
								.getType(OAuthMediatorRemoteServiceUrlEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5148); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMediatorFlow_3536Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getProxyServiceSequenceAndEndpointContainer_3487Text(
			View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getProxyServiceContainer_3486Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getCommandMediatorOutputConnector_3074Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getCloneMediatorInputConnector_3103Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getFailoverEndPointOutputConnector_3090Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getLogMediator_3495Text(View view) {
		IParser parser = EsbParserProvider.getParser(
				EsbElementTypes.LogMediator_3495,
				view.getElement() != null ? view.getElement() : view,
				EsbVisualIDRegistry
						.getType(LogMediatorLogCategoryEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5130); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSpringMediator_3507Text(View view) {
		IParser parser = EsbParserProvider.getParser(
				EsbElementTypes.SpringMediator_3507,
				view.getElement() != null ? view.getElement() : view,
				EsbVisualIDRegistry
						.getType(SpringMediatorBeanNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5136); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getFaultMediatorInputConnector_3067Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getEntitlementMediatorInputConnector_3055Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getXQueryMediator_3510Text(View view) {
		IParser parser = EsbParserProvider
				.getParser(
						EsbElementTypes.XQueryMediator_3510,
						view.getElement() != null ? view.getElement() : view,
						EsbVisualIDRegistry
								.getType(XQueryMediatorScriptKeyTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5139); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSequenceInputConnector_3049Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getProxyOutputConnector_3002Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getRMSequenceMediatorInputConnector_3124Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getThrottleMediatorOutputConnector_3122Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getXSLTMediator_3497Text(View view) {
		XSLTMediator domainModelElement = (XSLTMediator) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.isReverse());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3497); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSendMediatorEndpointOutputConnector_3539Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getDropMediator_3491Text(View view) {
		DropMediator domainModelElement = (DropMediator) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.isReverse());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3491); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSwitchCaseBranchOutputConnector_3043Text(View view) {
		SwitchCaseBranchOutputConnector domainModelElement = (SwitchCaseBranchOutputConnector) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getCaseRegex();
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3043); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRMSequenceMediator_3522Text(View view) {
		RMSequenceMediator domainModelElement = (RMSequenceMediator) view
				.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.isReverse());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3522); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getProxyInputConnector_3003Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getMediatorFlow_3607Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getDefaultEndPointOutputConnector_3022Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getMediatorFlow_3490Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getDBLookupMediator_3512Text(View view) {
		IParser parser = EsbParserProvider
				.getParser(
						EsbElementTypes.DBLookupMediator_3512,
						view.getElement() != null ? view.getElement() : view,
						EsbVisualIDRegistry
								.getType(DBLookupMediatorConnectionURLEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5141); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getThrottleOnRejectContainer_3586Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getDBLookupMediatorOutputConnector_3077Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getSwitchMediator_3498Text(View view) {
		SwitchMediator domainModelElement = (SwitchMediator) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getNamespace();
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3498); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSwitchDefaultContainer_3527Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getAddressEndPoint_3564Text(View view) {
		IParser parser = EsbParserProvider
				.getParser(
						EsbElementTypes.AddressEndPoint_3564,
						view.getElement() != null ? view.getElement() : view,
						EsbVisualIDRegistry
								.getType(AddressEndPointEndPointNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5151); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTransactionMediatorOutputConnector_3119Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getProxyServiceOutSequence_3198Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getSwitchCaseContainer_3501Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getFaultMediatorOutputConnector_3068Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getSpringMediatorOutputConnector_3062Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getLoadBalanceEndPointWestOutputConnector_3098Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getSwitchMediatorContainer_3500Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getDefaultEndPointInputConnector_3021Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getThrottleOnAcceptContainer_3584Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getThrottleMediatorInputConnector_3121Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getRuleMediatorOutputConnector_3128Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getPayloadFactoryMediatorInputConnector_3598Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getTransactionMediatorInputConnector_3118Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getCalloutMediatorInputConnector_3115Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getDefaultEndPoint_3563Text(View view) {
		IParser parser = EsbParserProvider
				.getParser(
						EsbElementTypes.DefaultEndPoint_3563,
						view.getElement() != null ? view.getElement() : view,
						EsbVisualIDRegistry
								.getType(DefaultEndPointEndPointNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5150); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEndpointFlow_3562Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getPropertyMediatorOutputConnector_3034Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getRuleMediator_3523Text(View view) {
		RuleMediator domainModelElement = (RuleMediator) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.isReverse());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3523); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSmooksMediatorOutputConnector_3083Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getPropertyMediator_3492Text(View view) {
		IParser parser = EsbParserProvider
				.getParser(
						EsbElementTypes.PropertyMediator_3492,
						view.getElement() != null ? view.getElement() : view,
						EsbVisualIDRegistry
								.getType(PropertyMediatorPropertyNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5127); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCallTemplateMediatorInputConnector_3595Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getIterateMediatorOutputConnector_3110Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getMessageInputConnector_3046Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getHeaderMediatorInputConnector_3100Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getDBReportMediatorOutputConnector_3080Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getFilterMediatorOutputConnector_3534Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getStoreMediatorOutputConnector_3590Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getXSLTMediatorInputConnector_3039Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getCommandMediatorInputConnector_3073Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getSequence_3503Text(View view) {
		IParser parser = EsbParserProvider.getParser(
				EsbElementTypes.Sequence_3503,
				view.getElement() != null ? view.getElement() : view,
				EsbVisualIDRegistry.getType(SequenceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5132); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSpringMediatorInputConnector_3061Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getScriptMediatorInputConnector_3064Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getDropMediatorInputConnector_3008Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getEnrichMediatorInputConnector_3036Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getFilterMediatorInputConnector_3010Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getMediatorFlow_3528Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getFailoverEndPointWestOutputConnector_3097Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getCloneMediatorTargetOutputConnector_3133Text(View view) {
		CloneMediatorTargetOutputConnector domainModelElement = (CloneMediatorTargetOutputConnector) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getSoapAction();
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3133); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getProxyFaultInputConnector_3489Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getMediatorFlow_3605Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getPayloadFactoryMediatorOutputConnector_3599Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getFilterMediatorPassOutputConnector_3011Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getBuilderMediatorInputConnector_3592Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getEndpointFlow_3580Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getClassMediatorInputConnector_3058Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getStoreMediatorInputConnector_3589Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getSwitchMediatorOutputConnector_3499Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getEnqueueMediatorOutputConnector_3602Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getProxyServiceInSequence_3197Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getFilterMediatorFailOutputConnector_3012Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getMediatorFlow_3526Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getRuleMediatorInputConnector_3127Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getScriptMediator_3508Text(View view) {
		IParser parser = EsbParserProvider
				.getParser(
						EsbElementTypes.ScriptMediator_3508,
						view.getElement() != null ? view.getElement() : view,
						EsbVisualIDRegistry
								.getType(ScriptMediatorScriptLanguageEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5137); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCloneMediatorOutputConnector_3104Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getFilterMediator_3494Text(View view) {
		IParser parser = EsbParserProvider
				.getParser(
						EsbElementTypes.FilterMediator_3494,
						view.getElement() != null ? view.getElement() : view,
						EsbVisualIDRegistry
								.getType(FilterMediatorConditionTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5129); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEventMediator_3504Text(View view) {
		IParser parser = EsbParserProvider.getParser(
				EsbElementTypes.EventMediator_3504,
				view.getElement() != null ? view.getElement() : view,
				EsbVisualIDRegistry
						.getType(EventMediatorTopicTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5133); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMergeNode_3013Text(View view) {
		MergeNode domainModelElement = (MergeNode) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.isReverse());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getStoreMediator_3588Text(View view) {
		StoreMediator domainModelElement = (StoreMediator) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.isReverse());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3588); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCloneMediatorContainer_3603Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getAddressEndPointInputConnector_3030Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getPropertyMediatorInputConnector_3033Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getCallTemplateMediator_3594Text(View view) {
		CallTemplateMediator domainModelElement = (CallTemplateMediator) view
				.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.isReverse());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3594); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEntitlementMediator_3505Text(View view) {
		IParser parser = EsbParserProvider
				.getParser(
						EsbElementTypes.EntitlementMediator_3505,
						view.getElement() != null ? view.getElement() : view,
						EsbVisualIDRegistry
								.getType(EntitlementMediatorServerURLEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5134); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMediatorFlow_3585Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getThrottleMediatorOnRejectOutputConnector_3582Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getAddressEndPointOutputConnector_3031Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getXQueryMediatorInputConnector_3070Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getMediatorFlow_3502Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getOAuthMediatorInputConnector_3130Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getSmooksMediator_3514Text(View view) {
		SmooksMediator domainModelElement = (SmooksMediator) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.isReverse());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3514); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getXSLTMediatorOutputConnector_3040Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getOAuthMediatorOutputConnector_3131Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getAggregateMediatorOnCompleteOutputConnector_3132Text(
			View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getLoadBalanceEndPoint_3567Text(View view) {
		IParser parser = EsbParserProvider
				.getParser(
						EsbElementTypes.LoadBalanceEndPoint_3567,
						view.getElement() != null ? view.getElement() : view,
						EsbVisualIDRegistry
								.getType(LoadBalanceEndPointEndPointNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5154); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEnrichMediatorOutputConnector_3037Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getMergeNodeFirstInputConnector_3014Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getCloneMediator_3517Text(View view) {
		IParser parser = EsbParserProvider.getParser(
				EsbElementTypes.CloneMediator_3517,
				view.getElement() != null ? view.getElement() : view,
				EsbVisualIDRegistry
						.getType(CloneMediatorCloneIDEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5144); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAggregateMediatorOutputConnector_3113Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getMergeNodeSecondInputConnector_3015Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getBuilderMediator_3591Text(View view) {
		BuilderMediator domainModelElement = (BuilderMediator) view
				.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.isReverse());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3591); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTransactionMediator_3521Text(View view) {
		TransactionMediator domainModelElement = (TransactionMediator) view
				.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.isReverse());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3521); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getFailoverEndPoint_3565Text(View view) {
		IParser parser = EsbParserProvider
				.getParser(
						EsbElementTypes.FailoverEndPoint_3565,
						view.getElement() != null ? view.getElement() : view,
						EsbVisualIDRegistry
								.getType(FailoverEndPointEndPointNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5152); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLoadBalanceEndPointInputConnector_3095Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getMergeNodeOutputConnector_3016Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getAggregateMediator_3525Text(View view) {
		IParser parser = EsbParserProvider
				.getParser(
						EsbElementTypes.AggregateMediator_3525,
						view.getElement() != null ? view.getElement() : view,
						EsbVisualIDRegistry
								.getType(AggregateMediatorAggregateIDEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5149); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getProxyServiceEndpointContainer_3392Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getCallTemplateMediatorOutputConnector_3596Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getSendMediatorOutputConnector_3086Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getHeaderMediatorOutputConnector_3101Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getHeaderMediator_3516Text(View view) {
		IParser parser = EsbParserProvider.getParser(
				EsbElementTypes.HeaderMediator_3516,
				view.getElement() != null ? view.getElement() : view,
				EsbVisualIDRegistry
						.getType(HeaderMediatorValueLiteralEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5143); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getThrottleContainer_3583Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getCalloutMediatorOutputConnector_3116Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getMediatorFlow_3587Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getWSDLEndPointInputConnector_3092Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getSwitchMediatorInputConnector_3042Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getMediatorFlow_3529Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getSwitchDefaultBranchOutputConnector_3044Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getFailoverEndPointInputConnector_3088Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getThrottleMediator_3493Text(View view) {
		IParser parser = EsbParserProvider.getParser(
				EsbElementTypes.ThrottleMediator_3493,
				view.getElement() != null ? view.getElement() : view,
				EsbVisualIDRegistry
						.getType(ThrottleMediatorGroupIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5128); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPayloadFactoryMediator_3597Text(View view) {
		PayloadFactoryMediator domainModelElement = (PayloadFactoryMediator) view
				.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.isReverse());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3597); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEntitlementMediatorOutputConnector_3056Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getLoadBalanceEndPointOutputConnector_3096Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getMessageOutputConnector_3047Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getCacheMediator_3518Text(View view) {
		IParser parser = EsbParserProvider.getParser(
				EsbElementTypes.CacheMediator_3518,
				view.getElement() != null ? view.getElement() : view,
				EsbVisualIDRegistry
						.getType(CacheMediatorCacheIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5145); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getWSDLEndPoint_3566Text(View view) {
		IParser parser = EsbParserProvider.getParser(
				EsbElementTypes.WSDLEndPoint_3566,
				view.getElement() != null ? view.getElement() : view,
				EsbVisualIDRegistry
						.getType(WSDLEndPointEndPointNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5153); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getFilterFailContainer_3537Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getCommandMediator_3511Text(View view) {
		IParser parser = EsbParserProvider.getParser(
				EsbElementTypes.CommandMediator_3511,
				view.getElement() != null ? view.getElement() : view,
				EsbVisualIDRegistry
						.getType(CommandMediatorClassNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5140); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getThrottleMediatorOnAcceptOutputConnector_3581Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getSendMediatorInputConnector_3085Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getDBReportMediator_3513Text(View view) {
		IParser parser = EsbParserProvider
				.getParser(
						EsbElementTypes.DBReportMediator_3513,
						view.getElement() != null ? view.getElement() : view,
						EsbVisualIDRegistry
								.getType(DBReportMediatorConnectionURLEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5142); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSmooksMediatorInputConnector_3082Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getFaultMediator_3509Text(View view) {
		IParser parser = EsbParserProvider
				.getParser(
						EsbElementTypes.FaultMediator_3509,
						view.getElement() != null ? view.getElement() : view,
						EsbVisualIDRegistry
								.getType(FaultMediatorFaultStringTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5138); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLogMediatorInputConnector_3018Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getDBReportMediatorInputConnector_3079Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getEnqueueMediatorInputConnector_3601Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getDBLookupMediatorInputConnector_3076Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getScriptMediatorOutputConnector_3065Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getMediatorFlow_3538Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getClassMediatorOutputConnector_3059Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getCloneTargetContainer_3604Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getIterateMediator_3519Text(View view) {
		IParser parser = EsbParserProvider.getParser(
				EsbElementTypes.IterateMediator_3519,
				view.getElement() != null ? view.getElement() : view,
				EsbVisualIDRegistry
						.getType(IterateMediatorIterateIDEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5146); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLogMediatorOutputConnector_3019Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getProxyServiceSequenceContainer_3391Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getEventMediatorInputConnector_3052Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getCacheMediatorInputConnector_3106Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getAggregateMediatorInputConnector_3112Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getFilterContainer_3531Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getFilterPassContainer_3535Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getCalloutMediator_3520Text(View view) {
		IParser parser = EsbParserProvider.getParser(
				EsbElementTypes.CalloutMediator_3520,
				view.getElement() != null ? view.getElement() : view,
				EsbVisualIDRegistry
						.getType(CalloutMediatorSoapActionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5147); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSendMediator_3515Text(View view) {
		SendMediator domainModelElement = (SendMediator) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.isReverse());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3515); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEsbLink_4001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getCacheMediatorOutputConnector_3107Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getProxyServiceFaultContainer_3488Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getEventMediatorOutputConnector_3053Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getEnqueueMediator_3600Text(View view) {
		EnqueueMediator domainModelElement = (EnqueueMediator) view
				.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.isReverse());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3600); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIterateMediatorInputConnector_3109Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getSequenceOutputConnector_3050Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getMediatorFlow_3530Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getRMSequenceMediatorOutputConnector_3125Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
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
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return EsbDiagramEditPart.MODEL_ID.equals(EsbVisualIDRegistry
				.getModelID(view));
	}

}
