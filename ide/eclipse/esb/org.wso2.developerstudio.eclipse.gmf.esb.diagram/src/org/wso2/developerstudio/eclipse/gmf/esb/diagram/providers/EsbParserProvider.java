package org.wso2.developerstudio.eclipse.gmf.esb.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.AddressEndPointEndPointName2EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.AggregateMediatorAggregateID2EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.AggregateMediatorAggregateIDEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.CacheMediatorCacheId2EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.CacheMediatorCacheIdEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.CalloutMediatorSoapAction2EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.CalloutMediatorSoapAction3EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.CalloutMediatorSoapAction4EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.CalloutMediatorSoapActionEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.ClassMediatorClassName2EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.ClassMediatorClassNameEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.CloneMediatorCloneID2EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.CloneMediatorCloneID3EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.CloneMediatorCloneID4EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.CloneMediatorCloneIDEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.CommandMediatorClassName2EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.CommandMediatorClassNameEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.DBLookupMediatorConnectionURL2EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.DBLookupMediatorConnectionURL3EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.DBLookupMediatorConnectionURL4EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.DBLookupMediatorConnectionURLEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.DBReportMediatorConnectionURL2EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.DBReportMediatorConnectionURL3EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.DBReportMediatorConnectionURL4EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.DBReportMediatorConnectionURLEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.DefaultEndPointEndPointName2EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.EnrichMediatorSourceType2EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.EnrichMediatorSourceType3EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.EnrichMediatorSourceType4EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.EnrichMediatorSourceTypeEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.EntitlementMediatorServerURL2EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.EntitlementMediatorServerURLEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.EventMediatorTopicType2EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.EventMediatorTopicTypeEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.FailoverEndPointEndPointName2EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.FaultMediatorFaultStringType2EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.FaultMediatorFaultStringType3EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.FaultMediatorFaultStringType4EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.FaultMediatorFaultStringTypeEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.FilterMediatorConditionType2EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.FilterMediatorConditionType3EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.FilterMediatorConditionType4EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.FilterMediatorConditionTypeEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.HeaderMediatorValueLiteral2EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.HeaderMediatorValueLiteral3EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.HeaderMediatorValueLiteral4EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.HeaderMediatorValueLiteralEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.IterateMediatorIterateID2EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.IterateMediatorIterateID3EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.IterateMediatorIterateID4EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.IterateMediatorIterateIDEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.LoadBalanceEndPointEndPointName2EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.LogMediatorLogCategory2EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.LogMediatorLogCategory3EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.LogMediatorLogCategory4EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.LogMediatorLogCategoryEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.OAuthMediatorRemoteServiceUrl2EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.OAuthMediatorRemoteServiceUrlEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.PropertyMediatorPropertyName2EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.PropertyMediatorPropertyName3EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.PropertyMediatorPropertyName4EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.PropertyMediatorPropertyName5EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.ProxyServiceNameEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.ScriptMediatorScriptLanguage2EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.ScriptMediatorScriptLanguageEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.SequenceName2EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.SequenceNameEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.SpringMediatorBeanName2EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.SpringMediatorBeanNameEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.ThrottleMediatorGroupId2EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.ThrottleMediatorGroupIdEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.WSDLEndPointEndPointName2EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.XQueryMediatorScriptKeyType2EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.XQueryMediatorScriptKeyTypeEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.parsers.MessageFormatParser;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbVisualIDRegistry;

/**
 * @generated
 */
public class EsbParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser proxyServiceName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getProxyServiceName_5003Parser() {
		if (proxyServiceName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getProxyService_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			proxyServiceName_5003Parser = parser;
		}
		return proxyServiceName_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser propertyMediatorPropertyName_5042Parser;

	/**
	 * @generated
	 */
	private IParser getPropertyMediatorPropertyName_5042Parser() {
		if (propertyMediatorPropertyName_5042Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getPropertyMediator_PropertyName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			propertyMediatorPropertyName_5042Parser = parser;
		}
		return propertyMediatorPropertyName_5042Parser;
	}

	/**
	 * @generated
	 */
	private IParser throttleMediatorGroupId_5044Parser;

	/**
	 * @generated
	 */
	private IParser getThrottleMediatorGroupId_5044Parser() {
		if (throttleMediatorGroupId_5044Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getThrottleMediator_GroupId() };
			MessageFormatParser parser = new MessageFormatParser(features);
			throttleMediatorGroupId_5044Parser = parser;
		}
		return throttleMediatorGroupId_5044Parser;
	}

	/**
	 * @generated
	 */
	private IParser filterMediatorConditionType_5046Parser;

	/**
	 * @generated
	 */
	private IParser getFilterMediatorConditionType_5046Parser() {
		if (filterMediatorConditionType_5046Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getFilterMediator_ConditionType() };
			MessageFormatParser parser = new MessageFormatParser(features);
			filterMediatorConditionType_5046Parser = parser;
		}
		return filterMediatorConditionType_5046Parser;
	}

	/**
	 * @generated
	 */
	private IParser logMediatorLogCategory_5047Parser;

	/**
	 * @generated
	 */
	private IParser getLogMediatorLogCategory_5047Parser() {
		if (logMediatorLogCategory_5047Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getLogMediator_LogCategory() };
			MessageFormatParser parser = new MessageFormatParser(features);
			logMediatorLogCategory_5047Parser = parser;
		}
		return logMediatorLogCategory_5047Parser;
	}

	/**
	 * @generated
	 */
	private IParser enrichMediatorSourceType_5104Parser;

	/**
	 * @generated
	 */
	private IParser getEnrichMediatorSourceType_5104Parser() {
		if (enrichMediatorSourceType_5104Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getEnrichMediator_SourceType() };
			MessageFormatParser parser = new MessageFormatParser(features);
			enrichMediatorSourceType_5104Parser = parser;
		}
		return enrichMediatorSourceType_5104Parser;
	}

	/**
	 * @generated
	 */
	private IParser sequenceName_5049Parser;

	/**
	 * @generated
	 */
	private IParser getSequenceName_5049Parser() {
		if (sequenceName_5049Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getSequence_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			sequenceName_5049Parser = parser;
		}
		return sequenceName_5049Parser;
	}

	/**
	 * @generated
	 */
	private IParser eventMediatorTopicType_5050Parser;

	/**
	 * @generated
	 */
	private IParser getEventMediatorTopicType_5050Parser() {
		if (eventMediatorTopicType_5050Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getEventMediator_TopicType() };
			MessageFormatParser parser = new MessageFormatParser(features);
			eventMediatorTopicType_5050Parser = parser;
		}
		return eventMediatorTopicType_5050Parser;
	}

	/**
	 * @generated
	 */
	private IParser entitlementMediatorServerURL_5051Parser;

	/**
	 * @generated
	 */
	private IParser getEntitlementMediatorServerURL_5051Parser() {
		if (entitlementMediatorServerURL_5051Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getEntitlementMediator_ServerURL() };
			MessageFormatParser parser = new MessageFormatParser(features);
			entitlementMediatorServerURL_5051Parser = parser;
		}
		return entitlementMediatorServerURL_5051Parser;
	}

	/**
	 * @generated
	 */
	private IParser classMediatorClassName_5052Parser;

	/**
	 * @generated
	 */
	private IParser getClassMediatorClassName_5052Parser() {
		if (classMediatorClassName_5052Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getClassMediator_ClassName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			classMediatorClassName_5052Parser = parser;
		}
		return classMediatorClassName_5052Parser;
	}

	/**
	 * @generated
	 */
	private IParser springMediatorBeanName_5053Parser;

	/**
	 * @generated
	 */
	private IParser getSpringMediatorBeanName_5053Parser() {
		if (springMediatorBeanName_5053Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getSpringMediator_BeanName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			springMediatorBeanName_5053Parser = parser;
		}
		return springMediatorBeanName_5053Parser;
	}

	/**
	 * @generated
	 */
	private IParser scriptMediatorScriptLanguage_5054Parser;

	/**
	 * @generated
	 */
	private IParser getScriptMediatorScriptLanguage_5054Parser() {
		if (scriptMediatorScriptLanguage_5054Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getScriptMediator_ScriptLanguage() };
			MessageFormatParser parser = new MessageFormatParser(features);
			scriptMediatorScriptLanguage_5054Parser = parser;
		}
		return scriptMediatorScriptLanguage_5054Parser;
	}

	/**
	 * @generated
	 */
	private IParser faultMediatorFaultStringType_5055Parser;

	/**
	 * @generated
	 */
	private IParser getFaultMediatorFaultStringType_5055Parser() {
		if (faultMediatorFaultStringType_5055Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getFaultMediator_FaultStringType() };
			MessageFormatParser parser = new MessageFormatParser(features);
			faultMediatorFaultStringType_5055Parser = parser;
		}
		return faultMediatorFaultStringType_5055Parser;
	}

	/**
	 * @generated
	 */
	private IParser xQueryMediatorScriptKeyType_5056Parser;

	/**
	 * @generated
	 */
	private IParser getXQueryMediatorScriptKeyType_5056Parser() {
		if (xQueryMediatorScriptKeyType_5056Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getXQueryMediator_ScriptKeyType() };
			MessageFormatParser parser = new MessageFormatParser(features);
			xQueryMediatorScriptKeyType_5056Parser = parser;
		}
		return xQueryMediatorScriptKeyType_5056Parser;
	}

	/**
	 * @generated
	 */
	private IParser commandMediatorClassName_5057Parser;

	/**
	 * @generated
	 */
	private IParser getCommandMediatorClassName_5057Parser() {
		if (commandMediatorClassName_5057Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getCommandMediator_ClassName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			commandMediatorClassName_5057Parser = parser;
		}
		return commandMediatorClassName_5057Parser;
	}

	/**
	 * @generated
	 */
	private IParser dBLookupMediatorConnectionURL_5058Parser;

	/**
	 * @generated
	 */
	private IParser getDBLookupMediatorConnectionURL_5058Parser() {
		if (dBLookupMediatorConnectionURL_5058Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getAbstractSqlExecutorMediator_ConnectionURL() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dBLookupMediatorConnectionURL_5058Parser = parser;
		}
		return dBLookupMediatorConnectionURL_5058Parser;
	}

	/**
	 * @generated
	 */
	private IParser dBReportMediatorConnectionURL_5059Parser;

	/**
	 * @generated
	 */
	private IParser getDBReportMediatorConnectionURL_5059Parser() {
		if (dBReportMediatorConnectionURL_5059Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getAbstractSqlExecutorMediator_ConnectionURL() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dBReportMediatorConnectionURL_5059Parser = parser;
		}
		return dBReportMediatorConnectionURL_5059Parser;
	}

	/**
	 * @generated
	 */
	private IParser headerMediatorValueLiteral_5060Parser;

	/**
	 * @generated
	 */
	private IParser getHeaderMediatorValueLiteral_5060Parser() {
		if (headerMediatorValueLiteral_5060Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getHeaderMediator_ValueLiteral() };
			MessageFormatParser parser = new MessageFormatParser(features);
			headerMediatorValueLiteral_5060Parser = parser;
		}
		return headerMediatorValueLiteral_5060Parser;
	}

	/**
	 * @generated
	 */
	private IParser cloneMediatorCloneID_5061Parser;

	/**
	 * @generated
	 */
	private IParser getCloneMediatorCloneID_5061Parser() {
		if (cloneMediatorCloneID_5061Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getCloneMediator_CloneID() };
			MessageFormatParser parser = new MessageFormatParser(features);
			cloneMediatorCloneID_5061Parser = parser;
		}
		return cloneMediatorCloneID_5061Parser;
	}

	/**
	 * @generated
	 */
	private IParser cacheMediatorCacheId_5062Parser;

	/**
	 * @generated
	 */
	private IParser getCacheMediatorCacheId_5062Parser() {
		if (cacheMediatorCacheId_5062Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getCacheMediator_CacheId() };
			MessageFormatParser parser = new MessageFormatParser(features);
			cacheMediatorCacheId_5062Parser = parser;
		}
		return cacheMediatorCacheId_5062Parser;
	}

	/**
	 * @generated
	 */
	private IParser iterateMediatorIterateID_5063Parser;

	/**
	 * @generated
	 */
	private IParser getIterateMediatorIterateID_5063Parser() {
		if (iterateMediatorIterateID_5063Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getIterateMediator_IterateID() };
			MessageFormatParser parser = new MessageFormatParser(features);
			iterateMediatorIterateID_5063Parser = parser;
		}
		return iterateMediatorIterateID_5063Parser;
	}

	/**
	 * @generated
	 */
	private IParser calloutMediatorSoapAction_5064Parser;

	/**
	 * @generated
	 */
	private IParser getCalloutMediatorSoapAction_5064Parser() {
		if (calloutMediatorSoapAction_5064Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getCalloutMediator_SoapAction() };
			MessageFormatParser parser = new MessageFormatParser(features);
			calloutMediatorSoapAction_5064Parser = parser;
		}
		return calloutMediatorSoapAction_5064Parser;
	}

	/**
	 * @generated
	 */
	private IParser oAuthMediatorRemoteServiceUrl_5065Parser;

	/**
	 * @generated
	 */
	private IParser getOAuthMediatorRemoteServiceUrl_5065Parser() {
		if (oAuthMediatorRemoteServiceUrl_5065Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getOAuthMediator_RemoteServiceUrl() };
			MessageFormatParser parser = new MessageFormatParser(features);
			oAuthMediatorRemoteServiceUrl_5065Parser = parser;
		}
		return oAuthMediatorRemoteServiceUrl_5065Parser;
	}

	/**
	 * @generated
	 */
	private IParser aggregateMediatorAggregateID_5066Parser;

	/**
	 * @generated
	 */
	private IParser getAggregateMediatorAggregateID_5066Parser() {
		if (aggregateMediatorAggregateID_5066Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getAggregateMediator_AggregateID() };
			MessageFormatParser parser = new MessageFormatParser(features);
			aggregateMediatorAggregateID_5066Parser = parser;
		}
		return aggregateMediatorAggregateID_5066Parser;
	}

	/**
	 * @generated
	 */
	private IParser propertyMediatorPropertyName_5043Parser;

	/**
	 * @generated
	 */
	private IParser getPropertyMediatorPropertyName_5043Parser() {
		if (propertyMediatorPropertyName_5043Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getPropertyMediator_PropertyName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			propertyMediatorPropertyName_5043Parser = parser;
		}
		return propertyMediatorPropertyName_5043Parser;
	}

	/**
	 * @generated
	 */
	private IParser throttleMediatorGroupId_5045Parser;

	/**
	 * @generated
	 */
	private IParser getThrottleMediatorGroupId_5045Parser() {
		if (throttleMediatorGroupId_5045Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getThrottleMediator_GroupId() };
			MessageFormatParser parser = new MessageFormatParser(features);
			throttleMediatorGroupId_5045Parser = parser;
		}
		return throttleMediatorGroupId_5045Parser;
	}

	/**
	 * @generated
	 */
	private IParser filterMediatorConditionType_5067Parser;

	/**
	 * @generated
	 */
	private IParser getFilterMediatorConditionType_5067Parser() {
		if (filterMediatorConditionType_5067Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getFilterMediator_ConditionType() };
			MessageFormatParser parser = new MessageFormatParser(features);
			filterMediatorConditionType_5067Parser = parser;
		}
		return filterMediatorConditionType_5067Parser;
	}

	/**
	 * @generated
	 */
	private IParser logMediatorLogCategory_5068Parser;

	/**
	 * @generated
	 */
	private IParser getLogMediatorLogCategory_5068Parser() {
		if (logMediatorLogCategory_5068Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getLogMediator_LogCategory() };
			MessageFormatParser parser = new MessageFormatParser(features);
			logMediatorLogCategory_5068Parser = parser;
		}
		return logMediatorLogCategory_5068Parser;
	}

	/**
	 * @generated
	 */
	private IParser enrichMediatorSourceType_5069Parser;

	/**
	 * @generated
	 */
	private IParser getEnrichMediatorSourceType_5069Parser() {
		if (enrichMediatorSourceType_5069Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getEnrichMediator_SourceType() };
			MessageFormatParser parser = new MessageFormatParser(features);
			enrichMediatorSourceType_5069Parser = parser;
		}
		return enrichMediatorSourceType_5069Parser;
	}

	/**
	 * @generated
	 */
	private IParser sequenceName_5070Parser;

	/**
	 * @generated
	 */
	private IParser getSequenceName_5070Parser() {
		if (sequenceName_5070Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getSequence_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			sequenceName_5070Parser = parser;
		}
		return sequenceName_5070Parser;
	}

	/**
	 * @generated
	 */
	private IParser eventMediatorTopicType_5071Parser;

	/**
	 * @generated
	 */
	private IParser getEventMediatorTopicType_5071Parser() {
		if (eventMediatorTopicType_5071Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getEventMediator_TopicType() };
			MessageFormatParser parser = new MessageFormatParser(features);
			eventMediatorTopicType_5071Parser = parser;
		}
		return eventMediatorTopicType_5071Parser;
	}

	/**
	 * @generated
	 */
	private IParser entitlementMediatorServerURL_5072Parser;

	/**
	 * @generated
	 */
	private IParser getEntitlementMediatorServerURL_5072Parser() {
		if (entitlementMediatorServerURL_5072Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getEntitlementMediator_ServerURL() };
			MessageFormatParser parser = new MessageFormatParser(features);
			entitlementMediatorServerURL_5072Parser = parser;
		}
		return entitlementMediatorServerURL_5072Parser;
	}

	/**
	 * @generated
	 */
	private IParser classMediatorClassName_5073Parser;

	/**
	 * @generated
	 */
	private IParser getClassMediatorClassName_5073Parser() {
		if (classMediatorClassName_5073Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getClassMediator_ClassName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			classMediatorClassName_5073Parser = parser;
		}
		return classMediatorClassName_5073Parser;
	}

	/**
	 * @generated
	 */
	private IParser springMediatorBeanName_5074Parser;

	/**
	 * @generated
	 */
	private IParser getSpringMediatorBeanName_5074Parser() {
		if (springMediatorBeanName_5074Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getSpringMediator_BeanName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			springMediatorBeanName_5074Parser = parser;
		}
		return springMediatorBeanName_5074Parser;
	}

	/**
	 * @generated
	 */
	private IParser scriptMediatorScriptLanguage_5075Parser;

	/**
	 * @generated
	 */
	private IParser getScriptMediatorScriptLanguage_5075Parser() {
		if (scriptMediatorScriptLanguage_5075Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getScriptMediator_ScriptLanguage() };
			MessageFormatParser parser = new MessageFormatParser(features);
			scriptMediatorScriptLanguage_5075Parser = parser;
		}
		return scriptMediatorScriptLanguage_5075Parser;
	}

	/**
	 * @generated
	 */
	private IParser faultMediatorFaultStringType_5076Parser;

	/**
	 * @generated
	 */
	private IParser getFaultMediatorFaultStringType_5076Parser() {
		if (faultMediatorFaultStringType_5076Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getFaultMediator_FaultStringType() };
			MessageFormatParser parser = new MessageFormatParser(features);
			faultMediatorFaultStringType_5076Parser = parser;
		}
		return faultMediatorFaultStringType_5076Parser;
	}

	/**
	 * @generated
	 */
	private IParser xQueryMediatorScriptKeyType_5077Parser;

	/**
	 * @generated
	 */
	private IParser getXQueryMediatorScriptKeyType_5077Parser() {
		if (xQueryMediatorScriptKeyType_5077Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getXQueryMediator_ScriptKeyType() };
			MessageFormatParser parser = new MessageFormatParser(features);
			xQueryMediatorScriptKeyType_5077Parser = parser;
		}
		return xQueryMediatorScriptKeyType_5077Parser;
	}

	/**
	 * @generated
	 */
	private IParser commandMediatorClassName_5078Parser;

	/**
	 * @generated
	 */
	private IParser getCommandMediatorClassName_5078Parser() {
		if (commandMediatorClassName_5078Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getCommandMediator_ClassName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			commandMediatorClassName_5078Parser = parser;
		}
		return commandMediatorClassName_5078Parser;
	}

	/**
	 * @generated
	 */
	private IParser dBLookupMediatorConnectionURL_5079Parser;

	/**
	 * @generated
	 */
	private IParser getDBLookupMediatorConnectionURL_5079Parser() {
		if (dBLookupMediatorConnectionURL_5079Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getAbstractSqlExecutorMediator_ConnectionURL() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dBLookupMediatorConnectionURL_5079Parser = parser;
		}
		return dBLookupMediatorConnectionURL_5079Parser;
	}

	/**
	 * @generated
	 */
	private IParser dBReportMediatorConnectionURL_5080Parser;

	/**
	 * @generated
	 */
	private IParser getDBReportMediatorConnectionURL_5080Parser() {
		if (dBReportMediatorConnectionURL_5080Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getAbstractSqlExecutorMediator_ConnectionURL() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dBReportMediatorConnectionURL_5080Parser = parser;
		}
		return dBReportMediatorConnectionURL_5080Parser;
	}

	/**
	 * @generated
	 */
	private IParser headerMediatorValueLiteral_5081Parser;

	/**
	 * @generated
	 */
	private IParser getHeaderMediatorValueLiteral_5081Parser() {
		if (headerMediatorValueLiteral_5081Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getHeaderMediator_ValueLiteral() };
			MessageFormatParser parser = new MessageFormatParser(features);
			headerMediatorValueLiteral_5081Parser = parser;
		}
		return headerMediatorValueLiteral_5081Parser;
	}

	/**
	 * @generated
	 */
	private IParser cloneMediatorCloneID_5082Parser;

	/**
	 * @generated
	 */
	private IParser getCloneMediatorCloneID_5082Parser() {
		if (cloneMediatorCloneID_5082Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getCloneMediator_CloneID() };
			MessageFormatParser parser = new MessageFormatParser(features);
			cloneMediatorCloneID_5082Parser = parser;
		}
		return cloneMediatorCloneID_5082Parser;
	}

	/**
	 * @generated
	 */
	private IParser cacheMediatorCacheId_5083Parser;

	/**
	 * @generated
	 */
	private IParser getCacheMediatorCacheId_5083Parser() {
		if (cacheMediatorCacheId_5083Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getCacheMediator_CacheId() };
			MessageFormatParser parser = new MessageFormatParser(features);
			cacheMediatorCacheId_5083Parser = parser;
		}
		return cacheMediatorCacheId_5083Parser;
	}

	/**
	 * @generated
	 */
	private IParser iterateMediatorIterateID_5084Parser;

	/**
	 * @generated
	 */
	private IParser getIterateMediatorIterateID_5084Parser() {
		if (iterateMediatorIterateID_5084Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getIterateMediator_IterateID() };
			MessageFormatParser parser = new MessageFormatParser(features);
			iterateMediatorIterateID_5084Parser = parser;
		}
		return iterateMediatorIterateID_5084Parser;
	}

	/**
	 * @generated
	 */
	private IParser calloutMediatorSoapAction_5085Parser;

	/**
	 * @generated
	 */
	private IParser getCalloutMediatorSoapAction_5085Parser() {
		if (calloutMediatorSoapAction_5085Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getCalloutMediator_SoapAction() };
			MessageFormatParser parser = new MessageFormatParser(features);
			calloutMediatorSoapAction_5085Parser = parser;
		}
		return calloutMediatorSoapAction_5085Parser;
	}

	/**
	 * @generated
	 */
	private IParser oAuthMediatorRemoteServiceUrl_5086Parser;

	/**
	 * @generated
	 */
	private IParser getOAuthMediatorRemoteServiceUrl_5086Parser() {
		if (oAuthMediatorRemoteServiceUrl_5086Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getOAuthMediator_RemoteServiceUrl() };
			MessageFormatParser parser = new MessageFormatParser(features);
			oAuthMediatorRemoteServiceUrl_5086Parser = parser;
		}
		return oAuthMediatorRemoteServiceUrl_5086Parser;
	}

	/**
	 * @generated
	 */
	private IParser aggregateMediatorAggregateID_5098Parser;

	/**
	 * @generated
	 */
	private IParser getAggregateMediatorAggregateID_5098Parser() {
		if (aggregateMediatorAggregateID_5098Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getAggregateMediator_AggregateID() };
			MessageFormatParser parser = new MessageFormatParser(features);
			aggregateMediatorAggregateID_5098Parser = parser;
		}
		return aggregateMediatorAggregateID_5098Parser;
	}

	/**
	 * @generated
	 */
	private IParser logMediatorLogCategory_5087Parser;

	/**
	 * @generated
	 */
	private IParser getLogMediatorLogCategory_5087Parser() {
		if (logMediatorLogCategory_5087Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getLogMediator_LogCategory() };
			MessageFormatParser parser = new MessageFormatParser(features);
			logMediatorLogCategory_5087Parser = parser;
		}
		return logMediatorLogCategory_5087Parser;
	}

	/**
	 * @generated
	 */
	private IParser filterMediatorConditionType_5088Parser;

	/**
	 * @generated
	 */
	private IParser getFilterMediatorConditionType_5088Parser() {
		if (filterMediatorConditionType_5088Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getFilterMediator_ConditionType() };
			MessageFormatParser parser = new MessageFormatParser(features);
			filterMediatorConditionType_5088Parser = parser;
		}
		return filterMediatorConditionType_5088Parser;
	}

	/**
	 * @generated
	 */
	private IParser propertyMediatorPropertyName_5089Parser;

	/**
	 * @generated
	 */
	private IParser getPropertyMediatorPropertyName_5089Parser() {
		if (propertyMediatorPropertyName_5089Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getPropertyMediator_PropertyName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			propertyMediatorPropertyName_5089Parser = parser;
		}
		return propertyMediatorPropertyName_5089Parser;
	}

	/**
	 * @generated
	 */
	private IParser enrichMediatorSourceType_5090Parser;

	/**
	 * @generated
	 */
	private IParser getEnrichMediatorSourceType_5090Parser() {
		if (enrichMediatorSourceType_5090Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getEnrichMediator_SourceType() };
			MessageFormatParser parser = new MessageFormatParser(features);
			enrichMediatorSourceType_5090Parser = parser;
		}
		return enrichMediatorSourceType_5090Parser;
	}

	/**
	 * @generated
	 */
	private IParser faultMediatorFaultStringType_5091Parser;

	/**
	 * @generated
	 */
	private IParser getFaultMediatorFaultStringType_5091Parser() {
		if (faultMediatorFaultStringType_5091Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getFaultMediator_FaultStringType() };
			MessageFormatParser parser = new MessageFormatParser(features);
			faultMediatorFaultStringType_5091Parser = parser;
		}
		return faultMediatorFaultStringType_5091Parser;
	}

	/**
	 * @generated
	 */
	private IParser dBLookupMediatorConnectionURL_5092Parser;

	/**
	 * @generated
	 */
	private IParser getDBLookupMediatorConnectionURL_5092Parser() {
		if (dBLookupMediatorConnectionURL_5092Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getAbstractSqlExecutorMediator_ConnectionURL() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dBLookupMediatorConnectionURL_5092Parser = parser;
		}
		return dBLookupMediatorConnectionURL_5092Parser;
	}

	/**
	 * @generated
	 */
	private IParser dBReportMediatorConnectionURL_5093Parser;

	/**
	 * @generated
	 */
	private IParser getDBReportMediatorConnectionURL_5093Parser() {
		if (dBReportMediatorConnectionURL_5093Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getAbstractSqlExecutorMediator_ConnectionURL() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dBReportMediatorConnectionURL_5093Parser = parser;
		}
		return dBReportMediatorConnectionURL_5093Parser;
	}

	/**
	 * @generated
	 */
	private IParser headerMediatorValueLiteral_5094Parser;

	/**
	 * @generated
	 */
	private IParser getHeaderMediatorValueLiteral_5094Parser() {
		if (headerMediatorValueLiteral_5094Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getHeaderMediator_ValueLiteral() };
			MessageFormatParser parser = new MessageFormatParser(features);
			headerMediatorValueLiteral_5094Parser = parser;
		}
		return headerMediatorValueLiteral_5094Parser;
	}

	/**
	 * @generated
	 */
	private IParser cloneMediatorCloneID_5095Parser;

	/**
	 * @generated
	 */
	private IParser getCloneMediatorCloneID_5095Parser() {
		if (cloneMediatorCloneID_5095Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getCloneMediator_CloneID() };
			MessageFormatParser parser = new MessageFormatParser(features);
			cloneMediatorCloneID_5095Parser = parser;
		}
		return cloneMediatorCloneID_5095Parser;
	}

	/**
	 * @generated
	 */
	private IParser iterateMediatorIterateID_5096Parser;

	/**
	 * @generated
	 */
	private IParser getIterateMediatorIterateID_5096Parser() {
		if (iterateMediatorIterateID_5096Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getIterateMediator_IterateID() };
			MessageFormatParser parser = new MessageFormatParser(features);
			iterateMediatorIterateID_5096Parser = parser;
		}
		return iterateMediatorIterateID_5096Parser;
	}

	/**
	 * @generated
	 */
	private IParser calloutMediatorSoapAction_5097Parser;

	/**
	 * @generated
	 */
	private IParser getCalloutMediatorSoapAction_5097Parser() {
		if (calloutMediatorSoapAction_5097Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getCalloutMediator_SoapAction() };
			MessageFormatParser parser = new MessageFormatParser(features);
			calloutMediatorSoapAction_5097Parser = parser;
		}
		return calloutMediatorSoapAction_5097Parser;
	}

	/**
	 * @generated
	 */
	private IParser defaultEndPointEndPointName_5099Parser;

	/**
	 * @generated
	 */
	private IParser getDefaultEndPointEndPointName_5099Parser() {
		if (defaultEndPointEndPointName_5099Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getEndPoint_EndPointName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			defaultEndPointEndPointName_5099Parser = parser;
		}
		return defaultEndPointEndPointName_5099Parser;
	}

	/**
	 * @generated
	 */
	private IParser addressEndPointEndPointName_5100Parser;

	/**
	 * @generated
	 */
	private IParser getAddressEndPointEndPointName_5100Parser() {
		if (addressEndPointEndPointName_5100Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getEndPoint_EndPointName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			addressEndPointEndPointName_5100Parser = parser;
		}
		return addressEndPointEndPointName_5100Parser;
	}

	/**
	 * @generated
	 */
	private IParser failoverEndPointEndPointName_5101Parser;

	/**
	 * @generated
	 */
	private IParser getFailoverEndPointEndPointName_5101Parser() {
		if (failoverEndPointEndPointName_5101Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getEndPoint_EndPointName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			failoverEndPointEndPointName_5101Parser = parser;
		}
		return failoverEndPointEndPointName_5101Parser;
	}

	/**
	 * @generated
	 */
	private IParser wSDLEndPointEndPointName_5102Parser;

	/**
	 * @generated
	 */
	private IParser getWSDLEndPointEndPointName_5102Parser() {
		if (wSDLEndPointEndPointName_5102Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getEndPoint_EndPointName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			wSDLEndPointEndPointName_5102Parser = parser;
		}
		return wSDLEndPointEndPointName_5102Parser;
	}

	/**
	 * @generated
	 */
	private IParser loadBalanceEndPointEndPointName_5103Parser;

	/**
	 * @generated
	 */
	private IParser getLoadBalanceEndPointEndPointName_5103Parser() {
		if (loadBalanceEndPointEndPointName_5103Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getEndPoint_EndPointName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			loadBalanceEndPointEndPointName_5103Parser = parser;
		}
		return loadBalanceEndPointEndPointName_5103Parser;
	}

	/**
	 * @generated
	 */
	private IParser logMediatorLogCategory_5030Parser;

	/**
	 * @generated
	 */
	private IParser getLogMediatorLogCategory_5030Parser() {
		if (logMediatorLogCategory_5030Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getLogMediator_LogCategory() };
			MessageFormatParser parser = new MessageFormatParser(features);
			logMediatorLogCategory_5030Parser = parser;
		}
		return logMediatorLogCategory_5030Parser;
	}

	/**
	 * @generated
	 */
	private IParser filterMediatorConditionType_5031Parser;

	/**
	 * @generated
	 */
	private IParser getFilterMediatorConditionType_5031Parser() {
		if (filterMediatorConditionType_5031Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getFilterMediator_ConditionType() };
			MessageFormatParser parser = new MessageFormatParser(features);
			filterMediatorConditionType_5031Parser = parser;
		}
		return filterMediatorConditionType_5031Parser;
	}

	/**
	 * @generated
	 */
	private IParser propertyMediatorPropertyName_5032Parser;

	/**
	 * @generated
	 */
	private IParser getPropertyMediatorPropertyName_5032Parser() {
		if (propertyMediatorPropertyName_5032Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getPropertyMediator_PropertyName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			propertyMediatorPropertyName_5032Parser = parser;
		}
		return propertyMediatorPropertyName_5032Parser;
	}

	/**
	 * @generated
	 */
	private IParser enrichMediatorSourceType_5033Parser;

	/**
	 * @generated
	 */
	private IParser getEnrichMediatorSourceType_5033Parser() {
		if (enrichMediatorSourceType_5033Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getEnrichMediator_SourceType() };
			MessageFormatParser parser = new MessageFormatParser(features);
			enrichMediatorSourceType_5033Parser = parser;
		}
		return enrichMediatorSourceType_5033Parser;
	}

	/**
	 * @generated
	 */
	private IParser faultMediatorFaultStringType_5034Parser;

	/**
	 * @generated
	 */
	private IParser getFaultMediatorFaultStringType_5034Parser() {
		if (faultMediatorFaultStringType_5034Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getFaultMediator_FaultStringType() };
			MessageFormatParser parser = new MessageFormatParser(features);
			faultMediatorFaultStringType_5034Parser = parser;
		}
		return faultMediatorFaultStringType_5034Parser;
	}

	/**
	 * @generated
	 */
	private IParser dBLookupMediatorConnectionURL_5035Parser;

	/**
	 * @generated
	 */
	private IParser getDBLookupMediatorConnectionURL_5035Parser() {
		if (dBLookupMediatorConnectionURL_5035Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getAbstractSqlExecutorMediator_ConnectionURL() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dBLookupMediatorConnectionURL_5035Parser = parser;
		}
		return dBLookupMediatorConnectionURL_5035Parser;
	}

	/**
	 * @generated
	 */
	private IParser dBReportMediatorConnectionURL_5036Parser;

	/**
	 * @generated
	 */
	private IParser getDBReportMediatorConnectionURL_5036Parser() {
		if (dBReportMediatorConnectionURL_5036Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getAbstractSqlExecutorMediator_ConnectionURL() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dBReportMediatorConnectionURL_5036Parser = parser;
		}
		return dBReportMediatorConnectionURL_5036Parser;
	}

	/**
	 * @generated
	 */
	private IParser headerMediatorValueLiteral_5037Parser;

	/**
	 * @generated
	 */
	private IParser getHeaderMediatorValueLiteral_5037Parser() {
		if (headerMediatorValueLiteral_5037Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getHeaderMediator_ValueLiteral() };
			MessageFormatParser parser = new MessageFormatParser(features);
			headerMediatorValueLiteral_5037Parser = parser;
		}
		return headerMediatorValueLiteral_5037Parser;
	}

	/**
	 * @generated
	 */
	private IParser cloneMediatorCloneID_5038Parser;

	/**
	 * @generated
	 */
	private IParser getCloneMediatorCloneID_5038Parser() {
		if (cloneMediatorCloneID_5038Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getCloneMediator_CloneID() };
			MessageFormatParser parser = new MessageFormatParser(features);
			cloneMediatorCloneID_5038Parser = parser;
		}
		return cloneMediatorCloneID_5038Parser;
	}

	/**
	 * @generated
	 */
	private IParser iterateMediatorIterateID_5039Parser;

	/**
	 * @generated
	 */
	private IParser getIterateMediatorIterateID_5039Parser() {
		if (iterateMediatorIterateID_5039Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getIterateMediator_IterateID() };
			MessageFormatParser parser = new MessageFormatParser(features);
			iterateMediatorIterateID_5039Parser = parser;
		}
		return iterateMediatorIterateID_5039Parser;
	}

	/**
	 * @generated
	 */
	private IParser calloutMediatorSoapAction_5040Parser;

	/**
	 * @generated
	 */
	private IParser getCalloutMediatorSoapAction_5040Parser() {
		if (calloutMediatorSoapAction_5040Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getCalloutMediator_SoapAction() };
			MessageFormatParser parser = new MessageFormatParser(features);
			calloutMediatorSoapAction_5040Parser = parser;
		}
		return calloutMediatorSoapAction_5040Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case ProxyServiceNameEditPart.VISUAL_ID:
			return getProxyServiceName_5003Parser();
		case PropertyMediatorPropertyName3EditPart.VISUAL_ID:
			return getPropertyMediatorPropertyName_5042Parser();
		case ThrottleMediatorGroupIdEditPart.VISUAL_ID:
			return getThrottleMediatorGroupId_5044Parser();
		case FilterMediatorConditionTypeEditPart.VISUAL_ID:
			return getFilterMediatorConditionType_5046Parser();
		case LogMediatorLogCategoryEditPart.VISUAL_ID:
			return getLogMediatorLogCategory_5047Parser();
		case EnrichMediatorSourceTypeEditPart.VISUAL_ID:
			return getEnrichMediatorSourceType_5104Parser();
		case SequenceNameEditPart.VISUAL_ID:
			return getSequenceName_5049Parser();
		case EventMediatorTopicTypeEditPart.VISUAL_ID:
			return getEventMediatorTopicType_5050Parser();
		case EntitlementMediatorServerURLEditPart.VISUAL_ID:
			return getEntitlementMediatorServerURL_5051Parser();
		case ClassMediatorClassNameEditPart.VISUAL_ID:
			return getClassMediatorClassName_5052Parser();
		case SpringMediatorBeanNameEditPart.VISUAL_ID:
			return getSpringMediatorBeanName_5053Parser();
		case ScriptMediatorScriptLanguageEditPart.VISUAL_ID:
			return getScriptMediatorScriptLanguage_5054Parser();
		case FaultMediatorFaultStringTypeEditPart.VISUAL_ID:
			return getFaultMediatorFaultStringType_5055Parser();
		case XQueryMediatorScriptKeyTypeEditPart.VISUAL_ID:
			return getXQueryMediatorScriptKeyType_5056Parser();
		case CommandMediatorClassNameEditPart.VISUAL_ID:
			return getCommandMediatorClassName_5057Parser();
		case DBLookupMediatorConnectionURLEditPart.VISUAL_ID:
			return getDBLookupMediatorConnectionURL_5058Parser();
		case DBReportMediatorConnectionURLEditPart.VISUAL_ID:
			return getDBReportMediatorConnectionURL_5059Parser();
		case HeaderMediatorValueLiteralEditPart.VISUAL_ID:
			return getHeaderMediatorValueLiteral_5060Parser();
		case CloneMediatorCloneIDEditPart.VISUAL_ID:
			return getCloneMediatorCloneID_5061Parser();
		case CacheMediatorCacheIdEditPart.VISUAL_ID:
			return getCacheMediatorCacheId_5062Parser();
		case IterateMediatorIterateIDEditPart.VISUAL_ID:
			return getIterateMediatorIterateID_5063Parser();
		case CalloutMediatorSoapActionEditPart.VISUAL_ID:
			return getCalloutMediatorSoapAction_5064Parser();
		case OAuthMediatorRemoteServiceUrlEditPart.VISUAL_ID:
			return getOAuthMediatorRemoteServiceUrl_5065Parser();
		case AggregateMediatorAggregateIDEditPart.VISUAL_ID:
			return getAggregateMediatorAggregateID_5066Parser();
		case LogMediatorLogCategory2EditPart.VISUAL_ID:
			return getLogMediatorLogCategory_5030Parser();
		case FilterMediatorConditionType2EditPart.VISUAL_ID:
			return getFilterMediatorConditionType_5031Parser();
		case PropertyMediatorPropertyName2EditPart.VISUAL_ID:
			return getPropertyMediatorPropertyName_5032Parser();
		case EnrichMediatorSourceType2EditPart.VISUAL_ID:
			return getEnrichMediatorSourceType_5033Parser();
		case FaultMediatorFaultStringType2EditPart.VISUAL_ID:
			return getFaultMediatorFaultStringType_5034Parser();
		case DBLookupMediatorConnectionURL2EditPart.VISUAL_ID:
			return getDBLookupMediatorConnectionURL_5035Parser();
		case DBReportMediatorConnectionURL2EditPart.VISUAL_ID:
			return getDBReportMediatorConnectionURL_5036Parser();
		case HeaderMediatorValueLiteral2EditPart.VISUAL_ID:
			return getHeaderMediatorValueLiteral_5037Parser();
		case CloneMediatorCloneID2EditPart.VISUAL_ID:
			return getCloneMediatorCloneID_5038Parser();
		case IterateMediatorIterateID2EditPart.VISUAL_ID:
			return getIterateMediatorIterateID_5039Parser();
		case CalloutMediatorSoapAction2EditPart.VISUAL_ID:
			return getCalloutMediatorSoapAction_5040Parser();
		case PropertyMediatorPropertyName4EditPart.VISUAL_ID:
			return getPropertyMediatorPropertyName_5043Parser();
		case ThrottleMediatorGroupId2EditPart.VISUAL_ID:
			return getThrottleMediatorGroupId_5045Parser();
		case FilterMediatorConditionType3EditPart.VISUAL_ID:
			return getFilterMediatorConditionType_5067Parser();
		case LogMediatorLogCategory3EditPart.VISUAL_ID:
			return getLogMediatorLogCategory_5068Parser();
		case EnrichMediatorSourceType3EditPart.VISUAL_ID:
			return getEnrichMediatorSourceType_5069Parser();
		case SequenceName2EditPart.VISUAL_ID:
			return getSequenceName_5070Parser();
		case EventMediatorTopicType2EditPart.VISUAL_ID:
			return getEventMediatorTopicType_5071Parser();
		case EntitlementMediatorServerURL2EditPart.VISUAL_ID:
			return getEntitlementMediatorServerURL_5072Parser();
		case ClassMediatorClassName2EditPart.VISUAL_ID:
			return getClassMediatorClassName_5073Parser();
		case SpringMediatorBeanName2EditPart.VISUAL_ID:
			return getSpringMediatorBeanName_5074Parser();
		case ScriptMediatorScriptLanguage2EditPart.VISUAL_ID:
			return getScriptMediatorScriptLanguage_5075Parser();
		case FaultMediatorFaultStringType3EditPart.VISUAL_ID:
			return getFaultMediatorFaultStringType_5076Parser();
		case XQueryMediatorScriptKeyType2EditPart.VISUAL_ID:
			return getXQueryMediatorScriptKeyType_5077Parser();
		case CommandMediatorClassName2EditPart.VISUAL_ID:
			return getCommandMediatorClassName_5078Parser();
		case DBLookupMediatorConnectionURL3EditPart.VISUAL_ID:
			return getDBLookupMediatorConnectionURL_5079Parser();
		case DBReportMediatorConnectionURL3EditPart.VISUAL_ID:
			return getDBReportMediatorConnectionURL_5080Parser();
		case HeaderMediatorValueLiteral3EditPart.VISUAL_ID:
			return getHeaderMediatorValueLiteral_5081Parser();
		case CloneMediatorCloneID3EditPart.VISUAL_ID:
			return getCloneMediatorCloneID_5082Parser();
		case CacheMediatorCacheId2EditPart.VISUAL_ID:
			return getCacheMediatorCacheId_5083Parser();
		case IterateMediatorIterateID3EditPart.VISUAL_ID:
			return getIterateMediatorIterateID_5084Parser();
		case CalloutMediatorSoapAction3EditPart.VISUAL_ID:
			return getCalloutMediatorSoapAction_5085Parser();
		case OAuthMediatorRemoteServiceUrl2EditPart.VISUAL_ID:
			return getOAuthMediatorRemoteServiceUrl_5086Parser();
		case AggregateMediatorAggregateID2EditPart.VISUAL_ID:
			return getAggregateMediatorAggregateID_5098Parser();
		case LogMediatorLogCategory4EditPart.VISUAL_ID:
			return getLogMediatorLogCategory_5087Parser();
		case FilterMediatorConditionType4EditPart.VISUAL_ID:
			return getFilterMediatorConditionType_5088Parser();
		case PropertyMediatorPropertyName5EditPart.VISUAL_ID:
			return getPropertyMediatorPropertyName_5089Parser();
		case EnrichMediatorSourceType4EditPart.VISUAL_ID:
			return getEnrichMediatorSourceType_5090Parser();
		case FaultMediatorFaultStringType4EditPart.VISUAL_ID:
			return getFaultMediatorFaultStringType_5091Parser();
		case DBLookupMediatorConnectionURL4EditPart.VISUAL_ID:
			return getDBLookupMediatorConnectionURL_5092Parser();
		case DBReportMediatorConnectionURL4EditPart.VISUAL_ID:
			return getDBReportMediatorConnectionURL_5093Parser();
		case HeaderMediatorValueLiteral4EditPart.VISUAL_ID:
			return getHeaderMediatorValueLiteral_5094Parser();
		case CloneMediatorCloneID4EditPart.VISUAL_ID:
			return getCloneMediatorCloneID_5095Parser();
		case IterateMediatorIterateID4EditPart.VISUAL_ID:
			return getIterateMediatorIterateID_5096Parser();
		case CalloutMediatorSoapAction4EditPart.VISUAL_ID:
			return getCalloutMediatorSoapAction_5097Parser();
		case DefaultEndPointEndPointName2EditPart.VISUAL_ID:
			return getDefaultEndPointEndPointName_5099Parser();
		case AddressEndPointEndPointName2EditPart.VISUAL_ID:
			return getAddressEndPointEndPointName_5100Parser();
		case FailoverEndPointEndPointName2EditPart.VISUAL_ID:
			return getFailoverEndPointEndPointName_5101Parser();
		case WSDLEndPointEndPointName2EditPart.VISUAL_ID:
			return getWSDLEndPointEndPointName_5102Parser();
		case LoadBalanceEndPointEndPointName2EditPart.VISUAL_ID:
			return getLoadBalanceEndPointEndPointName_5103Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(EsbVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(EsbVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (EsbElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
