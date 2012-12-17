package org.wso2.developerstudio.eclipse.gmf.esb.internal.persistence;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.apache.synapse.endpoints.Endpoint;
import org.apache.synapse.mediators.Value;
import org.apache.synapse.mediators.base.SequenceMediator;
import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbNode;
import org.wso2.developerstudio.eclipse.gmf.esb.RegistryKeyProperty;
import org.wso2.developerstudio.eclipse.gmf.esb.ScriptMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.ScriptType;
import org.wso2.developerstudio.eclipse.gmf.esb.scriptKeyTypeEnum;
import org.wso2.developerstudio.eclipse.gmf.esb.persistence.TransformationInfo;

public class ScriptMediatorTransformer extends AbstractEsbNodeTransformer {

	public void transform(TransformationInfo information, EsbNode subject)
			throws Exception {
		// TODO Auto-generated method stub
		information.getParentSequence().addChild(createScriptMediator(subject));
		// Transform the Script mediator output data flow path.
		doTransform(information,
				((ScriptMediator)subject).getOutputConnector());
		
	}

	public void createSynapseObject(TransformationInfo info, EObject subject,
			List<Endpoint> endPoints) {
		// TODO Auto-generated method stub
		
	}

	public void transformWithinSequence(TransformationInfo information,
			EsbNode subject, SequenceMediator sequence) throws Exception {
		// TODO Auto-generated method stub
		sequence.addChild(createScriptMediator(subject));
		doTransformWithinSequence(information,((ScriptMediator)subject).getOutputConnector().getOutgoingLink(),sequence);
	}
	
	private org.apache.synapse.mediators.bsf.ScriptMediator createScriptMediator(EsbNode subject) throws Exception{
		Assert.isTrue(subject instanceof ScriptMediator, "Invalid subject.");
		ScriptMediator visualScript = (ScriptMediator)subject;
		ScriptType scriptType = visualScript.getScriptType();
		int scriptTypeValue = scriptType.getValue();
		String language=visualScript.getScriptLanguage().getLiteral();
		org.apache.synapse.mediators.bsf.ScriptMediator scriptMediator =null;
		if(scriptTypeValue==0){
		String scriptSourceCode=visualScript.getScriptBody();
	    scriptMediator = new org.apache.synapse.mediators.bsf.ScriptMediator(language,scriptSourceCode);
		}else{
			Map<Value, Object> includeMap = new HashMap<Value, Object>();
			EList<RegistryKeyProperty> scriptKeys = visualScript.getScriptKeys();
			for (RegistryKeyProperty registryKeyProperty : scriptKeys) {
				Value value = new Value(registryKeyProperty.getKeyValue());
				includeMap.put(value, null);
			}
			scriptKeyTypeEnum keyType = visualScript.getKeyType();
			Value value=null;
		    if(keyType.getValue()==keyType.STATIC_KEY_VALUE){	
		    	value = new Value(visualScript.getScriptStaticKey().getKeyValue());
		    }else{
		    	
		       value = new Value(visualScript.getScriptDynamicKey().getPropertyValue());
		    }
			scriptMediator = new org.apache.synapse.mediators.bsf.ScriptMediator(language,includeMap,value,visualScript.getMediateFunction());
		}
 
		return scriptMediator;
	}

}
