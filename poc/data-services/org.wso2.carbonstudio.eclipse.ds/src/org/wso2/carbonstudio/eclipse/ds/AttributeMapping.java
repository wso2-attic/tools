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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Attribute Mapping</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link org.wso2.carbonstudio.eclipse.ds.AttributeMapping#getAttributeName
 * <em>Attribute Name</em>}</li>
 * <li>{@link org.wso2.carbonstudio.eclipse.ds.AttributeMapping#getColumnName
 * <em>Column Name</em>}</li>
 * <li>{@link org.wso2.carbonstudio.eclipse.ds.AttributeMapping#getQueryParam
 * <em>Query Param</em>}</li>
 * <li>
 * {@link org.wso2.carbonstudio.eclipse.ds.AttributeMapping#getRequiredRoles
 * <em>Required Roles</em>}</li>
 * <li>{@link org.wso2.carbonstudio.eclipse.ds.AttributeMapping#getXsdType <em>
 * Xsd Type</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getAttributeMapping()
 * @model extendedMetaData="name='attribute_._type' kind='empty'"
 * @generated
 */
public interface AttributeMapping extends EObject {
	/**
	 * Returns the value of the '<em><b>Attribute Name</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Attribute Name</em>' attribute.
	 * @see #setAttributeName(String)
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getAttributeMapping_AttributeName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData
	 *        ="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAttributeName();

	/**
	 * Sets the value of the '
	 * {@link org.wso2.carbonstudio.eclipse.ds.AttributeMapping#getAttributeName
	 * <em>Attribute Name</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Attribute Name</em>' attribute.
	 * @see #getAttributeName()
	 * @generated
	 */
	void setAttributeName(String value);

	/**
	 * Returns the value of the '<em><b>Column Name</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Name</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Column Name</em>' attribute.
	 * @see #setColumnName(String)
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getAttributeMapping_ColumnName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" extendedMetaData=
	 *        "kind='attribute' name='column' namespace='##targetNamespace'"
	 * @generated
	 */
	String getColumnName();

	/**
	 * Sets the value of the '
	 * {@link org.wso2.carbonstudio.eclipse.ds.AttributeMapping#getColumnName
	 * <em>Column Name</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Column Name</em>' attribute.
	 * @see #getColumnName()
	 * @generated
	 */
	void setColumnName(String value);

	/**
	 * Returns the value of the '<em><b>Query Param</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query Param</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Query Param</em>' attribute.
	 * @see #setQueryParam(String)
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getAttributeMapping_QueryParam()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" extendedMetaData=
	 *        "kind='attribute' name='query-param' namespace='##targetNamespace'"
	 * @generated
	 */
	String getQueryParam();

	/**
	 * Sets the value of the '
	 * {@link org.wso2.carbonstudio.eclipse.ds.AttributeMapping#getQueryParam
	 * <em>Query Param</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Query Param</em>' attribute.
	 * @see #getQueryParam()
	 * @generated
	 */
	void setQueryParam(String value);

	/**
	 * Returns the value of the '<em><b>Required Roles</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Roles</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Required Roles</em>' attribute.
	 * @see #setRequiredRoles(String)
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getAttributeMapping_RequiredRoles()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" extendedMetaData=
	 *        "kind='attribute' name='requiredRoles' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRequiredRoles();

	/**
	 * Sets the value of the '
	 * {@link org.wso2.carbonstudio.eclipse.ds.AttributeMapping#getRequiredRoles
	 * <em>Required Roles</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Required Roles</em>' attribute.
	 * @see #getRequiredRoles()
	 * @generated
	 */
	void setRequiredRoles(String value);

	/**
	 * Returns the value of the '<em><b>Xsd Type</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xsd Type</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Xsd Type</em>' attribute.
	 * @see #setXsdType(String)
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getAttributeMapping_XsdType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" extendedMetaData=
	 *        "kind='attribute' name='xsdType' namespace='##targetNamespace'"
	 * @generated
	 */
	String getXsdType();

	/**
	 * Sets the value of the '
	 * {@link org.wso2.carbonstudio.eclipse.ds.AttributeMapping#getXsdType
	 * <em>Xsd Type</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Xsd Type</em>' attribute.
	 * @see #getXsdType()
	 * @generated
	 */
	void setXsdType(String value);

} // AttributeMapping
