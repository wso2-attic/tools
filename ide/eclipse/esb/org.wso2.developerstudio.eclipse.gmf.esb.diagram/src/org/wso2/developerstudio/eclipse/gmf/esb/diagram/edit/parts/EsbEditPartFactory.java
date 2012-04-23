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
					return new ProxyServiceSequenceAndEndpointContainerEditPart(view);

				case ProxyServiceSequenceContainerEditPart.VISUAL_ID:
					return new ProxyServiceSequenceContainerEditPart(view);

				case ProxyServiceInSequenceEditPart.VISUAL_ID:
					return new ProxyServiceInSequenceEditPart(view);

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
					return new AggregateMediatorOnCompleteOutputConnectorEditPart(view);

				case MediatorFlow3EditPart.VISUAL_ID:
					return new MediatorFlow3EditPart(view);

				case SwitchDefaultContainerEditPart.VISUAL_ID:
					return new SwitchDefaultContainerEditPart(view);

				case MediatorFlow4EditPart.VISUAL_ID:
					return new MediatorFlow4EditPart(view);

				case ProxyServiceOutSequenceEditPart.VISUAL_ID:
					return new ProxyServiceOutSequenceEditPart(view);

				case MediatorFlow5EditPart.VISUAL_ID:
					return new MediatorFlow5EditPart(view);

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

				case EsbServerContentsCompartmentEditPart.VISUAL_ID:
					return new EsbServerContentsCompartmentEditPart(view);

				case MediatorFlowMediatorFlowCompartmentEditPart.VISUAL_ID:
					return new MediatorFlowMediatorFlowCompartmentEditPart(view);

				case MediatorFlowMediatorFlowCompartment2EditPart.VISUAL_ID:
					return new MediatorFlowMediatorFlowCompartment2EditPart(view);

				case MediatorFlowMediatorFlowCompartment3EditPart.VISUAL_ID:
					return new MediatorFlowMediatorFlowCompartment3EditPart(view);

				case MediatorFlowMediatorFlowCompartment4EditPart.VISUAL_ID:
					return new MediatorFlowMediatorFlowCompartment4EditPart(view);

				case MediatorFlowMediatorFlowCompartment5EditPart.VISUAL_ID:
					return new MediatorFlowMediatorFlowCompartment5EditPart(view);

				case ProxyServiceEndpointContainerEndpointCompartmentEditPart.VISUAL_ID:
					return new ProxyServiceEndpointContainerEndpointCompartmentEditPart(view);

				case MediatorFlowMediatorFlowCompartment6EditPart.VISUAL_ID:
					return new MediatorFlowMediatorFlowCompartment6EditPart(view);

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
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
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
				if (getWrapLabel().isTextWrapOn() && getWrapLabel().getText().length() > 0) {
					rect.setSize(new Dimension(text.computeSize(rect.width, SWT.DEFAULT)));
				} else {
					int avr = FigureUtilities.getFontMetrics(text.getFont()).getAverageCharWidth();
					rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT, SWT.DEFAULT)).expand(avr * 2,
					                                                                              0));
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
				int avr = FigureUtilities.getFontMetrics(text.getFont()).getAverageCharWidth();
				rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT, SWT.DEFAULT)).expand(avr * 2,
				                                                                              0));
			}
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}
}
