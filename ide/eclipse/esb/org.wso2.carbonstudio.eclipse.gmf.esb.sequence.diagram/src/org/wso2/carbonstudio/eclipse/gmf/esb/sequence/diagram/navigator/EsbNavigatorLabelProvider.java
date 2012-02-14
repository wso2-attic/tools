package org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.navigator;

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
import org.wso2.carbonstudio.eclipse.gmf.esb.EsbSequence;
import org.wso2.carbonstudio.eclipse.gmf.esb.RMSequenceMediator;
import org.wso2.carbonstudio.eclipse.gmf.esb.SwitchCaseBranchOutputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.SwitchMediator;
import org.wso2.carbonstudio.eclipse.gmf.esb.TransactionMediator;
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
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.part.EsbDiagramEditorPlugin;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.part.EsbVisualIDRegistry;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.providers.EsbElementTypes;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.providers.EsbParserProvider;

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
		case ClassMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?ClassMediatorOutputConnector", EsbElementTypes.ClassMediatorOutputConnector_3543); //$NON-NLS-1$
		case FilterMediatorFailOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?FilterMediatorFailOutputConnector", EsbElementTypes.FilterMediatorFailOutputConnector_3527); //$NON-NLS-1$
		case SmooksMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?SmooksMediatorInputConnector", EsbElementTypes.SmooksMediatorInputConnector_3566); //$NON-NLS-1$
		case EsbSequenceInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?EsbSequenceInputConnector", EsbElementTypes.EsbSequenceInputConnector_3517); //$NON-NLS-1$
		case CalloutMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?CalloutMediatorInputConnector", EsbElementTypes.CalloutMediatorInputConnector_3587); //$NON-NLS-1$
		case XQueryMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?XQueryMediator", EsbElementTypes.XQueryMediator_3553); //$NON-NLS-1$
		case ThrottleMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?ThrottleMediatorInputConnector", EsbElementTypes.ThrottleMediatorInputConnector_3593); //$NON-NLS-1$
		case RMSequenceMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?RMSequenceMediatorOutputConnector", EsbElementTypes.RMSequenceMediatorOutputConnector_3597); //$NON-NLS-1$
		case FaultMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?FaultMediator", EsbElementTypes.FaultMediator_3550); //$NON-NLS-1$
		case CloneMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?CloneMediator", EsbElementTypes.CloneMediator_3574); //$NON-NLS-1$
		case SendMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?SendMediatorInputConnector", EsbElementTypes.SendMediatorInputConnector_3569); //$NON-NLS-1$
		case EventMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?EventMediatorOutputConnector", EsbElementTypes.EventMediatorOutputConnector_3533); //$NON-NLS-1$
		case RMSequenceMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?RMSequenceMediatorInputConnector", EsbElementTypes.RMSequenceMediatorInputConnector_3596); //$NON-NLS-1$
		case CacheMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?CacheMediatorInputConnector", EsbElementTypes.CacheMediatorInputConnector_3578); //$NON-NLS-1$
		case LogMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?LogMediatorOutputConnector", EsbElementTypes.LogMediatorOutputConnector_3503); //$NON-NLS-1$
		case EntitlementMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?EntitlementMediator", EsbElementTypes.EntitlementMediator_3534); //$NON-NLS-1$
		case TransactionMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?TransactionMediatorOutputConnector", EsbElementTypes.TransactionMediatorOutputConnector_3591); //$NON-NLS-1$
		case XSLTMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?XSLTMediatorInputConnector", EsbElementTypes.XSLTMediatorInputConnector_3529); //$NON-NLS-1$
		case IterateMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?IterateMediator", EsbElementTypes.IterateMediator_3580); //$NON-NLS-1$
		case TransactionMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?TransactionMediator", EsbElementTypes.TransactionMediator_3589); //$NON-NLS-1$
		case DBReportMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?DBReportMediatorInputConnector", EsbElementTypes.DBReportMediatorInputConnector_3563); //$NON-NLS-1$
		case SpringMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?SpringMediatorInputConnector", EsbElementTypes.SpringMediatorInputConnector_3545); //$NON-NLS-1$
		case HeaderMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?HeaderMediator", EsbElementTypes.HeaderMediator_3571); //$NON-NLS-1$
		case ScriptMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?ScriptMediatorOutputConnector", EsbElementTypes.ScriptMediatorOutputConnector_3549); //$NON-NLS-1$
		case AggregateMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?AggregateMediator", EsbElementTypes.AggregateMediator_3583); //$NON-NLS-1$
		case SwitchMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?SwitchMediator", EsbElementTypes.SwitchMediator_3537); //$NON-NLS-1$
		case EsbSequenceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///org/wso2/carbonstudio/eclipse/gmf/esb?EsbSequence", EsbElementTypes.EsbSequence_2501); //$NON-NLS-1$
		case SequenceDiagramEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http:///org/wso2/carbonstudio/eclipse/gmf/esb?SequenceDiagram", EsbElementTypes.SequenceDiagram_1000); //$NON-NLS-1$
		case IterateMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?IterateMediatorInputConnector", EsbElementTypes.IterateMediatorInputConnector_3581); //$NON-NLS-1$
		case DBReportMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?DBReportMediator", EsbElementTypes.DBReportMediator_3562); //$NON-NLS-1$
		case EventMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?EventMediatorInputConnector", EsbElementTypes.EventMediatorInputConnector_3532); //$NON-NLS-1$
		case CommandMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?CommandMediatorOutputConnector", EsbElementTypes.CommandMediatorOutputConnector_3558); //$NON-NLS-1$
		case IterateMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?IterateMediatorOutputConnector", EsbElementTypes.IterateMediatorOutputConnector_3582); //$NON-NLS-1$
		case EnrichMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?EnrichMediatorInputConnector", EsbElementTypes.EnrichMediatorInputConnector_3522); //$NON-NLS-1$
		case EntitlementMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?EntitlementMediatorInputConnector", EsbElementTypes.EntitlementMediatorInputConnector_3535); //$NON-NLS-1$
		case EsbLinkEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///org/wso2/carbonstudio/eclipse/gmf/esb?EsbLink", EsbElementTypes.EsbLink_4001); //$NON-NLS-1$
		case AggregateMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?AggregateMediatorOutputConnector", EsbElementTypes.AggregateMediatorOutputConnector_3585); //$NON-NLS-1$
		case DBLookupMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?DBLookupMediatorInputConnector", EsbElementTypes.DBLookupMediatorInputConnector_3560); //$NON-NLS-1$
		case OAuthMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?OAuthMediator", EsbElementTypes.OAuthMediator_3601); //$NON-NLS-1$
		case CalloutMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?CalloutMediatorOutputConnector", EsbElementTypes.CalloutMediatorOutputConnector_3588); //$NON-NLS-1$
		case RuleMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?RuleMediatorOutputConnector", EsbElementTypes.RuleMediatorOutputConnector_3600); //$NON-NLS-1$
		case DBLookupMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?DBLookupMediator", EsbElementTypes.DBLookupMediator_3559); //$NON-NLS-1$
		case CloneMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?CloneMediatorOutputConnector", EsbElementTypes.CloneMediatorOutputConnector_3576); //$NON-NLS-1$
		case ScriptMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?ScriptMediator", EsbElementTypes.ScriptMediator_3547); //$NON-NLS-1$
		case EnrichMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?EnrichMediatorOutputConnector", EsbElementTypes.EnrichMediatorOutputConnector_3523); //$NON-NLS-1$
		case FaultMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?FaultMediatorOutputConnector", EsbElementTypes.FaultMediatorOutputConnector_3552); //$NON-NLS-1$
		case AggregateMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?AggregateMediatorInputConnector", EsbElementTypes.AggregateMediatorInputConnector_3584); //$NON-NLS-1$
		case ThrottleMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?ThrottleMediatorOutputConnector", EsbElementTypes.ThrottleMediatorOutputConnector_3594); //$NON-NLS-1$
		case CloneMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?CloneMediatorInputConnector", EsbElementTypes.CloneMediatorInputConnector_3575); //$NON-NLS-1$
		case SendMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?SendMediator", EsbElementTypes.SendMediator_3568); //$NON-NLS-1$
		case TransactionMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?TransactionMediatorInputConnector", EsbElementTypes.TransactionMediatorInputConnector_3590); //$NON-NLS-1$
		case XQueryMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?XQueryMediatorOutputConnector", EsbElementTypes.XQueryMediatorOutputConnector_3555); //$NON-NLS-1$
		case DBLookupMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?DBLookupMediatorOutputConnector", EsbElementTypes.DBLookupMediatorOutputConnector_3561); //$NON-NLS-1$
		case SendMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?SendMediatorOutputConnector", EsbElementTypes.SendMediatorOutputConnector_3570); //$NON-NLS-1$
		case PropertyMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?PropertyMediatorInputConnector", EsbElementTypes.PropertyMediatorInputConnector_3513); //$NON-NLS-1$
		case HeaderMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?HeaderMediatorInputConnector", EsbElementTypes.HeaderMediatorInputConnector_3572); //$NON-NLS-1$
		case SmooksMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?SmooksMediatorOutputConnector", EsbElementTypes.SmooksMediatorOutputConnector_3567); //$NON-NLS-1$
		case CalloutMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?CalloutMediator", EsbElementTypes.CalloutMediator_3586); //$NON-NLS-1$
		case CommandMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?CommandMediatorInputConnector", EsbElementTypes.CommandMediatorInputConnector_3557); //$NON-NLS-1$
		case OAuthMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?OAuthMediatorInputConnector", EsbElementTypes.OAuthMediatorInputConnector_3602); //$NON-NLS-1$
		case RuleMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?RuleMediator", EsbElementTypes.RuleMediator_3598); //$NON-NLS-1$
		case PropertyMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?PropertyMediatorOutputConnector", EsbElementTypes.PropertyMediatorOutputConnector_3514); //$NON-NLS-1$
		case OAuthMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?OAuthMediatorOutputConnector", EsbElementTypes.OAuthMediatorOutputConnector_3603); //$NON-NLS-1$
		case DropMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?DropMediatorInputConnector", EsbElementTypes.DropMediatorInputConnector_3520); //$NON-NLS-1$
		case FilterMediatorPassOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?FilterMediatorPassOutputConnector", EsbElementTypes.FilterMediatorPassOutputConnector_3526); //$NON-NLS-1$
		case SwitchMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?SwitchMediatorInputConnector", EsbElementTypes.SwitchMediatorInputConnector_3538); //$NON-NLS-1$
		case SpringMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?SpringMediatorOutputConnector", EsbElementTypes.SpringMediatorOutputConnector_3546); //$NON-NLS-1$
		case DropMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?DropMediator", EsbElementTypes.DropMediator_3519); //$NON-NLS-1$
		case EsbSequenceOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?EsbSequenceOutputConnector", EsbElementTypes.EsbSequenceOutputConnector_3518); //$NON-NLS-1$
		case FilterMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?FilterMediatorInputConnector", EsbElementTypes.FilterMediatorInputConnector_3525); //$NON-NLS-1$
		case ScriptMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?ScriptMediatorInputConnector", EsbElementTypes.ScriptMediatorInputConnector_3548); //$NON-NLS-1$
		case SwitchCaseBranchOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?SwitchCaseBranchOutputConnector", EsbElementTypes.SwitchCaseBranchOutputConnector_3539); //$NON-NLS-1$
		case CacheMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?CacheMediator", EsbElementTypes.CacheMediator_3577); //$NON-NLS-1$
		case PropertyMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?PropertyMediator", EsbElementTypes.PropertyMediator_3512); //$NON-NLS-1$
		case AggregateMediatorOnCompleteOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?AggregateMediatorOnCompleteOutputConnector", EsbElementTypes.AggregateMediatorOnCompleteOutputConnector_3604); //$NON-NLS-1$
		case CacheMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?CacheMediatorOutputConnector", EsbElementTypes.CacheMediatorOutputConnector_3579); //$NON-NLS-1$
		case ThrottleMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?ThrottleMediator", EsbElementTypes.ThrottleMediator_3592); //$NON-NLS-1$
		case FaultMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?FaultMediatorInputConnector", EsbElementTypes.FaultMediatorInputConnector_3551); //$NON-NLS-1$
		case ClassMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?ClassMediatorInputConnector", EsbElementTypes.ClassMediatorInputConnector_3542); //$NON-NLS-1$
		case RuleMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?RuleMediatorInputConnector", EsbElementTypes.RuleMediatorInputConnector_3599); //$NON-NLS-1$
		case EventMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?EventMediator", EsbElementTypes.EventMediator_3531); //$NON-NLS-1$
		case SpringMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?SpringMediator", EsbElementTypes.SpringMediator_3544); //$NON-NLS-1$
		case EnrichMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?EnrichMediator", EsbElementTypes.EnrichMediator_3521); //$NON-NLS-1$
		case SmooksMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?SmooksMediator", EsbElementTypes.SmooksMediator_3565); //$NON-NLS-1$
		case XQueryMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?XQueryMediatorInputConnector", EsbElementTypes.XQueryMediatorInputConnector_3554); //$NON-NLS-1$
		case CommandMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?CommandMediator", EsbElementTypes.CommandMediator_3556); //$NON-NLS-1$
		case XSLTMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?XSLTMediatorOutputConnector", EsbElementTypes.XSLTMediatorOutputConnector_3530); //$NON-NLS-1$
		case LogMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?LogMediator", EsbElementTypes.LogMediator_3501); //$NON-NLS-1$
		case SwitchDefaultBranchOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?SwitchDefaultBranchOutputConnector", EsbElementTypes.SwitchDefaultBranchOutputConnector_3540); //$NON-NLS-1$
		case LogMediatorInputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?LogMediatorInputConnector", EsbElementTypes.LogMediatorInputConnector_3502); //$NON-NLS-1$
		case DBReportMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?DBReportMediatorOutputConnector", EsbElementTypes.DBReportMediatorOutputConnector_3564); //$NON-NLS-1$
		case RMSequenceMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?RMSequenceMediator", EsbElementTypes.RMSequenceMediator_3595); //$NON-NLS-1$
		case HeaderMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?HeaderMediatorOutputConnector", EsbElementTypes.HeaderMediatorOutputConnector_3573); //$NON-NLS-1$
		case EntitlementMediatorOutputConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?EntitlementMediatorOutputConnector", EsbElementTypes.EntitlementMediatorOutputConnector_3536); //$NON-NLS-1$
		case FilterMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?FilterMediator", EsbElementTypes.FilterMediator_3524); //$NON-NLS-1$
		case ClassMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?ClassMediator", EsbElementTypes.ClassMediator_3541); //$NON-NLS-1$
		case XSLTMediatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///org/wso2/carbonstudio/eclipse/gmf/esb?XSLTMediator", EsbElementTypes.XSLTMediator_3528); //$NON-NLS-1$
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
		case ClassMediatorOutputConnectorEditPart.VISUAL_ID:
			return getClassMediatorOutputConnector_3543Text(view);
		case FilterMediatorFailOutputConnectorEditPart.VISUAL_ID:
			return getFilterMediatorFailOutputConnector_3527Text(view);
		case SmooksMediatorInputConnectorEditPart.VISUAL_ID:
			return getSmooksMediatorInputConnector_3566Text(view);
		case EsbSequenceInputConnectorEditPart.VISUAL_ID:
			return getEsbSequenceInputConnector_3517Text(view);
		case CalloutMediatorInputConnectorEditPart.VISUAL_ID:
			return getCalloutMediatorInputConnector_3587Text(view);
		case XQueryMediatorEditPart.VISUAL_ID:
			return getXQueryMediator_3553Text(view);
		case ThrottleMediatorInputConnectorEditPart.VISUAL_ID:
			return getThrottleMediatorInputConnector_3593Text(view);
		case RMSequenceMediatorOutputConnectorEditPart.VISUAL_ID:
			return getRMSequenceMediatorOutputConnector_3597Text(view);
		case FaultMediatorEditPart.VISUAL_ID:
			return getFaultMediator_3550Text(view);
		case CloneMediatorEditPart.VISUAL_ID:
			return getCloneMediator_3574Text(view);
		case SendMediatorInputConnectorEditPart.VISUAL_ID:
			return getSendMediatorInputConnector_3569Text(view);
		case EventMediatorOutputConnectorEditPart.VISUAL_ID:
			return getEventMediatorOutputConnector_3533Text(view);
		case RMSequenceMediatorInputConnectorEditPart.VISUAL_ID:
			return getRMSequenceMediatorInputConnector_3596Text(view);
		case CacheMediatorInputConnectorEditPart.VISUAL_ID:
			return getCacheMediatorInputConnector_3578Text(view);
		case LogMediatorOutputConnectorEditPart.VISUAL_ID:
			return getLogMediatorOutputConnector_3503Text(view);
		case EntitlementMediatorEditPart.VISUAL_ID:
			return getEntitlementMediator_3534Text(view);
		case TransactionMediatorOutputConnectorEditPart.VISUAL_ID:
			return getTransactionMediatorOutputConnector_3591Text(view);
		case XSLTMediatorInputConnectorEditPart.VISUAL_ID:
			return getXSLTMediatorInputConnector_3529Text(view);
		case IterateMediatorEditPart.VISUAL_ID:
			return getIterateMediator_3580Text(view);
		case TransactionMediatorEditPart.VISUAL_ID:
			return getTransactionMediator_3589Text(view);
		case DBReportMediatorInputConnectorEditPart.VISUAL_ID:
			return getDBReportMediatorInputConnector_3563Text(view);
		case SpringMediatorInputConnectorEditPart.VISUAL_ID:
			return getSpringMediatorInputConnector_3545Text(view);
		case HeaderMediatorEditPart.VISUAL_ID:
			return getHeaderMediator_3571Text(view);
		case ScriptMediatorOutputConnectorEditPart.VISUAL_ID:
			return getScriptMediatorOutputConnector_3549Text(view);
		case AggregateMediatorEditPart.VISUAL_ID:
			return getAggregateMediator_3583Text(view);
		case SwitchMediatorEditPart.VISUAL_ID:
			return getSwitchMediator_3537Text(view);
		case EsbSequenceEditPart.VISUAL_ID:
			return getEsbSequence_2501Text(view);
		case SequenceDiagramEditPart.VISUAL_ID:
			return getSequenceDiagram_1000Text(view);
		case IterateMediatorInputConnectorEditPart.VISUAL_ID:
			return getIterateMediatorInputConnector_3581Text(view);
		case DBReportMediatorEditPart.VISUAL_ID:
			return getDBReportMediator_3562Text(view);
		case EventMediatorInputConnectorEditPart.VISUAL_ID:
			return getEventMediatorInputConnector_3532Text(view);
		case CommandMediatorOutputConnectorEditPart.VISUAL_ID:
			return getCommandMediatorOutputConnector_3558Text(view);
		case IterateMediatorOutputConnectorEditPart.VISUAL_ID:
			return getIterateMediatorOutputConnector_3582Text(view);
		case EnrichMediatorInputConnectorEditPart.VISUAL_ID:
			return getEnrichMediatorInputConnector_3522Text(view);
		case EntitlementMediatorInputConnectorEditPart.VISUAL_ID:
			return getEntitlementMediatorInputConnector_3535Text(view);
		case EsbLinkEditPart.VISUAL_ID:
			return getEsbLink_4001Text(view);
		case AggregateMediatorOutputConnectorEditPart.VISUAL_ID:
			return getAggregateMediatorOutputConnector_3585Text(view);
		case DBLookupMediatorInputConnectorEditPart.VISUAL_ID:
			return getDBLookupMediatorInputConnector_3560Text(view);
		case OAuthMediatorEditPart.VISUAL_ID:
			return getOAuthMediator_3601Text(view);
		case CalloutMediatorOutputConnectorEditPart.VISUAL_ID:
			return getCalloutMediatorOutputConnector_3588Text(view);
		case RuleMediatorOutputConnectorEditPart.VISUAL_ID:
			return getRuleMediatorOutputConnector_3600Text(view);
		case DBLookupMediatorEditPart.VISUAL_ID:
			return getDBLookupMediator_3559Text(view);
		case CloneMediatorOutputConnectorEditPart.VISUAL_ID:
			return getCloneMediatorOutputConnector_3576Text(view);
		case ScriptMediatorEditPart.VISUAL_ID:
			return getScriptMediator_3547Text(view);
		case EnrichMediatorOutputConnectorEditPart.VISUAL_ID:
			return getEnrichMediatorOutputConnector_3523Text(view);
		case FaultMediatorOutputConnectorEditPart.VISUAL_ID:
			return getFaultMediatorOutputConnector_3552Text(view);
		case AggregateMediatorInputConnectorEditPart.VISUAL_ID:
			return getAggregateMediatorInputConnector_3584Text(view);
		case ThrottleMediatorOutputConnectorEditPart.VISUAL_ID:
			return getThrottleMediatorOutputConnector_3594Text(view);
		case CloneMediatorInputConnectorEditPart.VISUAL_ID:
			return getCloneMediatorInputConnector_3575Text(view);
		case SendMediatorEditPart.VISUAL_ID:
			return getSendMediator_3568Text(view);
		case TransactionMediatorInputConnectorEditPart.VISUAL_ID:
			return getTransactionMediatorInputConnector_3590Text(view);
		case XQueryMediatorOutputConnectorEditPart.VISUAL_ID:
			return getXQueryMediatorOutputConnector_3555Text(view);
		case DBLookupMediatorOutputConnectorEditPart.VISUAL_ID:
			return getDBLookupMediatorOutputConnector_3561Text(view);
		case SendMediatorOutputConnectorEditPart.VISUAL_ID:
			return getSendMediatorOutputConnector_3570Text(view);
		case PropertyMediatorInputConnectorEditPart.VISUAL_ID:
			return getPropertyMediatorInputConnector_3513Text(view);
		case HeaderMediatorInputConnectorEditPart.VISUAL_ID:
			return getHeaderMediatorInputConnector_3572Text(view);
		case SmooksMediatorOutputConnectorEditPart.VISUAL_ID:
			return getSmooksMediatorOutputConnector_3567Text(view);
		case CalloutMediatorEditPart.VISUAL_ID:
			return getCalloutMediator_3586Text(view);
		case CommandMediatorInputConnectorEditPart.VISUAL_ID:
			return getCommandMediatorInputConnector_3557Text(view);
		case OAuthMediatorInputConnectorEditPart.VISUAL_ID:
			return getOAuthMediatorInputConnector_3602Text(view);
		case RuleMediatorEditPart.VISUAL_ID:
			return getRuleMediator_3598Text(view);
		case PropertyMediatorOutputConnectorEditPart.VISUAL_ID:
			return getPropertyMediatorOutputConnector_3514Text(view);
		case OAuthMediatorOutputConnectorEditPart.VISUAL_ID:
			return getOAuthMediatorOutputConnector_3603Text(view);
		case DropMediatorInputConnectorEditPart.VISUAL_ID:
			return getDropMediatorInputConnector_3520Text(view);
		case FilterMediatorPassOutputConnectorEditPart.VISUAL_ID:
			return getFilterMediatorPassOutputConnector_3526Text(view);
		case SwitchMediatorInputConnectorEditPart.VISUAL_ID:
			return getSwitchMediatorInputConnector_3538Text(view);
		case SpringMediatorOutputConnectorEditPart.VISUAL_ID:
			return getSpringMediatorOutputConnector_3546Text(view);
		case DropMediatorEditPart.VISUAL_ID:
			return getDropMediator_3519Text(view);
		case EsbSequenceOutputConnectorEditPart.VISUAL_ID:
			return getEsbSequenceOutputConnector_3518Text(view);
		case FilterMediatorInputConnectorEditPart.VISUAL_ID:
			return getFilterMediatorInputConnector_3525Text(view);
		case ScriptMediatorInputConnectorEditPart.VISUAL_ID:
			return getScriptMediatorInputConnector_3548Text(view);
		case SwitchCaseBranchOutputConnectorEditPart.VISUAL_ID:
			return getSwitchCaseBranchOutputConnector_3539Text(view);
		case CacheMediatorEditPart.VISUAL_ID:
			return getCacheMediator_3577Text(view);
		case PropertyMediatorEditPart.VISUAL_ID:
			return getPropertyMediator_3512Text(view);
		case AggregateMediatorOnCompleteOutputConnectorEditPart.VISUAL_ID:
			return getAggregateMediatorOnCompleteOutputConnector_3604Text(view);
		case CacheMediatorOutputConnectorEditPart.VISUAL_ID:
			return getCacheMediatorOutputConnector_3579Text(view);
		case ThrottleMediatorEditPart.VISUAL_ID:
			return getThrottleMediator_3592Text(view);
		case FaultMediatorInputConnectorEditPart.VISUAL_ID:
			return getFaultMediatorInputConnector_3551Text(view);
		case ClassMediatorInputConnectorEditPart.VISUAL_ID:
			return getClassMediatorInputConnector_3542Text(view);
		case RuleMediatorInputConnectorEditPart.VISUAL_ID:
			return getRuleMediatorInputConnector_3599Text(view);
		case EventMediatorEditPart.VISUAL_ID:
			return getEventMediator_3531Text(view);
		case SpringMediatorEditPart.VISUAL_ID:
			return getSpringMediator_3544Text(view);
		case EnrichMediatorEditPart.VISUAL_ID:
			return getEnrichMediator_3521Text(view);
		case SmooksMediatorEditPart.VISUAL_ID:
			return getSmooksMediator_3565Text(view);
		case XQueryMediatorInputConnectorEditPart.VISUAL_ID:
			return getXQueryMediatorInputConnector_3554Text(view);
		case CommandMediatorEditPart.VISUAL_ID:
			return getCommandMediator_3556Text(view);
		case XSLTMediatorOutputConnectorEditPart.VISUAL_ID:
			return getXSLTMediatorOutputConnector_3530Text(view);
		case LogMediatorEditPart.VISUAL_ID:
			return getLogMediator_3501Text(view);
		case SwitchDefaultBranchOutputConnectorEditPart.VISUAL_ID:
			return getSwitchDefaultBranchOutputConnector_3540Text(view);
		case LogMediatorInputConnectorEditPart.VISUAL_ID:
			return getLogMediatorInputConnector_3502Text(view);
		case DBReportMediatorOutputConnectorEditPart.VISUAL_ID:
			return getDBReportMediatorOutputConnector_3564Text(view);
		case RMSequenceMediatorEditPart.VISUAL_ID:
			return getRMSequenceMediator_3595Text(view);
		case HeaderMediatorOutputConnectorEditPart.VISUAL_ID:
			return getHeaderMediatorOutputConnector_3573Text(view);
		case EntitlementMediatorOutputConnectorEditPart.VISUAL_ID:
			return getEntitlementMediatorOutputConnector_3536Text(view);
		case FilterMediatorEditPart.VISUAL_ID:
			return getFilterMediator_3524Text(view);
		case ClassMediatorEditPart.VISUAL_ID:
			return getClassMediator_3541Text(view);
		case XSLTMediatorEditPart.VISUAL_ID:
			return getXSLTMediator_3528Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getDBReportMediatorOutputConnector_3564Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getScriptMediatorInputConnector_3548Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getSwitchCaseBranchOutputConnector_3539Text(View view) {
		SwitchCaseBranchOutputConnector domainModelElement = (SwitchCaseBranchOutputConnector) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getCaseRegex();
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3539); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getClassMediatorOutputConnector_3543Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getOAuthMediatorInputConnector_3602Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getSmooksMediatorOutputConnector_3567Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getEntitlementMediator_3534Text(View view) {
		IParser parser = EsbParserProvider
				.getParser(
						EsbElementTypes.EntitlementMediator_3534,
						view.getElement() != null ? view.getElement() : view,
						EsbVisualIDRegistry
								.getType(EntitlementMediatorServerURLEditPart.VISUAL_ID));
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
	private String getRuleMediatorInputConnector_3599Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getCommandMediatorOutputConnector_3558Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getLogMediatorOutputConnector_3503Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getEsbSequenceOutputConnector_3518Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getCloneMediatorOutputConnector_3576Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getFaultMediator_3550Text(View view) {
		IParser parser = EsbParserProvider
				.getParser(
						EsbElementTypes.FaultMediator_3550,
						view.getElement() != null ? view.getElement() : view,
						EsbVisualIDRegistry
								.getType(FaultMediatorFaultStringTypeEditPart.VISUAL_ID));
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
	private String getCloneMediator_3574Text(View view) {
		IParser parser = EsbParserProvider.getParser(
				EsbElementTypes.CloneMediator_3574,
				view.getElement() != null ? view.getElement() : view,
				EsbVisualIDRegistry
						.getType(CloneMediatorCloneIDEditPart.VISUAL_ID));
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
	private String getHeaderMediatorInputConnector_3572Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getXQueryMediatorOutputConnector_3555Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getEntitlementMediatorOutputConnector_3536Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getDBReportMediatorInputConnector_3563Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getFilterMediatorPassOutputConnector_3526Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getDBLookupMediator_3559Text(View view) {
		IParser parser = EsbParserProvider
				.getParser(
						EsbElementTypes.DBLookupMediator_3559,
						view.getElement() != null ? view.getElement() : view,
						EsbVisualIDRegistry
								.getType(DBLookupMediatorConnectionURLEditPart.VISUAL_ID));
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
	private String getCloneMediatorInputConnector_3575Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getScriptMediatorOutputConnector_3549Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getEntitlementMediatorInputConnector_3535Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getEventMediatorOutputConnector_3533Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getDBReportMediator_3562Text(View view) {
		IParser parser = EsbParserProvider
				.getParser(
						EsbElementTypes.DBReportMediator_3562,
						view.getElement() != null ? view.getElement() : view,
						EsbVisualIDRegistry
								.getType(DBReportMediatorConnectionURLEditPart.VISUAL_ID));
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
	private String getOAuthMediatorOutputConnector_3603Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getThrottleMediatorInputConnector_3593Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getFaultMediatorInputConnector_3551Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getSwitchDefaultBranchOutputConnector_3540Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getSwitchMediatorInputConnector_3538Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getAggregateMediatorInputConnector_3584Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getSpringMediator_3544Text(View view) {
		IParser parser = EsbParserProvider.getParser(
				EsbElementTypes.SpringMediator_3544,
				view.getElement() != null ? view.getElement() : view,
				EsbVisualIDRegistry
						.getType(SpringMediatorBeanNameEditPart.VISUAL_ID));
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
	private String getAggregateMediator_3583Text(View view) {
		IParser parser = EsbParserProvider
				.getParser(
						EsbElementTypes.AggregateMediator_3583,
						view.getElement() != null ? view.getElement() : view,
						EsbVisualIDRegistry
								.getType(AggregateMediatorAggregateIDEditPart.VISUAL_ID));
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
	private String getCommandMediatorInputConnector_3557Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getRuleMediatorOutputConnector_3600Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getRuleMediator_3598Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getPropertyMediatorOutputConnector_3514Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getLogMediator_3501Text(View view) {
		IParser parser = EsbParserProvider.getParser(
				EsbElementTypes.LogMediator_3501,
				view.getElement() != null ? view.getElement() : view,
				EsbVisualIDRegistry
						.getType(LogMediatorLogCategoryEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getScriptMediator_3547Text(View view) {
		IParser parser = EsbParserProvider
				.getParser(
						EsbElementTypes.ScriptMediator_3547,
						view.getElement() != null ? view.getElement() : view,
						EsbVisualIDRegistry
								.getType(ScriptMediatorScriptLanguageEditPart.VISUAL_ID));
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
	private String getCalloutMediatorOutputConnector_3588Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getClassMediator_3541Text(View view) {
		IParser parser = EsbParserProvider.getParser(
				EsbElementTypes.ClassMediator_3541,
				view.getElement() != null ? view.getElement() : view,
				EsbVisualIDRegistry
						.getType(ClassMediatorClassNameEditPart.VISUAL_ID));
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
	private String getSmooksMediator_3565Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getCalloutMediatorInputConnector_3587Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getEsbSequence_2501Text(View view) {
		EsbSequence domainModelElement = (EsbSequence) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2501); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getFilterMediator_3524Text(View view) {
		IParser parser = EsbParserProvider
				.getParser(
						EsbElementTypes.FilterMediator_3524,
						view.getElement() != null ? view.getElement() : view,
						EsbVisualIDRegistry
								.getType(FilterMediatorConditionTypeEditPart.VISUAL_ID));
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
	private String getRMSequenceMediator_3595Text(View view) {
		RMSequenceMediator domainModelElement = (RMSequenceMediator) view
				.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getRmSpecVersion());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3595); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSpringMediatorOutputConnector_3546Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getIterateMediatorInputConnector_3581Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getThrottleMediatorOutputConnector_3594Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getCacheMediatorOutputConnector_3579Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getEventMediator_3531Text(View view) {
		IParser parser = EsbParserProvider.getParser(
				EsbElementTypes.EventMediator_3531,
				view.getElement() != null ? view.getElement() : view,
				EsbVisualIDRegistry
						.getType(EventMediatorTopicTypeEditPart.VISUAL_ID));
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
	private String getEsbSequenceInputConnector_3517Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getXQueryMediatorInputConnector_3554Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getPropertyMediatorInputConnector_3513Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getSendMediator_3568Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getFaultMediatorOutputConnector_3552Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getSmooksMediatorInputConnector_3566Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getLogMediatorInputConnector_3502Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getCalloutMediator_3586Text(View view) {
		IParser parser = EsbParserProvider.getParser(
				EsbElementTypes.CalloutMediator_3586,
				view.getElement() != null ? view.getElement() : view,
				EsbVisualIDRegistry
						.getType(CalloutMediatorSoapActionEditPart.VISUAL_ID));
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
	private String getFilterMediatorFailOutputConnector_3527Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getRMSequenceMediatorInputConnector_3596Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getSendMediatorOutputConnector_3570Text(View view) {
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
	private String getTransactionMediatorInputConnector_3590Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getPropertyMediator_3512Text(View view) {
		IParser parser = EsbParserProvider
				.getParser(
						EsbElementTypes.PropertyMediator_3512,
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
	private String getAggregateMediatorOnCompleteOutputConnector_3604Text(
			View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getSendMediatorInputConnector_3569Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getXSLTMediatorOutputConnector_3530Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getSequenceDiagram_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getCommandMediator_3556Text(View view) {
		IParser parser = EsbParserProvider.getParser(
				EsbElementTypes.CommandMediator_3556,
				view.getElement() != null ? view.getElement() : view,
				EsbVisualIDRegistry
						.getType(CommandMediatorClassNameEditPart.VISUAL_ID));
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
	private String getXSLTMediator_3528Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getThrottleMediator_3592Text(View view) {
		IParser parser = EsbParserProvider.getParser(
				EsbElementTypes.ThrottleMediator_3592,
				view.getElement() != null ? view.getElement() : view,
				EsbVisualIDRegistry
						.getType(ThrottleMediatorGroupIdEditPart.VISUAL_ID));
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
	private String getOAuthMediator_3601Text(View view) {
		IParser parser = EsbParserProvider
				.getParser(
						EsbElementTypes.OAuthMediator_3601,
						view.getElement() != null ? view.getElement() : view,
						EsbVisualIDRegistry
								.getType(OAuthMediatorRemoteServiceUrlEditPart.VISUAL_ID));
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
	private String getAggregateMediatorOutputConnector_3585Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getEnrichMediatorInputConnector_3522Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getHeaderMediator_3571Text(View view) {
		IParser parser = EsbParserProvider.getParser(
				EsbElementTypes.HeaderMediator_3571,
				view.getElement() != null ? view.getElement() : view,
				EsbVisualIDRegistry
						.getType(HeaderMediatorValueLiteralEditPart.VISUAL_ID));
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
	private String getDropMediator_3519Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getSwitchMediator_3537Text(View view) {
		SwitchMediator domainModelElement = (SwitchMediator) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getNamespace();
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3537); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEnrichMediator_3521Text(View view) {
		IParser parser = EsbParserProvider.getParser(
				EsbElementTypes.EnrichMediator_3521,
				view.getElement() != null ? view.getElement() : view,
				EsbVisualIDRegistry
						.getType(EnrichMediatorSourceTypeEditPart.VISUAL_ID));
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
	private String getXQueryMediator_3553Text(View view) {
		IParser parser = EsbParserProvider
				.getParser(
						EsbElementTypes.XQueryMediator_3553,
						view.getElement() != null ? view.getElement() : view,
						EsbVisualIDRegistry
								.getType(XQueryMediatorScriptKeyTypeEditPart.VISUAL_ID));
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
	private String getFilterMediatorInputConnector_3525Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getXSLTMediatorInputConnector_3529Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getCacheMediatorInputConnector_3578Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getClassMediatorInputConnector_3542Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getDropMediatorInputConnector_3520Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getTransactionMediatorOutputConnector_3591Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getSpringMediatorInputConnector_3545Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getHeaderMediatorOutputConnector_3573Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getEventMediatorInputConnector_3532Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getIterateMediatorOutputConnector_3582Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getRMSequenceMediatorOutputConnector_3597Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getDBLookupMediatorOutputConnector_3561Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getEnrichMediatorOutputConnector_3523Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getTransactionMediator_3589Text(View view) {
		TransactionMediator domainModelElement = (TransactionMediator) view
				.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getAction());
		} else {
			EsbDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3589); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIterateMediator_3580Text(View view) {
		IParser parser = EsbParserProvider.getParser(
				EsbElementTypes.IterateMediator_3580,
				view.getElement() != null ? view.getElement() : view,
				EsbVisualIDRegistry
						.getType(IterateMediatorIterateIDEditPart.VISUAL_ID));
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
	private String getCacheMediator_3577Text(View view) {
		IParser parser = EsbParserProvider.getParser(
				EsbElementTypes.CacheMediator_3577,
				view.getElement() != null ? view.getElement() : view,
				EsbVisualIDRegistry
						.getType(CacheMediatorCacheIdEditPart.VISUAL_ID));
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
	private String getDBLookupMediatorInputConnector_3560Text(View view) {
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
		return SequenceDiagramEditPart.MODEL_ID.equals(EsbVisualIDRegistry
				.getModelID(view));
	}

}
