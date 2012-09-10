package org.wso2.developerstudio.eclipse.gmf.esb.internal.persistence;

import java.util.ArrayList;
import java.util.List;

import org.apache.synapse.config.xml.AnonymousListMediator;
import org.apache.synapse.endpoints.Endpoint;
import org.apache.synapse.mediators.ListMediator;
import org.apache.synapse.mediators.Value;
import org.apache.synapse.mediators.base.SequenceMediator;
import org.apache.synapse.util.xpath.SynapseXPath;
import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EObject;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbNode;
import org.wso2.developerstudio.eclipse.gmf.esb.KeyType;
import org.wso2.developerstudio.eclipse.gmf.esb.NamespacedProperty;
import org.wso2.developerstudio.eclipse.gmf.esb.ValidateMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.ValidateSchema;
import org.wso2.developerstudio.eclipse.gmf.esb.persistence.TransformationInfo;

public class ValidateMediatorTransformer  extends AbstractEsbNodeTransformer {
	
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
/*		if (sourceXPath.getPropertyValue() != null
				&& !sourceXPath.getPropertyValue().equals("")) {
			validateMediator.setSource(new SynapseXPath(sourceXPath
					.getPropertyValue()));
		}*/

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

				if (schema.getValidateDynamicSchemaKey() != null
						&& schema.getValidateDynamicSchemaKey()
								.getPropertyValue() != null) {
					SynapseXPath xpath = new SynapseXPath(schema
							.getValidateDynamicSchemaKey().getPropertyValue());
					Value val = new Value(xpath);
					valueList.add(val);
				}

			}
		}
		validateMediator.setSchemaKeys(valueList);		
		
		ListMediator onFailMediatorList = new AnonymousListMediator();
		TransformationInfo newOnFailInfo = new TransformationInfo();
		newOnFailInfo.setTraversalDirection(TransformationInfo.TRAVERSAL_DIRECTION_IN);
		newOnFailInfo.setSynapseConfiguration(information.getSynapseConfiguration());
		newOnFailInfo.setOriginInSequence(information.getOriginInSequence());
		newOnFailInfo.setOriginOutSequence(information.getOriginOutSequence());
		newOnFailInfo.setParentSequence(onFailMediatorList);
		doTransform(newOnFailInfo, visualValidateMediator.getOnFailOutputConnector());
		validateMediator.addAll(onFailMediatorList.getList());
	
		//TODO implement feature transformation logic
		
		/*for(ValidateFeature feature : visualValidateMediator.getFeatures()){
			
			System.out.println(feature.getFeatureName()+" "+ feature.isFeatureEnabled());
	        validateMediator.addFeature("test", feature.isFeatureEnabled());
			
		}*/
		
		return validateMediator;
	}
}
