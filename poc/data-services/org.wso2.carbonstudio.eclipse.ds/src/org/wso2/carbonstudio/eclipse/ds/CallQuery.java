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
 * <em><b>Call Query</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.wso2.carbonstudio.eclipse.ds.CallQuery#getHref <em>Href</em>}</li>
 * <li>{@link org.wso2.carbonstudio.eclipse.ds.CallQuery#getParameterMappings
 * <em>Parameter Mappings</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getCallQuery()
 * @model extendedMetaData="name='call-query_._type' kind='elementOnly'"
 * @generated
 */
public interface CallQuery extends EObject {
	/**
	 * Returns the value of the '<em><b>Href</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Href</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Href</em>' attribute.
	 * @see #setHref(String)
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getCallQuery_Href()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData
	 *        ="kind='attribute' name='href' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHref();

	/**
	 * Sets the value of the '
	 * {@link org.wso2.carbonstudio.eclipse.ds.CallQuery#getHref <em>Href</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Href</em>' attribute.
	 * @see #getHref()
	 * @generated
	 */
	void setHref(String value);

	/**
	 * Returns the value of the '<em><b>Parameter Mappings</b></em>' containment
	 * reference list. The list contents are of type
	 * {@link org.wso2.carbonstudio.eclipse.ds.ParameterMapping}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Mappings</em>' containment reference
	 * list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Parameter Mappings</em>' containment
	 *         reference list.
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getCallQuery_ParameterMappings()
	 * @model containment="true" extendedMetaData=
	 *        "kind='element' name='with-param' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ParameterMapping> getParameterMappings();

} // CallQuery
