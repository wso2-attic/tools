package org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.CalloutMediator2CreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.CloneMediator2CreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.DBLookupMediator2CreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.DBReportMediator2CreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.DropMediator2CreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.EnrichMediator2CreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.FaultMediator2CreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.FilterMediator2CreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.HeaderMediator2CreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.IterateMediator2CreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.LogMediator2CreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.PropertyMediator2CreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.RMSequenceMediator2CreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.SendMediator2CreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.Sequence2CreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.SwitchMediator2CreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.TransactionMediator2CreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.commands.XSLTMediator2CreateCommand;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.providers.EsbElementTypes;

/**
 * @generated
 */
public class AggregateMediatorAggregateCompartmentItemSemanticEditPolicy extends
		EsbBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public AggregateMediatorAggregateCompartmentItemSemanticEditPolicy() {
		super(EsbElementTypes.AggregateMediator_3236);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (EsbElementTypes.LogMediator_3134 == req.getElementType()) {
			return getGEFWrapper(new LogMediator2CreateCommand(req));
		}
		if (EsbElementTypes.DropMediator_3137 == req.getElementType()) {
			return getGEFWrapper(new DropMediator2CreateCommand(req));
		}
		if (EsbElementTypes.FilterMediator_3139 == req.getElementType()) {
			return getGEFWrapper(new FilterMediator2CreateCommand(req));
		}
		if (EsbElementTypes.PropertyMediator_3143 == req.getElementType()) {
			return getGEFWrapper(new PropertyMediator2CreateCommand(req));
		}
		if (EsbElementTypes.EnrichMediator_3146 == req.getElementType()) {
			return getGEFWrapper(new EnrichMediator2CreateCommand(req));
		}
		if (EsbElementTypes.XSLTMediator_3149 == req.getElementType()) {
			return getGEFWrapper(new XSLTMediator2CreateCommand(req));
		}
		if (EsbElementTypes.SwitchMediator_3152 == req.getElementType()) {
			return getGEFWrapper(new SwitchMediator2CreateCommand(req));
		}
		if (EsbElementTypes.FaultMediator_3156 == req.getElementType()) {
			return getGEFWrapper(new FaultMediator2CreateCommand(req));
		}
		if (EsbElementTypes.DBLookupMediator_3159 == req.getElementType()) {
			return getGEFWrapper(new DBLookupMediator2CreateCommand(req));
		}
		if (EsbElementTypes.DBReportMediator_3162 == req.getElementType()) {
			return getGEFWrapper(new DBReportMediator2CreateCommand(req));
		}
		if (EsbElementTypes.SendMediator_3165 == req.getElementType()) {
			return getGEFWrapper(new SendMediator2CreateCommand(req));
		}
		if (EsbElementTypes.HeaderMediator_3168 == req.getElementType()) {
			return getGEFWrapper(new HeaderMediator2CreateCommand(req));
		}
		if (EsbElementTypes.CloneMediator_3171 == req.getElementType()) {
			return getGEFWrapper(new CloneMediator2CreateCommand(req));
		}
		if (EsbElementTypes.IterateMediator_3175 == req.getElementType()) {
			return getGEFWrapper(new IterateMediator2CreateCommand(req));
		}
		if (EsbElementTypes.CalloutMediator_3178 == req.getElementType()) {
			return getGEFWrapper(new CalloutMediator2CreateCommand(req));
		}
		if (EsbElementTypes.TransactionMediator_3179 == req.getElementType()) {
			return getGEFWrapper(new TransactionMediator2CreateCommand(req));
		}
		if (EsbElementTypes.RMSequenceMediator_3180 == req.getElementType()) {
			return getGEFWrapper(new RMSequenceMediator2CreateCommand(req));
		}
		if (EsbElementTypes.Sequence_3187 == req.getElementType()) {
			return getGEFWrapper(new Sequence2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
