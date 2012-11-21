package org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.deserializer;

import org.apache.synapse.mediators.AbstractMediator;
import org.eclipse.core.runtime.Assert;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.wso2.carbon.mediator.transform.SmooksMediator.TYPES;
import org.wso2.developerstudio.eclipse.gmf.esb.ExpressionAction;
import org.wso2.developerstudio.eclipse.gmf.esb.OutputMethod;
import org.wso2.developerstudio.eclipse.gmf.esb.SmooksIODataType;
import org.wso2.developerstudio.eclipse.gmf.esb.SmooksMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.providers.EsbElementTypes;
import static org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage.Literals.*;
import static org.wso2.carbon.mediator.transform.Output.*;

public class SmooksMediatorDeserializer extends AbstractEsbNodeDeserializer<AbstractMediator, SmooksMediator>{
	
	public SmooksMediator createNode(IGraphicalEditPart part,AbstractMediator mediator) {
		Assert.isTrue(mediator instanceof org.wso2.carbon.mediator.transform.SmooksMediator, "Unsupported mediator passed in for deserialization at "+ this.getClass());
		
		org.wso2.carbon.mediator.transform.SmooksMediator smooksMediator = (org.wso2.carbon.mediator.transform.SmooksMediator)mediator;
		
		SmooksMediator visualSmooksMediator = (SmooksMediator) DeserializerUtils.createNode(part, EsbElementTypes.SmooksMediator_3514);
		setElementToEdit(visualSmooksMediator);		
		
		executeSetValueCommand(SMOOKS_MEDIATOR__INPUT_EXPRESSION, createNamespacedProperty(smooksMediator.getInput().getExpression()));
		if(smooksMediator.getInput().getType().equals(TYPES.XML)){
			executeSetValueCommand(SMOOKS_MEDIATOR__INPUT_TYPE, SmooksIODataType.XML);
		}else if(smooksMediator.getInput().getType().equals(TYPES.TEXT)){
			executeSetValueCommand(SMOOKS_MEDIATOR__INPUT_TYPE, SmooksIODataType.TEXT);
		}
		
		if(smooksMediator.getOutput().getExpression()!=null){
			executeSetValueCommand(SMOOKS_MEDIATOR__OUTPUT_EXPRESSION, createNamespacedProperty(smooksMediator.getOutput().getExpression()));
			if(ACTION_REPLACE.equals(smooksMediator.getOutput().getAction())){
				executeSetValueCommand(SMOOKS_MEDIATOR__OUTPUT_ACTION, ExpressionAction.REPLACE);
			}else if(ACTION_ADD_CHILD.equals(smooksMediator.getOutput().getAction())){
				executeSetValueCommand(SMOOKS_MEDIATOR__OUTPUT_ACTION, ExpressionAction.ADD);
			}else if(ACTION_ADD_SIBLING.equals(smooksMediator.getOutput().getAction())){
				executeSetValueCommand(SMOOKS_MEDIATOR__OUTPUT_ACTION, ExpressionAction.SIBLING);
			}	
			executeSetValueCommand(SMOOKS_MEDIATOR__OUTPUT_METHOD, OutputMethod.EXPRESSION);
		}else{
			executeSetValueCommand(SMOOKS_MEDIATOR__OUTPUT_PROPERTY, smooksMediator.getOutput().getProperty());
			executeSetValueCommand(SMOOKS_MEDIATOR__OUTPUT_METHOD, OutputMethod.PROPERTY);
		}
		if(smooksMediator.getOutput().getType().equals(TYPES.XML)){
			executeSetValueCommand(SMOOKS_MEDIATOR__OUTPUT_TYPE, SmooksIODataType.XML);
		}else if(smooksMediator.getOutput().getType().equals(TYPES.TEXT)){
			executeSetValueCommand(SMOOKS_MEDIATOR__OUTPUT_TYPE, SmooksIODataType.TEXT);
		}
		
		executeSetValueCommand(visualSmooksMediator.getConfigurationKey(),REGISTRY_KEY_PROPERTY__KEY_VALUE, smooksMediator.getConfigKey());
		
		return visualSmooksMediator;
	}

}
