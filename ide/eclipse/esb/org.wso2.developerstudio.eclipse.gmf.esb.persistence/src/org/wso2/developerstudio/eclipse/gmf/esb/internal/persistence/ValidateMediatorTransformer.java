package org.wso2.developerstudio.eclipse.gmf.esb.internal.persistence;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

import org.apache.synapse.config.xml.AnonymousListMediator;
import org.apache.synapse.endpoints.Endpoint;
import org.apache.synapse.mediators.ListMediator;
import org.apache.synapse.mediators.Value;
import org.apache.synapse.mediators.base.SequenceMediator;
import org.apache.synapse.util.resolver.ResourceMap;
import org.apache.synapse.util.xpath.SynapseXPath;
import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EObject;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbNode;
import org.wso2.developerstudio.eclipse.gmf.esb.KeyType;
import org.wso2.developerstudio.eclipse.gmf.esb.NamespacedProperty;
import org.wso2.developerstudio.eclipse.gmf.esb.ValidateFeature;
import org.wso2.developerstudio.eclipse.gmf.esb.ValidateMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.ValidateResource;
import org.wso2.developerstudio.eclipse.gmf.esb.ValidateSchema;
import org.wso2.developerstudio.eclipse.gmf.esb.persistence.TransformationInfo;
import org.wso2.developerstudio.eclipse.gmf.esb.persistence.Activator;
import org.wso2.developerstudio.eclipse.logging.core.IDeveloperStudioLog;
import org.wso2.developerstudio.eclipse.logging.core.Logger;

public class ValidateMediatorTransformer  extends AbstractEsbNodeTransformer {
	
	private static IDeveloperStudioLog log = Logger.getLog(Activator.PLUGIN_ID);
	
	public void transform(TransformationInfo information, EsbNode subject)
			throws Exception {
		information.getParentSequence().addChild(createValidateMediator(subject, information));
		
		doTransform(information, ((ValidateMediator)subject).getOutputConnector());
	}

	public void createSynapseObject(TransformationInfo info, EObject subject,
			List<Endpoint> endPoints) {
		
	}

	public void transformWithinSequence(TransformationInfo information,
			EsbNode subject, SequenceMediator sequence) throws Exception {
		
		sequence.addChild(createValidateMediator(subject,information));
		doTransformWithinSequence(information,((ValidateMediator) subject).getOutputConnector().getOutgoingLink(),sequence);	
		
	}
	
	
	private org.apache.synapse.mediators.builtin.ValidateMediator createValidateMediator
									(EsbNode subject,TransformationInfo information) throws Exception{
		
		/*
		 * Check subject.
		 */
		Assert.isTrue(subject instanceof ValidateMediator, "Invalid subject.");
		ValidateMediator visualValidateMediator = (ValidateMediator) subject;
		/*
		 * Configure Validate mediator.
		 */

		org.apache.synapse.mediators.builtin.ValidateMediator validateMediator = new org.apache.synapse.mediators.builtin.ValidateMediator();

		NamespacedProperty sourceXPath = visualValidateMediator
				.getSourceXpath();
		if (sourceXPath.getPropertyValue() != null
				&& !sourceXPath.getPropertyValue().equals("")) {
			SynapseXPath synapseXPath = new SynapseXPath(sourceXPath
							.getPropertyValue());
			for (Entry<String, String> entry : sourceXPath.getNamespaces().entrySet()) {
				synapseXPath.addNamespace(entry.getKey(), entry.getValue());
			}
			validateMediator.setSource(synapseXPath);
		}

		List<Value> valueList = new ArrayList<Value>();
		for (ValidateSchema schema : visualValidateMediator.getSchemas()) {

			if (schema.getValidateSchemaKeyType().getLiteral()
					.equals(KeyType.STATIC.getLiteral())) {

				if (schema.getValidateStaticSchemaKey() != null
						&& schema.getValidateStaticSchemaKey().getKeyValue() != null) {
					Value val = new Value(schema.getValidateStaticSchemaKey()
							.getKeyValue());
					valueList.add(val);
				}

			} else {

				NamespacedProperty dynamicSchemaKey = schema
						.getValidateDynamicSchemaKey();
				if (dynamicSchemaKey != null
						&& dynamicSchemaKey
								.getPropertyValue() != null) {
					SynapseXPath xpath = new SynapseXPath(dynamicSchemaKey.getPropertyValue());
					for (Entry<String, String> entry : dynamicSchemaKey.getNamespaces().entrySet()) {
						xpath.addNamespace(entry.getKey(), entry.getValue());
					}
					Value val = new Value(xpath);
					valueList.add(val);
				}

			}
		}
		validateMediator.setSchemaKeys(valueList);		
		
		//ListMediator onFailMediatorList = new AnonymousListMediator();
		SequenceMediator onFailMediatorList=new SequenceMediator();
		TransformationInfo newOnFailInfo = new TransformationInfo();
		newOnFailInfo.setTraversalDirection(information.getTraversalDirection());
		newOnFailInfo.setSynapseConfiguration(information.getSynapseConfiguration());
		newOnFailInfo.setOriginInSequence(information.getOriginInSequence());
		newOnFailInfo.setOriginOutSequence(information.getOriginOutSequence());
		newOnFailInfo.setParentSequence(onFailMediatorList);
		doTransform(newOnFailInfo, visualValidateMediator.getOnFailOutputConnector());
		validateMediator.addAll(onFailMediatorList.getList());
	
		
		
		for(ValidateFeature feature : visualValidateMediator.getFeatures()){
			try{
	        validateMediator.addFeature(feature.getFeatureName(), feature.isFeatureEnabled());
			}
			catch (Exception e) {
			log.error(e);
			}
			
		}
		
		if(!visualValidateMediator.getResources().isEmpty()){
			
			ResourceMap rMap = new ResourceMap();
			
			for(ValidateResource resource : visualValidateMediator.getResources()){
				
				if(resource.getLocation() != null && resource.getKey() != null){
					
				rMap.addResource(resource.getLocation(), resource.getKey().getKeyValue());
				
				}
			}
			
			validateMediator.setResourceMap(rMap);
		}
		
		
		return validateMediator;
	}
}
