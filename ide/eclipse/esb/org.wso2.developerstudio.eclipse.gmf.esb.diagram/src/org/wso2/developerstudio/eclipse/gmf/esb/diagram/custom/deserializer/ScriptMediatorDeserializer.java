package org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.deserializer;

import java.util.Set;

import org.apache.synapse.mediators.AbstractMediator;
import org.apache.synapse.mediators.Value;
import org.apache.synapse.util.xpath.SynapseXPath;
import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbFactory;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage;
import org.wso2.developerstudio.eclipse.gmf.esb.NamespacedProperty;
import org.wso2.developerstudio.eclipse.gmf.esb.RegistryKeyProperty;
import org.wso2.developerstudio.eclipse.gmf.esb.ScriptMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.scriptKeyTypeEnum;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.providers.EsbElementTypes;

public class ScriptMediatorDeserializer extends AbstractEsbNodeDeserializer<AbstractMediator, ScriptMediator>{
	
	public ScriptMediator createNode(IGraphicalEditPart part,AbstractMediator mediator) {
		Assert.isTrue(mediator instanceof org.apache.synapse.mediators.bsf.ScriptMediator, "Unsupported mediator passed in for deserialization at "+ this.getClass());		
		org.apache.synapse.mediators.bsf.ScriptMediator scriptMediator = (org.apache.synapse.mediators.bsf.ScriptMediator)mediator;		
		ScriptMediator visualScriptMediator = (ScriptMediator) DeserializerUtils.createNode(part, EsbElementTypes.ScriptMediator_3508);
		setElementToEdit(visualScriptMediator);
		String type = scriptMediator.getScriptSrc();

		executeSetValueCommand(EsbPackage.Literals.SCRIPT_MEDIATOR__SCRIPT_LANGUAGE, scriptMediator.getLanguage());
		if(type!=null){
		   executeSetValueCommand(EsbPackage.Literals.SCRIPT_MEDIATOR__SCRIPT_TYPE, 0);
		   executeSetValueCommand(EsbPackage.Literals.SCRIPT_MEDIATOR__SCRIPT_BODY, scriptMediator.getScriptSrc());
		}else{
		   executeSetValueCommand(EsbPackage.Literals.SCRIPT_MEDIATOR__SCRIPT_TYPE, 1);
		  Set<Value> keySet = scriptMediator.getIncludeMap().keySet();
		  EList<Value>  keylis = new BasicEList<Value>();
		  for (Value value : keySet) {
			  keylis.add(value);
		  }
		  executeSetValueCommand(EsbPackage.Literals.SCRIPT_MEDIATOR__SCRIPT_KEYS, keylis);
		  Value key = scriptMediator.getKey();
		  SynapseXPath expression = key.getExpression();
		  String keyValue = key.getKeyValue();
		  scriptKeyTypeEnum keyType = visualScriptMediator.getKeyType();
		  NamespacedProperty namespacedProperty = createNamespacedProperty(expression);
		  RegistryKeyProperty registryKeyProperty = EsbFactory.eINSTANCE.createRegistryKeyProperty();
		  registryKeyProperty.setKeyValue(keyValue);
		  if(expression!=null){
			  executeSetValueCommand(EsbPackage.Literals.SCRIPT_MEDIATOR__KEY_TYPE, keyType.DYNAMIC_KEY);
			  executeSetValueCommand(EsbPackage.Literals.SCRIPT_MEDIATOR__SCRIPT_DYNAMIC_KEY, namespacedProperty);
			 
		  }else if(keyValue!=null){
			  executeSetValueCommand(EsbPackage.Literals.SCRIPT_MEDIATOR__KEY_TYPE, keyType.STATIC_KEY);
			  executeSetValueCommand(EsbPackage.Literals.SCRIPT_MEDIATOR__SCRIPT_DYNAMIC_KEY, registryKeyProperty);
		  }
		  executeSetValueCommand(EsbPackage.Literals.SCRIPT_MEDIATOR__MEDIATE_FUNCTION, scriptMediator.getFunction());
		}
		return visualScriptMediator;
	}
}
