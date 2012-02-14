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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a
 * create method for each non-abstract class of the model. <!-- end-user-doc -->
 * 
 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage
 * @generated
 */
public interface DsFactory extends EFactory {
	/**
	 * The singleton instance of the factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	DsFactory eINSTANCE = org.wso2.carbonstudio.eclipse.ds.impl.DsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Attribute Mapping</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Attribute Mapping</em>'.
	 * @generated
	 */
	AttributeMapping createAttributeMapping();

	/**
	 * Returns a new object of class '<em>Call Query</em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Call Query</em>'.
	 * @generated
	 */
	CallQuery createCallQuery();

	/**
	 * Returns a new object of class '<em>Call Query List</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Call Query List</em>'.
	 * @generated
	 */
	CallQueryList createCallQueryList();

	/**
	 * Returns a new object of class '<em>Configuration Property</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Configuration Property</em>'.
	 * @generated
	 */
	ConfigurationProperty createConfigurationProperty();

	/**
	 * Returns a new object of class '<em>Custom Validator</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Custom Validator</em>'.
	 * @generated
	 */
	CustomValidator createCustomValidator();

	/**
	 * Returns a new object of class '<em>Data Service</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Data Service</em>'.
	 * @generated
	 */
	DataService createDataService();

	/**
	 * Returns a new object of class '<em>Data Source Configuration</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Data Source Configuration</em>'.
	 * @generated
	 */
	DataSourceConfiguration createDataSourceConfiguration();

	/**
	 * Returns a new object of class '<em>Document Root</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Double Range Validator</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Double Range Validator</em>'.
	 * @generated
	 */
	DoubleRangeValidator createDoubleRangeValidator();

	/**
	 * Returns a new object of class '<em>Element Mapping</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Element Mapping</em>'.
	 * @generated
	 */
	ElementMapping createElementMapping();

	/**
	 * Returns a new object of class '<em>Event Subscription List</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Event Subscription List</em>'.
	 * @generated
	 */
	EventSubscriptionList createEventSubscriptionList();

	/**
	 * Returns a new object of class '<em>Event Trigger</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Event Trigger</em>'.
	 * @generated
	 */
	EventTrigger createEventTrigger();

	/**
	 * Returns a new object of class '<em>Excel Query</em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Excel Query</em>'.
	 * @generated
	 */
	ExcelQuery createExcelQuery();

	/**
	 * Returns a new object of class '<em>GSpread Query</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>GSpread Query</em>'.
	 * @generated
	 */
	GSpreadQuery createGSpreadQuery();

	/**
	 * Returns a new object of class '<em>Length Validator</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Length Validator</em>'.
	 * @generated
	 */
	LengthValidator createLengthValidator();

	/**
	 * Returns a new object of class '<em>Long Range Validator</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Long Range Validator</em>'.
	 * @generated
	 */
	LongRangeValidator createLongRangeValidator();

	/**
	 * Returns a new object of class '<em>Operation</em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Operation</em>'.
	 * @generated
	 */
	Operation createOperation();

	/**
	 * Returns a new object of class '<em>Parameter Mapping</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Parameter Mapping</em>'.
	 * @generated
	 */
	ParameterMapping createParameterMapping();

	/**
	 * Returns a new object of class '<em>Pattern Validator</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Pattern Validator</em>'.
	 * @generated
	 */
	PatternValidator createPatternValidator();

	/**
	 * Returns a new object of class '<em>Query</em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Query</em>'.
	 * @generated
	 */
	Query createQuery();

	/**
	 * Returns a new object of class '<em>Query Parameter</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Query Parameter</em>'.
	 * @generated
	 */
	QueryParameter createQueryParameter();

	/**
	 * Returns a new object of class '<em>Query Property</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Query Property</em>'.
	 * @generated
	 */
	QueryProperty createQueryProperty();

	/**
	 * Returns a new object of class '<em>Query Property List</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Query Property List</em>'.
	 * @generated
	 */
	QueryPropertyList createQueryPropertyList();

	/**
	 * Returns a new object of class '<em>Resource</em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Resource</em>'.
	 * @generated
	 */
	Resource createResource();

	/**
	 * Returns a new object of class '<em>Result Mapping</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Result Mapping</em>'.
	 * @generated
	 */
	ResultMapping createResultMapping();

	/**
	 * Returns the package supported by this factory. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the package supported by this factory.
	 * @generated
	 */
	DsPackage getDsPackage();

} // DsFactory
