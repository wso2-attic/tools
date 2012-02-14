package org.wso2.carbonstudio.eclipse.gmf.esb.diagram.navigator;

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
import org.wso2.carbonstudio.eclipse.gmf.esb.AddressEndPoint;
import org.wso2.carbonstudio.eclipse.gmf.esb.AggregateOnCompleteBranch;
import org.wso2.carbonstudio.eclipse.gmf.esb.CloneMediatorTargetOutputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.DefaultEndPoint;
import org.wso2.carbonstudio.eclipse.gmf.esb.DropMediator;
import org.wso2.carbonstudio.eclipse.gmf.esb.EnrichMediator;
import org.wso2.carbonstudio.eclipse.gmf.esb.EsbDiagram;
import org.wso2.carbonstudio.eclipse.gmf.esb.FilterMediator;
import org.wso2.carbonstudio.eclipse.gmf.esb.LogMediator;
import org.wso2.carbonstudio.eclipse.gmf.esb.MergeNode;
import org.wso2.carbonstudio.eclipse.gmf.esb.PropertyMediator;
import org.wso2.carbonstudio.eclipse.gmf.esb.ProxyService;
import org.wso2.carbonstudio.eclipse.gmf.esb.RMSequenceMediator;
import org.wso2.carbonstudio.eclipse.gmf.esb.RuleMediator;
import org.wso2.carbonstudio.eclipse.gmf.esb.SendMediator;
import org.wso2.carbonstudio.eclipse.gmf.esb.Sequence;
import org.wso2.carbonstudio.eclipse.gmf.esb.SmooksMediator;
import org.wso2.carbonstudio.eclipse.gmf.esb.SwitchCaseBranchOutputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.SwitchMediator;
import org.wso2.carbonstudio.eclipse.gmf.esb.TransactionMediator;
import org.wso2.carbonstudio.eclipse.gmf.esb.XSLTMediator;
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
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.SendMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.SendMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.SendMediatorOutputConnectorEditPart;
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
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.part.EsbDiagramEditorPlugin;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.part.EsbVisualIDRegistry;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.providers.EsbElementTypes;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.providers.EsbParserProvider;

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
		case FailoverEndPointInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?FailoverEndPointInputConnector", EsbElementTypes.FailoverEndPointInputConnector_3088); //$NON-NLS-1$
		case HeaderMediatorInputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?HeaderMediatorInputConnector", EsbElementTypes.HeaderMediatorInputConnector_3169); //$NON-NLS-1$
		case SendMediatorOutputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?SendMediatorOutputConnector", EsbElementTypes.SendMediatorOutputConnector_3167); //$NON-NLS-1$
		case CacheMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?CacheMediatorOutputConnector", EsbElementTypes.CacheMediatorOutputConnector_3107); //$NON-NLS-1$
		case EnrichMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?EnrichMediatorInputConnector", EsbElementTypes.EnrichMediatorInputConnector_3036); //$NON-NLS-1$
		case DefaultEndPointOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?DefaultEndPointOutputConnector", EsbElementTypes.DefaultEndPointOutputConnector_3022); //$NON-NLS-1$
		case SmooksMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?SmooksMediatorOutputConnector", EsbElementTypes.SmooksMediatorOutputConnector_3083); //$NON-NLS-1$
		case EsbLinkEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///org/wso2/carbonstudio/eclipse/gmf/esb?EsbLink", EsbElementTypes.EsbLink_4001); //$NON-NLS-1$
		case DBReportMediator2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?DBReportMediator", EsbElementTypes.DBReportMediator_3162); //$NON-NLS-1$
		case SmooksMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?SmooksMediatorInputConnector", EsbElementTypes.SmooksMediatorInputConnector_3082); //$NON-NLS-1$
		case MessageOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?MessageOutputConnector", EsbElementTypes.MessageOutputConnector_3047); //$NON-NLS-1$
		case CacheMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?CacheMediatorInputConnector", EsbElementTypes.CacheMediatorInputConnector_3106); //$NON-NLS-1$
		case CloneMediatorInputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?CloneMediatorInputConnector", EsbElementTypes.CloneMediatorInputConnector_3172); //$NON-NLS-1$
		case RMSequenceMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?RMSequenceMediatorInputConnector", EsbElementTypes.RMSequenceMediatorInputConnector_3124); //$NON-NLS-1$
		case LoadBalanceEndPointWestOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?LoadBalanceEndPointWestOutputConnector", EsbElementTypes.LoadBalanceEndPointWestOutputConnector_3098); //$NON-NLS-1$
		case SwitchCaseBranchOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?SwitchCaseBranchOutputConnector", EsbElementTypes.SwitchCaseBranchOutputConnector_3043); //$NON-NLS-1$
		case AddressEndPointEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?AddressEndPoint", EsbElementTypes.AddressEndPoint_3029); //$NON-NLS-1$
		case CalloutMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?CalloutMediator", EsbElementTypes.CalloutMediator_3114); //$NON-NLS-1$
		case ProxyOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?ProxyOutputConnector", EsbElementTypes.ProxyOutputConnector_3002); //$NON-NLS-1$
		case FaultMediatorInputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?FaultMediatorInputConnector", EsbElementTypes.FaultMediatorInputConnector_3157); //$NON-NLS-1$
		case SendMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?SendMediator", EsbElementTypes.SendMediator_3084); //$NON-NLS-1$
		case LogMediatorInputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?LogMediatorInputConnector", EsbElementTypes.LogMediatorInputConnector_3135); //$NON-NLS-1$
		case EventMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?EventMediatorInputConnector", EsbElementTypes.EventMediatorInputConnector_3052); //$NON-NLS-1$
		case EntitlementMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?EntitlementMediatorInputConnector", EsbElementTypes.EntitlementMediatorInputConnector_3055); //$NON-NLS-1$
		case MessageMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?MessageMediator", EsbElementTypes.MessageMediator_3045); //$NON-NLS-1$
		case TransactionMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?TransactionMediator", EsbElementTypes.TransactionMediator_3117); //$NON-NLS-1$
		case Sequence2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?Sequence", EsbElementTypes.Sequence_3187); //$NON-NLS-1$
		case SendMediator2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?SendMediator", EsbElementTypes.SendMediator_3165); //$NON-NLS-1$
		case AggregateMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?AggregateMediator", EsbElementTypes.AggregateMediator_3111); //$NON-NLS-1$
		case IterateMediatorInputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?IterateMediatorInputConnector", EsbElementTypes.IterateMediatorInputConnector_3176); //$NON-NLS-1$
		case DropMediatorInputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?DropMediatorInputConnector", EsbElementTypes.DropMediatorInputConnector_3138); //$NON-NLS-1$
		case AggregateMediatorOnCompleteOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?AggregateMediatorOnCompleteOutputConnector", EsbElementTypes.AggregateMediatorOnCompleteOutputConnector_3132); //$NON-NLS-1$
		case PropertyMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?PropertyMediatorInputConnector", EsbElementTypes.PropertyMediatorInputConnector_3033); //$NON-NLS-1$
		case FailoverEndPointOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?FailoverEndPointOutputConnector", EsbElementTypes.FailoverEndPointOutputConnector_3090); //$NON-NLS-1$
		case PropertyMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?PropertyMediator", EsbElementTypes.PropertyMediator_3032); //$NON-NLS-1$
		case PropertyMediatorInputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?PropertyMediatorInputConnector", EsbElementTypes.PropertyMediatorInputConnector_3144); //$NON-NLS-1$
		case TransactionMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?TransactionMediatorInputConnector", EsbElementTypes.TransactionMediatorInputConnector_3118); //$NON-NLS-1$
		case SwitchDefaultBranchOutputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?SwitchDefaultBranchOutputConnector", EsbElementTypes.SwitchDefaultBranchOutputConnector_3155); //$NON-NLS-1$
		case SwitchDefaultBranchOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?SwitchDefaultBranchOutputConnector", EsbElementTypes.SwitchDefaultBranchOutputConnector_3044); //$NON-NLS-1$
		case DBLookupMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?DBLookupMediator", EsbElementTypes.DBLookupMediator_3075); //$NON-NLS-1$
		case EventMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?EventMediator", EsbElementTypes.EventMediator_3051); //$NON-NLS-1$
		case CalloutMediatorOutputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?CalloutMediatorOutputConnector", EsbElementTypes.CalloutMediatorOutputConnector_3182); //$NON-NLS-1$
		case ThrottleMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?ThrottleMediatorInputConnector", EsbElementTypes.ThrottleMediatorInputConnector_3121); //$NON-NLS-1$
		case ScriptMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?ScriptMediator", EsbElementTypes.ScriptMediator_3063); //$NON-NLS-1$
		case IterateMediatorOutputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?IterateMediatorOutputConnector", EsbElementTypes.IterateMediatorOutputConnector_3177); //$NON-NLS-1$
		case SequenceOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?SequenceOutputConnector", EsbElementTypes.SequenceOutputConnector_3050); //$NON-NLS-1$
		case CalloutMediatorInputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?CalloutMediatorInputConnector", EsbElementTypes.CalloutMediatorInputConnector_3181); //$NON-NLS-1$
		case HeaderMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?HeaderMediator", EsbElementTypes.HeaderMediator_3099); //$NON-NLS-1$
		case SequenceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?Sequence", EsbElementTypes.Sequence_3048); //$NON-NLS-1$
		case MergeNodeOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?MergeNodeOutputConnector", EsbElementTypes.MergeNodeOutputConnector_3016); //$NON-NLS-1$
		case CloneMediator2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?CloneMediator", EsbElementTypes.CloneMediator_3171); //$NON-NLS-1$
		case DBLookupMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?DBLookupMediatorInputConnector", EsbElementTypes.DBLookupMediatorInputConnector_3076); //$NON-NLS-1$
		case RuleMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?RuleMediatorOutputConnector", EsbElementTypes.RuleMediatorOutputConnector_3128); //$NON-NLS-1$
		case FaultMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?FaultMediator", EsbElementTypes.FaultMediator_3066); //$NON-NLS-1$
		case ScriptMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?ScriptMediatorOutputConnector", EsbElementTypes.ScriptMediatorOutputConnector_3065); //$NON-NLS-1$
		case MergeNodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?MergeNode", EsbElementTypes.MergeNode_3013); //$NON-NLS-1$
		case LoadBalanceEndPointInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?LoadBalanceEndPointInputConnector", EsbElementTypes.LoadBalanceEndPointInputConnector_3095); //$NON-NLS-1$
		case FilterMediatorInputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?FilterMediatorInputConnector", EsbElementTypes.FilterMediatorInputConnector_3140); //$NON-NLS-1$
		case ScriptMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?ScriptMediatorInputConnector", EsbElementTypes.ScriptMediatorInputConnector_3064); //$NON-NLS-1$
		case SwitchMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?SwitchMediatorInputConnector", EsbElementTypes.SwitchMediatorInputConnector_3042); //$NON-NLS-1$
		case RMSequenceMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?RMSequenceMediator", EsbElementTypes.RMSequenceMediator_3123); //$NON-NLS-1$
		case RMSequenceMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?RMSequenceMediatorOutputConnector", EsbElementTypes.RMSequenceMediatorOutputConnector_3125); //$NON-NLS-1$
		case DBReportMediatorInputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?DBReportMediatorInputConnector", EsbElementTypes.DBReportMediatorInputConnector_3163); //$NON-NLS-1$
		case CloneMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?CloneMediatorInputConnector", EsbElementTypes.CloneMediatorInputConnector_3103); //$NON-NLS-1$
		case CalloutMediator2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?CalloutMediator", EsbElementTypes.CalloutMediator_3178); //$NON-NLS-1$
		case ClassMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?ClassMediator", EsbElementTypes.ClassMediator_3057); //$NON-NLS-1$
		case IterateMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?IterateMediatorInputConnector", EsbElementTypes.IterateMediatorInputConnector_3109); //$NON-NLS-1$
		case IterateMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?IterateMediatorOutputConnector", EsbElementTypes.IterateMediatorOutputConnector_3110); //$NON-NLS-1$
		case HeaderMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?HeaderMediatorOutputConnector", EsbElementTypes.HeaderMediatorOutputConnector_3101); //$NON-NLS-1$
		case MergeNodeSecondInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?MergeNodeSecondInputConnector", EsbElementTypes.MergeNodeSecondInputConnector_3015); //$NON-NLS-1$
		case EnrichMediatorOutputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?EnrichMediatorOutputConnector", EsbElementTypes.EnrichMediatorOutputConnector_3148); //$NON-NLS-1$
		case FailoverEndPointWestOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?FailoverEndPointWestOutputConnector", EsbElementTypes.FailoverEndPointWestOutputConnector_3097); //$NON-NLS-1$
		case FilterMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?FilterMediatorInputConnector", EsbElementTypes.FilterMediatorInputConnector_3010); //$NON-NLS-1$
		case AddressEndPointOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?AddressEndPointOutputConnector", EsbElementTypes.AddressEndPointOutputConnector_3031); //$NON-NLS-1$
		case FilterMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?FilterMediator", EsbElementTypes.FilterMediator_3009); //$NON-NLS-1$
		case CommandMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?CommandMediatorInputConnector", EsbElementTypes.CommandMediatorInputConnector_3073); //$NON-NLS-1$
		case CloneMediatorTargetOutputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?CloneMediatorTargetOutputConnector", EsbElementTypes.CloneMediatorTargetOutputConnector_3174); //$NON-NLS-1$
		case DropMediator2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?DropMediator", EsbElementTypes.DropMediator_3137); //$NON-NLS-1$
		case SwitchMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?SwitchMediator", EsbElementTypes.SwitchMediator_3041); //$NON-NLS-1$
		case LogMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?LogMediatorInputConnector", EsbElementTypes.LogMediatorInputConnector_3018); //$NON-NLS-1$
		case CommandMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?CommandMediatorOutputConnector", EsbElementTypes.CommandMediatorOutputConnector_3074); //$NON-NLS-1$
		case RuleMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?RuleMediatorInputConnector", EsbElementTypes.RuleMediatorInputConnector_3127); //$NON-NLS-1$
		case FilterMediator2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?FilterMediator", EsbElementTypes.FilterMediator_3139); //$NON-NLS-1$
		case SequenceInputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?SequenceInputConnector", EsbElementTypes.SequenceInputConnector_3188); //$NON-NLS-1$
		case ThrottleMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?ThrottleMediator", EsbElementTypes.ThrottleMediator_3120); //$NON-NLS-1$
		case IterateMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?IterateMediator", EsbElementTypes.IterateMediator_3108); //$NON-NLS-1$
		case WSDLEndPointInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?WSDLEndPointInputConnector", EsbElementTypes.WSDLEndPointInputConnector_3092); //$NON-NLS-1$
		case SmooksMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?SmooksMediator", EsbElementTypes.SmooksMediator_3081); //$NON-NLS-1$
		case XSLTMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?XSLTMediatorOutputConnector", EsbElementTypes.XSLTMediatorOutputConnector_3040); //$NON-NLS-1$
		case SequenceOutputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?SequenceOutputConnector", EsbElementTypes.SequenceOutputConnector_3189); //$NON-NLS-1$
		case CalloutMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?CalloutMediatorInputConnector", EsbElementTypes.CalloutMediatorInputConnector_3115); //$NON-NLS-1$
		case SwitchMediator2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?SwitchMediator", EsbElementTypes.SwitchMediator_3152); //$NON-NLS-1$
		case RMSequenceMediatorInputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?RMSequenceMediatorInputConnector", EsbElementTypes.RMSequenceMediatorInputConnector_3185); //$NON-NLS-1$
		case CalloutMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?CalloutMediatorOutputConnector", EsbElementTypes.CalloutMediatorOutputConnector_3116); //$NON-NLS-1$
		case XSLTMediator2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?XSLTMediator", EsbElementTypes.XSLTMediator_3149); //$NON-NLS-1$
		case IterateMediator2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?IterateMediator", EsbElementTypes.IterateMediator_3175); //$NON-NLS-1$
		case PropertyMediator2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?PropertyMediator", EsbElementTypes.PropertyMediator_3143); //$NON-NLS-1$
		case CommandMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?CommandMediator", EsbElementTypes.CommandMediator_3072); //$NON-NLS-1$
		case DBReportMediatorOutputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?DBReportMediatorOutputConnector", EsbElementTypes.DBReportMediatorOutputConnector_3164); //$NON-NLS-1$
		case DBLookupMediatorOutputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?DBLookupMediatorOutputConnector", EsbElementTypes.DBLookupMediatorOutputConnector_3161); //$NON-NLS-1$
		case LogMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?LogMediator", EsbElementTypes.LogMediator_3017); //$NON-NLS-1$
		case FilterMediatorPassOutputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?FilterMediatorPassOutputConnector", EsbElementTypes.FilterMediatorPassOutputConnector_3141); //$NON-NLS-1$
		case SendMediatorInputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?SendMediatorInputConnector", EsbElementTypes.SendMediatorInputConnector_3166); //$NON-NLS-1$
		case DropMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?DropMediatorInputConnector", EsbElementTypes.DropMediatorInputConnector_3008); //$NON-NLS-1$
		case EsbServerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///org/wso2/carbonstudio/eclipse/gmf/esb?EsbServer", EsbElementTypes.EsbServer_2001); //$NON-NLS-1$
		case XQueryMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?XQueryMediatorInputConnector", EsbElementTypes.XQueryMediatorInputConnector_3070); //$NON-NLS-1$
		case FilterMediatorPassOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?FilterMediatorPassOutputConnector", EsbElementTypes.FilterMediatorPassOutputConnector_3011); //$NON-NLS-1$
		case EntitlementMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?EntitlementMediator", EsbElementTypes.EntitlementMediator_3054); //$NON-NLS-1$
		case LogMediator2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?LogMediator", EsbElementTypes.LogMediator_3134); //$NON-NLS-1$
		case MergeNodeFirstInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?MergeNodeFirstInputConnector", EsbElementTypes.MergeNodeFirstInputConnector_3014); //$NON-NLS-1$
		case TransactionMediatorOutputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?TransactionMediatorOutputConnector", EsbElementTypes.TransactionMediatorOutputConnector_3184); //$NON-NLS-1$
		case SpringMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?SpringMediatorOutputConnector", EsbElementTypes.SpringMediatorOutputConnector_3062); //$NON-NLS-1$
		case XSLTMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?XSLTMediator", EsbElementTypes.XSLTMediator_3038); //$NON-NLS-1$
		case CloneMediatorTargetOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?CloneMediatorTargetOutputConnector", EsbElementTypes.CloneMediatorTargetOutputConnector_3133); //$NON-NLS-1$
		case XSLTMediatorInputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?XSLTMediatorInputConnector", EsbElementTypes.XSLTMediatorInputConnector_3150); //$NON-NLS-1$
		case EnrichMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?EnrichMediator", EsbElementTypes.EnrichMediator_3035); //$NON-NLS-1$
		case RMSequenceMediator2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?RMSequenceMediator", EsbElementTypes.RMSequenceMediator_3180); //$NON-NLS-1$
		case XSLTMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?XSLTMediatorInputConnector", EsbElementTypes.XSLTMediatorInputConnector_3039); //$NON-NLS-1$
		case TransactionMediator2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?TransactionMediator", EsbElementTypes.TransactionMediator_3179); //$NON-NLS-1$
		case ProxyInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?ProxyInputConnector", EsbElementTypes.ProxyInputConnector_3003); //$NON-NLS-1$
		case EntitlementMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?EntitlementMediatorOutputConnector", EsbElementTypes.EntitlementMediatorOutputConnector_3056); //$NON-NLS-1$
		case SpringMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?SpringMediatorInputConnector", EsbElementTypes.SpringMediatorInputConnector_3061); //$NON-NLS-1$
		case EnrichMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?EnrichMediatorOutputConnector", EsbElementTypes.EnrichMediatorOutputConnector_3037); //$NON-NLS-1$
		case ThrottleMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?ThrottleMediatorOutputConnector", EsbElementTypes.ThrottleMediatorOutputConnector_3122); //$NON-NLS-1$
		case DBReportMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?DBReportMediator", EsbElementTypes.DBReportMediator_3078); //$NON-NLS-1$
		case HeaderMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?HeaderMediatorInputConnector", EsbElementTypes.HeaderMediatorInputConnector_3100); //$NON-NLS-1$
		case XQueryMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?XQueryMediatorOutputConnector", EsbElementTypes.XQueryMediatorOutputConnector_3071); //$NON-NLS-1$
		case CacheMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?CacheMediator", EsbElementTypes.CacheMediator_3105); //$NON-NLS-1$
		case SequenceInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?SequenceInputConnector", EsbElementTypes.SequenceInputConnector_3049); //$NON-NLS-1$
		case OAuthMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?OAuthMediatorInputConnector", EsbElementTypes.OAuthMediatorInputConnector_3130); //$NON-NLS-1$
		case DBLookupMediator2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?DBLookupMediator", EsbElementTypes.DBLookupMediator_3159); //$NON-NLS-1$
		case WSDLEndPointEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?WSDLEndPoint", EsbElementTypes.WSDLEndPoint_3091); //$NON-NLS-1$
		case DBLookupMediatorInputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?DBLookupMediatorInputConnector", EsbElementTypes.DBLookupMediatorInputConnector_3160); //$NON-NLS-1$
		case DBReportMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?DBReportMediatorInputConnector", EsbElementTypes.DBReportMediatorInputConnector_3079); //$NON-NLS-1$
		case EsbDiagramEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http:///org/wso2/carbonstudio/eclipse/gmf/esb?EsbDiagram", EsbElementTypes.EsbDiagram_1000); //$NON-NLS-1$
		case TransactionMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?TransactionMediatorOutputConnector", EsbElementTypes.TransactionMediatorOutputConnector_3119); //$NON-NLS-1$
		case EnrichMediatorInputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?EnrichMediatorInputConnector", EsbElementTypes.EnrichMediatorInputConnector_3147); //$NON-NLS-1$
		case DBReportMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?DBReportMediatorOutputConnector", EsbElementTypes.DBReportMediatorOutputConnector_3080); //$NON-NLS-1$
		case FailoverEndPointEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?FailoverEndPoint", EsbElementTypes.FailoverEndPoint_3087); //$NON-NLS-1$
		case DBLookupMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?DBLookupMediatorOutputConnector", EsbElementTypes.DBLookupMediatorOutputConnector_3077); //$NON-NLS-1$
		case XSLTMediatorOutputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?XSLTMediatorOutputConnector", EsbElementTypes.XSLTMediatorOutputConnector_3151); //$NON-NLS-1$
		case ClassMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?ClassMediatorOutputConnector", EsbElementTypes.ClassMediatorOutputConnector_3059); //$NON-NLS-1$
		case FilterMediatorFailOutputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?FilterMediatorFailOutputConnector", EsbElementTypes.FilterMediatorFailOutputConnector_3142); //$NON-NLS-1$
		case LogMediatorOutputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?LogMediatorOutputConnector", EsbElementTypes.LogMediatorOutputConnector_3136); //$NON-NLS-1$
		case OAuthMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?OAuthMediator", EsbElementTypes.OAuthMediator_3129); //$NON-NLS-1$
		case LoadBalanceEndPointEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?LoadBalanceEndPoint", EsbElementTypes.LoadBalanceEndPoint_3094); //$NON-NLS-1$
		case DropMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?DropMediator", EsbElementTypes.DropMediator_3007); //$NON-NLS-1$
		case FaultMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?FaultMediatorOutputConnector", EsbElementTypes.FaultMediatorOutputConnector_3068); //$NON-NLS-1$
		case SendMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?SendMediatorInputConnector", EsbElementTypes.SendMediatorInputConnector_3085); //$NON-NLS-1$
		case WSDLEndPointOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?WSDLEndPointOutputConnector", EsbElementTypes.WSDLEndPointOutputConnector_3093); //$NON-NLS-1$
		case AggregateMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?AggregateMediatorInputConnector", EsbElementTypes.AggregateMediatorInputConnector_3112); //$NON-NLS-1$
		case LoadBalanceEndPointOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?LoadBalanceEndPointOutputConnector", EsbElementTypes.LoadBalanceEndPointOutputConnector_3096); //$NON-NLS-1$
		case PropertyMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?PropertyMediatorOutputConnector", EsbElementTypes.PropertyMediatorOutputConnector_3034); //$NON-NLS-1$
		case FaultMediator2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?FaultMediator", EsbElementTypes.FaultMediator_3156); //$NON-NLS-1$
		case AggregateMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?AggregateMediatorOutputConnector", EsbElementTypes.AggregateMediatorOutputConnector_3113); //$NON-NLS-1$
		case SendMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?SendMediatorOutputConnector", EsbElementTypes.SendMediatorOutputConnector_3086); //$NON-NLS-1$
		case AddressEndPointInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?AddressEndPointInputConnector", EsbElementTypes.AddressEndPointInputConnector_3030); //$NON-NLS-1$
		case TransactionMediatorInputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?TransactionMediatorInputConnector", EsbElementTypes.TransactionMediatorInputConnector_3183); //$NON-NLS-1$
		case CloneMediatorOutputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?CloneMediatorOutputConnector", EsbElementTypes.CloneMediatorOutputConnector_3173); //$NON-NLS-1$
		case SwitchCaseBranchOutputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?SwitchCaseBranchOutputConnector", EsbElementTypes.SwitchCaseBranchOutputConnector_3154); //$NON-NLS-1$
		case FaultMediatorOutputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?FaultMediatorOutputConnector", EsbElementTypes.FaultMediatorOutputConnector_3158); //$NON-NLS-1$
		case DefaultEndPointEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?DefaultEndPoint", EsbElementTypes.DefaultEndPoint_3020); //$NON-NLS-1$
		case CloneMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?CloneMediatorOutputConnector", EsbElementTypes.CloneMediatorOutputConnector_3104); //$NON-NLS-1$
		case CloneMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?CloneMediator", EsbElementTypes.CloneMediator_3102); //$NON-NLS-1$
		case DefaultEndPointInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?DefaultEndPointInputConnector", EsbElementTypes.DefaultEndPointInputConnector_3021); //$NON-NLS-1$
		case PropertyMediatorOutputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?PropertyMediatorOutputConnector", EsbElementTypes.PropertyMediatorOutputConnector_3145); //$NON-NLS-1$
		case FaultMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?FaultMediatorInputConnector", EsbElementTypes.FaultMediatorInputConnector_3067); //$NON-NLS-1$
		case FilterMediatorFailOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?FilterMediatorFailOutputConnector", EsbElementTypes.FilterMediatorFailOutputConnector_3012); //$NON-NLS-1$
		case EventMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?EventMediatorOutputConnector", EsbElementTypes.EventMediatorOutputConnector_3053); //$NON-NLS-1$
		case SpringMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?SpringMediator", EsbElementTypes.SpringMediator_3060); //$NON-NLS-1$
		case EnrichMediator2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?EnrichMediator", EsbElementTypes.EnrichMediator_3146); //$NON-NLS-1$
		case RuleMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?RuleMediator", EsbElementTypes.RuleMediator_3126); //$NON-NLS-1$
		case ClassMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?ClassMediatorInputConnector", EsbElementTypes.ClassMediatorInputConnector_3058); //$NON-NLS-1$
		case SwitchMediatorInputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?SwitchMediatorInputConnector", EsbElementTypes.SwitchMediatorInputConnector_3153); //$NON-NLS-1$
		case LogMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?LogMediatorOutputConnector", EsbElementTypes.LogMediatorOutputConnector_3019); //$NON-NLS-1$
		case MessageInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?MessageInputConnector", EsbElementTypes.MessageInputConnector_3046); //$NON-NLS-1$
		case ProxyServiceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?ProxyService", EsbElementTypes.ProxyService_3001); //$NON-NLS-1$
		case HeaderMediator2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?HeaderMediator", EsbElementTypes.HeaderMediator_3168); //$NON-NLS-1$
		case HeaderMediatorOutputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?HeaderMediatorOutputConnector", EsbElementTypes.HeaderMediatorOutputConnector_3170); //$NON-NLS-1$
		case OAuthMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?OAuthMediatorOutputConnector", EsbElementTypes.OAuthMediatorOutputConnector_3131); //$NON-NLS-1$
		case XQueryMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?XQueryMediator", EsbElementTypes.XQueryMediator_3069); //$NON-NLS-1$
		case RMSequenceMediatorOutputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?RMSequenceMediatorOutputConnector", EsbElementTypes.RMSequenceMediatorOutputConnector_3186); //$NON-NLS-1$
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
		case FailoverEndPointInputConnectorEditPart.VISUAL_ID:
			return getFailoverEndPointInputConnector_3088Text(view);
		case HeaderMediatorInputConnector2EditPart.VISUAL_ID:
			return getHeaderMediatorInputConnector_3169Text(view);
		case SendMediatorOutputConnector2EditPart.VISUAL_ID:
			return getSendMediatorOutputConnector_3167Text(view);
		case CacheMediatorOutputConnectorEditPart.VISUAL_ID:
			return getCacheMediatorOutputConnector_3107Text(view);
		case EnrichMediatorInputConnectorEditPart.VISUAL_ID:
			return getEnrichMediatorInputConnector_3036Text(view);
		case DefaultEndPointOutputConnectorEditPart.VISUAL_ID:
			return getDefaultEndPointOutputConnector_3022Text(view);
		case SmooksMediatorOutputConnectorEditPart.VISUAL_ID:
			return getSmooksMediatorOutputConnector_3083Text(view);
		case EsbLinkEditPart.VISUAL_ID:
			return getEsbLink_4001Text(view);
		case DBReportMediator2EditPart.VISUAL_ID:
			return getDBReportMediator_3162Text(view);
		case SmooksMediatorInputConnectorEditPart.VISUAL_ID:
			return getSmooksMediatorInputConnector_3082Text(view);
		case MessageOutputConnectorEditPart.VISUAL_ID:
			return getMessageOutputConnector_3047Text(view);
		case CacheMediatorInputConnectorEditPart.VISUAL_ID:
			return getCacheMediatorInputConnector_3106Text(view);
		case CloneMediatorInputConnector2EditPart.VISUAL_ID:
			return getCloneMediatorInputConnector_3172Text(view);
		case RMSequenceMediatorInputConnectorEditPart.VISUAL_ID:
			return getRMSequenceMediatorInputConnector_3124Text(view);
		case LoadBalanceEndPointWestOutputConnectorEditPart.VISUAL_ID:
			return getLoadBalanceEndPointWestOutputConnector_3098Text(view);
		case SwitchCaseBranchOutputConnectorEditPart.VISUAL_ID:
			return getSwitchCaseBranchOutputConnector_3043Text(view);
		case AddressEndPointEditPart.VISUAL_ID:
			return getAddressEndPoint_3029Text(view);
		case CalloutMediatorEditPart.VISUAL_ID:
			return getCalloutMediator_3114Text(view);
		case ProxyOutputConnectorEditPart.VISUAL_ID:
			return getProxyOutputConnector_3002Text(view);
		case FaultMediatorInputConnector2EditPart.VISUAL_ID:
			return getFaultMediatorInputConnector_3157Text(view);
		case SendMediatorEditPart.VISUAL_ID:
			return getSendMediator_3084Text(view);
		case LogMediatorInputConnector2EditPart.VISUAL_ID:
			return getLogMediatorInputConnector_3135Text(view);
		case EventMediatorInputConnectorEditPart.VISUAL_ID:
			return getEventMediatorInputConnector_3052Text(view);
		case EntitlementMediatorInputConnectorEditPart.VISUAL_ID:
			return getEntitlementMediatorInputConnector_3055Text(view);
		case MessageMediatorEditPart.VISUAL_ID:
			return getMessageMediator_3045Text(view);
		case TransactionMediatorEditPart.VISUAL_ID:
			return getTransactionMediator_3117Text(view);
		case Sequence2EditPart.VISUAL_ID:
			return getSequence_3187Text(view);
		case SendMediator2EditPart.VISUAL_ID:
			return getSendMediator_3165Text(view);
		case AggregateMediatorEditPart.VISUAL_ID:
			return getAggregateMediator_3111Text(view);
		case IterateMediatorInputConnector2EditPart.VISUAL_ID:
			return getIterateMediatorInputConnector_3176Text(view);
		case DropMediatorInputConnector2EditPart.VISUAL_ID:
			return getDropMediatorInputConnector_3138Text(view);
		case AggregateMediatorOnCompleteOutputConnectorEditPart.VISUAL_ID:
			return getAggregateMediatorOnCompleteOutputConnector_3132Text(view);
		case PropertyMediatorInputConnectorEditPart.VISUAL_ID:
			return getPropertyMediatorInputConnector_3033Text(view);
		case FailoverEndPointOutputConnectorEditPart.VISUAL_ID:
			return getFailoverEndPointOutputConnector_3090Text(view);
		case PropertyMediatorEditPart.VISUAL_ID:
			return getPropertyMediator_3032Text(view);
		case PropertyMediatorInputConnector2EditPart.VISUAL_ID:
			return getPropertyMediatorInputConnector_3144Text(view);
		case TransactionMediatorInputConnectorEditPart.VISUAL_ID:
			return getTransactionMediatorInputConnector_3118Text(view);
		case SwitchDefaultBranchOutputConnector2EditPart.VISUAL_ID:
			return getSwitchDefaultBranchOutputConnector_3155Text(view);
		case SwitchDefaultBranchOutputConnectorEditPart.VISUAL_ID:
			return getSwitchDefaultBranchOutputConnector_3044Text(view);
		case DBLookupMediatorEditPart.VISUAL_ID:
			return getDBLookupMediator_3075Text(view);
		case EventMediatorEditPart.VISUAL_ID:
			return getEventMediator_3051Text(view);
		case CalloutMediatorOutputConnector2EditPart.VISUAL_ID:
			return getCalloutMediatorOutputConnector_3182Text(view);
		case ThrottleMediatorInputConnectorEditPart.VISUAL_ID:
			return getThrottleMediatorInputConnector_3121Text(view);
		case ScriptMediatorEditPart.VISUAL_ID:
			return getScriptMediator_3063Text(view);
		case IterateMediatorOutputConnector2EditPart.VISUAL_ID:
			return getIterateMediatorOutputConnector_3177Text(view);
		case SequenceOutputConnectorEditPart.VISUAL_ID:
			return getSequenceOutputConnector_3050Text(view);
		case CalloutMediatorInputConnector2EditPart.VISUAL_ID:
			return getCalloutMediatorInputConnector_3181Text(view);
		case HeaderMediatorEditPart.VISUAL_ID:
			return getHeaderMediator_3099Text(view);
		case SequenceEditPart.VISUAL_ID:
			return getSequence_3048Text(view);
		case MergeNodeOutputConnectorEditPart.VISUAL_ID:
			return getMergeNodeOutputConnector_3016Text(view);
		case CloneMediator2EditPart.VISUAL_ID:
			return getCloneMediator_3171Text(view);
		case DBLookupMediatorInputConnectorEditPart.VISUAL_ID:
			return getDBLookupMediatorInputConnector_3076Text(view);
		case RuleMediatorOutputConnectorEditPart.VISUAL_ID:
			return getRuleMediatorOutputConnector_3128Text(view);
		case FaultMediatorEditPart.VISUAL_ID:
			return getFaultMediator_3066Text(view);
		case ScriptMediatorOutputConnectorEditPart.VISUAL_ID:
			return getScriptMediatorOutputConnector_3065Text(view);
		case MergeNodeEditPart.VISUAL_ID:
			return getMergeNode_3013Text(view);
		case LoadBalanceEndPointInputConnectorEditPart.VISUAL_ID:
			return getLoadBalanceEndPointInputConnector_3095Text(view);
		case FilterMediatorInputConnector2EditPart.VISUAL_ID:
			return getFilterMediatorInputConnector_3140Text(view);
		case ScriptMediatorInputConnectorEditPart.VISUAL_ID:
			return getScriptMediatorInputConnector_3064Text(view);
		case SwitchMediatorInputConnectorEditPart.VISUAL_ID:
			return getSwitchMediatorInputConnector_3042Text(view);
		case RMSequenceMediatorEditPart.VISUAL_ID:
			return getRMSequenceMediator_3123Text(view);
		case RMSequenceMediatorOutputConnectorEditPart.VISUAL_ID:
			return getRMSequenceMediatorOutputConnector_3125Text(view);
		case DBReportMediatorInputConnector2EditPart.VISUAL_ID:
			return getDBReportMediatorInputConnector_3163Text(view);
		case CloneMediatorInputConnectorEditPart.VISUAL_ID:
			return getCloneMediatorInputConnector_3103Text(view);
		case CalloutMediator2EditPart.VISUAL_ID:
			return getCalloutMediator_3178Text(view);
		case ClassMediatorEditPart.VISUAL_ID:
			return getClassMediator_3057Text(view);
		case IterateMediatorInputConnectorEditPart.VISUAL_ID:
			return getIterateMediatorInputConnector_3109Text(view);
		case IterateMediatorOutputConnectorEditPart.VISUAL_ID:
			return getIterateMediatorOutputConnector_3110Text(view);
		case HeaderMediatorOutputConnectorEditPart.VISUAL_ID:
			return getHeaderMediatorOutputConnector_3101Text(view);
		case MergeNodeSecondInputConnectorEditPart.VISUAL_ID:
			return getMergeNodeSecondInputConnector_3015Text(view);
		case EnrichMediatorOutputConnector2EditPart.VISUAL_ID:
			return getEnrichMediatorOutputConnector_3148Text(view);
		case FailoverEndPointWestOutputConnectorEditPart.VISUAL_ID:
			return getFailoverEndPointWestOutputConnector_3097Text(view);
		case FilterMediatorInputConnectorEditPart.VISUAL_ID:
			return getFilterMediatorInputConnector_3010Text(view);
		case AddressEndPointOutputConnectorEditPart.VISUAL_ID:
			return getAddressEndPointOutputConnector_3031Text(view);
		case FilterMediatorEditPart.VISUAL_ID:
			return getFilterMediator_3009Text(view);
		case CommandMediatorInputConnectorEditPart.VISUAL_ID:
			return getCommandMediatorInputConnector_3073Text(view);
		case CloneMediatorTargetOutputConnector2EditPart.VISUAL_ID:
			return getCloneMediatorTargetOutputConnector_3174Text(view);
		case DropMediator2EditPart.VISUAL_ID:
			return getDropMediator_3137Text(view);
		case SwitchMediatorEditPart.VISUAL_ID:
			return getSwitchMediator_3041Text(view);
		case LogMediatorInputConnectorEditPart.VISUAL_ID:
			return getLogMediatorInputConnector_3018Text(view);
		case CommandMediatorOutputConnectorEditPart.VISUAL_ID:
			return getCommandMediatorOutputConnector_3074Text(view);
		case RuleMediatorInputConnectorEditPart.VISUAL_ID:
			return getRuleMediatorInputConnector_3127Text(view);
		case FilterMediator2EditPart.VISUAL_ID:
			return getFilterMediator_3139Text(view);
		case SequenceInputConnector2EditPart.VISUAL_ID:
			return getSequenceInputConnector_3188Text(view);
		case ThrottleMediatorEditPart.VISUAL_ID:
			return getThrottleMediator_3120Text(view);
		case IterateMediatorEditPart.VISUAL_ID:
			return getIterateMediator_3108Text(view);
		case WSDLEndPointInputConnectorEditPart.VISUAL_ID:
			return getWSDLEndPointInputConnector_3092Text(view);
		case SmooksMediatorEditPart.VISUAL_ID:
			return getSmooksMediator_3081Text(view);
		case XSLTMediatorOutputConnectorEditPart.VISUAL_ID:
			return getXSLTMediatorOutputConnector_3040Text(view);
		case SequenceOutputConnector2EditPart.VISUAL_ID:
			return getSequenceOutputConnector_3189Text(view);
		case CalloutMediatorInputConnectorEditPart.VISUAL_ID:
			return getCalloutMediatorInputConnector_3115Text(view);
		case SwitchMediator2EditPart.VISUAL_ID:
			return getSwitchMediator_3152Text(view);
		case RMSequenceMediatorInputConnector2EditPart.VISUAL_ID:
			return getRMSequenceMediatorInputConnector_3185Text(view);
		case CalloutMediatorOutputConnectorEditPart.VISUAL_ID:
			return getCalloutMediatorOutputConnector_3116Text(view);
		case XSLTMediator2EditPart.VISUAL_ID:
			return getXSLTMediator_3149Text(view);
		case IterateMediator2EditPart.VISUAL_ID:
			return getIterateMediator_3175Text(view);
		case PropertyMediator2EditPart.VISUAL_ID:
			return getPropertyMediator_3143Text(view);
		case CommandMediatorEditPart.VISUAL_ID:
			return getCommandMediator_3072Text(view);
		case DBReportMediatorOutputConnector2EditPart.VISUAL_ID:
			return getDBReportMediatorOutputConnector_3164Text(view);
		case DBLookupMediatorOutputConnector2EditPart.VISUAL_ID:
			return getDBLookupMediatorOutputConnector_3161Text(view);
		case LogMediatorEditPart.VISUAL_ID:
			return getLogMediator_3017Text(view);
		case FilterMediatorPassOutputConnector2EditPart.VISUAL_ID:
			return getFilterMediatorPassOutputConnector_3141Text(view);
		case SendMediatorInputConnector2EditPart.VISUAL_ID:
			return getSendMediatorInputConnector_3166Text(view);
		case DropMediatorInputConnectorEditPart.VISUAL_ID:
			return getDropMediatorInputConnector_3008Text(view);
		case EsbServerEditPart.VISUAL_ID:
			return getEsbServer_2001Text(view);
		case XQueryMediatorInputConnectorEditPart.VISUAL_ID:
			return getXQueryMediatorInputConnector_3070Text(view);
		case FilterMediatorPassOutputConnectorEditPart.VISUAL_ID:
			return getFilterMediatorPassOutputConnector_3011Text(view);
		case EntitlementMediatorEditPart.VISUAL_ID:
			return getEntitlementMediator_3054Text(view);
		case LogMediator2EditPart.VISUAL_ID:
			return getLogMediator_3134Text(view);
		case MergeNodeFirstInputConnectorEditPart.VISUAL_ID:
			return getMergeNodeFirstInputConnector_3014Text(view);
		case TransactionMediatorOutputConnector2EditPart.VISUAL_ID:
			return getTransactionMediatorOutputConnector_3184Text(view);
		case SpringMediatorOutputConnectorEditPart.VISUAL_ID:
			return getSpringMediatorOutputConnector_3062Text(view);
		case XSLTMediatorEditPart.VISUAL_ID:
			return getXSLTMediator_3038Text(view);
		case CloneMediatorTargetOutputConnectorEditPart.VISUAL_ID:
			return getCloneMediatorTargetOutputConnector_3133Text(view);
		case XSLTMediatorInputConnector2EditPart.VISUAL_ID:
			return getXSLTMediatorInputConnector_3150Text(view);
		case EnrichMediatorEditPart.VISUAL_ID:
			return getEnrichMediator_3035Text(view);
		case RMSequenceMediator2EditPart.VISUAL_ID:
			return getRMSequenceMediator_3180Text(view);
		case XSLTMediatorInputConnectorEditPart.VISUAL_ID:
			return getXSLTMediatorInputConnector_3039Text(view);
		case TransactionMediator2EditPart.VISUAL_ID:
			return getTransactionMediator_3179Text(view);
		case ProxyInputConnectorEditPart.VISUAL_ID:
			return getProxyInputConnector_3003Text(view);
		case EntitlementMediatorOutputConnectorEditPart.VISUAL_ID:
			return getEntitlementMediatorOutputConnector_3056Text(view);
		case SpringMediatorInputConnectorEditPart.VISUAL_ID:
			return getSpringMediatorInputConnector_3061Text(view);
		case EnrichMediatorOutputConnectorEditPart.VISUAL_ID:
			return getEnrichMediatorOutputConnector_3037Text(view);
		case ThrottleMediatorOutputConnectorEditPart.VISUAL_ID:
			return getThrottleMediatorOutputConnector_3122Text(view);
		case DBReportMediatorEditPart.VISUAL_ID:
			return getDBReportMediator_3078Text(view);
		case HeaderMediatorInputConnectorEditPart.VISUAL_ID:
			return getHeaderMediatorInputConnector_3100Text(view);
		case XQueryMediatorOutputConnectorEditPart.VISUAL_ID:
			return getXQueryMediatorOutputConnector_3071Text(view);
		case CacheMediatorEditPart.VISUAL_ID:
			return getCacheMediator_3105Text(view);
		case SequenceInputConnectorEditPart.VISUAL_ID:
			return getSequenceInputConnector_3049Text(view);
		case OAuthMediatorInputConnectorEditPart.VISUAL_ID:
			return getOAuthMediatorInputConnector_3130Text(view);
		case DBLookupMediator2EditPart.VISUAL_ID:
			return getDBLookupMediator_3159Text(view);
		case WSDLEndPointEditPart.VISUAL_ID:
			return getWSDLEndPoint_3091Text(view);
		case DBLookupMediatorInputConnector2EditPart.VISUAL_ID:
			return getDBLookupMediatorInputConnector_3160Text(view);
		case DBReportMediatorInputConnectorEditPart.VISUAL_ID:
			return getDBReportMediatorInputConnector_3079Text(view);
		case EsbDiagramEditPart.VISUAL_ID:
			return getEsbDiagram_1000Text(view);
		case TransactionMediatorOutputConnectorEditPart.VISUAL_ID:
			return getTransactionMediatorOutputConnector_3119Text(view);
		case EnrichMediatorInputConnector2EditPart.VISUAL_ID:
			return getEnrichMediatorInputConnector_3147Text(view);
		case DBReportMediatorOutputConnectorEditPart.VISUAL_ID:
			return getDBReportMediatorOutputConnector_3080Text(view);
		case FailoverEndPointEditPart.VISUAL_ID:
			return getFailoverEndPoint_3087Text(view);
		case DBLookupMediatorOutputConnectorEditPart.VISUAL_ID:
			return getDBLookupMediatorOutputConnector_3077Text(view);
		case XSLTMediatorOutputConnector2EditPart.VISUAL_ID:
			return getXSLTMediatorOutputConnector_3151Text(view);
		case ClassMediatorOutputConnectorEditPart.VISUAL_ID:
			return getClassMediatorOutputConnector_3059Text(view);
		case FilterMediatorFailOutputConnector2EditPart.VISUAL_ID:
			return getFilterMediatorFailOutputConnector_3142Text(view);
		case LogMediatorOutputConnector2EditPart.VISUAL_ID:
			return getLogMediatorOutputConnector_3136Text(view);
		case OAuthMediatorEditPart.VISUAL_ID:
			return getOAuthMediator_3129Text(view);
		case LoadBalanceEndPointEditPart.VISUAL_ID:
			return getLoadBalanceEndPoint_3094Text(view);
		case DropMediatorEditPart.VISUAL_ID:
			return getDropMediator_3007Text(view);
		case FaultMediatorOutputConnectorEditPart.VISUAL_ID:
			return getFaultMediatorOutputConnector_3068Text(view);
		case SendMediatorInputConnectorEditPart.VISUAL_ID:
			return getSendMediatorInputConnector_3085Text(view);
		case WSDLEndPointOutputConnectorEditPart.VISUAL_ID:
			return getWSDLEndPointOutputConnector_3093Text(view);
		case AggregateMediatorInputConnectorEditPart.VISUAL_ID:
			return getAggregateMediatorInputConnector_3112Text(view);
		case LoadBalanceEndPointOutputConnectorEditPart.VISUAL_ID:
			return getLoadBalanceEndPointOutputConnector_3096Text(view);
		case PropertyMediatorOutputConnectorEditPart.VISUAL_ID:
			return getPropertyMediatorOutputConnector_3034Text(view);
		case FaultMediator2EditPart.VISUAL_ID:
			return getFaultMediator_3156Text(view);
		case AggregateMediatorOutputConnectorEditPart.VISUAL_ID:
			return getAggregateMediatorOutputConnector_3113Text(view);
		case SendMediatorOutputConnectorEditPart.VISUAL_ID:
			return getSendMediatorOutputConnector_3086Text(view);
		case AddressEndPointInputConnectorEditPart.VISUAL_ID:
			return getAddressEndPointInputConnector_3030Text(view);
		case TransactionMediatorInputConnector2EditPart.VISUAL_ID:
			return getTransactionMediatorInputConnector_3183Text(view);
		case CloneMediatorOutputConnector2EditPart.VISUAL_ID:
			return getCloneMediatorOutputConnector_3173Text(view);
		case SwitchCaseBranchOutputConnector2EditPart.VISUAL_ID:
			return getSwitchCaseBranchOutputConnector_3154Text(view);
		case FaultMediatorOutputConnector2EditPart.VISUAL_ID:
			return getFaultMediatorOutputConnector_3158Text(view);
		case DefaultEndPointEditPart.VISUAL_ID:
			return getDefaultEndPoint_3020Text(view);
		case CloneMediatorOutputConnectorEditPart.VISUAL_ID:
			return getCloneMediatorOutputConnector_3104Text(view);
		case CloneMediatorEditPart.VISUAL_ID:
			return getCloneMediator_3102Text(view);
		case DefaultEndPointInputConnectorEditPart.VISUAL_ID:
			return getDefaultEndPointInputConnector_3021Text(view);
		case PropertyMediatorOutputConnector2EditPart.VISUAL_ID:
			return getPropertyMediatorOutputConnector_3145Text(view);
		case FaultMediatorInputConnectorEditPart.VISUAL_ID:
			return getFaultMediatorInputConnector_3067Text(view);
		case FilterMediatorFailOutputConnectorEditPart.VISUAL_ID:
			return getFilterMediatorFailOutputConnector_3012Text(view);
		case EventMediatorOutputConnectorEditPart.VISUAL_ID:
			return getEventMediatorOutputConnector_3053Text(view);
		case SpringMediatorEditPart.VISUAL_ID:
			return getSpringMediator_3060Text(view);
		case EnrichMediator2EditPart.VISUAL_ID:
			return getEnrichMediator_3146Text(view);
		case RuleMediatorEditPart.VISUAL_ID:
			return getRuleMediator_3126Text(view);
		case ClassMediatorInputConnectorEditPart.VISUAL_ID:
			return getClassMediatorInputConnector_3058Text(view);
		case SwitchMediatorInputConnector2EditPart.VISUAL_ID:
			return getSwitchMediatorInputConnector_3153Text(view);
		case LogMediatorOutputConnectorEditPart.VISUAL_ID:
			return getLogMediatorOutputConnector_3019Text(view);
		case MessageInputConnectorEditPart.VISUAL_ID:
			return getMessageInputConnector_3046Text(view);
		case ProxyServiceEditPart.VISUAL_ID:
			return getProxyService_3001Text(view);
		case HeaderMediator2EditPart.VISUAL_ID:
			return getHeaderMediator_3168Text(view);
		case HeaderMediatorOutputConnector2EditPart.VISUAL_ID:
			return getHeaderMediatorOutputConnector_3170Text(view);
		case OAuthMediatorOutputConnectorEditPart.VISUAL_ID:
			return getOAuthMediatorOutputConnector_3131Text(view);
		case XQueryMediatorEditPart.VISUAL_ID:
			return getXQueryMediator_3069Text(view);
		case RMSequenceMediatorOutputConnector2EditPart.VISUAL_ID:
			return getRMSequenceMediatorOutputConnector_3186Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getDBLookupMediatorOutputConnector_3161Text(View view) {
		return ""; //$NON-NLS-1$
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
	private String getXSLTMediator_3149Text(View view) {
		XSLTMediator domainModelElement = (XSLTMediator) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.isReverse());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3149); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getWSDLEndPoint_3091Text(View view) {
		IParser parser = EsbParserProvider.getParser(
				EsbElementTypes.WSDLEndPoint_3091,
				view.getElement() != null ? view.getElement() : view,
				EsbVisualIDRegistry
						.getType(WSDLEndPointEndPointNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5020); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCalloutMediator_3178Text(View view) {
		IParser parser = EsbParserProvider.getParser(
				EsbElementTypes.CalloutMediator_3178,
				view.getElement() != null ? view.getElement() : view,
				EsbVisualIDRegistry
						.getType(CalloutMediatorSoapAction2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5040); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getScriptMediator_3063Text(View view) {
		IParser parser = EsbParserProvider
				.getParser(
						EsbElementTypes.ScriptMediator_3063,
						view.getElement() != null ? view.getElement() : view,
						EsbVisualIDRegistry
								.getType(ScriptMediatorScriptLanguageEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
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
	private String getEsbServer_2001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getEnrichMediator_3146Text(View view) {
		IParser parser = EsbParserProvider.getParser(
				EsbElementTypes.EnrichMediator_3146,
				view.getElement() != null ? view.getElement() : view,
				EsbVisualIDRegistry
						.getType(EnrichMediatorSourceType2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5033); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
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
	private String getDBReportMediatorInputConnector_3163Text(View view) {
		return ""; //$NON-NLS-1$
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
	private String getXQueryMediator_3069Text(View view) {
		IParser parser = EsbParserProvider
				.getParser(
						EsbElementTypes.XQueryMediator_3069,
						view.getElement() != null ? view.getElement() : view,
						EsbVisualIDRegistry
								.getType(XQueryMediatorScriptKeyTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
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
	private String getCloneMediatorOutputConnector_3173Text(View view) {
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
	private String getFaultMediatorInputConnector_3067Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getFaultMediatorInputConnector_3157Text(View view) {
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
	private String getSequenceInputConnector_3049Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getLogMediatorOutputConnector_3136Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getTransactionMediator_3179Text(View view) {
		TransactionMediator domainModelElement = (TransactionMediator) view
				.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.isReverse());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3179); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSmooksMediator_3081Text(View view) {
		SmooksMediator domainModelElement = (SmooksMediator) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.isReverse());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3081); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
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
	private String getDropMediatorInputConnector_3138Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getIterateMediatorOutputConnector_3177Text(View view) {
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
	private String getFilterMediatorFailOutputConnector_3142Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getDBReportMediator_3078Text(View view) {
		IParser parser = EsbParserProvider
				.getParser(
						EsbElementTypes.DBReportMediator_3078,
						view.getElement() != null ? view.getElement() : view,
						EsbVisualIDRegistry
								.getType(DBReportMediatorConnectionURLEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5018); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCloneMediator_3102Text(View view) {
		IParser parser = EsbParserProvider.getParser(
				EsbElementTypes.CloneMediator_3102,
				view.getElement() != null ? view.getElement() : view,
				EsbVisualIDRegistry
						.getType(CloneMediatorCloneIDEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5023); //$NON-NLS-1$
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
	private String getProxyInputConnector_3003Text(View view) {
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
	private String getSwitchCaseBranchOutputConnector_3154Text(View view) {
		SwitchCaseBranchOutputConnector domainModelElement = (SwitchCaseBranchOutputConnector) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getCaseRegex();
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3154); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
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
	private String getTransactionMediatorOutputConnector_3119Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getDBLookupMediator_3075Text(View view) {
		IParser parser = EsbParserProvider
				.getParser(
						EsbElementTypes.DBLookupMediator_3075,
						view.getElement() != null ? view.getElement() : view,
						EsbVisualIDRegistry
								.getType(DBLookupMediatorConnectionURLEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5017); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDefaultEndPoint_3020Text(View view) {
		IParser parser = EsbParserProvider
				.getParser(
						EsbElementTypes.DefaultEndPoint_3020,
						view.getElement() != null ? view.getElement() : view,
						EsbVisualIDRegistry
								.getType(DefaultEndPointEndPointNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
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
	private String getEntitlementMediator_3054Text(View view) {
		IParser parser = EsbParserProvider
				.getParser(
						EsbElementTypes.EntitlementMediator_3054,
						view.getElement() != null ? view.getElement() : view,
						EsbVisualIDRegistry
								.getType(EntitlementMediatorServerURLEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
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
	private String getSequenceOutputConnector_3189Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getCalloutMediatorOutputConnector_3182Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getIterateMediatorInputConnector_3176Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getSwitchDefaultBranchOutputConnector_3155Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getOAuthMediator_3129Text(View view) {
		IParser parser = EsbParserProvider
				.getParser(
						EsbElementTypes.OAuthMediator_3129,
						view.getElement() != null ? view.getElement() : view,
						EsbVisualIDRegistry
								.getType(OAuthMediatorRemoteServiceUrlEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5029); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
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
	private String getSpringMediator_3060Text(View view) {
		IParser parser = EsbParserProvider.getParser(
				EsbElementTypes.SpringMediator_3060,
				view.getElement() != null ? view.getElement() : view,
				EsbVisualIDRegistry
						.getType(SpringMediatorBeanNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getClassMediator_3057Text(View view) {
		IParser parser = EsbParserProvider.getParser(
				EsbElementTypes.ClassMediator_3057,
				view.getElement() != null ? view.getElement() : view,
				EsbVisualIDRegistry
						.getType(ClassMediatorClassNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
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
	private String getThrottleMediatorInputConnector_3121Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getRMSequenceMediatorInputConnector_3185Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getDBReportMediator_3162Text(View view) {
		IParser parser = EsbParserProvider
				.getParser(
						EsbElementTypes.DBReportMediator_3162,
						view.getElement() != null ? view.getElement() : view,
						EsbVisualIDRegistry
								.getType(DBReportMediatorConnectionURL2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5036); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
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
	private String getDropMediator_3137Text(View view) {
		DropMediator domainModelElement = (DropMediator) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.isReverse());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3137); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getFaultMediator_3156Text(View view) {
		IParser parser = EsbParserProvider
				.getParser(
						EsbElementTypes.FaultMediator_3156,
						view.getElement() != null ? view.getElement() : view,
						EsbVisualIDRegistry
								.getType(FaultMediatorFaultStringType2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5034); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
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
	private String getSmooksMediatorOutputConnector_3083Text(View view) {
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
	private String getSpringMediatorInputConnector_3061Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getAggregateMediator_3111Text(View view) {
		IParser parser = EsbParserProvider
				.getParser(
						EsbElementTypes.AggregateMediator_3111,
						view.getElement() != null ? view.getElement() : view,
						EsbVisualIDRegistry
								.getType(AggregateMediatorAggregateIDEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5026); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
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
	private String getDropMediator_3007Text(View view) {
		DropMediator domainModelElement = (DropMediator) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.isReverse());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSequence_3187Text(View view) {
		Sequence domainModelElement = (Sequence) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3187); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPropertyMediatorOutputConnector_3145Text(View view) {
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
	private String getRMSequenceMediator_3123Text(View view) {
		RMSequenceMediator domainModelElement = (RMSequenceMediator) view
				.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.isReverse());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3123); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
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
	private String getCalloutMediatorInputConnector_3181Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getSwitchMediator_3152Text(View view) {
		SwitchMediator domainModelElement = (SwitchMediator) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getNamespace();
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3152); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getFilterMediator_3009Text(View view) {
		IParser parser = EsbParserProvider
				.getParser(
						EsbElementTypes.FilterMediator_3009,
						view.getElement() != null ? view.getElement() : view,
						EsbVisualIDRegistry
								.getType(FilterMediatorConditionTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEnrichMediatorInputConnector_3147Text(View view) {
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
	private String getFailoverEndPointWestOutputConnector_3097Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getIterateMediator_3175Text(View view) {
		IParser parser = EsbParserProvider.getParser(
				EsbElementTypes.IterateMediator_3175,
				view.getElement() != null ? view.getElement() : view,
				EsbVisualIDRegistry
						.getType(IterateMediatorIterateID2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5039); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
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
	private String getLogMediatorInputConnector_3135Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getLoadBalanceEndPoint_3094Text(View view) {
		IParser parser = EsbParserProvider
				.getParser(
						EsbElementTypes.LoadBalanceEndPoint_3094,
						view.getElement() != null ? view.getElement() : view,
						EsbVisualIDRegistry
								.getType(LoadBalanceEndPointEndPointNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5021); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSendMediatorInputConnector_3166Text(View view) {
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
	private String getClassMediatorInputConnector_3058Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getFailoverEndPoint_3087Text(View view) {
		IParser parser = EsbParserProvider
				.getParser(
						EsbElementTypes.FailoverEndPoint_3087,
						view.getElement() != null ? view.getElement() : view,
						EsbVisualIDRegistry
								.getType(FailoverEndPointEndPointNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5019); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSendMediator_3165Text(View view) {
		SendMediator domainModelElement = (SendMediator) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.isReverse());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3165); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
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
	private String getDBLookupMediatorInputConnector_3160Text(View view) {
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
	private String getCloneMediatorOutputConnector_3104Text(View view) {
		return ""; //$NON-NLS-1$
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
	private String getXSLTMediatorInputConnector_3150Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getSwitchMediator_3041Text(View view) {
		SwitchMediator domainModelElement = (SwitchMediator) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getNamespace();
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3041); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
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
	private String getRMSequenceMediator_3180Text(View view) {
		RMSequenceMediator domainModelElement = (RMSequenceMediator) view
				.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.isReverse());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3180); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCommandMediator_3072Text(View view) {
		IParser parser = EsbParserProvider.getParser(
				EsbElementTypes.CommandMediator_3072,
				view.getElement() != null ? view.getElement() : view,
				EsbVisualIDRegistry
						.getType(CommandMediatorClassNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5016); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getFilterMediatorInputConnector_3140Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getFilterMediator_3139Text(View view) {
		IParser parser = EsbParserProvider
				.getParser(
						EsbElementTypes.FilterMediator_3139,
						view.getElement() != null ? view.getElement() : view,
						EsbVisualIDRegistry
								.getType(FilterMediatorConditionType2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5031); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLogMediator_3134Text(View view) {
		IParser parser = EsbParserProvider.getParser(
				EsbElementTypes.LogMediator_3134,
				view.getElement() != null ? view.getElement() : view,
				EsbVisualIDRegistry
						.getType(LogMediatorLogCategory2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5030); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
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
	private String getPropertyMediatorInputConnector_3144Text(View view) {
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
	private String getEnrichMediator_3035Text(View view) {
		IParser parser = EsbParserProvider.getParser(
				EsbElementTypes.EnrichMediator_3035,
				view.getElement() != null ? view.getElement() : view,
				EsbVisualIDRegistry
						.getType(EnrichMediatorSourceTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCalloutMediator_3114Text(View view) {
		IParser parser = EsbParserProvider.getParser(
				EsbElementTypes.CalloutMediator_3114,
				view.getElement() != null ? view.getElement() : view,
				EsbVisualIDRegistry
						.getType(CalloutMediatorSoapActionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5027); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSwitchMediatorInputConnector_3153Text(View view) {
		return ""; //$NON-NLS-1$
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
	private String getHeaderMediatorOutputConnector_3170Text(View view) {
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
	private String getAddressEndPoint_3029Text(View view) {
		IParser parser = EsbParserProvider
				.getParser(
						EsbElementTypes.AddressEndPoint_3029,
						view.getElement() != null ? view.getElement() : view,
						EsbVisualIDRegistry
								.getType(AddressEndPointEndPointNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPropertyMediator_3032Text(View view) {
		IParser parser = EsbParserProvider
				.getParser(
						EsbElementTypes.PropertyMediator_3032,
						view.getElement() != null ? view.getElement() : view,
						EsbVisualIDRegistry
								.getType(PropertyMediatorPropertyNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5002); //$NON-NLS-1$
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
	private String getRuleMediator_3126Text(View view) {
		RuleMediator domainModelElement = (RuleMediator) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.isReverse());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3126); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
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
	private String getLoadBalanceEndPointInputConnector_3095Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getHeaderMediatorInputConnector_3169Text(View view) {
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
	private String getFaultMediatorOutputConnector_3158Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getCacheMediator_3105Text(View view) {
		IParser parser = EsbParserProvider.getParser(
				EsbElementTypes.CacheMediator_3105,
				view.getElement() != null ? view.getElement() : view,
				EsbVisualIDRegistry
						.getType(CacheMediatorCacheIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5024); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
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
	private String getDBReportMediatorOutputConnector_3164Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getIterateMediator_3108Text(View view) {
		IParser parser = EsbParserProvider.getParser(
				EsbElementTypes.IterateMediator_3108,
				view.getElement() != null ? view.getElement() : view,
				EsbVisualIDRegistry
						.getType(IterateMediatorIterateIDEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5025); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
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
	private String getCalloutMediatorOutputConnector_3116Text(View view) {
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
	private String getSequence_3048Text(View view) {
		IParser parser = EsbParserProvider.getParser(
				EsbElementTypes.Sequence_3048,
				view.getElement() != null ? view.getElement() : view,
				EsbVisualIDRegistry.getType(SequenceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5041); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
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
	private String getSequenceInputConnector_3188Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getTransactionMediatorOutputConnector_3184Text(View view) {
		return ""; //$NON-NLS-1$
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
	private String getTransactionMediator_3117Text(View view) {
		TransactionMediator domainModelElement = (TransactionMediator) view
				.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.isReverse());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3117); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSendMediator_3084Text(View view) {
		SendMediator domainModelElement = (SendMediator) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.isReverse());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3084); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
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
	private String getLogMediator_3017Text(View view) {
		IParser parser = EsbParserProvider.getParser(
				EsbElementTypes.LogMediator_3017,
				view.getElement() != null ? view.getElement() : view,
				EsbVisualIDRegistry
						.getType(LogMediatorLogCategoryEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
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
	private String getSendMediatorInputConnector_3085Text(View view) {
		return ""; //$NON-NLS-1$
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
	private String getXSLTMediatorOutputConnector_3151Text(View view) {
		return ""; //$NON-NLS-1$
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
	private String getPropertyMediator_3143Text(View view) {
		IParser parser = EsbParserProvider
				.getParser(
						EsbElementTypes.PropertyMediator_3143,
						view.getElement() != null ? view.getElement() : view,
						EsbVisualIDRegistry
								.getType(PropertyMediatorPropertyName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5032); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
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
	private String getLogMediatorOutputConnector_3019Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getDBLookupMediator_3159Text(View view) {
		IParser parser = EsbParserProvider
				.getParser(
						EsbElementTypes.DBLookupMediator_3159,
						view.getElement() != null ? view.getElement() : view,
						EsbVisualIDRegistry
								.getType(DBLookupMediatorConnectionURL2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5035); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRMSequenceMediatorOutputConnector_3186Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getCloneMediatorInputConnector_3172Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getFaultMediator_3066Text(View view) {
		IParser parser = EsbParserProvider
				.getParser(
						EsbElementTypes.FaultMediator_3066,
						view.getElement() != null ? view.getElement() : view,
						EsbVisualIDRegistry
								.getType(FaultMediatorFaultStringTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
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
	private String getHeaderMediator_3099Text(View view) {
		IParser parser = EsbParserProvider.getParser(
				EsbElementTypes.HeaderMediator_3099,
				view.getElement() != null ? view.getElement() : view,
				EsbVisualIDRegistry
						.getType(HeaderMediatorValueLiteralEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5022); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEventMediator_3051Text(View view) {
		IParser parser = EsbParserProvider.getParser(
				EsbElementTypes.EventMediator_3051,
				view.getElement() != null ? view.getElement() : view,
				EsbVisualIDRegistry
						.getType(EventMediatorTopicTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEnrichMediatorOutputConnector_3148Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getCloneMediator_3171Text(View view) {
		IParser parser = EsbParserProvider.getParser(
				EsbElementTypes.CloneMediator_3171,
				view.getElement() != null ? view.getElement() : view,
				EsbVisualIDRegistry
						.getType(CloneMediatorCloneID2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5038); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getFilterMediatorPassOutputConnector_3141Text(View view) {
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
	private String getEventMediatorOutputConnector_3053Text(View view) {
		return ""; //$NON-NLS-1$
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
	private String getThrottleMediator_3120Text(View view) {
		IParser parser = EsbParserProvider.getParser(
				EsbElementTypes.ThrottleMediator_3120,
				view.getElement() != null ? view.getElement() : view,
				EsbVisualIDRegistry
						.getType(ThrottleMediatorGroupIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5028); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSendMediatorOutputConnector_3167Text(View view) {
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
	private String getRMSequenceMediatorOutputConnector_3125Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getHeaderMediator_3168Text(View view) {
		IParser parser = EsbParserProvider
				.getParser(
						EsbElementTypes.HeaderMediator_3168,
						view.getElement() != null ? view.getElement() : view,
						EsbVisualIDRegistry
								.getType(HeaderMediatorValueLiteral2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5037); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getXSLTMediator_3038Text(View view) {
		XSLTMediator domainModelElement = (XSLTMediator) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.isReverse());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3038); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCloneMediatorTargetOutputConnector_3174Text(View view) {
		CloneMediatorTargetOutputConnector domainModelElement = (CloneMediatorTargetOutputConnector) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getSoapAction();
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3174); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTransactionMediatorInputConnector_3183Text(View view) {
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
