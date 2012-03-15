package org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts;

import org.eclipse.draw2d.FigureUtilities;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.part.EsbVisualIDRegistry;

/**
 * @generated
 */
public class EsbEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (EsbVisualIDRegistry.getVisualID(view)) {

			case EsbDiagramEditPart.VISUAL_ID:
				return new EsbDiagramEditPart(view);

			case EsbServerEditPart.VISUAL_ID:
				return new EsbServerEditPart(view);

			case ProxyServiceEditPart.VISUAL_ID:
				return new ProxyServiceEditPart(view);

			case ProxyServiceNameEditPart.VISUAL_ID:
				return new ProxyServiceNameEditPart(view);

			case ProxyOutputConnectorEditPart.VISUAL_ID:
				return new ProxyOutputConnectorEditPart(view);

			case ProxyInputConnectorEditPart.VISUAL_ID:
				return new ProxyInputConnectorEditPart(view);

			case ProxyServiceSequenceContainerEditPart.VISUAL_ID:
				return new ProxyServiceSequenceContainerEditPart(view);

			case ProxyServiceInSequenceEditPart.VISUAL_ID:
				return new ProxyServiceInSequenceEditPart(view);

			case DropMediator3EditPart.VISUAL_ID:
				return new DropMediator3EditPart(view);

			case DropMediatorInputConnectorEditPart.VISUAL_ID:
				return new DropMediatorInputConnectorEditPart(view);

			case PropertyMediator3EditPart.VISUAL_ID:
				return new PropertyMediator3EditPart(view);

			case PropertyMediatorPropertyName3EditPart.VISUAL_ID:
				return new PropertyMediatorPropertyName3EditPart(view);

			case PropertyMediatorInputConnectorEditPart.VISUAL_ID:
				return new PropertyMediatorInputConnectorEditPart(view);

			case PropertyMediatorOutputConnectorEditPart.VISUAL_ID:
				return new PropertyMediatorOutputConnectorEditPart(view);

			case ThrottleMediatorEditPart.VISUAL_ID:
				return new ThrottleMediatorEditPart(view);

			case ThrottleMediatorGroupIdEditPart.VISUAL_ID:
				return new ThrottleMediatorGroupIdEditPart(view);

			case ThrottleMediatorInputConnectorEditPart.VISUAL_ID:
				return new ThrottleMediatorInputConnectorEditPart(view);

			case ThrottleMediatorOutputConnectorEditPart.VISUAL_ID:
				return new ThrottleMediatorOutputConnectorEditPart(view);

			case FilterMediatorEditPart.VISUAL_ID:
				return new FilterMediatorEditPart(view);

			case FilterMediatorConditionTypeEditPart.VISUAL_ID:
				return new FilterMediatorConditionTypeEditPart(view);

			case FilterMediatorInputConnectorEditPart.VISUAL_ID:
				return new FilterMediatorInputConnectorEditPart(view);

			case FilterMediatorPassOutputConnectorEditPart.VISUAL_ID:
				return new FilterMediatorPassOutputConnectorEditPart(view);

			case FilterMediatorFailOutputConnectorEditPart.VISUAL_ID:
				return new FilterMediatorFailOutputConnectorEditPart(view);

			case LogMediatorEditPart.VISUAL_ID:
				return new LogMediatorEditPart(view);

			case LogMediatorLogCategoryEditPart.VISUAL_ID:
				return new LogMediatorLogCategoryEditPart(view);

			case LogMediatorInputConnectorEditPart.VISUAL_ID:
				return new LogMediatorInputConnectorEditPart(view);

			case LogMediatorOutputConnectorEditPart.VISUAL_ID:
				return new LogMediatorOutputConnectorEditPart(view);

			case EnrichMediatorEditPart.VISUAL_ID:
				return new EnrichMediatorEditPart(view);

			case EnrichMediatorSourceTypeEditPart.VISUAL_ID:
				return new EnrichMediatorSourceTypeEditPart(view);

			case EnrichMediatorInputConnectorEditPart.VISUAL_ID:
				return new EnrichMediatorInputConnectorEditPart(view);

			case EnrichMediatorOutputConnectorEditPart.VISUAL_ID:
				return new EnrichMediatorOutputConnectorEditPart(view);

			case XSLTMediatorEditPart.VISUAL_ID:
				return new XSLTMediatorEditPart(view);

			case XSLTMediatorInputConnectorEditPart.VISUAL_ID:
				return new XSLTMediatorInputConnectorEditPart(view);

			case XSLTMediatorOutputConnectorEditPart.VISUAL_ID:
				return new XSLTMediatorOutputConnectorEditPart(view);

			case SwitchMediatorEditPart.VISUAL_ID:
				return new SwitchMediatorEditPart(view);

			case SwitchMediatorInputConnectorEditPart.VISUAL_ID:
				return new SwitchMediatorInputConnectorEditPart(view);

			case SwitchCaseBranchOutputConnectorEditPart.VISUAL_ID:
				return new SwitchCaseBranchOutputConnectorEditPart(view);

			case SwitchDefaultBranchOutputConnectorEditPart.VISUAL_ID:
				return new SwitchDefaultBranchOutputConnectorEditPart(view);

			case SequenceEditPart.VISUAL_ID:
				return new SequenceEditPart(view);

			case SequenceNameEditPart.VISUAL_ID:
				return new SequenceNameEditPart(view);

			case SequenceInputConnectorEditPart.VISUAL_ID:
				return new SequenceInputConnectorEditPart(view);

			case SequenceOutputConnectorEditPart.VISUAL_ID:
				return new SequenceOutputConnectorEditPart(view);

			case EventMediatorEditPart.VISUAL_ID:
				return new EventMediatorEditPart(view);

			case EventMediatorTopicTypeEditPart.VISUAL_ID:
				return new EventMediatorTopicTypeEditPart(view);

			case EventMediatorInputConnectorEditPart.VISUAL_ID:
				return new EventMediatorInputConnectorEditPart(view);

			case EventMediatorOutputConnectorEditPart.VISUAL_ID:
				return new EventMediatorOutputConnectorEditPart(view);

			case EntitlementMediatorEditPart.VISUAL_ID:
				return new EntitlementMediatorEditPart(view);

			case EntitlementMediatorServerURLEditPart.VISUAL_ID:
				return new EntitlementMediatorServerURLEditPart(view);

			case EntitlementMediatorInputConnectorEditPart.VISUAL_ID:
				return new EntitlementMediatorInputConnectorEditPart(view);

			case EntitlementMediatorOutputConnectorEditPart.VISUAL_ID:
				return new EntitlementMediatorOutputConnectorEditPart(view);

			case ClassMediatorEditPart.VISUAL_ID:
				return new ClassMediatorEditPart(view);

			case ClassMediatorClassNameEditPart.VISUAL_ID:
				return new ClassMediatorClassNameEditPart(view);

			case ClassMediatorInputConnectorEditPart.VISUAL_ID:
				return new ClassMediatorInputConnectorEditPart(view);

			case ClassMediatorOutputConnectorEditPart.VISUAL_ID:
				return new ClassMediatorOutputConnectorEditPart(view);

			case SpringMediatorEditPart.VISUAL_ID:
				return new SpringMediatorEditPart(view);

			case SpringMediatorBeanNameEditPart.VISUAL_ID:
				return new SpringMediatorBeanNameEditPart(view);

			case SpringMediatorInputConnectorEditPart.VISUAL_ID:
				return new SpringMediatorInputConnectorEditPart(view);

			case SpringMediatorOutputConnectorEditPart.VISUAL_ID:
				return new SpringMediatorOutputConnectorEditPart(view);

			case ScriptMediatorEditPart.VISUAL_ID:
				return new ScriptMediatorEditPart(view);

			case ScriptMediatorScriptLanguageEditPart.VISUAL_ID:
				return new ScriptMediatorScriptLanguageEditPart(view);

			case ScriptMediatorInputConnectorEditPart.VISUAL_ID:
				return new ScriptMediatorInputConnectorEditPart(view);

			case ScriptMediatorOutputConnectorEditPart.VISUAL_ID:
				return new ScriptMediatorOutputConnectorEditPart(view);

			case FaultMediatorEditPart.VISUAL_ID:
				return new FaultMediatorEditPart(view);

			case FaultMediatorFaultStringTypeEditPart.VISUAL_ID:
				return new FaultMediatorFaultStringTypeEditPart(view);

			case FaultMediatorInputConnectorEditPart.VISUAL_ID:
				return new FaultMediatorInputConnectorEditPart(view);

			case FaultMediatorOutputConnectorEditPart.VISUAL_ID:
				return new FaultMediatorOutputConnectorEditPart(view);

			case XQueryMediatorEditPart.VISUAL_ID:
				return new XQueryMediatorEditPart(view);

			case XQueryMediatorScriptKeyTypeEditPart.VISUAL_ID:
				return new XQueryMediatorScriptKeyTypeEditPart(view);

			case XQueryMediatorInputConnectorEditPart.VISUAL_ID:
				return new XQueryMediatorInputConnectorEditPart(view);

			case XQueryMediatorOutputConnectorEditPart.VISUAL_ID:
				return new XQueryMediatorOutputConnectorEditPart(view);

			case CommandMediatorEditPart.VISUAL_ID:
				return new CommandMediatorEditPart(view);

			case CommandMediatorClassNameEditPart.VISUAL_ID:
				return new CommandMediatorClassNameEditPart(view);

			case CommandMediatorInputConnectorEditPart.VISUAL_ID:
				return new CommandMediatorInputConnectorEditPart(view);

			case CommandMediatorOutputConnectorEditPart.VISUAL_ID:
				return new CommandMediatorOutputConnectorEditPart(view);

			case DBLookupMediatorEditPart.VISUAL_ID:
				return new DBLookupMediatorEditPart(view);

			case DBLookupMediatorConnectionURLEditPart.VISUAL_ID:
				return new DBLookupMediatorConnectionURLEditPart(view);

			case DBLookupMediatorInputConnectorEditPart.VISUAL_ID:
				return new DBLookupMediatorInputConnectorEditPart(view);

			case DBLookupMediatorOutputConnectorEditPart.VISUAL_ID:
				return new DBLookupMediatorOutputConnectorEditPart(view);

			case DBReportMediatorEditPart.VISUAL_ID:
				return new DBReportMediatorEditPart(view);

			case DBReportMediatorConnectionURLEditPart.VISUAL_ID:
				return new DBReportMediatorConnectionURLEditPart(view);

			case DBReportMediatorInputConnectorEditPart.VISUAL_ID:
				return new DBReportMediatorInputConnectorEditPart(view);

			case DBReportMediatorOutputConnectorEditPart.VISUAL_ID:
				return new DBReportMediatorOutputConnectorEditPart(view);

			case SmooksMediatorEditPart.VISUAL_ID:
				return new SmooksMediatorEditPart(view);

			case SmooksMediatorInputConnectorEditPart.VISUAL_ID:
				return new SmooksMediatorInputConnectorEditPart(view);

			case SmooksMediatorOutputConnectorEditPart.VISUAL_ID:
				return new SmooksMediatorOutputConnectorEditPart(view);

			case SendMediatorEditPart.VISUAL_ID:
				return new SendMediatorEditPart(view);

			case SendMediatorInputConnectorEditPart.VISUAL_ID:
				return new SendMediatorInputConnectorEditPart(view);

			case SendMediatorOutputConnectorEditPart.VISUAL_ID:
				return new SendMediatorOutputConnectorEditPart(view);

			case HeaderMediatorEditPart.VISUAL_ID:
				return new HeaderMediatorEditPart(view);

			case HeaderMediatorValueLiteralEditPart.VISUAL_ID:
				return new HeaderMediatorValueLiteralEditPart(view);

			case HeaderMediatorInputConnectorEditPart.VISUAL_ID:
				return new HeaderMediatorInputConnectorEditPart(view);

			case HeaderMediatorOutputConnectorEditPart.VISUAL_ID:
				return new HeaderMediatorOutputConnectorEditPart(view);

			case CloneMediatorEditPart.VISUAL_ID:
				return new CloneMediatorEditPart(view);

			case CloneMediatorCloneIDEditPart.VISUAL_ID:
				return new CloneMediatorCloneIDEditPart(view);

			case CloneMediatorInputConnectorEditPart.VISUAL_ID:
				return new CloneMediatorInputConnectorEditPart(view);

			case CloneMediatorOutputConnectorEditPart.VISUAL_ID:
				return new CloneMediatorOutputConnectorEditPart(view);

			case CloneMediatorTargetOutputConnectorEditPart.VISUAL_ID:
				return new CloneMediatorTargetOutputConnectorEditPart(view);

			case CacheMediatorEditPart.VISUAL_ID:
				return new CacheMediatorEditPart(view);

			case CacheMediatorCacheIdEditPart.VISUAL_ID:
				return new CacheMediatorCacheIdEditPart(view);

			case CacheMediatorInputConnectorEditPart.VISUAL_ID:
				return new CacheMediatorInputConnectorEditPart(view);

			case CacheMediatorOutputConnectorEditPart.VISUAL_ID:
				return new CacheMediatorOutputConnectorEditPart(view);

			case IterateMediatorEditPart.VISUAL_ID:
				return new IterateMediatorEditPart(view);

			case IterateMediatorIterateIDEditPart.VISUAL_ID:
				return new IterateMediatorIterateIDEditPart(view);

			case IterateMediatorInputConnectorEditPart.VISUAL_ID:
				return new IterateMediatorInputConnectorEditPart(view);

			case IterateMediatorOutputConnectorEditPart.VISUAL_ID:
				return new IterateMediatorOutputConnectorEditPart(view);

			case CalloutMediatorEditPart.VISUAL_ID:
				return new CalloutMediatorEditPart(view);

			case CalloutMediatorSoapActionEditPart.VISUAL_ID:
				return new CalloutMediatorSoapActionEditPart(view);

			case CalloutMediatorInputConnectorEditPart.VISUAL_ID:
				return new CalloutMediatorInputConnectorEditPart(view);

			case CalloutMediatorOutputConnectorEditPart.VISUAL_ID:
				return new CalloutMediatorOutputConnectorEditPart(view);

			case TransactionMediatorEditPart.VISUAL_ID:
				return new TransactionMediatorEditPart(view);

			case TransactionMediatorInputConnectorEditPart.VISUAL_ID:
				return new TransactionMediatorInputConnectorEditPart(view);

			case TransactionMediatorOutputConnectorEditPart.VISUAL_ID:
				return new TransactionMediatorOutputConnectorEditPart(view);

			case RMSequenceMediatorEditPart.VISUAL_ID:
				return new RMSequenceMediatorEditPart(view);

			case RMSequenceMediatorInputConnectorEditPart.VISUAL_ID:
				return new RMSequenceMediatorInputConnectorEditPart(view);

			case RMSequenceMediatorOutputConnectorEditPart.VISUAL_ID:
				return new RMSequenceMediatorOutputConnectorEditPart(view);

			case RuleMediatorEditPart.VISUAL_ID:
				return new RuleMediatorEditPart(view);

			case RuleMediatorInputConnectorEditPart.VISUAL_ID:
				return new RuleMediatorInputConnectorEditPart(view);

			case RuleMediatorOutputConnectorEditPart.VISUAL_ID:
				return new RuleMediatorOutputConnectorEditPart(view);

			case OAuthMediatorEditPart.VISUAL_ID:
				return new OAuthMediatorEditPart(view);

			case OAuthMediatorRemoteServiceUrlEditPart.VISUAL_ID:
				return new OAuthMediatorRemoteServiceUrlEditPart(view);

			case OAuthMediatorInputConnectorEditPart.VISUAL_ID:
				return new OAuthMediatorInputConnectorEditPart(view);

			case OAuthMediatorOutputConnectorEditPart.VISUAL_ID:
				return new OAuthMediatorOutputConnectorEditPart(view);

			case AggregateMediatorEditPart.VISUAL_ID:
				return new AggregateMediatorEditPart(view);

			case AggregateMediatorAggregateIDEditPart.VISUAL_ID:
				return new AggregateMediatorAggregateIDEditPart(view);

			case AggregateMediatorInputConnectorEditPart.VISUAL_ID:
				return new AggregateMediatorInputConnectorEditPart(view);

			case AggregateMediatorOutputConnectorEditPart.VISUAL_ID:
				return new AggregateMediatorOutputConnectorEditPart(view);

			case AggregateMediatorOnCompleteOutputConnectorEditPart.VISUAL_ID:
				return new AggregateMediatorOnCompleteOutputConnectorEditPart(
						view);

			case LogMediator2EditPart.VISUAL_ID:
				return new LogMediator2EditPart(view);

			case LogMediatorLogCategory2EditPart.VISUAL_ID:
				return new LogMediatorLogCategory2EditPart(view);

			case LogMediatorInputConnector2EditPart.VISUAL_ID:
				return new LogMediatorInputConnector2EditPart(view);

			case LogMediatorOutputConnector2EditPart.VISUAL_ID:
				return new LogMediatorOutputConnector2EditPart(view);

			case DropMediator2EditPart.VISUAL_ID:
				return new DropMediator2EditPart(view);

			case DropMediatorInputConnector2EditPart.VISUAL_ID:
				return new DropMediatorInputConnector2EditPart(view);

			case FilterMediator2EditPart.VISUAL_ID:
				return new FilterMediator2EditPart(view);

			case FilterMediatorConditionType2EditPart.VISUAL_ID:
				return new FilterMediatorConditionType2EditPart(view);

			case FilterMediatorInputConnector2EditPart.VISUAL_ID:
				return new FilterMediatorInputConnector2EditPart(view);

			case FilterMediatorPassOutputConnector2EditPart.VISUAL_ID:
				return new FilterMediatorPassOutputConnector2EditPart(view);

			case FilterMediatorFailOutputConnector2EditPart.VISUAL_ID:
				return new FilterMediatorFailOutputConnector2EditPart(view);

			case PropertyMediator2EditPart.VISUAL_ID:
				return new PropertyMediator2EditPart(view);

			case PropertyMediatorPropertyName2EditPart.VISUAL_ID:
				return new PropertyMediatorPropertyName2EditPart(view);

			case PropertyMediatorInputConnector2EditPart.VISUAL_ID:
				return new PropertyMediatorInputConnector2EditPart(view);

			case PropertyMediatorOutputConnector2EditPart.VISUAL_ID:
				return new PropertyMediatorOutputConnector2EditPart(view);

			case EnrichMediator2EditPart.VISUAL_ID:
				return new EnrichMediator2EditPart(view);

			case EnrichMediatorSourceType2EditPart.VISUAL_ID:
				return new EnrichMediatorSourceType2EditPart(view);

			case EnrichMediatorInputConnector2EditPart.VISUAL_ID:
				return new EnrichMediatorInputConnector2EditPart(view);

			case EnrichMediatorOutputConnector2EditPart.VISUAL_ID:
				return new EnrichMediatorOutputConnector2EditPart(view);

			case XSLTMediator2EditPart.VISUAL_ID:
				return new XSLTMediator2EditPart(view);

			case XSLTMediatorInputConnector2EditPart.VISUAL_ID:
				return new XSLTMediatorInputConnector2EditPart(view);

			case XSLTMediatorOutputConnector2EditPart.VISUAL_ID:
				return new XSLTMediatorOutputConnector2EditPart(view);

			case SwitchMediator2EditPart.VISUAL_ID:
				return new SwitchMediator2EditPart(view);

			case SwitchMediatorInputConnector2EditPart.VISUAL_ID:
				return new SwitchMediatorInputConnector2EditPart(view);

			case SwitchCaseBranchOutputConnector2EditPart.VISUAL_ID:
				return new SwitchCaseBranchOutputConnector2EditPart(view);

			case SwitchDefaultBranchOutputConnector2EditPart.VISUAL_ID:
				return new SwitchDefaultBranchOutputConnector2EditPart(view);

			case FaultMediator2EditPart.VISUAL_ID:
				return new FaultMediator2EditPart(view);

			case FaultMediatorFaultStringType2EditPart.VISUAL_ID:
				return new FaultMediatorFaultStringType2EditPart(view);

			case FaultMediatorInputConnector2EditPart.VISUAL_ID:
				return new FaultMediatorInputConnector2EditPart(view);

			case FaultMediatorOutputConnector2EditPart.VISUAL_ID:
				return new FaultMediatorOutputConnector2EditPart(view);

			case DBLookupMediator2EditPart.VISUAL_ID:
				return new DBLookupMediator2EditPart(view);

			case DBLookupMediatorConnectionURL2EditPart.VISUAL_ID:
				return new DBLookupMediatorConnectionURL2EditPart(view);

			case DBLookupMediatorInputConnector2EditPart.VISUAL_ID:
				return new DBLookupMediatorInputConnector2EditPart(view);

			case DBLookupMediatorOutputConnector2EditPart.VISUAL_ID:
				return new DBLookupMediatorOutputConnector2EditPart(view);

			case DBReportMediator2EditPart.VISUAL_ID:
				return new DBReportMediator2EditPart(view);

			case DBReportMediatorConnectionURL2EditPart.VISUAL_ID:
				return new DBReportMediatorConnectionURL2EditPart(view);

			case DBReportMediatorInputConnector2EditPart.VISUAL_ID:
				return new DBReportMediatorInputConnector2EditPart(view);

			case DBReportMediatorOutputConnector2EditPart.VISUAL_ID:
				return new DBReportMediatorOutputConnector2EditPart(view);

			case SendMediator2EditPart.VISUAL_ID:
				return new SendMediator2EditPart(view);

			case SendMediatorInputConnector2EditPart.VISUAL_ID:
				return new SendMediatorInputConnector2EditPart(view);

			case SendMediatorOutputConnector2EditPart.VISUAL_ID:
				return new SendMediatorOutputConnector2EditPart(view);

			case HeaderMediator2EditPart.VISUAL_ID:
				return new HeaderMediator2EditPart(view);

			case HeaderMediatorValueLiteral2EditPart.VISUAL_ID:
				return new HeaderMediatorValueLiteral2EditPart(view);

			case HeaderMediatorInputConnector2EditPart.VISUAL_ID:
				return new HeaderMediatorInputConnector2EditPart(view);

			case HeaderMediatorOutputConnector2EditPart.VISUAL_ID:
				return new HeaderMediatorOutputConnector2EditPart(view);

			case CloneMediator2EditPart.VISUAL_ID:
				return new CloneMediator2EditPart(view);

			case CloneMediatorCloneID2EditPart.VISUAL_ID:
				return new CloneMediatorCloneID2EditPart(view);

			case CloneMediatorInputConnector2EditPart.VISUAL_ID:
				return new CloneMediatorInputConnector2EditPart(view);

			case CloneMediatorOutputConnector2EditPart.VISUAL_ID:
				return new CloneMediatorOutputConnector2EditPart(view);

			case CloneMediatorTargetOutputConnector2EditPart.VISUAL_ID:
				return new CloneMediatorTargetOutputConnector2EditPart(view);

			case IterateMediator2EditPart.VISUAL_ID:
				return new IterateMediator2EditPart(view);

			case IterateMediatorIterateID2EditPart.VISUAL_ID:
				return new IterateMediatorIterateID2EditPart(view);

			case IterateMediatorInputConnector2EditPart.VISUAL_ID:
				return new IterateMediatorInputConnector2EditPart(view);

			case IterateMediatorOutputConnector2EditPart.VISUAL_ID:
				return new IterateMediatorOutputConnector2EditPart(view);

			case CalloutMediator2EditPart.VISUAL_ID:
				return new CalloutMediator2EditPart(view);

			case CalloutMediatorSoapAction2EditPart.VISUAL_ID:
				return new CalloutMediatorSoapAction2EditPart(view);

			case CalloutMediatorInputConnector2EditPart.VISUAL_ID:
				return new CalloutMediatorInputConnector2EditPart(view);

			case CalloutMediatorOutputConnector2EditPart.VISUAL_ID:
				return new CalloutMediatorOutputConnector2EditPart(view);

			case TransactionMediator2EditPart.VISUAL_ID:
				return new TransactionMediator2EditPart(view);

			case TransactionMediatorInputConnector2EditPart.VISUAL_ID:
				return new TransactionMediatorInputConnector2EditPart(view);

			case TransactionMediatorOutputConnector2EditPart.VISUAL_ID:
				return new TransactionMediatorOutputConnector2EditPart(view);

			case RMSequenceMediator2EditPart.VISUAL_ID:
				return new RMSequenceMediator2EditPart(view);

			case RMSequenceMediatorInputConnector2EditPart.VISUAL_ID:
				return new RMSequenceMediatorInputConnector2EditPart(view);

			case RMSequenceMediatorOutputConnector2EditPart.VISUAL_ID:
				return new RMSequenceMediatorOutputConnector2EditPart(view);

			case Sequence2EditPart.VISUAL_ID:
				return new Sequence2EditPart(view);

			case SequenceInputConnector2EditPart.VISUAL_ID:
				return new SequenceInputConnector2EditPart(view);

			case SequenceOutputConnector2EditPart.VISUAL_ID:
				return new SequenceOutputConnector2EditPart(view);

			case ProxyServiceOutSequenceEditPart.VISUAL_ID:
				return new ProxyServiceOutSequenceEditPart(view);

			case DropMediator4EditPart.VISUAL_ID:
				return new DropMediator4EditPart(view);

			case DropMediatorInputConnector3EditPart.VISUAL_ID:
				return new DropMediatorInputConnector3EditPart(view);

			case PropertyMediator4EditPart.VISUAL_ID:
				return new PropertyMediator4EditPart(view);

			case PropertyMediatorPropertyName4EditPart.VISUAL_ID:
				return new PropertyMediatorPropertyName4EditPart(view);

			case PropertyMediatorInputConnector3EditPart.VISUAL_ID:
				return new PropertyMediatorInputConnector3EditPart(view);

			case PropertyMediatorOutputConnector3EditPart.VISUAL_ID:
				return new PropertyMediatorOutputConnector3EditPart(view);

			case ThrottleMediator2EditPart.VISUAL_ID:
				return new ThrottleMediator2EditPart(view);

			case ThrottleMediatorGroupId2EditPart.VISUAL_ID:
				return new ThrottleMediatorGroupId2EditPart(view);

			case ThrottleMediatorInputConnector2EditPart.VISUAL_ID:
				return new ThrottleMediatorInputConnector2EditPart(view);

			case ThrottleMediatorOutputConnector2EditPart.VISUAL_ID:
				return new ThrottleMediatorOutputConnector2EditPart(view);

			case FilterMediator3EditPart.VISUAL_ID:
				return new FilterMediator3EditPart(view);

			case FilterMediatorConditionType3EditPart.VISUAL_ID:
				return new FilterMediatorConditionType3EditPart(view);

			case FilterMediatorInputConnector3EditPart.VISUAL_ID:
				return new FilterMediatorInputConnector3EditPart(view);

			case FilterMediatorPassOutputConnector3EditPart.VISUAL_ID:
				return new FilterMediatorPassOutputConnector3EditPart(view);

			case FilterMediatorFailOutputConnector3EditPart.VISUAL_ID:
				return new FilterMediatorFailOutputConnector3EditPart(view);

			case LogMediator3EditPart.VISUAL_ID:
				return new LogMediator3EditPart(view);

			case LogMediatorLogCategory3EditPart.VISUAL_ID:
				return new LogMediatorLogCategory3EditPart(view);

			case LogMediatorInputConnector3EditPart.VISUAL_ID:
				return new LogMediatorInputConnector3EditPart(view);

			case LogMediatorOutputConnector3EditPart.VISUAL_ID:
				return new LogMediatorOutputConnector3EditPart(view);

			case EnrichMediator3EditPart.VISUAL_ID:
				return new EnrichMediator3EditPart(view);

			case EnrichMediatorSourceType3EditPart.VISUAL_ID:
				return new EnrichMediatorSourceType3EditPart(view);

			case EnrichMediatorInputConnector3EditPart.VISUAL_ID:
				return new EnrichMediatorInputConnector3EditPart(view);

			case EnrichMediatorOutputConnector3EditPart.VISUAL_ID:
				return new EnrichMediatorOutputConnector3EditPart(view);

			case XSLTMediator3EditPart.VISUAL_ID:
				return new XSLTMediator3EditPart(view);

			case XSLTMediatorInputConnector3EditPart.VISUAL_ID:
				return new XSLTMediatorInputConnector3EditPart(view);

			case XSLTMediatorOutputConnector3EditPart.VISUAL_ID:
				return new XSLTMediatorOutputConnector3EditPart(view);

			case SwitchMediator3EditPart.VISUAL_ID:
				return new SwitchMediator3EditPart(view);

			case SwitchMediatorInputConnector3EditPart.VISUAL_ID:
				return new SwitchMediatorInputConnector3EditPart(view);

			case SwitchCaseBranchOutputConnector3EditPart.VISUAL_ID:
				return new SwitchCaseBranchOutputConnector3EditPart(view);

			case SwitchDefaultBranchOutputConnector3EditPart.VISUAL_ID:
				return new SwitchDefaultBranchOutputConnector3EditPart(view);

			case Sequence3EditPart.VISUAL_ID:
				return new Sequence3EditPart(view);

			case SequenceName2EditPart.VISUAL_ID:
				return new SequenceName2EditPart(view);

			case SequenceInputConnector3EditPart.VISUAL_ID:
				return new SequenceInputConnector3EditPart(view);

			case SequenceOutputConnector3EditPart.VISUAL_ID:
				return new SequenceOutputConnector3EditPart(view);

			case EventMediator2EditPart.VISUAL_ID:
				return new EventMediator2EditPart(view);

			case EventMediatorTopicType2EditPart.VISUAL_ID:
				return new EventMediatorTopicType2EditPart(view);

			case EventMediatorInputConnector2EditPart.VISUAL_ID:
				return new EventMediatorInputConnector2EditPart(view);

			case EventMediatorOutputConnector2EditPart.VISUAL_ID:
				return new EventMediatorOutputConnector2EditPart(view);

			case EntitlementMediator2EditPart.VISUAL_ID:
				return new EntitlementMediator2EditPart(view);

			case EntitlementMediatorServerURL2EditPart.VISUAL_ID:
				return new EntitlementMediatorServerURL2EditPart(view);

			case EntitlementMediatorInputConnector2EditPart.VISUAL_ID:
				return new EntitlementMediatorInputConnector2EditPart(view);

			case EntitlementMediatorOutputConnector2EditPart.VISUAL_ID:
				return new EntitlementMediatorOutputConnector2EditPart(view);

			case ClassMediator2EditPart.VISUAL_ID:
				return new ClassMediator2EditPart(view);

			case ClassMediatorClassName2EditPart.VISUAL_ID:
				return new ClassMediatorClassName2EditPart(view);

			case ClassMediatorInputConnector2EditPart.VISUAL_ID:
				return new ClassMediatorInputConnector2EditPart(view);

			case ClassMediatorOutputConnector2EditPart.VISUAL_ID:
				return new ClassMediatorOutputConnector2EditPart(view);

			case SpringMediator2EditPart.VISUAL_ID:
				return new SpringMediator2EditPart(view);

			case SpringMediatorBeanName2EditPart.VISUAL_ID:
				return new SpringMediatorBeanName2EditPart(view);

			case SpringMediatorInputConnector2EditPart.VISUAL_ID:
				return new SpringMediatorInputConnector2EditPart(view);

			case SpringMediatorOutputConnector2EditPart.VISUAL_ID:
				return new SpringMediatorOutputConnector2EditPart(view);

			case ScriptMediator2EditPart.VISUAL_ID:
				return new ScriptMediator2EditPart(view);

			case ScriptMediatorScriptLanguage2EditPart.VISUAL_ID:
				return new ScriptMediatorScriptLanguage2EditPart(view);

			case ScriptMediatorInputConnector2EditPart.VISUAL_ID:
				return new ScriptMediatorInputConnector2EditPart(view);

			case ScriptMediatorOutputConnector2EditPart.VISUAL_ID:
				return new ScriptMediatorOutputConnector2EditPart(view);

			case FaultMediator3EditPart.VISUAL_ID:
				return new FaultMediator3EditPart(view);

			case FaultMediatorFaultStringType3EditPart.VISUAL_ID:
				return new FaultMediatorFaultStringType3EditPart(view);

			case FaultMediatorInputConnector3EditPart.VISUAL_ID:
				return new FaultMediatorInputConnector3EditPart(view);

			case FaultMediatorOutputConnector3EditPart.VISUAL_ID:
				return new FaultMediatorOutputConnector3EditPart(view);

			case XQueryMediator2EditPart.VISUAL_ID:
				return new XQueryMediator2EditPart(view);

			case XQueryMediatorScriptKeyType2EditPart.VISUAL_ID:
				return new XQueryMediatorScriptKeyType2EditPart(view);

			case XQueryMediatorInputConnector2EditPart.VISUAL_ID:
				return new XQueryMediatorInputConnector2EditPart(view);

			case XQueryMediatorOutputConnector2EditPart.VISUAL_ID:
				return new XQueryMediatorOutputConnector2EditPart(view);

			case CommandMediator2EditPart.VISUAL_ID:
				return new CommandMediator2EditPart(view);

			case CommandMediatorClassName2EditPart.VISUAL_ID:
				return new CommandMediatorClassName2EditPart(view);

			case CommandMediatorInputConnector2EditPart.VISUAL_ID:
				return new CommandMediatorInputConnector2EditPart(view);

			case CommandMediatorOutputConnector2EditPart.VISUAL_ID:
				return new CommandMediatorOutputConnector2EditPart(view);

			case DBLookupMediator3EditPart.VISUAL_ID:
				return new DBLookupMediator3EditPart(view);

			case DBLookupMediatorConnectionURL3EditPart.VISUAL_ID:
				return new DBLookupMediatorConnectionURL3EditPart(view);

			case DBLookupMediatorInputConnector3EditPart.VISUAL_ID:
				return new DBLookupMediatorInputConnector3EditPart(view);

			case DBLookupMediatorOutputConnector3EditPart.VISUAL_ID:
				return new DBLookupMediatorOutputConnector3EditPart(view);

			case DBReportMediator3EditPart.VISUAL_ID:
				return new DBReportMediator3EditPart(view);

			case DBReportMediatorConnectionURL3EditPart.VISUAL_ID:
				return new DBReportMediatorConnectionURL3EditPart(view);

			case DBReportMediatorInputConnector3EditPart.VISUAL_ID:
				return new DBReportMediatorInputConnector3EditPart(view);

			case DBReportMediatorOutputConnector3EditPart.VISUAL_ID:
				return new DBReportMediatorOutputConnector3EditPart(view);

			case SmooksMediator2EditPart.VISUAL_ID:
				return new SmooksMediator2EditPart(view);

			case SmooksMediatorInputConnector2EditPart.VISUAL_ID:
				return new SmooksMediatorInputConnector2EditPart(view);

			case SmooksMediatorOutputConnector2EditPart.VISUAL_ID:
				return new SmooksMediatorOutputConnector2EditPart(view);

			case SendMediator3EditPart.VISUAL_ID:
				return new SendMediator3EditPart(view);

			case SendMediatorInputConnector3EditPart.VISUAL_ID:
				return new SendMediatorInputConnector3EditPart(view);

			case SendMediatorOutputConnector3EditPart.VISUAL_ID:
				return new SendMediatorOutputConnector3EditPart(view);

			case HeaderMediator3EditPart.VISUAL_ID:
				return new HeaderMediator3EditPart(view);

			case HeaderMediatorValueLiteral3EditPart.VISUAL_ID:
				return new HeaderMediatorValueLiteral3EditPart(view);

			case HeaderMediatorInputConnector3EditPart.VISUAL_ID:
				return new HeaderMediatorInputConnector3EditPart(view);

			case HeaderMediatorOutputConnector3EditPart.VISUAL_ID:
				return new HeaderMediatorOutputConnector3EditPart(view);

			case CloneMediator3EditPart.VISUAL_ID:
				return new CloneMediator3EditPart(view);

			case CloneMediatorCloneID3EditPart.VISUAL_ID:
				return new CloneMediatorCloneID3EditPart(view);

			case CloneMediatorInputConnector3EditPart.VISUAL_ID:
				return new CloneMediatorInputConnector3EditPart(view);

			case CloneMediatorOutputConnector3EditPart.VISUAL_ID:
				return new CloneMediatorOutputConnector3EditPart(view);

			case CloneMediatorTargetOutputConnector3EditPart.VISUAL_ID:
				return new CloneMediatorTargetOutputConnector3EditPart(view);

			case CacheMediator2EditPart.VISUAL_ID:
				return new CacheMediator2EditPart(view);

			case CacheMediatorCacheId2EditPart.VISUAL_ID:
				return new CacheMediatorCacheId2EditPart(view);

			case CacheMediatorInputConnector2EditPart.VISUAL_ID:
				return new CacheMediatorInputConnector2EditPart(view);

			case CacheMediatorOutputConnector2EditPart.VISUAL_ID:
				return new CacheMediatorOutputConnector2EditPart(view);

			case IterateMediator3EditPart.VISUAL_ID:
				return new IterateMediator3EditPart(view);

			case IterateMediatorIterateID3EditPart.VISUAL_ID:
				return new IterateMediatorIterateID3EditPart(view);

			case IterateMediatorInputConnector3EditPart.VISUAL_ID:
				return new IterateMediatorInputConnector3EditPart(view);

			case IterateMediatorOutputConnector3EditPart.VISUAL_ID:
				return new IterateMediatorOutputConnector3EditPart(view);

			case CalloutMediator3EditPart.VISUAL_ID:
				return new CalloutMediator3EditPart(view);

			case CalloutMediatorSoapAction3EditPart.VISUAL_ID:
				return new CalloutMediatorSoapAction3EditPart(view);

			case CalloutMediatorInputConnector3EditPart.VISUAL_ID:
				return new CalloutMediatorInputConnector3EditPart(view);

			case CalloutMediatorOutputConnector3EditPart.VISUAL_ID:
				return new CalloutMediatorOutputConnector3EditPart(view);

			case TransactionMediator3EditPart.VISUAL_ID:
				return new TransactionMediator3EditPart(view);

			case TransactionMediatorInputConnector3EditPart.VISUAL_ID:
				return new TransactionMediatorInputConnector3EditPart(view);

			case TransactionMediatorOutputConnector3EditPart.VISUAL_ID:
				return new TransactionMediatorOutputConnector3EditPart(view);

			case RMSequenceMediator3EditPart.VISUAL_ID:
				return new RMSequenceMediator3EditPart(view);

			case RMSequenceMediatorInputConnector3EditPart.VISUAL_ID:
				return new RMSequenceMediatorInputConnector3EditPart(view);

			case RMSequenceMediatorOutputConnector3EditPart.VISUAL_ID:
				return new RMSequenceMediatorOutputConnector3EditPart(view);

			case RuleMediator2EditPart.VISUAL_ID:
				return new RuleMediator2EditPart(view);

			case RuleMediatorInputConnector2EditPart.VISUAL_ID:
				return new RuleMediatorInputConnector2EditPart(view);

			case RuleMediatorOutputConnector2EditPart.VISUAL_ID:
				return new RuleMediatorOutputConnector2EditPart(view);

			case OAuthMediator2EditPart.VISUAL_ID:
				return new OAuthMediator2EditPart(view);

			case OAuthMediatorRemoteServiceUrl2EditPart.VISUAL_ID:
				return new OAuthMediatorRemoteServiceUrl2EditPart(view);

			case OAuthMediatorInputConnector2EditPart.VISUAL_ID:
				return new OAuthMediatorInputConnector2EditPart(view);

			case OAuthMediatorOutputConnector2EditPart.VISUAL_ID:
				return new OAuthMediatorOutputConnector2EditPart(view);

			case AggregateMediator2EditPart.VISUAL_ID:
				return new AggregateMediator2EditPart(view);

			case AggregateMediatorAggregateID2EditPart.VISUAL_ID:
				return new AggregateMediatorAggregateID2EditPart(view);

			case AggregateMediatorInputConnector2EditPart.VISUAL_ID:
				return new AggregateMediatorInputConnector2EditPart(view);

			case AggregateMediatorOutputConnector2EditPart.VISUAL_ID:
				return new AggregateMediatorOutputConnector2EditPart(view);

			case AggregateMediatorOnCompleteOutputConnector2EditPart.VISUAL_ID:
				return new AggregateMediatorOnCompleteOutputConnector2EditPart(
						view);

			case LogMediator4EditPart.VISUAL_ID:
				return new LogMediator4EditPart(view);

			case LogMediatorLogCategory4EditPart.VISUAL_ID:
				return new LogMediatorLogCategory4EditPart(view);

			case LogMediatorInputConnector4EditPart.VISUAL_ID:
				return new LogMediatorInputConnector4EditPart(view);

			case LogMediatorOutputConnector4EditPart.VISUAL_ID:
				return new LogMediatorOutputConnector4EditPart(view);

			case DropMediator5EditPart.VISUAL_ID:
				return new DropMediator5EditPart(view);

			case DropMediatorInputConnector4EditPart.VISUAL_ID:
				return new DropMediatorInputConnector4EditPart(view);

			case FilterMediator4EditPart.VISUAL_ID:
				return new FilterMediator4EditPart(view);

			case FilterMediatorConditionType4EditPart.VISUAL_ID:
				return new FilterMediatorConditionType4EditPart(view);

			case FilterMediatorInputConnector4EditPart.VISUAL_ID:
				return new FilterMediatorInputConnector4EditPart(view);

			case FilterMediatorPassOutputConnector4EditPart.VISUAL_ID:
				return new FilterMediatorPassOutputConnector4EditPart(view);

			case FilterMediatorFailOutputConnector4EditPart.VISUAL_ID:
				return new FilterMediatorFailOutputConnector4EditPart(view);

			case PropertyMediator5EditPart.VISUAL_ID:
				return new PropertyMediator5EditPart(view);

			case PropertyMediatorPropertyName5EditPart.VISUAL_ID:
				return new PropertyMediatorPropertyName5EditPart(view);

			case PropertyMediatorInputConnector4EditPart.VISUAL_ID:
				return new PropertyMediatorInputConnector4EditPart(view);

			case PropertyMediatorOutputConnector4EditPart.VISUAL_ID:
				return new PropertyMediatorOutputConnector4EditPart(view);

			case EnrichMediator4EditPart.VISUAL_ID:
				return new EnrichMediator4EditPart(view);

			case EnrichMediatorSourceType4EditPart.VISUAL_ID:
				return new EnrichMediatorSourceType4EditPart(view);

			case EnrichMediatorInputConnector4EditPart.VISUAL_ID:
				return new EnrichMediatorInputConnector4EditPart(view);

			case EnrichMediatorOutputConnector4EditPart.VISUAL_ID:
				return new EnrichMediatorOutputConnector4EditPart(view);

			case XSLTMediator4EditPart.VISUAL_ID:
				return new XSLTMediator4EditPart(view);

			case XSLTMediatorInputConnector4EditPart.VISUAL_ID:
				return new XSLTMediatorInputConnector4EditPart(view);

			case XSLTMediatorOutputConnector4EditPart.VISUAL_ID:
				return new XSLTMediatorOutputConnector4EditPart(view);

			case SwitchMediator4EditPart.VISUAL_ID:
				return new SwitchMediator4EditPart(view);

			case SwitchMediatorInputConnector4EditPart.VISUAL_ID:
				return new SwitchMediatorInputConnector4EditPart(view);

			case SwitchCaseBranchOutputConnector4EditPart.VISUAL_ID:
				return new SwitchCaseBranchOutputConnector4EditPart(view);

			case SwitchDefaultBranchOutputConnector4EditPart.VISUAL_ID:
				return new SwitchDefaultBranchOutputConnector4EditPart(view);

			case FaultMediator4EditPart.VISUAL_ID:
				return new FaultMediator4EditPart(view);

			case FaultMediatorFaultStringType4EditPart.VISUAL_ID:
				return new FaultMediatorFaultStringType4EditPart(view);

			case FaultMediatorInputConnector4EditPart.VISUAL_ID:
				return new FaultMediatorInputConnector4EditPart(view);

			case FaultMediatorOutputConnector4EditPart.VISUAL_ID:
				return new FaultMediatorOutputConnector4EditPart(view);

			case DBLookupMediator4EditPart.VISUAL_ID:
				return new DBLookupMediator4EditPart(view);

			case DBLookupMediatorConnectionURL4EditPart.VISUAL_ID:
				return new DBLookupMediatorConnectionURL4EditPart(view);

			case DBLookupMediatorInputConnector4EditPart.VISUAL_ID:
				return new DBLookupMediatorInputConnector4EditPart(view);

			case DBLookupMediatorOutputConnector4EditPart.VISUAL_ID:
				return new DBLookupMediatorOutputConnector4EditPart(view);

			case DBReportMediator4EditPart.VISUAL_ID:
				return new DBReportMediator4EditPart(view);

			case DBReportMediatorConnectionURL4EditPart.VISUAL_ID:
				return new DBReportMediatorConnectionURL4EditPart(view);

			case DBReportMediatorInputConnector4EditPart.VISUAL_ID:
				return new DBReportMediatorInputConnector4EditPart(view);

			case DBReportMediatorOutputConnector4EditPart.VISUAL_ID:
				return new DBReportMediatorOutputConnector4EditPart(view);

			case SendMediator4EditPart.VISUAL_ID:
				return new SendMediator4EditPart(view);

			case SendMediatorInputConnector4EditPart.VISUAL_ID:
				return new SendMediatorInputConnector4EditPart(view);

			case SendMediatorOutputConnector4EditPart.VISUAL_ID:
				return new SendMediatorOutputConnector4EditPart(view);

			case HeaderMediator4EditPart.VISUAL_ID:
				return new HeaderMediator4EditPart(view);

			case HeaderMediatorValueLiteral4EditPart.VISUAL_ID:
				return new HeaderMediatorValueLiteral4EditPart(view);

			case HeaderMediatorInputConnector4EditPart.VISUAL_ID:
				return new HeaderMediatorInputConnector4EditPart(view);

			case HeaderMediatorOutputConnector4EditPart.VISUAL_ID:
				return new HeaderMediatorOutputConnector4EditPart(view);

			case CloneMediator4EditPart.VISUAL_ID:
				return new CloneMediator4EditPart(view);

			case CloneMediatorCloneID4EditPart.VISUAL_ID:
				return new CloneMediatorCloneID4EditPart(view);

			case CloneMediatorInputConnector4EditPart.VISUAL_ID:
				return new CloneMediatorInputConnector4EditPart(view);

			case CloneMediatorOutputConnector4EditPart.VISUAL_ID:
				return new CloneMediatorOutputConnector4EditPart(view);

			case CloneMediatorTargetOutputConnector4EditPart.VISUAL_ID:
				return new CloneMediatorTargetOutputConnector4EditPart(view);

			case IterateMediator4EditPart.VISUAL_ID:
				return new IterateMediator4EditPart(view);

			case IterateMediatorIterateID4EditPart.VISUAL_ID:
				return new IterateMediatorIterateID4EditPart(view);

			case IterateMediatorInputConnector4EditPart.VISUAL_ID:
				return new IterateMediatorInputConnector4EditPart(view);

			case IterateMediatorOutputConnector4EditPart.VISUAL_ID:
				return new IterateMediatorOutputConnector4EditPart(view);

			case CalloutMediator4EditPart.VISUAL_ID:
				return new CalloutMediator4EditPart(view);

			case CalloutMediatorSoapAction4EditPart.VISUAL_ID:
				return new CalloutMediatorSoapAction4EditPart(view);

			case CalloutMediatorInputConnector4EditPart.VISUAL_ID:
				return new CalloutMediatorInputConnector4EditPart(view);

			case CalloutMediatorOutputConnector4EditPart.VISUAL_ID:
				return new CalloutMediatorOutputConnector4EditPart(view);

			case TransactionMediator4EditPart.VISUAL_ID:
				return new TransactionMediator4EditPart(view);

			case TransactionMediatorInputConnector4EditPart.VISUAL_ID:
				return new TransactionMediatorInputConnector4EditPart(view);

			case TransactionMediatorOutputConnector4EditPart.VISUAL_ID:
				return new TransactionMediatorOutputConnector4EditPart(view);

			case RMSequenceMediator4EditPart.VISUAL_ID:
				return new RMSequenceMediator4EditPart(view);

			case RMSequenceMediatorInputConnector4EditPart.VISUAL_ID:
				return new RMSequenceMediatorInputConnector4EditPart(view);

			case RMSequenceMediatorOutputConnector4EditPart.VISUAL_ID:
				return new RMSequenceMediatorOutputConnector4EditPart(view);

			case Sequence4EditPart.VISUAL_ID:
				return new Sequence4EditPart(view);

			case SequenceInputConnector4EditPart.VISUAL_ID:
				return new SequenceInputConnector4EditPart(view);

			case SequenceOutputConnector4EditPart.VISUAL_ID:
				return new SequenceOutputConnector4EditPart(view);

			case ProxyServiceEndpointContainerEditPart.VISUAL_ID:
				return new ProxyServiceEndpointContainerEditPart(view);

			case DefaultEndPoint2EditPart.VISUAL_ID:
				return new DefaultEndPoint2EditPart(view);

			case DefaultEndPointEndPointName2EditPart.VISUAL_ID:
				return new DefaultEndPointEndPointName2EditPart(view);

			case DefaultEndPointInputConnectorEditPart.VISUAL_ID:
				return new DefaultEndPointInputConnectorEditPart(view);

			case DefaultEndPointOutputConnectorEditPart.VISUAL_ID:
				return new DefaultEndPointOutputConnectorEditPart(view);

			case AddressEndPoint2EditPart.VISUAL_ID:
				return new AddressEndPoint2EditPart(view);

			case AddressEndPointEndPointName2EditPart.VISUAL_ID:
				return new AddressEndPointEndPointName2EditPart(view);

			case AddressEndPointInputConnectorEditPart.VISUAL_ID:
				return new AddressEndPointInputConnectorEditPart(view);

			case AddressEndPointOutputConnectorEditPart.VISUAL_ID:
				return new AddressEndPointOutputConnectorEditPart(view);

			case FailoverEndPoint2EditPart.VISUAL_ID:
				return new FailoverEndPoint2EditPart(view);

			case FailoverEndPointEndPointName2EditPart.VISUAL_ID:
				return new FailoverEndPointEndPointName2EditPart(view);

			case FailoverEndPointInputConnectorEditPart.VISUAL_ID:
				return new FailoverEndPointInputConnectorEditPart(view);

			case FailoverEndPointOutputConnectorEditPart.VISUAL_ID:
				return new FailoverEndPointOutputConnectorEditPart(view);

			case FailoverEndPointWestOutputConnectorEditPart.VISUAL_ID:
				return new FailoverEndPointWestOutputConnectorEditPart(view);

			case WSDLEndPoint2EditPart.VISUAL_ID:
				return new WSDLEndPoint2EditPart(view);

			case WSDLEndPointEndPointName2EditPart.VISUAL_ID:
				return new WSDLEndPointEndPointName2EditPart(view);

			case WSDLEndPointInputConnectorEditPart.VISUAL_ID:
				return new WSDLEndPointInputConnectorEditPart(view);

			case WSDLEndPointOutputConnectorEditPart.VISUAL_ID:
				return new WSDLEndPointOutputConnectorEditPart(view);

			case LoadBalanceEndPoint2EditPart.VISUAL_ID:
				return new LoadBalanceEndPoint2EditPart(view);

			case LoadBalanceEndPointEndPointName2EditPart.VISUAL_ID:
				return new LoadBalanceEndPointEndPointName2EditPart(view);

			case LoadBalanceEndPointInputConnectorEditPart.VISUAL_ID:
				return new LoadBalanceEndPointInputConnectorEditPart(view);

			case LoadBalanceEndPointOutputConnectorEditPart.VISUAL_ID:
				return new LoadBalanceEndPointOutputConnectorEditPart(view);

			case LoadBalanceEndPointWestOutputConnectorEditPart.VISUAL_ID:
				return new LoadBalanceEndPointWestOutputConnectorEditPart(view);

			case MessageMediatorEditPart.VISUAL_ID:
				return new MessageMediatorEditPart(view);

			case MessageInputConnectorEditPart.VISUAL_ID:
				return new MessageInputConnectorEditPart(view);

			case MessageOutputConnectorEditPart.VISUAL_ID:
				return new MessageOutputConnectorEditPart(view);

			case MergeNodeEditPart.VISUAL_ID:
				return new MergeNodeEditPart(view);

			case MergeNodeFirstInputConnectorEditPart.VISUAL_ID:
				return new MergeNodeFirstInputConnectorEditPart(view);

			case MergeNodeSecondInputConnectorEditPart.VISUAL_ID:
				return new MergeNodeSecondInputConnectorEditPart(view);

			case MergeNodeOutputConnectorEditPart.VISUAL_ID:
				return new MergeNodeOutputConnectorEditPart(view);

			case EsbServerContentsCompartmentEditPart.VISUAL_ID:
				return new EsbServerContentsCompartmentEditPart(view);

			case ProxyServiceInSequenceProxyServiceInSequenceCompartmentEditPart.VISUAL_ID:
				return new ProxyServiceInSequenceProxyServiceInSequenceCompartmentEditPart(
						view);

			case AggregateMediatorAggregateCompartmentEditPart.VISUAL_ID:
				return new AggregateMediatorAggregateCompartmentEditPart(view);

			case ProxyServiceOutSequenceProxyServiceOutSequenceCompartmentEditPart.VISUAL_ID:
				return new ProxyServiceOutSequenceProxyServiceOutSequenceCompartmentEditPart(
						view);

			case AggregateMediatorAggregateCompartment2EditPart.VISUAL_ID:
				return new AggregateMediatorAggregateCompartment2EditPart(view);

			case ProxyServiceEndpointContainerEndpointCompartmentEditPart.VISUAL_ID:
				return new ProxyServiceEndpointContainerEndpointCompartmentEditPart(
						view);

			case EsbLinkEditPart.VISUAL_ID:
				return new EsbLinkEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		if (source.getFigure() instanceof WrappingLabel)
			return new TextCellEditorLocator((WrappingLabel) source.getFigure());
		else {
			return new LabelCellEditorLocator((Label) source.getFigure());
		}
	}

	/**
	 * @generated
	 */
	static private class TextCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private WrappingLabel wrapLabel;

		/**
		 * @generated
		 */
		public TextCellEditorLocator(WrappingLabel wrapLabel) {
			this.wrapLabel = wrapLabel;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getWrapLabel() {
			return wrapLabel;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getWrapLabel().getTextBounds().getCopy();
			getWrapLabel().translateToAbsolute(rect);
			if (!text.getFont().isDisposed()) {
				if (getWrapLabel().isTextWrapOn()
						&& getWrapLabel().getText().length() > 0) {
					rect.setSize(new Dimension(text.computeSize(rect.width,
							SWT.DEFAULT)));
				} else {
					int avr = FigureUtilities.getFontMetrics(text.getFont())
							.getAverageCharWidth();
					rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
							SWT.DEFAULT)).expand(avr * 2, 0));
				}
			}
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}

	/**
	 * @generated
	 */
	private static class LabelCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private Label label;

		/**
		 * @generated
		 */
		public LabelCellEditorLocator(Label label) {
			this.label = label;
		}

		/**
		 * @generated
		 */
		public Label getLabel() {
			return label;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getLabel().getTextBounds().getCopy();
			getLabel().translateToAbsolute(rect);
			if (!text.getFont().isDisposed()) {
				int avr = FigureUtilities.getFontMetrics(text.getFont())
						.getAverageCharWidth();
				rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
						SWT.DEFAULT)).expand(avr * 2, 0));
			}
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}
}
