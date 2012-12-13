package org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.provider;


import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.ui.provider.PropertySource;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.wso2.developerstudio.eclipse.esb.core.Activator;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.configure.ui.ConfigureProxyServiceDialog;
import org.wso2.developerstudio.eclipse.logging.core.IDeveloperStudioLog;
import org.wso2.developerstudio.eclipse.logging.core.Logger;

public class EsbPropertySource extends PropertySource {
	private static IDeveloperStudioLog log = Logger.getLog(Activator.PLUGIN_ID);

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
			return new CustomPropertyDescriptor(object,itemPropertyDescriptor);
		} else if (pkg.getEnrichMediator_TargetXpath().equals(feature)) {
			return new CustomPropertyDescriptor(object,itemPropertyDescriptor);
		} /*else if (pkg.getFilterMediator_Xpath().equals(feature)) {
			return new FilterXPathPropertyDescriptor(object,
					itemPropertyDescriptor);
		}*//* else if (pkg.getFilterMediator_Source().equals(feature)) {
			return new FilterSourcePropertyDescriptor(object,
					itemPropertyDescriptor);
		}*/ else if (pkg.getXSLTMediator_Properties().equals(feature)) {
			return new XSLTPropertiesPropertyDescriptor(object,
					itemPropertyDescriptor);
		} else if (pkg.getXSLTMediator_Resources().equals(feature)) {
			return new XSLTResourcesPropertyDescriptor(object,
					itemPropertyDescriptor);
		} else if (pkg.getXSLTMediator_Features().equals(feature)) {
			return new XSLTFeaturesPropertyDescriptor(object,
					itemPropertyDescriptor);
		} else if (pkg.getXSLTMediator_SourceXPath().equals(feature)) {
			return new CustomPropertyDescriptor(object,
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
		} else if (pkg.getSendMediator_StaticReceivingSequence().equals(feature)){
			return new CustomPropertyDescriptor(object,itemPropertyDescriptor);
		} else if(pkg.getHeaderMediator_HeaderName().equals(feature)){
			return new CustomPropertyDescriptor(object,itemPropertyDescriptor);
		} else if(pkg.getHeaderMediator_ValueExpression().equals(feature)){
			return new CustomPropertyDescriptor(object,itemPropertyDescriptor);
		} else if(pkg.getAggregateMediator_AggregationExpression().equals(feature)){
			return new CustomPropertyDescriptor(object, itemPropertyDescriptor);
		}else if(pkg.getAggregateMediator_CompletionMaxMessagesExpression().equals(feature)){
			return new CustomPropertyDescriptor(object, itemPropertyDescriptor);
		}else if(pkg.getAggregateMediator_CompletionMinMessagesExpression().equals(feature)){
			return new CustomPropertyDescriptor(object, itemPropertyDescriptor);
		}else if(pkg.getAggregateMediator_SequenceKey().equals(feature)){
			return new CustomPropertyDescriptor(object, itemPropertyDescriptor);
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
		} else if(pkg.getSendMediator_DynamicReceivingSequence().equals(feature)){
			return new CustomPropertyDescriptor(object, itemPropertyDescriptor);
		} else if(pkg.getProxyService_WsdlKey().equals(feature)){
			return new CustomPropertyDescriptor(object, itemPropertyDescriptor);
		} else if(pkg.getPropertyMediator_ValueExpression().equals(feature)){
			return new CustomPropertyDescriptor(object, itemPropertyDescriptor);
		} else if(pkg.getEventMediator_DynamicTopic().equals(feature)){
			return new CustomPropertyDescriptor(object, itemPropertyDescriptor);
		} else if(pkg.getEventMediator_EventExpression().equals(feature)){
			return new CustomPropertyDescriptor(object, itemPropertyDescriptor);
		} else if(pkg.getXSLTMediator_XsltDynamicSchemaKey().equals(feature)){
			return new CustomPropertyDescriptor(object, itemPropertyDescriptor);
		} else if(pkg.getXSLTMediator_SourceXPath().equals(feature)){
			return new CustomPropertyDescriptor(object, itemPropertyDescriptor);
		} else if(pkg.getXSLTMediator_XsltStaticSchemaKey().equals(feature)){
			return new CustomPropertyDescriptor(object, itemPropertyDescriptor);
		} else if(pkg.getXQueryMediator_TargetXPath().equals(feature)){
			return new CustomPropertyDescriptor(object, itemPropertyDescriptor);
		} else if(pkg.getXQueryMediator_DynamicScriptKey().equals(feature)){
			return new CustomPropertyDescriptor(object, itemPropertyDescriptor);
		} else if(pkg.getXQueryMediator_StaticScriptKey().equals(feature)){
			return new CustomPropertyDescriptor(object, itemPropertyDescriptor);
		} else if(pkg.getFaultMediator_FaultReasonExpression().equals(feature)){
			return new CustomPropertyDescriptor(object, itemPropertyDescriptor);
		} else if(pkg.getFaultMediator_FaultDetailExpression().equals(feature)){
			return new CustomPropertyDescriptor(object, itemPropertyDescriptor);
		} else if(pkg.getFaultMediator_FaultStringExpression().equals(feature)){
			return new CustomPropertyDescriptor(object, itemPropertyDescriptor);
		} else if(pkg.getCalloutMediator_PayloadRegistryKey().equals(feature)){
			return new CustomPropertyDescriptor(object, itemPropertyDescriptor);
		} else if(pkg.getSpringMediator_ConfigurationKey().equals(feature)){
			return new CustomPropertyDescriptor(object, itemPropertyDescriptor);
		} else if(pkg.getScriptMediator_ScriptKey().equals(feature)){
			return new CustomPropertyDescriptor(object, itemPropertyDescriptor);
		} else if(pkg.getSmooksMediator_ConfigurationKey().equals(feature)){
			return new CustomPropertyDescriptor(object, itemPropertyDescriptor);
		} else if(pkg.getSmooksMediator_InputExpression() .equals(feature)){
			return new CustomPropertyDescriptor(object, itemPropertyDescriptor);
		} else if(pkg.getSmooksMediator_OutputExpression().equals(feature)){
			return new CustomPropertyDescriptor(object, itemPropertyDescriptor);
		} else if(pkg.getEnqueueMediator_SequenceKey().equals(feature)){
			return new CustomPropertyDescriptor(object,itemPropertyDescriptor);
		} else if(pkg.getRuleMediator_RuleSetSourceKey().equals(feature)){
			return new CustomPropertyDescriptor(object,itemPropertyDescriptor);
		} else if(pkg.getRuleMediator_FactsConfiguration().equals(feature)){
			return new RuleMediatorFactsPropertyDescriptor(object,itemPropertyDescriptor);
		} else if(pkg.getRuleMediator_ResultsConfiguration().equals(feature)){
			return new RuleMediatorResultsPropertyDescriptor(object,itemPropertyDescriptor);	
		}else if(pkg.getRuleMediator_RuleSessionProperties().equals(feature)){
			return new RuleMediatorSessionPropertyDescriptor(object,itemPropertyDescriptor);
		}else if(pkg.getRuleMediator_RuleSetProperties().equals(feature)){
			return new RuleMediatorRuleSetPropertyDescriptor(object,itemPropertyDescriptor);
		} else if (pkg.getStoreMediator_OnStoreSequence().equals(feature)) {
			return new CustomPropertyDescriptor(object,itemPropertyDescriptor);
		} else if(pkg.getFilterMediator_Xpath().equals(feature)){
		    return new CustomPropertyDescriptor(object, itemPropertyDescriptor);
		} else if(pkg.getFilterMediator_Source().equals(feature)){
			return new CustomPropertyDescriptor(object, itemPropertyDescriptor);			
			//CallTemplate Mediator Template parameter custom property descriptor.
		} else if(pkg.getCallTemplateMediator_TemplateParameters().equals(feature)){
			return new CallTemplateParamCustomPropertyDescriptor(object, itemPropertyDescriptor);			
			//Cache Mediator OnHitBranch Sequence Key custom property descriptor.
		} else if(pkg.getCacheMediator_SequenceKey().equals(feature)){			
			return new CustomPropertyDescriptor(object, itemPropertyDescriptor);			
		} else if (pkg.getCommandMediator_Properties().equals(feature)) {			
			return new CommandMediatorPropertyDescriptor(object,itemPropertyDescriptor);
		} else if (pkg.getRouterMediator_RouterContainer().equals(feature)) {
			return new RouterMediatorPropertyDescriptor(object,itemPropertyDescriptor);
		} else if (pkg.getConditionalRouterMediator_ConditionalRouteBranches().equals(feature)) {
			return new ConditionalRouterMediatorPropertyDescriptor(object,itemPropertyDescriptor);
		} else if (pkg.getPayloadFactoryMediator_Args().equals(feature)) {
			return new PayloadFactoryPropertyDescriptor(object,itemPropertyDescriptor);
		} else if (pkg.getAbstractSqlExecutorMediator_SqlStatements().equals(feature)) {
			return new SqlExecutorMediatorSqlStatementsPropertyDescriptor(object,itemPropertyDescriptor);		}
			//Throttle Mediator Policy Entries custom property descriptor.
		else if(pkg.getThrottleMediator_PolicyEntries().equals(feature)){			
			return new ThrottlePolicyEntryPropertyDescriptor(object, itemPropertyDescriptor);			
			//Throttle Mediator Policy key custom property descriptor.
		}else if(pkg.getThrottleMediator_PolicyKey().equals(feature)){			
			return new CustomPropertyDescriptor(object, itemPropertyDescriptor);
			//Throttle Mediator On Accept branch custom property descriptor.
		}else if(pkg.getThrottleMediator_OnAcceptBranchsequenceKey().equals(feature)){			
			return new CustomPropertyDescriptor(object, itemPropertyDescriptor);			
			//Throttle Mediator On Reject branch custom property descriptor.
		}else if(pkg.getThrottleMediator_OnRejectBranchsequenceKey().equals(feature)){			
			return new CustomPropertyDescriptor(object, itemPropertyDescriptor);			
			//Validate Mediator Source path Custom property descriptors.
		}else if(pkg.getValidateMediator_SourceXpath().equals(feature)){			
			return new CustomPropertyDescriptor(object, itemPropertyDescriptor);			
			//Validate Mediator Schema Custom property descriptors.
		}else if(pkg.getValidateMediator_Schemas().equals(feature)){			
			return new ValidateSchemasPropertyDescriptor(object, itemPropertyDescriptor);			
			//Validate Mediator Features Custom property descriptors.
		}else if(pkg.getValidateMediator_Features().equals(feature)){			
			return new ValidateFeaturePropertyDescriptor(object, itemPropertyDescriptor);			
		}else if(pkg.getValidateMediator_Resources().equals(feature)){
			return new ValidateResourcePropertyDescriptor(object, itemPropertyDescriptor);
		}
		else if(pkg.getURLRewriteMediator_UrlRewriteRules().equals(feature)){			
			return new URLRewiterConfigurationPropertyDescriptor(object, itemPropertyDescriptor);			
			//Builder Mediator message builder custom property descriptor.
		}else if(pkg.getBuilderMediator_MessageBuilders().equals(feature)){			
			return new MessageBuilderPropertyDescriptor(object, itemPropertyDescriptor);			
		}else if(pkg.getRuleMediator_SourceXpath().equals(feature)){
			return new CustomPropertyDescriptor(object, itemPropertyDescriptor);
		}else if(pkg.getRuleMediator_TargetResultXpath().equals(feature)){
			return new CustomPropertyDescriptor(object, itemPropertyDescriptor);
		}else if(pkg.getRuleMediator_TargetResultXpath().equals(feature)){
			return new CustomPropertyDescriptor(object, itemPropertyDescriptor);
		}else if(pkg.getProxyService_InSequenceKey().equals(feature)){
			return new CustomPropertyDescriptor(object, itemPropertyDescriptor);
		}else if(pkg.getProxyService_OutSequenceKey().equals(feature)){
			return new CustomPropertyDescriptor(object, itemPropertyDescriptor);
		}else if(pkg.getProxyService_FaultSequenceKey().equals(feature)){
			return new CustomPropertyDescriptor(object, itemPropertyDescriptor);
		}else if(pkg.getTask_TaskProperties().equals(feature)){
			return new TaskConfigurationPropertyDescriptor(object, itemPropertyDescriptor);
		}else if(pkg.getAPIResource_InSequenceKey().equals(feature)){
			return new CustomPropertyDescriptor(object, itemPropertyDescriptor);
		}else if(pkg.getAPIResource_OutSequenceKey().equals(feature)){
			return new CustomPropertyDescriptor(object, itemPropertyDescriptor);
		}else if(pkg.getAPIResource_FaultSequenceKey().equals(feature)){
			return new CustomPropertyDescriptor(object, itemPropertyDescriptor);
		}
		
		else if(pkg.getAbstractEndPoint_ReliableMessagingPolicy().equals(feature)){
			return new CustomPropertyDescriptor(object, itemPropertyDescriptor);
		}else if(pkg.getAbstractEndPoint_SecurityPolicy().equals(feature)){
			return new CustomPropertyDescriptor(object, itemPropertyDescriptor);
		}
		
		else if(pkg.getBeanMediator_ValueExpression().equals(feature)){
			return new CustomPropertyDescriptor(object, itemPropertyDescriptor);
		}else if(pkg.getBeanMediator_TargetExpression().equals(feature)){
			return new CustomPropertyDescriptor(object, itemPropertyDescriptor);
		}else if(pkg.getEJBMediator_SessionIdExpression().equals(feature)){
			return new CustomPropertyDescriptor(object, itemPropertyDescriptor);
		}else if(pkg.getProxyService_WsdlResources().equals(feature)){
			return new ProxyServiceWSDLResourcePropertyDescriptor(object, itemPropertyDescriptor);
		}
		
		
			
		// Else, default EMF behavior
		else {
			return super.createPropertyDescriptor(itemPropertyDescriptor);
		}
	}
	
	  public Object getPropertyValue(Object propertyId)
	  {
		  try{
			  return super.getPropertyValue(propertyId);
		  }
		  catch(NullPointerException e){
			  return null;
		  }
	  }
}
