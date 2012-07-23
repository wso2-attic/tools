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
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.AddressEndPointEndPointNameEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.AggregateMediatorAggregateIDEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.CacheMediatorCacheIdEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.CalloutMediatorSoapActionEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.ClassMediatorClassNameEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.CloneMediatorCloneIDEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.CommandMediatorClassNameEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.DBLookupMediatorConnectionURLEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.DBReportMediatorConnectionURLEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.DefaultEndPointEndPointNameEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.EnrichMediatorSourceTypeEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.EntitlementMediatorServerURLEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.EventMediatorTopicTypeEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.FailoverEndPointEndPointNameEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.FaultMediatorFaultStringTypeEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.FilterMediatorConditionTypeEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.HeaderMediatorValueLiteralEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.IterateMediatorIterateIDEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.LoadBalanceEndPointEndPointNameEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.LogMediatorLogCategoryEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.OAuthMediatorRemoteServiceUrlEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.PropertyMediatorPropertyNameEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.ProxyServiceNameEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.ScriptMediatorScriptLanguageEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.SequenceNameEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.SpringMediatorBeanNameEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.ThrottleMediatorGroupIdEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.WSDLEndPointEndPointNameEditPart;
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
	private IParser propertyMediatorPropertyName_5127Parser;

	/**
	 * @generated
	 */
	private IParser getPropertyMediatorPropertyName_5127Parser() {
		if (propertyMediatorPropertyName_5127Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getPropertyMediator_PropertyName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			propertyMediatorPropertyName_5127Parser = parser;
		}
		return propertyMediatorPropertyName_5127Parser;
	}

	/**
	 * @generated
	 */
	private IParser throttleMediatorGroupId_5128Parser;

	/**
	 * @generated
	 */
	private IParser getThrottleMediatorGroupId_5128Parser() {
		if (throttleMediatorGroupId_5128Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getThrottleMediator_GroupId() };
			MessageFormatParser parser = new MessageFormatParser(features);
			throttleMediatorGroupId_5128Parser = parser;
		}
		return throttleMediatorGroupId_5128Parser;
	}

	/**
	 * @generated
	 */
	private IParser filterMediatorConditionType_5129Parser;

	/**
	 * @generated
	 */
	private IParser getFilterMediatorConditionType_5129Parser() {
		if (filterMediatorConditionType_5129Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getFilterMediator_ConditionType() };
			MessageFormatParser parser = new MessageFormatParser(features);
			filterMediatorConditionType_5129Parser = parser;
		}
		return filterMediatorConditionType_5129Parser;
	}

	/**
	 * @generated
	 */
	private IParser logMediatorLogCategory_5130Parser;

	/**
	 * @generated
	 */
	private IParser getLogMediatorLogCategory_5130Parser() {
		if (logMediatorLogCategory_5130Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getLogMediator_LogCategory() };
			MessageFormatParser parser = new MessageFormatParser(features);
			logMediatorLogCategory_5130Parser = parser;
		}
		return logMediatorLogCategory_5130Parser;
	}

	/**
	 * @generated
	 */
	private IParser enrichMediatorSourceType_5131Parser;

	/**
	 * @generated
	 */
	private IParser getEnrichMediatorSourceType_5131Parser() {
		if (enrichMediatorSourceType_5131Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getEnrichMediator_SourceType() };
			MessageFormatParser parser = new MessageFormatParser(features);
			enrichMediatorSourceType_5131Parser = parser;
		}
		return enrichMediatorSourceType_5131Parser;
	}

	/**
	 * @generated
	 */
	private IParser sequenceName_5132Parser;

	/**
	 * @generated
	 */
	private IParser getSequenceName_5132Parser() {
		if (sequenceName_5132Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getSequence_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			sequenceName_5132Parser = parser;
		}
		return sequenceName_5132Parser;
	}

	/**
	 * @generated
	 */
	private IParser eventMediatorTopicType_5133Parser;

	/**
	 * @generated
	 */
	private IParser getEventMediatorTopicType_5133Parser() {
		if (eventMediatorTopicType_5133Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getEventMediator_TopicType() };
			MessageFormatParser parser = new MessageFormatParser(features);
			eventMediatorTopicType_5133Parser = parser;
		}
		return eventMediatorTopicType_5133Parser;
	}

	/**
	 * @generated
	 */
	private IParser entitlementMediatorServerURL_5134Parser;

	/**
	 * @generated
	 */
	private IParser getEntitlementMediatorServerURL_5134Parser() {
		if (entitlementMediatorServerURL_5134Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getEntitlementMediator_ServerURL() };
			MessageFormatParser parser = new MessageFormatParser(features);
			entitlementMediatorServerURL_5134Parser = parser;
		}
		return entitlementMediatorServerURL_5134Parser;
	}

	/**
	 * @generated
	 */
	private IParser classMediatorClassName_5135Parser;

	/**
	 * @generated
	 */
	private IParser getClassMediatorClassName_5135Parser() {
		if (classMediatorClassName_5135Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getClassMediator_ClassName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			classMediatorClassName_5135Parser = parser;
		}
		return classMediatorClassName_5135Parser;
	}

	/**
	 * @generated
	 */
	private IParser springMediatorBeanName_5136Parser;

	/**
	 * @generated
	 */
	private IParser getSpringMediatorBeanName_5136Parser() {
		if (springMediatorBeanName_5136Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getSpringMediator_BeanName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			springMediatorBeanName_5136Parser = parser;
		}
		return springMediatorBeanName_5136Parser;
	}

	/**
	 * @generated
	 */
	private IParser scriptMediatorScriptLanguage_5137Parser;

	/**
	 * @generated
	 */
	private IParser getScriptMediatorScriptLanguage_5137Parser() {
		if (scriptMediatorScriptLanguage_5137Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getScriptMediator_ScriptLanguage() };
			MessageFormatParser parser = new MessageFormatParser(features);
			scriptMediatorScriptLanguage_5137Parser = parser;
		}
		return scriptMediatorScriptLanguage_5137Parser;
	}

	/**
	 * @generated
	 */
	private IParser faultMediatorFaultStringType_5138Parser;

	/**
	 * @generated
	 */
	private IParser getFaultMediatorFaultStringType_5138Parser() {
		if (faultMediatorFaultStringType_5138Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getFaultMediator_FaultStringType() };
			MessageFormatParser parser = new MessageFormatParser(features);
			faultMediatorFaultStringType_5138Parser = parser;
		}
		return faultMediatorFaultStringType_5138Parser;
	}

	/**
	 * @generated
	 */
	private IParser xQueryMediatorScriptKeyType_5139Parser;

	/**
	 * @generated
	 */
	private IParser getXQueryMediatorScriptKeyType_5139Parser() {
		if (xQueryMediatorScriptKeyType_5139Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getXQueryMediator_ScriptKeyType() };
			MessageFormatParser parser = new MessageFormatParser(features);
			xQueryMediatorScriptKeyType_5139Parser = parser;
		}
		return xQueryMediatorScriptKeyType_5139Parser;
	}

	/**
	 * @generated
	 */
	private IParser commandMediatorClassName_5140Parser;

	/**
	 * @generated
	 */
	private IParser getCommandMediatorClassName_5140Parser() {
		if (commandMediatorClassName_5140Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getCommandMediator_ClassName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			commandMediatorClassName_5140Parser = parser;
		}
		return commandMediatorClassName_5140Parser;
	}

	/**
	 * @generated
	 */
	private IParser dBLookupMediatorConnectionURL_5141Parser;

	/**
	 * @generated
	 */
	private IParser getDBLookupMediatorConnectionURL_5141Parser() {
		if (dBLookupMediatorConnectionURL_5141Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getAbstractSqlExecutorMediator_ConnectionURL() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dBLookupMediatorConnectionURL_5141Parser = parser;
		}
		return dBLookupMediatorConnectionURL_5141Parser;
	}

	/**
	 * @generated
	 */
	private IParser dBReportMediatorConnectionURL_5142Parser;

	/**
	 * @generated
	 */
	private IParser getDBReportMediatorConnectionURL_5142Parser() {
		if (dBReportMediatorConnectionURL_5142Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getAbstractSqlExecutorMediator_ConnectionURL() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dBReportMediatorConnectionURL_5142Parser = parser;
		}
		return dBReportMediatorConnectionURL_5142Parser;
	}

	/**
	 * @generated
	 */
	private IParser headerMediatorValueLiteral_5143Parser;

	/**
	 * @generated
	 */
	private IParser getHeaderMediatorValueLiteral_5143Parser() {
		if (headerMediatorValueLiteral_5143Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getHeaderMediator_ValueLiteral() };
			MessageFormatParser parser = new MessageFormatParser(features);
			headerMediatorValueLiteral_5143Parser = parser;
		}
		return headerMediatorValueLiteral_5143Parser;
	}

	/**
	 * @generated
	 */
	private IParser cloneMediatorCloneID_5144Parser;

	/**
	 * @generated
	 */
	private IParser getCloneMediatorCloneID_5144Parser() {
		if (cloneMediatorCloneID_5144Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getCloneMediator_CloneID() };
			MessageFormatParser parser = new MessageFormatParser(features);
			cloneMediatorCloneID_5144Parser = parser;
		}
		return cloneMediatorCloneID_5144Parser;
	}

	/**
	 * @generated
	 */
	private IParser cacheMediatorCacheId_5145Parser;

	/**
	 * @generated
	 */
	private IParser getCacheMediatorCacheId_5145Parser() {
		if (cacheMediatorCacheId_5145Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getCacheMediator_CacheId() };
			MessageFormatParser parser = new MessageFormatParser(features);
			cacheMediatorCacheId_5145Parser = parser;
		}
		return cacheMediatorCacheId_5145Parser;
	}

	/**
	 * @generated
	 */
	private IParser iterateMediatorIterateID_5146Parser;

	/**
	 * @generated
	 */
	private IParser getIterateMediatorIterateID_5146Parser() {
		if (iterateMediatorIterateID_5146Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getIterateMediator_IterateID() };
			MessageFormatParser parser = new MessageFormatParser(features);
			iterateMediatorIterateID_5146Parser = parser;
		}
		return iterateMediatorIterateID_5146Parser;
	}

	/**
	 * @generated
	 */
	private IParser calloutMediatorSoapAction_5147Parser;

	/**
	 * @generated
	 */
	private IParser getCalloutMediatorSoapAction_5147Parser() {
		if (calloutMediatorSoapAction_5147Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getCalloutMediator_SoapAction() };
			MessageFormatParser parser = new MessageFormatParser(features);
			calloutMediatorSoapAction_5147Parser = parser;
		}
		return calloutMediatorSoapAction_5147Parser;
	}

	/**
	 * @generated
	 */
	private IParser oAuthMediatorRemoteServiceUrl_5148Parser;

	/**
	 * @generated
	 */
	private IParser getOAuthMediatorRemoteServiceUrl_5148Parser() {
		if (oAuthMediatorRemoteServiceUrl_5148Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getOAuthMediator_RemoteServiceUrl() };
			MessageFormatParser parser = new MessageFormatParser(features);
			oAuthMediatorRemoteServiceUrl_5148Parser = parser;
		}
		return oAuthMediatorRemoteServiceUrl_5148Parser;
	}

	/**
	 * @generated
	 */
	private IParser aggregateMediatorAggregateID_5149Parser;

	/**
	 * @generated
	 */
	private IParser getAggregateMediatorAggregateID_5149Parser() {
		if (aggregateMediatorAggregateID_5149Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getAggregateMediator_AggregateID() };
			MessageFormatParser parser = new MessageFormatParser(features);
			aggregateMediatorAggregateID_5149Parser = parser;
		}
		return aggregateMediatorAggregateID_5149Parser;
	}

	/**
	 * @generated
	 */
	private IParser defaultEndPointEndPointName_5155Parser;

	/**
	 * @generated
	 */
	private IParser getDefaultEndPointEndPointName_5155Parser() {
		if (defaultEndPointEndPointName_5155Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getEndPoint_EndPointName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			defaultEndPointEndPointName_5155Parser = parser;
		}
		return defaultEndPointEndPointName_5155Parser;
	}

	/**
	 * @generated
	 */
	private IParser addressEndPointEndPointName_5156Parser;

	/**
	 * @generated
	 */
	private IParser getAddressEndPointEndPointName_5156Parser() {
		if (addressEndPointEndPointName_5156Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getEndPoint_EndPointName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			addressEndPointEndPointName_5156Parser = parser;
		}
		return addressEndPointEndPointName_5156Parser;
	}

	/**
	 * @generated
	 */
	private IParser failoverEndPointEndPointName_5157Parser;

	/**
	 * @generated
	 */
	private IParser getFailoverEndPointEndPointName_5157Parser() {
		if (failoverEndPointEndPointName_5157Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getEndPoint_EndPointName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			failoverEndPointEndPointName_5157Parser = parser;
		}
		return failoverEndPointEndPointName_5157Parser;
	}

	/**
	 * @generated
	 */
	private IParser wSDLEndPointEndPointName_5158Parser;

	/**
	 * @generated
	 */
	private IParser getWSDLEndPointEndPointName_5158Parser() {
		if (wSDLEndPointEndPointName_5158Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getEndPoint_EndPointName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			wSDLEndPointEndPointName_5158Parser = parser;
		}
		return wSDLEndPointEndPointName_5158Parser;
	}

	/**
	 * @generated
	 */
	private IParser loadBalanceEndPointEndPointName_5159Parser;

	/**
	 * @generated
	 */
	private IParser getLoadBalanceEndPointEndPointName_5159Parser() {
		if (loadBalanceEndPointEndPointName_5159Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getEndPoint_EndPointName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			loadBalanceEndPointEndPointName_5159Parser = parser;
		}
		return loadBalanceEndPointEndPointName_5159Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case ProxyServiceNameEditPart.VISUAL_ID:
			return getProxyServiceName_5003Parser();
		case PropertyMediatorPropertyNameEditPart.VISUAL_ID:
			return getPropertyMediatorPropertyName_5127Parser();
		case ThrottleMediatorGroupIdEditPart.VISUAL_ID:
			return getThrottleMediatorGroupId_5128Parser();
		case FilterMediatorConditionTypeEditPart.VISUAL_ID:
			return getFilterMediatorConditionType_5129Parser();
		case LogMediatorLogCategoryEditPart.VISUAL_ID:
			return getLogMediatorLogCategory_5130Parser();
		case EnrichMediatorSourceTypeEditPart.VISUAL_ID:
			return getEnrichMediatorSourceType_5131Parser();
		case SequenceNameEditPart.VISUAL_ID:
			return getSequenceName_5132Parser();
		case EventMediatorTopicTypeEditPart.VISUAL_ID:
			return getEventMediatorTopicType_5133Parser();
		case EntitlementMediatorServerURLEditPart.VISUAL_ID:
			return getEntitlementMediatorServerURL_5134Parser();
		case ClassMediatorClassNameEditPart.VISUAL_ID:
			return getClassMediatorClassName_5135Parser();
		case SpringMediatorBeanNameEditPart.VISUAL_ID:
			return getSpringMediatorBeanName_5136Parser();
		case ScriptMediatorScriptLanguageEditPart.VISUAL_ID:
			return getScriptMediatorScriptLanguage_5137Parser();
		case FaultMediatorFaultStringTypeEditPart.VISUAL_ID:
			return getFaultMediatorFaultStringType_5138Parser();
		case XQueryMediatorScriptKeyTypeEditPart.VISUAL_ID:
			return getXQueryMediatorScriptKeyType_5139Parser();
		case CommandMediatorClassNameEditPart.VISUAL_ID:
			return getCommandMediatorClassName_5140Parser();
		case DBLookupMediatorConnectionURLEditPart.VISUAL_ID:
			return getDBLookupMediatorConnectionURL_5141Parser();
		case DBReportMediatorConnectionURLEditPart.VISUAL_ID:
			return getDBReportMediatorConnectionURL_5142Parser();
		case HeaderMediatorValueLiteralEditPart.VISUAL_ID:
			return getHeaderMediatorValueLiteral_5143Parser();
		case CloneMediatorCloneIDEditPart.VISUAL_ID:
			return getCloneMediatorCloneID_5144Parser();
		case CacheMediatorCacheIdEditPart.VISUAL_ID:
			return getCacheMediatorCacheId_5145Parser();
		case IterateMediatorIterateIDEditPart.VISUAL_ID:
			return getIterateMediatorIterateID_5146Parser();
		case CalloutMediatorSoapActionEditPart.VISUAL_ID:
			return getCalloutMediatorSoapAction_5147Parser();
		case OAuthMediatorRemoteServiceUrlEditPart.VISUAL_ID:
			return getOAuthMediatorRemoteServiceUrl_5148Parser();
		case AggregateMediatorAggregateIDEditPart.VISUAL_ID:
			return getAggregateMediatorAggregateID_5149Parser();
		case DefaultEndPointEndPointNameEditPart.VISUAL_ID:
			return getDefaultEndPointEndPointName_5155Parser();
		case AddressEndPointEndPointNameEditPart.VISUAL_ID:
			return getAddressEndPointEndPointName_5156Parser();
		case FailoverEndPointEndPointNameEditPart.VISUAL_ID:
			return getFailoverEndPointEndPointName_5157Parser();
		case WSDLEndPointEndPointNameEditPart.VISUAL_ID:
			return getWSDLEndPointEndPointName_5158Parser();
		case LoadBalanceEndPointEndPointNameEditPart.VISUAL_ID:
			return getLoadBalanceEndPointEndPointName_5159Parser();
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
