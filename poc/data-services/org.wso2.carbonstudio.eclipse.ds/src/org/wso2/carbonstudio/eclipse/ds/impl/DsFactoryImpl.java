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
package org.wso2.carbonstudio.eclipse.ds.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
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
import org.wso2.carbonstudio.eclipse.ds.DsFactory;
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
import org.wso2.carbonstudio.eclipse.ds.ServiceStatus;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class DsFactoryImpl extends EFactoryImpl implements DsFactory {
	/**
	 * Creates the default factory implementation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static DsFactory init() {
		try {
			DsFactory theDsFactory = (DsFactory) EPackage.Registry.INSTANCE
					.getEFactory("http:///org/wso2/carbonstudio/eclipse/ds");
			if (theDsFactory != null) {
				return theDsFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public DsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case DsPackage.ATTRIBUTE_MAPPING:
			return createAttributeMapping();
		case DsPackage.CALL_QUERY:
			return createCallQuery();
		case DsPackage.CALL_QUERY_LIST:
			return createCallQueryList();
		case DsPackage.CONFIGURATION_PROPERTY:
			return createConfigurationProperty();
		case DsPackage.CUSTOM_VALIDATOR:
			return createCustomValidator();
		case DsPackage.DATA_SERVICE:
			return createDataService();
		case DsPackage.DATA_SOURCE_CONFIGURATION:
			return createDataSourceConfiguration();
		case DsPackage.DOCUMENT_ROOT:
			return createDocumentRoot();
		case DsPackage.DOUBLE_RANGE_VALIDATOR:
			return createDoubleRangeValidator();
		case DsPackage.ELEMENT_MAPPING:
			return createElementMapping();
		case DsPackage.EVENT_SUBSCRIPTION_LIST:
			return createEventSubscriptionList();
		case DsPackage.EVENT_TRIGGER:
			return createEventTrigger();
		case DsPackage.EXCEL_QUERY:
			return createExcelQuery();
		case DsPackage.GSPREAD_QUERY:
			return createGSpreadQuery();
		case DsPackage.LENGTH_VALIDATOR:
			return createLengthValidator();
		case DsPackage.LONG_RANGE_VALIDATOR:
			return createLongRangeValidator();
		case DsPackage.OPERATION:
			return createOperation();
		case DsPackage.PARAMETER_MAPPING:
			return createParameterMapping();
		case DsPackage.PATTERN_VALIDATOR:
			return createPatternValidator();
		case DsPackage.QUERY:
			return createQuery();
		case DsPackage.QUERY_PARAMETER:
			return createQueryParameter();
		case DsPackage.QUERY_PROPERTY:
			return createQueryProperty();
		case DsPackage.QUERY_PROPERTY_LIST:
			return createQueryPropertyList();
		case DsPackage.RESOURCE:
			return createResource();
		case DsPackage.RESULT_MAPPING:
			return createResultMapping();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName()
					+ "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case DsPackage.SERVICE_STATUS:
			return createServiceStatusFromString(eDataType, initialValue);
		case DsPackage.SERVICE_STATUS_OBJECT:
			return createServiceStatusObjectFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName()
					+ "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case DsPackage.SERVICE_STATUS:
			return convertServiceStatusToString(eDataType, instanceValue);
		case DsPackage.SERVICE_STATUS_OBJECT:
			return convertServiceStatusObjectToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName()
					+ "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AttributeMapping createAttributeMapping() {
		AttributeMappingImpl attributeMapping = new AttributeMappingImpl();
		return attributeMapping;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CallQuery createCallQuery() {
		CallQueryImpl callQuery = new CallQueryImpl();
		return callQuery;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CallQueryList createCallQueryList() {
		CallQueryListImpl callQueryList = new CallQueryListImpl();
		return callQueryList;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ConfigurationProperty createConfigurationProperty() {
		ConfigurationPropertyImpl configurationProperty = new ConfigurationPropertyImpl();
		return configurationProperty;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CustomValidator createCustomValidator() {
		CustomValidatorImpl customValidator = new CustomValidatorImpl();
		return customValidator;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DataService createDataService() {
		DataServiceImpl dataService = new DataServiceImpl();
		return dataService;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DataSourceConfiguration createDataSourceConfiguration() {
		DataSourceConfigurationImpl dataSourceConfiguration = new DataSourceConfigurationImpl();
		return dataSourceConfiguration;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DoubleRangeValidator createDoubleRangeValidator() {
		DoubleRangeValidatorImpl doubleRangeValidator = new DoubleRangeValidatorImpl();
		return doubleRangeValidator;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ElementMapping createElementMapping() {
		ElementMappingImpl elementMapping = new ElementMappingImpl();
		return elementMapping;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EventSubscriptionList createEventSubscriptionList() {
		EventSubscriptionListImpl eventSubscriptionList = new EventSubscriptionListImpl();
		return eventSubscriptionList;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EventTrigger createEventTrigger() {
		EventTriggerImpl eventTrigger = new EventTriggerImpl();
		return eventTrigger;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ExcelQuery createExcelQuery() {
		ExcelQueryImpl excelQuery = new ExcelQueryImpl();
		return excelQuery;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public GSpreadQuery createGSpreadQuery() {
		GSpreadQueryImpl gSpreadQuery = new GSpreadQueryImpl();
		return gSpreadQuery;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public LengthValidator createLengthValidator() {
		LengthValidatorImpl lengthValidator = new LengthValidatorImpl();
		return lengthValidator;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public LongRangeValidator createLongRangeValidator() {
		LongRangeValidatorImpl longRangeValidator = new LongRangeValidatorImpl();
		return longRangeValidator;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ParameterMapping createParameterMapping() {
		ParameterMappingImpl parameterMapping = new ParameterMappingImpl();
		return parameterMapping;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PatternValidator createPatternValidator() {
		PatternValidatorImpl patternValidator = new PatternValidatorImpl();
		return patternValidator;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Query createQuery() {
		QueryImpl query = new QueryImpl();
		return query;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public QueryParameter createQueryParameter() {
		QueryParameterImpl queryParameter = new QueryParameterImpl();
		return queryParameter;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public QueryProperty createQueryProperty() {
		QueryPropertyImpl queryProperty = new QueryPropertyImpl();
		return queryProperty;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public QueryPropertyList createQueryPropertyList() {
		QueryPropertyListImpl queryPropertyList = new QueryPropertyListImpl();
		return queryPropertyList;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Resource createResource() {
		ResourceImpl resource = new ResourceImpl();
		return resource;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ResultMapping createResultMapping() {
		ResultMappingImpl resultMapping = new ResultMappingImpl();
		return resultMapping;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ServiceStatus createServiceStatusFromString(EDataType eDataType, String initialValue) {
		ServiceStatus result = ServiceStatus.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue
					+ "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertServiceStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ServiceStatus createServiceStatusObjectFromString(EDataType eDataType,
			String initialValue) {
		return createServiceStatusFromString(DsPackage.Literals.SERVICE_STATUS, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertServiceStatusObjectToString(EDataType eDataType, Object instanceValue) {
		return convertServiceStatusToString(DsPackage.Literals.SERVICE_STATUS, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DsPackage getDsPackage() {
		return (DsPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DsPackage getPackage() {
		return DsPackage.eINSTANCE;
	}

} // DsFactoryImpl
