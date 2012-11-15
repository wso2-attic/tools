package org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts;

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
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbVisualIDRegistry;

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

			case ProxyFaultInputConnectorEditPart.VISUAL_ID:
				return new ProxyFaultInputConnectorEditPart(view);

			case ProxyServiceContainerEditPart.VISUAL_ID:
				return new ProxyServiceContainerEditPart(view);

			case ProxyServiceSequenceAndEndpointContainerEditPart.VISUAL_ID:
				return new ProxyServiceSequenceAndEndpointContainerEditPart(
						view);

			case MediatorFlowEditPart.VISUAL_ID:
				return new MediatorFlowEditPart(view);

			case DropMediatorEditPart.VISUAL_ID:
				return new DropMediatorEditPart(view);

			case DropMediatorInputConnectorEditPart.VISUAL_ID:
				return new DropMediatorInputConnectorEditPart(view);

			case PropertyMediatorEditPart.VISUAL_ID:
				return new PropertyMediatorEditPart(view);

			case PropertyMediatorPropertyNameEditPart.VISUAL_ID:
				return new PropertyMediatorPropertyNameEditPart(view);

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

			case ThrottleMediatorOnAcceptOutputConnectorEditPart.VISUAL_ID:
				return new ThrottleMediatorOnAcceptOutputConnectorEditPart(view);

			case ThrottleMediatorOnRejectOutputConnectorEditPart.VISUAL_ID:
				return new ThrottleMediatorOnRejectOutputConnectorEditPart(view);

			case ThrottleContainerEditPart.VISUAL_ID:
				return new ThrottleContainerEditPart(view);

			case ThrottleOnAcceptContainerEditPart.VISUAL_ID:
				return new ThrottleOnAcceptContainerEditPart(view);

			case MediatorFlow9EditPart.VISUAL_ID:
				return new MediatorFlow9EditPart(view);

			case FilterMediatorEditPart.VISUAL_ID:
				return new FilterMediatorEditPart(view);

			case FilterMediatorConditionTypeEditPart.VISUAL_ID:
				return new FilterMediatorConditionTypeEditPart(view);

			case FilterMediatorInputConnectorEditPart.VISUAL_ID:
				return new FilterMediatorInputConnectorEditPart(view);

			case FilterMediatorOutputConnectorEditPart.VISUAL_ID:
				return new FilterMediatorOutputConnectorEditPart(view);

			case FilterMediatorPassOutputConnectorEditPart.VISUAL_ID:
				return new FilterMediatorPassOutputConnectorEditPart(view);

			case FilterMediatorFailOutputConnectorEditPart.VISUAL_ID:
				return new FilterMediatorFailOutputConnectorEditPart(view);

			case FilterContainerEditPart.VISUAL_ID:
				return new FilterContainerEditPart(view);

			case FilterPassContainerEditPart.VISUAL_ID:
				return new FilterPassContainerEditPart(view);

			case MediatorFlow7EditPart.VISUAL_ID:
				return new MediatorFlow7EditPart(view);

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

			case SwitchMediatorOutputConnectorEditPart.VISUAL_ID:
				return new SwitchMediatorOutputConnectorEditPart(view);

			case SwitchMediatorContainerEditPart.VISUAL_ID:
				return new SwitchMediatorContainerEditPart(view);

			case SwitchCaseContainerEditPart.VISUAL_ID:
				return new SwitchCaseContainerEditPart(view);

			case MediatorFlow2EditPart.VISUAL_ID:
				return new MediatorFlow2EditPart(view);

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

			case SendMediatorEndpointOutputConnectorEditPart.VISUAL_ID:
				return new SendMediatorEndpointOutputConnectorEditPart(view);

			case EndpointFlowEditPart.VISUAL_ID:
				return new EndpointFlowEditPart(view);

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

			case CloneMediatorContainerEditPart.VISUAL_ID:
				return new CloneMediatorContainerEditPart(view);

			case CloneTargetContainerEditPart.VISUAL_ID:
				return new CloneTargetContainerEditPart(view);

			case MediatorFlow11EditPart.VISUAL_ID:
				return new MediatorFlow11EditPart(view);

			case CacheMediatorEditPart.VISUAL_ID:
				return new CacheMediatorEditPart(view);

			case CacheMediatorCacheIdEditPart.VISUAL_ID:
				return new CacheMediatorCacheIdEditPart(view);

			case CacheMediatorInputConnectorEditPart.VISUAL_ID:
				return new CacheMediatorInputConnectorEditPart(view);

			case CacheMediatorOutputConnectorEditPart.VISUAL_ID:
				return new CacheMediatorOutputConnectorEditPart(view);

			case CacheMediatorOnHitOutputConnectorEditPart.VISUAL_ID:
				return new CacheMediatorOnHitOutputConnectorEditPart(view);

			case MediatorFlow13EditPart.VISUAL_ID:
				return new MediatorFlow13EditPart(view);

			case IterateMediatorEditPart.VISUAL_ID:
				return new IterateMediatorEditPart(view);

			case IterateMediatorIterateIDEditPart.VISUAL_ID:
				return new IterateMediatorIterateIDEditPart(view);

			case IterateMediatorInputConnectorEditPart.VISUAL_ID:
				return new IterateMediatorInputConnectorEditPart(view);

			case IterateMediatorOutputConnectorEditPart.VISUAL_ID:
				return new IterateMediatorOutputConnectorEditPart(view);

			case IterateMediatorTargetOutputConnectorEditPart.VISUAL_ID:
				return new IterateMediatorTargetOutputConnectorEditPart(view);

			case MediatorFlow12EditPart.VISUAL_ID:
				return new MediatorFlow12EditPart(view);

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

			case RuleMediatorChildMediatorsOutputConnectorEditPart.VISUAL_ID:
				return new RuleMediatorChildMediatorsOutputConnectorEditPart(
						view);

			case MediatorFlow17EditPart.VISUAL_ID:
				return new MediatorFlow17EditPart(view);

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

			case MediatorFlow3EditPart.VISUAL_ID:
				return new MediatorFlow3EditPart(view);

			case StoreMediatorEditPart.VISUAL_ID:
				return new StoreMediatorEditPart(view);

			case StoreMediatorInputConnectorEditPart.VISUAL_ID:
				return new StoreMediatorInputConnectorEditPart(view);

			case StoreMediatorOutputConnectorEditPart.VISUAL_ID:
				return new StoreMediatorOutputConnectorEditPart(view);

			case BuilderMediatorEditPart.VISUAL_ID:
				return new BuilderMediatorEditPart(view);

			case BuilderMediatorInputConnectorEditPart.VISUAL_ID:
				return new BuilderMediatorInputConnectorEditPart(view);

			case BuilderMediatorOutputConectorEditPart.VISUAL_ID:
				return new BuilderMediatorOutputConectorEditPart(view);

			case CallTemplateMediatorEditPart.VISUAL_ID:
				return new CallTemplateMediatorEditPart(view);

			case CallTemplateMediatorInputConnectorEditPart.VISUAL_ID:
				return new CallTemplateMediatorInputConnectorEditPart(view);

			case CallTemplateMediatorOutputConnectorEditPart.VISUAL_ID:
				return new CallTemplateMediatorOutputConnectorEditPart(view);

			case PayloadFactoryMediatorEditPart.VISUAL_ID:
				return new PayloadFactoryMediatorEditPart(view);

			case PayloadFactoryMediatorInputConnectorEditPart.VISUAL_ID:
				return new PayloadFactoryMediatorInputConnectorEditPart(view);

			case PayloadFactoryMediatorOutputConnectorEditPart.VISUAL_ID:
				return new PayloadFactoryMediatorOutputConnectorEditPart(view);

			case EnqueueMediatorEditPart.VISUAL_ID:
				return new EnqueueMediatorEditPart(view);

			case EnqueueMediatorInputConnectorEditPart.VISUAL_ID:
				return new EnqueueMediatorInputConnectorEditPart(view);

			case EnqueueMediatorOutputConnectorEditPart.VISUAL_ID:
				return new EnqueueMediatorOutputConnectorEditPart(view);

			case URLRewriteMediatorEditPart.VISUAL_ID:
				return new URLRewriteMediatorEditPart(view);

			case URLRewriteMediatorInputConnectorEditPart.VISUAL_ID:
				return new URLRewriteMediatorInputConnectorEditPart(view);

			case URLRewriteMediatorOutputConnectorEditPart.VISUAL_ID:
				return new URLRewriteMediatorOutputConnectorEditPart(view);

			case ValidateMediatorEditPart.VISUAL_ID:
				return new ValidateMediatorEditPart(view);

			case ValidateMediatorInputConnectorEditPart.VISUAL_ID:
				return new ValidateMediatorInputConnectorEditPart(view);

			case ValidateMediatorOutputConnectorEditPart.VISUAL_ID:
				return new ValidateMediatorOutputConnectorEditPart(view);

			case ValidateMediatorOnFailOutputConnectorEditPart.VISUAL_ID:
				return new ValidateMediatorOnFailOutputConnectorEditPart(view);

			case MediatorFlow14EditPart.VISUAL_ID:
				return new MediatorFlow14EditPart(view);

			case RouterMediatorEditPart.VISUAL_ID:
				return new RouterMediatorEditPart(view);

			case RouterMediatorInputConnectorEditPart.VISUAL_ID:
				return new RouterMediatorInputConnectorEditPart(view);

			case RouterMediatorOutputConnectorEditPart.VISUAL_ID:
				return new RouterMediatorOutputConnectorEditPart(view);

			case RouterMediatorTargetOutputConnectorEditPart.VISUAL_ID:
				return new RouterMediatorTargetOutputConnectorEditPart(view);

			case RouterMediatorContainerEditPart.VISUAL_ID:
				return new RouterMediatorContainerEditPart(view);

			case RouterTargetContainerEditPart.VISUAL_ID:
				return new RouterTargetContainerEditPart(view);

			case MediatorFlow15EditPart.VISUAL_ID:
				return new MediatorFlow15EditPart(view);

			case ConditionalRouterMediatorEditPart.VISUAL_ID:
				return new ConditionalRouterMediatorEditPart(view);

			case ConditionalRouterMediatorInputConnectorEditPart.VISUAL_ID:
				return new ConditionalRouterMediatorInputConnectorEditPart(view);

			case ConditionalRouterMediatorOutputConnectorEditPart.VISUAL_ID:
				return new ConditionalRouterMediatorOutputConnectorEditPart(
						view);

			case ConditionalRouterMediatorAdditionalOutputConnectorEditPart.VISUAL_ID:
				return new ConditionalRouterMediatorAdditionalOutputConnectorEditPart(
						view);

			case MediatorFlow16EditPart.VISUAL_ID:
				return new MediatorFlow16EditPart(view);

			case DefaultEndPointEditPart.VISUAL_ID:
				return new DefaultEndPointEditPart(view);

			case DefaultEndPointEndPointNameEditPart.VISUAL_ID:
				return new DefaultEndPointEndPointNameEditPart(view);

			case DefaultEndPointInputConnectorEditPart.VISUAL_ID:
				return new DefaultEndPointInputConnectorEditPart(view);

			case DefaultEndPointOutputConnectorEditPart.VISUAL_ID:
				return new DefaultEndPointOutputConnectorEditPart(view);

			case AddressEndPointEditPart.VISUAL_ID:
				return new AddressEndPointEditPart(view);

			case AddressEndPointEndPointNameEditPart.VISUAL_ID:
				return new AddressEndPointEndPointNameEditPart(view);

			case AddressEndPointInputConnectorEditPart.VISUAL_ID:
				return new AddressEndPointInputConnectorEditPart(view);

			case AddressEndPointOutputConnectorEditPart.VISUAL_ID:
				return new AddressEndPointOutputConnectorEditPart(view);

			case FailoverEndPointEditPart.VISUAL_ID:
				return new FailoverEndPointEditPart(view);

			case FailoverEndPointEndPointNameEditPart.VISUAL_ID:
				return new FailoverEndPointEndPointNameEditPart(view);

			case FailoverEndPointInputConnectorEditPart.VISUAL_ID:
				return new FailoverEndPointInputConnectorEditPart(view);

			case FailoverEndPointOutputConnectorEditPart.VISUAL_ID:
				return new FailoverEndPointOutputConnectorEditPart(view);

			case FailoverEndPointWestOutputConnectorEditPart.VISUAL_ID:
				return new FailoverEndPointWestOutputConnectorEditPart(view);

			case WSDLEndPointEditPart.VISUAL_ID:
				return new WSDLEndPointEditPart(view);

			case WSDLEndPointEndPointNameEditPart.VISUAL_ID:
				return new WSDLEndPointEndPointNameEditPart(view);

			case WSDLEndPointInputConnectorEditPart.VISUAL_ID:
				return new WSDLEndPointInputConnectorEditPart(view);

			case WSDLEndPointOutputConnectorEditPart.VISUAL_ID:
				return new WSDLEndPointOutputConnectorEditPart(view);

			case NamedEndpointEditPart.VISUAL_ID:
				return new NamedEndpointEditPart(view);

			case NamedEndpointNameEditPart.VISUAL_ID:
				return new NamedEndpointNameEditPart(view);

			case NamedEndpointInputConnectorEditPart.VISUAL_ID:
				return new NamedEndpointInputConnectorEditPart(view);

			case NamedEndpointOutputConnectorEditPart.VISUAL_ID:
				return new NamedEndpointOutputConnectorEditPart(view);

			case LoadBalanceEndPointEditPart.VISUAL_ID:
				return new LoadBalanceEndPointEditPart(view);

			case LoadBalanceEndPointEndPointNameEditPart.VISUAL_ID:
				return new LoadBalanceEndPointEndPointNameEditPart(view);

			case LoadBalanceEndPointInputConnectorEditPart.VISUAL_ID:
				return new LoadBalanceEndPointInputConnectorEditPart(view);

			case LoadBalanceEndPointOutputConnectorEditPart.VISUAL_ID:
				return new LoadBalanceEndPointOutputConnectorEditPart(view);

			case LoadBalanceEndPointWestOutputConnectorEditPart.VISUAL_ID:
				return new LoadBalanceEndPointWestOutputConnectorEditPart(view);

			case APIResourceEndpointEditPart.VISUAL_ID:
				return new APIResourceEndpointEditPart(view);

			case APIResourceEndpointInputConnectorEditPart.VISUAL_ID:
				return new APIResourceEndpointInputConnectorEditPart(view);

			case APIResourceEndpointOutputConnectorEditPart.VISUAL_ID:
				return new APIResourceEndpointOutputConnectorEditPart(view);

			case SwitchDefaultContainerEditPart.VISUAL_ID:
				return new SwitchDefaultContainerEditPart(view);

			case MediatorFlow4EditPart.VISUAL_ID:
				return new MediatorFlow4EditPart(view);

			case FilterFailContainerEditPart.VISUAL_ID:
				return new FilterFailContainerEditPart(view);

			case MediatorFlow8EditPart.VISUAL_ID:
				return new MediatorFlow8EditPart(view);

			case ThrottleOnRejectContainerEditPart.VISUAL_ID:
				return new ThrottleOnRejectContainerEditPart(view);

			case MediatorFlow10EditPart.VISUAL_ID:
				return new MediatorFlow10EditPart(view);

			case ProxyServiceFaultContainerEditPart.VISUAL_ID:
				return new ProxyServiceFaultContainerEditPart(view);

			case MediatorFlow6EditPart.VISUAL_ID:
				return new MediatorFlow6EditPart(view);

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

			case SequencesEditPart.VISUAL_ID:
				return new SequencesEditPart(view);

			case MediatorFlow5EditPart.VISUAL_ID:
				return new MediatorFlow5EditPart(view);

			case SequencesInputConnectorEditPart.VISUAL_ID:
				return new SequencesInputConnectorEditPart(view);

			case SequencesOutputConnectorEditPart.VISUAL_ID:
				return new SequencesOutputConnectorEditPart(view);

			case EndpointDiagramEditPart.VISUAL_ID:
				return new EndpointDiagramEditPart(view);

			case DefaultEndPoint2EditPart.VISUAL_ID:
				return new DefaultEndPoint2EditPart(view);

			case DefaultEndPointEndPointName2EditPart.VISUAL_ID:
				return new DefaultEndPointEndPointName2EditPart(view);

			case DefaultEndPointInputConnector2EditPart.VISUAL_ID:
				return new DefaultEndPointInputConnector2EditPart(view);

			case DefaultEndPointOutputConnector2EditPart.VISUAL_ID:
				return new DefaultEndPointOutputConnector2EditPart(view);

			case AddressEndPoint2EditPart.VISUAL_ID:
				return new AddressEndPoint2EditPart(view);

			case AddressEndPointEndPointName2EditPart.VISUAL_ID:
				return new AddressEndPointEndPointName2EditPart(view);

			case AddressEndPointInputConnector2EditPart.VISUAL_ID:
				return new AddressEndPointInputConnector2EditPart(view);

			case AddressEndPointOutputConnector2EditPart.VISUAL_ID:
				return new AddressEndPointOutputConnector2EditPart(view);

			case FailoverEndPoint2EditPart.VISUAL_ID:
				return new FailoverEndPoint2EditPart(view);

			case FailoverEndPointEndPointName2EditPart.VISUAL_ID:
				return new FailoverEndPointEndPointName2EditPart(view);

			case FailoverEndPointInputConnector2EditPart.VISUAL_ID:
				return new FailoverEndPointInputConnector2EditPart(view);

			case FailoverEndPointOutputConnector2EditPart.VISUAL_ID:
				return new FailoverEndPointOutputConnector2EditPart(view);

			case FailoverEndPointWestOutputConnector2EditPart.VISUAL_ID:
				return new FailoverEndPointWestOutputConnector2EditPart(view);

			case WSDLEndPoint2EditPart.VISUAL_ID:
				return new WSDLEndPoint2EditPart(view);

			case WSDLEndPointEndPointName2EditPart.VISUAL_ID:
				return new WSDLEndPointEndPointName2EditPart(view);

			case WSDLEndPointInputConnector2EditPart.VISUAL_ID:
				return new WSDLEndPointInputConnector2EditPart(view);

			case WSDLEndPointOutputConnector2EditPart.VISUAL_ID:
				return new WSDLEndPointOutputConnector2EditPart(view);

			case LoadBalanceEndPoint2EditPart.VISUAL_ID:
				return new LoadBalanceEndPoint2EditPart(view);

			case LoadBalanceEndPointEndPointName2EditPart.VISUAL_ID:
				return new LoadBalanceEndPointEndPointName2EditPart(view);

			case LoadBalanceEndPointInputConnector2EditPart.VISUAL_ID:
				return new LoadBalanceEndPointInputConnector2EditPart(view);

			case LoadBalanceEndPointOutputConnector2EditPart.VISUAL_ID:
				return new LoadBalanceEndPointOutputConnector2EditPart(view);

			case LoadBalanceEndPointWestOutputConnector2EditPart.VISUAL_ID:
				return new LoadBalanceEndPointWestOutputConnector2EditPart(view);

			case LocalEntryEditPart.VISUAL_ID:
				return new LocalEntryEditPart(view);

			case TemplateEditPart.VISUAL_ID:
				return new TemplateEditPart(view);

			case Sequences2EditPart.VISUAL_ID:
				return new Sequences2EditPart(view);

			case EndpointDiagram2EditPart.VISUAL_ID:
				return new EndpointDiagram2EditPart(view);

			case TaskEditPart.VISUAL_ID:
				return new TaskEditPart(view);

			case SynapseAPIEditPart.VISUAL_ID:
				return new SynapseAPIEditPart(view);

			case APIResourceEditPart.VISUAL_ID:
				return new APIResourceEditPart(view);

			case APIResourceInputConnectorEditPart.VISUAL_ID:
				return new APIResourceInputConnectorEditPart(view);

			case APIResourceOutputConnectorEditPart.VISUAL_ID:
				return new APIResourceOutputConnectorEditPart(view);

			case APIResourceFaultInputConnectorEditPart.VISUAL_ID:
				return new APIResourceFaultInputConnectorEditPart(view);

			case ProxyServiceContainer2EditPart.VISUAL_ID:
				return new ProxyServiceContainer2EditPart(view);

			case ComplexEndpointsEditPart.VISUAL_ID:
				return new ComplexEndpointsEditPart(view);

			case MediatorFlow18EditPart.VISUAL_ID:
				return new MediatorFlow18EditPart(view);

			case ComplexEndpointsOutputConnectorEditPart.VISUAL_ID:
				return new ComplexEndpointsOutputConnectorEditPart(view);

			case EsbServerContentsCompartmentEditPart.VISUAL_ID:
				return new EsbServerContentsCompartmentEditPart(view);

			case MediatorFlowMediatorFlowCompartmentEditPart.VISUAL_ID:
				return new MediatorFlowMediatorFlowCompartmentEditPart(view);

			case MediatorFlowMediatorFlowCompartment9EditPart.VISUAL_ID:
				return new MediatorFlowMediatorFlowCompartment9EditPart(view);

			case MediatorFlowMediatorFlowCompartment7EditPart.VISUAL_ID:
				return new MediatorFlowMediatorFlowCompartment7EditPart(view);

			case MediatorFlowMediatorFlowCompartment2EditPart.VISUAL_ID:
				return new MediatorFlowMediatorFlowCompartment2EditPart(view);

			case EndpointFlowEndpointCompartmentEditPart.VISUAL_ID:
				return new EndpointFlowEndpointCompartmentEditPart(view);

			case MediatorFlowMediatorFlowCompartment11EditPart.VISUAL_ID:
				return new MediatorFlowMediatorFlowCompartment11EditPart(view);

			case MediatorFlowMediatorFlowCompartment13EditPart.VISUAL_ID:
				return new MediatorFlowMediatorFlowCompartment13EditPart(view);

			case MediatorFlowMediatorFlowCompartment12EditPart.VISUAL_ID:
				return new MediatorFlowMediatorFlowCompartment12EditPart(view);

			case MediatorFlowMediatorFlowCompartment17EditPart.VISUAL_ID:
				return new MediatorFlowMediatorFlowCompartment17EditPart(view);

			case MediatorFlowMediatorFlowCompartment3EditPart.VISUAL_ID:
				return new MediatorFlowMediatorFlowCompartment3EditPart(view);

			case MediatorFlowMediatorFlowCompartment14EditPart.VISUAL_ID:
				return new MediatorFlowMediatorFlowCompartment14EditPart(view);

			case MediatorFlowMediatorFlowCompartment15EditPart.VISUAL_ID:
				return new MediatorFlowMediatorFlowCompartment15EditPart(view);

			case MediatorFlowMediatorFlowCompartment16EditPart.VISUAL_ID:
				return new MediatorFlowMediatorFlowCompartment16EditPart(view);

			case MediatorFlowMediatorFlowCompartment4EditPart.VISUAL_ID:
				return new MediatorFlowMediatorFlowCompartment4EditPart(view);

			case MediatorFlowMediatorFlowCompartment8EditPart.VISUAL_ID:
				return new MediatorFlowMediatorFlowCompartment8EditPart(view);

			case MediatorFlowMediatorFlowCompartment10EditPart.VISUAL_ID:
				return new MediatorFlowMediatorFlowCompartment10EditPart(view);

			case MediatorFlowMediatorFlowCompartment6EditPart.VISUAL_ID:
				return new MediatorFlowMediatorFlowCompartment6EditPart(view);

			case MediatorFlowMediatorFlowCompartment5EditPart.VISUAL_ID:
				return new MediatorFlowMediatorFlowCompartment5EditPart(view);

			case EndpointDiagramEndpointCompartmentEditPart.VISUAL_ID:
				return new EndpointDiagramEndpointCompartmentEditPart(view);

			case TemplateTemplateCompartmentEditPart.VISUAL_ID:
				return new TemplateTemplateCompartmentEditPart(view);

			case EndpointDiagramEndpointCompartment2EditPart.VISUAL_ID:
				return new EndpointDiagramEndpointCompartment2EditPart(view);

			case SynapseAPIAPICompartmentEditPart.VISUAL_ID:
				return new SynapseAPIAPICompartmentEditPart(view);

			case MediatorFlowMediatorFlowCompartment18EditPart.VISUAL_ID:
				return new MediatorFlowMediatorFlowCompartment18EditPart(view);

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
