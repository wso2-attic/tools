/*
 * Copyright 2009-2010 WSO2, Inc. (http://wso2.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.wso2.carbonstudio.eclipse.esb.mediator.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.wso2.carbonstudio.eclipse.esb.AbstractBooleanFeature;
import org.wso2.carbonstudio.eclipse.esb.AbstractCommonTarget;
import org.wso2.carbonstudio.eclipse.esb.AbstractLocationKeyResource;
import org.wso2.carbonstudio.eclipse.esb.AbstractNameValueExpressionProperty;
import org.wso2.carbonstudio.eclipse.esb.AbstractNameValueProperty;
import org.wso2.carbonstudio.eclipse.esb.ConfigurationElement;
import org.wso2.carbonstudio.eclipse.esb.Mediator;
import org.wso2.carbonstudio.eclipse.esb.MediatorBranch;
import org.wso2.carbonstudio.eclipse.esb.ModelObject;
import org.wso2.carbonstudio.eclipse.esb.ParentMediator;
import org.wso2.carbonstudio.eclipse.esb.mediator.*;
import org.wso2.carbonstudio.eclipse.esb.mediator.AbstractSqlExecutorMediator;
import org.wso2.carbonstudio.eclipse.esb.mediator.AggregateMediator;
import org.wso2.carbonstudio.eclipse.esb.mediator.AggregateOnCompleteBranch;
import org.wso2.carbonstudio.eclipse.esb.mediator.AutoscaleInMediator;
import org.wso2.carbonstudio.eclipse.esb.mediator.AutoscaleOutMediator;
import org.wso2.carbonstudio.eclipse.esb.mediator.BuilderMediator;
import org.wso2.carbonstudio.eclipse.esb.mediator.CacheMediator;
import org.wso2.carbonstudio.eclipse.esb.mediator.CacheOnHitBranch;
import org.wso2.carbonstudio.eclipse.esb.mediator.CalloutMediator;
import org.wso2.carbonstudio.eclipse.esb.mediator.ClassMediator;
import org.wso2.carbonstudio.eclipse.esb.mediator.ClassProperty;
import org.wso2.carbonstudio.eclipse.esb.mediator.CloneMediator;
import org.wso2.carbonstudio.eclipse.esb.mediator.CloneTarget;
import org.wso2.carbonstudio.eclipse.esb.mediator.CommandMediator;
import org.wso2.carbonstudio.eclipse.esb.mediator.CommandProperty;
import org.wso2.carbonstudio.eclipse.esb.mediator.DBLookupMediator;
import org.wso2.carbonstudio.eclipse.esb.mediator.DBReportMediator;
import org.wso2.carbonstudio.eclipse.esb.mediator.DropMediator;
import org.wso2.carbonstudio.eclipse.esb.mediator.EnqueueMediator;
import org.wso2.carbonstudio.eclipse.esb.mediator.EnrichMediator;
import org.wso2.carbonstudio.eclipse.esb.mediator.EntitlementMediator;
import org.wso2.carbonstudio.eclipse.esb.mediator.EventMediator;
import org.wso2.carbonstudio.eclipse.esb.mediator.FaultMediator;
import org.wso2.carbonstudio.eclipse.esb.mediator.FilterElseBranch;
import org.wso2.carbonstudio.eclipse.esb.mediator.FilterMediator;
import org.wso2.carbonstudio.eclipse.esb.mediator.FilterThenBranch;
import org.wso2.carbonstudio.eclipse.esb.mediator.HeaderMediator;
import org.wso2.carbonstudio.eclipse.esb.mediator.InMediator;
import org.wso2.carbonstudio.eclipse.esb.mediator.IterateMediator;
import org.wso2.carbonstudio.eclipse.esb.mediator.IterateTarget;
import org.wso2.carbonstudio.eclipse.esb.mediator.LogMediator;
import org.wso2.carbonstudio.eclipse.esb.mediator.LogProperty;
import org.wso2.carbonstudio.eclipse.esb.mediator.MediatorPackage;
import org.wso2.carbonstudio.eclipse.esb.mediator.MessageBuilder;
import org.wso2.carbonstudio.eclipse.esb.mediator.OAuthMediator;
import org.wso2.carbonstudio.eclipse.esb.mediator.OutMediator;
import org.wso2.carbonstudio.eclipse.esb.mediator.PropertyMediator;
import org.wso2.carbonstudio.eclipse.esb.mediator.RMSequenceMediator;
import org.wso2.carbonstudio.eclipse.esb.mediator.RouteTarget;
import org.wso2.carbonstudio.eclipse.esb.mediator.RouterMediator;
import org.wso2.carbonstudio.eclipse.esb.mediator.RouterRoute;
import org.wso2.carbonstudio.eclipse.esb.mediator.RuleChildMediatorsConfiguration;
import org.wso2.carbonstudio.eclipse.esb.mediator.RuleFact;
import org.wso2.carbonstudio.eclipse.esb.mediator.RuleFactsConfiguration;
import org.wso2.carbonstudio.eclipse.esb.mediator.RuleMediator;
import org.wso2.carbonstudio.eclipse.esb.mediator.RuleResult;
import org.wso2.carbonstudio.eclipse.esb.mediator.RuleResultsConfiguration;
import org.wso2.carbonstudio.eclipse.esb.mediator.RuleSessionConfiguration;
import org.wso2.carbonstudio.eclipse.esb.mediator.RuleSessionProperty;
import org.wso2.carbonstudio.eclipse.esb.mediator.RuleSetConfiguration;
import org.wso2.carbonstudio.eclipse.esb.mediator.RuleSetCreationProperty;
import org.wso2.carbonstudio.eclipse.esb.mediator.ScriptMediator;
import org.wso2.carbonstudio.eclipse.esb.mediator.SendMediator;
import org.wso2.carbonstudio.eclipse.esb.mediator.SequenceMediator;
import org.wso2.carbonstudio.eclipse.esb.mediator.SmooksMediator;
import org.wso2.carbonstudio.eclipse.esb.mediator.SpringMediator;
import org.wso2.carbonstudio.eclipse.esb.mediator.SqlParameterDefinition;
import org.wso2.carbonstudio.eclipse.esb.mediator.SqlResultMapping;
import org.wso2.carbonstudio.eclipse.esb.mediator.SqlStatement;
import org.wso2.carbonstudio.eclipse.esb.mediator.SwitchCaseBranch;
import org.wso2.carbonstudio.eclipse.esb.mediator.SwitchDefaultBranch;
import org.wso2.carbonstudio.eclipse.esb.mediator.SwitchMediator;
import org.wso2.carbonstudio.eclipse.esb.mediator.ThrottleMediator;
import org.wso2.carbonstudio.eclipse.esb.mediator.ThrottleOnAcceptBranch;
import org.wso2.carbonstudio.eclipse.esb.mediator.ThrottleOnRejectBranch;
import org.wso2.carbonstudio.eclipse.esb.mediator.ThrottlePolicyConfiguration;
import org.wso2.carbonstudio.eclipse.esb.mediator.ThrottlePolicyEntry;
import org.wso2.carbonstudio.eclipse.esb.mediator.TransactionMediator;
import org.wso2.carbonstudio.eclipse.esb.mediator.ValidateFeature;
import org.wso2.carbonstudio.eclipse.esb.mediator.ValidateMediator;
import org.wso2.carbonstudio.eclipse.esb.mediator.ValidateOnFailBranch;
import org.wso2.carbonstudio.eclipse.esb.mediator.ValidateSchema;
import org.wso2.carbonstudio.eclipse.esb.mediator.XQueryMediator;
import org.wso2.carbonstudio.eclipse.esb.mediator.XQueryVariable;
import org.wso2.carbonstudio.eclipse.esb.mediator.XSLTFeature;
import org.wso2.carbonstudio.eclipse.esb.mediator.XSLTMediator;
import org.wso2.carbonstudio.eclipse.esb.mediator.XSLTProperty;
import org.wso2.carbonstudio.eclipse.esb.mediator.XSLTResource;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.wso2.carbonstudio.eclipse.esb.mediator.MediatorPackage
 * @generated
 */
public class MediatorAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MediatorPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MediatorAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MediatorPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MediatorSwitch<Adapter> modelSwitch =
		new MediatorSwitch<Adapter>() {
			@Override
			public Adapter caseInMediator(InMediator object) {
				return createInMediatorAdapter();
			}
			@Override
			public Adapter caseOutMediator(OutMediator object) {
				return createOutMediatorAdapter();
			}
			@Override
			public Adapter caseDropMediator(DropMediator object) {
				return createDropMediatorAdapter();
			}
			@Override
			public Adapter caseSendMediator(SendMediator object) {
				return createSendMediatorAdapter();
			}
			@Override
			public Adapter caseLogMediator(LogMediator object) {
				return createLogMediatorAdapter();
			}
			@Override
			public Adapter caseLogProperty(LogProperty object) {
				return createLogPropertyAdapter();
			}
			@Override
			public Adapter caseFilterMediator(FilterMediator object) {
				return createFilterMediatorAdapter();
			}
			@Override
			public Adapter caseFilterThenBranch(FilterThenBranch object) {
				return createFilterThenBranchAdapter();
			}
			@Override
			public Adapter caseFilterElseBranch(FilterElseBranch object) {
				return createFilterElseBranchAdapter();
			}
			@Override
			public Adapter caseSwitchMediator(SwitchMediator object) {
				return createSwitchMediatorAdapter();
			}
			@Override
			public Adapter caseSwitchCaseBranch(SwitchCaseBranch object) {
				return createSwitchCaseBranchAdapter();
			}
			@Override
			public Adapter caseSwitchDefaultBranch(SwitchDefaultBranch object) {
				return createSwitchDefaultBranchAdapter();
			}
			@Override
			public Adapter caseEntitlementMediator(EntitlementMediator object) {
				return createEntitlementMediatorAdapter();
			}
			@Override
			public Adapter caseEnqueueMediator(EnqueueMediator object) {
				return createEnqueueMediatorAdapter();
			}
			@Override
			public Adapter caseClassMediator(ClassMediator object) {
				return createClassMediatorAdapter();
			}
			@Override
			public Adapter caseClassProperty(ClassProperty object) {
				return createClassPropertyAdapter();
			}
			@Override
			public Adapter caseSpringMediator(SpringMediator object) {
				return createSpringMediatorAdapter();
			}
			@Override
			public Adapter caseValidateMediator(ValidateMediator object) {
				return createValidateMediatorAdapter();
			}
			@Override
			public Adapter caseValidateOnFailBranch(ValidateOnFailBranch object) {
				return createValidateOnFailBranchAdapter();
			}
			@Override
			public Adapter caseValidateFeature(ValidateFeature object) {
				return createValidateFeatureAdapter();
			}
			@Override
			public Adapter caseValidateSchema(ValidateSchema object) {
				return createValidateSchemaAdapter();
			}
			@Override
			public Adapter caseScriptMediator(ScriptMediator object) {
				return createScriptMediatorAdapter();
			}
			@Override
			public Adapter caseEnrichMediator(EnrichMediator object) {
				return createEnrichMediatorAdapter();
			}
			@Override
			public Adapter caseFaultMediator(FaultMediator object) {
				return createFaultMediatorAdapter();
			}
			@Override
			public Adapter caseAggregateMediator(AggregateMediator object) {
				return createAggregateMediatorAdapter();
			}
			@Override
			public Adapter caseAggregateOnCompleteBranch(AggregateOnCompleteBranch object) {
				return createAggregateOnCompleteBranchAdapter();
			}
			@Override
			public Adapter caseRouterMediator(RouterMediator object) {
				return createRouterMediatorAdapter();
			}
			@Override
			public Adapter caseRouterRoute(RouterRoute object) {
				return createRouterRouteAdapter();
			}
			@Override
			public Adapter caseRouteTarget(RouteTarget object) {
				return createRouteTargetAdapter();
			}
			@Override
			public Adapter caseCloneMediator(CloneMediator object) {
				return createCloneMediatorAdapter();
			}
			@Override
			public Adapter caseCloneTarget(CloneTarget object) {
				return createCloneTargetAdapter();
			}
			@Override
			public Adapter caseIterateMediator(IterateMediator object) {
				return createIterateMediatorAdapter();
			}
			@Override
			public Adapter caseIterateTarget(IterateTarget object) {
				return createIterateTargetAdapter();
			}
			@Override
			public Adapter caseCacheMediator(CacheMediator object) {
				return createCacheMediatorAdapter();
			}
			@Override
			public Adapter caseCacheOnHitBranch(CacheOnHitBranch object) {
				return createCacheOnHitBranchAdapter();
			}
			@Override
			public Adapter caseXSLTMediator(XSLTMediator object) {
				return createXSLTMediatorAdapter();
			}
			@Override
			public Adapter caseXSLTProperty(XSLTProperty object) {
				return createXSLTPropertyAdapter();
			}
			@Override
			public Adapter caseXSLTFeature(XSLTFeature object) {
				return createXSLTFeatureAdapter();
			}
			@Override
			public Adapter caseXSLTResource(XSLTResource object) {
				return createXSLTResourceAdapter();
			}
			@Override
			public Adapter caseXQueryMediator(XQueryMediator object) {
				return createXQueryMediatorAdapter();
			}
			@Override
			public Adapter caseXQueryVariable(XQueryVariable object) {
				return createXQueryVariableAdapter();
			}
			@Override
			public Adapter caseCalloutMediator(CalloutMediator object) {
				return createCalloutMediatorAdapter();
			}
			@Override
			public Adapter caseRMSequenceMediator(RMSequenceMediator object) {
				return createRMSequenceMediatorAdapter();
			}
			@Override
			public Adapter caseTransactionMediator(TransactionMediator object) {
				return createTransactionMediatorAdapter();
			}
			@Override
			public Adapter casePropertyMediator(PropertyMediator object) {
				return createPropertyMediatorAdapter();
			}
			@Override
			public Adapter caseOAuthMediator(OAuthMediator object) {
				return createOAuthMediatorAdapter();
			}
			@Override
			public Adapter caseAutoscaleInMediator(AutoscaleInMediator object) {
				return createAutoscaleInMediatorAdapter();
			}
			@Override
			public Adapter caseAutoscaleOutMediator(AutoscaleOutMediator object) {
				return createAutoscaleOutMediatorAdapter();
			}
			@Override
			public Adapter caseHeaderMediator(HeaderMediator object) {
				return createHeaderMediatorAdapter();
			}
			@Override
			public Adapter caseThrottleMediator(ThrottleMediator object) {
				return createThrottleMediatorAdapter();
			}
			@Override
			public Adapter caseThrottlePolicyConfiguration(ThrottlePolicyConfiguration object) {
				return createThrottlePolicyConfigurationAdapter();
			}
			@Override
			public Adapter caseThrottlePolicyEntry(ThrottlePolicyEntry object) {
				return createThrottlePolicyEntryAdapter();
			}
			@Override
			public Adapter caseThrottleOnAcceptBranch(ThrottleOnAcceptBranch object) {
				return createThrottleOnAcceptBranchAdapter();
			}
			@Override
			public Adapter caseThrottleOnRejectBranch(ThrottleOnRejectBranch object) {
				return createThrottleOnRejectBranchAdapter();
			}
			@Override
			public Adapter caseCommandMediator(CommandMediator object) {
				return createCommandMediatorAdapter();
			}
			@Override
			public Adapter caseCommandProperty(CommandProperty object) {
				return createCommandPropertyAdapter();
			}
			@Override
			public Adapter caseEventMediator(EventMediator object) {
				return createEventMediatorAdapter();
			}
			@Override
			public Adapter caseAbstractSqlExecutorMediator(AbstractSqlExecutorMediator object) {
				return createAbstractSqlExecutorMediatorAdapter();
			}
			@Override
			public Adapter caseSqlStatement(SqlStatement object) {
				return createSqlStatementAdapter();
			}
			@Override
			public Adapter caseSqlParameterDefinition(SqlParameterDefinition object) {
				return createSqlParameterDefinitionAdapter();
			}
			@Override
			public Adapter caseSqlResultMapping(SqlResultMapping object) {
				return createSqlResultMappingAdapter();
			}
			@Override
			public Adapter caseDBLookupMediator(DBLookupMediator object) {
				return createDBLookupMediatorAdapter();
			}
			@Override
			public Adapter caseDBReportMediator(DBReportMediator object) {
				return createDBReportMediatorAdapter();
			}
			@Override
			public Adapter caseRuleMediator(RuleMediator object) {
				return createRuleMediatorAdapter();
			}
			@Override
			public Adapter caseRuleSetConfiguration(RuleSetConfiguration object) {
				return createRuleSetConfigurationAdapter();
			}
			@Override
			public Adapter caseRuleSetCreationProperty(RuleSetCreationProperty object) {
				return createRuleSetCreationPropertyAdapter();
			}
			@Override
			public Adapter caseRuleSessionConfiguration(RuleSessionConfiguration object) {
				return createRuleSessionConfigurationAdapter();
			}
			@Override
			public Adapter caseRuleSessionProperty(RuleSessionProperty object) {
				return createRuleSessionPropertyAdapter();
			}
			@Override
			public Adapter caseRuleFactsConfiguration(RuleFactsConfiguration object) {
				return createRuleFactsConfigurationAdapter();
			}
			@Override
			public Adapter caseRuleFact(RuleFact object) {
				return createRuleFactAdapter();
			}
			@Override
			public Adapter caseRuleResultsConfiguration(RuleResultsConfiguration object) {
				return createRuleResultsConfigurationAdapter();
			}
			@Override
			public Adapter caseRuleResult(RuleResult object) {
				return createRuleResultAdapter();
			}
			@Override
			public Adapter caseRuleChildMediatorsConfiguration(RuleChildMediatorsConfiguration object) {
				return createRuleChildMediatorsConfigurationAdapter();
			}
			@Override
			public Adapter caseSequenceMediator(SequenceMediator object) {
				return createSequenceMediatorAdapter();
			}
			@Override
			public Adapter caseBuilderMediator(BuilderMediator object) {
				return createBuilderMediatorAdapter();
			}
			@Override
			public Adapter caseMessageBuilder(MessageBuilder object) {
				return createMessageBuilderAdapter();
			}
			@Override
			public Adapter caseSmooksMediator(SmooksMediator object) {
				return createSmooksMediatorAdapter();
			}
			@Override
			public Adapter caseSmooksInConfiguration(SmooksInConfiguration object) {
				return createSmooksInConfigurationAdapter();
			}
			@Override
			public Adapter caseSmooksOutConfiguration(SmooksOutConfiguration object) {
				return createSmooksOutConfigurationAdapter();
			}
			@Override
			public Adapter caseModelObject(ModelObject object) {
				return createModelObjectAdapter();
			}
			@Override
			public Adapter caseConfigurationElement(ConfigurationElement object) {
				return createConfigurationElementAdapter();
			}
			@Override
			public Adapter caseMediator(Mediator object) {
				return createMediatorAdapter();
			}
			@Override
			public Adapter caseParentMediator(ParentMediator object) {
				return createParentMediatorAdapter();
			}
			@Override
			public Adapter caseAbstractNameValueExpressionProperty(AbstractNameValueExpressionProperty object) {
				return createAbstractNameValueExpressionPropertyAdapter();
			}
			@Override
			public Adapter caseMediatorBranch(MediatorBranch object) {
				return createMediatorBranchAdapter();
			}
			@Override
			public Adapter caseAbstractNameValueProperty(AbstractNameValueProperty object) {
				return createAbstractNameValuePropertyAdapter();
			}
			@Override
			public Adapter caseAbstractBooleanFeature(AbstractBooleanFeature object) {
				return createAbstractBooleanFeatureAdapter();
			}
			@Override
			public Adapter caseAbstractCommonTarget(AbstractCommonTarget object) {
				return createAbstractCommonTargetAdapter();
			}
			@Override
			public Adapter caseAbstractLocationKeyResource(AbstractLocationKeyResource object) {
				return createAbstractLocationKeyResourceAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.InMediator <em>In Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.InMediator
	 * @generated
	 */
	public Adapter createInMediatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.OutMediator <em>Out Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.OutMediator
	 * @generated
	 */
	public Adapter createOutMediatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.DropMediator <em>Drop Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.DropMediator
	 * @generated
	 */
	public Adapter createDropMediatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.SendMediator <em>Send Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.SendMediator
	 * @generated
	 */
	public Adapter createSendMediatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.LogMediator <em>Log Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.LogMediator
	 * @generated
	 */
	public Adapter createLogMediatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.LogProperty <em>Log Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.LogProperty
	 * @generated
	 */
	public Adapter createLogPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.FilterMediator <em>Filter Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.FilterMediator
	 * @generated
	 */
	public Adapter createFilterMediatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.FilterThenBranch <em>Filter Then Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.FilterThenBranch
	 * @generated
	 */
	public Adapter createFilterThenBranchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.FilterElseBranch <em>Filter Else Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.FilterElseBranch
	 * @generated
	 */
	public Adapter createFilterElseBranchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.SwitchMediator <em>Switch Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.SwitchMediator
	 * @generated
	 */
	public Adapter createSwitchMediatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.SwitchCaseBranch <em>Switch Case Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.SwitchCaseBranch
	 * @generated
	 */
	public Adapter createSwitchCaseBranchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.SwitchDefaultBranch <em>Switch Default Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.SwitchDefaultBranch
	 * @generated
	 */
	public Adapter createSwitchDefaultBranchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.EntitlementMediator <em>Entitlement Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.EntitlementMediator
	 * @generated
	 */
	public Adapter createEntitlementMediatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.EnqueueMediator <em>Enqueue Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.EnqueueMediator
	 * @generated
	 */
	public Adapter createEnqueueMediatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.ClassMediator <em>Class Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.ClassMediator
	 * @generated
	 */
	public Adapter createClassMediatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.ClassProperty <em>Class Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.ClassProperty
	 * @generated
	 */
	public Adapter createClassPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.SpringMediator <em>Spring Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.SpringMediator
	 * @generated
	 */
	public Adapter createSpringMediatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.ValidateMediator <em>Validate Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.ValidateMediator
	 * @generated
	 */
	public Adapter createValidateMediatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.ValidateOnFailBranch <em>Validate On Fail Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.ValidateOnFailBranch
	 * @generated
	 */
	public Adapter createValidateOnFailBranchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.ValidateFeature <em>Validate Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.ValidateFeature
	 * @generated
	 */
	public Adapter createValidateFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.ValidateSchema <em>Validate Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.ValidateSchema
	 * @generated
	 */
	public Adapter createValidateSchemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.ScriptMediator <em>Script Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.ScriptMediator
	 * @generated
	 */
	public Adapter createScriptMediatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.SmooksMediator <em>Smooks Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.SmooksMediator
	 * @generated
	 */
	public Adapter createSmooksMediatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.SmooksInConfiguration <em>Smooks In Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.SmooksInConfiguration
	 * @generated
	 */
	public Adapter createSmooksInConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.SmooksOutConfiguration <em>Smooks Out Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.SmooksOutConfiguration
	 * @generated
	 */
	public Adapter createSmooksOutConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.EnrichMediator <em>Enrich Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.EnrichMediator
	 * @generated
	 */
	public Adapter createEnrichMediatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.FaultMediator <em>Fault Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.FaultMediator
	 * @generated
	 */
	public Adapter createFaultMediatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.AggregateMediator <em>Aggregate Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.AggregateMediator
	 * @generated
	 */
	public Adapter createAggregateMediatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.AggregateOnCompleteBranch <em>Aggregate On Complete Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.AggregateOnCompleteBranch
	 * @generated
	 */
	public Adapter createAggregateOnCompleteBranchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.RouterMediator <em>Router Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.RouterMediator
	 * @generated
	 */
	public Adapter createRouterMediatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.RouterRoute <em>Router Route</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.RouterRoute
	 * @generated
	 */
	public Adapter createRouterRouteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.RouteTarget <em>Route Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.RouteTarget
	 * @generated
	 */
	public Adapter createRouteTargetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.CloneMediator <em>Clone Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.CloneMediator
	 * @generated
	 */
	public Adapter createCloneMediatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.CloneTarget <em>Clone Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.CloneTarget
	 * @generated
	 */
	public Adapter createCloneTargetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.IterateMediator <em>Iterate Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.IterateMediator
	 * @generated
	 */
	public Adapter createIterateMediatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.IterateTarget <em>Iterate Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.IterateTarget
	 * @generated
	 */
	public Adapter createIterateTargetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.CacheMediator <em>Cache Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.CacheMediator
	 * @generated
	 */
	public Adapter createCacheMediatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.CacheOnHitBranch <em>Cache On Hit Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.CacheOnHitBranch
	 * @generated
	 */
	public Adapter createCacheOnHitBranchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.XSLTMediator <em>XSLT Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.XSLTMediator
	 * @generated
	 */
	public Adapter createXSLTMediatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.XSLTProperty <em>XSLT Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.XSLTProperty
	 * @generated
	 */
	public Adapter createXSLTPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.XSLTFeature <em>XSLT Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.XSLTFeature
	 * @generated
	 */
	public Adapter createXSLTFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.XSLTResource <em>XSLT Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.XSLTResource
	 * @generated
	 */
	public Adapter createXSLTResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.XQueryMediator <em>XQuery Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.XQueryMediator
	 * @generated
	 */
	public Adapter createXQueryMediatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.XQueryVariable <em>XQuery Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.XQueryVariable
	 * @generated
	 */
	public Adapter createXQueryVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.CalloutMediator <em>Callout Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.CalloutMediator
	 * @generated
	 */
	public Adapter createCalloutMediatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.RMSequenceMediator <em>RM Sequence Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.RMSequenceMediator
	 * @generated
	 */
	public Adapter createRMSequenceMediatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.TransactionMediator <em>Transaction Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.TransactionMediator
	 * @generated
	 */
	public Adapter createTransactionMediatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.PropertyMediator <em>Property Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.PropertyMediator
	 * @generated
	 */
	public Adapter createPropertyMediatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.OAuthMediator <em>OAuth Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.OAuthMediator
	 * @generated
	 */
	public Adapter createOAuthMediatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.AutoscaleInMediator <em>Autoscale In Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.AutoscaleInMediator
	 * @generated
	 */
	public Adapter createAutoscaleInMediatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.AutoscaleOutMediator <em>Autoscale Out Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.AutoscaleOutMediator
	 * @generated
	 */
	public Adapter createAutoscaleOutMediatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.HeaderMediator <em>Header Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.HeaderMediator
	 * @generated
	 */
	public Adapter createHeaderMediatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.ThrottleMediator <em>Throttle Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.ThrottleMediator
	 * @generated
	 */
	public Adapter createThrottleMediatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.ThrottlePolicyConfiguration <em>Throttle Policy Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.ThrottlePolicyConfiguration
	 * @generated
	 */
	public Adapter createThrottlePolicyConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.ThrottleOnAcceptBranch <em>Throttle On Accept Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.ThrottleOnAcceptBranch
	 * @generated
	 */
	public Adapter createThrottleOnAcceptBranchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.ThrottleOnRejectBranch <em>Throttle On Reject Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.ThrottleOnRejectBranch
	 * @generated
	 */
	public Adapter createThrottleOnRejectBranchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.ThrottlePolicyEntry <em>Throttle Policy Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.ThrottlePolicyEntry
	 * @generated
	 */
	public Adapter createThrottlePolicyEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.CommandMediator <em>Command Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.CommandMediator
	 * @generated
	 */
	public Adapter createCommandMediatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.CommandProperty <em>Command Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.CommandProperty
	 * @generated
	 */
	public Adapter createCommandPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.EventMediator <em>Event Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.EventMediator
	 * @generated
	 */
	public Adapter createEventMediatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.AbstractSqlExecutorMediator <em>Abstract Sql Executor Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.AbstractSqlExecutorMediator
	 * @generated
	 */
	public Adapter createAbstractSqlExecutorMediatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.SqlStatement <em>Sql Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.SqlStatement
	 * @generated
	 */
	public Adapter createSqlStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.SqlParameterDefinition <em>Sql Parameter Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.SqlParameterDefinition
	 * @generated
	 */
	public Adapter createSqlParameterDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.SqlResultMapping <em>Sql Result Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.SqlResultMapping
	 * @generated
	 */
	public Adapter createSqlResultMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.DBLookupMediator <em>DB Lookup Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.DBLookupMediator
	 * @generated
	 */
	public Adapter createDBLookupMediatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.DBReportMediator <em>DB Report Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.DBReportMediator
	 * @generated
	 */
	public Adapter createDBReportMediatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.RuleMediator <em>Rule Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.RuleMediator
	 * @generated
	 */
	public Adapter createRuleMediatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.RuleSetConfiguration <em>Rule Set Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.RuleSetConfiguration
	 * @generated
	 */
	public Adapter createRuleSetConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.RuleSetCreationProperty <em>Rule Set Creation Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.RuleSetCreationProperty
	 * @generated
	 */
	public Adapter createRuleSetCreationPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.RuleSessionConfiguration <em>Rule Session Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.RuleSessionConfiguration
	 * @generated
	 */
	public Adapter createRuleSessionConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.RuleSessionProperty <em>Rule Session Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.RuleSessionProperty
	 * @generated
	 */
	public Adapter createRuleSessionPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.RuleFactsConfiguration <em>Rule Facts Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.RuleFactsConfiguration
	 * @generated
	 */
	public Adapter createRuleFactsConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.RuleFact <em>Rule Fact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.RuleFact
	 * @generated
	 */
	public Adapter createRuleFactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.RuleResultsConfiguration <em>Rule Results Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.RuleResultsConfiguration
	 * @generated
	 */
	public Adapter createRuleResultsConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.RuleResult <em>Rule Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.RuleResult
	 * @generated
	 */
	public Adapter createRuleResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.RuleChildMediatorsConfiguration <em>Rule Child Mediators Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.RuleChildMediatorsConfiguration
	 * @generated
	 */
	public Adapter createRuleChildMediatorsConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.SequenceMediator <em>Sequence Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.SequenceMediator
	 * @generated
	 */
	public Adapter createSequenceMediatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.BuilderMediator <em>Builder Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.BuilderMediator
	 * @generated
	 */
	public Adapter createBuilderMediatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wso2.carbonstudio.eclipse.esb.mediator.MessageBuilder <em>Message Builder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.esb.mediator.MessageBuilder
	 * @generated
	 */
	public Adapter createMessageBuilderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wso2.carbonstudio.eclipse.esb.ModelObject <em>Model Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.esb.ModelObject
	 * @generated
	 */
	public Adapter createModelObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wso2.carbonstudio.eclipse.esb.ConfigurationElement <em>Configuration Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.esb.ConfigurationElement
	 * @generated
	 */
	public Adapter createConfigurationElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wso2.carbonstudio.eclipse.esb.Mediator <em>Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.esb.Mediator
	 * @generated
	 */
	public Adapter createMediatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wso2.carbonstudio.eclipse.esb.ParentMediator <em>Parent Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.esb.ParentMediator
	 * @generated
	 */
	public Adapter createParentMediatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wso2.carbonstudio.eclipse.esb.AbstractNameValueExpressionProperty <em>Abstract Name Value Expression Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.esb.AbstractNameValueExpressionProperty
	 * @generated
	 */
	public Adapter createAbstractNameValueExpressionPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wso2.carbonstudio.eclipse.esb.MediatorBranch <em>Mediator Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.esb.MediatorBranch
	 * @generated
	 */
	public Adapter createMediatorBranchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wso2.carbonstudio.eclipse.esb.AbstractNameValueProperty <em>Abstract Name Value Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.esb.AbstractNameValueProperty
	 * @generated
	 */
	public Adapter createAbstractNameValuePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wso2.carbonstudio.eclipse.esb.AbstractBooleanFeature <em>Abstract Boolean Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.esb.AbstractBooleanFeature
	 * @generated
	 */
	public Adapter createAbstractBooleanFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wso2.carbonstudio.eclipse.esb.AbstractCommonTarget <em>Abstract Common Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.esb.AbstractCommonTarget
	 * @generated
	 */
	public Adapter createAbstractCommonTargetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wso2.carbonstudio.eclipse.esb.AbstractLocationKeyResource <em>Abstract Location Key Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.esb.AbstractLocationKeyResource
	 * @generated
	 */
	public Adapter createAbstractLocationKeyResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MediatorAdapterFactory
