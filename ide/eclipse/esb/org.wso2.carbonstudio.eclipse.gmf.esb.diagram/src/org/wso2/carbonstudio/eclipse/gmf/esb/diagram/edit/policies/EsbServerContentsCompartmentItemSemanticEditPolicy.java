package org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.AggregateMediatorCreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.CacheMediatorCreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.CalloutMediatorCreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.ClassMediatorCreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.CloneMediatorCreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.CommandMediatorCreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.DBLookupMediatorCreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.DBReportMediatorCreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.DropMediatorCreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.EnrichMediatorCreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.EntitlementMediatorCreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.EventMediatorCreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.FailoverEndPointCreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.FaultMediatorCreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.FilterMediatorCreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.HeaderMediatorCreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.IterateMediatorCreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.LoadBalanceEndPointCreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.LogMediatorCreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.MergeNodeCreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.OAuthMediatorCreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.PropertyMediatorCreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.RMSequenceMediatorCreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.RuleMediatorCreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.ScriptMediatorCreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.SendMediatorCreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.SequenceCreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.SmooksMediatorCreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.SpringMediatorCreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.SwitchMediatorCreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.ThrottleMediatorCreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.TransactionMediatorCreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.XQueryMediatorCreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.XSLTMediatorCreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.providers.EsbElementTypes;

/**
 * @generated
 */
public class EsbServerContentsCompartmentItemSemanticEditPolicy extends
		EsbBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public EsbServerContentsCompartmentItemSemanticEditPolicy() {
		super(EsbElementTypes.EsbServer_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (EsbElementTypes.DropMediator_3007 == req.getElementType()) {
			return getGEFWrapper(new DropMediatorCreateCommand(req));
		}
		if (EsbElementTypes.FilterMediator_3009 == req.getElementType()) {
			return getGEFWrapper(new FilterMediatorCreateCommand(req));
		}
		if (EsbElementTypes.MergeNode_3013 == req.getElementType()) {
			return getGEFWrapper(new MergeNodeCreateCommand(req));
		}
		if (EsbElementTypes.LogMediator_3017 == req.getElementType()) {
			return getGEFWrapper(new LogMediatorCreateCommand(req));
		}
		if (EsbElementTypes.PropertyMediator_3032 == req.getElementType()) {
			return getGEFWrapper(new PropertyMediatorCreateCommand(req));
		}
		if (EsbElementTypes.EnrichMediator_3035 == req.getElementType()) {
			return getGEFWrapper(new EnrichMediatorCreateCommand(req));
		}
		if (EsbElementTypes.XSLTMediator_3038 == req.getElementType()) {
			return getGEFWrapper(new XSLTMediatorCreateCommand(req));
		}
		if (EsbElementTypes.SwitchMediator_3041 == req.getElementType()) {
			return getGEFWrapper(new SwitchMediatorCreateCommand(req));
		}
		if (EsbElementTypes.Sequence_3048 == req.getElementType()) {
			return getGEFWrapper(new SequenceCreateCommand(req));
		}
		if (EsbElementTypes.EventMediator_3051 == req.getElementType()) {
			return getGEFWrapper(new EventMediatorCreateCommand(req));
		}
		if (EsbElementTypes.EntitlementMediator_3054 == req.getElementType()) {
			return getGEFWrapper(new EntitlementMediatorCreateCommand(req));
		}
		if (EsbElementTypes.ClassMediator_3057 == req.getElementType()) {
			return getGEFWrapper(new ClassMediatorCreateCommand(req));
		}
		if (EsbElementTypes.SpringMediator_3060 == req.getElementType()) {
			return getGEFWrapper(new SpringMediatorCreateCommand(req));
		}
		if (EsbElementTypes.ScriptMediator_3063 == req.getElementType()) {
			return getGEFWrapper(new ScriptMediatorCreateCommand(req));
		}
		if (EsbElementTypes.FaultMediator_3066 == req.getElementType()) {
			return getGEFWrapper(new FaultMediatorCreateCommand(req));
		}
		if (EsbElementTypes.XQueryMediator_3069 == req.getElementType()) {
			return getGEFWrapper(new XQueryMediatorCreateCommand(req));
		}
		if (EsbElementTypes.CommandMediator_3072 == req.getElementType()) {
			return getGEFWrapper(new CommandMediatorCreateCommand(req));
		}
		if (EsbElementTypes.DBLookupMediator_3075 == req.getElementType()) {
			return getGEFWrapper(new DBLookupMediatorCreateCommand(req));
		}
		if (EsbElementTypes.DBReportMediator_3078 == req.getElementType()) {
			return getGEFWrapper(new DBReportMediatorCreateCommand(req));
		}
		if (EsbElementTypes.SmooksMediator_3081 == req.getElementType()) {
			return getGEFWrapper(new SmooksMediatorCreateCommand(req));
		}
		if (EsbElementTypes.SendMediator_3084 == req.getElementType()) {
			return getGEFWrapper(new SendMediatorCreateCommand(req));
		}
		if (EsbElementTypes.FailoverEndPoint_3087 == req.getElementType()) {
			return getGEFWrapper(new FailoverEndPointCreateCommand(req));
		}
		if (EsbElementTypes.LoadBalanceEndPoint_3094 == req.getElementType()) {
			return getGEFWrapper(new LoadBalanceEndPointCreateCommand(req));
		}
		if (EsbElementTypes.HeaderMediator_3099 == req.getElementType()) {
			return getGEFWrapper(new HeaderMediatorCreateCommand(req));
		}
		if (EsbElementTypes.CloneMediator_3102 == req.getElementType()) {
			return getGEFWrapper(new CloneMediatorCreateCommand(req));
		}
		if (EsbElementTypes.CacheMediator_3105 == req.getElementType()) {
			return getGEFWrapper(new CacheMediatorCreateCommand(req));
		}
		if (EsbElementTypes.IterateMediator_3108 == req.getElementType()) {
			return getGEFWrapper(new IterateMediatorCreateCommand(req));
		}
		if (EsbElementTypes.CalloutMediator_3114 == req.getElementType()) {
			return getGEFWrapper(new CalloutMediatorCreateCommand(req));
		}
		if (EsbElementTypes.TransactionMediator_3117 == req.getElementType()) {
			return getGEFWrapper(new TransactionMediatorCreateCommand(req));
		}
		if (EsbElementTypes.ThrottleMediator_3120 == req.getElementType()) {
			return getGEFWrapper(new ThrottleMediatorCreateCommand(req));
		}
		if (EsbElementTypes.RMSequenceMediator_3123 == req.getElementType()) {
			return getGEFWrapper(new RMSequenceMediatorCreateCommand(req));
		}
		if (EsbElementTypes.RuleMediator_3126 == req.getElementType()) {
			return getGEFWrapper(new RuleMediatorCreateCommand(req));
		}
		if (EsbElementTypes.OAuthMediator_3129 == req.getElementType()) {
			return getGEFWrapper(new OAuthMediatorCreateCommand(req));
		}
		if (EsbElementTypes.AggregateMediator_3111 == req.getElementType()) {
			return getGEFWrapper(new AggregateMediatorCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
