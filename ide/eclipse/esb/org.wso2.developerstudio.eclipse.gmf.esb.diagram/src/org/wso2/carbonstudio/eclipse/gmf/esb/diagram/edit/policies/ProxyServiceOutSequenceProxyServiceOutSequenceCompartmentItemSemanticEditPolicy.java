package org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.AggregateMediator2CreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.CacheMediator2CreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.CalloutMediator3CreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.ClassMediator2CreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.CloneMediator3CreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.CommandMediator2CreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.DBLookupMediator3CreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.DBReportMediator3CreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.DropMediator4CreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.EnrichMediator3CreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.EntitlementMediator2CreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.EventMediator2CreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.FaultMediator3CreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.FilterMediator3CreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.HeaderMediator3CreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.IterateMediator3CreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.LogMediator3CreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.OAuthMediator2CreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.PropertyMediator4CreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.RMSequenceMediator3CreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.RuleMediator2CreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.ScriptMediator2CreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.SendMediator3CreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.Sequence3CreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.SmooksMediator2CreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.SpringMediator2CreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.SwitchMediator3CreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.ThrottleMediator2CreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.TransactionMediator3CreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.XQueryMediator2CreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.XSLTMediator3CreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.providers.EsbElementTypes;

/**
 * @generated
 */
public class ProxyServiceOutSequenceProxyServiceOutSequenceCompartmentItemSemanticEditPolicy
		extends EsbBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ProxyServiceOutSequenceProxyServiceOutSequenceCompartmentItemSemanticEditPolicy() {
		super(EsbElementTypes.ProxyServiceOutSequence_3198);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (EsbElementTypes.DropMediator_3194 == req.getElementType()) {
			return getGEFWrapper(new DropMediator4CreateCommand(req));
		}
		if (EsbElementTypes.PropertyMediator_3200 == req.getElementType()) {
			return getGEFWrapper(new PropertyMediator4CreateCommand(req));
		}
		if (EsbElementTypes.ThrottleMediator_3206 == req.getElementType()) {
			return getGEFWrapper(new ThrottleMediator2CreateCommand(req));
		}
		if (EsbElementTypes.FilterMediator_3237 == req.getElementType()) {
			return getGEFWrapper(new FilterMediator3CreateCommand(req));
		}
		if (EsbElementTypes.LogMediator_3241 == req.getElementType()) {
			return getGEFWrapper(new LogMediator3CreateCommand(req));
		}
		if (EsbElementTypes.EnrichMediator_3244 == req.getElementType()) {
			return getGEFWrapper(new EnrichMediator3CreateCommand(req));
		}
		if (EsbElementTypes.XSLTMediator_3247 == req.getElementType()) {
			return getGEFWrapper(new XSLTMediator3CreateCommand(req));
		}
		if (EsbElementTypes.SwitchMediator_3250 == req.getElementType()) {
			return getGEFWrapper(new SwitchMediator3CreateCommand(req));
		}
		if (EsbElementTypes.Sequence_3254 == req.getElementType()) {
			return getGEFWrapper(new Sequence3CreateCommand(req));
		}
		if (EsbElementTypes.EventMediator_3257 == req.getElementType()) {
			return getGEFWrapper(new EventMediator2CreateCommand(req));
		}
		if (EsbElementTypes.EntitlementMediator_3260 == req.getElementType()) {
			return getGEFWrapper(new EntitlementMediator2CreateCommand(req));
		}
		if (EsbElementTypes.ClassMediator_3263 == req.getElementType()) {
			return getGEFWrapper(new ClassMediator2CreateCommand(req));
		}
		if (EsbElementTypes.SpringMediator_3266 == req.getElementType()) {
			return getGEFWrapper(new SpringMediator2CreateCommand(req));
		}
		if (EsbElementTypes.ScriptMediator_3269 == req.getElementType()) {
			return getGEFWrapper(new ScriptMediator2CreateCommand(req));
		}
		if (EsbElementTypes.FaultMediator_3272 == req.getElementType()) {
			return getGEFWrapper(new FaultMediator3CreateCommand(req));
		}
		if (EsbElementTypes.XQueryMediator_3275 == req.getElementType()) {
			return getGEFWrapper(new XQueryMediator2CreateCommand(req));
		}
		if (EsbElementTypes.CommandMediator_3278 == req.getElementType()) {
			return getGEFWrapper(new CommandMediator2CreateCommand(req));
		}
		if (EsbElementTypes.DBLookupMediator_3281 == req.getElementType()) {
			return getGEFWrapper(new DBLookupMediator3CreateCommand(req));
		}
		if (EsbElementTypes.DBReportMediator_3284 == req.getElementType()) {
			return getGEFWrapper(new DBReportMediator3CreateCommand(req));
		}
		if (EsbElementTypes.SmooksMediator_3287 == req.getElementType()) {
			return getGEFWrapper(new SmooksMediator2CreateCommand(req));
		}
		if (EsbElementTypes.SendMediator_3290 == req.getElementType()) {
			return getGEFWrapper(new SendMediator3CreateCommand(req));
		}
		if (EsbElementTypes.HeaderMediator_3293 == req.getElementType()) {
			return getGEFWrapper(new HeaderMediator3CreateCommand(req));
		}
		if (EsbElementTypes.CloneMediator_3296 == req.getElementType()) {
			return getGEFWrapper(new CloneMediator3CreateCommand(req));
		}
		if (EsbElementTypes.CacheMediator_3300 == req.getElementType()) {
			return getGEFWrapper(new CacheMediator2CreateCommand(req));
		}
		if (EsbElementTypes.IterateMediator_3303 == req.getElementType()) {
			return getGEFWrapper(new IterateMediator3CreateCommand(req));
		}
		if (EsbElementTypes.CalloutMediator_3306 == req.getElementType()) {
			return getGEFWrapper(new CalloutMediator3CreateCommand(req));
		}
		if (EsbElementTypes.TransactionMediator_3309 == req.getElementType()) {
			return getGEFWrapper(new TransactionMediator3CreateCommand(req));
		}
		if (EsbElementTypes.RMSequenceMediator_3312 == req.getElementType()) {
			return getGEFWrapper(new RMSequenceMediator3CreateCommand(req));
		}
		if (EsbElementTypes.RuleMediator_3315 == req.getElementType()) {
			return getGEFWrapper(new RuleMediator2CreateCommand(req));
		}
		if (EsbElementTypes.OAuthMediator_3318 == req.getElementType()) {
			return getGEFWrapper(new OAuthMediator2CreateCommand(req));
		}
		if (EsbElementTypes.AggregateMediator_3321 == req.getElementType()) {
			return getGEFWrapper(new AggregateMediator2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
