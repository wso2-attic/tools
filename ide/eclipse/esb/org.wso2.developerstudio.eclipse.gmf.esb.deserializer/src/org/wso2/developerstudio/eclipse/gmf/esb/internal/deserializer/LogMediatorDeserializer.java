package org.wso2.developerstudio.eclipse.gmf.esb.internal.deserializer;

import org.apache.commons.lang.StringUtils;
import org.apache.synapse.mediators.AbstractMediator;
import org.apache.synapse.mediators.MediatorProperty;
import org.apache.synapse.util.xpath.SynapseXPath;
import org.eclipse.core.runtime.Assert;
import org.jaxen.JaxenException;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbFactory;
import org.wso2.developerstudio.eclipse.gmf.esb.LogCategory;
import org.wso2.developerstudio.eclipse.gmf.esb.LogLevel;
import org.wso2.developerstudio.eclipse.gmf.esb.LogMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.LogProperty;
import org.wso2.developerstudio.eclipse.gmf.esb.Mediator;
import org.wso2.developerstudio.eclipse.gmf.esb.NamespacedProperty;
import org.wso2.developerstudio.eclipse.gmf.esb.PropertyValueType;
import org.eclipse.emf.ecore.EObject;

public class LogMediatorDeserializer extends AbstractEsbNodeDeserializer {

	
	public Mediator createMediator(AbstractMediator mediator) {
		
		Assert.isTrue(mediator instanceof org.apache.synapse.mediators.builtin.LogMediator, "Invalid Mediator.");
		
		org.apache.synapse.mediators.builtin.LogMediator logMediator = (org.apache.synapse.mediators.builtin.LogMediator)mediator;
		
		LogMediator vishualLog = EsbFactory.eINSTANCE.createLogMediator();
		
		vishualLog.setInputConnector(EsbFactory.eINSTANCE.createLogMediatorInputConnector());
		vishualLog.setOutputConnector(EsbFactory.eINSTANCE.createLogMediatorOutputConnector());
		
		
		switch (logMediator.getCategory()) {
		
		case org.apache.synapse.mediators.builtin.LogMediator.CATEGORY_DEBUG:
			vishualLog.setLogCategory(LogCategory.DEBUG);
			break;

		case org.apache.synapse.mediators.builtin.LogMediator.CATEGORY_ERROR:
			vishualLog.setLogCategory(LogCategory.ERROR);
			break;

		case org.apache.synapse.mediators.builtin.LogMediator.CATEGORY_FATAL:
			vishualLog.setLogCategory(LogCategory.FATAL);
			break;

		case org.apache.synapse.mediators.builtin.LogMediator.CATEGORY_INFO:
			vishualLog.setLogCategory(LogCategory.INFO);
			break;
		case org.apache.synapse.mediators.builtin.LogMediator.CATEGORY_TRACE:
			vishualLog.setLogCategory(LogCategory.TRACE);
			break;

		case org.apache.synapse.mediators.builtin.LogMediator.CATEGORY_WARN:
			vishualLog.setLogCategory(LogCategory.WARN);
			break;
		}
		
		
		switch(logMediator.getLogLevel()){
		
		case org.apache.synapse.mediators.builtin.LogMediator.CUSTOM:
			vishualLog.setLogLevel(LogLevel.CUSTOM);
			break;
			
		case org.apache.synapse.mediators.builtin.LogMediator.FULL:
			vishualLog.setLogLevel(LogLevel.FULL);
			break;
		
		case org.apache.synapse.mediators.builtin.LogMediator.HEADERS:
			vishualLog.setLogLevel(LogLevel.HEADERS);
			break;
		
		case org.apache.synapse.mediators.builtin.LogMediator.SIMPLE:
			vishualLog.setLogLevel(LogLevel.SIMPLE);
			
		}
		
		
		if (!StringUtils.isBlank(logMediator.getSeparator())) {
			vishualLog.setLogSeparator(logMediator.getSeparator());
		}
		
		
		for(MediatorProperty mediatorProprety : logMediator.getProperties()){
			
			LogProperty logProperty = EsbFactory.eINSTANCE.createLogProperty();
			
			logProperty.setPropertyName(mediatorProprety.getName());
			
			if(mediatorProprety.getValue() != null){
				
				logProperty.setPropertyValueType(PropertyValueType.LITERAL);
				logProperty.setPropertyValue(mediatorProprety.getValue());
				
			}else if(mediatorProprety.getExpression() != null){
				
				logProperty.setPropertyValueType(PropertyValueType.EXPRESSION);
				NamespacedProperty namespaceProp = EsbFactory.eINSTANCE.createNamespacedProperty();
				namespaceProp.setPropertyValue(mediatorProprety.getExpression().toString());
				logProperty.setPropertyExpression(namespaceProp);
				
			}
			
			vishualLog.getProperties().add(logProperty);
		}
		
		
		return vishualLog;
	}
	
	
/*	public static void main(String [] args){

		org.apache.synapse.mediators.builtin.LogMediator logMediator = new org.apache.synapse.mediators.builtin.LogMediator();
		logMediator
				.setCategory(org.apache.synapse.mediators.builtin.LogMediator.CATEGORY_DEBUG);
		logMediator
				.setLogLevel(org.apache.synapse.mediators.builtin.LogMediator.FULL);
		logMediator.setSeparator(",");

		for (int i = 0; i < 3; i++) {

			MediatorProperty mediatorProperty = new MediatorProperty();
			mediatorProperty.setName("name");

			if (i == 0) {

				mediatorProperty.setValue("value");

			} else {

				SynapseXPath propertyExpression;

				try {

					propertyExpression = new SynapseXPath("xpath");
					mediatorProperty.setExpression(propertyExpression);

				} catch (JaxenException e) {

					e.printStackTrace();
				}

			}

			logMediator.addProperty(mediatorProperty);
		}

		LogMediatorDeserializer lmde = new LogMediatorDeserializer();
		Mediator mediator = lmde.createMediator(logMediator);

		if (mediator instanceof LogMediator) {

			LogMediator visualLog = (LogMediator) mediator;

			visualLog.getLogSeparator();

		}
	}*/
  
	
}
