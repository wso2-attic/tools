package org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.commands.AggregateMediatorCreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.commands.CacheMediatorCreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.commands.CalloutMediatorCreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.commands.ClassMediatorCreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.commands.CloneMediatorCreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.commands.CommandMediatorCreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.commands.DBLookupMediatorCreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.commands.DBReportMediatorCreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.commands.DropMediator3CreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.commands.EnrichMediatorCreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.commands.EntitlementMediatorCreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.commands.EventMediatorCreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.commands.FaultMediatorCreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.commands.FilterMediatorCreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.commands.HeaderMediatorCreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.commands.IterateMediatorCreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.commands.LogMediatorCreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.commands.OAuthMediatorCreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.commands.PropertyMediator3CreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.commands.RMSequenceMediatorCreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.commands.RuleMediatorCreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.commands.ScriptMediatorCreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.commands.SendMediatorCreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.commands.SequenceCreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.commands.SmooksMediatorCreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.commands.SpringMediatorCreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.commands.SwitchMediatorCreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.commands.ThrottleMediatorCreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.commands.TransactionMediatorCreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.commands.XQueryMediatorCreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.commands.XSLTMediatorCreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.providers.EsbElementTypes;

/**
 * @generated
 */
public class ProxyServiceInSequenceProxyServiceInSequenceCompartmentItemSemanticEditPolicy
		extends EsbBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ProxyServiceInSequenceProxyServiceInSequenceCompartmentItemSemanticEditPolicy() {
		super(EsbElementTypes.ProxyServiceInSequence_3197);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (EsbElementTypes.DropMediator_3191 == req.getElementType()) {
			return getGEFWrapper(new DropMediator3CreateCommand(req));
		}
		if (EsbElementTypes.PropertyMediator_3199 == req.getElementType()) {
			return getGEFWrapper(new PropertyMediator3CreateCommand(req));
		}
		if (EsbElementTypes.ThrottleMediator_3205 == req.getElementType()) {
			return getGEFWrapper(new ThrottleMediatorCreateCommand(req));
		}
		if (EsbElementTypes.FilterMediator_3209 == req.getElementType()) {
			return getGEFWrapper(new FilterMediatorCreateCommand(req));
		}
		if (EsbElementTypes.LogMediator_3210 == req.getElementType()) {
			return getGEFWrapper(new LogMediatorCreateCommand(req));
		}
		if (EsbElementTypes.EnrichMediator_3387 == req.getElementType()) {
			return getGEFWrapper(new EnrichMediatorCreateCommand(req));
		}
		if (EsbElementTypes.XSLTMediator_3212 == req.getElementType()) {
			return getGEFWrapper(new XSLTMediatorCreateCommand(req));
		}
		if (EsbElementTypes.SwitchMediator_3213 == req.getElementType()) {
			return getGEFWrapper(new SwitchMediatorCreateCommand(req));
		}
		if (EsbElementTypes.Sequence_3214 == req.getElementType()) {
			return getGEFWrapper(new SequenceCreateCommand(req));
		}
		if (EsbElementTypes.EventMediator_3215 == req.getElementType()) {
			return getGEFWrapper(new EventMediatorCreateCommand(req));
		}
		if (EsbElementTypes.EntitlementMediator_3216 == req.getElementType()) {
			return getGEFWrapper(new EntitlementMediatorCreateCommand(req));
		}
		if (EsbElementTypes.ClassMediator_3217 == req.getElementType()) {
			return getGEFWrapper(new ClassMediatorCreateCommand(req));
		}
		if (EsbElementTypes.SpringMediator_3218 == req.getElementType()) {
			return getGEFWrapper(new SpringMediatorCreateCommand(req));
		}
		if (EsbElementTypes.ScriptMediator_3219 == req.getElementType()) {
			return getGEFWrapper(new ScriptMediatorCreateCommand(req));
		}
		if (EsbElementTypes.FaultMediator_3220 == req.getElementType()) {
			return getGEFWrapper(new FaultMediatorCreateCommand(req));
		}
		if (EsbElementTypes.XQueryMediator_3221 == req.getElementType()) {
			return getGEFWrapper(new XQueryMediatorCreateCommand(req));
		}
		if (EsbElementTypes.CommandMediator_3222 == req.getElementType()) {
			return getGEFWrapper(new CommandMediatorCreateCommand(req));
		}
		if (EsbElementTypes.DBLookupMediator_3223 == req.getElementType()) {
			return getGEFWrapper(new DBLookupMediatorCreateCommand(req));
		}
		if (EsbElementTypes.DBReportMediator_3224 == req.getElementType()) {
			return getGEFWrapper(new DBReportMediatorCreateCommand(req));
		}
		if (EsbElementTypes.SmooksMediator_3225 == req.getElementType()) {
			return getGEFWrapper(new SmooksMediatorCreateCommand(req));
		}
		if (EsbElementTypes.SendMediator_3226 == req.getElementType()) {
			return getGEFWrapper(new SendMediatorCreateCommand(req));
		}
		if (EsbElementTypes.HeaderMediator_3227 == req.getElementType()) {
			return getGEFWrapper(new HeaderMediatorCreateCommand(req));
		}
		if (EsbElementTypes.CloneMediator_3228 == req.getElementType()) {
			return getGEFWrapper(new CloneMediatorCreateCommand(req));
		}
		if (EsbElementTypes.CacheMediator_3229 == req.getElementType()) {
			return getGEFWrapper(new CacheMediatorCreateCommand(req));
		}
		if (EsbElementTypes.IterateMediator_3230 == req.getElementType()) {
			return getGEFWrapper(new IterateMediatorCreateCommand(req));
		}
		if (EsbElementTypes.CalloutMediator_3231 == req.getElementType()) {
			return getGEFWrapper(new CalloutMediatorCreateCommand(req));
		}
		if (EsbElementTypes.TransactionMediator_3232 == req.getElementType()) {
			return getGEFWrapper(new TransactionMediatorCreateCommand(req));
		}
		if (EsbElementTypes.RMSequenceMediator_3233 == req.getElementType()) {
			return getGEFWrapper(new RMSequenceMediatorCreateCommand(req));
		}
		if (EsbElementTypes.RuleMediator_3234 == req.getElementType()) {
			return getGEFWrapper(new RuleMediatorCreateCommand(req));
		}
		if (EsbElementTypes.OAuthMediator_3235 == req.getElementType()) {
			return getGEFWrapper(new OAuthMediatorCreateCommand(req));
		}
		if (EsbElementTypes.AggregateMediator_3236 == req.getElementType()) {
			return getGEFWrapper(new AggregateMediatorCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
