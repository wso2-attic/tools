package org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.deserializer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.synapse.mediators.AbstractMediator;
import org.apache.synapse.mediators.MediatorProperty;
import org.apache.synapse.mediators.Value;
import org.apache.synapse.util.xpath.SynapseXPath;
import org.eclipse.core.runtime.Assert;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbFactory;
import org.wso2.developerstudio.eclipse.gmf.esb.KeyType;
import org.wso2.developerstudio.eclipse.gmf.esb.NamespacedProperty;
import org.wso2.developerstudio.eclipse.gmf.esb.RegistryKeyProperty;
import org.wso2.developerstudio.eclipse.gmf.esb.XSLTFeature;
import org.wso2.developerstudio.eclipse.gmf.esb.XSLTMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.XSLTProperty;
import org.wso2.developerstudio.eclipse.gmf.esb.XSLTResource;

public class XSLTMediatorDeserializer extends
                                     AbstractEsbNodeDeserializer<AbstractMediator, XSLTMediator> {

	@Override
	public XSLTMediator createNode(AbstractMediator mediator) {

		Assert.isTrue(mediator instanceof org.apache.synapse.mediators.transform.XSLTMediator,
		              "Unsupported mediator passed in for deserialization at " + this.getClass());

		org.apache.synapse.mediators.transform.XSLTMediator xsltMediator =
		                                                                   (org.apache.synapse.mediators.transform.XSLTMediator) mediator;

		XSLTMediator vishualXslt = EsbFactory.eINSTANCE.createXSLTMediator();

		if (xsltMediator.getXsltKey() != null) {

			Value keyValue = xsltMediator.getXsltKey();

			if (keyValue.getKeyValue() != null && !keyValue.getKeyValue().equals("")) {

				vishualXslt.setXsltSchemaKeyType(KeyType.STATIC);

				RegistryKeyProperty regKey = EsbFactory.eINSTANCE.createRegistryKeyProperty();

				regKey.setKeyValue(keyValue.getKeyValue());

				vishualXslt.setXsltStaticSchemaKey(regKey);
			} else if (keyValue.getExpression() != null) {

				vishualXslt.setXsltSchemaKeyType(KeyType.DYNAMIC);

				SynapseXPath xpath = keyValue.getExpression();

				NamespacedProperty nsp = EsbFactory.eINSTANCE.createNamespacedProperty();

				nsp.setPropertyValue(xpath.toString());

				if (xpath.getNamespaces() != null) {

					@SuppressWarnings("unchecked")
					Map<String, String> map = xpath.getNamespaces();

					nsp.setNamespaces(map);
				}

				vishualXslt.setXsltDynamicSchemaKey(nsp);
			}
		}

		if (xsltMediator.getSource() != null) {

			SynapseXPath SourceXpath = xsltMediator.getSource();

			NamespacedProperty nsp = EsbFactory.eINSTANCE.createNamespacedProperty();

			nsp.setPropertyValue(SourceXpath.toString());

			if (SourceXpath.getNamespaces() != null) {

				@SuppressWarnings("unchecked")
				Map<String, String> map = SourceXpath.getNamespaces();

				nsp.setNamespaces(map);
			}

			vishualXslt.setSourceXPath(nsp);
		}

		if (xsltMediator.getFeatures() != null && !xsltMediator.getFeatures().isEmpty()) {

			List<XSLTFeature> vishualFeatureList = new ArrayList<XSLTFeature>();

			for (MediatorProperty featureMediatorProperty : xsltMediator.getFeatures()) {

				XSLTFeature visualFeature = EsbFactory.eINSTANCE.createXSLTFeature();

				if (featureMediatorProperty.getName() != null &&
				    !featureMediatorProperty.getName().equals("")) {

					visualFeature.setFeatureName(featureMediatorProperty.getName());
				}

				if (Boolean.parseBoolean(featureMediatorProperty.getValue())) {

					visualFeature.setFeatureEnabled(Boolean.parseBoolean(featureMediatorProperty.getValue()));
				}

				vishualFeatureList.add(visualFeature);

			}

			vishualXslt.getFeatures().addAll(vishualFeatureList);
		}

		if (xsltMediator.getProperties() != null && !xsltMediator.getProperties().isEmpty()) {

			List<XSLTProperty> vishualPropertyList = new ArrayList<XSLTProperty>();

			for (MediatorProperty propertyMediatorProperty : xsltMediator.getProperties()) {

				XSLTProperty vishualProperty = EsbFactory.eINSTANCE.createXSLTProperty();

				if (propertyMediatorProperty.getName() != null &&
				    !propertyMediatorProperty.getName().equals("")) {

					vishualProperty.setPropertyName(propertyMediatorProperty.getName());
				}

				if (propertyMediatorProperty.getValue() != null &&
				    !propertyMediatorProperty.getValue().equals("")) {

					vishualProperty.setPropertyValue(propertyMediatorProperty.getValue());
				}

				vishualPropertyList.add(vishualProperty);
			}

			vishualXslt.getProperties().addAll(vishualPropertyList);
		}

		if (xsltMediator.getResourceMap() != null &&
		    xsltMediator.getResourceMap().getResources() != null) {

			Map<String, String> resourceMap = xsltMediator.getResourceMap().getResources();

			List<XSLTResource> vishualResourceList = new ArrayList<XSLTResource>();

			for (Entry<String, String> entry : resourceMap.entrySet()) {

				XSLTResource resource = EsbFactory.eINSTANCE.createXSLTResource();

				resource.setLocation(entry.getKey());

				RegistryKeyProperty regkey = EsbFactory.eINSTANCE.createRegistryKeyProperty();

				regkey.setKeyValue(entry.getValue());

				resource.setKey(regkey);

				vishualResourceList.add(resource);
			}

			vishualXslt.getResources().addAll(vishualResourceList);

		}

		return vishualXslt;
	}

}
