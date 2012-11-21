package org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.deserializer;

import org.apache.synapse.mediators.AbstractMediator;
import org.apache.synapse.mediators.transform.Argument;
import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbFactory;
import org.wso2.developerstudio.eclipse.gmf.esb.PayloadFactoryArgument;
import org.wso2.developerstudio.eclipse.gmf.esb.PayloadFactoryArgumentType;
import org.wso2.developerstudio.eclipse.gmf.esb.PayloadFactoryMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.providers.EsbElementTypes;
import static org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage.Literals.*;

public class PayloadFactoryMediatorDeserializer extends AbstractEsbNodeDeserializer<AbstractMediator, PayloadFactoryMediator>{
	
	public PayloadFactoryMediator createNode(IGraphicalEditPart part,AbstractMediator mediator) {
		Assert.isTrue(mediator instanceof org.apache.synapse.mediators.transform.PayloadFactoryMediator, "Unsupported mediator passed in for deserialization at "+ this.getClass());
		
		org.apache.synapse.mediators.transform.PayloadFactoryMediator payloadFactoryMediator = (org.apache.synapse.mediators.transform.PayloadFactoryMediator)mediator;
		
		PayloadFactoryMediator visualPayloadFactoryMediator = (PayloadFactoryMediator) DeserializerUtils.createNode(part, EsbElementTypes.PayloadFactoryMediator_3597);
		setElementToEdit(visualPayloadFactoryMediator);
		
		executeSetValueCommand(PAYLOAD_FACTORY_MEDIATOR__FORMAT, payloadFactoryMediator.getFormat());
		EList<PayloadFactoryArgument> arguments=new BasicEList<PayloadFactoryArgument>();
		for(Argument argument: payloadFactoryMediator.getArgumentList()){
			PayloadFactoryArgument payloadFactoryArgument= EsbFactory.eINSTANCE.createPayloadFactoryArgument();
			if(argument.getExpression()!=null){
				executeSetValueCommand(payloadFactoryArgument,PAYLOAD_FACTORY_ARGUMENT__ARGUMENT_EXPRESSION, createNamespacedProperty(argument.getExpression()));
				executeSetValueCommand(payloadFactoryArgument,PAYLOAD_FACTORY_ARGUMENT__ARGUMENT_TYPE, PayloadFactoryArgumentType.EXPRESSION);
			}else{
				executeSetValueCommand(payloadFactoryArgument,PAYLOAD_FACTORY_ARGUMENT__ARGUMENT_VALUE, argument.getValue());
				executeSetValueCommand(payloadFactoryArgument,PAYLOAD_FACTORY_ARGUMENT__ARGUMENT_TYPE, PayloadFactoryArgumentType.VALUE);
			}
			arguments.add(payloadFactoryArgument);
		}
		executeSetValueCommand(PAYLOAD_FACTORY_MEDIATOR__ARGS, arguments);
			
		return visualPayloadFactoryMediator;
	}

}
