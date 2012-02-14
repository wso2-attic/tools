package org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.custom.provider;

//import jfb.examples.gmf.school.SchoolPackage;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.ui.provider.PropertySource;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.wso2.carbonstudio.eclipse.gmf.esb.EsbPackage;

public class EsbPropertySource extends PropertySource {

	public EsbPropertySource(Object object,
			IItemPropertySource itemPropertySource) {
		super(object, itemPropertySource);
	}

	
	protected IPropertyDescriptor createPropertyDescriptor(
			IItemPropertyDescriptor itemPropertyDescriptor) {
		EsbPackage pkg = EsbPackage.eINSTANCE;
		Object feature = itemPropertyDescriptor.getFeature(object);
		if (pkg.getLogMediator_Properties().equals(feature)) {
			return new LogConfigurationPropertyDescriptor(object,
					itemPropertyDescriptor);
		} else if (pkg.getEnrichMediator_SourceXpath().equals(feature)) {
			return new EnrichSourceXPathPropertyDescriptor(object,
					itemPropertyDescriptor);
		} else if (pkg.getEnrichMediator_TargetXpath().equals(feature)) {
			return new EnrichTargetXPathPropertyDescriptor(object,
					itemPropertyDescriptor);
		} else if (pkg.getFilterMediator_Xpath().equals(feature)) {
			return new FilterXPathPropertyDescriptor(object,
					itemPropertyDescriptor);
		} else if (pkg.getFilterMediator_Source().equals(feature)) {
			return new FilterSourcePropertyDescriptor(object,
					itemPropertyDescriptor);
		} else if (pkg.getXSLTMediator_Properties().equals(feature)) {
			return new XSLTPropertiesPropertyDescriptor(object,
					itemPropertyDescriptor);
		} else if (pkg.getXSLTMediator_Resources().equals(feature)) {
			return new XSLTResourcesPropertyDescriptor(object,
					itemPropertyDescriptor);
		} else if (pkg.getXSLTMediator_Features().equals(feature)) {
			return new XSLTFeaturesPropertyDescriptor(object,
					itemPropertyDescriptor);
		} else if (pkg.getXSLTMediator_SourceXPath().equals(feature)) {
			return new XSLTSourceXPathPropertyDescriptor(object,
					itemPropertyDescriptor);
		} else if (pkg.getXSLTMediator_XsltKey().equals(feature)) {
			return new XSLTKeyPropertyDescriptor(object,
					itemPropertyDescriptor);
		} else if (pkg.getSwitchMediator_SourceXpath().equals(feature)) {
			return new SwitchSourceXPathPropertyDescriptor(object,
					itemPropertyDescriptor);
		} else if (pkg.getSwitchMediator_CaseBranches().equals(feature)) {
			return new SwitchConfigurationPropertyDescriptor(object,
					itemPropertyDescriptor);
		} else if (pkg.getClassMediator_Properties().equals(feature)) {
			return new ClassConfigurationPropertyDescriptor(object,
					itemPropertyDescriptor);
		} else if(pkg.getHeaderMediator_HeaderName().equals(feature)){
			return new CustomPropertyDescriptor(object,itemPropertyDescriptor);
		} else if(pkg.getHeaderMediator_ValueExpression().equals(feature)){
			return new CustomPropertyDescriptor(object,itemPropertyDescriptor);
		} else if(pkg.getAggregateMediator_CorrelationExpression().equals(feature)){
			return new CustomPropertyDescriptor(object, itemPropertyDescriptor);
		} else if(pkg.getRMSequenceMediator_CorrelationXpath().equals(feature)){
			return new CustomPropertyDescriptor(object, itemPropertyDescriptor);
		} else if(pkg.getRMSequenceMediator_LastMessageXpath().equals(feature)){
			return new CustomPropertyDescriptor(object, itemPropertyDescriptor);
		} else if(pkg.getIterateMediator_IterateExpression().equals(feature)){
			return new CustomPropertyDescriptor(object, itemPropertyDescriptor);
		} else if(pkg.getIterateMediator_AttachPath().equals(feature)){
			return new CustomPropertyDescriptor(object, itemPropertyDescriptor);
		} else if(pkg.getCalloutMediator_ResultMessageXpath().equals(feature)){
			return new CustomPropertyDescriptor(object, itemPropertyDescriptor);
		} else if(pkg.getCalloutMediator_PayloadMessageXpath().equals(feature)){
			return new CustomPropertyDescriptor(object, itemPropertyDescriptor);
		}
		
		
		// Else, default EMF behavior
		else {
			return super.createPropertyDescriptor(itemPropertyDescriptor);
		}
	}
}
