package org.wso2.developerstudio.eclipse.gmf.esb.internal.deserializer;

import org.apache.synapse.mediators.AbstractMediator;
import org.eclipse.core.runtime.Assert;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbFactory;
import org.wso2.developerstudio.eclipse.gmf.esb.Mediator;
import org.wso2.developerstudio.eclipse.gmf.esb.NamespacedProperty;
import org.wso2.developerstudio.eclipse.gmf.esb.PropertyAction;
import org.wso2.developerstudio.eclipse.gmf.esb.PropertyMediator;

public class PropertyMediatorDeserializer extends AbstractEsbNodeDeserializer {

	
	public Mediator createMediator(AbstractMediator mediator) {
		
		//TODO Complete the logic of this method . NOT COMPLTED YET.
		
		Assert.isTrue(mediator instanceof org.apache.synapse.mediators.builtin.PropertyMediator, "Invalid Mediator.");
		
		org.apache.synapse.mediators.builtin.PropertyMediator propertyMediator = (org.apache.synapse.mediators.builtin.PropertyMediator)mediator;
		
		PropertyMediator vishualProp = EsbFactory.eINSTANCE.createPropertyMediator();
		
		vishualProp.setInputConnector(EsbFactory.eINSTANCE.createPropertyMediatorInputConnector());
		vishualProp.setOutputConnector(EsbFactory.eINSTANCE.createPropertyMediatorOutputConnector());
		
		if(propertyMediator.getName() != null){
			
			vishualProp.setPropertyName(propertyMediator.getName());
		}
		
		
		if(propertyMediator.getAction() == org.apache.synapse.mediators.builtin.PropertyMediator.ACTION_REMOVE){
			
			 vishualProp.setPropertyAction(PropertyAction.REMOVE);
			 vishualProp.setValueExpression(null);
			 vishualProp.setValueLiteral(null);
			 
		}else{
			
			 vishualProp.setPropertyAction(PropertyAction.SET);
			 
			if(propertyMediator.getExpression() != null){
				
				NamespacedProperty namespaceProp = EsbFactory.eINSTANCE.createNamespacedProperty();
				namespaceProp.setPropertyValue(propertyMediator.getExpression().toString());
				vishualProp.setValueExpression(namespaceProp);
				
			}else if(propertyMediator.getValue() != null){
				
				
			}
		}
		
		return vishualProp;
	}

}
