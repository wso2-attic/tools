package org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.commands.CacheMediator3CreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.commands.CalloutMediator5CreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.commands.ClassMediator3CreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.commands.CloneMediator5CreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.commands.CommandMediator3CreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.commands.DBLookupMediator5CreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.commands.DBReportMediator5CreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.commands.DropMediatorCreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.commands.EnrichMediator5CreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.commands.EntitlementMediator3CreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.commands.EventMediator3CreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.commands.FaultMediator5CreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.commands.FilterMediator5CreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.commands.HeaderMediator5CreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.commands.IterateMediator5CreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.commands.LogMediator5CreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.commands.OAuthMediator3CreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.commands.PropertyMediatorCreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.commands.RMSequenceMediator5CreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.commands.RuleMediator3CreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.commands.ScriptMediator3CreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.commands.SendMediator5CreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.commands.Sequence5CreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.commands.SmooksMediator3CreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.commands.SpringMediator3CreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.commands.SwitchMediator5CreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.commands.ThrottleMediator3CreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.commands.TransactionMediator5CreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.commands.XQueryMediator3CreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.commands.XSLTMediator5CreateCommand;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.providers.EsbElementTypes;

/**
 * @generated
 */
public class ProxyServiceFaultContainerProxyServiceFaultSequenceCompartmentItemSemanticEditPolicy
		extends EsbBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ProxyServiceFaultContainerProxyServiceFaultSequenceCompartmentItemSemanticEditPolicy() {
		super(EsbElementTypes.ProxyServiceFaultContainer_3488);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (EsbElementTypes.DropMediator_3394 == req.getElementType()) {
			return getGEFWrapper(new DropMediatorCreateCommand(req));
		}
		if (EsbElementTypes.PropertyMediator_3396 == req.getElementType()) {
			return getGEFWrapper(new PropertyMediatorCreateCommand(req));
		}
		if (EsbElementTypes.ThrottleMediator_3399 == req.getElementType()) {
			return getGEFWrapper(new ThrottleMediator3CreateCommand(req));
		}
		if (EsbElementTypes.FilterMediator_3402 == req.getElementType()) {
			return getGEFWrapper(new FilterMediator5CreateCommand(req));
		}
		if (EsbElementTypes.LogMediator_3406 == req.getElementType()) {
			return getGEFWrapper(new LogMediator5CreateCommand(req));
		}
		if (EsbElementTypes.EnrichMediator_3409 == req.getElementType()) {
			return getGEFWrapper(new EnrichMediator5CreateCommand(req));
		}
		if (EsbElementTypes.XSLTMediator_3412 == req.getElementType()) {
			return getGEFWrapper(new XSLTMediator5CreateCommand(req));
		}
		if (EsbElementTypes.SwitchMediator_3415 == req.getElementType()) {
			return getGEFWrapper(new SwitchMediator5CreateCommand(req));
		}
		if (EsbElementTypes.Sequence_3419 == req.getElementType()) {
			return getGEFWrapper(new Sequence5CreateCommand(req));
		}
		if (EsbElementTypes.EventMediator_3422 == req.getElementType()) {
			return getGEFWrapper(new EventMediator3CreateCommand(req));
		}
		if (EsbElementTypes.EntitlementMediator_3425 == req.getElementType()) {
			return getGEFWrapper(new EntitlementMediator3CreateCommand(req));
		}
		if (EsbElementTypes.ClassMediator_3428 == req.getElementType()) {
			return getGEFWrapper(new ClassMediator3CreateCommand(req));
		}
		if (EsbElementTypes.SpringMediator_3431 == req.getElementType()) {
			return getGEFWrapper(new SpringMediator3CreateCommand(req));
		}
		if (EsbElementTypes.ScriptMediator_3434 == req.getElementType()) {
			return getGEFWrapper(new ScriptMediator3CreateCommand(req));
		}
		if (EsbElementTypes.FaultMediator_3437 == req.getElementType()) {
			return getGEFWrapper(new FaultMediator5CreateCommand(req));
		}
		if (EsbElementTypes.XQueryMediator_3440 == req.getElementType()) {
			return getGEFWrapper(new XQueryMediator3CreateCommand(req));
		}
		if (EsbElementTypes.CommandMediator_3443 == req.getElementType()) {
			return getGEFWrapper(new CommandMediator3CreateCommand(req));
		}
		if (EsbElementTypes.DBLookupMediator_3446 == req.getElementType()) {
			return getGEFWrapper(new DBLookupMediator5CreateCommand(req));
		}
		if (EsbElementTypes.DBReportMediator_3449 == req.getElementType()) {
			return getGEFWrapper(new DBReportMediator5CreateCommand(req));
		}
		if (EsbElementTypes.SmooksMediator_3452 == req.getElementType()) {
			return getGEFWrapper(new SmooksMediator3CreateCommand(req));
		}
		if (EsbElementTypes.SendMediator_3455 == req.getElementType()) {
			return getGEFWrapper(new SendMediator5CreateCommand(req));
		}
		if (EsbElementTypes.HeaderMediator_3458 == req.getElementType()) {
			return getGEFWrapper(new HeaderMediator5CreateCommand(req));
		}
		if (EsbElementTypes.CloneMediator_3461 == req.getElementType()) {
			return getGEFWrapper(new CloneMediator5CreateCommand(req));
		}
		if (EsbElementTypes.CacheMediator_3465 == req.getElementType()) {
			return getGEFWrapper(new CacheMediator3CreateCommand(req));
		}
		if (EsbElementTypes.IterateMediator_3468 == req.getElementType()) {
			return getGEFWrapper(new IterateMediator5CreateCommand(req));
		}
		if (EsbElementTypes.CalloutMediator_3471 == req.getElementType()) {
			return getGEFWrapper(new CalloutMediator5CreateCommand(req));
		}
		if (EsbElementTypes.TransactionMediator_3474 == req.getElementType()) {
			return getGEFWrapper(new TransactionMediator5CreateCommand(req));
		}
		if (EsbElementTypes.RMSequenceMediator_3477 == req.getElementType()) {
			return getGEFWrapper(new RMSequenceMediator5CreateCommand(req));
		}
		if (EsbElementTypes.RuleMediator_3480 == req.getElementType()) {
			return getGEFWrapper(new RuleMediator3CreateCommand(req));
		}
		if (EsbElementTypes.OAuthMediator_3483 == req.getElementType()) {
			return getGEFWrapper(new OAuthMediator3CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
