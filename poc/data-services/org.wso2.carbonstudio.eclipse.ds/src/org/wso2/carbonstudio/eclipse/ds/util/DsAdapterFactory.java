/* Copyright 2009-2010 WSO2, Inc. (http://wso2.com)
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
package org.wso2.carbonstudio.eclipse.ds.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.wso2.carbonstudio.eclipse.ds.*;
import org.wso2.carbonstudio.eclipse.ds.AttributeMapping;
import org.wso2.carbonstudio.eclipse.ds.CallQuery;
import org.wso2.carbonstudio.eclipse.ds.CallQueryList;
import org.wso2.carbonstudio.eclipse.ds.ConfigurationProperty;
import org.wso2.carbonstudio.eclipse.ds.CustomValidator;
import org.wso2.carbonstudio.eclipse.ds.DataService;
import org.wso2.carbonstudio.eclipse.ds.DataSourceConfiguration;
import org.wso2.carbonstudio.eclipse.ds.DocumentRoot;
import org.wso2.carbonstudio.eclipse.ds.DoubleRangeValidator;
import org.wso2.carbonstudio.eclipse.ds.DsPackage;
import org.wso2.carbonstudio.eclipse.ds.ElementMapping;
import org.wso2.carbonstudio.eclipse.ds.EventSubscriptionList;
import org.wso2.carbonstudio.eclipse.ds.EventTrigger;
import org.wso2.carbonstudio.eclipse.ds.ExcelQuery;
import org.wso2.carbonstudio.eclipse.ds.GSpreadQuery;
import org.wso2.carbonstudio.eclipse.ds.LengthValidator;
import org.wso2.carbonstudio.eclipse.ds.LongRangeValidator;
import org.wso2.carbonstudio.eclipse.ds.Operation;
import org.wso2.carbonstudio.eclipse.ds.ParameterMapping;
import org.wso2.carbonstudio.eclipse.ds.PatternValidator;
import org.wso2.carbonstudio.eclipse.ds.Query;
import org.wso2.carbonstudio.eclipse.ds.QueryParameter;
import org.wso2.carbonstudio.eclipse.ds.QueryProperty;
import org.wso2.carbonstudio.eclipse.ds.QueryPropertyList;
import org.wso2.carbonstudio.eclipse.ds.Resource;
import org.wso2.carbonstudio.eclipse.ds.ResultMapping;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides
 * an adapter <code>createXXX</code> method for each class of the model. <!--
 * end-user-doc -->
 * 
 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage
 * @generated
 */
public class DsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static DsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public DsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc --> This implementation returns <code>true</code> if
	 * the object is either the model's package or is an instance object of the
	 * model. <!-- end-user-doc -->
	 * 
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected DsSwitch<Adapter> modelSwitch = new DsSwitch<Adapter>() {
		@Override
		public Adapter caseAttributeMapping(AttributeMapping object) {
			return createAttributeMappingAdapter();
		}

		@Override
		public Adapter caseCallQuery(CallQuery object) {
			return createCallQueryAdapter();
		}

		@Override
		public Adapter caseCallQueryList(CallQueryList object) {
			return createCallQueryListAdapter();
		}

		@Override
		public Adapter caseConfigurationProperty(ConfigurationProperty object) {
			return createConfigurationPropertyAdapter();
		}

		@Override
		public Adapter caseCustomValidator(CustomValidator object) {
			return createCustomValidatorAdapter();
		}

		@Override
		public Adapter caseDataService(DataService object) {
			return createDataServiceAdapter();
		}

		@Override
		public Adapter caseDataSourceConfiguration(DataSourceConfiguration object) {
			return createDataSourceConfigurationAdapter();
		}

		@Override
		public Adapter caseDocumentRoot(DocumentRoot object) {
			return createDocumentRootAdapter();
		}

		@Override
		public Adapter caseDoubleRangeValidator(DoubleRangeValidator object) {
			return createDoubleRangeValidatorAdapter();
		}

		@Override
		public Adapter caseElementMapping(ElementMapping object) {
			return createElementMappingAdapter();
		}

		@Override
		public Adapter caseEventSubscriptionList(EventSubscriptionList object) {
			return createEventSubscriptionListAdapter();
		}

		@Override
		public Adapter caseEventTrigger(EventTrigger object) {
			return createEventTriggerAdapter();
		}

		@Override
		public Adapter caseExcelQuery(ExcelQuery object) {
			return createExcelQueryAdapter();
		}

		@Override
		public Adapter caseGSpreadQuery(GSpreadQuery object) {
			return createGSpreadQueryAdapter();
		}

		@Override
		public Adapter caseLengthValidator(LengthValidator object) {
			return createLengthValidatorAdapter();
		}

		@Override
		public Adapter caseLongRangeValidator(LongRangeValidator object) {
			return createLongRangeValidatorAdapter();
		}

		@Override
		public Adapter caseOperation(Operation object) {
			return createOperationAdapter();
		}

		@Override
		public Adapter caseParameterMapping(ParameterMapping object) {
			return createParameterMappingAdapter();
		}

		@Override
		public Adapter casePatternValidator(PatternValidator object) {
			return createPatternValidatorAdapter();
		}

		@Override
		public Adapter caseQuery(Query object) {
			return createQueryAdapter();
		}

		@Override
		public Adapter caseQueryParameter(QueryParameter object) {
			return createQueryParameterAdapter();
		}

		@Override
		public Adapter caseQueryProperty(QueryProperty object) {
			return createQueryPropertyAdapter();
		}

		@Override
		public Adapter caseQueryPropertyList(QueryPropertyList object) {
			return createQueryPropertyListAdapter();
		}

		@Override
		public Adapter caseResource(Resource object) {
			return createResourceAdapter();
		}

		@Override
		public Adapter caseResultMapping(ResultMapping object) {
			return createResultMappingAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param target
	 *            the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.wso2.carbonstudio.eclipse.ds.AttributeMapping
	 * <em>Attribute Mapping</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.ds.AttributeMapping
	 * @generated
	 */
	public Adapter createAttributeMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.wso2.carbonstudio.eclipse.ds.CallQuery <em>Call Query</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.ds.CallQuery
	 * @generated
	 */
	public Adapter createCallQueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.wso2.carbonstudio.eclipse.ds.CallQueryList
	 * <em>Call Query List</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.ds.CallQueryList
	 * @generated
	 */
	public Adapter createCallQueryListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.wso2.carbonstudio.eclipse.ds.ConfigurationProperty
	 * <em>Configuration Property</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.ds.ConfigurationProperty
	 * @generated
	 */
	public Adapter createConfigurationPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.wso2.carbonstudio.eclipse.ds.CustomValidator
	 * <em>Custom Validator</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.ds.CustomValidator
	 * @generated
	 */
	public Adapter createCustomValidatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.wso2.carbonstudio.eclipse.ds.DataService
	 * <em>Data Service</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.ds.DataService
	 * @generated
	 */
	public Adapter createDataServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.wso2.carbonstudio.eclipse.ds.DataSourceConfiguration
	 * <em>Data Source Configuration</em>}'. <!-- begin-user-doc --> This
	 * default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases
	 * anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.ds.DataSourceConfiguration
	 * @generated
	 */
	public Adapter createDataSourceConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.wso2.carbonstudio.eclipse.ds.DocumentRoot
	 * <em>Document Root</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.ds.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.wso2.carbonstudio.eclipse.ds.DoubleRangeValidator
	 * <em>Double Range Validator</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.ds.DoubleRangeValidator
	 * @generated
	 */
	public Adapter createDoubleRangeValidatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.wso2.carbonstudio.eclipse.ds.ElementMapping
	 * <em>Element Mapping</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.ds.ElementMapping
	 * @generated
	 */
	public Adapter createElementMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.wso2.carbonstudio.eclipse.ds.EventSubscriptionList
	 * <em>Event Subscription List</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.ds.EventSubscriptionList
	 * @generated
	 */
	public Adapter createEventSubscriptionListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.wso2.carbonstudio.eclipse.ds.EventTrigger
	 * <em>Event Trigger</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.ds.EventTrigger
	 * @generated
	 */
	public Adapter createEventTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.wso2.carbonstudio.eclipse.ds.ExcelQuery <em>Excel Query</em>}
	 * '. <!-- begin-user-doc --> This default implementation returns null so
	 * that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.ds.ExcelQuery
	 * @generated
	 */
	public Adapter createExcelQueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.wso2.carbonstudio.eclipse.ds.GSpreadQuery
	 * <em>GSpread Query</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.ds.GSpreadQuery
	 * @generated
	 */
	public Adapter createGSpreadQueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.wso2.carbonstudio.eclipse.ds.LengthValidator
	 * <em>Length Validator</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.ds.LengthValidator
	 * @generated
	 */
	public Adapter createLengthValidatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.wso2.carbonstudio.eclipse.ds.LongRangeValidator
	 * <em>Long Range Validator</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.ds.LongRangeValidator
	 * @generated
	 */
	public Adapter createLongRangeValidatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.wso2.carbonstudio.eclipse.ds.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.ds.Operation
	 * @generated
	 */
	public Adapter createOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.wso2.carbonstudio.eclipse.ds.ParameterMapping
	 * <em>Parameter Mapping</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.ds.ParameterMapping
	 * @generated
	 */
	public Adapter createParameterMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.wso2.carbonstudio.eclipse.ds.PatternValidator
	 * <em>Pattern Validator</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.ds.PatternValidator
	 * @generated
	 */
	public Adapter createPatternValidatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.wso2.carbonstudio.eclipse.ds.Query <em>Query</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.ds.Query
	 * @generated
	 */
	public Adapter createQueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.wso2.carbonstudio.eclipse.ds.QueryParameter
	 * <em>Query Parameter</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.ds.QueryParameter
	 * @generated
	 */
	public Adapter createQueryParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.wso2.carbonstudio.eclipse.ds.QueryProperty
	 * <em>Query Property</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.ds.QueryProperty
	 * @generated
	 */
	public Adapter createQueryPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.wso2.carbonstudio.eclipse.ds.QueryPropertyList
	 * <em>Query Property List</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.ds.QueryPropertyList
	 * @generated
	 */
	public Adapter createQueryPropertyListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.wso2.carbonstudio.eclipse.ds.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.ds.Resource
	 * @generated
	 */
	public Adapter createResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.wso2.carbonstudio.eclipse.ds.ResultMapping
	 * <em>Result Mapping</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.wso2.carbonstudio.eclipse.ds.ResultMapping
	 * @generated
	 */
	public Adapter createResultMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case. <!-- begin-user-doc --> This
	 * default implementation returns null. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} // DsAdapterFactory
