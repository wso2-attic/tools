package org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.CalloutMediator4CreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.CloneMediator4CreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.DBLookupMediator4CreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.DBReportMediator4CreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.DropMediator5CreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.EnrichMediator4CreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.FaultMediator4CreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.FilterMediator4CreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.HeaderMediator4CreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.IterateMediator4CreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.LogMediator4CreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.PropertyMediator5CreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.RMSequenceMediator4CreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.SendMediator4CreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.Sequence4CreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.SwitchMediator4CreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.TransactionMediator4CreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.XSLTMediator4CreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.providers.EsbElementTypes;

/**
 * @generated
 */
public class AggregateMediatorAggregateCompartment2ItemSemanticEditPolicy
		extends EsbBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public AggregateMediatorAggregateCompartment2ItemSemanticEditPolicy() {
		super(EsbElementTypes.AggregateMediator_3321);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (EsbElementTypes.LogMediator_3325 == req.getElementType()) {
			return getGEFWrapper(new LogMediator4CreateCommand(req));
		}
		if (EsbElementTypes.DropMediator_3328 == req.getElementType()) {
			return getGEFWrapper(new DropMediator5CreateCommand(req));
		}
		if (EsbElementTypes.FilterMediator_3329 == req.getElementType()) {
			return getGEFWrapper(new FilterMediator4CreateCommand(req));
		}
		if (EsbElementTypes.PropertyMediator_3333 == req.getElementType()) {
			return getGEFWrapper(new PropertyMediator5CreateCommand(req));
		}
		if (EsbElementTypes.EnrichMediator_3334 == req.getElementType()) {
			return getGEFWrapper(new EnrichMediator4CreateCommand(req));
		}
		if (EsbElementTypes.XSLTMediator_3337 == req.getElementType()) {
			return getGEFWrapper(new XSLTMediator4CreateCommand(req));
		}
		if (EsbElementTypes.SwitchMediator_3340 == req.getElementType()) {
			return getGEFWrapper(new SwitchMediator4CreateCommand(req));
		}
		if (EsbElementTypes.FaultMediator_3344 == req.getElementType()) {
			return getGEFWrapper(new FaultMediator4CreateCommand(req));
		}
		if (EsbElementTypes.DBLookupMediator_3347 == req.getElementType()) {
			return getGEFWrapper(new DBLookupMediator4CreateCommand(req));
		}
		if (EsbElementTypes.DBReportMediator_3350 == req.getElementType()) {
			return getGEFWrapper(new DBReportMediator4CreateCommand(req));
		}
		if (EsbElementTypes.SendMediator_3353 == req.getElementType()) {
			return getGEFWrapper(new SendMediator4CreateCommand(req));
		}
		if (EsbElementTypes.HeaderMediator_3356 == req.getElementType()) {
			return getGEFWrapper(new HeaderMediator4CreateCommand(req));
		}
		if (EsbElementTypes.CloneMediator_3359 == req.getElementType()) {
			return getGEFWrapper(new CloneMediator4CreateCommand(req));
		}
		if (EsbElementTypes.IterateMediator_3363 == req.getElementType()) {
			return getGEFWrapper(new IterateMediator4CreateCommand(req));
		}
		if (EsbElementTypes.CalloutMediator_3366 == req.getElementType()) {
			return getGEFWrapper(new CalloutMediator4CreateCommand(req));
		}
		if (EsbElementTypes.TransactionMediator_3369 == req.getElementType()) {
			return getGEFWrapper(new TransactionMediator4CreateCommand(req));
		}
		if (EsbElementTypes.RMSequenceMediator_3372 == req.getElementType()) {
			return getGEFWrapper(new RMSequenceMediator4CreateCommand(req));
		}
		if (EsbElementTypes.Sequence_3375 == req.getElementType()) {
			return getGEFWrapper(new Sequence4CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
