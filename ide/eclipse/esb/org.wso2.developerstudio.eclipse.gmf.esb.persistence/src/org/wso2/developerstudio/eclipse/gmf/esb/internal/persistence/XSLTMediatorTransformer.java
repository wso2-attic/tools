package org.wso2.developerstudio.eclipse.gmf.esb.internal.persistence;

import java.util.List;

import org.apache.synapse.SynapseArtifact;
import org.apache.synapse.endpoints.Endpoint;
import org.apache.synapse.mediators.MediatorProperty;
import org.apache.synapse.mediators.Value;
import org.apache.synapse.mediators.base.SequenceMediator;
import org.apache.synapse.util.resolver.ResourceMap;
import org.apache.synapse.util.xpath.SynapseXPath;
import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EObject;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbNode;
import org.wso2.developerstudio.eclipse.gmf.esb.NamespacedProperty;
import org.wso2.developerstudio.eclipse.gmf.esb.PropertyMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.XSLTFeature;
import org.wso2.developerstudio.eclipse.gmf.esb.XSLTMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.XSLTProperty;
import org.wso2.developerstudio.eclipse.gmf.esb.XSLTResource;
import org.wso2.developerstudio.eclipse.gmf.esb.persistence.TransformationInfo;

public class XSLTMediatorTransformer extends AbstractEsbNodeTransformer {

	public void transform(TransformationInfo info,
			EsbNode subject) throws Exception {		
		info.getParentSequence().addChild(createXSLTMediator(subject));
		doTransform(info, ((XSLTMediator)subject).getOutputConnector());
	}

	public void createSynapseObject(TransformationInfo info, EObject subject,
			List<Endpoint> endPoints) {
		// TODO Auto-generated method stub
		
	}

	public void transformWithinSequence(TransformationInfo information,
			EsbNode subject, SequenceMediator sequence) throws Exception {
		// TODO Auto-generated method stub
		sequence.addChild(createXSLTMediator(subject));
		doTransformWithinSequence(information,((XSLTMediator)subject).getOutputConnector().getOutgoingLink(),sequence);
		
	}
	
	private org.apache.synapse.mediators.transform.XSLTMediator createXSLTMediator(EsbNode subject) throws Exception{
		Assert.isTrue(subject instanceof XSLTMediator, "Invalid subject.");
		XSLTMediator visualXSLT = (XSLTMediator)subject;
		
		org.apache.synapse.mediators.transform.XSLTMediator xsltMediator = new  org.apache.synapse.mediators.transform.XSLTMediator();
		
		NamespacedProperty sourceXPath = visualXSLT.getSourceXPath();
		if(sourceXPath.getPropertyValue()!=null && !sourceXPath.getPropertyValue().equals("")){
			xsltMediator.setSource(new SynapseXPath(sourceXPath.getPropertyValue()));
		}
		String key = visualXSLT.getXsltStaticSchemaKey().getKeyValue();
		if(key!=null && !key.equals("")){
			xsltMediator.setXsltKey(new Value(key));
		}
		
		for (XSLTFeature feature: visualXSLT.getFeatures()){
			try {
				xsltMediator.addFeature(feature.getFeatureName(), feature.isFeatureEnabled());
			} catch (Exception e) {

			}
		}
		for (XSLTProperty property:visualXSLT.getProperties()){
			MediatorProperty mProperty = new MediatorProperty();
			mProperty.setName(property.getPropertyName());
			mProperty.setValue(property.getPropertyValue());
		//	mProperty.setExpression(new SynapseXPath(property.getPropertyExpression().getPropertyValue()));
			xsltMediator.addProperty(mProperty);
		}
		ResourceMap rMap = new ResourceMap();
		for(XSLTResource resource:visualXSLT.getResources()){
			rMap.addResource(resource.getLocation(), resource.getKey().getKeyName());
		}
		if(rMap.getResources().size()>0){
			xsltMediator.setResourceMap(rMap);
		}
		
		return xsltMediator;
	}




}
