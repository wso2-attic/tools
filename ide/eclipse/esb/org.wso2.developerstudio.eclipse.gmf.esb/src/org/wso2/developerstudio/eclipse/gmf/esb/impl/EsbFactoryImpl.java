/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.wso2.developerstudio.eclipse.gmf.esb.impl;

import java.util.Map;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.wso2.developerstudio.eclipse.gmf.esb.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EsbFactoryImpl extends EFactoryImpl implements EsbFactory {
	static int proxyservicecount;
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EsbFactory init() {
		try {
			EsbFactory theEsbFactory = (EsbFactory)EPackage.Registry.INSTANCE.getEFactory("http:///org/wso2/developerstudio/eclipse/gmf/esb"); 
			if (theEsbFactory != null) {
				return theEsbFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EsbFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EsbFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EsbPackage.ESB_DIAGRAM: return createEsbDiagram();
			case EsbPackage.ESB_SERVER: return createEsbServer();
			case EsbPackage.ESB_LINK: return createEsbLink();
			case EsbPackage.PROXY_SERVICE: return createProxyService();
			case EsbPackage.PROXY_OUTPUT_CONNECTOR: return createProxyOutputConnector();
			case EsbPackage.PROXY_INPUT_CONNECTOR: return createProxyInputConnector();
			case EsbPackage.PROXY_SERVICE_PARAMETER: return createProxyServiceParameter();
			case EsbPackage.PROXY_SERVICE_POLICY: return createProxyServicePolicy();
			case EsbPackage.PROXY_SERVICE_IN_SEQUENCE: return createProxyServiceInSequence();
			case EsbPackage.PROXY_SERVICE_OUT_SEQUENCE: return createProxyServiceOutSequence();
			case EsbPackage.PROXY_SERVICE_SEQUENCE_CONTAINER: return createProxyServiceSequenceContainer();
			case EsbPackage.PROXY_SERVICE_ENDPOINT_CONTAINER: return createProxyServiceEndpointContainer();
			case EsbPackage.MESSAGE_MEDIATOR: return createMessageMediator();
			case EsbPackage.MESSAGE_INPUT_CONNECTOR: return createMessageInputConnector();
			case EsbPackage.MESSAGE_OUTPUT_CONNECTOR: return createMessageOutputConnector();
			case EsbPackage.DEFAULT_END_POINT: return createDefaultEndPoint();
			case EsbPackage.DEFAULT_END_POINT_INPUT_CONNECTOR: return createDefaultEndPointInputConnector();
			case EsbPackage.DEFAULT_END_POINT_OUTPUT_CONNECTOR: return createDefaultEndPointOutputConnector();
			case EsbPackage.ADDRESS_END_POINT: return createAddressEndPoint();
			case EsbPackage.ADDRESS_END_POINT_INPUT_CONNECTOR: return createAddressEndPointInputConnector();
			case EsbPackage.ADDRESS_END_POINT_OUTPUT_CONNECTOR: return createAddressEndPointOutputConnector();
			case EsbPackage.DROP_MEDIATOR: return createDropMediator();
			case EsbPackage.DROP_MEDIATOR_INPUT_CONNECTOR: return createDropMediatorInputConnector();
			case EsbPackage.FILTER_MEDIATOR: return createFilterMediator();
			case EsbPackage.FILTER_MEDIATOR_INPUT_CONNECTOR: return createFilterMediatorInputConnector();
			case EsbPackage.FILTER_MEDIATOR_PASS_OUTPUT_CONNECTOR: return createFilterMediatorPassOutputConnector();
			case EsbPackage.FILTER_MEDIATOR_FAIL_OUTPUT_CONNECTOR: return createFilterMediatorFailOutputConnector();
			case EsbPackage.MERGE_NODE: return createMergeNode();
			case EsbPackage.MERGE_NODE_FIRST_INPUT_CONNECTOR: return createMergeNodeFirstInputConnector();
			case EsbPackage.MERGE_NODE_SECOND_INPUT_CONNECTOR: return createMergeNodeSecondInputConnector();
			case EsbPackage.MERGE_NODE_OUTPUT_CONNECTOR: return createMergeNodeOutputConnector();
			case EsbPackage.LOG_MEDIATOR: return createLogMediator();
			case EsbPackage.LOG_MEDIATOR_INPUT_CONNECTOR: return createLogMediatorInputConnector();
			case EsbPackage.LOG_MEDIATOR_OUTPUT_CONNECTOR: return createLogMediatorOutputConnector();
			case EsbPackage.LOG_PROPERTY: return createLogProperty();
			case EsbPackage.REGISTRY_KEY_PROPERTY: return createRegistryKeyProperty();
			case EsbPackage.PROPERTY_MEDIATOR: return createPropertyMediator();
			case EsbPackage.PROPERTY_MEDIATOR_INPUT_CONNECTOR: return createPropertyMediatorInputConnector();
			case EsbPackage.PROPERTY_MEDIATOR_OUTPUT_CONNECTOR: return createPropertyMediatorOutputConnector();
			case EsbPackage.NAMESPACED_PROPERTY: return createNamespacedProperty();
			case EsbPackage.ENRICH_MEDIATOR: return createEnrichMediator();
			case EsbPackage.ENRICH_MEDIATOR_INPUT_CONNECTOR: return createEnrichMediatorInputConnector();
			case EsbPackage.ENRICH_MEDIATOR_OUTPUT_CONNECTOR: return createEnrichMediatorOutputConnector();
			case EsbPackage.XSLT_MEDIATOR: return createXSLTMediator();
			case EsbPackage.XSLT_PROPERTY: return createXSLTProperty();
			case EsbPackage.XSLT_FEATURE: return createXSLTFeature();
			case EsbPackage.XSLT_RESOURCE: return createXSLTResource();
			case EsbPackage.XSLT_MEDIATOR_INPUT_CONNECTOR: return createXSLTMediatorInputConnector();
			case EsbPackage.XSLT_MEDIATOR_OUTPUT_CONNECTOR: return createXSLTMediatorOutputConnector();
			case EsbPackage.SWITCH_MEDIATOR: return createSwitchMediator();
			case EsbPackage.SWITCH_CASE_BRANCH_OUTPUT_CONNECTOR: return createSwitchCaseBranchOutputConnector();
			case EsbPackage.SWITCH_DEFAULT_BRANCH_OUTPUT_CONNECTOR: return createSwitchDefaultBranchOutputConnector();
			case EsbPackage.SWITCH_MEDIATOR_INPUT_CONNECTOR: return createSwitchMediatorInputConnector();
			case EsbPackage.SEQUENCE_DIAGRAM: return createSequenceDiagram();
			case EsbPackage.ESB_SEQUENCE: return createEsbSequence();
			case EsbPackage.ESB_SEQUENCE_INPUT: return createEsbSequenceInput();
			case EsbPackage.ESB_SEQUENCE_OUTPUT: return createEsbSequenceOutput();
			case EsbPackage.ESB_SEQUENCE_INPUT_CONNECTOR: return createEsbSequenceInputConnector();
			case EsbPackage.ESB_SEQUENCE_OUTPUT_CONNECTOR: return createEsbSequenceOutputConnector();
			case EsbPackage.SEQUENCE: return createSequence();
			case EsbPackage.SEQUENCE_INPUT_CONNECTOR: return createSequenceInputConnector();
			case EsbPackage.SEQUENCE_OUTPUT_CONNECTOR: return createSequenceOutputConnector();
			case EsbPackage.EVENT_MEDIATOR: return createEventMediator();
			case EsbPackage.EVENT_MEDIATOR_INPUT_CONNECTOR: return createEventMediatorInputConnector();
			case EsbPackage.EVENT_MEDIATOR_OUTPUT_CONNECTOR: return createEventMediatorOutputConnector();
			case EsbPackage.ENTITLEMENT_MEDIATOR: return createEntitlementMediator();
			case EsbPackage.ENTITLEMENT_MEDIATOR_INPUT_CONNECTOR: return createEntitlementMediatorInputConnector();
			case EsbPackage.ENTITLEMENT_MEDIATOR_OUTPUT_CONNECTOR: return createEntitlementMediatorOutputConnector();
			case EsbPackage.ENQUEUE_MEDIATOR: return createEnqueueMediator();
			case EsbPackage.CLASS_MEDIATOR: return createClassMediator();
			case EsbPackage.CLASS_MEDIATOR_INPUT_CONNECTOR: return createClassMediatorInputConnector();
			case EsbPackage.CLASS_MEDIATOR_OUTPUT_CONNECTOR: return createClassMediatorOutputConnector();
			case EsbPackage.CLASS_PROPERTY: return createClassProperty();
			case EsbPackage.SPRING_MEDIATOR: return createSpringMediator();
			case EsbPackage.SPRING_MEDIATOR_INPUT_CONNECTOR: return createSpringMediatorInputConnector();
			case EsbPackage.SPRING_MEDIATOR_OUTPUT_CONNECTOR: return createSpringMediatorOutputConnector();
			case EsbPackage.VALIDATE_MEDIATOR: return createValidateMediator();
			case EsbPackage.VALIDATE_ON_FAIL_BRANCH: return createValidateOnFailBranch();
			case EsbPackage.VALIDATE_FEATURE: return createValidateFeature();
			case EsbPackage.VALIDATE_SCHEMA: return createValidateSchema();
			case EsbPackage.SCRIPT_MEDIATOR: return createScriptMediator();
			case EsbPackage.SCRIPT_MEDIATOR_INPUT_CONNECTOR: return createScriptMediatorInputConnector();
			case EsbPackage.SCRIPT_MEDIATOR_OUTPUT_CONNECTOR: return createScriptMediatorOutputConnector();
			case EsbPackage.FAULT_MEDIATOR: return createFaultMediator();
			case EsbPackage.FAULT_MEDIATOR_INPUT_CONNECTOR: return createFaultMediatorInputConnector();
			case EsbPackage.FAULT_MEDIATOR_OUTPUT_CONNECTOR: return createFaultMediatorOutputConnector();
			case EsbPackage.AGGREGATE_MEDIATOR: return createAggregateMediator();
			case EsbPackage.AGGREGATE_MEDIATOR_INPUT_CONNECTOR: return createAggregateMediatorInputConnector();
			case EsbPackage.AGGREGATE_MEDIATOR_OUTPUT_CONNECTOR: return createAggregateMediatorOutputConnector();
			case EsbPackage.AGGREGATE_MEDIATOR_ON_COMPLETE_OUTPUT_CONNECTOR: return createAggregateMediatorOnCompleteOutputConnector();
			case EsbPackage.AGGREGATE_ON_COMPLETE_BRANCH: return createAggregateOnCompleteBranch();
			case EsbPackage.ROUTER_MEDIATOR: return createRouterMediator();
			case EsbPackage.ROUTER_ROUTE: return createRouterRoute();
			case EsbPackage.ROUTE_TARGET: return createRouteTarget();
			case EsbPackage.CLONE_MEDIATOR: return createCloneMediator();
			case EsbPackage.CLONE_MEDIATOR_INPUT_CONNECTOR: return createCloneMediatorInputConnector();
			case EsbPackage.CLONE_MEDIATOR_OUTPUT_CONNECTOR: return createCloneMediatorOutputConnector();
			case EsbPackage.CLONE_MEDIATOR_TARGET_OUTPUT_CONNECTOR: return createCloneMediatorTargetOutputConnector();
			case EsbPackage.ITERATE_MEDIATOR: return createIterateMediator();
			case EsbPackage.ITERATE_MEDIATOR_INPUT_CONNECTOR: return createIterateMediatorInputConnector();
			case EsbPackage.ITERATE_MEDIATOR_OUTPUT_CONNECTOR: return createIterateMediatorOutputConnector();
			case EsbPackage.ITERATE_TARGET: return createIterateTarget();
			case EsbPackage.ABSTRACT_COMMON_TARGET: return createAbstractCommonTarget();
			case EsbPackage.MEDIATOR_SEQUENCE: return createMediatorSequence();
			case EsbPackage.CACHE_MEDIATOR: return createCacheMediator();
			case EsbPackage.CACHE_MEDIATOR_INPUT_CONNECTOR: return createCacheMediatorInputConnector();
			case EsbPackage.CACHE_MEDIATOR_OUTPUT_CONNECTOR: return createCacheMediatorOutputConnector();
			case EsbPackage.CACHE_ON_HIT_BRANCH: return createCacheOnHitBranch();
			case EsbPackage.XQUERY_MEDIATOR: return createXQueryMediator();
			case EsbPackage.XQUERY_MEDIATOR_INPUT_CONNECTOR: return createXQueryMediatorInputConnector();
			case EsbPackage.XQUERY_MEDIATOR_OUTPUT_CONNECTOR: return createXQueryMediatorOutputConnector();
			case EsbPackage.XQUERY_VARIABLE: return createXQueryVariable();
			case EsbPackage.CALLOUT_MEDIATOR: return createCalloutMediator();
			case EsbPackage.CALLOUT_MEDIATOR_INPUT_CONNECTOR: return createCalloutMediatorInputConnector();
			case EsbPackage.CALLOUT_MEDIATOR_OUTPUT_CONNECTOR: return createCalloutMediatorOutputConnector();
			case EsbPackage.RM_SEQUENCE_MEDIATOR: return createRMSequenceMediator();
			case EsbPackage.RM_SEQUENCE_MEDIATOR_INPUT_CONNECTOR: return createRMSequenceMediatorInputConnector();
			case EsbPackage.RM_SEQUENCE_MEDIATOR_OUTPUT_CONNECTOR: return createRMSequenceMediatorOutputConnector();
			case EsbPackage.TRANSACTION_MEDIATOR: return createTransactionMediator();
			case EsbPackage.TRANSACTION_MEDIATOR_INPUT_CONNECTOR: return createTransactionMediatorInputConnector();
			case EsbPackage.TRANSACTION_MEDIATOR_OUTPUT_CONNECTOR: return createTransactionMediatorOutputConnector();
			case EsbPackage.OAUTH_MEDIATOR: return createOAuthMediator();
			case EsbPackage.OAUTH_MEDIATOR_INPUT_CONNECTOR: return createOAuthMediatorInputConnector();
			case EsbPackage.OAUTH_MEDIATOR_OUTPUT_CONNECTOR: return createOAuthMediatorOutputConnector();
			case EsbPackage.AUTOSCALE_IN_MEDIATOR: return createAutoscaleInMediator();
			case EsbPackage.AUTOSCALE_OUT_MEDIATOR: return createAutoscaleOutMediator();
			case EsbPackage.HEADER_MEDIATOR: return createHeaderMediator();
			case EsbPackage.HEADER_MEDIATOR_INPUT_CONNECTOR: return createHeaderMediatorInputConnector();
			case EsbPackage.HEADER_MEDIATOR_OUTPUT_CONNECTOR: return createHeaderMediatorOutputConnector();
			case EsbPackage.THROTTLE_MEDIATOR: return createThrottleMediator();
			case EsbPackage.THROTTLE_MEDIATOR_INPUT_CONNECTOR: return createThrottleMediatorInputConnector();
			case EsbPackage.THROTTLE_MEDIATOR_OUTPUT_CONNECTOR: return createThrottleMediatorOutputConnector();
			case EsbPackage.THROTTLE_POLICY_CONFIGURATION: return createThrottlePolicyConfiguration();
			case EsbPackage.THROTTLE_POLICY_ENTRY: return createThrottlePolicyEntry();
			case EsbPackage.THROTTLE_ON_ACCEPT_BRANCH: return createThrottleOnAcceptBranch();
			case EsbPackage.THROTTLE_ON_REJECT_BRANCH: return createThrottleOnRejectBranch();
			case EsbPackage.COMMAND_MEDIATOR: return createCommandMediator();
			case EsbPackage.COMMAND_MEDIATOR_INPUT_CONNECTOR: return createCommandMediatorInputConnector();
			case EsbPackage.COMMAND_MEDIATOR_OUTPUT_CONNECTOR: return createCommandMediatorOutputConnector();
			case EsbPackage.COMMAND_PROPERTY: return createCommandProperty();
			case EsbPackage.SQL_STATEMENT: return createSqlStatement();
			case EsbPackage.SQL_PARAMETER_DEFINITION: return createSqlParameterDefinition();
			case EsbPackage.SQL_RESULT_MAPPING: return createSqlResultMapping();
			case EsbPackage.DB_LOOKUP_MEDIATOR: return createDBLookupMediator();
			case EsbPackage.DB_LOOKUP_MEDIATOR_INPUT_CONNECTOR: return createDBLookupMediatorInputConnector();
			case EsbPackage.DB_LOOKUP_MEDIATOR_OUTPUT_CONNECTOR: return createDBLookupMediatorOutputConnector();
			case EsbPackage.DB_REPORT_MEDIATOR: return createDBReportMediator();
			case EsbPackage.DB_REPORT_MEDIATOR_INPUT_CONNECTOR: return createDBReportMediatorInputConnector();
			case EsbPackage.DB_REPORT_MEDIATOR_OUTPUT_CONNECTOR: return createDBReportMediatorOutputConnector();
			case EsbPackage.RULE_MEDIATOR: return createRuleMediator();
			case EsbPackage.RULE_MEDIATOR_INPUT_CONNECTOR: return createRuleMediatorInputConnector();
			case EsbPackage.RULE_MEDIATOR_OUTPUT_CONNECTOR: return createRuleMediatorOutputConnector();
			case EsbPackage.RULE_SET_CONFIGURATION: return createRuleSetConfiguration();
			case EsbPackage.RULE_SET_CREATION_PROPERTY: return createRuleSetCreationProperty();
			case EsbPackage.RULE_SESSION_CONFIGURATION: return createRuleSessionConfiguration();
			case EsbPackage.RULE_SESSION_PROPERTY: return createRuleSessionProperty();
			case EsbPackage.RULE_FACTS_CONFIGURATION: return createRuleFactsConfiguration();
			case EsbPackage.RULE_FACT: return createRuleFact();
			case EsbPackage.RULE_RESULTS_CONFIGURATION: return createRuleResultsConfiguration();
			case EsbPackage.RULE_RESULT: return createRuleResult();
			case EsbPackage.RULE_CHILD_MEDIATORS_CONFIGURATION: return createRuleChildMediatorsConfiguration();
			case EsbPackage.SMOOKS_MEDIATOR: return createSmooksMediator();
			case EsbPackage.SMOOKS_MEDIATOR_INPUT_CONNECTOR: return createSmooksMediatorInputConnector();
			case EsbPackage.SMOOKS_MEDIATOR_OUTPUT_CONNECTOR: return createSmooksMediatorOutputConnector();
			case EsbPackage.SMOOKS_IN_CONFIGURATION: return createSmooksInConfiguration();
			case EsbPackage.SMOOKS_OUT_CONFIGURATION: return createSmooksOutConfiguration();
			case EsbPackage.STORE_MEDIATOR: return createStoreMediator();
			case EsbPackage.CONDITIONAL_ROUTE_BRANCH: return createConditionalRouteBranch();
			case EsbPackage.CONDITIONAL_ROUTER_MEDIATOR: return createConditionalRouterMediator();
			case EsbPackage.SEND_MEDIATOR: return createSendMediator();
			case EsbPackage.SEND_MEDIATOR_INPUT_CONNECTOR: return createSendMediatorInputConnector();
			case EsbPackage.SEND_MEDIATOR_OUTPUT_CONNECTOR: return createSendMediatorOutputConnector();
			case EsbPackage.FAILOVER_END_POINT: return createFailoverEndPoint();
			case EsbPackage.FAILOVER_END_POINT_INPUT_CONNECTOR: return createFailoverEndPointInputConnector();
			case EsbPackage.FAILOVER_END_POINT_OUTPUT_CONNECTOR: return createFailoverEndPointOutputConnector();
			case EsbPackage.FAILOVER_END_POINT_WEST_OUTPUT_CONNECTOR: return createFailoverEndPointWestOutputConnector();
			case EsbPackage.PARENT_END_POINT: return createParentEndPoint();
			case EsbPackage.WSDL_END_POINT: return createWSDLEndPoint();
			case EsbPackage.WSDL_DEFINITION: return createWSDLDefinition();
			case EsbPackage.WSDL_DESCRIPTION: return createWSDLDescription();
			case EsbPackage.WSDL_END_POINT_INPUT_CONNECTOR: return createWSDLEndPointInputConnector();
			case EsbPackage.WSDL_END_POINT_OUTPUT_CONNECTOR: return createWSDLEndPointOutputConnector();
			case EsbPackage.LOAD_BALANCE_END_POINT: return createLoadBalanceEndPoint();
			case EsbPackage.LOAD_BALANCE_END_POINT_INPUT_CONNECTOR: return createLoadBalanceEndPointInputConnector();
			case EsbPackage.LOAD_BALANCE_END_POINT_OUTPUT_CONNECTOR: return createLoadBalanceEndPointOutputConnector();
			case EsbPackage.LOAD_BALANCE_END_POINT_WEST_OUTPUT_CONNECTOR: return createLoadBalanceEndPointWestOutputConnector();
			case EsbPackage.LOCAL_ENTRY: return createLocalEntry();
			case EsbPackage.SESSION: return createSession();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case EsbPackage.PROXY_WSDL_TYPE:
				return createProxyWsdlTypeFromString(eDataType, initialValue);
			case EsbPackage.FILTER_CONDITION_TYPE:
				return createFilterConditionTypeFromString(eDataType, initialValue);
			case EsbPackage.LOG_CATEGORY:
				return createLogCategoryFromString(eDataType, initialValue);
			case EsbPackage.LOG_LEVEL:
				return createLogLevelFromString(eDataType, initialValue);
			case EsbPackage.END_POINT_ADDRESSING_VERSION:
				return createEndPointAddressingVersionFromString(eDataType, initialValue);
			case EsbPackage.END_POINT_TIME_OUT_ACTION:
				return createEndPointTimeOutActionFromString(eDataType, initialValue);
			case EsbPackage.END_POINT_MESSAGE_FORMAT:
				return createEndPointMessageFormatFromString(eDataType, initialValue);
			case EsbPackage.END_POINT_ATTACHMENT_OPTIMIZATION:
				return createEndPointAttachmentOptimizationFromString(eDataType, initialValue);
			case EsbPackage.PROPERTY_DATA_TYPE:
				return createPropertyDataTypeFromString(eDataType, initialValue);
			case EsbPackage.PROPERTY_ACTION:
				return createPropertyActionFromString(eDataType, initialValue);
			case EsbPackage.PROPERTY_SCOPE:
				return createPropertyScopeFromString(eDataType, initialValue);
			case EsbPackage.PROPERTY_VALUE_TYPE:
				return createPropertyValueTypeFromString(eDataType, initialValue);
			case EsbPackage.ENRICH_SOURCE_TYPE:
				return createEnrichSourceTypeFromString(eDataType, initialValue);
			case EsbPackage.ENRICH_TARGET_ACTION:
				return createEnrichTargetActionFromString(eDataType, initialValue);
			case EsbPackage.ENRICH_TARGET_TYPE:
				return createEnrichTargetTypeFromString(eDataType, initialValue);
			case EsbPackage.EVENT_TOPIC_TYPE:
				return createEventTopicTypeFromString(eDataType, initialValue);
			case EsbPackage.SCRIPT_TYPE:
				return createScriptTypeFromString(eDataType, initialValue);
			case EsbPackage.SCRIPT_LANGUAGE:
				return createScriptLanguageFromString(eDataType, initialValue);
			case EsbPackage.FAULT_SOAP_VERSION:
				return createFaultSoapVersionFromString(eDataType, initialValue);
			case EsbPackage.FAULT_CODE_SOAP11:
				return createFaultCodeSoap11FromString(eDataType, initialValue);
			case EsbPackage.FAULT_CODE_SOAP12:
				return createFaultCodeSoap12FromString(eDataType, initialValue);
			case EsbPackage.FAULT_STRING_TYPE:
				return createFaultStringTypeFromString(eDataType, initialValue);
			case EsbPackage.FAULT_REASON_TYPE:
				return createFaultReasonTypeFromString(eDataType, initialValue);
			case EsbPackage.FAULT_DETAIL_TYPE:
				return createFaultDetailTypeFromString(eDataType, initialValue);
			case EsbPackage.AGGREGATE_SEQUENCE_TYPE:
				return createAggregateSequenceTypeFromString(eDataType, initialValue);
			case EsbPackage.TARGET_SEQUENCE_TYPE:
				return createTargetSequenceTypeFromString(eDataType, initialValue);
			case EsbPackage.TARGET_ENDPOINT_TYPE:
				return createTargetEndpointTypeFromString(eDataType, initialValue);
			case EsbPackage.CACHE_SEQUENCE_TYPE:
				return createCacheSequenceTypeFromString(eDataType, initialValue);
			case EsbPackage.CACHE_IMPLEMENTATION_TYPE:
				return createCacheImplementationTypeFromString(eDataType, initialValue);
			case EsbPackage.CACHE_ACTION:
				return createCacheActionFromString(eDataType, initialValue);
			case EsbPackage.CACHE_SCOPE:
				return createCacheScopeFromString(eDataType, initialValue);
			case EsbPackage.XQUERY_VARIABLE_TYPE:
				return createXQueryVariableTypeFromString(eDataType, initialValue);
			case EsbPackage.XQUERY_VARIABLE_VALUE_TYPE:
				return createXQueryVariableValueTypeFromString(eDataType, initialValue);
			case EsbPackage.CALLOUT_PAYLOAD_TYPE:
				return createCalloutPayloadTypeFromString(eDataType, initialValue);
			case EsbPackage.CALLOUT_RESULT_TYPE:
				return createCalloutResultTypeFromString(eDataType, initialValue);
			case EsbPackage.RM_SPEC_VERSION:
				return createRMSpecVersionFromString(eDataType, initialValue);
			case EsbPackage.RM_SEQUENCE_TYPE:
				return createRMSequenceTypeFromString(eDataType, initialValue);
			case EsbPackage.TRANSACTION_ACTION:
				return createTransactionActionFromString(eDataType, initialValue);
			case EsbPackage.HEADER_ACTION:
				return createHeaderActionFromString(eDataType, initialValue);
			case EsbPackage.HEADER_VALUE_TYPE:
				return createHeaderValueTypeFromString(eDataType, initialValue);
			case EsbPackage.THROTTLE_POLICY_TYPE:
				return createThrottlePolicyTypeFromString(eDataType, initialValue);
			case EsbPackage.THROTTLE_CONDITION_TYPE:
				return createThrottleConditionTypeFromString(eDataType, initialValue);
			case EsbPackage.THROTTLE_ACCESS_TYPE:
				return createThrottleAccessTypeFromString(eDataType, initialValue);
			case EsbPackage.THROTTLE_SEQUENCE_TYPE:
				return createThrottleSequenceTypeFromString(eDataType, initialValue);
			case EsbPackage.COMMAND_PROPERTY_VALUE_TYPE:
				return createCommandPropertyValueTypeFromString(eDataType, initialValue);
			case EsbPackage.COMMAND_PROPERTY_MESSAGE_ACTION:
				return createCommandPropertyMessageActionFromString(eDataType, initialValue);
			case EsbPackage.COMMAND_PROPERTY_CONTEXT_ACTION:
				return createCommandPropertyContextActionFromString(eDataType, initialValue);
			case EsbPackage.SQL_EXECUTOR_CONNECTION_TYPE:
				return createSqlExecutorConnectionTypeFromString(eDataType, initialValue);
			case EsbPackage.SQL_EXECUTOR_DATASOURCE_TYPE:
				return createSqlExecutorDatasourceTypeFromString(eDataType, initialValue);
			case EsbPackage.SQL_EXECUTOR_BOOLEAN_VALUE:
				return createSqlExecutorBooleanValueFromString(eDataType, initialValue);
			case EsbPackage.SQL_EXECUTOR_ISOLATION_LEVEL:
				return createSqlExecutorIsolationLevelFromString(eDataType, initialValue);
			case EsbPackage.SQL_PARAMETER_VALUE_TYPE:
				return createSqlParameterValueTypeFromString(eDataType, initialValue);
			case EsbPackage.SQL_PARAMETER_DATA_TYPE:
				return createSqlParameterDataTypeFromString(eDataType, initialValue);
			case EsbPackage.RULE_SOURCE_TYPE:
				return createRuleSourceTypeFromString(eDataType, initialValue);
			case EsbPackage.RULE_FACT_TYPE:
				return createRuleFactTypeFromString(eDataType, initialValue);
			case EsbPackage.RULE_FACT_VALUE_TYPE:
				return createRuleFactValueTypeFromString(eDataType, initialValue);
			case EsbPackage.RULE_RESULT_TYPE:
				return createRuleResultTypeFromString(eDataType, initialValue);
			case EsbPackage.RULE_RESULT_VALUE_TYPE:
				return createRuleResultValueTypeFromString(eDataType, initialValue);
			case EsbPackage.SMOOKS_IO_DATA_TYPE:
				return createSmooksIODataTypeFromString(eDataType, initialValue);
			case EsbPackage.EXPRESSION_ACTION:
				return createExpressionActionFromString(eDataType, initialValue);
			case EsbPackage.OUTPUT_METHOD:
				return createOutputMethodFromString(eDataType, initialValue);
			case EsbPackage.RECEIVING_SEQUENCE_TYPE:
				return createReceivingSequenceTypeFromString(eDataType, initialValue);
			case EsbPackage.KEY_TYPE:
				return createKeyTypeFromString(eDataType, initialValue);
			case EsbPackage.TYPE:
				return createTypeFromString(eDataType, initialValue);
			case EsbPackage.LOCAL_ENTRY_VALUE_TYPE:
				return createLocalEntryValueTypeFromString(eDataType, initialValue);
			case EsbPackage.MAP:
				return createMapFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case EsbPackage.PROXY_WSDL_TYPE:
				return convertProxyWsdlTypeToString(eDataType, instanceValue);
			case EsbPackage.FILTER_CONDITION_TYPE:
				return convertFilterConditionTypeToString(eDataType, instanceValue);
			case EsbPackage.LOG_CATEGORY:
				return convertLogCategoryToString(eDataType, instanceValue);
			case EsbPackage.LOG_LEVEL:
				return convertLogLevelToString(eDataType, instanceValue);
			case EsbPackage.END_POINT_ADDRESSING_VERSION:
				return convertEndPointAddressingVersionToString(eDataType, instanceValue);
			case EsbPackage.END_POINT_TIME_OUT_ACTION:
				return convertEndPointTimeOutActionToString(eDataType, instanceValue);
			case EsbPackage.END_POINT_MESSAGE_FORMAT:
				return convertEndPointMessageFormatToString(eDataType, instanceValue);
			case EsbPackage.END_POINT_ATTACHMENT_OPTIMIZATION:
				return convertEndPointAttachmentOptimizationToString(eDataType, instanceValue);
			case EsbPackage.PROPERTY_DATA_TYPE:
				return convertPropertyDataTypeToString(eDataType, instanceValue);
			case EsbPackage.PROPERTY_ACTION:
				return convertPropertyActionToString(eDataType, instanceValue);
			case EsbPackage.PROPERTY_SCOPE:
				return convertPropertyScopeToString(eDataType, instanceValue);
			case EsbPackage.PROPERTY_VALUE_TYPE:
				return convertPropertyValueTypeToString(eDataType, instanceValue);
			case EsbPackage.ENRICH_SOURCE_TYPE:
				return convertEnrichSourceTypeToString(eDataType, instanceValue);
			case EsbPackage.ENRICH_TARGET_ACTION:
				return convertEnrichTargetActionToString(eDataType, instanceValue);
			case EsbPackage.ENRICH_TARGET_TYPE:
				return convertEnrichTargetTypeToString(eDataType, instanceValue);
			case EsbPackage.EVENT_TOPIC_TYPE:
				return convertEventTopicTypeToString(eDataType, instanceValue);
			case EsbPackage.SCRIPT_TYPE:
				return convertScriptTypeToString(eDataType, instanceValue);
			case EsbPackage.SCRIPT_LANGUAGE:
				return convertScriptLanguageToString(eDataType, instanceValue);
			case EsbPackage.FAULT_SOAP_VERSION:
				return convertFaultSoapVersionToString(eDataType, instanceValue);
			case EsbPackage.FAULT_CODE_SOAP11:
				return convertFaultCodeSoap11ToString(eDataType, instanceValue);
			case EsbPackage.FAULT_CODE_SOAP12:
				return convertFaultCodeSoap12ToString(eDataType, instanceValue);
			case EsbPackage.FAULT_STRING_TYPE:
				return convertFaultStringTypeToString(eDataType, instanceValue);
			case EsbPackage.FAULT_REASON_TYPE:
				return convertFaultReasonTypeToString(eDataType, instanceValue);
			case EsbPackage.FAULT_DETAIL_TYPE:
				return convertFaultDetailTypeToString(eDataType, instanceValue);
			case EsbPackage.AGGREGATE_SEQUENCE_TYPE:
				return convertAggregateSequenceTypeToString(eDataType, instanceValue);
			case EsbPackage.TARGET_SEQUENCE_TYPE:
				return convertTargetSequenceTypeToString(eDataType, instanceValue);
			case EsbPackage.TARGET_ENDPOINT_TYPE:
				return convertTargetEndpointTypeToString(eDataType, instanceValue);
			case EsbPackage.CACHE_SEQUENCE_TYPE:
				return convertCacheSequenceTypeToString(eDataType, instanceValue);
			case EsbPackage.CACHE_IMPLEMENTATION_TYPE:
				return convertCacheImplementationTypeToString(eDataType, instanceValue);
			case EsbPackage.CACHE_ACTION:
				return convertCacheActionToString(eDataType, instanceValue);
			case EsbPackage.CACHE_SCOPE:
				return convertCacheScopeToString(eDataType, instanceValue);
			case EsbPackage.XQUERY_VARIABLE_TYPE:
				return convertXQueryVariableTypeToString(eDataType, instanceValue);
			case EsbPackage.XQUERY_VARIABLE_VALUE_TYPE:
				return convertXQueryVariableValueTypeToString(eDataType, instanceValue);
			case EsbPackage.CALLOUT_PAYLOAD_TYPE:
				return convertCalloutPayloadTypeToString(eDataType, instanceValue);
			case EsbPackage.CALLOUT_RESULT_TYPE:
				return convertCalloutResultTypeToString(eDataType, instanceValue);
			case EsbPackage.RM_SPEC_VERSION:
				return convertRMSpecVersionToString(eDataType, instanceValue);
			case EsbPackage.RM_SEQUENCE_TYPE:
				return convertRMSequenceTypeToString(eDataType, instanceValue);
			case EsbPackage.TRANSACTION_ACTION:
				return convertTransactionActionToString(eDataType, instanceValue);
			case EsbPackage.HEADER_ACTION:
				return convertHeaderActionToString(eDataType, instanceValue);
			case EsbPackage.HEADER_VALUE_TYPE:
				return convertHeaderValueTypeToString(eDataType, instanceValue);
			case EsbPackage.THROTTLE_POLICY_TYPE:
				return convertThrottlePolicyTypeToString(eDataType, instanceValue);
			case EsbPackage.THROTTLE_CONDITION_TYPE:
				return convertThrottleConditionTypeToString(eDataType, instanceValue);
			case EsbPackage.THROTTLE_ACCESS_TYPE:
				return convertThrottleAccessTypeToString(eDataType, instanceValue);
			case EsbPackage.THROTTLE_SEQUENCE_TYPE:
				return convertThrottleSequenceTypeToString(eDataType, instanceValue);
			case EsbPackage.COMMAND_PROPERTY_VALUE_TYPE:
				return convertCommandPropertyValueTypeToString(eDataType, instanceValue);
			case EsbPackage.COMMAND_PROPERTY_MESSAGE_ACTION:
				return convertCommandPropertyMessageActionToString(eDataType, instanceValue);
			case EsbPackage.COMMAND_PROPERTY_CONTEXT_ACTION:
				return convertCommandPropertyContextActionToString(eDataType, instanceValue);
			case EsbPackage.SQL_EXECUTOR_CONNECTION_TYPE:
				return convertSqlExecutorConnectionTypeToString(eDataType, instanceValue);
			case EsbPackage.SQL_EXECUTOR_DATASOURCE_TYPE:
				return convertSqlExecutorDatasourceTypeToString(eDataType, instanceValue);
			case EsbPackage.SQL_EXECUTOR_BOOLEAN_VALUE:
				return convertSqlExecutorBooleanValueToString(eDataType, instanceValue);
			case EsbPackage.SQL_EXECUTOR_ISOLATION_LEVEL:
				return convertSqlExecutorIsolationLevelToString(eDataType, instanceValue);
			case EsbPackage.SQL_PARAMETER_VALUE_TYPE:
				return convertSqlParameterValueTypeToString(eDataType, instanceValue);
			case EsbPackage.SQL_PARAMETER_DATA_TYPE:
				return convertSqlParameterDataTypeToString(eDataType, instanceValue);
			case EsbPackage.RULE_SOURCE_TYPE:
				return convertRuleSourceTypeToString(eDataType, instanceValue);
			case EsbPackage.RULE_FACT_TYPE:
				return convertRuleFactTypeToString(eDataType, instanceValue);
			case EsbPackage.RULE_FACT_VALUE_TYPE:
				return convertRuleFactValueTypeToString(eDataType, instanceValue);
			case EsbPackage.RULE_RESULT_TYPE:
				return convertRuleResultTypeToString(eDataType, instanceValue);
			case EsbPackage.RULE_RESULT_VALUE_TYPE:
				return convertRuleResultValueTypeToString(eDataType, instanceValue);
			case EsbPackage.SMOOKS_IO_DATA_TYPE:
				return convertSmooksIODataTypeToString(eDataType, instanceValue);
			case EsbPackage.EXPRESSION_ACTION:
				return convertExpressionActionToString(eDataType, instanceValue);
			case EsbPackage.OUTPUT_METHOD:
				return convertOutputMethodToString(eDataType, instanceValue);
			case EsbPackage.RECEIVING_SEQUENCE_TYPE:
				return convertReceivingSequenceTypeToString(eDataType, instanceValue);
			case EsbPackage.KEY_TYPE:
				return convertKeyTypeToString(eDataType, instanceValue);
			case EsbPackage.TYPE:
				return convertTypeToString(eDataType, instanceValue);
			case EsbPackage.LOCAL_ENTRY_VALUE_TYPE:
				return convertLocalEntryValueTypeToString(eDataType, instanceValue);
			case EsbPackage.MAP:
				return convertMapToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EsbDiagram createEsbDiagram() {
		EsbDiagramImpl esbDiagram = new EsbDiagramImpl();
		EsbServerImpl esbServer = new EsbServerImpl();
		esbDiagram.setServer(esbServer);
		return esbDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EsbServer createEsbServer() {
		EsbServerImpl esbServer = new EsbServerImpl();
		return esbServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EsbLink createEsbLink() {
		EsbLinkImpl esbLink = new EsbLinkImpl();
		return esbLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ProxyService createProxyService() {
		proxyservicecount++;
		ProxyServiceImpl proxyService = new ProxyServiceImpl();
		proxyService.setOutputConnector(createProxyOutputConnector());
		proxyService.setInputConnector(createProxyInputConnector());
		proxyService.setSequenceContainer(createProxyServiceSequenceContainer());
		proxyService.setEndpointContainer(createProxyServiceEndpointContainer());
		proxyService.setName("proxy" +proxyservicecount);
		return proxyService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProxyOutputConnector createProxyOutputConnector() {
		ProxyOutputConnectorImpl proxyOutputConnector = new ProxyOutputConnectorImpl();
		return proxyOutputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProxyInputConnector createProxyInputConnector() {
		ProxyInputConnectorImpl proxyInputConnector = new ProxyInputConnectorImpl();
		return proxyInputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProxyServiceParameter createProxyServiceParameter() {
		ProxyServiceParameterImpl proxyServiceParameter = new ProxyServiceParameterImpl();
		return proxyServiceParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProxyServicePolicy createProxyServicePolicy() {
		ProxyServicePolicyImpl proxyServicePolicy = new ProxyServicePolicyImpl();
		return proxyServicePolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProxyServiceInSequence createProxyServiceInSequence() {
		ProxyServiceInSequenceImpl proxyServiceInSequence = new ProxyServiceInSequenceImpl();
		return proxyServiceInSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProxyServiceOutSequence createProxyServiceOutSequence() {
		ProxyServiceOutSequenceImpl proxyServiceOutSequence = new ProxyServiceOutSequenceImpl();
		return proxyServiceOutSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ProxyServiceSequenceContainer createProxyServiceSequenceContainer() {
		ProxyServiceSequenceContainerImpl proxyServiceSequenceContainer = new ProxyServiceSequenceContainerImpl();
		proxyServiceSequenceContainer.setInSequence(createProxyServiceInSequence());
		proxyServiceSequenceContainer.setOutSequence(createProxyServiceOutSequence());
		return proxyServiceSequenceContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProxyServiceEndpointContainer createProxyServiceEndpointContainer() {
		ProxyServiceEndpointContainerImpl proxyServiceEndpointContainer = new ProxyServiceEndpointContainerImpl();
		return proxyServiceEndpointContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public MessageMediator createMessageMediator() {
		MessageMediatorImpl messageMediator = new MessageMediatorImpl();
		messageMediator.setInputConnector(createMessageInputConnector());
		messageMediator.setOutputConnector(createMessageOutputConnector());
		return messageMediator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageInputConnector createMessageInputConnector() {
		MessageInputConnectorImpl messageInputConnector = new MessageInputConnectorImpl();
		return messageInputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageOutputConnector createMessageOutputConnector() {
		MessageOutputConnectorImpl messageOutputConnector = new MessageOutputConnectorImpl();
		return messageOutputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public DefaultEndPoint createDefaultEndPoint() {
		DefaultEndPointImpl defaultEndPoint = new DefaultEndPointImpl();
		defaultEndPoint.setInputConnector(createDefaultEndPointInputConnector());
		defaultEndPoint.setOutputConnector(createDefaultEndPointOutputConnector());
		return defaultEndPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultEndPointInputConnector createDefaultEndPointInputConnector() {
		DefaultEndPointInputConnectorImpl defaultEndPointInputConnector = new DefaultEndPointInputConnectorImpl();
		return defaultEndPointInputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultEndPointOutputConnector createDefaultEndPointOutputConnector() {
		DefaultEndPointOutputConnectorImpl defaultEndPointOutputConnector = new DefaultEndPointOutputConnectorImpl();
		return defaultEndPointOutputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public DropMediator createDropMediator() {
		DropMediatorImpl dropMediator = new DropMediatorImpl();
		dropMediator.setInputConnector(createDropMediatorInputConnector());
		return dropMediator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DropMediatorInputConnector createDropMediatorInputConnector() {
		DropMediatorInputConnectorImpl dropMediatorInputConnector = new DropMediatorInputConnectorImpl();
		return dropMediatorInputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public FilterMediator createFilterMediator() {
		FilterMediatorImpl filterMediator = new FilterMediatorImpl();
		filterMediator.setInputConnector(createFilterMediatorInputConnector());
		filterMediator.setPassOutputConnector(createFilterMediatorPassOutputConnector());
		filterMediator.setFailOutputConnector(createFilterMediatorFailOutputConnector());
		return filterMediator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterMediatorInputConnector createFilterMediatorInputConnector() {
		FilterMediatorInputConnectorImpl filterMediatorInputConnector = new FilterMediatorInputConnectorImpl();
		return filterMediatorInputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterMediatorPassOutputConnector createFilterMediatorPassOutputConnector() {
		FilterMediatorPassOutputConnectorImpl filterMediatorPassOutputConnector = new FilterMediatorPassOutputConnectorImpl();
		return filterMediatorPassOutputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterMediatorFailOutputConnector createFilterMediatorFailOutputConnector() {
		FilterMediatorFailOutputConnectorImpl filterMediatorFailOutputConnector = new FilterMediatorFailOutputConnectorImpl();
		return filterMediatorFailOutputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public MergeNode createMergeNode() {
		MergeNodeImpl mergeNode = new MergeNodeImpl();
		mergeNode.setFirstInputConnector(createMergeNodeFirstInputConnector());
		mergeNode.setSecondInputConnector(createMergeNodeSecondInputConnector());
		mergeNode.setOutputConnector(createMergeNodeOutputConnector());
		return mergeNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MergeNodeFirstInputConnector createMergeNodeFirstInputConnector() {
		MergeNodeFirstInputConnectorImpl mergeNodeFirstInputConnector = new MergeNodeFirstInputConnectorImpl();
		return mergeNodeFirstInputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MergeNodeSecondInputConnector createMergeNodeSecondInputConnector() {
		MergeNodeSecondInputConnectorImpl mergeNodeSecondInputConnector = new MergeNodeSecondInputConnectorImpl();
		return mergeNodeSecondInputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MergeNodeOutputConnector createMergeNodeOutputConnector() {
		MergeNodeOutputConnectorImpl mergeNodeOutputConnector = new MergeNodeOutputConnectorImpl();
		return mergeNodeOutputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public LogMediator createLogMediator() {
		LogMediatorImpl logMediator = new LogMediatorImpl();
		logMediator.setInputConnector(createLogMediatorInputConnector());
		logMediator.setOutputConnector(createLogMediatorOutputConnector());
		return logMediator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogMediatorInputConnector createLogMediatorInputConnector() {
		LogMediatorInputConnectorImpl logMediatorInputConnector = new LogMediatorInputConnectorImpl();
		return logMediatorInputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogMediatorOutputConnector createLogMediatorOutputConnector() {
		LogMediatorOutputConnectorImpl logMediatorOutputConnector = new LogMediatorOutputConnectorImpl();
		return logMediatorOutputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public LogProperty createLogProperty() {
		LogPropertyImpl logProperty = new LogPropertyImpl();
		logProperty.setPropertyName("property_name");
		logProperty.setPropertyValue("property_value");
		return logProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public AddressEndPoint createAddressEndPoint() {
		AddressEndPointImpl addressEndPoint = new AddressEndPointImpl();
		addressEndPoint.setInputConnector(createAddressEndPointInputConnector());
		addressEndPoint.setOutputConnector(createAddressEndPointOutputConnector());
		return addressEndPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressEndPointInputConnector createAddressEndPointInputConnector() {
		AddressEndPointInputConnectorImpl addressEndPointInputConnector = new AddressEndPointInputConnectorImpl();
		return addressEndPointInputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressEndPointOutputConnector createAddressEndPointOutputConnector() {
		AddressEndPointOutputConnectorImpl addressEndPointOutputConnector = new AddressEndPointOutputConnectorImpl();
		return addressEndPointOutputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistryKeyProperty createRegistryKeyProperty() {
		RegistryKeyPropertyImpl registryKeyProperty = new RegistryKeyPropertyImpl();
		return registryKeyProperty;
	}
	
	public RegistryKeyProperty copyRegistryKeyProperty(
			RegistryKeyProperty registryKeyProperty) {
		RegistryKeyProperty copy = createRegistryKeyProperty();
		copy.setPrettyName(registryKeyProperty.getPrettyName());
		copy.setKeyName(registryKeyProperty.getKeyName());
		copy.setKeyValue(registryKeyProperty.getKeyValue());
		copy.setFilters(registryKeyProperty.getFilters());
		return copy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public PropertyMediator createPropertyMediator() {
		PropertyMediatorImpl propertyMediator = new PropertyMediatorImpl();
		propertyMediator.setInputConnector(createPropertyMediatorInputConnector());
		propertyMediator.setOutputConnector(createPropertyMediatorOutputConnector());
		return propertyMediator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyMediatorInputConnector createPropertyMediatorInputConnector() {
		PropertyMediatorInputConnectorImpl propertyMediatorInputConnector = new PropertyMediatorInputConnectorImpl();
		return propertyMediatorInputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyMediatorOutputConnector createPropertyMediatorOutputConnector() {
		PropertyMediatorOutputConnectorImpl propertyMediatorOutputConnector = new PropertyMediatorOutputConnectorImpl();
		return propertyMediatorOutputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamespacedProperty createNamespacedProperty() {
		NamespacedPropertyImpl namespacedProperty = new NamespacedPropertyImpl();
		return namespacedProperty;
	}
	
	/**
	 * {@inheritDoc}
	 */
	public NamespacedProperty copyNamespacedProperty(
			NamespacedProperty namespacedProperty) {
		NamespacedProperty copy = createNamespacedProperty();
		copy.setPrettyName(namespacedProperty.getPrettyName());
		copy.setPropertyName(namespacedProperty.getPropertyName());
		copy.setPropertyValue(namespacedProperty.getPropertyValue());
		copy.getNamespaces().putAll(namespacedProperty.getNamespaces());
		return copy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EnrichMediator createEnrichMediator() {
		EnrichMediatorImpl enrichMediator = new EnrichMediatorImpl();
		enrichMediator.setInputConnector(createEnrichMediatorInputConnector());
		enrichMediator.setOutputConnector(createEnrichMediatorOutputConnector());
		return enrichMediator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnrichMediatorInputConnector createEnrichMediatorInputConnector() {
		EnrichMediatorInputConnectorImpl enrichMediatorInputConnector = new EnrichMediatorInputConnectorImpl();
		return enrichMediatorInputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnrichMediatorOutputConnector createEnrichMediatorOutputConnector() {
		EnrichMediatorOutputConnectorImpl enrichMediatorOutputConnector = new EnrichMediatorOutputConnectorImpl();
		return enrichMediatorOutputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public XSLTMediator createXSLTMediator() {
		XSLTMediatorImpl xsltMediator = new XSLTMediatorImpl();
		xsltMediator.setInputConnector(createXSLTMediatorInputConnector());
		xsltMediator.setOutputConnector(createXSLTMediatorOutputConnector());
		return xsltMediator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSLTProperty createXSLTProperty() {
		XSLTPropertyImpl xsltProperty = new XSLTPropertyImpl();
		return xsltProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSLTFeature createXSLTFeature() {
		XSLTFeatureImpl xsltFeature = new XSLTFeatureImpl();
		return xsltFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSLTResource createXSLTResource() {
		XSLTResourceImpl xsltResource = new XSLTResourceImpl();
		return xsltResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSLTMediatorInputConnector createXSLTMediatorInputConnector() {
		XSLTMediatorInputConnectorImpl xsltMediatorInputConnector = new XSLTMediatorInputConnectorImpl();
		return xsltMediatorInputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSLTMediatorOutputConnector createXSLTMediatorOutputConnector() {
		XSLTMediatorOutputConnectorImpl xsltMediatorOutputConnector = new XSLTMediatorOutputConnectorImpl();
		return xsltMediatorOutputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public SwitchMediator createSwitchMediator() {
		SwitchMediatorImpl switchMediator = new SwitchMediatorImpl();
		switchMediator.setInputConnector(createSwitchMediatorInputConnector());
		switchMediator.setDefaultBranch(createSwitchDefaultBranchOutputConnector());
		//switchMediator.getCaseBranches().add(createSwitchCaseBranchOutputConnector());
		return switchMediator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchCaseBranchOutputConnector createSwitchCaseBranchOutputConnector() {
		SwitchCaseBranchOutputConnectorImpl switchCaseBranchOutputConnector = new SwitchCaseBranchOutputConnectorImpl();
		return switchCaseBranchOutputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchDefaultBranchOutputConnector createSwitchDefaultBranchOutputConnector() {
		SwitchDefaultBranchOutputConnectorImpl switchDefaultBranchOutputConnector = new SwitchDefaultBranchOutputConnectorImpl();
		return switchDefaultBranchOutputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchMediatorInputConnector createSwitchMediatorInputConnector() {
		SwitchMediatorInputConnectorImpl switchMediatorInputConnector = new SwitchMediatorInputConnectorImpl();
		return switchMediatorInputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceDiagram createSequenceDiagram() {
		SequenceDiagramImpl sequenceDiagram = new SequenceDiagramImpl();
		return sequenceDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EsbSequence createEsbSequence() {
		EsbSequenceImpl esbSequence = new EsbSequenceImpl();
		esbSequence.setInput(createEsbSequenceInputConnector());
		esbSequence.setOutput(createEsbSequenceOutputConnector());
		return esbSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EsbSequenceInput createEsbSequenceInput() {
		EsbSequenceInputImpl esbSequenceInput = new EsbSequenceInputImpl();
		return esbSequenceInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EsbSequenceOutput createEsbSequenceOutput() {
		EsbSequenceOutputImpl esbSequenceOutput = new EsbSequenceOutputImpl();
		return esbSequenceOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EsbSequenceInputConnector createEsbSequenceInputConnector() {
		EsbSequenceInputConnectorImpl esbSequenceInputConnector = new EsbSequenceInputConnectorImpl();
		return esbSequenceInputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EsbSequenceOutputConnector createEsbSequenceOutputConnector() {
		EsbSequenceOutputConnectorImpl esbSequenceOutputConnector = new EsbSequenceOutputConnectorImpl();
		return esbSequenceOutputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Sequence createSequence() {
		SequenceImpl sequence = new SequenceImpl();
		sequence.setInputConnector(createSequenceInputConnector());
		sequence.setOutputConnector(createSequenceOutputConnector());
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceInputConnector createSequenceInputConnector() {
		SequenceInputConnectorImpl sequenceInputConnector = new SequenceInputConnectorImpl();
		return sequenceInputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceOutputConnector createSequenceOutputConnector() {
		SequenceOutputConnectorImpl sequenceOutputConnector = new SequenceOutputConnectorImpl();
		return sequenceOutputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EventMediator createEventMediator() {
		EventMediatorImpl eventMediator = new EventMediatorImpl();
		eventMediator.setInputConnector(createEventMediatorInputConnector());
		eventMediator.setOutputConnector(createEventMediatorOutputConnector());
		return eventMediator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventMediatorInputConnector createEventMediatorInputConnector() {
		EventMediatorInputConnectorImpl eventMediatorInputConnector = new EventMediatorInputConnectorImpl();
		return eventMediatorInputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventMediatorOutputConnector createEventMediatorOutputConnector() {
		EventMediatorOutputConnectorImpl eventMediatorOutputConnector = new EventMediatorOutputConnectorImpl();
		return eventMediatorOutputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EntitlementMediator createEntitlementMediator() {
		EntitlementMediatorImpl entitlementMediator = new EntitlementMediatorImpl();
		entitlementMediator.setInputConnector(createEntitlementMediatorInputConnector());
		entitlementMediator.setOutputConnector(createEntitlementMediatorOutputConnector());
		return entitlementMediator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntitlementMediatorInputConnector createEntitlementMediatorInputConnector() {
		EntitlementMediatorInputConnectorImpl entitlementMediatorInputConnector = new EntitlementMediatorInputConnectorImpl();
		return entitlementMediatorInputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntitlementMediatorOutputConnector createEntitlementMediatorOutputConnector() {
		EntitlementMediatorOutputConnectorImpl entitlementMediatorOutputConnector = new EntitlementMediatorOutputConnectorImpl();
		return entitlementMediatorOutputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnqueueMediator createEnqueueMediator() {
		EnqueueMediatorImpl enqueueMediator = new EnqueueMediatorImpl();
		return enqueueMediator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ClassMediator createClassMediator() {
		ClassMediatorImpl classMediator = new ClassMediatorImpl();
		classMediator.setInputConnector(createClassMediatorInputConnector());
		classMediator.setOutputConnector(createClassMediatorOutputConnector());
		return classMediator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassMediatorInputConnector createClassMediatorInputConnector() {
		ClassMediatorInputConnectorImpl classMediatorInputConnector = new ClassMediatorInputConnectorImpl();
		return classMediatorInputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassMediatorOutputConnector createClassMediatorOutputConnector() {
		ClassMediatorOutputConnectorImpl classMediatorOutputConnector = new ClassMediatorOutputConnectorImpl();
		return classMediatorOutputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassProperty createClassProperty() {
		ClassPropertyImpl classProperty = new ClassPropertyImpl();
		return classProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public SpringMediator createSpringMediator() {
		SpringMediatorImpl springMediator = new SpringMediatorImpl();
		springMediator.setInputConnector(createSpringMediatorInputConnector());
		springMediator.setOutputConnector(createSpringMediatorOutputConnector());
		return springMediator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpringMediatorInputConnector createSpringMediatorInputConnector() {
		SpringMediatorInputConnectorImpl springMediatorInputConnector = new SpringMediatorInputConnectorImpl();
		return springMediatorInputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpringMediatorOutputConnector createSpringMediatorOutputConnector() {
		SpringMediatorOutputConnectorImpl springMediatorOutputConnector = new SpringMediatorOutputConnectorImpl();
		return springMediatorOutputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidateMediator createValidateMediator() {
		ValidateMediatorImpl validateMediator = new ValidateMediatorImpl();
		return validateMediator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidateOnFailBranch createValidateOnFailBranch() {
		ValidateOnFailBranchImpl validateOnFailBranch = new ValidateOnFailBranchImpl();
		return validateOnFailBranch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidateFeature createValidateFeature() {
		ValidateFeatureImpl validateFeature = new ValidateFeatureImpl();
		return validateFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidateSchema createValidateSchema() {
		ValidateSchemaImpl validateSchema = new ValidateSchemaImpl();
		return validateSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ScriptMediator createScriptMediator() {
		ScriptMediatorImpl scriptMediator = new ScriptMediatorImpl();
		scriptMediator.setInputConnector(createScriptMediatorInputConnector());
		scriptMediator.setOutputConnector(createScriptMediatorOutputConnector());
		return scriptMediator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScriptMediatorInputConnector createScriptMediatorInputConnector() {
		ScriptMediatorInputConnectorImpl scriptMediatorInputConnector = new ScriptMediatorInputConnectorImpl();
		return scriptMediatorInputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScriptMediatorOutputConnector createScriptMediatorOutputConnector() {
		ScriptMediatorOutputConnectorImpl scriptMediatorOutputConnector = new ScriptMediatorOutputConnectorImpl();
		return scriptMediatorOutputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public FaultMediator createFaultMediator() {
		FaultMediatorImpl faultMediator = new FaultMediatorImpl();
		faultMediator.setInputConnector(createFaultMediatorInputConnector());
		faultMediator.setOutputConnector(createFaultMediatorOutputConnector());
		return faultMediator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaultMediatorInputConnector createFaultMediatorInputConnector() {
		FaultMediatorInputConnectorImpl faultMediatorInputConnector = new FaultMediatorInputConnectorImpl();
		return faultMediatorInputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaultMediatorOutputConnector createFaultMediatorOutputConnector() {
		FaultMediatorOutputConnectorImpl faultMediatorOutputConnector = new FaultMediatorOutputConnectorImpl();
		return faultMediatorOutputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public AggregateMediator createAggregateMediator() {
		AggregateMediatorImpl aggregateMediator = new AggregateMediatorImpl();
		aggregateMediator.setInputConnector(createAggregateMediatorInputConnector());
		aggregateMediator.setOutputConnector(createAggregateMediatorOutputConnector());
		aggregateMediator.setOnCompleteOutputConnector(createAggregateMediatorOnCompleteOutputConnector());
		return aggregateMediator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregateMediatorInputConnector createAggregateMediatorInputConnector() {
		AggregateMediatorInputConnectorImpl aggregateMediatorInputConnector = new AggregateMediatorInputConnectorImpl();
		return aggregateMediatorInputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregateMediatorOutputConnector createAggregateMediatorOutputConnector() {
		AggregateMediatorOutputConnectorImpl aggregateMediatorOutputConnector = new AggregateMediatorOutputConnectorImpl();
		return aggregateMediatorOutputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregateMediatorOnCompleteOutputConnector createAggregateMediatorOnCompleteOutputConnector() {
		AggregateMediatorOnCompleteOutputConnectorImpl aggregateMediatorOnCompleteOutputConnector = new AggregateMediatorOnCompleteOutputConnectorImpl();
		return aggregateMediatorOnCompleteOutputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregateOnCompleteBranch createAggregateOnCompleteBranch() {
		AggregateOnCompleteBranchImpl aggregateOnCompleteBranch = new AggregateOnCompleteBranchImpl();
		return aggregateOnCompleteBranch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RouterMediator createRouterMediator() {
		RouterMediatorImpl routerMediator = new RouterMediatorImpl();
		return routerMediator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RouterRoute createRouterRoute() {
		RouterRouteImpl routerRoute = new RouterRouteImpl();
		return routerRoute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RouteTarget createRouteTarget() {
		RouteTargetImpl routeTarget = new RouteTargetImpl();
		return routeTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public CloneMediator createCloneMediator() {
		CloneMediatorImpl cloneMediator = new CloneMediatorImpl();
		cloneMediator.setInputConnector(createCloneMediatorInputConnector());
		cloneMediator.setOutputConnector(createCloneMediatorOutputConnector());
		return cloneMediator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloneMediatorInputConnector createCloneMediatorInputConnector() {
		CloneMediatorInputConnectorImpl cloneMediatorInputConnector = new CloneMediatorInputConnectorImpl();
		return cloneMediatorInputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloneMediatorOutputConnector createCloneMediatorOutputConnector() {
		CloneMediatorOutputConnectorImpl cloneMediatorOutputConnector = new CloneMediatorOutputConnectorImpl();
		return cloneMediatorOutputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloneMediatorTargetOutputConnector createCloneMediatorTargetOutputConnector() {
		CloneMediatorTargetOutputConnectorImpl cloneMediatorTargetOutputConnector = new CloneMediatorTargetOutputConnectorImpl();
		return cloneMediatorTargetOutputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public IterateMediator createIterateMediator() {
		IterateMediatorImpl iterateMediator = new IterateMediatorImpl();
		iterateMediator.setInputConnector(createIterateMediatorInputConnector());
		iterateMediator.setOutputConnector(createIterateMediatorOutputConnector());
		return iterateMediator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IterateMediatorInputConnector createIterateMediatorInputConnector() {
		IterateMediatorInputConnectorImpl iterateMediatorInputConnector = new IterateMediatorInputConnectorImpl();
		return iterateMediatorInputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IterateMediatorOutputConnector createIterateMediatorOutputConnector() {
		IterateMediatorOutputConnectorImpl iterateMediatorOutputConnector = new IterateMediatorOutputConnectorImpl();
		return iterateMediatorOutputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IterateTarget createIterateTarget() {
		IterateTargetImpl iterateTarget = new IterateTargetImpl();
		return iterateTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractCommonTarget createAbstractCommonTarget() {
		AbstractCommonTargetImpl abstractCommonTarget = new AbstractCommonTargetImpl();
		return abstractCommonTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MediatorSequence createMediatorSequence() {
		MediatorSequenceImpl mediatorSequence = new MediatorSequenceImpl();
		return mediatorSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public CacheMediator createCacheMediator() {
		CacheMediatorImpl cacheMediator = new CacheMediatorImpl();
		cacheMediator.setInputConnector(createCacheMediatorInputConnector());
		cacheMediator.setOutputConnector(createCacheMediatorOutputConnector());
		return cacheMediator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CacheMediatorInputConnector createCacheMediatorInputConnector() {
		CacheMediatorInputConnectorImpl cacheMediatorInputConnector = new CacheMediatorInputConnectorImpl();
		return cacheMediatorInputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CacheMediatorOutputConnector createCacheMediatorOutputConnector() {
		CacheMediatorOutputConnectorImpl cacheMediatorOutputConnector = new CacheMediatorOutputConnectorImpl();
		return cacheMediatorOutputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CacheOnHitBranch createCacheOnHitBranch() {
		CacheOnHitBranchImpl cacheOnHitBranch = new CacheOnHitBranchImpl();
		return cacheOnHitBranch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public XQueryMediator createXQueryMediator() {
		XQueryMediatorImpl xQueryMediator = new XQueryMediatorImpl();
		xQueryMediator.setInputConnector(createXQueryMediatorInputConnector());
		xQueryMediator.setOutputConnector(createXQueryMediatorOutputConnector());
		return xQueryMediator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XQueryMediatorInputConnector createXQueryMediatorInputConnector() {
		XQueryMediatorInputConnectorImpl xQueryMediatorInputConnector = new XQueryMediatorInputConnectorImpl();
		return xQueryMediatorInputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XQueryMediatorOutputConnector createXQueryMediatorOutputConnector() {
		XQueryMediatorOutputConnectorImpl xQueryMediatorOutputConnector = new XQueryMediatorOutputConnectorImpl();
		return xQueryMediatorOutputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XQueryVariable createXQueryVariable() {
		XQueryVariableImpl xQueryVariable = new XQueryVariableImpl();
		return xQueryVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public CalloutMediator createCalloutMediator() {
		CalloutMediatorImpl calloutMediator = new CalloutMediatorImpl();
		calloutMediator.setInputConnector(createCalloutMediatorInputConnector());
		calloutMediator.setOutputConnector(createCalloutMediatorOutputConnector());
		return calloutMediator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalloutMediatorInputConnector createCalloutMediatorInputConnector() {
		CalloutMediatorInputConnectorImpl calloutMediatorInputConnector = new CalloutMediatorInputConnectorImpl();
		return calloutMediatorInputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalloutMediatorOutputConnector createCalloutMediatorOutputConnector() {
		CalloutMediatorOutputConnectorImpl calloutMediatorOutputConnector = new CalloutMediatorOutputConnectorImpl();
		return calloutMediatorOutputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public RMSequenceMediator createRMSequenceMediator() {
		RMSequenceMediatorImpl rmSequenceMediator = new RMSequenceMediatorImpl();
		rmSequenceMediator.setInputConnector(createRMSequenceMediatorInputConnector());
		rmSequenceMediator.setOutputConnector(createRMSequenceMediatorOutputConnector());
		return rmSequenceMediator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RMSequenceMediatorInputConnector createRMSequenceMediatorInputConnector() {
		RMSequenceMediatorInputConnectorImpl rmSequenceMediatorInputConnector = new RMSequenceMediatorInputConnectorImpl();
		return rmSequenceMediatorInputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RMSequenceMediatorOutputConnector createRMSequenceMediatorOutputConnector() {
		RMSequenceMediatorOutputConnectorImpl rmSequenceMediatorOutputConnector = new RMSequenceMediatorOutputConnectorImpl();
		return rmSequenceMediatorOutputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public TransactionMediator createTransactionMediator() {
		TransactionMediatorImpl transactionMediator = new TransactionMediatorImpl();
		transactionMediator.setInputConnector(createTransactionMediatorInputConnector());
		transactionMediator.setOutputConnector(createTransactionMediatorOutputConnector());
		return transactionMediator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionMediatorInputConnector createTransactionMediatorInputConnector() {
		TransactionMediatorInputConnectorImpl transactionMediatorInputConnector = new TransactionMediatorInputConnectorImpl();
		return transactionMediatorInputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionMediatorOutputConnector createTransactionMediatorOutputConnector() {
		TransactionMediatorOutputConnectorImpl transactionMediatorOutputConnector = new TransactionMediatorOutputConnectorImpl();
		return transactionMediatorOutputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OAuthMediator createOAuthMediator() {
		OAuthMediatorImpl oAuthMediator = new OAuthMediatorImpl();
		oAuthMediator.setInputConnector(createOAuthMediatorInputConnector());
		oAuthMediator.setOutputConnector(createOAuthMediatorOutputConnector());
		return oAuthMediator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OAuthMediatorInputConnector createOAuthMediatorInputConnector() {
		OAuthMediatorInputConnectorImpl oAuthMediatorInputConnector = new OAuthMediatorInputConnectorImpl();
		return oAuthMediatorInputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OAuthMediatorOutputConnector createOAuthMediatorOutputConnector() {
		OAuthMediatorOutputConnectorImpl oAuthMediatorOutputConnector = new OAuthMediatorOutputConnectorImpl();
		return oAuthMediatorOutputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutoscaleInMediator createAutoscaleInMediator() {
		AutoscaleInMediatorImpl autoscaleInMediator = new AutoscaleInMediatorImpl();
		return autoscaleInMediator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutoscaleOutMediator createAutoscaleOutMediator() {
		AutoscaleOutMediatorImpl autoscaleOutMediator = new AutoscaleOutMediatorImpl();
		return autoscaleOutMediator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public HeaderMediator createHeaderMediator() {		
		HeaderMediatorImpl headerMediator = new HeaderMediatorImpl();
		headerMediator.setInputConnector(createHeaderMediatorInputConnector());
		headerMediator.setOutputConnector(createHeaderMediatorOutputConnector());
		return headerMediator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeaderMediatorInputConnector createHeaderMediatorInputConnector() {
		HeaderMediatorInputConnectorImpl headerMediatorInputConnector = new HeaderMediatorInputConnectorImpl();
		return headerMediatorInputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeaderMediatorOutputConnector createHeaderMediatorOutputConnector() {
		HeaderMediatorOutputConnectorImpl headerMediatorOutputConnector = new HeaderMediatorOutputConnectorImpl();
		return headerMediatorOutputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ThrottleMediator createThrottleMediator() {
		ThrottleMediatorImpl throttleMediator = new ThrottleMediatorImpl();
		throttleMediator.setInputConnector(createThrottleMediatorInputConnector());
		throttleMediator.setOutputConnector(createThrottleMediatorOutputConnector());
		return throttleMediator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThrottleMediatorInputConnector createThrottleMediatorInputConnector() {
		ThrottleMediatorInputConnectorImpl throttleMediatorInputConnector = new ThrottleMediatorInputConnectorImpl();
		return throttleMediatorInputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThrottleMediatorOutputConnector createThrottleMediatorOutputConnector() {
		ThrottleMediatorOutputConnectorImpl throttleMediatorOutputConnector = new ThrottleMediatorOutputConnectorImpl();
		return throttleMediatorOutputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThrottlePolicyConfiguration createThrottlePolicyConfiguration() {
		ThrottlePolicyConfigurationImpl throttlePolicyConfiguration = new ThrottlePolicyConfigurationImpl();
		return throttlePolicyConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThrottlePolicyEntry createThrottlePolicyEntry() {
		ThrottlePolicyEntryImpl throttlePolicyEntry = new ThrottlePolicyEntryImpl();
		return throttlePolicyEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThrottleOnAcceptBranch createThrottleOnAcceptBranch() {
		ThrottleOnAcceptBranchImpl throttleOnAcceptBranch = new ThrottleOnAcceptBranchImpl();
		return throttleOnAcceptBranch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThrottleOnRejectBranch createThrottleOnRejectBranch() {
		ThrottleOnRejectBranchImpl throttleOnRejectBranch = new ThrottleOnRejectBranchImpl();
		return throttleOnRejectBranch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public CommandMediator createCommandMediator() {
		CommandMediatorImpl commandMediator = new CommandMediatorImpl();
		commandMediator.setInputConnector(createCommandMediatorInputConnector());
		commandMediator.setOutputConnector(createCommandMediatorOutputConnector());
		return commandMediator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandMediatorInputConnector createCommandMediatorInputConnector() {
		CommandMediatorInputConnectorImpl commandMediatorInputConnector = new CommandMediatorInputConnectorImpl();
		return commandMediatorInputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandMediatorOutputConnector createCommandMediatorOutputConnector() {
		CommandMediatorOutputConnectorImpl commandMediatorOutputConnector = new CommandMediatorOutputConnectorImpl();
		return commandMediatorOutputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandProperty createCommandProperty() {
		CommandPropertyImpl commandProperty = new CommandPropertyImpl();
		return commandProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqlStatement createSqlStatement() {
		SqlStatementImpl sqlStatement = new SqlStatementImpl();
		return sqlStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqlParameterDefinition createSqlParameterDefinition() {
		SqlParameterDefinitionImpl sqlParameterDefinition = new SqlParameterDefinitionImpl();
		return sqlParameterDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqlResultMapping createSqlResultMapping() {
		SqlResultMappingImpl sqlResultMapping = new SqlResultMappingImpl();
		return sqlResultMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public DBLookupMediator createDBLookupMediator() {
		DBLookupMediatorImpl dbLookupMediator = new DBLookupMediatorImpl();
		dbLookupMediator.setInputConnector(createDBLookupMediatorInputConnector());
		dbLookupMediator.setOutputConnector(createDBLookupMediatorOutputConnector());
		return dbLookupMediator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DBLookupMediatorInputConnector createDBLookupMediatorInputConnector() {
		DBLookupMediatorInputConnectorImpl dbLookupMediatorInputConnector = new DBLookupMediatorInputConnectorImpl();
		return dbLookupMediatorInputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DBLookupMediatorOutputConnector createDBLookupMediatorOutputConnector() {
		DBLookupMediatorOutputConnectorImpl dbLookupMediatorOutputConnector = new DBLookupMediatorOutputConnectorImpl();
		return dbLookupMediatorOutputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public DBReportMediator createDBReportMediator() {
		DBReportMediatorImpl dbReportMediator = new DBReportMediatorImpl();
		dbReportMediator.setInputConnector(createDBReportMediatorInputConnector());
		dbReportMediator.setOutputConnector(createDBReportMediatorOutputConnector());
		return dbReportMediator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DBReportMediatorInputConnector createDBReportMediatorInputConnector() {
		DBReportMediatorInputConnectorImpl dbReportMediatorInputConnector = new DBReportMediatorInputConnectorImpl();
		return dbReportMediatorInputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DBReportMediatorOutputConnector createDBReportMediatorOutputConnector() {
		DBReportMediatorOutputConnectorImpl dbReportMediatorOutputConnector = new DBReportMediatorOutputConnectorImpl();
		return dbReportMediatorOutputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public RuleMediator createRuleMediator() {
		RuleMediatorImpl ruleMediator = new RuleMediatorImpl();
		ruleMediator.setInputConnector(createRuleMediatorInputConnector());
		ruleMediator.setOutputConnector(createRuleMediatorOutputConnector());
		return ruleMediator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleMediatorInputConnector createRuleMediatorInputConnector() {
		RuleMediatorInputConnectorImpl ruleMediatorInputConnector = new RuleMediatorInputConnectorImpl();
		return ruleMediatorInputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleMediatorOutputConnector createRuleMediatorOutputConnector() {
		RuleMediatorOutputConnectorImpl ruleMediatorOutputConnector = new RuleMediatorOutputConnectorImpl();
		return ruleMediatorOutputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleSetConfiguration createRuleSetConfiguration() {
		RuleSetConfigurationImpl ruleSetConfiguration = new RuleSetConfigurationImpl();
		return ruleSetConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleSetCreationProperty createRuleSetCreationProperty() {
		RuleSetCreationPropertyImpl ruleSetCreationProperty = new RuleSetCreationPropertyImpl();
		return ruleSetCreationProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleSessionConfiguration createRuleSessionConfiguration() {
		RuleSessionConfigurationImpl ruleSessionConfiguration = new RuleSessionConfigurationImpl();
		return ruleSessionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleSessionProperty createRuleSessionProperty() {
		RuleSessionPropertyImpl ruleSessionProperty = new RuleSessionPropertyImpl();
		return ruleSessionProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleFactsConfiguration createRuleFactsConfiguration() {
		RuleFactsConfigurationImpl ruleFactsConfiguration = new RuleFactsConfigurationImpl();
		return ruleFactsConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleFact createRuleFact() {
		RuleFactImpl ruleFact = new RuleFactImpl();
		return ruleFact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleResultsConfiguration createRuleResultsConfiguration() {
		RuleResultsConfigurationImpl ruleResultsConfiguration = new RuleResultsConfigurationImpl();
		return ruleResultsConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleResult createRuleResult() {
		RuleResultImpl ruleResult = new RuleResultImpl();
		return ruleResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleChildMediatorsConfiguration createRuleChildMediatorsConfiguration() {
		RuleChildMediatorsConfigurationImpl ruleChildMediatorsConfiguration = new RuleChildMediatorsConfigurationImpl();
		return ruleChildMediatorsConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public SmooksMediator createSmooksMediator() {
		SmooksMediatorImpl smooksMediator = new SmooksMediatorImpl();
		smooksMediator.setInputConnector(createSmooksMediatorInputConnector());
		smooksMediator.setOutputConnector(createSmooksMediatorOutputConnector());
		return smooksMediator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmooksMediatorInputConnector createSmooksMediatorInputConnector() {
		SmooksMediatorInputConnectorImpl smooksMediatorInputConnector = new SmooksMediatorInputConnectorImpl();
		return smooksMediatorInputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmooksMediatorOutputConnector createSmooksMediatorOutputConnector() {
		SmooksMediatorOutputConnectorImpl smooksMediatorOutputConnector = new SmooksMediatorOutputConnectorImpl();
		return smooksMediatorOutputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmooksInConfiguration createSmooksInConfiguration() {
		SmooksInConfigurationImpl smooksInConfiguration = new SmooksInConfigurationImpl();
		return smooksInConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmooksOutConfiguration createSmooksOutConfiguration() {
		SmooksOutConfigurationImpl smooksOutConfiguration = new SmooksOutConfigurationImpl();
		return smooksOutConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StoreMediator createStoreMediator() {
		StoreMediatorImpl storeMediator = new StoreMediatorImpl();
		return storeMediator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalRouteBranch createConditionalRouteBranch() {
		ConditionalRouteBranchImpl conditionalRouteBranch = new ConditionalRouteBranchImpl();
		return conditionalRouteBranch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalRouterMediator createConditionalRouterMediator() {
		ConditionalRouterMediatorImpl conditionalRouterMediator = new ConditionalRouterMediatorImpl();
		return conditionalRouterMediator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public SendMediator createSendMediator() {
		SendMediatorImpl sendMediator = new SendMediatorImpl();
		sendMediator.setInputConnector(createSendMediatorInputConnector());
		sendMediator.setOutputConnector(createSendMediatorOutputConnector());
		return sendMediator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SendMediatorInputConnector createSendMediatorInputConnector() {
		SendMediatorInputConnectorImpl sendMediatorInputConnector = new SendMediatorInputConnectorImpl();
		return sendMediatorInputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SendMediatorOutputConnector createSendMediatorOutputConnector() {
		SendMediatorOutputConnectorImpl sendMediatorOutputConnector = new SendMediatorOutputConnectorImpl();
		return sendMediatorOutputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public FailoverEndPoint createFailoverEndPoint() {
		FailoverEndPointImpl failoverEndPoint = new FailoverEndPointImpl();
		failoverEndPoint.setInputConnector(createFailoverEndPointInputConnector());
		failoverEndPoint.setWestOutputConnector(createFailoverEndPointWestOutputConnector());
		//failoverEndPoint.getOutputConnector().add(createFailoverEndPointOutputConnector());
		return failoverEndPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailoverEndPointInputConnector createFailoverEndPointInputConnector() {
		FailoverEndPointInputConnectorImpl failoverEndPointInputConnector = new FailoverEndPointInputConnectorImpl();
		return failoverEndPointInputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailoverEndPointOutputConnector createFailoverEndPointOutputConnector() {
		FailoverEndPointOutputConnectorImpl failoverEndPointOutputConnector = new FailoverEndPointOutputConnectorImpl();
		return failoverEndPointOutputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailoverEndPointWestOutputConnector createFailoverEndPointWestOutputConnector() {
		FailoverEndPointWestOutputConnectorImpl failoverEndPointWestOutputConnector = new FailoverEndPointWestOutputConnectorImpl();
		return failoverEndPointWestOutputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParentEndPoint createParentEndPoint() {
		ParentEndPointImpl parentEndPoint = new ParentEndPointImpl();
		return parentEndPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public WSDLEndPoint createWSDLEndPoint() {
		WSDLEndPointImpl wsdlEndPoint = new WSDLEndPointImpl();
		wsdlEndPoint.setInputConnector(createWSDLEndPointInputConnector());
		wsdlEndPoint.setOutputConnector(createWSDLEndPointOutputConnector());
		return wsdlEndPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WSDLDefinition createWSDLDefinition() {
		WSDLDefinitionImpl wsdlDefinition = new WSDLDefinitionImpl();
		return wsdlDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WSDLDescription createWSDLDescription() {
		WSDLDescriptionImpl wsdlDescription = new WSDLDescriptionImpl();
		return wsdlDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WSDLEndPointInputConnector createWSDLEndPointInputConnector() {
		WSDLEndPointInputConnectorImpl wsdlEndPointInputConnector = new WSDLEndPointInputConnectorImpl();
		return wsdlEndPointInputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WSDLEndPointOutputConnector createWSDLEndPointOutputConnector() {
		WSDLEndPointOutputConnectorImpl wsdlEndPointOutputConnector = new WSDLEndPointOutputConnectorImpl();
		return wsdlEndPointOutputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public LoadBalanceEndPoint createLoadBalanceEndPoint() {
		LoadBalanceEndPointImpl loadBalanceEndPoint = new LoadBalanceEndPointImpl();		
		loadBalanceEndPoint.setInputConnector(createLoadBalanceEndPointInputConnector());
		loadBalanceEndPoint.setWestOutputConnector(createLoadBalanceEndPointWestOutputConnector());
		//loadBalanceEndPoint.getOutputConnector().add(createLoadBalanceEndPointOutputConnector());		
		return loadBalanceEndPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadBalanceEndPointInputConnector createLoadBalanceEndPointInputConnector() {
		LoadBalanceEndPointInputConnectorImpl loadBalanceEndPointInputConnector = new LoadBalanceEndPointInputConnectorImpl();
		return loadBalanceEndPointInputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadBalanceEndPointOutputConnector createLoadBalanceEndPointOutputConnector() {
		LoadBalanceEndPointOutputConnectorImpl loadBalanceEndPointOutputConnector = new LoadBalanceEndPointOutputConnectorImpl();
		return loadBalanceEndPointOutputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadBalanceEndPointWestOutputConnector createLoadBalanceEndPointWestOutputConnector() {
		LoadBalanceEndPointWestOutputConnectorImpl loadBalanceEndPointWestOutputConnector = new LoadBalanceEndPointWestOutputConnectorImpl();
		return loadBalanceEndPointWestOutputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalEntry createLocalEntry() {
		LocalEntryImpl localEntry = new LocalEntryImpl();
		return localEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Session createSession() {
		SessionImpl session = new SessionImpl();
		return session;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProxyWsdlType createProxyWsdlTypeFromString(EDataType eDataType, String initialValue) {
		ProxyWsdlType result = ProxyWsdlType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProxyWsdlTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterConditionType createFilterConditionTypeFromString(EDataType eDataType, String initialValue) {
		FilterConditionType result = FilterConditionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFilterConditionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogCategory createLogCategoryFromString(EDataType eDataType, String initialValue) {
		LogCategory result = LogCategory.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLogCategoryToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogLevel createLogLevelFromString(EDataType eDataType, String initialValue) {
		LogLevel result = LogLevel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLogLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndPointAddressingVersion createEndPointAddressingVersionFromString(EDataType eDataType, String initialValue) {
		EndPointAddressingVersion result = EndPointAddressingVersion.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEndPointAddressingVersionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndPointTimeOutAction createEndPointTimeOutActionFromString(EDataType eDataType, String initialValue) {
		EndPointTimeOutAction result = EndPointTimeOutAction.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEndPointTimeOutActionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndPointMessageFormat createEndPointMessageFormatFromString(EDataType eDataType, String initialValue) {
		EndPointMessageFormat result = EndPointMessageFormat.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEndPointMessageFormatToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndPointAttachmentOptimization createEndPointAttachmentOptimizationFromString(EDataType eDataType, String initialValue) {
		EndPointAttachmentOptimization result = EndPointAttachmentOptimization.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEndPointAttachmentOptimizationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyDataType createPropertyDataTypeFromString(EDataType eDataType, String initialValue) {
		PropertyDataType result = PropertyDataType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPropertyDataTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyAction createPropertyActionFromString(EDataType eDataType, String initialValue) {
		PropertyAction result = PropertyAction.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPropertyActionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyScope createPropertyScopeFromString(EDataType eDataType, String initialValue) {
		PropertyScope result = PropertyScope.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPropertyScopeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyValueType createPropertyValueTypeFromString(EDataType eDataType, String initialValue) {
		PropertyValueType result = PropertyValueType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPropertyValueTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnrichSourceType createEnrichSourceTypeFromString(EDataType eDataType, String initialValue) {
		EnrichSourceType result = EnrichSourceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnrichSourceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnrichTargetAction createEnrichTargetActionFromString(EDataType eDataType, String initialValue) {
		EnrichTargetAction result = EnrichTargetAction.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnrichTargetActionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnrichTargetType createEnrichTargetTypeFromString(EDataType eDataType, String initialValue) {
		EnrichTargetType result = EnrichTargetType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnrichTargetTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventTopicType createEventTopicTypeFromString(EDataType eDataType, String initialValue) {
		EventTopicType result = EventTopicType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEventTopicTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScriptType createScriptTypeFromString(EDataType eDataType, String initialValue) {
		ScriptType result = ScriptType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScriptTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScriptLanguage createScriptLanguageFromString(EDataType eDataType, String initialValue) {
		ScriptLanguage result = ScriptLanguage.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScriptLanguageToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaultSoapVersion createFaultSoapVersionFromString(EDataType eDataType, String initialValue) {
		FaultSoapVersion result = FaultSoapVersion.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFaultSoapVersionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaultCodeSoap11 createFaultCodeSoap11FromString(EDataType eDataType, String initialValue) {
		FaultCodeSoap11 result = FaultCodeSoap11.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFaultCodeSoap11ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaultCodeSoap12 createFaultCodeSoap12FromString(EDataType eDataType, String initialValue) {
		FaultCodeSoap12 result = FaultCodeSoap12.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFaultCodeSoap12ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaultStringType createFaultStringTypeFromString(EDataType eDataType, String initialValue) {
		FaultStringType result = FaultStringType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFaultStringTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaultReasonType createFaultReasonTypeFromString(EDataType eDataType, String initialValue) {
		FaultReasonType result = FaultReasonType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFaultReasonTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaultDetailType createFaultDetailTypeFromString(EDataType eDataType, String initialValue) {
		FaultDetailType result = FaultDetailType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFaultDetailTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregateSequenceType createAggregateSequenceTypeFromString(EDataType eDataType, String initialValue) {
		AggregateSequenceType result = AggregateSequenceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAggregateSequenceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetSequenceType createTargetSequenceTypeFromString(EDataType eDataType, String initialValue) {
		TargetSequenceType result = TargetSequenceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTargetSequenceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetEndpointType createTargetEndpointTypeFromString(EDataType eDataType, String initialValue) {
		TargetEndpointType result = TargetEndpointType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTargetEndpointTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CacheSequenceType createCacheSequenceTypeFromString(EDataType eDataType, String initialValue) {
		CacheSequenceType result = CacheSequenceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCacheSequenceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CacheImplementationType createCacheImplementationTypeFromString(EDataType eDataType, String initialValue) {
		CacheImplementationType result = CacheImplementationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCacheImplementationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CacheAction createCacheActionFromString(EDataType eDataType, String initialValue) {
		CacheAction result = CacheAction.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCacheActionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CacheScope createCacheScopeFromString(EDataType eDataType, String initialValue) {
		CacheScope result = CacheScope.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCacheScopeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XQueryVariableType createXQueryVariableTypeFromString(EDataType eDataType, String initialValue) {
		XQueryVariableType result = XQueryVariableType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertXQueryVariableTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XQueryVariableValueType createXQueryVariableValueTypeFromString(EDataType eDataType, String initialValue) {
		XQueryVariableValueType result = XQueryVariableValueType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertXQueryVariableValueTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalloutPayloadType createCalloutPayloadTypeFromString(EDataType eDataType, String initialValue) {
		CalloutPayloadType result = CalloutPayloadType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCalloutPayloadTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalloutResultType createCalloutResultTypeFromString(EDataType eDataType, String initialValue) {
		CalloutResultType result = CalloutResultType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCalloutResultTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RMSpecVersion createRMSpecVersionFromString(EDataType eDataType, String initialValue) {
		RMSpecVersion result = RMSpecVersion.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRMSpecVersionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RMSequenceType createRMSequenceTypeFromString(EDataType eDataType, String initialValue) {
		RMSequenceType result = RMSequenceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRMSequenceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionAction createTransactionActionFromString(EDataType eDataType, String initialValue) {
		TransactionAction result = TransactionAction.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransactionActionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeaderAction createHeaderActionFromString(EDataType eDataType, String initialValue) {
		HeaderAction result = HeaderAction.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHeaderActionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeaderValueType createHeaderValueTypeFromString(EDataType eDataType, String initialValue) {
		HeaderValueType result = HeaderValueType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHeaderValueTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThrottlePolicyType createThrottlePolicyTypeFromString(EDataType eDataType, String initialValue) {
		ThrottlePolicyType result = ThrottlePolicyType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertThrottlePolicyTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThrottleConditionType createThrottleConditionTypeFromString(EDataType eDataType, String initialValue) {
		ThrottleConditionType result = ThrottleConditionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertThrottleConditionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThrottleAccessType createThrottleAccessTypeFromString(EDataType eDataType, String initialValue) {
		ThrottleAccessType result = ThrottleAccessType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertThrottleAccessTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThrottleSequenceType createThrottleSequenceTypeFromString(EDataType eDataType, String initialValue) {
		ThrottleSequenceType result = ThrottleSequenceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertThrottleSequenceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandPropertyValueType createCommandPropertyValueTypeFromString(EDataType eDataType, String initialValue) {
		CommandPropertyValueType result = CommandPropertyValueType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCommandPropertyValueTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandPropertyMessageAction createCommandPropertyMessageActionFromString(EDataType eDataType, String initialValue) {
		CommandPropertyMessageAction result = CommandPropertyMessageAction.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCommandPropertyMessageActionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandPropertyContextAction createCommandPropertyContextActionFromString(EDataType eDataType, String initialValue) {
		CommandPropertyContextAction result = CommandPropertyContextAction.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCommandPropertyContextActionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqlExecutorConnectionType createSqlExecutorConnectionTypeFromString(EDataType eDataType, String initialValue) {
		SqlExecutorConnectionType result = SqlExecutorConnectionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSqlExecutorConnectionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqlExecutorDatasourceType createSqlExecutorDatasourceTypeFromString(EDataType eDataType, String initialValue) {
		SqlExecutorDatasourceType result = SqlExecutorDatasourceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSqlExecutorDatasourceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqlExecutorBooleanValue createSqlExecutorBooleanValueFromString(EDataType eDataType, String initialValue) {
		SqlExecutorBooleanValue result = SqlExecutorBooleanValue.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSqlExecutorBooleanValueToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqlExecutorIsolationLevel createSqlExecutorIsolationLevelFromString(EDataType eDataType, String initialValue) {
		SqlExecutorIsolationLevel result = SqlExecutorIsolationLevel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSqlExecutorIsolationLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqlParameterValueType createSqlParameterValueTypeFromString(EDataType eDataType, String initialValue) {
		SqlParameterValueType result = SqlParameterValueType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSqlParameterValueTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqlParameterDataType createSqlParameterDataTypeFromString(EDataType eDataType, String initialValue) {
		SqlParameterDataType result = SqlParameterDataType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSqlParameterDataTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleSourceType createRuleSourceTypeFromString(EDataType eDataType, String initialValue) {
		RuleSourceType result = RuleSourceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRuleSourceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleFactType createRuleFactTypeFromString(EDataType eDataType, String initialValue) {
		RuleFactType result = RuleFactType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRuleFactTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleFactValueType createRuleFactValueTypeFromString(EDataType eDataType, String initialValue) {
		RuleFactValueType result = RuleFactValueType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRuleFactValueTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleResultType createRuleResultTypeFromString(EDataType eDataType, String initialValue) {
		RuleResultType result = RuleResultType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRuleResultTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleResultValueType createRuleResultValueTypeFromString(EDataType eDataType, String initialValue) {
		RuleResultValueType result = RuleResultValueType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRuleResultValueTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmooksIODataType createSmooksIODataTypeFromString(EDataType eDataType, String initialValue) {
		SmooksIODataType result = SmooksIODataType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSmooksIODataTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionAction createExpressionActionFromString(EDataType eDataType, String initialValue) {
		ExpressionAction result = ExpressionAction.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExpressionActionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputMethod createOutputMethodFromString(EDataType eDataType, String initialValue) {
		OutputMethod result = OutputMethod.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOutputMethodToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReceivingSequenceType createReceivingSequenceTypeFromString(EDataType eDataType, String initialValue) {
		ReceivingSequenceType result = ReceivingSequenceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReceivingSequenceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyType createKeyTypeFromString(EDataType eDataType, String initialValue) {
		KeyType result = KeyType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKeyTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type createTypeFromString(EDataType eDataType, String initialValue) {
		Type result = Type.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalEntryValueType createLocalEntryValueTypeFromString(EDataType eDataType, String initialValue) {
		LocalEntryValueType result = LocalEntryValueType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLocalEntryValueTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map<?, ?> createMapFromString(EDataType eDataType, String initialValue) {
		return (Map<?, ?>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMapToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EsbPackage getEsbPackage() {
		return (EsbPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EsbPackage getPackage() {
		return EsbPackage.eINSTANCE;
	}

} //EsbFactoryImpl
