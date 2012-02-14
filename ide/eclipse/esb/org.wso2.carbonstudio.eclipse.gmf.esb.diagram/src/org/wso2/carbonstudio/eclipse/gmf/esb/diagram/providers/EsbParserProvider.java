package org.wso2.carbonstudio.eclipse.gmf.esb.diagram.providers;

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
import org.wso2.carbonstudio.eclipse.gmf.esb.EsbPackage;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.AddressEndPointEndPointNameEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.AggregateMediatorAggregateIDEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.CacheMediatorCacheIdEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.CalloutMediatorSoapAction2EditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.CalloutMediatorSoapActionEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.ClassMediatorClassNameEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.CloneMediatorCloneID2EditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.CloneMediatorCloneIDEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.CommandMediatorClassNameEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.DBLookupMediatorConnectionURL2EditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.DBLookupMediatorConnectionURLEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.DBReportMediatorConnectionURL2EditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.DBReportMediatorConnectionURLEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.DefaultEndPointEndPointNameEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.EnrichMediatorSourceType2EditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.EnrichMediatorSourceTypeEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.EntitlementMediatorServerURLEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.EventMediatorTopicTypeEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.FailoverEndPointEndPointNameEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.FaultMediatorFaultStringType2EditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.FaultMediatorFaultStringTypeEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.FilterMediatorConditionType2EditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.FilterMediatorConditionTypeEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.HeaderMediatorValueLiteral2EditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.HeaderMediatorValueLiteralEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.IterateMediatorIterateID2EditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.IterateMediatorIterateIDEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.LoadBalanceEndPointEndPointNameEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.LogMediatorLogCategory2EditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.LogMediatorLogCategoryEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.OAuthMediatorRemoteServiceUrlEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.PropertyMediatorPropertyName2EditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.PropertyMediatorPropertyNameEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.ProxyServiceNameEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.ScriptMediatorScriptLanguageEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.SequenceNameEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.SpringMediatorBeanNameEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.ThrottleMediatorGroupIdEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.WSDLEndPointEndPointNameEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.XQueryMediatorScriptKeyTypeEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.parsers.MessageFormatParser;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.part.EsbVisualIDRegistry;

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
	private IParser defaultEndPointEndPointName_5004Parser;

	/**
	 * @generated
	 */
	private IParser getDefaultEndPointEndPointName_5004Parser() {
		if (defaultEndPointEndPointName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getEndPoint_EndPointName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			defaultEndPointEndPointName_5004Parser = parser;
		}
		return defaultEndPointEndPointName_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser addressEndPointEndPointName_5005Parser;

	/**
	 * @generated
	 */
	private IParser getAddressEndPointEndPointName_5005Parser() {
		if (addressEndPointEndPointName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getEndPoint_EndPointName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			addressEndPointEndPointName_5005Parser = parser;
		}
		return addressEndPointEndPointName_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser filterMediatorConditionType_5008Parser;

	/**
	 * @generated
	 */
	private IParser getFilterMediatorConditionType_5008Parser() {
		if (filterMediatorConditionType_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getFilterMediator_ConditionType() };
			MessageFormatParser parser = new MessageFormatParser(features);
			filterMediatorConditionType_5008Parser = parser;
		}
		return filterMediatorConditionType_5008Parser;
	}

	/**
	 * @generated
	 */
	private IParser logMediatorLogCategory_5006Parser;

	/**
	 * @generated
	 */
	private IParser getLogMediatorLogCategory_5006Parser() {
		if (logMediatorLogCategory_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getLogMediator_LogCategory() };
			MessageFormatParser parser = new MessageFormatParser(features);
			logMediatorLogCategory_5006Parser = parser;
		}
		return logMediatorLogCategory_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser propertyMediatorPropertyName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getPropertyMediatorPropertyName_5002Parser() {
		if (propertyMediatorPropertyName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getPropertyMediator_PropertyName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			propertyMediatorPropertyName_5002Parser = parser;
		}
		return propertyMediatorPropertyName_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser enrichMediatorSourceType_5007Parser;

	/**
	 * @generated
	 */
	private IParser getEnrichMediatorSourceType_5007Parser() {
		if (enrichMediatorSourceType_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getEnrichMediator_SourceType() };
			MessageFormatParser parser = new MessageFormatParser(features);
			enrichMediatorSourceType_5007Parser = parser;
		}
		return enrichMediatorSourceType_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser sequenceName_5041Parser;

	/**
	 * @generated
	 */
	private IParser getSequenceName_5041Parser() {
		if (sequenceName_5041Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getSequence_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			sequenceName_5041Parser = parser;
		}
		return sequenceName_5041Parser;
	}

	/**
	 * @generated
	 */
	private IParser eventMediatorTopicType_5009Parser;

	/**
	 * @generated
	 */
	private IParser getEventMediatorTopicType_5009Parser() {
		if (eventMediatorTopicType_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getEventMediator_TopicType() };
			MessageFormatParser parser = new MessageFormatParser(features);
			eventMediatorTopicType_5009Parser = parser;
		}
		return eventMediatorTopicType_5009Parser;
	}

	/**
	 * @generated
	 */
	private IParser entitlementMediatorServerURL_5010Parser;

	/**
	 * @generated
	 */
	private IParser getEntitlementMediatorServerURL_5010Parser() {
		if (entitlementMediatorServerURL_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getEntitlementMediator_ServerURL() };
			MessageFormatParser parser = new MessageFormatParser(features);
			entitlementMediatorServerURL_5010Parser = parser;
		}
		return entitlementMediatorServerURL_5010Parser;
	}

	/**
	 * @generated
	 */
	private IParser classMediatorClassName_5011Parser;

	/**
	 * @generated
	 */
	private IParser getClassMediatorClassName_5011Parser() {
		if (classMediatorClassName_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getClassMediator_ClassName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			classMediatorClassName_5011Parser = parser;
		}
		return classMediatorClassName_5011Parser;
	}

	/**
	 * @generated
	 */
	private IParser springMediatorBeanName_5012Parser;

	/**
	 * @generated
	 */
	private IParser getSpringMediatorBeanName_5012Parser() {
		if (springMediatorBeanName_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getSpringMediator_BeanName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			springMediatorBeanName_5012Parser = parser;
		}
		return springMediatorBeanName_5012Parser;
	}

	/**
	 * @generated
	 */
	private IParser scriptMediatorScriptLanguage_5013Parser;

	/**
	 * @generated
	 */
	private IParser getScriptMediatorScriptLanguage_5013Parser() {
		if (scriptMediatorScriptLanguage_5013Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getScriptMediator_ScriptLanguage() };
			MessageFormatParser parser = new MessageFormatParser(features);
			scriptMediatorScriptLanguage_5013Parser = parser;
		}
		return scriptMediatorScriptLanguage_5013Parser;
	}

	/**
	 * @generated
	 */
	private IParser faultMediatorFaultStringType_5014Parser;

	/**
	 * @generated
	 */
	private IParser getFaultMediatorFaultStringType_5014Parser() {
		if (faultMediatorFaultStringType_5014Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getFaultMediator_FaultStringType() };
			MessageFormatParser parser = new MessageFormatParser(features);
			faultMediatorFaultStringType_5014Parser = parser;
		}
		return faultMediatorFaultStringType_5014Parser;
	}

	/**
	 * @generated
	 */
	private IParser xQueryMediatorScriptKeyType_5015Parser;

	/**
	 * @generated
	 */
	private IParser getXQueryMediatorScriptKeyType_5015Parser() {
		if (xQueryMediatorScriptKeyType_5015Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getXQueryMediator_ScriptKeyType() };
			MessageFormatParser parser = new MessageFormatParser(features);
			xQueryMediatorScriptKeyType_5015Parser = parser;
		}
		return xQueryMediatorScriptKeyType_5015Parser;
	}

	/**
	 * @generated
	 */
	private IParser commandMediatorClassName_5016Parser;

	/**
	 * @generated
	 */
	private IParser getCommandMediatorClassName_5016Parser() {
		if (commandMediatorClassName_5016Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getCommandMediator_ClassName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			commandMediatorClassName_5016Parser = parser;
		}
		return commandMediatorClassName_5016Parser;
	}

	/**
	 * @generated
	 */
	private IParser dBLookupMediatorConnectionURL_5017Parser;

	/**
	 * @generated
	 */
	private IParser getDBLookupMediatorConnectionURL_5017Parser() {
		if (dBLookupMediatorConnectionURL_5017Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getAbstractSqlExecutorMediator_ConnectionURL() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dBLookupMediatorConnectionURL_5017Parser = parser;
		}
		return dBLookupMediatorConnectionURL_5017Parser;
	}

	/**
	 * @generated
	 */
	private IParser dBReportMediatorConnectionURL_5018Parser;

	/**
	 * @generated
	 */
	private IParser getDBReportMediatorConnectionURL_5018Parser() {
		if (dBReportMediatorConnectionURL_5018Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getAbstractSqlExecutorMediator_ConnectionURL() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dBReportMediatorConnectionURL_5018Parser = parser;
		}
		return dBReportMediatorConnectionURL_5018Parser;
	}

	/**
	 * @generated
	 */
	private IParser failoverEndPointEndPointName_5019Parser;

	/**
	 * @generated
	 */
	private IParser getFailoverEndPointEndPointName_5019Parser() {
		if (failoverEndPointEndPointName_5019Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getEndPoint_EndPointName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			failoverEndPointEndPointName_5019Parser = parser;
		}
		return failoverEndPointEndPointName_5019Parser;
	}

	/**
	 * @generated
	 */
	private IParser wSDLEndPointEndPointName_5020Parser;

	/**
	 * @generated
	 */
	private IParser getWSDLEndPointEndPointName_5020Parser() {
		if (wSDLEndPointEndPointName_5020Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getEndPoint_EndPointName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			wSDLEndPointEndPointName_5020Parser = parser;
		}
		return wSDLEndPointEndPointName_5020Parser;
	}

	/**
	 * @generated
	 */
	private IParser loadBalanceEndPointEndPointName_5021Parser;

	/**
	 * @generated
	 */
	private IParser getLoadBalanceEndPointEndPointName_5021Parser() {
		if (loadBalanceEndPointEndPointName_5021Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getEndPoint_EndPointName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			loadBalanceEndPointEndPointName_5021Parser = parser;
		}
		return loadBalanceEndPointEndPointName_5021Parser;
	}

	/**
	 * @generated
	 */
	private IParser headerMediatorValueLiteral_5022Parser;

	/**
	 * @generated
	 */
	private IParser getHeaderMediatorValueLiteral_5022Parser() {
		if (headerMediatorValueLiteral_5022Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getHeaderMediator_ValueLiteral() };
			MessageFormatParser parser = new MessageFormatParser(features);
			headerMediatorValueLiteral_5022Parser = parser;
		}
		return headerMediatorValueLiteral_5022Parser;
	}

	/**
	 * @generated
	 */
	private IParser cloneMediatorCloneID_5023Parser;

	/**
	 * @generated
	 */
	private IParser getCloneMediatorCloneID_5023Parser() {
		if (cloneMediatorCloneID_5023Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getCloneMediator_CloneID() };
			MessageFormatParser parser = new MessageFormatParser(features);
			cloneMediatorCloneID_5023Parser = parser;
		}
		return cloneMediatorCloneID_5023Parser;
	}

	/**
	 * @generated
	 */
	private IParser cacheMediatorCacheId_5024Parser;

	/**
	 * @generated
	 */
	private IParser getCacheMediatorCacheId_5024Parser() {
		if (cacheMediatorCacheId_5024Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getCacheMediator_CacheId() };
			MessageFormatParser parser = new MessageFormatParser(features);
			cacheMediatorCacheId_5024Parser = parser;
		}
		return cacheMediatorCacheId_5024Parser;
	}

	/**
	 * @generated
	 */
	private IParser iterateMediatorIterateID_5025Parser;

	/**
	 * @generated
	 */
	private IParser getIterateMediatorIterateID_5025Parser() {
		if (iterateMediatorIterateID_5025Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getIterateMediator_IterateID() };
			MessageFormatParser parser = new MessageFormatParser(features);
			iterateMediatorIterateID_5025Parser = parser;
		}
		return iterateMediatorIterateID_5025Parser;
	}

	/**
	 * @generated
	 */
	private IParser aggregateMediatorAggregateID_5026Parser;

	/**
	 * @generated
	 */
	private IParser getAggregateMediatorAggregateID_5026Parser() {
		if (aggregateMediatorAggregateID_5026Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getAggregateMediator_AggregateID() };
			MessageFormatParser parser = new MessageFormatParser(features);
			aggregateMediatorAggregateID_5026Parser = parser;
		}
		return aggregateMediatorAggregateID_5026Parser;
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
	private IParser calloutMediatorSoapAction_5027Parser;

	/**
	 * @generated
	 */
	private IParser getCalloutMediatorSoapAction_5027Parser() {
		if (calloutMediatorSoapAction_5027Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getCalloutMediator_SoapAction() };
			MessageFormatParser parser = new MessageFormatParser(features);
			calloutMediatorSoapAction_5027Parser = parser;
		}
		return calloutMediatorSoapAction_5027Parser;
	}

	/**
	 * @generated
	 */
	private IParser throttleMediatorGroupId_5028Parser;

	/**
	 * @generated
	 */
	private IParser getThrottleMediatorGroupId_5028Parser() {
		if (throttleMediatorGroupId_5028Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getThrottleMediator_GroupId() };
			MessageFormatParser parser = new MessageFormatParser(features);
			throttleMediatorGroupId_5028Parser = parser;
		}
		return throttleMediatorGroupId_5028Parser;
	}

	/**
	 * @generated
	 */
	private IParser oAuthMediatorRemoteServiceUrl_5029Parser;

	/**
	 * @generated
	 */
	private IParser getOAuthMediatorRemoteServiceUrl_5029Parser() {
		if (oAuthMediatorRemoteServiceUrl_5029Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getOAuthMediator_RemoteServiceUrl() };
			MessageFormatParser parser = new MessageFormatParser(features);
			oAuthMediatorRemoteServiceUrl_5029Parser = parser;
		}
		return oAuthMediatorRemoteServiceUrl_5029Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case ProxyServiceNameEditPart.VISUAL_ID:
			return getProxyServiceName_5003Parser();
		case DefaultEndPointEndPointNameEditPart.VISUAL_ID:
			return getDefaultEndPointEndPointName_5004Parser();
		case AddressEndPointEndPointNameEditPart.VISUAL_ID:
			return getAddressEndPointEndPointName_5005Parser();
		case FilterMediatorConditionTypeEditPart.VISUAL_ID:
			return getFilterMediatorConditionType_5008Parser();
		case LogMediatorLogCategoryEditPart.VISUAL_ID:
			return getLogMediatorLogCategory_5006Parser();
		case PropertyMediatorPropertyNameEditPart.VISUAL_ID:
			return getPropertyMediatorPropertyName_5002Parser();
		case EnrichMediatorSourceTypeEditPart.VISUAL_ID:
			return getEnrichMediatorSourceType_5007Parser();
		case SequenceNameEditPart.VISUAL_ID:
			return getSequenceName_5041Parser();
		case EventMediatorTopicTypeEditPart.VISUAL_ID:
			return getEventMediatorTopicType_5009Parser();
		case EntitlementMediatorServerURLEditPart.VISUAL_ID:
			return getEntitlementMediatorServerURL_5010Parser();
		case ClassMediatorClassNameEditPart.VISUAL_ID:
			return getClassMediatorClassName_5011Parser();
		case SpringMediatorBeanNameEditPart.VISUAL_ID:
			return getSpringMediatorBeanName_5012Parser();
		case ScriptMediatorScriptLanguageEditPart.VISUAL_ID:
			return getScriptMediatorScriptLanguage_5013Parser();
		case FaultMediatorFaultStringTypeEditPart.VISUAL_ID:
			return getFaultMediatorFaultStringType_5014Parser();
		case XQueryMediatorScriptKeyTypeEditPart.VISUAL_ID:
			return getXQueryMediatorScriptKeyType_5015Parser();
		case CommandMediatorClassNameEditPart.VISUAL_ID:
			return getCommandMediatorClassName_5016Parser();
		case DBLookupMediatorConnectionURLEditPart.VISUAL_ID:
			return getDBLookupMediatorConnectionURL_5017Parser();
		case DBReportMediatorConnectionURLEditPart.VISUAL_ID:
			return getDBReportMediatorConnectionURL_5018Parser();
		case FailoverEndPointEndPointNameEditPart.VISUAL_ID:
			return getFailoverEndPointEndPointName_5019Parser();
		case WSDLEndPointEndPointNameEditPart.VISUAL_ID:
			return getWSDLEndPointEndPointName_5020Parser();
		case LoadBalanceEndPointEndPointNameEditPart.VISUAL_ID:
			return getLoadBalanceEndPointEndPointName_5021Parser();
		case HeaderMediatorValueLiteralEditPart.VISUAL_ID:
			return getHeaderMediatorValueLiteral_5022Parser();
		case CloneMediatorCloneIDEditPart.VISUAL_ID:
			return getCloneMediatorCloneID_5023Parser();
		case CacheMediatorCacheIdEditPart.VISUAL_ID:
			return getCacheMediatorCacheId_5024Parser();
		case IterateMediatorIterateIDEditPart.VISUAL_ID:
			return getIterateMediatorIterateID_5025Parser();
		case CalloutMediatorSoapActionEditPart.VISUAL_ID:
			return getCalloutMediatorSoapAction_5027Parser();
		case ThrottleMediatorGroupIdEditPart.VISUAL_ID:
			return getThrottleMediatorGroupId_5028Parser();
		case OAuthMediatorRemoteServiceUrlEditPart.VISUAL_ID:
			return getOAuthMediatorRemoteServiceUrl_5029Parser();
		case AggregateMediatorAggregateIDEditPart.VISUAL_ID:
			return getAggregateMediatorAggregateID_5026Parser();
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
