package org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.providers;

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
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.AggregateMediatorAggregateIDEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.CacheMediatorCacheIdEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.CalloutMediatorSoapActionEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.ClassMediatorClassNameEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.CloneMediatorCloneIDEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.CommandMediatorClassNameEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.DBLookupMediatorConnectionURLEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.DBReportMediatorConnectionURLEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.EnrichMediatorSourceTypeEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.EntitlementMediatorServerURLEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.EventMediatorTopicTypeEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.FaultMediatorFaultStringTypeEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.FilterMediatorConditionTypeEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.HeaderMediatorValueLiteralEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.IterateMediatorIterateIDEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.LogMediatorLogCategoryEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.OAuthMediatorRemoteServiceUrlEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.PropertyMediatorPropertyNameEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.ScriptMediatorScriptLanguageEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.SpringMediatorBeanNameEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.ThrottleMediatorGroupIdEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.XQueryMediatorScriptKeyTypeEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.parsers.MessageFormatParser;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.part.EsbVisualIDRegistry;

/**
 * @generated
 */
public class EsbParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser logMediatorLogCategory_5001Parser;

	/**
	 * @generated
	 */
	private IParser getLogMediatorLogCategory_5001Parser() {
		if (logMediatorLogCategory_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getLogMediator_LogCategory() };
			MessageFormatParser parser = new MessageFormatParser(features);
			logMediatorLogCategory_5001Parser = parser;
		}
		return logMediatorLogCategory_5001Parser;
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
	private IParser enrichMediatorSourceType_5003Parser;

	/**
	 * @generated
	 */
	private IParser getEnrichMediatorSourceType_5003Parser() {
		if (enrichMediatorSourceType_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getEnrichMediator_SourceType() };
			MessageFormatParser parser = new MessageFormatParser(features);
			enrichMediatorSourceType_5003Parser = parser;
		}
		return enrichMediatorSourceType_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser filterMediatorConditionType_5004Parser;

	/**
	 * @generated
	 */
	private IParser getFilterMediatorConditionType_5004Parser() {
		if (filterMediatorConditionType_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getFilterMediator_ConditionType() };
			MessageFormatParser parser = new MessageFormatParser(features);
			filterMediatorConditionType_5004Parser = parser;
		}
		return filterMediatorConditionType_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser eventMediatorTopicType_5005Parser;

	/**
	 * @generated
	 */
	private IParser getEventMediatorTopicType_5005Parser() {
		if (eventMediatorTopicType_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getEventMediator_TopicType() };
			MessageFormatParser parser = new MessageFormatParser(features);
			eventMediatorTopicType_5005Parser = parser;
		}
		return eventMediatorTopicType_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser entitlementMediatorServerURL_5006Parser;

	/**
	 * @generated
	 */
	private IParser getEntitlementMediatorServerURL_5006Parser() {
		if (entitlementMediatorServerURL_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getEntitlementMediator_ServerURL() };
			MessageFormatParser parser = new MessageFormatParser(features);
			entitlementMediatorServerURL_5006Parser = parser;
		}
		return entitlementMediatorServerURL_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser classMediatorClassName_5007Parser;

	/**
	 * @generated
	 */
	private IParser getClassMediatorClassName_5007Parser() {
		if (classMediatorClassName_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getClassMediator_ClassName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			classMediatorClassName_5007Parser = parser;
		}
		return classMediatorClassName_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser springMediatorBeanName_5008Parser;

	/**
	 * @generated
	 */
	private IParser getSpringMediatorBeanName_5008Parser() {
		if (springMediatorBeanName_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getSpringMediator_BeanName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			springMediatorBeanName_5008Parser = parser;
		}
		return springMediatorBeanName_5008Parser;
	}

	/**
	 * @generated
	 */
	private IParser scriptMediatorScriptLanguage_5009Parser;

	/**
	 * @generated
	 */
	private IParser getScriptMediatorScriptLanguage_5009Parser() {
		if (scriptMediatorScriptLanguage_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getScriptMediator_ScriptLanguage() };
			MessageFormatParser parser = new MessageFormatParser(features);
			scriptMediatorScriptLanguage_5009Parser = parser;
		}
		return scriptMediatorScriptLanguage_5009Parser;
	}

	/**
	 * @generated
	 */
	private IParser faultMediatorFaultStringType_5010Parser;

	/**
	 * @generated
	 */
	private IParser getFaultMediatorFaultStringType_5010Parser() {
		if (faultMediatorFaultStringType_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getFaultMediator_FaultStringType() };
			MessageFormatParser parser = new MessageFormatParser(features);
			faultMediatorFaultStringType_5010Parser = parser;
		}
		return faultMediatorFaultStringType_5010Parser;
	}

	/**
	 * @generated
	 */
	private IParser xQueryMediatorScriptKeyType_5011Parser;

	/**
	 * @generated
	 */
	private IParser getXQueryMediatorScriptKeyType_5011Parser() {
		if (xQueryMediatorScriptKeyType_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getXQueryMediator_ScriptKeyType() };
			MessageFormatParser parser = new MessageFormatParser(features);
			xQueryMediatorScriptKeyType_5011Parser = parser;
		}
		return xQueryMediatorScriptKeyType_5011Parser;
	}

	/**
	 * @generated
	 */
	private IParser commandMediatorClassName_5012Parser;

	/**
	 * @generated
	 */
	private IParser getCommandMediatorClassName_5012Parser() {
		if (commandMediatorClassName_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getCommandMediator_ClassName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			commandMediatorClassName_5012Parser = parser;
		}
		return commandMediatorClassName_5012Parser;
	}

	/**
	 * @generated
	 */
	private IParser dBLookupMediatorConnectionURL_5013Parser;

	/**
	 * @generated
	 */
	private IParser getDBLookupMediatorConnectionURL_5013Parser() {
		if (dBLookupMediatorConnectionURL_5013Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getAbstractSqlExecutorMediator_ConnectionURL() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dBLookupMediatorConnectionURL_5013Parser = parser;
		}
		return dBLookupMediatorConnectionURL_5013Parser;
	}

	/**
	 * @generated
	 */
	private IParser dBReportMediatorConnectionURL_5014Parser;

	/**
	 * @generated
	 */
	private IParser getDBReportMediatorConnectionURL_5014Parser() {
		if (dBReportMediatorConnectionURL_5014Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getAbstractSqlExecutorMediator_ConnectionURL() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dBReportMediatorConnectionURL_5014Parser = parser;
		}
		return dBReportMediatorConnectionURL_5014Parser;
	}

	/**
	 * @generated
	 */
	private IParser headerMediatorValueLiteral_5015Parser;

	/**
	 * @generated
	 */
	private IParser getHeaderMediatorValueLiteral_5015Parser() {
		if (headerMediatorValueLiteral_5015Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getHeaderMediator_ValueLiteral() };
			MessageFormatParser parser = new MessageFormatParser(features);
			headerMediatorValueLiteral_5015Parser = parser;
		}
		return headerMediatorValueLiteral_5015Parser;
	}

	/**
	 * @generated
	 */
	private IParser cloneMediatorCloneID_5016Parser;

	/**
	 * @generated
	 */
	private IParser getCloneMediatorCloneID_5016Parser() {
		if (cloneMediatorCloneID_5016Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getCloneMediator_CloneID() };
			MessageFormatParser parser = new MessageFormatParser(features);
			cloneMediatorCloneID_5016Parser = parser;
		}
		return cloneMediatorCloneID_5016Parser;
	}

	/**
	 * @generated
	 */
	private IParser cacheMediatorCacheId_5017Parser;

	/**
	 * @generated
	 */
	private IParser getCacheMediatorCacheId_5017Parser() {
		if (cacheMediatorCacheId_5017Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getCacheMediator_CacheId() };
			MessageFormatParser parser = new MessageFormatParser(features);
			cacheMediatorCacheId_5017Parser = parser;
		}
		return cacheMediatorCacheId_5017Parser;
	}

	/**
	 * @generated
	 */
	private IParser iterateMediatorIterateID_5018Parser;

	/**
	 * @generated
	 */
	private IParser getIterateMediatorIterateID_5018Parser() {
		if (iterateMediatorIterateID_5018Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getIterateMediator_IterateID() };
			MessageFormatParser parser = new MessageFormatParser(features);
			iterateMediatorIterateID_5018Parser = parser;
		}
		return iterateMediatorIterateID_5018Parser;
	}

	/**
	 * @generated
	 */
	private IParser aggregateMediatorAggregateID_5019Parser;

	/**
	 * @generated
	 */
	private IParser getAggregateMediatorAggregateID_5019Parser() {
		if (aggregateMediatorAggregateID_5019Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getAggregateMediator_AggregateID() };
			MessageFormatParser parser = new MessageFormatParser(features);
			aggregateMediatorAggregateID_5019Parser = parser;
		}
		return aggregateMediatorAggregateID_5019Parser;
	}

	/**
	 * @generated
	 */
	private IParser calloutMediatorSoapAction_5020Parser;

	/**
	 * @generated
	 */
	private IParser getCalloutMediatorSoapAction_5020Parser() {
		if (calloutMediatorSoapAction_5020Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getCalloutMediator_SoapAction() };
			MessageFormatParser parser = new MessageFormatParser(features);
			calloutMediatorSoapAction_5020Parser = parser;
		}
		return calloutMediatorSoapAction_5020Parser;
	}

	/**
	 * @generated
	 */
	private IParser throttleMediatorGroupId_5021Parser;

	/**
	 * @generated
	 */
	private IParser getThrottleMediatorGroupId_5021Parser() {
		if (throttleMediatorGroupId_5021Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getThrottleMediator_GroupId() };
			MessageFormatParser parser = new MessageFormatParser(features);
			throttleMediatorGroupId_5021Parser = parser;
		}
		return throttleMediatorGroupId_5021Parser;
	}

	/**
	 * @generated
	 */
	private IParser oAuthMediatorRemoteServiceUrl_5022Parser;

	/**
	 * @generated
	 */
	private IParser getOAuthMediatorRemoteServiceUrl_5022Parser() {
		if (oAuthMediatorRemoteServiceUrl_5022Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getOAuthMediator_RemoteServiceUrl() };
			MessageFormatParser parser = new MessageFormatParser(features);
			oAuthMediatorRemoteServiceUrl_5022Parser = parser;
		}
		return oAuthMediatorRemoteServiceUrl_5022Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case LogMediatorLogCategoryEditPart.VISUAL_ID:
			return getLogMediatorLogCategory_5001Parser();
		case PropertyMediatorPropertyNameEditPart.VISUAL_ID:
			return getPropertyMediatorPropertyName_5002Parser();
		case EnrichMediatorSourceTypeEditPart.VISUAL_ID:
			return getEnrichMediatorSourceType_5003Parser();
		case FilterMediatorConditionTypeEditPart.VISUAL_ID:
			return getFilterMediatorConditionType_5004Parser();
		case EventMediatorTopicTypeEditPart.VISUAL_ID:
			return getEventMediatorTopicType_5005Parser();
		case EntitlementMediatorServerURLEditPart.VISUAL_ID:
			return getEntitlementMediatorServerURL_5006Parser();
		case ClassMediatorClassNameEditPart.VISUAL_ID:
			return getClassMediatorClassName_5007Parser();
		case SpringMediatorBeanNameEditPart.VISUAL_ID:
			return getSpringMediatorBeanName_5008Parser();
		case ScriptMediatorScriptLanguageEditPart.VISUAL_ID:
			return getScriptMediatorScriptLanguage_5009Parser();
		case FaultMediatorFaultStringTypeEditPart.VISUAL_ID:
			return getFaultMediatorFaultStringType_5010Parser();
		case XQueryMediatorScriptKeyTypeEditPart.VISUAL_ID:
			return getXQueryMediatorScriptKeyType_5011Parser();
		case CommandMediatorClassNameEditPart.VISUAL_ID:
			return getCommandMediatorClassName_5012Parser();
		case DBLookupMediatorConnectionURLEditPart.VISUAL_ID:
			return getDBLookupMediatorConnectionURL_5013Parser();
		case DBReportMediatorConnectionURLEditPart.VISUAL_ID:
			return getDBReportMediatorConnectionURL_5014Parser();
		case HeaderMediatorValueLiteralEditPart.VISUAL_ID:
			return getHeaderMediatorValueLiteral_5015Parser();
		case CloneMediatorCloneIDEditPart.VISUAL_ID:
			return getCloneMediatorCloneID_5016Parser();
		case CacheMediatorCacheIdEditPart.VISUAL_ID:
			return getCacheMediatorCacheId_5017Parser();
		case IterateMediatorIterateIDEditPart.VISUAL_ID:
			return getIterateMediatorIterateID_5018Parser();
		case AggregateMediatorAggregateIDEditPart.VISUAL_ID:
			return getAggregateMediatorAggregateID_5019Parser();
		case CalloutMediatorSoapActionEditPart.VISUAL_ID:
			return getCalloutMediatorSoapAction_5020Parser();
		case ThrottleMediatorGroupIdEditPart.VISUAL_ID:
			return getThrottleMediatorGroupId_5021Parser();
		case OAuthMediatorRemoteServiceUrlEditPart.VISUAL_ID:
			return getOAuthMediatorRemoteServiceUrl_5022Parser();
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
