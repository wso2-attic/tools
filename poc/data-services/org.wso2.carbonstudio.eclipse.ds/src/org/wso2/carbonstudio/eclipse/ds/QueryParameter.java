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
 * <em><b>Query Parameter</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.wso2.carbonstudio.eclipse.ds.QueryParameter#getName <em>Name
 * </em>}</li>
 * <li>{@link org.wso2.carbonstudio.eclipse.ds.QueryParameter#getType <em>Type
 * </em>}</li>
 * <li>{@link org.wso2.carbonstudio.eclipse.ds.QueryParameter#getSqlType <em>Sql
 * Type</em>}</li>
 * <li>{@link org.wso2.carbonstudio.eclipse.ds.QueryParameter#getDefaultValue
 * <em>Default Value</em>}</li>
 * <li>{@link org.wso2.carbonstudio.eclipse.ds.QueryParameter#getOrdinal <em>
 * Ordinal</em>}</li>
 * <li>{@link org.wso2.carbonstudio.eclipse.ds.QueryParameter#getParamType <em>
 * Param Type</em>}</li>
 * <li>
 * {@link org.wso2.carbonstudio.eclipse.ds.QueryParameter#getLongRangeValidator
 * <em>Long Range Validator</em>}</li>
 * <li>
 * {@link org.wso2.carbonstudio.eclipse.ds.QueryParameter#getDoubleRangeValidator
 * <em>Double Range Validator</em>}</li>
 * <li>
 * {@link org.wso2.carbonstudio.eclipse.ds.QueryParameter#getLengthValidator
 * <em>Length Validator</em>}</li>
 * <li>
 * {@link org.wso2.carbonstudio.eclipse.ds.QueryParameter#getPatternValidators
 * <em>Pattern Validators</em>}</li>
 * <li>
 * {@link org.wso2.carbonstudio.eclipse.ds.QueryParameter#getCustomValidators
 * <em>Custom Validators</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getQueryParameter()
 * @model extendedMetaData="name='param_._type' kind='elementOnly'"
 * @generated
 */
public interface QueryParameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getQueryParameter_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData
	 *        ="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '
	 * {@link org.wso2.carbonstudio.eclipse.ds.QueryParameter#getName
	 * <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getQueryParameter_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" extendedMetaData=
	 *        "kind='attribute' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '
	 * {@link org.wso2.carbonstudio.eclipse.ds.QueryParameter#getType
	 * <em>Type</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Sql Type</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sql Type</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Sql Type</em>' attribute.
	 * @see #setSqlType(String)
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getQueryParameter_SqlType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData
	 *        ="kind='attribute' name='sqlType' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSqlType();

	/**
	 * Sets the value of the '
	 * {@link org.wso2.carbonstudio.eclipse.ds.QueryParameter#getSqlType
	 * <em>Sql Type</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Sql Type</em>' attribute.
	 * @see #getSqlType()
	 * @generated
	 */
	void setSqlType(String value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #setDefaultValue(String)
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getQueryParameter_DefaultValue()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" extendedMetaData=
	 *        "kind='attribute' name='defaultValue' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDefaultValue();

	/**
	 * Sets the value of the '
	 * {@link org.wso2.carbonstudio.eclipse.ds.QueryParameter#getDefaultValue
	 * <em>Default Value</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Default Value</em>' attribute.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(String value);

	/**
	 * Returns the value of the '<em><b>Ordinal</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ordinal</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Ordinal</em>' attribute.
	 * @see #isSetOrdinal()
	 * @see #unsetOrdinal()
	 * @see #setOrdinal(long)
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getQueryParameter_Ordinal()
	 * @model unsettable="true"
	 *        dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData
	 *        ="kind='attribute' name='ordinal' namespace='##targetNamespace'"
	 * @generated
	 */
	long getOrdinal();

	/**
	 * Sets the value of the '
	 * {@link org.wso2.carbonstudio.eclipse.ds.QueryParameter#getOrdinal
	 * <em>Ordinal</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Ordinal</em>' attribute.
	 * @see #isSetOrdinal()
	 * @see #unsetOrdinal()
	 * @see #getOrdinal()
	 * @generated
	 */
	void setOrdinal(long value);

	/**
	 * Unsets the value of the '
	 * {@link org.wso2.carbonstudio.eclipse.ds.QueryParameter#getOrdinal
	 * <em>Ordinal</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #isSetOrdinal()
	 * @see #getOrdinal()
	 * @see #setOrdinal(long)
	 * @generated
	 */
	void unsetOrdinal();

	/**
	 * Returns whether the value of the '
	 * {@link org.wso2.carbonstudio.eclipse.ds.QueryParameter#getOrdinal
	 * <em>Ordinal</em>}' attribute is set. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return whether the value of the '<em>Ordinal</em>' attribute is set.
	 * @see #unsetOrdinal()
	 * @see #getOrdinal()
	 * @see #setOrdinal(long)
	 * @generated
	 */
	boolean isSetOrdinal();

	/**
	 * Returns the value of the '<em><b>Param Type</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Param Type</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Param Type</em>' attribute.
	 * @see #setParamType(String)
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getQueryParameter_ParamType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" extendedMetaData=
	 *        "kind='attribute' name='paramType' namespace='##targetNamespace'"
	 * @generated
	 */
	String getParamType();

	/**
	 * Sets the value of the '
	 * {@link org.wso2.carbonstudio.eclipse.ds.QueryParameter#getParamType
	 * <em>Param Type</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Param Type</em>' attribute.
	 * @see #getParamType()
	 * @generated
	 */
	void setParamType(String value);

	/**
	 * Returns the value of the '<em><b>Long Range Validator</b></em>'
	 * containment reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Long Range Validator</em>' containment
	 * reference isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Long Range Validator</em>' containment
	 *         reference.
	 * @see #setLongRangeValidator(LongRangeValidator)
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getQueryParameter_LongRangeValidator()
	 * @model containment="true" extendedMetaData=
	 *        "kind='element' name='validateLongRange' namespace='##targetNamespace'"
	 * @generated
	 */
	LongRangeValidator getLongRangeValidator();

	/**
	 * Sets the value of the '
	 * {@link org.wso2.carbonstudio.eclipse.ds.QueryParameter#getLongRangeValidator
	 * <em>Long Range Validator</em>}' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Long Range Validator</em>'
	 *            containment reference.
	 * @see #getLongRangeValidator()
	 * @generated
	 */
	void setLongRangeValidator(LongRangeValidator value);

	/**
	 * Returns the value of the '<em><b>Double Range Validator</b></em>'
	 * containment reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Double Range Validator</em>' containment
	 * reference isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Double Range Validator</em>' containment
	 *         reference.
	 * @see #setDoubleRangeValidator(DoubleRangeValidator)
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getQueryParameter_DoubleRangeValidator()
	 * @model containment="true" extendedMetaData=
	 *        "kind='element' name='validateDoubleRange' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleRangeValidator getDoubleRangeValidator();

	/**
	 * Sets the value of the '
	 * {@link org.wso2.carbonstudio.eclipse.ds.QueryParameter#getDoubleRangeValidator
	 * <em>Double Range Validator</em>}' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Double Range Validator</em>'
	 *            containment reference.
	 * @see #getDoubleRangeValidator()
	 * @generated
	 */
	void setDoubleRangeValidator(DoubleRangeValidator value);

	/**
	 * Returns the value of the '<em><b>Length Validator</b></em>' containment
	 * reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length Validator</em>' containment reference
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Length Validator</em>' containment
	 *         reference.
	 * @see #setLengthValidator(LengthValidator)
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getQueryParameter_LengthValidator()
	 * @model containment="true" extendedMetaData=
	 *        "kind='element' name='validateLength' namespace='##targetNamespace'"
	 * @generated
	 */
	LengthValidator getLengthValidator();

	/**
	 * Sets the value of the '
	 * {@link org.wso2.carbonstudio.eclipse.ds.QueryParameter#getLengthValidator
	 * <em>Length Validator</em>}' containment reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Length Validator</em>' containment
	 *            reference.
	 * @see #getLengthValidator()
	 * @generated
	 */
	void setLengthValidator(LengthValidator value);

	/**
	 * Returns the value of the '<em><b>Pattern Validators</b></em>' containment
	 * reference list. The list contents are of type
	 * {@link org.wso2.carbonstudio.eclipse.ds.PatternValidator}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern Validators</em>' containment reference
	 * list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Pattern Validators</em>' containment
	 *         reference list.
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getQueryParameter_PatternValidators()
	 * @model containment="true" extendedMetaData=
	 *        "kind='element' name='validatePattern' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PatternValidator> getPatternValidators();

	/**
	 * Returns the value of the '<em><b>Custom Validators</b></em>' containment
	 * reference list. The list contents are of type
	 * {@link org.wso2.carbonstudio.eclipse.ds.CustomValidator}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Validators</em>' containment reference
	 * list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Custom Validators</em>' containment
	 *         reference list.
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getQueryParameter_CustomValidators()
	 * @model containment="true" extendedMetaData=
	 *        "kind='element' name='validateCustom' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CustomValidator> getCustomValidators();

} // QueryParameter
