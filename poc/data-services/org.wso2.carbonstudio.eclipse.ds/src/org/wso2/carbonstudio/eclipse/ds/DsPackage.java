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
package org.wso2.carbonstudio.eclipse.ds;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains
 * accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * 
 * @see org.wso2.carbonstudio.eclipse.ds.DsFactory
 * @model kind="package" extendedMetaData="qualified='false'"
 * @generated
 */
public interface DsPackage extends EPackage {
	/**
	 * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "ds";

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http:///org/wso2/carbonstudio/eclipse/ds";

	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "ds";

	/**
	 * The singleton instance of the package. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	DsPackage eINSTANCE = org.wso2.carbonstudio.eclipse.ds.impl.DsPackageImpl.init();

	/**
	 * The meta object id for the '
	 * {@link org.wso2.carbonstudio.eclipse.ds.impl.AttributeMappingImpl
	 * <em>Attribute Mapping</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.wso2.carbonstudio.eclipse.ds.impl.AttributeMappingImpl
	 * @see org.wso2.carbonstudio.eclipse.ds.impl.DsPackageImpl#getAttributeMapping()
	 * @generated
	 */
	int ATTRIBUTE_MAPPING = 0;

	/**
	 * The feature id for the '<em><b>Attribute Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_MAPPING__ATTRIBUTE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Column Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_MAPPING__COLUMN_NAME = 1;

	/**
	 * The feature id for the '<em><b>Query Param</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_MAPPING__QUERY_PARAM = 2;

	/**
	 * The feature id for the '<em><b>Required Roles</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_MAPPING__REQUIRED_ROLES = 3;

	/**
	 * The feature id for the '<em><b>Xsd Type</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_MAPPING__XSD_TYPE = 4;

	/**
	 * The number of structural features of the '<em>Attribute Mapping</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_MAPPING_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '
	 * {@link org.wso2.carbonstudio.eclipse.ds.impl.CallQueryImpl
	 * <em>Call Query</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.wso2.carbonstudio.eclipse.ds.impl.CallQueryImpl
	 * @see org.wso2.carbonstudio.eclipse.ds.impl.DsPackageImpl#getCallQuery()
	 * @generated
	 */
	int CALL_QUERY = 1;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CALL_QUERY__HREF = 0;

	/**
	 * The feature id for the '<em><b>Parameter Mappings</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CALL_QUERY__PARAMETER_MAPPINGS = 1;

	/**
	 * The number of structural features of the '<em>Call Query</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CALL_QUERY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '
	 * {@link org.wso2.carbonstudio.eclipse.ds.impl.CallQueryListImpl
	 * <em>Call Query List</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.wso2.carbonstudio.eclipse.ds.impl.CallQueryListImpl
	 * @see org.wso2.carbonstudio.eclipse.ds.impl.DsPackageImpl#getCallQueryList()
	 * @generated
	 */
	int CALL_QUERY_LIST = 2;

	/**
	 * The feature id for the '<em><b>Queries</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CALL_QUERY_LIST__QUERIES = 0;

	/**
	 * The number of structural features of the '<em>Call Query List</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CALL_QUERY_LIST_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '
	 * {@link org.wso2.carbonstudio.eclipse.ds.impl.ConfigurationPropertyImpl
	 * <em>Configuration Property</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.wso2.carbonstudio.eclipse.ds.impl.ConfigurationPropertyImpl
	 * @see org.wso2.carbonstudio.eclipse.ds.impl.DsPackageImpl#getConfigurationProperty()
	 * @generated
	 */
	int CONFIGURATION_PROPERTY = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PROPERTY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PROPERTY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Configuration Property</em>
	 * ' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PROPERTY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '
	 * {@link org.wso2.carbonstudio.eclipse.ds.impl.CustomValidatorImpl
	 * <em>Custom Validator</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.wso2.carbonstudio.eclipse.ds.impl.CustomValidatorImpl
	 * @see org.wso2.carbonstudio.eclipse.ds.impl.DsPackageImpl#getCustomValidator()
	 * @generated
	 */
	int CUSTOM_VALIDATOR = 4;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CUSTOM_VALIDATOR__CLASS_NAME = 0;

	/**
	 * The number of structural features of the '<em>Custom Validator</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CUSTOM_VALIDATOR_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '
	 * {@link org.wso2.carbonstudio.eclipse.ds.impl.DataServiceImpl
	 * <em>Data Service</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.wso2.carbonstudio.eclipse.ds.impl.DataServiceImpl
	 * @see org.wso2.carbonstudio.eclipse.ds.impl.DsPackageImpl#getDataService()
	 * @generated
	 */
	int DATA_SERVICE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Base URI</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE__BASE_URI = 2;

	/**
	 * The feature id for the '<em><b>Enable Batch Requests</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE__ENABLE_BATCH_REQUESTS = 3;

	/**
	 * The feature id for the '<em><b>Enable Boxcarring</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE__ENABLE_BOXCARRING = 4;

	/**
	 * The feature id for the '<em><b>Service Status</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE__SERVICE_STATUS = 5;

	/**
	 * The feature id for the '<em><b>Data Sources</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE__DATA_SOURCES = 6;

	/**
	 * The feature id for the '<em><b>Queries</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE__QUERIES = 7;

	/**
	 * The feature id for the '<em><b>Event Triggers</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE__EVENT_TRIGGERS = 8;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE__OPERATIONS = 9;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE__RESOURCES = 10;

	/**
	 * The number of structural features of the '<em>Data Service</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '
	 * {@link org.wso2.carbonstudio.eclipse.ds.impl.DataSourceConfigurationImpl
	 * <em>Data Source Configuration</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.wso2.carbonstudio.eclipse.ds.impl.DataSourceConfigurationImpl
	 * @see org.wso2.carbonstudio.eclipse.ds.impl.DsPackageImpl#getDataSourceConfiguration()
	 * @generated
	 */
	int DATA_SOURCE_CONFIGURATION = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_CONFIGURATION__ID = 0;

	/**
	 * The feature id for the '<em><b>Configuration Properties</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_CONFIGURATION__CONFIGURATION_PROPERTIES = 1;

	/**
	 * The number of structural features of the '
	 * <em>Data Source Configuration</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_CONFIGURATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '
	 * {@link org.wso2.carbonstudio.eclipse.ds.impl.DocumentRootImpl
	 * <em>Document Root</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.wso2.carbonstudio.eclipse.ds.impl.DocumentRootImpl
	 * @see org.wso2.carbonstudio.eclipse.ds.impl.DsPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 7;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATA = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '
	 * {@link org.wso2.carbonstudio.eclipse.ds.impl.DoubleRangeValidatorImpl
	 * <em>Double Range Validator</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.wso2.carbonstudio.eclipse.ds.impl.DoubleRangeValidatorImpl
	 * @see org.wso2.carbonstudio.eclipse.ds.impl.DsPackageImpl#getDoubleRangeValidator()
	 * @generated
	 */
	int DOUBLE_RANGE_VALIDATOR = 8;

	/**
	 * The feature id for the '<em><b>Min Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DOUBLE_RANGE_VALIDATOR__MIN_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Max Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DOUBLE_RANGE_VALIDATOR__MAX_VALUE = 1;

	/**
	 * The number of structural features of the '<em>Double Range Validator</em>
	 * ' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DOUBLE_RANGE_VALIDATOR_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '
	 * {@link org.wso2.carbonstudio.eclipse.ds.impl.ElementMappingImpl
	 * <em>Element Mapping</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.wso2.carbonstudio.eclipse.ds.impl.ElementMappingImpl
	 * @see org.wso2.carbonstudio.eclipse.ds.impl.DsPackageImpl#getElementMapping()
	 * @generated
	 */
	int ELEMENT_MAPPING = 9;

	/**
	 * The feature id for the '<em><b>Element Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ELEMENT_MAPPING__ELEMENT_NAME = 0;

	/**
	 * The feature id for the '<em><b>Column Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ELEMENT_MAPPING__COLUMN_NAME = 1;

	/**
	 * The feature id for the '<em><b>Query Param</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ELEMENT_MAPPING__QUERY_PARAM = 2;

	/**
	 * The feature id for the '<em><b>Required Roles</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ELEMENT_MAPPING__REQUIRED_ROLES = 3;

	/**
	 * The feature id for the '<em><b>Xsd Type</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ELEMENT_MAPPING__XSD_TYPE = 4;

	/**
	 * The number of structural features of the '<em>Element Mapping</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ELEMENT_MAPPING_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '
	 * {@link org.wso2.carbonstudio.eclipse.ds.impl.EventSubscriptionListImpl
	 * <em>Event Subscription List</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.wso2.carbonstudio.eclipse.ds.impl.EventSubscriptionListImpl
	 * @see org.wso2.carbonstudio.eclipse.ds.impl.DsPackageImpl#getEventSubscriptionList()
	 * @generated
	 */
	int EVENT_SUBSCRIPTION_LIST = 10;

	/**
	 * The feature id for the '<em><b>Subscriptions</b></em>' attribute list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EVENT_SUBSCRIPTION_LIST__SUBSCRIPTIONS = 0;

	/**
	 * The number of structural features of the '
	 * <em>Event Subscription List</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EVENT_SUBSCRIPTION_LIST_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '
	 * {@link org.wso2.carbonstudio.eclipse.ds.impl.EventTriggerImpl
	 * <em>Event Trigger</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.wso2.carbonstudio.eclipse.ds.impl.EventTriggerImpl
	 * @see org.wso2.carbonstudio.eclipse.ds.impl.DsPackageImpl#getEventTrigger()
	 * @generated
	 */
	int EVENT_TRIGGER = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EVENT_TRIGGER__ID = 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EVENT_TRIGGER__EXPRESSION = 1;

	/**
	 * The feature id for the '<em><b>Target Topic</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EVENT_TRIGGER__TARGET_TOPIC = 2;

	/**
	 * The feature id for the '<em><b>Subscriptions List</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EVENT_TRIGGER__SUBSCRIPTIONS_LIST = 3;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EVENT_TRIGGER__LANGUAGE = 4;

	/**
	 * The number of structural features of the '<em>Event Trigger</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EVENT_TRIGGER_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '
	 * {@link org.wso2.carbonstudio.eclipse.ds.impl.ExcelQueryImpl
	 * <em>Excel Query</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.wso2.carbonstudio.eclipse.ds.impl.ExcelQueryImpl
	 * @see org.wso2.carbonstudio.eclipse.ds.impl.DsPackageImpl#getExcelQuery()
	 * @generated
	 */
	int EXCEL_QUERY = 12;

	/**
	 * The feature id for the '<em><b>Workbook Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXCEL_QUERY__WORKBOOK_NAME = 0;

	/**
	 * The feature id for the '<em><b>Starting Row</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXCEL_QUERY__STARTING_ROW = 1;

	/**
	 * The feature id for the '<em><b>Max Row Count</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXCEL_QUERY__MAX_ROW_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Has Header</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXCEL_QUERY__HAS_HEADER = 3;

	/**
	 * The number of structural features of the '<em>Excel Query</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXCEL_QUERY_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '
	 * {@link org.wso2.carbonstudio.eclipse.ds.impl.GSpreadQueryImpl
	 * <em>GSpread Query</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.wso2.carbonstudio.eclipse.ds.impl.GSpreadQueryImpl
	 * @see org.wso2.carbonstudio.eclipse.ds.impl.DsPackageImpl#getGSpreadQuery()
	 * @generated
	 */
	int GSPREAD_QUERY = 13;

	/**
	 * The feature id for the '<em><b>Worksheet Number</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GSPREAD_QUERY__WORKSHEET_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Starting Row</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GSPREAD_QUERY__STARTING_ROW = 1;

	/**
	 * The feature id for the '<em><b>Max Row Count</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GSPREAD_QUERY__MAX_ROW_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Has Header</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GSPREAD_QUERY__HAS_HEADER = 3;

	/**
	 * The number of structural features of the '<em>GSpread Query</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GSPREAD_QUERY_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '
	 * {@link org.wso2.carbonstudio.eclipse.ds.impl.LengthValidatorImpl
	 * <em>Length Validator</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.wso2.carbonstudio.eclipse.ds.impl.LengthValidatorImpl
	 * @see org.wso2.carbonstudio.eclipse.ds.impl.DsPackageImpl#getLengthValidator()
	 * @generated
	 */
	int LENGTH_VALIDATOR = 14;

	/**
	 * The feature id for the '<em><b>Min Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LENGTH_VALIDATOR__MIN_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Max Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LENGTH_VALIDATOR__MAX_VALUE = 1;

	/**
	 * The number of structural features of the '<em>Length Validator</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LENGTH_VALIDATOR_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '
	 * {@link org.wso2.carbonstudio.eclipse.ds.impl.LongRangeValidatorImpl
	 * <em>Long Range Validator</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.wso2.carbonstudio.eclipse.ds.impl.LongRangeValidatorImpl
	 * @see org.wso2.carbonstudio.eclipse.ds.impl.DsPackageImpl#getLongRangeValidator()
	 * @generated
	 */
	int LONG_RANGE_VALIDATOR = 15;

	/**
	 * The feature id for the '<em><b>Min Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LONG_RANGE_VALIDATOR__MIN_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Max Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LONG_RANGE_VALIDATOR__MAX_VALUE = 1;

	/**
	 * The number of structural features of the '<em>Long Range Validator</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LONG_RANGE_VALIDATOR_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '
	 * {@link org.wso2.carbonstudio.eclipse.ds.impl.OperationImpl
	 * <em>Operation</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.wso2.carbonstudio.eclipse.ds.impl.OperationImpl
	 * @see org.wso2.carbonstudio.eclipse.ds.impl.DsPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Call Query</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATION__CALL_QUERY = 1;

	/**
	 * The feature id for the '<em><b>Call Query List</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATION__CALL_QUERY_LIST = 2;

	/**
	 * The number of structural features of the '<em>Operation</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '
	 * {@link org.wso2.carbonstudio.eclipse.ds.impl.ParameterMappingImpl
	 * <em>Parameter Mapping</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.wso2.carbonstudio.eclipse.ds.impl.ParameterMappingImpl
	 * @see org.wso2.carbonstudio.eclipse.ds.impl.DsPackageImpl#getParameterMapping()
	 * @generated
	 */
	int PARAMETER_MAPPING = 17;

	/**
	 * The feature id for the '<em><b>Parameter Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MAPPING__PARAMETER_NAME = 0;

	/**
	 * The feature id for the '<em><b>Column Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MAPPING__COLUMN_NAME = 1;

	/**
	 * The feature id for the '<em><b>Query Param</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MAPPING__QUERY_PARAM = 2;

	/**
	 * The number of structural features of the '<em>Parameter Mapping</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MAPPING_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '
	 * {@link org.wso2.carbonstudio.eclipse.ds.impl.PatternValidatorImpl
	 * <em>Pattern Validator</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.wso2.carbonstudio.eclipse.ds.impl.PatternValidatorImpl
	 * @see org.wso2.carbonstudio.eclipse.ds.impl.DsPackageImpl#getPatternValidator()
	 * @generated
	 */
	int PATTERN_VALIDATOR = 18;

	/**
	 * The feature id for the '<em><b>Pattern String</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PATTERN_VALIDATOR__PATTERN_STRING = 0;

	/**
	 * The number of structural features of the '<em>Pattern Validator</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PATTERN_VALIDATOR_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '
	 * {@link org.wso2.carbonstudio.eclipse.ds.impl.QueryImpl <em>Query</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.wso2.carbonstudio.eclipse.ds.impl.QueryImpl
	 * @see org.wso2.carbonstudio.eclipse.ds.impl.DsPackageImpl#getQuery()
	 * @generated
	 */
	int QUERY = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY__ID = 0;

	/**
	 * The feature id for the '<em><b>Input Trigger Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY__INPUT_TRIGGER_NAME = 1;

	/**
	 * The feature id for the '<em><b>Output Trigger Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY__OUTPUT_TRIGGER_NAME = 2;

	/**
	 * The feature id for the '<em><b>Data Source Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY__DATA_SOURCE_ID = 3;

	/**
	 * The feature id for the '<em><b>Sql Statement</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY__SQL_STATEMENT = 4;

	/**
	 * The feature id for the '<em><b>Properties List</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY__PROPERTIES_LIST = 5;

	/**
	 * The feature id for the '<em><b>Result Mapping</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY__RESULT_MAPPING = 6;

	/**
	 * The feature id for the '<em><b>Excel Queries</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY__EXCEL_QUERIES = 7;

	/**
	 * The feature id for the '<em><b>Gspread Queries</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY__GSPREAD_QUERIES = 8;

	/**
	 * The feature id for the '<em><b>Query Parameters</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY__QUERY_PARAMETERS = 9;

	/**
	 * The feature id for the '<em><b>Return Row Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY__RETURN_ROW_ID = 10;

	/**
	 * The number of structural features of the '<em>Query</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '
	 * {@link org.wso2.carbonstudio.eclipse.ds.impl.QueryParameterImpl
	 * <em>Query Parameter</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.wso2.carbonstudio.eclipse.ds.impl.QueryParameterImpl
	 * @see org.wso2.carbonstudio.eclipse.ds.impl.DsPackageImpl#getQueryParameter()
	 * @generated
	 */
	int QUERY_PARAMETER = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Sql Type</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER__SQL_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER__DEFAULT_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Ordinal</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER__ORDINAL = 4;

	/**
	 * The feature id for the '<em><b>Param Type</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER__PARAM_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Long Range Validator</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER__LONG_RANGE_VALIDATOR = 6;

	/**
	 * The feature id for the '<em><b>Double Range Validator</b></em>'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER__DOUBLE_RANGE_VALIDATOR = 7;

	/**
	 * The feature id for the '<em><b>Length Validator</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER__LENGTH_VALIDATOR = 8;

	/**
	 * The feature id for the '<em><b>Pattern Validators</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER__PATTERN_VALIDATORS = 9;

	/**
	 * The feature id for the '<em><b>Custom Validators</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER__CUSTOM_VALIDATORS = 10;

	/**
	 * The number of structural features of the '<em>Query Parameter</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '
	 * {@link org.wso2.carbonstudio.eclipse.ds.impl.QueryPropertyImpl
	 * <em>Query Property</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.wso2.carbonstudio.eclipse.ds.impl.QueryPropertyImpl
	 * @see org.wso2.carbonstudio.eclipse.ds.impl.DsPackageImpl#getQueryProperty()
	 * @generated
	 */
	int QUERY_PROPERTY = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PROPERTY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PROPERTY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Query Property</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PROPERTY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '
	 * {@link org.wso2.carbonstudio.eclipse.ds.impl.QueryPropertyListImpl
	 * <em>Query Property List</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.wso2.carbonstudio.eclipse.ds.impl.QueryPropertyListImpl
	 * @see org.wso2.carbonstudio.eclipse.ds.impl.DsPackageImpl#getQueryPropertyList()
	 * @generated
	 */
	int QUERY_PROPERTY_LIST = 22;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PROPERTY_LIST__PROPERTIES = 0;

	/**
	 * The number of structural features of the '<em>Query Property List</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PROPERTY_LIST_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '
	 * {@link org.wso2.carbonstudio.eclipse.ds.impl.ResourceImpl
	 * <em>Resource</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.wso2.carbonstudio.eclipse.ds.impl.ResourceImpl
	 * @see org.wso2.carbonstudio.eclipse.ds.impl.DsPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 23;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOURCE__METHOD = 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOURCE__PATH = 1;

	/**
	 * The feature id for the '<em><b>Call Query</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOURCE__CALL_QUERY = 2;

	/**
	 * The feature id for the '<em><b>Call Query List</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOURCE__CALL_QUERY_LIST = 3;

	/**
	 * The number of structural features of the '<em>Resource</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '
	 * {@link org.wso2.carbonstudio.eclipse.ds.impl.ResultMappingImpl
	 * <em>Result Mapping</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.wso2.carbonstudio.eclipse.ds.impl.ResultMappingImpl
	 * @see org.wso2.carbonstudio.eclipse.ds.impl.DsPackageImpl#getResultMapping()
	 * @generated
	 */
	int RESULT_MAPPING = 24;

	/**
	 * The feature id for the '<em><b>Element Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESULT_MAPPING__ELEMENT_NAME = 0;

	/**
	 * The feature id for the '<em><b>Row Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESULT_MAPPING__ROW_NAME = 1;

	/**
	 * The feature id for the '<em><b>Default Namespace</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESULT_MAPPING__DEFAULT_NAMESPACE = 2;

	/**
	 * The feature id for the '<em><b>Xslt Path</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESULT_MAPPING__XSLT_PATH = 3;

	/**
	 * The feature id for the '<em><b>Output Type</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESULT_MAPPING__OUTPUT_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Element Mappings</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESULT_MAPPING__ELEMENT_MAPPINGS = 5;

	/**
	 * The feature id for the '<em><b>Attribute Mappings</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESULT_MAPPING__ATTRIBUTE_MAPPINGS = 6;

	/**
	 * The feature id for the '<em><b>Call Queries</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESULT_MAPPING__CALL_QUERIES = 7;

	/**
	 * The number of structural features of the '<em>Result Mapping</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESULT_MAPPING_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '
	 * {@link org.wso2.carbonstudio.eclipse.ds.ServiceStatus
	 * <em>Service Status</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.wso2.carbonstudio.eclipse.ds.ServiceStatus
	 * @see org.wso2.carbonstudio.eclipse.ds.impl.DsPackageImpl#getServiceStatus()
	 * @generated
	 */
	int SERVICE_STATUS = 25;

	/**
	 * The meta object id for the '<em>Service Status Object</em>' data type.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.wso2.carbonstudio.eclipse.ds.ServiceStatus
	 * @see org.wso2.carbonstudio.eclipse.ds.impl.DsPackageImpl#getServiceStatusObject()
	 * @generated
	 */
	int SERVICE_STATUS_OBJECT = 26;

	/**
	 * Returns the meta object for class '
	 * {@link org.wso2.carbonstudio.eclipse.ds.AttributeMapping
	 * <em>Attribute Mapping</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Attribute Mapping</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.AttributeMapping
	 * @generated
	 */
	EClass getAttributeMapping();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.wso2.carbonstudio.eclipse.ds.AttributeMapping#getAttributeName
	 * <em>Attribute Name</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Attribute Name</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.AttributeMapping#getAttributeName()
	 * @see #getAttributeMapping()
	 * @generated
	 */
	EAttribute getAttributeMapping_AttributeName();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.wso2.carbonstudio.eclipse.ds.AttributeMapping#getColumnName
	 * <em>Column Name</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Column Name</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.AttributeMapping#getColumnName()
	 * @see #getAttributeMapping()
	 * @generated
	 */
	EAttribute getAttributeMapping_ColumnName();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.wso2.carbonstudio.eclipse.ds.AttributeMapping#getQueryParam
	 * <em>Query Param</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Query Param</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.AttributeMapping#getQueryParam()
	 * @see #getAttributeMapping()
	 * @generated
	 */
	EAttribute getAttributeMapping_QueryParam();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.wso2.carbonstudio.eclipse.ds.AttributeMapping#getRequiredRoles
	 * <em>Required Roles</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Required Roles</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.AttributeMapping#getRequiredRoles()
	 * @see #getAttributeMapping()
	 * @generated
	 */
	EAttribute getAttributeMapping_RequiredRoles();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.wso2.carbonstudio.eclipse.ds.AttributeMapping#getXsdType
	 * <em>Xsd Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Xsd Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.AttributeMapping#getXsdType()
	 * @see #getAttributeMapping()
	 * @generated
	 */
	EAttribute getAttributeMapping_XsdType();

	/**
	 * Returns the meta object for class '
	 * {@link org.wso2.carbonstudio.eclipse.ds.CallQuery <em>Call Query</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Call Query</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.CallQuery
	 * @generated
	 */
	EClass getCallQuery();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.wso2.carbonstudio.eclipse.ds.CallQuery#getHref <em>Href</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.CallQuery#getHref()
	 * @see #getCallQuery()
	 * @generated
	 */
	EAttribute getCallQuery_Href();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.wso2.carbonstudio.eclipse.ds.CallQuery#getParameterMappings
	 * <em>Parameter Mappings</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Parameter Mappings</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.CallQuery#getParameterMappings()
	 * @see #getCallQuery()
	 * @generated
	 */
	EReference getCallQuery_ParameterMappings();

	/**
	 * Returns the meta object for class '
	 * {@link org.wso2.carbonstudio.eclipse.ds.CallQueryList
	 * <em>Call Query List</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Call Query List</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.CallQueryList
	 * @generated
	 */
	EClass getCallQueryList();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.wso2.carbonstudio.eclipse.ds.CallQueryList#getQueries
	 * <em>Queries</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Queries</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.CallQueryList#getQueries()
	 * @see #getCallQueryList()
	 * @generated
	 */
	EReference getCallQueryList_Queries();

	/**
	 * Returns the meta object for class '
	 * {@link org.wso2.carbonstudio.eclipse.ds.ConfigurationProperty
	 * <em>Configuration Property</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Configuration Property</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.ConfigurationProperty
	 * @generated
	 */
	EClass getConfigurationProperty();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.wso2.carbonstudio.eclipse.ds.ConfigurationProperty#getName
	 * <em>Name</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.ConfigurationProperty#getName()
	 * @see #getConfigurationProperty()
	 * @generated
	 */
	EAttribute getConfigurationProperty_Name();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.wso2.carbonstudio.eclipse.ds.ConfigurationProperty#getValue
	 * <em>Value</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.ConfigurationProperty#getValue()
	 * @see #getConfigurationProperty()
	 * @generated
	 */
	EAttribute getConfigurationProperty_Value();

	/**
	 * Returns the meta object for class '
	 * {@link org.wso2.carbonstudio.eclipse.ds.CustomValidator
	 * <em>Custom Validator</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Custom Validator</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.CustomValidator
	 * @generated
	 */
	EClass getCustomValidator();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.wso2.carbonstudio.eclipse.ds.CustomValidator#getClassName
	 * <em>Class Name</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.CustomValidator#getClassName()
	 * @see #getCustomValidator()
	 * @generated
	 */
	EAttribute getCustomValidator_ClassName();

	/**
	 * Returns the meta object for class '
	 * {@link org.wso2.carbonstudio.eclipse.ds.DataService
	 * <em>Data Service</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Data Service</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.DataService
	 * @generated
	 */
	EClass getDataService();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.wso2.carbonstudio.eclipse.ds.DataService#getName
	 * <em>Name</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.DataService#getName()
	 * @see #getDataService()
	 * @generated
	 */
	EAttribute getDataService_Name();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.wso2.carbonstudio.eclipse.ds.DataService#getDescription
	 * <em>Description</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.DataService#getDescription()
	 * @see #getDataService()
	 * @generated
	 */
	EAttribute getDataService_Description();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.wso2.carbonstudio.eclipse.ds.DataService#getBaseURI
	 * <em>Base URI</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Base URI</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.DataService#getBaseURI()
	 * @see #getDataService()
	 * @generated
	 */
	EAttribute getDataService_BaseURI();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.wso2.carbonstudio.eclipse.ds.DataService#isEnableBatchRequests
	 * <em>Enable Batch Requests</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Enable Batch Requests</em>
	 *         '.
	 * @see org.wso2.carbonstudio.eclipse.ds.DataService#isEnableBatchRequests()
	 * @see #getDataService()
	 * @generated
	 */
	EAttribute getDataService_EnableBatchRequests();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.wso2.carbonstudio.eclipse.ds.DataService#isEnableBoxcarring
	 * <em>Enable Boxcarring</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the attribute '<em>Enable Boxcarring</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.DataService#isEnableBoxcarring()
	 * @see #getDataService()
	 * @generated
	 */
	EAttribute getDataService_EnableBoxcarring();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.wso2.carbonstudio.eclipse.ds.DataService#getServiceStatus
	 * <em>Service Status</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Service Status</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.DataService#getServiceStatus()
	 * @see #getDataService()
	 * @generated
	 */
	EAttribute getDataService_ServiceStatus();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.wso2.carbonstudio.eclipse.ds.DataService#getDataSources
	 * <em>Data Sources</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Data Sources</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.DataService#getDataSources()
	 * @see #getDataService()
	 * @generated
	 */
	EReference getDataService_DataSources();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.wso2.carbonstudio.eclipse.ds.DataService#getQueries
	 * <em>Queries</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Queries</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.DataService#getQueries()
	 * @see #getDataService()
	 * @generated
	 */
	EReference getDataService_Queries();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.wso2.carbonstudio.eclipse.ds.DataService#getEventTriggers
	 * <em>Event Triggers</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Event Triggers</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.DataService#getEventTriggers()
	 * @see #getDataService()
	 * @generated
	 */
	EReference getDataService_EventTriggers();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.wso2.carbonstudio.eclipse.ds.DataService#getOperations
	 * <em>Operations</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Operations</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.DataService#getOperations()
	 * @see #getDataService()
	 * @generated
	 */
	EReference getDataService_Operations();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.wso2.carbonstudio.eclipse.ds.DataService#getResources
	 * <em>Resources</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Resources</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.DataService#getResources()
	 * @see #getDataService()
	 * @generated
	 */
	EReference getDataService_Resources();

	/**
	 * Returns the meta object for class '
	 * {@link org.wso2.carbonstudio.eclipse.ds.DataSourceConfiguration
	 * <em>Data Source Configuration</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Data Source Configuration</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.DataSourceConfiguration
	 * @generated
	 */
	EClass getDataSourceConfiguration();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.wso2.carbonstudio.eclipse.ds.DataSourceConfiguration#getId
	 * <em>Id</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.DataSourceConfiguration#getId()
	 * @see #getDataSourceConfiguration()
	 * @generated
	 */
	EAttribute getDataSourceConfiguration_Id();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.wso2.carbonstudio.eclipse.ds.DataSourceConfiguration#getConfigurationProperties
	 * <em>Configuration Properties</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Configuration Properties</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.DataSourceConfiguration#getConfigurationProperties()
	 * @see #getDataSourceConfiguration()
	 * @generated
	 */
	EReference getDataSourceConfiguration_ConfigurationProperties();

	/**
	 * Returns the meta object for class '
	 * {@link org.wso2.carbonstudio.eclipse.ds.DocumentRoot
	 * <em>Document Root</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '
	 * {@link org.wso2.carbonstudio.eclipse.ds.DocumentRoot#getMixed
	 * <em>Mixed</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '
	 * {@link org.wso2.carbonstudio.eclipse.ds.DocumentRoot#getXMLNSPrefixMap
	 * <em>XMLNS Prefix Map</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '
	 * {@link org.wso2.carbonstudio.eclipse.ds.DocumentRoot#getXSISchemaLocation
	 * <em>XSI Schema Location</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.wso2.carbonstudio.eclipse.ds.DocumentRoot#getData
	 * <em>Data</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Data</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.DocumentRoot#getData()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Data();

	/**
	 * Returns the meta object for class '
	 * {@link org.wso2.carbonstudio.eclipse.ds.DoubleRangeValidator
	 * <em>Double Range Validator</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Double Range Validator</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.DoubleRangeValidator
	 * @generated
	 */
	EClass getDoubleRangeValidator();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.wso2.carbonstudio.eclipse.ds.DoubleRangeValidator#getMinValue
	 * <em>Min Value</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Min Value</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.DoubleRangeValidator#getMinValue()
	 * @see #getDoubleRangeValidator()
	 * @generated
	 */
	EAttribute getDoubleRangeValidator_MinValue();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.wso2.carbonstudio.eclipse.ds.DoubleRangeValidator#getMaxValue
	 * <em>Max Value</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Max Value</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.DoubleRangeValidator#getMaxValue()
	 * @see #getDoubleRangeValidator()
	 * @generated
	 */
	EAttribute getDoubleRangeValidator_MaxValue();

	/**
	 * Returns the meta object for class '
	 * {@link org.wso2.carbonstudio.eclipse.ds.ElementMapping
	 * <em>Element Mapping</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Element Mapping</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.ElementMapping
	 * @generated
	 */
	EClass getElementMapping();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.wso2.carbonstudio.eclipse.ds.ElementMapping#getElementName
	 * <em>Element Name</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Element Name</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.ElementMapping#getElementName()
	 * @see #getElementMapping()
	 * @generated
	 */
	EAttribute getElementMapping_ElementName();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.wso2.carbonstudio.eclipse.ds.ElementMapping#getColumnName
	 * <em>Column Name</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Column Name</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.ElementMapping#getColumnName()
	 * @see #getElementMapping()
	 * @generated
	 */
	EAttribute getElementMapping_ColumnName();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.wso2.carbonstudio.eclipse.ds.ElementMapping#getQueryParam
	 * <em>Query Param</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Query Param</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.ElementMapping#getQueryParam()
	 * @see #getElementMapping()
	 * @generated
	 */
	EAttribute getElementMapping_QueryParam();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.wso2.carbonstudio.eclipse.ds.ElementMapping#getRequiredRoles
	 * <em>Required Roles</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Required Roles</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.ElementMapping#getRequiredRoles()
	 * @see #getElementMapping()
	 * @generated
	 */
	EAttribute getElementMapping_RequiredRoles();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.wso2.carbonstudio.eclipse.ds.ElementMapping#getXsdType
	 * <em>Xsd Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Xsd Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.ElementMapping#getXsdType()
	 * @see #getElementMapping()
	 * @generated
	 */
	EAttribute getElementMapping_XsdType();

	/**
	 * Returns the meta object for class '
	 * {@link org.wso2.carbonstudio.eclipse.ds.EventSubscriptionList
	 * <em>Event Subscription List</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Event Subscription List</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.EventSubscriptionList
	 * @generated
	 */
	EClass getEventSubscriptionList();

	/**
	 * Returns the meta object for the attribute list '
	 * {@link org.wso2.carbonstudio.eclipse.ds.EventSubscriptionList#getSubscriptions
	 * <em>Subscriptions</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute list '<em>Subscriptions</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.EventSubscriptionList#getSubscriptions()
	 * @see #getEventSubscriptionList()
	 * @generated
	 */
	EAttribute getEventSubscriptionList_Subscriptions();

	/**
	 * Returns the meta object for class '
	 * {@link org.wso2.carbonstudio.eclipse.ds.EventTrigger
	 * <em>Event Trigger</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Event Trigger</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.EventTrigger
	 * @generated
	 */
	EClass getEventTrigger();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.wso2.carbonstudio.eclipse.ds.EventTrigger#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.EventTrigger#getId()
	 * @see #getEventTrigger()
	 * @generated
	 */
	EAttribute getEventTrigger_Id();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.wso2.carbonstudio.eclipse.ds.EventTrigger#getExpression
	 * <em>Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.EventTrigger#getExpression()
	 * @see #getEventTrigger()
	 * @generated
	 */
	EAttribute getEventTrigger_Expression();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.wso2.carbonstudio.eclipse.ds.EventTrigger#getTargetTopic
	 * <em>Target Topic</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Target Topic</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.EventTrigger#getTargetTopic()
	 * @see #getEventTrigger()
	 * @generated
	 */
	EAttribute getEventTrigger_TargetTopic();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.wso2.carbonstudio.eclipse.ds.EventTrigger#getSubscriptionsList
	 * <em>Subscriptions List</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Subscriptions List</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.EventTrigger#getSubscriptionsList()
	 * @see #getEventTrigger()
	 * @generated
	 */
	EReference getEventTrigger_SubscriptionsList();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.wso2.carbonstudio.eclipse.ds.EventTrigger#getLanguage
	 * <em>Language</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.EventTrigger#getLanguage()
	 * @see #getEventTrigger()
	 * @generated
	 */
	EAttribute getEventTrigger_Language();

	/**
	 * Returns the meta object for class '
	 * {@link org.wso2.carbonstudio.eclipse.ds.ExcelQuery <em>Excel Query</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Excel Query</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.ExcelQuery
	 * @generated
	 */
	EClass getExcelQuery();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.wso2.carbonstudio.eclipse.ds.ExcelQuery#getWorkbookName
	 * <em>Workbook Name</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Workbook Name</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.ExcelQuery#getWorkbookName()
	 * @see #getExcelQuery()
	 * @generated
	 */
	EAttribute getExcelQuery_WorkbookName();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.wso2.carbonstudio.eclipse.ds.ExcelQuery#getStartingRow
	 * <em>Starting Row</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Starting Row</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.ExcelQuery#getStartingRow()
	 * @see #getExcelQuery()
	 * @generated
	 */
	EAttribute getExcelQuery_StartingRow();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.wso2.carbonstudio.eclipse.ds.ExcelQuery#getMaxRowCount
	 * <em>Max Row Count</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Max Row Count</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.ExcelQuery#getMaxRowCount()
	 * @see #getExcelQuery()
	 * @generated
	 */
	EAttribute getExcelQuery_MaxRowCount();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.wso2.carbonstudio.eclipse.ds.ExcelQuery#isHasHeader
	 * <em>Has Header</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Has Header</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.ExcelQuery#isHasHeader()
	 * @see #getExcelQuery()
	 * @generated
	 */
	EAttribute getExcelQuery_HasHeader();

	/**
	 * Returns the meta object for class '
	 * {@link org.wso2.carbonstudio.eclipse.ds.GSpreadQuery
	 * <em>GSpread Query</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>GSpread Query</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.GSpreadQuery
	 * @generated
	 */
	EClass getGSpreadQuery();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.wso2.carbonstudio.eclipse.ds.GSpreadQuery#getWorksheetNumber
	 * <em>Worksheet Number</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the attribute '<em>Worksheet Number</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.GSpreadQuery#getWorksheetNumber()
	 * @see #getGSpreadQuery()
	 * @generated
	 */
	EAttribute getGSpreadQuery_WorksheetNumber();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.wso2.carbonstudio.eclipse.ds.GSpreadQuery#getStartingRow
	 * <em>Starting Row</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Starting Row</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.GSpreadQuery#getStartingRow()
	 * @see #getGSpreadQuery()
	 * @generated
	 */
	EAttribute getGSpreadQuery_StartingRow();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.wso2.carbonstudio.eclipse.ds.GSpreadQuery#getMaxRowCount
	 * <em>Max Row Count</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Max Row Count</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.GSpreadQuery#getMaxRowCount()
	 * @see #getGSpreadQuery()
	 * @generated
	 */
	EAttribute getGSpreadQuery_MaxRowCount();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.wso2.carbonstudio.eclipse.ds.GSpreadQuery#isHasHeader
	 * <em>Has Header</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Has Header</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.GSpreadQuery#isHasHeader()
	 * @see #getGSpreadQuery()
	 * @generated
	 */
	EAttribute getGSpreadQuery_HasHeader();

	/**
	 * Returns the meta object for class '
	 * {@link org.wso2.carbonstudio.eclipse.ds.LengthValidator
	 * <em>Length Validator</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Length Validator</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.LengthValidator
	 * @generated
	 */
	EClass getLengthValidator();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.wso2.carbonstudio.eclipse.ds.LengthValidator#getMinValue
	 * <em>Min Value</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Min Value</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.LengthValidator#getMinValue()
	 * @see #getLengthValidator()
	 * @generated
	 */
	EAttribute getLengthValidator_MinValue();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.wso2.carbonstudio.eclipse.ds.LengthValidator#getMaxValue
	 * <em>Max Value</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Max Value</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.LengthValidator#getMaxValue()
	 * @see #getLengthValidator()
	 * @generated
	 */
	EAttribute getLengthValidator_MaxValue();

	/**
	 * Returns the meta object for class '
	 * {@link org.wso2.carbonstudio.eclipse.ds.LongRangeValidator
	 * <em>Long Range Validator</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Long Range Validator</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.LongRangeValidator
	 * @generated
	 */
	EClass getLongRangeValidator();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.wso2.carbonstudio.eclipse.ds.LongRangeValidator#getMinValue
	 * <em>Min Value</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Min Value</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.LongRangeValidator#getMinValue()
	 * @see #getLongRangeValidator()
	 * @generated
	 */
	EAttribute getLongRangeValidator_MinValue();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.wso2.carbonstudio.eclipse.ds.LongRangeValidator#getMaxValue
	 * <em>Max Value</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Max Value</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.LongRangeValidator#getMaxValue()
	 * @see #getLongRangeValidator()
	 * @generated
	 */
	EAttribute getLongRangeValidator_MaxValue();

	/**
	 * Returns the meta object for class '
	 * {@link org.wso2.carbonstudio.eclipse.ds.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.wso2.carbonstudio.eclipse.ds.Operation#getName <em>Name</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.Operation#getName()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Name();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.wso2.carbonstudio.eclipse.ds.Operation#getCallQuery
	 * <em>Call Query</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Call Query</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.Operation#getCallQuery()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_CallQuery();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.wso2.carbonstudio.eclipse.ds.Operation#getCallQueryList
	 * <em>Call Query List</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Call Query List</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.Operation#getCallQueryList()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_CallQueryList();

	/**
	 * Returns the meta object for class '
	 * {@link org.wso2.carbonstudio.eclipse.ds.ParameterMapping
	 * <em>Parameter Mapping</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Parameter Mapping</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.ParameterMapping
	 * @generated
	 */
	EClass getParameterMapping();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.wso2.carbonstudio.eclipse.ds.ParameterMapping#getParameterName
	 * <em>Parameter Name</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Parameter Name</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.ParameterMapping#getParameterName()
	 * @see #getParameterMapping()
	 * @generated
	 */
	EAttribute getParameterMapping_ParameterName();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.wso2.carbonstudio.eclipse.ds.ParameterMapping#getColumnName
	 * <em>Column Name</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Column Name</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.ParameterMapping#getColumnName()
	 * @see #getParameterMapping()
	 * @generated
	 */
	EAttribute getParameterMapping_ColumnName();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.wso2.carbonstudio.eclipse.ds.ParameterMapping#getQueryParam
	 * <em>Query Param</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Query Param</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.ParameterMapping#getQueryParam()
	 * @see #getParameterMapping()
	 * @generated
	 */
	EAttribute getParameterMapping_QueryParam();

	/**
	 * Returns the meta object for class '
	 * {@link org.wso2.carbonstudio.eclipse.ds.PatternValidator
	 * <em>Pattern Validator</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Pattern Validator</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.PatternValidator
	 * @generated
	 */
	EClass getPatternValidator();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.wso2.carbonstudio.eclipse.ds.PatternValidator#getPatternString
	 * <em>Pattern String</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Pattern String</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.PatternValidator#getPatternString()
	 * @see #getPatternValidator()
	 * @generated
	 */
	EAttribute getPatternValidator_PatternString();

	/**
	 * Returns the meta object for class '
	 * {@link org.wso2.carbonstudio.eclipse.ds.Query <em>Query</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Query</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.Query
	 * @generated
	 */
	EClass getQuery();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.wso2.carbonstudio.eclipse.ds.Query#getId <em>Id</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.Query#getId()
	 * @see #getQuery()
	 * @generated
	 */
	EAttribute getQuery_Id();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.wso2.carbonstudio.eclipse.ds.Query#getInputTriggerName
	 * <em>Input Trigger Name</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the attribute '<em>Input Trigger Name</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.Query#getInputTriggerName()
	 * @see #getQuery()
	 * @generated
	 */
	EAttribute getQuery_InputTriggerName();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.wso2.carbonstudio.eclipse.ds.Query#getOutputTriggerName
	 * <em>Output Trigger Name</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the attribute '<em>Output Trigger Name</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.Query#getOutputTriggerName()
	 * @see #getQuery()
	 * @generated
	 */
	EAttribute getQuery_OutputTriggerName();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.wso2.carbonstudio.eclipse.ds.Query#getDataSourceId
	 * <em>Data Source Id</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Data Source Id</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.Query#getDataSourceId()
	 * @see #getQuery()
	 * @generated
	 */
	EAttribute getQuery_DataSourceId();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.wso2.carbonstudio.eclipse.ds.Query#getSqlStatement
	 * <em>Sql Statement</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Sql Statement</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.Query#getSqlStatement()
	 * @see #getQuery()
	 * @generated
	 */
	EAttribute getQuery_SqlStatement();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.wso2.carbonstudio.eclipse.ds.Query#getPropertiesList
	 * <em>Properties List</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Properties List</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.Query#getPropertiesList()
	 * @see #getQuery()
	 * @generated
	 */
	EReference getQuery_PropertiesList();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.wso2.carbonstudio.eclipse.ds.Query#getResultMapping
	 * <em>Result Mapping</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Result Mapping</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.Query#getResultMapping()
	 * @see #getQuery()
	 * @generated
	 */
	EReference getQuery_ResultMapping();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.wso2.carbonstudio.eclipse.ds.Query#getExcelQueries
	 * <em>Excel Queries</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Excel Queries</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.Query#getExcelQueries()
	 * @see #getQuery()
	 * @generated
	 */
	EReference getQuery_ExcelQueries();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.wso2.carbonstudio.eclipse.ds.Query#getGspreadQueries
	 * <em>Gspread Queries</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Gspread Queries</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.Query#getGspreadQueries()
	 * @see #getQuery()
	 * @generated
	 */
	EReference getQuery_GspreadQueries();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.wso2.carbonstudio.eclipse.ds.Query#getQueryParameters
	 * <em>Query Parameters</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Query Parameters</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.Query#getQueryParameters()
	 * @see #getQuery()
	 * @generated
	 */
	EReference getQuery_QueryParameters();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.wso2.carbonstudio.eclipse.ds.Query#isReturnRowId
	 * <em>Return Row Id</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Return Row Id</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.Query#isReturnRowId()
	 * @see #getQuery()
	 * @generated
	 */
	EAttribute getQuery_ReturnRowId();

	/**
	 * Returns the meta object for class '
	 * {@link org.wso2.carbonstudio.eclipse.ds.QueryParameter
	 * <em>Query Parameter</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Query Parameter</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.QueryParameter
	 * @generated
	 */
	EClass getQueryParameter();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.wso2.carbonstudio.eclipse.ds.QueryParameter#getName
	 * <em>Name</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.QueryParameter#getName()
	 * @see #getQueryParameter()
	 * @generated
	 */
	EAttribute getQueryParameter_Name();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.wso2.carbonstudio.eclipse.ds.QueryParameter#getType
	 * <em>Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.QueryParameter#getType()
	 * @see #getQueryParameter()
	 * @generated
	 */
	EAttribute getQueryParameter_Type();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.wso2.carbonstudio.eclipse.ds.QueryParameter#getSqlType
	 * <em>Sql Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Sql Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.QueryParameter#getSqlType()
	 * @see #getQueryParameter()
	 * @generated
	 */
	EAttribute getQueryParameter_SqlType();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.wso2.carbonstudio.eclipse.ds.QueryParameter#getDefaultValue
	 * <em>Default Value</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.QueryParameter#getDefaultValue()
	 * @see #getQueryParameter()
	 * @generated
	 */
	EAttribute getQueryParameter_DefaultValue();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.wso2.carbonstudio.eclipse.ds.QueryParameter#getOrdinal
	 * <em>Ordinal</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Ordinal</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.QueryParameter#getOrdinal()
	 * @see #getQueryParameter()
	 * @generated
	 */
	EAttribute getQueryParameter_Ordinal();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.wso2.carbonstudio.eclipse.ds.QueryParameter#getParamType
	 * <em>Param Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Param Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.QueryParameter#getParamType()
	 * @see #getQueryParameter()
	 * @generated
	 */
	EAttribute getQueryParameter_ParamType();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.wso2.carbonstudio.eclipse.ds.QueryParameter#getLongRangeValidator
	 * <em>Long Range Validator</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Long Range Validator</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.QueryParameter#getLongRangeValidator()
	 * @see #getQueryParameter()
	 * @generated
	 */
	EReference getQueryParameter_LongRangeValidator();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.wso2.carbonstudio.eclipse.ds.QueryParameter#getDoubleRangeValidator
	 * <em>Double Range Validator</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Double Range Validator</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.QueryParameter#getDoubleRangeValidator()
	 * @see #getQueryParameter()
	 * @generated
	 */
	EReference getQueryParameter_DoubleRangeValidator();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.wso2.carbonstudio.eclipse.ds.QueryParameter#getLengthValidator
	 * <em>Length Validator</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Length Validator</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.QueryParameter#getLengthValidator()
	 * @see #getQueryParameter()
	 * @generated
	 */
	EReference getQueryParameter_LengthValidator();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.wso2.carbonstudio.eclipse.ds.QueryParameter#getPatternValidators
	 * <em>Pattern Validators</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Pattern Validators</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.QueryParameter#getPatternValidators()
	 * @see #getQueryParameter()
	 * @generated
	 */
	EReference getQueryParameter_PatternValidators();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.wso2.carbonstudio.eclipse.ds.QueryParameter#getCustomValidators
	 * <em>Custom Validators</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Custom Validators</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.QueryParameter#getCustomValidators()
	 * @see #getQueryParameter()
	 * @generated
	 */
	EReference getQueryParameter_CustomValidators();

	/**
	 * Returns the meta object for class '
	 * {@link org.wso2.carbonstudio.eclipse.ds.QueryProperty
	 * <em>Query Property</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Query Property</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.QueryProperty
	 * @generated
	 */
	EClass getQueryProperty();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.wso2.carbonstudio.eclipse.ds.QueryProperty#getName
	 * <em>Name</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.QueryProperty#getName()
	 * @see #getQueryProperty()
	 * @generated
	 */
	EAttribute getQueryProperty_Name();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.wso2.carbonstudio.eclipse.ds.QueryProperty#getValue
	 * <em>Value</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.QueryProperty#getValue()
	 * @see #getQueryProperty()
	 * @generated
	 */
	EAttribute getQueryProperty_Value();

	/**
	 * Returns the meta object for class '
	 * {@link org.wso2.carbonstudio.eclipse.ds.QueryPropertyList
	 * <em>Query Property List</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Query Property List</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.QueryPropertyList
	 * @generated
	 */
	EClass getQueryPropertyList();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.wso2.carbonstudio.eclipse.ds.QueryPropertyList#getProperties
	 * <em>Properties</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Properties</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.QueryPropertyList#getProperties()
	 * @see #getQueryPropertyList()
	 * @generated
	 */
	EReference getQueryPropertyList_Properties();

	/**
	 * Returns the meta object for class '
	 * {@link org.wso2.carbonstudio.eclipse.ds.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.wso2.carbonstudio.eclipse.ds.Resource#getMethod
	 * <em>Method</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.Resource#getMethod()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Method();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.wso2.carbonstudio.eclipse.ds.Resource#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.Resource#getPath()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Path();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.wso2.carbonstudio.eclipse.ds.Resource#getCallQuery
	 * <em>Call Query</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Call Query</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.Resource#getCallQuery()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_CallQuery();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.wso2.carbonstudio.eclipse.ds.Resource#getCallQueryList
	 * <em>Call Query List</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Call Query List</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.Resource#getCallQueryList()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_CallQueryList();

	/**
	 * Returns the meta object for class '
	 * {@link org.wso2.carbonstudio.eclipse.ds.ResultMapping
	 * <em>Result Mapping</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Result Mapping</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.ResultMapping
	 * @generated
	 */
	EClass getResultMapping();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.wso2.carbonstudio.eclipse.ds.ResultMapping#getElementName
	 * <em>Element Name</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Element Name</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.ResultMapping#getElementName()
	 * @see #getResultMapping()
	 * @generated
	 */
	EAttribute getResultMapping_ElementName();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.wso2.carbonstudio.eclipse.ds.ResultMapping#getRowName
	 * <em>Row Name</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Row Name</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.ResultMapping#getRowName()
	 * @see #getResultMapping()
	 * @generated
	 */
	EAttribute getResultMapping_RowName();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.wso2.carbonstudio.eclipse.ds.ResultMapping#getDefaultNamespace
	 * <em>Default Namespace</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the attribute '<em>Default Namespace</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.ResultMapping#getDefaultNamespace()
	 * @see #getResultMapping()
	 * @generated
	 */
	EAttribute getResultMapping_DefaultNamespace();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.wso2.carbonstudio.eclipse.ds.ResultMapping#getXsltPath
	 * <em>Xslt Path</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Xslt Path</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.ResultMapping#getXsltPath()
	 * @see #getResultMapping()
	 * @generated
	 */
	EAttribute getResultMapping_XsltPath();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.wso2.carbonstudio.eclipse.ds.ResultMapping#getOutputType
	 * <em>Output Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Output Type</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.ResultMapping#getOutputType()
	 * @see #getResultMapping()
	 * @generated
	 */
	EAttribute getResultMapping_OutputType();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.wso2.carbonstudio.eclipse.ds.ResultMapping#getElementMappings
	 * <em>Element Mappings</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Element Mappings</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.ResultMapping#getElementMappings()
	 * @see #getResultMapping()
	 * @generated
	 */
	EReference getResultMapping_ElementMappings();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.wso2.carbonstudio.eclipse.ds.ResultMapping#getAttributeMappings
	 * <em>Attribute Mappings</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Attribute Mappings</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.ResultMapping#getAttributeMappings()
	 * @see #getResultMapping()
	 * @generated
	 */
	EReference getResultMapping_AttributeMappings();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.wso2.carbonstudio.eclipse.ds.ResultMapping#getCallQueries
	 * <em>Call Queries</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Call Queries</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.ResultMapping#getCallQueries()
	 * @see #getResultMapping()
	 * @generated
	 */
	EReference getResultMapping_CallQueries();

	/**
	 * Returns the meta object for enum '
	 * {@link org.wso2.carbonstudio.eclipse.ds.ServiceStatus
	 * <em>Service Status</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>Service Status</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.ServiceStatus
	 * @generated
	 */
	EEnum getServiceStatus();

	/**
	 * Returns the meta object for data type '
	 * {@link org.wso2.carbonstudio.eclipse.ds.ServiceStatus
	 * <em>Service Status Object</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Service Status Object</em>'.
	 * @see org.wso2.carbonstudio.eclipse.ds.ServiceStatus
	 * @model instanceClass="org.wso2.carbonstudio.eclipse.ds.ServiceStatus"
	 *        extendedMetaData=
	 *        "name='serviceStatus_._type:Object' baseType='serviceStatus_._type'"
	 * @generated
	 */
	EDataType getServiceStatusObject();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DsFactory getDsFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that
	 * represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '
		 * {@link org.wso2.carbonstudio.eclipse.ds.impl.AttributeMappingImpl
		 * <em>Attribute Mapping</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.wso2.carbonstudio.eclipse.ds.impl.AttributeMappingImpl
		 * @see org.wso2.carbonstudio.eclipse.ds.impl.DsPackageImpl#getAttributeMapping()
		 * @generated
		 */
		EClass ATTRIBUTE_MAPPING = eINSTANCE.getAttributeMapping();

		/**
		 * The meta object literal for the '<em><b>Attribute Name</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ATTRIBUTE_MAPPING__ATTRIBUTE_NAME = eINSTANCE
				.getAttributeMapping_AttributeName();

		/**
		 * The meta object literal for the '<em><b>Column Name</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ATTRIBUTE_MAPPING__COLUMN_NAME = eINSTANCE.getAttributeMapping_ColumnName();

		/**
		 * The meta object literal for the '<em><b>Query Param</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ATTRIBUTE_MAPPING__QUERY_PARAM = eINSTANCE.getAttributeMapping_QueryParam();

		/**
		 * The meta object literal for the '<em><b>Required Roles</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ATTRIBUTE_MAPPING__REQUIRED_ROLES = eINSTANCE
				.getAttributeMapping_RequiredRoles();

		/**
		 * The meta object literal for the '<em><b>Xsd Type</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ATTRIBUTE_MAPPING__XSD_TYPE = eINSTANCE.getAttributeMapping_XsdType();

		/**
		 * The meta object literal for the '
		 * {@link org.wso2.carbonstudio.eclipse.ds.impl.CallQueryImpl
		 * <em>Call Query</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.wso2.carbonstudio.eclipse.ds.impl.CallQueryImpl
		 * @see org.wso2.carbonstudio.eclipse.ds.impl.DsPackageImpl#getCallQuery()
		 * @generated
		 */
		EClass CALL_QUERY = eINSTANCE.getCallQuery();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute CALL_QUERY__HREF = eINSTANCE.getCallQuery_Href();

		/**
		 * The meta object literal for the '<em><b>Parameter Mappings</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CALL_QUERY__PARAMETER_MAPPINGS = eINSTANCE.getCallQuery_ParameterMappings();

		/**
		 * The meta object literal for the '
		 * {@link org.wso2.carbonstudio.eclipse.ds.impl.CallQueryListImpl
		 * <em>Call Query List</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.wso2.carbonstudio.eclipse.ds.impl.CallQueryListImpl
		 * @see org.wso2.carbonstudio.eclipse.ds.impl.DsPackageImpl#getCallQueryList()
		 * @generated
		 */
		EClass CALL_QUERY_LIST = eINSTANCE.getCallQueryList();

		/**
		 * The meta object literal for the '<em><b>Queries</b></em>' containment
		 * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CALL_QUERY_LIST__QUERIES = eINSTANCE.getCallQueryList_Queries();

		/**
		 * The meta object literal for the '
		 * {@link org.wso2.carbonstudio.eclipse.ds.impl.ConfigurationPropertyImpl
		 * <em>Configuration Property</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.wso2.carbonstudio.eclipse.ds.impl.ConfigurationPropertyImpl
		 * @see org.wso2.carbonstudio.eclipse.ds.impl.DsPackageImpl#getConfigurationProperty()
		 * @generated
		 */
		EClass CONFIGURATION_PROPERTY = eINSTANCE.getConfigurationProperty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute CONFIGURATION_PROPERTY__NAME = eINSTANCE.getConfigurationProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute CONFIGURATION_PROPERTY__VALUE = eINSTANCE.getConfigurationProperty_Value();

		/**
		 * The meta object literal for the '
		 * {@link org.wso2.carbonstudio.eclipse.ds.impl.CustomValidatorImpl
		 * <em>Custom Validator</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.wso2.carbonstudio.eclipse.ds.impl.CustomValidatorImpl
		 * @see org.wso2.carbonstudio.eclipse.ds.impl.DsPackageImpl#getCustomValidator()
		 * @generated
		 */
		EClass CUSTOM_VALIDATOR = eINSTANCE.getCustomValidator();

		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute CUSTOM_VALIDATOR__CLASS_NAME = eINSTANCE.getCustomValidator_ClassName();

		/**
		 * The meta object literal for the '
		 * {@link org.wso2.carbonstudio.eclipse.ds.impl.DataServiceImpl
		 * <em>Data Service</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.wso2.carbonstudio.eclipse.ds.impl.DataServiceImpl
		 * @see org.wso2.carbonstudio.eclipse.ds.impl.DsPackageImpl#getDataService()
		 * @generated
		 */
		EClass DATA_SERVICE = eINSTANCE.getDataService();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute DATA_SERVICE__NAME = eINSTANCE.getDataService_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute DATA_SERVICE__DESCRIPTION = eINSTANCE.getDataService_Description();

		/**
		 * The meta object literal for the '<em><b>Base URI</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute DATA_SERVICE__BASE_URI = eINSTANCE.getDataService_BaseURI();

		/**
		 * The meta object literal for the '
		 * <em><b>Enable Batch Requests</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute DATA_SERVICE__ENABLE_BATCH_REQUESTS = eINSTANCE
				.getDataService_EnableBatchRequests();

		/**
		 * The meta object literal for the '<em><b>Enable Boxcarring</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute DATA_SERVICE__ENABLE_BOXCARRING = eINSTANCE.getDataService_EnableBoxcarring();

		/**
		 * The meta object literal for the '<em><b>Service Status</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute DATA_SERVICE__SERVICE_STATUS = eINSTANCE.getDataService_ServiceStatus();

		/**
		 * The meta object literal for the '<em><b>Data Sources</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DATA_SERVICE__DATA_SOURCES = eINSTANCE.getDataService_DataSources();

		/**
		 * The meta object literal for the '<em><b>Queries</b></em>' containment
		 * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DATA_SERVICE__QUERIES = eINSTANCE.getDataService_Queries();

		/**
		 * The meta object literal for the '<em><b>Event Triggers</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DATA_SERVICE__EVENT_TRIGGERS = eINSTANCE.getDataService_EventTriggers();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DATA_SERVICE__OPERATIONS = eINSTANCE.getDataService_Operations();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DATA_SERVICE__RESOURCES = eINSTANCE.getDataService_Resources();

		/**
		 * The meta object literal for the '
		 * {@link org.wso2.carbonstudio.eclipse.ds.impl.DataSourceConfigurationImpl
		 * <em>Data Source Configuration</em>}' class. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.wso2.carbonstudio.eclipse.ds.impl.DataSourceConfigurationImpl
		 * @see org.wso2.carbonstudio.eclipse.ds.impl.DsPackageImpl#getDataSourceConfiguration()
		 * @generated
		 */
		EClass DATA_SOURCE_CONFIGURATION = eINSTANCE.getDataSourceConfiguration();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute DATA_SOURCE_CONFIGURATION__ID = eINSTANCE.getDataSourceConfiguration_Id();

		/**
		 * The meta object literal for the '
		 * <em><b>Configuration Properties</b></em>' containment reference list
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DATA_SOURCE_CONFIGURATION__CONFIGURATION_PROPERTIES = eINSTANCE
				.getDataSourceConfiguration_ConfigurationProperties();

		/**
		 * The meta object literal for the '
		 * {@link org.wso2.carbonstudio.eclipse.ds.impl.DocumentRootImpl
		 * <em>Document Root</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.wso2.carbonstudio.eclipse.ds.impl.DocumentRootImpl
		 * @see org.wso2.carbonstudio.eclipse.ds.impl.DsPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute
		 * list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>'
		 * map feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>'
		 * map feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE
				.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DATA = eINSTANCE.getDocumentRoot_Data();

		/**
		 * The meta object literal for the '
		 * {@link org.wso2.carbonstudio.eclipse.ds.impl.DoubleRangeValidatorImpl
		 * <em>Double Range Validator</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.wso2.carbonstudio.eclipse.ds.impl.DoubleRangeValidatorImpl
		 * @see org.wso2.carbonstudio.eclipse.ds.impl.DsPackageImpl#getDoubleRangeValidator()
		 * @generated
		 */
		EClass DOUBLE_RANGE_VALIDATOR = eINSTANCE.getDoubleRangeValidator();

		/**
		 * The meta object literal for the '<em><b>Min Value</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute DOUBLE_RANGE_VALIDATOR__MIN_VALUE = eINSTANCE.getDoubleRangeValidator_MinValue();

		/**
		 * The meta object literal for the '<em><b>Max Value</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute DOUBLE_RANGE_VALIDATOR__MAX_VALUE = eINSTANCE.getDoubleRangeValidator_MaxValue();

		/**
		 * The meta object literal for the '
		 * {@link org.wso2.carbonstudio.eclipse.ds.impl.ElementMappingImpl
		 * <em>Element Mapping</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.wso2.carbonstudio.eclipse.ds.impl.ElementMappingImpl
		 * @see org.wso2.carbonstudio.eclipse.ds.impl.DsPackageImpl#getElementMapping()
		 * @generated
		 */
		EClass ELEMENT_MAPPING = eINSTANCE.getElementMapping();

		/**
		 * The meta object literal for the '<em><b>Element Name</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ELEMENT_MAPPING__ELEMENT_NAME = eINSTANCE.getElementMapping_ElementName();

		/**
		 * The meta object literal for the '<em><b>Column Name</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ELEMENT_MAPPING__COLUMN_NAME = eINSTANCE.getElementMapping_ColumnName();

		/**
		 * The meta object literal for the '<em><b>Query Param</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ELEMENT_MAPPING__QUERY_PARAM = eINSTANCE.getElementMapping_QueryParam();

		/**
		 * The meta object literal for the '<em><b>Required Roles</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ELEMENT_MAPPING__REQUIRED_ROLES = eINSTANCE.getElementMapping_RequiredRoles();

		/**
		 * The meta object literal for the '<em><b>Xsd Type</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ELEMENT_MAPPING__XSD_TYPE = eINSTANCE.getElementMapping_XsdType();

		/**
		 * The meta object literal for the '
		 * {@link org.wso2.carbonstudio.eclipse.ds.impl.EventSubscriptionListImpl
		 * <em>Event Subscription List</em>}' class. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.wso2.carbonstudio.eclipse.ds.impl.EventSubscriptionListImpl
		 * @see org.wso2.carbonstudio.eclipse.ds.impl.DsPackageImpl#getEventSubscriptionList()
		 * @generated
		 */
		EClass EVENT_SUBSCRIPTION_LIST = eINSTANCE.getEventSubscriptionList();

		/**
		 * The meta object literal for the '<em><b>Subscriptions</b></em>'
		 * attribute list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute EVENT_SUBSCRIPTION_LIST__SUBSCRIPTIONS = eINSTANCE
				.getEventSubscriptionList_Subscriptions();

		/**
		 * The meta object literal for the '
		 * {@link org.wso2.carbonstudio.eclipse.ds.impl.EventTriggerImpl
		 * <em>Event Trigger</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.wso2.carbonstudio.eclipse.ds.impl.EventTriggerImpl
		 * @see org.wso2.carbonstudio.eclipse.ds.impl.DsPackageImpl#getEventTrigger()
		 * @generated
		 */
		EClass EVENT_TRIGGER = eINSTANCE.getEventTrigger();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute EVENT_TRIGGER__ID = eINSTANCE.getEventTrigger_Id();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute EVENT_TRIGGER__EXPRESSION = eINSTANCE.getEventTrigger_Expression();

		/**
		 * The meta object literal for the '<em><b>Target Topic</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute EVENT_TRIGGER__TARGET_TOPIC = eINSTANCE.getEventTrigger_TargetTopic();

		/**
		 * The meta object literal for the '<em><b>Subscriptions List</b></em>'
		 * containment reference feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference EVENT_TRIGGER__SUBSCRIPTIONS_LIST = eINSTANCE
				.getEventTrigger_SubscriptionsList();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute EVENT_TRIGGER__LANGUAGE = eINSTANCE.getEventTrigger_Language();

		/**
		 * The meta object literal for the '
		 * {@link org.wso2.carbonstudio.eclipse.ds.impl.ExcelQueryImpl
		 * <em>Excel Query</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.wso2.carbonstudio.eclipse.ds.impl.ExcelQueryImpl
		 * @see org.wso2.carbonstudio.eclipse.ds.impl.DsPackageImpl#getExcelQuery()
		 * @generated
		 */
		EClass EXCEL_QUERY = eINSTANCE.getExcelQuery();

		/**
		 * The meta object literal for the '<em><b>Workbook Name</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute EXCEL_QUERY__WORKBOOK_NAME = eINSTANCE.getExcelQuery_WorkbookName();

		/**
		 * The meta object literal for the '<em><b>Starting Row</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute EXCEL_QUERY__STARTING_ROW = eINSTANCE.getExcelQuery_StartingRow();

		/**
		 * The meta object literal for the '<em><b>Max Row Count</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute EXCEL_QUERY__MAX_ROW_COUNT = eINSTANCE.getExcelQuery_MaxRowCount();

		/**
		 * The meta object literal for the '<em><b>Has Header</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute EXCEL_QUERY__HAS_HEADER = eINSTANCE.getExcelQuery_HasHeader();

		/**
		 * The meta object literal for the '
		 * {@link org.wso2.carbonstudio.eclipse.ds.impl.GSpreadQueryImpl
		 * <em>GSpread Query</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.wso2.carbonstudio.eclipse.ds.impl.GSpreadQueryImpl
		 * @see org.wso2.carbonstudio.eclipse.ds.impl.DsPackageImpl#getGSpreadQuery()
		 * @generated
		 */
		EClass GSPREAD_QUERY = eINSTANCE.getGSpreadQuery();

		/**
		 * The meta object literal for the '<em><b>Worksheet Number</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute GSPREAD_QUERY__WORKSHEET_NUMBER = eINSTANCE.getGSpreadQuery_WorksheetNumber();

		/**
		 * The meta object literal for the '<em><b>Starting Row</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute GSPREAD_QUERY__STARTING_ROW = eINSTANCE.getGSpreadQuery_StartingRow();

		/**
		 * The meta object literal for the '<em><b>Max Row Count</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute GSPREAD_QUERY__MAX_ROW_COUNT = eINSTANCE.getGSpreadQuery_MaxRowCount();

		/**
		 * The meta object literal for the '<em><b>Has Header</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute GSPREAD_QUERY__HAS_HEADER = eINSTANCE.getGSpreadQuery_HasHeader();

		/**
		 * The meta object literal for the '
		 * {@link org.wso2.carbonstudio.eclipse.ds.impl.LengthValidatorImpl
		 * <em>Length Validator</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.wso2.carbonstudio.eclipse.ds.impl.LengthValidatorImpl
		 * @see org.wso2.carbonstudio.eclipse.ds.impl.DsPackageImpl#getLengthValidator()
		 * @generated
		 */
		EClass LENGTH_VALIDATOR = eINSTANCE.getLengthValidator();

		/**
		 * The meta object literal for the '<em><b>Min Value</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute LENGTH_VALIDATOR__MIN_VALUE = eINSTANCE.getLengthValidator_MinValue();

		/**
		 * The meta object literal for the '<em><b>Max Value</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute LENGTH_VALIDATOR__MAX_VALUE = eINSTANCE.getLengthValidator_MaxValue();

		/**
		 * The meta object literal for the '
		 * {@link org.wso2.carbonstudio.eclipse.ds.impl.LongRangeValidatorImpl
		 * <em>Long Range Validator</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.wso2.carbonstudio.eclipse.ds.impl.LongRangeValidatorImpl
		 * @see org.wso2.carbonstudio.eclipse.ds.impl.DsPackageImpl#getLongRangeValidator()
		 * @generated
		 */
		EClass LONG_RANGE_VALIDATOR = eINSTANCE.getLongRangeValidator();

		/**
		 * The meta object literal for the '<em><b>Min Value</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute LONG_RANGE_VALIDATOR__MIN_VALUE = eINSTANCE.getLongRangeValidator_MinValue();

		/**
		 * The meta object literal for the '<em><b>Max Value</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute LONG_RANGE_VALIDATOR__MAX_VALUE = eINSTANCE.getLongRangeValidator_MaxValue();

		/**
		 * The meta object literal for the '
		 * {@link org.wso2.carbonstudio.eclipse.ds.impl.OperationImpl
		 * <em>Operation</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see org.wso2.carbonstudio.eclipse.ds.impl.OperationImpl
		 * @see org.wso2.carbonstudio.eclipse.ds.impl.DsPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute OPERATION__NAME = eINSTANCE.getOperation_Name();

		/**
		 * The meta object literal for the '<em><b>Call Query</b></em>'
		 * containment reference feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference OPERATION__CALL_QUERY = eINSTANCE.getOperation_CallQuery();

		/**
		 * The meta object literal for the '<em><b>Call Query List</b></em>'
		 * containment reference feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference OPERATION__CALL_QUERY_LIST = eINSTANCE.getOperation_CallQueryList();

		/**
		 * The meta object literal for the '
		 * {@link org.wso2.carbonstudio.eclipse.ds.impl.ParameterMappingImpl
		 * <em>Parameter Mapping</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.wso2.carbonstudio.eclipse.ds.impl.ParameterMappingImpl
		 * @see org.wso2.carbonstudio.eclipse.ds.impl.DsPackageImpl#getParameterMapping()
		 * @generated
		 */
		EClass PARAMETER_MAPPING = eINSTANCE.getParameterMapping();

		/**
		 * The meta object literal for the '<em><b>Parameter Name</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute PARAMETER_MAPPING__PARAMETER_NAME = eINSTANCE
				.getParameterMapping_ParameterName();

		/**
		 * The meta object literal for the '<em><b>Column Name</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute PARAMETER_MAPPING__COLUMN_NAME = eINSTANCE.getParameterMapping_ColumnName();

		/**
		 * The meta object literal for the '<em><b>Query Param</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute PARAMETER_MAPPING__QUERY_PARAM = eINSTANCE.getParameterMapping_QueryParam();

		/**
		 * The meta object literal for the '
		 * {@link org.wso2.carbonstudio.eclipse.ds.impl.PatternValidatorImpl
		 * <em>Pattern Validator</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.wso2.carbonstudio.eclipse.ds.impl.PatternValidatorImpl
		 * @see org.wso2.carbonstudio.eclipse.ds.impl.DsPackageImpl#getPatternValidator()
		 * @generated
		 */
		EClass PATTERN_VALIDATOR = eINSTANCE.getPatternValidator();

		/**
		 * The meta object literal for the '<em><b>Pattern String</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute PATTERN_VALIDATOR__PATTERN_STRING = eINSTANCE
				.getPatternValidator_PatternString();

		/**
		 * The meta object literal for the '
		 * {@link org.wso2.carbonstudio.eclipse.ds.impl.QueryImpl
		 * <em>Query</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.wso2.carbonstudio.eclipse.ds.impl.QueryImpl
		 * @see org.wso2.carbonstudio.eclipse.ds.impl.DsPackageImpl#getQuery()
		 * @generated
		 */
		EClass QUERY = eINSTANCE.getQuery();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute QUERY__ID = eINSTANCE.getQuery_Id();

		/**
		 * The meta object literal for the '<em><b>Input Trigger Name</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute QUERY__INPUT_TRIGGER_NAME = eINSTANCE.getQuery_InputTriggerName();

		/**
		 * The meta object literal for the '<em><b>Output Trigger Name</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute QUERY__OUTPUT_TRIGGER_NAME = eINSTANCE.getQuery_OutputTriggerName();

		/**
		 * The meta object literal for the '<em><b>Data Source Id</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute QUERY__DATA_SOURCE_ID = eINSTANCE.getQuery_DataSourceId();

		/**
		 * The meta object literal for the '<em><b>Sql Statement</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute QUERY__SQL_STATEMENT = eINSTANCE.getQuery_SqlStatement();

		/**
		 * The meta object literal for the '<em><b>Properties List</b></em>'
		 * containment reference feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference QUERY__PROPERTIES_LIST = eINSTANCE.getQuery_PropertiesList();

		/**
		 * The meta object literal for the '<em><b>Result Mapping</b></em>'
		 * containment reference feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference QUERY__RESULT_MAPPING = eINSTANCE.getQuery_ResultMapping();

		/**
		 * The meta object literal for the '<em><b>Excel Queries</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference QUERY__EXCEL_QUERIES = eINSTANCE.getQuery_ExcelQueries();

		/**
		 * The meta object literal for the '<em><b>Gspread Queries</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference QUERY__GSPREAD_QUERIES = eINSTANCE.getQuery_GspreadQueries();

		/**
		 * The meta object literal for the '<em><b>Query Parameters</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference QUERY__QUERY_PARAMETERS = eINSTANCE.getQuery_QueryParameters();

		/**
		 * The meta object literal for the '<em><b>Return Row Id</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute QUERY__RETURN_ROW_ID = eINSTANCE.getQuery_ReturnRowId();

		/**
		 * The meta object literal for the '
		 * {@link org.wso2.carbonstudio.eclipse.ds.impl.QueryParameterImpl
		 * <em>Query Parameter</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.wso2.carbonstudio.eclipse.ds.impl.QueryParameterImpl
		 * @see org.wso2.carbonstudio.eclipse.ds.impl.DsPackageImpl#getQueryParameter()
		 * @generated
		 */
		EClass QUERY_PARAMETER = eINSTANCE.getQueryParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute QUERY_PARAMETER__NAME = eINSTANCE.getQueryParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute QUERY_PARAMETER__TYPE = eINSTANCE.getQueryParameter_Type();

		/**
		 * The meta object literal for the '<em><b>Sql Type</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute QUERY_PARAMETER__SQL_TYPE = eINSTANCE.getQueryParameter_SqlType();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute QUERY_PARAMETER__DEFAULT_VALUE = eINSTANCE.getQueryParameter_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Ordinal</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute QUERY_PARAMETER__ORDINAL = eINSTANCE.getQueryParameter_Ordinal();

		/**
		 * The meta object literal for the '<em><b>Param Type</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute QUERY_PARAMETER__PARAM_TYPE = eINSTANCE.getQueryParameter_ParamType();

		/**
		 * The meta object literal for the '<em><b>Long Range Validator</b></em>
		 * ' containment reference feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference QUERY_PARAMETER__LONG_RANGE_VALIDATOR = eINSTANCE
				.getQueryParameter_LongRangeValidator();

		/**
		 * The meta object literal for the '
		 * <em><b>Double Range Validator</b></em>' containment reference
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference QUERY_PARAMETER__DOUBLE_RANGE_VALIDATOR = eINSTANCE
				.getQueryParameter_DoubleRangeValidator();

		/**
		 * The meta object literal for the '<em><b>Length Validator</b></em>'
		 * containment reference feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference QUERY_PARAMETER__LENGTH_VALIDATOR = eINSTANCE
				.getQueryParameter_LengthValidator();

		/**
		 * The meta object literal for the '<em><b>Pattern Validators</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference QUERY_PARAMETER__PATTERN_VALIDATORS = eINSTANCE
				.getQueryParameter_PatternValidators();

		/**
		 * The meta object literal for the '<em><b>Custom Validators</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference QUERY_PARAMETER__CUSTOM_VALIDATORS = eINSTANCE
				.getQueryParameter_CustomValidators();

		/**
		 * The meta object literal for the '
		 * {@link org.wso2.carbonstudio.eclipse.ds.impl.QueryPropertyImpl
		 * <em>Query Property</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.wso2.carbonstudio.eclipse.ds.impl.QueryPropertyImpl
		 * @see org.wso2.carbonstudio.eclipse.ds.impl.DsPackageImpl#getQueryProperty()
		 * @generated
		 */
		EClass QUERY_PROPERTY = eINSTANCE.getQueryProperty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute QUERY_PROPERTY__NAME = eINSTANCE.getQueryProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute QUERY_PROPERTY__VALUE = eINSTANCE.getQueryProperty_Value();

		/**
		 * The meta object literal for the '
		 * {@link org.wso2.carbonstudio.eclipse.ds.impl.QueryPropertyListImpl
		 * <em>Query Property List</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.wso2.carbonstudio.eclipse.ds.impl.QueryPropertyListImpl
		 * @see org.wso2.carbonstudio.eclipse.ds.impl.DsPackageImpl#getQueryPropertyList()
		 * @generated
		 */
		EClass QUERY_PROPERTY_LIST = eINSTANCE.getQueryPropertyList();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference QUERY_PROPERTY_LIST__PROPERTIES = eINSTANCE.getQueryPropertyList_Properties();

		/**
		 * The meta object literal for the '
		 * {@link org.wso2.carbonstudio.eclipse.ds.impl.ResourceImpl
		 * <em>Resource</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see org.wso2.carbonstudio.eclipse.ds.impl.ResourceImpl
		 * @see org.wso2.carbonstudio.eclipse.ds.impl.DsPackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute RESOURCE__METHOD = eINSTANCE.getResource_Method();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute RESOURCE__PATH = eINSTANCE.getResource_Path();

		/**
		 * The meta object literal for the '<em><b>Call Query</b></em>'
		 * containment reference feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference RESOURCE__CALL_QUERY = eINSTANCE.getResource_CallQuery();

		/**
		 * The meta object literal for the '<em><b>Call Query List</b></em>'
		 * containment reference feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference RESOURCE__CALL_QUERY_LIST = eINSTANCE.getResource_CallQueryList();

		/**
		 * The meta object literal for the '
		 * {@link org.wso2.carbonstudio.eclipse.ds.impl.ResultMappingImpl
		 * <em>Result Mapping</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.wso2.carbonstudio.eclipse.ds.impl.ResultMappingImpl
		 * @see org.wso2.carbonstudio.eclipse.ds.impl.DsPackageImpl#getResultMapping()
		 * @generated
		 */
		EClass RESULT_MAPPING = eINSTANCE.getResultMapping();

		/**
		 * The meta object literal for the '<em><b>Element Name</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute RESULT_MAPPING__ELEMENT_NAME = eINSTANCE.getResultMapping_ElementName();

		/**
		 * The meta object literal for the '<em><b>Row Name</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute RESULT_MAPPING__ROW_NAME = eINSTANCE.getResultMapping_RowName();

		/**
		 * The meta object literal for the '<em><b>Default Namespace</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute RESULT_MAPPING__DEFAULT_NAMESPACE = eINSTANCE
				.getResultMapping_DefaultNamespace();

		/**
		 * The meta object literal for the '<em><b>Xslt Path</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute RESULT_MAPPING__XSLT_PATH = eINSTANCE.getResultMapping_XsltPath();

		/**
		 * The meta object literal for the '<em><b>Output Type</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute RESULT_MAPPING__OUTPUT_TYPE = eINSTANCE.getResultMapping_OutputType();

		/**
		 * The meta object literal for the '<em><b>Element Mappings</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference RESULT_MAPPING__ELEMENT_MAPPINGS = eINSTANCE.getResultMapping_ElementMappings();

		/**
		 * The meta object literal for the '<em><b>Attribute Mappings</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference RESULT_MAPPING__ATTRIBUTE_MAPPINGS = eINSTANCE
				.getResultMapping_AttributeMappings();

		/**
		 * The meta object literal for the '<em><b>Call Queries</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference RESULT_MAPPING__CALL_QUERIES = eINSTANCE.getResultMapping_CallQueries();

		/**
		 * The meta object literal for the '
		 * {@link org.wso2.carbonstudio.eclipse.ds.ServiceStatus
		 * <em>Service Status</em>}' enum. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.wso2.carbonstudio.eclipse.ds.ServiceStatus
		 * @see org.wso2.carbonstudio.eclipse.ds.impl.DsPackageImpl#getServiceStatus()
		 * @generated
		 */
		EEnum SERVICE_STATUS = eINSTANCE.getServiceStatus();

		/**
		 * The meta object literal for the '<em>Service Status Object</em>' data
		 * type. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.wso2.carbonstudio.eclipse.ds.ServiceStatus
		 * @see org.wso2.carbonstudio.eclipse.ds.impl.DsPackageImpl#getServiceStatusObject()
		 * @generated
		 */
		EDataType SERVICE_STATUS_OBJECT = eINSTANCE.getServiceStatusObject();

	}

} // DsPackage
