package org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.deserializer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.synapse.mediators.AbstractMediator;
import org.apache.synapse.mediators.MediatorProperty;
import org.apache.synapse.mediators.Value;
import org.apache.synapse.util.xpath.SynapseXPath;
import org.eclipse.core.runtime.Assert;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbFactory;
import org.wso2.developerstudio.eclipse.gmf.esb.KeyType;
import org.wso2.developerstudio.eclipse.gmf.esb.NamespacedProperty;
import org.wso2.developerstudio.eclipse.gmf.esb.RegistryKeyProperty;
import org.wso2.developerstudio.eclipse.gmf.esb.ValidateFeature;
import org.wso2.developerstudio.eclipse.gmf.esb.ValidateMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.ValidateSchema;

public class ValidateMediatorDeserializer extends AbstractEsbNodeDeserializer<AbstractMediator, ValidateMediator>{


	public ValidateMediator createNode(AbstractMediator mediator) {
		
		Assert.isTrue(mediator instanceof org.apache.synapse.mediators.builtin.ValidateMediator, "Invalid Mediator.");
		
		org.apache.synapse.mediators.builtin.ValidateMediator validateMediator = (org.apache.synapse.mediators.builtin.ValidateMediator)mediator;
		
		ValidateMediator vishualValidator = EsbFactory.eINSTANCE.createValidateMediator();
		
		if(validateMediator.getSource() != null){
			
			SynapseXPath xpath  = validateMediator.getSource();
			
			NamespacedProperty nsp = EsbFactory.eINSTANCE.createNamespacedProperty();
			
			nsp.setPropertyValue(xpath.toString());
			
			if (xpath.getNamespaces() != null) {

				@SuppressWarnings("unchecked")
				Map<String, String> map = xpath.getNamespaces();

				nsp.setNamespaces(map);
			}
			
			vishualValidator.setSourceXpath(nsp);
		}
		
		if(validateMediator.getSchemaKeys() != null && !validateMediator.getSchemaKeys().isEmpty()){
			
			List<ValidateSchema> validateSchemaList = new ArrayList<ValidateSchema>();
			
			for(Value schema : validateMediator.getSchemaKeys()){
				
				ValidateSchema validateSchema = EsbFactory.eINSTANCE.createValidateSchema();
				
				if(schema.getKeyValue() != null){
					
					validateSchema.setValidateSchemaKeyType(KeyType.STATIC);
					
					RegistryKeyProperty regkey = EsbFactory.eINSTANCE.createRegistryKeyProperty();
					regkey.setKeyValue(schema.getKeyValue());
					
					validateSchema.setValidateStaticSchemaKey(regkey);
				}
				else if(schema.getExpression() != null){
					
					NamespacedProperty nsp = EsbFactory.eINSTANCE.createNamespacedProperty();
					
					validateSchema.setValidateSchemaKeyType(KeyType.DYNAMIC);
					
					SynapseXPath xpath = schema.getExpression();
					
					nsp.setPropertyValue(xpath.toString());
					
					if (xpath.getNamespaces() != null) {

						@SuppressWarnings("unchecked")
						Map<String, String> map = xpath.getNamespaces();

						nsp.setNamespaces(map);
					}
					
					validateSchema.setValidateDynamicSchemaKey(nsp);
					
				}
				
				validateSchemaList.add(validateSchema);
			}
			
			vishualValidator.getSchemas().addAll(validateSchemaList);
		}
		
		List<ValidateFeature> validateFeatureList = new ArrayList<ValidateFeature>();
		
		for (MediatorProperty featureProperty : validateMediator.getFeatures()){
			
			ValidateFeature feature =  EsbFactory.eINSTANCE.createValidateFeature();
			
			if(featureProperty.getName() != null && !featureProperty.getName().equals("")){
				
				feature.setFeatureName(featureProperty.getName());
			}
			
			if(Boolean.parseBoolean(featureProperty.getValue())){
				
				feature.setFeatureEnabled(Boolean.parseBoolean(featureProperty.getValue()));
			}
			
			validateFeatureList.add(feature);
		}
		
		vishualValidator.getFeatures().addAll(validateFeatureList);
		
		return vishualValidator;
	}

}
