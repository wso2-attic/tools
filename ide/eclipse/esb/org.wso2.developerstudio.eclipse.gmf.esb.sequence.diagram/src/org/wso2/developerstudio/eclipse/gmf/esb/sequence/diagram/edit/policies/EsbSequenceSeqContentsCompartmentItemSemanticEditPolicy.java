package org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.commands.AggregateMediatorCreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.commands.CacheMediatorCreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.commands.CalloutMediatorCreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.commands.ClassMediatorCreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.commands.CloneMediatorCreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.commands.CommandMediatorCreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.commands.DBLookupMediatorCreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.commands.DBReportMediatorCreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.commands.DropMediatorCreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.commands.EnrichMediatorCreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.commands.EntitlementMediatorCreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.commands.EventMediatorCreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.commands.FaultMediatorCreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.commands.FilterMediatorCreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.commands.HeaderMediatorCreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.commands.IterateMediatorCreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.commands.LogMediatorCreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.commands.OAuthMediatorCreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.commands.PropertyMediatorCreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.commands.RMSequenceMediatorCreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.commands.RuleMediatorCreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.commands.ScriptMediatorCreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.commands.SendMediatorCreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.commands.SmooksMediatorCreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.commands.SpringMediatorCreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.commands.SwitchMediatorCreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.commands.ThrottleMediatorCreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.commands.TransactionMediatorCreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.commands.XQueryMediatorCreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.edit.commands.XSLTMediatorCreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.sequence.diagram.providers.EsbElementTypes;

/**
 * @generated
 */
public class EsbSequenceSeqContentsCompartmentItemSemanticEditPolicy extends
		EsbBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public EsbSequenceSeqContentsCompartmentItemSemanticEditPolicy() {
		super(EsbElementTypes.EsbSequence_2501);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (EsbElementTypes.LogMediator_3501 == req.getElementType()) {
			return getGEFWrapper(new LogMediatorCreateCommand(req));
		}
		if (EsbElementTypes.PropertyMediator_3512 == req.getElementType()) {
			return getGEFWrapper(new PropertyMediatorCreateCommand(req));
		}
		if (EsbElementTypes.DropMediator_3519 == req.getElementType()) {
			return getGEFWrapper(new DropMediatorCreateCommand(req));
		}
		if (EsbElementTypes.EnrichMediator_3521 == req.getElementType()) {
			return getGEFWrapper(new EnrichMediatorCreateCommand(req));
		}
		if (EsbElementTypes.FilterMediator_3524 == req.getElementType()) {
			return getGEFWrapper(new FilterMediatorCreateCommand(req));
		}
		if (EsbElementTypes.XSLTMediator_3528 == req.getElementType()) {
			return getGEFWrapper(new XSLTMediatorCreateCommand(req));
		}
		if (EsbElementTypes.EventMediator_3531 == req.getElementType()) {
			return getGEFWrapper(new EventMediatorCreateCommand(req));
		}
		if (EsbElementTypes.EntitlementMediator_3534 == req.getElementType()) {
			return getGEFWrapper(new EntitlementMediatorCreateCommand(req));
		}
		if (EsbElementTypes.SwitchMediator_3537 == req.getElementType()) {
			return getGEFWrapper(new SwitchMediatorCreateCommand(req));
		}
		if (EsbElementTypes.ClassMediator_3541 == req.getElementType()) {
			return getGEFWrapper(new ClassMediatorCreateCommand(req));
		}
		if (EsbElementTypes.SpringMediator_3544 == req.getElementType()) {
			return getGEFWrapper(new SpringMediatorCreateCommand(req));
		}
		if (EsbElementTypes.ScriptMediator_3547 == req.getElementType()) {
			return getGEFWrapper(new ScriptMediatorCreateCommand(req));
		}
		if (EsbElementTypes.FaultMediator_3550 == req.getElementType()) {
			return getGEFWrapper(new FaultMediatorCreateCommand(req));
		}
		if (EsbElementTypes.XQueryMediator_3553 == req.getElementType()) {
			return getGEFWrapper(new XQueryMediatorCreateCommand(req));
		}
		if (EsbElementTypes.CommandMediator_3556 == req.getElementType()) {
			return getGEFWrapper(new CommandMediatorCreateCommand(req));
		}
		if (EsbElementTypes.DBLookupMediator_3559 == req.getElementType()) {
			return getGEFWrapper(new DBLookupMediatorCreateCommand(req));
		}
		if (EsbElementTypes.DBReportMediator_3562 == req.getElementType()) {
			return getGEFWrapper(new DBReportMediatorCreateCommand(req));
		}
		if (EsbElementTypes.SmooksMediator_3565 == req.getElementType()) {
			return getGEFWrapper(new SmooksMediatorCreateCommand(req));
		}
		if (EsbElementTypes.SendMediator_3568 == req.getElementType()) {
			return getGEFWrapper(new SendMediatorCreateCommand(req));
		}
		if (EsbElementTypes.HeaderMediator_3571 == req.getElementType()) {
			return getGEFWrapper(new HeaderMediatorCreateCommand(req));
		}
		if (EsbElementTypes.CloneMediator_3574 == req.getElementType()) {
			return getGEFWrapper(new CloneMediatorCreateCommand(req));
		}
		if (EsbElementTypes.CacheMediator_3577 == req.getElementType()) {
			return getGEFWrapper(new CacheMediatorCreateCommand(req));
		}
		if (EsbElementTypes.IterateMediator_3580 == req.getElementType()) {
			return getGEFWrapper(new IterateMediatorCreateCommand(req));
		}
		if (EsbElementTypes.AggregateMediator_3583 == req.getElementType()) {
			return getGEFWrapper(new AggregateMediatorCreateCommand(req));
		}
		if (EsbElementTypes.CalloutMediator_3586 == req.getElementType()) {
			return getGEFWrapper(new CalloutMediatorCreateCommand(req));
		}
		if (EsbElementTypes.TransactionMediator_3589 == req.getElementType()) {
			return getGEFWrapper(new TransactionMediatorCreateCommand(req));
		}
		if (EsbElementTypes.ThrottleMediator_3592 == req.getElementType()) {
			return getGEFWrapper(new ThrottleMediatorCreateCommand(req));
		}
		if (EsbElementTypes.RMSequenceMediator_3595 == req.getElementType()) {
			return getGEFWrapper(new RMSequenceMediatorCreateCommand(req));
		}
		if (EsbElementTypes.RuleMediator_3598 == req.getElementType()) {
			return getGEFWrapper(new RuleMediatorCreateCommand(req));
		}
		if (EsbElementTypes.OAuthMediator_3601 == req.getElementType()) {
			return getGEFWrapper(new OAuthMediatorCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
