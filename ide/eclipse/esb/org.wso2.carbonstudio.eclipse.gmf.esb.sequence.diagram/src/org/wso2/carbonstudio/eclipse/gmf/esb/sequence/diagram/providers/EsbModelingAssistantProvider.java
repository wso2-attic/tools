package org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.providers;

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
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.part.EsbDiagramEditorPlugin;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.part.Messages;

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
		if (editPart instanceof SequenceDiagramEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(EsbElementTypes.EsbSequence_2501);
			return types;
		}
		if (editPart instanceof EsbSequenceEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(EsbElementTypes.EsbSequenceInputConnector_3517);
			types.add(EsbElementTypes.EsbSequenceOutputConnector_3518);
			return types;
		}
		if (editPart instanceof LogMediatorEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(EsbElementTypes.LogMediatorInputConnector_3502);
			types.add(EsbElementTypes.LogMediatorOutputConnector_3503);
			return types;
		}
		if (editPart instanceof PropertyMediatorEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(EsbElementTypes.PropertyMediatorInputConnector_3513);
			types.add(EsbElementTypes.PropertyMediatorOutputConnector_3514);
			return types;
		}
		if (editPart instanceof DropMediatorEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(EsbElementTypes.DropMediatorInputConnector_3520);
			return types;
		}
		if (editPart instanceof EnrichMediatorEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(EsbElementTypes.EnrichMediatorInputConnector_3522);
			types.add(EsbElementTypes.EnrichMediatorOutputConnector_3523);
			return types;
		}
		if (editPart instanceof FilterMediatorEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(3);
			types.add(EsbElementTypes.FilterMediatorInputConnector_3525);
			types.add(EsbElementTypes.FilterMediatorPassOutputConnector_3526);
			types.add(EsbElementTypes.FilterMediatorFailOutputConnector_3527);
			return types;
		}
		if (editPart instanceof XSLTMediatorEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(EsbElementTypes.XSLTMediatorInputConnector_3529);
			types.add(EsbElementTypes.XSLTMediatorOutputConnector_3530);
			return types;
		}
		if (editPart instanceof EventMediatorEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(EsbElementTypes.EventMediatorInputConnector_3532);
			types.add(EsbElementTypes.EventMediatorOutputConnector_3533);
			return types;
		}
		if (editPart instanceof EntitlementMediatorEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(EsbElementTypes.EntitlementMediatorInputConnector_3535);
			types.add(EsbElementTypes.EntitlementMediatorOutputConnector_3536);
			return types;
		}
		if (editPart instanceof SwitchMediatorEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(3);
			types.add(EsbElementTypes.SwitchMediatorInputConnector_3538);
			types.add(EsbElementTypes.SwitchCaseBranchOutputConnector_3539);
			types.add(EsbElementTypes.SwitchDefaultBranchOutputConnector_3540);
			return types;
		}
		if (editPart instanceof ClassMediatorEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(EsbElementTypes.ClassMediatorInputConnector_3542);
			types.add(EsbElementTypes.ClassMediatorOutputConnector_3543);
			return types;
		}
		if (editPart instanceof SpringMediatorEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(EsbElementTypes.SpringMediatorInputConnector_3545);
			types.add(EsbElementTypes.SpringMediatorOutputConnector_3546);
			return types;
		}
		if (editPart instanceof ScriptMediatorEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(EsbElementTypes.ScriptMediatorInputConnector_3548);
			types.add(EsbElementTypes.ScriptMediatorOutputConnector_3549);
			return types;
		}
		if (editPart instanceof FaultMediatorEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(EsbElementTypes.FaultMediatorInputConnector_3551);
			types.add(EsbElementTypes.FaultMediatorOutputConnector_3552);
			return types;
		}
		if (editPart instanceof XQueryMediatorEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(EsbElementTypes.XQueryMediatorInputConnector_3554);
			types.add(EsbElementTypes.XQueryMediatorOutputConnector_3555);
			return types;
		}
		if (editPart instanceof CommandMediatorEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(EsbElementTypes.CommandMediatorInputConnector_3557);
			types.add(EsbElementTypes.CommandMediatorOutputConnector_3558);
			return types;
		}
		if (editPart instanceof DBLookupMediatorEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(EsbElementTypes.DBLookupMediatorInputConnector_3560);
			types.add(EsbElementTypes.DBLookupMediatorOutputConnector_3561);
			return types;
		}
		if (editPart instanceof DBReportMediatorEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(EsbElementTypes.DBReportMediatorInputConnector_3563);
			types.add(EsbElementTypes.DBReportMediatorOutputConnector_3564);
			return types;
		}
		if (editPart instanceof SmooksMediatorEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(EsbElementTypes.SmooksMediatorInputConnector_3566);
			types.add(EsbElementTypes.SmooksMediatorOutputConnector_3567);
			return types;
		}
		if (editPart instanceof SendMediatorEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(EsbElementTypes.SendMediatorInputConnector_3569);
			types.add(EsbElementTypes.SendMediatorOutputConnector_3570);
			return types;
		}
		if (editPart instanceof HeaderMediatorEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(EsbElementTypes.HeaderMediatorInputConnector_3572);
			types.add(EsbElementTypes.HeaderMediatorOutputConnector_3573);
			return types;
		}
		if (editPart instanceof CloneMediatorEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(EsbElementTypes.CloneMediatorInputConnector_3575);
			types.add(EsbElementTypes.CloneMediatorOutputConnector_3576);
			return types;
		}
		if (editPart instanceof CacheMediatorEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(EsbElementTypes.CacheMediatorInputConnector_3578);
			types.add(EsbElementTypes.CacheMediatorOutputConnector_3579);
			return types;
		}
		if (editPart instanceof IterateMediatorEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(EsbElementTypes.IterateMediatorInputConnector_3581);
			types.add(EsbElementTypes.IterateMediatorOutputConnector_3582);
			return types;
		}
		if (editPart instanceof AggregateMediatorEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(3);
			types.add(EsbElementTypes.AggregateMediatorInputConnector_3584);
			types.add(EsbElementTypes.AggregateMediatorOutputConnector_3585);
			types.add(EsbElementTypes.AggregateMediatorOnCompleteOutputConnector_3604);
			return types;
		}
		if (editPart instanceof CalloutMediatorEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(EsbElementTypes.CalloutMediatorInputConnector_3587);
			types.add(EsbElementTypes.CalloutMediatorOutputConnector_3588);
			return types;
		}
		if (editPart instanceof TransactionMediatorEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(EsbElementTypes.TransactionMediatorInputConnector_3590);
			types.add(EsbElementTypes.TransactionMediatorOutputConnector_3591);
			return types;
		}
		if (editPart instanceof ThrottleMediatorEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(EsbElementTypes.ThrottleMediatorInputConnector_3593);
			types.add(EsbElementTypes.ThrottleMediatorOutputConnector_3594);
			return types;
		}
		if (editPart instanceof RMSequenceMediatorEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(EsbElementTypes.RMSequenceMediatorInputConnector_3596);
			types.add(EsbElementTypes.RMSequenceMediatorOutputConnector_3597);
			return types;
		}
		if (editPart instanceof RuleMediatorEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(EsbElementTypes.RuleMediatorInputConnector_3599);
			types.add(EsbElementTypes.RuleMediatorOutputConnector_3600);
			return types;
		}
		if (editPart instanceof OAuthMediatorEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(EsbElementTypes.OAuthMediatorInputConnector_3602);
			types.add(EsbElementTypes.OAuthMediatorOutputConnector_3603);
			return types;
		}
		if (editPart instanceof EsbSequenceSeqContentsCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(30);
			types.add(EsbElementTypes.LogMediator_3501);
			types.add(EsbElementTypes.PropertyMediator_3512);
			types.add(EsbElementTypes.DropMediator_3519);
			types.add(EsbElementTypes.EnrichMediator_3521);
			types.add(EsbElementTypes.FilterMediator_3524);
			types.add(EsbElementTypes.XSLTMediator_3528);
			types.add(EsbElementTypes.EventMediator_3531);
			types.add(EsbElementTypes.EntitlementMediator_3534);
			types.add(EsbElementTypes.SwitchMediator_3537);
			types.add(EsbElementTypes.ClassMediator_3541);
			types.add(EsbElementTypes.SpringMediator_3544);
			types.add(EsbElementTypes.ScriptMediator_3547);
			types.add(EsbElementTypes.FaultMediator_3550);
			types.add(EsbElementTypes.XQueryMediator_3553);
			types.add(EsbElementTypes.CommandMediator_3556);
			types.add(EsbElementTypes.DBLookupMediator_3559);
			types.add(EsbElementTypes.DBReportMediator_3562);
			types.add(EsbElementTypes.SmooksMediator_3565);
			types.add(EsbElementTypes.SendMediator_3568);
			types.add(EsbElementTypes.HeaderMediator_3571);
			types.add(EsbElementTypes.CloneMediator_3574);
			types.add(EsbElementTypes.CacheMediator_3577);
			types.add(EsbElementTypes.IterateMediator_3580);
			types.add(EsbElementTypes.AggregateMediator_3583);
			types.add(EsbElementTypes.CalloutMediator_3586);
			types.add(EsbElementTypes.TransactionMediator_3589);
			types.add(EsbElementTypes.ThrottleMediator_3592);
			types.add(EsbElementTypes.RMSequenceMediator_3595);
			types.add(EsbElementTypes.RuleMediator_3598);
			types.add(EsbElementTypes.OAuthMediator_3601);
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
		if (sourceEditPart instanceof LogMediatorOutputConnectorEditPart) {
			return ((LogMediatorOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof PropertyMediatorOutputConnectorEditPart) {
			return ((PropertyMediatorOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof EsbSequenceInputConnectorEditPart) {
			return ((EsbSequenceInputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof EnrichMediatorOutputConnectorEditPart) {
			return ((EnrichMediatorOutputConnectorEditPart) sourceEditPart)
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
		if (sourceEditPart instanceof XSLTMediatorOutputConnectorEditPart) {
			return ((XSLTMediatorOutputConnectorEditPart) sourceEditPart)
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
		if (sourceEditPart instanceof SwitchCaseBranchOutputConnectorEditPart) {
			return ((SwitchCaseBranchOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof SwitchDefaultBranchOutputConnectorEditPart) {
			return ((SwitchDefaultBranchOutputConnectorEditPart) sourceEditPart)
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
		if (sourceEditPart instanceof HeaderMediatorOutputConnectorEditPart) {
			return ((HeaderMediatorOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof CloneMediatorOutputConnectorEditPart) {
			return ((CloneMediatorOutputConnectorEditPart) sourceEditPart)
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
		if (sourceEditPart instanceof AggregateMediatorOutputConnectorEditPart) {
			return ((AggregateMediatorOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof AggregateMediatorOnCompleteOutputConnectorEditPart) {
			return ((AggregateMediatorOnCompleteOutputConnectorEditPart) sourceEditPart)
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
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof LogMediatorInputConnectorEditPart) {
			return ((LogMediatorInputConnectorEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof PropertyMediatorInputConnectorEditPart) {
			return ((PropertyMediatorInputConnectorEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof EsbSequenceOutputConnectorEditPart) {
			return ((EsbSequenceOutputConnectorEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof DropMediatorInputConnectorEditPart) {
			return ((DropMediatorInputConnectorEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof EnrichMediatorInputConnectorEditPart) {
			return ((EnrichMediatorInputConnectorEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof FilterMediatorInputConnectorEditPart) {
			return ((FilterMediatorInputConnectorEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof XSLTMediatorInputConnectorEditPart) {
			return ((XSLTMediatorInputConnectorEditPart) targetEditPart)
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
		if (targetEditPart instanceof SwitchMediatorInputConnectorEditPart) {
			return ((SwitchMediatorInputConnectorEditPart) targetEditPart)
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
		if (targetEditPart instanceof AggregateMediatorInputConnectorEditPart) {
			return ((AggregateMediatorInputConnectorEditPart) targetEditPart)
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
		if (sourceEditPart instanceof LogMediatorOutputConnectorEditPart) {
			return ((LogMediatorOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof PropertyMediatorOutputConnectorEditPart) {
			return ((PropertyMediatorOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof EsbSequenceInputConnectorEditPart) {
			return ((EsbSequenceInputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof EnrichMediatorOutputConnectorEditPart) {
			return ((EnrichMediatorOutputConnectorEditPart) sourceEditPart)
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
		if (sourceEditPart instanceof XSLTMediatorOutputConnectorEditPart) {
			return ((XSLTMediatorOutputConnectorEditPart) sourceEditPart)
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
		if (sourceEditPart instanceof SwitchCaseBranchOutputConnectorEditPart) {
			return ((SwitchCaseBranchOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof SwitchDefaultBranchOutputConnectorEditPart) {
			return ((SwitchDefaultBranchOutputConnectorEditPart) sourceEditPart)
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
		if (sourceEditPart instanceof HeaderMediatorOutputConnectorEditPart) {
			return ((HeaderMediatorOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof CloneMediatorOutputConnectorEditPart) {
			return ((CloneMediatorOutputConnectorEditPart) sourceEditPart)
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
		if (sourceEditPart instanceof AggregateMediatorOutputConnectorEditPart) {
			return ((AggregateMediatorOutputConnectorEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof AggregateMediatorOnCompleteOutputConnectorEditPart) {
			return ((AggregateMediatorOnCompleteOutputConnectorEditPart) sourceEditPart)
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
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof LogMediatorInputConnectorEditPart) {
			return ((LogMediatorInputConnectorEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof PropertyMediatorInputConnectorEditPart) {
			return ((PropertyMediatorInputConnectorEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof EsbSequenceOutputConnectorEditPart) {
			return ((EsbSequenceOutputConnectorEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof DropMediatorInputConnectorEditPart) {
			return ((DropMediatorInputConnectorEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof EnrichMediatorInputConnectorEditPart) {
			return ((EnrichMediatorInputConnectorEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof FilterMediatorInputConnectorEditPart) {
			return ((FilterMediatorInputConnectorEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof XSLTMediatorInputConnectorEditPart) {
			return ((XSLTMediatorInputConnectorEditPart) targetEditPart)
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
		if (targetEditPart instanceof SwitchMediatorInputConnectorEditPart) {
			return ((SwitchMediatorInputConnectorEditPart) targetEditPart)
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
		if (targetEditPart instanceof AggregateMediatorInputConnectorEditPart) {
			return ((AggregateMediatorInputConnectorEditPart) targetEditPart)
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
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof LogMediatorOutputConnectorEditPart) {
			return ((LogMediatorOutputConnectorEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof PropertyMediatorOutputConnectorEditPart) {
			return ((PropertyMediatorOutputConnectorEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof EsbSequenceInputConnectorEditPart) {
			return ((EsbSequenceInputConnectorEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof EnrichMediatorOutputConnectorEditPart) {
			return ((EnrichMediatorOutputConnectorEditPart) sourceEditPart)
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
		if (sourceEditPart instanceof XSLTMediatorOutputConnectorEditPart) {
			return ((XSLTMediatorOutputConnectorEditPart) sourceEditPart)
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
		if (sourceEditPart instanceof SwitchCaseBranchOutputConnectorEditPart) {
			return ((SwitchCaseBranchOutputConnectorEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof SwitchDefaultBranchOutputConnectorEditPart) {
			return ((SwitchDefaultBranchOutputConnectorEditPart) sourceEditPart)
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
		if (sourceEditPart instanceof HeaderMediatorOutputConnectorEditPart) {
			return ((HeaderMediatorOutputConnectorEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof CloneMediatorOutputConnectorEditPart) {
			return ((CloneMediatorOutputConnectorEditPart) sourceEditPart)
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
		if (sourceEditPart instanceof AggregateMediatorOutputConnectorEditPart) {
			return ((AggregateMediatorOutputConnectorEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof AggregateMediatorOnCompleteOutputConnectorEditPart) {
			return ((AggregateMediatorOnCompleteOutputConnectorEditPart) sourceEditPart)
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
