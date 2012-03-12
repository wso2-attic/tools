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
import org.wso2.carbonstudio.eclipse.gmf.esb.CloneMediatorTargetOutputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.DropMediator;
import org.wso2.carbonstudio.eclipse.gmf.esb.EsbDiagram;
import org.wso2.carbonstudio.eclipse.gmf.esb.MergeNode;
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
		case HeaderMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?HeaderMediator", EsbElementTypes.HeaderMediator_3227); //$NON-NLS-1$
		case DBReportMediatorInputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?DBReportMediatorInputConnector", EsbElementTypes.DBReportMediatorInputConnector_3163); //$NON-NLS-1$
		case IterateMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?IterateMediator", EsbElementTypes.IterateMediator_3230); //$NON-NLS-1$
		case DefaultEndPointInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?DefaultEndPointInputConnector", EsbElementTypes.DefaultEndPointInputConnector_3021); //$NON-NLS-1$
		case EntitlementMediatorInputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?EntitlementMediatorInputConnector", EsbElementTypes.EntitlementMediatorInputConnector_3261); //$NON-NLS-1$
		case SpringMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?SpringMediatorOutputConnector", EsbElementTypes.SpringMediatorOutputConnector_3062); //$NON-NLS-1$
		case XSLTMediator4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?XSLTMediator", EsbElementTypes.XSLTMediator_3337); //$NON-NLS-1$
		case FilterMediatorInputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?FilterMediatorInputConnector", EsbElementTypes.FilterMediatorInputConnector_3140); //$NON-NLS-1$
		case LogMediatorOutputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?LogMediatorOutputConnector", EsbElementTypes.LogMediatorOutputConnector_3136); //$NON-NLS-1$
		case CacheMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?CacheMediatorInputConnector", EsbElementTypes.CacheMediatorInputConnector_3106); //$NON-NLS-1$
		case Sequence3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?Sequence", EsbElementTypes.Sequence_3254); //$NON-NLS-1$
		case CommandMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?CommandMediator", EsbElementTypes.CommandMediator_3222); //$NON-NLS-1$
		case PropertyMediatorOutputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?PropertyMediatorOutputConnector", EsbElementTypes.PropertyMediatorOutputConnector_3145); //$NON-NLS-1$
		case DBReportMediatorOutputConnector3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?DBReportMediatorOutputConnector", EsbElementTypes.DBReportMediatorOutputConnector_3286); //$NON-NLS-1$
		case RMSequenceMediatorOutputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?RMSequenceMediatorOutputConnector", EsbElementTypes.RMSequenceMediatorOutputConnector_3186); //$NON-NLS-1$
		case SendMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?SendMediator", EsbElementTypes.SendMediator_3226); //$NON-NLS-1$
		case PropertyMediatorInputConnector3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?PropertyMediatorInputConnector", EsbElementTypes.PropertyMediatorInputConnector_3201); //$NON-NLS-1$
		case SequenceInputConnector3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?SequenceInputConnector", EsbElementTypes.SequenceInputConnector_3255); //$NON-NLS-1$
		case WSDLEndPointInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?WSDLEndPointInputConnector", EsbElementTypes.WSDLEndPointInputConnector_3092); //$NON-NLS-1$
		case SequenceInputConnector4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?SequenceInputConnector", EsbElementTypes.SequenceInputConnector_3376); //$NON-NLS-1$
		case ProxyServiceOutSequenceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?ProxyServiceOutSequence", EsbElementTypes.ProxyServiceOutSequence_3198); //$NON-NLS-1$
		case DropMediatorInputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?DropMediatorInputConnector", EsbElementTypes.DropMediatorInputConnector_3138); //$NON-NLS-1$
		case SmooksMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?SmooksMediator", EsbElementTypes.SmooksMediator_3225); //$NON-NLS-1$
		case LoadBalanceEndPointInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?LoadBalanceEndPointInputConnector", EsbElementTypes.LoadBalanceEndPointInputConnector_3095); //$NON-NLS-1$
		case DBReportMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?DBReportMediator", EsbElementTypes.DBReportMediator_3224); //$NON-NLS-1$
		case CacheMediatorOutputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?CacheMediatorOutputConnector", EsbElementTypes.CacheMediatorOutputConnector_3302); //$NON-NLS-1$
		case DBLookupMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?DBLookupMediatorInputConnector", EsbElementTypes.DBLookupMediatorInputConnector_3076); //$NON-NLS-1$
		case XSLTMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?XSLTMediatorInputConnector", EsbElementTypes.XSLTMediatorInputConnector_3039); //$NON-NLS-1$
		case LogMediatorOutputConnector3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?LogMediatorOutputConnector", EsbElementTypes.LogMediatorOutputConnector_3243); //$NON-NLS-1$
		case IterateMediatorOutputConnector4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?IterateMediatorOutputConnector", EsbElementTypes.IterateMediatorOutputConnector_3365); //$NON-NLS-1$
		case EnrichMediatorInputConnector3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?EnrichMediatorInputConnector", EsbElementTypes.EnrichMediatorInputConnector_3245); //$NON-NLS-1$
		case LoadBalanceEndPoint2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?LoadBalanceEndPoint", EsbElementTypes.LoadBalanceEndPoint_3386); //$NON-NLS-1$
		case SendMediatorOutputConnector4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?SendMediatorOutputConnector", EsbElementTypes.SendMediatorOutputConnector_3355); //$NON-NLS-1$
		case EnrichMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?EnrichMediatorOutputConnector", EsbElementTypes.EnrichMediatorOutputConnector_3037); //$NON-NLS-1$
		case IterateMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?IterateMediatorInputConnector", EsbElementTypes.IterateMediatorInputConnector_3109); //$NON-NLS-1$
		case RMSequenceMediator4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?RMSequenceMediator", EsbElementTypes.RMSequenceMediator_3372); //$NON-NLS-1$
		case SequenceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?Sequence", EsbElementTypes.Sequence_3214); //$NON-NLS-1$
		case ThrottleMediatorOutputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?ThrottleMediatorOutputConnector", EsbElementTypes.ThrottleMediatorOutputConnector_3208); //$NON-NLS-1$
		case Sequence2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?Sequence", EsbElementTypes.Sequence_3187); //$NON-NLS-1$
		case CloneMediator4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?CloneMediator", EsbElementTypes.CloneMediator_3359); //$NON-NLS-1$
		case EntitlementMediator2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?EntitlementMediator", EsbElementTypes.EntitlementMediator_3260); //$NON-NLS-1$
		case EnrichMediatorOutputConnector4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?EnrichMediatorOutputConnector", EsbElementTypes.EnrichMediatorOutputConnector_3389); //$NON-NLS-1$
		case SwitchDefaultBranchOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?SwitchDefaultBranchOutputConnector", EsbElementTypes.SwitchDefaultBranchOutputConnector_3044); //$NON-NLS-1$
		case LogMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?LogMediatorInputConnector", EsbElementTypes.LogMediatorInputConnector_3018); //$NON-NLS-1$
		case PropertyMediatorOutputConnector4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?PropertyMediatorOutputConnector", EsbElementTypes.PropertyMediatorOutputConnector_3204); //$NON-NLS-1$
		case FaultMediatorInputConnector3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?FaultMediatorInputConnector", EsbElementTypes.FaultMediatorInputConnector_3273); //$NON-NLS-1$
		case ThrottleMediatorInputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?ThrottleMediatorInputConnector", EsbElementTypes.ThrottleMediatorInputConnector_3207); //$NON-NLS-1$
		case EventMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?EventMediatorInputConnector", EsbElementTypes.EventMediatorInputConnector_3052); //$NON-NLS-1$
		case FilterMediatorInputConnector4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?FilterMediatorInputConnector", EsbElementTypes.FilterMediatorInputConnector_3330); //$NON-NLS-1$
		case EsbLinkEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///org/wso2/carbonstudio/eclipse/gmf/esb?EsbLink", EsbElementTypes.EsbLink_4001); //$NON-NLS-1$
		case DBReportMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?DBReportMediatorInputConnector", EsbElementTypes.DBReportMediatorInputConnector_3079); //$NON-NLS-1$
		case DBLookupMediator4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?DBLookupMediator", EsbElementTypes.DBLookupMediator_3347); //$NON-NLS-1$
		case XSLTMediator2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?XSLTMediator", EsbElementTypes.XSLTMediator_3149); //$NON-NLS-1$
		case LogMediatorInputConnector3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?LogMediatorInputConnector", EsbElementTypes.LogMediatorInputConnector_3242); //$NON-NLS-1$
		case TransactionMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?TransactionMediator", EsbElementTypes.TransactionMediator_3232); //$NON-NLS-1$
		case EntitlementMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?EntitlementMediator", EsbElementTypes.EntitlementMediator_3216); //$NON-NLS-1$
		case FaultMediator4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?FaultMediator", EsbElementTypes.FaultMediator_3344); //$NON-NLS-1$
		case HeaderMediator4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?HeaderMediator", EsbElementTypes.HeaderMediator_3356); //$NON-NLS-1$
		case SendMediatorOutputConnector3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?SendMediatorOutputConnector", EsbElementTypes.SendMediatorOutputConnector_3292); //$NON-NLS-1$
		case LogMediatorInputConnector4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?LogMediatorInputConnector", EsbElementTypes.LogMediatorInputConnector_3326); //$NON-NLS-1$
		case DBLookupMediatorOutputConnector3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?DBLookupMediatorOutputConnector", EsbElementTypes.DBLookupMediatorOutputConnector_3283); //$NON-NLS-1$
		case OAuthMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?OAuthMediatorOutputConnector", EsbElementTypes.OAuthMediatorOutputConnector_3131); //$NON-NLS-1$
		case CommandMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?CommandMediatorInputConnector", EsbElementTypes.CommandMediatorInputConnector_3073); //$NON-NLS-1$
		case SequenceOutputConnector4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?SequenceOutputConnector", EsbElementTypes.SequenceOutputConnector_3377); //$NON-NLS-1$
		case SpringMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?SpringMediatorInputConnector", EsbElementTypes.SpringMediatorInputConnector_3061); //$NON-NLS-1$
		case EsbServerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///org/wso2/carbonstudio/eclipse/gmf/esb?EsbServer", EsbElementTypes.EsbServer_2001); //$NON-NLS-1$
		case EnrichMediator4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?EnrichMediator", EsbElementTypes.EnrichMediator_3334); //$NON-NLS-1$
		case XSLTMediatorOutputConnector4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?XSLTMediatorOutputConnector", EsbElementTypes.XSLTMediatorOutputConnector_3339); //$NON-NLS-1$
		case PropertyMediator3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?PropertyMediator", EsbElementTypes.PropertyMediator_3199); //$NON-NLS-1$
		case RuleMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?RuleMediatorInputConnector", EsbElementTypes.RuleMediatorInputConnector_3127); //$NON-NLS-1$
		case SpringMediatorInputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?SpringMediatorInputConnector", EsbElementTypes.SpringMediatorInputConnector_3267); //$NON-NLS-1$
		case FilterMediatorFailOutputConnector3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?FilterMediatorFailOutputConnector", EsbElementTypes.FilterMediatorFailOutputConnector_3240); //$NON-NLS-1$
		case SwitchMediatorInputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?SwitchMediatorInputConnector", EsbElementTypes.SwitchMediatorInputConnector_3153); //$NON-NLS-1$
		case SendMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?SendMediatorOutputConnector", EsbElementTypes.SendMediatorOutputConnector_3086); //$NON-NLS-1$
		case SequenceOutputConnector3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?SequenceOutputConnector", EsbElementTypes.SequenceOutputConnector_3256); //$NON-NLS-1$
		case CloneMediatorTargetOutputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?CloneMediatorTargetOutputConnector", EsbElementTypes.CloneMediatorTargetOutputConnector_3174); //$NON-NLS-1$
		case SendMediatorInputConnector4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?SendMediatorInputConnector", EsbElementTypes.SendMediatorInputConnector_3354); //$NON-NLS-1$
		case SwitchMediatorInputConnector4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?SwitchMediatorInputConnector", EsbElementTypes.SwitchMediatorInputConnector_3341); //$NON-NLS-1$
		case HeaderMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?HeaderMediatorInputConnector", EsbElementTypes.HeaderMediatorInputConnector_3100); //$NON-NLS-1$
		case SendMediator3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?SendMediator", EsbElementTypes.SendMediator_3290); //$NON-NLS-1$
		case AggregateMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?AggregateMediatorOutputConnector", EsbElementTypes.AggregateMediatorOutputConnector_3113); //$NON-NLS-1$
		case HeaderMediatorInputConnector4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?HeaderMediatorInputConnector", EsbElementTypes.HeaderMediatorInputConnector_3357); //$NON-NLS-1$
		case OAuthMediatorOutputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?OAuthMediatorOutputConnector", EsbElementTypes.OAuthMediatorOutputConnector_3320); //$NON-NLS-1$
		case OAuthMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?OAuthMediatorInputConnector", EsbElementTypes.OAuthMediatorInputConnector_3130); //$NON-NLS-1$
		case LogMediator3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?LogMediator", EsbElementTypes.LogMediator_3241); //$NON-NLS-1$
		case DBReportMediator2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?DBReportMediator", EsbElementTypes.DBReportMediator_3162); //$NON-NLS-1$
		case EntitlementMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?EntitlementMediatorInputConnector", EsbElementTypes.EntitlementMediatorInputConnector_3055); //$NON-NLS-1$
		case TransactionMediator3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?TransactionMediator", EsbElementTypes.TransactionMediator_3309); //$NON-NLS-1$
		case ProxyServiceEndpointContainerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?ProxyServiceEndpointContainer", EsbElementTypes.ProxyServiceEndpointContainer_3381); //$NON-NLS-1$
		case FilterMediatorFailOutputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?FilterMediatorFailOutputConnector", EsbElementTypes.FilterMediatorFailOutputConnector_3142); //$NON-NLS-1$
		case MergeNodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?MergeNode", EsbElementTypes.MergeNode_3013); //$NON-NLS-1$
		case MessageMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?MessageMediator", EsbElementTypes.MessageMediator_3045); //$NON-NLS-1$
		case CloneMediatorTargetOutputConnector4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?CloneMediatorTargetOutputConnector", EsbElementTypes.CloneMediatorTargetOutputConnector_3362); //$NON-NLS-1$
		case SwitchMediator3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?SwitchMediator", EsbElementTypes.SwitchMediator_3250); //$NON-NLS-1$
		case MessageInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?MessageInputConnector", EsbElementTypes.MessageInputConnector_3046); //$NON-NLS-1$
		case DBReportMediator3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?DBReportMediator", EsbElementTypes.DBReportMediator_3284); //$NON-NLS-1$
		case DBReportMediatorInputConnector3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?DBReportMediatorInputConnector", EsbElementTypes.DBReportMediatorInputConnector_3285); //$NON-NLS-1$
		case TransactionMediatorOutputConnector4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?TransactionMediatorOutputConnector", EsbElementTypes.TransactionMediatorOutputConnector_3371); //$NON-NLS-1$
		case RuleMediator2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?RuleMediator", EsbElementTypes.RuleMediator_3315); //$NON-NLS-1$
		case FaultMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?FaultMediator", EsbElementTypes.FaultMediator_3220); //$NON-NLS-1$
		case ScriptMediator2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?ScriptMediator", EsbElementTypes.ScriptMediator_3269); //$NON-NLS-1$
		case SwitchDefaultBranchOutputConnector3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?SwitchDefaultBranchOutputConnector", EsbElementTypes.SwitchDefaultBranchOutputConnector_3253); //$NON-NLS-1$
		case PropertyMediator4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?PropertyMediator", EsbElementTypes.PropertyMediator_3200); //$NON-NLS-1$
		case RMSequenceMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?RMSequenceMediatorOutputConnector", EsbElementTypes.RMSequenceMediatorOutputConnector_3125); //$NON-NLS-1$
		case DBLookupMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?DBLookupMediator", EsbElementTypes.DBLookupMediator_3223); //$NON-NLS-1$
		case IterateMediatorInputConnector3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?IterateMediatorInputConnector", EsbElementTypes.IterateMediatorInputConnector_3304); //$NON-NLS-1$
		case EntitlementMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?EntitlementMediatorOutputConnector", EsbElementTypes.EntitlementMediatorOutputConnector_3056); //$NON-NLS-1$
		case AggregateMediatorOnCompleteOutputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?AggregateMediatorOnCompleteOutputConnector", EsbElementTypes.AggregateMediatorOnCompleteOutputConnector_3324); //$NON-NLS-1$
		case FaultMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?FaultMediatorOutputConnector", EsbElementTypes.FaultMediatorOutputConnector_3068); //$NON-NLS-1$
		case CalloutMediator4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?CalloutMediator", EsbElementTypes.CalloutMediator_3366); //$NON-NLS-1$
		case XSLTMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?XSLTMediator", EsbElementTypes.XSLTMediator_3212); //$NON-NLS-1$
		case IterateMediator3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?IterateMediator", EsbElementTypes.IterateMediator_3303); //$NON-NLS-1$
		case FaultMediatorInputConnector4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?FaultMediatorInputConnector", EsbElementTypes.FaultMediatorInputConnector_3345); //$NON-NLS-1$
		case DropMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?DropMediatorInputConnector", EsbElementTypes.DropMediatorInputConnector_3008); //$NON-NLS-1$
		case SequenceOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?SequenceOutputConnector", EsbElementTypes.SequenceOutputConnector_3050); //$NON-NLS-1$
		case ScriptMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?ScriptMediatorInputConnector", EsbElementTypes.ScriptMediatorInputConnector_3064); //$NON-NLS-1$
		case TransactionMediatorOutputConnector3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?TransactionMediatorOutputConnector", EsbElementTypes.TransactionMediatorOutputConnector_3311); //$NON-NLS-1$
		case ScriptMediatorOutputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?ScriptMediatorOutputConnector", EsbElementTypes.ScriptMediatorOutputConnector_3271); //$NON-NLS-1$
		case CalloutMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?CalloutMediatorInputConnector", EsbElementTypes.CalloutMediatorInputConnector_3115); //$NON-NLS-1$
		case MessageOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?MessageOutputConnector", EsbElementTypes.MessageOutputConnector_3047); //$NON-NLS-1$
		case DropMediator3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?DropMediator", EsbElementTypes.DropMediator_3191); //$NON-NLS-1$
		case AddressEndPoint2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?AddressEndPoint", EsbElementTypes.AddressEndPoint_3383); //$NON-NLS-1$
		case LogMediator2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?LogMediator", EsbElementTypes.LogMediator_3134); //$NON-NLS-1$
		case SendMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?SendMediatorInputConnector", EsbElementTypes.SendMediatorInputConnector_3085); //$NON-NLS-1$
		case AddressEndPointInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?AddressEndPointInputConnector", EsbElementTypes.AddressEndPointInputConnector_3030); //$NON-NLS-1$
		case OAuthMediatorInputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?OAuthMediatorInputConnector", EsbElementTypes.OAuthMediatorInputConnector_3319); //$NON-NLS-1$
		case CloneMediatorTargetOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?CloneMediatorTargetOutputConnector", EsbElementTypes.CloneMediatorTargetOutputConnector_3133); //$NON-NLS-1$
		case DBLookupMediatorInputConnector3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?DBLookupMediatorInputConnector", EsbElementTypes.DBLookupMediatorInputConnector_3282); //$NON-NLS-1$
		case CommandMediatorInputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?CommandMediatorInputConnector", EsbElementTypes.CommandMediatorInputConnector_3279); //$NON-NLS-1$
		case HeaderMediatorInputConnector3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?HeaderMediatorInputConnector", EsbElementTypes.HeaderMediatorInputConnector_3294); //$NON-NLS-1$
		case CalloutMediator2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?CalloutMediator", EsbElementTypes.CalloutMediator_3178); //$NON-NLS-1$
		case TransactionMediatorOutputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?TransactionMediatorOutputConnector", EsbElementTypes.TransactionMediatorOutputConnector_3184); //$NON-NLS-1$
		case RMSequenceMediatorOutputConnector4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?RMSequenceMediatorOutputConnector", EsbElementTypes.RMSequenceMediatorOutputConnector_3374); //$NON-NLS-1$
		case DBLookupMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?DBLookupMediatorOutputConnector", EsbElementTypes.DBLookupMediatorOutputConnector_3077); //$NON-NLS-1$
		case DBLookupMediator2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?DBLookupMediator", EsbElementTypes.DBLookupMediator_3159); //$NON-NLS-1$
		case AggregateMediatorOnCompleteOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?AggregateMediatorOnCompleteOutputConnector", EsbElementTypes.AggregateMediatorOnCompleteOutputConnector_3132); //$NON-NLS-1$
		case MergeNodeFirstInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?MergeNodeFirstInputConnector", EsbElementTypes.MergeNodeFirstInputConnector_3014); //$NON-NLS-1$
		case CalloutMediatorInputConnector3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?CalloutMediatorInputConnector", EsbElementTypes.CalloutMediatorInputConnector_3307); //$NON-NLS-1$
		case ClassMediator2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?ClassMediator", EsbElementTypes.ClassMediator_3263); //$NON-NLS-1$
		case RMSequenceMediatorOutputConnector3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?RMSequenceMediatorOutputConnector", EsbElementTypes.RMSequenceMediatorOutputConnector_3314); //$NON-NLS-1$
		case SwitchDefaultBranchOutputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?SwitchDefaultBranchOutputConnector", EsbElementTypes.SwitchDefaultBranchOutputConnector_3155); //$NON-NLS-1$
		case RMSequenceMediatorInputConnector4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?RMSequenceMediatorInputConnector", EsbElementTypes.RMSequenceMediatorInputConnector_3373); //$NON-NLS-1$
		case SwitchDefaultBranchOutputConnector4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?SwitchDefaultBranchOutputConnector", EsbElementTypes.SwitchDefaultBranchOutputConnector_3343); //$NON-NLS-1$
		case SpringMediator2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?SpringMediator", EsbElementTypes.SpringMediator_3266); //$NON-NLS-1$
		case PropertyMediator2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?PropertyMediator", EsbElementTypes.PropertyMediator_3143); //$NON-NLS-1$
		case AggregateMediator2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?AggregateMediator", EsbElementTypes.AggregateMediator_3321); //$NON-NLS-1$
		case SwitchCaseBranchOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?SwitchCaseBranchOutputConnector", EsbElementTypes.SwitchCaseBranchOutputConnector_3043); //$NON-NLS-1$
		case FilterMediatorInputConnector3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?FilterMediatorInputConnector", EsbElementTypes.FilterMediatorInputConnector_3238); //$NON-NLS-1$
		case EventMediatorOutputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?EventMediatorOutputConnector", EsbElementTypes.EventMediatorOutputConnector_3259); //$NON-NLS-1$
		case IterateMediator4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?IterateMediator", EsbElementTypes.IterateMediator_3363); //$NON-NLS-1$
		case CommandMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?CommandMediatorOutputConnector", EsbElementTypes.CommandMediatorOutputConnector_3074); //$NON-NLS-1$
		case EventMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?EventMediator", EsbElementTypes.EventMediator_3215); //$NON-NLS-1$
		case OAuthMediator2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?OAuthMediator", EsbElementTypes.OAuthMediator_3318); //$NON-NLS-1$
		case RMSequenceMediatorInputConnector3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?RMSequenceMediatorInputConnector", EsbElementTypes.RMSequenceMediatorInputConnector_3313); //$NON-NLS-1$
		case IterateMediatorInputConnector4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?IterateMediatorInputConnector", EsbElementTypes.IterateMediatorInputConnector_3364); //$NON-NLS-1$
		case MergeNodeOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?MergeNodeOutputConnector", EsbElementTypes.MergeNodeOutputConnector_3016); //$NON-NLS-1$
		case RuleMediatorInputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?RuleMediatorInputConnector", EsbElementTypes.RuleMediatorInputConnector_3316); //$NON-NLS-1$
		case ThrottleMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?ThrottleMediator", EsbElementTypes.ThrottleMediator_3205); //$NON-NLS-1$
		case PropertyMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?PropertyMediatorInputConnector", EsbElementTypes.PropertyMediatorInputConnector_3033); //$NON-NLS-1$
		case SmooksMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?SmooksMediatorInputConnector", EsbElementTypes.SmooksMediatorInputConnector_3082); //$NON-NLS-1$
		case FaultMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?FaultMediatorInputConnector", EsbElementTypes.FaultMediatorInputConnector_3067); //$NON-NLS-1$
		case SwitchMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?SwitchMediatorInputConnector", EsbElementTypes.SwitchMediatorInputConnector_3042); //$NON-NLS-1$
		case EnrichMediatorOutputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?EnrichMediatorOutputConnector", EsbElementTypes.EnrichMediatorOutputConnector_3148); //$NON-NLS-1$
		case EsbDiagramEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http:///org/wso2/carbonstudio/eclipse/gmf/esb?EsbDiagram", EsbElementTypes.EsbDiagram_1000); //$NON-NLS-1$
		case MergeNodeSecondInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?MergeNodeSecondInputConnector", EsbElementTypes.MergeNodeSecondInputConnector_3015); //$NON-NLS-1$
		case FailoverEndPointWestOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?FailoverEndPointWestOutputConnector", EsbElementTypes.FailoverEndPointWestOutputConnector_3097); //$NON-NLS-1$
		case FaultMediator2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?FaultMediator", EsbElementTypes.FaultMediator_3156); //$NON-NLS-1$
		case EnrichMediatorOutputConnector3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?EnrichMediatorOutputConnector", EsbElementTypes.EnrichMediatorOutputConnector_3246); //$NON-NLS-1$
		case SequenceOutputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?SequenceOutputConnector", EsbElementTypes.SequenceOutputConnector_3189); //$NON-NLS-1$
		case ClassMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?ClassMediatorInputConnector", EsbElementTypes.ClassMediatorInputConnector_3058); //$NON-NLS-1$
		case ClassMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?ClassMediatorOutputConnector", EsbElementTypes.ClassMediatorOutputConnector_3059); //$NON-NLS-1$
		case DBLookupMediatorInputConnector4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?DBLookupMediatorInputConnector", EsbElementTypes.DBLookupMediatorInputConnector_3348); //$NON-NLS-1$
		case LogMediatorInputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?LogMediatorInputConnector", EsbElementTypes.LogMediatorInputConnector_3135); //$NON-NLS-1$
		case HeaderMediatorInputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?HeaderMediatorInputConnector", EsbElementTypes.HeaderMediatorInputConnector_3169); //$NON-NLS-1$
		case FaultMediatorInputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?FaultMediatorInputConnector", EsbElementTypes.FaultMediatorInputConnector_3157); //$NON-NLS-1$
		case HeaderMediatorOutputConnector4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?HeaderMediatorOutputConnector", EsbElementTypes.HeaderMediatorOutputConnector_3358); //$NON-NLS-1$
		case FaultMediatorOutputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?FaultMediatorOutputConnector", EsbElementTypes.FaultMediatorOutputConnector_3158); //$NON-NLS-1$
		case XQueryMediatorInputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?XQueryMediatorInputConnector", EsbElementTypes.XQueryMediatorInputConnector_3276); //$NON-NLS-1$
		case IterateMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?IterateMediatorOutputConnector", EsbElementTypes.IterateMediatorOutputConnector_3110); //$NON-NLS-1$
		case LogMediatorOutputConnector4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?LogMediatorOutputConnector", EsbElementTypes.LogMediatorOutputConnector_3327); //$NON-NLS-1$
		case HeaderMediator2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?HeaderMediator", EsbElementTypes.HeaderMediator_3168); //$NON-NLS-1$
		case EventMediatorInputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?EventMediatorInputConnector", EsbElementTypes.EventMediatorInputConnector_3258); //$NON-NLS-1$
		case SwitchMediatorInputConnector3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?SwitchMediatorInputConnector", EsbElementTypes.SwitchMediatorInputConnector_3251); //$NON-NLS-1$
		case Sequence4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?Sequence", EsbElementTypes.Sequence_3375); //$NON-NLS-1$
		case FilterMediatorPassOutputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?FilterMediatorPassOutputConnector", EsbElementTypes.FilterMediatorPassOutputConnector_3141); //$NON-NLS-1$
		case SendMediatorInputConnector3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?SendMediatorInputConnector", EsbElementTypes.SendMediatorInputConnector_3291); //$NON-NLS-1$
		case SmooksMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?SmooksMediatorOutputConnector", EsbElementTypes.SmooksMediatorOutputConnector_3083); //$NON-NLS-1$
		case XQueryMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?XQueryMediatorInputConnector", EsbElementTypes.XQueryMediatorInputConnector_3070); //$NON-NLS-1$
		case WSDLEndPoint2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?WSDLEndPoint", EsbElementTypes.WSDLEndPoint_3385); //$NON-NLS-1$
		case XSLTMediatorInputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?XSLTMediatorInputConnector", EsbElementTypes.XSLTMediatorInputConnector_3150); //$NON-NLS-1$
		case CommandMediatorOutputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?CommandMediatorOutputConnector", EsbElementTypes.CommandMediatorOutputConnector_3280); //$NON-NLS-1$
		case FilterMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?FilterMediator", EsbElementTypes.FilterMediator_3209); //$NON-NLS-1$
		case EnrichMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?EnrichMediatorInputConnector", EsbElementTypes.EnrichMediatorInputConnector_3036); //$NON-NLS-1$
		case SendMediator2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?SendMediator", EsbElementTypes.SendMediator_3165); //$NON-NLS-1$
		case FilterMediatorPassOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?FilterMediatorPassOutputConnector", EsbElementTypes.FilterMediatorPassOutputConnector_3011); //$NON-NLS-1$
		case ClassMediatorOutputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?ClassMediatorOutputConnector", EsbElementTypes.ClassMediatorOutputConnector_3265); //$NON-NLS-1$
		case CacheMediatorInputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?CacheMediatorInputConnector", EsbElementTypes.CacheMediatorInputConnector_3301); //$NON-NLS-1$
		case SpringMediatorOutputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?SpringMediatorOutputConnector", EsbElementTypes.SpringMediatorOutputConnector_3268); //$NON-NLS-1$
		case DBReportMediatorOutputConnector4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?DBReportMediatorOutputConnector", EsbElementTypes.DBReportMediatorOutputConnector_3352); //$NON-NLS-1$
		case SequenceInputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?SequenceInputConnector", EsbElementTypes.SequenceInputConnector_3188); //$NON-NLS-1$
		case ClassMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?ClassMediator", EsbElementTypes.ClassMediator_3217); //$NON-NLS-1$
		case CalloutMediator3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?CalloutMediator", EsbElementTypes.CalloutMediator_3306); //$NON-NLS-1$
		case CloneMediatorInputConnector4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?CloneMediatorInputConnector", EsbElementTypes.CloneMediatorInputConnector_3360); //$NON-NLS-1$
		case CloneMediator3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?CloneMediator", EsbElementTypes.CloneMediator_3296); //$NON-NLS-1$
		case EventMediator2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?EventMediator", EsbElementTypes.EventMediator_3257); //$NON-NLS-1$
		case EnrichMediator2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?EnrichMediator", EsbElementTypes.EnrichMediator_3146); //$NON-NLS-1$
		case LogMediator4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?LogMediator", EsbElementTypes.LogMediator_3325); //$NON-NLS-1$
		case RMSequenceMediatorInputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?RMSequenceMediatorInputConnector", EsbElementTypes.RMSequenceMediatorInputConnector_3185); //$NON-NLS-1$
		case CacheMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?CacheMediator", EsbElementTypes.CacheMediator_3229); //$NON-NLS-1$
		case WSDLEndPointOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?WSDLEndPointOutputConnector", EsbElementTypes.WSDLEndPointOutputConnector_3093); //$NON-NLS-1$
		case XSLTMediatorInputConnector4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?XSLTMediatorInputConnector", EsbElementTypes.XSLTMediatorInputConnector_3338); //$NON-NLS-1$
		case AggregateMediatorOutputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?AggregateMediatorOutputConnector", EsbElementTypes.AggregateMediatorOutputConnector_3323); //$NON-NLS-1$
		case AggregateMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?AggregateMediatorInputConnector", EsbElementTypes.AggregateMediatorInputConnector_3112); //$NON-NLS-1$
		case XSLTMediator3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?XSLTMediator", EsbElementTypes.XSLTMediator_3247); //$NON-NLS-1$
		case FailoverEndPointOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?FailoverEndPointOutputConnector", EsbElementTypes.FailoverEndPointOutputConnector_3090); //$NON-NLS-1$
		case IterateMediator2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?IterateMediator", EsbElementTypes.IterateMediator_3175); //$NON-NLS-1$
		case FailoverEndPoint2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?FailoverEndPoint", EsbElementTypes.FailoverEndPoint_3384); //$NON-NLS-1$
		case ProxyOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?ProxyOutputConnector", EsbElementTypes.ProxyOutputConnector_3002); //$NON-NLS-1$
		case DropMediatorInputConnector4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?DropMediatorInputConnector", EsbElementTypes.DropMediatorInputConnector_3195); //$NON-NLS-1$
		case XQueryMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?XQueryMediator", EsbElementTypes.XQueryMediator_3221); //$NON-NLS-1$
		case ProxyInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?ProxyInputConnector", EsbElementTypes.ProxyInputConnector_3003); //$NON-NLS-1$
		case EntitlementMediatorOutputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?EntitlementMediatorOutputConnector", EsbElementTypes.EntitlementMediatorOutputConnector_3262); //$NON-NLS-1$
		case XQueryMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?XQueryMediatorOutputConnector", EsbElementTypes.XQueryMediatorOutputConnector_3071); //$NON-NLS-1$
		case TransactionMediatorInputConnector3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?TransactionMediatorInputConnector", EsbElementTypes.TransactionMediatorInputConnector_3310); //$NON-NLS-1$
		case XSLTMediatorInputConnector3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?XSLTMediatorInputConnector", EsbElementTypes.XSLTMediatorInputConnector_3248); //$NON-NLS-1$
		case DBLookupMediatorInputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?DBLookupMediatorInputConnector", EsbElementTypes.DBLookupMediatorInputConnector_3160); //$NON-NLS-1$
		case DBLookupMediatorOutputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?DBLookupMediatorOutputConnector", EsbElementTypes.DBLookupMediatorOutputConnector_3161); //$NON-NLS-1$
		case RuleMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?RuleMediatorOutputConnector", EsbElementTypes.RuleMediatorOutputConnector_3128); //$NON-NLS-1$
		case ThrottleMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?ThrottleMediatorInputConnector", EsbElementTypes.ThrottleMediatorInputConnector_3121); //$NON-NLS-1$
		case CalloutMediatorOutputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?CalloutMediatorOutputConnector", EsbElementTypes.CalloutMediatorOutputConnector_3182); //$NON-NLS-1$
		case CloneMediatorInputConnector3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?CloneMediatorInputConnector", EsbElementTypes.CloneMediatorInputConnector_3297); //$NON-NLS-1$
		case SendMediatorOutputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?SendMediatorOutputConnector", EsbElementTypes.SendMediatorOutputConnector_3167); //$NON-NLS-1$
		case CalloutMediatorOutputConnector3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?CalloutMediatorOutputConnector", EsbElementTypes.CalloutMediatorOutputConnector_3308); //$NON-NLS-1$
		case FaultMediatorOutputConnector3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?FaultMediatorOutputConnector", EsbElementTypes.FaultMediatorOutputConnector_3274); //$NON-NLS-1$
		case ProxyServiceInSequenceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?ProxyServiceInSequence", EsbElementTypes.ProxyServiceInSequence_3197); //$NON-NLS-1$
		case SmooksMediatorOutputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?SmooksMediatorOutputConnector", EsbElementTypes.SmooksMediatorOutputConnector_3289); //$NON-NLS-1$
		case RMSequenceMediator2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?RMSequenceMediator", EsbElementTypes.RMSequenceMediator_3180); //$NON-NLS-1$
		case DBReportMediator4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?DBReportMediator", EsbElementTypes.DBReportMediator_3350); //$NON-NLS-1$
		case PropertyMediatorOutputConnector3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?PropertyMediatorOutputConnector", EsbElementTypes.PropertyMediatorOutputConnector_3202); //$NON-NLS-1$
		case FilterMediator2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?FilterMediator", EsbElementTypes.FilterMediator_3139); //$NON-NLS-1$
		case AggregateMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?AggregateMediator", EsbElementTypes.AggregateMediator_3236); //$NON-NLS-1$
		case ScriptMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?ScriptMediatorOutputConnector", EsbElementTypes.ScriptMediatorOutputConnector_3065); //$NON-NLS-1$
		case ThrottleMediator2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?ThrottleMediator", EsbElementTypes.ThrottleMediator_3206); //$NON-NLS-1$
		case HeaderMediator3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?HeaderMediator", EsbElementTypes.HeaderMediator_3293); //$NON-NLS-1$
		case DropMediator2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?DropMediator", EsbElementTypes.DropMediator_3137); //$NON-NLS-1$
		case CloneMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?CloneMediatorInputConnector", EsbElementTypes.CloneMediatorInputConnector_3103); //$NON-NLS-1$
		case ProxyServiceSequenceContainerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?ProxyServiceSequenceContainer", EsbElementTypes.ProxyServiceSequenceContainer_3196); //$NON-NLS-1$
		case TransactionMediator2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?TransactionMediator", EsbElementTypes.TransactionMediator_3179); //$NON-NLS-1$
		case TransactionMediatorInputConnector4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?TransactionMediatorInputConnector", EsbElementTypes.TransactionMediatorInputConnector_3370); //$NON-NLS-1$
		case CalloutMediatorInputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?CalloutMediatorInputConnector", EsbElementTypes.CalloutMediatorInputConnector_3181); //$NON-NLS-1$
		case DefaultEndPointOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?DefaultEndPointOutputConnector", EsbElementTypes.DefaultEndPointOutputConnector_3022); //$NON-NLS-1$
		case SwitchCaseBranchOutputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?SwitchCaseBranchOutputConnector", EsbElementTypes.SwitchCaseBranchOutputConnector_3154); //$NON-NLS-1$
		case DBLookupMediatorOutputConnector4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?DBLookupMediatorOutputConnector", EsbElementTypes.DBLookupMediatorOutputConnector_3349); //$NON-NLS-1$
		case CalloutMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?CalloutMediatorOutputConnector", EsbElementTypes.CalloutMediatorOutputConnector_3116); //$NON-NLS-1$
		case TransactionMediatorInputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?TransactionMediatorInputConnector", EsbElementTypes.TransactionMediatorInputConnector_3183); //$NON-NLS-1$
		case SwitchMediator2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?SwitchMediator", EsbElementTypes.SwitchMediator_3152); //$NON-NLS-1$
		case SmooksMediator2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?SmooksMediator", EsbElementTypes.SmooksMediator_3287); //$NON-NLS-1$
		case FilterMediatorFailOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?FilterMediatorFailOutputConnector", EsbElementTypes.FilterMediatorFailOutputConnector_3012); //$NON-NLS-1$
		case PropertyMediatorInputConnector4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?PropertyMediatorInputConnector", EsbElementTypes.PropertyMediatorInputConnector_3203); //$NON-NLS-1$
		case DBReportMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?DBReportMediatorOutputConnector", EsbElementTypes.DBReportMediatorOutputConnector_3080); //$NON-NLS-1$
		case SendMediator4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?SendMediator", EsbElementTypes.SendMediator_3353); //$NON-NLS-1$
		case XQueryMediatorOutputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?XQueryMediatorOutputConnector", EsbElementTypes.XQueryMediatorOutputConnector_3277); //$NON-NLS-1$
		case PropertyMediatorInputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?PropertyMediatorInputConnector", EsbElementTypes.PropertyMediatorInputConnector_3144); //$NON-NLS-1$
		case EnrichMediator3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?EnrichMediator", EsbElementTypes.EnrichMediator_3244); //$NON-NLS-1$
		case SpringMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?SpringMediator", EsbElementTypes.SpringMediator_3218); //$NON-NLS-1$
		case FilterMediator4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?FilterMediator", EsbElementTypes.FilterMediator_3329); //$NON-NLS-1$
		case CalloutMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?CalloutMediator", EsbElementTypes.CalloutMediator_3231); //$NON-NLS-1$
		case XSLTMediatorOutputConnector3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?XSLTMediatorOutputConnector", EsbElementTypes.XSLTMediatorOutputConnector_3249); //$NON-NLS-1$
		case IterateMediatorOutputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?IterateMediatorOutputConnector", EsbElementTypes.IterateMediatorOutputConnector_3177); //$NON-NLS-1$
		case EnrichMediatorInputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?EnrichMediatorInputConnector", EsbElementTypes.EnrichMediatorInputConnector_3147); //$NON-NLS-1$
		case AggregateMediatorInputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?AggregateMediatorInputConnector", EsbElementTypes.AggregateMediatorInputConnector_3322); //$NON-NLS-1$
		case PropertyMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?PropertyMediatorOutputConnector", EsbElementTypes.PropertyMediatorOutputConnector_3034); //$NON-NLS-1$
		case SwitchCaseBranchOutputConnector4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?SwitchCaseBranchOutputConnector", EsbElementTypes.SwitchCaseBranchOutputConnector_3342); //$NON-NLS-1$
		case TransactionMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?TransactionMediatorInputConnector", EsbElementTypes.TransactionMediatorInputConnector_3118); //$NON-NLS-1$
		case TransactionMediator4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?TransactionMediator", EsbElementTypes.TransactionMediator_3369); //$NON-NLS-1$
		case DBLookupMediator3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?DBLookupMediator", EsbElementTypes.DBLookupMediator_3281); //$NON-NLS-1$
		case FilterMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?FilterMediatorInputConnector", EsbElementTypes.FilterMediatorInputConnector_3010); //$NON-NLS-1$
		case HeaderMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?HeaderMediatorOutputConnector", EsbElementTypes.HeaderMediatorOutputConnector_3101); //$NON-NLS-1$
		case CloneMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?CloneMediatorOutputConnector", EsbElementTypes.CloneMediatorOutputConnector_3104); //$NON-NLS-1$
		case CloneMediator2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?CloneMediator", EsbElementTypes.CloneMediator_3171); //$NON-NLS-1$
		case CacheMediator2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?CacheMediator", EsbElementTypes.CacheMediator_3300); //$NON-NLS-1$
		case HeaderMediatorOutputConnector3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?HeaderMediatorOutputConnector", EsbElementTypes.HeaderMediatorOutputConnector_3295); //$NON-NLS-1$
		case CloneMediatorOutputConnector4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?CloneMediatorOutputConnector", EsbElementTypes.CloneMediatorOutputConnector_3361); //$NON-NLS-1$
		case XSLTMediatorOutputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?XSLTMediatorOutputConnector", EsbElementTypes.XSLTMediatorOutputConnector_3151); //$NON-NLS-1$
		case ProxyServiceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?ProxyService", EsbElementTypes.ProxyService_3001); //$NON-NLS-1$
		case SwitchCaseBranchOutputConnector3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?SwitchCaseBranchOutputConnector", EsbElementTypes.SwitchCaseBranchOutputConnector_3252); //$NON-NLS-1$
		case SequenceInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?SequenceInputConnector", EsbElementTypes.SequenceInputConnector_3049); //$NON-NLS-1$
		case ClassMediatorInputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?ClassMediatorInputConnector", EsbElementTypes.ClassMediatorInputConnector_3264); //$NON-NLS-1$
		case FilterMediator3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?FilterMediator", EsbElementTypes.FilterMediator_3237); //$NON-NLS-1$
		case CalloutMediatorOutputConnector4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?CalloutMediatorOutputConnector", EsbElementTypes.CalloutMediatorOutputConnector_3368); //$NON-NLS-1$
		case CloneMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?CloneMediator", EsbElementTypes.CloneMediator_3228); //$NON-NLS-1$
		case DefaultEndPoint2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?DefaultEndPoint", EsbElementTypes.DefaultEndPoint_3382); //$NON-NLS-1$
		case IterateMediatorInputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?IterateMediatorInputConnector", EsbElementTypes.IterateMediatorInputConnector_3176); //$NON-NLS-1$
		case AddressEndPointOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?AddressEndPointOutputConnector", EsbElementTypes.AddressEndPointOutputConnector_3031); //$NON-NLS-1$
		case ScriptMediatorInputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?ScriptMediatorInputConnector", EsbElementTypes.ScriptMediatorInputConnector_3270); //$NON-NLS-1$
		case SmooksMediatorInputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?SmooksMediatorInputConnector", EsbElementTypes.SmooksMediatorInputConnector_3288); //$NON-NLS-1$
		case LoadBalanceEndPointOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?LoadBalanceEndPointOutputConnector", EsbElementTypes.LoadBalanceEndPointOutputConnector_3096); //$NON-NLS-1$
		case RuleMediatorOutputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?RuleMediatorOutputConnector", EsbElementTypes.RuleMediatorOutputConnector_3317); //$NON-NLS-1$
		case HeaderMediatorOutputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?HeaderMediatorOutputConnector", EsbElementTypes.HeaderMediatorOutputConnector_3170); //$NON-NLS-1$
		case DBReportMediatorInputConnector4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?DBReportMediatorInputConnector", EsbElementTypes.DBReportMediatorInputConnector_3351); //$NON-NLS-1$
		case ThrottleMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?ThrottleMediatorOutputConnector", EsbElementTypes.ThrottleMediatorOutputConnector_3122); //$NON-NLS-1$
		case DBReportMediatorOutputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?DBReportMediatorOutputConnector", EsbElementTypes.DBReportMediatorOutputConnector_3164); //$NON-NLS-1$
		case OAuthMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?OAuthMediator", EsbElementTypes.OAuthMediator_3235); //$NON-NLS-1$
		case FilterMediatorPassOutputConnector4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?FilterMediatorPassOutputConnector", EsbElementTypes.FilterMediatorPassOutputConnector_3331); //$NON-NLS-1$
		case PropertyMediator5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?PropertyMediator", EsbElementTypes.PropertyMediator_3333); //$NON-NLS-1$
		case DropMediator4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?DropMediator", EsbElementTypes.DropMediator_3194); //$NON-NLS-1$
		case CloneMediatorInputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?CloneMediatorInputConnector", EsbElementTypes.CloneMediatorInputConnector_3172); //$NON-NLS-1$
		case RMSequenceMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?RMSequenceMediator", EsbElementTypes.RMSequenceMediator_3233); //$NON-NLS-1$
		case CloneMediatorOutputConnector3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?CloneMediatorOutputConnector", EsbElementTypes.CloneMediatorOutputConnector_3298); //$NON-NLS-1$
		case RMSequenceMediator3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?RMSequenceMediator", EsbElementTypes.RMSequenceMediator_3312); //$NON-NLS-1$
		case CloneMediatorOutputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?CloneMediatorOutputConnector", EsbElementTypes.CloneMediatorOutputConnector_3173); //$NON-NLS-1$
		case LogMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?LogMediator", EsbElementTypes.LogMediator_3210); //$NON-NLS-1$
		case SendMediatorInputConnector2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?SendMediatorInputConnector", EsbElementTypes.SendMediatorInputConnector_3166); //$NON-NLS-1$
		case RMSequenceMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?RMSequenceMediatorInputConnector", EsbElementTypes.RMSequenceMediatorInputConnector_3124); //$NON-NLS-1$
		case EventMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?EventMediatorOutputConnector", EsbElementTypes.EventMediatorOutputConnector_3053); //$NON-NLS-1$
		case CacheMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?CacheMediatorOutputConnector", EsbElementTypes.CacheMediatorOutputConnector_3107); //$NON-NLS-1$
		case ScriptMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?ScriptMediator", EsbElementTypes.ScriptMediator_3219); //$NON-NLS-1$
		case TransactionMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?TransactionMediatorOutputConnector", EsbElementTypes.TransactionMediatorOutputConnector_3119); //$NON-NLS-1$
		case IterateMediatorOutputConnector3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?IterateMediatorOutputConnector", EsbElementTypes.IterateMediatorOutputConnector_3305); //$NON-NLS-1$
		case DropMediatorInputConnector3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?DropMediatorInputConnector", EsbElementTypes.DropMediatorInputConnector_3192); //$NON-NLS-1$
		case CalloutMediatorInputConnector4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?CalloutMediatorInputConnector", EsbElementTypes.CalloutMediatorInputConnector_3367); //$NON-NLS-1$
		case FaultMediatorOutputConnector4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?FaultMediatorOutputConnector", EsbElementTypes.FaultMediatorOutputConnector_3346); //$NON-NLS-1$
		case EnrichMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?EnrichMediator", EsbElementTypes.EnrichMediator_3387); //$NON-NLS-1$
		case FilterMediatorFailOutputConnector4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?FilterMediatorFailOutputConnector", EsbElementTypes.FilterMediatorFailOutputConnector_3332); //$NON-NLS-1$
		case SwitchMediator4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?SwitchMediator", EsbElementTypes.SwitchMediator_3340); //$NON-NLS-1$
		case FaultMediator3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?FaultMediator", EsbElementTypes.FaultMediator_3272); //$NON-NLS-1$
		case SwitchMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?SwitchMediator", EsbElementTypes.SwitchMediator_3213); //$NON-NLS-1$
		case EnrichMediatorInputConnector4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?EnrichMediatorInputConnector", EsbElementTypes.EnrichMediatorInputConnector_3388); //$NON-NLS-1$
		case XSLTMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?XSLTMediatorOutputConnector", EsbElementTypes.XSLTMediatorOutputConnector_3040); //$NON-NLS-1$
		case LogMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?LogMediatorOutputConnector", EsbElementTypes.LogMediatorOutputConnector_3019); //$NON-NLS-1$
		case DropMediator5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?DropMediator", EsbElementTypes.DropMediator_3328); //$NON-NLS-1$
		case CloneMediatorTargetOutputConnector3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?CloneMediatorTargetOutputConnector", EsbElementTypes.CloneMediatorTargetOutputConnector_3299); //$NON-NLS-1$
		case FilterMediatorPassOutputConnector3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?FilterMediatorPassOutputConnector", EsbElementTypes.FilterMediatorPassOutputConnector_3239); //$NON-NLS-1$
		case LoadBalanceEndPointWestOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?LoadBalanceEndPointWestOutputConnector", EsbElementTypes.LoadBalanceEndPointWestOutputConnector_3098); //$NON-NLS-1$
		case FailoverEndPointInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?FailoverEndPointInputConnector", EsbElementTypes.FailoverEndPointInputConnector_3088); //$NON-NLS-1$
		case CommandMediator2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?CommandMediator", EsbElementTypes.CommandMediator_3278); //$NON-NLS-1$
		case XQueryMediator2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?XQueryMediator", EsbElementTypes.XQueryMediator_3275); //$NON-NLS-1$
		case RuleMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?RuleMediator", EsbElementTypes.RuleMediator_3234); //$NON-NLS-1$
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
		case HeaderMediatorEditPart.VISUAL_ID:
			return getHeaderMediator_3227Text(view);
		case DBReportMediatorInputConnector2EditPart.VISUAL_ID:
			return getDBReportMediatorInputConnector_3163Text(view);
		case IterateMediatorEditPart.VISUAL_ID:
			return getIterateMediator_3230Text(view);
		case DefaultEndPointInputConnectorEditPart.VISUAL_ID:
			return getDefaultEndPointInputConnector_3021Text(view);
		case EntitlementMediatorInputConnector2EditPart.VISUAL_ID:
			return getEntitlementMediatorInputConnector_3261Text(view);
		case SpringMediatorOutputConnectorEditPart.VISUAL_ID:
			return getSpringMediatorOutputConnector_3062Text(view);
		case XSLTMediator4EditPart.VISUAL_ID:
			return getXSLTMediator_3337Text(view);
		case FilterMediatorInputConnector2EditPart.VISUAL_ID:
			return getFilterMediatorInputConnector_3140Text(view);
		case LogMediatorOutputConnector2EditPart.VISUAL_ID:
			return getLogMediatorOutputConnector_3136Text(view);
		case CacheMediatorInputConnectorEditPart.VISUAL_ID:
			return getCacheMediatorInputConnector_3106Text(view);
		case Sequence3EditPart.VISUAL_ID:
			return getSequence_3254Text(view);
		case CommandMediatorEditPart.VISUAL_ID:
			return getCommandMediator_3222Text(view);
		case PropertyMediatorOutputConnector2EditPart.VISUAL_ID:
			return getPropertyMediatorOutputConnector_3145Text(view);
		case DBReportMediatorOutputConnector3EditPart.VISUAL_ID:
			return getDBReportMediatorOutputConnector_3286Text(view);
		case RMSequenceMediatorOutputConnector2EditPart.VISUAL_ID:
			return getRMSequenceMediatorOutputConnector_3186Text(view);
		case SendMediatorEditPart.VISUAL_ID:
			return getSendMediator_3226Text(view);
		case PropertyMediatorInputConnector3EditPart.VISUAL_ID:
			return getPropertyMediatorInputConnector_3201Text(view);
		case SequenceInputConnector3EditPart.VISUAL_ID:
			return getSequenceInputConnector_3255Text(view);
		case WSDLEndPointInputConnectorEditPart.VISUAL_ID:
			return getWSDLEndPointInputConnector_3092Text(view);
		case SequenceInputConnector4EditPart.VISUAL_ID:
			return getSequenceInputConnector_3376Text(view);
		case ProxyServiceOutSequenceEditPart.VISUAL_ID:
			return getProxyServiceOutSequence_3198Text(view);
		case DropMediatorInputConnector2EditPart.VISUAL_ID:
			return getDropMediatorInputConnector_3138Text(view);
		case SmooksMediatorEditPart.VISUAL_ID:
			return getSmooksMediator_3225Text(view);
		case LoadBalanceEndPointInputConnectorEditPart.VISUAL_ID:
			return getLoadBalanceEndPointInputConnector_3095Text(view);
		case DBReportMediatorEditPart.VISUAL_ID:
			return getDBReportMediator_3224Text(view);
		case CacheMediatorOutputConnector2EditPart.VISUAL_ID:
			return getCacheMediatorOutputConnector_3302Text(view);
		case DBLookupMediatorInputConnectorEditPart.VISUAL_ID:
			return getDBLookupMediatorInputConnector_3076Text(view);
		case XSLTMediatorInputConnectorEditPart.VISUAL_ID:
			return getXSLTMediatorInputConnector_3039Text(view);
		case LogMediatorOutputConnector3EditPart.VISUAL_ID:
			return getLogMediatorOutputConnector_3243Text(view);
		case IterateMediatorOutputConnector4EditPart.VISUAL_ID:
			return getIterateMediatorOutputConnector_3365Text(view);
		case EnrichMediatorInputConnector3EditPart.VISUAL_ID:
			return getEnrichMediatorInputConnector_3245Text(view);
		case LoadBalanceEndPoint2EditPart.VISUAL_ID:
			return getLoadBalanceEndPoint_3386Text(view);
		case SendMediatorOutputConnector4EditPart.VISUAL_ID:
			return getSendMediatorOutputConnector_3355Text(view);
		case EnrichMediatorOutputConnectorEditPart.VISUAL_ID:
			return getEnrichMediatorOutputConnector_3037Text(view);
		case IterateMediatorInputConnectorEditPart.VISUAL_ID:
			return getIterateMediatorInputConnector_3109Text(view);
		case RMSequenceMediator4EditPart.VISUAL_ID:
			return getRMSequenceMediator_3372Text(view);
		case SequenceEditPart.VISUAL_ID:
			return getSequence_3214Text(view);
		case ThrottleMediatorOutputConnector2EditPart.VISUAL_ID:
			return getThrottleMediatorOutputConnector_3208Text(view);
		case Sequence2EditPart.VISUAL_ID:
			return getSequence_3187Text(view);
		case CloneMediator4EditPart.VISUAL_ID:
			return getCloneMediator_3359Text(view);
		case EntitlementMediator2EditPart.VISUAL_ID:
			return getEntitlementMediator_3260Text(view);
		case EnrichMediatorOutputConnector4EditPart.VISUAL_ID:
			return getEnrichMediatorOutputConnector_3389Text(view);
		case SwitchDefaultBranchOutputConnectorEditPart.VISUAL_ID:
			return getSwitchDefaultBranchOutputConnector_3044Text(view);
		case LogMediatorInputConnectorEditPart.VISUAL_ID:
			return getLogMediatorInputConnector_3018Text(view);
		case PropertyMediatorOutputConnector4EditPart.VISUAL_ID:
			return getPropertyMediatorOutputConnector_3204Text(view);
		case FaultMediatorInputConnector3EditPart.VISUAL_ID:
			return getFaultMediatorInputConnector_3273Text(view);
		case ThrottleMediatorInputConnector2EditPart.VISUAL_ID:
			return getThrottleMediatorInputConnector_3207Text(view);
		case EventMediatorInputConnectorEditPart.VISUAL_ID:
			return getEventMediatorInputConnector_3052Text(view);
		case FilterMediatorInputConnector4EditPart.VISUAL_ID:
			return getFilterMediatorInputConnector_3330Text(view);
		case EsbLinkEditPart.VISUAL_ID:
			return getEsbLink_4001Text(view);
		case DBReportMediatorInputConnectorEditPart.VISUAL_ID:
			return getDBReportMediatorInputConnector_3079Text(view);
		case DBLookupMediator4EditPart.VISUAL_ID:
			return getDBLookupMediator_3347Text(view);
		case XSLTMediator2EditPart.VISUAL_ID:
			return getXSLTMediator_3149Text(view);
		case LogMediatorInputConnector3EditPart.VISUAL_ID:
			return getLogMediatorInputConnector_3242Text(view);
		case TransactionMediatorEditPart.VISUAL_ID:
			return getTransactionMediator_3232Text(view);
		case EntitlementMediatorEditPart.VISUAL_ID:
			return getEntitlementMediator_3216Text(view);
		case FaultMediator4EditPart.VISUAL_ID:
			return getFaultMediator_3344Text(view);
		case HeaderMediator4EditPart.VISUAL_ID:
			return getHeaderMediator_3356Text(view);
		case SendMediatorOutputConnector3EditPart.VISUAL_ID:
			return getSendMediatorOutputConnector_3292Text(view);
		case LogMediatorInputConnector4EditPart.VISUAL_ID:
			return getLogMediatorInputConnector_3326Text(view);
		case DBLookupMediatorOutputConnector3EditPart.VISUAL_ID:
			return getDBLookupMediatorOutputConnector_3283Text(view);
		case OAuthMediatorOutputConnectorEditPart.VISUAL_ID:
			return getOAuthMediatorOutputConnector_3131Text(view);
		case CommandMediatorInputConnectorEditPart.VISUAL_ID:
			return getCommandMediatorInputConnector_3073Text(view);
		case SequenceOutputConnector4EditPart.VISUAL_ID:
			return getSequenceOutputConnector_3377Text(view);
		case SpringMediatorInputConnectorEditPart.VISUAL_ID:
			return getSpringMediatorInputConnector_3061Text(view);
		case EsbServerEditPart.VISUAL_ID:
			return getEsbServer_2001Text(view);
		case EnrichMediator4EditPart.VISUAL_ID:
			return getEnrichMediator_3334Text(view);
		case XSLTMediatorOutputConnector4EditPart.VISUAL_ID:
			return getXSLTMediatorOutputConnector_3339Text(view);
		case PropertyMediator3EditPart.VISUAL_ID:
			return getPropertyMediator_3199Text(view);
		case RuleMediatorInputConnectorEditPart.VISUAL_ID:
			return getRuleMediatorInputConnector_3127Text(view);
		case SpringMediatorInputConnector2EditPart.VISUAL_ID:
			return getSpringMediatorInputConnector_3267Text(view);
		case FilterMediatorFailOutputConnector3EditPart.VISUAL_ID:
			return getFilterMediatorFailOutputConnector_3240Text(view);
		case SwitchMediatorInputConnector2EditPart.VISUAL_ID:
			return getSwitchMediatorInputConnector_3153Text(view);
		case SendMediatorOutputConnectorEditPart.VISUAL_ID:
			return getSendMediatorOutputConnector_3086Text(view);
		case SequenceOutputConnector3EditPart.VISUAL_ID:
			return getSequenceOutputConnector_3256Text(view);
		case CloneMediatorTargetOutputConnector2EditPart.VISUAL_ID:
			return getCloneMediatorTargetOutputConnector_3174Text(view);
		case SendMediatorInputConnector4EditPart.VISUAL_ID:
			return getSendMediatorInputConnector_3354Text(view);
		case SwitchMediatorInputConnector4EditPart.VISUAL_ID:
			return getSwitchMediatorInputConnector_3341Text(view);
		case HeaderMediatorInputConnectorEditPart.VISUAL_ID:
			return getHeaderMediatorInputConnector_3100Text(view);
		case SendMediator3EditPart.VISUAL_ID:
			return getSendMediator_3290Text(view);
		case AggregateMediatorOutputConnectorEditPart.VISUAL_ID:
			return getAggregateMediatorOutputConnector_3113Text(view);
		case HeaderMediatorInputConnector4EditPart.VISUAL_ID:
			return getHeaderMediatorInputConnector_3357Text(view);
		case OAuthMediatorOutputConnector2EditPart.VISUAL_ID:
			return getOAuthMediatorOutputConnector_3320Text(view);
		case OAuthMediatorInputConnectorEditPart.VISUAL_ID:
			return getOAuthMediatorInputConnector_3130Text(view);
		case LogMediator3EditPart.VISUAL_ID:
			return getLogMediator_3241Text(view);
		case DBReportMediator2EditPart.VISUAL_ID:
			return getDBReportMediator_3162Text(view);
		case EntitlementMediatorInputConnectorEditPart.VISUAL_ID:
			return getEntitlementMediatorInputConnector_3055Text(view);
		case TransactionMediator3EditPart.VISUAL_ID:
			return getTransactionMediator_3309Text(view);
		case ProxyServiceEndpointContainerEditPart.VISUAL_ID:
			return getProxyServiceEndpointContainer_3381Text(view);
		case FilterMediatorFailOutputConnector2EditPart.VISUAL_ID:
			return getFilterMediatorFailOutputConnector_3142Text(view);
		case MergeNodeEditPart.VISUAL_ID:
			return getMergeNode_3013Text(view);
		case MessageMediatorEditPart.VISUAL_ID:
			return getMessageMediator_3045Text(view);
		case CloneMediatorTargetOutputConnector4EditPart.VISUAL_ID:
			return getCloneMediatorTargetOutputConnector_3362Text(view);
		case SwitchMediator3EditPart.VISUAL_ID:
			return getSwitchMediator_3250Text(view);
		case MessageInputConnectorEditPart.VISUAL_ID:
			return getMessageInputConnector_3046Text(view);
		case DBReportMediator3EditPart.VISUAL_ID:
			return getDBReportMediator_3284Text(view);
		case DBReportMediatorInputConnector3EditPart.VISUAL_ID:
			return getDBReportMediatorInputConnector_3285Text(view);
		case TransactionMediatorOutputConnector4EditPart.VISUAL_ID:
			return getTransactionMediatorOutputConnector_3371Text(view);
		case RuleMediator2EditPart.VISUAL_ID:
			return getRuleMediator_3315Text(view);
		case FaultMediatorEditPart.VISUAL_ID:
			return getFaultMediator_3220Text(view);
		case ScriptMediator2EditPart.VISUAL_ID:
			return getScriptMediator_3269Text(view);
		case SwitchDefaultBranchOutputConnector3EditPart.VISUAL_ID:
			return getSwitchDefaultBranchOutputConnector_3253Text(view);
		case PropertyMediator4EditPart.VISUAL_ID:
			return getPropertyMediator_3200Text(view);
		case RMSequenceMediatorOutputConnectorEditPart.VISUAL_ID:
			return getRMSequenceMediatorOutputConnector_3125Text(view);
		case DBLookupMediatorEditPart.VISUAL_ID:
			return getDBLookupMediator_3223Text(view);
		case IterateMediatorInputConnector3EditPart.VISUAL_ID:
			return getIterateMediatorInputConnector_3304Text(view);
		case EntitlementMediatorOutputConnectorEditPart.VISUAL_ID:
			return getEntitlementMediatorOutputConnector_3056Text(view);
		case AggregateMediatorOnCompleteOutputConnector2EditPart.VISUAL_ID:
			return getAggregateMediatorOnCompleteOutputConnector_3324Text(view);
		case FaultMediatorOutputConnectorEditPart.VISUAL_ID:
			return getFaultMediatorOutputConnector_3068Text(view);
		case CalloutMediator4EditPart.VISUAL_ID:
			return getCalloutMediator_3366Text(view);
		case XSLTMediatorEditPart.VISUAL_ID:
			return getXSLTMediator_3212Text(view);
		case IterateMediator3EditPart.VISUAL_ID:
			return getIterateMediator_3303Text(view);
		case FaultMediatorInputConnector4EditPart.VISUAL_ID:
			return getFaultMediatorInputConnector_3345Text(view);
		case DropMediatorInputConnectorEditPart.VISUAL_ID:
			return getDropMediatorInputConnector_3008Text(view);
		case SequenceOutputConnectorEditPart.VISUAL_ID:
			return getSequenceOutputConnector_3050Text(view);
		case ScriptMediatorInputConnectorEditPart.VISUAL_ID:
			return getScriptMediatorInputConnector_3064Text(view);
		case TransactionMediatorOutputConnector3EditPart.VISUAL_ID:
			return getTransactionMediatorOutputConnector_3311Text(view);
		case ScriptMediatorOutputConnector2EditPart.VISUAL_ID:
			return getScriptMediatorOutputConnector_3271Text(view);
		case CalloutMediatorInputConnectorEditPart.VISUAL_ID:
			return getCalloutMediatorInputConnector_3115Text(view);
		case MessageOutputConnectorEditPart.VISUAL_ID:
			return getMessageOutputConnector_3047Text(view);
		case DropMediator3EditPart.VISUAL_ID:
			return getDropMediator_3191Text(view);
		case AddressEndPoint2EditPart.VISUAL_ID:
			return getAddressEndPoint_3383Text(view);
		case LogMediator2EditPart.VISUAL_ID:
			return getLogMediator_3134Text(view);
		case SendMediatorInputConnectorEditPart.VISUAL_ID:
			return getSendMediatorInputConnector_3085Text(view);
		case AddressEndPointInputConnectorEditPart.VISUAL_ID:
			return getAddressEndPointInputConnector_3030Text(view);
		case OAuthMediatorInputConnector2EditPart.VISUAL_ID:
			return getOAuthMediatorInputConnector_3319Text(view);
		case CloneMediatorTargetOutputConnectorEditPart.VISUAL_ID:
			return getCloneMediatorTargetOutputConnector_3133Text(view);
		case DBLookupMediatorInputConnector3EditPart.VISUAL_ID:
			return getDBLookupMediatorInputConnector_3282Text(view);
		case CommandMediatorInputConnector2EditPart.VISUAL_ID:
			return getCommandMediatorInputConnector_3279Text(view);
		case HeaderMediatorInputConnector3EditPart.VISUAL_ID:
			return getHeaderMediatorInputConnector_3294Text(view);
		case CalloutMediator2EditPart.VISUAL_ID:
			return getCalloutMediator_3178Text(view);
		case TransactionMediatorOutputConnector2EditPart.VISUAL_ID:
			return getTransactionMediatorOutputConnector_3184Text(view);
		case RMSequenceMediatorOutputConnector4EditPart.VISUAL_ID:
			return getRMSequenceMediatorOutputConnector_3374Text(view);
		case DBLookupMediatorOutputConnectorEditPart.VISUAL_ID:
			return getDBLookupMediatorOutputConnector_3077Text(view);
		case DBLookupMediator2EditPart.VISUAL_ID:
			return getDBLookupMediator_3159Text(view);
		case AggregateMediatorOnCompleteOutputConnectorEditPart.VISUAL_ID:
			return getAggregateMediatorOnCompleteOutputConnector_3132Text(view);
		case MergeNodeFirstInputConnectorEditPart.VISUAL_ID:
			return getMergeNodeFirstInputConnector_3014Text(view);
		case CalloutMediatorInputConnector3EditPart.VISUAL_ID:
			return getCalloutMediatorInputConnector_3307Text(view);
		case ClassMediator2EditPart.VISUAL_ID:
			return getClassMediator_3263Text(view);
		case RMSequenceMediatorOutputConnector3EditPart.VISUAL_ID:
			return getRMSequenceMediatorOutputConnector_3314Text(view);
		case SwitchDefaultBranchOutputConnector2EditPart.VISUAL_ID:
			return getSwitchDefaultBranchOutputConnector_3155Text(view);
		case RMSequenceMediatorInputConnector4EditPart.VISUAL_ID:
			return getRMSequenceMediatorInputConnector_3373Text(view);
		case SwitchDefaultBranchOutputConnector4EditPart.VISUAL_ID:
			return getSwitchDefaultBranchOutputConnector_3343Text(view);
		case SpringMediator2EditPart.VISUAL_ID:
			return getSpringMediator_3266Text(view);
		case PropertyMediator2EditPart.VISUAL_ID:
			return getPropertyMediator_3143Text(view);
		case AggregateMediator2EditPart.VISUAL_ID:
			return getAggregateMediator_3321Text(view);
		case SwitchCaseBranchOutputConnectorEditPart.VISUAL_ID:
			return getSwitchCaseBranchOutputConnector_3043Text(view);
		case FilterMediatorInputConnector3EditPart.VISUAL_ID:
			return getFilterMediatorInputConnector_3238Text(view);
		case EventMediatorOutputConnector2EditPart.VISUAL_ID:
			return getEventMediatorOutputConnector_3259Text(view);
		case IterateMediator4EditPart.VISUAL_ID:
			return getIterateMediator_3363Text(view);
		case CommandMediatorOutputConnectorEditPart.VISUAL_ID:
			return getCommandMediatorOutputConnector_3074Text(view);
		case EventMediatorEditPart.VISUAL_ID:
			return getEventMediator_3215Text(view);
		case OAuthMediator2EditPart.VISUAL_ID:
			return getOAuthMediator_3318Text(view);
		case RMSequenceMediatorInputConnector3EditPart.VISUAL_ID:
			return getRMSequenceMediatorInputConnector_3313Text(view);
		case IterateMediatorInputConnector4EditPart.VISUAL_ID:
			return getIterateMediatorInputConnector_3364Text(view);
		case MergeNodeOutputConnectorEditPart.VISUAL_ID:
			return getMergeNodeOutputConnector_3016Text(view);
		case RuleMediatorInputConnector2EditPart.VISUAL_ID:
			return getRuleMediatorInputConnector_3316Text(view);
		case ThrottleMediatorEditPart.VISUAL_ID:
			return getThrottleMediator_3205Text(view);
		case PropertyMediatorInputConnectorEditPart.VISUAL_ID:
			return getPropertyMediatorInputConnector_3033Text(view);
		case SmooksMediatorInputConnectorEditPart.VISUAL_ID:
			return getSmooksMediatorInputConnector_3082Text(view);
		case FaultMediatorInputConnectorEditPart.VISUAL_ID:
			return getFaultMediatorInputConnector_3067Text(view);
		case SwitchMediatorInputConnectorEditPart.VISUAL_ID:
			return getSwitchMediatorInputConnector_3042Text(view);
		case EnrichMediatorOutputConnector2EditPart.VISUAL_ID:
			return getEnrichMediatorOutputConnector_3148Text(view);
		case EsbDiagramEditPart.VISUAL_ID:
			return getEsbDiagram_1000Text(view);
		case MergeNodeSecondInputConnectorEditPart.VISUAL_ID:
			return getMergeNodeSecondInputConnector_3015Text(view);
		case FailoverEndPointWestOutputConnectorEditPart.VISUAL_ID:
			return getFailoverEndPointWestOutputConnector_3097Text(view);
		case FaultMediator2EditPart.VISUAL_ID:
			return getFaultMediator_3156Text(view);
		case EnrichMediatorOutputConnector3EditPart.VISUAL_ID:
			return getEnrichMediatorOutputConnector_3246Text(view);
		case SequenceOutputConnector2EditPart.VISUAL_ID:
			return getSequenceOutputConnector_3189Text(view);
		case ClassMediatorInputConnectorEditPart.VISUAL_ID:
			return getClassMediatorInputConnector_3058Text(view);
		case ClassMediatorOutputConnectorEditPart.VISUAL_ID:
			return getClassMediatorOutputConnector_3059Text(view);
		case DBLookupMediatorInputConnector4EditPart.VISUAL_ID:
			return getDBLookupMediatorInputConnector_3348Text(view);
		case LogMediatorInputConnector2EditPart.VISUAL_ID:
			return getLogMediatorInputConnector_3135Text(view);
		case HeaderMediatorInputConnector2EditPart.VISUAL_ID:
			return getHeaderMediatorInputConnector_3169Text(view);
		case FaultMediatorInputConnector2EditPart.VISUAL_ID:
			return getFaultMediatorInputConnector_3157Text(view);
		case HeaderMediatorOutputConnector4EditPart.VISUAL_ID:
			return getHeaderMediatorOutputConnector_3358Text(view);
		case FaultMediatorOutputConnector2EditPart.VISUAL_ID:
			return getFaultMediatorOutputConnector_3158Text(view);
		case XQueryMediatorInputConnector2EditPart.VISUAL_ID:
			return getXQueryMediatorInputConnector_3276Text(view);
		case IterateMediatorOutputConnectorEditPart.VISUAL_ID:
			return getIterateMediatorOutputConnector_3110Text(view);
		case LogMediatorOutputConnector4EditPart.VISUAL_ID:
			return getLogMediatorOutputConnector_3327Text(view);
		case HeaderMediator2EditPart.VISUAL_ID:
			return getHeaderMediator_3168Text(view);
		case EventMediatorInputConnector2EditPart.VISUAL_ID:
			return getEventMediatorInputConnector_3258Text(view);
		case SwitchMediatorInputConnector3EditPart.VISUAL_ID:
			return getSwitchMediatorInputConnector_3251Text(view);
		case Sequence4EditPart.VISUAL_ID:
			return getSequence_3375Text(view);
		case FilterMediatorPassOutputConnector2EditPart.VISUAL_ID:
			return getFilterMediatorPassOutputConnector_3141Text(view);
		case SendMediatorInputConnector3EditPart.VISUAL_ID:
			return getSendMediatorInputConnector_3291Text(view);
		case SmooksMediatorOutputConnectorEditPart.VISUAL_ID:
			return getSmooksMediatorOutputConnector_3083Text(view);
		case XQueryMediatorInputConnectorEditPart.VISUAL_ID:
			return getXQueryMediatorInputConnector_3070Text(view);
		case WSDLEndPoint2EditPart.VISUAL_ID:
			return getWSDLEndPoint_3385Text(view);
		case XSLTMediatorInputConnector2EditPart.VISUAL_ID:
			return getXSLTMediatorInputConnector_3150Text(view);
		case CommandMediatorOutputConnector2EditPart.VISUAL_ID:
			return getCommandMediatorOutputConnector_3280Text(view);
		case FilterMediatorEditPart.VISUAL_ID:
			return getFilterMediator_3209Text(view);
		case EnrichMediatorInputConnectorEditPart.VISUAL_ID:
			return getEnrichMediatorInputConnector_3036Text(view);
		case SendMediator2EditPart.VISUAL_ID:
			return getSendMediator_3165Text(view);
		case FilterMediatorPassOutputConnectorEditPart.VISUAL_ID:
			return getFilterMediatorPassOutputConnector_3011Text(view);
		case ClassMediatorOutputConnector2EditPart.VISUAL_ID:
			return getClassMediatorOutputConnector_3265Text(view);
		case CacheMediatorInputConnector2EditPart.VISUAL_ID:
			return getCacheMediatorInputConnector_3301Text(view);
		case SpringMediatorOutputConnector2EditPart.VISUAL_ID:
			return getSpringMediatorOutputConnector_3268Text(view);
		case DBReportMediatorOutputConnector4EditPart.VISUAL_ID:
			return getDBReportMediatorOutputConnector_3352Text(view);
		case SequenceInputConnector2EditPart.VISUAL_ID:
			return getSequenceInputConnector_3188Text(view);
		case ClassMediatorEditPart.VISUAL_ID:
			return getClassMediator_3217Text(view);
		case CalloutMediator3EditPart.VISUAL_ID:
			return getCalloutMediator_3306Text(view);
		case CloneMediatorInputConnector4EditPart.VISUAL_ID:
			return getCloneMediatorInputConnector_3360Text(view);
		case CloneMediator3EditPart.VISUAL_ID:
			return getCloneMediator_3296Text(view);
		case EventMediator2EditPart.VISUAL_ID:
			return getEventMediator_3257Text(view);
		case EnrichMediator2EditPart.VISUAL_ID:
			return getEnrichMediator_3146Text(view);
		case LogMediator4EditPart.VISUAL_ID:
			return getLogMediator_3325Text(view);
		case RMSequenceMediatorInputConnector2EditPart.VISUAL_ID:
			return getRMSequenceMediatorInputConnector_3185Text(view);
		case CacheMediatorEditPart.VISUAL_ID:
			return getCacheMediator_3229Text(view);
		case WSDLEndPointOutputConnectorEditPart.VISUAL_ID:
			return getWSDLEndPointOutputConnector_3093Text(view);
		case XSLTMediatorInputConnector4EditPart.VISUAL_ID:
			return getXSLTMediatorInputConnector_3338Text(view);
		case AggregateMediatorOutputConnector2EditPart.VISUAL_ID:
			return getAggregateMediatorOutputConnector_3323Text(view);
		case AggregateMediatorInputConnectorEditPart.VISUAL_ID:
			return getAggregateMediatorInputConnector_3112Text(view);
		case XSLTMediator3EditPart.VISUAL_ID:
			return getXSLTMediator_3247Text(view);
		case FailoverEndPointOutputConnectorEditPart.VISUAL_ID:
			return getFailoverEndPointOutputConnector_3090Text(view);
		case IterateMediator2EditPart.VISUAL_ID:
			return getIterateMediator_3175Text(view);
		case FailoverEndPoint2EditPart.VISUAL_ID:
			return getFailoverEndPoint_3384Text(view);
		case ProxyOutputConnectorEditPart.VISUAL_ID:
			return getProxyOutputConnector_3002Text(view);
		case DropMediatorInputConnector4EditPart.VISUAL_ID:
			return getDropMediatorInputConnector_3195Text(view);
		case XQueryMediatorEditPart.VISUAL_ID:
			return getXQueryMediator_3221Text(view);
		case ProxyInputConnectorEditPart.VISUAL_ID:
			return getProxyInputConnector_3003Text(view);
		case EntitlementMediatorOutputConnector2EditPart.VISUAL_ID:
			return getEntitlementMediatorOutputConnector_3262Text(view);
		case XQueryMediatorOutputConnectorEditPart.VISUAL_ID:
			return getXQueryMediatorOutputConnector_3071Text(view);
		case TransactionMediatorInputConnector3EditPart.VISUAL_ID:
			return getTransactionMediatorInputConnector_3310Text(view);
		case XSLTMediatorInputConnector3EditPart.VISUAL_ID:
			return getXSLTMediatorInputConnector_3248Text(view);
		case DBLookupMediatorInputConnector2EditPart.VISUAL_ID:
			return getDBLookupMediatorInputConnector_3160Text(view);
		case DBLookupMediatorOutputConnector2EditPart.VISUAL_ID:
			return getDBLookupMediatorOutputConnector_3161Text(view);
		case RuleMediatorOutputConnectorEditPart.VISUAL_ID:
			return getRuleMediatorOutputConnector_3128Text(view);
		case ThrottleMediatorInputConnectorEditPart.VISUAL_ID:
			return getThrottleMediatorInputConnector_3121Text(view);
		case CalloutMediatorOutputConnector2EditPart.VISUAL_ID:
			return getCalloutMediatorOutputConnector_3182Text(view);
		case CloneMediatorInputConnector3EditPart.VISUAL_ID:
			return getCloneMediatorInputConnector_3297Text(view);
		case SendMediatorOutputConnector2EditPart.VISUAL_ID:
			return getSendMediatorOutputConnector_3167Text(view);
		case CalloutMediatorOutputConnector3EditPart.VISUAL_ID:
			return getCalloutMediatorOutputConnector_3308Text(view);
		case FaultMediatorOutputConnector3EditPart.VISUAL_ID:
			return getFaultMediatorOutputConnector_3274Text(view);
		case ProxyServiceInSequenceEditPart.VISUAL_ID:
			return getProxyServiceInSequence_3197Text(view);
		case SmooksMediatorOutputConnector2EditPart.VISUAL_ID:
			return getSmooksMediatorOutputConnector_3289Text(view);
		case RMSequenceMediator2EditPart.VISUAL_ID:
			return getRMSequenceMediator_3180Text(view);
		case DBReportMediator4EditPart.VISUAL_ID:
			return getDBReportMediator_3350Text(view);
		case PropertyMediatorOutputConnector3EditPart.VISUAL_ID:
			return getPropertyMediatorOutputConnector_3202Text(view);
		case FilterMediator2EditPart.VISUAL_ID:
			return getFilterMediator_3139Text(view);
		case AggregateMediatorEditPart.VISUAL_ID:
			return getAggregateMediator_3236Text(view);
		case ScriptMediatorOutputConnectorEditPart.VISUAL_ID:
			return getScriptMediatorOutputConnector_3065Text(view);
		case ThrottleMediator2EditPart.VISUAL_ID:
			return getThrottleMediator_3206Text(view);
		case HeaderMediator3EditPart.VISUAL_ID:
			return getHeaderMediator_3293Text(view);
		case DropMediator2EditPart.VISUAL_ID:
			return getDropMediator_3137Text(view);
		case CloneMediatorInputConnectorEditPart.VISUAL_ID:
			return getCloneMediatorInputConnector_3103Text(view);
		case ProxyServiceSequenceContainerEditPart.VISUAL_ID:
			return getProxyServiceSequenceContainer_3196Text(view);
		case TransactionMediator2EditPart.VISUAL_ID:
			return getTransactionMediator_3179Text(view);
		case TransactionMediatorInputConnector4EditPart.VISUAL_ID:
			return getTransactionMediatorInputConnector_3370Text(view);
		case CalloutMediatorInputConnector2EditPart.VISUAL_ID:
			return getCalloutMediatorInputConnector_3181Text(view);
		case DefaultEndPointOutputConnectorEditPart.VISUAL_ID:
			return getDefaultEndPointOutputConnector_3022Text(view);
		case SwitchCaseBranchOutputConnector2EditPart.VISUAL_ID:
			return getSwitchCaseBranchOutputConnector_3154Text(view);
		case DBLookupMediatorOutputConnector4EditPart.VISUAL_ID:
			return getDBLookupMediatorOutputConnector_3349Text(view);
		case CalloutMediatorOutputConnectorEditPart.VISUAL_ID:
			return getCalloutMediatorOutputConnector_3116Text(view);
		case TransactionMediatorInputConnector2EditPart.VISUAL_ID:
			return getTransactionMediatorInputConnector_3183Text(view);
		case SwitchMediator2EditPart.VISUAL_ID:
			return getSwitchMediator_3152Text(view);
		case SmooksMediator2EditPart.VISUAL_ID:
			return getSmooksMediator_3287Text(view);
		case FilterMediatorFailOutputConnectorEditPart.VISUAL_ID:
			return getFilterMediatorFailOutputConnector_3012Text(view);
		case PropertyMediatorInputConnector4EditPart.VISUAL_ID:
			return getPropertyMediatorInputConnector_3203Text(view);
		case DBReportMediatorOutputConnectorEditPart.VISUAL_ID:
			return getDBReportMediatorOutputConnector_3080Text(view);
		case SendMediator4EditPart.VISUAL_ID:
			return getSendMediator_3353Text(view);
		case XQueryMediatorOutputConnector2EditPart.VISUAL_ID:
			return getXQueryMediatorOutputConnector_3277Text(view);
		case PropertyMediatorInputConnector2EditPart.VISUAL_ID:
			return getPropertyMediatorInputConnector_3144Text(view);
		case EnrichMediator3EditPart.VISUAL_ID:
			return getEnrichMediator_3244Text(view);
		case SpringMediatorEditPart.VISUAL_ID:
			return getSpringMediator_3218Text(view);
		case FilterMediator4EditPart.VISUAL_ID:
			return getFilterMediator_3329Text(view);
		case CalloutMediatorEditPart.VISUAL_ID:
			return getCalloutMediator_3231Text(view);
		case XSLTMediatorOutputConnector3EditPart.VISUAL_ID:
			return getXSLTMediatorOutputConnector_3249Text(view);
		case IterateMediatorOutputConnector2EditPart.VISUAL_ID:
			return getIterateMediatorOutputConnector_3177Text(view);
		case EnrichMediatorInputConnector2EditPart.VISUAL_ID:
			return getEnrichMediatorInputConnector_3147Text(view);
		case AggregateMediatorInputConnector2EditPart.VISUAL_ID:
			return getAggregateMediatorInputConnector_3322Text(view);
		case PropertyMediatorOutputConnectorEditPart.VISUAL_ID:
			return getPropertyMediatorOutputConnector_3034Text(view);
		case SwitchCaseBranchOutputConnector4EditPart.VISUAL_ID:
			return getSwitchCaseBranchOutputConnector_3342Text(view);
		case TransactionMediatorInputConnectorEditPart.VISUAL_ID:
			return getTransactionMediatorInputConnector_3118Text(view);
		case TransactionMediator4EditPart.VISUAL_ID:
			return getTransactionMediator_3369Text(view);
		case DBLookupMediator3EditPart.VISUAL_ID:
			return getDBLookupMediator_3281Text(view);
		case FilterMediatorInputConnectorEditPart.VISUAL_ID:
			return getFilterMediatorInputConnector_3010Text(view);
		case HeaderMediatorOutputConnectorEditPart.VISUAL_ID:
			return getHeaderMediatorOutputConnector_3101Text(view);
		case CloneMediatorOutputConnectorEditPart.VISUAL_ID:
			return getCloneMediatorOutputConnector_3104Text(view);
		case CloneMediator2EditPart.VISUAL_ID:
			return getCloneMediator_3171Text(view);
		case CacheMediator2EditPart.VISUAL_ID:
			return getCacheMediator_3300Text(view);
		case HeaderMediatorOutputConnector3EditPart.VISUAL_ID:
			return getHeaderMediatorOutputConnector_3295Text(view);
		case CloneMediatorOutputConnector4EditPart.VISUAL_ID:
			return getCloneMediatorOutputConnector_3361Text(view);
		case XSLTMediatorOutputConnector2EditPart.VISUAL_ID:
			return getXSLTMediatorOutputConnector_3151Text(view);
		case ProxyServiceEditPart.VISUAL_ID:
			return getProxyService_3001Text(view);
		case SwitchCaseBranchOutputConnector3EditPart.VISUAL_ID:
			return getSwitchCaseBranchOutputConnector_3252Text(view);
		case SequenceInputConnectorEditPart.VISUAL_ID:
			return getSequenceInputConnector_3049Text(view);
		case ClassMediatorInputConnector2EditPart.VISUAL_ID:
			return getClassMediatorInputConnector_3264Text(view);
		case FilterMediator3EditPart.VISUAL_ID:
			return getFilterMediator_3237Text(view);
		case CalloutMediatorOutputConnector4EditPart.VISUAL_ID:
			return getCalloutMediatorOutputConnector_3368Text(view);
		case CloneMediatorEditPart.VISUAL_ID:
			return getCloneMediator_3228Text(view);
		case DefaultEndPoint2EditPart.VISUAL_ID:
			return getDefaultEndPoint_3382Text(view);
		case IterateMediatorInputConnector2EditPart.VISUAL_ID:
			return getIterateMediatorInputConnector_3176Text(view);
		case AddressEndPointOutputConnectorEditPart.VISUAL_ID:
			return getAddressEndPointOutputConnector_3031Text(view);
		case ScriptMediatorInputConnector2EditPart.VISUAL_ID:
			return getScriptMediatorInputConnector_3270Text(view);
		case SmooksMediatorInputConnector2EditPart.VISUAL_ID:
			return getSmooksMediatorInputConnector_3288Text(view);
		case LoadBalanceEndPointOutputConnectorEditPart.VISUAL_ID:
			return getLoadBalanceEndPointOutputConnector_3096Text(view);
		case RuleMediatorOutputConnector2EditPart.VISUAL_ID:
			return getRuleMediatorOutputConnector_3317Text(view);
		case HeaderMediatorOutputConnector2EditPart.VISUAL_ID:
			return getHeaderMediatorOutputConnector_3170Text(view);
		case DBReportMediatorInputConnector4EditPart.VISUAL_ID:
			return getDBReportMediatorInputConnector_3351Text(view);
		case ThrottleMediatorOutputConnectorEditPart.VISUAL_ID:
			return getThrottleMediatorOutputConnector_3122Text(view);
		case DBReportMediatorOutputConnector2EditPart.VISUAL_ID:
			return getDBReportMediatorOutputConnector_3164Text(view);
		case OAuthMediatorEditPart.VISUAL_ID:
			return getOAuthMediator_3235Text(view);
		case FilterMediatorPassOutputConnector4EditPart.VISUAL_ID:
			return getFilterMediatorPassOutputConnector_3331Text(view);
		case PropertyMediator5EditPart.VISUAL_ID:
			return getPropertyMediator_3333Text(view);
		case DropMediator4EditPart.VISUAL_ID:
			return getDropMediator_3194Text(view);
		case CloneMediatorInputConnector2EditPart.VISUAL_ID:
			return getCloneMediatorInputConnector_3172Text(view);
		case RMSequenceMediatorEditPart.VISUAL_ID:
			return getRMSequenceMediator_3233Text(view);
		case CloneMediatorOutputConnector3EditPart.VISUAL_ID:
			return getCloneMediatorOutputConnector_3298Text(view);
		case RMSequenceMediator3EditPart.VISUAL_ID:
			return getRMSequenceMediator_3312Text(view);
		case CloneMediatorOutputConnector2EditPart.VISUAL_ID:
			return getCloneMediatorOutputConnector_3173Text(view);
		case LogMediatorEditPart.VISUAL_ID:
			return getLogMediator_3210Text(view);
		case SendMediatorInputConnector2EditPart.VISUAL_ID:
			return getSendMediatorInputConnector_3166Text(view);
		case RMSequenceMediatorInputConnectorEditPart.VISUAL_ID:
			return getRMSequenceMediatorInputConnector_3124Text(view);
		case EventMediatorOutputConnectorEditPart.VISUAL_ID:
			return getEventMediatorOutputConnector_3053Text(view);
		case CacheMediatorOutputConnectorEditPart.VISUAL_ID:
			return getCacheMediatorOutputConnector_3107Text(view);
		case ScriptMediatorEditPart.VISUAL_ID:
			return getScriptMediator_3219Text(view);
		case TransactionMediatorOutputConnectorEditPart.VISUAL_ID:
			return getTransactionMediatorOutputConnector_3119Text(view);
		case IterateMediatorOutputConnector3EditPart.VISUAL_ID:
			return getIterateMediatorOutputConnector_3305Text(view);
		case DropMediatorInputConnector3EditPart.VISUAL_ID:
			return getDropMediatorInputConnector_3192Text(view);
		case CalloutMediatorInputConnector4EditPart.VISUAL_ID:
			return getCalloutMediatorInputConnector_3367Text(view);
		case FaultMediatorOutputConnector4EditPart.VISUAL_ID:
			return getFaultMediatorOutputConnector_3346Text(view);
		case EnrichMediatorEditPart.VISUAL_ID:
			return getEnrichMediator_3387Text(view);
		case FilterMediatorFailOutputConnector4EditPart.VISUAL_ID:
			return getFilterMediatorFailOutputConnector_3332Text(view);
		case SwitchMediator4EditPart.VISUAL_ID:
			return getSwitchMediator_3340Text(view);
		case FaultMediator3EditPart.VISUAL_ID:
			return getFaultMediator_3272Text(view);
		case SwitchMediatorEditPart.VISUAL_ID:
			return getSwitchMediator_3213Text(view);
		case EnrichMediatorInputConnector4EditPart.VISUAL_ID:
			return getEnrichMediatorInputConnector_3388Text(view);
		case XSLTMediatorOutputConnectorEditPart.VISUAL_ID:
			return getXSLTMediatorOutputConnector_3040Text(view);
		case LogMediatorOutputConnectorEditPart.VISUAL_ID:
			return getLogMediatorOutputConnector_3019Text(view);
		case DropMediator5EditPart.VISUAL_ID:
			return getDropMediator_3328Text(view);
		case CloneMediatorTargetOutputConnector3EditPart.VISUAL_ID:
			return getCloneMediatorTargetOutputConnector_3299Text(view);
		case FilterMediatorPassOutputConnector3EditPart.VISUAL_ID:
			return getFilterMediatorPassOutputConnector_3239Text(view);
		case LoadBalanceEndPointWestOutputConnectorEditPart.VISUAL_ID:
			return getLoadBalanceEndPointWestOutputConnector_3098Text(view);
		case FailoverEndPointInputConnectorEditPart.VISUAL_ID:
			return getFailoverEndPointInputConnector_3088Text(view);
		case CommandMediator2EditPart.VISUAL_ID:
			return getCommandMediator_3278Text(view);
		case XQueryMediator2EditPart.VISUAL_ID:
			return getXQueryMediator_3275Text(view);
		case RuleMediatorEditPart.VISUAL_ID:
			return getRuleMediator_3234Text(view);
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
	private String getCommandMediator_3222Text(View view) {
		IParser parser = EsbParserProvider.getParser(
				EsbElementTypes.CommandMediator_3222,
				view.getElement() != null ? view.getElement() : view,
				EsbVisualIDRegistry
						.getType(CommandMediatorClassNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5057); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEnrichMediator_3334Text(View view) {
		IParser parser = EsbParserProvider.getParser(
				EsbElementTypes.EnrichMediator_3334,
				view.getElement() != null ? view.getElement() : view,
				EsbVisualIDRegistry
						.getType(EnrichMediatorSourceType4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5090); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getClassMediatorInputConnector_3264Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getSpringMediatorOutputConnector_3268Text(View view) {
		return ""; //$NON-NLS-1$
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
	private String getHeaderMediatorInputConnector_3357Text(View view) {
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
	private String getIterateMediator_3303Text(View view) {
		IParser parser = EsbParserProvider.getParser(
				EsbElementTypes.IterateMediator_3303,
				view.getElement() != null ? view.getElement() : view,
				EsbVisualIDRegistry
						.getType(IterateMediatorIterateID3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5084); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getClassMediator_3217Text(View view) {
		IParser parser = EsbParserProvider.getParser(
				EsbElementTypes.ClassMediator_3217,
				view.getElement() != null ? view.getElement() : view,
				EsbVisualIDRegistry
						.getType(ClassMediatorClassNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5052); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAggregateMediatorInputConnector_3322Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getXSLTMediator_3212Text(View view) {
		XSLTMediator domainModelElement = (XSLTMediator) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.isReverse());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3212); //$NON-NLS-1$
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
	private String getIterateMediator_3230Text(View view) {
		IParser parser = EsbParserProvider.getParser(
				EsbElementTypes.IterateMediator_3230,
				view.getElement() != null ? view.getElement() : view,
				EsbVisualIDRegistry
						.getType(IterateMediatorIterateIDEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5063); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCommandMediatorOutputConnector_3280Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getXQueryMediatorInputConnector_3276Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getSequenceOutputConnector_3377Text(View view) {
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
	private String getPropertyMediatorInputConnector_3201Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getLogMediator_3325Text(View view) {
		IParser parser = EsbParserProvider.getParser(
				EsbElementTypes.LogMediator_3325,
				view.getElement() != null ? view.getElement() : view,
				EsbVisualIDRegistry
						.getType(LogMediatorLogCategory4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5087); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSwitchCaseBranchOutputConnector_3252Text(View view) {
		SwitchCaseBranchOutputConnector domainModelElement = (SwitchCaseBranchOutputConnector) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getCaseRegex();
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3252); //$NON-NLS-1$
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
	private String getWSDLEndPoint_3385Text(View view) {
		IParser parser = EsbParserProvider.getParser(
				EsbElementTypes.WSDLEndPoint_3385,
				view.getElement() != null ? view.getElement() : view,
				EsbVisualIDRegistry
						.getType(WSDLEndPointEndPointName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5102); //$NON-NLS-1$
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
	private String getScriptMediator_3269Text(View view) {
		IParser parser = EsbParserProvider
				.getParser(
						EsbElementTypes.ScriptMediator_3269,
						view.getElement() != null ? view.getElement() : view,
						EsbVisualIDRegistry
								.getType(ScriptMediatorScriptLanguage2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5075); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCalloutMediator_3306Text(View view) {
		IParser parser = EsbParserProvider.getParser(
				EsbElementTypes.CalloutMediator_3306,
				view.getElement() != null ? view.getElement() : view,
				EsbVisualIDRegistry
						.getType(CalloutMediatorSoapAction3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5085); //$NON-NLS-1$
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
	private String getXSLTMediatorOutputConnector_3249Text(View view) {
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
	private String getSwitchMediatorInputConnector_3341Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getAddressEndPoint_3383Text(View view) {
		IParser parser = EsbParserProvider
				.getParser(
						EsbElementTypes.AddressEndPoint_3383,
						view.getElement() != null ? view.getElement() : view,
						EsbVisualIDRegistry
								.getType(AddressEndPointEndPointName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5100); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getClassMediator_3263Text(View view) {
		IParser parser = EsbParserProvider.getParser(
				EsbElementTypes.ClassMediator_3263,
				view.getElement() != null ? view.getElement() : view,
				EsbVisualIDRegistry
						.getType(ClassMediatorClassName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5073); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLogMediator_3210Text(View view) {
		IParser parser = EsbParserProvider.getParser(
				EsbElementTypes.LogMediator_3210,
				view.getElement() != null ? view.getElement() : view,
				EsbVisualIDRegistry
						.getType(LogMediatorLogCategoryEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5047); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLogMediator_3241Text(View view) {
		IParser parser = EsbParserProvider.getParser(
				EsbElementTypes.LogMediator_3241,
				view.getElement() != null ? view.getElement() : view,
				EsbVisualIDRegistry
						.getType(LogMediatorLogCategory3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5068); //$NON-NLS-1$
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
	private String getIterateMediatorInputConnector_3364Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getFaultMediatorInputConnector_3345Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getFaultMediatorInputConnector_3273Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getLogMediatorInputConnector_3242Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getSendMediator_3290Text(View view) {
		SendMediator domainModelElement = (SendMediator) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.isReverse());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3290); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDBLookupMediator_3281Text(View view) {
		IParser parser = EsbParserProvider
				.getParser(
						EsbElementTypes.DBLookupMediator_3281,
						view.getElement() != null ? view.getElement() : view,
						EsbVisualIDRegistry
								.getType(DBLookupMediatorConnectionURL3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5079); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSequenceOutputConnector_3256Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getLoadBalanceEndPoint_3386Text(View view) {
		IParser parser = EsbParserProvider
				.getParser(
						EsbElementTypes.LoadBalanceEndPoint_3386,
						view.getElement() != null ? view.getElement() : view,
						EsbVisualIDRegistry
								.getType(LoadBalanceEndPointEndPointName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5103); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOAuthMediatorInputConnector_3319Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getCacheMediator_3229Text(View view) {
		IParser parser = EsbParserProvider.getParser(
				EsbElementTypes.CacheMediator_3229,
				view.getElement() != null ? view.getElement() : view,
				EsbVisualIDRegistry
						.getType(CacheMediatorCacheIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5062); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLogMediatorOutputConnector_3327Text(View view) {
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
	private String getXQueryMediator_3275Text(View view) {
		IParser parser = EsbParserProvider
				.getParser(
						EsbElementTypes.XQueryMediator_3275,
						view.getElement() != null ? view.getElement() : view,
						EsbVisualIDRegistry
								.getType(XQueryMediatorScriptKeyType2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5077); //$NON-NLS-1$
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
	private String getSequenceInputConnector_3376Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getCalloutMediatorOutputConnector_3308Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getDBReportMediatorOutputConnector_3286Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getSmooksMediator_3225Text(View view) {
		SmooksMediator domainModelElement = (SmooksMediator) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.isReverse());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3225); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
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
	private String getProxyOutputConnector_3002Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getIterateMediator_3363Text(View view) {
		IParser parser = EsbParserProvider.getParser(
				EsbElementTypes.IterateMediator_3363,
				view.getElement() != null ? view.getElement() : view,
				EsbVisualIDRegistry
						.getType(IterateMediatorIterateID4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5096); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
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
	private String getLogMediatorInputConnector_3326Text(View view) {
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
	private String getXSLTMediator_3337Text(View view) {
		XSLTMediator domainModelElement = (XSLTMediator) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.isReverse());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3337); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEnrichMediatorOutputConnector_3389Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getEnrichMediator_3387Text(View view) {
		IParser parser = EsbParserProvider.getParser(
				EsbElementTypes.EnrichMediator_3387,
				view.getElement() != null ? view.getElement() : view,
				EsbVisualIDRegistry
						.getType(EnrichMediatorSourceTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5104); //$NON-NLS-1$
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
	private String getCloneMediatorOutputConnector_3298Text(View view) {
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
	private String getSwitchCaseBranchOutputConnector_3342Text(View view) {
		SwitchCaseBranchOutputConnector domainModelElement = (SwitchCaseBranchOutputConnector) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getCaseRegex();
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3342); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDropMediator_3328Text(View view) {
		DropMediator domainModelElement = (DropMediator) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.isReverse());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3328); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEntitlementMediator_3260Text(View view) {
		IParser parser = EsbParserProvider
				.getParser(
						EsbElementTypes.EntitlementMediator_3260,
						view.getElement() != null ? view.getElement() : view,
						EsbVisualIDRegistry
								.getType(EntitlementMediatorServerURL2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5072); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getHeaderMediatorInputConnector_3294Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getRuleMediator_3234Text(View view) {
		RuleMediator domainModelElement = (RuleMediator) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.isReverse());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3234); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
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
	private String getEnrichMediatorInputConnector_3388Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getIterateMediatorInputConnector_3304Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getDropMediator_3194Text(View view) {
		DropMediator domainModelElement = (DropMediator) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.isReverse());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3194); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEnrichMediatorInputConnector_3245Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getCommandMediator_3278Text(View view) {
		IParser parser = EsbParserProvider.getParser(
				EsbElementTypes.CommandMediator_3278,
				view.getElement() != null ? view.getElement() : view,
				EsbVisualIDRegistry
						.getType(CommandMediatorClassName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5078); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOAuthMediator_3235Text(View view) {
		IParser parser = EsbParserProvider
				.getParser(
						EsbElementTypes.OAuthMediator_3235,
						view.getElement() != null ? view.getElement() : view,
						EsbVisualIDRegistry
								.getType(OAuthMediatorRemoteServiceUrlEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5065); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getProxyServiceSequenceContainer_3196Text(View view) {
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
	private String getSequence_3214Text(View view) {
		IParser parser = EsbParserProvider.getParser(
				EsbElementTypes.Sequence_3214,
				view.getElement() != null ? view.getElement() : view,
				EsbVisualIDRegistry.getType(SequenceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5049); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOAuthMediator_3318Text(View view) {
		IParser parser = EsbParserProvider
				.getParser(
						EsbElementTypes.OAuthMediator_3318,
						view.getElement() != null ? view.getElement() : view,
						EsbVisualIDRegistry
								.getType(OAuthMediatorRemoteServiceUrl2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5086); //$NON-NLS-1$
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
	private String getDBReportMediator_3284Text(View view) {
		IParser parser = EsbParserProvider
				.getParser(
						EsbElementTypes.DBReportMediator_3284,
						view.getElement() != null ? view.getElement() : view,
						EsbVisualIDRegistry
								.getType(DBReportMediatorConnectionURL3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5080); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
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
	private String getXSLTMediatorOutputConnector_3339Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getPropertyMediator_3333Text(View view) {
		IParser parser = EsbParserProvider
				.getParser(
						EsbElementTypes.PropertyMediator_3333,
						view.getElement() != null ? view.getElement() : view,
						EsbVisualIDRegistry
								.getType(PropertyMediatorPropertyName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5089); //$NON-NLS-1$
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
	private String getSendMediatorOutputConnector_3355Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getLogMediatorOutputConnector_3243Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getRMSequenceMediator_3233Text(View view) {
		RMSequenceMediator domainModelElement = (RMSequenceMediator) view
				.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.isReverse());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3233); //$NON-NLS-1$
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
	private String getEnrichMediatorOutputConnector_3246Text(View view) {
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
	private String getHeaderMediator_3293Text(View view) {
		IParser parser = EsbParserProvider
				.getParser(
						EsbElementTypes.HeaderMediator_3293,
						view.getElement() != null ? view.getElement() : view,
						EsbVisualIDRegistry
								.getType(HeaderMediatorValueLiteral3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5081); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
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
	private String getTransactionMediator_3309Text(View view) {
		TransactionMediator domainModelElement = (TransactionMediator) view
				.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.isReverse());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3309); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDBLookupMediator_3223Text(View view) {
		IParser parser = EsbParserProvider
				.getParser(
						EsbElementTypes.DBLookupMediator_3223,
						view.getElement() != null ? view.getElement() : view,
						EsbVisualIDRegistry
								.getType(DBLookupMediatorConnectionURLEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5058); //$NON-NLS-1$
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
	private String getDBReportMediatorInputConnector_3351Text(View view) {
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
	private String getCacheMediator_3300Text(View view) {
		IParser parser = EsbParserProvider.getParser(
				EsbElementTypes.CacheMediator_3300,
				view.getElement() != null ? view.getElement() : view,
				EsbVisualIDRegistry
						.getType(CacheMediatorCacheId2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5083); //$NON-NLS-1$
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
	private String getDBLookupMediatorOutputConnector_3283Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getFilterMediatorPassOutputConnector_3239Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getSwitchMediator_3213Text(View view) {
		SwitchMediator domainModelElement = (SwitchMediator) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getNamespace();
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3213); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRMSequenceMediator_3312Text(View view) {
		RMSequenceMediator domainModelElement = (RMSequenceMediator) view
				.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.isReverse());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3312); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCacheMediatorInputConnector_3301Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getFilterMediatorFailOutputConnector_3240Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getPropertyMediatorOutputConnector_3202Text(View view) {
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
	private String getDBLookupMediatorInputConnector_3282Text(View view) {
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
	private String getCloneMediatorTargetOutputConnector_3362Text(View view) {
		CloneMediatorTargetOutputConnector domainModelElement = (CloneMediatorTargetOutputConnector) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getSoapAction();
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3362); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAggregateMediatorOnCompleteOutputConnector_3324Text(
			View view) {
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
	private String getScriptMediatorInputConnector_3270Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getPropertyMediatorInputConnector_3203Text(View view) {
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
	private String getXSLTMediator_3247Text(View view) {
		XSLTMediator domainModelElement = (XSLTMediator) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.isReverse());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3247); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCalloutMediatorInputConnector_3367Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getSequence_3254Text(View view) {
		IParser parser = EsbParserProvider.getParser(
				EsbElementTypes.Sequence_3254,
				view.getElement() != null ? view.getElement() : view,
				EsbVisualIDRegistry.getType(SequenceName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5070); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
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
	private String getDBReportMediatorOutputConnector_3352Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getOAuthMediatorOutputConnector_3320Text(View view) {
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
	private String getXSLTMediatorInputConnector_3248Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getSequence_3375Text(View view) {
		Sequence domainModelElement = (Sequence) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3375); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCloneMediatorInputConnector_3360Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getEntitlementMediatorOutputConnector_3262Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getThrottleMediator_3206Text(View view) {
		IParser parser = EsbParserProvider.getParser(
				EsbElementTypes.ThrottleMediator_3206,
				view.getElement() != null ? view.getElement() : view,
				EsbVisualIDRegistry
						.getType(ThrottleMediatorGroupId2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5045); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSmooksMediatorOutputConnector_3289Text(View view) {
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
	private String getDropMediator_3191Text(View view) {
		DropMediator domainModelElement = (DropMediator) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.isReverse());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3191); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCloneMediator_3228Text(View view) {
		IParser parser = EsbParserProvider.getParser(
				EsbElementTypes.CloneMediator_3228,
				view.getElement() != null ? view.getElement() : view,
				EsbVisualIDRegistry
						.getType(CloneMediatorCloneIDEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5061); //$NON-NLS-1$
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
	private String getHeaderMediatorOutputConnector_3358Text(View view) {
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
	private String getSendMediatorInputConnector_3291Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getRMSequenceMediatorInputConnector_3373Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getTransactionMediatorInputConnector_3310Text(View view) {
		return ""; //$NON-NLS-1$
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
	private String getSpringMediator_3266Text(View view) {
		IParser parser = EsbParserProvider.getParser(
				EsbElementTypes.SpringMediator_3266,
				view.getElement() != null ? view.getElement() : view,
				EsbVisualIDRegistry
						.getType(SpringMediatorBeanName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5074); //$NON-NLS-1$
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
	private String getCalloutMediator_3231Text(View view) {
		IParser parser = EsbParserProvider.getParser(
				EsbElementTypes.CalloutMediator_3231,
				view.getElement() != null ? view.getElement() : view,
				EsbVisualIDRegistry
						.getType(CalloutMediatorSoapActionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5064); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
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
	private String getPropertyMediator_3199Text(View view) {
		IParser parser = EsbParserProvider
				.getParser(
						EsbElementTypes.PropertyMediator_3199,
						view.getElement() != null ? view.getElement() : view,
						EsbVisualIDRegistry
								.getType(PropertyMediatorPropertyName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5042); //$NON-NLS-1$
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
	private String getTransactionMediator_3369Text(View view) {
		TransactionMediator domainModelElement = (TransactionMediator) view
				.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.isReverse());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3369); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSwitchMediator_3340Text(View view) {
		SwitchMediator domainModelElement = (SwitchMediator) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getNamespace();
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3340); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTransactionMediatorInputConnector_3370Text(View view) {
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
	private String getThrottleMediator_3205Text(View view) {
		IParser parser = EsbParserProvider.getParser(
				EsbElementTypes.ThrottleMediator_3205,
				view.getElement() != null ? view.getElement() : view,
				EsbVisualIDRegistry
						.getType(ThrottleMediatorGroupIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5044); //$NON-NLS-1$
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
	private String getRuleMediatorInputConnector_3316Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getScriptMediator_3219Text(View view) {
		IParser parser = EsbParserProvider
				.getParser(
						EsbElementTypes.ScriptMediator_3219,
						view.getElement() != null ? view.getElement() : view,
						EsbVisualIDRegistry
								.getType(ScriptMediatorScriptLanguageEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5054); //$NON-NLS-1$
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
	private String getFaultMediator_3272Text(View view) {
		IParser parser = EsbParserProvider
				.getParser(
						EsbElementTypes.FaultMediator_3272,
						view.getElement() != null ? view.getElement() : view,
						EsbVisualIDRegistry
								.getType(FaultMediatorFaultStringType3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5076); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
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
	private String getCloneMediatorInputConnector_3297Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getEventMediator_3257Text(View view) {
		IParser parser = EsbParserProvider.getParser(
				EsbElementTypes.EventMediator_3257,
				view.getElement() != null ? view.getElement() : view,
				EsbVisualIDRegistry
						.getType(EventMediatorTopicType2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5071); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCloneMediatorTargetOutputConnector_3299Text(View view) {
		CloneMediatorTargetOutputConnector domainModelElement = (CloneMediatorTargetOutputConnector) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getSoapAction();
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3299); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
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
	private String getThrottleMediatorInputConnector_3207Text(View view) {
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
	private String getDBLookupMediatorInputConnector_3160Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getRMSequenceMediatorOutputConnector_3374Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getCalloutMediator_3366Text(View view) {
		IParser parser = EsbParserProvider.getParser(
				EsbElementTypes.CalloutMediator_3366,
				view.getElement() != null ? view.getElement() : view,
				EsbVisualIDRegistry
						.getType(CalloutMediatorSoapAction4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5097); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getFaultMediator_3344Text(View view) {
		IParser parser = EsbParserProvider
				.getParser(
						EsbElementTypes.FaultMediator_3344,
						view.getElement() != null ? view.getElement() : view,
						EsbVisualIDRegistry
								.getType(FaultMediatorFaultStringType4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5091); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getHeaderMediator_3356Text(View view) {
		IParser parser = EsbParserProvider
				.getParser(
						EsbElementTypes.HeaderMediator_3356,
						view.getElement() != null ? view.getElement() : view,
						EsbVisualIDRegistry
								.getType(HeaderMediatorValueLiteral4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5094); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getFilterMediator_3209Text(View view) {
		IParser parser = EsbParserProvider
				.getParser(
						EsbElementTypes.FilterMediator_3209,
						view.getElement() != null ? view.getElement() : view,
						EsbVisualIDRegistry
								.getType(FilterMediatorConditionTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5046); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
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
	private String getCloneMediator_3296Text(View view) {
		IParser parser = EsbParserProvider.getParser(
				EsbElementTypes.CloneMediator_3296,
				view.getElement() != null ? view.getElement() : view,
				EsbVisualIDRegistry
						.getType(CloneMediatorCloneID3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5082); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSwitchDefaultBranchOutputConnector_3343Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getFaultMediator_3220Text(View view) {
		IParser parser = EsbParserProvider
				.getParser(
						EsbElementTypes.FaultMediator_3220,
						view.getElement() != null ? view.getElement() : view,
						EsbVisualIDRegistry
								.getType(FaultMediatorFaultStringTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5055); //$NON-NLS-1$
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
	private String getRuleMediatorOutputConnector_3317Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getAggregateMediator_3236Text(View view) {
		IParser parser = EsbParserProvider
				.getParser(
						EsbElementTypes.AggregateMediator_3236,
						view.getElement() != null ? view.getElement() : view,
						EsbVisualIDRegistry
								.getType(AggregateMediatorAggregateIDEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5066); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCalloutMediatorInputConnector_3307Text(View view) {
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
	private String getAggregateMediatorOutputConnector_3323Text(View view) {
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
	private String getSwitchMediatorInputConnector_3251Text(View view) {
		return ""; //$NON-NLS-1$
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
	private String getEntitlementMediatorInputConnector_3261Text(View view) {
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
	private String getEnrichMediator_3244Text(View view) {
		IParser parser = EsbParserProvider.getParser(
				EsbElementTypes.EnrichMediator_3244,
				view.getElement() != null ? view.getElement() : view,
				EsbVisualIDRegistry
						.getType(EnrichMediatorSourceType3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5069); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPropertyMediator_3200Text(View view) {
		IParser parser = EsbParserProvider
				.getParser(
						EsbElementTypes.PropertyMediator_3200,
						view.getElement() != null ? view.getElement() : view,
						EsbVisualIDRegistry
								.getType(PropertyMediatorPropertyName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5043); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDBLookupMediator_3347Text(View view) {
		IParser parser = EsbParserProvider
				.getParser(
						EsbElementTypes.DBLookupMediator_3347,
						view.getElement() != null ? view.getElement() : view,
						EsbVisualIDRegistry
								.getType(DBLookupMediatorConnectionURL4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5092); //$NON-NLS-1$
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
	private String getRMSequenceMediatorInputConnector_3313Text(View view) {
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
	private String getTransactionMediatorOutputConnector_3371Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getFaultMediatorOutputConnector_3346Text(View view) {
		return ""; //$NON-NLS-1$
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
	private String getAggregateMediatorOutputConnector_3113Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getEventMediatorOutputConnector_3259Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getDefaultEndPoint_3382Text(View view) {
		IParser parser = EsbParserProvider
				.getParser(
						EsbElementTypes.DefaultEndPoint_3382,
						view.getElement() != null ? view.getElement() : view,
						EsbVisualIDRegistry
								.getType(DefaultEndPointEndPointName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5099); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCacheMediatorOutputConnector_3302Text(View view) {
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
	private String getCloneMediatorOutputConnector_3361Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getTransactionMediator_3232Text(View view) {
		TransactionMediator domainModelElement = (TransactionMediator) view
				.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.isReverse());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3232); //$NON-NLS-1$
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
	private String getDBReportMediator_3350Text(View view) {
		IParser parser = EsbParserProvider
				.getParser(
						EsbElementTypes.DBReportMediator_3350,
						view.getElement() != null ? view.getElement() : view,
						EsbVisualIDRegistry
								.getType(DBReportMediatorConnectionURL4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5093); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSwitchDefaultBranchOutputConnector_3253Text(View view) {
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
	private String getIterateMediatorOutputConnector_3305Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getFailoverEndPoint_3384Text(View view) {
		IParser parser = EsbParserProvider
				.getParser(
						EsbElementTypes.FailoverEndPoint_3384,
						view.getElement() != null ? view.getElement() : view,
						EsbVisualIDRegistry
								.getType(FailoverEndPointEndPointName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5101); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
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
	private String getDBReportMediator_3224Text(View view) {
		IParser parser = EsbParserProvider
				.getParser(
						EsbElementTypes.DBReportMediator_3224,
						view.getElement() != null ? view.getElement() : view,
						EsbVisualIDRegistry
								.getType(DBReportMediatorConnectionURLEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5059); //$NON-NLS-1$
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
	private String getProxyServiceEndpointContainer_3381Text(View view) {
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
	private String getDBLookupMediatorOutputConnector_3349Text(View view) {
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
	private String getAggregateMediator_3321Text(View view) {
		IParser parser = EsbParserProvider
				.getParser(
						EsbElementTypes.AggregateMediator_3321,
						view.getElement() != null ? view.getElement() : view,
						EsbVisualIDRegistry
								.getType(AggregateMediatorAggregateID2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5098); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSendMediator_3353Text(View view) {
		SendMediator domainModelElement = (SendMediator) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.isReverse());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3353); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSwitchMediator_3250Text(View view) {
		SwitchMediator domainModelElement = (SwitchMediator) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getNamespace();
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3250); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getFilterMediatorInputConnector_3238Text(View view) {
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
	private String getDBReportMediatorInputConnector_3285Text(View view) {
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
	private String getFilterMediatorInputConnector_3330Text(View view) {
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
	private String getDropMediatorInputConnector_3192Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getCloneMediator_3359Text(View view) {
		IParser parser = EsbParserProvider.getParser(
				EsbElementTypes.CloneMediator_3359,
				view.getElement() != null ? view.getElement() : view,
				EsbVisualIDRegistry
						.getType(CloneMediatorCloneID4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5095); //$NON-NLS-1$
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
	private String getThrottleMediatorOutputConnector_3208Text(View view) {
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
	private String getDBLookupMediatorInputConnector_3348Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getClassMediatorOutputConnector_3265Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getEventMediatorInputConnector_3258Text(View view) {
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
	private String getSequenceInputConnector_3255Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getSendMediatorOutputConnector_3292Text(View view) {
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
	private String getCommandMediatorInputConnector_3279Text(View view) {
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
	private String getXQueryMediatorOutputConnector_3277Text(View view) {
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
	private String getSpringMediator_3218Text(View view) {
		IParser parser = EsbParserProvider.getParser(
				EsbElementTypes.SpringMediator_3218,
				view.getElement() != null ? view.getElement() : view,
				EsbVisualIDRegistry
						.getType(SpringMediatorBeanNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5053); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCalloutMediatorOutputConnector_3368Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getRuleMediator_3315Text(View view) {
		RuleMediator domainModelElement = (RuleMediator) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.isReverse());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3315); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getXSLTMediatorInputConnector_3338Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getDropMediatorInputConnector_3195Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getSendMediatorInputConnector_3354Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getPropertyMediatorOutputConnector_3204Text(View view) {
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
	private String getRMSequenceMediator_3372Text(View view) {
		RMSequenceMediator domainModelElement = (RMSequenceMediator) view
				.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.isReverse());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3372); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSmooksMediator_3287Text(View view) {
		SmooksMediator domainModelElement = (SmooksMediator) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.isReverse());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3287); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getFilterMediator_3237Text(View view) {
		IParser parser = EsbParserProvider
				.getParser(
						EsbElementTypes.FilterMediator_3237,
						view.getElement() != null ? view.getElement() : view,
						EsbVisualIDRegistry
								.getType(FilterMediatorConditionType3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5067); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getFilterMediatorFailOutputConnector_3332Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getFilterMediator_3329Text(View view) {
		IParser parser = EsbParserProvider
				.getParser(
						EsbElementTypes.FilterMediator_3329,
						view.getElement() != null ? view.getElement() : view,
						EsbVisualIDRegistry
								.getType(FilterMediatorConditionType4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5088); //$NON-NLS-1$
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
	private String getFaultMediatorOutputConnector_3274Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getIterateMediatorOutputConnector_3365Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getSmooksMediatorInputConnector_3288Text(View view) {
		return ""; //$NON-NLS-1$
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
	private String getEntitlementMediator_3216Text(View view) {
		IParser parser = EsbParserProvider
				.getParser(
						EsbElementTypes.EntitlementMediator_3216,
						view.getElement() != null ? view.getElement() : view,
						EsbVisualIDRegistry
								.getType(EntitlementMediatorServerURLEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5051); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRMSequenceMediatorOutputConnector_3314Text(View view) {
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
	private String getTransactionMediatorOutputConnector_3311Text(View view) {
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
	private String getSendMediator_3226Text(View view) {
		SendMediator domainModelElement = (SendMediator) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.isReverse());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3226); //$NON-NLS-1$
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
	private String getScriptMediatorOutputConnector_3271Text(View view) {
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
	private String getEventMediator_3215Text(View view) {
		IParser parser = EsbParserProvider.getParser(
				EsbElementTypes.EventMediator_3215,
				view.getElement() != null ? view.getElement() : view,
				EsbVisualIDRegistry
						.getType(EventMediatorTopicTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5050); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSpringMediatorInputConnector_3267Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getXQueryMediator_3221Text(View view) {
		IParser parser = EsbParserProvider
				.getParser(
						EsbElementTypes.XQueryMediator_3221,
						view.getElement() != null ? view.getElement() : view,
						EsbVisualIDRegistry
								.getType(XQueryMediatorScriptKeyTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5056); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
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
	private String getHeaderMediator_3227Text(View view) {
		IParser parser = EsbParserProvider.getParser(
				EsbElementTypes.HeaderMediator_3227,
				view.getElement() != null ? view.getElement() : view,
				EsbVisualIDRegistry
						.getType(HeaderMediatorValueLiteralEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5060); //$NON-NLS-1$
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
	private String getHeaderMediatorOutputConnector_3295Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getFilterMediatorPassOutputConnector_3331Text(View view) {
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
