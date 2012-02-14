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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Query</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.wso2.carbonstudio.eclipse.ds.Query#getId <em>Id</em>}</li>
 * <li>{@link org.wso2.carbonstudio.eclipse.ds.Query#getInputTriggerName <em>
 * Input Trigger Name</em>}</li>
 * <li>{@link org.wso2.carbonstudio.eclipse.ds.Query#getOutputTriggerName <em>
 * Output Trigger Name</em>}</li>
 * <li>{@link org.wso2.carbonstudio.eclipse.ds.Query#getDataSourceId <em>Data
 * Source Id</em>}</li>
 * <li>{@link org.wso2.carbonstudio.eclipse.ds.Query#getSqlStatement <em>Sql
 * Statement</em>}</li>
 * <li>{@link org.wso2.carbonstudio.eclipse.ds.Query#getPropertiesList <em>
 * Properties List</em>}</li>
 * <li>{@link org.wso2.carbonstudio.eclipse.ds.Query#getResultMapping <em>Result
 * Mapping</em>}</li>
 * <li>{@link org.wso2.carbonstudio.eclipse.ds.Query#getExcelQueries <em>Excel
 * Queries</em>}</li>
 * <li>{@link org.wso2.carbonstudio.eclipse.ds.Query#getGspreadQueries <em>
 * Gspread Queries</em>}</li>
 * <li>{@link org.wso2.carbonstudio.eclipse.ds.Query#getQueryParameters <em>
 * Query Parameters</em>}</li>
 * <li>{@link org.wso2.carbonstudio.eclipse.ds.Query#isReturnRowId <em>Return
 * Row Id</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getQuery()
 * @model extendedMetaData="name='query_._type' kind='elementOnly'"
 * @generated
 */
public interface Query extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getQuery_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData
	 *        ="kind='attribute' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '
	 * {@link org.wso2.carbonstudio.eclipse.ds.Query#getId <em>Id</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Input Trigger Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Trigger Name</em>' attribute isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Input Trigger Name</em>' attribute.
	 * @see #setInputTriggerName(String)
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getQuery_InputTriggerName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" extendedMetaData=
	 *        "kind='attribute' name='input-event-trigger' namespace='##targetNamespace'"
	 * @generated
	 */
	String getInputTriggerName();

	/**
	 * Sets the value of the '
	 * {@link org.wso2.carbonstudio.eclipse.ds.Query#getInputTriggerName
	 * <em>Input Trigger Name</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Input Trigger Name</em>' attribute.
	 * @see #getInputTriggerName()
	 * @generated
	 */
	void setInputTriggerName(String value);

	/**
	 * Returns the value of the '<em><b>Output Trigger Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Trigger Name</em>' attribute isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Output Trigger Name</em>' attribute.
	 * @see #setOutputTriggerName(String)
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getQuery_OutputTriggerName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" extendedMetaData=
	 *        "kind='attribute' name='output-event-trigger' namespace='##targetNamespace'"
	 * @generated
	 */
	String getOutputTriggerName();

	/**
	 * Sets the value of the '
	 * {@link org.wso2.carbonstudio.eclipse.ds.Query#getOutputTriggerName
	 * <em>Output Trigger Name</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Output Trigger Name</em>' attribute.
	 * @see #getOutputTriggerName()
	 * @generated
	 */
	void setOutputTriggerName(String value);

	/**
	 * Returns the value of the '<em><b>Data Source Id</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Source Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Data Source Id</em>' attribute.
	 * @see #setDataSourceId(String)
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getQuery_DataSourceId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" extendedMetaData=
	 *        "kind='attribute' name='useConfig' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDataSourceId();

	/**
	 * Sets the value of the '
	 * {@link org.wso2.carbonstudio.eclipse.ds.Query#getDataSourceId
	 * <em>Data Source Id</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Data Source Id</em>' attribute.
	 * @see #getDataSourceId()
	 * @generated
	 */
	void setDataSourceId(String value);

	/**
	 * Returns the value of the '<em><b>Sql Statement</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sql Statement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Sql Statement</em>' attribute.
	 * @see #setSqlStatement(String)
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getQuery_SqlStatement()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData
	 *        ="kind='element' name='sql' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSqlStatement();

	/**
	 * Sets the value of the '
	 * {@link org.wso2.carbonstudio.eclipse.ds.Query#getSqlStatement
	 * <em>Sql Statement</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Sql Statement</em>' attribute.
	 * @see #getSqlStatement()
	 * @generated
	 */
	void setSqlStatement(String value);

	/**
	 * Returns the value of the '<em><b>Properties List</b></em>' containment
	 * reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties List</em>' containment reference
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Properties List</em>' containment
	 *         reference.
	 * @see #setPropertiesList(QueryPropertyList)
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getQuery_PropertiesList()
	 * @model containment="true" extendedMetaData=
	 *        "kind='element' name='properties' namespace='##targetNamespace'"
	 * @generated
	 */
	QueryPropertyList getPropertiesList();

	/**
	 * Sets the value of the '
	 * {@link org.wso2.carbonstudio.eclipse.ds.Query#getPropertiesList
	 * <em>Properties List</em>}' containment reference. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Properties List</em>' containment
	 *            reference.
	 * @see #getPropertiesList()
	 * @generated
	 */
	void setPropertiesList(QueryPropertyList value);

	/**
	 * Returns the value of the '<em><b>Result Mapping</b></em>' containment
	 * reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result Mapping</em>' containment reference
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Result Mapping</em>' containment reference.
	 * @see #setResultMapping(ResultMapping)
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getQuery_ResultMapping()
	 * @model containment="true" extendedMetaData=
	 *        "kind='element' name='result' namespace='##targetNamespace'"
	 * @generated
	 */
	ResultMapping getResultMapping();

	/**
	 * Sets the value of the '
	 * {@link org.wso2.carbonstudio.eclipse.ds.Query#getResultMapping
	 * <em>Result Mapping</em>}' containment reference. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Result Mapping</em>' containment
	 *            reference.
	 * @see #getResultMapping()
	 * @generated
	 */
	void setResultMapping(ResultMapping value);

	/**
	 * Returns the value of the '<em><b>Excel Queries</b></em>' containment
	 * reference list. The list contents are of type
	 * {@link org.wso2.carbonstudio.eclipse.ds.ExcelQuery}. <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Excel Queries</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Excel Queries</em>' containment reference
	 *         list.
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getQuery_ExcelQueries()
	 * @model containment="true" extendedMetaData=
	 *        "kind='element' name='excel' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ExcelQuery> getExcelQueries();

	/**
	 * Returns the value of the '<em><b>Gspread Queries</b></em>' containment
	 * reference list. The list contents are of type
	 * {@link org.wso2.carbonstudio.eclipse.ds.GSpreadQuery}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gspread Queries</em>' containment reference
	 * list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Gspread Queries</em>' containment reference
	 *         list.
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getQuery_GspreadQueries()
	 * @model containment="true" extendedMetaData=
	 *        "kind='element' name='gspread' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<GSpreadQuery> getGspreadQueries();

	/**
	 * Returns the value of the '<em><b>Query Parameters</b></em>' containment
	 * reference list. The list contents are of type
	 * {@link org.wso2.carbonstudio.eclipse.ds.QueryParameter}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query Parameters</em>' containment reference
	 * list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Query Parameters</em>' containment
	 *         reference list.
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getQuery_QueryParameters()
	 * @model containment="true" extendedMetaData=
	 *        "kind='element' name='param' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<QueryParameter> getQueryParameters();

	/**
	 * Returns the value of the '<em><b>Return Row Id</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Row Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Return Row Id</em>' attribute.
	 * @see #setReturnRowId(boolean)
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getQuery_ReturnRowId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isReturnRowId();

	/**
	 * Sets the value of the '
	 * {@link org.wso2.carbonstudio.eclipse.ds.Query#isReturnRowId
	 * <em>Return Row Id</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Return Row Id</em>' attribute.
	 * @see #isReturnRowId()
	 * @generated
	 */
	void setReturnRowId(boolean value);

} // Query
